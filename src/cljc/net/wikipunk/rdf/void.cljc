(ns net.wikipunk.rdf.void
  {:dcat/downloadURL  "net/wikipunk/boot/void.ttl",
   :rdf/ns-prefix-map {"adms"    "http://www.w3.org/ns/adms#",
                       "dc11"    "http://purl.org/dc/elements/1.1/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "schema"  "https://schema.org/",
                       "vann"    "http://purl.org/vocab/vann/",
                       "void"    "http://rdfs.org/ns/void#",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "void",
   :rdfa/uri          "http://rdfs.org/ns/void#",
   :rdfs/isDefinedBy  {:rdfa/uri "http://www.w3.org/TR/void/"}}
  (:refer-clojure :exclude [class]))

(def Dataset
  {:db/ident :void/Dataset,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   "A set of RDF triples that are published, maintained or aggregated by a single provider.",
   :rdfs/label "dataset"})

(def DatasetDescription
  {:db/ident :void/DatasetDescription,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   "A web resource whose foaf:primaryTopic or foaf:topics include void:Datasets.",
   :rdfs/label "dataset description",
   :rdfs/subClassOf :foaf/Document})

(def Linkset
  {:db/ident        :void/Linkset,
   :rdf/type        #{:rdfs/Class :owl/Class},
   :rdfs/comment    "A collection of RDF links between two void:Datasets.",
   :rdfs/label      "linkset",
   :rdfs/subClassOf :void/Dataset})

(def TechnicalFeature
  {:db/ident :void/TechnicalFeature,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   "A technical feature of a void:Dataset, such as a supported RDF serialization format.",
   :rdfs/label "technical feature"})

(def class
  {:db/ident :void/class,
   :rdf/type :owl/FunctionalProperty,
   :rdfs/comment
   "The rdfs:Class that is the rdf:type of all entities in a class-based partition.",
   :rdfs/domain :void/Dataset,
   :rdfs/label "class",
   :rdfs/range :rdfs/Class})

(def classPartition
  {:db/ident :void/classPartition,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A subset of a void:Dataset that contains only the entities of a certain rdfs:Class.",
   :rdfs/domain :void/Dataset,
   :rdfs/label "class partition",
   :rdfs/range :void/Dataset,
   :rdfs/subPropertyOf :void/subset})

(def classes
  {:db/ident :void/classes,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The total number of distinct classes in a void:Dataset. In other words, the number of distinct resources occuring as objects of rdf:type triples in the dataset.",
   :rdfs/domain :void/Dataset,
   :rdfs/label "classes",
   :rdfs/range :xsd/integer})

(def dataDump
  {:db/ident     :void/dataDump,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "An RDF dump, partial or complete, of a void:Dataset.",
   :rdfs/domain  :void/Dataset,
   :rdfs/label   "Data Dump",
   :rdfs/range   :rdfs/Resource})

(def distinctObjects
  {:db/ident :void/distinctObjects,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The total number of distinct objects in a void:Dataset. In other words, the number of distinct resources that occur in the object position of triples in the dataset. Literals are included in this count.",
   :rdfs/domain :void/Dataset,
   :rdfs/label "distinct objects",
   :rdfs/range :xsd/integer})

(def distinctSubjects
  {:db/ident :void/distinctSubjects,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The total number of distinct subjects in a void:Dataset. In other words, the number of distinct resources that occur in the subject position of triples in the dataset.",
   :rdfs/domain :void/Dataset,
   :rdfs/label "distinct subjects",
   :rdfs/range :xsd/integer})

(def documents
  {:db/ident :void/documents,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The total number of documents, for datasets that are published as a set of individual documents, such as RDF/XML documents or RDFa-annotated web pages. Non-RDF documents, such as web pages in HTML or images, are usually not included in this count. This property is intended for datasets where the total number of triples or entities is hard to determine. void:triples or void:entities should be preferred where practical.",
   :rdfs/domain :void/Dataset,
   :rdfs/label "number of documents",
   :rdfs/range :xsd/integer})

(def entities
  {:db/ident :void/entities,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The total number of entities that are described in a void:Dataset.",
   :rdfs/domain :void/Dataset,
   :rdfs/label "number of entities",
   :rdfs/range :xsd/integer})

(def exampleResource
  {:db/ident    :void/exampleResource,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :void/Dataset,
   :rdfs/label  "example resource of dataset",
   :rdfs/range  :rdfs/Resource})

(def feature
  {:db/ident    :void/feature,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :void/Dataset,
   :rdfs/label  "feature",
   :rdfs/range  :void/TechnicalFeature})

(def inDataset
  {:db/ident     :void/inDataset,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Points to the void:Dataset that a document is a part of.",
   :rdfs/domain  :foaf/Document,
   :rdfs/label   "in dataset",
   :rdfs/range   :void/Dataset})

(def linkPredicate
  {:db/ident    :void/linkPredicate,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :void/Linkset,
   :rdfs/label  "a link predicate",
   :rdfs/range  :rdf/Property})

(def objectsTarget
  {:db/ident :void/objectsTarget,
   :rdf/type :owl/FunctionalProperty,
   :rdfs/comment
   "The dataset describing the objects of the triples contained in the Linkset.",
   :rdfs/domain :void/Linkset,
   :rdfs/label "Objects Target",
   :rdfs/range :void/Dataset,
   :rdfs/subPropertyOf :void/target})

(def openSearchDescription
  {:db/ident :void/openSearchDescription,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "An OpenSearch description document for a free-text search service over a void:Dataset.",
   :rdfs/domain :void/Dataset,
   :rdfs/label "open search description",
   :rdfs/range :foaf/Document})

(def properties
  {:db/ident :void/properties,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The total number of distinct properties in a void:Dataset. In other words, the number of distinct resources that occur in the predicate position of triples in the dataset.",
   :rdfs/domain :void/Dataset,
   :rdfs/label "number of properties",
   :rdfs/range :xsd/integer})

(def property
  {:db/ident :void/property,
   :rdf/type :owl/FunctionalProperty,
   :rdfs/comment
   "The rdf:Property that is the predicate of all triples in a property-based partition.",
   :rdfs/domain :void/Dataset,
   :rdfs/label "property",
   :rdfs/range :rdf/Property})

(def propertyPartition
  {:db/ident :void/propertyPartition,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A subset of a void:Dataset that contains only the triples of a certain rdf:Property.",
   :rdfs/domain :void/Dataset,
   :rdfs/label "property partition",
   :rdfs/range :void/Dataset,
   :rdfs/subPropertyOf :void/subset})

(def rootResource
  {:db/ident :void/rootResource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A top concept or entry point for a void:Dataset that is structured in a tree-like fashion. All resources in a dataset can be reached by following links from its root resources in a small number of steps.",
   :rdfs/domain :void/Dataset,
   :rdfs/label "root resource"})

(def sparqlEndpoint
  {:db/ident    :void/sparqlEndpoint,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :void/Dataset,
   :rdfs/label  "has a SPARQL endpoint at"})

(def subjectsTarget
  {:db/ident :void/subjectsTarget,
   :rdf/type :owl/FunctionalProperty,
   :rdfs/comment
   "The dataset describing the subjects of triples contained in the Linkset.",
   :rdfs/domain :void/Linkset,
   :rdfs/label "Subjects Target",
   :rdfs/range :void/Dataset,
   :rdfs/subPropertyOf :void/target})

(def subset
  {:db/ident    :void/subset,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :void/Dataset,
   :rdfs/label  "has subset",
   :rdfs/range  :void/Dataset})

(def target
  {:db/ident     :void/target,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "One of the two datasets linked by the Linkset.",
   :rdfs/domain  :void/Linkset,
   :rdfs/label   "Target",
   :rdfs/range   :void/Dataset})

(def triples
  {:db/ident     :void/triples,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "The total number of triples contained in a void:Dataset.",
   :rdfs/domain  :void/Dataset,
   :rdfs/label   "number of triples",
   :rdfs/range   :xsd/integer})

(def uriLookupEndpoint
  {:db/ident :void/uriLookupEndpoint,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Defines a simple URI look-up protocol for accessing a dataset.",
   :rdfs/domain :void/Dataset,
   :rdfs/label "has an URI look-up endpoint at"})

(def uriRegexPattern
  {:db/ident :void/uriRegexPattern,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Defines a regular expression pattern matching URIs in the dataset.",
   :rdfs/domain :void/Dataset,
   :rdfs/label "has URI regular expression pattern"})

(def uriSpace
  {:db/ident :void/uriSpace,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A URI that is a common string prefix of all the entity URIs in a void:Dataset.",
   :rdfs/domain :void/Dataset,
   :rdfs/label "URI space",
   :rdfs/range :rdfs/Literal})

(def vocabulary
  {:db/ident     :void/vocabulary,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "A vocabulary that is used in the dataset.",
   :rdfs/domain  :void/Dataset,
   :rdfs/label   "vocabulary"})