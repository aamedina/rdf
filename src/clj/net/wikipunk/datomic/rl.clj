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
     (cons (:db/id first) (some-> rest rdf-list)))))

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
  `(def ~rule-name
     '~(into {:head (list* rule-name rule-vars)}
             (comp
               (partition-by #{:if :then})
               (partition-all 2)
               (map (fn [[[k] forms]]
                      [k forms])))             
             body)))

;; Table 4: The Semantics of Equality

(defrule eq-ref [?s ?p ?o]
  :if
  [?s ?p ?o]
  :then
  [?s :owl/sameAs ?s]
  [?p :owl/sameAs ?p]
  [?o :owl/sameAs ?o])

(defrule eq-sym [?x ?y]
  :if
  [?x :owl/sameAs ?y]
  :then
  [?y :owl/sameAs ?x])

(defrule eq-trans [?x ?y ?z]
  :if
  [?x :owl/sameAs ?y]
  [?y :owl/sameAs ?z]
  :then
  [?x :owl/sameAs ?z])

(defrule eq-rep-s [?s ?p ?o ?s']
  :if
  [?s :owl/sameAs ?s']
  [?s ?p ?o]
  :then
  [?s' ?p ?o])

(defrule eq-rep-p [?s ?p ?o ?p']
  :if
  [?p :owl/sameAs ?p']
  [?s ?p ?o]
  :then
  [?s ?p' ?o])

(defrule eq-rep-o [?s ?p ?o ?o']
  :if
  [?o :owl/sameAs ?o']
  [?s ?p ?o]
  :then
  [?s ?p ?o'])

(defrule eq-diff1 [?x ?y]
  :if
  [?x :owl/sameAs ?y]
  [?x :owl/differentFrom ?y]
  :then
  false)

(defn rdf-list
  ([db eid]
   (rdf-list (d/pull db '[:rdf/first {:rdf/rest ...}] eid)))
  ([{:rdf/keys [first rest]}]
   (lazy-seq
     (cons (:db/id first) (some-> rest rdf-list)))))

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

;; Table 5: The Semantics of Axioms about Properties

(defrule prp-dom [?p ?c ?x ?y]
  :if
  [?p :rdfs/domain ?c]
  [?x ?p ?y]
  :then
  [?x :rdf/type ?c])

(defrule prp-rng [?p ?c ?x ?y]
  :if
  [?p :rdfs/range ?c]
  [?x ?p ?y]
  :then
  [?y :rdf/type ?c])

(defrule prp-fp [?p ?x ?y1 ?y2]
  :if
  [?p :rdf/type :owl/FunctionalProperty]
  [?x ?p ?y1]
  [?x ?p ?y2]
  :then
  [?y1 :owl/sameAs ?y2])

(defrule prp-ifp [?p ?y ?x1 ?x2]
  :if
  [?p :rdf/type :owl/InverseFunctionalProperty]
  [?x1 ?p ?y]
  [?x2 ?p ?y]
  :then
  [?x1 :owl/sameAs ?x2])

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
  [?y ?p ?x])

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
  [?x ?p ?z])

(defrule prp-spo1 [?p1 ?p2 ?x ?y]
  :if
  [?p1 :rdfs/subPropertyOf ?p2]
  [?x ?p1 ?y]
  :then
  [?x ?p2 ?y])

(defrule prp-spo2 [?p ?x]
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
  [?y ?p ?w])

(defrule prp-eqp1 [?p1 ?p2 ?x ?y]
  :if
  [?p1 :owl/equivalentProperty ?p2]
  [?x ?p1 ?y]
  :then
  [?x ?p2 ?y])

(defrule prp-eqp2 [?p1 ?p2 ?x ?y]
  :if
  [?p1 :owl/equivalentProperty ?p2]
  [?x ?p2 ?y]
  :then
  [?x ?p1 ?y])

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
  [?y ?p2 ?x])

(defrule prp-inv2 [?p1 ?p2 ?x ?y]
  :if
  [?p1 :owl/inverseOf ?p2]
  [?x ?p2 ?y]
  :then
  [?y ?p1 ?x])

(defrule prp-key [?c ?u ?p1 ?p2]
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
  [?x :owl/sameAs ?y])

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

;;  Table 6. The Semantics of Classes

;; If 	then
;; cls-thing 		T(owl:Thing, rdf:type, owl:Class)

(defrule cls-thing []
  :then
  [:owl/Thing :rdf/type :owl/Class])

(defrule cls-nothing1 []
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
  [(net.wikipunk.datomic.rl/rdf-list $ ?x) ?cn]
  [?y :rdf/type ?cn]
  :then
  [?y :rdf/type ?c])

(defrule cls-int2 [?c ?cn ?x ?y]
  :if
  ;; T(?c, owl:intersectionOf, ?x)
  ;; LIST[?x, ?c1, ..., ?cn]
  ;; T(?y, rdf:type, ?c)
  [?c :owl/intersectionOf ?x]
  [(net.wikipunk.datomic.rl/rdf-list $ ?x) ?cn]
  [?y :rdf/type ?c]
  :then
  [?y :rdf/type ?cn])

(defrule cls-uni [?c ?x ?y]
  :if
  ;; T(?c, owl:unionOf, ?x)
  ;; LIST[?x, ?c1, ..., ?cn]
  ;; T(?y, rdf:type, ?ci)
  [?c :owl/unionOf ?x]
  [(net.wikipunk.datomic.rl/rdf-list $ ?x) ?cn]
  [?y :rdf/type ?cn]
  :then
  [?y :rdf/type ?c])

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
  [?u :rdf/type ?x])

(defrule cls-svf2 [?x ?u]
  :if
  [?x :owl/someValuesFrom :owl/Thing]
  [?x :owl/onProperty ?p]
  [?u ?p ?v]
  :then
  [?u :rdf/type ?x])

(defrule cls-avf [?v ?y]
  :if
  [?x :owl/allValuesFrom ?y]
  [?x :owl/onProperty ?p]
  [?u :rdf/type ?x]
  [?u ?p ?v]
  :then
  [?v :rdf/type ?y])

(defrule cls-hv1 [?u ?p ?y]
  :if
  [?x :owl/hasValue ?y]
  [?x :owl/onProperty ?p]
  [?u :rdf/type ?x]
  :then
  [?u ?p ?y])

(defrule cls-hv2 [?u ?p ?y]
  :if
  [?x :owl/hasValue ?y]
  [?x :owl/onProperty ?p]
  [?u ?p ?y]
  :then
  [?u :rdf/type ?x])

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
  [?y1 :owl/sameAs ?y2])

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
  [?y1 :owl/sameAs ?y2])

(defrule cls-maxqc4 [?x ?p ?u ?y1 ?y2]
  :if
  [?x :owl/maxQualifiedCardinality 1]
  [?x :owl/onProperty ?p]
  [?x :owl/onClass :owl/Thing]
  [?u :rdf/type ?x]
  [?u ?p ?y1]
  [?u ?p ?y2]
  :then
  [?y1 :owl/sameAs ?y2])

(defrule cls-oo [?c ?x ?y]
  :if
  [?c :owl/oneOf ?x]
  [(net.wikipunk.datomic.rl/rdf-list $ ?x) [?y ...]]
  :then
  [?y :rdf/type ?c])

(def rules
  (into []
        (map (fn [rule] (into [(:head rule)] (:if rule))))
        [eq-ref
         eq-sym
         eq-trans
         eq-rep-s
         eq-rep-p
         eq-rep-o
         eq-diff1
         eq-diff2
         eq-diff3

         prp-dom
         prp-rng
         prp-fp
         prp-ifp
         prp-irp
         prp-symp
         prp-asyp
         prp-trp
         prp-spo1
         prp-spo2
         prp-eqp1
         prp-eqp2
         prp-pdw
         prp-adp
         prp-inv1
         prp-inv2
         prp-key
         prp-npa1
         prp-npa2

         cls-nothing2
         cls-int1
         cls-int2
         cls-uni
         cls-com
         cls-svf1
         cls-svf2
         cls-avf
         cls-hv1
         cls-hv2
         cls-maxc1
         cls-maxc2
         cls-maxqc1
         cls-maxqc2
         cls-maxqc3
         cls-maxqc4
         cls-oo]))
