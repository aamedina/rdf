(ns net.wikipunk.ontology.sparql-suite-runner
  "Manual driver for the W3C SPARQL 1.1 test manifests.
   Keep this namespace out of the default :test sweep; run it explicitly via
   `clojure -X:test :nses '[net.wikipunk.ontology.sparql-suite-runner]'`."
  (:require
   [clojure.java.io :as io]
   [clojure.pprint :as pp]
   [clojure.string :as str]
   [clojure.test :refer [deftest is testing]]
   [net.wikipunk.ontology.sparql :as sparql]
   [net.wikipunk.ontology.sparql.exec :as exec]
   [net.wikipunk.ontology.sparql.suite :as suite]
   [net.wikipunk.ontology.node :as node]))

(set! *warn-on-reflection* true)

(defn- select-bag [rows]
  (frequencies rows))

(defn- select->rows
  [dataset sparql-query]
  ((:execute (sparql/compile-query-string sparql-query)) dataset))

(defn- normalize-dataset
  "Return dataset with canonical triples only."
  [dataset]
  (-> dataset
      node/canonical-dataset
      (select-keys [:triples])))

(defn- distinct-paths
  "Collect distinct absolute paths from rows using key."
  [rows k]
  (->> rows
       (keep k)
       (keep suite/node->path)
       distinct
       vec))

(defn- collect-named-graphs
  "Collect distinct {:graph iri :path ttl} entries from rows."
  [rows file-key label-key manifest label]
  (->> rows
       (keep (fn [row]
               (when-let [file-node (get row file-key)]
                 (let [path  (suite/node->path file-node)
                       graph (some-> (get row label-key) suite/node->string)]
                   (when-not graph
                     (throw (ex-info "Named graph missing rdfs:label"
                                     {:manifest manifest
                                      :test     label
                                      :path     path})))
                   {:path  path
                    :graph graph}))))
       distinct
       vec))

(defn- feature-groups
  "Group manifests by identical feature sets."
  [features-by-manifest]
  (reduce
    (fn [acc [manifest features]]
      (if (seq features)
        (update acc features (fnil conj (sorted-set)) manifest)
        acc))
    {}
    features-by-manifest))

(defn- print-feature-groups
  [title features-by-manifest]
  (println title)
  (let [groups (feature-groups features-by-manifest)]
    (if (seq groups)
      (doseq [[feature-set manifests] groups]
        (println (format "- %s (%d)" (str/join ", " manifests) (count feature-set)))
        (doseq [feature feature-set]
          (println (str "    " feature))))
      (println "  (no features recorded)")))
  (println))

(def ^:private suite-root
  (io/file "test/resources/sparql11"))

(def ^:private manifests
  (->> (file-seq suite-root)
       (filter #(and (.isFile ^java.io.File %)
                     (= "manifest.ttl" (.getName ^java.io.File %))))
       (map (fn [^java.io.File f]
              (let [path   (.toPath f)
                    parent (.getParent path)
                    label  (if parent
                             (str (.getFileName parent))
                             (str (.getFileName path)))]
                {:label label
                 :path  (.toAbsolutePath path)})))
       (sort-by :label)
       vec))

(def ^:private manifest-paths
  (into {}
        (map (fn [{:keys [label path]}]
               [label (str path)]))
        manifests))

(def ^:private query-test-sparql
  (str "PREFIX mf: <http://www.w3.org/2001/sw/DataAccess/tests/test-manifest#>\n"
       "PREFIX qt: <http://www.w3.org/2001/sw/DataAccess/tests/test-query#>\n"
       "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n"
       "SELECT ?test ?name ?comment ?feature ?query ?data WHERE {\n"
       "  ?test a mf:QueryEvaluationTest ;\n"
       "        mf:action ?action .\n"
       "  OPTIONAL { ?test mf:name ?name }\n"
       "  OPTIONAL { ?test rdfs:comment ?comment }\n"
       "  OPTIONAL { ?test mf:feature ?feature }\n"
       "  OPTIONAL { ?action qt:query ?query }\n"
       "  OPTIONAL { ?action qt:data ?data }\n"
       "}"))

(defn- gather-query-tests
  [manifest-label manifest-path]
  (let [{:keys [dataset]} (suite/load-manifest manifest-path)
        rows              (select->rows dataset query-test-sparql)
        grouped           (group-by :test rows)]
    (->> grouped
         (keep (fn [[test rows]]
                 (let [id         (suite/node->string test)
                       query-path (some->> rows (keep :query) (keep suite/node->path) first)
                       data-files (vec (distinct (keep (comp suite/node->path :data) rows)))
                       features   (->> rows (keep :feature) (keep suite/node->string) set)
                       comment    (some-> (:comment (first rows)) suite/node->string)]
                   (when (and id query-path)
                     {:manifest     manifest-label
                      :id           id
                      :name         (some-> (:name (first rows)) suite/node->string)
                      :comment      comment
                      :features     features
                      :data-files   data-files
                      :dataset      (suite/dataset-from-files {:default data-files})
                      :query-string (slurp query-path)}))))
         vec)))

(def ^:private all-query-tests
  (->> manifests
       (mapcat (fn [{:keys [label path]}]
                 (gather-query-tests label (str path))))
       vec))

(def ^:private update-test-sparql
  (str "PREFIX mf: <http://www.w3.org/2001/sw/DataAccess/tests/test-manifest#>\n"
       "PREFIX ut: <http://www.w3.org/2009/sparql/tests/test-update#>\n"
       "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n"
       "SELECT DISTINCT ?test ?name ?comment ?feature ?request ?actionData ?actionGraphFile ?actionGraphName ?resultNode ?resultData ?resultGraphFile ?resultGraphName WHERE {\n"
       "  ?test a mf:UpdateEvaluationTest ;\n"
       "        mf:action ?action .\n"
       "  OPTIONAL { ?test mf:name ?name }\n"
       "  OPTIONAL { ?test rdfs:comment ?comment }\n"
       "  OPTIONAL { ?test mf:feature ?feature }\n"
       "  OPTIONAL { ?action ut:request ?request }\n"
       "  OPTIONAL { ?action ut:data ?actionData }\n"
       "  OPTIONAL {\n"
       "    ?action ut:graphData ?actionGraphNode .\n"
       "    ?actionGraphNode ut:graph ?actionGraphFile .\n"
       "    OPTIONAL { ?actionGraphNode rdfs:label ?actionGraphName }\n"
       "  }\n"
       "  OPTIONAL {\n"
       "    ?test mf:result ?resultNode .\n"
       "    OPTIONAL { ?resultNode ut:data ?resultData }\n"
       "    OPTIONAL {\n"
       "      ?resultNode ut:graphData ?resultGraphNode .\n"
       "      ?resultGraphNode ut:graph ?resultGraphFile .\n"
       "      OPTIONAL { ?resultGraphNode rdfs:label ?resultGraphName }\n"
       "    }\n"
       "  }\n"
       "}"))

(defn- gather-update-tests
  [manifest-label manifest-path]
  (let [{:keys [dataset]} (suite/load-manifest manifest-path)
        rows              (select->rows dataset update-test-sparql)
        grouped           (group-by :test rows)]
    (->> grouped
         (keep (fn [[test rows]]
                 (let [id           (suite/node->string test)
                       request-path (some->> rows (keep :request) (keep suite/node->path) first)
                       features     (->> rows (keep :feature) (keep suite/node->string) set)
                       comment      (some-> (:comment (first rows)) suite/node->string)]
                   (when id
                     (let [label            (or (some-> (:name (first rows)) suite/node->string) id)
                           action-defaults  (distinct-paths rows :actionData)
                           action-named     (collect-named-graphs rows :actionGraphFile :actionGraphName manifest-label label)
                           result-defaults  (distinct-paths rows :resultData)
                           result-named     (collect-named-graphs rows :resultGraphFile :resultGraphName manifest-label label)
                           has-result?      (or (seq result-defaults)
                                                (seq result-named)
                                                (some :resultNode rows))
                           initial-dataset  (normalize-dataset (suite/dataset-from-files {:default action-defaults
                                                                                          :named   action-named}))
                           expected-dataset (when has-result?
                                              (normalize-dataset (suite/dataset-from-files {:default result-defaults
                                                                                            :named   result-named})))]
                       {:manifest         manifest-label
                        :id               id
                        :name             (some-> (:name (first rows)) suite/node->string)
                        :comment          comment
                        :label            label
                        :features         features
                        :request          request-path
                        :initial-files    {:default action-defaults
                                           :named   action-named}
                        :initial-dataset  initial-dataset
                        :expected?        has-result?
                        :expected-files   {:default result-defaults
                                           :named   result-named}
                        :expected-dataset expected-dataset})))))
         vec)))

(def ^:private all-update-tests
  (->> manifests
       (mapcat (fn [{:keys [label path]}]
                 (gather-update-tests label (str path))))
       vec))

(def ^:private query-tests-by-id
  (into {}
        (map (juxt :id identity))
        all-query-tests))

(def ^:private update-tests-by-id
  (into {}
        (map (juxt :id identity))
        all-update-tests))

(defn- evaluate-test [{:keys [dataset query-string]}]
  (let [compiled (sparql/compile-query-string query-string)
        ours     ((:execute compiled) dataset)
        jena     (exec/execute-query dataset query-string)]
    (case (:type jena)
      :ask    (if (= (:boolean jena) ours)
                {:status :pass}
                {:status   :fail
                 :kind     :ask
                 :expected (:boolean jena)
                 :actual   ours})
      :select (let [expected (select-bag (:rows jena))
                    actual   (select-bag ours)]
                (if (= expected actual)
                  {:status :pass}
                  {:status   :fail
                   :kind     :select
                   :expected expected
                   :actual   actual}))
      {:status :skip
       :reason (str "Unsupported result form " (:type jena))})))

(defn- run-query-test
  [{:keys [dataset query-string manifest id name comment] :as test}]
  (let [label (or name id)]
    (cond
      (str/blank? query-string)
      (assoc test
             :label label
             :status :error
             :result {:status :error
                      :reason "Missing query string"})

      :else
      (try
        (let [result (evaluate-test {:dataset      dataset
                                     :query-string query-string})]
          (assoc test
                 :label label
                 :status (:status result)
                 :result result))
        (catch Throwable t
          (assoc test
                 :label label
                 :status :error
                 :result {:status    :error
                          :reason    (.getMessage t)
                          :exception t}))))))

(defn- run-update-test
  [{:keys [manifest id name request initial-dataset expected? expected-dataset] :as test}]
  (let [label (or name id)]
    (cond
      (str/blank? request)
      (assoc test
             :label label
             :status :error
             :request request
             :error {:reason "Missing update request path"})

      :else
      (try
        (let [update-str (slurp request)
              compiled   (sparql/compile-update-string update-str)
              ours       (normalize-dataset ((:execute compiled) initial-dataset))
              jena       (normalize-dataset (:dataset (exec/execute-update initial-dataset update-str)))
              expected   (when expected? (normalize-dataset expected-dataset))
              status     (cond
                           (and expected (not= (:triples ours) (:triples expected))) :mismatch-expected
                           (and expected (not= (:triples jena) (:triples expected))) :jena-mismatch
                           (not= (:triples ours) (:triples jena))                    :mismatch-jena
                           :else                                                     :pass)]
          (assoc test
                 :label label
                 :status status
                 :request request
                 :update update-str
                 :ours ours
                 :jena jena
                 :expected? expected?
                 :expected expected))
        (catch Throwable t
          (assoc test
                 :label label
                 :status :error
                 :request request
                 :expected? expected?
                 :error {:reason    (.getMessage t)
                         :exception t}))))))

(defn run-test-by-iri
  "Execute a single W3C SPARQL manifest test identified by IRI.
   Returns the enriched test map including :status, :label, and :type
   (:query for QueryEvaluationTest, :update for UpdateEvaluationTest)."
  [iri]
  (let [iri (str iri)]
    (cond
      (contains? query-tests-by-id iri)
      (assoc (run-query-test (get query-tests-by-id iri)) :type :query)

      (contains? update-tests-by-id iri)
      (assoc (run-update-test (get update-tests-by-id iri)) :type :update)

      :else
      (throw (ex-info "Unknown SPARQL manifest test IRI"
                      {:iri iri})))))

(deftest ^:sparql11 w3c-sparql11-query-suite
  (is (seq all-query-tests) "No SPARQL 1.1 query tests discovered")
  (let [results              (map run-query-test all-query-tests)
        totals               (frequencies (map :manifest results))
        passes               (filter #(= :pass (:status %)) results)
        features-by-manifest (reduce
                               (fn [acc {:keys [manifest features]}]
                                 (if (seq features)
                                   (update acc manifest
                                           (fnil into (sorted-set))
                                           features)
                                   acc))
                               {}
                               passes)
        pass-totals          (frequencies (map :manifest passes))
        manifest-order       (->> results (map :manifest) set (into (sorted-set)))
        total-tests          (count results)
        total-pass           (count passes)
        overall              (if (pos? total-tests) (* 100.0 (/ total-pass total-tests)) 0.0)
        skips                (filter #(= :skip (:status %)) results)
        failures             (filter #(= :fail (:status %)) results)
        errors               (filter #(= :error (:status %)) results)
        non-pass             (concat failures errors skips)]
    (when (seq manifest-order)
      (println "Coverage by manifest:")
      (let [rows (mapv
                   (fn [manifest]
                     (let [total           (get totals manifest 0)
                           supported-count (get pass-totals manifest 0)
                           feature-set     (get features-by-manifest manifest (sorted-set))
                           _               (when-not (set? feature-set)
                                             (throw (ex-info "Expected feature-set to be a set"
                                                             {:manifest manifest
                                                              :value    feature-set})))
                           coverage        (if (pos? total) (* 100.0 (/ supported-count total)) 0.0)]
                       {:manifest  manifest
                        :supported supported-count
                        :total     total
                        :coverage  (format "%.1f%%" coverage)
                        :features  (count feature-set)}))
                   manifest-order)]
        (pp/print-table [:manifest :supported :total :coverage :features] rows)
        (print-feature-groups "Supported features by manifest (unique lists):" features-by-manifest)))
    (doseq [{:keys [manifest label id result status comment]} results
            :when                                             (not= status :pass)]
      (let [testing-label (str manifest " :: " label " <" id ">"
                               (when comment (str " – " comment)))]
        (testing testing-label
          (cond
            (= status :fail)
            (let [{:keys [kind expected actual]} result]
              (is (= expected actual)
                  (format "%s mismatch"
                          (str/upper-case (name kind))))))
          (= status :error)
          (is false
              (format "Query execution raised error: %s"
                      (:reason result)))
          (= status :skip)
          (is false
              (format "Unsupported result form: %s"
                      (:reason result)))
          :else
          (is false (str "Unhandled status " status)))))
    (printf "Query suite coverage summary: %d/%d tests (%.1f%%) executed with engine parity.%n"
            total-pass total-tests overall)))

(deftest ^:sparql11 w3c-sparql11-update-suite
  (is (seq all-update-tests) "No SPARQL 1.1 update tests discovered")
  (let [results              (map run-update-test all-update-tests)
        totals               (frequencies (map :manifest results))
        passes               (filter #(= :pass (:status %)) results)
        features-by-manifest (reduce
                               (fn [acc {:keys [manifest features]}]
                                 (if (seq features)
                                   (update acc manifest (fnil into (sorted-set)) features)
                                   acc))
                               {}
                               passes)
        pass-totals          (frequencies (map :manifest passes))
        manifest-order       (->> results (map :manifest) set (into (sorted-set)))
        total-tests          (count results)
        total-pass           (count passes)
        overall              (if (pos? total-tests) (* 100.0 (/ total-pass total-tests)) 0.0)
        status-groups        (group-by :status results)]
    (when (seq manifest-order)
      (println "Update coverage by manifest:")
      (let [rows (mapv
                   (fn [manifest]
                     (let [total           (get totals manifest 0)
                           supported-count (get pass-totals manifest 0)
                           feature-set     (get features-by-manifest manifest (sorted-set))
                           coverage        (if (pos? total) (* 100.0 (/ supported-count total)) 0.0)]
                       {:manifest  manifest
                        :supported supported-count
                        :total     total
                        :coverage  (format "%.1f%%" coverage)
                        :features  (count feature-set)}))
                   manifest-order)]
        (pp/print-table [:manifest :supported :total :coverage :features] rows))
      (print-feature-groups "Supported update features by manifest (unique lists):" features-by-manifest))

    (doseq [{:keys [manifest label id comment status ours jena expected expected? request error]} results]
      (let [testing-label (str manifest " :: " label " <" id ">"
                               (when comment (str " – " comment)))]
        (testing testing-label
          (case status
            :pass (do
                    (is (= (:triples ours) (:triples jena))
                        (format "Engine result diverged from Jena.%nrequest: %s" (or request "<unknown>")))
                    (when expected?
                      (is (= (:triples ours) (:triples expected))
                          (format "Engine result diverged from expected dataset.%nrequest: %s" (or request "<unknown>")))))

            :mismatch-expected
            (is (= (:triples expected) (:triples ours))
                (format "Engine result differs from expected dataset (request: %s)"
                        (or request "<unknown>")))

            :jena-mismatch
            (do
              (is (= (:triples expected) (:triples jena))
                  (format "Jena result differs from expected dataset (request: %s)"
                          (or request "<unknown>")))
              (is (= (:triples expected) (:triples ours))
                  (format "Engine result no longer matches expected dataset (request: %s)"
                          (or request "<unknown>") )))

            :mismatch-jena
            (is (= (:triples ours) (:triples jena))
                (format "Engine result differs from Jena (request: %s)"
                        (or request "<unknown>")))

            :error (is false
                       (format "Update execution raised error: %s%nrequest: %s"
                               (or (get-in error [:reason]) "<no reason>")
                               (or request "<unknown>")))
            (is false (str "Unhandled update status " status))))))

    (printf "Update suite coverage summary: %d/%d tests (%.1f%%) executed with engine parity.%n"
            total-pass total-tests overall)))
