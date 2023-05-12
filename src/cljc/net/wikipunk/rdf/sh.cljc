(ns net.wikipunk.rdf.sh
  "http://www.w3.org/ns/shacl-shacl#"
  {:rdf/ns-prefix-map {"owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "sh"   "http://www.w3.org/ns/shacl#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "sh",
   :rdfa/uri          "http://www.w3.org/ns/shacl-shacl#"}
  (:refer-clojure :exclude [and class declare name namespace not or update]))

(def AbstractResult
  "The base class of validation results, typically not instantiated directly."
  {:db/ident :sh/AbstractResult,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The base class of validation results, typically not instantiated directly.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Abstract result",
   :rdfs/subClassOf [:rdfs/Resource :sh/AbstractResult]})

(def AndConstraintComponent
  "A constraint component that can be used to test whether a value node conforms to all members of a provided list of shapes."
  {:db/ident :sh/AndConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to test whether a value node conforms to all members of a provided list of shapes.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "And constraint component",
   :sh/parameter :sh/AndConstraintComponent-and})

(def AndConstraintComponent-and
  {:db/ident         :sh/AndConstraintComponent-and,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/path          :sh/and})

(def BlankNode
  "The node kind of all blank nodes."
  {:db/ident         :sh/BlankNode,
   :rdf/type         [:sh/NodeKind :rdfs/Resource],
   :rdfs/comment     "The node kind of all blank nodes.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       "Blank node"})

(def BlankNodeOrIRI
  "The node kind of all blank nodes or IRIs."
  {:db/ident         :sh/BlankNodeOrIRI,
   :rdf/type         [:sh/NodeKind :rdfs/Resource],
   :rdfs/comment     "The node kind of all blank nodes or IRIs.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       "Blank node or IRI"})

(def BlankNodeOrLiteral
  "The node kind of all blank nodes or literals."
  {:db/ident         :sh/BlankNodeOrLiteral,
   :rdf/type         [:sh/NodeKind :rdfs/Resource],
   :rdfs/comment     "The node kind of all blank nodes or literals.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       "Blank node or literal"})

(def ClassConstraintComponent
  "A constraint component that can be used to verify that each value node is an instance of a given type."
  {:db/ident :sh/ClassConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to verify that each value node is an instance of a given type.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Class constraint component",
   :sh/parameter :sh/ClassConstraintComponent-class})

(def ClassConstraintComponent-class
  {:db/ident         :sh/ClassConstraintComponent-class,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/nodeKind      :sh/IRI,
   :sh/path          :sh/class})

(def ClosedConstraintComponent
  "A constraint component that can be used to indicate that focus nodes must only have values for those properties that have been explicitly enumerated via sh:property/sh:path."
  {:db/ident :sh/ClosedConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to indicate that focus nodes must only have values for those properties that have been explicitly enumerated via sh:property/sh:path.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Closed constraint component",
   :sh/parameter [:sh/ClosedConstraintComponent-ignoredProperties
                  :sh/ClosedConstraintComponent-closed]})

(def ClosedConstraintComponent-closed
  {:db/ident         :sh/ClosedConstraintComponent-closed,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/datatype      :xsd/boolean,
   :sh/path          :sh/closed})

(def ClosedConstraintComponent-ignoredProperties
  {:db/ident         :sh/ClosedConstraintComponent-ignoredProperties,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/optional      true,
   :sh/path          :sh/ignoredProperties})

(def ConstraintComponent
  "The class of constraint components."
  {:db/ident         :sh/ConstraintComponent,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of constraint components.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       "Constraint component",
   :rdfs/subClassOf  [:sh/Parameterizable
                      :sh/ConstraintComponent
                      :rdfs/Resource]})

(def DatatypeConstraintComponent
  "A constraint component that can be used to restrict the datatype of all value nodes."
  {:db/ident :sh/DatatypeConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to restrict the datatype of all value nodes.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Datatype constraint component",
   :sh/parameter :sh/DatatypeConstraintComponent-datatype})

(def DatatypeConstraintComponent-datatype
  {:db/ident         :sh/DatatypeConstraintComponent-datatype,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/maxCount      1,
   :sh/nodeKind      :sh/IRI,
   :sh/path          :sh/datatype})

(def DisjointConstraintComponent
  "A constraint component that can be used to verify that the set of value nodes is disjoint with the the set of nodes that have the focus node as subject and the value of a given property as predicate."
  {:db/ident :sh/DisjointConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to verify that the set of value nodes is disjoint with the the set of nodes that have the focus node as subject and the value of a given property as predicate.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Disjoint constraint component",
   :sh/parameter :sh/DisjointConstraintComponent-disjoint})

(def DisjointConstraintComponent-disjoint
  {:db/ident         :sh/DisjointConstraintComponent-disjoint,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/nodeKind      :sh/IRI,
   :sh/path          :sh/disjoint})

(def EqualsConstraintComponent
  "A constraint component that can be used to verify that the set of value nodes is equal to the set of nodes that have the focus node as subject and the value of a given property as predicate."
  {:db/ident :sh/EqualsConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to verify that the set of value nodes is equal to the set of nodes that have the focus node as subject and the value of a given property as predicate.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Equals constraint component",
   :sh/parameter :sh/EqualsConstraintComponent-equals})

(def EqualsConstraintComponent-equals
  {:db/ident         :sh/EqualsConstraintComponent-equals,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/nodeKind      :sh/IRI,
   :sh/path          :sh/equals})

(def ExpressionConstraintComponent
  "A constraint component that can be used to verify that a given node expression produces true for all value nodes."
  {:db/ident :sh/ExpressionConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to verify that a given node expression produces true for all value nodes.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Expression constraint component",
   :sh/parameter :sh/ExpressionConstraintComponent-expression})

(def ExpressionConstraintComponent-expression
  {:db/ident         :sh/ExpressionConstraintComponent-expression,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/path          :sh/expression})

(def Function
  "The class of SHACL functions."
  {:db/ident         :sh/Function,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of SHACL functions.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       "Function",
   :rdfs/subClassOf  [:sh/Parameterizable :sh/Function :rdfs/Resource]})

(def HasValueConstraintComponent
  "A constraint component that can be used to verify that one of the value nodes is a given RDF node."
  {:db/ident :sh/HasValueConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to verify that one of the value nodes is a given RDF node.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Has-value constraint component",
   :sh/parameter :sh/HasValueConstraintComponent-hasValue})

(def HasValueConstraintComponent-hasValue
  {:db/ident         :sh/HasValueConstraintComponent-hasValue,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/path          :sh/hasValue})

(def IRI
  "The node kind of all IRIs."
  {:db/ident         :sh/IRI,
   :rdf/type         [:sh/NodeKind :rdfs/Resource],
   :rdfs/comment     "The node kind of all IRIs.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       "IRI"})

(def IRIOrLiteral
  "The node kind of all IRIs or literals."
  {:db/ident         :sh/IRIOrLiteral,
   :rdf/type         [:sh/NodeKind :rdfs/Resource],
   :rdfs/comment     "The node kind of all IRIs or literals.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       "IRI or literal"})

(def InConstraintComponent
  "A constraint component that can be used to exclusively enumerate the permitted value nodes."
  {:db/ident :sh/InConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to exclusively enumerate the permitted value nodes.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "In constraint component",
   :sh/parameter :sh/InConstraintComponent-in})

(def InConstraintComponent-in
  {:db/ident         :sh/InConstraintComponent-in,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/maxCount      1,
   :sh/path          :sh/in})

(def Info
  "The severity for an informational validation result."
  {:db/ident         :sh/Info,
   :rdf/type         [:sh/Severity :rdfs/Resource],
   :rdfs/comment     "The severity for an informational validation result.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       "Info"})

(def JSConstraint
  "The class of constraints backed by a JavaScript function."
  {:db/ident :sh/JSConstraint,
   :rdf/type :rdfs/Class,
   :rdfs/comment "The class of constraints backed by a JavaScript function.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "JavaScript-based constraint",
   :rdfs/subClassOf [:sh/JSExecutable :sh/JSConstraint :rdfs/Resource]})

(def JSConstraint-js
  {:db/ident         :sh/JSConstraint-js,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/path          :sh/js})

(def JSConstraintComponent
  "A constraint component with the parameter sh:js linking to a sh:JSConstraint containing a sh:script."
  {:db/ident :sh/JSConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component with the parameter sh:js linking to a sh:JSConstraint containing a sh:script.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "JavaScript constraint component",
   :sh/parameter :sh/JSConstraint-js})

(def JSExecutable
  "Abstract base class of resources that declare an executable JavaScript."
  {:db/ident :sh/JSExecutable,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Abstract base class of resources that declare an executable JavaScript.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "JavaScript executable",
   :rdfs/subClassOf [:rdfs/Resource :sh/JSExecutable]})

(def JSFunction
  "The class of SHACL functions that execute a JavaScript function when called."
  {:db/ident :sh/JSFunction,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The class of SHACL functions that execute a JavaScript function when called.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "JavaScript function",
   :rdfs/subClassOf [:sh/JSExecutable
                     :sh/Function
                     :sh/JSFunction
                     :rdfs/Resource
                     :sh/Parameterizable]})

(def JSLibrary
  "Represents a JavaScript library, typically identified by one or more URLs of files to include."
  {:db/ident :sh/JSLibrary,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Represents a JavaScript library, typically identified by one or more URLs of files to include.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "JavaScript library",
   :rdfs/subClassOf [:rdfs/Resource :sh/JSLibrary]})

(def JSRule
  "The class of SHACL rules expressed using JavaScript."
  {:db/ident         :sh/JSRule,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of SHACL rules expressed using JavaScript.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       "JavaScript rule",
   :rdfs/subClassOf  [:sh/Rule :sh/JSExecutable :sh/JSRule :rdfs/Resource]})

(def JSTarget
  "The class of targets that are based on JavaScript functions."
  {:db/ident :sh/JSTarget,
   :rdf/type :rdfs/Class,
   :rdfs/comment "The class of targets that are based on JavaScript functions.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "JavaScript target",
   :rdfs/subClassOf [:sh/JSExecutable :sh/Target :sh/JSTarget :rdfs/Resource]})

(def JSTargetType
  "The (meta) class for parameterizable targets that are based on JavaScript functions."
  {:db/ident :sh/JSTargetType,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The (meta) class for parameterizable targets that are based on JavaScript functions.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "JavaScript target type",
   :rdfs/subClassOf [:sh/JSExecutable
                     :sh/TargetType
                     :sh/JSTargetType
                     :rdfs/Class
                     :rdfs/Resource
                     :sh/Parameterizable]})

(def JSValidator
  "A SHACL validator based on JavaScript. This can be used to declare SHACL constraint components that perform JavaScript-based validation when used."
  {:db/ident :sh/JSValidator,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A SHACL validator based on JavaScript. This can be used to declare SHACL constraint components that perform JavaScript-based validation when used.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "JavaScript validator",
   :rdfs/subClassOf
   [:sh/Validator :sh/JSExecutable :sh/JSValidator :rdfs/Resource]})

(def LanguageInConstraintComponent
  "A constraint component that can be used to enumerate language tags that all value nodes must have."
  {:db/ident :sh/LanguageInConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to enumerate language tags that all value nodes must have.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Language-in constraint component",
   :sh/parameter :sh/LanguageInConstraintComponent-languageIn})

(def LanguageInConstraintComponent-languageIn
  {:db/ident         :sh/LanguageInConstraintComponent-languageIn,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/maxCount      1,
   :sh/path          :sh/languageIn})

(def LessThanConstraintComponent
  "A constraint component that can be used to verify that each value node is smaller than all the nodes that have the focus node as subject and the value of a given property as predicate."
  {:db/ident :sh/LessThanConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to verify that each value node is smaller than all the nodes that have the focus node as subject and the value of a given property as predicate.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Less-than constraint component",
   :sh/parameter :sh/LessThanConstraintComponent-lessThan})

(def LessThanConstraintComponent-lessThan
  {:db/ident         :sh/LessThanConstraintComponent-lessThan,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/nodeKind      :sh/IRI,
   :sh/path          :sh/lessThan})

(def LessThanOrEqualsConstraintComponent
  "A constraint component that can be used to verify that every value node is smaller than all the nodes that have the focus node as subject and the value of a given property as predicate."
  {:db/ident :sh/LessThanOrEqualsConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to verify that every value node is smaller than all the nodes that have the focus node as subject and the value of a given property as predicate.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "less-than-or-equals constraint component",
   :sh/parameter :sh/LessThanOrEqualsConstraintComponent-lessThanOrEquals})

(def LessThanOrEqualsConstraintComponent-lessThanOrEquals
  {:db/ident         :sh/LessThanOrEqualsConstraintComponent-lessThanOrEquals,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/nodeKind      :sh/IRI,
   :sh/path          :sh/lessThanOrEquals})

(def Literal
  "The node kind of all literals."
  {:db/ident         :sh/Literal,
   :rdf/type         [:sh/NodeKind :rdfs/Resource],
   :rdfs/comment     "The node kind of all literals.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       "Literal"})

(def MaxCountConstraintComponent
  "A constraint component that can be used to restrict the maximum number of value nodes."
  {:db/ident :sh/MaxCountConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to restrict the maximum number of value nodes.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Max-count constraint component",
   :sh/parameter :sh/MaxCountConstraintComponent-maxCount})

(def MaxCountConstraintComponent-maxCount
  {:db/ident         :sh/MaxCountConstraintComponent-maxCount,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/datatype      :xsd/integer,
   :sh/maxCount      1,
   :sh/path          :sh/maxCount})

(def MaxExclusiveConstraintComponent
  "A constraint component that can be used to restrict the range of value nodes with a maximum exclusive value."
  {:db/ident :sh/MaxExclusiveConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to restrict the range of value nodes with a maximum exclusive value.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Max-exclusive constraint component",
   :sh/parameter :sh/MaxExclusiveConstraintComponent-maxExclusive})

(def MaxExclusiveConstraintComponent-maxExclusive
  {:db/ident         :sh/MaxExclusiveConstraintComponent-maxExclusive,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/maxCount      1,
   :sh/nodeKind      :sh/Literal,
   :sh/path          :sh/maxExclusive})

(def MaxInclusiveConstraintComponent
  "A constraint component that can be used to restrict the range of value nodes with a maximum inclusive value."
  {:db/ident :sh/MaxInclusiveConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to restrict the range of value nodes with a maximum inclusive value.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Max-inclusive constraint component",
   :sh/parameter :sh/MaxInclusiveConstraintComponent-maxInclusive})

(def MaxInclusiveConstraintComponent-maxInclusive
  {:db/ident         :sh/MaxInclusiveConstraintComponent-maxInclusive,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/maxCount      1,
   :sh/nodeKind      :sh/Literal,
   :sh/path          :sh/maxInclusive})

(def MaxLengthConstraintComponent
  "A constraint component that can be used to restrict the maximum string length of value nodes."
  {:db/ident :sh/MaxLengthConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to restrict the maximum string length of value nodes.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Max-length constraint component",
   :sh/parameter :sh/MaxLengthConstraintComponent-maxLength})

(def MaxLengthConstraintComponent-maxLength
  {:db/ident         :sh/MaxLengthConstraintComponent-maxLength,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/datatype      :xsd/integer,
   :sh/maxCount      1,
   :sh/path          :sh/maxLength})

(def MinCountConstraintComponent
  "A constraint component that can be used to restrict the minimum number of value nodes."
  {:db/ident :sh/MinCountConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to restrict the minimum number of value nodes.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Min-count constraint component",
   :sh/parameter :sh/MinCountConstraintComponent-minCount})

(def MinCountConstraintComponent-minCount
  {:db/ident         :sh/MinCountConstraintComponent-minCount,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/datatype      :xsd/integer,
   :sh/maxCount      1,
   :sh/path          :sh/minCount})

(def MinExclusiveConstraintComponent
  "A constraint component that can be used to restrict the range of value nodes with a minimum exclusive value."
  {:db/ident :sh/MinExclusiveConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to restrict the range of value nodes with a minimum exclusive value.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Min-exclusive constraint component",
   :sh/parameter :sh/MinExclusiveConstraintComponent-minExclusive})

(def MinExclusiveConstraintComponent-minExclusive
  {:db/ident         :sh/MinExclusiveConstraintComponent-minExclusive,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/maxCount      1,
   :sh/nodeKind      :sh/Literal,
   :sh/path          :sh/minExclusive})

(def MinInclusiveConstraintComponent
  "A constraint component that can be used to restrict the range of value nodes with a minimum inclusive value."
  {:db/ident :sh/MinInclusiveConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to restrict the range of value nodes with a minimum inclusive value.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Min-inclusive constraint component",
   :sh/parameter :sh/MinInclusiveConstraintComponent-minInclusive})

(def MinInclusiveConstraintComponent-minInclusive
  {:db/ident         :sh/MinInclusiveConstraintComponent-minInclusive,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/maxCount      1,
   :sh/nodeKind      :sh/Literal,
   :sh/path          :sh/minInclusive})

(def MinLengthConstraintComponent
  "A constraint component that can be used to restrict the minimum string length of value nodes."
  {:db/ident :sh/MinLengthConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to restrict the minimum string length of value nodes.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Min-length constraint component",
   :sh/parameter :sh/MinLengthConstraintComponent-minLength})

(def MinLengthConstraintComponent-minLength
  {:db/ident         :sh/MinLengthConstraintComponent-minLength,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/datatype      :xsd/integer,
   :sh/maxCount      1,
   :sh/path          :sh/minLength})

(def NodeConstraintComponent
  "A constraint component that can be used to verify that all value nodes conform to the given node shape."
  {:db/ident :sh/NodeConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to verify that all value nodes conform to the given node shape.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Node constraint component",
   :sh/parameter :sh/NodeConstraintComponent-node})

(def NodeConstraintComponent-node
  {:db/ident         :sh/NodeConstraintComponent-node,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/path          :sh/node})

(def NodeKind
  "The class of all node kinds, including sh:BlankNode, sh:IRI, sh:Literal or the combinations of these: sh:BlankNodeOrIRI, sh:BlankNodeOrLiteral, sh:IRIOrLiteral."
  {:db/ident :sh/NodeKind,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The class of all node kinds, including sh:BlankNode, sh:IRI, sh:Literal or the combinations of these: sh:BlankNodeOrIRI, sh:BlankNodeOrLiteral, sh:IRIOrLiteral.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Node kind",
   :rdfs/subClassOf [:rdfs/Resource :sh/NodeKind]})

(def NodeKindConstraintComponent
  "A constraint component that can be used to restrict the RDF node kind of each value node."
  {:db/ident :sh/NodeKindConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to restrict the RDF node kind of each value node.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Node-kind constraint component",
   :sh/parameter :sh/NodeKindConstraintComponent-nodeKind})

(def NodeKindConstraintComponent-nodeKind
  {:db/ident         :sh/NodeKindConstraintComponent-nodeKind,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/in            [:sh/BlankNode
                      :sh/IRI
                      :sh/Literal
                      :sh/BlankNodeOrIRI
                      :sh/BlankNodeOrLiteral
                      :sh/IRIOrLiteral],
   :sh/maxCount      1,
   :sh/path          :sh/nodeKind})

(def NodeShape
  "A node shape is a shape that specifies constraint that need to be met with respect to focus nodes."
  {:db/ident :sh/NodeShape,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A node shape is a shape that specifies constraint that need to be met with respect to focus nodes.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Node shape",
   :rdfs/subClassOf [:sh/Shape :sh/NodeShape :rdfs/Resource]})

(def NotConstraintComponent
  "A constraint component that can be used to verify that value nodes do not conform to a given shape."
  {:db/ident :sh/NotConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to verify that value nodes do not conform to a given shape.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Not constraint component",
   :sh/parameter :sh/NotConstraintComponent-not})

(def NotConstraintComponent-not
  {:db/ident         :sh/NotConstraintComponent-not,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/path          :sh/not})

(def OrConstraintComponent
  "A constraint component that can be used to restrict the value nodes so that they conform to at least one out of several provided shapes."
  {:db/ident :sh/OrConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to restrict the value nodes so that they conform to at least one out of several provided shapes.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Or constraint component",
   :sh/parameter :sh/OrConstraintComponent-or})

(def OrConstraintComponent-or
  {:db/ident         :sh/OrConstraintComponent-or,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/path          :sh/or})

(def Parameter
  "The class of parameter declarations, consisting of a path predicate and (possibly) information about allowed value type, cardinality and other characteristics."
  {:db/ident :sh/Parameter,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The class of parameter declarations, consisting of a path predicate and (possibly) information about allowed value type, cardinality and other characteristics.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Parameter",
   :rdfs/subClassOf [:sh/PropertyShape :sh/Parameter :sh/Shape :rdfs/Resource]})

(def Parameterizable
  "Superclass of components that can take parameters, especially functions and constraint components."
  {:db/ident :sh/Parameterizable,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Superclass of components that can take parameters, especially functions and constraint components.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Parameterizable",
   :rdfs/subClassOf [:rdfs/Resource :sh/Parameterizable]})

(def PatternConstraintComponent
  "A constraint component that can be used to verify that every value node matches a given regular expression."
  {:db/ident :sh/PatternConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to verify that every value node matches a given regular expression.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Pattern constraint component",
   :sh/parameter [:sh/PatternConstraintComponent-flags
                  :sh/PatternConstraintComponent-pattern]})

(def PatternConstraintComponent-flags
  {:db/ident         :sh/PatternConstraintComponent-flags,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/datatype      :xsd/string,
   :sh/optional      true,
   :sh/path          :sh/flags})

(def PatternConstraintComponent-pattern
  {:db/ident         :sh/PatternConstraintComponent-pattern,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/datatype      :xsd/string,
   :sh/path          :sh/pattern})

(def PrefixDeclaration
  "The class of prefix declarations, consisting of pairs of a prefix with a namespace."
  {:db/ident :sh/PrefixDeclaration,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The class of prefix declarations, consisting of pairs of a prefix with a namespace.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Prefix declaration",
   :rdfs/subClassOf [:rdfs/Resource :sh/PrefixDeclaration]})

(def PropertyConstraintComponent
  "A constraint component that can be used to verify that all value nodes conform to the given property shape."
  {:db/ident :sh/PropertyConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to verify that all value nodes conform to the given property shape.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Property constraint component",
   :sh/parameter :sh/PropertyConstraintComponent-property})

(def PropertyConstraintComponent-property
  {:db/ident         :sh/PropertyConstraintComponent-property,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/path          :sh/property})

(def PropertyGroup
  "Instances of this class represent groups of property shapes that belong together."
  {:db/ident :sh/PropertyGroup,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Instances of this class represent groups of property shapes that belong together.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Property group",
   :rdfs/subClassOf [:rdfs/Resource :sh/PropertyGroup]})

(def PropertyShape
  "A property shape is a shape that specifies constraints on the values of a focus node for a given property or path."
  {:db/ident :sh/PropertyShape,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A property shape is a shape that specifies constraints on the values of a focus node for a given property or path.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Property shape",
   :rdfs/subClassOf [:sh/Shape :sh/PropertyShape :rdfs/Resource]})

(def QualifiedMaxCountConstraintComponent
  "A constraint component that can be used to verify that a specified maximum number of value nodes conforms to a given shape."
  {:db/ident :sh/QualifiedMaxCountConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to verify that a specified maximum number of value nodes conforms to a given shape.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Qualified-max-count constraint component",
   :sh/parameter
   [:sh/QualifiedMaxCountConstraintComponent-qualifiedValueShapesDisjoint
    :sh/QualifiedMaxCountConstraintComponent-qualifiedValueShape
    :sh/QualifiedMaxCountConstraintComponent-qualifiedMaxCount]})

(def QualifiedMaxCountConstraintComponent-qualifiedMaxCount
  {:db/ident         :sh/QualifiedMaxCountConstraintComponent-qualifiedMaxCount,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/datatype      :xsd/integer,
   :sh/path          :sh/qualifiedMaxCount})

(def QualifiedMaxCountConstraintComponent-qualifiedValueShape
  {:db/ident :sh/QualifiedMaxCountConstraintComponent-qualifiedValueShape,
   :rdf/type [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/path :sh/qualifiedValueShape})

(def QualifiedMaxCountConstraintComponent-qualifiedValueShapesDisjoint
  {:db/ident
   :sh/QualifiedMaxCountConstraintComponent-qualifiedValueShapesDisjoint,
   :rdf/type [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/datatype :xsd/boolean,
   :sh/optional true,
   :sh/path :sh/qualifiedValueShapesDisjoint})

(def QualifiedMinCountConstraintComponent
  "A constraint component that can be used to verify that a specified minimum number of value nodes conforms to a given shape."
  {:db/ident :sh/QualifiedMinCountConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to verify that a specified minimum number of value nodes conforms to a given shape.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Qualified-min-count constraint component",
   :sh/parameter
   [:sh/QualifiedMinCountConstraintComponent-qualifiedValueShapesDisjoint
    :sh/QualifiedMinCountConstraintComponent-qualifiedValueShape
    :sh/QualifiedMinCountConstraintComponent-qualifiedMinCount]})

(def QualifiedMinCountConstraintComponent-qualifiedMinCount
  {:db/ident         :sh/QualifiedMinCountConstraintComponent-qualifiedMinCount,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/datatype      :xsd/integer,
   :sh/path          :sh/qualifiedMinCount})

(def QualifiedMinCountConstraintComponent-qualifiedValueShape
  {:db/ident :sh/QualifiedMinCountConstraintComponent-qualifiedValueShape,
   :rdf/type [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/path :sh/qualifiedValueShape})

(def QualifiedMinCountConstraintComponent-qualifiedValueShapesDisjoint
  {:db/ident
   :sh/QualifiedMinCountConstraintComponent-qualifiedValueShapesDisjoint,
   :rdf/type [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/datatype :xsd/boolean,
   :sh/optional true,
   :sh/path :sh/qualifiedValueShapesDisjoint})

(def ResultAnnotation
  "A class of result annotations, which define the rules to derive the values of a given annotation property as extra values for a validation result."
  {:db/ident :sh/ResultAnnotation,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A class of result annotations, which define the rules to derive the values of a given annotation property as extra values for a validation result.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Result annotation",
   :rdfs/subClassOf [:rdfs/Resource :sh/ResultAnnotation]})

(def Rule
  "The class of SHACL rules. Never instantiated directly."
  {:db/ident         :sh/Rule,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of SHACL rules. Never instantiated directly.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       "Rule",
   :rdfs/subClassOf  [:rdfs/Resource :sh/Rule]})

(def SPARQLAskExecutable
  "The class of SPARQL executables that are based on an ASK query."
  {:db/ident :sh/SPARQLAskExecutable,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The class of SPARQL executables that are based on an ASK query.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "SPARQL ASK executable",
   :rdfs/subClassOf
   [:sh/SPARQLExecutable :sh/SPARQLAskExecutable :rdfs/Resource]})

(def SPARQLAskValidator
  "The class of validators based on SPARQL ASK queries. The queries are evaluated for each value node and are supposed to return true if the given node conforms."
  {:db/ident :sh/SPARQLAskValidator,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The class of validators based on SPARQL ASK queries. The queries are evaluated for each value node and are supposed to return true if the given node conforms.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "SPARQL ASK validator",
   :rdfs/subClassOf [:sh/SPARQLAskExecutable
                     :sh/Validator
                     :sh/SPARQLAskValidator
                     :sh/SPARQLExecutable
                     :rdfs/Resource]})

(def SPARQLConstraint
  "The class of constraints based on SPARQL SELECT queries."
  {:db/ident         :sh/SPARQLConstraint,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of constraints based on SPARQL SELECT queries.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       "SPARQL constraint",
   :rdfs/subClassOf  [:sh/SPARQLSelectExecutable
                      :sh/SPARQLConstraint
                      :sh/SPARQLExecutable
                      :rdfs/Resource]})

(def SPARQLConstraintComponent
  "A constraint component that can be used to define constraints based on SPARQL queries."
  {:db/ident :sh/SPARQLConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to define constraints based on SPARQL queries.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "SPARQL constraint component",
   :sh/parameter :sh/SPARQLConstraintComponent-sparql})

(def SPARQLConstraintComponent-sparql
  {:db/ident         :sh/SPARQLConstraintComponent-sparql,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/path          :sh/sparql})

(def SPARQLConstructExecutable
  "The class of SPARQL executables that are based on a CONSTRUCT query."
  {:db/ident :sh/SPARQLConstructExecutable,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The class of SPARQL executables that are based on a CONSTRUCT query.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "SPARQL CONSTRUCT executable",
   :rdfs/subClassOf
   [:sh/SPARQLExecutable :sh/SPARQLConstructExecutable :rdfs/Resource]})

(def SPARQLExecutable
  "The class of resources that encapsulate a SPARQL query."
  {:db/ident         :sh/SPARQLExecutable,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of resources that encapsulate a SPARQL query.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       "SPARQL executable",
   :rdfs/subClassOf  [:rdfs/Resource :sh/SPARQLExecutable]})

(def SPARQLFunction
  "A function backed by a SPARQL query - either ASK or SELECT."
  {:db/ident :sh/SPARQLFunction,
   :rdf/type :rdfs/Class,
   :rdfs/comment "A function backed by a SPARQL query - either ASK or SELECT.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "SPARQL function",
   :rdfs/subClassOf [:sh/SPARQLSelectExecutable
                     :sh/SPARQLAskExecutable
                     :sh/Function
                     :sh/SPARQLFunction
                     :sh/SPARQLExecutable
                     :rdfs/Resource
                     :sh/Parameterizable]})

(def SPARQLRule
  "The class of SHACL rules based on SPARQL CONSTRUCT queries."
  {:db/ident :sh/SPARQLRule,
   :rdf/type :rdfs/Class,
   :rdfs/comment "The class of SHACL rules based on SPARQL CONSTRUCT queries.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "SPARQL CONSTRUCT rule",
   :rdfs/subClassOf [:sh/SPARQLConstructExecutable
                     :sh/Rule
                     :sh/SPARQLRule
                     :sh/SPARQLExecutable
                     :rdfs/Resource]})

(def SPARQLSelectExecutable
  "The class of SPARQL executables based on a SELECT query."
  {:db/ident         :sh/SPARQLSelectExecutable,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of SPARQL executables based on a SELECT query.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       "SPARQL SELECT executable",
   :rdfs/subClassOf  [:sh/SPARQLExecutable
                      :sh/SPARQLSelectExecutable
                      :rdfs/Resource]})

(def SPARQLSelectValidator
  "The class of validators based on SPARQL SELECT queries. The queries are evaluated for each focus node and are supposed to produce bindings for all focus nodes that do not conform."
  {:db/ident :sh/SPARQLSelectValidator,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The class of validators based on SPARQL SELECT queries. The queries are evaluated for each focus node and are supposed to produce bindings for all focus nodes that do not conform.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "SPARQL SELECT validator",
   :rdfs/subClassOf [:sh/SPARQLSelectExecutable
                     :sh/Validator
                     :sh/SPARQLSelectValidator
                     :sh/SPARQLExecutable
                     :rdfs/Resource]})

(def SPARQLTarget
  "The class of targets that are based on SPARQL queries."
  {:db/ident         :sh/SPARQLTarget,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of targets that are based on SPARQL queries.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       "SPARQL target",
   :rdfs/subClassOf  [:sh/SPARQLSelectExecutable
                      :sh/SPARQLAskExecutable
                      :sh/Target
                      :sh/SPARQLTarget
                      :sh/SPARQLExecutable
                      :rdfs/Resource]})

(def SPARQLTargetType
  "The (meta) class for parameterizable targets that are based on SPARQL queries."
  {:db/ident :sh/SPARQLTargetType,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The (meta) class for parameterizable targets that are based on SPARQL queries.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "SPARQL target type",
   :rdfs/subClassOf [:sh/SPARQLSelectExecutable
                     :sh/SPARQLAskExecutable
                     :sh/TargetType
                     :sh/SPARQLTargetType
                     :rdfs/Class
                     :sh/SPARQLExecutable
                     :rdfs/Resource
                     :sh/Parameterizable]})

(def SPARQLUpdateExecutable
  "The class of SPARQL executables based on a SPARQL UPDATE."
  {:db/ident :sh/SPARQLUpdateExecutable,
   :rdf/type :rdfs/Class,
   :rdfs/comment "The class of SPARQL executables based on a SPARQL UPDATE.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "SPARQL UPDATE executable",
   :rdfs/subClassOf
   [:sh/SPARQLExecutable :sh/SPARQLUpdateExecutable :rdfs/Resource]})

(def Severity
  "The class of validation result severity levels, including violation and warning levels."
  {:db/ident :sh/Severity,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The class of validation result severity levels, including violation and warning levels.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Severity",
   :rdfs/subClassOf [:rdfs/Resource :sh/Severity]})

(def Shape
  "A shape is a collection of constraints that may be targeted for certain nodes."
  {:db/ident :sh/Shape,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A shape is a collection of constraints that may be targeted for certain nodes.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Shape",
   :rdfs/subClassOf [:rdfs/Resource :sh/Shape]})

(def Target
  "The base class of targets such as those based on SPARQL queries."
  {:db/ident :sh/Target,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The base class of targets such as those based on SPARQL queries.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Target",
   :rdfs/subClassOf [:rdfs/Resource :sh/Target]})

(def TargetType
  "The (meta) class for parameterizable targets. Instances of this are instantiated as values of the sh:target property."
  {:db/ident :sh/TargetType,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The (meta) class for parameterizable targets.\tInstances of this are instantiated as values of the sh:target property.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Target type",
   :rdfs/subClassOf
   [:sh/Parameterizable :rdfs/Class :sh/TargetType :rdfs/Resource]})

(def TripleRule
  "A rule based on triple (subject, predicate, object) pattern."
  {:db/ident :sh/TripleRule,
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "A rule based on triple (subject, predicate, object) pattern.",
   :rdfs/subClassOf [:sh/Rule :sh/TripleRule :rdfs/Resource]})

(def UniqueLangConstraintComponent
  "A constraint component that can be used to specify that no pair of value nodes may use the same language tag."
  {:db/ident :sh/UniqueLangConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to specify that no pair of value nodes may use the same language tag.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Unique-languages constraint component",
   :sh/parameter :sh/UniqueLangConstraintComponent-uniqueLang})

(def UniqueLangConstraintComponent-uniqueLang
  {:db/ident         :sh/UniqueLangConstraintComponent-uniqueLang,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/datatype      :xsd/boolean,
   :sh/maxCount      1,
   :sh/path          :sh/uniqueLang})

(def ValidationReport
  "The class of SHACL validation reports."
  {:db/ident         :sh/ValidationReport,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of SHACL validation reports.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       "Validation report",
   :rdfs/subClassOf  [:rdfs/Resource :sh/ValidationReport]})

(def ValidationResult
  "The class of validation results."
  {:db/ident         :sh/ValidationResult,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of validation results.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       "Validation result",
   :rdfs/subClassOf  [:sh/AbstractResult :sh/ValidationResult :rdfs/Resource]})

(def Validator
  "The class of validators, which provide instructions on how to process a constraint definition. This class serves as base class for the SPARQL-based validators and other possible implementations."
  {:db/ident :sh/Validator,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The class of validators, which provide instructions on how to process a constraint definition. This class serves as base class for the SPARQL-based validators and other possible implementations.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Validator",
   :rdfs/subClassOf [:rdfs/Resource :sh/Validator]})

(def Violation
  "The severity for a violation validation result."
  {:db/ident         :sh/Violation,
   :rdf/type         [:sh/Severity :rdfs/Resource],
   :rdfs/comment     "The severity for a violation validation result.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       "Violation"})

(def Warning
  "The severity for a warning validation result."
  {:db/ident         :sh/Warning,
   :rdf/type         [:sh/Severity :rdfs/Resource],
   :rdfs/comment     "The severity for a warning validation result.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       "Warning"})

(def XoneConstraintComponent
  "A constraint component that can be used to restrict the value nodes so that they conform to exactly one out of several provided shapes."
  {:db/ident :sh/XoneConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   "A constraint component that can be used to restrict the value nodes so that they conform to exactly one out of several provided shapes.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "Exactly one constraint component",
   :sh/parameter :sh/XoneConstraintComponent-xone})

(def XoneConstraintComponent-xone
  {:db/ident         :sh/XoneConstraintComponent-xone,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :sh/Shape :rdfs/Resource],
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :sh/path          :sh/xone})

(def alternativePath
  "The (single) value of this property must be a list of path elements, representing the elements of alternative paths."
  {:db/ident :sh/alternativePath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The (single) value of this property must be a list of path elements, representing the elements of alternative paths.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "alternative path",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sh/alternativePath})

(def and
  "RDF list of shapes to validate the value nodes against."
  {:db/ident :sh/and,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment "RDF list of shapes to validate the value nodes against.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "and",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sh/and})

(def annotationProperty
  "The annotation property that shall be set."
  {:db/ident           :sh/annotationProperty,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The annotation property that shall be set.",
   :rdfs/domain        :sh/ResultAnnotation,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         "annotation property",
   :rdfs/range         :rdf/Property,
   :rdfs/subPropertyOf :sh/annotationProperty})

(def annotationValue
  "The (default) values of the annotation property."
  {:db/ident           :sh/annotationValue,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The (default) values of the annotation property.",
   :rdfs/domain        :sh/ResultAnnotation,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         "annotation value",
   :rdfs/subPropertyOf :sh/annotationValue})

(def annotationVarName
  "The name of the SPARQL variable from the SELECT clause that shall be used for the values."
  {:db/ident :sh/annotationVarName,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The name of the SPARQL variable from the SELECT clause that shall be used for the values.",
   :rdfs/domain :sh/ResultAnnotation,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "annotation variable name",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :sh/annotationVarName})

(def ask
  "The SPARQL ASK query to execute."
  {:db/ident           :sh/ask,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The SPARQL ASK query to execute.",
   :rdfs/domain        :sh/SPARQLAskExecutable,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         "ask",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :sh/ask})

(def class
  "The type that all value nodes must have."
  {:db/ident           :sh/class,
   :rdf/type           [:rdf/Property :rdfs/Resource],
   :rdfs/comment       "The type that all value nodes must have.",
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         "class",
   :rdfs/range         :rdfs/Class,
   :rdfs/subPropertyOf :sh/class})

(def closed
  "If set to true then the shape is closed."
  {:db/ident           :sh/closed,
   :rdf/type           [:rdf/Property :rdfs/Resource],
   :rdfs/comment       "If set to true then the shape is closed.",
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         "closed",
   :rdfs/range         :xsd/boolean,
   :rdfs/subPropertyOf :sh/closed})

(def condition
  "The shapes that the focus nodes need to conform to before a rule is executed on them."
  {:db/ident :sh/condition,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The shapes that the focus nodes need to conform to before a rule is executed on them.",
   :rdfs/domain :sh/Rule,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "condition",
   :rdfs/range :sh/Shape,
   :rdfs/subPropertyOf :sh/condition})

(def conforms
  "True if the validation did not produce any validation results, and false otherwise."
  {:db/ident :sh/conforms,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "True if the validation did not produce any validation results, and false otherwise.",
   :rdfs/domain :sh/ValidationReport,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "conforms",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :sh/conforms})

(def construct
  "The SPARQL CONSTRUCT query to execute."
  {:db/ident           :sh/construct,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The SPARQL CONSTRUCT query to execute.",
   :rdfs/domain        :sh/SPARQLConstructExecutable,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         "construct",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :sh/construct})

(def datatype
  "Specifies an RDF datatype that all value nodes must have."
  {:db/ident :sh/datatype,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment "Specifies an RDF datatype that all value nodes must have.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "datatype",
   :rdfs/range :rdfs/Datatype,
   :rdfs/subPropertyOf :sh/datatype})

(def deactivated
  "If set to true then all nodes conform to this."
  {:db/ident           :sh/deactivated,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "If set to true then all nodes conform to this.",
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         "deactivated",
   :rdfs/range         :xsd/boolean,
   :rdfs/subPropertyOf :sh/deactivated})

(def declare
  "Links a resource with its namespace prefix declarations."
  {:db/ident :sh/declare,
   :rdf/type :rdf/Property,
   :rdfs/comment "Links a resource with its namespace prefix declarations.",
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "declare",
   :rdfs/range :sh/PrefixDeclaration,
   :rdfs/subPropertyOf :sh/declare})

(def defaultValue
  "A default value for a property, for example for user interface tools to pre-populate input fields."
  {:db/ident :sh/defaultValue,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A default value for a property, for example for user interface tools to pre-populate input fields.",
   :rdfs/domain :sh/PropertyShape,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "default value",
   :rdfs/subPropertyOf :sh/defaultValue})

(def description
  "Human-readable descriptions for the property in the context of the surrounding shape."
  {:db/ident :sh/description,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Human-readable descriptions for the property in the context of the surrounding shape.",
   :rdfs/domain :sh/PropertyShape,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "description",
   :rdfs/subPropertyOf :sh/description})

(def detail
  "Links a result with other results that provide more details, for example to describe violations against nested shapes."
  {:db/ident :sh/detail,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Links a result with other results that provide more details, for example to describe violations against nested shapes.",
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "detail",
   :rdfs/range :sh/AbstractResult,
   :rdfs/subPropertyOf :sh/detail})

(def disjoint
  "Specifies a property where the set of values must be disjoint with the value nodes."
  {:db/ident :sh/disjoint,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   "Specifies a property where the set of values must be disjoint with the value nodes.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "disjoint",
   :rdfs/range :rdf/Property,
   :rdfs/subPropertyOf :sh/disjoint})

(def entailment
  "An entailment regime that indicates what kind of inferencing is required by a shapes graph."
  {:db/ident :sh/entailment,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An entailment regime that indicates what kind of inferencing is required by a shapes graph.",
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "entailment",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sh/entailment})

(def equals
  "Specifies a property that must have the same values as the value nodes."
  {:db/ident :sh/equals,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   "Specifies a property that must have the same values as the value nodes.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "equals",
   :rdfs/range :rdf/Property,
   :rdfs/subPropertyOf :sh/equals})

(def expression
  "The node expression that must return true for the value nodes."
  {:db/ident :sh/expression,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   "The node expression that must return true for the value nodes.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "expression",
   :rdfs/subPropertyOf :sh/expression})

(def filterShape
  "The shape that all input nodes of the expression need to conform to."
  {:db/ident :sh/filterShape,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The shape that all input nodes of the expression need to conform to.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "filter shape",
   :rdfs/range :sh/Shape,
   :rdfs/subPropertyOf :sh/filterShape})

(def flags
  "An optional flag to be used with regular expression pattern matching."
  {:db/ident :sh/flags,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   "An optional flag to be used with regular expression pattern matching.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "flags",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :sh/flags})

(def focusNode
  "The focus node that was validated when the result was produced."
  {:db/ident :sh/focusNode,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The focus node that was validated when the result was produced.",
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "focus node",
   :rdfs/subPropertyOf :sh/focusNode})

(def group
  "Can be used to link to a property group to indicate that a property shape belongs to a group of related property shapes."
  {:db/ident :sh/group,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Can be used to link to a property group to indicate that a property shape belongs to a group of related property shapes.",
   :rdfs/domain :sh/PropertyShape,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "group",
   :rdfs/range :sh/PropertyGroup,
   :rdfs/subPropertyOf :sh/group})

(def hasValue
  "Specifies a value that must be among the value nodes."
  {:db/ident           :sh/hasValue,
   :rdf/type           [:rdf/Property :rdfs/Resource],
   :rdfs/comment       "Specifies a value that must be among the value nodes.",
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         "has value",
   :rdfs/subPropertyOf :sh/hasValue})

(def ignoredProperties
  "An optional RDF list of properties that are also permitted in addition to those explicitly enumerated via sh:property/sh:path."
  {:db/ident :sh/ignoredProperties,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   "An optional RDF list of properties that are also permitted in addition to those explicitly enumerated via sh:property/sh:path.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "ignored properties",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sh/ignoredProperties})

(def in
  "Specifies a list of allowed values so that each value node must be among the members of the given list."
  {:db/ident :sh/in,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   "Specifies a list of allowed values so that each value node must be among the members of the given list.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "in",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sh/in})

(def intersection
  "A list of node expressions that shall be intersected."
  {:db/ident           :sh/intersection,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A list of node expressions that shall be intersected.",
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         "intersection",
   :rdfs/subPropertyOf :sh/intersection})

(def inversePath
  "The (single) value of this property represents an inverse path (object to subject)."
  {:db/ident :sh/inversePath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The (single) value of this property represents an inverse path (object to subject).",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "inverse path",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sh/inversePath})

(def js
  "Constraints expressed in JavaScript."
  {:db/ident           :sh/js,
   :rdf/type           [:rdf/Property :rdfs/Resource],
   :rdfs/comment       "Constraints expressed in JavaScript.",
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         "JavaScript constraint",
   :rdfs/range         :sh/JSConstraint,
   :rdfs/subPropertyOf :sh/js})

(def jsFunctionName
  "The name of the JavaScript function to execute."
  {:db/ident           :sh/jsFunctionName,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The name of the JavaScript function to execute.",
   :rdfs/domain        :sh/JSExecutable,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         "JavaScript function name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :sh/jsFunctionName})

(def jsLibrary
  "Declares which JavaScript libraries are needed to execute this."
  {:db/ident :sh/jsLibrary,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Declares which JavaScript libraries are needed to execute this.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "JavaScript library",
   :rdfs/range :sh/JSLibrary,
   :rdfs/subPropertyOf :sh/jsLibrary})

(def jsLibraryURL
  "Declares the URLs of a JavaScript library. This should be the absolute URL of a JavaScript file. Implementations may redirect those to local files."
  {:db/ident :sh/jsLibraryURL,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Declares the URLs of a JavaScript library. This should be the absolute URL of a JavaScript file. Implementations may redirect those to local files.",
   :rdfs/domain :sh/JSLibrary,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "JavaScript library URL",
   :rdfs/range :xsd/anyURI,
   :rdfs/subPropertyOf :sh/jsLibraryURL})

(def labelTemplate
  "Outlines how human-readable labels of instances of the associated Parameterizable shall be produced. The values can contain {?paramName} as placeholders for the actual values of the given parameter."
  {:db/ident :sh/labelTemplate,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Outlines how human-readable labels of instances of the associated Parameterizable shall be produced. The values can contain {?paramName} as placeholders for the actual values of the given parameter.",
   :rdfs/domain :sh/Parameterizable,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "label template",
   :rdfs/subPropertyOf :sh/labelTemplate})

(def languageIn
  "Specifies a list of language tags that all value nodes must have."
  {:db/ident :sh/languageIn,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   "Specifies a list of language tags that all value nodes must have.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "language in",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sh/languageIn})

(def lessThan
  "Specifies a property that must have smaller values than the value nodes."
  {:db/ident :sh/lessThan,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   "Specifies a property that must have smaller values than the value nodes.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "less than",
   :rdfs/range :rdf/Property,
   :rdfs/subPropertyOf :sh/lessThan})

(def lessThanOrEquals
  "Specifies a property that must have smaller or equal values than the value nodes."
  {:db/ident :sh/lessThanOrEquals,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   "Specifies a property that must have smaller or equal values than the value nodes.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "less than or equals",
   :rdfs/range :rdf/Property,
   :rdfs/subPropertyOf :sh/lessThanOrEquals})

(def maxCount
  "Specifies the maximum number of values in the set of value nodes."
  {:db/ident :sh/maxCount,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   "Specifies the maximum number of values in the set of value nodes.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "max count",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :sh/maxCount})

(def maxExclusive
  "Specifies the maximum exclusive value of each value node."
  {:db/ident :sh/maxExclusive,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment "Specifies the maximum exclusive value of each value node.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "max exclusive",
   :rdfs/subPropertyOf :sh/maxExclusive})

(def maxInclusive
  "Specifies the maximum inclusive value of each value node."
  {:db/ident :sh/maxInclusive,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment "Specifies the maximum inclusive value of each value node.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "max inclusive",
   :rdfs/subPropertyOf :sh/maxInclusive})

(def maxLength
  "Specifies the maximum string length of each value node."
  {:db/ident :sh/maxLength,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment "Specifies the maximum string length of each value node.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "max length",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :sh/maxLength})

(def message
  "A human-readable message (possibly with placeholders for variables) explaining the cause of the result."
  {:db/ident :sh/message,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A human-readable message (possibly with placeholders for variables) explaining the cause of the result.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "message",
   :rdfs/subPropertyOf :sh/message})

(def minCount
  "Specifies the minimum number of values in the set of value nodes."
  {:db/ident :sh/minCount,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   "Specifies the minimum number of values in the set of value nodes.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "min count",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :sh/minCount})

(def minExclusive
  "Specifies the minimum exclusive value of each value node."
  {:db/ident :sh/minExclusive,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment "Specifies the minimum exclusive value of each value node.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "min exclusive",
   :rdfs/subPropertyOf :sh/minExclusive})

(def minInclusive
  "Specifies the minimum inclusive value of each value node."
  {:db/ident :sh/minInclusive,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment "Specifies the minimum inclusive value of each value node.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "min inclusive",
   :rdfs/subPropertyOf :sh/minInclusive})

(def minLength
  "Specifies the minimum string length of each value node."
  {:db/ident :sh/minLength,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment "Specifies the minimum string length of each value node.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "min length",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :sh/minLength})

(def name
  "Human-readable labels for the property in the context of the surrounding shape."
  {:db/ident :sh/name,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Human-readable labels for the property in the context of the surrounding shape.",
   :rdfs/domain :sh/PropertyShape,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "name",
   :rdfs/subPropertyOf :sh/name})

(def namespace
  "The namespace associated with a prefix in a prefix declaration."
  {:db/ident :sh/namespace,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The namespace associated with a prefix in a prefix declaration.",
   :rdfs/domain :sh/PrefixDeclaration,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "namespace",
   :rdfs/range :xsd/anyURI,
   :rdfs/subPropertyOf :sh/namespace})

(def node
  "Specifies the node shape that all value nodes must conform to."
  {:db/ident :sh/node,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   "Specifies the node shape that all value nodes must conform to.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "node",
   :rdfs/range :sh/NodeShape,
   :rdfs/subPropertyOf :sh/node})

(def nodeKind
  "Specifies the node kind (e.g. IRI or literal) each value node."
  {:db/ident :sh/nodeKind,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   "Specifies the node kind (e.g. IRI or literal) each value node.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "node kind",
   :rdfs/range :sh/NodeKind,
   :rdfs/subPropertyOf :sh/nodeKind})

(def nodeValidator
  "The validator(s) used to evaluate a constraint in the context of a node shape."
  {:db/ident :sh/nodeValidator,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The validator(s) used to evaluate a constraint in the context of a node shape.",
   :rdfs/domain :sh/ConstraintComponent,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "shape validator",
   :rdfs/range :sh/Validator,
   :rdfs/subPropertyOf :sh/nodeValidator})

(def nodes
  "The node expression producing the input nodes of a filter shape expression."
  {:db/ident :sh/nodes,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The node expression producing the input nodes of a filter shape expression.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "nodes",
   :rdfs/subPropertyOf :sh/nodes})

(def not
  "Specifies a shape that the value nodes must not conform to."
  {:db/ident :sh/not,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment "Specifies a shape that the value nodes must not conform to.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "not",
   :rdfs/range :sh/Shape,
   :rdfs/subPropertyOf :sh/not})

(def object
  "An expression producing the nodes that shall be inferred as objects."
  {:db/ident :sh/object,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An expression producing the nodes that shall be inferred as objects.",
   :rdfs/domain :sh/TripleRule,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "object",
   :rdfs/subPropertyOf :sh/object})

(def oneOrMorePath
  "The (single) value of this property represents a path that is matched one or more times."
  {:db/ident :sh/oneOrMorePath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The (single) value of this property represents a path that is matched one or more times.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "one or more path",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sh/oneOrMorePath})

(def optional
  "Indicates whether a parameter is optional."
  {:db/ident           :sh/optional,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Indicates whether a parameter is optional.",
   :rdfs/domain        :sh/Parameter,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         "optional",
   :rdfs/range         :xsd/boolean,
   :rdfs/subPropertyOf :sh/optional})

(def or
  "Specifies a list of shapes so that the value nodes must conform to at least one of the shapes."
  {:db/ident :sh/or,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   "Specifies a list of shapes so that the value nodes must conform to at least one of the shapes.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "or",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sh/or})

(def order
  "Specifies the relative order of this compared to its siblings. For example use 0 for the first, 1 for the second."
  {:db/ident :sh/order,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Specifies the relative order of this compared to its siblings. For example use 0 for the first, 1 for the second.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "order",
   :rdfs/subPropertyOf :sh/order})

(def parameter
  "The parameters of a function or constraint component."
  {:db/ident           :sh/parameter,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The parameters of a function or constraint component.",
   :rdfs/domain        :sh/Parameterizable,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         "parameter",
   :rdfs/range         :sh/Parameter,
   :rdfs/subPropertyOf :sh/parameter})

(def path
  "Specifies the property path of a property shape."
  {:db/ident           :sh/path,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Specifies the property path of a property shape.",
   :rdfs/domain        :sh/PropertyShape,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         "path",
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :sh/path})

(def pattern
  "Specifies a regular expression pattern that the string representations of the value nodes must match."
  {:db/ident :sh/pattern,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   "Specifies a regular expression pattern that the string representations of the value nodes must match.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "pattern",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :sh/pattern})

(def predicate
  "An expression producing the properties that shall be inferred as predicates."
  {:db/ident :sh/predicate,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An expression producing the properties that shall be inferred as predicates.",
   :rdfs/domain :sh/TripleRule,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "predicate",
   :rdfs/subPropertyOf :sh/predicate})

(def prefix
  "The prefix of a prefix declaration."
  {:db/ident           :sh/prefix,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The prefix of a prefix declaration.",
   :rdfs/domain        :sh/PrefixDeclaration,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         "prefix",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :sh/prefix})

(def prefixes
  "The prefixes that shall be applied before parsing the associated SPARQL query."
  {:db/ident :sh/prefixes,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The prefixes that shall be applied before parsing the associated SPARQL query.",
   :rdfs/domain :sh/SPARQLExecutable,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "prefixes",
   :rdfs/range :owl/Ontology,
   :rdfs/subPropertyOf :sh/prefixes})

(def property
  "Links a shape to its property shapes."
  {:db/ident           :sh/property,
   :rdf/type           [:rdf/Property :rdfs/Resource],
   :rdfs/comment       "Links a shape to its property shapes.",
   :rdfs/domain        :sh/Shape,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         "property",
   :rdfs/range         :sh/PropertyShape,
   :rdfs/subPropertyOf :sh/property})

(def propertyValidator
  "The validator(s) used to evaluate a constraint in the context of a property shape."
  {:db/ident :sh/propertyValidator,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The validator(s) used to evaluate a constraint in the context of a property shape.",
   :rdfs/domain :sh/ConstraintComponent,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "property validator",
   :rdfs/range :sh/Validator,
   :rdfs/subPropertyOf :sh/propertyValidator})

(def qualifiedMaxCount
  "The maximum number of value nodes that can conform to the shape."
  {:db/ident :sh/qualifiedMaxCount,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   "The maximum number of value nodes that can conform to the shape.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "qualified max count",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :sh/qualifiedMaxCount})

(def qualifiedMinCount
  "The minimum number of value nodes that must conform to the shape."
  {:db/ident :sh/qualifiedMinCount,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   "The minimum number of value nodes that must conform to the shape.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "qualified min count",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :sh/qualifiedMinCount})

(def qualifiedValueShape
  "The shape that a specified number of values must conform to."
  {:db/ident :sh/qualifiedValueShape,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment "The shape that a specified number of values must conform to.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "qualified value shape",
   :rdfs/range :sh/Shape,
   :rdfs/subPropertyOf :sh/qualifiedValueShape})

(def qualifiedValueShapesDisjoint
  "Can be used to mark the qualified value shape to be disjoint with its sibling shapes."
  {:db/ident :sh/qualifiedValueShapesDisjoint,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   "Can be used to mark the qualified value shape to be disjoint with its sibling shapes.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "qualified value shapes disjoint",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :sh/qualifiedValueShapesDisjoint})

(def result
  "The validation results contained in a validation report."
  {:db/ident :sh/result,
   :rdf/type :rdf/Property,
   :rdfs/comment "The validation results contained in a validation report.",
   :rdfs/domain :sh/ValidationReport,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "result",
   :rdfs/range :sh/ValidationResult,
   :rdfs/subPropertyOf :sh/result})

(def resultAnnotation
  "Links a SPARQL validator with zero or more sh:ResultAnnotation instances, defining how to derive additional result properties based on the variables of the SELECT query."
  {:db/ident :sh/resultAnnotation,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Links a SPARQL validator with zero or more sh:ResultAnnotation instances, defining how to derive additional result properties based on the variables of the SELECT query.",
   :rdfs/domain :sh/SPARQLSelectValidator,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "result annotation",
   :rdfs/range :sh/ResultAnnotation,
   :rdfs/subPropertyOf :sh/resultAnnotation})

(def resultMessage
  "Human-readable messages explaining the cause of the result."
  {:db/ident :sh/resultMessage,
   :rdf/type :rdf/Property,
   :rdfs/comment "Human-readable messages explaining the cause of the result.",
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "result message",
   :rdfs/subPropertyOf :sh/resultMessage})

(def resultPath
  "The path of a validation result, based on the path of the validated property shape."
  {:db/ident :sh/resultPath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The path of a validation result, based on the path of the validated property shape.",
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "result path",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sh/resultPath})

(def resultSeverity
  "The severity of the result, e.g. warning."
  {:db/ident           :sh/resultSeverity,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The severity of the result, e.g. warning.",
   :rdfs/domain        :sh/AbstractResult,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         "result severity",
   :rdfs/range         :sh/Severity,
   :rdfs/subPropertyOf :sh/resultSeverity})

(def returnType
  "The expected type of values returned by the associated function."
  {:db/ident :sh/returnType,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The expected type of values returned by the associated function.",
   :rdfs/domain :sh/Function,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "return type",
   :rdfs/range :rdfs/Class,
   :rdfs/subPropertyOf :sh/returnType})

(def rule
  "The rules linked to a shape."
  {:db/ident           :sh/rule,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The rules linked to a shape.",
   :rdfs/domain        :sh/Shape,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         "rule",
   :rdfs/range         :sh/Rule,
   :rdfs/subPropertyOf :sh/rule})

(def select
  "The SPARQL SELECT query to execute."
  {:db/ident           :sh/select,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The SPARQL SELECT query to execute.",
   :rdfs/domain        :sh/SPARQLSelectExecutable,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         "select",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :sh/select})

(def severity
  "Defines the severity that validation results produced by a shape must have. Defaults to sh:Violation."
  {:db/ident :sh/severity,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Defines the severity that validation results produced by a shape must have. Defaults to sh:Violation.",
   :rdfs/domain :sh/Shape,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "severity",
   :rdfs/range :sh/Severity,
   :rdfs/subPropertyOf :sh/severity})

(def shapesGraph
  "Shapes graphs that should be used when validating this data graph."
  {:db/ident :sh/shapesGraph,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Shapes graphs that should be used when validating this data graph.",
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "shapes graph",
   :rdfs/range :owl/Ontology,
   :rdfs/subPropertyOf :sh/shapesGraph})

(def shapesGraphWellFormed
  "If true then the validation engine was certain that the shapes graph has passed all SHACL syntax requirements during the validation process."
  {:db/ident :sh/shapesGraphWellFormed,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "If true then the validation engine was certain that the shapes graph has passed all SHACL syntax requirements during the validation process.",
   :rdfs/domain :sh/ValidationReport,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "shapes graph well-formed",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :sh/shapesGraphWellFormed})

(def sourceConstraint
  "The constraint that was validated when the result was produced."
  {:db/ident :sh/sourceConstraint,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The constraint that was validated when the result was produced.",
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "source constraint",
   :rdfs/subPropertyOf :sh/sourceConstraint})

(def sourceConstraintComponent
  "The constraint component that is the source of the result."
  {:db/ident :sh/sourceConstraintComponent,
   :rdf/type :rdf/Property,
   :rdfs/comment "The constraint component that is the source of the result.",
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "source constraint component",
   :rdfs/range :sh/ConstraintComponent,
   :rdfs/subPropertyOf :sh/sourceConstraintComponent})

(def sourceShape
  "The shape that is was validated when the result was produced."
  {:db/ident :sh/sourceShape,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The shape that is was validated when the result was produced.",
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "source shape",
   :rdfs/range :sh/Shape,
   :rdfs/subPropertyOf :sh/sourceShape})

(def sparql
  "Links a shape with SPARQL constraints."
  {:db/ident           :sh/sparql,
   :rdf/type           [:rdf/Property :rdfs/Resource],
   :rdfs/comment       "Links a shape with SPARQL constraints.",
   :rdfs/domain        :sh/Shape,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         "constraint (in SPARQL)",
   :rdfs/range         :sh/SPARQLConstraint,
   :rdfs/subPropertyOf :sh/sparql})

(def subject
  "An expression producing the resources that shall be inferred as subjects."
  {:db/ident :sh/subject,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An expression producing the resources that shall be inferred as subjects.",
   :rdfs/domain :sh/TripleRule,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "subject",
   :rdfs/subPropertyOf :sh/subject})

(def suggestedShapesGraph
  "Suggested shapes graphs for this ontology. The values of this property may be used in the absence of specific sh:shapesGraph statements."
  {:db/ident :sh/suggestedShapesGraph,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Suggested shapes graphs for this ontology. The values of this property may be used in the absence of specific sh:shapesGraph statements.",
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "suggested shapes graph",
   :rdfs/range :owl/Ontology,
   :rdfs/subPropertyOf :sh/suggestedShapesGraph})

(def target
  "Links a shape to a target specified by an extension language, for example instances of sh:SPARQLTarget."
  {:db/ident :sh/target,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Links a shape to a target specified by an extension language, for example instances of sh:SPARQLTarget.",
   :rdfs/domain :sh/Shape,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "target",
   :rdfs/range :sh/Target,
   :rdfs/subPropertyOf :sh/target})

(def targetClass
  "Links a shape to a class, indicating that all instances of the class must conform to the shape."
  {:db/ident :sh/targetClass,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Links a shape to a class, indicating that all instances of the class must conform to the shape.",
   :rdfs/domain :sh/Shape,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "target class",
   :rdfs/range :rdfs/Class,
   :rdfs/subPropertyOf :sh/targetClass})

(def targetNode
  "Links a shape to individual nodes, indicating that these nodes must conform to the shape."
  {:db/ident :sh/targetNode,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Links a shape to individual nodes, indicating that these nodes must conform to the shape.",
   :rdfs/domain :sh/Shape,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "target node",
   :rdfs/subPropertyOf :sh/targetNode})

(def targetObjectsOf
  "Links a shape to a property, indicating that all all objects of triples that have the given property as their predicate must conform to the shape."
  {:db/ident :sh/targetObjectsOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Links a shape to a property, indicating that all all objects of triples that have the given property as their predicate must conform to the shape.",
   :rdfs/domain :sh/Shape,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "target objects of",
   :rdfs/range :rdf/Property,
   :rdfs/subPropertyOf :sh/targetObjectsOf})

(def targetSubjectsOf
  "Links a shape to a property, indicating that all subjects of triples that have the given property as their predicate must conform to the shape."
  {:db/ident :sh/targetSubjectsOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Links a shape to a property, indicating that all subjects of triples that have the given property as their predicate must conform to the shape.",
   :rdfs/domain :sh/Shape,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "target subjects of",
   :rdfs/range :rdf/Property,
   :rdfs/subPropertyOf :sh/targetSubjectsOf})

(def this
  "A node expression that represents the current focus node."
  {:db/ident :sh/this,
   :rdf/type :rdfs/Resource,
   :rdfs/comment "A node expression that represents the current focus node.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "this"})

(def union
  "A list of node expressions that shall be used together."
  {:db/ident :sh/union,
   :rdf/type :rdf/Property,
   :rdfs/comment "A list of node expressions that shall be used together.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "union",
   :rdfs/subPropertyOf :sh/union})

(def uniqueLang
  "Specifies whether all node values must have a unique (or no) language tag."
  {:db/ident :sh/uniqueLang,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   "Specifies whether all node values must have a unique (or no) language tag.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "unique languages",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :sh/uniqueLang})

(def update
  "The SPARQL UPDATE to execute."
  {:db/ident           :sh/update,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The SPARQL UPDATE to execute.",
   :rdfs/domain        :sh/SPARQLUpdateExecutable,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         "update",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :sh/update})

(def validator
  "The validator(s) used to evaluate constraints of either node or property shapes."
  {:db/ident :sh/validator,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The validator(s) used to evaluate constraints of either node or property shapes.",
   :rdfs/domain :sh/ConstraintComponent,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "validator",
   :rdfs/range :sh/Validator,
   :rdfs/subPropertyOf :sh/validator})

(def value
  "An RDF node that has caused the result."
  {:db/ident           :sh/value,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "An RDF node that has caused the result.",
   :rdfs/domain        :sh/AbstractResult,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         "value",
   :rdfs/subPropertyOf :sh/value})

(def xone
  "Specifies a list of shapes so that the value nodes must conform to exactly one of the shapes."
  {:db/ident :sh/xone,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   "Specifies a list of shapes so that the value nodes must conform to exactly one of the shapes.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "exactly one",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sh/xone})

(def zeroOrMorePath
  "The (single) value of this property represents a path that is matched zero or more times."
  {:db/ident :sh/zeroOrMorePath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The (single) value of this property represents a path that is matched zero or more times.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "zero or more path",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sh/zeroOrMorePath})

(def zeroOrOnePath
  "The (single) value of this property represents a path that is matched zero or one times."
  {:db/ident :sh/zeroOrOnePath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The (single) value of this property represents a path that is matched zero or one times.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label "zero or one path",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sh/zeroOrOnePath})