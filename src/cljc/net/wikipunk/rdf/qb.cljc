(ns net.wikipunk.rdf.qb
  {:dcterms/contributor
   #{{:foaf/mbox "arofan.gregory@earthlink.net"}
     {:foaf/mbox "ian@epimorphics.com"} {:foaf/mbox "richard@cyganiak.de"}
     {:foaf/mbox "jeni@jenitennison.com"} {:foaf/mbox "dave@epimorphics.com"}},
   :dcterms/created #inst "2010-07-12T00:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI
                     "http://www.opendatacommons.org/licenses/pddl/1.0/"},
   :dcterms/modified #{#inst "2013-07-26T00:00:00.000-00:00"
                       #inst "2010-11-27T00:00:00.000-00:00"
                       #inst "2013-03-02T00:00:00.000-00:00"},
   :dcterms/title
   "Vocabulary for multi-dimensional (e.g. statistical) data publishing",
   :namespaces {"dcterms" "http://purl.org/dc/terms/",
                "foaf"    "http://xmlns.com/foaf/0.1/",
                "owl"     "http://www.w3.org/2002/07/owl#",
                "qb"      "http://purl.org/linked-data/cube#",
                "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                "scovo"   "http://purl.org/NET/scovo#",
                "skos"    "http://www.w3.org/2004/02/skos/core#",
                "void"    "http://rdfs.org/ns/void#",
                "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :owl/versionInfo "0.2",
   :rdf/type :owl/Ontology,
   :rdfa/prefix "qb",
   :rdfa/uri "http://purl.org/linked-data/cube#",
   :rdfs/comment
   "This vocabulary allows multi-dimensional data, such as statistics, to be published in RDF. It is based on the core information model from SDMX (and thus also DDI).",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/TR/vocab-data-cube/"},
   :rdfs/label "The data cube vocabulary",
   :xsd/anyURI "http://purl.org/linked-data/cube"})

(def Attachable
  {:db/ident :qb/Attachable,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Abstract superclass for everything that can have attributes and dimensions"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Attachable (abstract)"}})

(def AttributeProperty
  {:db/ident :qb/AttributeProperty,
   :owl/disjointWith :qb/MeasureProperty,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The class of components which represent attributes of observations in the cube, e.g. unit of measurement"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Attribute property"},
   :rdfs/subClassOf :qb/ComponentProperty})

(def CodedProperty
  {:db/ident         :qb/CodedProperty,
   :rdf/type         #{:rdfs/Class :owl/Class},
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "Superclass of all coded ComponentProperties"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Coded property"},
   :rdfs/subClassOf  :qb/ComponentProperty})

(def ComponentProperty
  {:db/ident :qb/ComponentProperty,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Abstract super-property of all properties representing dimensions, attributes or measures"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Component property (abstract)"},
   :rdfs/subClassOf :rdf/Property})

(def ComponentSet
  {:db/ident :qb/ComponentSet,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Abstract class of things which reference one or more ComponentProperties"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Component set"}})

(def ComponentSpecification
  {:db/ident :qb/ComponentSpecification,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to define properties of a component (attribute, dimension etc) which are specific to its usage in a DSD."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Component specification"},
   :rdfs/subClassOf :qb/ComponentSet})

(def DataSet
  {:db/ident :qb/DataSet,
   :owl/equivalentClass :scovo/Dataset,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Represents a collection of observations, possibly organized into various slices, conforming to some common dimensional structure."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data set"},
   :rdfs/subClassOf :qb/Attachable})

(def DataStructureDefinition
  {:db/ident         :qb/DataStructureDefinition,
   :rdf/type         #{:rdfs/Class :owl/Class},
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "Defines the structure of a DataSet or slice"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Data structure definition"},
   :rdfs/subClassOf  :qb/ComponentSet})

(def DimensionProperty
  {:db/ident :qb/DimensionProperty,
   :owl/disjointWith :qb/MeasureProperty,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The class of components which represent the dimensions of the cube"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Dimension property"},
   :rdfs/subClassOf #{:qb/ComponentProperty :qb/CodedProperty}})

(def HierarchicalCodeList
  {:db/ident :qb/HierarchicalCodeList,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Represents a generalized hierarchy of concepts which can be used for coding. The hierarchy is defined by one or more roots together with a property which relates concepts in the hierarchy to thier child concept .  The same concepts may be members of multiple hierarchies provided that different qb:parentChildProperty values are used for each hierarchy."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Hierarchical Code List"}})

(def MeasureProperty
  {:db/ident :qb/MeasureProperty,
   :owl/disjointWith #{:qb/AttributeProperty :qb/DimensionProperty},
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The class of components which represent the measured value of the phenomenon being observed"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Measure property"},
   :rdfs/subClassOf :qb/ComponentProperty})

(def Observation
  {:db/ident :qb/Observation,
   :owl/equivalentClass :scovo/Item,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A single observation in the cube, may have one or more associated measured values"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Observation"},
   :rdfs/subClassOf :qb/Attachable})

(def ObservationGroup
  {:db/ident         :qb/ObservationGroup,
   :rdf/type         #{:rdfs/Class :owl/Class},
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A, possibly arbitrary, group of observations."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Observation Group"}})

(def Slice
  {:db/ident :qb/Slice,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Denotes a subset of a DataSet defined by fixing a subset of the dimensional values, component properties on the Slice"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Slice"},
   :rdfs/subClassOf #{:qb/Attachable :qb/ObservationGroup}})

(def SliceKey
  {:db/ident :qb/SliceKey,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Denotes a subset of the component properties of a DataSet which are fixed in the corresponding slices"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Slice key"},
   :rdfs/subClassOf :qb/ComponentSet})

(def attribute
  {:db/ident :qb/attribute,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An alternative to qb:componentProperty which makes explicit that the component is a attribute"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "attribute"},
   :rdfs/range :qb/AttributeProperty,
   :rdfs/subPropertyOf :qb/componentProperty})

(def codeList
  {:db/ident         :qb/codeList,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "gives the code list associated with a CodedProperty"},
   :rdfs/domain      :qb/CodedProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "code list"},
   :rdfs/range       {:owl/unionOf [:skos/ConceptScheme
                                    :skos/Collection
                                    :qb/HierarchicalCodeList]}})

(def component
  {:db/ident :qb/component,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "indicates a component specification which is included in the structure of the dataset"},
   :rdfs/domain :qb/DataStructureDefinition,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "component specification"},
   :rdfs/range :qb/ComponentSpecification})

(def componentAttachment
  {:db/ident :qb/componentAttachment,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates the level at which the component property should be attached, this might an qb:DataSet, qb:Slice or qb:Observation, or a qb:MeasureProperty."},
   :rdfs/domain :qb/ComponentSpecification,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "component attachment"},
   :rdfs/range :rdfs/Class})

(def componentProperty
  {:db/ident :qb/componentProperty,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "indicates a ComponentProperty (i.e. attribute/dimension) expected on a DataSet, or a dimension fixed in a SliceKey"},
   :rdfs/domain :qb/ComponentSet,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "component"},
   :rdfs/range :qb/ComponentProperty})

(def componentRequired
  {:db/ident :qb/componentRequired,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates whether a component property is required (true) or optional (false) in the context of a DSD. Only applicable\n    to components correspond to an attribute. Defaults to false (optional)."},
   :rdfs/domain :qb/ComponentSpecification,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "component required"},
   :rdfs/range :xsd/boolean})

(def concept
  {:db/ident :qb/concept,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "gives the concept which is being measured or indicated by a ComponentProperty"},
   :rdfs/domain :qb/ComponentProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "concept"},
   :rdfs/range :skos/Concept})

(def dataSet
  {:db/ident :qb/dataSet,
   :owl/equivalentProperty :scovo/dataset,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "indicates the data set of which this observation is a part"},
   :rdfs/domain :qb/Observation,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "data set"},
   :rdfs/range :qb/DataSet})

(def dimension
  {:db/ident :qb/dimension,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An alternative to qb:componentProperty which makes explicit that the component is a dimension"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "dimension"},
   :rdfs/range :qb/DimensionProperty,
   :rdfs/subPropertyOf :qb/componentProperty})

(def hierarchyRoot
  {:db/ident :qb/hierarchyRoot,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies a root of the hierarchy. A hierarchy may have multiple roots but must have at least one."},
   :rdfs/domain :qb/HierarchicalCodeList,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"}})

(def measure
  {:db/ident :qb/measure,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An alternative to qb:componentProperty which makes explicit that the component is a measure"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "measure"},
   :rdfs/range :qb/MeasureProperty,
   :rdfs/subPropertyOf :qb/componentProperty})

(def measureDimension
  {:db/ident :qb/measureDimension,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An alternative to qb:componentProperty which makes explicit that the component is a measure dimension"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "measure dimension"},
   :rdfs/range :qb/DimensionProperty,
   :rdfs/subPropertyOf :qb/componentProperty})

(def measureType
  {:db/ident :qb/measureType,
   :rdf/type #{:rdf/Property :qb/DimensionProperty},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Generic measure dimension, the value of this dimension indicates which measure (from the set of measures in the DSD) is being given by the obsValue (or other primary measure)"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "measure type"},
   :rdfs/range :qb/MeasureProperty})

(def observation
  {:db/ident :qb/observation,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "indicates a observation contained within this slice of the data set"},
   :rdfs/domain :qb/ObservationGroup,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "observation"},
   :rdfs/range :qb/Observation})

(def observationGroup
  {:db/ident :qb/observationGroup,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates a group of observations. The domain of this property is left open so that a group may be attached to different resources and need not be restricted to a single DataSet"},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "observation group"},
   :rdfs/range :qb/ObservationGroup})

(def order
  {:db/ident :qb/order,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "indicates a priority order for the components of sets with this structure, used to guide presentations - lower order numbers come before higher numbers, un-numbered components come last"},
   :rdfs/domain :qb/ComponentSpecification,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "order"},
   :rdfs/range :xsd/int})

(def parentChildProperty
  {:db/ident :qb/parentChildProperty,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies a property which relates a parent concept in the hierarchy to a child concept."},
   :rdfs/domain :qb/HierarchicalCodeList,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "parent-child property"},
   :rdfs/range :rdf/Property})

(def slice
  {:db/ident :qb/slice,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates a subset of a DataSet defined by fixing a subset of the dimensional values"},
   :rdfs/domain :qb/DataSet,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "slice"},
   :rdfs/range :qb/Slice,
   :rdfs/subPropertyOf :qb/observationGroup})

(def sliceKey
  {:db/ident :qb/sliceKey,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "indicates a slice key which is used for slices in this dataset"},
   :rdfs/domain :qb/DataStructureDefinition,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "slice key"},
   :rdfs/range :qb/SliceKey})

(def sliceStructure
  {:db/ident         :qb/sliceStructure,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "indicates the sub-key corresponding to this slice"},
   :rdfs/domain      :qb/Slice,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "slice structure"},
   :rdfs/range       :qb/SliceKey})

(def structure
  {:db/ident :qb/structure,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "indicates the structure to which this data set conforms"},
   :rdfs/domain :qb/DataSet,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/linked-data/cube"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "structure"},
   :rdfs/range :qb/DataStructureDefinition})

(def urn:uuid:0f3126f4-af90-5a9f-a4f2-29c7384c0206
  {:dcterms/contributor
   #{{:foaf/mbox "arofan.gregory@earthlink.net"}
     {:foaf/mbox "ian@epimorphics.com"} {:foaf/mbox "richard@cyganiak.de"}
     {:foaf/mbox "jeni@jenitennison.com"} {:foaf/mbox "dave@epimorphics.com"}},
   :dcterms/created #inst "2010-07-12T00:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI
                     "http://www.opendatacommons.org/licenses/pddl/1.0/"},
   :dcterms/modified #{#inst "2013-07-26T00:00:00.000-00:00"
                       #inst "2010-11-27T00:00:00.000-00:00"
                       #inst "2013-03-02T00:00:00.000-00:00"},
   :dcterms/title
   "Vocabulary for multi-dimensional (e.g. statistical) data publishing",
   :owl/versionInfo "0.2",
   :rdf/type :owl/Ontology,
   :rdfs/comment
   "This vocabulary allows multi-dimensional data, such as statistics, to be published in RDF. It is based on the core information model from SDMX (and thus also DDI).",
   :rdfs/label "The data cube vocabulary",
   :xsd/anyURI "http://purl.org/linked-data/cube"})