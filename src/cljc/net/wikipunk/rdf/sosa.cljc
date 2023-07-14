(ns net.wikipunk.rdf.sosa
  "This ontology is based on the SSN Ontology by the W3C Semantic Sensor Networks Incubator Group (SSN-XG), together with considerations from the W3C/OGC Spatial Data on the Web Working Group."
  {:dcterms/created #xsd/date #inst "2017-04-17T00:00:00.000-04:00",
   :dcterms/creator {:foaf/name
                     #xsd/langString
                      "W3C/OGC Spatial Data on the Web Working Group@en",
                     :rdf/type :foaf/Agent},
   :dcterms/description
   #xsd/langString
    "This ontology is based on the SSN Ontology by the W3C Semantic Sensor Networks Incubator Group (SSN-XG), together with considerations from the W3C/OGC Spatial Data on the Web Working Group.@en",
   :dcterms/license
   [{:rdfa/uri "http://www.opengeospatial.org/ogc/Software"}
    {:rdfa/uri
     "http://www.w3.org/Consortium/Legal/2015/copyright-software-and-document"}],
   :dcterms/rights #xsd/string "Copyright 2017 W3C/OGC.",
   :dcterms/title
   #xsd/langString
    "Sensor, Observation, Sample, and Actuator (SOSA) Ontology@en",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "schema"  "http://schema.org/",
                       "skos"    "http://www.w3.org/2004/02/skos/core#",
                       "sosa"    "http://www.w3.org/ns/sosa/",
                       "time"    "http://www.w3.org/2006/time#",
                       "vann"    "http://purl.org/vocab/vann/",
                       "voaf"    "http://purl.org/vocommons/voaf#",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type [:voaf/Vocabulary :owl/Ontology],
   :rdfa/prefix "sosa",
   :rdfa/uri "http://www.w3.org/ns/sosa/",
   :rdfs/isDefinedBy {:rdfa/uri
                      "https://www.w3.org/TR/2017/REC-vocab-ssn-20171019/"},
   :vann/preferredNamespacePrefix #xsd/string "sosa",
   :vann/preferredNamespaceUri #xsd/string "http://www.w3.org/ns/sosa/"})

(def ActuatableProperty
  "An actuatable quality (property, characteristic) of a FeatureOfInterest."
  {:db/ident :sosa/ActuatableProperty,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/langString
    "An actuatable quality (property, characteristic) of a FeatureOfInterest.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "Actuatable Property@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition
   #xsd/langString
    "An actuatable quality (property, characteristic) of a FeatureOfInterest.@en",
   :skos/example
   #xsd/langString
    "A window actuator acts by changing the state between a frame and a window. The ability of the window to be opened and closed is its ActuatableProperty.@en"})

(def Actuation
  "An Actuation carries out an (Actuation) Procedure to change the state of the world using an Actuator."
  {:db/ident :sosa/Actuation,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/langString
    "An Actuation carries out an (Actuation) Procedure to change the state of the world using an Actuator.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "Actuation@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition
   #xsd/langString
    "An Actuation carries out an (Actuation) Procedure to change the state of the world using an Actuator.@en",
   :skos/example
   #xsd/langString
    "The activity of automatically closing a window if the temperature in a room drops below 20 degree Celsius. The activity is the Actuation and the device that closes the window is the Actuator. The Procedure is the rule, plan, or specification that defines the conditions that triggers the Actuation, here a drop in temperature. @en"})

(def Actuator
  "A device that is used by, or implements, an (Actuation) Procedure that changes the state of the world."
  {:db/ident :sosa/Actuator,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/langString
    "A device that is used by, or implements, an (Actuation) Procedure that changes the state of the world.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "Actuator@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition
   #xsd/langString
    "A device that is used by, or implements, an (Actuation) Procedure that changes the state of the world.@en",
   :skos/example
   #xsd/langString
    "A window actuator for automatic window control, i.e., opening or closing the window.@en"})

(def FeatureOfInterest
  "The thing whose property is being estimated or calculated in the course of an Observation to arrive at a Result or whose property is being manipulated by an Actuator, or which is being sampled or transformed in an act of Sampling."
  {:db/ident :sosa/FeatureOfInterest,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/langString
    "The thing whose property is being estimated or calculated in the course of an Observation to arrive at a Result or whose property is being manipulated by an Actuator, or which is being sampled or transformed in an act of Sampling.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "Feature Of Interest@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition
   #xsd/langString
    "The thing whose property is being estimated or calculated in the course of an Observation to arrive at a Result or whose property is being manipulated by an Actuator, or which is being sampled or transformed in an act of Sampling.@en",
   :skos/example
   #xsd/langString
    "When measuring the height of a tree, the height is the observed ObservableProperty, 20m may be the Result of the Observation, and the tree is the FeatureOfInterest. A window is a FeatureOfInterest for an automatic window control Actuator.@en"})

(def ObservableProperty
  "An observable quality (property, characteristic) of a FeatureOfInterest."
  {:db/ident :sosa/ObservableProperty,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/langString
    "An observable quality (property, characteristic) of a FeatureOfInterest.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "Observable Property@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition
   #xsd/langString
    "An observable quality (property, characteristic) of a FeatureOfInterest.@en",
   :skos/example
   #xsd/langString
    "The height of a tree, the depth of a water body, or the temperature of a surface are examples of observable properties, while the value of a classic car is not (directly) observable but asserted.@en"})

(def Observation
  "Act of carrying out an (Observation) Procedure to estimate or calculate a value of a property of a FeatureOfInterest. Links to a Sensor to describe what made the Observation and how; links to an ObservableProperty to describe what the result is an estimate of, and to a FeatureOfInterest to detail what that property was associated with."
  {:db/ident :sosa/Observation,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/langString
    "Act of carrying out an (Observation) Procedure to estimate or calculate a value of a property of a FeatureOfInterest. Links to a Sensor to describe what made the Observation and how; links to an ObservableProperty to describe what the result is an estimate of, and to a FeatureOfInterest to detail what that property was associated with.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "Observation@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition
   #xsd/langString
    "Act of carrying out an (Observation) Procedure to estimate or calculate a value of a property of a FeatureOfInterest. Links to a Sensor to describe what made the Observation and how; links to an ObservableProperty to describe what the result is an estimate of, and to a FeatureOfInterest to detail what that property was associated with.@en",
   :skos/example
   #xsd/langString
    "The activity of estimating the intensity of an Earthquake using the Mercalli intensity scale is an Observation as is measuring the moment magnitude, i.e., the energy released by said earthquake.@en"})

(def Platform
  "A Platform is an entity that hosts other entities, particularly Sensors, Actuators, Samplers, and other Platforms."
  {:db/ident :sosa/Platform,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/langString
    "A Platform is an entity that hosts other entities, particularly Sensors, Actuators, Samplers, and other Platforms.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "Platform@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition
   #xsd/langString
    "A Platform is an entity that hosts other entities, particularly Sensors, Actuators, Samplers, and other Platforms.@en",
   :skos/example
   #xsd/langString
    "A post, buoy, vehicle, ship, aircraft, satellite, cell-phone, human or animal may act as platforms for (technical or biological) sensors or actuators.@en"})

(def Procedure
  "A workflow, protocol, plan, algorithm, or computational method specifying how to make an Observation, create a Sample, or make a change to the state of the world (via an Actuator). A Procedure is re-usable, and might be involved in many Observations, Samplings, or Actuations. It explains the steps to be carried out to arrive at reproducible results."
  {:db/ident :sosa/Procedure,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/langString
    "A workflow, protocol, plan, algorithm, or computational method specifying how to make an Observation, create a Sample, or make a change to the state of the world (via an Actuator). A Procedure is re-usable, and might be involved in many Observations, Samplings, or Actuations. It explains the steps to be carried out to arrive at reproducible results.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "Procedure@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition
   #xsd/langString
    "A workflow, protocol, plan, algorithm, or computational method specifying how to make an Observation, create a Sample, or make a change to the state of the world (via an Actuator). A Procedure is re-usable, and might be involved in many Observations, Samplings, or Actuations. It explains the steps to be carried out to arrive at reproducible results.@en",
   :skos/example
   #xsd/langString
    "The measured wind speed differs depending on the height of the sensor above the surface, e.g., due to friction. Consequently, procedures for measuring wind speed define a standard height for anemometers above ground, typically 10m for meteorological measures and 2m in Agrometeorology. This definition of height, sensor placement, and so forth are defined by the Procedure.@en",
   :skos/note
   #xsd/langString
    "Many observations may be created via the same Procedure, the same way as many tables are assembled using the same instructions (as information objects, not their concrete realization).@en"})

(def Result
  "The Result of an Observation, Actuation, or act of Sampling. To store an observation's simple result value one can use the hasSimpleResult property."
  {:db/ident :sosa/Result,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/langString
    "The Result of an Observation, Actuation, or act of Sampling. To store an observation's simple result value one can use the hasSimpleResult property.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "Result@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition
   #xsd/langString
    "The Result of an Observation, Actuation, or act of Sampling. To store an observation's simple result value one can use the hasSimpleResult property.@en",
   :skos/example
   #xsd/langString
    "The value 20 as the height of a certain tree together with the unit, e.g., Meter.@en"})

(def Sample
  "Sample"
  {:db/ident :sosa/Sample,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   [#xsd/langString
     "Samples are artifacts of an observational strategy, and have no significant function outside of their role in the observation process. The characteristics of the samples themselves are of little interest, except perhaps to the manager of a sampling campaign.\n\nA Sample is intended to sample some FatureOfInterest, so there is an expectation of at least one isSampleOf property. However, in some cases the identity, and even the exact type, of the sampled feature may not be known when observations are made using the sampling features.@en"
    #xsd/langString "A Sample is the result from an act of Sampling.@en"
    #xsd/langString
     "Feature which is intended to be representative of a FeatureOfInterest on which Observations may be made.@en"
    #xsd/langString "Physical samples are sometimes known as 'specimens'.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "Sample@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition
   #xsd/langString
    "Feature which is intended to be representative of a FeatureOfInterest on which Observations may be made.@en",
   :skos/example
   [#xsd/langString
     "A 'station' is essentially an identifiable locality where a sensor system or Procedure may be deployed and an observation made. In the context of the observation model, it connotes the 'world in the vicinity of the station', so the observed properties relate to the physical medium at the station, and not to any physical artifact such as a mooring, buoy, benchmark, monument, well, etc.@en"
    #xsd/langString
     "A statistical sample is often designed to be characteristic of an entire population, so that observations can be made regarding the sample that provide a good estimate of the properties of the population.@en"],
   :skos/note
   #xsd/langString
    "A transient sample, such as a ships-track or flight-line, might be identified and described, but is unlikely to be revisited exactly.@en"})

(def Sampler
  "A device that is used by, or implements, a Sampling Procedure to create or transform one or more samples."
  {:db/ident :sosa/Sampler,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/langString
    "A device that is used by, or implements, a Sampling Procedure to create or transform one or more samples.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "Sampler@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition
   #xsd/langString
    "A device that is used by, or implements, a Sampling Procedure to create or transform one or more samples.@en",
   :skos/example
   #xsd/langString
    "A ball mill, diamond drill, hammer, hypodermic syringe and needle, image Sensor or a soil auger can all act as sampling devices (i.e., be Samplers). However, sometimes the distinction between the Sampler and the Sensor is not evident, as they are packaged as a unit. A Sampler need not be a physical device.@en"})

(def Sampling
  "An act of Sampling carries out a sampling Procedure to create or transform one or more samples."
  {:db/ident :sosa/Sampling,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/langString
    "An act of Sampling carries out a sampling Procedure to create or transform one or more samples.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "Sampling@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition
   #xsd/langString
    "An act of Sampling carries out a sampling Procedure to create or transform one or more samples.@en",
   :skos/example
   [#xsd/langString "Taking a diamond-drill core from a rock outcrop.@en"
    #xsd/langString "Drilling an observation well.@en"
    #xsd/langString
     "Sieving a powder to separate the subset finer than 100-mesh.@en"
    #xsd/langString "Selecting a subset of a population.@en"
    #xsd/langString "Establishing a station for environmental monitoring.@en"
    #xsd/langString "Dividing a field site into quadrants.@en"
    #xsd/langString "Drawing blood from a patient.@en"
    #xsd/langString "Digging a pit through a soil sequence.@en"
    #xsd/langString
     "Splitting a piece of drill-core to create two new samples.@en"
    #xsd/langString "Registering an image of the landscape.@en"
    #xsd/langString "Crushing a rock sample in a ball mill.@en"]})

(def Sensor
  "Device, agent (including humans), or software (simulation) involved in, or implementing, a Procedure. Sensors respond to a stimulus, e.g., a change in the environment, or input data composed from the results of prior Observations, and generate a Result. Sensors can be hosted by Platforms."
  {:db/ident :sosa/Sensor,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/langString
    "Device, agent (including humans), or software (simulation) involved in, or implementing, a Procedure. Sensors respond to a stimulus, e.g., a change in the environment, or input data composed from the results of prior Observations, and generate a Result. Sensors can be hosted by Platforms.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "Sensor@en",
   :rdfs/subClassOf :rdfs/Resource,
   :skos/definition
   #xsd/langString
    "Device, agent (including humans), or software (simulation) involved in, or implementing, a Procedure. Sensors respond to a stimulus, e.g., a change in the environment, or input data composed from the results of prior Observations, and generate a Result. Sensors can be hosted by Platforms.@en",
   :skos/example
   #xsd/langString
    "Accelerometers, gyroscopes, barometers, magnetometers, and so forth are Sensors that are typically mounted on a modern smart phone (which acts as Platform). Other examples of sensors include the human eyes.@en"})

(def actsOnProperty
  "Relation between an Actuation and the property of a FeatureOfInterest it is acting upon."
  {:db/ident :sosa/actsOnProperty,
   :owl/inverseOf :sosa/isActedOnBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relation between an Actuation and the property of a FeatureOfInterest it is acting upon.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "acts on property@en",
   :schema/domainIncludes :sosa/Actuation,
   :schema/rangeIncludes :sosa/ActuatableProperty,
   :skos/definition
   #xsd/langString
    "Relation between an Actuation and the property of a FeatureOfInterest it is acting upon.@en",
   :skos/example
   #xsd/langString
    "In the activity (Actuation) of automatically closing a window if the temperature in a room drops below 20 degrees Celsius, the property on which the Actuator acts upon is the state of the window as it changes from being open to being closed. @en"})

(def hasFeatureOfInterest
  "A relation between an Observation and the entity whose quality was observed, or between an Actuation and the entity whose property was modified, or between an act of Sampling and the entity that was sampled."
  {:db/ident :sosa/hasFeatureOfInterest,
   :owl/inverseOf :sosa/isFeatureOfInterestOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "A relation between an Observation and the entity whose quality was observed, or between an Actuation and the entity whose property was modified, or between an act of Sampling and the entity that was sampled.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "has feature of interest@en",
   :schema/domainIncludes [:sosa/Observation :sosa/Sampling :sosa/Actuation],
   :schema/rangeIncludes [:sosa/FeatureOfInterest :sosa/Sample],
   :skos/definition
   #xsd/langString
    "A relation between an Observation and the entity whose quality was observed, or between an Actuation and the entity whose property was modified, or between an act of Sampling and the entity that was sampled.@en",
   :skos/example
   #xsd/langString
    "For example, in an Observation of the weight of a person, the FeatureOfInterest is the person and the property is its weight.@en"})

(def hasResult
  "Relation linking an Observation or Actuation or act of Sampling and a Result or Sample."
  {:db/ident :sosa/hasResult,
   :owl/inverseOf :sosa/isResultOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relation linking an Observation or Actuation or act of Sampling and a Result or Sample.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "has result@en",
   :schema/domainIncludes [:sosa/Sampling :sosa/Actuation :sosa/Observation],
   :schema/rangeIncludes [:sosa/Result :sosa/Sample],
   :skos/definition
   #xsd/langString
    "Relation linking an Observation or Actuation or act of Sampling and a Result or Sample.@en"})

(def hasSample
  "Relation between a FeatureOfInterest and the Sample used to represent it."
  {:db/ident :sosa/hasSample,
   :owl/inverseOf :sosa/isSampleOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relation between a FeatureOfInterest and the Sample used to represent it.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "has sample@en",
   :schema/domainIncludes :sosa/FeatureOfInterest,
   :schema/rangeIncludes :sosa/Sample,
   :skos/definition
   #xsd/langString
    "Relation between a FeatureOfInterest and the Sample used to represent it.@en"})

(def hasSimpleResult
  "The simple value of an Observation or Actuation or act of Sampling."
  {:db/ident :sosa/hasSimpleResult,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The simple value of an Observation or Actuation or act of Sampling.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "has simple result@en",
   :schema/domainIncludes [:sosa/Sampling :sosa/Observation :sosa/Actuation],
   :skos/definition
   #xsd/langString
    "The simple value of an Observation or Actuation or act of Sampling.@en",
   :skos/example #xsd/langString "For instance, the values 23 or true.@en"})

(def hosts
  "Relation between a Platform and a Sensor, Actuator, Sampler, or Platform, hosted or mounted on it."
  {:db/ident :sosa/hosts,
   :owl/inverseOf :sosa/isHostedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relation between a Platform and a Sensor, Actuator, Sampler, or Platform, hosted or mounted on it.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "hosts@en",
   :schema/domainIncludes :sosa/Platform,
   :schema/rangeIncludes
   [:sosa/Platform :sosa/Actuator :sosa/Sampler :sosa/Sensor],
   :skos/definition
   #xsd/langString
    "Relation between a Platform and a Sensor, Actuator, Sampler, or Platform, hosted or mounted on it.@en"})

(def isActedOnBy
  "Relation between an ActuatableProperty of a FeatureOfInterest and an Actuation changing its state."
  {:db/ident :sosa/isActedOnBy,
   :owl/inverseOf :sosa/actsOnProperty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relation between an ActuatableProperty of a FeatureOfInterest and an Actuation changing its state.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "is acted on by@en",
   :schema/domainIncludes :sosa/ActuatableProperty,
   :schema/rangeIncludes :sosa/Actuation,
   :skos/definition
   #xsd/langString
    "Relation between an ActuatableProperty of a FeatureOfInterest and an Actuation changing its state.@en",
   :skos/example
   #xsd/langString
    "In the activity (Actuation) of automatically closing a window if the temperature in a room drops below 20 degrees Celsius, the property on which the Actuator acts upon is the state of the window as it changes from being open to being closed. @en"})

(def isFeatureOfInterestOf
  "A relation between a FeatureOfInterest and an Observation about it, an Actuation acting on it, or an act of Sampling that sampled it."
  {:db/ident :sosa/isFeatureOfInterestOf,
   :owl/inverseOf :sosa/hasFeatureOfInterest,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "A relation between a FeatureOfInterest and an Observation about it, an Actuation acting on it, or an act of Sampling that sampled it.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "is feature of interest of@en",
   :schema/domainIncludes [:sosa/FeatureOfInterest :sosa/Sample],
   :schema/rangeIncludes [:sosa/Actuation :sosa/Sampling :sosa/Observation],
   :skos/definition
   #xsd/langString
    "A relation between a FeatureOfInterest and an Observation about it, an Actuation acting on it, or an act of Sampling that sampled it.@en"})

(def isHostedBy
  "Relation between a Sensor, Actuator, Sampler, or Platform, and the Platform that it is mounted on or hosted by."
  {:db/ident :sosa/isHostedBy,
   :owl/inverseOf :sosa/hosts,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relation between a Sensor, Actuator, Sampler, or Platform, and the Platform that it is mounted on or hosted by.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "is hosted by@en",
   :schema/domainIncludes
   [:sosa/Platform :sosa/Sampler :sosa/Sensor :sosa/Actuator],
   :schema/rangeIncludes :sosa/Platform,
   :skos/definition
   #xsd/langString
    "Relation between a Sensor, Actuator, Sampler, or Platform, and the Platform that it is mounted on or hosted by.@en"})

(def isObservedBy
  "Relation between an ObservableProperty and the Sensor able to observe it."
  {:db/ident :sosa/isObservedBy,
   :owl/inverseOf :sosa/observes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relation between an ObservableProperty and the Sensor able to observe it.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "is observed by@en",
   :schema/domainIncludes :sosa/ObservableProperty,
   :schema/rangeIncludes :sosa/Sensor,
   :skos/definition
   #xsd/langString
    "Relation between an ObservableProperty and the Sensor able to observe it.@en"})

(def isResultOf
  "Relation linking a Result to the Observation or Actuation or act of Sampling that created or caused it."
  {:db/ident :sosa/isResultOf,
   :owl/inverseOf :sosa/hasResult,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relation linking a Result to the Observation or Actuation or act of Sampling that created or caused it.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "is result of@en",
   :schema/domainIncludes [:sosa/Sample :sosa/Result],
   :schema/rangeIncludes [:sosa/Actuation :sosa/Observation :sosa/Sampling],
   :skos/definition
   #xsd/langString
    "Relation linking a Result to the Observation or Actuation or act of Sampling that created or caused it.@en"})

(def isSampleOf
  "Relation from a Sample to the FeatureOfInterest that it is intended to be representative of."
  {:db/ident :sosa/isSampleOf,
   :owl/inverseOf :sosa/hasSample,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relation from a Sample to the FeatureOfInterest that it is intended to be representative of.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "is sample of@en",
   :schema/domainIncludes :sosa/Sample,
   :schema/rangeIncludes :sosa/FeatureOfInterest,
   :skos/definition
   #xsd/langString
    "Relation from a Sample to the FeatureOfInterest that it is intended to be representative of.@en"})

(def madeActuation
  "Relation between an Actuator and the Actuation it has made."
  {:db/ident :sosa/madeActuation,
   :owl/inverseOf :sosa/madeByActuator,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relation between an Actuator and the Actuation it has made.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "made actuation@en",
   :schema/domainIncludes :sosa/Actuator,
   :schema/rangeIncludes :sosa/Actuation,
   :skos/definition
   #xsd/langString
    "Relation between an Actuator and the Actuation it has made.@en"})

(def madeByActuator
  "Relation linking an Actuation to the Actuator that made that Actuation."
  {:db/ident :sosa/madeByActuator,
   :owl/inverseOf :sosa/madeActuation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relation linking an Actuation to the Actuator that made that Actuation.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "made by actuator@en",
   :schema/domainIncludes :sosa/Actuation,
   :schema/rangeIncludes :sosa/Actuator,
   :skos/definition
   #xsd/langString
    "Relation linking an Actuation to the Actuator that made that Actuation.@en"})

(def madeBySampler
  "Relation linking an act of Sampling to the Sampler (sampling device or entity) that made it."
  {:db/ident :sosa/madeBySampler,
   :owl/inverseOf :sosa/madeSampling,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relation linking an act of Sampling to the Sampler (sampling device or entity) that made it.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "made by sampler@en",
   :schema/domainIncludes :sosa/Sampling,
   :schema/rangeIncludes :sosa/Sampler,
   :skos/definition
   #xsd/langString
    "Relation linking an act of Sampling to the Sampler (sampling device or entity) that made it.@en"})

(def madeBySensor
  "Relation between an Observation and the Sensor which made the Observation."
  {:db/ident :sosa/madeBySensor,
   :owl/inverseOf :sosa/madeObservation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relation between an Observation and the Sensor which made the Observation.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "made by sensor@en",
   :schema/domainIncludes :sosa/Observation,
   :schema/rangeIncludes :sosa/Sensor,
   :skos/definition
   #xsd/langString
    "Relation between an Observation and the Sensor which made the Observation.@en"})

(def madeObservation
  "Relation between a Sensor and an Observation made by the Sensor."
  {:db/ident :sosa/madeObservation,
   :owl/inverseOf :sosa/madeBySensor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relation between a Sensor and an Observation made by the Sensor.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "made observation@en",
   :schema/domainIncludes :sosa/Sensor,
   :schema/rangeIncludes :sosa/Observation,
   :skos/definition
   #xsd/langString
    "Relation between a Sensor and an Observation made by the Sensor.@en"})

(def madeSampling
  "Relation between a Sampler (sampling device or entity) and the Sampling act it performed."
  {:db/ident :sosa/madeSampling,
   :owl/inverseOf :sosa/madeBySampler,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relation between a Sampler (sampling device or entity) and the Sampling act it performed.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "made sampling@en",
   :schema/domainIncludes :sosa/Sampler,
   :schema/rangeIncludes :sosa/Sampling,
   :skos/definition
   #xsd/langString
    "Relation between a Sampler (sampling device or entity) and the Sampling act it performed.@en"})

(def observedProperty
  "Relation linking an Observation to the property that was observed. The ObservableProperty should be a property of the FeatureOfInterest (linked by hasFeatureOfInterest) of this Observation."
  {:db/ident :sosa/observedProperty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relation linking an Observation to the property that was observed. The ObservableProperty should be a property of the FeatureOfInterest (linked by hasFeatureOfInterest) of this Observation.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "observed property@en",
   :schema/domainIncludes :sosa/Observation,
   :schema/rangeIncludes :sosa/ObservableProperty,
   :skos/definition
   #xsd/langString
    "Relation linking an Observation to the property that was observed. The ObservableProperty should be a property of the FeatureOfInterest (linked by hasFeatureOfInterest) of this Observation.@en"})

(def observes
  "Relation between a Sensor and an ObservableProperty that it is capable of sensing."
  {:db/ident :sosa/observes,
   :owl/inverseOf :sosa/isObservedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Relation between a Sensor and an ObservableProperty that it is capable of sensing.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "observes@en",
   :schema/domainIncludes :sosa/Sensor,
   :schema/rangeIncludes :sosa/ObservableProperty,
   :skos/definition
   #xsd/langString
    "Relation between a Sensor and an ObservableProperty that it is capable of sensing.@en"})

(def phenomenonTime
  "The time that the Result of an Observation, Actuation or Sampling applies to the FeatureOfInterest. Not necessarily the same as the resultTime. May be an Interval or an Instant, or some other compound TemporalEntity."
  {:db/ident :sosa/phenomenonTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "The time that the Result of an Observation, Actuation or Sampling applies to the FeatureOfInterest. Not necessarily the same as the resultTime. May be an Interval or an Instant, or some other compound TemporalEntity.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "phenomenon time@en",
   :schema/domainIncludes [:sosa/Sampling :sosa/Observation :sosa/Actuation],
   :schema/rangeIncludes :time/TemporalEntity,
   :skos/definition
   #xsd/langString
    "The time that the Result of an Observation, Actuation or Sampling applies to the FeatureOfInterest. Not necessarily the same as the resultTime. May be an Interval or an Instant, or some other compound TemporalEntity.@en"})

(def resultTime
  "The result time is the instant of time when the Observation, Actuation or Sampling activity was completed."
  {:db/ident :sosa/resultTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The result time is the instant of time when the Observation, Actuation or Sampling activity was completed.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "result time@en",
   :rdfs/range :xsd/dateTime,
   :schema/domainIncludes [:sosa/Sampling :sosa/Observation :sosa/Actuation],
   :skos/definition
   #xsd/langString
    "The result time is the instant of time when the Observation, Actuation or Sampling activity was completed.@en"})

(def usedProcedure
  "A relation to link to a re-usable Procedure used in making an Observation, an Actuation, or a Sample, typically through a Sensor, Actuator or Sampler."
  {:db/ident :sosa/usedProcedure,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "A relation to link to a re-usable Procedure used in making an Observation, an Actuation, or a Sample, typically through a Sensor, Actuator or Sampler.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/sosa/"},
   :rdfs/label #xsd/langString "used procedure@en",
   :schema/domainIncludes [:sosa/Sampling :sosa/Observation :sosa/Actuation],
   :schema/rangeIncludes :sosa/Procedure,
   :skos/definition
   #xsd/langString
    "A relation to link to a re-usable Procedure used in making an Observation, an Actuation, or a Sample, typically through a Sensor, Actuator or Sampler.@en"})