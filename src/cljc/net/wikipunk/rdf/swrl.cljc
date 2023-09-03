(ns net.wikipunk.rdf.swrl
  {:dcat/downloadURL
   "http://www.w3.org/Submission/2004/SUBM-SWRL-20040521/swrl.rdf",
   :rdf/ns-prefix-map {"owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "swrl" "http://www.w3.org/2003/11/swrl#"},
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "swrl",
   :rdfa/uri "http://www.w3.org/2003/11/swrl#"})

(def Atom
  {:db/ident     :swrl/Atom,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "common superclass"})

(def Builtin
  {:db/ident :swrl/Builtin,
   :rdf/type :rdfs/Class})

(def BuiltinAtom
  {:db/ident        :swrl/BuiltinAtom,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "consists of a builtin and a List of arguments",
   :rdfs/subClassOf :swrl/Atom})

(def ClassAtom
  {:db/ident        :swrl/ClassAtom,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "consists of a classPredicate and argument1",
   :rdfs/subClassOf :swrl/Atom})

(def DataRangeAtom
  {:db/ident        :swrl/DataRangeAtom,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "consists of a dataRange and argument1",
   :rdfs/subClassOf :swrl/Atom})

(def DatavaluedPropertyAtom
  {:db/ident :swrl/DatavaluedPropertyAtom,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "consists of a propertyPredicate (owl:DatatypeProperty), argument1 (owl:Thing), and argument2 (rdfs:Literal)",
   :rdfs/subClassOf :swrl/Atom})

(def DifferentIndividualsAtom
  {:db/ident :swrl/DifferentIndividualsAtom,
   :rdf/type :rdfs/Class,
   :rdfs/comment "consists of argument1 (owl:Thing) and argument2 (owl:Thing)",
   :rdfs/subClassOf :swrl/Atom})

(def Imp
  {:db/ident     :swrl/Imp,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "implication (rule)"})

(def IndividualPropertyAtom
  {:db/ident :swrl/IndividualPropertyAtom,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "consists of a propertyPredicate (owl:ObjectProperty), argument1 (owl:Thing), and argument2 (owl:Thing)",
   :rdfs/subClassOf :swrl/Atom})

(def SameIndividualAtom
  {:db/ident :swrl/SameIndividualAtom,
   :rdf/type :rdfs/Class,
   :rdfs/comment "consists of argument1 (owl:Thing) and argument2 (owl:Thing)",
   :rdfs/subClassOf :swrl/Atom})

(def Variable
  {:db/ident     :swrl/Variable,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "indicate that a URI is being used as a variable"})

(def argument1
  {:db/ident    :swrl/argument1,
   :rdf/type    :rdf/Property,
   :rdfs/domain :swrl/Atom,
   :rdfs/range  :rdfs/Resource})

(def argument2
  {:db/ident     :swrl/argument2,
   :rdf/type     :rdf/Property,
   :rdfs/comment "can be a Literal or Resource",
   :rdfs/domain  :swrl/Atom})

(def arguments
  {:db/ident    :swrl/arguments,
   :rdf/type    :rdf/Property,
   :rdfs/domain :swrl/BuiltinAtom,
   :rdfs/range  :rdf/List})

(def body
  {:db/ident     :swrl/body,
   :rdf/type     :rdf/Property,
   :rdfs/comment "rule body (antecedent):  List of Atom",
   :rdfs/domain  :swrl/Imp,
   :rdfs/range   :rdf/List})

(def builtin
  {:db/ident    :swrl/builtin,
   :rdf/type    :rdf/Property,
   :rdfs/domain :swrl/BuiltinAtom,
   :rdfs/range  :swrl/Builtin})

(def classPredicate
  {:db/ident    :swrl/classPredicate,
   :rdf/type    :rdf/Property,
   :rdfs/domain :swrl/ClassAtom,
   :rdfs/range  :rdfs/Class})

(def dataRange
  {:db/ident    :swrl/dataRange,
   :rdf/type    :rdf/Property,
   :rdfs/domain :swrl/DataRangeAtom,
   :rdfs/range  :owl/DataRange})

(def head
  {:db/ident     :swrl/head,
   :rdf/type     :rdf/Property,
   :rdfs/comment "rule head (consequent):  List of Atom",
   :rdfs/domain  :swrl/Imp,
   :rdfs/range   :rdf/List})

(def propertyPredicate
  {:db/ident    :swrl/propertyPredicate,
   :rdf/type    :rdf/Property,
   :rdfs/domain :swrl/Atom,
   :rdfs/range  :rdf/Property})