(ns net.wikipunk.rdf.swrl
  "RDF Schema definition of the RDF Concrete Syntax for the Semantic Web Rule Language"
  {:dcat/downloadURL
   "http://www.w3.org/Submission/2004/SUBM-SWRL-20040521/swrl.rdf",
   :owl/versionInfo "$Id: swrl.rdf,v 1.1 2004/05/21 18:46:39 vivien Exp $",
   :rdf/ns-prefix-map {"owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "swrl" "http://www.w3.org/2003/11/swrl#"},
   :rdf/type          :owl/Ontology
   :rdf/uri "http://www.w3.org/2003/11/swrl",
   :rdfa/prefix "swrl",
   :rdfa/uri "http://www.w3.org/2003/11/swrl#",
   :rdfs/comment
   "RDF Schema definition of the RDF Concrete Syntax for the Semantic Web Rule Language"})

(def Atom
  "common superclass"
  {:db/ident     :swrl/Atom,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "common superclass"})

(def Builtin
  {:db/ident :swrl/Builtin,
   :rdf/type :rdfs/Class})

(def BuiltinAtom
  "consists of a builtin and a List of arguments"
  {:db/ident        :swrl/BuiltinAtom,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "consists of a builtin and a List of arguments",
   :rdfs/subClassOf :swrl/Atom})

(def ClassAtom
  "consists of a classPredicate and argument1"
  {:db/ident        :swrl/ClassAtom,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "consists of a classPredicate and argument1",
   :rdfs/subClassOf :swrl/Atom})

(def DataRangeAtom
  "consists of a dataRange and argument1"
  {:db/ident        :swrl/DataRangeAtom,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "consists of a dataRange and argument1",
   :rdfs/subClassOf :swrl/Atom})

(def DatavaluedPropertyAtom
  "consists of a propertyPredicate (owl:DatatypeProperty), argument1 (owl:Thing), and argument2 (rdfs:Literal)"
  {:db/ident :swrl/DatavaluedPropertyAtom,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "consists of a propertyPredicate (owl:DatatypeProperty), argument1 (owl:Thing), and argument2 (rdfs:Literal)",
   :rdfs/subClassOf :swrl/Atom})

(def DifferentIndividualsAtom
  "consists of argument1 (owl:Thing) and argument2 (owl:Thing)"
  {:db/ident :swrl/DifferentIndividualsAtom,
   :rdf/type :rdfs/Class,
   :rdfs/comment "consists of argument1 (owl:Thing) and argument2 (owl:Thing)",
   :rdfs/subClassOf :swrl/Atom})

(def Imp
  "implication (rule)"
  {:db/ident     :swrl/Imp,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "implication (rule)"})

(def IndividualPropertyAtom
  "consists of a propertyPredicate (owl:ObjectProperty), argument1 (owl:Thing), and argument2 (owl:Thing)"
  {:db/ident :swrl/IndividualPropertyAtom,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "consists of a propertyPredicate (owl:ObjectProperty), argument1 (owl:Thing), and argument2 (owl:Thing)",
   :rdfs/subClassOf :swrl/Atom})

(def SameIndividualAtom
  "consists of argument1 (owl:Thing) and argument2 (owl:Thing)"
  {:db/ident :swrl/SameIndividualAtom,
   :rdf/type :rdfs/Class,
   :rdfs/comment "consists of argument1 (owl:Thing) and argument2 (owl:Thing)",
   :rdfs/subClassOf :swrl/Atom})

(def Variable
  "indicate that a URI is being used as a variable"
  {:db/ident     :swrl/Variable,
   :rdf/type     :rdfs/Class,
   :rdfs/comment "indicate that a URI is being used as a variable"})

(def argument1
  {:db/ident    :swrl/argument1,
   :rdf/type    :rdf/Property,
   :rdfs/domain :swrl/Atom,
   :rdfs/range  :rdfs/Resource})

(def argument2
  "can be a Literal or Resource"
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
  "rule body (antecedent): List of Atom"
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
  "rule head (consequent): List of Atom"
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
