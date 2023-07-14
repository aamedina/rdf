(ns net.wikipunk.rdf.dqv
  {:dcat/downloadURL "https://www.w3.org/ns/dqv.ttl",
   :dcterms/contributor [{:foaf/name #xsd/string "Makx Dekkers"}
                         {:foaf/name #xsd/string "Jeremy Debattista"}
                         {:foaf/name #xsd/string "Amrapali Zaveri"}
                         {:foaf/name #xsd/string "Christophe Guéret"}
                         {:foaf/name #xsd/string "Nandana Mihindukulasooriya"}
                         {:foaf/name #xsd/string "Deirdre Lee"}],
   :dcterms/created #xsd/date #inst "2015-12-17T00:00:00.000-05:00",
   :dcterms/creator [{:foaf/name #xsd/string "Antoine Isaac"}
                     {:foaf/name #xsd/string "Riccardo Albertoni"}],
   :dcterms/description
   #xsd/langString
    "The Data Quality Vocabulary (DQV) is seen as an extension to DCAT to cover the quality of the data, how frequently is it updated, whether it accepts user corrections, persistence commitments etc. When used by publishers, this vocabulary will foster trust in the data amongst developers.@en",
   :dcterms/modified [#xsd/date #inst "2016-08-26T00:00:00.000-04:00"
                      #xsd/date #inst "2016-12-15T00:00:00.000-05:00"],
   :dcterms/publisher {:rdfa/uri "http://www.w3.org/data#W3C"},
   :dcterms/title #xsd/langString "Data Quality Vocabulary@en",
   :dcterms/type {:rdfa/uri "http://purl.org/adms/assettype/Ontology"},
   :foaf/homepage {:rdfa/uri "http://www.w3.org/TR/vocab-dqv/"},
   :rdf/ns-prefix-map {"daq"     "http://purl.org/eis/vocab/daq#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "dqv"     "http://www.w3.org/ns/dqv#",
                       "duv"     "http://www.w3.org/ns/duv#",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "oa"      "http://www.w3.org/ns/oa#",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "qb"      "http://purl.org/linked-data/cube#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#",
                       "vann"    "http://purl.org/vocab/vann/",
                       "voaf"    "http://purl.org/vocommons/voaf#",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :voaf/Vocabulary,
   :rdfa/prefix "dqv",
   :rdfa/uri "http://www.w3.org/ns/dqv",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/TR/vocab-dqv/"},
   :vann/preferredNamespacePrefix #xsd/string "dqv",
   :vann/preferredNamespaceUri #xsd/string "http://www.w3.org/ns/dqv#"})

(def Category
  {:db/ident :dqv/Category,
   :owl/equivalentClass :daq/Category,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   #xsd/langString
    "Represents a group of quality dimensions in which a common type of information is used as quality indicator.@en",
   :rdfs/label #xsd/langString "Category@en",
   :rdfs/subClassOf [:rdfs/Resource :skos/Concept]})

(def Dimension
  {:db/ident :dqv/Dimension,
   :owl/equivalentClass :daq/Dimension,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   #xsd/langString
    "Represents criteria relevant for assessing quality. Each quality dimension must have one or more metric to measure it. A dimension is linked with a category using the dqv:inCategory property.@en",
   :rdfs/label #xsd/langString "Dimension@en",
   :rdfs/subClassOf [:rdfs/Resource :skos/Concept]})

(def Metric
  {:db/ident :dqv/Metric,
   :owl/equivalentClass :daq/Metric,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   #xsd/langString
    "Represents a standard to measure a quality dimension. An observation (instance of dqv:QualityMeasurement) assigns a value in a given unit to a Metric.@en",
   :rdfs/label #xsd/langString "Metric@en",
   :rdfs/subClassOf :rdfs/Resource})

(def QualityAnnotation
  {:db/ident :dqv/QualityAnnotation,
   :owl/equivalentClass {:owl/hasValue   :dqv/qualityAssessment,
                         :owl/onProperty :oa/motivation,
                         :rdf/type       :owl/Restriction},
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   #xsd/langString
    "Represents quality annotations, including ratings, quality certificates or feedback that can be associated to datasets or distributions. Quality annotations must have one oa:motivatedBy statement with an instance of oa:Motivation (and skos:Concept) that reflects a quality assessment purpose. We define this instance as dqv:qualityAssessment.@en",
   :rdfs/label #xsd/langString "Quality Annotation@en",
   :rdfs/subClassOf [:rdfs/Resource :oa/Annotation]})

(def QualityCertificate
  {:db/ident :dqv/QualityCertificate,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   #xsd/langString
    "An annotation that associates a resource (especially, a dataset or a distribution) to another resource (for example, a document) that certifies the resource's quality according to a set of quality assessment rules.@en",
   :rdfs/label #xsd/langString "Quality Certificate@en",
   :rdfs/subClassOf [:rdfs/Resource :dqv/QualityAnnotation :oa/Annotation]})

(def QualityMeasurement
  {:db/ident :dqv/QualityMeasurement,
   :owl/equivalentClass :daq/Observation,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   #xsd/langString
    "Represents the evaluation of a given dataset (or dataset distribution) against a specific quality metric.@en",
   :rdfs/label #xsd/langString "Quality Measurement@en",
   :rdfs/subClassOf [:rdfs/Resource :qb/Observation],
   :vann/usageNote
   #xsd/langString
    "The unit of measure in quality measurement should be specified through the property sdmx-attribute:unitMeasure as recommended by RDF Data Cube. The Ontology of units of Measure (OM) by Rijgersberg Et Al provides a list of HTTP dereferenceable unit of measures, which can be exploited as values for sdmx-attribute:unitMeasure.@en"})

(def QualityMeasurementDataset
  {:db/ident :dqv/QualityMeasurementDataset,
   :owl/equivalentClass :daq/QualityGraph,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   #xsd/langString
    "Represents a dataset of quality measurements, evaluations of one or more datasets (or dataset distributions) against specific quality metrics.@en",
   :rdfs/label #xsd/langString "Quality Measurement Dataset@en",
   :rdfs/subClassOf [:rdfs/Resource :qb/DataSet]})

(def QualityMetadata
  {:db/ident :dqv/QualityMetadata,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   #xsd/langString
    "Represents quality metadata, it is defined to group quality certificates, policies, measurements and annotations under a named graph.@en",
   :rdfs/label #xsd/langString "Quality Metadata@en",
   :rdfs/subClassOf [:rdfs/Resource :rdfg/Graph],
   :vann/usageNote
   #xsd/langString
    "QualityMetadata containers do not necessary include all types of quality statements DQV can support. Implementers decide the granularity of containment. In the current version of DQV, we also leave open the choice of the containment technique. Implementers can use (RDF) graph containment. They may also use an appropriate property of their choice — for example (a subproperty of) dcterms:hasPart — to link instances of dqv:QualityMetadata with instances of other DQV classes.@en"})

(def QualityPolicy
  {:db/ident :dqv/QualityPolicy,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   #xsd/langString
    "Represents a policy or agreement that is chiefly governed by data quality concerns.@en",
   :rdfs/label #xsd/langString "Quality Policy@en",
   :rdfs/subClassOf :rdfs/Resource})

(def UserQualityFeedback
  {:db/ident :dqv/UserQualityFeedback,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   #xsd/langString
    "Represents feedback that users have on the quality of datasets or distributions. Besides dqv:qualityAssessment, which is the motivation required by all quality annotations, one of the predefined instances of oa:Motivation should be indicated as motivation to distinguish among the different kinds of feedback, e.g., classifications, questions.@en",
   :rdfs/label #xsd/langString "User Quality feedback@en",
   :rdfs/subClassOf
   [:rdfs/Resource :duv/UserFeedback :dqv/QualityAnnotation :oa/Annotation]})

(def computedOn
  {:db/ident :dqv/computedOn,
   :owl/equivalentProperty :daq/computedOn,
   :owl/inverseOf :dqv/hasQualityMeasurement,
   :rdf/type [:qb/DimensionProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "Refers to the resource (e.g., a dataset, a linkset, a graph, a set of triples) on which the quality measurement is performed. In the DQV context, this property is generally expected to be used in statements in which objects are instances of dcat:Dataset or dcat:Distribution.@en",
   :rdfs/domain :dqv/QualityMeasurement,
   :rdfs/label #xsd/langString "computed on@en",
   :rdfs/range :rdfs/Resource})

(def expectedDataType
  {:db/ident :dqv/expectedDataType,
   :owl/equivalentProperty :daq/expectedDataType,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Represents the expected data type for metric's observed value (e.g. xsd:boolean, xsd:double etc...)@en",
   :rdfs/domain :dqv/Metric,
   :rdfs/label #xsd/langString "expected data type@en",
   :rdfs/range :xsd/anySimpleType})

(def hasQualityAnnotation
  {:db/ident :dqv/hasQualityAnnotation,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Refers to a quality annotation. Quality annotation can be applied to any kind of resource, e.g., a dataset, a linkset, a graph, a set of triples. However, in the DQV context, this property is generally expected to be used in statements in which subjects are instances of dcat:Dataset or dcat:Distribution.@en",
   :rdfs/label #xsd/langString "has quality annotation@en",
   :rdfs/range :dqv/QualityAnnotation,
   :rdfs/subPropertyOf {:owl/inverseOf :oa/hasTarget}})

(def hasQualityMeasurement
  {:db/ident :dqv/hasQualityMeasurement,
   :owl/inverseOf :dqv/computedOn,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Refers to the performed quality measurements. Quality measurements can be performed to any kind of resource (e.g., a dataset, a linkset, a graph, a set of triples). However, in the DQV context, this property is generally expected to be used in statements in which subjects are instances of dcat:Dataset or dcat:Distribution.@en",
   :rdfs/label #xsd/langString "has quality measurement@en",
   :rdfs/range :dqv/QualityMeasurement})

(def hasQualityMetadata
  {:db/ident :dqv/hasQualityMetadata,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Refers to a grouping of quality information such as certificates, policies, measurements and annotations as a named graph. Quality information represented in such a grouping can pertain to any kind of resource (e.g., a dataset, a linkset, a graph, a set of triples). However, in the DQV context, this property is generally expected to be used in statements in which subjects are instances of dcat:Dataset or dcat:Distribution.@en",
   :rdfs/label #xsd/langString "has quality metadata@en",
   :rdfs/range :dqv/QualityMetadata})

(def inCategory
  {:db/ident :dqv/inCategory,
   :owl/inverseOf :daq/hasDimension,
   :rdf/type :rdf/Property,
   :rdfs/comment #xsd/langString
                  "Represents the category a dimension is grouped in.@en",
   :rdfs/domain :dqv/Dimension,
   :rdfs/label #xsd/langString "in category@en",
   :rdfs/range :dqv/Category,
   :vann/usageNote
   #xsd/langString
    "Categories are meant to systematically organize dimensions. The Data Quality Vocabulary defines no specific cardinality constraints for dqv:inCategory, since distinct quality frameworks might have different perspectives over a dimension. A dimension may therefore be associated to more than one category. However, those who define new quality metrics should try to avoid this as much as possible and assign only one category to the dimensions they define.@en"})

(def inDimension
  {:db/ident :dqv/inDimension,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "Represents the dimensions a quality metric, certificate and annotation allow a measurement of.@en",
   :rdfs/label #xsd/langString "in dimension@en",
   :rdfs/range :dqv/Dimension,
   :vann/usageNote
   #xsd/langString
    "Dimensions are meant to systematically organize metrics, quality certificates and quality annotations. The Data Quality Vocabulary defines no specific cardinality constraints for dqv:inDimension, since distinct quality frameworks might have different perspectives over a metric. A metric may therefore be associated to more than one dimension. However, those who define new quality metrics should try to avoid this as much as possible and assign only one dimension to the metrics they define. More than one dimension can be indicated for each quality annotation or certificate.@en"})

(def isMeasurementOf
  {:db/ident               :dqv/isMeasurementOf,
   :owl/equivalentProperty :daq/metric,
   :rdf/type               [:qb/DimensionProperty :rdf/Property],
   :rdfs/comment           #xsd/langString
                            "Indicates the metric being observed.@en",
   :rdfs/domain            :qb/Observation,
   :rdfs/label             #xsd/langString "is measurement of@en",
   :rdfs/range             :dqv/Metric})

(def precision
  {:db/ident :dqv/precision,
   :rdf/type [:dqv/Dimension :rdfs/Resource :skos/Concept],
   :skos/definition
   #xsd/langString
    "Precision is a quality dimension, which refers to the recorded level of details. It represents the exactness of a measurement or description. It is equivalent the notion of Precision from ISO 25012.@en",
   :skos/prefLabel #xsd/langString "Precision@en"})

(def qualityAssessment
  {:db/ident :dqv/qualityAssessment,
   :rdf/type :oa/Motivation,
   :skos/broader :oa/assessing,
   :skos/definition
   #xsd/langString
    "Motivation that must be specified for quality annotations.@en",
   :skos/prefLabel #xsd/langString "Quality assessment@en",
   :vann/usageNote
   #xsd/langString
    "Whenever DQV implementers need to extend the motivations for quality annotations, they should follow the instructions provided by the Web Annotation Data Model, and the concepts in the extension should be defined as specializations of dqv:qualityAssessment.@en"})

(def value
  {:db/ident     :dqv/value,
   :owl/equivalentProperty :daq/value,
   :rdf/type     [:owl/DatatypeProperty :qb/MeasureProperty :rdf/Property],
   :rdfs/comment #xsd/langString "Refers to values computed by metric.@en",
   :rdfs/domain  :dqv/QualityMeasurement,
   :rdfs/label   #xsd/langString "value@en"})