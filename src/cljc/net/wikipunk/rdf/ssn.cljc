(ns net.wikipunk.rdf.ssn
  "This ontology describes sensors, actuators and observations, and related concepts. It does not describe domain concepts, time, locations, etc. these are intended to be included from other ontologies via OWL imports."
  {:dcterms/created #xsd/date #inst "2017-04-17T00:00:00.000-04:00",
   :dcterms/creator {:foaf/name
                     #xsd/langString
                      "W3C/OGC Spatial Data on the Web Working Group@en",
                     :rdf/type :foaf/Agent},
   :dcterms/description
   #xsd/langString
    "This ontology describes sensors, actuators and observations, and related concepts. It does not describe domain concepts, time, locations, etc. these are intended to be included from other ontologies via OWL imports.@en",
   :dcterms/license
   [{:rdfa/uri
     "http://www.w3.org/Consortium/Legal/2015/copyright-software-and-document"}
    {:rdfa/uri "http://www.opengeospatial.org/ogc/Software"}],
   :dcterms/rights #xsd/string "Copyright 2017 W3C/OGC.",
   :dcterms/title #xsd/langString "Semantic Sensor Network Ontology@en",
   :owl/imports {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :owl/versionInfo
   #xsd/langString
    "New modular version of the SSN ontology. \n\nThis ontology was originally developed in 2009-2011 by the W3C Semantic Sensor Networks Incubator Group (SSN-XG). For more information on the group's activities see: http://www.w3.org/2005/Incubator/ssn/. The ontology was revised and modularized in 2015-2017 by the W3C/OGC Spatial Data on the Web Working Group, see: https://www.w3.org/2015/spatial/wiki/Semantic_Sensor_Network_Ontology. \n\nIn particular, (a) the scope is extended to include actuation and sampling; (b) the core concepts and properties are factored out into the SOSA ontology. The SSN ontology imports SOSA and adds formal axiomatization consistent with the text definitions in SOSA, and adds classes and properties to accommodate the scope of the original SSN ontology. @en",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"    "http://www.w3.org/2004/02/skos/core#",
                       "sosa"    "http://www.w3.org/ns/sosa/",
                       "ssn"     "http://www.w3.org/ns/ssn/",
                       "time"    "http://www.w3.org/2006/time#",
                       "vann"    "http://purl.org/vocab/vann/",
                       "voaf"    "http://purl.org/vocommons/voaf#",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type [:voaf/Vocabulary :owl/Ontology],
   :rdfa/prefix "ssn",
   :rdfa/uri "http://www.w3.org/ns/ssn/",
   :rdfs/comment
   #xsd/langString
    "Please report any errors to the W3C Spatial Data on the Web Working Group via the SDW WG Public List public-sdw-wg@w3.org@en",
   :rdfs/isDefinedBy {:rdfa/uri
                      "https://www.w3.org/TR/2017/REC-vocab-ssn-20171019/"},
   :rdfs/seeAlso
   {:rdfa/uri
    "https://www.w3.org/2015/spatial/wiki/Semantic_Sensor_Network_Ontology"},
   :vann/preferredNamespacePrefix #xsd/string "ssn",
   :vann/preferredNamespaceUri #xsd/string "http://www.w3.org/ns/ssn/"})

(def Deployment
  "Describes the Deployment of one or more Systems for a particular purpose. Deployment may be done on a Platform."
  {:db/ident :ssn/Deployment,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Describes the Deployment of one or more Systems for a particular purpose. Deployment may be done on a Platform.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/ssn/"},
   :rdfs/label #xsd/langString "Deployment@en",
   :rdfs/subClassOf [{:owl/allValuesFrom :ssn/Property,
                      :owl/onProperty    :ssn/forProperty,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :sosa/Platform,
                      :owl/onProperty    :ssn/deployedOnPlatform,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :ssn/System,
                      :owl/onProperty    :ssn/deployedSystem,
                      :rdf/type          :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "Describes the Deployment of one or more Systems for a particular purpose. Deployment may be done on a Platform.@en",
   :skos/example
   #xsd/langString
    "For example, a temperature Sensor deployed on a wall, or a whole network of Sensors deployed for an Observation campaign.@en"})

(def Input
  "Any information that is provided to a Procedure for its use."
  {:db/ident :ssn/Input,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Any information that is provided to a Procedure for its use.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/ssn/"},
   :rdfs/label #xsd/langString "Input@en",
   :rdfs/subClassOf [{:owl/allValuesFrom :sosa/Procedure,
                      :owl/onProperty    {:owl/inverseOf :ssn/hasInput},
                      :rdf/type          :owl/Restriction}
                     {:owl/minCardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty     {:owl/inverseOf :ssn/hasInput},
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "Any information that is provided to a Procedure for its use.@en"})

(def Output
  "Any information that is reported from a Procedure."
  {:db/ident         :ssn/Output,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString
                      "Any information that is reported from a Procedure.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/ssn/"},
   :rdfs/label       #xsd/langString "Output@en",
   :rdfs/subClassOf  [{:owl/allValuesFrom :sosa/Procedure,
                       :owl/onProperty    {:owl/inverseOf :ssn/hasOutput},
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality #xsd/nonNegativeInteger 1,
                       :owl/onProperty     {:owl/inverseOf :ssn/hasOutput},
                       :rdf/type           :owl/Restriction}],
   :skos/definition  #xsd/langString
                      "Any information that is reported from a Procedure.@en"})

(def Property
  "A quality of an entity. An aspect of an entity that is intrinsic to and cannot exist without the entity."
  {:db/ident :ssn/Property,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A quality of an entity. An aspect of an entity that is intrinsic to and cannot exist without the entity.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/ssn/"},
   :rdfs/label #xsd/langString "Property@en",
   :rdfs/subClassOf {:owl/allValuesFrom :sosa/FeatureOfInterest,
                     :owl/onProperty    :ssn/isPropertyOf,
                     :rdf/type          :owl/Restriction},
   :skos/definition
   #xsd/langString
    "A quality of an entity. An aspect of an entity that is intrinsic to and cannot exist without the entity.@en"})

(def Stimulus
  "An event in the real world that 'triggers' the Sensor. The properties associated to the Stimulus may be different to the eventual observed ObservableProperty. It is the event, not the object, that triggers the Sensor."
  {:db/ident :ssn/Stimulus,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "An event in the real world that 'triggers' the Sensor. The properties associated to the Stimulus may be different to the eventual observed ObservableProperty. It is the event, not the object, that triggers the Sensor.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/ssn/"},
   :rdfs/label #xsd/langString "Stimulus@en",
   :rdfs/subClassOf [{:owl/allValuesFrom :sosa/ObservableProperty,
                      :owl/onProperty    :ssn/isProxyFor,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :sosa/Sensor,
                      :owl/onProperty    {:owl/inverseOf :ssn/detects},
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :sosa/Observation,
                      :owl/onProperty    {:owl/inverseOf :ssn/wasOriginatedBy},
                      :rdf/type          :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "An event in the real world that 'triggers' the Sensor. The properties associated to the Stimulus may be different to the eventual observed ObservableProperty. It is the event, not the object, that triggers the Sensor.@en"})

(def SystemClass
  "System is a unit of abstraction for pieces of infrastructure that implement Procedures. A System may have components, its subsystems, which are other systems."
  {:db/ident :ssn/System,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "System is a unit of abstraction for pieces of infrastructure that implement Procedures. A System may have components, its subsystems, which are other systems.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/ssn/"},
   :rdfs/label #xsd/langString "System@en",
   :rdfs/subClassOf [{:owl/allValuesFrom :ssn/System,
                      :owl/onProperty    :ssn/hasSubSystem,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :ssn/Deployment,
                      :owl/onProperty    :ssn/hasDeployment,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :sosa/Platform,
                      :owl/onProperty    :sosa/isHostedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :sosa/Procedure,
                      :owl/onProperty    :ssn/implements,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :ssn/System,
                      :owl/onProperty    {:owl/inverseOf :ssn/hasSubSystem},
                      :rdf/type          :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "System is a unit of abstraction for pieces of infrastructure that implement Procedures. A System may have components, its subsystems, which are other systems.@en"})

(def deployedOnPlatform
  "Relation between a Deployment and the Platform on which the Systems are deployed."
  {:db/ident :ssn/deployedOnPlatform,
   :owl/inverseOf :ssn/inDeployment,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relation between a Deployment and the Platform on which the Systems are deployed.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/ssn/"},
   :rdfs/label #xsd/langString "deployed on platform@en",
   :skos/definition
   #xsd/langString
    "Relation between a Deployment and the Platform on which the Systems are deployed.@en"})

(def deployedSystem
  "Relation between a Deployment and a deployed System."
  {:db/ident :ssn/deployedSystem,
   :owl/inverseOf :ssn/hasDeployment,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment #xsd/langString
                  "Relation between a Deployment and a deployed System.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/ssn/"},
   :rdfs/label #xsd/langString "deployed system@en",
   :skos/definition #xsd/langString
                     "Relation between a Deployment and a deployed System.@en"})

(def detects
  "A relation from a Sensor to the Stimulus that the Sensor detects. The Stimulus itself will be serving as a proxy for some ObservableProperty."
  {:db/ident :ssn/detects,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "A relation from a Sensor to the Stimulus that the Sensor detects. The Stimulus itself will be serving as a proxy for some ObservableProperty.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/ssn/"},
   :rdfs/label #xsd/langString "detects@en",
   :skos/definition
   #xsd/langString
    "A relation from a Sensor to the Stimulus that the Sensor detects. The Stimulus itself will be serving as a proxy for some ObservableProperty.@en"})

(def forProperty
  "A relation between some aspect of an entity and a Property."
  {:db/ident :ssn/forProperty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "A relation between some aspect of an entity and a Property.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/ssn/"},
   :rdfs/label #xsd/langString "for property@en",
   :skos/definition
   #xsd/langString
    "A relation between some aspect of an entity and a Property.@en",
   :skos/example
   #xsd/langString
    "For example, from a Sensor to the properties it can observe; from an Actuator to the properties it can act on; from a Deployment to the properties it was installed to observe or act on; from a SystemCapability to the Property the capability is described for.@en"})

(def hasDeployment
  "Relation between a System and a Deployment, recording that the System is deployed in that Deployment."
  {:db/ident :ssn/hasDeployment,
   :owl/inverseOf :ssn/deployedSystem,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relation between a System and a Deployment, recording that the System is deployed in that Deployment.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/ssn/"},
   :rdfs/label #xsd/langString "has deployment@en",
   :skos/definition
   #xsd/langString
    "Relation between a System and a Deployment, recording that the System is deployed in that Deployment.@en"})

(def hasInput
  "Relation between a Procedure and an Input to it."
  {:db/ident         :ssn/hasInput,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #xsd/langString
                      "Relation between a Procedure and an Input to it.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/ssn/"},
   :rdfs/label       #xsd/langString "has input@en",
   :skos/definition  #xsd/langString
                      "Relation between a Procedure and an Input to it.@en"})

(def hasOutput
  "Relation between a Procedure and an Output of it."
  {:db/ident         :ssn/hasOutput,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #xsd/langString
                      "Relation between a Procedure and an Output of it.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/ssn/"},
   :rdfs/label       #xsd/langString "has output@en",
   :skos/definition  #xsd/langString
                      "Relation between a Procedure and an Output of it.@en"})

(def hasProperty
  "Relation between an entity and a Property of that entity."
  {:db/ident :ssn/hasProperty,
   :owl/inverseOf :ssn/isPropertyOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relation between an entity and a Property of that entity.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/ssn/"},
   :rdfs/label #xsd/langString "has property@en",
   :skos/definition
   #xsd/langString
    "Relation between an entity and a Property of that entity.@en"})

(def hasSubSystem
  "Relation between a System and its component parts."
  {:db/ident         :ssn/hasSubSystem,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #xsd/langString
                      "Relation between a System and its component parts.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/ssn/"},
   :rdfs/label       #xsd/langString "has subsystem@en",
   :skos/definition  #xsd/langString
                      "Relation between a System and its component parts.@en"})

(def implementedBy
  "Relation between a Procedure (an algorithm, procedure or method) and an entity that implements that Procedure in some executable way."
  {:db/ident :ssn/implementedBy,
   :owl/inverseOf :ssn/implements,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relation between a Procedure (an algorithm, procedure or method) and an entity that implements that Procedure in some executable way.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/ssn/"},
   :rdfs/label #xsd/langString "implemented by@en",
   :skos/definition
   #xsd/langString
    "Relation between a Procedure (an algorithm, procedure or method) and an entity that implements that Procedure in some executable way.@en",
   :skos/example
   #xsd/langString
    "For example, the relationship between a scientific measuring Procedure and a sensor that senses via that Procedure.@en"})

(def implements
  "Relation between an entity that implements a Procedure in some executable way and the Procedure (an algorithm, procedure or method)."
  {:db/ident :ssn/implements,
   :owl/inverseOf :ssn/implementedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relation between an entity that implements a Procedure in some executable way and the Procedure (an algorithm, procedure or method).@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/ssn/"},
   :rdfs/label #xsd/langString "implements@en",
   :skos/definition
   #xsd/langString
    "Relation between an entity that implements a Procedure in some executable way and the Procedure (an algorithm, procedure or method).@en",
   :skos/example
   #xsd/langString
    "For example, the relationship between a sensor and the scientific measuring Procedure via which it senses.@en"})

(def inDeployment
  "Relation between a Platform and a Deployment, meaning that the deployedSystems of the Deployment are hosted on the Platform."
  {:db/ident :ssn/inDeployment,
   :owl/inverseOf :ssn/deployedOnPlatform,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relation between a Platform and a Deployment, meaning that the deployedSystems of the Deployment are hosted on the Platform.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/ssn/"},
   :rdfs/label #xsd/langString "in deployment@en",
   :skos/definition
   #xsd/langString
    "Relation between a Platform and a Deployment, meaning that the deployedSystems of the Deployment are hosted on the Platform.@en",
   :skos/example
   #xsd/langString
    "For example, a relation between a buoy and a deployment of several Sensors.@en"})

(def isPropertyOf
  "Relation between a Property and the entity it belongs to."
  {:db/ident :ssn/isPropertyOf,
   :owl/inverseOf :ssn/hasProperty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relation between a Property and the entity it belongs to.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/ssn/"},
   :rdfs/label #xsd/langString "is property of@en",
   :skos/definition
   #xsd/langString
    "Relation between a Property and the entity it belongs to.@en"})

(def isProxyFor
  "A relation from a Stimulus to the Property that the Stimulus is serving as a proxy for."
  {:db/ident :ssn/isProxyFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "A relation from a Stimulus to the Property that the Stimulus is serving as a proxy for.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/ssn/"},
   :rdfs/label #xsd/langString "is proxy for@en",
   :skos/definition
   #xsd/langString
    "A relation from a Stimulus to the Property that the Stimulus is serving as a proxy for.@en",
   :skos/example
   #xsd/langString
    "For example, the expansion of quicksilver is a stimulus that serves as a proxy for some temperature property. An increase or decrease in the velocity of spinning cups on a wind sensor is serving as a proxy for the wind speed.@en"})

(def wasOriginatedBy
  "Relation between an Observation and the Stimulus that originated it."
  {:db/ident :ssn/wasOriginatedBy,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment
   #xsd/langString
    "Relation between an Observation and the Stimulus that originated it.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/ssn/"},
   :rdfs/label #xsd/langString "was originated by@en",
   :skos/definition
   #xsd/langString
    "Relation between an Observation and the Stimulus that originated it.@en"})