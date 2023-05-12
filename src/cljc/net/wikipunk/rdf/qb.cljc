(ns net.wikipunk.rdf.qb
  "Vocabulary for multi-dimensional (e.g. statistical) data publishing"
  {:dcterms/contributor [{:foaf/mbox "richard@cyganiak.de"}
                         {:foaf/mbox "ian@epimorphics.com"}
                         {:foaf/mbox "dave@epimorphics.com"}
                         {:foaf/mbox "jeni@jenitennison.com"}
                         {:foaf/mbox "arofan.gregory@earthlink.net"}],
   :dcterms/created #inst "2010-07-12T00:00:00.000-04:00",
   :dcterms/license "http://www.opendatacommons.org/licenses/pddl/1.0/",
   :dcterms/modified [#inst "2010-11-27T00:00:00.000-05:00"
                      #inst "2013-07-26T00:00:00.000-04:00"
                      #inst "2013-03-02T00:00:00.000-05:00"],
   :dcterms/title
   "Vocabulary for multi-dimensional (e.g. statistical) data publishing",
   :owl/versionInfo "0.2",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "qb"      "http://purl.org/linked-data/cube#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "scovo"   "http://purl.org/NET/scovo#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#",
                       "void"    "http://rdfs.org/ns/void#",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "qb",
   :rdfa/uri "http://purl.org/linked-data/cube",
   :rdfs/comment
   "This vocabulary allows multi-dimensional data, such as statistics, to be published in RDF. It is based on the core information model from SDMX (and thus also DDI).",
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/TR/vocab-data-cube/"},
   :rdfs/label "The data cube vocabulary"})

(def Attachable
  "Abstract superclass for everything that can have attributes and dimensions"
  {:db/ident :qb/Attachable,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "Abstract superclass for everything that can have attributes and dimensions",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "Attachable (abstract)",
   :rdfs/subClassOf [:rdfs/Resource :qb/Attachable]})

(def AttributeProperty
  "The class of components which represent attributes of observations in the cube, e.g. unit of measurement"
  {:db/ident :qb/AttributeProperty,
   :owl/disjointWith :qb/MeasureProperty,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "The class of components which represent attributes of observations in the cube, e.g. unit of measurement",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "Attribute property",
   :rdfs/subClassOf
   [:qb/ComponentProperty :qb/AttributeProperty :rdf/Property :rdfs/Resource]})

(def CodedProperty
  "Superclass of all coded ComponentProperties"
  {:db/ident         :qb/CodedProperty,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "Superclass of all coded ComponentProperties",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label       "Coded property",
   :rdfs/subClassOf  [:qb/ComponentProperty
                      :qb/CodedProperty
                      :rdf/Property
                      :rdfs/Resource]})

(def ComponentProperty
  "Abstract super-property of all properties representing dimensions, attributes or measures"
  {:db/ident :qb/ComponentProperty,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "Abstract super-property of all properties representing dimensions, attributes or measures",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "Component property (abstract)",
   :rdfs/subClassOf [:rdfs/Resource :rdf/Property :qb/ComponentProperty]})

(def ComponentSet
  "Abstract class of things which reference one or more ComponentProperties"
  {:db/ident :qb/ComponentSet,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "Abstract class of things which reference one or more ComponentProperties",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "Component set",
   :rdfs/subClassOf [:rdfs/Resource :qb/ComponentSet]})

(def ComponentSpecification
  "Used to define properties of a component (attribute, dimension etc) which are specific to its usage in a DSD."
  {:db/ident :qb/ComponentSpecification,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "Used to define properties of a component (attribute, dimension etc) which are specific to its usage in a DSD.",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "Component specification",
   :rdfs/subClassOf
   [:qb/ComponentSet :qb/ComponentSpecification :rdfs/Resource]})

(def DataSet
  "Represents a collection of observations, possibly organized into various slices, conforming to some common dimensional structure."
  {:db/ident :qb/DataSet,
   :owl/equivalentClass :scovo/Dataset,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "Represents a collection of observations, possibly organized into various slices, conforming to some common dimensional structure.",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "Data set",
   :rdfs/subClassOf [:rdfs/Resource :qb/Attachable :qb/DataSet]})

(def DataStructureDefinition
  "Defines the structure of a DataSet or slice"
  {:db/ident         :qb/DataStructureDefinition,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "Defines the structure of a DataSet or slice",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label       "Data structure definition",
   :rdfs/subClassOf  [:qb/ComponentSet
                      :qb/DataStructureDefinition
                      :rdfs/Resource]})

(def DimensionProperty
  "The class of components which represent the dimensions of the cube"
  {:db/ident :qb/DimensionProperty,
   :owl/disjointWith :qb/MeasureProperty,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "The class of components which represent the dimensions of the cube",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "Dimension property",
   :rdfs/subClassOf [:qb/CodedProperty
                     :qb/ComponentProperty
                     :qb/DimensionProperty
                     :rdf/Property
                     :rdfs/Resource]})

(def HierarchicalCodeList
  "Represents a generalized hierarchy of concepts which can be used for coding. The hierarchy is defined by one or more roots together with a property which relates concepts in the hierarchy to thier child concept . The same concepts may be members of multiple hierarchies provided that different qb:parentChildProperty values are used for each hierarchy."
  {:db/ident :qb/HierarchicalCodeList,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "Represents a generalized hierarchy of concepts which can be used for coding. The hierarchy is defined by one or more roots together with a property which relates concepts in the hierarchy to thier child concept .  The same concepts may be members of multiple hierarchies provided that different qb:parentChildProperty values are used for each hierarchy.",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "Hierarchical Code List",
   :rdfs/subClassOf [:rdfs/Resource :qb/HierarchicalCodeList]})

(def MeasureProperty
  "The class of components which represent the measured value of the phenomenon being observed"
  {:db/ident :qb/MeasureProperty,
   :owl/disjointWith [:qb/DimensionProperty :qb/AttributeProperty],
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "The class of components which represent the measured value of the phenomenon being observed",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "Measure property",
   :rdfs/subClassOf
   [:qb/ComponentProperty :qb/MeasureProperty :rdf/Property :rdfs/Resource]})

(def Observation
  "A single observation in the cube, may have one or more associated measured values"
  {:db/ident :qb/Observation,
   :owl/equivalentClass :scovo/Item,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "A single observation in the cube, may have one or more associated measured values",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "Observation",
   :rdfs/subClassOf [:rdfs/Resource :qb/Attachable :qb/Observation]})

(def ObservationGroup
  "A, possibly arbitrary, group of observations."
  {:db/ident         :qb/ObservationGroup,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "A, possibly arbitrary, group of observations.",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label       "Observation Group",
   :rdfs/subClassOf  [:rdfs/Resource :qb/ObservationGroup]})

(def Slice
  "Denotes a subset of a DataSet defined by fixing a subset of the dimensional values, component properties on the Slice"
  {:db/ident :qb/Slice,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "Denotes a subset of a DataSet defined by fixing a subset of the dimensional values, component properties on the Slice",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "Slice",
   :rdfs/subClassOf
   [:qb/Attachable :qb/ObservationGroup :qb/Slice :rdfs/Resource]})

(def SliceKey
  "Denotes a subset of the component properties of a DataSet which are fixed in the corresponding slices"
  {:db/ident :qb/SliceKey,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "Denotes a subset of the component properties of a DataSet which are fixed in the corresponding slices",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "Slice key",
   :rdfs/subClassOf [:qb/ComponentSet :qb/SliceKey :rdfs/Resource]})

(def attribute
  "An alternative to qb:componentProperty which makes explicit that the component is a attribute"
  {:db/ident :qb/attribute,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "An alternative to qb:componentProperty which makes explicit that the component is a attribute",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "attribute",
   :rdfs/range :qb/AttributeProperty,
   :rdfs/subPropertyOf [:qb/componentProperty :qb/attribute]})

(def codeList
  "gives the code list associated with a CodedProperty"
  {:db/ident           :qb/codeList,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "gives the code list associated with a CodedProperty",
   :rdfs/domain        :qb/CodedProperty,
   :rdfs/isDefinedBy   "http://purl.org/linked-data/cube",
   :rdfs/label         "code list",
   :rdfs/range         {:owl/unionOf [:skos/ConceptScheme
                                      :skos/Collection
                                      :qb/HierarchicalCodeList]},
   :rdfs/subPropertyOf :qb/codeList})

(def component
  "indicates a component specification which is included in the structure of the dataset"
  {:db/ident :qb/component,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "indicates a component specification which is included in the structure of the dataset",
   :rdfs/domain :qb/DataStructureDefinition,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "component specification",
   :rdfs/range :qb/ComponentSpecification,
   :rdfs/subPropertyOf :qb/component})

(def componentAttachment
  "Indicates the level at which the component property should be attached, this might an qb:DataSet, qb:Slice or qb:Observation, or a qb:MeasureProperty."
  {:db/ident :qb/componentAttachment,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Indicates the level at which the component property should be attached, this might an qb:DataSet, qb:Slice or qb:Observation, or a qb:MeasureProperty.",
   :rdfs/domain :qb/ComponentSpecification,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "component attachment",
   :rdfs/range :rdfs/Class,
   :rdfs/subPropertyOf :qb/componentAttachment})

(def componentProperty
  "indicates a ComponentProperty (i.e. attribute/dimension) expected on a DataSet, or a dimension fixed in a SliceKey"
  {:db/ident :qb/componentProperty,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "indicates a ComponentProperty (i.e. attribute/dimension) expected on a DataSet, or a dimension fixed in a SliceKey",
   :rdfs/domain :qb/ComponentSet,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "component",
   :rdfs/range :qb/ComponentProperty,
   :rdfs/subPropertyOf :qb/componentProperty})

(def componentRequired
  "Indicates whether a component property is required (true) or optional (false) in the context of a DSD. Only applicable to components correspond to an attribute. Defaults to false (optional)."
  {:db/ident :qb/componentRequired,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "Indicates whether a component property is required (true) or optional (false) in the context of a DSD. Only applicable\n    to components correspond to an attribute. Defaults to false (optional).",
   :rdfs/domain :qb/ComponentSpecification,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "component required",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :qb/componentRequired})

(def concept
  "gives the concept which is being measured or indicated by a ComponentProperty"
  {:db/ident :qb/concept,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "gives the concept which is being measured or indicated by a ComponentProperty",
   :rdfs/domain :qb/ComponentProperty,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "concept",
   :rdfs/range :skos/Concept,
   :rdfs/subPropertyOf :qb/concept})

(def dataSet
  "indicates the data set of which this observation is a part"
  {:db/ident :qb/dataSet,
   :owl/equivalentProperty :scovo/dataset,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "indicates the data set of which this observation is a part",
   :rdfs/domain :qb/Observation,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "data set",
   :rdfs/range :qb/DataSet,
   :rdfs/subPropertyOf :qb/dataSet})

(def dimension
  "An alternative to qb:componentProperty which makes explicit that the component is a dimension"
  {:db/ident :qb/dimension,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "An alternative to qb:componentProperty which makes explicit that the component is a dimension",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "dimension",
   :rdfs/range :qb/DimensionProperty,
   :rdfs/subPropertyOf [:qb/componentProperty :qb/dimension]})

(def hierarchyRoot
  "Specifies a root of the hierarchy. A hierarchy may have multiple roots but must have at least one."
  {:db/ident :qb/hierarchyRoot,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "Specifies a root of the hierarchy. A hierarchy may have multiple roots but must have at least one.",
   :rdfs/domain :qb/HierarchicalCodeList,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/subPropertyOf :qb/hierarchyRoot})

(def measure
  "An alternative to qb:componentProperty which makes explicit that the component is a measure"
  {:db/ident :qb/measure,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "An alternative to qb:componentProperty which makes explicit that the component is a measure",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "measure",
   :rdfs/range :qb/MeasureProperty,
   :rdfs/subPropertyOf [:qb/componentProperty :qb/measure]})

(def measureDimension
  "An alternative to qb:componentProperty which makes explicit that the component is a measure dimension"
  {:db/ident :qb/measureDimension,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "An alternative to qb:componentProperty which makes explicit that the component is a measure dimension",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "measure dimension",
   :rdfs/range :qb/DimensionProperty,
   :rdfs/subPropertyOf [:qb/componentProperty :qb/measureDimension]})

(def measureType
  "Generic measure dimension, the value of this dimension indicates which measure (from the set of measures in the DSD) is being given by the obsValue (or other primary measure)"
  {:db/ident :qb/measureType,
   :rdf/type [:rdf/Property
              :qb/DimensionProperty
              :qb/CodedProperty
              :rdfs/Resource
              :qb/ComponentProperty],
   :rdfs/comment
   "Generic measure dimension, the value of this dimension indicates which measure (from the set of measures in the DSD) is being given by the obsValue (or other primary measure)",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "measure type",
   :rdfs/range :qb/MeasureProperty,
   :rdfs/subPropertyOf :qb/measureType})

(def observation
  "indicates a observation contained within this slice of the data set"
  {:db/ident :qb/observation,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "indicates a observation contained within this slice of the data set",
   :rdfs/domain :qb/ObservationGroup,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "observation",
   :rdfs/range :qb/Observation,
   :rdfs/subPropertyOf :qb/observation})

(def observationGroup
  "Indicates a group of observations. The domain of this property is left open so that a group may be attached to different resources and need not be restricted to a single DataSet"
  {:db/ident :qb/observationGroup,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "Indicates a group of observations. The domain of this property is left open so that a group may be attached to different resources and need not be restricted to a single DataSet",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "observation group",
   :rdfs/range :qb/ObservationGroup,
   :rdfs/subPropertyOf :qb/observationGroup})

(def order
  "indicates a priority order for the components of sets with this structure, used to guide presentations - lower order numbers come before higher numbers, un-numbered components come last"
  {:db/ident :qb/order,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "indicates a priority order for the components of sets with this structure, used to guide presentations - lower order numbers come before higher numbers, un-numbered components come last",
   :rdfs/domain :qb/ComponentSpecification,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "order",
   :rdfs/range :xsd/int,
   :rdfs/subPropertyOf :qb/order})

(def parentChildProperty
  "Specifies a property which relates a parent concept in the hierarchy to a child concept."
  {:db/ident :qb/parentChildProperty,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "Specifies a property which relates a parent concept in the hierarchy to a child concept.",
   :rdfs/domain :qb/HierarchicalCodeList,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "parent-child property",
   :rdfs/range :rdf/Property,
   :rdfs/subPropertyOf :qb/parentChildProperty})

(def slice
  "Indicates a subset of a DataSet defined by fixing a subset of the dimensional values"
  {:db/ident :qb/slice,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "Indicates a subset of a DataSet defined by fixing a subset of the dimensional values",
   :rdfs/domain :qb/DataSet,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "slice",
   :rdfs/range :qb/Slice,
   :rdfs/subPropertyOf [:qb/observationGroup :qb/slice]})

(def sliceKey
  "indicates a slice key which is used for slices in this dataset"
  {:db/ident :qb/sliceKey,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "indicates a slice key which is used for slices in this dataset",
   :rdfs/domain :qb/DataStructureDefinition,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "slice key",
   :rdfs/range :qb/SliceKey,
   :rdfs/subPropertyOf :qb/sliceKey})

(def sliceStructure
  "indicates the sub-key corresponding to this slice"
  {:db/ident           :qb/sliceStructure,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       "indicates the sub-key corresponding to this slice",
   :rdfs/domain        :qb/Slice,
   :rdfs/isDefinedBy   "http://purl.org/linked-data/cube",
   :rdfs/label         "slice structure",
   :rdfs/range         :qb/SliceKey,
   :rdfs/subPropertyOf :qb/sliceStructure})

(def structure
  "indicates the structure to which this data set conforms"
  {:db/ident :qb/structure,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment "indicates the structure to which this data set conforms",
   :rdfs/domain :qb/DataSet,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label "structure",
   :rdfs/range :qb/DataStructureDefinition,
   :rdfs/subPropertyOf :qb/structure})