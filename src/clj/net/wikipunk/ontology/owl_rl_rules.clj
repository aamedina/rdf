(ns net.wikipunk.ontology.owl-rl-rules
  "OWL 2 RL ruleset for Datomic.

  Use with Datomic Datalog by passing `rules` as `%` and calling `(isa ?x ?c)`
  for type entailment. These are rules only; no materialization is performed."
  (:require
   [clojure.set :as set]
   [datomic.client.api :as d]))

(def ^:private core-prefix
  '[
    ;; Base accessors
    [(isa    ?x ?c)    [?x :rdf/type ?c]]

    ;; owl:sameAs seed; closure below; prefer canonicalization at ingest
    [(same ?x ?y) [?x :owl/sameAs ?y]]

    ;; Equality closure (no reflexive seed)
    [(eq ?x ?y) (same ?x ?y)]
    [(eq ?y ?x) (same ?x ?y)]
    [(eq ?x ?z) (eq ?x ?y) (eq ?y ?z)]

    ;; RDF list helpers
    [(list-first ?l ?h) [?l :rdf/first ?h]]
    [(list-rest  ?l ?t) [?l :rdf/rest  ?t]]
    [(list-empty ?l)    [?l :db/ident :rdf/nil]]

    ;; membership (non-empty)
    [(list-member ?l ?e) (list-first ?l ?e)]
    [(list-member ?l ?e) (list-rest  ?l ?t) (not (list-empty ?t)) (list-member ?t ?e)]

    ;; All elements type the same individual
    [(list-all-types ?x ?l) (list-empty ?l)]
    [(list-all-types ?x ?l)
     (list-first ?l ?h) (isa ?x ?h)
     (list-rest  ?l ?t) (list-all-types ?x ?t)]
  ])

(def ^:private class-disjoint-base-rules
  '[
    ;; Class disjointness helpers (symmetric + n-ary capture)
    [(disjoint-direct ?c ?d)
     [?c :owl/disjointWith ?d]
     [(not= ?c ?d)]]
    [(disjoint-direct ?c ?d)
     [?d :owl/disjointWith ?c]
     [(not= ?c ?d)]]
    [(disjoint-direct ?c ?d)
     [?c :owl/complementOf ?d]
     [(not= ?c ?d)]]
    [(disjoint-direct ?c ?d)
     [?d :owl/complementOf ?c]
     [(not= ?c ?d)]]
    [(disjoint-direct ?ci ?cj)
     (isa ?set :owl/AllDisjointClasses)
     [?set :owl/members ?list]
     (list-member ?list ?ci)
     (list-member ?list ?cj)
     [(not= ?ci ?cj)]]
    [(disjoint-direct ?ci ?cj)
     [?u :owl/disjointUnionOf ?list]
     (list-member ?list ?ci)
     (list-member ?list ?cj)
     [(not= ?ci ?cj)]]
  ])

(def ^:private class-disjoint-closure-rules
  '[
    [(disjoint-class ?c ?d)
     (disjoint-direct ?c ?d)]
    [(disjoint-class ?c ?d)
     [?c :owl/equivalentClass ?e]
     [(not= ?c ?e)]
     (disjoint-class ?e ?d)]
    [(disjoint-class ?c ?d)
     [?d :owl/equivalentClass ?e]
     [(not= ?d ?e)]
     (disjoint-class ?c ?e)]
    [(disjoint-class ?c ?d)
     [?c :rdfs/subClassOf ?e]
     [(not= ?c ?e)]
     (disjoint-class ?e ?d)]
    [(disjoint-class ?c ?d)
     [?d :rdfs/subClassOf ?e]
     [(not= ?d ?e)]
     (disjoint-class ?c ?e)]
  ])

(def ^:private core-suffix
  '[
    ;; Property-chain traversal: ?u --list-of-props--> ?z
    [(chain-sat ?l ?u ?u) (list-empty ?l)]
    [(chain-sat ?l ?u ?z)
     (list-first ?l ?p)
     (list-rest  ?l ?t)
     [?u ?p ?v]
     (chain-sat ?t ?v ?z)]
  ])

(def ^{:doc "Core rule set including list helpers and disjoint-class closure."}
  core
  (vec (concat core-prefix class-disjoint-base-rules class-disjoint-closure-rules core-suffix)))

(def ^{:doc "Rules for disjoint class reasoning (includes closure)."}
  disjoint-rules
  (vec (concat core-prefix class-disjoint-base-rules class-disjoint-closure-rules)))

(def ^{:doc "Rules for disjoint class reasoning without closure expansion."}
  direct-disjoint-rules
  (vec (concat core-prefix class-disjoint-base-rules)))

(def ^{:doc "OWL RL property inference rules (domain/range, functional, etc.)."}
  property-axioms
  '[
    ;; Domain / Range typing
    [(isa ?x ?c)  [?p :rdfs/domain ?c] [?x ?p ?y]]
    [(isa ?y ?c)  [?p :rdfs/range  ?c] [?x ?p ?y]]

    ;; Functional / InverseFunctional → equality
    [(same ?y1 ?y2) (isa ?p :owl/FunctionalProperty)        [?x ?p ?y1] [?x ?p ?y2]]
    [(same ?x1 ?x2) (isa ?p :owl/InverseFunctionalProperty) [?x1 ?p ?y] [?x2 ?p ?y]]

    ;; Rules that derive new triples are intentionally omitted when not needed
  ])

(def ^{:doc "OWL RL class inference rules (subclass, unions, restrictions)."}
  class-axioms
  '[
    ;; SubClassOf and induced by equivalentClass
    [(isa ?x ?c2) [?c1 :rdfs/subClassOf ?c2] (isa ?x ?c1)]
    [(isa ?x ?c2) [?c1 :owl/equivalentClass ?c2] (isa ?x ?c1)]
    [(isa ?x ?c1) [?c1 :owl/equivalentClass ?c2] (isa ?x ?c2)]

    ;; intersectionOf and unionOf
    [(isa ?y ?c)   [?c :owl/intersectionOf ?list] (list-all-types ?y ?list)]
    [(isa ?y ?ci)  [?c :owl/intersectionOf ?list] (isa ?y ?c) (list-member ?list ?ci)]
    [(isa ?y ?c)   [?c :owl/unionOf ?list]        (list-member ?list ?ci) (isa ?y ?ci)]

    ;; someValuesFrom / allValuesFrom / hasValue / hasSelf
    [(isa ?u ?x)
     [?x :owl/someValuesFrom ?y]
     [?x :owl/onProperty ?p]
     [?u ?p ?v]
     (isa ?v ?y)]

    [(isa ?u ?x)
     [?x :owl/someValuesFrom ?y]
     [?y :db/ident :owl/Thing]
     [?x :owl/onProperty ?p]
     [?u ?p ?v]]

    [(isa ?v ?y)
     [?x :owl/allValuesFrom ?y] [?x :owl/onProperty ?p]
     (isa ?u ?x) [?u ?p ?v]]

    [[?u ?p ?y]
     [?x :owl/hasValue ?y] [?x :owl/onProperty ?p]
     (isa ?u ?x)]
    [(isa ?u ?x)
     [?x :owl/hasValue ?y] [?x :owl/onProperty ?p]
     [?u ?p ?y]]

    [[?u ?p ?u]
     [?x :owl/hasSelf true] [?x :owl/onProperty ?p]
     (isa ?u ?x)]
  ])

(def ^{:doc "Placeholder for schema-closure rules (empty by default)."}
  schema-closure '[])

(def ^{:doc "Rules that detect OWL RL constraint violations."}
  violations
  '[
    ;; Irreflexive / Asymmetric
    [(viol-prp-irp ?p ?x)
     (isa ?p :owl/IrreflexiveProperty)
     [?x ?p ?x]]
    [(viol-prp-asyp ?p ?x ?y)
     (isa ?p :owl/AsymmetricProperty)
     [?x ?p ?y]
     [?y ?p ?x]]

    ;; Disjoint properties
    [(viol-prp-pdw ?p1 ?p2 ?x ?y)
     [?p1 :owl/propertyDisjointWith ?p2]
     [?x ?p1 ?y]
     [?x ?p2 ?y]]

    ;; Disjoint classes
    [(viol-cax-dw ?x ?c1 ?c2)
     [?c1 :owl/disjointWith ?c2]
     (isa ?x ?c1)
     (isa ?x ?c2)]

    ;; Functional / InverseFunctional violations (no sameAs unification)
    [(viol-prp-fp ?p ?x ?y1 ?y2)
     (isa ?p :owl/FunctionalProperty)
     [?x ?p ?y1]
     [?x ?p ?y2]
     [(not= ?y1 ?y2)]]
    [(viol-prp-ifp ?p ?x1 ?x2 ?y)
     (isa ?p :owl/InverseFunctionalProperty)
     [?x1 ?p ?y]
     [?x2 ?p ?y]
     [(not= ?x1 ?x2)]]

    ;; Domain/Range disjointness
    [(viol-prp-domain-disjoint ?p ?x ?c ?d)
     [?p :rdfs/domain ?c]
     [?x ?p ?y]
     [?c :owl/disjointWith ?d]
     (isa ?x ?d)]
    [(viol-prp-range-disjoint ?p ?y ?c ?d)
      [?p :rdfs/range ?c]
      [?x ?p ?y]
      [?c :owl/disjointWith ?d]
      (isa ?y ?d)]

    ;; Unsatisfiable classes
    [(unsat-class ?c)
     [?c :rdfs/subClassOf ?d]
     [?c :owl/disjointWith ?d]]
    [(viol-unsat-instance ?x ?c)
     (unsat-class ?c)
     (isa ?x ?c)]

    ;; AllDisjointClasses
    [(viol-cax-adc ?set ?ci ?cj ?z)
     (isa ?set :owl/AllDisjointClasses)
     [?set :owl/members ?list]
     (list-member ?list ?ci)
     (list-member ?list ?cj)
     [(not= ?ci ?cj)]
     (isa ?z ?ci)
     (isa ?z ?cj)]

    ;; NegativePropertyAssertion contradictions
    [(viol-prp-npa1 ?ax ?s ?p ?o)
     (isa ?ax :owl/NegativePropertyAssertion)
     [?ax :owl/sourceIndividual  ?s]
     [?ax :owl/assertionProperty ?p]
     [?ax :owl/targetIndividual  ?o]
     [?s ?p ?o]]
    [(viol-prp-npa2 ?ax ?s ?p ?lv)
     (isa ?ax :owl/NegativePropertyAssertion)
     [?ax :owl/sourceIndividual  ?s]
     [?ax :owl/assertionProperty ?p]
     [?ax :owl/targetValue       ?lv]
     [?s ?p ?lv]]

    ;; Cardinality violations via aggregate counts
    ;; minCardinality/unqualified
    [(viol-cls-minc ?u ?x ?p ?n)
     [?x :owl/minCardinality ?n]
     [?x :owl/onProperty ?p]
     (isa ?u ?x)
     [(net.wikipunk.ontology.owl-rl-rules/card-lt? $ ?u ?p ?n)]]
    ;; maxCardinality/unqualified
    [(viol-cls-maxc ?u ?x ?p ?n)
     [?x :owl/maxCardinality ?n]
     [?x :owl/onProperty ?p]
     (isa ?u ?x)
     [(net.wikipunk.ontology.owl-rl-rules/card-gt? $ ?u ?p ?n)]]
    ;; minQualifiedCardinality
    [(viol-cls-minqc ?u ?x ?p ?n ?c)
     [?x :owl/minQualifiedCardinality ?n]
     [?x :owl/onProperty ?p]
     [?x :owl/onClass ?c]
     (isa ?u ?x)
     [(net.wikipunk.ontology.owl-rl-rules/card-lt-class? $ ?u ?p ?n ?c)]]
    ;; maxQualifiedCardinality
    [(viol-cls-maxqc ?u ?x ?p ?n ?c)
    [?x :owl/maxQualifiedCardinality ?n]
    [?x :owl/onProperty ?p]
    [?x :owl/onClass ?c]
    (isa ?u ?x)
    [(net.wikipunk.ontology.owl-rl-rules/card-gt-class? $ ?u ?p ?n ?c)]]

    ;; ---------------- OWL 2 DL simple roles and cycles ----------------
    ;; list has at least two elements
    [(list-2+ ?l)
     (list-rest ?l ?t)
     (not (list-empty ?t))]

    ;; property has a chain axiom
    [(chain-head ?p ?l) [?p :owl/propertyChainAxiom ?l]]

    ;; composite if chain of length >= 2
    [(composite ?p) (chain-head ?p ?l) (list-2+ ?l)]
    ;; or transitive
    [(composite ?p) [?p :rdf/type :owl/TransitiveProperty]]

    ;; graph edges: subPropertyOf
    [(edge ?a ?b) [?a :rdfs/subPropertyOf ?b]]
    ;; graph edges: each member of chain points to the superproperty (exclude reflexive member)
    [(edge ?pi ?p) (chain-head ?p ?l) (list-member ?l ?pi) [(not= ?pi ?p)]]

    ;; transitive closure for edges
    [(path ?x ?y) (edge ?x ?y)]
    [(path ?x ?z) (edge ?x ?y) (path ?y ?z)]

    ;; non-simple property: itself composite or has a composite ancestor in the graph
    [(non-simple ?p) (composite ?p)]
    [(non-simple ?p) (composite ?p1) (path ?p1 ?p)]

    ;; Violations: restrictions using non-simple roles
    [(viol-owl2dl-simple-restr ?r ?p)
     [?r :rdf/type :owl/Restriction]
     [?r :owl/onProperty ?p]
     (or [?r :owl/hasSelf true]
         [?r :owl/minCardinality _]
         [?r :owl/maxCardinality _]
         [?r :owl/qualifiedCardinality _]
         [?r :owl/minQualifiedCardinality _]
         [?r :owl/maxQualifiedCardinality _])
     (non-simple ?p)]

    ;; Violations: property axioms using non-simple roles
    [(viol-owl2dl-simple-axiom ?p ?t)
     [?p :rdf/type ?t]
     (or [(= ?t :owl/FunctionalProperty)]
         [(= ?t :owl/InverseFunctionalProperty)]
         [(= ?t :owl/IrreflexiveProperty)]
         [(= ?t :owl/AsymmetricProperty)])
     (non-simple ?p)]

    ;; Violations: disjoint properties must be simple (two cases to avoid or var mismatch)
    [(viol-owl2dl-simple-disjoint ?p ?q)
     [?p :owl/propertyDisjointWith ?q]
     (non-simple ?p)]
    [(viol-owl2dl-simple-disjoint ?p ?q)
     [?p :owl/propertyDisjointWith ?q]
     (non-simple ?q)]

    ;; chain of exactly two elements
    [(chain-two ?l ?h1 ?h2)
     (list-first ?l ?h1)
     (list-rest  ?l ?t1)
     (list-first ?t1 ?h2)
     (list-rest  ?t1 ?t2)
     (list-empty ?t2)]

    ;; allowed reflexive form: n=2 and both elements equal p
    [(reflexive-chain ?p ?l)
     (chain-two ?l ?h1 ?h2)
     [(= ?h1 ?p)]
     [(= ?h2 ?p)]]

    ;; Violations: property-hierarchy cycle not covered by the allowed reflexive case
    [(viol-owl2dl-cycle ?p)
     (chain-head ?p ?l)
     (not (reflexive-chain ?p ?l))
     (list-member ?l ?pi)
     [(not= ?pi ?p)]
     (path ?p ?pi)]
  ])

(def ^{:doc "Full OWL RL ruleset (core + property + class + violations)."}
  rules
  (into [] (concat core property-axioms class-axioms schema-closure violations)))

(def ^:dynamic *rules*
  "The active ruleset. Rebind in tests or specialized endpoints to a profiled set.
   Defaults to full rules."
  rules)

(defn q
  "Query with OWL RL rules enabled. Ensure your query has :in $ % ..."
  [db query & inputs]
  (apply d/q query db *rules* inputs))

(defn disjoint-classes
  "Return the set of classes disjoint with `class`. Accepts ident keywords or
   entity ids; results prefer :db/ident keywords when present.

   Options:
   * `:scope`     – either `:closure` (default) for subclass/equivalent propagation
                    or `:direct` to limit results to explicitly asserted disjoints.
   * `:ruleset`   – supply a custom Datomic ruleset; when provided it takes precedence
                    over the selected scope.
   * `:predicate` – advanced use; override the rule head to query (defaults to
                    `disjoint-class` or `disjoint-direct` based on scope)."
  ([db class] (disjoint-classes db class {}))
  ([db class {:keys [ruleset scope predicate] :or {scope :closure}}]
   (let [ruleset* (cond
                    ruleset ruleset
                    (= scope :direct) direct-disjoint-rules
                    :else disjoint-rules)
         predicate* (or predicate
                        (if (= scope :direct)
                          'disjoint-direct
                          'disjoint-class))
         query    (if (= predicate* 'disjoint-direct)
                    '[:find (pull ?other [:db/id :db/ident])
                      :in $ % ?class
                      :where
                      (disjoint-direct ?class ?other)]
                    '[:find (pull ?other [:db/id :db/ident])
                      :in $ % ?class
                      :where
                      (disjoint-class ?class ?other)])
         rows     (d/q query db ruleset* class)
         resolved (into #{}
                        (map (fn [[m]] (or (:db/ident m) (:db/id m))))
                        rows)
         class-ident (cond
                       (keyword? class) class
                       (number? class)  (:db/ident (d/pull db [:db/ident] class))
                       :else            (:db/ident (d/pull db [:db/ident] class)))
         class-repr  (if (keyword? class) nil class)
         result      (cond-> resolved
                        class-ident (disj class-ident)
                        class-repr  (disj class))]
     result)))

;; --------- Profiles and chain precompilation --------------------------------

(defn rdf-list->vec
  "Expand an RDF list (head node) into a vector of members."
  [db head]
  (loop [node head acc []]
    (if (or (nil? node) (= node :rdf/nil))
      acc
      (let [h (ffirst (d/q '[:find ?h :in $ ?n :where [?n :rdf/first ?h]] db node))
            t (ffirst (d/q '[:find ?t :in $ ?n :where [?n :rdf/rest  ?t]] db node))]
        (recur t (conj acc h))))))

(defn gen-chain-rules
  "Generate specialized property-chain rules from :owl/propertyChainAxiom in DB.
   Produces rules with raw datom heads/bodies, e.g., `[[?x :ex/r ?zN] ...]`"
  [db]
  (let [pairs (d/q '[:find ?p ?list :where [?p :owl/propertyChainAxiom ?list]] db)]
    (->> pairs
         (map (fn [[r list]]
                (let [props (rdf-list->vec db list)]
                  (when (>= (count props) 2)
                    (let [body (vec (map-indexed (fn [i p]
                                                   (let [s (if (zero? i) '?x (symbol (str "?z" i)))
                                                         o (symbol (str "?z" (inc i)))]
                                                     [s p o]))
                                                 props))
                          head ['?x r (symbol (str "?z" (count props)))] ]
                      (into [] (concat [head] body)))))))
         (remove nil?)
         vec)))

(defn rules*
  "Build a ruleset with optional profiles: {:restrictions? true :schema? true :violations? true :chains? true}.
   If :chains? is true, pass :db as well to precompile chain rules."
  [{:keys [restrictions? schema? violations? chains? db]
    :or   {restrictions? true schema? true violations? true chains? false}}]
  (let [base core
        props property-axioms
        classes (if restrictions? class-axioms [])
        schema  (if schema? schema-closure [])
        vios    (if violations? violations [])
        chains  (if (and chains? db) (gen-chain-rules db) [])]
    (into [] (concat base props classes schema chains vios))))

;; --------- Explain and What-If ----------------------------------------------

(defn why-type
  "Explain why entity x is of class c. Returns a vector of {:rule id :support [[e a v] ...]}"
  [db x c]
  (let [identize (fn [z]
                   (cond
                     (keyword? z) z
                     (boolean? z) z
                     (number? z) (or (ffirst (d/q '[:find ?ident :in $ ?e :where [?e :db/ident ?ident]] db z)) z)
                     :else z))
        tr (fn [[e a v]] [(identize e) (identize a) (identize v)])
        subclass-sups (for [[c1]
                            (d/q '[:find ?c1 :in $ ?x ?c
                                   :where [?c1 :rdfs/subClassOf ?c]
                                          [?x :rdf/type ?c1]] db x c)]
                        {:rule :rdfs/subClassOf
                         :support (mapv tr [[x :rdf/type c1] [c1 :rdfs/subClassOf c]])})
        domain-sups   (for [[p y]
                            (d/q '[:find ?p ?y :in $ ?x ?c
                                   :where [?p :rdfs/domain ?c]
                                          [?x ?p ?y]] db x c)]
                        {:rule :rdfs/domain
                         :support (mapv tr [[p :rdfs/domain c] [x p y]])})
        range-sups    (for [[p y]
                            (d/q '[:find ?p ?y :in $ ?x ?c
                                   :where [?p :rdfs/range ?c]
                                          [?x ?p ?y]] db x c)]
                        {:rule :rdfs/range
                         :support (mapv tr [[p :rdfs/range c] [x p y]])})
        some-sups     (for [[y p v]
                            (d/q '[:find ?y ?p ?v :in $ ?x ?c
                                   :where [?c :owl/someValuesFrom ?y]
                                          [?c :owl/onProperty ?p]
                                          [?x ?p ?v]
                                          [?v :rdf/type ?y]] db x c)]
                        {:rule :owl/someValuesFrom
                         :support (mapv tr [[c :owl/someValuesFrom y]
                                            [c :owl/onProperty p]
                                            [x p v]
                                            [v :rdf/type y]])})
        inter-sups    (for [[lst]
                            (d/q '[:find ?list :in $ ?x ?c
                                   :where [?c :owl/intersectionOf ?list]] db x c)
                            :let [members (rdf-list->vec db lst)
                                  facts   (mapv (fn [ci] [x :rdf/type ci]) members)]]
                        {:rule :owl/intersectionOf
                         :support (mapv tr (into [[c :owl/intersectionOf lst]] facts))})]
    (vec (concat subclass-sups domain-sups range-sups some-sups inter-sups))))

(defn why-triple
  "Explain why (s p o) holds. Returns a vector of {:rule :id :support [[e a v] ...]}"
  [db s p o]
  (let [identize (fn [z]
                   (cond
                     (keyword? z) z
                     (boolean? z) z
                     (number? z) (or (ffirst (d/q '[:find ?ident :in $ ?e :where [?e :db/ident ?ident]] db z)) z)
                     :else z))
        tr (fn [[e a v]] [(identize e) (identize a) (identize v)])
        asserted (when (ffirst (d/q '[:find ?s :in $ ?s ?p ?o :where [?s ?p ?o]] db s p o))
                   [{:rule :asserted :support [(tr [s p o])]}])
        subprop  (for [[p1]
                       (d/q '[:find ?p1 :in $ ?s ?p ?o
                              :where [?p1 :rdfs/subPropertyOf ?p]
                                     [?s ?p1 ?o]] db s p o)]
                   {:rule :rdfs/subPropertyOf
                    :support (mapv tr [[p1 :rdfs/subPropertyOf p] [s p1 o]])})
        inverses (concat
                   (for [[p1]
                         (d/q '[:find ?p1 :in $ ?s ?p ?o
                                :where [?p1 :owl/inverseOf ?p]
                                       [?o ?p1 ?s]] db s p o)]
                     {:rule :owl/inverseOf
                      :support (mapv tr [[p1 :owl/inverseOf p] [o p1 s]])})
                   (for [[p1]
                         (d/q '[:find ?p1 :in $ ?s ?p ?o
                                :where [?p :owl/inverseOf ?p1]
                                       [?o ?p1 ?s]] db s p o)]
                     {:rule :owl/inverseOf
                      :support (mapv tr [[p :owl/inverseOf p1] [o p1 s]])}))
        trans    (for [[y]
                       (d/q '[:find ?y :in $ ?s ?p ?o
                              :where [?p :rdf/type :owl/TransitiveProperty]
                                     [?s ?p ?y]
                                     [?y ?p ?o]] db s p o)]
                   {:rule :owl/TransitiveProperty
                    :support (mapv tr [[p :rdf/type :owl/TransitiveProperty]
                                       [s p y]
                                       [y p o]])})]
    (vec (concat (or asserted []) subprop inverses trans))))

(defn what-if-q
  "Counterfactual: apply tx-data to db, then run query with rules. Returns {:base :with :delta}."
  [db tx-data query & inputs]
  (let [rb (apply d/q query db rules inputs)
        {:keys [db-after]} (d/with db {:tx-data tx-data})
        rw (apply d/q query db-after rules inputs)
        delta (clojure.set/difference (set rw) (set rb))]
    {:base rb :with rw :delta delta}))

;; --------- Aggregate helpers for cardinality ---------------------------------

(defn- count-prop
  [db u p]
  (or (ffirst (d/q '[:find (count ?o)
                     :in $ ?u ?p
                     :where [?u ?p ?o]] db u p)) 0))

(defn- count-prop-class
  [db u p c]
  (or (ffirst (d/q '[:find (count ?o)
                     :in $ ?u ?p ?c
                     :where [?u ?p ?o]
                            [?o :rdf/type ?c]] db u p c)) 0))

(defn card-gt?
  "True when count of ?u ?p values is greater than n."
  [db u p n]
  (> (long (count-prop db u p)) (long n)))

(defn card-lt?
  "True when count of ?u ?p values is less than n."
  [db u p n]
  (< (long (count-prop db u p)) (long n)))

(defn card-gt-class?
  "True when count of ?u ?p values of class c is greater than n."
  [db u p n c]
  (> (long (count-prop-class db u p c)) (long n)))

(defn card-lt-class?
  "True when count of ?u ?p values of class c is less than n."
  [db u p n c]
  (< (long (count-prop-class db u p c)) (long n)))
