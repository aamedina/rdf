(ns net.wikipunk.test-fixtures
  "Test fixtures for the RDF/ontology toolchain."
  (:require
   [com.stuartsierra.component.repl :as repl]
   [com.walmartlabs.schematic :as sc]))

(defn init-system
  [_]
  (let [db-name (str (java.util.UUID/randomUUID))]
    (sc/assemble-system
      {:client {:sc/create-fn 'datomic.client.api/client
                :system       "rdf-test"
                :server-type  :datomic-local
                :storage-dir  :mem}
       :db {:sc/create-fn 'net.wikipunk.datomic/map->Connection
            :sc/refs      [:client]
            :db-name      db-name}
       :db-migrate {:sc/create-fn 'net.wikipunk.datomic.migrate/map->Migrator
                    :sc/refs      {:conn :db}
                    :label        "TestMigrator"
                    :imports      []
                    :annotation-properties? true
                    :reload?      false}})))

(repl/set-init init-system)

(defonce ^:private system-started? (atom false))

(defn use-test-system
  "Fixture that starts the system once and then runs the test body."
  [f]
  (when-not @system-started?
    (repl/start)
    (reset! system-started? true))
  (f))
