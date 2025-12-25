(ns net.wikipunk.ontology.owl-rl-axioms-test
  (:require
    [clojure.test :refer :all]
    [com.stuartsierra.component.repl :as repl]
    [datomic.client.api :as d]
    [net.wikipunk.ontology.owl-rl-axioms :as ax]
    [net.wikipunk.test-fixtures :refer [use-test-system]]
    [net.wikipunk.ontology.owl-rl :as owl-rl]))

(use-fixtures :once use-test-system)

(deftest bootstrap-from-axioms
  (let [sys     repl/system
        client  (:client sys)
        db-name "axioms-test"]
    (is client)
    ;; fresh db
    (try (d/delete-database client {:db-name db-name}) (catch Throwable _))
    (is (true? (d/create-database client {:db-name db-name})))
    (let [conn (d/connect client {:db-name db-name})]
      ;; ensure RL attributes exist in empty DB
      (#'owl-rl/ensure-rl-attrs! conn)
      ;; install RDFS axioms
      (ax/assert-axioms! conn [:rdfs])
      (let [db (d/db conn)]
        ;; core checks
        (is (some? (ffirst (d/q '[:find ?e :in $ :where [?e :db/ident :rdf/nil]] db))))
        (is (some? (ffirst (d/q '[:find ?e :in $ :where [?e :db/ident :rdf/nil] [:rdf/nil :rdf/type :rdf/List]] db))))
        (is (some? (ffirst (d/q '[:find ?e :in $ :where [?e :db/ident :rdfs/subClassOf] [:rdfs/subClassOf :rdf/type :rdf/Property]] db)))))

      ;; install OWL RL axioms (classes + properties)
      (ax/assert-axioms! conn [:owlrl])
      (let [db (d/db conn)]
        (is (some? (ffirst (d/q '[:find ?e :in $ :where [?e :db/ident :owl/Thing] [:owl/Thing :rdf/type :rdfs/Class]] db))))
        (is (some? (ffirst (d/q '[:find ?e :in $ :where [?e :db/ident :owl/Thing] [:owl/Thing :rdf/type :owl/Class]] db))))
        (is (some? (ffirst (d/q '[:find ?e :in $ :where [?e :db/ident :owl/NamedIndividual] [:owl/NamedIndividual :rdf/type :owl/Class]] db))))
        (is (some? (ffirst (d/q '[:find ?e :in $ :where [?e :db/ident :owl/someValuesFrom] [:owl/someValuesFrom :rdfs/domain :owl/Restriction]] db))))
        (is (some? (ffirst (d/q '[:find ?e :in $ :where [?e :db/ident :owl/onProperty] [:owl/onProperty :rdfs/range :rdf/Property]] db))))))
    ;; cleanup
    (is (true? (d/delete-database client {:db-name db-name}))))
  )
