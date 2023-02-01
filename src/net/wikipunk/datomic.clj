(ns net.wikipunk.datomic
  (:require
   [com.stuartsierra.component :as com]
   [datomic.client.api :as d]))

(defrecord Connection [client db-name]
  com/Lifecycle
  (start [this]
    (d/create-database client this)
    (assoc this :conn (d/connect client this)))
  (stop [this]
    (assoc this :conn nil)))
