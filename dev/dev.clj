(ns dev
  "Tools for interactive development with the REPL. This file should
  not be included in a production build of the application.
  Call `(reset)` to reload modified code and (re)start the system.
  The system under development is `system`, referred from
  `com.stuartsierra.component.repl/system`.
  See also https://github.com/stuartsierra/component.repl"
  (:require
   [arachne.aristotle :as a]
   [arachne.aristotle.query :as q]
   [arachne.aristotle.registry :as reg]
   [arachne.aristotle.graph :as g]
   [clojure.core.async :as async]
   [clojure.datafy :refer [datafy]]
   [clojure.data.json :as json]
   [clojure.data.fressian :as fressian]
   [clojure.data.int-map :as int-map]
   [clojure.data.xml :as xml]
   [clojure.edn :as edn]
   [clojure.java.io :as io]
   [clojure.java.javadoc :refer [javadoc]]
   [clojure.java.shell :as sh :refer [sh]]
   [clojure.math.combinatorics :as math]
   [clojure.pprint :refer [pprint pp]]
   [clojure.reflect :refer [reflect]]
   [clojure.repl :refer [apropos dir find-doc pst source]]
   [clojure.set :as set]
   [clojure.string :as str]
   [clojure.tools.namespace.repl :refer [refresh refresh-all clear]]
   [clojure.tools.logging :as log]
   [clojure.walk :as walk]
   [com.stuartsierra.component :as com]
   [com.stuartsierra.component.repl :refer [reset set-init start stop system]]
   [com.walmartlabs.schematic :as sc]
   [ont-app.vocabulary.lstr :as lstr]
   [net.wikipunk.boot :as boot]
   [net.wikipunk.ext :as ext]
   [net.wikipunk.rdf :as rdf :refer [doc]]
   [net.wikipunk.mop :as mop]
   [taoensso.nippy :as nippy]
   [xtdb.api :as xt]
   [zprint.core :as zprint]
   [datomic.client.api :as d]
   [net.wikipunk.datomic :as datomic]
   [net.wikipunk.datomic.boot :as db]
   [net.wikipunk.datomic.rl :as rl]
   [net.wikipunk.rdf.dpvo]
   [net.wikipunk.rdf.dpvo-tech]
   [net.wikipunk.rdf.dpvo-legal]
   [net.wikipunk.rdf.dpvo-risk]
   [net.wikipunk.rdf.dpvo-gdpr]
   [net.wikipunk.rdf.dpvo-pd]
   [net.wikipunk.rdf.dpvo-rights-eu]))

(set-init
  (fn [_]
    (set! *print-namespace-maps* false)
    (if-let [r (io/resource "system.edn")]
      (-> (slurp r)
          (edn/read-string)
          (sc/assemble-system))
      (throw (ex-info "system.edn is not on classpath" {})))))

(defmacro inspect
  "Evaluate forms in an implicit do and inspect the value of the last
  expression using Reveal."
  [& body]
  `(do (@user/reveal (do ~@body))
       true))

(comment
  (def boot-db (db/test-bootstrap (:db system))))

(defn make-test-db
  [db all-tx-data]
  (reduce (fn [with-db tx-data]
            (try
              (:db-after (d/with with-db {:tx-data (mapv db/select-attributes tx-data)}))
              (catch Throwable ex
                (throw (ex-info (.getMessage ex) {:tx-data tx-data})))))
          (if (instance? datomic.dev_local.with_db.WithDb db)
            db
            (d/with-db db))          
          all-tx-data))

(def test-people
  [{:db/ident :person/alice}
   {:db/ident :person/bob}
   {:db/ident :person/charlie}
   {:db/ident :person/delta}
   {:db/ident :person/eve}])

(def eq-diff2-tx-data
  [test-people
   [{:db/ident :person/alice :owl/sameAs :person/bob}
    {:db/ident :person/bob}
    {:db/ident :person/charlie}
    {:db/ident :person/delta :owl/sameAs :person/alice}
    {:db/ident    :ex/DifferentPersons
     :rdf/type    :owl/AllDifferent,
     :owl/members [:person/alice :person/bob :person/charlie]}]])

(def prp-spo2-tx-data
  "test data for prp-spo2"
  [test-people
   [{:db/ident               :ex/hasGrandparent
     :rdf/type               :rdf/Property
     :owl/propertyChainAxiom [:rel/childOf :rel/childOf]}]
   [{:db/ident :person/alice :rel/childOf [:person/bob :person/eve]}
    {:db/ident :person/bob :rel/childOf [:person/charlie :person/delta]}
    {:db/ident :person/charlie :rel/childOf :person/delta}
    {:db/ident :person/delta :rel/childOf :person/eve}]])

(comment  
  
  (let [db (make-test-db boot-db eq-diff2-tx-data)]
    (d/q '[:find ?z1 ?z2
           :in $ %
           :where (eq-diff2 ?x ?y ?z1 ?z2)]
         db
         rl/rules))

  (let [db (make-test-db boot-db prp-spo2-tx-data)]
    (->> (rl/apply-property-chain-axiom db :ex/hasGrandparent :person/alice)
         (d/pull db '[*])
         :db/ident))
  
  ;; => :person/charlie
  )
