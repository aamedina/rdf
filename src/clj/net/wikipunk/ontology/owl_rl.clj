(ns net.wikipunk.ontology.owl-rl
  "OWL RL importer for Datomic.

  Reads RDF/Turtle/OWL, installs required Datomic attributes, asserts
  TBox axioms, and optionally ABox assertions. The result is a Datomic
  graph that can be queried and reasoned over with Datalog rules."
  (:require
   [clojure.set :as set]
   [clojure.string :as str]
   [clojure.tools.logging :as log]
   [datomic.client.api :as d]
   [clojure.instant :as instant])
  (:import
   (org.apache.jena.rdf.model Model ModelFactory Resource RDFNode Literal)
   (org.apache.jena.riot RDFDataMgr)
   (org.apache.jena.vocabulary RDF RDFS OWL XSD SKOS)))

(def ^:private xsd-uri
  {:boolean       "http://www.w3.org/2001/XMLSchema#boolean"
   :integer       "http://www.w3.org/2001/XMLSchema#integer"
   :int           "http://www.w3.org/2001/XMLSchema#int"
   :long          "http://www.w3.org/2001/XMLSchema#long"
   :double        "http://www.w3.org/2001/XMLSchema#double"
   :float         "http://www.w3.org/2001/XMLSchema#float"
   :decimal       "http://www.w3.org/2001/XMLSchema#decimal"
   :nni           "http://www.w3.org/2001/XMLSchema#nonNegativeInteger"
   :dateTime      "http://www.w3.org/2001/XMLSchema#dateTime"
   :dateTimeStamp "http://www.w3.org/2001/XMLSchema#dateTimeStamp"
   :date          "http://www.w3.org/2001/XMLSchema#date"})

;; Comprehensive XSD → Datomic type mapping. Defaults to string when ambiguous.
(def ^:private xsd->dbtype-map
  {;; string-like
   :xsd/string             :db.type/string
   :xsd/normalizedString   :db.type/string
   :xsd/token              :db.type/string
   :xsd/language           :db.type/string
   :xsd/Name               :db.type/string
   :xsd/NCName             :db.type/string
   :xsd/NMTOKEN            :db.type/string
   :xsd/anyURI             :db.type/string
   ;; booleans
   :xsd/boolean            :db.type/boolean
   ;; integral numerics
   :xsd/integer            :db.type/long
   :xsd/int                :db.type/long
   :xsd/long               :db.type/long
   :xsd/short              :db.type/long
   :xsd/byte               :db.type/long
   :xsd/unsignedByte       :db.type/long
   :xsd/unsignedShort      :db.type/long
   :xsd/unsignedInt        :db.type/long
   :xsd/unsignedLong       :db.type/long
   :xsd/nonNegativeInteger :db.type/long
   :xsd/positiveInteger    :db.type/long
   :xsd/nonPositiveInteger :db.type/long
   :xsd/negativeInteger    :db.type/long
   ;; fractional numerics
   :xsd/decimal            :db.type/double
   :xsd/float              :db.type/double
   :xsd/double             :db.type/double
   ;; date/time
   :xsd/dateTime           :db.type/instant
   ;; represent other date/time-like forms as strings by default
   :xsd/date               :db.type/string
   :xsd/time               :db.type/string
   :xsd/gYear              :db.type/string
   :xsd/gMonth             :db.type/string
   :xsd/gDay               :db.type/string
   :xsd/gYearMonth         :db.type/string
   :xsd/gMonthDay          :db.type/string
   :xsd/duration           :db.type/string
   ;; binary
   :xsd/base64Binary       :db.type/string
   :xsd/hexBinary          :db.type/string})

(defn- xsd->dbtype [kw]
  (get xsd->dbtype-map kw :db.type/string))

(def ^:private rl-axiom-attrs
  [;; Core RDFS/OWL typing & hierarchy
   {:db/ident :rdf/type :db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
   {:db/ident :rdfs/subClassOf :db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
   {:db/ident :rdfs/subPropertyOf :db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
   {:db/ident :rdfs/domain :db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
   {:db/ident :rdfs/range :db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
   {:db/ident :rdfs/member :db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
   {:db/ident :rdfs/label :db/valueType :db.type/string :db/cardinality :db.cardinality/many}
   {:db/ident :rdfs/comment :db/valueType :db.type/string :db/cardinality :db.cardinality/many}
   {:db/ident :skos/definition :db/valueType :db.type/string :db/cardinality :db.cardinality/one}
   {:db/ident :skos/altLabel :db/valueType :db.type/string :db/cardinality :db.cardinality/many}
   {:db/ident :skos/prefLabel :db/valueType :db.type/string :db/cardinality :db.cardinality/one}
   {:db/ident :skos/example :db/valueType :db.type/string :db/cardinality :db.cardinality/many}


   ;; Class axioms
   {:db/ident :owl/equivalentClass :db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
   {:db/ident :owl/disjointWith :db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
   {:db/ident :owl/intersectionOf :db/valueType :db.type/ref :db/cardinality :db.cardinality/one}
   {:db/ident :owl/unionOf :db/valueType :db.type/ref :db/cardinality :db.cardinality/one}
   {:db/ident :owl/complementOf :db/valueType :db.type/ref :db/cardinality :db.cardinality/one}
   {:db/ident :owl/oneOf :db/valueType :db.type/ref :db/cardinality :db.cardinality/one}

   ;; Property axioms
   {:db/ident :owl/equivalentProperty :db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
   {:db/ident :owl/propertyDisjointWith :db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
   {:db/ident :owl/inverseOf :db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
   {:db/ident :owl/hasKey :db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
   {:db/ident :owl/propertyChainAxiom :db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
   {:db/ident :owl/versionInfo :db/valueType :db.type/string :db/cardinality :db.cardinality/one}
   {:db/ident :owl/versionIRI :db/valueType :db.type/ref :db/cardinality :db.cardinality/one}

   ;; Restriction semantics
   {:db/ident :owl/onProperty :db/valueType :db.type/ref :db/cardinality :db.cardinality/one}
   {:db/ident :owl/onClass :db/valueType :db.type/ref :db/cardinality :db.cardinality/one}
   {:db/ident :owl/someValuesFrom :db/valueType :db.type/ref :db/cardinality :db.cardinality/one}
   {:db/ident :owl/allValuesFrom :db/valueType :db.type/ref :db/cardinality :db.cardinality/one}
   {:db/ident :owl/hasValue :db/valueType :db.type/ref :db/cardinality :db.cardinality/one}
   {:db/ident :owl/hasSelf :db/valueType :db.type/boolean :db/cardinality :db.cardinality/one}
   {:db/ident :owl/minCardinality :db/valueType :db.type/long :db/cardinality :db.cardinality/one}
   {:db/ident :owl/maxCardinality :db/valueType :db.type/long :db/cardinality :db.cardinality/one}
   {:db/ident :owl/cardinality :db/valueType :db.type/long :db/cardinality :db.cardinality/one}
   {:db/ident :owl/qualifiedCardinality :db/valueType :db.type/long :db/cardinality :db.cardinality/one}
   {:db/ident :owl/maxQualifiedCardinality :db/valueType :db.type/long :db/cardinality :db.cardinality/one}
   {:db/ident :owl/minQualifiedCardinality :db/valueType :db.type/long :db/cardinality :db.cardinality/one}
   {:db/ident :owl/onDataRange :db/valueType :db.type/ref :db/cardinality :db.cardinality/one}
   {:db/ident :owl/onDatatype :db/valueType :db.type/ref :db/cardinality :db.cardinality/one}
   {:db/ident :owl/withRestrictions :db/valueType :db.type/ref :db/cardinality :db.cardinality/one}
   {:db/ident :owl/disjointUnionOf :db/valueType :db.type/ref :db/cardinality :db.cardinality/one}
   {:db/ident :owl/members :db/valueType :db.type/ref :db/cardinality :db.cardinality/one}

   ;; RDF lists
   {:db/ident :rdf/first :db/valueType :db.type/ref :db/cardinality :db.cardinality/one}
   {:db/ident :rdf/rest :db/valueType :db.type/ref :db/cardinality :db.cardinality/one}])

(def ^:private internal-attrs
  [{:db/ident       :punk/iri
    :db/valueType   :db.type/string
    :db/cardinality :db.cardinality/one
    :db/unique      :db.unique/identity
    :db/doc         "External IRI captured for resources that cannot be expressed as Clojure keywords."}
   {:db/ident       :rdfa/prefix
    :db/valueType   :db.type/string
    :db/cardinality :db.cardinality/one
    :db/unique      :db.unique/identity
    :db/doc         "NCName used when persisting ontology prefix mappings."}
   {:db/ident       :rdfa/uri
    :db/valueType   :db.type/string
    :db/cardinality :db.cardinality/one
    :db/doc         "Namespace URI associated with an RDFa prefix mapping."}])

(def ^:private annotation-default-attrs
  [{:db/ident       :dcterms/created
    :db/valueType   :db.type/instant
    :db/cardinality :db.cardinality/one
    :db/doc         "Creation timestamp captured from imported ontologies."}
   {:db/ident       :dcterms/modified
    :db/valueType   :db.type/instant
    :db/cardinality :db.cardinality/one
    :db/doc         "Last-modified timestamp captured from imported ontologies."}])

(def ^:private builtin-annotation-props
  #{:rdfs/label
    :rdfs/comment
    :skos/definition
    :skos/altLabel
    :skos/prefLabel
    :skos/example})

(def ^:private builtin-single-annotation-props
  #{:rdfs/label
    :skos/definition
    :skos/prefLabel})

(declare ensure-stubs!)

(def ^:private attr-update-keys
  #{:db/cardinality
    :db/doc
    :db/fulltext
    :db/index
    :db/isComponent
    :db/noHistory
    :db/unique
    :db/valueType})

(def ^:private attr-allowed-keys
  (conj attr-update-keys :db/ident :db/id))

(def ^:private attr-diff-keys
  (disj attr-allowed-keys :db/ident :db/id))

(defn- ensure-attrs!
  "Upsert the supplied Datomic attribute specs, minimizing redundant writes.

  Uses Datomic Client semantics: attributes are created by transacting the
  attribute map directly. Incompatible schema changes (valueType, cardinality,
  unique) are rejected and reported to the caller."
  [conn attrs]
  (when (seq attrs)
    (let [requested-idents (->> attrs (keep :db/ident) set)
          db              (d/db conn)
          stale-idents    (when (seq requested-idents)
                            (d/q '[:find ?ident ?e
                                   :in $ [?ident ...]
                                   :where
                                   [?e :db/ident ?ident]
                                   (not [?e :db/valueType _])]
                                 db
                                 requested-idents))]
      (when (seq stale-idents)
        (log/warnf "ensure-attrs! retracting %d non-schema idents before attribute install"
                   (count stale-idents))
        (d/transact conn {:tx-data (mapv (fn [[_ e]] [:db/retractEntity e]) stale-idents)}))
      (let [db            (d/db conn)
            existing      (into {} (d/q '[:find ?ident ?e :where [?e :db/ident ?ident]] db))
            multi-valued? (fn [ident]
                            (seq (d/q '[:find ?e
                                        :in $ ?attr
                                        :where
                                        [?e ?attr ?v1]
                                        [?e ?attr ?v2]
                                        [(not= ?v1 ?v2)]]
                                      db ident)))
            pull-spec     (vec (conj attr-diff-keys :db/ident))
            sanitize      (fn [m]
                            (reduce-kv (fn [acc k v]
                                         (let [ns (namespace k)
                                               nm (name k)]
                                           (cond
                                             (= "db.install" ns)                               acc
                                             (= "db.alter" ns)                                 acc
                                             (and (= "db" ns) (str/starts-with? nm "install")) acc
                                             (and (= "db" ns) (str/starts-with? nm "alter"))   acc
                                             (contains? attr-allowed-keys k)                   (assoc acc k v)
                                             :else                                             acc)))
                                       {} m))
            normalize     (fn normalize [v]
                            (cond
                              (map? v)        (or (:db/ident v) v)
                              (sequential? v) (mapv normalize v)
                              :else           v))
            {:keys [create update errors]}
            (reduce
              (fn [{:keys [create update errors]} raw-spec]
                (let [spec  (-> raw-spec sanitize (dissoc :db/id))
                      ident (:db/ident spec)]
                  (cond
                    (nil? ident)
                    {:create create :update update :errors errors}

                    (not (contains? existing ident))
                    {:create (conj create spec) :update update :errors errors}

                    :else
                    (let [cur             (d/pull db pull-spec [:db/ident ident])
                          new-type        (some-> (get spec :db/valueType) normalize)
                          old-type        (some-> (get cur :db/valueType) normalize)
                          type-change?    (and new-type old-type (not= new-type old-type))
                          new-unique      (some-> (get spec :db/unique) normalize)
                          old-unique      (some-> (get cur :db/unique) normalize)
                          unique-change?  (and new-unique old-unique (not= new-unique old-unique))
                          new-card        (some-> (get spec :db/cardinality) normalize)
                          old-card        (some-> (get cur :db/cardinality) normalize)
                          card-change?    (and new-card old-card (not= new-card old-card))
                          card-conflict?  (and card-change?
                                               (= :db.cardinality/one new-card)
                                               (= :db.cardinality/many old-card)
                                               (multi-valued? ident))
                          incompat-reason (cond
                                            type-change?   :db/valueType
                                            unique-change? :db/unique
                                            card-conflict? :db/cardinality
                                            :else          nil)]
                      (if incompat-reason
                        {:create create
                         :update update
                         :errors (conj errors {:ident     ident
                                               :requested spec
                                               :current   cur
                                               :reason    incompat-reason})}
                        (let [diffs (reduce (fn [acc k]
                                              (let [v (get spec k)]
                                                (cond-> acc
                                                  (and v (not= (normalize v)
                                                               (normalize (get cur k))))
                                                  (conj [:db/add [:db/ident ident] k v]))))
                                            []
                                            attr-diff-keys)]
                          {:create create
                           :update (into update diffs)
                           :errors errors}))))))
              {:create [] :update [] :errors []}
              attrs)]
        (when (seq errors)
          (throw (ex-info "Incompatible schema changes requested."
                          {:errors errors})))
        (when (seq create)
          (log/debug "ensure-attrs! creating attributes" {:idents (map :db/ident create) :count (count create)})
          (try
            (d/transact conn {:tx-data create})
            (catch Exception e
              (log/error e "ensure-attrs! attribute creation failed" {:tx-data create})
              (throw e))))
        (when (seq update)
          (d/transact conn {:tx-data update}))))))

(defn ensure-rl-attrs!
  "Ensure OWL RL schema attributes and defaults are installed in Datomic."
  [conn]
  (ensure-attrs! conn (concat rl-axiom-attrs internal-attrs annotation-default-attrs)))

(defn- model-prefix-mapping [^Model m]
  (.getPrefixMapping (.getGraph m)))

(defn- apply-namespace-overrides!
  "Apply explicit prefix -> URI mappings to the Jena model, replacing any other
  prefixes that point at the same namespace URI. Ensures QName generation prefers
  the supplied prefixes."
  [^Model m namespaces]
  (when (seq namespaces)
    (let [pm (model-prefix-mapping m)]
      (doseq [[prefix uri] namespaces
              :let [prefix (cond
                             (keyword? prefix) (name prefix)
                             (symbol? prefix)  (name prefix)
                             :else             (str prefix))
                    uri    (when (some? uri) (str uri))]]
        (when (and (seq prefix) (seq uri))
          (let [existing (.getNsPrefixMap pm)]
            (doseq [[p u] existing]
              (when (and (= (str u) uri)
                         (not= (str p) prefix))
                (.removeNsPrefix pm (str p))))
            (.setNsPrefix pm prefix uri)))))))

(defn- persist-prefix-mappings!
  "Sync the prefixes defined on the imported Jena model into Datomic.

  The importer writes a single entity per prefix (identity on `:rdfa/prefix`).
  Transactions are skipped when Datomic already holds the same `(prefix -> uri)`
  pairs, avoiding noisy churn while keeping the table in step with the TTLs.

  NOTE: `import-ontologies!` may be called with only a subset of the overall TTL
  universe. To avoid dropping prefixes for previously imported ontologies, this
  function only *adds or updates* mappings. Any removal workflow must operate
  with knowledge of the full prefix set."
  [conn ^Model m]
  (let [pm             (model-prefix-mapping m)
        desired-prefix (->> (.getNsPrefixMap pm)
                            (keep (fn [[prefix uri]]
                                    (let [prefix (some-> prefix str)
                                          uri    (some-> uri str)]
                                      (when (and (some? prefix) (some? uri)
                                                 (not (str/blank? prefix))
                                                 (not (str/blank? uri)))
                                        [prefix uri]))))
                            (into {}))
        db             (d/db conn)
        existing       (into {}
                             (map (fn [[eid prefix uri]]
                                    [prefix {:uri (str uri) :eid eid}]))
                             (d/q '[:find ?e ?prefix ?uri
                                    :where
                                    [?e :rdfa/prefix ?prefix]
                                    [?e :rdfa/uri ?uri]]
                                  db))
        additions      (->> desired-prefix
                            (remove (fn [[prefix uri]]
                                      (= uri (:uri (get existing prefix)))))
                            (map (fn [[prefix uri]]
                                   {:rdfa/prefix prefix
                                    :rdfa/uri    uri
                                    :rdf/type    :rdfa/PrefixMapping}))
                            vec)
        updates        (->> desired-prefix
                            (keep (fn [[prefix uri]]
                                    (when-let [current (:uri (get existing prefix))]
                                      (when (not= current uri)
                                        [:db/add [:rdfa/prefix prefix] :rdfa/uri uri]))))
                            vec)
        tx-data        (concat updates additions)]
    (when (seq tx-data)
      (ensure-stubs! conn #{:rdfa/PrefixMapping})
      (d/transact conn {:tx-data (vec tx-data)}))))

(defn- qname-prefer-non-empty
  "Return a QName string for the given URI using the model's prefix mapping,
   preferring non-empty prefixes over the default '' prefix when multiple map
   to the same namespace. Falls back to PrefixMapping.shortForm."
  [^Model m uri]
  (when uri
    (let [pm    (model-prefix-mapping m)
          mp    (.getNsPrefixMap pm) ;; Map prefix -> namespace URI
          ;; candidates where the namespace is a prefix of the URI
          cands (->> mp
                     (filter (fn [[_ ns]] (and ns (.startsWith uri ns))))
                     (sort-by (fn [[p ns]] [(= p "") ;; default last
                                            (- (count ns))])) ;; longest namespace first
                     vec)]
      (if-let [[p ns] (first cands)]
        (str p ":" (subs uri (count ns)))
        (.shortForm pm uri)))))

(defn- qname->kw
  "Convert a QName like \"ex:Foo\" into :ex/Foo.
   Returns nil for full IRIs or prefixes http/https, or when prefix/local is empty."
  [q]
  (when (and q (not (str/includes? q "://")))
    (let [[p local] (str/split q #":" 2)]
      (when (and (seq p) (seq local) (not (#{"http" "https"} p)))
        (keyword p local)))))

;; --- Stable identity for blank nodes ---------------------------------------

(defn- bn-fingerprint
  "Compute a stable content fingerprint for a blank node by traversing its
   immediate outgoing statements in the model and recursively summarizing
   blank-node object subgraphs. Avoids cycles via `visited` set of label strings."
  [^Model m ^Resource r visited]
  (let [props (iterator-seq (.listProperties r))
        parts (reduce
                (fn [acc ^org.apache.jena.rdf.model.Statement st]
                  (let [p  (.getPredicate st)
                        o  (.getObject st)
                        pu (.getURI p)
                        ok (cond
                             (.isResource o)
                             (let [ro (.asResource o)]
                               (if (.isURIResource ro)
                                 (.getURI ro)
                                 (let [lbl (.getLabelString (.getId ro))]
                                   (if (contains? visited lbl)
                                     (str "_bn:cycle:" lbl)
                                     (bn-fingerprint m ro (conj visited lbl))))))
                             (.isLiteral o)
                             (let [^Literal lit (.asLiteral o)
                                   dt           (.getDatatypeURI lit)
                                   s            (.getLexicalForm lit)]
                               (str "lit:" (or dt "") ":" s))
                             :else "")]
                    (conj acc (str pu "=" ok))))
                []
                props)
        s     (->> parts sort (clojure.string/join "|"))]
    (let [md (java.security.MessageDigest/getInstance "SHA-256")
          bs (.getBytes s java.nio.charset.StandardCharsets/UTF_8)]
      (.update md bs 0 (alength bs))
      (apply str (map (fn [b] (format "%02x" (bit-and 0xff b))) (.digest md))))))

(defn- bn-iri
  "Return a stable synthetic IRI for a blank node based on its content."
  [^Model m ^Resource r]
  (str "urn:wikipunk:bnode:" (bn-fingerprint m r #{})))

(defn- res->ref
  "Return a Datomic reference for a Jena Resource:
   - For URI resources with a valid QName, return :prefix/local keyword
   - Otherwise, return lookup-ref [:punk/iri \"<uri>\"]
   - For blank nodes, return keyword in _b namespace"
  [^Model m ^Resource r]
  (cond
    (.isURIResource r)
    (let [uri (.getURI r)
          q   (qname-prefer-non-empty m uri)]
      (or (qname->kw q)
          [:punk/iri uri]))

    (.isAnon r)
    [:punk/iri (bn-iri m r)]

    :else
    (throw (ex-info "Unsupported RDF node type for resource->ref" {:node r}))))

(defn- resource? [obj]
  (instance? Resource obj))

(def ^:private pred->kw
  {(.getURI RDF/type)                    :rdf/type
   (.getURI RDFS/subClassOf)             :rdfs/subClassOf
   (.getURI RDFS/subPropertyOf)          :rdfs/subPropertyOf
   (.getURI RDFS/domain)                 :rdfs/domain
   (.getURI RDFS/range)                  :rdfs/range
   (.getURI RDFS/member)                 :rdfs/member
   (.getURI OWL/equivalentClass)         :owl/equivalentClass
   (.getURI OWL/disjointWith)            :owl/disjointWith
   (.getURI OWL/intersectionOf)          :owl/intersectionOf
   (.getURI OWL/unionOf)                 :owl/unionOf
   (.getURI OWL/complementOf)            :owl/complementOf
   (.getURI OWL/oneOf)                   :owl/oneOf
   (.getURI OWL/equivalentProperty)      :owl/equivalentProperty
   (.getURI OWL/propertyDisjointWith)    :owl/propertyDisjointWith
   (.getURI OWL/inverseOf)               :owl/inverseOf
   (.getURI OWL/hasKey)                  :owl/hasKey
   (.getURI OWL/propertyChainAxiom)      :owl/propertyChainAxiom
   ;; Restriction predicates
   (.getURI OWL/onProperty)              :owl/onProperty
   (.getURI OWL/onClass)                 :owl/onClass
   (.getURI OWL/someValuesFrom)          :owl/someValuesFrom
   (.getURI OWL/allValuesFrom)           :owl/allValuesFrom
   (.getURI OWL/hasValue)                :owl/hasValue
   (.getURI OWL/hasSelf)                 :owl/hasSelf
   (.getURI OWL/minCardinality)          :owl/minCardinality
   (.getURI OWL/maxCardinality)          :owl/maxCardinality
   (.getURI OWL/cardinality)             :owl/cardinality
   (.getURI OWL/qualifiedCardinality)    :owl/qualifiedCardinality
   (.getURI OWL/minQualifiedCardinality) :owl/minQualifiedCardinality
   (.getURI OWL/maxQualifiedCardinality) :owl/maxQualifiedCardinality
   (.getURI OWL/onDatatype)              :owl/onDatatype
   (.getURI OWL/onDataRange)             :owl/onDataRange
   (.getURI OWL/withRestrictions)        :owl/withRestrictions
   ;; RDF Collection
   (.getURI RDF/first)                   :rdf/first
   (.getURI RDF/rest)                    :rdf/rest})


(defn- literal? [^RDFNode n] (.isLiteral n))

(def ^:private max-string-length 4000)

(defn- maybe-truncate-string [v]
  (if (and (string? v) (> (count v) max-string-length))
    (subs v 0 max-string-length)
    v))

(defn- literal->val [^Literal lit]
  (let [dt-uri (.getDatatypeURI lit)
        s      (.getLexicalForm lit)]
    (cond
      (= dt-uri (:boolean xsd-uri))
      (try (Boolean/parseBoolean s) (catch Throwable _ nil))

      (or (= dt-uri (:integer xsd-uri))
          (= dt-uri (:int xsd-uri))
          (= dt-uri (:long xsd-uri))
          (= dt-uri (:nni xsd-uri)))
      (try (Long/parseLong s) (catch Throwable _ nil))

      (or (= dt-uri (:double xsd-uri))
          (= dt-uri (:float xsd-uri))
          (= dt-uri (:decimal xsd-uri)))
      (try (Double/parseDouble s) (catch Throwable _ nil))

      (or (= dt-uri (:dateTime xsd-uri))
          (= dt-uri (:dateTimeStamp xsd-uri))
          (= dt-uri (:date xsd-uri)))
      (try (instant/read-instant-date s) (catch Throwable _ nil))

      :else (maybe-truncate-string s))))

(def ^:private literal-preds
  #{:owl/hasSelf
    :owl/minCardinality :owl/maxCardinality :owl/cardinality
    :owl/qualifiedCardinality :owl/minQualifiedCardinality :owl/maxQualifiedCardinality})

(defn- collect-axioms
  "Collect allowed axioms into a map of subject -> predicate -> set of objects.
   Supports resource objects and selected typed literal objects (for restrictions)."
  [^Model m]
  (let [stmts (iterator-seq (.listStatements m))]
    (reduce (fn [acc s]
              (let [subj     (.getSubject s)
                    pred     (.getPredicate s)
                    obj      (.getObject s)
                    pred-uri (.getURI pred)
                    pred-kw  (get pred->kw pred-uri)]
                (if pred-kw
                  (let [sk  (res->ref m subj)
                        ok  (or (get acc sk) {})
                        ov  (or (get ok pred-kw) #{})
                        ov' (cond
                              (resource? obj)                                        (conj ov (res->ref m (.asResource obj)))
                              (and (literal? obj) (contains? literal-preds pred-kw)) (conj ov (literal->val (.asLiteral obj)))
                              :else                                                  ov)
                        ok' (assoc ok pred-kw ov')]
                    (assoc acc sk ok'))
                  acc)))
            {}
            stmts)))

(defn- ensure-stubs!
  "Ensure every keyword in `ks` exists as a Datomic entity with `:db/ident`.
  Bnode pseudo-idents (namespace `_b`) are ignored."
  [conn ks]
  (let [db       (d/db conn)
        existing (set (map first (d/q '[:find ?ident :where [?e :db/ident ?ident]] db)))
        missing  (->> ks
                      (remove existing)
                      ;; never stub bnodes (they should not get :db/ident)
                      (remove (fn [k] (= "_b" (namespace k))))
                      vec)]
    (when (seq missing)
      (doseq [batch (partition-all 512 missing)]
        (d/transact conn {:tx-data (mapv (fn [k] {:db/ident k}) batch)})))))

;; Core RDFS/OWL axioms are asserted via net.wikipunk.owl-rl-axioms; avoid
;; duplication here to prevent drift. Use that ns when baseline axioms are needed.

(defn- install-property-attributes!
  "Ensure Datomic attributes for ontology properties according to OWL RL:
   - ObjectProperty -> ref
   - DatatypeProperty -> XSD range mapping; defaults to ref when unknown
   - FunctionalProperty -> cardinality one; else many
   - InverseFunctionalProperty -> unique value
   Only includes properties actually present in the model."
  ([conn ^Model m]
   (install-property-attributes! conn m {}))
  ([conn ^Model m {:keys [annotation-properties?]
                   :or   {annotation-properties? true}}]
   (let [pm         (model-prefix-mapping m)
         db         (d/db conn)
         short      (fn [^Resource r]
                      (when (.isURIResource r)
                        (qname-prefer-non-empty m (.getURI r))))
         as-kw      (fn [^Resource r]
                      (when-let [q (short r)]
                        (qname->kw q)))
         props      (->> (iterator-seq (.listResourcesWithProperty m RDF/type OWL/ObjectProperty))
                         (concat (iterator-seq (.listResourcesWithProperty m RDF/type OWL/DatatypeProperty)))
                         (concat (iterator-seq (.listResourcesWithProperty m RDF/type OWL/AnnotationProperty)))
                         (concat (iterator-seq (.listResourcesWithProperty m RDF/type RDF/Property)))
                         (remove (fn [^Resource p]
                                   (and (not annotation-properties?)
                                        (.contains m p RDF/type OWL/AnnotationProperty))))
                         (set))
         datomic-props-for
         (fn [^Resource p]
           (reduce (fn [acc ^org.apache.jena.rdf.model.Statement st]
                     (let [pred (.getPredicate st)
                           kw   (as-kw pred)]
                       (if (and kw
                                (= "db" (namespace kw))
                                (attr-update-keys kw))
                         (let [obj   (.getObject st)
                               value (cond
                                       (resource? obj)
                                       (let [res (.asResource obj)]
                                         (or (as-kw res)
                                             [:punk/iri (.getURI res)]))
                                       (literal? obj)
                                       (literal->val (.asLiteral obj))
                                       :else nil)]
                           (cond-> acc (some? value) (assoc kw value)))
                         acc)))
                   {}
                   (iterator-seq (.listProperties p))))
         system-ns? (fn [ns]
                      (or (contains? #{"owl" "rdf" "rdfs" "xsd"} ns)
                          (and ns (or (= "db" ns)
                                      (str/starts-with? ns "db.")
                                      (str/starts-with? ns "datomic.")))))
         specs      (->> props
                         (keep (fn [^Resource p]
                                 (let [ident           (as-kw p)
                                       ns              (some-> ident namespace)
                                       has-type?       (fn [^Resource t]
                                                         (.contains m p RDF/type t))
                                       range-res       (first (iterator-seq (.listObjectsOfProperty m p RDFS/range)))
                                       range-kw        (when (and range-res (resource? range-res)) (as-kw (.asResource range-res)))
                                       xsd-range?      (= "xsd" (some-> range-kw namespace))
                                       datomic-attrs   (datomic-props-for p)
                                       unique-from-ttl (:db/unique datomic-attrs)
                                       override-attrs  (-> datomic-attrs
                                                           (select-keys attr-update-keys)
                                                           (dissoc :db/unique))
                                       annotation?     (has-type? OWL/AnnotationProperty)
                                       existing-schema (when ident
                                                         (d/pull db [:db/valueType :db/cardinality :db/unique]
                                                                 [:db/ident ident]))
                                       existing-type   (some-> existing-schema :db/valueType :db/ident)
                                       existing-card   (some-> existing-schema :db/cardinality :db/ident)
                                       existing-unique (some-> existing-schema :db/unique :db/ident)
                                       default-value-t (cond
                                                         (has-type? OWL/ObjectProperty)  :db.type/ref
                                                         (has-type? OWL/DatatypeProperty) (if range-kw (xsd->dbtype range-kw) :db.type/string)
                                                         annotation?
                                                         (cond
                                                           xsd-range?                  (xsd->dbtype range-kw)
                                                           (= :rdfs/Literal range-kw)  :db.type/string
                                                           (some? range-kw)            :db.type/ref
                                                           :else                       :db.type/string)
                                                         xsd-range?                    (xsd->dbtype range-kw)
                                                         :else                         :db.type/ref)
                                       default-card     (cond
                                                         (has-type? OWL/FunctionalProperty)                :db.cardinality/one
                                                         (contains? builtin-single-annotation-props ident) :db.cardinality/one
                                                         :else                                             :db.cardinality/many)
                                       default-unique   (or unique-from-ttl
                                                            (when (has-type? OWL/InverseFunctionalProperty)
                                                              :db.unique/value))
                                       value-t          (or existing-type default-value-t)
                                       card             (or existing-card default-card)
                                       unique           (or existing-unique default-unique)
                                       types     (into #{:rdf/Property}
                                                       (concat (when (has-type? OWL/ObjectProperty) [:owl/ObjectProperty])
                                                               (when (has-type? OWL/DatatypeProperty) [:owl/DatatypeProperty])
                                                               (when annotation? [:owl/AnnotationProperty])))
                                       attr-base {:db/ident       ident
                                                  :db/valueType   value-t
                                                  :db/cardinality card}
                                       attr      (merge attr-base override-attrs)]
                                   (when (and ident
                                              (not (system-ns? ns))
                                              (or (has-type? OWL/ObjectProperty)
                                                  (has-type? OWL/DatatypeProperty)
                                                  annotation?
                                                  xsd-range?))
                                     (when (or annotation-properties?
                                               (not annotation?))
                                       {:ident       ident
                                        :attr        (cond-> attr unique (assoc :db/unique unique))
                                        :types       types
                                        :annotation? annotation?})))))
                         vec)
         attr-maps (map :attr specs)
         type-adds (->> specs
                        (mapcat (fn [{:keys [ident types]}]
                                  (for [t types]
                                    [:db/add [:db/ident ident] :rdf/type t])))
                        vec)]
     (ensure-attrs! conn attr-maps)
     (when (seq type-adds)
       (d/transact conn {:tx-data (vec (distinct type-adds))})))))

(defn import-ontologies!
  "Load TTL files; compute OWL RL-compatible axioms and install
   them into Datomic. Also ensures predicate and property attributes are present."
  ([conn ttl-paths]
   (import-ontologies! conn ttl-paths {}))
  ([conn ttl-paths {:keys [annotation-properties? namespaces]
                    :or   {annotation-properties? true}}]
   (let [model (ModelFactory/createDefaultModel)
         pm    (model-prefix-mapping model)]
     (try
       ;; Load TTLs into model
       (doto pm
         (.setNsPrefix "rdf" (RDF/getURI))
         (.setNsPrefix "rdfs" (RDFS/getURI))
         (.setNsPrefix "owl" (OWL/getURI))
         (.setNsPrefix "xsd" (XSD/getURI)))
       (doseq [p ttl-paths]
         (RDFDataMgr/read model p))
       (apply-namespace-overrides! model namespaces)
       ;; Ensure RL predicate attributes exist before installing anything else
       (ensure-rl-attrs! conn)
       (persist-prefix-mappings! conn model)
       ;; Ensure core OWL/RDF property/class idents exist before type assertions.
       (ensure-stubs! conn #{:rdf/Property
                             :owl/Class
                             :owl/ObjectProperty
                             :owl/DatatypeProperty
                             :owl/AnnotationProperty
                             :owl/FunctionalProperty
                             :owl/InverseFunctionalProperty})
       ;; Ensure property attributes inferred from ontology
       (install-property-attributes! conn model {:annotation-properties? annotation-properties?})
       ;; Collect axioms and stub idents
       (let [attr-idents      (set (map first (d/q '[:find ?ident
                                                     :where
                                                     [?e :db/ident ?ident]
                                                     [?e :db/valueType _]]
                                                   (d/db conn))))
             ax               (collect-axioms model)
             kw-ident?        (fn [k] (and (keyword? k) (not= (namespace k) "_b")))
             bnode?           (fn [k] (and (keyword? k) (= (namespace k) "_b")))
             all-ids          (reduce (fn [acc [s m]]
                                        (let [vals (mapcat (fn [[_ vs]] vs) m)
                                              acc' (cond-> acc (kw-ident? s) (conj s))]
                                          (into acc' (filter kw-ident? vals))))
                                      #{}
                                      ax)
             ;; Ensure entities exist for any [:punk/iri iri] references in axioms
             ax-iris          (let [subs (keep (fn [s] (when (and (vector? s) (= :punk/iri (first s))) (second s))) (keys ax))
                                    objs (mapcat (fn [[_ m]]
                                                   (keep (fn [v]
                                                           (when (and (vector? v) (= :punk/iri (first v))) (second v)))
                                                         (mapcat (fn [[_ vs]] (seq vs)) m)))
                                                 ax)]
                                (into #{} (concat subs objs)))
             existing-ax-iris (set (map first (d/q '[:find ?iri :where [?e :punk/iri ?iri]] (d/db conn))))
             missing-ax-iris  (seq (remove existing-ax-iris ax-iris))
             ;; Allocate stable tempids for bnodes (subjects and objects) in this import
             all-bnodes       (into []
                                    (distinct
                                      (concat (filter bnode? (keys ax))
                                              (mapcat (fn [[_ m]] (filter bnode? (mapcat (fn [[_ vs]] (seq vs)) m))) ax))))
             tid-of           (zipmap all-bnodes (map (fn [k] (str "bnode:" (name k))) all-bnodes))
             bnode-subjects   (set (filter bnode? (keys ax)))
             ;; Rewrite axioms: assign :db/id to bnodes, :db/ident to named subjects
             rewrite          (fn [[s m]]
                                (let [s-ent (cond
                                              (kw-ident? s)                             {:db/ident s}
                                              (bnode? s)                                {:db/id (tid-of s)}
                                              (and (vector? s) (= :punk/iri (first s))) {:punk/iri (second s)})
                                      ;; Only materialize bnode objects that also appear as subjects;
                                      ;; facet bnodes (from withRestrictions) don't, so don't emit them.
                                      obj   (fn [v]
                                              (cond
                                                (and (keyword? v) (= (namespace v) "_b"))
                                                (when (contains? bnode-subjects v) (tid-of v))

                                                (keyword? v)
                                                [:db/ident v]

                                                (and (vector? v) (= :punk/iri (first v)))
                                                v

                                                :else v))
                                      m' (into {}
                                               (keep (fn [[k vs]]
                                                       (let [vs' (into #{} (keep obj) vs)]
                                                         (when (seq vs') [k vs']))))
                                               m)]
                                  (merge s-ent m')))]
         (when (seq missing-ax-iris)
           (d/transact conn {:tx-data (mapv (fn [iri] {:punk/iri iri}) missing-ax-iris)}))
         (ensure-stubs! conn (set/difference all-ids attr-idents))
         ;; Transact axioms in a single transaction so bnode tempids are coherent
         (let [tx (vec (map rewrite ax))]
           (when (seq tx)
             (doseq [chunk (partition-all 4096 tx)]
               (d/transact conn {:tx-data (vec chunk)}))))
         ;; Also import assertion triples (ABox): subject named/IRI or bnode;
         ;; include both resource (including bnodes) and typed literal objects.
         (let [stmts                 (iterator-seq (.listStatements model))
               builtin-ns            #{"rdf" "rdfs" "owl" "xsd" "db"}
               tbox-preds            #{:rdfs/subClassOf :rdfs/subPropertyOf :rdfs/domain :rdfs/range
                                       :owl/equivalentClass :owl/disjointWith :owl/intersectionOf :owl/unionOf :owl/complementOf :owl/oneOf
                                       :owl/equivalentProperty :owl/propertyDisjointWith :owl/inverseOf :owl/hasKey :owl/propertyChainAxiom
                                       :owl/onProperty :owl/onClass :owl/someValuesFrom :owl/allValuesFrom :owl/hasValue :owl/hasSelf
                                       :owl/minCardinality :owl/maxCardinality :owl/cardinality
                                       :owl/qualifiedCardinality :owl/minQualifiedCardinality :owl/maxQualifiedCardinality
                                       :owl/onDatatype :owl/onDataRange :owl/withRestrictions
                                       :db.install/attribute
                                       :rdf/first :rdf/rest}
               db                    (d/db conn)
               attr-info             (into {}
                                           (map (fn [[ident vt]] [ident vt]))
                                           (d/q '[:find ?ident ?vt-ident
                                                  :where
                                                  [?e :db/ident ?ident]
                                                  [?e :db/valueType ?vt]
                                                  [?vt :db/ident ?vt-ident]]
                                                db))
               attr-idents           (set (keys attr-info))
               kw-of                 (fn [^Resource r]
                                       (cond
                                         (.isURIResource r) (qname->kw (qname-prefer-non-empty model (.getURI r)))
                                         (.isAnon r)        (keyword "_b" (.getLabelString (.getId r)))
                                         :else              nil))
               ref-of                (fn [^Resource r]
                                       (cond
                                         (.isURIResource r) (let [uri (.getURI r)
                                                                  q   (qname-prefer-non-empty model uri)]
                                                              (or (qname->kw q) [:punk/iri uri]))
                                         (.isAnon r)        [:punk/iri (bn-iri model r)]
                                         :else              nil))
               annotation-resources  (when-not annotation-properties?
                                       (vec (iterator-seq (.listResourcesWithProperty model RDF/type OWL/AnnotationProperty))))
               annotation-prop-uris  (if annotation-properties?
                                       #{}
                                       (into #{}
                                             (keep (fn [^Resource r]
                                                     (when (.isURIResource r)
                                                       (.getURI r))))
                                             annotation-resources))
               annotation-prop-kws   (if annotation-properties?
                                       #{}
                                       (into #{}
                                             (keep (fn [^Resource r]
                                                     (when (.isURIResource r)
                                                       (kw-of r))))
                                             annotation-resources))
               annotation-predicate? (fn [^org.apache.jena.rdf.model.Property pred kw]
                                       (when-not annotation-properties?
                                         (or (and kw (contains? builtin-annotation-props kw))
                                             (let [uri (when pred (.getURI pred))]
                                               (or (and uri (contains? annotation-prop-uris uri))
                                                   (and kw (contains? annotation-prop-kws kw)))))))
               ;; Allocate tempids for all ABox bnodes so they can be referenced consistently
               all-abox-bnodes       (into []
                                           (distinct
                                             (mapcat (fn [^org.apache.jena.rdf.model.Statement st]
                                                       (let [s (.getSubject st)
                                                             o (.getObject st)]
                                                         (cond-> []
                                                           (.isAnon s)                                     (conj (keyword "_b" (.getLabelString (.getId s))))
                                                           (and (.isResource o) (.isAnon (.asResource o))) (conj (keyword "_b" (.getLabelString (.getId (.asResource o))))))))
                                                     stmts)))
               ent-ref               (fn [sr] sr)
               val-ref               (fn [orv] orv)
               subj-bnodes           (into #{}
                                           (keep (fn [^org.apache.jena.rdf.model.Statement st]
                                                   (let [s (.getSubject st)]
                                                     (when (.isAnon s)
                                                       (keyword "_b" (.getLabelString (.getId s)))))))
                                           stmts)
               obj-bnodes            (into #{}
                                           (keep (fn [^org.apache.jena.rdf.model.Statement st]
                                                   (let [o (.getObject st)]
                                                     (when (and (.isResource o) (.isAnon (.asResource o)))
                                                       (keyword "_b" (.getLabelString (.getId (.asResource o))))))))
                                           stmts)
               assertions            (keep (fn [^org.apache.jena.rdf.model.Statement st]
                                             (let [s                 (.getSubject st)
                                                   p                 (.getPredicate st)
                                                   o                 (.getObject st)
                                                   sr                (ref-of s)
                                                   pk                (kw-of p)
                                                   subj-ok           (or (and (keyword? sr)
                                                                              (not (contains? builtin-ns (namespace sr))))
                                                                         (and (vector? sr) (= :punk/iri (first sr))))
                                                   schema-directive? (and (keyword? pk)
                                                                          (let [ns (namespace pk)
                                                                                nm (name pk)]
                                                                            (or (= "db.install" ns)
                                                                                (= "db.alter" ns)
                                                                                (and (= "db" ns)
                                                                                     (or (str/starts-with? nm "install/")
                                                                                         (str/starts-with? nm "alter/"))))))
                                                   pred-ok           (and (keyword? pk)
                                                                          (not schema-directive?)
                                                                          (not (contains? tbox-preds pk))
                                                                          (contains? attr-idents pk))]
                                               (when schema-directive?
                                                 (throw (ex-info "db install attribute assertion encountered"
                                                                 {:subject sr :predicate pk :object o})))
                                               (when (and subj-ok pred-ok (not (annotation-predicate? p pk)))
                                                 (if (resource? o)
                                                   (let [res (.asResource o)
                                                         vt  (get attr-info pk)]
                                                     (cond
                                                       (= :db.type/ref vt)
                                                       (let [orv (ref-of res)]
                                                         (when orv
                                                           [:db/add (ent-ref sr) pk (val-ref orv)]))

                                                       (= :db.type/keyword vt)
                                                       (let [kw (kw-of res)]
                                                         (when kw
                                                           [:db/add (ent-ref sr) pk kw]))

                                                       (= :db.type/string vt)
                                                       (let [uri (when (.isURIResource res) (.getURI res))]
                                                         (when uri
                                                           [:db/add (ent-ref sr) pk uri]))

                                                       :else
                                                       (let [orv (ref-of res)]
                                                         (when orv
                                                           [:db/add (ent-ref sr) pk (val-ref orv)]))))
                                                   (when (literal? o)
                                                     (let [^Literal lit (.asLiteral o)
                                                           v            (literal->val lit)
                                                           coerced      (cond
                                                                          (and (= :db.type/string (get attr-info pk))
                                                                               (some? v)
                                                                               (not (string? v)))
                                                                          (do
                                                                            (log/warnf "Coercing literal %s (type %s) to string for attribute %s" v (class v) pk)
                                                                            (str v))
                                                                          :else v)]
                                                       (when (some? coerced)
                                                         [:db/add (ent-ref sr) pk coerced])))))))
                                           stmts)
               assert-tx          (->> assertions distinct vec)
               abox-ids           (into #{}
                                        (mapcat (fn [[_ subj _ obj]]
                                                  (cond-> []
                                                    (keyword? subj) (conj subj)
                                                    (keyword? obj)  (conj obj))))
                                        assert-tx)
               abox-iris          (into #{}
                                        (mapcat (fn [[_ subj _ obj]]
                                                  (cond-> []
                                                    (and (vector? subj) (= :punk/iri (first subj))) (conj (second subj))
                                                    (and (vector? obj) (= :punk/iri (first obj)))   (conj (second obj)))))
                                        assert-tx)
               existing-abox-iris (set (map first (d/q '[:find ?iri :where [?e :punk/iri ?iri]] (d/db conn))))
               missing-abox-iris  (seq (remove existing-abox-iris abox-iris))]
           (when (seq missing-abox-iris)
             (d/transact conn {:tx-data (mapv (fn [iri] {:punk/iri iri}) missing-abox-iris)}))
           (when (seq abox-ids)
             (ensure-stubs! conn abox-ids))
           (when (seq assert-tx)
             (doseq [chunk (partition-all 4096 assert-tx)]
               (d/transact conn {:tx-data (vec chunk)})))))
       :ok
       (finally
         (.close model))))))
