(ns net.wikipunk.rdf.vaem
  {:dcat/downloadURL "net/wikipunk/ext/vaem_2014-08-11.n3",
   :namespaces {"dcterms" "http://purl.org/dc/terms/",
                "owl"     "http://www.w3.org/2002/07/owl#",
                "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                "vaem"    "http://www.linkedmodel.org/schema/vaem#",
                "voag"    "http://voag.linkedmodel.org/voag/",
                "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "vaem",
   :rdfa/uri "http://www.linkedmodel.org/schema/vaem#",
   :rdfs/comment
   "VAEM stands for \"Vocabulary for Attaching Essential Metadata\". The purpose of VAEM is to provide, by import, a foundation for commonly needed resources when building an ontology. An effort has been made to restrict these resources to a minimal level.   What VAEM regards as 'essential metadata' is data about dates and times, confidentiality, and other characterisitic qualifiers of the ontology, but also references to where a ontology is documented and where to find ontology Governance, Attribution and Provenance. VAEM also defines classes for representing enumerations and enumerated values.",
   :xsd/anyURI "http://www.linkedmodel.org/schema/vaem#"}
  (:refer-clojure :exclude [comment name namespace]))

(def AnnotationsGraph
  {:db/ident   :vaem/AnnotationsGraph,
   :rdf/type   :vaem/GraphRole,
   :rdfs/label "Annotations Graph"})

(def Aspect
  {:db/ident :vaem/Aspect,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Aspect is used to distinguish among sets of features of a domain or subject area. The term is borrowed from \"aspect-oriented\" programming, where it is used to separate concerns. An ontology may be characterized by this dimension so as to parition features that are orthogonal. For example,  in a systems ontology there may be aspects for \"structure\", \"function\", \"behavior\" and \"interface\" or \"interoperability\". A viewpoint can be distinguished by \"aspects\". For example the \"information viewpoint\" of an application can be partitioned into separate graphs for the \"security\", \"operational\" and\"data retention\" aspects.",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "Aspect Dimension",
   :rdfs/subClassOf :vaem/Dimension})

(def Attribution
  {:db/ident :vaem/Attribution,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A mininal treatment of attribution. This serves as a placeholder class for voag:Attribution.",
   :rdfs/label "Attribution",
   :rdfs/subClassOf #{:owl/Thing
                      {:owl/cardinality 1,
                       :owl/onProperty  :vaem/description,
                       :rdf/type        :owl/Restriction}}})

(def BridgeGraph
  {:db/ident   :vaem/BridgeGraph,
   :rdf/type   :vaem/GraphRole,
   :rdfs/label "Bridge graph"})

(def CatalogEntry
  {:db/ident :vaem/CatalogEntry,
   :rdf/type :owl/Class,
   :rdfs/comment
   #{"VAEM Governed Object class is a placeholder for concepts that are fully defined by the voag:GovernedObject concept hierarchy for building a catalog of ontologies and graphs"
     "VAEM Governed Object class is a placeholder for concepts that are fully defined by the voag:GovernedObject concept hierarchy for building a catalog of ontologies and graphs."},
   :rdfs/label "Governed object",
   :rdfs/subClassOf {:owl/minCardinality 1,
                     :owl/onProperty     :vaem/description,
                     :rdf/type           :owl/Restriction}})

(def CollectionGraph
  {:db/ident :vaem/CollectionGraph,
   :rdf/type :vaem/GraphRole,
   :rdfs/comment
   "A \"vaem:CollectionGraph\" is a graph that aggregates other graphs using \"owl:imports\" statements",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "Collection graph",
   :vaem/filePrefix "COLLECTION"})

(def ConstraintsGraph
  {:db/ident :vaem/ConstraintsGraph,
   :rdf/type :vaem/GraphRole,
   :rdfs/comment
   "A \"vaem:ConstraintsGraph\" is a graph that holds SPIN constraints",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "Constraints graph",
   :vaem/filePrefix "CONSTRAINTS"})

(def ControllersGraph
  {:db/ident         :vaem/ControllersGraph,
   :rdf/type         :vaem/GraphRole,
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label       "Controllers graph",
   :vaem/filePrefix  "CONTROLLERS"})

(def CurationGraph
  {:db/ident :vaem/CurationGraph,
   :rdf/type :vaem/GraphRole,
   :rdfs/comment
   #{"A curation graph is one whose purpose is to hold metadata that is needed to describe, govern and provision another graph. A curation graph will likely use VOAG and VAEM for this purpose. The property 'vaem:curationGraph' is used to link to the graph (or graphs) being curated."
     "A \"vaem:CurationGraph\" is a graph to hold metadata that is needed to describe, govern and provision another graph. A curation graph will likely use VOAG and VAEM for this purpose. The property \"vaem:curationGraph\" is used to link to the graph (or graphs) being curated"},
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "Curation graph",
   :vaem/filePrefix "CURATION"})

(def DataGraph
  {:db/ident         :vaem/DataGraph,
   :rdf/type         :vaem/GraphRole,
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label       "Data graph",
   :vaem/filePrefix  "DATA"})

(def Dimension
  {:db/ident :vaem/Dimension,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A dimension identifies a separation of concens that serves as a way to categorize an ontology graph. In VAEM,  the notion of \"Dimension\" is partitioned into \"Aspect\", \"Discipline\", \"Domain\" and \"Viewpoint\".",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "Domain",
   :rdfs/subClassOf :owl/Thing})

(def Discipline
  {:db/ident :vaem/Discipline,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A discipline is a specific area of work or study. Examples of disciplines in the engineering domain are electrical engineering, mechanical engineering and, in the financial domain, risk assessment, investment analysis.  In VAEM, discipline is used as a dimension for characterizing an ontology graph",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "Discipline Dimension",
   :rdfs/subClassOf :vaem/Dimension})

(def DocumentationGraph
  {:db/ident         :vaem/DocumentationGraph,
   :rdf/type         :vaem/GraphRole,
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label       "Documentation graph",
   :vaem/filePrefix  "DOC"})

(def Domain
  {:db/ident :vaem/Domain,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A domain is a subject area of interest. Examples of domains are \"enterprise\", \"process\", \"organization\" and \"system\". In VAEM, \"Domain\" is used as a dimension for characterizing an ontology graph",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "Domain Dimension",
   :rdfs/subClassOf :vaem/Dimension})

(def FunctionsGraph
  {:db/ident         :vaem/FunctionsGraph,
   :rdf/type         :vaem/GraphRole,
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label       "Functions graph",
   :vaem/filePrefix  "FUNCTIONS"})

(def GMD_VAEM
  {:db/ident :vaem/GMD_VAEM,
   :dcterms/abstract
   "VAEM stands for \"Vocabulary for Attaching Essential Metadata\". What VAEM regards as essential metadata is data about dates and times, confidentiality, and other characterisitic qualifiers of the ontology, but also references to where a ontology is documented and where to find ontology registration for governance, attribution and provenance. VAEM makes use of some properties from the DC terms vocabulary using the namespace prefix \"dct\". VAEM is OWL-DL compliant.",
   :dcterms/created #inst "2011-04-20T00:00:00.000-00:00",
   :dcterms/modified #inst "2014-07-26T00:00:00.000-00:00",
   :dcterms/title "VAEM Version 2.0 Metadata",
   :rdf/type :vaem/GraphMetaData,
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "VAEM Schema Version 2.0 Metadata",
   :vaem/description
   "VAEM stands for \"Vocabulary for Attaching Essential Metadata\". What VAEM regards as essential metadata is data about dates and times, confidentiality, and other characterisitic qualifiers of the ontology, but also references to where a ontology is documented and where to find ontology registration for governance, attribution and provenance. VAEM makes use of some properties from the DC terms vocabulary using the namespace prefix \"dct\". VAEM is OWL-DL compliant.",
   :vaem/hasGraphRole :vaem/SchemaGraph,
   :vaem/hasOwner :vaem/TopQuadrant,
   :vaem/hasSteward :vaem/TopQuadrant,
   :vaem/intent
   "The purpose of VAEM is to provide, by import, a foundation for commonly needed resources for metadata on an ontology.",
   :vaem/latestPublishedVersion
   {:xsd/anyURI "http://www.linkedmodel.org/doc/2014/SCHEMA_vaem-v2.0"},
   :vaem/logo
   {:xsd/anyURI
    "http://linkedmodel.org/lib/lm/images/logos/TopBraid-RDM-Graph-Logo.png"},
   :vaem/name "VAEM",
   :vaem/namespace {:xsd/anyURI "http://www.linkedmodel.org/schema/vaem#"},
   :vaem/namespacePrefix "vaem",
   :vaem/owner "TopQuadrant, Inc.",
   :vaem/previousPublishedVersion {:xsd/anyURI
                                   "http://linkedmodel.org/doc/vaem/1.2/"},
   :vaem/rdfxmlFileURL
   {:xsd/anyURI "http://www.linkedmodel.org/2.0/schema/SCHEMA_vaem-v2.0.rdf"},
   :vaem/revision "2.0",
   :vaem/title
   "Vocabulary for Attaching Essential Metadata (VAEM) - Version 2.0",
   :vaem/turtleFileURL
   {:xsd/anyURI "http://www.linkedmodel.org/2.0/schema/SCHEMA_vaem-v2.0.ttl"},
   :vaem/usesNonImportedResource #{:dcterms/modified :dcterms/creator
                                   :dcterms/abstract :dcterms/created
                                   :dcterms/title :voag/CC-SHAREALIKE_3PT0-US}})

(def GraphMetaData
  {:db/ident :vaem/GraphMetaData,
   :rdf/type :owl/Class,
   :rdfs/comment
   "\"vaem:GraphMetaData\" defines basic metadata for the registration and publishing of a graph.  For specificaiton of governance the vocabulary \"VOAG\" may be used.",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "Graph Metadata",
   :rdfs/seeAlso {:xsd/anyURI "http://voag.linkedmodel.org/vocab/voag"},
   :rdfs/subClassOf #{{:owl/allValuesFrom :vaem/Discipline,
                       :owl/onProperty    :vaem/hasDiscipline,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/turtleFileURL,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/revision,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/rdfxmlFileURL,
                       :rdf/type           :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :vaem/name,
                       :rdf/type        :owl/Restriction} :owl/Thing
                      {:owl/allValuesFrom :vaem/Aspect,
                       :owl/onProperty    :vaem/hasAspect,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/owner,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :vaem/Party,
                       :owl/onProperty    :vaem/hasSteward,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :vaem/GraphRole,
                       :owl/onProperty    :vaem/hasGraphRole,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/hasSteward,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :xsd/string,
                       :owl/onProperty    :vaem/description,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :vaem/Party,
                       :owl/onProperty    :vaem/hasOwner,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/namespace,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :vaem/Domain,
                       :owl/onProperty    :vaem/hasDomain,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/latestPublishedVersion,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/specificity,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/namespacePrefix,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/hasMetadata,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :vaem/Viewpoint,
                       :owl/onProperty    :vaem/hasViewpoint,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/intent,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :vaem/GraphMetaData,
                       :owl/onProperty    :vaem/hasMetadata,
                       :rdf/type          :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/previousPublishedVersion,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/hasIdentifier,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/hasLicenseType,
                       :rdf/type           :owl/Restriction}}})

(def GraphRole
  {:db/ident :vaem/GraphRole,
   :owl/oneOf [:vaem/AnnotationsGraph
               :vaem/BridgeGraph
               :vaem/CollectionGraph
               :vaem/CurationGraph
               :vaem/DataGraph
               :vaem/FunctionsGraph
               :vaem/MappingGraph
               :vaem/ProxyGraph
               :vaem/RulesGraph
               :vaem/SchemaGraph
               :vaem/ScriptGraph
               :vaem/ViewGraph
               :vaem/VocabularyGraph],
   :rdf/type :owl/Class,
   :rdfs/comment
   #{"GraphRole is used to characterize how a graph of resources participates in an ontology set.  For example, a graph can be a schema, vocabulary, dataset, script, or ruleset."
     "GraphRole is used to characterize how a graph of resources participates in an ontology set.  For example, a graph can be a schema, vocabulary, dataset, script, or ruleset"},
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "Graph role",
   :rdfs/subClassOf #{{:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/filePrefix,
                       :rdf/type           :owl/Restriction} :owl/Thing
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/description,
                       :rdf/type           :owl/Restriction}}})

(def LicenseModel
  {:db/ident :vaem/LicenseModel,
   :rdf/type :owl/Class,
   :rdfs/comment
   "The VAEM Licence Model class is a placeholder for concepts that are fully defined by VOAG.",
   :rdfs/label "License model",
   :rdfs/subClassOf #{{:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/url,
                       :rdf/type           :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :vaem/description,
                       :rdf/type           :owl/Restriction}}})

(def LinkSetGraph
  {:db/ident :vaem/LinkSetGraph,
   :rdf/type :vaem/GraphRole,
   :rdfs/comment
   "A \"vaem:LinkSetGraph\" is a graph that holds statements that specify links between resources",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "Link Set graph",
   :vaem/filePrefix "LINKSET"})

(def MappingGraph
  {:db/ident :vaem/MappingGraph,
   :rdf/type :vaem/GraphRole,
   :rdfs/comment
   "A graph that specifies a transformation of a graph into another graph or graphs. Invariably this is a SPINMap graph using SPARQL Rules (SPIN) to express the transforms.",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "Mapping graph",
   :vaem/description
   "A graph that specifies a transformation of a graph into another graph or graphs. Invariably this is a SPINMap graph using SPARQL Rules (SPIN) to express the transforms.",
   :vaem/filePrefix "MAPPINGS"})

(def Party
  {:db/ident :vaem/Party,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A \"Party\" is a generalization for an actor that may be realized as a person, organizaiton or named role.",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "Party",
   :rdfs/subClassOf #{{:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/id,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/url,
                       :rdf/type           :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :vaem/name,
                       :rdf/type        :owl/Restriction} :owl/Thing}})

(def ProxyGraph
  {:db/ident         :vaem/ProxyGraph,
   :rdf/type         :vaem/GraphRole,
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label       "Proxy graph",
   :vaem/filePrefix  "PROXY"})

(def RulesGraph
  {:db/ident         :vaem/RulesGraph,
   :rdf/type         :vaem/GraphRole,
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label       "Rules Graph",
   :vaem/filePrefix  "RULES"})

(def SchemaGraph
  {:db/ident         :vaem/SchemaGraph,
   :rdf/type         :vaem/GraphRole,
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label       "Schema graph",
   :vaem/filePrefix  "SCHEMA"})

(def ScriptGraph
  {:db/ident         :vaem/ScriptGraph,
   :rdf/type         :vaem/GraphRole,
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label       "Script graph",
   :vaem/filePrefix  "SCRIPT"})

(def TopQuadrant
  {:db/ident         :vaem/TopQuadrant,
   :rdf/type         :vaem/Party,
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label       "TopQuadrant",
   :vaem/name        "TopQuadrant, Inc.",
   :vaem/url         {:xsd/anyURI "http:/www.topquadrant.com"}})

(def TransformsGraph
  {:db/ident         :vaem/TransformsGraph,
   :rdf/type         :vaem/GraphRole,
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label       "Transforms graph",
   :vaem/filePrefix  "TRANSFORMS"})

(def ViewGraph
  {:db/ident         :vaem/ViewGraph,
   :rdf/type         :vaem/GraphRole,
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label       "View graph",
   :vaem/filePrefix  "VIEWS"})

(def Viewpoint
  {:db/ident :vaem/Viewpoint,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Viewpoint is used to denote how a set of resources, or an individual resource, is relevant to a context of use. The term \"viewpoint\" is adopted from the ISO RM-ODP specifications and its more recent use in enterprise architecture descriptions. The RM-ODP introducesd the concept of viewpoint to describe a system from a particular set of concerns. RM-ODP defines five viewpoints. Together they provide a complete description of a system: enterprise viewpoint, information viewpoint, computational viewpoint, engineering viewpoint, and technology viewpoint.  In VAEM, \"Viewpoint\" is used as a dimension for characterizing an ontology graph.  The viewpoints of an ontology may not always correpsond directly to those of a system but the idea of describing a subject area of interest from distinct viewpoints is still relevant. A viewpoint can be further distinguished by \"aspects\". For example the \"information viewpoint\" of an application can be partitioned into separate graphs for the \"security\", \"operational\" and\"data retention\" aspects.",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "ViewpointDimension",
   :rdfs/subClassOf :vaem/Dimension})

(def VocabularyGraph
  {:db/ident         :vaem/VocabularyGraph,
   :rdf/type         :vaem/GraphRole,
   :rdfs/comment     "An RDF/OWL Graph that is a controlled set of instances.",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label       "Vocabulary graph",
   :vaem/description "An RDF/OWL Graph that is a controlled set of instances.",
   :vaem/filePrefix  "VOCAB"})

(def abbreviation
  {:db/ident :vaem/abbreviation,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The property \"vaem:abbreviation\" provides a common way to define a commonly used abbreviation on a resource",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "abbreviation"})

(def acronym
  {:db/ident :vaem/acronym,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The property \"vaem:acronym\" provides a common way to define a commonly used abbreviation on a resource",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "acronym"})

(def comment
  {:db/ident :vaem/comment,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #{"An annotation property that can be freely used on any kind of resource. The range of the property is 'xsd:string'."
     "An annotation property that can be freely used on any kind of resource. The range of the property is \"xsd:string\""},
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "definition",
   :rdfs/range :xsd/string})

(def date
  {:db/ident :vaem/date,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"The property \"vaem:date\" is intended for general use as the name implies.  The range of the property is set as \"vaem:dateUnion\" so as to allow a value to have a number of forms from a  year only to a full timestamp. The property is also the parent of all dates so that queries can be made for any date on an ontology"
     "The property 'vaem:date' is intended for general use as the name implies.  The range of the property is set as 'vaem:dateUnion' so as to allow a value to have a number of forms from a  year only to a full timestamp. The property is also the parent of all dates so that queries can be made for any date on an ontology."},
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "date",
   :rdfs/range :vaem/dateUnion})

(def dateCreated
  {:db/ident :vaem/dateCreated,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"The property 'vaem:dateCreated' is intended for general use as the name implies.  The range of the property is set as 'vaem:dateUnion' so as to allow a value to have a number of forms from a  year only to a full timestamp."
     "The property \"vaem:dateCreated\" is intended for general use as the name implies.  The range of the property is set as \"vaem:dateUnion\" so as to allow a value to have a number of forms from a  year only to a full timestamp"},
   :rdfs/label "date created",
   :rdfs/range :vaem/dateUnion,
   :rdfs/subPropertyOf :vaem/date})

(def dateUnion
  {:db/ident :vaem/dateUnion,
   :owl/equivalentClass {:owl/unionOf [:xsd/date :xsd/dateTime :xsd/gYear],
                         :rdf/type    :rdfs/Datatype},
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "A datatype that is the union of date xsd data types. 'dateUnion' is equivalent to the xsd specification that uses an xsd:union of memberTypes='xsd:date xsd:dateTime xsd:float xsd:gYear'.",
   :rdfs/label "date union",
   :rdfs/subClassOf :rdfs/Resource})

(def description
  {:db/ident :vaem/description,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The property 'vaem:description' is intended for general use as the name implies.  Unlike 'rdfs:comment',  'vaem:description' is an 'owl:DatatypeProperty'. As such it can play a stronger role in the model, for example, as a predicate in an axiom.",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "description",
   :rdfs/range :xsd/string})

(def filePrefix
  {:db/ident :vaem/filePrefix,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The property \"vaem:filePrefix\" is for specifying a preferred file prefix for a graph. For example a schema graph may be given the file prefix \"SCHEMA\" followed by an underscore \"_\".",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "file prefix",
   :rdfs/range :xsd/string})

(def hasAspect
  {:db/ident :vaem/hasAspect,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The property \"vaem:hasAspect\" is used to distinguish among sets of features of a domain or subject area. The term is borrowed from \"aspect-oriented\" programming, where it is used to separate concerns. An ontology may be characterized by this dimension so as to parition features that are orthogonal. For example,  in a systems ontology we can distinguish aspects for \"structure\", \"function\", \"behavior\" and \"interface\".  The property is an \"rdf:Property\" to allow both scalar and object values",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "has aspect",
   :rdfs/subPropertyOf :vaem/hasDimension})

(def hasCatalogEntry
  {:db/ident   :vaem/hasCatalogEntry,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label "has catalog entry"})

(def hasDimension
  {:db/ident :vaem/hasDimension,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The property \"vaem:hasDimension\" is used categorize an ontology.  In VAEM, the property is used to characterize an ontology graph.",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "has dimension"})

(def hasDiscipline
  {:db/ident :vaem/hasDiscipline,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The property \"vaem:hasDiscipline\" is used to indicate relevance of a set of resources, or a resource itself, to a specific discipline of work or study. Examples of disciplines in the engineering domain are electrical engineering, mechanical engineering and, in the financial domain, risk assessment, investment analysis.  In VAEM, the property is used as a dimension for characterizing an ontology graph.  The property is an \"rdf:Property\" to allow both scalar and object values",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "has discipline",
   :rdfs/subPropertyOf :vaem/hasDimension})

(def hasDomain
  {:db/ident :vaem/hasDomain,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The property \"vaem:hasDomain\" is used to specify how  a set of resources, or an individual resource is grounded in a domain, that is, a subject area of interest. Examples of domains are \"enterprise\", \"process\", \"organization\" and \"system\". In VAEM, the property is used as a dimension for characterizing an ontology graph. The property is an \"rdf:Property\" to allow both scalar and object values",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "has domain",
   :rdfs/subPropertyOf :vaem/hasDimension})

(def hasGraphMetadata
  {:db/ident         :vaem/hasGraphMetadata,
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/range       :vaem/GraphMetaData})

(def hasGraphRole
  {:db/ident :vaem/hasGraphRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"The property 'lms:hasGraphRole' is used to characterize how a resource participates in an ontology set.  The property is used to specify the role that a graph plays, for example, an ontology graph can be a schema, vocabulary, dataset, script, or ruleset."
     "The property \"lms:hasGraphRole\" is used to characterize how a resource participates in an ontology set.  The property is used to specify the role that a graph plays, for example, an ontology graph can be a schema, vocabulary, dataset, script, or ruleset"},
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "has graph role",
   :rdfs/range :vaem/GraphRole})

(def hasIdentifier
  {:db/ident :vaem/hasIdentifier,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The property \"vaemhasIdentifier\" is intended for general use as a means to specifiy a unique reference to something. This is an object property that is a sub-property of \"vame:id\"",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "has identifier"})

(def hasLicenseType
  {:db/ident :vaem/hasLicenseType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The property \"vaem:hasLicenseType\" points to an entry in the VOAG ontology for licenses",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label #{{:rdf/language "en-US",
                  :rdf/value    "has license type"}
                 {:rdf/language "en-us",
                  :rdf/value    "has license type"}}})

(def hasMetadata
  {:db/ident :vaem/hasMetadata,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The property \"hasMetadata\" is used to reference a metadata information structure.",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "has metadata"})

(def hasOwner
  {:db/ident         :vaem/hasOwner,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label       "has owner"})

(def hasSteward
  {:db/ident :vaem/hasSteward,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A property that is used to refer to a \"Steward\", that is, the party or role that is responsible for maintaining an asset, in the case of VAEM, an ontology graph.",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "has steward"})

(def hasViewpoint
  {:db/ident :vaem/hasViewpoint,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The property \"vaem:hasViewpoint\" is used to denote how a set of resources, or an individual resource, is relevant to a context of use. The term \"viewpoint\" is adopted from the ISO RM-ODP specifications and its more recent use in enterprise architecture descriptions.  In VAEM, the property is used as a dimension for characterizing an ontology graph.  The property is an \"rdf:Property\" to allow both scalar and object values",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "has viewpoint",
   :rdfs/subPropertyOf :vaem/hasDimension})

(def id
  {:db/ident :vaem/id,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The property \"vaem:id\" is intended for general use as a means to specifiy an identifier. The type of this property is intentionally set to \"rdf:Property\" so that use of the property can allow both object and scaler values.  For this reason, the property is rangeless",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "id"})

(def idString
  {:db/ident :vaem/idString,
   :rdfs/comment
   "The property \"vaem:idString\" is intended for general use as a means to specifiy a unique reference to something. This is a data property with a string range and is a sub-property of \"vame:id\""})

(def intent
  {:db/ident :vaem/intent,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The property \"vaem:intent\" is used to outline  a statement of purpose. This typically expresses one or more desired outcomes",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "intent",
   :rdfs/range :xsd/string})

(def isElaboratedIn
  {:db/ident :vaem/isElaboratedIn,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "An annotation used to reference a graph that elaborates (adds properties and axioms to) a resource",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "isDefinedBy",
   :rdfs/range :xsd/anyURI,
   :rdfs/subPropertyOf :rdfs/isDefinedBy})

(def isRefinedBy
  {:db/ident :vaem/isRefinedBy,
   :rdf/type #{:rdf/Property :owl/AnnotationProperty},
   :rdfs/comment
   "A refinement of the subject resource. Modelled after rdfs:isDefinedBy for the purpose of referring to layered graphs that further define a subject.",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"},
   :rdfs/label "isRefinedBy",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :rdfs/isDefinedBy})

(def lastUpdated
  {:db/ident :vaem/lastUpdated,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"The property 'vaem:lastUpdated' is intended for general use as the name implies.  The range of the property is set as 'vaem:dateUnion' so as to allow a value to have a number of forms from a  year only to a full timestamp."
     "The property \"vaem:lastUpdated\" is intended for general use as the name implies.  The range of the property is set as \"vaem:dateUnion\" so as to allow a value to have a number of forms from a  year only to a full timestamp"},
   :rdfs/label "last updated",
   :rdfs/range :vaem/dateUnion,
   :rdfs/subPropertyOf :vaem/date})

(def latestPublishedVersion
  {:db/ident :vaem/latestPublishedVersion,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The property \"vaem:latestPublishedVersion\"is a URL to documentation for the latest version of a graph.",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "latest published version",
   :rdfs/range :xsd/anyURI})

(def logo
  {:db/ident :vaem/logo,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "The property \"vaem:logo\" is a reference to an image that is used for publishing the ontology\"",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/range :xsd/anyURI})

(def name
  {:db/ident :vaem/name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"The property 'vaem:name' is intended for general use. In many cases 'rdfs:label' could be used give names to resources. In the case where compliance with a specific naming rule is needed,  'vaem:name' allows  a resource to carry a name that is used in more specific contexts. Making 'vaem:name' a sub-property of 'rdfs:label' allows 'vaem:name' to serve in the same way as an 'rdfs:label'."
     "The property \"vaem:name\" is intended for general use. In many cases \"rdfs:label\" could be used give names to resources. In the case where compliance with a specific naming rule is needed,  \"vaem:name\" allows  a resource to carry a name that is used in more specific contexts."},
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "name",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :rdfs/label})

(def namespace
  {:db/ident :vaem/namespace,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"The property \"vaem:namespace\" is the onotlogy URI with which a graph is primarily associated. The intent is to allow multiple graphs to define statements for resources in the same Ontology namespace. For example, a foundation level graph with the base URI of \"http://www.somesite.com/1.0/schema/OurOntology\"  may define general  concepts for \"OurOntology\". Another graph with the base URI \"http://www.somesite.com/1.0/schema/level2/OurOntology\"  may add more specific details to the same \"OurOntology\". Each of these two graphs would carry the same value for \"vaem:namespace\", that is, \"http://www.somesite.com/schema/OurOntology\".    In other words, an ontology URI is the URI associated with the resources of a controlled namespace. On the other hand the graph URIs (the base URIs) identify the graphs that hold resources that make up an ontology"
     "The property 'vaem:namespace' provides a means to specify the onotlogy URI with which a graph is primarily associated. The intent is to allow multiple graphs to define statements for resources in the same Ontology namespace. For example, a foundation level graph with the base URI of 'http://www.somesite.com/1.0/schema/OurOntology'  may define general  concepts for 'OurOntology'. Another graph with the base URI 'http://www.somesite.com/1.0/schema/level2/OurOntology'  may add more specific details to the same 'OurOntology'. Each of these two graphs would carry the same value for 'vaem:namespace', that is, 'http://www.somesite.com/schema/OurOntology'.    In other words, an ontology URI is the URI associated with the resources of a controlled namespace. On the other hand the graph URIs (the base URIs) identify the graphs that hold resources that make up an ontology."},
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "namespace",
   :rdfs/range :xsd/anyURI})

(def namespacePrefix
  {:db/ident :vaem/namespacePrefix,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"The property 'vaem:namespacePrefix' specifes a short handle or label for the URI of an Ontology.  Multiple graphs can define statements for resources in the same Ontololgy namespace. For example, a foundation level graph with the base URI of 'http://www.somesite.com/1.0/schema/OurOntology'  may define general  concepts for 'OurOntology'. Another graph with the base URI 'http://www.somesite.com/1.0/schema/level2/OurOntology'  may add more specific details to the same 'OurOntology'. Each of these two graphs would carry the same value for 'vaem:namespacePrefix', for this example, perhaps, 'ourOntology'."
     "The property \"vaem:namespacePrefix\" specifes a short handle or label for the URI of an Ontology.  Multiple graphs can define statements for resources in the same Ontololgy namespace. For example, a foundation level graph with the base URI of \"http://www.somesite.com/1.0/schema/OurOntology\"  may define general  concepts for \"OurOntology\". Another graph with the base URI \"http://www.somesite.com/1.0/schema/level2/OurOntology\"  may add more specific details to the same \"OurOntology\". Each of these two graphs would carry the same value for \"vaem:namespacePrefix\", for this example, perhaps, \"ourOntology\""},
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "namespace prefix",
   :rdfs/range :xsd/string})

(def numericUnion
  {:db/ident :vaem/numericUnion,
   :owl/equivalentClass
   {:owl/unionOf [:xsd/float :xsd/decimal :xsd/integer :xsd/double],
    :rdf/type    :rdfs/Datatype},
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "A datatype that is the union of numeric xsd data types. 'numericUnion' is equivalent to the xsd specification that uses an xsd:union of memberTypes='xsd:decimal xsd:double xsd:float xsd:integer'.",
   :rdfs/label "numeric union",
   :rdfs/subClassOf :rdfs/Resource})

(def ownedBy
  {:db/ident :vaem/ownedBy,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #{"The property 'vaem:ownedBy' is a general property that in some cases could have scalar values or may refer to some concept of 'Party'.  For this reason, the  type of this property is set as 'rdf:Property' and the property is rangeless. There are two sub-properties of 'vaem:ownedBy', namely 'vaem:owner' for string values and 'vaem:owningParty' for referencing a 'party'.  Ownership applies to thos ontologies that are proprietary. Other governance and provenance specifications are held in the VOAG ontology."
     "The property \"vaem:ownedBy\" is a general property that in some cases could have scalar values or may refer to some concept of \"Party\".  For this reason, the  type of this property is set as \"rdf:Property\" and the property is rangeless. There are two sub-properties of \"vaem:ownedBy\", namely \"vaem:owner\" for string values and \"vaem:owningParty\" for referencing a party.  Ownership applies to those ontologies that are proprietary"},
   :rdfs/label "owned by"})

(def owner
  {:db/ident           :vaem/owner,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                         {:xsd/anyURI
                          "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label         "owner",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :vaem/ownedBy})

(def owningParty
  {:db/ident :vaem/owningParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"The property \"vaem:owningParty\" is used to refer to some concept of \"Party\" and is a sub-property of \"vaem:ownedBy\""
     "The property 'vaem:owningParty' is used to refer to some concept of 'Party' and is a sub-property of 'vaem:ownedBy'."},
   :rdfs/label "owning party",
   :rdfs/subPropertyOf :vaem/ownedBy})

(def previousPublishedVersion
  {:db/ident :vaem/previousPublishedVersion,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The property \"vaem:previousPublishedVersion\"is a URL to documentation for the previous version of a graph.",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "previous published version",
   :rdfs/range :xsd/anyURI})

(def rationale
  {:db/ident :vaem/rationale,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A description of a justification for some other assertion or value",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "rationale",
   :rdfs/range :xsd/string})

(def rdfxmlFileURL
  {:db/ident :vaem/rdfxmlFileURL,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The property \"vaem:rdfxmlFileURL\" is used to provide a link to the location of the ontology's RDF/XML file",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "RDF/XML file URL",
   :rdfs/range :xsd/anyURI})

(def reifiableBy
  {:db/ident :vaem/reifiableBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"To express how statements in a model can be reifiable, this property is used to explicitly associate a property with a user-defined sub-class of 'rdf:Statement'. A recommended way of using this is to declare the properties that share the same reification constructs as sub-properties of a parent property that carries the 'vaem:reifiableBy' property. The parent property should be of type 'rdf:Property' so that it can have both datatype and object properties as sub-properties. By this means use and transformations of a model can be understood through a fully specified metamodel. 'vaem:reifiableBy' is rangeless in order to comply with OWL DL semantics. Its range would have been rdfs:Class in order to refer to 'rdf:Statement' sub-classes."
     "To express how statements in a model can be reifiable, this property is used to explicitly associate a property with a user-defined sub-class of \"rdf:Statement\". A recommended way of using this is to declare the properties that share the same reification constructs as sub-properties of a parent property that carries the \"vaem:reifiableBy\" property. The parent property should be of type \"rdf:Property\" so that it can have both datatype and object properties as sub-properties. By this means use and transformations of a model can be understood through a fully specified metamodel. \"vaem:reifiableBy\" is rangeless in order to comply with OWL DL semantics. Its range would have been rdfs:Class in order to refer to \"rdf:Statement\" sub-classes"},
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "reifiable by"})

(def releaseDate
  {:db/ident :vaem/releaseDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"The property 'vaem:releaseDate' is intended for general use as the name implies.  The range of the property is set as 'vaem:dateUnion' so as to allow a value to have a number of forms from a  year only to a full timestamp."
     "The property \"vaem:releaseDate\" is intended for general use as the name implies.  The range of the property is set as \"vaem:dateUnion\" so as to allow a value to have a number of forms from a  year only to a full timestamp"},
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "release date",
   :rdfs/range :vaem/dateUnion,
   :rdfs/subPropertyOf :vaem/date})

(def revision
  {:db/ident :vaem/revision,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"The property \"vaem:revision\" is a property intended for general use as the name implies."
     "The property 'vaem:revision' is a property intended for general use as the name implies. "},
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "revision",
   :rdfs/range :xsd/string})

(def specificity
  {:db/ident :vaem/specificity,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The property \"vaem:specificity\" is intended to specify the level of detail of an ontology.  The values that can be set for this property are restriced to an integer from 1 to 5. An ontology at level 1 has concepts of more general applicability than one at level 5. By having graphs at different levels of specificity it is possible to support greater modularity for selective imports",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "specificity",
   :rdfs/range :xsd/nonNegativeInteger})

(def title
  {:db/ident         :vaem/title,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label       "title",
   :rdfs/range       :xsd/string})

(def todo
  {:db/ident :vaem/todo,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #{"As it name implies, a way to attach an annotation about a 'todo' task"
     "As it name implies, a way to attach an annotation about a \"todo\" task"},
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "todo",
   :rdfs/range :xsd/string})

(def turtleFileURL
  {:db/ident :vaem/turtleFileURL,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The property \"vaem:turtleFileURL\" is used to provide a link to the location of the ontology's turtle file",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "turtle file URL",
   :rdfs/range :xsd/anyURI})

(def url
  {:db/ident :vaem/url,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{"The property 'vaem:url' is intended for general use as the name implies.  The range of the property is set as an XSD URI."
     "The property \"vaem:url\" is intended for general use as the name implies.  The range of the property is set as an XSD URI"},
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "url",
   :rdfs/range :xsd/anyURI})

(def usesNonImportedResource
  {:db/ident :vaem/usesNonImportedResource,
   :rdf/type #{:owl/ObjectProperty :owl/AnnotationProperty},
   :rdfs/comment
   #{"A property that is used to express dependencies on resources from graphs that are not imported."
     "The property \"vaem:usesNonImportedResource\" is used to express dependencies on resources from graphs that are not imported"},
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "uses non-imported resource",
   :rdfs/range :rdfs/Resource})

(def withAttributionTo
  {:db/ident :vaem/withAttributionTo,
   :rdf/type #{:owl/ObjectProperty :owl/AnnotationProperty},
   :rdfs/comment
   "The property \"vaem:withAttributionTo\" is an annotation property that is either used to hold either a string or a reference to an instance of \"voag:Attribution\", from the VOAG ontology",
   :rdfs/isDefinedBy #{{:xsd/anyURI "http://www.linkedmodel.org/schema/vaem"}
                       {:xsd/anyURI
                        "http://www.linkedmodel.org/2.0/schema/vaem"}},
   :rdfs/label "with attribution to"})

(def urn:uuid:e5547431-92a0-5cba-8395-a6c5cde9da77
  {:rdf/type :owl/Ontology,
   :rdfs/comment
   "VAEM stands for \"Vocabulary for Attaching Essential Metadata\". The purpose of VAEM is to provide, by import, a foundation for commonly needed resources when building an ontology. An effort has been made to restrict these resources to a minimal level.   What VAEM regards as 'essential metadata' is data about dates and times, confidentiality, and other characterisitic qualifiers of the ontology, but also references to where a ontology is documented and where to find ontology Governance, Attribution and Provenance. VAEM also defines classes for representing enumerations and enumerated values.",
   :xsd/anyURI "http://www.linkedmodel.org/schema/vaem#"})

(def urn:uuid:625e733a-0645-5147-b43d-8d7170aef265
  {:vaem/hasGraphMetadata :vaem/GMD_VAEM,
   :xsd/anyURI "http://www.linkedmodel.org/2.0/schema/vaem"})