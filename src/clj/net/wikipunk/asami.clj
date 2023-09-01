(ns net.wikipunk.asami
  (:require
   [com.stuartsierra.component :as com]
   [asami.core :as asami]
   [asami.storage]
   [net.wikipunk.mop :as mop]))

(defrecord Connection [uri conn]
  com/Lifecycle
  (start [this]
    (asami/create-database uri)
    (assoc this :conn (asami/connect uri)))
  (stop [this]
    (assoc this :conn nil))

  asami.storage/Connection
  (open? [_] (asami.storage/open? conn))
  (get-name [_] (asami.storage/get-name conn))
  (get-url [_] (asami.storage/get-url conn))
  (next-tx [_] (asami.storage/next-tx conn))
  (get-lock [_] (asami.storage/get-lock conn))
  (db [_] (asami.storage/db conn))
  (delete-database [_] (asami.storage/delete-database conn))
  (release [_] (asami.storage/release conn))
  (transact-update [_ update-fn] (asami.storage/transact-update conn update-fn))
  (transact-data [_ updates! asserts retracts] (asami.storage/transact-data conn updates! asserts retracts))
  (transact-data [_ updates! generator-fn] (asami.storage/transact-data conn updates! generator-fn))

  asami.storage/Database
  (as-of [_ t] (asami.storage/as-of (asami/db conn) t))
  (as-of-t [_] (asami.storage/as-of-t (asami/db conn)))
  (as-of-time [_] (asami.storage/as-of-time (asami/db conn)))
  (since [_ t] (asami.storage/since (asami/db conn) t))
  (since-t [_] (asami.storage/since-t (asami/db conn)))
  (graph [_] (asami.storage/graph (asami/db conn)))
  (entity [_ id nested?]
    (when-some [e (asami.storage/entity (asami/db conn) id nested?)]
      (if (qualified-keyword? id)
        (assoc e :db/ident id)
        e))))

(defmethod mop/intern-class-using-env [:rdfs/Class net.wikipunk.asami.Connection]
  [class env]
  (try
    (asami/transact (:conn env) {:tx-data [class]})
    (catch Throwable ex
      (throw (ex-info (.getMessage ex) {:class class} ex)))))

(defmethod mop/intern-class-using-env [clojure.lang.Sequential net.wikipunk.asami.Connection]
  [tx-data env]
  (try
    (doseq [part (partition-all 4096 tx-data)]
      (asami/transact (:conn env) {:tx-data part}))
    (catch Throwable ex
      (throw (ex-info (.getMessage ex) {:class class} ex)))))

(defmethod mop/find-class-using-env [Object net.wikipunk.asami.Connection]
  [ident env]
  (asami/entity env ident))
