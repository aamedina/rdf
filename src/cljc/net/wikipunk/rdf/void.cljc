(ns net.wikipunk.rdf.void
  {:adms/accessURL     #xsd/string "http://vocab.deri.ie/void.rdf",
   :adms/status        {:rdfa/uri "http://purl.org/adms/status/Completed"},
   :dcterms/FileFormat {:rdfa/uri "http://rdfs.org/ns/void"},
   :rdf/ns-prefix-map  {"adms"    "http://www.w3.org/ns/adms#",
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
   :rdf/type           :adms/SemanticDistribution,
   :rdfa/prefix        "void",
   :rdfa/uri           "http://vocab.deri.ie/void#rdf",
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/TR/void/"}}
  (:refer-clojure :exclude [class]))

(def Dataset
  "A set of RDF triples that are published, maintained or aggregated by a single provider."
  {:db/ident :void/Dataset,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/string
    "A set of RDF triples that are published, maintained or aggregated by a single provider.",
   :rdfs/label #xsd/string "dataset",
   :rdfs/subClassOf :rdfs/Resource})

(def DatasetDescription
  "A web resource whose foaf:primaryTopic or foaf:topics include void:Datasets."
  {:db/ident :void/DatasetDescription,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/string
    "A web resource whose foaf:primaryTopic or foaf:topics include void:Datasets.",
   :rdfs/label #xsd/string "dataset description",
   :rdfs/subClassOf [:rdfs/Resource :foaf/Document]})

(def Linkset
  "A collection of RDF links between two void:Datasets."
  {:db/ident        :void/Linkset,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    #xsd/string
                     "A collection of RDF links between two void:Datasets.",
   :rdfs/label      #xsd/string "linkset",
   :rdfs/subClassOf [:void/Dataset :rdfs/Resource]})

(def TechnicalFeature
  "A technical feature of a void:Dataset, such as a supported RDF serialization format."
  {:db/ident :void/TechnicalFeature,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/string
    "A technical feature of a void:Dataset, such as a supported RDF serialization format.",
   :rdfs/label #xsd/string "technical feature",
   :rdfs/subClassOf :rdfs/Resource})

(def class
  "The rdfs:Class that is the rdf:type of all entities in a class-based partition."
  {:db/ident :void/class,
   :rdf/type :owl/FunctionalProperty,
   :rdfs/comment
   #xsd/string
    "The rdfs:Class that is the rdf:type of all entities in a class-based partition.",
   :rdfs/domain :void/Dataset,
   :rdfs/label #xsd/string "class",
   :rdfs/range :rdfs/Class})

(def classPartition
  "A subset of a void:Dataset that contains only the entities of a certain rdfs:Class."
  {:db/ident :void/classPartition,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "A subset of a void:Dataset that contains only the entities of a certain rdfs:Class.",
   :rdfs/domain :void/Dataset,
   :rdfs/label #xsd/string "class partition",
   :rdfs/range :void/Dataset,
   :rdfs/subPropertyOf :void/subset})

(def classes
  "The total number of distinct classes in a void:Dataset. In other words, the number of distinct resources occuring as objects of rdf:type triples in the dataset."
  {:db/ident :void/classes,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "The total number of distinct classes in a void:Dataset. In other words, the number of distinct resources occuring as objects of rdf:type triples in the dataset.",
   :rdfs/domain :void/Dataset,
   :rdfs/label #xsd/string "classes",
   :rdfs/range :xsd/integer})

(def dataDump
  "An RDF dump, partial or complete, of a void:Dataset."
  {:db/ident     :void/dataDump,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment #xsd/string
                  "An RDF dump, partial or complete, of a void:Dataset.",
   :rdfs/domain  :void/Dataset,
   :rdfs/label   #xsd/string "Data Dump",
   :rdfs/range   :rdfs/Resource})

(def distinctObjects
  "The total number of distinct objects in a void:Dataset. In other words, the number of distinct resources that occur in the object position of triples in the dataset. Literals are included in this count."
  {:db/ident :void/distinctObjects,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "The total number of distinct objects in a void:Dataset. In other words, the number of distinct resources that occur in the object position of triples in the dataset. Literals are included in this count.",
   :rdfs/domain :void/Dataset,
   :rdfs/label #xsd/string "distinct objects",
   :rdfs/range :xsd/integer})

(def distinctSubjects
  "The total number of distinct subjects in a void:Dataset. In other words, the number of distinct resources that occur in the subject position of triples in the dataset."
  {:db/ident :void/distinctSubjects,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "The total number of distinct subjects in a void:Dataset. In other words, the number of distinct resources that occur in the subject position of triples in the dataset.",
   :rdfs/domain :void/Dataset,
   :rdfs/label #xsd/string "distinct subjects",
   :rdfs/range :xsd/integer})

(def documents
  "The total number of documents, for datasets that are published as a set of individual documents, such as RDF/XML documents or RDFa-annotated web pages. Non-RDF documents, such as web pages in HTML or images, are usually not included in this count. This property is intended for datasets where the total number of triples or entities is hard to determine. void:triples or void:entities should be preferred where practical."
  {:db/ident :void/documents,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "The total number of documents, for datasets that are published as a set of individual documents, such as RDF/XML documents or RDFa-annotated web pages. Non-RDF documents, such as web pages in HTML or images, are usually not included in this count. This property is intended for datasets where the total number of triples or entities is hard to determine. void:triples or void:entities should be preferred where practical.",
   :rdfs/domain :void/Dataset,
   :rdfs/label #xsd/string "number of documents",
   :rdfs/range :xsd/integer})

(def entities
  "The total number of entities that are described in a void:Dataset."
  {:db/ident :void/entities,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "The total number of entities that are described in a void:Dataset.",
   :rdfs/domain :void/Dataset,
   :rdfs/label #xsd/string "number of entities",
   :rdfs/range :xsd/integer})

(def exampleResource
  "example resource of dataset"
  {:db/ident    :void/exampleResource,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :void/Dataset,
   :rdfs/label  #xsd/string "example resource of dataset",
   :rdfs/range  :rdfs/Resource})

(def feature
  "feature"
  {:db/ident    :void/feature,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :void/Dataset,
   :rdfs/label  #xsd/string "feature",
   :rdfs/range  :void/TechnicalFeature})

(def inDataset
  "Points to the void:Dataset that a document is a part of."
  {:db/ident     :void/inDataset,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment #xsd/string
                  "Points to the void:Dataset that a document is a part of.",
   :rdfs/domain  :foaf/Document,
   :rdfs/label   #xsd/string "in dataset",
   :rdfs/range   :void/Dataset})

(def linkPredicate
  "a link predicate"
  {:db/ident    :void/linkPredicate,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :void/Linkset,
   :rdfs/label  #xsd/string "a link predicate",
   :rdfs/range  :rdf/Property})

(def objectsTarget
  "The dataset describing the objects of the triples contained in the Linkset."
  {:db/ident :void/objectsTarget,
   :rdf/type :owl/FunctionalProperty,
   :rdfs/comment
   #xsd/string
    "The dataset describing the objects of the triples contained in the Linkset.",
   :rdfs/domain :void/Linkset,
   :rdfs/label #xsd/string "Objects Target",
   :rdfs/range :void/Dataset,
   :rdfs/subPropertyOf :void/target})

(def openSearchDescription
  "An OpenSearch description document for a free-text search service over a void:Dataset."
  {:db/ident :void/openSearchDescription,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "An OpenSearch description document for a free-text search service over a void:Dataset.",
   :rdfs/domain :void/Dataset,
   :rdfs/label #xsd/string "open search description",
   :rdfs/range :foaf/Document})

(def properties
  "The total number of distinct properties in a void:Dataset. In other words, the number of distinct resources that occur in the predicate position of triples in the dataset."
  {:db/ident :void/properties,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "The total number of distinct properties in a void:Dataset. In other words, the number of distinct resources that occur in the predicate position of triples in the dataset.",
   :rdfs/domain :void/Dataset,
   :rdfs/label #xsd/string "number of properties",
   :rdfs/range :xsd/integer})

(def property
  "The rdf:Property that is the predicate of all triples in a property-based partition."
  {:db/ident :void/property,
   :rdf/type :owl/FunctionalProperty,
   :rdfs/comment
   #xsd/string
    "The rdf:Property that is the predicate of all triples in a property-based partition.",
   :rdfs/domain :void/Dataset,
   :rdfs/label #xsd/string "property",
   :rdfs/range :rdf/Property})

(def propertyPartition
  "A subset of a void:Dataset that contains only the triples of a certain rdf:Property."
  {:db/ident :void/propertyPartition,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "A subset of a void:Dataset that contains only the triples of a certain rdf:Property.",
   :rdfs/domain :void/Dataset,
   :rdfs/label #xsd/string "property partition",
   :rdfs/range :void/Dataset,
   :rdfs/subPropertyOf :void/subset})

(def rootResource
  "A top concept or entry point for a void:Dataset that is structured in a tree-like fashion. All resources in a dataset can be reached by following links from its root resources in a small number of steps."
  {:db/ident :void/rootResource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "A top concept or entry point for a void:Dataset that is structured in a tree-like fashion. All resources in a dataset can be reached by following links from its root resources in a small number of steps.",
   :rdfs/domain :void/Dataset,
   :rdfs/label #xsd/string "root resource"})

(def sparqlEndpoint
  "has a SPARQL endpoint at"
  {:db/ident    :void/sparqlEndpoint,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :void/Dataset,
   :rdfs/label  #xsd/string "has a SPARQL endpoint at"})

(def subjectsTarget
  "The dataset describing the subjects of triples contained in the Linkset."
  {:db/ident :void/subjectsTarget,
   :rdf/type :owl/FunctionalProperty,
   :rdfs/comment
   #xsd/string
    "The dataset describing the subjects of triples contained in the Linkset.",
   :rdfs/domain :void/Linkset,
   :rdfs/label #xsd/string "Subjects Target",
   :rdfs/range :void/Dataset,
   :rdfs/subPropertyOf :void/target})

(def subset
  "has subset"
  {:db/ident    :void/subset,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :void/Dataset,
   :rdfs/label  #xsd/string "has subset",
   :rdfs/range  :void/Dataset})

(def target
  "One of the two datasets linked by the Linkset."
  {:db/ident     :void/target,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment #xsd/string "One of the two datasets linked by the Linkset.",
   :rdfs/domain  :void/Linkset,
   :rdfs/label   #xsd/string "Target",
   :rdfs/range   :void/Dataset})

(def triples
  "The total number of triples contained in a void:Dataset."
  {:db/ident     :void/triples,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/string
                  "The total number of triples contained in a void:Dataset.",
   :rdfs/domain  :void/Dataset,
   :rdfs/label   #xsd/string "number of triples",
   :rdfs/range   :xsd/integer})

(def uriLookupEndpoint
  "Defines a simple URI look-up protocol for accessing a dataset."
  {:db/ident :void/uriLookupEndpoint,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string "Defines a simple URI look-up protocol for accessing a dataset.",
   :rdfs/domain :void/Dataset,
   :rdfs/label #xsd/string "has an URI look-up endpoint at"})

(def uriRegexPattern
  "Defines a regular expression pattern matching URIs in the dataset."
  {:db/ident :void/uriRegexPattern,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Defines a regular expression pattern matching URIs in the dataset.",
   :rdfs/domain :void/Dataset,
   :rdfs/label #xsd/string "has URI regular expression pattern"})

(def uriSpace
  "A URI that is a common string prefix of all the entity URIs in a void:Dataset."
  {:db/ident :void/uriSpace,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "A URI that is a common string prefix of all the entity URIs in a void:Dataset.",
   :rdfs/domain :void/Dataset,
   :rdfs/label #xsd/string "URI space",
   :rdfs/range :rdfs/Literal})

(def vocabulary
  "A vocabulary that is used in the dataset."
  {:db/ident     :void/vocabulary,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment #xsd/string "A vocabulary that is used in the dataset.",
   :rdfs/domain  :void/Dataset,
   :rdfs/label   #xsd/string "vocabulary"})
