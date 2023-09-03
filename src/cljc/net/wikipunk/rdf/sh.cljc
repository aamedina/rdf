(ns net.wikipunk.rdf.sh
  "This vocabulary defines terms used in SHACL, the W3C Shapes Constraint Language."
  {:rdf/ns-prefix-map {"owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "sh"   "http://www.w3.org/ns/shacl#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "sh",
   :rdfa/uri "http://www.w3.org/ns/shacl#",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This vocabulary defines terms used in SHACL, the W3C Shapes Constraint Language."},
   :rdfs/label {:rdf/language "en",
                :rdf/value "W3C Shapes Constraint Language (SHACL) Vocabulary"},
   :sh/declare {:sh/namespace "http://www.w3.org/ns/shacl#",
                :sh/prefix    "sh"},
   :sh/suggestedShapesGraph {:xsd/anyURI "http://www.w3.org/ns/shacl-shacl#"},
   :xsd/anyURI "http://www.w3.org/ns/shacl#"}
  (:refer-clojure :exclude [and class declare name namespace not or update]))

(def AbstractResult
  {:db/ident :sh/AbstractResult,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The base class of validation results, typically not instantiated directly."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Abstract result"},
   :rdfs/subClassOf :rdfs/Resource})

(def AndConstraintComponent
  {:db/ident :sh/AndConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to test whether a value node conforms to all members of a provided list of shapes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "And constraint component"},
   :sh/parameter :sh/AndConstraintComponent-and})

(def AndConstraintComponent-and
  {:db/ident         :sh/AndConstraintComponent-and,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/path          :sh/and})

(def BlankNode
  {:db/ident         :sh/BlankNode,
   :rdf/type         :sh/NodeKind,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The node kind of all blank nodes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Blank node"}})

(def BlankNodeOrIRI
  {:db/ident         :sh/BlankNodeOrIRI,
   :rdf/type         :sh/NodeKind,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "The node kind of all blank nodes or IRIs."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Blank node or IRI"}})

(def BlankNodeOrLiteral
  {:db/ident         :sh/BlankNodeOrLiteral,
   :rdf/type         :sh/NodeKind,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The node kind of all blank nodes or literals."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Blank node or literal"}})

(def ClassConstraintComponent
  {:db/ident :sh/ClassConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to verify that each value node is an instance of a given type."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Class constraint component"},
   :sh/parameter :sh/ClassConstraintComponent-class})

(def ClassConstraintComponent-class
  {:db/ident         :sh/ClassConstraintComponent-class,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/nodeKind      :sh/IRI,
   :sh/path          :sh/class})

(def ClosedConstraintComponent
  {:db/ident :sh/ClosedConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to indicate that focus nodes must only have values for those properties that have been explicitly enumerated via sh:property/sh:path."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Closed constraint component"},
   :sh/parameter #{:sh/ClosedConstraintComponent-ignoredProperties
                   :sh/ClosedConstraintComponent-closed}})

(def ClosedConstraintComponent-closed
  {:db/ident         :sh/ClosedConstraintComponent-closed,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/datatype      :xsd/boolean,
   :sh/path          :sh/closed})

(def ClosedConstraintComponent-ignoredProperties
  {:db/ident         :sh/ClosedConstraintComponent-ignoredProperties,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/optional      true,
   :sh/path          :sh/ignoredProperties})

(def ConstraintComponent
  {:db/ident         :sh/ConstraintComponent,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The class of constraint components."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Constraint component"},
   :rdfs/subClassOf  :sh/Parameterizable})

(def DatatypeConstraintComponent
  {:db/ident :sh/DatatypeConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to restrict the datatype of all value nodes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Datatype constraint component"},
   :sh/parameter :sh/DatatypeConstraintComponent-datatype})

(def DatatypeConstraintComponent-datatype
  {:db/ident         :sh/DatatypeConstraintComponent-datatype,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/maxCount      1,
   :sh/nodeKind      :sh/IRI,
   :sh/path          :sh/datatype})

(def DisjointConstraintComponent
  {:db/ident :sh/DisjointConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to verify that the set of value nodes is disjoint with the the set of nodes that have the focus node as subject and the value of a given property as predicate."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Disjoint constraint component"},
   :sh/parameter :sh/DisjointConstraintComponent-disjoint})

(def DisjointConstraintComponent-disjoint
  {:db/ident         :sh/DisjointConstraintComponent-disjoint,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/nodeKind      :sh/IRI,
   :sh/path          :sh/disjoint})

(def EqualsConstraintComponent
  {:db/ident :sh/EqualsConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to verify that the set of value nodes is equal to the set of nodes that have the focus node as subject and the value of a given property as predicate."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Equals constraint component"},
   :sh/parameter :sh/EqualsConstraintComponent-equals})

(def EqualsConstraintComponent-equals
  {:db/ident         :sh/EqualsConstraintComponent-equals,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/nodeKind      :sh/IRI,
   :sh/path          :sh/equals})

(def ExpressionConstraintComponent
  {:db/ident :sh/ExpressionConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to verify that a given node expression produces true for all value nodes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Expression constraint component"},
   :sh/parameter :sh/ExpressionConstraintComponent-expression})

(def ExpressionConstraintComponent-expression
  {:db/ident         :sh/ExpressionConstraintComponent-expression,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/path          :sh/expression})

(def Function
  {:db/ident         :sh/Function,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The class of SHACL functions."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Function"},
   :rdfs/subClassOf  :sh/Parameterizable})

(def HasValueConstraintComponent
  {:db/ident :sh/HasValueConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to verify that one of the value nodes is a given RDF node."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Has-value constraint component"},
   :sh/parameter :sh/HasValueConstraintComponent-hasValue})

(def HasValueConstraintComponent-hasValue
  {:db/ident         :sh/HasValueConstraintComponent-hasValue,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/path          :sh/hasValue})

(def IRI
  {:db/ident         :sh/IRI,
   :rdf/type         :sh/NodeKind,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The node kind of all IRIs."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "IRI"}})

(def IRIOrLiteral
  {:db/ident         :sh/IRIOrLiteral,
   :rdf/type         :sh/NodeKind,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The node kind of all IRIs or literals."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "IRI or literal"}})

(def InConstraintComponent
  {:db/ident :sh/InConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to exclusively enumerate the permitted value nodes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "In constraint component"},
   :sh/parameter :sh/InConstraintComponent-in})

(def InConstraintComponent-in
  {:db/ident         :sh/InConstraintComponent-in,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/maxCount      1,
   :sh/path          :sh/in})

(def Info
  {:db/ident         :sh/Info,
   :rdf/type         :sh/Severity,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The severity for an informational validation result."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Info"}})

(def JSConstraint
  {:db/ident :sh/JSConstraint,
   :rdf/type :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The class of constraints backed by a JavaScript function."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "JavaScript-based constraint"},
   :rdfs/subClassOf :sh/JSExecutable})

(def JSConstraint-js
  {:db/ident         :sh/JSConstraint-js,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/path          :sh/js})

(def JSConstraintComponent
  {:db/ident :sh/JSConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component with the parameter sh:js linking to a sh:JSConstraint containing a sh:script."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "JavaScript constraint component"},
   :sh/parameter :sh/JSConstraint-js})

(def JSExecutable
  {:db/ident :sh/JSExecutable,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Abstract base class of resources that declare an executable JavaScript."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "JavaScript executable"},
   :rdfs/subClassOf :rdfs/Resource})

(def JSFunction
  {:db/ident :sh/JSFunction,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The class of SHACL functions that execute a JavaScript function when called."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "JavaScript function"},
   :rdfs/subClassOf #{:sh/Function :sh/JSExecutable}})

(def JSLibrary
  {:db/ident :sh/JSLibrary,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Represents a JavaScript library, typically identified by one or more URLs of files to include."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "JavaScript library"},
   :rdfs/subClassOf :rdfs/Resource})

(def JSRule
  {:db/ident         :sh/JSRule,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The class of SHACL rules expressed using JavaScript."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "JavaScript rule"},
   :rdfs/subClassOf  #{:sh/Rule :sh/JSExecutable}})

(def JSTarget
  {:db/ident :sh/JSTarget,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The class of targets that are based on JavaScript functions."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "JavaScript target"},
   :rdfs/subClassOf #{:sh/Target :sh/JSExecutable}})

(def JSTargetType
  {:db/ident :sh/JSTargetType,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The (meta) class for parameterizable targets that are based on JavaScript functions."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "JavaScript target type"},
   :rdfs/subClassOf #{:sh/TargetType :sh/JSExecutable}})

(def JSValidator
  {:db/ident :sh/JSValidator,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A SHACL validator based on JavaScript. This can be used to declare SHACL constraint components that perform JavaScript-based validation when used."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "JavaScript validator"},
   :rdfs/subClassOf #{:sh/Validator :sh/JSExecutable}})

(def LanguageInConstraintComponent
  {:db/ident :sh/LanguageInConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to enumerate language tags that all value nodes must have."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Language-in constraint component"},
   :sh/parameter :sh/LanguageInConstraintComponent-languageIn})

(def LanguageInConstraintComponent-languageIn
  {:db/ident         :sh/LanguageInConstraintComponent-languageIn,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/maxCount      1,
   :sh/path          :sh/languageIn})

(def LessThanConstraintComponent
  {:db/ident :sh/LessThanConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to verify that each value node is smaller than all the nodes that have the focus node as subject and the value of a given property as predicate."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Less-than constraint component"},
   :sh/parameter :sh/LessThanConstraintComponent-lessThan})

(def LessThanConstraintComponent-lessThan
  {:db/ident         :sh/LessThanConstraintComponent-lessThan,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/nodeKind      :sh/IRI,
   :sh/path          :sh/lessThan})

(def LessThanOrEqualsConstraintComponent
  {:db/ident :sh/LessThanOrEqualsConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to verify that every value node is smaller than all the nodes that have the focus node as subject and the value of a given property as predicate."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "less-than-or-equals constraint component"},
   :sh/parameter :sh/LessThanOrEqualsConstraintComponent-lessThanOrEquals})

(def LessThanOrEqualsConstraintComponent-lessThanOrEquals
  {:db/ident         :sh/LessThanOrEqualsConstraintComponent-lessThanOrEquals,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/nodeKind      :sh/IRI,
   :sh/path          :sh/lessThanOrEquals})

(def Literal
  {:db/ident         :sh/Literal,
   :rdf/type         :sh/NodeKind,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The node kind of all literals."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Literal"}})

(def MaxCountConstraintComponent
  {:db/ident :sh/MaxCountConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to restrict the maximum number of value nodes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Max-count constraint component"},
   :sh/parameter :sh/MaxCountConstraintComponent-maxCount})

(def MaxCountConstraintComponent-maxCount
  {:db/ident         :sh/MaxCountConstraintComponent-maxCount,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/datatype      :xsd/integer,
   :sh/maxCount      1,
   :sh/path          :sh/maxCount})

(def MaxExclusiveConstraintComponent
  {:db/ident :sh/MaxExclusiveConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to restrict the range of value nodes with a maximum exclusive value."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Max-exclusive constraint component"},
   :sh/parameter :sh/MaxExclusiveConstraintComponent-maxExclusive})

(def MaxExclusiveConstraintComponent-maxExclusive
  {:db/ident         :sh/MaxExclusiveConstraintComponent-maxExclusive,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/maxCount      1,
   :sh/nodeKind      :sh/Literal,
   :sh/path          :sh/maxExclusive})

(def MaxInclusiveConstraintComponent
  {:db/ident :sh/MaxInclusiveConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to restrict the range of value nodes with a maximum inclusive value."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Max-inclusive constraint component"},
   :sh/parameter :sh/MaxInclusiveConstraintComponent-maxInclusive})

(def MaxInclusiveConstraintComponent-maxInclusive
  {:db/ident         :sh/MaxInclusiveConstraintComponent-maxInclusive,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/maxCount      1,
   :sh/nodeKind      :sh/Literal,
   :sh/path          :sh/maxInclusive})

(def MaxLengthConstraintComponent
  {:db/ident :sh/MaxLengthConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to restrict the maximum string length of value nodes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Max-length constraint component"},
   :sh/parameter :sh/MaxLengthConstraintComponent-maxLength})

(def MaxLengthConstraintComponent-maxLength
  {:db/ident         :sh/MaxLengthConstraintComponent-maxLength,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/datatype      :xsd/integer,
   :sh/maxCount      1,
   :sh/path          :sh/maxLength})

(def MinCountConstraintComponent
  {:db/ident :sh/MinCountConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to restrict the minimum number of value nodes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Min-count constraint component"},
   :sh/parameter :sh/MinCountConstraintComponent-minCount})

(def MinCountConstraintComponent-minCount
  {:db/ident         :sh/MinCountConstraintComponent-minCount,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/datatype      :xsd/integer,
   :sh/maxCount      1,
   :sh/path          :sh/minCount})

(def MinExclusiveConstraintComponent
  {:db/ident :sh/MinExclusiveConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to restrict the range of value nodes with a minimum exclusive value."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Min-exclusive constraint component"},
   :sh/parameter :sh/MinExclusiveConstraintComponent-minExclusive})

(def MinExclusiveConstraintComponent-minExclusive
  {:db/ident         :sh/MinExclusiveConstraintComponent-minExclusive,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/maxCount      1,
   :sh/nodeKind      :sh/Literal,
   :sh/path          :sh/minExclusive})

(def MinInclusiveConstraintComponent
  {:db/ident :sh/MinInclusiveConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to restrict the range of value nodes with a minimum inclusive value."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Min-inclusive constraint component"},
   :sh/parameter :sh/MinInclusiveConstraintComponent-minInclusive})

(def MinInclusiveConstraintComponent-minInclusive
  {:db/ident         :sh/MinInclusiveConstraintComponent-minInclusive,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/maxCount      1,
   :sh/nodeKind      :sh/Literal,
   :sh/path          :sh/minInclusive})

(def MinLengthConstraintComponent
  {:db/ident :sh/MinLengthConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to restrict the minimum string length of value nodes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Min-length constraint component"},
   :sh/parameter :sh/MinLengthConstraintComponent-minLength})

(def MinLengthConstraintComponent-minLength
  {:db/ident         :sh/MinLengthConstraintComponent-minLength,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/datatype      :xsd/integer,
   :sh/maxCount      1,
   :sh/path          :sh/minLength})

(def NodeConstraintComponent
  {:db/ident :sh/NodeConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to verify that all value nodes conform to the given node shape."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Node constraint component"},
   :sh/parameter :sh/NodeConstraintComponent-node})

(def NodeConstraintComponent-node
  {:db/ident         :sh/NodeConstraintComponent-node,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/path          :sh/node})

(def NodeKind
  {:db/ident :sh/NodeKind,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The class of all node kinds, including sh:BlankNode, sh:IRI, sh:Literal or the combinations of these: sh:BlankNodeOrIRI, sh:BlankNodeOrLiteral, sh:IRIOrLiteral."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Node kind"},
   :rdfs/subClassOf :rdfs/Resource})

(def NodeKindConstraintComponent
  {:db/ident :sh/NodeKindConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to restrict the RDF node kind of each value node."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Node-kind constraint component"},
   :sh/parameter :sh/NodeKindConstraintComponent-nodeKind})

(def NodeKindConstraintComponent-nodeKind
  {:db/ident         :sh/NodeKindConstraintComponent-nodeKind,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/in            [:sh/BlankNode
                      :sh/IRI
                      :sh/Literal
                      :sh/BlankNodeOrIRI
                      :sh/BlankNodeOrLiteral
                      :sh/IRIOrLiteral],
   :sh/maxCount      1,
   :sh/path          :sh/nodeKind})

(def NodeShape
  {:db/ident :sh/NodeShape,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A node shape is a shape that specifies constraint that need to be met with respect to focus nodes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Node shape"},
   :rdfs/subClassOf :sh/Shape})

(def NotConstraintComponent
  {:db/ident :sh/NotConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to verify that value nodes do not conform to a given shape."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Not constraint component"},
   :sh/parameter :sh/NotConstraintComponent-not})

(def NotConstraintComponent-not
  {:db/ident         :sh/NotConstraintComponent-not,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/path          :sh/not})

(def OrConstraintComponent
  {:db/ident :sh/OrConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to restrict the value nodes so that they conform to at least one out of several provided shapes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Or constraint component"},
   :sh/parameter :sh/OrConstraintComponent-or})

(def OrConstraintComponent-or
  {:db/ident         :sh/OrConstraintComponent-or,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/path          :sh/or})

(def Parameter
  {:db/ident :sh/Parameter,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The class of parameter declarations, consisting of a path predicate and (possibly) information about allowed value type, cardinality and other characteristics."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Parameter"},
   :rdfs/subClassOf :sh/PropertyShape})

(def Parameterizable
  {:db/ident :sh/Parameterizable,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Superclass of components that can take parameters, especially functions and constraint components."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Parameterizable"},
   :rdfs/subClassOf :rdfs/Resource})

(def PatternConstraintComponent
  {:db/ident :sh/PatternConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to verify that every value node matches a given regular expression."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Pattern constraint component"},
   :sh/parameter #{:sh/PatternConstraintComponent-pattern
                   :sh/PatternConstraintComponent-flags}})

(def PatternConstraintComponent-flags
  {:db/ident         :sh/PatternConstraintComponent-flags,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/datatype      :xsd/string,
   :sh/optional      true,
   :sh/path          :sh/flags})

(def PatternConstraintComponent-pattern
  {:db/ident         :sh/PatternConstraintComponent-pattern,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/datatype      :xsd/string,
   :sh/path          :sh/pattern})

(def PrefixDeclaration
  {:db/ident :sh/PrefixDeclaration,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The class of prefix declarations, consisting of pairs of a prefix with a namespace."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Prefix declaration"},
   :rdfs/subClassOf :rdfs/Resource})

(def PropertyConstraintComponent
  {:db/ident :sh/PropertyConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to verify that all value nodes conform to the given property shape."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Property constraint component"},
   :sh/parameter :sh/PropertyConstraintComponent-property})

(def PropertyConstraintComponent-property
  {:db/ident         :sh/PropertyConstraintComponent-property,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/path          :sh/property})

(def PropertyGroup
  {:db/ident :sh/PropertyGroup,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Instances of this class represent groups of property shapes that belong together."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Property group"},
   :rdfs/subClassOf :rdfs/Resource})

(def PropertyShape
  {:db/ident :sh/PropertyShape,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A property shape is a shape that specifies constraints on the values of a focus node for a given property or path."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Property shape"},
   :rdfs/subClassOf :sh/Shape})

(def QualifiedMaxCountConstraintComponent
  {:db/ident :sh/QualifiedMaxCountConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to verify that a specified maximum number of value nodes conforms to a given shape."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Qualified-max-count constraint component"},
   :sh/parameter
   #{:sh/QualifiedMaxCountConstraintComponent-qualifiedValueShapesDisjoint
     :sh/QualifiedMaxCountConstraintComponent-qualifiedValueShape
     :sh/QualifiedMaxCountConstraintComponent-qualifiedMaxCount}})

(def QualifiedMaxCountConstraintComponent-qualifiedMaxCount
  {:db/ident         :sh/QualifiedMaxCountConstraintComponent-qualifiedMaxCount,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/datatype      :xsd/integer,
   :sh/path          :sh/qualifiedMaxCount})

(def QualifiedMaxCountConstraintComponent-qualifiedValueShape
  {:db/ident :sh/QualifiedMaxCountConstraintComponent-qualifiedValueShape,
   :rdf/type :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/path :sh/qualifiedValueShape})

(def QualifiedMaxCountConstraintComponent-qualifiedValueShapesDisjoint
  {:db/ident
   :sh/QualifiedMaxCountConstraintComponent-qualifiedValueShapesDisjoint,
   :rdf/type :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/datatype :xsd/boolean,
   :sh/optional true,
   :sh/path :sh/qualifiedValueShapesDisjoint})

(def QualifiedMinCountConstraintComponent
  {:db/ident :sh/QualifiedMinCountConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to verify that a specified minimum number of value nodes conforms to a given shape."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Qualified-min-count constraint component"},
   :sh/parameter
   #{:sh/QualifiedMinCountConstraintComponent-qualifiedMinCount
     :sh/QualifiedMinCountConstraintComponent-qualifiedValueShape
     :sh/QualifiedMinCountConstraintComponent-qualifiedValueShapesDisjoint}})

(def QualifiedMinCountConstraintComponent-qualifiedMinCount
  {:db/ident         :sh/QualifiedMinCountConstraintComponent-qualifiedMinCount,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/datatype      :xsd/integer,
   :sh/path          :sh/qualifiedMinCount})

(def QualifiedMinCountConstraintComponent-qualifiedValueShape
  {:db/ident :sh/QualifiedMinCountConstraintComponent-qualifiedValueShape,
   :rdf/type :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/path :sh/qualifiedValueShape})

(def QualifiedMinCountConstraintComponent-qualifiedValueShapesDisjoint
  {:db/ident
   :sh/QualifiedMinCountConstraintComponent-qualifiedValueShapesDisjoint,
   :rdf/type :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/datatype :xsd/boolean,
   :sh/optional true,
   :sh/path :sh/qualifiedValueShapesDisjoint})

(def ResultAnnotation
  {:db/ident :sh/ResultAnnotation,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A class of result annotations, which define the rules to derive the values of a given annotation property as extra values for a validation result."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Result annotation"},
   :rdfs/subClassOf :rdfs/Resource})

(def Rule
  {:db/ident         :sh/Rule,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The class of SHACL rules. Never instantiated directly."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Rule"},
   :rdfs/subClassOf  :rdfs/Resource})

(def SPARQLAskExecutable
  {:db/ident :sh/SPARQLAskExecutable,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The class of SPARQL executables that are based on an ASK query."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SPARQL ASK executable"},
   :rdfs/subClassOf :sh/SPARQLExecutable})

(def SPARQLAskValidator
  {:db/ident :sh/SPARQLAskValidator,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The class of validators based on SPARQL ASK queries. The queries are evaluated for each value node and are supposed to return true if the given node conforms."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SPARQL ASK validator"},
   :rdfs/subClassOf #{:sh/Validator :sh/SPARQLAskExecutable}})

(def SPARQLConstraint
  {:db/ident :sh/SPARQLConstraint,
   :rdf/type :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The class of constraints based on SPARQL SELECT queries."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SPARQL constraint"},
   :rdfs/subClassOf :sh/SPARQLSelectExecutable})

(def SPARQLConstraintComponent
  {:db/ident :sh/SPARQLConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to define constraints based on SPARQL queries."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SPARQL constraint component"},
   :sh/parameter :sh/SPARQLConstraintComponent-sparql})

(def SPARQLConstraintComponent-sparql
  {:db/ident         :sh/SPARQLConstraintComponent-sparql,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/path          :sh/sparql})

(def SPARQLConstructExecutable
  {:db/ident :sh/SPARQLConstructExecutable,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The class of SPARQL executables that are based on a CONSTRUCT query."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SPARQL CONSTRUCT executable"},
   :rdfs/subClassOf :sh/SPARQLExecutable})

(def SPARQLExecutable
  {:db/ident :sh/SPARQLExecutable,
   :rdf/type :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The class of resources that encapsulate a SPARQL query."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SPARQL executable"},
   :rdfs/subClassOf :rdfs/Resource})

(def SPARQLFunction
  {:db/ident :sh/SPARQLFunction,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "A function backed by a SPARQL query - either ASK or SELECT."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SPARQL function"},
   :rdfs/subClassOf #{:sh/Function :sh/SPARQLAskExecutable
                      :sh/SPARQLSelectExecutable}})

(def SPARQLRule
  {:db/ident :sh/SPARQLRule,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The class of SHACL rules based on SPARQL CONSTRUCT queries."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SPARQL CONSTRUCT rule"},
   :rdfs/subClassOf #{:sh/SPARQLConstructExecutable :sh/Rule}})

(def SPARQLSelectExecutable
  {:db/ident :sh/SPARQLSelectExecutable,
   :rdf/type :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The class of SPARQL executables based on a SELECT query."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SPARQL SELECT executable"},
   :rdfs/subClassOf :sh/SPARQLExecutable})

(def SPARQLSelectValidator
  {:db/ident :sh/SPARQLSelectValidator,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The class of validators based on SPARQL SELECT queries. The queries are evaluated for each focus node and are supposed to produce bindings for all focus nodes that do not conform."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SPARQL SELECT validator"},
   :rdfs/subClassOf #{:sh/Validator :sh/SPARQLSelectExecutable}})

(def SPARQLTarget
  {:db/ident         :sh/SPARQLTarget,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The class of targets that are based on SPARQL queries."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "SPARQL target"},
   :rdfs/subClassOf  #{:sh/SPARQLAskExecutable :sh/SPARQLSelectExecutable
                       :sh/Target}})

(def SPARQLTargetType
  {:db/ident :sh/SPARQLTargetType,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The (meta) class for parameterizable targets that are based on SPARQL queries."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SPARQL target type"},
   :rdfs/subClassOf #{:sh/TargetType :sh/SPARQLAskExecutable
                      :sh/SPARQLSelectExecutable}})

(def SPARQLUpdateExecutable
  {:db/ident :sh/SPARQLUpdateExecutable,
   :rdf/type :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The class of SPARQL executables based on a SPARQL UPDATE."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SPARQL UPDATE executable"},
   :rdfs/subClassOf :sh/SPARQLExecutable})

(def Severity
  {:db/ident :sh/Severity,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The class of validation result severity levels, including violation and warning levels."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Severity"},
   :rdfs/subClassOf :rdfs/Resource})

(def Shape
  {:db/ident :sh/Shape,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A shape is a collection of constraints that may be targeted for certain nodes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Shape"},
   :rdfs/subClassOf :rdfs/Resource})

(def Target
  {:db/ident :sh/Target,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The base class of targets such as those based on SPARQL queries."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Target"},
   :rdfs/subClassOf :rdfs/Resource})

(def TargetType
  {:db/ident :sh/TargetType,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The (meta) class for parameterizable targets.\tInstances of this are instantiated as values of the sh:target property."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Target type"},
   :rdfs/subClassOf #{:rdfs/Class :sh/Parameterizable}})

(def TripleRule
  {:db/ident :sh/TripleRule,
   :rdf/type :rdfs/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "A rule based on triple (subject, predicate, object) pattern."},
   :rdfs/subClassOf :sh/Rule})

(def UniqueLangConstraintComponent
  {:db/ident :sh/UniqueLangConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to specify that no pair of value nodes may use the same language tag."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unique-languages constraint component"},
   :sh/parameter :sh/UniqueLangConstraintComponent-uniqueLang})

(def UniqueLangConstraintComponent-uniqueLang
  {:db/ident         :sh/UniqueLangConstraintComponent-uniqueLang,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/datatype      :xsd/boolean,
   :sh/maxCount      1,
   :sh/path          :sh/uniqueLang})

(def ValidationReport
  {:db/ident         :sh/ValidationReport,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The class of SHACL validation reports."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Validation report"},
   :rdfs/subClassOf  :rdfs/Resource})

(def ValidationResult
  {:db/ident         :sh/ValidationResult,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The class of validation results."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Validation result"},
   :rdfs/subClassOf  :sh/AbstractResult})

(def Validator
  {:db/ident :sh/Validator,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The class of validators, which provide instructions on how to process a constraint definition. This class serves as base class for the SPARQL-based validators and other possible implementations."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Validator"},
   :rdfs/subClassOf :rdfs/Resource})

(def Violation
  {:db/ident         :sh/Violation,
   :rdf/type         :sh/Severity,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The severity for a violation validation result."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Violation"}})

(def Warning
  {:db/ident         :sh/Warning,
   :rdf/type         :sh/Severity,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The severity for a warning validation result."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Warning"}})

(def XoneConstraintComponent
  {:db/ident :sh/XoneConstraintComponent,
   :rdf/type :sh/ConstraintComponent,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A constraint component that can be used to restrict the value nodes so that they conform to exactly one out of several provided shapes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Exactly one constraint component"},
   :sh/parameter :sh/XoneConstraintComponent-xone})

(def XoneConstraintComponent-xone
  {:db/ident         :sh/XoneConstraintComponent-xone,
   :rdf/type         :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :sh/path          :sh/xone})

(def alternativePath
  {:db/ident :sh/alternativePath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The (single) value of this property must be a list of path elements, representing the elements of alternative paths."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "alternative path"},
   :rdfs/range :rdf/List})

(def and
  {:db/ident :sh/and,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "RDF list of shapes to validate the value nodes against."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "and"},
   :rdfs/range :rdf/List})

(def annotationProperty
  {:db/ident         :sh/annotationProperty,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "The annotation property that shall be set."},
   :rdfs/domain      :sh/ResultAnnotation,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "annotation property"},
   :rdfs/range       :rdf/Property})

(def annotationValue
  {:db/ident         :sh/annotationValue,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The (default) values of the annotation property."},
   :rdfs/domain      :sh/ResultAnnotation,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "annotation value"}})

(def annotationVarName
  {:db/ident :sh/annotationVarName,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The name of the SPARQL variable from the SELECT clause that shall be used for the values."},
   :rdfs/domain :sh/ResultAnnotation,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "annotation variable name"},
   :rdfs/range :xsd/string})

(def ask
  {:db/ident         :sh/ask,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The SPARQL ASK query to execute."},
   :rdfs/domain      :sh/SPARQLAskExecutable,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "ask"},
   :rdfs/range       :xsd/string})

(def class
  {:db/ident         :sh/class,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The type that all value nodes must have."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "class"},
   :rdfs/range       :rdfs/Class})

(def closed
  {:db/ident         :sh/closed,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "If set to true then the shape is closed."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "closed"},
   :rdfs/range       :xsd/boolean})

(def condition
  {:db/ident :sh/condition,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The shapes that the focus nodes need to conform to before a rule is executed on them."},
   :rdfs/domain :sh/Rule,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "condition"},
   :rdfs/range :sh/Shape})

(def conforms
  {:db/ident :sh/conforms,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "True if the validation did not produce any validation results, and false otherwise."},
   :rdfs/domain :sh/ValidationReport,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "conforms"},
   :rdfs/range :xsd/boolean})

(def construct
  {:db/ident         :sh/construct,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The SPARQL CONSTRUCT query to execute."},
   :rdfs/domain      :sh/SPARQLConstructExecutable,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "construct"},
   :rdfs/range       :xsd/string})

(def datatype
  {:db/ident :sh/datatype,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Specifies an RDF datatype that all value nodes must have."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "datatype"},
   :rdfs/range :rdfs/Datatype})

(def deactivated
  {:db/ident         :sh/deactivated,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "If set to true then all nodes conform to this."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "deactivated"},
   :rdfs/range       :xsd/boolean})

(def declare
  {:db/ident :sh/declare,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Links a resource with its namespace prefix declarations."},
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "declare"},
   :rdfs/range :sh/PrefixDeclaration})

(def defaultValue
  {:db/ident :sh/defaultValue,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A default value for a property, for example for user interface tools to pre-populate input fields."},
   :rdfs/domain :sh/PropertyShape,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "default value"}})

(def description
  {:db/ident :sh/description,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Human-readable descriptions for the property in the context of the surrounding shape."},
   :rdfs/domain :sh/PropertyShape,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "description"}})

(def detail
  {:db/ident :sh/detail,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Links a result with other results that provide more details, for example to describe violations against nested shapes."},
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "detail"},
   :rdfs/range :sh/AbstractResult})

(def disjoint
  {:db/ident :sh/disjoint,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies a property where the set of values must be disjoint with the value nodes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "disjoint"},
   :rdfs/range :rdf/Property})

(def entailment
  {:db/ident :sh/entailment,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An entailment regime that indicates what kind of inferencing is required by a shapes graph."},
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "entailment"},
   :rdfs/range :rdfs/Resource})

(def equals
  {:db/ident :sh/equals,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies a property that must have the same values as the value nodes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equals"},
   :rdfs/range :rdf/Property})

(def expression
  {:db/ident :sh/expression,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The node expression that must return true for the value nodes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "expression"}})

(def filterShape
  {:db/ident :sh/filterShape,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The shape that all input nodes of the expression need to conform to."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "filter shape"},
   :rdfs/range :sh/Shape})

(def flags
  {:db/ident :sh/flags,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An optional flag to be used with regular expression pattern matching."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "flags"},
   :rdfs/range :xsd/string})

(def focusNode
  {:db/ident :sh/focusNode,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The focus node that was validated when the result was produced."},
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "focus node"}})

(def group
  {:db/ident :sh/group,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Can be used to link to a property group to indicate that a property shape belongs to a group of related property shapes."},
   :rdfs/domain :sh/PropertyShape,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "group"},
   :rdfs/range :sh/PropertyGroup})

(def hasValue
  {:db/ident         :sh/hasValue,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Specifies a value that must be among the value nodes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has value"}})

(def ignoredProperties
  {:db/ident :sh/ignoredProperties,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An optional RDF list of properties that are also permitted in addition to those explicitly enumerated via sh:property/sh:path."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ignored properties"},
   :rdfs/range :rdf/List})

(def in
  {:db/ident :sh/in,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies a list of allowed values so that each value node must be among the members of the given list."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "in"},
   :rdfs/range :rdf/List})

(def intersection
  {:db/ident         :sh/intersection,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A list of node expressions that shall be intersected."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "intersection"}})

(def inversePath
  {:db/ident :sh/inversePath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The (single) value of this property represents an inverse path (object to subject)."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "inverse path"},
   :rdfs/range :rdfs/Resource})

(def js
  {:db/ident         :sh/js,
   :rdf/type         :rdf/Property,
   :rdfs/comment     "Constraints expressed in JavaScript.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "JavaScript constraint"},
   :rdfs/range       :sh/JSConstraint})

(def jsFunctionName
  {:db/ident         :sh/jsFunctionName,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The name of the JavaScript function to execute."},
   :rdfs/domain      :sh/JSExecutable,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "JavaScript function name"},
   :rdfs/range       :xsd/string})

(def jsLibrary
  {:db/ident :sh/jsLibrary,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Declares which JavaScript libraries are needed to execute this."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "JavaScript library"},
   :rdfs/range :sh/JSLibrary})

(def jsLibraryURL
  {:db/ident :sh/jsLibraryURL,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Declares the URLs of a JavaScript library. This should be the absolute URL of a JavaScript file. Implementations may redirect those to local files."},
   :rdfs/domain :sh/JSLibrary,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "JavaScript library URL"},
   :rdfs/range :xsd/anyURI})

(def labelTemplate
  {:db/ident :sh/labelTemplate,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Outlines how human-readable labels of instances of the associated Parameterizable shall be produced. The values can contain {?paramName} as placeholders for the actual values of the given parameter."},
   :rdfs/domain :sh/Parameterizable,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "label template"}})

(def languageIn
  {:db/ident :sh/languageIn,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies a list of language tags that all value nodes must have."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "language in"},
   :rdfs/range :rdf/List})

(def lessThan
  {:db/ident :sh/lessThan,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies a property that must have smaller values than the value nodes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "less than"},
   :rdfs/range :rdf/Property})

(def lessThanOrEquals
  {:db/ident :sh/lessThanOrEquals,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies a property that must have smaller or equal values than the value nodes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "less than or equals"},
   :rdfs/range :rdf/Property})

(def maxCount
  {:db/ident :sh/maxCount,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies the maximum number of values in the set of value nodes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "max count"},
   :rdfs/range :xsd/integer})

(def maxExclusive
  {:db/ident :sh/maxExclusive,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Specifies the maximum exclusive value of each value node."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "max exclusive"}})

(def maxInclusive
  {:db/ident :sh/maxInclusive,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Specifies the maximum inclusive value of each value node."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "max inclusive"}})

(def maxLength
  {:db/ident :sh/maxLength,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Specifies the maximum string length of each value node."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "max length"},
   :rdfs/range :xsd/integer})

(def message
  {:db/ident :sh/message,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A human-readable message (possibly with placeholders for variables) explaining the cause of the result."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "message"}})

(def minCount
  {:db/ident :sh/minCount,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies the minimum number of values in the set of value nodes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "min count"},
   :rdfs/range :xsd/integer})

(def minExclusive
  {:db/ident :sh/minExclusive,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Specifies the minimum exclusive value of each value node."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "min exclusive"}})

(def minInclusive
  {:db/ident :sh/minInclusive,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Specifies the minimum inclusive value of each value node."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "min inclusive"}})

(def minLength
  {:db/ident :sh/minLength,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Specifies the minimum string length of each value node."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "min length"},
   :rdfs/range :xsd/integer})

(def name
  {:db/ident :sh/name,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Human-readable labels for the property in the context of the surrounding shape."},
   :rdfs/domain :sh/PropertyShape,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "name"}})

(def namespace
  {:db/ident :sh/namespace,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The namespace associated with a prefix in a prefix declaration."},
   :rdfs/domain :sh/PrefixDeclaration,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "namespace"},
   :rdfs/range :xsd/anyURI})

(def node
  {:db/ident :sh/node,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies the node shape that all value nodes must conform to."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "node"},
   :rdfs/range :sh/NodeShape})

(def nodeKind
  {:db/ident :sh/nodeKind,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies the node kind (e.g. IRI or literal) each value node."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "node kind"},
   :rdfs/range :sh/NodeKind})

(def nodeValidator
  {:db/ident :sh/nodeValidator,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The validator(s) used to evaluate a constraint in the context of a node shape."},
   :rdfs/domain :sh/ConstraintComponent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "shape validator"},
   :rdfs/range :sh/Validator})

(def nodes
  {:db/ident :sh/nodes,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The node expression producing the input nodes of a filter shape expression."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "nodes"}})

(def not
  {:db/ident :sh/not,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Specifies a shape that the value nodes must not conform to."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "not"},
   :rdfs/range :sh/Shape})

(def object
  {:db/ident :sh/object,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An expression producing the nodes that shall be inferred as objects."},
   :rdfs/domain :sh/TripleRule,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "object"}})

(def oneOrMorePath
  {:db/ident :sh/oneOrMorePath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The (single) value of this property represents a path that is matched one or more times."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "one or more path"},
   :rdfs/range :rdfs/Resource})

(def optional
  {:db/ident         :sh/optional,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "Indicates whether a parameter is optional."},
   :rdfs/domain      :sh/Parameter,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "optional"},
   :rdfs/range       :xsd/boolean})

(def or
  {:db/ident :sh/or,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies a list of shapes so that the value nodes must conform to at least one of the shapes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "or"},
   :rdfs/range :rdf/List})

(def order
  {:db/ident :sh/order,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies the relative order of this compared to its siblings. For example use 0 for the first, 1 for the second."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "order"}})

(def parameter
  {:db/ident         :sh/parameter,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The parameters of a function or constraint component."},
   :rdfs/domain      :sh/Parameterizable,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "parameter"},
   :rdfs/range       :sh/Parameter})

(def path
  {:db/ident         :sh/path,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Specifies the property path of a property shape."},
   :rdfs/domain      :sh/PropertyShape,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "path"},
   :rdfs/range       :rdfs/Resource})

(def pattern
  {:db/ident :sh/pattern,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies a regular expression pattern that the string representations of the value nodes must match."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pattern"},
   :rdfs/range :xsd/string})

(def predicate
  {:db/ident :sh/predicate,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An expression producing the properties that shall be inferred as predicates."},
   :rdfs/domain :sh/TripleRule,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "predicate"}})

(def prefix
  {:db/ident         :sh/prefix,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The prefix of a prefix declaration."},
   :rdfs/domain      :sh/PrefixDeclaration,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "prefix"},
   :rdfs/range       :xsd/string})

(def prefixes
  {:db/ident :sh/prefixes,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The prefixes that shall be applied before parsing the associated SPARQL query."},
   :rdfs/domain :sh/SPARQLExecutable,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "prefixes"},
   :rdfs/range :owl/Ontology})

(def property
  {:db/ident         :sh/property,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Links a shape to its property shapes."},
   :rdfs/domain      :sh/Shape,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "property"},
   :rdfs/range       :sh/PropertyShape})

(def propertyValidator
  {:db/ident :sh/propertyValidator,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The validator(s) used to evaluate a constraint in the context of a property shape."},
   :rdfs/domain :sh/ConstraintComponent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "property validator"},
   :rdfs/range :sh/Validator})

(def qualifiedMaxCount
  {:db/ident :sh/qualifiedMaxCount,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The maximum number of value nodes that can conform to the shape."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "qualified max count"},
   :rdfs/range :xsd/integer})

(def qualifiedMinCount
  {:db/ident :sh/qualifiedMinCount,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The minimum number of value nodes that must conform to the shape."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "qualified min count"},
   :rdfs/range :xsd/integer})

(def qualifiedValueShape
  {:db/ident :sh/qualifiedValueShape,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The shape that a specified number of values must conform to."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "qualified value shape"},
   :rdfs/range :sh/Shape})

(def qualifiedValueShapesDisjoint
  {:db/ident :sh/qualifiedValueShapesDisjoint,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Can be used to mark the qualified value shape to be disjoint with its sibling shapes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "qualified value shapes disjoint"},
   :rdfs/range :xsd/boolean})

(def result
  {:db/ident :sh/result,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The validation results contained in a validation report."},
   :rdfs/domain :sh/ValidationReport,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "result"},
   :rdfs/range :sh/ValidationResult})

(def resultAnnotation
  {:db/ident :sh/resultAnnotation,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Links a SPARQL validator with zero or more sh:ResultAnnotation instances, defining how to derive additional result properties based on the variables of the SELECT query."},
   :rdfs/domain :sh/SPARQLSelectValidator,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "result annotation"},
   :rdfs/range :sh/ResultAnnotation})

(def resultMessage
  {:db/ident :sh/resultMessage,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Human-readable messages explaining the cause of the result."},
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "result message"}})

(def resultPath
  {:db/ident :sh/resultPath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The path of a validation result, based on the path of the validated property shape."},
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "result path"},
   :rdfs/range :rdfs/Resource})

(def resultSeverity
  {:db/ident         :sh/resultSeverity,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "The severity of the result, e.g. warning."},
   :rdfs/domain      :sh/AbstractResult,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "result severity"},
   :rdfs/range       :sh/Severity})

(def returnType
  {:db/ident :sh/returnType,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The expected type of values returned by the associated function."},
   :rdfs/domain :sh/Function,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "return type"},
   :rdfs/range :rdfs/Class})

(def rule
  {:db/ident         :sh/rule,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The rules linked to a shape."},
   :rdfs/domain      :sh/Shape,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "rule"},
   :rdfs/range       :sh/Rule})

(def select
  {:db/ident         :sh/select,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The SPARQL SELECT query to execute."},
   :rdfs/domain      :sh/SPARQLSelectExecutable,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "select"},
   :rdfs/range       :xsd/string})

(def severity
  {:db/ident :sh/severity,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Defines the severity that validation results produced by a shape must have. Defaults to sh:Violation."},
   :rdfs/domain :sh/Shape,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "severity"},
   :rdfs/range :sh/Severity})

(def shapesGraph
  {:db/ident :sh/shapesGraph,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Shapes graphs that should be used when validating this data graph."},
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "shapes graph"},
   :rdfs/range :owl/Ontology})

(def shapesGraphWellFormed
  {:db/ident :sh/shapesGraphWellFormed,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If true then the validation engine was certain that the shapes graph has passed all SHACL syntax requirements during the validation process."},
   :rdfs/domain :sh/ValidationReport,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "shapes graph well-formed"},
   :rdfs/range :xsd/boolean})

(def sourceConstraint
  {:db/ident :sh/sourceConstraint,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The constraint that was validated when the result was produced."},
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "source constraint"}})

(def sourceConstraintComponent
  {:db/ident :sh/sourceConstraintComponent,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The constraint component that is the source of the result."},
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "source constraint component"},
   :rdfs/range :sh/ConstraintComponent})

(def sourceShape
  {:db/ident :sh/sourceShape,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The shape that is was validated when the result was produced."},
   :rdfs/domain :sh/AbstractResult,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "source shape"},
   :rdfs/range :sh/Shape})

(def sparql
  {:db/ident         :sh/sparql,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Links a shape with SPARQL constraints."},
   :rdfs/domain      :sh/Shape,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "constraint (in SPARQL)"},
   :rdfs/range       :sh/SPARQLConstraint})

(def subject
  {:db/ident :sh/subject,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An expression producing the resources that shall be inferred as subjects."},
   :rdfs/domain :sh/TripleRule,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subject"}})

(def suggestedShapesGraph
  {:db/ident :sh/suggestedShapesGraph,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Suggested shapes graphs for this ontology. The values of this property may be used in the absence of specific sh:shapesGraph statements."},
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "suggested shapes graph"},
   :rdfs/range :owl/Ontology})

(def target
  {:db/ident :sh/target,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Links a shape to a target specified by an extension language, for example instances of sh:SPARQLTarget."},
   :rdfs/domain :sh/Shape,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "target"},
   :rdfs/range :sh/Target})

(def targetClass
  {:db/ident :sh/targetClass,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Links a shape to a class, indicating that all instances of the class must conform to the shape."},
   :rdfs/domain :sh/Shape,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "target class"},
   :rdfs/range :rdfs/Class})

(def targetNode
  {:db/ident :sh/targetNode,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Links a shape to individual nodes, indicating that these nodes must conform to the shape."},
   :rdfs/domain :sh/Shape,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "target node"}})

(def targetObjectsOf
  {:db/ident :sh/targetObjectsOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Links a shape to a property, indicating that all all objects of triples that have the given property as their predicate must conform to the shape."},
   :rdfs/domain :sh/Shape,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "target objects of"},
   :rdfs/range :rdf/Property})

(def targetSubjectsOf
  {:db/ident :sh/targetSubjectsOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Links a shape to a property, indicating that all subjects of triples that have the given property as their predicate must conform to the shape."},
   :rdfs/domain :sh/Shape,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "target subjects of"},
   :rdfs/range :rdf/Property})

(def this
  {:db/ident :sh/this,
   :rdf/type :rdfs/Resource,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "A node expression that represents the current focus node."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "this"}})

(def union
  {:db/ident :sh/union,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "A list of node expressions that shall be used together."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "union"}})

(def uniqueLang
  {:db/ident :sh/uniqueLang,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies whether all node values must have a unique (or no) language tag."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "unique languages"},
   :rdfs/range :xsd/boolean})

(def update
  {:db/ident         :sh/update,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The SPARQL UPDATE to execute."},
   :rdfs/domain      :sh/SPARQLUpdateExecutable,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "update"},
   :rdfs/range       :xsd/string})

(def validator
  {:db/ident :sh/validator,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The validator(s) used to evaluate constraints of either node or property shapes."},
   :rdfs/domain :sh/ConstraintComponent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "validator"},
   :rdfs/range :sh/Validator})

(def value
  {:db/ident         :sh/value,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "An RDF node that has caused the result."},
   :rdfs/domain      :sh/AbstractResult,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "value"}})

(def xone
  {:db/ident :sh/xone,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies a list of shapes so that the value nodes must conform to exactly one of the shapes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "exactly one"},
   :rdfs/range :rdf/List})

(def zeroOrMorePath
  {:db/ident :sh/zeroOrMorePath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The (single) value of this property represents a path that is matched zero or more times."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "zero or more path"},
   :rdfs/range :rdfs/Resource})

(def zeroOrOnePath
  {:db/ident :sh/zeroOrOnePath,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The (single) value of this property represents a path that is matched zero or one times."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/shacl#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "zero or one path"},
   :rdfs/range :rdfs/Resource})