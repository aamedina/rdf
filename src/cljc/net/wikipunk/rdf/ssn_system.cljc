(ns net.wikipunk.rdf.ssn-system
  {:dcterms/created #inst "2017-05-14T00:00:00.000-00:00",
   :dcterms/creator
   {:foaf/name {:rdf/language "en",
                :rdf/value    "W3C/OGC Spatial Data on the Web Working Group"},
    :rdf/type  :foaf/Agent},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "This ontology describes system capabilities, operating ranges, and survival ranges."},
   :dcterms/license
   #{{:xsd/anyURI "http://www.opengeospatial.org/ogc/Software"}
     {:xsd/anyURI
      "http://www.w3.org/Consortium/Legal/2015/copyright-software-and-document"}},
   :dcterms/rights "Copyright 2017 W3C/OGC.",
   :dcterms/title
   {:rdf/language "en",
    :rdf/value
    "System capabilities, operating ranges, and survival ranges ontology"},
   :namespaces {"dcterms"    "http://purl.org/dc/terms/",
                "foaf"       "http://xmlns.com/foaf/0.1/",
                "owl"        "http://www.w3.org/2002/07/owl#",
                "rdf"        "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs"       "http://www.w3.org/2000/01/rdf-schema#",
                "skos"       "http://www.w3.org/2004/02/skos/core#",
                "sosa"       "http://www.w3.org/ns/sosa/",
                "ssn"        "http://www.w3.org/ns/ssn/",
                "ssn-system" "http://www.w3.org/ns/ssn/systems/",
                "time"       "http://www.w3.org/2006/time#",
                "vann"       "http://purl.org/vocab/vann/",
                "voaf"       "http://purl.org/vocommons/voaf#",
                "xsd"        "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports {:xsd/anyURI "http://www.w3.org/ns/ssn/"},
   :rdf/type #{:owl/Ontology :voaf/Vocabulary},
   :rdfa/prefix "ssn-system",
   :rdfa/uri "http://www.w3.org/ns/ssn/systems/",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Please report any errors to the W3C Spatial Data on the Web Working Group via the SDW WG Public List public-sdw-wg@w3.org"},
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.w3.org/2015/spatial/wiki/Semantic_Sensor_Network_Ontology"},
   :vann/preferredNamespacePrefix "ssn-system",
   :vann/preferredNamespaceUri "http://www.w3.org/ns/ssn/systems/",
   :xsd/anyURI "http://www.w3.org/ns/ssn/systems/"})

(def Accuracy
  {:db/ident :ssn-system/Accuracy,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The closeness of agreement between the Result of an Observation (resp. the command of an Actuation) and the true value of the observed ObservableProperty (resp. of the acted on ActuatableProperty) under the defined Conditions."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Accuracy"},
   :rdfs/subClassOf :ssn-system/SystemProperty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The closeness of agreement between the Result of an Observation (resp. the command of an Actuation) and the true value of the observed ObservableProperty (resp. of the acted on ActuatableProperty) under the defined Conditions."}})

(def ActuationRange
  {:db/ident :ssn-system/ActuationRange,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The set of values that the Actuator can return as the Result of an Actuation under the defined Conditions with the defined system properties."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Actuation Range"},
   :rdfs/subClassOf
   #{{:owl/allValuesFrom {:owl/allValuesFrom :sosa/Actuator,
                          :owl/onProperty    {:owl/inverseOf
                                              :ssn-system/hasSystemCapability},
                          :rdf/type          :owl/Restriction},
      :owl/onProperty    {:owl/inverseOf :ssn-system/hasSystemProperty},
      :rdf/type          :owl/Restriction} :ssn-system/SystemProperty},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The set of values that the Actuator can return as the Result of an Actuation under the defined Conditions with the defined system properties."}})

(def BatteryLifetime
  {:db/ident :ssn-system/BatteryLifetime,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Total useful life of a System's battery in the specified Conditions."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Battery Lifetime"},
   :rdfs/subClassOf :ssn-system/SurvivalProperty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Total useful life of a System's battery in the specified Conditions."}})

(def Condition
  {:db/ident :ssn-system/Condition,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to specify ranges for qualities that act as conditions on a system/sensor's operation.  For example, wind speed of 10-60m/s may be used as the condition on a SystemProperty, for example, to state that a sensor has a particular accuracy in that condition."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Condition"},
   :rdfs/subClassOf :ssn/Property,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Used to specify ranges for qualities that act as conditions on a system/sensor's operation.  For example, wind speed of 10-60m/s may be used as the condition on a SystemProperty, for example, to state that a sensor has a particular accuracy in that condition."}})

(def DetectionLimit
  {:db/ident :ssn-system/DetectionLimit,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An observed value for which the probability of falsely claiming the absence of a component in a material is beta, given a probability alpha of falsely claiming its presence."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Detection Limit"},
   :rdfs/subClassOf
   #{:ssn-system/SystemProperty
     {:owl/allValuesFrom {:owl/allValuesFrom :sosa/Sensor,
                          :owl/onProperty    {:owl/inverseOf
                                              :ssn-system/hasSystemCapability},
                          :rdf/type          :owl/Restriction},
      :owl/onProperty    {:owl/inverseOf :ssn-system/hasSystemProperty},
      :rdf/type          :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An observed value for which the probability of falsely claiming the absence of a component in a material is beta, given a probability alpha of falsely claiming its presence."}})

(def Drift
  {:db/ident :ssn-system/Drift,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "As a Sensor Property: a continuous or incremental change in the reported values of Observations over time for an unchanging Property under the defined Conditions. \n\n      As an Actuator Property: a continuous or incremental change in the true value of the acted on ActuatableProperty over time for an unchanging command under the defined Conditions."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Drift"},
   :rdfs/subClassOf :ssn-system/SystemProperty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "As a Sensor Property: a continuous or incremental change in the reported values of Observations over time for an unchanging Property under the defined Conditions.\n\n      As an Actuator Property: a continuous or incremental change in the true value of the acted on ActuatableProperty over time for an unchanging command under the defined Conditions."}})

(def Frequency
  {:db/ident :ssn-system/Frequency,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The smallest possible time between one Observation, Actuation, or Sampling and the next, under the defined Conditions."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Frequency"},
   :rdfs/subClassOf :ssn-system/SystemProperty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The smallest possible time between one Observation, Actuation, or Sampling and the next, under the defined Conditions."}})

(def Latency
  {:db/ident :ssn-system/Latency,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The time between a command for an Observation (resp. Actuation) and the Sensor providing a Result (resp. the Actuator operating the Actuation), under the defined Conditions."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Latency"},
   :rdfs/subClassOf :ssn-system/SystemProperty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The time between a command for an Observation (resp. Actuation) and the Sensor providing a Result (resp. the Actuator operating the Actuation), under the defined Conditions."}})

(def MaintenanceSchedule
  {:db/ident :ssn-system/MaintenanceSchedule,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Schedule of maintenance for a System in the specified Conditions."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Maintenance Schedule"},
   :rdfs/subClassOf :ssn-system/OperatingProperty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Schedule of maintenance for a System in the specified Conditions."}})

(def MeasurementRange
  {:db/ident :ssn-system/MeasurementRange,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The set of values that the Sensor can return as the Result of an Observation under the defined Conditions."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Measurement Range"},
   :rdfs/subClassOf
   #{:ssn-system/SystemProperty
     {:owl/allValuesFrom {:owl/allValuesFrom :sosa/Sensor,
                          :owl/onProperty    {:owl/inverseOf
                                              :ssn-system/hasSystemCapability},
                          :rdf/type          :owl/Restriction},
      :owl/onProperty    {:owl/inverseOf :ssn-system/hasSystemProperty},
      :rdf/type          :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The set of values that the Sensor can return as the Result of an Observation under the defined Conditions."}})

(def OperatingPowerRange
  {:db/ident :ssn-system/OperatingPowerRange,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Power range in which a System is expected to operate in the specified Conditions."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Operating Power Range"},
   :rdfs/subClassOf :ssn-system/OperatingProperty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Power range in which a System is expected to operate in the specified Conditions."}})

(def OperatingProperty
  {:db/ident :ssn-system/OperatingProperty,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An identifiable characteristic that represents how the System operates under the specified Conditions. May describe power ranges, power sources, standard configurations, attachments and the like."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Operating Property"},
   :rdfs/subClassOf
   #{:ssn/Property
     {:owl/minCardinality 1,
      :owl/onProperty     {:owl/inverseOf :ssn-system/hasOperatingProperty},
      :rdf/type           :owl/Restriction}
     {:owl/allValuesFrom :ssn-system/OperatingRange,
      :owl/onProperty    {:owl/inverseOf :ssn-system/hasOperatingProperty},
      :rdf/type          :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An identifiable characteristic that represents how the System operates under the specified Conditions. May describe power ranges, power sources, standard configurations, attachments and the like."}})

(def OperatingRange
  {:db/ident :ssn-system/OperatingRange,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes normal OperatingProperties of a System under some specified Conditions. For example, to the power requirement or maintenance schedule of a System under a specified temperature range.\n\n    In the absence of OperatingProperties, simply describes the Conditions in which a System is expected to operate.\n\n    The System continues to operate as defined using SystemCapability. If, however, the SurvivalRange is violated, the System is 'damaged' and SystemCapability specifications may no longer hold."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Operating Range"},
   :rdfs/subClassOf #{{:owl/minCardinality 1,
                       :owl/onProperty     :ssn-system/inCondition,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :ssn/System,
                       :owl/onProperty    {:owl/inverseOf
                                           :ssn-system/hasOperatingRange},
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :ssn-system/OperatingProperty,
                       :owl/onProperty    :ssn-system/hasOperatingProperty,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :ssn-system/Condition,
                       :owl/onProperty    :ssn-system/inCondition,
                       :rdf/type          :owl/Restriction} :ssn/Property},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Describes normal OperatingProperties of a System under some specified Conditions. For example, to the power requirement or maintenance schedule of a System under a specified temperature range.\n\n    In the absence of OperatingProperties, it simply describes the Conditions in which a System is expected to operate.\n\n    The System continues to operate as defined using SystemCapability. If, however, the SurvivalRange is violated, the System is 'damaged' and SystemCapability specifications may no longer hold."}})

(def Precision
  {:db/ident :ssn-system/Precision,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "As a Sensor Property: the closeness of agreement between replicate Observations on an unchanged or similar Property value: i.e., a measure of a Sensor's ability to consistently reproduce an Observation, under the defined Conditions.\n\n      As an Actuator Property: the closeness of agreement between replicate Actuations for an unchanged or similar command: i.e., a measure of an Actuator's ability to consistently reproduce an Actuation, under the defined Conditions."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Precision"},
   :rdfs/subClassOf :ssn-system/SystemProperty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "As a Sensor Property: the closeness of agreement between replicate Observations on an unchanged or similar Property value: i.e., a measure of a Sensor's ability to consistently reproduce an Observation, under the defined Conditions.\n\n      As an Actuator Property: the closeness of agreement between replicate Actuations for an unchanged or similar command: i.e., a measure of an Actuator's ability to consistently reproduce an Actuation, under the defined Conditions."}})

(def Resolution
  {:db/ident :ssn-system/Resolution,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "As a Sensor Property: the smallest difference in the value of a ObservableProperty being observed that would result in perceptably different values of Observation Results, under the defined Conditions. \n\n      As an Actuator Property: the smallest difference in the value of an Actuation command that would result in a value change of the ActuatableProperty being acted on, under the defined Conditions."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Resolution"},
   :rdfs/subClassOf :ssn-system/SystemProperty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "As a Sensor Property: the smallest difference in the value of a ObservableProperty being observed that would result in perceptably different values of Observation Results, under the defined Conditions.\n\n      As an Actuator Property: the smallest difference in the value of an Actuation command that would result in a value change of the ActuatableProperty being acted on, under the defined Conditions."}})

(def ResponseTime
  {:db/ident :ssn-system/ResponseTime,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "As a Sensor Property: the time between a (step) change in the value of an observed ObservableProperty and a Sensor (possibly with specified error) 'settling' on an observed value, under the defined Conditions.\n\n      As an Actuator property: the time between a (step) change in the command of an Actuator and the 'settling' of the value of the acted on ActuatableProperty, under the defined Conditions."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Response Time"},
   :rdfs/subClassOf :ssn-system/SystemProperty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "As a Sensor Property: the time between a (step) change in the value of an observed ObservableProperty and a Sensor (possibly with specified error) 'settling' on an observed value, under the defined Conditions.\n\n      As an Actuator property: the time between a (step) change in the command of an Actuator and the 'settling' of the value of the acted on ActuatableProperty, under the defined Conditions."}})

(def Selectivity
  {:db/ident :ssn-system/Selectivity,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "As a Sensor Property: Selectivity is a Property of a Sensor whereby it provides observed values for one or more ObservableProperties such that the Results for each ObservableProperty are independent of other Properties in the FeatureOfInterest being investigated,  under the defined Conditions.\n\n      As an Actuator Property: Selectivity is a Property of an Actuator whereby it acts on one or more ActuatableProperties such as the Results for each ActuatableProperty are independent of other Properties in the FeatureOfInterest being acted on, under the defined Conditions."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Selectivity"},
   :rdfs/subClassOf :ssn-system/SystemProperty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "As a Sensor Property: Selectivity is a Property of a Sensor whereby it provides observed values for one or more ObservableProperties such that the Results for each ObservableProperty are independent of other Properties in the FeatureOfInterest being investigated,  under the defined Conditions.\n\n      As an Actuator Property: Selectivity is a Property of an Actuator whereby it acts on one or more ActuatableProperties such as the Results for each ActuatableProperty are independent of other Properties in the FeatureOfInterest being acted on, under the defined Conditions."}})

(def Sensitivity
  {:db/ident :ssn-system/Sensitivity,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "As a Sensor Property: Sensitivity is the quotient of the change in a Result of Observation and the corresponding change in a value of an ObservableProperty being observed, under the defined Conditions.\n\n       As an Actuator Property: Sensitivity is the quotient of the change in a command of Actuation and the corresponding change in a value of an ActuatableProperty being acted on, under the defined Conditions."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sensitivity"},
   :rdfs/subClassOf :ssn-system/SystemProperty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "As a Sensor Property: Sensitivity is the quotient of the change in a Result of Observation and the corresponding change in a value of an ObservableProperty being observed, under the defined Conditions.\n\n       As an Actuator Property: Sensitivity is the quotient of the change in a command of Actuation and the corresponding change in a value of an ActuatableProperty being acted on, under the defined Conditions."}})

(def SurvivalProperty
  {:db/ident :ssn-system/SurvivalProperty,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An identifiable characteristic that represents the extent of the System's useful life under the specified Conditions. May describe for example total battery life or number of recharges, or, for Sensors that are used only a fixed number of times, the number of observations that can be made before the sensing capability is depleted."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Survival Property"},
   :rdfs/subClassOf
   #{{:owl/allValuesFrom :ssn-system/SurvivalRange,
      :owl/onProperty    {:owl/inverseOf :ssn-system/hasSurvivalProperty},
      :rdf/type          :owl/Restriction}
     {:owl/minCardinality 1,
      :owl/onProperty     {:owl/inverseOf :ssn-system/hasSurvivalProperty},
      :rdf/type           :owl/Restriction} :ssn/Property},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An identifiable characteristic that represents the extent of the System's useful life under the specified Conditions. May describe for example total battery life or number of recharges, or, for Sensors that are used only a fixed number of times, the number of observations that can be made before the sensing capability is depleted."}})

(def SurvivalRange
  {:db/ident :ssn-system/SurvivalRange,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes survival capabilities of a System under some specified Conditions. For example, to the lifetime of a System under a specified temperature range.\n\n    In the absence of SurvivalProperties, simply describes the Conditions a System can be exposed to without damage. For example, the temperature range a System can withstand before being considered damaged.\n\n    The System continues to operate as defined using SystemCapability. If, however, the OperatingProperty is violated, the System is operating 'out of operating range' and SystemCapability specifications may no longer hold."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Survival Range"},
   :rdfs/subClassOf #{{:owl/minCardinality 1,
                       :owl/onProperty     :ssn-system/inCondition,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :ssn/System,
                       :owl/onProperty    {:owl/inverseOf
                                           :ssn-system/hasSurvivalRange},
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :ssn-system/Condition,
                       :owl/onProperty    :ssn-system/inCondition,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :ssn-system/SurvivalProperty,
                       :owl/onProperty    :ssn-system/hasSurvivalProperty,
                       :rdf/type          :owl/Restriction} :ssn/Property},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Describes SurvivalProperties of a System under some specified Conditions. For example, the lifetime of a System under a specified temperature range.\n\n    In the absence of SurvivalProperties, simply describes the Conditions a System can be exposed to without damage. For example, the temperature range a System can withstand before being considered damaged.\n\n    The System continues to operate as defined using SystemCapability. If, however, the SurvivalRange is violated, the System is 'damaged' and SystemCapability specifications may no longer hold."}})

(def SystemCapability
  {:db/ident :ssn-system/SystemCapability,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes normal measurement, actuation, sampling properties such as accuracy, range, precision, etc. of a System under some specified Conditions such as a temperature range.\n\n    The capabilities specified here are those that affect the primary purpose of the System, while those in OperatingRange represent the system's normal operating environment, including conditions that don't affect the observations or the actuations."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "System Capability"},
   :rdfs/subClassOf #{{:owl/minCardinality 1,
                       :owl/onProperty     :ssn-system/inCondition,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :ssn/Property,
                       :owl/onProperty    :ssn/forProperty,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :ssn-system/SystemProperty,
                       :owl/onProperty    :ssn-system/hasSystemProperty,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :ssn/System,
                       :owl/onProperty    {:owl/inverseOf
                                           :ssn-system/hasSystemCapability},
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :ssn-system/Condition,
                       :owl/onProperty    :ssn-system/inCondition,
                       :rdf/type          :owl/Restriction} :ssn/Property},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Describes normal measurement, actuation, sampling properties such as accuracy, range, precision, etc. of a System under some specified Conditions such as a temperature range.\n\n    The capabilities specified here are those that affect the primary purpose of the System, while those in OperatingRange represent the system's normal operating environment, including conditions that don't affect the observations or the actuations."}})

(def SystemLifetime
  {:db/ident :ssn-system/SystemLifetime,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Total useful life of a System (expressed as total life since manufacture, time in use, number of operations, etc.) in the specified Conditions."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "System Lifetime"},
   :rdfs/subClassOf :ssn-system/SurvivalProperty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Total useful life of a System (expressed as total life since manufacture, time in use, number of operations, etc.) in the specified Conditions."}})

(def SystemProperty
  {:db/ident :ssn-system/SystemProperty,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An identifiable and observable characteristic that represents the System's ability to operate its primary purpose: a Sensor to make Observations, an Actuator to make Actuations, or a Sampler to make Samplings."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "System Property"},
   :rdfs/subClassOf
   #{:ssn/Property
     {:owl/minCardinality 1,
      :owl/onProperty     {:owl/inverseOf :ssn-system/hasSystemProperty},
      :rdf/type           :owl/Restriction}
     {:owl/allValuesFrom :ssn-system/SystemCapability,
      :owl/onProperty    {:owl/inverseOf :ssn-system/hasSystemProperty},
      :rdf/type          :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An identifiable and observable characteristic that represents the System's ability to operate its primary purpose: a Sensor to make Observations, an Actuator to make Actuations, or a Sampler to make Samplings."}})

(def hasOperatingProperty
  {:db/ident :ssn-system/hasOperatingProperty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relation from an OperatingRange of a System to a OperatingPropery describing the operating range of the System."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has operating property"},
   :rdfs/subPropertyOf :ssn/hasProperty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relation from an OperatingRange of a System to a OperatingPropery describing the operating range of the System."}})

(def hasOperatingRange
  {:db/ident :ssn-system/hasOperatingRange,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relation from a System to an OperatingRange describing the normal operating environment of the System."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has operating range"},
   :rdfs/subPropertyOf :ssn/hasProperty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relation from a System to an OperatingRange describing the normal operating environment of the System."}})

(def hasSurvivalProperty
  {:db/ident :ssn-system/hasSurvivalProperty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relation from a SurvivalRange of a System to a SurvivalProperty describing the survival range of the System."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has survival property"},
   :rdfs/subPropertyOf :ssn/hasProperty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relation from a SurvivalRange of a System to a SurvivalProperty describing the survival range of the System."}})

(def hasSurvivalRange
  {:db/ident           :ssn-system/hasSurvivalRange,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "Relation from a System to a SurvivalRange."},
   :rdfs/isDefinedBy   {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has survival range"},
   :rdfs/subPropertyOf :ssn/hasProperty,
   :skos/definition    {:rdf/language "en",
                        :rdf/value
                        "Relation from a System to a SurvivalRange."}})

(def hasSystemCapability
  {:db/ident :ssn-system/hasSystemCapability,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relation from a System to a SystemCapability describing the capabilities of the System under certain Conditions."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has system capability"},
   :rdfs/subPropertyOf :ssn/hasProperty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relation from a System to a SystemCapability describing the capabilities of the System under certain Conditions."}})

(def hasSystemProperty
  {:db/ident :ssn-system/hasSystemProperty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relation from an SystemCapability of a System to a SystemProperty describing the capabilities of the System."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has system property"},
   :rdfs/subPropertyOf :ssn/hasProperty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relation from an SystemCapability of a System to a SystemProperty describing the capabilities of the System."}})

(def inCondition
  {:db/ident :ssn-system/inCondition,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes the prevailing environmental conditions for SystemCapabilites, OperatingRanges and SurvivalRanges."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/systems/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "in condition"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Describes the prevailing environmental conditions for SystemCapabilites, OperatingRanges and SurvivalRanges."},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Used for example to say that a sensor has a particular accuracy in particular conditions."}})

(def qualityOfObservation
  {:db/ident :ssn-system/qualityOfObservation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relation linking an Observation to the adjudged quality of the Result. This is complimentary to the SystemCapability information recorded for the Sensor that made the Observation."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ssn/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "quality of observation"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Relation linking an Observation to the adjudged quality of the Result. This is complimentary to the SystemCapability information recorded for the Sensor that made the Observation."}})

(def urn:uuid:ff14ab77-f1d2-51b2-b09c-16bb5a8d41be
  {:dcterms/created #inst "2017-05-14T00:00:00.000-00:00",
   :dcterms/creator
   {:foaf/name {:rdf/language "en",
                :rdf/value    "W3C/OGC Spatial Data on the Web Working Group"},
    :rdf/type  :foaf/Agent},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "This ontology describes system capabilities, operating ranges, and survival ranges."},
   :dcterms/license
   #{{:xsd/anyURI "http://www.opengeospatial.org/ogc/Software"}
     {:xsd/anyURI
      "http://www.w3.org/Consortium/Legal/2015/copyright-software-and-document"}},
   :dcterms/rights "Copyright 2017 W3C/OGC.",
   :dcterms/title
   {:rdf/language "en",
    :rdf/value
    "System capabilities, operating ranges, and survival ranges ontology"},
   :owl/imports {:xsd/anyURI "http://www.w3.org/ns/ssn/"},
   :rdf/type #{:owl/Ontology :voaf/Vocabulary},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Please report any errors to the W3C Spatial Data on the Web Working Group via the SDW WG Public List public-sdw-wg@w3.org"},
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.w3.org/2015/spatial/wiki/Semantic_Sensor_Network_Ontology"},
   :vann/preferredNamespacePrefix "ssn-system",
   :vann/preferredNamespaceUri "http://www.w3.org/ns/ssn/systems/",
   :xsd/anyURI "http://www.w3.org/ns/ssn/systems/"})