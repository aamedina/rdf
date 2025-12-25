(ns net.wikipunk.ontology.audit-test
  (:require
   [clojure.string :as str]
   [clojure.test :refer :all]
   [net.wikipunk.ontology.audit :as audit]))

(deftest smart-report-returns-text
  ;; Smoke test: ensure the audit runs and returns a non-empty string.
  (let [txt (audit/smart-report ["test/resources/violations/owl2dl_violations.ttl"])]
    (is (string? txt))
    (is (< 0 (count txt)))))

(deftest single-valued-annotations-are-unique
  (let [tmp        (doto (java.io.File/createTempFile "rdf-audit-" ".ttl") (.deleteOnExit))
        ttl        (str
                     "@prefix ex: <https://example.com/> .\n"
                     "@prefix owl:  <http://www.w3.org/2002/07/owl#> .\n"
                     "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n\n"
                     "ex:Thing a owl:Class ; rdfs:label \"Thing\" .\n")
        _          (spit tmp ttl)
        violations (audit/single-valued-annotation-violations [(.getAbsolutePath tmp)])
        format-entry (fn [{:keys [subject predicate values graphs]}]
                       (let [vals-str (->> values
                                           (map (fn [[lex lang]]
                                                  (if (seq lang)
                                                    (str lex "@" lang)
                                                    lex)))
                                           (str/join ", "))]
                         (format "  subject: %s\n    predicate: %s\n    graphs: %s\n    values: %s"
                                 subject predicate (pr-str (sort graphs)) vals-str)))]
    (is (empty? violations)
        (str "Multiple literals for single-valued annotations:\n"
             (str/join "\n" (map format-entry violations))))))

(deftest audit-flags-owl2dl-violations-from-fixture
  ;; Verify we catch OWL 2 DL violations using a dedicated fixture TTL
  (let [paths ["test/resources/violations/owl2dl_violations.ttl"]
        txt   (audit/smart-report paths)]
    (is (re-find #"Simple-role violations \(restrictions\):\s*[1-9]" txt)
        "Expected at least one simple-role restriction violation from fixture")
    (is (re-find #"Property-hierarchy cycles:\s*[1-9]" txt)
        "Expected at least one property-hierarchy cycle detected from fixture")
    (is (re-find #"test/resources/violations/owl2dl_violations\.ttl" txt)
        "Expected the violations fixture path to be mentioned")))
