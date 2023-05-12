(ns net.wikipunk.rdf.sosa
  "This ontology is based on the SSN Ontology by the W3C Semantic Sensor Networks Incubator Group (SSN-XG), together with considerations from the W3C/OGC Spatial Data on the Web Working Group."
  {:dcterms/created #inst "2017-04-17T00:00:00.000-04:00",
   :dcterms/creator {:foaf/name "W3C/OGC Spatial Data on the Web Working Group",
                     :rdf/type  :foaf/Agent},
   :dcterms/description
   "This ontology is based on the SSN Ontology by the W3C Semantic Sensor Networks Incubator Group (SSN-XG), together with considerations from the W3C/OGC Spatial Data on the Web Working Group.",
   :dcterms/license
   ["http://www.opengeospatial.org/ogc/Software"
    "http://www.w3.org/Consortium/Legal/2015/copyright-software-and-document"],
   :dcterms/rights "Copyright 2017 W3C/OGC.",
   :dcterms/title "Sensor, Observation, Sample, and Actuator (SOSA) Ontology",
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
   :rdfs/isDefinedBy {:rdf/uri
                      "https://www.w3.org/TR/2017/REC-vocab-ssn-20171019/"},
   :vann/preferredNamespacePrefix "sosa",
   :vann/preferredNamespaceUri "http://www.w3.org/ns/sosa/"}
  (:refer-clojure :exclude [name]))

(def ActuatableProperty
  "An actuatable quality (property, characteristic) of a FeatureOfInterest."
  {:db/ident :sosa/ActuatableProperty,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "An actuatable quality (property, characteristic) of a FeatureOfInterest.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "Actuatable Property",
   :rdfs/subClassOf [:rdfs/Resource :sosa/ActuatableProperty],
   :skos/definition
   "An actuatable quality (property, characteristic) of a FeatureOfInterest.",
   :skos/example
   "A window actuator acts by changing the state between a frame and a window. The ability of the window to be opened and closed is its ActuatableProperty."})

(def Actuation
  "An Actuation carries out an (Actuation) Procedure to change the state of the world using an Actuator."
  {:db/ident :sosa/Actuation,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "An Actuation carries out an (Actuation) Procedure to change the state of the world using an Actuator.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "Actuation",
   :rdfs/subClassOf [:rdfs/Resource :sosa/Actuation],
   :skos/definition
   "An Actuation carries out an (Actuation) Procedure to change the state of the world using an Actuator.",
   :skos/example
   "The activity of automatically closing a window if the temperature in a room drops below 20 degree Celsius. The activity is the Actuation and the device that closes the window is the Actuator. The Procedure is the rule, plan, or specification that defines the conditions that triggers the Actuation, here a drop in temperature. "})

(def Actuator
  "A device that is used by, or implements, an (Actuation) Procedure that changes the state of the world."
  {:db/ident :sosa/Actuator,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "A device that is used by, or implements, an (Actuation) Procedure that changes the state of the world.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "Actuator",
   :rdfs/subClassOf [:rdfs/Resource :sosa/Actuator],
   :skos/definition
   "A device that is used by, or implements, an (Actuation) Procedure that changes the state of the world.",
   :skos/example
   "A window actuator for automatic window control, i.e., opening or closing the window."})

(def FeatureOfInterest
  "The thing whose property is being estimated or calculated in the course of an Observation to arrive at a Result or whose property is being manipulated by an Actuator, or which is being sampled or transformed in an act of Sampling."
  {:db/ident :sosa/FeatureOfInterest,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "The thing whose property is being estimated or calculated in the course of an Observation to arrive at a Result or whose property is being manipulated by an Actuator, or which is being sampled or transformed in an act of Sampling.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "Feature Of Interest",
   :rdfs/subClassOf [:rdfs/Resource :sosa/FeatureOfInterest],
   :skos/definition
   "The thing whose property is being estimated or calculated in the course of an Observation to arrive at a Result or whose property is being manipulated by an Actuator, or which is being sampled or transformed in an act of Sampling.",
   :skos/example
   "When measuring the height of a tree, the height is the observed ObservableProperty, 20m may be the Result of the Observation, and the tree is the FeatureOfInterest. A window is a FeatureOfInterest for an automatic window control Actuator."})

(def ObservableProperty
  "An observable quality (property, characteristic) of a FeatureOfInterest."
  {:db/ident :sosa/ObservableProperty,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "An observable quality (property, characteristic) of a FeatureOfInterest.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "Observable Property",
   :rdfs/subClassOf [:rdfs/Resource :sosa/ObservableProperty],
   :skos/definition
   "An observable quality (property, characteristic) of a FeatureOfInterest.",
   :skos/example
   "The height of a tree, the depth of a water body, or the temperature of a surface are examples of observable properties, while the value of a classic car is not (directly) observable but asserted."})

(def Observation
  "Act of carrying out an (Observation) Procedure to estimate or calculate a value of a property of a FeatureOfInterest. Links to a Sensor to describe what made the Observation and how; links to an ObservableProperty to describe what the result is an estimate of, and to a FeatureOfInterest to detail what that property was associated with."
  {:db/ident :sosa/Observation,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "Act of carrying out an (Observation) Procedure to estimate or calculate a value of a property of a FeatureOfInterest. Links to a Sensor to describe what made the Observation and how; links to an ObservableProperty to describe what the result is an estimate of, and to a FeatureOfInterest to detail what that property was associated with.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "Observation",
   :rdfs/subClassOf [:rdfs/Resource :sosa/Observation],
   :skos/definition
   "Act of carrying out an (Observation) Procedure to estimate or calculate a value of a property of a FeatureOfInterest. Links to a Sensor to describe what made the Observation and how; links to an ObservableProperty to describe what the result is an estimate of, and to a FeatureOfInterest to detail what that property was associated with.",
   :skos/example
   "The activity of estimating the intensity of an Earthquake using the Mercalli intensity scale is an Observation as is measuring the moment magnitude, i.e., the energy released by said earthquake."})

(def Platform
  "A Platform is an entity that hosts other entities, particularly Sensors, Actuators, Samplers, and other Platforms."
  {:db/ident :sosa/Platform,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "A Platform is an entity that hosts other entities, particularly Sensors, Actuators, Samplers, and other Platforms.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "Platform",
   :rdfs/subClassOf [:rdfs/Resource :sosa/Platform],
   :skos/definition
   "A Platform is an entity that hosts other entities, particularly Sensors, Actuators, Samplers, and other Platforms.",
   :skos/example
   "A post, buoy, vehicle, ship, aircraft, satellite, cell-phone, human or animal may act as platforms for (technical or biological) sensors or actuators."})

(def Procedure
  "A workflow, protocol, plan, algorithm, or computational method specifying how to make an Observation, create a Sample, or make a change to the state of the world (via an Actuator). A Procedure is re-usable, and might be involved in many Observations, Samplings, or Actuations. It explains the steps to be carried out to arrive at reproducible results."
  {:db/ident :sosa/Procedure,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "A workflow, protocol, plan, algorithm, or computational method specifying how to make an Observation, create a Sample, or make a change to the state of the world (via an Actuator). A Procedure is re-usable, and might be involved in many Observations, Samplings, or Actuations. It explains the steps to be carried out to arrive at reproducible results.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "Procedure",
   :rdfs/subClassOf [:rdfs/Resource :sosa/Procedure],
   :skos/definition
   "A workflow, protocol, plan, algorithm, or computational method specifying how to make an Observation, create a Sample, or make a change to the state of the world (via an Actuator). A Procedure is re-usable, and might be involved in many Observations, Samplings, or Actuations. It explains the steps to be carried out to arrive at reproducible results.",
   :skos/example
   "The measured wind speed differs depending on the height of the sensor above the surface, e.g., due to friction. Consequently, procedures for measuring wind speed define a standard height for anemometers above ground, typically 10m for meteorological measures and 2m in Agrometeorology. This definition of height, sensor placement, and so forth are defined by the Procedure.",
   :skos/note
   "Many observations may be created via the same Procedure, the same way as many tables are assembled using the same instructions (as information objects, not their concrete realization)."})

(def Result
  "The Result of an Observation, Actuation, or act of Sampling. To store an observation's simple result value one can use the hasSimpleResult property."
  {:db/ident :sosa/Result,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "The Result of an Observation, Actuation, or act of Sampling. To store an observation's simple result value one can use the hasSimpleResult property.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "Result",
   :rdfs/subClassOf [:rdfs/Resource :sosa/Result],
   :skos/definition
   "The Result of an Observation, Actuation, or act of Sampling. To store an observation's simple result value one can use the hasSimpleResult property.",
   :skos/example
   "The value 20 as the height of a certain tree together with the unit, e.g., Meter."})

(def Sample
  "Feature which is intended to be representative of a FeatureOfInterest on which Observations may be made."
  {:db/ident :sosa/Sample,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   ["Samples are artifacts of an observational strategy, and have no significant function outside of their role in the observation process. The characteristics of the samples themselves are of little interest, except perhaps to the manager of a sampling campaign.\n\nA Sample is intended to sample some FatureOfInterest, so there is an expectation of at least one isSampleOf property. However, in some cases the identity, and even the exact type, of the sampled feature may not be known when observations are made using the sampling features."
    "A Sample is the result from an act of Sampling."
    "Feature which is intended to be representative of a FeatureOfInterest on which Observations may be made."
    "Physical samples are sometimes known as 'specimens'."],
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "Sample",
   :rdfs/subClassOf [:rdfs/Resource :sosa/Sample],
   :skos/definition
   "Feature which is intended to be representative of a FeatureOfInterest on which Observations may be made.",
   :skos/example
   ["A 'station' is essentially an identifiable locality where a sensor system or Procedure may be deployed and an observation made. In the context of the observation model, it connotes the 'world in the vicinity of the station', so the observed properties relate to the physical medium at the station, and not to any physical artifact such as a mooring, buoy, benchmark, monument, well, etc."
    "A statistical sample is often designed to be characteristic of an entire population, so that observations can be made regarding the sample that provide a good estimate of the properties of the population."],
   :skos/note
   "A transient sample, such as a ships-track or flight-line, might be identified and described, but is unlikely to be revisited exactly."})

(def Sampler
  "A device that is used by, or implements, a Sampling Procedure to create or transform one or more samples."
  {:db/ident :sosa/Sampler,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "A device that is used by, or implements, a Sampling Procedure to create or transform one or more samples.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "Sampler",
   :rdfs/subClassOf [:rdfs/Resource :sosa/Sampler],
   :skos/definition
   "A device that is used by, or implements, a Sampling Procedure to create or transform one or more samples.",
   :skos/example
   "A ball mill, diamond drill, hammer, hypodermic syringe and needle, image Sensor or a soil auger can all act as sampling devices (i.e., be Samplers). However, sometimes the distinction between the Sampler and the Sensor is not evident, as they are packaged as a unit. A Sampler need not be a physical device."})

(def Sampling
  "An act of Sampling carries out a sampling Procedure to create or transform one or more samples."
  {:db/ident :sosa/Sampling,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "An act of Sampling carries out a sampling Procedure to create or transform one or more samples.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "Sampling",
   :rdfs/subClassOf [:rdfs/Resource :sosa/Sampling],
   :skos/definition
   "An act of Sampling carries out a sampling Procedure to create or transform one or more samples.",
   :skos/example ["Taking a diamond-drill core from a rock outcrop."
                  "Drilling an observation well."
                  "Sieving a powder to separate the subset finer than 100-mesh."
                  "Selecting a subset of a population."
                  "Establishing a station for environmental monitoring."
                  "Dividing a field site into quadrants."
                  "Drawing blood from a patient."
                  "Digging a pit through a soil sequence."
                  "Splitting a piece of drill-core to create two new samples."
                  "Registering an image of the landscape."
                  "Crushing a rock sample in a ball mill."]})

(def Sensor
  "Device, agent (including humans), or software (simulation) involved in, or implementing, a Procedure. Sensors respond to a stimulus, e.g., a change in the environment, or input data composed from the results of prior Observations, and generate a Result. Sensors can be hosted by Platforms."
  {:db/ident :sosa/Sensor,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "Device, agent (including humans), or software (simulation) involved in, or implementing, a Procedure. Sensors respond to a stimulus, e.g., a change in the environment, or input data composed from the results of prior Observations, and generate a Result. Sensors can be hosted by Platforms.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "Sensor",
   :rdfs/subClassOf [:rdfs/Resource :sosa/Sensor],
   :skos/definition
   "Device, agent (including humans), or software (simulation) involved in, or implementing, a Procedure. Sensors respond to a stimulus, e.g., a change in the environment, or input data composed from the results of prior Observations, and generate a Result. Sensors can be hosted by Platforms.",
   :skos/example
   "Accelerometers, gyroscopes, barometers, magnetometers, and so forth are Sensors that are typically mounted on a modern smart phone (which acts as Platform). Other examples of sensors include the human eyes."})

(def actsOnProperty
  "Relation between an Actuation and the property of a FeatureOfInterest it is acting upon."
  {:db/ident :sosa/actsOnProperty,
   :owl/inverseOf :sosa/isActedOnBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Relation between an Actuation and the property of a FeatureOfInterest it is acting upon.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "acts on property",
   :schema/domainIncludes :sosa/Actuation,
   :schema/rangeIncludes :sosa/ActuatableProperty,
   :skos/definition
   "Relation between an Actuation and the property of a FeatureOfInterest it is acting upon.",
   :skos/example
   "In the activity (Actuation) of automatically closing a window if the temperature in a room drops below 20 degrees Celsius, the property on which the Actuator acts upon is the state of the window as it changes from being open to being closed. "})

(def hasFeatureOfInterest
  "A relation between an Observation and the entity whose quality was observed, or between an Actuation and the entity whose property was modified, or between an act of Sampling and the entity that was sampled."
  {:db/ident :sosa/hasFeatureOfInterest,
   :owl/inverseOf :sosa/isFeatureOfInterestOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between an Observation and the entity whose quality was observed, or between an Actuation and the entity whose property was modified, or between an act of Sampling and the entity that was sampled.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "has feature of interest",
   :schema/domainIncludes [:sosa/Observation :sosa/Sampling :sosa/Actuation],
   :schema/rangeIncludes [:sosa/FeatureOfInterest :sosa/Sample],
   :skos/definition
   "A relation between an Observation and the entity whose quality was observed, or between an Actuation and the entity whose property was modified, or between an act of Sampling and the entity that was sampled.",
   :skos/example
   "For example, in an Observation of the weight of a person, the FeatureOfInterest is the person and the property is its weight."})

(def hasResult
  "Relation linking an Observation or Actuation or act of Sampling and a Result or Sample."
  {:db/ident :sosa/hasResult,
   :owl/inverseOf :sosa/isResultOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Relation linking an Observation or Actuation or act of Sampling and a Result or Sample.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "has result",
   :schema/domainIncludes [:sosa/Sampling :sosa/Actuation :sosa/Observation],
   :schema/rangeIncludes [:sosa/Result :sosa/Sample],
   :skos/definition
   "Relation linking an Observation or Actuation or act of Sampling and a Result or Sample."})

(def hasSample
  "Relation between a FeatureOfInterest and the Sample used to represent it."
  {:db/ident :sosa/hasSample,
   :owl/inverseOf :sosa/isSampleOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Relation between a FeatureOfInterest and the Sample used to represent it.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "has sample",
   :schema/domainIncludes :sosa/FeatureOfInterest,
   :schema/rangeIncludes :sosa/Sample,
   :skos/definition
   "Relation between a FeatureOfInterest and the Sample used to represent it."})

(def hasSimpleResult
  "The simple value of an Observation or Actuation or act of Sampling."
  {:db/ident :sosa/hasSimpleResult,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The simple value of an Observation or Actuation or act of Sampling.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "has simple result",
   :schema/domainIncludes [:sosa/Sampling :sosa/Observation :sosa/Actuation],
   :skos/definition
   "The simple value of an Observation or Actuation or act of Sampling.",
   :skos/example "For instance, the values 23 or true."})

(def hosts
  "Relation between a Platform and a Sensor, Actuator, Sampler, or Platform, hosted or mounted on it."
  {:db/ident :sosa/hosts,
   :owl/inverseOf :sosa/isHostedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Relation between a Platform and a Sensor, Actuator, Sampler, or Platform, hosted or mounted on it.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "hosts",
   :schema/domainIncludes :sosa/Platform,
   :schema/rangeIncludes
   [:sosa/Platform :sosa/Actuator :sosa/Sampler :sosa/Sensor],
   :skos/definition
   "Relation between a Platform and a Sensor, Actuator, Sampler, or Platform, hosted or mounted on it."})

(def isActedOnBy
  "Relation between an ActuatableProperty of a FeatureOfInterest and an Actuation changing its state."
  {:db/ident :sosa/isActedOnBy,
   :owl/inverseOf :sosa/actsOnProperty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Relation between an ActuatableProperty of a FeatureOfInterest and an Actuation changing its state.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "is acted on by",
   :schema/domainIncludes :sosa/ActuatableProperty,
   :schema/rangeIncludes :sosa/Actuation,
   :skos/definition
   "Relation between an ActuatableProperty of a FeatureOfInterest and an Actuation changing its state.",
   :skos/example
   "In the activity (Actuation) of automatically closing a window if the temperature in a room drops below 20 degrees Celsius, the property on which the Actuator acts upon is the state of the window as it changes from being open to being closed. "})

(def isFeatureOfInterestOf
  "A relation between a FeatureOfInterest and an Observation about it, an Actuation acting on it, or an act of Sampling that sampled it."
  {:db/ident :sosa/isFeatureOfInterestOf,
   :owl/inverseOf :sosa/hasFeatureOfInterest,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between a FeatureOfInterest and an Observation about it, an Actuation acting on it, or an act of Sampling that sampled it.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "is feature of interest of",
   :schema/domainIncludes [:sosa/FeatureOfInterest :sosa/Sample],
   :schema/rangeIncludes [:sosa/Actuation :sosa/Sampling :sosa/Observation],
   :skos/definition
   "A relation between a FeatureOfInterest and an Observation about it, an Actuation acting on it, or an act of Sampling that sampled it."})

(def isHostedBy
  "Relation between a Sensor, Actuator, Sampler, or Platform, and the Platform that it is mounted on or hosted by."
  {:db/ident :sosa/isHostedBy,
   :owl/inverseOf :sosa/hosts,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Relation between a Sensor, Actuator, Sampler, or Platform, and the Platform that it is mounted on or hosted by.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "is hosted by",
   :schema/domainIncludes
   [:sosa/Platform :sosa/Sampler :sosa/Sensor :sosa/Actuator],
   :schema/rangeIncludes :sosa/Platform,
   :skos/definition
   "Relation between a Sensor, Actuator, Sampler, or Platform, and the Platform that it is mounted on or hosted by."})

(def isObservedBy
  "Relation between an ObservableProperty and the Sensor able to observe it."
  {:db/ident :sosa/isObservedBy,
   :owl/inverseOf :sosa/observes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Relation between an ObservableProperty and the Sensor able to observe it.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "is observed by",
   :schema/domainIncludes :sosa/ObservableProperty,
   :schema/rangeIncludes :sosa/Sensor,
   :skos/definition
   "Relation between an ObservableProperty and the Sensor able to observe it."})

(def isResultOf
  "Relation linking a Result to the Observation or Actuation or act of Sampling that created or caused it."
  {:db/ident :sosa/isResultOf,
   :owl/inverseOf :sosa/hasResult,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Relation linking a Result to the Observation or Actuation or act of Sampling that created or caused it.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "is result of",
   :schema/domainIncludes [:sosa/Sample :sosa/Result],
   :schema/rangeIncludes [:sosa/Actuation :sosa/Observation :sosa/Sampling],
   :skos/definition
   "Relation linking a Result to the Observation or Actuation or act of Sampling that created or caused it."})

(def isSampleOf
  "Relation from a Sample to the FeatureOfInterest that it is intended to be representative of."
  {:db/ident :sosa/isSampleOf,
   :owl/inverseOf :sosa/hasSample,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Relation from a Sample to the FeatureOfInterest that it is intended to be representative of.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "is sample of",
   :schema/domainIncludes :sosa/Sample,
   :schema/rangeIncludes :sosa/FeatureOfInterest,
   :skos/definition
   "Relation from a Sample to the FeatureOfInterest that it is intended to be representative of."})

(def madeActuation
  "Relation between an Actuator and the Actuation it has made."
  {:db/ident :sosa/madeActuation,
   :owl/inverseOf :sosa/madeByActuator,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Relation between an Actuator and the Actuation it has made.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "made actuation",
   :schema/domainIncludes :sosa/Actuator,
   :schema/rangeIncludes :sosa/Actuation,
   :skos/definition
   "Relation between an Actuator and the Actuation it has made."})

(def madeByActuator
  "Relation linking an Actuation to the Actuator that made that Actuation."
  {:db/ident :sosa/madeByActuator,
   :owl/inverseOf :sosa/madeActuation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Relation linking an Actuation to the Actuator that made that Actuation.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "made by actuator",
   :schema/domainIncludes :sosa/Actuation,
   :schema/rangeIncludes :sosa/Actuator,
   :skos/definition
   "Relation linking an Actuation to the Actuator that made that Actuation."})

(def madeBySampler
  "Relation linking an act of Sampling to the Sampler (sampling device or entity) that made it."
  {:db/ident :sosa/madeBySampler,
   :owl/inverseOf :sosa/madeSampling,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Relation linking an act of Sampling to the Sampler (sampling device or entity) that made it.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "made by sampler",
   :schema/domainIncludes :sosa/Sampling,
   :schema/rangeIncludes :sosa/Sampler,
   :skos/definition
   "Relation linking an act of Sampling to the Sampler (sampling device or entity) that made it."})

(def madeBySensor
  "Relation between an Observation and the Sensor which made the Observation."
  {:db/ident :sosa/madeBySensor,
   :owl/inverseOf :sosa/madeObservation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Relation between an Observation and the Sensor which made the Observation.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "made by sensor",
   :schema/domainIncludes :sosa/Observation,
   :schema/rangeIncludes :sosa/Sensor,
   :skos/definition
   "Relation between an Observation and the Sensor which made the Observation."})

(def madeObservation
  "Relation between a Sensor and an Observation made by the Sensor."
  {:db/ident :sosa/madeObservation,
   :owl/inverseOf :sosa/madeBySensor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Relation between a Sensor and an Observation made by the Sensor.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "made observation",
   :schema/domainIncludes :sosa/Sensor,
   :schema/rangeIncludes :sosa/Observation,
   :skos/definition
   "Relation between a Sensor and an Observation made by the Sensor."})

(def madeSampling
  "Relation between a Sampler (sampling device or entity) and the Sampling act it performed."
  {:db/ident :sosa/madeSampling,
   :owl/inverseOf :sosa/madeBySampler,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Relation between a Sampler (sampling device or entity) and the Sampling act it performed.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "made sampling",
   :schema/domainIncludes :sosa/Sampler,
   :schema/rangeIncludes :sosa/Sampling,
   :skos/definition
   "Relation between a Sampler (sampling device or entity) and the Sampling act it performed."})

(def observedProperty
  "Relation linking an Observation to the property that was observed. The ObservableProperty should be a property of the FeatureOfInterest (linked by hasFeatureOfInterest) of this Observation."
  {:db/ident :sosa/observedProperty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Relation linking an Observation to the property that was observed. The ObservableProperty should be a property of the FeatureOfInterest (linked by hasFeatureOfInterest) of this Observation.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "observed property",
   :schema/domainIncludes :sosa/Observation,
   :schema/rangeIncludes :sosa/ObservableProperty,
   :skos/definition
   "Relation linking an Observation to the property that was observed. The ObservableProperty should be a property of the FeatureOfInterest (linked by hasFeatureOfInterest) of this Observation."})

(def observes
  "Relation between a Sensor and an ObservableProperty that it is capable of sensing."
  {:db/ident :sosa/observes,
   :owl/inverseOf :sosa/isObservedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Relation between a Sensor and an ObservableProperty that it is capable of sensing.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "observes",
   :schema/domainIncludes :sosa/Sensor,
   :schema/rangeIncludes :sosa/ObservableProperty,
   :skos/definition
   "Relation between a Sensor and an ObservableProperty that it is capable of sensing."})

(def phenomenonTime
  "The time that the Result of an Observation, Actuation or Sampling applies to the FeatureOfInterest. Not necessarily the same as the resultTime. May be an Interval or an Instant, or some other compound TemporalEntity."
  {:db/ident :sosa/phenomenonTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The time that the Result of an Observation, Actuation or Sampling applies to the FeatureOfInterest. Not necessarily the same as the resultTime. May be an Interval or an Instant, or some other compound TemporalEntity.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "phenomenon time",
   :schema/domainIncludes [:sosa/Sampling :sosa/Observation :sosa/Actuation],
   :schema/rangeIncludes :time/TemporalEntity,
   :skos/definition
   "The time that the Result of an Observation, Actuation or Sampling applies to the FeatureOfInterest. Not necessarily the same as the resultTime. May be an Interval or an Instant, or some other compound TemporalEntity."})

(def resultTime
  "The result time is the instant of time when the Observation, Actuation or Sampling activity was completed."
  {:db/ident :sosa/resultTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The result time is the instant of time when the Observation, Actuation or Sampling activity was completed.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "result time",
   :rdfs/range :xsd/dateTime,
   :schema/domainIncludes [:sosa/Sampling :sosa/Observation :sosa/Actuation],
   :skos/definition
   "The result time is the instant of time when the Observation, Actuation or Sampling activity was completed."})

(def usedProcedure
  "A relation to link to a re-usable Procedure used in making an Observation, an Actuation, or a Sample, typically through a Sensor, Actuator or Sampler."
  {:db/ident :sosa/usedProcedure,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation to link to a re-usable Procedure used in making an Observation, an Actuation, or a Sample, typically through a Sensor, Actuator or Sampler.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/sosa/",
   :rdfs/label "used procedure",
   :schema/domainIncludes [:sosa/Sampling :sosa/Observation :sosa/Actuation],
   :schema/rangeIncludes :sosa/Procedure,
   :skos/definition
   "A relation to link to a re-usable Procedure used in making an Observation, an Actuation, or a Sample, typically through a Sensor, Actuator or Sampler."})

(def ^{:private true} Agent
  {:db/ident :foaf/Agent,
   :rdf/type :owl/Class})

(def ^{:private true} name
  {:db/ident :foaf/name,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} domainIncludes
  {:db/ident :schema/domainIncludes,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} rangeIncludes
  {:db/ident :schema/rangeIncludes,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} definition
  {:db/ident :skos/definition,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} example
  {:db/ident :skos/example,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} note
  {:db/ident :skos/note,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} TemporalEntity
  {:db/ident :time/TemporalEntity,
   :rdf/type :owl/Class})

(def ^{:private true} preferredNamespacePrefix
  {:db/ident :vann/preferredNamespacePrefix,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} preferredNamespaceUri
  {:db/ident :vann/preferredNamespaceUri,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} Vocabulary
  {:db/ident :voaf/Vocabulary,
   :rdf/type :owl/Class})