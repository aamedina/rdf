(ns net.wikipunk.ontology.module
  "Ontology module extraction (syntactic locality).

  Produces focused slices that preserve entailments for a given signature while
  trimming unrelated axioms."
  (:require
   [clojure.java.io :as io]
   [net.wikipunk.ontology.explain :as explain])
  (:import
   (org.semanticweb.elk.owlapi ElkReasonerFactory)
   (org.semanticweb.owlapi.apibinding OWLManager)
   (org.semanticweb.owlapi.formats TurtleDocumentFormat)
   (org.semanticweb.owlapi.model
     AddAxiom
     IRI
     OWLAxiom
     OWLClass
     OWLClassExpression
     OWLEquivalentClassesAxiom
     OWLDataHasValue
     OWLDataMinCardinality
     OWLDataSomeValuesFrom
     OWLEntity
     OWLDeclarationAxiom
     OWLObjectAllValuesFrom
     OWLObjectComplementOf
     OWLObjectHasSelf
     OWLObjectHasValue
     OWLObjectIntersectionOf
     OWLObjectMinCardinality
     OWLObjectSomeValuesFrom
     OWLObjectUnionOf
     OWLOntology
     OWLSubClassOfAxiom
     OWLOntologyManager
     RemoveAxiom
     AxiomType)
   (org.semanticweb.owlapi.profiles OWL2ELProfile OWLProfileReport OWLProfileViolation)
   (org.semanticweb.owlapi.reasoner InferenceType OWLReasonerFactory)
   (org.semanticweb.owlapi.reasoner.structural StructuralReasonerFactory)
   (org.semanticweb.owlapi.util InferredOntologyGenerator InferredSubClassAxiomGenerator
                                InferredSubDataPropertyAxiomGenerator InferredSubObjectPropertyAxiomGenerator)
   (uk.ac.manchester.cs.owlapi.modularity ModuleType SyntacticLocalityModuleExtractor))
  (:refer-clojure :exclude [extract]))

(set! *warn-on-reflection* true)

(def ^{:doc "Default locality module type used during extraction."}
  ^ModuleType ^:dynamic *module-type* ModuleType/BOT)

(defn- ensure-prefixes
  "Throw if ctx does not carry a :prefixes map."
  [ctx]
  (when-not (map? (:prefixes ctx))
    (throw (ex-info "Context missing :prefixes mapping"
                    {:ctx-keys (keys ctx)})))
  ctx)

(defn- kw->iri
  "Keyword -> IRI using ctx :prefixes."
  [{:keys [prefixes]} kw]
  (let [ns (namespace kw)
        name (name kw)
        base (get prefixes ns)]
    (when-not base
      (throw (ex-info (str "Unknown prefix: " ns)
                      {:keyword kw :prefix ns :prefixes (keys prefixes)})))
    (IRI/create (str base name))))

(defn- normalize-iri
  [ctx value]
  (cond
    (instance? IRI value) ^IRI value
    (keyword? value) (kw->iri ctx value)
    (string? value) (IRI/create ^String value)
    :else (throw (ex-info "Cannot coerce value to IRI"
                          {:value value :type (type value)}))))

(defn- entity-from-spec
  "Turn a spec into an OWLEntity using ctx prefixes.
   Supported specs:
   - actual OWLEntity
   - IRI (string or org.semanticweb.owlapi.model.IRI)
   - keyword (assumed class)
   - {:class kw|string|IRI}
   - {:object-property kw|string|IRI}
   - {:data-property kw|string|IRI}
   - {:annotation-property kw|string|IRI}
   - {:individual kw|string|IRI}"
  [ctx ^org.semanticweb.owlapi.model.OWLDataFactory df spec]
  (cond
    (instance? OWLEntity spec) spec
    (keyword? spec) (.getOWLClass df ^IRI (normalize-iri ctx spec))
    (instance? IRI spec) (.getOWLClass df ^IRI spec)
    (string? spec) (.getOWLClass df (IRI/create ^String spec))
    (map? spec)
    (let [[k v] (first spec)
          iri (normalize-iri ctx v)]
      (case k
        :class (.getOWLClass df ^IRI iri)
        :object-property (.getOWLObjectProperty df ^IRI iri)
        :data-property (.getOWLDataProperty df ^IRI iri)
        :annotation-property (.getOWLAnnotationProperty df ^IRI iri)
        :individual (.getOWLNamedIndividual df ^IRI iri)
        (throw (ex-info "Unknown entity spec tag" {:tag k :spec spec}))))
    :else (throw (ex-info "Unsupported entity spec" {:spec spec :type (type spec)}))))

(defn- signature->entities
  [ctx seeds]
  (let [^org.semanticweb.owlapi.model.OWLDataFactory df explain/*df*]
    (into #{} (map #(entity-from-spec ctx df %) seeds))))

(def ^:private el-pass-through-axiom-types
  #{AxiomType/DIFFERENT_INDIVIDUALS
    AxiomType/DISJOINT_CLASSES
    AxiomType/EQUIVALENT_OBJECT_PROPERTIES
    AxiomType/OBJECT_PROPERTY_DOMAIN
    AxiomType/OBJECT_PROPERTY_RANGE
    AxiomType/REFLEXIVE_OBJECT_PROPERTY
    AxiomType/SUB_OBJECT_PROPERTY
    AxiomType/TRANSITIVE_OBJECT_PROPERTY})

(defn- ontology-data-factory
  ^org.semanticweb.owlapi.model.OWLDataFactory [^OWLOntology ontology]
  (.getOWLDataFactory (.getOWLOntologyManager ontology)))

(defn- to-linked-hash-set
  ^java.util.LinkedHashSet [coll]
  (let [^java.util.LinkedHashSet s (java.util.LinkedHashSet.)]
    (doseq [x coll]
      (.add s x))
    s))

(defn- logical-axioms
  "Return the set of logical axioms across the ontology import closure."
  [^OWLOntology ontology]
  (into #{}
        (mapcat (fn [^OWLOntology o]
                  (seq (.getLogicalAxioms o))))
        (.getImportsClosure ontology)))

(declare el-approx-class-expr)

(defrecord ElExpr [^OWLClassExpression expr ^boolean exact?])

(defn- el-expr
  (^ElExpr [^OWLClassExpression expr]
   (->ElExpr expr true))
  (^ElExpr [^OWLClassExpression expr exact?]
   (->ElExpr expr exact?)))

(defn- el-expr? [x]
  (instance? ElExpr x))

(defn- el-approx-class-expr
  "Weaken `ce` to an OWL 2 EL-compliant class expression. Returns nil when the
   expression cannot be represented in EL without strengthening it."
  [^OWLOntology ontology ^OWLClassExpression ce]
  (let [^org.semanticweb.owlapi.model.OWLDataFactory df (ontology-data-factory ontology)]
    (cond
      (instance? OWLClass ce) (el-expr ce)

      (instance? OWLObjectSomeValuesFrom ce)
      (let [^org.semanticweb.owlapi.model.OWLObjectPropertyExpression p (.getProperty ^OWLObjectSomeValuesFrom ce)
            filler (el-approx-class-expr ontology (.getFiller ^OWLObjectSomeValuesFrom ce))]
        (when (el-expr? filler)
          (el-expr (.getOWLObjectSomeValuesFrom df p (.expr ^ElExpr filler))
                   (.exact? ^ElExpr filler))))

      (instance? OWLObjectIntersectionOf ce)
      (let [operands-results (map #(el-approx-class-expr ontology %)
                                  (.getOperands ^OWLObjectIntersectionOf ce))]
        (when (every? el-expr? operands-results)
          (let [opers (java.util.ArrayList.)]
            (doseq [^ElExpr res operands-results]
              (.add opers (.expr res)))
            (cond
              (zero? (.size opers)) nil
              (= 1 (.size opers)) (nth operands-results 0)
              :else (el-expr (.getOWLObjectIntersectionOf df opers)
                             (every? #(.exact? ^ElExpr %) operands-results))))))

      (instance? OWLObjectMinCardinality ce)
      (let [card (.getCardinality ^OWLObjectMinCardinality ce)]
        (when (pos? card)
          (let [^org.semanticweb.owlapi.model.OWLObjectPropertyExpression p (.getProperty ^OWLObjectMinCardinality ce)
                filler (el-approx-class-expr ontology (.getFiller ^OWLObjectMinCardinality ce))]
            (when (el-expr? filler)
              (el-expr (.getOWLObjectSomeValuesFrom df p (.expr ^ElExpr filler))
                       false)))))

      (instance? OWLDataMinCardinality ce) nil

      (instance? OWLObjectHasValue ce) nil

      (instance? OWLObjectHasSelf ce) nil

      (instance? OWLDataSomeValuesFrom ce) nil

      (instance? OWLDataHasValue ce) nil

      (instance? OWLObjectAllValuesFrom ce) nil

      (instance? OWLObjectUnionOf ce) nil

      (instance? OWLObjectComplementOf ce) nil

      :else nil)))

(defn- el-approx-axiom
  "Return zero or more EL-safe axioms derived from `ax`."
  [^OWLOntology ontology ^OWLAxiom ax]
  (let [^org.semanticweb.owlapi.model.OWLDataFactory df (ontology-data-factory ontology)
        ax-type (.getAxiomType ax)]
    (cond
      (= ax-type AxiomType/SUBCLASS_OF)
      (let [^OWLSubClassOfAxiom sub-ax ax
            lhs (el-approx-class-expr ontology (.getSubClass sub-ax))
            rhs (el-approx-class-expr ontology (.getSuperClass sub-ax))]
        (if (and (el-expr? lhs) (el-expr? rhs) (.exact? ^ElExpr lhs) (.exact? ^ElExpr rhs))
          [(.getOWLSubClassOfAxiom df (.expr ^ElExpr lhs) (.expr ^ElExpr rhs))]
          []))

      (= ax-type AxiomType/EQUIVALENT_CLASSES)
      []

      (el-pass-through-axiom-types ax-type)
      [ax]

      :else [])))

(defn- profile-violation->data
  [^OWLProfileViolation violation]
  {:type (-> violation class .getSimpleName)
   :axiom (some-> (.getAxiom violation) str)})

(def ^:private elk-supported-axiom-types
  #{AxiomType/SUBCLASS_OF
    AxiomType/EQUIVALENT_CLASSES
    AxiomType/SUB_OBJECT_PROPERTY})

(def ^:private elk-disallowed-abox-types
  #{AxiomType/CLASS_ASSERTION
    AxiomType/OBJECT_PROPERTY_ASSERTION
    AxiomType/DATA_PROPERTY_ASSERTION
    AxiomType/NEGATIVE_OBJECT_PROPERTY_ASSERTION
    AxiomType/NEGATIVE_DATA_PROPERTY_ASSERTION
    AxiomType/SAME_INDIVIDUAL
    AxiomType/DIFFERENT_INDIVIDUALS
    AxiomType/HAS_KEY})

(defn- elk-supported-class-expr?
  [^OWLClassExpression expr]
  (cond
    (.isOWLThing expr) true
    (.isOWLNothing expr) true
    (instance? OWLClass expr) true
    (instance? OWLObjectSomeValuesFrom expr)
    (elk-supported-class-expr? (.getFiller ^OWLObjectSomeValuesFrom expr))
    (instance? OWLObjectIntersectionOf expr)
    (let [ops (.getOperands ^OWLObjectIntersectionOf expr)]
      (every? (fn [op]
                (elk-supported-class-expr? ^OWLClassExpression op))
              ops))
    :else false))

(defn- elk-supported-axiom?
  [^OWLAxiom ax]
  (let [ax-type (.getAxiomType ax)]
    (cond
      (= ax-type AxiomType/SUBCLASS_OF)
      (let [^OWLSubClassOfAxiom sax ax]
        (and (elk-supported-class-expr? (.getSubClass sax))
             (elk-supported-class-expr? (.getSuperClass sax))))

      (= ax-type AxiomType/EQUIVALENT_CLASSES)
      (let [^OWLEquivalentClassesAxiom eq ax]
        (every? (fn [op]
                  (elk-supported-class-expr? ^OWLClassExpression op))
                (.getClassExpressions eq)))

      (= ax-type AxiomType/SUB_OBJECT_PROPERTY) true

      :else false)))

(defn- elk-tbox-axioms
  [^OWLOntology ontology]
  (->> (logical-axioms ontology)
       (filter elk-supported-axiom?)))

(defn- declaration-axioms
  [^OWLOntology ontology]
  (let [df (ontology-data-factory ontology)]
    (let [entities (.getSignature ontology)]
      (for [^OWLEntity entity entities
            :when (or (.isOWLClass entity)
                      (.isOWLObjectProperty entity))]
        (.getOWLDeclarationAxiom df entity)))))

(defn- elk-reasoner-context
  "Build a temporary ontology containing only ELK-supported axioms and entity
   declarations so ELK can reason without incompleteness warnings. Returns nil
   when there is nothing for ELK to classify."
  [^OWLOntology ontology]
  (let [axioms (to-linked-hash-set (concat (elk-tbox-axioms ontology)
                                           (declaration-axioms ontology)))]
    (when (pos? (.size axioms))
      (let [manager (OWLManager/createOWLOntologyManager)
            temp-ontology (.createOntology manager axioms)
            ^org.semanticweb.owlapi.reasoner.OWLReasoner reasoner (.createReasoner (ElkReasonerFactory.) temp-ontology)]
        {:manager manager
         :ontology temp-ontology
         :reasoner reasoner}))))

(defn- strip-axiom-types!
  [^OWLOntology ontology types]
  (let [^OWLOntologyManager manager (.getOWLOntologyManager ontology)
        removal-list (java.util.ArrayList.)]
    (doseq [^AxiomType t types
            ^OWLAxiom ax (.getAxioms ontology t)]
      (.add removal-list (RemoveAxiom. ontology ax)))
    (when (pos? (.size removal-list))
      (.applyChanges manager removal-list)))
  ontology)

(defn- strip-unsupported-declarations!
  [^OWLOntology ontology]
  (let [^OWLOntologyManager manager (.getOWLOntologyManager ontology)
        removal-list (java.util.ArrayList.)]
    (doseq [^OWLDeclarationAxiom ax (.getAxioms ontology AxiomType/DECLARATION)]
      (let [entity (.getEntity ax)]
        (when (or (.isOWLDatatype entity)
                  (.isOWLDataProperty entity)
                  (.isOWLNamedIndividual entity))
          (.add removal-list (RemoveAxiom. ontology ax)))))
    (when (pos? (.size removal-list))
      (.applyChanges manager removal-list)))
  ontology)

(defn- ensure-el-profile-ontology!
  "Approximate the ontology in place so it satisfies OWL 2 EL."
  [^OWLOntology ontology]
  (let [^OWLOntologyManager manager (.getOWLOntologyManager ontology)
        original (logical-axioms ontology)
        approximated (into #{} (mapcat #(el-approx-axiom ontology %)) original)
        removals (map #(RemoveAxiom. ontology %) original)
        additions (map #(AddAxiom. ontology %) approximated)]
    (when (seq removals)
      (let [^java.util.List removal-list (vec removals)]
        (.applyChanges manager removal-list)))
    (when (seq additions)
      (let [^java.util.List additions-list (vec additions)]
        (.applyChanges manager additions-list)))

    (let [profile (OWL2ELProfile.)
          ^OWLProfileReport report (.checkOntology profile ontology)]
      (doseq [^OWLProfileViolation violation (.getViolations report)]
        (let [repairs (.repair violation)]
          (when (and repairs (not (.isEmpty repairs)))
            (.applyChanges manager repairs)))))

    (let [profile (OWL2ELProfile.)
          ^OWLProfileReport report (.checkOntology profile ontology)]
      (when-not (.isInProfile report)
        (doseq [^OWLProfileViolation violation (.getViolations report)]
          (when-let [ax (.getAxiom violation)]
            (.applyChange manager (RemoveAxiom. ontology ax)))))
      (let [final-report (.checkOntology (OWL2ELProfile.) ontology)]
        (when-not (.isInProfile final-report)
          (throw (ex-info "Ontology still violates OWL 2 EL after approximation"
                          {:violations (map profile-violation->data
                                            (.getViolations final-report))}))))))
  ontology)

(defn materialize-entailed-el!
  "Materialize EL-safe inferred hierarchy axioms using ELK."
  ([ctx]
   (materialize-entailed-el! ctx {}))
  ([{:keys [^OWLOntology ontology ^OWLOntologyManager manager] :as ctx} _]
   (if-let [{^org.semanticweb.owlapi.reasoner.OWLReasoner reasoner :reasoner} (elk-reasoner-context ontology)]
     (try
       (let [generators [(InferredSubClassAxiomGenerator.)
                         (InferredSubObjectPropertyAxiomGenerator.)]
             generator (InferredOntologyGenerator. reasoner generators)
             inference-types (into-array InferenceType
                                         [InferenceType/CLASS_HIERARCHY
                                          InferenceType/OBJECT_PROPERTY_HIERARCHY])
             ^org.semanticweb.owlapi.model.OWLDataFactory data-factory (.getOWLDataFactory manager)]
         (.precomputeInferences reasoner inference-types)
         (.fillOntology generator data-factory ontology)
         ctx)
       (finally
         (.dispose reasoner)))
     ctx)))

(defn elk-classify!
  "Classify the ontology with ELK to ensure hierarchy cache is warm."
  ([ctx]
   (elk-classify! ctx {}))
  ([{:keys [^OWLOntology ontology] :as ctx} _]
  (if-let [{^org.semanticweb.owlapi.reasoner.OWLReasoner reasoner :reasoner} (elk-reasoner-context ontology)]
     (try
       (.precomputeInferences reasoner (into-array InferenceType [InferenceType/CLASS_HIERARCHY]))
       ctx
       (finally
         (.dispose reasoner)))
     ctx)))

(defn dl-materialize-hierarchy!
  "Run a DL reasoner to materialize subclass/object-property hierarchy axioms
   before EL approximation. This preserves the original entailments while we
   later strip non-EL constructs."
  ([ctx]
   (dl-materialize-hierarchy! ctx {}))
  ([{:keys [^OWLOntology ontology ^OWLOntologyManager manager] :as ctx}
    {:keys [reasoner]}]
   (let [rf (explain/resolve-reasoner-factory (or reasoner :openllet))
         ^OWLReasonerFactory factory rf
         reasoner (.createReasoner factory ontology)
         generators [(InferredSubClassAxiomGenerator.)
                     (InferredSubObjectPropertyAxiomGenerator.)]
         generator (InferredOntologyGenerator. reasoner generators)
         ^org.semanticweb.owlapi.model.OWLDataFactory data-factory (.getOWLDataFactory manager)]
     (try
       (.precomputeInferences reasoner (into-array InferenceType [InferenceType/CLASS_HIERARCHY
                                                                  InferenceType/OBJECT_PROPERTY_HIERARCHY]))
       (.fillOntology generator data-factory ontology)
       ctx
       (finally
         (.dispose reasoner))))))

(defn ensure-el-profile!
  "Project the ontology in `ctx` onto the OWL 2 EL profile. Options:
   - :materialize? add inferred subclass/prop axioms via ELK (default false)
   - :classify?    run ELK classification post-projection (default false)
   - :strip-individuals? remove ABox axioms before ELK (default true)
   - :dl-materialize? run a DL reasoner first (default true)
   - :dl-reasoner keyword or factory for the DL pre-pass"
  ([ctx]
   (ensure-el-profile! ctx {}))
  ([{:keys [^OWLOntology ontology] :as ctx}
    {:keys [materialize? classify? strip-individuals? dl-materialize? dl-reasoner]
     :or {materialize? false classify? false strip-individuals? true dl-materialize? false}}]
   (let [ctx-pre (if dl-materialize?
                   (dl-materialize-hierarchy! ctx {:reasoner dl-reasoner})
                   ctx)
         ^OWLOntology ontology* (:ontology ctx-pre)]
     (ensure-el-profile-ontology! ontology*)
     (when strip-individuals?
       (strip-axiom-types! ontology* elk-disallowed-abox-types))
     (strip-unsupported-declarations! ontology*)
     (cond-> ctx-pre
       materialize? (materialize-entailed-el!)
       classify? (elk-classify!)))))

(defn extract
  "Return a new context containing a syntactic-locality module for `seeds`.

   `ctx` should contain at least {:manager OWLOntologyManager :ontology OWLOntology :prefixes {...}}.
   `seeds` is a collection of entity specs (see `entity-from-spec`).

   Options:
   - :module-type (default BOT)
   - :manager     an OWLOntologyManager to use for the new module (default creates a fresh one)
   - :profile     request post-processing (:el currently supported)
   - :profile-opts map of profile-specific options (see `ensure-el-profile!`)

   Result mirrors the original ctx (prefixes, eng-cache, etc.) but includes the smaller ontology."
  ([ctx seeds]
   (extract ctx seeds {}))
  ([{:keys [^org.semanticweb.owlapi.model.OWLOntologyManager manager
            ^OWLOntology ontology
            prefixes] :as ctx}
    seeds
    {:keys [^ModuleType module-type super-class-level sub-class-level reasoner
            profile profile-opts]
     :or {module-type       *module-type*
          super-class-level 0
          sub-class-level   0}}]
   (ensure-prefixes ctx)
   (when (or (nil? manager) (nil? ontology))
     (throw (ex-info "Context missing manager/ontology" {:ctx-keys (keys ctx)})))
   (let [entities (signature->entities {:prefixes prefixes} seeds)
         ^SyntacticLocalityModuleExtractor extractor (SyntacticLocalityModuleExtractor. manager ontology module-type)
         axioms (if (and (zero? super-class-level) (zero? sub-class-level))
                  (.extract extractor entities)
                  (let [^org.semanticweb.owlapi.reasoner.OWLReasoner r
                        (or reasoner (.createReasoner (StructuralReasonerFactory.) ontology))]
                    (try
                      (.extract extractor entities
                                (int super-class-level)
                                (int sub-class-level)
                                r)
                      (finally (when (nil? reasoner) (.dispose r))))))
         ^org.semanticweb.owlapi.model.OWLOntologyManager new-manager (OWLManager/createOWLOntologyManager)
         ^OWLOntology module (.createOntology new-manager ^java.util.Set axioms)
         module-ctx {:manager new-manager
                     :ontology module
                     :prefixes prefixes}]
     (cond-> module-ctx
       (= :el profile) (ensure-el-profile! (or profile-opts {}))))))

(defn extract-as-ontology
  "Convenience wrapper returning the raw OWLOntology module."
  ([ctx seeds]
   (extract-as-ontology ctx seeds {}))
  ([ctx seeds opts]
   (:ontology (extract ctx seeds opts))))

(defn save!
  "Persist an extracted module context (or raw OWLOntology) to `path`.
   Format defaults to text/turtle; supply any OWLAPI format instance if you prefer
   RDF/XML or functional syntax."
  ([module path]
   (save! module path {}))
  ([module path {:keys [^org.semanticweb.owlapi.model.OWLDocumentFormat format] :or {format (TurtleDocumentFormat.)}}]
   (let [[^org.semanticweb.owlapi.model.OWLOntologyManager manager
          ^OWLOntology ontology]
         (if (map? module)
           [(:manager module) (:ontology module)]
           [(.getOWLOntologyManager ^OWLOntology module) module])
        _ (when (or (nil? manager) (nil? ontology))
            (throw (ex-info "Cannot resolve manager/ontology for module" {})))
         file (io/file path)
        ^IRI iri (IRI/create file)]
     (.saveOntology manager ontology format iri)
     (.getAbsolutePath file))))
