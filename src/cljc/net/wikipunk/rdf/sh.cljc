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
   #voc/lstr
    "The base class of validation results, typically not instantiated directly.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Abstract result@en",
   :rdfs/subClassOf [:rdfs/Resource :sh/AbstractResult]})

(def AndConstraintComponent
  "A constraint component that can be used to test whether a value node conforms to all members of a provided list of shapes."
  {:db/ident :sh/AndConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "A constraint component that can be used to test whether a value node conforms to all members of a provided list of shapes.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "And constraint component@en",
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
   :rdfs/comment     #voc/lstr "The node kind of all blank nodes.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       #voc/lstr "Blank node@en"})

(def BlankNodeOrIRI
  "The node kind of all blank nodes or IRIs."
  {:db/ident         :sh/BlankNodeOrIRI,
   :rdf/type         [:sh/NodeKind :rdfs/Resource],
   :rdfs/comment     #voc/lstr "The node kind of all blank nodes or IRIs.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       #voc/lstr "Blank node or IRI@en"})

(def BlankNodeOrLiteral
  "The node kind of all blank nodes or literals."
  {:db/ident         :sh/BlankNodeOrLiteral,
   :rdf/type         [:sh/NodeKind :rdfs/Resource],
   :rdfs/comment     #voc/lstr
                      "The node kind of all blank nodes or literals.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       #voc/lstr "Blank node or literal@en"})

(def ClassConstraintComponent
  "A constraint component that can be used to verify that each value node is an instance of a given type."
  {:db/ident :sh/ClassConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "A constraint component that can be used to verify that each value node is an instance of a given type.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Class constraint component@en",
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
   #voc/lstr
    "A constraint component that can be used to indicate that focus nodes must only have values for those properties that have been explicitly enumerated via sh:property/sh:path.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Closed constraint component@en",
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
   :rdfs/comment     #voc/lstr "The class of constraint components.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       #voc/lstr "Constraint component@en",
   :rdfs/subClassOf  [:sh/Parameterizable
                      :sh/ConstraintComponent
                      :rdfs/Resource]})

(def DatatypeConstraintComponent
  "A constraint component that can be used to restrict the datatype of all value nodes."
  {:db/ident :sh/DatatypeConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "A constraint component that can be used to restrict the datatype of all value nodes.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Datatype constraint component@en",
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
   #voc/lstr
    "A constraint component that can be used to verify that the set of value nodes is disjoint with the the set of nodes that have the focus node as subject and the value of a given property as predicate.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Disjoint constraint component@en",
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
   #voc/lstr
    "A constraint component that can be used to verify that the set of value nodes is equal to the set of nodes that have the focus node as subject and the value of a given property as predicate.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Equals constraint component@en",
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
   #voc/lstr
    "A constraint component that can be used to verify that a given node expression produces true for all value nodes.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Expression constraint component@en",
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
   :rdfs/comment     #voc/lstr "The class of SHACL functions.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       #voc/lstr "Function@en",
   :rdfs/subClassOf  [:sh/Parameterizable :sh/Function :rdfs/Resource]})

(def HasValueConstraintComponent
  "A constraint component that can be used to verify that one of the value nodes is a given RDF node."
  {:db/ident :sh/HasValueConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "A constraint component that can be used to verify that one of the value nodes is a given RDF node.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Has-value constraint component@en",
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
   :rdfs/comment     #voc/lstr "The node kind of all IRIs.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       #voc/lstr "IRI@en"})

(def IRIOrLiteral
  "The node kind of all IRIs or literals."
  {:db/ident         :sh/IRIOrLiteral,
   :rdf/type         [:sh/NodeKind :rdfs/Resource],
   :rdfs/comment     #voc/lstr "The node kind of all IRIs or literals.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       #voc/lstr "IRI or literal@en"})

(def InConstraintComponent
  "A constraint component that can be used to exclusively enumerate the permitted value nodes."
  {:db/ident :sh/InConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "A constraint component that can be used to exclusively enumerate the permitted value nodes.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "In constraint component@en",
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
   :rdfs/comment     #voc/lstr
                      "The severity for an informational validation result.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       #voc/lstr "Info@en"})

(def JSConstraint
  "The class of constraints backed by a JavaScript function."
  {:db/ident :sh/JSConstraint,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr "The class of constraints backed by a JavaScript function.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "JavaScript-based constraint@en",
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
   #voc/lstr
    "A constraint component with the parameter sh:js linking to a sh:JSConstraint containing a sh:script.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "JavaScript constraint component@en",
   :sh/parameter :sh/JSConstraint-js})

(def JSExecutable
  "Abstract base class of resources that declare an executable JavaScript."
  {:db/ident :sh/JSExecutable,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "Abstract base class of resources that declare an executable JavaScript.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "JavaScript executable@en",
   :rdfs/subClassOf [:rdfs/Resource :sh/JSExecutable]})

(def JSFunction
  "The class of SHACL functions that execute a JavaScript function when called."
  {:db/ident :sh/JSFunction,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "The class of SHACL functions that execute a JavaScript function when called.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "JavaScript function@en",
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
   #voc/lstr
    "Represents a JavaScript library, typically identified by one or more URLs of files to include.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "JavaScript library@en",
   :rdfs/subClassOf [:rdfs/Resource :sh/JSLibrary]})

(def JSRule
  "The class of SHACL rules expressed using JavaScript."
  {:db/ident         :sh/JSRule,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #voc/lstr
                      "The class of SHACL rules expressed using JavaScript.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       #voc/lstr "JavaScript rule@en",
   :rdfs/subClassOf  [:sh/Rule :sh/JSExecutable :sh/JSRule :rdfs/Resource]})

(def JSTarget
  "The class of targets that are based on JavaScript functions."
  {:db/ident :sh/JSTarget,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr "The class of targets that are based on JavaScript functions.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "JavaScript target@en",
   :rdfs/subClassOf [:sh/JSExecutable :sh/Target :sh/JSTarget :rdfs/Resource]})

(def JSTargetType
  "The (meta) class for parameterizable targets that are based on JavaScript functions."
  {:db/ident :sh/JSTargetType,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "The (meta) class for parameterizable targets that are based on JavaScript functions.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "JavaScript target type@en",
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
   #voc/lstr
    "A SHACL validator based on JavaScript. This can be used to declare SHACL constraint components that perform JavaScript-based validation when used.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "JavaScript validator@en",
   :rdfs/subClassOf
   [:sh/Validator :sh/JSExecutable :sh/JSValidator :rdfs/Resource]})

(def LanguageInConstraintComponent
  "A constraint component that can be used to enumerate language tags that all value nodes must have."
  {:db/ident :sh/LanguageInConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "A constraint component that can be used to enumerate language tags that all value nodes must have.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Language-in constraint component@en",
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
   #voc/lstr
    "A constraint component that can be used to verify that each value node is smaller than all the nodes that have the focus node as subject and the value of a given property as predicate.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Less-than constraint component@en",
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
   #voc/lstr
    "A constraint component that can be used to verify that every value node is smaller than all the nodes that have the focus node as subject and the value of a given property as predicate.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "less-than-or-equals constraint component@en",
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
   :rdfs/comment     #voc/lstr "The node kind of all literals.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       #voc/lstr "Literal@en"})

(def MaxCountConstraintComponent
  "A constraint component that can be used to restrict the maximum number of value nodes."
  {:db/ident :sh/MaxCountConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "A constraint component that can be used to restrict the maximum number of value nodes.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Max-count constraint component@en",
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
   #voc/lstr
    "A constraint component that can be used to restrict the range of value nodes with a maximum exclusive value.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Max-exclusive constraint component@en",
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
   #voc/lstr
    "A constraint component that can be used to restrict the range of value nodes with a maximum inclusive value.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Max-inclusive constraint component@en",
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
   #voc/lstr
    "A constraint component that can be used to restrict the maximum string length of value nodes.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Max-length constraint component@en",
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
   #voc/lstr
    "A constraint component that can be used to restrict the minimum number of value nodes.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Min-count constraint component@en",
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
   #voc/lstr
    "A constraint component that can be used to restrict the range of value nodes with a minimum exclusive value.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Min-exclusive constraint component@en",
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
   #voc/lstr
    "A constraint component that can be used to restrict the range of value nodes with a minimum inclusive value.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Min-inclusive constraint component@en",
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
   #voc/lstr
    "A constraint component that can be used to restrict the minimum string length of value nodes.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Min-length constraint component@en",
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
   #voc/lstr
    "A constraint component that can be used to verify that all value nodes conform to the given node shape.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Node constraint component@en",
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
   #voc/lstr
    "The class of all node kinds, including sh:BlankNode, sh:IRI, sh:Literal or the combinations of these: sh:BlankNodeOrIRI, sh:BlankNodeOrLiteral, sh:IRIOrLiteral.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Node kind@en",
   :rdfs/subClassOf [:rdfs/Resource :sh/NodeKind]})

(def NodeKindConstraintComponent
  "A constraint component that can be used to restrict the RDF node kind of each value node."
  {:db/ident :sh/NodeKindConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "A constraint component that can be used to restrict the RDF node kind of each value node.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Node-kind constraint component@en",
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
   #voc/lstr
    "A node shape is a shape that specifies constraint that need to be met with respect to focus nodes.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Node shape@en",
   :rdfs/subClassOf [:sh/Shape :sh/NodeShape :rdfs/Resource]})

(def NotConstraintComponent
  "A constraint component that can be used to verify that value nodes do not conform to a given shape."
  {:db/ident :sh/NotConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "A constraint component that can be used to verify that value nodes do not conform to a given shape.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Not constraint component@en",
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
   #voc/lstr
    "A constraint component that can be used to restrict the value nodes so that they conform to at least one out of several provided shapes.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Or constraint component@en",
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
   #voc/lstr
    "The class of parameter declarations, consisting of a path predicate and (possibly) information about allowed value type, cardinality and other characteristics.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Parameter@en",
   :rdfs/subClassOf [:sh/PropertyShape :sh/Parameter :sh/Shape :rdfs/Resource]})

(def Parameterizable
  "Superclass of components that can take parameters, especially functions and constraint components."
  {:db/ident :sh/Parameterizable,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "Superclass of components that can take parameters, especially functions and constraint components.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Parameterizable@en",
   :rdfs/subClassOf [:rdfs/Resource :sh/Parameterizable]})

(def PatternConstraintComponent
  "A constraint component that can be used to verify that every value node matches a given regular expression."
  {:db/ident :sh/PatternConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "A constraint component that can be used to verify that every value node matches a given regular expression.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Pattern constraint component@en",
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
   #voc/lstr
    "The class of prefix declarations, consisting of pairs of a prefix with a namespace.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Prefix declaration@en",
   :rdfs/subClassOf [:rdfs/Resource :sh/PrefixDeclaration]})

(def PropertyConstraintComponent
  "A constraint component that can be used to verify that all value nodes conform to the given property shape."
  {:db/ident :sh/PropertyConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "A constraint component that can be used to verify that all value nodes conform to the given property shape.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Property constraint component@en",
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
   #voc/lstr
    "Instances of this class represent groups of property shapes that belong together.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Property group@en",
   :rdfs/subClassOf [:rdfs/Resource :sh/PropertyGroup]})

(def PropertyShape
  "A property shape is a shape that specifies constraints on the values of a focus node for a given property or path."
  {:db/ident :sh/PropertyShape,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "A property shape is a shape that specifies constraints on the values of a focus node for a given property or path.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Property shape@en",
   :rdfs/subClassOf [:sh/Shape :sh/PropertyShape :rdfs/Resource]})

(def QualifiedMaxCountConstraintComponent
  "A constraint component that can be used to verify that a specified maximum number of value nodes conforms to a given shape."
  {:db/ident :sh/QualifiedMaxCountConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "A constraint component that can be used to verify that a specified maximum number of value nodes conforms to a given shape.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Qualified-max-count constraint component@en",
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
   #voc/lstr
    "A constraint component that can be used to verify that a specified minimum number of value nodes conforms to a given shape.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Qualified-min-count constraint component@en",
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
   #voc/lstr
    "A class of result annotations, which define the rules to derive the values of a given annotation property as extra values for a validation result.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Result annotation@en",
   :rdfs/subClassOf [:rdfs/Resource :sh/ResultAnnotation]})

(def Rule
  "The class of SHACL rules. Never instantiated directly."
  {:db/ident :sh/Rule,
   :rdf/type :rdfs/Class,
   :rdfs/comment #voc/lstr
                  "The class of SHACL rules. Never instantiated directly.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Rule@en",
   :rdfs/subClassOf [:rdfs/Resource :sh/Rule]})

(def SPARQLAskExecutable
  "The class of SPARQL executables that are based on an ASK query."
  {:db/ident :sh/SPARQLAskExecutable,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "The class of SPARQL executables that are based on an ASK query.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "SPARQL ASK executable@en",
   :rdfs/subClassOf
   [:sh/SPARQLExecutable :sh/SPARQLAskExecutable :rdfs/Resource]})

(def SPARQLAskValidator
  "The class of validators based on SPARQL ASK queries. The queries are evaluated for each value node and are supposed to return true if the given node conforms."
  {:db/ident :sh/SPARQLAskValidator,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "The class of validators based on SPARQL ASK queries. The queries are evaluated for each value node and are supposed to return true if the given node conforms.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "SPARQL ASK validator@en",
   :rdfs/subClassOf [:sh/SPARQLAskExecutable
                     :sh/Validator
                     :sh/SPARQLAskValidator
                     :rdfs/Resource
                     :sh/SPARQLExecutable]})

(def SPARQLConstraint
  "The class of constraints based on SPARQL SELECT queries."
  {:db/ident :sh/SPARQLConstraint,
   :rdf/type :rdfs/Class,
   :rdfs/comment #voc/lstr
                  "The class of constraints based on SPARQL SELECT queries.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "SPARQL constraint@en",
   :rdfs/subClassOf [:sh/SPARQLSelectExecutable
                     :sh/SPARQLConstraint
                     :rdfs/Resource
                     :sh/SPARQLExecutable]})

(def SPARQLConstraintComponent
  "A constraint component that can be used to define constraints based on SPARQL queries."
  {:db/ident :sh/SPARQLConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "A constraint component that can be used to define constraints based on SPARQL queries.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "SPARQL constraint component@en",
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
   #voc/lstr
    "The class of SPARQL executables that are based on a CONSTRUCT query.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "SPARQL CONSTRUCT executable@en",
   :rdfs/subClassOf
   [:sh/SPARQLExecutable :sh/SPARQLConstructExecutable :rdfs/Resource]})

(def SPARQLExecutable
  "The class of resources that encapsulate a SPARQL query."
  {:db/ident :sh/SPARQLExecutable,
   :rdf/type :rdfs/Class,
   :rdfs/comment #voc/lstr
                  "The class of resources that encapsulate a SPARQL query.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "SPARQL executable@en",
   :rdfs/subClassOf [:rdfs/Resource :sh/SPARQLExecutable]})

(def SPARQLFunction
  "A function backed by a SPARQL query - either ASK or SELECT."
  {:db/ident :sh/SPARQLFunction,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr "A function backed by a SPARQL query - either ASK or SELECT.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "SPARQL function@en",
   :rdfs/subClassOf [:sh/SPARQLSelectExecutable
                     :sh/SPARQLAskExecutable
                     :sh/Function
                     :sh/SPARQLFunction
                     :rdfs/Resource
                     :sh/Parameterizable
                     :sh/SPARQLExecutable]})

(def SPARQLRule
  "The class of SHACL rules based on SPARQL CONSTRUCT queries."
  {:db/ident :sh/SPARQLRule,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr "The class of SHACL rules based on SPARQL CONSTRUCT queries.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "SPARQL CONSTRUCT rule@en",
   :rdfs/subClassOf [:sh/SPARQLConstructExecutable
                     :sh/Rule
                     :sh/SPARQLRule
                     :rdfs/Resource
                     :sh/SPARQLExecutable]})

(def SPARQLSelectExecutable
  "The class of SPARQL executables based on a SELECT query."
  {:db/ident :sh/SPARQLSelectExecutable,
   :rdf/type :rdfs/Class,
   :rdfs/comment #voc/lstr
                  "The class of SPARQL executables based on a SELECT query.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "SPARQL SELECT executable@en",
   :rdfs/subClassOf
   [:sh/SPARQLExecutable :sh/SPARQLSelectExecutable :rdfs/Resource]})

(def SPARQLSelectValidator
  "The class of validators based on SPARQL SELECT queries. The queries are evaluated for each focus node and are supposed to produce bindings for all focus nodes that do not conform."
  {:db/ident :sh/SPARQLSelectValidator,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "The class of validators based on SPARQL SELECT queries. The queries are evaluated for each focus node and are supposed to produce bindings for all focus nodes that do not conform.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "SPARQL SELECT validator@en",
   :rdfs/subClassOf [:sh/SPARQLSelectExecutable
                     :sh/Validator
                     :sh/SPARQLSelectValidator
                     :rdfs/Resource
                     :sh/SPARQLExecutable]})

(def SPARQLTarget
  "The class of targets that are based on SPARQL queries."
  {:db/ident :sh/SPARQLTarget,
   :rdf/type :rdfs/Class,
   :rdfs/comment #voc/lstr
                  "The class of targets that are based on SPARQL queries.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "SPARQL target@en",
   :rdfs/subClassOf [:sh/SPARQLSelectExecutable
                     :sh/SPARQLAskExecutable
                     :sh/Target
                     :sh/SPARQLTarget
                     :rdfs/Resource
                     :sh/SPARQLExecutable]})

(def SPARQLTargetType
  "The (meta) class for parameterizable targets that are based on SPARQL queries."
  {:db/ident :sh/SPARQLTargetType,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "The (meta) class for parameterizable targets that are based on SPARQL queries.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "SPARQL target type@en",
   :rdfs/subClassOf [:sh/SPARQLSelectExecutable
                     :sh/SPARQLAskExecutable
                     :sh/TargetType
                     :sh/SPARQLTargetType
                     :rdfs/Class
                     :rdfs/Resource
                     :sh/Parameterizable
                     :sh/SPARQLExecutable]})

(def SPARQLUpdateExecutable
  "The class of SPARQL executables based on a SPARQL UPDATE."
  {:db/ident :sh/SPARQLUpdateExecutable,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr "The class of SPARQL executables based on a SPARQL UPDATE.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "SPARQL UPDATE executable@en",
   :rdfs/subClassOf
   [:sh/SPARQLExecutable :sh/SPARQLUpdateExecutable :rdfs/Resource]})

(def Severity
  "The class of validation result severity levels, including violation and warning levels."
  {:db/ident :sh/Severity,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "The class of validation result severity levels, including violation and warning levels.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Severity@en",
   :rdfs/subClassOf [:rdfs/Resource :sh/Severity]})

(def Shape
  "A shape is a collection of constraints that may be targeted for certain nodes."
  {:db/ident :sh/Shape,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "A shape is a collection of constraints that may be targeted for certain nodes.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Shape@en",
   :rdfs/subClassOf [:rdfs/Resource :sh/Shape]})

(def Target
  "The base class of targets such as those based on SPARQL queries."
  {:db/ident :sh/Target,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "The base class of targets such as those based on SPARQL queries.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Target@en",
   :rdfs/subClassOf [:rdfs/Resource :sh/Target]})

(def TargetType
  "The (meta) class for parameterizable targets. Instances of this are instantiated as values of the sh:target property."
  {:db/ident :sh/TargetType,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "The (meta) class for parameterizable targets.\tInstances of this are instantiated as values of the sh:target property.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Target type@en",
   :rdfs/subClassOf
   [:sh/Parameterizable :rdfs/Class :sh/TargetType :rdfs/Resource]})

(def TripleRule
  "A rule based on triple (subject, predicate, object) pattern."
  {:db/ident :sh/TripleRule,
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label
   #voc/lstr "A rule based on triple (subject, predicate, object) pattern.@en",
   :rdfs/subClassOf [:sh/Rule :sh/TripleRule :rdfs/Resource]})

(def UniqueLangConstraintComponent
  "A constraint component that can be used to specify that no pair of value nodes may use the same language tag."
  {:db/ident :sh/UniqueLangConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "A constraint component that can be used to specify that no pair of value nodes may use the same language tag.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Unique-languages constraint component@en",
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
   :rdfs/comment     #voc/lstr "The class of SHACL validation reports.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       #voc/lstr "Validation report@en",
   :rdfs/subClassOf  [:rdfs/Resource :sh/ValidationReport]})

(def ValidationResult
  "The class of validation results."
  {:db/ident         :sh/ValidationResult,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #voc/lstr "The class of validation results.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       #voc/lstr "Validation result@en",
   :rdfs/subClassOf  [:sh/AbstractResult :sh/ValidationResult :rdfs/Resource]})

(def Validator
  "The class of validators, which provide instructions on how to process a constraint definition. This class serves as base class for the SPARQL-based validators and other possible implementations."
  {:db/ident :sh/Validator,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "The class of validators, which provide instructions on how to process a constraint definition. This class serves as base class for the SPARQL-based validators and other possible implementations.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Validator@en",
   :rdfs/subClassOf [:rdfs/Resource :sh/Validator]})

(def Violation
  "The severity for a violation validation result."
  {:db/ident         :sh/Violation,
   :rdf/type         [:sh/Severity :rdfs/Resource],
   :rdfs/comment     #voc/lstr
                      "The severity for a violation validation result.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       #voc/lstr "Violation@en"})

(def Warning
  "The severity for a warning validation result."
  {:db/ident         :sh/Warning,
   :rdf/type         [:sh/Severity :rdfs/Resource],
   :rdfs/comment     #voc/lstr
                      "The severity for a warning validation result.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label       #voc/lstr "Warning@en"})

(def XoneConstraintComponent
  "A constraint component that can be used to restrict the value nodes so that they conform to exactly one out of several provided shapes."
  {:db/ident :sh/XoneConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "A constraint component that can be used to restrict the value nodes so that they conform to exactly one out of several provided shapes.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "Exactly one constraint component@en",
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
   #voc/lstr
    "The (single) value of this property must be a list of path elements, representing the elements of alternative paths.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "alternative path@en",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sh/alternativePath})

(def and
  "RDF list of shapes to validate the value nodes against."
  {:db/ident :sh/and,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment #voc/lstr
                  "RDF list of shapes to validate the value nodes against.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "and@en",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sh/and})

(def annotationProperty
  "The annotation property that shall be set."
  {:db/ident           :sh/annotationProperty,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr
                        "The annotation property that shall be set.@en",
   :rdfs/domain        :sh/ResultAnnotation,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         #voc/lstr "annotation property@en",
   :rdfs/range         :rdf/Property,
   :rdfs/subPropertyOf :sh/annotationProperty})

(def annotationValue
  "The (default) values of the annotation property."
  {:db/ident           :sh/annotationValue,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr
                        "The (default) values of the annotation property.@en",
   :rdfs/domain        :sh/ResultAnnotation,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         #voc/lstr "annotation value@en",
   :rdfs/subPropertyOf :sh/annotationValue})

(def annotationVarName
  "The name of the SPARQL variable from the SELECT clause that shall be used for the values."
  {:db/ident :sh/annotationVarName,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The name of the SPARQL variable from the SELECT clause that shall be used for the values.@en",
   :rdfs/domain :sh/ResultAnnotation,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "annotation variable name@en",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :sh/annotationVarName})

(def ask
  "The SPARQL ASK query to execute."
  {:db/ident           :sh/ask,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "The SPARQL ASK query to execute.@en",
   :rdfs/domain        :sh/SPARQLAskExecutable,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         #voc/lstr "ask@en",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :sh/ask})

(def class
  "The type that all value nodes must have."
  {:db/ident           :sh/class,
   :rdf/type           [:rdf/Property :rdfs/Resource],
   :rdfs/comment       #voc/lstr "The type that all value nodes must have.@en",
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         #voc/lstr "class@en",
   :rdfs/range         :rdfs/Class,
   :rdfs/subPropertyOf :sh/class})

(def closed
  "If set to true then the shape is closed."
  {:db/ident           :sh/closed,
   :rdf/type           [:rdf/Property :rdfs/Resource],
   :rdfs/comment       #voc/lstr "If set to true then the shape is closed.@en",
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         #voc/lstr "closed@en",
   :rdfs/range         :xsd/boolean,
   :rdfs/subPropertyOf :sh/closed})

(def condition
  "The shapes that the focus nodes need to conform to before a rule is executed on them."
  {:db/ident :sh/condition,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The shapes that the focus nodes need to conform to before a rule is executed on them.@en",
   :rdfs/domain :sh/Rule,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "condition@en",
   :rdfs/range :sh/Shape,
   :rdfs/subPropertyOf :sh/condition})

(def conforms
  "True if the validation did not produce any validation results, and false otherwise."
  {:db/ident :sh/conforms,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "True if the validation did not produce any validation results, and false otherwise.@en",
   :rdfs/domain :sh/ValidationReport,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "conforms@en",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :sh/conforms})

(def construct
  "The SPARQL CONSTRUCT query to execute."
  {:db/ident           :sh/construct,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "The SPARQL CONSTRUCT query to execute.@en",
   :rdfs/domain        :sh/SPARQLConstructExecutable,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         #voc/lstr "construct@en",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :sh/construct})

(def datatype
  "Specifies an RDF datatype that all value nodes must have."
  {:db/ident :sh/datatype,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr "Specifies an RDF datatype that all value nodes must have.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "datatype@en",
   :rdfs/range :rdfs/Datatype,
   :rdfs/subPropertyOf :sh/datatype})

(def deactivated
  "If set to true then all nodes conform to this."
  {:db/ident           :sh/deactivated,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr
                        "If set to true then all nodes conform to this.@en",
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         #voc/lstr "deactivated@en",
   :rdfs/range         :xsd/boolean,
   :rdfs/subPropertyOf :sh/deactivated})

(def declare
  "Links a resource with its namespace prefix declarations."
  {:db/ident :sh/declare,
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr
                  "Links a resource with its namespace prefix declarations.@en",
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "declare@en",
   :rdfs/range :sh/PrefixDeclaration,
   :rdfs/subPropertyOf :sh/declare})

(def defaultValue
  "A default value for a property, for example for user interface tools to pre-populate input fields."
  {:db/ident :sh/defaultValue,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A default value for a property, for example for user interface tools to pre-populate input fields.@en",
   :rdfs/domain :sh/PropertyShape,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "default value@en",
   :rdfs/subPropertyOf :sh/defaultValue})

(def description
  "Human-readable descriptions for the property in the context of the surrounding shape."
  {:db/ident :sh/description,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Human-readable descriptions for the property in the context of the surrounding shape.@en",
   :rdfs/domain :sh/PropertyShape,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "description@en",
   :rdfs/subPropertyOf :sh/description})

(def detail
  "Links a result with other results that provide more details, for example to describe violations against nested shapes."
  {:db/ident :sh/detail,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Links a result with other results that provide more details, for example to describe violations against nested shapes.@en",
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "detail@en",
   :rdfs/range :sh/AbstractResult,
   :rdfs/subPropertyOf :sh/detail})

(def disjoint
  "Specifies a property where the set of values must be disjoint with the value nodes."
  {:db/ident :sh/disjoint,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "Specifies a property where the set of values must be disjoint with the value nodes.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "disjoint@en",
   :rdfs/range :rdf/Property,
   :rdfs/subPropertyOf :sh/disjoint})

(def entailment
  "An entailment regime that indicates what kind of inferencing is required by a shapes graph."
  {:db/ident :sh/entailment,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "An entailment regime that indicates what kind of inferencing is required by a shapes graph.@en",
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "entailment@en",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sh/entailment})

(def equals
  "Specifies a property that must have the same values as the value nodes."
  {:db/ident :sh/equals,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "Specifies a property that must have the same values as the value nodes.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "equals@en",
   :rdfs/range :rdf/Property,
   :rdfs/subPropertyOf :sh/equals})

(def expression
  "The node expression that must return true for the value nodes."
  {:db/ident :sh/expression,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "The node expression that must return true for the value nodes.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "expression@en",
   :rdfs/subPropertyOf :sh/expression})

(def filterShape
  "The shape that all input nodes of the expression need to conform to."
  {:db/ident :sh/filterShape,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The shape that all input nodes of the expression need to conform to.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "filter shape@en",
   :rdfs/range :sh/Shape,
   :rdfs/subPropertyOf :sh/filterShape})

(def flags
  "An optional flag to be used with regular expression pattern matching."
  {:db/ident :sh/flags,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "An optional flag to be used with regular expression pattern matching.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "flags@en",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :sh/flags})

(def focusNode
  "The focus node that was validated when the result was produced."
  {:db/ident :sh/focusNode,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The focus node that was validated when the result was produced.@en",
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "focus node@en",
   :rdfs/subPropertyOf :sh/focusNode})

(def group
  "Can be used to link to a property group to indicate that a property shape belongs to a group of related property shapes."
  {:db/ident :sh/group,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Can be used to link to a property group to indicate that a property shape belongs to a group of related property shapes.@en",
   :rdfs/domain :sh/PropertyShape,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "group@en",
   :rdfs/range :sh/PropertyGroup,
   :rdfs/subPropertyOf :sh/group})

(def hasValue
  "Specifies a value that must be among the value nodes."
  {:db/ident :sh/hasValue,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment #voc/lstr
                  "Specifies a value that must be among the value nodes.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "has value@en",
   :rdfs/subPropertyOf :sh/hasValue})

(def ignoredProperties
  "An optional RDF list of properties that are also permitted in addition to those explicitly enumerated via sh:property/sh:path."
  {:db/ident :sh/ignoredProperties,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "An optional RDF list of properties that are also permitted in addition to those explicitly enumerated via sh:property/sh:path.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "ignored properties@en",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sh/ignoredProperties})

(def in
  "Specifies a list of allowed values so that each value node must be among the members of the given list."
  {:db/ident :sh/in,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "Specifies a list of allowed values so that each value node must be among the members of the given list.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "in@en",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sh/in})

(def intersection
  "A list of node expressions that shall be intersected."
  {:db/ident :sh/intersection,
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr
                  "A list of node expressions that shall be intersected.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "intersection@en",
   :rdfs/subPropertyOf :sh/intersection})

(def inversePath
  "The (single) value of this property represents an inverse path (object to subject)."
  {:db/ident :sh/inversePath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The (single) value of this property represents an inverse path (object to subject).@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "inverse path@en",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sh/inversePath})

(def js
  "Constraints expressed in JavaScript."
  {:db/ident           :sh/js,
   :rdf/type           [:rdf/Property :rdfs/Resource],
   :rdfs/comment       "Constraints expressed in JavaScript.",
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         #voc/lstr "JavaScript constraint@en",
   :rdfs/range         :sh/JSConstraint,
   :rdfs/subPropertyOf :sh/js})

(def jsFunctionName
  "The name of the JavaScript function to execute."
  {:db/ident           :sh/jsFunctionName,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr
                        "The name of the JavaScript function to execute.@en",
   :rdfs/domain        :sh/JSExecutable,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         #voc/lstr "JavaScript function name@en",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :sh/jsFunctionName})

(def jsLibrary
  "Declares which JavaScript libraries are needed to execute this."
  {:db/ident :sh/jsLibrary,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Declares which JavaScript libraries are needed to execute this.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "JavaScript library@en",
   :rdfs/range :sh/JSLibrary,
   :rdfs/subPropertyOf :sh/jsLibrary})

(def jsLibraryURL
  "Declares the URLs of a JavaScript library. This should be the absolute URL of a JavaScript file. Implementations may redirect those to local files."
  {:db/ident :sh/jsLibraryURL,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Declares the URLs of a JavaScript library. This should be the absolute URL of a JavaScript file. Implementations may redirect those to local files.@en",
   :rdfs/domain :sh/JSLibrary,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "JavaScript library URL@en",
   :rdfs/range :xsd/anyURI,
   :rdfs/subPropertyOf :sh/jsLibraryURL})

(def labelTemplate
  "Outlines how human-readable labels of instances of the associated Parameterizable shall be produced. The values can contain {?paramName} as placeholders for the actual values of the given parameter."
  {:db/ident :sh/labelTemplate,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Outlines how human-readable labels of instances of the associated Parameterizable shall be produced. The values can contain {?paramName} as placeholders for the actual values of the given parameter.@en",
   :rdfs/domain :sh/Parameterizable,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "label template@en",
   :rdfs/subPropertyOf :sh/labelTemplate})

(def languageIn
  "Specifies a list of language tags that all value nodes must have."
  {:db/ident :sh/languageIn,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "Specifies a list of language tags that all value nodes must have.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "language in@en",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sh/languageIn})

(def lessThan
  "Specifies a property that must have smaller values than the value nodes."
  {:db/ident :sh/lessThan,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "Specifies a property that must have smaller values than the value nodes.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "less than@en",
   :rdfs/range :rdf/Property,
   :rdfs/subPropertyOf :sh/lessThan})

(def lessThanOrEquals
  "Specifies a property that must have smaller or equal values than the value nodes."
  {:db/ident :sh/lessThanOrEquals,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "Specifies a property that must have smaller or equal values than the value nodes.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "less than or equals@en",
   :rdfs/range :rdf/Property,
   :rdfs/subPropertyOf :sh/lessThanOrEquals})

(def maxCount
  "Specifies the maximum number of values in the set of value nodes."
  {:db/ident :sh/maxCount,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "Specifies the maximum number of values in the set of value nodes.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "max count@en",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :sh/maxCount})

(def maxExclusive
  "Specifies the maximum exclusive value of each value node."
  {:db/ident :sh/maxExclusive,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr "Specifies the maximum exclusive value of each value node.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "max exclusive@en",
   :rdfs/subPropertyOf :sh/maxExclusive})

(def maxInclusive
  "Specifies the maximum inclusive value of each value node."
  {:db/ident :sh/maxInclusive,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr "Specifies the maximum inclusive value of each value node.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "max inclusive@en",
   :rdfs/subPropertyOf :sh/maxInclusive})

(def maxLength
  "Specifies the maximum string length of each value node."
  {:db/ident :sh/maxLength,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment #voc/lstr
                  "Specifies the maximum string length of each value node.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "max length@en",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :sh/maxLength})

(def message
  "A human-readable message (possibly with placeholders for variables) explaining the cause of the result."
  {:db/ident :sh/message,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "A human-readable message (possibly with placeholders for variables) explaining the cause of the result.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "message@en",
   :rdfs/subPropertyOf :sh/message})

(def minCount
  "Specifies the minimum number of values in the set of value nodes."
  {:db/ident :sh/minCount,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "Specifies the minimum number of values in the set of value nodes.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "min count@en",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :sh/minCount})

(def minExclusive
  "Specifies the minimum exclusive value of each value node."
  {:db/ident :sh/minExclusive,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr "Specifies the minimum exclusive value of each value node.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "min exclusive@en",
   :rdfs/subPropertyOf :sh/minExclusive})

(def minInclusive
  "Specifies the minimum inclusive value of each value node."
  {:db/ident :sh/minInclusive,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr "Specifies the minimum inclusive value of each value node.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "min inclusive@en",
   :rdfs/subPropertyOf :sh/minInclusive})

(def minLength
  "Specifies the minimum string length of each value node."
  {:db/ident :sh/minLength,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment #voc/lstr
                  "Specifies the minimum string length of each value node.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "min length@en",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :sh/minLength})

(def name
  "Human-readable labels for the property in the context of the surrounding shape."
  {:db/ident :sh/name,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Human-readable labels for the property in the context of the surrounding shape.@en",
   :rdfs/domain :sh/PropertyShape,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "name@en",
   :rdfs/subPropertyOf :sh/name})

(def namespace
  "The namespace associated with a prefix in a prefix declaration."
  {:db/ident :sh/namespace,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The namespace associated with a prefix in a prefix declaration.@en",
   :rdfs/domain :sh/PrefixDeclaration,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "namespace@en",
   :rdfs/range :xsd/anyURI,
   :rdfs/subPropertyOf :sh/namespace})

(def node
  "Specifies the node shape that all value nodes must conform to."
  {:db/ident :sh/node,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "Specifies the node shape that all value nodes must conform to.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "node@en",
   :rdfs/range :sh/NodeShape,
   :rdfs/subPropertyOf :sh/node})

(def nodeKind
  "Specifies the node kind (e.g. IRI or literal) each value node."
  {:db/ident :sh/nodeKind,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "Specifies the node kind (e.g. IRI or literal) each value node.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "node kind@en",
   :rdfs/range :sh/NodeKind,
   :rdfs/subPropertyOf :sh/nodeKind})

(def nodeValidator
  "The validator(s) used to evaluate a constraint in the context of a node shape."
  {:db/ident :sh/nodeValidator,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The validator(s) used to evaluate a constraint in the context of a node shape.@en",
   :rdfs/domain :sh/ConstraintComponent,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "shape validator@en",
   :rdfs/range :sh/Validator,
   :rdfs/subPropertyOf :sh/nodeValidator})

(def nodes
  "The node expression producing the input nodes of a filter shape expression."
  {:db/ident :sh/nodes,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The node expression producing the input nodes of a filter shape expression.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "nodes@en",
   :rdfs/subPropertyOf :sh/nodes})

(def not
  "Specifies a shape that the value nodes must not conform to."
  {:db/ident :sh/not,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr "Specifies a shape that the value nodes must not conform to.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "not@en",
   :rdfs/range :sh/Shape,
   :rdfs/subPropertyOf :sh/not})

(def object
  "An expression producing the nodes that shall be inferred as objects."
  {:db/ident :sh/object,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "An expression producing the nodes that shall be inferred as objects.@en",
   :rdfs/domain :sh/TripleRule,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "object@en",
   :rdfs/subPropertyOf :sh/object})

(def oneOrMorePath
  "The (single) value of this property represents a path that is matched one or more times."
  {:db/ident :sh/oneOrMorePath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The (single) value of this property represents a path that is matched one or more times.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "one or more path@en",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sh/oneOrMorePath})

(def optional
  "Indicates whether a parameter is optional."
  {:db/ident           :sh/optional,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr
                        "Indicates whether a parameter is optional.@en",
   :rdfs/domain        :sh/Parameter,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         #voc/lstr "optional@en",
   :rdfs/range         :xsd/boolean,
   :rdfs/subPropertyOf :sh/optional})

(def or
  "Specifies a list of shapes so that the value nodes must conform to at least one of the shapes."
  {:db/ident :sh/or,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "Specifies a list of shapes so that the value nodes must conform to at least one of the shapes.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "or@en",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sh/or})

(def order
  "Specifies the relative order of this compared to its siblings. For example use 0 for the first, 1 for the second."
  {:db/ident :sh/order,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Specifies the relative order of this compared to its siblings. For example use 0 for the first, 1 for the second.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "order@en",
   :rdfs/subPropertyOf :sh/order})

(def parameter
  "The parameters of a function or constraint component."
  {:db/ident :sh/parameter,
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr
                  "The parameters of a function or constraint component.@en",
   :rdfs/domain :sh/Parameterizable,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "parameter@en",
   :rdfs/range :sh/Parameter,
   :rdfs/subPropertyOf :sh/parameter})

(def path
  "Specifies the property path of a property shape."
  {:db/ident           :sh/path,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr
                        "Specifies the property path of a property shape.@en",
   :rdfs/domain        :sh/PropertyShape,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         #voc/lstr "path@en",
   :rdfs/range         :rdfs/Resource,
   :rdfs/subPropertyOf :sh/path})

(def pattern
  "Specifies a regular expression pattern that the string representations of the value nodes must match."
  {:db/ident :sh/pattern,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "Specifies a regular expression pattern that the string representations of the value nodes must match.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "pattern@en",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :sh/pattern})

(def predicate
  "An expression producing the properties that shall be inferred as predicates."
  {:db/ident :sh/predicate,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "An expression producing the properties that shall be inferred as predicates.@en",
   :rdfs/domain :sh/TripleRule,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "predicate@en",
   :rdfs/subPropertyOf :sh/predicate})

(def prefix
  "The prefix of a prefix declaration."
  {:db/ident           :sh/prefix,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "The prefix of a prefix declaration.@en",
   :rdfs/domain        :sh/PrefixDeclaration,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         #voc/lstr "prefix@en",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :sh/prefix})

(def prefixes
  "The prefixes that shall be applied before parsing the associated SPARQL query."
  {:db/ident :sh/prefixes,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The prefixes that shall be applied before parsing the associated SPARQL query.@en",
   :rdfs/domain :sh/SPARQLExecutable,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "prefixes@en",
   :rdfs/range :owl/Ontology,
   :rdfs/subPropertyOf :sh/prefixes})

(def property
  "Links a shape to its property shapes."
  {:db/ident           :sh/property,
   :rdf/type           [:rdf/Property :rdfs/Resource],
   :rdfs/comment       #voc/lstr "Links a shape to its property shapes.@en",
   :rdfs/domain        :sh/Shape,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         #voc/lstr "property@en",
   :rdfs/range         :sh/PropertyShape,
   :rdfs/subPropertyOf :sh/property})

(def propertyValidator
  "The validator(s) used to evaluate a constraint in the context of a property shape."
  {:db/ident :sh/propertyValidator,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The validator(s) used to evaluate a constraint in the context of a property shape.@en",
   :rdfs/domain :sh/ConstraintComponent,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "property validator@en",
   :rdfs/range :sh/Validator,
   :rdfs/subPropertyOf :sh/propertyValidator})

(def qualifiedMaxCount
  "The maximum number of value nodes that can conform to the shape."
  {:db/ident :sh/qualifiedMaxCount,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "The maximum number of value nodes that can conform to the shape.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "qualified max count@en",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :sh/qualifiedMaxCount})

(def qualifiedMinCount
  "The minimum number of value nodes that must conform to the shape."
  {:db/ident :sh/qualifiedMinCount,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "The minimum number of value nodes that must conform to the shape.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "qualified min count@en",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :sh/qualifiedMinCount})

(def qualifiedValueShape
  "The shape that a specified number of values must conform to."
  {:db/ident :sh/qualifiedValueShape,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr "The shape that a specified number of values must conform to.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "qualified value shape@en",
   :rdfs/range :sh/Shape,
   :rdfs/subPropertyOf :sh/qualifiedValueShape})

(def qualifiedValueShapesDisjoint
  "Can be used to mark the qualified value shape to be disjoint with its sibling shapes."
  {:db/ident :sh/qualifiedValueShapesDisjoint,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "Can be used to mark the qualified value shape to be disjoint with its sibling shapes.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "qualified value shapes disjoint@en",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :sh/qualifiedValueShapesDisjoint})

(def result
  "The validation results contained in a validation report."
  {:db/ident :sh/result,
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr
                  "The validation results contained in a validation report.@en",
   :rdfs/domain :sh/ValidationReport,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "result@en",
   :rdfs/range :sh/ValidationResult,
   :rdfs/subPropertyOf :sh/result})

(def resultAnnotation
  "Links a SPARQL validator with zero or more sh:ResultAnnotation instances, defining how to derive additional result properties based on the variables of the SELECT query."
  {:db/ident :sh/resultAnnotation,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Links a SPARQL validator with zero or more sh:ResultAnnotation instances, defining how to derive additional result properties based on the variables of the SELECT query.@en",
   :rdfs/domain :sh/SPARQLSelectValidator,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "result annotation@en",
   :rdfs/range :sh/ResultAnnotation,
   :rdfs/subPropertyOf :sh/resultAnnotation})

(def resultMessage
  "Human-readable messages explaining the cause of the result."
  {:db/ident :sh/resultMessage,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr "Human-readable messages explaining the cause of the result.@en",
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "result message@en",
   :rdfs/subPropertyOf :sh/resultMessage})

(def resultPath
  "The path of a validation result, based on the path of the validated property shape."
  {:db/ident :sh/resultPath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The path of a validation result, based on the path of the validated property shape.@en",
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "result path@en",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sh/resultPath})

(def resultSeverity
  "The severity of the result, e.g. warning."
  {:db/ident           :sh/resultSeverity,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "The severity of the result, e.g. warning.@en",
   :rdfs/domain        :sh/AbstractResult,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         #voc/lstr "result severity@en",
   :rdfs/range         :sh/Severity,
   :rdfs/subPropertyOf :sh/resultSeverity})

(def returnType
  "The expected type of values returned by the associated function."
  {:db/ident :sh/returnType,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The expected type of values returned by the associated function.@en",
   :rdfs/domain :sh/Function,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "return type@en",
   :rdfs/range :rdfs/Class,
   :rdfs/subPropertyOf :sh/returnType})

(def rule
  "The rules linked to a shape."
  {:db/ident           :sh/rule,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "The rules linked to a shape.@en",
   :rdfs/domain        :sh/Shape,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         #voc/lstr "rule@en",
   :rdfs/range         :sh/Rule,
   :rdfs/subPropertyOf :sh/rule})

(def select
  "The SPARQL SELECT query to execute."
  {:db/ident           :sh/select,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "The SPARQL SELECT query to execute.@en",
   :rdfs/domain        :sh/SPARQLSelectExecutable,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         #voc/lstr "select@en",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :sh/select})

(def severity
  "Defines the severity that validation results produced by a shape must have. Defaults to sh:Violation."
  {:db/ident :sh/severity,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Defines the severity that validation results produced by a shape must have. Defaults to sh:Violation.@en",
   :rdfs/domain :sh/Shape,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "severity@en",
   :rdfs/range :sh/Severity,
   :rdfs/subPropertyOf :sh/severity})

(def shapesGraph
  "Shapes graphs that should be used when validating this data graph."
  {:db/ident :sh/shapesGraph,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Shapes graphs that should be used when validating this data graph.@en",
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "shapes graph@en",
   :rdfs/range :owl/Ontology,
   :rdfs/subPropertyOf :sh/shapesGraph})

(def shapesGraphWellFormed
  "If true then the validation engine was certain that the shapes graph has passed all SHACL syntax requirements during the validation process."
  {:db/ident :sh/shapesGraphWellFormed,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "If true then the validation engine was certain that the shapes graph has passed all SHACL syntax requirements during the validation process.@en",
   :rdfs/domain :sh/ValidationReport,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "shapes graph well-formed@en",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :sh/shapesGraphWellFormed})

(def sourceConstraint
  "The constraint that was validated when the result was produced."
  {:db/ident :sh/sourceConstraint,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The constraint that was validated when the result was produced.@en",
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "source constraint@en",
   :rdfs/subPropertyOf :sh/sourceConstraint})

(def sourceConstraintComponent
  "The constraint component that is the source of the result."
  {:db/ident :sh/sourceConstraintComponent,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr "The constraint component that is the source of the result.@en",
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "source constraint component@en",
   :rdfs/range :sh/ConstraintComponent,
   :rdfs/subPropertyOf :sh/sourceConstraintComponent})

(def sourceShape
  "The shape that is was validated when the result was produced."
  {:db/ident :sh/sourceShape,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr "The shape that is was validated when the result was produced.@en",
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "source shape@en",
   :rdfs/range :sh/Shape,
   :rdfs/subPropertyOf :sh/sourceShape})

(def sparql
  "Links a shape with SPARQL constraints."
  {:db/ident           :sh/sparql,
   :rdf/type           [:rdf/Property :rdfs/Resource],
   :rdfs/comment       #voc/lstr "Links a shape with SPARQL constraints.@en",
   :rdfs/domain        :sh/Shape,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         #voc/lstr "constraint (in SPARQL)@en",
   :rdfs/range         :sh/SPARQLConstraint,
   :rdfs/subPropertyOf :sh/sparql})

(def subject
  "An expression producing the resources that shall be inferred as subjects."
  {:db/ident :sh/subject,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "An expression producing the resources that shall be inferred as subjects.@en",
   :rdfs/domain :sh/TripleRule,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "subject@en",
   :rdfs/subPropertyOf :sh/subject})

(def suggestedShapesGraph
  "Suggested shapes graphs for this ontology. The values of this property may be used in the absence of specific sh:shapesGraph statements."
  {:db/ident :sh/suggestedShapesGraph,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Suggested shapes graphs for this ontology. The values of this property may be used in the absence of specific sh:shapesGraph statements.@en",
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "suggested shapes graph@en",
   :rdfs/range :owl/Ontology,
   :rdfs/subPropertyOf :sh/suggestedShapesGraph})

(def target
  "Links a shape to a target specified by an extension language, for example instances of sh:SPARQLTarget."
  {:db/ident :sh/target,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Links a shape to a target specified by an extension language, for example instances of sh:SPARQLTarget.@en",
   :rdfs/domain :sh/Shape,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "target@en",
   :rdfs/range :sh/Target,
   :rdfs/subPropertyOf :sh/target})

(def targetClass
  "Links a shape to a class, indicating that all instances of the class must conform to the shape."
  {:db/ident :sh/targetClass,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Links a shape to a class, indicating that all instances of the class must conform to the shape.@en",
   :rdfs/domain :sh/Shape,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "target class@en",
   :rdfs/range :rdfs/Class,
   :rdfs/subPropertyOf :sh/targetClass})

(def targetNode
  "Links a shape to individual nodes, indicating that these nodes must conform to the shape."
  {:db/ident :sh/targetNode,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Links a shape to individual nodes, indicating that these nodes must conform to the shape.@en",
   :rdfs/domain :sh/Shape,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "target node@en",
   :rdfs/subPropertyOf :sh/targetNode})

(def targetObjectsOf
  "Links a shape to a property, indicating that all all objects of triples that have the given property as their predicate must conform to the shape."
  {:db/ident :sh/targetObjectsOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Links a shape to a property, indicating that all all objects of triples that have the given property as their predicate must conform to the shape.@en",
   :rdfs/domain :sh/Shape,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "target objects of@en",
   :rdfs/range :rdf/Property,
   :rdfs/subPropertyOf :sh/targetObjectsOf})

(def targetSubjectsOf
  "Links a shape to a property, indicating that all subjects of triples that have the given property as their predicate must conform to the shape."
  {:db/ident :sh/targetSubjectsOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Links a shape to a property, indicating that all subjects of triples that have the given property as their predicate must conform to the shape.@en",
   :rdfs/domain :sh/Shape,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "target subjects of@en",
   :rdfs/range :rdf/Property,
   :rdfs/subPropertyOf :sh/targetSubjectsOf})

(def this
  "A node expression that represents the current focus node."
  {:db/ident :sh/this,
   :rdf/type :rdfs/Resource,
   :rdfs/comment
   #voc/lstr "A node expression that represents the current focus node.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "this@en"})

(def union
  "A list of node expressions that shall be used together."
  {:db/ident :sh/union,
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr
                  "A list of node expressions that shall be used together.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "union@en",
   :rdfs/subPropertyOf :sh/union})

(def uniqueLang
  "Specifies whether all node values must have a unique (or no) language tag."
  {:db/ident :sh/uniqueLang,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "Specifies whether all node values must have a unique (or no) language tag.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "unique languages@en",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :sh/uniqueLang})

(def update
  "The SPARQL UPDATE to execute."
  {:db/ident           :sh/update,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "The SPARQL UPDATE to execute.@en",
   :rdfs/domain        :sh/SPARQLUpdateExecutable,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         #voc/lstr "update@en",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :sh/update})

(def validator
  "The validator(s) used to evaluate constraints of either node or property shapes."
  {:db/ident :sh/validator,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The validator(s) used to evaluate constraints of either node or property shapes.@en",
   :rdfs/domain :sh/ConstraintComponent,
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "validator@en",
   :rdfs/range :sh/Validator,
   :rdfs/subPropertyOf :sh/validator})

(def value
  "An RDF node that has caused the result."
  {:db/ident           :sh/value,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "An RDF node that has caused the result.@en",
   :rdfs/domain        :sh/AbstractResult,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/shacl#",
   :rdfs/label         #voc/lstr "value@en",
   :rdfs/subPropertyOf :sh/value})

(def xone
  "Specifies a list of shapes so that the value nodes must conform to exactly one of the shapes."
  {:db/ident :sh/xone,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #voc/lstr
    "Specifies a list of shapes so that the value nodes must conform to exactly one of the shapes.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "exactly one@en",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :sh/xone})

(def zeroOrMorePath
  "The (single) value of this property represents a path that is matched zero or more times."
  {:db/ident :sh/zeroOrMorePath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The (single) value of this property represents a path that is matched zero or more times.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "zero or more path@en",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sh/zeroOrMorePath})

(def zeroOrOnePath
  "The (single) value of this property represents a path that is matched zero or one times."
  {:db/ident :sh/zeroOrOnePath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "The (single) value of this property represents a path that is matched zero or one times.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/shacl#",
   :rdfs/label #voc/lstr "zero or one path@en",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :sh/zeroOrOnePath})