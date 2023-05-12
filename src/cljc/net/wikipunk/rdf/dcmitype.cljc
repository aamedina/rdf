(ns net.wikipunk.rdf.dcmitype
  "DCMI Type Vocabulary"
  {:dcat/downloadURL
   "https://www.dublincore.org/specifications/dublin-core/dcmi-terms/dublin_core_type.ttl",
   :dcterms/modified #inst "2012-06-14T00:00:00.000-04:00",
   :dcterms/publisher "http://purl.org/dc/aboutdcmi#DCMI",
   :dcterms/title "DCMI Type Vocabulary",
   :rdf/ns-prefix-map {"dcam"     "http://purl.org/dc/dcam/",
                       "dcmitype" "http://purl.org/dc/dcmitype/",
                       "dcterms"  "http://purl.org/dc/terms/",
                       "owl"      "http://www.w3.org/2002/07/owl#",
                       "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
                       "skos"     "http://www.w3.org/2004/02/skos/core#"},
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "dcmitype",
   :rdfa/uri "http://purl.org/dc/dcmitype/"})

(def Collection
  "A collection is described as a group; its parts may also be separately described."
  {:db/ident :dcmitype/Collection,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   "A collection is described as a group; its parts may also be separately described.",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment "An aggregation of resources.",
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label "Collection",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/Collection]})

(def Dataset
  "Examples include lists, tables, and databases. A dataset may be useful for direct machine processing."
  {:db/ident :dcmitype/Dataset,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   "Examples include lists, tables, and databases.  A dataset may be useful for direct machine processing.",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment "Data encoded in a defined structure.",
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label "Dataset",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/Dataset]})

(def Event
  "Metadata for an event provides descriptive information that is the basis for discovery of the purpose, location, duration, and responsible agents associated with an event. Examples include an exhibition, webcast, conference, workshop, open day, performance, battle, trial, wedding, tea party, conflagration."
  {:db/ident :dcmitype/Event,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   "Metadata for an event provides descriptive information that is the basis for discovery of the purpose, location, duration, and responsible agents associated with an event. Examples include an exhibition, webcast, conference, workshop, open day, performance, battle, trial, wedding, tea party, conflagration.",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment "A non-persistent, time-based occurrence.",
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label "Event",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/Event]})

(def Image
  "Examples include images and photographs of physical objects, paintings, prints, drawings, other images and graphics, animations and moving pictures, film, diagrams, maps, musical notation. Note that Image may include both electronic and physical representations."
  {:db/ident :dcmitype/Image,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   "Examples include images and photographs of physical objects, paintings, prints, drawings, other images and graphics, animations and moving pictures, film, diagrams, maps, musical notation.  Note that Image may include both electronic and physical representations.",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment "A visual representation other than text.",
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label "Image",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/Image]})

(def InteractiveResource
  "Examples include forms on Web pages, applets, multimedia learning objects, chat services, or virtual reality environments."
  {:db/ident :dcmitype/InteractiveResource,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   "Examples include forms on Web pages, applets, multimedia learning objects, chat services, or virtual reality environments.",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A resource requiring interaction from the user to be understood, executed, or experienced.",
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label "Interactive Resource",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/InteractiveResource]})

(def MovingImage
  "Examples include animations, movies, television programs, videos, zoetropes, or visual output from a simulation. Instances of the type Moving Image must also be describable as instances of the broader type Image."
  {:db/ident :dcmitype/MovingImage,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   "Examples include animations, movies, television programs, videos, zoetropes, or visual output from a simulation.  Instances of the type Moving Image must also be describable as instances of the broader type Image.",
   :dcterms/issued #inst "2003-11-18T00:00:00.000-05:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A series of visual representations imparting an impression of motion when shown in succession.",
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label "Moving Image",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/Image :dcmitype/MovingImage]})

(def PhysicalObject
  "Note that digital representations of, or surrogates for, these objects should use Image, Text or one of the other types."
  {:db/ident :dcmitype/PhysicalObject,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   "Note that digital representations of, or surrogates for, these objects should use Image, Text or one of the other types.",
   :dcterms/issued #inst "2002-07-13T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment "An inanimate, three-dimensional object or substance.",
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label "Physical Object",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/PhysicalObject]})

(def Service
  "Examples include a photocopying service, a banking service, an authentication service, interlibrary loans, a Z39.50 or Web server."
  {:db/ident :dcmitype/Service,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   "Examples include a photocopying service, a banking service, an authentication service, interlibrary loans, a Z39.50 or Web server.",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment "A system that provides one or more functions.",
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label "Service",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/Service]})

(def Software
  "Examples include a C source file, MS-Windows .exe executable, or Perl script."
  {:db/ident :dcmitype/Software,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   "Examples include a C source file, MS-Windows .exe executable, or Perl script.",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment "A computer program in source or compiled form.",
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label "Software",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/Software]})

(def Sound
  "Examples include a music playback file format, an audio compact disc, and recorded speech or sounds."
  {:db/ident :dcmitype/Sound,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   "Examples include a music playback file format, an audio compact disc, and recorded speech or sounds.",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment "A resource primarily intended to be heard.",
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label "Sound",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/Sound]})

(def StillImage
  "Examples include paintings, drawings, graphic designs, plans and maps. Recommended best practice is to assign the type Text to images of textual materials. Instances of the type Still Image must also be describable as instances of the broader type Image."
  {:db/ident :dcmitype/StillImage,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   "Examples include paintings, drawings, graphic designs, plans and maps. Recommended best practice is to assign the type Text to images of textual materials. Instances of the type Still Image must also be describable as instances of the broader type Image.",
   :dcterms/issued #inst "2003-11-18T00:00:00.000-05:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment "A static visual representation.",
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label "Still Image",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/Image :dcmitype/StillImage]})

(def Text
  "Examples include books, letters, dissertations, poems, newspapers, articles, archives of mailing lists. Note that facsimiles or images of texts are still of the genre Text."
  {:db/ident :dcmitype/Text,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   "Examples include books, letters, dissertations, poems, newspapers, articles, archives of mailing lists. Note that facsimiles or images of texts are still of the genre Text.",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment "A resource consisting primarily of words for reading.",
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label "Text",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/Text]})