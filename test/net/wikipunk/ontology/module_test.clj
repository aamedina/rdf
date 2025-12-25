(ns net.wikipunk.ontology.module-test
  (:require [clojure.test :refer :all]
            [net.wikipunk.ontology.module :as module]
            [net.wikipunk.ontology.explain :as x])
  (:import (org.semanticweb.owlapi.apibinding OWLManager)
           (org.semanticweb.owlapi.model AxiomType IRI OWLClassExpression OWLOntology OWLOntologyManager OWLDataFactory)
           (org.semanticweb.owlapi.profiles OWL2ELProfile)))

(set! *warn-on-reflection* true)

(defn- toy-context []
  (let [^OWLOntologyManager manager (OWLManager/createOWLOntologyManager)
        iri     (IRI/create "urn:test:module")
        ontology (.createOntology manager iri)
        ^OWLDataFactory df (.getOWLDataFactory manager)
        ^org.semanticweb.owlapi.model.OWLClass Car (.getOWLClass df (IRI/create "urn:test:Car"))
        ^org.semanticweb.owlapi.model.OWLClass Parent (.getOWLClass df (IRI/create "urn:test:Parent"))
        ^org.semanticweb.owlapi.model.OWLClass Person (.getOWLClass df (IRI/create "urn:test:Person"))
        ^org.semanticweb.owlapi.model.OWLObjectProperty hasChild (.getOWLObjectProperty df (IRI/create "urn:test:hasChild"))
        alice   (.getOWLNamedIndividual df (IRI/create "urn:test:alice"))
        bob     (.getOWLNamedIndividual df (IRI/create "urn:test:bob"))
        ;; TBox axioms
        sub-parent (.getOWLSubClassOfAxiom df Parent (.getOWLObjectSomeValuesFrom df hasChild Person))
        sub-car (.getOWLSubClassOfAxiom df Car Parent)
        sub-all (.getOWLSubClassOfAxiom df Person (.getOWLObjectAllValuesFrom df hasChild Car))
        sub-min (.getOWLSubClassOfAxiom df Person (.getOWLObjectMinCardinality df 2 hasChild Person))
        ^java.util.List operands (doto (java.util.ArrayList.)
                                   (.add ^OWLClassExpression Parent)
                                   (.add ^OWLClassExpression Car))
        car-or-parent (.getOWLObjectUnionOf df operands)
        ^"[Lorg.semanticweb.owlapi.model.OWLClassExpression;" arr (into-array OWLClassExpression [Parent car-or-parent])
        eq-parent (.getOWLEquivalentClassesAxiom df arr)
        ;; ABox example
        ax-parent (.getOWLClassAssertionAxiom df Parent alice)
        ax-person (.getOWLClassAssertionAxiom df Person bob)
        ax-role (.getOWLObjectPropertyAssertionAxiom df hasChild alice bob)]
    (doseq [ax [sub-parent sub-car sub-all sub-min eq-parent ax-parent ax-person ax-role]]
      (.addAxiom manager ontology ax))
    {:manager manager
     :ontology ontology
     :prefixes {"ex" "urn:test:"}
     :eng-cache (atom {})}))

(deftest extract-module-preserves-inheres
  (let [ctx (toy-context)
        res-full (set (x/q '[:find ?s ?o :where [?s :ex/hasChild ?o] :return :kw]
                               ctx))
        module-ctx (module/extract ctx [{:class :ex/Parent}
                                        {:object-property :ex/hasChild}]
                                   {:sub-class-level -1})
        res-module (set (x/q '[:find ?s ?o :where [?s :ex/hasChild ?o] :return :kw]
                                   module-ctx))]
    (is (= res-module res-full)
        "Module should preserve entailments when subclass closure is requested")
    (let [^OWLOntology module-ont (:ontology module-ctx)
          ^OWLOntology source-ont (:ontology ctx)]
      (is (<= (.getAxiomCount module-ont)
              (.getAxiomCount source-ont))
        "Module should never grow larger than the source ontology"))))

(deftest save-module-writes-file
  (let [ctx (toy-context)
        module-ctx (module/extract ctx [{:class :ex/Parent}])
        tmp (.toFile (java.nio.file.Files/createTempFile "wikipunk-module" ".ttl" (into-array java.nio.file.attribute.FileAttribute [])))]
    (try
      (module/save! module-ctx (.getAbsolutePath tmp))
      (is (> (.length tmp) 0))
      (finally
        (java.nio.file.Files/deleteIfExists (.toPath tmp))))))

(deftest extract-el-profile-approximates
  (let [ctx (toy-context)
        module-ctx (module/extract ctx [{:class :ex/Person}]
                                   {:profile :el
                                    :profile-opts {:materialize? true
                                                   :classify? true}})
        ^OWLOntology ontology (:ontology module-ctx)
        ^OWLOntologyManager manager (:manager module-ctx)
        ^OWLDataFactory df (.getOWLDataFactory manager)
        person (.getOWLClass df (IRI/create "urn:test:Person"))
        car (.getOWLClass df (IRI/create "urn:test:Car"))
        hasChild (.getOWLObjectProperty df (IRI/create "urn:test:hasChild"))
        forb-ax (.getOWLSubClassOfAxiom df person (.getOWLObjectAllValuesFrom df hasChild car))
        permitted-ax (.getOWLSubClassOfAxiom df person (.getOWLObjectSomeValuesFrom df hasChild person))
        report (.checkOntology (OWL2ELProfile.) ontology)
        ^java.util.Set axioms (.getAxioms ontology)]
    (is (.isInProfile report) "Module should satisfy OWL 2 EL profile")
    (is (false? (.contains axioms forb-ax)) "Non-EL axiom should be removed")
    (is (false? (.contains axioms permitted-ax)) "Approximation should drop axioms needing non-EL constructs")))

(deftest ensure-el-profile-strips-individuals
  (let [ctx (toy-context)
        ^OWLOntology ontology (:ontology ctx)]
    (module/ensure-el-profile! ctx)
    (is (zero? (count (.getAxioms ontology AxiomType/CLASS_ASSERTION))))
    (is (zero? (count (.getAxioms ontology AxiomType/OBJECT_PROPERTY_ASSERTION))))
    (is (every?
           (fn [decl]
             (let [entity (.getEntity ^org.semanticweb.owlapi.model.OWLDeclarationAxiom decl)]
               (or (.isOWLClass entity)
                   (.isOWLObjectProperty entity))))
           (.getAxioms ontology AxiomType/DECLARATION)))))
