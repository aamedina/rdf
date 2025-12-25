(ns net.wikipunk.ontology.sparql.exec
  "Execute SPARQL queries/updates (via Jena) against simple EDN datasets.

  Dataset shape: {:triples #{ {:graph ... :s [:iri ...] :p [:iri ...] :o [:literal {...}]} }}"
  (:require
   [clojure.string :as str]
   [net.wikipunk.ontology.sparql :as sparql])
  (:import
   (java.util Iterator List)
   (org.apache.jena.datatypes TypeMapper)
   (org.apache.jena.query Dataset DatasetFactory Query QueryExecution QueryExecutionFactory QueryFactory QuerySolution ResultSet ResultSetFactory)
   (org.apache.jena.rdf.model Model ModelFactory Statement)
   (org.apache.jena.update UpdateAction UpdateFactory UpdateRequest)))

(set! *warn-on-reflection* true)

;; -----------------------------------------------------------------------------
;; Coercion helpers

(def ^{:doc "Shared Jena TypeMapper used to resolve datatype IRIs."}
  ^TypeMapper type-mapper (TypeMapper/getInstance))

(defn- keyword->iri ^String [k]
  (if-let [ns (namespace k)]
    (str ns "/" (name k))
    (name k)))

(defn- literal-map->literal
  "Convert {:lex ..., :dt ..., :lang ...} to a Jena Literal."
  ^org.apache.jena.rdf.model.Literal [^Model model {:keys [lex dt lang]}]
  (cond
    (some? lang) (.createLiteral model lex lang)
    (some? dt) (.createTypedLiteral model lex (.getSafeTypeByName type-mapper dt))
    :else (.createLiteral model lex)))

(defn- value->resource
  ^org.apache.jena.rdf.model.Resource [^Model model value]
  (cond
    (vector? value)
    (let [[tag payload] value]
      (case tag
        :iri (.createResource model ^String (str payload))
        :bnode (.createResource model)
        :var (.createResource model ^String (str payload))
        :node (.createResource model ^String (str payload))
        (.createResource model ^String (str payload))))

    (keyword? value) (.createResource model ^String (keyword->iri value))
    :else (.createResource model ^String (str value))))

(defn- value->property
  ^org.apache.jena.rdf.model.Property [^Model model value]
  (cond
    (vector? value)
    (let [[tag payload] value]
      (case tag
        :iri (.createProperty model ^String (str payload))
        :node (.createProperty model ^String (str payload))
        (.createProperty model ^String (str payload))))
    (keyword? value) (.createProperty model ^String (keyword->iri value))
    :else (.createProperty model ^String (str value))))

(defn- value->rdf-node
  ^org.apache.jena.rdf.model.RDFNode [^Model model value]
  (cond
    (vector? value)
    (let [[tag payload] value]
      (case tag
        :literal (literal-map->literal model payload)
        :iri (.createResource model ^String (str payload))
        :bnode (.createResource model)
        :var (.createLiteral model ^String (str payload))
        :node (.createLiteral model ^String (str payload))
        (.createLiteral model ^String (str payload))))

    (map? value) (literal-map->literal model value)
    (keyword? value) (.createResource model ^String (keyword->iri value))
    (instance? Boolean value) (.createTypedLiteral model ^Boolean value)
    (number? value) (.createTypedLiteral model value)
    (string? value)
    (if (or (str/starts-with? ^String value "http://")
            (str/starts-with? ^String value "https://"))
      (.createResource model ^String value)
      (.createLiteral model ^String value))
    :else (.createLiteral model ^String (str value))))

(defn- graph->name
  ^String [graph]
  (cond
    (or (nil? graph) (= graph :default)) nil
    (vector? graph)
    (let [[tag payload] graph]
      (case tag
        :iri (str payload)
        :node (str payload)
        :var (str payload)
        :bnode (str payload)
        :literal (str payload)
        (str payload)))
    (keyword? graph) (keyword->iri graph)
    :else (str graph)))

(defn- name->graph
  [name]
  (if (or (nil? name) (= name :default))
    :default
    [:iri name]))

;; -----------------------------------------------------------------------------
;; Dataset conversions

(defn- ensure-named-model
  ^Model [^Dataset dataset graph]
  (let [graph-id (graph->name graph)]
    (if (.containsNamedModel dataset graph-id)
      (.getNamedModel dataset graph-id)
      (let [^Model m (ModelFactory/createDefaultModel)]
        (.addNamedModel dataset graph-id m)
        m))))

(defn dataset->jena
  "Convert an EDN dataset into a Jena Dataset."
  ([dataset]
   (dataset->jena dataset (DatasetFactory/createGeneral)))
  ([dataset ^Dataset ds]
   (doseq [{:keys [graph s p o]} (:triples dataset)]
     (let [graph-name (graph->name graph)
           ^Model model (if (nil? graph-name)
                          (.getDefaultModel ds)
                          (ensure-named-model ds graph))]
       (.add model
             (value->resource model s)
             (value->property model p)
             (value->rdf-node model o))))
   ds))

(defn- statement->triple
  [graph ^Statement st]
  {:graph graph
   :s (sparql/node->edn (.asNode (.getSubject st)))
   :p (sparql/node->edn (.asNode (.getPredicate st)))
   :o (sparql/node->edn (.asNode (.getObject st)))})

(defn jena->dataset
  "Convert a Jena Dataset back into EDN dataset form."
  [^Dataset dataset]
  (let [default-triples (for [^Statement st (iterator-seq (.listStatements (.getDefaultModel dataset)))]
                          (statement->triple :default st))
        named-triples (for [^String name (iterator-seq (.listNames dataset))
                            ^Statement st (iterator-seq (.listStatements (.getNamedModel dataset name)))]
                        (statement->triple (name->graph name) st))]
    {:triples (set (concat default-triples named-triples))}))

;; -----------------------------------------------------------------------------
;; Query execution

(defn- resultset->rows [^ResultSet rs]
  (let [rewind (ResultSetFactory/makeRewindable rs)
        ^List result-vars (.getResultVars rewind)
        vars   (map keyword result-vars)]
    {:vars vars
     :rows (vec
            (for [^QuerySolution qs (iterator-seq rewind)]
              (let [binding (reduce
                               (fn [acc v]
                                 (let [^String var-name v]
                                   (if (.contains qs var-name)
                                     (assoc acc (keyword var-name)
                                            (sparql/node->edn (.asNode (.get qs var-name))))
                                     acc)))
                               {}
                               result-vars)]
                binding)))}))

(defn execute-query
  "Execute a SPARQL query (string or query map) against the provided dataset.
   Returns {:type :ask|:select|:construct|:describe, :query map, and result keys}."
  ([sparql]
   (execute-query {:triples #{}} sparql))
  ([dataset sparql-input]
   (let [query-map (if (map? sparql-input) sparql-input (sparql/parse-string sparql-input))
         ^String query-str (:string query-map)
         ^Query query     (QueryFactory/create query-str)
         ^Dataset ds        (dataset->jena dataset)]
     (with-open [exec ^QueryExecution (QueryExecutionFactory/create query ds)]
       (cond
         (.isAskType query)
         {:type :ask
          :query query-map
          :boolean (.execAsk exec)}

         (.isSelectType query)
         (let [rs (.execSelect exec)
               {:keys [vars rows]} (resultset->rows rs)]
           {:type :select
            :query query-map
            :vars vars
            :rows rows})

         (.isConstructType query)
         (let [model (.execConstruct exec)
               triples (for [st (iterator-seq (.listStatements model))]
                         (statement->triple :default st))]
           {:type :construct
            :query query-map
            :triples (vec triples)})

         (.isDescribeType query)
         (let [model (.execDescribe exec)
               triples (for [st (iterator-seq (.listStatements model))]
                         (statement->triple :default st))]
           {:type :describe
            :query query-map
            :triples (vec triples)})

         :else
         {:type :unknown
          :query query-map})))))

;; -----------------------------------------------------------------------------
;; Update execution

(defn execute-update
  "Execute a SPARQL update (string or update map) against the provided dataset.
   Returns {:update update-map :dataset updated-dataset}."
  ([sparql]
   (execute-update {:triples #{}} sparql))
  ([dataset sparql-input]
   (let [update-map (if (map? sparql-input) sparql-input (sparql/parse-string sparql-input))
         ^String update-str (:string update-map)
         ^UpdateRequest request    (UpdateFactory/create update-str)
         ^Dataset ds         (dataset->jena dataset)]
     (UpdateAction/execute request ds)
     {:update update-map
      :dataset (jena->dataset ds)})))
