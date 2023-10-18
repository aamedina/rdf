(ns net.wikipunk.rdf.ma
  {:dc11/date #inst "2013-03-20T00:00:00.000-00:00",
   :namespaces {"dc11" "http://purl.org/dc/elements/1.1/",
                "ma"   "http://www.w3.org/ns/ma-ont#",
                "owl"  "http://www.w3.org/2002/07/owl#",
                "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports {:xsd/anyURI "http://dublincore.org/2008/01/14/dcelements.rdf"},
   :owl/versionInfo "R36",
   :rdf/type :owl/Ontology,
   :rdfa/prefix "ma",
   :rdfa/uri "http://www.w3.org/ns/ma-ont#",
   :rdfs/comment
   #{"Created by Tobias Buerger, Jean Pierre Evain and Pierre-Antoine Champin with the RDFS Taskforce within the W3C Media Annotation Working Group."
     "THE CONTENT OF THIS MA-ONT.RDF AND DERIVED MA-ONT.TTL FILES PREVAIL OVER THE SPECIFICATION."},
   :rdfs/isDefinedBy {:xsd/anyURI
                      "http://www.w3.org/TR/2012/REC-mediaont-10-20120209/"},
   :xsd/anyURI "http://www.w3.org/ns/ma-ont"})

(def Agent
  {:db/ident :ma/Agent,
   :owl/disjointWith #{:ma/MediaResource :ma/TargetAudience :ma/Location
                       :ma/Collection :ma/Rating},
   :rdf/type :owl/Class,
   :rdfs/comment
   "A person or organisation contributing to the media resource."})

(def AudioTrack
  {:db/ident :ma/AudioTrack,
   :owl/disjointWith #{:ma/VideoTrack :ma/DataTrack},
   :rdf/type :owl/Class,
   :rdfs/comment
   "A specialisation of Track for Audio to provide a link to specific data properties such as sampleRate, etc. Specialisation is defined through object properties.",
   :rdfs/subClassOf :ma/Track})

(def Collection
  {:db/ident         :ma/Collection,
   :owl/disjointWith #{:ma/MediaResource :ma/TargetAudience :ma/Location
                       :ma/Rating},
   :rdf/type         :owl/Class,
   :rdfs/comment     "Any group of media resource e.g. a series."})

(def DataTrack
  {:db/ident :ma/DataTrack,
   :owl/disjointWith :ma/VideoTrack,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Ancillary data track e.g. captioning  in addition to video and audio tracks. Specialisation is made through the use of appropriate object properties.",
   :rdfs/subClassOf :ma/Track})

(def Image
  {:db/ident :ma/Image,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A still image / thumbnail / key frame related to the media resource or being the media resource itself.",
   :rdfs/subClassOf :ma/MediaResource})

(def Location
  {:db/ident :ma/Location,
   :owl/disjointWith #{:ma/MediaResource :ma/TargetAudience :ma/Rating},
   :rdf/type :owl/Class,
   :rdfs/comment
   "A location related to the media resource, e.g. depicted in the resource (possibly fictional) or where the resource was created (shooting location), etc."})

(def MediaFragment
  {:db/ident :ma/MediaFragment,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A media fragment (spatial, temporal, track...) composing a media resource. In other ontologies fragment is sometimes referred to as a 'part' or 'segment'.",
   :rdfs/subClassOf :ma/MediaResource})

(def MediaResource
  {:db/ident :ma/MediaResource,
   :owl/disjointWith #{:ma/TargetAudience :ma/Rating},
   :rdf/type :owl/Class,
   :rdfs/comment
   "An image or an audiovisual media resource, which can be composed of one or more fragment / track."})

(def Organisation
  {:db/ident         :ma/Organisation,
   :owl/disjointWith :ma/Person,
   :rdf/type         :owl/Class,
   :rdfs/comment     "An organisation or moral agent.",
   :rdfs/subClassOf  :ma/Agent})

(def Person
  {:db/ident        :ma/Person,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A physical person.",
   :rdfs/subClassOf :ma/Agent})

(def Rating
  {:db/ident         :ma/Rating,
   :owl/disjointWith :ma/TargetAudience,
   :rdf/type         :owl/Class,
   :rdfs/comment     "Information about the rating given to a media resource."})

(def TargetAudience
  {:db/ident :ma/TargetAudience,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Information about The target audience (target region, target audience category but also parental guidance recommendation) for which a media resource is intended."})

(def Track
  {:db/ident :ma/Track,
   :rdf/type :owl/Class,
   :rdfs/comment "A specialisation of MediaFragment for audiovisual content.",
   :rdfs/subClassOf :ma/MediaFragment})

(def VideoTrack
  {:db/ident :ma/VideoTrack,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A specialisation of Track for Video to provide a link to specific data properties such as frameRate, etc. Signing is another possible example of video track. Specialisation is defined through object properties.",
   :rdfs/subClassOf :ma/Track})

(def alternativeTitle
  {:db/ident :ma/alternativeTitle,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'title.title' in the Ontology for Media Resources with a 'title.type' meaning \"alternative\".",
   :rdfs/subPropertyOf :ma/title})

(def averageBitRate
  {:db/ident :ma/averageBitRate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'averageBitRate' in the Ontology for Media Resources, expressed in kilobits/second.",
   :rdfs/domain {:owl/intersectionOf [:ma/MediaResource
                                      {:owl/complementOf :ma/Image,
                                       :rdf/type         :owl/Class}],
                 :rdf/type :owl/Class},
   :rdfs/range :xsd/decimal})

(def collectionName
  {:db/ident     :ma/collectionName,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "The name by which a collection (e.g. series) is known.",
   :rdfs/domain  :ma/Collection})

(def copyright
  {:db/ident :ma/copyright,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'copyright.copyright' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource})

(def createdIn
  {:db/ident :ma/createdIn,
   :owl/inverseOf :ma/isCreationLocationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A subproperty of 'hasRelatedLocation\" used to specify where material shooting took place.",
   :rdfs/subPropertyOf :ma/hasRelatedLocation})

(def creationDate
  {:db/ident :ma/creationDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'date.date' in the Ontology for Media Resources with a 'date.type' meaning \"creationDate\".",
   :rdfs/subPropertyOf :ma/date})

(def date
  {:db/ident :ma/date,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to date.date in the ontology for Media Resources. Subproperties can be used to distinguish different values of 'date.type'. The recommended range is 'xsd:dateTime' (for compliance with OWL2-QL and OWL2-RL) but other time-related datatypes may be used (e.g. 'xsd:gYear', 'xsd:date'...).",
   :rdfs/domain :ma/MediaResource})

(def depictsFictionalLocation
  {:db/ident :ma/depictsFictionalLocation,
   :owl/inverseOf :ma/isFictionalLocationDepictedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A subproperty of 'hasRelatedLocation' used to specify where the action depicted in the media is supposed to take place, as opposed to the location where shooting actually took place (see 'createdIn').",
   :rdfs/subPropertyOf :ma/hasRelatedLocation})

(def description
  {:db/ident :ma/description,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'description' in the Ontology for Media Resources. This can be specialised by using sub-properties e.g. 'summary' or 'script'.",
   :rdfs/domain :ma/MediaResource})

(def duration
  {:db/ident :ma/duration,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'duration' in the Ontology for Media Resources.",
   :rdfs/domain {:owl/intersectionOf [:ma/MediaResource
                                      {:owl/complementOf :ma/Image,
                                       :rdf/type         :owl/Class}],
                 :rdf/type :owl/Class},
   :rdfs/range :xsd/decimal})

(def editDate
  {:db/ident :ma/editDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'date.date' in the Ontology for Media Resources with a 'date.type' meaning \"editDate\".",
   :rdfs/subPropertyOf :ma/date})

(def features
  {:db/ident :ma/features,
   :owl/inverseOf :ma/playsIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'contributor.contributor' in the Ontology for Media Resources with a 'contributor.role' meaning \"actor\".",
   :rdfs/range :ma/Person,
   :rdfs/subPropertyOf :ma/hasContributor})

(def fragmentName
  {:db/ident :ma/fragmentName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'namedFragment.label' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaFragment})

(def frameHeight
  {:db/ident :ma/frameHeight,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'frameSize.height' in the Ontology for Media Resources, measured in frameSizeUnit.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :xsd/integer})

(def frameRate
  {:db/ident :ma/frameRate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'frameRate' in the Ontology for Media Resources, in frame per second.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :xsd/decimal})

(def frameSizeUnit
  {:db/ident :ma/frameSizeUnit,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'frameSize.unit' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource})

(def frameWidth
  {:db/ident :ma/frameWidth,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'frameSize.width' in the Ontology for Media Resources measured in frameSizeUnit.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :xsd/integer})

(def hasAccessConditions
  {:db/ident :ma/hasAccessConditions,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'policy' in the Ontology for Media Resources with a 'policy.type' \"access conditions\".",
   :rdfs/subPropertyOf :ma/hasPolicy})

(def hasAudioDescription
  {:db/ident :ma/hasAudioDescription,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"audio-description\".",
   :rdfs/subPropertyOf :ma/hasCaptioning})

(def hasCaptioning
  {:db/ident :ma/hasCaptioning,
   :owl/inverseOf :ma/isCaptioningOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"captioning\". This property can for example point to a spatial fragment, a VideoTrack or a DataTrack. The language of the captioning track can be expressed by attaching a 'hasLanguage' property to the specific track.",
   :rdfs/subPropertyOf :ma/hasFragment})

(def hasChapter
  {:db/ident :ma/hasChapter,
   :owl/inverseOf :ma/isChapterOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"chapter\".",
   :rdfs/subPropertyOf :ma/hasFragment})

(def hasClassification
  {:db/ident :ma/hasClassification,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'targetAudience.classification' in the Ontology for Media Resources. This property is used to provide a value characterising the target audience.",
   :rdfs/domain :ma/TargetAudience})

(def hasClassificationSystem
  {:db/ident :ma/hasClassificationSystem,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'targetAudience.identifier' in the Ontology for Media Resources. This is used to identify the reference sheme against which the target audience has been characterised.",
   :rdfs/domain :ma/TargetAudience})

(def hasCompression
  {:db/ident :ma/hasCompression,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'compression' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource})

(def hasContributedTo
  {:db/ident :ma/hasContributedTo,
   :rdf/type :owl/ObjectProperty})

(def hasContributor
  {:db/ident :ma/hasContributor,
   :owl/inverseOf :ma/hasContributedTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'contributor.contributor' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'contributor.role'.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :ma/Agent})

(def hasCopyrightOver
  {:db/ident :ma/hasCopyrightOver,
   :rdf/type :owl/ObjectProperty})

(def hasCreated
  {:db/ident :ma/hasCreated,
   :rdf/type :owl/ObjectProperty})

(def hasCreator
  {:db/ident :ma/hasCreator,
   :owl/inverseOf :ma/hasCreated,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'creator.creator' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'creator.role'. Note that this property is semantically a subproperty of 'hasContributor'.",
   :rdfs/subPropertyOf :ma/hasContributor})

(def hasFormat
  {:db/ident     :ma/hasFormat,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Corresponds to 'format' in the Ontology for Media Resources.",
   :rdfs/domain  :ma/MediaResource})

(def hasFragment
  {:db/ident :ma/hasFragment,
   :owl/inverseOf :ma/isFragmentOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'fragment' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'fragment.role'.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :ma/MediaFragment})

(def hasGenre
  {:db/ident     :ma/hasGenre,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Corresponds to 'genre' in the Ontology for Media Resources.",
   :rdfs/domain  :ma/MediaResource})

(def hasKeyword
  {:db/ident :ma/hasKeyword,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'keyword' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource})

(def hasLanguage
  {:db/ident :ma/hasLanguage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'language' in the Ontology for Media Resources. The language used in the resource. A controlled vocabulary such as defined in BCP 47 SHOULD be used. This property can also be used to identify the presence of sign language (RFC 5646). By inheritance, the hasLanguage property applies indifferently at the media resource / fragment / track levels.  Best practice recommends to use to best possible level of granularity fo describe the usage of language within a media resource including at fragment and track levels.",
   :rdfs/domain :ma/MediaResource})

(def hasLocationCoordinateSystem
  {:db/ident :ma/hasLocationCoordinateSystem,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'location.coordinateSystem' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Location})

(def hasMember
  {:db/ident :ma/hasMember,
   :rdf/type :owl/ObjectProperty})

(def hasNamedFragment
  {:db/ident :ma/hasNamedFragment,
   :owl/inverseOf :ma/isNamedFragmentOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'namedFragment' in the Ontology for Media Resources.",
   :rdfs/subPropertyOf :ma/hasFragment})

(def hasPermissions
  {:db/ident :ma/hasPermissions,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'policy' in the Ontology for Media Resources with a  'policy.type' meaning \"permissions\".",
   :rdfs/subPropertyOf :ma/hasPolicy})

(def hasPolicy
  {:db/ident :ma/hasPolicy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'policy' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'policy.type'.",
   :rdfs/domain :ma/MediaResource})

(def hasPublished
  {:db/ident :ma/hasPublished,
   :rdf/type :owl/ObjectProperty})

(def hasPublisher
  {:db/ident :ma/hasPublisher,
   :owl/inverseOf :ma/hasPublished,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'publisher' in the Ontology for Media Resources.",
   :rdfs/subPropertyOf :ma/hasContributor})

(def hasRating
  {:db/ident :ma/hasRating,
   :owl/inverseOf :ma/isRatingOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "Corresponds to 'rating' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :ma/Rating})

(def hasRatingSystem
  {:db/ident :ma/hasRatingSystem,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'rating.type' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Rating})

(def hasRelatedImage
  {:db/ident :ma/hasRelatedImage,
   :owl/inverseOf :ma/isImageRelatedTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'relation' and in the Ontology for Media Resources with a 'relation.type' meaning \"related image\".",
   :rdfs/range :ma/Image,
   :rdfs/subPropertyOf :ma/hasRelatedResource})

(def hasRelatedLocation
  {:db/ident :ma/hasRelatedLocation,
   :owl/inverseOf :ma/isLocationRelatedTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'location' in the Ontology for Media Resources. Subproperties are provided to specify, when possible, the relation between the media resource and the location.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :ma/Location})

(def hasRelatedResource
  {:db/ident :ma/hasRelatedResource,
   :owl/inverseOf :ma/isRelatedTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'relation' and in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'relation.type'.",
   :rdfs/domain :ma/MediaResource})

(def hasSigning
  {:db/ident :ma/hasSigning,
   :owl/inverseOf :ma/isSigningOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"signing\". This property can for example point to a spatial fragment or a VideoTrack. The sign language of the captioning track can be expressed by attaching a 'hasLanguage' property to the specific track.",
   :rdfs/subPropertyOf :ma/hasFragment})

(def hasSource
  {:db/ident :ma/hasSource,
   :owl/inverseOf :ma/isSourceOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'relation' and in the Ontology for Media Resources with a 'relation.type' meaning \"source\".",
   :rdfs/subPropertyOf :ma/hasRelatedResource})

(def hasSubtitling
  {:db/ident :ma/hasSubtitling,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"subtitling\".",
   :rdfs/subPropertyOf :ma/hasCaptioning})

(def hasTargetAudience
  {:db/ident :ma/hasTargetAudience,
   :owl/inverseOf :ma/isTargetAudienceOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'targetAudience' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :ma/TargetAudience})

(def hasTrack
  {:db/ident :ma/hasTrack,
   :owl/inverseOf :ma/isTrackOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"track\".",
   :rdfs/range :ma/Track,
   :rdfs/subPropertyOf :ma/hasFragment})

(def isCaptioningOf
  {:db/ident :ma/isCaptioningOf,
   :rdf/type :owl/ObjectProperty})

(def isChapterOf
  {:db/ident :ma/isChapterOf,
   :rdf/type :owl/ObjectProperty})

(def isCopyrightedBy
  {:db/ident :ma/isCopyrightedBy,
   :owl/inverseOf :ma/hasCopyrightOver,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'copyright.identifier' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :ma/Agent})

(def isCreationLocationOf
  {:db/ident :ma/isCreationLocationOf,
   :rdf/type :owl/ObjectProperty})

(def isFictionalLocationDepictedIn
  {:db/ident :ma/isFictionalLocationDepictedIn,
   :rdf/type :owl/ObjectProperty})

(def isFragmentOf
  {:db/ident :ma/isFragmentOf,
   :rdf/type :owl/ObjectProperty})

(def isImageRelatedTo
  {:db/ident :ma/isImageRelatedTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf :ma/isRelatedTo})

(def isLocationRelatedTo
  {:db/ident :ma/isLocationRelatedTo,
   :rdf/type :owl/ObjectProperty})

(def isMemberOf
  {:db/ident :ma/isMemberOf,
   :owl/inverseOf :ma/hasMember,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'collection' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :ma/Collection})

(def isNamedFragmentOf
  {:db/ident :ma/isNamedFragmentOf,
   :rdf/type :owl/ObjectProperty})

(def isProvidedBy
  {:db/ident :ma/isProvidedBy,
   :owl/inverseOf :ma/provides,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Corresponds to 'rating.identifier' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Rating,
   :rdfs/range :ma/Agent})

(def isRatingOf
  {:db/ident :ma/isRatingOf,
   :rdf/type :owl/ObjectProperty})

(def isRelatedTo
  {:db/ident :ma/isRelatedTo,
   :rdf/type :owl/ObjectProperty})

(def isSigningOf
  {:db/ident :ma/isSigningOf,
   :rdf/type :owl/ObjectProperty})

(def isSourceOf
  {:db/ident :ma/isSourceOf,
   :rdf/type :owl/ObjectProperty})

(def isTargetAudienceOf
  {:db/ident :ma/isTargetAudienceOf,
   :rdf/type :owl/ObjectProperty})

(def isTrackOf
  {:db/ident :ma/isTrackOf,
   :rdf/type :owl/ObjectProperty})

(def locationAltitude
  {:db/ident :ma/locationAltitude,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'location.altitude' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Location,
   :rdfs/range :xsd/decimal})

(def locationLatitude
  {:db/ident :ma/locationLatitude,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'location.latitude' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Location,
   :rdfs/range :xsd/decimal})

(def locationLongitude
  {:db/ident :ma/locationLongitude,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'location.longitude' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Location,
   :rdfs/range :xsd/decimal})

(def locationName
  {:db/ident :ma/locationName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'location.name' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Location})

(def locator
  {:db/ident :ma/locator,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'locator' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :xsd/anyURI})

(def mainOriginalTitle
  {:db/ident :ma/mainOriginalTitle,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'title.title' in the Ontology for Media Resources with a 'title.type' meaning \"original\".",
   :rdfs/subPropertyOf :ma/title})

(def numberOfTracks
  {:db/ident :ma/numberOfTracks,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'numTracks.number' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'numTracks.type'.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :xsd/integer})

(def playsIn
  {:db/ident :ma/playsIn,
   :rdf/type :owl/ObjectProperty})

(def provides
  {:db/ident :ma/provides,
   :rdf/type :owl/ObjectProperty})

(def ratingScaleMax
  {:db/ident :ma/ratingScaleMax,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'rating.max' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Rating,
   :rdfs/range :xsd/decimal})

(def ratingScaleMin
  {:db/ident :ma/ratingScaleMin,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'rating.min' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Rating,
   :rdfs/range :xsd/decimal})

(def ratingValue
  {:db/ident :ma/ratingValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'rating.value' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Rating,
   :rdfs/range :xsd/decimal})

(def recordDate
  {:db/ident :ma/recordDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'date.date' in the Ontology for Media Resources with a 'date.type' meaning \"recordDate\".",
   :rdfs/subPropertyOf :ma/date})

(def releaseDate
  {:db/ident :ma/releaseDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'date.date' in the Ontology for Media Resources with a 'date.type' meaning \"releaseDate\".",
   :rdfs/subPropertyOf :ma/date})

(def samplingRate
  {:db/ident :ma/samplingRate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'samplingRate' in the Ontology for Media Resources, in samples per second.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :xsd/decimal})

(def title
  {:db/ident :ma/title,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'title.title' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'title.type'.",
   :rdfs/domain :ma/MediaResource})

(def trackName
  {:db/ident :ma/trackName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Corresponds to 'fragment.name' in the Ontology for Media Resources, for Track fragments.",
   :rdfs/domain :ma/Track,
   :rdfs/subPropertyOf :ma/fragmentName})

(def urn:uuid:6ed5c232-e4a6-5fb0-86f5-e829dd45c363
  {:dc11/date #inst "2013-03-20T00:00:00.000-00:00",
   :owl/imports {:xsd/anyURI "http://dublincore.org/2008/01/14/dcelements.rdf"},
   :owl/versionInfo "R36",
   :rdf/type :owl/Ontology,
   :rdfs/comment
   #{"Created by Tobias Buerger, Jean Pierre Evain and Pierre-Antoine Champin with the RDFS Taskforce within the W3C Media Annotation Working Group."
     "THE CONTENT OF THIS MA-ONT.RDF AND DERIVED MA-ONT.TTL FILES PREVAIL OVER THE SPECIFICATION."},
   :xsd/anyURI "http://www.w3.org/ns/ma-ont"})