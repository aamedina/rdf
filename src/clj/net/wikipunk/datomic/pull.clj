(ns net.wikipunk.datomic.pull
  "Utilities for recursively pulling Datomic entities by ident without relying on
   project-specific MOP integrations. Normalized results never include :db/id, and
   nested entities with idents collapse to those idents."
  (:require
   [clojure.string :as str]
   [clojure.walk :as walk]
   [datomic.client.api :as d]))

(def ^:private default-selector
  '[*])

(def ^:private bnode-prefix "urn:wikipunk:bnode:")

(defn- entity-map?
  [value]
  (and (map? value)
       (contains? value :db/id)))

(defn- rdf-list-node?
  [m]
  (and (map? m)
       (contains? m :rdf/first)
       (contains? m :rdf/rest)))

(def ^:private rdf-list-marker ::rdf-list)

(defn- collapse-rdf-list
  [node]
  (let [result
        (loop [cur node
               acc []
               seen #{}]
          (cond
            (or (nil? cur) (= cur :rdf/nil))
            (vec acc)

            (vector? cur)
            (into (vec acc) cur)

            (and (map? cur)
                 (not (seen cur))
                 (contains? cur :rdf/first))
            (recur (:rdf/rest cur)
                   (conj acc (:rdf/first cur))
                   (conj seen cur))

            :else
            (conj (vec acc) cur)))]
    (with-meta result {rdf-list-marker true})))

(defn- strip-bnode-iri
  [m]
  (if (and (map? m)
           (string? (:punk/iri m))
           (str/starts-with? (:punk/iri m) bnode-prefix))
    (dissoc m :punk/iri)
    m))

(defn- postprocess
  "Secondary normalization pass that collapses RDF helper shapes and prunes
  wrapper maps."
  [value]
  (walk/postwalk
    (fn [form]
      (cond
        (and (map? form)
             (= 1 (count form))
             (contains? form :rdf/value))
        (:rdf/value form)

        (rdf-list-node? form)
        (collapse-rdf-list form)

        (and (sequential? form)
             (not (map-entry? form)))
        (if (rdf-list-marker (meta form))
          (vec form)
          (into #{} form))

        (map? form)
        (strip-bnode-iri form)

        :else
        form))
    value))

(defn pull-ident
  "Recursively pulls the entity addressed by `ident` from the Datomic connection `conn`.

  Nested entities collapse to their `:db/ident` keywords when present; anonymous
  entities (\"blank nodes\") remain as expanded maps. RDF list structures normalize
  into vectors, and `:rdf/value` singletons unwrap to the contained value.

  Options:
  * `:selector` – custom pull pattern (defaults to `[*]`)
  * `:max-depth` – non-negative integer limit for recursive expansion (defaults to unlimited)"
  ([conn ident]
   (pull-ident conn ident {}))
  ([conn ident {:keys [selector max-depth]}]
   (let [selector*  (or selector default-selector)
         depth-limit (if (some? max-depth) (max 0 (long max-depth)) Long/MAX_VALUE)
         db        (d/db conn)
         cache     (atom {})]
     (letfn [(descend-depth [depth]
               (if (= depth Long/MAX_VALUE)
                 Long/MAX_VALUE
                 (dec depth)))

             (cached-result [eid]
               (some-> @cache (get eid)))

             (cache-pending! [eid ident]
               (when eid
                 (swap! cache assoc eid {:state :pending :ident ident})))

             (cache-complete! [eid ident value]
               (when eid
                 (swap! cache assoc eid {:state :done :ident ident :value value})))

             (normalize-collection [coll depth]
               (into (empty coll) (map #(normalize-value % depth)) coll))

             (normalize-plain-map [m depth]
               (let [normalized (reduce-kv (fn [acc k v]
                                             (let [nv (normalize-value v depth)]
                                               (cond-> acc (some? nv) (assoc k nv))))
                                           {}
                                           m)]
                 (cond
                   (rdf-list-node? normalized)
                 (collapse-rdf-list normalized)

                 (and (= 1 (count normalized))
                      (contains? normalized :rdf/value))
                 (:rdf/value normalized)

                 :else
                 (if (map? normalized)
                   (strip-bnode-iri normalized)
                   normalized))))

             (normalize-entity [m depth root?]
               (let [eid   (:db/id m)
                     entry (and eid (cached-result eid))]
                 (cond
                   (and entry (= :done (:state entry)))
                   (:value entry)

                   (and entry (= :pending (:state entry)))
                   (:ident entry)

                   :else
                   (let [raw    (if (and (> (count m) 1))
                                  m
                                  (d/pull db selector* eid))
                         ident  (:db/ident raw)
                         depth' (descend-depth depth)]
                     (cache-pending! eid ident)
                     (let [result (cond
                                    (and (not root?) (<= depth 0) ident)
                                    ident

                                    (and (not root?) (<= depth 0))
                                    (normalize-plain-map (dissoc raw :db/id) depth)

                                    (and (not root?) ident)
                                    ident

                                    :else
                                    (let [body (reduce-kv (fn [acc k v]
                                                            (if (= k :db/id)
                                                              acc
                                                              (let [nv (normalize-value v depth')]
                                                                (cond-> acc (some? nv) (assoc k nv)))))
                                                          {}
                                                          raw)]
                                      (dissoc body :db/id)))
                           result' (if (map? result)
                                     (strip-bnode-iri result)
                                     result)]
                       (cache-complete! eid ident result')
                       result')))))

             (normalize-value [value depth]
               (cond
                 (entity-map? value)
                 (normalize-entity value depth false)

                 (map? value)
                 (normalize-plain-map value depth)

                 (set? value)
                 (into #{} (map #(normalize-value % depth)) value)

                 (sequential? value)
                 (normalize-collection value depth)

                 :else
                 value))]

       (let [target (cond
                      (vector? ident) ident
                      (map? ident) ident
                      (keyword? ident) [:db/ident ident]
                      :else ident)
             root   (d/pull db selector* target)]
         (when (and root (some? (:db/id root)))
           (-> (normalize-entity root depth-limit true)
               (postprocess))))))))
