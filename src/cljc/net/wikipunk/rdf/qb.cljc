(ns net.wikipunk.rdf.qb
  "Vocabulary for multi-dimensional (e.g. statistical) data publishing"
  {:dcterms/contributor [{:foaf/mbox "arofan.gregory@earthlink.net"}
                         {:foaf/mbox "richard@cyganiak.de"}
                         {:foaf/mbox "dave@epimorphics.com"}
                         {:foaf/mbox "jeni@jenitennison.com"}
                         {:foaf/mbox "ian@epimorphics.com"}],
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
   #voc/lstr
    "Abstract superclass for everything that can have attributes and dimensions@en",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "Attachable (abstract)@en",
   :rdfs/subClassOf [:rdfs/Resource :qb/Attachable]})

(def AttributeProperty
  "The class of components which represent attributes of observations in the cube, e.g. unit of measurement"
  {:db/ident :qb/AttributeProperty,
   :owl/disjointWith :qb/MeasureProperty,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #voc/lstr
    "The class of components which represent attributes of observations in the cube, e.g. unit of measurement@en",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "Attribute property@en",
   :rdfs/subClassOf
   [:qb/ComponentProperty :qb/AttributeProperty :rdfs/Resource :rdf/Property]})

(def CodedProperty
  "Superclass of all coded ComponentProperties"
  {:db/ident         :qb/CodedProperty,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     #voc/lstr "Superclass of all coded ComponentProperties@en",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label       #voc/lstr "Coded property@en",
   :rdfs/subClassOf  [:qb/ComponentProperty
                      :qb/CodedProperty
                      :rdfs/Resource
                      :rdf/Property]})

(def ComponentProperty
  "Abstract super-property of all properties representing dimensions, attributes or measures"
  {:db/ident :qb/ComponentProperty,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #voc/lstr
    "Abstract super-property of all properties representing dimensions, attributes or measures@en",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "Component property (abstract)@en",
   :rdfs/subClassOf [:rdfs/Resource :rdf/Property :qb/ComponentProperty]})

(def ComponentSet
  "Abstract class of things which reference one or more ComponentProperties"
  {:db/ident :qb/ComponentSet,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #voc/lstr
    "Abstract class of things which reference one or more ComponentProperties@en",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "Component set@en",
   :rdfs/subClassOf [:rdfs/Resource :qb/ComponentSet]})

(def ComponentSpecification
  "Used to define properties of a component (attribute, dimension etc) which are specific to its usage in a DSD."
  {:db/ident :qb/ComponentSpecification,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #voc/lstr
    "Used to define properties of a component (attribute, dimension etc) which are specific to its usage in a DSD.@en",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "Component specification@en",
   :rdfs/subClassOf
   [:qb/ComponentSet :qb/ComponentSpecification :rdfs/Resource]})

(def DataSet
  "Represents a collection of observations, possibly organized into various slices, conforming to some common dimensional structure."
  {:db/ident :qb/DataSet,
   :owl/equivalentClass :scovo/Dataset,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #voc/lstr
    "Represents a collection of observations, possibly organized into various slices, conforming to some common dimensional structure.@en",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "Data set@en",
   :rdfs/subClassOf [:rdfs/Resource :qb/Attachable :qb/DataSet]})

(def DataStructureDefinition
  "Defines the structure of a DataSet or slice"
  {:db/ident         :qb/DataStructureDefinition,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     #voc/lstr "Defines the structure of a DataSet or slice@en",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label       #voc/lstr "Data structure definition@en",
   :rdfs/subClassOf  [:qb/ComponentSet
                      :qb/DataStructureDefinition
                      :rdfs/Resource]})

(def DimensionProperty
  "The class of components which represent the dimensions of the cube"
  {:db/ident :qb/DimensionProperty,
   :owl/disjointWith :qb/MeasureProperty,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #voc/lstr
    "The class of components which represent the dimensions of the cube@en",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "Dimension property@en",
   :rdfs/subClassOf [:qb/CodedProperty
                     :qb/ComponentProperty
                     :qb/DimensionProperty
                     :rdfs/Resource
                     :rdf/Property]})

(def HierarchicalCodeList
  "Represents a generalized hierarchy of concepts which can be used for coding. The hierarchy is defined by one or more roots together with a property which relates concepts in the hierarchy to thier child concept . The same concepts may be members of multiple hierarchies provided that different qb:parentChildProperty values are used for each hierarchy."
  {:db/ident :qb/HierarchicalCodeList,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #voc/lstr
    "Represents a generalized hierarchy of concepts which can be used for coding. The hierarchy is defined by one or more roots together with a property which relates concepts in the hierarchy to thier child concept .  The same concepts may be members of multiple hierarchies provided that different qb:parentChildProperty values are used for each hierarchy.@en",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "Hierarchical Code List@en",
   :rdfs/subClassOf [:rdfs/Resource :qb/HierarchicalCodeList]})

(def MeasureProperty
  "The class of components which represent the measured value of the phenomenon being observed"
  {:db/ident :qb/MeasureProperty,
   :owl/disjointWith [:qb/DimensionProperty :qb/AttributeProperty],
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #voc/lstr
    "The class of components which represent the measured value of the phenomenon being observed@en",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "Measure property@en",
   :rdfs/subClassOf
   [:qb/ComponentProperty :qb/MeasureProperty :rdfs/Resource :rdf/Property]})

(def Observation
  "A single observation in the cube, may have one or more associated measured values"
  {:db/ident :qb/Observation,
   :owl/equivalentClass :scovo/Item,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #voc/lstr
    "A single observation in the cube, may have one or more associated measured values@en",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "Observation@en",
   :rdfs/subClassOf [:rdfs/Resource :qb/Attachable :qb/Observation]})

(def ObservationGroup
  "A, possibly arbitrary, group of observations."
  {:db/ident         :qb/ObservationGroup,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     #voc/lstr
                      "A, possibly arbitrary, group of observations.@en",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label       #voc/lstr "Observation Group@en",
   :rdfs/subClassOf  [:rdfs/Resource :qb/ObservationGroup]})

(def Slice
  "Denotes a subset of a DataSet defined by fixing a subset of the dimensional values, component properties on the Slice"
  {:db/ident :qb/Slice,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #voc/lstr
    "Denotes a subset of a DataSet defined by fixing a subset of the dimensional values, component properties on the Slice@en",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "Slice@en",
   :rdfs/subClassOf
   [:qb/Attachable :qb/ObservationGroup :qb/Slice :rdfs/Resource]})

(def SliceKey
  "Denotes a subset of the component properties of a DataSet which are fixed in the corresponding slices"
  {:db/ident :qb/SliceKey,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #voc/lstr
    "Denotes a subset of the component properties of a DataSet which are fixed in the corresponding slices@en",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "Slice key@en",
   :rdfs/subClassOf [:qb/ComponentSet :qb/SliceKey :rdfs/Resource]})

(def attribute
  "An alternative to qb:componentProperty which makes explicit that the component is a attribute"
  {:db/ident :qb/attribute,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "An alternative to qb:componentProperty which makes explicit that the component is a attribute@en",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "attribute@en",
   :rdfs/range :qb/AttributeProperty,
   :rdfs/subPropertyOf [:qb/componentProperty :qb/attribute]})

(def codeList
  "gives the code list associated with a CodedProperty"
  {:db/ident :qb/codeList,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment #voc/lstr
                  "gives the code list associated with a CodedProperty@en",
   :rdfs/domain :qb/CodedProperty,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "code list@en",
   :rdfs/range {:owl/unionOf [:skos/ConceptScheme
                              :skos/Collection
                              :qb/HierarchicalCodeList]},
   :rdfs/subPropertyOf :qb/codeList})

(def component
  "indicates a component specification which is included in the structure of the dataset"
  {:db/ident :qb/component,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "indicates a component specification which is included in the structure of the dataset@en",
   :rdfs/domain :qb/DataStructureDefinition,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "component specification@en",
   :rdfs/range :qb/ComponentSpecification,
   :rdfs/subPropertyOf :qb/component})

(def componentAttachment
  "Indicates the level at which the component property should be attached, this might an qb:DataSet, qb:Slice or qb:Observation, or a qb:MeasureProperty."
  {:db/ident :qb/componentAttachment,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #voc/lstr
    "Indicates the level at which the component property should be attached, this might an qb:DataSet, qb:Slice or qb:Observation, or a qb:MeasureProperty.@en",
   :rdfs/domain :qb/ComponentSpecification,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "component attachment@en",
   :rdfs/range :rdfs/Class,
   :rdfs/subPropertyOf :qb/componentAttachment})

(def componentProperty
  "indicates a ComponentProperty (i.e. attribute/dimension) expected on a DataSet, or a dimension fixed in a SliceKey"
  {:db/ident :qb/componentProperty,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "indicates a ComponentProperty (i.e. attribute/dimension) expected on a DataSet, or a dimension fixed in a SliceKey@en",
   :rdfs/domain :qb/ComponentSet,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "component@en",
   :rdfs/range :qb/ComponentProperty,
   :rdfs/subPropertyOf :qb/componentProperty})

(def componentRequired
  "Indicates whether a component property is required (true) or optional (false) in the context of a DSD. Only applicable to components correspond to an attribute. Defaults to false (optional)."
  {:db/ident :qb/componentRequired,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "Indicates whether a component property is required (true) or optional (false) in the context of a DSD. Only applicable\n    to components correspond to an attribute. Defaults to false (optional).@en",
   :rdfs/domain :qb/ComponentSpecification,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "component required@en",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :qb/componentRequired})

(def concept
  "gives the concept which is being measured or indicated by a ComponentProperty"
  {:db/ident :qb/concept,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "gives the concept which is being measured or indicated by a ComponentProperty@en",
   :rdfs/domain :qb/ComponentProperty,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "concept@en",
   :rdfs/range :skos/Concept,
   :rdfs/subPropertyOf :qb/concept})

(def dataSet
  "indicates the data set of which this observation is a part"
  {:db/ident :qb/dataSet,
   :owl/equivalentProperty :scovo/dataset,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr "indicates the data set of which this observation is a part@en",
   :rdfs/domain :qb/Observation,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "data set@en",
   :rdfs/range :qb/DataSet,
   :rdfs/subPropertyOf :qb/dataSet})

(def dimension
  "An alternative to qb:componentProperty which makes explicit that the component is a dimension"
  {:db/ident :qb/dimension,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "An alternative to qb:componentProperty which makes explicit that the component is a dimension@en",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "dimension@en",
   :rdfs/range :qb/DimensionProperty,
   :rdfs/subPropertyOf [:qb/componentProperty :qb/dimension]})

(def hierarchyRoot
  "Specifies a root of the hierarchy. A hierarchy may have multiple roots but must have at least one."
  {:db/ident :qb/hierarchyRoot,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "Specifies a root of the hierarchy. A hierarchy may have multiple roots but must have at least one.@en",
   :rdfs/domain :qb/HierarchicalCodeList,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/subPropertyOf :qb/hierarchyRoot})

(def measure
  "An alternative to qb:componentProperty which makes explicit that the component is a measure"
  {:db/ident :qb/measure,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "An alternative to qb:componentProperty which makes explicit that the component is a measure@en",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "measure@en",
   :rdfs/range :qb/MeasureProperty,
   :rdfs/subPropertyOf [:qb/componentProperty :qb/measure]})

(def measureDimension
  "An alternative to qb:componentProperty which makes explicit that the component is a measure dimension"
  {:db/ident :qb/measureDimension,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "An alternative to qb:componentProperty which makes explicit that the component is a measure dimension@en",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "measure dimension@en",
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
   #voc/lstr
    "Generic measure dimension, the value of this dimension indicates which measure (from the set of measures in the DSD) is being given by the obsValue (or other primary measure)@en",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "measure type@en",
   :rdfs/range :qb/MeasureProperty,
   :rdfs/subPropertyOf :qb/measureType})

(def observation
  "indicates a observation contained within this slice of the data set"
  {:db/ident :qb/observation,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "indicates a observation contained within this slice of the data set@en",
   :rdfs/domain :qb/ObservationGroup,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "observation@en",
   :rdfs/range :qb/Observation,
   :rdfs/subPropertyOf :qb/observation})

(def observationGroup
  "Indicates a group of observations. The domain of this property is left open so that a group may be attached to different resources and need not be restricted to a single DataSet"
  {:db/ident :qb/observationGroup,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "Indicates a group of observations. The domain of this property is left open so that a group may be attached to different resources and need not be restricted to a single DataSet@en",
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "observation group@en",
   :rdfs/range :qb/ObservationGroup,
   :rdfs/subPropertyOf :qb/observationGroup})

(def order
  "indicates a priority order for the components of sets with this structure, used to guide presentations - lower order numbers come before higher numbers, un-numbered components come last"
  {:db/ident :qb/order,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "indicates a priority order for the components of sets with this structure, used to guide presentations - lower order numbers come before higher numbers, un-numbered components come last@en",
   :rdfs/domain :qb/ComponentSpecification,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "order@en",
   :rdfs/range :xsd/int,
   :rdfs/subPropertyOf :qb/order})

(def parentChildProperty
  "Specifies a property which relates a parent concept in the hierarchy to a child concept."
  {:db/ident :qb/parentChildProperty,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "Specifies a property which relates a parent concept in the hierarchy to a child concept.@en",
   :rdfs/domain :qb/HierarchicalCodeList,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "parent-child property@en",
   :rdfs/range :rdf/Property,
   :rdfs/subPropertyOf :qb/parentChildProperty})

(def slice
  "Indicates a subset of a DataSet defined by fixing a subset of the dimensional values"
  {:db/ident :qb/slice,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "Indicates a subset of a DataSet defined by fixing a subset of the dimensional values@en",
   :rdfs/domain :qb/DataSet,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "slice@en",
   :rdfs/range :qb/Slice,
   :rdfs/subPropertyOf [:qb/observationGroup :qb/slice]})

(def sliceKey
  "indicates a slice key which is used for slices in this dataset"
  {:db/ident :qb/sliceKey,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "indicates a slice key which is used for slices in this dataset@en",
   :rdfs/domain :qb/DataStructureDefinition,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "slice key@en",
   :rdfs/range :qb/SliceKey,
   :rdfs/subPropertyOf :qb/sliceKey})

(def sliceStructure
  "indicates the sub-key corresponding to this slice"
  {:db/ident           :qb/sliceStructure,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       #voc/lstr
                        "indicates the sub-key corresponding to this slice@en",
   :rdfs/domain        :qb/Slice,
   :rdfs/isDefinedBy   "http://purl.org/linked-data/cube",
   :rdfs/label         #voc/lstr "slice structure@en",
   :rdfs/range         :qb/SliceKey,
   :rdfs/subPropertyOf :qb/sliceStructure})

(def structure
  "indicates the structure to which this data set conforms"
  {:db/ident :qb/structure,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment #voc/lstr
                  "indicates the structure to which this data set conforms@en",
   :rdfs/domain :qb/DataSet,
   :rdfs/isDefinedBy "http://purl.org/linked-data/cube",
   :rdfs/label #voc/lstr "structure@en",
   :rdfs/range :qb/DataStructureDefinition,
   :rdfs/subPropertyOf :qb/structure})