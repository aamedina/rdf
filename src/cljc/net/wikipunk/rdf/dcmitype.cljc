(ns net.wikipunk.rdf.dcmitype
  "DCMI Type Vocabulary"
  {:dcat/downloadURL
   "https://www.dublincore.org/specifications/dublin-core/dcmi-terms/dublin_core_type.ttl",
   :dcterms/modified #inst "2012-06-14T00:00:00.000-04:00",
   :dcterms/publisher "http://purl.org/dc/aboutdcmi#DCMI",
   :dcterms/title #voc/lstr "DCMI Type Vocabulary@en",
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
   #voc/lstr
    "A collection is described as a group; its parts may also be separately described.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment #voc/lstr "An aggregation of resources.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label #voc/lstr "Collection@en",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/Collection]})

(def Dataset
  "Examples include lists, tables, and databases. A dataset may be useful for direct machine processing."
  {:db/ident :dcmitype/Dataset,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   #voc/lstr
    "Examples include lists, tables, and databases.  A dataset may be useful for direct machine processing.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment #voc/lstr "Data encoded in a defined structure.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label #voc/lstr "Dataset@en",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/Dataset]})

(def Event
  "Metadata for an event provides descriptive information that is the basis for discovery of the purpose, location, duration, and responsible agents associated with an event. Examples include an exhibition, webcast, conference, workshop, open day, performance, battle, trial, wedding, tea party, conflagration."
  {:db/ident :dcmitype/Event,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   #voc/lstr
    "Metadata for an event provides descriptive information that is the basis for discovery of the purpose, location, duration, and responsible agents associated with an event. Examples include an exhibition, webcast, conference, workshop, open day, performance, battle, trial, wedding, tea party, conflagration.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment #voc/lstr "A non-persistent, time-based occurrence.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label #voc/lstr "Event@en",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/Event]})

(def Image
  "Examples include images and photographs of physical objects, paintings, prints, drawings, other images and graphics, animations and moving pictures, film, diagrams, maps, musical notation. Note that Image may include both electronic and physical representations."
  {:db/ident :dcmitype/Image,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   #voc/lstr
    "Examples include images and photographs of physical objects, paintings, prints, drawings, other images and graphics, animations and moving pictures, film, diagrams, maps, musical notation.  Note that Image may include both electronic and physical representations.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment #voc/lstr "A visual representation other than text.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label #voc/lstr "Image@en",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/Image]})

(def InteractiveResource
  "Examples include forms on Web pages, applets, multimedia learning objects, chat services, or virtual reality environments."
  {:db/ident :dcmitype/InteractiveResource,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   #voc/lstr
    "Examples include forms on Web pages, applets, multimedia learning objects, chat services, or virtual reality environments.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "A resource requiring interaction from the user to be understood, executed, or experienced.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label #voc/lstr "Interactive Resource@en",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/InteractiveResource]})

(def MovingImage
  "Examples include animations, movies, television programs, videos, zoetropes, or visual output from a simulation. Instances of the type Moving Image must also be describable as instances of the broader type Image."
  {:db/ident :dcmitype/MovingImage,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   #voc/lstr
    "Examples include animations, movies, television programs, videos, zoetropes, or visual output from a simulation.  Instances of the type Moving Image must also be describable as instances of the broader type Image.@en",
   :dcterms/issued #inst "2003-11-18T00:00:00.000-05:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #voc/lstr
    "A series of visual representations imparting an impression of motion when shown in succession.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label #voc/lstr "Moving Image@en",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/Image :dcmitype/MovingImage]})

(def PhysicalObject
  "Note that digital representations of, or surrogates for, these objects should use Image, Text or one of the other types."
  {:db/ident :dcmitype/PhysicalObject,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   #voc/lstr
    "Note that digital representations of, or surrogates for, these objects should use Image, Text or one of the other types.@en",
   :dcterms/issued #inst "2002-07-13T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment #voc/lstr
                  "An inanimate, three-dimensional object or substance.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label #voc/lstr "Physical Object@en",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/PhysicalObject]})

(def Service
  "Examples include a photocopying service, a banking service, an authentication service, interlibrary loans, a Z39.50 or Web server."
  {:db/ident :dcmitype/Service,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   #voc/lstr
    "Examples include a photocopying service, a banking service, an authentication service, interlibrary loans, a Z39.50 or Web server.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment #voc/lstr "A system that provides one or more functions.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label #voc/lstr "Service@en",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/Service]})

(def Software
  "Examples include a C source file, MS-Windows .exe executable, or Perl script."
  {:db/ident :dcmitype/Software,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   #voc/lstr
    "Examples include a C source file, MS-Windows .exe executable, or Perl script.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment #voc/lstr "A computer program in source or compiled form.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label #voc/lstr "Software@en",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/Software]})

(def Sound
  "Examples include a music playback file format, an audio compact disc, and recorded speech or sounds."
  {:db/ident :dcmitype/Sound,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   #voc/lstr
    "Examples include a music playback file format, an audio compact disc, and recorded speech or sounds.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment #voc/lstr "A resource primarily intended to be heard.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label #voc/lstr "Sound@en",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/Sound]})

(def StillImage
  "Examples include paintings, drawings, graphic designs, plans and maps. Recommended best practice is to assign the type Text to images of textual materials. Instances of the type Still Image must also be describable as instances of the broader type Image."
  {:db/ident :dcmitype/StillImage,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   #voc/lstr
    "Examples include paintings, drawings, graphic designs, plans and maps. Recommended best practice is to assign the type Text to images of textual materials. Instances of the type Still Image must also be describable as instances of the broader type Image.@en",
   :dcterms/issued #inst "2003-11-18T00:00:00.000-05:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment #voc/lstr "A static visual representation.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label #voc/lstr "Still Image@en",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/Image :dcmitype/StillImage]})

(def Text
  "Examples include books, letters, dissertations, poems, newspapers, articles, archives of mailing lists. Note that facsimiles or images of texts are still of the genre Text."
  {:db/ident :dcmitype/Text,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   #voc/lstr
    "Examples include books, letters, dissertations, poems, newspapers, articles, archives of mailing lists. Note that facsimiles or images of texts are still of the genre Text.@en",
   :dcterms/issued #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment #voc/lstr
                  "A resource consisting primarily of words for reading.@en",
   :rdfs/isDefinedBy "http://purl.org/dc/dcmitype/",
   :rdfs/label #voc/lstr "Text@en",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/Text]})