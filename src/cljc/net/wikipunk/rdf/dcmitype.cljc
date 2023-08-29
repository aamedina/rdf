(ns net.wikipunk.rdf.dcmitype
  {:dcat/downloadURL
   "https://www.dublincore.org/specifications/dublin-core/dcmi-terms/dublin_core_type.ttl",
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
   #rdf/langString
    "A collection is described as a group; its parts may also be separately described.@en",
   :dcterms/issued #xsd/date #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment #rdf/langString "An aggregation of resources.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/dc/dcmitype/"},
   :rdfs/label #rdf/langString "Collection@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Dataset
  "Examples include lists, tables, and databases.  A dataset may be useful for direct machine processing."
  {:db/ident :dcmitype/Dataset,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   #rdf/langString
    "Examples include lists, tables, and databases.  A dataset may be useful for direct machine processing.@en",
   :dcterms/issued #xsd/date #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment #rdf/langString "Data encoded in a defined structure.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/dc/dcmitype/"},
   :rdfs/label #rdf/langString "Dataset@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Event
  "Metadata for an event provides descriptive information that is the basis for discovery of the purpose, location, duration, and responsible agents associated with an event. Examples include an exhibition, webcast, conference, workshop, open day, performance, battle, trial, wedding, tea party, conflagration."
  {:db/ident :dcmitype/Event,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   #rdf/langString
    "Metadata for an event provides descriptive information that is the basis for discovery of the purpose, location, duration, and responsible agents associated with an event. Examples include an exhibition, webcast, conference, workshop, open day, performance, battle, trial, wedding, tea party, conflagration.@en",
   :dcterms/issued #xsd/date #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment #rdf/langString "A non-persistent, time-based occurrence.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/dc/dcmitype/"},
   :rdfs/label #rdf/langString "Event@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Image
  "Examples include images and photographs of physical objects, paintings, prints, drawings, other images and graphics, animations and moving pictures, film, diagrams, maps, musical notation.  Note that Image may include both electronic and physical representations."
  {:db/ident :dcmitype/Image,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   #rdf/langString
    "Examples include images and photographs of physical objects, paintings, prints, drawings, other images and graphics, animations and moving pictures, film, diagrams, maps, musical notation.  Note that Image may include both electronic and physical representations.@en",
   :dcterms/issued #xsd/date #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment #rdf/langString "A visual representation other than text.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/dc/dcmitype/"},
   :rdfs/label #rdf/langString "Image@en",
   :rdfs/subClassOf :rdfs/Resource})

(def InteractiveResource
  "Examples include forms on Web pages, applets, multimedia learning objects, chat services, or virtual reality environments."
  {:db/ident :dcmitype/InteractiveResource,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   #rdf/langString
    "Examples include forms on Web pages, applets, multimedia learning objects, chat services, or virtual reality environments.@en",
   :dcterms/issued #xsd/date #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #rdf/langString
    "A resource requiring interaction from the user to be understood, executed, or experienced.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/dc/dcmitype/"},
   :rdfs/label #rdf/langString "Interactive Resource@en",
   :rdfs/subClassOf :rdfs/Resource})

(def MovingImage
  "Examples include animations, movies, television programs, videos, zoetropes, or visual output from a simulation.  Instances of the type Moving Image must also be describable as instances of the broader type Image."
  {:db/ident :dcmitype/MovingImage,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   #rdf/langString
    "Examples include animations, movies, television programs, videos, zoetropes, or visual output from a simulation.  Instances of the type Moving Image must also be describable as instances of the broader type Image.@en",
   :dcterms/issued #xsd/date #inst "2003-11-18T00:00:00.000-05:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   #rdf/langString
    "A series of visual representations imparting an impression of motion when shown in succession.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/dc/dcmitype/"},
   :rdfs/label #rdf/langString "Moving Image@en",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/Image]})

(def PhysicalObject
  "Note that digital representations of, or surrogates for, these objects should use Image, Text or one of the other types."
  {:db/ident :dcmitype/PhysicalObject,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   #rdf/langString
    "Note that digital representations of, or surrogates for, these objects should use Image, Text or one of the other types.@en",
   :dcterms/issued #xsd/date #inst "2002-07-13T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment #rdf/langString
                  "An inanimate, three-dimensional object or substance.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/dc/dcmitype/"},
   :rdfs/label #rdf/langString "Physical Object@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Service
  "Examples include a photocopying service, a banking service, an authentication service, interlibrary loans, a Z39.50 or Web server."
  {:db/ident :dcmitype/Service,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   #rdf/langString
    "Examples include a photocopying service, a banking service, an authentication service, interlibrary loans, a Z39.50 or Web server.@en",
   :dcterms/issued #xsd/date #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment #rdf/langString
                  "A system that provides one or more functions.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/dc/dcmitype/"},
   :rdfs/label #rdf/langString "Service@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Software
  "Examples include a C source file, MS-Windows .exe executable, or Perl script."
  {:db/ident :dcmitype/Software,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   #rdf/langString
    "Examples include a C source file, MS-Windows .exe executable, or Perl script.@en",
   :dcterms/issued #xsd/date #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment #rdf/langString
                  "A computer program in source or compiled form.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/dc/dcmitype/"},
   :rdfs/label #rdf/langString "Software@en",
   :rdfs/subClassOf :rdfs/Resource})

(def Sound
  "Examples include a music playback file format, an audio compact disc, and recorded speech or sounds."
  {:db/ident :dcmitype/Sound,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   #rdf/langString
    "Examples include a music playback file format, an audio compact disc, and recorded speech or sounds.@en",
   :dcterms/issued #xsd/date #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment #rdf/langString
                  "A resource primarily intended to be heard.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/dc/dcmitype/"},
   :rdfs/label #rdf/langString "Sound@en",
   :rdfs/subClassOf :rdfs/Resource})

(def StillImage
  "Examples include paintings, drawings, graphic designs, plans and maps. Recommended best practice is to assign the type Text to images of textual materials. Instances of the type Still Image must also be describable as instances of the broader type Image."
  {:db/ident :dcmitype/StillImage,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   #rdf/langString
    "Examples include paintings, drawings, graphic designs, plans and maps. Recommended best practice is to assign the type Text to images of textual materials. Instances of the type Still Image must also be describable as instances of the broader type Image.@en",
   :dcterms/issued #xsd/date #inst "2003-11-18T00:00:00.000-05:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment #rdf/langString "A static visual representation.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/dc/dcmitype/"},
   :rdfs/label #rdf/langString "Still Image@en",
   :rdfs/subClassOf [:rdfs/Resource :dcmitype/Image]})

(def Text
  "Examples include books, letters, dissertations, poems, newspapers, articles, archives of mailing lists. Note that facsimiles or images of texts are still of the genre Text."
  {:db/ident :dcmitype/Text,
   :dcam/memberOf :dcterms/DCMIType,
   :dcterms/description
   #rdf/langString
    "Examples include books, letters, dissertations, poems, newspapers, articles, archives of mailing lists. Note that facsimiles or images of texts are still of the genre Text.@en",
   :dcterms/issued #xsd/date #inst "2000-07-11T00:00:00.000-04:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment #rdf/langString
                  "A resource consisting primarily of words for reading.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://purl.org/dc/dcmitype/"},
   :rdfs/label #rdf/langString "Text@en",
   :rdfs/subClassOf :rdfs/Resource})
