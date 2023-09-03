(ns net.wikipunk.rdf.owl
  "\r\n  This ontology partially describes the built-in classes and\r\n  properties that together form the basis of the RDF/XML syntax of OWL 2.\r\n  The content of this ontology is based on Tables 6.1 and 6.2\r\n  in Section 6.4 of the OWL 2 RDF-Based Semantics specification,\r\n  available at http://www.w3.org/TR/owl2-rdf-based-semantics/.\r\n  Please note that those tables do not include the different annotations\r\n  (labels, comments and rdfs:isDefinedBy links) used in this file.\r\n  Also note that the descriptions provided in this ontology do not\r\n  provide a complete and correct formal description of either the syntax\r\n  or the semantics of the introduced terms (please see the OWL 2\r\n  recommendations for the complete and normative specifications).\r\n  Furthermore, the information provided by this ontology may be\r\n  misleading if not used with care. This ontology SHOULD NOT be imported\r\n  into OWL ontologies. Importing this file into an OWL 2 DL ontology\r\n  will cause it to become an OWL 2 Full ontology and may have other,\r\n  unexpected, consequences.\r\n   "
  {:dc11/title "The OWL 2 Schema vocabulary (OWL 2)",
   :grddl/namespaceTransformation
   {:xsd/anyURI "http://dev.w3.org/cvsweb/2009/owl-grddl/owx2rdf.xsl"},
   :owl/imports {:xsd/anyURI "http://www.w3.org/2000/01/rdf-schema"},
   :owl/versionInfo "$Date: 2009/11/15 10:54:12 $",
   :rdf/ns-prefix-map {"dc11"  "http://purl.org/dc/elements/1.1/",
                       "grddl" "http://www.w3.org/2003/g/data-view#",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "xml"   "http://www.w3.org/XML/1998/namespace",
                       "xsd"   "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "owl",
   :rdfa/uri "http://www.w3.org/2002/07/owl#",
   :rdfs/comment
   "\r\n  This ontology partially describes the built-in classes and\r\n  properties that together form the basis of the RDF/XML syntax of OWL 2.\r\n  The content of this ontology is based on Tables 6.1 and 6.2\r\n  in Section 6.4 of the OWL 2 RDF-Based Semantics specification,\r\n  available at http://www.w3.org/TR/owl2-rdf-based-semantics/.\r\n  Please note that those tables do not include the different annotations\r\n  (labels, comments and rdfs:isDefinedBy links) used in this file.\r\n  Also note that the descriptions provided in this ontology do not\r\n  provide a complete and correct formal description of either the syntax\r\n  or the semantics of the introduced terms (please see the OWL 2\r\n  recommendations for the complete and normative specifications).\r\n  Furthermore, the information provided by this ontology may be\r\n  misleading if not used with care. This ontology SHOULD NOT be imported\r\n  into OWL ontologies. Importing this file into an OWL 2 DL ontology\r\n  will cause it to become an OWL 2 Full ontology and may have other,\r\n  unexpected, consequences.\r\n   ",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.w3.org/TR/owl2-mapping-to-rdf/"}
                       {:xsd/anyURI "http://www.w3.org/TR/owl2-syntax/"}
                       {:xsd/anyURI
                        "http://www.w3.org/TR/owl2-rdf-based-semantics/"}},
   :rdfs/seeAlso
   #{{:xsd/anyURI
      "http://www.w3.org/TR/owl2-rdf-based-semantics/#table-axiomatic-properties"}
     {:xsd/anyURI
      "http://www.w3.org/TR/owl2-rdf-based-semantics/#table-axiomatic-classes"}},
   :xsd/anyURI "http://www.w3.org/2002/07/owl"})

(def AllDifferent
  {:db/ident :owl/AllDifferent,
   :rdf/type :rdfs/Class,
   :rdfs/comment "The class of collections of pairwise different individuals.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "AllDifferent",
   :rdfs/subClassOf :rdfs/Resource})

(def AllDisjointClasses
  {:db/ident         :owl/AllDisjointClasses,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of collections of pairwise disjoint classes.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "AllDisjointClasses",
   :rdfs/subClassOf  :rdfs/Resource})

(def AllDisjointProperties
  {:db/ident :owl/AllDisjointProperties,
   :rdf/type :rdfs/Class,
   :rdfs/comment "The class of collections of pairwise disjoint properties.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "AllDisjointProperties",
   :rdfs/subClassOf :rdfs/Resource})

(def Annotation
  {:db/ident :owl/Annotation,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The class of annotated annotations for which the RDF serialization consists of an annotated subject, predicate and object.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "Annotation",
   :rdfs/subClassOf :rdfs/Resource})

(def AnnotationProperty
  {:db/ident         :owl/AnnotationProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of annotation properties.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "AnnotationProperty",
   :rdfs/subClassOf  :rdf/Property})

(def AsymmetricProperty
  {:db/ident         :owl/AsymmetricProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of asymmetric properties.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "AsymmetricProperty",
   :rdfs/subClassOf  :owl/ObjectProperty})

(def Axiom
  {:db/ident :owl/Axiom,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The class of annotated axioms for which the RDF serialization consists of an annotated subject, predicate and object.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "Axiom",
   :rdfs/subClassOf :rdfs/Resource})

(def T
  {:db/ident         :owl/Class,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of OWL classes.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "Class",
   :rdfs/subClassOf  :rdfs/Class})

(def DataRange
  {:db/ident :owl/DataRange,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The class of OWL data ranges, which are special kinds of datatypes. Note: The use of the IRI owl:DataRange has been deprecated as of OWL 2. The IRI rdfs:Datatype SHOULD be used instead.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "DataRange",
   :rdfs/subClassOf :rdfs/Datatype})

(def DatatypeProperty
  {:db/ident         :owl/DatatypeProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of data properties.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "DatatypeProperty",
   :rdfs/subClassOf  :rdf/Property})

(def DeprecatedClass
  {:db/ident         :owl/DeprecatedClass,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of deprecated classes.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "DeprecatedClass",
   :rdfs/subClassOf  :rdfs/Class})

(def DeprecatedProperty
  {:db/ident         :owl/DeprecatedProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of deprecated properties.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "DeprecatedProperty",
   :rdfs/subClassOf  :rdf/Property})

(def FunctionalProperty
  {:db/ident         :owl/FunctionalProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of functional properties.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "FunctionalProperty",
   :rdfs/subClassOf  :rdf/Property})

(def InverseFunctionalProperty
  {:db/ident         :owl/InverseFunctionalProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of inverse-functional properties.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "InverseFunctionalProperty",
   :rdfs/subClassOf  :owl/ObjectProperty})

(def IrreflexiveProperty
  {:db/ident         :owl/IrreflexiveProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of irreflexive properties.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "IrreflexiveProperty",
   :rdfs/subClassOf  :owl/ObjectProperty})

(def NamedIndividual
  {:db/ident         :owl/NamedIndividual,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of named individuals.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "NamedIndividual",
   :rdfs/subClassOf  :owl/Thing})

(def NegativePropertyAssertion
  {:db/ident         :owl/NegativePropertyAssertion,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of negative property assertions.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "NegativePropertyAssertion",
   :rdfs/subClassOf  :rdfs/Resource})

(def Nothing
  {:db/ident         :owl/Nothing,
   :rdf/type         :owl/Class,
   :rdfs/comment     "This is the empty class.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "Nothing",
   :rdfs/subClassOf  :owl/Thing})

(def ObjectProperty
  {:db/ident         :owl/ObjectProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of object properties.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "ObjectProperty",
   :rdfs/subClassOf  :rdf/Property})

(def Ontology
  {:db/ident         :owl/Ontology,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of ontologies.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "Ontology",
   :rdfs/subClassOf  :rdfs/Resource})

(def OntologyProperty
  {:db/ident         :owl/OntologyProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of ontology properties.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "OntologyProperty",
   :rdfs/subClassOf  :rdf/Property})

(def ReflexiveProperty
  {:db/ident         :owl/ReflexiveProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of reflexive properties.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "ReflexiveProperty",
   :rdfs/subClassOf  :owl/ObjectProperty})

(def Restriction
  {:db/ident         :owl/Restriction,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of property restrictions.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "Restriction",
   :rdfs/subClassOf  :owl/Class})

(def SymmetricProperty
  {:db/ident         :owl/SymmetricProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of symmetric properties.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "SymmetricProperty",
   :rdfs/subClassOf  :owl/ObjectProperty})

(def Thing
  {:db/ident         :owl/Thing,
   :rdf/type         :owl/Class,
   :rdfs/comment     "The class of OWL individuals.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "Thing"})

(def TransitiveProperty
  {:db/ident         :owl/TransitiveProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of transitive properties.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "TransitiveProperty",
   :rdfs/subClassOf  :owl/ObjectProperty})

(def allValuesFrom
  {:db/ident :owl/allValuesFrom,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the class that a universal property restriction refers to.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "allValuesFrom",
   :rdfs/range :rdfs/Class})

(def annotatedProperty
  {:db/ident :owl/annotatedProperty,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the predicate of an annotated axiom or annotated annotation.",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "annotatedProperty",
   :rdfs/range :rdfs/Resource})

(def annotatedSource
  {:db/ident :owl/annotatedSource,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the subject of an annotated axiom or annotated annotation.",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "annotatedSource",
   :rdfs/range :rdfs/Resource})

(def annotatedTarget
  {:db/ident :owl/annotatedTarget,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the object of an annotated axiom or annotated annotation.",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "annotatedTarget",
   :rdfs/range :rdfs/Resource})

(def assertionProperty
  {:db/ident :owl/assertionProperty,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the predicate of a negative property assertion.",
   :rdfs/domain :owl/NegativePropertyAssertion,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "assertionProperty",
   :rdfs/range :rdf/Property})

(def backwardCompatibleWith
  {:db/ident :owl/backwardCompatibleWith,
   :rdf/type #{:owl/OntologyProperty :owl/AnnotationProperty},
   :rdfs/comment
   "The annotation property that indicates that a given ontology is backward compatible with another ontology.",
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "backwardCompatibleWith",
   :rdfs/range :owl/Ontology})

(def bottomDataProperty
  {:db/ident :owl/bottomDataProperty,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The data property that does not relate any individual to any data value.",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "bottomDataProperty",
   :rdfs/range :rdfs/Literal})

(def bottomObjectProperty
  {:db/ident :owl/bottomObjectProperty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The object property that does not relate any two individuals.",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "bottomObjectProperty",
   :rdfs/range :owl/Thing})

(def cardinality
  {:db/ident :owl/cardinality,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the cardinality of an exact cardinality restriction.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "cardinality",
   :rdfs/range :xsd/nonNegativeInteger})

(def complementOf
  {:db/ident :owl/complementOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines that a given class is the complement of another class.",
   :rdfs/domain :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "complementOf",
   :rdfs/range :owl/Class})

(def datatypeComplementOf
  {:db/ident :owl/datatypeComplementOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines that a given data range is the complement of another data range with respect to the data domain.",
   :rdfs/domain :rdfs/Datatype,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "datatypeComplementOf",
   :rdfs/range :rdfs/Datatype})

(def deprecated
  {:db/ident :owl/deprecated,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "The annotation property that indicates that a given entity has been deprecated.",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "deprecated",
   :rdfs/range :rdfs/Resource})

(def differentFrom
  {:db/ident :owl/differentFrom,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines that two given individuals are different.",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "differentFrom",
   :rdfs/range :owl/Thing})

(def disjointUnionOf
  {:db/ident :owl/disjointUnionOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines that a given class is equivalent to the disjoint union of a collection of other classes.",
   :rdfs/domain :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "disjointUnionOf",
   :rdfs/range :rdf/List})

(def disjointWith
  {:db/ident :owl/disjointWith,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines that two given classes are disjoint.",
   :rdfs/domain :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "disjointWith",
   :rdfs/range :owl/Class})

(def distinctMembers
  {:db/ident :owl/distinctMembers,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the collection of pairwise different individuals in a owl:AllDifferent axiom.",
   :rdfs/domain :owl/AllDifferent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "distinctMembers",
   :rdfs/range :rdf/List})

(def equivalentClass
  {:db/ident :owl/equivalentClass,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines that two given classes are equivalent, and that is used to specify datatype definitions.",
   :rdfs/domain :rdfs/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "equivalentClass",
   :rdfs/range :rdfs/Class})

(def equivalentProperty
  {:db/ident :owl/equivalentProperty,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines that two given properties are equivalent.",
   :rdfs/domain :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "equivalentProperty",
   :rdfs/range :rdf/Property})

(def hasKey
  {:db/ident :owl/hasKey,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the collection of properties that jointly build a key.",
   :rdfs/domain :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "hasKey",
   :rdfs/range :rdf/List})

(def hasSelf
  {:db/ident :owl/hasSelf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the property that a self restriction refers to.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "hasSelf",
   :rdfs/range :rdfs/Resource})

(def hasValue
  {:db/ident :owl/hasValue,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the individual that a has-value restriction refers to.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "hasValue",
   :rdfs/range :rdfs/Resource})

(def imports
  {:db/ident :owl/imports,
   :rdf/type :owl/OntologyProperty,
   :rdfs/comment
   "The property that is used for importing other ontologies into a given ontology.",
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "imports",
   :rdfs/range :owl/Ontology})

(def incompatibleWith
  {:db/ident :owl/incompatibleWith,
   :rdf/type #{:owl/OntologyProperty :owl/AnnotationProperty},
   :rdfs/comment
   "The annotation property that indicates that a given ontology is incompatible with another ontology.",
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "incompatibleWith",
   :rdfs/range :owl/Ontology})

(def intersectionOf
  {:db/ident :owl/intersectionOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the collection of classes or data ranges that build an intersection.",
   :rdfs/domain :rdfs/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "intersectionOf",
   :rdfs/range :rdf/List})

(def inverseOf
  {:db/ident :owl/inverseOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines that two given properties are inverse.",
   :rdfs/domain :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "inverseOf",
   :rdfs/range :owl/ObjectProperty})

(def maxCardinality
  {:db/ident :owl/maxCardinality,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the cardinality of a maximum cardinality restriction.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "maxCardinality",
   :rdfs/range :xsd/nonNegativeInteger})

(def maxQualifiedCardinality
  {:db/ident :owl/maxQualifiedCardinality,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the cardinality of a maximum qualified cardinality restriction.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "maxQualifiedCardinality",
   :rdfs/range :xsd/nonNegativeInteger})

(def members
  {:db/ident :owl/members,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the collection of members in either a owl:AllDifferent, owl:AllDisjointClasses or owl:AllDisjointProperties axiom.",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "members",
   :rdfs/range :rdf/List})

(def minCardinality
  {:db/ident :owl/minCardinality,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the cardinality of a minimum cardinality restriction.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "minCardinality",
   :rdfs/range :xsd/nonNegativeInteger})

(def minQualifiedCardinality
  {:db/ident :owl/minQualifiedCardinality,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the cardinality of a minimum qualified cardinality restriction.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "minQualifiedCardinality",
   :rdfs/range :xsd/nonNegativeInteger})

(def onClass
  {:db/ident :owl/onClass,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the class that a qualified object cardinality restriction refers to.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "onClass",
   :rdfs/range :owl/Class})

(def onDataRange
  {:db/ident :owl/onDataRange,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the data range that a qualified data cardinality restriction refers to.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "onDataRange",
   :rdfs/range :rdfs/Datatype})

(def onDatatype
  {:db/ident :owl/onDatatype,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the datatype that a datatype restriction refers to.",
   :rdfs/domain :rdfs/Datatype,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "onDatatype",
   :rdfs/range :rdfs/Datatype})

(def onProperties
  {:db/ident :owl/onProperties,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the n-tuple of properties that a property restriction on an n-ary data range refers to.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "onProperties",
   :rdfs/range :rdf/List})

(def onProperty
  {:db/ident :owl/onProperty,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the property that a property restriction refers to.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "onProperty",
   :rdfs/range :rdf/Property})

(def oneOf
  {:db/ident :owl/oneOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the collection of individuals or data values that build an enumeration.",
   :rdfs/domain :rdfs/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "oneOf",
   :rdfs/range :rdf/List})

(def priorVersion
  {:db/ident :owl/priorVersion,
   :rdf/type #{:owl/OntologyProperty :owl/AnnotationProperty},
   :rdfs/comment
   "The annotation property that indicates the predecessor ontology of a given ontology.",
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "priorVersion",
   :rdfs/range :owl/Ontology})

(def propertyChainAxiom
  {:db/ident :owl/propertyChainAxiom,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the n-tuple of properties that build a sub property chain of a given property.",
   :rdfs/domain :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "propertyChainAxiom",
   :rdfs/range :rdf/List})

(def propertyDisjointWith
  {:db/ident :owl/propertyDisjointWith,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines that two given properties are disjoint.",
   :rdfs/domain :rdf/Property,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "propertyDisjointWith",
   :rdfs/range :rdf/Property})

(def qualifiedCardinality
  {:db/ident :owl/qualifiedCardinality,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the cardinality of an exact qualified cardinality restriction.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "qualifiedCardinality",
   :rdfs/range :xsd/nonNegativeInteger})

(def sameAs
  {:db/ident :owl/sameAs,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines that two given individuals are equal.",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "sameAs",
   :rdfs/range :owl/Thing})

(def someValuesFrom
  {:db/ident :owl/someValuesFrom,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the class that an existential property restriction refers to.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "someValuesFrom",
   :rdfs/range :rdfs/Class})

(def sourceIndividual
  {:db/ident :owl/sourceIndividual,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the subject of a negative property assertion.",
   :rdfs/domain :owl/NegativePropertyAssertion,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "sourceIndividual",
   :rdfs/range :owl/Thing})

(def targetIndividual
  {:db/ident :owl/targetIndividual,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the object of a negative object property assertion.",
   :rdfs/domain :owl/NegativePropertyAssertion,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "targetIndividual",
   :rdfs/range :owl/Thing})

(def targetValue
  {:db/ident :owl/targetValue,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the value of a negative data property assertion.",
   :rdfs/domain :owl/NegativePropertyAssertion,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "targetValue",
   :rdfs/range :rdfs/Literal})

(def topDataProperty
  {:db/ident :owl/topDataProperty,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The data property that relates every individual to every data value.",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "topDataProperty",
   :rdfs/range :rdfs/Literal})

(def topObjectProperty
  {:db/ident         :owl/topObjectProperty,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "The object property that relates every two individuals.",
   :rdfs/domain      :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "topObjectProperty",
   :rdfs/range       :owl/Thing})

(def unionOf
  {:db/ident :owl/unionOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the collection of classes or data ranges that build a union.",
   :rdfs/domain :rdfs/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "unionOf",
   :rdfs/range :rdf/List})

(def versionIRI
  {:db/ident :owl/versionIRI,
   :rdf/type :owl/OntologyProperty,
   :rdfs/comment "The property that identifies the version IRI of an ontology.",
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "versionIRI",
   :rdfs/range :owl/Ontology})

(def versionInfo
  {:db/ident :owl/versionInfo,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "The annotation property that provides version information for an ontology or another OWL construct.",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "versionInfo",
   :rdfs/range :rdfs/Resource})

(def withRestrictions
  {:db/ident :owl/withRestrictions,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the collection of facet-value pairs that define a datatype restriction.",
   :rdfs/domain :rdfs/Datatype,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "withRestrictions",
   :rdfs/range :rdf/List})