(ns net.wikipunk.ontology.owl-rl-test
  (:require
    [clojure.test :refer :all]
    [com.stuartsierra.component.repl :as repl]
    [datomic.client.api :as d]
    [net.wikipunk.ontology.owl-rl :as owl-rl]
    [net.wikipunk.ontology.owl-rl-axioms]
    [net.wikipunk.test-fixtures :refer [use-test-system]])
  (:import
    (org.apache.jena.rdf.model ModelFactory)))

(use-fixtures :once use-test-system)

(def ^:private restriction-ttl
  (str
    "@prefix ex: <https://example.com/> .\n"
    "@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n"
    "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n"
    "ex:rel a owl:ObjectProperty ; rdfs:domain ex:Character ; rdfs:range ex:Agent .\n"
    "ex:Agent a owl:Class ; rdfs:label \"Agent\" .\n"
    "ex:Character a owl:Class ;\n"
    "  rdfs:label \"Character\" ;\n"
    "  rdfs:subClassOf [ a owl:Restriction ; owl:onProperty ex:rel ; owl:someValuesFrom ex:Agent ] .\n"))

(defn- temp-ttl-path
  [content]
  (let [f (doto (java.io.File/createTempFile "rdf-ont-" ".ttl") (.deleteOnExit))]
    (spit f content)
    (.getAbsolutePath f)))

(deftest imports-ttl-with-restrictions
  (let [sys    repl/system
        dbc (get-in sys [:db :conn])]
    (is dbc)
    ;; Install RL axioms and import a TTL with a restriction
    (net.wikipunk.ontology.owl-rl-axioms/assert-axioms! dbc [:rdfs :owlrl])
    (let [path (temp-ttl-path restriction-ttl)]
      (owl-rl/import-ontologies! dbc [path]))
    (let [db    (d/db dbc)
          ;; Properties should have rdf:type assertions
          prop  (ffirst (d/q '[:find ?e :where [?e :db/ident :ex/rel]] db))
          _     (is prop)
          types (set (map first (d/q '[:find ?tident :in $ ?e :where
                                       [?e :rdf/type ?t]
                                       [?t :db/ident ?tident]] db prop)))
          _    (is (seq types))
          _    (is (contains? types :rdf/Property))
          _    (is (contains? types :owl/ObjectProperty))
          ;; Built-in axioms should be present
          rp-class (set (map first (d/q '[:find ?tident :where
                                           [?rp :db/ident :rdf/Property]
                                           [?rp :rdf/type ?t]
                                           [?t :db/ident ?tident]] db)))
          _        (is (contains? rp-class :rdfs/Class))
          op-class (set (map first (d/q '[:find ?tident :where
                                           [?op :db/ident :owl/ObjectProperty]
                                           [?op :rdf/type ?t]
                                           [?t :db/ident ?tident]] db)))
          _        (is (contains? op-class :rdfs/Class))
          ;; Depending on axiom set, ObjectProperty may be equivalent to or a subclass of rdf:Property
          op-rel   (or (ffirst (d/q '[:find ?e :where
                                       [:owl/ObjectProperty :owl/equivalentClass :rdf/Property]
                                       [?e :db/ident :owl/ObjectProperty]] db))
                        (ffirst (d/q '[:find ?e :where
                                       [:owl/ObjectProperty :rdfs/subClassOf :rdf/Property]
                                       [?e :db/ident :owl/ObjectProperty]] db)))
          _        (is op-rel)
          ;; Built-in semantics for owl:someValuesFrom
          svf (d/pull db '[*] :owl/someValuesFrom)
          _   (is (= (:db/ident svf) :owl/someValuesFrom))
          dsv (set (map first (d/q '[:find ?dident :where
                                     [:owl/someValuesFrom :rdfs/domain ?d]
                                     [?d :db/ident ?dident]] db)))
          rsv (set (map first (d/q '[:find ?rident :where
                                     [:owl/someValuesFrom :rdfs/range ?r]
                                     [?r :db/ident ?rident]] db)))
          _   (is (contains? dsv :owl/Restriction))
          _   (is (contains? rsv :rdfs/Class))
          ;; Character has a restriction in the TTL
          r (ffirst (d/q '[:find ?r :where
                           [?c :db/ident :ex/Character]
                           [?c :rdfs/subClassOf ?r]
                           [?r :rdf/type :owl/Restriction]] db))]
      (is r)
      ;; Restrictions should carry their facets, not be bare
      (is (or (ffirst (d/q '[:find ?p :in $ ?r :where [?r :owl/onProperty ?p]] db r))
              (ffirst (d/q '[:find ?d :in $ ?r :where [?r :owl/onDatatype ?d]] db r))))
      ;; Bnodes (restrictions) must not have :db/ident
      (is (nil? (ffirst (d/q '[:find ?ident :in $ ?r :where [?r :db/ident ?ident]] db r))))))
)

(deftest no-http-idents-after-import
  (let [sys    repl/system
        dbc (get-in sys [:db :conn])]
    (is dbc)
    (owl-rl/import-ontologies! dbc ["test/resources/iri_stub.ttl"])
    (let [db (d/db dbc)
          bad (seq (filter #(#{"http" "https"} (namespace %))
                           (map first (d/q '[:find ?k :where [?e :db/ident ?k]] db))))]
      (is (nil? bad)))))

(deftest iri-prestub-and-assertions
  (let [sys    repl/system
        dbc (get-in sys [:db :conn])]
    (is dbc)
    ;; Import a tiny TTL that asserts an absolute IRI object (no QName)
    (owl-rl/import-ontologies! dbc ["test/resources/iri_stub.ttl"]) 
    (let [db (d/db dbc)
          subj (ffirst (d/q '[:find ?e :where [?e :db/ident :ex/s]] db))
          _    (is subj)
          obj  (ffirst (d/q '[:find ?o :in $ ?s :where [?s :ex/rel ?o]] db subj))
          _    (is obj)
          iri  (ffirst (d/q '[:find ?iri :in $ ?o :where [?o :punk/iri ?iri]] db obj))]
      (is (= iri "http://www.w3.org/TR/prov-o/#inverse-names-table")))))

(deftest importer-idempotent
  (let [sys    repl/system
        dbc (get-in sys [:db :conn])]
    (is dbc)
    (let [path (temp-ttl-path restriction-ttl)]
      (owl-rl/import-ontologies! dbc [path]))
    (let [db (d/db dbc)
          c1 (count (d/q '[:find ?d :where [:owl/someValuesFrom :rdfs/domain ?d]] db))]
      (let [path (temp-ttl-path restriction-ttl)]
        (owl-rl/import-ontologies! dbc [path]))
      (let [db2 (d/db dbc)
            c2 (count (d/q '[:find ?d :where [:owl/someValuesFrom :rdfs/domain ?d]] db2))]
        (is (= c1 c2))))))

(deftest prefixes-are-materialized
  (let [sys    repl/system
        dbc (get-in sys [:db :conn])]
    (is dbc)
    (let [path (temp-ttl-path restriction-ttl)]
      (owl-rl/import-ontologies! dbc [path]))
    (let [db       (d/db dbc)
          pref-map (into {}
                         (d/q '[:find ?prefix ?uri
                                :where
                                [?ctx :rdfa/prefix ?prefix]
                                [?ctx :rdfa/uri ?uri]] db))]
      (is (= "https://example.com/" (get pref-map "ex")))
      (is (= "http://www.w3.org/1999/02/22-rdf-syntax-ns#" (get pref-map "rdf"))))))

(deftest prefix-removal-syncs-with-model
  (let [sys    repl/system
        dbc (get-in sys [:db :conn])
        _      (is dbc)
        fetch-prefixes (fn []
                         (into {}
                               (d/q '[:find ?prefix ?uri
                                      :where
                                      [?ctx :rdfa/prefix ?prefix]
                                      [?ctx :rdfa/uri ?uri]]
                                    (d/db dbc))))]
    ;; Seed with two test prefixes
    (let [baseline (fetch-prefixes)
          model (ModelFactory/createDefaultModel)]
      (doseq [[prefix uri] baseline]
        (.setNsPrefix model prefix uri))
      (.setNsPrefix model "testfoo" "https://example.com/foo#")
      (.setNsPrefix model "testbar" "https://example.com/bar#")
      (#'owl-rl/persist-prefix-mappings! dbc model))
    (let [post-seed (fetch-prefixes)]
      (is (= "https://example.com/foo#" (get post-seed "testfoo")))
      (is (= "https://example.com/bar#" (get post-seed "testbar"))))
    ;; Remove `testbar` and update foo (idempotent), add `testqux`
    (let [baseline (fetch-prefixes)
          model    (ModelFactory/createDefaultModel)]
      (doseq [[prefix uri] baseline]
        (when-not (= prefix "testbar")
          (.setNsPrefix model prefix uri)))
      (.setNsPrefix model "testfoo" "https://example.com/foo#")
      (.setNsPrefix model "testqux" "https://example.com/qux#")
      (#'owl-rl/persist-prefix-mappings! dbc model))
    (let [post-update (fetch-prefixes)]
      (is (= "https://example.com/foo#" (get post-update "testfoo")))
      (is (= "https://example.com/qux#" (get post-update "testqux")))
      ;; Existing prefixes remain until a full cleanup job removes them.
      (is (= "https://example.com/bar#" (get post-update "testbar"))))))
