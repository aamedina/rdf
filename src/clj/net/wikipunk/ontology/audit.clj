(ns net.wikipunk.ontology.audit
  "SPARQL-based audits across TTL files.

  Loads each file as a named graph and compares graph signatures to detect
  real RDF conflicts (not just duplicate text)."
  (:require
   [clojure.java.io :as io]
   [clojure.string :as str]
   [clojure.set :as set]
   [net.wikipunk.ontology.explain :as x])
  (:import
   (org.apache.jena.rdf.model ModelFactory Resource Statement)
   (org.apache.jena.query Dataset DatasetFactory QueryFactory QueryExecutionFactory ResultSet)
   (org.apache.jena.riot RDFDataMgr)
   (org.apache.jena.vocabulary RDF RDFS OWL)
   (org.semanticweb.owlapi.model IRI OWLOntologyManager OWLOntologyID)
   (org.semanticweb.owlapi.profiles OWL2DLProfile)))

(defn- ttl-files
  ([] (ttl-files "resources/net/wikipunk"))
  ([dir]
   (->> (file-seq (io/file dir))
        (filter #(and (.isFile ^java.io.File %) (str/ends-with? (.getName ^java.io.File %) ".ttl")))
        (map #(.getPath ^java.io.File %))
        sort)))

(defn punk-ttl-files
  "Public helper returning the list of default ontology TTL files."
  []
  (ttl-files))

;; --- Jena-based smart audit --------------------------------------------------

(def punk-ns "https://wikipunk.net/")

(defn load-model
  "Load a TTL/RDF file into a fresh Jena model."
  [path]
  (let [m (ModelFactory/createDefaultModel)]
    (RDFDataMgr/read m path)
    m))

(defn dataset-from-files
  "Create a Jena Dataset with each TTL as a named graph."
  ([] (dataset-from-files (ttl-files)))
  (^Dataset [paths]
   (let [ds (DatasetFactory/create)
         pm (.getPrefixMapping ds)]
     (doseq [p    paths
             :let [m (load-model p)]]
       (.addNamedModel ds (str p) m)
       (.setNsPrefixes pm m))
     ds)))

(defn print-trig
  "Prints the dataset composed of all of the named graphs as Trig using Jena."
  []
  (let [ds (dataset-from-files (ttl-files))]
    (org.apache.jena.riot.RDFDataMgr/write System/out
                                           ds
                                           org.apache.jena.riot.Lang/TRIG)))

(def ^:private prefixes
  (str "PREFIX rdf:  <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"
       "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n"
       "PREFIX owl:  <http://www.w3.org/2002/07/owl#>\n"
       "PREFIX skos: <http://www.w3.org/2004/02/skos/core#>\n"))

(defn- run-select [^Dataset ds ^String q]
  (with-open [qe (QueryExecutionFactory/create (QueryFactory/create (str prefixes q)) ds)]
    (let [rs (.execSelect qe)]
      (loop [acc []]
        (if (.hasNext rs)
          (let [sol (.next rs)
                vars (iterator-seq (.varNames sol))
                row  (reduce (fn [m v]
                               (assoc m (keyword v) (some-> (.get sol v) str)))
                             {}
                             vars)]
            (recur (conj acc row)))
          acc)))))

(def ^:private single-valued-annotation-iris
  ["http://www.w3.org/2004/02/skos/core#prefLabel"
   "http://www.w3.org/2004/02/skos/core#definition"])

(defn single-valued-annotation-violations
  "Return a seq of {:subject s :predicate p :graphs #{...} :values #{[lex lang] ...}}
  for any subject that has more than one distinct literal value for predicates
  that the Datomic schema treats as cardinality-one annotations."
  ([] (single-valued-annotation-violations (ttl-files)))
  ([paths]
   (let [ds    (dataset-from-files paths)
         iri-in (->> single-valued-annotation-iris
                     (map #(str "<" % ">"))
                     (str/join ", "))
         query (str
                 "SELECT ?g ?s ?p ?lex ?lang WHERE { GRAPH ?g { ?s ?p ?o ."
                 " FILTER(?p IN (" iri-in "))"
                 " FILTER(isLiteral(?o))"
                 " BIND(STR(?o) AS ?lex)"
                 " BIND(LANG(?o) AS ?lang)"
                 " } }")
         rows  (run-select ds query)
         grouped (reduce (fn [m {:keys [g s p lex lang]}]
                           (let [k [s p]]
                             (-> m
                                 (update-in [k :subject] #(or % s))
                                 (update-in [k :predicate] #(or % p))
                                 (update-in [k :graphs] (fnil conj #{}) g)
                                 (update-in [k :values] (fnil conj #{}) [lex lang]))))
                         {}
                         rows)]
     (->> grouped
          (keep (fn [[_ {:keys [values] :as entry}]]
                  (when (> (count values) 1)
                    (update entry :graphs set))))))))

(defn dataproperty-class-range
  "Return vector of maps {:property p :range r :graph g} for any owl:DatatypeProperty
   whose rdfs:range is an IRI in the punk namespace (likely intended to be a Class).
   Useful to detect class/datatype punning such as using :punk/Effect as a datatype."
  ([] (dataproperty-class-range (ttl-files)))
  ([paths]
   (let [ds (dataset-from-files paths)
         q  (str
              "SELECT ?g ?p ?r WHERE { GRAPH ?g { ?p a owl:DatatypeProperty ; rdfs:range ?r ."
              " FILTER(STRSTARTS(STR(?r), '" punk-ns "')) } }")]
     (run-select ds q))))

(defn index-by-subject
  "Build subject index via SPARQL across named graphs. Returns
  {subject-uri {:files #{...}
                :by-file {graph {:kinds #{...}
                                 :domain #{...}
                                 :range #{...}
                                 :labels #{...}
                                 :subClassOf #{...}}}}}"
  [paths]
  (let [ds   (dataset-from-files paths)
        qtyp "SELECT ?g ?s ?t WHERE { GRAPH ?g { ?s a ?t . FILTER(STRSTARTS(STR(?s), 'https://wikipunk.net/')) FILTER(?t IN (owl:ObjectProperty, owl:DatatypeProperty, owl:AnnotationProperty, owl:Class)) } }"
        qdom "SELECT ?g ?s ?d WHERE { GRAPH ?g { ?s rdfs:domain ?d . FILTER(STRSTARTS(STR(?s), 'https://wikipunk.net/')) } }"
        qrng "SELECT ?g ?s ?r WHERE { GRAPH ?g { ?s rdfs:range  ?r . FILTER(STRSTARTS(STR(?s), 'https://wikipunk.net/')) } }"
        qlab "SELECT ?g ?s ?l WHERE { GRAPH ?g { ?s rdfs:label ?l . FILTER(STRSTARTS(STR(?s), 'https://wikipunk.net/')) } }"
        qsub "SELECT ?g ?s ?o WHERE { GRAPH ?g { ?s rdfs:subClassOf ?o . FILTER(STRSTARTS(STR(?s), 'https://wikipunk.net/')) } }"
        qeq  "SELECT ?g ?s ?o WHERE { GRAPH ?g { ?s owl:equivalentClass ?o . FILTER(STRSTARTS(STR(?s), 'https://wikipunk.net/')) } }"
        qdis "SELECT ?g ?s ?o WHERE { GRAPH ?g { ?s owl:disjointWith ?o . FILTER(STRSTARTS(STR(?s), 'https://wikipunk.net/')) } }"
        types (run-select ds qtyp)
        doms  (run-select ds qdom)
        rngs  (run-select ds qrng)
        labs  (run-select ds qlab)
        subs  (run-select ds qsub)
        eqs   (run-select ds qeq)
        diss  (run-select ds qdis)]
    (let [acc1 (reduce (fn [acc {:keys [g s t]}]
                         (-> acc
                             (update-in [s :files] (fnil conj #{}) g)
                             (update-in [s :by-file g :kinds] (fnil conj #{}) t)))
                       (sorted-map)
                       types)
          acc2 (reduce (fn [acc {:keys [g s d]}]
                         (update-in acc [s :by-file g :domain] (fnil conj #{}) d))
                       acc1 doms)
          acc3 (reduce (fn [acc {:keys [g s r]}]
                         (update-in acc [s :by-file g :range] (fnil conj #{}) r))
                       acc2 rngs)
          acc4 (reduce (fn [acc {:keys [g s l]}]
                         (update-in acc [s :by-file g :labels] (fnil conj #{}) l))
                       acc3 labs)
          acc5 (reduce (fn [acc {:keys [g s o]}]
                         (update-in acc [s :by-file g :subClassOf] (fnil conj #{}) o))
                       acc4 subs)]
      (let [acc6 (reduce (fn [acc {:keys [g s o]}]
                           (update-in acc [s :by-file g :equivalentClass] (fnil conj #{}) o))
                         acc5 eqs)
            acc7 (reduce (fn [acc {:keys [g s o]}]
                           (update-in acc [s :by-file g :disjointWith] (fnil conj #{}) o))
                         acc6 diss)]
        acc7))))

(defn- union-sig [entry]
  (let [sigs   (vals (:by-file entry))
        kinds  (apply set/union (map #(or (:kinds %) #{}) sigs))
        domain (apply set/union (map #(or (:domain %) #{}) sigs))
        range  (apply set/union (map #(or (:range  %) #{}) sigs))
        subs   (apply set/union (map #(or (:subClassOf %) #{}) sigs))
        eqc    (apply set/union (map #(or (:equivalentClass %) #{}) sigs))
        disj   (apply set/union (map #(or (:disjointWith %) #{}) sigs))]
    (assoc entry :union-signature {:kinds kinds :domain domain :range range :subClassOf subs :equivalentClass eqc :disjointWith disj})))

(defn conflicts
  "Given the subject index (from index-by-subject), returns a map of subject -> conflicts.
  Conflicts reported: :kind-conflict, :punning, :domain-mismatch, :range-mismatch, :label-conflict, :missing-label."
  [subject-index]
  (let [obj-uri (.getURI OWL/ObjectProperty)
        dt-uri  (.getURI OWL/DatatypeProperty)
        cls-uri (.getURI OWL/Class)
        ann-uri (.getURI OWL/AnnotationProperty)]
    (into (sorted-map)
          (keep (fn [[uri {:keys [by-file] :as entry}]]
                  (let [sigs    (vals by-file)
                        kinds   (apply set/union (map #(or (:kinds %) #{}) sigs))
                        obj?    (contains? kinds obj-uri)
                        dt?     (contains? kinds dt-uri)
                        cls?    (contains? kinds cls-uri)
                        prop?   (or obj? dt? (contains? kinds ann-uri))
                        domains (set (map #(or (:domain %) #{}) sigs))
                        ranges  (set (map #(or (:range  %) #{}) sigs))
                        labels  (set (map #(or (:labels %) #{}) sigs))
                        subSets (set (map #(or (:subClassOf %) #{}) sigs))
                        eqSets  (set (map #(or (:equivalentClass %) #{}) sigs))
                        disSets (set (map #(or (:disjointWith %) #{}) sigs))
                        issues  (cond-> []
                                  (and obj? dt?)        (conj :kind-conflict)
                                  (and cls? prop?)      (conj :punning)
                                  (> (count domains) 1) (conj :domain-mismatch)
                                  (> (count ranges) 1)  (conj :range-mismatch)
                                  (> (count labels) 1)  (conj :label-conflict)
                                  (zero? (count (apply set/union labels))) (conj :missing-label))
                        issues  (cond-> issues
                                  (> (count subSets) 1) (conj :subclass-mismatch)
                                  (> (count eqSets)  1) (conj :equivalentClass-mismatch)
                                  (> (count disSets) 1) (conj :disjointWith-mismatch))]
                    (when (and (> (count (keys by-file)) 1)
                               (seq issues))
                      [uri (-> entry union-sig (assoc :conflicts issues))]))))
          subject-index)))

(defn smart-report
  "Human-readable conflict report using parsed RDF. Also reports orphans (referenced but untyped)
  and additional SPARQL diagnostics."
  ([] (smart-report (ttl-files)))
  ([paths]
   (let [idx    (index-by-subject paths)
         confs  (conflicts idx)
         typed  (set (keys idx))
         refs   (->> idx
                     (map (fn [[_ {:keys [by-file]}]] (vals by-file)))
                     (mapcat identity)
                     (map (fn [sig]
                            (set/union (or (:domain sig) #{})
                                       (or (:range sig) #{})
                                       (or (:subClassOf sig) #{}))))
                     (apply set/union))
         orphans (->> refs
                      (filter #(and (str/starts-with? % punk-ns)
                                    (not (contains? typed %))))
                      sort)
         ds     (dataset-from-files paths)
         ;; Additional diagnostics
         q-obj-dt-range (run-select ds "SELECT ?g ?p ?r WHERE { GRAPH ?g { ?p a owl:ObjectProperty; rdfs:range ?r. FILTER EXISTS { ?r a rdfs:Datatype } } }")
         q-dt-class-range (run-select ds "SELECT ?g ?p ?r WHERE { GRAPH ?g { ?p a owl:DatatypeProperty; rdfs:range ?r. FILTER EXISTS { ?r a owl:Class } } }")
         q-multi-domain  (run-select ds "SELECT ?g ?p (COUNT(?d) AS ?n) WHERE { GRAPH ?g { ?p rdfs:domain ?d } } GROUP BY ?g ?p HAVING (?n > 1)")
         q-multi-range   (run-select ds "SELECT ?g ?p (COUNT(?r) AS ?n) WHERE { GRAPH ?g { ?p rdfs:range ?r } } GROUP BY ?g ?p HAVING (?n > 1)")
         q-symm-conflict (run-select ds "SELECT ?g ?p WHERE { GRAPH ?g { ?p a owl:SymmetricProperty, owl:AsymmetricProperty } }")
         q-refl-conflict (run-select ds "SELECT ?g ?p WHERE { GRAPH ?g { ?p a owl:ReflexiveProperty, owl:IrreflexiveProperty } }")
         q-punning       (run-select ds (str
                                      "SELECT ?s (GROUP_CONCAT(DISTINCT STR(?t); SEPARATOR=\", \") AS ?kinds) WHERE { GRAPH ?g { ?s a ?t . "
                                      "FILTER(STRSTARTS(STR(?s), '" punk-ns "')) FILTER(?t IN (owl:Class, owl:ObjectProperty, owl:DatatypeProperty, owl:AnnotationProperty)) } } "
                                      "GROUP BY ?s HAVING (COUNT(DISTINCT ?t) > 1)"))
         q-label-conf    (run-select ds (str
                                      "SELECT ?s (GROUP_CONCAT(DISTINCT ?l; SEPARATOR=\" | \") AS ?labels) WHERE { GRAPH ?g { ?s rdfs:label ?l . "
                                      "FILTER(STRSTARTS(STR(?s), '" punk-ns "')) } } GROUP BY ?s HAVING (COUNT(DISTINCT ?l) > 1)"))
         q-missing-label (run-select ds (str
                                      "SELECT ?g ?s WHERE { GRAPH ?g { ?s a ?t . FILTER(STRSTARTS(STR(?s), '" punk-ns "')) } "
                                      "FILTER NOT EXISTS { GRAPH ?g { ?s rdfs:label ?l } } }"))
         q-cross-untyped (run-select ds (str
                                      "SELECT ?g ?s ?ref WHERE { GRAPH ?g { ?s (rdfs:domain|rdfs:range|rdfs:subClassOf) ?ref . "
                                      "FILTER(STRSTARTS(STR(?ref), '" punk-ns "')) } FILTER NOT EXISTS { GRAPH ?g { ?ref a ?t } } }"))
         q-ont-missing   (run-select ds "SELECT ?g WHERE { GRAPH ?g { FILTER NOT EXISTS { ?o a owl:Ontology } } }")
         q-import-missing (run-select ds (str
                                        "SELECT ?g WHERE { GRAPH ?g { ?o a owl:Ontology . "
                                        "FILTER NOT EXISTS { ?o owl:imports <" punk-ns "> } } }"))
         q-subclass-cycle (run-select ds "SELECT ?g ?c WHERE { GRAPH ?g { ?c rdfs:subClassOf+ ?c } }")
         q-disjoint-hazard (run-select ds "SELECT ?p ?dx ?rx ?g1 ?g2 ?g3 WHERE { GRAPH ?g1 { ?p rdfs:domain ?dx } GRAPH ?g2 { ?p rdfs:range ?rx } GRAPH ?g3 { ?dx owl:disjointWith ?rx } }")
         ;; Intelligent unconstrained property: missing both domain and range and not used in any Restriction
         q-unconstrained (run-select ds (str
                                       "SELECT ?g ?p WHERE { GRAPH ?g { ?p a ?pt . FILTER(?pt IN (owl:ObjectProperty, owl:DatatypeProperty)) } "
                                       "FILTER NOT EXISTS { GRAPH ?g { ?p rdfs:domain ?d } } "
                                       "FILTER NOT EXISTS { GRAPH ?g { ?p rdfs:range ?r } } "
                                       "FILTER NOT EXISTS { GRAPH ?g { ?restr a owl:Restriction ; owl:onProperty ?p } } }"))
         ;; Classes with no axioms: defined as owl:Class but missing common class axioms in the same module
         q-class-no-axioms (run-select ds (str
                                          "SELECT ?g ?c WHERE { GRAPH ?g { ?c a owl:Class . "
                                          "FILTER(STRSTARTS(STR(?c), '" punk-ns "')) "
                                          "FILTER NOT EXISTS { ?c rdfs:subClassOf ?x } "
                                          "FILTER NOT EXISTS { ?c owl:equivalentClass ?x } "
                                          "FILTER NOT EXISTS { ?c owl:disjointWith ?x } } }"))
         ;; Classes unused anywhere across graphs (no instances, not referenced in subclass/domain/range/restrictions)
         q-class-unused (run-select ds (str
                                       "SELECT ?c WHERE { "
                                       "  GRAPH ?g { ?c a owl:Class . FILTER(STRSTARTS(STR(?c), '" punk-ns "')) } "
                                       "  FILTER NOT EXISTS { GRAPH ?g1 { ?x a ?c } } "
                                       "  FILTER NOT EXISTS { GRAPH ?g2 { ?x rdfs:subClassOf ?c } } "
                                       "  FILTER NOT EXISTS { GRAPH ?g3 { ?p rdfs:domain ?c } } "
                                       "  FILTER NOT EXISTS { GRAPH ?g4 { ?p rdfs:range ?c } } "
                                       "  FILTER NOT EXISTS { GRAPH ?g5 { ?r a owl:Restriction ; owl:onClass ?c } } "
                                       "  FILTER NOT EXISTS { GRAPH ?g6 { ?r a owl:Restriction ; owl:someValuesFrom ?c } } "
                                       "  FILTER NOT EXISTS { GRAPH ?g7 { ?r a owl:Restriction ; owl:allValuesFrom ?c } } "
                                       "}"))
         ;; --- OWL 2 DL global restrictions (selected) ----------------------
         ;; Simple roles restriction: properties used in certain constructs must be simple.
         ;; We flag any restriction using a non-simple property.
         q-simple-role-restr (run-select ds (str
                                           "SELECT ?g ?r ?p WHERE {\n"
                                           "  GRAPH ?g { ?r a owl:Restriction ; owl:onProperty ?p .\n"
                                           "               { ?r owl:hasSelf ?b }\n"
                                           "            UNION { ?r owl:minCardinality ?n }\n"
                                           "            UNION { ?r owl:maxCardinality ?n }\n"
                                           "            UNION { ?r owl:qualifiedCardinality ?n }\n"
                                           "            UNION { ?r owl:minQualifiedCardinality ?n }\n"
                                           "            UNION { ?r owl:maxQualifiedCardinality ?n }\n"
                                           "            ?p owl:propertyChainAxiom ?l }\n"
                                           "}"))
         ;; Simple roles restriction on property axioms (Functional, InverseFunctional, Irreflexive, Asymmetric)
         q-simple-role-axioms (run-select ds (str
                                                "SELECT ?g ?p ?t WHERE {\n"
                                                "  GRAPH ?g { ?p a ?t . FILTER(?t IN (owl:FunctionalProperty, owl:InverseFunctionalProperty, owl:IrreflexiveProperty, owl:AsymmetricProperty)) }\n"
                                                "  FILTER EXISTS {\n"
                                                "    { ?s a owl:TransitiveProperty }\n"
                                                "    UNION { ?s owl:propertyChainAxiom ?l }\n"
                                                "    ?s (rdfs:subPropertyOf|owl:equivalentProperty|^owl:equivalentProperty|owl:inverseOf|^owl:inverseOf)* ?p\n"
                                                "  }\n"
                                                "}"))
         ;; DisjointObjectProperties must be simple: flag either side non-simple
         q-simple-role-disjoint (run-select ds (str
                                              "SELECT ?g ?p ?q WHERE {\n"
                                              "  GRAPH ?g { ?p owl:propertyDisjointWith ?q }\n"
                                              "  FILTER ( EXISTS { { ?s a owl:TransitiveProperty } UNION { ?s owl:propertyChainAxiom ?l }\n"
                                              "                    ?s (rdfs:subPropertyOf|owl:equivalentProperty|^owl:equivalentProperty|owl:inverseOf|^owl:inverseOf)* ?p }\n"
                                              "        || EXISTS { { ?s a owl:TransitiveProperty } UNION { ?s owl:propertyChainAxiom ?l2 }\n"
                                              "                    ?s (rdfs:subPropertyOf|owl:equivalentProperty|^owl:equivalentProperty|owl:inverseOf|^owl:inverseOf)* ?q } )\n"
                                              "}"))
         ;; Property-hierarchy cycles via chain/subProperty/equivalent edges
         q-chain-members (run-select ds (str
                                       "SELECT ?g ?p ?l ?pi WHERE { GRAPH ?g { ?p owl:propertyChainAxiom ?l . ?l (rdf:rest*/rdf:first) ?pi } }"))
         q-subprops      (run-select ds "SELECT ?g ?p1 ?p2 WHERE { GRAPH ?g { ?p1 rdfs:subPropertyOf ?p2 } }")
         ;; Build chain edges and filter out allowed reflexive case (n=2 and both elems equal to p)
         chain-groups    (->> q-chain-members (group-by (fn [{:keys [g p l]}] [g p l])))
         allowed-reflex  (into #{}
                               (for [[[g p l] entries] chain-groups
                                     :let [pis   (map :pi entries)
                                           uniq  (set pis)
                                           count (count pis)]
                                     :when (and (= count 2) (= uniq #{p}))]
                                 [g p l]))
         chain-edges     (into []
                               (comp
                                 (map (fn [{:keys [g p l pi]}]
                                        (when (and (not= pi p)
                                                   (not (contains? allowed-reflex [g p l])))
                                          [g pi p])))
                                 (remove nil?))
                               q-chain-members)
         sub-edges       (map (fn [{:keys [g p1 p2]}] [g p1 p2]) q-subprops)
         all-edges       (into [] (concat chain-edges sub-edges))
         adj-by-graph    (reduce (fn [m [g a b]] (update-in m [g a] (fnil conj #{}) b)) {} all-edges)
         ;; Cycle detection per graph (simple DFS)
         cycles-by-graph (into {}
                               (for [[g adj] adj-by-graph]
                                 (let [nodes (set (concat (keys adj) (mapcat seq (vals adj))))
                                       cycles (let [seen (atom #{})
                                                    onst (atom #{})
                                                    found (atom [])]
                                                (letfn [(dfs [u path]
                                                          (swap! seen conj u)
                                                          (swap! onst conj u)
                                                          (doseq [v (get adj u)]
                                                            (cond
                                                              (@onst v) (swap! found conj (conj path v))
                                                              (not (@seen v)) (dfs v (conj path v))))
                                                          (swap! onst disj u))]
                                                  (doseq [n nodes]
                                                    (when-not (@seen n)
                                                      (dfs n [n])))
                                                  @found))]
                                   [g cycles])))
         cycle-lines     (let [rows (->> cycles-by-graph
                                         (mapcat (fn [[g cs]] (for [c cs] {:g g :cycle (str (clojure.string/join " -> " c))}))))]
                          (concat [(str "Property-hierarchy cycles: " (count rows))]
                                  (map (fn [{:keys [g cycle]}] (str "- " g " | " cycle)) (take 5 rows))))
         fmt-rows (fn [rows cols limit]
                    (->> rows (take limit)
                         (map (fn [r] (str "- " (str/join " | " (map #(get r %) cols)))))))
         conf-lines (if (empty? confs)
                      ["No RDF conflicts detected across modules."]
                      (into [(str (count confs) " subjects with potential conflicts:") ""]
                            (mapcat (fn [[uri {:keys [files conflicts union-signature]}]]
                                      (let [base [(str "- " uri)
                                                  (str "  files: " (str/join ", " (sort files)))
                                                  (str "  conflicts: " (str/join ", " (map name conflicts)))]
                                            add  (concat (when (seq (:domain union-signature))
                                                           [(str "  domain: " (str/join ", " (sort (:domain union-signature))))])
                                                         (when (seq (:range union-signature))
                                                           [(str "  range:  " (str/join ", " (sort (:range union-signature))))])
                                                         (when (seq (:labels union-signature))
                                                           [(str "  labels: " (str/join ", " (sort (:labels union-signature))))]))]
                                        (concat base add [""]))))
                                    confs))
         orphan-lines (when (seq orphans)
                        (into [(str (count orphans) " orphans (referenced but untyped):")]
                               (map #(str "- " %) orphans)))
         extra-lines (concat
                      [(str "ObjectProperty with datatype range: " (count q-obj-dt-range))]
                      (fmt-rows q-obj-dt-range [:g :p :r] 5)
                      [(str "DatatypeProperty with class range: " (count q-dt-class-range))]
                      (fmt-rows q-dt-class-range [:g :p :r] 5)
                      [(str "Multiple domain in a module: " (count q-multi-domain))]
                      (fmt-rows q-multi-domain [:g :p :n] 5)
                      [(str "Multiple range in a module: " (count q-multi-range))]
                      (fmt-rows q-multi-range [:g :p :n] 5)
                      [(str "Symmetric vs Asymmetric: " (count q-symm-conflict))]
                      (fmt-rows q-symm-conflict [:g :p] 5)
                      [(str "Reflexive vs Irreflexive: " (count q-refl-conflict))]
                      (fmt-rows q-refl-conflict [:g :p] 5)
                      [(str "Punning (Class/Property): " (count q-punning))]
                      (fmt-rows q-punning [:s :kinds] 5)
                      [(str "Label conflicts: " (count q-label-conf))]
                      (fmt-rows q-label-conf [:s :labels] 5)
                      [(str "Missing labels: " (count q-missing-label))]
                      (fmt-rows q-missing-label [:g :s] 5)
                      [(str "Cross-graph untyped references: " (count q-cross-untyped))]
                      (fmt-rows q-cross-untyped [:g :s :ref] 5)
                      [(str "Graphs missing owl:Ontology: " (count q-ont-missing))]
                      (fmt-rows q-ont-missing [:g] 5)
                      [(str "Graphs missing base import: " (count q-import-missing))]
                      (fmt-rows q-import-missing [:g] 5)
                      [(str "Subclass cycles: " (count q-subclass-cycle))]
                      (fmt-rows q-subclass-cycle [:g :c] 5)
                      [(str "Disjointness hazards: " (count q-disjoint-hazard))]
                      (fmt-rows q-disjoint-hazard [:p :dx :rx :g1 :g2 :g3] 5)
                      [(str "Unconstrained properties (no domain/range or restrictions): " (count q-unconstrained))]
                      (fmt-rows q-unconstrained [:g :p] 5)
                      [(str "Classes with no axioms (module-local): " (count q-class-no-axioms))]
                      (fmt-rows q-class-no-axioms [:g :c] 10)
                      [(str "Unused classes (no instances or references): " (count q-class-unused))]
                      (fmt-rows q-class-unused [:c] 10))]
    (let [owl-dl-lines (concat
                         [(str "Simple-role violations (restrictions): " (count q-simple-role-restr))]
                         (fmt-rows q-simple-role-restr [:g :r :p] 5)
                         [(str "Simple-role violations (property axioms): " (count q-simple-role-axioms))]
                         (fmt-rows q-simple-role-axioms [:g :p :t] 5)
                         [(str "Simple-role violations (disjoint properties): " (count q-simple-role-disjoint))]
                         (fmt-rows q-simple-role-disjoint [:g :p :q] 5))]
    (str/join "\n" (concat conf-lines (or orphan-lines []) [""] extra-lines [""] owl-dl-lines [""] cycle-lines))))))

(def ^:private project-root-path
  (-> (System/getProperty "user.dir") io/file .toPath .toAbsolutePath .normalize))

(defn- relativize-path
  [^String path]
  (when path
    (let [target (-> path io/file .toPath .toAbsolutePath .normalize)]
      (if (.startsWith target project-root-path)
        (.toString (.relativize project-root-path target))
        (.toString target)))))

(defn- optional-get
  "Extract value from java.util.Optional, returning nil when empty."
  [^java.util.Optional opt]
  (when (and opt (.isPresent opt))
    (.get opt)))

(defn- violation-source-path
  [^OWLOntologyManager manager violation]
  (let [opt-axiom (try
                    (optional-get (.getAxiom violation))
                    (catch IllegalStateException _ nil)
                    (catch UnsupportedOperationException _ nil)
                    (catch Throwable _ nil))]
    (or (some-> opt-axiom (x/axiom->source-file manager))
        (let [oid ^OWLOntologyID (.getOntologyID violation)]
          (when (and manager oid)
            (when-let [ont (.getOntology manager oid)]
              (let [diri (.getOntologyDocumentIRI manager ont)
                    uri  (.toURI diri)]
                (if (= "file" (.getScheme uri))
                  (.getPath (java.io.File. uri))
                  (str diri)))))))))

(def ^:private project-ontology-root
  (str (-> "resources/net/wikipunk" io/file .toPath .toAbsolutePath .normalize .toString) "/"))

(defn- canonical-path
  [path]
  (some-> path io/file .toPath .toAbsolutePath .normalize .toString))

(defn- group-violations
  [entries]
  (->> entries
       (group-by :file)
       (map (fn [[f es]]
              {:file f
               :violations (mapv :message es)}))
       (sort-by :file)))

(defn- project-module?
  [canonical]
  (and canonical
       (.startsWith ^String canonical project-ontology-root)))

(defn dl-profile-violations
  "Return sequence of {:file p :violations [...]} for each TTL path with OWL 2 DL violations."
  [paths]
  (let [profile        (OWL2DLProfile.)
        canonical-set  (into {} (map (juxt canonical-path identity)) paths)
        project-paths  (keep (fn [[canon original]]
                               (when (project-module? canon)
                                 [canon original]))
                             canonical-set)
        other-paths    (keep (fn [[canon original]]
                               (when-not (project-module? canon)
                                 original))
                             canonical-set)
        project-targets (set (map first project-paths))
        project-entries (when (seq project-targets)
                          (let [{:keys [manager ontology]} (x/load-context "resources/net/wikipunk/boot/dublin_core_terms.ttl")
                                report      (.checkOntology profile ontology)
                                violations  (.getViolations report)]
                            (->> violations
                                 (keep (fn [v]
                                         (let [src (some-> (violation-source-path manager v)
                                                           canonical-path)]
                                           (when (project-module? src)
                                             {:file (relativize-path src)
                                              :message (str v)})))))))
        other-entries  (mapcat (fn [path]
                                 (let [{:keys [manager ontology]} (x/load-context path)
                                       report     (.checkOntology profile ontology)
                                       violations (.getViolations report)
                                       canon      (canonical-path path)]
                                   (for [v violations
                                         :let [src (or (some-> (violation-source-path manager v)
                                                               canonical-path)
                                                       canon)]
                                         :when (project-module? src)]
                                     {:file (relativize-path src)
                                      :message (str v)})))
                               other-paths)]
    (group-violations (concat project-entries other-entries))))
