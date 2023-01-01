(ns net.wikipunk.rdf.dcmitype
  "DCMI Type Vocabulary"
  {:dcat/downloadURL
   "https://www.dublincore.org/specifications/dublin-core/dcmi-terms/dublin_core_type.ttl",
   :dcterms/modified #inst "2012-06-14T00:00:00.000-04:00",
   :dcterms/publisher "http://purl.org/dc/aboutdcmi#DCMI",
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "DCMI Type Vocabulary"},
   :rdf/ns-prefix-map {"dcam"     "http://purl.org/dc/dcam/",
                       "dcmitype" "http://purl.org/dc/dcmitype/",
                       "dcterms"  "http://purl.org/dc/terms/",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"     "http://www.w3.org/2004/02/skos/core#"},
   :rdf/type :rdfa/PrefixMapping,
   :rdf/uri "http://purl.org/dc/dcmitype/",
   :rdfa/prefix "dcmitype",
   :rdfa/uri "http://purl.org/dc/dcmitype/"})

(def Collection
  "A collection is described as a group; its parts may also be separately described."
  {:db/ident :dcmitype/Collection,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A collection is described as a group; its parts may also be separately described."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "An aggregation of resources."},
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Collection"}})

(def Dataset
  "Examples include lists, tables, and databases. A dataset may be useful for direct machine processing."
  {:db/ident :dcmitype/Dataset,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Examples include lists, tables, and databases.  A dataset may be useful for direct machine processing."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Data encoded in a defined structure."},
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Dataset"}})

(def Event
  "Metadata for an event provides descriptive information that is the basis for discovery of the purpose, location, duration, and responsible agents associated with an event. Examples include an exhibition, webcast, conference, workshop, open day, performance, battle, trial, wedding, tea party, conflagration."
  {:db/ident :dcmitype/Event,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Metadata for an event provides descriptive information that is the basis for discovery of the purpose, location, duration, and responsible agents associated with an event. Examples include an exhibition, webcast, conference, workshop, open day, performance, battle, trial, wedding, tea party, conflagration."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A non-persistent, time-based occurrence."},
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Event"}})

(def Image
  "Examples include images and photographs of physical objects, paintings, prints, drawings, other images and graphics, animations and moving pictures, film, diagrams, maps, musical notation. Note that Image may include both electronic and physical representations."
  {:db/ident :dcmitype/Image,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Examples include images and photographs of physical objects, paintings, prints, drawings, other images and graphics, animations and moving pictures, film, diagrams, maps, musical notation.  Note that Image may include both electronic and physical representations."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A visual representation other than text."},
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Image"}})

(def InteractiveResource
  "Examples include forms on Web pages, applets, multimedia learning objects, chat services, or virtual reality environments."
  {:db/ident :dcmitype/InteractiveResource,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Examples include forms on Web pages, applets, multimedia learning objects, chat services, or virtual reality environments."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A resource requiring interaction from the user to be understood, executed, or experienced."},
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Interactive Resource"}})

(def MovingImage
  "Examples include animations, movies, television programs, videos, zoetropes, or visual output from a simulation. Instances of the type Moving Image must also be describable as instances of the broader type Image."
  {:db/ident :dcmitype/MovingImage,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Examples include animations, movies, television programs, videos, zoetropes, or visual output from a simulation.  Instances of the type Moving Image must also be describable as instances of the broader type Image."},
   :dcterms/issued #inst "2003-11-18T00:00:00.000-05:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A series of visual representations imparting an impression of motion when shown in succession."},
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Moving Image"},
   :rdfs/subClassOf :dcmitype/Image})

(def PhysicalObject
  "Note that digital representations of, or surrogates for, these objects should use Image, Text or one of the other types."
  {:db/ident :dcmitype/PhysicalObject,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Note that digital representations of, or surrogates for, these objects should use Image, Text or one of the other types."},
   :dcterms/issued #inst "2002-07-13T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "An inanimate, three-dimensional object or substance."},
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Physical Object"}})

(def Service
  "Examples include a photocopying service, a banking service, an authentication service, interlibrary loans, a Z39.50 or Web server."
  {:db/ident :dcmitype/Service,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Examples include a photocopying service, a banking service, an authentication service, interlibrary loans, a Z39.50 or Web server."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value "A system that provides one or more functions."},
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Service"}})

(def Software
  "Examples include a C source file, MS-Windows .exe executable, or Perl script."
  {:db/ident :dcmitype/Software,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Examples include a C source file, MS-Windows .exe executable, or Perl script."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value "A computer program in source or compiled form."},
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Software"}})

(def Sound
  "Examples include a music playback file format, an audio compact disc, and recorded speech or sounds."
  {:db/ident :dcmitype/Sound,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Examples include a music playback file format, an audio compact disc, and recorded speech or sounds."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A resource primarily intended to be heard."},
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sound"}})

(def StillImage
  "Examples include paintings, drawings, graphic designs, plans and maps. Recommended best practice is to assign the type Text to images of textual materials. Instances of the type Still Image must also be describable as instances of the broader type Image."
  {:db/ident :dcmitype/StillImage,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Examples include paintings, drawings, graphic designs, plans and maps. Recommended best practice is to assign the type Text to images of textual materials. Instances of the type Still Image must also be describable as instances of the broader type Image."},
   :dcterms/issued #inst "2003-11-18T00:00:00.000-05:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A static visual representation."},
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Still Image"},
   :rdfs/subClassOf :dcmitype/Image})

(def Text
  "Examples include books, letters, dissertations, poems, newspapers, articles, archives of mailing lists. Note that facsimiles or images of texts are still of the genre Text."
  {:db/ident :dcmitype/Text,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Examples include books, letters, dissertations, poems, newspapers, articles, archives of mailing lists. Note that facsimiles or images of texts are still of the genre Text."},
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "A resource consisting primarily of words for reading."},
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Text"}})