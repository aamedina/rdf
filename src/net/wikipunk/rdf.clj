(ns net.wikipunk.rdf
  "The Universal Translator

  This namespace provides a set of protocols and functions for working
  with RDF data. This is done by using Apache Jena and Aristotle to
  parse and manipulate RDF data found on the Semantic Web and
  organizing the terms into multimethod hierarchies."
  (:require
   [arachne.aristotle.registry :as reg]
   [arachne.aristotle.graph :as g]
   [clojure.tools.logging :as log]
   [clojure.core.memoize :as memo]
   [clojure.core.protocols :refer [coll-reduce]]
   [clojure.core.reducers :as r :refer [fold]]
   [clojure.datafy :refer [datafy]]
   [clojure.java.io :as io]
   [clojure.set :as set]
   [clojure.string :as str]
   [clojure.walk :as walk]   
   [com.stuartsierra.component :as com]
   [net.wikipunk.boot :as boot]
   [net.wikipunk.mop :as mop]
   [net.wikipunk.rdf.rdf]
   [net.wikipunk.rdf.rdfs]
   [net.wikipunk.rdf.owl]
   [net.wikipunk.rdf.xsd]
   [zprint.core :as zprint])
  (:import
   (org.apache.jena.datatypes BaseDatatype$TypedValue)
   (org.apache.jena.datatypes.xsd XSDDatatype XSDDateTime)
   (org.apache.jena.graph Graph Node Triple Node_URI Node_Literal Node_Variable Node_Blank)
   (org.apache.jena.riot RDFParser Lang)
   (org.apache.jena.rdf.model Model)
   (org.apache.jena.query ResultSet)
   (org.apache.jena.util.iterator ClosableIterator)
   (org.apache.jena.shared PrefixMapping)))

(defprotocol LinkedData
  (sniff [x] "Follow your nose."))

(defprotocol Parsable
  (parse [x]
    "Parses source using Apache Jena's RDFParser and converts it to
  Clojure data using Aristotle.

  Adapted from arachne.aristotle.graph/graph->clj"))

(defprotocol NamespaceSpitter
  (emit [x arg-map]))

(def ^:dynamic *classes*
  "rdfs:Class|owl:Class|rdfs:Datatype"
  (make-hierarchy))

(def ^:dynamic *properties*
  "rdf:Property"
  (make-hierarchy))

(def ^:dynamic *metaobjects*
  "A Clojure multimethod hierarchy combining rdf/*classes*,
  rdf/*properties*, and instances of :owl/NamedIndividual."
  (make-hierarchy))

(def ^:dynamic *indexes*
  "A map of useful indexes across metaobjects."
  {})

(def ^:dynamic *ns-aliases*
  "Configured by `make-boot-context` holding a map of namespace
  aliases."
  {})

(def ^:dynamic *env*
  "An environment to resolve metaobject idents. Could be nil (search
  namespaces) or a datomic database."
  nil)

(def ^:dynamic *ns-prefix* "net.wikipunk.rdf.")
(def ^:dynamic *target* "src/net/wikipunk/rdf/")

#rdf/global-prefix ["dcterms" "http://purl.org/dc/terms/"]

(defn unmunge
  "function which converts the given ident to a symbol"
  [ident]
  (cond
    (= (name ident) "Class")
    'T
    
    (get clojure.lang.RT/DEFAULT_IMPORTS (symbol (name ident)))
    (symbol (str (name ident) "Class"))

    (= (name ident) "nil")
    'null

    :else
    (-> (name ident)
        (symbol))))

(defn make-boot-context
  "a function which configures an Aristotle registry for bootstrapping
  RDF data."
  []
  (let [ns-prefixes (->> (all-ns)
                         (filter #(= (:rdf/type (meta %)) :jsonld/Context))
                         (map #(str/replace % #"boot$" "rdf")))]
    (transduce
      (comp
        (filter #(= (:rdf/type (meta %)) :jsonld/Context))
        (map ns-publics)
        (mapcat vals)
        (map deref)
        (map (juxt :rdfa/prefix :rdfa/uri)))
      (completing
        (fn [m [prefix uri]]
          (-> m
              (update :registry
                      (fn [reg]
                        (try
                          (reg/add-prefix reg true prefix uri)
                          (catch Throwable ex
                            reg))))
              (update :ns-aliases
                      (fn [ns-aliases]
                        (assoc ns-aliases
                               prefix
                               (some #(when-some [ns (find-ns (symbol (str % "." prefix)))]
                                        ns)
                                     ns-prefixes)))))))
      {:registry   (reg/add-prefix {:prefixes  {}
                                    :prefixes' {}
                                    :aliases   {}
                                    :aliases'  {}}
                                   true
                                   "dcterms"
                                   "http://purl.org/dc/terms/")
       :ns-aliases {}}
      (all-ns))))

(defn deriving
  "a function which derives ident from each of its parents in the
  given hierarchy."
  [h {:db/keys [ident]} xs]
  (reduce (fn [h parent]
            (try
              (derive h ident parent)
              (catch Throwable ex
                h)))
          h xs))

(def +props+
  "A set of keys used in various internal functions to unroll single
  values into collections for set logic (usually)."
  #{:rdf/type
    :rdfs/subClassOf
    :rdfs/subPropertyOf
    :owl/equivalentClass
    :owl/equivalentProperty
    :owl/sameAs})

(defn all-ns-metaobjects
  "Searches Clojure namespaces for metaobjects.

  It filters out all namespaces that don't have an :rdf/type metadata
  key and retrieves all public symbols from each namespace. It then
  filters out symbols that don't have any properties from the
  `net.wikipunk.rdf/+props+` set, as well as symbols that don't have a
  qualified keyword :db/ident.

  The remaining symbols are then processed in parallel using pmap. For
  each symbol, it extracts its properties and reduces them into an
  entity map."
  []
  (->> (all-ns)
       (filter (comp :rdf/type meta))
       (map ns-publics)
       (mapcat vals)
       (filter #(some +props+ (keys @%)))
       (filter (comp qualified-keyword? :db/ident deref))
       (pmap (fn [v]
               (reduce (fn [entity term]
                         (if (contains? entity term)
                           (update entity term #(cond (vector? %) % (nil? %) [] :else [%]))
                           entity))
                       @v +props+)))))

(defn make-class-hierarchy
  "The make-class-hierarchy function creates a hierarchy of classes
  based on the :rdf/type metadata for all namespaces in the current
  Clojure environment. 

  The resulting class hierarchy is returned."
  ([]
   (make-class-hierarchy (all-ns-metaobjects)))
  ([metaobjects]
   (reduce (fn [h {:db/keys   [ident]
                   :rdf/keys  [type]
                   :rdfs/keys [subClassOf]
                   :owl/keys  [sameAs equivalentClass]
                   :as        entity}]
             (if (and (or subClassOf
                          equivalentClass
                          (some #{:rdfs/Class :owl/Class :rdfs/Datatype} type))
                      (not (some #(isa? h % :rdf/Property) type)))
               (deriving h entity (concat (filter keyword? type)
                                          (filter keyword? subClassOf)
                                          (filter keyword? equivalentClass)))
               h))
           (derive (make-hierarchy) :rdfs/Resource :rdfs/Class)
           metaobjects)))

(defn make-property-hierarchy
  "The make-property-hierarchy function generates a hierarchy of RDF
  properties based on their relationships to each other.

  Args:

    classes: a hierarchy of RDF classes

  Returns:

    A hierarchy of RDF properties

  It reduces the variables by building a hierarchy of RDF properties
  based on their relationships to each other. It checks whether each
  property has subPropertyOf, equivalentProperty, or is a subclass of
  :rdf/Property. If any of these conditions is true, it adds the
  property to the hierarchy. Finally, it returns the hierarchy of
  properties."
  ([classes]
   (make-property-hierarchy classes (all-ns-metaobjects)))
  ([classes metaobjects]
   (reduce
     (fn [h {:db/keys   [ident]
             :rdf/keys  [type]
             :rdfs/keys [subPropertyOf]
             :owl/keys  [equivalentProperty]
             :as        entity}]
       (if (or subPropertyOf
               equivalentProperty
               (some #(isa? classes % :rdf/Property) type))
         (deriving h entity (concat (filter keyword? (filter #(isa? classes % :rdf/Property) type))
                                    (filter keyword? subPropertyOf)
                                    (filter keyword? equivalentProperty)))
         h))
     (make-hierarchy)
     metaobjects)))

(defn make-metaobject-hierarchy
  "The make-metaobject-hierarchy function takes in two arguments,
  classes and properties, which are collections of RDF classes and
  properties, respectively. It returns a hierarchy of metaobjects
  derived from these classes and properties.

  Parameters:

    classes: a hierarchy of RDF classes
    properties: a hierarchy of RDF properties

  Returns:

    A hierarchy of metaobjects derived from the input RDF classes and properties."
  ([classes properties]
   (make-metaobject-hierarchy classes properties (all-ns-metaobjects)))
  ([classes properties metaobjects]
   (reduce
     (fn [h {:db/keys   [ident]
             :rdf/keys  [type]
             :rdfs/keys [subClassOf equivalentClass
                         subPropertyOf equivalentProperty]
             :as        entity}]
       (cond-> h
         (seq (remove #{:rdfs/Class :owl/Class} (filter keyword? type)))
         (deriving entity (remove #{:rdfs/Class :owl/Class} (filter keyword? type)))
         
         (or subPropertyOf
             equivalentProperty
             (some #(isa? classes % :rdf/Property) type))
         (deriving entity
                   (distinct
                     (concat (filter keyword? (filter #(isa? classes % :rdf/Property) type))
                             (filter keyword? subPropertyOf)
                             (filter keyword? equivalentProperty))))))
     classes
     metaobjects)))

(declare find-metaobject)

(defn make-hierarchies
  "Returns a map of hierarchies for *classes*, *properties*, and
  *metaobjects*."
  []
  (let [metaobjects (all-ns-metaobjects)
        classes     (make-class-hierarchy metaobjects)
        properties  (make-property-hierarchy classes metaobjects)
        metaobjects (make-metaobject-hierarchy classes properties metaobjects)]
    {:classes     classes
     :properties  properties
     :metaobjects metaobjects}))

(declare finalize setup-indexes)

;; :init-ns
;; the ns-name of a Clojure namespace to load to implement methods of the
;; metaobject protocol found in `net.wikipunk.mop`

;; :ns-prefix 
;; the prefix string to use when locating metaobjects in your system
;; (optional, defaults to above)

;; :target
;; the output directory where the Universal Translator should place
;; emitted Clojure namespaces from RDF models 
;; (optional, defaults to above)

;; :boot
;; A list of namespace-qualified symbols resolving to vars with
;; :rdfa/prefix and :rdfa/uri mappings

;; (These vars should exist in in a 'boot' namespace with metadata of
;; {:rdf/type :jsonld/Context} where namespace prefixes for your system
;; should be looked up.)

(defrecord UniversalTranslator [ns-prefix target boot init-ns]
  com/Lifecycle
  (start [this]
    (binding [*ns-prefix* (or ns-prefix *ns-prefix*)
              *target*    (or target *target*)]            
      (let [{:keys [registry ns-aliases]}            (make-boot-context)
            {:keys [classes properties metaobjects]} (make-hierarchies)]
        (alter-var-root #'reg/*registry* (constantly registry))
        (alter-var-root #'*ns-prefix* (constantly (or ns-prefix "net.wikipunk.rdf.")))
        (alter-var-root #'*ns-aliases* (constantly ns-aliases))
        (alter-var-root #'*classes* (constantly classes))
        (alter-var-root #'*properties* (constantly properties))
        (alter-var-root #'*metaobjects* (constantly metaobjects))
        (when-let [init-ns (and (symbol? init-ns)
                                (do (require init-ns :reload)
                                    (find-ns init-ns)))]
          (alter-var-root (requiring-resolve 'net.wikipunk.temple/*tree-of-life*) (constantly metaobjects))
          (let [indexes (setup-indexes classes properties)]
            (alter-var-root #'*indexes* (constantly indexes))
            (finalize)))
        this)))
  (stop [this]
    (alter-var-root #'*classes* (constantly (make-hierarchy)))
    (alter-var-root #'*properties* (constantly (make-hierarchy)))
    this)

  NamespaceSpitter
  (emit [_ arg-map]
    (binding [*ns-prefix* (or ns-prefix *ns-prefix*)
              *target*    (or target *target*)]
      (emit boot arg-map))))

;; Make Apache Jena iterators reducible

(extend-protocol clojure.core.protocols/CollReduce
  ClosableIterator
  (coll-reduce
    ([coll f]
     (coll-reduce coll f (f)))
    ([coll f val]
     (let [^ClosableIterator iter coll]
       (try
         (loop [ret val]
           (if (.hasNext iter)
             (let [ret (f ret (.next iter))]
               (if (reduced? ret)
                 @ret
                 (recur ret)))
             ret))
         (finally
           (.close iter))))))

  org.apache.jena.query.ResultSet
  (coll-reduce
    ([coll f]
     (coll-reduce coll f (f)))
    ([coll f val]
     (let [^ResultSet iter coll]
       (try
         (loop [ret val]
           (if (.hasNext iter)
             (let [ret (f ret (.next iter))]
               (if (reduced? ret)
                 @ret
                 (recur ret)))
             ret))
         (finally
           (.close iter))))))

  Model
  (coll-reduce
    ([coll f]
     (coll-reduce coll f (f)))
    ([coll f val]
     (let [^Model model coll]
       (coll-reduce (.listStatements model) f val))))

  Graph
  (coll-reduce
    ([coll f]
     (coll-reduce coll f (f)))
    ([coll f val]
     (let [^Graph g coll]
       (coll-reduce (.find g) f val)))))

(defmethod print-method org.apache.jena.datatypes.xsd.XSDDateTime
  [^org.apache.jena.datatypes.xsd.XSDDateTime x ^java.io.Writer writer]
  (print-method (.asCalendar x) writer))

(defmethod print-dup org.apache.jena.datatypes.xsd.XSDDateTime
  [^org.apache.jena.datatypes.xsd.XSDDateTime x ^java.io.Writer writer]
  (print-method x writer))

(defn kw
  "returns a keyword for IRI accounting for unreadable symbols in
  Clojure"
  [iri]
  (when-some [k (try
                  (reg/kw iri)
                  (catch Throwable ex
                    (log/warn ex (.getMessage ex))))]
    (cond
      ;; Do not return blank qualified keyword names
      (or (str/blank? (namespace k)) (str/blank? (name k)))
      nil

      ;; ignore unidentified namespaces
      (re-find #"^ns\d*$" (namespace k))
      nil

      (= (last (name k)) \/)
      nil

      ;; Since these are not readable wrap in CL-inspired || 
      (or (re-find #"^\d" (name k))
          (re-find #"^#" (name k)))
      (keyword (namespace k) (str \| (name k) \|))

      (re-find #"[\s\(\)!,]" (name k))
      (keyword (namespace k) (java.net.URLEncoder/encode (name k)))

      (re-find #"[\s\(\)!,]" (java.net.URLDecoder/decode (name k)))
      k

      :else (keyword (namespace k) (try
                                     (java.net.URLDecoder/decode (name k))
                                     (catch Throwable ex
                                       (name k)))))))

(extend-protocol g/AsClojureData
  Node_URI
  (data [n]
    (let [uri (.getURI n)]
      (or (kw uri) uri)))

  Node_Blank
  (data [n]
    {:rdf/blank (.getLabelString (.getBlankNodeId n))})

  Node_Literal
  (data [n]
    (try
      (if (= XSDDatatype/XSDdateTime (.getLiteralDatatype n))
        (.getTime (.asCalendar ^XSDDateTime (.getLiteralValue n)))
        (if-let [lang (not-empty (.getLiteralLanguage n))]
          {:rdf/value    (.getLiteralValue n)
           :rdf/language lang}
          (let [value (.getLiteralValue n)]
            (if (instance? BaseDatatype$TypedValue value)
              (.-lexicalValue value)
              value))))
      (catch org.apache.jena.datatypes.DatatypeFormatException ex
        (log/warn (.getMessage ex))
        (str n)))))

(defn iri
  "returns IRI for ident using aristotle's registry"
  [ident]
  (reg/iri (keyword (namespace ident)
                    (let [n (-> (name (unmunge ident))
                                (str/replace #"^\|" "")
                                (str/replace #"\|$" ""))]
                      (try
                        (java.net.URLDecoder/decode n)
                        (catch Throwable ex
                          n))))))

;;  The function extracts some values from the md map and uses them to
;;  construct a Jena graph, which is a data structure used to
;;  represent RDF data. It also modifies the namespace prefix map to
;;  handle some specific prefix mappings. The resulting Jena graph is
;;  then transformed into a collection of maps representing RDF
;;  entities and their properties.

(extend-protocol Parsable
  clojure.lang.IPersistentMap
  (parse [md]
    (let [{:rdfa/keys [uri prefix]
           :vann/keys [preferredNamespacePrefix preferredNamespaceUri]
           :dcat/keys [downloadURL]} md
          parser                     (RDFParser/source (or downloadURL uri))
          g                          (try
                                       (.toGraph parser)
                                       (catch org.apache.jena.riot.RiotException ex
                                         ;; if an appropriate content-type cannot be inferred try Turtle
                                         (try
                                           (.toGraph (doto parser (.lang Lang/TTL)))
                                           (catch org.apache.jena.riot.RiotException ex
                                             ;; ...try RDF/XML?
                                             (try
                                               (.toGraph (doto parser (.lang Lang/RDFXML)))
                                               (catch org.apache.jena.riot.RiotException ex
                                                 ;; ...try JSONLD?
                                                 (.toGraph (doto parser (.lang Lang/JSONLD)))))))))
          ns-prefix-map              (or (:rdf/ns-prefix-map md) ; use explicitly provided ns-prefix-map 
                                         (set/rename-keys (dissoc (into (if (and prefix uri)
                                                                          {prefix uri}
                                                                          {})
                                                                        (.getNsPrefixMap (.getPrefixMapping g)))
                                                                  "ruleml"
                                                                  "obo1"
                                                                  "oboInOwl2")
                                                          {"sdo" "schema" "dct" "dcterms" "dc" "dcterms" "terms" "dcterms" "ns" "vs" "sw" "vs" "" prefix "s" "rdfs" "dctype" "dcmitype" "dctypes" "dcmitype" "st" "vs" "pwnid" "wn.id" "pwnlemma" "wn.lemma" "pwn30" "wn30"}))]
      (reg/with ns-prefix-map
                (into (with-meta [] (assoc md :rdf/ns-prefix-map ns-prefix-map))
                      (->> (into [] g)
                           (group-by #(.getSubject ^Triple %))
                           (pmap (fn [[subject triples]]
                                   (into {:db/ident (g/data subject)}
                                         (map (fn [[pred triples]]
                                                (let [k       (g/data pred)
                                                      objects (mapv #(g/data (.getObject ^Triple %)) triples)]
                                                  [k (if (= 1 (count objects))
                                                       (first objects)
                                                       objects)])))
                                         (group-by #(.getPredicate ^Triple %) triples)))))))))

  clojure.lang.Keyword
  (parse [ident]
    (when-some [url (iri ident)]
      (parse {:rdfa/prefix      (namespace ident)
              :dcat/downloadURL url})))

  clojure.lang.Named
  (parse [ident]
    (if (qualified-ident? ident)
      (some-> (resolve ident) deref parse)
      (some-> (find-ns ident) meta parse)))

  clojure.lang.Namespace
  (parse [ns]
    (parse (meta ns)))

  String
  (parse [s]
    (parse {:dcat/downloadURL s})))

(def mem-parse (memo/memo parse))

(defn walk-blanks
  [index form]
  (if-some [node (:rdf/blank form)]
    (get index form)
    form))

(defn walk-dcterms
  "dcterms is a superset of dc(11)
   https://www.dublincore.org/specifications/dublin-core/dces/"
  [form]
  (if (and (keyword? form) (or (= (namespace form) "dc")
                               (= (namespace form) "dct")))

    (keyword "dcterms" (name form))
    form))

(defn walk-rdf-list
  "unrolls RDF lists into Vectors"
  [form]
  (cond
    (identical? (:rdf/rest form) :rdf/nil)
    [(:rdf/first form)]

    (and (:rdf/first form) (:rdf/rest form))
    (into [(:rdf/first form)] (:rdf/rest form))

    :else form))

(defn walk-bytes
  "Turns byte arrays into vectors of primitive bytes"
  [form]
  (if (bytes? form)
    (into (vector-of :byte) form)
    form))

(defn walk-seeAlso
  "Turns :rdfs/seeAlso forms into strings"
  [form]
  (if (and (map? form)
           (contains? form :rdfs/seeAlso))
    (let [seeAlso  (:rdfs/seeAlso form)
          seeAlso  (if (sequential? seeAlso)
                     seeAlso
                     [seeAlso])
          seeAlso' (mapv (fn [x]
                           (if (keyword? x)
                             (iri x)
                             x))
                         seeAlso)]
      (assoc form :rdfs/seeAlso (filterv string? seeAlso')))
    form))

(defprotocol Box
  (box [val] "boxes the value"))

(extend-protocol Box
  Boolean
  (box [val]
    {:xsd/boolean val})
  
  Number
  (box [n]
    (cond
      (float? n)
      {:xsd/double n}
      (int? n)
      {:xsd/long n}
      :else {:owl/real n}))

  String
  (box [s]
    {:xsd/string s})

  clojure.lang.Sequential
  (box [xs]
    (mapv box xs))

  clojure.lang.IPersistentMap
  (box [m]
    ;; special case coerce these to doubles 
    (if (some #{:xsd/minExclusive :xsd/minInclusive
                :xsd/maxExclusive :xsd/maxInclusive}
              (keys m))
      (update m (some #{:xsd/minExclusive :xsd/minInclusive
                        :xsd/maxExclusive :xsd/maxInclusive}
                      (keys m))
              (fn [x]
                (if (string? x)
                  (try
                    (Long/parseLong x)
                    (catch Throwable ex
                      (try
                        (Double/parseDouble x)
                        (catch Throwable ex
                          (double (read-string (str "0x" x)))))))
                  (double x))))
      m))

  Object
  (box [o] o)

  nil
  (box [_] :rdf/nil))

(defn box-value
  [form f k]
  (f form k box))

(defn box-values
  "Walker to box values in the form."
  [form]
  (if (map? form)
    (cond-> form
      (some? (:owl/hasValue form))
      (box-value update :owl/hasValue)

      (seq (:owl/oneOf form))
      (box-value update :owl/oneOf)

      (seq (:owl/withRestrictions form))
      (box-value update :owl/withRestrictions))
    form))

(def ^:dynamic *recurse* 2)

(defn unroll-forms
  "Walks the parsed RDF model and replaces references to blank nodes
  with their data. Also unrolls lists."
  [model]
  (let [md             (walk/prewalk walk-dcterms (meta model))
        prefix         (or (:rdfa/prefix md)
                           (:vann/preferredNamespacePrefix md)
                           (some-> (:ns md) ns-name #(str/split #"\.") peek))
        model-by-ident (update-vals (group-by :db/ident model) first)
        index          (update-vals model-by-ident #(dissoc % :db/ident))
        forms          (->> index
                            (walk/prewalk (partial walk-blanks index))                            
                            (walk/postwalk walk-dcterms)
                            (walk/postwalk walk-bytes)
                            (map (fn [[k v]]
                                   (cond
                                     (qualified-keyword? k)
                                     (assoc v :db/ident k)
                                     
                                     (string? k)
                                     (assoc v :rdf/uri k)

                                     :else v)))
                            (pmap (fn [form]
                                    (->> form
                                         (walk/postwalk walk-rdf-list)
                                         (walk/postwalk walk-seeAlso)
                                         (walk/prewalk box-values)))))
        concepts   (->> forms
                        (map (fn [form]
                               (reduce (fn [form term]
                                         (if (contains? form term)
                                           (update form term #(cond (coll? %) % (nil? %) [] :else [%]))
                                           form))
                                       form +props+)))
                        (mapcat (some-fn :madsrdf/hasMADSSchemeMember
                                         :skos/member
                                         :skos/broader))
                        (distinct)
                        (pmap (fn [ident]
                                (when (pos? *recurse*)
                                  (try
                                    (binding [*recurse* (and (pos? *recurse*)
                                                             (dec *recurse*))]
                                      (let [x  (sniff ident)
                                            md (meta x)]
                                        (into [(with-meta x {})]
                                              (map #(with-meta % {}))
                                              (vals (dissoc md :dcat/downloadURL :rdf/ns-prefix-map :rdfa/prefix)))))
                                    (catch Throwable ex
                                      (println ident (.getMessage ex))
                                      nil))))))
        forms      (into (vec forms) cat concepts)
        public?    (fn [form]
                     (and (:db/ident form)
                          (let [ns-name (namespace (:db/ident form))]
                            (or (= prefix ns-name)
                                (and (= ns-name "obo")
                                     (= prefix (first (str/split (name (:db/ident form)) #"_"))))))))
        ontologies (->> (remove public? forms)
                        (filter :rdf/type)
                        (filter (fn [form]
                                  (some #(or (isa? *classes* % :owl/Ontology)
                                             (isa? *classes* % :voaf/Vocabulary)
                                             (isa? *classes* % :madsrdf/MADSScheme))
                                        (if (coll? (:rdf/type form))
                                          (:rdf/type form)
                                          [(:rdf/type form)])))))
        the-ont    (or (first ontologies)
                       (first (filter :rdf/uri (remove public? forms))))
        forms      (filter #(keyword? (:db/ident %)) forms)
        publics    (filter public? forms)
        privates   (->> (remove public? forms)
                        (remove (fn [form]
                                  (contains? #{"rdf" "rdfs" "owl" "xsd" "dcterms" "dc11"}
                                             (namespace (:db/ident form)))))
                        (pmap #(assoc % :private true)))]
    (with-meta (into (vec (sort-by :db/ident publics))
                     (sort-by :db/ident privates))
      (merge md the-ont))))

(defn unroll-ns
  "Walks the parsed RDF model and replaces references to blank nodes
  with their data. Also unrolls lists."
  [model]
  (let [forms      (unroll-forms model)
        md         (meta forms)
        forms      (->> forms
                        ;; todo: refactor this into a multimethod
                        (pmap (fn [form]
                                (if (and (pos? *recurse*)
                                         (some #(or (isa? *classes* % :skos/Concept)
                                                    (isa? *classes* % :skos/ConceptScheme))
                                               (if (sequential? (:rdf/type form))
                                                 (:rdf/type form)
                                                 [(:rdf/type form)])))
                                  (try
                                    (when-some [x (parse (:db/ident form))]
                                      (or (some-> (group-by :db/ident (unroll-forms x))
                                                  (get (:db/ident form))
                                                  (first)
                                                  ((fn [a b] (merge b a)) form)
                                                  (dissoc :private))
                                          form))
                                    (catch Throwable ex
                                      (println (:db/ident form) (.getMessage ex))
                                      form))
                                  form))))
        exclusions (->> forms
                        (filter (comp qualified-keyword? :db/ident))
                        (map (comp symbol name :db/ident))
                        (filter #(var? (ns-resolve 'clojure.core %)))
                        (into []))
        prefix     (or (:rdfa/prefix md)
                       (:vann/preferredNamespacePrefix md))        
        forms      (->> forms
                        (pmap (fn [v]
                                (let [k   (:db/ident v)
                                      sym (symbol (name k))
                                      sym (cond
                                            (= (name sym) "Class")
                                            'T
                                            
                                            (get clojure.lang.RT/DEFAULT_IMPORTS sym)
                                            (symbol (str sym "Class"))

                                            (= (name sym) "nil")
                                            'null

                                            :else sym)
                                      sym       (if (:private v) (with-meta sym {:private true}) sym)
                                      v         (if (:private v) (dissoc v :private) v)
                                      docstring (or (some-> (:lv2/documentation v))
                                                    (:dcterms/abstract v)
                                                    (:dcterms/description v)
                                                    (:skos/definition v)
                                                    (:prov/definition v)
                                                    (:prov/editorsDefinition v)
                                                    (:madsrdf/definitionNote v)
                                                    (:madsrdf/authoritativeLabel v)
                                                    (:d3fend/definition v)
                                                    (:d3fend/d3fend-comment v)
                                                    (:d3fend/kb-article v)
                                                    (:d3fend/control-name v)
                                                    (:rdfs/comment v)
                                                    (:skos/prefLabel v)
                                                    (:rdfs/label v))
                                      docstring (if (vector? docstring)
                                                  (if (every? string? docstring)
                                                    (str/join \newline docstring)
                                                    (first (or (get (group-by :rdf/language docstring) "en")
                                                               (get (group-by :rdf/language docstring) "en-US")
                                                               (seq (filter string? docstring)))))
                                                  docstring)
                                      docstring (if (map? docstring)
                                                  (:rdf/value docstring "")
                                                  docstring)
                                      docstring (when docstring
                                                  (str/trim (str/replace docstring #"\s+" " ")))
                                      v         (cond-> (assoc v :db/ident k)
                                                  (and (nil? (:rdf/type v))
                                                       (:rdfs/subClassOf v))
                                                  (assoc :rdf/type :rdfs/Class)

                                                  (and (nil? (:rdf/type v))
                                                       (:rdfs/subPropertyOf v))
                                                  (assoc :rdf/type :rdf/Property))]
                                  (if docstring
                                    (list 'def sym docstring (dissoc v :lv2/documentation))
                                    (list 'def sym v))))))]
    (if prefix
      (cons `(~'ns ~(symbol (str *ns-prefix* prefix))
              ~@(let [docstring (or (get-in md [:lv2/project :lv2/documentation])
                                    (:dcterms/abstract md)
                                    (:dcterms/description md)
                                    (:dcterms/title md)
                                    (:madsrdf/definitionNote md)
                                    (:rdfs/comment md)
                                    (:rdfs/label md)
                                    (:rdfa/uri md)
                                    (:doc md))
                      docstring (if (vector? docstring)
                                  (if (every? string? docstring)
                                    (str/join \newline docstring)
                                    (first (or (get (group-by :rdf/language docstring) "en")
                                               (get (group-by :rdf/language docstring) "en-US")
                                               (seq (filter string? docstring)))))
                                  docstring)
                      docstring (if (map? docstring)
                                  (:rdf/value docstring)
                                  docstring)
                      docstring (when docstring
                                  (str/trim (str/replace docstring #"\s+" " ")))]
                  (when docstring
                    [docstring]))              
              ~(dissoc (cond-> (assoc md :rdf/type :owl/Ontology)
                         (:lv2/project md)
                         (update :lv2/project #(dissoc % :lv2/documentation)))
                       :doc)
              ~@(when (seq exclusions)
                  [(list :refer-clojure :exclude exclusions)]))
            forms)
      forms)))

(def mem-unroll
  (memo/memo unroll-forms))

(extend-protocol NamespaceSpitter
  clojure.lang.IPersistentCollection
  (emit [xs arg-map]
    (dorun (pmap #(try
                    (emit % arg-map)
                    (catch Throwable ex
                      (println % (.getMessage ex))))
                 xs)))

  String
  (emit [s arg-map]
    (emit {:dcat/downloadURL s} arg-map))

  clojure.lang.Named
  (emit [n arg-map]
    (emit @(resolve (symbol n)) arg-map))
  
  clojure.lang.IPersistentMap
  (emit [x arg-map]
    (let [model (parse x)
          md    (meta model)]
      (if-some [prefix (or (:rdfa/prefix md)
                           (:vann/preferredNamespacePrefix md))]
        (spit (str (or (:target arg-map) *target*)
                   (namespace-munge (str/replace prefix #"\." "/"))
                   ".clj")
              (binding [*print-namespace-maps* nil
                        *print-meta*           true]
                (let [forms (unroll-ns model)]
                  (try
                    (zprint/zprint-file-str  (apply str forms)
                                             "file:"
                                             {:parse  {:interpose "\n\n"}
                                              :map    {:justify?      true
                                                       :nl-separator? false
                                                       :hang?         true
                                                       :indent        0
                                                       :sort-in-code? true
                                                       :force-nl?     true}
                                              :vector {:wrap? false}})
                    (catch Throwable ex
                      ;; sometimes zprint has trouble with otherwise fine files
                      (with-out-str
                        (doseq [form forms]
                          (zprint/zprint form {:map    {:justify?      true
                                                        :nl-separator? false
                                                        :hang?         true
                                                        :indent        0
                                                        :sort-in-code? true
                                                        :force-nl?     true}
                                               :vector {:wrap? false}})
                          (newline))))))))
        (zprint/zprint (unroll-forms model))))))

(defn find-obo-metaobject
  "Find a metaobject in the OBO namespace."
  [ident]
  (when-some [prefix (first (str/split (name ident) #"_"))]
    (try
      (if (= prefix "APOLLO")
        (ns-resolve (get *ns-aliases* "APOLLO_SV") (unmunge ident))
        (or (ns-resolve (get *ns-aliases* prefix) (unmunge ident))
            (ns-resolve (get *ns-aliases* (str/lower-case prefix)) (unmunge ident))
            (ns-resolve (get *ns-aliases* (str/upper-case prefix)) (unmunge ident))))
      (catch Throwable ex
        (when (= *assert* :obo)
          (if (and (contains? *ns-aliases* prefix)
                   (nil? (get *ns-aliases* prefix)))
            (do
              (println "requiring" (str *ns-prefix* prefix))
              (require (symbol (str *ns-prefix* prefix)))
              (ns-resolve (symbol (str *ns-prefix* prefix)) (unmunge ident)))
            (throw (ex-info "Could not resolve OBO metaobject" {:ident ident}))))
        nil))))

(defn find-metaobject
  "Finds a metaobject by namespace-qualified keyword identity by
  looking up its namespace in the system's registry and attempting to
  resolve the name as a Var in that namespace, requiring it when
  necessary."
  [ident]
  (when (qualified-keyword? ident)
    (when-some [var (if (= (namespace ident) "obo")
                      (find-obo-metaobject ident)
                      (try
                        (requiring-resolve
                          (symbol
                            (str (or (get *ns-aliases* (namespace ident))
                                     (get (ns-aliases *ns*) (symbol (namespace ident)))
                                     (as-> (symbol (str "net.wikipunk.rdf." (namespace ident))) ns-name
                                       (doto ns-name (require))
                                       (find-ns ns-name))
                                     (as-> (symbol (str *ns-prefix* (namespace ident))) ns-name
                                       (doto ns-name (require))
                                       (find-ns ns-name))))
                            (name (unmunge ident))))
                        (catch Throwable ex
                          nil)))]
      (with-meta @var {:var var :type (or (and (keyword? (type var))
                                               (type var))
                                          (:type (alter-meta! var assoc :type (mop/type-of @var)))
                                          :rdfs/Resource)}))))

(defn print-doc
  "Prints documentation from metadata on a metaobject's var"
  [ident]
  (when-some [metaobject (find-metaobject ident)]
    (println "-------------------------")
    (println (:db/ident metaobject))
    (when-some [doc (:doc (meta (:var (meta metaobject))))]
      (println "  " doc))
    (when-some [supers (next ((requiring-resolve 'net.wikipunk.mop/compute-class-precedence-list) metaobject))]
      (println "  isa?")
      (reduce (fn [cnt class]
                (println (str (apply str (repeat cnt \space)) class))
                (inc cnt))
              2 supers))
    nil))

(defmacro doc
  "Prints documentation for a var or special form given its name, or
  for a RDF term if given a keyword.
  
  Adapted from #'clojure.repl/doc"
  [name]
  (require 'clojure.repl)
  (if-let [special-name ('{& fn catch try finally try} name)]
    `(#'clojure.repl/print-doc (#'clojure.repl/special-doc '~special-name))
    (cond
      (@#'clojure.repl/special-doc-map name) `(#'clojure.repl/print-doc (#'clojure.repl/special-doc '~name))
      (qualified-keyword? name)              `(#'print-doc ~name)
      (keyword? name)                        `(when-some [ns# (get *ns-aliases* (clojure.core/name ~name))]
                                                (#'clojure.repl/print-doc (#'clojure.repl/namespace-doc ns#)))
      (find-ns name)                         `(some-> (find-ns '~name)
                                                      (#'clojure.repl/namespace-doc)
                                                      (#'clojure.repl/print-doc))
      (resolve name)                         `(#'clojure.repl/print-doc (meta (var ~name)))
      :else                                  nil)))

(defn unroll-langString
  [form]
  (if (and (:rdf/language form) (:rdf/value form))
    (str (:rdf/value form) "@" (:rdf/language form))
    form))

(defn unroll-blank
  [form]
  (if (and (map? form)
           (and (not (contains? form :db/ident))
                (not (contains? form :db/id))))
    (assoc form :db/id (str (random-uuid)))
    form))

(defn unroll-missing-uris
  [form]
  (if (sequential? form)
    (filterv (some-fn keyword? map?) form)
    form))

(defn- unroll-term
  [x]
  (cond
    (keyword? x) #{x}
    
    (map? x) (or (:owl/unionOf x)
                 (:owl/intersectionOf x)
                 (:owl/oneOf x))
    
    (sequential? x) (into #{} (mapcat unroll-term) x)

    :else #{}))

(defn- unroll-for-index
  [ident]
  (reduce (fn [mo term]
            (if (contains? mo term)
              (let [mo' (update mo term unroll-term)]
                (if (get mo' term)
                  mo'
                  (dissoc mo' term)))
              mo))
          (find-metaobject ident)
          #{:rdf/type
            :rdfs/domain
            :rdfs/range
            :schema/domainIncludes
            :schema/rangeIncludes
            :rdfs/subClassOf
            :rdfs/subPropertyOf
            :d3fend/identifies
            :skos/broader}))

(defn setup-indexes
  ([]
   (setup-indexes *classes* *properties*))
  ([classes properties]
   (let [classes (into [] (pmap unroll-for-index (keys (:parents classes))))
         slots   (into [] (pmap unroll-for-index (keys (:parents properties))))]
     {:classes/by-type
      (dissoc (group-by :rdf/type classes) nil)
      :classes/by-subclass
      (dissoc (group-by :rdfs/subClassOf classes) nil)
      :slots/by-type
      (dissoc (group-by :rdf/type slots) nil)
      :slots/by-domain
      (reduce-kv (fn [m domain slots]
                   (reduce (fn [m k]
                             (update m k (fnil into []) slots))
                           m domain))
                 {}
                 (dissoc (group-by (fn [slot]
                                     (set/union (:rdfs/domain slot)
                                                (:schema/domainIncludes slot)
                                                (:d3fend/identifies slot)))
                                   slots)
                         nil))
      :slots/by-range
      (reduce-kv (fn [m domain slots]
                   (reduce (fn [m k]
                             (update m k (fnil into []) slots))
                           m domain))
                 {}
                 (dissoc (group-by (fn [slot]
                                     (set/union (:rdfs/range slot)
                                                (:schema/rangeIncludes slot)))
                                   slots)
                         nil))
      
      :slots/by-subproperty
      (dissoc (group-by :rdfs/subPropertyOf slots) nil)})))


(defn finalize
  "Finalizes all of the loaded classes."
  ([] (finalize true (set/difference (conj (descendants *classes* :rdfs/Class) :rdfs/Class)
                                     (descendants *metaobjects* :skos/Concept)
                                     (descendants *properties* :rdf/Property)
                                     (descendants *metaobjects* :owl/NamedIndividual)
                                     (descendants *metaobjects* :owl/AnnotationProperty))))
  ([force? metaobjects]
   (dorun
     (pmap (fn [ident]
             (if-some [mo (mop/find-class ident)]
               (do
                 (when (or force? (not (mop/class-finalized? mo)))
                   (mop/finalize-inheritance mo)))
               (throw (ex-info "Could not locate metaobject" {:ident ident}))))
           metaobjects))))


(extend-protocol clojure.core.protocols/Datafiable
  clojure.lang.Named
  (datafy [ident]
    (cond
      (qualified-keyword? ident)
      (reduce-kv (fn [m k v]
                   (try
                     (if (not= (namespace k) "mop")
                       (assoc m k v)
                       m)
                     (catch Throwable ex
                       (println m k v)
                       m)))
                 {} (find-metaobject ident))

      (qualified-symbol? ident)
      (resolve ident)

      :else (find-ns (symbol ident)))))

(extend-protocol LinkedData
  clojure.lang.IPersistentCollection
  (sniff [coll]
    (pmap #(sniff %) coll))

  String
  (sniff [s]
    (sniff {:dcat/downloadURL s}))
  
  clojure.lang.IPersistentMap
  (sniff [m]
    (let [model (mem-parse m)]
      (unroll-forms model)))

  clojure.lang.Keyword
  (sniff [k]
    (try
      (when-some [model (mem-parse k)]
        (let [forms (mapv #(dissoc % :private) (unroll-forms model))
              idx   (group-by :db/ident forms)]
          (if-some [val (get idx k)]
            (with-meta (first val)
              (merge (meta model)
                     (update-vals (dissoc idx k) first)))
            (with-meta (peek forms)
              (merge (meta model) (dissoc idx (get (peek forms) :db/ident)))))))
      (catch Throwable ex
        (log/debug (.getMessage ex)))))

  nil
  (sniff [_] nil))
