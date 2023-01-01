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
   (org.apache.jena.shared PrefixMapping))
  (:refer-clojure :exclude [isa? descendants ancestors parents]))

(defprotocol LinkedData
  (sniff [x] "Follow your nose."))

(defprotocol Parsable
  (parse [x]
    "Parses source using Apache Jena's RDFParser and converts it to
  Clojure data using Aristotle.

  Adapted from arachne.aristotle.graph/graph->clj"))

(defprotocol NamespaceSpitter
  (emit [x arg-map]))

(def ^:dynamic *terms*
  #{:rdf/type
    :rdfs/subClassOf
    :rdfs/subPropertyOf
    :owl/equivalentClass
    :owl/equivalentProperty})

(def ^:dynamic *metaobjects*
  (make-hierarchy))

(def ^:dynamic *classes*
  (make-hierarchy))

(def ^:dynamic *properties*
  (make-hierarchy))

(def ^:dynamic *things*
  #{})

(def ^:dynamic *ns-aliases*
  {})

(def ^:dynamic *ns-prefix* "net.wikipunk.rdf.")
(def ^:dynamic *target* "src/net/wikipunk/rdf/")

(defn isa?
  ([child parent]
   (or (clojure.core/isa? *classes* child parent)
       (clojure.core/isa? *properties* child parent)))
  ([h child parent]
   (clojure.core/isa? h child parent)))

(defn parents
  ([tag]
   (or (clojure.core/parents *classes* tag)
       (clojure.core/parents *properties* tag)))
  ([h tag]
   (clojure.core/parents h tag)))

(defn ancestors
  ([tag]
   (or (clojure.core/ancestors *classes* tag)
       (clojure.core/ancestors *properties* tag)))
  ([h tag]
   (clojure.core/ancestors h tag)))

(defn descendants
  ([tag]
   (or (clojure.core/descendants *classes* tag)
       (clojure.core/descendants *properties* tag)))
  ([h tag]
   (clojure.core/descendants h tag)))

#rdf/global-prefix ["dcterms" "http://purl.org/dc/terms/"]

(defn make-initial-context
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

(defn make-hierarchies
  []
  (transduce
    (comp
      (filter (comp :rdf/type meta))
      (map ns-publics)
      (mapcat vals)
      (map deref)
      (filter :rdf/type)
      (filter (comp qualified-keyword? :db/ident))
      (map (fn [entity]
             (reduce (fn [entity term]
                       (update entity term #(if (coll? %) (set %) #{%})))
                     entity *terms*))))
    (completing
      (fn [m {:db/keys   [ident]
              :rdf/keys  [type]
              :rdfs/keys [subClassOf subPropertyOf
                          equivalentClass equivalentProperty]
              :as        entity}]
        (cond-> m
          (and (some #{:rdfs/Class :owl/Class :rdfs/Datatype} type))
          (update :classes deriving entity
                  (concat (remove #{:owl/NamedIndividual}
                                  (filter keyword? type))
                          (filter keyword? subClassOf)
                          (filter keyword? equivalentClass)))

          (or (some #{:rdf/Property
                      :rdf/DatatypeProperty
                      :owl/ObjectProperty
                      :owl/DatatypeProperty}
                    type)
              (some #(isa? (:classes m) % :rdf/Property) type))
          (update :properties deriving entity
                  (concat (remove #{:owl/NamedIndividual}
                                  (filter keyword? type))
                          (filter keyword? subPropertyOf)
                          (filter keyword? equivalentProperty)))

          (some #{:owl/NamedIndividual :owl/Thing} type)
          (update :things conj ident)

          
          (or (isa? (:classes m) ident :rdfs/Class)
              (isa? (:properties m) ident :rdf/Property)
              (some #{:rdf/Property
                      :rdf/DatatypeProperty
                      :owl/ObjectProperty
                      :owl/DatatypeProperty
                      :rdfs/Class
                      :owl/Class
                      :rdfs/Datatype}
                    type))
          (update :metaobjects deriving entity
                  (concat (remove #{:owl/NamedIndividual}
                                  (filter keyword? type))
                          (filter keyword? subClassOf)
                          (filter keyword? subPropertyOf)
                          (filter keyword? equivalentClass)
                          (filter keyword? equivalentProperty))))))
    {:metaobjects (derive *metaobjects* :rdfs/Resource :rdfs/Class)
     :classes     (derive *classes* :rdfs/Resource :rdfs/Class)
     :properties  *properties*
     :things      *things*}
    (all-ns)))

(defn compute-class-precedence-list
  ([class-name]
   (let [supers (into [class-name]
                      (sort-by identity
                               (comparator isa?)
                               (ancestors class-name)))]
     (when (identical? (peek supers) :rdfs/Class)
       supers)))
  ([h class-name]
   (let [supers (into [class-name]
                      (sort-by identity
                               (comparator (partial isa? *classes*))
                               (ancestors *classes* class-name)))]
     (when (identical? (peek supers) :rdfs/Class)
       supers))))

(defrecord UniversalTranslator [boot]
  com/Lifecycle
  (start [this]
    (alter-var-root #'reg/*registry* (constantly (make-initial-context)))
    (alter-var-root #'*ns-aliases*
                    (constantly
                      (reduce (fn [ns-aliases prefix]
                                (assoc ns-aliases prefix (find-ns (symbol (str *ns-prefix* prefix)))))
                              {}
                              (keys (:prefixes reg/*registry*)))))
    (let [{:keys [metaobjects classes properties things]} (make-hierarchies)]
      (alter-var-root #'*metaobjects* (constantly metaobjects))
      (alter-var-root #'*classes* (constantly classes))
      (alter-var-root #'*properties* (constantly properties))
      (alter-var-root #'*things* (constantly things)))
    this)
  (stop [this]
    (alter-var-root #'*metaobjects* (constantly (make-hierarchy)))
    (alter-var-root #'*classes* (constantly (make-hierarchy)))
    (alter-var-root #'*properties* (constantly (make-hierarchy)))
    (alter-var-root #'*things* (constantly #{}))
    this)

  NamespaceSpitter
  (emit [_ arg-map]
    (emit boot arg-map)))

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
          ns-prefix-map              (set/rename-keys (dissoc (into (if (and prefix uri)
                                                                      {prefix uri}
                                                                      {})
                                                                    (.getNsPrefixMap (.getPrefixMapping g)))
                                                              "ruleml"
                                                              "")
                                                      {"sdo" "schema" "dct" "dcterms" "dc" "dcterms" "dc11" "dcterms" "terms" "dcterms" "ns" "vs" "sw" "vs" "" prefix "s" "rdfs" "dctype" "dcmitype" "dctypes" "dcmitype"})]
      (reg/with ns-prefix-map
                (into (with-meta [] (assoc md :rdf/ns-prefix-map ns-prefix-map))
                      (map (fn [[subject triples]]
                             (into {:db/ident (g/data subject)}
                                   (map (fn [[pred triples]]
                                          (let [k (g/data pred)
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
                               (= (namespace form) "dct")))

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
        public?        (every-pred :db/ident (comp (partial = prefix) namespace :db/ident))]
    (with-meta (sort-by :db/ident (filter public? forms))
      (merge md (first (get (group-by :rdf/type (filter :rdf/uri forms)) :owl/Ontology))))))

(defn unroll-ns
  "Walks the parsed RDF model and replaces references to blank nodes
  with their data. Also unrolls lists."
  [model]
  (let [index      (-> (group-by :db/ident model)
                       (update-vals first)
                       (update-vals #(dissoc % :db/ident)))
        index'     (->> (walk/prewalk (partial walk-blanks index) index)
                        (walk/postwalk walk-dcterms))
        types      (group-by :rdf/type model)
        ontologies (walk/prewalk (fn [form]
                                   (if-some [node (:rdf/blank form)]
                                     (get index form)
                                     form))
                                 (or (get types :owl/Ontology)
                                     (get types :lv2/Feature)
                                     (get types :voaf/Vocabulary)
                                     (get types :adms/SemanticAsset)
                                     (get types [:adms/SemanticAsset :owl/Ontology])
                                     (get types [:voaf/Vocabulary :owl/Ontology])
                                     (get types [:owl/Ontology :cc/Work])))
        md         (walk/prewalk (fn [form]
                                   (if (and (keyword? form) (or (= (namespace form) "dc")
                                                                (= (namespace form) "dct")))
                                     (keyword "dcterms" (name form))
                                     form))
                                 (meta model))
        seeAlso    (:rdfs/seeAlso md)
        seeAlso    (when (and seeAlso (str/ends-with? seeAlso "ttl"))
                     (update-vals (group-by :db/ident (parse seeAlso)) first))
        project    (when seeAlso
                     (get seeAlso (:db/ident md)))
        index'     (reduce-kv (fn [index k v]
                                (update index k merge v))
                              index' (dissoc seeAlso (:db/ident md)))
        md         (cond-> md
                     project (assoc :lv2/project project))
        exclusions (->> (keys (filter (comp qualified-keyword? key) index'))
                        (map name)
                        (filter #(var? (ns-resolve 'clojure.core (symbol %))))
                        (map symbol)
                        (into []))
        prefix     (or (:rdfa/prefix md)
                       (:vann/preferredNamespacePrefix md))
        forms      (->> (if prefix
                          (->> index'
                               (filter (comp qualified-keyword? key))
                               (filter (comp (partial = prefix) namespace key)))

                          index')
                        (sort-by #(if (map-entry? %) (key %) %))
                        (map (fn [form]
                               (walk/postwalk walk-rdf-list form)))
                        (map (fn [[k v]]
                               (let [sym (symbol (name k))
                                     sym (cond
                                           (= (name sym) "Class")
                                           'T
                                           
                                           (get clojure.lang.RT/DEFAULT_IMPORTS sym)
                                           (symbol (str sym "Class"))

                                           (= (name sym) "nil")
                                           'null

                                           :else (symbol (str/replace (name sym) #"^#" "")))
                                     docstring (or (some-> (:lv2/documentation v))
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
                                                 (str/trim (str/replace docstring #"\s" " ")))
                                     v         (assoc v :db/ident k)]
                                 (if docstring
                                   (list 'def sym docstring (dissoc v :lv2/documentation))
                                   (list 'def sym v)))))
                        (map (fn [form] (walk/postwalk walk-bytes form))))]
    (if prefix
      (cons `(~'ns ~(symbol (str *ns-prefix* prefix))
              ~@(let [docstring (or (get-in md [:lv2/project :lv2/documentation])
                                    (:dcterms/abstract md)
                                    (:dcterms/description md)
                                    (:dcterms/title md)
                                    (:rdfs/comment md)
                                    (:rdfs/label md)
                                    (:rdfa/uri md)
                                    (:skos/historyNote md)
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
                                  (str/trim (str/replace docstring #"\s" " ")))]
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
      (mem-unroll model)))

  clojure.lang.Keyword
  (sniff [k]
    (namespace k)))

(defn type-of
  [x]
  (or (:rdf/type x) (type x)))

(defn find-class
  [class-name]
  (when-some [var (ns-resolve (get *ns-aliases* (namespace class-name))
                              (cond
                                (= (name class-name) "Class")
                                'T
                                
                                (get clojure.lang.RT/DEFAULT_IMPORTS class-name)
                                (symbol (str class-name "Class"))

                                (= (name class-name) "nil")
                                'null

                                :else
                                (-> (name class-name)
                                    (str/replace #"^#" "")
                                    (symbol))))]
    @var))
