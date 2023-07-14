(ns net.wikipunk.rdf.sh
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
   #xsd/langString
    "The base class of validation results, typically not instantiated directly.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Abstract result@en",
   :rdfs/subClassOf :rdfs/Resource})

(def AndConstraintComponent
  "A constraint component that can be used to test whether a value node conforms to all members of a provided list of shapes."
  {:db/ident :sh/AndConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to test whether a value node conforms to all members of a provided list of shapes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "And constraint component@en",
   :sh/parameter :sh/AndConstraintComponent-and})

(def AndConstraintComponent-and
  {:db/ident         :sh/AndConstraintComponent-and,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/path          :sh/and})

(def BlankNode
  "The node kind of all blank nodes."
  {:db/ident         :sh/BlankNode,
   :rdf/type         [:sh/NodeKind :rdfs/Resource],
   :rdfs/comment     #xsd/langString "The node kind of all blank nodes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "Blank node@en"})

(def BlankNodeOrIRI
  "The node kind of all blank nodes or IRIs."
  {:db/ident         :sh/BlankNodeOrIRI,
   :rdf/type         [:sh/NodeKind :rdfs/Resource],
   :rdfs/comment     #xsd/langString
                      "The node kind of all blank nodes or IRIs.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "Blank node or IRI@en"})

(def BlankNodeOrLiteral
  "The node kind of all blank nodes or literals."
  {:db/ident         :sh/BlankNodeOrLiteral,
   :rdf/type         [:sh/NodeKind :rdfs/Resource],
   :rdfs/comment     #xsd/langString
                      "The node kind of all blank nodes or literals.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "Blank node or literal@en"})

(def ClassConstraintComponent
  "A constraint component that can be used to verify that each value node is an instance of a given type."
  {:db/ident :sh/ClassConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to verify that each value node is an instance of a given type.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Class constraint component@en",
   :sh/parameter :sh/ClassConstraintComponent-class})

(def ClassConstraintComponent-class
  {:db/ident         :sh/ClassConstraintComponent-class,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/nodeKind      :sh/IRI,
   :sh/path          :sh/class})

(def ClosedConstraintComponent
  "A constraint component that can be used to indicate that focus nodes must only have values for those properties that have been explicitly enumerated via sh:property/sh:path."
  {:db/ident :sh/ClosedConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to indicate that focus nodes must only have values for those properties that have been explicitly enumerated via sh:property/sh:path.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Closed constraint component@en",
   :sh/parameter [:sh/ClosedConstraintComponent-ignoredProperties
                  :sh/ClosedConstraintComponent-closed]})

(def ClosedConstraintComponent-closed
  {:db/ident         :sh/ClosedConstraintComponent-closed,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/datatype      :xsd/boolean,
   :sh/path          :sh/closed})

(def ClosedConstraintComponent-ignoredProperties
  {:db/ident         :sh/ClosedConstraintComponent-ignoredProperties,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/optional      #xsd/boolean true,
   :sh/path          :sh/ignoredProperties})

(def ConstraintComponent
  "The class of constraint components."
  {:db/ident         :sh/ConstraintComponent,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #xsd/langString "The class of constraint components.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "Constraint component@en",
   :rdfs/subClassOf  [:sh/Parameterizable :rdfs/Resource]})

(def DatatypeConstraintComponent
  "A constraint component that can be used to restrict the datatype of all value nodes."
  {:db/ident :sh/DatatypeConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to restrict the datatype of all value nodes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Datatype constraint component@en",
   :sh/parameter :sh/DatatypeConstraintComponent-datatype})

(def DatatypeConstraintComponent-datatype
  {:db/ident         :sh/DatatypeConstraintComponent-datatype,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/maxCount      #xsd/integer 1,
   :sh/nodeKind      :sh/IRI,
   :sh/path          :sh/datatype})

(def DisjointConstraintComponent
  "A constraint component that can be used to verify that the set of value nodes is disjoint with the the set of nodes that have the focus node as subject and the value of a given property as predicate."
  {:db/ident :sh/DisjointConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to verify that the set of value nodes is disjoint with the the set of nodes that have the focus node as subject and the value of a given property as predicate.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Disjoint constraint component@en",
   :sh/parameter :sh/DisjointConstraintComponent-disjoint})

(def DisjointConstraintComponent-disjoint
  {:db/ident         :sh/DisjointConstraintComponent-disjoint,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/nodeKind      :sh/IRI,
   :sh/path          :sh/disjoint})

(def EqualsConstraintComponent
  "A constraint component that can be used to verify that the set of value nodes is equal to the set of nodes that have the focus node as subject and the value of a given property as predicate."
  {:db/ident :sh/EqualsConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to verify that the set of value nodes is equal to the set of nodes that have the focus node as subject and the value of a given property as predicate.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Equals constraint component@en",
   :sh/parameter :sh/EqualsConstraintComponent-equals})

(def EqualsConstraintComponent-equals
  {:db/ident         :sh/EqualsConstraintComponent-equals,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/nodeKind      :sh/IRI,
   :sh/path          :sh/equals})

(def ExpressionConstraintComponent
  "A constraint component that can be used to verify that a given node expression produces true for all value nodes."
  {:db/ident :sh/ExpressionConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to verify that a given node expression produces true for all value nodes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Expression constraint component@en",
   :sh/parameter :sh/ExpressionConstraintComponent-expression})

(def ExpressionConstraintComponent-expression
  {:db/ident         :sh/ExpressionConstraintComponent-expression,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/path          :sh/expression})

(def Function
  "The class of SHACL functions."
  {:db/ident         :sh/Function,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #xsd/langString "The class of SHACL functions.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "Function@en",
   :rdfs/subClassOf  [:sh/Parameterizable :rdfs/Resource]})

(def HasValueConstraintComponent
  "A constraint component that can be used to verify that one of the value nodes is a given RDF node."
  {:db/ident :sh/HasValueConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to verify that one of the value nodes is a given RDF node.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Has-value constraint component@en",
   :sh/parameter :sh/HasValueConstraintComponent-hasValue})

(def HasValueConstraintComponent-hasValue
  {:db/ident         :sh/HasValueConstraintComponent-hasValue,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/path          :sh/hasValue})

(def IRI
  "The node kind of all IRIs."
  {:db/ident         :sh/IRI,
   :rdf/type         [:sh/NodeKind :rdfs/Resource],
   :rdfs/comment     #xsd/langString "The node kind of all IRIs.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "IRI@en"})

(def IRIOrLiteral
  "The node kind of all IRIs or literals."
  {:db/ident         :sh/IRIOrLiteral,
   :rdf/type         [:sh/NodeKind :rdfs/Resource],
   :rdfs/comment     #xsd/langString
                      "The node kind of all IRIs or literals.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "IRI or literal@en"})

(def InConstraintComponent
  "A constraint component that can be used to exclusively enumerate the permitted value nodes."
  {:db/ident :sh/InConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to exclusively enumerate the permitted value nodes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "In constraint component@en",
   :sh/parameter :sh/InConstraintComponent-in})

(def InConstraintComponent-in
  {:db/ident         :sh/InConstraintComponent-in,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/maxCount      #xsd/integer 1,
   :sh/path          :sh/in})

(def Info
  "The severity for an informational validation result."
  {:db/ident         :sh/Info,
   :rdf/type         [:sh/Severity :rdfs/Resource],
   :rdfs/comment     #xsd/langString
                      "The severity for an informational validation result.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "Info@en"})

(def JSConstraint
  "The class of constraints backed by a JavaScript function."
  {:db/ident :sh/JSConstraint,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "The class of constraints backed by a JavaScript function.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "JavaScript-based constraint@en",
   :rdfs/subClassOf [:sh/JSExecutable :rdfs/Resource]})

(def JSConstraint-js
  {:db/ident         :sh/JSConstraint-js,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/path          :sh/js})

(def JSConstraintComponent
  "A constraint component with the parameter sh:js linking to a sh:JSConstraint containing a sh:script."
  {:db/ident :sh/JSConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component with the parameter sh:js linking to a sh:JSConstraint containing a sh:script.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "JavaScript constraint component@en",
   :sh/parameter :sh/JSConstraint-js})

(def JSExecutable
  "Abstract base class of resources that declare an executable JavaScript."
  {:db/ident :sh/JSExecutable,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "Abstract base class of resources that declare an executable JavaScript.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "JavaScript executable@en",
   :rdfs/subClassOf :rdfs/Resource})

(def JSFunction
  "The class of SHACL functions that execute a JavaScript function when called."
  {:db/ident :sh/JSFunction,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "The class of SHACL functions that execute a JavaScript function when called.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "JavaScript function@en",
   :rdfs/subClassOf
   [:sh/JSExecutable :sh/Function :sh/Parameterizable :rdfs/Resource]})

(def JSLibrary
  "Represents a JavaScript library, typically identified by one or more URLs of files to include."
  {:db/ident :sh/JSLibrary,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "Represents a JavaScript library, typically identified by one or more URLs of files to include.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "JavaScript library@en",
   :rdfs/subClassOf :rdfs/Resource})

(def JSRule
  "The class of SHACL rules expressed using JavaScript."
  {:db/ident         :sh/JSRule,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #xsd/langString
                      "The class of SHACL rules expressed using JavaScript.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "JavaScript rule@en",
   :rdfs/subClassOf  [:sh/Rule :sh/JSExecutable :rdfs/Resource]})

(def JSTarget
  "The class of targets that are based on JavaScript functions."
  {:db/ident :sh/JSTarget,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "The class of targets that are based on JavaScript functions.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "JavaScript target@en",
   :rdfs/subClassOf [:sh/JSExecutable :sh/Target :rdfs/Resource]})

(def JSTargetType
  "The (meta) class for parameterizable targets that are based on JavaScript functions."
  {:db/ident :sh/JSTargetType,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "The (meta) class for parameterizable targets that are based on JavaScript functions.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "JavaScript target type@en",
   :rdfs/subClassOf [:sh/JSExecutable
                     :sh/TargetType
                     :sh/Parameterizable
                     :rdfs/Class
                     :rdfs/Resource]})

(def JSValidator
  "A SHACL validator based on JavaScript. This can be used to declare SHACL constraint components that perform JavaScript-based validation when used."
  {:db/ident :sh/JSValidator,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "A SHACL validator based on JavaScript. This can be used to declare SHACL constraint components that perform JavaScript-based validation when used.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "JavaScript validator@en",
   :rdfs/subClassOf [:sh/Validator :sh/JSExecutable :rdfs/Resource]})

(def LanguageInConstraintComponent
  "A constraint component that can be used to enumerate language tags that all value nodes must have."
  {:db/ident :sh/LanguageInConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to enumerate language tags that all value nodes must have.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Language-in constraint component@en",
   :sh/parameter :sh/LanguageInConstraintComponent-languageIn})

(def LanguageInConstraintComponent-languageIn
  {:db/ident         :sh/LanguageInConstraintComponent-languageIn,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/maxCount      #xsd/integer 1,
   :sh/path          :sh/languageIn})

(def LessThanConstraintComponent
  "A constraint component that can be used to verify that each value node is smaller than all the nodes that have the focus node as subject and the value of a given property as predicate."
  {:db/ident :sh/LessThanConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to verify that each value node is smaller than all the nodes that have the focus node as subject and the value of a given property as predicate.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Less-than constraint component@en",
   :sh/parameter :sh/LessThanConstraintComponent-lessThan})

(def LessThanConstraintComponent-lessThan
  {:db/ident         :sh/LessThanConstraintComponent-lessThan,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/nodeKind      :sh/IRI,
   :sh/path          :sh/lessThan})

(def LessThanOrEqualsConstraintComponent
  "A constraint component that can be used to verify that every value node is smaller than all the nodes that have the focus node as subject and the value of a given property as predicate."
  {:db/ident :sh/LessThanOrEqualsConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to verify that every value node is smaller than all the nodes that have the focus node as subject and the value of a given property as predicate.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "less-than-or-equals constraint component@en",
   :sh/parameter :sh/LessThanOrEqualsConstraintComponent-lessThanOrEquals})

(def LessThanOrEqualsConstraintComponent-lessThanOrEquals
  {:db/ident         :sh/LessThanOrEqualsConstraintComponent-lessThanOrEquals,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/nodeKind      :sh/IRI,
   :sh/path          :sh/lessThanOrEquals})

(def Literal
  "The node kind of all literals."
  {:db/ident         :sh/Literal,
   :rdf/type         [:sh/NodeKind :rdfs/Resource],
   :rdfs/comment     #xsd/langString "The node kind of all literals.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "Literal@en"})

(def MaxCountConstraintComponent
  "A constraint component that can be used to restrict the maximum number of value nodes."
  {:db/ident :sh/MaxCountConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to restrict the maximum number of value nodes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Max-count constraint component@en",
   :sh/parameter :sh/MaxCountConstraintComponent-maxCount})

(def MaxCountConstraintComponent-maxCount
  {:db/ident         :sh/MaxCountConstraintComponent-maxCount,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/datatype      :xsd/integer,
   :sh/maxCount      #xsd/integer 1,
   :sh/path          :sh/maxCount})

(def MaxExclusiveConstraintComponent
  "A constraint component that can be used to restrict the range of value nodes with a maximum exclusive value."
  {:db/ident :sh/MaxExclusiveConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to restrict the range of value nodes with a maximum exclusive value.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Max-exclusive constraint component@en",
   :sh/parameter :sh/MaxExclusiveConstraintComponent-maxExclusive})

(def MaxExclusiveConstraintComponent-maxExclusive
  {:db/ident         :sh/MaxExclusiveConstraintComponent-maxExclusive,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/maxCount      #xsd/integer 1,
   :sh/nodeKind      :sh/Literal,
   :sh/path          :sh/maxExclusive})

(def MaxInclusiveConstraintComponent
  "A constraint component that can be used to restrict the range of value nodes with a maximum inclusive value."
  {:db/ident :sh/MaxInclusiveConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to restrict the range of value nodes with a maximum inclusive value.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Max-inclusive constraint component@en",
   :sh/parameter :sh/MaxInclusiveConstraintComponent-maxInclusive})

(def MaxInclusiveConstraintComponent-maxInclusive
  {:db/ident         :sh/MaxInclusiveConstraintComponent-maxInclusive,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/maxCount      #xsd/integer 1,
   :sh/nodeKind      :sh/Literal,
   :sh/path          :sh/maxInclusive})

(def MaxLengthConstraintComponent
  "A constraint component that can be used to restrict the maximum string length of value nodes."
  {:db/ident :sh/MaxLengthConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to restrict the maximum string length of value nodes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Max-length constraint component@en",
   :sh/parameter :sh/MaxLengthConstraintComponent-maxLength})

(def MaxLengthConstraintComponent-maxLength
  {:db/ident         :sh/MaxLengthConstraintComponent-maxLength,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/datatype      :xsd/integer,
   :sh/maxCount      #xsd/integer 1,
   :sh/path          :sh/maxLength})

(def MinCountConstraintComponent
  "A constraint component that can be used to restrict the minimum number of value nodes."
  {:db/ident :sh/MinCountConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to restrict the minimum number of value nodes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Min-count constraint component@en",
   :sh/parameter :sh/MinCountConstraintComponent-minCount})

(def MinCountConstraintComponent-minCount
  {:db/ident         :sh/MinCountConstraintComponent-minCount,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/datatype      :xsd/integer,
   :sh/maxCount      #xsd/integer 1,
   :sh/path          :sh/minCount})

(def MinExclusiveConstraintComponent
  "A constraint component that can be used to restrict the range of value nodes with a minimum exclusive value."
  {:db/ident :sh/MinExclusiveConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to restrict the range of value nodes with a minimum exclusive value.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Min-exclusive constraint component@en",
   :sh/parameter :sh/MinExclusiveConstraintComponent-minExclusive})

(def MinExclusiveConstraintComponent-minExclusive
  {:db/ident         :sh/MinExclusiveConstraintComponent-minExclusive,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/maxCount      #xsd/integer 1,
   :sh/nodeKind      :sh/Literal,
   :sh/path          :sh/minExclusive})

(def MinInclusiveConstraintComponent
  "A constraint component that can be used to restrict the range of value nodes with a minimum inclusive value."
  {:db/ident :sh/MinInclusiveConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to restrict the range of value nodes with a minimum inclusive value.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Min-inclusive constraint component@en",
   :sh/parameter :sh/MinInclusiveConstraintComponent-minInclusive})

(def MinInclusiveConstraintComponent-minInclusive
  {:db/ident         :sh/MinInclusiveConstraintComponent-minInclusive,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/maxCount      #xsd/integer 1,
   :sh/nodeKind      :sh/Literal,
   :sh/path          :sh/minInclusive})

(def MinLengthConstraintComponent
  "A constraint component that can be used to restrict the minimum string length of value nodes."
  {:db/ident :sh/MinLengthConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to restrict the minimum string length of value nodes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Min-length constraint component@en",
   :sh/parameter :sh/MinLengthConstraintComponent-minLength})

(def MinLengthConstraintComponent-minLength
  {:db/ident         :sh/MinLengthConstraintComponent-minLength,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/datatype      :xsd/integer,
   :sh/maxCount      #xsd/integer 1,
   :sh/path          :sh/minLength})

(def NodeConstraintComponent
  "A constraint component that can be used to verify that all value nodes conform to the given node shape."
  {:db/ident :sh/NodeConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to verify that all value nodes conform to the given node shape.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Node constraint component@en",
   :sh/parameter :sh/NodeConstraintComponent-node})

(def NodeConstraintComponent-node
  {:db/ident         :sh/NodeConstraintComponent-node,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/path          :sh/node})

(def NodeKind
  "The class of all node kinds, including sh:BlankNode, sh:IRI, sh:Literal or the combinations of these: sh:BlankNodeOrIRI, sh:BlankNodeOrLiteral, sh:IRIOrLiteral."
  {:db/ident :sh/NodeKind,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "The class of all node kinds, including sh:BlankNode, sh:IRI, sh:Literal or the combinations of these: sh:BlankNodeOrIRI, sh:BlankNodeOrLiteral, sh:IRIOrLiteral.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Node kind@en",
   :rdfs/subClassOf :rdfs/Resource})

(def NodeKindConstraintComponent
  "A constraint component that can be used to restrict the RDF node kind of each value node."
  {:db/ident :sh/NodeKindConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to restrict the RDF node kind of each value node.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Node-kind constraint component@en",
   :sh/parameter :sh/NodeKindConstraintComponent-nodeKind})

(def NodeKindConstraintComponent-nodeKind
  {:db/ident         :sh/NodeKindConstraintComponent-nodeKind,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/in            [:sh/BlankNode
                      :sh/IRI
                      :sh/Literal
                      :sh/BlankNodeOrIRI
                      :sh/BlankNodeOrLiteral
                      :sh/IRIOrLiteral],
   :sh/maxCount      #xsd/integer 1,
   :sh/path          :sh/nodeKind})

(def NodeShape
  "A node shape is a shape that specifies constraint that need to be met with respect to focus nodes."
  {:db/ident :sh/NodeShape,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "A node shape is a shape that specifies constraint that need to be met with respect to focus nodes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Node shape@en",
   :rdfs/subClassOf [:sh/Shape :rdfs/Resource]})

(def NotConstraintComponent
  "A constraint component that can be used to verify that value nodes do not conform to a given shape."
  {:db/ident :sh/NotConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to verify that value nodes do not conform to a given shape.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Not constraint component@en",
   :sh/parameter :sh/NotConstraintComponent-not})

(def NotConstraintComponent-not
  {:db/ident         :sh/NotConstraintComponent-not,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/path          :sh/not})

(def OrConstraintComponent
  "A constraint component that can be used to restrict the value nodes so that they conform to at least one out of several provided shapes."
  {:db/ident :sh/OrConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to restrict the value nodes so that they conform to at least one out of several provided shapes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Or constraint component@en",
   :sh/parameter :sh/OrConstraintComponent-or})

(def OrConstraintComponent-or
  {:db/ident         :sh/OrConstraintComponent-or,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/path          :sh/or})

(def Parameter
  "The class of parameter declarations, consisting of a path predicate and (possibly) information about allowed value type, cardinality and other characteristics."
  {:db/ident :sh/Parameter,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "The class of parameter declarations, consisting of a path predicate and (possibly) information about allowed value type, cardinality and other characteristics.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Parameter@en",
   :rdfs/subClassOf [:sh/PropertyShape :rdfs/Resource :sh/Shape]})

(def Parameterizable
  "Superclass of components that can take parameters, especially functions and constraint components."
  {:db/ident :sh/Parameterizable,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "Superclass of components that can take parameters, especially functions and constraint components.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Parameterizable@en",
   :rdfs/subClassOf :rdfs/Resource})

(def PatternConstraintComponent
  "A constraint component that can be used to verify that every value node matches a given regular expression."
  {:db/ident :sh/PatternConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to verify that every value node matches a given regular expression.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Pattern constraint component@en",
   :sh/parameter [:sh/PatternConstraintComponent-flags
                  :sh/PatternConstraintComponent-pattern]})

(def PatternConstraintComponent-flags
  {:db/ident         :sh/PatternConstraintComponent-flags,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/datatype      :xsd/string,
   :sh/optional      #xsd/boolean true,
   :sh/path          :sh/flags})

(def PatternConstraintComponent-pattern
  {:db/ident         :sh/PatternConstraintComponent-pattern,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/datatype      :xsd/string,
   :sh/path          :sh/pattern})

(def PrefixDeclaration
  "The class of prefix declarations, consisting of pairs of a prefix with a namespace."
  {:db/ident :sh/PrefixDeclaration,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "The class of prefix declarations, consisting of pairs of a prefix with a namespace.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Prefix declaration@en",
   :rdfs/subClassOf :rdfs/Resource})

(def PropertyConstraintComponent
  "A constraint component that can be used to verify that all value nodes conform to the given property shape."
  {:db/ident :sh/PropertyConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to verify that all value nodes conform to the given property shape.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Property constraint component@en",
   :sh/parameter :sh/PropertyConstraintComponent-property})

(def PropertyConstraintComponent-property
  {:db/ident         :sh/PropertyConstraintComponent-property,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/path          :sh/property})

(def PropertyGroup
  "Instances of this class represent groups of property shapes that belong together."
  {:db/ident :sh/PropertyGroup,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "Instances of this class represent groups of property shapes that belong together.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Property group@en",
   :rdfs/subClassOf :rdfs/Resource})

(def PropertyShape
  "A property shape is a shape that specifies constraints on the values of a focus node for a given property or path."
  {:db/ident :sh/PropertyShape,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "A property shape is a shape that specifies constraints on the values of a focus node for a given property or path.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Property shape@en",
   :rdfs/subClassOf [:sh/Shape :rdfs/Resource]})

(def QualifiedMaxCountConstraintComponent
  "A constraint component that can be used to verify that a specified maximum number of value nodes conforms to a given shape."
  {:db/ident :sh/QualifiedMaxCountConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to verify that a specified maximum number of value nodes conforms to a given shape.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Qualified-max-count constraint component@en",
   :sh/parameter
   [:sh/QualifiedMaxCountConstraintComponent-qualifiedValueShapesDisjoint
    :sh/QualifiedMaxCountConstraintComponent-qualifiedValueShape
    :sh/QualifiedMaxCountConstraintComponent-qualifiedMaxCount]})

(def QualifiedMaxCountConstraintComponent-qualifiedMaxCount
  {:db/ident         :sh/QualifiedMaxCountConstraintComponent-qualifiedMaxCount,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/datatype      :xsd/integer,
   :sh/path          :sh/qualifiedMaxCount})

(def QualifiedMaxCountConstraintComponent-qualifiedValueShape
  {:db/ident :sh/QualifiedMaxCountConstraintComponent-qualifiedValueShape,
   :rdf/type [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/path :sh/qualifiedValueShape})

(def QualifiedMaxCountConstraintComponent-qualifiedValueShapesDisjoint
  {:db/ident
   :sh/QualifiedMaxCountConstraintComponent-qualifiedValueShapesDisjoint,
   :rdf/type [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/datatype :xsd/boolean,
   :sh/optional #xsd/boolean true,
   :sh/path :sh/qualifiedValueShapesDisjoint})

(def QualifiedMinCountConstraintComponent
  "A constraint component that can be used to verify that a specified minimum number of value nodes conforms to a given shape."
  {:db/ident :sh/QualifiedMinCountConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to verify that a specified minimum number of value nodes conforms to a given shape.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Qualified-min-count constraint component@en",
   :sh/parameter
   [:sh/QualifiedMinCountConstraintComponent-qualifiedValueShapesDisjoint
    :sh/QualifiedMinCountConstraintComponent-qualifiedValueShape
    :sh/QualifiedMinCountConstraintComponent-qualifiedMinCount]})

(def QualifiedMinCountConstraintComponent-qualifiedMinCount
  {:db/ident         :sh/QualifiedMinCountConstraintComponent-qualifiedMinCount,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/datatype      :xsd/integer,
   :sh/path          :sh/qualifiedMinCount})

(def QualifiedMinCountConstraintComponent-qualifiedValueShape
  {:db/ident :sh/QualifiedMinCountConstraintComponent-qualifiedValueShape,
   :rdf/type [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/path :sh/qualifiedValueShape})

(def QualifiedMinCountConstraintComponent-qualifiedValueShapesDisjoint
  {:db/ident
   :sh/QualifiedMinCountConstraintComponent-qualifiedValueShapesDisjoint,
   :rdf/type [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/datatype :xsd/boolean,
   :sh/optional #xsd/boolean true,
   :sh/path :sh/qualifiedValueShapesDisjoint})

(def ResultAnnotation
  "A class of result annotations, which define the rules to derive the values of a given annotation property as extra values for a validation result."
  {:db/ident :sh/ResultAnnotation,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "A class of result annotations, which define the rules to derive the values of a given annotation property as extra values for a validation result.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Result annotation@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Rule
  "The class of SHACL rules. Never instantiated directly."
  {:db/ident :sh/Rule,
   :rdf/type :rdfs/Class,
   :rdfs/comment #xsd/langString
                  "The class of SHACL rules. Never instantiated directly.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Rule@en",
   :rdfs/subClassOf :rdfs/Resource})

(def SPARQLAskExecutable
  "The class of SPARQL executables that are based on an ASK query."
  {:db/ident :sh/SPARQLAskExecutable,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "The class of SPARQL executables that are based on an ASK query.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "SPARQL ASK executable@en",
   :rdfs/subClassOf [:sh/SPARQLExecutable :rdfs/Resource]})

(def SPARQLAskValidator
  "The class of validators based on SPARQL ASK queries. The queries are evaluated for each value node and are supposed to return true if the given node conforms."
  {:db/ident :sh/SPARQLAskValidator,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "The class of validators based on SPARQL ASK queries. The queries are evaluated for each value node and are supposed to return true if the given node conforms.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "SPARQL ASK validator@en",
   :rdfs/subClassOf
   [:sh/SPARQLAskExecutable :sh/Validator :rdfs/Resource :sh/SPARQLExecutable]})

(def SPARQLConstraint
  "The class of constraints based on SPARQL SELECT queries."
  {:db/ident :sh/SPARQLConstraint,
   :rdf/type :rdfs/Class,
   :rdfs/comment #xsd/langString
                  "The class of constraints based on SPARQL SELECT queries.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "SPARQL constraint@en",
   :rdfs/subClassOf
   [:sh/SPARQLSelectExecutable :rdfs/Resource :sh/SPARQLExecutable]})

(def SPARQLConstraintComponent
  "A constraint component that can be used to define constraints based on SPARQL queries."
  {:db/ident :sh/SPARQLConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to define constraints based on SPARQL queries.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "SPARQL constraint component@en",
   :sh/parameter :sh/SPARQLConstraintComponent-sparql})

(def SPARQLConstraintComponent-sparql
  {:db/ident         :sh/SPARQLConstraintComponent-sparql,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/path          :sh/sparql})

(def SPARQLConstructExecutable
  "The class of SPARQL executables that are based on a CONSTRUCT query."
  {:db/ident :sh/SPARQLConstructExecutable,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "The class of SPARQL executables that are based on a CONSTRUCT query.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "SPARQL CONSTRUCT executable@en",
   :rdfs/subClassOf [:sh/SPARQLExecutable :rdfs/Resource]})

(def SPARQLExecutable
  "The class of resources that encapsulate a SPARQL query."
  {:db/ident :sh/SPARQLExecutable,
   :rdf/type :rdfs/Class,
   :rdfs/comment #xsd/langString
                  "The class of resources that encapsulate a SPARQL query.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "SPARQL executable@en",
   :rdfs/subClassOf :rdfs/Resource})

(def SPARQLFunction
  "A function backed by a SPARQL query - either ASK or SELECT."
  {:db/ident :sh/SPARQLFunction,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "A function backed by a SPARQL query - either ASK or SELECT.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "SPARQL function@en",
   :rdfs/subClassOf [:sh/SPARQLSelectExecutable
                     :sh/SPARQLAskExecutable
                     :sh/Function
                     :sh/Parameterizable
                     :rdfs/Resource
                     :sh/SPARQLExecutable]})

(def SPARQLRule
  "The class of SHACL rules based on SPARQL CONSTRUCT queries."
  {:db/ident :sh/SPARQLRule,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "The class of SHACL rules based on SPARQL CONSTRUCT queries.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "SPARQL CONSTRUCT rule@en",
   :rdfs/subClassOf [:sh/SPARQLConstructExecutable
                     :sh/Rule
                     :rdfs/Resource
                     :sh/SPARQLExecutable]})

(def SPARQLSelectExecutable
  "The class of SPARQL executables based on a SELECT query."
  {:db/ident :sh/SPARQLSelectExecutable,
   :rdf/type :rdfs/Class,
   :rdfs/comment #xsd/langString
                  "The class of SPARQL executables based on a SELECT query.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "SPARQL SELECT executable@en",
   :rdfs/subClassOf [:sh/SPARQLExecutable :rdfs/Resource]})

(def SPARQLSelectValidator
  "The class of validators based on SPARQL SELECT queries. The queries are evaluated for each focus node and are supposed to produce bindings for all focus nodes that do not conform."
  {:db/ident :sh/SPARQLSelectValidator,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "The class of validators based on SPARQL SELECT queries. The queries are evaluated for each focus node and are supposed to produce bindings for all focus nodes that do not conform.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "SPARQL SELECT validator@en",
   :rdfs/subClassOf [:sh/SPARQLSelectExecutable
                     :sh/Validator
                     :rdfs/Resource
                     :sh/SPARQLExecutable]})

(def SPARQLTarget
  "The class of targets that are based on SPARQL queries."
  {:db/ident :sh/SPARQLTarget,
   :rdf/type :rdfs/Class,
   :rdfs/comment #xsd/langString
                  "The class of targets that are based on SPARQL queries.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "SPARQL target@en",
   :rdfs/subClassOf [:sh/SPARQLSelectExecutable
                     :sh/SPARQLAskExecutable
                     :sh/Target
                     :rdfs/Resource
                     :sh/SPARQLExecutable]})

(def SPARQLTargetType
  "The (meta) class for parameterizable targets that are based on SPARQL queries."
  {:db/ident :sh/SPARQLTargetType,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "The (meta) class for parameterizable targets that are based on SPARQL queries.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "SPARQL target type@en",
   :rdfs/subClassOf [:sh/SPARQLSelectExecutable
                     :sh/SPARQLAskExecutable
                     :sh/TargetType
                     :sh/Parameterizable
                     :rdfs/Class
                     :rdfs/Resource
                     :sh/SPARQLExecutable]})

(def SPARQLUpdateExecutable
  "The class of SPARQL executables based on a SPARQL UPDATE."
  {:db/ident :sh/SPARQLUpdateExecutable,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "The class of SPARQL executables based on a SPARQL UPDATE.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "SPARQL UPDATE executable@en",
   :rdfs/subClassOf [:sh/SPARQLExecutable :rdfs/Resource]})

(def Severity
  "The class of validation result severity levels, including violation and warning levels."
  {:db/ident :sh/Severity,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "The class of validation result severity levels, including violation and warning levels.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Severity@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Shape
  "A shape is a collection of constraints that may be targeted for certain nodes."
  {:db/ident :sh/Shape,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "A shape is a collection of constraints that may be targeted for certain nodes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Shape@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Target
  "The base class of targets such as those based on SPARQL queries."
  {:db/ident :sh/Target,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "The base class of targets such as those based on SPARQL queries.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Target@en",
   :rdfs/subClassOf :rdfs/Resource})

(def TargetType
  "The (meta) class for parameterizable targets.\tInstances of this are instantiated as values of the sh:target property."
  {:db/ident :sh/TargetType,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "The (meta) class for parameterizable targets.\tInstances of this are instantiated as values of the sh:target property.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Target type@en",
   :rdfs/subClassOf [:sh/Parameterizable :rdfs/Class :rdfs/Resource]})

(def TripleRule
  "A rule based on triple (subject, predicate, object) pattern."
  {:db/ident :sh/TripleRule,
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label
   #xsd/langString
    "A rule based on triple (subject, predicate, object) pattern.@en",
   :rdfs/subClassOf [:sh/Rule :rdfs/Resource]})

(def UniqueLangConstraintComponent
  "A constraint component that can be used to specify that no pair of value nodes may use the same language tag."
  {:db/ident :sh/UniqueLangConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to specify that no pair of value nodes may use the same language tag.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Unique-languages constraint component@en",
   :sh/parameter :sh/UniqueLangConstraintComponent-uniqueLang})

(def UniqueLangConstraintComponent-uniqueLang
  {:db/ident         :sh/UniqueLangConstraintComponent-uniqueLang,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/datatype      :xsd/boolean,
   :sh/maxCount      #xsd/integer 1,
   :sh/path          :sh/uniqueLang})

(def ValidationReport
  "The class of SHACL validation reports."
  {:db/ident         :sh/ValidationReport,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #xsd/langString
                      "The class of SHACL validation reports.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "Validation report@en",
   :rdfs/subClassOf  :rdfs/Resource})

(def ValidationResult
  "The class of validation results."
  {:db/ident         :sh/ValidationResult,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     #xsd/langString "The class of validation results.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "Validation result@en",
   :rdfs/subClassOf  [:sh/AbstractResult :rdfs/Resource]})

(def Validator
  "The class of validators, which provide instructions on how to process a constraint definition. This class serves as base class for the SPARQL-based validators and other possible implementations."
  {:db/ident :sh/Validator,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/langString
    "The class of validators, which provide instructions on how to process a constraint definition. This class serves as base class for the SPARQL-based validators and other possible implementations.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Validator@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Violation
  "The severity for a violation validation result."
  {:db/ident         :sh/Violation,
   :rdf/type         [:sh/Severity :rdfs/Resource],
   :rdfs/comment     #xsd/langString
                      "The severity for a violation validation result.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "Violation@en"})

(def Warning
  "The severity for a warning validation result."
  {:db/ident         :sh/Warning,
   :rdf/type         [:sh/Severity :rdfs/Resource],
   :rdfs/comment     #xsd/langString
                      "The severity for a warning validation result.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "Warning@en"})

(def XoneConstraintComponent
  "A constraint component that can be used to restrict the value nodes so that they conform to exactly one out of several provided shapes."
  {:db/ident :sh/XoneConstraintComponent,
   :rdf/type [:sh/ConstraintComponent :sh/Parameterizable :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "A constraint component that can be used to restrict the value nodes so that they conform to exactly one out of several provided shapes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "Exactly one constraint component@en",
   :sh/parameter :sh/XoneConstraintComponent-xone})

(def XoneConstraintComponent-xone
  {:db/ident         :sh/XoneConstraintComponent-xone,
   :rdf/type         [:sh/Parameter :sh/PropertyShape :rdfs/Resource :sh/Shape],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :sh/path          :sh/xone})

(def alternativePath
  "The (single) value of this property must be a list of path elements, representing the elements of alternative paths."
  {:db/ident :sh/alternativePath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The (single) value of this property must be a list of path elements, representing the elements of alternative paths.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "alternative path@en",
   :rdfs/range :rdf/List})

(def and
  "RDF list of shapes to validate the value nodes against."
  {:db/ident :sh/and,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment #xsd/langString
                  "RDF list of shapes to validate the value nodes against.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "and@en",
   :rdfs/range :rdf/List})

(def annotationProperty
  "The annotation property that shall be set."
  {:db/ident         :sh/annotationProperty,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString
                      "The annotation property that shall be set.@en",
   :rdfs/domain      :sh/ResultAnnotation,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "annotation property@en",
   :rdfs/range       :rdf/Property})

(def annotationValue
  "The (default) values of the annotation property."
  {:db/ident         :sh/annotationValue,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString
                      "The (default) values of the annotation property.@en",
   :rdfs/domain      :sh/ResultAnnotation,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "annotation value@en"})

(def annotationVarName
  "The name of the SPARQL variable from the SELECT clause that shall be used for the values."
  {:db/ident :sh/annotationVarName,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The name of the SPARQL variable from the SELECT clause that shall be used for the values.@en",
   :rdfs/domain :sh/ResultAnnotation,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "annotation variable name@en",
   :rdfs/range :xsd/string})

(def ask
  "The SPARQL ASK query to execute."
  {:db/ident         :sh/ask,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString "The SPARQL ASK query to execute.@en",
   :rdfs/domain      :sh/SPARQLAskExecutable,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "ask@en",
   :rdfs/range       :xsd/string})

(def class
  "The type that all value nodes must have."
  {:db/ident         :sh/class,
   :rdf/type         [:rdf/Property :rdfs/Resource],
   :rdfs/comment     #xsd/langString
                      "The type that all value nodes must have.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "class@en",
   :rdfs/range       :rdfs/Class})

(def closed
  "If set to true then the shape is closed."
  {:db/ident         :sh/closed,
   :rdf/type         [:rdf/Property :rdfs/Resource],
   :rdfs/comment     #xsd/langString
                      "If set to true then the shape is closed.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "closed@en",
   :rdfs/range       :xsd/boolean})

(def condition
  "The shapes that the focus nodes need to conform to before a rule is executed on them."
  {:db/ident :sh/condition,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The shapes that the focus nodes need to conform to before a rule is executed on them.@en",
   :rdfs/domain :sh/Rule,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "condition@en",
   :rdfs/range :sh/Shape})

(def conforms
  "True if the validation did not produce any validation results, and false otherwise."
  {:db/ident :sh/conforms,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "True if the validation did not produce any validation results, and false otherwise.@en",
   :rdfs/domain :sh/ValidationReport,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "conforms@en",
   :rdfs/range :xsd/boolean})

(def construct
  "The SPARQL CONSTRUCT query to execute."
  {:db/ident         :sh/construct,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString
                      "The SPARQL CONSTRUCT query to execute.@en",
   :rdfs/domain      :sh/SPARQLConstructExecutable,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "construct@en",
   :rdfs/range       :xsd/string})

(def datatype
  "Specifies an RDF datatype that all value nodes must have."
  {:db/ident :sh/datatype,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Specifies an RDF datatype that all value nodes must have.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "datatype@en",
   :rdfs/range :rdfs/Datatype})

(def deactivated
  "If set to true then all nodes conform to this."
  {:db/ident         :sh/deactivated,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString
                      "If set to true then all nodes conform to this.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "deactivated@en",
   :rdfs/range       :xsd/boolean})

(def declare
  "Links a resource with its namespace prefix declarations."
  {:db/ident :sh/declare,
   :rdf/type :rdf/Property,
   :rdfs/comment #xsd/langString
                  "Links a resource with its namespace prefix declarations.@en",
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "declare@en",
   :rdfs/range :sh/PrefixDeclaration})

(def defaultValue
  "A default value for a property, for example for user interface tools to pre-populate input fields."
  {:db/ident :sh/defaultValue,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A default value for a property, for example for user interface tools to pre-populate input fields.@en",
   :rdfs/domain :sh/PropertyShape,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "default value@en"})

(def description
  "Human-readable descriptions for the property in the context of the surrounding shape."
  {:db/ident :sh/description,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Human-readable descriptions for the property in the context of the surrounding shape.@en",
   :rdfs/domain :sh/PropertyShape,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "description@en"})

(def detail
  "Links a result with other results that provide more details, for example to describe violations against nested shapes."
  {:db/ident :sh/detail,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Links a result with other results that provide more details, for example to describe violations against nested shapes.@en",
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "detail@en",
   :rdfs/range :sh/AbstractResult})

(def disjoint
  "Specifies a property where the set of values must be disjoint with the value nodes."
  {:db/ident :sh/disjoint,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Specifies a property where the set of values must be disjoint with the value nodes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "disjoint@en",
   :rdfs/range :rdf/Property})

(def entailment
  "An entailment regime that indicates what kind of inferencing is required by a shapes graph."
  {:db/ident :sh/entailment,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An entailment regime that indicates what kind of inferencing is required by a shapes graph.@en",
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "entailment@en",
   :rdfs/range :rdfs/Resource})

(def equals
  "Specifies a property that must have the same values as the value nodes."
  {:db/ident :sh/equals,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Specifies a property that must have the same values as the value nodes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "equals@en",
   :rdfs/range :rdf/Property})

(def expression
  "The node expression that must return true for the value nodes."
  {:db/ident :sh/expression,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "The node expression that must return true for the value nodes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "expression@en"})

(def filterShape
  "The shape that all input nodes of the expression need to conform to."
  {:db/ident :sh/filterShape,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The shape that all input nodes of the expression need to conform to.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "filter shape@en",
   :rdfs/range :sh/Shape})

(def flags
  "An optional flag to be used with regular expression pattern matching."
  {:db/ident :sh/flags,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "An optional flag to be used with regular expression pattern matching.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "flags@en",
   :rdfs/range :xsd/string})

(def focusNode
  "The focus node that was validated when the result was produced."
  {:db/ident :sh/focusNode,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The focus node that was validated when the result was produced.@en",
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "focus node@en"})

(def group
  "Can be used to link to a property group to indicate that a property shape belongs to a group of related property shapes."
  {:db/ident :sh/group,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Can be used to link to a property group to indicate that a property shape belongs to a group of related property shapes.@en",
   :rdfs/domain :sh/PropertyShape,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "group@en",
   :rdfs/range :sh/PropertyGroup})

(def hasValue
  "Specifies a value that must be among the value nodes."
  {:db/ident :sh/hasValue,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment #xsd/langString
                  "Specifies a value that must be among the value nodes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "has value@en"})

(def ignoredProperties
  "An optional RDF list of properties that are also permitted in addition to those explicitly enumerated via sh:property/sh:path."
  {:db/ident :sh/ignoredProperties,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "An optional RDF list of properties that are also permitted in addition to those explicitly enumerated via sh:property/sh:path.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "ignored properties@en",
   :rdfs/range :rdf/List})

(def in
  "Specifies a list of allowed values so that each value node must be among the members of the given list."
  {:db/ident :sh/in,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Specifies a list of allowed values so that each value node must be among the members of the given list.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "in@en",
   :rdfs/range :rdf/List})

(def intersection
  "A list of node expressions that shall be intersected."
  {:db/ident :sh/intersection,
   :rdf/type :rdf/Property,
   :rdfs/comment #xsd/langString
                  "A list of node expressions that shall be intersected.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "intersection@en"})

(def inversePath
  "The (single) value of this property represents an inverse path (object to subject)."
  {:db/ident :sh/inversePath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The (single) value of this property represents an inverse path (object to subject).@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "inverse path@en",
   :rdfs/range :rdfs/Resource})

(def js
  "Constraints expressed in JavaScript."
  {:db/ident         :sh/js,
   :rdf/type         [:rdf/Property :rdfs/Resource],
   :rdfs/comment     #xsd/string "Constraints expressed in JavaScript.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "JavaScript constraint@en",
   :rdfs/range       :sh/JSConstraint})

(def jsFunctionName
  "The name of the JavaScript function to execute."
  {:db/ident         :sh/jsFunctionName,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString
                      "The name of the JavaScript function to execute.@en",
   :rdfs/domain      :sh/JSExecutable,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "JavaScript function name@en",
   :rdfs/range       :xsd/string})

(def jsLibrary
  "Declares which JavaScript libraries are needed to execute this."
  {:db/ident :sh/jsLibrary,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Declares which JavaScript libraries are needed to execute this.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "JavaScript library@en",
   :rdfs/range :sh/JSLibrary})

(def jsLibraryURL
  "Declares the URLs of a JavaScript library. This should be the absolute URL of a JavaScript file. Implementations may redirect those to local files."
  {:db/ident :sh/jsLibraryURL,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Declares the URLs of a JavaScript library. This should be the absolute URL of a JavaScript file. Implementations may redirect those to local files.@en",
   :rdfs/domain :sh/JSLibrary,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "JavaScript library URL@en",
   :rdfs/range :xsd/anyURI})

(def labelTemplate
  "Outlines how human-readable labels of instances of the associated Parameterizable shall be produced. The values can contain {?paramName} as placeholders for the actual values of the given parameter."
  {:db/ident :sh/labelTemplate,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Outlines how human-readable labels of instances of the associated Parameterizable shall be produced. The values can contain {?paramName} as placeholders for the actual values of the given parameter.@en",
   :rdfs/domain :sh/Parameterizable,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "label template@en"})

(def languageIn
  "Specifies a list of language tags that all value nodes must have."
  {:db/ident :sh/languageIn,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Specifies a list of language tags that all value nodes must have.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "language in@en",
   :rdfs/range :rdf/List})

(def lessThan
  "Specifies a property that must have smaller values than the value nodes."
  {:db/ident :sh/lessThan,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Specifies a property that must have smaller values than the value nodes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "less than@en",
   :rdfs/range :rdf/Property})

(def lessThanOrEquals
  "Specifies a property that must have smaller or equal values than the value nodes."
  {:db/ident :sh/lessThanOrEquals,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Specifies a property that must have smaller or equal values than the value nodes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "less than or equals@en",
   :rdfs/range :rdf/Property})

(def maxCount
  "Specifies the maximum number of values in the set of value nodes."
  {:db/ident :sh/maxCount,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Specifies the maximum number of values in the set of value nodes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "max count@en",
   :rdfs/range :xsd/integer})

(def maxExclusive
  "Specifies the maximum exclusive value of each value node."
  {:db/ident :sh/maxExclusive,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Specifies the maximum exclusive value of each value node.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "max exclusive@en"})

(def maxInclusive
  "Specifies the maximum inclusive value of each value node."
  {:db/ident :sh/maxInclusive,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Specifies the maximum inclusive value of each value node.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "max inclusive@en"})

(def maxLength
  "Specifies the maximum string length of each value node."
  {:db/ident :sh/maxLength,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment #xsd/langString
                  "Specifies the maximum string length of each value node.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "max length@en",
   :rdfs/range :xsd/integer})

(def message
  "A human-readable message (possibly with placeholders for variables) explaining the cause of the result."
  {:db/ident :sh/message,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A human-readable message (possibly with placeholders for variables) explaining the cause of the result.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "message@en"})

(def minCount
  "Specifies the minimum number of values in the set of value nodes."
  {:db/ident :sh/minCount,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Specifies the minimum number of values in the set of value nodes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "min count@en",
   :rdfs/range :xsd/integer})

(def minExclusive
  "Specifies the minimum exclusive value of each value node."
  {:db/ident :sh/minExclusive,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Specifies the minimum exclusive value of each value node.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "min exclusive@en"})

(def minInclusive
  "Specifies the minimum inclusive value of each value node."
  {:db/ident :sh/minInclusive,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Specifies the minimum inclusive value of each value node.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "min inclusive@en"})

(def minLength
  "Specifies the minimum string length of each value node."
  {:db/ident :sh/minLength,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment #xsd/langString
                  "Specifies the minimum string length of each value node.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "min length@en",
   :rdfs/range :xsd/integer})

(def name
  "Human-readable labels for the property in the context of the surrounding shape."
  {:db/ident :sh/name,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Human-readable labels for the property in the context of the surrounding shape.@en",
   :rdfs/domain :sh/PropertyShape,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "name@en"})

(def namespace
  "The namespace associated with a prefix in a prefix declaration."
  {:db/ident :sh/namespace,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The namespace associated with a prefix in a prefix declaration.@en",
   :rdfs/domain :sh/PrefixDeclaration,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "namespace@en",
   :rdfs/range :xsd/anyURI})

(def node
  "Specifies the node shape that all value nodes must conform to."
  {:db/ident :sh/node,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Specifies the node shape that all value nodes must conform to.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "node@en",
   :rdfs/range :sh/NodeShape})

(def nodeKind
  "Specifies the node kind (e.g. IRI or literal) each value node."
  {:db/ident :sh/nodeKind,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Specifies the node kind (e.g. IRI or literal) each value node.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "node kind@en",
   :rdfs/range :sh/NodeKind})

(def nodeValidator
  "The validator(s) used to evaluate a constraint in the context of a node shape."
  {:db/ident :sh/nodeValidator,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The validator(s) used to evaluate a constraint in the context of a node shape.@en",
   :rdfs/domain :sh/ConstraintComponent,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "shape validator@en",
   :rdfs/range :sh/Validator})

(def nodes
  "The node expression producing the input nodes of a filter shape expression."
  {:db/ident :sh/nodes,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The node expression producing the input nodes of a filter shape expression.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "nodes@en"})

(def not
  "Specifies a shape that the value nodes must not conform to."
  {:db/ident :sh/not,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Specifies a shape that the value nodes must not conform to.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "not@en",
   :rdfs/range :sh/Shape})

(def object
  "An expression producing the nodes that shall be inferred as objects."
  {:db/ident :sh/object,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An expression producing the nodes that shall be inferred as objects.@en",
   :rdfs/domain :sh/TripleRule,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "object@en"})

(def oneOrMorePath
  "The (single) value of this property represents a path that is matched one or more times."
  {:db/ident :sh/oneOrMorePath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The (single) value of this property represents a path that is matched one or more times.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "one or more path@en",
   :rdfs/range :rdfs/Resource})

(def optional
  "Indicates whether a parameter is optional."
  {:db/ident         :sh/optional,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString
                      "Indicates whether a parameter is optional.@en",
   :rdfs/domain      :sh/Parameter,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "optional@en",
   :rdfs/range       :xsd/boolean})

(def or
  "Specifies a list of shapes so that the value nodes must conform to at least one of the shapes."
  {:db/ident :sh/or,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Specifies a list of shapes so that the value nodes must conform to at least one of the shapes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "or@en",
   :rdfs/range :rdf/List})

(def order
  "Specifies the relative order of this compared to its siblings. For example use 0 for the first, 1 for the second."
  {:db/ident :sh/order,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Specifies the relative order of this compared to its siblings. For example use 0 for the first, 1 for the second.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "order@en"})

(def parameter
  "The parameters of a function or constraint component."
  {:db/ident :sh/parameter,
   :rdf/type :rdf/Property,
   :rdfs/comment #xsd/langString
                  "The parameters of a function or constraint component.@en",
   :rdfs/domain :sh/Parameterizable,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "parameter@en",
   :rdfs/range :sh/Parameter})

(def path
  "Specifies the property path of a property shape."
  {:db/ident         :sh/path,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString
                      "Specifies the property path of a property shape.@en",
   :rdfs/domain      :sh/PropertyShape,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "path@en",
   :rdfs/range       :rdfs/Resource})

(def pattern
  "Specifies a regular expression pattern that the string representations of the value nodes must match."
  {:db/ident :sh/pattern,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Specifies a regular expression pattern that the string representations of the value nodes must match.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "pattern@en",
   :rdfs/range :xsd/string})

(def predicate
  "An expression producing the properties that shall be inferred as predicates."
  {:db/ident :sh/predicate,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An expression producing the properties that shall be inferred as predicates.@en",
   :rdfs/domain :sh/TripleRule,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "predicate@en"})

(def prefix
  "The prefix of a prefix declaration."
  {:db/ident         :sh/prefix,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString "The prefix of a prefix declaration.@en",
   :rdfs/domain      :sh/PrefixDeclaration,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "prefix@en",
   :rdfs/range       :xsd/string})

(def prefixes
  "The prefixes that shall be applied before parsing the associated SPARQL query."
  {:db/ident :sh/prefixes,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The prefixes that shall be applied before parsing the associated SPARQL query.@en",
   :rdfs/domain :sh/SPARQLExecutable,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "prefixes@en",
   :rdfs/range :owl/Ontology})

(def property
  "Links a shape to its property shapes."
  {:db/ident         :sh/property,
   :rdf/type         [:rdf/Property :rdfs/Resource],
   :rdfs/comment     #xsd/langString "Links a shape to its property shapes.@en",
   :rdfs/domain      :sh/Shape,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "property@en",
   :rdfs/range       :sh/PropertyShape})

(def propertyValidator
  "The validator(s) used to evaluate a constraint in the context of a property shape."
  {:db/ident :sh/propertyValidator,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The validator(s) used to evaluate a constraint in the context of a property shape.@en",
   :rdfs/domain :sh/ConstraintComponent,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "property validator@en",
   :rdfs/range :sh/Validator})

(def qualifiedMaxCount
  "The maximum number of value nodes that can conform to the shape."
  {:db/ident :sh/qualifiedMaxCount,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "The maximum number of value nodes that can conform to the shape.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "qualified max count@en",
   :rdfs/range :xsd/integer})

(def qualifiedMinCount
  "The minimum number of value nodes that must conform to the shape."
  {:db/ident :sh/qualifiedMinCount,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "The minimum number of value nodes that must conform to the shape.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "qualified min count@en",
   :rdfs/range :xsd/integer})

(def qualifiedValueShape
  "The shape that a specified number of values must conform to."
  {:db/ident :sh/qualifiedValueShape,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "The shape that a specified number of values must conform to.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "qualified value shape@en",
   :rdfs/range :sh/Shape})

(def qualifiedValueShapesDisjoint
  "Can be used to mark the qualified value shape to be disjoint with its sibling shapes."
  {:db/ident :sh/qualifiedValueShapesDisjoint,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Can be used to mark the qualified value shape to be disjoint with its sibling shapes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "qualified value shapes disjoint@en",
   :rdfs/range :xsd/boolean})

(def result
  "The validation results contained in a validation report."
  {:db/ident :sh/result,
   :rdf/type :rdf/Property,
   :rdfs/comment #xsd/langString
                  "The validation results contained in a validation report.@en",
   :rdfs/domain :sh/ValidationReport,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "result@en",
   :rdfs/range :sh/ValidationResult})

(def resultAnnotation
  "Links a SPARQL validator with zero or more sh:ResultAnnotation instances, defining how to derive additional result properties based on the variables of the SELECT query."
  {:db/ident :sh/resultAnnotation,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Links a SPARQL validator with zero or more sh:ResultAnnotation instances, defining how to derive additional result properties based on the variables of the SELECT query.@en",
   :rdfs/domain :sh/SPARQLSelectValidator,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "result annotation@en",
   :rdfs/range :sh/ResultAnnotation})

(def resultMessage
  "Human-readable messages explaining the cause of the result."
  {:db/ident :sh/resultMessage,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Human-readable messages explaining the cause of the result.@en",
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "result message@en"})

(def resultPath
  "The path of a validation result, based on the path of the validated property shape."
  {:db/ident :sh/resultPath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The path of a validation result, based on the path of the validated property shape.@en",
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "result path@en",
   :rdfs/range :rdfs/Resource})

(def resultSeverity
  "The severity of the result, e.g. warning."
  {:db/ident         :sh/resultSeverity,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString
                      "The severity of the result, e.g. warning.@en",
   :rdfs/domain      :sh/AbstractResult,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "result severity@en",
   :rdfs/range       :sh/Severity})

(def returnType
  "The expected type of values returned by the associated function."
  {:db/ident :sh/returnType,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The expected type of values returned by the associated function.@en",
   :rdfs/domain :sh/Function,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "return type@en",
   :rdfs/range :rdfs/Class})

(def rule
  "The rules linked to a shape."
  {:db/ident         :sh/rule,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString "The rules linked to a shape.@en",
   :rdfs/domain      :sh/Shape,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "rule@en",
   :rdfs/range       :sh/Rule})

(def select
  "The SPARQL SELECT query to execute."
  {:db/ident         :sh/select,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString "The SPARQL SELECT query to execute.@en",
   :rdfs/domain      :sh/SPARQLSelectExecutable,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "select@en",
   :rdfs/range       :xsd/string})

(def severity
  "Defines the severity that validation results produced by a shape must have. Defaults to sh:Violation."
  {:db/ident :sh/severity,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Defines the severity that validation results produced by a shape must have. Defaults to sh:Violation.@en",
   :rdfs/domain :sh/Shape,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "severity@en",
   :rdfs/range :sh/Severity})

(def shapesGraph
  "Shapes graphs that should be used when validating this data graph."
  {:db/ident :sh/shapesGraph,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Shapes graphs that should be used when validating this data graph.@en",
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "shapes graph@en",
   :rdfs/range :owl/Ontology})

(def shapesGraphWellFormed
  "If true then the validation engine was certain that the shapes graph has passed all SHACL syntax requirements during the validation process."
  {:db/ident :sh/shapesGraphWellFormed,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "If true then the validation engine was certain that the shapes graph has passed all SHACL syntax requirements during the validation process.@en",
   :rdfs/domain :sh/ValidationReport,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "shapes graph well-formed@en",
   :rdfs/range :xsd/boolean})

(def sourceConstraint
  "The constraint that was validated when the result was produced."
  {:db/ident :sh/sourceConstraint,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The constraint that was validated when the result was produced.@en",
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "source constraint@en"})

(def sourceConstraintComponent
  "The constraint component that is the source of the result."
  {:db/ident :sh/sourceConstraintComponent,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The constraint component that is the source of the result.@en",
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "source constraint component@en",
   :rdfs/range :sh/ConstraintComponent})

(def sourceShape
  "The shape that is was validated when the result was produced."
  {:db/ident :sh/sourceShape,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The shape that is was validated when the result was produced.@en",
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "source shape@en",
   :rdfs/range :sh/Shape})

(def sparql
  "Links a shape with SPARQL constraints."
  {:db/ident         :sh/sparql,
   :rdf/type         [:rdf/Property :rdfs/Resource],
   :rdfs/comment     #xsd/langString
                      "Links a shape with SPARQL constraints.@en",
   :rdfs/domain      :sh/Shape,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "constraint (in SPARQL)@en",
   :rdfs/range       :sh/SPARQLConstraint})

(def subject
  "An expression producing the resources that shall be inferred as subjects."
  {:db/ident :sh/subject,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An expression producing the resources that shall be inferred as subjects.@en",
   :rdfs/domain :sh/TripleRule,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "subject@en"})

(def suggestedShapesGraph
  "Suggested shapes graphs for this ontology. The values of this property may be used in the absence of specific sh:shapesGraph statements."
  {:db/ident :sh/suggestedShapesGraph,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Suggested shapes graphs for this ontology. The values of this property may be used in the absence of specific sh:shapesGraph statements.@en",
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "suggested shapes graph@en",
   :rdfs/range :owl/Ontology})

(def target
  "Links a shape to a target specified by an extension language, for example instances of sh:SPARQLTarget."
  {:db/ident :sh/target,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Links a shape to a target specified by an extension language, for example instances of sh:SPARQLTarget.@en",
   :rdfs/domain :sh/Shape,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "target@en",
   :rdfs/range :sh/Target})

(def targetClass
  "Links a shape to a class, indicating that all instances of the class must conform to the shape."
  {:db/ident :sh/targetClass,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Links a shape to a class, indicating that all instances of the class must conform to the shape.@en",
   :rdfs/domain :sh/Shape,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "target class@en",
   :rdfs/range :rdfs/Class})

(def targetNode
  "Links a shape to individual nodes, indicating that these nodes must conform to the shape."
  {:db/ident :sh/targetNode,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Links a shape to individual nodes, indicating that these nodes must conform to the shape.@en",
   :rdfs/domain :sh/Shape,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "target node@en"})

(def targetObjectsOf
  "Links a shape to a property, indicating that all all objects of triples that have the given property as their predicate must conform to the shape."
  {:db/ident :sh/targetObjectsOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Links a shape to a property, indicating that all all objects of triples that have the given property as their predicate must conform to the shape.@en",
   :rdfs/domain :sh/Shape,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "target objects of@en",
   :rdfs/range :rdf/Property})

(def targetSubjectsOf
  "Links a shape to a property, indicating that all subjects of triples that have the given property as their predicate must conform to the shape."
  {:db/ident :sh/targetSubjectsOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Links a shape to a property, indicating that all subjects of triples that have the given property as their predicate must conform to the shape.@en",
   :rdfs/domain :sh/Shape,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "target subjects of@en",
   :rdfs/range :rdf/Property})

(def this
  "A node expression that represents the current focus node."
  {:db/ident :sh/this,
   :rdf/type :rdfs/Resource,
   :rdfs/comment
   #xsd/langString
    "A node expression that represents the current focus node.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "this@en"})

(def union
  "A list of node expressions that shall be used together."
  {:db/ident :sh/union,
   :rdf/type :rdf/Property,
   :rdfs/comment #xsd/langString
                  "A list of node expressions that shall be used together.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "union@en"})

(def uniqueLang
  "Specifies whether all node values must have a unique (or no) language tag."
  {:db/ident :sh/uniqueLang,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Specifies whether all node values must have a unique (or no) language tag.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "unique languages@en",
   :rdfs/range :xsd/boolean})

(def update
  "The SPARQL UPDATE to execute."
  {:db/ident         :sh/update,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString "The SPARQL UPDATE to execute.@en",
   :rdfs/domain      :sh/SPARQLUpdateExecutable,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "update@en",
   :rdfs/range       :xsd/string})

(def validator
  "The validator(s) used to evaluate constraints of either node or property shapes."
  {:db/ident :sh/validator,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The validator(s) used to evaluate constraints of either node or property shapes.@en",
   :rdfs/domain :sh/ConstraintComponent,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "validator@en",
   :rdfs/range :sh/Validator})

(def value
  "An RDF node that has caused the result."
  {:db/ident         :sh/value,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString
                      "An RDF node that has caused the result.@en",
   :rdfs/domain      :sh/AbstractResult,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label       #xsd/langString "value@en"})

(def xone
  "Specifies a list of shapes so that the value nodes must conform to exactly one of the shapes."
  {:db/ident :sh/xone,
   :rdf/type [:rdf/Property :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Specifies a list of shapes so that the value nodes must conform to exactly one of the shapes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "exactly one@en",
   :rdfs/range :rdf/List})

(def zeroOrMorePath
  "The (single) value of this property represents a path that is matched zero or more times."
  {:db/ident :sh/zeroOrMorePath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The (single) value of this property represents a path that is matched zero or more times.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "zero or more path@en",
   :rdfs/range :rdfs/Resource})

(def zeroOrOnePath
  "The (single) value of this property represents a path that is matched zero or one times."
  {:db/ident :sh/zeroOrOnePath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The (single) value of this property represents a path that is matched zero or one times.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/shacl#"},
   :rdfs/label #xsd/langString "zero or one path@en",
   :rdfs/range :rdfs/Resource})