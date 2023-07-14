(ns net.wikipunk.rdf.vaem
  "VAEM stands for \"Vocabulary for Attaching Essential Metadata\". The purpose of VAEM is to provide, by import, a foundation for commonly needed resources when building an ontology. An effort has been made to restrict these resources to a minimal level.   What VAEM regards as 'essential metadata' is data about dates and times, confidentiality, and other characterisitic qualifiers of the ontology, but also references to where a ontology is documented and where to find ontology Governance, Attribution and Provenance. VAEM also defines classes for representing enumerations and enumerated values."
  {:dcat/downloadURL "resources/vaem_2014-08-11.n3",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
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
   #xsd/string
    "VAEM stands for \"Vocabulary for Attaching Essential Metadata\". The purpose of VAEM is to provide, by import, a foundation for commonly needed resources when building an ontology. An effort has been made to restrict these resources to a minimal level.   What VAEM regards as 'essential metadata' is data about dates and times, confidentiality, and other characterisitic qualifiers of the ontology, but also references to where a ontology is documented and where to find ontology Governance, Attribution and Provenance. VAEM also defines classes for representing enumerations and enumerated values.",
   :reasoner nil}
  (:refer-clojure :exclude [comment name namespace]))

(def AnnotationsGraph
  "Annotations Graph"
  {:db/ident   :vaem/AnnotationsGraph,
   :rdf/type   :vaem/GraphRole,
   :rdfs/label #xsd/string "Annotations Graph"})

(def Aspect
  "Aspect is used to distinguish among sets of features of a domain or subject area. The term is borrowed from \"aspect-oriented\" programming, where it is used to separate concerns. An ontology may be characterized by this dimension so as to parition features that are orthogonal. For example,  in a systems ontology there may be aspects for \"structure\", \"function\", \"behavior\" and \"interface\" or \"interoperability\". A viewpoint can be distinguished by \"aspects\". For example the \"information viewpoint\" of an application can be partitioned into separate graphs for the \"security\", \"operational\" and\"data retention\" aspects."
  {:db/ident :vaem/Aspect,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "Aspect is used to distinguish among sets of features of a domain or subject area. The term is borrowed from \"aspect-oriented\" programming, where it is used to separate concerns. An ontology may be characterized by this dimension so as to parition features that are orthogonal. For example,  in a systems ontology there may be aspects for \"structure\", \"function\", \"behavior\" and \"interface\" or \"interoperability\". A viewpoint can be distinguished by \"aspects\". For example the \"information viewpoint\" of an application can be partitioned into separate graphs for the \"security\", \"operational\" and\"data retention\" aspects.",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "Aspect Dimension",
   :rdfs/subClassOf :vaem/Dimension})

(def Attribution
  "A mininal treatment of attribution. This serves as a placeholder class for voag:Attribution."
  {:db/ident :vaem/Attribution,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "A mininal treatment of attribution. This serves as a placeholder class for voag:Attribution.",
   :rdfs/label #xsd/string "Attribution",
   :rdfs/subClassOf [{:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :vaem/description,
                      :rdf/type        :owl/Restriction}
                     :owl/Thing]})

(def BridgeGraph
  "Bridge graph"
  {:db/ident   :vaem/BridgeGraph,
   :rdf/type   :vaem/GraphRole,
   :rdfs/label #xsd/string "Bridge graph"})

(def CatalogEntry
  "Governed object"
  {:db/ident :vaem/CatalogEntry,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/string
     "VAEM Governed Object class is a placeholder for concepts that are fully defined by the voag:GovernedObject concept hierarchy for building a catalog of ontologies and graphs."
    #xsd/string
     "VAEM Governed Object class is a placeholder for concepts that are fully defined by the voag:GovernedObject concept hierarchy for building a catalog of ontologies and graphs"],
   :rdfs/label #xsd/string "Governed object",
   :rdfs/subClassOf {:owl/minCardinality #xsd/nonNegativeInteger 1,
                     :owl/onProperty     :vaem/description,
                     :rdf/type           :owl/Restriction}})

(def CollectionGraph
  "A \"vaem:CollectionGraph\" is a graph that aggregates other graphs using \"owl:imports\" statements"
  {:db/ident :vaem/CollectionGraph,
   :rdf/type :vaem/GraphRole,
   :rdfs/comment
   #xsd/string
    "A \"vaem:CollectionGraph\" is a graph that aggregates other graphs using \"owl:imports\" statements",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "Collection graph",
   :vaem/filePrefix #xsd/string "COLLECTION"})

(def ConstraintsGraph
  "A \"vaem:ConstraintsGraph\" is a graph that holds SPIN constraints"
  {:db/ident :vaem/ConstraintsGraph,
   :rdf/type :vaem/GraphRole,
   :rdfs/comment
   #xsd/string
    "A \"vaem:ConstraintsGraph\" is a graph that holds SPIN constraints",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "Constraints graph",
   :vaem/filePrefix #xsd/string "CONSTRAINTS"})

(def ControllersGraph
  "Controllers graph"
  {:db/ident         :vaem/ControllersGraph,
   :rdf/type         :vaem/GraphRole,
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label       #xsd/string "Controllers graph",
   :vaem/filePrefix  #xsd/string "CONTROLLERS"})

(def CurationGraph
  "Curation graph"
  {:db/ident :vaem/CurationGraph,
   :rdf/type :vaem/GraphRole,
   :rdfs/comment
   [#xsd/string
     "A curation graph is one whose purpose is to hold metadata that is needed to describe, govern and provision another graph. A curation graph will likely use VOAG and VAEM for this purpose. The property 'vaem:curationGraph' is used to link to the graph (or graphs) being curated."
    #xsd/string
     "A \"vaem:CurationGraph\" is a graph to hold metadata that is needed to describe, govern and provision another graph. A curation graph will likely use VOAG and VAEM for this purpose. The property \"vaem:curationGraph\" is used to link to the graph (or graphs) being curated"],
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "Curation graph",
   :vaem/filePrefix #xsd/string "CURATION"})

(def DataGraph
  "Data graph"
  {:db/ident         :vaem/DataGraph,
   :rdf/type         :vaem/GraphRole,
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label       #xsd/string "Data graph",
   :vaem/filePrefix  #xsd/string "DATA"})

(def Dimension
  "A dimension identifies a separation of concens that serves as a way to categorize an ontology graph. In VAEM,  the notion of \"Dimension\" is partitioned into \"Aspect\", \"Discipline\", \"Domain\" and \"Viewpoint\"."
  {:db/ident :vaem/Dimension,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "A dimension identifies a separation of concens that serves as a way to categorize an ontology graph. In VAEM,  the notion of \"Dimension\" is partitioned into \"Aspect\", \"Discipline\", \"Domain\" and \"Viewpoint\".",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "Domain",
   :rdfs/subClassOf :owl/Thing})

(def Discipline
  "A discipline is a specific area of work or study. Examples of disciplines in the engineering domain are electrical engineering, mechanical engineering and, in the financial domain, risk assessment, investment analysis.  In VAEM, discipline is used as a dimension for characterizing an ontology graph"
  {:db/ident :vaem/Discipline,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "A discipline is a specific area of work or study. Examples of disciplines in the engineering domain are electrical engineering, mechanical engineering and, in the financial domain, risk assessment, investment analysis.  In VAEM, discipline is used as a dimension for characterizing an ontology graph",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "Discipline Dimension",
   :rdfs/subClassOf :vaem/Dimension})

(def DocumentationGraph
  "Documentation graph"
  {:db/ident         :vaem/DocumentationGraph,
   :rdf/type         :vaem/GraphRole,
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label       #xsd/string "Documentation graph",
   :vaem/filePrefix  #xsd/string "DOC"})

(def Domain
  "A domain is a subject area of interest. Examples of domains are \"enterprise\", \"process\", \"organization\" and \"system\". In VAEM, \"Domain\" is used as a dimension for characterizing an ontology graph"
  {:db/ident :vaem/Domain,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "A domain is a subject area of interest. Examples of domains are \"enterprise\", \"process\", \"organization\" and \"system\". In VAEM, \"Domain\" is used as a dimension for characterizing an ontology graph",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "Domain Dimension",
   :rdfs/subClassOf :vaem/Dimension})

(def FunctionsGraph
  "Functions graph"
  {:db/ident         :vaem/FunctionsGraph,
   :rdf/type         :vaem/GraphRole,
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label       #xsd/string "Functions graph",
   :vaem/filePrefix  #xsd/string "FUNCTIONS"})

(def GMD_VAEM
  "VAEM stands for \"Vocabulary for Attaching Essential Metadata\". What VAEM regards as essential metadata is data about dates and times, confidentiality, and other characterisitic qualifiers of the ontology, but also references to where a ontology is documented and where to find ontology registration for governance, attribution and provenance. VAEM makes use of some properties from the DC terms vocabulary using the namespace prefix \"dct\". VAEM is OWL-DL compliant."
  {:db/ident :vaem/GMD_VAEM,
   :dcterms/abstract
   #xsd/string
    "VAEM stands for \"Vocabulary for Attaching Essential Metadata\". What VAEM regards as essential metadata is data about dates and times, confidentiality, and other characterisitic qualifiers of the ontology, but also references to where a ontology is documented and where to find ontology registration for governance, attribution and provenance. VAEM makes use of some properties from the DC terms vocabulary using the namespace prefix \"dct\". VAEM is OWL-DL compliant.",
   :dcterms/created #xsd/date #inst "2011-04-20T00:00:00.000-04:00",
   :dcterms/modified #xsd/date #inst "2014-07-26T00:00:00.000-04:00",
   :dcterms/title #xsd/string "VAEM Version 2.0 Metadata",
   :rdf/type :vaem/GraphMetaData,
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "VAEM Schema Version 2.0 Metadata",
   :vaem/description
   #xsd/string
    "VAEM stands for \"Vocabulary for Attaching Essential Metadata\". What VAEM regards as essential metadata is data about dates and times, confidentiality, and other characterisitic qualifiers of the ontology, but also references to where a ontology is documented and where to find ontology registration for governance, attribution and provenance. VAEM makes use of some properties from the DC terms vocabulary using the namespace prefix \"dct\". VAEM is OWL-DL compliant.",
   :vaem/hasGraphRole :vaem/SchemaGraph,
   :vaem/hasOwner :vaem/TopQuadrant,
   :vaem/hasSteward :vaem/TopQuadrant,
   :vaem/intent
   #xsd/string
    "The purpose of VAEM is to provide, by import, a foundation for commonly needed resources for metadata on an ontology.",
   :vaem/latestPublishedVersion
   #xsd/anyURI "http://www.linkedmodel.org/doc/2014/SCHEMA_vaem-v2.0",
   :vaem/logo
   #xsd/anyURI
    "http://linkedmodel.org/lib/lm/images/logos/TopBraid-RDM-Graph-Logo.png",
   :vaem/name #xsd/string "VAEM",
   :vaem/namespace #xsd/anyURI "http://www.linkedmodel.org/schema/vaem#",
   :vaem/namespacePrefix #xsd/string "vaem",
   :vaem/owner #xsd/string "TopQuadrant, Inc.",
   :vaem/previousPublishedVersion #xsd/anyURI
                                   "http://linkedmodel.org/doc/vaem/1.2/",
   :vaem/rdfxmlFileURL
   #xsd/anyURI "http://www.linkedmodel.org/2.0/schema/SCHEMA_vaem-v2.0.rdf",
   :vaem/revision #xsd/string "2.0",
   :vaem/title
   #xsd/string
    "Vocabulary for Attaching Essential Metadata (VAEM) - Version 2.0",
   :vaem/turtleFileURL
   #xsd/anyURI "http://www.linkedmodel.org/2.0/schema/SCHEMA_vaem-v2.0.ttl",
   :vaem/usesNonImportedResource [:dcterms/modified
                                  :dcterms/abstract
                                  :dcterms/creator
                                  :dcterms/created
                                  :voag/CC-SHAREALIKE_3PT0-US
                                  :dcterms/title],
   :vaem/withAttributionTo
   #xsd/string
    "VAEM is issued under a Creative Commons Attribution Share Alike 3.0 United States License. Attribution should be made to TopQuadrant, Inc."})

(def GraphMetaData
  "\"vaem:GraphMetaData\" defines basic metadata for the registration and publishing of a graph.  For specificaiton of governance the vocabulary \"VOAG\" may be used."
  {:db/ident :vaem/GraphMetaData,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "\"vaem:GraphMetaData\" defines basic metadata for the registration and publishing of a graph.  For specificaiton of governance the vocabulary \"VOAG\" may be used.",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}],
   :rdfs/label #xsd/string "Graph Metadata",
   :rdfs/seeAlso {:rdfa/uri "http://voag.linkedmodel.org/vocab/voag"},
   :rdfs/subClassOf [{:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :vaem/turtleFileURL,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :vaem/Aspect,
                      :owl/onProperty    :vaem/hasAspect,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :vaem/hasMetadata,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :vaem/owner,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :vaem/GraphMetaData,
                      :owl/onProperty    :vaem/hasMetadata,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :xsd/string,
                      :owl/onProperty    :vaem/description,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :vaem/hasIdentifier,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :vaem/revision,
                      :rdf/type           :owl/Restriction}
                     :owl/Thing
                     {:owl/allValuesFrom :vaem/GraphRole,
                      :owl/onProperty    :vaem/hasGraphRole,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :vaem/intent,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :vaem/specificity,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :vaem/previousPublishedVersion,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :vaem/latestPublishedVersion,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :vaem/rdfxmlFileURL,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :vaem/Party,
                      :owl/onProperty    :vaem/hasOwner,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :vaem/hasLicenseType,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :vaem/namespacePrefix,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :vaem/namespace,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :vaem/Domain,
                      :owl/onProperty    :vaem/hasDomain,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :vaem/hasSteward,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :vaem/Party,
                      :owl/onProperty    :vaem/hasSteward,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :vaem/Discipline,
                      :owl/onProperty    :vaem/hasDiscipline,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :vaem/name,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :vaem/Viewpoint,
                      :owl/onProperty    :vaem/hasViewpoint,
                      :rdf/type          :owl/Restriction}]})

(def GraphRole
  "Graph role"
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
   [#xsd/string
     "GraphRole is used to characterize how a graph of resources participates in an ontology set.  For example, a graph can be a schema, vocabulary, dataset, script, or ruleset"
    #xsd/string
     "GraphRole is used to characterize how a graph of resources participates in an ontology set.  For example, a graph can be a schema, vocabulary, dataset, script, or ruleset."],
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}],
   :rdfs/label #xsd/string "Graph role",
   :rdfs/subClassOf [{:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :vaem/description,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :vaem/filePrefix,
                      :rdf/type           :owl/Restriction}
                     :owl/Thing]})

(def LicenseModel
  "The VAEM Licence Model class is a placeholder for concepts that are fully defined by VOAG."
  {:db/ident :vaem/LicenseModel,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "The VAEM Licence Model class is a placeholder for concepts that are fully defined by VOAG.",
   :rdfs/label #xsd/string "License model",
   :rdfs/subClassOf [{:owl/minCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :vaem/description,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :vaem/url,
                      :rdf/type           :owl/Restriction}]})

(def LinkSetGraph
  "A \"vaem:LinkSetGraph\" is a graph that holds statements that specify links between resources"
  {:db/ident :vaem/LinkSetGraph,
   :rdf/type :vaem/GraphRole,
   :rdfs/comment
   #xsd/string
    "A \"vaem:LinkSetGraph\" is a graph that holds statements that specify links between resources",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "Link Set graph",
   :vaem/filePrefix #xsd/string "LINKSET"})

(def MappingGraph
  "A graph that specifies a transformation of a graph into another graph or graphs. Invariably this is a SPINMap graph using SPARQL Rules (SPIN) to express the transforms."
  {:db/ident :vaem/MappingGraph,
   :rdf/type :vaem/GraphRole,
   :rdfs/comment
   #xsd/string
    "A graph that specifies a transformation of a graph into another graph or graphs. Invariably this is a SPINMap graph using SPARQL Rules (SPIN) to express the transforms.",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "Mapping graph",
   :vaem/description
   #xsd/string
    "A graph that specifies a transformation of a graph into another graph or graphs. Invariably this is a SPINMap graph using SPARQL Rules (SPIN) to express the transforms.",
   :vaem/filePrefix #xsd/string "MAPPINGS"})

(def Party
  "A \"Party\" is a generalization for an actor that may be realized as a person, organizaiton or named role."
  {:db/ident :vaem/Party,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "A \"Party\" is a generalization for an actor that may be realized as a person, organizaiton or named role.",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "Party",
   :rdfs/subClassOf [:owl/Thing
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :vaem/name,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :vaem/id,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     :vaem/url,
                      :rdf/type           :owl/Restriction}]})

(def ProxyGraph
  "Proxy graph"
  {:db/ident         :vaem/ProxyGraph,
   :rdf/type         :vaem/GraphRole,
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label       #xsd/string "Proxy graph",
   :vaem/filePrefix  #xsd/string "PROXY"})

(def RulesGraph
  "Rules Graph"
  {:db/ident         :vaem/RulesGraph,
   :rdf/type         :vaem/GraphRole,
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label       #xsd/string "Rules Graph",
   :vaem/filePrefix  #xsd/string "RULES"})

(def SchemaGraph
  "Schema graph"
  {:db/ident         :vaem/SchemaGraph,
   :rdf/type         :vaem/GraphRole,
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label       #xsd/string "Schema graph",
   :vaem/filePrefix  #xsd/string "SCHEMA"})

(def ScriptGraph
  "Script graph"
  {:db/ident         :vaem/ScriptGraph,
   :rdf/type         :vaem/GraphRole,
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label       #xsd/string "Script graph",
   :vaem/filePrefix  #xsd/string "SCRIPT"})

(def TopQuadrant
  "TopQuadrant, Inc."
  {:db/ident         :vaem/TopQuadrant,
   :rdf/type         :vaem/Party,
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label       #xsd/string "TopQuadrant",
   :vaem/name        #xsd/string "TopQuadrant, Inc.",
   :vaem/url         #xsd/anyURI "http:/www.topquadrant.com"})

(def TransformsGraph
  "Transforms graph"
  {:db/ident         :vaem/TransformsGraph,
   :rdf/type         :vaem/GraphRole,
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label       #xsd/string "Transforms graph",
   :vaem/filePrefix  #xsd/string "TRANSFORMS"})

(def ViewGraph
  "View graph"
  {:db/ident         :vaem/ViewGraph,
   :rdf/type         :vaem/GraphRole,
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label       #xsd/string "View graph",
   :vaem/filePrefix  #xsd/string "VIEWS"})

(def Viewpoint
  "Viewpoint is used to denote how a set of resources, or an individual resource, is relevant to a context of use. The term \"viewpoint\" is adopted from the ISO RM-ODP specifications and its more recent use in enterprise architecture descriptions. The RM-ODP introducesd the concept of viewpoint to describe a system from a particular set of concerns. RM-ODP defines five viewpoints. Together they provide a complete description of a system: enterprise viewpoint, information viewpoint, computational viewpoint, engineering viewpoint, and technology viewpoint.  In VAEM, \"Viewpoint\" is used as a dimension for characterizing an ontology graph.  The viewpoints of an ontology may not always correpsond directly to those of a system but the idea of describing a subject area of interest from distinct viewpoints is still relevant. A viewpoint can be further distinguished by \"aspects\". For example the \"information viewpoint\" of an application can be partitioned into separate graphs for the \"security\", \"operational\" and\"data retention\" aspects."
  {:db/ident :vaem/Viewpoint,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "Viewpoint is used to denote how a set of resources, or an individual resource, is relevant to a context of use. The term \"viewpoint\" is adopted from the ISO RM-ODP specifications and its more recent use in enterprise architecture descriptions. The RM-ODP introducesd the concept of viewpoint to describe a system from a particular set of concerns. RM-ODP defines five viewpoints. Together they provide a complete description of a system: enterprise viewpoint, information viewpoint, computational viewpoint, engineering viewpoint, and technology viewpoint.  In VAEM, \"Viewpoint\" is used as a dimension for characterizing an ontology graph.  The viewpoints of an ontology may not always correpsond directly to those of a system but the idea of describing a subject area of interest from distinct viewpoints is still relevant. A viewpoint can be further distinguished by \"aspects\". For example the \"information viewpoint\" of an application can be partitioned into separate graphs for the \"security\", \"operational\" and\"data retention\" aspects.",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "ViewpointDimension",
   :rdfs/subClassOf :vaem/Dimension})

(def VocabularyGraph
  "An RDF/OWL Graph that is a controlled set of instances."
  {:db/ident         :vaem/VocabularyGraph,
   :rdf/type         :vaem/GraphRole,
   :rdfs/comment     #xsd/string
                      "An RDF/OWL Graph that is a controlled set of instances.",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label       #xsd/string "Vocabulary graph",
   :vaem/description #xsd/string
                      "An RDF/OWL Graph that is a controlled set of instances.",
   :vaem/filePrefix  #xsd/string "VOCAB"})

(def abbreviation
  "The property \"vaem:abbreviation\" provides a common way to define a commonly used abbreviation on a resource"
  {:db/ident :vaem/abbreviation,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "The property \"vaem:abbreviation\" provides a common way to define a commonly used abbreviation on a resource",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "abbreviation"})

(def acronym
  "The property \"vaem:acronym\" provides a common way to define a commonly used abbreviation on a resource"
  {:db/ident :vaem/acronym,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "The property \"vaem:acronym\" provides a common way to define a commonly used abbreviation on a resource",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "acronym"})

(def comment
  "definition"
  {:db/ident :vaem/comment,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   [#xsd/string
     "An annotation property that can be freely used on any kind of resource. The range of the property is 'xsd:string'."
    #xsd/string
     "An annotation property that can be freely used on any kind of resource. The range of the property is \"xsd:string\""],
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "definition",
   :rdfs/range :xsd/string})

(def date
  "date"
  {:db/ident :vaem/date,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "The property 'vaem:date' is intended for general use as the name implies.  The range of the property is set as 'vaem:dateUnion' so as to allow a value to have a number of forms from a  year only to a full timestamp. The property is also the parent of all dates so that queries can be made for any date on an ontology."
    #xsd/string
     "The property \"vaem:date\" is intended for general use as the name implies.  The range of the property is set as \"vaem:dateUnion\" so as to allow a value to have a number of forms from a  year only to a full timestamp. The property is also the parent of all dates so that queries can be made for any date on an ontology"],
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "date",
   :rdfs/range :vaem/dateUnion})

(def dateCreated
  "date created"
  {:db/ident :vaem/dateCreated,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "The property 'vaem:dateCreated' is intended for general use as the name implies.  The range of the property is set as 'vaem:dateUnion' so as to allow a value to have a number of forms from a  year only to a full timestamp."
    #xsd/string
     "The property \"vaem:dateCreated\" is intended for general use as the name implies.  The range of the property is set as \"vaem:dateUnion\" so as to allow a value to have a number of forms from a  year only to a full timestamp"],
   :rdfs/label #xsd/string "date created",
   :rdfs/range :vaem/dateUnion,
   :rdfs/subPropertyOf :vaem/date})

(def dateUnion
  "A datatype that is the union of date xsd data types. 'dateUnion' is equivalent to the xsd specification that uses an xsd:union of memberTypes='xsd:date xsd:dateTime xsd:float xsd:gYear'."
  {:db/ident :vaem/dateUnion,
   :owl/equivalentClass {:owl/unionOf [:xsd/date :xsd/dateTime :xsd/gYear],
                         :rdf/type    :rdfs/Datatype},
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   #xsd/string
    "A datatype that is the union of date xsd data types. 'dateUnion' is equivalent to the xsd specification that uses an xsd:union of memberTypes='xsd:date xsd:dateTime xsd:float xsd:gYear'.",
   :rdfs/label #xsd/string "date union",
   :rdfs/subClassOf :rdfs/Resource})

(def description
  "The property 'vaem:description' is intended for general use as the name implies.  Unlike 'rdfs:comment',  'vaem:description' is an 'owl:DatatypeProperty'. As such it can play a stronger role in the model, for example, as a predicate in an axiom."
  {:db/ident :vaem/description,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "The property 'vaem:description' is intended for general use as the name implies.  Unlike 'rdfs:comment',  'vaem:description' is an 'owl:DatatypeProperty'. As such it can play a stronger role in the model, for example, as a predicate in an axiom.",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "description",
   :rdfs/range :xsd/string})

(def filePrefix
  "The property \"vaem:filePrefix\" is for specifying a preferred file prefix for a graph. For example a schema graph may be given the file prefix \"SCHEMA\" followed by an underscore \"_\"."
  {:db/ident :vaem/filePrefix,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "The property \"vaem:filePrefix\" is for specifying a preferred file prefix for a graph. For example a schema graph may be given the file prefix \"SCHEMA\" followed by an underscore \"_\".",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "file prefix",
   :rdfs/range :xsd/string})

(def hasAspect
  "The property \"vaem:hasAspect\" is used to distinguish among sets of features of a domain or subject area. The term is borrowed from \"aspect-oriented\" programming, where it is used to separate concerns. An ontology may be characterized by this dimension so as to parition features that are orthogonal. For example,  in a systems ontology we can distinguish aspects for \"structure\", \"function\", \"behavior\" and \"interface\".  The property is an \"rdf:Property\" to allow both scalar and object values"
  {:db/ident :vaem/hasAspect,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "The property \"vaem:hasAspect\" is used to distinguish among sets of features of a domain or subject area. The term is borrowed from \"aspect-oriented\" programming, where it is used to separate concerns. An ontology may be characterized by this dimension so as to parition features that are orthogonal. For example,  in a systems ontology we can distinguish aspects for \"structure\", \"function\", \"behavior\" and \"interface\".  The property is an \"rdf:Property\" to allow both scalar and object values",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "has aspect",
   :rdfs/subPropertyOf :vaem/hasDimension})

(def hasCatalogEntry
  "has catalog entry"
  {:db/ident   :vaem/hasCatalogEntry,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label #xsd/string "has catalog entry"})

(def hasDimension
  "The property \"vaem:hasDimension\" is used categorize an ontology.  In VAEM, the property is used to characterize an ontology graph."
  {:db/ident :vaem/hasDimension,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "The property \"vaem:hasDimension\" is used categorize an ontology.  In VAEM, the property is used to characterize an ontology graph.",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "has dimension"})

(def hasDiscipline
  "The property \"vaem:hasDiscipline\" is used to indicate relevance of a set of resources, or a resource itself, to a specific discipline of work or study. Examples of disciplines in the engineering domain are electrical engineering, mechanical engineering and, in the financial domain, risk assessment, investment analysis.  In VAEM, the property is used as a dimension for characterizing an ontology graph.  The property is an \"rdf:Property\" to allow both scalar and object values"
  {:db/ident :vaem/hasDiscipline,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "The property \"vaem:hasDiscipline\" is used to indicate relevance of a set of resources, or a resource itself, to a specific discipline of work or study. Examples of disciplines in the engineering domain are electrical engineering, mechanical engineering and, in the financial domain, risk assessment, investment analysis.  In VAEM, the property is used as a dimension for characterizing an ontology graph.  The property is an \"rdf:Property\" to allow both scalar and object values",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "has discipline",
   :rdfs/subPropertyOf :vaem/hasDimension})

(def hasDomain
  "The property \"vaem:hasDomain\" is used to specify how  a set of resources, or an individual resource is grounded in a domain, that is, a subject area of interest. Examples of domains are \"enterprise\", \"process\", \"organization\" and \"system\". In VAEM, the property is used as a dimension for characterizing an ontology graph. The property is an \"rdf:Property\" to allow both scalar and object values"
  {:db/ident :vaem/hasDomain,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "The property \"vaem:hasDomain\" is used to specify how  a set of resources, or an individual resource is grounded in a domain, that is, a subject area of interest. Examples of domains are \"enterprise\", \"process\", \"organization\" and \"system\". In VAEM, the property is used as a dimension for characterizing an ontology graph. The property is an \"rdf:Property\" to allow both scalar and object values",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "has domain",
   :rdfs/subPropertyOf :vaem/hasDimension})

(def hasGraphMetadata
  {:db/ident         :vaem/hasGraphMetadata,
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/range       :vaem/GraphMetaData})

(def hasGraphRole
  "has graph role"
  {:db/ident :vaem/hasGraphRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string
     "The property 'lms:hasGraphRole' is used to characterize how a resource participates in an ontology set.  The property is used to specify the role that a graph plays, for example, an ontology graph can be a schema, vocabulary, dataset, script, or ruleset."
    #xsd/string
     "The property \"lms:hasGraphRole\" is used to characterize how a resource participates in an ontology set.  The property is used to specify the role that a graph plays, for example, an ontology graph can be a schema, vocabulary, dataset, script, or ruleset"],
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "has graph role",
   :rdfs/range :vaem/GraphRole})

(def hasIdentifier
  "The property \"vaemhasIdentifier\" is intended for general use as a means to specifiy a unique reference to something. This is an object property that is a sub-property of \"vame:id\""
  {:db/ident :vaem/hasIdentifier,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "The property \"vaemhasIdentifier\" is intended for general use as a means to specifiy a unique reference to something. This is an object property that is a sub-property of \"vame:id\"",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "has identifier"})

(def hasLicenseType
  "The property \"vaem:hasLicenseType\" points to an entry in the VOAG ontology for licenses"
  {:db/ident :vaem/hasLicenseType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "The property \"vaem:hasLicenseType\" points to an entry in the VOAG ontology for licenses",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label [#xsd/langString "has license type@en-US"
                #xsd/langString "has license type@en-us"]})

(def hasMetadata
  "The property \"hasMetadata\" is used to reference a metadata information structure."
  {:db/ident :vaem/hasMetadata,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "The property \"hasMetadata\" is used to reference a metadata information structure.",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "has metadata"})

(def hasOwner
  "has owner"
  {:db/ident         :vaem/hasOwner,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label       #xsd/string "has owner"})

(def hasSteward
  "A property that is used to refer to a \"Steward\", that is, the party or role that is responsible for maintaining an asset, in the case of VAEM, an ontology graph."
  {:db/ident :vaem/hasSteward,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "A property that is used to refer to a \"Steward\", that is, the party or role that is responsible for maintaining an asset, in the case of VAEM, an ontology graph.",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "has steward"})

(def hasViewpoint
  "The property \"vaem:hasViewpoint\" is used to denote how a set of resources, or an individual resource, is relevant to a context of use. The term \"viewpoint\" is adopted from the ISO RM-ODP specifications and its more recent use in enterprise architecture descriptions.  In VAEM, the property is used as a dimension for characterizing an ontology graph.  The property is an \"rdf:Property\" to allow both scalar and object values"
  {:db/ident :vaem/hasViewpoint,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "The property \"vaem:hasViewpoint\" is used to denote how a set of resources, or an individual resource, is relevant to a context of use. The term \"viewpoint\" is adopted from the ISO RM-ODP specifications and its more recent use in enterprise architecture descriptions.  In VAEM, the property is used as a dimension for characterizing an ontology graph.  The property is an \"rdf:Property\" to allow both scalar and object values",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "has viewpoint",
   :rdfs/subPropertyOf :vaem/hasDimension})

(def id
  "The property \"vaem:id\" is intended for general use as a means to specifiy an identifier. The type of this property is intentionally set to \"rdf:Property\" so that use of the property can allow both object and scaler values.  For this reason, the property is rangeless"
  {:db/ident :vaem/id,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "The property \"vaem:id\" is intended for general use as a means to specifiy an identifier. The type of this property is intentionally set to \"rdf:Property\" so that use of the property can allow both object and scaler values.  For this reason, the property is rangeless",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "id"})

(def idString
  "The property \"vaem:idString\" is intended for general use as a means to specifiy a unique reference to something. This is a data property with a string range and is a sub-property of \"vame:id\""
  {:db/ident :vaem/idString,
   :rdfs/comment
   #xsd/string
    "The property \"vaem:idString\" is intended for general use as a means to specifiy a unique reference to something. This is a data property with a string range and is a sub-property of \"vame:id\""})

(def intent
  "The property \"vaem:intent\" is used to outline  a statement of purpose. This typically expresses one or more desired outcomes"
  {:db/ident :vaem/intent,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "The property \"vaem:intent\" is used to outline  a statement of purpose. This typically expresses one or more desired outcomes",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "intent",
   :rdfs/range :xsd/string})

(def isElaboratedIn
  "An annotation used to reference a graph that elaborates (adds properties and axioms to) a resource"
  {:db/ident :vaem/isElaboratedIn,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #xsd/string
    "An annotation used to reference a graph that elaborates (adds properties and axioms to) a resource",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "isDefinedBy",
   :rdfs/range :xsd/anyURI,
   :rdfs/subPropertyOf :rdfs/isDefinedBy})

(def isRefinedBy
  "A refinement of the subject resource. Modelled after rdfs:isDefinedBy for the purpose of referring to layered graphs that further define a subject."
  {:db/ident :vaem/isRefinedBy,
   :rdf/type [:owl/AnnotationProperty :rdf/Property],
   :rdfs/comment
   #xsd/string
    "A refinement of the subject resource. Modelled after rdfs:isDefinedBy for the purpose of referring to layered graphs that further define a subject.",
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"},
   :rdfs/label #xsd/string "isRefinedBy",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :rdfs/isDefinedBy})

(def lastUpdated
  "last updated"
  {:db/ident :vaem/lastUpdated,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "The property 'vaem:lastUpdated' is intended for general use as the name implies.  The range of the property is set as 'vaem:dateUnion' so as to allow a value to have a number of forms from a  year only to a full timestamp."
    #xsd/string
     "The property \"vaem:lastUpdated\" is intended for general use as the name implies.  The range of the property is set as \"vaem:dateUnion\" so as to allow a value to have a number of forms from a  year only to a full timestamp"],
   :rdfs/label #xsd/string "last updated",
   :rdfs/range :vaem/dateUnion,
   :rdfs/subPropertyOf :vaem/date})

(def latestPublishedVersion
  "The property \"vaem:latestPublishedVersion\"is a URL to documentation for the latest version of a graph."
  {:db/ident :vaem/latestPublishedVersion,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "The property \"vaem:latestPublishedVersion\"is a URL to documentation for the latest version of a graph.",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "latest published version",
   :rdfs/range :xsd/anyURI})

(def logo
  "The property \"vaem:logo\" is a reference to an image that is used for publishing the ontology\""
  {:db/ident :vaem/logo,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #xsd/string
    "The property \"vaem:logo\" is a reference to an image that is used for publishing the ontology\"",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/range :xsd/anyURI})

(def name
  "name"
  {:db/ident :vaem/name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "The property 'vaem:name' is intended for general use. In many cases 'rdfs:label' could be used give names to resources. In the case where compliance with a specific naming rule is needed,  'vaem:name' allows  a resource to carry a name that is used in more specific contexts. Making 'vaem:name' a sub-property of 'rdfs:label' allows 'vaem:name' to serve in the same way as an 'rdfs:label'."
    #xsd/string
     "The property \"vaem:name\" is intended for general use. In many cases \"rdfs:label\" could be used give names to resources. In the case where compliance with a specific naming rule is needed,  \"vaem:name\" allows  a resource to carry a name that is used in more specific contexts."],
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "name",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :rdfs/label})

(def namespace
  "namespace"
  {:db/ident :vaem/namespace,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "The property 'vaem:namespace' provides a means to specify the onotlogy URI with which a graph is primarily associated. The intent is to allow multiple graphs to define statements for resources in the same Ontology namespace. For example, a foundation level graph with the base URI of 'http://www.somesite.com/1.0/schema/OurOntology'  may define general  concepts for 'OurOntology'. Another graph with the base URI 'http://www.somesite.com/1.0/schema/level2/OurOntology'  may add more specific details to the same 'OurOntology'. Each of these two graphs would carry the same value for 'vaem:namespace', that is, 'http://www.somesite.com/schema/OurOntology'.    In other words, an ontology URI is the URI associated with the resources of a controlled namespace. On the other hand the graph URIs (the base URIs) identify the graphs that hold resources that make up an ontology."
    #xsd/string
     "The property \"vaem:namespace\" is the onotlogy URI with which a graph is primarily associated. The intent is to allow multiple graphs to define statements for resources in the same Ontology namespace. For example, a foundation level graph with the base URI of \"http://www.somesite.com/1.0/schema/OurOntology\"  may define general  concepts for \"OurOntology\". Another graph with the base URI \"http://www.somesite.com/1.0/schema/level2/OurOntology\"  may add more specific details to the same \"OurOntology\". Each of these two graphs would carry the same value for \"vaem:namespace\", that is, \"http://www.somesite.com/schema/OurOntology\".    In other words, an ontology URI is the URI associated with the resources of a controlled namespace. On the other hand the graph URIs (the base URIs) identify the graphs that hold resources that make up an ontology"],
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "namespace",
   :rdfs/range :xsd/anyURI})

(def namespacePrefix
  "namespace prefix"
  {:db/ident :vaem/namespacePrefix,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "The property 'vaem:namespacePrefix' specifes a short handle or label for the URI of an Ontology.  Multiple graphs can define statements for resources in the same Ontololgy namespace. For example, a foundation level graph with the base URI of 'http://www.somesite.com/1.0/schema/OurOntology'  may define general  concepts for 'OurOntology'. Another graph with the base URI 'http://www.somesite.com/1.0/schema/level2/OurOntology'  may add more specific details to the same 'OurOntology'. Each of these two graphs would carry the same value for 'vaem:namespacePrefix', for this example, perhaps, 'ourOntology'."
    #xsd/string
     "The property \"vaem:namespacePrefix\" specifes a short handle or label for the URI of an Ontology.  Multiple graphs can define statements for resources in the same Ontololgy namespace. For example, a foundation level graph with the base URI of \"http://www.somesite.com/1.0/schema/OurOntology\"  may define general  concepts for \"OurOntology\". Another graph with the base URI \"http://www.somesite.com/1.0/schema/level2/OurOntology\"  may add more specific details to the same \"OurOntology\". Each of these two graphs would carry the same value for \"vaem:namespacePrefix\", for this example, perhaps, \"ourOntology\""],
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "namespace prefix",
   :rdfs/range :xsd/string})

(def numericUnion
  "A datatype that is the union of numeric xsd data types. 'numericUnion' is equivalent to the xsd specification that uses an xsd:union of memberTypes='xsd:decimal xsd:double xsd:float xsd:integer'."
  {:db/ident :vaem/numericUnion,
   :owl/equivalentClass
   {:owl/unionOf [:xsd/float :xsd/decimal :xsd/integer :xsd/double],
    :rdf/type    :rdfs/Datatype},
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   #xsd/string
    "A datatype that is the union of numeric xsd data types. 'numericUnion' is equivalent to the xsd specification that uses an xsd:union of memberTypes='xsd:decimal xsd:double xsd:float xsd:integer'.",
   :rdfs/label #xsd/string "numeric union",
   :rdfs/subClassOf :rdfs/Resource})

(def ownedBy
  "owned by"
  {:db/ident :vaem/ownedBy,
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#xsd/string
     "The property 'vaem:ownedBy' is a general property that in some cases could have scalar values or may refer to some concept of 'Party'.  For this reason, the  type of this property is set as 'rdf:Property' and the property is rangeless. There are two sub-properties of 'vaem:ownedBy', namely 'vaem:owner' for string values and 'vaem:owningParty' for referencing a 'party'.  Ownership applies to thos ontologies that are proprietary. Other governance and provenance specifications are held in the VOAG ontology."
    #xsd/string
     "The property \"vaem:ownedBy\" is a general property that in some cases could have scalar values or may refer to some concept of \"Party\".  For this reason, the  type of this property is set as \"rdf:Property\" and the property is rangeless. There are two sub-properties of \"vaem:ownedBy\", namely \"vaem:owner\" for string values and \"vaem:owningParty\" for referencing a party.  Ownership applies to those ontologies that are proprietary"],
   :rdfs/label #xsd/string "owned by"})

(def owner
  "owner"
  {:db/ident           :vaem/owner,
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                        {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label         #xsd/string "owner",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :vaem/ownedBy})

(def owningParty
  "owning party"
  {:db/ident :vaem/owningParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string
     "The property 'vaem:owningParty' is used to refer to some concept of 'Party' and is a sub-property of 'vaem:ownedBy'."
    #xsd/string
     "The property \"vaem:owningParty\" is used to refer to some concept of \"Party\" and is a sub-property of \"vaem:ownedBy\""],
   :rdfs/label #xsd/string "owning party",
   :rdfs/subPropertyOf :vaem/ownedBy})

(def previousPublishedVersion
  "The property \"vaem:previousPublishedVersion\"is a URL to documentation for the previous version of a graph."
  {:db/ident :vaem/previousPublishedVersion,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "The property \"vaem:previousPublishedVersion\"is a URL to documentation for the previous version of a graph.",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "previous published version",
   :rdfs/range :xsd/anyURI})

(def rationale
  "A description of a justification for some other assertion or value"
  {:db/ident :vaem/rationale,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "A description of a justification for some other assertion or value",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "rationale",
   :rdfs/range :xsd/string})

(def rdfxmlFileURL
  "The property \"vaem:rdfxmlFileURL\" is used to provide a link to the location of the ontology's RDF/XML file"
  {:db/ident :vaem/rdfxmlFileURL,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "The property \"vaem:rdfxmlFileURL\" is used to provide a link to the location of the ontology's RDF/XML file",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "RDF/XML file URL",
   :rdfs/range :xsd/anyURI})

(def reifiableBy
  "reifiable by"
  {:db/ident :vaem/reifiableBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string
     "To express how statements in a model can be reifiable, this property is used to explicitly associate a property with a user-defined sub-class of 'rdf:Statement'. A recommended way of using this is to declare the properties that share the same reification constructs as sub-properties of a parent property that carries the 'vaem:reifiableBy' property. The parent property should be of type 'rdf:Property' so that it can have both datatype and object properties as sub-properties. By this means use and transformations of a model can be understood through a fully specified metamodel. 'vaem:reifiableBy' is rangeless in order to comply with OWL DL semantics. Its range would have been rdfs:Class in order to refer to 'rdf:Statement' sub-classes."
    #xsd/string
     "To express how statements in a model can be reifiable, this property is used to explicitly associate a property with a user-defined sub-class of \"rdf:Statement\". A recommended way of using this is to declare the properties that share the same reification constructs as sub-properties of a parent property that carries the \"vaem:reifiableBy\" property. The parent property should be of type \"rdf:Property\" so that it can have both datatype and object properties as sub-properties. By this means use and transformations of a model can be understood through a fully specified metamodel. \"vaem:reifiableBy\" is rangeless in order to comply with OWL DL semantics. Its range would have been rdfs:Class in order to refer to \"rdf:Statement\" sub-classes"],
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "reifiable by"})

(def releaseDate
  "release date"
  {:db/ident :vaem/releaseDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "The property 'vaem:releaseDate' is intended for general use as the name implies.  The range of the property is set as 'vaem:dateUnion' so as to allow a value to have a number of forms from a  year only to a full timestamp."
    #xsd/string
     "The property \"vaem:releaseDate\" is intended for general use as the name implies.  The range of the property is set as \"vaem:dateUnion\" so as to allow a value to have a number of forms from a  year only to a full timestamp"],
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "release date",
   :rdfs/range :vaem/dateUnion,
   :rdfs/subPropertyOf :vaem/date})

(def revision
  "revision"
  {:db/ident :vaem/revision,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "The property 'vaem:revision' is a property intended for general use as the name implies. "
    #xsd/string
     "The property \"vaem:revision\" is a property intended for general use as the name implies."],
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "revision",
   :rdfs/range :xsd/string})

(def specificity
  "The property \"vaem:specificity\" is intended to specify the level of detail of an ontology.  The values that can be set for this property are restriced to an integer from 1 to 5. An ontology at level 1 has concepts of more general applicability than one at level 5. By having graphs at different levels of specificity it is possible to support greater modularity for selective imports"
  {:db/ident :vaem/specificity,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "The property \"vaem:specificity\" is intended to specify the level of detail of an ontology.  The values that can be set for this property are restriced to an integer from 1 to 5. An ontology at level 1 has concepts of more general applicability than one at level 5. By having graphs at different levels of specificity it is possible to support greater modularity for selective imports",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "specificity",
   :rdfs/range :xsd/nonNegativeInteger})

(def title
  "title"
  {:db/ident         :vaem/title,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label       #xsd/string "title",
   :rdfs/range       :xsd/string})

(def todo
  "todo"
  {:db/ident :vaem/todo,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   [#xsd/string
     "As it name implies, a way to attach an annotation about a 'todo' task"
    #xsd/string
     "As it name implies, a way to attach an annotation about a \"todo\" task"],
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "todo",
   :rdfs/range :xsd/string})

(def turtleFileURL
  "The property \"vaem:turtleFileURL\" is used to provide a link to the location of the ontology's turtle file"
  {:db/ident :vaem/turtleFileURL,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "The property \"vaem:turtleFileURL\" is used to provide a link to the location of the ontology's turtle file",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "turtle file URL",
   :rdfs/range :xsd/anyURI})

(def url
  "url"
  {:db/ident :vaem/url,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [#xsd/string
     "The property 'vaem:url' is intended for general use as the name implies.  The range of the property is set as an XSD URI."
    #xsd/string
     "The property \"vaem:url\" is intended for general use as the name implies.  The range of the property is set as an XSD URI"],
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "url",
   :rdfs/range :xsd/anyURI})

(def usesNonImportedResource
  "uses non-imported resource"
  {:db/ident :vaem/usesNonImportedResource,
   :rdf/type [:owl/ObjectProperty :owl/AnnotationProperty],
   :rdfs/comment
   [#xsd/string
     "A property that is used to express dependencies on resources from graphs that are not imported."
    #xsd/string
     "The property \"vaem:usesNonImportedResource\" is used to express dependencies on resources from graphs that are not imported"],
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "uses non-imported resource",
   :rdfs/range :rdfs/Resource})

(def withAttributionTo
  "The property \"vaem:withAttributionTo\" is an annotation property that is either used to hold either a string or a reference to an instance of \"voag:Attribution\", from the VOAG ontology"
  {:db/ident :vaem/withAttributionTo,
   :rdf/type [:owl/ObjectProperty :owl/AnnotationProperty],
   :rdfs/comment
   #xsd/string
    "The property \"vaem:withAttributionTo\" is an annotation property that is either used to hold either a string or a reference to an instance of \"voag:Attribution\", from the VOAG ontology",
   :rdfs/isDefinedBy [{:rdfa/uri "http://www.linkedmodel.org/2.0/schema/vaem"}
                      {:rdfa/uri "http://www.linkedmodel.org/schema/vaem"}],
   :rdfs/label #xsd/string "with attribution to"})