(ns net.wikipunk.rdf.daq
  "The Dataset Quality Vocabulary (daQ) is a lightweight, extensible core vocabulary for attaching the result of quality benchmarking of a linked open dataset (usually an expensive process) to that dataset.  daQ is designed to be extended by custom quality metrics.  Use cases include filtering and ranking datasets by quality."
  {:dc11/creator
   [{:foaf/homepage {:rdfa/uri "http://langec.wordpress.com/about/"},
     :foaf/name     #xsd/string "Christoph Lange",
     :rdfs/seeAlso  {:rdfa/uri "http://purl.org/net/clange"}}
    {:foaf/homepage {:rdfa/uri "http://www.jeremydebattista.info"},
     :foaf/mbox     {:rdfa/uri "mailto:debattis@cs.uni-bonn.de"},
     :foaf/name     #xsd/string "Jeremy Debattista"}],
   :dc11/modified #xsd/date #inst "2015-04-01T00:00:00.000-04:00",
   :dcat/downloadURL
   "https://lov.linkeddata.es/dataset/lov/vocabs/daq/versions/2015-04-01.n3",
   :rdf/ns-prefix-map {"daq"  "http://purl.org/eis/vocab/daq#",
                       "dc11" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "prov" "http://www.w3.org/ns/prov#",
                       "qb"   "http://purl.org/linked-data/cube#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type [:voaf/Vocabulary :owl/Ontology],
   :rdfa/prefix "daq",
   :rdfa/uri "http://purl.org/eis/vocab/daq#",
   :rdfs/comment
   #xsd/string
    "The Dataset Quality Vocabulary (daQ) is a lightweight, extensible core vocabulary for attaching the result of quality benchmarking of a linked open dataset (usually an expensive process) to that dataset.  daQ is designed to be extended by custom quality metrics.  Use cases include filtering and ranking datasets by quality.",
   :rdfs/label #xsd/string "Dataset Quality Vocabulary (daQ)"})

(def Category
  "The highest level of quality metric is a category. A category groups a number of dimensions relevant to each other which aims at measuring the quality of a dataset from different aspects. Categories are provided as subclasses of this abstract class, which is not intended for direct usage."
  {:db/ident :daq/Category,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/string
    "The highest level of quality metric is a category. A category groups a number of dimensions relevant to each other which aims at measuring the quality of a dataset from different aspects. Categories are provided as subclasses of this abstract class, which is not intended for direct usage.",
   :rdfs/label #xsd/string "Category",
   :rdfs/subClassOf :rdfs/Resource})

(def Dimension
  "Each dimension is part of a larger group called category (See daq:Category). Each dimension has a number of metrics which are associated to it. A dimension is linked with a category using the daq:hasDimension property. Dimensions are provided as subclasses of this abstract class, which is not intended for direct usage."
  {:db/ident :daq/Dimension,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/string
    "Each dimension is part of a larger group called category (See daq:Category). Each dimension has a number of metrics which are associated to it. A dimension is linked with a category using the daq:hasDimension property. Dimensions are provided as subclasses of this abstract class, which is not intended for direct usage.",
   :rdfs/label #xsd/string "Dimension",
   :rdfs/subClassOf :rdfs/Resource})

(def Metric
  "The smallest unit of measuring a quality dimension is a metric. A metric belongs to exactly one dimension. Each metric has one or more observations (\texttt{daq:hasObservation}), which records data quality assessment value following a computation. Metrics are provided as subclasses of this abstract class, which is not intended for direct usage."
  {:db/ident :daq/Metric,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/string
    "The smallest unit of measuring a quality dimension is a metric. A metric belongs to exactly one dimension. Each metric has one or more observations (\texttt{daq:hasObservation}), which records data quality assessment value following a computation. Metrics are provided as subclasses of this abstract class, which is not intended for direct usage.",
   :rdfs/label #xsd/string "Metric",
   :rdfs/subClassOf :rdfs/Resource})

(def Observation
  "A quality observation represents the statistical and provenance information of the attached metric's assessment activity."
  {:db/ident :daq/Observation,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/string
    "A quality observation represents the statistical and provenance information of the attached metric's assessment activity.",
   :rdfs/label #xsd/string "Quality Observation",
   :rdfs/subClassOf [:rdfs/Resource :qb/Observation :prov/Entity]})

(def QualityGraph
  "Defines a quality graph which will contain all metadata about quality metrics on the dataset."
  {:db/ident :daq/QualityGraph,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/string
    "Defines a quality graph which will contain all metadata about quality metrics on the dataset.",
   :rdfs/label #xsd/string "Quality Graph Statistics",
   :rdfs/subClassOf [:rdfs/Resource
                     {:owl/hasValue   :daq/dsd,
                      :owl/onProperty :qb/structure,
                      :rdf/type       :owl/Restriction}
                     :qb/DataSet
                     :rdfg/Graph]})

(def computedBy
  "TODO: Define properly"
  {:db/ident     :daq/computedBy,
   :rdf/type     [:qb/DimensionProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment #xsd/string "TODO: Define properly",
   :rdfs/domain  :qb/Observation,
   :rdfs/label   #xsd/string "computed by"})

(def computedOn
  "Quality metrics can be (in principle) calculated on various forms of data (such as datasets, graphs, set of triples etc...). This vocabulary allow the owner/user of such RDF data to calculate metrics on multiple (and different) resources."
  {:db/ident :daq/computedOn,
   :rdf/type [:qb/DimensionProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/string
    "Quality metrics can be (in principle) calculated on various forms of data (such as datasets, graphs, set of triples etc...). This vocabulary allow the owner/user of such RDF data to calculate metrics on multiple (and different) resources.",
   :rdfs/domain :qb/Observation,
   :rdfs/label #xsd/string "computed on",
   :rdfs/range :rdfs/Resource})

(def dsd
  {:db/ident :daq/dsd,
   :qb/component
   [{:qb/attribute
     {:rdfa/uri "http://purl.org/linked-data/sdmx/2009/attribute#unitMeasure"},
     :qb/componentAttachment :qb/DataSet,
     :qb/componentRequired #xsd/boolean true}
    {:qb/measure :daq/value}
    {:qb/dimension
     {:rdfa/uri "http://purl.org/linked-data/sdmx/2009/dimension#timePeriod"},
     :qb/order #xsd/integer 3}
    {:qb/dimension :daq/computedOn,
     :qb/order     #xsd/integer 2}
    {:qb/dimension :daq/metric,
     :qb/order     #xsd/integer 1}],
   :rdf/type :qb/DataStructureDefinition})

(def expectedDataType
  "Each metric should have an expect data type for it's observed value (e.g. xsd:boolean, xsd:double etc...)"
  {:db/ident :daq/expectedDataType,
   :owl/cardinality #xsd/nonNegativeInteger 1,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   #xsd/string
    "Each metric should have an expect data type for it's observed value (e.g. xsd:boolean, xsd:double etc...)",
   :rdfs/domain :daq/Metric,
   :rdfs/label #xsd/string "expected data type",
   :rdfs/range :xsd/anySimpleType})

(def hasDimension
  "The category concept classifies dimensions related to the measurement of quality for a specific criteria. This is an abstract property and should not be used directly. Specific sub-properties should be inherited for different dimensions."
  {:db/ident :daq/hasDimension,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/string
    "The category concept classifies dimensions related to the measurement of quality for a specific criteria. This is an abstract property and should not be used directly. Specific sub-properties should be inherited for different dimensions.",
   :rdfs/domain :daq/Category,
   :rdfs/label #xsd/string "hasDimension",
   :rdfs/range :daq/Dimension})

(def hasMetric
  "A dimension is an abstract concept which groups an number of more concrete metrics to measure quality of a dataset. This is an abstract property and should not be used directly. Specific sub-properties should be inherited for different metrics."
  {:db/ident :daq/hasMetric,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/string
    "A dimension is an abstract concept which groups an number of more concrete metrics to measure quality of a dataset. This is an abstract property and should not be used directly. Specific sub-properties should be inherited for different metrics.",
   :rdfs/domain :daq/Dimension,
   :rdfs/label #xsd/string "hasMetric",
   :rdfs/range :daq/Metric})

(def hasObservation
  "Computed metrics can have 1 or more quality observations, where each computed resource has one observation."
  {:db/ident :daq/hasObservation,
   :owl/inverseOf :daq/metric,
   :owl/minCardinality #xsd/nonNegativeInteger 1,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   #xsd/string
    "Computed metrics can have 1 or more quality observations, where each computed resource has one observation.",
   :rdfs/domain :daq/Metric,
   :rdfs/label #xsd/string "has observation",
   :rdfs/range :daq/Observation})

(def isEstimate
  "This property flags true if an assessed observation of a metric gives an estimate result instead of a more accurate one."
  {:db/ident :daq/isEstimate,
   :owl/cardinality #xsd/nonNegativeInteger 1,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/string
    "This property flags true if an assessed observation of a metric gives an estimate result instead of a more accurate one.",
   :rdfs/domain :qb/Observation,
   :rdfs/label #xsd/string "is estimate",
   :rdfs/range :xsd/boolean})

(def metric
  "Represents the metric being observed."
  {:db/ident           :daq/metric,
   :owl/inverseOf      :daq/hasObservation,
   :owl/minCardinality #xsd/nonNegativeInteger 1,
   :rdf/type           [:qb/DimensionProperty
                        :owl/DatatypeProperty
                        :rdf/Property],
   :rdfs/comment       #xsd/string "Represents the metric being observed.",
   :rdfs/domain        :qb/Observation,
   :rdfs/label         #xsd/string "metric",
   :rdfs/range         :daq/Metric})

(def requires
  "A metric might require a number of external resources (e.g. a gold standard) in order to be able to measure the quality. In order to cater for the most generic requirement, this property links a metric to the required resource (e.g. a URI to the gold standard dataset used)."
  {:db/ident :daq/requires,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/string
    "A metric might require a number of external resources (e.g. a gold standard) in order to be able to measure the quality. In order to cater for the most generic requirement, this property links a metric to the required resource (e.g. a URI to the gold standard dataset used).",
   :rdfs/domain :daq/Metric,
   :rdfs/label #xsd/string "requires",
   :rdfs/range :rdfs/Resource})

(def value
  "Each metric will have a value computed. In order to deal with the different return type of the metric computation, this property links a metric with a value object (e.g. boolean, double, Literal)."
  {:db/ident :daq/value,
   :owl/cardinality #xsd/nonNegativeInteger 1,
   :rdf/type [:qb/MeasureProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   #xsd/string
    "Each metric will have a value computed. In order to deal with the different return type of the metric computation, this property links a metric with a value object (e.g. boolean, double, Literal).",
   :rdfs/domain :qb/Observation,
   :rdfs/label #xsd/string "value"})