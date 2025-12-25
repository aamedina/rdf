(ns net.wikipunk.ontology.compiler-test
  (:require
   [clojure.test :refer [deftest is testing]]
   [net.wikipunk.ontology.compiler :as compiler]
   [net.wikipunk.ontology.node :as node]
   [net.wikipunk.ontology.sparql :as sparql]
   [net.wikipunk.ontology.sparql.exec :as sparql-exec]))

(def rdf:type "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")

(defn triples
  "Utility to build a dataset map from triples (s p o)."
  [& t]
  (node/canonical-dataset
   {:triples (set (for [[s p o] t]
                    {:graph :default :s s :p p :o o}))}))

(def player-dataset-exec
  {:triples
   #{
     {:graph :default
      :s [:iri "http://example.org/player/alex"]
      :p [:iri "http://example.org/score"]
      :o (node/literal-node "7" node/xsd-integer nil)}
     {:graph :default
      :s [:iri "http://example.org/player/alex"]
      :p [:iri "http://example.org/relation"]
      :o [:iri "http://example.org/player/mentor"]}
     {:graph :default
      :s [:iri "http://example.org/player/alex"]
      :p [:iri "http://example.org/nickname"]
      :o (node/literal-node "Al" nil "en")}
     {:graph :default
      :s [:iri "http://example.org/player/bela"]
      :p [:iri "http://example.org/score"]
      :o (node/literal-node "11" node/xsd-integer nil)}
     {:graph :default
      :s [:iri "http://example.org/player/bela"]
      :p [:iri "http://example.org/relation"]
      :o [:iri "http://example.org/player/mentor"]}
     {:graph :default
      :s [:iri "http://example.org/player/bela"]
      :p [:iri "http://example.org/nickname"]
      :o (node/literal-node "Bee" nil "en")}
     {:graph :default
      :s [:iri "http://example.org/player/mentor"]
      :p [:iri "http://example.org/teaches"]
      :o [:iri "http://example.org/skill/hack"]}
     {:graph "http://example.org/ledger"
      :s [:iri "http://example.org/player/alex"]
      :p [:iri "http://example.org/balance"]
      :o (node/literal-node "5.5" node/xsd-decimal nil)}
     {:graph "http://example.org/ledger"
     :s [:iri "http://example.org/player/bela"]
     :p [:iri "http://example.org/balance"]
      :o (node/literal-node "7.0" node/xsd-decimal nil)}}})

(def player-dataset
  (node/canonical-dataset player-dataset-exec))

(def parity-queries
  [{:label "optional-bind"
    :query "SELECT ?player ?nick WHERE { ?player <http://example.org/score> ?score . OPTIONAL { ?player <http://example.org/nickname> ?nick } } ORDER BY ?player"}
   {:label "minus-filter"
    :query "SELECT ?player WHERE { ?player <http://example.org/score> ?score MINUS { ?player <http://example.org/nickname> ?nick FILTER(?nick = \"Bee\"@en) } } ORDER BY ?player"}
   {:label "values-union"
    :query "SELECT DISTINCT ?player WHERE { VALUES ?player { <http://example.org/player/alex> <http://example.org/player/bela> <http://example.org/player/unknown> } { ?player <http://example.org/score> ?score } UNION { ?player <http://example.org/nickname> ?nick } } ORDER BY ?player"}
   {:label "graph-filter"
    :query "SELECT ?balance WHERE { GRAPH <http://example.org/ledger> { ?player <http://example.org/balance> ?balance } FILTER (?player = <http://example.org/player/alex>) }"}
   {:label "path-sequence"
    :query "SELECT ?skill WHERE { <http://example.org/player/bela> <http://example.org/relation>/<http://example.org/teaches> ?skill }"}
   {:label "path-plus"
    :query "SELECT ?skill WHERE { <http://example.org/player/alex> (<http://example.org/relation>/<http://example.org/teaches>)+ ?skill }"}
   {:label "path-reverse"
    :query "SELECT ?mentor WHERE { <http://example.org/skill/hack> ^<http://example.org/teaches> ?mentor }"}
   {:label "aggregate-sum"
    :query "SELECT ?player (SUM(?score) AS ?total) WHERE { ?player <http://example.org/score> ?score } GROUP BY ?player ORDER BY ?player"}
   {:label "aggregate-avg"
    :query "SELECT (AVG(?score) AS ?avg) WHERE { ?player <http://example.org/score> ?score }"}
   {:label "aggregate-min"
    :query "SELECT (MIN(?nick) AS ?minNick) WHERE { ?player <http://example.org/nickname> ?nick }"}
   {:label "aggregate-max"
    :query "SELECT (MAX(?nick) AS ?maxNick) WHERE { ?player <http://example.org/nickname> ?nick }"}
   {:label "aggregate-groupconcat"
    :query "SELECT (GROUP_CONCAT(DISTINCT ?nick; SEPARATOR=\",\") AS ?names) WHERE { ?player <http://example.org/nickname> ?nick }"}
   {:label "aggregate-sample"
    :query "SELECT (SAMPLE(?nick) AS ?any) WHERE { ?player <http://example.org/nickname> ?nick }"}
   {:label "count-star"
    :query "SELECT (COUNT(*) AS ?c) WHERE { ?player <http://example.org/score> ?score }"}
   {:label "subselect-limit"
    :query "SELECT ?nickname WHERE { { SELECT ?player WHERE { ?player <http://example.org/score> ?score } ORDER BY DESC(?score) LIMIT 1 } ?player <http://example.org/nickname> ?nickname }"}])

(deftest compile-filter-or
  (let [query {:type :query
               :form :ask
               :algebra
               [:filter
                [:||
                 [:>= [:var "x"] [:literal {:lex "10" :dt "http://www.w3.org/2001/XMLSchema#integer"}]]
                 [:>= [:var "y"] [:literal {:lex "10" :dt "http://www.w3.org/2001/XMLSchema#integer"}]]]
                [:bgp
                 [:triple [:var "intent"] [:iri "https://example.org/x"] [:var "x"]]
                 [:triple [:var "intent"] [:iri "https://example.org/y"] [:var "y"]]]]}
        compiled (compiler/compile-query query)
        pass-dataset (triples
                      ["i1" "https://example.org/x" 4]
                      ["i1" "https://example.org/y" 15])
        fail-dataset (triples
                      ["i2" "https://example.org/x" 3]
                      ["i2" "https://example.org/y" 5])]
    (is (true? ((:execute compiled) pass-dataset)))
    (is (false? ((:execute compiled) fail-dataset)))))

(deftest compile-delete-where
  (let [update {:type :update
                :algebra
                [{:type :delete-where
                  :delete [{:graph :default
                            :triple [:triple [:var "s"] [:iri "https://example.org/tag"] [:var "o"]]}]}]}
        compiled (compiler/compile-update update)
        dataset (triples ["s1" "https://example.org/tag" "alpha"]
                         ["s2" "https://example.org/tag" "beta"]
                         ["s3" "https://example.org/other" "gamma"])
        result ((:execute compiled) dataset)]
    (is (= #{(node/canonical-triple {:graph :default
                                     :s "s3"
                                     :p "https://example.org/other"
                                     :o "gamma"})}
           (:triples result)))))

(deftest compile-query-distinct-matches-exec
  (let [sparql "SELECT DISTINCT ?player WHERE { VALUES ?player { <http://example.org/player/alex> <http://example.org/player/bela> <http://example.org/player/unknown> } { ?player <http://example.org/score> ?score } UNION { ?player <http://example.org/nickname> ?nick } } ORDER BY ?player"
        compiled (sparql/compile-query-string sparql)
        compiled-rows ((:execute compiled) player-dataset)
        exec-rows (:rows (sparql-exec/execute-query player-dataset-exec sparql))]
    (is (= exec-rows compiled-rows))))

(deftest supported-query-parity
  (doseq [{:keys [label query]} parity-queries]
    (testing label
      (let [compiled (sparql/compile-query-string query)
            compiled-rows ((:execute compiled) player-dataset)
            exec-rows (:rows (sparql-exec/execute-query player-dataset-exec query))]
        (is (= exec-rows compiled-rows))))))

(deftest aggregate-value-sanity
  (let [sum-query "SELECT ?player (SUM(?score) AS ?total) WHERE { ?player <http://example.org/score> ?score } GROUP BY ?player ORDER BY ?player"
        sum-rows ((:execute (sparql/compile-query-string sum-query)) player-dataset)
        expected-sum [{:player (node/iri-node "http://example.org/player/alex")
                       :total (node/literal-node "7" node/xsd-integer nil)}
                      {:player (node/iri-node "http://example.org/player/bela")
                       :total (node/literal-node "11" node/xsd-integer nil)}]]
    (is (= expected-sum sum-rows)))
  (let [avg-query "SELECT (AVG(?score) AS ?avg) WHERE { ?player <http://example.org/score> ?score }"
        avg-row (first ((:execute (sparql/compile-query-string avg-query)) player-dataset))]
    (is (= (node/literal-node "9.0" node/xsd-decimal nil) (:avg avg-row))))
  (let [minmax-query "SELECT (MIN(?nick) AS ?minNick) (MAX(?nick) AS ?maxNick) WHERE { ?player <http://example.org/nickname> ?nick }"
        row (first ((:execute (sparql/compile-query-string minmax-query)) player-dataset))]
    (is (= (node/literal-node "Al" nil "en") (:minNick row)))
    (is (= (node/literal-node "Bee" nil "en") (:maxNick row))))
  (let [concat-query "SELECT (GROUP_CONCAT(DISTINCT ?nick; SEPARATOR=\",\") AS ?names) WHERE { ?player <http://example.org/nickname> ?nick }"
        row (first ((:execute (sparql/compile-query-string concat-query)) player-dataset))]
    (is (= (node/literal-node "Bee,Al" node/rdf-string nil) (:names row))))
  (let [sample-query "SELECT (SAMPLE(?nick) AS ?any) WHERE { ?player <http://example.org/nickname> ?nick }"
        row (first ((:execute (sparql/compile-query-string sample-query)) player-dataset))]
    (is (= (node/literal-node "Bee" nil "en") (:any row)))))

(deftest data-insert-maintains-index
  (let [update {:type :update
                :algebra
                [{:type :data-insert
                  :quads [{:graph :default
                           :triple [:triple
                                    [:iri "http://example.org/item/1"]
                                    [:iri "http://example.org/hasValue"]
                                    [:literal {:lex "42" :dt "http://www.w3.org/2001/XMLSchema#integer"}]]}]}]}
        compiled (compiler/compile-update update)
        result ((:execute compiled) {:triples #{}})
        triple (node/canonical-triple {:graph :default
                                       :s "http://example.org/item/1"
                                       :p "http://example.org/hasValue"
                                       :o 42})
        index (::compiler/index result)]
    (is (contains? result ::compiler/index))
    (let [indexed-triple (first (:triples result))]
      (is (= #{indexed-triple} (get-in index [:by-sub (:s indexed-triple)])))
      (is (= #{indexed-triple} (get-in index [:by-pred (:p indexed-triple)])))
      (is (= #{indexed-triple} (get-in index [:by-sp [(:s indexed-triple) (:p indexed-triple)]])))
      (is (= #{indexed-triple} (get-in index [:by-graph :default]))))))

(deftest data-delete-clears-index
  (let [triple (node/canonical-triple {:graph :default
                                       :s "http://example.org/item/2"
                                       :p "http://example.org/hasValue"
                                       :o 7})
        insert {:type :update
                :algebra
                [{:type :data-insert
                  :quads [{:graph :default
                           :triple [:triple
                                    [:iri "http://example.org/item/2"]
                                    [:iri "http://example.org/hasValue"]
                                    [:literal {:lex "7" :dt "http://www.w3.org/2001/XMLSchema#integer"}]]}]}]}
        delete {:type :update
                :algebra
                [{:type :data-delete
                  :quads [{:graph :default
                           :triple [:triple
                                    [:iri "http://example.org/item/2"]
                                    [:iri "http://example.org/hasValue"]
                                    [:literal {:lex "7" :dt "http://www.w3.org/2001/XMLSchema#integer"}]]}]}]}
        insert-exec (compiler/compile-update insert)
        delete-exec (compiler/compile-update delete)
        with-triple ((:execute insert-exec) {:triples #{}})
        result ((:execute delete-exec) with-triple)
        index (::compiler/index result)]
    (is (not (contains? (:triples result) triple)))
    (is (nil? (get-in index [:by-sub (:s triple)])))
    (is (nil? (get-in index [:by-pred (:p triple)])))
    (is (nil? (get-in index [:by-sp [(:s triple) (:p triple)]])))
    (is (nil? (get-in index [:by-graph :default])))))

(deftest graph-filter-algebra-matches-exec
  (let [sparql "SELECT ?player ?balance WHERE { GRAPH <http://example.org/ledger> { ?player <http://example.org/balance> ?balance } } ORDER BY ?player"
        compiled (sparql/compile-query-string sparql)
        compiled-rows ((:execute compiled) player-dataset)
        exec-rows (:rows (sparql-exec/execute-query player-dataset-exec sparql))]
    (is (= exec-rows compiled-rows))))

(deftest modify-update-parity
  (let [sparql "DELETE { GRAPH <http://example.org/ledger> { ?player <http://example.org/balance> ?balance } } INSERT { GRAPH <http://example.org/ledger> { ?player <http://example.org/balance> ?newBalance } } WHERE { GRAPH <http://example.org/ledger> { ?player <http://example.org/balance> ?balance } BIND(?balance + 1 AS ?newBalance) }"
        compiled (sparql/compile-update-string sparql)
        dataset player-dataset
        compiled-result ((:execute compiled) dataset)
        exec-result (:dataset (sparql-exec/execute-update player-dataset-exec sparql))
        compiled-triples (:triples (node/canonical-dataset compiled-result))
        exec-triples (:triples (node/canonical-dataset exec-result))]
    (is (= exec-triples compiled-triples))))

(deftest delete-where-parity
  (let [sparql "DELETE WHERE { ?player <http://example.org/nickname> ?nick }"
        compiled (sparql/compile-update-string sparql)
        compiled-result ((:execute compiled) player-dataset)
        exec-result (:dataset (sparql-exec/execute-update player-dataset-exec sparql))
        compiled-triples (:triples (node/canonical-dataset compiled-result))
        exec-triples (:triples (node/canonical-dataset exec-result))]
    (is (= exec-triples compiled-triples))))

(deftest compile-query-limit-offset
  (let [sparql "SELECT ?player WHERE { ?player <http://example.org/score> ?score } ORDER BY DESC(?score) LIMIT 1 OFFSET 1"
        compiled (sparql/compile-query-string sparql)
        compiled-rows ((:execute compiled) player-dataset)
        exec-rows (:rows (sparql-exec/execute-query player-dataset-exec sparql))]
    (is (= exec-rows compiled-rows))))

(deftest compile-query-graph
  (let [sparql "SELECT ?balance WHERE { GRAPH <http://example.org/ledger> { ?player <http://example.org/balance> ?balance } FILTER (?player = <http://example.org/player/alex>) }"
        compiled (sparql/compile-query-string sparql)
        compiled-rows ((:execute compiled) player-dataset)
        exec-rows (:rows (sparql-exec/execute-query player-dataset-exec sparql))]
    (is (= exec-rows compiled-rows))))

(deftest compile-update-delete-data-matches-exec
  (let [sparql "DELETE DATA { <http://example.org/a> <http://example.org/p> <http://example.org/o> }"
        compiled (sparql/compile-update-string sparql)
        dataset {:triples #{{:graph :default
                             :s "http://example.org/a"
                             :p "http://example.org/p"
                             :o "http://example.org/o"}
                            {:graph :default
                             :s "http://example.org/b"
                             :p "http://example.org/p"
                             :o "http://example.org/o"}}}
        dataset-exec {:triples #{{:graph :default
                                  :s [:iri "http://example.org/a"]
                                  :p [:iri "http://example.org/p"]
                                  :o [:iri "http://example.org/o"]}
                                 {:graph :default
                                  :s [:iri "http://example.org/b"]
                                  :p [:iri "http://example.org/p"]
                                  :o [:iri "http://example.org/o"]}}}
        compiled-result ((:execute compiled) dataset)
        exec-result (:dataset (sparql-exec/execute-update dataset-exec sparql))]
    (is (= (:triples (node/canonical-dataset exec-result))
           (:triples compiled-result)))))

(deftest compile-update-delete-where-matches-exec
  (let [sparql "DELETE WHERE { GRAPH <http://example.org/ledger> { ?s ?p ?o } }"
        compiled (sparql/compile-update-string sparql)
        dataset {:triples #{{:graph "http://example.org/ledger"
                             :s "http://example.org/a"
                             :p "http://example.org/p"
                             :o 1}
                            {:graph :default
                             :s "http://example.org/z"
                             :p "http://example.org/p"
                             :o 9}}}
        dataset-exec {:triples #{{:graph "http://example.org/ledger"
                                  :s [:iri "http://example.org/a"]
                                  :p [:iri "http://example.org/p"]
                                  :o [:literal {:lex "1" :dt "http://www.w3.org/2001/XMLSchema#integer"}]}
                                 {:graph :default
                                  :s [:iri "http://example.org/z"]
                                  :p [:iri "http://example.org/p"]
                                  :o [:literal {:lex "9" :dt "http://www.w3.org/2001/XMLSchema#integer"}]}}}
        compiled-result ((:execute compiled) dataset)
        exec-result (:dataset (sparql-exec/execute-update dataset-exec sparql))]
    (is (= (:triples (node/canonical-dataset exec-result))
           (:triples compiled-result)))))
