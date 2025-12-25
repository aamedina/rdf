(ns net.wikipunk.ontology.extract
  "CLI utilities for extracting ontology modules from a full source ontology."
  (:gen-class)
  (:require
   [clojure.java.io :as io]
   [clojure.set :as set]
   [clojure.string :as str]
   [net.wikipunk.ontology.explain :as explain]
   [net.wikipunk.ontology.module :as module])
  (:import
   (java.nio.file Path Paths)
   (java.util HashSet)
   (org.semanticweb.owlapi.formats TurtleDocumentFormat)
   (org.semanticweb.owlapi.model AxiomType IRI OWLAxiom OWLAnnotationAssertionAxiom OWLAnnotationProperty OWLClass OWLClassExpression OWLDataProperty OWLDataPropertyAxiom OWLDatatype OWLDeclarationAxiom OWLEntity OWLEquivalentClassesAxiom OWLEquivalentObjectPropertiesAxiom OWLImportsDeclaration OWLLiteral OWLObjectProperty OWLObjectPropertyAxiom OWLObjectPropertyDomainAxiom OWLObjectPropertyExpression OWLObjectPropertyRangeAxiom OWLInverseObjectPropertiesAxiom OWLNamedIndividual OWLOntologyID OWLSubClassOfAxiom OWLSubObjectPropertyOfAxiom SetOntologyID AddImport RemoveImport OWLOntology OWLOntologyManager)))

(set! *warn-on-reflection* true)

(def ^:dynamic *upper-path*
  "Path/IRI for the *full* source ontology used by the extractor.

  Why: module extraction needs a complete ontology to compute domains,
  dependencies, and module boundaries. A pre-sliced module is not enough.

  Configure via:
  - dynamic binding of *upper-path*
  - JVM property: -Dwikipunk.upper-path=/path/or/iri
  - env var: WIKIPUNK_UPPER_PATH=/path/or/iri"
  nil)

(defn- resolve-upper-path
  []
  (or *upper-path*
      (System/getProperty "wikipunk.upper-path")
      (System/getenv "WIKIPUNK_UPPER_PATH")))

(def ^:private punk-prefix
  "Canonical prefix map used across module extraction scripts."
  {"punk"    "https://wikipunk.net/"
   "obo"     "http://purl.obolibrary.org/obo/"
   "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
   "rdfs"    "http://www.w3.org/2000/01/rdf-schema#"
   "owl"     "http://www.w3.org/2002/07/owl#"
   "xsd"     "http://www.w3.org/2001/XMLSchema#"
   "skos"    "http://www.w3.org/2004/02/skos/core#"
   "dcterms" "http://purl.org/dc/terms/"})

(def ^:private retained-annotation-properties
  "Annotation properties kept even when their provenance does not match the
   upper-module filter. Ensures we preserve documentation such as SKOS
   definitions when copying annotations from the source ontology."
  #{"http://www.w3.org/2004/02/skos/core#definition"
    "http://www.w3.org/2004/02/skos/core#example"
    "http://www.w3.org/2004/02/skos/core#scopeNote"
    "http://www.w3.org/2004/02/skos/core#prefLabel"
    "http://www.w3.org/2004/02/skos/core#altLabel"
    "http://purl.org/dc/terms/source"})

(defn- iri->keyword
  [prefixes ^IRI iri]
  (let [iri-str (str iri)]
    (some (fn [[prefix base]]
            (when (str/starts-with? iri-str base)
              (keyword prefix (subs iri-str (count base)))))
          prefixes)))

(defn- entity->spec
  "Coerce an OWLEntity into a signature spec understood by module/extract."
  [{:keys [prefixes]} ^OWLEntity entity]
  (let [^IRI iri (.getIRI entity)
        kw       (iri->keyword prefixes iri)
        value    (or kw (str iri))]
    (cond
      (instance? org.semanticweb.owlapi.model.OWLClass entity)
      (if (keyword? value) value {:class value})

      (instance? org.semanticweb.owlapi.model.OWLObjectProperty entity)
      {:object-property value}

      (instance? org.semanticweb.owlapi.model.OWLDataProperty entity)
      {:data-property value}

      (instance? org.semanticweb.owlapi.model.OWLAnnotationProperty entity)
      {:annotation-property value}

      (instance? org.semanticweb.owlapi.model.OWLNamedIndividual entity)
      {:individual value}

      (instance? org.semanticweb.owlapi.model.OWLDatatype entity)
      nil

      :else
      (throw (ex-info "Unsupported OWLEntity type in signature extraction"
                      {:entity entity :class (class entity)})))))

(defn- matching-prefix?
  [prefixes value]
  (when (seq prefixes)
    (some #(str/starts-with? value %) prefixes)))

(defn- entity-defined-by-values
  "Return all explicit rdfs:isDefinedBy values for `entity`, falling back to its IRI
   string when no annotations are present."
  [^OWLOntology ontology ^OWLAnnotationProperty is-defined-by ^OWLEntity entity]
  (let [iri-str (str (.getIRI entity))
        annotations (->> (.getAnnotationAssertionAxioms ontology (.getIRI entity))
                          (keep (fn [^OWLAnnotationAssertionAxiom ax]
                                  (when (= (.getProperty ax) is-defined-by)
                                    (let [val (.getValue ax)]
                                      (cond
                                        (instance? IRI val) (str ^IRI val)
                                        (instance? OWLLiteral val) (.getLiteral ^OWLLiteral val)
                                        :else nil))))))]
    (distinct (cons iri-str annotations))))

(defn- select-entities
  "Return the entities and corresponding signature specs that belong in the module
   given inclusion and exclusion prefix rules."
  [{:keys [^OWLOntology ontology manager] :as ctx}
   {:keys [include-prefixes exclude-prefixes]}]
  (let [df (.getOWLDataFactory ^OWLOntologyManager manager)
        ^OWLAnnotationProperty is-defined-by
        (.getOWLAnnotationProperty df (IRI/create "http://www.w3.org/2000/01/rdf-schema#isDefinedBy"))
        include-prefixes (seq include-prefixes)
        exclude-prefixes (seq exclude-prefixes)
        entities (->> (.getSignature ontology)
                      (remove #(.isBuiltIn ^OWLEntity %))
                      (keep (fn [^OWLEntity entity]
                              (let [values (entity-defined-by-values ontology is-defined-by entity)
                                    include? (if include-prefixes
                                               (some #(matching-prefix? include-prefixes %) values)
                                               true)
                                    exclude? (some #(matching-prefix? exclude-prefixes %) values)]
                                (when (and include? (not exclude?))
                                  entity)))))
        specs (->> entities
                   (map #(entity->spec ctx %))
                   (remove nil?)
                   (distinct)
                   vec)]
    {:entities       (set entities)
     :specs          specs
     :is-defined-by  is-defined-by}))

(def ^:private legacy-aliases
  {:upper :punk})

(defn- infer-domain-key
  [iri-str]
  (cond
    (re-find #"http://purl\.obolibrary\.org/obo/([A-Za-z]+)_" iri-str)
    (-> (second (re-find #"http://purl\.obolibrary\.org/obo/([A-Za-z]+)_" iri-str))
        str/lower-case)

    (str/includes? iri-str "commoncoreontologies.org") "cco"

    (str/starts-with? iri-str "https://wikipunk.net/") nil

    :else nil))

(defn- defined-by-prefix
  [domain sample]
  (when sample
    (cond
      (= domain "punk") "https://wikipunk.net/"

      (= domain "cco") "https://www.commoncoreontologies.org/ont"

      (str/starts-with? sample "http://purl.obolibrary.org/obo/")
      (if-let [[_ prefix] (re-find #"(.*/[A-Za-z]+_)" sample)]
        prefix
        (if (re-find #"\d$" sample)
          (str/replace sample #"\d+$" "")
          sample))

      (str/starts-with? sample "https://www.commoncoreontologies.org/")
      (if (re-find #"\d$" sample)
        (str/replace sample #"\d+$" "")
        sample)

      (re-find #"\d$" sample)
      (str/replace sample #"\d+$" "")

      :else sample)))

(def ^:private domain-order
  ["bfo" "cco" "iao" "ro" "obi" "pato" "ncbitaxon" "chebi" "go" "uberon"
   "pco" "po" "cob" "fao" "foodon" "cdno" "envo"])

(def ^:private domain-rank
  (into {}
        (map-indexed (fn [idx domain] [domain idx]))
        domain-order))

(defn- domain-rank-of
  [domain]
  (get domain-rank domain (+ 100 (count domain-rank))))

(def ^:private module-output-dir
  "Directory where extracted modules are written."
  "resources/net/wikipunk/modules")

(defn- module-target
  [domain]
  (let [file (format "%s/punk-%s.ttl" module-output-dir domain)
        iri  (format "https://wikipunk.net/%sModule" (str/upper-case domain))]
    {:output file
     :ontology-iri iri}))

(declare ensure-parent-dir! primary-entities)

(defn- topo-sort-domains
  [deps]
  (let [nodes    (set (concat (keys deps) (mapcat seq (vals deps))))
        outgoing (reduce (fn [m [node depset]]
                           (reduce (fn [acc dep]
                                     (update acc dep (fnil conj #{}) node))
                                   m
                                   depset))
                         (zipmap nodes (repeat #{}))
                         deps)
        indegree (reduce (fn [m [node depset]]
                           (assoc m node (count (filter #(contains? nodes %)
                                                        depset))))
                         (zipmap nodes (repeat 0))
                         deps)
        queue    (into clojure.lang.PersistentQueue/EMPTY
                       (sort (filter #(zero? (get indegree % 0)) nodes)))]
    (loop [order  []
           indegree indegree
           queue queue]
      (if-let [n (peek queue)]
        (let [queue (pop queue)
              dependents (get outgoing n #{})
              [indegree queue]
              (reduce (fn [[indegree queue] dep]
                        (let [new-ind (dec (get indegree dep 0))]
                          (when (neg? new-ind)
                            (throw (ex-info "Negative indegree during topo-sort"
                                            {:module dep})))
                          (let [indegree (assoc indegree dep new-ind)
                                queue    (if (zero? new-ind)
                                           (conj queue dep)
                                           queue)]
                            [indegree queue])))
                      [indegree queue]
                      dependents)]
          (recur (conj order n) indegree queue))
        (if (= (count order) (count nodes))
          order
          (throw (ex-info "Cyclic module dependencies detected"
                          {:unresolved (set/difference nodes (set order))})))))))

(defn- strongly-connected-components
  [deps]
  (let [nodes (set (concat (keys deps) (mapcat seq (vals deps))))
        neighbors (fn [n] (get deps n #{}))
        visited (atom #{})
        order   (atom [])
        dfs1    (fn dfs1 [n]
                  (when-not (contains? @visited n)
                    (swap! visited conj n)
                    (doseq [m (neighbors n)]
                      (dfs1 m))
                    (swap! order conj n)))
        _       (doseq [n nodes] (dfs1 n))
        trans   (reduce (fn [m n]
                          (let [outs (neighbors n)]
                            (reduce (fn [acc to]
                                      (update acc to (fnil conj #{}) n))
                                    (update m n (fnil identity #{}))
                                    outs)))
                        (zipmap nodes (repeat #{}))
                        nodes)
        visited2 (atom #{})
        components (atom [])
        dfs2 (fn dfs2 [n component]
               (when-not (contains? @visited2 n)
                 (swap! visited2 conj n)
                 (swap! component conj n)
                 (doseq [m (get trans n #{})]
                   (dfs2 m component))))]
    (doseq [n (reverse @order)]
      (when-not (contains? @visited2 n)
        (let [component (atom #{})]
          (dfs2 n component)
          (swap! components conj @component))))
    (vec @components)))

(defn- build-module-state
  []
  (let [upper-path (or (resolve-upper-path)
                       (throw (ex-info "Upper ontology path not configured"
                                       {:why "Module extraction requires a complete source ontology."
                                        :how "Set -Dwikipunk.upper-path or WIKIPUNK_UPPER_PATH."
                                        :example "-Dwikipunk.upper-path=/path/to/full.owl"})))
        ctx         (explain/load-context upper-path {:prefixes punk-prefix})
        manager     (:manager ctx)
        ^OWLOntology ontology (:ontology ctx)
        df          (.getOWLDataFactory ^OWLOntologyManager manager)
        is-defined-by (.getOWLAnnotationProperty df (IRI/create "http://www.w3.org/2000/01/rdf-schema#isDefinedBy"))
        entities    (->> (.getSignature ontology)
                          (remove #(.isBuiltIn ^OWLEntity %)))
        accum       (reduce (fn [{:keys [entities values entity->domain] :as acc} ^OWLEntity entity]
                              (let [entity-iri (str (.getIRI entity))
                                    values-list (entity-defined-by-values ontology is-defined-by entity)
                                    actuals     (remove #(= % entity-iri) values-list)
                                    domain      (or (some infer-domain-key actuals)
                                                    (infer-domain-key entity-iri))
                                    sample      (or (first actuals) entity-iri)]
                                (if domain
                                  {:entities       (update entities domain (fnil conj #{}) entity)
                                   :values         (update values domain (fnil conj #{}) sample)
                                   :entity->domain (assoc entity->domain entity domain)}
                                  acc)))
                            {:entities {} :values {} :entity->domain {}}
                            entities)
        domain->entities (:entities accum)
        entity->domain   (:entity->domain accum)
        entity-iri->domain (into {}
                               (map (fn [[^OWLEntity entity domain]]
                                      [(str (.getIRI entity)) domain]))
                               entity->domain)
        domain->values   (:values accum)
        all-domains      (->> (keys domain->entities)
                               (remove #(= % "punk"))
                               sort)
        domain->deps     (reduce (fn [deps [^OWLEntity entity domain]]
                                   (let [deps-for-entity
                                         (reduce (fn [acc ^OWLAxiom ax]
                                                   (let [heads         (primary-entities ax)
                                                         relevant?     (contains? heads entity)
                                                         foreign-head? (some (fn [^OWLEntity head]
                                                                              (let [head-domain (get entity->domain head)]
                                                                                (and head-domain (not= head-domain domain))))
                                                                            heads)]
                                                     (if (or (not relevant?) foreign-head?)
                                                       acc
                                                       (reduce (fn [acc2 ^OWLEntity other]
                                                                 (let [other-domain (get entity->domain other)]
                                                                   (if (or (nil? other-domain)
                                                                           (= other-domain domain)
                                                                           (= other-domain "punk"))
                                                                     acc2
                                                                     (conj acc2 other-domain))))
                                                               acc
                                                               (.getSignature ax)))))
                                                 #{}
                                                 (.getReferencingAxioms ontology entity))]
                                    (update deps domain set/union deps-for-entity)))
                                 (zipmap all-domains (repeat #{}))
                                 (seq entity->domain))
        nodes           (set (concat all-domains (mapcat seq (vals domain->deps))))
        missing         (set/difference nodes (set all-domains))]
    (when (seq missing)
      (throw (ex-info "Missing domain modules for dependencies" {:missing missing})))
    (let [components          (strongly-connected-components domain->deps)
          domain->component   (into {}
                                     (mapcat (fn [[idx nodes]]
                                               (map (fn [n] [n idx]) nodes))
                                             (map-indexed vector components)))
          comp-graph          (into {}
                                     (for [[idx nodes] (map-indexed vector components)]
                                       [idx (reduce (fn [acc domain]
                                                      (into acc
                                                            (keep (fn [dep]
                                                                    (let [dep-idx (get domain->component dep)]
                                                                      (when (and dep-idx (not= dep-idx idx))
                                                                        dep-idx))))
                                                            (get domain->deps domain #{})))
                                                    #{}
                                                    nodes)]))
          comp-order          (topo-sort-domains comp-graph)
          order               (vec (mapcat (fn [comp-idx]
                                             (->> (nth components comp-idx)
                                                  (sort-by domain-rank-of)
                                                  (map keyword)))
                                           comp-order))
          specs               (into {}
                                     (for [domain all-domains
                                           :let [entities      (get domain->entities domain)
                                                 samples       (get domain->values domain)
                                                 prefix        (defined-by-prefix domain (first samples))
                                                 dep-domains   (->> (get domain->deps domain)
                                                                    (filter #(contains? domain->entities %))
                                                                    (filter #(> (domain-rank-of domain)
                                                                               (domain-rank-of %)))
                                                                    (distinct)
                                                                    (sort-by domain-rank-of))
                                                 deps          (mapv keyword dep-domains)
                                                 entity-specs  (->> entities
                                                                    (map #(entity->spec ctx %))
                                                                    (remove nil?)
                                                                    distinct
                                                                    vec)
                                                 {:keys [output ontology-iri]} (module-target domain)]]
                                       [(keyword domain)
                                        {:output             output
                                         :ontology-iri       ontology-iri
                                         :imports            deps
                                         :subtract           deps
                                         :strip-annotations? false
                                         :defined-by-prefixes (when prefix [prefix])
                                         :entities           (set entities)
                                         :specs              entity-specs}]))]
      (doseq [[_ {:keys [output ontology-iri]}] specs]
        (when (and output (not (.exists (io/file output))))
          (ensure-parent-dir! output)
          (spit output (format "@prefix owl: <http://www.w3.org/2002/07/owl#> .\n\n<%s> a owl:Ontology .\n" ontology-iri))))
      {:specs specs
       :order order
       :entity->domain entity-iri->domain})))

(def ^:private module-state
  (delay (build-module-state)))

(defn- module-specs
  []
  (:specs @module-state))

(defn- module-order
  []
  (:order @module-state))

(defn- entity-domain-map
  []
  (:entity->domain @module-state))

(defn- primary-entities
  "Return the set of 'head' entities for an axiom—used to determine which
   module owns the axiom. Mirrors the logic applied during module extraction."
  [^OWLAxiom ax]
  (cond
    (instance? OWLDeclarationAxiom ax)
    #{(.getEntity ^OWLDeclarationAxiom ax)}

    (instance? OWLEquivalentClassesAxiom ax)
    (->> (.getClassExpressions ^OWLEquivalentClassesAxiom ax)
         (keep (fn [^OWLClassExpression expr]
                 (when (not (.isAnonymous expr))
                   (.asOWLClass expr))))
         (into #{}))

    (instance? OWLSubClassOfAxiom ax)
    (let [sub (.getSubClass ^OWLSubClassOfAxiom ax)]
      (if (.isAnonymous sub)
        #{}
        #{(.asOWLClass sub)}))

    (instance? OWLSubObjectPropertyOfAxiom ax)
    (let [^OWLObjectPropertyExpression sub (.getSubProperty ^OWLSubObjectPropertyOfAxiom ax)]
      (if (.isAnonymous sub)
        #{}
        #{(.asOWLObjectProperty sub)}))

    (instance? OWLEquivalentObjectPropertiesAxiom ax)
    (->> (.getProperties ^OWLEquivalentObjectPropertiesAxiom ax)
         (keep (fn [^OWLObjectPropertyExpression expr]
                 (when-not (.isAnonymous expr)
                   (.asOWLObjectProperty expr))))
         (into #{}))

    (instance? OWLInverseObjectPropertiesAxiom ax)
    (set (.getObjectPropertiesInSignature ^OWLInverseObjectPropertiesAxiom ax))

    (instance? OWLObjectPropertyDomainAxiom ax)
    (let [^OWLObjectPropertyExpression prop (.getProperty ^OWLObjectPropertyDomainAxiom ax)]
      (if (.isAnonymous prop)
        #{}
        #{(.asOWLObjectProperty prop)}))

    (instance? OWLObjectPropertyRangeAxiom ax)
    (let [^OWLObjectPropertyExpression prop (.getProperty ^OWLObjectPropertyRangeAxiom ax)]
      (if (.isAnonymous prop)
        #{}
        #{(.asOWLObjectProperty prop)}))

    (instance? OWLObjectPropertyAxiom ax)
    (set (.getObjectPropertiesInSignature ^OWLObjectPropertyAxiom ax))

    (instance? OWLDataPropertyAxiom ax)
    (set (.getDataPropertiesInSignature ^OWLDataPropertyAxiom ax))

    :else #{}))

(defn- ensure-parent-dir!
  [path]
  (some-> path io/file .getParentFile .mkdirs))

(defn- relative-import-target
  "Return a forward-slash relative path from the module output to the import output."
  [module-output import-output]
  (let [^Path module-path (.toAbsolutePath (Paths/get module-output (make-array String 0)))
        module-dir (.getParent module-path)]
    (when-not module-dir
      (throw (ex-info "Module output path lacks a parent directory"
                      {:module-output module-output :import-output import-output})))
    (let [^Path module-dir-path (.normalize ^Path module-dir)
          ^Path import-path (.normalize (.toAbsolutePath (Paths/get import-output (make-array String 0))))
          ^Path relative (try
                           (.normalize (.relativize module-dir-path import-path))
                           (catch IllegalArgumentException e
                             (throw (ex-info "Module and import outputs do not share a common base"
                                             {:module-output module-output :import-output import-output}
                                             e))))
          relative-str (.toString relative)
          sanitized (if (= "/" java.io.File/separator)
                      relative-str
                      (str/replace relative-str java.io.File/separator "/"))]
      (if (str/blank? sanitized)
        (throw (ex-info "Relative import path resolved to empty string"
                        {:module-output module-output :import-output import-output}))
        sanitized))))

(defn- strip-base-declaration!
  "Remove any leading @base declaration emitted by the Turtle writer."
  [path]
  (let [content  (slurp path)
        filtered (->> (str/split-lines content)
                      (remove #(str/starts-with? (str/triml %) "@base"))
                      (str/join "\n"))
        final    (str filtered "\n")]
    (when (not= content final)
      (spit path final))))

(defn- extract-module!
  "Extract the ontology module described by `module-id` and persist it to disk.
   Throws when the module-id is unknown."
  [module-id]
  (let [specs-map (module-specs)
        domain-map (entity-domain-map)
        module-domain (name module-id)
        spec (get specs-map module-id)
        {:keys [seeds output profile ontology-iri imports subtract strip-annotations?
                defined-by-prefixes exclude-defined-by] :as spec-data} spec
        pre-entities (:entities spec-data)
        pre-specs    (:specs spec-data)
        preselection (when (and pre-entities pre-specs)
                       {:entities pre-entities
                        :specs    pre-specs})]
    (when-not spec
      (throw (ex-info (str "Unknown ontology module: " module-id)
                      {:available (keys specs-map)})))
    (let [upper-path (or (resolve-upper-path)
                         (throw (ex-info "Upper ontology path not configured"
                                         {:why "Module extraction requires a complete source ontology."
                                          :how "Set -Dwikipunk.upper-path or WIKIPUNK_UPPER_PATH."
                                          :example "-Dwikipunk.upper-path=/path/to/full.owl"})))
          base-prefix (get punk-prefix "punk")
          iri-mappers (reduce-kv (fn [acc _ {:keys [ontology-iri output]}]
                                    (if (and output (.exists (io/file output)))
                                      (let [filename (.getName (io/file output))
                                            acc (cond-> acc
                                                  ontology-iri (conj [ontology-iri output]))
                                            acc (if (and base-prefix (seq filename))
                                                  (conj acc [(str base-prefix filename) output])
                                                  acc)]
                                        acc)
                                      acc))
                                  []
                                  specs-map)
          ctx         (explain/load-context upper-path {:prefixes    punk-prefix
                                                        :iri-mappers iri-mappers})
          selection   (or preselection
                          (select-entities ctx {:include-prefixes defined-by-prefixes
                                                :exclude-prefixes exclude-defined-by}))
          dependency-entities
          (into #{}
                (mapcat (fn [dep-id]
                          (when-let [path (get-in specs-map [dep-id :output])]
                            (when (.exists (io/file path))
                              (let [{:keys [^OWLOntology ontology]} (explain/load-context path {:prefixes    punk-prefix
                                                                                                   :iri-mappers iri-mappers})]
                                (.getSignature ontology))))))
                (concat imports subtract))
          allowed-entities (into (set dependency-entities) (:entities selection))
          defined-seeds (:specs selection)
          manual-seeds (let [seed-spec seeds]
                         (cond
                           (fn? seed-spec)
                           (let [result (seed-spec ctx)]
                             (when (seq result) result))

                           (sequential? seed-spec)
                           (seq seed-spec)

                           (nil? seed-spec) nil

                           :else [seed-spec]))
          resolved-seeds (->> (into [] defined-seeds)
                              (into (or manual-seeds []))
                              (remove nil?)
                              vec)]
      (when (empty? resolved-seeds)
        (throw (ex-info "No signature seeds derived for module"
                        {:module              module-id
                         :defined-by-prefixes defined-by-prefixes})))
      (let [^OWLOntology source-ontology (:ontology ctx)
            module                       (module/extract ctx resolved-seeds {:profile profile})
            ^OWLOntology ontology        (:ontology module)
            ^OWLOntologyManager manager  (:manager module)
            module-iri                   (or ontology-iri
                                             (str "https://wikipunk.net/" (str/capitalize (name module-id)) "Module"))
            fmt                          (TurtleDocumentFormat.)]
        (.applyChange manager (SetOntologyID. ontology (OWLOntologyID. (IRI/create ^String module-iri) nil)))
        (.setDefaultPrefix fmt nil)
        (doseq [[prefix iri] punk-prefix]
          (.setPrefix fmt prefix iri))
        (when (and source-ontology (not strip-annotations?))
          (doseq [^OWLEntity entity (.getSignature ontology)]
            (let [entity-iri (.getIRI entity)
                  domain     (get domain-map (str entity-iri))]
              (when (or (nil? domain)
                        (= domain module-domain))
                (doseq [ann (.getAnnotationAssertionAxioms source-ontology entity-iri)]
                  (when-not (.containsAxiom ontology ann)
                    (.addAxiom manager ontology ann)))))))
        (when strip-annotations?
          (doseq [ax (.getAxioms ontology AxiomType/ANNOTATION_ASSERTION)]
            (.removeAxiom manager ontology ax)))
        ;; Remove axioms that do not involve any entity from the allowed signature.
        ;; This preserves ENVO restrictions that reference external fillers (e.g., CHEBI, PATO)
        ;; while still dropping declarations for out-of-scope entities.
        (let [allowed? (fn [^OWLEntity entity]
                         (or (.isBuiltIn entity)
                             (contains? allowed-entities entity)
                             (and (instance? OWLAnnotationProperty entity)
                                  (contains? retained-annotation-properties (str (.getIRI entity))))))
              allowed-iris (into #{}
                                  (keep (fn [^OWLEntity entity]
                                          (when-not (.isBuiltIn entity)
                                            (.getIRI entity))))
                                  allowed-entities)]
          (doseq [^OWLAxiom ax (.getAxioms ontology)]
            (let [signature (.getSignature ax)]
              (when (and (seq signature)
                         (not (some allowed? signature)))
                (.removeAxiom manager ontology ax)))
          (doseq [^OWLAnnotationAssertionAxiom ax (.getAxioms ontology AxiomType/ANNOTATION_ASSERTION)]
            (let [subject (.getSubject ax)
                  iri      (when (instance? IRI subject) ^IRI subject)
                  domain   (when iri (get domain-map (str iri)))]
              (when (and iri
                         (or (and (not (contains? allowed-iris iri))
                                  (not (.containsEntityInSignature ontology iri)))
                             (and domain (not= domain module-domain))))
                (.removeAxiom manager ontology ax)))))

        ;; Remove definitional axioms whose primary entities belong to other domains.
        (let [foreign-head? (fn [^OWLEntity entity]
                              (let [domain (get domain-map (str (.getIRI entity)))]
                                (and domain (not= domain module-domain))))]
          (doseq [^OWLAxiom ax (.getAxioms ontology)]
            (let [heads (primary-entities ax)]
              (when (and (seq heads)
                         (not-any? allowed? heads)
                         (some foreign-head? heads))
                (.removeAxiom manager ontology ax)))))

        ;; Subtract axioms that live in dependencies
        (when subtract
          (let [to-remove (HashSet.)]
            (doseq [sid subtract]
              (let [path (get-in specs-map [sid :output])]
                (when-not (and path (.exists (io/file path)))
                  (throw (ex-info "Subtract target missing; run dependency first"
                                  {:module module-id :missing sid})))
                (let [{:keys [^OWLOntology ontology]} (explain/load-context path {:prefixes    punk-prefix
                                                                                  :iri-mappers iri-mappers})]
                  (.addAll to-remove (.getAxioms ontology)))))
            (.removeAxioms manager ontology to-remove)))
        ;; Attach imports
        (when (seq imports)
          (let [df (.getOWLDataFactory manager)]
            (doseq [decl (.getImportsDeclarations ontology)]
              (.applyChange manager (RemoveImport. ontology decl)))
            (doseq [import-id imports]
              (let [iri  (cond
                           (keyword? import-id)
                           (let [import-output (get-in specs-map [import-id :output])]
                             (when-not import-output
                               (throw (ex-info "Unknown import module"
                                               {:module module-id :import import-id})))
                             (let [relative (relative-import-target output import-output)]
                               (IRI/create ^String relative)))
                           (string? import-id) (IRI/create ^String import-id)
                           :else               (throw (ex-info "Unsupported import spec"
                                                               {:module module-id :import import-id})))
                    decl (.getOWLImportsDeclaration df iri)]
                (.applyChange manager (AddImport. ontology decl))))))
        (ensure-parent-dir! output)
        (module/save! module output {:format fmt})
        (strip-base-declaration! output)
        (println "Extracted" (name module-id) "module ->" output))))))

(defn available-modules
  "Return the keywords of supported module extractions."
  []
  (keys (module-specs)))

(defn -main
  "Command line entry point. Usage:

     clojure -M:extract punk envo
     clojure -M:extract all

   Defaults to `punk` when no module id is supplied.

   Requires an upper ontology path/IRI (full source ontology, not a module):
     -Dwikipunk.upper-path=/path/to/full.owl
     or WIKIPUNK_UPPER_PATH=/path/to/full.owl"
  [& args]
  (let [normalize (fn [arg]
                    (let [kw (keyword arg)]
                      (get legacy-aliases kw kw)))
        modules    (module-specs)]
    (if (and (= 1 (count args))
             (= "all" (str/lower-case (first args))))
      (doseq [mid (module-order)]
        (extract-module! mid))
      (let [requested (if (seq args)
                        (mapv normalize args)
                        [:punk])]
        (doseq [mid requested]
          (if (contains? modules mid)
            (extract-module! mid)
            (throw (ex-info "Unknown module id" {:module mid :available (keys modules)}))))))))
