(ns net.wikipunk.rdf.bio
  "This document describes a vocabulary for describing biographical information about people, both living and dead."
  {:dcat/downloadURL "https://vocab.org/bio/schema.rdf",
   :dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "This document describes a vocabulary for describing biographical information about people, both living and dead. "},
   :dcterms/creator ["http://iandavis.com/id/me" "David Galbraith"],
   :dcterms/date #inst "2010-05-10T00:00:00.000-04:00",
   :dcterms/description
   "<div>\n        \n        <p>The BIO vocabulary contains terms useful for finding out more about people and their backgrounds and has some cross-over into genealogical information. \n        The approach taken is to describe a person's life as a series of interconnected key events, around which other information can be woven. \n        This vocabulary defines the event framework and supplies a set of core event types that cover many use cases, but it is expected that it \n        will be extended in other vocabularies to suit their needs. The intention of this vocabulary is to describe biographical events of people \n        and this intention carries through to the definitions of the properties and classes which are person-centric rather than neutral. For example \n        the Employment event puts the person being employed as the principal agent in the event rather than the employer.</p>\n        <p>The BIO vocabulary defines a number of core classes and properties for describing biographical information: </p>\n        <p><figure><img src=\"/bio/core-classes.png\"></img><br></br>Figure: Biography Vocabulary Core Classes (<a href=\"http://vocab.org/bio/core-classes.png\">PNG version</a>, <a href=\"http://vocab.org/bio/core-classes.svg\">SVG version</a>)</figure></p>\n        <p>At its heart the BIO vocabulary is concerned with people, their relationships and the events in their lives. Together these can be\n        used to build up a narrative of a person's life and their interactions with other people, organizations and the world around them. Events bound intervals\n        of time that may be associated with particular relationships between people and groups or organisations. Many different types of life event are\n        defined in this vocabulary including the obvious Birth, Marriage and Death but also Coronation, Performance and even Murder. These events are not intended\n        to be fully comprehensive but are representative of the types of events associated with biographical material. Currently the relationship segment of the\n        vocabulary is underspecified with only a generic Relationship class available. It is envisaged that many types of relationship such as families, employments\n        and ownerships will be specified in the future.</p>\n        <p>The sequence of events and intervals build a timeline of history against which people and their relationships can be placed. The aim is\n        to enable simple forms of genealogical reasoning such as determining whether a child was born out of wedlock or the location of a family\n        given the fact one of their children was attending a particular school. Events are ordered in time by relating them to one another and to abstract\n        intervals of time:</p>\n        <p><figure><img src=\"/bio/timelines.png\"></img><br></br>Figure: Biography Vocabulary Timelines(<a href=\"http://vocab.org/bio/timelines.png\">PNG version</a>, <a href=\"http://vocab.org/bio/timelines.svg\">SVG version</a>)</figure></p>\n        <p>Please see <a href=\"https://github.com/iand/vocab-bio\">https://github.com/iand/vocab-bio</a> for the master version of this vocabulary.</p>\n      </div>",
   :dcterms/identifier "http://purl.org/vocab/bio/0.1/schema",
   :dcterms/issued #inst "2003-03-07T00:00:00.000-05:00",
   :dcterms/rights "Copyright ?? 2002-2010 Ian Davis and David Galbraith",
   :dcterms/title {:rdf/language "en",
                   :rdf/value "BIO: A vocabulary for biographical information"},
   :ov/discussionList "http://lists.foaf-project.org/mailman/listinfo/foaf-dev",
   :rdf/ns-prefix-map {"bio" "http://purl.org/vocab/bio/0.1/",
                       "cc" "http://web.resource.org/cc/",
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
   :rdf/type :owl/Ontology,
   :rdf/uri "http://purl.org/vocab/bio/0.1/",
   :rdfa/prefix "bio",
   :rdfa/uri "http://purl.org/vocab/bio/0.1/",
   :skos/changeNote [{:dcterms/creator "Ian Davis",
                      :dcterms/date "2010-05-20",
                      :rdf/value
                      "Batch of revisions based on community feedback"}
                     {:dcterms/creator "Ian Davis",
                      :dcterms/date    "2005-04-01",
                      :rdf/value       "Added examples"}
                     {:dcterms/creator "Ian Davis",
                      :dcterms/date "2009-05-19",
                      :rdf/value "Minor changes to improve publishing process"}
                     {:dcterms/creator "Ian Davis",
                      :dcterms/date    "2004-03-05",
                      :rdf/value       "Added Creative Commons license"}
                     {:dcterms/creator "Ian Davis",
                      :dcterms/date    "2010-04-20",
                      :rdf/value       "Added change history"}
                     {:dcterms/creator "Ian Davis",
                      :dcterms/date "2011-06-14",
                      :rdf/value "Expanded description and added diagrams"}],
   :skos/historyNote
   [{:dcterms/creator "Ian Davis",
     :dcterms/date    "2010-06-05",
     :rdf/value       "Added biography property"}
    {:dcterms/creator "Alexandre Passant",
     :dcterms/date "2011-06-14",
     :rdf/value
     "Added properties for Birth and Death Event types, motivated by JSON serialisations of RDF"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2003-07-28",
     :rdf/value       "Added keywords property"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2011-06-10",
     :rdf/value       "Added bio:Formation and bio:Disbanding events"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2011-06-10",
     :rdf/value       "Added bio:Performance event"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2011-06-14",
     :rdf/value       "Added bio:Relationship class and properties"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date "2010-06-06",
     :rdf/value
     "Added subproperty and equivalent property relations for bio:father, bio:mother and bio:child"}
    {:dcterms/creator "Ian Davis",
     :dcterms/date    "2010-05-10",
     :rdf/value       "Major expansion of properties and classes"}],
   :vann/example "http://purl.org/vocab/bio/examples/1",
   :vann/preferredNamespacePrefix "bio",
   :vann/preferredNamespaceUri "http://purl.org/vocab/bio/0.1/"}
  (:refer-clojure :exclude [agent]))

(def Accession
  "The event of a person succeeding to the right to hold regal power. This event is often automatic on the death of the previous monarch and is usually followed by a coronation event."
  {:db/ident :bio/Accession,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person succeeding to the right to hold regal power. This event is often automatic on the death of the previous monarch and is usually followed by a coronation event."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Accession"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Adoption
  "The event of creating of a legal parent/child relationship that does not exist biologically."
  {:db/ident :bio/Adoption,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of creating of a legal parent/child relationship that does not exist biologically."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Adoption"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Annulment
  "The event of declaring a marriage void from the beginning as though it never existed."
  {:db/ident :bio/Annulment,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of declaring a marriage void from the beginning as though it never existed."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Annulment"},
   :rdfs/subClassOf :bio/GroupEvent,
   :vs/term_status "unstable"})

(def Assassination
  "The event of a person being deliberately targeted and killed."
  {:db/ident :bio/Assassination,
   :dcterms/issued "2010-05-05",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The event of a person being deliberately targeted and killed."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Assassination"},
   :rdfs/subClassOf :bio/Murder,
   :vs/term_status "unstable"})

(def Baptism
  "The ceremonial event held to admit a person to membership of a Christian church."
  {:db/ident :bio/Baptism,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The ceremonial event held to admit a person to membership of a Christian church."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Baptism"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :skos/changeNote
   {:dcterms/creator "Ian Davis",
    :dcterms/date "2010-05-20",
    :rdf/value
    "Revised comment, replacing 'the Christian church' with 'a Christian church' "},
   :vs/term_status "unstable"})

(def BarMitzvah
  "The ceremonial event held when a Jewish boy reaches age 13."
  {:db/ident :bio/BarMitzvah,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The ceremonial event held when a Jewish boy reaches age 13."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "BarMitzvah"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def BasMitzvah
  "The ceremonial event held when a Jewish girl reaching age 13, also known as \"Bat Mitzvah.\""
  {:db/ident :bio/BasMitzvah,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The ceremonial event held when a Jewish girl reaching age 13, also known as \"Bat Mitzvah.\""},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "BasMitzvah"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Birth
  "The event of a person entering into life."
  {:db/ident :bio/Birth,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The event of a person entering into life."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Birth"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :skos/changeNote {:dcterms/creator "Ian Davis",
                     :dcterms/date    "2010-05-04",
                     :rdf/value       "Marked as testing"},
   :vs/term_status "testing"})

(def Burial
  "The event of interring the remains of a person's body into the ground."
  {:db/ident :bio/Burial,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of interring the remains of a person's body into the ground."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Burial"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Coronation
  "The ceremonial event of a person being invested with regal power to become a monarch."
  {:db/ident :bio/Coronation,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The ceremonial event of a person being invested with regal power to become a monarch."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Coronation"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Cremation
  "The event of disposing of the remains of a person's body by fire."
  {:db/ident :bio/Cremation,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of disposing of the remains of a person's body by fire."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cremation"},
   :rdfs/subClassOf :bio/IndividualEvent,,
   :vs/term_status "unstable"})

(def Death
  "The event of a person's life ending."
  {:db/ident :bio/Death,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The event of a person's life ending."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Death"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :skos/changeNote {:dcterms/creator "Ian Davis",
                     :dcterms/date    "2010-05-04",
                     :rdf/value       "Marked as a stable term"},,
   :vs/term_status "stable"})

(def Demotion
  "The event of a person changing the position they hold with an employer to one with less importance or responsibility."
  {:db/ident :bio/Demotion,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person changing the position they hold with an employer to one with less importance or responsibility."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Demotion"},
   :rdfs/subClassOf :bio/PositionChange,
   :vs/term_status "unstable"})

(def Disbanding
  "The event of a group or organization being disbanded."
  {:db/ident         :bio/Disbanding,
   :dcterms/issued   "2011-06-10",
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The event of a group or organization being disbanded."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Disbanding"},
   :rdfs/subClassOf  :bio/IndividualEvent,
   :vs/term_status   "unstable"})

(def Dismissal
  "The event of a person involuntarily giving up their office or position. Dismissal is often perceived to be the employee's fault and may be considered disgraceful."
  {:db/ident :bio/Dismissal,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person involuntarily giving up their office or position. Dismissal is often perceived to be the employee's fault and may be considered disgraceful."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Dismissal"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Divorce
  "The event of legally dissolving a marriage."
  {:db/ident :bio/Divorce,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The event of legally dissolving a marriage."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Divorce"},
   :rdfs/subClassOf :bio/GroupEvent,
   :vs/term_status "unstable"})

(def Emigration
  "The event of a person leaving their homeland with the intent of residing elsewhere."
  {:db/ident :bio/Emigration,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person leaving their homeland with the intent of residing elsewhere."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Emigration"},
   :rdfs/subClassOf :bio/IndividualEvent,,
   :vs/term_status "unstable"})

(def Employment
  "The event of a person entering an occupational relationship with an employer."
  {:db/ident :bio/Employment,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person entering an occupational relationship with an employer."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Employment"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Enrolment
  "The event of a person initiating attendence to a school or other place of learning."
  {:db/ident :bio/Enrolment,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person initiating attendence to a school or other place of learning."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Enrolment"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Event
  "An event is an occurrence that brings about a change in the state of affairs for one or more people and/or other agents. Events are assumed to occur over a period of time and may not have precise start and end points."
  {:db/ident :bio/Event,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An event is an occurrence that brings about a change in the state of affairs for one or more people and/or other agents. Events are assumed to occur over a period of time and may not have precise start and end points."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Event"},
   :rdfs/subClassOf [:event/Event :dcmitype/Event],
   :skos/changeNote [{:dcterms/creator "Ian Davis",
                      :dcterms/date    "2010-05-20",
                      :rdf/value       "Marked as testing status"}
                     {:dcterms/creator "Ian Davis",
                      :dcterms/date    "2010-05-04",
                      :rdf/value       "Marked as a stable term"}],
   :skos/historyNote [{:dcterms/creator "Ian Davis",
                       :dcterms/date    "2010-05-04",
                       :rdf/value       "Made equivalent to cyc:Event"}
                      {:dcterms/creator "Ian Davis",
                       :dcterms/date "2010-05-20",
                       :rdf/value
                       "Removed subclass of owl-time ProperInteval"}],
   :vann/usageNote
   {:rdf/language "en",
    :rdf/value
    "This class is intended to describe biographical events, i.e. events in the life of a person."},
   :vs/term_status "testing"})

(def Execution
  "The event of a person being deliberately killed as punishment."
  {:db/ident :bio/Execution,
   :dcterms/issued "2010-05-05",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person being deliberately killed as punishment."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Execution"},
   :rdfs/subClassOf :bio/Death,
   :vs/term_status "unstable"})

(def Formation
  "The event of a group or organization coming into being."
  {:db/ident :bio/Formation,
   :dcterms/issued "2011-06-10",
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The event of a group or organization coming into being."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Formation"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Funeral
  "The event of marking a person's death with a ceremony."
  {:db/ident         :bio/Funeral,
   :dcterms/issued   "2010-05-03",
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The event of marking a person's death with a ceremony."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Funeral"},
   :rdfs/subClassOf  :bio/IndividualEvent,
   :vs/term_status   "unstable"})

(def Graduation
  "The event of a person being awarded educational diplomas or degrees."
  {:db/ident :bio/Graduation,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person being awarded educational diplomas or degrees."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Graduation"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def GroupEvent
  "A type of event that is principally about one or more agents and their partnership. Other agents may be involved but the event is most significant for the partner agent."
  {:db/ident :bio/GroupEvent,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A type of event that is principally about one or more agents and their partnership. Other agents may be involved but the event is most significant for the partner agent."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Group Event"},
   :rdfs/subClassOf [{:owl/minCardinality 2,
                      :owl/onProperty     :bio/partner,
                      :rdf/type           :owl/Restriction}
                     :bio/Event],
   :vs/term_status "unstable"})

(def Imprisonment
  "The event of a person being detained in a jail or prison."
  {:db/ident :bio/Imprisonment,
   :dcterms/issued "2010-05-04",
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The event of a person being detained in a jail or prison."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Imprisonment"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Inauguration
  "The ceremonial event marking the beginning of a person's term of office as a leader."
  {:db/ident :bio/Inauguration,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The ceremonial event marking the beginning of a person's term of office as a leader."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Inauguration"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def IndividualEvent
  "A type of event that is principally about a single person, group or organization. Other agents may be involved but the event is most significant for the principal agent."
  {:db/ident :bio/IndividualEvent,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A type of event that is principally about a single person, group or organization. Other agents may be involved but the event is most significant for the principal agent."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Individual Event"},
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :bio/Event],
   :vs/term_status "unstable"})

(def Interval
  "A extended interval of time related to a particular state of affairs, such as the lifespan of a person or a period of employment."
  {:db/ident :bio/Interval,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A extended interval of time related to a particular state of affairs, such as the lifespan of a person or a period of employment."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Interval"},
   :rdfs/subClassOf :time/ProperInterval,
   :vs/term_status "unstable"})

(def Investiture
  "The ceremonial event of a person taking a public office or honour."
  {:db/ident :bio/Investiture,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The ceremonial event of a person taking a public office or honour."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Investiture"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Marriage
  "The event of creating uniting the participants into a new family unit, sometimes accompanied by a formal wedding ceremony. This is intended to cover a broad range of marriages including those given formal legal standing, common-law, or by convention. It is not restricted to marriages of two people of the opposite gender, but also includes polygamous and same-sex unions."
  {:db/ident :bio/Marriage,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of creating uniting the participants into a new family unit, sometimes accompanied by a formal wedding ceremony. This is intended to cover a broad range of marriages including those given formal legal standing, common-law, or by convention. It is not restricted to marriages of two people of the opposite gender, but also includes polygamous and same-sex unions."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Marriage"},
   :rdfs/subClassOf :bio/GroupEvent,
   :skos/changeNote {:dcterms/creator "Ian Davis",
                     :dcterms/date    "2010-05-04",
                     :rdf/value       "Marked as a stable term"},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date "2010-05-04",
                      :rdf/value "Made equivalent to cyc:WeddingEvent_Generic"},,
   :vs/term_status "stable"})

(def Murder
  "The event of a person being killed unlawfully with intent by the killer."
  {:db/ident :bio/Murder,
   :dcterms/issued "2010-05-05",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person being killed unlawfully with intent by the killer."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Murder"},
   :rdfs/subClassOf :bio/Death,
   :vs/term_status "unstable"})

(def NameChange
  "The event of a person changing their name."
  {:db/ident         :bio/NameChange,
   :dcterms/issued   "2010-05-03",
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "The event of a person changing their name."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Change of Name"},
   :rdfs/subClassOf  :bio/IndividualEvent,
   :vs/term_status   "unstable"})

(def Naturalization
  "The event of a person obtaining citizenship. Note that the place the naturalization event occurs at may be different from the state the person is obtaining citizenship of."
  {:db/ident :bio/Naturalization,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person obtaining citizenship. Note that the place the naturalization event occurs at may be different from the state the person is obtaining citizenship of. "},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Naturalization"},
   :rdfs/subClassOf :bio/IndividualEvent,,
   :vs/term_status "unstable"})

(def Ordination
  "The ceremonial event held when a person receives authority to act in religious matters."
  {:db/ident :bio/Ordination,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The ceremonial event held when a person receives authority to act in religious matters."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ordination"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Performance
  "The event of an individual or a group of performers performing. Examples include concerts, plays, recitals, recordings, busking etc."
  {:db/ident :bio/Performance,
   :dcterms/issued "2011-06-12",
   :owl/equivalentClass :mo/Performance,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of an individual or a group of performers performing. Examples include concerts, plays, recitals, recordings, busking etc."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Performance"},
   :rdfs/subClassOf :bio/GroupEvent,
   :vs/term_status "unstable"})

(def PositionChange
  "The event of a person changing the position they hold with an employer."
  {:db/ident :bio/PositionChange,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person changing the position they hold with an employer."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Change of Position"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Promotion
  "The event of a person changing the position they hold with an employer to one with more importance or responsibility."
  {:db/ident :bio/Promotion,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person changing the position they hold with an employer to one with more importance or responsibility."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Promotion"},
   :rdfs/subClassOf :bio/PositionChange,
   :vs/term_status "unstable"})

(def Redundancy
  "The event of a person involuntarily giving up an office or position that is no longer needed. Redundancy is usually perceived to be the employer's fault and is usually due to conditions outside of the employee's control."
  {:db/ident :bio/Redundancy,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person involuntarily giving up an office or position that is no longer needed. Redundancy is usually perceived to be the employer's fault and is usually due to conditions outside of the employee's control."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Redundancy"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Relationship
  "A particular type of connection existing between people, groups or organizations related to or having dealings with each other."
  {:db/ident :bio/Relationship,
   :dcterms/issued "2011-06-14",
   :owl/equivalentClass :rel/Relationship,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A particular type of connection existing between people, groups or organizations related to or having dealings with each other."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Agent Relationship"},
   :vs/term_status "unstable"})

(def Resignation
  "The event of a person voluntarily giving up or quitting their office or position."
  {:db/ident :bio/Resignation,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person voluntarily giving up or quitting their office or position."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Resignation"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def Retirement
  "The event of a person exiting an occupational relationship with an employer after a qualifying time period. In many cultures retirement is expected and even required once the person reaches a particular age."
  {:db/ident :bio/Retirement,
   :dcterms/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The event of a person exiting an occupational relationship with an employer after a qualifying time period. In many cultures retirement is expected and even required once the person reaches a particular age."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Retirement"},
   :rdfs/subClassOf :bio/IndividualEvent,
   :vs/term_status "unstable"})

(def agent
  "A person, organization or group that plays a role in an event."
  {:db/ident :bio/agent,
   :dcterms/issued "2010-05-05",
   :label/plural {:rdf/language "en",
                  :rdf/value    "Agents"},
   :owl/inverseOf :bio/event,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A person, organization or group that plays a role in an event."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Agent"},
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf :owl/differentFrom})

(def biography
  "An extended description or account of someone's life."
  {:db/ident :bio/biography,
   :dcterms/issued "2010-06-05",
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "An extended description or account of someone's life."},
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Biography"},
   :vann/usageNote
   "<p>It is expected that the value of this property is either a literal formatted with HTML markup or a pointer to an HTML document.</p>",
   :vs/term_status "unstable"})

(def birth
  "An birth event associated with a person, group or organization."
  {:db/ident :bio/birth,
   :label/plural {:rdf/language "en",
                  :rdf/value    "Birth Events"},
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An birth event associated with a person, group or organization."},
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Birth Event"},
   :rdfs/range :bio/Birth,
   :rdfs/subPropertyOf [:bio/event :owl/differentFrom],
   :skos/historyNote {:dcterms/creator "Alexandre Passant",
                      :dcterms/date    "2011-07-12",
                      :rdf/value       "Proposed addition of the property"}})

(def child
  "A biological child of a person."
  {:db/ident :bio/child,
   :dcterms/issued "2010-05-03",
   :label/plural {:rdf/language "en",
                  :rdf/value    "Children"},
   :owl/equivalentProperty :rel/parentOf,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A biological child of a person. "},
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Child"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :owl/differentFrom,
   :skos/historyNote
   {:dcterms/creator "Ian Davis",
    :dcterms/date "2010-06-06",
    :rdf/value
    "Made equivalent to rel:parentOf on suggestion of Gautier Poupeau"},
   :vann/usageNote
   "Note that this is a strict definition of child that does not include adopted children, step-children or similar non-biological relationships. The <a href=\"http://purl.org/vocab/relationship\">Relationship</a> vocabulary may be more suitable for broader types of parent/child relation.",
   :vs/term_status "unstable"})

(def concludingEvent
  "An event that marks the end of an interval and/or relationship. The event changes of the state of affairs that held during the interval. For example a period of study may be concluded by a Graduation event."
  {:db/ident :bio/concludingEvent,
   :dcterms/issued "2010-05-06",
   :label/plural {:rdf/language "en",
                  :rdf/value    "Concluding Event"},
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An event that marks the end of an interval and/or relationship. The event changes of the state of affairs that held during the interval. For example a period of study may be concluded by a Graduation event."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Concluding Event"},
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf :owl/differentFrom})

(def concurrentEvent
  "An event that occurs while this event is occurring. The events need not start or conclude at the same times."
  {:db/ident :bio/concurrentEvent,
   :dcterms/issued "2010-05-06",
   :label/plural {:rdf/language "en",
                  :rdf/value    "Concurrent Events"},
   :rdf/type [:owl/SymmetricProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An event that occurs while this event is occurring. The events need not start or conclude at the same times."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Concurrent Event"},
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf :owl/differentFrom})

(def date
  "The date at which an event occurred."
  {:db/ident :bio/date,
   :label/plural {:rdf/language "en",
                  :rdf/value    "Dates"},
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The date at which an event occurred."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Date"},
   :rdfs/subPropertyOf :dc11/date,
   :skos/changeNote [{:dcterms/creator "Ian Davis",
                      :dcterms/date    "2010-05-04",
                      :rdf/value       "Marked as a stable term"}
                     {:dcterms/creator "Ian Davis",
                      :dcterms/date    "2010-05-03",
                      :rdf/value       "Added a plural label"}],
   :vann/usageNote
   "<p>The date should be formatted as specified in <a href=\"http://www.w3.org/TR/NOTE-datetime\">ISO8601</a>.\n    For example: 2003-03-15 corresponds to the 15th March 2003, and 2003-03-15T13:21-05:00 corresponds to 15th March 2003, 8:21 am, US Eastern Standard Time.</p>",
   :vs/term_status "stable"})

(def death
  "An death event associated with a person, group or organization."
  {:db/ident :bio/death,
   :label/plural {:rdf/language "en",
                  :rdf/value    "Death Events"},
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An death event associated with a person, group or organization."},
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Death Event"},
   :rdfs/range :bio/Death,
   :rdfs/subPropertyOf [:owl/differentFrom :bio/event],
   :skos/historyNote {:dcterms/creator "Alexandre Passant",
                      :dcterms/date    "2011-07-12",
                      :rdf/value       "Proposed addition of the property"}})

(def employer
  "An agent that is involved in an event as an employer."
  {:db/ident :bio/employer,
   :dcterms/issued "2010-05-05",
   :label/plural {:rdf/language "en",
                  :rdf/value    "Employers"},
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "An agent that is involved in an event as an employer."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Employer"},
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf :bio/agent})

(def event
  "An event associated with a person, group or organization."
  {:db/ident :bio/event,
   :label/plural {:rdf/language "en",
                  :rdf/value    "Life Events"},
   :owl/inverseOf :bio/agent,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "An event associated with a person, group or organization."},
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Life Event"},
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf :owl/differentFrom,
   :skos/changeNote {:dcterms/creator "Ian Davis",
                     :dcterms/date    "2010-05-03",
                     :rdf/value       "Added a plural label"},
   :skos/historyNote [{:dcterms/creator "Ian Davis",
                       :dcterms/date    "2011-06-14",
                       :rdf/value       "Changed domain to foaf:Agent"}
                      {:dcterms/creator "Ian Davis",
                       :dcterms/date "2010-05-03",
                       :rdf/value "Made a subproperty of owl:differentFrom"}]})

(def eventInterval
  "The interval during which the event occurs. This interval represents the exact interval of occurence for an event, it starts at the moment the event commences and finishes when the event concludes. In other words both the event and the interval start at the same instant of time and extend for the same duration."
  {:db/ident :bio/eventInterval,
   :dcterms/issued "2010-06-05",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The interval during which the event occurs. This interval represents the exact interval of occurence for an event, it starts at the moment the event commences and finishes when the event concludes. In other words both the event and the interval start at the same instant of time and extend for the same duration."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Event Interval"},
   :rdfs/range :bio/Interval,
   :vs/term_status "unstable"})

(def father
  "The biological father of a person, also known as the genitor."
  {:db/ident :bio/father,
   :dcterms/issued "2010-05-03",
   :rdf/type [:owl/ObjectProperty :rdf/Property :owl/FunctionalProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The biological father of a person, also known as the genitor."},
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Father"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:rel/childOf :owl/differentFrom],
   :skos/historyNote
   {:dcterms/creator "Ian Davis",
    :dcterms/date "2010-06-06",
    :rdf/value
    "Made subproperty of rel:childOf on suggestion of Gautier Poupeau"},
   :vann/usageNote
   "Note that this is a strict definition of father that does not include non-biological relationships. The <a href=\"http://purl.org/vocab/relationship\">Relationship</a> vocabulary may be more suitable for broader types of parent/child relation.",
   :vs/term_status "unstable"})

(def followingEvent
  "An event that starts at some time after this event."
  {:db/ident           :bio/followingEvent,
   :dcterms/issued     "2010-05-06",
   :label/plural       {:rdf/language "en",
                        :rdf/value    "Following Events"},
   :rdf/type           [:owl/ObjectProperty
                        :owl/TransitiveProperty
                        :rdf/Property],
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "An event that starts at some time after this event."},
   :rdfs/domain        :bio/Event,
   :rdfs/isDefinedBy   "http://purl.org/vocab/bio/0.1/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Following Event"},
   :rdfs/range         :bio/Event,
   :rdfs/subPropertyOf :owl/differentFrom})

(def immediatelyFollowingEvent
  "An event that starts immediately after this event."
  {:db/ident           :bio/immediatelyFollowingEvent,
   :dcterms/issued     "2010-05-06",
   :label/plural       {:rdf/language "en",
                        :rdf/value    "Immediately Following Events"},
   :rdf/type           [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "An event that starts immediately after this event."},
   :rdfs/domain        :bio/Event,
   :rdfs/isDefinedBy   "http://purl.org/vocab/bio/0.1/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Immediately Following Event"},
   :rdfs/range         :bio/Event,
   :rdfs/subPropertyOf [:owl/differentFrom :bio/followingEvent]})

(def immediatelyPrecedingEvent
  "An event that occurs and concludes immediately before this event."
  {:db/ident :bio/immediatelyPrecedingEvent,
   :dcterms/issued "2010-05-06",
   :label/plural {:rdf/language "en",
                  :rdf/value    "Immediately Preceding Events"},
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An event that occurs and concludes immediately before this event."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Immediately Preceding Event"},
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf [:owl/differentFrom :bio/precedingEvent]})

(def initiatingEvent
  "An event that marks the start of an interval and/or relationship. The event contributes to and/or causes of the state of affairs that hold during the interval. For example a period of study may be initiated by an Enrolment event."
  {:db/ident :bio/initiatingEvent,
   :dcterms/issued "2010-05-06",
   :label/plural {:rdf/language "en",
                  :rdf/value    "Initiating Event"},
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An event that marks the start of an interval and/or relationship. The event contributes to and/or causes of the state of affairs that hold during the interval. For example a period of study may be initiated by an Enrolment event."},
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Initiating Event"},
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf :owl/differentFrom})

(def interval
  "The interval during which the relationship persists."
  {:db/ident         :bio/interval,
   :dcterms/issued   "2010-06-05",
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The interval during which the relationship persists."},
   :rdfs/domain      :bio/Relationship,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Relationship Interval"},
   :rdfs/range       :bio/Interval,
   :vs/term_status   "unstable"})

(def keywords
  "A comma delimited list of key words that describe a person."
  {:db/ident :bio/keywords,
   :dcterms/issued "2003-07-28",
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "A comma delimited list of key words that describe a person."},
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Key Words"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :dc11/subject,
   :skos/changeNote {:dcterms/creator "Ian Davis",
                     :dcterms/date    "2010-05-04",
                     :rdf/value       "Marked as a stable term"},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date "2010-05-03",
                      :rdf/value "Declared that this is a datatype property"},
   :vs/term_status "stable"})

(def mother
  "The biological mother of a person, also known as the genetrix."
  {:db/ident :bio/mother,
   :dcterms/issued "2010-05-03",
   :rdf/type [:owl/ObjectProperty :rdf/Property :owl/FunctionalProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The biological mother of a person, also known as the genetrix."},
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mother"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :rel/childOf],
   :skos/historyNote
   {:dcterms/creator "Ian Davis",
    :dcterms/date "2010-06-06",
    :rdf/value
    "Made subproperty of rel:childOf on suggestion of Gautier Poupeau"},
   :vann/usageNote
   "Note that this is a strict definition of mother that does not include non-biological relationships. The <a href=\"http://purl.org/vocab/relationship\">Relationship</a> vocabulary may be more suitable for broader types of parent/child relation.",
   :vs/term_status "unstable"})

(def officiator
  "A person that officiates at a ceremonial event."
  {:db/ident           :bio/officiator,
   :dcterms/issued     "2010-05-05",
   :label/plural       {:rdf/language "en",
                        :rdf/value    "Officiators"},
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "A person that officiates at a ceremonial event."},
   :rdfs/domain        :bio/Event,
   :rdfs/isDefinedBy   "http://purl.org/vocab/bio/0.1/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Officiator"},
   :rdfs/range         :foaf/Person,
   :rdfs/subPropertyOf :bio/agent})

(def olb
  "A one-line biography of the person."
  {:db/ident         :bio/olb,
   :rdf/type         [:rdf/Property :owl/DatatypeProperty],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A one-line biography of the person."},
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "One-line bio"},
   :rdfs/range       :rdfs/Literal,
   :skos/changeNote  {:dcterms/creator "Ian Davis",
                      :dcterms/date    "2010-05-04",
                      :rdf/value       "Marked as a stable term"},
   :skos/historyNote {:dcterms/creator "Ian Davis",
                      :dcterms/date "2010-05-03",
                      :rdf/value "Declared that this is a datatype property"},
   :vs/term_status   "stable"})

(def organization
  "An organization that plays a role in an event."
  {:db/ident           :bio/organization,
   :dcterms/issued     "2010-05-05",
   :label/plural       {:rdf/language "en",
                        :rdf/value    "Organizations"},
   :rdf/type           [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "An organization that plays a role in an event."},
   :rdfs/domain        :bio/Event,
   :rdfs/isDefinedBy   "http://purl.org/vocab/bio/0.1/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Organization"},
   :rdfs/range         :foaf/Person,
   :rdfs/subPropertyOf :bio/agent})

(def parent
  "A person that takes the parent role in an event."
  {:db/ident           :bio/parent,
   :dcterms/issued     "2010-05-05",
   :label/plural       {:rdf/language "en",
                        :rdf/value    "Parents"},
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "A person that takes the parent role in an event."},
   :rdfs/domain        :bio/Event,
   :rdfs/isDefinedBy   "http://purl.org/vocab/bio/0.1/",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "Parent"},
   :rdfs/range         :foaf/Person,
   :rdfs/subPropertyOf :bio/agent})

(def participant
  "A person, group or organization that participates in a relationship for some time."
  {:db/ident :bio/participant,
   :dcterms/issued "2011-06-14",
   :label/plural {:rdf/language "en",
                  :rdf/value    "Participants"},
   :owl/equivalentProperty :rel/participant,
   :owl/inverseOf :bio/relationship,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A person, group or organization that participates in a relationship for some time."},
   :rdfs/domain :bio/Relationship,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Participant"},
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf :owl/differentFrom})

(def partner
  "A person that is involved in a event as a partner in a relationship."
  {:db/ident :bio/partner,
   :dcterms/issued "2010-05-05",
   :label/plural {:rdf/language "en",
                  :rdf/value    "Partners"},
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A person that is involved in a event as a partner in a relationship."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Partner"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :bio/agent})

(def place
  "The place at which an event occurred."
  {:db/ident         :bio/place,
   :label/plural     {:rdf/language "en",
                      :rdf/value    "Places"},
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The place at which an event occurred."},
   :rdfs/domain      :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Place"},
   :skos/changeNote  [{:dcterms/creator "Ian Davis",
                       :dcterms/date    "2010-05-04",
                       :rdf/value       "Marked as a stable term"}
                      {:dcterms/creator "Ian Davis",
                       :dcterms/date    "2010-05-03",
                       :rdf/value       "Added a plural label"}],
   :vs/term_status   "stable"})

(def position
  "The employment position or public office involved in an event."
  {:db/ident :bio/position,
   :dcterms/issued "2010-05-05",
   :label/plural {:rdf/language "en",
                  :rdf/value    "Positions"},
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The employment position or public office involved in an event."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Position"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :bio/agent,
   :vs/term_status "unstable"})

(def precedingEvent
  "An event that occurs and concludes at some time before this event."
  {:db/ident :bio/precedingEvent,
   :dcterms/issued "2010-05-06",
   :label/plural {:rdf/language "en",
                  :rdf/value    "Preceding Events"},
   :rdf/type [:owl/TransitiveProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An event that occurs and concludes at some time before this event."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Preceding Event"},
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf :owl/differentFrom})

(def principal
  "A person that takes the primary and most important role in an event. For example the principal in a Birth event would be the child being born and the principal in a Burial event would be the deceased person."
  {:db/ident :bio/principal,
   :dcterms/issued "2010-05-05",
   :label/plural {:rdf/language "en",
                  :rdf/value    "Principals"},
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A person that takes the primary and most important role in an event. For example the principal in a Birth event would be the child being born and the principal in a Burial event would be the deceased person."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Principal"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :bio/agent})

(def relationship
  "A relationship that a person, group or organization participates in for some time."
  {:db/ident :bio/relationship,
   :dcterms/issued "2011-06-14",
   :label/plural {:rdf/language "en",
                  :rdf/value    "Relationships"},
   :owl/equivalentProperty :rel/participantIn,
   :owl/inverseOf :bio/participant,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A relationship that a person, group or organization participates in for some time."},
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Relationship"},
   :rdfs/range :bio/Relationship,
   :rdfs/subPropertyOf :owl/differentFrom})

(def spectator
  "A person that is present at and observes the occurrence of at least part of an event."
  {:db/ident :bio/spectator,
   :dcterms/issued "2010-05-05",
   :label/plural {:rdf/language "en",
                  :rdf/value    "Spectators"},
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A person that is present at and observes the occurrence of at least part of an event."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Spectator"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :bio/agent})

(def state
  "A country or independent territory that is involved in an event."
  {:db/ident :bio/state,
   :dcterms/issued "2010-05-05",
   :label/plural {:rdf/language "en",
                  :rdf/value    "States"},
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A country or independent territory that is involved in an event."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "State"},
   :rdfs/subPropertyOf :bio/agent})

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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Properties of a person"}})

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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Types of event"}})

(def termgroup3
  "Properties of an event"
  {:db/ident   :bio/termgroup3,
   :rdf/_1     :bio/date,
   :rdf/_2     :bio/place,
   :rdf/_3     :bio/state,
   :rdf/_4     :bio/position,
   :rdf/type   :rdf/Bag,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Properties of an event"}})

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
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Properties that relate an event to an agent"}})

(def termgroup5
  "Properties that relate an event to another event"
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
  "A person that witnesses and can bear testimony to the occurrence of an event."
  {:db/ident :bio/witness,
   :dcterms/issued "2010-05-05",
   :label/plural {:rdf/language "en",
                  :rdf/value    "Witnesses"},
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A person that witnesses and can bear testimony to the occurrence of an event."},
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Witness"},
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf :bio/spectator})
