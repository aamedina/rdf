(ns net.wikipunk.ontology.owl-rl-rules-test
  (:require
    [clojure.test :refer :all]
    [com.stuartsierra.component.repl :as repl]
    [datomic.client.api :as d]
    [net.wikipunk.ontology.owl-rl-rules :as rl]
    [net.wikipunk.ontology.owl-rl :as owl-rl]
    [net.wikipunk.test-fixtures :refer [use-test-system]]))

(use-fixtures :once use-test-system)

;; Prefer d/with + (d/with-db conn) in tests to avoid mutating the durable DB
#_(defn with! [db tx]
  (:db-after (d/with db {:tx-data tx})))

(deftest disjoint-class-rules-derive-closure
  (let [sys   repl/system
        conn  (get-in sys [:db :conn])
        db0   (d/with-db conn)
        tx    [{:db/id -1  :db/ident :ex/A      :rdf/type :owl/Class}
                {:db/id -2  :db/ident :ex/B      :rdf/type :owl/Class}
                {:db/id -3  :db/ident :ex/AChild :rdf/type :owl/Class}
                {:db/id -4  :db/ident :ex/AliasA :rdf/type :owl/Class}
                {:db/id -5  :db/ident :ex/BChild :rdf/type :owl/Class}
                {:db/id -6  :db/ident :ex/NegB   :rdf/type :owl/Class}
                {:db/id -7  :db/ident :ex/C      :rdf/type :owl/Class}
                {:db/id -8  :db/ident :ex/D      :rdf/type :owl/Class}
                {:db/id -9  :db/ident :ex/E      :rdf/type :owl/Class}
                {:db/id -10 :db/ident :ex/U      :rdf/type :owl/Class}
                {:db/id -11 :db/ident :ex/U1     :rdf/type :owl/Class}
                {:db/id -12 :db/ident :ex/U2     :rdf/type :owl/Class}
                [:db/add -1  :owl/disjointWith -2]
                [:db/add -3  :rdfs/subClassOf  -1]
                [:db/add -4  :owl/equivalentClass -1]
                [:db/add -5  :rdfs/subClassOf  -2]
                [:db/add -6  :owl/complementOf -2]
                ;; AllDisjointClasses members: C, D, E
                {:db/id -30 :rdf/first -7  :rdf/rest -31}
                {:db/id -31 :rdf/first -8  :rdf/rest -32}
                {:db/id -32 :rdf/first -9  :rdf/rest :rdf/nil}
                {:db/id -33 :rdf/type :owl/AllDisjointClasses :owl/members -30}
                ;; DisjointUnionOf for U with U1, U2
                {:db/id -40 :rdf/first -11 :rdf/rest -41}
                {:db/id -41 :rdf/first -12 :rdf/rest :rdf/nil}
                [:db/add -10 :owl/disjointUnionOf -40]]
        db    (:db-after (d/with db0 {:tx-data tx}))
        rules (rl/rules* {:restrictions? false :schema? true :violations? false :chains? false})
        disj  (fn [cls]
                (rl/disjoint-classes db cls {:ruleset rules}))]
    (testing "binary disjointness is symmetric and propagates to subclasses/equivalents"
      (is (= #{:ex/B :ex/BChild} (disj :ex/A)))
      (is (= #{:ex/A :ex/AChild :ex/AliasA :ex/NegB} (disj :ex/B)))
      (is (= #{:ex/B :ex/BChild} (disj :ex/AChild)))
      (is (= #{:ex/B :ex/BChild} (disj :ex/AliasA)))
      (is (= #{:ex/A :ex/AChild :ex/AliasA :ex/NegB} (disj :ex/BChild)))
      (is (= #{:ex/B :ex/BChild} (disj :ex/NegB))))
    (testing "AllDisjointClasses expands to pairwise disjointness"
      (is (= #{:ex/D :ex/E} (disj :ex/C)))
      (is (= #{:ex/C :ex/E} (disj :ex/D)))
      (is (= #{:ex/C :ex/D} (disj :ex/E))))
    (testing "DisjointUnionOf only disjoins the listed members"
      (is (= #{:ex/U2} (disj :ex/U1)))
      (is (= #{:ex/U1} (disj :ex/U2)))
      (is (empty?      (disj :ex/U))))
    (testing "direct scope limits to asserted disjoints"
      (doseq [[cls expected] [[:ex/A #{:ex/B}]
                              [:ex/B #{:ex/A :ex/NegB}]
                              [:ex/C #{:ex/D :ex/E}]
                              [:ex/U1 #{:ex/U2}]
                              [:ex/U2 #{:ex/U1}]
                              [:ex/U  #{}]]]
        (is (= expected (rl/disjoint-classes db cls {:scope :direct})))))
  ))

#_(deftest subclass-domain-inverse-transitive-and-chain
  (let [sys   repl/system
        conn  (get-in sys [:db :conn])
        db0   (d/with-db conn)
        ;; Ensure base idents exist (ephemeral)
        db1   (with! db0 [{:db/ident :ex/A}
                          {:db/ident :ex/B}
                          {:db/ident :ex/C}
                          {:db/ident :ex/D}
                          {:db/ident :owl/TransitiveProperty}
                          {:db/ident :owl/SymmetricProperty}
                          {:db/ident :owl/FunctionalProperty}
                          {:db/ident :owl/InverseFunctionalProperty}
                          {:db/ident :owl/IrreflexiveProperty}
                          {:db/ident :owl/AsymmetricProperty}
                          {:db/ident :rdf/nil}
                          {:db/ident :ex/p  :db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
                          {:db/ident :ex/p2 :db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
                          {:db/ident :ex/q  :db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
                          {:db/ident :ex/r  :db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
                          {:db/ident :ex/t  :db/valueType :db.type/ref :db/cardinality :db.cardinality/many}])
        ;; schema: A ⊑ B ; domain(p)=C ; inverse(p,p2) ; t is TransitiveProperty
        db2   (with! db1 [
                          [:db/add [:db/ident :ex/A] :rdfs/subClassOf [:db/ident :ex/B]]
                          [:db/add [:db/ident :ex/p] :rdfs/domain [:db/ident :ex/C]]
                          [:db/add [:db/ident :ex/p] :owl/inverseOf [:db/ident :ex/p2]]
                          [:db/add [:db/ident :ex/t] :rdf/type :owl/TransitiveProperty]])
        ;; individuals and triples
        db    (with! db2 [
                           {:db/id -1 :db/ident :ex/x}
                           {:db/id -2 :db/ident :ex/y}
                           {:db/id -3 :db/ident :ex/z}
                           [:db/add -1 :rdf/type :ex/A]
                           [:db/add -1 :ex/p -2]
                           [:db/add -1 :ex/t -2]
                           [:db/add -2 :ex/t -3]])
        rules (rl/rules* {:restrictions? false :schema? true :violations? false :chains? false})]
    (binding [rl/*rules* rules]
      ;; A ⊑ B and x : A ⇒ x : B
      (is (some? (rl/q db '[:find ?x :in $ % :where (isa ?x :ex/B)])))
      ;; explain: subclass
      (let [w (rl/why-type db :ex/x :ex/B)]
        (is (some #(= (:rule %) :rdfs/subClassOf) w))
        (is (some (fn [m] (and (= (:rule m) :rdfs/subClassOf)
                               (some #{[:ex/x :rdf/type :ex/A]} (:support m))
                               (some #{[:ex/A :rdfs/subClassOf :ex/B]} (:support m)))) w)))
      ;; domain(p)=C and x p y ⇒ x : C
      (is (some? (rl/q db '[:find ?x :in $ % :where [?x :ex/p ?y] (isa ?x :ex/C)])))
      ;; explain: domain
      (let [w (rl/why-type db :ex/x :ex/C)]
        (is (some (fn [m] (and (= (:rule m) :rdfs/domain)
                               (some #{[:ex/p :rdfs/domain :ex/C]} (:support m))
                               (some (fn [t] (= t [:ex/x :ex/p :ex/y])) (:support m)))) w)))
      ;; transitive explain
      (let [w (rl/why-triple db :ex/x :ex/t :ex/z)]
        (is (some (fn [m] (and (= (:rule m) :owl/TransitiveProperty)
                               (some #{[:ex/t :rdf/type :owl/TransitiveProperty]} (:support m))
                               (some #{[:ex/x :ex/t :ex/y]} (:support m))
                               (some #{[:ex/y :ex/t :ex/z]} (:support m)))) w))))))

#_(deftest cardinality-aggregates
  (let [sys   repl/system
        conn  (get-in sys [:db :conn])
        db0   (d/with-db conn)
        ident? (fn [db k] (some? (ffirst (d/q '[:find ?e :in $ ?ident :where [?e :db/ident ?ident]] db k))))
        ;; ensure RL attributes we need (ephemeral)
        db0   (with! db0 (vec (remove nil?
                               [(when-not (ident? db0 :owl/minCardinality)
                                  {:db/ident :owl/minCardinality :db/valueType :db.type/long :db/cardinality :db.cardinality/one})
                                (when-not (ident? db0 :owl/maxCardinality)
                                  {:db/ident :owl/maxCardinality :db/valueType :db.type/long :db/cardinality :db.cardinality/one})
                                (when-not (ident? db0 :owl/minQualifiedCardinality)
                                  {:db/ident :owl/minQualifiedCardinality :db/valueType :db.type/long :db/cardinality :db.cardinality/one})
                                (when-not (ident? db0 :owl/maxQualifiedCardinality)
                                  {:db/ident :owl/maxQualifiedCardinality :db/valueType :db.type/long :db/cardinality :db.cardinality/one})
                                (when-not (ident? db0 :owl/onProperty)
                                  {:db/ident :owl/onProperty :db/valueType :db.type/ref :db/cardinality :db.cardinality/many})
                                (when-not (ident? db0 :owl/onClass)
                                  {:db/ident :owl/onClass :db/valueType :db.type/ref :db/cardinality :db.cardinality/one})])))]
    ;; schema and data (ephemeral)
  (let [db1 (with! db0 [
                           {:db/id -20 :db/ident :ex/R}
                           {:db/id -21 :db/ident :ex/S}
                           {:db/id -22 :db/ident :ex/Q}
                           {:db/id -23 :db/ident :ex/C}
                           {:db/ident :ex/r :db/valueType :db.type/ref :db/cardinality :db.cardinality/many}])
          ;; add restrictions referencing ex/r in a separate pass so the ident exists
          db1 (with! db1 [
                           ;; R: minCardinality 2 on r
                           [:db/add -20 :owl/minCardinality 2]
                           [:db/add -20 :owl/onProperty [:db/ident :ex/r]]
                           ;; S: maxCardinality 1 on r
                           [:db/add -21 :owl/maxCardinality 1]
                           [:db/add -21 :owl/onProperty [:db/ident :ex/r]]
                           ;; Q: minQualifiedCardinality 2 on r with onClass C
                           [:db/add -22 :owl/minQualifiedCardinality 2]
                           [:db/add -22 :owl/onProperty [:db/ident :ex/r]]
                           [:db/add -22 :owl/onClass :ex/C]
                           ;; individuals
                           {:db/id -11 :db/ident :ex/u}
                           {:db/id -12 :db/ident :ex/v}
                           {:db/id -13 :db/ident :ex/w}
                           ;; types
                           [:db/add -11 :rdf/type -20]
                           [:db/add -12 :rdf/type -21]
                           [:db/add -13 :rdf/type -22]])
          rules (rl/rules* {:restrictions? false :schema? false :violations? true})]
      (binding [rl/*rules* rules]
        ;; R has minCardinality 2, but u has none => violation
        (is (some? (rl/q db1 '[:find ?u :in $ % :where [(= ?u :ex/u)] (viol-cls-minc ?u ?x ?p ?n)])))
        ;; S has maxCardinality 1, but v has two edges => violation
        (let [db2 (with! db1 [[:db/add [:db/ident :ex/v] :ex/r [:db/ident :ex/u]]
                              [:db/add [:db/ident :ex/v] :ex/r [:db/ident :ex/w]]])]
          (is (some? (rl/q db2 '[:find ?v :in $ % :where [(= ?v :ex/v)] (viol-cls-maxc ?v ?x ?p ?n)]))))
        ;; Q requires two r targets of class C; give one C and one non-C => violation, then satisfy
        (let [db3 (with! db1 [[:db/add [:db/ident :ex/u] :rdf/type [:db/ident :ex/C]]
                               [:db/add [:db/ident :ex/w] :ex/r [:db/ident :ex/u]]])]
          (is (some? (rl/q db3 '[:find ?q :in $ % :where [(= ?q :ex/Q)] (viol-cls-minqc ?q ?x ?p ?n ?c)]))))
        (let [db4 (with! db1 [[:db/add [:db/ident :ex/v] :rdf/type [:db/ident :ex/C]]
                               [:db/add [:db/ident :ex/w] :ex/r [:db/ident :ex/v]]])]
          ;; now satisfied; minqc violation should go away (no result)
          (is (empty? (rl/q db4 '[:find ?q :in $ % :where [(= ?q :ex/Q)] (viol-cls-minqc ?q ?x ?p ?n ?c)])))))))
)

#_(deftest db-has-no-owl-rl-violations
  (let [sys   repl/system
        conn  (get-in sys [:db :conn])
        db    (d/db conn)
        ;; Include class axioms so isa reflects subclass/equivalent relations
        rules (rl/rules* {:restrictions? true :schema? false :violations? true})]
    (binding [rl/*rules* rules]
      ;; Irreflexive / Asymmetric
      (is (empty? (rl/q db '[:find ?p ?x :in $ % :where (viol-prp-irp ?p ?x)])) "Irreflexive violations present")
      (is (empty? (rl/q db '[:find ?p ?x ?y :in $ % :where (viol-prp-asyp ?p ?x ?y)])) "Asymmetric violations present")
      ;; Disjoint properties
      (is (empty? (rl/q db '[:find ?p1 ?p2 ?x ?y :in $ % :where (viol-prp-pdw ?p1 ?p2 ?x ?y)])) "Property disjointness violations present")
      ;; Disjoint classes: single scan with entity guard on ?x
      (is (empty? (rl/q db '[:find ?x :in $ % :where [?x :rdf/type _] (viol-cax-dw ?x ?c1 ?c2)]))
          "Class disjointness violations present")
      ;; Functional / InverseFunctional
      (is (empty? (rl/q db '[:find ?p ?x ?y1 ?y2 :in $ % :where (viol-prp-fp ?p ?x ?y1 ?y2)])) "FunctionalProperty violations present")
      (is (empty? (rl/q db '[:find ?p ?x1 ?x2 ?y :in $ % :where (viol-prp-ifp ?p ?x1 ?x2 ?y)])) "InverseFunctionalProperty violations present")
      ;; Domain/Range disjointness (scope p to idented prop; c/d to classes)
      (is (empty? (rl/q db '[:find ?p
                             :in $ %
                             :where
                             [?x :rdf/type _]
                             (viol-prp-domain-disjoint ?p ?x ?c ?d)]))
          "Domain disjointness violations present")
      (is (empty? (rl/q db '[:find ?p
                             :in $ %
                             :where
                             [?y :rdf/type _]
                             (viol-prp-range-disjoint ?p ?y ?c ?d)]))
          "Range disjointness violations present")
      ;; Unsatisfiable classes / instances
      (is (empty? (rl/q db '[:find ?c :in $ % :where (unsat-class ?c)])) "Unsatisfiable classes present")
      (is (empty? (rl/q db '[:find ?x ?c :in $ % :where (viol-unsat-instance ?x ?c)])) "Instances of unsatisfiable classes present")
      ;; AllDisjointClasses
      (is (empty? (rl/q db '[:find ?set ?ci ?cj ?z :in $ % :where (viol-cax-adc ?set ?ci ?cj ?z)])) "AllDisjointClasses violations present")
      ;; NegativePropertyAssertion contradictions
      (is (empty? (rl/q db '[:find ?ax ?s ?p ?o :in $ % :where (viol-prp-npa1 ?ax ?s ?p ?o)])) "NegativePropertyAssertion object contradictions present")
      (is (empty? (rl/q db '[:find ?ax ?s ?p ?lv :in $ % :where (viol-prp-npa2 ?ax ?s ?p ?lv)])) "NegativePropertyAssertion value contradictions present"))))

#_(deftest db-has-no-structural-axiom-mismatches
  (let [sys   repl/system
        conn  (get-in sys [:db :conn])
        db    (d/db conn)]
    ;; ObjectProperty must be ref-valued
    (is (empty? (d/q '[:find ?p :in $ :where
                        [?p :rdf/type :owl/ObjectProperty]
                        (not [?p :db/valueType :db.type/ref])]
                     db))
        "ObjectProperty without :db.type/ref valueType present")
    ;; FunctionalProperty must be cardinality one
    (is (empty? (d/q '[:find ?p :in $ :where
                        [?p :rdf/type :owl/FunctionalProperty]
                        (not [?p :db/cardinality :db.cardinality/one])]
                     db))
        "FunctionalProperty without :db.cardinality/one present")
    ;; No OP/DP punning
    (is (empty? (d/q '[:find ?p :in $ :where
                        [?p :rdf/type :owl/ObjectProperty]
                        [?p :rdf/type :owl/DatatypeProperty]]
                     db))
        "Property punning (both OP and DP) present")
    ;; No Symmetric+Asymmetric conflict
    (is (empty? (d/q '[:find ?p :in $ :where
                        [?p :rdf/type :owl/SymmetricProperty]
                        [?p :rdf/type :owl/AsymmetricProperty]]
                     db))
        "Property is both Symmetric and Asymmetric")
    ;; No Reflexive+Irreflexive conflict
    (is (empty? (d/q '[:find ?p :in $ :where
                        [?p :rdf/type :owl/ReflexiveProperty]
                        [?p :rdf/type :owl/IrreflexiveProperty]]
                     db))
        "Property is both Reflexive and Irreflexive")
    ;; DatatypeProperty must not be ref-valued (check only punk namespace)
    (is (empty? (d/q '[:find ?p :in $ :where
                        [?p :rdf/type :owl/DatatypeProperty]
                        [?p :db/ident ?pid]
                        [(clojure.core/namespace ?pid) ?ns]
                        [(clojure.string/starts-with? ?ns "https://wikipunk.net/")]
                        [?p :db/valueType :db.type/ref]]
                     db))
        "Punk DatatypeProperty with :db.type/ref valueType present")
    ;; ObjectProperty used with literal (check only punk namespace)
    (is (empty? (d/q '[:find ?p ?s ?o :in $ :where
                        [?p :rdf/type :owl/ObjectProperty]
                        [?p :db/ident ?pid]
                        [(clojure.core/namespace ?pid) ?ns]
                        [(clojure.string/starts-with? ?ns "https://wikipunk.net/")]
                        [?s ?p ?o]
                        (not [?o :rdf/type _])
                        (not [?o :db/ident _])]
                     db))
        "Punk ObjectProperty used with non-entity literal")
    ;; DP used with entity (check only punk namespace)
    (is (empty? (d/q '[:find ?p ?s ?o :in $ :where
                        [?p :rdf/type :owl/DatatypeProperty]
                        [?p :db/ident ?pid]
                        [(clojure.core/namespace ?pid) ?ns]
                        [(clojure.string/starts-with? ?ns "https://wikipunk.net/")]
                        [?s ?p ?o]
                        (or [?o :rdf/type _] [?o :db/ident _])]
                     db))
        "Punk DatatypeProperty used with entity value")
    ;; We do not require explicit reciprocal owl:inverseOf assertions (we do not materialize inverses)
    ))

#_(deftest dl-violations-db-level
  (let [sys   repl/system
        conn  (get-in sys [:db :conn])
        db    (d/db conn)
        rules (rl/rules* {:restrictions? false :schema? true :violations? true :chains? false})]
    (binding [rl/*rules* rules]
      ;; Base punk ontology should be DL-clean per our rules
      (is (empty? (rl/q db '[:find ?r ?p :in $ % :where (viol-owl2dl-simple-restr ?r ?p)])) "Simple-role restriction violations present")
      (is (empty? (rl/q db '[:find ?p ?t :in $ % :where (viol-owl2dl-simple-axiom ?p ?t)]))        "Simple-role axiom violations present")
      (is (empty? (rl/q db '[:find ?p ?q :in $ % :where (viol-owl2dl-simple-disjoint ?p ?q)]))     "Simple-role disjoint violations present")
      (is (empty? (rl/q db '[:find ?p :in $ % :where (viol-owl2dl-cycle ?p)]))                      "Property-hierarchy cycles present"))

    ;; Import violation fixture and re-run checks; expect violations
    (owl-rl/import-ontologies! conn ["test/resources/violations/owl2dl_violations.ttl"]) 
    (let [db2 (d/db conn)]
      (binding [rl/*rules* rules]
        (is (not (empty? (rl/q db2 '[:find ?r ?p :in $ % :where (viol-owl2dl-simple-restr ?r ?p)]))) "Expected simple-role restriction violations not found in fixture")
        (is (not (empty? (rl/q db2 '[:find ?p :in $ % :where (viol-owl2dl-cycle ?p)])))             "Expected property-hierarchy cycle not found in fixture")))))
