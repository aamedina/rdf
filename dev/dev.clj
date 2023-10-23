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
   [clj-http.client :as http]
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
   [zprint.core :as zprint]
   [datomic.client.api :as d]
   [net.wikipunk.datomic :as datomic]
   [net.wikipunk.datomic.boot :as db]
   [net.wikipunk.datomic.rl :as rl]
   [asami.core :as asami]
   [quoll.raphael.core :as raphael]
   [donatello.ttl :as ttl]
   [michelangelo.core :as ma]
   [tiara.data :refer [ordered-map ordered-set]]))

(set-init
  (fn [_]
    (set! *print-namespace-maps* nil)
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
  
  (let [db (make-test-db (:test system) eq-diff2-tx-data)]
    (d/q '[:find ?z1 ?z2
           :in $ %
           :where (eq-diff2 ?x ?y ?z1 ?z2)]
         db
         rl/rules))

  (let [db (make-test-db (:test system) prp-spo2-tx-data)]
    (->> (rl/apply-property-chain-axiom db :ex/hasGrandparent :person/alice)
         (d/pull db '[*])
         :db/ident))
  
  ;; => :person/charlie
  )

(def agg-test-tx-data
  [[{:db/ident :bob
     :rdf/type :schema/Person}
    {:db/ident :mary
     :rdf/type :schema/Person}
    {:db/ident :jen
     :rdf/type :schema/Person}
    {:db/ident :accounting
     :rdf/type :schema/Organization}
    {:db/ident :hr
     :rdf/type :schema/Organization}]
   [{:db/ident          :acme
     :rdf/type          :schema/Organization
     :schema/department [:accounting :hr]}]
   [[:db/add :bob :schema/worksFor :accounting]
    [:db/add :bob :schema/baseSalary 50000M]
    [:db/add :mary :schema/worksFor :hr]
    [:db/add :mary :schema/baseSalary 47000M]
    [:db/add :jen :schema/worksFor :accounting]
    [:db/add :jen :schema/baseSalary 60000M]]])

(defn dept-avg-salary
  [db]
  (d/q '[:find ?did (avg ?s)
         :in $ % 
         :where
         (dept-salaries ?d ?s)
         [?d :db/ident ?did]]
       db '[[(dept-salaries ?d ?s)
             [?org :schema/department ?d]
             [?d :rdf/type :schema/Organization]
             [?x :schema/worksFor ?d]
             [?x :schema/baseSalary ?s]]]))

; => [[:accounting 55000.0] [:hr 47000.0]]

(comment
  (d/q '[:find ?c
         :where
         [?c :rdf/type :owl/Class]
         (not [:owl/Nothing :rdfs/subClassOf ?c])]
       db))

(defn materialize-scm
  "Materializes OWL RL Semantics of Schema Vocabulary."
  [with-db]
  (d/with with-db {:tx-data `[[rl/scm-cls]
                              [rl/scm-sco]
                              [rl/scm-eqc1]
                              [rl/scm-eqc2]
                              [rl/scm-op]
                              [rl/scm-dp]
                              [rl/scm-spo]
                              [rl/scm-eqp1]
                              [rl/scm-eqp2]
                              [rl/scm-dom1]
                              [rl/scm-dom2]
                              [rl/scm-rng1]
                              [rl/scm-rng2]
                              [rl/scm-hv]
                              [rl/scm-svf1]
                              [rl/scm-svf2]
                              [rl/scm-avf1]
                              [rl/scm-avf2]
                              [rl/scm-int]
                              [rl/scm-uni]]}))

(defn materialize-eq
  "Materializes OWL RL Semantics of Equality."
  [with-db]
  (d/with with-db {:tx-data `[[rl/eq-ref]
                              [rl/eq-sym]
                              [rl/eq-trans]
                              [rl/eq-rep-s]
                              [rl/eq-rep-p]
                              [rl/eq-rep-o]
                              [rl/eq-diff1]
                              [rl/eq-diff2]
                              [rl/eq-diff3]]}))

(comment
  (materialize boot-db))

(comment
  (asami/transact (:conn (:asami system))
                  {:tx-data (->> (rdf/all-ns-metaobjects)
                                 (walk/prewalk rdf/unroll-tagged-literals)
                                 (walk/prewalk rdf/unroll-langString)
                                 (walk/prewalk (fn [form]
                                                 (if (map-entry? form)
                                                   (let [[k v] form]
                                                     [k (cond
                                                          (isa? (:rdfs/range rdf/*metaobjects*) k :rdf/List)
                                                          (vector v)
                                                          (sequential? v)
                                                          (set v)
                                                          :else v)])
                                                   form)))
                                 (into []))}))

(comment
  {:rdf/type      :rdf/Statement
   :rdf/subject   {:xsd/anyURI "http://schema.org/3DModel"}
   :rdf/predicate {:xsd/anyURI "http://www.w3.org/2000/01/rdf-schema#comment"}
   :rdf/object    {:rdf/value "A 3D model represents some kind of 3D content, which may have [[encoding]]s in one or more [[MediaObject]]s. Many 3D formats are available (e.g. see [Wikipedia](https://en.wikipedia.org/wiki/Category:3D_graphics_file_formats)); specific encoding formats can be represented using the [[encodingFormat]] property applied to the relevant [[MediaObject]]. For the\ncase of a single file published after Zip compression, the convention of appending '+zip' to the [[encodingFormat]] can be used. Geospatial, AR/VR, artistic/animation, gaming, engineering and scientific content can all be represented using [[3DModel]]."}})

(comment
  {:rdf/type  :rdf/JSON
   :rdf/value "[52,{\"1\":[],\"10\":null,\"d\":true}]"}

  {:rdf/type  :xsd/float,
   :rdf/value "85000"}
  ;; "sameAs"
  {:xsd/float 85000.0})

(comment
  (let [{:rdfa/keys [uri prefix]
         :dcat/keys [downloadURL]} ext/d3f
        nq                         (java.io.File/createTempFile prefix ".nq")]
    (a/write (a/read (a/graph :simple) downloadURL) nq :nquads)
    nq))

(comment
  [#xsd/anyURI "http://d3fend.mitre.org/ontologies/d3fend.owl#Reference-EvictionGuidanceforNetworksAffectedbytheSolarWindsandActiveDirectory/M365Compromise-CISA"
   #xsd/anyURI "http://www.w3.org/2000/01/rdf-schema#label"
   "Reference - Eviction Guidance for Networks Affected by the SolarWinds and Active Directory/M365 Compromise - CISA"]
  (edn/read-string {:readers {'xsd/anyURI (fn [iri] (rdf/kw iri))}}
                   (pr-str (tagged-literal 'xsd/anyURI "http://www.w3.org/2000/01/rdf-schema#label")))
  (mop/make-instance :rdf/Statement
                     :rdf/subject #xsd/anyURI "http://d3fend.mitre.org/ontologies/d3fend.owl#Reference-EvictionGuidanceforNetworksAffectedbytheSolarWindsandActiveDirectory/M365Compromise-CISA"
                     :rdf/predicate #xsd/anyURI "http://www.w3.org/2000/01/rdf-schema#label"
                     :rdf/object "Reference - Eviction Guidance for Networks Affected by the SolarWinds and Active Directory/M365 Compromise - CISA"))

(comment
  (with-open [r (org.apache.jena.sparql.exec.http.QueryExecutionHTTP/service "https://dbpedia.org/sparql"
                                                                              "select distinct ?e where {?e a yago:WikicatAmericanFilmDirectors} LIMIT 100")]
    (.toString (.execSelect r)))

  (http/get "https://dbpedia.org/sparql"
            {:query-params {"query" "select distinct ?e where {?e a <http://dbpedia.org/class/yago/WikicatAmericanpFilmDirectors>} LIMIT 100"}
             :accept       "application/sparql-results+json"
             :as           :json}))

(comment
  (org.apache.jena.riot.out.NodeFmtLib/decodeBNodeLabel "Bda53edfdf1f55184b2c9baffc3b38d9b")
  (org.apache.jena.riot.out.NodeFmtLib/encodeBNodeLabel "da53edfdf1f55184b2c9baffc3b38d9b"))
