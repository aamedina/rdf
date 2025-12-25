(ns net.wikipunk.ontology.sparql-exec-test
  (:require
   [clojure.test :refer [deftest is]]
   [net.wikipunk.ontology.node :as node]
   [net.wikipunk.ontology.sparql :as sparql]
   [net.wikipunk.ontology.sparql.exec :as exec]))

(defn iri [s]
  (node/iri-node s))

(defn lit
  ([lex dt]
   (node/literal-node lex dt nil))
  ([lex dt lang]
   (node/literal-node lex dt lang)))

(def sample-dataset
  {:triples
   #{
     {:graph :default
      :s [:iri "https://wikipunk.net/intent/1"]
      :p [:iri "http://www.w3.org/1999/02/22-rdf-syntax-ns#type"]
      :o [:iri "https://wikipunk.net/SpecialAction"]}
     {:graph :default
      :s [:iri "https://wikipunk.net/intent/1"]
      :p [:iri "https://wikipunk.net/uses"]
      :o [:iri "https://wikipunk.net/resource/9"]}
     {:graph :default
      :s [:iri "https://wikipunk.net/intent/1"]
      :p [:iri "https://wikipunk.net/has-roll"]
      :o [:literal {:lex "5" :dt "http://www.w3.org/2001/XMLSchema#integer"}]}
     {:graph :default
      :s [:iri "https://wikipunk.net/resource/9"]
      :p [:iri "https://wikipunk.net/has-difficulty"]
      :o [:literal {:lex "15" :dt "http://www.w3.org/2001/XMLSchema#integer"}]}}})

(def feature-dataset
  {:triples
   #{
     {:graph :default
      :s [:iri "http://example.org/player/alex"]
      :p [:iri "http://example.org/score"]
      :o [:literal {:lex "7" :dt "http://www.w3.org/2001/XMLSchema#integer"}]}
     {:graph :default
      :s [:iri "http://example.org/player/alex"]
      :p [:iri "http://example.org/relation"]
      :o [:iri "http://example.org/player/mentor"]}
     {:graph :default
      :s [:iri "http://example.org/player/mentor"]
      :p [:iri "http://example.org/teaches"]
      :o [:iri "http://example.org/skill/hack"]}
     {:graph :default
      :s [:iri "http://example.org/player/bela"]
      :p [:iri "http://example.org/score"]
      :o [:literal {:lex "11" :dt "http://www.w3.org/2001/XMLSchema#integer"}]}
     {:graph :default
      :s [:iri "http://example.org/player/bela"]
      :p [:iri "http://example.org/relation"]
      :o [:iri "http://example.org/player/mentor"]}
     {:graph :default
      :s [:iri "http://example.org/player/bela"]
      :p [:iri "http://example.org/nickname"]
      :o [:literal {:lex "Bee" :lang "en"}]}
     {:graph "http://example.org/ledger"
      :s [:iri "http://example.org/player/alex"]
      :p [:iri "http://example.org/balance"]
      :o [:literal {:lex "5.5" :dt "http://www.w3.org/2001/XMLSchema#decimal"}]}
     {:graph "http://example.org/ledger"
      :s [:iri "http://example.org/player/bela"]
      :p [:iri "http://example.org/balance"]
      :o [:literal {:lex "7.0" :dt "http://www.w3.org/2001/XMLSchema#decimal"}]}
     {:graph :default
      :s [:iri "http://example.org/player/alex"]
      :p [:iri "http://example.org/nickname"]
      :o [:literal {:lex "Al" :lang "en"}]}
     {:graph :default
      :s [:bnode "bn1"]
      :p [:iri "http://example.org/linked"]
      :o [:iri "http://example.org/player/alex"]}}})

(deftest dataset-roundtrip-preserves-structure
  (let [roundtrip (:triples (node/canonical-dataset (exec/jena->dataset (exec/dataset->jena feature-dataset))))]
    (is (= (count (:triples feature-dataset)) (count roundtrip)))
    (is (some #(= [:iri "http://example.org/ledger"] (:graph %)) roundtrip))
    (is (some #(= [:literal {:lex "7"
                              :dt "http://www.w3.org/2001/XMLSchema#integer"
                              :value 7}] (:o %)) roundtrip))
    (is (some #(= :bnode (first (:s %))) roundtrip))))

(deftest execute-query-ask
  (let [sparql "PREFIX punk: <https://wikipunk.net/>
ASK WHERE {
  ?intent a punk:SpecialAction ;
          punk:uses ?agent ;
          punk:has-roll ?minutes .
  ?agent punk:has-difficulty ?available .
  FILTER (?available >= ?minutes)
}"
        result (exec/execute-query sample-dataset sparql)]
    (is (= :ask (:type result)))
    (is (true? (:boolean result)))))

(deftest execute-query-select
  (let [sparql "PREFIX punk: <https://wikipunk.net/>
SELECT ?agent WHERE {
  ?intent a punk:SpecialAction ;
          punk:uses ?agent .
}"
        result (exec/execute-query sample-dataset sparql)]
    (is (= :select (:type result)))
    (is (= [:agent] (:vars result)))
    (is (= [[:iri "https://wikipunk.net/resource/9"]]
           (map :agent (:rows result))))))

(deftest execute-update-modify
  (let [sparql "PREFIX punk: <https://wikipunk.net/>
DELETE {
  ?agent punk:has-difficulty ?available .
}
INSERT {
  ?agent punk:has-difficulty ?new.
}
WHERE {
  ?intent a punk:SpecialAction ;
          punk:uses ?agent ;
          punk:has-roll ?minutes .
  ?agent punk:has-difficulty ?available .
 BIND((?available - ?minutes) AS ?new)
}"
        {:keys [dataset]} (exec/execute-update sample-dataset sparql)
        minutes (some (fn [triple]
                       (when (= [:iri "https://wikipunk.net/has-difficulty"] (:p triple))
                          (:o triple)))
                      (:triples dataset))]
    (is minutes "Result triple present")
    (is (= "10" (get-in minutes [1 :lex])))
    (is (#{{:dt "http://www.w3.org/2001/XMLSchema#integer"}
            {:dt "http://www.w3.org/2001/XMLSchema#decimal"}
            {:dt "http://www.w3.org/2001/XMLSchema#double"}}
           (select-keys (second minutes) [:dt])))))

(deftest execute-query-aggregate-with-order-limit
  (let [sparql "SELECT ?player (SUM(?score) AS ?total) WHERE { ?player <http://example.org/score> ?score } GROUP BY ?player HAVING (?total > 8) ORDER BY DESC(?total) LIMIT 1"
        result (exec/execute-query feature-dataset sparql)]
    (is (= :select (:type result)))
    (is (= [:player :total] (:vars result)))
    (is (= [{:player (iri "http://example.org/player/bela")
             :total (lit "11" node/xsd-integer)}]
           (:rows result)))))

(deftest execute-query-distinct-union-values
  (let [sparql "SELECT DISTINCT ?player WHERE { VALUES ?player { <http://example.org/player/alex> <http://example.org/player/bela> <http://example.org/player/unknown> } { ?player <http://example.org/score> ?score } UNION { ?player <http://example.org/nickname> ?nick } } ORDER BY ?player"
        result (exec/execute-query feature-dataset sparql)]
    (is (= [:player] (:vars result)))
    (is (= [{:player (iri "http://example.org/player/alex")}
            {:player (iri "http://example.org/player/bela")}]
           (:rows result)))))

(deftest execute-query-property-path
  (let [sparql "SELECT ?skill WHERE { <http://example.org/player/bela> <http://example.org/relation>/<http://example.org/teaches> ?skill }"
        result (exec/execute-query feature-dataset sparql)]
    (is (= [{:skill (iri "http://example.org/skill/hack")}]
           (:rows result)))))

(deftest execute-query-property-path-plus
  (let [sparql "SELECT ?skill WHERE { <http://example.org/player/alex> (<http://example.org/relation>/<http://example.org/teaches>)+ ?skill }"
        result (exec/execute-query feature-dataset sparql)]
    (is (= [{:skill (iri "http://example.org/skill/hack")}]
           (:rows result)))))

(deftest execute-query-graph-pattern
  (let [sparql "SELECT ?balance WHERE { GRAPH <http://example.org/ledger> { ?player <http://example.org/balance> ?balance } FILTER (?player = <http://example.org/player/alex>) }"
        result (exec/execute-query feature-dataset sparql)]
    (is (= [{:balance (lit "5.5" node/xsd-decimal)}]
           (:rows result)))))

(deftest execute-query-subselect
  (let [sparql "SELECT ?nickname WHERE { { SELECT ?player WHERE { ?player <http://example.org/score> ?score } ORDER BY DESC(?score) LIMIT 1 } ?player <http://example.org/nickname> ?nickname }"
        result (exec/execute-query feature-dataset sparql)]
    (is (= [{:nickname (lit "Bee" node/rdf-lang-string "en")}]
           (:rows result)))))

(deftest execute-query-construct
  (let [sparql "PREFIX punk: <https://wikipunk.net/>\nCONSTRUCT { ?agent punk:remaining ?remaining }\nWHERE {\n  ?intent a punk:SpecialAction ;\n          punk:uses ?agent ;\n          punk:has-roll ?minutes .\n  ?agent punk:has-difficulty ?available .\n  BIND((?available - ?minutes) AS ?remaining)\n}"
        result (exec/execute-query sample-dataset sparql)]
    (is (= :construct (:type result)))
    (is (= #{{:graph :default
              :s [:iri "https://wikipunk.net/resource/9"]
              :p [:iri "https://wikipunk.net/remaining"]
              :o [:literal {:lex "10"
                            :dt "http://www.w3.org/2001/XMLSchema#integer"
                            :value 10}]}}
           (set (:triples result))))))

(deftest execute-query-from-map
  (let [query-map (sparql/parse-string "ASK { ?s ?p ?o }")
        result (exec/execute-query {:triples #{}} query-map)]
    (is (= :ask (:type result)))
    (is (false? (:boolean result)))))

(deftest execute-update-from-map
  (let [update-map (sparql/parse-string "INSERT DATA { <https://example.org/a> <https://example.org/b> <https://example.org/c> }")
        {:keys [dataset]} (exec/execute-update {:triples #{}} update-map)]
    (is (= 1 (count (:triples dataset))))))

(deftest execute-update-copy-default-to-named
  (let [initial {:triples #{{:graph :default
                             :s [:iri "http://example.org/a"]
                             :p [:iri "http://example.org/p"]
                             :o [:literal {:lex "1" :dt "http://www.w3.org/2001/XMLSchema#integer"}]}}}
        {:keys [dataset]} (exec/execute-update initial "COPY DEFAULT TO GRAPH <http://example.org/copy>")]
    (is (contains? (:triples dataset)
                   {:graph [:iri "http://example.org/copy"]
                    :s [:iri "http://example.org/a"]
                    :p [:iri "http://example.org/p"]
                    :o [:literal {:lex "1"
                                   :dt "http://www.w3.org/2001/XMLSchema#integer"
                                   :value 1}]}))))

(deftest execute-update-delete-data
  (let [dataset {:triples #{{:graph :default
                             :s [:iri "http://example.org/a"]
                             :p [:iri "http://example.org/p"]
                             :o [:iri "http://example.org/o"]}
                            {:graph :default
                             :s [:iri "http://example.org/b"]
                             :p [:iri "http://example.org/p"]
                             :o [:iri "http://example.org/o"]}}}
        {:keys [dataset]} (exec/execute-update dataset "DELETE DATA { <http://example.org/a> <http://example.org/p> <http://example.org/o> }")]
    (is (not (contains? (:triples dataset)
                        {:graph :default
                         :s [:iri "http://example.org/a"]
                         :p [:iri "http://example.org/p"]
                         :o [:iri "http://example.org/o"]})))
    (is (contains? (:triples dataset)
                   {:graph :default
                    :s [:iri "http://example.org/b"]
                    :p [:iri "http://example.org/p"]
                    :o [:iri "http://example.org/o"]}))))

(deftest execute-update-add-graph
  (let [dataset {:triples #{{:graph [:iri "http://example.org/source"]
                             :s [:iri "http://example.org/s"]
                             :p [:iri "http://example.org/p"]
                             :o [:literal {:lex "2" :dt "http://www.w3.org/2001/XMLSchema#integer"}]}
                            {:graph [:iri "http://example.org/target"]
                             :s [:iri "http://example.org/t"]
                             :p [:iri "http://example.org/p"]
                             :o [:literal {:lex "3" :dt "http://www.w3.org/2001/XMLSchema#integer"}]}}}
        {:keys [dataset]} (exec/execute-update dataset "ADD GRAPH <http://example.org/source> TO GRAPH <http://example.org/target>")
        target-triples (filter #(= [:iri "http://example.org/target"] (:graph %)) (:triples dataset))]
    (is (= 2 (count target-triples)))
    (is (some #(= [:iri "http://example.org/s"] (:s %)) target-triples))))

(deftest execute-update-move-to-default
  (let [dataset {:triples #{{:graph [:iri "http://example.org/source"]
                             :s [:iri "http://example.org/s"]
                             :p [:iri "http://example.org/p"]
                             :o [:literal {:lex "2" :dt "http://www.w3.org/2001/XMLSchema#integer"}]}}}
        {:keys [dataset]} (exec/execute-update dataset "MOVE GRAPH <http://example.org/source> TO DEFAULT")]
    (is (some #(and (= :default (:graph %))
                    (= [:iri "http://example.org/s"] (:s %)))
              (:triples dataset)))
    (is (not-any? #(= [:iri "http://example.org/source"] (:graph %)) (:triples dataset)))))

(deftest execute-update-delete-where
  (let [dataset {:triples #{{:graph [:iri "http://example.org/source"]
                             :s [:iri "http://example.org/s"]
                             :p [:iri "http://example.org/p"]
                             :o [:literal {:lex "2" :dt "http://www.w3.org/2001/XMLSchema#integer"}]}
                            {:graph [:iri "http://example.org/source"]
                             :s [:iri "http://example.org/t"]
                             :p [:iri "http://example.org/p"]
                             :o [:literal {:lex "3" :dt "http://www.w3.org/2001/XMLSchema#integer"}]}
                            {:graph :default
                             :s [:iri "http://example.org/other"]
                             :p [:iri "http://example.org/p"]
                             :o [:literal {:lex "9" :dt "http://www.w3.org/2001/XMLSchema#integer"}]}}}
        {:keys [dataset]} (exec/execute-update dataset "DELETE WHERE { GRAPH <http://example.org/source> { ?s ?p ?o } }")]
    (is (not-any? #(= [:iri "http://example.org/source"] (:graph %)) (:triples dataset)))
    (is (contains? (:triples dataset)
                   {:graph :default
                    :s [:iri "http://example.org/other"]
                    :p [:iri "http://example.org/p"]
                    :o [:literal {:lex "9"
                                   :dt "http://www.w3.org/2001/XMLSchema#integer"
                                   :value 9}]}))))

(deftest execute-update-clear-graph
  (let [dataset {:triples #{{:graph "http://example.org/target"
                             :s [:iri "http://example.org/t"]
                             :p [:iri "http://example.org/p"]
                             :o [:literal {:lex "3" :dt "http://www.w3.org/2001/XMLSchema#integer"}]}
                            {:graph :default
                             :s [:iri "http://example.org/a"]
                             :p [:iri "http://example.org/p"]
                             :o [:literal {:lex "1" :dt "http://www.w3.org/2001/XMLSchema#integer"}]}}}
        {:keys [dataset]} (exec/execute-update dataset "CLEAR GRAPH <http://example.org/target>")]
    (is (not-any? #(= "http://example.org/target" (:graph %)) (:triples dataset)))
    (is (some #(= :default (:graph %)) (:triples dataset)))))

(deftest execute-update-drop-all
  (let [dataset {:triples #{{:graph :default
                             :s [:iri "http://example.org/a"]
                             :p [:iri "http://example.org/p"]
                             :o [:literal {:lex "1" :dt "http://www.w3.org/2001/XMLSchema#integer"}]}
                            {:graph "http://example.org/source"
                             :s [:iri "http://example.org/s"]
                             :p [:iri "http://example.org/p"]
                             :o [:literal {:lex "2" :dt "http://www.w3.org/2001/XMLSchema#integer"}]}}}
        {:keys [dataset]} (exec/execute-update dataset "DROP ALL")]
    (is (empty? (:triples dataset)))))
