(ns net.wikipunk.rdf.mo
  {:rdf/ns-prefix-map {"ao" "http://purl.org/ontology/ao/core#",
                       "bio" "http://purl.org/vocab/bio/0.1/",
                       "cc" "http://web.resource.org/cc/",
                       "dc11" "http://purl.org/dc/elements/1.1/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "event" "http://purl.org/NET/c4dm/event.owl#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "frbr" "http://purl.org/vocab/frbr/core#",
                       "geo" "http://www.w3.org/2003/01/geo/wgs84_pos#",
                       "keys" "http://purl.org/NET/c4dm/keys.owl#",
                       "mo" "http://purl.org/ontology/mo/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "time" "http://www.w3.org/2006/time#",
                       "vann" "http://purl.org/vocab/vann/",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "wot" "http://xmlns.com/wot/0.1/",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "mo",
   :rdfa/uri          "http://purl.org/ontology/mo/"}
  (:refer-clojure :exclude [key time]))

(def Activity
  "\n        An activity period, defining when an artist was musically active.\n    "
  {:db/ident :mo/Activity,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n        An activity period, defining when an artist was musically active.\n    ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "activity",
   :rdfs/subClassOf :event/Event,
   :vs/term_status "testing"})

(def AnalogSignal
  "\n        An analog signal.\n    "
  {:db/ident         :mo/AnalogSignal,
   :mo/level         "2",
   :owl/disjointWith :mo/DigitalSignal,
   :rdf/type         :owl/Class,
   :rdfs/comment     "\n        An analog signal.\n    ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label       "analogue signal",
   :rdfs/subClassOf  :mo/Signal,
   :vs/term_status   "stable"})

(def Arrangement
  "\n        An arrangement event.\n        Takes as agent the arranger, and produces a score (informational object, not the actually published score).\n    "
  {:db/ident :mo/Arrangement,
   :mo/level "2",
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n        An arrangement event.\n        Takes as agent the arranger, and produces a score (informational object, not the actually published score).\n    ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "arrangement",
   :rdfs/subClassOf :event/Event,
   :vs/term_status "stable"})

(def Arranger
  "arranger"
  {:db/ident            :mo/Arranger,
   :mo/level            "2",
   :owl/equivalentClass {:owl/onProperty     :event/isAgentIn,
                         :owl/someValuesFrom :mo/Arrangement,
                         :rdf/type           :owl/Restriction},
   :rdf/type            :owl/Class,
   :rdfs/label          "arranger",
   :rdfs/subClassOf     :foaf/Agent,
   :vs/term_status      "unstable"})

(def AudioFile
  "An audio file, which may be available on a local file system or through http, ftp, etc."
  {:db/ident :mo/AudioFile,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "An audio file, which may be available on a local file system or through http, ftp, etc.",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "audio file",
   :rdfs/subClassOf #{:foaf/Document :mo/Medium},
   :vs/term_status "unstable"})

(def CD
  "Compact Disc used as medium to record a musical manifestation."
  {:db/ident :mo/CD,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Compact Disc used as medium to record a musical manifestation.",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "CD",
   :rdfs/subClassOf :mo/Medium,
   :vs/term_status "unstable"})

(def Composer
  "composer"
  {:db/ident            :mo/Composer,
   :mo/level            "2",
   :owl/equivalentClass {:owl/onProperty     :event/isAgentIn,
                         :owl/someValuesFrom :mo/Composition,
                         :rdf/type           :owl/Restriction},
   :rdf/type            :owl/Class,
   :rdfs/label          "composer",
   :rdfs/subClassOf     :foaf/Agent,
   :vs/term_status      "unstable"})

(def Composition
  "\n        A composition event.\n        Takes as agent the composer himself.\n        It produces a MusicalWork, or a MusicalExpression (when the initial \"product\" is a score, for example), or both...\n    "
  {:db/ident :mo/Composition,
   :mo/level "2",
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n        A composition event.\n        Takes as agent the composer himself.\n        It produces a MusicalWork, or a MusicalExpression (when the initial \"product\" is a score, for example), or both...\n    ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "composition",
   :rdfs/subClassOf :event/Event,
   :vs/term_status "stable"})

(def Conductor
  "conductor"
  {:db/ident            :mo/Conductor,
   :mo/level            "2",
   :owl/equivalentClass {:owl/onProperty     :mo/conducted,
                         :owl/someValuesFrom :mo/Performance,
                         :rdf/type           :owl/Restriction},
   :rdf/type            :owl/Class,
   :rdfs/label          "conductor",
   :rdfs/subClassOf     :foaf/Agent,
   :vs/term_status      "unstable"})

(def CorporateBody
  "Organization or group of individuals and/or other organizations involved in the music market."
  {:db/ident :mo/CorporateBody,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Organization or group of individuals and/or other organizations involved in the music market.",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "corporate body",
   :rdfs/subClassOf :foaf/Organization,
   :vs/term_status "stable"})

(def DAT
  "Digital Audio Tape used as medium to record a musical manifestation."
  {:db/ident :mo/DAT,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Digital Audio Tape used as medium to record a musical manifestation.",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "DAT",
   :rdfs/subClassOf :mo/Medium,
   :vs/term_status "unstable"})

(def DCC
  "Digital Compact Cassette used as medium to record a musical manifestation."
  {:db/ident :mo/DCC,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Digital Compact Cassette used as medium to record a musical manifestation.",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "DCC",
   :rdfs/subClassOf :mo/Medium,
   :vs/term_status "unstable"})

(def DVDA
  "DVD-Audio used as medium to record a musical manifestation."
  {:db/ident :mo/DVDA,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment "DVD-Audio used as medium to record a musical manifestation.",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "DVDA",
   :rdfs/subClassOf :mo/Medium,
   :vs/term_status "unstable"})

(def DigitalSignal
  "\n        A digital signal\n    "
  {:db/ident         :mo/DigitalSignal,
   :mo/level         "2",
   :owl/disjointWith :mo/AnalogSignal,
   :rdf/type         :owl/Class,
   :rdfs/comment     "\n        A digital signal\n    ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label       "digital signal",
   :rdfs/subClassOf  :mo/Signal,
   :vs/term_status   "stable"})

(def ED2K
  "Something available on the E-Donkey peer-2-peer filesharing network"
  {:db/ident :mo/ED2K,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Something available on the E-Donkey peer-2-peer filesharing network",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "ED2K",
   :rdfs/subClassOf :mo/Medium,
   :vs/term_status "unstable"})

(def Festival
  "\n        A festival - musical/artistic event lasting several days, like Glastonbury, Rock Am Ring...\n        We migth decompose this event (which is in fact just a classification of the space/time region related to \n        a particular festival) using hasSubEvent in several performances at different space/time.\n    "
  {:db/ident :mo/Festival,
   :mo/level "2",
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n        A festival - musical/artistic event lasting several days, like Glastonbury, Rock Am Ring...\n        We migth decompose this event (which is in fact just a classification of the space/time region related to \n        a particular festival) using hasSubEvent in several performances at different space/time.\n    ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "Festival",
   :rdfs/subClassOf :event/Event,
   :vs/term_status "stable"})

(def Genre
  "\n        An expressive style of music.\n        \n        Any taxonomy can be plug-in here. You can either define a genre by yourself, like this:\n\n        :mygenre a mo:Genre; dc:title \"electro rock\".\n\n        Or you can refer to a DBPedia genre (such as http://dbpedia.org/resource/Baroque_music), allowing semantic web\n        clients to access easily really detailed structured information about the genre you are refering to.\n    "
  {:db/ident :mo/Genre,
   :mo/level "2",
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n        An expressive style of music.\n        \n        Any taxonomy can be plug-in here. You can either define a genre by yourself, like this:\n\n        :mygenre a mo:Genre; dc:title \"electro rock\".\n\n        Or you can refer to a DBPedia genre (such as http://dbpedia.org/resource/Baroque_music), allowing semantic web\n        clients to access easily really detailed structured information about the genre you are refering to.\n    ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "Genre",
   :vs/term_status "stable"})

(def Instrument
  "\n        Any of various devices or contrivances that can be used to produce musical tones or sound.\n        \n        Any taxonomy can be used to subsume this concept. The default one is one extracted by Ivan Herman\n        from the Musicbrainz instrument taxonomy, conforming to SKOS. This concept holds a seeAlso link \n        towards this taxonomy.\n    "
  {:db/ident :mo/Instrument,
   :mo/level "2",
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n        Any of various devices or contrivances that can be used to produce musical tones or sound.\n        \n        Any taxonomy can be used to subsume this concept. The default one is one extracted by Ivan Herman\n        from the Musicbrainz instrument taxonomy, conforming to SKOS. This concept holds a seeAlso link \n        towards this taxonomy.\n    ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "Instrument",
   :rdfs/seeAlso {:rdfa/uri "http://purl.org/ontology/mo/mit#"},
   :vs/term_status "stable"})

(def Instrumentation
  "\n        Instrumentation deals with the techniques of writing music for a specific instrument, \n        including the limitations of the instrument, playing techniques and idiomatic handling of the instrument.\n    "
  {:db/ident :mo/Instrumentation,
   :mo/level "2",
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n        Instrumentation deals with the techniques of writing music for a specific instrument, \n        including the limitations of the instrument, playing techniques and idiomatic handling of the instrument.\n    ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "instrumentation",
   :rdfs/subClassOf :mo/Arrangement,
   :vs/term_status "stable"})

(def Label
  "Trade name of a company that produces musical works or expression of musical works."
  {:db/ident :mo/Label,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Trade name of a company that produces musical works or expression of musical works.",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "label",
   :rdfs/subClassOf :mo/CorporateBody,
   :vs/term_status "stable"})

(def Libretto
  "\n                Libretto\n        "
  {:db/ident         :mo/Libretto,
   :mo/level         "2",
   :rdf/type         :owl/Class,
   :rdfs/comment     "\n                Libretto\n        ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label       "libretto",
   :rdfs/subClassOf  :mo/MusicalExpression,
   :vs/term_status   "stable"})

(def Listener
  "listened"
  {:db/ident            :mo/Listener,
   :mo/level            "2",
   :owl/equivalentClass {:owl/onProperty     :mo/listened,
                         :owl/someValuesFrom :mo/Performance,
                         :rdf/type           :owl/Restriction},
   :rdf/type            :owl/Class,
   :rdfs/label          "listened",
   :rdfs/subClassOf     :foaf/Agent,
   :vs/term_status      "unstable"})

(def Lyrics
  "\n        Lyrics\n    "
  {:db/ident         :mo/Lyrics,
   :mo/level         "2",
   :rdf/type         :owl/Class,
   :rdfs/comment     "\n        Lyrics\n    ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label       "lyrics",
   :rdfs/subClassOf  :mo/MusicalExpression,
   :vs/term_status   "stable"})

(def MD
  "Mini Disc used as medium to record a musical manifestation."
  {:db/ident :mo/MD,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment "Mini Disc used as medium to record a musical manifestation.",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "MD",
   :rdfs/subClassOf :mo/Medium,
   :vs/term_status "unstable"})

(def MagneticTape
  "Magnetic analogue tape used as medium to record a musical manifestation."
  {:db/ident :mo/MagneticTape,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Magnetic analogue tape used as medium to record a musical manifestation.",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "MagneticTape",
   :rdfs/subClassOf :mo/Medium,
   :vs/term_status "unstable"})

(def Medium
  "A means or instrumentality for storing or communicating musical manifestation."
  {:db/ident :mo/Medium,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A means or instrumentality for storing or communicating musical manifestation.",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "Medium",
   :rdfs/subClassOf :mo/MusicalItem,
   :vs/term_status "unstable"})

(def Membership
  "A membership event, where one or several people belongs to a group during a particular time period."
  {:db/ident :mo/Membership,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A membership event, where one or several people belongs to a group during a particular time period.",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "membership",
   :rdfs/subClassOf :event/Event,
   :vs/term_status "testing"})

(def Movement
  "A movement is a self-contained part of a musical work. While individual or selected movements from a composition are sometimes performed separately, a performance of the complete work requires all the movements to be performed in succession.\n\nOften a composer attempts to interrelate the movements thematically, or sometimes in more subtle ways, in order that the individual\nmovements exert a cumulative effect. In some forms, composers sometimes link the movements, or ask for them to be played without a\npause between them.\n    "
  {:db/ident :mo/Movement,
   :mo/level "2",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A movement is a self-contained part of a musical work. While individual or selected movements from a composition are sometimes performed separately, a performance of the complete work requires all the movements to be performed in succession.\n\nOften a composer attempts to interrelate the movements thematically, or sometimes in more subtle ways, in order that the individual\nmovements exert a cumulative effect. In some forms, composers sometimes link the movements, or ask for them to be played without a\npause between them.\n    ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "movement",
   :rdfs/subClassOf :mo/MusicalWork,
   :vs/term_status "unstable"})

(def MusicArtist
  "\n        A person or a group of people (or a computer :-) ), whose musical \n        creative work shows sensitivity and imagination \n    "
  {:db/ident :mo/MusicArtist,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n        A person or a group of people (or a computer :-) ), whose musical \n        creative work shows sensitivity and imagination \n    ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "music artist",
   :rdfs/subClassOf :foaf/Agent,
   :vs/term_status "stable"})

(def MusicGroup
  "Group of musicians, or musical ensemble, usually popular or folk, playing parts of or improvising off of a musical arrangement. "
  {:db/ident :mo/MusicGroup,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Group of musicians, or musical ensemble, usually popular or folk, playing parts of or improvising off of a musical arrangement. ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "music group",
   :rdfs/subClassOf #{:foaf/Group :mo/MusicArtist},
   :vs/term_status "stable"})

(def MusicalExpression
  "\nThe intellectual or artistic realization of a work in the form of alpha-numeric, musical, or choreographic notation, sound, etc., or any combination of such forms.    \n\n\nFor example:\n\nWork #1 Franz Schubert's Trout quintet\n\n    * Expression #1 the composer's score\n    * Expression #2 sound issued from the performance by the Amadeus Quartet and Hephzibah Menuhin on piano\n    * Expression #3 sound issued from the performance by the Cleveland Quartet and Yo-Yo Ma on the cello\n    * . . . . \n\nThe Music Ontology defines the following sub-concepts of a MusicalExpression, which should be used instead of MusicalExpression itself: Score (the\nresult of an arrangement), Sound (produced during a performance), Signal. However, it is possible to stick to FRBR and bypass the worflow\nmechanism this ontology defines by using the core FRBR properties on such objects. But it is often better to use events to interconnect such \nexpressions (allowing to go deeply into the production process - `this performer was playing this particular instrument at that\nparticular time').\n    \n    "
  {:db/ident :mo/MusicalExpression,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "\nThe intellectual or artistic realization of a work in the form of alpha-numeric, musical, or choreographic notation, sound, etc., or any combination of such forms.    \n\n\nFor example:\n\nWork #1 Franz Schubert's Trout quintet\n\n    * Expression #1 the composer's score\n    * Expression #2 sound issued from the performance by the Amadeus Quartet and Hephzibah Menuhin on piano\n    * Expression #3 sound issued from the performance by the Cleveland Quartet and Yo-Yo Ma on the cello\n    * . . . . \n\nThe Music Ontology defines the following sub-concepts of a MusicalExpression, which should be used instead of MusicalExpression itself: Score (the\nresult of an arrangement), Sound (produced during a performance), Signal. However, it is possible to stick to FRBR and bypass the worflow\nmechanism this ontology defines by using the core FRBR properties on such objects. But it is often better to use events to interconnect such \nexpressions (allowing to go deeply into the production process - `this performer was playing this particular instrument at that\nparticular time').\n    \n    ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "musical expression",
   :rdfs/subClassOf :frbr/Expression,
   :vs/term_status "unstable"})

(def MusicalItem
  "A single exemplar of a musical expression.\n    \nFor example, it could be a single exemplar of a CD. This is normally an single object (a CD) possessed by somebody.\n\nFrom the FRBR final report: The entity defined as item is a concrete entity. It is in many instances a single physical object (e.g., a copy of a one-volume monograph, a single audio cassette, etc.). There are instances, however, where the entity defined as item comprises more than one physical object (e.g., a monograph issued as two separately bound volumes, a recording issued on three separate compact discs, etc.).\n\nIn terms of intellectual content and physical form, an item exemplifying a manifestation is normally the same as the manifestation itself. However, variations may occur from one item to another, even when the items exemplify the same manifestation, where those variations are the result of actions external to the intent of the producer of the manifestation (e.g., damage occurring after the item was produced, binding performed by a library, etc.). \n    "
  {:db/ident :mo/MusicalItem,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A single exemplar of a musical expression.\n    \nFor example, it could be a single exemplar of a CD. This is normally an single object (a CD) possessed by somebody.\n\nFrom the FRBR final report: The entity defined as item is a concrete entity. It is in many instances a single physical object (e.g., a copy of a one-volume monograph, a single audio cassette, etc.). There are instances, however, where the entity defined as item comprises more than one physical object (e.g., a monograph issued as two separately bound volumes, a recording issued on three separate compact discs, etc.).\n\nIn terms of intellectual content and physical form, an item exemplifying a manifestation is normally the same as the manifestation itself. However, variations may occur from one item to another, even when the items exemplify the same manifestation, where those variations are the result of actions external to the intent of the producer of the manifestation (e.g., damage occurring after the item was produced, binding performed by a library, etc.). \n    ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "MusicalItem",
   :vs/term_status "unstable"})

(def MusicalManifestation
  "\n\nThis entity is related to the edition/production/publication of a musical expression (musical manifestation are closely related with the music industry (their terms, concepts, definitions, methods (production, publication, etc.), etc.)\n    \nFrom the FRBR final report: The entity defined as manifestation encompasses a wide range of materials, including manuscripts, books, periodicals, maps, posters, sound recordings, films, video recordings, CD-ROMs, multimedia kits, etc. As an entity, manifestation represents all the physical objects that bear the same characteristics, in respect to both intellectual content and physical form.\n\n\nWork #1 J. S. Bach's Six suites for unaccompanied cello\n\n    * Expression #1 sound issued during the performance by Janos Starker recorded in 1963 and 1965\n          o Manifestation #1 recordings released on 33 1/3 rpm sound discs in 1965 by Mercury\n          o Manifestation #2 recordings re-released on compact disc in 1991 by Mercury \n    * Expression #2 sound issued during the performances by Yo-Yo Ma recorded in 1983\n          o Manifestation #1 recordings released on 33 1/3 rpm sound discs in 1983 by CBS Records\n          o Manifestation #2 recordings re-released on compact disc in 1992 by CBS Records \n\n          \nChanges that occur deliberately or even inadvertently in the production process that affect the copies result, strictly speaking, in a new manifestation. A manifestation resulting from such a change may be identified as a particular \"state\" or \"issue\" of the publication.\n\nChanges that occur to an individual copy after the production process is complete (e.g., the loss of a page, rebinding, etc.) are not considered to result in a new manifestation. That copy is simply considered to be an exemplar (or item) of the manifestation that deviates from the copy as produced.\n\nWith the entity defined as manifestation we can describe the physical characteristics of a set of items and the characteristics associated with the production and distribution of that set of items that may be important factors in enabling users to choose a manifestation appropriate to their physical needs and constraints, and to identify and acquire a copy of that manifestation.\n\nDefining manifestation as an entity also enables us to draw relationships between specific manifestations of a work. We can use the relationships between manifestations to identify, for example, the specific publication that was used to create a microreproduction.          \n\n"
  {:db/ident :mo/MusicalManifestation,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n\nThis entity is related to the edition/production/publication of a musical expression (musical manifestation are closely related with the music industry (their terms, concepts, definitions, methods (production, publication, etc.), etc.)\n    \nFrom the FRBR final report: The entity defined as manifestation encompasses a wide range of materials, including manuscripts, books, periodicals, maps, posters, sound recordings, films, video recordings, CD-ROMs, multimedia kits, etc. As an entity, manifestation represents all the physical objects that bear the same characteristics, in respect to both intellectual content and physical form.\n\n\nWork #1 J. S. Bach's Six suites for unaccompanied cello\n\n    * Expression #1 sound issued during the performance by Janos Starker recorded in 1963 and 1965\n          o Manifestation #1 recordings released on 33 1/3 rpm sound discs in 1965 by Mercury\n          o Manifestation #2 recordings re-released on compact disc in 1991 by Mercury \n    * Expression #2 sound issued during the performances by Yo-Yo Ma recorded in 1983\n          o Manifestation #1 recordings released on 33 1/3 rpm sound discs in 1983 by CBS Records\n          o Manifestation #2 recordings re-released on compact disc in 1992 by CBS Records \n\n          \nChanges that occur deliberately or even inadvertently in the production process that affect the copies result, strictly speaking, in a new manifestation. A manifestation resulting from such a change may be identified as a particular \"state\" or \"issue\" of the publication.\n\nChanges that occur to an individual copy after the production process is complete (e.g., the loss of a page, rebinding, etc.) are not considered to result in a new manifestation. That copy is simply considered to be an exemplar (or item) of the manifestation that deviates from the copy as produced.\n\nWith the entity defined as manifestation we can describe the physical characteristics of a set of items and the characteristics associated with the production and distribution of that set of items that may be important factors in enabling users to choose a manifestation appropriate to their physical needs and constraints, and to identify and acquire a copy of that manifestation.\n\nDefining manifestation as an entity also enables us to draw relationships between specific manifestations of a work. We can use the relationships between manifestations to identify, for example, the specific publication that was used to create a microreproduction.          \n\n",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "musical manifestation",
   :rdfs/subClassOf :frbr/Manifestation,
   :vs/term_status "stable"})

(def MusicalWork
  "\n    Distinct intellectual or artistic musical creation.\n    \nFrom the FRBR final report: A work is an abstract entity; there is no single material object one can point to as the work. We recognize the work through individual realizations or expressions of the work, but the work itself exists only in the commonality of\ncontent between and among the various expressions of the work. When we speak of Homer's Iliad as a work, our point of reference is not a particular recitation or text of the work, but the intellectual creation that lies behind all the various expressions of the work.     \n\nFor example:\n\nwork #1 J. S. Bach's The art of the fugue\n\n    \n    "
  {:db/ident :mo/MusicalWork,
   :mo/level "2",
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n    Distinct intellectual or artistic musical creation.\n    \nFrom the FRBR final report: A work is an abstract entity; there is no single material object one can point to as the work. We recognize the work through individual realizations or expressions of the work, but the work itself exists only in the commonality of\ncontent between and among the various expressions of the work. When we speak of Homer's Iliad as a work, our point of reference is not a particular recitation or text of the work, but the intellectual creation that lies behind all the various expressions of the work.     \n\nFor example:\n\nwork #1 J. S. Bach's The art of the fugue\n\n    \n    ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "musical work",
   :rdfs/subClassOf :frbr/Work,
   :vs/term_status "stable"})

(def Orchestration
  "\n            Orchestration includes, in addition to instrumentation, the handling of groups of instruments and their balance and interaction.\n    "
  {:db/ident :mo/Orchestration,
   :mo/level "2",
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n            Orchestration includes, in addition to instrumentation, the handling of groups of instruments and their balance and interaction.\n    ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "orchestration",
   :rdfs/subClassOf :mo/Arrangement,
   :vs/term_status "stable"})

(def Performance
  "\n        A performance event. \n        It might include as agents performers, engineers, conductors, or even listeners.\n        It might include as factors a score, a MusicalWork, musical instruments. \n        It might produce a sound:-)\n    "
  {:db/ident :mo/Performance,
   :mo/level "2",
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n        A performance event. \n        It might include as agents performers, engineers, conductors, or even listeners.\n        It might include as factors a score, a MusicalWork, musical instruments. \n        It might produce a sound:-)\n    ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "performance",
   :rdfs/subClassOf :event/Event,
   :vs/term_status "stable"})

(def Performer
  "performer"
  {:db/ident            :mo/Performer,
   :mo/level            "2",
   :owl/equivalentClass {:owl/onProperty     :mo/performed,
                         :owl/someValuesFrom :mo/Performance,
                         :rdf/type           :owl/Restriction},
   :rdf/type            :owl/Class,
   :rdfs/label          "performer",
   :rdfs/subClassOf     :foaf/Agent,
   :vs/term_status      "unstable"})

(def PublishedLibretto
  "A published libretto"
  {:db/ident         :mo/PublishedLibretto,
   :mo/level         "2",
   :rdf/type         :owl/Class,
   :rdfs/comment     "A published libretto",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label       "published libretto",
   :rdfs/subClassOf  :mo/MusicalManifestation,
   :vs/term_status   "stable"})

(def PublishedLyrics
  "Published lyrics, as a book or as a text file, for example"
  {:db/ident :mo/PublishedLyrics,
   :mo/level "2",
   :rdf/type :owl/Class,
   :rdfs/comment "Published lyrics, as a book or as a text file, for example",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "published lyrics",
   :rdfs/subClassOf :mo/MusicalManifestation,
   :vs/term_status "stable"})

(def PublishedScore
  "A published score (subclass of MusicalManifestation)"
  {:db/ident         :mo/PublishedScore,
   :mo/level         "2",
   :rdf/type         :owl/Class,
   :rdfs/comment     "A published score (subclass of MusicalManifestation)",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label       "published score",
   :rdfs/subClassOf  :mo/MusicalManifestation,
   :vs/term_status   "stable"})

(def Record
  "A published record (manifestation which first aim is to render the product of a recording)"
  {:db/ident :mo/Record,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A published record (manifestation which first aim is to render the product of a recording)",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "record",
   :rdfs/subClassOf :mo/MusicalManifestation,
   :vs/term_status "stable"})

(def Recording
  "\n        A recording event.\n        Takes a sound as a factor to produce a signal (analog or digital).\n        The location of such events (if any) is the actual location of the corresponding\n        microphone or the \"recording device\".\n    "
  {:db/ident :mo/Recording,
   :mo/level "2",
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n        A recording event.\n        Takes a sound as a factor to produce a signal (analog or digital).\n        The location of such events (if any) is the actual location of the corresponding\n        microphone or the \"recording device\".\n    ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "recording",
   :rdfs/subClassOf :event/Event,
   :vs/term_status "stable"})

(def RecordingSession
  "A set of performances/recordings/mastering events. This event can be decomposed in its constituent events using event:sub_event"
  {:db/ident :mo/RecordingSession,
   :mo/level "2",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A set of performances/recordings/mastering events. This event can be decomposed in its constituent events using event:sub_event",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "recording session",
   :rdfs/subClassOf :event/Event,
   :vs/term_status "testing"})

(def Release
  "A specific release, with barcode, box, liner notes, cover art, and a number of records"
  {:db/ident :mo/Release,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A specific release, with barcode, box, liner notes, cover art, and a number of records",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "release",
   :rdfs/subClassOf :mo/MusicalManifestation,
   :vs/term_status "testing"})

(def ReleaseEvent
  "A release event, in a particular place (e.g. a country) at a particular time. Other factors of this event might include cover art, liner notes, box, etc. or a release grouping all these."
  {:db/ident :mo/ReleaseEvent,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A release event, in a particular place (e.g. a country) at a particular time. Other factors of this event might include cover art, liner notes, box, etc. or a release grouping all these.",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "release event",
   :rdfs/subClassOf :event/Event,
   :vs/term_status "testing"})

(def ReleaseStatus
  "Musical manifestation release status."
  {:db/ident         :mo/ReleaseStatus,
   :mo/level         "1",
   :rdf/type         :owl/Class,
   :rdfs/comment     "Musical manifestation release status.",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label       "release status",
   :vs/term_status   "stable"})

(def ReleaseType
  "\n        Release type of a particular manifestation, such as \"album\" or \"interview\"...\n    "
  {:db/ident :mo/ReleaseType,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n        Release type of a particular manifestation, such as \"album\" or \"interview\"...\n    ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "Release type",
   :vs/term_status "stable"})

(def SACD
  "Super Audio Compact Disc used as medium to record a musical manifestation."
  {:db/ident :mo/SACD,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Super Audio Compact Disc used as medium to record a musical manifestation.",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "SACD",
   :rdfs/subClassOf :mo/Medium,
   :vs/term_status "unstable"})

(def Score
  "\n        Here, we are dealing with the informational object (the MusicalExpression), not the actually \"published\" score.\n        This may be, for example, the product of an arrangement process.\n    "
  {:db/ident :mo/Score,
   :mo/level "2",
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n        Here, we are dealing with the informational object (the MusicalExpression), not the actually \"published\" score.\n        This may be, for example, the product of an arrangement process.\n    ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "score",
   :rdfs/subClassOf :mo/MusicalExpression,
   :vs/term_status "stable"})

(def Show
  "\n        A show - a musical event lasting several days, in a particular venue. Examples can be\n        \"The Magic Flute\" at the Opera Bastille, August 2005, or a musical in the west end...\n    "
  {:db/ident :mo/Show,
   :mo/level "2",
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n        A show - a musical event lasting several days, in a particular venue. Examples can be\n        \"The Magic Flute\" at the Opera Bastille, August 2005, or a musical in the west end...\n    ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "Show",
   :rdfs/subClassOf :event/Event,
   :vs/term_status "stable"})

(def Signal
  "\n        A subclass of MusicalExpression, representing a signal, for example a master signal produced by a performance and a recording.\n    "
  {:db/ident :mo/Signal,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n        A subclass of MusicalExpression, representing a signal, for example a master signal produced by a performance and a recording.\n    ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "signal",
   :rdfs/subClassOf :mo/MusicalExpression,
   :vs/term_status "stable"})

(def SignalGroup
  "\n        A musical expression representing a group of signals, for example a set of masters resulting from a whole recording/mastering session.\n    "
  {:db/ident :mo/SignalGroup,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n        A musical expression representing a group of signals, for example a set of masters resulting from a whole recording/mastering session.\n    ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "signal group",
   :rdfs/subClassOf :mo/MusicalExpression,
   :vs/term_status "testing"})

(def SoloMusicArtist
  "Single person whose musical creative work shows sensitivity and imagination."
  {:db/ident :mo/SoloMusicArtist,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Single person whose musical creative work shows sensitivity and imagination.",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "solo music artist",
   :rdfs/subClassOf #{:foaf/Person :mo/MusicArtist},
   :vs/term_status "stable"})

(def Sound
  "\n        A subclass of MusicalExpression, representing a sound. Realisation of a MusicalWork during a musical Performance.\n    "
  {:db/ident :mo/Sound,
   :mo/level "2",
   :rdf/type :owl/Class,
   :rdfs/comment
   "\n        A subclass of MusicalExpression, representing a sound. Realisation of a MusicalWork during a musical Performance.\n    ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "sound",
   :rdfs/subClassOf #{:mo/MusicalExpression :event/Event},
   :vs/term_status "stable"})

(def SoundEngineer
  "sound engineer"
  {:db/ident            :mo/SoundEngineer,
   :mo/level            "2",
   :owl/equivalentClass {:owl/onProperty     :mo/engineered,
                         :owl/someValuesFrom :mo/Performance,
                         :rdf/type           :owl/Restriction},
   :rdf/type            :owl/Class,
   :rdfs/label          "sound engineer",
   :rdfs/subClassOf     :foaf/Agent,
   :vs/term_status      "unstable"})

(def Stream
  "Transmission over a network  used as medium to broadcast a musical manifestation"
  {:db/ident :mo/Stream,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Transmission over a network  used as medium to broadcast a musical manifestation",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "Stream",
   :rdfs/subClassOf :mo/Medium,
   :vs/term_status "unstable"})

(def Torrent
  "Something available on the Bittorrent peer-2-peer filesharing network"
  {:db/ident :mo/Torrent,
   :mo/level "1",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Something available on the Bittorrent peer-2-peer filesharing network",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "Torrent",
   :rdfs/subClassOf :mo/Medium,
   :vs/term_status "unstable"})

(def Track
  "A track on a particular record"
  {:db/ident         :mo/Track,
   :mo/level         "1",
   :rdf/type         :owl/Class,
   :rdfs/comment     "A track on a particular record",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label       "track",
   :rdfs/subClassOf  :mo/MusicalManifestation,
   :vs/term_status   "stable"})

(def Transcription
  "Transcription event"
  {:db/ident         :mo/Transcription,
   :mo/level         "2",
   :rdf/type         :owl/Class,
   :rdfs/comment     "Transcription event",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label       "transcription",
   :rdfs/subClassOf  :event/Event,
   :vs/term_status   "testing"})

(def Vinyl
  "Vinyl used as medium to record a musical manifestation"
  {:db/ident         :mo/Vinyl,
   :mo/level         "1",
   :rdf/type         :owl/Class,
   :rdfs/comment     "Vinyl used as medium to record a musical manifestation",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label       "Vinyl",
   :rdfs/subClassOf  :mo/Medium,
   :vs/term_status   "unstable"})

(def activity
  "Relates an artist to an activity period"
  {:db/ident         :mo/activity,
   :mo/level         "1",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Relates an artist to an activity period",
   :rdfs/domain      :mo/MusicArtist,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label       "activity",
   :rdfs/range       :mo/Activity,
   :vs/term_status   "testing"})

(def activity_end
  "Relates an artist to a date at which its activity ended"
  {:db/ident         :mo/activity_end,
   :mo/level         "1",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "Relates an artist to a date at which its activity ended",
   :rdfs/domain      :mo/MusicArtist,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label       "activity end",
   :rdfs/range       :xsd/date,
   :vs/term_status   "testing"})

(def activity_start
  "Relates an artist to a date at which its activity started"
  {:db/ident :mo/activity_start,
   :mo/level "1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Relates an artist to a date at which its activity started",
   :rdfs/domain :mo/MusicArtist,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "activity start",
   :rdfs/range :xsd/date,
   :vs/term_status "testing"})

(def album
  "\n        One or more track issued together.\n            This is a type of MusicalManifestation defined by the musical industry.\n    "
  {:db/ident :mo/album,
   :dc11/description
   "\n        One or more track issued together.\n            This is a type of MusicalManifestation defined by the musical industry.\n    ",
   :dc11/title "album",
   :mo/level "1",
   :rdf/type :mo/ReleaseType,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"}})

(def amazon_asin
  "Used to link a work or the expression of a work to its corresponding Amazon ASINs page."
  {:db/ident :mo/amazon_asin,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to link a work or the expression of a work to its corresponding Amazon ASINs page.",
   :rdfs/domain
   {:owl/unionOf [:frbr/Work :frbr/Expression :frbr/Manifestation :frbr/Item],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "amazon_asin",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :foaf/isPrimaryTopicOf,
   :vs/term_status "stable"})

(def arranged_in
  "\n        Associates a work to an arrangement event where it was arranged\n    "
  {:db/ident :mo/arranged_in,
   :mo/level "2",
   :owl/inverseOf :mo/arrangement_of,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n        Associates a work to an arrangement event where it was arranged\n    ",
   :rdfs/domain :mo/MusicalWork,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "arranged in",
   :rdfs/range :mo/Arrangement,
   :rdfs/subPropertyOf :event/isFactorOf,
   :vs/term_status "unstable"})

(def arrangement_of
  "\n                Associates an arrangement event to a work\n        "
  {:db/ident :mo/arrangement_of,
   :mo/level "2",
   :owl/inverseOf :mo/arranged_in,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n                Associates an arrangement event to a work\n        ",
   :rdfs/domain :mo/Arrangement,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "arrangement of",
   :rdfs/range :mo/MusicalWork,
   :rdfs/subPropertyOf :event/factor,
   :vs/term_status "unstable"})

(def artist
  "Relates a membership event with the corresponding artist"
  {:db/ident         :mo/artist,
   :mo/level         "1",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Relates a membership event with the corresponding artist",
   :rdfs/domain      :mo/Membership,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label       "artist",
   :rdfs/range       :foaf/Agent,
   :vs/term_status   "testing"})

(def audiobook
  "\n        Book read by a narrator without music.\n        This is a type of MusicalManifestation defined by the musical industry.\n    "
  {:db/ident :mo/audiobook,
   :dc11/description
   "\n        Book read by a narrator without music.\n        This is a type of MusicalManifestation defined by the musical industry.\n    ",
   :dc11/title "audio book",
   :mo/level "1",
   :rdf/type :mo/ReleaseType,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"}})

(def availableAs
  {:db/ident       :mo/availableAs,
   :owl/equivalentProperty :mo/available_as,
   :rdf/type       :owl/ObjectProperty,
   :vs/term_status "deprecated"})

(def available_as
  "\n        Relates a musical manifestation to a musical item (this album, and my particular cd). By using\n        this property, there is no assumption on wether the full content is available on the linked item.\n        To be explicit about this, you can use a sub-property, such as mo:item (the full manifestation\n        is available on that item) or mo:preview (only a part of the manifestation is available on\n        that item).\n\n        This is a subproperty of frbr:examplar.\n    "
  {:db/ident :mo/available_as,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n        Relates a musical manifestation to a musical item (this album, and my particular cd). By using\n        this property, there is no assumption on wether the full content is available on the linked item.\n        To be explicit about this, you can use a sub-property, such as mo:item (the full manifestation\n        is available on that item) or mo:preview (only a part of the manifestation is available on\n        that item).\n\n        This is a subproperty of frbr:examplar.\n    ",
   :rdfs/domain :mo/MusicalManifestation,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/range :mo/MusicalItem,
   :rdfs/subPropertyOf :frbr/exemplar,
   :vs/term_status "stable"})

(def biography
  "Used to link an artist to their online biography."
  {:db/ident           :mo/biography,
   :mo/level           "1",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       "Used to link an artist to their online biography.",
   :rdfs/domain        :mo/MusicArtist,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label         "biography",
   :rdfs/range         :foaf/Document,
   :rdfs/subPropertyOf :foaf/isPrimaryTopicOf,
   :vs/term_status     "stable"})

(def bitsPerSample
  "\n        Associates a digital signal to the number a bits used to encode one sample. Range is xsd:int.\n    "
  {:db/ident :mo/bitsPerSample,
   :mo/level "1",
   :rdf/type #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/comment
   "\n        Associates a digital signal to the number a bits used to encode one sample. Range is xsd:int.\n    ",
   :rdfs/domain :mo/DigitalSignal,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/range :xsd/int,
   :vs/term_status "stable"})

(def bootleg
  "An unofficial/underground musical work or the expression of a musical work that was not sanctioned by the artist and/or the corporate body. "
  {:db/ident :mo/bootleg,
   :dc11/description
   "An unofficial/underground musical work or the expression of a musical work that was not sanctioned by the artist and/or the corporate body. ",
   :dc11/title "bootleg",
   :mo/level "1",
   :rdf/type :mo/ReleaseStatus,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"}})

(def bpm
  "\n        Indicates the BPM of a MusicalWork or a particular Performance \n        Beats per minute: the pace of music measured by the number of beats occurring in 60 seconds.\n    "
  {:db/ident :mo/bpm,
   :mo/level "2",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "\n        Indicates the BPM of a MusicalWork or a particular Performance \n        Beats per minute: the pace of music measured by the number of beats occurring in 60 seconds.\n    ",
   :rdfs/domain {:owl/unionOf [:mo/MusicalWork :mo/Performance :mo/Signal],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "bpm",
   :rdfs/range :xsd/float,
   :vs/term_status "stable"})

(def catalogue_number
  "Links a release with the corresponding catalogue number"
  {:db/ident :mo/catalogue_number,
   :mo/level "1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Links a release with the corresponding catalogue number",
   :rdfs/domain :mo/Release,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "catalogue number",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :mo/uuid,
   :vs/term_status "testing"})

(def channels
  "\n        Associates a signal to the number of channels it holds (mono --> 1, stereo --> 2). Range is xsd:int.\n    "
  {:db/ident :mo/channels,
   :mo/level "1",
   :rdf/type #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/comment
   "\n        Associates a signal to the number of channels it holds (mono --> 1, stereo --> 2). Range is xsd:int.\n    ",
   :rdfs/domain :mo/Signal,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/range :xsd/int,
   :vs/term_status "stable"})

(def collaborated_with
  "Used to relate two collaborating people on a work."
  {:db/ident         :mo/collaborated_with,
   :mo/level         "1",
   :rdf/type         #{:owl/SymmetricProperty :owl/ObjectProperty},
   :rdfs/comment     "Used to relate two collaborating people on a work.",
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label       "collaborated_with",
   :rdfs/range       :foaf/Agent,
   :vs/term_status   "unstable"})

(def compilation
  "\n        Collection of previously released manifestations of a musical expression by one or more artists.\n        This is a type of MusicalManifestation defined by the musical industry.\n    "
  {:db/ident :mo/compilation,
   :dc11/description
   "\n        Collection of previously released manifestations of a musical expression by one or more artists.\n        This is a type of MusicalManifestation defined by the musical industry.\n    ",
   :dc11/title "compilation",
   :mo/level "1",
   :rdf/type :mo/ReleaseType,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"}})

(def compilation_of
  "Indicates that a musical manifestation is a compilation of several Signals."
  {:db/ident :mo/compilation_of,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Indicates that a musical manifestation is a compilation of several Signals.",
   :rdfs/domain :mo/MusicalManifestation,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "compilation_of",
   :rdfs/range :mo/Signal,
   :vs/term_status "unstable"})

(def compiled
  "Used to relate an person or a group of person who compiled the manifestation of a musical work."
  {:db/ident :mo/compiled,
   :mo/level "1",
   :owl/inverseOf :mo/compiler,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to relate an person or a group of person who compiled the manifestation of a musical work.",
   :rdfs/domain :mo/MusicArtist,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "compiled",
   :rdfs/range :mo/MusicalManifestation,
   :vs/term_status "unstable"})

(def compiler
  "Used to relate the manifestation of a musical work to a person or a group of person who compiled it."
  {:db/ident :mo/compiler,
   :mo/level "1",
   :owl/inverseOf :mo/compiled,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to relate the manifestation of a musical work to a person or a group of person who compiled it.",
   :rdfs/domain :mo/MusicalManifestation,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "compiler",
   :rdfs/range :mo/MusicArtist,
   :vs/term_status "unstable"})

(def composed_in
  "\n        Associates a MusicalWork to the Composition event pertaining\n        to its creation. For example, I might use this property to associate\n        the Magic Flute to its composition event, occuring during 1782 and having as\n        a mo:composer Mozart.\n    "
  {:db/ident :mo/composed_in,
   :mo/level "2",
   :owl/inverseOf :mo/produced_work,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n        Associates a MusicalWork to the Composition event pertaining\n        to its creation. For example, I might use this property to associate\n        the Magic Flute to its composition event, occuring during 1782 and having as\n        a mo:composer Mozart.\n    ",
   :rdfs/domain :mo/MusicalWork,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "composed in",
   :rdfs/range :mo/Composition,
   :rdfs/subPropertyOf :event/producedIn,
   :vs/term_status "unstable"})

(def composer
  "\n        Associates a composition event to the actual composer. For example,\n        this property could link the event corresponding to the composition of the\n        Magic Flute in 1782 to Mozart himself (who obviously has a FOAF profile:-) ).\n    "
  {:db/ident :mo/composer,
   :mo/level "2",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n        Associates a composition event to the actual composer. For example,\n        this property could link the event corresponding to the composition of the\n        Magic Flute in 1782 to Mozart himself (who obviously has a FOAF profile:-) ).\n    ",
   :rdfs/domain :mo/Composition,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "composer",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf :event/agent,
   :vs/term_status "stable"})

(def conducted
  "Relates agents to the performances they were conducting"
  {:db/ident :mo/conducted,
   :mo/level "2",
   :owl/inverseOf :mo/conductor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Relates agents to the performances they were conducting",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "conducted",
   :rdfs/range :mo/Performance,
   :rdfs/subPropertyOf #{:event/isAgentIn :bio/event},
   :vs/term_status "unstable"})

(def conductor
  "Relates a performance to the conductor involved"
  {:db/ident           :mo/conductor,
   :mo/level           "2",
   :owl/inverseOf      :mo/conducted,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       "Relates a performance to the conductor involved",
   :rdfs/domain        :mo/Performance,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/range         :foaf/Agent,
   :rdfs/subPropertyOf :event/agent,
   :vs/term_status     "stable"})

(def contains_sample_from
  "\n        Relates a signal to another signal, which has been sampled.\n        "
  {:db/ident :mo/contains_sample_from,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n        Relates a signal to another signal, which has been sampled.\n        ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "contains_sample_from",
   :rdfs/subPropertyOf :mo/derived_from,
   :vs/term_status "unstable"})

(def derived_from
  "A related signal from which the described signal is derived."
  {:db/ident :mo/derived_from,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "A related signal from which the described signal is derived.",
   :rdfs/domain :mo/Signal,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "derived from",
   :rdfs/range :mo/Signal,
   :rdfs/subPropertyOf :dcterms/source,
   :vs/term_status "testing"})

(def discography
  "Used to links an artist to an online discography of their musical works. The discography should provide a summary of each released musical work of the artist."
  {:db/ident :mo/discography,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to links an artist to an online discography of their musical works. The discography should provide a summary of each released musical work of the artist.",
   :rdfs/domain :mo/MusicArtist,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "discography",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :foaf/isPrimaryTopicOf,
   :vs/term_status "stable"})

(def discogs
  "Used to link a musical work or the expression of a musical work, an artist or a corporate body to to its corresponding Discogs page."
  {:db/ident :mo/discogs,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to link a musical work or the expression of a musical work, an artist or a corporate body to to its corresponding Discogs page.",
   :rdfs/domain {:owl/unionOf [:mo/MusicalWork
                               :mo/MusicalExpression
                               :mo/MusicalManifestation
                               :mo/MusicArtist
                               :mo/CorporateBody],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "discogs",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :foaf/isPrimaryTopicOf,
   :vs/term_status "stable"})

(def djmix_of
  "Indicates that all (or most of) the tracks of a musical work or the expression of a musical work were mixed together from all (or most of) the tracks from another musical work or the expression of a musical work to form a so called DJ-Mix. \n    \nThe tracks might have been altered by pitching (so that the tempo of one track matches the tempo of the following track) and fading (so that one track blends in smoothly with the other). If the tracks have been more substantially altered, the \"mo:remix\" relationship type is more appropriate. "
  {:db/ident :mo/djmix_of,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Indicates that all (or most of) the tracks of a musical work or the expression of a musical work were mixed together from all (or most of) the tracks from another musical work or the expression of a musical work to form a so called DJ-Mix. \n    \nThe tracks might have been altered by pitching (so that the tempo of one track matches the tempo of the following track) and fading (so that one track blends in smoothly with the other). If the tracks have been more substantially altered, the \"mo:remix\" relationship type is more appropriate. ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "djmix_of",
   :rdfs/subPropertyOf :mo/derived_from,
   :vs/term_status "unstable"})

(def djmixed
  "Used to relate an artist who djmixed a musical work or the expression of a musical work. \n    \nThe artist usually selected the tracks, chose their sequence, and slightly changed them by fading (so that one track blends in smoothly with the other) or pitching (so that the tempo of one track matches the tempo of the following track). This applies to a 'Mixtape' in which all tracks were DJ-mixed together into one single long track. "
  {:db/ident :mo/djmixed,
   :mo/level "1",
   :owl/inverseOf :mo/djmixed_by,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to relate an artist who djmixed a musical work or the expression of a musical work. \n    \nThe artist usually selected the tracks, chose their sequence, and slightly changed them by fading (so that one track blends in smoothly with the other) or pitching (so that the tempo of one track matches the tempo of the following track). This applies to a 'Mixtape' in which all tracks were DJ-mixed together into one single long track. ",
   :rdfs/domain :mo/MusicArtist,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "djmixed",
   :rdfs/range :mo/Signal,
   :vs/term_status "unstable"})

(def djmixed_by
  "Used to relate a work or the expression of a work to an artist who djmixed it. \n    \nThe artist usually selected the tracks, chose their sequence, and slightly changed them by fading (so that one track blends in smoothly with the other) or pitching (so that the tempo of one track matches the tempo of the following track). This applies to a 'Mixtape' in which all tracks were DJ-mixed together into one single long track. "
  {:db/ident :mo/djmixed_by,
   :mo/level "1",
   :owl/inverseOf :mo/djmixed,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to relate a work or the expression of a work to an artist who djmixed it. \n    \nThe artist usually selected the tracks, chose their sequence, and slightly changed them by fading (so that one track blends in smoothly with the other) or pitching (so that the tempo of one track matches the tempo of the following track). This applies to a 'Mixtape' in which all tracks were DJ-mixed together into one single long track. ",
   :rdfs/domain :mo/Signal,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "djmixed_by",
   :rdfs/range :mo/MusicArtist,
   :vs/term_status "unstable"})

(def download
  "\n                This property can be used to link from a person to the website where they make their works available, or from\n                a manifestation (a track or an album, for example) to a web page where it is available for\n                download.\n        \n        It is better to use one of the three sub-properties instead of this one in order to specify wether the\n        content can be accessed for free (mo:freedownload), if it is just free preview material (mo:previewdownload), or\n        if it can be accessed for some money (mo:paiddownload) (this includes links to the Amazon store, for example).\n\n                This property MUST be used only if the content is just available through a web page (holding, for example\n                a Flash application) - it is better to link to actual content directly through the use of mo:available_as and\n                mo:Stream, mo:Torrent or mo:ED2K, etc. Therefore, Semantic Web user agents that don't know how to read HTML and even\n                less to rip streams from Flash applications can still access the audio content.\n        "
  {:db/ident :mo/download,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n                This property can be used to link from a person to the website where they make their works available, or from\n                a manifestation (a track or an album, for example) to a web page where it is available for\n                download.\n        \n        It is better to use one of the three sub-properties instead of this one in order to specify wether the\n        content can be accessed for free (mo:freedownload), if it is just free preview material (mo:previewdownload), or\n        if it can be accessed for some money (mo:paiddownload) (this includes links to the Amazon store, for example).\n\n                This property MUST be used only if the content is just available through a web page (holding, for example\n                a Flash application) - it is better to link to actual content directly through the use of mo:available_as and\n                mo:Stream, mo:Torrent or mo:ED2K, etc. Therefore, Semantic Web user agents that don't know how to read HTML and even\n                less to rip streams from Flash applications can still access the audio content.\n        ",
   :rdfs/domain
   {:owl/unionOf [:frbr/Manifestation :foaf/Agent :mo/CorporateBody],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "download",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :foaf/isPrimaryTopicOf,
   :vs/term_status "stable"})

(def duration
  "The duration of a track or a signal in ms"
  {:db/ident         :mo/duration,
   :mo/level         "1",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "The duration of a track or a signal in ms",
   :rdfs/domain      {:owl/unionOf [:mo/Track :mo/Signal],
                      :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/range       :xsd/float,
   :vs/term_status   "testing"})

(def ean
  "The European Article Number (EAN) is a universal identifier for products, commonly printed in form of barcodes on them. The numbers represented by those codes can either be 8 or 13 digits long, with the 13-digit-version being most common. EANs form a superset of the North American Universal Product Code (UPC) as every UPC can be made an EAN by adding a leading zero to it. Additionally every EAN is also a Japanese Article Number (JAN). The identifiers were formerly assigned by EAN International which merged with Uniform Code Council (UCC, the guys behind the UPCs) and Electronic Commerce Council of Canada (ECCC) to become GS1. "
  {:db/ident :mo/ean,
   :mo/level "1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The European Article Number (EAN) is a universal identifier for products, commonly printed in form of barcodes on them. The numbers represented by those codes can either be 8 or 13 digits long, with the 13-digit-version being most common. EANs form a superset of the North American Universal Product Code (UPC) as every UPC can be made an EAN by adding a leading zero to it. Additionally every EAN is also a Japanese Article Number (JAN). The identifiers were formerly assigned by EAN International which merged with Uniform Code Council (UCC, the guys behind the UPCs) and Electronic Commerce Council of Canada (ECCC) to become GS1. ",
   :rdfs/domain :mo/Release,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "ean",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :mo/gtin,
   :vs/term_status "testing"})

(def encodes
  "\n        Relates a MusicalItem (a track on a particular CD, an audio file, a stream somewhere) to the signal it encodes.\n\n        This is usually a lower-resolution version of the master signal (issued from a Recording event).\n    "
  {:db/ident :mo/encodes,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n        Relates a MusicalItem (a track on a particular CD, an audio file, a stream somewhere) to the signal it encodes.\n\n        This is usually a lower-resolution version of the master signal (issued from a Recording event).\n    ",
   :rdfs/domain :mo/MusicalItem,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "encodes",
   :rdfs/range :mo/Signal,
   :vs/term_status "unstable"})

(def encoding
  "Method used to convert analog electronic signals into digital format such as \"MP3 CBR @ 128kbps\", \"OGG @ 160kbps\", \"FLAC\", etc."
  {:db/ident :mo/encoding,
   :mo/level "1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Method used to convert analog electronic signals into digital format such as \"MP3 CBR @ 128kbps\", \"OGG @ 160kbps\", \"FLAC\", etc.",
   :rdfs/domain :mo/AudioFile,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "encoding",
   :rdfs/range :rdfs/Literal,
   :vs/term_status "unstable"})

(def engineer
  "Relates a performance or a recording to the engineer involved"
  {:db/ident :mo/engineer,
   :mo/level "2",
   :owl/inverseOf :mo/engineered,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Relates a performance or a recording to the engineer involved",
   :rdfs/domain
   {:owl/unionOf [:mo/Performance :mo/Recording :mo/RecordingSession],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf :event/agent,
   :vs/term_status "stable"})

(def engineered
  "Relates agents to the performances/recordings they were engineering in"
  {:db/ident :mo/engineered,
   :mo/level "2",
   :owl/inverseOf :mo/engineer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Relates agents to the performances/recordings they were engineering in",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "engineered",
   :rdfs/range
   {:owl/unionOf [:mo/Performance :mo/Recording :mo/RecordingSession],
    :rdf/type    :owl/Class},
   :rdfs/subPropertyOf #{:event/isAgentIn :bio/event},
   :vs/term_status "unstable"})

(def ep
  "\n            An EP\n    "
  {:db/ident         :mo/ep,
   :dc11/description "\n            An EP\n    ",
   :dc11/title       "ep",
   :mo/level         "1",
   :rdf/type         :mo/ReleaseType,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"}})

(def eventHomePage
  {:db/ident       :mo/eventHomePage,
   :owl/equivalentProperty :mo/event_homepage,
   :rdf/type       :owl/ObjectProperty,
   :vs/term_status "deprecated"})

(def event_homepage
  "Links a particular event to a web page"
  {:db/ident           :mo/event_homepage,
   :mo/level           "2",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       "Links a particular event to a web page",
   :rdfs/domain        :event/Event,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label         "event homepage",
   :rdfs/range         :foaf/Document,
   :rdfs/subPropertyOf :foaf/isPrimaryTopicOf,
   :vs/term_status     "stable"})

(def exchange_item
  "A person, a group of person or an organization exchanging an exemplar of a single manifestation."
  {:db/ident :mo/exchange_item,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A person, a group of person or an organization exchanging an exemplar of a single manifestation.",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "exchange_item",
   :rdfs/range :frbr/Item,
   :vs/term_status "stable"})

(def fanpage
  "Used to link an artist to a fan-created webpage devoted to that artist."
  {:db/ident :mo/fanpage,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to link an artist to a fan-created webpage devoted to that artist.",
   :rdfs/domain :mo/MusicArtist,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "fanpage",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :foaf/isPrimaryTopicOf,
   :vs/term_status "stable"})

(def free_download
  "\n        This property can be used to link from a person to the website where they make their works available, or from\n        a manifestation (a track or an album, for example) to a web page where it is available for free \n        download.\n\n        This property MUST be used only if the content is just available through a web page (holding, for example\n        a Flash application) - it is better to link to actual content directly through the use of mo:available_as and \n        mo:Stream, mo:Torrent or mo:ED2K, etc. Therefore, Semantic Web user agents that don't know how to read HTML and even\n        less to rip streams from Flash applications can still access the audio content.\n    "
  {:db/ident :mo/free_download,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n        This property can be used to link from a person to the website where they make their works available, or from\n        a manifestation (a track or an album, for example) to a web page where it is available for free \n        download.\n\n        This property MUST be used only if the content is just available through a web page (holding, for example\n        a Flash application) - it is better to link to actual content directly through the use of mo:available_as and \n        mo:Stream, mo:Torrent or mo:ED2K, etc. Therefore, Semantic Web user agents that don't know how to read HTML and even\n        less to rip streams from Flash applications can still access the audio content.\n    ",
   :rdfs/domain
   {:owl/unionOf [:frbr/Manifestation :foaf/Agent :mo/CorporateBody],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "free download",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf #{:foaf/isPrimaryTopicOf :mo/download},
   :vs/term_status "stable"})

(def freedownload
  {:db/ident         :mo/freedownload,
   :owl/equivalentProperty :mo/free_download,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :vs/term_status   "deprecated"})

(def genre
  "\n        Associates an event (like a performance or a recording) to a particular musical genre.\n        Further version of this property may also include works and scores in the domain.\n    "
  {:db/ident :mo/genre,
   :mo/level "2",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n        Associates an event (like a performance or a recording) to a particular musical genre.\n        Further version of this property may also include works and scores in the domain.\n    ",
   :rdfs/domain {:owl/unionOf [:foaf/Agent
                               :mo/Performance
                               :mo/Arrangement
                               :mo/Composition
                               :mo/Recording
                               :mo/RecordingSession
                               :mo/MusicalWork
                               :mo/MusicalExpression
                               :mo/MusicalManifestation
                               :mo/MusicalItem],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "genre",
   :rdfs/range :mo/Genre,
   :rdfs/subPropertyOf :ao/genre,
   :vs/term_status "stable"})

(def grid
  "The Global Release Identifier (GRid) is a system for uniquely identifying Releases of music over electronic networks (that is, online stores where you can buy music as digital files). As that it can be seen as the equivalent of the BarCode (or more correctly the GTIN) as found on physical releases of music. Like the ISRC (a code for identifying single recordings as found on releases) it was developed by the IFPI but it does not appear to be a standard of the ISO."
  {:db/ident :mo/grid,
   :mo/level "1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The Global Release Identifier (GRid) is a system for uniquely identifying Releases of music over electronic networks (that is, online stores where you can buy music as digital files). As that it can be seen as the equivalent of the BarCode (or more correctly the GTIN) as found on physical releases of music. Like the ISRC (a code for identifying single recordings as found on releases) it was developed by the IFPI but it does not appear to be a standard of the ISO.",
   :rdfs/domain :mo/Release,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "GRid",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :mo/uuid,
   :vs/term_status "testing"})

(def group
  "Relates a membership event with the corresponding group"
  {:db/ident         :mo/group,
   :mo/level         "1",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Relates a membership event with the corresponding group",
   :rdfs/domain      :mo/Membership,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label       "group",
   :rdfs/range       :foaf/Group,
   :vs/term_status   "testing"})

(def gtin
  "GTIN is a grouping term for EANs and UPCs. In common speech those are called barcodes although the barcodes are just a representation of those identifying numbers."
  {:db/ident :mo/gtin,
   :mo/level "1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "GTIN is a grouping term for EANs and UPCs. In common speech those are called barcodes although the barcodes are just a representation of those identifying numbers.",
   :rdfs/domain :mo/Release,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "gtin",
   :rdfs/range :xsd/string,
   :vs/term_status "testing"})

(def has_track
  {:db/ident         :mo/has_track,
   :owl/equivalentProperty :mo/track,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :vs/term_status   "deprecated"})

(def headliner
  "Relates a performance to the headliner(s) involved"
  {:db/ident           :mo/headliner,
   :mo/level           "2",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       "Relates a performance to the headliner(s) involved",
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label         "headliner",
   :rdfs/subPropertyOf :mo/performer,
   :vs/term_status     "testing"})

(def homepage
  "Links an artist, a record, etc. to a corresponding web page"
  {:db/ident :mo/homepage,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Links an artist, a record, etc. to a corresponding web page",
   :rdfs/domain {:owl/unionOf [:mo/MusicalWork
                               :mo/MusicArtist
                               :mo/MusicalExpression
                               :mo/MusicalManifestation
                               :mo/MusicalItem],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "homepage",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :foaf/isPrimaryTopicOf,
   :vs/term_status "stable"})

(def image
  "Indicates a pictorial image (JPEG, GIF, PNG, Etc.) of a musical work, the expression of a musical work, the manifestation of a work or the examplar of a manifestation."
  {:db/ident :mo/image,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Indicates a pictorial image (JPEG, GIF, PNG, Etc.) of a musical work, the expression of a musical work, the manifestation of a work or the examplar of a manifestation.",
   :rdfs/domain {:owl/unionOf [:mo/MusicalWork
                               :mo/MusicArtist
                               :mo/MusicalExpression
                               :mo/MusicalManifestation
                               :mo/MusicalItem],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "image",
   :rdfs/range :foaf/Image,
   :rdfs/subPropertyOf :foaf/depiction,
   :vs/term_status "stable"})

(def imdb
  "Used to link an artist, a musical work or the expression of a musical work to their equivalent page on IMDb, the InternetMovieDatabase."
  {:db/ident :mo/imdb,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to link an artist, a musical work or the expression of a musical work to their equivalent page on IMDb, the InternetMovieDatabase.",
   :rdfs/domain {:owl/unionOf [:mo/MusicalWork
                               :mo/MusicalExpression
                               :mo/MusicalManifestation
                               :mo/MusicArtist
                               :mo/CorporateBody],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "imdb",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :foaf/isPrimaryTopicOf,
   :vs/term_status "stable"})

(def instrument
  "Relates a performance to a musical instrument involved"
  {:db/ident           :mo/instrument,
   :mo/level           "2",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       "Relates a performance to a musical instrument involved",
   :rdfs/domain        :mo/Performance,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/range         :mo/Instrument,
   :rdfs/subPropertyOf :event/factor,
   :vs/term_status     "stable"})

(def interpreter
  "Adds an involved music artist, who interpreted, remixed, or otherwise modified an existing signal, which resulted in the signal that is here the subject of this relation."
  {:db/ident :mo/interpreter,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Adds an involved music artist, who interpreted, remixed, or otherwise modified an existing signal, which resulted in the signal that is here the subject of this relation.",
   :rdfs/domain :mo/Signal,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "has interpeter",
   :rdfs/range :mo/MusicArtist,
   :vs/term_status "testing"})

(def interview
  "\n        Recording of the questioning of a person.\n        This is a type of MusicalManifestation defined by the musical industry.\n    "
  {:db/ident :mo/interview,
   :dc11/description
   "\n        Recording of the questioning of a person.\n        This is a type of MusicalManifestation defined by the musical industry.\n    ",
   :dc11/title "interview",
   :mo/level "1",
   :rdf/type :mo/ReleaseType,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"}})

(def ipi
  "The Interested Parties Information Code (IPI) is an ISO standard similar to ISBNs for identifying the people or groups with some involvement with a particular musical work / compositions."
  {:db/ident :mo/ipi,
   :mo/level "1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The Interested Parties Information Code (IPI) is an ISO standard similar to ISBNs for identifying the people or groups with some involvement with a particular musical work / compositions.",
   :rdfs/domain :mo/MusicArtist,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "ipi",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :mo/uuid,
   :vs/term_status "testing"})

(def ismn
  "The International Standard Music Number (ISMN) is an ISO standard similar to ISBNs for identifying printed music publications"
  {:db/ident :mo/ismn,
   :mo/level "1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The International Standard Music Number (ISMN) is an ISO standard similar to ISBNs for identifying printed music publications",
   :rdfs/domain
   {:owl/unionOf [:mo/PublishedLyrics :mo/PublishedLibretto :mo/PublishedScore],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "ismn",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :mo/uuid,
   :vs/term_status "testing"})

(def isrc
  "\n    The ISRC (International Standard Recording Code) is the international identification system for sound recordings and music videorecordings. \n    Each ISRC is a unique and permanent identifier for a specific recording which can be permanently encoded into a product as its digital fingerprint. \n    Encoded ISRC provide the means to automatically identify recordings for royalty payments.\n    "
  {:db/ident :mo/isrc,
   :mo/level "1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "\n    The ISRC (International Standard Recording Code) is the international identification system for sound recordings and music videorecordings. \n    Each ISRC is a unique and permanent identifier for a specific recording which can be permanently encoded into a product as its digital fingerprint. \n    Encoded ISRC provide the means to automatically identify recordings for royalty payments.\n    ",
   :rdfs/domain :mo/Signal,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "isrc",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :mo/uuid,
   :vs/term_status "stable"})

(def iswc
  "Links a musical work to the corresponding ISWC number"
  {:db/ident           :mo/iswc,
   :mo/level           "1",
   :rdf/type           :owl/DatatypeProperty,
   :rdfs/comment       "Links a musical work to the corresponding ISWC number",
   :rdfs/domain        :mo/MusicalWork,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label         "iswc",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :mo/uuid,
   :vs/term_status     "testing"})

(def item
  "\n                Relates a musical manifestation to a musical item (this album, and my particular cd) holding the\n                entire manifestation, and not just a part of it.\n        "
  {:db/ident :mo/item,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n                Relates a musical manifestation to a musical item (this album, and my particular cd) holding the\n                entire manifestation, and not just a part of it.\n        ",
   :rdfs/domain :mo/MusicalManifestation,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/range :mo/MusicalItem,
   :rdfs/subPropertyOf :mo/available_as,
   :vs/term_status "testing"})

(def key
  "\n        Indicated the key used by the musicians during a performance, or the key of a MusicalWork.\n        Any of 24 major or minor diatonic scales that provide the tonal framework for a piece of music."
  {:db/ident :mo/key,
   :mo/level "2",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n        Indicated the key used by the musicians during a performance, or the key of a MusicalWork.\n        Any of 24 major or minor diatonic scales that provide the tonal framework for a piece of music.",
   :rdfs/domain {:owl/unionOf [:mo/MusicalWork :mo/Performance :mo/Signal],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "key",
   :rdfs/range :keys/Key,
   :vs/term_status "stable"})

(def label
  "Associates a release event with the label releasing the record"
  {:db/ident :mo/label,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Associates a release event with the label releasing the record",
   :rdfs/domain {:owl/unionOf [:mo/Release :mo/MusicArtist],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "label",
   :rdfs/range :mo/Label,
   :vs/term_status "testing"})

(def lc
  "The Label Code (LC) was introduced in 1977 by the IFPI (International Federation of Phonogram and Videogram Industries) in order to unmistakably identify the different record labels (see Introduction, Record labels) for rights purposes. The Label Code consists historically of 4 figures, presently being extended to 5 figures, preceded by LC and a dash (e.g. LC-0193 = Electrola; LC-0233 = His Master's Voice). Note that the number of countries using the LC is limited, and that the code given on the item is not always accurate."
  {:db/ident :mo/lc,
   :mo/level "1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The Label Code (LC) was introduced in 1977 by the IFPI (International Federation of Phonogram and Videogram Industries) in order to unmistakably identify the different record labels (see Introduction, Record labels) for rights purposes. The Label Code consists historically of 4 figures, presently being extended to 5 figures, preceded by LC and a dash (e.g. LC-0193 = Electrola; LC-0233 = His Master's Voice). Note that the number of countries using the LC is limited, and that the code given on the item is not always accurate.",
   :rdfs/domain :mo/Label,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "lc",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :mo/uuid,
   :vs/term_status "testing"})

(def level
  "\n        This annotation property associates to a particular Music Ontology term the corresponding\n        expressiveness level. These levels can be:\n\n            - 1: Only editorial/Musicbrainz type information\n            - 2: Workflow information\n            - 3: Even decomposition\n        \n        This property is mainly used for specification generation.\n    "
  {:db/ident :mo/level,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   "\n        This annotation property associates to a particular Music Ontology term the corresponding\n        expressiveness level. These levels can be:\n\n            - 1: Only editorial/Musicbrainz type information\n            - 2: Workflow information\n            - 3: Even decomposition\n        \n        This property is mainly used for specification generation.\n    ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "level"})

(def licence
  "Used to link a work or the expression of a work to the license under which they can be manipulated (downloaded, modified, etc). \n    \nThis is usually used to link to a Creative Commons licence."
  {:db/ident :mo/licence,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to link a work or the expression of a work to the license under which they can be manipulated (downloaded, modified, etc). \n    \nThis is usually used to link to a Creative Commons licence.",
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression :frbr/Manifestation],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "licence",
   :rdfs/range :cc/License,
   :vs/term_status "stable"})

(def listened
  "Relates agents to the performances they were listening in"
  {:db/ident :mo/listened,
   :mo/level "2",
   :owl/inverseOf :mo/listener,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Relates agents to the performances they were listening in",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "listened",
   :rdfs/range :mo/Performance,
   :rdfs/subPropertyOf #{:event/isAgentIn :bio/event},
   :vs/term_status "unstable"})

(def listener
  "Relates a performance to the listener involved"
  {:db/ident           :mo/listener,
   :mo/level           "2",
   :owl/inverseOf      :mo/listened,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       "Relates a performance to the listener involved",
   :rdfs/domain        :mo/Performance,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/range         :foaf/Agent,
   :rdfs/subPropertyOf :event/agent,
   :vs/term_status     "stable"})

(def live
  "\n        A musical manifestation that was recorded live.\n        This is a type of MusicalManifestation defined by the musical industry."
  {:db/ident :mo/live,
   :dc11/description
   "\n        A musical manifestation that was recorded live.\n        This is a type of MusicalManifestation defined by the musical industry.",
   :dc11/title "live",
   :mo/level "1",
   :rdf/type :mo/ReleaseType,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"}})

(def lyrics
  "Associates lyrics with a musical work"
  {:db/ident         :mo/lyrics,
   :mo/level         "2",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Associates lyrics with a musical work",
   :rdfs/domain      :mo/MusicalWork,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label       "lyrics",
   :rdfs/range       :mo/Lyrics,
   :vs/term_status   "testing"})

(def mailorder
  "Used to link a musical work or the expression of a musical work to a website where people can buy a copy of the musical manifestation."
  {:db/ident :mo/mailorder,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to link a musical work or the expression of a musical work to a website where people can buy a copy of the musical manifestation.",
   :rdfs/domain
   {:owl/unionOf [:frbr/Manifestation :mo/MusicArtist :mo/CorporateBody],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "mailorder",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :foaf/isPrimaryTopicOf,
   :vs/term_status "stable"})

(def mashup_of
  "Indicates that musical works or the expressions of a musical work were mashed up on this album or track. \n    \nThis means that two musical works or the expressions of a musical work by different artists are mixed together, over each other, or otherwise combined into a single musical work (usually by a third artist, the remixer)."
  {:db/ident :mo/mashup_of,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Indicates that musical works or the expressions of a musical work were mashed up on this album or track. \n    \nThis means that two musical works or the expressions of a musical work by different artists are mixed together, over each other, or otherwise combined into a single musical work (usually by a third artist, the remixer).",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "mashup_of",
   :rdfs/subPropertyOf :mo/derived_from,
   :vs/term_status "unstable"})

(def media_type
  "The mediatype (file format or MIME type, or physical medium) of a musical manifestation, e.g. a MP3, CD or vinyl."
  {:db/ident :mo/media_type,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The mediatype (file format or MIME type, or physical medium) of a musical manifestation, e.g. a MP3, CD or vinyl.",
   :rdfs/domain :mo/MusicalManifestation,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "has media type",
   :rdfs/range :dcterms/MediaType,
   :rdfs/subPropertyOf :dcterms/format,
   :vs/term_status "testing"})

(def medley_of
  "Indicates that a musical expression is a medley of several other musical expressions. \n    \nThis means that the orignial musical expression were rearranged to create a new musical expression in the form of a medley. "
  {:db/ident :mo/medley_of,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Indicates that a musical expression is a medley of several other musical expressions. \n    \nThis means that the orignial musical expression were rearranged to create a new musical expression in the form of a medley. ",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "medley_of",
   :rdfs/subPropertyOf :mo/derived_from,
   :vs/term_status "unstable"})

(def member
  "\n        Indicates a member of a musical group\n    "
  {:db/ident           :mo/member,
   :mo/level           "1",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       "\n        Indicates a member of a musical group\n    ",
   :rdfs/domain        :mo/MusicGroup,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label         "member",
   :rdfs/range         :foaf/Agent,
   :rdfs/subPropertyOf :foaf/member,
   :vs/term_status     "stable"})

(def member_of
  "Inverse of the foaf:member property"
  {:db/ident         :mo/member_of,
   :mo/level         "1",
   :owl/inverseOf    :foaf/member,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Inverse of the foaf:member property",
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label       "member_of",
   :rdfs/range       :foaf/Group,
   :vs/term_status   "unstable"})

(def membership
  "Relates an agent with related membership events"
  {:db/ident         :mo/membership,
   :mo/level         "1",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Relates an agent with related membership events",
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label       "membership",
   :rdfs/range       :mo/Membership,
   :vs/term_status   "testing"})

(def meter
  "Associates a musical work or a score with its meter"
  {:db/ident         :mo/meter,
   :mo/level         "2",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "Associates a musical work or a score with its meter",
   :rdfs/domain      {:owl/unionOf [:mo/MusicalWork :mo/Score],
                      :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label       "meter",
   :vs/term_status   "testing"})

(def movement
  "Indicates that a musical work has movements"
  {:db/ident         :mo/movement,
   :mo/level         "2",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Indicates that a musical work has movements",
   :rdfs/domain      :mo/MusicalWork,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label       "has_movement",
   :rdfs/range       :mo/Movement,
   :vs/term_status   "unstable"})

(def movementNum
  {:db/ident :mo/movementNum,
   :owl/equivalentProperty :mo/movement_number,
   :rdf/type :owl/DatatypeProperty})

(def movement_number
  "Indicates the position of a movement in a musical work."
  {:db/ident         :mo/movement_number,
   :mo/level         "2",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "Indicates the position of a movement in a musical work.",
   :rdfs/domain      :mo/Movement,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label       "movement number",
   :rdfs/range       :xsd/int,
   :vs/term_status   "unstable"})

(def musicbrainz
  "\n        Linking an agent, a track or a record to its corresponding Musicbrainz page.\n        "
  {:db/ident :mo/musicbrainz,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n        Linking an agent, a track or a record to its corresponding Musicbrainz page.\n        ",
   :rdfs/domain {:owl/unionOf [:mo/MusicalWork
                               :mo/MusicalManifestation
                               :foaf/Agent
                               :mo/Signal],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "musicbrainz",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :foaf/isPrimaryTopicOf,
   :vs/term_status "stable"})

(def musicbrainz_guid
  "Links an object to the corresponding Musicbrainz identifier"
  {:db/ident :mo/musicbrainz_guid,
   :mo/level "1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Links an object to the corresponding Musicbrainz identifier",
   :rdfs/domain {:owl/unionOf [:mo/MusicArtist
                               :mo/Track
                               :mo/Record
                               :mo/SignalGroup
                               :mo/Signal
                               :mo/ReleaseEvent
                               :mo/Label],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "Musicbrainz GUID",
   :rdfs/subPropertyOf :mo/uuid,
   :vs/term_status "testing"})

(def musicmoz
  "Used to link an artist, a musical work or the expression of a musical work to its corresponding MusicMoz page."
  {:db/ident :mo/musicmoz,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to link an artist, a musical work or the expression of a musical work to its corresponding MusicMoz page.",
   :rdfs/domain {:owl/unionOf [:mo/MusicArtist
                               :mo/MusicalWork
                               :mo/MusicalExpression
                               :mo/MusicalManifestation],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "musicmoz",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :foaf/isPrimaryTopicOf,
   :vs/term_status "stable"})

(def myspace
  "Used to link a person to its corresponding MySpace page."
  {:db/ident :mo/myspace,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Used to link a person to its corresponding MySpace page.",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "myspace",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :foaf/isPrimaryTopicOf,
   :vs/term_status "stable"})

(def official
  "Any musical work or the expression of a musical work officially sanctioned by the artist and/or their corporate body."
  {:db/ident :mo/official,
   :dc11/description
   "Any musical work or the expression of a musical work officially sanctioned by the artist and/or their corporate body.",
   :dc11/title "official",
   :mo/level "1",
   :rdf/type :mo/ReleaseStatus,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"}})

(def olga
  "Used to link a track to a tabulature file for track in the On-Line Guitar Archive."
  {:db/ident :mo/olga,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to link a track to a tabulature file for track in the On-Line Guitar Archive.",
   :rdfs/domain :mo/Track,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "olga",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :foaf/isPrimaryTopicOf,
   :vs/term_status "stable"})

(def onlinecommunity
  "Used to link a person with an online community web page like a blog, a wiki, a forum, a livejournal page, Etc."
  {:db/ident :mo/onlinecommunity,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to link a person with an online community web page like a blog, a wiki, a forum, a livejournal page, Etc.",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "onlinecommunity",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :foaf/isPrimaryTopicOf,
   :vs/term_status "stable"})

(def opus
  "\n        Used to define a creative work, especially a musical composition numbered to designate the order of a composer's works.\n    "
  {:db/ident :mo/opus,
   :mo/level "2",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "\n        Used to define a creative work, especially a musical composition numbered to designate the order of a composer's works.\n    ",
   :rdfs/domain :mo/MusicalWork,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "opus",
   :rdfs/range :rdfs/Literal,
   :vs/term_status "stable"})

(def origin
  "Relates an artist to its geographic origin"
  {:db/ident         :mo/origin,
   :mo/level         "1",
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Relates an artist to its geographic origin",
   :rdfs/domain      :mo/MusicArtist,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label       "origin",
   :rdfs/range       :geo/SpatialThing,
   :vs/term_status   "testing"})

(def other_release_of
  "Indicates that two musical manifestations are essentially the same."
  {:db/ident :mo/other_release_of,
   :mo/level "1",
   :rdf/type #{:owl/SymmetricProperty :owl/ObjectProperty},
   :rdfs/comment
   "Indicates that two musical manifestations are essentially the same.",
   :rdfs/domain :mo/MusicalManifestation,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "other_release_of",
   :rdfs/range :mo/MusicalManifestation,
   :vs/term_status "unstable"})

(def paid_download
  "\n                Provide a link from an artist to a web page where all of that artist's musical work is available for some money,\n                or a link from a manifestation (record/track, for example) to a web page providing a paid access to this manifestation.\n        "
  {:db/ident :mo/paid_download,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n                Provide a link from an artist to a web page where all of that artist's musical work is available for some money,\n                or a link from a manifestation (record/track, for example) to a web page providing a paid access to this manifestation.\n        ",
   :rdfs/domain
   {:owl/unionOf [:frbr/Manifestation :mo/MusicArtist :mo/CorporateBody],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "paid download",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf #{:foaf/isPrimaryTopicOf :mo/download},
   :vs/term_status "stable"})

(def paiddownload
  {:db/ident         :mo/paiddownload,
   :owl/equivalentProperty :mo/paid_download,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :vs/term_status   "deprecated"})

(def performance_of
  "\n        Associates a Performance to a musical work or an arrangement that is being used as a factor in it.\n        For example, I might use this property to attach the Magic Flute musical work to \n        a particular Performance.\n    "
  {:db/ident :mo/performance_of,
   :mo/level "2",
   :owl/inverseOf :mo/performed_in,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n        Associates a Performance to a musical work or an arrangement that is being used as a factor in it.\n        For example, I might use this property to attach the Magic Flute musical work to \n        a particular Performance.\n    ",
   :rdfs/domain :mo/Performance,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "performance of",
   :rdfs/range {:owl/unionOf [:mo/Score :mo/MusicalWork],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :event/factor,
   :vs/term_status "unstable"})

(def performed
  "Relates agents to the performances they were performing in"
  {:db/ident :mo/performed,
   :mo/level "2",
   :owl/inverseOf :mo/performer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Relates agents to the performances they were performing in",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "performed",
   :rdfs/range :mo/Performance,
   :rdfs/subPropertyOf #{:event/isAgentIn :bio/event},
   :vs/term_status "unstable"})

(def performed_in
  "\n        Associates a Musical Work or an Score to Performances in which they were\n        a factor. For example, I might use this property in order to \n        associate the Magic Flute to a particular performance at the Opera\n        Bastille last year."
  {:db/ident :mo/performed_in,
   :mo/level "2",
   :owl/inverseOf :mo/performance_of,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n        Associates a Musical Work or an Score to Performances in which they were\n        a factor. For example, I might use this property in order to \n        associate the Magic Flute to a particular performance at the Opera\n        Bastille last year.",
   :rdfs/domain {:owl/unionOf [:mo/Score :mo/MusicalWork],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "performed in",
   :rdfs/range :mo/Performance,
   :rdfs/subPropertyOf :event/isFactorOf,
   :vs/term_status "unstable"})

(def performer
  "Relates a performance to the performers involved"
  {:db/ident           :mo/performer,
   :mo/level           "2",
   :owl/inverseOf      :mo/performed,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       "Relates a performance to the performers involved",
   :rdfs/domain        :mo/Performance,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/range         :foaf/Agent,
   :rdfs/subPropertyOf :event/agent,
   :vs/term_status     "stable"})

(def possess_item
  "A person, a group of person or an organization possessing an exemplar of a single manifestation."
  {:db/ident :mo/possess_item,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A person, a group of person or an organization possessing an exemplar of a single manifestation.",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "possess_item",
   :rdfs/range :frbr/Item,
   :vs/term_status "stable"})

(def preview
  "\n                Relates a musical manifestation to a musical item (this album, and my particular cd), which holds\n                a preview of the manifestation (eg. one track for an album, or a snippet for a track)\n        "
  {:db/ident :mo/preview,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n                Relates a musical manifestation to a musical item (this album, and my particular cd), which holds\n                a preview of the manifestation (eg. one track for an album, or a snippet for a track)\n        ",
   :rdfs/domain :mo/MusicalManifestation,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/range :mo/MusicalItem,
   :rdfs/subPropertyOf :mo/available_as,
   :vs/term_status "testing"})

(def preview_download
  "\n                This property can be used to link from a person to the website where they make previews of their works available, or from\n                a manifestation (a track or an album, for example) to a web page where a preview download is available.\n\n                This property MUST be used only if the content is just available through a web page (holding, for example\n                a Flash application) - it is better to link to actual content directly through the use of mo:available_as and\n                mo:Stream, mo:Torrent or mo:ED2K, etc. Therefore, Semantic Web user agents that don't know how to read HTML and even\n                less to rip streams from Flash applications can still access the audio content.\n        "
  {:db/ident :mo/preview_download,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n                This property can be used to link from a person to the website where they make previews of their works available, or from\n                a manifestation (a track or an album, for example) to a web page where a preview download is available.\n\n                This property MUST be used only if the content is just available through a web page (holding, for example\n                a Flash application) - it is better to link to actual content directly through the use of mo:available_as and\n                mo:Stream, mo:Torrent or mo:ED2K, etc. Therefore, Semantic Web user agents that don't know how to read HTML and even\n                less to rip streams from Flash applications can still access the audio content.\n        ",
   :rdfs/domain
   {:owl/unionOf [:frbr/Manifestation :foaf/Agent :mo/CorporateBody],
    :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "preview download",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf #{:foaf/isPrimaryTopicOf :mo/download},
   :vs/term_status "stable"})

(def primary_instrument
  "Indicates that an artist primarily plays an instrument, or that a member was primarily playing a particular instrument during his membership"
  {:db/ident :mo/primary_instrument,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Indicates that an artist primarily plays an instrument, or that a member was primarily playing a particular instrument during his membership",
   :rdfs/domain {:owl/unionOf [:mo/Membership :foaf/Agent],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "primary instrument",
   :rdfs/range :mo/Instrument,
   :vs/term_status "testing"})

(def produced
  "Used to relate an person or a group of person who produced the manifestation of a work."
  {:db/ident :mo/produced,
   :mo/level "1",
   :owl/inverseOf :mo/producer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to relate an person or a group of person who produced the manifestation of a work.",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "produced",
   :rdfs/range :mo/MusicalManifestation,
   :vs/term_status "stable"})

(def produced_score
  "\n        Associates an arrangement or a composition event to a score product (score here does not refer to a published score, but more\n        an abstract arrangement of a particular work).\n    "
  {:db/ident :mo/produced_score,
   :mo/level "2",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n        Associates an arrangement or a composition event to a score product (score here does not refer to a published score, but more\n        an abstract arrangement of a particular work).\n    ",
   :rdfs/domain {:owl/unionOf [:mo/Composition :mo/Arrangement],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "produced score",
   :rdfs/range :mo/Score,
   :rdfs/subPropertyOf :event/product,
   :vs/term_status "unstable"})

(def produced_signal
  "\n                Associates a Recording to the outputted signal.\n        "
  {:db/ident :mo/produced_signal,
   :mo/level "2",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n                Associates a Recording to the outputted signal.\n        ",
   :rdfs/domain :mo/Recording,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "produced signal",
   :rdfs/range :mo/Signal,
   :rdfs/subPropertyOf :event/product,
   :vs/term_status "stable"})

(def produced_signal_group
  "Associates a recording session with a group of master signals produced by it."
  {:db/ident :mo/produced_signal_group,
   :mo/level "2",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Associates a recording session with a group of master signals produced by it.",
   :rdfs/domain :mo/RecordingSession,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "produced signal group",
   :rdfs/range :mo/SignalGroup,
   :rdfs/subPropertyOf :event/product,
   :vs/term_status "testing"})

(def produced_sound
  "\n                Associates a Performance to a physical Sound that is being produced by it.\n        "
  {:db/ident :mo/produced_sound,
   :mo/level "2",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n                Associates a Performance to a physical Sound that is being produced by it.\n        ",
   :rdfs/domain :mo/Performance,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "produced sound",
   :rdfs/range :mo/Sound,
   :rdfs/subPropertyOf :event/product,
   :vs/term_status "stable"})

(def produced_work
  "\n                Associates a composition event to the produced MusicalWork. For example,\n                this property could link the event corresponding to the composition of the\n                Magic Flute in 1782 to the Magic Flute musical work itself. This musical work\n                can then be used in particular performances.\n        "
  {:db/ident :mo/produced_work,
   :mo/level "2",
   :owl/inverseOf :mo/composed_in,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n                Associates a composition event to the produced MusicalWork. For example,\n                this property could link the event corresponding to the composition of the\n                Magic Flute in 1782 to the Magic Flute musical work itself. This musical work\n                can then be used in particular performances.\n        ",
   :rdfs/domain :mo/Composition,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "produced work",
   :rdfs/range :mo/MusicalWork,
   :rdfs/subPropertyOf :event/product,
   :vs/term_status "stable"})

(def producer
  "Used to relate the manifestation of a work to a person or a group of person who produced it."
  {:db/ident :mo/producer,
   :mo/level "1",
   :owl/inverseOf :mo/produced,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to relate the manifestation of a work to a person or a group of person who produced it.",
   :rdfs/domain :mo/MusicalManifestation,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "producer",
   :rdfs/range :foaf/Agent,
   :vs/term_status "stable"})

(def producesSignal
  {:db/ident         :mo/producesSignal,
   :owl/equivalentProperty :mo/produced_signal,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :vs/term_status   "deprecated"})

(def producesSound
  {:db/ident         :mo/producesSound,
   :owl/equivalentProperty :mo/produced_sound,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :vs/term_status   "deprecated"})

(def producesWork
  {:db/ident :mo/producesWork,
   :owl/equivalentProperty :mo/produced_work,
   :rdf/type :owl/ObjectProperty})

(def productOfComposition
  {:db/ident         :mo/productOfComposition,
   :owl/equivalentProperty :mo/composed_in,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :vs/term_status   "deprecated"})

(def promotion
  "A giveaway musical work or the expression of a musical work intended to promote an upcoming official musical work or the expression of a musical work."
  {:db/ident :mo/promotion,
   :dc11/description
   "A giveaway musical work or the expression of a musical work intended to promote an upcoming official musical work or the expression of a musical work.",
   :dc11/title "promotion",
   :mo/level "1",
   :rdf/type :mo/ReleaseStatus,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"}})

(def publicationOf
  {:db/ident       :mo/publicationOf,
   :owl/equivalentProperty :mo/publication_of,
   :rdf/type       :owl/ObjectProperty,
   :vs/term_status "deprecated"})

(def publication_of
  "Link a particular manifestation to the related signal, score, libretto, or lyrics"
  {:db/ident :mo/publication_of,
   :mo/level "1",
   :owl/inverseOf :mo/published_as,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Link a particular manifestation to the related signal, score, libretto, or lyrics",
   :rdfs/domain :mo/MusicalManifestation,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "publication of",
   :rdfs/range :mo/MusicalExpression,
   :vs/term_status "unstable"})

(def published
  "Used to relate an person or a group of person who published the manifestation of a work."
  {:db/ident :mo/published,
   :mo/level "1",
   :owl/inverseOf :mo/publisher,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to relate an person or a group of person who published the manifestation of a work.",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "published",
   :rdfs/range :mo/MusicalManifestation,
   :vs/term_status "unstable"})

(def publishedAs
  {:db/ident       :mo/publishedAs,
   :owl/equivalentProperty :mo/published_as,
   :rdf/type       :owl/ObjectProperty,
   :vs/term_status "deprecated"})

(def published_as
  "\n        Links a musical expression (e.g. a signal or a score) to one of its manifestations (e.g. a track on a particular record or a published score).\n    "
  {:db/ident :mo/published_as,
   :mo/level "1",
   :owl/inverseOf :mo/publication_of,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n        Links a musical expression (e.g. a signal or a score) to one of its manifestations (e.g. a track on a particular record or a published score).\n    ",
   :rdfs/domain :mo/MusicalExpression,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "published as",
   :rdfs/range :mo/MusicalManifestation,
   :rdfs/subPropertyOf :frbr/embodiment,
   :vs/term_status "stable"})

(def publisher
  "Used to relate a musical manifestation to a person or a group of person who published it."
  {:db/ident :mo/publisher,
   :mo/level "1",
   :owl/inverseOf :mo/published,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to relate a musical manifestation to a person or a group of person who published it.",
   :rdfs/domain :mo/MusicalManifestation,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "publisher",
   :rdfs/range :foaf/Agent,
   :vs/term_status "unstable"})

(def publishingLocation
  {:db/ident       :mo/publishingLocation,
   :owl/equivalentProperty :mo/publishing_location,
   :rdf/type       :owl/ObjectProperty,
   :vs/term_status "deprecated"})

(def publishing_location
  "\n        Relates a musical manifestation to its publication location.\n        "
  {:db/ident :mo/publishing_location,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n        Relates a musical manifestation to its publication location.\n        ",
   :rdfs/domain :mo/MusicalManifestation,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "publishingLocation",
   :rdfs/range :geo/SpatialThing,
   :vs/term_status "stable"})

(def puid
  "\n        Link a signal to the PUIDs associated with it, that is, PUID computed from MusicalItems (mo:AudioFile) \n        derived from this signal.\n        PUIDs (Portable Unique IDentifier) are the IDs used in the \n        proprietary MusicDNS AudioFingerprinting system which is operated by MusicIP.\n\n        Using PUIDs, one (with some luck) can identify the Signal object associated with a particular audio file, therefore allowing\n        to access further information (on which release this track is featured? etc.). Using some more metadata one can identify\n        the particular Track corresponding to the audio file (a track on a particular release)."
  {:db/ident :mo/puid,
   :mo/level "1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "\n        Link a signal to the PUIDs associated with it, that is, PUID computed from MusicalItems (mo:AudioFile) \n        derived from this signal.\n        PUIDs (Portable Unique IDentifier) are the IDs used in the \n        proprietary MusicDNS AudioFingerprinting system which is operated by MusicIP.\n\n        Using PUIDs, one (with some luck) can identify the Signal object associated with a particular audio file, therefore allowing\n        to access further information (on which release this track is featured? etc.). Using some more metadata one can identify\n        the particular Track corresponding to the audio file (a track on a particular release).",
   :rdfs/domain :mo/Signal,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "puid",
   :rdfs/range :xsd/string,
   :vs/term_status "stable"})

(def record
  "Associates a release with the records it contains. A single release can be associated with multiple records, for example for a multi-disc release."
  {:db/ident :mo/record,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Associates a release with the records it contains. A single release can be associated with multiple records, for example for a multi-disc release.",
   :rdfs/domain :mo/Release,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "released record",
   :rdfs/range :mo/Record,
   :vs/term_status "testing"})

(def record_count
  "Associates a release with the number of records it contains, e.g. the number of discs it contains in the case of a multi-disc release."
  {:db/ident :mo/record_count,
   :mo/level "1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Associates a release with the number of records it contains, e.g. the number of discs it contains in the case of a multi-disc release.",
   :rdfs/domain :mo/Release,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "record count",
   :rdfs/range :xsd/int,
   :vs/term_status "testing"})

(def record_number
  "Indicates the position of a record in a release (e.g. a 2xLP, etc.)."
  {:db/ident :mo/record_number,
   :mo/level "1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Indicates the position of a record in a release (e.g. a 2xLP, etc.).",
   :rdfs/domain :mo/Record,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "has record number",
   :rdfs/range :xsd/nonNegativeInteger,
   :vs/term_status "testing"})

(def record_side
  "Associates the side on a vinyl record, where a track is located, e.g. A, B, C, etc. This property can then also be used \nin conjunction with mo:track_number, so that one can infer e.g. \"A1\", that means, track number 1 on side A."
  {:db/ident :mo/record_side,
   :mo/level "1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Associates the side on a vinyl record, where a track is located, e.g. A, B, C, etc. This property can then also be used \nin conjunction with mo:track_number, so that one can infer e.g. \"A1\", that means, track number 1 on side A.",
   :rdfs/domain :mo/Track,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "has record side",
   :rdfs/range :xsd/string,
   :vs/term_status "testing"})

(def recordedAs
  {:db/ident :mo/recordedAs,
   :owl/equivalentProperty :mo/recorded_as,
   :rdf/type :owl/ObjectProperty})

(def recorded_as
  "\n        This is a shortcut property, allowing to bypass all the Sound/Recording steps. This property\n        allows to directly link a Performance to the recorded Signal. This is recommended for \"normal\"\n        users. However, advanced users wanting to express things such as the location of the microphone will\n        have to create this shortcut as well as the whole workflow, in order to let the \"normal\" users access\n        simply the, well, simple information:-) .\n    "
  {:db/ident :mo/recorded_as,
   :mo/level "2",
   :owl/inverseOf :mo/records,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n        This is a shortcut property, allowing to bypass all the Sound/Recording steps. This property\n        allows to directly link a Performance to the recorded Signal. This is recommended for \"normal\"\n        users. However, advanced users wanting to express things such as the location of the microphone will\n        have to create this shortcut as well as the whole workflow, in order to let the \"normal\" users access\n        simply the, well, simple information:-) .\n    ",
   :rdfs/domain :mo/Performance,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "recorded as",
   :rdfs/range :mo/Signal,
   :vs/term_status "stable"})

(def recorded_in
  "\n            Associates a physical Sound to a Recording event where it is being used \n        in order to produce a signal. For example, I might use this property to \n        associate the sound produced by a particular performance of the magic flute\n        to a given recording, done using my cell-phone.\n    "
  {:db/ident :mo/recorded_in,
   :mo/level "2",
   :owl/inverseOf :mo/recording_of,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n            Associates a physical Sound to a Recording event where it is being used \n        in order to produce a signal. For example, I might use this property to \n        associate the sound produced by a particular performance of the magic flute\n        to a given recording, done using my cell-phone.\n    ",
   :rdfs/domain :mo/Sound,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "recorded in",
   :rdfs/range :mo/Recording,
   :rdfs/subPropertyOf :event/isFactorOf,
   :vs/term_status "unstable"})

(def recording_of
  "\n            Associates a Recording event to a physical Sound being recorded.\n                For example, I might use this property to\n                associate a given recording, done using my cell phone, to the \n        sound produced by a particular performance of the magic flute.\n    "
  {:db/ident :mo/recording_of,
   :mo/level "2",
   :owl/inverseOf :mo/recorded_in,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n            Associates a Recording event to a physical Sound being recorded.\n                For example, I might use this property to\n                associate a given recording, done using my cell phone, to the \n        sound produced by a particular performance of the magic flute.\n    ",
   :rdfs/domain :mo/Recording,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "recorded sound",
   :rdfs/range :mo/Sound,
   :rdfs/subPropertyOf :event/factor,
   :vs/term_status "stable"})

(def records
  "\n        This is the inverse of the shortcut property recordedAs, allowing to relate directly a performance\n        to a signal.\n    "
  {:db/ident :mo/records,
   :mo/level "2",
   :owl/inverseOf :mo/recordedAs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n        This is the inverse of the shortcut property recordedAs, allowing to relate directly a performance\n        to a signal.\n    ",
   :rdfs/domain :mo/Signal,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "records",
   :rdfs/range :mo/Performance,
   :vs/term_status "unstable"})

(def release
  "Associates a release with the corresponding release event"
  {:db/ident :mo/release,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Associates a release with the corresponding release event",
   :rdfs/domain :mo/ReleaseEvent,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "release",
   :rdfs/range :mo/Release,
   :rdfs/subPropertyOf :event/product,
   :vs/term_status "testing"})

(def releaseStatus
  {:db/ident       :mo/releaseStatus,
   :owl/equivalentProperty :mo/release_status,
   :rdf/type       :owl/ObjectProperty,
   :vs/term_status "deprecated"})

(def releaseType
  {:db/ident       :mo/releaseType,
   :owl/equivalentProperty :mo/release_type,
   :rdf/type       :owl/ObjectProperty,
   :vs/term_status "deprecated"})

(def release_status
  "\n                Relates a musical manifestation to its release status (bootleg, ...)\n        "
  {:db/ident :mo/release_status,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n                Relates a musical manifestation to its release status (bootleg, ...)\n        ",
   :rdfs/domain :mo/MusicalManifestation,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/range :mo/ReleaseStatus,
   :vs/term_status "stable"})

(def release_type
  "\n        Relates a musical manifestation to its release type (interview, spoken word, album, ...)\n    "
  {:db/ident :mo/release_type,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n        Relates a musical manifestation to its release type (interview, spoken word, album, ...)\n    ",
   :rdfs/domain :mo/MusicalManifestation,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/range :mo/ReleaseType,
   :vs/term_status "stable"})

(def remaster_of
  "This relates two musical work or the expression of a musical work, where one is a remaster of the other. \n    \nA remaster is a new version made for release from source recordings that were earlier released separately. This is usually done to improve the audio quality or adjust for more modern playback equipment. The process generally doesn't involve changing the music in any artistically important way. It may, however, result in tracks that are a few seconds longer or shorter."
  {:db/ident :mo/remaster_of,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "This relates two musical work or the expression of a musical work, where one is a remaster of the other. \n    \nA remaster is a new version made for release from source recordings that were earlier released separately. This is usually done to improve the audio quality or adjust for more modern playback equipment. The process generally doesn't involve changing the music in any artistically important way. It may, however, result in tracks that are a few seconds longer or shorter.",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "remaster_of",
   :rdfs/subPropertyOf :mo/derived_from,
   :vs/term_status "unstable"})

(def remix
  "\n        Musical manifestation that primarily contains remixed material. \n        This is a type of MusicalManifestation defined by the musical industry.\n    "
  {:db/ident :mo/remix,
   :dc11/description
   "\n        Musical manifestation that primarily contains remixed material. \n        This is a type of MusicalManifestation defined by the musical industry.\n    ",
   :dc11/title "remix",
   :mo/level "1",
   :rdf/type :mo/ReleaseType,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"}})

(def remix_of
  "Used to relate the remix of a musical work in a substantially altered version produced by mixing together individual tracks or segments of an original musical source work."
  {:db/ident :mo/remix_of,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to relate the remix of a musical work in a substantially altered version produced by mixing together individual tracks or segments of an original musical source work.",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "remix_of",
   :rdfs/subPropertyOf :mo/derived_from,
   :vs/term_status "unstable"})

(def remixed
  "Used to relate an artist who remixed a musical work or the expression of a musical work. \n    \nThis involves taking just one other musical work and using audio editing to make it sound like a significantly different, but usually still recognisable, song. It can be used to link an artist to a single song that they remixed, or, if they remixed an entire musical work."
  {:db/ident :mo/remixed,
   :mo/level "1",
   :owl/inverseOf :mo/remixer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to relate an artist who remixed a musical work or the expression of a musical work. \n    \nThis involves taking just one other musical work and using audio editing to make it sound like a significantly different, but usually still recognisable, song. It can be used to link an artist to a single song that they remixed, or, if they remixed an entire musical work.",
   :rdfs/domain :mo/MusicArtist,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "remixed",
   :rdfs/range :mo/Signal,
   :vs/term_status "unstable"})

(def remixer
  "Used to relate a musical work or the expression of a musical work to an artist who remixed it. \n    \nThis involves taking just one other musical work and using audio editing to make it sound like a significantly different, but usually still recognisable, song. It can be used to link an artist to a single song that they remixed, or, if they remixed an entire musical work."
  {:db/ident :mo/remixer,
   :mo/level "1",
   :owl/inverseOf :mo/remixed,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to relate a musical work or the expression of a musical work to an artist who remixed it. \n    \nThis involves taking just one other musical work and using audio editing to make it sound like a significantly different, but usually still recognisable, song. It can be used to link an artist to a single song that they remixed, or, if they remixed an entire musical work.",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "remixer",
   :rdfs/subPropertyOf :mo/interpreter,
   :vs/term_status "unstable"})

(def review
  "Used to link a work or the expression of a work to a review. \n    \nThe review does not have to be open content, as long as it is accessible to the general internet population."
  {:db/ident :mo/review,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to link a work or the expression of a work to a review. \n    \nThe review does not have to be open content, as long as it is accessible to the general internet population.",
   :rdfs/domain {:owl/unionOf [:frbr/Work :frbr/Expression :frbr/Manifestation],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "review",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :foaf/isPrimaryTopicOf,
   :vs/term_status "stable"})

(def sampleRate
  {:db/ident       :mo/sampleRate,
   :owl/equivalentProperty :mo/sample_rate,
   :rdf/type       :owl/DatatypeProperty,
   :vs/term_status "deprecated"})

(def sample_rate
  "\n        Associates a digital signal to its sample rate. It might be easier to express it this way instead of\n        defining a timeline map:-) Range is xsd:float.\n    "
  {:db/ident :mo/sample_rate,
   :mo/level "1",
   :rdf/type #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/comment
   "\n        Associates a digital signal to its sample rate. It might be easier to express it this way instead of\n        defining a timeline map:-) Range is xsd:float.\n    ",
   :rdfs/domain :mo/DigitalSignal,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/range :xsd/float,
   :vs/term_status "stable"})

(def sampled
  "Used to relate an artist who sampled a Signal."
  {:db/ident         :mo/sampled,
   :mo/level         "1",
   :owl/inverseOf    :mo/sampler,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     "Used to relate an artist who sampled a Signal.",
   :rdfs/domain      :mo/MusicArtist,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label       "sampled",
   :rdfs/range       :mo/Signal,
   :vs/term_status   "unstable"})

(def sampledVersionOf
  {:db/ident         :mo/sampledVersionOf,
   :owl/equivalentProperty :mo/sampled_version_of,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :vs/term_status   "deprecated"})

(def sampled_version
  "\n        Associates an analog signal with a sampled version of it\n    "
  {:db/ident :mo/sampled_version,
   :mo/level "2",
   :owl/inverseOf :mo/sampled_version_of,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n        Associates an analog signal with a sampled version of it\n    ",
   :rdfs/domain :mo/AnalogSignal,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "sampled version",
   :rdfs/range :mo/DigitalSignal,
   :vs/term_status "stable"})

(def sampled_version_of
  "\n        Associates a digital signal with the analog version of it\n    "
  {:db/ident :mo/sampled_version_of,
   :mo/level "2",
   :owl/inverseOf :mo/sampled_version,
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/comment
   "\n        Associates a digital signal with the analog version of it\n    ",
   :rdfs/domain :mo/DigitalSignal,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "sampled version of",
   :rdfs/range :mo/AnalogSignal,
   :rdfs/subPropertyOf :mo/derived_from,
   :vs/term_status "stable"})

(def sampler
  "Used to relate the signal of a musical work to an artist who sampled it."
  {:db/ident :mo/sampler,
   :mo/level "1",
   :owl/inverseOf :mo/sampled,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to relate the signal of a musical work to an artist who sampled it.",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "sampler",
   :rdfs/subPropertyOf :mo/interpreter,
   :vs/term_status "unstable"})

(def sell_item
  "A person, a group of person or an organization selling an exemplar of a single manifestation."
  {:db/ident :mo/sell_item,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A person, a group of person or an organization selling an exemplar of a single manifestation.",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "sell_item",
   :rdfs/range :frbr/Item,
   :vs/term_status "stable"})

(def signal
  "Associates a group of signals with one of the signals it contains"
  {:db/ident :mo/signal,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Associates a group of signals with one of the signals it contains",
   :rdfs/domain :mo/SignalGroup,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "signal",
   :rdfs/range :mo/Signal,
   :vs/term_status "testing"})

(def signalTime
  {:db/ident         :mo/signalTime,
   :owl/equivalentProperty :mo/time,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :vs/term_status   "deprecated"})

(def similar_to
  "\n            A similarity relationships between two objects (so far, either an agent, a signal or a genre, but\n        this could grow).\n        This relationship is pretty general and doesn't make any assumptions on how the similarity claim\n        was derived.\n        Such similarity statements can come from a range of different sources (Musicbrainz similarities between\n        artists, or coming from some automatic content analysis).\n        However, the origin of such statements should be kept using a named graph approach - and ultimately, the \n        documents providing such statements should attach some metadata to themselves (confidence of the claim, etc.).\n        "
  {:db/ident :mo/similar_to,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n            A similarity relationships between two objects (so far, either an agent, a signal or a genre, but\n        this could grow).\n        This relationship is pretty general and doesn't make any assumptions on how the similarity claim\n        was derived.\n        Such similarity statements can come from a range of different sources (Musicbrainz similarities between\n        artists, or coming from some automatic content analysis).\n        However, the origin of such statements should be kept using a named graph approach - and ultimately, the \n        documents providing such statements should attach some metadata to themselves (confidence of the claim, etc.).\n        ",
   :rdfs/domain {:owl/unionOf [:foaf/Agent
                               :mo/MusicalWork
                               :mo/MusicalExpression
                               :mo/MusicalManifestation
                               :mo/MusicalItem
                               :mo/Genre],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "similar_to",
   :rdfs/range {:owl/unionOf [:foaf/Agent
                              :mo/MusicalWork
                              :mo/MusicalExpression
                              :mo/MusicalManifestation
                              :mo/MusicalItem
                              :mo/Genre],
                :rdf/type    :owl/Class},
   :vs/term_status "unstable"})

(def singer
  "Relates a performance to an involved singer"
  {:db/ident           :mo/singer,
   :mo/level           "2",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       "Relates a performance to an involved singer",
   :rdfs/domain        :mo/Performance,
   :rdfs/isDefinedBy   {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/range         :foaf/Agent,
   :rdfs/subPropertyOf :mo/performer,
   :vs/term_status     "stable"})

(def single
  "A single or record single is a type of release, typically a recording of two tracks. In most cases, the single is a song that is released separately from an album, but it can still appear on an album."
  {:db/ident :mo/single,
   :dc11/description
   "A single or record single is a type of release, typically a recording of two tracks. In most cases, the single is a song that is released separately from an album, but it can still appear on an album.",
   :dc11/title "single",
   :mo/level "1",
   :rdf/type :mo/ReleaseType,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"}})

(def soundtrack
  "\n        Sound recording on a narrow strip of a motion picture film.\n        This is a type of MusicalManifestation defined by the musical industry.\n    "
  {:db/ident :mo/soundtrack,
   :dc11/description
   "\n        Sound recording on a narrow strip of a motion picture film.\n        This is a type of MusicalManifestation defined by the musical industry.\n    ",
   :dc11/title "soundtrack",
   :mo/level "1",
   :rdf/type :mo/ReleaseType,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"}})

(def spokenword
  "\n        Spoken word is a form of music or artistic performance in which lyrics, poetry, or stories are spoken rather than sung. \n        Spoken-word is often done with a musical background, but emphasis is kept on the speaker.\n        This is a type of MusicalManifestation defined by the musical industry.\n    "
  {:db/ident :mo/spokenword,
   :dc11/description
   "\n        Spoken word is a form of music or artistic performance in which lyrics, poetry, or stories are spoken rather than sung. \n        Spoken-word is often done with a musical background, but emphasis is kept on the speaker.\n        This is a type of MusicalManifestation defined by the musical industry.\n    ",
   :dc11/title "spoken word",
   :mo/level "1",
   :rdf/type :mo/ReleaseType,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"}})

(def supporting_musician
  "Used to relate an artist doing long-time instrumental or vocal support for another artist."
  {:db/ident :mo/supporting_musician,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Used to relate an artist doing long-time instrumental or vocal support for another artist.",
   :rdfs/domain :mo/MusicArtist,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "supporting_musician",
   :rdfs/range :mo/MusicArtist,
   :vs/term_status "unstable"})

(def tempo
  "\n        Rate of speed or pace of music. Tempo markings are traditionally given in Italian; \n        common markings include: grave (solemn; very, very slow); largo (broad; very slow); \n        adagio (quite slow); andante (a walking pace); moderato (moderate); allegro (fast; cheerful); \n        vivace (lively); presto (very fast); accelerando (getting faster); ritardando (getting slower); \n        and a tempo (in time; returning to the original pace).\n    "
  {:db/ident :mo/tempo,
   :mo/level "2",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "\n        Rate of speed or pace of music. Tempo markings are traditionally given in Italian; \n        common markings include: grave (solemn; very, very slow); largo (broad; very slow); \n        adagio (quite slow); andante (a walking pace); moderato (moderate); allegro (fast; cheerful); \n        vivace (lively); presto (very fast); accelerando (getting faster); ritardando (getting slower); \n        and a tempo (in time; returning to the original pace).\n    ",
   :rdfs/domain {:owl/unionOf [:mo/MusicalWork :mo/Performance :mo/Signal],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "tempo",
   :rdfs/range :xsd/string,
   :vs/term_status "stable"})

(def text
  "Associates lyrics with their text."
  {:db/ident         :mo/text,
   :mo/level         "2",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "Associates lyrics with their text.",
   :rdfs/domain      :mo/Lyrics,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label       "text",
   :vs/term_status   "testing"})

(def time
  "\n        Associates a Signal to a time object - its actual domain\n    "
  {:db/ident :mo/time,
   :mo/level "1",
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/comment
   "\n        Associates a Signal to a time object - its actual domain\n    ",
   :rdfs/domain :mo/Signal,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "time",
   :rdfs/range :time/TemporalEntity,
   :vs/term_status "stable"})

(def track
  "Indicates a part of a musical manifestation - in this particular case, a track."
  {:db/ident :mo/track,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Indicates a part of a musical manifestation - in this particular case, a track.",
   :rdfs/domain :mo/Record,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "track",
   :rdfs/range :mo/Track,
   :vs/term_status "stable"})

(def trackNum
  {:db/ident         :mo/trackNum,
   :owl/equivalentProperty :mo/track_number,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :vs/term_status   "deprecated"})

(def track_count
  "The track count of a record"
  {:db/ident         :mo/track_count,
   :mo/level         "1",
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     "The track count of a record",
   :rdfs/domain      :mo/Record,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label       "track count",
   :rdfs/range       :xsd/int,
   :vs/term_status   "testing"})

(def track_number
  "Indicates the position of a track on a record medium (a CD, etc.)."
  {:db/ident :mo/track_number,
   :mo/level "1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Indicates the position of a track on a record medium (a CD, etc.).",
   :rdfs/domain :mo/Track,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "track number",
   :rdfs/range :xsd/nonNegativeInteger,
   :vs/term_status "stable"})

(def translation_of
  "Indicates that a work or the expression of a work has translated or transliterated into another expression of a work."
  {:db/ident :mo/translation_of,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Indicates that a work or the expression of a work has translated or transliterated into another expression of a work.",
   :rdfs/domain :frbr/Expression,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "translation_of",
   :rdfs/range :frbr/Expression,
   :vs/term_status "unstable"})

(def tribute_to
  "Indicates a musical work or the expression of a musical work that is a tribute to an artist - normally consisting of music being composed by the artist but performed by other artists. "
  {:db/ident :mo/tribute_to,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Indicates a musical work or the expression of a musical work that is a tribute to an artist - normally consisting of music being composed by the artist but performed by other artists. ",
   :rdfs/domain :mo/MusicalManifestation,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "tribute_to",
   :rdfs/range :mo/MusicArtist,
   :vs/term_status "unstable"})

(def trmid
  "\n        Indicates the TRMID of a track.\n        TRM IDs are MusicBrainz' old AudioFingerprinting system. \n        TRM (TRM Recognizes Music) IDs are (somewhat) unique ids that represent \n        the audio signature of a musical piece (see AudioFingerprint).\n    "
  {:db/ident :mo/trmid,
   :mo/level "1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "\n        Indicates the TRMID of a track.\n        TRM IDs are MusicBrainz' old AudioFingerprinting system. \n        TRM (TRM Recognizes Music) IDs are (somewhat) unique ids that represent \n        the audio signature of a musical piece (see AudioFingerprint).\n    ",
   :rdfs/domain :mo/Signal,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "trmid",
   :rdfs/range :xsd/string,
   :vs/term_status "stable"})

(def upc
  "UPC stands for \"Universal Product Code\", which was the original barcode used in the United States and Canada. The UPC (now officially EAN.UCC-12 is a numerical method of identifying products without redundancy worldwide for all types of products in the retail sector. The EAN is a superset of the original UPC increasing the digits to 13 with the prefix 0 reserved for UPC. As of 2005, manufacturers are only allowed to use the new 13-digit codes on their items, rather than having two separate numbers."
  {:db/ident :mo/upc,
   :mo/level "1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "UPC stands for \"Universal Product Code\", which was the original barcode used in the United States and Canada. The UPC (now officially EAN.UCC-12 is a numerical method of identifying products without redundancy worldwide for all types of products in the retail sector. The EAN is a superset of the original UPC increasing the digits to 13 with the prefix 0 reserved for UPC. As of 2005, manufacturers are only allowed to use the new 13-digit codes on their items, rather than having two separate numbers.",
   :rdfs/domain :mo/Release,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "upc",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :mo/gtin,
   :vs/term_status "testing"})

(def usedInPerformance
  {:db/ident         :mo/usedInPerformance,
   :owl/equivalentProperty :mo/performed_in,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :vs/term_status   "deprecated"})

(def usedInRecording
  {:db/ident         :mo/usedInRecording,
   :owl/equivalentProperty :mo/recorded_in,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :vs/term_status   "deprecated"})

(def usesSound
  {:db/ident         :mo/usesSound,
   :owl/equivalentProperty :mo/recording_of,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :vs/term_status   "deprecated"})

(def usesWork
  {:db/ident         :mo/usesWork,
   :owl/equivalentProperty :mo/performance_of,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :vs/term_status   "deprecated"})

(def uuid
  "\n            Links an object to an universally unique identifier for it.\n    "
  {:db/ident :mo/uuid,
   :mo/level "1",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "\n            Links an object to an universally unique identifier for it.\n    ",
   :rdfs/domain :owl/Thing,
   :rdfs/label "universally unique identifier",
   :rdfs/subPropertyOf :dcterms/identifier,
   :vs/term_status "testing"})

(def want_item
  "A person, a group of person or an organization wanting an exemplar of a single manifestation."
  {:db/ident :mo/want_item,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A person, a group of person or an organization wanting an exemplar of a single manifestation.",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "want_item",
   :rdfs/range :frbr/Item,
   :vs/term_status "stable"})

(def wikipedia
  "\n        Used to link an work, an expression of a work, a manifestation of a work, \n        a person, an instrument or a musical genre to its corresponding WikiPedia page. \n        The full URL should be used, not just the WikiName.\n    "
  {:db/ident :mo/wikipedia,
   :mo/level "1",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "\n        Used to link an work, an expression of a work, a manifestation of a work, \n        a person, an instrument or a musical genre to its corresponding WikiPedia page. \n        The full URL should be used, not just the WikiName.\n    ",
   :rdfs/domain {:owl/unionOf [:frbr/Work
                               :frbr/Expression
                               :frbr/Manifestation
                               :frbr/Item
                               :foaf/Agent
                               :mo/Instrument
                               :mo/Genre],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/ontology/mo/"},
   :rdfs/label "wikipedia",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :foaf/isPrimaryTopicOf,
   :vs/term_status "stable"})