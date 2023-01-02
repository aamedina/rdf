(ns net.wikipunk.rdf
  "The Universal Translator"
  (:require
   [arachne.aristotle.registry :as reg]
   [arachne.aristotle.graph :as g]
   [clojure.core.memoize :as memo]
   [clojure.core.protocols :refer [coll-reduce]]   
   [clojure.java.io :as io]
   [clojure.set :as set]
   [clojure.string :as str]
   [clojure.walk :as walk]
   [com.stuartsierra.component :as com]
   [net.wikipunk.boot :as boot]
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

(def ^:dynamic *things*
  #{})

(def ^:dynamic *ns-aliases*
  {})

(def ^:dynamic *ns-prefix* "net.wikipunk.rdf.")
(def ^:dynamic *target* "src/net/wikipunk/rdf/")

#rdf/global-prefix ["dcterms" "http://purl.org/dc/terms/"]

(defn make-boot-context
  []
  (transduce (comp
               (filter #(= (:rdf/type (meta %)) :jsonld/Context))
               (map ns-publics)
               (mapcat vals)
               (map deref)
               (map (juxt :rdfa/prefix :rdfa/uri)))
             (completing
               (fn [reg [prefix uri]]
                 (try
                   (reg/add-prefix reg true prefix uri)
                   (catch Throwable ex
                     reg))))
             (reg/add-prefix {:prefixes  {}
                              :prefixes' {}
                              :aliases   {}
                              :aliases'  {}}
                             true
                             "dcterms"
                             "http://purl.org/dc/terms/")
             (all-ns)))

(defn deriving
  [h {:db/keys [ident]} xs]
  (reduce (fn [h parent]
            (try
              (derive h ident parent)
              (catch Throwable ex
                h)))
          h xs))

(def ^:private +props+
  #{:rdf/type
    :rdfs/subClassOf
    :rdfs/subPropertyOf
    :owl/equivalentClass
    :owl/equivalentProperty})

(def cat-rdf-idents
  (comp
    (filter (comp :rdf/type meta))
    (map ns-publics)
    (mapcat vals)
    (map deref)
    (filter #(some +props+ (keys %)))
    (filter (comp qualified-keyword? :db/ident))
    (map (fn [entity]
           (reduce (fn [entity term]
                     (update entity term #(if (coll? %) % [%])))
                   entity +props+)))))

(defn make-class-hierarchy
  []
  (transduce
    cat-rdf-idents
    (completing
      (fn [h {:db/keys   [ident]
              :rdf/keys  [type]
              :rdfs/keys [subClassOf equivalentClass]
              :as        entity}]
        (if (or subClassOf
                equivalentClass
                (some #{:rdfs/Class :owl/Class :rdfs/Datatype} type))
          (deriving h entity (concat (filter #{:rdfs/Class :owl/Class :rdfs/Datatype} type)
                                     (filter keyword? subClassOf)
                                     (filter keyword? equivalentClass)))
          h)))
    (derive (make-hierarchy) :rdfs/Resource :rdfs/Class)
    (all-ns)))

(defn make-property-hierarchy
  [classes]
  (transduce
    cat-rdf-idents
    (completing
      (fn [h {:db/keys   [ident]
              :rdf/keys  [type]
              :rdfs/keys [subPropertyOf equivalentProperty]
              :as        entity}]
        (if (or subPropertyOf
                equivalentProperty
                (some #(isa? classes % :rdf/Property) type))
          (deriving h entity (concat (filter #(isa? classes % :rdf/Property)
                                             type)
                                     (filter keyword? subPropertyOf)
                                     (filter keyword? equivalentProperty)))
          h)))
    (make-hierarchy)
    (all-ns)))

(defn make-things
  [classes]
  (transduce
    cat-rdf-idents
    (completing
      (fn [h {:db/keys  [ident]
              :rdf/keys [type]
              :as       entity}]
        (if (some #{:owl/NamedIndividual} type)
          (conj h ident)
          h)))
    #{}
    (all-ns)))

(defn make-hierarchies
  []
  (let [classes    (make-class-hierarchy)
        properties (make-property-hierarchy classes)]
    {:classes    classes
     :properties properties
     :things     (make-things classes)}))

(defn compute-class-precedence-list
  [tag]
  (let [supers (into [tag]
                     (sort-by identity
                              (comparator (partial isa? *classes*))
                              (ancestors *classes* tag)))]
    (when (identical? (peek supers) :rdfs/Class)
      supers)))

(defn compute-property-precedence-list
  [tag]
  (let [supers (into [tag]
                     (sort-by identity
                              (comparator (partial isa? *properties*))
                              (ancestors *properties* tag)))]
    (when (isa? *classes* (peek supers) :rdf/Property)
      supers)))

(defrecord UniversalTranslator [ns-prefix target boot]
  com/Lifecycle
  (start [this]
    (alter-var-root #'reg/*registry* (constantly (make-boot-context)))
    (alter-var-root #'*ns-aliases*
                    (constantly
                      (reduce (fn [ns-aliases prefix]
                                (assoc ns-aliases prefix (find-ns (symbol (str *ns-prefix* prefix)))))
                              {}
                              (keys (:prefixes reg/*registry*)))))
    (let [{:keys [classes properties things]} (make-hierarchies)]
      (alter-var-root #'*classes* (constantly classes))
      (alter-var-root #'*properties* (constantly properties))
      (alter-var-root #'*things* (constantly things)))
    this)
  (stop [this]
    (alter-var-root #'*classes* (constantly (make-hierarchy)))
    (alter-var-root #'*properties* (constantly (make-hierarchy)))
    (alter-var-root #'*things* (constantly #{}))
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

(extend-protocol g/AsClojureData
  Node_URI
  (data [n]
    (let [uri (.getURI n)]
      (or (when-some [k (reg/kw uri)]
            (cond
              ;; Do not return blank qualified keyword names
              (or (str/blank? (namespace k)) (str/blank? (name k)))
              nil

              (and (Character/isDigit (first (name k)))
                   (= (last (name k)) \/))
              nil

              (and (Character/isDigit (first (name k)))
                   (Character/isDigit (last (name k))))
              nil

              ;; Since these are not readable wrap in CL-inspired || 
              (Character/isDigit (first (name k)))
              (keyword (namespace k) (str \| (name k) \|))

              :else k))
          uri)))

  Node_Blank
  (data [n]
    {:rdf/blank (.getLabelString (.getBlankNodeId n))})

  Node_Literal
  (data [n]
    (if (= XSDDatatype/XSDdateTime (.getLiteralDatatype n))
      (.getTime (.asCalendar ^XSDDateTime (.getLiteralValue n)))
      (if-let [lang (not-empty (.getLiteralLanguage n))]
        {:rdf/value    (.getLiteralValue n)
         :rdf/language lang}
        (let [value (.getLiteralValue n)]
          (if (instance? BaseDatatype$TypedValue value)
            (.-lexicalValue value)
            value))))))

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
                                             (.toGraph (doto parser (.lang Lang/RDFXML)))))))
          ns-prefix-map              (set/rename-keys (dissoc (into (cond-> (:rdf/ns-prefix-map md {})
                                                                      (and prefix uri)
                                                                      (assoc prefix uri))
                                                                    (.getNsPrefixMap (.getPrefixMapping g)))
                                                              "ruleml")
                                                      {"sdo" "schema" "dct" "dcterms" "dc" "dcterms" "dc11" "dcterms" "terms" "dcterms" "ns" "vs" "sw" "vs" "" prefix "s" "rdfs" "dctype" "dcmitype" "dctypes" "dcmitype" "st" "vs"})]
      (reg/with ns-prefix-map
                (into (with-meta [] (assoc md :rdf/ns-prefix-map ns-prefix-map))
                      (map (fn [[subject triples]]
                             (into {:db/ident (g/data subject)}
                                   (map (fn [[pred triples]]
                                          (let [k       (g/data pred)
                                                objects (mapv #(g/data (.getObject ^Triple %)) triples)]
                                            [k (if (= 1 (count objects))
                                                 (first objects)
                                                 objects)])))
                                   (group-by #(.getPredicate ^Triple %) triples))))
                      (group-by #(.getSubject ^Triple %) (into [] g))))))

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
                               (= (namespace form) "dct")
                               (= (namespace form) "dc11")))

    (keyword "dcterms" (name form))
    form))

(defn walk-rdf-list
  [form]
  (cond
    (identical? (:rdf/rest form) :rdf/nil)
    [(:rdf/first form)]

    (and (:rdf/first form) (:rdf/rest form))
    (into [(:rdf/first form)] (:rdf/rest form))

    :else form))

(defn walk-bytes
  [form]
  (if (bytes? form)
    (into (vector-of :byte) form)
    form))

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
                            (map (fn [form] (walk/postwalk walk-rdf-list form))))
        public?    (every-pred :db/ident (comp (partial = prefix) namespace :db/ident))
        ontologies (->> (remove public? forms)
                        (filter :rdf/type)
                        (filter (fn [form]
                                  (some #(or (isa? *classes* % :owl/Ontology)
                                             (isa? *classes* % :voaf/Vocabulary))
                                        (if (coll? (:rdf/type form))
                                          (:rdf/type form)
                                          [(:rdf/type form)])))))
        the-ont    (or (first ontologies)
                       (first (filter :rdf/uri (remove public? forms))))]
    (with-meta (sort-by :db/ident (filter public? forms))
      (merge md the-ont))))

(defn unroll-ns
  "Walks the parsed RDF model and replaces references to blank nodes
  with their data. Also unrolls lists."
  [model]
  (let [forms      (unroll-forms model)
        md         (meta forms)
        exclusions (->> forms
                        (filter (comp qualified-keyword? :db/ident))
                        (map (comp symbol name :db/ident))
                        (filter #(var? (ns-resolve 'clojure.core %)))
                        (into []))
        prefix     (or (:rdfa/prefix md)
                       (:vann/preferredNamespacePrefix md))        
        forms      (->> forms
                        (map (fn [v]
                               (let [k   (:db/ident v)
                                     sym (symbol (name k))
                                     sym (cond
                                           (= (name sym) "Class")
                                           'T
                                           
                                           (get clojure.lang.RT/DEFAULT_IMPORTS sym)
                                           (symbol (str sym "Class"))

                                           (= (name sym) "nil")
                                           'null

                                           :else (symbol (str/replace (name sym) #"^#" "")))
                                     docstring (or (some-> (:lv2/documentation v))
                                                   (:dcterms/abstract v)
                                                   (:dcterms/description v)
                                                   (:skos/definition v)
                                                   (:prov/definition v)
                                                   (:prov/editorsDefinition v)
                                                   (:rdfs/comment v)
                                                   (:skos/prefLabel v))
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
              ~(dissoc (cond-> (dissoc md :db/ident)
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
    (dorun (pmap #(emit % arg-map) xs)))

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
                   (namespace-munge prefix) ".clj")
              (binding [*print-namespace-maps* nil]
                (zprint/zprint-file-str  (apply str (unroll-ns model))
                                         "file:"
                                         {:parse  {:interpose "\n\n"}
                                          :map    {:justify?      true
                                                   :nl-separator? false
                                                   :hang?         true
                                                   :indent        0
                                                   :sort-in-code? true
                                                   :force-nl?     true}
                                          :vector {:wrap? false}})))
        (zprint/zprint (unroll-forms model))))))

(defmulti type-of
  type)

(defmethod type-of :default
  [obj]
  (type obj))

(defmethod type-of clojure.lang.IPersistentMap
  [m]
  (let [rdf-type (:rdf/type m)]
    (if (coll? rdf-type)
      (first (sort-by identity (comparator (partial isa? *classes*)) rdf-type))
      rdf-type)))

(defmethod type-of clojure.lang.Keyword
  [obj]
  (cond
    (isa? *classes* obj :rdfs/Class)
    :rdfs/Class

    (isa? *classes* obj :rdf/Property)
    :rdf/Property

    :else :rdfs/Resource))

(defn find-metaobject
  [ident]
  (when-some [var (ns-resolve (get *ns-aliases* (namespace ident))
                              (cond
                                (= (name ident) "Class")
                                'T
                                
                                (get clojure.lang.RT/DEFAULT_IMPORTS (symbol (name ident)))
                                (symbol (str (name ident) "Class"))

                                (= (name ident) "nil")
                                'null

                                :else
                                (-> (name ident)
                                    (str/replace #"^#" "")
                                    (symbol))))]
    
    (with-meta @var {:var var :type (or (and (keyword? (type var))
                                             (type var))
                                        (:type (alter-meta! var assoc :type (type-of @var)))
                                        :rdfs/Resource)})))

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
    (find-metaobject k)))
