(ns net.wikipunk.rdf.dqv
  "The Data Quality Vocabulary (DQV) is seen as an extension to DCAT to cover the quality of the data, how frequently is it updated, whether it accepts user corrections, persistence commitments etc. When used by publishers, this vocabulary will foster trust in the data amongst developers."
  {:dcat/downloadURL "https://www.w3.org/ns/dqv.ttl",
   :dcterms/contributor [{:foaf/name "Jeremy Debattista"}
                         {:foaf/name "Nandana Mihindukulasooriya"}
                         {:foaf/name "Christophe Guéret"}
                         {:foaf/name "Amrapali Zaveri"}
                         {:foaf/name "Deirdre Lee"}
                         {:foaf/name "Makx Dekkers"}],
   :dcterms/created #inst "2015-12-17T00:00:00.000-05:00",
   :dcterms/creator [{:foaf/name "Riccardo Albertoni"}
                     {:foaf/name "Antoine Isaac"}],
   :dcterms/description
   #voc/lstr
    "The Data Quality Vocabulary (DQV) is seen as an extension to DCAT to cover the quality of the data, how frequently is it updated, whether it accepts user corrections, persistence commitments etc. When used by publishers, this vocabulary will foster trust in the data amongst developers.@en",
   :dcterms/modified [#inst "2016-08-26T00:00:00.000-04:00"
                      #inst "2016-12-15T00:00:00.000-05:00"],
   :dcterms/publisher "http://www.w3.org/data#W3C",
   :dcterms/title #voc/lstr "Data Quality Vocabulary@en",
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
   :rdf/type :voaf/Vocabulary,
   :rdfa/prefix "dqv",
   :rdfa/uri "http://www.w3.org/ns/dqv",
   :rdfs/isDefinedBy {:rdf/uri "https://www.w3.org/TR/vocab-dqv/"},
   :vann/preferredNamespacePrefix "dqv",
   :vann/preferredNamespaceUri "http://www.w3.org/ns/dqv#"})

(def Category
  "Represents a group of quality dimensions in which a common type of information is used as quality indicator."
  {:db/ident :dqv/Category,
   :owl/equivalentClass :daq/Category,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   #voc/lstr
    "Represents a group of quality dimensions in which a common type of information is used as quality indicator.@en",
   :rdfs/label #voc/lstr "Category@en",
   :rdfs/subClassOf [:rdfs/Resource :skos/Concept :dqv/Category]})

(def Dimension
  "Represents criteria relevant for assessing quality. Each quality dimension must have one or more metric to measure it. A dimension is linked with a category using the dqv:inCategory property."
  {:db/ident :dqv/Dimension,
   :owl/equivalentClass :daq/Dimension,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   #voc/lstr
    "Represents criteria relevant for assessing quality. Each quality dimension must have one or more metric to measure it. A dimension is linked with a category using the dqv:inCategory property.@en",
   :rdfs/label #voc/lstr "Dimension@en",
   :rdfs/subClassOf [:rdfs/Resource :skos/Concept :dqv/Dimension]})

(def Metric
  "Represents a standard to measure a quality dimension. An observation (instance of dqv:QualityMeasurement) assigns a value in a given unit to a Metric."
  {:db/ident :dqv/Metric,
   :owl/equivalentClass :daq/Metric,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   #voc/lstr
    "Represents a standard to measure a quality dimension. An observation (instance of dqv:QualityMeasurement) assigns a value in a given unit to a Metric.@en",
   :rdfs/label #voc/lstr "Metric@en",
   :rdfs/subClassOf [:rdfs/Resource :dqv/Metric]})

(def QualityAnnotation
  "Represents quality annotations, including ratings, quality certificates or feedback that can be associated to datasets or distributions. Quality annotations must have one oa:motivatedBy statement with an instance of oa:Motivation (and skos:Concept) that reflects a quality assessment purpose. We define this instance as dqv:qualityAssessment."
  {:db/ident :dqv/QualityAnnotation,
   :owl/equivalentClass {:owl/hasValue   :dqv/qualityAssessment,
                         :owl/onProperty :oa/motivation,
                         :rdf/type       :owl/Restriction},
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   #voc/lstr
    "Represents quality annotations, including ratings, quality certificates or feedback that can be associated to datasets or distributions. Quality annotations must have one oa:motivatedBy statement with an instance of oa:Motivation (and skos:Concept) that reflects a quality assessment purpose. We define this instance as dqv:qualityAssessment.@en",
   :rdfs/label #voc/lstr "Quality Annotation@en",
   :rdfs/subClassOf [:rdfs/Resource :oa/Annotation :dqv/QualityAnnotation]})

(def QualityCertificate
  "An annotation that associates a resource (especially, a dataset or a distribution) to another resource (for example, a document) that certifies the resource's quality according to a set of quality assessment rules."
  {:db/ident :dqv/QualityCertificate,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   #voc/lstr
    "An annotation that associates a resource (especially, a dataset or a distribution) to another resource (for example, a document) that certifies the resource's quality according to a set of quality assessment rules.@en",
   :rdfs/label #voc/lstr "Quality Certificate@en",
   :rdfs/subClassOf [:rdfs/Resource
                     :dqv/QualityAnnotation
                     :dqv/QualityCertificate
                     :oa/Annotation]})

(def QualityMeasurement
  "Represents the evaluation of a given dataset (or dataset distribution) against a specific quality metric."
  {:db/ident :dqv/QualityMeasurement,
   :owl/equivalentClass :daq/Observation,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   #voc/lstr
    "Represents the evaluation of a given dataset (or dataset distribution) against a specific quality metric.@en",
   :rdfs/label #voc/lstr "Quality Measurement@en",
   :rdfs/subClassOf [:rdfs/Resource :qb/Observation :dqv/QualityMeasurement],
   :vann/usageNote
   #voc/lstr
    "The unit of measure in quality measurement should be specified through the property sdmx-attribute:unitMeasure as recommended by RDF Data Cube. The Ontology of units of Measure (OM) by Rijgersberg Et Al provides a list of HTTP dereferenceable unit of measures, which can be exploited as values for sdmx-attribute:unitMeasure.@en"})

(def QualityMeasurementDataset
  "Represents a dataset of quality measurements, evaluations of one or more datasets (or dataset distributions) against specific quality metrics."
  {:db/ident :dqv/QualityMeasurementDataset,
   :owl/equivalentClass :daq/QualityGraph,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   #voc/lstr
    "Represents a dataset of quality measurements, evaluations of one or more datasets (or dataset distributions) against specific quality metrics.@en",
   :rdfs/label #voc/lstr "Quality Measurement Dataset@en",
   :rdfs/subClassOf
   [:rdfs/Resource :qb/DataSet :dqv/QualityMeasurementDataset]})

(def QualityMetadata
  "Represents quality metadata, it is defined to group quality certificates, policies, measurements and annotations under a named graph."
  {:db/ident :dqv/QualityMetadata,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   #voc/lstr
    "Represents quality metadata, it is defined to group quality certificates, policies, measurements and annotations under a named graph.@en",
   :rdfs/label #voc/lstr "Quality Metadata@en",
   :rdfs/subClassOf [:rdfs/Resource :rdfg/Graph :dqv/QualityMetadata],
   :vann/usageNote
   #voc/lstr
    "QualityMetadata containers do not necessary include all types of quality statements DQV can support. Implementers decide the granularity of containment. In the current version of DQV, we also leave open the choice of the containment technique. Implementers can use (RDF) graph containment. They may also use an appropriate property of their choice — for example (a subproperty of) dcterms:hasPart — to link instances of dqv:QualityMetadata with instances of other DQV classes.@en"})

(def QualityPolicy
  "Represents a policy or agreement that is chiefly governed by data quality concerns."
  {:db/ident :dqv/QualityPolicy,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   #voc/lstr
    "Represents a policy or agreement that is chiefly governed by data quality concerns.@en",
   :rdfs/label #voc/lstr "Quality Policy@en",
   :rdfs/subClassOf [:rdfs/Resource :dqv/QualityPolicy]})

(def UserQualityFeedback
  "Represents feedback that users have on the quality of datasets or distributions. Besides dqv:qualityAssessment, which is the motivation required by all quality annotations, one of the predefined instances of oa:Motivation should be indicated as motivation to distinguish among the different kinds of feedback, e.g., classifications, questions."
  {:db/ident :dqv/UserQualityFeedback,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   #voc/lstr
    "Represents feedback that users have on the quality of datasets or distributions. Besides dqv:qualityAssessment, which is the motivation required by all quality annotations, one of the predefined instances of oa:Motivation should be indicated as motivation to distinguish among the different kinds of feedback, e.g., classifications, questions.@en",
   :rdfs/label #voc/lstr "User Quality feedback@en",
   :rdfs/subClassOf [:rdfs/Resource
                     :duv/UserFeedback
                     :dqv/QualityAnnotation
                     :dqv/UserQualityFeedback
                     :oa/Annotation]})

(def computedOn
  "Refers to the resource (e.g., a dataset, a linkset, a graph, a set of triples) on which the quality measurement is performed. In the DQV context, this property is generally expected to be used in statements in which objects are instances of dcat:Dataset or dcat:Distribution."
  {:db/ident :dqv/computedOn,
   :owl/equivalentProperty :daq/computedOn,
   :owl/inverseOf :dqv/hasQualityMeasurement,
   :rdf/type [:qb/DimensionProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "Refers to the resource (e.g., a dataset, a linkset, a graph, a set of triples) on which the quality measurement is performed. In the DQV context, this property is generally expected to be used in statements in which objects are instances of dcat:Dataset or dcat:Distribution.@en",
   :rdfs/domain :dqv/QualityMeasurement,
   :rdfs/label #voc/lstr "computed on@en",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :dqv/computedOn})

(def expectedDataType
  "Represents the expected data type for metric's observed value (e.g. xsd:boolean, xsd:double etc...)"
  {:db/ident :dqv/expectedDataType,
   :owl/equivalentProperty :daq/expectedDataType,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Represents the expected data type for metric's observed value (e.g. xsd:boolean, xsd:double etc...)@en",
   :rdfs/domain :dqv/Metric,
   :rdfs/label #voc/lstr "expected data type@en",
   :rdfs/range :xsd/anySimpleType,
   :rdfs/subPropertyOf :dqv/expectedDataType})

(def hasQualityAnnotation
  "Refers to a quality annotation. Quality annotation can be applied to any kind of resource, e.g., a dataset, a linkset, a graph, a set of triples. However, in the DQV context, this property is generally expected to be used in statements in which subjects are instances of dcat:Dataset or dcat:Distribution."
  {:db/ident :dqv/hasQualityAnnotation,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Refers to a quality annotation. Quality annotation can be applied to any kind of resource, e.g., a dataset, a linkset, a graph, a set of triples. However, in the DQV context, this property is generally expected to be used in statements in which subjects are instances of dcat:Dataset or dcat:Distribution.@en",
   :rdfs/label #voc/lstr "has quality annotation@en",
   :rdfs/range :dqv/QualityAnnotation,
   :rdfs/subPropertyOf [{:owl/inverseOf :oa/hasTarget}
                        :dqv/hasQualityAnnotation]})

(def hasQualityMeasurement
  "Refers to the performed quality measurements. Quality measurements can be performed to any kind of resource (e.g., a dataset, a linkset, a graph, a set of triples). However, in the DQV context, this property is generally expected to be used in statements in which subjects are instances of dcat:Dataset or dcat:Distribution."
  {:db/ident :dqv/hasQualityMeasurement,
   :owl/inverseOf :dqv/computedOn,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Refers to the performed quality measurements. Quality measurements can be performed to any kind of resource (e.g., a dataset, a linkset, a graph, a set of triples). However, in the DQV context, this property is generally expected to be used in statements in which subjects are instances of dcat:Dataset or dcat:Distribution.@en",
   :rdfs/label #voc/lstr "has quality measurement@en",
   :rdfs/range :dqv/QualityMeasurement,
   :rdfs/subPropertyOf :dqv/hasQualityMeasurement})

(def hasQualityMetadata
  "Refers to a grouping of quality information such as certificates, policies, measurements and annotations as a named graph. Quality information represented in such a grouping can pertain to any kind of resource (e.g., a dataset, a linkset, a graph, a set of triples). However, in the DQV context, this property is generally expected to be used in statements in which subjects are instances of dcat:Dataset or dcat:Distribution."
  {:db/ident :dqv/hasQualityMetadata,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Refers to a grouping of quality information such as certificates, policies, measurements and annotations as a named graph. Quality information represented in such a grouping can pertain to any kind of resource (e.g., a dataset, a linkset, a graph, a set of triples). However, in the DQV context, this property is generally expected to be used in statements in which subjects are instances of dcat:Dataset or dcat:Distribution.@en",
   :rdfs/label #voc/lstr "has quality metadata@en",
   :rdfs/range :dqv/QualityMetadata,
   :rdfs/subPropertyOf :dqv/hasQualityMetadata})

(def inCategory
  "Represents the category a dimension is grouped in."
  {:db/ident :dqv/inCategory,
   :owl/inverseOf :daq/hasDimension,
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr
                  "Represents the category a dimension is grouped in.@en",
   :rdfs/domain :dqv/Dimension,
   :rdfs/label #voc/lstr "in category@en",
   :rdfs/range :dqv/Category,
   :rdfs/subPropertyOf :dqv/inCategory,
   :vann/usageNote
   #voc/lstr
    "Categories are meant to systematically organize dimensions. The Data Quality Vocabulary defines no specific cardinality constraints for dqv:inCategory, since distinct quality frameworks might have different perspectives over a dimension. A dimension may therefore be associated to more than one category. However, those who define new quality metrics should try to avoid this as much as possible and assign only one category to the dimensions they define.@en"})

(def inDimension
  "Represents the dimensions a quality metric, certificate and annotation allow a measurement of."
  {:db/ident :dqv/inDimension,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Represents the dimensions a quality metric, certificate and annotation allow a measurement of.@en",
   :rdfs/label #voc/lstr "in dimension@en",
   :rdfs/range :dqv/Dimension,
   :rdfs/subPropertyOf :dqv/inDimension,
   :vann/usageNote
   #voc/lstr
    "Dimensions are meant to systematically organize metrics, quality certificates and quality annotations. The Data Quality Vocabulary defines no specific cardinality constraints for dqv:inDimension, since distinct quality frameworks might have different perspectives over a metric. A metric may therefore be associated to more than one dimension. However, those who define new quality metrics should try to avoid this as much as possible and assign only one dimension to the metrics they define. More than one dimension can be indicated for each quality annotation or certificate.@en"})

(def isMeasurementOf
  "Indicates the metric being observed."
  {:db/ident           :dqv/isMeasurementOf,
   :owl/equivalentProperty :daq/metric,
   :rdf/type           [:qb/DimensionProperty :rdf/Property],
   :rdfs/comment       #voc/lstr "Indicates the metric being observed.@en",
   :rdfs/domain        :qb/Observation,
   :rdfs/label         #voc/lstr "is measurement of@en",
   :rdfs/range         :dqv/Metric,
   :rdfs/subPropertyOf :dqv/isMeasurementOf})

(def precision
  "Precision is a quality dimension, which refers to the recorded level of details. It represents the exactness of a measurement or description. It is equivalent the notion of Precision from ISO 25012."
  {:db/ident :dqv/precision,
   :rdf/type [:dqv/Dimension :rdfs/Resource :skos/Concept],
   :skos/definition
   #voc/lstr
    "Precision is a quality dimension, which refers to the recorded level of details. It represents the exactness of a measurement or description. It is equivalent the notion of Precision from ISO 25012.@en",
   :skos/prefLabel #voc/lstr "Precision@en"})

(def qualityAssessment
  "Motivation that must be specified for quality annotations."
  {:db/ident :dqv/qualityAssessment,
   :rdf/type :oa/Motivation,
   :skos/broader :oa/assessing,
   :skos/definition
   #voc/lstr "Motivation that must be specified for quality annotations.@en",
   :skos/prefLabel #voc/lstr "Quality assessment@en",
   :vann/usageNote
   #voc/lstr
    "Whenever DQV implementers need to extend the motivations for quality annotations, they should follow the instructions provided by the Web Annotation Data Model, and the concepts in the extension should be defined as specializations of dqv:qualityAssessment.@en"})

(def value
  "Refers to values computed by metric."
  {:db/ident           :dqv/value,
   :owl/equivalentProperty :daq/value,
   :rdf/type           [:owl/DatatypeProperty
                        :qb/MeasureProperty
                        :rdf/Property],
   :rdfs/comment       #voc/lstr "Refers to values computed by metric.@en",
   :rdfs/domain        :dqv/QualityMeasurement,
   :rdfs/label         #voc/lstr "value@en",
   :rdfs/subPropertyOf :dqv/value})

(def ^{:private true} OrderedCollection
  {:db/ident        :as/OrderedCollection,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :as/OrderedCollection})

(def ^{:private true} UserFeedback
  {:db/ident        :duv/UserFeedback,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :duv/UserFeedback})

(def ^{:private true} Annotation
  {:db/ident        :oa/Annotation,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :oa/Annotation})

(def ^{:private true} Annotation
  "The class for Web Annotations."
  {:db/ident         :oa/Annotation,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "The class for Web Annotations.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label       "Annotation",
   :rdfs/subClassOf  [:rdfs/Resource :oa/Annotation]})

(def ^{:private true} Choice
  "A subClass of as:OrderedCollection that conveys to a consuming application that it should select one of the resources in the as:items list to use, rather than all of them. This is typically used to provide a choice of resources to render to the user, based on further supplied properties. If the consuming application cannot determine the user's preference, then it should use the first in the list."
  {:db/ident :oa/Choice,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A subClass of  as:OrderedCollection  that conveys to a consuming application that it should select one of the resources in the  as:items  list to use, rather than all of them.  This is typically used to provide a choice of resources to render to the user, based on further supplied properties.  If the consuming application cannot determine the user's preference, then it should use the first in the list.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "Choice",
   :rdfs/subClassOf [:rdfs/Resource :as/OrderedCollection :oa/Choice]})

(def ^{:private true} CssSelector
  "A CssSelector describes a Segment of interest in a representation that conforms to the Document Object Model through the use of the CSS selector specification."
  {:db/ident :oa/CssSelector,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A CssSelector describes a Segment of interest in a representation that conforms to the Document Object Model through the use of the CSS selector specification.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "CssSelector",
   :rdfs/subClassOf [:rdfs/Resource :oa/Selector :oa/CssSelector]})

(def ^{:private true} CssStyle
  "A resource which describes styles for resources participating in the Annotation using CSS."
  {:db/ident :oa/CssStyle,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A resource which describes styles for resources participating in the Annotation using CSS.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "CssStyle",
   :rdfs/subClassOf [:oa/Style :oa/CssStyle :rdfs/Resource]})

(def ^{:private true} DataPositionSelector
  "DataPositionSelector describes a range of data by recording the start and end positions of the selection in the stream. Position 0 would be immediately before the first byte, position 1 would be immediately before the second byte, and so on. The start byte is thus included in the list, but the end byte is not."
  {:db/ident :oa/DataPositionSelector,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "DataPositionSelector describes a range of data by recording the start and end positions of the selection in the stream. Position 0 would be immediately before the first byte, position 1 would be immediately before the second byte, and so on. The start byte is thus included in the list, but the end byte is not.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "DataPositionSelector",
   :rdfs/subClassOf [:rdfs/Resource :oa/Selector :oa/DataPositionSelector]})

(def ^{:private true} Direction
  "A class to encapsulate the different text directions that a textual resource might take. It is not used directly in the Annotation Model, only its three instances."
  {:db/ident :oa/Direction,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A class to encapsulate the different text directions that a textual resource might take.  It is not used directly in the Annotation Model, only its three instances.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "Direction",
   :rdfs/subClassOf [:rdfs/Resource :oa/Direction]})

(def ^{:private true} FragmentSelector
  "The FragmentSelector class is used to record the segment of a representation using the IRI fragment specification defined by the representation's media type."
  {:db/ident :oa/FragmentSelector,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The FragmentSelector class is used to record the segment of a representation using the IRI fragment specification defined by the representation's media type.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "FragmentSelector",
   :rdfs/subClassOf [:rdfs/Resource :oa/Selector :oa/FragmentSelector]})

(def ^{:private true} HttpRequestState
  "The HttpRequestState class is used to record the HTTP request headers that a client SHOULD use to request the correct representation from the resource."
  {:db/ident :oa/HttpRequestState,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The HttpRequestState class is used to record the HTTP request headers that a client SHOULD use to request the correct representation from the resource. ",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "HttpRequestState",
   :rdfs/subClassOf [:rdfs/Resource :oa/State :oa/HttpRequestState]})

(def ^{:private true} Motivation
  "The Motivation class is used to record the user's intent or motivation for the creation of the Annotation, or the inclusion of the body or target, that it is associated with."
  {:db/ident :oa/Motivation,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The Motivation class is used to record the user's intent or motivation for the creation of the Annotation, or the inclusion of the body or target, that it is associated with.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "Motivation",
   :rdfs/subClassOf [:rdfs/Resource :skos/Concept :oa/Motivation]})

(def ^{:private true} PreferContainedDescriptions
  "An IRI to signal the client prefers to receive full descriptions of the Annotations from a container, not just their IRIs."
  {:db/ident :oa/PreferContainedDescriptions,
   :rdf/type :rdfs/Resource,
   :rdfs/comment
   "An IRI to signal the client prefers to receive full descriptions of the Annotations from a container, not just their IRIs.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "PreferContainedDescriptions"})

(def ^{:private true} PreferContainedIRIs
  "An IRI to signal that the client prefers to receive only the IRIs of the Annotations from a container, not their full descriptions."
  {:db/ident :oa/PreferContainedIRIs,
   :rdf/type :rdfs/Resource,
   :rdfs/comment
   "An IRI to signal that the client prefers to receive only the IRIs of the Annotations from a container, not their full descriptions.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "PreferContainedIRIs"})

(def ^{:private true} RangeSelector
  "A Range Selector can be used to identify the beginning and the end of the selection by using other Selectors. The selection consists of everything from the beginning of the starting selector through to the beginning of the ending selector, but not including it."
  {:db/ident :oa/RangeSelector,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A Range Selector can be used to identify the beginning and the end of the selection by using other Selectors. The selection consists of everything from the beginning of the starting selector through to the beginning of the ending selector, but not including it.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "RangeSelector",
   :rdfs/subClassOf [:rdfs/Resource :oa/Selector :oa/RangeSelector]})

(def ^{:private true} ResourceSelection
  "Instances of the ResourceSelection class identify part (described by an oa:Selector) of another resource (referenced with oa:hasSource), possibly from a particular representation of a resource (described by an oa:State). Please note that ResourceSelection is not used directly in the Web Annotation model, but is provided as a separate class for further application profiles to use, separate from oa:SpecificResource which has many Annotation specific features."
  {:db/ident :oa/ResourceSelection,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Instances of the ResourceSelection class identify part (described by an oa:Selector) of another resource (referenced with oa:hasSource), possibly from a particular representation of a resource (described by an oa:State). Please note that ResourceSelection is not used directly in the Web Annotation model, but is provided as a separate class for further application profiles to use, separate from oa:SpecificResource which has many Annotation specific features.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "ResourceSelection",
   :rdfs/subClassOf [:rdfs/Resource :oa/ResourceSelection]})

(def ^{:private true} Selector
  "A resource which describes the segment of interest in a representation of a Source resource, indicated with oa:hasSelector from the Specific Resource. This class is not used directly in the Annotation model, only its subclasses."
  {:db/ident :oa/Selector,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A resource which describes the segment of interest in a representation of a Source resource, indicated with oa:hasSelector from the Specific Resource. This class is not used directly in the Annotation model, only its subclasses.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "Selector",
   :rdfs/subClassOf [:rdfs/Resource :oa/Selector]})

(def ^{:private true} SpecificResource
  "Instances of the SpecificResource class identify part of another resource (referenced with oa:hasSource), a particular representation of a resource, a resource with styling hints for renders, or any combination of these, as used within an Annotation."
  {:db/ident :oa/SpecificResource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Instances of the SpecificResource class identify part of another resource (referenced with oa:hasSource), a particular representation of a resource, a resource with styling hints for renders, or any combination of these, as used within an Annotation.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "SpecificResource",
   :rdfs/subClassOf
   [:rdfs/Resource :oa/ResourceSelection :oa/SpecificResource]})

(def ^{:private true} State
  "A State describes the intended state of a resource as applied to the particular Annotation, and thus provides the information needed to retrieve the correct representation of that resource."
  {:db/ident :oa/State,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A State describes the intended state of a resource as applied to the particular Annotation, and thus provides the information needed to retrieve the correct representation of that resource.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "State",
   :rdfs/subClassOf [:rdfs/Resource :oa/State]})

(def ^{:private true} Style
  "A Style describes the intended styling of a resource as applied to the particular Annotation, and thus provides the information to ensure that rendering is consistent across implementations."
  {:db/ident :oa/Style,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A Style describes the intended styling of a resource as applied to the particular Annotation, and thus provides the information to ensure that rendering is consistent across implementations.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "Style",
   :rdfs/subClassOf [:rdfs/Resource :oa/Style]})

(def ^{:private true} SvgSelector
  "An SvgSelector defines an area through the use of the Scalable Vector Graphics [SVG] standard. This allows the user to select a non-rectangular area of the content, such as a circle or polygon by describing the region using SVG. The SVG may be either embedded within the Annotation or referenced as an External Resource."
  {:db/ident :oa/SvgSelector,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An SvgSelector defines an area through the use of the Scalable Vector Graphics [SVG] standard. This allows the user to select a non-rectangular area of the content, such as a circle or polygon by describing the region using SVG. The SVG may be either embedded within the Annotation or referenced as an External Resource.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "SvgSelector",
   :rdfs/subClassOf [:rdfs/Resource :oa/Selector :oa/SvgSelector]})

(def ^{:private true} TextPositionSelector
  "The TextPositionSelector describes a range of text by recording the start and end positions of the selection in the stream. Position 0 would be immediately before the first character, position 1 would be immediately before the second character, and so on."
  {:db/ident :oa/TextPositionSelector,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The TextPositionSelector describes a range of text by recording the start and end positions of the selection in the stream. Position 0 would be immediately before the first character, position 1 would be immediately before the second character, and so on.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "TextPositionSelector",
   :rdfs/subClassOf [:rdfs/Resource :oa/Selector :oa/TextPositionSelector]})

(def ^{:private true} TextQuoteSelector
  "The TextQuoteSelector describes a range of text by copying it, and including some of the text immediately before (a prefix) and after (a suffix) it to distinguish between multiple copies of the same sequence of characters."
  {:db/ident :oa/TextQuoteSelector,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "The TextQuoteSelector describes a range of text by copying it, and including some of the text immediately before (a prefix) and after (a suffix) it to distinguish between multiple copies of the same sequence of characters.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "TextQuoteSelector",
   :rdfs/subClassOf [:rdfs/Resource :oa/Selector :oa/TextQuoteSelector]})

(def ^{:private true} TextualBody
  ""
  {:db/ident         :oa/TextualBody,
   :rdf/type         :rdfs/Class,
   :rdfs/comment     "",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label       "TextualBody",
   :rdfs/subClassOf  [:rdfs/Resource :oa/TextualBody]})

(def ^{:private true} TimeState
  "A TimeState records the time at which the resource's state is appropriate for the Annotation, typically the time that the Annotation was created and/or a link to a persistent copy of the current version."
  {:db/ident :oa/TimeState,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A TimeState records the time at which the resource's state is appropriate for the Annotation, typically the time that the Annotation was created and/or a link to a persistent copy of the current version.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "TimeState",
   :rdfs/subClassOf [:rdfs/Resource :oa/State :oa/TimeState]})

(def ^{:private true} XPathSelector
  "An XPathSelector is used to select elements and content within a resource that supports the Document Object Model via a specified XPath value."
  {:db/ident :oa/XPathSelector,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   " An XPathSelector is used to select elements and content within a resource that supports the Document Object Model via a specified XPath value.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "XPathSelector",
   :rdfs/subClassOf [:rdfs/Resource :oa/Selector :oa/XPathSelector]})

(def ^{:private true} annotationService
  "The object of the relationship is the end point of a service that conforms to the annotation-protocol, and it may be associated with any resource. The expectation of asserting the relationship is that the object is the preferred service for maintaining annotations about the subject resource, according to the publisher of the relationship. This relationship is intended to be used both within Linked Data descriptions and as the rel type of a Link, via HTTP Link Headers rfc5988 for binary resources and in HTML <link> elements. For more information about these, please see the Annotation Protocol specification annotation-protocol."
  {:db/ident :oa/annotationService,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The object of the relationship is the end point of a service that conforms to the annotation-protocol, and it may be associated with any resource.  The expectation of asserting the relationship is that the object is the preferred service for maintaining annotations about the subject resource, according to the publisher of the relationship.\n\n  This relationship is intended to be used both within Linked Data descriptions and as the  rel  type of a Link, via HTTP Link Headers rfc5988 for binary resources and in HTML <link> elements.  For more information about these, please see the Annotation Protocol specification annotation-protocol.\n  ",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "annotationService",
   :rdfs/subPropertyOf :oa/annotationService})

(def assessing
  "The motivation for when the user intends to provide an assessment about the Target resource."
  {:db/ident :oa/assessing,
   :rdf/type [:oa/Motivation :skos/Concept :rdfs/Resource],
   :rdfs/comment
   "The motivation for when the user intends to provide an assessment about the Target resource.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "assessing"})

(def ^{:private true} bodyValue
  "The object of the predicate is a plain text string to be used as the content of the body of the Annotation. The value MUST be an xsd:string and that data type MUST NOT be expressed in the serialization. Note that language MUST NOT be associated with the value either as a language tag, as that is only available for rdf:langString ."
  {:db/ident :oa/bodyValue,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The object of the predicate is a plain text string to be used as the content of the body of the Annotation.  The value MUST be an  xsd:string  and that data type MUST NOT be expressed in the serialization. Note that language MUST NOT be associated with the value either as a language tag, as that is only available for  rdf:langString .\n  ",
   :rdfs/domain :oa/Annotation,
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "bodyValue",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :oa/bodyValue})

(def bookmarking
  "The motivation for when the user intends to create a bookmark to the Target or part thereof."
  {:db/ident :oa/bookmarking,
   :rdf/type [:oa/Motivation :skos/Concept :rdfs/Resource],
   :rdfs/comment
   "The motivation for when the user intends to create a bookmark to the Target or part thereof.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "bookmarking"})

(def ^{:private true} cachedSource
  "A object of the relationship is a copy of the Source resource's representation, appropriate for the Annotation."
  {:db/ident :oa/cachedSource,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A object of the relationship is a copy of the Source resource's representation, appropriate for the Annotation.",
   :rdfs/domain :oa/TimeState,
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "cachedSource",
   :rdfs/subPropertyOf :oa/cachedSource})

(def ^{:private true} canonical
  "A object of the relationship is the canonical IRI that can always be used to deduplicate the Annotation, regardless of the current IRI used to access the representation."
  {:db/ident :oa/canonical,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A object of the relationship is the canonical IRI that can always be used to deduplicate the Annotation, regardless of the current IRI used to access the representation.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "canonical",
   :rdfs/subPropertyOf :oa/canonical})

(def classifying
  "The motivation for when the user intends to that classify the Target as something."
  {:db/ident :oa/classifying,
   :rdf/type [:oa/Motivation :rdfs/Resource :skos/Concept],
   :rdfs/comment
   "The motivation for when the user intends to that classify the Target as something.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "classifying"})

(def commenting
  "The motivation for when the user intends to comment about the Target."
  {:db/ident :oa/commenting,
   :rdf/type [:oa/Motivation :rdfs/Resource :skos/Concept],
   :rdfs/comment
   "The motivation for when the user intends to comment about the Target.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "commenting"})

(def describing
  "The motivation for when the user intends to describe the Target, as opposed to a comment about them."
  {:db/ident :oa/describing,
   :rdf/type [:oa/Motivation :rdfs/Resource :skos/Concept],
   :rdfs/comment
   "The motivation for when the user intends to describe the Target, as opposed to a comment about them.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "describing"})

(def editing
  "The motivation for when the user intends to request a change or edit to the Target resource."
  {:db/ident :oa/editing,
   :rdf/type [:oa/Motivation :skos/Concept :rdfs/Resource],
   :rdfs/comment
   "The motivation for when the user intends to request a change or edit to the Target resource.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "editing"})

(def ^{:private true} end
  "The end property is used to convey the 0-based index of the end position of a range of content."
  {:db/ident :oa/end,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The end property is used to convey the 0-based index of the end position of a range of content.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "end",
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :oa/end})

(def ^{:private true} exact
  "The object of the predicate is a copy of the text which is being selected, after normalization."
  {:db/ident :oa/exact,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The object of the predicate is a copy of the text which is being selected, after normalization.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "exact",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :oa/exact})

(def ^{:private true} hasBody
  "The object of the relationship is a resource that is a body of the Annotation."
  {:db/ident :oa/hasBody,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The object of the relationship is a resource that is a body of the Annotation.",
   :rdfs/domain :oa/Annotation,
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "hasBody",
   :rdfs/subPropertyOf :oa/hasBody})

(def ^{:private true} hasEndSelector
  "The relationship between a RangeSelector and the Selector that describes the end position of the range."
  {:db/ident :oa/hasEndSelector,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The relationship between a RangeSelector and the Selector that describes the end position of the range. ",
   :rdfs/domain :oa/RangeSelector,
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "hasEndSelector",
   :rdfs/range :oa/Selector,
   :rdfs/subPropertyOf :oa/hasEndSelector})

(def ^{:private true} hasPurpose
  "The purpose served by the resource in the Annotation."
  {:db/ident           :oa/hasPurpose,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The purpose served by the resource in the Annotation.",
   :rdfs/isDefinedBy   "http://www.w3.org/ns/oa#",
   :rdfs/label         "hasPurpose",
   :rdfs/range         :oa/Motivation,
   :rdfs/subPropertyOf :oa/hasPurpose})

(def ^{:private true} hasScope
  "The scope or context in which the resource is used within the Annotation."
  {:db/ident :oa/hasScope,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The scope or context in which the resource is used within the Annotation.",
   :rdfs/domain :oa/SpecificResource,
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "hasScope",
   :rdfs/subPropertyOf :oa/hasScope})

(def ^{:private true} hasSelector
  "The object of the relationship is a Selector that describes the segment or region of interest within the source resource. Please note that the domain ( oa:ResourceSelection ) is not used directly in the Web Annotation model."
  {:db/ident :oa/hasSelector,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The object of the relationship is a Selector that describes the segment or region of interest within the source resource.  Please note that the domain ( oa:ResourceSelection ) is not used directly in the Web Annotation model.",
   :rdfs/domain :oa/ResourceSelection,
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "hasSelector",
   :rdfs/range :oa/Selector,
   :rdfs/subPropertyOf :oa/hasSelector})

(def ^{:private true} hasSource
  "The resource that the ResourceSelection, or its subclass SpecificResource, is refined from, or more specific than. Please note that the domain ( oa:ResourceSelection ) is not used directly in the Web Annotation model."
  {:db/ident :oa/hasSource,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The resource that the ResourceSelection, or its subclass SpecificResource, is refined from, or more specific than. Please note that the domain ( oa:ResourceSelection ) is not used directly in the Web Annotation model.",
   :rdfs/domain :oa/ResourceSelection,
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "hasSource",
   :rdfs/subPropertyOf :oa/hasSource})

(def ^{:private true} hasStartSelector
  "The relationship between a RangeSelector and the Selector that describes the start position of the range."
  {:db/ident :oa/hasStartSelector,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The relationship between a RangeSelector and the Selector that describes the start position of the range. ",
   :rdfs/domain :oa/RangeSelector,
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "hasStartSelector",
   :rdfs/range :oa/Selector,
   :rdfs/subPropertyOf :oa/hasStartSelector})

(def ^{:private true} hasState
  "The relationship between the ResourceSelection, or its subclass SpecificResource, and a State resource. Please note that the domain ( oa:ResourceSelection ) is not used directly in the Web Annotation model."
  {:db/ident :oa/hasState,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The relationship between the ResourceSelection, or its subclass SpecificResource, and a State resource. Please note that the domain ( oa:ResourceSelection ) is not used directly in the Web Annotation model.",
   :rdfs/domain :oa/ResourceSelection,
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "hasState",
   :rdfs/range :oa/State,
   :rdfs/subPropertyOf :oa/hasState})

(def ^{:private true} hasTarget
  "The relationship between an Annotation and its Target."
  {:db/ident           :oa/hasTarget,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The relationship between an Annotation and its Target.",
   :rdfs/domain        :oa/Annotation,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/oa#",
   :rdfs/label         "hasTarget",
   :rdfs/subPropertyOf :oa/hasTarget})

(def highlighting
  "The motivation for when the user intends to highlight the Target resource or segment of it."
  {:db/ident :oa/highlighting,
   :rdf/type [:oa/Motivation :rdfs/Resource :skos/Concept],
   :rdfs/comment
   "The motivation for when the user intends to highlight the Target resource or segment of it.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "highlighting"})

(def identifying
  "The motivation for when the user intends to assign an identity to the Target or identify what is being depicted or described in the Target."
  {:db/ident :oa/identifying,
   :rdf/type [:oa/Motivation :skos/Concept :rdfs/Resource],
   :rdfs/comment
   "The motivation for when the user intends to assign an identity to the Target or identify what is being depicted or described in the Target.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "identifying"})

(def linking
  "The motivation for when the user intends to link to a resource related to the Target."
  {:db/ident :oa/linking,
   :rdf/type [:oa/Motivation :skos/Concept :rdfs/Resource],
   :rdfs/comment
   "The motivation for when the user intends to link to a resource related to the Target.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "linking"})

(def ^{:private true} ltrDirection
  "The direction of text that is read from left to right."
  {:db/ident         :oa/ltrDirection,
   :rdf/type         [:oa/Direction :rdfs/Resource],
   :rdfs/comment     "The direction of text that is read from left to right.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label       "ltrDirection"})

(def moderating
  "The motivation for when the user intends to assign some value or quality to the Target."
  {:db/ident :oa/moderating,
   :rdf/type [:oa/Motivation :skos/Concept :rdfs/Resource],
   :rdfs/comment
   "The motivation for when the user intends to assign some value or quality to the Target.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "moderating"})

(def ^{:private true} motivatedBy
  "The relationship between an Annotation and a Motivation that describes the reason for the Annotation's creation."
  {:db/ident :oa/motivatedBy,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The relationship between an Annotation and a Motivation that describes the reason for the Annotation's creation.",
   :rdfs/domain :oa/Annotation,
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "motivatedBy",
   :rdfs/range :oa/Motivation,
   :rdfs/subPropertyOf :oa/motivatedBy})

(def ^{:private true} prefix
  "The object of the property is a snippet of content that occurs immediately before the content which is being selected by the Selector."
  {:db/ident :oa/prefix,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The object of the property is a snippet of content that occurs immediately before the content which is being selected by the Selector.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "prefix",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :oa/prefix})

(def ^{:private true} processingLanguage
  "The object of the property is the language that should be used for textual processing algorithms when dealing with the content of the resource, including hyphenation, line breaking, which font to use for rendering and so forth. The value must follow the recommendations of BCP47."
  {:db/ident :oa/processingLanguage,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The object of the property is the language that should be used for textual processing algorithms when dealing with the content of the resource, including hyphenation, line breaking, which font to use for rendering and so forth.  The value must follow the recommendations of BCP47.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "processingLanguage",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :oa/processingLanguage})

(def questioning
  "The motivation for when the user intends to ask a question about the Target."
  {:db/ident :oa/questioning,
   :rdf/type [:oa/Motivation :skos/Concept :rdfs/Resource],
   :rdfs/comment
   "The motivation for when the user intends to ask a question about the Target.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "questioning"})

(def ^{:private true} refinedBy
  "The relationship between a Selector and another Selector or a State and a Selector or State that should be applied to the results of the first to refine the processing of the source resource."
  {:db/ident :oa/refinedBy,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The relationship between a Selector and another Selector or a State and a Selector or State that should be applied to the results of the first to refine the processing of the source resource. ",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "refinedBy",
   :rdfs/subPropertyOf :oa/refinedBy})

(def ^{:private true} renderedVia
  "A system that was used by the application that created the Annotation to render the resource."
  {:db/ident :oa/renderedVia,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A system that was used by the application that created the Annotation to render the resource.",
   :rdfs/domain :oa/SpecificResource,
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "renderedVia",
   :rdfs/subPropertyOf :oa/renderedVia})

(def replying
  "The motivation for when the user intends to reply to a previous statement, either an Annotation or another resource."
  {:db/ident :oa/replying,
   :rdf/type [:oa/Motivation :skos/Concept :rdfs/Resource],
   :rdfs/comment
   "The motivation for when the user intends to reply to a previous statement, either an Annotation or another resource.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "replying"})

(def ^{:private true} rtlDirection
  "The direction of text that is read from right to left."
  {:db/ident         :oa/rtlDirection,
   :rdf/type         [:oa/Direction :rdfs/Resource],
   :rdfs/comment     "The direction of text that is read from right to left.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label       "rtlDirection"})

(def ^{:private true} sourceDate
  "The timestamp at which the Source resource should be interpreted as being applicable to the Annotation."
  {:db/ident :oa/sourceDate,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The timestamp at which the Source resource should be interpreted as being applicable to the Annotation.",
   :rdfs/domain :oa/TimeState,
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "sourceDate",
   :rdfs/range :xsd/dateTime,
   :rdfs/subPropertyOf :oa/sourceDate})

(def ^{:private true} sourceDateEnd
  "The end timestamp of the interval over which the Source resource should be interpreted as being applicable to the Annotation."
  {:db/ident :oa/sourceDateEnd,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The end timestamp of the interval over which the Source resource should be interpreted as being applicable to the Annotation.",
   :rdfs/domain :oa/TimeState,
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "sourceDateEnd",
   :rdfs/range :xsd/dateTime,
   :rdfs/subPropertyOf :oa/sourceDateEnd})

(def ^{:private true} sourceDateStart
  "The start timestamp of the interval over which the Source resource should be interpreted as being applicable to the Annotation."
  {:db/ident :oa/sourceDateStart,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The start timestamp of the interval over which the Source resource should be interpreted as being applicable to the Annotation.",
   :rdfs/domain :oa/TimeState,
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "sourceDateStart",
   :rdfs/range :xsd/dateTime,
   :rdfs/subPropertyOf :oa/sourceDateStart})

(def ^{:private true} start
  "The start position in a 0-based index at which a range of content is selected from the data in the source resource."
  {:db/ident :oa/start,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The start position in a 0-based index at which a range of content is selected from the data in the source resource.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "start",
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :oa/start})

(def ^{:private true} styleClass
  "The name of the class used in the CSS description referenced from the Annotation that should be applied to the Specific Resource."
  {:db/ident :oa/styleClass,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The name of the class used in the CSS description referenced from the Annotation that should be applied to the Specific Resource.",
   :rdfs/domain :oa/SpecificResource,
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "styleClass",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :oa/styleClass})

(def ^{:private true} styledBy
  "A reference to a Stylesheet that should be used to apply styles to the Annotation rendering."
  {:db/ident :oa/styledBy,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A reference to a Stylesheet that should be used to apply styles to the Annotation rendering.",
   :rdfs/domain :oa/Annotation,
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "styledBy",
   :rdfs/range :oa/Style,
   :rdfs/subPropertyOf :oa/styledBy})

(def ^{:private true} suffix
  "The snippet of text that occurs immediately after the text which is being selected."
  {:db/ident :oa/suffix,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The snippet of text that occurs immediately after the text which is being selected.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "suffix",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :oa/suffix})

(def tagging
  "The motivation for when the user intends to associate a tag with the Target."
  {:db/ident :oa/tagging,
   :rdf/type [:oa/Motivation :rdfs/Resource :skos/Concept],
   :rdfs/comment
   "The motivation for when the user intends to associate a tag with the Target.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "tagging"})

(def ^{:private true} textDirection
  "The direction of the text of the subject resource. There MUST only be one text direction associated with any given resource."
  {:db/ident :oa/textDirection,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The direction of the text of the subject resource. There MUST only be one text direction associated with any given resource.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "textDirection",
   :rdfs/range :oa/Direction,
   :rdfs/subPropertyOf :oa/textDirection})

(def ^{:private true} via
  "A object of the relationship is a resource from which the source resource was retrieved by the providing system."
  {:db/ident :oa/via,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A object of the relationship is a resource from which the source resource was retrieved by the providing system.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/oa#",
   :rdfs/label "via",
   :rdfs/subPropertyOf :oa/via})

(def ^{:private true} DataSet
  {:db/ident        :qb/DataSet,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :qb/DataSet})

(def ^{:private true} Observation
  {:db/ident        :qb/Observation,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :qb/Observation})

(def ^{:private true} Graph
  {:db/ident        :rdfg/Graph,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :rdfg/Graph})

(def ^{:private true} Concept
  {:db/ident        :skos/Concept,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :skos/Concept})

(def ^{:private true} Concept
  {:db/ident        :skos/Concept,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :skos/Concept})