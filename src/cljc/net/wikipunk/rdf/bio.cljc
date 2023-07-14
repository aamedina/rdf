(ns net.wikipunk.rdf.bio
  {:dcat/downloadURL  "resources/bio.rdf",
   :rdf/ns-prefix-map {"bio" "http://purl.org/vocab/bio/0.1/",
                       "cc" "http://web.resource.org/cc/",
                       "dc11" "http://purl.org/dc/terms/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "label" "http://purl.org/net/vocab/2004/03/label#",
                       "ov" "http://open.vocab.org/terms/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "vann" "http://purl.org/vocab/vann/",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "bio",
   :rdfa/uri          "http://purl.org/vocab/bio/0.1/"}
  (:refer-clojure :exclude [agent]))

(def Accession
  "The event of a person succeeding to the right to hold regal power. This event is often automatic on the death of the previous monarch and is usually followed by a coronation event."
  {:db/ident :bio/Accession,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The event of a person succeeding to the right to hold regal power. This event is often automatic on the death of the previous monarch and is usually followed by a coronation event.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Accession@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def Adoption
  "The event of creating of a legal parent/child relationship that does not exist biologically."
  {:db/ident :bio/Adoption,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The event of creating of a legal parent/child relationship that does not exist biologically.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Adoption@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def Annulment
  "The event of declaring a marriage void from the beginning as though it never existed."
  {:db/ident :bio/Annulment,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The event of declaring a marriage void from the beginning as though it never existed.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Annulment@en",
   :rdfs/subClassOf [:bio/GroupEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:owl/minCardinality #xsd/nonNegativeInteger 2,
                      :owl/onProperty     :bio/partner,
                      :rdf/type           :owl/Restriction}
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}],
   :vs/term_status #xsd/string "unstable"})

(def Assassination
  "The event of a person being deliberately targeted and killed."
  {:db/ident :bio/Assassination,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The event of a person being deliberately targeted and killed.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Assassination@en",
   :rdfs/subClassOf [:bio/Murder
                     :bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     :bio/Death
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def Baptism
  "The ceremonial event held to admit a person to membership of a Christian church."
  {:db/ident :bio/Baptism,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The ceremonial event held to admit a person to membership of a Christian church.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Baptism@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def BarMitzvah
  "The ceremonial event held when a Jewish boy reaches age 13."
  {:db/ident :bio/BarMitzvah,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The ceremonial event held when a Jewish boy reaches age 13.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "BarMitzvah@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def BasMitzvah
  "The ceremonial event held when a Jewish girl reaching age 13, also known as \"Bat Mitzvah.\""
  {:db/ident :bio/BasMitzvah,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The ceremonial event held when a Jewish girl reaching age 13, also known as \"Bat Mitzvah.\"@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "BasMitzvah@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def Birth
  "The event of a person entering into life."
  {:db/ident         :bio/Birth,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString
                      "The event of a person entering into life.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label       #xsd/langString "Birth@en",
   :rdfs/subClassOf  [:bio/IndividualEvent
                      :event/Event
                      :bio/Event
                      :dcmitype/Event
                      {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                      {:rdfa/uri
                       "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                      {:owl/cardinality #xsd/nonNegativeInteger 1,
                       :owl/onProperty  :bio/principal,
                       :rdf/type        :owl/Restriction}],
   :vs/term_status   #xsd/string "testing"})

(def Burial
  "The event of interring the remains of a person's body into the ground."
  {:db/ident :bio/Burial,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The event of interring the remains of a person's body into the ground.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Burial@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def Coronation
  "The ceremonial event of a person being invested with regal power to become a monarch."
  {:db/ident :bio/Coronation,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The ceremonial event of a person being invested with regal power to become a monarch.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Coronation@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def Cremation
  "The event of disposing of the remains of a person's body by fire."
  {:db/ident :bio/Cremation,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The event of disposing of the remains of a person's body by fire.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Cremation@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def Death
  "The event of a person's life ending."
  {:db/ident         :bio/Death,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString "The event of a person's life ending.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label       #xsd/langString "Death@en",
   :rdfs/subClassOf  [:bio/IndividualEvent
                      :event/Event
                      :bio/Event
                      :dcmitype/Event
                      {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                      {:rdfa/uri
                       "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                      {:owl/cardinality #xsd/nonNegativeInteger 1,
                       :owl/onProperty  :bio/principal,
                       :rdf/type        :owl/Restriction}],
   :vs/term_status   #xsd/string "stable"})

(def Demotion
  "The event of a person changing the position they hold with an employer to one with less importance or responsibility."
  {:db/ident :bio/Demotion,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The event of a person changing the position they hold with an employer to one with less importance or responsibility.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Demotion@en",
   :rdfs/subClassOf [:bio/PositionChange
                     :bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def Disbanding
  "The event of a group or organization being disbanded."
  {:db/ident :bio/Disbanding,
   :rdf/type :owl/Class,
   :rdfs/comment #xsd/langString
                  "The event of a group or organization being disbanded.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Disbanding@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def Dismissal
  "The event of a person involuntarily giving up their office or position. Dismissal is often perceived to be the employee's fault and may be considered disgraceful."
  {:db/ident :bio/Dismissal,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The event of a person involuntarily giving up their office or position. Dismissal is often perceived to be the employee's fault and may be considered disgraceful.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Dismissal@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def Divorce
  "The event of legally dissolving a marriage."
  {:db/ident         :bio/Divorce,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString
                      "The event of legally dissolving a marriage.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label       #xsd/langString "Divorce@en",
   :rdfs/subClassOf  [:bio/GroupEvent
                      :event/Event
                      :bio/Event
                      :dcmitype/Event
                      {:owl/minCardinality #xsd/nonNegativeInteger 2,
                       :owl/onProperty     :bio/partner,
                       :rdf/type           :owl/Restriction}
                      {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                      {:rdfa/uri
                       "http://sw.opencyc.org/2009/04/07/concept/en/Event"}],
   :vs/term_status   #xsd/string "unstable"})

(def Emigration
  "The event of a person leaving their homeland with the intent of residing elsewhere."
  {:db/ident :bio/Emigration,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The event of a person leaving their homeland with the intent of residing elsewhere.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Emigration@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def Employment
  "The event of a person entering an occupational relationship with an employer."
  {:db/ident :bio/Employment,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The event of a person entering an occupational relationship with an employer.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Employment@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def Enrolment
  "The event of a person initiating attendence to a school or other place of learning."
  {:db/ident :bio/Enrolment,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The event of a person initiating attendence to a school or other place of learning.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Enrolment@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def Event
  "An event is an occurrence that brings about a change in the state of affairs for one or more people and/or other agents. Events are assumed to occur over a period of time and may not have precise start and end points."
  {:db/ident :bio/Event,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "An event is an occurrence that brings about a change in the state of affairs for one or more people and/or other agents. Events are assumed to occur over a period of time and may not have precise start and end points.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Event@en",
   :rdfs/subClassOf [:event/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     :dcmitype/Event
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}],
   :vann/usageNote
   #xsd/langString
    "This class is intended to describe biographical events, i.e. events in the life of a person.@en",
   :vs/term_status #xsd/string "testing"})

(def Execution
  "The event of a person being deliberately killed as punishment."
  {:db/ident :bio/Execution,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The event of a person being deliberately killed as punishment.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Execution@en",
   :rdfs/subClassOf [:bio/Death
                     :bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def Formation
  "The event of a group or organization coming into being."
  {:db/ident :bio/Formation,
   :rdf/type :owl/Class,
   :rdfs/comment #xsd/langString
                  "The event of a group or organization coming into being.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Formation@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def Funeral
  "The event of marking a person's death with a ceremony."
  {:db/ident :bio/Funeral,
   :rdf/type :owl/Class,
   :rdfs/comment #xsd/langString
                  "The event of marking a person's death with a ceremony.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Funeral@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def Graduation
  "The event of a person being awarded educational diplomas or degrees."
  {:db/ident :bio/Graduation,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The event of a person being awarded educational diplomas or degrees.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Graduation@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def GroupEvent
  "A type of event that is principally about one or more agents and their partnership. Other agents may be involved but the event is most significant for the partner agent."
  {:db/ident :bio/GroupEvent,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A type of event that is principally about one or more agents and their partnership. Other agents may be involved but the event is most significant for the partner agent.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Group Event@en",
   :rdfs/subClassOf [{:owl/minCardinality #xsd/nonNegativeInteger 2,
                      :owl/onProperty     :bio/partner,
                      :rdf/type           :owl/Restriction}
                     :bio/Event
                     :event/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}],
   :vs/term_status #xsd/string "unstable"})

(def Imprisonment
  "The event of a person being detained in a jail or prison."
  {:db/ident :bio/Imprisonment,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The event of a person being detained in a jail or prison.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Imprisonment@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def Inauguration
  "The ceremonial event marking the beginning of a person's term of office as a leader."
  {:db/ident :bio/Inauguration,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The ceremonial event marking the beginning of a person's term of office as a leader.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Inauguration@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def IndividualEvent
  "A type of event that is principally about a single person, group or organization. Other agents may be involved but the event is most significant for the principal agent."
  {:db/ident :bio/IndividualEvent,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A type of event that is principally about a single person, group or organization. Other agents may be involved but the event is most significant for the principal agent.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Individual Event@en",
   :rdfs/subClassOf [{:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :bio/Event
                     :event/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}],
   :vs/term_status #xsd/string "unstable"})

(def Interval
  "A extended interval of time related to a particular state of affairs, such as the lifespan of a person or a period of employment."
  {:db/ident :bio/Interval,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A extended interval of time related to a particular state of affairs, such as the lifespan of a person or a period of employment.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Interval@en",
   :rdfs/subClassOf :time/ProperInterval,
   :vs/term_status #xsd/string "unstable"})

(def Investiture
  "The ceremonial event of a person taking a public office or honour."
  {:db/ident :bio/Investiture,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The ceremonial event of a person taking a public office or honour.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Investiture@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def Marriage
  "The event of creating uniting the participants into a new family unit, sometimes accompanied by a formal wedding ceremony. This is intended to cover a broad range of marriages including those given formal legal standing, common-law, or by convention. It is not restricted to marriages of two people of the opposite gender, but also includes polygamous and same-sex unions."
  {:db/ident :bio/Marriage,
   :owl/equivalentClass
   {:rdfa/uri
    "http://sw.opencyc.org/2009/04/07/concept/en/WeddingEvent_Generic"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The event of creating uniting the participants into a new family unit, sometimes accompanied by a formal wedding ceremony. This is intended to cover a broad range of marriages including those given formal legal standing, common-law, or by convention. It is not restricted to marriages of two people of the opposite gender, but also includes polygamous and same-sex unions.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Marriage@en",
   :rdfs/subClassOf [:bio/GroupEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:owl/minCardinality #xsd/nonNegativeInteger 2,
                      :owl/onProperty     :bio/partner,
                      :rdf/type           :owl/Restriction}
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}],
   :vs/term_status #xsd/string "stable"})

(def Murder
  "The event of a person being killed unlawfully with intent by the killer."
  {:db/ident :bio/Murder,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The event of a person being killed unlawfully with intent by the killer.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Murder@en",
   :rdfs/subClassOf [:bio/Death
                     :bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def NameChange
  "The event of a person changing their name."
  {:db/ident         :bio/NameChange,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/langString
                      "The event of a person changing their name.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label       #xsd/langString "Change of Name@en",
   :rdfs/subClassOf  [:bio/IndividualEvent
                      :event/Event
                      :bio/Event
                      :dcmitype/Event
                      {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                      {:rdfa/uri
                       "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                      {:owl/cardinality #xsd/nonNegativeInteger 1,
                       :owl/onProperty  :bio/principal,
                       :rdf/type        :owl/Restriction}],
   :vs/term_status   #xsd/string "unstable"})

(def Naturalization
  "The event of a person obtaining citizenship. Note that the place the naturalization event occurs at may be different from the state the person is obtaining citizenship of. "
  {:db/ident :bio/Naturalization,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The event of a person obtaining citizenship. Note that the place the naturalization event occurs at may be different from the state the person is obtaining citizenship of. @en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Naturalization@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def Ordination
  "The ceremonial event held when a person receives authority to act in religious matters."
  {:db/ident :bio/Ordination,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The ceremonial event held when a person receives authority to act in religious matters.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Ordination@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def Performance
  "The event of an individual or a group of performers performing. Examples include concerts, plays, recitals, recordings, busking etc."
  {:db/ident :bio/Performance,
   :owl/equivalentClass :mo/Performance,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The event of an individual or a group of performers performing. Examples include concerts, plays, recitals, recordings, busking etc.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Performance@en",
   :rdfs/subClassOf [:bio/GroupEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:owl/minCardinality #xsd/nonNegativeInteger 2,
                      :owl/onProperty     :bio/partner,
                      :rdf/type           :owl/Restriction}
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}],
   :vs/term_status #xsd/string "unstable"})

(def PositionChange
  "The event of a person changing the position they hold with an employer."
  {:db/ident :bio/PositionChange,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The event of a person changing the position they hold with an employer.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Change of Position@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def Promotion
  "The event of a person changing the position they hold with an employer to one with more importance or responsibility."
  {:db/ident :bio/Promotion,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The event of a person changing the position they hold with an employer to one with more importance or responsibility.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Promotion@en",
   :rdfs/subClassOf [:bio/PositionChange
                     :bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def Redundancy
  "The event of a person involuntarily giving up an office or position that is no longer needed. Redundancy is usually perceived to be the employer's fault and is usually due to conditions outside of the employee's control."
  {:db/ident :bio/Redundancy,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The event of a person involuntarily giving up an office or position that is no longer needed. Redundancy is usually perceived to be the employer's fault and is usually due to conditions outside of the employee's control.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Redundancy@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def Relationship
  "A particular type of connection existing between people, groups or organizations related to or having dealings with each other."
  {:db/ident :bio/Relationship,
   :owl/equivalentClass :rel/Relationship,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A particular type of connection existing between people, groups or organizations related to or having dealings with each other.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Agent Relationship@en",
   :vs/term_status #xsd/string "unstable"})

(def Resignation
  "The event of a person voluntarily giving up or quitting their office or position."
  {:db/ident :bio/Resignation,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The event of a person voluntarily giving up or quitting their office or position.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Resignation@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def Retirement
  "The event of a person exiting an occupational relationship with an employer after a qualifying time period. In many cultures retirement is expected and even required once the person reaches a particular age."
  {:db/ident :bio/Retirement,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "The event of a person exiting an occupational relationship with an employer after a qualifying time period. In many cultures retirement is expected and even required once the person reaches a particular age.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Retirement@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :event/Event
                     :bio/Event
                     :dcmitype/Event
                     {:rdfa/uri "http://linkedevents.org/ontology/Event"}
                     {:rdfa/uri
                      "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
                     {:owl/cardinality #xsd/nonNegativeInteger 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status #xsd/string "unstable"})

(def agent
  "A person, organization or group that plays a role in an event."
  {:db/ident :bio/agent,
   :label/plural #xsd/langString "Agents@en",
   :owl/inverseOf :bio/event,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #xsd/langString
    "A person, organization or group that plays a role in an event.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Agent@en",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf :owl/differentFrom})

(def biography
  "An extended description or account of someone's life."
  {:db/ident :bio/biography,
   :rdf/type :rdf/Property,
   :rdfs/comment #xsd/langString
                  "An extended description or account of someone's life.@en",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Biography@en",
   :vann/usageNote
   #rdf/XMLLiteral
    "<p>It is expected that the value of this property is either a literal formatted with HTML markup or a pointer to an HTML document.</p>",
   :vs/term_status #xsd/string "unstable"})

(def birth
  "An birth event associated with a person, group or organization."
  {:db/ident :bio/birth,
   :label/plural #xsd/langString "Birth Events@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "An birth event associated with a person, group or organization.@en",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Birth Event@en",
   :rdfs/range :bio/Birth,
   :rdfs/subPropertyOf [:bio/event :owl/differentFrom]})

(def child
  "A biological child of a person. "
  {:db/ident :bio/child,
   :label/plural #xsd/langString "Children@en",
   :owl/equivalentProperty :rel/parentOf,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment #xsd/langString "A biological child of a person. @en",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Child@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :owl/differentFrom,
   :vann/usageNote
   #rdf/XMLLiteral
    "Note that this is a strict definition of child that does not include adopted children, step-children or similar non-biological relationships. The <a href=\"http://purl.org/vocab/relationship\">Relationship</a> vocabulary may be more suitable for broader types of parent/child relation.",
   :vs/term_status #xsd/string "unstable"})

(def concludingEvent
  "An event that marks the end of an interval and/or relationship. The event changes of the state of affairs that held during the interval. For example a period of study may be concluded by a Graduation event."
  {:db/ident :bio/concludingEvent,
   :label/plural #xsd/langString "Concluding Event@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "An event that marks the end of an interval and/or relationship. The event changes of the state of affairs that held during the interval. For example a period of study may be concluded by a Graduation event.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Concluding Event@en",
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf :owl/differentFrom})

(def concurrentEvent
  "An event that occurs while this event is occurring. The events need not start or conclude at the same times."
  {:db/ident :bio/concurrentEvent,
   :label/plural #xsd/langString "Concurrent Events@en",
   :rdf/type [:owl/SymmetricProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "An event that occurs while this event is occurring. The events need not start or conclude at the same times.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Concurrent Event@en",
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf :owl/differentFrom})

(def date
  "The date at which an event occurred."
  {:db/ident :bio/date,
   :label/plural #xsd/langString "Dates@en",
   :rdf/type :rdf/Property,
   :rdfs/comment #xsd/langString "The date at which an event occurred.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Date@en",
   :rdfs/subPropertyOf :dc11/date,
   :vann/usageNote
   #rdf/XMLLiteral
    "<p>The date should be formatted as specified in <a href=\"http://www.w3.org/TR/NOTE-datetime\">ISO8601</a>.\n    For example: 2003-03-15 corresponds to the 15th March 2003, and 2003-03-15T13:21-05:00 corresponds to 15th March 2003, 8:21 am, US Eastern Standard Time.</p>",
   :vs/term_status #xsd/string "stable"})

(def death
  "An death event associated with a person, group or organization."
  {:db/ident :bio/death,
   :label/plural #xsd/langString "Death Events@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "An death event associated with a person, group or organization.@en",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Death Event@en",
   :rdfs/range :bio/Death,
   :rdfs/subPropertyOf [:owl/differentFrom :bio/event]})

(def employer
  "An agent that is involved in an event as an employer."
  {:db/ident :bio/employer,
   :label/plural #xsd/langString "Employers@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment #xsd/langString
                  "An agent that is involved in an event as an employer.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Employer@en",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf [:bio/agent :owl/differentFrom]})

(def event
  "An event associated with a person, group or organization."
  {:db/ident :bio/event,
   :label/plural #xsd/langString "Life Events@en",
   :owl/inverseOf :bio/agent,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "An event associated with a person, group or organization.@en",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Life Event@en",
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf :owl/differentFrom})

(def eventInterval
  "The interval during which the event occurs. This interval represents the exact interval of occurence for an event, it starts at the moment the event commences and finishes when the event concludes. In other words both the event and the interval start at the same instant of time and extend for the same duration."
  {:db/ident :bio/eventInterval,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "The interval during which the event occurs. This interval represents the exact interval of occurence for an event, it starts at the moment the event commences and finishes when the event concludes. In other words both the event and the interval start at the same instant of time and extend for the same duration.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Event Interval@en",
   :rdfs/range :bio/Interval,
   :vs/term_status #xsd/string "unstable"})

(def father
  "The biological father of a person, also known as the genitor."
  {:db/ident :bio/father,
   :rdf/type [:owl/ObjectProperty :rdf/Property :owl/FunctionalProperty],
   :rdfs/comment
   #xsd/langString
    "The biological father of a person, also known as the genitor.@en",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Father@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:rel/childOf :owl/differentFrom],
   :vann/usageNote
   #rdf/XMLLiteral
    "Note that this is a strict definition of father that does not include non-biological relationships. The <a href=\"http://purl.org/vocab/relationship\">Relationship</a> vocabulary may be more suitable for broader types of parent/child relation.",
   :vs/term_status #xsd/string "unstable"})

(def followingEvent
  "An event that starts at some time after this event."
  {:db/ident :bio/followingEvent,
   :label/plural #xsd/langString "Following Events@en",
   :rdf/type [:owl/ObjectProperty :owl/TransitiveProperty :rdf/Property],
   :rdfs/comment #xsd/langString
                  "An event that starts at some time after this event.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Following Event@en",
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf :owl/differentFrom})

(def immediatelyFollowingEvent
  "An event that starts immediately after this event."
  {:db/ident           :bio/immediatelyFollowingEvent,
   :label/plural       #xsd/langString "Immediately Following Events@en",
   :rdf/type           [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment       #xsd/langString
                        "An event that starts immediately after this event.@en",
   :rdfs/domain        :bio/Event,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label         #xsd/langString "Immediately Following Event@en",
   :rdfs/range         :bio/Event,
   :rdfs/subPropertyOf [:owl/differentFrom :bio/followingEvent]})

(def immediatelyPrecedingEvent
  "An event that occurs and concludes immediately before this event."
  {:db/ident :bio/immediatelyPrecedingEvent,
   :label/plural #xsd/langString "Immediately Preceding Events@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #xsd/langString
    "An event that occurs and concludes immediately before this event.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Immediately Preceding Event@en",
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf [:owl/differentFrom :bio/precedingEvent]})

(def initiatingEvent
  "An event that marks the start of an interval and/or relationship. The event contributes to and/or causes of the state of affairs that hold during the interval. For example a period of study may be initiated by an Enrolment event."
  {:db/ident :bio/initiatingEvent,
   :label/plural #xsd/langString "Initiating Event@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "An event that marks the start of an interval and/or relationship. The event contributes to and/or causes of the state of affairs that hold during the interval. For example a period of study may be initiated by an Enrolment event.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Initiating Event@en",
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf :owl/differentFrom})

(def interval
  "The interval during which the relationship persists."
  {:db/ident         :bio/interval,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     #xsd/langString
                      "The interval during which the relationship persists.@en",
   :rdfs/domain      :bio/Relationship,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label       #xsd/langString "Relationship Interval@en",
   :rdfs/range       :bio/Interval,
   :vs/term_status   #xsd/string "unstable"})

(def keywords
  "A comma delimited list of key words that describe a person."
  {:db/ident :bio/keywords,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "A comma delimited list of key words that describe a person.@en",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Key Words@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :dc11/subject,
   :vs/term_status #xsd/string "stable"})

(def mother
  "The biological mother of a person, also known as the genetrix."
  {:db/ident :bio/mother,
   :rdf/type [:owl/ObjectProperty :rdf/Property :owl/FunctionalProperty],
   :rdfs/comment
   #xsd/langString
    "The biological mother of a person, also known as the genetrix.@en",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Mother@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :rel/childOf],
   :vann/usageNote
   #rdf/XMLLiteral
    "Note that this is a strict definition of mother that does not include non-biological relationships. The <a href=\"http://purl.org/vocab/relationship\">Relationship</a> vocabulary may be more suitable for broader types of parent/child relation.",
   :vs/term_status #xsd/string "unstable"})

(def officiator
  "A person that officiates at a ceremonial event."
  {:db/ident           :bio/officiator,
   :label/plural       #xsd/langString "Officiators@en",
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       #xsd/langString
                        "A person that officiates at a ceremonial event.@en",
   :rdfs/domain        :bio/Event,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label         #xsd/langString "Officiator@en",
   :rdfs/range         :foaf/Person,
   :rdfs/subPropertyOf [:bio/agent :owl/differentFrom]})

(def olb
  "A one-line biography of the person."
  {:db/ident         :bio/olb,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment     #xsd/langString "A one-line biography of the person.@en",
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label       #xsd/langString "One-line bio@en",
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   #xsd/string "stable"})

(def organization
  "An organization that plays a role in an event."
  {:db/ident           :bio/organization,
   :label/plural       #xsd/langString "Organizations@en",
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       #xsd/langString
                        "An organization that plays a role in an event.@en",
   :rdfs/domain        :bio/Event,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label         #xsd/langString "Organization@en",
   :rdfs/range         :foaf/Person,
   :rdfs/subPropertyOf [:bio/agent :owl/differentFrom]})

(def parent
  "A person that takes the parent role in an event."
  {:db/ident           :bio/parent,
   :label/plural       #xsd/langString "Parents@en",
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       #xsd/langString
                        "A person that takes the parent role in an event.@en",
   :rdfs/domain        :bio/Event,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label         #xsd/langString "Parent@en",
   :rdfs/range         :foaf/Person,
   :rdfs/subPropertyOf [:bio/agent :owl/differentFrom]})

(def participant
  "A person, group or organization that participates in a relationship for some time."
  {:db/ident :bio/participant,
   :label/plural #xsd/langString "Participants@en",
   :owl/equivalentProperty :rel/participant,
   :owl/inverseOf :bio/relationship,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #xsd/langString
    "A person, group or organization that participates in a relationship for some time.@en",
   :rdfs/domain :bio/Relationship,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Participant@en",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf :owl/differentFrom})

(def partner
  "A person that is involved in a event as a partner in a relationship."
  {:db/ident :bio/partner,
   :label/plural #xsd/langString "Partners@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "A person that is involved in a event as a partner in a relationship.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Partner@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:bio/agent :owl/differentFrom]})

(def place
  "The place at which an event occurred."
  {:db/ident         :bio/place,
   :label/plural     #xsd/langString "Places@en",
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString "The place at which an event occurred.@en",
   :rdfs/domain      :bio/Event,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label       #xsd/langString "Place@en",
   :vs/term_status   #xsd/string "stable"})

(def position
  "The employment position or public office involved in an event."
  {:db/ident :bio/position,
   :label/plural #xsd/langString "Positions@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "The employment position or public office involved in an event.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Position@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:bio/agent :owl/differentFrom],
   :vs/term_status #xsd/string "unstable"})

(def precedingEvent
  "An event that occurs and concludes at some time before this event."
  {:db/ident :bio/precedingEvent,
   :label/plural #xsd/langString "Preceding Events@en",
   :rdf/type [:owl/TransitiveProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "An event that occurs and concludes at some time before this event.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Preceding Event@en",
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf :owl/differentFrom})

(def principal
  "A person that takes the primary and most important role in an event. For example the principal in a Birth event would be the child being born and the principal in a Burial event would be the deceased person."
  {:db/ident :bio/principal,
   :label/plural #xsd/langString "Principals@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "A person that takes the primary and most important role in an event. For example the principal in a Birth event would be the child being born and the principal in a Burial event would be the deceased person.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Principal@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:bio/agent :owl/differentFrom]})

(def relationship
  "A relationship that a person, group or organization participates in for some time."
  {:db/ident :bio/relationship,
   :label/plural #xsd/langString "Relationships@en",
   :owl/equivalentProperty :rel/participantIn,
   :owl/inverseOf :bio/participant,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "A relationship that a person, group or organization participates in for some time.@en",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Relationship@en",
   :rdfs/range :bio/Relationship,
   :rdfs/subPropertyOf :owl/differentFrom})

(def spectator
  "A person that is present at and observes the occurrence of at least part of an event."
  {:db/ident :bio/spectator,
   :label/plural #xsd/langString "Spectators@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "A person that is present at and observes the occurrence of at least part of an event.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Spectator@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:bio/agent :owl/differentFrom]})

(def state
  "A country or independent territory that is involved in an event."
  {:db/ident :bio/state,
   :label/plural #xsd/langString "States@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "A country or independent territory that is involved in an event.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "State@en",
   :rdfs/subPropertyOf [:bio/agent :owl/differentFrom]})

(def termgroup1
  "Properties of a person"
  {:db/ident   :bio/termgroup1,
   :rdf/_1     :bio/olb,
   :rdf/_2     :bio/biography,
   :rdf/_3     :bio/keywords,
   :rdf/_4     :bio/father,
   :rdf/_5     :bio/mother,
   :rdf/_6     :bio/child,
   :rdf/_7     :bio/event,
   :rdf/_8     :bio/birth,
   :rdf/_9     :bio/death,
   :rdf/type   :rdf/Bag,
   :rdfs/label #xsd/langString "Properties of a person@en"})

(def termgroup2
  "Types of event"
  {:db/ident   :bio/termgroup2,
   :rdf/_1     :bio/Event,
   :rdf/_10    :bio/BasMitzvah,
   :rdf/_11    :bio/Birth,
   :rdf/_12    :bio/Burial,
   :rdf/_13    :bio/PositionChange,
   :rdf/_14    :bio/Coronation,
   :rdf/_15    :bio/Cremation,
   :rdf/_16    :bio/Death,
   :rdf/_17    :bio/Demotion,
   :rdf/_18    :bio/Dismissal,
   :rdf/_19    :bio/Divorce,
   :rdf/_2     :bio/IndividualEvent,
   :rdf/_20    :bio/Emigration,
   :rdf/_21    :bio/Employment,
   :rdf/_22    :bio/Execution,
   :rdf/_23    :bio/Enrolment,
   :rdf/_24    :bio/Funeral,
   :rdf/_25    :bio/Graduation,
   :rdf/_26    :bio/Imprisonment,
   :rdf/_27    :bio/Inauguration,
   :rdf/_28    :bio/Investiture,
   :rdf/_29    :bio/Marriage,
   :rdf/_3     :bio/GroupEvent,
   :rdf/_30    :bio/Murder,
   :rdf/_31    :bio/NameChange,
   :rdf/_32    :bio/Naturalization,
   :rdf/_33    :bio/Ordination,
   :rdf/_34    :bio/Promotion,
   :rdf/_35    :bio/Redundancy,
   :rdf/_36    :bio/Resignation,
   :rdf/_37    :bio/Retirement,
   :rdf/_4     :bio/Accession,
   :rdf/_5     :bio/Adoption,
   :rdf/_6     :bio/Annulment,
   :rdf/_7     :bio/Assassination,
   :rdf/_8     :bio/Baptism,
   :rdf/_9     :bio/BarMitzvah,
   :rdf/type   :rdf/Bag,
   :rdfs/label #xsd/langString "Types of event@en"})

(def termgroup3
  "Properties of an event"
  {:db/ident   :bio/termgroup3,
   :rdf/_1     :bio/date,
   :rdf/_2     :bio/place,
   :rdf/_3     :bio/state,
   :rdf/_4     :bio/position,
   :rdf/type   :rdf/Bag,
   :rdfs/label #xsd/langString "Properties of an event@en"})

(def termgroup4
  "Properties that relate an event to an agent"
  {:db/ident   :bio/termgroup4,
   :rdf/_1     :bio/agent,
   :rdf/_2     :bio/parent,
   :rdf/_3     :bio/employer,
   :rdf/_4     :bio/officiator,
   :rdf/_5     :bio/organization,
   :rdf/_6     :bio/principal,
   :rdf/_7     :bio/partner,
   :rdf/_8     :bio/witness,
   :rdf/_9     :bio/spectator,
   :rdf/type   :rdf/Bag,
   :rdfs/label #xsd/langString
                "Properties that relate an event to an agent@en"})

(def termgroup5
  "Properties that relate an event to another event"
  {:db/ident   :bio/termgroup5,
   :rdf/_1     :bio/concurrentEvent,
   :rdf/_2     :bio/followingEvent,
   :rdf/_3     :bio/precedingEvent,
   :rdf/_4     :bio/immediatelyFollowingEvent,
   :rdf/_5     :bio/immediatelyPrecedingEvent,
   :rdf/type   :rdf/Bag,
   :rdfs/label #xsd/langString
                "Properties that relate an event to another event@en"})

(def witness
  "A person that witnesses and can bear testimony to the occurrence of an event."
  {:db/ident :bio/witness,
   :label/plural #xsd/langString "Witnesses@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #xsd/langString
    "A person that witnesses and can bear testimony to the occurrence of an event.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label #xsd/langString "Witness@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:bio/spectator :owl/differentFrom :bio/agent]})