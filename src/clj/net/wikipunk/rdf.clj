(ns net.wikipunk.rdf
  "Universal translator for RDF data in Datomic.

  Responsibilities:
  - manage prefix mappings
  - build class/property hierarchies for `isa?` dispatch
  - `datafy` keywords/IRIs into normalized Datomic entity maps"
  (:require
   [clojure.set :as set]
   [clojure.string :as str]
   [clojure.tools.logging :as log]
   [clojure.datafy :refer [datafy]]
   [clojure.core.protocols :as proto]
   [datomic.client.api :as d]
   [com.stuartsierra.component :as com]
   [net.wikipunk.datomic.pull :as datomic-pull])
  (:import
   (java.net URLDecoder URLEncoder)
   (java.nio.charset StandardCharsets)
   (java.util UUID)))

;; ----------------------------------------------------------------------------
;; Configuration state
;; ----------------------------------------------------------------------------

(def ^:dynamic *metaobjects*
  "Map of computed hierarchies keyed by semantic role (e.g. :rdfs/Class,
  :rdf/Property). Kept in the same shape as the legacy translator so existing
  consumers continue to work."
  nil)

(def ^:dynamic *lang* "en")

(defonce ^:private !state
  (atom {:prefixes      {}
         :env-prefixes  {}
         :hierarchies   {}
         :relationships {}
         :basis-t       nil
         :conn          nil}))

(defn prefixes
  "Return the currently configured prefix map (prefix -> IRI string)."
  []
  (:prefixes @!state))

(defn current-conn
  "Return the Datomic connection currently bound by the UniversalTranslator, if any."
  []
  (:conn @!state))

(defn current-db
  "Return the Datomic db value for the currently bound connection, if any."
  []
  (when-let [conn (current-conn)]
    (d/db conn)))

(defn- normalize-prefix-map
  [m]
  (into {}
        (map (fn [[k v]]
               [(if (keyword? k) (name k) (str k))
                (some-> v str)]))
        m))

(defn configure-prefixes!
  "Merge `m` into the prefix registry. Keys may be keywords or strings,
  values are coerced to strings."
  ([m] (configure-prefixes! m {}))
  ([m _]
   (swap! !state update :prefixes
          (fn [current]
            (merge current (normalize-prefix-map m))))))

(declare reload!)

(defn- ensure-current-hierarchies!
  "Reload hierarchies when the Datomic basis advances beyond the cached snapshot."
  []
  (when-let [conn (:conn @!state)]
    (let [current-basis (:t (d/db conn))
          cached-basis  (:basis-t @!state)]
      (when (or (empty? (:hierarchies @!state))
                (nil? cached-basis)
                (< cached-basis current-basis))
        (reload!)))))

(def ^:private builtin-iri->kw
  {"http://www.w3.org/1999/02/22-rdf-syntax-ns#langString" :rdf/langString
   "http://www.w3.org/2001/XMLSchema#string"               :xsd/string
   "http://www.w3.org/2001/XMLSchema#boolean"              :xsd/boolean
   "http://www.w3.org/2001/XMLSchema#integer"              :xsd/integer
   "http://www.w3.org/2001/XMLSchema#int"                  :xsd/int
   "http://www.w3.org/2001/XMLSchema#long"                 :xsd/long
   "http://www.w3.org/2001/XMLSchema#decimal"              :xsd/decimal
   "http://www.w3.org/2001/XMLSchema#double"               :xsd/double
   "http://www.w3.org/2001/XMLSchema#float"                :xsd/float
   "http://www.w3.org/2001/XMLSchema#dateTime"             :xsd/dateTime
   "http://www.w3.org/2001/XMLSchema#dateTimeStamp"        :xsd/dateTimeStamp
   "http://www.w3.org/2001/XMLSchema#date"                 :xsd/date
   "http://www.w3.org/2001/XMLSchema#gDay"                 :xsd/gDay
   "http://www.w3.org/2001/XMLSchema#gMonth"               :xsd/gMonth
   "http://www.w3.org/2001/XMLSchema#gYear"                :xsd/gYear
   "http://www.w3.org/2001/XMLSchema#minInclusive"         :xsd/minInclusive
   "http://www.w3.org/2001/XMLSchema#maxInclusive"         :xsd/maxInclusive
   "http://www.w3.org/2001/XMLSchema#minExclusive"         :xsd/minExclusive
   "http://www.w3.org/2001/XMLSchema#maxExclusive"         :xsd/maxExclusive
   "http://www.w3.org/2001/XMLSchema#totalDigits"          :xsd/totalDigits
   "http://www.w3.org/2001/XMLSchema#fractionDigits"       :xsd/fractionDigits
   "http://www.w3.org/2001/XMLSchema#length"               :xsd/length
   "http://www.w3.org/2001/XMLSchema#minLength"            :xsd/minLength
   "http://www.w3.org/2001/XMLSchema#maxLength"            :xsd/maxLength
   "http://www.w3.org/2001/XMLSchema#pattern"              :xsd/pattern})

(defn- select-prefix
  [iri]
  (let [table (prefixes)]
    (->> table
         (keep (fn [[prefix base]]
                 (when (and base (str/starts-with? iri base))
                   [prefix base])))
         (sort-by #(count (second %)) >)
         first)))

(defn- trim-wrapping-bars
  [s]
  (if (and (string? s) (<= 2 (count s)) (= \| (first s)) (= \| (last s)))
    (subs s 1 (dec (count s)))
    s))

(defn- url-decode
  [s]
  (try
    (URLDecoder/decode s "UTF-8")
    (catch IllegalArgumentException _
      s)))

(defn- sanitize-local-name
  [segment]
  (let [decoded (-> segment trim-wrapping-bars url-decode)]
    (-> decoded
        (str/replace "/" "_SLASH_")
        (str/replace ":" "_COLON_"))))

(defn kw
  "Convert an absolute IRI string into a namespaced keyword using the current
  prefix registry. Falls back to a small built-in table for common datatypes."
  [iri]
  (cond
    (nil? iri)     nil
    (keyword? iri) iri
    :else
    (or (get builtin-iri->kw iri)
        (when-let [[prefix base] (select-prefix iri)]
          (let [local (subs iri (count base))]
            (keyword prefix (sanitize-local-name local)))))))

(defn- unsanitize-local-name
  [name-part]
  (let [stripped (trim-wrapping-bars name-part)
        restored (-> stripped
                     (str/replace "_SLASH_" "/")
                     (str/replace "_COLON_" ":"))]
    (if (re-find #"[\\s]|[#<>\"'`]" restored)
      (URLEncoder/encode restored "UTF-8")
      restored)))

(defn iri
  "Return the absolute IRI string for a keyword ident using the configured
  prefix map. Returns nil when no prefix mapping exists."
  [ident]
  (when (qualified-keyword? ident)
    (let [prefix (namespace ident)
          local  (name ident)]
      (when-let [base (get (prefixes) prefix)]
        (str base (unsanitize-local-name local))))))

(defn urn:uuid
  "Return a deterministic urn:uuid derived from the supplied IRI/string."
  [s]
  (when s
    (let [bytes (.getBytes ^String (str s) StandardCharsets/UTF_8)]
      (str "urn:uuid:" (UUID/nameUUIDFromBytes bytes)))))

;; ----------------------------------------------------------------------------
;; Datomic helpers and hierarchy construction
;; ----------------------------------------------------------------------------

(def ^:private class-types
  #{:rdfs/Class :owl/Class :rdfs/Datatype :jsonschema/DataSchema :owl/Thing})

(def ^:private property-types
  #{:rdf/Property
    :owl/ObjectProperty
    :owl/DatatypeProperty
    :owl/AnnotationProperty
    :owl/FunctionalProperty
    :owl/InverseFunctionalProperty
    :owl/TransitiveProperty
    :owl/SymmetricProperty
    :owl/AsymmetricProperty
    :owl/ReflexiveProperty
    :owl/IrreflexiveProperty
    :owl/DeprecatedProperty
    :owl/OntologyProperty
    :owl/TopObjectProperty
    :owl/TopDataProperty
    :owl/BottomObjectProperty
    :owl/BottomDataProperty
    :jsonschema/Property})

(def ^:private meta-pull
  [:db/id
   :db/ident
   :punk/iri
   {:rdf/type [:db/ident]}
   {:rdfs/subClassOf [:db/ident]}
   {:owl/equivalentClass [:db/ident]}
   {:rdfs/subPropertyOf [:db/ident]}
   {:owl/equivalentProperty [:db/ident]}
   {:schema/domainIncludes [:db/ident]}
   {:schema/rangeIncludes [:db/ident]}
   {:rdfs/domain [:db/ident]}
   {:rdfs/range [:db/ident]}
   {:skos/broader [:db/ident]}
   {:skos/narrower [:db/ident]}])

(def ^:private meta-query
  (let [pattern meta-pull]
    [:find (list 'pull '?e pattern)
     :where ['?e :db/ident]]))

(defn- pull-metaobjects
  "Return the ontology entities the translator cares about via a single query."
  [db]
  (map first (d/q meta-query db)))

(defn- fetch-prefixes
  "Fetch all persisted `:rdfa/PrefixMapping` entities from Datomic as a prefix map."
  [db]
  (try
    (into {}
          (map (fn [[prefix uri]]
                 [(if (keyword? prefix) (name prefix) (str prefix))
                  (str uri)]))
          (d/q '[:find ?prefix ?uri
                 :in $
                 :where
                 [?ctx :rdf/type :rdfa/PrefixMapping]
                 [?ctx :rdfa/prefix ?prefix]
                 [?ctx :rdfa/uri ?uri]]
               db))
    (catch Exception _
      {})))

(defn- infer-prefix-entry
  [{:keys [:db/ident :punk/iri]}]
  (when (and (qualified-keyword? ident)
             (string? iri)
             (not (str/blank? iri)))
    (let [ns     (namespace ident)
          suffix (unsanitize-local-name (name ident))]
      (when (and suffix
                 (<= (count suffix) (count iri))
                 (str/ends-with? iri suffix))
        (let [base (subs iri 0 (- (count iri) (count suffix)))]
          (when (and (not (str/blank? ns))
                     (not (str/blank? base)))
            [ns base]))))))

(defn- derive-prefixes
  "Infer `(prefix -> namespace)` mappings from the currently pulled metaobjects.

  This catches prefixes that exist in the ontology but were not explicitly
  materialised (for example, when only :punk/iri values exist). The derived map
  is conservative: it only emits entries when the entity's :punk/iri cleanly
  shares a base with its keyword ident."
  [metaobjects]
  (reduce (fn [acc [prefix base]]
            (assoc acc prefix base))
          {}
          (keep infer-prefix-entry metaobjects)))

(defn- value->idents
  "Collect every `:db/ident` keyword reachable inside `value`."
  [value]
  (cond
    (nil? value)        #{}
    (keyword? value)    #{value}
    (map? value)        (if-let [ident (:db/ident value)] #{ident} #{})
    (set? value)        (into #{} (mapcat value->idents) value)
    (sequential? value) (into #{} (mapcat value->idents) value)
    :else               #{}))

(defrecord EntityProfile [ident types class? property?
                          subclasses equivalent-classes
                          subproperties equivalent-properties
                          domains ranges broader narrower])

(defn- entity->profile
  [entity]
  (let [ident      (:db/ident entity)
        types      (value->idents (:rdf/type entity))
        subclasses (value->idents (:rdfs/subClassOf entity))
        eq-classes (value->idents (:owl/equivalentClass entity))
        subprops   (value->idents (:rdfs/subPropertyOf entity))
        eq-props   (value->idents (:owl/equivalentProperty entity))
        domains    (set/union (value->idents (:rdfs/domain entity))
                              (value->idents (:schema/domainIncludes entity)))
        ranges     (set/union (value->idents (:rdfs/range entity))
                              (value->idents (:schema/rangeIncludes entity)))
        broader    (value->idents (:skos/broader entity))
        narrower   (value->idents (:skos/narrower entity))
        class?     (boolean (seq (set/intersection types class-types)))
        property?  (boolean (seq (set/intersection types property-types)))]
    (->EntityProfile ident types class? property?
                     subclasses eq-classes subprops eq-props
                     domains ranges broader narrower)))

(defn- allowed-prefix-set
  "Normalise user-provided hierarchy filters into a string set of prefixes.

  Accepts nil, maps (keys interpreted as prefixes), sets, or sequences. Returns
  nil when no constraint should be applied."
  [allowed-prefixes]
  (when-let [items (cond
                     (nil? allowed-prefixes) nil
                     (map? allowed-prefixes) (keys allowed-prefixes)
                     (set? allowed-prefixes) allowed-prefixes
                     (sequential? allowed-prefixes) allowed-prefixes
                     :else [allowed-prefixes])]
    (when (seq items)
      (into #{}
            (map (fn [prefix]
                   (cond
                     (keyword? prefix) (name prefix)
                     (string? prefix)  prefix
                     :else             (str prefix))))
            items))))

(defn- safe-derive
  [hier child parent]
  (if (or (nil? child) (nil? parent) (= child parent))
    hier
    (try
      (cond
        (isa? hier child parent)
        hier

        (isa? hier parent child)
        (do
          (log/trace "Skipping derivation to avoid cycle"
                     {:child child :parent parent})
          hier)

        :else
        (derive hier child parent))
      (catch IllegalArgumentException ex
        (log/trace ex "Skipping derivation" {:child child :parent parent})
        hier))))

(defn- apply-relationships
  [hier pairs]
  (reduce (fn [h [child parent]]
            (safe-derive h child parent))
          hier
          pairs))

(def ^:private default-extra-derivations
  [[:rdfs/Class :rdfs/Resource]
   [:owl/Class :rdfs/Class]
   [:rdfs/Datatype :rdfs/Class]
   [:jsonschema/DataSchema :rdfs/Class]
   [:owl/Thing :rdfs/Class]
   [:rdf/Property :rdfs/Resource]
   [:owl/ObjectProperty :rdf/Property]
   [:owl/DatatypeProperty :rdf/Property]
   [:owl/AnnotationProperty :rdf/Property]
   [:owl/FunctionalProperty :rdf/Property]
   [:owl/InverseFunctionalProperty :rdf/Property]
   [:skos/Concept :rdfs/Resource]
   [:rdf/List :rdfs/Resource]])

(defn- relation-pairs
  "Return child→parent relationships extracted from ontology profiles."
  [profiles]
  (let [base      (for [{:keys [ident types]} profiles
                        parent                types
                        ;; filter RDF meta markers so both class and property hierarchies
                        ;; only reflect modeled structure (subClassOf, subPropertyOf, etc.)
                        :when                 (and ident parent
                                                   (not (class-types parent))
                                                   (not (property-types parent)))]
                    [ident parent])
        sub-class (for [{:keys [ident class? subclasses]} profiles
                        parent                            subclasses
                        :when                             (and class? ident parent
                                                               (not (class-types parent)))]
                    [ident parent])
        eq-class  (for [{:keys [ident class? equivalent-classes]} profiles
                        parent                                    equivalent-classes
                        :when                                     (and class? ident parent
                                                                   (not (class-types parent)))]
                    [ident parent])
        sub-prop  (for [{:keys [ident property? subproperties]} profiles
                        parent                                  subproperties
                        :when                                   (and property? ident parent
                                                                       (not (property-types parent)))]
                    [ident parent])
        eq-prop   (for [{:keys [ident property? equivalent-properties]} profiles
                        parent                                          equivalent-properties
                        :when                                           (and property? ident parent
                                                                           (not (property-types parent)))]
                    [ident parent])
        broader   (for [{:keys [ident broader]} profiles
                        parent                  broader
                        :when                   (and ident parent)]
                    [ident parent])
        narrower  (for [{:keys [ident narrower]} profiles
                        child                    narrower
                        :when                    (and ident child)]
                    [child ident])]
    (set (concat base sub-class eq-class sub-prop eq-prop broader narrower default-extra-derivations))))

(defn- domain-pairs
  "Return property→domain relationships extracted from ontology profiles."
  [profiles]
  (set (for [{:keys [ident property? domains]} profiles
             domain                            domains
             :when                             (and property? ident domain)]
         [ident domain])))

(defn- range-pairs
  "Return property→range relationships extracted from ontology profiles."
  [profiles]
  (set (for [{:keys [ident property? ranges]} profiles
             range                            ranges
             :when                            (and property? ident range)]
         [ident range])))

(defn- build-hierarchies
  "Construct hierarchy maps (class, property, domain, range, global) from the DB.

  Accepts optional `:extra-derivations`, the set of additional child/parent pairs,
  and `:allowed-prefixes` to restrict the identifiers that contribute."
  [db {:keys [extra-derivations allowed-prefixes metaobjects]
       :or   {extra-derivations []}}]
  (let [allowed-set    (allowed-prefix-set allowed-prefixes)
        allowed-ident? (fn [ident]
                         (or (nil? allowed-set)
                             (nil? ident)
                             (contains? class-types ident)
                             (contains? property-types ident)
                             (when-let [ns (namespace ident)]
                               (contains? allowed-set ns))))
        raw            (or metaobjects (pull-metaobjects db))
        profiles       (map entity->profile raw)
        class-ids      (set/union (set (keep (fn [{:keys [ident class?]}]
                                               (when (and class? ident (allowed-ident? ident)) ident))
                                             profiles))
                                  (set (map first (filter #(contains? class-types (first %))
                                                          default-extra-derivations)))
                                  class-types)
        property-ids   (set/union (set (keep (fn [{:keys [ident property?]}]
                                               (when (and property? ident (allowed-ident? ident)) ident))
                                             profiles))
                                  (set (map first (filter #(contains? property-types (first %))
                                                          default-extra-derivations)))
                                  property-types)
        sanitize-pairs (fn [pairs]
                         (if allowed-set
                           (->> pairs
                                (filter (fn [[child parent]]
                                          (and (allowed-ident? child)
                                               (allowed-ident? parent)))))
                           pairs))
        pairs          (set/union (sanitize-pairs (relation-pairs profiles))
                                  (sanitize-pairs (set extra-derivations)))
        class-pairs    (filter #(contains? class-ids (first %)) pairs)
        property-pairs (filter #(contains? property-ids (first %)) pairs)
        domain-rels    (sanitize-pairs (domain-pairs profiles))
        range-rels     (sanitize-pairs (range-pairs profiles))
        class-h        (apply-relationships (make-hierarchy) class-pairs)
        property-h     (apply-relationships (make-hierarchy) property-pairs)
        domain-h       (apply-relationships (make-hierarchy) domain-rels)
        range-h        (apply-relationships (make-hierarchy) range-rels)
        global-h       (apply-relationships (make-hierarchy) pairs)]
    {:hierarchies   {:rdfs/Class    class-h
                     :rdf/Property  property-h
                     :rdfs/domain   domain-h
                     :rdfs/range    range-h
                     :rdfs/Resource global-h}
     :relationships pairs}))

(defn current-hierarchies
  "Return the last computed hierarchy map, reloading if the Datomic basis
  advanced since the hierarchies were last materialised."
  []
  (ensure-current-hierarchies!)
  (:hierarchies @!state))

(defn class-hierarchy
  "Convenience accessor for the rdfs:Class hierarchy."
  []
  (:rdfs/Class (current-hierarchies)))

(defn class-descendants
  "Return the descendants of `ident` within the cached rdfs:Class hierarchy.

  Falls back to the global hierarchy when the translator has not been started."
  [ident]
  (if-let [hier (class-hierarchy)]
    (descendants hier ident)
    (descendants ident)))

(defn- install-hierarchies!
  [{:keys [hierarchies relationships]}]
  (alter-var-root #'*metaobjects* (constantly hierarchies))
  (swap! !state assoc :hierarchies hierarchies :relationships relationships)
  (when-let [global (:rdfs/Resource hierarchies)]
    (alter-var-root #'clojure.core/global-hierarchy (constantly global)))
  hierarchies)

;; ----------------------------------------------------------------------------
;; Datafy support
;; ----------------------------------------------------------------------------

(declare normalize-entity-map)

(defn- normalize-value
  "Collapse nested entity maps down to idents where available, preserving sets/seqs."
  [v]
  (cond
    (keyword? v)    v
    (map? v)        (if-let [ident (:db/ident v)]
                      ident
                      (normalize-entity-map v))
    (set? v)        (into #{} (map normalize-value) v)
    (sequential? v) (into (empty v) (map normalize-value) v)
    :else           v))

(defn- normalize-entity-map
  "Drop Datomic bookkeeping keys and normalise all values within an entity map."
  [m]
  (into {}
        (map (fn [[k v]]
               [k (normalize-value v)]))
        (dissoc m :db/id)))

(defn- pull-iri
  "Lookup an entity by `:punk/iri`, returning the full map via pull."
  [db iri]
  (when iri
    (d/pull db '[*] [:punk/iri iri])))

(defn- datafy-ident
  [ident]
  (when-let [conn (:conn @!state)]
    (some-> (datomic-pull/pull-ident conn ident)
            normalize-entity-map
            (assoc :db/ident ident))))

(defn- datafy-iri
  [iri]
  (when-let [conn (:conn @!state)]
    (let [db     (d/db conn)
          entity (pull-iri db iri)]
      (some-> entity normalize-entity-map))))

(extend-protocol proto/Datafiable
  clojure.lang.Named
  (datafy [ident]
    (cond
      (qualified-keyword? ident) (datafy-ident ident)
      (keyword? ident)           (some-> (get (prefixes) (name ident))
                                         (datafy-iri))
      (symbol? ident)            (some-> (namespace ident)
                                         (keyword)
                                         (datafy))
      :else                      nil))

  clojure.lang.IPersistentMap
  (datafy [m]
    (if-let [iri (:punk/iri m)]
      (or (datafy-iri iri) m)
      m)))

;; ----------------------------------------------------------------------------
;; Universal Translator component
;; ----------------------------------------------------------------------------

(defrecord UniversalTranslator [env prefixes hierarchy-prefixes extra-derivations base-hierarchy hierarchies relationships]
  com/Lifecycle
  (start [this]
    (let [conn (some-> env :conn)]
      (when-not conn
        (throw (ex-info "UniversalTranslator requires a Datomic connection under :env/:conn"
                        {:env env})))
      (let [db             (d/db conn)
            basis          (:t db)
            metaobjects    (pull-metaobjects db)
            derived        (derive-prefixes metaobjects)
            env-prefixes   (merge derived (fetch-prefixes db))
            user-prefixes  (normalize-prefix-map prefixes)
            configured     (merge env-prefixes user-prefixes)
            _              (configure-prefixes! configured)
            analysis       (build-hierarchies db {:extra-derivations (or extra-derivations [])
                                                  :allowed-prefixes  hierarchy-prefixes
                                                  :metaobjects       metaobjects})
            previous       (var-get #'clojure.core/global-hierarchy)]
        (swap! !state assoc
               :conn conn
               :prefixes configured
               :env-prefixes env-prefixes
               :base-hierarchy previous
               :basis-t basis
               :extra-derivations (or extra-derivations [])
               :hierarchy-prefixes hierarchy-prefixes)
        (install-hierarchies! analysis)
        (assoc this
               :base-hierarchy previous
               :prefixes configured
               :hierarchies (:hierarchies analysis)
               :relationships (:relationships analysis)))))
  (stop [this]
    (when base-hierarchy
      (alter-var-root #'clojure.core/global-hierarchy (constantly base-hierarchy)))
    (alter-var-root #'*metaobjects* (constantly nil))
    (swap! !state assoc
           :hierarchies {}
           :relationships {}
           :env-prefixes {}
           :conn nil
           :base-hierarchy nil
           :basis-t nil
           :prefixes {}
           :hierarchy-prefixes nil
           :extra-derivations [])
    (assoc this
           :base-hierarchy nil
           :hierarchies {}
           :relationships #{})))

(defn reload!
  "Recompute hierarchies using the currently stored Datomic connection.
  Accepts optional overrides: {:extra-derivations [[child parent] ...]}."
  ([] (reload! {}))
  ([{:keys [extra-derivations]}]
   (if-let [conn (:conn @!state)]
     (let [db                 (d/db conn)
           basis              (:t db)
           state              @!state
           overrides          (or extra-derivations (:extra-derivations state) [])
           hierarchy-prefixes (:hierarchy-prefixes state)
           previous-env       (:env-prefixes state)
           previous-prefixes  (:prefixes state)
           user-prefixes      (into {}
                                     (remove (fn [[k v]]
                                               (= v (get previous-env k))))
                                     previous-prefixes)
           metaobjects        (pull-metaobjects db)
           derived            (derive-prefixes metaobjects)
           env-prefixes       (merge derived (fetch-prefixes db))
           merged-prefixes    (merge env-prefixes user-prefixes)
           _                  (configure-prefixes! merged-prefixes)
           analysis           (build-hierarchies db {:extra-derivations overrides
                                                     :allowed-prefixes  hierarchy-prefixes
                                                     :metaobjects       metaobjects})]
       (swap! !state assoc
              :prefixes merged-prefixes
              :env-prefixes env-prefixes
              :basis-t basis
              :extra-derivations overrides)
       (install-hierarchies! analysis))
     (log/debug "UniversalTranslator reload skipped; no connection bound yet"))))

(defn- keyword-candidates
  [v]
  (cond
    (nil? v) []
    (keyword? v) [v]
    (map? v) (keyword-candidates (:db/ident v))
    (set? v) (mapcat keyword-candidates v)
    (sequential? v) (mapcat keyword-candidates v)
    :else []))

(defn type-of
  "Best-effort type inference for maps containing `:rdf/type` or `:db/ident`.
   Falls back to `clojure.core/type` when no hint is present."
  ([obj] (type-of obj nil))
  ([obj default]
   (cond
     (map? obj)
     (let [candidates (seq (keyword-candidates (:rdf/type obj)))
           primary    (or (some-> candidates
                                  (sort #(isa? %1 %2))
                                  first)
                          (some-> (keyword-candidates (:db/ident obj))
                                  first))]
       (or primary default (type obj)))

     :else
     (type obj))))
