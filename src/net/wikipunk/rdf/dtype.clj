(ns net.wikipunk.rdf.dtype
  "http://www.linkedmodel.org/schema/dtype#"
  {:owl/imports       "http://www.linkedmodel.org/schema/vaem",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/elements/1.1/",
                       "dtype"   "http://www.linkedmodel.org/schema/dtype#",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "vaem"    "http://www.linkedmodel.org/schema/vaem#",
                       "voag"    "http://voag.linkedmodel.org/voag#",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :owl/Ontology,
   :rdf/uri           "http://www.linkedmodel.org/schema/dtype",
   :rdfa/prefix       "dtype",
   :rdfa/uri          "http://www.linkedmodel.org/schema/dtype#"}
  (:refer-clojure :exclude [type]))

(def CodeList
  "Codelist"
  {:db/ident :dtype/CodeList,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/1.1/schema/dtype"
                      "http://www.linkedmodel.org/schema/dtype"],
   :rdfs/label "Codelist",
   :rdfs/subClassOf :dtype/Enumeration,
   :vaem/comment
   "A codelist is a controlled vocabulary of terms that are used to represent permissible values of a variable in information systems. The representaiton of codes in \"dtype\" has been influenced by CCTS and UBL."})

(def CompositeCodeList
  "Composite Code List"
  {:db/ident :dtype/CompositeCodeList,
   :owl/disjointWith [:dtype/DerivedCodeList :dtype/SimpleCodeList],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/1.1/schema/dtype"
                      "http://www.linkedmodel.org/schema/dtype"],
   :rdfs/label "Composite Code List",
   :rdfs/subClassOf [:dtype/CodeList
                     {:owl/allValuesFrom :dtype/CodeList,
                      :owl/onProperty    :dtype/compositeOf,
                      :rdf/type          :owl/Restriction}],
   :vaem/comment
   "A composite codelist is a codelist made up of other codelists. It does not introduce any new codes."})

(def DerivedCodeList
  "Derived Code List"
  {:db/ident :dtype/DerivedCodeList,
   :owl/disjointWith [:dtype/SimpleCodeList :dtype/CompositeCodeList],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/1.1/schema/dtype"
                      "http://www.linkedmodel.org/schema/dtype"],
   :rdfs/label "Derived Code List",
   :rdfs/subClassOf [:dtype/CodeList
                     {:owl/allValuesFrom :dtype/ValueReference,
                      :owl/onProperty    :dtype/hasMember,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :dtype/CodeList,
                      :owl/onProperty    :dtype/derivedFrom,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :dtype/derivedFrom,
                      :rdf/type           :owl/Restriction}],
   :vaem/comment
   "A derived codelist is a sublist of another codelist. The members that it has must be members of the source list."})

(def EnumeratedValue
  "The base class for datatypes that have values that are restriced to a set of literals or tokens. The members of the restriction may themselve be restriced by facets that apply to scalar data types."
  {:db/ident :dtype/EnumeratedValue,
   :dcterms/description
   "The base class for datatypes that have values that are restriced to a set of literals or tokens. The members of the restriction may themselve be restriced by facets that apply to scalar data types.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/schema/dtype"
                      "http://www.linkedmodel.org/1.1/schema/dtype"],
   :rdfs/label "DTYPE Enumerated value",
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/description,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :vaem/url,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :dtype/code,
                      :rdf/type           :owl/Restriction}
                     :owl/Thing
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :dtype/position,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :dtype/value,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :dtype/order,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/name,
                      :rdf/type           :owl/Restriction}]})

(def Enumeration
  "DTYPE Enumeration"
  {:db/ident :dtype/Enumeration,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/1.1/schema/dtype"
                      "http://www.linkedmodel.org/schema/dtype"],
   :rdfs/label "DTYPE Enumeration",
   :rdfs/subClassOf [:owl/Thing
                     {:owl/allValuesFrom :dtype/EnumeratedValue,
                      :owl/onProperty    :dtype/defaultValue,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :dtype/EnumeratedValue,
                      :owl/onProperty    :dtype/value,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :dtype/defaultValue,
                      :rdf/type           :owl/Restriction}],
   :vaem/comment
   "A type that serves as a container for the enumerated values of an enumeration. This enables the enumeration itself to be referenceable. One need for this is in determing the default value of an enumeration , another need is in the management of sub-enumerations and composite enumerations."})

(def SimpleCodeList
  "Simple Code List"
  {:db/ident :dtype/SimpleCodeList,
   :owl/disjointWith [:dtype/CompositeCodeList :dtype/DerivedCodeList],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/1.1/schema/dtype"
                      "http://www.linkedmodel.org/schema/dtype"],
   :rdfs/label "Simple Code List",
   :rdfs/subClassOf [:dtype/CodeList
                     {:owl/allValuesFrom :dtype/EnumeratedValue,
                      :owl/onProperty    :dtype/hasMember,
                      :rdf/type          :owl/Restriction}],
   :vaem/comment "A simple codelist is one made up only of enumerated values."})

(def ValueReference
  "Value Reference"
  {:db/ident :dtype/ValueReference,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/1.1/schema/dtype"
                      "http://www.linkedmodel.org/schema/dtype"],
   :rdfs/label "Value Reference",
   :rdfs/subClassOf [:owl/Thing
                     {:owl/allValuesFrom :dtype/EnumeratedValue,
                      :owl/onProperty    :dtype/refersTo,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :dtype/refersTo,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :dtype/position,
                      :rdf/type           :owl/Restriction}],
   :vaem/comment
   "A value reference is a pointer to an Enumerated Value. The original position of the value can be overridden by the position attribute."})

(def code
  "code"
  {:db/ident :dtype/code,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/1.1/schema/dtype"
                      "http://www.linkedmodel.org/schema/dtype"],
   :rdfs/label "code",
   :rdfs/range :xsd/anySimpleType,
   :vaem/comment
   "A property for expressing an encoded value. The range has been set to \"xsd:anySimpleType\" to allow for a variety of scalar datatypes."})

(def compositeOf
  "composite of"
  {:db/ident         :dtype/compositeOf,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/1.1/schema/dtype"
                      "http://www.linkedmodel.org/schema/dtype"],
   :rdfs/label       "composite of",
   :vaem/comment     "Aproperty for constructing composite data structures"})

(def defaultValue
  "default value"
  {:db/ident :dtype/defaultValue,
   :rdf/type :rdf/Property,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/1.1/schema/dtype"
                      "http://www.linkedmodel.org/schema/dtype"],
   :rdfs/label "default value",
   :vaem/comment
   "The property \"dtype:defaultValue\" is a general property for specifying a value in situations where none is specified, or can be determined. In some cases of use, this property could have a scalar value and in other cases may need to refer to a first class concept that holds a \"value object\".  For this reason, the  type of this property is set as \"rdf:Property\" and the property is rangeless."})

(def derivedFrom
  "derived from"
  {:db/ident         :dtype/derivedFrom,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/1.1/schema/dtype"
                      "http://www.linkedmodel.org/schema/dtype"],
   :rdfs/label       "derived from",
   :vaem/comment     "A property for specifying a derivation relationship."})

(def hasMember
  "has member"
  {:db/ident :dtype/hasMember,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/1.1/schema/dtype"
                      "http://www.linkedmodel.org/schema/dtype"],
   :rdfs/label "has member",
   :vaem/comment
   "A property for specifying how member elements make up a data structure."})

(def isInvalid
  "is invalid"
  {:db/ident :dtype/isInvalid,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/1.1/schema/dtype"
                      "http://www.linkedmodel.org/schema/dtype"],
   :rdfs/label "is invalid",
   :rdfs/range :xsd/boolean,
   :vaem/comment
   "A boolean flag to state that a value is invalid with respect to its type."})

(def literal
  "literal"
  {:db/ident         :dtype/literal,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/1.1/schema/dtype"
                      "http://www.linkedmodel.org/schema/dtype"],
   :rdfs/label       "literal",
   :rdfs/range       :xsd/string,
   :vaem/comment     "A general purpose property for holding string literals."})

(def numericUnion
  "A datatype that is the union of numeric xsd data types. \"numericUnion\" is equivalent to the xsd specification that uses an xsd:union of memberTypes=\"xsd:decimal xsd:double xsd:float xsd:integer\"."
  {:db/ident         :dtype/numericUnion,
   :dcterms/description
   "A datatype that is the union of numeric xsd data types. \"numericUnion\" is equivalent to the xsd specification that uses an xsd:union of memberTypes=\"xsd:decimal xsd:double xsd:float xsd:integer\".",
   :owl/equivalentClass
   {:owl/unionOf [:xsd/float :xsd/decimal :xsd/integer :xsd/double],
    :rdf/type    :rdfs/Datatype},
   :rdf/type         :rdfs/Datatype,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/1.1/schema/dtype"
                      "http://www.linkedmodel.org/schema/dtype"],
   :rdfs/label       "numeric union",
   :rdfs/subClassOf  :rdfs/Resource})

(def order
  "order"
  {:db/ident :dtype/order,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/1.1/schema/dtype"
                      "http://www.linkedmodel.org/schema/dtype"],
   :rdfs/label "order",
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/seeAlso :dtype/orderIndex,
   :vaem/comment
   "The property \"dtype:order\" provides a means to specify a precedence. One use of order is in specifying ordered enumerations such as \"voag:ConfidentialityLevel\".  A similar property, but with an important type difference, is \"vaem:orderIndex\". This is for use on property occurrences in class axioms where it can be placed on a restriction to specify how that property may be transformed into other representations where ordering has some importance, for example, in XML Schema sequences.  Whereas \"vaem:order\" is a datatype property, \"vaem:orderIndex\" is an annotation property."})

(def orderIndex
  "order index"
  {:db/ident :dtype/orderIndex,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/1.1/schema/dtype"
                      "http://www.linkedmodel.org/schema/dtype"],
   :rdfs/label "order index",
   :rdfs/range :xsd/nonNegativeInteger,
   :vaem/comment
   "The property \"dtype:orderIndex\" is an annotation property to specify a position that some value or structure will have. One use is to specify the place that a resource has in a sequence. One use is on property occurrences in class axioms. Here \"vaem:orderIndex\" is placed on a restriction to specify how that property may be transformed into a representation where ordering has some importance, for example, in XML Schema sequences."})

(def position
  "position"
  {:db/ident         :dtype/position,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/1.1/schema/dtype"
                      "http://www.linkedmodel.org/schema/dtype"],
   :rdfs/label       "position",
   :rdfs/range       :xsd/nonNegativeInteger})

(def refersTo
  "refers to"
  {:db/ident :dtype/refersTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/1.1/schema/dtype"
                      "http://www.linkedmodel.org/schema/dtype"],
   :rdfs/label "refers to",
   :vaem/comment
   "An indirection pointer for relating a slot in am occurrence data structure, such as \"dtype:ValueReference\" with another resource."})

(def type
  "datatype"
  {:db/ident         :dtype/type,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/1.1/schema/dtype"
                      "http://www.linkedmodel.org/schema/dtype"],
   :rdfs/label       "datatype"})

(def value
  "value"
  {:db/ident :dtype/value,
   :rdf/type :rdf/Property,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/1.1/schema/dtype"
                      "http://www.linkedmodel.org/schema/dtype"],
   :rdfs/label "value",
   :vaem/comment
   "The property \"dtype:value\" is a general property that in some cases could have scalar values and in other cases may refer to a first class concept that is a \"value object\". For this reason, the  type of this property is set as \"rdf:Property\" and the property is rangeless."})