(ns net.wikipunk.rdf.daq
  {:dc11/creator
   #{{:foaf/homepage {:xsd/anyURI "http://langec.wordpress.com/about/"},
      :foaf/name     "Christoph Lange",
      :rdfs/seeAlso  {:xsd/anyURI "http://purl.org/net/clange"}}
     {:foaf/homepage {:xsd/anyURI "http://www.jeremydebattista.info"},
      :foaf/mbox     {:xsd/anyURI "mailto:debattis@cs.uni-bonn.de"},
      :foaf/name     "Jeremy Debattista"}},
   :dc11/modified #inst "2015-04-01T00:00:00.000-00:00",
   :dcat/downloadURL
   "https://lov.linkeddata.es/dataset/lov/vocabs/daq/versions/2015-04-01.n3",
   :namespaces {"daq"  "http://purl.org/eis/vocab/daq#",
                "dc11" "http://purl.org/dc/terms/",
                "foaf" "http://xmlns.com/foaf/0.1/",
                "owl"  "http://www.w3.org/2002/07/owl#",
                "prov" "http://www.w3.org/ns/prov#",
                "qb"   "http://purl.org/linked-data/cube#",
                "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type #{:owl/Ontology :voaf/Vocabulary},
   :rdfa/prefix "daq",
   :rdfa/uri "http://purl.org/eis/vocab/daq#",
   :rdfs/comment
   "The Dataset Quality Vocabulary (daQ) is a lightweight, extensible core vocabulary for attaching the result of quality benchmarking of a linked open dataset (usually an expensive process) to that dataset.  daQ is designed to be extended by custom quality metrics.  Use cases include filtering and ranking datasets by quality.",
   :rdfs/label "Dataset Quality Vocabulary (daQ)",
   :xsd/anyURI "http://purl.org/eis/vocab/daq#"})

(def Category
  {:db/ident :daq/Category,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   "The highest level of quality metric is a category. A category groups a number of dimensions relevant to each other which aims at measuring the quality of a dataset from different aspects. Categories are provided as subclasses of this abstract class, which is not intended for direct usage.",
   :rdfs/label "Category"})

(def Dimension
  {:db/ident :daq/Dimension,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   "Each dimension is part of a larger group called category (See daq:Category). Each dimension has a number of metrics which are associated to it. A dimension is linked with a category using the daq:hasDimension property. Dimensions are provided as subclasses of this abstract class, which is not intended for direct usage.",
   :rdfs/label "Dimension"})

(def Metric
  {:db/ident :daq/Metric,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   "The smallest unit of measuring a quality dimension is a metric. A metric belongs to exactly one dimension. Each metric has one or more observations (\texttt{daq:hasObservation}), which records data quality assessment value following a computation. Metrics are provided as subclasses of this abstract class, which is not intended for direct usage.",
   :rdfs/label "Metric"})

(def Observation
  {:db/ident :daq/Observation,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   "A quality observation represents the statistical and provenance information of the attached metric's assessment activity.",
   :rdfs/label "Quality Observation",
   :rdfs/subClassOf #{:qb/Observation :prov/Entity}})

(def QualityGraph
  {:db/ident :daq/QualityGraph,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   "Defines a quality graph which will contain all metadata about quality metrics on the dataset.",
   :rdfs/label "Quality Graph Statistics",
   :rdfs/subClassOf #{:rdfg/Graph :qb/DataSet
                      {:owl/hasValue   :daq/dsd,
                       :owl/onProperty :qb/structure,
                       :rdf/type       :owl/Restriction}}})

(def computedBy
  {:db/ident     :daq/computedBy,
   :rdf/type     #{:owl/ObjectProperty :rdf/Property :qb/DimensionProperty},
   :rdfs/comment "TODO: Define properly",
   :rdfs/domain  :qb/Observation,
   :rdfs/label   "computed by"})

(def computedOn
  {:db/ident :daq/computedOn,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :qb/DimensionProperty},
   :rdfs/comment
   "Quality metrics can be (in principle) calculated on various forms of data (such as datasets, graphs, set of triples etc...). This vocabulary allow the owner/user of such RDF data to calculate metrics on multiple (and different) resources.",
   :rdfs/domain :qb/Observation,
   :rdfs/label "computed on",
   :rdfs/range :rdfs/Resource})

(def dsd
  {:db/ident :daq/dsd,
   :qb/component
   #{{:qb/dimension :daq/metric,
      :qb/order     1}
     {:qb/dimension :daq/computedOn,
      :qb/order     2} {:qb/measure :daq/value}
     {:qb/attribute
      {:xsd/anyURI
       "http://purl.org/linked-data/sdmx/2009/attribute#unitMeasure"},
      :qb/componentAttachment :qb/DataSet,
      :qb/componentRequired true}
     {:qb/dimension
      {:xsd/anyURI
       "http://purl.org/linked-data/sdmx/2009/dimension#timePeriod"},
      :qb/order 3}},
   :rdf/type :qb/DataStructureDefinition})

(def expectedDataType
  {:db/ident :daq/expectedDataType,
   :owl/cardinality 1,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment
   "Each metric should have an expect data type for it's observed value (e.g. xsd:boolean, xsd:double etc...)",
   :rdfs/domain :daq/Metric,
   :rdfs/label "expected data type",
   :rdfs/range :xsd/anySimpleType})

(def hasDimension
  {:db/ident :daq/hasDimension,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   "The category concept classifies dimensions related to the measurement of quality for a specific criteria. This is an abstract property and should not be used directly. Specific sub-properties should be inherited for different dimensions.",
   :rdfs/domain :daq/Category,
   :rdfs/label "hasDimension",
   :rdfs/range :daq/Dimension})

(def hasMetric
  {:db/ident :daq/hasMetric,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   "A dimension is an abstract concept which groups an number of more concrete metrics to measure quality of a dataset. This is an abstract property and should not be used directly. Specific sub-properties should be inherited for different metrics.",
   :rdfs/domain :daq/Dimension,
   :rdfs/label "hasMetric",
   :rdfs/range :daq/Metric})

(def hasObservation
  {:db/ident :daq/hasObservation,
   :owl/inverseOf :daq/metric,
   :owl/minCardinality 1,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment
   "Computed metrics can have 1 or more quality observations, where each computed resource has one observation.",
   :rdfs/domain :daq/Metric,
   :rdfs/label "has observation",
   :rdfs/range :daq/Observation})

(def isEstimate
  {:db/ident :daq/isEstimate,
   :owl/cardinality 1,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   "This property flags true if an assessed observation of a metric gives an estimate result instead of a more accurate one.",
   :rdfs/domain :qb/Observation,
   :rdfs/label "is estimate",
   :rdfs/range :xsd/boolean})

(def metric
  {:db/ident           :daq/metric,
   :owl/inverseOf      :daq/hasObservation,
   :owl/minCardinality 1,
   :rdf/type           #{:owl/DatatypeProperty :rdf/Property
                         :qb/DimensionProperty},
   :rdfs/comment       "Represents the metric being observed.",
   :rdfs/domain        :qb/Observation,
   :rdfs/label         "metric",
   :rdfs/range         :daq/Metric})

(def requires
  {:db/ident :daq/requires,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   "A metric might require a number of external resources (e.g. a gold standard) in order to be able to measure the quality. In order to cater for the most generic requirement, this property links a metric to the required resource (e.g. a URI to the gold standard dataset used).",
   :rdfs/domain :daq/Metric,
   :rdfs/label "requires",
   :rdfs/range :rdfs/Resource})

(def value
  {:db/ident :daq/value,
   :owl/cardinality 1,
   :rdf/type #{:qb/MeasureProperty :owl/DatatypeProperty :rdf/Property},
   :rdfs/comment
   "Each metric will have a value computed. In order to deal with the different return type of the metric computation, this property links a metric with a value object (e.g. boolean, double, Literal).",
   :rdfs/domain :qb/Observation,
   :rdfs/label "value"})

(def urn:uuid:2ad90ba2-2628-5e8d-a55d-ac32e73f0956
  {:dc11/creator
   #{{:foaf/homepage {:xsd/anyURI "http://langec.wordpress.com/about/"},
      :foaf/name     "Christoph Lange",
      :rdfs/seeAlso  {:xsd/anyURI "http://purl.org/net/clange"}}
     {:foaf/homepage {:xsd/anyURI "http://www.jeremydebattista.info"},
      :foaf/mbox     {:xsd/anyURI "mailto:debattis@cs.uni-bonn.de"},
      :foaf/name     "Jeremy Debattista"}},
   :dc11/modified #inst "2015-04-01T00:00:00.000-00:00",
   :rdf/type #{:owl/Ontology :voaf/Vocabulary},
   :rdfs/comment
   "The Dataset Quality Vocabulary (daQ) is a lightweight, extensible core vocabulary for attaching the result of quality benchmarking of a linked open dataset (usually an expensive process) to that dataset.  daQ is designed to be extended by custom quality metrics.  Use cases include filtering and ranking datasets by quality.",
   :rdfs/label "Dataset Quality Vocabulary (daQ)",
   :xsd/anyURI "http://purl.org/eis/vocab/daq#"})

(def urn:uuid:a806ffe3-2b49-5c34-9970-d403bd567f21
  {:owl/cardinality 1,
   :rdfs/domain :qb/Observation,
   :rdfs/range :xsd/dateTime,
   :xsd/anyURI "http://purl.org/linked-data/sdmx/2009/dimension#timePeriod"})