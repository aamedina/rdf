(ns net.wikipunk.rdf.cco
  "http://purl.org/ontology/cco/core#"
  {:dc11/creator
   ["http://tobyinkster.co.uk/#i"
    "Yan Wang"
    "http://foaf.me/zazi#me"
    "http://swordfish.rdfweb.org/people/libby/rdfweb/webwho.xrdf#me"
    "http://sw.deri.org/~sheila/foaf.rdf#me"
    "http://www.johnbreslin.com/foaf/foaf.rdf#me"
    "http://danbri.org/foaf.rdf#danbri"
    "Danica Damljanovic"
    "Yi Zeng"
    "Zhisheng Huang"],
   :dc11/date #inst "2010-09-26T11:16:52.000-00:00",
   :dc11/description
   {:rdf/language "en",
    :rdf/value
    "A vocabulary for describing cognitive pattern within contexts, their temporal dynamics and their origins"},
   :dc11/title {:rdf/language "en",
                :rdf/value    "Cognitive Characteristics Ontology"},
   :dcat/downloadURL
   "http://purl.org/ontology/cco/cognitivecharacteristics.owl",
   :owl/imports ["http://purl.org/NET/scovo"
                 "http://purl.org/ontology/wo/core"
                 "http://purl.org/dc/terms/"
                 "http://purl.org/dc/elements/1.1/"
                 "http://purl.org/vocab/vann/"
                 "http://www.w3.org/2006/time"
                 "http://purl.org/NET/c4dm/event.owl"
                 "http://www.w3.org/2003/06/sw-vocab-status/ns"
                 "http://xmlns.com/foaf/0.1/"
                 "http://purl.org/ontology/ao/core"],
   :owl/versionInfo 0.2M,
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
   :rdf/uri "http://purl.org/ontology/cco/core#",
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
   {:rdf/language "en",
    :rdf/value
    "An event concept for describing dynamics of characteristics, e.g. weight changes, periods of interest."},
   :rdfs/isDefinedBy "http://purl.org/ontology/cco/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Characteristic Dynamics"},
   :rdfs/subClassOf :wo/Weight,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "testing"}})

(def CognitiveCharacteristic
  "A cognitive characteristic object, which also can have weightings and characteristic dynamics etc. for describing a cognitive pattern."
  {:db/ident :cco/CognitiveCharacteristic,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A cognitive characteristic object, which also can have weightings and characteristic dynamics etc. for describing a cognitive pattern."},
   :rdfs/isDefinedBy "http://purl.org/ontology/cco/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cognitive Characteristic"},
   :rdfs/subClassOf :scovo/Item,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "unstable"}})

(def ExplicitMining
  {:db/ident         :cco/ExplicitMining,
   :dc11/description {:rdf/language "en",
                      :rdf/value    "An explicitly mined cognitive pattern"},
   :dc11/title       {:rdf/language "en",
                      :rdf/value    "Explicit Mining"},
   :rdf/type         :scovo/Dimension,
   :rdfs/isDefinedBy "http://purl.org/ontology/cco/core#",
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "testing"}})

(def ImplicitMining
  {:db/ident         :cco/ImplicitMining,
   :dc11/description {:rdf/language "en",
                      :rdf/value    "An implicitly mined cognitive pattern"},
   :dc11/title       {:rdf/language "en",
                      :rdf/value    "Implicit Mining"},
   :rdf/type         :scovo/Dimension,
   :rdfs/isDefinedBy "http://purl.org/ontology/cco/core#",
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "testing"}})

(def activity
  "An activity, which is related to a topic of a cognitive charateristic description, e.g. if the topic is football a related activity can be playing or watching."
  {:db/ident :cco/activity,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An activity, which is related to a topic of a cognitive charateristic description, e.g. if the topic is football a related activity can be playing or watching."},
   :rdfs/domain :cco/CognitiveCharacteristic,
   :rdfs/isDefinedBy "http://purl.org/ontology/cco/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has activity"},
   :rdfs/subPropertyOf [:ao/activity :event/factor],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "testing"}})

(def agent
  "A link from a mined cognitive characteristic to the related person"
  {:db/ident :cco/agent,
   :owl/inverseOf :cco/habit,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A link from a mined cognitive characteristic to the related person"},
   :rdfs/domain :cco/CognitiveCharacteristic,
   :rdfs/isDefinedBy "http://purl.org/ontology/cco/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has agent"},
   :rdfs/range :foaf/Agent,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "testing"}})

(def appear_time
  "The time when the cognitive pattern appears in a certain kind of scenario."
  {:db/ident :cco/appear_time,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The time when the cognitive pattern appears in a certain kind of scenario."},
   :rdfs/domain {:owl/unionOf [:cco/CognitiveCharacteristic
                               :cco/CharacteristicDynamics],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/ontology/cco/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has appear time"},
   :rdfs/subPropertyOf :event/time,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "testing"}})

(def attention_duration
  "An interval of attention for a cognitive pattern."
  {:db/ident           :cco/attention_duration,
   :rdf/type           [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "An interval of attention for a cognitive pattern."},
   :rdfs/domain        :cco/CognitiveCharacteristic,
   :rdfs/isDefinedBy   "http://purl.org/ontology/cco/core#",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has attention duration"},
   :rdfs/range         :time/Interval,
   :rdfs/subPropertyOf [:scovo/dimension :event/time],
   :vs/term_status     {:rdf/language "en",
                        :rdf/value    "testing"}})

(def belief
  "An uncertain relation for competence representation. That means beliefs, persuasions or opinions, which can also be misconceptions."
  {:db/ident :cco/belief,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An uncertain relation for competence representation. That means beliefs, persuasions or opinions, which can also be misconceptions."},
   :rdfs/isDefinedBy "http://purl.org/ontology/cco/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has belief"},
   :rdfs/subPropertyOf :cco/competence,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "testing"}})

(def characteristic
  "Relates to the applied cognitive characteristic (property), e.g. competence, belief, expertise, skill, interest or setting."
  {:db/ident :cco/characteristic,
   :rdf/type [:owl/FunctionalProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Relates to the applied cognitive characteristic (property), e.g. competence, belief, expertise, skill, interest or setting."},
   :rdfs/domain :cco/CognitiveCharacteristic,
   :rdfs/isDefinedBy "http://purl.org/ontology/cco/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has characteristic"},
   :rdfs/range :rdf/Property,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "testing"}})

(def characteristic_dynamics
  "To relate a cognitive characteristic to its temporal dynamics."
  {:db/ident :cco/characteristic_dynamics,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To relate a cognitive characteristic to its temporal dynamics."},
   :rdfs/domain :cco/CognitiveCharacteristic,
   :rdfs/isDefinedBy "http://purl.org/ontology/cco/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has characteristic dynamics"},
   :rdfs/range :cco/CharacteristicDynamics,
   :rdfs/subPropertyOf :event/sub_event,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "testing"}})

(def cognitive_characteristic
  "This is the super property to describe cognitive characteristics of the user of the cognitive pattern dimension, e.g. interests, skills, or expertise."
  {:db/ident :cco/cognitive_characteristic,
   :owl/propertyChainAxiom [:cco/habit :cco/topic],
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This is the super property to describe cognitive characteristics of the user of the cognitive pattern dimension, e.g. interests, skills, or expertise."},
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://purl.org/ontology/cco/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has cognitive characteristic"},
   :rdfs/range :owl/Thing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "testing"}})

(def competence
  "The competence to (be able to) do or know something. That means abilities, skills, knowledge, expertise, beliefs etc."
  {:db/ident :cco/competence,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The competence to (be able to) do or know something. That means abilities, skills, knowledge, expertise, beliefs etc."},
   :rdfs/isDefinedBy "http://purl.org/ontology/cco/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has competence"},
   :rdfs/subPropertyOf :cco/cognitive_characteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "testing"}})

(def evidence
  "A link between a context and evidence supporting the interpretation of habits in a context"
  {:db/ident :cco/evidence,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A link between a context and evidence supporting the interpretation of habits in a context"},
   :rdfs/domain {:owl/unionOf [:cco/CognitiveCharacteristic
                               :cco/CharacteristicDynamics],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://purl.org/ontology/cco/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has evidence"},
   :rdfs/subPropertyOf :event/factor,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "unstable"}})

(def expertise
  "The knowledge or expertise in a certain domain or specific topic, e.g. football, programming languages or music."
  {:db/ident :cco/expertise,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The knowledge or expertise in a certain domain or specific topic, e.g. football, programming languages or music."},
   :rdfs/isDefinedBy "http://purl.org/ontology/cco/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has expertise"},
   :rdfs/subPropertyOf :cco/competence,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "testing"}})

(def habit
  "A link between an agent and a cognitive characteristic description"
  {:db/ident :cco/habit,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A link between an agent and a cognitive characteristic description"},
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://purl.org/ontology/cco/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has habit"},
   :rdfs/range :cco/CognitiveCharacteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "unstable"}})

(def interest
  "This property relates a certain area of interest or preference to an agent. That means this agent likes this topic somehow."
  {:db/ident :cco/interest,
   :owl/equivalentProperty :foaf/topic_interest,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property relates a certain area of interest or preference to an agent. That means this agent likes this topic somehow."},
   :rdfs/isDefinedBy "http://purl.org/ontology/cco/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has interest"},
   :rdfs/subPropertyOf :cco/cognitive_characteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "testing"}})

(def longest_duration
  "The longest continuous interval of attention for a cognitive pattern, e.g. for an interest, if it appears in the following years: 1990, 1991, 1995, 1996, 1997, 1998, 2001, then the longest duration is 4 years."
  {:db/ident :cco/longest_duration,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The longest continuous interval of attention for a cognitive pattern, e.g. for an interest, if it appears in the following years: 1990, 1991, 1995, 1996, 1997, 1998, 2001, then the longest duration is 4 years."},
   :rdfs/isDefinedBy "http://purl.org/ontology/cco/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has longest duration"},
   :rdfs/subPropertyOf :cco/attention_duration,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "testing"}})

(def not_interested_in
  "A link between an agent and a topic of no interest to them"
  {:db/ident :cco/not_interested_in,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "A link between an agent and a topic of no interest to them"},
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://purl.org/ontology/cco/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is not interested in"},
   :rdfs/range :owl/Thing,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "unstable"}})

(def overall_weight
  "This weight reflects the overall interest in a topic and should be different from the actual weight of a cognitive characteristic."
  {:db/ident :cco/overall_weight,
   :rdf/type [:owl/ObjectProperty :owl/FunctionalProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This weight reflects the overall interest in a topic and should be different from the actual weight of a cognitive characteristic."},
   :rdfs/domain :cco/CognitiveCharacteristic,
   :rdfs/isDefinedBy "http://purl.org/ontology/cco/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has overall weight"},
   :rdfs/subPropertyOf [:scovo/dimension :wo/weight],
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "testing"}})

(def setting
  "A certain setting or preference. Often re. a specific environment, e.g. an application."
  {:db/ident :cco/setting,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A certain setting or preference. Often re. a specific environment, e.g. an application."},
   :rdfs/isDefinedBy "http://purl.org/ontology/cco/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has setting"},
   :rdfs/subPropertyOf :cco/cognitive_characteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "testing"}})

(def skill
  "The ability or skill to (be able to) do something, e.g. to walk, to play the piano or to work in a team."
  {:db/ident :cco/skill,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The ability or skill to (be able to) do something, e.g. to walk, to play the piano or to work in a team."},
   :rdfs/isDefinedBy "http://purl.org/ontology/cco/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has skill"},
   :rdfs/subPropertyOf :cco/competence,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "testing"}})

(def statistical_item
  "A link from a cognitive characteristic to statistics about itself"
  {:db/ident :cco/statistical_item,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A link from a cognitive characteristic to statistics about itself"},
   :rdfs/domain :cco/CognitiveCharacteristic,
   :rdfs/isDefinedBy "http://purl.org/ontology/cco/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has statistical item"},
   :rdfs/range :scovo/Item,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "testing"}})

(def topic
  "A topic of the cognitive characteristic."
  {:db/ident           :cco/topic,
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value "A topic of the cognitive characteristic."},
   :rdfs/domain        :cco/CognitiveCharacteristic,
   :rdfs/isDefinedBy   "http://purl.org/ontology/cco/core#",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has topic"},
   :rdfs/range         :owl/Thing,
   :rdfs/subPropertyOf :dcterms/subject,
   :vs/term_status     {:rdf/language "en",
                        :rdf/value    "unstable"}})

(def ultimative_duration
  "The overall duration of attention for a cognitive pattern, e.g. for an interest, if it appears in the following years: 1990, 1991, 1995, 1996, 1997, 1998, 2001, then the longest duration is 7 years."
  {:db/ident :cco/ultimative_duration,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The overall duration of attention for a cognitive pattern, e.g. for an interest, if it appears in the following years: 1990, 1991, 1995, 1996, 1997, 1998, 2001, then the longest duration is 7 years."},
   :rdfs/isDefinedBy "http://purl.org/ontology/cco/core#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has ultimative duration"},
   :rdfs/subPropertyOf :cco/attention_duration,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "testing"}})