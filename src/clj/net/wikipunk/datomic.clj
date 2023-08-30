(ns net.wikipunk.datomic
  "A simple component that connects to a datomic database using an
  injected :client.

  :conn -- datomic client connection
  :db-name -- name of the database"
  (:require
   [clojure.walk :as walk]
   [com.stuartsierra.component :as com]
   [datomic.client.api :as d]
   [datomic.client.api.protocols :as impl]
   [net.wikipunk.mop :as mop]
   [net.wikipunk.rdf :as rdf]))

(defrecord Connection [client db-name conn]
  com/Lifecycle
  (start [this]
    (d/create-database client {:db-name db-name})
    (assoc this :conn (d/connect client {:db-name db-name})))
  (stop [this]
    (assoc this :conn nil))

  impl/Db
  (as-of [_ time-point]
    (impl/as-of (d/db conn) time-point))
  (datoms [_ arg-map]
    (impl/datoms (d/db conn) arg-map))
  (db-stats [_]
    (impl/db-stats (d/db conn)))
  (history [_]
    (impl/history (d/db conn)))
  (index-pull [_ arg-map]
    (impl/index-pull (d/db conn) arg-map))
  (index-range [_ arg-map]
    (impl/index-range (d/db conn) arg-map))
  (pull [_ arg-map]
    (impl/pull (d/db conn) arg-map))
  (pull [_ selector eid]
    (impl/pull (d/db conn) selector eid))
  (since [_ t]
    (impl/since (d/db conn) t))
  (with [_ arg-map]
    (impl/with (d/db conn) arg-map))

  impl/Connection
  (db [_]
    (d/db conn))
  (transact [_ arg-map]
    (impl/transact conn arg-map))
  (sync [_ t]
    (impl/sync conn t))
  (tx-range [_ arg-map]
    (impl/tx-range conn arg-map))
  (with-db [_]
    (impl/with-db conn))

  impl/Client
  (administer-system [_ arg-map]
    (impl/administer-system client (merge {:db-name db-name} arg-map)))
  (list-databases [_ arg-map]
    (impl/list-databases client arg-map))
  (connect [_ arg-map]
    (impl/connect client (merge {:db-name db-name} arg-map)))
  (create-database [_ arg-map]
    (impl/create-database client (merge {:db-name db-name} arg-map)))
  (delete-database [_ arg-map]
    (impl/delete-database client (merge {:db-name db-name} arg-map)))

  datomic.client.api.impl/Queryable
  (q [_ arg-map]
    (d/q (assoc arg-map :args (into [(d/db (first (:args arg-map)))]
                                    (rest (:args arg-map))))))
  (qseq [_ arg-map]
    (d/qseq (assoc arg-map :args (into [(d/db (first (:args arg-map)))]
                                       (rest (:args arg-map)))))))

(def ^:dynamic *pull*
  "A pull expression for datomic entities."
  '[*])

(defmethod mop/find-class-using-env [clojure.lang.Keyword net.wikipunk.datomic.Connection]
  [ident env]
  (when-some [m (not-empty (walk/prewalk (fn [form]
                                           (if (map? form)
                                             (cond
                                               (and (contains? form :db/ident)
                                                    (not= ident (:db/ident form)))
                                               (:db/ident form)

                                               (and (:db/id form)
                                                    (not (contains? form :db/ident)))
                                               (dissoc (d/pull env *pull* (:db/id form)) :db/id)

                                               :else (dissoc form :db/id))
                                             form))
                                         (d/pull env *pull* ident)))]
    (cond-> m
      (:rdf/type m)
      (update :rdf/type #(filterv keyword? %)))))

(defn- pull-simple
  [env selector id]
  (when-some [m (not-empty (walk/prewalk (fn [form]
                                           (if (map? form)
                                             (cond
                                               (contains? form :db/ident)
                                               (:db/ident form)

                                               :else form)
                                             form))
                                         (d/pull env selector id)))]
    (cond-> m
      (:rdf/type m)
      (update :rdf/type #(filterv keyword? %)))))

(defmethod mop/find-class-using-env [clojure.lang.Sequential net.wikipunk.datomic.Connection]
  [lookup-ref env]
  (when (and (= (count lookup-ref) 2)
             (qualified-keyword? (first lookup-ref)))
    (pull-simple env *pull* lookup-ref)))

(defmethod mop/find-class-using-env [clojure.lang.IPersistentMap net.wikipunk.datomic.Connection]
  [m env]
  (when-some [id (:db/id m)]
    (pull-simple env *pull* id)))

(defmethod mop/find-class-using-env [java.lang.Long net.wikipunk.datomic.Connection]
  [id env]
  (pull-simple env *pull* id))

(defmethod mop/intern-class-using-env [:rdfs/Class net.wikipunk.datomic.Connection]
  [class env]
  (try
    (d/transact env {:tx-data [(dissoc (rdf/freezable class) :xt/id)]})
    (catch Throwable ex
      (throw (ex-info (.getMessage ex) {:class class} ex)))))
