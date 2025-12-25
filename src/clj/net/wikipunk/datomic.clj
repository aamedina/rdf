(ns net.wikipunk.datomic
  "Minimal Datomic component wrapper.

  `Connection` is a component that also satisfies the Datomic client
  protocols so you can pass the component anywhere a connection/db is expected."
  (:require
   [com.stuartsierra.component :as com]
   [datomic.client.api :as d]
   [datomic.client.api.protocols :as impl]
   [datomic.client.api.impl]))

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
