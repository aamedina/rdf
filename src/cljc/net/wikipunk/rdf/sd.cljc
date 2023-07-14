(ns net.wikipunk.rdf.sd
  {:dcat/downloadURL  "https://www.w3.org/ns/sparql-service-description.ttl",
   :rdf/ns-prefix-map {"owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "sd" "http://www.w3.org/ns/sparql-service-description#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "sd",
   :rdfa/uri          "http://www.w3.org/ns/sparql-service-description#",
   :rdfs/isDefinedBy  {:rdfa/uri
                       "http://www.w3.org/TR/sparql11-service-description/"}}
  (:refer-clojure :exclude [name]))

(def Aggregate
  "An instance of sd:Aggregate represents an aggregate that may be used in a SPARQL aggregate query (for instance in a HAVING clause or SELECT expression) besides the standard list of supported aggregates COUNT, SUM, MIN, MAX, AVG, GROUP_CONCAT, and SAMPLE."
  {:db/ident :sd/Aggregate,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "An instance of sd:Aggregate represents an aggregate that may be used in a SPARQL aggregate query (for instance in a HAVING clause or SELECT expression) besides the standard list of supported aggregates COUNT, SUM, MIN, MAX, AVG, GROUP_CONCAT, and SAMPLE.",
   :rdfs/label #xsd/string "Aggregate",
   :rdfs/subClassOf [:sd/Feature :rdfs/Resource]})

(def BasicFederatedQuery
  "sd:BasicFederatedQuery, when used as the object of the sd:feature property, indicates that the SPARQL service supports basic federated query using the SERVICE keyword as defined by SPARQL 1.1 Federation Extensions."
  {:db/ident :sd/BasicFederatedQuery,
   :rdf/type [:sd/Feature :rdfs/Resource],
   :rdfs/comment
   #xsd/string
    "sd:BasicFederatedQuery, when used as the object of the sd:feature property, indicates that the SPARQL service supports basic federated query using the SERVICE keyword as defined by SPARQL 1.1 Federation Extensions.",
   :rdfs/label #xsd/string "Basic Federated Query"})

(def Dataset
  "An instance of sd:Dataset represents a RDF Dataset comprised of a default graph and zero or more named graphs."
  {:db/ident :sd/Dataset,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "An instance of sd:Dataset represents a RDF Dataset comprised of a default graph and zero or more named graphs.",
   :rdfs/label #xsd/string "Dataset",
   :rdfs/subClassOf [:rdfs/Resource :sd/GraphCollection]})

(def DereferencesURIs
  "sd:DereferencesURIs, when used as the object of the sd:feature property, indicates that a SPARQL service will dereference URIs used in FROM/FROM NAMED and USING/USING NAMED clauses and use the resulting RDF in the dataset during query evaluation."
  {:db/ident :sd/DereferencesURIs,
   :rdf/type [:sd/Feature :rdfs/Resource],
   :rdfs/comment
   #xsd/string
    "sd:DereferencesURIs, when used as the object of the sd:feature property, indicates that a SPARQL service will dereference URIs used in FROM/FROM NAMED and USING/USING NAMED clauses and use the resulting RDF in the dataset during query evaluation.",
   :rdfs/label #xsd/string "Dereferences URIs"})

(def EmptyGraphs
  "sd:EmptyGraphs, when used as the object of the sd:feature property, indicates that the underlying graph store supports empty graphs. A graph store that supports empty graphs MUST NOT remove graphs that are left empty after triples are removed from them."
  {:db/ident :sd/EmptyGraphs,
   :rdf/type [:sd/Feature :rdfs/Resource],
   :rdfs/comment
   #xsd/string
    "sd:EmptyGraphs, when used as the object of the sd:feature property, indicates that the underlying graph store supports empty graphs. A graph store that supports empty graphs MUST NOT remove graphs that are left empty after triples are removed from them.",
   :rdfs/label #xsd/string "Empty Graphs"})

(def EntailmentProfile
  "An instance of sd:EntailmentProfile represents a profile of an entailment regime. An entailment profile MAY impose restrictions on what constitutes valid RDF with respect to entailment."
  {:db/ident :sd/EntailmentProfile,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "An instance of sd:EntailmentProfile represents a profile of an entailment regime. An entailment profile MAY impose restrictions on what constitutes valid RDF with respect to entailment.",
   :rdfs/label #xsd/string "Entailment Profile",
   :rdfs/subClassOf [:sd/Feature :rdfs/Resource]})

(def EntailmentRegime
  "An instance of sd:EntailmentRegime represents an entailment regime used in basic graph pattern matching (as described by SPARQL 1.1 Query Language)."
  {:db/ident :sd/EntailmentRegime,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "An instance of sd:EntailmentRegime represents an entailment regime used in basic graph pattern matching (as described by SPARQL 1.1 Query Language).",
   :rdfs/label #xsd/string "Entailment Regime",
   :rdfs/subClassOf [:rdfs/Resource :sd/Feature]})

(def Feature
  "An instance of sd:Feature represents a feature of a SPARQL service. Specific types of features include functions, aggregates, languages, and entailment regimes and profiles. This document defines five instances of sd:Feature: sd:DereferencesURIs, sd:UnionDefaultGraph, sd:RequiresDataset, sd:EmptyGraphs, and sd:BasicFederatedQuery."
  {:db/ident :sd/Feature,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "An instance of sd:Feature represents a feature of a SPARQL service. Specific types of features include functions, aggregates, languages, and entailment regimes and profiles. This document defines five instances of sd:Feature: sd:DereferencesURIs, sd:UnionDefaultGraph, sd:RequiresDataset, sd:EmptyGraphs, and sd:BasicFederatedQuery.",
   :rdfs/label #xsd/string "Feature",
   :rdfs/subClassOf :rdfs/Resource})

(def Function
  "An instance of sd:Function represents a function that may be used in a SPARQL SELECT expression or a FILTER, HAVING, GROUP BY, ORDER BY, or BIND clause."
  {:db/ident :sd/Function,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "An instance of sd:Function represents a function that may be used in a SPARQL SELECT expression or a FILTER, HAVING, GROUP BY, ORDER BY, or BIND clause.",
   :rdfs/label #xsd/string "Function",
   :rdfs/subClassOf [:rdfs/Resource :sd/Feature]})

(def Graph
  "An instance of sd:Graph represents the description of an RDF graph."
  {:db/ident :sd/Graph,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "An instance of sd:Graph represents the description of an RDF graph.",
   :rdfs/label #xsd/string "Graph",
   :rdfs/subClassOf :rdfs/Resource})

(def GraphCollection
  "An instance of sd:GraphCollection represents a collection of zero or more named graph descriptions. Each named graph description belonging to an sd:GraphCollection MUST be linked with the sd:namedGraph predicate."
  {:db/ident :sd/GraphCollection,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "An instance of sd:GraphCollection represents a collection of zero or more named graph descriptions. Each named graph description belonging to an sd:GraphCollection MUST be linked with the sd:namedGraph predicate.",
   :rdfs/label #xsd/string "Graph Collection",
   :rdfs/subClassOf :rdfs/Resource})

(def Language
  "An instance of sd:Language represents one of the SPARQL languages, including specific configurations providing particular features or extensions. This document defines three instances of sd:Language: sd:SPARQL10Query, sd:SPARQL11Query, and sd:SPARQL11Update."
  {:db/ident :sd/Language,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "An instance of sd:Language represents one of the SPARQL languages, including specific configurations providing particular features or extensions. This document defines three instances of sd:Language: sd:SPARQL10Query, sd:SPARQL11Query, and sd:SPARQL11Update.",
   :rdfs/label #xsd/string "Language",
   :rdfs/subClassOf [:sd/Feature :rdfs/Resource]})

(def NamedGraph
  "An instance of sd:NamedGraph represents a named graph having a name (via sd:name) and an optional graph description (via sd:graph)."
  {:db/ident :sd/NamedGraph,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "An instance of sd:NamedGraph represents a named graph having a name (via sd:name) and an optional graph description (via sd:graph).",
   :rdfs/label #xsd/string "Named Graph",
   :rdfs/subClassOf :rdfs/Resource})

(def RequiresDataset
  "sd:RequiresDataset, when used as the object of the sd:feature property, indicates that the SPARQL service requires an explicit dataset declaration (based on either FROM/FROM NAMED clauses in a query, USING/USING NAMED clauses in an update, or the appropriate SPARQL Protocol parameters)."
  {:db/ident :sd/RequiresDataset,
   :rdf/type [:sd/Feature :rdfs/Resource],
   :rdfs/comment
   #xsd/string
    "sd:RequiresDataset, when used as the object of the sd:feature property, indicates that the SPARQL service requires an explicit dataset declaration (based on either FROM/FROM NAMED clauses in a query, USING/USING NAMED clauses in an update, or the appropriate SPARQL Protocol parameters).",
   :rdfs/label #xsd/string "Requires Dataset"})

(def SPARQL10Query
  "sd:SPARQL10Query is an sd:Language representing the SPARQL 1.0 Query language."
  {:db/ident :sd/SPARQL10Query,
   :rdf/type [:sd/Language :rdfs/Resource :sd/Feature],
   :rdfs/comment
   #xsd/string
    "sd:SPARQL10Query is an sd:Language representing the SPARQL 1.0 Query language.",
   :rdfs/label #xsd/string "SPARQL 1.0 Query"})

(def SPARQL11Query
  "sd:SPARQL11Query is an sd:Language representing the SPARQL 1.1 Query language."
  {:db/ident :sd/SPARQL11Query,
   :rdf/type [:sd/Language :rdfs/Resource :sd/Feature],
   :rdfs/comment
   #xsd/string
    "sd:SPARQL11Query is an sd:Language representing the SPARQL 1.1 Query language.",
   :rdfs/label #xsd/string "SPARQL 1.1 Query"})

(def SPARQL11Update
  "sd:SPARQLUpdate is an sd:Language representing the SPARQL 1.1 Update language."
  {:db/ident :sd/SPARQL11Update,
   :rdf/type [:sd/Language :rdfs/Resource :sd/Feature],
   :rdfs/comment
   #xsd/string
    "sd:SPARQLUpdate is an sd:Language representing the SPARQL 1.1 Update language.",
   :rdfs/label #xsd/string "SPARQL 1.1 Update"})

(def Service
  "An instance of sd:Service represents a SPARQL service made available via the SPARQL Protocol."
  {:db/ident :sd/Service,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #xsd/string
    "An instance of sd:Service represents a SPARQL service made available via the SPARQL Protocol.",
   :rdfs/label #xsd/string "Service",
   :rdfs/subClassOf :rdfs/Resource})

(def UnionDefaultGraph
  "sd:UnionDefaultGraph, when used as the object of the sd:feature property, indicates that the default graph of the dataset used during query and update evaluation (when an explicit dataset is not specified) is comprised of the union of all the named graphs in that dataset."
  {:db/ident :sd/UnionDefaultGraph,
   :rdf/type [:sd/Feature :rdfs/Resource],
   :rdfs/comment
   #xsd/string
    "sd:UnionDefaultGraph, when used as the object of the sd:feature property, indicates that the default graph of the dataset used during query and update evaluation (when an explicit dataset is not specified) is comprised of the union of all the named graphs in that dataset.",
   :rdfs/label #xsd/string "Union Default Graph"})

(def availableGraphs
  "Relates an instance of sd:Service to a description of the graphs which are allowed in the construction of a dataset either via the SPARQL Protocol, with FROM/FROM NAMED clauses in a query, or with USING/USING NAMED in an update request, if the service limits the scope of dataset construction."
  {:db/ident :sd/availableGraphs,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Relates an instance of sd:Service to a description of the graphs which are allowed in the construction of a dataset either via the SPARQL Protocol, with FROM/FROM NAMED clauses in a query, or with USING/USING NAMED in an update request, if the service limits the scope of dataset construction.",
   :rdfs/domain :sd/Service,
   :rdfs/label #xsd/string "available graph descriptions",
   :rdfs/range :sd/GraphCollection})

(def defaultDataset
  "Relates an instance of sd:Service to a description of the default dataset available when no explicit dataset is specified in the query, update request or via protocol parameters."
  {:db/ident :sd/defaultDataset,
   :rdf/type [:owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/comment
   #xsd/string
    "Relates an instance of sd:Service to a description of the default dataset available when no explicit dataset is specified in the query, update request or via protocol parameters.",
   :rdfs/domain :sd/Service,
   :rdfs/label #xsd/string "default dataset description",
   :rdfs/range :sd/Dataset})

(def defaultEntailmentRegime
  "Relates an instance of sd:Service with a resource representing an entailment regime used for basic graph pattern matching. This property is intended for use when a single entailment regime by default applies to all graphs in the default dataset of the service. In situations where a different entailment regime applies to a specific graph in the dataset, the sd:entailmentRegime property should be used to indicate this fact in the description of that graph."
  {:db/ident :sd/defaultEntailmentRegime,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Relates an instance of sd:Service with a resource representing an entailment regime used for basic graph pattern matching. This property is intended for use when a single entailment regime by default applies to all graphs in the default dataset of the service. In situations where a different entailment regime applies to a specific graph in the dataset, the sd:entailmentRegime property should be used to indicate this fact in the description of that graph.",
   :rdfs/domain :sd/Service,
   :rdfs/label #xsd/string "default entailment regime",
   :rdfs/range :sd/EntailmentRegime,
   :rdfs/subPropertyOf :sd/feature})

(def defaultGraph
  "Relates an instance of sd:Dataset to the description of its default graph."
  {:db/ident :sd/defaultGraph,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Relates an instance of sd:Dataset to the description of its default graph.",
   :rdfs/domain :sd/Dataset,
   :rdfs/label #xsd/string "default graph",
   :rdfs/range :sd/Graph})

(def defaultSupportedEntailmentProfile
  "Relates an instance of sd:Service with a resource representing a supported profile of the default entailment regime (as declared by sd:defaultEntailmentRegime)."
  {:db/ident :sd/defaultSupportedEntailmentProfile,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Relates an instance of sd:Service with a resource representing a supported profile of the default entailment regime (as declared by sd:defaultEntailmentRegime).",
   :rdfs/domain :sd/Service,
   :rdfs/label #xsd/string "default supported entailment profile",
   :rdfs/range :sd/EntailmentProfile,
   :rdfs/subPropertyOf :sd/feature})

(def endpoint
  "The SPARQL endpoint of an sd:Service that implements the SPARQL Protocol service. The object of the sd:endpoint property is an IRI."
  {:db/ident :sd/endpoint,
   :rdf/type [:owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/comment
   #xsd/string
    "The SPARQL endpoint of an sd:Service that implements the SPARQL Protocol service. The object of the sd:endpoint property is an IRI.",
   :rdfs/domain :sd/Service,
   :rdfs/label #xsd/string "endpoint"})

(def entailmentRegime
  "Relates a named graph description with a resource representing an entailment regime used for basic graph pattern matching over that graph."
  {:db/ident :sd/entailmentRegime,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Relates a named graph description with a resource representing an entailment regime used for basic graph pattern matching over that graph.",
   :rdfs/domain :sd/NamedGraph,
   :rdfs/label #xsd/string "entailment regime",
   :rdfs/range :sd/EntailmentRegime})

(def extensionAggregate
  "Relates an instance of sd:Service to an aggregate that may be used in a SPARQL aggregate query (for instance in a HAVING clause or SELECT expression) besides the standard list of supported aggregates COUNT, SUM, MIN, MAX, AVG, GROUP_CONCAT, and SAMPLE"
  {:db/ident :sd/extensionAggregate,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Relates an instance of sd:Service to an aggregate that may be used in a SPARQL aggregate query (for instance in a HAVING clause or SELECT expression) besides the standard list of supported aggregates COUNT, SUM, MIN, MAX, AVG, GROUP_CONCAT, and SAMPLE",
   :rdfs/domain :sd/Service,
   :rdfs/label #xsd/string "extension aggregate",
   :rdfs/range :sd/Aggregate,
   :rdfs/subPropertyOf :sd/feature})

(def extensionFunction
  "Relates an instance of sd:Service to a function that may be used in a SPARQL SELECT expression or a FILTER, HAVING, GROUP BY, ORDER BY, or BIND clause."
  {:db/ident :sd/extensionFunction,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Relates an instance of sd:Service to a function that may be used in a SPARQL SELECT expression or a FILTER, HAVING, GROUP BY, ORDER BY, or BIND clause.",
   :rdfs/domain :sd/Service,
   :rdfs/label #xsd/string "extension function",
   :rdfs/range :sd/Function,
   :rdfs/subPropertyOf :sd/feature})

(def feature
  "Relates an instance of sd:Service with a resource representing a supported feature."
  {:db/ident :sd/feature,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Relates an instance of sd:Service with a resource representing a supported feature.",
   :rdfs/domain :sd/Service,
   :rdfs/label #xsd/string "feature",
   :rdfs/range :sd/Feature})

(def graph
  "Relates a named graph to its graph description."
  {:db/ident     :sd/graph,
   :rdf/type     :rdf/Property,
   :rdfs/comment #xsd/string "Relates a named graph to its graph description.",
   :rdfs/domain  :sd/NamedGraph,
   :rdfs/label   #xsd/string "graph",
   :rdfs/range   :sd/Graph})

(def inputFormat
  "Relates an instance of sd:Service to a format that is supported for parsing RDF input; for example, via a SPARQL 1.1 Update LOAD statement, or when URIs are dereferenced in FROM/FROM NAMED/USING/USING NAMED clauses."
  {:db/ident :sd/inputFormat,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Relates an instance of sd:Service to a format that is supported for parsing RDF input; for example, via a SPARQL 1.1 Update LOAD statement, or when URIs are dereferenced in FROM/FROM NAMED/USING/USING NAMED clauses.",
   :rdfs/domain :sd/Service,
   :rdfs/label #xsd/string "input format",
   :rdfs/range :formats/Format})

(def languageExtension
  "Relates an instance of sd:Service to a resource representing an implemented extension to the SPARQL Query or Update language."
  {:db/ident :sd/languageExtension,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Relates an instance of sd:Service to a resource representing an implemented extension to the SPARQL Query or Update language.",
   :rdfs/domain :sd/Service,
   :rdfs/label #xsd/string "language extension",
   :rdfs/range :sd/Feature,
   :rdfs/subPropertyOf :sd/feature})

(def name
  "Relates a named graph to the name by which it may be referenced in a FROM/FROM NAMED clause. The object of the sd:name property is an IRI."
  {:db/ident :sd/name,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Relates a named graph to the name by which it may be referenced in a FROM/FROM NAMED clause. The object of the sd:name property is an IRI.",
   :rdfs/domain :sd/NamedGraph,
   :rdfs/label #xsd/string "name"})

(def namedGraph
  "Relates an instance of sd:GraphCollection (or its subclass sd:Dataset) to the description of one of its named graphs. The description of such a named graph MUST include the sd:name property and MAY include the sd:graph property."
  {:db/ident :sd/namedGraph,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Relates an instance of sd:GraphCollection (or its subclass sd:Dataset) to the description of one of its named graphs. The description of such a named graph MUST include the sd:name property and MAY include the sd:graph property.",
   :rdfs/domain :sd/GraphCollection,
   :rdfs/label #xsd/string "named graph",
   :rdfs/range :sd/NamedGraph})

(def propertyFeature
  "Relates an instance of sd:Service to a resource representing an implemented feature that extends the SPARQL Query or Update language and that is accessed by using the named property."
  {:db/ident :sd/propertyFeature,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Relates an instance of sd:Service to a resource representing an implemented feature that extends the SPARQL Query or Update language and that is accessed by using the named property.",
   :rdfs/domain :sd/Service,
   :rdfs/label #xsd/string "property feature",
   :rdfs/range :sd/Feature,
   :rdfs/subPropertyOf :sd/feature})

(def resultFormat
  "Relates an instance of sd:Service to a format that is supported for serializing query results."
  {:db/ident :sd/resultFormat,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Relates an instance of sd:Service to a format that is supported for serializing query results.",
   :rdfs/domain :sd/Service,
   :rdfs/label #xsd/string "result format",
   :rdfs/range :formats/Format})

(def supportedEntailmentProfile
  "Relates a named graph description with a resource representing a supported profile of the entailment regime (as declared by sd:entailmentRegime) used for basic graph pattern matching over that graph."
  {:db/ident :sd/supportedEntailmentProfile,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Relates a named graph description with a resource representing a supported profile of the entailment regime (as declared by sd:entailmentRegime) used for basic graph pattern matching over that graph.",
   :rdfs/domain :sd/NamedGraph,
   :rdfs/label #xsd/string "supported entailment profile",
   :rdfs/range :sd/EntailmentProfile})

(def supportedLanguage
  "Relates an instance of sd:Service to a SPARQL language (e.g. Query and Update) that it implements."
  {:db/ident :sd/supportedLanguage,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/string
    "Relates an instance of sd:Service to a SPARQL language (e.g. Query and Update) that it implements.",
   :rdfs/domain :sd/Service,
   :rdfs/label #xsd/string "supported language",
   :rdfs/range :sd/Language,
   :rdfs/subPropertyOf :sd/feature})