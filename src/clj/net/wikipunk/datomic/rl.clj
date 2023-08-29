(ns net.wikipunk.datomic.rl
  "Warning: these rules are a work in progress, please do not use them.

  This is experimental tinkering with OWL RL & Datomic."
  {:rdfs/seeAlso "https://www.w3.org/TR/owl2-profiles/#Reasoning_in_OWL_2_RL_and_RDF_Graphs_using_Rules"}
  (:require
   [datomic.client.api :as d]
   [net.wikipunk.datomic.boot :as db]))

(defn rdf-list
  ([db eid]
   (rdf-list (d/pull db '[:rdf/first {:rdf/rest ...}] eid)))
  ([{:rdf/keys [first rest]}]
   (lazy-seq
     (cons (:db/id first) (when-not (or (identical? rest :rdf/nil)
                                        (nil? rest))
                            (rdf-list rest))))))

(defn property-chain
  "Return the :db/id of the property chain axiom for the given property."
  [db ?p]
  (->> (d/pull db '[:owl/propertyChainAxiom] ?p)
       :owl/propertyChainAxiom
       :db/id))

(defn process-property-chain
  "Process a property chain axiom."
  [db ?chain ?start]
  (reduce (fn [?node ?p]
            (ffirst (d/q '[:find ?end
                           :in $ ?start ?p
                           :where
                           [?start ?p ?end]]
                         db ?node ?p)))
          ?start
          (rdf-list db ?chain)))

(defn apply-property-chain-axiom
  [db ?p ?start]
  (when-some [?chain (property-chain db ?p)]
    (process-property-chain db ?chain ?start)))

(defmacro defrule
  "Expands into a named map containing :head, :if, and :then forms.

  rule                       = [ [rule-head clause+]+ ]
  rule-head                  = [rule-name rule-vars]
  rule-name                  = plain-symbol
  rule-vars                  = [variable+ | ([variable+] variable*)]"
  [rule-name rule-vars & body]
  (let [md (into {:head     (list* rule-name rule-vars)
                  :arglists (list ['db] (into ['db] rule-vars))}
                 (comp
                   (partition-by #{:if :then})
                   (partition-all 2)
                   (map (fn [[[k] forms]]
                          [k forms])))             
                 body)]
    `(do
       (defn ~rule-name
         ([db#]
          (into []
                (mapcat (fn [~rule-vars] (~rule-name db# ~@rule-vars)))
                (d/q '[:find ~@rule-vars
                       :where
                       ~@(:if md)]
                     db#)))
         ([db# ~@rule-vars]
          ~(:then md)))
       (alter-meta! #'~rule-name (fn [md#] (merge md# '~md)))
       #'~rule-name)))

;;  Table 4. The Semantics of Equality 	If 	then
;; eq-ref 	T(?s, ?p, ?o)
;; 	T(?s, owl:sameAs, ?s)
;; T(?p, owl:sameAs, ?p)
;; T(?o, owl:sameAs, ?o)
;; eq-sym 	T(?x, owl:sameAs, ?y) 	T(?y, owl:sameAs, ?x)
;; eq-trans 	T(?x, owl:sameAs, ?y)
;; T(?y, owl:sameAs, ?z) 	T(?x, owl:sameAs, ?z)
;; eq-rep-s 	T(?s, owl:sameAs, ?s')
;; T(?s, ?p, ?o)
;; 	T(?s', ?p, ?o)
;; eq-rep-p 	T(?p, owl:sameAs, ?p')
;; T(?s, ?p, ?o)
;; 	T(?s, ?p', ?o)
;; eq-rep-o 	T(?o, owl:sameAs, ?o')
;; T(?s, ?p, ?o)
;; 	T(?s, ?p, ?o')
;; eq-diff1 	T(?x, owl:sameAs, ?y)
;; T(?x, owl:differentFrom, ?y)
;; 	false
;; eq-diff2 	T(?x, rdf:type, owl:AllDifferent)
;; T(?x, owl:members, ?y)
;; LIST[?y, ?z1, ..., ?zn]
;; T(?zi, owl:sameAs, ?zj) 	false 	for each 1 ≤ i < j ≤ n
;; eq-diff3 	T(?x, rdf:type, owl:AllDifferent)
;; T(?x, owl:distinctMembers, ?y)
;; LIST[?y, ?z1, ..., ?zn]
;; T(?zi, owl:sameAs, ?zj) 	false 	for each 1 ≤ i < j ≤ n 

(defrule eq-ref [?s ?p ?o]
  :if
  [?s ?p ?o]
  :then
  [:db/add ?s :owl/sameAs ?s]
  [:db/add ?p :owl/sameAs ?p]
  [:db/add ?o :owl/sameAs ?o])

(defrule eq-sym [?x ?y]
  :if
  [?x :owl/sameAs ?y]
  :then
  [:db/add ?y :owl/sameAs ?x])

(defrule eq-trans [?x ?y ?z]
  :if
  [?x :owl/sameAs ?y]
  [?y :owl/sameAs ?z]
  :then
  [:db/add ?x :owl/sameAs ?z])

(defrule eq-rep-s [?s ?p ?o ?s']
  :if
  [?s :owl/sameAs ?s']
  [?s ?p ?o]
  :then
  [:db/add ?s' ?p ?o])

(defrule eq-rep-p [?s ?p ?o ?p']
  :if
  [?p :owl/sameAs ?p']
  [?s ?p ?o]
  :then
  [:db/add ?s ?p' ?o])

(defrule eq-rep-o [?s ?p ?o ?o']
  :if
  [?o :owl/sameAs ?o']
  [?s ?p ?o]
  :then
  [:db/add ?s ?p ?o'])

(defrule eq-diff1 [?x ?y]
  :if
  [?x :owl/sameAs ?y]
  [?x :owl/differentFrom ?y]
  :then
  false)

(defrule eq-diff2 [?x ?y ?z1 ?z2]
  :if
  ;; T(?x, rdf:type, owl:AllDifferent)
  ;; T(?x, owl:members, ?y)
  ;; LIST[?y, ?z1, ..., ?zn]
  ;; T(?zi, owl:sameAs, ?zj)
  [?x :rdf/type :owl/AllDifferent]
  [?x :owl/members ?y]
  [(net.wikipunk.datomic.rl/rdf-list $ ?y) [?z1 ...]]
  [(net.wikipunk.datomic.rl/rdf-list $ ?y) [?z2 ...]]
  [(!= ?z1 ?z2)]
  [?z1 :owl/sameAs ?z2]
  :then
  false)

(defrule eq-diff3 [?x ?y ?z1 ?z2]
  :if
  ;; T(?x, rdf:type, owl:AllDifferent)
  ;; T(?x, owl:distinctMembers, ?y)
  ;; LIST[?y, ?z1, ..., ?zn]
  ;; T(?zi, owl:sameAs, ?zj) 
  [?x :rdf/type :owl/AllDifferent]
  [?x :owl/distinctMembers ?y]
  [(net.wikipunk.datomic.rl/rdf-list $ ?y) [?z1 ...]]
  [(net.wikipunk.datomic.rl/rdf-list $ ?y) [?z2 ...]]
  [(!= ?z1 ?z2)]
  [?z1 :owl/sameAs ?z2]
  :then
  false)

;;  Table 5. The Semantics of Axioms about Properties 	If 	then
;; prp-ap 		T(ap, rdf:type, owl:AnnotationProperty) 	for each built-in annotation property of OWL 2 RL
;; prp-dom 	T(?p, rdfs:domain, ?c)
;; T(?x, ?p, ?y) 	T(?x, rdf:type, ?c)
;; prp-rng 	T(?p, rdfs:range, ?c)
;; T(?x, ?p, ?y) 	T(?y, rdf:type, ?c)
;; prp-fp 	T(?p, rdf:type, owl:FunctionalProperty)
;; T(?x, ?p, ?y1)
;; T(?x, ?p, ?y2) 	T(?y1, owl:sameAs, ?y2)
;; prp-ifp 	T(?p, rdf:type, owl:InverseFunctionalProperty)
;; T(?x1, ?p, ?y)
;; T(?x2, ?p, ?y) 	T(?x1, owl:sameAs, ?x2)
;; prp-irp 	T(?p, rdf:type, owl:IrreflexiveProperty)
;; T(?x, ?p, ?x) 	false
;; prp-symp 	T(?p, rdf:type, owl:SymmetricProperty)
;; T(?x, ?p, ?y) 	T(?y, ?p, ?x)
;; prp-asyp 	T(?p, rdf:type, owl:AsymmetricProperty)
;; T(?x, ?p, ?y)
;; T(?y, ?p, ?x) 	false
;; prp-trp 	T(?p, rdf:type, owl:TransitiveProperty)
;; T(?x, ?p, ?y)
;; T(?y, ?p, ?z) 	T(?x, ?p, ?z)
;; prp-spo1 	T(?p1, rdfs:subPropertyOf, ?p2)
;; T(?x, ?p1, ?y)
;; 	T(?x, ?p2, ?y)
;; prp-spo2 	T(?p, owl:propertyChainAxiom, ?x)
;; LIST[?x, ?p1, ..., ?pn]
;; T(?u1, ?p1, ?u2)
;; T(?u2, ?p2, ?u3)
;; ...
;; T(?un, ?pn, ?un+1) 	T(?u1, ?p, ?un+1)
;; prp-eqp1 	T(?p1, owl:equivalentProperty, ?p2)
;; T(?x, ?p1, ?y) 	T(?x, ?p2, ?y)
;; prp-eqp2 	T(?p1, owl:equivalentProperty, ?p2)
;; T(?x, ?p2, ?y) 	T(?x, ?p1, ?y)
;; prp-pdw 	T(?p1, owl:propertyDisjointWith, ?p2)
;; T(?x, ?p1, ?y)
;; T(?x, ?p2, ?y) 	false
;; prp-adp 	T(?x, rdf:type, owl:AllDisjointProperties)
;; T(?x, owl:members, ?y)
;; LIST[?y, ?p1, ..., ?pn]
;; T(?u, ?pi, ?v)
;; T(?u, ?pj, ?v) 	false 	for each 1 ≤ i < j ≤ n
;; prp-inv1 	T(?p1, owl:inverseOf, ?p2)
;; T(?x, ?p1, ?y) 	T(?y, ?p2, ?x)
;; prp-inv2 	T(?p1, owl:inverseOf, ?p2)
;; T(?x, ?p2, ?y) 	T(?y, ?p1, ?x)
;; prp-key 	T(?c, owl:hasKey, ?u)
;; LIST[?u, ?p1, ..., ?pn]
;; T(?x, rdf:type, ?c)
;; T(?x, ?p1, ?z1)
;; ...
;; T(?x, ?pn, ?zn)
;; T(?y, rdf:type, ?c)
;; T(?y, ?p1, ?z1)
;; ...
;; T(?y, ?pn, ?zn) 	T(?x, owl:sameAs, ?y)
;; prp-npa1 	T(?x, owl:sourceIndividual, ?i1)
;; T(?x, owl:assertionProperty, ?p)
;; T(?x, owl:targetIndividual, ?i2)
;; T(?i1, ?p, ?i2) 	false
;; prp-npa2 	T(?x, owl:sourceIndividual, ?i)
;; T(?x, owl:assertionProperty, ?p)
;; T(?x, owl:targetValue, ?lt)
;; T(?i, ?p, ?lt) 	false 

(defrule prp-dom [?p ?c ?x ?y]
  :if
  [?p :rdfs/domain ?c]
  [?x ?p ?y]
  :then
  [:db/add ?x :rdf/type ?c])

(defrule prp-rng [?p ?c ?x ?y]
  :if
  [?p :rdfs/range ?c]
  [?x ?p ?y]
  :then
  [:db/add ?y :rdf/type ?c])

(defrule prp-fp [?p ?x ?y1 ?y2]
  :if
  [?p :rdf/type :owl/FunctionalProperty]
  [?x ?p ?y1]
  [?x ?p ?y2]
  :then
  [:db/add ?y1 :owl/sameAs ?y2])

(defrule prp-ifp [?p ?y ?x1 ?x2]
  :if
  [?p :rdf/type :owl/InverseFunctionalProperty]
  [?x1 ?p ?y]
  [?x2 ?p ?y]
  :then
  [:db/add ?x1 :owl/sameAs ?x2])

(defrule prp-irp [?p ?x]
  :if
  [?p :rdf/type :owl/IrreflexiveProperty]
  [?x ?p ?x]
  :then
  false)

(defrule prp-symp [?p ?x ?y]
  :if
  [?p :rdf/type :owl/SymmetricProperty]
  [?x ?p ?y]
  :then
  [:db/add ?y ?p ?x])

(defrule prp-asyp [?p ?x ?y]
  :if
  [?p :rdf/type :owl/AsymmetricProperty]
  [?x ?p ?y]
  [?y ?p ?x]
  :then
  false)

(defrule prp-trp [?p ?x ?y ?z]
  :if
  [?p :rdf/type :owl/TransitiveProperty]
  [?x ?p ?y]
  [?y ?p ?z]
  :then
  [:db/add ?x ?p ?z])

(defrule prp-spo1 [?p1 ?p2 ?x ?y]
  :if
  [?p1 :rdfs/subPropertyOf ?p2]
  [?x ?p1 ?y]
  :then
  [:db/add ?x ?p2 ?y])

(defrule prp-spo2 [?p ?x ?u1 ?u2]
  :if
  ;; T(?p, owl:propertyChainAxiom, ?x)
  ;; LIST[?x, ?p1, ..., ?pn]
  ;; T(?u1, ?p1, ?u2)
  ;; T(?u2, ?p2, ?u3)
  ;; ...
  ;; T(?un, ?pn, ?un+1) 
  [?p :owl/propertyChainAxiom ?x]
  [(net.wikipunk.datomic.rl/rdf-list $ ?x) ?pn]
  [(net.wikipunk.datomic.rl/process-property-chain $ ?pn)]
  :then
  [:db/add ?u1 ?p ?u2])

(defrule prp-eqp1 [?p1 ?p2 ?x ?y]
  :if
  [?p1 :owl/equivalentProperty ?p2]
  [?x ?p1 ?y]
  :then
  [:db/add ?x ?p2 ?y])

(defrule prp-eqp2 [?p1 ?p2 ?x ?y]
  :if
  [?p1 :owl/equivalentProperty ?p2]
  [?x ?p2 ?y]
  :then
  [:db/add ?x ?p1 ?y])

(defrule prp-pdw [?p1 ?p2 ?x ?y]
  :if
  [?p1 :owl/propertyDisjointWith ?p2]
  [?x ?p1 ?y]
  [?x ?p2 ?y]
  :then
  false)

(defrule prp-adp [?x ?y ?u ?v]
  :if
  ;; T(?x, rdf:type, owl:AllDisjointProperties)
  ;; T(?x, owl:members, ?y)
  ;; LIST[?y, ?p1, ..., ?pn]
  ;; T(?u, ?pi, ?v)
  ;; T(?u, ?pj, ?v) 
  [?x :rdf/type :owl/AllDisjointProperties]
  [?x :owl/members ?y]
  [(net.wikipunk.datomic.rl/rdf-list $ ?y) [?p1 ...]]
  [(net.wikipunk.datomic.rl/rdf-list $ ?y) [?p2 ...]]
  [(!= ?p1 ?p2)]
  [?u ?p1 ?v]
  [?u ?p2 ?v]
  :then
  false)

(defrule prp-inv1 [?p1 ?p2 ?x ?y]
  :if
  [?p1 :owl/inverseOf ?p2]
  [?x ?p1 ?y]
  :then
  [:db/add ?y ?p2 ?x])

(defrule prp-inv2 [?p1 ?p2 ?x ?y]
  :if
  [?p1 :owl/inverseOf ?p2]
  [?x ?p2 ?y]
  :then
  [:db/add ?y ?p1 ?x])

(defrule prp-key [?c ?u ?x ?y]
  :if
  ;; T(?c, owl:hasKey, ?u)
  ;; LIST[?u, ?p1, ..., ?pn]
  ;; T(?x, rdf:type, ?c)
  ;; T(?x, ?p1, ?z1)
  ;; ...
  ;; T(?x, ?pn, ?zn)
  ;; T(?y, rdf:type, ?c)
  ;; T(?y, ?p1, ?z1)
  ;; ...
  ;; T(?y, ?pn, ?zn)
  [?c :owl/hasKey ?u]
  [(net.wikipunk.datomic.rl/rdf-list $ ?u) [?p1 ...]]
  [(net.wikipunk.datomic.rl/rdf-list $ ?u) [?p2 ...]]
  [(!= ?p1 ?p2)]
  [?x :rdf/type ?c]
  [?y :rdf/type ?c]
  [?x ?p1 ?z1]
  [?y ?p1 ?z1]
  [?x ?p2 ?z2]
  [?y ?p2 ?z2]
  :then
  [:db/add ?x :owl/sameAs ?y])

(defrule prp-npa1 [?x ?i1 ?i2 ?p]
  :if
  [?x :owl/sourceIndividual ?i1]
  [?x :owl/assertionProperty ?p]
  [?x :owl/targetIndividual ?i2]
  [?i1 ?p ?i2]
  :then
  false)

(defrule prp-npa2 [?x ?i ?p ?lt]
  :if
  [?x :owl/sourceIndividual ?i]
  [?x :owl/assertionProperty ?p]
  [?x :owl/targetValue ?lt]
  [?i ?p ?lt]
  :then
  false)

;;  Table 6. The Semantics of Classes 	If 	then
;; cls-thing 		T(owl:Thing, rdf:type, owl:Class)
;; cls-nothing1 		T(owl:Nothing, rdf:type, owl:Class)
;; cls-nothing2 	T(?x, rdf:type, owl:Nothing) 	false
;; cls-int1 	T(?c, owl:intersectionOf, ?x)
;; LIST[?x, ?c1, ..., ?cn]
;; T(?y, rdf:type, ?c1)
;; T(?y, rdf:type, ?c2)
;; ...
;; T(?y, rdf:type, ?cn) 	T(?y, rdf:type, ?c)
;; cls-int2 	T(?c, owl:intersectionOf, ?x)
;; LIST[?x, ?c1, ..., ?cn]
;; T(?y, rdf:type, ?c) 	T(?y, rdf:type, ?c1)
;; T(?y, rdf:type, ?c2)
;; ...
;; T(?y, rdf:type, ?cn)
;; cls-uni 	T(?c, owl:unionOf, ?x)
;; LIST[?x, ?c1, ..., ?cn]
;; T(?y, rdf:type, ?ci) 	T(?y, rdf:type, ?c) 	for each 1 ≤ i ≤ n
;; cls-com 	T(?c1, owl:complementOf, ?c2)
;; T(?x, rdf:type, ?c1)
;; T(?x, rdf:type, ?c2) 	false
;; cls-svf1 	T(?x, owl:someValuesFrom, ?y)
;; T(?x, owl:onProperty, ?p)
;; T(?u, ?p, ?v)
;; T(?v, rdf:type, ?y) 	T(?u, rdf:type, ?x)
;; cls-svf2 	T(?x, owl:someValuesFrom, owl:Thing)
;; T(?x, owl:onProperty, ?p)
;; T(?u, ?p, ?v) 	T(?u, rdf:type, ?x)
;; cls-avf 	T(?x, owl:allValuesFrom, ?y)
;; T(?x, owl:onProperty, ?p)
;; T(?u, rdf:type, ?x)
;; T(?u, ?p, ?v) 	T(?v, rdf:type, ?y)
;; cls-hv1 	T(?x, owl:hasValue, ?y)
;; T(?x, owl:onProperty, ?p)
;; T(?u, rdf:type, ?x) 	T(?u, ?p, ?y)
;; cls-hv2 	T(?x, owl:hasValue, ?y)
;; T(?x, owl:onProperty, ?p)
;; T(?u, ?p, ?y) 	T(?u, rdf:type, ?x)
;; cls-maxc1 	T(?x, owl:maxCardinality, "0"^^xsd:nonNegativeInteger)
;; T(?x, owl:onProperty, ?p)
;; T(?u, rdf:type, ?x)
;; T(?u, ?p, ?y) 	false
;; cls-maxc2 	T(?x, owl:maxCardinality, "1"^^xsd:nonNegativeInteger)
;; T(?x, owl:onProperty, ?p)
;; T(?u, rdf:type, ?x)
;; T(?u, ?p, ?y1)
;; T(?u, ?p, ?y2) 	T(?y1, owl:sameAs, ?y2)
;; cls-maxqc1 	T(?x, owl:maxQualifiedCardinality, "0"^^xsd:nonNegativeInteger)
;; T(?x, owl:onProperty, ?p)
;; T(?x, owl:onClass, ?c)
;; T(?u, rdf:type, ?x)
;; T(?u, ?p, ?y)
;; T(?y, rdf:type, ?c) 	false
;; cls-maxqc2 	T(?x, owl:maxQualifiedCardinality, "0"^^xsd:nonNegativeInteger)
;; T(?x, owl:onProperty, ?p)
;; T(?x, owl:onClass, owl:Thing)
;; T(?u, rdf:type, ?x)
;; T(?u, ?p, ?y) 	false
;; cls-maxqc3 	T(?x, owl:maxQualifiedCardinality, "1"^^xsd:nonNegativeInteger)
;; T(?x, owl:onProperty, ?p)
;; T(?x, owl:onClass, ?c)
;; T(?u, rdf:type, ?x)
;; T(?u, ?p, ?y1)
;; T(?y1, rdf:type, ?c)
;; T(?u, ?p, ?y2)
;; T(?y2, rdf:type, ?c) 	T(?y1, owl:sameAs, ?y2)
;; cls-maxqc4 	T(?x, owl:maxQualifiedCardinality, "1"^^xsd:nonNegativeInteger)
;; T(?x, owl:onProperty, ?p)
;; T(?x, owl:onClass, owl:Thing)
;; T(?u, rdf:type, ?x)
;; T(?u, ?p, ?y1)
;; T(?u, ?p, ?y2) 	T(?y1, owl:sameAs, ?y2)
;; cls-oo 	T(?c, owl:oneOf, ?x)
;; LIST[?x, ?y1, ..., ?yn] 	T(?y1, rdf:type, ?c)
;; ...
;; T(?yn, rdf:type, ?c) 

#_(defrule cls-thing [?e]
    :then
    [:owl/Thing :rdf/type :owl/Class])

#_(defrule cls-nothing1 []
  :then
  [:owl/Nothing :rdf/type :owl/Class])

(defrule cls-nothing2 [?x]
  :if
  [?x :rdf/type :owl/Nothing]
  :then
  false)

(defrule cls-int1 [?c ?x ?y]
  :if
  ;; T(?c, owl:intersectionOf, ?x)
  ;; LIST[?x, ?c1, ..., ?cn]
  ;; T(?y, rdf:type, ?c1)
  ;; T(?y, rdf:type, ?c2)
  ;; ...
  ;; T(?y, rdf:type, ?cn)
  [?c :owl/intersectionOf ?x]
  [(net.wikipunk.datomic.rl/rdf-list $ ?x) [?cn ...]]
  [?y :rdf/type ?cn]
  :then
  [:db/add ?y :rdf/type ?c])

(defrule cls-int2 [?c ?cn ?x ?y]
  :if
  ;; T(?c, owl:intersectionOf, ?x)
  ;; LIST[?x, ?c1, ..., ?cn]
  ;; T(?y, rdf:type, ?c)
  [?c :owl/intersectionOf ?x]
  [(net.wikipunk.datomic.rl/rdf-list $ ?x) [?cn ...]]
  [?y :rdf/type ?c]
  :then
  [:db/add ?y :rdf/type ?cn])

(defrule cls-uni [?c ?x ?y]
  :if
  ;; T(?c, owl:unionOf, ?x)
  ;; LIST[?x, ?c1, ..., ?cn]
  ;; T(?y, rdf:type, ?ci)
  [?c :owl/unionOf ?x]
  [(net.wikipunk.datomic.rl/rdf-list $ ?x) [?cn ...]]
  [?y :rdf/type ?cn]
  :then
  [:db/add ?y :rdf/type ?c])

(defrule cls-com [?c1 ?c2 ?x]
  :if
  [?c1 :owl/complementOf ?c2]
  [?x :rdf/type ?c1]
  [?x :rdf/type ?c2]
  :then
  false)

(defrule cls-svf1 [?x ?u]
  :if
  [?x :owl/someValuesFrom ?y]
  [?x :owl/onProperty ?p]
  [?u ?p ?v]
  [?v :rdf/type ?y]
  :then
  [:db/add ?u :rdf/type ?x])

(defrule cls-svf2 [?x ?u]
  :if
  [?x :owl/someValuesFrom :owl/Thing]
  [?x :owl/onProperty ?p]
  [?u ?p ?v]
  :then
  [:db/add ?u :rdf/type ?x])

(defrule cls-avf [?v ?y]
  :if
  [?x :owl/allValuesFrom ?y]
  [?x :owl/onProperty ?p]
  [?u :rdf/type ?x]
  [?u ?p ?v]
  :then
  [:db/add ?v :rdf/type ?y])

(defrule cls-hv1 [?u ?p ?y]
  :if
  [?x :owl/hasValue ?y]
  [?x :owl/onProperty ?p]
  [?u :rdf/type ?x]
  :then
  [:db/add ?u ?p ?y])

(defrule cls-hv2 [?u ?p ?x]
  :if
  [?x :owl/hasValue ?y]
  [?x :owl/onProperty ?p]
  [?u ?p ?y]
  :then
  [:db/add ?u :rdf/type ?x])

(defrule cls-maxc1 [?x ?p ?y]
  :if
  [?x :owl/maxCardinality 0]
  [?x :owl/onProperty ?p]
  [?u :rdf/type ?x]
  [?u ?p ?y]
  :then
  false)

(defrule cls-maxc2 [?x ?p ?y1 ?y2]
  :if
  [?x :owl/maxCardinality 1]
  [?x :owl/onProperty ?p]
  [?u :rdf/type ?x]
  [?u ?p ?y1]
  [?u ?p ?y2]
  :then
  [:db/add ?y1 :owl/sameAs ?y2])

(defrule cls-maxqc1 [?x ?p ?y]
  :if
  [?x :owl/maxQualifiedCardinality 0]
  [?x :owl/onProperty ?p]
  [?x :owl/onClass ?c]
  [?u :rdf/type ?x]
  [?u ?p ?y]
  [?y :rdf/type ?c]
  :then
  false)

(defrule cls-maxqc2 [?x ?p ?y1 ?y2]
  :if
  [?x :owl/maxQualifiedCardinality 0]
  [?x :owl/onProperty ?p]
  [?x :owl/onClass :owl/Thing]
  [?u :rdf/type ?x]
  [?u ?p ?y]
  :then
  false)

(defrule cls-maxqc3 [?x ?p ?c ?u ?y1 ?y2]
  :if
  [?x :owl/maxQualifiedCardinality 1]
  [?x :owl/onProperty ?p]
  [?x :owl/onClass ?c]
  [?u :rdf/type ?x]
  [?u ?p ?y1]
  [?y1 :rdf/type ?c]
  [?u ?p ?y2]
  [?y2 :rdf/type ?c]
  :then
  [:db/add ?y1 :owl/sameAs ?y2])

(defrule cls-maxqc4 [?x ?p ?u ?y1 ?y2]
  :if
  [?x :owl/maxQualifiedCardinality 1]
  [?x :owl/onProperty ?p]
  [?x :owl/onClass :owl/Thing]
  [?u :rdf/type ?x]
  [?u ?p ?y1]
  [?u ?p ?y2]
  :then
  [:db/add ?y1 :owl/sameAs ?y2])

(defrule cls-oo [?c ?x ?y]
  :if
  [?c :owl/oneOf ?x]
  [(net.wikipunk.datomic.rl/rdf-list $ ?x) [?y ...]]
  :then
  [:db/add ?y :rdf/type ?c])

;; Table 7. The Semantics of Class Axioms 	If 	then
;; cax-sco 	T(?c1, rdfs:subClassOf, ?c2)
;; T(?x, rdf:type, ?c1) 	T(?x, rdf:type, ?c2)

;; cax-eqc1 	T(?c1, owl:equivalentClass, ?c2)
;; T(?x, rdf:type, ?c1) 	T(?x, rdf:type, ?c2)

;; cax-eqc2 	T(?c1, owl:equivalentClass, ?c2)
;; T(?x, rdf:type, ?c2) 	T(?x, rdf:type, ?c1)

;; cax-dw 	T(?c1, owl:disjointWith, ?c2)
;; T(?x, rdf:type, ?c1)
;; T(?x, rdf:type, ?c2) 	false

;; cax-adc 	T(?x, rdf:type, owl:AllDisjointClasses)
;; T(?x, owl:members, ?y)
;; LIST[?y, ?c1, ..., ?cn]
;; T(?z, rdf:type, ?ci)
;; T(?z, rdf:type, ?cj) 	false 	for each 1 ≤ i < j ≤ n

(defrule cax-sco [?c1 ?c2 ?x]
  :if
  [?c1 :rdfs/subClassOf ?c2]
  [?x :rdf/type ?c1]
  :then
  [:db/add ?x :rdf/type ?c2])

(defrule cax-eqc1 [?c1 ?c2 ?x]
  :if
  [?c1 :owl/equivalentClass ?c2]
  [?x :rdf/type ?c1]
  :then
  [:db/add ?x :rdf/type ?c2])

(defrule cax-eqc2 [?c1 ?c2 ?x]
  :if
  [?c1 :owl/equivalentClass ?c2]
  [?x :rdf/type ?c2]
  :then
  [:db/add ?x :rdf/type ?c1])

(defrule cax-dw [?c1 ?c2 ?x]
  :if
  [?c1 :owl/disjointWith ?c2]
  [?x :rdf/type ?c1]
  [?x :rdf/type ?c2]
  :then
  false)

(defrule cax-adc [?x ?y ?z1 ?z2]
  :if
  [?x :rdf/type :owl/AllDisjointClasses]
  [?x :owl/members ?y]
  [(net.wikipunk.datomic.rl/rdf-list $ ?y) [?z1 ...]]
  [(net.wikipunk.datomic.rl/rdf-list $ ?y) [?z2 ...]]
  [(!= ?z1 ?z2)]
  [?z1 :rdf/type ?c1]
  [?z2 :rdf/type ?c2]
  :then
  false)

;;  Table 8. The Semantics of Datatypes 	If 	then
;; dt-type1 		T(dt, rdf:type, rdfs:Datatype) 	for each datatype dt supported in OWL 2 RL

;; dt-type2 		T(lt, rdf:type, dt) 	for each literal lt and each datatype dt supported in OWL 2 RL
;; such that the data value of lt is contained in the value space of dt

;; dt-eq 		T(lt1, owl:sameAs, lt2) 	for all literals lt1 and lt2 with the same data value

;; dt-diff 		T(lt1, owl:differentFrom, lt2) 	for all literals lt1 and lt2 with different data values

;; dt-not-type 	T(lt, rdf:type, dt) 	false 	for each literal lt and each datatype dt supported in OWL 2 RL
;; such that the data value of lt is not contained in the value space of dt

(defrule dt-type1 [?dt]
  ;; for each datatype dt supported in OWL 2 RL
  :then
  [:db/add ?dt :rdf/type :rdfs/Datatype])

(defrule dt-type2 [?lt ?dt]
  ;; for each literal lt and each datatype dt supported in OWL 2 RL
  ;; such that the data value of lt is contained in the value space of
  ;; dt
  :then
  [:db/add ?lt :rdf/type ?dt])

(defrule dt-eq [?lt1 ?lt2]
  ;; for all literals lt1 and lt2 with the same data value
  :then
  [:db/add ?lt1 :owl/sameAs ?lt2])

(defrule dt-diff [?lt1 ?lt2]
  ;; for all literals lt1 and lt2 with different data values
  :then
  [:db/add ?lt1 :owl/differentFrom ?lt2])

(defrule dt-not-type [?lt ?dt]
  ;; for each literal lt and each datatype dt supported in OWL 2 RL
  ;; such that the data value of lt is not contained in the value
  ;; space of dt
  :if
  [?lt :rdf/type ?dt]
  :then
  false)

;;  Table 9. The Semantics of Schema Vocabulary 	If 	then
;; scm-cls 	T(?c, rdf:type, owl:Class) 	T(?c, rdfs:subClassOf, ?c)
;; T(?c, owl:equivalentClass, ?c)
;; T(?c, rdfs:subClassOf, owl:Thing)
;; T(owl:Nothing, rdfs:subClassOf, ?c)
;; scm-sco 	T(?c1, rdfs:subClassOf, ?c2)
;; T(?c2, rdfs:subClassOf, ?c3) 	T(?c1, rdfs:subClassOf, ?c3)
;; scm-eqc1 	T(?c1, owl:equivalentClass, ?c2) 	T(?c1, rdfs:subClassOf, ?c2)
;; T(?c2, rdfs:subClassOf, ?c1)
;; scm-eqc2 	T(?c1, rdfs:subClassOf, ?c2)
;; T(?c2, rdfs:subClassOf, ?c1) 	T(?c1, owl:equivalentClass, ?c2)
;; scm-op 	T(?p, rdf:type, owl:ObjectProperty) 	T(?p, rdfs:subPropertyOf, ?p)
;; T(?p, owl:equivalentProperty, ?p)
;; scm-dp 	T(?p, rdf:type, owl:DatatypeProperty) 	T(?p, rdfs:subPropertyOf, ?p)
;; T(?p, owl:equivalentProperty, ?p)
;; scm-spo 	T(?p1, rdfs:subPropertyOf, ?p2)
;; T(?p2, rdfs:subPropertyOf, ?p3) 	T(?p1, rdfs:subPropertyOf, ?p3)
;; scm-eqp1 	T(?p1, owl:equivalentProperty, ?p2) 	T(?p1, rdfs:subPropertyOf, ?p2)
;; T(?p2, rdfs:subPropertyOf, ?p1)
;; scm-eqp2 	T(?p1, rdfs:subPropertyOf, ?p2)
;; T(?p2, rdfs:subPropertyOf, ?p1) 	T(?p1, owl:equivalentProperty, ?p2)
;; scm-dom1 	T(?p, rdfs:domain, ?c1)
;; T(?c1, rdfs:subClassOf, ?c2) 	T(?p, rdfs:domain, ?c2)
;; scm-dom2 	T(?p2, rdfs:domain, ?c)
;; T(?p1, rdfs:subPropertyOf, ?p2) 	T(?p1, rdfs:domain, ?c)
;; scm-rng1 	T(?p, rdfs:range, ?c1)
;; T(?c1, rdfs:subClassOf, ?c2) 	T(?p, rdfs:range, ?c2)
;; scm-rng2 	T(?p2, rdfs:range, ?c)
;; T(?p1, rdfs:subPropertyOf, ?p2) 	T(?p1, rdfs:range, ?c)
;; scm-hv 	T(?c1, owl:hasValue, ?i)
;; T(?c1, owl:onProperty, ?p1)
;; T(?c2, owl:hasValue, ?i)
;; T(?c2, owl:onProperty, ?p2)
;; T(?p1, rdfs:subPropertyOf, ?p2) 	T(?c1, rdfs:subClassOf, ?c2)
;; scm-svf1 	T(?c1, owl:someValuesFrom, ?y1)
;; T(?c1, owl:onProperty, ?p)
;; T(?c2, owl:someValuesFrom, ?y2)
;; T(?c2, owl:onProperty, ?p)
;; T(?y1, rdfs:subClassOf, ?y2) 	T(?c1, rdfs:subClassOf, ?c2)
;; scm-svf2 	T(?c1, owl:someValuesFrom, ?y)
;; T(?c1, owl:onProperty, ?p1)
;; T(?c2, owl:someValuesFrom, ?y)
;; T(?c2, owl:onProperty, ?p2)
;; T(?p1, rdfs:subPropertyOf, ?p2) 	T(?c1, rdfs:subClassOf, ?c2)
;; scm-avf1 	T(?c1, owl:allValuesFrom, ?y1)
;; T(?c1, owl:onProperty, ?p)
;; T(?c2, owl:allValuesFrom, ?y2)
;; T(?c2, owl:onProperty, ?p)
;; T(?y1, rdfs:subClassOf, ?y2) 	T(?c1, rdfs:subClassOf, ?c2)
;; scm-avf2 	T(?c1, owl:allValuesFrom, ?y)
;; T(?c1, owl:onProperty, ?p1)
;; T(?c2, owl:allValuesFrom, ?y)
;; T(?c2, owl:onProperty, ?p2)
;; T(?p1, rdfs:subPropertyOf, ?p2) 	T(?c2, rdfs:subClassOf, ?c1)
;; scm-int 	T(?c, owl:intersectionOf, ?x)
;; LIST[?x, ?c1, ..., ?cn] 	T(?c, rdfs:subClassOf, ?c1)
;; T(?c, rdfs:subClassOf, ?c2)
;; ...
;; T(?c, rdfs:subClassOf, ?cn)
;; scm-uni 	T(?c, owl:unionOf, ?x)
;; LIST[?x, ?c1, ..., ?cn] 	T(?c1, rdfs:subClassOf, ?c)
;; T(?c2, rdfs:subClassOf, ?c)
;; ...
;; T(?cn, rdfs:subClassOf, ?c)

(defrule scm-cls [?c]
  :if
  [?c :rdf/type :owl/Class]
  :then
  [:db/add ?c :rdfs/subClassOf ?c]
  [:db/add ?c :owl/equivalentClass ?c]
  [:db/add ?c :rdfs/subClassOf :owl/Thing]
  [:db/add :owl/Nothing :rdfs/subClassOf ?c])

(defrule scm-sco [?c1 ?c2 ?c3]
  :if
  [?c1 :rdfs/subClassOf ?c2]
  [?c2 :rdfs/subClassOf ?c3]
  :then
  [:db/add ?c1 :rdfs/subClassOf ?c3])

(defrule scm-eqc1 [?c1 ?c2]
  :if
  [?c1 :owl/equivalentClass ?c2]
  :then
  [:db/add ?c1 :rdfs/subClassOf ?c2]
  [:db/add ?c2 :rdfs/subClassOf ?c1])

(defrule scm-eqc2 [?c1 ?c2]
  :if
  [?c1 :rdfs/subClassOf ?c2]
  [?c2 :rdfs/subClassOf ?c1]
  :then
  [:db/add ?c1 :owl/equivalentClass ?c2])

(defrule scm-op [?p]
  :if
  [?p :rdf/type :owl/ObjectProperty]
  :then
  [:db/add ?p :rdfs/subPropertyOf ?p]
  [:db/add ?p :owl/equivalentProperty ?p])

(defrule scm-dp [?p]
  :if
  [?p :rdf/type :owl/DatatypeProperty]
  :then
  [:db/add ?p :rdfs/subPropertyOf ?p]
  [:db/add ?p :owl/equivalentProperty ?p])

(defrule scm-spo [?p1 ?p2 ?p3]
  :if
  [?p1 :rdfs/subPropertyOf ?p2]
  [?p2 :rdfs/subPropertyOf ?p3]
  :then
  [:db/add ?p1 :rdfs/subPropertyOf ?p3])

(defrule scm-eqp1 [?p1 ?p2]
  :if
  [?p1 :owl/equivalentProperty ?p2]
  :then
  [:db/add ?p1 :rdfs/subPropertyOf ?p2]
  [:db/add ?p2 :rdfs/subPropertyOf ?p1])

(defrule scm-eqp2 [?p1 ?p2]
  :if
  [?p1 :rdfs/subPropertyOf ?p2]
  [?p2 :rdfs/subPropertyOf ?p1]
  :then
  [:db/add ?p1 :owl/equivalentProperty ?p2])

(defrule scm-dom1 [?p ?c1 ?c2]
  :if
  [?p :rdfs/domain ?c1]
  [?c1 :rdfs/subClassOf ?c2]
  :then
  [:db/add ?p :rdfs/domain ?c2])

(defrule scm-dom2 [?p1 ?p2 ?c]
  :if
  [?p2 :rdfs/domain ?c]
  [?p1 :rdfs/subPropertyOf ?p2]
  :then
  [:db/add ?p1 :rdfs/domain ?c])

(defrule scm-rng1 [?p ?c1 ?c2]
  :if
  [?p :rdfs/range ?c]
  [?c1 :rdfs/subClassOf ?c2]
  :then
  [:db/add ?p :rdfs/range ?c2])

(defrule scm-rng2 [?p1 ?p2 ?c]
  :if
  [?p2 :rdfs/range ?c]
  [?p1 :rdfs/subPropertyOf ?p2]
  :then
  [:db/add ?p1 :rdfs/range ?c])

(defrule scm-hv [?c1 ?i ?p1 ?c2 ?p2]
  :if
  [?c1 :owl/hasValue ?i]
  [?c1 :owl/onProperty ?p1]
  [?c2 :owl/hasValue ?i]
  [?c2 :owl/onProperty ?p2]
  [?p1 :rdfs/subPropertyOf ?p2]
  :then
  [:db/add ?c1 :rdfs/subClassOf ?c2])

(defrule scm-svf1 [?c1 ?y1 ?p ?c2 ?y2]
  :if
  [?c1 :owl/someValuesFrom ?y1]
  [?c1 :owl/onProperty ?p]
  [?c2 :owl/someValuesFrom ?y2]
  [?c2 :owl/onProperty ?p]
  [?y1 :rdfs/subClassOf ?y2]
  :then
  [:db/add ?c1 :rdfs/subClassOf ?c2])

(defrule scm-svf2 [?c1 ?y ?p1 ?c2 ?p2]
  :if
  [?c1 :owl/someValuesFrom ?y]
  [?c1 :owl/onProperty ?p1]
  [?c2 :owl/someValuesFrom ?y]
  [?c2 :owl/onProperty ?p2]
  [?p1 :rdfs/subPropertyOf ?p2]
  :then
  [:db/add ?c1 :rdfs/subClassOf ?c2])

(defrule scm-avf1 [?c1 ?y1 ?p ?c2 ?y2]
  :if
  [?c1 :owl/allValuesFrom ?y1]
  [?c1 :owl/onProperty ?p]
  [?c2 :owl/allValuesFrom ?y2]
  [?c2 :owl/onProperty ?p]
  [?y1 :rdfs/subClassOf ?y2]
  :then
  [:db/add ?c1 :rdfs/subClassOf ?c2])

(defrule scm-avf2 [?c1 ?y ?p1 ?c2 ?p2]
  :if
  [?c1 :owl/allValuesFrom ?y]
  [?c1 :owl/onProperty ?p1]
  [?c2 :owl/allValuesFrom ?y]
  [?c2 :owl/onProperty ?p2]
  [?p1 :rdfs/subPropertyOf ?p2]
  :then
  [:db/add ?c2 :rdfs/subClassOf ?c1])

(defrule scm-int [?c ?x ?cn]
  :if
  [?c :owl/intersectionOf ?x]
  [(net.wikipunk.datomic.rl/rdf-list $ ?x) [?cn ...]]
  :then
  [:db/add ?c :rdfs/subClassOf ?cn])

(defrule scm-uni [?c ?x ?cn]
  :if
  [?c :owl/unionOf ?x]
  [(net.wikipunk.datomic.rl/rdf-list $ ?x) [?cn ...]]
  :then
  [:db/add ?cn :rdfs/subClassOf ?c])

(def rules
  (into []
        (comp
          (map meta)
          (filter :if)
          (map (fn [rule] (into [(:head rule)] (:if rule)))))
        [#'eq-ref
         #'eq-sym
         #'eq-trans
         #'eq-rep-s
         #'eq-rep-p
         #'eq-rep-o
         #'eq-diff1
         #'eq-diff2
         #'eq-diff3

         #'prp-dom
         #'prp-rng
         #'prp-fp
         #'prp-ifp
         #'prp-irp
         #'prp-symp
         #'prp-asyp
         #'prp-trp
         #'prp-spo1
         #'prp-spo2
         #'prp-eqp1
         #'prp-eqp2
         #'prp-pdw
         #'prp-adp
         #'prp-inv1
         #'prp-inv2
         #'prp-key
         #'prp-npa1
         #'prp-npa2

         #'cls-nothing2
         #'cls-int1
         #'cls-int2
         #'cls-uni
         #'cls-com
         #'cls-svf1
         #'cls-svf2
         #'cls-avf
         #'cls-hv1
         #'cls-hv2
         #'cls-maxc1
         #'cls-maxc2
         #'cls-maxqc1
         #'cls-maxqc2
         #'cls-maxqc3
         #'cls-maxqc4
         #'cls-oo

         #'cax-sco
         #'cax-eqc1
         #'cax-eqc2
         #'cax-dw
         #'cax-adc

         #'dt-type1
         #'dt-type2
         #'dt-eq
         #'dt-diff
         #'dt-not-type

         #'scm-cls
         #'scm-sco
         #'scm-eqc1
         #'scm-eqc2
         #'scm-op
         #'scm-dp
         #'scm-spo
         #'scm-eqp1
         #'scm-eqp2
         #'scm-dom1
         #'scm-dom2
         #'scm-rng1
         #'scm-rng2
         #'scm-hv
         #'scm-svf1
         #'scm-svf2
         #'scm-avf1
         #'scm-avf2
         #'scm-int
         #'scm-uni]))
