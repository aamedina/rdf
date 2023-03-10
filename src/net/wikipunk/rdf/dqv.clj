(ns net.wikipunk.rdf.dqv
  "The Data Quality Vocabulary (DQV) is seen as an extension to DCAT to cover the quality of the data, how frequently is it updated, whether it accepts user corrections, persistence commitments etc. When used by publishers, this vocabulary will foster trust in the data amongst developers."
  {:dcterms/contributor [{:foaf/name "Deirdre Lee"}
                         {:foaf/name "Nandana Mihindukulasooriya"}
                         {:foaf/name "Makx Dekkers"}
                         {:foaf/name "Jeremy Debattista"}
                         {:foaf/name "Amrapali Zaveri"}
                         {:foaf/name "Christophe Guéret"}],
   :dcterms/created #inst "2015-12-17T00:00:00.000-05:00",
   :dcterms/creator [{:foaf/name "Antoine Isaac"}
                     {:foaf/name "Riccardo Albertoni"}],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "The Data Quality Vocabulary (DQV) is seen as an extension to DCAT to cover the quality of the data, how frequently is it updated, whether it accepts user corrections, persistence commitments etc. When used by publishers, this vocabulary will foster trust in the data amongst developers."},
   :dcterms/modified [#inst "2016-08-26T00:00:00.000-04:00"
                      #inst "2016-12-15T00:00:00.000-05:00"],
   :dcterms/publisher "http://www.w3.org/data#W3C",
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Data Quality Vocabulary"},
   :dcterms/type "http://purl.org/adms/assettype/Ontology",
   :foaf/homepage "http://www.w3.org/TR/vocab-dqv/",
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
   :rdf/type :owl/Ontology
   :rdf/uri "http://www.w3.org/ns/dqv",
   :rdfa/prefix "dqv",
   :rdfa/uri "http://www.w3.org/ns/dqv#",
   :rdfs/isDefinedBy {:rdf/uri "https://www.w3.org/TR/vocab-dqv/"},
   :vann/preferredNamespacePrefix "dqv",
   :vann/preferredNamespaceUri "http://www.w3.org/ns/dqv#"})

(def Category
  "Represents a group of quality dimensions in which a common type of information is used as quality indicator."
  {:db/ident :dqv/Category,
   :owl/equivalentClass :daq/Category,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Represents a group of quality dimensions in which a common type of information is used as quality indicator."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Category"},
   :rdfs/subClassOf :skos/Concept})

(def Dimension
  "Represents criteria relevant for assessing quality. Each quality dimension must have one or more metric to measure it. A dimension is linked with a category using the dqv:inCategory property."
  {:db/ident :dqv/Dimension,
   :owl/equivalentClass :daq/Dimension,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Represents criteria relevant for assessing quality. Each quality dimension must have one or more metric to measure it. A dimension is linked with a category using the dqv:inCategory property."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Dimension"},
   :rdfs/subClassOf :skos/Concept})

(def Metric
  "Represents a standard to measure a quality dimension. An observation (instance of dqv:QualityMeasurement) assigns a value in a given unit to a Metric."
  {:db/ident :dqv/Metric,
   :owl/equivalentClass :daq/Metric,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Represents a standard to measure a quality dimension. An observation (instance of dqv:QualityMeasurement) assigns a value in a given unit to a Metric."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Metric"}})

(def QualityAnnotation
  "Represents quality annotations, including ratings, quality certificates or feedback that can be associated to datasets or distributions. Quality annotations must have one oa:motivatedBy statement with an instance of oa:Motivation (and skos:Concept) that reflects a quality assessment purpose. We define this instance as dqv:qualityAssessment."
  {:db/ident :dqv/QualityAnnotation,
   :owl/equivalentClass {:owl/hasValue   :dqv/qualityAssessment,
                         :owl/onProperty :oa/motivatedBy
                         :rdf/type       :owl/Restriction},
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Represents quality annotations, including ratings, quality certificates or feedback that can be associated to datasets or distributions. Quality annotations must have one oa:motivatedBy statement with an instance of oa:Motivation (and skos:Concept) that reflects a quality assessment purpose. We define this instance as dqv:qualityAssessment."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Quality Annotation"},
   :rdfs/subClassOf :oa/Annotation})

(def QualityCertificate
  "An annotation that associates a resource (especially, a dataset or a distribution) to another resource (for example, a document) that certifies the resource's quality according to a set of quality assessment rules."
  {:db/ident :dqv/QualityCertificate,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An annotation that associates a resource (especially, a dataset or a distribution) to another resource (for example, a document) that certifies the resource's quality according to a set of quality assessment rules."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Quality Certificate"},
   :rdfs/subClassOf :dqv/QualityAnnotation})

(def QualityMeasurement
  "Represents the evaluation of a given dataset (or dataset distribution) against a specific quality metric."
  {:db/ident :dqv/QualityMeasurement,
   :owl/equivalentClass :daq/Observation,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Represents the evaluation of a given dataset (or dataset distribution) against a specific quality metric."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Quality Measurement"},
   :rdfs/subClassOf :qb/Observation,
   :vann/usageNote
   {:rdf/language "en",
    :rdf/value
    "The unit of measure in quality measurement should be specified through the property sdmx-attribute:unitMeasure as recommended by RDF Data Cube. The Ontology of units of Measure (OM) by Rijgersberg Et Al provides a list of HTTP dereferenceable unit of measures, which can be exploited as values for sdmx-attribute:unitMeasure."}})

(def QualityMeasurementDataset
  "Represents a dataset of quality measurements, evaluations of one or more datasets (or dataset distributions) against specific quality metrics."
  {:db/ident :dqv/QualityMeasurementDataset,
   :owl/equivalentClass :daq/QualityGraph,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Represents a dataset of quality measurements, evaluations of one or more datasets (or dataset distributions) against specific quality metrics."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Quality Measurement Dataset"},
   :rdfs/subClassOf :qb/DataSet})

(def QualityMetadata
  "Represents quality metadata, it is defined to group quality certificates, policies, measurements and annotations under a named graph."
  {:db/ident :dqv/QualityMetadata,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Represents quality metadata, it is defined to group quality certificates, policies, measurements and annotations under a named graph."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Quality Metadata"},
   :rdfs/subClassOf :rdfg/Graph,
   :vann/usageNote
   {:rdf/language "en",
    :rdf/value
    "QualityMetadata containers do not necessary include all types of quality statements DQV can support. Implementers decide the granularity of containment. In the current version of DQV, we also leave open the choice of the containment technique. Implementers can use (RDF) graph containment. They may also use an appropriate property of their choice — for example (a subproperty of) dcterms:hasPart — to link instances of dqv:QualityMetadata with instances of other DQV classes."}})

(def QualityPolicy
  "Represents a policy or agreement that is chiefly governed by data quality concerns."
  {:db/ident :dqv/QualityPolicy,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Represents a policy or agreement that is chiefly governed by data quality concerns."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Quality Policy"}})

(def UserQualityFeedback
  "Represents feedback that users have on the quality of datasets or distributions. Besides dqv:qualityAssessment, which is the motivation required by all quality annotations, one of the predefined instances of oa:Motivation should be indicated as motivation to distinguish among the different kinds of feedback, e.g., classifications, questions."
  {:db/ident :dqv/UserQualityFeedback,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Represents feedback that users have on the quality of datasets or distributions. Besides dqv:qualityAssessment, which is the motivation required by all quality annotations, one of the predefined instances of oa:Motivation should be indicated as motivation to distinguish among the different kinds of feedback, e.g., classifications, questions."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "User Quality feedback"},
   :rdfs/subClassOf [:duv/UserFeedback :dqv/QualityAnnotation]})

(def computedOn
  "Refers to the resource (e.g., a dataset, a linkset, a graph, a set of triples) on which the quality measurement is performed. In the DQV context, this property is generally expected to be used in statements in which objects are instances of dcat:Dataset or dcat:Distribution."
  {:db/ident :dqv/computedOn,
   :owl/equivalentProperty :daq/computedOn,
   :owl/inverseOf :dqv/hasQualityMeasurement,
   :rdf/type [:qb/DimensionProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Refers to the resource (e.g., a dataset, a linkset, a graph, a set of triples) on which the quality measurement is performed. In the DQV context, this property is generally expected to be used in statements in which objects are instances of dcat:Dataset or dcat:Distribution."},
   :rdfs/domain :dqv/QualityMeasurement,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "computed on"},
   :rdfs/range :rdfs/Resource})

(def expectedDataType
  "Represents the expected data type for metric's observed value (e.g. xsd:boolean, xsd:double etc...)"
  {:db/ident :dqv/expectedDataType,
   :owl/equivalentProperty :daq/expectedDataType,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Represents the expected data type for metric's observed value (e.g. xsd:boolean, xsd:double etc...)"},
   :rdfs/domain :dqv/Metric,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "expected data type"},
   :rdfs/range :xsd/anySimpleType})

(def hasQualityAnnotation
  "Refers to a quality annotation. Quality annotation can be applied to any kind of resource, e.g., a dataset, a linkset, a graph, a set of triples. However, in the DQV context, this property is generally expected to be used in statements in which subjects are instances of dcat:Dataset or dcat:Distribution."
  {:db/ident :dqv/hasQualityAnnotation,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Refers to a quality annotation. Quality annotation can be applied to any kind of resource, e.g., a dataset, a linkset, a graph, a set of triples. However, in the DQV context, this property is generally expected to be used in statements in which subjects are instances of dcat:Dataset or dcat:Distribution."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has quality annotation"},
   :rdfs/range :dqv/QualityAnnotation,
   :rdfs/subPropertyOf {:owl/inverseOf :oa/hasTarget}})

(def hasQualityMeasurement
  "Refers to the performed quality measurements. Quality measurements can be performed to any kind of resource (e.g., a dataset, a linkset, a graph, a set of triples). However, in the DQV context, this property is generally expected to be used in statements in which subjects are instances of dcat:Dataset or dcat:Distribution."
  {:db/ident :dqv/hasQualityMeasurement,
   :owl/inverseOf :dqv/computedOn,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Refers to the performed quality measurements. Quality measurements can be performed to any kind of resource (e.g., a dataset, a linkset, a graph, a set of triples). However, in the DQV context, this property is generally expected to be used in statements in which subjects are instances of dcat:Dataset or dcat:Distribution."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has quality measurement"},
   :rdfs/range :dqv/QualityMeasurement})

(def hasQualityMetadata
  "Refers to a grouping of quality information such as certificates, policies, measurements and annotations as a named graph. Quality information represented in such a grouping can pertain to any kind of resource (e.g., a dataset, a linkset, a graph, a set of triples). However, in the DQV context, this property is generally expected to be used in statements in which subjects are instances of dcat:Dataset or dcat:Distribution."
  {:db/ident :dqv/hasQualityMetadata,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Refers to a grouping of quality information such as certificates, policies, measurements and annotations as a named graph. Quality information represented in such a grouping can pertain to any kind of resource (e.g., a dataset, a linkset, a graph, a set of triples). However, in the DQV context, this property is generally expected to be used in statements in which subjects are instances of dcat:Dataset or dcat:Distribution."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has quality metadata"},
   :rdfs/range :dqv/QualityMetadata})

(def inCategory
  "Represents the category a dimension is grouped in."
  {:db/ident :dqv/inCategory,
   :owl/inverseOf :daq/hasDimension,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Represents the category a dimension is grouped in."},
   :rdfs/domain :dqv/Dimension,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "in category"},
   :rdfs/range :dqv/Category,
   :vann/usageNote
   {:rdf/language "en",
    :rdf/value
    "Categories are meant to systematically organize dimensions. The Data Quality Vocabulary defines no specific cardinality constraints for dqv:inCategory, since distinct quality frameworks might have different perspectives over a dimension. A dimension may therefore be associated to more than one category. However, those who define new quality metrics should try to avoid this as much as possible and assign only one category to the dimensions they define."}})

(def inDimension
  "Represents the dimensions a quality metric, certificate and annotation allow a measurement of."
  {:db/ident :dqv/inDimension,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Represents the dimensions a quality metric, certificate and annotation allow a measurement of."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "in dimension"},
   :rdfs/range :dqv/Dimension,
   :vann/usageNote
   {:rdf/language "en",
    :rdf/value
    "Dimensions are meant to systematically organize metrics, quality certificates and quality annotations. The Data Quality Vocabulary defines no specific cardinality constraints for dqv:inDimension, since distinct quality frameworks might have different perspectives over a metric. A metric may therefore be associated to more than one dimension. However, those who define new quality metrics should try to avoid this as much as possible and assign only one dimension to the metrics they define. More than one dimension can be indicated for each quality annotation or certificate."}})

(def isMeasurementOf
  "Indicates the metric being observed."
  {:db/ident               :dqv/isMeasurementOf,
   :owl/equivalentProperty :daq/metric,
   :rdf/type               [:qb/DimensionProperty :rdf/Property],
   :rdfs/comment           {:rdf/language "en",
                            :rdf/value "Indicates the metric being observed."},
   :rdfs/domain            :qb/Observation,
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "is measurement of"},
   :rdfs/range             :dqv/Metric})

(def precision
  "Precision is a quality dimension, which refers to the recorded level of details. It represents the exactness of a measurement or description. It is equivalent the notion of Precision from ISO 25012."
  {:db/ident :dqv/precision,
   :rdf/type :dqv/Dimension,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Precision is a quality dimension, which refers to the recorded level of details. It represents the exactness of a measurement or description. It is equivalent the notion of Precision from ISO 25012."},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Precision"}})

(def qualityAssessment
  "Motivation that must be specified for quality annotations."
  {:db/ident :dqv/qualityAssessment,
   :rdf/type :oa/Motivation,
   :skos/broader :oa/assessing,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Motivation that must be specified for quality annotations."},
   :skos/prefLabel {:rdf/language "en",
                    :rdf/value    "Quality assessment"},
   :vann/usageNote
   {:rdf/language "en",
    :rdf/value
    "Whenever DQV implementers need to extend the motivations for quality annotations, they should follow the instructions provided by the Web Annotation Data Model, and the concepts in the extension should be defined as specializations of dqv:qualityAssessment."}})

(def value
  "Refers to values computed by metric."
  {:db/ident     :dqv/value,
   :owl/equivalentProperty :daq/value,
   :rdf/type     [:owl/DatatypeProperty :qb/MeasureProperty :rdf/Property],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Refers to values computed by metric."},
   :rdfs/domain  :dqv/QualityMeasurement,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "value"}})
