(ns net.wikipunk.rdf.ssn
  "This ontology describes sensors, actuators and observations, and related concepts. It does not describe domain concepts, time, locations, etc. these are intended to be included from other ontologies via OWL imports."
  {:dcterms/created #inst "2017-04-17T00:00:00.000-04:00",
   :dcterms/creator
   {:foaf/name {:rdf/language "en",
                :rdf/value    "W3C/OGC Spatial Data on the Web Working Group"},
    :rdf/type  :foaf/Agent},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "This ontology describes sensors, actuators and observations, and related concepts. It does not describe domain concepts, time, locations, etc. these are intended to be included from other ontologies via OWL imports."},
   :dcterms/license
   ["http://www.w3.org/Consortium/Legal/2015/copyright-software-and-document"
    "http://www.opengeospatial.org/ogc/Software"],
   :dcterms/rights "Copyright 2017 W3C/OGC.",
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Semantic Sensor Network Ontology"},
   :owl/imports "http://www.w3.org/ns/sosa/",
   :owl/versionInfo
   {:rdf/language "en",
    :rdf/value
    "New modular version of the SSN ontology. \n\nThis ontology was originally developed in 2009-2011 by the W3C Semantic Sensor Networks Incubator Group (SSN-XG). For more information on the group's activities see: http://www.w3.org/2005/Incubator/ssn/. The ontology was revised and modularized in 2015-2017 by the W3C/OGC Spatial Data on the Web Working Group, see: https://www.w3.org/2015/spatial/wiki/Semantic_Sensor_Network_Ontology. \n\nIn particular, (a) the scope is extended to include actuation and sampling; (b) the core concepts and properties are factored out into the SOSA ontology. The SSN ontology imports SOSA and adds formal axiomatization consistent with the text definitions in SOSA, and adds classes and properties to accommodate the scope of the original SSN ontology. "},
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
   {:rdf/language "en",
    :rdf/value
    "Please report any errors to the W3C Spatial Data on the Web Working Group via the SDW WG Public List public-sdw-wg@w3.org"},
   :rdfs/isDefinedBy {:rdf/uri
                      "https://www.w3.org/TR/2017/REC-vocab-ssn-20171019/"},
   :rdfs/seeAlso
   ["https://www.w3.org/2015/spatial/wiki/Semantic_Sensor_Network_Ontology"],
   :vann/preferredNamespacePrefix "ssn",
   :vann/preferredNamespaceUri "http://www.w3.org/ns/ssn/"}
  (:refer-clojure :exclude [name]))

(def Deployment
  "Describes the Deployment of one or more Systems for a particular purpose. Deployment may be done on a Platform."
  {:db/ident :ssn/Deployment,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes the Deployment of one or more Systems for a particular purpose. Deployment may be done on a Platform."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/ssn/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Deployment"},
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
   {:rdf/language "en",
    :rdf/value
    "Describes the Deployment of one or more Systems for a particular purpose. Deployment may be done on a Platform."},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "For example, a temperature Sensor deployed on a wall, or a whole network of Sensors deployed for an Observation campaign."}})

(def Input
  "Any information that is provided to a Procedure for its use."
  {:db/ident :ssn/Input,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Any information that is provided to a Procedure for its use."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/ssn/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Input"},
   :rdfs/subClassOf [{:owl/allValuesFrom :sosa/Procedure,
                      :owl/onProperty    {:owl/inverseOf :ssn/hasInput},
                      :rdf/type          :owl/Restriction}
                     {:owl/minCardinality 1,
                      :owl/onProperty     {:owl/inverseOf :ssn/hasInput},
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value "Any information that is provided to a Procedure for its use."}})

(def Output
  "Any information that is reported from a Procedure."
  {:db/ident         :ssn/Output,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Any information that is reported from a Procedure."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/ssn/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Output"},
   :rdfs/subClassOf  [{:owl/allValuesFrom :sosa/Procedure,
                       :owl/onProperty    {:owl/inverseOf :ssn/hasOutput},
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     {:owl/inverseOf :ssn/hasOutput},
                       :rdf/type           :owl/Restriction}],
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "Any information that is reported from a Procedure."}})

(def Property
  "A quality of an entity. An aspect of an entity that is intrinsic to and cannot exist without the entity."
  {:db/ident :ssn/Property,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A quality of an entity. An aspect of an entity that is intrinsic to and cannot exist without the entity."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/ssn/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Property"},
   :rdfs/subClassOf {:owl/allValuesFrom :sosa/FeatureOfInterest,
                     :owl/onProperty    :ssn/isPropertyOf,
                     :rdf/type          :owl/Restriction},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A quality of an entity. An aspect of an entity that is intrinsic to and cannot exist without the entity."}})

(def Stimulus
  "An event in the real world that 'triggers' the Sensor. The properties associated to the Stimulus may be different to the eventual observed ObservableProperty. It is the event, not the object, that triggers the Sensor."
  {:db/ident :ssn/Stimulus,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An event in the real world that 'triggers' the Sensor. The properties associated to the Stimulus may be different to the eventual observed ObservableProperty. It is the event, not the object, that triggers the Sensor."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/ssn/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Stimulus"},
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
   {:rdf/language "en",
    :rdf/value
    "An event in the real world that 'triggers' the Sensor. The properties associated to the Stimulus may be different to the eventual observed ObservableProperty. It is the event, not the object, that triggers the Sensor."}})

(def SystemClass
  "System is a unit of abstraction for pieces of infrastructure that implement Procedures. A System may have components, its subsystems, which are other systems."
  {:db/ident :ssn/System,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "System is a unit of abstraction for pieces of infrastructure that implement Procedures. A System may have components, its subsystems, which are other systems."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/ssn/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "System"},
   :rdfs/subClassOf [{:owl/allValuesFrom :ssn/System,
                      :owl/onProperty    {:owl/inverseOf :ssn/hasSubSystem},
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :ssn/System,
                      :owl/onProperty    :ssn/hasSubSystem,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :sosa/Platform,
                      :owl/onProperty    :sosa/isHostedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :ssn/Deployment,
                      :owl/onProperty    :ssn/hasDeployment,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :sosa/Procedure,
                      :owl/onProperty    :ssn/implements,
                      :rdf/type          :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "System is a unit of abstraction for pieces of infrastructure that implement Procedures. A System may have components, its subsystems, which are other systems."}})

(def deployedOnPlatform
  "Relation between a Deployment and the Platform on which the Systems are deployed."
  {:db/ident :ssn/deployedOnPlatform,
   :owl/inverseOf :ssn/inDeployment,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relation between a Deployment and the Platform on which the Systems are deployed."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/ssn/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "deployed on platform"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relation between a Deployment and the Platform on which the Systems are deployed."}})

(def deployedSystem
  "Relation between a Deployment and a deployed System."
  {:db/ident         :ssn/deployedSystem,
   :owl/inverseOf    :ssn/hasDeployment,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Relation between a Deployment and a deployed System."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/ssn/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "deployed system"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "Relation between a Deployment and a deployed System."}})

(def detects
  "A relation from a Sensor to the Stimulus that the Sensor detects. The Stimulus itself will be serving as a proxy for some ObservableProperty."
  {:db/ident :ssn/detects,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A relation from a Sensor to the Stimulus that the Sensor detects. The Stimulus itself will be serving as a proxy for some ObservableProperty."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/ssn/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "detects"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relation from a Sensor to the Stimulus that the Sensor detects. The Stimulus itself will be serving as a proxy for some ObservableProperty."}})

(def forProperty
  "A relation between some aspect of an entity and a Property."
  {:db/ident :ssn/forProperty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "A relation between some aspect of an entity and a Property."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/ssn/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "for property"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "A relation between some aspect of an entity and a Property."},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "For example, from a Sensor to the properties it can observe; from an Actuator to the properties it can act on; from a Deployment to the properties it was installed to observe or act on; from a SystemCapability to the Property the capability is described for."}})

(def hasDeployment
  "Relation between a System and a Deployment, recording that the System is deployed in that Deployment."
  {:db/ident :ssn/hasDeployment,
   :owl/inverseOf :ssn/deployedSystem,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relation between a System and a Deployment, recording that the System is deployed in that Deployment."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/ssn/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has deployment"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relation between a System and a Deployment, recording that the System is deployed in that Deployment."}})

(def hasInput
  "Relation between a Procedure and an Input to it."
  {:db/ident         :ssn/hasInput,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Relation between a Procedure and an Input to it."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/ssn/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has input"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "Relation between a Procedure and an Input to it."}})

(def hasOutput
  "Relation between a Procedure and an Output of it."
  {:db/ident         :ssn/hasOutput,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Relation between a Procedure and an Output of it."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/ssn/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has output"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "Relation between a Procedure and an Output of it."}})

(def hasProperty
  "Relation between an entity and a Property of that entity."
  {:db/ident :ssn/hasProperty,
   :owl/inverseOf :ssn/isPropertyOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Relation between an entity and a Property of that entity."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/ssn/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has property"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Relation between an entity and a Property of that entity."}})

(def hasSubSystem
  "Relation between a System and its component parts."
  {:db/ident         :ssn/hasSubSystem,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Relation between a System and its component parts."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/ssn/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has subsystem"},
   :skos/definition  {:rdf/language "en",
                      :rdf/value
                      "Relation between a System and its component parts."}})

(def implementedBy
  "Relation between a Procedure (an algorithm, procedure or method) and an entity that implements that Procedure in some executable way."
  {:db/ident :ssn/implementedBy,
   :owl/inverseOf :ssn/implements,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relation between a Procedure (an algorithm, procedure or method) and an entity that implements that Procedure in some executable way."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/ssn/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "implemented by"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relation between a Procedure (an algorithm, procedure or method) and an entity that implements that Procedure in some executable way."},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "For example, the relationship between a scientific measuring Procedure and a sensor that senses via that Procedure."}})

(def implements
  "Relation between an entity that implements a Procedure in some executable way and the Procedure (an algorithm, procedure or method)."
  {:db/ident :ssn/implements,
   :owl/inverseOf :ssn/implementedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relation between an entity that implements a Procedure in some executable way and the Procedure (an algorithm, procedure or method)."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/ssn/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "implements"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relation between an entity that implements a Procedure in some executable way and the Procedure (an algorithm, procedure or method)."},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "For example, the relationship between a sensor and the scientific measuring Procedure via which it senses."}})

(def inDeployment
  "Relation between a Platform and a Deployment, meaning that the deployedSystems of the Deployment are hosted on the Platform."
  {:db/ident :ssn/inDeployment,
   :owl/inverseOf :ssn/deployedOnPlatform,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relation between a Platform and a Deployment, meaning that the deployedSystems of the Deployment are hosted on the Platform."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/ssn/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "in deployment"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relation between a Platform and a Deployment, meaning that the deployedSystems of the Deployment are hosted on the Platform."},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "For example, a relation between a buoy and a deployment of several Sensors."}})

(def isPropertyOf
  "Relation between a Property and the entity it belongs to."
  {:db/ident :ssn/isPropertyOf,
   :owl/inverseOf :ssn/hasProperty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Relation between a Property and the entity it belongs to."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/ssn/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is property of"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Relation between a Property and the entity it belongs to."}})

(def isProxyFor
  "A relation from a Stimulus to the Property that the Stimulus is serving as a proxy for."
  {:db/ident :ssn/isProxyFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A relation from a Stimulus to the Property that the Stimulus is serving as a proxy for."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/ssn/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is proxy for"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A relation from a Stimulus to the Property that the Stimulus is serving as a proxy for."},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "For example, the expansion of quicksilver is a stimulus that serves as a proxy for some temperature property. An increase or decrease in the velocity of spinning cups on a wind sensor is serving as a proxy for the wind speed."}})

(def wasOriginatedBy
  "Relation between an Observation and the Stimulus that originated it."
  {:db/ident :ssn/wasOriginatedBy,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relation between an Observation and the Stimulus that originated it."},
   :rdfs/isDefinedBy "http://www.w3.org/ns/ssn/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "was originated by"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relation between an Observation and the Stimulus that originated it."}})

(def ^{:private true} Agent
  {:db/ident :foaf/Agent,
   :rdf/type :owl/Class})

(def ^{:private true} name
  {:db/ident :foaf/name,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} definition
  {:db/ident :skos/definition,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} example
  {:db/ident :skos/example,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} ActuatableProperty
  {:db/ident         :sosa/ActuatableProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/subClassOf  [{:owl/allValuesFrom :sosa/Actuation,
                       :owl/onProperty    :sosa/isActedOnBy,
                       :rdf/type          :owl/Restriction}
                      :ssn/Property]})

(def ^{:private true} Actuation
  {:db/ident         :sosa/Actuation,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/subClassOf  [{:owl/allValuesFrom :sosa/Procedure,
                       :owl/onProperty    :sosa/usedProcedure,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :sosa/Result,
                       :owl/onProperty    :sosa/hasResult,
                       :rdf/type          :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :sosa/hasFeatureOfInterest,
                       :rdf/type        :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :sosa/hasResult,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :sosa/ActuatableProperty,
                       :owl/onProperty    :sosa/actsOnProperty,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :sosa/Actuator,
                       :owl/onProperty    :sosa/madeByActuator,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :sosa/actsOnProperty,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :sosa/FeatureOfInterest,
                       :owl/onProperty    :sosa/hasFeatureOfInterest,
                       :rdf/type          :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :sosa/madeByActuator,
                       :rdf/type        :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :sosa/resultTime,
                       :rdf/type        :owl/Restriction}]})

(def ^{:private true} Actuator
  {:db/ident         :sosa/Actuator,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/subClassOf  [{:owl/allValuesFrom :sosa/Actuation,
                       :owl/onProperty    :sosa/madeActuation,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :sosa/ActuatableProperty,
                       :owl/onProperty    :ssn/forProperty,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :ssn/implements,
                       :rdf/type           :owl/Restriction}
                      :ssn/System]})

(def ^{:private true} FeatureOfInterest
  {:db/ident         :sosa/FeatureOfInterest,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/subClassOf  [{:owl/allValuesFrom :sosa/Sample,
                       :owl/onProperty    :sosa/hasSample,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :ssn/Property,
                       :owl/onProperty    :ssn/hasProperty,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :ssn/hasProperty,
                       :rdf/type           :owl/Restriction}]})

(def ^{:private true} ObservableProperty
  {:db/ident         :sosa/ObservableProperty,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/subClassOf  [{:owl/allValuesFrom :ssn/Stimulus,
                       :owl/onProperty    {:owl/inverseOf :ssn/isProxyFor},
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :sosa/Observation,
                       :owl/onProperty    {:owl/inverseOf
                                           :sosa/observedProperty},
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :sosa/Sensor,
                       :owl/onProperty    :sosa/isObservedBy,
                       :rdf/type          :owl/Restriction}
                      :ssn/Property]})

(def ^{:private true} Observation
  {:db/ident         :sosa/Observation,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/subClassOf  [{:owl/allValuesFrom :sosa/ObservableProperty,
                       :owl/onProperty    :sosa/observedProperty,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :sosa/FeatureOfInterest,
                       :owl/onProperty    :sosa/hasFeatureOfInterest,
                       :rdf/type          :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :sosa/hasFeatureOfInterest,
                       :rdf/type        :owl/Restriction}
                      {:owl/allValuesFrom :sosa/Sensor,
                       :owl/onProperty    :sosa/madeBySensor,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :ssn/Stimulus,
                       :owl/onProperty    :ssn/wasOriginatedBy,
                       :rdf/type          :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :sosa/observedProperty,
                       :rdf/type        :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :sosa/madeBySensor,
                       :rdf/type        :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :ssn/wasOriginatedBy,
                       :rdf/type        :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :sosa/hasResult,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :sosa/Result,
                       :owl/onProperty    :sosa/hasResult,
                       :rdf/type          :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :sosa/phenomenonTime,
                       :rdf/type        :owl/Restriction}
                      {:owl/allValuesFrom :sosa/Procedure,
                       :owl/onProperty    :sosa/usedProcedure,
                       :rdf/type          :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :sosa/resultTime,
                       :rdf/type        :owl/Restriction}]})

(def ^{:private true} Platform
  {:db/ident         :sosa/Platform,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/subClassOf  [{:owl/allValuesFrom :ssn/Deployment,
                       :owl/onProperty    :ssn/inDeployment,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :ssn/System,
                       :owl/onProperty    :sosa/hosts,
                       :rdf/type          :owl/Restriction}]})

(def ^{:private true} Procedure
  {:db/ident         :sosa/Procedure,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/subClassOf  [{:owl/allValuesFrom :ssn/System,
                       :owl/onProperty    :ssn/implementedBy,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :ssn/Output,
                       :owl/onProperty    :ssn/hasOutput,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :ssn/Input,
                       :owl/onProperty    :ssn/hasInput,
                       :rdf/type          :owl/Restriction}]})

(def ^{:private true} Result
  {:db/ident         :sosa/Result,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/subClassOf  {:owl/minCardinality 1,
                      :owl/onProperty     :sosa/isResultOf,
                      :rdf/type           :owl/Restriction}})

(def ^{:private true} Sample
  {:db/ident         :sosa/Sample,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/subClassOf  [{:owl/allValuesFrom :sosa/Sampling,
                       :owl/onProperty    :sosa/isResultOf,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :sosa/isSampleOf,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :sosa/FeatureOfInterest,
                       :owl/onProperty    :sosa/isSampleOf,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :sosa/isResultOf,
                       :rdf/type           :owl/Restriction}
                      :sosa/Result
                      :sosa/FeatureOfInterest]})

(def ^{:private true} Sampler
  {:db/ident         :sosa/Sampler,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/subClassOf  [{:owl/allValuesFrom :sosa/Sampling,
                       :owl/onProperty    :sosa/madeSampling,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :ssn/implements,
                       :rdf/type           :owl/Restriction}
                      :ssn/System]})

(def ^{:private true} Sampling
  {:db/ident         :sosa/Sampling,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/subClassOf  [{:owl/allValuesFrom :sosa/FeatureOfInterest,
                       :owl/onProperty    :sosa/hasFeatureOfInterest,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :sosa/Procedure,
                       :owl/onProperty    :sosa/usedProcedure,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :sosa/hasResult,
                       :rdf/type           :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :sosa/madeBySampler,
                       :rdf/type        :owl/Restriction}
                      {:owl/allValuesFrom :sosa/Sampler,
                       :owl/onProperty    :sosa/madeBySampler,
                       :rdf/type          :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :sosa/resultTime,
                       :rdf/type        :owl/Restriction}
                      {:owl/allValuesFrom :sosa/Sample,
                       :owl/onProperty    :sosa/hasResult,
                       :rdf/type          :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :sosa/hasFeatureOfInterest,
                       :rdf/type        :owl/Restriction}]})

(def ^{:private true} Sensor
  {:db/ident         :sosa/Sensor,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/subClassOf  [{:owl/allValuesFrom :ssn/Stimulus,
                       :owl/onProperty    :ssn/detects,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :sosa/Observation,
                       :owl/onProperty    :sosa/madeObservation,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :sosa/ObservableProperty,
                       :owl/onProperty    :sosa/observes,
                       :rdf/type          :owl/Restriction}
                      {:owl/minCardinality 1,
                       :owl/onProperty     :ssn/implements,
                       :rdf/type           :owl/Restriction}
                      :ssn/System]})

(def ^{:private true} actsOnProperty
  {:db/ident         :sosa/actsOnProperty,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/"})

(def ^{:private true} hasFeatureOfInterest
  {:db/ident         :sosa/hasFeatureOfInterest,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/"})

(def ^{:private true} hasResult
  {:db/ident         :sosa/hasResult,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/"})

(def ^{:private true} hasSample
  {:db/ident         :sosa/hasSample,
   :rdf/type         :owl/InverseFunctionalProperty,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/"})

(def ^{:private true} hasSimpleResult
  {:db/ident         :sosa/hasSimpleResult,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/"})

(def ^{:private true} hosts
  {:db/ident         :sosa/hosts,
   :owl/propertyChainAxiom [:ssn/inDeployment :ssn/deployedSystem],
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/"})

(def ^{:private true} isActedOnBy
  {:db/ident         :sosa/isActedOnBy,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/"})

(def ^{:private true} isFeatureOfInterestOf
  {:db/ident         :sosa/isFeatureOfInterestOf,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/"})

(def ^{:private true} isHostedBy
  {:db/ident         :sosa/isHostedBy,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/"})

(def ^{:private true} isObservedBy
  {:db/ident         :sosa/isObservedBy,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/"})

(def ^{:private true} isResultOf
  {:db/ident         :sosa/isResultOf,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/"})

(def ^{:private true} isSampleOf
  {:db/ident         :sosa/isSampleOf,
   :rdf/type         :owl/FunctionalProperty,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/"})

(def ^{:private true} madeActuation
  {:db/ident         :sosa/madeActuation,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/"})

(def ^{:private true} madeByActuator
  {:db/ident         :sosa/madeByActuator,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/"})

(def ^{:private true} madeBySampler
  {:db/ident         :sosa/madeBySampler,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/"})

(def ^{:private true} madeBySensor
  {:db/ident         :sosa/madeBySensor,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/"})

(def ^{:private true} madeObservation
  {:db/ident         :sosa/madeObservation,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/"})

(def ^{:private true} madeSampling
  {:db/ident         :sosa/madeSampling,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/"})

(def ^{:private true} observedProperty
  {:db/ident         :sosa/observedProperty,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/"})

(def ^{:private true} observes
  {:db/ident         :sosa/observes,
   :rdf/type         :rdf/Property,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/subPropertyOf :ssn/forProperty})

(def ^{:private true} phenomenonTime
  {:db/ident         :sosa/phenomenonTime,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/"})

(def ^{:private true} resultTime
  {:db/ident         :sosa/resultTime,
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/"})

(def ^{:private true} usedProcedure
  {:db/ident         :sosa/usedProcedure,
   :owl/propertyChainAxiom [[:sosa/madeBySampler :ssn/implements]
                            [:sosa/madeByActuator :ssn/implements]
                            [:sosa/madeBySensor :ssn/implements]],
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/"})

(def ^{:private true} preferredNamespacePrefix
  {:db/ident :vann/preferredNamespacePrefix,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} preferredNamespaceUri
  {:db/ident :vann/preferredNamespaceUri,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} Vocabulary
  {:db/ident :voaf/Vocabulary,
   :rdf/type :owl/Class})