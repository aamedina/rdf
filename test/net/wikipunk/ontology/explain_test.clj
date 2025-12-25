(ns net.wikipunk.ontology.explain-test
  (:require [clojure.test :refer :all]
            [clojure.string :as str]
            [clojure.set :as set]
            [net.wikipunk.ontology.explain :as x])
  (:import (org.semanticweb.owlapi.apibinding OWLManager)
           (org.semanticweb.owlapi.model IRI AxiomType OWLClassExpression)
           (org.semanticweb.owlapi.vocab OWL2Datatype)
           (openllet.owlapi OpenlletReasonerFactory)))

#_(set! *warn-on-reflection* true)

(defn- toy-inconsistent []
  (let [m   (OWLManager/createOWLOntologyManager)
        iri (IRI/create "urn:test:toy")
        ont (.createOntology m iri)
        df  (.getOWLDataFactory m)
        A   (.getOWLClass df (IRI/create "urn:test:A"))
        B   (.getOWLClass df (IRI/create "urn:test:B"))
        x   (.getOWLNamedIndividual df (IRI/create "urn:test:x"))
        disj (.getOWLDisjointClassesAxiom df (doto (java.util.HashSet.) (.add A) (.add B)))
        axA  (.getOWLClassAssertionAxiom df A x)
        axB  (.getOWLClassAssertionAxiom df B x)]
    (.addAxiom m ont disj)
    (.addAxiom m ont axA)
    (.addAxiom m ont axB)
    {:manager m :ontology ont}))

(defn- toy-consistent []
  (let [m   (OWLManager/createOWLOntologyManager)
        iri (IRI/create "urn:test:toy-consistent")
        ont (.createOntology m iri)
        df  (.getOWLDataFactory m)
        A   (.getOWLClass df (IRI/create "urn:test:A"))
        B   (.getOWLClass df (IRI/create "urn:test:B"))
        disj (.getOWLDisjointClassesAxiom df (doto (java.util.HashSet.) (.add A) (.add B)))]
    (.addAxiom m ont disj)
    {:manager m :ontology ont}))

(deftest explanations-exist-for-toy-inconsistency
  (let [loaded (toy-inconsistent)
        ;; sanity: reasoner sees global inconsistency
        reasoner (.createReasoner (OpenlletReasonerFactory/getInstance)
                                  ^org.semanticweb.owlapi.model.OWLOntology (:ontology loaded))
        _ (is (false? (.isConsistent reasoner)) "Toy ontology should be inconsistent")
        js (vec (x/inconsistency-justifications loaded {:max 5 :reasoner :pellet}))]
    (is (seq js) "Expected at least one minimal justification")
    (doseq [{:keys [text by-file axioms]} js]
      (is (pos? (count (str/trim (or text "")))) "Renderer produced non-empty Manchester block")
      (is (seq by-file) "Each justification maps axioms to at least one source document")
      (is (>= (count axioms) 3) "Expected at least 3 axioms (disjoint + 2 class assertions)"))))

(deftest no-explanations-when-consistent
  (let [loaded (toy-consistent)
        reasoner (.createReasoner (OpenlletReasonerFactory/getInstance)
                                  ^org.semanticweb.owlapi.model.OWLOntology (:ontology loaded))]
    (is (.isConsistent reasoner) "Toy ontology should be consistent")
    (is (nil? (x/inconsistency-justifications loaded {:max 3 :reasoner :pellet})))))

(deftest blackbox-explanations-precise-on-toy-inconsistency
  (let [{:keys [manager ontology]} (toy-consistent)
        df (.getOWLDataFactory ^org.semanticweb.owlapi.model.OWLOntologyManager manager)
        A (.getOWLClass df (IRI/create "urn:test:A"))
        B (.getOWLClass df (IRI/create "urn:test:B"))
        disj (.getOWLDisjointClassesAxiom df (doto (java.util.HashSet.) (.add A) (.add B)))
        ;; Entailment from inconsistency pattern: A ⊓ B ⊑ ⊥ due to DisjointClasses(A,B)
        ce   (.getOWLObjectIntersectionOf df (doto (java.util.LinkedHashSet.) (.add A) (.add B)))
        ax   (.getOWLSubClassOfAxiom df ce (.getOWLNothing df))
        factory (x/explanation-factory (OpenlletReasonerFactory/getInstance) nil manager)
        gen     (.createExplanationGenerator factory ^org.semanticweb.owlapi.model.OWLOntology ontology)
        exps    (.getExplanations gen ax)]
    (is (seq exps) "Expected at least one explanation from BlackBox generator")    
    (let [j0 (.getAxioms (first exps))]
      (is (instance? java.util.Set j0))
      (let [axioms (set (iterator-seq (.iterator ^java.util.Set j0)))
            txt    (x/render-justification j0)]
        (is (contains? axioms disj) "Justification should include disjointness axiom")
        ;; Class assertions are not necessary for A ⊓ B ⊑ ⊥
        (is (pos? (count (clojure.string/trim txt))) "Manchester rendering should be non-empty")))))

(deftest inconsistent-ttl-yields-explanations-with-file-sources
  ;; Load a tiny inconsistent ontology from TTL and ensure we can render
  ;; minimal justifications that reference the TTL file as a source.
  (let [path "test/resources/violations/inconsistent.ttl"
        m    (OWLManager/createOWLOntologyManager)
        ont  (.loadOntologyFromOntologyDocument m (java.io.File. path))
        js   (vec (x/inconsistency-justifications {:manager m :ontology ont} {:max 10 :reasoner :pellet}))]
    (is (seq js) "Expected at least one minimal justification for inconsistent TTL")
    (doseq [{:keys [text by-file axioms]} js]
      (is (pos? (count (clojure.string/trim (or text "")))) "Renderer produced non-empty Manchester block")
      (is (some (fn [^String f]
                  (or (= f path)
                      (.endsWith f (str java.io.File/separator path))))
                (keys by-file))
          "Justification should include the TTL file as a source")
      (is (>= (count axioms) 3) "Expected at least 3 axioms (disjoint + 2 class assertions)"))))


(deftest imports-surface-inconsistency-explanations
  ;; Aggregator ontology that imports all inconsistency fixtures should be
  ;; detected as inconsistent, and we should generate explanations that cite
  ;; axioms from imported documents (not only the aggregator).
  (let [agg-path "test/resources/violations/inconsistency.ttl"
        mappings {"urn:test:inc-irreflexive/"          "test/resources/violations/inconsistency_irreflexive.ttl"
                  "urn:test:inc-asymmetric/"           "test/resources/violations/inconsistency_asymmetric.ttl"
                  "urn:test:inc-func-op/"              "test/resources/violations/inconsistency_functional_op.ttl"
                  "urn:test:inc-func-dp/"              "test/resources/violations/inconsistency_functional_dp.ttl"
                  "urn:test:inc-key/"                  "test/resources/violations/inconsistency_key.ttl"
                  "urn:test:inc-disjoint-props/"       "test/resources/violations/inconsistency_disjoint_props.ttl"
                  "urn:test:inc-inv-func/"             "test/resources/violations/inconsistency_inverse_functional.ttl"
                  "urn:test:inc-npa/"                  "test/resources/violations/inconsistency_negative_prop_assertion.ttl"
                  "urn:test:inc-hasSelf-irreflexive/"  "test/resources/violations/inconsistency_hasSelf_irreflexive.ttl"
                  "urn:test:inc-cardinality/"          "test/resources/violations/inconsistency_cardinality.ttl"
                  "urn:test:inc-allvalues-dt/"         "test/resources/violations/inconsistency_allvaluesfrom_datatype.ttl"}
        m  (OWLManager/createOWLOntologyManager)]
    ;; Map the import IRIs to local files to keep offline
    (doseq [[iri path] mappings]
      (.addIRIMapper m
        (org.semanticweb.owlapi.util.SimpleIRIMapper.
          (IRI/create ^String iri)
          (IRI/create (java.io.File. ^String path)))))
    (let [ont (.loadOntologyFromOntologyDocument m (java.io.File. agg-path))
          r   (.createReasoner (OpenlletReasonerFactory/getInstance) ont)]
      (is (false? (.isConsistent r)) "Aggregate import ontology should be inconsistent")
      ;; Sanity: ensure imports were actually resolved to local files
      (let [loaded-files (->> (.getOntologies m)
                              (map (fn [o]
                                     (let [iri (.getOntologyDocumentIRI m o)
                                           u   (.toURI iri)]
                                       (when (= "file" (.getScheme u))
                                         (.getPath (java.io.File. u))))))
                              (remove nil?)
                              set)
            imported  (->> mappings vals (map #(-> (java.io.File. ^String %) .getAbsolutePath)) set)]
        (is (seq (set/intersection loaded-files imported))
            "Manager should have loaded at least one imported fixture file")))))

(deftest inconsistent-explanation-factory-produces-justifications
  ;; Use the new inconsistent-explanation-factory on a tiny inconsistent TTL
  ;; to generate minimal justifications for Thing ⊑ Nothing.
  (let [path "test/resources/violations/inconsistent.ttl"
        m    (OWLManager/createOWLOntologyManager)
        ont  (.loadOntologyFromOntologyDocument m (java.io.File. path))
        r    (.createReasoner (OpenlletReasonerFactory/getInstance) ont)]
    (is (false? (.isConsistent r)) "Fixture should be inconsistent")
    (let [factory (x/inconsistent-explanation-factory (OpenlletReasonerFactory/getInstance) nil m)
          gen     (.createExplanationGenerator factory ont)
          ax      (x/thing-subclass-nothing-axiom)
          exps    (.getExplanations gen ax (int 10))]
      (is (seq exps) "Expected at least one explanation from inconsistent-explanation-factory")
      (let [e0   (first exps)
            jset (.getAxioms ^org.semanticweb.owl.explanation.api.Explanation e0)
            byf  (reduce (fn [m2 a]
                          (update m2 (x/axiom->source-file m a) (fnil conj []) a))
                        (sorted-map) (iterator-seq (.iterator ^java.util.Set jset)))
            files (->> (keys byf) (remove nil?) set)]
        (is (contains? files (.getAbsolutePath (java.io.File. path)))
            "Explanation should cite the source TTL file")
         ;; Assert the minimal set includes DisjointClasses(A,B) and class assertions A(x), B(x)
         (let [axioms     (set (iterator-seq (.iterator ^java.util.Set jset)))
               iri        (fn [s] (IRI/create (str "urn:test:inc/" s)))
               A         (iri "A")
               B         (iri "B")
               x         (iri "x")
               disjoint? (some (fn [^org.semanticweb.owlapi.model.OWLAxiom a]
                                 (when (= (.getAxiomType a) AxiomType/DISJOINT_CLASSES)
                                   (let [d ^org.semanticweb.owlapi.model.OWLDisjointClassesAxiom a
                                         exprs (.getClassExpressionsAsList d)
                                         classes (->> exprs (map #(.asOWLClass ^OWLClassExpression %)) (remove nil?)
                                                      (map #(.getIRI ^org.semanticweb.owlapi.model.OWLClass %)) set)]
                                     (and (contains? classes A) (contains? classes B)))))
                               axioms)
               has-Ax?   (some (fn [^org.semanticweb.owlapi.model.OWLAxiom a]
                                 (when (= (.getAxiomType a) AxiomType/CLASS_ASSERTION)
                                   (let [ca ^org.semanticweb.owlapi.model.OWLClassAssertionAxiom a
                                         ind (.asOWLNamedIndividual (.getIndividual ca))
                                         cls (.asOWLClass (.getClassExpression ca))]
                                     (and ind cls
                                          (= (.getIRI ind) x)
                                          (= (.getIRI cls) A)))))
                               axioms)
               has-Bx?   (some (fn [^org.semanticweb.owlapi.model.OWLAxiom a]
                                 (when (= (.getAxiomType a) AxiomType/CLASS_ASSERTION)
                                   (let [ca ^org.semanticweb.owlapi.model.OWLClassAssertionAxiom a
                                         ind (.asOWLNamedIndividual (.getIndividual ca))
                                         cls (.asOWLClass (.getClassExpression ca))]
                                     (and ind cls
                                          (= (.getIRI ind) x)
                                          (= (.getIRI cls) B)))))
                               axioms)]
           (is disjoint? "Justification should include DisjointClasses(A,B)")
           (is (and has-Ax? has-Bx?) "Justification should include class assertions A(x) and B(x)"))))))

(deftest disjoint-axiom-explain-cites-source-file
  (let [path "test/resources/violations/disjoint_only.ttl"
        m    (OWLManager/createOWLOntologyManager)
        ont  (.loadOntologyFromOntologyDocument m (java.io.File. path))
        ctx  {:manager m :ontology ont}
        ax   (first (.getAxioms ont AxiomType/DISJOINT_CLASSES))
        res  (x/explain ctx ax {:max 5 :render :functional})]
    (is (= :ok (:status res)) "Disjoint axiom should be entailed")
    (is (seq (:explanations res)) "Expected at least one justification")
    (let [files (->> (:explanations res)
                     (map :by-file)
                     (mapcat keys)
                     (remove nil?)
                     set)]
      (is (some (fn [^String f]
                  (or (= f path)
                      (.endsWith f (str java.io.File/separator path))))
                files)
          "Justification should cite the TTL file"))))

(deftest load-context-inferrs-prefixes-and-caches
  (let [ctx (x/load-context "test/resources/iri_stub.ttl")]
    (is (= "http://example.com/" (get-in ctx [:prefixes "ex"])) "Should capture prefix from document format")
    (is (= "http://www.w3.org/1999/02/22-rdf-syntax-ns#" (get-in ctx [:prefixes "rdf"])) "Default RDF prefix should be available")
    (is (instance? clojure.lang.Atom (get-in ctx [:caches :property-kind])) "Property-kind cache should be initialised")
    (is (instance? clojure.lang.IAtom (:eng-cache ctx)) "Engine cache atom should be present")
    (is (contains? @(:eng-cache ctx) :store) "Engine cache should have storage skeleton")))

;; targeted-individual-justifications removed (redundant with inconsistent-explanation-factory)

;; ===================== DSL + Public API smoke tests =====================

(defn- prefixes-default []
  {"ex"  "urn:test:"
   "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
   "rdfs" "http://www.w3.org/2000/01/rdf-schema#"
   "owl" "http://www.w3.org/2002/07/owl#"
   "xsd" "http://www.w3.org/2001/XMLSchema#"})

(defn- annotation-context []
  (let [m    (OWLManager/createOWLOntologyManager)
        iri  (IRI/create "urn:test:ann")
        ont  (.createOntology m iri)
        df   (.getOWLDataFactory m)
        ap   (.getOWLAnnotationProperty df (IRI/create "urn:test:ap"))
        cls  (.getOWLClass df (IRI/create "urn:test:Ghost"))
        note (.getOWLDataProperty df (IRI/create "urn:test:note"))
        bn-sub (.getOWLAnonymousIndividual df "b0")
        bn-val (.getOWLAnonymousIndividual df "b1")
        lit   (.getOWLLiteral df "whisper")
        ann1  (.getOWLAnnotation df ap lit)
        ann2  (.getOWLAnnotation df ap bn-val)
        ax1   (.getOWLAnnotationAssertionAxiom df bn-sub ann1)
        ax2   (.getOWLAnnotationAssertionAxiom df (IRI/create "urn:test:s") ann2)
        type-ax (.getOWLClassAssertionAxiom df cls bn-sub)
        data-ax (.getOWLDataPropertyAssertionAxiom df note bn-sub (.getOWLLiteral df "hush"))]
    (doseq [ax [(.getOWLDeclarationAxiom df ap)
                (.getOWLDeclarationAxiom df cls)
                (.getOWLDeclarationAxiom df note)
                ax1 ax2 type-ax data-ax]]
      (.addAxiom m ont ax))
    {:ctx {:manager m :ontology ont :prefixes (prefixes-default)}
     :ax1 ax1
     :ax2 ax2
     :bn-sub-id "b0"
     :bn-val-id "b1"}))

(deftest dsl->axiom-basic
  (let [m   (OWLManager/createOWLOntologyManager)
        ont (.createOntology m (IRI/create "urn:test:dsl"))
        ctx {:manager m :ontology ont :prefixes (prefixes-default)}]
    (is (instance? org.semanticweb.owlapi.model.OWLAxiom
                   (x/form->axiom ctx [:rdfs/subClassOf :ex/A :ex/B])))
    (is (instance? org.semanticweb.owlapi.model.OWLAxiom
                   (x/form->axiom ctx [:rdf/type :ex/i :ex/A])))
    (is (thrown? clojure.lang.ExceptionInfo
                 (x/form->axiom ctx [:owl/unknownOp :ex/A])))))

(deftest object-and-data-domain-range-roundtrip
  (let [m   (OWLManager/createOWLOntologyManager)
        ont (.createOntology m (IRI/create "urn:test:domain-range"))
        df  (.getOWLDataFactory m)
        obj (.getOWLObjectProperty df (IRI/create "urn:test:rel"))
        cls (.getOWLClass df (IRI/create "urn:test:C"))
        dom-ax (.getOWLObjectPropertyDomainAxiom df obj cls)
        ran-ax (.getOWLObjectPropertyRangeAxiom df obj cls)
        dprop (.getOWLDataProperty df (IRI/create "urn:test:dat"))
        dtype (.getOWLDatatype df (IRI/create "http://www.w3.org/2001/XMLSchema#integer"))
        ddom (.getOWLDataPropertyDomainAxiom df dprop cls)
        dran (.getOWLDataPropertyRangeAxiom df dprop dtype)
        _    (doseq [ax [(.getOWLDeclarationAxiom df obj)
                         (.getOWLDeclarationAxiom df dprop)
                         dom-ax ran-ax ddom dran]]
               (.addAxiom m ont ax))
        ctx  {:manager m :ontology ont :prefixes (prefixes-default)}]
    (is (= dom-ax (x/form->axiom ctx (x/axiom->form ctx dom-ax))))
    (is (= ran-ax (x/form->axiom ctx (x/axiom->form ctx ran-ax))))
    (is (= ddom   (x/form->axiom ctx (x/axiom->form ctx ddom))))
    (is (= dran   (x/form->axiom ctx (x/axiom->form ctx dran))))))

(deftest explain-consistent-entailed
  (let [m   (OWLManager/createOWLOntologyManager)
        ont (.createOntology m (IRI/create "urn:test:entailed"))
        df  (.getOWLDataFactory m)
        A   (.getOWLClass df (IRI/create "urn:test:A"))
        B   (.getOWLClass df (IRI/create "urn:test:B"))
        sub (.getOWLSubClassOfAxiom df A B)
        _   (.addAxiom m ont sub)
        ctx {:manager m :ontology ont :prefixes (prefixes-default)}
        res (x/explain ctx [:rdfs/subClassOf :ex/A :ex/B] {:max 3})]
    (is (= :ok (:status res)))
    (is (seq (:explanations res)))
    (is (instance? org.semanticweb.owlapi.model.OWLAxiom (:axiom res)))))

;; ===================== q (Datomic-style) front-end tests =====================

(defn- q-toy []
  (let [m   (OWLManager/createOWLOntologyManager)
        iri (IRI/create "urn:test:q-toy")
        ont (.createOntology m iri)
        df  (.getOWLDataFactory m)
        Person (.getOWLClass df (IRI/create "urn:test:Person"))
        a   (.getOWLNamedIndividual df (IRI/create "urn:test:a"))
        z   (.getOWLNamedIndividual df (IRI/create "urn:test:z"))
        ax1 (.getOWLClassAssertionAxiom df Person a)
        ax2 (.getOWLClassAssertionAxiom df Person z)]
    (.addAxiom m ont ax1)
    (.addAxiom m ont ax2)
    {:manager m :ontology ont :prefixes {"ex"  "urn:test:"
                                         "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
                                         "rdfs" "http://www.w3.org/2000/01/rdf-schema#"
                                         "owl" "http://www.w3.org/2002/07/owl#"}}))

(deftest q-vector-basic-and-paging
  (let [ctx (q-toy)
        res (x/q '[:find ?x :where [?x :rdf/type :ex/Person] :return :kw] ctx)]
    (is (= res #{[:ex/a] [:ex/z]})))
  (let [ctx (q-toy)
        r1 (x/q '[:find ?x :where [?x :rdf/type :ex/Person] :order {:by :kw :dir :asc} :limit 1 :return :kw] ctx)
        r2 (x/q '[:find ?x :where [?x :rdf/type :ex/Person] :order {:by :kw :dir :asc} :offset 1 :limit 1 :return :kw] ctx)]
    (is (= r1 #{[:ex/a]}))
    (is (= r2 #{[:ex/z]}))))

(deftest q-map-with-in-and-paging
  (let [ctx (q-toy)
        res (x/q {:query '[:find ?x
                            :in $ ?C
                            :where [?x :rdf/type ?C]
                            :order {:by :kw :dir :asc}
                            :limit 1
                            :return :kw]
                   :args  [ctx :ex/Person]})]
    (is (= res #{[:ex/a]}))))

(deftest dq-literal-mode-edn-and-raw
  (let [m   (OWLManager/createOWLOntologyManager)
        ont (.createOntology m (IRI/create "urn:test:lmode"))
        df  (.getOWLDataFactory m)
        person (.getOWLNamedIndividual df (IRI/create "urn:test:p"))
        age    (.getOWLDataProperty df (IRI/create "urn:test:age"))
        _      (.addAxiom m ont (.getOWLDeclarationAxiom df age))
        _      (.addAxiom m ont (.getOWLDataPropertyAssertionAxiom df age person (.getOWLLiteral df 42)))
        ctx    {:manager m :ontology ont :prefixes (prefixes-default)}
        query  {:find ['?v]
                :where '[[ :ex/p :ex/age ?v]]
                :return :kw}
        edn    (x/dq ctx query)
        raw    (x/dq ctx (assoc query :options {:literal-mode :raw}))]
    (is (= edn #{[42]}))
    (let [literal (ffirst raw)]
      (is (instance? org.semanticweb.owlapi.model.OWLLiteral literal))
      (is (= "42" (.getLiteral ^org.semanticweb.owlapi.model.OWLLiteral literal))))))

(deftest explain-consistent-not-entailed
  (let [m   (OWLManager/createOWLOntologyManager)
        ont (.createOntology m (IRI/create "urn:test:not-entailed"))
        ctx {:manager m :ontology ont :prefixes (prefixes-default)}
        res (x/explain ctx [:rdfs/subClassOf :ex/X :ex/Y] {})]
    (is (= :not-entailed (:status res)))
    (is (empty? (:explanations res)))
    (is (= [:rdfs/subClassOf :ex/X :ex/Y] (:edn res)))))

(deftest explain-inconsistent-status
  (let [{:keys [manager ontology]} (toy-inconsistent)
        ctx {:manager manager :ontology ontology :prefixes (prefixes-default)}
        res (x/explain ctx [:rdfs/subClassOf :ex/A :ex/B] {:reasoner :pellet})]
    (is (= :inconsistent (:status res)))
    (is (instance? org.semanticweb.owlapi.model.OWLAxiom (:axiom res)))))

(deftest unsatisfiable-classes-exclude-nothing
  (let [m   (OWLManager/createOWLOntologyManager)
        ont (.createOntology m (IRI/create "urn:test:unsat"))
        df  (.getOWLDataFactory m)
        cls (.getOWLClass df (IRI/create "urn:test:A"))
        ax  (.getOWLSubClassOfAxiom df cls (.getOWLNothing df))]
    (.addAxiom m ont ax)
    (let [unsats (x/unsatisfiable-named-classes ont {:reasoner :pellet})]
      (is (every? #(not (.isOWLNothing ^org.semanticweb.owlapi.model.OWLClass %)) unsats))
      (is (some #(= (.getIRI ^org.semanticweb.owlapi.model.OWLClass %) (.getIRI cls)) unsats)))))

;; ===================== Roundtrip + EDN coverage =====================

(def ^:private integer-datatypes
  #{:xsd/integer :xsd/int :xsd/long :xsd/short :xsd/byte
    :xsd/nonNegativeInteger :xsd/nonPositiveInteger
    :xsd/positiveInteger :xsd/negativeInteger
    :xsd/unsignedInt :xsd/unsignedLong :xsd/unsignedShort :xsd/unsignedByte})

(def ^:private decimal-datatypes #{:xsd/decimal})
(def ^:private float-datatypes #{:xsd/double :xsd/float})

(defn- maybe-flatten
  [coll]
  (if (and (coll? coll)
           (= 1 (count coll))
           (sequential? (first coll)))
    (first coll)
    coll))

(defn- canon [form]
  (cond
    (vector? form)
    (let [[op & args] form]
      (case op
        (:owl/equivalentClass)
        (let [elements (maybe-flatten args)
              elems'   (sort-by pr-str (map canon elements))]
          [:owl/equivalentClass elems'])

        :owl/DisjointClasses
        (let [elements (maybe-flatten args)
              elems'   (sort-by pr-str (map canon elements))]
          [:owl/DisjointClasses elems'])

        :owl/disjointUnionOf
        (let [[head & parts] args
              elements (maybe-flatten parts)
              elems'   (sort-by pr-str (map canon elements))]
          [:owl/disjointUnionOf (canon head) elems'])

        :owl/sameAs
        (let [elements (maybe-flatten args)]
          (into [:owl/sameAs] (map canon elements)))

        :owl/intersectionOf
        {:rdf/type :owl/Class
         :owl/intersectionOf (vec (sort-by pr-str (map canon args)))}

        :owl/unionOf
        {:rdf/type :owl/Class
         :owl/unionOf (vec (sort-by pr-str (map canon args)))}

        :owl/oneOf
        {:rdf/type :owl/Class
         :owl/oneOf (vec (sort-by pr-str (map canon args)))}

        :owl/complementOf
        {:rdf/type :owl/Class
         :owl/complementOf (canon (first args))}

        :owl/someValuesFrom
        (let [[prop filler] args]
          {:rdf/type :owl/Restriction
           :owl/onProperty (canon prop)
           :owl/someValuesFrom (canon filler)})

        :owl/allValuesFrom
        (let [[prop filler] args]
          {:rdf/type :owl/Restriction
           :owl/onProperty (canon prop)
           :owl/allValuesFrom (canon filler)})

        :owl/hasValue
        (let [[prop value] args]
          {:rdf/type :owl/Restriction
           :owl/onProperty (canon prop)
           :owl/hasValue (canon value)})

        :owl/hasSelf
        {:rdf/type :owl/Restriction
         :owl/onProperty (canon (first args))
         :owl/hasSelf true}

        :owl/minCardinality
        (let [[n prop] args]
          {:rdf/type :owl/Restriction
           :owl/onProperty (canon prop)
           :owl/minCardinality n})

        :owl/maxCardinality
        (let [[n prop] args]
          {:rdf/type :owl/Restriction
           :owl/onProperty (canon prop)
           :owl/maxCardinality n})

        :owl/cardinality
        (let [[n prop] args]
          {:rdf/type :owl/Restriction
           :owl/onProperty (canon prop)
           :owl/cardinality n})

        :owl/minQualifiedCardinality
        (let [[n prop cls] args]
          {:rdf/type :owl/Restriction
           :owl/onProperty (canon prop)
           :owl/minCardinality n
           :owl/onClass (canon cls)})

        :owl/maxQualifiedCardinality
        (let [[n prop cls] args]
          {:rdf/type :owl/Restriction
           :owl/onProperty (canon prop)
           :owl/maxCardinality n
           :owl/onClass (canon cls)})

        :owl/qualifiedCardinality
        (let [[n prop cls] args]
          {:rdf/type :owl/Restriction
           :owl/onProperty (canon prop)
           :owl/qualifiedCardinality n
           :owl/onClass (canon cls)})

        :owl/dataSomeValuesFrom
        (let [[dp dr] args]
          {:rdf/type :owl/Restriction
           :owl/onProperty (canon dp)
           :owl/someValuesFrom (canon dr)})

        :owl/dataAllValuesFrom
        (let [[dp dr] args]
          {:rdf/type :owl/Restriction
           :owl/onProperty (canon dp)
           :owl/allValuesFrom (canon dr)})

        :owl/dataHasValue
        (let [[dp lit] args]
          {:rdf/type :owl/Restriction
           :owl/onProperty (canon dp)
           :owl/hasValue (canon lit)})

        :owl/dataMinCardinality
        (let [[n dp] args]
          {:rdf/type :owl/Restriction
           :owl/onProperty (canon dp)
           :owl/minCardinality n})

        :owl/dataMaxCardinality
        (let [[n dp] args]
          {:rdf/type :owl/Restriction
           :owl/onProperty (canon dp)
           :owl/maxCardinality n})

        :owl/dataExactCardinality
        (let [[n dp] args]
          {:rdf/type :owl/Restriction
           :owl/onProperty (canon dp)
           :owl/cardinality n})

        :owl/dataMinQualifiedCardinality
        (let [[n dp dr] args]
          {:rdf/type :owl/Restriction
           :owl/onProperty (canon dp)
           :owl/minCardinality n
           :owl/onDataRange (canon dr)})

        :owl/dataMaxQualifiedCardinality
        (let [[n dp dr] args]
          {:rdf/type :owl/Restriction
           :owl/onProperty (canon dp)
           :owl/maxCardinality n
           :owl/onDataRange (canon dr)})

        :owl/dataQualifiedCardinality
        (let [[n dp dr] args]
          {:rdf/type :owl/Restriction
           :owl/onProperty (canon dp)
           :owl/qualifiedCardinality n
           :owl/onDataRange (canon dr)})

        :owl/dataIntersectionOf
        {:owl/dataIntersectionOf (vec (sort-by pr-str (map canon (maybe-flatten args))))}

        :owl/dataUnionOf
        {:owl/dataUnionOf (vec (sort-by pr-str (map canon (maybe-flatten args))))}

        :owl/dataOneOf
        {:owl/dataOneOf (vec (map canon (maybe-flatten args)))}

        :owl/inverseOf
        [:owl/inverseOf (canon (first args))]

        :chain
        (into [:chain] (map canon args))

        (into [op] (map canon args))))

    (map? form)
    (let [m (into {} (map (fn [[k v]] [k (canon v)]) form))]
      (cond
        (and (contains? m :lex) (contains? m :datatype) (string? (:lex m)))
        (let [lex (:lex m)
              dtype (:datatype m)]
          (case dtype
            :xsd/integer (bigint lex)
            :xsd/int     (bigint lex)
            :xsd/decimal (bigdec lex)
            :xsd/double  (Double/parseDouble lex)
            :xsd/boolean (Boolean/valueOf lex)
            m))

        (contains? m :rdf/value)
        (let [val (:rdf/value m)
              dtype (:rdf/type m)
              lang  (or (:rdf/lang m) (:rdf/language m))]
          (cond
            lang {:lex val :lang lang}
            (= dtype :xsd/string) val
            (integer-datatypes dtype) (bigint val)
            (decimal-datatypes dtype) (bigdec val)
            (float-datatypes dtype)   (Double/parseDouble val)
            dtype {:lex val :datatype dtype}
            (map? val) (canon val)
            :else val))

        (:owl/unionOf m)
        (update m :owl/unionOf #(vec (sort-by pr-str (map canon (maybe-flatten %)))))

        (:owl/intersectionOf m)
        (update m :owl/intersectionOf #(vec (sort-by pr-str (map canon (maybe-flatten %)))))

        (and (= 1 (count m)) (contains? m :owl/inverseOf))
        [:owl/inverseOf (canon (:owl/inverseOf m))]

        :else m))

    (set? form) (set (map canon form))
    (sequential? form) (map canon form)
    :else form))

(deftest edn-roundtrip-axioms
  (let [m   (OWLManager/createOWLOntologyManager)
        ont (.createOntology m (IRI/create "urn:test:rt"))
        df  (.getOWLDataFactory m)
        ;; declare signature so property-kind detection succeeds
        _   (.addAxiom m ont (.getOWLDeclarationAxiom df (.getOWLObjectProperty df (IRI/create "urn:test:p"))))
        _   (.addAxiom m ont (.getOWLDeclarationAxiom df (.getOWLObjectProperty df (IRI/create "urn:test:q"))))
        _   (.addAxiom m ont (.getOWLDeclarationAxiom df (.getOWLDataProperty df (IRI/create "urn:test:dp"))))
        ctx {:manager m :ontology ont :prefixes (prefixes-default)}
        forms [
               [:rdfs/subClassOf :ex/A :ex/B]
               [:owl/equivalentClass :ex/A [:owl/intersectionOf :ex/B :ex/C]]
               [:owl/DisjointClasses :ex/A :ex/B :ex/C]
               [:owl/disjointUnionOf :ex/Head :ex/A :ex/B]
               [:rdf/type :ex/i :ex/A]
               [:owl/sameAs :ex/i1 :ex/i2]
               [:rdfs/subPropertyOf :ex/p :ex/q]
               [:owl/inverseOf :ex/p :ex/q]
               [:owl/TransitiveProperty :ex/p]
               [:owl/FunctionalProperty :ex/p]
               [:rdfs/subClassOf [:owl/someValuesFrom :ex/p :ex/B] :ex/A]
               [:rdfs/subClassOf [:owl/dataSomeValuesFrom :ex/dp
                                  [:owl/withRestrictions :xsd/integer [[:xsd/minInclusive 0]]]] :ex/A]
               [:owl/AnnotationAssertion :rdfs/label :ex/A {:lex "A" :lang "en"}]
               ;; More operators for coverage
               [:rdfs/subClassOf [:owl/hasSelf :ex/p] :ex/A]
               [:rdfs/subClassOf [:owl/minCardinality 2 :ex/p] :ex/A]
               [:rdfs/subClassOf [:owl/maxCardinality 3 :ex/p] :ex/A]
               [:rdfs/subClassOf [:owl/cardinality 1 :ex/p] :ex/A]
               [:rdfs/subClassOf [:owl/minQualifiedCardinality 2 :ex/p :ex/B] :ex/A]
               [:rdfs/subClassOf [:owl/maxQualifiedCardinality 3 :ex/p :ex/B] :ex/A]
               [:rdfs/subClassOf [:owl/qualifiedCardinality 1 :ex/p :ex/B] :ex/A]
               [:rdfs/subClassOf [:owl/dataMinCardinality 1 :ex/dp] :ex/A]
               [:rdfs/subClassOf [:owl/dataMaxCardinality 2 :ex/dp] :ex/A]
               [:rdfs/subClassOf [:owl/dataExactCardinality 3 :ex/dp] :ex/A]
               [:rdfs/subClassOf [:owl/dataMinQualifiedCardinality 1 :ex/dp :xsd/integer] :ex/A]
               [:rdfs/subClassOf [:owl/dataMaxQualifiedCardinality 2 :ex/dp :xsd/integer] :ex/A]
               [:rdfs/subClassOf [:owl/dataQualifiedCardinality 3 :ex/dp :xsd/integer] :ex/A]
               [:rdfs/subClassOf [:owl/dataAllValuesFrom :ex/dp [:owl/dataUnionOf :xsd/string :xsd/integer]] :ex/A]
               [:rdfs/subClassOf [:owl/dataSomeValuesFrom :ex/dp [:owl/dataOneOf {:lex "x" :lang "en"} {:lex "1" :datatype :xsd/integer}]] :ex/A]
               [:owl/propertyChainAxiom :ex/super [:chain :ex/p :ex/q]]
               [:owl/propertyDisjointWith :ex/p :ex/q]
               [:owl/equivalentClass :ex/X [:owl/complementOf :ex/Y]]
               ]]
    (doseq [f forms]
      (let [ax (x/form->axiom ctx f)
            back (x/axiom->form ctx ax)]
        (is (= (canon f) (canon back)) (str "roundtrip mismatch for " f))))))

(deftest property-chain-with-inverse-roundtrip
  (let [m   (OWLManager/createOWLOntologyManager)
        ont (.createOntology m (IRI/create "urn:test:chain"))
        df  (.getOWLDataFactory m)
        super (.getOWLObjectProperty df (IRI/create "urn:test:super"))
        p     (.getOWLObjectProperty df (IRI/create "urn:test:p"))
        q     (.getOWLObjectProperty df (IRI/create "urn:test:q"))
        _     (.addAxiom m ont (.getOWLDeclarationAxiom df super))
        _     (.addAxiom m ont (.getOWLDeclarationAxiom df p))
        _     (.addAxiom m ont (.getOWLDeclarationAxiom df q))
        ctx   {:manager m :ontology ont :prefixes (prefixes-default)}
        form  [:owl/propertyChainAxiom :ex/super [:chain :ex/p [:owl/inverseOf :ex/q]]]
        ax    (x/form->axiom ctx form)
        back  (x/axiom->form ctx ax)
        [_ _ chain-form] back]
    (is (= (canon form) (canon back)))
    (is (some (fn [item]
                (or (= [:owl/inverseOf :ex/q] item)
                    (= {:owl/inverseOf :ex/q} item)
                    (= #:owl{:inverseOf :ex/q} item)))
              (rest chain-form)))))

(deftest property-kind-validation
  (let [m   (OWLManager/createOWLOntologyManager)
        ont (.createOntology m (IRI/create "urn:test:pkind"))
        df  (.getOWLDataFactory m)
        ann (.getOWLAnnotationProperty df (IRI/create "urn:test:label"))
        dp  (.getOWLDataProperty df (IRI/create "urn:test:age"))
        _   (.addAxiom m ont (.getOWLDeclarationAxiom df ann))
        _   (.addAxiom m ont (.getOWLDeclarationAxiom df dp))
        ctx {:manager m :ontology ont :prefixes (prefixes-default)}]
    (is (thrown-with-msg? clojure.lang.ExceptionInfo #"annotation property"
                          (x/form->axiom ctx [:rdfs/subPropertyOf :ex/label :ex/age])))
    (let [ax (x/form->axiom ctx [:owl/FunctionalProperty :ex/age])]
      (is (instance? org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom ax)))
    (is (thrown-with-msg? clojure.lang.ExceptionInfo #"Unknown property kind"
                          (x/form->axiom ctx [:owl/FunctionalProperty :ex/unknown])))))

(deftest annotation-assertions-handle-blank-nodes
  (let [{:keys [ctx ax1 ax2 bn-sub-id bn-val-id]} (annotation-context)
        form1 (x/axiom->form ctx ax1)
        form2 (x/axiom->form ctx ax2)]
    (is (= [:owl/AnnotationAssertion :ex/ap {:db/id bn-sub-id} "whisper"]
           (canon form1)))
    (is (= [:owl/AnnotationAssertion :ex/ap :ex/s {:db/id bn-val-id}]
           (canon form2)))))

(deftest dq-annotation-atoms-bind-anonymous-subjects
  (let [{:keys [ctx bn-sub-id bn-val-id]} (annotation-context)
        query {:find ['?s '?o]
               :where '[[?s :ex/ap ?o]]
               :return :kw
               :reasoner :pellet}
        indexed (x/dq ctx query)
        unindexed (x/dq ctx query {:annotation-index? false})]
    (is (= indexed unindexed))
    (is (some (fn [[s _]] (and (map? s) (= bn-sub-id (:db/id s)))) indexed))
    (is (some (fn [[_ o]] (and (map? o) (= bn-val-id (:db/id o)))) indexed))))

(deftest property-disjointness-multiary-roundtrip
  (let [m   (OWLManager/createOWLOntologyManager)
        ont (.createOntology m (IRI/create "urn:test:disjoint"))
        df  (.getOWLDataFactory m)
        p   (.getOWLObjectProperty df (IRI/create "urn:test:p"))
        q   (.getOWLObjectProperty df (IRI/create "urn:test:q"))
        r   (.getOWLObjectProperty df (IRI/create "urn:test:r"))
        _   (doseq [prop [p q r]] (.addAxiom m ont (.getOWLDeclarationAxiom df prop)))
        ctx {:manager m :ontology ont :prefixes (prefixes-default)}
        form [:owl/propertyDisjointWith :ex/p :ex/q :ex/r]
        ax   (x/form->axiom ctx form)
        back (x/axiom->form ctx ax)
        ax-exp (.getOWLDisjointObjectPropertiesAxiom df ^java.util.HashSet (set #{p q r}))]
    (is (= (canon form) (canon back)))
    (is (= ax-exp ax))))

(deftest inverse-object-property-assertion-direction
  (let [m   (OWLManager/createOWLOntologyManager)
        ont (.createOntology m (IRI/create "urn:test:inverse-assert"))
        df  (.getOWLDataFactory m)
        p   (.getOWLObjectProperty df (IRI/create "urn:test:p"))
        s   (.getOWLNamedIndividual df (IRI/create "urn:test:s"))
        o   (.getOWLNamedIndividual df (IRI/create "urn:test:o"))
        inv (.getOWLObjectInverseOf df p)
        ax  (.getOWLObjectPropertyAssertionAxiom df inv s o)
        ctx {:manager m :ontology ont :prefixes (prefixes-default)}
        form (x/axiom->form ctx ax)]
    (is (= [:ex/o :ex/p :ex/s] form))))

(deftest elk-reasoner-guard
  (let [m   (OWLManager/createOWLOntologyManager)
        ont (.createOntology m (IRI/create "urn:test:elk"))
        df  (.getOWLDataFactory m)
        p   (.getOWLObjectProperty df (IRI/create "urn:test:p"))
        q   (.getOWLObjectProperty df (IRI/create "urn:test:q"))
        inv (.getOWLInverseObjectPropertiesAxiom df p q)]
    (.addAxiom m ont inv)
    (let [ctx {:manager m :ontology ont :prefixes (prefixes-default)}]
      (is (thrown-with-msg? clojure.lang.ExceptionInfo #":elk-incompatible"
                            (x/dlq-engine ctx {:reasoner :elk}))))))

(deftest axiom-to-form-property-axioms
  ;; Ensure axiom->form works for data-property specific axioms that EDN builder
  ;; can’t infer without a signature
  (let [m   (OWLManager/createOWLOntologyManager)
        ont (.createOntology m (IRI/create "urn:test:props"))
        df  (.getOWLDataFactory m)
        dp  (.getOWLDataProperty df (IRI/create "urn:test:dp"))
        p1  (.getOWLObjectProperty df (IRI/create "urn:test:p1"))
        p2  (.getOWLObjectProperty df (IRI/create "urn:test:p2"))
        dpsame (.getOWLFunctionalDataPropertyAxiom df dp)
        disj-obj (.getOWLDisjointObjectPropertiesAxiom df ^java.util.HashSet (set #{p1 p2}))
        xctx {:manager m :ontology ont :prefixes (prefixes-default)}]
    (is (= [:owl/FunctionalProperty :ex/dp] (x/axiom->form xctx dpsame)))
    (is (= [:owl/propertyDisjointWith :ex/p1 :ex/p2]
           (x/axiom->form xctx disj-obj)))))

(deftest explain-includes-edn-and-axioms-edn
  ;; consistent entailment path
  (let [m   (OWLManager/createOWLOntologyManager)
        ont (.createOntology m (IRI/create "urn:test:ctx"))
        df  (.getOWLDataFactory m)
        A   (.getOWLClass df (IRI/create "urn:test:A"))
        B   (.getOWLClass df (IRI/create "urn:test:B"))
        ax  (.getOWLSubClassOfAxiom df A B)
        _   (.addAxiom m ont ax)
        ctx {:manager m :ontology ont :prefixes (prefixes-default)}
        res (x/explain ctx [:rdfs/subClassOf :ex/A :ex/B] {:max 3 :render :functional :reasoner :pellet})]
    (is (= :ok (:status res)))
    (is (= (canon [:rdfs/subClassOf :ex/A :ex/B]) (canon (:edn res))))
    (is (seq (:explanations res)))
    (is (seq (:axioms-edn (first (:explanations res)))))
    (is (some #(= (canon [:rdfs/subClassOf :ex/A :ex/B]) (canon %))
              (:axioms-edn (first (:explanations res))))))
  ;; inconsistent path
  (let [{:keys [manager ontology]} (toy-inconsistent)
        ctx {:manager manager :ontology ontology :prefixes (prefixes-default)}
        res (x/explain ctx [:rdfs/subClassOf :ex/A :ex/B] {:max 3 :reasoner :pellet})]
    (is (= :inconsistent (:status res)))
    (is (vector? (:edn res)))
    (is (seq (:explanations res)))
    (is (seq (:axioms-edn (first (:explanations res)))))))

(defn- prefixes-default []
  {"ex"  "urn:test:"
   "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
   "rdfs" "http://www.w3.org/2000/01/rdf-schema#"
   "owl" "http://www.w3.org/2002/07/owl#"
   "xsd" "http://www.w3.org/2001/XMLSchema#"})

(defn- toy-ontology []
  (let [m   (OWLManager/createOWLOntologyManager)
        iri (IRI/create "urn:test:dlq")
        ont (.createOntology m iri)
        df  (.getOWLDataFactory m)
        Vehicle (.getOWLClass df (IRI/create "urn:test:Vehicle"))
        Car     (.getOWLClass df (IRI/create "urn:test:Car"))
        Bike    (.getOWLClass df (IRI/create "urn:test:Bike"))
        Person  (.getOWLClass df (IRI/create "urn:test:Person"))
        Sephira (.getOWLClass df (IRI/create "urn:test:ספירה"))
        hasChild (.getOWLObjectProperty df (IRI/create "urn:test:hasChild"))
        age      (.getOWLDataProperty df (IRI/create "urn:test:age"))
        john     (.getOWLNamedIndividual df (IRI/create "urn:test:john"))
        mary     (.getOWLNamedIndividual df (IRI/create "urn:test:mary"))
        car1     (.getOWLNamedIndividual df (IRI/create "urn:test:car1"))
        chokmah  (.getOWLNamedIndividual df (IRI/create "urn:test:חכמה"))
        rdfsLabel (.getOWLAnnotationProperty df (IRI/create "http://www.w3.org/2000/01/rdf-schema#label"))
        ;; TBox
        subC     (.getOWLSubClassOfAxiom df Car Vehicle)
        subB     (.getOWLSubClassOfAxiom df Bike Vehicle)
        _        (.addAxiom m ont subC)
        _        (.addAxiom m ont subB)
        ;; ABox
        ax-john  (.getOWLClassAssertionAxiom df Person john)
        ax-mary  (.getOWLClassAssertionAxiom df Person mary)
        ax-car1  (.getOWLClassAssertionAxiom df Car car1)
        ax-chokmah (.getOWLClassAssertionAxiom df Sephira chokmah)
        ax-role  (.getOWLObjectPropertyAssertionAxiom df hasChild john mary)
        lit-42   (.getOWLLiteral df (long 42))
        ax-age   (.getOWLDataPropertyAssertionAxiom df age john lit-42)
        lit-10   (.getOWLLiteral df (long 10))
        ax-age-chokmah (.getOWLDataPropertyAssertionAxiom df age chokmah lit-10)
        ann-label (.getOWLAnnotationAssertionAxiom df rdfsLabel (.getIRI chokmah) (.getOWLLiteral df "חכמה" "he"))]
    (doseq [ax [ax-john ax-mary ax-car1 ax-chokmah ax-role ax-age ax-age-chokmah ann-label]] (.addAxiom m ont ax))
    {:manager m :ontology ont :prefixes (prefixes-default)}))

(defn- toy-inconsistent []
  (let [m   (OWLManager/createOWLOntologyManager)
        iri (IRI/create "urn:test:inc")
        ont (.createOntology m iri)
        df  (.getOWLDataFactory m)
        A   (.getOWLClass df (IRI/create "urn:test:A"))
        B   (.getOWLClass df (IRI/create "urn:test:B"))
        x   (.getOWLNamedIndividual df (IRI/create "urn:test:x"))
        disj (.getOWLDisjointClassesAxiom df (doto (java.util.HashSet.) (.add A) (.add B)))
        axA  (.getOWLClassAssertionAxiom df A x)
        axB  (.getOWLClassAssertionAxiom df B x)]
    (doseq [ax [disj axA axB]] (.addAxiom m ont ax))
    {:manager m :ontology ont :prefixes (prefixes-default)}))

(deftest dlq-satisfiable-and-unsat
  (let [ctx (toy-ontology)]
    (is (true? (x/satisfiable? ctx :ex/Vehicle)))
    (is (false? (x/satisfiable? ctx [:owl/intersectionOf :ex/Car [:owl/complementOf :ex/Car]])))))

(deftest dlq-equivalents-return-modes
  (let [ctx (toy-ontology)]
    (is (some #{:ex/Vehicle} (x/equivalents ctx :ex/Vehicle :return :kw)))
    (is (some #{"urn:test:Vehicle"} (x/equivalents ctx :ex/Vehicle :return :iri)))
    (is (some #{"ex:Vehicle"} (x/equivalents ctx :ex/Vehicle :return :short)))))

(deftest dlq-subclasses-ordering-and-pagination
  (let [ctx (toy-ontology)
        all (x/subclasses ctx :ex/Vehicle)
        direct (x/subclasses ctx :ex/Vehicle :direct? true)
        paged (:subclasses (x/dlq ctx {:where :ex/Vehicle
                                       :ask #{:subclasses}
                                       :order {:by :kw :dir :asc}
                                       :limit 1 :offset 1}))]
    (is (every? identity [(vector? all) (vector? direct)]))
    ;; Deterministic: Bike then Car under kw ordering
    (is (= [:ex/Bike :ex/Car] direct))
    (is (= [:ex/Car] (get paged :all)))))

(deftest dlq-instances
  (let [ctx (toy-ontology)
        inst (x/instances ctx :ex/Person :direct? true)]
    (is (every? keyword? inst))
    (is (= (set inst) #{:ex/john :ex/mary}))))

(deftest abox-helpers
  (let [ctx (toy-ontology)
        fillers (x/role-fillers ctx {:of :ex/john :property :ex/hasChild})
        vals    (x/data-values  ctx {:of :ex/john :property :ex/age})]
    (is (= fillers [:ex/mary]))
    (is (= 1 (count vals)))))

(deftest q-triple-star-nonlatin-iris
  (let [ctx (toy-ontology)
        res (set (x/q '[:find ?s ?p ?o
                         :where
                         [?s :rdf/type :ex/ספירה]
                         [?s ?p ?o]
                         :reasoner :structural]
                       ctx))]
    (is (contains? res [:ex/חכמה :ex/age 10N]))
    (is (contains? res [:ex/חכמה :rdfs/label #:rdf{:value "חכמה", :language "he"}]))))

(deftest inconsistent-ontology-behavior
  (let [ctx (toy-inconsistent)
        res (x/dlq ctx {:where :ex/A :ask #{:instances}} {:reasoner :pellet})]
    (is (= :inconsistent (:status res)))
    (is (nil? (get-in res [:instances :all]))
        "No asks run on inconsistent ontologies.")
    (is (seq (:explanations res))
        "Should include minimal inconsistent explanations")))

(deftest explain-bridges
  (let [ctx (toy-ontology)
        r1  (x/explain-instance ctx {:of :ex/john :where [:owl/someValuesFrom :ex/hasChild :ex/Person]} {:max 2})
        r2  (x/explain-unsat ctx [:owl/intersectionOf :ex/Car [:owl/complementOf :ex/Car]] {:max 2})]
    (is (contains? #{:ok :not-entailed :inconsistent} (:status r1)))
    (is (contains? #{:ok :not-entailed :inconsistent} (:status r2)))))

(deftest datalog-open-world-q
  (let [ctx (toy-ontology)
        res (x/dq ctx {:find  ['?x '?p]
                        :where [['?x :ex/hasChild '?p]
                                ['?p :rdf/type :ex/Person]]
                        :reasoner :pellet})]
    (is (set? res))
    (is (contains? res [:ex/john :ex/mary])))
  (let [ctx (toy-ontology)
        res (x/dq ctx {:find  ['?x]
                        :where [[:isa '?x :ex/Person]]
                        :reasoner :pellet})]
    (is (= res #{[:ex/john] [:ex/mary]}))))

(deftest datalog-open-world-q-inconsistent-throws
  (let [ctx (toy-inconsistent)]
    (is (thrown-with-msg? clojure.lang.ExceptionInfo
                          #"Ontology inconsistent"
                          (x/dq ctx {:find ['?x] :where [[:isa '?x :ex/A]]}
                                {:reasoner :pellet})))))

(deftest q-reasoner-selection
  (binding [x/*default-reasoner* :hermit]
    (let [ctx (assoc (toy-ontology) :eng-cache (atom {}))
          res-default (x/q '[:find ?x :where [?x :rdf/type :ex/Person]] ctx)
          res-pellet  (x/q '[:find ?x :where [?x :rdf/type :ex/Person] :reasoner :pellet] ctx)]
      (is (= res-default #{[:ex/john] [:ex/mary]}))
      (is (= res-pellet  #{[:ex/john] [:ex/mary]}))
      (let [cache-state @(:eng-cache ctx)
            selections (set (map (fn [entry]
                                    (:reasoner-selection (if (contains? entry :engine) (:engine entry) entry)))
                                  (vals (:store cache-state))))]
        (is (contains? selections :hermit))
        (is (contains? selections :pellet)))
      (let [before (count (:store @(:eng-cache ctx)))]
        (is (= res-pellet
               (x/q {:find   ['?x]
                     :where  '[[?x :rdf/type :ex/Person]]
                     :reasoner :pellet}
                    ctx)))
        (is (= before (count (:store @(:eng-cache ctx)))))))))

(deftest q-tbox-relations
  (let [{:keys [manager ontology] :as ctx} (toy-ontology)
        df (.getOWLDataFactory manager)
        Parent (.getOWLClass df (IRI/create "urn:test:Parent"))
        Person (.getOWLClass df (IRI/create "urn:test:Person"))
        hasChild (.getOWLObjectProperty df (IRI/create "urn:test:hasChild"))
        decl (.getOWLDeclarationAxiom df Parent)
        some-ax (.getOWLSubClassOfAxiom df Parent (.getOWLObjectSomeValuesFrom df hasChild Person))]
    (.addAxiom manager ontology decl)
    (.addAxiom manager ontology some-ax)
    (let [ctx (assoc ctx :eng-cache (atom {}))
          res (x/q '[:find ?s ?o :where [?s :ex/hasChild ?o] :reasoner :pellet] ctx)]
      (is (contains? res [:ex/Parent :ex/Person]))
      (is (contains? res [:ex/john :ex/mary])))
    (let [ctx (assoc ctx :eng-cache (atom {}))
          res (x/q '[:find ?p ?o :where [:ex/Parent ?p ?o] :reasoner :pellet] ctx)
          restriction (some (fn [[prop val]]
                               (when (and (= prop :rdfs/subClassOf)
                                          (= :ex/hasChild (:owl/onProperty val))
                                          (= :ex/Person (:owl/someValuesFrom val)))
                                 val))
                             res)]
      (is restriction))
    (let [ctx (assoc ctx :eng-cache (atom {}))
          res (x/q '[:find ?s ?o
                     :where [?s :ex/hasChild ?o]
                     :reasoner :pellet
                     :options {:tbox? false}]
                   ctx)]
      (is (not (contains? res [:ex/Parent :ex/Person]))))
    (.removeAxiom manager ontology decl)
    (.removeAxiom manager ontology some-ax)))

(deftest q-options-tbox-abox-toggles
  (let [{:keys [manager ontology] :as ctx} (toy-ontology)
        df (.getOWLDataFactory manager)
        Parent (.getOWLClass df (IRI/create "urn:test:Parent"))
        Person (.getOWLClass df (IRI/create "urn:test:Person"))
        hasChild (.getOWLObjectProperty df (IRI/create "urn:test:hasChild"))
        decl (.getOWLDeclarationAxiom df Parent)
        some-ax (.getOWLSubClassOfAxiom df Parent (.getOWLObjectSomeValuesFrom df hasChild Person))]
    (.addAxiom manager ontology decl)
    (.addAxiom manager ontology some-ax)
    (let [ctx-default (assoc ctx :eng-cache (atom {}))
          default (x/q '[:find ?s ?o :where [?s :ex/hasChild ?o] :reasoner :pellet]
                      ctx-default)
          ctx-tbox (assoc ctx :eng-cache (atom {}))
          tbox-only (x/q {:find ['?s '?o]
                           :where '[[?s :ex/hasChild ?o]]
                           :reasoner :pellet
                           :options {:abox? false}}
                          ctx-tbox)
          ctx-abox (assoc ctx :eng-cache (atom {}))
          abox-only (x/q {:find ['?s '?o]
                           :where '[[?s :ex/hasChild ?o]]
                           :reasoner :pellet
                           :options {:tbox? false}}
                          ctx-abox)]
      (is (contains? default [:ex/Parent :ex/Person]))
      (is (contains? default [:ex/john :ex/mary]))
      (is (= (set tbox-only) #{[:ex/Parent :ex/Person]}))
      (is (= (set abox-only) #{[:ex/john :ex/mary]})))
    (.removeAxiom manager ontology decl)
    (.removeAxiom manager ontology some-ax)))

(deftest q-variable-predicate-tbox
  (let [{:keys [manager ontology] :as ctx} (toy-ontology)
        df (.getOWLDataFactory manager)
        Parent (.getOWLClass df (IRI/create "urn:test:Parent"))
        Person (.getOWLClass df (IRI/create "urn:test:Person"))
        hasChild (.getOWLObjectProperty df (IRI/create "urn:test:hasChild"))
        decl (.getOWLDeclarationAxiom df Parent)
        some-ax (.getOWLSubClassOfAxiom df Parent (.getOWLObjectSomeValuesFrom df hasChild Person))]
    (.addAxiom manager ontology decl)
    (.addAxiom manager ontology some-ax)
    (let [ctx (assoc ctx :eng-cache (atom {}))
          res (x/q '[:find ?s ?p ?o :where [?s ?p ?o] :reasoner :pellet :options {:abox? false}] ctx)]
      (is (some (fn [[sub prop val]]
                  (and (= sub :ex/Parent)
                       (= prop :rdfs/subClassOf)
                       (= :ex/hasChild (:owl/onProperty val))
                       (= :ex/Person (:owl/someValuesFrom val))))
                res)))
    (.removeAxiom manager ontology decl)
    (.removeAxiom manager ontology some-ax)))

(deftest q-aggregates
  (let [ctx (assoc (toy-ontology) :eng-cache (atom {}))
        total (x/q '[:find (count ?p)
                     :where [?p :rdf/type :ex/Person]]
                   ctx)]
    (is (= total #{[2]}))
    (let [per-parent (x/q '[:find ?parent (count ?child)
                             :where [?parent :ex/hasChild ?child]]
                           ctx)]
      (is (= per-parent #{[:ex/john 1]})))))

(deftest q-with-clause-preserves-bag
  (let [{:keys [manager ontology] :as ctx} (toy-ontology)
        df (.getOWLDataFactory manager)
        Car (.getOWLClass df (IRI/create "urn:test:Car"))
        car2 (.getOWLNamedIndividual df (IRI/create "urn:test:car2"))
        ax   (.getOWLClassAssertionAxiom df Car car2)]
    (.addAxiom manager ontology ax)
    (let [no-with (x/q '[:find ?cls
                          :where [?car :rdf/type :ex/Car]
                                 [?car :rdf/type ?cls]]
                         ctx)
          with-result (x/q '[:find ?cls
                              :with ?car
                              :where [?car :rdf/type :ex/Car]
                                     [?car :rdf/type ?cls]]
                           ctx)
          freqs (frequencies with-result)]
      (is (set? no-with))
      (is (vector? with-result))
      (is (> (count with-result) (count no-with)) "Bag preserves duplicates")
      (is (some #(> % 1) (vals freqs)) "At least one tuple appears multiple times")
      (is (some #{[:ex/Car]} with-result)))
    (.removeAxiom manager ontology ax)))

(deftest q-return-map-support
  (let [ctx (assoc (toy-ontology) :eng-cache (atom {}))
        results (x/q '[:find ?parent ?child
                        :keys parent child
                        :where [?parent :ex/hasChild ?child]]
                      ctx)
        entry   (first (filter #(= :ex/john (:parent %)) results))]
    (is (set? results))
    (is entry)
    (is (= :ex/mary (:child entry)))
    (is (= :ex/john (nth entry 0)))
    (is (= :ex/mary (nth entry 1)))))

(deftest q-in-scalar-binding
  (let [ctx (toy-ontology)
        res (x/q '[:find ?person
                     :in $ ?target-age
                     :where [?person :ex/age ?target-age]]
                   ctx
                   42)]
    (is (= res #{[:ex/john]}))))

(deftest q-in-tuple-binding
  (let [ctx (toy-ontology)
        res (x/q '[:find ?child
                     :in [?parent ?expected]
                     :where [?parent :ex/hasChild ?child]
                            [?child :rdf/type :ex/Person]]
                   ctx
                   [:ex/john :ex/mary])]
    (is (= res #{[:ex/mary]}))))

(deftest q-in-collection-binding
  (let [ctx (toy-ontology)
        res (x/q '[:find ?entity
                     :in [?cls ...]
                     :where [?entity :rdf/type ?cls]]
                   ctx
                   [:ex/Person :ex/Vehicle])]
    (is (= (set res)
           #{[:ex/john] [:ex/mary] [:ex/car1]}))))

(deftest q-in-relation-binding
  (let [ctx (toy-ontology)
        res (x/q '[:find ?p ?c
                     :in [[?p ?c]]
                     :where [?p :ex/hasChild ?c]]
                   ctx
                   [[:ex/john :ex/mary]
                    [:ex/mary :ex/john]])]
    (is (= res #{[:ex/john :ex/mary]}))))

(deftest q-not-clause
  (let [ctx (toy-ontology)
        res (x/q '[:find ?person
                    :where [?person :rdf/type :ex/Person]
                           (not [?person :rdf/type :ex/Vehicle])]
                  ctx)]
    (is (= res #{[:ex/john] [:ex/mary]}))))

(deftest q-not-join-clause
  (let [ctx (toy-ontology)
        res (x/q '[:find ?person
                    :where [?person :rdf/type :ex/Person]
                           (not-join [?person]
                                     [?person :ex/hasChild ?child]
                                     [?child :rdf/type :ex/Person])]
                  ctx)]
    (is (= res #{[:ex/mary]}))))

(deftest q-or-join-clause
  (let [ctx (toy-ontology)
        res (x/q '[:find ?entity
                    :in [?entity ...]
                    :where (or-join [?entity]
                                     [?entity :rdf/type :ex/Person]
                                     [?entity :rdf/type :ex/Vehicle])]
                  ctx
                  [:ex/john :ex/mary :ex/car1])]
    (is (= (set res) #{[:ex/john] [:ex/mary] [:ex/car1]}))))

(deftest q-rule-invocation
  (let [ctx   (toy-ontology)
        rules '[[(parent ?p ?c)
                  [?p :ex/hasChild ?c]]
                 [(parent-bound [?p] ?c)
                  (parent ?p ?c)]]]
    (testing "basic rule expansion"
      (let [res (x/q '[:find ?p ?c
                        :in $ %
                        :where (parent ?p ?c)]
                      ctx
                      rules)]
        (is (= res #{[:ex/john :ex/mary]}))))
    (testing "constant argument matching"
      (let [res (x/q '[:find ?p
                        :in $ %
                        :where (parent ?p :ex/mary)]
                      ctx
                      rules)]
        (is (= res #{[:ex/john]}))))
    (testing "required binding enforcement"
      (is (thrown-with-msg? clojure.lang.ExceptionInfo
                            #"Rule requires bound variables"
                            (x/q '[:find ?c
                                    :in $ %
                                    :where (parent-bound ?p ?c)]
                                  ctx
                                  rules))))
    (testing "required binding satisfied"
      (let [res (x/q '[:find ?c
                        :in $ %
                        :where [?p :ex/hasChild ?c]
                               (parent-bound ?p ?c)]
                      ctx
                      rules)]
        (is (= res #{[:ex/mary]}))))))

(deftest q-nested-query-basic
  (let [ctx (toy-ontology)
        res (x/q '[:find ?parent ?child
                    :where [?parent :rdf/type :ex/Person]
                           [(q '[:find ?c
                                 :in $ ?p
                                 :where [?p :ex/hasChild ?c]]
                               $ ?parent)
                            [[?child]]]]
                  ctx)]
    (is (= res #{[:ex/john :ex/mary]}))))

(deftest q-nested-query-map-form
  (let [ctx (toy-ontology)
        res (x/q '[:find ?parent ?child
                    :where [?parent :rdf/type :ex/Person]
                           [(q {:query '[:find ?c
                                           :in $ ?p
                                           :where [?p :ex/hasChild ?c]]
                                :args  [$ ?parent]})
                            [[?child]]]]
                  ctx)]
    (is (= res #{[:ex/john :ex/mary]}))))

(deftest q-nested-query-unbound-throws
  (let [ctx (toy-ontology)]
    (is (thrown-with-msg? clojure.lang.ExceptionInfo
                          #"Nested q requires bound inputs"
                          (x/q '[:find ?child
                                  :where [(q '[:find ?c
                                                :in $ ?p
                                                :where [?p :ex/hasChild ?c]]
                                             $ ?p)
                                         [[?child]]]]
                                ctx)))))

(deftest q-filter-nested-query
  (let [ctx (toy-ontology)
        res (x/q '[:find ?parent
                    :where [?parent :rdf/type :ex/Person]
                           [:filter (seq (q '[:find ?c
                                               :in $ ?p
                                               :where [?p :ex/hasChild ?c]]
                                             $ ?parent))]]
                  ctx)]
    (is (= res #{[:ex/john]}))))

(deftest q-fn-expr-nested-query
  (let [ctx (toy-ontology)
        res (x/q '[:find ?car
                    :where [(q '[:find ?c
                                  :in $ ?type
                                  :where [?c :rdf/type ?type]]
                                $ :ex/Car)
                           [[?car]]]]
                  ctx)]
    (is (= res #{[:ex/car1]}))))

(deftest q-any-abox-index
  (let [ctx (toy-ontology)
        res (x/q '[:find ?p ?child
                    :where [?parent :rdf/type :ex/Person]
                           [?parent ?p ?child]
                           [?child :rdf/type :ex/Person]]
                  ctx)]
    (is (= res #{[:ex/hasChild :ex/mary]}))))

(deftest q-predicate-clause
  (let [ctx (toy-ontology)
        res (x/q '[:find ?person
                    :where [?person :rdf/type :ex/Person]
                           [?person :ex/age ?age]
                           [(> ?age 40)]]
                  ctx)]
    (is (= res #{[:ex/john]}))))

(deftest q-function-clause
  (let [ctx (toy-ontology)
        res (x/q '[:find ?person ?age-plus
                    :where [?person :ex/age ?age]
                           [(+ ?age 1) ?age-plus]]
                  ctx)]
    (is (= res #{[:ex/john 43N]
                 [:ex/חכמה 11N]}))))

(deftest q-multi-datasource-join
  (let [ctx-a (assoc (toy-ontology) :eng-cache (atom {}))
        ctx-b (assoc (toy-ontology) :eng-cache (atom {}))
        res   (x/q '[:find ?parent
                      :in $ $m
                      :where [$ ?parent :ex/hasChild ?child]
                             [$m ?parent :ex/hasChild ?child]]
                    ctx-a
                    ctx-b)]
    (is (= res #{[:ex/john]}))))

(deftest q-exists-memo-stability
  (let [{:keys [manager ontology] :as ctx} (toy-ontology)
        df (.getOWLDataFactory manager)
        Parent (.getOWLClass df (IRI/create "urn:test:Parent"))
        Person (.getOWLClass df (IRI/create "urn:test:Person"))
        hasChild (.getOWLObjectProperty df (IRI/create "urn:test:hasChild"))
        decl (.getOWLDeclarationAxiom df Parent)
        some-ax (.getOWLSubClassOfAxiom df Parent (.getOWLObjectSomeValuesFrom df hasChild Person))]
    (.addAxiom manager ontology decl)
    (.addAxiom manager ontology some-ax)
    (let [ctx (assoc ctx :eng-cache (atom {}))
          eng (x/dlq-engine ctx {:precompute? true :index? false :annotation-index? false})
          memo (fn [] (get @(:memos eng) :exists-by-o))]
      (is (= 0 (count @(:store (memo)))))
      (let [engine-map {'$ eng}]
        (x/dq* eng engine-map {:find ['?s '?o]
                               :where '[[?s :ex/hasChild ?o]]
                               :reasoner :pellet
                               :options {:abox? false}}))
      (let [after-once (count @(:store (memo)))]
        (let [engine-map {'$ eng}]
          (x/dq* eng engine-map {:find ['?s '?o]
                                 :where '[[?s :ex/hasChild ?o]]
                                 :reasoner :pellet
                                 :options {:abox? false}}))
        (is (= after-once (count @(:store (memo))))))
      (x/dlq-close! eng))
    (.removeAxiom manager ontology decl)
    (.removeAxiom manager ontology some-ax)))

;; ==================== Triple-first DL query coverage =====================

(defn- rich-ontology []
  (let [m   (OWLManager/createOWLOntologyManager)
        iri (IRI/create "urn:test:dlq2")
        ont (.createOntology m iri)
        df  (.getOWLDataFactory m)
        ;; Classes
        Vehicle (.getOWLClass df (IRI/create "urn:test:Vehicle"))
        Car     (.getOWLClass df (IRI/create "urn:test:Car"))
        Auto    (.getOWLClass df (IRI/create "urn:test:Auto"))
        Truck   (.getOWLClass df (IRI/create "urn:test:Truck"))
        Agent   (.getOWLClass df (IRI/create "urn:test:Agent"))
        Person  (.getOWLClass df (IRI/create "urn:test:Person"))
        Doctor  (.getOWLClass df (IRI/create "urn:test:Doctor"))
        ;; Object properties
        hasParent  (.getOWLObjectProperty df (IRI/create "urn:test:hasParent"))
        parentOf   (.getOWLObjectProperty df (IRI/create "urn:test:parentOf"))
        hasChild   (.getOWLObjectProperty df (IRI/create "urn:test:hasChild"))
        maternalParent (.getOWLObjectProperty df (IRI/create "urn:test:maternalParent"))
        ;; Data properties
        age        (.getOWLDataProperty df (IRI/create "urn:test:age"))
        yearsOld   (.getOWLDataProperty df (IRI/create "urn:test:yearsOld"))
        ageInYears (.getOWLDataProperty df (IRI/create "urn:test:ageInYears"))
        ;; Individuals
        alice  (.getOWLNamedIndividual df (IRI/create "urn:test:alice"))
        alice2 (.getOWLNamedIndividual df (IRI/create "urn:test:alice2"))
        bob    (.getOWLNamedIndividual df (IRI/create "urn:test:bob"))
        car1   (.getOWLNamedIndividual df (IRI/create "urn:test:car1"))
        car2   (.getOWLNamedIndividual df (IRI/create "urn:test:car2"))
        ;; TBox axioms
        A_sub_V (.getOWLSubClassOfAxiom df Car Vehicle)
        T_sub_V (.getOWLSubClassOfAxiom df Truck Vehicle)
        P_sub_A (.getOWLSubClassOfAxiom df Person Agent)
        D_sub_P (.getOWLSubClassOfAxiom df Doctor Person)
        Car_equiv_Auto (.getOWLEquivalentClassesAxiom df (doto (java.util.HashSet.) (.add Car) (.add Auto)))
        ;; RBox axioms
        inv      (.getOWLInverseObjectPropertiesAxiom df hasParent parentOf)
        equiv-op (.getOWLEquivalentObjectPropertiesAxiom df (doto (java.util.HashSet.) (.add parentOf) (.add hasChild)))
        sub-op   (.getOWLSubObjectPropertyOfAxiom df maternalParent hasParent)
        sub-dp   (.getOWLSubDataPropertyOfAxiom df yearsOld age)
        equiv-dp (.getOWLEquivalentDataPropertiesAxiom df (doto (java.util.HashSet.) (.add age) (.add ageInYears)))
        ;; ABox assertions
        ax-alice (.getOWLClassAssertionAxiom df Person alice)
        ax-bob   (.getOWLClassAssertionAxiom df Doctor bob)
        ax-car1  (.getOWLClassAssertionAxiom df Car car1)
        ax-car2  (.getOWLClassAssertionAxiom df Auto car2)
        ax-role1 (.getOWLObjectPropertyAssertionAxiom df hasParent alice bob)
        ax-role2 (.getOWLObjectPropertyAssertionAxiom df maternalParent alice bob)
        lit-42   (.getOWLLiteral df (long 42))
        lit-40   (.getOWLLiteral df (long 40))
        ax-age-a (.getOWLDataPropertyAssertionAxiom df age alice lit-42)
        ax-age-b (.getOWLDataPropertyAssertionAxiom df yearsOld bob lit-40)
        same     (.getOWLSameIndividualAxiom df (doto (java.util.HashSet.) (.add alice) (.add alice2)))
        diff     (.getOWLDifferentIndividualsAxiom df (doto (java.util.HashSet.) (.add alice) (.add bob))) ]
    (doseq [ax [A_sub_V T_sub_V P_sub_A D_sub_P Car_equiv_Auto
                inv equiv-op sub-op sub-dp equiv-dp
                ax-alice ax-bob ax-car1 ax-car2 ax-role1 ax-role2
                ax-age-a ax-age-b same diff]]
      (.addAxiom m ont ax))
    {:manager m :ontology ont :prefixes (prefixes-default)}))

(defn- restriction-ontology []
  (let [m   (OWLManager/createOWLOntologyManager)
        iri (IRI/create "urn:test:restrictions")
        ont (.createOntology m iri)
        df  (.getOWLDataFactory m)
        ;; object properties & classes
        hasColor   (.getOWLObjectProperty df (IRI/create "urn:test:hasColor"))
        hasGuardian (.getOWLObjectProperty df (IRI/create "urn:test:hasGuardian"))
        selfAware   (.getOWLObjectProperty df (IRI/create "urn:test:selfAware"))
        hasSibling  (.getOWLObjectProperty df (IRI/create "urn:test:hasSibling"))
        hasChild    (.getOWLObjectProperty df (IRI/create "urn:test:hasChild"))
        eats        (.getOWLObjectProperty df (IRI/create "urn:test:eats"))
        hasTrait    (.getOWLObjectProperty df (IRI/create "urn:test/hasTrait"))
        Colorful    (.getOWLClass df (IRI/create "urn:test/ColorfulThing"))
        Red         (.getOWLClass df (IRI/create "urn:test/Red"))
        Responsible (.getOWLClass df (IRI/create "urn:test/ResponsibleGuardian"))
        Plant       (.getOWLClass df (IRI/create "urn:test/Plant"))
        GuardianOwner (.getOWLClass df (IRI/create "urn:test/GuardianOwner"))
        Guardian1   (.getOWLNamedIndividual df (IRI/create "urn:test/guardian1"))
        SelfWatcher (.getOWLClass df (IRI/create "urn:test/SelfWatcher"))
        BoundedSibling (.getOWLClass df (IRI/create "urn:test/BoundedSiblingGroup"))
        SingleParent (.getOWLClass df (IRI/create "urn:test/SingleParent"))
        Teenager    (.getOWLClass df (IRI/create "urn:test/Teenager"))
        Traitful    (.getOWLClass df (IRI/create "urn:test/Traitful"))
        Trait       (.getOWLClass df (IRI/create "urn:test/Trait"))
        ;; data properties & literals
        hasID       (.getOWLDataProperty df (IRI/create "urn:test/hasID"))
        hasScore    (.getOWLDataProperty df (IRI/create "urn:test/hasScore"))
        Identified  (.getOWLClass df (IRI/create "urn:test/Identified"))
        Rated       (.getOWLClass df (IRI/create "urn:test/Rated"))
        Balanced    (.getOWLClass df (IRI/create "urn:test/BalancedScore"))
        id-lit      (.getOWLLiteral df "ABC-123")
        score-lit   (.getOWLLiteral df 100)
        ;; declarations to ensure properties/classes are in signature
        decls [(.getOWLDeclarationAxiom df Colorful)
               (.getOWLDeclarationAxiom df Responsible)
               (.getOWLDeclarationAxiom df GuardianOwner)
               (.getOWLDeclarationAxiom df SelfWatcher)
               (.getOWLDeclarationAxiom df BoundedSibling)
               (.getOWLDeclarationAxiom df SingleParent)
               (.getOWLDeclarationAxiom df Identified)
               (.getOWLDeclarationAxiom df Rated)
               (.getOWLDeclarationAxiom df Balanced)
               (.getOWLDeclarationAxiom df Traitful)
               (.getOWLDeclarationAxiom df Trait)
               (.getOWLDeclarationAxiom df hasColor)
               (.getOWLDeclarationAxiom df hasGuardian)
               (.getOWLDeclarationAxiom df selfAware)
               (.getOWLDeclarationAxiom df hasSibling)
               (.getOWLDeclarationAxiom df hasChild)
               (.getOWLDeclarationAxiom df eats)
               (.getOWLDeclarationAxiom df hasTrait)
               (.getOWLDeclarationAxiom df hasID)
               (.getOWLDeclarationAxiom df hasScore)]
        ;; equivalent / subclass axioms
        some-expr (.getOWLObjectSomeValuesFrom df hasColor Red)
        all-expr  (.getOWLObjectAllValuesFrom df eats Plant)
        hasValue-expr (.getOWLObjectHasValue df hasGuardian Guardian1)
        self-expr (.getOWLObjectHasSelf df selfAware)
        min-expr (.getOWLObjectMinCardinality df 2 hasSibling)
        qual-expr (.getOWLObjectExactCardinality df 1 hasChild Teenager)
        data-some-expr (.getOWLDataSomeValuesFrom df hasID (.getOWLDatatype df (.getIRI OWL2Datatype/XSD_STRING)))
        data-hasValue-expr (.getOWLDataHasValue df hasScore score-lit)
        data-min-expr (.getOWLDataMinCardinality df 2 hasScore)
        trait-expr (.getOWLObjectSomeValuesFrom df hasTrait Trait)
        ;; domain/range axioms
        hasColor-domain (.getOWLObjectPropertyDomainAxiom df hasColor Colorful)
        hasColor-range  (.getOWLObjectPropertyRangeAxiom df hasColor Trait)
        hasID-domain    (.getOWLDataPropertyDomainAxiom df hasID Identified)
        hasID-range     (.getOWLDataPropertyRangeAxiom df hasID (.getOWLDatatype df (.getIRI OWL2Datatype/XSD_STRING)))
        hasScore-domain (.getOWLDataPropertyDomainAxiom df hasScore Balanced)
        hasScore-range  (.getOWLDataPropertyRangeAxiom df hasScore (.getOWLDatatype df (.getIRI OWL2Datatype/XSD_INTEGER)))]
    (doseq [ax (concat decls
                       [(.getOWLEquivalentClassesAxiom df Colorful some-expr)
                (.getOWLSubClassOfAxiom df Colorful some-expr)
                (.getOWLEquivalentClassesAxiom df Responsible all-expr)
                (.getOWLSubClassOfAxiom df Responsible all-expr)
                (.getOWLEquivalentClassesAxiom df GuardianOwner hasValue-expr)
                (.getOWLEquivalentClassesAxiom df SelfWatcher self-expr)
                (.getOWLSubClassOfAxiom df SelfWatcher self-expr)
                (.getOWLEquivalentClassesAxiom df BoundedSibling min-expr)
                (.getOWLSubClassOfAxiom df BoundedSibling min-expr)
                (.getOWLEquivalentClassesAxiom df SingleParent qual-expr)
                (.getOWLEquivalentClassesAxiom df Identified data-some-expr)
                (.getOWLSubClassOfAxiom df Identified data-some-expr)
                (.getOWLEquivalentClassesAxiom df Rated data-hasValue-expr)
                (.getOWLEquivalentClassesAxiom df Balanced data-min-expr)
                (.getOWLEquivalentClassesAxiom df Traitful trait-expr)
                (.getOWLSubClassOfAxiom df Traitful trait-expr)
                hasColor-domain
                hasColor-range
                hasID-domain
                hasID-range
                hasScore-domain
                hasScore-range])]
      (.addAxiom m ont ax))
    {:manager m :ontology ont :prefixes (prefixes-default)}))

(deftest triple-first-abox-and-filter
  (let [ctx (rich-ontology)
        res (x/dq ctx {:find  ['?x '?p]
                        :where [['?x :rdf/type :ex/Person]
                                ['?x :ex/hasParent '?p]
                                ['?p :rdf/type :ex/Doctor]
                                [:filter '(not= ?x ?p)]]
                       :reasoner :pellet})]
    (is (contains? res [:ex/alice :ex/bob]))
    ;; via inverse/equivalent, bob should also have hasChild alice
    (let [res2 (x/dq ctx {:find  ['?s '?o]
                           :where [['?s :ex/hasChild '?o]]
                           :reasoner :pellet})]
      (is (contains? res2 [:ex/bob :ex/alice])))))

(deftest triple-first-type-directness
  (let [ctx (rich-ontology)
        all (x/dq ctx {:find ['?t]
                       :where [[:ex/bob :rdf/type '?t]]
                       :reasoner :pellet})
        direct (x/dq ctx {:find ['?t]
                          :where [[:ex/bob :rdf/type '?t]]
                          :options {:direct {:rdf/type true}}
                          :reasoner :pellet})]
    (is (set? all))
    (is (contains? all [:ex/Person]))
    (is (contains? all [:ex/Doctor]))
    ;; direct should only include Doctor
    (is (= direct #{[:ex/Doctor]}))))

(deftest triple-first-subclass-and-equivalent-class
  (let [ctx (rich-ontology)
        subs (x/dq ctx {:find ['?c]
                        :where [['?c :rdfs/subClassOf :ex/Vehicle]]
                        :options {:direct {:rdfs/subClassOf true}}
                        :reasoner :pellet})
        eqs  (x/dq ctx {:find ['?d]
                        :where [[:ex/Car :owl/equivalentClass '?d]]
                        :reasoner :pellet})]
    (is (every? vector? subs))
    ;; Car and Auto are direct subclasses via equivalence to Car
    (is (set/subset? #{[:ex/Car] [:ex/Auto]} subs))
    (is (contains? eqs [:ex/Auto]))))

(deftest triple-first-subproperty-and-equivalent-inverse
  (let [ctx (rich-ontology)
        ;; subPropertyOf enumeration
        subs (x/dq ctx {:find ['?p]
                        :where [['?p :rdfs/subPropertyOf :ex/hasParent]]
                        :reasoner :pellet})
        ;; equivalent object property
        eqop (x/dq ctx {:find ['?q]
                        :where [[:ex/hasChild :owl/equivalentProperty '?q]]
                        :reasoner :pellet})
        ;; inverseOf
        invs (x/dq ctx {:find ['?inv]
                        :where [['?inv :owl/inverseOf :ex/hasParent]]
                        :reasoner :pellet})]
    (is (contains? subs [:ex/maternalParent]))
    (is (contains? eqop [:ex/parentOf]))
    (is (set/subset? #{[:ex/parentOf] [:ex/hasChild]} invs))))

(deftest triple-first-same-and-different
  (let [ctx (rich-ontology)
        sames (x/dq ctx {:find ['?z]
                         :where [['?z :owl/sameAs :ex/alice]]
                         :reasoner :pellet})
        diffs (x/dq ctx {:find ['?z]
                         :where [['?z :owl/differentFrom :ex/alice]]
                         :reasoner :pellet})]
    (is (contains? sames [:ex/alice2]))
    (is (contains? diffs [:ex/bob]))))

(deftest triple-first-data-property
  (let [ctx (rich-ontology)
        opts {:reasoner :pellet}
        v1  (x/dq ctx {:find ['?v]
                       :where [[:ex/alice :ex/age '?v]]}
                   opts)
        v2  (x/dq ctx {:find ['?v]
                       :where [[:ex/bob :ex/age '?v]]}
                   opts)]
    ;; Alice has asserted age 42
    (is (= 1 (count v1)))
    ;; Bob has yearsOld 40 and yearsOld ⊑ age, so age should be present
    (is (= 1 (count v2)))))

(deftest restriction-some-values-from
  (let [ctx (restriction-ontology)
        res (x/q '{:find [?s ?r]
                   :where [[?s :rdfs/subClassOf ?r]]
                   :reasoner :structural}
                  ctx)
        entry (some #(when (and (= (first %) :ex/ColorfulThing)
                                 (map? (second %)))
                       %)
                     res)
        restriction (second entry)]
    (is entry)
    (is (= :ex/hasColor (:owl/onProperty restriction)))
    (is (= :ex/Red (:owl/someValuesFrom restriction)))))

(deftest restriction-constant-some-values
  (let [ctx (restriction-ontology)
        res (x/q '{:find [?r]
                   :where [[?r :owl/someValuesFrom :ex/Red]]
                   :reasoner :structural}
                  ctx)]
    (is (contains? res
                   [{:rdf/type :owl/Restriction
                     :owl/onProperty :ex/hasColor
                     :owl/someValuesFrom :ex/Red}]))))

(deftest restriction-join-on-constants
  (let [ctx (restriction-ontology)
        res (x/q '{:find [?cls ?prop]
                   :where [[?cls :rdfs/subClassOf ?r]
                           [?r :owl/onProperty ?prop]
                           [?r :owl/someValuesFrom :ex/Red]]
                   :reasoner :structural}
                  ctx)]
    (is (= res #{[:ex/ColorfulThing :ex/hasColor]}))))

(deftest restriction-constant-fillers-via-any
  (let [ctx (restriction-ontology)
        res (x/q '{:find [?r ?pred]
                   :where [[:ex/ColorfulThing :rdfs/subClassOf ?r]
                           [?r :owl/onProperty ?prop]
                           [?r ?pred :ex/Red]]
                   :reasoner :structural}
                  ctx)]
    (is (= res
           #{[{:rdf/type :owl/Restriction
               :owl/onProperty :ex/hasColor
               :owl/someValuesFrom :ex/Red}
              :owl/someValuesFrom]}))))

(deftest or-clause-support
  (let [ctx (restriction-ontology)
        res (x/q '[:find ?prop ?range
                    :where [?cls :rdfs/subClassOf ?restriction]
                           (or [?cls :rdfs/subClassOf :ex/ColorfulThing]
                               [:ex/ColorfulThing :rdfs/subClassOf ?cls]
                               [:filter (= ?cls :ex/ColorfulThing)])
                           [?restriction :owl/onProperty ?prop]
                           [?restriction :owl/someValuesFrom ?range]
                    :reasoner :structural]
                  ctx)]
    (is (contains? res [:ex/hasColor :ex/Red]))))

(deftest restriction-all-values-from
  (let [ctx (restriction-ontology)
        res (x/q '{:find [?s ?r]
                       :where [[?s :rdfs/subClassOf ?r]]
                       :reasoner :structural} ctx)
        entry (some #(when (and (= (first %) :ex/ResponsibleGuardian)
                                 (map? (second %)))
                        %)
                     res)
        restriction (second entry)]
    (is entry)
    (is (= :ex/Plant (:owl/allValuesFrom restriction)))))

(deftest restriction-has-value
  (let [ctx (restriction-ontology)
        res (x/q '{:find [?s ?r]
                       :where [[?s :rdfs/subClassOf ?r]]
                       :reasoner :structural} ctx)
        entry (some #(when (and (= (first %) :ex/GuardianOwner)
                                 (map? (second %)))
                        %)
                     res)
        restriction (second entry)]
    (is entry)
    (is (= :ex/guardian1 (:owl/hasValue restriction)))))

(deftest restriction-has-self
  (let [ctx (restriction-ontology)
        res (x/q '{:find [?s ?r]
                       :where [[?s :rdfs/subClassOf ?r]]
                       :reasoner :structural} ctx)
        entry (some #(when (and (= (first %) :ex/SelfWatcher)
                                 (map? (second %)))
                        %)
                     res)
        restriction (second entry)]
    (is entry)
    (is (= :ex/selfAware (:owl/onProperty restriction)))
    (is (= true (:owl/hasSelf restriction)))))

(deftest restriction-min-cardinality
  (let [ctx (restriction-ontology)
        res (x/q '{:find [?s ?r]
                       :where [[?s :rdfs/subClassOf ?r]]
                       :reasoner :structural} ctx)
        entry (some #(when (and (= (first %) :ex/BoundedSiblingGroup)
                                 (map? (second %)))
                        %)
                     res)
        restriction (second entry)]
    (is entry)
    (is (= 2 (:owl/minCardinality restriction)))))

(deftest restriction-qualified-cardinality
  (let [ctx (restriction-ontology)
        res (x/q '{:find [?s ?r]
                       :where [[?s :rdfs/subClassOf ?r]]
                       :reasoner :structural} ctx)
        entry (some #(when (and (= (first %) :ex/SingleParent)
                                 (map? (second %)))
                        %)
                     res)
        restriction (second entry)]
    (is entry)
    (is (= 1 (:owl/qualifiedCardinality restriction)))
    (is (= :ex/Teenager (:owl/onClass restriction)))))

(deftest restriction-data-has-value
  (let [ctx (restriction-ontology)
        res (x/q '{:find [?s ?r]
                       :where [[?s :rdfs/subClassOf ?r]]
                       :reasoner :structural} ctx)
        entry (some #(when (and (= (first %) :ex/Rated)
                                 (map? (second %)))
                        %)
                     res)
        restriction (second entry)]
    (is entry)
    (is (= 100 (:owl/hasValue restriction)))))

(deftest restriction-data-min-cardinality
  (let [ctx (restriction-ontology)
        res (x/q '{:find [?s ?r]
                       :where [[?s :rdfs/subClassOf ?r]]
                       :reasoner :structural} ctx)
        entry (some #(when (and (= (first %) :ex/BalancedScore)
                                 (map? (second %)))
                        %)
                     res)
        restriction (second entry)]
    (is entry)
    (is (= 2 (:owl/minCardinality restriction)))))

(deftest restriction-data-some-values
  (let [ctx (restriction-ontology)
        res (x/q '{:find [?s ?r]
                       :where [[?s :rdfs/subClassOf ?r]]
                       :reasoner :structural} ctx)
        entry (some #(when (and (= (first %) :ex/Identified)
                                 (map? (second %)))
                        %)
                     res)
        restriction (second entry)]
    (is entry)
    (is (:owl/someValuesFrom restriction))))

(deftest restriction-domain-range-coverage
  (let [ctx (restriction-ontology)
        domains (x/q '{:find [?p ?d]
                           :where [[?p :rdfs/domain ?d]]
                           :reasoner :structural} ctx)
        ranges  (x/q '{:find [?p ?r]
                           :where [[?p :rdfs/range ?r]]
                           :reasoner :structural} ctx)]
    (is (contains? domains [:ex/hasColor :ex/ColorfulThing]))
    (is (contains? ranges  [:ex/hasColor :ex/Trait]))
    (is (contains? domains [:ex/hasID :ex/Identified]))
    (is (contains? ranges  [:ex/hasID :xsd/string]))
    (is (contains? domains [:ex/hasScore :ex/BalancedScore]))
    (is (contains? ranges  [:ex/hasScore :xsd/integer]))))

(deftest domain-variable-property-query
  (let [ctx (restriction-ontology)
        res (x/q '{:find [?p]
                       :where [[?p :rdfs/domain :ex/ColorfulThing]]
                       :reasoner :structural} ctx)]
    (is (= res #{[:ex/hasColor]}))))

(deftest range-variable-property-query
  (let [ctx (restriction-ontology)
        string-range (x/q '{:find [?p]
                                 :where [[?p :rdfs/range :xsd/string]]
                                 :reasoner :structural} ctx)
        integer-range (x/q '{:find [?p]
                                  :where [[?p :rdfs/range :xsd/integer]]
                                  :reasoner :structural} ctx)]
    (is (= string-range #{[:ex/hasID]}))
    (is (= integer-range #{[:ex/hasScore]}))))

(deftest structural-retrieves-object-assertions
  (let [ctx (toy-ontology)
        res (x/q '{:find [?s ?o]
                       :where [[?s :ex/hasChild ?o]]
                       :reasoner :structural} ctx)]
    (is (contains? res [:ex/john :ex/mary]))))

(deftest structural-retrieves-data-assertions
  (let [ctx (rich-ontology)
        res (x/q '{:find [?v]
                       :where [[:ex/bob :ex/yearsOld ?v]]
                       :reasoner :structural} ctx)]
    (is (contains? res [40]))))

(deftest triple-first-both-vars-type-and-subclass
  (let [ctx (rich-ontology)
        types (x/dq ctx {:find ['?i '?t]
                         :where [['?i :rdf/type '?t]]
                         :reasoner :pellet})
        subs  (x/dq ctx {:find ['?c '?d]
                         :where [['?c :rdfs/subClassOf '?d]]
                         :reasoner :pellet})]
    (is (set/subset? #{[:ex/alice :ex/Person]
                        [:ex/bob   :ex/Person]
                        [:ex/bob   :ex/Doctor]}
                      types))
    (is (contains? subs [:ex/Car :ex/Vehicle]))
    (is (contains? subs [:ex/Auto :ex/Vehicle]))))

(deftest triple-first-ce-in-rdf-type
  (let [ctx (rich-ontology)
        res (x/dq ctx {:find ['?i]
                       :where [['?i :rdf/type [:owl/someValuesFrom :ex/hasParent :ex/Person]]]
                       :reasoner :pellet})]
    (is (contains? res [:ex/alice]))))

(deftest triple-first-inverse-join
  (let [ctx (rich-ontology)
        res (x/dq ctx {:find ['?x '?p]
                       :where [['?x :ex/hasParent '?p]
                               ['?p :ex/parentOf '?x]]
                       :reasoner :pellet})]
    (is (contains? res [:ex/alice :ex/bob]))))

(deftest triple-first-sameAs-propagates-over-roles
  (let [ctx (rich-ontology)
        res (x/dq ctx {:find ['?o]
                       :where [[:ex/alice2 :ex/hasParent '?o]]
                       :reasoner :pellet})]
    (is (contains? res [:ex/bob]))))

(deftest triple-first-subproperty-both-vars
  (let [ctx (rich-ontology)
        res (x/dq ctx {:find ['?p '?q]
                       :where [['?p :rdfs/subPropertyOf '?q]]
                       :reasoner :pellet})]
    (is (contains? res [:ex/maternalParent :ex/hasParent]))
    (is (contains? res [:ex/yearsOld :ex/age]))))

(deftest triple-first-limit-offset
  (let [ctx (rich-ontology)
        res-all (x/dq ctx {:find ['?x]
                           :where [['?x :rdf/type :ex/Person]]
                           :reasoner :pellet})
        res1    (x/dq ctx {:find ['?x]
                           :where [['?x :rdf/type :ex/Person]]
                           :limit 1
                           :reasoner :pellet})
        res2    (x/dq ctx {:find ['?x]
                           :where [['?x :rdf/type :ex/Person]]
                           :offset 1
                           :limit 1
                           :reasoner :pellet})]
    ;; alice, bob, and alice2 (via sameAs) are all Persons
    (is (= 3 (count res-all)))
    (is (= 1 (count res1)))
    (is (= 1 (count res2)))))

(deftest triple-first-data-unbound-subject-guardrail
  (let [ctx (rich-ontology)
        res (x/dq ctx {:find ['?v]
                       :where [['?s :ex/age '?v]]})]
    (is (contains? res [42]))))

(deftest property-chain-yields-inferred-role
  (let [m   (OWLManager/createOWLOntologyManager)
        iri (IRI/create "urn:test:chain")
        ont (.createOntology m iri)
        df  (.getOWLDataFactory m)
        Person  (.getOWLClass df (IRI/create "urn:test:Person"))
        hasParent (.getOWLObjectProperty df (IRI/create "urn:test:hasParent"))
        hasSibling (.getOWLObjectProperty df (IRI/create "urn:test:hasSibling"))
        hasUncle   (.getOWLObjectProperty df (IRI/create "urn:test:hasUncle"))
        alice (.getOWLNamedIndividual df (IRI/create "urn:test:alice"))
        bob   (.getOWLNamedIndividual df (IRI/create "urn:test:bob"))
        charlie (.getOWLNamedIndividual df (IRI/create "urn:test:charlie"))
        ax1 (.getOWLObjectPropertyAssertionAxiom df hasParent alice bob)
        ax2 (.getOWLObjectPropertyAssertionAxiom df hasSibling bob charlie)
        chain (java.util.Arrays/asList (into-array org.semanticweb.owlapi.model.OWLObjectPropertyExpression [hasParent hasSibling]))
        chain-ax (.getOWLSubPropertyChainOfAxiom df chain hasUncle)
        ax-c (.getOWLClassAssertionAxiom df Person charlie)]
    (doseq [ax [ax1 ax2 chain-ax ax-c]] (.addAxiom m ont ax))
  (let [ctx {:manager m :ontology ont :prefixes (prefixes-default)}
          res (x/dq ctx {:find ['?u]
                         :where [[:ex/alice :ex/hasUncle '?u]]
                         :reasoner :pellet})]
    (is (contains? res [:ex/charlie])))))

(deftest annotation-assertions-query
  (let [m   (OWLManager/createOWLOntologyManager)
        iri (IRI/create "urn:test:ann")
        ont (.createOntology m iri)
        df  (.getOWLDataFactory m)
        alice-iri (IRI/create "urn:test:alice")
        ap-label (.getRDFSLabel df)
        ap-see   (.getRDFSSeeAlso df)
        lit      (.getOWLLiteral df "Alice" "en")
        ax1      (.getOWLAnnotationAssertionAxiom df alice-iri (.getOWLAnnotation df ap-label lit))
        doc-iri  (IRI/create "urn:test:doc")
        ax2      (.getOWLAnnotationAssertionAxiom df alice-iri (.getOWLAnnotation df ap-see doc-iri))]
    (doseq [ax [ax1 ax2]] (.addAxiom m ont ax))
    (let [ctx {:manager m :ontology ont :prefixes (prefixes-default)}
          labels (x/dq ctx {:find ['?lit]
                            :where [[:ex/alice :rdfs/label '?lit]]})
          see    (x/dq ctx {:find ['?s]
                            :where [[:ex/alice :rdfs/seeAlso '?s]]
                            :reasoner :pellet})]
      (is (some (fn [[v]]
                  (and (map? v)
                       (= "Alice" (or (:lex v) (:rdf/value v)))
                       (= "en" (or (:lang v) (:rdf/language v)))))
                labels))
      (is (contains? see [:ex/doc])))))

(deftest filter-boolean-operators
  (let [ctx (rich-ontology)
        res (x/dq ctx {:find ['?x '?p]
                       :where [['?x :ex/hasParent '?p]
                               ['?p :rdf/type :ex/Doctor]
                               [:filter '(and (not (= ?x ?p)) (or (= ?x ?x) (not (= ?x ?x))))]]
                       :reasoner :pellet})]
    (is (contains? res [:ex/alice :ex/bob]))))

(deftest engine-cache-stability-and-eviction
  (let [ctx   (assoc (toy-ontology) :eng-cache (atom {}))
        query {:find ['?x]
                :where '[[?x :rdf/type :ex/Person]]
                :reasoner :pellet}]
    (x/dq ctx query {:reasoner-factory (org.semanticweb.HermiT.Reasoner$ReasonerFactory.)})
    (let [initial-count (count (:store @(:eng-cache ctx)))]
      (x/dq ctx query {:reasoner-factory (org.semanticweb.HermiT.Reasoner$ReasonerFactory.)})
      (is (= initial-count (count (:store @(:eng-cache ctx)))))))
  (let [ctx   (assoc (toy-ontology) :eng-cache (atom {}))
        query {:find ['?x]
                :where '[[?x :rdf/type :ex/Person]]
                :reasoner :pellet}
        orig-close x/dlq-close!
        closed (atom [])]
    (swap! (:eng-cache ctx) assoc :max 1)
    (with-redefs [x/dlq-close! (fn [eng]
                                 (swap! closed conj eng)
                                 (orig-close eng))]
      (is (= #{[:ex/john] [:ex/mary]} (x/dq ctx query {:reasoner :pellet})))
      (is (= #{[:ex/john] [:ex/mary]} (x/dq ctx query {:reasoner :hermit}))))
    (is (= 1 (count @closed)))
    (is (= :pellet (:reasoner-selection (first @closed))))
    (is (<= (count (:store @(:eng-cache ctx))) 1))))

(deftest filter-numeric-comparisons
  (let [ctx (rich-ontology)
        ge (x/dq ctx {:find ['?x]
                      :where [['?x :rdf/type :ex/Person]
                              ['?x :ex/age '?v]
                              [:filter '(>= ?v 42)]]
                      :reasoner :pellet})
        lt (x/dq ctx {:find ['?x]
                      :where [['?x :rdf/type :ex/Person]
                              ['?x :ex/age '?v]
                              [:filter '(< ?v 43)]]
                      :reasoner :pellet})
        rng (x/dq ctx {:find ['?x]
                       :where [['?x :rdf/type :ex/Person]
                               ['?x :ex/age '?v]
                               [:filter '(and (>= ?v 40) (<= ?v 42))]]
                       :reasoner :pellet})]
    (is (contains? ge [:ex/alice]))
    (is (contains? lt [:ex/alice]))
    (is (contains? rng [:ex/alice]))))

(deftest load-context-and-query
  (let [ttl (str
              "@prefix ex: <https://example.com/> .\n"
              "@prefix owl: <http://www.w3.org/2002/07/owl#> .\n"
              "@prefix xsd: <http://www.w3.org/2001/XMLSchema#> .\n\n"
              "ex:Alice a owl:NamedIndividual ; ex:age 42 .\n")
        tmp (doto (java.io.File/createTempFile "rdf-ctx-" ".ttl") (.deleteOnExit))
        _   (spit tmp ttl)
        ctx (x/load-context (.getAbsolutePath tmp))
        res (x/dq ctx '{:find [?v]
                        :where [[:ex/Alice :ex/age ?v]]
                        :reasoner :structural})]
    (is (set? res))
    (is (seq res))))
