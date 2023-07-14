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
  "This is a protocol for parsing RDF models. 

  Usually, the input is a map like so:

  The :rdfa/uri is used to download the model is a :dcat/downloadURL
  is not provided. The :rdfa/prefix is used to bind @base URI of the
  RDF model to that prefix.

  {:rdfa/uri \"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" 
   :rdfa/prefix \"rdf\" 
   ;; used to override the :rdfa/uri for downloading a RDF model
   :dcat/downloadURL \"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" 
   ;; optionally force Jena to parse a specific format
   :format :turtle 
   ;; optional and used to override the models
   specified prefixes which becomes invaluable when the source model
   has odd prefixes for standard vocabularies
   :rdf/ns-prefix-map {...}}

  (Note: not all keys are required. You can try just passing the URL
  of the model.)"
  (parse [x]
    "Parses source using Apache Jena's RDFParser and converts it to
  Clojure data using Aristotle.

  Adapted from arachne.aristotle.graph/graph->clj

 Options:
 :emit -- set to false to prevent emitting the namespace
 :recurse -- set to number of recursive calls you are willing to make for linked data
 :reasoner -- set to your preferred org.apache.jena.reasoner.Reasoner
 instance or nil for no reasoning (defaults to RDFSSimpleReasoner)
 :private -- set to truthy value to emit ^:private vars, but inspect
 the namespace after to make sure there are no var name conflicts
 :slash -- If a vocab term has a slash in its name you should set this to true (edge case for D3FEND).")
  (graph [x]
    "Returns Jena Graph from x.")
  (sniff [x]
    "Follow your nose.")
  (emit [x arg-map]
    "Write Clojure namespace after parsing x with arg-map."))

(def ^:dynamic *metaobjects*
  "Contains a map of multimethod hierarchies derived from loaded
  metaobjects when the Universal Translator was started."
  nil)

(def ^:dynamic *ns-aliases*
  "Configured by `make-boot-context` holding a map of namespace
  aliases mapping prefixes to delays which when dereferenced return a
  Clojure namespace or nil if none could be found."
  {})

(def ^:dynamic *ns-prefix* "net.wikipunk.rdf.")
(def ^:dynamic *target* "src/cljc/net/wikipunk/rdf/")

(def ^:dynamic *slash*
  "generate keywords with _SLASH_ in name (used for D3FEND)"
  nil)

(def ^:dynamic *graph*
  "Bound to the apache jena graph during parsing."
  nil)

(def ^:dynamic *recurse* 2)

(def ^:dynamic *private*
  "bind to true if you want private vars to be emitted"
  nil)

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

(defn ns-contexts
  "Returns a sequence of Clojure namespaces that are JSON-LD
  contexts.

  Namespaces which are JSON-LD contexts contain public vars which
  correspond to e.g, :rdfa/PrefixMapping instances to declare prefix
  mappings for each context.

  (ns your.namespace.boot
    {:rdf/type :jsonld/Context})

  (def preferredNamespacePrefix
    {:rdf/type :rdfa/PrefixMapping
     :rdfa/prefix \"preferredNamespacePrefix\"
     :rdfa/uri \"preferredNamespaceURI\"}"
  []
  (filter #(isa? (mop/type-of (meta %)) :jsonld/Context) (all-ns)))

(defn make-boot-context
  "A function which configures an Aristotle registry for bootstrapping
  RDF data.

  For each JSON-LD context namespace you require before calling this
  function, its public vars are enumerated declaring what prefix
  mappings are being \"booted\" by this context.

  The name of the namespace is used to resolve the Clojure namespaces
  emitted from these prefix mappings."
  []
  (let [ns-prefixes (->> (ns-contexts)
                         (map #(str (str/join "." (pop (str/split (str %) #"\."))) ".rdf"))
                         (distinct))]
    (transduce
      (comp
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
                               (delay
                                 (some (fn [ns-prefix]
                                         (let [ns-name (symbol (str ns-prefix "." prefix))]
                                           (try
                                             (require ns-name)
                                             (find-ns ns-name)
                                             (catch java.io.FileNotFoundException ex
                                               nil))))
                                       ns-prefixes))))))))
      {:registry   (reg/add-prefix {:prefixes  {}
                                    :prefixes' {}
                                    :aliases   {}
                                    :aliases'  {}}
                                   true
                                   "dcterms"
                                   "http://purl.org/dc/terms/")
       :ns-aliases {}}
      (ns-contexts))))

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
    :schema/domainIncludes
    :schema/rangeIncludes
    :skos/broader
    :skos/narrower})

(defmulti all-metaobjects
  "A multimethod to enable finding all metaobjects in an environment. 

  By default Clojure namespaces are searched."
  (fn [env] (mop/type-of env)))

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

(defmethod all-metaobjects :default
  [_]
  (all-ns-metaobjects))

(defn make-class-hierarchy
  "The make-class-hierarchy function creates a hierarchy of classes
  based on the :rdf/type metadata for all namespaces in the current
  Clojure environment. 

  The resulting class hierarchy is returned."
  ([]
   (make-class-hierarchy (all-metaobjects mop/*env*)))
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
                                          (filter keyword? (mapcat (some-fn :owl/unionOf :owl/intersectionOf)
                                                                   (filter map? subClassOf)))))
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
   (make-property-hierarchy classes (all-metaobjects mop/*env*)))
  ([classes metaobjects]
   (reduce
     (fn [h {:db/keys     [ident]
             :rdf/keys    [type]
             :rdfs/keys   [subPropertyOf domain range]
             :schema/keys [domainIncludes rangeIncludes]
             :owl/keys    [equivalentProperty]
             :as          entity}]
       (cond-> h
         (or subPropertyOf
             equivalentProperty
             (some #(isa? classes % :rdf/Property) type))
         (deriving entity (concat (filter keyword? (filter #(isa? classes % :rdf/Property) type))
                                  (filter keyword? subPropertyOf)
                                  (filter keyword? equivalentProperty)))))
     (make-hierarchy)
     metaobjects)))

(defn make-domain-hierarchy
  "Creates a multimethod hierarchy deriving named classes which are
  declared in the :rdfs/domain or :schema/domainIncludes of some
  :rdf/Property."
  ([classes]
   (make-domain-hierarchy classes (all-metaobjects mop/*env*)))
  ([classes metaobjects]
   (reduce
     (fn [h {:db/keys     [ident]
             :rdf/keys    [type]
             :rdfs/keys   [subPropertyOf domain range]
             :schema/keys [domainIncludes rangeIncludes]
             :owl/keys    [equivalentProperty]
             :as          entity}]
       (let [domain'     (concat domain domainIncludes)
             domain-keys (filter keyword? domain')]
         (cond-> h
           (or domain domainIncludes)
           (deriving entity (concat domain-keys
                                    (->> (remove keyword? domain')
                                         (keep (some-fn :owl/unionOf :owl/intersectionOf))
                                         (filter keyword?)))))))
     (make-hierarchy)
     (filter (some-fn :rdfs/domain :schema/domainIncludes) metaobjects))))

(defn make-range-hierarchy
  "Creates a multimethod hierarchy deriving named classes which are
  declared in the :rdfs/range or :schema/rangeIncludes of some
  :rdf/Property."
  ([classes]
   (make-range-hierarchy classes (all-metaobjects mop/*env*)))
  ([classes metaobjects]
   (reduce
     (fn [h {:db/keys     [ident]
             :rdf/keys    [type]
             :rdfs/keys   [subPropertyOf domain range]
             :schema/keys [domainIncludes rangeIncludes]
             :owl/keys    [equivalentProperty]
             :as          entity}]
       (cond-> h
         (or range rangeIncludes)
         (deriving entity (filter keyword? (concat range rangeIncludes)))))
     (make-hierarchy)
     (filter (some-fn :rdfs/range :schema/rangeIncludes) metaobjects))))

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
   (make-metaobject-hierarchy classes properties (all-metaobjects mop/*env*)))
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
  "Returns a map of hierarchies used to derive the global multimethod
  hierarchy from a sequence of metaobjects."
  ([] (make-hierarchies (all-metaobjects mop/*env*)))
  ([xs]
   (let [classes     (make-class-hierarchy xs)
         properties  (make-property-hierarchy classes xs)
         metaobjects (make-metaobject-hierarchy classes properties xs)]
     {:rdfs/Resource metaobjects
      :rdfs/Class    classes
      :rdf/Property  properties
      :rdfs/domain   (make-domain-hierarchy classes xs)
      :rdfs/range    (make-range-hierarchy classes xs)})))

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

(defn unroll-tagged-literals
  "unrolls tagged-literals forms"
  [form]
  (if (tagged-literal? form)
    (:form form)
    form))

(defn freezable
  "Ensure the metaobject can be frozen and thawed by Nippy."
  [mo]
  (->> (assoc mo :xt/id (:db/ident mo))
       (walk/prewalk unroll-langString)
       (walk/prewalk unroll-tagged-literals)
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
      (require (or init-ns 'net.wikipunk.mop.init))
      (let [all                           (all-metaobjects (when-not node
                                                             ;; when a :db has been provided and we are not bootstrapping with XTDB then use the :db as the environment to find metaobjects
                                                             db))
            node                          (when config (xt/start-node config))
            {:keys [registry ns-aliases]} (make-boot-context)
            hierarchies                   (make-hierarchies all)]
        (alter-var-root #'reg/*registry* (constantly registry))
        (alter-var-root #'*ns-prefix* (constantly (or ns-prefix "net.wikipunk.rdf.")))
        (alter-var-root #'*ns-aliases* (constantly ns-aliases))        
        (alter-var-root #'*metaobjects* (constantly hierarchies))
        (alter-var-root #'clojure.core/global-hierarchy (constantly (:rdfs/Resource hierarchies)))
        (when db
          (alter-var-root #'mop/*env* (constantly db)))
        (when node
          (alter-var-root #'mop/*env* (constantly node)))        
        (when node
          (try
            (xt/submit-tx node (into []
                                     (map (juxt (constantly ::xt/put) freezable))
                                     all))
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

  LinkedData
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

(defmethod print-method ont_app.vocabulary.lstr.LangStr
  [^ont_app.vocabulary.lstr.LangStr literal ^java.io.Writer w]
  (.write w (pr-str (tagged-literal 'xsd/langString  (str literal "@" (.lang literal))))))

(defn- lookup-prefix
  "Construct a keyword from an IRI using the prefix tree, returns nil if not possible."
  [registry iri]
  (when-let [prefix (#'reg/longest-prefix (keys registry) iri)]
    (let [fragment     (subs iri (count prefix))
          fragment-seq (str/split fragment #"/")
          registration (get registry prefix)
          wild?        (= "*" (last registration))]
      (if (not wild?)
        (if (= 1 (count fragment-seq))
          (keyword (str/join "." registration) fragment)
          (when *slash*
            (keyword (str/join "." registration) (str/join "_SLASH_" fragment-seq))))
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

(extend-protocol arachne.aristotle.graph/AsNode
  clojure.lang.BigInt
  (node [obj]
    (org.apache.jena.graph.NodeFactory/createLiteralByValue (biginteger obj) XSDDatatype/XSDinteger)))

(defmulti rdf-literal
  "When parsing org.apache.jena.graph.Node_Literal instances construct
  an appropriate tagged literal so that Clojure can read and write
  values of this type.

  Idea: Support reading tagged RDF literals by binding to preferred
  `clojure.core/*data-readers*`."
  (fn [^Node_Literal node]
    (if-some [uri (.getLiteralDatatypeURI node)]
      (kw uri)
      (class (.getLiteralValue node)))))

(defmethod rdf-literal :rdf/langString
  [^Node_Literal node]
  (lstr/->LangStr (.getLiteralValue node) (.getLiteralLanguage node)))

(defmethod rdf-literal :xsd/anyURI
  [^Node_Literal node]
  {:rdfa/uri (.getLiteralValue node)})

(defmethod rdf-literal :default
  [^Node_Literal node]
  (let [uri (.getLiteralDatatypeURI node)]
    (if (instance? BaseDatatype$TypedValue (.getLiteralValue node))
      (tagged-literal (symbol (kw uri)) (.-lexicalValue (.getLiteralValue node)))
      (tagged-literal (symbol (kw uri)) (.getLiteralValue node)))))

(extend-protocol g/AsClojureData
  Node_URI
  (data [n]
    (let [uri (.getURI n)]
      (or (kw uri) {:rdfa/uri uri})))

  Node_Blank
  (data [n]
    {:db/id (.getLabelString (.getBlankNodeId n))})

  Node_Literal
  (data [n]
    (rdf-literal n))

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
  (assert @(get *ns-aliases* (namespace ident))
          (str ident ": the namespace has not been booted by a JSON-LD context"))
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
  (let [reasoner      (:reasoner md (ReasonerRegistry/getRDFSSimpleReasoner))
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
                                                 triples) ; Remove the self-reference triple if it exists.
                                       iri     (g/data subject)] 
                                   (into (cond
                                           (keyword? iri)
                                           {:db/ident iri}
                                           (map? iri)
                                           iri
                                           (and (string? iri) (str/starts-with? iri "http"))
                                           {:rdfa/uri iri}
                                           (string? iri)
                                           {:db/id iri}
                                           :else (throw (ex-info "Could not generate IRI for Node." {:subject iri})))
                                         (map (fn [[pred triples]]
                                                (let [k       (g/data pred)
                                                      objects (mapv #(g/data (.getObject ^Triple %)) triples)]
                                                  [k (if (= 1 (count objects))
                                                       (first objects)
                                                       objects)])))
                                         (group-by #(.getPredicate ^Triple %) triples))))))))))

(def mem-parse (memo/memo parse))

(defn bnode?
  "Checks if a value is a blank node."
  [val]
  (and (map? val) (:db/id val)))

(defn get-definition
  "Retrieves the definition of a blank node from the graph."
  [graph bnode-id]
  (some #(= (:db/id %) bnode-id) graph))

(defn replace-bnode
  "Replaces a blank node with its definition, if it exists."
  [graph node]
  (if (bnode? node)
    (or (get-definition graph (:db/id node)) node)
    node))

(defn replace-bnodes-in-val
  "Replaces all blank nodes in a value with their definitions."
  [graph val]
  (cond
    (vector? val) (mapv #(replace-bnodes-in-val graph %) val)
    (bnode? val)  (replace-bnode graph val)
    :else         val))

(defn replace-bnodes
  "Replaces all blank nodes recursively with their definitions."
  [graph]
  (let [bnode-definitions (into {} (map (juxt :db/id identity) graph))]
    (walk/postwalk
      (fn [node]
        (if (and (map? node) (:db/id node))
          (get bnode-definitions (:db/id node) node)
          node))
      graph)))

(defn walk-blanks
  "Replaces blank nodes with their values."
  ([index form]
   (if-some [id (:db/id form)]
     (let [node (get index id)]
       (walk/postwalk #(walk-blanks (dissoc index id) %) node))
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

(defprotocol Box
  (box [val] "boxes the value"))

(extend-protocol Box
  Boolean
  (box [val]
    {:xsd/boolean val})
  
  Number
  (box [n]
    (cond
      (double? n)
      {:xsd/double n}
      (float? n)
      {:xsd/float n}
      (instance? Integer n)
      {:xsd/int n}
      (int? n)
      {:xsd/long n}
      (decimal? n)
      {:xsd/decimal n}
      (integer? n)
      {:xsd/integer (bigint n)}
      :else {:xsd/decimal (bigdec n)}))

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
                               (cond
                                 (string? x)
                                 (try
                                   (double (Long/parseLong x))
                                   (catch Throwable ex
                                     (try
                                       (Double/parseDouble x)
                                       (catch Throwable ex
                                         (double (read-string (str "0x" x)))))))
                                 (number? x)
                                 (double x)

                                 (tagged-literal? x)
                                 (double (:form x)))))
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
  mop/type-of)

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

        (some? (:jsonschema/enum form))
        (box-value update :jsonschema/enum)

        (seq (:owl/oneOf form))
        (box-value update :owl/oneOf)

        (seq (:owl/withRestrictions form))
        (box-value update :owl/withRestrictions)

        (some? (:jsonschema/default form))
        (box-value update :jsonschema/default)

        (some? (:jsonschema/const form))
        (box-value update :jsonschema/const)

        (some? (:d3f/version form))
        (box-value update :d3f/version)

        (some? (:dcterms/hasPart form))
        (box-value update :dcterms/hasPart)

        (some? (:dcterms/creator form))
        (box-value update :dcterms/creator)

        (some? (:rdfs/isDefinedBy form))
        (box-value update :rdfs/isDefinedBy)

        (some? (:rdfs/seeAlso form))
        (box-value update :rdfs/seeAlso))
      form))

(defn unroll-forms
  "Walks the parsed RDF model and replaces references to blank nodes
  with their data. Also unrolls lists."
  [model]
  (let [md             (walk/prewalk walk-dcterms (meta model))
        prefix         (or (:rdfa/prefix md)
                           (:vann/preferredNamespacePrefix md)
                           (some-> (:ns md) ns-name #(str/split #"\.") peek))
        model-by-ident (update-vals (group-by (some-fn :db/id :db/ident) model) first)
        index          (update-vals model-by-ident #(dissoc % :db/id))
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
                                  (let [t (mop/type-of form)]
                                    (or (isa? t :owl/Ontology)
                                        (isa? t :voaf/Vocabulary)
                                        (isa? t :madsrdf/MADSScheme))))))
        the-ont    (first ontologies)
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

(defmulti rdf-doc
  "`rdf-doc` is a multimethod that dispatches on the type of its
  argument. It has various methods defined for different types and
  keys, each returning a docstring for the corresponding value in the
  map. It defaults to returning `nil` when a method for a given type
  or key is not defined."
  (fn [x]
    (cond
      (map-entry? x)
      (key x)

      (indexed? x)
      (nth x 0)

      :else (type x))))

(defmethod rdf-doc :default [_] nil)
(defmethod rdf-doc clojure.lang.TaggedLiteral [x] (str (:form x)))
(defmethod rdf-doc ont_app.vocabulary.lstr.LangStr [x] (str x))
(defmethod rdf-doc String [x] x)
(defmethod rdf-doc :rdfs/label [[k v]] (rdf-doc v))
(defmethod rdf-doc :rdfs/comment [[k v]] (rdf-doc v))
(defmethod rdf-doc :d3f/definition [[k v]] (rdf-doc v))
(defmethod rdf-doc :rdf/Property [[k v]] (rdf-doc v))
(defmethod rdf-doc :d3f/todo [_] nil)
(defmethod rdf-doc :d3f/kb-article [_] nil)
(defmethod rdf-doc :dc11/description [[k v]] (rdf-doc v))
(defmethod rdf-doc :dc11/title [[k v]] (rdf-doc v))

(prefer-method rdf-doc :rdfs/comment :rdfs/label)
(prefer-method rdf-doc :d3f/definition :rdfs/comment)
(prefer-method rdf-doc :d3f/definition :rdfs/label)
(prefer-method rdf-doc :dc11/description :rdfs/comment)
(prefer-method rdf-doc :dc11/title :rdfs/label)

(defn get-prefs
  "Returns a sequence of dispatching keywords on multifn sorted by
  preference."
  [multifn]
  (let [prefs (sort (comp > isa?) (keys (prefers multifn)))
        kws   (->> (methods multifn)
                   (keys)
                   (filter qualified-keyword?)
                   (filter #(isa? (:rdf/Property *metaobjects*) % :rdf/Property))
                   (remove (conj (mop/class-direct-subclasses :rdf/Property) :rdf/Property)))]
    (distinct (concat prefs kws))))

(defn get-doc
  "Returns the docstring for the first key-value pair in the map where
  the key is a subclass of a preferred key."
  [m]
  (let [prefs (get-prefs rdf-doc)]
    (some (fn [pref]            
            (when-some [kv (first (filter #(isa? (key %) pref) m))]
              (rdf-doc kv)))
          prefs)))

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
                                         (some #(or (isa? % :skos/Concept)
                                                    (isa? % :skos/ConceptScheme))
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
                                      docstring (get-doc v)
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
              ~@(let [docstring (or (get-doc md) (:doc md))]
                  (when docstring
                    [docstring]))
              ~(dissoc md :doc)
              ~@(when (seq exclusions)
                  [(list :refer-clojure :exclude exclusions)]))
            forms)
      forms)))

(defn emit-ns
  "Emits a model to a Clojure namespace using metadata map."
  [model md arg-map]
  (binding [*slash*   (:slash md)
            *private* (:private md)
            *recurse* (:recurse md 0)]
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
      (zprint/zprint (unroll-forms model)))))

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

;; Finds a metaobject by namespace-qualified keyword identity by
;; looking up its namespace in the system's registry and attempting to
;; resolve the name as a Var in that namespace, requiring it when
;; necessary.

(defmethod mop/find-class-using-env [clojure.lang.Keyword nil]
  [ident _]
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
    (when-some [doc (get-doc metaobject)]
      (println " " doc))
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
  "used to add :db/id's to blank nodes"
  [form]
  (if (and (map? form)
           (and (not (contains? form :rdfa/uri))
                (not (contains? form :db/ident))
                (not (contains? form :db/id))))
    (assoc form :db/id (str (random-uuid)))
    form))

(defn unroll-missing-uris
  "not sure if this is needed"
  [form]
  (if (sequential? form)
    (filterv (some-fn keyword? map?) form)
    form))

(defn finalize
  "Finalizes all of the loaded classes."
  ([]
   (finalize true (conj (set/union (set/difference (descendants :rdfs/Class)
                                                   (descendants :rdf/Property)
                                                   (descendants :owl/NamedIndividual)
                                                   (descendants :skos/Concept)
                                                   (descendants :owl/Thing))
                                   (mop/class-direct-subclasses :rdf/Property))
                        :rdfs/Class
                        :rdf/Property
                        :owl/NamedIndividual
                        :skos/Concept
                        :owl/Thing)))
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

(defmulti import-from
  "Import metaobjects `from` into `to`"
  (fn [from to]
    [(mop/type-of from) (mop/type-of to)]))

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
                         (all-metaobjects)))))

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

(extend-protocol LinkedData
  java.util.List
  (emit [xs arg-map]
    (dorun (pmap #(try
                    (emit % arg-map)
                    (catch Throwable ex
                      (println % (.getMessage ex))))
                 xs)))
  (sniff [xs]
    (pmap #(sniff %) xs))
  
  clojure.lang.IPersistentMap
  (parse [md]
    (binding [*graph*   (graph md)
              *slash*   (:slash md)
              *private* (:private md)
              *recurse* (:recurse md 0)]
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
  (emit [x arg-map]
    (when (:emit x true)
      (let [model (parse x)
            md    (meta model)]
        (emit-ns model md arg-map))))
  (sniff [m]
    (let [model (mem-parse m)]
      (with-meta (into [] (map #(dissoc % :private)) (unroll-forms model)) (meta model))))

  clojure.lang.Keyword
  (parse [ident]
    (when-some [url (iri ident)]
      (parse {:rdfa/prefix      (namespace ident)
              :dcat/downloadURL url})))
  (graph [ident]
    (when-some [url (iri ident)]
      (graph {:rdfa/prefix      (namespace ident)
              :dcat/downloadURL url})))
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

  clojure.lang.Named
  (parse [ident]
    (if (qualified-ident? ident)
      (some-> (resolve ident) deref parse)
      (some-> (find-ns ident) meta parse)))
  (graph [ident]
    (if (qualified-ident? ident)
      (some-> (resolve ident) deref graph)
      (some-> (find-ns ident) meta graph)))
  (emit [n arg-map]
    (when-some [x (if (qualified-ident? n)
                    (some-> (resolve (symbol n)) deref)
                    (find-ns (symbol n)))]
      (emit x arg-map)))

  clojure.lang.Namespace
  (parse [ns]
    (parse (meta ns)))
  (graph [ns]
    (graph (meta ns)))
  (emit [ns arg-map]
    (emit (filter (some-fn :dcat/downloadURL :rdfa/uri) (map deref (vals (ns-publics ns)))) arg-map))

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
  (emit [s arg-map]
    (emit {:dcat/downloadURL s} arg-map))
  (sniff [s]
    (if (or (str/starts-with? s "http")
            (str/starts-with? s "/"))      
      (sniff {:dcat/downloadURL s})
      (let [model (sniff {:rdf/value s})]
        (with-meta (into [] (map #(dissoc % :private)) model) (meta model)))))

  java.net.URI
  (parse [uri]
    (parse {:dcat/downloadURL (str uri)}))
  (graph [uri]
    (graph {:dcat/downloadURL (str uri)}))
  (sniff [uri]
    (sniff {:dcat/downloadURL (str uri)}))

  java.net.URL
  (parse [url]
    (parse {:dcat/downloadURL (str url)}))
  (graph [url]
    (graph {:dcat/downloadURL (str url)}))
  (sniff [url]
    (sniff {:dcat/downloadURL (str url)}))

  Graph
  (parse [g]
    (binding [*graph* g]
      (parse-with-meta g nil)))
  (graph [g] g)

  nil
  (sniff [_] nil))
