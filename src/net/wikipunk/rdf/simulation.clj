(ns net.wikipunk.rdf.simulation
  "This ontology was designed to conceptualize symbolic meanings following Baudrillard's Simulacra and Simulation theory. Symbols, their meaning, the context in which the symbolic meaning (or simulation) exists and the source of the simulation are linked to a N-ary Simulation Class."
  {:cpannotationschema/isSpecializationOf
   ["http://www.ontologydesignpatterns.org/cp/owl/situation.owl"
    "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl"],
   :cpannotationschema/relatedCPs
   "http://www.ontologydesignpatterns.org/cp/owl/informationrealization.owl",
   :dc11/contributor ["Aldo Gangemi" "Marieke van Erp"],
   :dc11/creator "Bruno Sartini",
   :dc11/title {:rdf/language "en",
                :rdf/value    "Simulation Ontology"},
   :dcterms/created {:rdf/language "en",
                     :rdf/value    "September 13th, 2021"},
   :dcterms/issued {:rdf/language "en",
                    :rdf/value    "September 13th, 2021"},
   :dcterms/license "https://creativecommons.org/licenses/by/4.0/",
   :dcterms/publisher "Bruno Sartini",
   :owl/versionInfo
   {:rdf/language "en",
    :rdf/value
    "1.2 (hasSource property deprecated and replaced by prov:wasDerivedFrom)"},
   :rdf/ns-prefix-map
   {"cpannotationschema"
    "http://www.ontologydesignpatterns.org/schemas/cpannotationschema.owl#",
    "dcterms" "http://purl.org/dc/terms/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "prov" "https://www.w3.org/ns/prov-o-inverses#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "schema" "http://schema.org/",
    "simulation" "https://www.w3id.org/simulation/ontology/",
    "vann" "http://purl.org/vocab/vann/",
    "xhv" "https://www.w3.org/1999/xhtml/vocab#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://www.w3id.org/simulation/ontology/",
   :rdfa/prefix "simulation",
   :rdfa/uri "https://www.w3id.org/simulation/ontology/",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This ontology was designed to conceptualize symbolic meanings following Baudrillard's Simulacra and Simulation theory. Symbols, their meaning, the context in which the symbolic meaning (or simulation) exists and the source of the simulation are linked to a N-ary Simulation Class."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Simulation Ontology"},
   :schema/citation
   {:rdf/language "en",
    :rdf/value
    "Cite this Ontology as: Sartini, B. The Simulation ontology. https://www.w3id.org/simulation/ontology/ "},
   :vann/preferredNamespacePrefix {:rdf/language "en",
                                   :rdf/value    "sim"},
   :vann/preferredNamespaceUri "https://www.w3id.org/simulation/ontology/"})

(def AllusionSimulation
  "A specific kind of simulation in which the simulacrum alludes to the reality counterpart. Is a more subtle symbolic relationship than the normal simulation."
  {:db/ident :simulation/AllusionSimulation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A specific kind of simulation in which the simulacrum alludes to the reality counterpart. Is a more subtle symbolic relationship than the normal simulation."},
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Allusion Simulation"},
   :rdfs/subClassOf :simulation/Simulation})

(def AssociationSimulation
  "A simulation in which the simulacrum is associated with the reality counterpart. It is a very general relationship and should be used only when the association is explicitly stated by the source. I.E. in a dictionary of symbols it is written that X \"is associated with\" Y."
  {:db/ident :simulation/AssociationSimulation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A simulation in which the simulacrum is associated with the reality counterpart. It is a very general relationship and should be used only when the association is explicitly stated by the source. I.E. in a dictionary of symbols it is written that X \"is associated with\" Y."},
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Association Simulation"},
   :rdfs/subClassOf :simulation/Simulation})

(def AttributeSimulation
  "A specific kind of simulation in which the simulacrum is a symbolic attribute of the reality counterpart. Like \"keys\" as an attribute of Saint Peter."
  {:db/ident :simulation/AttributeSimulation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A specific kind of simulation in which the simulacrum is a symbolic attribute of the reality counterpart. Like \"keys\" as an attribute of Saint Peter."},
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Attribute Simulation"},
   :rdfs/subClassOf :simulation/Simulation})

(def Context
  "The context is the setting (either social, historical, cultural etc...) in which a Simulation exists. An ash tree, in the Norse context is a symbol of Odin. On the other hand, a tree in a Celtic context is a symbol of connection."
  {:db/ident :simulation/Context,
   :owl/disjointWith [:simulation/Source :simulation/Simulation],
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The context is the setting (either social, historical, cultural etc...) in which a Simulation exists. An ash tree, in the Norse context is a symbol of Odin. On the other hand, a tree in a Celtic context is a symbol of connection."},
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Context"},
   :rdfs/subClassOf [{:owl/onProperty     :simulation/isContextOf,
                      :owl/someValuesFrom :simulation/Simulation,
                      :rdf/type           :owl/Restriction}
                     :semiotics/Reference]})

(def CorrespondenceSimulation
  "A simulation in which the simulacrum corresponds to the reality counterpart. It is a very general relationship and should be used only when the correspondence is explicitly state by the source. I.E. in a dictionary of symbols it is written that X \"corresponds to\" Y."
  {:db/ident :simulation/CorrespondenceSimulation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A simulation in which the simulacrum corresponds to the reality counterpart. It is a very general relationship and should be used only when the correspondence is explicitly state by the source. I.E. in a dictionary of symbols it is written that X \"corresponds to\" Y."},
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Correspondence Simulation"},
   :rdfs/subClassOf :simulation/Simulation})

(def EmblematicSimulation
  "A specific kind of simulation in which the simulacrum is an emblem of the reality counterpart. Emblems are usually used as a graphical representation of something."
  {:db/ident :simulation/EmblematicSimulation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A specific kind of simulation in which the simulacrum is an emblem of the reality counterpart. Emblems are usually used as a graphical representation of something."},
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Emblematic Simulation"},
   :rdfs/subClassOf :simulation/Simulation})

(def HealingSimulation
  "A specific kind of simulation in which the simulacrum is a symbolic cure for the reality counterpart. The reality counterpart in this kind of simulation is in fact usually something negative like a disease or a curse."
  {:db/ident :simulation/HealingSimulation,
   :owl/hasKey [:simulation/hasSimulacrum :simulation/healedRealityCounterpart],
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A specific kind of simulation in which the simulacrum is a symbolic cure for the reality counterpart. The reality counterpart in this kind of simulation is in fact usually something negative like a disease or a curse."},
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Healing Simulation"},
   :rdfs/subClassOf [{:owl/onClass    :simulation/RealityCounterpart,
                      :owl/onProperty :simulation/healedRealityCounterpart,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :simulation/Simulation]})

(def ManifestationSimulation
  "A simulation in which the simulacrum is a manifestation of the reality counterpart. It is a very general relationship and should be used only when the manifestation is explicitly stated by the source. I.E. in a dictionary of symbols it is written than X \"is a manifestation of\" Y."
  {:db/ident :simulation/ManifestationSimulation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A simulation in which the simulacrum is a manifestation of the reality counterpart. It is a very general relationship and should be used only when the manifestation is explicitly stated by the source. I.E. in a dictionary of symbols it is written than X \"is a manifestation of\" Y."},
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Manifestation Simulation"},
   :rdfs/subClassOf :simulation/Simulation})

(def ProtectionSimulation
  "A specific kind of simulation in which the simulacrum is a symbolic protection against the reality counterpart. Like agate as a protection against the evil eye."
  {:db/ident :simulation/ProtectionSimulation,
   :owl/hasKey [:simulation/hasSimulacrum
                :simulation/preventedRealityCounterpart],
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A specific kind of simulation in which the simulacrum is a symbolic protection against the reality counterpart. Like agate as a protection against the evil eye."},
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Protection Simulation"},
   :rdfs/subClassOf [{:owl/onClass    :simulation/RealityCounterpart,
                      :owl/onProperty :simulation/preventedRealityCounterpart,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :simulation/Simulation]})

(def RealityCounterpart
  "A reality counterpart is the symbolic meaning associated to a simulacrum. It's the element that is symbolically referred by the simulacrum in a simulation. The term is taken from Baudrillard's Simulacra and Simulation theory"
  {:db/ident :simulation/RealityCounterpart,
   :owl/disjointWith :simulation/Simulation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A reality counterpart is the symbolic meaning associated to a simulacrum. It's the element that is symbolically referred by the simulacrum in a simulation. The term is taken from Baudrillard's Simulacra and Simulation theory"},
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Reality Counterpart"},
   :rdfs/subClassOf [{:owl/onProperty     :simulation/isRealityCounterpartOf,
                      :owl/someValuesFrom :simulation/Simulation,
                      :rdf/type           :owl/Restriction}
                     :prov/Entity
                     :semiotics/Reference]})

(def RelatednessSimulation
  "A simulation in which the simulacrum is related to the reality counterpart. It is a very general relationship and should be used only when the relatedness is explicitly stated by the source. I.E. in a dictionary of symbols it is written that X \"is related to\" Y."
  {:db/ident :simulation/RelatednessSimulation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A simulation in which the simulacrum is related to the reality counterpart. It is a very general relationship and should be used only when the relatedness is explicitly stated by the source. I.E. in a dictionary of symbols it is written that X \"is related to\" Y."},
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Relatedness Simulation"},
   :rdfs/subClassOf :simulation/Simulation})

(def Simulacrum
  "A simulacrum is something that carries a secondary meaning (the first being its literal meaning), of symbolic nature. i.e. a skull is the set of bones of a head (literal meaning), but it is also the symbol of death (secondary, symbolic meaning). The term is taken from Baudrillard's Simulacra and Simulation theory. The plural of simulacrum is simulacra."
  {:db/ident :simulation/Simulacrum,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A simulacrum is something that carries a secondary meaning (the first being its literal meaning), of symbolic nature. i.e. a skull is the set of bones of a head (literal meaning), but it is also the symbol of death (secondary, symbolic meaning). The term is taken from Baudrillard's Simulacra and Simulation theory. The plural of simulacrum is simulacra."},
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Simulacrum"},
   :rdfs/subClassOf [{:owl/onProperty     :simulation/isSimulacrumOf,
                      :owl/someValuesFrom :simulation/Simulation,
                      :rdf/type           :owl/Restriction}
                     :semiotics/Expression
                     :informationrealization/InformationObject]})

(def Simulation
  "A simulation is the symbolic relationship that happens between a symbol and its symbolic meaning. The term is taken from Baudrillard's Simulacra and Simulation philosophical theory."
  {:db/ident :simulation/Simulation,
   :owl/disjointWith :simulation/Source,
   :owl/hasKey [:simulation/hasRealityCounterpart :simulation/hasSimulacrum],
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A simulation is the symbolic relationship that happens between a symbol and its symbolic meaning. The term is taken from Baudrillard's Simulacra and Simulation philosophical theory."},
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Simulation"},
   :rdfs/subClassOf [{:owl/onProperty     :prov/wasDerivedFrom,
                      :owl/someValuesFrom :simulation/Source,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :simulation/hasRealityCounterpart,
                      :owl/someValuesFrom :simulation/RealityCounterpart,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :simulation/hasContext,
                      :owl/someValuesFrom :simulation/Context,
                      :rdf/type           :owl/Restriction}
                     {:owl/intersectionOf [:situation/Situation :prov/Entity],
                      :rdf/type :owl/Class}
                     {:owl/onClass    :simulation/Simulacrum,
                      :owl/onProperty :simulation/hasSimulacrum,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}]})

(def SimulationOntology
  {:db/ident :simulation/SimulationOntology,
   :rdf/type :owl/NamedIndividual})

(def Source
  "This class represents the source of a simulation. It is intended as the entity that acknowledges a simulation as a legitimate symbolic relationship. A source can either be a dictionary of symbols or a knowledge graph in which symbolic information are present."
  {:db/ident :simulation/Source,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This class represents the source of a simulation. It is intended as the entity that acknowledges a simulation as a legitimate symbolic relationship. A source can either be a dictionary of symbols or a knowledge graph in which symbolic information are present."},
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Source"},
   :rdfs/subClassOf [{:owl/onProperty     :prov/hadDerivation,
                      :owl/someValuesFrom :simulation/Simulation,
                      :rdf/type           :owl/Restriction}
                     :prov/Entity]})

(def easedRealityCounterpart
  "A specific relationship that links a simulation to a reality counterpart that is symbolically eased by the simulacrum. Like the Onyx, which in Indic-Persian context is believed to symbolically ease childbirth."
  {:db/ident :simulation/easedRealityCounterpart,
   :owl/inverseOf :simulation/isEasedRealityCounterpartOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A specific relationship that links a simulation to a reality counterpart that is symbolically eased by the simulacrum. Like the Onyx, which in Indic-Persian context is believed to symbolically ease childbirth."},
   :rdfs/domain :simulation/Simulation,
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Eased reality counterpart"},
   :rdfs/range :simulation/RealityCounterpart,
   :rdfs/subPropertyOf :simulation/hasRealityCounterpart})

(def elicitedRealityCounterpart
  "A specific relationship that links a simulation to a reality counterpart that is symbolically elicited by the simulacrum."
  {:db/ident :simulation/elicitedRealityCounterpart,
   :owl/inverseOf :simulation/isElicitedRealityCounterpartOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A specific relationship that links a simulation to a reality counterpart that is symbolically elicited by the simulacrum."},
   :rdfs/domain :simulation/Simulation,
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Elicited reality counterpart"},
   :rdfs/range :simulation/RealityCounterpart,
   :rdfs/subPropertyOf :simulation/hasRealityCounterpart})

(def hasContext
  "This property links a Simulation to its context"
  {:db/ident           :simulation/hasContext,
   :owl/inverseOf      :simulation/isContextOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "This property links a Simulation to its context"},
   :rdfs/domain        :simulation/Simulation,
   :rdfs/isDefinedBy   :simulation/SimulationOntology,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has Context"},
   :rdfs/range         :simulation/Context,
   :rdfs/subPropertyOf [:owl/topObjectProperty :situation/isSettingFor]})

(def hasPersonifiedVariant
  "This property is used when a variant is intended as the personified variant of the other entity. Like \"Air\" has personified variant \"Air personified\""
  {:db/ident :simulation/hasPersonifiedVariant,
   :owl/inverseOf :simulation/isPersonifiedVariantOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property is used when a variant is intended as the personified variant of the other entity. Like \"Air\" has personified variant \"Air personified\""},
   :rdfs/domain {:owl/unionOf [:simulation/RealityCounterpart
                               :simulation/Simulacrum],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Has personified variant"},
   :rdfs/range {:owl/unionOf [:simulation/RealityCounterpart
                              :simulation/Simulacrum],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :simulation/hasVariant})

(def hasRealityCounterpart
  "This property links a Simulation to its reality counterpart. More specific relationships between a simulation and its reality counterpart are available as subproperties of this property."
  {:db/ident :simulation/hasRealityCounterpart,
   :owl/inverseOf :simulation/isRealityCounterpartOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property links a Simulation to its reality counterpart. More specific relationships between a simulation and its reality counterpart are available as subproperties of this property."},
   :rdfs/domain :simulation/Simulation,
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Has reality counterpart"},
   :rdfs/range :simulation/RealityCounterpart,
   :rdfs/subPropertyOf [:owl/topObjectProperty :situation/isSettingFor]})

(def hasSimulacrum
  "This property links a simulation to its simulacrum."
  {:db/ident           :simulation/hasSimulacrum,
   :owl/inverseOf      :simulation/isSimulacrumOf,
   :rdf/type           [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "This property links a simulation to its simulacrum."},
   :rdfs/domain        :simulation/Simulation,
   :rdfs/isDefinedBy   :simulation/SimulationOntology,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Has simulacrum"},
   :rdfs/range         :simulation/Simulacrum,
   :rdfs/subPropertyOf [:owl/topObjectProperty :situation/isSettingFor]})

(def hasSource
  "This property links a Simulation with its source"
  {:db/ident         :simulation/hasSource,
   :owl/deprecated   "deprecated on the 1.2 version",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "This property links a Simulation with its source"},
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Has source"}})

(def hasVariant
  "This property links a simulacrum or a reality counterpart to a variant of theirs. A variant is intended as a narrower concept than one of those two elements. It is also used to define a set of elements in relation to a single element that is part of that set. I.e. \"man and woman\" is a variant of \"woman\", \"golden apple\" is a variant of \"apple\"."
  {:db/ident :simulation/hasVariant,
   :owl/inverseOf :simulation/isVariantOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property links a simulacrum or a reality counterpart to a variant of theirs. A variant is intended as a narrower concept than one of those two elements. It is also used to define a set of elements in relation to a single element that is part of that set. I.e. \"man and woman\" is a variant of \"woman\", \"golden apple\" is a variant of \"apple\"."},
   :rdfs/domain {:owl/unionOf [:simulation/RealityCounterpart
                               :simulation/Simulacrum],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has variant"},
   :rdfs/range {:owl/unionOf [:simulation/RealityCounterpart
                              :simulation/Simulacrum],
                :rdf/type    :owl/Class}})

(def healedRealityCounterpart
  "A specific relationship that links a simulation (usually a Healing Simulation) to a reality counterpart of which a simulacrum is the symbolic cure."
  {:db/ident :simulation/healedRealityCounterpart,
   :owl/inverseOf :simulation/isHealedRealityCounterpartOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A specific relationship that links a simulation (usually a Healing Simulation) to a reality counterpart of which a simulacrum is the symbolic cure."},
   :rdfs/domain :simulation/HealingSimulation,
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Healed reality counterpart"},
   :rdfs/range :simulation/RealityCounterpart,
   :rdfs/subPropertyOf :simulation/hasRealityCounterpart})

(def isContextOf
  "inverse property of has context"
  {:db/ident           :simulation/isContextOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "inverse property of has context"},
   :rdfs/domain        :simulation/Context,
   :rdfs/isDefinedBy   :simulation/SimulationOntology,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Is context of"},
   :rdfs/range         :simulation/Simulation,
   :rdfs/subPropertyOf [:owl/topObjectProperty :situation/hasSetting]})

(def isEasedRealityCounterpartOf
  "Inverse property of eased reality counterpart"
  {:db/ident           :simulation/isEasedRealityCounterpartOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "Inverse property of eased reality counterpart"},
   :rdfs/domain        :simulation/RealityCounterpart,
   :rdfs/isDefinedBy   :simulation/SimulationOntology,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Is eased reality counterpart of"},
   :rdfs/range         :simulation/Simulation,
   :rdfs/subPropertyOf :simulation/isRealityCounterpartOf})

(def isElicitedRealityCounterpartOf
  "Inverse property of elicited reality counterpart"
  {:db/ident           :simulation/isElicitedRealityCounterpartOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "Inverse property of elicited reality counterpart"},
   :rdfs/domain        :simulation/RealityCounterpart,
   :rdfs/isDefinedBy   :simulation/SimulationOntology,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Is elicited reality counterpart of"},
   :rdfs/range         :simulation/Simulation,
   :rdfs/subPropertyOf :simulation/isRealityCounterpartOf})

(def isHealedRealityCounterpartOf
  "Inverse property of healed reality counterpart"
  {:db/ident           :simulation/isHealedRealityCounterpartOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "Inverse property of healed reality counterpart"},
   :rdfs/domain        :simulation/RealityCounterpart,
   :rdfs/isDefinedBy   :simulation/SimulationOntology,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Is healed reality counterpart of"},
   :rdfs/range         :simulation/HealingSimulation,
   :rdfs/subPropertyOf :simulation/isRealityCounterpartOf})

(def isPersonifiedVariantOf
  "Inverse property of has personified variant"
  {:db/ident           :simulation/isPersonifiedVariantOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "Inverse property of has personified variant"},
   :rdfs/domain        {:owl/unionOf [:simulation/RealityCounterpart
                                      :simulation/Simulacrum],
                        :rdf/type    :owl/Class},
   :rdfs/isDefinedBy   :simulation/SimulationOntology,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Is personified variant of"},
   :rdfs/range         {:owl/unionOf [:simulation/RealityCounterpart
                                      :simulation/Simulacrum],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :simulation/isVariantOf})

(def isPreventedRealityCounterpartOf
  "Inversed property of prevented reality counterpart"
  {:db/ident           :simulation/isPreventedRealityCounterpartOf,
   :owl/inverseOf      :simulation/preventedRealityCounterpart,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "Inversed property of prevented reality counterpart"},
   :rdfs/domain        :simulation/RealityCounterpart,
   :rdfs/isDefinedBy   :simulation/SimulationOntology,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Is prevented reality counterpart of"},
   :rdfs/range         :simulation/ProtectionSimulation,
   :rdfs/subPropertyOf :simulation/isRealityCounterpartOf})

(def isRealityCounterpartOf
  "Inversed property of has reality counterpart"
  {:db/ident           :simulation/isRealityCounterpartOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "Inversed property of has reality counterpart"},
   :rdfs/domain        :simulation/RealityCounterpart,
   :rdfs/isDefinedBy   :simulation/SimulationOntology,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Is reality counterpart of"},
   :rdfs/range         :simulation/Simulation,
   :rdfs/subPropertyOf [:owl/topObjectProperty :situation/hasSetting]})

(def isRestoredRealityCounterpartOf
  "Inverse property of restored reality counterpart"
  {:db/ident           :simulation/isRestoredRealityCounterpartOf,
   :owl/inverseOf      :simulation/restoredRealityCounterpart,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "Inverse property of restored reality counterpart"},
   :rdfs/domain        :simulation/RealityCounterpart,
   :rdfs/isDefinedBy   :simulation/SimulationOntology,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Is restored reality counterpart of"},
   :rdfs/range         :simulation/Simulation,
   :rdfs/subPropertyOf :simulation/isRealityCounterpartOf})

(def isSimulacrumOf
  "Inversed property of has simulacrum"
  {:db/ident           :simulation/isSimulacrumOf,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "Inversed property of has simulacrum"},
   :rdfs/domain        :simulation/Simulacrum,
   :rdfs/isDefinedBy   :simulation/SimulationOntology,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Is simulacrum of"},
   :rdfs/range         :simulation/Simulation,
   :rdfs/subPropertyOf [:owl/topObjectProperty :situation/hasSetting]})

(def isSourceOf
  "Inverse property of has source"
  {:db/ident         :simulation/isSourceOf,
   :owl/deprecated   "deprecated on the 1.2 version",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Inverse property of has source"},
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Is source of"}})

(def isSymbolicMeaningOf
  "Inverse property of symbolic meaning"
  {:db/ident           :simulation/isSymbolicMeaningOf,
   :owl/inverseOf      :simulation/symbolicMeaning,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "Inverse property of symbolic meaning"},
   :rdfs/domain        :simulation/RealityCounterpart,
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Is symbolic meaning of"},
   :rdfs/range         :simulation/Simulacrum,
   :rdfs/subPropertyOf [:owl/topObjectProperty :semiotics/isDenotedBy]})

(def isVariantOf
  "Inverse property of has variant"
  {:db/ident         :simulation/isVariantOf,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Inverse property of has variant"},
   :rdfs/domain      {:owl/unionOf [:simulation/RealityCounterpart
                                    :simulation/Simulacrum],
                      :rdf/type    :owl/Class},
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Is variant of"},
   :rdfs/range       {:owl/unionOf [:simulation/RealityCounterpart
                                    :simulation/Simulacrum],
                      :rdf/type    :owl/Class}})

(def preventedRealityCounterpart
  "A specific relationship that links a simulation (usually a Protection Simulation) to a reality counterpart that is symbolically prevented by the simulacrum."
  {:db/ident :simulation/preventedRealityCounterpart,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A specific relationship that links a simulation (usually a Protection Simulation) to a reality counterpart that is symbolically prevented by the simulacrum."},
   :rdfs/domain :simulation/ProtectionSimulation,
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Prevented reality counterpart"},
   :rdfs/range :simulation/RealityCounterpart,
   :rdfs/subPropertyOf :simulation/hasRealityCounterpart})

(def restoredRealityCounterpart
  "A specific relationship that links a simulation to a reality counterpart that is symbolically restored by the simulacrum. Like the red valerian (simulacrum), which, in flower language, is symbolically believed to restore strenght (restored reality counterpart)."
  {:db/ident :simulation/restoredRealityCounterpart,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A specific relationship that links a simulation to a reality counterpart that is symbolically restored by the simulacrum. Like the red valerian (simulacrum), which, in flower language, is symbolically believed to restore strenght (restored reality counterpart)."},
   :rdfs/domain :simulation/Simulation,
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Restored reality counterpart"},
   :rdfs/range :simulation/RealityCounterpart,
   :rdfs/subPropertyOf :simulation/hasRealityCounterpart})

(def symbolicMeaning
  "This property is a chain property that links a simulacrum with its reality counterpart. This direct relationship does not consider neither the context or the source of the simulation"
  {:db/ident :simulation/symbolicMeaning,
   :owl/propertyChainAxiom [:simulation/isSimulacrumOf
                            :simulation/hasRealityCounterpart],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property is a chain property that links a simulacrum with its reality counterpart. This direct relationship does not consider neither the context or the source of the simulation"},
   :rdfs/domain :simulation/Simulacrum,
   :rdfs/isDefinedBy :simulation/SimulationOntology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Symbolic Meaning"},
   :rdfs/range :simulation/RealityCounterpart,
   :rdfs/subPropertyOf [:owl/topObjectProperty :semiotics/denotes]})

(def ^{:private true} isSpecializationOf
  {:db/ident :cpannotationschema/isSpecializationOf,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} relatedCPs
  {:db/ident :cpannotationschema/relatedCPs,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} InformationObject
  {:db/ident :informationrealization/InformationObject,
   :rdf/type :owl/Class})

(def ^{:private true} Entity
  "Entity"
  {:db/ident   :prov/Entity,
   :rdf/type   :owl/Class,
   :rdfs/label "Entity"})

(def ^{:private true} hadDerivation
  "Inverse of wasDerivedFrom"
  {:db/ident     :prov/hadDerivation,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Inverse of wasDerivedFrom",
   :rdfs/domain  :prov/Entity,
   :rdfs/label   "had derivation",
   :rdfs/range   :prov/Entity})

(def ^{:private true} wasDerivedFrom
  "A derivation is a transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a pre-existing entity. In the context of the Simulation ontology this property links a Simulation to its source"
  {:db/ident :prov/wasDerivedFrom,
   :owl/inverseOf :prov/hadDerivation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A derivation is a transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a pre-existing entity. In the context of the Simulation ontology this property links a Simulation to its source"},
   :rdfs/domain :prov/Entity,
   :rdfs/label "was derived from",
   :rdfs/range :prov/Entity})

(def ^{:private true} citation
  {:db/ident :schema/citation,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} Expression
  {:db/ident :semiotics/Expression,
   :rdf/type :owl/Class})

(def ^{:private true} Reference
  {:db/ident :semiotics/Reference,
   :rdf/type :owl/Class})

(def ^{:private true} denotes
  {:db/ident :semiotics/denotes,
   :rdf/type :owl/ObjectProperty})

(def ^{:private true} isDenotedBy
  {:db/ident :semiotics/isDenotedBy,
   :rdf/type :owl/ObjectProperty})

(def ^{:private true} Situation
  {:db/ident :situation/Situation,
   :rdf/type :owl/Class})

(def ^{:private true} hasSetting
  {:db/ident :situation/hasSetting,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf :owl/topObjectProperty})

(def ^{:private true} isSettingFor
  {:db/ident :situation/isSettingFor,
   :rdf/type :owl/ObjectProperty})

(def ^{:private true} preferredNamespacePrefix
  {:db/ident :vann/preferredNamespacePrefix,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} preferredNamespaceUri
  {:db/ident :vann/preferredNamespaceUri,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} dct:rights
  {:db/ident :xhv/dct:rights,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} license
  {:db/ident :xhv/license,
   :rdf/type :owl/AnnotationProperty})