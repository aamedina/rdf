(ns net.wikipunk.rdf.bio
  "http://purl.org/vocab/bio/0.1/"
  {:dc11/abstract
   #voc/lstr
    "This document describes a vocabulary for describing biographical information about people, both living and dead. @en",
   :dc11/creator ["http://iandavis.com/id/me" "David Galbraith"],
   :dc11/date #inst "2010-05-10T00:00:00.000-04:00",
   :dc11/description
   "<div>\n        \n        <p>The BIO vocabulary contains terms useful for finding out more about people and their backgrounds and has some cross-over into genealogical information. \n        The approach taken is to describe a person's life as a series of interconnected key events, around which other information can be woven. \n        This vocabulary defines the event framework and supplies a set of core event types that cover many use cases, but it is expected that it \n        will be extended in other vocabularies to suit their needs. The intention of this vocabulary is to describe biographical events of people \n        and this intention carries through to the definitions of the properties and classes which are person-centric rather than neutral. For example \n        the Employment event puts the person being employed as the principal agent in the event rather than the employer.</p>\n        <p>The BIO vocabulary defines a number of core classes and properties for describing biographical information: </p>\n        <p><figure><img src=\"/bio/core-classes.png\"></img><br></br>Figure: Biography Vocabulary Core Classes (<a href=\"http://vocab.org/bio/core-classes.png\">PNG version</a>, <a href=\"http://vocab.org/bio/core-classes.svg\">SVG version</a>)</figure></p>\n        <p>At its heart the BIO vocabulary is concerned with people, their relationships and the events in their lives. Together these can be\n        used to build up a narrative of a person's life and their interactions with other people, organizations and the world around them. Events bound intervals\n        of time that may be associated with particular relationships between people and groups or organisations. Many different types of life event are\n        defined in this vocabulary including the obvious Birth, Marriage and Death but also Coronation, Performance and even Murder. These events are not intended\n        to be fully comprehensive but are representative of the types of events associated with biographical material. Currently the relationship segment of the\n        vocabulary is underspecified with only a generic Relationship class available. It is envisaged that many types of relationship such as families, employments\n        and ownerships will be specified in the future.</p>\n        <p>The sequence of events and intervals build a timeline of history against which people and their relationships can be placed. The aim is\n        to enable simple forms of genealogical reasoning such as determining whether a child was born out of wedlock or the location of a family\n        given the fact one of their children was attending a particular school. Events are ordered in time by relating them to one another and to abstract\n        intervals of time:</p>\n        <p><figure><img src=\"/bio/timelines.png\"></img><br></br>Figure: Biography Vocabulary Timelines(<a href=\"http://vocab.org/bio/timelines.png\">PNG version</a>, <a href=\"http://vocab.org/bio/timelines.svg\">SVG version</a>)</figure></p>\n        <p>Please see <a href=\"https://github.com/iand/vocab-bio\">https://github.com/iand/vocab-bio</a> for the master version of this vocabulary.</p>\n      </div>",
   :dc11/identifier "http://purl.org/vocab/bio/0.1/schema",
   :dc11/issued #inst "2003-03-07T00:00:00.000-05:00",
   :dc11/rights "Copyright © 2002-2010 Ian Davis and David Galbraith",
   :dc11/title #voc/lstr "BIO: A vocabulary for biographical information@en",
   :dcat/downloadURL "https://vocab.org/bio/schema.rdf",
   :ov/discussionList "http://lists.foaf-project.org/mailman/listinfo/foaf-dev",
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "bio",
   :rdfa/uri "http://purl.org/vocab/bio/0.1/",
   :skos/changeNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2004-03-05",
     :rdf/value    "Added Creative Commons license"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2005-04-01",
     :rdf/value    "Added examples"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2010-04-20",
     :rdf/value    "Added change history"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2011-06-14",
     :rdf/value    "Expanded description and added diagrams"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2010-05-20",
     :rdf/value    "Batch of revisions based on community feedback"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2009-05-19",
     :rdf/value    "Minor changes to improve publishing process"}],
   :skos/historyNote
   [{:dc11/creator "Ian Davis",
     :dc11/date    "2011-06-14",
     :rdf/value    "Added bio:Relationship class and properties"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2010-06-05",
     :rdf/value    "Added biography property"}
    {:dc11/creator "Ian Davis",
     :dc11/date "2010-06-06",
     :rdf/value
     "Added subproperty and equivalent property relations for bio:father, bio:mother and bio:child"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2011-06-10",
     :rdf/value    "Added bio:Performance event"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2011-06-10",
     :rdf/value    "Added bio:Formation and bio:Disbanding events"}
    {:dc11/creator "Alexandre Passant",
     :dc11/date "2011-06-14",
     :rdf/value
     "Added properties for Birth and Death Event types, motivated by JSON serialisations of RDF"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2003-07-28",
     :rdf/value    "Added keywords property"}
    {:dc11/creator "Ian Davis",
     :dc11/date    "2010-05-10",
     :rdf/value    "Major expansion of properties and classes"}],
   :vann/example "http://purl.org/vocab/bio/examples/1",
   :vann/preferredNamespacePrefix "bio",
   :vann/preferredNamespaceUri "http://purl.org/vocab/bio/0.1/",
   :vann/termGroup [:bio/termgroup2
                    :bio/termgroup5
                    :bio/termgroup4
                    :bio/termgroup1
                    :bio/termgroup3]}
  (:refer-clojure :exclude [agent]))

(def Accession
  "The event of a person succeeding to the right to hold regal power. This event is often automatic on the death of the previous monarch and is usually followed by a coronation event."
  {:db/ident :bio/Accession,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The event of a person succeeding to the right to hold regal power. This event is often automatic on the death of the previous monarch and is usually followed by a coronation event.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Accession@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/Accession
                     :dcmitype/Event
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def Adoption
  "The event of creating of a legal parent/child relationship that does not exist biologically."
  {:db/ident :bio/Adoption,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The event of creating of a legal parent/child relationship that does not exist biologically.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Adoption@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/Adoption
                     :dcmitype/Event
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def Annulment
  "The event of declaring a marriage void from the beginning as though it never existed."
  {:db/ident :bio/Annulment,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The event of declaring a marriage void from the beginning as though it never existed.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Annulment@en",
   :rdfs/subClassOf [:bio/GroupEvent
                     :bio/Annulment
                     :dcmitype/Event
                     {:owl/minCardinality 2,
                      :owl/onProperty     :bio/partner,
                      :rdf/type           :owl/Restriction}
                     :bio/Event
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def Assassination
  "The event of a person being deliberately targeted and killed."
  {:db/ident :bio/Assassination,
   :dc11/issued "2010-05-05",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr "The event of a person being deliberately targeted and killed.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Assassination@en",
   :rdfs/subClassOf [:bio/Murder
                     :bio/Assassination
                     :bio/IndividualEvent
                     :dcmitype/Event
                     :bio/Death
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def Baptism
  "The ceremonial event held to admit a person to membership of a Christian church."
  {:db/ident :bio/Baptism,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The ceremonial event held to admit a person to membership of a Christian church.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Baptism@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/Baptism
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :skos/changeNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-05-20",
    :rdf/value
    "Revised comment, replacing 'the Christian church' with 'a Christian church' "},
   :vs/term_status "unstable"})

(def BarMitzvah
  "The ceremonial event held when a Jewish boy reaches age 13."
  {:db/ident :bio/BarMitzvah,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr "The ceremonial event held when a Jewish boy reaches age 13.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "BarMitzvah@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/BarMitzvah
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def BasMitzvah
  "The ceremonial event held when a Jewish girl reaching age 13, also known as \"Bat Mitzvah.\""
  {:db/ident :bio/BasMitzvah,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The ceremonial event held when a Jewish girl reaching age 13, also known as \"Bat Mitzvah.\"@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "BasMitzvah@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/BasMitzvah
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def Birth
  "The event of a person entering into life."
  {:db/ident :bio/Birth,
   :rdf/type :owl/Class,
   :rdfs/comment #voc/lstr "The event of a person entering into life.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Birth@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/Birth
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :skos/changeNote {:dc11/creator "Ian Davis",
                     :dc11/date    "2010-05-04",
                     :rdf/value    "Marked as testing"},
   :vann/example
   {:rdf/type :ov/SchemaExample,
    :rdfs/comment
    "\n        <pre><code>_:e a bio:Birth \n    ; dc:date \"1879-03-14\"\n    ; bio:principal &lt;http://dbpedia.org/resource/Albert_Einstein&gt;\n    ; bio:parent &lt;http://dbpedia.org/resource/Pauline_Koch&gt;\n    ; bio:parent &lt;http://dbpedia.org/resource/Hermann_Einstein&gt;\n    ; bio:place &lt;http://dbpedia.org/resource/Ulm&gt;\n    .</code></pre>\n        ",
    :rdfs/label "The birth of Albert Einstein"},
   :vs/term_status "testing"})

(def Burial
  "The event of interring the remains of a person's body into the ground."
  {:db/ident :bio/Burial,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The event of interring the remains of a person's body into the ground.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Burial@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/Burial
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def Coronation
  "The ceremonial event of a person being invested with regal power to become a monarch."
  {:db/ident :bio/Coronation,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The ceremonial event of a person being invested with regal power to become a monarch.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Coronation@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/Coronation
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def Cremation
  "The event of disposing of the remains of a person's body by fire."
  {:db/ident :bio/Cremation,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The event of disposing of the remains of a person's body by fire.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Cremation@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/Cremation
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vann/example
   {:rdf/type :ov/SchemaExample,
    :rdfs/comment
    "\n        <pre><code>_:e a bio:Cremation \n    ; dc:date \"1955-04-18\"\n    ; bio:principal &lt;http://dbpedia.org/resource/Albert_Einstein&gt;\n    ; bio:place &lt;http://dbpedia.org/resource/Princeton,_New_Jersey&gt;\n    .</code></pre>\n        ",
    :rdfs/label "The cremation of Albert Einstein"},
   :vs/term_status "unstable"})

(def Death
  "The event of a person's life ending."
  {:db/ident :bio/Death,
   :rdf/type :owl/Class,
   :rdfs/comment #voc/lstr "The event of a person's life ending.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Death@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/Death
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :skos/changeNote {:dc11/creator "Ian Davis",
                     :dc11/date    "2010-05-04",
                     :rdf/value    "Marked as a stable term"},
   :vann/example
   {:rdf/type :ov/SchemaExample,
    :rdfs/comment
    "\n        <pre><code>_:e a bio:Death \n    ; dc:date \"1955-04-18\"\n    ; bio:principal &lt;http://dbpedia.org/resource/Albert_Einstein&gt;\n    ; bio:place &lt;http://dbpedia.org/resource/Princeton,_New_Jersey&gt;\n    .</code></pre>\n        ",
    :rdfs/label "The death of Albert Einstein"},
   :vs/term_status "stable"})

(def Demotion
  "The event of a person changing the position they hold with an employer to one with less importance or responsibility."
  {:db/ident :bio/Demotion,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The event of a person changing the position they hold with an employer to one with less importance or responsibility.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Demotion@en",
   :rdfs/subClassOf [:bio/PositionChange
                     :bio/Demotion
                     :dcmitype/Event
                     :bio/IndividualEvent
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def Disbanding
  "The event of a group or organization being disbanded."
  {:db/ident :bio/Disbanding,
   :dc11/issued "2011-06-10",
   :rdf/type :owl/Class,
   :rdfs/comment #voc/lstr
                  "The event of a group or organization being disbanded.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Disbanding@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/Disbanding
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def Dismissal
  "The event of a person involuntarily giving up their office or position. Dismissal is often perceived to be the employee's fault and may be considered disgraceful."
  {:db/ident :bio/Dismissal,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The event of a person involuntarily giving up their office or position. Dismissal is often perceived to be the employee's fault and may be considered disgraceful.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Dismissal@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/Dismissal
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def Divorce
  "The event of legally dissolving a marriage."
  {:db/ident :bio/Divorce,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment #voc/lstr "The event of legally dissolving a marriage.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Divorce@en",
   :rdfs/subClassOf [:bio/GroupEvent
                     :bio/Divorce
                     :dcmitype/Event
                     
                     {:owl/minCardinality 2,
                      :owl/onProperty     :bio/partner,
                      :rdf/type           :owl/Restriction}
                     :bio/Event
                     :event/Event
                     ],
   :vann/example
   {:rdf/type :ov/SchemaExample,
    :rdfs/comment
    "\n        <pre><code>_:e a bio:Divorce \n    ; dc:date \"1919-02-14\"\n    ; bio:partner &lt;http://dbpedia.org/resource/Albert_Einstein&gt;\n    ; bio:partner &lt;http://dbpedia.org/resource/Mileva_Mari%C4%87&gt;\n    ; bio:place &lt;http://dbpedia.org/resource/Zurich&gt;\n    .</code></pre>\n        ",
    :rdfs/label "The divorce of Albert Einstein and Mileva Marić"},
   :vs/term_status "unstable"})

(def Emigration
  "The event of a person leaving their homeland with the intent of residing elsewhere."
  {:db/ident :bio/Emigration,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The event of a person leaving their homeland with the intent of residing elsewhere.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Emigration@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/Emigration
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vann/example
   {:rdf/type :ov/SchemaExample,
    :rdfs/comment
    "\n        <pre><code>_:e a bio:Emigration \n    ; dc:date \"1933\"^^xsd:gYear\n    ; bio:principal &lt;http://dbpedia.org/resource/Albert_Einstein&gt;\n    ; bio:state &lt;http://dbpedia.org/resource/United_States&gt;\n    .</code></pre>\n        ",
    :rdfs/label "Albert Einstein emigrating to the United States"},
   :vs/term_status "unstable"})

(def Employment
  "The event of a person entering an occupational relationship with an employer."
  {:db/ident :bio/Employment,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The event of a person entering an occupational relationship with an employer.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Employment@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/Employment
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def Enrolment
  "The event of a person initiating attendence to a school or other place of learning."
  {:db/ident :bio/Enrolment,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The event of a person initiating attendence to a school or other place of learning.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Enrolment@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/Enrolment
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def Event
  "An event is an occurrence that brings about a change in the state of affairs for one or more people and/or other agents. Events are assumed to occur over a period of time and may not have precise start and end points."
  {:db/ident :bio/Event,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "An event is an occurrence that brings about a change in the state of affairs for one or more people and/or other agents. Events are assumed to occur over a period of time and may not have precise start and end points.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Event@en",
   :rdfs/subClassOf [:event/Event
                     
                     :dcmitype/Event
                     
                     :bio/Event],
   :skos/changeNote [{:dc11/creator "Ian Davis",
                      :dc11/date    "2010-05-20",
                      :rdf/value    "Marked as testing status"}
                     {:dc11/creator "Ian Davis",
                      :dc11/date    "2010-05-04",
                      :rdf/value    "Marked as a stable term"}],
   :skos/historyNote [{:dc11/creator "Ian Davis",
                       :dc11/date "2010-05-20",
                       :rdf/value "Removed subclass of owl-time ProperInteval"}
                      {:dc11/creator "Ian Davis",
                       :dc11/date    "2010-05-04",
                       :rdf/value    "Made equivalent to cyc:Event"}],
   :vann/usageNote
   #voc/lstr
    "This class is intended to describe biographical events, i.e. events in the life of a person.@en",
   :vs/term_status "testing"})

(def Execution
  "The event of a person being deliberately killed as punishment."
  {:db/ident :bio/Execution,
   :dc11/issued "2010-05-05",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The event of a person being deliberately killed as punishment.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Execution@en",
   :rdfs/subClassOf [:bio/Death
                     :bio/Execution
                     :bio/IndividualEvent
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def Formation
  "The event of a group or organization coming into being."
  {:db/ident :bio/Formation,
   :dc11/issued "2011-06-10",
   :rdf/type :owl/Class,
   :rdfs/comment #voc/lstr
                  "The event of a group or organization coming into being.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Formation@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/Formation
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def Funeral
  "The event of marking a person's death with a ceremony."
  {:db/ident :bio/Funeral,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment #voc/lstr
                  "The event of marking a person's death with a ceremony.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Funeral@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/Funeral
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def Graduation
  "The event of a person being awarded educational diplomas or degrees."
  {:db/ident :bio/Graduation,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The event of a person being awarded educational diplomas or degrees.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Graduation@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/Graduation
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vann/example
   {:rdf/type :ov/SchemaExample,
    :rdfs/comment
    "\n        <pre><code>_:e a bio:Graduation \n    ; dc:date \"1905\"^^xsd:gYear\n    ; bio:principal &lt;http://dbpedia.org/resource/Albert_Einstein&gt;\n    ; bio:organization &lt;http://dbpedia.org/resource/University_of_Zurich&gt;\n    .</code></pre>\n        ",
    :rdfs/label
    "Albert Einstein receiving his Doctorate from the University of Zurich"},
   :vs/term_status "unstable"})

(def GroupEvent
  "A type of event that is principally about one or more agents and their partnership. Other agents may be involved but the event is most significant for the partner agent."
  {:db/ident :bio/GroupEvent,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A type of event that is principally about one or more agents and their partnership. Other agents may be involved but the event is most significant for the partner agent.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Group Event@en",
   :rdfs/subClassOf [{:owl/minCardinality 2,
                      :owl/onProperty     :bio/partner,
                      :rdf/type           :owl/Restriction}
                     :bio/Event
                     :bio/GroupEvent
                     :dcmitype/Event
                     
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def Imprisonment
  "The event of a person being detained in a jail or prison."
  {:db/ident :bio/Imprisonment,
   :dc11/issued "2010-05-04",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr "The event of a person being detained in a jail or prison.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Imprisonment@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/Imprisonment
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def Inauguration
  "The ceremonial event marking the beginning of a person's term of office as a leader."
  {:db/ident :bio/Inauguration,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The ceremonial event marking the beginning of a person's term of office as a leader.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Inauguration@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/Inauguration
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def IndividualEvent
  "A type of event that is principally about a single person, group or organization. Other agents may be involved but the event is most significant for the principal agent."
  {:db/ident :bio/IndividualEvent,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A type of event that is principally about a single person, group or organization. Other agents may be involved but the event is most significant for the principal agent.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Individual Event@en",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :bio/Event
                     :bio/IndividualEvent
                     :dcmitype/Event
                     
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def Interval
  "A extended interval of time related to a particular state of affairs, such as the lifespan of a person or a period of employment."
  {:db/ident :bio/Interval,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A extended interval of time related to a particular state of affairs, such as the lifespan of a person or a period of employment.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Interval@en",
   :rdfs/subClassOf [:time/ProperInterval :bio/Interval],
   :vs/term_status "unstable"})

(def Investiture
  "The ceremonial event of a person taking a public office or honour."
  {:db/ident :bio/Investiture,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The ceremonial event of a person taking a public office or honour.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Investiture@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/Investiture
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def Marriage
  "The event of creating uniting the participants into a new family unit, sometimes accompanied by a formal wedding ceremony. This is intended to cover a broad range of marriages including those given formal legal standing, common-law, or by convention. It is not restricted to marriages of two people of the opposite gender, but also includes polygamous and same-sex unions."
  {:db/ident :bio/Marriage,
   :owl/equivalentClass
   "http://sw.opencyc.org/2009/04/07/concept/en/WeddingEvent_Generic",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The event of creating uniting the participants into a new family unit, sometimes accompanied by a formal wedding ceremony. This is intended to cover a broad range of marriages including those given formal legal standing, common-law, or by convention. It is not restricted to marriages of two people of the opposite gender, but also includes polygamous and same-sex unions.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Marriage@en",
   :rdfs/subClassOf [:bio/GroupEvent
                     :bio/Marriage
                     :dcmitype/Event
                     
                     {:owl/minCardinality 2,
                      :owl/onProperty     :bio/partner,
                      :rdf/type           :owl/Restriction}
                     :bio/Event
                     :event/Event
                     ],
   :skos/changeNote {:dc11/creator "Ian Davis",
                     :dc11/date    "2010-05-04",
                     :rdf/value    "Marked as a stable term"},
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date "2010-05-04",
                      :rdf/value "Made equivalent to cyc:WeddingEvent_Generic"},
   :vann/example
   {:rdf/type :ov/SchemaExample,
    :rdfs/comment
    "\n        <pre><code>_:e a bio:Marriage \n    ; dc:date \"1903\"\n    ; bio:partner &lt;http://dbpedia.org/resource/Albert_Einstein&gt;\n    ; bio:partner &lt;http://dbpedia.org/resource/Mileva_Mari%C4%87&gt;\n    ; bio:place &lt;http://dbpedia.org/resource/Bern&gt;\n    .</code></pre>\n        ",
    :rdfs/label "The marriage of Albert Einstein and Mileva Marić"},
   :vs/term_status "stable"})

(def Murder
  "The event of a person being killed unlawfully with intent by the killer."
  {:db/ident :bio/Murder,
   :dc11/issued "2010-05-05",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The event of a person being killed unlawfully with intent by the killer.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Murder@en",
   :rdfs/subClassOf [:bio/Death
                     :bio/Murder
                     :bio/IndividualEvent
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def NameChange
  "The event of a person changing their name."
  {:db/ident         :bio/NameChange,
   :dc11/issued      "2010-05-03",
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "The event of a person changing their name.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label       #voc/lstr "Change of Name@en",
   :rdfs/subClassOf  [:bio/IndividualEvent
                      :bio/NameChange
                      :dcmitype/Event
                      
                      :bio/Event
                      {:owl/cardinality 1,
                       :owl/onProperty  :bio/principal,
                       :rdf/type        :owl/Restriction}
                      :event/Event
                      ],
   :vs/term_status   "unstable"})

(def Naturalization
  "The event of a person obtaining citizenship. Note that the place the naturalization event occurs at may be different from the state the person is obtaining citizenship of."
  {:db/ident :bio/Naturalization,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The event of a person obtaining citizenship. Note that the place the naturalization event occurs at may be different from the state the person is obtaining citizenship of. @en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Naturalization@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/Naturalization
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vann/example
   {:rdf/type :ov/SchemaExample,
    :rdfs/comment
    "\n        <pre><code>_:e a bio:Emigration \n    ; dc:date \"1940\"\n    ; bio:principal &lt;http://dbpedia.org/resource/Albert_Einstein&gt;\n    ; bio:state &lt;http://dbpedia.org/resource/United_States&gt;\n    .</code></pre>\n        ",
    :rdfs/label "Albert Einstein becoming a citizen of the United States"},
   :vs/term_status "unstable"})

(def Ordination
  "The ceremonial event held when a person receives authority to act in religious matters."
  {:db/ident :bio/Ordination,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The ceremonial event held when a person receives authority to act in religious matters.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Ordination@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/Ordination
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def Performance
  "The event of an individual or a group of performers performing. Examples include concerts, plays, recitals, recordings, busking etc."
  {:db/ident :bio/Performance,
   :dc11/issued "2011-06-12",
   :owl/equivalentClass "http://purl.org/ontology/mo/Performance",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The event of an individual or a group of performers performing. Examples include concerts, plays, recitals, recordings, busking etc.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Performance@en",
   :rdfs/subClassOf [:bio/GroupEvent
                     :bio/Performance
                     :dcmitype/Event
                     
                     {:owl/minCardinality 2,
                      :owl/onProperty     :bio/partner,
                      :rdf/type           :owl/Restriction}
                     :bio/Event
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def PositionChange
  "The event of a person changing the position they hold with an employer."
  {:db/ident :bio/PositionChange,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The event of a person changing the position they hold with an employer.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Change of Position@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/PositionChange
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def Promotion
  "The event of a person changing the position they hold with an employer to one with more importance or responsibility."
  {:db/ident :bio/Promotion,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The event of a person changing the position they hold with an employer to one with more importance or responsibility.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Promotion@en",
   :rdfs/subClassOf [:bio/PositionChange
                     :bio/Promotion
                     :dcmitype/Event
                     :bio/IndividualEvent
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def Redundancy
  "The event of a person involuntarily giving up an office or position that is no longer needed. Redundancy is usually perceived to be the employer's fault and is usually due to conditions outside of the employee's control."
  {:db/ident :bio/Redundancy,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The event of a person involuntarily giving up an office or position that is no longer needed. Redundancy is usually perceived to be the employer's fault and is usually due to conditions outside of the employee's control.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Redundancy@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/Redundancy
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def Relationship
  "A particular type of connection existing between people, groups or organizations related to or having dealings with each other."
  {:db/ident :bio/Relationship,
   :dc11/issued "2011-06-14",
   :owl/equivalentClass :rel/Relationship,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A particular type of connection existing between people, groups or organizations related to or having dealings with each other.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Agent Relationship@en",
   :vs/term_status "unstable"})

(def Resignation
  "The event of a person voluntarily giving up or quitting their office or position."
  {:db/ident :bio/Resignation,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The event of a person voluntarily giving up or quitting their office or position.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Resignation@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/Resignation
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def Retirement
  "The event of a person exiting an occupational relationship with an employer after a qualifying time period. In many cultures retirement is expected and even required once the person reaches a particular age."
  {:db/ident :bio/Retirement,
   :dc11/issued "2010-05-03",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "The event of a person exiting an occupational relationship with an employer after a qualifying time period. In many cultures retirement is expected and even required once the person reaches a particular age.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Retirement@en",
   :rdfs/subClassOf [:bio/IndividualEvent
                     :bio/Retirement
                     :dcmitype/Event
                     
                     :bio/Event
                     {:owl/cardinality 1,
                      :owl/onProperty  :bio/principal,
                      :rdf/type        :owl/Restriction}
                     :event/Event
                     ],
   :vs/term_status "unstable"})

(def agent
  "A person, organization or group that plays a role in an event."
  {:db/ident :bio/agent,
   :dc11/issued "2010-05-05",
   :label/plural #voc/lstr "Agents@en",
   :owl/inverseOf :bio/event,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #voc/lstr
    "A person, organization or group that plays a role in an event.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Agent@en",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf [:owl/differentFrom :bio/agent]})

(def biography
  "An extended description or account of someone's life."
  {:db/ident :bio/biography,
   :dc11/issued "2010-06-05",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr
                  "An extended description or account of someone's life.@en",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Biography@en",
   :rdfs/subPropertyOf :bio/biography,
   :vann/usageNote
   "<p>It is expected that the value of this property is either a literal formatted with HTML markup or a pointer to an HTML document.</p>",
   :vs/term_status "unstable"})

(def birth
  "An birth event associated with a person, group or organization."
  {:db/ident :bio/birth,
   :label/plural #voc/lstr "Birth Events@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "An birth event associated with a person, group or organization.@en",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Birth Event@en",
   :rdfs/range :bio/Birth,
   :rdfs/subPropertyOf [:bio/event :owl/differentFrom :bio/birth],
   :skos/historyNote {:dc11/creator "Alexandre Passant",
                      :dc11/date    "2011-07-12",
                      :rdf/value    "Proposed addition of the property"}})

(def child
  "A biological child of a person."
  {:db/ident :bio/child,
   :dc11/issued "2010-05-03",
   :label/plural #voc/lstr "Children@en",
   :owl/equivalentProperty :rel/parentOf,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment #voc/lstr "A biological child of a person. @en",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Child@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :bio/child],
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-06-06",
    :rdf/value
    "Made equivalent to rel:parentOf on suggestion of Gautier Poupeau"},
   :vann/usageNote
   "Note that this is a strict definition of child that does not include adopted children, step-children or similar non-biological relationships. The <a href=\"http://purl.org/vocab/relationship\">Relationship</a> vocabulary may be more suitable for broader types of parent/child relation.",
   :vs/term_status "unstable"})

(def concludingEvent
  "An event that marks the end of an interval and/or relationship. The event changes of the state of affairs that held during the interval. For example a period of study may be concluded by a Graduation event."
  {:db/ident :bio/concludingEvent,
   :dc11/issued "2010-05-06",
   :label/plural #voc/lstr "Concluding Event@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "An event that marks the end of an interval and/or relationship. The event changes of the state of affairs that held during the interval. For example a period of study may be concluded by a Graduation event.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Concluding Event@en",
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf [:owl/differentFrom :bio/concludingEvent]})

(def concurrentEvent
  "An event that occurs while this event is occurring. The events need not start or conclude at the same times."
  {:db/ident :bio/concurrentEvent,
   :dc11/issued "2010-05-06",
   :label/plural #voc/lstr "Concurrent Events@en",
   :rdf/type [:owl/SymmetricProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "An event that occurs while this event is occurring. The events need not start or conclude at the same times.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Concurrent Event@en",
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf [:owl/differentFrom :bio/concurrentEvent]})

(def date
  "The date at which an event occurred."
  {:db/ident :bio/date,
   :label/plural #voc/lstr "Dates@en",
   :rdf/type :rdf/Property,
   :rdfs/comment #voc/lstr "The date at which an event occurred.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Date@en",
   :rdfs/subPropertyOf [:dc11/date :bio/date],
   :skos/changeNote [{:dc11/creator "Ian Davis",
                      :dc11/date    "2010-05-04",
                      :rdf/value    "Marked as a stable term"}
                     {:dc11/creator "Ian Davis",
                      :dc11/date    "2010-05-03",
                      :rdf/value    "Added a plural label"}],
   :vann/usageNote
   "<p>The date should be formatted as specified in <a href=\"http://www.w3.org/TR/NOTE-datetime\">ISO8601</a>.\n    For example: 2003-03-15 corresponds to the 15th March 2003, and 2003-03-15T13:21-05:00 corresponds to 15th March 2003, 8:21 am, US Eastern Standard Time.</p>",
   :vs/term_status "stable"})

(def death
  "An death event associated with a person, group or organization."
  {:db/ident :bio/death,
   :label/plural #voc/lstr "Death Events@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "An death event associated with a person, group or organization.@en",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Death Event@en",
   :rdfs/range :bio/Death,
   :rdfs/subPropertyOf [:owl/differentFrom :bio/event :bio/death],
   :skos/historyNote {:dc11/creator "Alexandre Passant",
                      :dc11/date    "2011-07-12",
                      :rdf/value    "Proposed addition of the property"}})

(def employer
  "An agent that is involved in an event as an employer."
  {:db/ident :bio/employer,
   :dc11/issued "2010-05-05",
   :label/plural #voc/lstr "Employers@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment #voc/lstr
                  "An agent that is involved in an event as an employer.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Employer@en",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf [:bio/agent :bio/employer :owl/differentFrom]})

(def event
  "An event associated with a person, group or organization."
  {:db/ident :bio/event,
   :label/plural #voc/lstr "Life Events@en",
   :owl/inverseOf :bio/agent,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr "An event associated with a person, group or organization.@en",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Life Event@en",
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf [:owl/differentFrom :bio/event],
   :skos/changeNote {:dc11/creator "Ian Davis",
                     :dc11/date    "2010-05-03",
                     :rdf/value    "Added a plural label"},
   :skos/historyNote [{:dc11/creator "Ian Davis",
                       :dc11/date    "2011-06-14",
                       :rdf/value    "Changed domain to foaf:Agent"}
                      {:dc11/creator "Ian Davis",
                       :dc11/date "2010-05-03",
                       :rdf/value "Made a subproperty of owl:differentFrom"}]})

(def eventInterval
  "The interval during which the event occurs. This interval represents the exact interval of occurence for an event, it starts at the moment the event commences and finishes when the event concludes. In other words both the event and the interval start at the same instant of time and extend for the same duration."
  {:db/ident :bio/eventInterval,
   :dc11/issued "2010-06-05",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "The interval during which the event occurs. This interval represents the exact interval of occurence for an event, it starts at the moment the event commences and finishes when the event concludes. In other words both the event and the interval start at the same instant of time and extend for the same duration.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Event Interval@en",
   :rdfs/range :bio/Interval,
   :rdfs/subPropertyOf :bio/eventInterval,
   :vs/term_status "unstable"})

(def father
  "The biological father of a person, also known as the genitor."
  {:db/ident :bio/father,
   :dc11/issued "2010-05-03",
   :rdf/type [:owl/ObjectProperty :rdf/Property :owl/FunctionalProperty],
   :rdfs/comment
   #voc/lstr "The biological father of a person, also known as the genitor.@en",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Father@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:rel/childOf :owl/differentFrom :bio/father],
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-06-06",
    :rdf/value
    "Made subproperty of rel:childOf on suggestion of Gautier Poupeau"},
   :vann/usageNote
   "Note that this is a strict definition of father that does not include non-biological relationships. The <a href=\"http://purl.org/vocab/relationship\">Relationship</a> vocabulary may be more suitable for broader types of parent/child relation.",
   :vs/term_status "unstable"})

(def followingEvent
  "An event that starts at some time after this event."
  {:db/ident :bio/followingEvent,
   :dc11/issued "2010-05-06",
   :label/plural #voc/lstr "Following Events@en",
   :rdf/type [:owl/ObjectProperty :owl/TransitiveProperty :rdf/Property],
   :rdfs/comment #voc/lstr
                  "An event that starts at some time after this event.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Following Event@en",
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf [:owl/differentFrom :bio/followingEvent]})

(def immediatelyFollowingEvent
  "An event that starts immediately after this event."
  {:db/ident           :bio/immediatelyFollowingEvent,
   :dc11/issued        "2010-05-06",
   :label/plural       #voc/lstr "Immediately Following Events@en",
   :rdf/type           [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment       #voc/lstr
                        "An event that starts immediately after this event.@en",
   :rdfs/domain        :bio/Event,
   :rdfs/isDefinedBy   "http://purl.org/vocab/bio/0.1/",
   :rdfs/label         #voc/lstr "Immediately Following Event@en",
   :rdfs/range         :bio/Event,
   :rdfs/subPropertyOf [:owl/differentFrom
                        :bio/followingEvent
                        :bio/immediatelyFollowingEvent]})

(def immediatelyPrecedingEvent
  "An event that occurs and concludes immediately before this event."
  {:db/ident :bio/immediatelyPrecedingEvent,
   :dc11/issued "2010-05-06",
   :label/plural #voc/lstr "Immediately Preceding Events@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #voc/lstr
    "An event that occurs and concludes immediately before this event.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Immediately Preceding Event@en",
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf
   [:owl/differentFrom :bio/precedingEvent :bio/immediatelyPrecedingEvent]})

(def initiatingEvent
  "An event that marks the start of an interval and/or relationship. The event contributes to and/or causes of the state of affairs that hold during the interval. For example a period of study may be initiated by an Enrolment event."
  {:db/ident :bio/initiatingEvent,
   :dc11/issued "2010-05-06",
   :label/plural #voc/lstr "Initiating Event@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "An event that marks the start of an interval and/or relationship. The event contributes to and/or causes of the state of affairs that hold during the interval. For example a period of study may be initiated by an Enrolment event.@en",
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Initiating Event@en",
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf [:owl/differentFrom :bio/initiatingEvent]})

(def interval
  "The interval during which the relationship persists."
  {:db/ident :bio/interval,
   :dc11/issued "2010-06-05",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment #voc/lstr
                  "The interval during which the relationship persists.@en",
   :rdfs/domain :bio/Relationship,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Relationship Interval@en",
   :rdfs/range :bio/Interval,
   :rdfs/subPropertyOf :bio/interval,
   :vs/term_status "unstable"})

(def keywords
  "A comma delimited list of key words that describe a person."
  {:db/ident :bio/keywords,
   :dc11/issued "2003-07-28",
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr "A comma delimited list of key words that describe a person.@en",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Key Words@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:dc11/subject :bio/keywords],
   :skos/changeNote {:dc11/creator "Ian Davis",
                     :dc11/date    "2010-05-04",
                     :rdf/value    "Marked as a stable term"},
   :skos/historyNote {:dc11/creator "Ian Davis",
                      :dc11/date "2010-05-03",
                      :rdf/value "Declared that this is a datatype property"},
   :vs/term_status "stable"})

(def mother
  "The biological mother of a person, also known as the genetrix."
  {:db/ident :bio/mother,
   :dc11/issued "2010-05-03",
   :rdf/type [:owl/ObjectProperty :rdf/Property :owl/FunctionalProperty],
   :rdfs/comment
   #voc/lstr
    "The biological mother of a person, also known as the genetrix.@en",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Mother@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:owl/differentFrom :rel/childOf :bio/mother],
   :skos/historyNote
   {:dc11/creator "Ian Davis",
    :dc11/date "2010-06-06",
    :rdf/value
    "Made subproperty of rel:childOf on suggestion of Gautier Poupeau"},
   :vann/usageNote
   "Note that this is a strict definition of mother that does not include non-biological relationships. The <a href=\"http://purl.org/vocab/relationship\">Relationship</a> vocabulary may be more suitable for broader types of parent/child relation.",
   :vs/term_status "unstable"})

(def officiator
  "A person that officiates at a ceremonial event."
  {:db/ident           :bio/officiator,
   :dc11/issued        "2010-05-05",
   :label/plural       #voc/lstr "Officiators@en",
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       #voc/lstr
                        "A person that officiates at a ceremonial event.@en",
   :rdfs/domain        :bio/Event,
   :rdfs/isDefinedBy   "http://purl.org/vocab/bio/0.1/",
   :rdfs/label         #voc/lstr "Officiator@en",
   :rdfs/range         :foaf/Person,
   :rdfs/subPropertyOf [:bio/agent :bio/officiator :owl/differentFrom]})

(def olb
  "A one-line biography of the person."
  {:db/ident           :bio/olb,
   :rdf/type           [:rdf/Property :owl/DatatypeProperty],
   :rdfs/comment       #voc/lstr "A one-line biography of the person.@en",
   :rdfs/domain        :foaf/Person,
   :rdfs/isDefinedBy   "http://purl.org/vocab/bio/0.1/",
   :rdfs/label         #voc/lstr "One-line bio@en",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :bio/olb,
   :skos/changeNote    {:dc11/creator "Ian Davis",
                        :dc11/date    "2010-05-04",
                        :rdf/value    "Marked as a stable term"},
   :skos/historyNote   {:dc11/creator "Ian Davis",
                        :dc11/date "2010-05-03",
                        :rdf/value "Declared that this is a datatype property"},
   :vs/term_status     "stable"})

(def organization
  "An organization that plays a role in an event."
  {:db/ident           :bio/organization,
   :dc11/issued        "2010-05-05",
   :label/plural       #voc/lstr "Organizations@en",
   :rdf/type           [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment       #voc/lstr
                        "An organization that plays a role in an event.@en",
   :rdfs/domain        :bio/Event,
   :rdfs/isDefinedBy   "http://purl.org/vocab/bio/0.1/",
   :rdfs/label         #voc/lstr "Organization@en",
   :rdfs/range         :foaf/Person,
   :rdfs/subPropertyOf [:bio/agent :bio/organization :owl/differentFrom]})

(def parent
  "A person that takes the parent role in an event."
  {:db/ident           :bio/parent,
   :dc11/issued        "2010-05-05",
   :label/plural       #voc/lstr "Parents@en",
   :rdf/type           [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment       #voc/lstr
                        "A person that takes the parent role in an event.@en",
   :rdfs/domain        :bio/Event,
   :rdfs/isDefinedBy   "http://purl.org/vocab/bio/0.1/",
   :rdfs/label         #voc/lstr "Parent@en",
   :rdfs/range         :foaf/Person,
   :rdfs/subPropertyOf [:bio/agent :bio/parent :owl/differentFrom]})

(def participant
  "A person, group or organization that participates in a relationship for some time."
  {:db/ident :bio/participant,
   :dc11/issued "2011-06-14",
   :label/plural #voc/lstr "Participants@en",
   :owl/equivalentProperty :rel/participant,
   :owl/inverseOf :bio/relationship,
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #voc/lstr
    "A person, group or organization that participates in a relationship for some time.@en",
   :rdfs/domain :bio/Relationship,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Participant@en",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf [:owl/differentFrom :bio/participant]})

(def partner
  "A person that is involved in a event as a partner in a relationship."
  {:db/ident :bio/partner,
   :dc11/issued "2010-05-05",
   :label/plural #voc/lstr "Partners@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "A person that is involved in a event as a partner in a relationship.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Partner@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:bio/agent :bio/partner :owl/differentFrom]})

(def place
  "The place at which an event occurred."
  {:db/ident           :bio/place,
   :label/plural       #voc/lstr "Places@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #voc/lstr "The place at which an event occurred.@en",
   :rdfs/domain        :bio/Event,
   :rdfs/isDefinedBy   "http://purl.org/vocab/bio/0.1/",
   :rdfs/label         #voc/lstr "Place@en",
   :rdfs/subPropertyOf :bio/place,
   :skos/changeNote    [{:dc11/creator "Ian Davis",
                         :dc11/date    "2010-05-04",
                         :rdf/value    "Marked as a stable term"}
                        {:dc11/creator "Ian Davis",
                         :dc11/date    "2010-05-03",
                         :rdf/value    "Added a plural label"}],
   :vs/term_status     "stable"})

(def position
  "The employment position or public office involved in an event."
  {:db/ident :bio/position,
   :dc11/issued "2010-05-05",
   :label/plural #voc/lstr "Positions@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "The employment position or public office involved in an event.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Position@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:bio/agent :bio/position :owl/differentFrom],
   :vs/term_status "unstable"})

(def precedingEvent
  "An event that occurs and concludes at some time before this event."
  {:db/ident :bio/precedingEvent,
   :dc11/issued "2010-05-06",
   :label/plural #voc/lstr "Preceding Events@en",
   :rdf/type [:owl/TransitiveProperty :owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "An event that occurs and concludes at some time before this event.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Preceding Event@en",
   :rdfs/range :bio/Event,
   :rdfs/subPropertyOf [:owl/differentFrom :bio/precedingEvent]})

(def principal
  "A person that takes the primary and most important role in an event. For example the principal in a Birth event would be the child being born and the principal in a Burial event would be the deceased person."
  {:db/ident :bio/principal,
   :dc11/issued "2010-05-05",
   :label/plural #voc/lstr "Principals@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #voc/lstr
    "A person that takes the primary and most important role in an event. For example the principal in a Birth event would be the child being born and the principal in a Burial event would be the deceased person.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Principal@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:bio/agent :bio/principal :owl/differentFrom]})

(def relationship
  "A relationship that a person, group or organization participates in for some time."
  {:db/ident :bio/relationship,
   :dc11/issued "2011-06-14",
   :label/plural #voc/lstr "Relationships@en",
   :owl/equivalentProperty :rel/participantIn,
   :owl/inverseOf :bio/participant,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "A relationship that a person, group or organization participates in for some time.@en",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Relationship@en",
   :rdfs/range :bio/Relationship,
   :rdfs/subPropertyOf [:owl/differentFrom :bio/relationship]})

(def spectator
  "A person that is present at and observes the occurrence of at least part of an event."
  {:db/ident :bio/spectator,
   :dc11/issued "2010-05-05",
   :label/plural #voc/lstr "Spectators@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "A person that is present at and observes the occurrence of at least part of an event.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Spectator@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf [:bio/agent :bio/spectator :owl/differentFrom]})

(def state
  "A country or independent territory that is involved in an event."
  {:db/ident :bio/state,
   :dc11/issued "2010-05-05",
   :label/plural #voc/lstr "States@en",
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #voc/lstr
    "A country or independent territory that is involved in an event.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "State@en",
   :rdfs/subPropertyOf [:bio/agent :bio/state :owl/differentFrom]})

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
   :rdfs/label #voc/lstr "Properties of a person@en"})

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
   :rdfs/label #voc/lstr "Types of event@en"})

(def termgroup3
  "Properties of an event"
  {:db/ident   :bio/termgroup3,
   :rdf/_1     :bio/date,
   :rdf/_2     :bio/place,
   :rdf/_3     :bio/state,
   :rdf/_4     :bio/position,
   :rdf/type   :rdf/Bag,
   :rdfs/label #voc/lstr "Properties of an event@en"})

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
   :rdfs/label #voc/lstr "Properties that relate an event to an agent@en"})

(def termgroup5
  "Properties that relate an event to another event"
  {:db/ident   :bio/termgroup5,
   :rdf/_1     :bio/concurrentEvent,
   :rdf/_2     :bio/followingEvent,
   :rdf/_3     :bio/precedingEvent,
   :rdf/_4     :bio/immediatelyFollowingEvent,
   :rdf/_5     :bio/immediatelyPrecedingEvent,
   :rdf/type   :rdf/Bag,
   :rdfs/label #voc/lstr "Properties that relate an event to another event@en"})

(def witness
  "A person that witnesses and can bear testimony to the occurrence of an event."
  {:db/ident :bio/witness,
   :dc11/issued "2010-05-05",
   :label/plural #voc/lstr "Witnesses@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/comment
   #voc/lstr
    "A person that witnesses and can bear testimony to the occurrence of an event.@en",
   :rdfs/domain :bio/Event,
   :rdfs/isDefinedBy "http://purl.org/vocab/bio/0.1/",
   :rdfs/label #voc/lstr "Witness@en",
   :rdfs/range :foaf/Person,
   :rdfs/subPropertyOf
   [:bio/spectator :bio/witness :owl/differentFrom :bio/agent]})

;; (def ^{:private true} Event
;;   {:db/ident        :dcmitype/Event,
;;    :rdf/type        :rdfs/Class,
;;    :rdfs/subClassOf :dcmitype/Event})

;; (def ^{:private true} Event
;;   {:db/ident        :event/Event,
;;    :rdf/type        :rdfs/Class,
;;    :rdfs/subClassOf :event/Event})

;; (def ^{:private true} Person
;;   {:db/ident :foaf/Person,
;;    :owl/equivalentClass {:owl/intersectionOf [{:owl/cardinality 1,
;;                                                :owl/onProperty :bio/father,
;;                                                :rdf/type :owl/Restriction}
;;                                               {:owl/cardinality 1,
;;                                                :owl/onProperty :bio/mother,
;;                                                :rdf/type :owl/Restriction}],
;;                          :rdf/type :owl/Class},
;;    :rdf/type :owl/Class})

;; (def ^{:private true} childOf
;;   {:db/ident :rel/childOf,
;;    :rdf/type :rdf/Property,
;;    :rdfs/subPropertyOf :rel/childOf})

;; (def ^{:private true} ProperInterval
;;   {:db/ident        :time/ProperInterval,
;;    :rdf/type        :rdfs/Class,
;;    :rdfs/subClassOf :time/ProperInterval})
