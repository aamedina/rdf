(ns net.wikipunk.rdf.vaem
  "http://www.linkedmodel.org/schema/vaem"
  {:dcat/downloadURL
   "https://lov.linkeddata.es/dataset/lov/vocabs/vaem/versions/2014-08-11.n3",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "vaem"    "http://www.linkedmodel.org/schema/vaem#",
                       "voag"    "http://voag.linkedmodel.org/voag/",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "vaem",
   :rdfa/uri "http://www.linkedmodel.org/schema/vaem"}
  (:refer-clojure :exclude [comment name namespace]))

(def Aspect
  "Aspect is used to distinguish among sets of features of a domain or subject area. The term is borrowed from \"aspect-oriented\" programming, where it is used to separate concerns. An ontology may be characterized by this dimension so as to parition features that are orthogonal. For example, in a systems ontology there may be aspects for \"structure\", \"function\", \"behavior\" and \"interface\" or \"interoperability\". A viewpoint can be distinguished by \"aspects\". For example the \"information viewpoint\" of an application can be partitioned into separate graphs for the \"security\", \"operational\" and\"data retention\" aspects."
  {:db/ident :vaem/Aspect,
   :dcterms/description
   "Aspect is used to distinguish among sets of features of a domain or subject area. The term is borrowed from \"aspect-oriented\" programming, where it is used to separate concerns. An ontology may be characterized by this dimension so as to parition features that are orthogonal. For example,  in a systems ontology there may be aspects for \"structure\", \"function\", \"behavior\" and \"interface\" or \"interoperability\". A viewpoint can be distinguished by \"aspects\". For example the \"information viewpoint\" of an application can be partitioned into separate graphs for the \"security\", \"operational\" and\"data retention\" aspects.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "Aspect Dimension",
   :rdfs/subClassOf [:vaem/Dimension :vaem/Aspect :owl/Thing]})

(def CatalogEntry
  "VAEM Governed Object class is a placeholder for concepts that are fully defined by the voag:GovernedObject concept hierarchy for building a catalog of ontologies and graphs"
  {:db/ident :vaem/CatalogEntry,
   :dcterms/description
   "VAEM Governed Object class is a placeholder for concepts that are fully defined by the voag:GovernedObject concept hierarchy for building a catalog of ontologies and graphs"})

(def CollectionGraph
  "A \"vaem:CollectionGraph\" is a graph that aggregates other graphs using \"owl:imports\" statements"
  {:db/ident :vaem/CollectionGraph,
   :dcterms/description
   "A \"vaem:CollectionGraph\" is a graph that aggregates other graphs using \"owl:imports\" statements",
   :rdf/type [:vaem/GraphRole
              :owl/Thing
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/description,
               :rdf/type           :owl/Restriction}
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/filePrefix,
               :rdf/type           :owl/Restriction}],
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "Collection graph",
   :vaem/filePrefix "COLLECTION"})

(def ConstraintsGraph
  "A \"vaem:ConstraintsGraph\" is a graph that holds SPIN constraints"
  {:db/ident :vaem/ConstraintsGraph,
   :dcterms/description
   "A \"vaem:ConstraintsGraph\" is a graph that holds SPIN constraints",
   :rdf/type [:vaem/GraphRole
              :owl/Thing
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/description,
               :rdf/type           :owl/Restriction}
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/filePrefix,
               :rdf/type           :owl/Restriction}],
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "Constraints graph",
   :vaem/filePrefix "CONSTRAINTS"})

(def ControllersGraph
  "Controllers graph"
  {:db/ident         :vaem/ControllersGraph,
   :rdf/type         [:vaem/GraphRole
                      :owl/Thing
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/description,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/filePrefix,
                       :rdf/type           :owl/Restriction}],
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label       "Controllers graph",
   :vaem/filePrefix  "CONTROLLERS"})

(def CurationGraph
  "A \"vaem:CurationGraph\" is a graph to hold metadata that is needed to describe, govern and provision another graph. A curation graph will likely use VOAG and VAEM for this purpose. The property \"vaem:curationGraph\" is used to link to the graph (or graphs) being curated"
  {:db/ident :vaem/CurationGraph,
   :dcterms/description
   "A \"vaem:CurationGraph\" is a graph to hold metadata that is needed to describe, govern and provision another graph. A curation graph will likely use VOAG and VAEM for this purpose. The property \"vaem:curationGraph\" is used to link to the graph (or graphs) being curated",
   :rdf/type [:vaem/GraphRole
              :owl/Thing
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/description,
               :rdf/type           :owl/Restriction}
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/filePrefix,
               :rdf/type           :owl/Restriction}],
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "Curation graph",
   :vaem/filePrefix "CURATION"})

(def DataGraph
  "Data graph"
  {:db/ident         :vaem/DataGraph,
   :rdf/type         [:vaem/GraphRole
                      :owl/Thing
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/description,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/filePrefix,
                       :rdf/type           :owl/Restriction}],
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label       "Data graph",
   :vaem/filePrefix  "DATA"})

(def Dimension
  "A dimension identifies a separation of concens that serves as a way to categorize an ontology graph. In VAEM, the notion of \"Dimension\" is partitioned into \"Aspect\", \"Discipline\", \"Domain\" and \"Viewpoint\"."
  {:db/ident :vaem/Dimension,
   :dcterms/description
   "A dimension identifies a separation of concens that serves as a way to categorize an ontology graph. In VAEM,  the notion of \"Dimension\" is partitioned into \"Aspect\", \"Discipline\", \"Domain\" and \"Viewpoint\".",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "Domain",
   :rdfs/subClassOf [:owl/Thing :vaem/Dimension]})

(def Discipline
  "A discipline is a specific area of work or study. Examples of disciplines in the engineering domain are electrical engineering, mechanical engineering and, in the financial domain, risk assessment, investment analysis. In VAEM, discipline is used as a dimension for characterizing an ontology graph"
  {:db/ident :vaem/Discipline,
   :dcterms/description
   "A discipline is a specific area of work or study. Examples of disciplines in the engineering domain are electrical engineering, mechanical engineering and, in the financial domain, risk assessment, investment analysis.  In VAEM, discipline is used as a dimension for characterizing an ontology graph",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "Discipline Dimension",
   :rdfs/subClassOf [:vaem/Dimension :vaem/Discipline :owl/Thing]})

(def DocumentationGraph
  "Documentation graph"
  {:db/ident         :vaem/DocumentationGraph,
   :rdf/type         [:vaem/GraphRole
                      :owl/Thing
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/description,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/filePrefix,
                       :rdf/type           :owl/Restriction}],
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label       "Documentation graph",
   :vaem/filePrefix  "DOC"})

(def Domain
  "A domain is a subject area of interest. Examples of domains are \"enterprise\", \"process\", \"organization\" and \"system\". In VAEM, \"Domain\" is used as a dimension for characterizing an ontology graph"
  {:db/ident :vaem/Domain,
   :dcterms/description
   "A domain is a subject area of interest. Examples of domains are \"enterprise\", \"process\", \"organization\" and \"system\". In VAEM, \"Domain\" is used as a dimension for characterizing an ontology graph",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "Domain Dimension",
   :rdfs/subClassOf [:vaem/Dimension :vaem/Domain :owl/Thing]})

(def FunctionsGraph
  "Functions graph"
  {:db/ident         :vaem/FunctionsGraph,
   :rdf/type         [:vaem/GraphRole
                      :owl/Thing
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/description,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/filePrefix,
                       :rdf/type           :owl/Restriction}],
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label       "Functions graph",
   :vaem/filePrefix  "FUNCTIONS"})

(def GMD_VAEM
  "VAEM stands for \"Vocabulary for Attaching Essential Metadata\". What VAEM regards as essential metadata is data about dates and times, confidentiality, and other characterisitic qualifiers of the ontology, but also references to where a ontology is documented and where to find ontology registration for governance, attribution and provenance. VAEM makes use of some properties from the DC terms vocabulary using the namespace prefix \"dct\". VAEM is OWL-DL compliant."
  {:db/ident :vaem/GMD_VAEM,
   :dcterms/abstract
   "VAEM stands for \"Vocabulary for Attaching Essential Metadata\". What VAEM regards as essential metadata is data about dates and times, confidentiality, and other characterisitic qualifiers of the ontology, but also references to where a ontology is documented and where to find ontology registration for governance, attribution and provenance. VAEM makes use of some properties from the DC terms vocabulary using the namespace prefix \"dct\". VAEM is OWL-DL compliant.",
   :dcterms/created #inst "2011-04-20T00:00:00.000-04:00",
   :dcterms/modified #inst "2014-07-26T00:00:00.000-04:00",
   :dcterms/title "VAEM Version 2.0 Metadata",
   :rdf/type [:vaem/GraphMetaData
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/latestPublishedVersion,
               :rdf/type           :owl/Restriction}
              :owl/Thing
              {:owl/allValuesFrom :vaem/Party,
               :owl/onProperty    :vaem/hasSteward,
               :rdf/type          :owl/Restriction}
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/namespacePrefix,
               :rdf/type           :owl/Restriction}
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/rdfxmlFileURL,
               :rdf/type           :owl/Restriction}
              {:owl/allValuesFrom :vaem/Viewpoint,
               :owl/onProperty    :vaem/hasViewpoint,
               :rdf/type          :owl/Restriction}
              {:owl/allValuesFrom :vaem/GraphMetaData,
               :owl/onProperty    :vaem/hasMetadata,
               :rdf/type          :owl/Restriction}
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/turtleFileURL,
               :rdf/type           :owl/Restriction}
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/specificity,
               :rdf/type           :owl/Restriction}
              {:owl/allValuesFrom :vaem/Aspect,
               :owl/onProperty    :vaem/hasAspect,
               :rdf/type          :owl/Restriction}
              {:owl/allValuesFrom :vaem/Discipline,
               :owl/onProperty    :vaem/hasDiscipline,
               :rdf/type          :owl/Restriction}
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/revision,
               :rdf/type           :owl/Restriction}
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/intent,
               :rdf/type           :owl/Restriction}
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/previousPublishedVersion,
               :rdf/type           :owl/Restriction}
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/hasLicenseType,
               :rdf/type           :owl/Restriction}
              {:owl/allValuesFrom :vaem/Party,
               :owl/onProperty    :vaem/hasOwner,
               :rdf/type          :owl/Restriction}
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/hasSteward,
               :rdf/type           :owl/Restriction}
              {:owl/allValuesFrom :vaem/Domain,
               :owl/onProperty    :vaem/hasDomain,
               :rdf/type          :owl/Restriction}
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/hasMetadata,
               :rdf/type           :owl/Restriction}
              {:owl/cardinality 1,
               :owl/onProperty  :vaem/name,
               :rdf/type        :owl/Restriction}
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/owner,
               :rdf/type           :owl/Restriction}
              {:owl/allValuesFrom :xsd/string,
               :owl/onProperty    :vaem/description,
               :rdf/type          :owl/Restriction}
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/namespace,
               :rdf/type           :owl/Restriction}
              {:owl/allValuesFrom :vaem/GraphRole,
               :owl/onProperty    :vaem/hasGraphRole,
               :rdf/type          :owl/Restriction}
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/hasIdentifier,
               :rdf/type           :owl/Restriction}],
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "VAEM Schema Version 2.0 Metadata",
   :vaem/description
   "VAEM stands for \"Vocabulary for Attaching Essential Metadata\". What VAEM regards as essential metadata is data about dates and times, confidentiality, and other characterisitic qualifiers of the ontology, but also references to where a ontology is documented and where to find ontology registration for governance, attribution and provenance. VAEM makes use of some properties from the DC terms vocabulary using the namespace prefix \"dct\". VAEM is OWL-DL compliant.",
   :vaem/hasGraphRole :vaem/SchemaGraph,
   :vaem/hasOwner :vaem/TopQuadrant,
   :vaem/hasSteward :vaem/TopQuadrant,
   :vaem/intent
   "The purpose of VAEM is to provide, by import, a foundation for commonly needed resources for metadata on an ontology.",
   :vaem/latestPublishedVersion
   "http://www.linkedmodel.org/doc/2014/SCHEMA_vaem-v2.0",
   :vaem/logo
   "http://linkedmodel.org/lib/lm/images/logos/TopBraid-RDM-Graph-Logo.png",
   :vaem/name "VAEM",
   :vaem/namespace "http://www.linkedmodel.org/schema/vaem#",
   :vaem/namespacePrefix "vaem",
   :vaem/owner "TopQuadrant, Inc.",
   :vaem/previousPublishedVersion "http://linkedmodel.org/doc/vaem/1.2/",
   :vaem/rdfxmlFileURL
   "http://www.linkedmodel.org/2.0/schema/SCHEMA_vaem-v2.0.rdf",
   :vaem/revision "2.0",
   :vaem/title
   "Vocabulary for Attaching Essential Metadata (VAEM) - Version 2.0",
   :vaem/turtleFileURL
   "http://www.linkedmodel.org/2.0/schema/SCHEMA_vaem-v2.0.ttl",
   :vaem/usesNonImportedResource [:dcterms/modified
                                  :dcterms/abstract
                                  :dcterms/created
                                  :voag/CC-SHAREALIKE_3PT0-US
                                  :dcterms/title
                                  :dcterms/author],
   :vaem/withAttributionTo
   "VAEM is issued under a Creative Commons Attribution Share Alike 3.0 United States License. Attribution should be made to TopQuadrant, Inc."})

(def GraphMetaData
  "\"vaem:GraphMetaData\" defines basic metadata for the registration and publishing of a graph. For specificaiton of governance the vocabulary \"VOAG\" may be used."
  {:db/ident :vaem/GraphMetaData,
   :dcterms/description
   "\"vaem:GraphMetaData\" defines basic metadata for the registration and publishing of a graph.  For specificaiton of governance the vocabulary \"VOAG\" may be used.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/schema/vaem"
                      "http://www.linkedmodel.org/2.0/schema/vaem"],
   :rdfs/label "Graph Metadata",
   :rdfs/seeAlso ["http://voag.linkedmodel.org/vocab/voag"],
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/namespacePrefix,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/revision,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/namespace,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :vaem/Domain,
                      :owl/onProperty    :vaem/hasDomain,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/intent,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/owner,
                      :rdf/type           :owl/Restriction}
                     :owl/Thing
                     {:owl/allValuesFrom :vaem/Party,
                      :owl/onProperty    :vaem/hasSteward,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/specificity,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/turtleFileURL,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :vaem/Viewpoint,
                      :owl/onProperty    :vaem/hasViewpoint,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/rdfxmlFileURL,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :vaem/GraphRole,
                      :owl/onProperty    :vaem/hasGraphRole,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/previousPublishedVersion,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :vaem/GraphMetaData,
                      :owl/onProperty    :vaem/hasMetadata,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/hasSteward,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :xsd/string,
                      :owl/onProperty    :vaem/description,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/hasMetadata,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :vaem/Party,
                      :owl/onProperty    :vaem/hasOwner,
                      :rdf/type          :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :vaem/name,
                      :rdf/type        :owl/Restriction}
                     {:owl/allValuesFrom :vaem/Discipline,
                      :owl/onProperty    :vaem/hasDiscipline,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/hasIdentifier,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/hasLicenseType,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/latestPublishedVersion,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :vaem/Aspect,
                      :owl/onProperty    :vaem/hasAspect,
                      :rdf/type          :owl/Restriction}
                     :vaem/GraphMetaData]})

(def GraphRole
  "GraphRole is used to characterize how a graph of resources participates in an ontology set. For example, a graph can be a schema, vocabulary, dataset, script, or ruleset"
  {:db/ident :vaem/GraphRole,
   :dcterms/description
   "GraphRole is used to characterize how a graph of resources participates in an ontology set.  For example, a graph can be a schema, vocabulary, dataset, script, or ruleset",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "Graph role",
   :rdfs/subClassOf [:owl/Thing
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/description,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/filePrefix,
                      :rdf/type           :owl/Restriction}
                     :vaem/GraphRole]})

(def LinkSetGraph
  "A \"vaem:LinkSetGraph\" is a graph that holds statements that specify links between resources"
  {:db/ident :vaem/LinkSetGraph,
   :dcterms/description
   "A \"vaem:LinkSetGraph\" is a graph that holds statements that specify links between resources",
   :rdf/type [:vaem/GraphRole
              :owl/Thing
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/description,
               :rdf/type           :owl/Restriction}
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/filePrefix,
               :rdf/type           :owl/Restriction}],
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "Link Set graph",
   :vaem/filePrefix "LINKSET"})

(def MappingGraph
  "A graph that specifies a transformation of a graph into another graph or graphs. Invariably this is a SPINMap graph using SPARQL Rules (SPIN) to express the transforms."
  {:db/ident :vaem/MappingGraph,
   :dcterms/description
   "A graph that specifies a transformation of a graph into another graph or graphs. Invariably this is a SPINMap graph using SPARQL Rules (SPIN) to express the transforms.",
   :rdf/type [:vaem/GraphRole
              :owl/Thing
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/description,
               :rdf/type           :owl/Restriction}
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/filePrefix,
               :rdf/type           :owl/Restriction}],
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "Mapping graph",
   :vaem/filePrefix "MAPPINGS"})

(def Party
  "A \"Party\" is a generalization for an actor that may be realized as a person, organizaiton or named role."
  {:db/ident :vaem/Party,
   :dcterms/description
   "A \"Party\" is a generalization for an actor that may be realized as a person, organizaiton or named role.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "Party",
   :rdfs/subClassOf [:owl/Thing
                     {:owl/cardinality 1,
                      :owl/onProperty  :vaem/name,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/id,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :vaem/url,
                      :rdf/type           :owl/Restriction}
                     :vaem/Party]})

(def ProxyGraph
  "Proxy graph"
  {:db/ident         :vaem/ProxyGraph,
   :rdf/type         [:vaem/GraphRole
                      :owl/Thing
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/description,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/filePrefix,
                       :rdf/type           :owl/Restriction}],
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label       "Proxy graph",
   :vaem/filePrefix  "PROXY"})

(def RulesGraph
  "Rules Graph"
  {:db/ident         :vaem/RulesGraph,
   :rdf/type         [:vaem/GraphRole
                      :owl/Thing
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/description,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/filePrefix,
                       :rdf/type           :owl/Restriction}],
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label       "Rules Graph",
   :vaem/filePrefix  "RULES"})

(def SchemaGraph
  "Schema graph"
  {:db/ident         :vaem/SchemaGraph,
   :rdf/type         [:vaem/GraphRole
                      :owl/Thing
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/description,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/filePrefix,
                       :rdf/type           :owl/Restriction}],
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label       "Schema graph",
   :vaem/filePrefix  "SCHEMA"})

(def ScriptGraph
  "Script graph"
  {:db/ident         :vaem/ScriptGraph,
   :rdf/type         [:vaem/GraphRole
                      :owl/Thing
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/description,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/filePrefix,
                       :rdf/type           :owl/Restriction}],
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label       "Script graph",
   :vaem/filePrefix  "SCRIPT"})

(def TopQuadrant
  "TopQuadrant"
  {:db/ident         :vaem/TopQuadrant,
   :rdf/type         [:vaem/Party
                      :owl/Thing
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/id,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/url,
                       :rdf/type           :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :vaem/name,
                       :rdf/type        :owl/Restriction}],
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label       "TopQuadrant",
   :vaem/name        "TopQuadrant, Inc.",
   :vaem/url         "http:/www.topquadrant.com"})

(def TransformsGraph
  "Transforms graph"
  {:db/ident         :vaem/TransformsGraph,
   :rdf/type         [:vaem/GraphRole
                      :owl/Thing
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/description,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/filePrefix,
                       :rdf/type           :owl/Restriction}],
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label       "Transforms graph",
   :vaem/filePrefix  "TRANSFORMS"})

(def ViewGraph
  "View graph"
  {:db/ident         :vaem/ViewGraph,
   :rdf/type         [:vaem/GraphRole
                      :owl/Thing
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/description,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxCardinality 1,
                       :owl/onProperty     :vaem/filePrefix,
                       :rdf/type           :owl/Restriction}],
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label       "View graph",
   :vaem/filePrefix  "VIEWS"})

(def Viewpoint
  "Viewpoint is used to denote how a set of resources, or an individual resource, is relevant to a context of use. The term \"viewpoint\" is adopted from the ISO RM-ODP specifications and its more recent use in enterprise architecture descriptions. The RM-ODP introducesd the concept of viewpoint to describe a system from a particular set of concerns. RM-ODP defines five viewpoints. Together they provide a complete description of a system: enterprise viewpoint, information viewpoint, computational viewpoint, engineering viewpoint, and technology viewpoint. In VAEM, \"Viewpoint\" is used as a dimension for characterizing an ontology graph. The viewpoints of an ontology may not always correpsond directly to those of a system but the idea of describing a subject area of interest from distinct viewpoints is still relevant. A viewpoint can be further distinguished by \"aspects\". For example the \"information viewpoint\" of an application can be partitioned into separate graphs for the \"security\", \"operational\" and\"data retention\" aspects."
  {:db/ident :vaem/Viewpoint,
   :dcterms/description
   "Viewpoint is used to denote how a set of resources, or an individual resource, is relevant to a context of use. The term \"viewpoint\" is adopted from the ISO RM-ODP specifications and its more recent use in enterprise architecture descriptions. The RM-ODP introducesd the concept of viewpoint to describe a system from a particular set of concerns. RM-ODP defines five viewpoints. Together they provide a complete description of a system: enterprise viewpoint, information viewpoint, computational viewpoint, engineering viewpoint, and technology viewpoint.  In VAEM, \"Viewpoint\" is used as a dimension for characterizing an ontology graph.  The viewpoints of an ontology may not always correpsond directly to those of a system but the idea of describing a subject area of interest from distinct viewpoints is still relevant. A viewpoint can be further distinguished by \"aspects\". For example the \"information viewpoint\" of an application can be partitioned into separate graphs for the \"security\", \"operational\" and\"data retention\" aspects.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "ViewpointDimension",
   :rdfs/subClassOf [:vaem/Dimension :vaem/Viewpoint :owl/Thing]})

(def VocabularyGraph
  "An RDF/OWL Graph that is a controlled set of instances."
  {:db/ident :vaem/VocabularyGraph,
   :dcterms/description
   "An RDF/OWL Graph that is a controlled set of instances.",
   :rdf/type [:vaem/GraphRole
              :owl/Thing
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/description,
               :rdf/type           :owl/Restriction}
              {:owl/maxCardinality 1,
               :owl/onProperty     :vaem/filePrefix,
               :rdf/type           :owl/Restriction}],
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "Vocabulary graph",
   :vaem/filePrefix "VOCAB"})

(def abbreviation
  "The property \"vaem:abbreviation\" provides a common way to define a commonly used abbreviation on a resource"
  {:db/ident         :vaem/abbreviation,
   :dcterms/description
   "The property \"vaem:abbreviation\" provides a common way to define a commonly used abbreviation on a resource",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label       "abbreviation"})

(def acronym
  "The property \"vaem:acronym\" provides a common way to define a commonly used abbreviation on a resource"
  {:db/ident         :vaem/acronym,
   :dcterms/description
   "The property \"vaem:acronym\" provides a common way to define a commonly used abbreviation on a resource",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label       "acronym"})

(def comment
  "An annotation property that can be freely used on any kind of resource. The range of the property is \"xsd:string\""
  {:db/ident :vaem/comment,
   :dcterms/description
   "An annotation property that can be freely used on any kind of resource. The range of the property is \"xsd:string\"",
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "definition",
   :rdfs/range :xsd/string})

(def date
  "The property \"vaem:date\" is intended for general use as the name implies. The range of the property is set as \"vaem:dateUnion\" so as to allow a value to have a number of forms from a year only to a full timestamp. The property is also the parent of all dates so that queries can be made for any date on an ontology"
  {:db/ident           :vaem/date,
   :dcterms/description
   "The property \"vaem:date\" is intended for general use as the name implies.  The range of the property is set as \"vaem:dateUnion\" so as to allow a value to have a number of forms from a  year only to a full timestamp. The property is also the parent of all dates so that queries can be made for any date on an ontology",
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   ["http://www.linkedmodel.org/2.0/schema/vaem"
                        "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label         "date",
   :rdfs/subPropertyOf :vaem/date})

(def dateCreated
  "The property \"vaem:dateCreated\" is intended for general use as the name implies. The range of the property is set as \"vaem:dateUnion\" so as to allow a value to have a number of forms from a year only to a full timestamp"
  {:db/ident :vaem/dateCreated,
   :rdf/type         :owl/DatatypeProperty
   :dcterms/description
   "The property \"vaem:dateCreated\" is intended for general use as the name implies.  The range of the property is set as \"vaem:dateUnion\" so as to allow a value to have a number of forms from a  year only to a full timestamp"})

(def description
  "description"
  {:db/ident         :vaem/description,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label       "description",
   :rdfs/range       :xsd/string})

(def filePrefix
  "The property \"vaem:filePrefix\" is for specifying a preferred file prefix for a graph. For example a schema graph may be given the file prefix \"SCHEMA\" followed by an underscore \"_\"."
  {:db/ident :vaem/filePrefix,
   :dcterms/description
   "The property \"vaem:filePrefix\" is for specifying a preferred file prefix for a graph. For example a schema graph may be given the file prefix \"SCHEMA\" followed by an underscore \"_\".",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "file prefix",
   :rdfs/range :xsd/string})

(def hasAspect
  "The property \"vaem:hasAspect\" is used to distinguish among sets of features of a domain or subject area. The term is borrowed from \"aspect-oriented\" programming, where it is used to separate concerns. An ontology may be characterized by this dimension so as to parition features that are orthogonal. For example, in a systems ontology we can distinguish aspects for \"structure\", \"function\", \"behavior\" and \"interface\". The property is an \"rdf:Property\" to allow both scalar and object values"
  {:db/ident           :vaem/hasAspect,
   :dcterms/description
   "The property \"vaem:hasAspect\" is used to distinguish among sets of features of a domain or subject area. The term is borrowed from \"aspect-oriented\" programming, where it is used to separate concerns. An ontology may be characterized by this dimension so as to parition features that are orthogonal. For example,  in a systems ontology we can distinguish aspects for \"structure\", \"function\", \"behavior\" and \"interface\".  The property is an \"rdf:Property\" to allow both scalar and object values",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   ["http://www.linkedmodel.org/2.0/schema/vaem"
                        "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label         "has aspect",
   :rdfs/subPropertyOf [:vaem/hasDimension :vaem/hasAspect]})

(def hasDimension
  "The property \"vaem:hasDimension\" is used categorize an ontology. In VAEM, the property is used to characterize an ontology graph."
  {:db/ident           :vaem/hasDimension,
   :dcterms/description
   "The property \"vaem:hasDimension\" is used categorize an ontology.  In VAEM, the property is used to characterize an ontology graph.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   ["http://www.linkedmodel.org/2.0/schema/vaem"
                        "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label         "has dimension",
   :rdfs/subPropertyOf :vaem/hasDimension})

(def hasDiscipline
  "The property \"vaem:hasDiscipline\" is used to indicate relevance of a set of resources, or a resource itself, to a specific discipline of work or study. Examples of disciplines in the engineering domain are electrical engineering, mechanical engineering and, in the financial domain, risk assessment, investment analysis. In VAEM, the property is used as a dimension for characterizing an ontology graph. The property is an \"rdf:Property\" to allow both scalar and object values"
  {:db/ident           :vaem/hasDiscipline,
   :dcterms/description
   "The property \"vaem:hasDiscipline\" is used to indicate relevance of a set of resources, or a resource itself, to a specific discipline of work or study. Examples of disciplines in the engineering domain are electrical engineering, mechanical engineering and, in the financial domain, risk assessment, investment analysis.  In VAEM, the property is used as a dimension for characterizing an ontology graph.  The property is an \"rdf:Property\" to allow both scalar and object values",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   ["http://www.linkedmodel.org/2.0/schema/vaem"
                        "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label         "has discipline",
   :rdfs/subPropertyOf [:vaem/hasDimension :vaem/hasDiscipline]})

(def hasDomain
  "The property \"vaem:hasDomain\" is used to specify how a set of resources, or an individual resource is grounded in a domain, that is, a subject area of interest. Examples of domains are \"enterprise\", \"process\", \"organization\" and \"system\". In VAEM, the property is used as a dimension for characterizing an ontology graph. The property is an \"rdf:Property\" to allow both scalar and object values"
  {:db/ident           :vaem/hasDomain,
   :dcterms/description
   "The property \"vaem:hasDomain\" is used to specify how  a set of resources, or an individual resource is grounded in a domain, that is, a subject area of interest. Examples of domains are \"enterprise\", \"process\", \"organization\" and \"system\". In VAEM, the property is used as a dimension for characterizing an ontology graph. The property is an \"rdf:Property\" to allow both scalar and object values",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   ["http://www.linkedmodel.org/2.0/schema/vaem"
                        "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label         "has domain",
   :rdfs/subPropertyOf [:vaem/hasDimension :vaem/hasDomain]})

(def hasGraphMetadata
  {:db/ident         :vaem/hasGraphMetadata,
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/range       :vaem/GraphMetaData})

(def hasGraphRole
  "The property \"lms:hasGraphRole\" is used to characterize how a resource participates in an ontology set. The property is used to specify the role that a graph plays, for example, an ontology graph can be a schema, vocabulary, dataset, script, or ruleset"
  {:db/ident :vaem/hasGraphRole,
   :dcterms/description
   "The property \"lms:hasGraphRole\" is used to characterize how a resource participates in an ontology set.  The property is used to specify the role that a graph plays, for example, an ontology graph can be a schema, vocabulary, dataset, script, or ruleset",
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "has graph role",
   :rdfs/range :vaem/GraphRole})

(def hasIdentifier
  "The property \"vaemhasIdentifier\" is intended for general use as a means to specifiy a unique reference to something. This is an object property that is a sub-property of \"vame:id\""
  {:db/ident         :vaem/hasIdentifier,
   :dcterms/description
   "The property \"vaemhasIdentifier\" is intended for general use as a means to specifiy a unique reference to something. This is an object property that is a sub-property of \"vame:id\"",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label       "has identifier"})

(def hasLicenseType
  "The property \"vaem:hasLicenseType\" points to an entry in the VOAG ontology for licenses"
  {:db/ident         :vaem/hasLicenseType,
   :dcterms/description
   "The property \"vaem:hasLicenseType\" points to an entry in the VOAG ontology for licenses",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label       #voc/lstr "has license type@en-us"})

(def hasMetadata
  "The property \"hasMetadata\" is used to reference a metadata information structure."
  {:db/ident         :vaem/hasMetadata,
   :dcterms/description
   "The property \"hasMetadata\" is used to reference a metadata information structure.",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label       "has metadata"})

(def hasOwner
  "has owner"
  {:db/ident         :vaem/hasOwner,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label       "has owner"})

(def hasSteward
  "A property that is used to refer to a \"Steward\", that is, the party or role that is responsible for maintaining an asset, in the case of VAEM, an ontology graph."
  {:db/ident         :vaem/hasSteward,
   :dcterms/description
   "A property that is used to refer to a \"Steward\", that is, the party or role that is responsible for maintaining an asset, in the case of VAEM, an ontology graph.",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label       "has steward"})

(def hasViewpoint
  "The property \"vaem:hasViewpoint\" is used to denote how a set of resources, or an individual resource, is relevant to a context of use. The term \"viewpoint\" is adopted from the ISO RM-ODP specifications and its more recent use in enterprise architecture descriptions. In VAEM, the property is used as a dimension for characterizing an ontology graph. The property is an \"rdf:Property\" to allow both scalar and object values"
  {:db/ident           :vaem/hasViewpoint,
   :dcterms/description
   "The property \"vaem:hasViewpoint\" is used to denote how a set of resources, or an individual resource, is relevant to a context of use. The term \"viewpoint\" is adopted from the ISO RM-ODP specifications and its more recent use in enterprise architecture descriptions.  In VAEM, the property is used as a dimension for characterizing an ontology graph.  The property is an \"rdf:Property\" to allow both scalar and object values",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   ["http://www.linkedmodel.org/2.0/schema/vaem"
                        "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label         "has viewpoint",
   :rdfs/subPropertyOf [:vaem/hasDimension :vaem/hasViewpoint]})

(def id
  "The property \"vaem:id\" is intended for general use as a means to specifiy an identifier. The type of this property is intentionally set to \"rdf:Property\" so that use of the property can allow both object and scaler values. For this reason, the property is rangeless"
  {:db/ident         :vaem/id,
   :dcterms/description
   "The property \"vaem:id\" is intended for general use as a means to specifiy an identifier. The type of this property is intentionally set to \"rdf:Property\" so that use of the property can allow both object and scaler values.  For this reason, the property is rangeless",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label       "id"})

(def idString
  "The property \"vaem:idString\" is intended for general use as a means to specifiy a unique reference to something. This is a data property with a string range and is a sub-property of \"vame:id\""
  {:db/ident :vaem/idString,
   :dcterms/description
   "The property \"vaem:idString\" is intended for general use as a means to specifiy a unique reference to something. This is a data property with a string range and is a sub-property of \"vame:id\""
   :rdf/type         :owl/DatatypeProperty})

(def intent
  "The property \"vaem:intent\" is used to outline a statement of purpose. This typically expresses one or more desired outcomes"
  {:db/ident :vaem/intent,
   :dcterms/description
   "The property \"vaem:intent\" is used to outline  a statement of purpose. This typically expresses one or more desired outcomes",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "intent",
   :rdfs/range :xsd/string})

(def isElaboratedIn
  "An annotation used to reference a graph that elaborates (adds properties and axioms to) a resource"
  {:db/ident :vaem/isElaboratedIn,
   :dcterms/description
   "An annotation used to reference a graph that elaborates (adds properties and axioms to) a resource",
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "isDefinedBy",
   :rdfs/range :xsd/anyURI,
   :rdfs/subPropertyOf [:rdfs/isDefinedBy :vaem/isElaboratedIn]})

(def lastUpdated
  "The property \"vaem:lastUpdated\" is intended for general use as the name implies. The range of the property is set as \"vaem:dateUnion\" so as to allow a value to have a number of forms from a year only to a full timestamp"
  {:db/ident :vaem/lastUpdated,
   :rdf/type         :owl/DatatypeProperty
   :dcterms/description
   "The property \"vaem:lastUpdated\" is intended for general use as the name implies.  The range of the property is set as \"vaem:dateUnion\" so as to allow a value to have a number of forms from a  year only to a full timestamp"})

(def latestPublishedVersion
  "The property \"vaem:latestPublishedVersion\"is a URL to documentation for the latest version of a graph."
  {:db/ident :vaem/latestPublishedVersion,
   :dcterms/description
   "The property \"vaem:latestPublishedVersion\"is a URL to documentation for the latest version of a graph.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "latest published version",
   :rdfs/range :xsd/anyURI})

(def logo
  "The property \"vaem:logo\" is a reference to an image that is used for publishing the ontology\""
  {:db/ident         :vaem/logo,
   :dcterms/description
   "The property \"vaem:logo\" is a reference to an image that is used for publishing the ontology\"",
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/range       :xsd/anyURI})

(def name
  "The property \"vaem:name\" is intended for general use. In many cases \"rdfs:label\" could be used give names to resources. In the case where compliance with a specific naming rule is needed, \"vaem:name\" allows a resource to carry a name that is used in more specific contexts."
  {:db/ident :vaem/name,
   :dcterms/description
   "The property \"vaem:name\" is intended for general use. In many cases \"rdfs:label\" could be used give names to resources. In the case where compliance with a specific naming rule is needed,  \"vaem:name\" allows  a resource to carry a name that is used in more specific contexts.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "name",
   :rdfs/range :xsd/string})

(def namespace
  "The property \"vaem:namespace\" is the onotlogy URI with which a graph is primarily associated. The intent is to allow multiple graphs to define statements for resources in the same Ontology namespace. For example, a foundation level graph with the base URI of \"http://www.somesite.com/1.0/schema/OurOntology\" may define general concepts for \"OurOntology\". Another graph with the base URI \"http://www.somesite.com/1.0/schema/level2/OurOntology\" may add more specific details to the same \"OurOntology\". Each of these two graphs would carry the same value for \"vaem:namespace\", that is, \"http://www.somesite.com/schema/OurOntology\". In other words, an ontology URI is the URI associated with the resources of a controlled namespace. On the other hand the graph URIs (the base URIs) identify the graphs that hold resources that make up an ontology"
  {:db/ident :vaem/namespace,
   :dcterms/description
   "The property \"vaem:namespace\" is the onotlogy URI with which a graph is primarily associated. The intent is to allow multiple graphs to define statements for resources in the same Ontology namespace. For example, a foundation level graph with the base URI of \"http://www.somesite.com/1.0/schema/OurOntology\"  may define general  concepts for \"OurOntology\". Another graph with the base URI \"http://www.somesite.com/1.0/schema/level2/OurOntology\"  may add more specific details to the same \"OurOntology\". Each of these two graphs would carry the same value for \"vaem:namespace\", that is, \"http://www.somesite.com/schema/OurOntology\".    In other words, an ontology URI is the URI associated with the resources of a controlled namespace. On the other hand the graph URIs (the base URIs) identify the graphs that hold resources that make up an ontology",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "namespace",
   :rdfs/range :xsd/anyURI})

(def namespacePrefix
  "The property \"vaem:namespacePrefix\" specifes a short handle or label for the URI of an Ontology. Multiple graphs can define statements for resources in the same Ontololgy namespace. For example, a foundation level graph with the base URI of \"http://www.somesite.com/1.0/schema/OurOntology\" may define general concepts for \"OurOntology\". Another graph with the base URI \"http://www.somesite.com/1.0/schema/level2/OurOntology\" may add more specific details to the same \"OurOntology\". Each of these two graphs would carry the same value for \"vaem:namespacePrefix\", for this example, perhaps, \"ourOntology\""
  {:db/ident :vaem/namespacePrefix,
   :dcterms/description
   "The property \"vaem:namespacePrefix\" specifes a short handle or label for the URI of an Ontology.  Multiple graphs can define statements for resources in the same Ontololgy namespace. For example, a foundation level graph with the base URI of \"http://www.somesite.com/1.0/schema/OurOntology\"  may define general  concepts for \"OurOntology\". Another graph with the base URI \"http://www.somesite.com/1.0/schema/level2/OurOntology\"  may add more specific details to the same \"OurOntology\". Each of these two graphs would carry the same value for \"vaem:namespacePrefix\", for this example, perhaps, \"ourOntology\"",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "namespace prefix",
   :rdfs/range :xsd/string})

(def ownedBy
  "The property \"vaem:ownedBy\" is a general property that in some cases could have scalar values or may refer to some concept of \"Party\". For this reason, the type of this property is set as \"rdf:Property\" and the property is rangeless. There are two sub-properties of \"vaem:ownedBy\", namely \"vaem:owner\" for string values and \"vaem:owningParty\" for referencing a party. Ownership applies to those ontologies that are proprietary"
  {:db/ident :vaem/ownedBy,
   :dcterms/description
   "The property \"vaem:ownedBy\" is a general property that in some cases could have scalar values or may refer to some concept of \"Party\".  For this reason, the  type of this property is set as \"rdf:Property\" and the property is rangeless. There are two sub-properties of \"vaem:ownedBy\", namely \"vaem:owner\" for string values and \"vaem:owningParty\" for referencing a party.  Ownership applies to those ontologies that are proprietary"})

(def owner
  "owner"
  {:db/ident         :vaem/owner,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label       "owner",
   :rdfs/range       :xsd/string})

(def owningParty
  "The property \"vaem:owningParty\" is used to refer to some concept of \"Party\" and is a sub-property of \"vaem:ownedBy\""
  {:db/ident :vaem/owningParty,
   :dcterms/description
   "The property \"vaem:owningParty\" is used to refer to some concept of \"Party\" and is a sub-property of \"vaem:ownedBy\""
   :rdf/type         :owl/DatatypeProperty})

(def previousPublishedVersion
  "The property \"vaem:previousPublishedVersion\"is a URL to documentation for the previous version of a graph."
  {:db/ident :vaem/previousPublishedVersion,
   :dcterms/description
   "The property \"vaem:previousPublishedVersion\"is a URL to documentation for the previous version of a graph.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "previous published version",
   :rdfs/range :xsd/anyURI})

(def rationale
  "A description of a justification for some other assertion or value"
  {:db/ident :vaem/rationale,
   :dcterms/description
   "A description of a justification for some other assertion or value",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "rationale",
   :rdfs/range :xsd/string})

(def rdfxmlFileURL
  "The property \"vaem:rdfxmlFileURL\" is used to provide a link to the location of the ontology's RDF/XML file"
  {:db/ident :vaem/rdfxmlFileURL,
   :dcterms/description
   "The property \"vaem:rdfxmlFileURL\" is used to provide a link to the location of the ontology's RDF/XML file",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "RDF/XML file URL",
   :rdfs/range :xsd/anyURI})

(def reifiableBy
  "To express how statements in a model can be reifiable, this property is used to explicitly associate a property with a user-defined sub-class of \"rdf:Statement\". A recommended way of using this is to declare the properties that share the same reification constructs as sub-properties of a parent property that carries the \"vaem:reifiableBy\" property. The parent property should be of type \"rdf:Property\" so that it can have both datatype and object properties as sub-properties. By this means use and transformations of a model can be understood through a fully specified metamodel. \"vaem:reifiableBy\" is rangeless in order to comply with OWL DL semantics. Its range would have been rdfs:Class in order to refer to \"rdf:Statement\" sub-classes"
  {:db/ident         :vaem/reifiableBy,
   :dcterms/description
   "To express how statements in a model can be reifiable, this property is used to explicitly associate a property with a user-defined sub-class of \"rdf:Statement\". A recommended way of using this is to declare the properties that share the same reification constructs as sub-properties of a parent property that carries the \"vaem:reifiableBy\" property. The parent property should be of type \"rdf:Property\" so that it can have both datatype and object properties as sub-properties. By this means use and transformations of a model can be understood through a fully specified metamodel. \"vaem:reifiableBy\" is rangeless in order to comply with OWL DL semantics. Its range would have been rdfs:Class in order to refer to \"rdf:Statement\" sub-classes",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label       "reifiable by"})

(def releaseDate
  "The property \"vaem:releaseDate\" is intended for general use as the name implies. The range of the property is set as \"vaem:dateUnion\" so as to allow a value to have a number of forms from a year only to a full timestamp"
  {:db/ident           :vaem/releaseDate,
   :dcterms/description
   "The property \"vaem:releaseDate\" is intended for general use as the name implies.  The range of the property is set as \"vaem:dateUnion\" so as to allow a value to have a number of forms from a  year only to a full timestamp",
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/isDefinedBy   ["http://www.linkedmodel.org/2.0/schema/vaem"
                        "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label         "release date",
   :rdfs/subPropertyOf [:vaem/date :vaem/releaseDate]})

(def revision
  "The property \"vaem:revision\" is a property intended for general use as the name implies."
  {:db/ident :vaem/revision,
   :dcterms/description
   "The property \"vaem:revision\" is a property intended for general use as the name implies.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "revision",
   :rdfs/range :xsd/string})

(def specificity
  "The property \"vaem:specificity\" is intended to specify the level of detail of an ontology. The values that can be set for this property are restriced to an integer from 1 to 5. An ontology at level 1 has concepts of more general applicability than one at level 5. By having graphs at different levels of specificity it is possible to support greater modularity for selective imports"
  {:db/ident :vaem/specificity,
   :dcterms/description
   "The property \"vaem:specificity\" is intended to specify the level of detail of an ontology.  The values that can be set for this property are restriced to an integer from 1 to 5. An ontology at level 1 has concepts of more general applicability than one at level 5. By having graphs at different levels of specificity it is possible to support greater modularity for selective imports",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "specificity",
   :rdfs/range :xsd/nonNegativeInteger})

(def title
  "title"
  {:db/ident         :vaem/title,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label       "title",
   :rdfs/range       :xsd/string})

(def todo
  "As it name implies, a way to attach an annotation about a \"todo\" task"
  {:db/ident :vaem/todo,
   :dcterms/description
   "As it name implies, a way to attach an annotation about a \"todo\" task",
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "todo",
   :rdfs/range :xsd/string})

(def turtleFileURL
  "The property \"vaem:turtleFileURL\" is used to provide a link to the location of the ontology's turtle file"
  {:db/ident :vaem/turtleFileURL,
   :dcterms/description
   "The property \"vaem:turtleFileURL\" is used to provide a link to the location of the ontology's turtle file",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "turtle file URL",
   :rdfs/range :xsd/anyURI})

(def url
  "The property \"vaem:url\" is intended for general use as the name implies. The range of the property is set as an XSD URI"
  {:db/ident :vaem/url,
   :dcterms/description
   "The property \"vaem:url\" is intended for general use as the name implies.  The range of the property is set as an XSD URI",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "url",
   :rdfs/range :xsd/anyURI})

(def usesNonImportedResource
  "The property \"vaem:usesNonImportedResource\" is used to express dependencies on resources from graphs that are not imported"
  {:db/ident :vaem/usesNonImportedResource,
   :dcterms/description
   "The property \"vaem:usesNonImportedResource\" is used to express dependencies on resources from graphs that are not imported",
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label "uses non-imported resource",
   :rdfs/range :rdfs/Resource})

(def withAttributionTo
  "The property \"vaem:withAttributionTo\" is an annotation property that is either used to hold either a string or a reference to an instance of \"voag:Attribution\", from the VOAG ontology"
  {:db/ident         :vaem/withAttributionTo,
   :dcterms/description
   "The property \"vaem:withAttributionTo\" is an annotation property that is either used to hold either a string or a reference to an instance of \"voag:Attribution\", from the VOAG ontology",
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/isDefinedBy ["http://www.linkedmodel.org/2.0/schema/vaem"
                      "http://www.linkedmodel.org/schema/vaem"],
   :rdfs/label       "with attribution to"})

(def ^{:private true} CC-SHAREALIKE_3PT0-US
  {:db/ident :voag/CC-SHAREALIKE_3PT0-US,
   :rdf/type :rdfs/Resource})
