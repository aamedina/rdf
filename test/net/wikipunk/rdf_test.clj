(ns net.wikipunk.rdf-test
  (:require
   [clojure.datafy :refer [datafy]]
   [clojure.test :refer :all]
   [com.stuartsierra.component.repl :refer [system]]
   [net.wikipunk.mop :as mop]
   [net.wikipunk.rdf :as rdf]
   [net.wikipunk.rdf.d3f]
   [net.wikipunk.rdf.schema]))

(use-fixtures :once
              (fn [f]
                (assert system "the system must be started before running tests")
                (binding [rdf/*slash* true]
                  (f))))

(deftest iri->kw
  (testing "IRIs such as http://d3fend.mitre.org/ontologies/d3fend.owl#Reference-EvictionGuidanceforNetworksAffectedbytheSolarWindsandActiveDirectory/M365Compromise-CISA have a slash in the name part that needs to be munged"
    (is (= (rdf/kw "http://d3fend.mitre.org/ontologies/d3fend.owl#Reference-EvictionGuidanceforNetworksAffectedbytheSolarWindsandActiveDirectory/M365Compromise-CISA")
           :d3f/Reference-EvictionGuidanceforNetworksAffectedbytheSolarWindsandActiveDirectory_SLASH_M365Compromise-CISA)
        "terms with slashes in their names are munged using _SLASH_")))

(deftest kw->iri
  (testing "IRIs such as http://d3fend.mitre.org/ontologies/d3fend.owl#Reference-EvictionGuidanceforNetworksAffectedbytheSolarWindsandActiveDirectory/M365Compromise-CISA has a slash in the name part that needs to be demunged"
    (is (= (rdf/iri :d3f/Reference-EvictionGuidanceforNetworksAffectedbytheSolarWindsandActiveDirectory_SLASH_M365Compromise-CISA)
           "http://d3fend.mitre.org/ontologies/d3fend.owl#Reference-EvictionGuidanceforNetworksAffectedbytheSolarWindsandActiveDirectory/M365Compromise-CISA")
        "Keywords containing _SLASH_ are demunged into a / character")))

(deftest class-direct-subclasses
  (testing "validating the MOP :schema/CreativeWork inferred class direct subclasses"
    (is (= (mop/class-direct-subclasses :schema/CreativeWork)
           #{:schema/Painting
             :schema/Episode
             :schema/MediaObject
             :schema/SpecialAnnouncement
             :schema/DigitalDocument
             :schema/MathSolver
             :schema/Collection
             :schema/CreativeWorkSeason
             :schema/Blog
             :schema/Menu
             :schema/Play
             :schema/Chapter
             :schema/Thesis
             :schema/PublicationIssue
             :schema/Photograph
             :schema/MusicRecording
             :schema/Review
             :schema/VisualArtwork
             :schema/HyperTocEntry
             :schema/WebContent
             :schema/TVSeries
             :schema/Legislation
             :schema/WebSite
             :schema/Comment
             :schema/HyperToc
             :schema/LearningResource
             :schema/Conversation
             :schema/Game
             :schema/SoftwareApplication
             :schema/MenuSection
             :schema/Diet
             :schema/WebPage
             :schema/Manuscript
             :schema/SoftwareSourceCode
             :schema/DataCatalog
             :schema/PublicationVolume
             :schema/EducationalOccupationalCredential
             :schema/CreativeWorkSeries
             :schema/MediaReviewItem
             :schema/Poster
             :schema/Course
             :schema/Quotation
             :schema/ArchiveComponent
             :schema/HowToSection
             :schema/AmpStory
             :schema/WebPageElement
             :schema/HowToStep
             :schema/Guide
             :schema/ExercisePlan
             :schema/Sculpture
             :schema/Code
             :schema/Clip
             :schema/Movie
             :schema/Claim
             :schema/Article
             :schema/MusicComposition
             :schema/Book
             :schema/Map
             :schema/Statement
             :schema/Season
             :schema/Drawing
             :schema/TVSeason
             :schema/MusicPlaylist
             :schema/HowToDirection
             :schema/ShortStory
             :schema/Message
             :schema/HowToTip
             :schema/HowTo
             :schema/ComicStory
             :schema/Dataset
             :schema/SheetMusic
             :schema/DefinedTermSet
             :schema/Atlas}))))

(deftest class-slots
  (testing "validating the MOP :schema/Movie inferred class slots"
    (is (= (set (mop/class-slots :schema/Movie))
           #{:schema/alternateName
             :schema/encodingFormat
             :schema/awards
             :schema/isBasedOn
             :schema/text
             :schema/creator
             :schema/accessibilityFeature
             :schema/dateModified
             :schema/contentReferenceTime
             :schema/accessibilityControl
             :schema/producer
             :schema/typicalAgeRange
             :schema/alternativeHeadline
             :schema/headline
             :schema/locationCreated
             :schema/correction
             :schema/contentLocation
             :schema/exampleOfWork
             :schema/releasedEvent
             :schema/accessibilityAPI
             :schema/isFamilyFriendly
             :schema/director
             :schema/trailer
             :schema/educationalAlignment
             :schema/publisher
             :schema/license
             :schema/productionCompany
             :schema/musicBy
             :schema/video
             :schema/sourceOrganization
             :schema/mentions
             :schema/assesses
             :schema/subtitleLanguage
             :schema/interactivityType
             :schema/duration
             :schema/accessibilityHazard
             :schema/fileFormat
             :schema/publication
             :schema/abstract
             :schema/datePublished
             :schema/copyrightYear
             :schema/editor
             :schema/editEIDR
             :schema/accessibilitySummary
             :schema/inLanguage
             :schema/titleEIDR
             :schema/mainEntity
             :schema/spatial
             :schema/thumbnailUrl
             :schema/associatedMedia
             :schema/mainEntityOfPage
             :schema/disambiguatingDescription
             :schema/hasPart
             :schema/translator
             :schema/subjectOf
             :schema/funding
             :schema/potentialAction
             :schema/sdLicense
             :schema/educationalUse
             :schema/encodings
             :schema/interactionStatistic
             :schema/workTranslation
             :schema/size
             :schema/sdPublisher
             :schema/publisherImprint
             :schema/author
             :schema/expires
             :schema/keywords
             :schema/name
             :schema/additionalType
             :schema/contentRating
             :schema/conditionsOfAccess
             :schema/recordedAt
             :schema/copyrightNotice
             :schema/actors
             :schema/genre
             :schema/creativeWorkStatus
             :schema/description
             :schema/countryOfOrigin
             :schema/sdDatePublished
             :schema/isBasedOnUrl
             :schema/contributor
             :schema/spatialCoverage
             :schema/sponsor
             :schema/copyrightHolder
             :schema/schemaVersion
             :schema/temporal
             :schema/review
             :schema/sameAs
             :schema/identifier
             :schema/accountablePerson
             :schema/isAccessibleForFree
             :schema/material
             :schema/directors
             :schema/image
             :schema/audience
             :schema/thumbnail
             :schema/position
             :schema/workExample
             :schema/url
             :schema/comment
             :schema/teaches
             :schema/interpretedAsClaim
             :schema/citation
             :schema/reviews
             :schema/commentCount
             :schema/acquireLicensePage
             :schema/materialExtent
             :schema/award
             :schema/isPartOf
             :schema/translationOfWork
             :schema/aggregateRating
             :schema/learningResourceType
             :schema/audio
             :schema/usageInfo
             :schema/educationalLevel
             :schema/dateCreated
             :schema/funder
             :schema/provider
             :schema/accessModeSufficient
             :schema/timeRequired
             :schema/archivedAt
             :schema/publishingPrinciples
             :schema/creditText
             :schema/maintainer
             :schema/temporalCoverage
             :schema/character
             :schema/pattern
             :schema/accessMode
             :schema/actor
             :schema/about
             :schema/version
             :schema/encoding
             :schema/offers
             :schema/discussionUrl})))
  (testing "validating the MOP :schema/Movie inferred class direct slots"
    (is (= (set (mop/class-direct-slots :schema/Movie))
           #{:schema/director
             :schema/trailer
             :schema/productionCompany
             :schema/musicBy
             :schema/subtitleLanguage
             :schema/duration
             :schema/titleEIDR
             :schema/actors
             :schema/countryOfOrigin
             :schema/directors
             :schema/actor}))))

(deftest get-doc
  (is (= (rdf/get-doc (meta (find-ns 'net.wikipunk.rdf.d3f)))
         "D3FEND is a framework which encodes a countermeasure knowledge base as a knowledge graph. The graph contains the types and relations that define key concepts in the cybersecurity countermeasure domain and the relations necessary to link those concepts to each other. Each of these concepts and relations are linked to references in the cybersecurity literature."))
  (is (= (rdf/get-doc (datafy :d3f/BayesianEstimation))
         "A Bayes estimator or a Bayes action is an estimator or decision rule that minimizes the posterior expected value of a loss function (i.e., the posterior expected loss).")))

(deftest cpl
  (testing "mop/compute-class-precedence-list"
    (is (= (mop/compute-class-precedence-list :schema/Movie)
           [:schema/Movie
            :schema/CreativeWork
            :schema/Thing
            :rdfs/Class]))
    (is (= (mop/compute-class-precedence-list :d3f/ApplicationHardening)
           [:d3f/ApplicationHardening
            :d3f/DefensiveTechnique
            :d3f/CapabilityFeature
            :d3f/Technique
            :d3f/InformationContentEntity
            :d3f/D3FENDCatalogThing
            :d3f/D3FENDThing
            :owl/Class]))))
