(ns net.wikipunk.datomic.migrate
  "Datomic migration + ontology import runner.

  Applies schema migrations, imports TTL/RDF/OWL sources into Datomic, and
  records content-addressed migration markers for idempotent re-imports."
  (:require
   [clojure.edn :as edn]
   [clojure.java.io :as io]
   [clojure.set :as set]
   [clojure.string :as str]
   [clojure.tools.logging :as log]
   [com.stuartsierra.component :as com]
   [datomic.client.api :as d]
   [net.wikipunk.ontology.owl-rl-axioms :as ax]
   [net.wikipunk.ontology.owl-rl :as owl-rl]
   [net.wikipunk.rdf :as rdf])
  (:import
   (org.apache.jena.rdf.model ModelFactory)
   (org.apache.jena.riot RDFDataMgr)
   (org.apache.jena.vocabulary OWL)))

(def ^:private base-schema
  [;; Migration ledger attribute
   {:db/ident       :punk.migration/id
    :db/valueType   :db.type/string
    :db/cardinality :db.cardinality/one
    :db/unique      :db.unique/identity
    :db/doc         "Applied migration id marker"}
   ;; Source path (absolute or IRI) associated with a migration transaction.
   {:db/ident       :punk.migration/source
    :db/valueType   :db.type/string
    :db/cardinality :db.cardinality/many
    :db/doc         "Source TTL path(s) imported by the migration transaction."}
   ;; Group identifier tying migrations back to the root import set that triggered them.
   {:db/ident       :punk.migration/group
    :db/valueType   :db.type/string
    :db/cardinality :db.cardinality/many
    :db/doc         "Root import group identifier(s) associated with the migration transaction."}
   ;; Canonical IRI string for RDF resources that lack a valid Clojure qname.
   {:db/ident       :punk/iri
    :db/valueType   :db.type/string
    :db/cardinality :db.cardinality/one
    :db/unique      :db.unique/identity
    :db/doc         "Canonical IRI string for RDF resources without a valid Clojure keyword qname."}])

(def ^:private prefix-mapping-schema
  [;; Persistence for RDF prefix contexts (RDFa vocabulary)
   {:db/ident       :rdfa/prefix
    :db/valueType   :db.type/string
    :db/cardinality :db.cardinality/one
    :db/unique      :db.unique/identity
    :db/doc         "NCName string associated with a namespace mapping used during ontology import."}
   {:db/ident       :rdfa/uri
    :db/valueType   :db.type/string
    :db/cardinality :db.cardinality/one
    :db/doc         "Namespace base URI for an RDFa prefix mapping."}
   {:db/ident :rdfa/PrefixMapping
    :db/doc   "Entity type used to persist ontology prefix mappings imported into Datomic."}])

(def ^:private migration-window-schema
  [;; Basis t range for ontology imports to support retractions.
   {:db/ident       :punk.migration/start-t
    :db/valueType   :db.type/long
    :db/cardinality :db.cardinality/one
    :db/doc         "Basis t immediately before an ontology import executes."}
   {:db/ident       :punk.migration/end-t
    :db/valueType   :db.type/long
    :db/cardinality :db.cardinality/one
    :db/doc         "Basis t immediately after an ontology import completes."}])

(def ^:private migrations
  [{:id  "2025-08-30-0001-base"
    :txs base-schema}
   {:id  "2025-10-14-0001-prefix-mapping"
    :txs prefix-mapping-schema}
   {:id  "2025-10-15-0001-migration-window"
    :txs migration-window-schema}])

(defn- record-migration!
  "Attach migration metadata (id, optional source, basis window, and groups) to the current transaction entity."
  ([conn id] (record-migration! conn id nil nil nil nil))
  ([conn id source] (record-migration! conn id source nil nil nil))
  ([conn id source start-t end-t] (record-migration! conn id source start-t end-t nil))
  ([conn id source start-t end-t groups]
   (let [tx-data (cond-> [[:db/add "datomic.tx" :punk.migration/id id]]
                   source       (conj [:db/add "datomic.tx" :punk.migration/source source])
                   start-t      (conj [:db/add "datomic.tx" :punk.migration/start-t (long start-t)])
                   end-t        (conj [:db/add "datomic.tx" :punk.migration/end-t (long end-t)])
                   (seq groups) (into (for [g groups]
                                        [:db/add "datomic.tx" :punk.migration/group g])))]
     (try
       (d/transact conn {:tx-data tx-data})
       (catch clojure.lang.ExceptionInfo ex
         (log/error "could not install migration" {:id id :source source :start start-t :end end-t :groups groups})
         (throw ex))))))

(defn- applied?
  "Return true if migration id `mid` has been recorded in the DB."
  [db mid]
  (try
    (boolean (ffirst (d/q '[:find ?e :in $ ?id :where [?e :punk.migration/id ?id]] db mid)))
    (catch Exception _ false)))

(defn- apply-migration!
  "Transact the given migration txs and mark `id` as applied."
  [conn {:keys [id txs]}]
  (log/debugf "Applying migration %s" id)
  (d/transact conn {:tx-data txs})
  (record-migration! conn id))

(defn- load-migrations-spec
  "Normalize a migrations spec into a collection of migration maps.
   Accepts:
   - nil → use default `migrations`
   - collection → returned as a vector
   - var → dereferenced
   - string → treated as file path or classpath resource containing EDN"
  [spec]
  (let [data (cond
               (nil? spec)                       migrations
               (instance? clojure.lang.Var spec) @spec
               (string? spec)
               (let [file (io/file spec)]
                 (cond
                   (.exists file) (edn/read-string (slurp file))
                   :else
                   (if-let [res (io/resource spec)]
                     (edn/read-string (slurp res))
                     (throw (ex-info "Migration file not found" {:path spec})))))
               :else                             spec)]
    (cond
      (nil? data)        []
      (map? data)        [data]
      (sequential? data) (vec data)
      :else              (throw (ex-info "Migrations must be collection, map, string, or var"
                                         {:spec data})))))

(defn- run-migrations!
  "Apply migrations if not already present.
   Accepts optional `migs-spec` to override the default `migrations` var."
  ([conn]
   (run-migrations! conn nil))
  ([conn migs-spec]
   (doseq [m (load-migrations-spec migs-spec)]
     (let [db (d/db conn)]
       (when-not (applied? db (:id m))
         (apply-migration! conn m))))))

(declare env-empty? namespace-overrides-for-paths)

;; --- Import helpers ---------------------------------------------------------

(defn- read-model
  "Return a new Jena Model populated by reading each path in `ttl-paths`.
  Accepts file paths or IRI strings."
  [ttl-paths]
  (let [m (ModelFactory/createDefaultModel)]
    (doseq [p ttl-paths]
      (RDFDataMgr/read m p))
    m))

(defn- owl-import-uris
  "Return absolute IRI strings for owl:imports present in TTL file `p`.
  Only immediate imports are returned; no recursion. Filters to `*.ttl` targets."
  [p]
  (let [m       (read-model [p])
        stmts   (iterator-seq (.listStatements m))
        imports (filter (fn [^org.apache.jena.rdf.model.Statement st]
                          (= (.getPredicate st) OWL/imports))
                        stmts)]
    (->> imports
         (keep (fn [^org.apache.jena.rdf.model.Statement st]
                 (let [o (.getObject st)]
                   (when (.isResource o)
                     (some-> (.asResource o) .getURI)))))
         (filter #(str/ends-with? % ".ttl"))
         vec)))

(defn- sha256-hex [^bytes bs]
  (let [md (java.security.MessageDigest/getInstance "SHA-256")]
    (.update md bs 0 (alength bs))
    (->> (.digest md)
         (map (fn [b] (format "%02x" (bit-and 0xff b))))
         (apply str))))

(defn- slurp-bytes
  "Best-effort read of a path/IRI into bytes. Tries file path, then classpath resource.
  Falls back to the path string's UTF-8 bytes if content cannot be read."
  [p]
  (let [s (str p)
        f (io/file s)]
    (try
      (cond
        ;; direct file path
        (.exists f) (java.nio.file.Files/readAllBytes (.toPath f))
        ;; URL with scheme (file:, jar:, http(s):) — open stream
        (re-find #"^[a-zA-Z][a-zA-Z0-9+.-]*:" s)
        (with-open [is  (.openStream (java.net.URL. s))
                    out (java.io.ByteArrayOutputStream.)]
          (let [buf (byte-array 8192)]
            (loop []
              (let [n (.read is buf)]
                (when (pos? n)
                  (.write out buf 0 n)
                  (recur)))))
          (.toByteArray out))
        ;; classpath resource
        :else       (if-let [res (io/resource s)]
                      (with-open [is  (io/input-stream res)
                                  out (java.io.ByteArrayOutputStream.)]
                        (let [buf (byte-array 8192)]
                          (loop []
                            (let [n (.read is buf)]
                              (when (pos? n)
                                (.write out buf 0 n)
                                (recur)))))
                        (.toByteArray out))
                      (.getBytes s java.nio.charset.StandardCharsets/UTF_8)))
      (catch Throwable _
        (.getBytes s java.nio.charset.StandardCharsets/UTF_8)))))

(defn- uri->path
  "Best-effort conversion of a canonical path/URI string to a java.nio.file.Path.
   Returns nil when the string cannot be resolved to a local filesystem path."
  ^java.nio.file.Path
  [s]
  (try
    (when (string? s)
      (let [uri (java.net.URI. s)]
        (when (= "file" (.getScheme uri))
          (java.nio.file.Paths/get uri))))
    (catch Throwable _
      nil)))

(defn- import-id
  "Content-addressed id label for an import group. Combines sorted paths, optional
  importer options, and a SHA-256 over their content so changes re-import idempotently
  without reinstalling everything."
  ([paths]
   (import-id paths {}))
  ([paths {:keys [annotation-properties?] :as _opts}]
   (let [sp           (vec (sort (map str paths)))
         bytes        (java.io.ByteArrayOutputStream.)
         ns-overrides (namespace-overrides-for-paths sp (:namespace-overrides _opts))]
     (doseq [p sp]
       (.write bytes (.getBytes p java.nio.charset.StandardCharsets/UTF_8))
       (.write bytes (byte 0))
       (.write bytes (slurp-bytes p)))
     (when (false? annotation-properties?)
       (.write bytes (.getBytes "annotation-properties?=false"
                                java.nio.charset.StandardCharsets/UTF_8)))
     (when (seq ns-overrides)
       (.write bytes (.getBytes (pr-str (into (sorted-map)
                                              (for [[k v] ns-overrides]
                                                [k (into (sorted-map) v)])))
                                java.nio.charset.StandardCharsets/UTF_8)))
     (str "owl-ttl-import:"
          (sha256-hex (.toByteArray bytes))))))

(defn- root-import-id
  "Stable identifier for a root import path set and importer options. Does not depend on file contents."
  ([paths]
   (root-import-id paths {}))
  ([paths {:keys [annotation-properties?] :as _opts}]
   (let [sp           (vec (sort (map str paths)))
         bytes        (java.io.ByteArrayOutputStream.)
         ns-overrides (namespace-overrides-for-paths sp (:namespace-overrides _opts))]
     (doseq [p sp]
       (.write bytes (.getBytes p java.nio.charset.StandardCharsets/UTF_8))
       (.write bytes (byte 0)))
     (when (false? annotation-properties?)
       (.write bytes (.getBytes "annotation-properties?=false"
                                java.nio.charset.StandardCharsets/UTF_8)))
     (when (seq ns-overrides)
       (.write bytes (.getBytes (pr-str (into (sorted-map)
                                              (for [[k v] ns-overrides]
                                                [k (into (sorted-map) v)])))
                                java.nio.charset.StandardCharsets/UTF_8)))
     (str "owl-ttl-root:"
          (sha256-hex (.toByteArray bytes))))))

(defn- retire-id
  "Identifier recorded when an import source is retired (removed from the active graph).
  Depends on canonical paths and importer options so repeated retirements stay idempotent."
  ([paths]
   (retire-id paths {}))
  ([paths {:keys [annotation-properties?] :as _opts}]
   (let [sp           (vec (sort (map str paths)))
         bytes        (java.io.ByteArrayOutputStream.)
         ns-overrides (namespace-overrides-for-paths sp (:namespace-overrides _opts))]
     (doseq [p sp]
       (.write bytes (.getBytes p java.nio.charset.StandardCharsets/UTF_8))
       (.write bytes (byte 0)))
     (when (false? annotation-properties?)
       (.write bytes (.getBytes "annotation-properties?=false"
                                java.nio.charset.StandardCharsets/UTF_8)))
     (when (seq ns-overrides)
       (.write bytes (.getBytes (pr-str (into (sorted-map)
                                              (for [[k v] ns-overrides]
                                                [k (into (sorted-map) v)])))
                                java.nio.charset.StandardCharsets/UTF_8)))
     (str "owl-ttl-retire:"
          (sha256-hex (.toByteArray bytes))))))

(defn- ensure-axioms!
  "Install OWL RL axioms sections in order if not already applied."
  [conn]
  (doseq [[mid sections] [["2025-08-31-owlrl-axioms:rdfs"    [:rdfs]]
                          ["2025-08-31-owlrl-axioms:owlrl"   [:owlrl]]
                          ["2025-08-31-owlrl-axioms:owlrl-d" [:owlrl-d]]]]
    (when-not (applied? (d/db conn) mid)
      (try
        (ax/assert-axioms! conn sections)
        (record-migration! conn mid (str "owl-rl:" (str/join "," sections)))
        (catch Throwable t
          (log/error t (str "Migrator: failed to install axioms for " sections)))))))

(declare canonical-path resolve-import-path)

(defn- expand-imports
  "Expand a vector of import paths into a transitive closure of local TTL files.

  Returns a vector of canonicalised `file:` URIs covering every root and its
  nested `owl:imports`. Only those TTLs whose content hash changes will be
  re-transacted downstream."
  [paths]
  (letfn [(expand-path [{:keys [seen order] :as acc} path]
            (let [canon (canonical-path path)]
              (cond
                (or (str/blank? canon) (contains? seen canon))
                acc

                :else
                (let [imports (->> (owl-import-uris canon)
                                   (map #(resolve-import-path canon %))
                                   (filter #(str/ends-with? % ".ttl")))
                      acc'    {:seen  (conj seen canon)
                               :order (conj order canon)}]
                  (reduce expand-path acc' imports)))))]
    (-> (reduce expand-path {:seen #{} :order []}
                (remove str/blank? paths))
        :order
        vec)))

(defn- latest-migration-meta
  "Return {:tx tx-eid :id migration-id :start start-t :end end-t} describing the most recent migration recorded for `source`."
  [conn source]
  (let [db   (d/db conn)
        rows (d/q '[:find (pull ?tx [:db/id
                                     :punk.migration/id
                                     :punk.migration/start-t
                                     :punk.migration/end-t
                                     :punk.migration/group])
                    :in $ ?source
                    :where [?tx :punk.migration/source ?source]]
                  db source)]
    (when-let [entry (->> rows
                          (map first)
                          (sort-by :db/id)
                          last)]
      {:tx     (:db/id entry)
       :id     (:punk.migration/id entry)
       :start  (:punk.migration/start-t entry)
       :end    (:punk.migration/end-t entry)
       :groups (let [g (:punk.migration/group entry)]
                 (cond
                   (nil? g)        #{}
                   (sequential? g) (set g)
                   :else           #{g}))})))

(defn- known-import-sources
  "Return a set of canonical paths recorded as ontology import sources in the migration ledger."
  [conn]
  (try
    (let [rows (d/q '[:find ?source
                      :where
                      [_ :punk.migration/source ?source]]
                    (d/db conn))]
      (->> rows
           (map first)
           (filter #(and (string? %)
                         (str/ends-with? % ".ttl")))
           (into #{})))
    (catch Throwable _
      #{})))

(defn- active-import-sources
  "Return a map of canonical import sources -> latest migration metadata for TTL imports
   that remain active (latest entry still an owl-ttl-import marker)."
  [conn]
  (reduce (fn [acc source]
            (if-let [{:keys [id] :as meta} (latest-migration-meta conn source)]
              (if (and (string? id) (str/starts-with? id "owl-ttl-import:"))
                (assoc acc source meta)
                acc)
              acc))
          {}
          (known-import-sources conn)))

(def ^:private ignored-retraction-attrs
  #{:punk.migration/id
    :punk.migration/source
    :punk.migration/start-t
    :punk.migration/end-t
    :db/txInstant
    :db.install/attribute
    :db/valueType
    :db/cardinality
    :db/unique
    :db/doc
    :db/fulltext
    :db/isComponent})

(defn- attr-ident-fn
  "Return memoized function mapping attribute entity ids to their :db/ident keyword."
  [db]
  (memoize (fn [aid]
             (:db/ident (d/pull db '[:db/ident] aid)))))

(defn- attr-value-type-fn
  "Return memoized function mapping attribute entity ids to their :db/valueType keyword."
  [db]
  (memoize (fn [aid]
             (get-in (d/pull db '[{:db/valueType [:db/ident]}] aid) [:db/valueType :db/ident]))))

(defn- db-prefix-map
  "Return a map of prefix -> base IRI strings drawn from persisted :rdfa/PrefixMapping entities."
  [db]
  (try
    (into {}
          (map (fn [[prefix uri]]
                 [(some-> prefix str) (some-> uri str)]))
          (d/q '[:find ?prefix ?uri
                 :where
                 [?ctx :rdf/type :rdfa/PrefixMapping]
                 [?ctx :rdfa/prefix ?prefix]
                 [?ctx :rdfa/uri ?uri]]
               db))
    (catch Exception _
      {})))

(defn- unsanitize-local-name
  "Mirror of net.wikipunk.rdf/unsanitize-local-name. Keeps local helper so migrator
   can reconstruct IRIs without relying on global translator state."
  [name-part]
  (let [trim-wrapping-bars (fn [s]
                             (if (and (string? s)
                                      (<= 2 (count s))
                                      (= \| (first s))
                                      (= \| (last s)))
                               (subs s 1 (dec (count s)))
                               s))
        url-decode         (fn [s]
                             (try
                               (java.net.URLDecoder/decode s "UTF-8")
                               (catch IllegalArgumentException _
                                 s)))
        stripped           (trim-wrapping-bars name-part)
        restored           (-> stripped
                               url-decode
                               (str/replace "_SLASH_" "/")
                               (str/replace "_COLON_" ":"))]
    (if (re-find #"[\\s]|[#<>\"'`]" restored)
      (java.net.URLEncoder/encode restored "UTF-8")
      restored)))

(defn- ident->iri
  "Return absolute IRI string for keyword `ident` using provided `prefix-map`.
   Falls back to RDF prefix registry when available."
  [ident prefix-map]
  (when (qualified-keyword? ident)
    (or (rdf/iri ident)
        (let [ns    (namespace ident)
              base  (get prefix-map ns)
              local (unsanitize-local-name (name ident))]
          (when (and base local)
            (str base local))))))

(defn- entity-iri
  "Best-effort resolution of the absolute IRI for entity `eid`. Prefers :punk/iri, then expands :db/ident using prefix map."
  [db prefix-map eid]
  (when eid
    (let [{iri :punk/iri ident :db/ident} (d/pull db '[:punk/iri :db/ident] eid)]
      (or iri
          (ident->iri ident prefix-map)))))

(defn- datom-present?
  "Returns true when the RDF triple represented by `datom` is still asserted in the TTL model."
  [model db prefix-map attr-ident attr-value-type datom]
  (when (and model attr-ident)
    (let [subject-iri   (entity-iri db prefix-map (.e datom))
          predicate-iri (ident->iri attr-ident prefix-map)]
      (cond
        (and subject-iri predicate-iri)
        (let [^org.apache.jena.rdf.model.Model m model
              subject                            (.createResource m subject-iri)
              property                           (.createProperty m predicate-iri)]
          (if (= attr-value-type :db.type/ref)
            (if-let [object-iri (entity-iri db prefix-map (.v datom))]
              (let [present? (.contains m subject property (.createResource m object-iri))]
                (when-not present?
                  (log/debugf "datom-miss (ref) subject=%s predicate=%s object=%s"
                              subject-iri predicate-iri object-iri))
                present?)
              (do
                (log/debugf "datom-skip (ref) missing object IRI subject=%s predicate=%s eid=%s"
                            subject-iri predicate-iri (.v datom))
                true))
            (let [value (.v datom)
                  [node-kind node]
                  (cond
                    (= attr-value-type :db.type/keyword)
                    (cond
                      (keyword? value)
                      (if-let [object-iri (ident->iri value prefix-map)]
                        [:resource (.createResource m object-iri)]
                        [:literal  (.createLiteral m (name value))])
                      :else
                      [:literal (.createLiteral m (str value))])

                    (string? value)
                    [:literal (.createLiteral m value)]

                    (keyword? value)
                    (if-let [object-iri (ident->iri value prefix-map)]
                      [:resource (.createResource m object-iri)]
                      [:literal (.createLiteral m (name value))])

                    :else
                    [:typed-literal (.createTypedLiteral m value)])

                  present? (.contains m subject property node)]
              (when-not present?
                (log/debugf "datom-miss (%s) subject=%s predicate=%s value=%s"
                            (name node-kind) subject-iri predicate-iri value))
              present?)))

        (= attr-ident :db/ident)
        (if subject-iri
          (let [^org.apache.jena.rdf.model.Model m model
                subject                            (.createResource m subject-iri)
                subject-present?                   (or (seq (iterator-seq (.listStatements m subject nil nil)))
                                     (seq (iterator-seq (.listStatements m nil nil subject))))]
            (when-not subject-present?
              (log/debugf "datom-miss (ident) subject=%s" subject-iri))
            (boolean subject-present?))
          true)

        :else
        (do
          (log/debugf "datom-skip missing IRI subject=%s predicate=%s eid=%s"
                      subject-iri predicate-iri (.e datom))
          true)))))

(defn- migration-retractions
  "Return {:tx-data [...]} describing retract datoms required to remove assertions
   contributed by the most recent migration that imported `source`
   (canonical path or URI). Includes `:entities` when entire entities are
   expected to vanish once the retracts apply.

   Options map:
   - :assume-missing? — treat the TTL as absent, retracting all assertions regardless of
     current file contents (useful when a dependency was removed from the import graph)."
  ([conn source]
   (migration-retractions conn source {}))
  ([conn source {:keys [assume-missing?] :as _opts}]
   (when-let [{:keys [start end]} (latest-migration-meta conn source)]
     (when (and (some? start) (some? end) (< start end))
       (let [entries    (seq (d/tx-range conn {:start (inc (long start))
                                               :end   (inc (long end))}))
             datoms     (mapcat :data entries)
             db         (d/db conn)
             prefix-map (merge (rdf/prefixes) (db-prefix-map db))
             attr-ident (attr-ident-fn db)
             attr-vtype (attr-value-type-fn db)
             model      (when-not assume-missing?
                          (try
                            (read-model [source])
                            (catch Throwable t
                              (log/warn t "Failed to read TTL for retraction diff" {:source source})
                              nil)))
             missing?   (or assume-missing? (nil? model))
             _          (when (and missing? (not assume-missing?))
                          (log/debugf "Migrator: treating %s as absent during retraction diff" source))
             {:keys [ops per-entity]}
             (reduce (fn [{:keys [ops per-entity] :as acc} datom]
                       (if (not (.added datom))
                         acc
                         (let [ident (attr-ident (.a datom))]
                           (if (or (nil? ident)
                                   (ignored-retraction-attrs ident)
                                   (and (not missing?)
                                        (datom-present? model db prefix-map ident (attr-vtype (.a datom)) datom)))
                             acc
                             (let [ops'        (conj! ops [:db/retract (.e datom) ident (.v datom)])
                                   per-entity' (update per-entity (.e datom)
                                                       (fnil conj #{})
                                                       [ident (.v datom)])]
                               (assoc acc :ops ops' :per-entity per-entity'))))))
                     {:ops (transient []) :per-entity {}}
                     datoms)
             retracts   (persistent! ops)]
         (when (seq retracts)
           (let [entities-to-drop
                 (reduce (fn [acc [e scheduled]]
                           (let [current   (->> (d/datoms db {:index :eavt :components [e]})
                                                (keep (fn [datom]
                                                        (let [ident (attr-ident (.a datom))]
                                                          (when ident
                                                            [ident (.v datom)]))))
                                                (remove nil?)
                                                set)
                                 leftovers (set/difference current scheduled)]
                             (if (empty? leftovers)
                               (conj acc e)
                               acc)))
                         #{}
                         per-entity)
                 filtered   (if (seq entities-to-drop)
                              (into [] (remove (fn [op] (contains? entities-to-drop (nth op 1)))) retracts)
                              retracts)
                 entity-ops (mapv (fn [e] [:db/retractEntity e]) entities-to-drop)]
             {:tx-data  (into filtered entity-ops)
              :entities entities-to-drop})))))))

(defn- normalize-namespace-map
  "Normalize a prefix -> URI mapping into a string-keyed map."
  [m]
  (when (map? m)
    (->> m
         (keep (fn [[k v]]
                 (let [prefix (cond
                                (keyword? k) (name k)
                                (symbol? k)  (name k)
                                :else        (str k))
                       uri    (when (some? v) (str v))]
                   (when (and (seq prefix) (seq uri))
                     [prefix uri]))))
         (into {}))))

(defn- import-spec->entry
  "Resolve an import spec to a collection of {:source \"...\" :namespaces {...}} entries.
  Supports strings, symbols/vars (resolved/deref'd), maps with :dcat/downloadURL
  or :rdfa/uri, and nested collections of those. Includes namespace overrides
  from :namespaces and/or :rdfa/prefix + :rdfa/uri."
  [spec]
  (let [resolved (cond
                   (var? spec)    (var-get spec)
                   (symbol? spec) (let [v (requiring-resolve spec)]
                                    (cond
                                      (var? v)  (var-get v)
                                      (some? v) v
                                      :else     (do
                                              (log/warnf "Migrator: cannot resolve import symbol %s" spec)
                                              nil)))
                   :else          spec)]
    (cond
      (string? resolved) [{:source resolved}]

      (map? resolved)
      (let [url        (or (:dcat/downloadURL resolved)
                           (:rdfa/uri resolved))
            namespaces (merge
                         (when (and (:rdfa/prefix resolved) (:rdfa/uri resolved))
                           {(str (:rdfa/prefix resolved)) (str (:rdfa/uri resolved))})
                         (normalize-namespace-map (:namespaces resolved)))
            entry      (cond-> {:source (when (some? url) (str url))}
                         (seq namespaces) (assoc :namespaces namespaces))]
        (if (some? url)
          [entry]
          (do
            (log/warnf "Migrator: import map missing :dcat/downloadURL or :rdfa/uri %s"
                       (pr-str (select-keys resolved [:dcat/downloadURL :rdfa/uri :rdfa/prefix :db/ident])))
            [])))

      (sequential? resolved) (mapcat import-spec->entry resolved)
      (nil? resolved)        []
      :else                  [])))

(defn- namespace-overrides-for-paths
  "Normalize namespace overrides so they are keyed by canonical path strings and
  carry stable, string-keyed prefix maps."
  [paths overrides]
  (let [path-set (->> paths (map str) (map canonical-path) set)]
    (->> overrides
         (keep (fn [[path ns]]
                 (let [canon (canonical-path (str path))]
                   (when (and (contains? path-set canon) (seq ns))
                     [canon (normalize-namespace-map ns)]))))
         (into {}))))

(defn- canonical-path
  "Normalize `p` to a canonical URI string suitable for content hashing.
   Local filesystem paths (with or without `file:` scheme) are converted to
   canonical `file:` URIs; other schemes pass through unchanged."
  [p]
  (let [s               (str p)
        classpath?      (fn [v] (str/starts-with? v "classpath:"))
        strip-classpath (fn [v]
                          (if (classpath? v)
                            (subs v (count "classpath:"))
                            v))
        resource-url    (fn [v]
                          (when-let [res (io/resource (strip-classpath v))]
                         (.toString res)))]
    (if (str/blank? s)
      s
      (try
        (let [resolved    (or (resource-url s) s)
              has-scheme? (re-find #"^[a-zA-Z][a-zA-Z0-9+.-]*:" resolved)]
          (cond
            has-scheme?
            (let [uri (java.net.URI. resolved)]
              (if (= "file" (.getScheme uri))
                (-> uri io/file .getCanonicalFile .toURI .toString)
                (.toString uri)))
            :else
            (-> resolved io/file .getCanonicalFile .toURI .toString)))
        (catch Throwable _
          s)))))

(defn- resolve-import-path
  "Resolve an import URI relative to the directory containing `base` when the URI
   lacks a scheme."
  [base import-uri]
  (let [import-uri (if (str/starts-with? import-uri "classpath:")
                     (subs import-uri (count "classpath:"))
                     import-uri)]
    (if (re-find #"^[a-zA-Z][a-zA-Z0-9+.-]*:" import-uri)
      import-uri
      (let [base-uri (if (re-find #"^[a-zA-Z][a-zA-Z0-9+.-]*:" base)
                       (java.net.URI. base)
                       (.toURI (io/file base)))]
        (canonical-path (.toString (.resolve base-uri import-uri)))))))

(defn- ion-app-info
  "Best-effort check for Datomic Ion app info without requiring the ion lib."
  []
  (try
    (when-let [f (requiring-resolve 'datomic.ion/get-app-info)]
      (f))
    (catch Throwable _
      nil)))

(defn- build-import-graph
  "Given root TTL paths, walk owl:imports to build a dependency graph mapping
   canonical path -> vector of canonical dependency paths."
  [roots]
  (letfn [(deps-for [path]
            (->> (owl-import-uris path)
                 (map #(resolve-import-path path %))
                 (map canonical-path)
                 (filter #(str/ends-with? % ".ttl"))
                 (remove #(= % path))
                 vec))]
    (loop [queue (into clojure.lang.PersistentQueue/EMPTY (map canonical-path roots))
           seen  #{}
           graph {}]
      (if (empty? queue)
        (let [nodes (set (concat (keys graph) (mapcat identity (vals graph))))]
          (reduce (fn [g n] (update g n #(or % []))) graph nodes))
        (let [path   (peek queue)
              queue' (pop queue)]
          (if (seen path)
            (recur queue' seen graph)
            (let [deps      (deps-for path)
                  new-queue (reduce conj queue' (remove seen deps))
                  graph'    (reduce (fn [g dep]
                                      (update g dep #(vec (distinct (conj (or % []) path)))))
                                    graph
                                    deps)
                  graph''   (update graph' path #(or % []))]
              (recur new-queue
                     (conj seen path)
                     graph''))))))))

(defn- find-cycle
  "Return a vector describing one detected cycle in the dependency graph, if any.
  Graph entries map dependency -> [dependents]."
  [graph]
  (let [nodes    (set (concat (keys graph) (mapcat identity (vals graph))))
        deps-map (into {}
                       (for [n nodes]
                         [n (vec (for [[dep dependents] graph
                                       :when            (some #(= % n) dependents)]
                                   dep))]))
        visited  (java.util.HashSet.)
        cycle    (atom nil)]
    (letfn [(dfs [node stack stack-set]
              (when (and (nil? @cycle) node)
                (cond
                  (contains? stack-set node)
                  (let [idx (.indexOf ^java.util.List stack node)
                        sub (subvec stack idx)]
                    (reset! cycle (conj (vec sub) node)))

                  (.contains visited node)
                  nil

                  :else
                  (do
                    (.add visited node)
                    (let [stack'     (conj stack node)
                          stack-set' (conj stack-set node)]
                      (doseq [dep (get deps-map node)]
                        (dfs dep stack' stack-set')))))))]
      (doseq [n nodes]
        (dfs n [] #{}))
      @cycle)))

(defn- topo-sort
  "Topologically sort the dependency graph returned by `build-import-graph`.
   Returns a vector of canonical paths in dependency order."
  [graph]
  (let [nodes      (set (concat (keys graph) (mapcat identity (vals graph))))
        indeg      (reduce (fn [m [_ deps]]
                             (reduce (fn [acc dep]
                                       (update acc dep (fnil inc 0)))
                                     m
                                     deps))
                           (zipmap nodes (repeat 0))
                           graph)
        next-nodes (into (sorted-set)
                         (for [n nodes :when (zero? (get indeg n 0))] n))]
    (loop [order []
           indeg indeg
           queue next-nodes]
      (if (empty? queue)
        (if (= (count order) (count nodes))
          order
          (let [cycle (find-cycle graph)]
            (throw (ex-info (str "Cycle detected in ontology imports"
                                 (when cycle
                                   (str " -> " (str/join " -> " cycle))))
                            (cond-> {:graph graph}
                              cycle (assoc :cycle cycle))))))
        (let [n       (first queue)
              queue'  (disj queue n)
              order'  (conj order n)
              deps    (get graph n [])
              indeg'  (reduce (fn [m d] (update m d dec)) indeg deps)
              queue'' (reduce (fn [q d]
                                (if (zero? (get indeg' d))
                                  (conj q d)
                                  q))
                              queue'
                              deps)]
          (recur order' indeg' queue''))))))

(defn- import-ontologies-once!
  "Idempotently import ontology files via the OWL RL importer. Avoids re-imports
  by recording a content-addressed migration marker built from the exact path set
  and their bytes."
  ([conn paths]
   (import-ontologies-once! conn paths {}))
  ([conn paths opts]
   (let [opts                (or opts {})
         entries             (->> paths
                      (filter some?)
                      (map (fn [p] (if (map? p) p {:source p})))
                      (filter :source)
                      vec)
         sources             (map :source entries)
         entry-overrides     (->> entries
                                  (keep (fn [{:keys [source namespaces]}]
                                      (when (seq namespaces)
                                        [(canonical-path source) (normalize-namespace-map namespaces)])))
                                  (into {}))
         opt-overrides       (namespace-overrides-for-paths sources (:namespace-overrides opts))
         namespace-overrides (merge opt-overrides entry-overrides)
         opts                (assoc opts :namespace-overrides namespace-overrides)]
     (when-let [canon-input (->> sources
                                 (filter some?)
                                 (map canonical-path)
                                 (remove str/blank?)
                                 distinct
                                 vec
                                 seq)]
       (let [root-group-id    (root-import-id canon-input opts)
             content-group-id (import-id (vec canon-input) opts)
             graph            (build-import-graph canon-input)
             ordered          (vec (distinct (topo-sort graph)))
             current-set      (set ordered)
             scope-paths      (->> canon-input
                                 (keep (fn [p]
                                         (some-> (uri->path p) .getParent)))
                                 (into #{}))
             active-sources   (active-import-sources conn)
             ttl-in-scope?    (fn [ttl {:keys [groups]}]
                                (let [groups (or groups #{})]
                                (cond
                                  (contains? groups root-group-id) true
                                  (and (empty? groups) (seq scope-paths))
                                  (when-let [ttl-path (uri->path ttl)]
                                    (some #(when %
                                             (.startsWith ^java.nio.file.Path ttl-path
                                                          ^java.nio.file.Path %))
                                          scope-paths))
                                  :else                            false)))
             scoped-active    (into {}
                                  (filter (fn [[ttl meta]] (ttl-in-scope? ttl meta)))
                                  active-sources)
             ttl-info         (into {}
                                    (for [ttl  ordered
                                          :let [latest (latest-migration-meta conn ttl)
                                                new-id (import-id [ttl] opts)]]
                                      [ttl {:latest latest :id new-id}]))
             pending          (into [] (filter (fn [ttl]
                                                 (let [{:keys [latest id]} (get ttl-info ttl)]
                                                 (not= id (:id latest))))) ordered)
             pending-set      (set pending)
             retired          (into [] (remove current-set) (keys scoped-active))]
         (doseq [ttl  retired
                 :let [{:keys [end]} (get scoped-active ttl)
                       basis-before (or end (:t (d/db conn)))
                       start-t (if (number? basis-before) (long basis-before) -1)
                       {:keys [tx-data entities]} (migration-retractions conn ttl {:assume-missing? true})]]
           (log/debugf "Migrator: retiring removed ontology source %s" ttl)
           (when (seq tx-data)
             (log/debugf "Migrator: retracting stale assertions for retired %s (%d datoms)" ttl (count tx-data))
             (d/transact conn {:tx-data tx-data})
             (when (seq entities)
               (let [db-after (d/db conn)]
                 (doseq [eid entities]
                   (log/debugf "Migrator: post-retract entity %d present? %s"
                               eid (boolean (d/pull db-after '[:db/id] eid)))))))
           (let [curr       (:t (d/db conn))
                 end-t      (if (number? curr) (long curr) start-t)
                 retire-id' (retire-id [ttl] opts)]
             (record-migration! conn retire-id' ttl start-t end-t [root-group-id])))
         (doseq [ttl ordered :when (contains? pending-set ttl)]
           (let [{:keys [tx-data entities]} (migration-retractions conn ttl)]
             (when (seq tx-data)
               (log/debugf "Migrator: retracting stale assertions for %s (%d datoms)" ttl (count tx-data))
               (d/transact conn {:tx-data tx-data})
               (when (seq entities)
                 (let [db-after (d/db conn)]
                   (doseq [eid entities]
                     (log/debugf "Migrator: post-retract entity %d present? %s"
                                 eid (boolean (d/pull db-after '[:db/id] eid)))))))
             (let [start-t (long (or (:t (d/db conn)) -1))]
               (log/debugf "Migrator: importing %s" ttl)
               (let [ns-override (get namespace-overrides ttl)
                     import-opts (cond-> (dissoc opts :namespace-overrides)
                                   (seq ns-override) (assoc :namespaces ns-override))]
                 (owl-rl/import-ontologies! conn [ttl] import-opts))
               (let [target (inc start-t)
                     end-t  (loop [attempt 0]
                              (let [curr (:t (d/db conn))]
                                (cond
                                  (and (number? curr)
                                       (>= (long curr) target)) (long curr)
                                  (< attempt 50)
                                  (do (Thread/sleep (long (Math/min 200 (* 5 (inc attempt)))))
                                      (recur (inc attempt)))
                                  (number? curr)                (long curr)
                                  :else                         start-t)))]
                 (when (< end-t target)
                   (log/warnf "Migrator: import of %s did not advance basis t (start %d end %d)" ttl start-t end-t))
                 (let [id (:id (get ttl-info ttl))]
                   (record-migration! conn id ttl start-t end-t [root-group-id]))))))
         (when (and content-group-id (> (count canon-input) 1)
                    (not (applied? (d/db conn) content-group-id)))
           (log/debug (str "Migrator: recording group import marker " content-group-id))
           (record-migration! conn content-group-id)))))))

(defn- env-empty? [db]
  (nil? (ffirst (d/q '[:find ?e :where [?e :db/ident :rdf/type]] db))))

(defn- start-migrator
  "Run schema/ontology migrations for a Datomic connection. Options:
   :annotation-properties? (default true) — include annotation properties during ontology import
   :skip-when-ion? (default false) — no-op when running inside an Ion app
   :reload? (default true) — call rdf/reload! after imports
   :cleanup-bnodes? (default true) — retract :db/ident from blank-node artefacts"
  [this]
  (let [label                  (or (:label this) "Migrator")
        annotation-properties? (get this :annotation-properties? true)
        import-opts            {:annotation-properties? annotation-properties?}
        skip-when-ion?         (if (contains? this :skip-when-ion?)
                                 (:skip-when-ion? this)
                                 false)
        reload?                (if (contains? this :reload?)
                                 (:reload? this)
                                 true)
        cleanup-bnodes?        (if (contains? this :cleanup-bnodes?)
                                 (:cleanup-bnodes? this)
                                 true)
        conn                   (some-> this :conn :conn)
        import-entries         (->> (or (:imports this) [])
                                    (mapcat import-spec->entry)
                                    (filter :source)
                                    vec)
        import-roots           (->> import-entries
                                    (map :source)
                                    (map str)
                                    (remove str/blank?)
                                    vec)
        namespace-overrides    (->> import-entries
                                    (keep (fn [{:keys [source namespaces]}]
                                            (when (seq namespaces)
                                              [(canonical-path source) (normalize-namespace-map namespaces)])))
                                    (into {}))
        import-opts            (assoc import-opts :namespace-overrides namespace-overrides)
        expanded-paths         (expand-imports import-roots)]
    (cond
      (and skip-when-ion? (ion-app-info))
      (do (log/debug (str label ": skipping migrations inside Ion")) this)

      (nil? conn)
      (do (log/debug (str label ": connection not available; skipping migrations")) this)

      :else
      (do
        (log/debug (str label ": starting run-migrations!"))
        (run-migrations! conn)
        (log/debug (str label ": completed run-migrations!"))
        (log/debug (str label ": running owl-rl/import-ontologies! with []"))
        (owl-rl/import-ontologies! conn [] import-opts)
        (log/debug (str label ": completed owl-rl/import-ontologies! []"))
        (log/debug (str label ": ensuring OWL RL axioms"))
        (ensure-axioms! conn)
        (log/debug (str label ": axioms ensured"))
        (when (seq import-roots)
          (log/debug (str label ": importing " (pr-str expanded-paths)))
          (import-ontologies-once! conn import-roots import-opts))
        (when-let [extra (:migrations this)]
          (log/debug (str label ": applying extra migrations (" (count extra) ")"))
          (run-migrations! conn extra))
        (when reload?
          (try
            (rdf/reload!)
            (catch Throwable t
              (log/warn t (str label ": rdf/reload! failed")))))
        (when cleanup-bnodes?
          (try
            (let [idents-to-retract (->> (d/q '[:find ?e ?ident
                                                :where
                                                [?e :db/ident ?ident]
                                                (or [?e :rdf/type :owl/Restriction]
                                                    [?e :rdf/first]
                                                    [?e :rdf/rest]
                                                    [?e :rdf/type :rdf/List])]
                                              (d/db conn))
                                         (map (fn [[e ident]] [:db/retract e :db/ident ident]))
                                         vec)]
              (when (seq idents-to-retract)
                (d/transact conn {:tx-data idents-to-retract})))
            (catch Throwable t
              (log/error t (str label ": cleanup skipped")))))
        (when (env-empty? (d/db conn))
          (log/debug (str label ": database remains empty after migrations")))
        (log/debug (str label ": finished start sequence"))
        this))))

(defrecord Migrator [conn label imports migrations annotation-properties? skip-when-ion? reload? cleanup-bnodes?]
  com/Lifecycle
  (start [this] (start-migrator this))
  (stop [this] this))
