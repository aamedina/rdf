(ns net.wikipunk.rdf.owl
  "\r\n  This ontology partially describes the built-in classes and\r\n  properties that together form the basis of the RDF/XML syntax of OWL 2.\r\n  The content of this ontology is based on Tables 6.1 and 6.2\r\n  in Section 6.4 of the OWL 2 RDF-Based Semantics specification,\r\n  available at http://www.w3.org/TR/owl2-rdf-based-semantics/.\r\n  Please note that those tables do not include the different annotations\r\n  (labels, comments and rdfs:isDefinedBy links) used in this file.\r\n  Also note that the descriptions provided in this ontology do not\r\n  provide a complete and correct formal description of either the syntax\r\n  or the semantics of the introduced terms (please see the OWL 2\r\n  recommendations for the complete and normative specifications).\r\n  Furthermore, the information provided by this ontology may be\r\n  misleading if not used with care. This ontology SHOULD NOT be imported\r\n  into OWL ontologies. Importing this file into an OWL 2 DL ontology\r\n  will cause it to become an OWL 2 Full ontology and may have other,\r\n  unexpected, consequences.\r\n   "
  {:dc11/title "The OWL 2 Schema vocabulary (OWL 2)",
   :grddl/namespaceTransformation
   {:rdfa/uri "http://dev.w3.org/cvsweb/2009/owl-grddl/owx2rdf.xsl"},
   :owl/imports {:rdfa/uri "http://www.w3.org/2000/01/rdf-schema"},
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
   :rdfa/uri "http://www.w3.org/2002/07/owl",
   :rdfs/comment
   "\r\n  This ontology partially describes the built-in classes and\r\n  properties that together form the basis of the RDF/XML syntax of OWL 2.\r\n  The content of this ontology is based on Tables 6.1 and 6.2\r\n  in Section 6.4 of the OWL 2 RDF-Based Semantics specification,\r\n  available at http://www.w3.org/TR/owl2-rdf-based-semantics/.\r\n  Please note that those tables do not include the different annotations\r\n  (labels, comments and rdfs:isDefinedBy links) used in this file.\r\n  Also note that the descriptions provided in this ontology do not\r\n  provide a complete and correct formal description of either the syntax\r\n  or the semantics of the introduced terms (please see the OWL 2\r\n  recommendations for the complete and normative specifications).\r\n  Furthermore, the information provided by this ontology may be\r\n  misleading if not used with care. This ontology SHOULD NOT be imported\r\n  into OWL ontologies. Importing this file into an OWL 2 DL ontology\r\n  will cause it to become an OWL 2 Full ontology and may have other,\r\n  unexpected, consequences.\r\n   ",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.w3.org/TR/owl2-syntax/"}
                      {:rdfa/uri "http://www.w3.org/TR/owl2-mapping-to-rdf/"}
                      {:rdfa/uri
                       "http://www.w3.org/TR/owl2-rdf-based-semantics/"}],
   :rdfs/seeAlso
   [{:rdfa/uri
     "http://www.w3.org/TR/owl2-rdf-based-semantics/#table-axiomatic-properties"}
    {:rdfa/uri
     "http://www.w3.org/TR/owl2-rdf-based-semantics/#table-axiomatic-classes"}],
   :reasoner nil})

(def AllDifferent
  "The class of collections of pairwise different individuals."
  {:db/ident :owl/AllDifferent,
   :rdf/type :rdfs/Class,
   :rdfs/comment "The class of collections of pairwise different individuals.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "AllDifferent",
   :rdfs/subClassOf :rdfs/Resource})

(def AllDisjointClasses
  "The class of collections of pairwise disjoint classes."
  {:db/ident         :owl/AllDisjointClasses,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of collections of pairwise disjoint classes.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "AllDisjointClasses",
   :rdfs/subClassOf  :rdfs/Resource})

(def AllDisjointProperties
  "The class of collections of pairwise disjoint properties."
  {:db/ident :owl/AllDisjointProperties,
   :rdf/type :rdfs/Class,
   :rdfs/comment "The class of collections of pairwise disjoint properties.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "AllDisjointProperties",
   :rdfs/subClassOf :rdfs/Resource})

(def Annotation
  "The class of annotated annotations for which the RDF serialization consists of an annotated subject, predicate and object."
  {:db/ident :owl/Annotation,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The class of annotated annotations for which the RDF serialization consists of an annotated subject, predicate and object.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "Annotation",
   :rdfs/subClassOf :rdfs/Resource})

(def AnnotationProperty
  "The class of annotation properties."
  {:db/ident         :owl/AnnotationProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of annotation properties.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "AnnotationProperty",
   :rdfs/subClassOf  :rdf/Property})

(def AsymmetricProperty
  "The class of asymmetric properties."
  {:db/ident         :owl/AsymmetricProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of asymmetric properties.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "AsymmetricProperty",
   :rdfs/subClassOf  :owl/ObjectProperty})

(def Axiom
  "The class of annotated axioms for which the RDF serialization consists of an annotated subject, predicate and object."
  {:db/ident :owl/Axiom,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The class of annotated axioms for which the RDF serialization consists of an annotated subject, predicate and object.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "Axiom",
   :rdfs/subClassOf :rdfs/Resource})

(def T
  "The class of OWL classes."
  {:db/ident         :owl/Class,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of OWL classes.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "Class",
   :rdfs/subClassOf  :rdfs/Class})

(def DataRange
  "The class of OWL data ranges, which are special kinds of datatypes. Note: The use of the IRI owl:DataRange has been deprecated as of OWL 2. The IRI rdfs:Datatype SHOULD be used instead."
  {:db/ident :owl/DataRange,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The class of OWL data ranges, which are special kinds of datatypes. Note: The use of the IRI owl:DataRange has been deprecated as of OWL 2. The IRI rdfs:Datatype SHOULD be used instead.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "DataRange",
   :rdfs/subClassOf :rdfs/Datatype})

(def DatatypeProperty
  "The class of data properties."
  {:db/ident         :owl/DatatypeProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of data properties.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "DatatypeProperty",
   :rdfs/subClassOf  :rdf/Property})

(def DeprecatedClass
  "The class of deprecated classes."
  {:db/ident         :owl/DeprecatedClass,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of deprecated classes.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "DeprecatedClass",
   :rdfs/subClassOf  :rdfs/Class})

(def DeprecatedProperty
  "The class of deprecated properties."
  {:db/ident         :owl/DeprecatedProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of deprecated properties.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "DeprecatedProperty",
   :rdfs/subClassOf  :rdf/Property})

(def FunctionalProperty
  "The class of functional properties."
  {:db/ident         :owl/FunctionalProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of functional properties.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "FunctionalProperty",
   :rdfs/subClassOf  :rdf/Property})

(def InverseFunctionalProperty
  "The class of inverse-functional properties."
  {:db/ident         :owl/InverseFunctionalProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of inverse-functional properties.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "InverseFunctionalProperty",
   :rdfs/subClassOf  :owl/ObjectProperty})

(def IrreflexiveProperty
  "The class of irreflexive properties."
  {:db/ident         :owl/IrreflexiveProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of irreflexive properties.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "IrreflexiveProperty",
   :rdfs/subClassOf  :owl/ObjectProperty})

(def NamedIndividual
  "The class of named individuals."
  {:db/ident         :owl/NamedIndividual,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of named individuals.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "NamedIndividual",
   :rdfs/subClassOf  :owl/Thing})

(def NegativePropertyAssertion
  "The class of negative property assertions."
  {:db/ident         :owl/NegativePropertyAssertion,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of negative property assertions.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "NegativePropertyAssertion",
   :rdfs/subClassOf  :rdfs/Resource})

(def Nothing
  "This is the empty class."
  {:db/ident         :owl/Nothing,
   :rdf/type         :owl/Class,
   :rdfs/comment     "This is the empty class.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "Nothing",
   :rdfs/subClassOf  :owl/Thing})

(def ObjectProperty
  "The class of object properties."
  {:db/ident         :owl/ObjectProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of object properties.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "ObjectProperty",
   :rdfs/subClassOf  :rdf/Property})

(def Ontology
  "The class of ontologies."
  {:db/ident         :owl/Ontology,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of ontologies.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "Ontology",
   :rdfs/subClassOf  :rdfs/Resource})

(def OntologyProperty
  "The class of ontology properties."
  {:db/ident         :owl/OntologyProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of ontology properties.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "OntologyProperty",
   :rdfs/subClassOf  :rdf/Property})

(def ReflexiveProperty
  "The class of reflexive properties."
  {:db/ident         :owl/ReflexiveProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of reflexive properties.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "ReflexiveProperty",
   :rdfs/subClassOf  :owl/ObjectProperty})

(def Restriction
  "The class of property restrictions."
  {:db/ident         :owl/Restriction,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of property restrictions.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "Restriction",
   :rdfs/subClassOf  :owl/Class})

(def SymmetricProperty
  "The class of symmetric properties."
  {:db/ident         :owl/SymmetricProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of symmetric properties.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "SymmetricProperty",
   :rdfs/subClassOf  :owl/ObjectProperty})

(def Thing
  "The class of OWL individuals."
  {:db/ident         :owl/Thing,
   :rdf/type         :owl/Class,
   :rdfs/comment     "The class of OWL individuals.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "Thing"})

(def TransitiveProperty
  "The class of transitive properties."
  {:db/ident         :owl/TransitiveProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class of transitive properties.",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "TransitiveProperty",
   :rdfs/subClassOf  :owl/ObjectProperty})

(def allValuesFrom
  "The property that determines the class that a universal property restriction refers to."
  {:db/ident :owl/allValuesFrom,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the class that a universal property restriction refers to.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "allValuesFrom",
   :rdfs/range :rdfs/Class})

(def annotatedProperty
  "The property that determines the predicate of an annotated axiom or annotated annotation."
  {:db/ident :owl/annotatedProperty,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the predicate of an annotated axiom or annotated annotation.",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "annotatedProperty",
   :rdfs/range :rdfs/Resource})

(def annotatedSource
  "The property that determines the subject of an annotated axiom or annotated annotation."
  {:db/ident :owl/annotatedSource,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the subject of an annotated axiom or annotated annotation.",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "annotatedSource",
   :rdfs/range :rdfs/Resource})

(def annotatedTarget
  "The property that determines the object of an annotated axiom or annotated annotation."
  {:db/ident :owl/annotatedTarget,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the object of an annotated axiom or annotated annotation.",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "annotatedTarget",
   :rdfs/range :rdfs/Resource})

(def assertionProperty
  "The property that determines the predicate of a negative property assertion."
  {:db/ident :owl/assertionProperty,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the predicate of a negative property assertion.",
   :rdfs/domain :owl/NegativePropertyAssertion,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "assertionProperty",
   :rdfs/range :rdf/Property})

(def backwardCompatibleWith
  "The annotation property that indicates that a given ontology is backward compatible with another ontology."
  {:db/ident :owl/backwardCompatibleWith,
   :rdf/type [:owl/OntologyProperty :owl/AnnotationProperty],
   :rdfs/comment
   "The annotation property that indicates that a given ontology is backward compatible with another ontology.",
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "backwardCompatibleWith",
   :rdfs/range :owl/Ontology})

(def bottomDataProperty
  "The data property that does not relate any individual to any data value."
  {:db/ident :owl/bottomDataProperty,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The data property that does not relate any individual to any data value.",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "bottomDataProperty",
   :rdfs/range :rdfs/Literal})

(def bottomObjectProperty
  "The object property that does not relate any two individuals."
  {:db/ident :owl/bottomObjectProperty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The object property that does not relate any two individuals.",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "bottomObjectProperty",
   :rdfs/range :owl/Thing})

(def cardinality
  "The property that determines the cardinality of an exact cardinality restriction."
  {:db/ident :owl/cardinality,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the cardinality of an exact cardinality restriction.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "cardinality",
   :rdfs/range :xsd/nonNegativeInteger})

(def complementOf
  "The property that determines that a given class is the complement of another class."
  {:db/ident :owl/complementOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines that a given class is the complement of another class.",
   :rdfs/domain :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "complementOf",
   :rdfs/range :owl/Class})

(def datatypeComplementOf
  "The property that determines that a given data range is the complement of another data range with respect to the data domain."
  {:db/ident :owl/datatypeComplementOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines that a given data range is the complement of another data range with respect to the data domain.",
   :rdfs/domain :rdfs/Datatype,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "datatypeComplementOf",
   :rdfs/range :rdfs/Datatype})

(def deprecated
  "The annotation property that indicates that a given entity has been deprecated."
  {:db/ident :owl/deprecated,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "The annotation property that indicates that a given entity has been deprecated.",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "deprecated",
   :rdfs/range :rdfs/Resource})

(def differentFrom
  "The property that determines that two given individuals are different."
  {:db/ident :owl/differentFrom,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines that two given individuals are different.",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "differentFrom",
   :rdfs/range :owl/Thing})

(def disjointUnionOf
  "The property that determines that a given class is equivalent to the disjoint union of a collection of other classes."
  {:db/ident :owl/disjointUnionOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines that a given class is equivalent to the disjoint union of a collection of other classes.",
   :rdfs/domain :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "disjointUnionOf",
   :rdfs/range :rdf/List})

(def disjointWith
  "The property that determines that two given classes are disjoint."
  {:db/ident :owl/disjointWith,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines that two given classes are disjoint.",
   :rdfs/domain :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "disjointWith",
   :rdfs/range :owl/Class})

(def distinctMembers
  "The property that determines the collection of pairwise different individuals in a owl:AllDifferent axiom."
  {:db/ident :owl/distinctMembers,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the collection of pairwise different individuals in a owl:AllDifferent axiom.",
   :rdfs/domain :owl/AllDifferent,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "distinctMembers",
   :rdfs/range :rdf/List})

(def equivalentClass
  "The property that determines that two given classes are equivalent, and that is used to specify datatype definitions."
  {:db/ident :owl/equivalentClass,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines that two given classes are equivalent, and that is used to specify datatype definitions.",
   :rdfs/domain :rdfs/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "equivalentClass",
   :rdfs/range :rdfs/Class})

(def equivalentProperty
  "The property that determines that two given properties are equivalent."
  {:db/ident :owl/equivalentProperty,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines that two given properties are equivalent.",
   :rdfs/domain :rdf/Property,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "equivalentProperty",
   :rdfs/range :rdf/Property})

(def hasKey
  "The property that determines the collection of properties that jointly build a key."
  {:db/ident :owl/hasKey,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the collection of properties that jointly build a key.",
   :rdfs/domain :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "hasKey",
   :rdfs/range :rdf/List})

(def hasSelf
  "The property that determines the property that a self restriction refers to."
  {:db/ident :owl/hasSelf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the property that a self restriction refers to.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "hasSelf",
   :rdfs/range :rdfs/Resource})

(def hasValue
  "The property that determines the individual that a has-value restriction refers to."
  {:db/ident :owl/hasValue,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the individual that a has-value restriction refers to.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "hasValue",
   :rdfs/range :rdfs/Resource})

(def imports
  "The property that is used for importing other ontologies into a given ontology."
  {:db/ident :owl/imports,
   :rdf/type :owl/OntologyProperty,
   :rdfs/comment
   "The property that is used for importing other ontologies into a given ontology.",
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "imports",
   :rdfs/range :owl/Ontology})

(def incompatibleWith
  "The annotation property that indicates that a given ontology is incompatible with another ontology."
  {:db/ident :owl/incompatibleWith,
   :rdf/type [:owl/OntologyProperty :owl/AnnotationProperty],
   :rdfs/comment
   "The annotation property that indicates that a given ontology is incompatible with another ontology.",
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "incompatibleWith",
   :rdfs/range :owl/Ontology})

(def intersectionOf
  "The property that determines the collection of classes or data ranges that build an intersection."
  {:db/ident :owl/intersectionOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the collection of classes or data ranges that build an intersection.",
   :rdfs/domain :rdfs/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "intersectionOf",
   :rdfs/range :rdf/List})

(def inverseOf
  "The property that determines that two given properties are inverse."
  {:db/ident :owl/inverseOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines that two given properties are inverse.",
   :rdfs/domain :owl/ObjectProperty,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "inverseOf",
   :rdfs/range :owl/ObjectProperty})

(def maxCardinality
  "The property that determines the cardinality of a maximum cardinality restriction."
  {:db/ident :owl/maxCardinality,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the cardinality of a maximum cardinality restriction.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "maxCardinality",
   :rdfs/range :xsd/nonNegativeInteger})

(def maxQualifiedCardinality
  "The property that determines the cardinality of a maximum qualified cardinality restriction."
  {:db/ident :owl/maxQualifiedCardinality,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the cardinality of a maximum qualified cardinality restriction.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "maxQualifiedCardinality",
   :rdfs/range :xsd/nonNegativeInteger})

(def members
  "The property that determines the collection of members in either a owl:AllDifferent, owl:AllDisjointClasses or owl:AllDisjointProperties axiom."
  {:db/ident :owl/members,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the collection of members in either a owl:AllDifferent, owl:AllDisjointClasses or owl:AllDisjointProperties axiom.",
   :rdfs/domain {:owl/unionOf [:owl/AllDifferent :owl/AllDisjointClasses :owl/AllDisjointProperties]}
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "members",
   :rdfs/range :rdf/List})

(def minCardinality
  "The property that determines the cardinality of a minimum cardinality restriction."
  {:db/ident :owl/minCardinality,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the cardinality of a minimum cardinality restriction.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "minCardinality",
   :rdfs/range :xsd/nonNegativeInteger})

(def minQualifiedCardinality
  "The property that determines the cardinality of a minimum qualified cardinality restriction."
  {:db/ident :owl/minQualifiedCardinality,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the cardinality of a minimum qualified cardinality restriction.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "minQualifiedCardinality",
   :rdfs/range :xsd/nonNegativeInteger})

(def onClass
  "The property that determines the class that a qualified object cardinality restriction refers to."
  {:db/ident :owl/onClass,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the class that a qualified object cardinality restriction refers to.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "onClass",
   :rdfs/range :owl/Class})

(def onDataRange
  "The property that determines the data range that a qualified data cardinality restriction refers to."
  {:db/ident :owl/onDataRange,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the data range that a qualified data cardinality restriction refers to.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "onDataRange",
   :rdfs/range :rdfs/Datatype})

(def onDatatype
  "The property that determines the datatype that a datatype restriction refers to."
  {:db/ident :owl/onDatatype,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the datatype that a datatype restriction refers to.",
   :rdfs/domain :rdfs/Datatype,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "onDatatype",
   :rdfs/range :rdfs/Datatype})

(def onProperties
  "The property that determines the n-tuple of properties that a property restriction on an n-ary data range refers to."
  {:db/ident :owl/onProperties,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the n-tuple of properties that a property restriction on an n-ary data range refers to.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "onProperties",
   :rdfs/range :rdf/List})

(def onProperty
  "The property that determines the property that a property restriction refers to."
  {:db/ident :owl/onProperty,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the property that a property restriction refers to.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "onProperty",
   :rdfs/range :rdf/Property})

(def oneOf
  "The property that determines the collection of individuals or data values that build an enumeration."
  {:db/ident :owl/oneOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the collection of individuals or data values that build an enumeration.",
   :rdfs/domain :rdfs/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "oneOf",
   :rdfs/range :rdf/List})

(def priorVersion
  "The annotation property that indicates the predecessor ontology of a given ontology."
  {:db/ident :owl/priorVersion,
   :rdf/type [:owl/OntologyProperty :owl/AnnotationProperty],
   :rdfs/comment
   "The annotation property that indicates the predecessor ontology of a given ontology.",
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "priorVersion",
   :rdfs/range :owl/Ontology})

(def propertyChainAxiom
  "The property that determines the n-tuple of properties that build a sub property chain of a given property."
  {:db/ident :owl/propertyChainAxiom,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the n-tuple of properties that build a sub property chain of a given property.",
   :rdfs/domain :owl/ObjectProperty,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "propertyChainAxiom",
   :rdfs/range :rdf/List})

(def propertyDisjointWith
  "The property that determines that two given properties are disjoint."
  {:db/ident :owl/propertyDisjointWith,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines that two given properties are disjoint.",
   :rdfs/domain :rdf/Property,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "propertyDisjointWith",
   :rdfs/range :rdf/Property})

(def qualifiedCardinality
  "The property that determines the cardinality of an exact qualified cardinality restriction."
  {:db/ident :owl/qualifiedCardinality,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the cardinality of an exact qualified cardinality restriction.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "qualifiedCardinality",
   :rdfs/range :xsd/nonNegativeInteger})

(def sameAs
  "The property that determines that two given individuals are equal."
  {:db/ident :owl/sameAs,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines that two given individuals are equal.",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "sameAs",
   :rdfs/range :owl/Thing})

(def someValuesFrom
  "The property that determines the class that an existential property restriction refers to."
  {:db/ident :owl/someValuesFrom,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the class that an existential property restriction refers to.",
   :rdfs/domain :owl/Restriction,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "someValuesFrom",
   :rdfs/range :rdfs/Class})

(def sourceIndividual
  "The property that determines the subject of a negative property assertion."
  {:db/ident :owl/sourceIndividual,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the subject of a negative property assertion.",
   :rdfs/domain :owl/NegativePropertyAssertion,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "sourceIndividual",
   :rdfs/range :owl/Thing})

(def targetIndividual
  "The property that determines the object of a negative object property assertion."
  {:db/ident :owl/targetIndividual,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the object of a negative object property assertion.",
   :rdfs/domain :owl/NegativePropertyAssertion,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "targetIndividual",
   :rdfs/range :owl/Thing})

(def targetValue
  "The property that determines the value of a negative data property assertion."
  {:db/ident :owl/targetValue,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the value of a negative data property assertion.",
   :rdfs/domain :owl/NegativePropertyAssertion,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "targetValue",
   :rdfs/range :rdfs/Literal})

(def topDataProperty
  "The data property that relates every individual to every data value."
  {:db/ident :owl/topDataProperty,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The data property that relates every individual to every data value.",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "topDataProperty",
   :rdfs/range :rdfs/Literal})

(def topObjectProperty
  "The object property that relates every two individuals."
  {:db/ident         :owl/topObjectProperty,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "The object property that relates every two individuals.",
   :rdfs/domain      :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label       "topObjectProperty",
   :rdfs/range       :owl/Thing})

(def unionOf
  "The property that determines the collection of classes or data ranges that build a union."
  {:db/ident :owl/unionOf,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the collection of classes or data ranges that build a union.",
   :rdfs/domain :rdfs/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "unionOf",
   :rdfs/range :rdf/List})

(def versionIRI
  "The property that identifies the version IRI of an ontology."
  {:db/ident :owl/versionIRI,
   :rdf/type :owl/OntologyProperty,
   :rdfs/comment "The property that identifies the version IRI of an ontology.",
   :rdfs/domain :owl/Ontology,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "versionIRI",
   :rdfs/range :owl/Ontology})

(def versionInfo
  "The annotation property that provides version information for an ontology or another OWL construct."
  {:db/ident :owl/versionInfo,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "The annotation property that provides version information for an ontology or another OWL construct.",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "versionInfo",
   :rdfs/range :rdfs/Resource})

(def withRestrictions
  "The property that determines the collection of facet-value pairs that define a datatype restriction."
  {:db/ident :owl/withRestrictions,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The property that determines the collection of facet-value pairs that define a datatype restriction.",
   :rdfs/domain :rdfs/Datatype,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/2002/07/owl#"},
   :rdfs/label "withRestrictions",
   :rdfs/range :rdf/List})

(def rational
  "owl:rational"
  {:db/ident        :owl/rational
   :rdf/type        :rdfs/Datatype
   :rdfs/subClassOf :rdfs/Literal})

(def real
  "owl:real"
  {:db/ident        :owl/real
   :db/cardinality  :db.cardinality/one
   :db/valueType    :db.type/bigdec
   :rdf/type        :rdfs/Datatype
   :rdfs/subClassOf :rdfs/Literal})
