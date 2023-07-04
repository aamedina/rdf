(ns net.wikipunk.rdf
  "The Universal Translator

  This namespace provides a set of protocols and functions for working
  with RDF data. This is done by using Apache Jena and Aristotle to
  parse and manipulate RDF data found on the Semantic Web and
  organizing the terms into multimethod hierarchies."
  (:require
   [arachne.aristotle :as a]
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
   [clojure.repl]
   [com.stuartsierra.component :as com]
   [ont-app.vocabulary.lstr :as lstr]
   [net.wikipunk.boot :as boot]
   [net.wikipunk.mop :as mop]
   [taoensso.nippy :as nippy]
   [xtdb.api :as xt]
   [xtdb.node]
   [xtdb.lucene]
   [zprint.core :as zprint]
   [net.wikipunk.ext]
   [net.wikipunk.rdf.rdf]
   [net.wikipunk.rdf.rdfs]
   [net.wikipunk.rdf.owl]
   [net.wikipunk.rdf.xsd]
   [net.wikipunk.rdf.mop])
  (:import
   (org.apache.jena.datatypes BaseDatatype$TypedValue)
   (org.apache.jena.datatypes.xsd XSDDatatype XSDDateTime)
   (org.apache.jena.graph Graph Node Triple Node_URI Node_Literal Node_Variable Node_Blank Node_Triple)
   (org.apache.jena.reasoner ReasonerRegistry)
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

  Adapted from arachne.aristotle.graph/graph->clj")
  (graph [x]
    "Returns Jena Graph from x."))

(defprotocol NamespaceSpitter
  (emit [x arg-map]))

(def ^:dynamic *indexes*
  "A map of useful indexes across metaobjects."
  {})

(def ^:dynamic *ns-aliases*
  "Configured by `make-boot-context` holding a map of namespace
  aliases."
  {})

(def ^:dynamic *ns-prefix* "net.wikipunk.rdf.")
(def ^:dynamic *target* "src/cljc/net/wikipunk/rdf/")

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

    (re-find #"\." (name ident))
    (symbol (str/replace (name ident) #"\." "_"))

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
    :owl/sameAs
    :rdfs/domain
    :rdfs/range
    :skos/broader
    :skos/narrower})

(declare find-ns-metaobject)

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
  ([]
   (->> (all-ns)
        (filter (comp :rdf/type meta))
        (map ns-publics)
        (mapcat vals)
        (filter (comp :rdf/type deref))
        (filter #(some +props+ (keys @%)))
        (filter (comp qualified-keyword? :db/ident deref))
        (pmap (fn [v]
                (reduce (fn [entity term]
                          (if (contains? entity term)
                            (update entity term #(cond (vector? %) % (nil? %) [] :else [%]))
                            entity))
                        (reduce-kv (fn [m k v]
                                     (if (and (qualified-keyword? k)
                                              (not= (namespace k) "mop"))
                                       (assoc m k v)
                                       m))
                                   {} @v)
                        +props+)))))
  ([env]
   (all-ns-metaobjects)))

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
                          (some #{:rdfs/Class :owl/Class :rdfs/Datatype} type)
                          (some #(isa? h % :rdfs/Class) type))
                      (not (some #(isa? h % :rdf/Property) type))
                      (not (some #(isa? h % :owl/NamedIndividual) type)))
               (deriving h entity (concat (filter keyword? type)
                                          (filter keyword? subClassOf)
                                          (filter keyword? equivalentClass)
                                          (filter keyword? (mapcat :owl/unionOf (filter map? subClassOf)))))
               h))
           (make-hierarchy)
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
             :skos/keys [broader narrower member]
             :as        entity}]
       (cond-> h
         (some #(isa? h % :owl/NamedIndividual) type)
         (deriving entity (concat (filter keyword? type)
                                  (filter keyword? subClassOf)))
         
         (seq (remove #{:rdfs/Class :owl/Class} (filter keyword? type)))
         (deriving entity (remove #{:rdfs/Class :owl/Class} (filter keyword? type)))
         
         (or subPropertyOf
             equivalentProperty
             (some #(isa? classes % :rdf/Property) type))
         (deriving entity
                   (distinct
                     (concat (filter keyword? (filter #(isa? classes % :rdf/Property) type))
                             (filter keyword? subPropertyOf)
                             (filter keyword? equivalentProperty))))

         (seq (filter keyword? broader))
         (deriving entity (filter keyword? broader))

         (seq (filter keyword? narrower))
         (as-> h
             (reduce (fn [h child]
                       (try
                         (derive h child ident)
                         (catch Throwable ex
                           h)))
                     h (filter keyword? narrower)))))
     classes
     metaobjects)))

(defn make-hierarchies
  "Returns a map of hierarchies used to derive the `mop/*metaobjects*`
  multimethod hierarchy from a sequence of metaobjects."
  ([] (make-hierarchies (all-ns-metaobjects)))
  ([xs]
   (let [classes     (make-class-hierarchy xs)
         properties  (make-property-hierarchy classes xs)
         metaobjects (make-metaobject-hierarchy classes properties xs)]
     {:classes     classes
      :properties  properties
      :metaobjects metaobjects})))

(defmethod mop/make-hierarchy-using-env :default
  [env]
  (:metaobjects (make-hierarchies)))

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
;; A list of symbols resolving to vars or namespaces with
;; :rdfa/prefix and :rdfa/uri mappings

;; (These vars should exist in in a 'boot' namespace with metadata of
;; {:rdf/type :jsonld/Context} where namespace prefixes for your system
;; should be looked up.)

(defn unroll-langString
  "unrolls ont_app.vocabulary.lstr.LangStr into a string when datafying"
  [form]
  (if (instance? ont_app.vocabulary.lstr.LangStr form)
    (str form "@" (lstr/lang form))
    form))

(defn freezable
  "Ensure the metaobject can be frozen and thawed by Nippy."
  [mo]
  (->> (walk/prewalk unroll-langString (assoc mo :xt/id (:db/ident mo)))
       (walk/postwalk (fn [form]
                        (cond
                          (map? form)
                          (reduce-kv (fn [m k v]
                                       (if (nippy/freezable? v)
                                         (assoc m k v)
                                         m))
                                     {} form)
                          :else form)))))

(declare iri)

(defrecord UniversalTranslator [ns-prefix target boot init-ns conn node config db]
  com/Lifecycle
  (start [this]
    (binding [*ns-prefix* (or ns-prefix *ns-prefix*)
              *target*    (or target *target*)]            
      (let [all-metaobjects               (all-ns-metaobjects)
            node                          (when config (xt/start-node config))
            {:keys [registry ns-aliases]} (make-boot-context)
            {:keys [metaobjects]}         (make-hierarchies all-metaobjects)]
        (alter-var-root #'reg/*registry* (constantly registry))
        (alter-var-root #'*ns-prefix* (constantly (or ns-prefix "net.wikipunk.rdf.")))
        (alter-var-root #'*ns-aliases* (constantly ns-aliases))
        (alter-var-root #'mop/*metaobjects* (constantly metaobjects))        
        (when db
          (alter-var-root #'mop/*env* (constantly db)))
        (when node
          (alter-var-root #'mop/*env* (constantly node)))
        (require (or init-ns 'net.wikipunk.mop.init))
        (alter-var-root #'*indexes* (constantly (setup-indexes metaobjects)))
        (when node
          (try
            (xt/submit-tx node (into []
                                     (map (juxt (constantly ::xt/put) freezable))
                                     all-metaobjects))
            (xt/sync node)            
            (finalize)
            (catch Throwable ex
              (log/error ex))))
        (cond-> this
          node (assoc :node node)))))
  (stop [this]
    (when (instance? java.io.Closeable node)
      (.close ^java.io.Closeable node))
    (assoc this :node nil))

  NamespaceSpitter
  (emit [_ arg-map]
    (binding [*ns-prefix* (or ns-prefix *ns-prefix*)
              *target*    (or target *target*)]
      (emit boot arg-map)))

  xt/DBProvider
  (db [_]
    (xt/db node))
  (db [_ valid-time-or-basis]
    (xt/db node valid-time-or-basis))
  (open-db [_]
    (xt/open-db node))
  (open-db [_ valid-time-or-basis]
    (xt/open-db node valid-time-or-basis))

  xt/PXtdb
  (active-queries [_]
    (xt/active-queries node))
  (attribute-stats [_]
    (xt/attribute-stats node))
  (await-tx [_ tx]
    (xt/await-tx node tx))
  (await-tx [_ tx timeout]
    (xt/await-tx node tx timeout))
  (await-tx-time [_ tx-time]
    (xt/await-tx-time node tx-time))
  (await-tx-time [_ tx-time timeout]
    (xt/await-tx-time node tx-time timeout))
  (latest-completed-tx [_]
    (xt/latest-completed-tx node))
  (latest-submitted-tx [_]
    (xt/latest-submitted-tx node))
  (listen [_ event-opts f]
    (xt/listen node event-opts f))
  (recent-queries [_]
    (xt/recent-queries node))
  (slowest-queries [_]
    (xt/slowest-queries node))
  (status [_]
    (xt/status node))
  (sync [_]
    (xt/sync node))
  (sync [_ timeout]
    (xt/sync node timeout))
  (sync [_ tx-time timeout]
    (xt/sync node tx-time timeout))
  (tx-committed? [_ submitted-tx]
    (xt/tx-committed? node submitted-tx))

  xt/PXtdbDatasource
  (db-basis [_]
    (xt/db-basis (xt/db node)))
  (entity [_ eid]
    (xt/entity (xt/db node) eid))
  (entity-history [_ eid sort-order]
    (xt/entity-history (xt/db node) eid sort-order))
  (entity-history [_ eid sort-order opts]
    (xt/entity-history (xt/db node) eid sort-order opts))
  (entity-tx [_ eid]
    (xt/entity-tx (xt/db node) eid))
  (open-entity-history [_ eid sort-order]
    (xt/open-entity-history (xt/db node) eid sort-order))
  (open-entity-history [_ eid sort-order opts]
    (xt/open-entity-history (xt/db node) eid sort-order opts))
  (open-q* [_ query args]
    (xt/open-q* (xt/db node) query args))
  (pull [_ query eid]
    (xt/pull (xt/db node) query eid))
  (pull-many [_ query eids]
    (xt/pull-many (xt/db node) query eids))
  (q* [_ query args]
    (xt/q* (xt/db node) query args))
  (transaction-time [_]
    (xt/transaction-time (xt/db node)))
  (valid-time [_]
    (xt/valid-time (xt/db node)))
  (with-tx [_ tx-ops]
    (xt/with-tx (xt/db node) tx-ops)))

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

(defmethod print-method org.apache.jena.datatypes.xsd.XSDDuration
  [^org.apache.jena.datatypes.xsd.XSDDuration x ^java.io.Writer writer]
  (print-method (str x) writer))

(defn- lookup-prefix
  "Construct a keyword from an IRI using the prefix tree, returns nil if not possible."
  [registry iri]
  (when-let [prefix (#'reg/longest-prefix (keys registry) iri)]
    (let [fragment (subs iri (count prefix))
          fragment-seq (str/split fragment #"/")
          registration (get registry prefix)
          wild? (= "*" (last registration))]
      (if (not wild?)
        (if (= 1 (count fragment-seq))
          (keyword (str/join "." registration) fragment)
          (keyword (str/join "." registration) (str/join "_SLASH_" fragment-seq)))
        (keyword
          (str/join "." (concat (drop-last registration)
                                (drop-last fragment-seq)))
          (last fragment-seq))))))

(defn kw
  "returns a keyword for IRI accounting for unreadable symbols in
  Clojure"
  [iri]  
  (when-some [k (try
                  (or (-> reg/*registry* :aliases' (get iri))
                      (lookup-prefix (:prefixes' reg/*registry*) iri))
                  (catch Throwable ex
                    (log/warn ex (.getMessage ex))))]
    (cond
      ;; Do not return blank qualified keyword names
      (or (str/blank? (namespace k)) (str/blank? (name k)))
      nil

      ;; ignore unidentified namespaces
      (re-find #"^ns\d*$" (namespace k))
      nil

      (or (= (last (name k)) \/)
          (str/ends-with? (name k) "#"))
      nil

      (str/starts-with? (name k) "#")
      (keyword (namespace k) (str/replace-first (name k) #"^#" ""))

      ;; Since these are not readable wrap in CL-inspired || 
      (or (re-find #"^\d" (name k))
          (re-find #"^[+-]\d" (name k))
          (re-find #"^#" (name k))
          (re-find #"^'" (name k))
          (re-find #":$" (name k)))
      (keyword (namespace k)
               (str \|
                    (if (re-find #"[\s\(\)!,@\"\\~`^;/]" (name k))
                      (java.net.URLEncoder/encode (name k))
                      (name k))
                    \|))

      (or (re-find #"[\s\(\)!,@\"\\~`^;/]" (name k))
          (re-find #"::" (name k)))
      (keyword (namespace k) (java.net.URLEncoder/encode (name k)))

      (re-find #"[\s\(\)!,@\"\\~`^;/]" (java.net.URLDecoder/decode (name k)))
      k

      :else (keyword (namespace k)
                     (try
                       (let [n (java.net.URLDecoder/decode (name k))]
                         (if (or (re-find #"/" n)
                                 (re-find #"[\(\)\"]" n))
                           (name k)
                           n))
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
          (lstr/->LangStr (.getLiteralValue n) lang)
          #_(if (str/starts-with? lang "en")
            (.getLiteralValue n)
            (lstr/->LangStr (.getLiteralValue n) lang))
          (let [value (.getLiteralValue n)]
            (if (instance? BaseDatatype$TypedValue value)
              (.-lexicalValue value)
              value))))
      (catch org.apache.jena.datatypes.DatatypeFormatException ex
        (log/warn (.getMessage ex))
        (str n))))

  Node_Triple
  (data [node]
    (let [triple (.getTriple node)]
      {:rdf/type      :rdf/Statement
       :rdf/subject   (g/data (.getSubject triple))
       :rdf/predicate (g/data (.getPredicate triple))
       :rdf/object    (g/data (.getObject triple))})))

(defn iri
  "returns IRI for ident using aristotle's registry"
  [ident]
  (reg/iri (keyword (namespace ident)
                    (let [n (-> (name ident)
                                (str/replace #"^\|" "")
                                (str/replace #"\|$" "")
                                (str/replace #"_SLASH_" "/"))]
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

(defn- self-ref?
  [triples]
  (some (fn [^Triple t] 
          (= (.getSubject t) (.getObject t))) 
        triples))

(defn parse-with-meta
  "parses graph with ns-prefix-map"
  [g & {:as md}]
  (let [reasoner      (or (:reasoner md) (ReasonerRegistry/getRDFSSimpleReasoner))
        g             (if (instance? org.apache.jena.reasoner.Reasoner reasoner)
                        (.bind reasoner g)
                        g)
        ns-prefix-map (or (:rdf/ns-prefix-map md) ; use explicitly provided ns-prefix-map 
                          (dissoc (cond-> (into {} (.getNsPrefixMap (.getPrefixMapping g)))
                                    (and (:rdfa/prefix md)
                                         (:rdfa/uri md))
                                    (assoc (:rdfa/prefix md) (:rdfa/uri md)))
                                  "ruleml"
                                  "obo1"
                                  "oboInOwl2"
                                  "plugbase"))
        ns-prefix-map (set/rename-keys ns-prefix-map
                                       (cond-> {"sdo" "schema" "dct" "dcterms" "dc" "dc11" "terms" "dcterms" "ns" "vs" "sw" "vs" "s" "rdfs" "dctype" "dcmitype" "dctypes" "dcmitype" "st" "vs" "pwnid" "wn.id" "pwnlemma" "wn.lemma" "pwn30" "wn30"}

                                         (and (contains? ns-prefix-map "")
                                              (:rdfa/prefix md))
                                         (assoc "" (:rdfa/prefix md))))]
    (reg/with ns-prefix-map
              (into (with-meta [] (assoc md :rdf/ns-prefix-map ns-prefix-map))
                    (->> (into [] g)
                         (group-by #(.getSubject ^Triple %))
                         (pmap (fn [[subject triples]]
                                 (let [triples (if (self-ref? triples) 
                                                 (remove (fn [^Triple t] 
                                                           (= (.getSubject t) (.getObject t))) 
                                                         triples) 
                                                 triples)] ; Remove the self-reference triple if it exists.
                                   (into {:db/ident (g/data subject)}
                                         (map (fn [[pred triples]]
                                                (let [k       (g/data pred)
                                                      objects (mapv #(g/data (.getObject ^Triple %)) triples)]
                                                  [k (if (= 1 (count objects))
                                                       (first objects)
                                                       objects)])))
                                         (group-by #(.getPredicate ^Triple %) triples))))))))))

(def ^:dynamic *graph*
  "Bound to the apache jena graph during parsing."
  nil)

(extend-protocol Parsable
  clojure.lang.IPersistentMap
  (parse [md]
    (binding [*graph* (graph md)]
      (parse-with-meta *graph* md)))
  (graph [md]
    (let [{:rdfa/keys [uri prefix]
           :vann/keys [preferredNamespacePrefix preferredNamespaceUri]
           :dcat/keys [downloadURL]
           :rdf/keys  [value]
           :keys      [format]} md
          parser                (if value
                             (doto (RDFParser/fromString value)
                               (.lang (get a/formats (or format :ttl))))
                             (RDFParser/source (or downloadURL uri)))]
      (try
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
                  ;; ...try N3?
                  (try
                    (.toGraph (doto parser (.lang Lang/N3)))
                    (catch org.apache.jena.riot.RiotException ex
                      ;; ...try JSONLD?
                      (.toGraph (doto parser (.lang Lang/JSONLD)))))))))))))

  clojure.lang.Keyword
  (parse [ident]
    (when-some [url (iri ident)]
      (parse {:rdfa/prefix      (namespace ident)
              :dcat/downloadURL url})))
  (graph [ident]
    (when-some [url (iri ident)]
      (graph {:rdfa/prefix      (namespace ident)
              :dcat/downloadURL url})))

  clojure.lang.Named
  (parse [ident]
    (if (qualified-ident? ident)
      (some-> (resolve ident) deref parse)
      (some-> (find-ns ident) meta parse)))
  (graph [ident]
    (if (qualified-ident? ident)
      (some-> (resolve ident) deref graph)
      (some-> (find-ns ident) meta graph)))

  clojure.lang.Namespace
  (parse [ns]
    (parse (meta ns)))
  (graph [ns]
    (graph (meta ns)))

  String
  (parse [s]
    (if (or (str/starts-with? s "http")
            (str/starts-with? s "/"))
      (parse {:dcat/downloadURL s})
      (parse {:rdf/value s})))
  (graph [s]
    (if (or (str/starts-with? s "http")
            (str/starts-with? s "/"))
      (graph {:dcat/downloadURL s})
      (graph {:rdf/value s})))

  java.net.URI
  (parse [uri]
    (parse {:dcat/downloadURL (str uri)}))
  (graph [uri]
    (graph {:dcat/downloadURL (str uri)}))

  java.net.URL
  (parse [url]
    (parse {:dcat/downloadURL (str url)}))
  (graph [url]
    (graph {:dcat/downloadURL (str url)}))

  Graph
  (parse [g]
    (binding [*graph* g]
      (parse-with-meta g nil)))
  (graph [g] g))

(def mem-parse (memo/memo parse))

(defn walk-blanks
  "Replaces blank nodes with their values."
  ([index form]
   (walk-blanks index form #{:rdfs/subClassOf :rdfs/subPropertyOf}))
  ([index form keys]
   (if-some [_ (:rdf/blank form)]
     (let [node (get index form)]
       (reduce (fn [n k]
                 (if (contains? n k)
                   (let [value     (get n k)
                         new-value (cond
                                     (= value form)
                                     nil
                                     (when (sequential? value)
                                       (some #(= form %) value))
                                     (not-empty (into [] (remove #(= form %) value)))
                                     :else value)]
                     (if (nil? new-value)
                       (dissoc n k)
                       (assoc n k new-value)))
                   n))
               node
               keys))
     form)))

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
      (decimal? n)
      {:xsd/decimal n}
      (integer? n)
      {:xsd/integer (bigint n)}
      :else {:owl/real (bigdec n)}))

  String
  (box [s]
    (if (str/starts-with? s "http")
      {:rdfa/uri s}
      {:xsd/string s}))

  clojure.lang.Sequential
  (box [xs]
    (mapv box xs))

  clojure.lang.IPersistentMap
  (box [m]
    ;; special case coerce these to doubles 
    (if (some #{:xsd/minExclusive :xsd/minInclusive
                :xsd/maxExclusive :xsd/maxInclusive
                :jsonschema/maximum :jsonschema/minimum :jsonschema/multipleOf
                :jsonschema/exclusiveMaximum :jsonschema/exclusiveMinimum}
              (keys m))
      (reduce #(update %1 %2 (fn [x]
                               (if (string? x)
                                 (try
                                   (double (Long/parseLong x))
                                   (catch Throwable ex
                                     (try
                                       (Double/parseDouble x)
                                       (catch Throwable ex
                                         (double (read-string (str "0x" x)))))))
                                 (double x))))
              m (filter #{:xsd/minExclusive :xsd/minInclusive
                          :xsd/maxExclusive :xsd/maxInclusive
                          :jsonschema/maximum :jsonschema/minimum :jsonschema/multipleOf
                          :jsonschema/exclusiveMaximum :jsonschema/exclusiveMinimum}
                        (keys m)))
      m))

  Object
  (box [o] o)

  nil
  (box [_] :rdf/nil))

(defn box-value
  [form f k]
  (f form k box))

(defmulti box-values
  "Boxes multi-value typed literals for Datomic :db.type/ref."
  mop/type-of
  :hierarchy #'mop/*metaobjects*)

(defmethod box-values :default
  [form]
  (if (map? form)
    (cond-> (box form)
      (:owl/deprecated form)
      (update :owl/deprecated boolean)
      
      (some? (:owl/hasValue form))
      (box-value update :owl/hasValue)

      (some? (:rdf/value form))
      (box-value update :rdf/value)

      (some? (:qudt/value form))
      (box-value update :qudt/value)

      (some? (:qudt/conversionMultiplier form))
      (box-value update :qudt/conversionMultiplier)

      (some? (:qudt/conversionOffset form))
      (box-value update :qudt/conversionOffset)

      (some? (:qudt/dimensionExponentForLength form))
      (box-value update :qudt/dimensionExponentForLength)

      (some? (:qudt/dimensionExponentForMass form))
      (box-value update :qudt/dimensionExponentForMass)

      (some? (:qudt/dimensionExponentForAmountOfSubstance form))
      (box-value update :qudt/dimensionExponentForAmountOfSubstance)

      (some? (:qudt/dimensionExponentForElectricCurrent form))
      (box-value update :qudt/dimensionExponentForElectricCurrent)

      (some? (:qudt/dimensionExponentForLuminousIntensity form))
      (box-value update :qudt/dimensionExponentForLuminousIntensity)

      (some? (:qudt/dimensionExponentForThermodynamicTemperature form))
      (box-value update :qudt/dimensionExponentForThermodynamicTemperature)

      (some? (:qudt/dimensionExponentForTime form))
      (box-value update :qudt/dimensionExponentForTime)
      
      (some? (:dtype/value form))
      (box-value update :dtype/value)

      (seq (:owl/oneOf form))
      (box-value update :owl/oneOf)

      (seq (:owl/withRestrictions form))
      (box-value update :owl/withRestrictions)

      (some? (:jsonschema/default form))
      (box-value update :jsonschema/default)

      (some? (:jsonschema/const form))
      (box-value update :jsonschema/const)

      (some? (:d3f/version form))
      (box-value update :d3f/version))
    form))

(def ^:dynamic *recurse* 2)

(def ^:dynamic *private*
  "bind to true if you want private vars to be emitted"
  nil)

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
                                     
                                     (and (string? k) (not (contains? v :rdfa/uri)))
                                     (assoc v :rdfa/uri k)

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
                        (keep (some-fn :madsrdf/hasMADSSchemeMember
                                       :skos/member
                                       :skos/broader))
                        (mapcat (fn [x] (if (sequential? x) x [x])))
                        (distinct)
                        (pmap (fn [ident]
                                (when (and (keyword? ident)
                                           (not (contains? index ident))
                                           (pos? *recurse*))
                                  (try
                                    (binding [*recurse* (dec *recurse*)]
                                      (when-some [x (sniff ident)]
                                        (let [md (meta x)]
                                          (into [(with-meta x {})]
                                                (map #(with-meta % {}))
                                                (vals (dissoc md
                                                              :dcat/downloadURL
                                                              :rdf/ns-prefix-map
                                                              :rdfa/prefix))))))
                                    (catch Throwable ex
                                      (log/error ex ident (.getMessage ex))
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
                                  (some #(or (isa? mop/*metaobjects* % :owl/Ontology)
                                             (isa? mop/*metaobjects* % :voaf/Vocabulary)
                                             (isa? mop/*metaobjects* % :madsrdf/MADSScheme))
                                        (if (coll? (:rdf/type form))
                                          (:rdf/type form)
                                          [(:rdf/type form)])))))
        the-ont    (or (first ontologies)
                       (first (filter :rdfa/uri (remove public? forms))))
        forms      (filter #(keyword? (:db/ident %)) forms)
        publics    (filter public? forms)
        privates   (->> (remove public? forms)
                        (remove (fn [form]
                                  (contains? #{"rdf" "rdfs" "owl" "xsd" "dcterms" "dc11"}
                                             (namespace (:db/ident form)))))
                        (pmap #(assoc % :private true)))]
    (with-meta (into (vec (sort-by :db/ident publics))
                     (when *private* (sort-by :db/ident privates)))
      (merge md the-ont))))

(defn rdf-doc
  "Returns docstring for v."
  [v]  
  (let [docstring (or (some-> (:db/doc v))
                      (:lv2/documentation v)
                      (:dcterms/abstract v)
                      (:dcterms/description v)
                      (:dc11/description v)
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
                      (first (or (get (group-by lstr/lang (remove string? docstring)) "en")
                                 (get (group-by lstr/lang (remove string? docstring)) "en-US")
                                 (seq (filter string? docstring)))))
                    docstring)
        docstring (if (map? docstring)
                    (:rdf/value docstring "")
                    docstring)
        docstring (when docstring
                    (str/trim (str/replace docstring #"\s+" " ")))]
    docstring))

(defn unroll-ns
  "Walks the parsed RDF model and replaces references to blank nodes
  with their data. Also unrolls lists."
  [model]
  (let [model-meta (map meta model)
        forms      (unroll-forms model)
        md         (meta forms)
        forms      (->> forms
                        ;; todo: refactor this into a multimethod
                        (pmap (fn [form]
                                (if (and (pos? *recurse*)
                                         (some #(or (isa? mop/*metaobjects* % :skos/Concept)
                                                    (isa? mop/*metaobjects* % :skos/ConceptScheme))
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
                                      (log/error (:db/ident form) (.getMessage ex))
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

                                            (re-find #"\." (name sym))
                                            (symbol (str/replace (name sym) #"\." "_"))

                                            :else sym)
                                      sym       (if (:private v) (with-meta sym {:private true}) sym)
                                      v         (if (:private v) (dissoc v :private) v)
                                      docstring (rdf-doc v)  
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
                                    (first (or (get (group-by lstr/lang (remove string? docstring)) "en")
                                               (get (group-by lstr/lang (remove string? docstring)) "en-US")
                                               (seq (filter string? docstring)))))
                                  docstring)
                      docstring (if (map? docstring)
                                  (:rdf/value docstring)
                                  docstring)
                      docstring (when docstring
                                  (str/trim (str/replace docstring #"\s+" " ")))]
                  (when docstring
                    [docstring]))              
              ~(dissoc (cond-> md
                         (:lv2/project md)
                         (update :lv2/project #(dissoc % :lv2/documentation)))
                       :doc)
              ~@(when (seq exclusions)
                  [(list :refer-clojure :exclude exclusions)]))
            forms)
      forms)))

(def mem-unroll
  (memo/memo unroll-forms))

(defn emit-ns
  "Emits a model to a Clojure namespace using metadata map."
  [model md arg-map]
  (if-some [prefix (or (:prefix arg-map)
                       (:rdfa/prefix md)
                       (:vann/preferredNamespacePrefix md))]
    (spit (str (or (:target arg-map) *target*)
               (namespace-munge (str/replace prefix #"\." "/"))
               ".cljc")
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
    (zprint/zprint (unroll-forms model))))

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
    (when-some [x (if (qualified-ident? n)
                    (some-> (resolve (symbol n)) deref)
                    (find-ns (symbol n)))]
      (emit x arg-map)))
  
  clojure.lang.IPersistentMap
  (emit [x arg-map]
    (let [model (parse x)
          md    (meta model)]
      (emit-ns model md arg-map)))

  clojure.lang.Namespace
  (emit [ns arg-map]
    (emit (filter (some-fn :dcat/downloadURL :rdfa/uri) (map deref (vals (ns-publics ns)))) arg-map)))

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

(defn find-ns-metaobject
  "Finds a metaobject by namespace-qualified keyword identity by
  looking up its namespace in the system's registry and attempting to
  resolve the name as a Var in that namespace, requiring it when
  necessary."
  [ident]
  (when (qualified-keyword? ident)
    (when-some [var (if (= (namespace ident) "obo")
                      (find-obo-metaobject ident)
                      (or (try
                            (requiring-resolve
                              (symbol (str (or (get *ns-aliases* (namespace ident))
                                               (get (ns-aliases *ns*) (symbol (namespace ident)))))
                                      (name (unmunge ident))))
                            (catch java.io.FileNotFoundException ex nil))
                          (some-> (find-ns (symbol (namespace ident)))
                                  (ns-name)
                                  (as-> ns-name
                                      (ns-resolve ns-name (unmunge ident))))
                          (try
                            (as-> (symbol (str *ns-prefix* (namespace ident))) ns-name
                              (doto ns-name (require))
                              (when (find-ns ns-name)
                                (ns-resolve ns-name (unmunge ident))))
                            (catch java.io.FileNotFoundException _ nil))
                          (try
                            (as-> (symbol (str "net.wikipunk.rdf." (namespace ident))) ns-name
                              (doto ns-name (require))
                              (when (find-ns ns-name)
                                (ns-resolve ns-name (unmunge ident))))
                            (catch java.io.FileNotFoundException _ nil))))]
      (with-meta @var {:var var :type (or (and (keyword? (type var))
                                               (type var))
                                          (:type (alter-meta! var assoc :type (mop/type-of @var)))
                                          :rdfs/Resource)}))))

(defn print-doc
  "Prints documentation from metadata on a metaobject's var"
  [ident]
  (when-some [metaobject (mop/find-class ident)]
    (println "-------------------------")
    (println (:db/ident metaobject))
    (when-some [doc (rdf-doc metaobject)]
      (println "  " doc))
    (when-some [supers (next (mop/compute-class-precedence-list metaobject))]
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
    
    (map? x) (into #{} (or (:owl/unionOf x)
                           (:owl/oneOf x)
                           (some-> (:owl/intersectionOf x) (hash-set))))
    
    (coll? x) (into #{} (mapcat unroll-term) x)

    :else #{}))

(defn direct-slot-definition
  [x]
  (reduce (fn [mo term]
            (if (contains? mo term)
              (let [mo' (update mo term unroll-term)]
                (if (get mo' term)
                  mo'
                  (dissoc mo' term)))
              mo))
          (set/rename-keys
            (cond
              (qualified-keyword? x)
              (mop/find-class x)
              (map? x)
              x
              :else (throw (ex-info "cannot coerce x to direct-slot-definition" {:x x})))
            {:schema/domainIncludes :rdfs/domain
             :schema/rangeIncludes  :rdfs/range})
          [:rdf/type
           :rdfs/domain
           :rdfs/range
           :rdfs/subPropertyOf]))

(defn setup-indexes
  ([]
   (setup-indexes mop/*metaobjects*))
  ([h]
   (let [slots (into []
                     (comp
                       (filter #(some #{:owl/ObjectProperty
                                        :owl/DatatypeProperty
                                        :owl/AnnotationProperty
                                        :owl/TransitiveProperty
                                        :owl/SymmetricProperty
                                        :owl/FunctionalProperty
                                        :rdf/Property}
                                      (:rdf/type %))))
                     (pmap direct-slot-definition (descendants h :rdf/Property)))]
     {:slots/by-domain
      (reduce-kv (fn [m domain slots]
                   (reduce (fn [m k]
                             (update m k (fnil into #{}) slots))
                           m domain))
                 {}
                 (group-by :rdfs/domain slots))})))


(defn finalize
  "Finalizes all of the loaded classes."
  ([]
   (finalize true (conj (descendants mop/*metaobjects* :rdfs/Class) :rdfs/Class)))
  ([force? metaobjects]
   (dorun
     (pmap (fn [ident]
             (if-some [mo (mop/find-class ident)]
               (try
                 (when (or force? (not (mop/class-finalized? mo)))
                   (mop/finalize-inheritance mo))
                 (catch Throwable ex
                   (throw (ex-info "Could not finalize inheritance for metaobject" {:ident ident} ex))))
               (throw (ex-info "Could not locate metaobject" {:ident ident}))))
           metaobjects))))

(def ^:dynamic ^:deprecated *datafy-mop* true)

(extend-protocol clojure.core.protocols/Datafiable
  clojure.lang.Named
  (datafy [ident]
    (cond
      (qualified-keyword? ident)
      (not-empty (reduce-kv (fn [m k v]
                              (if (qualified-keyword? k)
                                (case k
                                  (:mop/classDirectSlots                                     
                                   :mop/classSlots)
                                  (if (seq v)
                                    (assoc m k (mapv (some-fn :db/ident identity) v))
                                    m)

                                  (:mop/classDefaultInitargs
                                   :mop/classDirectDefaultInitargs
                                   :mop/classPrototype)
                                  m

                                  :mop/classDirectSubclasses
                                  (if (seq v)
                                    (assoc m k v)
                                    m)

                                  (assoc m k v))
                                m))
                            {} (dissoc (mop/find-class ident) :xt/id)))

      (qualified-symbol? ident)
      (resolve ident)

      :else (find-ns (symbol ident)))))

(extend-protocol LinkedData
  clojure.lang.Sequential
  (sniff [coll]
    (pmap #(sniff %) coll))

  String
  (sniff [s]
    (if (or (str/starts-with? s "http")
            (str/starts-with? s "/"))      
      (sniff {:dcat/downloadURL s})
      (let [model (sniff {:rdf/value s})]
        (with-meta (into [] (map #(dissoc % :private)) model) (meta model)))))
  
  clojure.lang.IPersistentMap
  (sniff [m]
    (let [model (mem-parse m)]
      (with-meta (into [] (map #(dissoc % :private)) (unroll-forms model)) (meta model))))

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

  java.net.URI
  (sniff [uri]
    (sniff {:dcat/downloadURL (str uri)}))

  java.net.URL
  (sniff [url]
    (sniff {:dcat/downloadURL (str url)}))

  nil
  (sniff [_] nil))

(defmulti import-from
  "Import metaobjects `from` into `to`"
  (fn [from to]
    [(mop/type-of from) (mop/type-of to)])
  :hierarchy #'mop/*metaobjects*)

(defmethod import-from [String String]
  [from to]
  (import-from (symbol (str *ns-prefix* from))
               (symbol (str *ns-prefix* to))))

(defmethod import-from [clojure.lang.Symbol clojure.lang.Symbol]
  [from to]
  (require from to)
  (import-from (find-ns from) (find-ns to)))

(defmethod import-from [clojure.lang.Namespace clojure.lang.Namespace]
  [from to]
  (->> (vals (ns-map from))
       (filter (comp :private meta))
       (filter (comp (partial = (:rdfa/prefix (meta to))) namespace :db/ident deref))
       (run! (fn [v]
               (intern to
                       (:name (meta v))
                       (merge (some-> (get (ns-publics to) (:name (meta v))) deref) @v))))))

(defn parse-rdf*
  "Parse RDF* metadata from x."
  [x]
  (let [model (parse x)]
    (->> (group-by (comp :rdf/subject :db/ident) model)
         (reduce-kv (fn [forms k v]
                      (conj forms (reduce (fn [m x]
                                            (-> m
                                                (assoc (:rdf/predicate (:db/ident x))
                                                       (:rdf/object (:db/ident x)))
                                                (vary-meta assoc
                                                           [(:rdf/subject (:db/ident x))
                                                            (:rdf/predicate (:db/ident x))
                                                            (:rdf/object (:db/ident x))]
                                                           (dissoc x :db/ident))))
                                          {:db/ident k}
                                          v)))
                    (with-meta [] (meta model))))))

(defn emit-rdf*
  "Emit Clojure namespace with subjects annotated with metadata using
  RDF*.

  You may have to add :refer-clojure :exclude [exclusions] to
  generated ns metadata."
  [x & {:as arg-map}]
  (let [model (parse-rdf* x)
        md    (meta model)]
    (if-some [prefix (or (:prefix arg-map)
                         (:rdfa/prefix md)
                         (:vann/preferredNamespacePrefix md))]
      (spit (str (or (:target arg-map) *target*)
                 (namespace-munge (str/replace prefix #"\." "/"))
                 ".cljc")
            (binding [*print-namespace-maps* nil
                      *print-meta*           true]
              (let [forms (cons `(~'ns ~(symbol (str *ns-prefix* prefix))
                                  ~(or (:doc md) "RDF*")
                                  ~(merge md arg-map))
                                (map (fn [m]
                                       (list 'def (with-meta (symbol (name (:db/ident m))) (meta m)) m))
                                     model))]
                (with-out-str
                  (doseq [form forms]
                    (zprint/zprint form {:map    {:justify?      true
                                                  :nl-separator? false
                                                  :hang?         true
                                                  :indent        0
                                                  :sort-in-code? true
                                                  :force-nl?     true}
                                         :vector {:wrap? false}})
                    (newline))))))
      (zprint/zprint model))))

(extend-protocol arachne.aristotle.graph/AsNode
  clojure.lang.BigInt
  (node [obj]
    (arachne.aristotle.graph/node (bigdec obj))))

(defn ns-graph
  "Return a graph of all the namespaces in the current system."
  ([]
   (ns-graph (a/graph :simple)))
  ([g]
   (a/add g
          (walk/postwalk (fn [form]
                           (if (map? form)
                             (reduce-kv (fn [m k v]
                                          (if (qualified-keyword? k)
                                            (assoc m k (if (when-some [d (:rdfs/range (try
                                                                                        (datafy k)
                                                                                        (catch Throwable ex
                                                                                          (log/error "could not datafy" k))))]
                                                             (some #(isa? % :rdf/List) (if (coll? d) d [d])))
                                                         (g/rdf-list v)
                                                         v))
                                            m))
                                        {} form)
                             form))
                         (all-ns-metaobjects)))))

(defn ns-idents
  "Returns a set of keywords used in the public metaobjects of this namespace."
  [ns]
  (let [idents (volatile! #{})]
    (run! (fn [mo]
            (walk/prewalk (fn [form]
                            (if (and (qualified-keyword? form)
                                     (iri form))
                              (do
                                (vswap! idents conj form)
                                form)
                              form))
                          mo))
          (map deref (vals (ns-publics ns))))
    @idents))
