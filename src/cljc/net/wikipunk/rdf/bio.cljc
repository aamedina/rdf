(ns net.wikipunk.rdf.bio
  {:dcat/downloadURL  "net/wikipunk/ext/bio.rdf",
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
  {:db/ident :bio/Accession,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person succeeding to the right to hold regal power. This event is often automatic on the death of the previous monarch and is usually followed by a coronation event."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Accession"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Adoption
  {:db/ident :bio/Adoption,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of creating of a legal parent/child relationship that does not exist biologically."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Adoption"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Annulment
  {:db/ident :bio/Annulment,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of declaring a marriage void from the beginning as though it never existed."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Annulment"},
   :rdfs/subClassOf :bio/GroupEvent,
   :vs/term_status "unstable"})

(def Assassination
  {:db/ident :bio/Assassination,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The event of a person being deliberately targeted and killed."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Assassination"},
   :rdfs/subClassOf :bio/Murder,
   :vs/term_status "unstable"})

(def Baptism
  {:db/ident :bio/Baptism,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The ceremonial event held to admit a person to membership of a Christian church."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Baptism"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def BarMitzvah
  {:db/ident :bio/BarMitzvah,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The ceremonial event held when a Jewish boy reaches age 13."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "BarMitzvah"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def BasMitzvah
  {:db/ident :bio/BasMitzvah,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The ceremonial event held when a Jewish girl reaching age 13, also known as \"Bat Mitzvah.\""},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "BasMitzvah"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Birth
  {:db/ident         :bio/Birth,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "The event of a person entering into life."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Birth"},
   :rdfs/subClassOf  :bio/IndividualEvent,
   :vs/term_status   "testing"})

(def Burial
  {:db/ident :bio/Burial,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of interring the remains of a person's body into the ground."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Burial"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Coronation
  {:db/ident :bio/Coronation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The ceremonial event of a person being invested with regal power to become a monarch."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Coronation"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Cremation
  {:db/ident :bio/Cremation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of disposing of the remains of a person's body by fire."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cremation"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Death
  {:db/ident         :bio/Death,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The event of a person's life ending."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Death"},
   :rdfs/subClassOf  :bio/IndividualEvent,
   :vs/term_status   "stable"})

(def Demotion
  {:db/ident :bio/Demotion,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person changing the position they hold with an employer to one with less importance or responsibility."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Demotion"},
   :rdfs/subClassOf :bio/PositionChange,
   :vs/term_status "unstable"})

(def Disbanding
  {:db/ident         :bio/Disbanding,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The event of a group or organization being disbanded."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Disbanding"},
   :rdfs/subClassOf  :bio/IndividualEvent,
   :vs/term_status   "unstable"})

(def Dismissal
  {:db/ident :bio/Dismissal,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person involuntarily giving up their office or position. Dismissal is often perceived to be the employee's fault and may be considered disgraceful."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Dismissal"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Divorce
  {:db/ident         :bio/Divorce,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "The event of legally dissolving a marriage."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Divorce"},
   :rdfs/subClassOf  :bio/GroupEvent,
   :vs/term_status   "unstable"})

(def Emigration
  {:db/ident :bio/Emigration,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person leaving their homeland with the intent of residing elsewhere."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Emigration"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Employment
  {:db/ident :bio/Employment,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person entering an occupational relationship with an employer."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Employment"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Enrolment
  {:db/ident :bio/Enrolment,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person initiating attendence to a school or other place of learning."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Enrolment"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Event
  {:db/ident :bio/Event,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An event is an occurrence that brings about a change in the state of affairs for one or more people and/or other agents. Events are assumed to occur over a period of time and may not have precise start and end points."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Event"},
   :rdfs/subClassOf
   #{{:xsd/anyURI "http://linkedevents.org/ontology/Event"} :event/Event
     {:xsd/anyURI "http://sw.opencyc.org/2009/04/07/concept/en/Event"}
     :dcmitype/Event},
   :vann/usageNote
   {:rdf/language "en",
    :rdf/value
    "This class is intended to describe biographical events, i.e. events in the life of a person."},
   :vs/term_status "testing"})

(def Execution
  {:db/ident :bio/Execution,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person being deliberately killed as punishment."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Execution"},
   :rdfs/subClassOf :bio/Death,
   :vs/term_status "unstable"})

(def Formation
  {:db/ident :bio/Formation,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The event of a group or organization coming into being."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Formation"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Funeral
  {:db/ident         :bio/Funeral,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The event of marking a person's death with a ceremony."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Funeral"},
   :rdfs/subClassOf  :bio/IndividualEvent,
   :vs/term_status   "unstable"})

(def Graduation
  {:db/ident :bio/Graduation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person being awarded educational diplomas or degrees."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Graduation"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def GroupEvent
  {:db/ident :bio/GroupEvent,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A type of event that is principally about one or more agents and their partnership. Other agents may be involved but the event is most significant for the partner agent."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Group Event"},
   :rdfs/subClassOf #{:bio/Event
                      {:owl/minCardinality 2,
                       :owl/onProperty     :bio/partner,
                       :rdf/type           :owl/Restriction}},
   :vs/term_status "unstable"})

(def Imprisonment
  {:db/ident :bio/Imprisonment,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The event of a person being detained in a jail or prison."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Imprisonment"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Inauguration
  {:db/ident :bio/Inauguration,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The ceremonial event marking the beginning of a person's term of office as a leader."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Inauguration"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def IndividualEvent
  {:db/ident :bio/IndividualEvent,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A type of event that is principally about a single person, group or organization. Other agents may be involved but the event is most significant for the principal agent."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Individual Event"},
   :rdfs/subClassOf #{:bio/Event
                      {:owl/cardinality 1,
                       :owl/onProperty  :bio/principal,
                       :rdf/type        :owl/Restriction}},
   :vs/term_status "unstable"})

(def Interval
  {:db/ident :bio/Interval,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A extended interval of time related to a particular state of affairs, such as the lifespan of a person or a period of employment."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Interval"},
   :rdfs/subClassOf :time/ProperInterval,
   :vs/term_status "unstable"})

(def Investiture
  {:db/ident :bio/Investiture,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The ceremonial event of a person taking a public office or honour."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Investiture"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Marriage
  {:db/ident :bio/Marriage,
   :owl/equivalentClass
   {:xsd/anyURI
    "http://sw.opencyc.org/2009/04/07/concept/en/WeddingEvent_Generic"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of creating uniting the participants into a new family unit, sometimes accompanied by a formal wedding ceremony. This is intended to cover a broad range of marriages including those given formal legal standing, common-law, or by convention. It is not restricted to marriages of two people of the opposite gender, but also includes polygamous and same-sex unions."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Marriage"},
   :rdfs/subClassOf :bio/GroupEvent,
   :vs/term_status "stable"})

(def Murder
  {:db/ident :bio/Murder,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person being killed unlawfully with intent by the killer."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Murder"},
   :rdfs/subClassOf :bio/Death,
   :vs/term_status "unstable"})

(def NameChange
  {:db/ident         :bio/NameChange,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "The event of a person changing their name."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Change of Name"},
   :rdfs/subClassOf  :bio/IndividualEvent,
   :vs/term_status   "unstable"})

(def Naturalization
  {:db/ident :bio/Naturalization,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person obtaining citizenship. Note that the place the naturalization event occurs at may be different from the state the person is obtaining citizenship of. "},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Naturalization"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Ordination
  {:db/ident :bio/Ordination,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The ceremonial event held when a person receives authority to act in religious matters."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ordination"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Performance
  {:db/ident :bio/Performance,
   :owl/equivalentClass :mo/Performance,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of an individual or a group of performers performing. Examples include concerts, plays, recitals, recordings, busking etc."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Performance"},
   :rdfs/subClassOf :bio/GroupEvent,
   :vs/term_status "unstable"})

(def PositionChange
  {:db/ident :bio/PositionChange,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person changing the position they hold with an employer."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Change of Position"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Promotion
  {:db/ident :bio/Promotion,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person changing the position they hold with an employer to one with more importance or responsibility."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Promotion"},
   :rdfs/subClassOf :bio/PositionChange,
   :vs/term_status "unstable"})

(def Redundancy
  {:db/ident :bio/Redundancy,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person involuntarily giving up an office or position that is no longer needed. Redundancy is usually perceived to be the employer's fault and is usually due to conditions outside of the employee's control."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Redundancy"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Relationship
  {:db/ident :bio/Relationship,
   :owl/equivalentClass :rel/Relationship,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A particular type of connection existing between people, groups or organizations related to or having dealings with each other."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Agent Relationship"},
   :vs/term_status "unstable"})

(def Resignation
  {:db/ident :bio/Resignation,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person voluntarily giving up or quitting their office or position."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Resignation"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Retirement
  {:db/ident :bio/Retirement,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person exiting an occupational relationship with an employer after a qualifying time period. In many cultures retirement is expected and even required once the person reaches a particular age."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Retirement"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def agent
  {:db/ident :bio/agent,
   :label/plural {:rdf/language "en",
                  :rdf/value    "Agents"},
   :owl/inverseOf :bio/event,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A person, organization or group that plays a role in an event."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Agent"},
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf :owl/differentFrom})

(def biography
  {:db/ident :bio/biography,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "An extended description or account of someone's life."},
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Biography"},
   :vann/usageNote
   "<p>It is expected that the value of this property is either a literal formatted with HTML markup or a pointer to an HTML document.</p>",
   :vs/term_status "unstable"})

(def birth
  {:db/ident :bio/birth,
   :label/plural {:rdf/language "en",
                  :rdf/value    "Birth Events"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An birth event associated with a person, group or organization."},
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Birth Event"},
   :rdfs/range :bio/Birth,
   :rdfs/subPropertyOf #{:bio/event :owl/differentFrom}})

(def child
  {:db/ident :bio/child,
   :label/plural {:rdf/language "en",
                  :rdf/value    "Children"},
   :owl/equivalentProperty :rel/parentOf,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A biological child of a person. "},
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Child"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :owl/differentFrom,
   :vann/usageNote
   "Note that this is a strict definition of child that does not include adopted children, step-children or similar non-biological relationships. The <a href=\"http://purl.org/vocab/relationship\">Relationship</a> vocabulary may be more suitable for broader types of parent/child relation.",
   :vs/term_status "unstable"})

(def concludingEvent
  {:db/ident :bio/concludingEvent,
   :label/plural {:rdf/language "en",
                  :rdf/value    "Concluding Event"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An event that marks the end of an interval and/or relationship. The event changes of the state of affairs that held during the interval. For example a period of study may be concluded by a Graduation event."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Concluding Event"},
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf :owl/differentFrom})

(def concurrentEvent
  {:db/ident :bio/concurrentEvent,
   :label/plural {:rdf/language "en",
                  :rdf/value    "Concurrent Events"},
   :rdf/type #{:owl/SymmetricProperty :owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An event that occurs while this event is occurring. The events need not start or conclude at the same times."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Concurrent Event"},
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf :owl/differentFrom})

(def date
  {:db/ident :bio/date,
   :label/plural {:rdf/language "en",
                  :rdf/value    "Dates"},
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The date at which an event occurred."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Date"},
   :rdfs/subPropertyOf :dc11/date,
   :vann/usageNote
   "<p>The date should be formatted as specified in <a href=\"http://www.w3.org/TR/NOTE-datetime\">ISO8601</a>.\n    For example: 2003-03-15 corresponds to the 15th March 2003, and 2003-03-15T13:21-05:00 corresponds to 15th March 2003, 8:21 am, US Eastern Standard Time.</p>",
   :vs/term_status "stable"})

(def death
  {:db/ident :bio/death,
   :label/plural {:rdf/language "en",
                  :rdf/value    "Death Events"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An death event associated with a person, group or organization."},
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Death Event"},
   :rdfs/range :bio/Death,
   :rdfs/subPropertyOf #{:bio/event :owl/differentFrom}})

(def employer
  {:db/ident :bio/employer,
   :label/plural {:rdf/language "en",
                  :rdf/value    "Employers"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "An agent that is involved in an event as an employer."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Employer"},
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf :bio/agent})

(def event
  {:db/ident :bio/event,
   :label/plural {:rdf/language "en",
                  :rdf/value    "Life Events"},
   :owl/inverseOf :bio/agent,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "An event associated with a person, group or organization."},
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Life Event"},
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf :owl/differentFrom})

(def eventInterval
  {:db/ident :bio/eventInterval,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The interval during which the event occurs. This interval represents the exact interval of occurence for an event, it starts at the moment the event commences and finishes when the event concludes. In other words both the event and the interval start at the same instant of time and extend for the same duration."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Event Interval"},
   :rdfs/range :bio/Interval,
   :vs/term_status "unstable"})

(def father
  {:db/ident :bio/father,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :owl/FunctionalProperty},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The biological father of a person, also known as the genitor."},
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Father"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:rel/childOf :owl/differentFrom},
   :vann/usageNote
   "Note that this is a strict definition of father that does not include non-biological relationships. The <a href=\"http://purl.org/vocab/relationship\">Relationship</a> vocabulary may be more suitable for broader types of parent/child relation.",
   :vs/term_status "unstable"})

(def followingEvent
  {:db/ident           :bio/followingEvent,
   :label/plural       {:rdf/language "en",
                        :rdf/value    "Following Events"},
   :rdf/type           #{:owl/TransitiveProperty :owl/ObjectProperty
                         :rdf/Property},
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "An event that starts at some time after this event."},
   :rdfs/domain        :bio/Event,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Following Event"},
   :rdfs/range         :bio/Event,
   :rdfs/subPropertyOf :owl/differentFrom})

(def immediatelyFollowingEvent
  {:db/ident           :bio/immediatelyFollowingEvent,
   :label/plural       {:rdf/language "en",
                        :rdf/value    "Immediately Following Events"},
   :rdf/type           #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "An event that starts immediately after this event."},
   :rdfs/domain        :bio/Event,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Immediately Following Event"},
   :rdfs/range         :bio/Event,
   :rdfs/subPropertyOf #{:bio/followingEvent :owl/differentFrom}})

(def immediatelyPrecedingEvent
  {:db/ident :bio/immediatelyPrecedingEvent,
   :label/plural {:rdf/language "en",
                  :rdf/value    "Immediately Preceding Events"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An event that occurs and concludes immediately before this event."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Immediately Preceding Event"},
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf #{:owl/differentFrom :bio/precedingEvent}})

(def initiatingEvent
  {:db/ident :bio/initiatingEvent,
   :label/plural {:rdf/language "en",
                  :rdf/value    "Initiating Event"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An event that marks the start of an interval and/or relationship. The event contributes to and/or causes of the state of affairs that hold during the interval. For example a period of study may be initiated by an Enrolment event."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Initiating Event"},
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf :owl/differentFrom})

(def interval
  {:db/ident         :bio/interval,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The interval during which the relationship persists."},
   :rdfs/domain      :bio/Relationship,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Relationship Interval"},
   :rdfs/range       :bio/Interval,
   :vs/term_status   "unstable"})

(def keywords
  {:db/ident :bio/keywords,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "A comma delimited list of key words that describe a person."},
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Key Words"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :dc11/subject,
   :vs/term_status "stable"})

(def mother
  {:db/ident :bio/mother,
   :rdf/type #{:owl/ObjectProperty :rdf/Property :owl/FunctionalProperty},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The biological mother of a person, also known as the genetrix."},
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mother"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf #{:rel/childOf :owl/differentFrom},
   :vann/usageNote
   "Note that this is a strict definition of mother that does not include non-biological relationships. The <a href=\"http://purl.org/vocab/relationship\">Relationship</a> vocabulary may be more suitable for broader types of parent/child relation.",
   :vs/term_status "unstable"})

(def officiator
  {:db/ident           :bio/officiator,
   :label/plural       {:rdf/language "en",
                        :rdf/value    "Officiators"},
   :rdf/type           #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "A person that officiates at a ceremonial event."},
   :rdfs/domain        :bio/Event,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Officiator"},
   :rdfs/range         :foaf/Person,
   :rdfs/subPropertyOf :bio/agent})

(def olb
  {:db/ident         :bio/olb,
   :rdf/type         #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A one-line biography of the person."},
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "One-line bio"},
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   "stable"})

(def organization
  {:db/ident           :bio/organization,
   :label/plural       {:rdf/language "en",
                        :rdf/value    "Organizations"},
   :rdf/type           #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "An organization that plays a role in an event."},
   :rdfs/domain        :bio/Event,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Organization"},
   :rdfs/range         :foaf/Person,
   :rdfs/subPropertyOf :bio/agent})

(def parent
  {:db/ident           :bio/parent,
   :label/plural       {:rdf/language "en",
                        :rdf/value    "Parents"},
   :rdf/type           #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "A person that takes the parent role in an event."},
   :rdfs/domain        :bio/Event,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Parent"},
   :rdfs/range         :foaf/Person,
   :rdfs/subPropertyOf :bio/agent})

(def participant
  {:db/ident :bio/participant,
   :label/plural {:rdf/language "en",
                  :rdf/value    "Participants"},
   :owl/equivalentProperty :rel/participant,
   :owl/inverseOf :bio/relationship,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A person, group or organization that participates in a relationship for some time."},
   :rdfs/domain :bio/Relationship,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Participant"},
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf :owl/differentFrom})

(def partner
  {:db/ident :bio/partner,
   :label/plural {:rdf/language "en",
                  :rdf/value    "Partners"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A person that is involved in a event as a partner in a relationship."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Partner"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :bio/agent})

(def place
  {:db/ident         :bio/place,
   :label/plural     {:rdf/language "en",
                      :rdf/value    "Places"},
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The place at which an event occurred."},
   :rdfs/domain      :bio/Event,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Place"},
   :vs/term_status   "stable"})

(def position
  {:db/ident :bio/position,
   :label/plural {:rdf/language "en",
                  :rdf/value    "Positions"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The employment position or public office involved in an event."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Position"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :bio/agent,
   :vs/term_status "unstable"})

(def precedingEvent
  {:db/ident :bio/precedingEvent,
   :label/plural {:rdf/language "en",
                  :rdf/value    "Preceding Events"},
   :rdf/type #{:owl/TransitiveProperty :owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An event that occurs and concludes at some time before this event."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Preceding Event"},
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf :owl/differentFrom})

(def principal
  {:db/ident :bio/principal,
   :label/plural {:rdf/language "en",
                  :rdf/value    "Principals"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A person that takes the primary and most important role in an event. For example the principal in a Birth event would be the child being born and the principal in a Burial event would be the deceased person."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Principal"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :bio/agent})

(def relationship
  {:db/ident :bio/relationship,
   :label/plural {:rdf/language "en",
                  :rdf/value    "Relationships"},
   :owl/equivalentProperty :rel/participantIn,
   :owl/inverseOf :bio/participant,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A relationship that a person, group or organization participates in for some time."},
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Relationship"},
   :rdfs/range :bio/Relationship,
   :rdfs/subPropertyOf :owl/differentFrom})

(def spectator
  {:db/ident :bio/spectator,
   :label/plural {:rdf/language "en",
                  :rdf/value    "Spectators"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A person that is present at and observes the occurrence of at least part of an event."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Spectator"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :bio/agent})

(def state
  {:db/ident :bio/state,
   :label/plural {:rdf/language "en",
                  :rdf/value    "States"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A country or independent territory that is involved in an event."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "State"},
   :rdfs/subPropertyOf :bio/agent})

(def termgroup1
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Properties of a person"}})

(def termgroup2
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Types of event"}})

(def termgroup3
  {:db/ident   :bio/termgroup3,
   :rdf/_1     :bio/date,
   :rdf/_2     :bio/place,
   :rdf/_3     :bio/state,
   :rdf/_4     :bio/position,
   :rdf/type   :rdf/Bag,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Properties of an event"}})

(def termgroup4
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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Properties that relate an event to an agent"}})

(def termgroup5
  {:db/ident   :bio/termgroup5,
   :rdf/_1     :bio/concurrentEvent,
   :rdf/_2     :bio/followingEvent,
   :rdf/_3     :bio/precedingEvent,
   :rdf/_4     :bio/immediatelyFollowingEvent,
   :rdf/_5     :bio/immediatelyPrecedingEvent,
   :rdf/type   :rdf/Bag,
   :rdfs/label {:rdf/language "en",
                :rdf/value "Properties that relate an event to another event"}})

(def witness
  {:db/ident :bio/witness,
   :label/plural {:rdf/language "en",
                  :rdf/value    "Witnesses"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A person that witnesses and can bear testimony to the occurrence of an event."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy {:xsd/anyURI "http://purl.org/vocab/bio/0.1/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Witness"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :bio/spectator})