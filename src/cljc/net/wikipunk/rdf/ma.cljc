(ns net.wikipunk.rdf.ma
  {:dc11/date #xsd/date #inst "2013-03-20T00:00:00.000-04:00",
   :owl/imports {:rdfa/uri "http://dublincore.org/2008/01/14/dcelements.rdf"},
   :owl/versionInfo #xsd/string "R36",
   :rdf/ns-prefix-map {"dc11" "http://purl.org/dc/elements/1.1/",
                       "ma"   "http://www.w3.org/ns/ma-ont#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "ma",
   :rdfa/uri "http://www.w3.org/ns/ma-ont",
   :rdfs/comment
   [#xsd/string
     "THE CONTENT OF THIS MA-ONT.RDF AND DERIVED MA-ONT.TTL FILES PREVAIL OVER THE SPECIFICATION."
    #xsd/string
     "Created by Tobias Buerger, Jean Pierre Evain and Pierre-Antoine Champin with the RDFS Taskforce within the W3C Media Annotation Working Group."],
   :rdfs/isDefinedBy {:rdfa/uri
                      "http://www.w3.org/TR/2012/REC-mediaont-10-20120209/"}})

(def Agent
  "A person or organisation contributing to the media resource."
  {:db/ident :ma/Agent,
   :owl/disjointWith [:ma/TargetAudience
                      :ma/Rating
                      :ma/MediaResource
                      :ma/Location
                      :ma/Collection],
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string "A person or organisation contributing to the media resource."})

(def AudioTrack
  "A specialisation of Track for Audio to provide a link to specific data properties such as sampleRate, etc. Specialisation is defined through object properties."
  {:db/ident :ma/AudioTrack,
   :owl/disjointWith [:ma/VideoTrack :ma/DataTrack],
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "A specialisation of Track for Audio to provide a link to specific data properties such as sampleRate, etc. Specialisation is defined through object properties.",
   :rdfs/subClassOf [:ma/Track :ma/MediaFragment :ma/MediaResource]})

(def Collection
  "Any group of media resource e.g. a series."
  {:db/ident         :ma/Collection,
   :owl/disjointWith [:ma/TargetAudience
                      :ma/Rating
                      :ma/MediaResource
                      :ma/Location],
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/string "Any group of media resource e.g. a series."})

(def DataTrack
  "Ancillary data track e.g. captioning  in addition to video and audio tracks. Specialisation is made through the use of appropriate object properties."
  {:db/ident :ma/DataTrack,
   :owl/disjointWith :ma/VideoTrack,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "Ancillary data track e.g. captioning  in addition to video and audio tracks. Specialisation is made through the use of appropriate object properties.",
   :rdfs/subClassOf [:ma/Track :ma/MediaFragment :ma/MediaResource]})

(def Image
  "A still image / thumbnail / key frame related to the media resource or being the media resource itself."
  {:db/ident :ma/Image,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "A still image / thumbnail / key frame related to the media resource or being the media resource itself.",
   :rdfs/subClassOf :ma/MediaResource})

(def Location
  "A location related to the media resource, e.g. depicted in the resource (possibly fictional) or where the resource was created (shooting location), etc."
  {:db/ident :ma/Location,
   :owl/disjointWith [:ma/TargetAudience :ma/Rating :ma/MediaResource],
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "A location related to the media resource, e.g. depicted in the resource (possibly fictional) or where the resource was created (shooting location), etc."})

(def MediaFragment
  "A media fragment (spatial, temporal, track...) composing a media resource. In other ontologies fragment is sometimes referred to as a 'part' or 'segment'."
  {:db/ident :ma/MediaFragment,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "A media fragment (spatial, temporal, track...) composing a media resource. In other ontologies fragment is sometimes referred to as a 'part' or 'segment'.",
   :rdfs/subClassOf :ma/MediaResource})

(def MediaResource
  "An image or an audiovisual media resource, which can be composed of one or more fragment / track."
  {:db/ident :ma/MediaResource,
   :owl/disjointWith [:ma/TargetAudience :ma/Rating],
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "An image or an audiovisual media resource, which can be composed of one or more fragment / track."})

(def Organisation
  "An organisation or moral agent."
  {:db/ident         :ma/Organisation,
   :owl/disjointWith :ma/Person,
   :rdf/type         :owl/Class,
   :rdfs/comment     #xsd/string "An organisation or moral agent.",
   :rdfs/subClassOf  :ma/Agent})

(def Person
  "A physical person."
  {:db/ident        :ma/Person,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/string "A physical person.",
   :rdfs/subClassOf :ma/Agent})

(def Rating
  "Information about the rating given to a media resource."
  {:db/ident :ma/Rating,
   :owl/disjointWith :ma/TargetAudience,
   :rdf/type :owl/Class,
   :rdfs/comment #xsd/string
                  "Information about the rating given to a media resource."})

(def TargetAudience
  "Information about The target audience (target region, target audience category but also parental guidance recommendation) for which a media resource is intended."
  {:db/ident :ma/TargetAudience,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "Information about The target audience (target region, target audience category but also parental guidance recommendation) for which a media resource is intended."})

(def Track
  "A specialisation of MediaFragment for audiovisual content."
  {:db/ident :ma/Track,
   :rdf/type :owl/Class,
   :rdfs/comment #xsd/string
                  "A specialisation of MediaFragment for audiovisual content.",
   :rdfs/subClassOf [:ma/MediaFragment :ma/MediaResource]})

(def VideoTrack
  "A specialisation of Track for Video to provide a link to specific data properties such as frameRate, etc. Signing is another possible example of video track. Specialisation is defined through object properties."
  {:db/ident :ma/VideoTrack,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/string
    "A specialisation of Track for Video to provide a link to specific data properties such as frameRate, etc. Signing is another possible example of video track. Specialisation is defined through object properties.",
   :rdfs/subClassOf [:ma/Track :ma/MediaFragment :ma/MediaResource]})

(def alternativeTitle
  "Corresponds to 'title.title' in the Ontology for Media Resources with a 'title.type' meaning \"alternative\"."
  {:db/ident :ma/alternativeTitle,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'title.title' in the Ontology for Media Resources with a 'title.type' meaning \"alternative\".",
   :rdfs/subPropertyOf :ma/title})

(def averageBitRate
  "Corresponds to 'averageBitRate' in the Ontology for Media Resources, expressed in kilobits/second."
  {:db/ident :ma/averageBitRate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'averageBitRate' in the Ontology for Media Resources, expressed in kilobits/second.",
   :rdfs/domain {:owl/intersectionOf [:ma/MediaResource
                                      {:owl/complementOf :ma/Image,
                                       :rdf/type         :owl/Class}],
                 :rdf/type :owl/Class},
   :rdfs/range :xsd/decimal})

(def collectionName
  "The name by which a collection (e.g. series) is known."
  {:db/ident     :ma/collectionName,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/string
                  "The name by which a collection (e.g. series) is known.",
   :rdfs/domain  :ma/Collection})

(def copyright
  "Corresponds to 'copyright.copyright' in the Ontology for Media Resources."
  {:db/ident :ma/copyright,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'copyright.copyright' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource})

(def createdIn
  "A subproperty of 'hasRelatedLocation\" used to specify where material shooting took place."
  {:db/ident :ma/createdIn,
   :owl/inverseOf :ma/isCreationLocationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "A subproperty of 'hasRelatedLocation\" used to specify where material shooting took place.",
   :rdfs/subPropertyOf :ma/hasRelatedLocation})

(def creationDate
  "Corresponds to 'date.date' in the Ontology for Media Resources with a 'date.type' meaning \"creationDate\"."
  {:db/ident :ma/creationDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'date.date' in the Ontology for Media Resources with a 'date.type' meaning \"creationDate\".",
   :rdfs/subPropertyOf :ma/date})

(def date
  "Corresponds to date.date in the ontology for Media Resources. Subproperties can be used to distinguish different values of 'date.type'. The recommended range is 'xsd:dateTime' (for compliance with OWL2-QL and OWL2-RL) but other time-related datatypes may be used (e.g. 'xsd:gYear', 'xsd:date'...)."
  {:db/ident :ma/date,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to date.date in the ontology for Media Resources. Subproperties can be used to distinguish different values of 'date.type'. The recommended range is 'xsd:dateTime' (for compliance with OWL2-QL and OWL2-RL) but other time-related datatypes may be used (e.g. 'xsd:gYear', 'xsd:date'...).",
   :rdfs/domain :ma/MediaResource})

(def depictsFictionalLocation
  "A subproperty of 'hasRelatedLocation' used to specify where the action depicted in the media is supposed to take place, as opposed to the location where shooting actually took place (see 'createdIn')."
  {:db/ident :ma/depictsFictionalLocation,
   :owl/inverseOf :ma/isFictionalLocationDepictedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "A subproperty of 'hasRelatedLocation' used to specify where the action depicted in the media is supposed to take place, as opposed to the location where shooting actually took place (see 'createdIn').",
   :rdfs/subPropertyOf :ma/hasRelatedLocation})

(def description
  "Corresponds to 'description' in the Ontology for Media Resources. This can be specialised by using sub-properties e.g. 'summary' or 'script'."
  {:db/ident :ma/description,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'description' in the Ontology for Media Resources. This can be specialised by using sub-properties e.g. 'summary' or 'script'.",
   :rdfs/domain :ma/MediaResource})

(def duration
  "Corresponds to 'duration' in the Ontology for Media Resources."
  {:db/ident :ma/duration,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string "Corresponds to 'duration' in the Ontology for Media Resources.",
   :rdfs/domain {:owl/intersectionOf [:ma/MediaResource
                                      {:owl/complementOf :ma/Image,
                                       :rdf/type         :owl/Class}],
                 :rdf/type :owl/Class},
   :rdfs/range :xsd/decimal})

(def editDate
  "Corresponds to 'date.date' in the Ontology for Media Resources with a 'date.type' meaning \"editDate\"."
  {:db/ident :ma/editDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'date.date' in the Ontology for Media Resources with a 'date.type' meaning \"editDate\".",
   :rdfs/subPropertyOf :ma/date})

(def features
  "Corresponds to 'contributor.contributor' in the Ontology for Media Resources with a 'contributor.role' meaning \"actor\"."
  {:db/ident :ma/features,
   :owl/inverseOf :ma/playsIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'contributor.contributor' in the Ontology for Media Resources with a 'contributor.role' meaning \"actor\".",
   :rdfs/range :ma/Person,
   :rdfs/subPropertyOf :ma/hasContributor})

(def fragmentName
  "Corresponds to 'namedFragment.label' in the Ontology for Media Resources."
  {:db/ident :ma/fragmentName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'namedFragment.label' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaFragment})

(def frameHeight
  "Corresponds to 'frameSize.height' in the Ontology for Media Resources, measured in frameSizeUnit."
  {:db/ident :ma/frameHeight,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'frameSize.height' in the Ontology for Media Resources, measured in frameSizeUnit.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :xsd/integer})

(def frameRate
  "Corresponds to 'frameRate' in the Ontology for Media Resources, in frame per second."
  {:db/ident :ma/frameRate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'frameRate' in the Ontology for Media Resources, in frame per second.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :xsd/decimal})

(def frameSizeUnit
  "Corresponds to 'frameSize.unit' in the Ontology for Media Resources."
  {:db/ident :ma/frameSizeUnit,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'frameSize.unit' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource})

(def frameWidth
  "Corresponds to 'frameSize.width' in the Ontology for Media Resources measured in frameSizeUnit."
  {:db/ident :ma/frameWidth,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'frameSize.width' in the Ontology for Media Resources measured in frameSizeUnit.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :xsd/integer})

(def hasAccessConditions
  "Corresponds to 'policy' in the Ontology for Media Resources with a 'policy.type' \"access conditions\"."
  {:db/ident :ma/hasAccessConditions,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'policy' in the Ontology for Media Resources with a 'policy.type' \"access conditions\".",
   :rdfs/subPropertyOf :ma/hasPolicy})

(def hasAudioDescription
  "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"audio-description\"."
  {:db/ident :ma/hasAudioDescription,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"audio-description\".",
   :rdfs/subPropertyOf [:ma/hasCaptioning :ma/hasFragment]})

(def hasCaptioning
  "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"captioning\". This property can for example point to a spatial fragment, a VideoTrack or a DataTrack. The language of the captioning track can be expressed by attaching a 'hasLanguage' property to the specific track."
  {:db/ident :ma/hasCaptioning,
   :owl/inverseOf :ma/isCaptioningOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"captioning\". This property can for example point to a spatial fragment, a VideoTrack or a DataTrack. The language of the captioning track can be expressed by attaching a 'hasLanguage' property to the specific track.",
   :rdfs/subPropertyOf :ma/hasFragment})

(def hasChapter
  "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"chapter\"."
  {:db/ident :ma/hasChapter,
   :owl/inverseOf :ma/isChapterOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"chapter\".",
   :rdfs/subPropertyOf :ma/hasFragment})

(def hasClassification
  "Corresponds to 'targetAudience.classification' in the Ontology for Media Resources. This property is used to provide a value characterising the target audience."
  {:db/ident :ma/hasClassification,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'targetAudience.classification' in the Ontology for Media Resources. This property is used to provide a value characterising the target audience.",
   :rdfs/domain :ma/TargetAudience})

(def hasClassificationSystem
  "Corresponds to 'targetAudience.identifier' in the Ontology for Media Resources. This is used to identify the reference sheme against which the target audience has been characterised."
  {:db/ident :ma/hasClassificationSystem,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'targetAudience.identifier' in the Ontology for Media Resources. This is used to identify the reference sheme against which the target audience has been characterised.",
   :rdfs/domain :ma/TargetAudience})

(def hasCompression
  "Corresponds to 'compression' in the Ontology for Media Resources."
  {:db/ident :ma/hasCompression,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'compression' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource})

(def hasContributedTo
  {:db/ident :ma/hasContributedTo,
   :rdf/type :owl/ObjectProperty})

(def hasContributor
  "Corresponds to 'contributor.contributor' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'contributor.role'."
  {:db/ident :ma/hasContributor,
   :owl/inverseOf :ma/hasContributedTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
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
  "Corresponds to 'creator.creator' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'creator.role'. Note that this property is semantically a subproperty of 'hasContributor'."
  {:db/ident :ma/hasCreator,
   :owl/inverseOf :ma/hasCreated,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'creator.creator' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'creator.role'. Note that this property is semantically a subproperty of 'hasContributor'.",
   :rdfs/subPropertyOf :ma/hasContributor})

(def hasFormat
  "Corresponds to 'format' in the Ontology for Media Resources."
  {:db/ident :ma/hasFormat,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string "Corresponds to 'format' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource})

(def hasFragment
  "Corresponds to 'fragment' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'fragment.role'."
  {:db/ident :ma/hasFragment,
   :owl/inverseOf :ma/isFragmentOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'fragment' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'fragment.role'.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :ma/MediaFragment})

(def hasGenre
  "Corresponds to 'genre' in the Ontology for Media Resources."
  {:db/ident     :ma/hasGenre,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment #xsd/string
                  "Corresponds to 'genre' in the Ontology for Media Resources.",
   :rdfs/domain  :ma/MediaResource})

(def hasKeyword
  "Corresponds to 'keyword' in the Ontology for Media Resources."
  {:db/ident :ma/hasKeyword,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string "Corresponds to 'keyword' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource})

(def hasLanguage
  "Corresponds to 'language' in the Ontology for Media Resources. The language used in the resource. A controlled vocabulary such as defined in BCP 47 SHOULD be used. This property can also be used to identify the presence of sign language (RFC 5646). By inheritance, the hasLanguage property applies indifferently at the media resource / fragment / track levels.  Best practice recommends to use to best possible level of granularity fo describe the usage of language within a media resource including at fragment and track levels."
  {:db/ident :ma/hasLanguage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'language' in the Ontology for Media Resources. The language used in the resource. A controlled vocabulary such as defined in BCP 47 SHOULD be used. This property can also be used to identify the presence of sign language (RFC 5646). By inheritance, the hasLanguage property applies indifferently at the media resource / fragment / track levels.  Best practice recommends to use to best possible level of granularity fo describe the usage of language within a media resource including at fragment and track levels.",
   :rdfs/domain :ma/MediaResource})

(def hasLocationCoordinateSystem
  "Corresponds to 'location.coordinateSystem' in the Ontology for Media Resources."
  {:db/ident :ma/hasLocationCoordinateSystem,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'location.coordinateSystem' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Location})

(def hasMember
  {:db/ident :ma/hasMember,
   :rdf/type :owl/ObjectProperty})

(def hasNamedFragment
  "Corresponds to 'namedFragment' in the Ontology for Media Resources."
  {:db/ident :ma/hasNamedFragment,
   :owl/inverseOf :ma/isNamedFragmentOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'namedFragment' in the Ontology for Media Resources.",
   :rdfs/subPropertyOf :ma/hasFragment})

(def hasPermissions
  "Corresponds to 'policy' in the Ontology for Media Resources with a  'policy.type' meaning \"permissions\"."
  {:db/ident :ma/hasPermissions,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'policy' in the Ontology for Media Resources with a  'policy.type' meaning \"permissions\".",
   :rdfs/subPropertyOf :ma/hasPolicy})

(def hasPolicy
  "Corresponds to 'policy' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'policy.type'."
  {:db/ident :ma/hasPolicy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'policy' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'policy.type'.",
   :rdfs/domain :ma/MediaResource})

(def hasPublished
  {:db/ident :ma/hasPublished,
   :rdf/type :owl/ObjectProperty})

(def hasPublisher
  "Corresponds to 'publisher' in the Ontology for Media Resources."
  {:db/ident :ma/hasPublisher,
   :owl/inverseOf :ma/hasPublished,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'publisher' in the Ontology for Media Resources.",
   :rdfs/subPropertyOf :ma/hasContributor})

(def hasRating
  "Corresponds to 'rating' in the Ontology for Media Resources."
  {:db/ident :ma/hasRating,
   :owl/inverseOf :ma/isRatingOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string "Corresponds to 'rating' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :ma/Rating})

(def hasRatingSystem
  "Corresponds to 'rating.type' in the Ontology for Media Resources."
  {:db/ident :ma/hasRatingSystem,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'rating.type' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Rating})

(def hasRelatedImage
  "Corresponds to 'relation' and in the Ontology for Media Resources with a 'relation.type' meaning \"related image\"."
  {:db/ident :ma/hasRelatedImage,
   :owl/inverseOf :ma/isImageRelatedTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'relation' and in the Ontology for Media Resources with a 'relation.type' meaning \"related image\".",
   :rdfs/range :ma/Image,
   :rdfs/subPropertyOf :ma/hasRelatedResource})

(def hasRelatedLocation
  "Corresponds to 'location' in the Ontology for Media Resources. Subproperties are provided to specify, when possible, the relation between the media resource and the location."
  {:db/ident :ma/hasRelatedLocation,
   :owl/inverseOf :ma/isLocationRelatedTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'location' in the Ontology for Media Resources. Subproperties are provided to specify, when possible, the relation between the media resource and the location.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :ma/Location})

(def hasRelatedResource
  "Corresponds to 'relation' and in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'relation.type'."
  {:db/ident :ma/hasRelatedResource,
   :owl/inverseOf :ma/isRelatedTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'relation' and in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'relation.type'.",
   :rdfs/domain :ma/MediaResource})

(def hasSigning
  "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"signing\". This property can for example point to a spatial fragment or a VideoTrack. The sign language of the captioning track can be expressed by attaching a 'hasLanguage' property to the specific track."
  {:db/ident :ma/hasSigning,
   :owl/inverseOf :ma/isSigningOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"signing\". This property can for example point to a spatial fragment or a VideoTrack. The sign language of the captioning track can be expressed by attaching a 'hasLanguage' property to the specific track.",
   :rdfs/subPropertyOf :ma/hasFragment})

(def hasSource
  "Corresponds to 'relation' and in the Ontology for Media Resources with a 'relation.type' meaning \"source\"."
  {:db/ident :ma/hasSource,
   :owl/inverseOf :ma/isSourceOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'relation' and in the Ontology for Media Resources with a 'relation.type' meaning \"source\".",
   :rdfs/subPropertyOf :ma/hasRelatedResource})

(def hasSubtitling
  "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"subtitling\"."
  {:db/ident :ma/hasSubtitling,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"subtitling\".",
   :rdfs/subPropertyOf [:ma/hasCaptioning :ma/hasFragment]})

(def hasTargetAudience
  "Corresponds to 'targetAudience' in the Ontology for Media Resources."
  {:db/ident :ma/hasTargetAudience,
   :owl/inverseOf :ma/isTargetAudienceOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'targetAudience' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :ma/TargetAudience})

(def hasTrack
  "Corresponds to 'fragment' in the Ontology for Media Resources with a 'fragment.role' meaning \"track\"."
  {:db/ident :ma/hasTrack,
   :owl/inverseOf :ma/isTrackOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
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
  "Corresponds to 'copyright.identifier' in the Ontology for Media Resources."
  {:db/ident :ma/isCopyrightedBy,
   :owl/inverseOf :ma/hasCopyrightOver,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
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
  "Corresponds to 'collection' in the Ontology for Media Resources."
  {:db/ident :ma/isMemberOf,
   :owl/inverseOf :ma/hasMember,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'collection' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :ma/Collection})

(def isNamedFragmentOf
  {:db/ident :ma/isNamedFragmentOf,
   :rdf/type :owl/ObjectProperty})

(def isProvidedBy
  "Corresponds to 'rating.identifier' in the Ontology for Media Resources."
  {:db/ident :ma/isProvidedBy,
   :owl/inverseOf :ma/provides,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
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
  "Corresponds to 'location.altitude' in the Ontology for Media Resources."
  {:db/ident :ma/locationAltitude,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'location.altitude' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Location,
   :rdfs/range :xsd/decimal})

(def locationLatitude
  "Corresponds to 'location.latitude' in the Ontology for Media Resources."
  {:db/ident :ma/locationLatitude,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'location.latitude' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Location,
   :rdfs/range :xsd/decimal})

(def locationLongitude
  "Corresponds to 'location.longitude' in the Ontology for Media Resources."
  {:db/ident :ma/locationLongitude,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'location.longitude' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Location,
   :rdfs/range :xsd/decimal})

(def locationName
  "Corresponds to 'location.name' in the Ontology for Media Resources."
  {:db/ident :ma/locationName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'location.name' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Location})

(def locator
  "Corresponds to 'locator' in the Ontology for Media Resources."
  {:db/ident :ma/locator,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string "Corresponds to 'locator' in the Ontology for Media Resources.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :xsd/anyURI})

(def mainOriginalTitle
  "Corresponds to 'title.title' in the Ontology for Media Resources with a 'title.type' meaning \"original\"."
  {:db/ident :ma/mainOriginalTitle,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'title.title' in the Ontology for Media Resources with a 'title.type' meaning \"original\".",
   :rdfs/subPropertyOf :ma/title})

(def numberOfTracks
  "Corresponds to 'numTracks.number' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'numTracks.type'."
  {:db/ident :ma/numberOfTracks,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
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
  "Corresponds to 'rating.max' in the Ontology for Media Resources."
  {:db/ident :ma/ratingScaleMax,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'rating.max' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Rating,
   :rdfs/range :xsd/decimal})

(def ratingScaleMin
  "Corresponds to 'rating.min' in the Ontology for Media Resources."
  {:db/ident :ma/ratingScaleMin,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'rating.min' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Rating,
   :rdfs/range :xsd/decimal})

(def ratingValue
  "Corresponds to 'rating.value' in the Ontology for Media Resources."
  {:db/ident :ma/ratingValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'rating.value' in the Ontology for Media Resources.",
   :rdfs/domain :ma/Rating,
   :rdfs/range :xsd/decimal})

(def recordDate
  "Corresponds to 'date.date' in the Ontology for Media Resources with a 'date.type' meaning \"recordDate\"."
  {:db/ident :ma/recordDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'date.date' in the Ontology for Media Resources with a 'date.type' meaning \"recordDate\".",
   :rdfs/subPropertyOf :ma/date})

(def releaseDate
  "Corresponds to 'date.date' in the Ontology for Media Resources with a 'date.type' meaning \"releaseDate\"."
  {:db/ident :ma/releaseDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'date.date' in the Ontology for Media Resources with a 'date.type' meaning \"releaseDate\".",
   :rdfs/subPropertyOf :ma/date})

(def samplingRate
  "Corresponds to 'samplingRate' in the Ontology for Media Resources, in samples per second."
  {:db/ident :ma/samplingRate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'samplingRate' in the Ontology for Media Resources, in samples per second.",
   :rdfs/domain :ma/MediaResource,
   :rdfs/range :xsd/decimal})

(def title
  "Corresponds to 'title.title' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'title.type'."
  {:db/ident :ma/title,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'title.title' in the Ontology for Media Resources. Subproperties can be used to distinguish different values of 'title.type'.",
   :rdfs/domain :ma/MediaResource})

(def trackName
  "Corresponds to 'fragment.name' in the Ontology for Media Resources, for Track fragments."
  {:db/ident :ma/trackName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "Corresponds to 'fragment.name' in the Ontology for Media Resources, for Track fragments.",
   :rdfs/domain :ma/Track,
   :rdfs/subPropertyOf :ma/fragmentName})