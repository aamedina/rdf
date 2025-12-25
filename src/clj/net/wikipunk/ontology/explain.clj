(ns net.wikipunk.ontology.explain
  "Reasoner-backed query helpers and explanation utilities.

  Builds OWL reasoners on demand to explain entailments and provide
  richer diagnostics during ontology queries."
  (:require
   [clojure.string :as str]
   [clojure.set :as set]
   [clojure.java.io :as io]
   [clojure.walk :as walk])
  (:import
   (org.semanticweb.owlapi.apibinding OWLManager)
   (org.semanticweb.owlapi.model IRI OWLOntology OWLOntologyManager OWLAxiom OWLClass AxiomType OWLClassExpression OWLNamedIndividual OWLAnonymousIndividual OWLOntologyIRIMapper OWLSubClassOfAxiom OWLSubPropertyChainOfAxiom OWLDataFactory NodeID OWLObjectProperty OWLObjectPropertyDomainAxiom OWLObjectPropertyExpression OWLDataPropertyDomainAxiom OWLEquivalentClassesAxiom OWLSubPropertyChainOfAxiom OWLNamedIndividual OWLDataPropertyExpression OWLDataProperty OWLDataPropertyRangeAxiom OWLDataPropertyAssertionAxiom HasIRI OWLAnnotationAssertionAxiom OWLClassAssertionAxiom OWLIndividual OWLObjectPropertyAssertionAxiom OWLAnnotationProperty OWLObjectInverseOf)
   (org.semanticweb.owlapi.formats PrefixDocumentFormat)
   (org.semanticweb.owlapi.util DefaultPrefixManager ShortFormProvider BidirectionalShortFormProviderAdapter)
   (org.semanticweb.owlapi.util SimpleIRIMapper)
   (org.semanticweb.owlapi.reasoner OWLReasoner OWLReasonerFactory InferenceType InconsistentOntologyException)
   (java.util HashSet)
   (uk.ac.manchester.cs.owlapi.modularity SyntacticLocalityModuleExtractor ModuleType)
   (uk.ac.manchester.cs.jfact JFactFactory JFactReasoner)
   (org.semanticweb.HermiT Reasoner Reasoner$ReasonerFactory)
   (openllet.owlapi OpenlletReasonerFactory OpenlletReasoner)
   (openllet.owlapi.explanation.io.manchester ManchesterSyntaxExplanationRenderer)
   (org.semanticweb.owlapi.reasoner.structural StructuralReasonerFactory StructuralReasoner)
   (org.semanticweb.owlapi.functional.renderer FunctionalSyntaxObjectRenderer)
   (org.semanticweb.owlapi.vocab OWL2Datatype)
   (org.semanticweb.elk.owlapi ElkReasoner ElkReasonerFactory)   
   (org.semanticweb.owl.explanation.api ExplanationGeneratorFactory ExplanationGenerator)
   (org.semanticweb.owl.explanation.impl.blackbox.checker BlackBoxExplanationGeneratorFactory)))

(set! *warn-on-reflection* true)

(set! openllet.core.OpenlletOptions/USE_TRACING true)
(set! openllet.core.OpenlletOptions/USE_COMPLETION_QUEUE true)
(set! openllet.core.OpenlletOptions/USE_INCREMENTAL_CONSISTENCY true)
(set! openllet.core.OpenlletOptions/USE_INCREMENTAL_DELETION true)
(set! openllet.core.OpenlletOptions/MAX_ANONYMOUS_CACHE 1000000)

(def ^:dynamic *engine-sources*
  "Bound during query evaluation to a map of datasource symbol -> engine."
  nil)

(def ^:dynamic *bind-engine*
  "Engine used to canonicalize values during binding/equality checks."
  nil)

(def ^:dynamic *rule-index*
  "Bound during query evaluation to the compiled rule set map: symbol -> rule defs."
  nil)

(def ^:dynamic *rule-raw*
  "Bound during query evaluation to the raw rule collection provided via % in :in clause."
  nil)

(def ^:dynamic *default-reasoner*
  "Default reasoner selection. Accepts a keyword (:pellet|:openllet|:hermit|:structural) or
   an `OWLReasonerFactory`."
  :structural)

(defn resolve-reasoner-factory
  "Coerce `selection` (keyword, factory, or nil) into an `OWLReasonerFactory`.
   Falls back to `*default-reasoner*` when `selection` is nil."
  (^OWLReasonerFactory [selection]
   (resolve-reasoner-factory selection *default-reasoner*))
  (^OWLReasonerFactory [selection default]
   (let [candidate (or selection default)]
     (cond
       (instance? OWLReasonerFactory candidate) candidate
       (keyword? candidate)
       (case candidate
         (:pellet :openllet) (OpenlletReasonerFactory/getInstance)
         :hermit             (org.semanticweb.HermiT.Reasoner$ReasonerFactory.)
         :elk                (ElkReasonerFactory.)
         :jfact              (JFactFactory.)
         :structural         (StructuralReasonerFactory.)
         (throw (ex-info (str "Unknown reasoner keyword: " candidate)
                         {:reasoner candidate})))
       (nil? candidate)                         (OpenlletReasonerFactory/getInstance)
       :else                                    (throw (ex-info "Unsupported reasoner selection"
                                                                {:value candidate}))))))

(defn- reasoner->factory
  "Best-effort mapping from concrete OWLReasoner instance to its factory."
  ^OWLReasonerFactory [^OWLReasoner r]
  (cond
    (instance? OpenlletReasoner r) (OpenlletReasonerFactory/getInstance)
    (instance? JFactReasoner r)    (JFactFactory.)
    (instance? Reasoner r)         (Reasoner$ReasonerFactory.)
    (instance? ElkReasoner r)      (ElkReasonerFactory.)
    (instance? StructuralReasoner r) (StructuralReasonerFactory.)
    :else                          nil))

(defn create-reasoner
  "Instantiate a reasoner for `ontology` using `selection` (keyword or factory).
   Defaults to `*default-reasoner*` when `selection` is nil."
  (^OWLReasoner [^OWLOntology ontology]
   (create-reasoner ontology nil))
  (^OWLReasoner [^OWLOntology ontology selection]
   (.createReasoner ^OWLReasonerFactory (resolve-reasoner-factory selection) ontology)))

(defn- ensure-reasoner
  "Return {:reasoner r :dispose? boolean :factory rf?} ensuring a usable reasoner.
   Reuses provided OWLReasoner instances instead of instantiating new ones."
  [^OWLOntology ontology {:keys [reasoner reasoner-factory]}]
  (cond
    (instance? OWLReasoner reasoner)
    (let [factory (cond
                    reasoner-factory (resolve-reasoner-factory reasoner-factory)
                    :else           (reasoner->factory reasoner))]
      {:reasoner reasoner
       :dispose? false
       :factory  factory})

    :else
    (let [rf (resolve-reasoner-factory (or reasoner-factory reasoner))]
      {:reasoner (.createReasoner ^OWLReasonerFactory rf ontology)
       :dispose? true
       :factory  rf})))

(def ^{:doc "Default OWLDataFactory used when a manager is not available."}
  ^:dynamic ^OWLDataFactory
  *df*
  (OWLManager/getOWLDataFactory))

(defn- ctx-data-factory
  ^OWLDataFactory [ctx]
  (if-let [^OWLOntologyManager m (:manager ctx)]
    (.getOWLDataFactory m)
    *df*))

;; ---------- utilities ----------

(defn file-iri
  "Return an OWL API IRI for a local filesystem path."
  ^IRI [^String p]
  (IRI/create (java.io.File. p)))

(defn- source->file
  [source]
  (cond
    (instance? java.io.File source) (when (.exists ^java.io.File source) source)
    (string? source)
    (let [f (io/file ^String source)]
      (when (.exists f) f))
    :else                           nil))

(defonce ^:private ontology-index-cache (atom {}))

(defn- canonical-path
  ^String [^java.io.File f]
  (some-> f .getCanonicalPath))

(defn- ontology-root
  "Walk parent directories from `base-dir` up to the repository `ontology`
   directory, returning it when present."
  [^java.io.File base-dir]
  (some (fn [^java.io.File dir]
          (when (= "ontology" (.getName dir)) dir))
        (take-while some? (iterate #(.getParentFile ^java.io.File %) base-dir))))

(defn- build-ontology-index
  [^java.io.File root]
  (let [root-path (.toPath root)]
    (->> (file-seq root)
         (reduce (fn [idx ^java.io.File f]
                   (if (and (.isFile f)
                            (str/ends-with? (.getName f) ".ttl"))
                     (let [rel     (.relativize root-path (.toPath f))
                           rel-str (-> rel str (str/replace java.io.File/separator "/"))
                           name    (.getName f)
                           abs     (.getAbsoluteFile f)]
                       (-> idx
                           (update rel-str #(or % abs))
                           (update name #(or % abs))))
                     idx))
                 {}))))

(defn- ontology-index
  [^java.io.File root]
  (let [key (canonical-path root)]
    (or (get @ontology-index-cache key)
        (let [index (build-ontology-index root)]
          (swap! ontology-index-cache assoc key index)
          index))))

(defn- index-match
  [^java.io.File base-dir ^IRI import-iri]
  (when-let [root (ontology-root base-dir)]
    (let [index      (ontology-index root)
          uri        (.toURI import-iri)
          raw-path   (.getPath uri)
          fragment   (.getFragment uri)
          components (->> [raw-path fragment (last (str/split (str import-iri) #"/"))]
                          (keep #(when (and % (str/ends-with? % ".ttl"))
                                   (-> %
                                       (str/replace-first #"^/" ""))))
                          distinct)]
      (some (fn [candidate]
              (when-let [^java.io.File f (get index candidate)]
                (file-iri (.getAbsolutePath f))))
            components))))

(defn- relative-import->doc-iri
  [^java.io.File base-dir ^IRI import-iri]
  (let [uri         (.toURI import-iri)
        fragment    (.getFragment uri)
        raw-path    (.getPath uri)
        s           (str import-iri)
        candidates  (->> [fragment
                          (when (seq raw-path)
                            (let [path (if (and (seq raw-path)
                                                (str/starts-with? raw-path "/"))
                                         (subs raw-path 1)
                                         raw-path)]
                              (when (and path (str/ends-with? path ".ttl"))
                                path)))
                          (when (and (seq raw-path)
                                     (str/includes? raw-path "/"))
                            (let [part (last (str/split raw-path #"/"))]
                              (when (str/ends-with? part ".ttl") part)))
                          (when (str/includes? s "#")
                            (let [frag (second (str/split s #"#" 2))]
                              (when (and frag (str/ends-with? frag ".ttl")) frag)))
                          (let [last-part (last (str/split s #"/"))]
                            (when (and last-part (str/ends-with? last-part ".ttl"))
                              last-part))]
                         (keep identity)
                         distinct)
        search-dirs (->> (iterate #(.getParentFile ^java.io.File %) base-dir)
                         (take-while some?))]
    (or (some (fn [candidate]
                (some (fn [^java.io.File dir]
                        (let [f (io/file dir candidate)]
                          (when (.exists f)
                            (file-iri (.getAbsolutePath f)))))
                      search-dirs))
              candidates)
        (index-match base-dir import-iri))))

(defn register-local-import-mappers!
  "Attach IRI mappers to `manager` so local ontology imports resolve without
  network access."
  [^OWLOntologyManager manager source]
  (when-let [^java.io.File base (some-> ^java.io.File (source->file source) .getParentFile)]
    (let [mapper (proxy [OWLOntologyIRIMapper] []
                   (getDocumentIRI [import-iri]
                     (or (relative-import->doc-iri base import-iri)
                         (index-match base import-iri))))]
      (.addIRIMapper manager mapper))))

(declare imports-closure)

(defn transduce-axioms
  "Return a context whose ontology contains only axioms satisfying `pred`.
   Preserves existing IRI mappers to keep imports resolvable."
  [xform {:keys [^OWLOntologyManager manager ^OWLOntology ontology] :as ctx}]
  (let [m2 (OWLManager/createOWLOntologyManager)]
    (doseq [mapper (.getIRIMappers manager)]
      (.addIRIMapper m2 mapper))
    (let [o2 (.createOntology m2)]
      (.addAxioms o2
                  ^java.util.Collection
                  (stream-into! []
                                xform
                                (.axioms ontology org.semanticweb.owlapi.model.parameters.Imports/INCLUDED)))
      (merge ctx {:manager  m2
                  :ontology o2}))))

(defn without-axiom
  "Returns a transducer that removes axioms of a certain class."
  [cls]
  (remove (fn [^OWLAxiom ax] (instance? cls ax))))

(def without-property-chains
  "Transducer that removes OWL property chain axioms from the ontology context."
  (without-axiom OWLSubPropertyChainOfAxiom))

(def without-equivalent-classes
  "Remove OWL equivalent class axioms from the ontology context"
  (without-axiom OWLEquivalentClassesAxiom))

(declare load-context)

(defn load-vocab-with-mappers
  "Load `vocab-ttl` plus its local imports via SimpleIRIMapper.
   Deprecated in favour of `load-context`, but retained for callers that only
   need {:manager ... :ontology ...}."
  [^String vocab-ttl iri-maps]
  (let [{:keys [manager ontology]}
        (load-context vocab-ttl {:iri-mappers iri-maps})]
    {:manager  manager
     :ontology ontology}))

(def ^:private default-prefixes
  {"rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
   "rdfs" "http://www.w3.org/2000/01/rdf-schema#"
   "owl"  "http://www.w3.org/2002/07/owl#"
   "xsd"  "http://www.w3.org/2001/XMLSchema#"})

(defn thing-subclass-nothing-axiom
  "Build the axiom Thing subclass-of Nothing (used to detect inconsistency)."
  ^OWLAxiom []
  (let [f *df*]
    (.getOWLSubClassOfAxiom f (.getOWLThing f) (.getOWLNothing f))))

(defn- document-path
  [^OWLOntologyManager manager ^OWLOntology o]
  (let [diri (.getOntologyDocumentIRI manager o)
        u    (.toURI diri)]
    (if (= "file" (.getScheme u))
      (.getPath (java.io.File. u))
      (str diri))))

(defn axiom->source-file
  "Find which loaded ontology contributed `ax`; return local path string."
  [^OWLOntologyManager manager ^OWLAxiom ax]
  (some (fn [^OWLOntology o]
          (when (.contains (.getAxioms o) ax)
            (document-path manager o)))
        (.getOntologies manager)))

(defn render-justification
  "Render a single justification set (java.util.Set of axioms) in Manchester Syntax."
  [^java.util.Set just]
  (let [w (java.io.StringWriter.)
        p (java.io.PrintWriter. w)
        r (ManchesterSyntaxExplanationRenderer.)]
    (.startRendering r p)
    (.render r (java.util.Collections/singleton just))
    (.endRendering r)
    (str w)))

(defn render-justification-functional
  "Render a justification set in Functional Syntax using `ontology` for entity context."
  [^OWLOntology ontology ^java.util.Set just]
  (let [w (java.io.StringWriter.)
        r (FunctionalSyntaxObjectRenderer. ontology w)]
    (.renderAxioms r just)
    (str w)))

;; ---------- black-box setup ----------

(defn explanation-factory
  "Create a BlackBox ExplanationGeneratorFactory for consistent ontologies.
   Use `OpenlletReasonerFactory/getInstance` for property-aware explanations."
  ^BlackBoxExplanationGeneratorFactory
  [reasoner-factory progress manager]
  (let [mgr-supplier
        (reify java.util.function.Supplier
          (get [_]
            (let [m (OWLManager/createOWLOntologyManager)]
              (doseq [mapper (.getIRIMappers ^OWLOntologyManager manager)]
                (.addIRIMapper m mapper))
              m)))
        checker  (org.semanticweb.owl.explanation.impl.blackbox.checker.SatisfiabilityEntailmentCheckerFactory.
                   reasoner-factory
                   mgr-supplier)
        expand   (org.semanticweb.owl.explanation.impl.blackbox.StructuralTypePriorityExpansionStrategy.
                   org.semanticweb.owl.explanation.impl.blackbox.InitialEntailmentCheckStrategy/PERFORM
                   mgr-supplier)
        contract (org.semanticweb.owl.explanation.impl.blackbox.DivideAndConquerContractionStrategy.)
        cfg      (org.semanticweb.owl.explanation.impl.blackbox.Configuration.
                   checker expand contract progress mgr-supplier)]
    (BlackBoxExplanationGeneratorFactory. cfg)))

(def ^{:doc "Timeout (ms) for entailment checks in BlackBox explanation generation."}
  ^:dynamic *entailment-checking-timeout*
  10000)

(defn inconsistent-explanation-factory
  "Create a BlackBox ExplanationGeneratorFactory specialized for inconsistent ontologies
   (i.e., explanations for Thing ⊑ Nothing). Use an Openllet reasoner factory."
  (^ExplanationGeneratorFactory
   []
   (org.semanticweb.owl.explanation.impl.blackbox.checker.InconsistentOntologyExplanationGeneratorFactory.
     (openllet.owlapi.OpenlletReasonerFactory/getInstance)
     *df*
     (reify java.util.function.Supplier
       (get [_] (org.semanticweb.owlapi.apibinding.OWLManager/createOWLOntologyManager)))
     *entailment-checking-timeout*))
  (^ExplanationGeneratorFactory
   [reasoner-factory progress manager]
   (let [mgr-supplier
         (reify java.util.function.Supplier
           (get [_] (OWLManager/createOWLOntologyManager)))
         checker  (org.semanticweb.owl.explanation.impl.blackbox.checker.ConsistencyEntailmentCheckerFactory.
                    reasoner-factory
                    mgr-supplier
                    *df*
                    10000)
         expand   (org.semanticweb.owl.explanation.impl.blackbox.InconsistentOntologyExpansionStrategy.)
         contract (org.semanticweb.owl.explanation.impl.blackbox.InconsistentOntologyContractionStrategy.)
         cfg      (org.semanticweb.owl.explanation.impl.blackbox.Configuration.
                    checker expand contract (or progress (org.semanticweb.owl.explanation.api.NullExplanationProgressMonitor.)) mgr-supplier)]
     (org.semanticweb.owl.explanation.impl.blackbox.checker.BlackBoxExplanationGeneratorFactory.
       cfg))))

(defn explanation-generator
  "Create an ExplanationGenerator bound to `ontology` using BlackBox.
   Example:
     (let [{:keys [manager ontology]} (load-context \"punk.ttl\")
           gen (explanation-generator manager ontology)]
       (.getExplanations gen (thing-subclass-nothing-axiom) 5))"
  (^ExplanationGenerator
   [^OWLOntologyManager manager ^OWLOntology ontology]
   (explanation-generator manager ontology nil))
  (^ExplanationGenerator
   [^OWLOntologyManager manager ^OWLOntology ontology reasoner-selection]
   (let [rf (resolve-reasoner-factory reasoner-selection)]
     (.createExplanationGenerator
       ^ExplanationGeneratorFactory
       (explanation-factory rf nil manager)
       ontology))))

;; ---------- inconsistency explanations (Thing ⊑ Nothing) ----------

(defn inconsistency-justifications
  "Produce minimal justifications for an inconsistent ontology (Thing ⊑ Nothing).
   Returns a seq of maps with keys:
   - :axioms  — set of OWL axioms
   - :text    — rendered explanation (string)
   - :by-file — map of source-file path -> vector of axioms
   Options:
   - {:max N}              limit number of justifications (default 5)
     {:reasoner keyword|^OWLReasoner}   use :pellet/:openllet/:hermit/... or reuse an existing reasoner
     {:reasoner-factory f} provide custom factory instance
   Strategy: specialized BlackBox (default Openllet)."
  [{:keys [manager ^OWLOntology ontology]} {:keys [max reasoner reasoner-factory]
                                            :or   {max 5}
                                            :as   opts}]
  (let [reasoner-sel reasoner
        {:keys [reasoner dispose? factory]} (ensure-reasoner ontology opts)
        ^OWLReasoner reasoner* reasoner
        rf (or factory
               (when-not (instance? OWLReasoner reasoner-sel)
                 (resolve-reasoner-factory (or reasoner-factory reasoner-sel)))
               (resolve-reasoner-factory nil))]
    (try
      (when-not (.isConsistent reasoner*)
        (let [ax   (thing-subclass-nothing-axiom)
              sets (let [factory (inconsistent-explanation-factory rf nil manager)
                         gen     (.createExplanationGenerator factory ontology)
                         exps    (.getExplanations
                                   ^ExplanationGenerator gen ax (int max))]
                     (when (seq exps)
                       (map (fn [^org.semanticweb.owl.explanation.api.Explanation e] (.getAxioms e)) exps)))]
          (when (seq sets)
            (for [^java.util.Set j sets]
              (let [axioms (set (iterator-seq (.iterator j)))
                    byf    (reduce (fn [m ^OWLAxiom a]
                                     (update m (axiom->source-file manager a) (fnil conj []) a))
                                   (sorted-map)
                                   axioms)]
                {:axioms  axioms
                 :text    (render-justification j)
                 :by-file byf})))))
      (finally
        (when dispose?
          (.dispose reasoner*))))))

;; ---------- targeted explanations ----------

(defn- subclass-nothing-axiom-for
  ^OWLAxiom [^OWLClass c]
  (let [f *df*]
    (.getOWLSubClassOfAxiom f c (.getOWLNothing f))))

(defn justify-axiom-blackbox
  "Return a seq of java.util.Set<OWLAxiom> justifying an entailment axiom via BlackBox.
   Works with any `OWLReasonerFactory` compatible with the BlackBox checker."
  ([manager ontology ^OWLAxiom axiom max]
   (justify-axiom-blackbox manager ontology axiom max {}))
  ([manager ontology ^OWLAxiom axiom max {:keys [reasoner reasoner-factory]}]
   (let [rf   (resolve-reasoner-factory (or reasoner-factory reasoner))
         gen  (explanation-generator manager ontology rf)
         exps (.getExplanations ^ExplanationGenerator gen axiom (int max))]
     (when (seq exps)
       (map (fn [^org.semanticweb.owl.explanation.api.Explanation e] (.getAxioms e)) exps)))))

(defn unsatisfiable-named-classes
  "Return vector of unsatisfiable named classes in the ontology (excludes owl:Nothing).

  Accepts optional opts {:reasoner :pellet|:hermit|... or ^OWLReasoner
                         :reasoner-factory factory}."
  ([^OWLOntology ontology]
   (unsatisfiable-named-classes ontology {}))
  ([^OWLOntology ontology opts]
   (let [{:keys [reasoner dispose?]} (ensure-reasoner ontology opts)
         ^OWLReasoner reasoner* reasoner]
     (try
       (let [node     (.getUnsatisfiableClasses reasoner*)
             entities (.getEntities node)]
         (->> entities
              (filter #(instance? OWLClass %))
              (remove (fn [^OWLClass c] (.isOWLNothing c)))
              vec))
       (finally
         (when dispose?
           (.dispose reasoner*)))))))

(defn justify-unsat-class
  "Return a seq of maps {:axioms ... :text ... :by-file ...} justifying C ⊑ ⊥ via BlackBox."
  [{:keys [manager ontology]} ^OWLClass cls {:keys [max] :or {max 5}}]
  (let [ax  (subclass-nothing-axiom-for cls)
        jss (justify-axiom-blackbox manager ontology ax max)]
    (when (seq jss)
      (for [^java.util.Set j jss]
        (let [axioms (set (iterator-seq (.iterator j)))
              byf    (reduce (fn [m ^OWLAxiom a]
                               (update m (axiom->source-file manager a) (fnil conj []) a))
                             (sorted-map)
                             axioms)]
          {:axioms  axioms
           :text    (render-justification j)
           :by-file byf})))))

(defn- imports-closure
  [manager ^OWLOntology ontology]
  (or (.getImportsClosure ^OWLOntologyManager manager ontology)
      #{ontology}))

(defn- normalize-prefix-name
  "Drop trailing colon and blank names from prefix declarations."
  ^String [^String p]
  (when (and p (not (str/blank? p)))
    (let [p' (if (and (.endsWith p ":") (> (count p) 0))
               (subs p 0 (dec (count p)))
               p)]
      (when-not (str/blank? p') p'))))

(defn- prefixes-from-format
  [fmt]
  (if (instance? PrefixDocumentFormat fmt)
    (let [m (.getPrefixName2PrefixMap ^PrefixDocumentFormat fmt)]
      (reduce-kv (fn [acc k v]
                   (let [name (normalize-prefix-name k)]
                     (if (and name (some? v))
                       (assoc acc name (str v))
                       acc)))
                 {}
                 m))
    {}))

(defn- collect-prefixes
  [^OWLOntologyManager manager ^OWLOntology ontology]
  (reduce (fn [acc ^OWLOntology o]
            (merge acc (prefixes-from-format (.getOntologyFormat manager o))))
          {}
          (imports-closure manager ontology)))

(defn- source->iri
  "Coerce various source representations into an IRI acceptable to OWLAPI."
  ^IRI [source]
  (cond
    (instance? IRI source)          source
    (instance? java.io.File source) (IRI/create (.toURI ^java.io.File source))
    (string? source)
    (let [raw      ^String source
          stripped (if (str/starts-with? raw "classpath:")
                     (subs raw (count "classpath:"))
                     raw)
          res      (io/resource stripped)
          f        (java.io.File. raw)]
      (cond
        (.exists f) (file-iri raw)
        res         (IRI/create (.toString res))
        :else       (IRI/create raw)))
    :else                           (throw (ex-info "Unsupported ontology source"
                                                    {:source source :type (some-> source class str)}))))

(declare ensure-eng-cache)

(defn load-context
  "Load an ontology from `source` (file path, File, or IRI string).

   Options:
   - `:iri-mappers`  — sequence of `[web-iri local-path]` pairs for import remapping.
   - `:prefixes`     — map of prefix overrides (merged after detected prefixes).

   Returns a ctx map {:manager ... :ontology ... :prefixes {...} :caches ... :eng-cache ...} ready for
   DLQ/Datalog helpers."
  ([source]
   (load-context source {}))
  ([source {:keys [iri-mappers prefixes] :as _opts}]
   (let [manager (OWLManager/createOWLOntologyManager)]
     (register-local-import-mappers! manager source)
     (doseq [[^String web local] iri-mappers]
       (.addIRIMapper manager (SimpleIRIMapper. (IRI/create web) (file-iri local))))
     (let [doc-iri    (source->iri source)
           ontology   (try
                        (.loadOntologyFromOntologyDocument manager doc-iri)
                        (catch Throwable t
                          (throw (ex-info "Failed to load ontology document"
                                          {:source source :document-iri (str doc-iri)} t))))
           detected   (collect-prefixes manager ontology)
           prefix-map (-> default-prefixes
                          (merge detected)
                          (merge prefixes)
                          (->> (remove (comp str/blank? val))
                               (into {})))
           ctx        {:manager      manager
                       :ontology     ontology
                       :prefixes     prefix-map
                       :caches       {:property-kind        (atom {})
                                      :property-restrictions (atom {})}
                       :module-cache (atom {})
                       :document-iri doc-iri}]
       (ensure-eng-cache ctx)))))

(def ^:private abox-types
  #{AxiomType/CLASS_ASSERTION
    AxiomType/DATA_PROPERTY_ASSERTION
    AxiomType/OBJECT_PROPERTY_ASSERTION
    AxiomType/SAME_INDIVIDUAL
    AxiomType/DIFFERENT_INDIVIDUALS
    AxiomType/ANNOTATION_ASSERTION})

(defn tbox-only
  "Create a new manager+ontology containing only TBox axioms from the imports closure."
  [{:keys [^OWLOntologyManager manager ^OWLOntology ontology] :as _ctx}]
  (let [m2 (OWLManager/createOWLOntologyManager)
        _  (doseq [mapper (.getIRIMappers manager)] (.addIRIMapper m2 mapper))
        o2 (.createOntology m2)]
    (doseq [^OWLOntology o (imports-closure manager ontology)]
      (doseq [^OWLAxiom ax (.getAxioms o true)]
        (when-not (contains? abox-types (.getAxiomType ax))
          (.addAxiom m2 o2 ax))))
    {:manager m2 :ontology o2}))

;; ====================== Idiomatic EDN DSL + API ===========================

;; --- Prefix + OWLAPI helpers ---------------------------------------------

(defn- kw->iri
  ^IRI [{:keys [prefixes]} x]
  (cond
    (instance? IRI x) x
    (instance? HasIRI x)
    (.getIRI ^HasIRI x)
    (string? x)       (IRI/create ^String x)
    (keyword? x)      (let [p    (namespace x)
                            n    (name x)
                            base (get prefixes p)]
                        (when-not base
                          (throw (ex-info (str "Unknown prefix: " p) {:keyword x :prefix p})))
                        (IRI/create (str base n)))
    :else             (throw (ex-info "Cannot make IRI from value" {:value x}))))

(defn- as-class   ^OWLClass   [ctx x]
  (if (instance? OWLClass x)
    x
    (let [^OWLDataFactory df (ctx-data-factory ctx)
          ^IRI iri           (kw->iri ctx x)]
      (.getOWLClass df iri))))

(defn- as-ind     ^OWLNamedIndividual [ctx x]
  (if (instance? OWLNamedIndividual x)
    x
    (let [^OWLDataFactory df (ctx-data-factory ctx)
          ^IRI iri           (kw->iri ctx x)]
      (.getOWLNamedIndividual df iri))))

(defn- as-objprop ^OWLObjectProperty [ctx x]
  (if (instance? OWLObjectProperty x)
    x
    (let [^OWLDataFactory df (ctx-data-factory ctx)
          ^IRI iri           (kw->iri ctx x)]
      (.getOWLObjectProperty df iri))))

(defn- as-dprop   ^OWLDataProperty [ctx x]
  (if (instance? OWLDataProperty x)
    x
    (let [^OWLDataFactory df (ctx-data-factory ctx)
          ^IRI iri           (kw->iri ctx x)]
      (.getOWLDataProperty df iri))))

(defn- as-annprop ^OWLAnnotationProperty [ctx x]
  (if (instance? OWLAnnotationProperty x)
    x
    (let [^OWLDataFactory df (ctx-data-factory ctx)
          ^IRI iri           (kw->iri ctx x)]
      (.getOWLAnnotationProperty df iri))))

;; Object property expression builder (named or inverse)
(defn- obj-prop-expr
  ^OWLObjectPropertyExpression
  [ctx x]
  (let [^OWLDataFactory df (ctx-data-factory ctx)]
    (cond
      (keyword? x) (.getOWLObjectProperty df (kw->iri ctx x))
      (and (vector? x) (= :owl/inverseOf (first x)))
      (let [[_ p] x
            np    (.getOWLObjectProperty df (kw->iri ctx p))]
        (.getOWLObjectInverseOf df np))
      :else        (throw (ex-info "Unsupported object property expression" {:value x})))))

(declare iri->kw)

(defn- obj-prop-expr->form
  [ctx ^OWLObjectPropertyExpression pe]
  (if (.isAnonymous pe)
    (let [inv   ^OWLObjectInverseOf pe
          inner ^OWLObjectProperty (.getNamedProperty (.getInverse inv))]
      {:owl/inverseOf (iri->kw ctx (.getIRI inner))})
    (let [np ^OWLObjectProperty (.getNamedProperty pe)]
      (iri->kw ctx (.getIRI np)))))

(defn- anon-id
  "Return stable blank-node identifier string without _: prefix."
  [^org.semanticweb.owlapi.model.OWLAnonymousIndividual ind]
  (let [raw (str (.getID ind))]
    (if (str/starts-with? raw "_:")
      (subs raw 2)
      raw)))

(defn- property-kind
  "Return :object | :data | :annotation | nil. Memoize via ctx :caches if provided."
  [{:keys [^OWLOntologyManager manager ^OWLOntology ontology caches] :as ctx} iri]
  (let [cache (-> caches :property-kind)
        iri'  (if (instance? IRI iri) iri (kw->iri ctx iri))]
    (if (and cache @cache (contains? @cache iri'))
      (get @cache iri')
      (let [onts  (imports-closure manager ontology)
            obj?  (some (fn [^OWLOntology o]
                          (.containsObjectPropertyInSignature o iri'))
                        onts)
            data? (some (fn [^OWLOntology o]
                          (.containsDataPropertyInSignature o iri'))
                        onts)
            ann?  (some (fn [^OWLOntology o]
                          (.containsAnnotationPropertyInSignature o iri'))
                        onts)
            kind  (cond
                    obj?  :object
                    data? :data
                    ann?  :annotation
                    :else nil)]
        (when cache (swap! cache assoc iri' kind))
        kind))))

(defn- ensure-prop-kind
  "Ensure property `p` is of a supported kind for op `k`. Returns :data or :object.
   Throws for annotation properties or unknown kinds to avoid silent heuristics."
  [ctx k p]
  (let [iri (cond
              (instance? OWLObjectProperty p)     (.getIRI ^OWLObjectProperty p)
              (instance? OWLDataProperty p)       (.getIRI ^OWLDataProperty p)
              (instance? OWLAnnotationProperty p) (.getIRI ^OWLAnnotationProperty p)
              (instance? IRI p)                   p
              :else                               (kw->iri ctx p))]
    (case (property-kind ctx iri)
      :data       :data
      :object     :object
      :annotation (throw (ex-info (str k " not allowed for annotation property")
                                  {:property p :op k}))
      (throw (ex-info (str "Unknown property kind for " k)
                      {:property p :op k})))))

(declare normalize-atom qvar?)

(defn- empty-signature []
  {:classes     #{}
   :obj-props   #{}
   :data-props  #{}
   :individuals #{}
   :datatypes   #{}})

(defn- signature-empty? [sig]
  (every? empty? (vals sig)))

(defn- sig-conj [sig type term]
  (if (or (keyword? term)
          (instance? IRI term)
          (instance? org.semanticweb.owlapi.model.OWLEntity term))
    (update sig type (fnil conj #{}) term)
    sig))

(defn- collect-datarange-sig [sig dr]
  (cond
    (nil? dr)          sig
    (keyword? dr)      (sig-conj sig :datatypes dr)
    (instance? IRI dr) (sig-conj sig :datatypes dr)
    (map? dr)
    (let [sig (if-let [values (:owl/unionOf dr)] (reduce collect-datarange-sig sig values) sig)
          sig (if-let [values (:owl/intersectionOf dr)] (reduce collect-datarange-sig sig values) sig)
          sig (if-let [value (:owl/complementOf dr)] (collect-datarange-sig sig value) sig)
          sig (if-let [value (:owl/dataOneOf dr)] (reduce collect-datarange-sig sig value) sig)
          sig (if-let [value (:owl/oneOf dr)] (reduce collect-datarange-sig sig value) sig)]
      sig)
    (sequential? dr)   (reduce collect-datarange-sig sig dr)
    :else              sig))

(defn- restriction-prop-kind [m]
  (cond
    (:owl/onDataProperty m)   :data
    (:owl/onDataRange m)      :data
    (:owl/onObjectProperty m) :object
    (:owl/onProperty m)       :object
    :else                     nil))

(declare collect-class-expr-sig collect-datarange-sig collect-individual-sig)

(defn- collect-restriction-sig [sig m]
  (let [kind (restriction-prop-kind m)
        sig  (cond-> sig
               (:owl/onProperty m)       (sig-conj :obj-props (:owl/onProperty m))
               (:owl/onObjectProperty m) (sig-conj :obj-props (:owl/onObjectProperty m))
               (:owl/onDataProperty m)   (sig-conj :data-props (:owl/onDataProperty m)))
        sig  (if-let [cl (:owl/onClass m)] (collect-class-expr-sig sig cl) sig)
        sig  (if-let [dr (:owl/onDataRange m)] (collect-datarange-sig sig dr) sig)
        sig  (if-let [sv (:owl/someValuesFrom m)]
               (if (= kind :data)
                 (collect-datarange-sig sig sv)
                 (collect-class-expr-sig sig sv))
               sig)
        sig  (if-let [av (:owl/allValuesFrom m)]
               (if (= kind :data)
                 (collect-datarange-sig sig av)
                 (collect-class-expr-sig sig av))
               sig)
        sig  (if-let [hv (:owl/hasValue m)]
               (cond
                 (= kind :data)
                 (if (or (keyword? hv) (instance? IRI hv))
                   (sig-conj sig :datatypes hv)
                   sig)
                 (= kind :object)
                 (collect-individual-sig sig hv)
                 :else sig)
               sig)]
    sig))

(defn- collect-individual-sig [sig term]
  (cond
    (nil? term)          sig
    (keyword? term)      (sig-conj sig :individuals term)
    (instance? IRI term) (sig-conj sig :individuals term)
    (map? term)
    (reduce collect-individual-sig sig (vals term))
    (sequential? term)
    (reduce collect-individual-sig sig term)
    :else                sig))

(defn- collect-class-expr-sig [sig expr]
  (cond
    (nil? expr)          sig
    (keyword? expr)      (sig-conj sig :classes expr)
    (instance? IRI expr) (sig-conj sig :classes expr)
    (map? expr)
    (let [sig (if (= (:rdf/type expr) :owl/Restriction)
                (collect-restriction-sig sig expr)
                sig)
          sig (if-let [values (:owl/unionOf expr)] (reduce collect-class-expr-sig sig values) sig)
          sig (if-let [values (:owl/intersectionOf expr)] (reduce collect-class-expr-sig sig values) sig)
          sig (if-let [value (:owl/complementOf expr)] (collect-class-expr-sig sig value) sig)
          sig (if-let [values (:owl/oneOf expr)] (reduce collect-individual-sig sig values) sig)]
      sig)
    (vector? expr)
    (let [[op prop filler] expr]
      (case op
        :owl/someValuesFrom (-> sig (sig-conj :obj-props prop) (collect-class-expr-sig filler))
        :owl/allValuesFrom  (-> sig (sig-conj :obj-props prop) (collect-class-expr-sig filler))
        :owl/hasValue       (-> sig (sig-conj :obj-props prop) (collect-individual-sig filler))
        (reduce collect-class-expr-sig sig expr)))
    (sequential? expr)
    (reduce collect-class-expr-sig sig expr)
    :else                sig))

(declare class-expr->form)

(defn- class-form->named-classes
  [form]
  (cond
    (keyword? form) #{form}
    (map? form)
    (let [values (concat
                   (when-let [v (:owl/onClass form)] [v])
                   (when-let [v (:owl/someValuesFrom form)] [v])
                   (when-let [v (:owl/allValuesFrom form)] [v])
                   (when-let [v (:owl/intersectionOf form)] v)
                   (when-let [v (:owl/unionOf form)] v)
                   (when-let [v (:owl/complementOf form)] [v]))]
      (reduce set/union #{}
              (map class-form->named-classes values)))
    (sequential? form)
    (reduce set/union #{} (map class-form->named-classes form))
    :else #{}))

(defn- form-contains-property?
  [form prop-kw]
  (cond
    (map? form)
    (or (= (:owl/onProperty form) prop-kw)
        (= (:owl/onObjectProperty form) prop-kw)
        (= (:owl/onDataProperty form) prop-kw)
        (some #(= % prop-kw) (:owl/onProperties form))
        (some #(form-contains-property? % prop-kw)
              (remove nil?
                      [(:owl/someValuesFrom form)
                       (:owl/allValuesFrom form)
                       (:owl/hasValue form)
                       (:owl/onClass form)
                       (:owl/onDataRange form)
                       (:owl/intersectionOf form)
                       (:owl/unionOf form)
                       (:owl/complementOf form)])))
    (sequential? form)
    (some #(form-contains-property? % prop-kw) form)
    :else false))

(defn- property-keyword
  [ctx prop]
  (cond
    (keyword? prop) prop
    (instance? OWLObjectProperty prop) (iri->kw ctx (.getIRI ^OWLObjectProperty prop))
    (instance? OWLDataProperty prop)   (iri->kw ctx (.getIRI ^OWLDataProperty prop))
    (instance? IRI prop)               (iri->kw ctx prop)
    :else                              nil))

(defn- property-restriction-classes
  [ctx prop]
  (let [prop-kw (property-keyword ctx prop)
        cache   (get-in ctx [:caches :property-restrictions])]
    (if (and prop-kw cache)
      (let [cached (get @cache prop-kw ::missing)]
        (if (not= cached ::missing)
          cached
          (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} ctx
                classes (volatile! #{})
                add-classes! (fn [form]
                               (vswap! classes set/union (class-form->named-classes form)))]
            (doseq [^OWLOntology ont (imports-closure manager ontology)]
              (doseq [^OWLSubClassOfAxiom ax (.getAxioms ont AxiomType/SUBCLASS_OF)]
                (let [sub-form (class-expr->form ctx (.getSubClass ax))
                      sup-form (class-expr->form ctx (.getSuperClass ax))]
                  (when (form-contains-property? sub-form prop-kw)
                    (add-classes! sub-form)
                    (add-classes! sup-form))
                  (when (form-contains-property? sup-form prop-kw)
                    (add-classes! sub-form)
                    (add-classes! sup-form))))
              (doseq [^OWLEquivalentClassesAxiom ax (.getAxioms ont AxiomType/EQUIVALENT_CLASSES)]
                (let [forms (map #(class-expr->form ctx %) (.getClassExpressions ax))]
                  (when (some #(form-contains-property? % prop-kw) forms)
                    (doseq [form forms]
                      (add-classes! form))))))
            (let [result @classes]
              (swap! cache assoc prop-kw result)
              result))))
      #{})))

(defn- property-kind-kw [ctx kw]
  (when kw
    (try
      (property-kind ctx (kw->iri ctx kw))
      (catch Throwable _ nil))))

(defn- collect-atom-sig [ctx sig atom]
  (let [atm (normalize-atom ctx atom)
        op  (first atm)]
    (case op
      :subc      (-> sig (collect-class-expr-sig (second atm)) (collect-class-expr-sig (nth atm 2)))
      :equivc    (-> sig (collect-class-expr-sig (second atm)) (collect-class-expr-sig (nth atm 2)))
      :isa       (let [[_ term ce] atm
                       sig         (if (and term (not (qvar? term))) (collect-individual-sig sig term) sig)]
                   (collect-class-expr-sig sig ce))
      :rel       (let [[_ s r o] atm
                       sig       (if (and r (not (qvar? r)))
                                   (let [sig'    (sig-conj sig :obj-props r)
                                         classes (property-restriction-classes ctx r)]
                                     (reduce (fn [acc cls] (sig-conj acc :classes cls)) sig' classes))
                                   sig)
                       sig       (if (and s (not (qvar? s))) (collect-individual-sig sig s) sig)
                       sig       (if (and o (not (qvar? o))) (collect-individual-sig sig o) sig)]
                   sig)
      :data      (let [[_ s r o] atm
                       sig       (if (and r (not (qvar? r))) (sig-conj sig :data-props r) sig)
                       sig       (if (and s (not (qvar? s))) (collect-individual-sig sig s) sig)
                       sig       (if (and o (not (qvar? o)) (keyword? o)) (sig-conj sig :datatypes o) sig)]
                   sig)
      :range     (let [[_ p target] atm
                       kind         (when (and p (not (qvar? p))) (property-kind-kw ctx p))
                       sig          (if (and p (not (qvar? p)))
                                      (if (= kind :data)
                                        (sig-conj sig :data-props p)
                                        (sig-conj sig :obj-props p))
                                      sig)]
                   (if (= kind :data)
                     (collect-datarange-sig sig target)
                     (collect-class-expr-sig sig target)))
      :domain    (let [[_ p target] atm
                       kind         (when (and p (not (qvar? p))) (property-kind-kw ctx p))
                       sig          (if (and p (not (qvar? p)))
                                      (if (= kind :data)
                                        (sig-conj sig :data-props p)
                                        (sig-conj sig :obj-props p))
                                      sig)]
                   (collect-class-expr-sig sig target))
      :equivp    (let [[_ a b] atm
                       kind-a  (when (and a (not (qvar? a))) (property-kind-kw ctx a))
                       kind-b  (when (and b (not (qvar? b))) (property-kind-kw ctx b))
                       sig     (if (and a (not (qvar? a)))
                                 (if (= kind-a :data)
                                   (sig-conj sig :data-props a)
                                   (sig-conj sig :obj-props a))
                                 sig)
                       sig     (if (and b (not (qvar? b)))
                                 (if (= kind-b :data)
                                   (sig-conj sig :data-props b)
                                   (sig-conj sig :obj-props b))
                                 sig)]
                   sig)
      :subp      (let [[_ a b] atm
                       kind-a  (when (and a (not (qvar? a))) (property-kind-kw ctx a))
                       kind-b  (when (and b (not (qvar? b))) (property-kind-kw ctx b))
                       sig     (if (and a (not (qvar? a)))
                                 (if (= kind-a :data)
                                   (sig-conj sig :data-props a)
                                   (sig-conj sig :obj-props a))
                                 sig)
                       sig     (if (and b (not (qvar? b)))
                                 (if (= kind-b :data)
                                   (sig-conj sig :data-props b)
                                   (sig-conj sig :obj-props b))
                                 sig)]
                   sig)
      :same      (let [[_ a b] atm
                       sig     (if (and a (not (qvar? a))) (collect-individual-sig sig a) sig)]
                   (if (and b (not (qvar? b))) (collect-individual-sig sig b) sig))
      :different (let [[_ a b] atm
                       sig     (if (and a (not (qvar? a))) (collect-individual-sig sig a) sig)]
                   (if (and b (not (qvar? b))) (collect-individual-sig sig b) sig))
      :any       (let [[_ s p o] atm
                       sig       (if (and s (not (qvar? s))) (collect-individual-sig sig s) sig)
                       sig       (if (and o (not (qvar? o))) (collect-individual-sig sig o) sig)
                       sig       (if (and p (not (qvar? p)))
                                   (let [sig'    (sig-conj sig :obj-props p)
                                         classes (property-restriction-classes ctx p)]
                                     (reduce (fn [acc cls] (sig-conj acc :classes cls)) sig' classes))
                                   sig)]
                   sig)
      :or        (reduce (fn [sg br]
                           (collect-atom-sig ctx sg br))
                         sig
                         (rest atm))
      sig)))

(defn- collect-query-signature [ctx where]
  (if (and (sequential? where)
           (every? #(or (vector? %) (seq? %)) where))
    (reduce (fn [sig atom]
              (collect-atom-sig ctx sig atom))
            (empty-signature)
            where)
    (collect-class-expr-sig (empty-signature) where)))

(defn- term->entity [ctx type term]
  (let [^OWLDataFactory df (ctx-data-factory ctx)]
    (cond
      (instance? org.semanticweb.owlapi.model.OWLEntity term) term
      (instance? IRI term)
      (case type
        :classes     (.getOWLClass df ^IRI term)
        :obj-props   (.getOWLObjectProperty df ^IRI term)
        :data-props  (.getOWLDataProperty df ^IRI term)
        :individuals (.getOWLNamedIndividual df ^IRI term)
        :datatypes   (.getOWLDatatype df ^IRI term)
        nil)
      (keyword? term)
      (case type
        :classes     (let [^IRI iri (kw->iri ctx term)] (.getOWLClass df iri))
        :obj-props   (let [^IRI iri (kw->iri ctx term)] (.getOWLObjectProperty df iri))
        :data-props  (let [^IRI iri (kw->iri ctx term)] (.getOWLDataProperty df iri))
        :individuals (let [^IRI iri (kw->iri ctx term)] (.getOWLNamedIndividual df iri))
        :datatypes   (let [^IRI iri (kw->iri ctx term)] (.getOWLDatatype df iri))
        nil)
      :else                                                   nil)))

(defn- signature->entities [ctx sig]
  (let [entities (HashSet.)]
    (doseq [kw (:classes sig)]
      (when-let [e (term->entity ctx :classes kw)] (.add entities e)))
    (doseq [kw (:obj-props sig)]
      (when-let [e (term->entity ctx :obj-props kw)] (.add entities e)))
    (doseq [kw (:data-props sig)]
      (when-let [e (term->entity ctx :data-props kw)] (.add entities e)))
    (doseq [kw (:individuals sig)]
      (when-let [e (term->entity ctx :individuals kw)] (.add entities e)))
    (doseq [kw (:datatypes sig)]
      (when-let [e (term->entity ctx :datatypes kw)] (.add entities e)))
    entities))

(defn- module-key-from-entities [entities]
  (let [iris (->> entities
                  (map (fn [^org.semanticweb.owlapi.model.OWLEntity e]
                         (str (.getIRI e))))
                  sort
                  vec)
        h    (hash iris)]
    (format "%08x" (bit-and (int h) 0xffffffff))))

(defn- module-context
  [ctx signature]
  (let [entities (signature->entities ctx signature)]
    (if (zero? (count entities))
      {:ctx ctx :key nil}
      (let [module-key                  (module-key-from-entities entities)
            cache                       (:module-cache ctx)
            cached                      (when cache (get @cache module-key))
            ^OWLOntologyManager manager (:manager ctx)
            ^OWLOntology ontology       (:ontology ctx)]
        (if cached
          {:ctx cached :key module-key}
          (let [extractor      (SyntacticLocalityModuleExtractor. manager ontology ModuleType/STAR)
                module-axioms  (.extract extractor entities)
                module-manager (OWLManager/createOWLOntologyManager)
                _              (doseq [mapper (.getIRIMappers manager)]
                                 (.addIRIMapper module-manager mapper))
                module-iri     (IRI/create (str "urn:module:" module-key))
                module-ont     (.createOntology module-manager module-iri)
                _              (.addAxioms module-manager module-ont module-axioms)
                module-ctx     {:manager      module-manager
                                :ontology     module-ont
                                :prefixes     (:prefixes ctx)
                                :caches       {:property-kind        (atom {})
                                               :property-restrictions (atom {})}
                                :module-cache (:module-cache ctx)
                                :eng-cache    (:eng-cache ctx)
                                :module-key   module-key
                                :document-iri module-iri}]
            (when cache
              (swap! cache assoc module-key module-ctx))
            {:ctx module-ctx :key module-key}))))))

;; --- Literals -------------------------------------------------------------

(defn- as-literal
  "Supports:
   - strings, booleans, integers, doubles, BigDecimal
   - {:rdf/value \"bonjour\" :rdf/language \"fr\"}
   - {:rdf/value \"2024-09-01T12:34:56Z\" :rdf/type :xsd/dateTime}
   - legacy {:lex ... :lang ...}/{:lex ... :datatype ...} maps (for compatibility)"
  ^org.semanticweb.owlapi.model.OWLLiteral
  [ctx v]
  (let [f *df*]
    (cond
      (string? v)                        (.getOWLLiteral f ^String v)
      (instance? Boolean v)              (.getOWLLiteral f (boolean v))
      (instance? Double v)               (.getOWLLiteral f (double v))
      (float? v)                         (.getOWLLiteral f (double v))
      (instance? java.math.BigDecimal v) (.getOWLLiteral f (str v) OWL2Datatype/XSD_DECIMAL)
      (integer? v)                       (.getOWLLiteral f (str v) OWL2Datatype/XSD_INTEGER)

      (and (map? v) (:rdf/value v) (:rdf/language v))
      (.getOWLLiteral f ^String (str (:rdf/value v)) ^String (:rdf/language v))

      (and (map? v) (:rdf/value v) (:rdf/type v))
      (let [^IRI dtiri (kw->iri ctx (:rdf/type v))
            dt         (.getOWLDatatype f dtiri)]
        (.getOWLLiteral f ^String (str (:rdf/value v)) ^org.semanticweb.owlapi.model.OWLDatatype dt))

      (and (map? v) (:rdf/value v))
      (as-literal ctx (:rdf/value v))

      (and (map? v) (:lex v))
      (let [legacy {:rdf/value    (:lex v)
                    :rdf/type     (:datatype v)
                    :rdf/language (:lang v)}]
        (as-literal ctx legacy))

      :else (throw (ex-info "Unsupported literal value" {:value v})))))

;; --- Data ranges ----------------------------------------------------------

(defn- facet->enum
  "Map xsd facet keywords to OWLFacet enum names."
  [k]
  (case k
    :xsd/minInclusive org.semanticweb.owlapi.vocab.OWLFacet/MIN_INCLUSIVE
    :xsd/maxInclusive org.semanticweb.owlapi.vocab.OWLFacet/MAX_INCLUSIVE
    :xsd/minExclusive org.semanticweb.owlapi.vocab.OWLFacet/MIN_EXCLUSIVE
    :xsd/maxExclusive org.semanticweb.owlapi.vocab.OWLFacet/MAX_EXCLUSIVE
    :xsd/length       org.semanticweb.owlapi.vocab.OWLFacet/LENGTH
    :xsd/minLength    org.semanticweb.owlapi.vocab.OWLFacet/MIN_LENGTH
    :xsd/maxLength    org.semanticweb.owlapi.vocab.OWLFacet/MAX_LENGTH
    :xsd/pattern      org.semanticweb.owlapi.vocab.OWLFacet/PATTERN
    nil))

(declare class-expr data-range)

(defn- data-range
  "Build OWLDataRange from keyword/IRI/string or DSL:
     :xsd/string
     [:owl/dataOneOf l1 l2 ...]
     [:owl/withRestrictions :xsd/integer [[...]]]
     [:owl/dataIntersectionOf DR1 DR2 ...]
     [:owl/dataUnionOf DR1 DR2 ...]"
  ^org.semanticweb.owlapi.model.OWLDataRange [ctx form]
  (let [f *df*]
    (cond
      (instance? org.semanticweb.owlapi.model.OWLDataRange form) form
      (keyword? form)                                            (let [^IRI iri (kw->iri ctx form)] (.getOWLDatatype f iri))
      (instance? IRI form)                                       (.getOWLDatatype f ^IRI form)
      (string? form)                                             (recur ctx (kw->iri ctx form))

      (vector? form)
      (let [[op & xs] form]
        (case op
          :owl/dataOneOf
          (let [ls ^java.util.Set (set (map #(as-literal ctx %) xs))]
            (.getOWLDataOneOf f ls))

          :owl/withRestrictions
          (let [[dt facets] xs
                ^IRI dtiri  (kw->iri ctx dt)
                dt'         (.getOWLDatatype f dtiri)
                rs          ^java.util.Set (set (map (fn [[facet lit]]
                                                       (.getOWLFacetRestriction f
                                                                                ^org.semanticweb.owlapi.vocab.OWLFacet (facet->enum facet)
                                                                                ^org.semanticweb.owlapi.model.OWLLiteral (as-literal ctx lit)))
                                                     facets))]
            (.getOWLDatatypeRestriction f dt' rs))

          :owl/dataIntersectionOf
          (let [rs ^java.util.Set (set (map #(data-range ctx %) xs))]
            (.getOWLDataIntersectionOf f rs))

          :owl/dataUnionOf
          (let [rs ^java.util.Set (set (map #(data-range ctx %) xs))]
            (.getOWLDataUnionOf f rs))

          (throw (ex-info "Unknown data range op" {:op op :form form}))))
      :else (throw (ex-info "Unsupported data range" {:value form})))))

;; --- Class expressions ----------------------------------------------------

(defn- class-expr
  ^OWLClassExpression [ctx form]
  (let [f *df*]
    (cond
      (instance? OWLClassExpression form) form
      (keyword? form)                     (as-class ctx form)
      (instance? IRI form)                (.getOWLClass f ^IRI form)
      (string? form)                      (recur ctx (kw->iri ctx form))

      (vector? form)
      (let [[op & xs] form]
        (case op
          :owl/intersectionOf
          (.getOWLObjectIntersectionOf f ^java.util.Set (set (map #(class-expr ctx %) xs)))

          :owl/unionOf
          (.getOWLObjectUnionOf f ^java.util.Set (set (map #(class-expr ctx %) xs)))

          :owl/complementOf
          (let [[c] xs] (.getOWLObjectComplementOf f (class-expr ctx c)))

          :owl/someValuesFrom
          (let [[r c] xs]
            (.getOWLObjectSomeValuesFrom f (obj-prop-expr ctx r) (class-expr ctx c)))

          :owl/allValuesFrom
          (let [[r c] xs]
            (.getOWLObjectAllValuesFrom f (obj-prop-expr ctx r) (class-expr ctx c)))

          :owl/hasValue
          (let [[r v] xs]
            (if (or (keyword? v) (string? v) (instance? IRI v))
              (.getOWLObjectHasValue f (obj-prop-expr ctx r) (as-ind ctx v))
              (.getOWLDataHasValue   f (as-dprop   ctx r) (as-literal ctx v))))

          :owl/hasSelf
          (let [[r] xs] (.getOWLObjectHasSelf f (obj-prop-expr ctx r)))

          :owl/minCardinality
          (let [[n r] xs] (.getOWLObjectMinCardinality f (int n) (obj-prop-expr ctx r)))

          :owl/maxCardinality
          (let [[n r] xs] (.getOWLObjectMaxCardinality f (int n) (obj-prop-expr ctx r)))

          :owl/cardinality
          (let [[n r] xs] (.getOWLObjectExactCardinality f (int n) (obj-prop-expr ctx r)))

          :owl/minQualifiedCardinality
          (let [[n r c] xs] (.getOWLObjectMinCardinality f (int n) (obj-prop-expr ctx r) (class-expr ctx c)))

          :owl/maxQualifiedCardinality
          (let [[n r c] xs] (.getOWLObjectMaxCardinality f (int n) (obj-prop-expr ctx r) (class-expr ctx c)))

          :owl/qualifiedCardinality
          (let [[n r c] xs] (.getOWLObjectExactCardinality f (int n) (obj-prop-expr ctx r) (class-expr ctx c)))

          :owl/oneOf
          (.getOWLObjectOneOf f ^java.util.Set (set (map #(as-ind ctx %) xs)))

          ;; Data restrictions:
          :owl/dataSomeValuesFrom
          (let [[dp dr] xs] (.getOWLDataSomeValuesFrom f (as-dprop ctx dp) (data-range ctx dr)))

          :owl/dataAllValuesFrom
          (let [[dp dr] xs] (.getOWLDataAllValuesFrom f (as-dprop ctx dp) (data-range ctx dr)))

          :owl/dataHasValue
          (let [[dp lit] xs] (.getOWLDataHasValue f (as-dprop ctx dp) (as-literal ctx lit)))

          :owl/dataMinCardinality
          (let [[n dp] xs] (.getOWLDataMinCardinality f (int n) (as-dprop ctx dp)))

          :owl/dataMaxCardinality
          (let [[n dp] xs] (.getOWLDataMaxCardinality f (int n) (as-dprop ctx dp)))

          :owl/dataExactCardinality
          (let [[n dp] xs] (.getOWLDataExactCardinality f (int n) (as-dprop ctx dp)))

          :owl/dataMinQualifiedCardinality
          (let [[n dp dr] xs] (.getOWLDataMinCardinality f (int n) (as-dprop ctx dp) (data-range ctx dr)))

          :owl/dataMaxQualifiedCardinality
          (let [[n dp dr] xs] (.getOWLDataMaxCardinality f (int n) (as-dprop ctx dp) (data-range ctx dr)))

          :owl/dataQualifiedCardinality
          (let [[n dp dr] xs] (.getOWLDataExactCardinality f (int n) (as-dprop ctx dp) (data-range ctx dr)))

          (throw (ex-info "Unknown class expression op" {:op op :form form}))))
      :else (throw (ex-info "Unsupported class expression" {:value form})))))

;; --- Axiom builders (multimethod) ----------------------------------------

(defmulti form->axiom
  "Build an OWLAxiom from EDN or return axiom unchanged."
  {:tag OWLAxiom}
  (fn [_ctx form]
    (cond
      (instance? OWLAxiom form)                    ::ax
      (and (vector? form) (keyword? (first form))) (first form)
      (and (vector? form) (= 3 (count form)))      ::triple
      :else                                        ::unsupported)))

(defmethod form->axiom ::ax [_ctx ax] ax)

;; Operator-first axioms:

(defmethod form->axiom :rdfs/subClassOf [ctx [_ sub sup]]
  (.getOWLSubClassOfAxiom *df* (class-expr ctx sub) (class-expr ctx sup)))

(defmethod form->axiom :owl/equivalentClass [ctx [_ & cs]]
  (.getOWLEquivalentClassesAxiom *df* ^java.util.Set (set (map #(class-expr ctx %) cs))))

(defmethod form->axiom :owl/disjointWith [ctx [_ a b]]
  (.getOWLDisjointClassesAxiom *df* ^java.util.Set (set [(class-expr ctx a) (class-expr ctx b)])))

(defmethod form->axiom :owl/DisjointClasses [ctx [_ & cs]]
  (.getOWLDisjointClassesAxiom *df* ^java.util.Set (set (map #(class-expr ctx %) cs))))

(defmethod form->axiom :owl/disjointUnionOf [ctx [_ head & parts]]
  (.getOWLDisjointUnionAxiom *df* (as-class ctx head) ^java.util.Set (set (map #(class-expr ctx %) parts))))

(defmethod form->axiom :rdf/type [ctx [_ i c]]
  (.getOWLClassAssertionAxiom *df* (class-expr ctx c) (as-ind ctx i)))

(defmethod form->axiom :owl/sameAs [ctx [_ & inds]]
  (.getOWLSameIndividualAxiom *df* ^java.util.Set (set (map #(as-ind ctx %) inds))))

(defmethod form->axiom :owl/differentFrom [ctx [_ & inds]]
  (.getOWLDifferentIndividualsAxiom *df* ^java.util.Set (set (map #(as-ind ctx %) inds))))

(defmethod form->axiom :rdfs/subPropertyOf [ctx [_ p q]]
  (let [kind-p (ensure-prop-kind ctx "subPropertyOf" p)
        kind-q (ensure-prop-kind ctx "subPropertyOf" q)]
    (when (not= kind-p kind-q)
      (throw (ex-info "subPropertyOf requires properties of the same kind"
                      {:sub-property p :super-property q :sub-kind kind-p :super-kind kind-q})))
    (case kind-p
      :data   (.getOWLSubDataPropertyOfAxiom   *df* (as-dprop   ctx p) (as-dprop   ctx q))
      :object (.getOWLSubObjectPropertyOfAxiom *df* (as-objprop ctx p) (as-objprop ctx q)))))

(defmethod form->axiom :owl/ObjectPropertyDomain [ctx [_ p c]]
  (.getOWLObjectPropertyDomainAxiom *df* (as-objprop ctx p) (class-expr ctx c)))

(defmethod form->axiom :owl/ObjectPropertyRange [ctx [_ p c]]
  (.getOWLObjectPropertyRangeAxiom *df* (as-objprop ctx p) (class-expr ctx c)))

(defmethod form->axiom :owl/DataPropertyDomain [ctx [_ p c]]
  (.getOWLDataPropertyDomainAxiom *df* (as-dprop ctx p) (class-expr ctx c)))

(defmethod form->axiom :owl/DataPropertyRange [ctx [_ p dr]]
  (.getOWLDataPropertyRangeAxiom *df* (as-dprop ctx p) (data-range ctx dr)))

(defmethod form->axiom :rdfs/domain [ctx [_ p filler]]
  (case (ensure-prop-kind ctx :rdfs/domain p)
    :object (.getOWLObjectPropertyDomainAxiom *df* (as-objprop ctx p) (class-expr ctx filler))
    :data   (.getOWLDataPropertyDomainAxiom *df* (as-dprop ctx p) (class-expr ctx filler))))

(defmethod form->axiom :rdfs/range [ctx [_ p filler]]
  (case (ensure-prop-kind ctx :rdfs/range p)
    :object (.getOWLObjectPropertyRangeAxiom *df* (as-objprop ctx p) (class-expr ctx filler))
    :data   (.getOWLDataPropertyRangeAxiom *df* (as-dprop ctx p) (data-range ctx filler))))

(defmethod form->axiom :owl/inverseOf [ctx [_ p q]]
  (.getOWLInverseObjectPropertiesAxiom *df* (as-objprop ctx p) (as-objprop ctx q)))

(defmethod form->axiom :owl/TransitiveProperty [ctx [_ p]]
  (.getOWLTransitiveObjectPropertyAxiom *df* (as-objprop ctx p)))

(defmethod form->axiom :owl/SymmetricProperty [ctx [_ p]]
  (.getOWLSymmetricObjectPropertyAxiom *df* (as-objprop ctx p)))

(defmethod form->axiom :owl/ReflexiveProperty [ctx [_ p]]
  (.getOWLReflexiveObjectPropertyAxiom *df* (as-objprop ctx p)))

(defmethod form->axiom :owl/IrreflexiveProperty [ctx [_ p]]
  (.getOWLIrreflexiveObjectPropertyAxiom *df* (as-objprop ctx p)))

(defmethod form->axiom :owl/AsymmetricProperty [ctx [_ p]]
  (.getOWLAsymmetricObjectPropertyAxiom *df* (as-objprop ctx p)))

(defmethod form->axiom :owl/FunctionalProperty [ctx [_ p]]
  (case (ensure-prop-kind ctx "FunctionalProperty" p)
    :data   (.getOWLFunctionalDataPropertyAxiom   *df* (as-dprop   ctx p))
    :object (.getOWLFunctionalObjectPropertyAxiom *df* (as-objprop ctx p))))

(defmethod form->axiom :owl/InverseFunctionalProperty [ctx [_ p]]
  (.getOWLInverseFunctionalObjectPropertyAxiom *df* (as-objprop ctx p)))

(defmethod form->axiom :owl/HasKey [ctx [_ c & props]]
  (let [objs ^java.util.Set (set (keep #(when (= :object (property-kind ctx (kw->iri ctx %))) (as-objprop ctx %)) props))
        dprs ^java.util.Set (set (keep #(when (= :data (property-kind ctx (kw->iri ctx %))) (as-dprop ctx %)) props))]
    (.getOWLHasKeyAxiom *df* (class-expr ctx c) objs dprs)))

(defmethod form->axiom :owl/propertyChainAxiom
  [ctx [_ super chain]]
  (let [[tag & ps] chain]
    (when-not (= tag :chain)
      (throw (ex-info "propertyChainAxiom requires [:chain ...] form" {:chain chain})))
    (.getOWLSubPropertyChainOfAxiom *df*
                                    ^java.util.List (vec (map #(obj-prop-expr ctx %) ps))
                                    (as-objprop ctx super))))

(defmethod form->axiom :owl/propertyDisjointWith [ctx [_ & ps]]
  (when (< (count ps) 2)
    (throw (ex-info "propertyDisjointWith requires at least two properties" {:properties ps})))
  (let [kinds    (map #(ensure-prop-kind ctx "propertyDisjointWith" %) ps)
        kind-set (set kinds)]
    (cond
      (= kind-set #{:object})
      (.getOWLDisjointObjectPropertiesAxiom *df* ^java.util.Set (set (map #(as-objprop ctx %) ps)))

      (= kind-set #{:data})
      (.getOWLDisjointDataPropertiesAxiom *df* ^java.util.Set (set (map #(as-dprop ctx %) ps)))

      :else
      (throw (ex-info "Mixed property kinds in propertyDisjointWith"
                      {:properties ps :kinds kinds})))))

;; --- Annotation assertion (explicit operator, if user wants) -------------
(defmethod form->axiom :owl/AnnotationAssertion [ctx [_ p s v]]
  (let [f    *df*
        subj (kw->iri ctx s)
        val  (if (or (keyword? v) (string? v) (instance? IRI v))
               (kw->iri ctx v)
               (as-literal ctx v))
        ann  (.getOWLAnnotation f (as-annprop ctx p) val)]
    (.getOWLAnnotationAssertionAxiom f subj ann)))

;; --- Triple sugar: [s p o] ----------------------------------------------

(defmethod form->axiom ::triple [ctx [s p o]]
  (let [^OWLDataFactory f *df*]
    (cond
      (= p :rdf/type)
      (form->axiom ctx [:rdf/type s o])

      :else
      (let [kind (property-kind ctx (kw->iri ctx p))]
        (case kind
          :annotation
          (let [val (if (or (keyword? o) (string? o) (instance? IRI o))
                      (kw->iri ctx o)
                      (as-literal ctx o))
                ann (.getOWLAnnotation f (as-annprop ctx p) val)]
            (.getOWLAnnotationAssertionAxiom f (kw->iri ctx s) ann))

          :data   (.getOWLDataPropertyAssertionAxiom   f (as-dprop   ctx p) (as-ind ctx s) ^org.semanticweb.owlapi.model.OWLLiteral (as-literal ctx o))
          :object (.getOWLObjectPropertyAssertionAxiom f (as-objprop ctx p) (as-ind ctx s) (as-ind ctx o))

          ;; Fallback heuristic:
          (if (or (keyword? o) (string? o) (instance? IRI o))
            (.getOWLObjectPropertyAssertionAxiom f (as-objprop ctx p) (as-ind ctx s) (as-ind ctx o))
            (.getOWLDataPropertyAssertionAxiom   f (as-dprop   ctx p) (as-ind ctx s) ^org.semanticweb.owlapi.model.OWLLiteral (as-literal ctx o))))))))

(defmethod form->axiom ::unsupported [_ctx form]
  (throw (ex-info "Unsupported axiom/form" {:form form})))

(defmethod form->axiom :default [_ctx form]
  (throw (ex-info "Unknown or unsupported operator" {:form form :op (when (vector? form) (first form))})))

;; --- OWLAxiom -> EDN (inverse DSL) ---------------------------------------

(defn- iri->kw
  "Convert an IRI to a keyword using ctx :prefixes. Fallback to string if no prefix matches."
  [{:keys [prefixes]} ^IRI iri]
  (let [s (str iri)
        [pref base]
        (->> prefixes
             (keep (fn [[p b]]
                     (when b
                       (let [cands (cond
                                     (str/ends-with? b ":") [b (str (subs b 0 (dec (count b))) "/")]
                                     (str/ends-with? b "#") [b (str (subs b 0 (dec (count b))) "/")]
                                     :else                  [b])
                             match (some #(when (.startsWith s %) %) cands)]
                         (when match [p match])))))
             (sort-by (comp count second) >)
             first)]
    (if base (keyword pref (subs s (count base))) s)))

(def ^:private integer-datatypes
  #{:xsd/integer :xsd/int :xsd/long :xsd/short :xsd/byte
    :xsd/nonNegativeInteger :xsd/nonPositiveInteger
    :xsd/positiveInteger :xsd/negativeInteger
    :xsd/unsignedInt :xsd/unsignedLong :xsd/unsignedShort :xsd/unsignedByte})

(def ^:private decimal-datatypes #{:xsd/decimal})

(def ^:private float-datatypes #{:xsd/double :xsd/float})

(defn- literal->edn
  [ctx ^org.semanticweb.owlapi.model.OWLLiteral lit]
  (let [lex (.getLiteral lit)]
    (cond
      (.hasLang lit) {:rdf/value lex :rdf/language (.getLang lit)}
      :else
      (let [dt-iri (.getIRI (.getDatatype lit))
            dt     (when dt-iri (iri->kw ctx dt-iri))]
        (cond
          (nil? dt)              lex
          (= dt :xsd/string)     lex
          (= dt :xsd/boolean)    (Boolean/valueOf lex)
          (integer-datatypes dt) (bigint lex)
          (decimal-datatypes dt) (bigdec lex)
          (float-datatypes dt)   (Double/parseDouble lex)
          :else                  {:rdf/value lex :rdf/type dt})))))

(declare class-expr->form data-range->form)

(defn- data-range->form
  [ctx ^org.semanticweb.owlapi.model.OWLDataRange dr]
  (cond
    (instance? org.semanticweb.owlapi.model.OWLDatatype dr)
    (iri->kw ctx (.getIRI ^org.semanticweb.owlapi.model.OWLDatatype dr))

    (instance? org.semanticweb.owlapi.model.OWLDataOneOf dr)
    (let [vals (map #(literal->edn ctx %) (.getValues ^org.semanticweb.owlapi.model.OWLDataOneOf dr))]
      [:owl/dataOneOf (vec vals)])

    (instance? org.semanticweb.owlapi.model.OWLDatatypeRestriction dr)
    (let [r      ^org.semanticweb.owlapi.model.OWLDatatypeRestriction dr
          dt     (iri->kw ctx (.getIRI (.getDatatype r)))
          frs    (.getFacetRestrictions r)
          facets (map (fn [^org.semanticweb.owlapi.model.OWLFacetRestriction fr]
                        [(keyword "xsd" (str (.getShortForm (.getFacet fr)))) (literal->edn ctx (.getFacetValue fr))])
                      frs)]
      [:owl/withRestrictions dt (vec facets)])

    (instance? org.semanticweb.owlapi.model.OWLDataIntersectionOf dr)
    (let [ops (map #(data-range->form ctx %) (.getOperands ^org.semanticweb.owlapi.model.OWLDataIntersectionOf dr))]
      [:owl/dataIntersectionOf (vec ops)])

    (instance? org.semanticweb.owlapi.model.OWLDataUnionOf dr)
    (let [ops (map #(data-range->form ctx %) (.getOperands ^org.semanticweb.owlapi.model.OWLDataUnionOf dr))]
      [:owl/dataUnionOf (vec ops)])

    :else (str dr)))

(defn- class-expr->form
  [ctx ^OWLClassExpression ce]
  (letfn [(prop-expr->form [^OWLObjectPropertyExpression pe]
            (obj-prop-expr->form ctx pe))]
    (if-not (.isAnonymous ce)
      (iri->kw ctx (.getIRI (.asOWLClass ce)))
      (cond
        (instance? org.semanticweb.owlapi.model.OWLObjectIntersectionOf ce)
        (let [ops (map #(class-expr->form ctx %) (.getOperands ^org.semanticweb.owlapi.model.OWLObjectIntersectionOf ce))]
          {:rdf/type           :owl/Class
           :owl/intersectionOf (vec ops)})

        (instance? org.semanticweb.owlapi.model.OWLObjectUnionOf ce)
        (let [ops (map #(class-expr->form ctx %) (.getOperands ^org.semanticweb.owlapi.model.OWLObjectUnionOf ce))]
          {:rdf/type    :owl/Class
           :owl/unionOf (vec ops)})

        (instance? org.semanticweb.owlapi.model.OWLObjectComplementOf ce)
        (let [op (.getOperand ^org.semanticweb.owlapi.model.OWLObjectComplementOf ce)]
          {:rdf/type         :owl/Class
           :owl/complementOf (class-expr->form ctx op)})

        (instance? org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom ce)
        (let [pe (.getProperty ^org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom ce)
              r  (prop-expr->form pe)
              f  (class-expr->form ctx (.getFiller ^org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom ce))]
          (cond-> {:rdf/type :owl/Restriction
                   :owl/someValuesFrom f}
            r (assoc :owl/onProperty r)))

        (instance? org.semanticweb.owlapi.model.OWLObjectAllValuesFrom ce)
        (let [pe (.getProperty ^org.semanticweb.owlapi.model.OWLObjectAllValuesFrom ce)
              r  (prop-expr->form pe)
              f  (class-expr->form ctx (.getFiller ^org.semanticweb.owlapi.model.OWLObjectAllValuesFrom ce))]
          (cond-> {:rdf/type :owl/Restriction
                   :owl/allValuesFrom f}
            r (assoc :owl/onProperty r)))

        (instance? org.semanticweb.owlapi.model.OWLObjectHasValue ce)
        (let [pe  (.getProperty ^org.semanticweb.owlapi.model.OWLObjectHasValue ce)
              r   (prop-expr->form pe)
              ind ^OWLIndividual (.getValue ^org.semanticweb.owlapi.model.OWLObjectHasValue ce)
              v   (iri->kw ctx (.getIRI (.asOWLNamedIndividual ind)))]
          (cond-> {:rdf/type :owl/Restriction
                   :owl/hasValue v}
            r (assoc :owl/onProperty r)))

        (instance? org.semanticweb.owlapi.model.OWLObjectHasSelf ce)
        (let [pe (.getProperty ^org.semanticweb.owlapi.model.OWLObjectHasSelf ce)
              r  (prop-expr->form pe)]
          (cond-> {:rdf/type :owl/Restriction
                   :owl/hasSelf true}
            r (assoc :owl/onProperty r)))

        (instance? org.semanticweb.owlapi.model.OWLObjectMinCardinality ce)
        (let [x    ^org.semanticweb.owlapi.model.OWLObjectMinCardinality ce
              r    (prop-expr->form (.getProperty x))
              base {:rdf/type           :owl/Restriction
                    :owl/minCardinality (.getCardinality x)
                    :owl/onProperty     r}]
          (cond-> base
            (.isQualified x) (assoc :owl/onClass (class-expr->form ctx (.getFiller x)))))

        (instance? org.semanticweb.owlapi.model.OWLObjectMaxCardinality ce)
        (let [x    ^org.semanticweb.owlapi.model.OWLObjectMaxCardinality ce
              r    (prop-expr->form (.getProperty x))
              base {:rdf/type           :owl/Restriction
                    :owl/maxCardinality (.getCardinality x)
                    :owl/onProperty     r}]
          (cond-> base
            (.isQualified x) (assoc :owl/onClass (class-expr->form ctx (.getFiller x)))))

        (instance? org.semanticweb.owlapi.model.OWLObjectExactCardinality ce)
        (let [x    ^org.semanticweb.owlapi.model.OWLObjectExactCardinality ce
              r    (prop-expr->form (.getProperty x))
              key  (if (.isQualified x) :owl/qualifiedCardinality :owl/cardinality)
              base {:rdf/type       :owl/Restriction
                    key             (.getCardinality x)
                    :owl/onProperty r}]
          (cond-> base
            (.isQualified x) (assoc :owl/onClass (class-expr->form ctx (.getFiller x)))))

        (instance? org.semanticweb.owlapi.model.OWLObjectOneOf ce)
        (let [inds (map (fn [^OWLIndividual i]
                          (iri->kw ctx (.getIRI (.asOWLNamedIndividual i))))
                        (.getIndividuals ^org.semanticweb.owlapi.model.OWLObjectOneOf ce))]
          {:rdf/type  :owl/Class
           :owl/oneOf (vec inds)})

        (instance? org.semanticweb.owlapi.model.OWLDataSomeValuesFrom ce)
        (let [x  ^org.semanticweb.owlapi.model.OWLDataSomeValuesFrom ce
              dp (.asOWLDataProperty (.getProperty x))
              f  (data-range->form ctx (.getFiller x))]
          {:rdf/type           :owl/Restriction
           :owl/onProperty     (iri->kw ctx (.getIRI dp))
           :owl/someValuesFrom f})

        (instance? org.semanticweb.owlapi.model.OWLDataAllValuesFrom ce)
        (let [x  ^org.semanticweb.owlapi.model.OWLDataAllValuesFrom ce
              dp (.asOWLDataProperty (.getProperty x))
              f  (data-range->form ctx (.getFiller x))]
          {:rdf/type          :owl/Restriction
           :owl/onProperty    (iri->kw ctx (.getIRI dp))
           :owl/allValuesFrom f})

        (instance? org.semanticweb.owlapi.model.OWLDataHasValue ce)
        (let [x  ^org.semanticweb.owlapi.model.OWLDataHasValue ce
              dp (.asOWLDataProperty (.getProperty x))]
          {:rdf/type       :owl/Restriction
           :owl/onProperty (iri->kw ctx (.getIRI dp))
           :owl/hasValue   (literal->edn ctx (.getValue x))})

        (instance? org.semanticweb.owlapi.model.OWLDataMinCardinality ce)
        (let [x    ^org.semanticweb.owlapi.model.OWLDataMinCardinality ce
              dp   (.asOWLDataProperty (.getProperty x))
              base {:rdf/type           :owl/Restriction
                    :owl/minCardinality (.getCardinality x)
                    :owl/onProperty     (iri->kw ctx (.getIRI dp))}]
          (cond-> base
            (.isQualified x) (assoc :owl/onDataRange (data-range->form ctx (.getFiller x)))))

        (instance? org.semanticweb.owlapi.model.OWLDataMaxCardinality ce)
        (let [x    ^org.semanticweb.owlapi.model.OWLDataMaxCardinality ce
              dp   (.asOWLDataProperty (.getProperty x))
              base {:rdf/type           :owl/Restriction
                    :owl/maxCardinality (.getCardinality x)
                    :owl/onProperty     (iri->kw ctx (.getIRI dp))}]
          (cond-> base
            (.isQualified x) (assoc :owl/onDataRange (data-range->form ctx (.getFiller x)))))

        (instance? org.semanticweb.owlapi.model.OWLDataExactCardinality ce)
        (let [x    ^org.semanticweb.owlapi.model.OWLDataExactCardinality ce
              dp   (.asOWLDataProperty (.getProperty x))
              key  (if (.isQualified x) :owl/qualifiedCardinality :owl/cardinality)
              base {:rdf/type       :owl/Restriction
                    key             (.getCardinality x)
                    :owl/onProperty (iri->kw ctx (.getIRI dp))}]
          (cond-> base
            (.isQualified x) (assoc :owl/onDataRange (data-range->form ctx (.getFiller x)))))

        :else (str ce)))))

(defn axiom->form
  "Convert an OWLAxiom to EDN DSL form, using ctx :prefixes for IRI → keyword."
  [ctx ^OWLAxiom ax]
  (let [t (.getAxiomType ax)]
    (cond
      (= t AxiomType/SUBCLASS_OF)
      (let [x ^org.semanticweb.owlapi.model.OWLSubClassOfAxiom ax]
        [:rdfs/subClassOf (class-expr->form ctx (.getSubClass x)) (class-expr->form ctx (.getSuperClass x))])

      (= t AxiomType/EQUIVALENT_CLASSES)
      (let [xs (map #(class-expr->form ctx %) (.getClassExpressionsAsList ^OWLEquivalentClassesAxiom ax))]
        [:owl/equivalentClass (vec xs)])

      (= t AxiomType/DISJOINT_CLASSES)
      (let [forms (map #(class-expr->form ctx %)
                       (.getClassExpressionsAsList ^org.semanticweb.owlapi.model.OWLDisjointClassesAxiom ax))]
        (if (= 2 (count forms))
          [:owl/disjointWith (vec forms)]
          [:owl/DisjointClasses (vec forms)]))

      (= t AxiomType/DISJOINT_UNION)
      (let [x   ^org.semanticweb.owlapi.model.OWLDisjointUnionAxiom ax
            ops (map #(class-expr->form ctx %) (.getClassExpressions x))]
        [:owl/disjointUnionOf (iri->kw ctx (.getIRI (.getOWLClass x))) (vec ops)])

      (= t AxiomType/CLASS_ASSERTION)
      (let [x   ^OWLClassAssertionAxiom ax
            i   ^OWLIndividual (.getIndividual x)
            ind (iri->kw ctx (.getIRI (.asOWLNamedIndividual i)))]
        [:rdf/type ind (class-expr->form ctx (.getClassExpression x))])

      (= t AxiomType/SAME_INDIVIDUAL)
      (let [inds (map (fn [^OWLIndividual i]
                        (iri->kw ctx (.getIRI (.asOWLNamedIndividual i))))
                      (.getIndividuals ^org.semanticweb.owlapi.model.OWLSameIndividualAxiom ax))]
        [:owl/sameAs (vec inds)])

      (= t AxiomType/DIFFERENT_INDIVIDUALS)
      (let [inds (map (fn [^OWLIndividual i]
                        (iri->kw ctx (.getIRI (.asOWLNamedIndividual i))))
                      (.getIndividuals ^org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom ax))]
        [:owl/differentFrom (vec inds)])

      (= t AxiomType/SUB_OBJECT_PROPERTY)
      (let [x    ^org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom ax
            spe  ^OWLObjectPropertyExpression (.getSubProperty x)
            nsub ^OWLObjectProperty (.getNamedProperty spe)
            sub  (iri->kw ctx (.getIRI nsub))
            spe2 ^OWLObjectPropertyExpression (.getSuperProperty x)
            nsup ^OWLObjectProperty (.getNamedProperty spe2)
            sup  (iri->kw ctx (.getIRI nsup))]
        [:rdfs/subPropertyOf sub sup])

      (= t AxiomType/SUB_DATA_PROPERTY)
      (let [x    ^org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom ax
            dpe  ^OWLDataPropertyExpression (.getSubProperty x)
            dp   (.asOWLDataProperty dpe)
            sub  (iri->kw ctx (.getIRI dp))
            dpe2 ^OWLDataPropertyExpression (.getSuperProperty x)
            dp2  (.asOWLDataProperty dpe2)
            sup  (iri->kw ctx (.getIRI dp2))]
        [:rdfs/subPropertyOf sub sup])

      (= t AxiomType/INVERSE_OBJECT_PROPERTIES)
      (let [x  ^org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom ax
            p1 ^OWLObjectPropertyExpression (.getFirstProperty x)
            p2 ^OWLObjectPropertyExpression (.getSecondProperty x)
            n1 ^OWLObjectProperty (.getNamedProperty p1)
            n2 ^OWLObjectProperty (.getNamedProperty p2)]
        [:owl/inverseOf (iri->kw ctx (.getIRI n1)) (iri->kw ctx (.getIRI n2))])

      (= t AxiomType/TRANSITIVE_OBJECT_PROPERTY)
      (let [ppe ^OWLObjectPropertyExpression (.getProperty ^org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom ax)
            np  ^OWLObjectProperty (.getNamedProperty ppe)
            p   (iri->kw ctx (.getIRI np))]
        [:owl/TransitiveProperty p])

      (= t AxiomType/SYMMETRIC_OBJECT_PROPERTY)
      (let [ppe ^OWLObjectPropertyExpression (.getProperty ^org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom ax)
            np  ^OWLObjectProperty (.getNamedProperty ppe)
            p   (iri->kw ctx (.getIRI np))]
        [:owl/SymmetricProperty p])

      (= t AxiomType/REFLEXIVE_OBJECT_PROPERTY)
      (let [ppe ^OWLObjectPropertyExpression (.getProperty ^org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom ax)
            np  ^OWLObjectProperty (.getNamedProperty ppe)
            p   (iri->kw ctx (.getIRI np))]
        [:owl/ReflexiveProperty p])

      (= t AxiomType/IRREFLEXIVE_OBJECT_PROPERTY)
      (let [ppe ^OWLObjectPropertyExpression (.getProperty ^org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom ax)
            np  ^OWLObjectProperty (.getNamedProperty ppe)
            p   (iri->kw ctx (.getIRI np))]
        [:owl/IrreflexiveProperty p])

      (= t AxiomType/ASYMMETRIC_OBJECT_PROPERTY)
      (let [ppe ^OWLObjectPropertyExpression (.getProperty ^org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom ax)
            np  ^OWLObjectProperty (.getNamedProperty ppe)
            p   (iri->kw ctx (.getIRI np))]
        [:owl/AsymmetricProperty p])

      (= t AxiomType/FUNCTIONAL_OBJECT_PROPERTY)
      (let [ppe ^OWLObjectPropertyExpression (.getProperty ^org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom ax)
            np  ^OWLObjectProperty (.getNamedProperty ppe)
            p   (iri->kw ctx (.getIRI np))]
        [:owl/FunctionalProperty p])

      (= t AxiomType/FUNCTIONAL_DATA_PROPERTY)
      (let [dpe ^OWLDataPropertyExpression (.getProperty ^org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom ax)
            dp  (.asOWLDataProperty dpe)
            p   (iri->kw ctx (.getIRI dp))]
        [:owl/FunctionalProperty p])

      (= t AxiomType/INVERSE_FUNCTIONAL_OBJECT_PROPERTY)
      (let [ppe ^OWLObjectPropertyExpression (.getProperty ^org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom ax)
            np  ^OWLObjectProperty (.getNamedProperty ppe)
            p   (iri->kw ctx (.getIRI np))]
        [:owl/InverseFunctionalProperty p])

      (= t AxiomType/HAS_KEY)
      (let [x    ^org.semanticweb.owlapi.model.OWLHasKeyAxiom ax
            c    (class-expr->form ctx (.getClassExpression x))
            objs (map #(iri->kw ctx (.getIRI (.getNamedProperty ^OWLObjectPropertyExpression %))) (.getObjectPropertyExpressions x))
            dps  (map #(iri->kw ctx (.getIRI (.asOWLDataProperty ^OWLDataPropertyExpression %))) (.getDataPropertyExpressions x))]
        (into [:owl/HasKey c] (concat objs dps)))

      (= t AxiomType/SUB_PROPERTY_CHAIN_OF)
      (let [x     ^OWLSubPropertyChainOfAxiom ax
            spe   ^OWLObjectPropertyExpression (.getSuperProperty x)
            sup   (iri->kw ctx (.getIRI (.getNamedProperty spe)))
            chain (map #(obj-prop-expr->form ctx %)
                       (.getPropertyChain x))]
        [:owl/propertyChainAxiom sup (into [:chain] chain)])

      (= t AxiomType/OBJECT_PROPERTY_DOMAIN)
      (let [x    ^OWLObjectPropertyDomainAxiom ax
            prop (obj-prop-expr->form ctx (.getProperty x))
            dom  (class-expr->form ctx (.getDomain x))]
        [:rdfs/domain prop dom])

      (= t AxiomType/OBJECT_PROPERTY_RANGE)
      (let [x    ^org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom ax
            prop (obj-prop-expr->form ctx (.getProperty x))
            ran  (class-expr->form ctx (.getRange x))]
        [:rdfs/range prop ran])

      (= t AxiomType/DATA_PROPERTY_DOMAIN)
      (let [x   ^OWLDataPropertyDomainAxiom ax
            dpe ^OWLDataPropertyExpression (.getProperty x)
            dp  ^OWLDataProperty (.asOWLDataProperty dpe)
            dom (class-expr->form ctx (.getDomain x))]
        [:rdfs/domain (iri->kw ctx (.getIRI dp)) dom])

      (= t AxiomType/DATA_PROPERTY_RANGE)
      (let [x   ^OWLDataPropertyRangeAxiom ax
            dpe ^OWLDataPropertyExpression (.getProperty x)
            dp  ^OWLDataProperty (.asOWLDataProperty dpe)
            ran (data-range->form ctx (.getRange x))]
        [:rdfs/range (iri->kw ctx (.getIRI dp)) ran])

      (= t AxiomType/DISJOINT_OBJECT_PROPERTIES)
      (let [x  ^org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom ax
            ps (.getProperties x)]
        (if (= 2 (count ps))
          (let [[p q] (map #(iri->kw ctx (.getIRI (.getNamedProperty ^OWLObjectPropertyExpression %))) ps)] [:owl/propertyDisjointWith p q])
          (into [:owl/propertyDisjointWith] (map #(iri->kw ctx (.getIRI (.getNamedProperty ^OWLObjectPropertyExpression %))) ps))))

      (= t AxiomType/DISJOINT_DATA_PROPERTIES)
      (let [x  ^org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom ax
            ps (.getProperties x)]
        (if (= 2 (count ps))
          (let [[p q] (map #(iri->kw ctx (.getIRI (.asOWLDataProperty ^OWLDataPropertyExpression %))) ps)] [:owl/propertyDisjointWith p q])
          (into [:owl/propertyDisjointWith] (map #(iri->kw ctx (.getIRI (.asOWLDataProperty ^OWLDataPropertyExpression %))) ps))))

      (= t AxiomType/OBJECT_PROPERTY_ASSERTION)
      (let [x        ^OWLObjectPropertyAssertionAxiom ax
            subj     ^OWLIndividual (.getSubject x)
            obj      ^OWLIndividual (.getObject x)
            pe       ^OWLObjectPropertyExpression (.getProperty x)
            ind-form (fn [^OWLIndividual ind]
                       (if (.isAnonymous ind)
                         {:db/id (anon-id (.asOWLAnonymousIndividual ind))}
                         (iri->kw ctx (.getIRI (.asOWLNamedIndividual ind)))))]
        (if (.isAnonymous pe)
          (let [inv ^OWLObjectInverseOf pe
                np  ^OWLObjectProperty
                (.getNamedProperty (.getInverse inv))]
            [(ind-form obj)
             (iri->kw ctx (.getIRI np))
             (ind-form subj)])
          (let [np ^OWLObjectProperty (.getNamedProperty pe)]
            [(ind-form subj)
             (iri->kw ctx (.getIRI np))
             (ind-form obj)])))

      (= t AxiomType/DATA_PROPERTY_ASSERTION)
      (let [x   ^OWLDataPropertyAssertionAxiom ax
            s   ^OWLIndividual (.getSubject x)
            dpe ^OWLDataPropertyExpression (.getProperty x)
            dp  (.asOWLDataProperty dpe)]
        [(iri->kw ctx (.getIRI (.asOWLNamedIndividual s)))
         (iri->kw ctx (.getIRI dp))
         (literal->edn ctx (.getObject x))])

      (= t AxiomType/ANNOTATION_ASSERTION)
      (let [x    ^OWLAnnotationAssertionAxiom ax
            subj (let [s (.getSubject x)]
                   (cond
                     (instance? IRI s) (iri->kw ctx ^IRI s)
                     (instance? org.semanticweb.owlapi.model.OWLAnonymousIndividual s)
                     {:db/id (anon-id ^org.semanticweb.owlapi.model.OWLAnonymousIndividual s)}
                     :else             (str s)))
            val  (.getValue x)
            obj  (cond
                   (instance? IRI val) (iri->kw ctx ^IRI val)
                   (instance? org.semanticweb.owlapi.model.OWLAnonymousIndividual val)
                   {:db/id (anon-id ^org.semanticweb.owlapi.model.OWLAnonymousIndividual val)}
                   :else               (literal->edn ctx ^org.semanticweb.owlapi.model.OWLLiteral val))
            ap   ^OWLAnnotationProperty (.getProperty x)]
        [:owl/AnnotationAssertion (iri->kw ctx (.getIRI ap)) subj obj])

      :else (str ax))))

;; --- Rendering & normalization (uses your existing renderers) -------------

(defn- render-justification*
  [^OWLOntology ontology ^java.util.Set just render]
  (let [want (if (sequential? render) (set render) #{render})]
    (into {}
          (cond-> []
            (contains? want :manchester)
            (conj [:manchester (render-justification just)])
            (contains? want :functional)
            (conj [:functional (render-justification-functional ontology just)])))))

(defn- normalize-explanations
  [{:keys [manager ^OWLOntology ontology] :as ctx} jsets render]
  (->> jsets
       (map (fn [^java.util.Set j]
              (let [axioms (set (iterator-seq (.iterator j)))
                    byf    (reduce (fn [m ^OWLAxiom a]
                                     (update m (axiom->source-file manager a) (fnil conj []) a))
                                   (sorted-map)
                                   axioms)]
                {:axioms     axioms
                 :by-file    byf
                 :render     (render-justification* ontology j render)
                 :axioms-edn (->> axioms (map #(axiom->form ctx %)) (sort-by pr-str) vec)})))
       vec))

;; --- Public API -----------------------------------------------------------

(defn entails?
  "Return true if the ontology in `ctx` entails the given axiom or DSL form.

  - ctx: {:manager OWLOntologyManager :ontology OWLOntology :prefixes {...}}
  - form-or-ax: OWLAxiom or EDN DSL form (e.g., [:rdfs/subClassOf :ex/A :ex/B])
  - opts: {:reasoner :pellet|:hermit|:jfact|:structural|... or ^OWLReasoner
           :reasoner-factory OWLReasonerFactory}

  Returns boolean. Reuses supplied OWLReasoner instances; otherwise, creates
  a fresh reasoner and disposes it."
  ([ctx form-or-ax] (entails? ctx form-or-ax {}))
  ([{:keys [^OWLOntology ontology] :as ctx} form-or-ax opts]
   (let [^OWLAxiom ax   (if (instance? OWLAxiom form-or-ax) form-or-ax (form->axiom ctx form-or-ax))
         {:keys [reasoner dispose?]} (ensure-reasoner ontology opts)
         ^OWLReasoner reasoner* reasoner]
     (try
       (and (.isConsistent reasoner*) (.isEntailed reasoner* ax))
       (finally
         (when dispose?
           (.dispose reasoner*)))))))

(defn explain
  "Explain an entailment or report inconsistency.

  - ctx: {:manager OWLOntologyManager :ontology OWLOntology :prefixes {...}}
  - form-or-ax: OWLAxiom or EDN DSL form
  - opts: {:max 5 :render :manchester|:functional|[:manchester :functional]
           :reasoner :pellet|:hermit|... or ^OWLReasoner
           :reasoner-factory OWLReasonerFactory}

  Returns map {:status :ok|:not-entailed|:inconsistent
               :axiom ^OWLAxiom
               :explanations [{:axioms #{^OWLAxiom ...}
                               :by-file (sorted-map path [^OWLAxiom ...])
                               :render {:manchester str :functional str}}]
               :notes [str ...]}"
  ([ctx form-or-ax] (explain ctx form-or-ax {}))
  ([{:keys [^OWLOntology ontology] :as ctx}
    form-or-ax
    {:keys [max render reasoner reasoner-factory]
     :or   {max 5 render :manchester}
     :as   opts}]
   (let [^OWLAxiom ax   (if (instance? OWLAxiom form-or-ax) form-or-ax (form->axiom ctx form-or-ax))
         reasoner-sel   reasoner
         {:keys [reasoner dispose? factory]} (ensure-reasoner ontology opts)
         ^OWLReasoner reasoner* reasoner
         rf             (or factory
                            (when-not (instance? OWLReasoner reasoner-sel)
                              (when (or reasoner-factory reasoner-sel)
                                (resolve-reasoner-factory (or reasoner-factory reasoner-sel)))))]
     (try
       (let [consistent? (.isConsistent reasoner*)]
         (cond
           consistent?
           (let [entailed? (.isEntailed reasoner* ax)
                 jopts     (cond-> {}
                              rf (assoc :reasoner-factory rf))
                 jsets     (when entailed?
                             (justify-axiom-blackbox (:manager ctx) ontology ax max jopts))]
             (if (seq jsets)
               {:status :ok :axiom ax :edn (axiom->form ctx ax) :explanations (normalize-explanations ctx jsets render)}
               {:status :not-entailed :axiom ax :edn (axiom->form ctx ax) :explanations [] :notes ["Axiom not entailed in a consistent ontology."]}))

           :else
           (let [incs (inconsistency-justifications ctx
                        (cond-> {:max max}
                          true (assoc :reasoner reasoner*)
                          rf   (assoc :reasoner-factory rf)))]
             {:status       :inconsistent
              :axiom        ax
              :edn          (axiom->form ctx ax)
              :explanations (if (seq incs)
                              (->> incs
                                   (map (fn [{:keys [axioms by-file]}]
                                          (let [j (doto (java.util.LinkedHashSet.) (.addAll axioms))]
                                            {:axioms     axioms :by-file by-file
                                             :render     (render-justification* ontology j render)
                                             :axioms-edn (->> axioms (map #(axiom->form ctx %)) (sort-by pr-str) vec)})))
                                   vec)
                              [])
              :notes        ["Ontology is inconsistent; showing minimal inconsistent justifications (⊤ ⊑ ⊥)."]})))
       (finally
         (when dispose?
           (.dispose reasoner*)))))))

;; ============================ DL Query (EDN) =============================

;; --- Short-form & naming helpers -----------------------------------------

(defn- mk-shortform-providers
  "Build short-form providers for :short rendering. Returns {:pm :sfp :bidi}."
  [{:keys [^OWLOntology ontology ^OWLOntologyManager manager prefixes]}]
  (let [^DefaultPrefixManager pm (DefaultPrefixManager.)]
    (doseq [[p base] prefixes]
      (.setPrefix pm (str p ":") (str base)))
    (let [sfp (reify ShortFormProvider
                (^String getShortForm [_ ^org.semanticweb.owlapi.model.OWLEntity e]
                 (.getShortForm pm (.getIRI e))))
          ^BidirectionalShortFormProviderAdapter bidi
          (BidirectionalShortFormProviderAdapter. manager (imports-closure manager ontology) sfp)]
      {:pm pm :sfp sfp :bidi bidi})))

(defn- entity->kw
  "Entity -> namespaced keyword using short form only if it matches prefix:local.
   Fall back to iri->kw for angle-bracket or non-prefixed forms."
  [^ShortFormProvider sfp ctx ^org.semanticweb.owlapi.model.OWLEntity e]
  (let [sf (.getShortForm sfp e)]
    (if (and sf (re-matches #"^[^<][^:]*:.+" sf))
      (let [[p n] (str/split sf #":" 2)]
        (if (and p n (contains? (:prefixes ctx) p))
          (keyword p n)
          (iri->kw ctx (.getIRI e))))
      (iri->kw ctx (.getIRI e)))))

(defn- coerce-entity
  "Return entity as :kw (default) | :iri | :short | :entity."
  [{:keys [^ShortFormProvider sfp ctx]} ^org.semanticweb.owlapi.model.OWLEntity e return-as]
  (case return-as
    :entity e
    :iri    (.toString (.getIRI e))
    :short  (.getShortForm sfp e)
    :kw     (entity->kw sfp ctx e)
    (entity->kw sfp ctx e)))

(defn- coerce-literal
  "Return literal as raw OWLLiteral or EDN value depending on mode."
  ([ctx ^org.semanticweb.owlapi.model.OWLLiteral lit]
   (coerce-literal ctx lit nil))
  ([ctx ^org.semanticweb.owlapi.model.OWLLiteral lit mode]
   (if (= mode :edn)
     (literal->edn ctx lit)
     lit)))

(defn- bottom-class?
  [e]
  (and (instance? OWLClass e)
       (.isOWLNothing ^OWLClass e)))

(defn- prune-bottom
  "Remove owl:Nothing from a collection of entities."
  [coll]
  (remove bottom-class? coll))

(defn- node-set->entities
  ^java.util.List [^org.semanticweb.owlapi.reasoner.NodeSet ns]
  (->> (.getFlattened ns)
       (seq)
       prune-bottom
       vec))

;; -------------------- Memoized reasoner ops -----------------------------

(defn- mk-bounded-memo
  "Make a simple bounded memo: stores at most `limit` entries. Evicts wholesale
   when full (trade-off: simple, lock-free, predictable)."
  [limit]
  {:limit limit
   :store (atom {})})

(defn- memo-get!
  "Lookup (k) in memo; compute via thunk if missing; evict all if limit reached."
  [{:keys [^long limit store]} k thunk]
  (if-let [v (get @store k)] v
          (let [v (thunk)]
            (swap! store (fn [m] (if (>= (count m) limit) {k v} (assoc m k v))))
            v)))

(defn attach-memos!
  "Attach default, bounded memos to an engine. Returns eng."
  [eng {:keys [size] :or {size 20000}}]
  (reset! (:memos eng)
          {:instances (mk-bounded-memo size) ;; [ce direct?] -> [inds]
           :types     (mk-bounded-memo size) ;; [ind direct?] -> [classes]
           :supC      (mk-bounded-memo size) ;; [class direct?] -> [classes]
           :subC      (mk-bounded-memo size)
           :equivC    (mk-bounded-memo size)

           :supOp   (mk-bounded-memo size) ;; [objProp direct?] -> [objProp]
           :subOp   (mk-bounded-memo size)
           :equivOp (mk-bounded-memo size)
           :invOp   (mk-bounded-memo size)

           :supDp   (mk-bounded-memo size) ;; [dataProp direct?] -> [dataProp]
           :subDp   (mk-bounded-memo size)
           :equivDp (mk-bounded-memo size)

           :opVals    (mk-bounded-memo size) ;; [ind objProp] -> [inds]
           :opValsInv (mk-bounded-memo size) ;; [ind objProp] -> [inds] (via inverse)
           :dpVals    (mk-bounded-memo size)

           :exists-by-o (mk-bounded-memo size) ;; [objProp class] -> #{classes}
           :exists-by-s (mk-bounded-memo size)}) ;; [objProp class] -> #{classes}
  eng)

(defn- memo [eng cache-key k thunk]
  (let [m (get @(:memos eng) cache-key)]
    (memo-get! m k thunk)))

;; ---- class/instance ----
(def ^:private inference-type-map
  {:class-hierarchy   InferenceType/CLASS_HIERARCHY
   :object-hierarchy  InferenceType/OBJECT_PROPERTY_HIERARCHY
   :data-hierarchy    InferenceType/DATA_PROPERTY_HIERARCHY
   :class-assertions  InferenceType/CLASS_ASSERTIONS
   :object-assertions InferenceType/OBJECT_PROPERTY_ASSERTIONS
   :data-assertions   InferenceType/DATA_PROPERTY_ASSERTIONS
   :same-individual   InferenceType/SAME_INDIVIDUAL})

(defn- ensure-consistency!
  [{:keys [^OWLReasoner reasoner consistency] :as eng}]
  (let [state (when consistency @consistency)]
    (if (and state (:checked? state))
      (:value state)
      (let [val (try
                  (.isConsistent reasoner)
                  (catch InconsistentOntologyException _ false)
                  (catch Throwable t
                    (throw (ex-info "Consistency check failed" {:reason :consistency} t))))]
        (when consistency
          (reset! consistency {:checked? true :value val}))
        val))))

(defn- ensure-inference!
  "Precompute the given inference once; noop if already done or ontology inconsistent."
  [{:keys [^OWLReasoner reasoner precomputed] :as eng} inference-key]
  (when (and precomputed (not (contains? @precomputed inference-key)))
    (when (ensure-consistency! eng)
      (when-let [^InferenceType inference (get inference-type-map inference-key)]
        (try
          (.precomputeInferences reasoner (into-array InferenceType [inference]))
          (swap! precomputed conj inference-key)
          (catch Throwable t
            (throw (ex-info "Failed to precompute inference"
                            {:inference inference-key}
                            t)))))))
  eng)

(defn- inst-of
  [eng ^OWLClassExpression ce ^Boolean direct?]
  (memo eng :instances [ce direct?]
        #(do
           (ensure-inference! eng :class-hierarchy)
           (ensure-inference! eng :class-assertions)
           (node-set->entities (.getInstances ^OWLReasoner (:reasoner eng) ce direct?)))))

(defn- types-of
  [eng ^OWLNamedIndividual i ^Boolean direct?]
  (memo eng :types [i direct?]
        #(do
           (ensure-inference! eng :class-hierarchy)
           (ensure-inference! eng :class-assertions)
           (node-set->entities (.getTypes ^OWLReasoner (:reasoner eng) i direct?)))))

(defn- supers-of-class
  [eng ^OWLClass c ^Boolean direct?]
  (memo eng :supC [c direct?]
        #(do
           (ensure-inference! eng :class-hierarchy)
           (node-set->entities (.getSuperClasses ^OWLReasoner (:reasoner eng) c direct?)))))

(defn- subs-of-class
  [eng ^OWLClass c ^Boolean direct?]
  (memo eng :subC [c direct?]
        #(do
           (ensure-inference! eng :class-hierarchy)
           (node-set->entities (.getSubClasses ^OWLReasoner (:reasoner eng) c direct?)))))

(declare ensure-object-assertion-index)
(declare ensure-data-assertion-index)
(declare anon-node->map)

(defn- equiv-classes
  [eng ^OWLClass c]
  (memo eng :equivC [c false]
        #(do
           (ensure-inference! eng :class-hierarchy)
           (-> (.getEquivalentClasses ^OWLReasoner (:reasoner eng) c)
               (.getEntities) (iterator-seq) vec))))

;; ---- object properties ----
(defn- super-objprops
  [eng ^OWLObjectProperty p ^Boolean direct?]
  (memo eng :supOp [p direct?]
        (fn []
          (ensure-inference! eng :object-hierarchy)
          (let [coll (node-set->entities (.getSuperObjectProperties ^OWLReasoner (:reasoner eng) p direct?))]
            (->> coll
                 (keep (fn [pe]
                         (when-not (.isAnonymous ^OWLObjectPropertyExpression pe)
                           (.getNamedProperty ^OWLObjectPropertyExpression pe))))
                 vec)))))

(defn- sub-objprops
  [eng ^OWLObjectProperty p ^Boolean direct?]
  (memo eng :subOp [p direct?]
        (fn []
          (ensure-inference! eng :object-hierarchy)
          (let [coll (node-set->entities (.getSubObjectProperties ^OWLReasoner (:reasoner eng) p direct?))]
            (->> coll
                 (keep (fn [pe]
                         (when-not (.isAnonymous ^OWLObjectPropertyExpression pe)
                           (.getNamedProperty ^OWLObjectPropertyExpression pe))))
                 vec)))))

(defn- equiv-objprops
  [eng ^OWLObjectProperty p]
  (memo eng :equivOp [p false]
        (fn []
          (ensure-inference! eng :object-hierarchy)
          (->> (.getEntities (.getEquivalentObjectProperties ^OWLReasoner (:reasoner eng) p))
               (remove (fn [pe] (.isAnonymous ^OWLObjectPropertyExpression pe)))
               (map (fn [pe] (.getNamedProperty ^OWLObjectPropertyExpression pe)))
               vec))))

(defn- inverse-objprops
  [eng ^OWLObjectProperty p]
  (memo eng :invOp [p false]
        (fn []
          (when-not (instance? org.semanticweb.elk.owlapi.ElkReasoner (:reasoner eng))
            (let [es (.getEntities (.getInverseObjectProperties ^OWLReasoner (:reasoner eng) p))]
              (->> es
                   (remove (fn [pe] (.isAnonymous ^OWLObjectPropertyExpression pe)))
                   (map    (fn [pe] (.getNamedProperty ^OWLObjectPropertyExpression pe)))
                   vec))))))

;; ---- data properties ----
(defn- super-dprops
  [eng ^OWLDataProperty p ^Boolean direct?]
  (memo eng :supDp [p direct?]
        (fn []
          (ensure-inference! eng :data-hierarchy)
          (let [coll (node-set->entities (.getSuperDataProperties ^OWLReasoner (:reasoner eng) p direct?))]
            (->> coll
                 (map (fn [dp] (.asOWLDataProperty ^OWLDataPropertyExpression dp)))
                 vec)))))

(defn- sub-dprops
  [eng ^OWLDataProperty p ^Boolean direct?]
  (memo eng :subDp [p direct?]
        (fn []
          (ensure-inference! eng :data-hierarchy)
          (let [coll (node-set->entities (.getSubDataProperties ^OWLReasoner (:reasoner eng) p direct?))]
            (->> coll
                 (map (fn [dp] (.asOWLDataProperty ^OWLDataPropertyExpression dp)))
                 vec)))))

(defn- equiv-dprops [eng ^OWLDataProperty p]
  (memo eng :equivDp [p false]
        (fn []
          (ensure-inference! eng :data-hierarchy)
          (->> (.getEntities (.getEquivalentDataProperties ^OWLReasoner (:reasoner eng) p))
               (map (fn [dp] (.asOWLDataProperty ^OWLDataPropertyExpression dp)))
               vec))))

;; ---- role/data assertion values ----
(defn- obj-values [eng ^OWLNamedIndividual s ^OWLObjectProperty r]
  (memo eng :opVals [s r]
        #(let [reasoner-vals (node-set->entities (.getObjectPropertyValues ^OWLReasoner (:reasoner eng) s r))
               explicit      (let [idx     (ensure-object-assertion-index eng)
                                   prop-kw (coerce-entity eng r :kw)
                                   pairs   (get-in idx [:pairs prop-kw])]
                               (->> pairs
                                    (filter (fn [[sub _]] (= sub s)))
                                    (map second)))]
           (vec (distinct (concat reasoner-vals explicit))))))

(defn- obj-values-inv [eng ^OWLNamedIndividual o ^OWLObjectProperty r]
  (memo eng :opValsInv [o r]
        #(let [inv           (.getOWLObjectInverseOf *df* r)
               reasoner-vals (node-set->entities (.getObjectPropertyValues ^OWLReasoner (:reasoner eng) o inv))
               explicit      (let [idx     (ensure-object-assertion-index eng)
                                   prop-kw (coerce-entity eng r :kw)
                                   pairs   (get-in idx [:pairs prop-kw])]
                               (->> pairs
                                    (filter (fn [[_ obj]] (= obj o)))
                                    (map first)))]
           (vec (distinct (concat reasoner-vals explicit))))))

(defn- data-values-of [eng ^OWLNamedIndividual s ^OWLDataProperty dp]
  (memo eng :dpVals [s dp]
        #(let [reasoner-vals (vec (.getDataPropertyValues ^OWLReasoner (:reasoner eng) s dp))
               explicit      (let [idx     (ensure-data-assertion-index eng)
                                   prop-kw (coerce-entity eng dp :kw)]
                               (get-in idx [:values prop-kw s]))]
           (vec (distinct (concat reasoner-vals (or explicit [])))))))


(defn- order-page
  "Sort coll of entities by {:by :kw|:iri|:short, :dir :asc|:desc}, then apply :offset/:limit,
   finally coerce each entity according to :return."
  [{:keys [by dir] :or {by :kw dir :asc}} {:keys [return] :or {return :kw}} engine coll {:keys [offset limit]}]
  (let [keyfn   (case by
                  :iri   #(coerce-entity engine % :iri)
                  :short #(coerce-entity engine % :short)
                  :kw    #(coerce-entity engine % :kw)
                  #(coerce-entity engine % :kw))
        cmp     (if (= dir :desc) #(compare %2 %1) compare)
        sorted  (sort-by keyfn cmp coll)
        dropped (if (pos-int? (or offset 0)) (drop offset sorted) sorted)
        taken   (if (pos-int? (or limit 0)) (take limit dropped) dropped)]
    (->> taken (map #(coerce-entity engine % return)) vec)))

;; --- Return map wrapper --------------------------------------------------

(deftype ReturnMap [m values ^clojure.lang.IPersistentMap meta]
  clojure.lang.IObj
  (meta [_] meta)
  (withMeta [_ mta] (ReturnMap. m values mta))

  clojure.lang.ILookup
  (valAt [_ k] (get m k))
  (valAt [_ k not-found] (get m k not-found))

  clojure.lang.Indexed
  (nth [_ i]
    (nth values i))
  (nth [_ i not-found]
    (if (< i (count values))
      (nth values i)
      not-found))

  clojure.lang.Counted
  (count [_] (count m))

  clojure.lang.Seqable
  (seq [_] (seq m))

  clojure.lang.Associative
  (containsKey [_ k] (contains? m k))
  (entryAt [_ k] (find m k))
  (assoc [_ k v] (assoc m k v))

  clojure.lang.IPersistentCollection
  (cons [_ o] (cons m o))
  (empty [_] (ReturnMap. {} [] meta))
  (equiv [_ o] (clojure.lang.Util/equiv m o))

  clojure.lang.IPersistentMap
  (without [_ k] (dissoc m k))

  Object
  (equals [_ o] (.equals m o))
  (hashCode [_] (.hashCode m))
  (toString [_] (.toString m)))

(defn- ->return-map
  [m values]
  (ReturnMap. m (vec values) nil))

;; --- Aggregation helpers -------------------------------------------------

(defn- agg-row-value [row arg]
  (cond
    (qvar? arg)                              (get row arg)
    (and (seq? arg) (= 'ground (first arg))) (second arg)
    :else                                    arg))

(defn- agg-values
  [rows arg]
  (keep #(agg-row-value % arg) rows))

(defn- agg-values-multi
  [rows args]
  (map (fn [row]
         (map #(agg-row-value row %) args))
       rows))

(defn- normalize-agg-value
  [ctx v]
  (cond
    (instance? org.semanticweb.owlapi.model.OWLLiteral v) (literal->edn ctx v)
    :else                                                 v))

(defn- agg-count
  [_ctx rows args]
  (if (seq args)
    (count (agg-values rows (first args)))
    (count rows)))

(defn- agg-count-distinct
  [ctx rows args]
  (count (distinct (map #(normalize-agg-value ctx %)
                        (agg-values rows (first args))))))

(defn- agg-sum
  [ctx rows args]
  (let [vals (map #(normalize-agg-value ctx %)
                  (agg-values rows (first args)))
        nums (keep #(when (number? %) %) vals)]
    (reduce + 0 nums)))

(defn- agg-average
  [ctx rows args]
  (let [vals (map #(normalize-agg-value ctx %)
                  (agg-values rows (first args)))
        nums (keep #(when (number? %) (double %)) vals)
        cnt  (count nums)]
    (when (pos? cnt)
      (/ (reduce + nums) cnt))))

(defn- agg-variance
  [ctx rows args]
  (let [vals (map #(normalize-agg-value ctx %)
                  (agg-values rows (first args)))
        nums (keep #(when (number? %) (double %)) vals)
        cnt  (count nums)]
    (when (pos? cnt)
      (let [mean (/ (reduce + nums) cnt)
            sq   (map (fn [x] (let [d (- x mean)] (* d d))) nums)]
        (/ (reduce + sq) cnt)))))

(defn- agg-stddev
  [ctx rows args]
  (when-let [variance (agg-variance ctx rows args)]
    (Math/sqrt variance)))

(defn- agg-median
  [ctx rows args]
  (let [vals (map #(normalize-agg-value ctx %)
                  (agg-values rows (first args)))
        nums (sort (keep #(when (number? %) (double %)) vals))
        cnt  (count nums)]
    (when (pos? cnt)
      (let [mid (quot cnt 2)]
        (if (odd? cnt)
          (nth nums mid)
          (/ (+ (nth nums (dec mid)) (nth nums mid)) 2.0))))))

(defn- agg-min-max
  [ctx rows args comparator]
  (let [values (agg-values rows (if (and (> (count args) 1) (number? (first args))) (second args) (first args)))
        pairs  (keep (fn [raw]
                       (let [norm (normalize-agg-value ctx raw)]
                         (when (some? norm) [norm raw])))
                     values)
        sorted (sort-by first comparator pairs)
        n      (when (and (> (count args) 1) (number? (first args))) (long (first args)))]
    (if n
      (->> sorted (take n) (map second) vec)
      (some-> sorted first second))))

(defn- agg-distinct
  [ctx rows args]
  (->> (agg-values rows (first args))
       (map #(normalize-agg-value ctx %))
       (into #{})))

(defn- agg-sample
  [rows args {:keys [replacement?]}]
  (let [n         (long (first args))
        values    (vec (agg-values rows (second args)))
        available (count values)]
    (cond
      (zero? available) []
      replacement?
      (vec (repeatedly n #(values (rand-int available))))
      :else
      (into []
            (take (min n available))
            (shuffle values)))))

(def ^:private aggregator-registry
  {'count          {:compute agg-count}
   'count-distinct {:compute agg-count-distinct}
   'sum            {:compute agg-sum}
   'avg            {:compute agg-average}
   'median         {:compute agg-median}
   'variance       {:compute agg-variance}
   'stddev         {:compute agg-stddev}
   'min            {:compute (fn [ctx rows args] (agg-min-max ctx rows args compare))}
   'max            {:compute (fn [ctx rows args] (agg-min-max ctx rows args #(compare %2 %1)))}
   'distinct       {:compute agg-distinct}
   'rand           {:compute (fn [_ctx rows args] (agg-sample rows args {:replacement? true}))}
   'sample         {:compute (fn [_ctx rows args] (agg-sample rows args {:replacement? false}))}})

(defn- analyze-find-spec
  [find]
  (let [{:keys [elements has-aggregates?] :as result}
        (reduce (fn [acc elem]
                  (cond
                    (qvar? elem)
                    (update acc :elements conj {:type :var :key elem})

                    (and (seq? elem) (symbol? (first elem)))
                    (let [agg-sym (first elem)
                          args    (rest elem)
                          entry   (get aggregator-registry agg-sym)]
                      (when-not entry
                        (throw (ex-info "Unsupported aggregate expression"
                                        {:aggregate elem})))
                      (-> acc
                          (update :elements conj {:type :agg :key elem :agg entry :args args})
                          (assoc :has-aggregates? true)))

                    :else
                    (throw (ex-info "Unsupported find element"
                                    {:element elem}))))
                {:elements [] :has-aggregates? false}
                find)]
    (assoc result :group-vars (vec (for [{:keys [type key]} elements
                                         :when              (= type :var)]
                                     key)))))


(def ^:private engine-option-keys
  [:reasoner :reasoner-factory :trace? :precompute? :index? :annotation-index? :memo-size :module? :module-key])

(defn- select-engine-opts
  "Pick engine option keys (including false/nil values when explicitly present)."
  [m]
  (reduce (fn [acc k]
            (if (and (map? m) (contains? m k))
              (assoc acc k (get m k))
              acc))
          {}
          engine-option-keys))

(defn- reasoner-selection-key
  "Return cache discriminator for reasoner selection, falling back to *default-reasoner*."
  [engine-opts]
  (cond
    (and (map? engine-opts) (contains? engine-opts :reasoner-factory)
         (some? (:reasoner-factory engine-opts))) (-> (:reasoner-factory engine-opts) class .getName)
    (and (map? engine-opts) (contains? engine-opts :reasoner)
         (some? (:reasoner engine-opts)))         (:reasoner engine-opts)
    :else                                         *default-reasoner*))

(defn- cache-key-for-engine
  [ctx engine-opts]
  (let [sel (reasoner-selection-key engine-opts)]
    [(:ontology ctx)
     {:selection         sel
      :precompute?       (:precompute? engine-opts)
      :index?            (:index? engine-opts)
      :annotation-index? (:annotation-index? engine-opts)
      :memo-size         (:memo-size engine-opts)
      :trace?            (:trace? engine-opts)
      :module-key        (:module-key engine-opts)}]))

;; --- Engine lifecycle -----------------------------------------------------

(defn- eng-defaults
  "Base fields every engine carries."
  []
  {:indexes     (atom {})   ;; {:taxonomy {...} :rbox {...} :ann {...}}
   :memos       (atom {})   ;; {:instances memo, :types memo, ...}
   :metrics     (atom {})   ;; optional, for profiling
   :precomputed (atom #{})  ;; tracks which Pellet inference families we’ve materialised
   :consistency (atom {:checked? false :value nil})})

(defn- uses-el-unsupported?
  [^OWLOntologyManager manager ^OWLOntology ontology]
  (some (fn [^OWLOntology ont]
          (or (seq (.getAxioms ont AxiomType/INVERSE_OBJECT_PROPERTIES))
              (some (fn [^OWLSubPropertyChainOfAxiom ax]
                      (some #(.isAnonymous ^OWLObjectPropertyExpression %)
                            (.getPropertyChain ax)))
                    (.getAxioms ont AxiomType/SUB_PROPERTY_CHAIN_OF))))
        (imports-closure manager ontology)))

(declare build-taxonomy-index! build-rbox-index! build-annotation-index! uses-el-unsupported?)
(declare cache-lookup! cache-store!)

(defn dlq-engine
  "Create a reusable DLQ engine bound to ctx.
   Options: {:precompute? boolean
             :index?      boolean            ;; build taxonomy & rbox indices
             :annotation-index? boolean
             :memo-size   int                ;; bounded memo entry count (default 20k)
             :trace?      boolean            ;; Openllet tracing (off for queries)
             :reasoner|:reasoner-factory ...}
   Returns {:reasoner r :ctx ctx :pm :sfp :bidi :indexes :memos :metrics}."
  ([ctx] (dlq-engine ctx {}))
  ([{:keys [^OWLOntology ontology] :as ctx}
    {:keys [reasoner reasoner-factory precompute? trace? index? annotation-index? memo-size]
     :as   opts
     :or   {precompute?       false
            index?            false
            annotation-index? false
            memo-size         20000
            trace?            false}}]
   (let [{:keys [pm sfp bidi]} (mk-shortform-providers ctx)
         selection             (cond
                                 (and (map? opts) (contains? opts :reasoner-factory)
                                      (some? reasoner-factory)) reasoner-factory
                                 (and (map? opts) (contains? opts :reasoner)
                                      (some? reasoner))         reasoner
                                 :else                          *default-reasoner*)
         rf                    (resolve-reasoner-factory (or reasoner-factory reasoner))]
     (when (= selection :elk)
       (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} ctx]
         (when (uses-el-unsupported? manager ontology)
           (throw (ex-info "ELK not supported for ontologies using inverse properties or inverse chains (:elk-incompatible)"
                           {:reason :elk-incompatible})))))
     (let [^OWLReasoner r (.createReasoner ^OWLReasonerFactory rf ontology)
           eng            (merge {:reasoner           r
                                  :ctx                ctx
                                  :pm                 pm
                                  :sfp                sfp
                                  :bidi               bidi
                                  :reasoner-factory   rf
                                  :reasoner-selection selection}
                                 (eng-defaults))]
       (attach-memos! eng {:size memo-size})
       ;; Prime cheap signature indexes and property-kind memo to avoid repeated scans
       (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} ctx
             onts                                                        (imports-closure manager ontology)
             inds                                                        (vec (mapcat (fn [^OWLOntology o] (.getIndividualsInSignature o)) onts))
             cls                                                         (vec (mapcat (fn [^OWLOntology o] (.getClassesInSignature o))     onts))
             ops                                                         (vec (mapcat (fn [^OWLOntology o] (.getObjectPropertiesInSignature o)) onts))
             dps                                                         (vec (mapcat (fn [^OWLOntology o] (.getDataPropertiesInSignature   o)) onts))
             aps                                                         (vec (mapcat (fn [^OWLOntology o] (.getAnnotationPropertiesInSignature o)) onts))]
         (swap! (:indexes eng) assoc :sig {:inds      inds
                                           :classes   cls
                                           :class-set (set cls)
                                           :ops       ops
                                           :dps       dps
                                           :aps       aps})
         (when-let [pk (get-in ctx [:caches :property-kind])]
           (when ops (swap! pk into (map (fn [p] [(.getIRI ^OWLObjectProperty p) :object]) ops)))
           (when dps (swap! pk into (map (fn [p] [(.getIRI ^OWLDataProperty p)   :data])   dps)))
           (when aps (swap! pk into (map (fn [p] [(.getIRI ^OWLAnnotationProperty p) :annotation]) aps)))))
       (when precompute?
         (doseq [inference [:class-hierarchy
                            :object-hierarchy
                            :data-hierarchy
                            :class-assertions
                            :object-assertions
                            :data-assertions
                            :same-individual]]
           (ensure-inference! eng inference)))
       (when (and index? (ensure-consistency! eng))
         (-> eng build-taxonomy-index! build-rbox-index!))
       (when annotation-index?
         (build-annotation-index! eng))
       eng))))

(defn dlq-close!
  "Dispose the reasoner inside an engine."
  [{:keys [^OWLReasoner reasoner]}]
  (when reasoner (.dispose reasoner)))

;; --- Core query -----------------------------------------------------------

(def ^:private default-asks #{:satisfiable? :equivalents :subclasses :superclasses :instances})

(defn- validate-dlq
  [q]
  (when-not (map? q) (throw (ex-info "DLQ must be a map" {:input q})))
  (when-not (contains? q :where) (throw (ex-info "DLQ requires :where" {:input q})))
  (when-let [ask (:ask q)]
    (when-not (set? ask) (throw (ex-info ":ask must be a set" {:ask ask})))
    (when-not (set/subset? ask default-asks)
      (throw (ex-info ":ask contains unknown ops" {:ask ask :allowed default-asks}))))
  (when-let [ret (:return q)]
    (when-not (contains? #{:kw :iri :short :entity} ret)
      (throw (ex-info "Unknown :return mode" {:return ret}))))
  (when-let [o (:order q)]
    (let [{:keys [by dir]} o]
      (when-not (contains? #{:kw :iri :short nil} by)
        (throw (ex-info "Unknown :order :by" {:by by})))
      (when-not (contains? #{:asc :desc nil} dir)
        (throw (ex-info "Unknown :order :dir" {:dir dir}))))))

(defn dlq*
  "Run an EDN DL query qmap using a prebuilt engine. Fails closed on inconsistency
   and returns minimal inconsistent justifications under :explanations."
  [{:keys [^OWLReasoner reasoner] :as engine}
   {:keys [where ask direct return order limit offset unsafe?] :as q
    :or   {ask default-asks direct {} return :kw order {:by :kw :dir :asc}}}]
  (validate-dlq q)
  (let [ctx                    (:ctx engine)
        ^OWLClassExpression ce (class-expr ctx where)
        consistent?            (ensure-consistency! engine)
        base                   {:status (if consistent? :ok :inconsistent)
                                :query  {:input      {:where where :ask   ask   :direct direct :return  return
                                                      :order order :limit limit :offset offset :unsafe? unsafe?}
                                         :class-expr ce}}]
    (if consistent?
      (try
        (let [ask?        #(contains? ask %)
              need-class? (or (ask? :subclasses) (ask? :superclasses) (ask? :equivalents) (ask? :instances))
              _           (when need-class? (ensure-inference! engine :class-hierarchy))
              _           (when (ask? :instances) (ensure-inference! engine :class-assertions))
              classes     (fn [^org.semanticweb.owlapi.reasoner.NodeSet ns]
                            (order-page order {:return return} engine (node-set->entities ns) {:limit limit :offset offset}))]
          (merge base
                 (when (ask? :satisfiable?) {:satisfiable? (.isSatisfiable reasoner ce)})
                 (when (ask? :equivalents)
                   (let [eqs (->> (.getEntities (.getEquivalentClasses reasoner ce))
                                  (seq)
                                  prune-bottom
                                  vec)]
                     {:equivalents (order-page order {:return return} engine eqs {:limit limit :offset offset})}))
                 (when (ask? :subclasses)
                   {:subclasses {:direct (classes (.getSubClasses reasoner ce true))
                                 :all    (classes (.getSubClasses reasoner ce false))}})
                 (when (ask? :superclasses)
                   {:superclasses {:direct (classes (.getSuperClasses reasoner ce true))
                                   :all    (classes (.getSuperClasses reasoner ce false))}})
                 (when (ask? :instances)
                   {:instances {:direct (classes (.getInstances reasoner ce true))
                                :all    (classes (.getInstances reasoner ce false))}})
                 ))
        (catch org.semanticweb.owlapi.reasoner.InconsistentOntologyException _
          (assoc base :status :inconsistent
                 :explanations (vec (or (inconsistency-justifications ctx {:max 5}) []))
                 :notes ["Ontology inconsistent during asks; results unavailable."]))
        (catch Throwable t
          (assoc base :status :error
                 :explanations []
                 :notes [(str "Reasoner error during asks: " (.getMessage t))])))
      (assoc base :notes ["Ontology inconsistent; DLQ asks not executed."]
             :explanations (vec (or (inconsistency-justifications ctx {:max 5}) []))))))

(defn dlq
  "Run a one-off EDN DL query qmap against ctx. Manages reasoner lifecycle.
   qmap spec: see docs. Returns result map with keys per :ask.

   Optional third argument supplies engine options (same keys as dlq-engine)."
  ([ctx qmap]
   (dlq ctx qmap nil))
  ([ctx qmap engine-opts]
   (let [ctx               (ensure-eng-cache ctx)
         q-opts            (select-engine-opts qmap)
         override-opts     (select-engine-opts engine-opts)
         engine-opts       (merge {:precompute?       false
                                   :index?            false
                                   :annotation-index? false
                                   :module?           true}
                                  q-opts
                                  override-opts)
         selection         (reasoner-selection-key engine-opts)
         dl-reasoner?      (not (#{:structural :elk} selection))
         ask-set           (:ask qmap)
         module?           (and dl-reasoner?
                                (get engine-opts :module? true)
                                ask-set
                                (set/subset? ask-set #{:satisfiable?}))
         signature         (when module? (collect-query-signature ctx (:where qmap)))
         {:keys [ctx key]} (if (and module? (not (signature-empty? signature)))
                             (module-context ctx signature)
                             {:ctx ctx :key nil})
         ctx               (ensure-eng-cache ctx)
         cache             (:eng-cache ctx)
         engine-opts       (cond-> engine-opts
                             (and module? key) (assoc :module-key key))
         key               (cache-key-for-engine ctx engine-opts)
         eng               (or (cache-lookup! cache key)
                               (let [eng (dlq-engine ctx engine-opts)]
                                 (cache-store! cache key eng)
                                 eng))
         res               (dlq* eng qmap)
         res'              (if (and (= :inconsistent (:status res))
                                    (empty? (:explanations res)))
                             (let [inc-opts (cond-> {:max 5}
                                              (:reasoner-factory eng)              (assoc :reasoner-factory (:reasoner-factory eng))
                                              (keyword? (:reasoner-selection eng)) (assoc :reasoner (:reasoner-selection eng)))]
                               (assoc res :explanations (vec (or (inconsistency-justifications ctx inc-opts) []))))
                             res)]
     res')))

;; --- Focused helpers ------------------------------------------------------

(defn satisfiable?
  "Return true if class-expr (or full qmap) is satisfiable."
  ([ctx class-expr-or-qmap]
   (let [q (if (map? class-expr-or-qmap)
             (merge {:ask #{:satisfiable?}} class-expr-or-qmap)
             {:where class-expr-or-qmap :ask #{:satisfiable?}})]
     (boolean (:satisfiable? (dlq ctx q)))))
  ([ctx class-expr-or-qmap _opts]
   (satisfiable? ctx class-expr-or-qmap)))

(defn equivalents
  "Return equivalent classes. Options {:return :kw|:iri|:short|:entity}."
  [ctx class-expr-or-qmap & {:keys [return]}]
  (let [q (cond
            (map? class-expr-or-qmap) (merge {:ask #{:equivalents}} class-expr-or-qmap (when return {:return return}))
            :else                     {:where class-expr-or-qmap :ask #{:equivalents} :return (or return :kw)})]
    (:equivalents (dlq ctx q))))

(defn subclasses
  "Return subclasses. Options {:direct? boolean :return ...}."
  [ctx class-expr-or-qmap & {:keys [direct? return]}]
  (let [q   (cond
              (map? class-expr-or-qmap) (merge {:ask #{:subclasses}} class-expr-or-qmap (when return {:return return}))
              :else                     {:where class-expr-or-qmap :ask #{:subclasses} :return (or return :kw)})
        res (dlq ctx q)]
    (get-in res [:subclasses (if direct? :direct :all)])))

(defn superclasses
  "Return superclasses. Options {:direct? boolean :return ...}."
  [ctx class-expr-or-qmap & {:keys [direct? return]}]
  (let [q   (cond
              (map? class-expr-or-qmap) (merge {:ask #{:superclasses}} class-expr-or-qmap (when return {:return return}))
              :else                     {:where class-expr-or-qmap :ask #{:superclasses} :return (or return :kw)})
        res (dlq ctx q)]
    (get-in res [:superclasses (if direct? :direct :all)])))

(defn instances
  "Return instances. Options {:direct? boolean :return ...}."
  [ctx class-expr-or-qmap & {:keys [direct? return]}]
  (let [q   (cond
              (map? class-expr-or-qmap) (merge {:ask #{:instances}} class-expr-or-qmap (when return {:return return}))
              :else                     {:where class-expr-or-qmap :ask #{:instances} :return (or return :kw)})
        res (dlq ctx q)]
    (get-in res [:instances (if direct? :direct :all)])))

;; --- ABox conveniences ----------------------------------------------------

(defn role-fillers
  "Object property values for a named individual. {:of :ex/i :property :ex/R}"
  [ctx {:keys [of property]} & {:keys [return] :or {return :kw}}]
  (let [{:keys [^OWLReasoner reasoner] :as eng} (dlq-engine ctx)]
    (try
      (let [^org.semanticweb.owlapi.reasoner.NodeSet ns
            (.getObjectPropertyValues reasoner (as-ind ctx of) (as-objprop ctx property))]
        (order-page {:by :kw :dir :asc} {:return return} eng (node-set->entities ns) {:limit 0 :offset 0}))
      (finally (dlq-close! eng)))))

(defn data-values
  "Data property values for a named individual. {:of :ex/ind :property :ex/dp}"
  [ctx {:keys [of property]} & {:keys [mode] :or {mode :raw}}]
  (let [{:keys [^OWLReasoner reasoner]} (dlq-engine ctx)]
    (try
      (let [vals (.getDataPropertyValues reasoner (as-ind ctx of) (as-dprop ctx property))]
        (->> vals (map #(coerce-literal ctx % (when (= mode :edn) :edn))) vec))
      (finally (dlq-close! {:reasoner reasoner})))))

;; --- Explanations bridging -----------------------------------------------

(defn explain-instance
  "Explain ClassAssertion(CE, i) for {:of :ex/i :where CE}. Returns `explain`-shape map."
  [ctx {:keys [of where]} {:keys [max render] :or {max 5 render :manchester}}]
  (let [ax (.getOWLClassAssertionAxiom *df* (class-expr ctx where) (as-ind ctx of))]
    (explain ctx ax {:max max :render render})))

(defn explain-unsat
  "Explain unsatisfiability of a class expression CE."
  [ctx ce {:keys [max render] :or {max 5 render :manchester}}]
  (let [ax (.getOWLSubClassOfAxiom *df* ^OWLClassExpression (class-expr ctx ce) (.getOWLNothing *df*))]
    (explain ctx ax {:max max :render render})))

;; ================= Open‑world Datalog‑ish Queries ========================

(defn qvar?
  "Datalog-style var: symbol starting with '?'"
  [x]
  (and (symbol? x) (str/starts-with? (name x) "?")))

(defn- qground? [x] (not (qvar? x)))

(defn- all-named-individuals
  "Enumerate all named individuals in the imports closure. Uses engine signature index if present."
  [ctx-or-eng]
  (if (contains? ctx-or-eng :ctx)
    (or (get-in @(:indexes ctx-or-eng) [:sig :inds])
        (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} (:ctx ctx-or-eng)]
          (->> (imports-closure manager ontology)
               (mapcat (fn [^OWLOntology o] (.getIndividualsInSignature o))) vec)))
    (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} ctx-or-eng]
      (->> (imports-closure manager ontology)
           (mapcat (fn [^OWLOntology o] (.getIndividualsInSignature o))) vec))))

(defn- all-named-classes
  "Enumerate all named classes in the imports closure. Uses engine signature index if present."
  [ctx-or-eng]
  (if (contains? ctx-or-eng :ctx)
    (or (get-in @(:indexes ctx-or-eng) [:sig :classes])
        (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} (:ctx ctx-or-eng)]
          (->> (imports-closure manager ontology)
               (mapcat (fn [^OWLOntology o] (.getClassesInSignature o))) vec)))
    (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} ctx-or-eng]
      (->> (imports-closure manager ontology)
           (mapcat (fn [^OWLOntology o] (.getClassesInSignature o))) vec))))

(defn- all-object-properties
  "Enumerate all named object properties in the imports closure. Uses engine signature index if present."
  [ctx-or-eng]
  (if (contains? ctx-or-eng :ctx)
    (or (get-in @(:indexes ctx-or-eng) [:sig :ops])
        (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} (:ctx ctx-or-eng)]
          (->> (imports-closure manager ontology)
               (mapcat (fn [^OWLOntology o] (.getObjectPropertiesInSignature o))) vec)))
    (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} ctx-or-eng]
      (->> (imports-closure manager ontology)
           (mapcat (fn [^OWLOntology o] (.getObjectPropertiesInSignature o))) vec))))

(defn- all-data-properties
  "Enumerate all named data properties in the imports closure. Uses engine signature index if present."
  [ctx-or-eng]
  (if (contains? ctx-or-eng :ctx)
    (or (get-in @(:indexes ctx-or-eng) [:sig :dps])
        (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} (:ctx ctx-or-eng)]
          (->> (imports-closure manager ontology)
               (mapcat (fn [^OWLOntology o] (.getDataPropertiesInSignature o))) vec)))
    (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} ctx-or-eng]
      (->> (imports-closure manager ontology)
           (mapcat (fn [^OWLOntology o] (.getDataPropertiesInSignature o))) vec))))

(defn- all-annotation-properties
  "Enumerate all named annotation properties in the imports closure."
  [ctx-or-eng]
  (if (contains? ctx-or-eng :ctx)
    (or (get-in @(:indexes ctx-or-eng) [:sig :aps])
        (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} (:ctx ctx-or-eng)]
          (->> (imports-closure manager ontology)
               (mapcat (fn [^OWLOntology o] (.getAnnotationPropertiesInSignature o))) vec)))
    (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} ctx-or-eng]
      (->> (imports-closure manager ontology)
           (mapcat (fn [^OWLOntology o] (.getAnnotationPropertiesInSignature o))) vec))))

;; -------------------- Precomputed indices --------------------------------

(defn build-taxonomy-index!
  "Precompute direct and all supers/subs for every named class."
  [{:keys [^OWLReasoner reasoner] :as eng}]
  (let [cs (all-named-classes eng)
        m  (reduce
             (fn [acc ^OWLClass c]
               (assoc acc c {:supers {:direct (set (supers-of-class eng c true))
                                      :all    (set (supers-of-class eng c false))}
                             :subs   {:direct (set (subs-of-class   eng c true))
                                      :all    (set (subs-of-class   eng c false))}}))
             {} cs)]
    (swap! (:indexes eng) assoc :taxonomy m)
    eng))

(defn build-rbox-index!
  "Precompute direct and all supers/subs for object+data properties."
  [{:keys [^OWLReasoner reasoner] :as eng}]
  (let [ops  (all-object-properties eng)
        dps  (all-data-properties   eng)
        idxO (reduce (fn [acc ^OWLObjectProperty p]
                       (assoc acc p {:supers  {:direct (set (super-objprops eng p true))
                                               :all    (set (super-objprops eng p false))}
                                     :subs    {:direct (set (sub-objprops   eng p true))
                                               :all    (set (sub-objprops   eng p false))}
                                     :equiv   (set (equiv-objprops eng p))
                                     :inverse (set (inverse-objprops eng p))}))
                     {} ops)
        idxD (reduce (fn [acc ^OWLDataProperty p]
                       (assoc acc p {:supers {:direct (set (super-dprops eng p true))
                                              :all    (set (super-dprops eng p false))}
                                     :subs   {:direct (set (sub-dprops   eng p true))
                                              :all    (set (sub-dprops   eng p false))}
                                     :equiv  (set (equiv-dprops eng p))}))
                     {} dps)]
    (swap! (:indexes eng) assoc :rbox {:obj idxO :data idxD})
    eng))

(defn- named-class-set
  [xs]
  (->> xs
       (filter #(instance? OWLClass %))
       (remove #(.isOWLNothing ^OWLClass %))
       set))

(declare ensure-exists-index)

(defn- explicit-exists-index
  "Collect explicitly asserted \u2203R.C restrictions from subclass axioms.
  Returns map {prop {:by-s {sub #{fillers}} :by-o {filler #{subs}}}}."
  [{:keys [ctx indexes]}]
  (if-let [cached (get @indexes :explicit-exists)]
    cached
    (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} ctx
          closure                                                     (imports-closure manager ontology)
          result
          (reduce
            (fn [acc ^OWLOntology ont]
              (reduce
                (fn [acc' ^org.semanticweb.owlapi.model.OWLSubClassOfAxiom ax]
                  (let [sub (.getSubClass ax)
                        sup (.getSuperClass ax)]
                    (if (and (instance? OWLClass sub)
                             (instance? org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom sup))
                      (let [^org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom svf sup
                            prop-expr                                                 (.getProperty svf)
                            filler                                                    (.getFiller svf)
                            prop                                                      (when (and prop-expr (not (.isAnonymous prop-expr)))
                                                                                        (.getNamedProperty ^OWLObjectPropertyExpression prop-expr))
                            sub-cls                                                   ^OWLClass (when (and sub (not (.isAnonymous sub))) sub)
                            filler-ce                                                 (when filler
                                                                                        (if (instance? OWLClass filler)
                                                                                          filler
                                                                                          filler))]
                        (if (and prop sub-cls filler-ce)
                          (-> acc'
                              (update-in [prop :by-s sub-cls] (fnil conj #{}) filler-ce)
                              (update-in [prop :by-o filler-ce] (fnil conj #{}) sub-cls))
                          acc'))
                      acc')))
                acc
                (.getAxioms ont AxiomType/SUBCLASS_OF)))
            {}
            closure)]
      (swap! indexes assoc :explicit-exists result)
      result)))

(defn- restriction-pairs-for-sub
  [eng ^OWLClass sub-class]
  (mapcat (fn [^OWLObjectProperty prop]
            (let [table   (ensure-exists-index eng prop)
                  fillers (get-in table [:by-s sub-class])]
              (when (seq fillers)
                (map (fn [f] {:prop prop :filler f}) fillers))))
          (all-object-properties eng)))

(declare owl-restriction-keys)

(defn- restriction-forms
  "Extract all restriction maps from a class expression form (EDN)."
  [form]
  (letfn [(collect [x]
            (cond
              (and (map? x) (= (:rdf/type x) :owl/Restriction)) [x]
              (and (map? x) (:owl/intersectionOf x))            (mapcat collect (:owl/intersectionOf x))
              (and (map? x) (:owl/unionOf x))                   (mapcat collect (:owl/unionOf x))
              (and (map? x) (:owl/complementOf x))              (collect (:owl/complementOf x))
              :else                                             []))]
    (collect form)))

(defn- restriction-prop
  [restriction]
  (or (:owl/onProperty restriction)
      (:owl/onProperties restriction)
      (:owl/onObjectProperty restriction)
      (:owl/onDataProperty restriction)))

(defn- ensure-restriction-index
  [eng]
  (or (get @(:indexes eng) :restriction-records)
      (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} (:ctx eng)
            ctx                                                         (:ctx eng)
            closure                                                     (imports-closure manager ontology)
            add-record                                                  (fn [{:keys [records by-key] :as acc} rec]
                                                                          (let [{:keys [restriction prop sub]} rec
                                                                                acc                            (update acc :records conj rec)
                                                                                acc                            (if prop
                                                                                                                 (update-in acc [:by-key :prop prop] (fnil conj []) rec)
                                                                                                                 acc)
                                                                                acc                            (if sub
                                                                                                                 (update-in acc [:by-key :sub sub] (fnil conj []) rec)
                                                                                                                 acc)
                                                                                acc                            (reduce (fn [m k]
                                                                                                                         (let [v (get restriction k ::missing)]
                                                                                                                           (if (= ::missing v)
                                                                                                                             m
                                                                                                                             (update-in m [:by-key k v] (fnil conj []) rec))))
                                                                                                                       acc
                                                                                                                       owl-restriction-keys)]
                                                                            acc))
            initial                                                     {:records [] :by-key {}}
            ;; explicit restrictions from subclass axioms
            explicit                                                    (reduce
                                                                          (fn [acc ^OWLSubClassOfAxiom ax]
                                                                            (let [sub (.getSubClass ax)]
                                                                              (if (.isAnonymous sub)
                                                                                acc
                                                                                (let [sub-kw       (coerce-entity eng (.asOWLClass sub) :kw)
                                                                                      sup          (.getSuperClass ax)
                                                                                      form         (class-expr->form ctx sup)
                                                                                      restrictions (restriction-forms form)]
                                                                                  (reduce (fn [acc' restriction]
                                                                                            (let [prop (restriction-prop restriction)]
                                                                                              (add-record acc' {:restriction restriction
                                                                                                                :prop        prop
                                                                                                                :sub         sub-kw})))
                                                                                          acc
                                                                                          restrictions)))))
                                                                          initial
                                                                          (mapcat #(seq (.getAxioms ^OWLOntology % AxiomType/SUBCLASS_OF)) closure))
            ;; restrictions from equivalent class axioms
            equivalences                                                (reduce
                                                                          (fn [acc ^OWLEquivalentClassesAxiom ax]
                                                                            (let [exprs (.getClassExpressions ax)
                                                                                  named (filter #(and (instance? OWLClass %) (not (.isAnonymous ^OWLClass %))) exprs)
                                                                                  forms (into {} (map (fn [^OWLClassExpression e]
                                                                                                        [e (class-expr->form ctx e)])) exprs)]
                                                                              (reduce
                                                                                (fn [acc' ^OWLClass named-cls]
                                                                                  (let [sub-kw (coerce-entity eng named-cls :kw)]
                                                                                    (reduce
                                                                                      (fn [acc'' ^OWLClassExpression other]
                                                                                        (if (= other named-cls)
                                                                                          acc''
                                                                                          (let [restrictions (restriction-forms (get forms other))]
                                                                                            (reduce (fn [acc3 restriction]
                                                                                                      (let [prop (restriction-prop restriction)]
                                                                                                        (add-record acc3 {:restriction restriction
                                                                                                                          :prop        prop
                                                                                                                          :sub         sub-kw})))
                                                                                                    acc''
                                                                                                    restrictions))))
                                                                                      acc'
                                                                                      exprs)))
                                                                                acc
                                                                                named)))
                                                                          explicit
                                                                          (mapcat #(seq (.getAxioms ^OWLOntology % AxiomType/EQUIVALENT_CLASSES)) closure))
            ;; reasoner-derived someValuesFrom restrictions to ensure completeness
            derived                                                     (reduce
                                                                          (fn [acc ^OWLClass sub]
                                                                            (reduce (fn [acc' {:keys [prop filler]}]
                                                                                      (let [prop-kw     (coerce-entity eng prop :kw)
                                                                                            restriction {:rdf/type           :owl/Restriction
                                                                                                         :owl/onProperty     prop-kw
                                                                                                         :owl/someValuesFrom (class-expr->form ctx filler)}]
                                                                                        (add-record acc' {:restriction restriction
                                                                                                          :prop        prop-kw
                                                                                                          :sub         (coerce-entity eng sub :kw)})))
                                                                                    acc
                                                                                    (restriction-pairs-for-sub eng sub)))
                                                                          equivalences
                                                                          (all-named-classes eng))
            bundle                                                      {:records (vec (:records derived))
                                                                         :by-key  (into {} (map (fn [[k vs]] [k (into {} (map (fn [[v rs]] [v (vec (distinct rs))]) vs))])
                                                                                                (:by-key derived)))}]
        (swap! (:indexes eng) assoc :restriction-records bundle)
        bundle)))

(declare restrictions-by-key)

(defn- restriction-records
  [eng]
  (:records (ensure-restriction-index eng)))

(defn- restrictions-for-sub
  [eng sub]
  (let [sub-key (cond
                  (keyword? sub)           sub
                  (instance? OWLClass sub) (coerce-entity eng sub :kw)
                  (instance? IRI sub)      (coerce-entity eng (.getOWLClass *df* ^IRI sub) :kw)
                  :else                    nil)]
    (if sub-key
      (or (restrictions-by-key eng :sub sub-key) [])
      [])))

(defn- restrictions-by-key
  ([eng key]
   (get-in (ensure-restriction-index eng) [:by-key key]))
  ([eng key value]
   (get-in (ensure-restriction-index eng) [:by-key key value])))

(defn- ensure-object-assertion-index
  [eng]
  (or (get @(:indexes eng) :obj-assertions)
      (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} (:ctx eng)
            closure                                                     (imports-closure manager ontology)
            idx                                                         (reduce
                                                                          (fn [acc ^OWLObjectPropertyAssertionAxiom ax]
                                                                            (let [^OWLObjectPropertyExpression pe (.getProperty ax)
                                                                                  np                              (.getNamedProperty pe)
                                                                                  prop-kw                         (coerce-entity eng np :kw)
                                                                                  ^OWLIndividual subj             (.getSubject ax)
                                                                                  ^OWLIndividual obj              (.getObject ax)
                                                                                  sub-ind                         (when (and prop-kw (.isNamed subj))
                                                                                                                                                 ^OWLNamedIndividual (.asOWLNamedIndividual subj))
                                                                                  obj-ind                         (when (and prop-kw (.isNamed obj))
                                                                                                                                                 ^OWLNamedIndividual (.asOWLNamedIndividual obj))
                                                                                  acc                             (if sub-ind
                                                                                                                                                 (update-in acc [:subjects prop-kw] (fnil conj #{}) sub-ind)
                                                                                                                                                 acc)
                                                                                  acc                             (if obj-ind
                                                                                                                                                 (update-in acc [:objects prop-kw] (fnil conj #{}) obj-ind)
                                                                                                                                                 acc)
                                                                                  acc                             (if (and sub-ind obj-ind)
                                                                                                                                                 (update-in acc [:pairs prop-kw] (fnil conj #{}) [sub-ind obj-ind])
                                                                                                                                                 acc)]
                                                                              acc))
                                                                          {:subjects {} :objects {} :pairs {}}
                                                                          (mapcat #(seq (.getAxioms ^OWLOntology % AxiomType/OBJECT_PROPERTY_ASSERTION)) closure))]
        (swap! (:indexes eng) assoc :obj-assertions idx)
        idx)))

(defn- ensure-data-assertion-index
  [eng]
  (or (get @(:indexes eng) :data-assertions)
      (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} (:ctx eng)
            closure                                                     (imports-closure manager ontology)
            idx                                                         (reduce
                                                                          (fn [acc ^OWLDataPropertyAssertionAxiom ax]
                                                                            (let [dpe     (.getProperty ax)
                                                                                  dp      (.asOWLDataProperty dpe)
                                                                                  prop-kw (coerce-entity eng dp :kw)
                                                                                  subj    (.getSubject ax)
                                                                                  lit     (.getObject ax)]
                                                                              (if (and prop-kw (.isNamed subj))
                                                                                (let [sub-ind ^OWLNamedIndividual (.asOWLNamedIndividual subj)]
                                                                                  (update-in acc [:values prop-kw sub-ind] (fnil conj []) lit))
                                                                                acc)))
                                                                          {:values {}}
                                                                          (mapcat #(seq (.getAxioms ^OWLOntology % AxiomType/DATA_PROPERTY_ASSERTION)) closure))]
        (swap! (:indexes eng) assoc :data-assertions idx)
        idx)))

(defn- ensure-assertions-by-subject
  [eng]
  (or (get @(:indexes eng) :assertions-by-subject)
      (let [ctx                                                         (:ctx eng)
            {:keys [^OWLOntologyManager manager ^OWLOntology ontology]} ctx
            closure                                                     (imports-closure manager ontology)
            df                                                          (ctx-data-factory ctx)
            add-entry                                                   (fn [m subj entry]
                                                                          (update m subj (fnil conj []) entry))
            idx                                                         (reduce
                                                                          (fn [acc ^OWLOntology o]
                                                                            (let [acc-obj
                                                                                  (reduce (fn [a ^OWLObjectPropertyAssertionAxiom ax]
                                                                                            (let [^OWLObjectPropertyExpression pe (.getProperty ax)
                                                                                                  np                              (.getNamedProperty pe)
                                                                                                  ^OWLIndividual subj             (.getSubject ax)
                                                                                                  ^OWLIndividual obj              (.getObject ax)]
                                                                                              (if (and (not (.isAnonymous pe)) (.isNamed subj))
                                                                                                (let [sub-ind (.asOWLNamedIndividual subj)
                                                                                                      prop    np
                                                                                                      value   (if (.isNamed obj)
                                                                                                                (.asOWLNamedIndividual obj)
                                                                                                                (anon-node->map eng (.asOWLAnonymousIndividual obj)))]
                                                                                                  (add-entry a sub-ind {:prop prop :kind :object :value value}))
                                                                                                a)))
                                                                                          acc
                                                                                          (.getAxioms o AxiomType/OBJECT_PROPERTY_ASSERTION))
                                                                                  acc-data
                                                                                  (reduce (fn [a ^OWLDataPropertyAssertionAxiom ax]
                                                                                            (let [subj (.getSubject ax)]
                                                                                              (if (.isNamed subj)
                                                                                                (let [sub-ind (.asOWLNamedIndividual subj)
                                                                                                      prop    (.asOWLDataProperty (.getProperty ax))
                                                                                                      lit     (.getObject ax)]
                                                                                                  (add-entry a sub-ind {:prop prop :kind :data :value lit}))
                                                                                                a)))
                                                                                          acc-obj
                                                                                          (.getAxioms o AxiomType/DATA_PROPERTY_ASSERTION))
                                                                                  acc-ann
                                                                                  (reduce (fn [a ^OWLAnnotationAssertionAxiom ax]
                                                                                            (let [subj (.getSubject ax)]
                                                                                              (if (instance? IRI subj)
                                                                                                (let [sub-ind (.getOWLNamedIndividual df ^IRI subj)
                                                                                                      prop    (.getProperty ax)
                                                                                                      val     (.getValue ax)
                                                                                                      value   (cond
                                                                                                                (instance? IRI val) (iri->kw ctx ^IRI val)
                                                                                                                (instance? org.semanticweb.owlapi.model.OWLAnonymousIndividual val)
                                                                                                                {:db/id (anon-id ^org.semanticweb.owlapi.model.OWLAnonymousIndividual val)}
                                                                                                                :else               (literal->edn ctx ^org.semanticweb.owlapi.model.OWLLiteral val))]
                                                                                                  (add-entry a sub-ind {:prop prop :kind :annotation :value value}))
                                                                                                a)))
                                                                                          acc-data
                                                                                          (.getAxioms o AxiomType/ANNOTATION_ASSERTION))]
                                                                              acc-ann))
                                                                          {}
                                                                          closure)]
        (swap! (:indexes eng) assoc :assertions-by-subject idx)
        idx)))

(defn- class-in-signature?
  [{:keys [ctx] :as eng} ^OWLClass cls]
  (when cls
    (if-let [sig (get-in @(:indexes eng) [:sig :class-set])]
      (contains? sig cls)
      (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} ctx]
        (boolean
          (some (fn [^OWLOntology o]
                  (.contains (.getClassesInSignature o) cls))
                (imports-closure manager ontology)))))))

(defn- term->named-class
  [eng term]
  (cond
    (instance? OWLClass term)
    (when (class-in-signature? eng term) term)

    (keyword? term)
    (let [cls (as-class (:ctx eng) term)]
      (when (class-in-signature? eng cls) cls))

    (instance? IRI term)
    (let [cls (.getOWLClass *df* ^IRI term)]
      (when (class-in-signature? eng cls) cls))

    :else nil))

(defn- ensure-exists-index
  [eng ^OWLObjectProperty prop]
  (or (get-in @(:indexes eng) [:exists prop])
      (let [reasoner (:reasoner eng)
            _        (ensure-inference! eng :class-hierarchy)
            _        (ensure-inference! eng :object-hierarchy)
            explicit (explicit-exists-index eng)
            base     (get explicit prop {:by-s {} :by-o {}})
            classes  (all-named-classes eng)
            by-o     (reduce (fn [m ^OWLClass o]
                               (let [subs (named-class-set
                                            (node-set->entities
                                              (.getSubClasses ^OWLReasoner reasoner
                                                              (.getOWLObjectSomeValuesFrom *df* prop o)
                                                              false)))]
                                 (if (seq subs)
                                   (assoc m o subs)
                                   m)))
                             {}
                             classes)
            by-s     (reduce (fn [m [^OWLClass o subs]]
                               (reduce (fn [m' ^OWLClass s]
                                         (update m' s (fnil conj #{}) o))
                                       m
                                       subs))
                             {}
                             by-o)
            by-o     (reduce-kv (fn [m filler subs]
                                  (update m filler (fnil into #{}) subs))
                                by-o
                                (:by-o base))
            by-s     (reduce-kv (fn [m sub fillers]
                                  (update m sub (fnil into #{}) fillers))
                                by-s
                                (:by-s base))
            table    {:by-o by-o :by-s by-s}]
        (swap! (:indexes eng) update :exists (fnil assoc {}) prop table)
        table)))

(defn- exists-by-o
  [eng ^OWLObjectProperty prop ^OWLClass o]
  (let [table (ensure-exists-index eng prop)]
    (or (get-in table [:by-o o]) #{})))

(defn- exists-by-s
  [eng ^OWLObjectProperty prop ^OWLClass s]
  (let [table (ensure-exists-index eng prop)]
    (or (get-in table [:by-s s]) #{})))


(defn- bound-value [row term]
  (if (qvar? term)
    (when (contains? row term) (get row term))
    term))

(defn- tbox-enabled? [{:keys [options]}]
  (if (contains? options :tbox?)
    (boolean (:tbox? options))
    true))

(defn- abox-enabled? [{:keys [options]}]
  (if (contains? options :abox?)
    (boolean (:abox? options))
    true))


(defn build-annotation-index!
  "Index annotation assertions: [subject-IRI, ap-IRI] -> vector of values."
  [{:keys [ctx] :as eng}]
  (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} ctx
        closure                                                     (imports-closure manager ontology)
        ann-idx                                                     (reduce
                                                                      (fn [m ^OWLOntology o]
                                                                        (reduce
                                                                          (fn [m' ^OWLAnnotationAssertionAxiom ax]
                                                                            (let [s                         (.getSubject ax)
                                                                                  ^OWLAnnotationProperty ap (.getProperty ax)
                                                                                  v                         (.getValue ax)]
                                                                              (update m' [s (.getIRI ap)] (fnil conj []) v)))
                                                                          m (.getAxioms o AxiomType/ANNOTATION_ASSERTION)))
                                                                      {} closure)
        bn-types                                                    (reduce
                                                                      (fn [m ^OWLOntology o]
                                                                        (reduce
                                                                          (fn [m' ^OWLClassAssertionAxiom ax]
                                                                            (let [ind (.getIndividual ax)
                                                                                  ce  (.getClassExpression ax)]
                                                                              (if (and (.isAnonymous ind) (not (.isAnonymous ce)))
                                                                                (let [bn-id (anon-id (.asOWLAnonymousIndividual ind))
                                                                                      cls   (.asOWLClass ce)
                                                                                      kw    (iri->kw ctx (.getIRI cls))]
                                                                                  (update m' bn-id (fnil conj #{}) kw))
                                                                                m')))
                                                                          m (.getAxioms o AxiomType/CLASS_ASSERTION)))
                                                                      {} closure)
        bn-types                                                    (into {} (map (fn [[k vs]] [k (vec vs)]) bn-types))
        bn-data                                                     (reduce
                                                                      (fn [m ^OWLOntology o]
                                                                        (reduce
                                                                          (fn [m' ^OWLDataPropertyAssertionAxiom ax]
                                                                            (let [sub (.getSubject ax)]
                                                                              (if (.isAnonymous sub)
                                                                                (let [bn-id (anon-id (.asOWLAnonymousIndividual sub))
                                                                                      dpe   (.getProperty ax)
                                                                                      dp    (.asOWLDataProperty dpe)
                                                                                      key   (iri->kw ctx (.getIRI dp))
                                                                                      val   (literal->edn ctx (.getObject ax))]
                                                                                  (update-in m' [bn-id key] (fnil conj []) val))
                                                                                m')))
                                                                          m (.getAxioms o AxiomType/DATA_PROPERTY_ASSERTION)))
                                                                      {} closure)]
    (swap! (:indexes eng) assoc :ann ann-idx :bn {:types bn-types :data bn-data})
    eng))

(defn- subjects-with
  "All named inds that have some value for object property r."
  [eng r]
  (let [ctx           (:ctx eng)
        prop          (as-objprop ctx r)
        someR         (.getOWLObjectSomeValuesFrom *df* prop (.getOWLThing *df*))
        from-reasoner (set (inst-of eng someR false))
        idx           (ensure-object-assertion-index eng)
        prop-kw       (coerce-entity eng prop :kw)
        explicit      (set (get-in idx [:subjects prop-kw]))]
    (vec (distinct (concat from-reasoner explicit)))))

(defn- subjects-with-data
  "All named individuals that possess data property dp."
  [eng dp]
  (let [ctx           (:ctx eng)
        prop          (as-dprop ctx dp)
        someD         (.getOWLDataSomeValuesFrom *df* prop (.getTopDatatype *df*))
        from-reasoner (set (inst-of eng someD false))
        idx           (ensure-data-assertion-index eng)
        prop-kw       (coerce-entity eng prop :kw)
        explicit      (set (keys (get-in idx [:values prop-kw])))]
    (vec (distinct (concat from-reasoner explicit)))))

(declare bn-id->map)

(defn- anon-node->map
  "Materialize an anonymous individual (blank node) to a small EDN map containing
   :db/id id, optional :rdf/type (kw or vector of kws), and data properties with EDN values."
  [{:keys [ctx indexes]} ^org.semanticweb.owlapi.model.OWLAnonymousIndividual anon]
  (let [id-str (anon-id anon)
        bn-idx (when indexes (get @indexes :bn))]
    (if bn-idx
      (let [{:keys [types data]} bn-idx
            ts                   (get types id-str)
            ds                   (get data id-str)
            data-map             (reduce-kv (fn [m k vs]
                                              (assoc m k (if (= 1 (count vs)) (first vs) (vec vs))))
                                            {}
                                            (or ds {}))
            base                 (cond-> data-map
                                   (seq ts) (assoc :rdf/type (if (= 1 (count ts)) (first ts) (vec ts))))]
        (assoc base :db/id id-str))
      (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} ctx
            types                                                       (->> (imports-closure manager ontology)
                                                                             (mapcat (fn [^OWLOntology o]
                                                                                       (for [^OWLClassAssertionAxiom ax (.getAxioms o AxiomType/CLASS_ASSERTION)
                                                                                             :let                       [ind (.getIndividual ax)]
                                                                                             :when                      (and (.isAnonymous ind)
                                                                                                                                                          (= id-str (anon-id (.asOWLAnonymousIndividual ind))))]
                                                                                         (.getClassExpression ax))))
                                                                             (remove #(.isAnonymous ^OWLClassExpression %))
                                                                             (map (fn [^OWLClassExpression ce]
                                                                                    (iri->kw ctx (.getIRI (.asOWLClass ce)))))
                                                                             distinct vec)
            dprops                                                      (->> (imports-closure manager ontology)
                                                                             (mapcat (fn [^OWLOntology o]
                                                                                       (for [^OWLDataPropertyAssertionAxiom ax (.getAxioms o AxiomType/DATA_PROPERTY_ASSERTION)
                                                                                             :let                              [sub (.getSubject ax)]
                                                                                             :when                             (and (.isAnonymous sub)
                                                                                                                                                                 (= id-str (anon-id (.asOWLAnonymousIndividual sub))))
                                                                                             :let                              [dpe (.getProperty ax)
                                                                                                                                                             dp (.asOWLDataProperty dpe)
                                                                                                                                                             key (iri->kw ctx (.getIRI dp))
                                                                                                                                                             val (literal->edn ctx (.getObject ax))]]
                                                                                         [key val])))
                                                                             (reduce (fn [m [k v]] (update m k (fnil conj []) v)) {})
                                                                             (reduce-kv (fn [m k vs]
                                                                                          (assoc m k (if (= 1 (count vs)) (first vs) (vec vs))))
                                                                                        {}))
            base                                                        (cond-> dprops
                                                                          (seq types) (assoc :rdf/type (if (= 1 (count types)) (first types) types)))]
        (assoc base :db/id id-str)))))

(defn- node-id-from
  ^NodeID [x]
  (cond
    (instance? NodeID x) x
    :else                (let [s       (str x)
                               trimmed (if (str/starts-with? s "_:") (subs s 2) s)]
                           (NodeID/getNodeID trimmed))))

(defn- as-anon-ind
  ^OWLAnonymousIndividual [ctx x]
  (cond
    (instance? OWLAnonymousIndividual x) x
    (map? x)                             (when-let [id (:db/id x)]
                                           (.getOWLAnonymousIndividual (ctx-data-factory ctx)
                                                                       (node-id-from id)))
    (string? x)                          (.getOWLAnonymousIndividual (ctx-data-factory ctx)
                                                                     (node-id-from x))
    :else                                nil))

(defn- flatten-types
  [t]
  (cond
    (keyword? t)                         [t]
    (and (sequential? t) (not (map? t))) (->> t (mapcat flatten-types) (distinct))
    :else                                []))

(defn- anon-types
  [eng ctx bn]
  (let [initial (flatten-types (:rdf/type bn))]
    (if (seq initial)
      (vec initial)
      (cond
        (and (map? bn) (:db/id bn))
        (let [m (bn-id->map eng (:db/id bn))]
          (vec (flatten-types (:rdf/type m))))

        (string? bn)
        (let [m (bn-id->map eng bn)]
          (vec (flatten-types (:rdf/type m))))

        :else
        (when-let [anon (as-anon-ind ctx bn)]
          (let [m     (anon-node->map eng anon)
                types (flatten-types (:rdf/type m))]
            (vec types)))))))

(defn- ensure-bn-index
  [eng]
  (or (get @(:indexes eng) :bn)
      (do
        (build-annotation-index! eng)
        (get @(:indexes eng) :bn))))

(defn- bn-id->map
  [eng id]
  (let [{:keys [types data]} (ensure-bn-index eng)
        ts                   (get types id)
        ds                   (get data id)
        data-map             (when ds
                               (reduce-kv (fn [m k vs]
                                            (assoc m k (if (= 1 (count vs)) (first vs) (vec vs))))
                                          {}
                                          ds))
        base                 (cond-> (or data-map {})
                               (seq ts) (assoc :rdf/type (if (= 1 (count ts)) (first ts) (vec ts))))]
    (when (seq base)
      (assoc base :db/id id))))

(defn- anon-individuals-of-type
  [eng ctx type-kw]
  (when type-kw
    (let [{:keys [types]} (ensure-bn-index eng)]
      (when (seq types)
        (->> types
             (keep (fn [[id tps]]
                     (when (some #{type-kw} tps)
                       (bn-id->map eng id))))
             vec)))))

(defn- all-anon-individuals
  [eng ctx]
  (let [{:keys [types]} (ensure-bn-index eng)]
    (when (seq types)
      (->> types
           (map (fn [[id _]] (bn-id->map eng id)))
           (remove nil?)
           vec))))

(def ^:private dl-ops
  #{:isa :rel :data :ann :filter :or :and :not :not-join :or-join :fn-expr
    :any            ; variable predicate over object/data assertions
    ;; triple-first DL ops
    :subc           ; rdfs/subClassOf
    :equivc         ; owl/equivalentClass
    :subp           ; rdfs/subPropertyOf (obj|data)
    :equivp         ; owl/equivalentProperty (obj|data)
    :inverse        ; owl/inverseOf (object properties only)
    :same           ; owl/sameAs
    :different       ; owl/differentFrom
    :range           ; rdfs/range
    :domain} )       ; rdfs/domain

(declare owl-restriction-keys)

(def ^:private owl-restriction-keys
  #{:owl/onProperty
    :owl/onProperties
    :owl/onObjectProperty
    :owl/onDataProperty
    :owl/onClass
    :owl/onDataRange
    :owl/someValuesFrom
    :owl/allValuesFrom
    :owl/hasValue
    :owl/hasSelf
    :owl/cardinality
    :owl/minCardinality
    :owl/maxCardinality
    :owl/qualifiedCardinality
    :owl/minQualifiedCardinality
    :owl/maxQualifiedCardinality})


;; Directness flags (defaults false per predicate)
(defn- direct?
  ^Boolean [eng k]
  (boolean (get-in (:options eng) [:direct k])))

(declare datasource-symbol? prep-tuple-binding prep-relation-binding variable-symbol? q)

(defn- normalize-atom
  "Normalize sugar like [?s :rdf/type C] -> [:isa ?s C], while leaving
   operator-first atoms intact. Property triples become [:rel ...] or [:data ...].
   Also lifts TBox/RBox triples to dedicated ops."
  [ctx atm]
  (letfn [(normalize-seq [form]
            (normalize-atom ctx (vec form)))]
    (cond
      (and (vector? atm) (seq atm) (datasource-symbol? (first atm)))
      [:with-src (first atm) (normalize-atom ctx (vec (rest atm)))]

      (and (seq? atm) (datasource-symbol? (first atm)))
      [:with-src (first atm) (normalize-seq (rest atm))]

      (and (seq? atm) (symbol? (first atm)))
      (case (first atm)
        or       (into [:or] (map #(normalize-atom ctx %) (rest atm)))
        and      [:and (map #(normalize-atom ctx %) (rest atm))]
        not      [:not (map #(normalize-atom ctx %) (rest atm))]
        not-join (let [[join-vars & clauses] (rest atm)]
                   [:not-join join-vars (map #(normalize-atom ctx %) clauses)])
        or-join  (let [[join-vars & clauses] (rest atm)]
                   [:or-join join-vars (map #(normalize-atom ctx %) clauses)])
        (normalize-atom ctx (into [] atm)))

      (and (vector? atm)
           (keyword? (first atm))
           (contains? dl-ops (first atm))) atm

      (and (vector? atm) (= 1 (count atm)) (seq? (first atm)))
      [:filter (first atm)]

      (and (vector? atm) (= 2 (count atm)) (seq? (first atm)))
      [:fn-expr (first atm) (second atm)]

      (and (vector? atm)
           (seq atm)
           (symbol? (first atm))
           (not (datasource-symbol? (first atm)))
           (not (variable-symbol? (first atm)))
           (not (keyword? (first atm))))
      [:rule (first atm) (vec (rest atm))]

      (and (vector? atm) (= 3 (count atm)))
      (let [[s p o] atm]
        (case p
          :rdf/type               [:isa s o]
          :rdfs/subClassOf        [:subc s o]
          :rdfs/range             [:range s o]
          :rdfs/domain            [:domain s o]
          :owl/equivalentClass    [:equivc s o]
          :rdfs/subPropertyOf     [:subp s o]
          :owl/equivalentProperty [:equivp s o]
          :owl/inverseOf          [:inverse s o]
          :owl/sameAs             [:same s o]
          :owl/differentFrom      [:different s o]
          (if (qvar? p)
            [:any s p o]
            (let [kind (property-kind ctx (kw->iri ctx p))]
              (case kind
                :data       [:data s p o]
                :object     [:rel s p o]
                :annotation [:ann s p o]
                [:rel s p o])))))

      (and (seq? atm))
      (normalize-atom ctx (vec atm))

      :else atm)))

(defn- bind
  "Unify variable or ground with value. Returns row or nil."
  [row term value]
  (letfn [(canon-entity [v]
            (when (and *bind-engine* (instance? org.semanticweb.owlapi.model.OWLEntity v))
              (try (coerce-entity *bind-engine* v :kw)
                   (catch Exception _ nil))))
          (canon-literal [v]
            (when (and *bind-engine* (instance? org.semanticweb.owlapi.model.OWLLiteral v))
              (try (literal->edn (:ctx *bind-engine*) v)
                   (catch Exception _ nil))))
          (compatible? [expected actual]
            (cond
              (= expected actual) true
              (and (keyword? expected) (instance? org.semanticweb.owlapi.model.OWLEntity actual))
              (= expected (canon-entity actual))
              (and (instance? org.semanticweb.owlapi.model.OWLEntity expected) (keyword? actual))
              (= (canon-entity expected) actual)
              (and (instance? org.semanticweb.owlapi.model.OWLEntity expected)
                   (instance? org.semanticweb.owlapi.model.OWLEntity actual))
              (= expected actual)
              (and (some? expected) (instance? org.semanticweb.owlapi.model.OWLLiteral actual))
              (= expected (canon-literal actual))
              (and (instance? org.semanticweb.owlapi.model.OWLLiteral expected) (some? actual))
              (= (canon-literal expected) actual)
              :else               false))]
    (cond
      (qvar? term)
      (if (contains? row term)
        (let [current (get row term)]
          (when (compatible? current value) row))
        (assoc row term value))

      :else
      (when (compatible? term value) row))))

(defn- bind-term
  "Bind `term` to `value`, coercing OWL entities/literals to keywords/EDN when term is ground.
   Returns the updated row or nil."
  [eng row term value]
  (cond
    (qvar? term)
    (bind row term value)

    (instance? org.semanticweb.owlapi.model.OWLEntity value)
    (let [kw (coerce-entity eng value :kw)]
      (when (= term kw) row))

    (instance? org.semanticweb.owlapi.model.OWLLiteral value)
    (let [edn (coerce-literal (:ctx eng) value :edn)]
      (when (= term edn) row))

    :else
    (when (= term value) row)))

(defn- atom-qvars
  [atom]
  (set (filter qvar? (tree-seq coll? seq atom))))

(defn- ensure-bound-vars
  [row vars label details]
  (let [missing (seq (remove #(contains? row %) vars))]
    (when missing
      (throw (ex-info (str label " requires bound variables")
                      (merge details {:missing (vec missing)})))))
  row)

(defmulti ^:private eval-atom
  (fn [eng row atom]
    (let [op (if (and (vector? atom) (keyword? (first atom))) (first atom) ::triple)] op)))

(defn- extend-rows
  [eng rows atoms]
  (let [rows (if (map? rows) [rows] rows)]
    (reduce (fn [acc atom]
              (mapcat #(eval-atom eng % atom) acc))
            rows
            atoms)))

(defmethod eval-atom ::triple [eng row atom]
  (eval-atom eng row (normalize-atom (:ctx eng) atom)))

(defmethod eval-atom :or
  [eng row [ _ & branches]]
  (mapcat #(eval-atom eng row %) branches))

(defmethod eval-atom :and
  [eng row [_ clauses]]
  (extend-rows eng row clauses))

(defmethod eval-atom :not
  [eng row [_ clauses]]
  (let [vars (set (mapcat atom-qvars clauses))]
    (when (seq vars)
      (ensure-bound-vars row vars "not clause" {:clauses clauses}))
    (if (seq (extend-rows eng row clauses))
      []
      [row])))

(defmethod eval-atom :not-join
  [eng row [_ join-vars clauses]]
  (ensure-bound-vars row join-vars "not-join clause" {:join-vars join-vars})
  (if (seq (extend-rows eng row clauses))
    []
    [row]))

(defmethod eval-atom :or-join
  [eng row [_ join-vars branches]]
  (ensure-bound-vars row join-vars "or-join clause" {:join-vars join-vars})
  (mapcat (fn [branch]
            (if (and (vector? branch) (= :and (first branch)))
              (extend-rows eng row (second branch))
              (extend-rows eng row [branch])))
          branches))

(defmethod eval-atom :with-src
  [_ row [_ src inner]]
  (let [sources *engine-sources*
        sub-eng (or (get sources src)
                    (throw (ex-info (str "Unknown datasource " src)
                                    {:datasource src})))]
    (binding [*bind-engine* sub-eng]
      (eval-atom sub-eng row inner))))

(defn- rule-zip-head
  [{:keys [name vars]} args]
  (when-not (= (count vars) (count args))
    (throw (ex-info "Rule invocation arity mismatch"
                    {:rule name :vars vars :args args})))
  (map vector vars (vec args)))

(defn- rule-required-check
  [{:keys [name required]} zipped row]
  (doseq [rv required]
    (let [term (some (fn [[rvar term]] (when (= rvar rv) term)) zipped)]
      (when (or (nil? term)
                (= term '_)
                (and (qvar? term) (not (contains? row term))))
        (throw (ex-info "Rule requires bound variables"
                        {:rule name :missing rv :invocation term}))))))

(defn- rule-initial-row
  [row zipped]
  (let [res (reduce (fn [acc [rvar term]]
                      (cond
                        (= acc ::fail) (reduced ::fail)
                        (= rvar '_)    acc
                        (= term '_)    acc
                        (and (qvar? term) (contains? row term))
                        (if-let [acc' (bind acc rvar (get row term))]
                          acc'
                          (reduced ::fail))
                        (qvar? term)   acc
                        :else
                        (if-let [acc' (bind acc rvar term)]
                          acc'
                          (reduced ::fail))))
                    {}
                    zipped)]
    (when-not (= res ::fail) res)))

(defn- merge-rule-result
  [outer-row zipped rule-row]
  (let [result (reduce (fn [acc [rvar term]]
                         (cond
                           (= acc ::fail) (reduced ::fail)
                           (= term '_)    acc
                           (= rvar '_)    acc
                           (qvar? term)
                           (cond
                             (contains? rule-row rvar)
                             (let [val (get rule-row rvar)]
                               (if-let [acc' (bind acc term val)]
                                 acc'
                                 (reduced ::fail)))

                             (contains? acc term) acc

                             :else (reduced ::fail))

                           :else acc))
                       outer-row
                       zipped)]
    (when-not (= result ::fail) result)))

(defn- eval-rule
  [eng row {:keys [name clauses] :as rule} args]
  (let [zipped (vec (rule-zip-head rule args))]
    (rule-required-check rule zipped row)
    (let [initial (or (rule-initial-row row zipped) {})]
      (if (nil? initial)
        []
        (let [rows (extend-rows eng initial clauses)]
          (mapcat (fn [rule-row]
                    (if-let [merged (merge-rule-result row zipped rule-row)]
                      [merged]
                      []))
                  rows))))))

(defmethod eval-atom :rule
  [eng row [_ rule-name args]]
  (let [rules (or *rule-index*
                  (throw (ex-info "Rule invocation requires rule set bound via %"
                                  {:rule rule-name})))]
    (let [defs (seq (get rules rule-name))]
      (when-not defs
        (throw (ex-info "Undefined rule"
                        {:rule rule-name :available (keys rules)})))
      (mapcat #(eval-rule eng row % args) defs))))

;; -------- Query prep: normalize and pre-coerce ground terms --------------

(defn- kind-of-prop
  "Determine property kind using engine indices or ctx caches. Returns :object|:data|:annotation|nil."
  [{:keys [ctx] :as eng} p]
  (cond
    (instance? OWLObjectProperty p)     :object
    (instance? OWLDataProperty p)       :data
    (instance? OWLAnnotationProperty p) :annotation
    (instance? IRI p)                   (property-kind ctx p)
    (keyword? p)                        (property-kind ctx (kw->iri ctx p))
    :else                               nil))

(defn- term->objprop
  [eng term]
  (let [{:keys [ctx]} eng]
    (cond
      (instance? OWLObjectProperty term) term
      (keyword? term)
      (when (= :object (kind-of-prop eng term)) (as-objprop ctx term))
      (instance? IRI term)
      (let [prop (.getOWLObjectProperty *df* ^IRI term)]
        (when (= :object (kind-of-prop eng prop)) prop))
      :else                              nil)))

(defn- normalize-atom-fast
  "Normalize and prefer engine-aware property kind resolution."
  [eng atm]
  (let [ctx (:ctx eng)]
    (cond
      (and (vector? atm)
           (seq atm)
           (datasource-symbol? (first atm)))
      [:with-src (first atm) (normalize-atom-fast eng (vec (rest atm)))]

      (and (seq? atm) (symbol? (first atm)) (= 'or (first atm)))
      (into [:or] (map #(normalize-atom-fast eng %) (rest atm)))

      (and (vector? atm)
           (keyword? (first atm))
           (contains? dl-ops (first atm))) atm

      (and (vector? atm)
           (seq atm)
           (symbol? (first atm))
           (not (datasource-symbol? (first atm)))
           (not (variable-symbol? (first atm)))
           (not (keyword? (first atm))))
      [:rule (first atm) (vec (rest atm))]

      (and (vector? atm) (= 3 (count atm)))
      (let [[s p o] atm]
        (case p
          :rdf/type               [:isa s o]
          :rdfs/subClassOf        [:subc s o]
          :owl/equivalentClass    [:equivc s o]
          :rdfs/range             [:range s o]
          :rdfs/domain            [:domain s o]
          :rdfs/subPropertyOf     [:subp s o]
          :owl/equivalentProperty [:equivp s o]
          :owl/inverseOf          [:inverse s o]
          :owl/sameAs             [:same s o]
          :owl/differentFrom      [:different s o]
          (if (qvar? p)
            [:any s p o]
            (let [kind (kind-of-prop eng p)]
              (case kind
                :data       [:data s p o]
                :object     [:rel s p o]
                :annotation [:ann s p o]
                [:rel s p o])))))

      :else (normalize-atom ctx atm))))

(defn- compile-atom
  "Pre-coerce ground terms into OWL API objects to reduce per-step work."
  [ctx [op & xs :as atm]]
  (let [cce   #(class-expr ctx %)
        ci    #(as-ind ctx %)
        cop   #(as-objprop ctx %)
        cdp   #(as-dprop ctx %)
        keepv (fn [x f] (if (qvar? x) x (f x)))]
    (case op
      :isa       (let [[s ce] xs] [:isa (keepv s ci) (if (qvar? ce) ce (cce ce))])
      :rel       (let [[s r o] xs]
                   (let [prop (if (qvar? r)
                                r
                                (or (as-objprop ctx r) r))]
                     [:rel s prop o]))
      :data      (let [[s dp lit] xs]
                   (let [prop (if (qvar? dp)
                                dp
                                (or (as-dprop ctx dp) dp))]
                     [:data (keepv s ci) prop (if (qvar? lit) lit (as-literal ctx lit))]))
      :subc      (let [[a b] xs] [:subc (if (qvar? a) a (cce a)) (if (qvar? b) b (cce b))])
      :range     atm
      :domain    atm
      :equivc    (let [[a b] xs] [:equivc (if (qvar? a) a (cce a)) (if (qvar? b) b (cce b))])
      :subp      (let [[a b] xs] [:subp (keepv a identity) (keepv b identity)])
      :equivp    (let [[a b] xs] [:equivp (keepv a identity) (keepv b identity)])
      :inverse   (let [[a b] xs] [:inverse (keepv a cop) (keepv b cop)])
      :same      (let [[a b] xs] [:same (keepv a ci) (keepv b ci)])
      :different (let [[a b] xs] [:different (keepv a ci) (keepv b ci)])
      :ann       atm
      :any       atm
      :or        (into [:or] (map #(compile-atom ctx %) xs))
      :and       (let [clauses (first xs)] [:and (map #(compile-atom ctx %) clauses)])
      :not       (let [clauses (first xs)] [:not (map #(compile-atom ctx %) clauses)])
      :not-join  (let [[join-vars clauses] xs] [:not-join join-vars (map #(compile-atom ctx %) clauses)])
      :or-join   (let [[join-vars branches] xs]
                   [:or-join join-vars (map #(compile-atom ctx %) branches)])
      :filter    atm
      :fn-expr   (let [[expr target] xs] [:fn-expr expr target])
      atm)))

(defmethod eval-atom :isa
  [{:keys [^OWLReasoner reasoner ctx] :as eng} row [_ x ce]]
  (let [direct      (direct? eng :rdf/type)
        ce-class    (when (qground? ce)
                      (let [cls (class-expr ctx ce)]
                        (when (instance? OWLClass cls)
                          (let [iri (.getIRI ^OWLClass cls)]
                            (cond
                              (= iri (IRI/create "http://www.w3.org/2002/07/owl#ObjectProperty"))     :object
                              (= iri (IRI/create "http://www.w3.org/2002/07/owl#DatatypeProperty"))   :data
                              (= iri (IRI/create "http://www.w3.org/2002/07/owl#AnnotationProperty")) :annotation
                              (= iri (IRI/create "http://www.w3.org/2002/07/owl#Class"))              :class
                              :else                                                                   nil)))))
        existing    (bound-value row x)
        type->kw    (fn [v]
                      (cond
                        (keyword? v)           v
                        (instance? OWLClass v) (coerce-entity eng v :kw)
                        (instance? IRI v)      (iri->kw ctx v)
                        :else                  nil))
        ce-bound    (when (qvar? ce) (get row ce))
        ce-bound-kw (when ce-bound (type->kw ce-bound))
        bn?         (and (map? existing) (:db/id existing))
        bn-types    (when bn? (anon-types eng ctx existing))
        bn-set      (when bn-types (set bn-types))
        ce-kw       (when (qground? ce) (type->kw ce))
        kind-set    (when ce-class
                      (let [coerce (fn [e]
                                     (if (instance? org.semanticweb.owlapi.model.OWLEntity e)
                                       (coerce-entity eng e :kw)
                                       e))]
                        (case ce-class
                          :object     (set (remove nil? (map coerce (all-object-properties eng))))
                          :data       (set (remove nil? (map coerce (all-data-properties eng))))
                          :annotation (set (remove nil? (map coerce (all-annotation-properties eng))))
                          :class      (set (remove nil? (map coerce (all-named-classes eng))))
                          nil)))]
    (cond
      (and bn? ce-bound-kw)
      (if (and bn-set (contains? bn-set ce-bound-kw))
        [row]
        [])

      (and bn? ce-kw)
      (if (and bn-set (contains? bn-set ce-kw))
        [row]
        [])

      (and bn? (qvar? ce))
      (if (seq bn-types)
        (keep #(bind row ce %) bn-types)
        [])

      (and ce-class (qvar? x) (nil? existing))
      (keep #(bind row x %) kind-set)

      (and ce-class (or (qground? x) existing))
      (let [x-val (cond
                    (keyword? x)        x
                    (keyword? existing) existing
                    (instance? org.semanticweb.owlapi.model.OWLEntity existing)
                    (coerce-entity eng existing :kw)
                    (instance? org.semanticweb.owlapi.model.OWLEntity x)
                    (coerce-entity eng x :kw)
                    :else
                    (try
                      (coerce-entity eng
                                     (cond
                                       (= ce-class :object)     (as-objprop ctx x)
                                       (= ce-class :data)       (as-dprop ctx x)
                                       (= ce-class :annotation) (as-annprop ctx x)
                                       (= ce-class :class)      (as-class ctx x)
                                       :else                    nil)
                                     :kw)
                      (catch Exception _ nil)))]
        (when (and x-val (contains? kind-set x-val))
          (if existing
            [row]
            (if-let [row' (bind row x x-val)]
              [row']
              []))))

      (and (qground? x) (qground? ce))
      (let [ce' (class-expr ctx ce)]
        (when (.isEntailed reasoner (.getOWLClassAssertionAxiom *df* ce' (as-ind ctx x))) [row]))

      (and (qground? x) (qvar? ce))
      (keep #(bind row ce %)
            (types-of eng (as-ind ctx x) direct))

      (and (qvar? x) (qground? ce))
      (let [ce-expr (class-expr ctx ce)
            named   (inst-of eng ce-expr direct)
            blanks  (or (when ce-kw (anon-individuals-of-type eng ctx ce-kw)) [])]
        (concat
          (keep #(bind row x %) named)
          (mapcat (fn [bn]
                    (when-let [row' (bind row x bn)]
                      [row']))
                  blanks)))

      :else
      (let [named-rows (for [^OWLNamedIndividual i (all-named-individuals eng)
                             ^OWLClass C           (types-of eng i direct)
                             :let                  [row' (bind row x i)]
                             :when                 row'
                             :let                  [row'' (bind row' ce C)]
                             :when                 row'']
                         row'')
            blank-rows (for [bn    (or (all-anon-individuals eng ctx) [])
                             type  (anon-types eng ctx bn)
                             :let  [row' (bind row x bn)]
                             :when row'
                             :let  [ce-class (class-expr ctx type)]
                             :let  [row'' (bind row' ce ce-class)]
                             :when row'']
                         row'')]
        (concat named-rows blank-rows)))))

(defn- enum-role-forward [{:keys [^OWLReasoner reasoner ctx]} s r]
  (-> (.getObjectPropertyValues reasoner (as-ind ctx s) (as-objprop ctx r)) node-set->entities))

(defn- enum-role-backward [{:keys [^OWLReasoner reasoner ctx]} o r]
  (let [inv (.getOWLObjectInverseOf *df* (as-objprop ctx r))]
    (-> (.getObjectPropertyValues reasoner (as-ind ctx o) inv) node-set->entities)))

(declare ensure-object-assertion-index)

(defmethod eval-atom :rel
  [eng row [_ s r o]]
  (let [{:keys [ctx]} eng
        rp            (as-objprop ctx r)
        sb            (bound-value row s)
        ob            (bound-value row o)
        s-class       (term->named-class eng sb)
        o-class       (term->named-class eng ob)
        abox?         (abox-enabled? eng)
        normalize-val (fn [v]
                        (cond
                          (= ::missing v)                                      v
                          (instance? org.semanticweb.owlapi.model.OWLEntity v) (coerce-entity eng v :kw)
                          (instance? IRI v)                                    (iri->kw ctx ^IRI v)
                          :else                                                v))
        emit          (fn [S O]
                        (when-let [row1 (bind-term eng row s S)]
                          (let [row2 (if (qvar? r)
                                       (bind row1 r rp)
                                       row1)]
                            (when row2
                              (bind-term eng row2 o O)))))]
    (let [prop-key   (cond
                       (instance? OWLObjectProperty r)  (coerce-entity eng r :kw)
                       (instance? OWLObjectProperty rp) (coerce-entity eng rp :kw)
                       (keyword? r)                     r
                       :else                            r)
          owl-key?   (and (keyword? prop-key) (contains? owl-restriction-keys prop-key))
          owl-index  (when owl-key? (restrictions-by-key eng prop-key))
          prop-index (when (and (keyword? prop-key) (not owl-key?)) (restrictions-by-key eng :prop prop-key))]
      (cond
        (and (map? sb) (not (:db/id sb)))
        (let [val (normalize-val (get sb prop-key ::missing))]
          (cond
            (= ::missing val)
            []

            (qvar? o)
            (if-let [row' (bind-term eng row o val)]
              [row']
              [])

            :else
            (if-let [row' (bind-term eng row o val)]
              [row']
              [])))

        (and (not owl-key?) (or s-class o-class))
        []

        (and (map? ob) (:db/id ob))
        (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} ctx
              bn-id                                                       (str (:db/id ob))
              closure                                                     (imports-closure manager ontology)]
          (for [^OWLOntology ont                    closure
                ^OWLObjectPropertyAssertionAxiom ax (.getAxioms ont AxiomType/OBJECT_PROPERTY_ASSERTION)
                :let                                [^OWLObjectPropertyExpression pe (.getProperty ax)
                                                                                  np (.getNamedProperty pe)]
                :when                               (not (.isAnonymous pe))
                :let                                [prop-kw (coerce-entity eng np :kw)]
                :when                               (cond
                                                      (keyword? prop-key) (= prop-kw prop-key)
                                                      (qvar? r)           true
                                                      :else               true)
                :let                                [^OWLIndividual sub (.getSubject ax)
                                                                                  ^OWLIndividual obj (.getObject ax)]
                :when                               (and (.isNamed sub) (.isAnonymous obj)
                                                                                      (= (anon-id (.asOWLAnonymousIndividual obj)) bn-id))
                :let                                [row1 (bind-term eng row s (.asOWLNamedIndividual sub))]
                :when                               row1
                :let                                [row2 (if (qvar? r) (bind row1 r prop-kw) row1)]
                :when                               row2
                :let                                [row3 (bind-term eng row2 o ob)]
                :when                               row3]
            row3))

        :else
        (let [tbox-res
              (when (and (tbox-enabled? eng) rp)
                (cond
                  (and s-class o-class)
                  (let [subs (exists-by-o eng rp o-class)]
                    (if (contains? subs s-class)
                      (if-let [row' (emit s-class o-class)] [row'] [])
                      []))

                  (and s-class (qvar? o))
                  (for [^OWLClass O (exists-by-s eng rp s-class)
                        :let        [row' (emit s-class O)]
                        :when       row']
                    row')

                  (and o-class (qvar? s))
                  (for [^OWLClass S (exists-by-o eng rp o-class)
                        :let        [row' (emit S o-class)]
                        :when       row']
                    row')

                  (and (qvar? s) (qvar? o))
                  (for [^OWLClass O (all-named-classes eng)
                        :let        [subs (exists-by-o eng rp O)]
                        :when       (seq subs)
                        ^OWLClass S subs
                        :let        [row' (emit S O)]
                        :when       row']
                    row')

                  :else
                  []))

              abox-res
              (when (and abox? (not (or s-class o-class)))
                (letfn [(ensure-ind [term]
                          (cond
                            (instance? OWLNamedIndividual term) term
                            (keyword? term)                     (as-ind ctx term)
                            (instance? IRI term)                (.getOWLNamedIndividual *df* ^IRI term)
                            :else                               term))]
                  (let [sb-ind (when (and sb (not (map? sb))) (ensure-ind sb))
                        ob-ind (when (and ob (not (map? ob))) (ensure-ind ob))]
                    (cond
                      (and sb-ind (nil? rp) (= :structural (:reasoner-selection eng)))
                      (let [row0    (bind-term eng row s sb-ind)
                            entries (when row0 (get (ensure-assertions-by-subject eng) sb-ind))]
                        (if (and row0 (seq entries))
                          (for [{:keys [prop value]} entries
                                :let                 [row1 (bind row0 r prop)]
                                :when                row1
                                :let                 [row2 (bind-term eng row1 o value)]
                                :when                row2]
                            row2)
                          []))

                      (and sb-ind ob-ind)
                      (let [vals (obj-values eng sb-ind rp)]
                        (if (some #{ob-ind} vals)
                          (if-let [row' (emit sb-ind ob-ind)] [row'] [])
                          []))

                      sb-ind
                      (let [named (for [t     (obj-values eng sb-ind rp)
                                        :let  [row' (emit sb-ind t)]
                                        :when row']
                                    row')
                            anon  (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} ctx
                                        prop-set                                                    (set (cons rp (sub-objprops eng rp false)))]
                                    (for [^OWLOntology o-ont                  (imports-closure manager ontology)
                                          ^OWLObjectPropertyAssertionAxiom ax (.getAxioms o-ont AxiomType/OBJECT_PROPERTY_ASSERTION)
                                          :let                                [^OWLObjectPropertyExpression pe (.getProperty ax)
                                                                                                            np (.getNamedProperty pe)]
                                          :when                               (contains? prop-set np)
                                          :let                                [sub (.getSubject ax)]
                                          :when                               (= (.asOWLNamedIndividual sub) sb-ind)
                                          :let                                [^OWLIndividual obj (.getObject ax)]
                                          :when                               (.isAnonymous obj)
                                          :let                                [m (anon-node->map eng (.asOWLAnonymousIndividual obj))]
                                          :let                                [row' (emit sb-ind m)]
                                          :when                               row']
                                      row'))]
                        (concat named anon))

                      ob-ind
                      (for [t     (obj-values-inv eng ob-ind rp)
                            :let  [row' (emit t ob-ind)]
                            :when row']
                        row')

                      :else
                      (for [^OWLNamedIndividual t (subjects-with eng r)
                            ^OWLNamedIndividual u (obj-values eng t rp)
                            :let                  [row' (emit t u)]
                            :when                 row']
                        row')))))
              restriction-rows
              (when (and (nil? sb) (keyword? prop-key))
                (let [records (cond
                                owl-key?
                                (if (qvar? o)
                                  (mapcat identity (vals (or owl-index {})))
                                  (or (get owl-index o) []))
                                prop-index prop-index
                                :else      nil)]
                  (when (seq records)
                    (mapcat (fn [{:keys [restriction sub]}]
                              (let [val (get restriction prop-key ::missing)]
                                (let [norm-val (normalize-val val)
                                      subj     (if owl-key? restriction sub)]
                                  (cond
                                    (= ::missing val) []
                                    (qvar? o)
                                    (if-let [row1 (bind row s subj)]
                                      (if-let [row2 (bind-term eng row1 o norm-val)]
                                        [row2]
                                        [])
                                      [])
                                    :else
                                    (if-let [row1 (bind row s subj)]
                                      (if-let [row2 (bind-term eng row1 o norm-val)]
                                        [row2]
                                        [])
                                      [])))))
                            records))))]
          (let [combined (concat (or restriction-rows []) (or tbox-res []) (or abox-res []))
                drop-restriction
                (remove (fn [entry]
                          (when (vector? entry)
                            (let [cnt  (count entry)
                                  prop (case cnt
                                         0 nil
                                         1 (first entry)
                                         2 (first entry)
                                         (second entry))
                                  v    (case cnt
                                         0 nil
                                         1 nil
                                         2 (second entry)
                                         (nth entry (dec cnt)))]
                              (and (keyword? prop)
                                   (not= prop :rdfs/subClassOf)
                                   (map? v)
                                   (= (:rdf/type v) :owl/Restriction)))))
                        combined)]
            (if (and (qvar? r) s-class)
              (remove (fn [entry]
                        (when (vector? entry)
                          (let [cnt  (count entry)
                                prop (case cnt
                                       0 nil
                                       1 (first entry)
                                       2 (first entry)
                                       (second entry))]
                            (and (keyword? prop)
                                 (not= prop :rdfs/subClassOf))))))
              drop-restriction)
            drop-restriction))))))

;; Variable predicate over object/data assertions
(defmethod eval-atom :any
  [eng row [_ s p o]]
  (let [{:keys [ctx]}     eng
        sb                (bound-value row s)
        ob                (bound-value row o)
        pb                (bound-value row p)
        s-class           (term->named-class eng sb)
        o-class           (term->named-class eng ob)
        pb-prop           (term->objprop eng pb)
        selection         (:reasoner-selection eng)
        abox-index        (when (abox-enabled? eng)
                            (ensure-assertions-by-subject eng))
        cached-assertions abox-index
        tbox?             (tbox-enabled? eng)
        emit-tbox         (fn [S prop O]
                            (if-let [row1 (bind-term eng row s S)]
                              (let [expr        (class-expr->form ctx O)
                                    restriction {:rdf/type           :owl/Restriction
                                                 :owl/onProperty     (coerce-entity eng prop :kw)
                                                 :owl/someValuesFrom expr}
                                    out         (transient [])]
                                (when-let [row2 (bind row1 p :rdfs/subClassOf)]
                                  (when-let [row3 (bind-term eng row2 o restriction)]
                                    (conj! out row3)))
                                (persistent! out))
                              []))
        tbox-res
        (when tbox?
          (let [props (cond
                        pb-prop   [pb-prop]
                        (qvar? p) (all-object-properties eng)
                        :else     [])]
            (mapcat
              (fn [^OWLObjectProperty prop]
                (cond
                  (and s-class o-class)
                  (let [subs (exists-by-o eng prop o-class)]
                    (if (contains? subs s-class)
                      (emit-tbox s-class prop o-class)
                      []))

                  (and s-class (qvar? o))
                  (mapcat #(emit-tbox s-class prop %)
                          (exists-by-s eng prop s-class))

                  (and o-class (qvar? s))
                  (mapcat #(emit-tbox % prop o-class)
                          (exists-by-o eng prop o-class))

                  (and (qvar? s) (qvar? o))
                  (mapcat (fn [^OWLClass O]
                            (let [subs (exists-by-o eng prop O)]
                              (when (seq subs)
                                (mapcat #(emit-tbox % prop O) subs))))
                          (all-named-classes eng))

                  :else []))
              props)))
        class-annotations
        (when s-class
          (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} ctx
                subj-iri                                                    (.getIRI ^OWLClass s-class)
                row1                                                        (bind-term eng row s s-class)]
            (when row1
              (for [^OWLOntology ont                (imports-closure manager ontology)
                    ^OWLAnnotationAssertionAxiom ax (.getAnnotationAssertionAxioms ont subj-iri)
                    :let                            [^OWLAnnotationProperty ap (.getProperty ax)
                                                                                  val (.getValue ax)
                                                                                  row2 (bind-term eng row1 p ap)
                                                                                  bound-o (cond
                                                                                            (instance? IRI val) (iri->kw ctx ^IRI val)
                                                                                            (instance? org.semanticweb.owlapi.model.OWLAnonymousIndividual val)
                                                                                            {:db/id (anon-id ^org.semanticweb.owlapi.model.OWLAnonymousIndividual val)}
                                                                                            (instance? org.semanticweb.owlapi.model.OWLLiteral val)
                                                                                            (literal->edn ctx ^org.semanticweb.owlapi.model.OWLLiteral val)
                                                                                            :else               val)]
                    :when                           (and row2 bound-o)]
                (bind-term eng row2 o bound-o)))))
        class-superclasses
        (when s-class
          (when-let [row1 (bind-term eng row s s-class)]
            (mapcat (fn [^OWLClass sup-class]
                      (when-let [row2 (bind-term eng row1 p :rdfs/subClassOf)]
                        (let [form (class-expr->form ctx sup-class)]
                          (when-let [row3 (bind-term eng row2 o form)]
                            [row3]))))
                    (supers-of-class eng s-class false))))
        base
        (cond
          ;; Enumerate assertions when both subject and predicate are variables
          (and (nil? sb) (qvar? p) abox-index)
          (mapcat (fn [[sub entries]]
                    (let [row0 (bind-term eng row s sub)]
                      (when row0
                        (mapcat (fn [{:keys [prop value]}]
                                  (when-let [row1 (bind row0 p prop)]
                                    (when-let [row2 (bind-term eng row1 o value)]
                                      [row2])))
                                entries))))
                  abox-index)

          ;; Unbound subject but ground filler: use restriction index to enumerate matching
          (and (nil? sb) (not (qvar? o)))
          (let [val  (or ob o)
                keys (cond
                       (keyword? pb) (when (contains? owl-restriction-keys pb) [pb])
                       (nil? pb)     owl-restriction-keys
                       :else         nil)]
            (if (seq keys)
              (mapcat (fn [key]
                        (when (contains? owl-restriction-keys key)
                          (let [recs (restrictions-by-key eng key val)]
                            (mapcat (fn [{:keys [restriction]}]
                                      (let [row1 (bind row s restriction)]
                                        (when row1
                                          (let [row2 (bind row1 p key)]
                                            (when row2
                                              (when-let [row3 (bind-term eng row2 o (get restriction key))]
                                                [row3]))))))
                                    (or recs [])))))
                      keys)
              []))

          ;; Treat EDN restriction/class maps as pseudo individuals
          (and (map? sb) (not (:db/id sb)))
          (let [pairs (seq sb)
                key   (or pb p)]
            (if (qvar? p)
              (mapcat (fn [[k v]]
                        (when-let [row1 (bind row p k)]
                          (when-let [row2 (bind-term eng row1 o v)]
                            [row2])))
                      pairs)
              (let [val (get sb key ::missing)]
                (if (= ::missing val)
                  []
                  (if-let [row1 (bind row p key)]
                    (when-let [row2 (bind-term eng row1 o val)]
                      [row2])
                    [])))))

          (or s-class o-class)
          []

          ;; Ground subject is a blank node: enumerate from asserted axioms
          (and (map? sb) (:db/id sb))
          (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} ctx
                bn-id                                                       (str (:db/id sb))]
            (concat
              ;; object properties from asserted axioms
              (for [^OWLOntology o-ont                  (imports-closure manager ontology)
                    ^OWLObjectPropertyAssertionAxiom ax (.getAxioms o-ont AxiomType/OBJECT_PROPERTY_ASSERTION)
                    :let                                [sub (.getSubject ax)]
                    :when                               (and (.isAnonymous sub)
                                                                                          (= bn-id (anon-id (.asOWLAnonymousIndividual sub))))
                    :let                                [^OWLObjectPropertyExpression pe (.getProperty ax)
                                                                                      ^OWLIndividual obj (.getObject ax)
                                                                                      rp  (.getNamedProperty pe)
                                                                                      bound-o (if (.isAnonymous obj)
                                                                                                {:db/id (anon-id (.asOWLAnonymousIndividual obj))}
                                                                                                (.asOWLNamedIndividual obj))]
                    :when                               (not (.isAnonymous pe))]
                (-> row (bind p rp) (bind o bound-o)))
              ;; data properties from asserted axioms
              (for [^OWLOntology o-ont                (imports-closure manager ontology)
                    ^OWLDataPropertyAssertionAxiom ax (.getAxioms o-ont AxiomType/DATA_PROPERTY_ASSERTION)
                    :let                              [sub (.getSubject ax)]
                    :when                             (and (.isAnonymous sub)
                                                                                        (= bn-id (anon-id (.asOWLAnonymousIndividual sub))))
                    :let                              [^OWLDataPropertyExpression dpe (.getProperty ax)
                                                                                    dp (.asOWLDataProperty dpe)
                                                                                    lit (.getObject ax)]]
                (-> row (bind p dp) (bind o lit)))
              ;; annotation assertions with blank subject
              (for [^OWLOntology o-ont              (imports-closure manager ontology)
                    ^OWLAnnotationAssertionAxiom ax (.getAxioms o-ont AxiomType/ANNOTATION_ASSERTION)
                    :let                            [subj (.getSubject ax)]
                    :when                           (and (instance? org.semanticweb.owlapi.model.OWLAnonymousIndividual subj)
                                                                                      (= bn-id (anon-id ^org.semanticweb.owlapi.model.OWLAnonymousIndividual subj)))
                    :let                            [^OWLAnnotationProperty ap (.getProperty ax)
                                                                                  val (.getValue ax)
                                                                                  bound-o (cond
                                                                                            (instance? IRI val) (iri->kw ctx ^IRI val)
                                                                                            (instance? org.semanticweb.owlapi.model.OWLAnonymousIndividual val)
                                                                                            {:db/id (anon-id ^org.semanticweb.owlapi.model.OWLAnonymousIndividual val)}
                                                                                            :else               (literal->edn ctx ^org.semanticweb.owlapi.model.OWLLiteral val))]]
                (-> row (bind p ap) (bind o bound-o)))))

          ;; Ground subject (non-class): enumerate outgoing assertions
          (and (some? sb) (not (map? sb)) (not s-class))
          (let [si                                                          (as-ind ctx sb)
                cached                                                      (when cached-assertions (get cached-assertions si))
                {:keys [^OWLOntologyManager manager ^OWLOntology ontology]} ctx]
            (if (and cached (seq cached))
              (let [entries (if pb (filter #(= (:prop %) pb) cached) cached)
                    row1    (bind-term eng row s si)]
                (when row1
                  (mapcat (fn [{:keys [prop value]}]
                            (let [row2 (if (qvar? p)
                                         (bind row1 p prop)
                                         (if (= prop pb) row1 nil))]
                              (when row2
                                (when-let [row3 (bind-term eng row2 o value)]
                                  [row3]))))
                          entries)))
              (concat
                ;; object properties
                (for [^OWLObjectProperty rp (all-object-properties eng)
                      ^OWLNamedIndividual u (obj-values eng si rp)]
                  (-> row (bind p rp) (bind o u)))
                ;; object properties with anonymous objects from asserted axioms
                (for [^OWLOntology o-ont                  (imports-closure manager ontology)
                      ^OWLObjectPropertyAssertionAxiom ax (.getAxioms o-ont AxiomType/OBJECT_PROPERTY_ASSERTION)
                      :let                                [sub (.getSubject ax)]
                      :when                               (= (.asOWLNamedIndividual sub) si)
                      :let                                [^OWLObjectPropertyExpression pe (.getProperty ax)
                                                                                        ^OWLIndividual obj (.getObject ax)]
                      :when                               (and (not (.isAnonymous pe)) (.isAnonymous obj))
                      :let                                [^OWLObjectProperty rp (.getNamedProperty pe)
                                                                                        m (anon-node->map eng (.asOWLAnonymousIndividual obj))]]
                  (-> row (bind p rp) (bind o m)))
                ;; data properties
                (for [^OWLDataProperty dp (all-data-properties eng)
                      v                   (data-values-of eng si dp)]
                  (-> row (bind p dp) (bind o v)))
                ;; annotation assertions
                (for [^OWLOntology o-ont              (imports-closure manager ontology)
                      ^OWLAnnotationAssertionAxiom ax (.getAxioms o-ont AxiomType/ANNOTATION_ASSERTION)
                      :let                            [subj (.getSubject ax)]
                      :when                           (and (instance? IRI subj) (= (kw->iri ctx sb) subj))
                      :let                            [^OWLAnnotationProperty ap (.getProperty ax)
                                                                                    val (.getValue ax)
                                                                                    bound-o (cond
                                                                                              (instance? IRI val) (iri->kw ctx ^IRI val)
                                                                                              (instance? org.semanticweb.owlapi.model.OWLAnonymousIndividual val)
                                                                                              {:db/id (anon-id ^org.semanticweb.owlapi.model.OWLAnonymousIndividual val)}
                                                                                              :else               (literal->edn ctx ^org.semanticweb.owlapi.model.OWLLiteral val))]]
                  (-> row (bind p ap) (bind o bound-o))))))

          ;; Ground object (non-class): enumerate incoming assertions
          (and (some? ob) (not (map? ob)) (not o-class))
          (let [oi (as-ind ctx ob)]
            (for [^OWLObjectProperty rp (all-object-properties eng)
                  ^OWLNamedIndividual t (obj-values-inv eng oi rp)]
              (-> row (bind s t) (bind p rp))))

          :else
          ;; Both sides var or class bindings: only consider annotations if neither side is bound to a class
          (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} ctx]
            (concat
              (when (not (or s-class o-class))
                (for [^OWLObjectProperty rp (all-object-properties eng)
                      ^OWLNamedIndividual t (all-named-individuals eng)
                      ^OWLNamedIndividual u (obj-values eng t rp)]
                  (-> row (bind s t) (bind p rp) (bind o u))))
              (when (not (or s-class (qground? s)))
                (for [^OWLOntology o-ont              (imports-closure manager ontology)
                      ^OWLAnnotationAssertionAxiom ax (.getAxioms o-ont AxiomType/ANNOTATION_ASSERTION)
                      :let                            [subj (.getSubject ax)]
                      :when                           (instance? IRI subj)
                      :let                            [^OWLAnnotationProperty ap (.getProperty ax)
                                                                                    val (.getValue ax)
                                                                                    bound-s (iri->kw ctx ^IRI subj)
                                                                                    bound-o (if (instance? IRI val)
                                                                                              (iri->kw ctx ^IRI val)
                                                                                              (literal->edn ctx ^org.semanticweb.owlapi.model.OWLLiteral val))]]
                  (-> row (bind s bound-s)
                      (bind p ap)
                      (bind o bound-o)))))))]
    (concat (or tbox-res [])
            (or class-annotations [])
            (or class-superclasses [])
            (or base []))))

(defmethod eval-atom :data
  [{:keys [ctx] :as eng} row [_ s dp lit]]
  (let [dpp (as-dprop ctx dp)
        sb  (if (qvar? s) (get row s) s)
        vb  (if (qvar? lit) (get row lit) lit)]
    (cond
      (nil? sb)
      (if (qvar? s)
        (let [subjects (subjects-with-data eng dp)]
          (if (qvar? lit)
            (mapcat (fn [^OWLNamedIndividual subj]
                      (when-let [row1 (bind row s subj)]
                        (for [value (data-values-of eng subj dpp)]
                          (bind row1 lit value))))
                    subjects)
            (let [target (if (instance? org.semanticweb.owlapi.model.OWLLiteral vb)
                           vb
                           (as-literal ctx vb))]
              (mapcat (fn [^OWLNamedIndividual subj]
                        (when-let [row1 (bind row s subj)]
                          (when (some #{target} (data-values-of eng subj dpp))
                            [row1])))
                      subjects))))
        (throw (ex-info "Unbound subject in :data atom under open-world DL; restrict subject or use :isa."
                        {:atom [s dp lit]})))

      (and (some? vb) (not (qvar? lit)))
      (let [lit' (if (instance? org.semanticweb.owlapi.model.OWLLiteral vb) vb (as-literal ctx vb))]
        (when (some #{lit'} (data-values-of eng (as-ind ctx sb) dpp)) [row]))

      :else
      (for [v (data-values-of eng (as-ind ctx sb) dpp)]
        (bind row lit v)))))

;; Annotation assertions (no reasoning)
(defmethod eval-atom :ann
  [{:keys [ctx] :as eng} row [_ s p o]]
  (let [{:keys [^OWLOntologyManager manager ^OWLOntology ontology]} ctx
        pred-iri                                                    (kw->iri ctx p)
        existing-s                                                  (when (and (qvar? s) (contains? row s)) (get row s))
        existing-o                                                  (when (and (qvar? o) (contains? row o)) (get row o))
        target-subj-iri                                             (cond
                                                                      (instance? org.semanticweb.owlapi.model.OWLEntity existing-s) (.getIRI ^org.semanticweb.owlapi.model.OWLEntity existing-s)
                                                                      (instance? IRI existing-s)                                    existing-s
                                                                      (keyword? existing-s)                                         (kw->iri ctx existing-s)
                                                                      (and (qground? s) (not (map? s)))                             (kw->iri ctx s)
                                                                      :else                                                         nil)
        target-subj-bn                                              (cond
                                                                      (and (map? existing-s) (:db/id existing-s)) (:db/id existing-s)
                                                                      (and (qground? s) (map? s))                 (:db/id s)
                                                                      :else                                       nil)
        target-obj-iri                                              (cond
                                                                      (instance? org.semanticweb.owlapi.model.OWLEntity existing-o) (.getIRI ^org.semanticweb.owlapi.model.OWLEntity existing-o)
                                                                      (instance? IRI existing-o)                                    existing-o
                                                                      (keyword? existing-o)                                         (kw->iri ctx existing-o)
                                                                      (and (qground? o) (keyword? o))                               (kw->iri ctx o)
                                                                      :else                                                         nil)
        target-obj-bn                                               (cond
                                                                      (and (map? existing-o) (:db/id existing-o)) (:db/id existing-o)
                                                                      (and (qground? o) (map? o))                 (:db/id o)
                                                                      :else                                       nil)
        target-obj-lit?                                             (or (instance? org.semanticweb.owlapi.model.OWLLiteral existing-o)
                                                                        (and (qground? o) (instance? org.semanticweb.owlapi.model.OWLLiteral o)))
        idx                                                         (get @(:indexes eng) :ann)
        matches
        (fn match-entry [subj val]
          (and (or (nil? target-subj-iri)
                   (and (instance? IRI subj) (= subj target-subj-iri))
                   (and (nil? target-subj-iri) (instance? org.semanticweb.owlapi.model.OWLAnonymousIndividual subj)))
               (or (nil? target-subj-bn)
                   (and (instance? org.semanticweb.owlapi.model.OWLAnonymousIndividual subj)
                        (= target-subj-bn (anon-id ^org.semanticweb.owlapi.model.OWLAnonymousIndividual subj))))
               (or (nil? target-obj-iri)
                   (and (instance? IRI val) (= val target-obj-iri)))
               (or (nil? target-obj-bn)
                   (and (instance? org.semanticweb.owlapi.model.OWLAnonymousIndividual val)
                        (= target-obj-bn (anon-id ^org.semanticweb.owlapi.model.OWLAnonymousIndividual val))))
               (or (not target-obj-lit?)
                   (instance? org.semanticweb.owlapi.model.OWLLiteral val))))]
    (letfn [(emit [subj val]
              (let [subject-val (cond
                                  existing-s           existing-s
                                  (instance? org.semanticweb.owlapi.model.OWLAnonymousIndividual subj)
                                  {:db/id (anon-id ^org.semanticweb.owlapi.model.OWLAnonymousIndividual subj)}
                                  (instance? IRI subj) (.getOWLClass *df* ^IRI subj)
                                  :else                subj)
                    row1        (bind row s (if (qvar? s) subject-val s))
                    bound-o     (cond
                                  existing-o          existing-o
                                  (instance? org.semanticweb.owlapi.model.OWLAnonymousIndividual val)
                                  {:db/id (anon-id ^org.semanticweb.owlapi.model.OWLAnonymousIndividual val)}
                                  (instance? IRI val) (iri->kw ctx ^IRI val)
                                  :else               (literal->edn ctx ^org.semanticweb.owlapi.model.OWLLiteral val))
                    row2        (when row1
                                  (if (qvar? p)
                                    (bind row1 p (.getOWLAnnotationProperty *df* pred-iri))
                                    row1))
                    row3        (when row2
                                  (bind row2 o (if (qvar? o) bound-o o)))]
                row3))]
      (if idx
        (for [[[subj ap] vals] idx
              :when            (= ap pred-iri)
              :when            (seq vals)
              val              vals
              :when            (matches subj val)
              :let             [res (emit subj val)]
              :when            res]
          res)
        (for [^OWLOntology o-ont              (imports-closure manager ontology)
              ^OWLAnnotationAssertionAxiom ax (.getAxioms o-ont AxiomType/ANNOTATION_ASSERTION)
              :let                            [^OWLAnnotationProperty ap (.getProperty ax)]
              :when                           (= (.getIRI ap) pred-iri)
              :let                            [subj (.getSubject ax)
                                                                            val  (.getValue ax)]
              :when                           (matches subj val)
              :let                            [res (emit subj val)]
              :when                           res]
          res)))))

;; TBox: rdfs/subClassOf
(defmethod eval-atom :subc
  [{:keys [^OWLReasoner reasoner ctx] :as eng} row [_ sub sup]]
  (let [direct              (direct? eng :rdfs/subClassOf)
        sub-bound           (bound-value row sub)
        sup-bound           (bound-value row sup)
        to-kw               #(coerce-entity eng % :kw)
        as-class*           (fn [term]
                              (cond
                                (instance? OWLClass term) term
                                (keyword? term)           (as-class ctx term)
                                (instance? IRI term)      (.getOWLClass *df* ^IRI term)
                                :else                     nil))
        ground?             (fn [term bound]
                              (if (qvar? term)
                                (some? bound)
                                true))
        sub-ground?         (ground? sub sub-bound)
        sup-ground?         (ground? sup sup-bound)
        ^OWLClass sub-class (when sub-ground?
                              (as-class* (if (qvar? sub) sub-bound sub)))
        ^OWLClass sup-class (when sup-ground?
                              (as-class* (if (qvar? sup) sup-bound sup)))]
    (cond
      (and sub-ground? sup-ground? sub-class sup-class)
      (when (.isEntailed reasoner
                         (.getOWLSubClassOfAxiom *df* sub-class sup-class))
        [row])

      (and sub-ground? sup-ground? sub-class (map? sup-bound))
      (let [target           sup-bound
            restriction-maps (map :restriction (restrictions-for-sub eng sub-class))]
        (when (some #(= % target) restriction-maps)
          [row]))

      (and sub-ground? (not sup-ground?) sub-class)
      (let [supers     (node-set->entities (.getSuperClasses reasoner sub-class (boolean direct)))
            named-rows (keep (fn [^OWLClass C]
                               (bind row sup (to-kw C)))
                             supers)
            restriction-rows
            (mapcat (fn [{:keys [restriction]}]
                      (when-let [row' (bind row sup restriction)]
                        [row']))
                    (restrictions-for-sub eng sub-class))]
        (concat named-rows restriction-rows))

      (and sup-ground? (not sub-ground?) sup-class)
      (let [subs (node-set->entities (.getSubClasses reasoner sup-class (boolean direct)))]
        (keep (fn [^OWLClass C]
                (bind row sub (to-kw C)))
              subs))

      (and sup-ground? (not sub-ground?) (map? sup-bound))
      (let [target sup-bound]
        (keep (fn [rec]
                (when (= (:restriction rec) target)
                  (bind row sub (:sub rec))))
              (restriction-records eng)))

      :else
      (mapcat
        (fn [^OWLClass s]
          (when-let [row* (bind row sub (to-kw s))]
            (let [named-supers       (node-set->entities (.getSuperClasses reasoner s (boolean direct)))
                  restriction-supers (map :restriction (restrictions-for-sub eng s))]
              (concat
                (keep (fn [^OWLClass p]
                        (bind row* sup (to-kw p)))
                      named-supers)
                (keep (fn [restriction]
                        (bind row* sup restriction))
                      restriction-supers)))))
        (all-named-classes eng)))))

;; TBox: owl/equivalentClass
(defmethod eval-atom :equivc
  [{:keys [^OWLReasoner reasoner ctx] :as eng} row [_ a b]]
  (cond
    (and (qground? a) (qground? b))
    (let [eqs (->> (.getEntities (.getEquivalentClasses reasoner (class-expr ctx a)))
                   (seq)
                   prune-bottom
                   set)]
      (when (contains? eqs (as-class ctx b)) [row]))

    (and (qground? a) (qvar? b))
    (let [es (.getEntities (.getEquivalentClasses reasoner (class-expr ctx a)))]
      (for [^OWLClass C (prune-bottom (iterator-seq (.iterator es)))] (bind row b C)))

    (and (qvar? a) (qground? b))
    (let [es (.getEntities (.getEquivalentClasses reasoner (class-expr ctx b)))]
      (for [^OWLClass C (prune-bottom (iterator-seq (.iterator es)))] (bind row a C)))

    :else
    (for [^OWLClass c (all-named-classes eng)
          :let        [es (.getEntities (.getEquivalentClasses reasoner c))]
          ^OWLClass d (prune-bottom (iterator-seq (.iterator es)))]
      (-> row (bind a c) (bind b d)))))

;; RBox: rdfs/subPropertyOf (object or data)
                                        ;(defmethod eval-atom :subp ...) — optimized with indices/memos
(defmethod eval-atom :subp
  [{:keys [^OWLReasoner reasoner ctx] :as eng} row [_ s o]]
  (let [direct (direct? eng :rdfs/subPropertyOf)
        rbox   (get @(:indexes eng) :rbox)
        pk     (or (and (instance? OWLObjectProperty s) :object)
                   (and (instance? OWLDataProperty   s) :data)
                   (and (instance? OWLObjectProperty o) :object)
                   (and (instance? OWLDataProperty   o) :data)
                   (and (keyword? s) (property-kind ctx (kw->iri ctx s)))
                   (and (keyword? o) (property-kind ctx (kw->iri ctx o))))]
    (case pk
      :object
      (let [idx (:obj rbox)]
        (cond
          (and (qground? s) (qground? o))
          (let [sp (as-objprop ctx s) sq (as-objprop ctx o)]
            (if idx
              (when ((if direct :direct :all) (get-in idx [sp :supers])) sq) [row])
            (when (some #{sq} (super-objprops eng sp direct)) [row]))

          (and (qground? s) (qvar? o))
          (let [sp (as-objprop ctx s)]
            (if idx
              (for [^OWLObjectProperty sq ((if direct :direct :all)
                                           (get-in idx [sp :supers]))]
                (bind row o sq))
              (for [^OWLObjectProperty sq (super-objprops eng sp direct)]
                (bind row o sq))))

          (and (qvar? s) (qground? o))
          (let [sq (as-objprop ctx o)]
            (if idx
              (for [^OWLObjectProperty sp ((if direct :direct :all)
                                           (get-in idx [sq :subs]))]
                (bind row s sp))
              (for [^OWLObjectProperty sp (sub-objprops eng sq direct)]
                (bind row s sp))))

          :else
          (if idx
            (for [[^OWLObjectProperty sp {:keys [supers]}] idx
                  ^OWLObjectProperty sq                    ((if direct :direct :all) supers)]
              (-> row (bind s sp) (bind o sq)))
            (for [^OWLObjectProperty sp (all-object-properties eng)
                  ^OWLObjectProperty sq (super-objprops eng sp direct)]
              (-> row (bind s sp) (bind o sq))))))

      :data
      (let [idx (:data rbox)]
        (cond
          (and (qground? s) (qground? o))
          (let [sp (as-dprop ctx s) sq (as-dprop ctx o)]
            (if idx
              (when ((if direct :direct :all) (get-in idx [sp :supers])) sq) [row])
            (when (some #{sq} (super-dprops eng sp direct)) [row]))

          (and (qground? s) (qvar? o))
          (let [sp (as-dprop ctx s)]
            (if idx
              (for [^OWLDataProperty sq ((if direct :direct :all)
                                         (get-in idx [sp :supers]))]
                (bind row o sq))
              (for [^OWLDataProperty sq (super-dprops eng sp direct)]
                (bind row o sq))))

          (and (qvar? s) (qground? o))
          (let [sq (as-dprop ctx o)]
            (if idx
              (for [^OWLDataProperty sp ((if direct :direct :all)
                                         (get-in idx [sq :subs]))]
                (bind row s sp))
              (for [^OWLDataProperty sp (sub-dprops eng sq direct)]
                (bind row s sp))))

          :else
          (if idx
            (for [[^OWLDataProperty sp {:keys [supers]}] idx
                  ^OWLDataProperty sq                    ((if direct :direct :all) supers)]
              (-> row (bind s sp) (bind o sq)))
            (for [^OWLDataProperty sp (all-data-properties eng)
                  ^OWLDataProperty sq (super-dprops eng sp direct)]
              (-> row (bind s sp) (bind o sq))))))

      ;; unknown: conservatively enumerate both domains without indices
      (let [direct direct]
        (concat
          (for [^OWLObjectProperty sp (all-object-properties eng)
                ^OWLObjectProperty sq (super-objprops eng sp direct)]
            (-> row (bind s sp) (bind o sq)))
          (for [^OWLDataProperty sp (all-data-properties eng)
                ^OWLDataProperty sq (super-dprops eng sp direct)]
            (-> row (bind s sp) (bind o sq))))))))

;; RBox: owl/equivalentProperty (object or data)
(defmethod eval-atom :equivp
  [{:keys [^OWLReasoner reasoner ctx] :as eng} row [_ a b]]
  (let [kind (or (and (keyword? a) (property-kind ctx (kw->iri ctx a)))
                 (and (keyword? b) (property-kind ctx (kw->iri ctx b))))]
    (case kind
      :object
      (cond
        (and (qground? a) (qground? b))
        (let [ns    (.getEquivalentObjectProperties reasoner (as-objprop ctx a))
              ents  (.getEntities ns)
              named (->> ents (remove #(.isAnonymous ^OWLObjectPropertyExpression %))
                         (map #(.getNamedProperty ^OWLObjectPropertyExpression %)) set)]
          (when (contains? named (as-objprop ctx b)) [row]))

        (and (qground? a) (qvar? b))
        (let [ns (.getEquivalentObjectProperties reasoner (as-objprop ctx a))]
          (for [^OWLObjectPropertyExpression pe (.getEntities ns)
                :when                           (not (.isAnonymous pe))
                :let                            [^OWLObjectProperty p' (.getNamedProperty pe)]]
            (bind row b p')))

        (and (qvar? a) (qground? b))
        (let [ns (.getEquivalentObjectProperties reasoner (as-objprop ctx b))]
          (for [^OWLObjectPropertyExpression pe (.getEntities ns)
                :when                           (not (.isAnonymous pe))
                :let                            [^OWLObjectProperty p' (.getNamedProperty pe)]]
            (bind row a p')))

        :else
        (for [^OWLObjectProperty p1 (all-object-properties eng)
              ^OWLObjectPropertyExpression pe
              (.getEntities (.getEquivalentObjectProperties reasoner p1))
              :when                 (not (.isAnonymous pe))
              :let                  [^OWLObjectProperty p2 (.getNamedProperty pe)]]
          (-> row (bind a p1) (bind b p2))))

      :data
      (cond
        (and (qground? a) (qground? b))
        (let [ns   (.getEquivalentDataProperties reasoner (as-dprop ctx a))
              ents (map #(.asOWLDataProperty ^OWLDataPropertyExpression %) (.getEntities ns))
              s    (set ents)]
          (when (contains? s (as-dprop ctx b)) [row]))

        (and (qground? a) (qvar? b))
        (let [ns (.getEquivalentDataProperties reasoner (as-dprop ctx a))]
          (for [dp (map #(.asOWLDataProperty ^OWLDataPropertyExpression %) (.getEntities ns))]
            (bind row b dp)))

        (and (qvar? a) (qground? b))
        (let [ns (.getEquivalentDataProperties reasoner (as-dprop ctx b))]
          (for [dp (map #(.asOWLDataProperty ^OWLDataPropertyExpression %) (.getEntities ns))]
            (bind row a dp)))

        :else
        (for [^OWLDataProperty d1 (all-data-properties eng)
              dp                  (map #(.asOWLDataProperty ^OWLDataPropertyExpression %)
                                                                    (.getEntities (.getEquivalentDataProperties reasoner d1)))]
          (-> row (bind a d1) (bind b dp))))

      ;; unknown: try both (object and data) inline
      (cond
        (and (qground? a) (qground? b))
        (let [obj-ok (let [ns    (.getEquivalentObjectProperties reasoner (as-objprop ctx a))
                           ents  (.getEntities ns)
                           named (->> ents (remove #(.isAnonymous ^OWLObjectPropertyExpression %))
                                      (map #(.getNamedProperty ^OWLObjectPropertyExpression %)) set)]
                       (contains? named (as-objprop ctx b)))
              dp-ok  (let [ns   (.getEquivalentDataProperties reasoner (as-dprop ctx a))
                           ents (map #(.asOWLDataProperty ^OWLDataPropertyExpression %) (.getEntities ns))
                           s    (set ents)]
                       (contains? s (as-dprop ctx b)))]
          (when (or obj-ok dp-ok) [row]))

        (and (qground? a) (qvar? b))
        (concat
          (let [ns (.getEquivalentObjectProperties reasoner (as-objprop ctx a))]
            (for [^OWLObjectPropertyExpression pe (.getEntities ns)
                  :when                           (not (.isAnonymous pe))
                  :let                            [^OWLObjectProperty p' (.getNamedProperty pe)]]
              (bind row b p')))
          (let [ns (.getEquivalentDataProperties reasoner (as-dprop ctx a))]
            (for [dp (map #(.asOWLDataProperty ^OWLDataPropertyExpression %) (.getEntities ns))]
              (bind row b dp))))

        (and (qvar? a) (qground? b))
        (concat
          (let [ns (.getEquivalentObjectProperties reasoner (as-objprop ctx b))]
            (for [^OWLObjectPropertyExpression pe (.getEntities ns)
                  :when                           (not (.isAnonymous pe))
                  :let                            [^OWLObjectProperty p' (.getNamedProperty pe)]]
              (bind row a p')))
          (let [ns (.getEquivalentDataProperties reasoner (as-dprop ctx b))]
            (for [dp (map #(.asOWLDataProperty ^OWLDataPropertyExpression %) (.getEntities ns))]
              (bind row a dp))))

        :else
        (concat
          (for [^OWLObjectProperty p1 (all-object-properties eng)
                ^OWLObjectPropertyExpression pe
                (.getEntities (.getEquivalentObjectProperties reasoner p1))
                :when                 (not (.isAnonymous pe))
                :let                  [^OWLObjectProperty p2 (.getNamedProperty pe)]]
            (-> row (bind a p1) (bind b p2)))
          (for [^OWLDataProperty d1 (all-data-properties eng)
                dp                  (map #(.asOWLDataProperty ^OWLDataPropertyExpression %)
                                                                      (.getEntities (.getEquivalentDataProperties reasoner d1)))]
            (-> row (bind a d1) (bind b dp))))))))

;; RBox: owl/inverseOf (object properties only)
(defmethod eval-atom :inverse
  [{:keys [^OWLReasoner reasoner ctx] :as eng} row [_ a b]]
  (cond
    (and (qground? a) (qground? b))
    (let [ns    (.getInverseObjectProperties reasoner (as-objprop ctx a))
          ents  (.getEntities ns)
          named (->> ents (remove #(.isAnonymous ^OWLObjectPropertyExpression %))
                     (map #(.getNamedProperty ^OWLObjectPropertyExpression %)) set)]
      (when (contains? named (as-objprop ctx b)) [row]))

    (and (qground? a) (qvar? b))
    (let [ns (.getInverseObjectProperties reasoner (as-objprop ctx a))]
      (for [^OWLObjectPropertyExpression pe (.getEntities ns)
            :when                           (not (.isAnonymous pe))
            :let                            [^OWLObjectProperty p' (.getNamedProperty pe)]]
        (bind row b p')))

    (and (qvar? a) (qground? b))
    (let [ns (.getInverseObjectProperties reasoner (as-objprop ctx b))]
      (for [^OWLObjectPropertyExpression pe (.getEntities ns)
            :when                           (not (.isAnonymous pe))
            :let                            [^OWLObjectProperty p' (.getNamedProperty pe)]]
        (bind row a p')))

    :else
    (for [^OWLObjectProperty p1 (all-object-properties eng)
          ^OWLObjectPropertyExpression pe
          (.getEntities (.getInverseObjectProperties reasoner p1))
          :when                 (not (.isAnonymous pe))
          :let                  [^OWLObjectProperty p2 (.getNamedProperty pe)]]
      (-> row (bind a p1) (bind b p2)))))

;; Individuals: owl/sameAs
(defmethod eval-atom :same
  [{:keys [^OWLReasoner reasoner ctx] :as eng} row [_ x y]]
  (cond
    (and (qground? x) (qground? y))
    (when (.isEntailed reasoner (.getOWLSameIndividualAxiom *df* ^java.util.Collection (set [(as-ind ctx x) (as-ind ctx y)]))) [row])

    (and (qground? x) (qvar? y))
    (let [ns (.getSameIndividuals reasoner (as-ind ctx x))
          es (.getEntities ns)]
      (for [^OWLNamedIndividual i (iterator-seq (.iterator es))]
        (bind row y i)))

    (and (qvar? x) (qground? y))
    (let [ns (.getSameIndividuals reasoner (as-ind ctx y))
          es (.getEntities ns)]
      (for [^OWLNamedIndividual i (iterator-seq (.iterator es))]
        (bind row x i)))

    :else
    (for [^OWLNamedIndividual i (all-named-individuals eng)
          :let                  [ns (.getSameIndividuals reasoner i)
                                                              es (.getEntities ns)]
          ^OWLNamedIndividual j (iterator-seq (.iterator es))]
      (-> row (bind x i) (bind y j)))))

;; Individuals: owl/differentFrom
(defmethod eval-atom :different
  [{:keys [^OWLReasoner reasoner ctx] :as eng} row [_ x y]]
  (cond
    (and (qground? x) (qground? y))
    (when (.isEntailed reasoner (.getOWLDifferentIndividualsAxiom *df* ^java.util.Collection (set [(as-ind ctx x) (as-ind ctx y)]))) [row])

    (and (qground? x) (qvar? y))
    (let [ns (.getDifferentIndividuals reasoner (as-ind ctx x))]
      (for [^OWLNamedIndividual i (node-set->entities ns)]
        (bind row y i)))

    (and (qvar? x) (qground? y))
    (let [ns (.getDifferentIndividuals reasoner (as-ind ctx y))]
      (for [^OWLNamedIndividual i (node-set->entities ns)]
        (bind row x i)))

    :else
    (for [^OWLNamedIndividual i (all-named-individuals eng)
          ^OWLNamedIndividual j (node-set->entities (.getDifferentIndividuals reasoner i))]
      (-> row (bind x i) (bind y j)))))

(defn- subst-vars
  "substitute bound vars into filter form"
  [row form]
  (let [eng *bind-engine*
        ctx (:ctx eng)]
    (walk/prewalk
      (fn [x]
        (if (qvar? x)
          (let [v (get row x ::missing)]
            (cond
              (= ::missing v) x
              (instance? org.semanticweb.owlapi.model.OWLLiteral v)
              (if ctx (literal->edn ctx v) v)
              (instance? org.semanticweb.owlapi.model.OWLEntity v)
              (if eng (coerce-entity eng v :kw) v)
              :else           v))
          x))
      form)))

(defn- contains-qvar? [form]
  (letfn [(expand? [x]
            (and (coll? x)
                 (not (and (seq? x)
                           (= 'quote (first x))))))]
    (boolean (some qvar? (tree-seq expand? seq form)))))

(declare nested-q-symbol? ensure-nested-q-args-bound invoke-nested-q)

(defn- pending-nested-q?
  [form]
  (letfn [(expand? [x]
            (and (coll? x)
                 (not (and (seq? x)
                           (= 'quote (first x))))))]
    (boolean
      (some (fn [node]
              (and (seq? node)
                   (nested-q-symbol? (first node))
                   (contains-qvar? node)))
            (tree-seq expand? seq form)))))

(defn- resolve-nested-qs
  "Evaluate fully bound nested q forms while leaving deferred ones intact."
  [form]
  (letfn [(resolve* [node]
            (cond
              (and (seq? node) (= 'quote (first node)))
              node

              (and (seq? node) (nested-q-symbol? (first node)))
              (let [head  (first node)
                    args  (map resolve* (rest node))
                    node* (cons head args)]
                (if (contains-qvar? node*)
                  (with-meta (apply list node*) (meta node))
                  (do
                    (ensure-nested-q-args-bound (rest node*))
                    (invoke-nested-q node*))))

              (seq? node)
              (let [items   (map resolve* node)
                    rebuilt (apply list items)]
                (with-meta rebuilt (meta node)))

              (map? node)
              (into (empty node)
                    (map (fn [[k v]] [(resolve* k) (resolve* v)]))
                    node)

              (coll? node)
              (into (empty node) (map resolve* node))

              :else
              node))]
    (resolve* form)))

(defn- nested-q-symbol?
  [sym]
  (and (symbol? sym) (= "q" (name sym))))

(defn- ensure-nested-q-args-bound
  [args]
  (doseq [arg args]
    (let [check (cond
                  (and (seq? arg) (= 'quote (first arg))) nil
                  (map? arg)                              (dissoc arg :query)
                  :else                                   arg)]
      (when (and check (contains-qvar? check))
        (throw (ex-info "Nested q requires bound inputs"
                        {:arg arg}))))))

(defn- process-nested-arg
  [arg]
  (cond
    (and (seq? arg) (= 'quote (first arg)))
    (second arg)

    (datasource-symbol? arg)
    (let [eng (get *engine-sources* arg)
          ctx (:ctx eng)]
      (or ctx (throw (ex-info "Nested q referenced unknown datasource"
                              {:datasource arg}))))

    (and (symbol? arg) (= "%" (name arg)))
    (or *rule-raw*
        (throw (ex-info "Nested q referenced % but no rule set bound"
                        {})))

    (map? arg)
    (-> arg
        (update :query (fn [q]
                         (cond
                           (and (seq? q) (= 'quote (first q))) (second q)
                           :else                               q)))
        (update :args (fn [as]
                        (when as
                          (into (empty as)
                                (map process-nested-arg)
                                as)))))

    :else arg))

(defn- invoke-nested-q
  [expr]
  (let [[_ & args] expr
        processed  (map process-nested-arg args)
        result     (if (map? (first processed))
                     (q (first processed))
                     (do
                       (when (< (count processed) 2)
                         (throw (ex-info "Nested q requires at least one datasource context"
                                         {:expr expr})))
                       (apply q (first processed) (rest processed))))]
    (cond
      (set? result) (vec result)
      :else         result)))

(declare evaluate-expr)


(defmethod eval-atom :filter [_eng row [_ pred-form]]
  (let [{:keys [status value]} (evaluate-expr row pred-form)]
    (case status
      :defer [row]
      :ok    (when value [row]))))

(defn- eval-expression
  [form]
  (binding [*ns* (the-ns 'clojure.core)]
    (eval form)))

(defn- evaluate-expr
  [row expr]
  (let [sf       (subst-vars row expr)
        resolved (resolve-nested-qs sf)]
    (if (contains-qvar? resolved)
      (if (pending-nested-q? resolved)
        {:status :defer :reason :nested-unbound :expr expr}
        {:status :defer :expr expr})
      {:status :ok :value (eval-expression resolved)})))

(defmethod eval-atom :fn-expr
  [eng row [_ expr target]]
  (let [{:keys [status value reason]} (evaluate-expr row expr)]
    (when (= status :defer)
      (throw (ex-info (if (= reason :nested-unbound)
                        "Nested q requires bound inputs"
                        "Function clause requires bound inputs")
                      {:expr expr :row row})))
    (cond
      (and (vector? target)
           (= 1 (count target))
           (vector? (first target)))
      (let [{:keys [rows]} (prep-relation-binding {:rows [row] :env {}} target value)]
        rows)

      (vector? target)
      (let [{:keys [rows]} (prep-tuple-binding {:rows [row] :env {}} target value)]
        rows)

      (= target '_) [row]

      (qvar? target)
      (if-let [row' (bind row target value)]
        [row']
        [])

      :else
      (if (= target value) [row] []))))

;; ------------------------ Greedy planner ----------------------------------

(defn- qbound? [row x] (and (qvar? x) (contains? row x)))

(declare enumerate-range-properties)

(defn- est-cost
  "Estimate enumeration cost of an atom given current row bindings."
  [eng row [op & xs]]
  (let [{:keys [ctx]} eng]
    (case op
      :isa (let [[s ce] xs
                 direct (direct? eng :rdf/type)]
             (cond
               (or (qground? s) (qbound? row s))   (count (types-of eng (or (get row s) (as-ind ctx s)) direct))
               (or (qground? ce) (qbound? row ce)) (count (inst-of eng (class-expr ctx (or (get row ce) ce)) direct))
               :else                               1e6))

      :rel (let [[s r o] xs]
             (cond
               (or (qground? s) (qbound? row s)) (count (obj-values eng (or (get row s) (as-ind ctx s)) (as-objprop ctx r)))
               (or (qground? o) (qbound? row o)) (count (obj-values-inv eng (or (get row o) (as-ind ctx o)) (as-objprop ctx r)))
               :else                             1e6))

      :data (let [[s dp _] xs]
              (if (or (qground? s) (qbound? row s))
                (count (data-values-of eng (or (get row s) (as-ind ctx s)) (as-dprop ctx dp)))
                1000000000000))

      :subc (let [[sub sup] xs
                  direct    (direct? eng :rdfs/subClassOf)]
              (cond
                (or (qground? sub) (qbound? row sub)) (count (supers-of-class eng (or (get row sub) (as-class ctx sub)) direct))
                (or (qground? sup) (qbound? row sup)) (count (subs-of-class eng (or (get row sup) (as-class ctx sup)) direct))
                :else                                 (count (all-named-classes eng))))

      :range (let [[p _]      xs
                   term       (or (get row p) (when-not (qvar? p) p))
                   candidates (enumerate-range-properties eng ctx term)]
               (if (seq candidates) (count candidates) 1e6))

      :domain (let [[p _]      xs
                    term       (or (get row p) (when-not (qvar? p) p))
                    candidates (enumerate-range-properties eng ctx term)]
                (if (seq candidates) (count candidates) 1e6))

      :with-src (let [[src inner] xs
                      sources     *engine-sources*
                      sub-eng     (or (get sources src)
                                      (throw (ex-info (str "Unknown datasource " src)
                                                      {:datasource src})))]
                  (est-cost sub-eng row inner))

      :rule (let [[rule-name args] xs
                  args             (vec args)
                  bound            (count (filter #(or (qground? %) (qbound? row %)) args))
                  defs             (get *rule-index* rule-name)
                  all-bound?       (= bound (count args))
                  base             (cond
                                     (nil? defs) 1e12
                                     all-bound?  1e5
                                     :else       1e12)]
              (+ base (* 1e3 (- (count args) bound))))

      :or (let [branch-costs (map #(est-cost eng row %) xs)
                base         (if (seq branch-costs)
                               (apply min branch-costs)
                               1e6)]
            (+ base 1e6))

      :and (let [clauses (first xs)]
             (reduce + (map #(est-cost eng row %) clauses)))

      :not (let [clauses (first xs)]
             (+ 1e5 (reduce + (map #(est-cost eng row %) clauses))))

      :not-join (let [[_ clauses] xs]
                  (+ 1e5 (reduce + (map #(est-cost eng row %) clauses))))

      :or-join (let [[_ branches] xs
                     costs        (map #(est-cost eng row %) branches)]
                 (+ 1e6 (if (seq costs) (apply min costs) 1e6)))

      :fn-expr (let [[expr _]   xs
                     expr-qvars (set (filter qvar? (tree-seq coll? seq expr)))]
                 (if (empty? expr-qvars)
                   100
                   1000000000000000))

      :subp      1e6
      :filter    1e9
      :equivc    1e5
      :equivp    1e5
      :inverse   1e5
      :same      1e5
      :different 1e5
      1e6)))

(defn- plan
  "Greedy left-deep plan: pick next atom with minimal estimated cost."
  [eng atoms]
  (loop [rem atoms acc [] row {}]
    (if (empty? rem) acc
        (let [next (apply min-key #(est-cost eng row %) rem)]
          (recur (remove #(identical? % next) rem) (conj acc next) row)))))

(def ^:private op->inference-map
  {:isa     #{:class-hierarchy :class-assertions}
   :rel     #{:class-hierarchy :object-hierarchy :object-assertions}
   :data    #{:data-assertions}
   :subc    #{:class-hierarchy}
   :equivc  #{:class-hierarchy}
   :subp    #{:object-hierarchy :data-hierarchy}
   :equivp  #{:object-hierarchy :data-hierarchy}
   :inverse #{:object-hierarchy}
   :same    #{:same-individual}
   :different #{:same-individual}
   :range   #{:class-hierarchy :object-hierarchy :data-hierarchy}
   :domain  #{:class-hierarchy :object-hierarchy :data-hierarchy}
   :any     #{:class-hierarchy :object-hierarchy :object-assertions :data-assertions}})

(defn- dl-reasoner-engine?
  [{:keys [reasoner-selection]}]
  (cond
    (keyword? reasoner-selection) (not (contains? #{:structural :elk} reasoner-selection))
    :else                         true))

(declare collect-atom-inferences collect-clauses-inferences)

(defn- collect-clauses-inferences
  [rule-index visited clauses]
  (reduce
    (fn [acc clause]
      (set/union acc (collect-atom-inferences rule-index visited clause)))
    #{}
    (remove nil? clauses)))

(defn- collect-atom-inferences
  [rule-index visited atom]
  (if (nil? atom)
    #{}
    (let [[op & args] atom]
      (case op
        :or       (collect-clauses-inferences rule-index visited (rest atom))
        :and      (collect-clauses-inferences rule-index visited (first args))
        :not      (collect-clauses-inferences rule-index visited (first args))
        :not-join (collect-clauses-inferences rule-index visited (second args))
        :or-join  (collect-clauses-inferences rule-index visited (second args))
        :with-src (collect-atom-inferences rule-index visited (second args))
        :rule     (let [[rule-name _] args
                        defs (get rule-index rule-name)]
                    (if (or (nil? rule-name)
                            (contains? visited rule-name)
                            (empty? defs))
                      #{}
                      (reduce
                        (fn [acc {:keys [clauses]}]
                          (set/union acc (collect-clauses-inferences rule-index (conj visited rule-name) clauses)))
                        #{}
                        defs)))
        (get op->inference-map op #{})))))

(defn- required-inferences
  [rule-index atoms]
  (collect-clauses-inferences rule-index #{} atoms))

(defn- coerce-order-value
  [eng ctx by val]
  (cond
    (instance? org.semanticweb.owlapi.model.OWLEntity val)
    (case by
      :iri   (coerce-entity eng val :iri)
      :short (coerce-entity eng val :short)
      :kw    (coerce-entity eng val :kw)
      (coerce-entity eng val :kw))

    (instance? org.semanticweb.owlapi.model.OWLLiteral val)
    (.getLiteral ^org.semanticweb.owlapi.model.OWLLiteral val)

    (map? val)
    (or (:db/id val) (str val))

    (vector? val)
    (mapv #(coerce-order-value eng ctx by %) val)

    (set? val)
    (into (empty val) (map #(coerce-order-value eng ctx by %) val))

    (sequential? val)
    (map #(coerce-order-value eng ctx by %) val)

    :else
    (str val)))

(defn- coerce-output-value
  [eng ctx literal-mode return-mode val]
  (cond
    (instance? org.semanticweb.owlapi.model.OWLEntity val)
    (coerce-entity eng val return-mode)

    (instance? org.semanticweb.owlapi.model.OWLLiteral val)
    (if (= literal-mode :raw)
      val
      (literal->edn ctx val))

    (vector? val)
    (mapv #(coerce-output-value eng ctx literal-mode return-mode %) val)

    (set? val)
    (into (empty val) (map #(coerce-output-value eng ctx literal-mode return-mode %) val))

    (sequential? val)
    (map #(coerce-output-value eng ctx literal-mode return-mode %) val)

    (map? val)
    (into (empty val)
          (map (fn [[k v]] [k (coerce-output-value eng ctx literal-mode return-mode v)]) val))

    :else val))

(defn- aggregate-rows
  [ctx elements group-vars rows]
  (let [grouped (cond
                  (seq rows)
                  (if (seq group-vars)
                    (group-by (fn [row] (mapv #(get row %) group-vars)) rows)
                    {[] rows})

                  (seq group-vars) {}

                  :else {[] []})]
    (for [[gkey group-rows] grouped]
      (let [base (zipmap group-vars gkey)
            base (if (and (empty? base) (seq group-rows))
                   (reduce (fn [m {:keys [type key]}]
                             (if (= type :var)
                               (assoc m key (get (first group-rows) key))
                               m))
                           base
                           elements)
                   base)
            row  (reduce (fn [m {:keys [type key agg args]}]
                           (if (= type :agg)
                             (assoc m key ((:compute agg) ctx group-rows args))
                             m))
                         base
                         elements)]
        row))))

(declare compile-rule-set)

(defn dq*
  "Evaluate a Datomic-flavored open-world query over prebuilt engines.
   Returns {:status :ok|:inconsistent :tuples [[...]] ...}."
  [{:keys [^OWLReasoner reasoner ctx] :as default-engine}
   engine-map
   {:keys [find where return unsafe? options order limit offset with return-map initial-rows env rules]
    :or   {return :kw options {} order nil limit 0 offset 0 with [] return-map nil initial-rows [{}] env {}}}]
  (when-not (and (sequential? find) (sequential? where))
    (throw (ex-info "Query requires :find vector and :where vector" {:find find :where where})))
  (let [rule-index (compile-rule-set ctx rules)]
    (binding [*engine-sources* engine-map
              *bind-engine*    default-engine
              *rule-index*     rule-index
              *rule-raw*       rules]
      (let [atoms             (->> where (map #(normalize-atom-fast default-engine %)) (map #(compile-atom ctx %)))
            needed-inferences (required-inferences rule-index atoms)
            consistent?       (try (.isConsistent reasoner) (catch Throwable _ false))]
        (if consistent?
          (try
            (let [eng'                    (assoc default-engine :options options)
                  engines-for-precompute (->> (vals engine-map) (remove nil?) distinct)]
              (when (seq needed-inferences)
                (doseq [engine engines-for-precompute
                        :when  (dl-reasoner-engine? engine)]
                  (doseq [inf needed-inferences]
                    (ensure-inference! engine inf))))
              (let [{:keys [elements has-aggregates? group-vars]} (analyze-find-spec find)
                    projection-keys                               (mapv :key elements)
                    var-keys                                      (mapv :key (filter #(= (:type %) :var) elements))
                    literal-mode                                  (get options :literal-mode :edn)
                    atoms'                                        (plan eng' (vec atoms))
                    step-seq                                      (fn step-seq [rows atom] (mapcat #(eval-atom eng' % atom) rows))
                    rows0                                         (reduce step-seq initial-rows atoms')
                    rows-base                                     (if has-aggregates?
                                                                    (vec (doall rows0))
                                                                    rows0)
                    row-maps                                      (if has-aggregates?
                                                                    (aggregate-rows ctx elements group-vars rows-base)
                                                                    (map #(select-keys % projection-keys) rows-base))
                    rows1                                         (if order
                                                                    (let [{:keys [by dir] :or {by :kw dir :asc}} order
                                                                          keyfn                                  (fn [row]
                                                                                                                   (mapv (fn [k]
                                                                                                                           (coerce-order-value eng' ctx by (get row k)))
                                                                                                                         find))
                                                                          cmp                                    (if (= dir :desc) #(compare %2 %1) compare)]
                                                                      (sort-by keyfn cmp row-maps))
                                                                    row-maps)
                    rows2                                         (drop (max 0 (long offset)) rows1)
                    rows2                                         (if has-aggregates?
                                                                    rows2
                                                                    (remove (fn [row]
                                                                              (some #(nil? (get row %)) var-keys))
                                                                            rows2))
                    rows3                                         (if (pos-int? limit) (take limit rows2) rows2)
                    tuples                                        (map (fn [row]
                                                                         (mapv (fn [k]
                                                                                 (coerce-output-value eng' ctx literal-mode return (get row k)))
                                                                               find))
                                                                       rows3)
                    shaped                                        (if return-map
                                                                    (let [{:keys [type fields]} return-map
                                                                          fields*               (vec fields)
                                                                          _                     (when (not= (count fields*) (count find))
                                                                                                  (throw (ex-info "Return map field count must match :find arity"
                                                                                                                  {:find find :fields fields*})))
                                                                          keyfn                 (case type
                                                                                                :keys (fn [sym] (keyword (name sym)))
                                                                                                :syms (fn [sym] (symbol (name sym)))
                                                                                                :strs (fn [sym] (name sym))
                                                                                                (throw (ex-info "Unknown return map type" {:type type})))]
                                                                      (map (fn [tuple]
                                                                             (let [ks (map keyfn fields*)
                                                                                   m  (zipmap ks tuple)]
                                                                               (->return-map m tuple)))
                                                                           tuples))
                                                                    tuples)
                    result-collection                             (if (seq with)
                                                                    (vec shaped)
                                                                    (set shaped))]
                {:status :ok :tuples result-collection}))
            (catch org.semanticweb.owlapi.reasoner.InconsistentOntologyException _
              (let [inc-opts (cond-> {:max 5}
                               (:reasoner-factory default-engine)              (assoc :reasoner-factory (:reasoner-factory default-engine))
                               (keyword? (:reasoner-selection default-engine)) (assoc :reasoner (:reasoner-selection default-engine)))]
                {:status       :inconsistent :tuples #{}
                 :explanations (vec (or (inconsistency-justifications ctx inc-opts) []))
                 :notes        ["Ontology inconsistent during evaluation."]})))
          (let [inc-opts (cond-> {:max 5}
                           (:reasoner-factory default-engine)              (assoc :reasoner-factory (:reasoner-factory default-engine))
                           (keyword? (:reasoner-selection default-engine)) (assoc :reasoner (:reasoner-selection default-engine)))]
            {:status       :inconsistent :tuples #{}
             :explanations (vec (or (inconsistency-justifications ctx inc-opts) []))
             :notes        ["Ontology inconsistent; open-world Datalog not executed."]}))))))

(def ^:private engine-cache-limit 8)

(defn- new-engine-cache []
  {:store {}
   :order []
   :max   engine-cache-limit})

(defn- cache-lookup!
  [cache-atom key]
  (let [now   (System/currentTimeMillis)
        state @cache-atom
        ttl   (:ttl-ms state)
        entry (get-in state [:store key])]
    (when entry
      (if (and ttl (> (- now (:ts entry)) ttl))
        (do
          (swap! cache-atom
                 (fn [{:keys [store order] :as st}]
                   (if (get store key)
                     (-> st
                         (update :store dissoc key)
                         (assoc :order (vec (remove #{key} order))))
                     st)))
          (dlq-close! (:engine entry))
          nil)
        (do
          (swap! cache-atom
                 (fn [{:keys [order] :as st}]
                   (if (get-in st [:store key])
                     (-> st
                         (assoc-in [:store key :ts] now)
                         (assoc :order (conj (vec (remove #{key} order)) key)))
                     st)))
          (:engine entry))))))

(defn- cache-store!
  [cache-atom key engine]
  (let [evicted  (volatile! nil)
        replaced (volatile! nil)
        entry    {:engine engine :ts (System/currentTimeMillis)}]
    (swap! cache-atom
           (fn [{:keys [store order max] :or {max engine-cache-limit} :as state}]
             (let [existing (get store key)
                   store'   (assoc store key entry)
                   order'   (conj (vec (remove #{key} order)) key)]
               (when existing (vreset! replaced existing))
               (if (> (count order') max)
                 (let [evict   (first order')
                       eng'    (get store' evict)
                       store'' (dissoc store' evict)
                       order'' (vec (rest order'))]
                   (vreset! evicted eng')
                   (assoc state :store store'' :order order'' :max max))
                 (assoc state :store store' :order order' :max max)))))
    (when-let [old @replaced]
      (when (and old (not (identical? (:engine old) engine)))
        (dlq-close! (:engine old))))
    (when-let [to-close @evicted]
      (dlq-close! (:engine to-close)))))

(def ^:private engine-cache-ttl-ms (* 15 60 1000))

(defn- ensure-context-caches
  [ctx]
  (let [caches (or (:caches ctx) {})
        caches (update caches :property-kind #(or % (atom {})))
        caches (update caches :property-restrictions #(or % (atom {})))]
    (assoc ctx :caches caches)))

(defn- ensure-eng-cache
  "Ensure ctx contains a persistent :eng-cache atom and required cache atoms."
  [ctx]
  (let [ctx (ensure-context-caches ctx)]
    (if-let [cache (:eng-cache ctx)]
      (do
        (when (and (instance? clojure.lang.IAtom cache)
                   (not (contains? @cache :store)))
          (swap! cache (fn [m]
                         (merge (new-engine-cache) {:ttl-ms engine-cache-ttl-ms} (or m {})))))
        ctx)
      (assoc ctx :eng-cache (atom (merge (new-engine-cache) {:ttl-ms engine-cache-ttl-ms}))))))

(def ^:private default-engine-settings
  {:precompute?       true
   :index?            true
   :annotation-index? true
   :memo-size         40000
   :trace?            false
   :module?           false})

(defn- atom-has-class-var?
  [[op & _ :as atom]]
  (case op
    :isa   (qvar? (nth atom 2))
    :subc  (or (qvar? (nth atom 1)) (qvar? (nth atom 2)))
    :equivc (or (qvar? (nth atom 1)) (qvar? (nth atom 2)))
    :range (qvar? (nth atom 2))
    :domain (qvar? (nth atom 2))
    :with-src (atom-has-class-var? (nth atom 2))
    :or    (some atom-has-class-var? (rest atom))
    :and   (some atom-has-class-var? (second atom))
    :not   (some atom-has-class-var? (second atom))
    :not-join (some atom-has-class-var? (nth atom 2))
    :or-join  (some atom-has-class-var? (nth atom 2))
    :rule true
    false))

(defn- atom-has-property-var?
  [[op & _ :as atom]]
  (case op
    :rel    (qvar? (nth atom 2))
    :data   (qvar? (nth atom 2))
    :ann    (qvar? (nth atom 2))
    :range  (qvar? (nth atom 1))
    :domain (qvar? (nth atom 1))
    :subp   (or (qvar? (nth atom 1)) (qvar? (nth atom 2)))
    :equivp (or (qvar? (nth atom 1)) (qvar? (nth atom 2)))
    :inverse (or (qvar? (nth atom 1)) (qvar? (nth atom 2)))
    :any    (qvar? (nth atom 2))
    :with-src (atom-has-property-var? (nth atom 2))
    :or     (some atom-has-property-var? (rest atom))
    :and    (some atom-has-property-var? (second atom))
    :not    (some atom-has-property-var? (second atom))
    :not-join (some atom-has-property-var? (nth atom 2))
    :or-join  (some atom-has-property-var? (nth atom 2))
    :rule true
    false))

(defn- query-has-unsafe-vars?
  [ctx where]
  (let [atoms (map #(normalize-atom ctx %) where)]
    (or (some atom-has-class-var? atoms)
        (some atom-has-property-var? atoms))))

(defn dq
  "One-off Datomic-like open-world query. Returns a set of tuples like Datomic q.
   If ontology is inconsistent, throws ex-info with {:status :inconsistent :explanations [...]}"
  ([ctx qmap]
   (dq ctx qmap nil))
  ([ctx qmap engine-overrides]
   (let [ctx                  (ensure-eng-cache ctx)
         sources-spec         (or (:sources qmap) {'$ ctx})
         raw-sources          (into {}
                                    (map (fn [[sym source-ctx]]
                                           (let [ctx' (ensure-eng-cache source-ctx)]
                                             [sym ctx']))
                                         sources-spec))
         q-opts               (select-engine-opts qmap)
         override-opts        (select-engine-opts engine-overrides)
         merged-opts          (merge default-engine-settings q-opts override-opts)
         selection            (reasoner-selection-key merged-opts)
         dl-reasoner?         (if (keyword? selection)
                                (not (contains? #{:structural :elk} selection))
                                true)
         explicit-module?     (or (contains? q-opts :module?)
                                  (contains? override-opts :module?))
         module?              (if explicit-module?
                                (:module? merged-opts)
                                dl-reasoner?)
         merged-opts          (assoc merged-opts :module? module?)
         explicit-precompute? (or (contains? q-opts :precompute?)
                                  (contains? override-opts :precompute?))
         merged-opts          (if explicit-precompute?
                                merged-opts
                                (assoc merged-opts :precompute? false))
         where-clause         (or (:where qmap) [])
         module-enabled?      (and module? dl-reasoner? (seq where-clause) (not (query-has-unsafe-vars? ctx where-clause)))
         opts-base            (dissoc merged-opts :module-key)
         source-configs       (into {}
                                    (map (fn [[sym context]]
                                           (let [ctx-base (ensure-eng-cache context)
                                                 {:keys [ctx key]}
                                                 (if module-enabled?
                                                   (let [signature (collect-query-signature ctx-base where-clause)]
                                                     (if (signature-empty? signature)
                                                       {:ctx ctx-base :key nil}
                                                       (module-context ctx-base signature)))
                                                   {:ctx ctx-base :key nil})
                                                 ctx-final (ensure-eng-cache ctx)
                                                 opts      (cond-> opts-base
                                                              key (assoc :module-key key))]
                                             [sym {:ctx ctx-final :opts opts}])))
                                    raw-sources)
         build-engine         (fn [context opts]
                                (let [cache (:eng-cache context)
                                      key   (cache-key-for-engine context opts)]
                                  (or (cache-lookup! cache key)
                                      (let [eng (dlq-engine context opts)]
                                        (cache-store! cache key eng)
                                        eng))))
         engine-map           (into {}
                                    (map (fn [[sym {:keys [ctx opts]}]]
                                           [sym (build-engine ctx opts)])
                                         source-configs))
         default-engine       (or (get engine-map '$)
                                  (throw (ex-info "Default datasource '$ missing" {:sources (keys engine-map)})))
         qmap*                (assoc qmap :sources (into {} (map (fn [[sym {:keys [ctx]}]] [sym ctx]) source-configs)))
         {:keys [status tuples] :as res} (dq* default-engine engine-map qmap*)]
     (if (= status :ok)
       tuples
       (throw (ex-info "Ontology inconsistent" (select-keys res [:status :notes :explanations :query])))))))

;; --- Usage examples -------------------------------------------------------

(comment
  ;; Build a context over a local ontology (for example, Dublin Core terms).
  (def ctx
    (load-context "resources/net/wikipunk/boot/dublin_core_terms.ttl"))

  ;; Example: explain a functional property in the ontology.
  (explain ctx [:owl/FunctionalProperty :dcterms/created]
           {:render [:manchester :functional]}))

;; ===================== Datomic-style front end ===========================

(defn- qvar?* [x] (and (symbol? x) (str/starts-with? (name x) "?")))

(defn- substitute-in [env form]
  (clojure.walk/prewalk (fn [x]
                          (if (and (symbol? x) (qvar?* x) (contains? env x))
                            (get env x)
                            x))
                        form))

(defn- parse-q
  "Parse a Datomic-like vector form or a small map form into
   {:find :where :in :args :return :order :limit :offset :reasoner ...}."
  [qform in-args]
  (cond
    (vector? qform)
    (let [{:keys [find where in return order limit offset reasoner reasoner-factory options with return-map]
           :as   acc}
          (loop [xs   qform
                 mode nil
                 acc  {:find [] :where [] :in [] :return :kw :order nil :limit 0 :offset 0 :options nil :with [] :return-map nil}]
            (if (empty? xs) acc
                (let [x (first xs)]
                  (cond
                    (= x :find)              (recur (rest xs) :find acc)
                    (= x :where)             (recur (rest xs) :where acc)
                    (= x :in)                (recur (rest xs) :in acc)
                    (= x :return)            (recur (rest xs) :return acc)
                    (= x :order)             (recur (nnext xs) mode (assoc acc :order (second xs)))
                    (= x :limit)             (recur (nnext xs) mode (assoc acc :limit (long (second xs))))
                    (= x :offset)            (recur (nnext xs) mode (assoc acc :offset (long (second xs))))
                    (= x :options)           (recur (nnext xs) mode (assoc acc :options (second xs)))
                    (= x :reasoner)          (recur (nnext xs) mode (assoc acc :reasoner (second xs)))
                    (= x :reasoner-factory)  (recur (nnext xs) mode (assoc acc :reasoner-factory (second xs)))
                    (= x :index?)            (recur (nnext xs) mode (assoc acc :index? (second xs)))
                    (= x :precompute?)       (recur (nnext xs) mode (assoc acc :precompute? (second xs)))
                    (= x :annotation-index?) (recur (nnext xs) mode (assoc acc :annotation-index? (second xs)))
                    (= x :trace?)            (recur (nnext xs) mode (assoc acc :trace? (second xs)))
                    (= x :memo-size)         (recur (nnext xs) mode (assoc acc :memo-size (long (second xs))))
                    (= x :with)              (recur (rest xs) :with acc)
                    (contains? #{:keys :syms :strs} x)
                    (recur (rest xs) :return-map (assoc acc :return-map {:type x :fields []}))

                    (= mode :find)   (recur (rest xs) :find (update acc :find conj x))
                    (= mode :where)  (recur (rest xs) :where (update acc :where conj x))
                    (= mode :in)     (recur (rest xs) :in (update acc :in conj x))
                    (= mode :return) (recur (rest xs) :return (assoc acc :return x))
                    (= mode :with)   (recur (rest xs) :with (update acc :with conj x))
                    (= mode :return-map)
                    (recur (rest xs) :return-map (update-in acc [:return-map :fields] conj x))
                    :else            (recur (rest xs) mode acc)))))]
      (assoc acc :find find :where where :in in :args (vec in-args)
             :return (or return :kw) :order order :limit limit :offset offset :with with :return-map return-map))

    (map? qform)
    (let [find              (:find qform)
          where             (:where qform)
          in                (:in qform)
          provided-args     (:args qform)
          return            (:return qform)
          order             (:order qform)
          limit             (:limit qform)
          offset            (:offset qform)
          reasoner          (:reasoner qform)
          reasoner-factory  (:reasoner-factory qform)
          options           (:options qform)
          index?            (:index? qform)
          precompute?       (:precompute? qform)
          annotation-index? (:annotation-index? qform)
          trace?            (:trace? qform)
          memo-size         (:memo-size qform)
          with              (:with qform)
          keys-spec         (:keys qform)
          syms-spec         (:syms qform)
          strs-spec         (:strs qform)]
      (into {}
            (remove (comp nil? val)
                    {:find              find
                     :where             where
                     :in                (or in [])
                     :args              (or provided-args (vec in-args))
                     :return            (or return :kw)
                     :order             order
                     :limit             (long (or limit 0))
                     :offset            (long (or offset 0))
                     :reasoner          reasoner
                     :reasoner-factory  reasoner-factory
                     :options           options
                     :index?            index?
                     :precompute?       precompute?
                     :annotation-index? annotation-index?
                     :trace?            trace?
                     :memo-size         (when memo-size (long memo-size))
                     :with              with
                     :return-map        (cond
                                          keys-spec {:type :keys :fields keys-spec}
                                          syms-spec {:type :syms :fields syms-spec}
                                          strs-spec {:type :strs :fields strs-spec}
                                          :else     nil)})))

    :else (throw (ex-info "Query must be a vector (Datomic) or a map" {:given (type qform)}))))

(defn- datasource-symbol?
  [x]
  (and (symbol? x) (str/starts-with? (name x) "$")))

(defn- variable-symbol?
  [x]
  (and (symbol? x) (str/starts-with? (name x) "?")))

(defn- rule-symbol?
  [x]
  (and (symbol? x) (= "%" (name x))))

(defn- binding-form
  [form]
  (cond
    (vector? form)
    (let [cnt (count form)]
      (cond
        (and (= cnt 2) (= '... (second form)) (variable-symbol? (first form))) :collection
        (and (= cnt 1) (vector? (first form)))                                 :relation
        :else                                                                  :tuple))

    (variable-symbol? form)   :scalar
    (datasource-symbol? form) :datasource
    (rule-symbol? form)       :rules
    (symbol? form)            :pattern
    :else                     (throw (ex-info "Unsupported :in binding" {:binding form}))))

(defn- ensure-context-cache
  [ctx]
  (-> ctx ensure-eng-cache))

(defn- context-map?
  [x]
  (and (map? x)
       (contains? x :manager)
       (contains? x :ontology)))

(defn- prep-scalar-binding
  [{:keys [rows env]} var value]
  {:rows (map #(assoc % var value) rows)
   :env  (assoc env var value)})

(defn- prep-tuple-binding
  [{:keys [rows env]} binding value]
  (when-not (sequential? value)
    (throw (ex-info "Tuple binding requires sequential value" {:binding binding :value value})))
  (when-not (= (count binding) (count value))
    (throw (ex-info "Tuple binding arity mismatch" {:binding binding :value value})))
  (let [vars    binding
        updates (map (fn [var val]
                       (when (and (not= var '_) (not (variable-symbol? var)))
                         (throw (ex-info "Tuple binding requires variables or '_'" {:binding binding :var var})))
                       [var val])
                     vars value)
        env'    (reduce (fn [e [var _]]
                          (if (and var (not= var '_))
                            (dissoc e var)
                            e)) env updates)
        rows'   (map (fn [row]
                       (reduce (fn [r [var val]]
                                 (if (or (nil? var) (= var '_))
                                   r
                                   (assoc r var val)))
                               row updates))
                     rows)]
    {:rows rows' :env env'}))

(defn- prep-collection-binding
  [{:keys [rows env]} binding values]
  (let [var (first binding)]
    (when-not (variable-symbol? var)
      (throw (ex-info "Collection binding must target a variable" {:binding binding})))
    (when-not (sequential? values)
      (throw (ex-info "Collection binding requires sequential values" {:binding binding :value values})))
    {:rows (for [row rows
                 v   values]
             (assoc row var v))
     :env  (dissoc env var)}))

(defn- prep-relation-binding
  [{:keys [rows env]} binding values]
  (let [tuple-form (first binding)]
    (when-not (sequential? values)
      (throw (ex-info "Relation binding requires collection of tuples" {:binding binding :value values})))
    (doseq [tuple values]
      (when-not (= (count tuple-form) (count tuple))
        (throw (ex-info "Relation binding tuple arity mismatch" {:binding binding :tuple tuple}))))
    {:rows (for [row   rows
                 tuple values]
             (reduce (fn [r [var val]]
                       (if (or (= var '_) (nil? var))
                         r
                         (assoc r var val)))
                     row
                     (map vector tuple-form tuple)))
     :env  env}))

(defn- ensure-default-datasource
  [specs]
  (if (some #{'$} specs)
    specs
    (cons '$ specs)))

(defn- prepare-inputs
  "Process :in specifications, returning {:env substitutions :rows initial-rows :sources {:$ ctx ...} :rules rules :patterns patterns :remaining-args seq}."
  [ctx in-specs args]
  (let [specs   (ensure-default-datasource (or in-specs []))
        initial {:rows     [{}]
                 :env      {}
                 :sources  {'$ (ensure-context-cache ctx)}
                 :rules    nil
                 :patterns {}
                 :args     (vec args)}
        {:keys [rows env sources rules patterns args]}
        (reduce
          (fn [{:keys [rows env sources rules patterns args] :as state} spec]
            (let [kind (binding-form spec)]
              (case kind
                :datasource
                (let [sym       spec
                      provided? (seq args)]
                  (if (= sym '$)
                    (assoc state :sources (assoc sources sym (ensure-context-cache ctx)))
                    (let [value   (if provided?
                                    (first args)
                                    (throw (ex-info (str "Datasource " sym " requires argument")
                                                    {:datasource sym})))
                          _       (when-not (context-map? value)
                                    (throw (ex-info (str "Datasource " sym " must be supplied with ontology context")
                                                    {:datasource sym :value value})))
                          context (ensure-context-cache value)]
                      (assoc state :sources (assoc sources sym context)
                             :args (vec (rest args))))))

                :scalar
                (let [value              (if (seq args)
                              (first args)
                              (throw (ex-info "Scalar binding missing value" {:binding spec})))
                      {:keys [rows env]} (prep-scalar-binding {:rows rows :env env} spec value)]
                  (assoc state :rows rows :env env :args (vec (rest args))))

                :tuple
                (let [value              (if (seq args)
                              (first args)
                              (throw (ex-info "Tuple binding missing value" {:binding spec})))
                      {:keys [rows env]} (prep-tuple-binding {:rows rows :env env} spec value)]
                  (assoc state :rows rows :env env :args (vec (rest args))))

                :collection
                (let [value              (if (seq args)
                              (first args)
                              (throw (ex-info "Collection binding missing value" {:binding spec})))
                      {:keys [rows env]} (prep-collection-binding {:rows rows :env env} spec value)]
                  (assoc state :rows rows :env env :args (vec (rest args))))

                :relation
                (let [value              (if (seq args)
                              (first args)
                              (throw (ex-info "Relation binding missing value" {:binding spec})))
                      {:keys [rows env]} (prep-relation-binding {:rows rows :env env} spec value)]
                  (assoc state :rows rows :env env :args (vec (rest args))))

                :rules
                (let [value (if (seq args)
                              (first args)
                              (throw (ex-info "% binding missing rule set" {})))]
                  (assoc state :rules value :args (vec (rest args))))

                :pattern
                (let [value (if (seq args)
                              (first args)
                              (throw (ex-info "Pattern binding missing value" {:binding spec})))]
                  (assoc state :patterns (assoc patterns spec value)
                         :env (assoc env spec value)
                         :args (vec (rest args))))

                state)))
          initial
          specs)]
    (when (seq args)
      (throw (ex-info "Too many arguments supplied to query" {:remaining args :in specs})))
    {:rows     rows
     :env      env
     :sources  sources
     :rules    rules
     :patterns patterns}))

(defn- ensure-rule-form
  [rule]
  (cond
    (vector? rule)     rule
    (sequential? rule) (vec rule)
    :else              (throw (ex-info "Rule must be a sequential form" {:rule rule}))))

(defn- parse-rule-head
  [head]
  (let [head* (ensure-rule-form head)
        name  (first head*)
        vars* (rest head*)]
    (when-not (symbol? name)
      (throw (ex-info "Rule head must begin with a symbol" {:head head :given name})))
    (when (empty? vars*)
      (throw (ex-info "Rule head requires at least one argument" {:head head})))
    (let [[required vars]
          (if (and (seq vars*)
                   (coll? (first vars*))
                   (every? variable-symbol? (first vars*)))
            [(set (first vars*)) (vec (concat (first vars*) (rest vars*)))]
            [#{} (vec vars*)])]
      {:name     name
       :vars     vars
       :required required})))

(defn- compile-rule-set
  [ctx rules]
  (when rules
    (reduce
      (fn [idx rule-form]
        (let [rule*                        (ensure-rule-form rule-form)
              head                         (first rule*)
              clauses                      (rest rule*)
              {:keys [name vars required]} (parse-rule-head head)
              compiled-clauses             (mapv (fn [clause]
                                                   (->> clause
                                                        (normalize-atom ctx)
                                                        (compile-atom ctx)))
                                                 clauses)
              entry                        {:name        name
                                            :vars        vars
                                            :required    required
                                            :clauses     compiled-clauses
                                            :raw-clauses clauses}]
          (update idx name (fnil conj []) entry)))
      {}
      rules)))

(defn q
  "Datomic-like front end over dq. Query first, context second.
   Examples:
   (q '[:find ?y :where [?y :rdf/type :punk/Engineer]] ctx)
   (q '[:find ?y :in $ ?C :where [?y :rdf/type ?C]] ctx :punk/Engineer)
   (q {:query '[:find ?y :where [?y :rdf/type :punk/Engineer]]
       :args  [ctx]})

   Only `:query` and `:args` are recognised in the map form; place
   additional options inside the query itself via `:options`, `:reasoner`, etc."
  ([arg-map]
   (when-not (map? arg-map)
     (throw (ex-info "Query arg-map must be a map" {:given (type arg-map)})))
   (let [allowed-keys #{:query :args}
         extras       (seq (remove allowed-keys (keys arg-map)))]
     (when extras
       (throw (ex-info "Unsupported keys in arg-map; move options into :query"
                       {:arg-map arg-map :unsupported (vec extras)}))))
   (let [{:keys [query args]} arg-map]
     (when-not query
       (throw (ex-info "arg-map query missing :query" {:arg-map arg-map})))
     (when-not (sequential? args)
       (throw (ex-info "arg-map :args must be a sequential collection"
                       {:arg-map arg-map :args args})))
     (when (empty? args)
       (throw (ex-info "arg-map requires at least one datasource argument"
                       {:arg-map arg-map})))
     (apply q query args)))
  ([qform ctx & in-args]
   (when-not ctx
     (throw (ex-info "Query requires ontology context as first argument after query" {:query qform})))
   (let [{:keys [find where in args return order limit offset with return-map]
          :as   parsed}                   (parse-q qform in-args)
         {:keys [rows env sources rules]} (prepare-inputs ctx in args)
         where'                           (map #(substitute-in env %) where)
         engine-opts                      (select-engine-opts parsed)
         qmap                             (merge {:find         find
                                                  :where        where'
                                                  :return       return
                                                  :order        order
                                                  :limit        limit
                                                  :offset       offset
                                                  :with         with
                                                  :return-map   return-map
                                                  :options      (:options parsed)
                                                  :initial-rows rows
                                                  :env          env
                                                  :sources      sources
                                                  :rules        rules}
                                                 (dissoc engine-opts :reasoner :reasoner-factory))
         reasoner-opts                    (select-keys engine-opts [:reasoner :reasoner-factory])]
     (dq ctx (merge qmap reasoner-opts) engine-opts))))
(defn- datatype->form
  [ctx v]
  (cond
    (instance? org.semanticweb.owlapi.model.OWLDatatype v)
    (iri->kw ctx (.getIRI ^org.semanticweb.owlapi.model.OWLDatatype v))
    (instance? org.semanticweb.owlapi.model.OWLDataRange v)
    (data-range->form ctx v)
    (instance? IRI v)
    (iri->kw ctx ^IRI v)
    :else v))

(defn- enumerate-range-properties
  [eng ctx term]
  (letfn [(ensure-obj [t]
            (if (instance? OWLObjectProperty t)
              t
              (as-objprop ctx t)))
          (ensure-data [t]
            (if (instance? OWLDataProperty t)
              t
              (as-dprop ctx t)))]
    (if term
      (try
        (let [kind (ensure-prop-kind ctx :rdfs/range term)]
          (case kind
            :object (let [p (ensure-obj term)]
                      [[(coerce-entity eng p :kw) p :object]])
            :data   (let [p (ensure-data term)]
                      [[(coerce-entity eng p :kw) p :data]])
            nil))
        (catch Exception _ []))
      (concat
        (map (fn [^OWLObjectProperty p]
               [(coerce-entity eng p :kw) p :object])
             (all-object-properties eng))
        (map (fn [^OWLDataProperty p]
               [(coerce-entity eng p :kw) p :data])
             (all-data-properties eng))))))

(defmethod eval-atom :range
  [{:keys [^OWLReasoner reasoner ctx] :as eng} row [_ prop range]]
  (let [prop-bound (bound-value row prop)
        term (or prop-bound (when-not (qvar? prop) prop))
        candidates (enumerate-range-properties eng ctx term)
        {:keys [^OWLOntologyManager manager ^OWLOntology ontology]} ctx
        imports (imports-closure manager ontology)]
    (for [[prop-kw prop-entity kind] candidates
          :let [row1 (bind row prop prop-kw)]
          :when row1
          rv (case kind
               :object (let [^OWLObjectPropertyExpression pe prop-entity
                             reasoner-ranges (node-set->entities (.getObjectPropertyRanges reasoner pe false))
                             explicit-ranges (for [^OWLOntology o imports
                                                   ^org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom ax (.getAxioms o AxiomType/OBJECT_PROPERTY_RANGE)
                                                   :let [expr (.getProperty ax)]
                                                   :when (.equals expr pe)]
                                               (.getRange ax))]
                         (->> (concat reasoner-ranges explicit-ranges)
                              (map (fn [^OWLClassExpression ce]
                                     (if (.isAnonymous ce)
                                       (class-expr->form ctx ce)
                                       (coerce-entity eng (.asOWLClass ce) :kw))))
                              (remove nil?)
                              distinct))
               :data   (let [^OWLDataProperty dp prop-entity
                             explicit-ranges (for [^OWLOntology o imports
                                                   ^OWLDataPropertyRangeAxiom ax (.getAxioms o AxiomType/DATA_PROPERTY_RANGE)
                                                   :let [expr (.getProperty ax)]
                                                   :when (.equals expr dp)]
                                               (.getRange ax))]
                         (->> explicit-ranges
                              (map #(datatype->form ctx %))
                              (remove nil?)
                              distinct)))
          :let [row2 (bind row1 range rv)]
          :when row2]
      row2)))

(defmethod eval-atom :domain
  [{:keys [^OWLReasoner reasoner ctx] :as eng} row [_ prop domain]]
  (let [prop-bound (bound-value row prop)
        term (or prop-bound (when-not (qvar? prop) prop))
        candidates (enumerate-range-properties eng ctx term)
        {:keys [^OWLOntologyManager manager ^OWLOntology ontology]} ctx
        imports (imports-closure manager ontology)
        class->value (fn [^OWLClassExpression ce]
                       (if (.isAnonymous ce)
                         (class-expr->form ctx ce)
                         (coerce-entity eng (.asOWLClass ce) :kw)))]
    (for [[prop-kw prop-entity kind] candidates
          :let [row1 (bind row prop prop-kw)]
          :when row1
          dv (case kind
               :object (let [^OWLObjectPropertyExpression pe prop-entity
                             reasoner-doms (node-set->entities (.getObjectPropertyDomains reasoner pe false))
                             explicit-doms (for [^OWLOntology o imports
                                                 ^OWLObjectPropertyDomainAxiom ax (.getAxioms o AxiomType/OBJECT_PROPERTY_DOMAIN)
                                                 :let [expr (.getProperty ax)]
                                                 :when (.equals expr pe)]
                                             (.getDomain ax))]
                         (->> (concat reasoner-doms explicit-doms)
                              (map class->value)
                              (remove nil?)
                              distinct))
               :data   (let [^OWLDataProperty dp prop-entity
                             reasoner-doms (node-set->entities (.getDataPropertyDomains reasoner dp false))
                             explicit-doms (for [^OWLOntology o imports
                                                 ^OWLDataPropertyDomainAxiom ax (.getAxioms o AxiomType/DATA_PROPERTY_DOMAIN)
                                                 :let [expr (.getProperty ax)]
                                                 :when (.equals expr dp)]
                                             (.getDomain ax))]
                         (->> (concat reasoner-doms explicit-doms)
                              (map class->value)
                              (remove nil?)
                              distinct)))
          :let [row2 (bind row1 domain dv)]
          :when row2]
      row2)))
