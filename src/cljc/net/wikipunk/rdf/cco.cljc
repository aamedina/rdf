(ns net.wikipunk.rdf.cco
  "A vocabulary for describing cognitive pattern within contexts, their temporal dynamics and their origins"
  {:dc11/creator
   [{:rdfa/uri "http://tobyinkster.co.uk/#i"}
    "Yan Wang"
    {:rdfa/uri "http://foaf.me/zazi#me"}
    {:rdfa/uri "http://swordfish.rdfweb.org/people/libby/rdfweb/webwho.xrdf#me"}
    {:rdfa/uri "http://sw.deri.org/~sheila/foaf.rdf#me"}
    {:rdfa/uri "http://www.johnbreslin.com/foaf/foaf.rdf#me"}
    {:rdfa/uri "http://danbri.org/foaf.rdf#danbri"}
    "Danica Damljanovic"
    "Yi Zeng"
    "Zhisheng Huang"],
   :dc11/date #xsd/dateTime #inst "2010-09-26T11:16:52.000+00:00",
   :dc11/description
   #rdf/langString
    "A vocabulary for describing cognitive pattern within contexts, their temporal dynamics and their origins@en",
   :dc11/title #rdf/langString "Cognitive Characteristics Ontology@en",
   :dcat/downloadURL
   "http://purl.org/ontology/cco/cognitivecharacteristics.owl",
   :owl/imports [{:rdfa/uri "http://purl.org/NET/scovo"}
                 {:rdfa/uri "http://purl.org/ontology/wo/core"}
                 {:rdfa/uri "http://purl.org/dc/terms/"}
                 {:rdfa/uri "http://purl.org/dc/elements/1.1/"}
                 {:rdfa/uri "http://purl.org/vocab/vann/"}
                 {:rdfa/uri "http://www.w3.org/2006/time"}
                 {:rdfa/uri "http://purl.org/NET/c4dm/event.owl"}
                 {:rdfa/uri "http://www.w3.org/2003/06/sw-vocab-status/ns"}
                 {:rdfa/uri "http://xmlns.com/foaf/0.1/"}
                 {:rdfa/uri "http://purl.org/ontology/ao/core"}],
   :owl/versionInfo #xsd/decimal 0.2M,
   :rdf/ns-prefix-map {"ao"    "http://purl.org/ontology/ao/core#",
                       "cco"   "http://purl.org/ontology/cco/core#",
                       "dc11"  "http://purl.org/dc/elements/1.1/",
                       "event" "http://purl.org/NET/c4dm/event.owl#",
                       "foaf"  "http://xmlns.com/foaf/0.1/",
                       "owl"   "http://www.w3.org/2002/07/owl#",
                       "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                       "scovo" "http://purl.org/NET/scovo#",
                       "time"  "http://www.w3.org/2006/time#",
                       "vann"  "http://purl.org/vocab/vann/",
                       "vs"    "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "wo"    "http://purl.org/ontology/wo/core#",
                       "xsd"   "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "cco",
   :rdfa/uri "http://purl.org/ontology/cco/core#",
   :vann/preferredNamespacePrefix "cco",
   :vann/preferredNamespaceUri "http://purl.org/ontology/cco/core#"}
  (:refer-clojure :exclude [agent]))

(def CharacteristicDynamics
  "An event concept for describing dynamics of characteristics, e.g. weight changes, periods of interest."
  {:db/ident :cco/CharacteristicDynamics,
   :rdf/type [:rdfs/Class :owl/Class],
   :rdfs/comment
   #rdf/langString
    "An event concept for describing dynamics of characteristics, e.g. weight changes, periods of interest.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/cco/core#"},
   :rdfs/label #rdf/langString "Characteristic Dynamics@en",
   :rdfs/subClassOf [:rdfs/Resource :wo/Weight],
   :vs/term_status #rdf/langString "testing@en"})

(def CognitiveCharacteristic
  "A cognitive characteristic object, which also can have weightings and characteristic dynamics etc. for describing a cognitive pattern."
  {:db/ident :cco/CognitiveCharacteristic,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #rdf/langString
    "A cognitive characteristic object, which also can have weightings and characteristic dynamics etc. for describing a cognitive pattern.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/cco/core#"},
   :rdfs/label #rdf/langString "Cognitive Characteristic@en",
   :rdfs/subClassOf [:rdfs/Resource :scovo/Item],
   :vs/term_status #rdf/langString "unstable@en"})

(def ExplicitMining
  "An explicitly mined cognitive pattern"
  {:db/ident         :cco/ExplicitMining,
   :dc11/description #rdf/langString "An explicitly mined cognitive pattern@en",
   :dc11/title       #rdf/langString "Explicit Mining@en",
   :rdf/type         :scovo/Dimension,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/cco/core#"},
   :vs/term_status   #rdf/langString "testing@en"})

(def ImplicitMining
  "An implicitly mined cognitive pattern"
  {:db/ident         :cco/ImplicitMining,
   :dc11/description #rdf/langString "An implicitly mined cognitive pattern@en",
   :dc11/title       #rdf/langString "Implicit Mining@en",
   :rdf/type         :scovo/Dimension,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/cco/core#"},
   :vs/term_status   #rdf/langString "testing@en"})

(def activity
  "An activity, which is related to a topic of a cognitive charateristic description, e.g. if the topic is football a related activity can be playing or watching."
  {:db/ident :cco/activity,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #rdf/langString
    "An activity, which is related to a topic of a cognitive charateristic description, e.g. if the topic is football a related activity can be playing or watching.@en",
   :rdfs/domain :cco/CognitiveCharacteristic,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/cco/core#"},
   :rdfs/label #rdf/langString "has activity@en",
   :rdfs/subPropertyOf [:ao/activity :event/factor],
   :vs/term_status #rdf/langString "testing@en"})

(def agent
  "A link from a mined cognitive characteristic to the related person"
  {:db/ident :cco/agent,
   :owl/inverseOf :cco/habit,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #rdf/langString
    "A link from a mined cognitive characteristic to the related person@en",
   :rdfs/domain :cco/CognitiveCharacteristic,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/cco/core#"},
   :rdfs/label #rdf/langString "has agent@en",
   :rdfs/range :foaf/Agent,
   :vs/term_status #rdf/langString "testing@en"})

(def appear_time
  "The time when the cognitive pattern appears in a certain kind of scenario."
  {:db/ident :cco/appear_time,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #rdf/langString
    "The time when the cognitive pattern appears in a certain kind of scenario.@en",
   :rdfs/domain {:owl/unionOf [:cco/CognitiveCharacteristic
                               :cco/CharacteristicDynamics],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/cco/core#"},
   :rdfs/label #rdf/langString "has appear time@en",
   :rdfs/subPropertyOf :event/time,
   :vs/term_status #rdf/langString "testing@en"})

(def attention_duration
  "An interval of attention for a cognitive pattern."
  {:db/ident           :cco/attention_duration,
   :rdf/type           [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment       #rdf/langString
                        "An interval of attention for a cognitive pattern.@en",
   :rdfs/domain        :cco/CognitiveCharacteristic,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/cco/core#"},
   :rdfs/label         #rdf/langString "has attention duration@en",
   :rdfs/range         :time/Interval,
   :rdfs/subPropertyOf [:scovo/dimension :event/time],
   :vs/term_status     #rdf/langString "testing@en"})

(def belief
  "An uncertain relation for competence representation. That means beliefs, persuasions or opinions, which can also be misconceptions."
  {:db/ident :cco/belief,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #rdf/langString
    "An uncertain relation for competence representation. That means beliefs, persuasions or opinions, which can also be misconceptions.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/cco/core#"},
   :rdfs/label #rdf/langString "has belief@en",
   :rdfs/subPropertyOf [:cco/competence :cco/cognitive_characteristic],
   :vs/term_status #rdf/langString "testing@en"})

(def characteristic
  "Relates to the applied cognitive characteristic (property), e.g. competence, belief, expertise, skill, interest or setting."
  {:db/ident :cco/characteristic,
   :rdf/type [:owl/FunctionalProperty :rdf/Property],
   :rdfs/comment
   #rdf/langString
    "Relates to the applied cognitive characteristic (property), e.g. competence, belief, expertise, skill, interest or setting.@en",
   :rdfs/domain :cco/CognitiveCharacteristic,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/cco/core#"},
   :rdfs/label #rdf/langString "has characteristic@en",
   :rdfs/range :rdf/Property,
   :vs/term_status #rdf/langString "testing@en"})

(def characteristic_dynamics
  "To relate a cognitive characteristic to its temporal dynamics."
  {:db/ident :cco/characteristic_dynamics,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #rdf/langString
    "To relate a cognitive characteristic to its temporal dynamics.@en",
   :rdfs/domain :cco/CognitiveCharacteristic,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/cco/core#"},
   :rdfs/label #rdf/langString "has characteristic dynamics@en",
   :rdfs/range :cco/CharacteristicDynamics,
   :rdfs/subPropertyOf :event/sub_event,
   :vs/term_status #rdf/langString "testing@en"})

(def cognitive_characteristic
  "This is the super property to describe cognitive characteristics of the user of the cognitive pattern dimension, e.g. interests, skills, or expertise."
  {:db/ident :cco/cognitive_characteristic,
   :owl/propertyChainAxiom [:cco/habit :cco/topic],
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #rdf/langString
    "This is the super property to describe cognitive characteristics of the user of the cognitive pattern dimension, e.g. interests, skills, or expertise.@en",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/cco/core#"},
   :rdfs/label #rdf/langString "has cognitive characteristic@en",
   :rdfs/range :owl/Thing,
   :vs/term_status #rdf/langString "testing@en"})

(def competence
  "The competence to (be able to) do or know something. That means abilities, skills, knowledge, expertise, beliefs etc."
  {:db/ident :cco/competence,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #rdf/langString
    "The competence to (be able to) do or know something. That means abilities, skills, knowledge, expertise, beliefs etc.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/cco/core#"},
   :rdfs/label #rdf/langString "has competence@en",
   :rdfs/subPropertyOf :cco/cognitive_characteristic,
   :vs/term_status #rdf/langString "testing@en"})

(def evidence
  "A link between a context and evidence supporting the interpretation of habits in a context"
  {:db/ident :cco/evidence,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #rdf/langString
    "A link between a context and evidence supporting the interpretation of habits in a context@en",
   :rdfs/domain {:owl/unionOf [:cco/CognitiveCharacteristic
                               :cco/CharacteristicDynamics],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/cco/core#"},
   :rdfs/label #rdf/langString "has evidence@en",
   :rdfs/subPropertyOf :event/factor,
   :vs/term_status #rdf/langString "unstable@en"})

(def expertise
  "The knowledge or expertise in a certain domain or specific topic, e.g. football, programming languages or music."
  {:db/ident :cco/expertise,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #rdf/langString
    "The knowledge or expertise in a certain domain or specific topic, e.g. football, programming languages or music.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/cco/core#"},
   :rdfs/label #rdf/langString "has expertise@en",
   :rdfs/subPropertyOf [:cco/competence :cco/cognitive_characteristic],
   :vs/term_status #rdf/langString "testing@en"})

(def habit
  "A link between an agent and a cognitive characteristic description"
  {:db/ident :cco/habit,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #rdf/langString
    "A link between an agent and a cognitive characteristic description@en",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/cco/core#"},
   :rdfs/label #rdf/langString "has habit@en",
   :rdfs/range :cco/CognitiveCharacteristic,
   :vs/term_status #rdf/langString "unstable@en"})

(def interest
  "This property relates a certain area of interest or preference to an agent. That means this agent likes this topic somehow."
  {:db/ident :cco/interest,
   :owl/equivalentProperty :foaf/topic_interest,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #rdf/langString
    "This property relates a certain area of interest or preference to an agent. That means this agent likes this topic somehow.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/cco/core#"},
   :rdfs/label #rdf/langString "has interest@en",
   :rdfs/subPropertyOf :cco/cognitive_characteristic,
   :vs/term_status #rdf/langString "testing@en"})

(def longest_duration
  "The longest continuous interval of attention for a cognitive pattern, e.g. for an interest, if it appears in the following years: 1990, 1991, 1995, 1996, 1997, 1998, 2001, then the longest duration is 4 years."
  {:db/ident :cco/longest_duration,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #rdf/langString
    "The longest continuous interval of attention for a cognitive pattern, e.g. for an interest, if it appears in the following years: 1990, 1991, 1995, 1996, 1997, 1998, 2001, then the longest duration is 4 years.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/cco/core#"},
   :rdfs/label #rdf/langString "has longest duration@en",
   :rdfs/subPropertyOf [:cco/attention_duration :scovo/dimension :event/time],
   :vs/term_status #rdf/langString "testing@en"})

(def not_interested_in
  "A link between an agent and a topic of no interest to them"
  {:db/ident :cco/not_interested_in,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #rdf/langString
    "A link between an agent and a topic of no interest to them@en",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/cco/core#"},
   :rdfs/label #rdf/langString "is not interested in@en",
   :rdfs/range :owl/Thing,
   :vs/term_status #rdf/langString "unstable@en"})

(def overall_weight
  "This weight reflects the overall interest in a topic and should be different from the actual weight of a cognitive characteristic."
  {:db/ident :cco/overall_weight,
   :rdf/type [:owl/ObjectProperty :owl/FunctionalProperty :rdf/Property],
   :rdfs/comment
   #rdf/langString
    "This weight reflects the overall interest in a topic and should be different from the actual weight of a cognitive characteristic.@en",
   :rdfs/domain :cco/CognitiveCharacteristic,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/cco/core#"},
   :rdfs/label #rdf/langString "has overall weight@en",
   :rdfs/subPropertyOf [:scovo/dimension :wo/weight],
   :vs/term_status #rdf/langString "testing@en"})

(def setting
  "A certain setting or preference. Often re. a specific environment, e.g. an application."
  {:db/ident :cco/setting,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #rdf/langString
    "A certain setting or preference. Often re. a specific environment, e.g. an application.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/cco/core#"},
   :rdfs/label #rdf/langString "has setting@en",
   :rdfs/subPropertyOf :cco/cognitive_characteristic,
   :vs/term_status #rdf/langString "testing@en"})

(def skill
  "The ability or skill to (be able to) do something, e.g. to walk, to play the piano or to work in a team."
  {:db/ident :cco/skill,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #rdf/langString
    "The ability or skill to (be able to) do something, e.g. to walk, to play the piano or to work in a team.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/cco/core#"},
   :rdfs/label #rdf/langString "has skill@en",
   :rdfs/subPropertyOf [:cco/competence :cco/cognitive_characteristic],
   :vs/term_status #rdf/langString "testing@en"})

(def statistical_item
  "A link from a cognitive characteristic to statistics about itself"
  {:db/ident :cco/statistical_item,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #rdf/langString
    "A link from a cognitive characteristic to statistics about itself@en",
   :rdfs/domain :cco/CognitiveCharacteristic,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/cco/core#"},
   :rdfs/label #rdf/langString "has statistical item@en",
   :rdfs/range :scovo/Item,
   :vs/term_status #rdf/langString "testing@en"})

(def topic
  "A topic of the cognitive characteristic."
  {:db/ident           :cco/topic,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       #rdf/langString
                        "A topic of the cognitive characteristic.@en",
   :rdfs/domain        :cco/CognitiveCharacteristic,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/cco/core#"},
   :rdfs/label         #rdf/langString "has topic@en",
   :rdfs/range         :owl/Thing,
   :rdfs/subPropertyOf :dcterms/subject,
   :vs/term_status     #rdf/langString "unstable@en"})

(def ultimative_duration
  "The overall duration of attention for a cognitive pattern, e.g. for an interest, if it appears in the following years: 1990, 1991, 1995, 1996, 1997, 1998, 2001, then the longest duration is 7 years."
  {:db/ident :cco/ultimative_duration,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #rdf/langString
    "The overall duration of attention for a cognitive pattern, e.g. for an interest, if it appears in the following years: 1990, 1991, 1995, 1996, 1997, 1998, 2001, then the longest duration is 7 years.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/cco/core#"},
   :rdfs/label #rdf/langString "has ultimative duration@en",
   :rdfs/subPropertyOf [:cco/attention_duration :scovo/dimension :event/time],
   :vs/term_status #rdf/langString "testing@en"})
