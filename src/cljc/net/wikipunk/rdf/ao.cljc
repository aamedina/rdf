(ns net.wikipunk.rdf.ao
  "The Association Ontology specification provides basic properties \nfor describing specific associations to something, e.g. a context, an occasion, a genre or a mood, and enables furthermore, a mechanism to \nlike/rate and feedback these associations in context to something on/ for the Semantic Web. This document contains a RDF description \nof the Association Ontology."
  {:dc11/creator [{:rdfa/uri "http://foaf.me/zazi#me"}
                  {:rdfa/uri "http://tobyinkster.co.uk/#i"}],
   :dc11/date #xsd/dateTime #inst "2010-09-13T12:59:52.000+00:00",
   :dc11/description
   #rdf/langString
    "The Association Ontology specification provides basic properties \nfor describing specific associations to something, e.g. a context, an occasion, a genre or a mood, and enables furthermore, a mechanism to \nlike/rate and feedback these associations in context to something on/ for the Semantic Web. This document contains a RDF description \nof the Association Ontology.@en",
   :dc11/title #rdf/langString "The Association Ontology@en",
   :dcat/downloadURL "https://purl.org/ontology/ao/associationontology.owl",
   :owl/imports [{:rdfa/uri "http://purl.org/dc/terms/"}
                 {:rdfa/uri "http://purl.org/stuff/rev"}
                 {:rdfa/uri "http://purl.org/dc/elements/1.1/"}
                 {:rdfa/uri "http://www.w3.org/2003/06/sw-vocab-status/ns"}
                 {:rdfa/uri "http://purl.org/ontology/similarity/"}
                 {:rdfa/uri "http://xmlns.com/foaf/0.1/"}
                 {:rdfa/uri "http://purl.org/NET/c4dm/event.owl"}],
   :owl/versionInfo #xsd/decimal 0.4M,
   :rdf/ns-prefix-map {"ao" "http://purl.org/ontology/ao/core#",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "event" "http://purl.org/NET/c4dm/event.owl#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "rev" "http://purl.org/stuff/rev#",
                       "sim" "http://purl.org/ontology/similarity/",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "ao",
   :rdfa/uri "http://purl.org/ontology/ao/core#"}
  (:refer-clojure :exclude [time]))

(def LikeableAssociation
  "A likeable association. That means this association type is intended to be used for voting (ao:likeminded), \nfeedbacking (rev:Feedback), reviewing (e.g. rev:rating) an association statement (related by ao:included_association) in the \ncontext of something."
  {:db/ident :ao/LikeableAssociation,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "A likeable association. That means this association type is intended to be used for voting (ao:likeminded), \nfeedbacking (rev:Feedback), reviewing (e.g. rev:rating) an association statement (related by ao:included_association) in the \ncontext of something.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/ao/core#"},
   :rdfs/label #rdf/langString "Likeable Association@en",
   :rdfs/subClassOf [:rev/Review :sim/Association],
   :vs/term_status #rdf/langString "testing@en"})

(def activity
  "An activity, which is associated to an individual, e.g. dancing, sleeping, driving."
  {:db/ident :ao/activity,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An activity, which is associated to an individual, e.g. dancing, sleeping, driving.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/ao/core#"},
   :rdfs/label #rdf/langString "has activity@en",
   :rdfs/subPropertyOf :ao/context,
   :vs/term_status #rdf/langString "testing@en"})

(def application
  "An application, which is associated to an individual, e.g. a music player to a music track it's currently playing back."
  {:db/ident :ao/application,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An application, which is associated to an individual, e.g. a music player to a music track it's currently playing back.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/ao/core#"},
   :rdfs/label #rdf/langString "has application@en",
   :rdfs/subPropertyOf :ao/context,
   :vs/term_status #rdf/langString "testing@en"})

(def context
  "A property to associate any environmental context to an individual, e.g. a location, a time or an activity. Hence, this property is intended that sub properties should be created from it."
  {:db/ident :ao/context,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A property to associate any environmental context to an individual, e.g. a location, a time or an activity. Hence, this property is intended that sub properties should be created from it.@en",
   :rdfs/domain :owl/Thing,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/ao/core#"},
   :rdfs/label #rdf/langString "has context@en",
   :vs/term_status #rdf/langString "testing@en"})

(def device
  "A device, which is associated with an individual, e.g. a CD player with a CD it's currently playing back."
  {:db/ident :ao/device,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A device, which is associated with an individual, e.g. a CD player with a CD it's currently playing back.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/ao/core#"},
   :rdfs/label #rdf/langString "has device@en",
   :rdfs/subPropertyOf :ao/context,
   :vs/term_status #rdf/langString "testing@en"})

(def genre
  "An genre of something."
  {:db/ident           :ao/genre,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString "An genre of something.@en",
   :rdfs/domain        :owl/Thing,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/ao/core#"},
   :rdfs/label         #rdf/langString "has genre@en",
   :rdfs/subPropertyOf :dcterms/subject,
   :vs/term_status     #rdf/langString "unstable@en"})

(def included_association
  "This property could be used to compose association statements or to reuse them, e.g. to make them likeable \nin a specific context."
  {:db/ident :ao/included_association,
   :owl/inverseOf {:rdf/type   :owl/ObjectProperty,
                   :rdfs/label "is included association of"},
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "This property could be used to compose association statements or to reuse them, e.g. to make them likeable \nin a specific context.@en",
   :rdfs/domain :sim/Association,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/ao/core#"},
   :rdfs/label #rdf/langString "has included association@en",
   :rdfs/range :sim/Association,
   :vs/term_status #rdf/langString "testing@en"})

(def likeminded
  "Associates likeminded people to an association, which they like/ agree with."
  {:db/ident :ao/likeminded,
   :owl/inverseOf {:rdf/type   :owl/ObjectProperty,
                   :rdfs/label "is likeminded of"},
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Associates likeminded people to an association, which they like/ agree with.",
   :rdfs/domain :sim/Association,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/ao/core#"},
   :rdfs/label "has likeminded",
   :rdfs/range :foaf/Agent,
   :vs/term_status "testing"})

(def location
  "A location, which is associated to an individual, e.g. my house, my country, my current whereabouts."
  {:db/ident :ao/location,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A location, which is associated to an individual, e.g. my house, my country, my current whereabouts.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/ao/core#"},
   :rdfs/label #rdf/langString "has location@en",
   :rdfs/subPropertyOf :ao/context,
   :vs/term_status #rdf/langString "testing@en"})

(def mood
  "A mood that should be created by something."
  {:db/ident           :ao/mood,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString
                        "A mood that should be created by something.@en",
   :rdfs/domain        :owl/Thing,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/ao/core#"},
   :rdfs/label         #rdf/langString "has mood@en",
   :rdfs/subPropertyOf :dcterms/subject,
   :vs/term_status     #rdf/langString "unstable@en"})

(def occasion
  "An occasion for which something was created."
  {:db/ident           :ao/occasion,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString
                        "An occasion for which something was created.@en",
   :rdfs/domain        :owl/Thing,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/ao/core#"},
   :rdfs/label         #rdf/langString "has occassion@en",
   :rdfs/subPropertyOf :dcterms/subject,
   :vs/term_status     #rdf/langString "unstable@en"})

(def time
  "A time, which is associated to an individual, e.g. morning, afternoon, evening."
  {:db/ident :ao/time,
   :owl/equivalentProperty :dc11/date,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A time, which is associated to an individual, e.g. morning, afternoon, evening.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/ao/core#"},
   :rdfs/label #rdf/langString "has time@en",
   :rdfs/subPropertyOf :ao/context,
   :vs/term_status #rdf/langString "testing@en"})

(def used_application
  "An application that is related to an event, e.g. a iTunes to a play back event of a music track."
  {:db/ident :ao/used_application,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #rdf/langString
    "An application that is related to an event, e.g. a iTunes to a play back event of a music track.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/ao/core#"},
   :rdfs/label #rdf/langString "has used application@en",
   :rdfs/subPropertyOf [:ao/application :event/factor :ao/context],
   :vs/term_status #rdf/langString "unstable@en"})

(def used_device
  "A device that is related to an event, e.g. a MP3 player to a play back event of a music track."
  {:db/ident :ao/used_device,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   #rdf/langString
    "A device that is related to an event, e.g. a MP3 player to a play back event of a music track.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/ao/core#"},
   :rdfs/label #rdf/langString "has used device@en",
   :rdfs/subPropertyOf [:ao/device :event/factor :ao/context],
   :vs/term_status #rdf/langString "unstable@en"})
