(ns net.wikipunk.ontology.sparql-test
  (:require
   [clojure.test :refer [deftest is testing]]
   [clojure.string :as str]
   [clojure.walk :as walk]
   [net.wikipunk.ontology.sparql :as sparql])
  (:import
   (org.apache.jena.query QueryFactory)
   (org.apache.jena.sparql.algebra Algebra)
   (org.apache.jena.update UpdateFactory)))

(deftest op->edn-basic
  (let [query  "ASK { ?s ?p ?o }"
        q      (QueryFactory/create query)
        actual (sparql/op->edn (Algebra/compile q))]
    (is (= [:bgp
            [:triple
             [:var "s"]
             [:var "p"]
             [:var "o"]]]
           actual))))

(defn strip-literal-values [form]
  (walk/postwalk
   (fn [x]
     (if (and (vector? x)
              (= :literal (first x))
              (map? (second x)))
       [:literal (dissoc (second x) :value)]
       x))
   form))

(deftest update-op->edn-modify
  (let [update "DELETE { ?s ?p ?o } INSERT { ?s ?p ?o } WHERE { ?s ?p ?o }"
        req    (UpdateFactory/create update)
        op     (.get (.getOperations req) 0)
        actual (sparql/update-op->edn op)]
    (is (= {:type :modify
            :delete [{:graph :default
                      :triple [:triple
                               [:var "s"]
                               [:var "p"]
                               [:var "o"]]}]
            :insert [{:graph :default
                      :triple [:triple
                               [:var "s"]
                               [:var "p"]
                               [:var "o"]]}]
            :where [:bgp
                    [:triple
                     [:var "s"]
                     [:var "p"]
                     [:var "o"]]]}
           (strip-literal-values actual)))))

(deftest parse-string-query
  (let [sparql "ASK { ?s ?p ?o }"
        result (sparql/parse-string sparql)]
    (is (= :query (:type result)))
    (is (= :ask (:form result)))
    (is (= [:bgp [:triple [:var "s"] [:var "p"] [:var "o"]]]
           (strip-literal-values (:algebra result))))))

(deftest parse-string-update
  (let [sparql "DELETE { ?s ?p ?o } WHERE { ?s ?p ?o }"
        result (sparql/parse-string sparql)
        ops (:algebra result)
        op (first ops)]
    (is (= :update (:type result)))
    (is (= :modify (:type op)))
    (is (= [:bgp [:triple [:var "s"] [:var "p"] [:var "o"]]]
           (strip-literal-values (:where op))))))

(deftest parse-string-multi-update
  (let [sparql "CREATE GRAPH <g> ;\nLOAD <remote> INTO GRAPH <g> ;"
        result (sparql/parse-string sparql)
        [create load] (:algebra result)]
    (is (= 2 (count (:algebra result))))
    (is (= :create (:type create)))
    (is (= :load (:type load)))
    (is (= [:iri "g"] (:graph create)))
    (is (= [:iri "g"] (:graph load)))
    (is (= "remote" (:source load)))))

(deftest parse-string-with-update
  (let [sparql "PREFIX : <http://example/>\nWITH :g\nINSERT { <base:s> ?p ?o } WHERE { ?s ?p ?o }"
        result (sparql/parse-string sparql)
        [op] (:algebra result)]
    (is (= :update (:type result)))
    (is (= :modify (:type op)))
    (is (= [:iri "http://example/g"] (:with op)))
    (is (= [:iri "base:s"] (-> op :insert first :triple second)))))

(deftest parse-string-using-update
  (let [sparql "BASE <base:>\nPREFIX : <http://example/>\nWITH :g\nDELETE { <s> ?p ?o }\nINSERT { ?s ?p <#o> }\nUSING <base:g1>\nUSING <base:g2>\nUSING NAMED :gn1\nUSING NAMED :gn2\nWHERE { ?s ?p ?o }"
        result (sparql/parse-string sparql)
        [op] (:algebra result)]
    (is (= :modify (:type op)))
    (is (= [:iri "http://example/g"] (:with op)))
    (is (= [[:iri "base:g1"] [:iri "base:g2"]]
           (:using op)))
    (is (= [[:iri "http://example/gn1"] [:iri "http://example/gn2"]]
           (:using-named op)))))

(deftest parse-string-property-path
  (let [sparql "PREFIX : <http://example/>\nSELECT * WHERE { ?s :p/:q ?o }"
        result (sparql/parse-string sparql)]
    (is (= [:path
            [:var "s"]
            [:seq
             [:iri "http://example/p"]
             [:iri "http://example/q"]]
            [:var "o"]]
           (strip-literal-values (:algebra result))))))

(deftest parse-string-property-path-quantified
  (let [sparql "PREFIX : <http://example/>\nSELECT ?s WHERE { ?s (:p/:q)* ?o }"
        result (sparql/parse-string sparql)]
    (is (= [:project
            [[:var "s"]]
            [:path
             [:var "s"]
             [:path*
              [:seq
               [:iri "http://example/p"]
               [:iri "http://example/q"]]]
             [:var "o"]]]
           (strip-literal-values (:algebra result))))))

(deftest parse-string-aggregate-order-limit
  (let [sparql "SELECT ?s (SUM(?o) AS ?total) WHERE { ?s <http://example.org/p> ?o } GROUP BY ?s HAVING (?total > 10) ORDER BY DESC(?total) LIMIT 5"
        result (sparql/parse-string sparql)]
    (is (= [:slice
            :_
            [:literal
             {:lex "5"
              :dt "http://www.w3.org/2001/XMLSchema#integer"}]
            [:project
             [[:var "s"] [:var "total"]]
             [:order
              [[:desc [:var "total"]]]
              [:filter
               [:>
                [:var "total"]
                [:literal
                 {:lex "10"
                  :dt "http://www.w3.org/2001/XMLSchema#integer"}]]
               [:extend
                [[[:var "total"] [:var ".0"]]]
                [:group
                 [[:var "s"]]
                 [[[:var ".0"] [:sum [:var "o"]]]]
                 [:bgp
                  [:triple
                   [:var "s"]
                   [:iri "http://example.org/p"]
                   [:var "o"]]]]]]]]]
           (strip-literal-values (:algebra result))))))

(deftest parse-string-service-and-graph
  (let [sparql "SELECT * WHERE { GRAPH <http://example.org/g> { ?s ?p ?o } SERVICE <http://example.org/service> { ?s ?p ?o } }"
        result (sparql/parse-string sparql)]
    (is (= [:join
            [:graph
             [:iri "http://example.org/g"]
             [:bgp
              [:triple [:var "s"] [:var "p"] [:var "o"]]]]
            [:service
             [:iri "http://example.org/service"]
             [:bgp
              [:triple [:var "s"] [:var "p"] [:var "o"]]]]]
           (strip-literal-values (:algebra result))))))

(deftest parse-string-subselect-optional
  (let [sparql "SELECT ?s WHERE { { SELECT ?s WHERE { ?s ?p ?o } LIMIT 1 } OPTIONAL { ?s ?p2 ?o2 } }"
        result (sparql/parse-string sparql)]
    (is (= [:project
            [[:var "s"]]
            [:leftjoin
             [:slice
              :_
              [:literal
               {:lex "1"
                :dt "http://www.w3.org/2001/XMLSchema#integer"}]
              [:project
               [[:var "s"]]
               [:bgp
                [:triple
                 [:var "s"]
                 [:var "p"]
                 [:var "o"]]]]]
             [:bgp
             [:triple
              [:var "s"]
              [:var "p2"]
              [:var "o2"]]]]]
           (strip-literal-values (:algebra result))))))

(deftest parse-string-distinct-union-values
  (let [sparql "PREFIX : <http://example/>\nSELECT DISTINCT ?s WHERE { { ?s :p ?o } UNION { ?s :q ?o2 } VALUES ?s { :a :b } }"
        result (sparql/parse-string sparql)]
    (is (= [:distinct
            [:project
             [[:var "s"]]
             [:join
              [:union
               [:bgp
                [:triple
                 [:var "s"]
                 [:iri "http://example/p"]
                 [:var "o"]]]
               [:bgp
                [:triple
                 [:var "s"]
                 [:iri "http://example/q"]
                 [:var "o2"]]]]
              [:table
               [:vars [:var "s"]]
               [:row [[:var "s"] [:iri "http://example/a"]]]
               [:row [[:var "s"] [:iri "http://example/b"]]]]]]]
           (strip-literal-values (:algebra result))))))

(deftest parse-string-minus
  (let [sparql "SELECT ?s WHERE { ?s <http://example/p> ?o MINUS { ?s <http://example/p> ?other } }"
        result (sparql/parse-string sparql)]
    (is (= [:project
            [[:var "s"]]
            [:minus
             [:bgp
              [:triple
               [:var "s"]
               [:iri "http://example/p"]
               [:var "o"]]]
             [:bgp
              [:triple
               [:var "s"]
               [:iri "http://example/p"]
               [:var "other"]]]]]
           (strip-literal-values (:algebra result))))))

(deftest parse-string-limit-offset
  (let [sparql "SELECT ?s WHERE { ?s ?p ?o } LIMIT 5 OFFSET 2"
        result (sparql/parse-string sparql)]
    (is (= [:slice
            [:literal
             {:lex "2"
              :dt "http://www.w3.org/2001/XMLSchema#integer"}]
            [:literal
             {:lex "5"
              :dt "http://www.w3.org/2001/XMLSchema#integer"}]
            [:project
             [[:var "s"]]
             [:bgp
              [:triple
               [:var "s"]
               [:var "p"]
               [:var "o"]]]]]
           (strip-literal-values (:algebra result))))))

(deftest parse-update-core-operations
  (let [copy (-> (sparql/parse-string "COPY SILENT DEFAULT TO GRAPH <http://example.org/g>")
                 :algebra first)
        add (-> (sparql/parse-string "ADD SILENT GRAPH <http://example.org/src> TO GRAPH <http://example.org/dest>")
                :algebra first)
        move (-> (sparql/parse-string "MOVE GRAPH <http://example.org/src> TO DEFAULT")
                 :algebra first)
        clear (-> (sparql/parse-string "CLEAR SILENT GRAPH <http://example.org/g>")
                  :algebra first)
        drop (-> (sparql/parse-string "DROP ALL")
                 :algebra first)]
    (is (= {:type :copy
            :silent true
            :src {:type :default}
            :dest {:type :named
                   :graph [:iri "http://example.org/g"]}}
           copy))
    (is (= {:type :add
            :silent true
            :src {:type :named
                  :graph [:iri "http://example.org/src"]}
            :dest {:type :named
                   :graph [:iri "http://example.org/dest"]}}
           add))
    (is (= {:type :move
            :silent false
            :src {:type :named
                  :graph [:iri "http://example.org/src"]}
            :dest {:type :default}}
           move))
    (is (= {:type :clear
            :silent true
            :target {:type :named
                     :graph [:iri "http://example.org/g"]}}
           clear))
    (is (= {:type :drop
            :silent false
            :target {:type :all}}
           drop))))

(deftest parse-update-delete-data
  (let [result (sparql/parse-string "DELETE DATA { GRAPH <http://example.org/g> { <s> <p> 'o' } }")
        op (-> result :algebra first)]
    (is (= :data-delete (:type op)))
    (is (= [{:graph [:iri "http://example.org/g"]
             :triple
             [:triple
              [:iri "s"]
              [:iri "p"]
              [:literal
               {:lex "o"
                :dt "http://www.w3.org/2001/XMLSchema#string"}]]}]
           (strip-literal-values (:quads op))))))

(deftest parse-update-delete-where
  (let [result (sparql/parse-string "DELETE WHERE { GRAPH <http://example.org/g> { ?s ?p ?o } }")
        op (-> result :algebra first)]
    (is (= :delete-where (:type op)))
    (is (= [{:graph [:iri "http://example.org/g"]
             :triple
             [:triple
              [:var "s"]
              [:var "p"]
              [:var "o"]]}]
           (:delete op)))))

(deftest parse-update-load-silent
  (let [result (sparql/parse-string "LOAD SILENT <http://example.org/src> INTO GRAPH <http://example.org/dest>")
        op (-> result :algebra first)]
    (is (= {:type :load
            :silent true
            :source "http://example.org/src"
            :graph [:iri "http://example.org/dest"]}
           op))))

(deftest parse-update-clear-drop-variants
  (let [clear (-> (sparql/parse-string "CLEAR DEFAULT") :algebra first)
        drop-named (-> (sparql/parse-string "DROP NAMED") :algebra first)]
    (is (= {:type :clear
            :silent false
            :target {:type :default}}
           clear))
    (is (= {:type :drop
            :silent false
            :target {:type :all-named}}
           drop-named))))
