(ns net.wikipunk.ontology.sparql.suite
  "Load SPARQL 1.1 test suite manifests and execute them against the engines."
  (:require
   [clojure.java.io :as io]
   [clojure.string :as str]
   [net.wikipunk.ontology.sparql.exec :as exec])
  (:import
   (java.net URI)
   (java.util UUID)
   (java.nio.file Paths)
   (org.apache.jena.query Dataset DatasetFactory Query QueryExecution QueryExecutionFactory QuerySolution QueryFactory ResultSet)
   (org.apache.jena.rdf.model Model RDFList Resource ResourceFactory Statement)
   (org.apache.jena.riot RDFDataMgr)
   (org.apache.jena.vocabulary RDF)))

(set! *warn-on-reflection* true)

;; -----------------------------------------------------------------------------
;; Names + helpers

(def ^:private mf-ns "http://www.w3.org/2001/sw/DataAccess/tests/test-manifest#")
(def ^:private qt-ns "http://www.w3.org/2001/sw/DataAccess/tests/test-query#")

(def ^:private ^Resource mf-Manifest (ResourceFactory/createResource (str mf-ns "Manifest")))
(def ^:private ^Resource mf-QueryEvaluationTest (ResourceFactory/createResource (str mf-ns "QueryEvaluationTest")))
(def ^:private ^Resource mf-UpdateEvaluationTest (ResourceFactory/createResource (str mf-ns "UpdateEvaluationTest")))
(def ^:private ^Resource mf-entries (ResourceFactory/createProperty (str mf-ns "entries")))
(def ^:private ^Resource mf-include (ResourceFactory/createProperty (str mf-ns "include")))
(def ^:private ^Resource mf-name (ResourceFactory/createProperty (str mf-ns "name")))
(def ^:private ^Resource mf-action (ResourceFactory/createProperty (str mf-ns "action")))
(def ^:private ^Resource mf-result (ResourceFactory/createProperty (str mf-ns "result")))

(def ^:private ^Resource qt-query (ResourceFactory/createProperty (str qt-ns "query")))
(def ^:private ^Resource qt-data (ResourceFactory/createProperty (str qt-ns "data")))
(def ^:private ^Resource qt-graphData (ResourceFactory/createProperty (str qt-ns "graphData")))
(def ^:private ^Resource qt-serviceData (ResourceFactory/createProperty (str qt-ns "serviceData")))

(def ^:private ut-ns "http://www.w3.org/2009/sparql/tests/test-update#")
(def ^:private ^Resource ut-request (ResourceFactory/createProperty (str ut-ns "request")))
(def ^:private ^Resource ut-data (ResourceFactory/createProperty (str ut-ns "data")))
(def ^:private ^Resource ut-graphData (ResourceFactory/createProperty (str ut-ns "graphData")))
(def ^:private ^Resource ut-graph (ResourceFactory/createProperty (str ut-ns "graph")))

(def ^:private ^Resource rdfs-label (ResourceFactory/createProperty "http://www.w3.org/2000/01/rdf-schema#label"))

(defn- normalize-path ^String [^String path]
  (cond
    (nil? path) nil
    (str/starts-with? path "file:")
    (-> (Paths/get (URI. path))
        .toAbsolutePath
        str)
    (or (str/starts-with? path "http://")
        (str/starts-with? path "https://")) path
    :else (.getAbsolutePath (io/file path))))

(defn- resource->path
  "Convert a Jena resource with a file URI into an absolute filesystem path string."
  ^String [^Resource res]
  (when (and res (.isURIResource res))
    (normalize-path (.getURI res))))

(defn- rdf-list->seq
  "Return the resources in a RDF collection (rdf:List)."
  [^Statement stmt]
  (when stmt
    (let [node (.getObject stmt)]
      (when (.isResource node)
        (let [^Resource res (.asResource node)
              ^RDFList list (.as res RDFList)]
          (loop [l list
                 acc []]
            (if (.isEmpty l)
              acc
              (recur (.getTail l)
                     (conj acc (.getHead l))))))))))

(defn- property-resources
  "Return the resource objects for subject/property."
  [^Resource subject property]
  (->> (.listProperties subject property)
       iterator-seq
       (keep (fn [^Statement st]
               (let [node (.getObject st)]
                 (when (.isResource node)
                   (.asResource node)))))))

(defn- literal-value
  [^Statement stmt]
  (when stmt
    (let [node (.getObject stmt)]
      (cond
        (.isLiteral node) (.getString (.asLiteral node))
        (.isResource node) (.getURI (.asResource node))
        :else (str node)))))

(defn- test-type
  [^Resource test]
  (cond
    (.hasProperty test RDF/type mf-QueryEvaluationTest) :query-eval
    (.hasProperty test RDF/type mf-UpdateEvaluationTest) :update-eval
    :else :unknown))

(defn- extract-test
  [^Model model ^Resource test]
  (let [type (test-type test)]
    (when-not (= type :unknown)
      (let [action-res (some-> (.getProperty test mf-action) .getResource)
            name (some-> (.getProperty test mf-name) literal-value)
            query-path (some-> (first (property-resources action-res qt-query)) resource->path)
            data-files (map resource->path (property-resources action-res qt-data))
            graph-files (map resource->path (property-resources action-res qt-graphData))
            service-files (map resource->path (property-resources action-res qt-serviceData))
            result-path (some-> (.getProperty test mf-result) .getResource resource->path)]
        {:id (.getURI test)
         :type type
         :name name
         :query query-path
         :data-files (vec (remove nil? data-files))
         :graph-files (vec (remove nil? graph-files))
         :service-files (vec (remove nil? service-files))
         :result result-path}))))

(def ^{:private true :tag String} include-query
  (str "PREFIX mf: <" mf-ns ">\n"
       "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"
       "SELECT ?include WHERE {\n"
       "  ?manifest a mf:Manifest .\n"
       "  ?manifest mf:include ?list .\n"
       "  ?list rdf:rest*/rdf:first ?include .\n"
       "}"))

(defn- dataset-includes
  [^Dataset dataset]
  (let [^Query q (QueryFactory/create include-query)]
    (with-open [^QueryExecution qe (QueryExecutionFactory/create q dataset)]
      (let [^ResultSet rs (.execSelect qe)]
        (loop [acc []]
          (if (.hasNext rs)
            (let [^QuerySolution qs (.next rs)
                  node (.get qs "include")]
              (if (and node (.isURIResource node))
                (let [^Resource res (.asResource node)]
                  (recur (conj acc (normalize-path (.getURI res)))))
                (recur acc)))
            acc))))))

(defn- merge-datasets!
  [^Dataset target ^Dataset source]
  (let [tgraph (.asDatasetGraph target)
        sgraph (.asDatasetGraph source)
        iter (.find sgraph)]
    (while (.hasNext iter)
      (.add tgraph (.next iter))))
  target)

(defn- load-manifest-dataset
  [manifest-path visited]
  (let [abs-path (normalize-path manifest-path)
        dataset (RDFDataMgr/loadDataset abs-path)]
    (if (visited abs-path)
      dataset
      (let [includes (dataset-includes dataset)
            visited' (conj visited abs-path)]
        (doseq [inc includes]
          (merge-datasets! dataset (load-manifest-dataset inc visited')))
        dataset))))

(defn load-manifest
  "Load a W3C SPARQL 1.1 manifest. Returns {:manifest <abs-path> :dataset <edn dataset>}"
  ([manifest-path]
   (load-manifest manifest-path #{}))
  ([manifest-path visited]
   (let [abs-path (normalize-path manifest-path)
         dataset (load-manifest-dataset manifest-path visited)]
     {:manifest abs-path
      :dataset (exec/jena->dataset dataset)})))

;; -----------------------------------------------------------------------------
;; Dataset helpers

(defn- add-default-data!
  [^Dataset ds files]
  (let [^Model default-model (.getDefaultModel ds)]
    (doseq [file files]
      (when file
        (RDFDataMgr/read default-model ^String file)))))

(defn- add-named-data!
  [^Dataset ds named]
  (doseq [{:keys [graph path]} named]
    (when path
      (let [model (RDFDataMgr/loadModel path)
            name (or graph (str "urn:graph:" (UUID/randomUUID)))]
        (.addNamedModel ds ^String name model)))))

(defn dataset-from-files
  "Given {:default [files] :named [{:graph uri :path file} ...]}, return EDN dataset."
  [{:keys [default named]}]
  (let [^Dataset ds (DatasetFactory/createGeneral)]
    (add-default-data! ds default)
    (add-named-data! ds named)
    (exec/jena->dataset ds)))

(defn dataset-for-test
  "Build a dataset from the manifest-provided files in a test map."
  [{:keys [data-files graph-data]}]
  (dataset-from-files {:default data-files :named graph-data}))

(defn node->string
  "Convert a canonical RDF node to a string (lexical for literals, URI for IRIs)."
  [node]
  (cond
    (vector? node)
    (case (first node)
      :iri (second node)
      :bnode (second node)
      :node (second node)
      :literal (get-in node [1 :lex])
      nil)
    (string? node) node
    :else nil))

(defn node->path
  "Convert a canonical node referencing a file/IRI into an absolute filesystem path when applicable."
  [node]
  (some-> (node->string node) normalize-path))

(defn query-string
  "Read the SPARQL query string for a test map."
  [{:keys [query]}]
  (when query
    (slurp query)))
