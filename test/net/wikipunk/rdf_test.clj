(ns net.wikipunk.rdf-test
  (:require
   [clojure.test :refer :all]
   [com.stuartsierra.component.repl :refer [system]]
   [net.wikipunk.mop :as mop]
   [net.wikipunk.rdf :as rdf]
   [net.wikipunk.rdf.d3f]))

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
             :schema/Recommendation
             :schema/SpecialAnnouncement
             :schema/Quiz
             :schema/CorrectionComment
             :schema/AdvertiserContentArticle
             :schema/CriticReview
             :schema/ImageObject
             :schema/DigitalDocument
             :schema/CheckoutPage
             :schema/VideoObject
             :schema/MathSolver
             :schema/RadioClip
             :schema/Collection
             :schema/FAQPage
             :schema/CreativeWorkSeason
             :schema/SocialMediaPosting
             :schema/Blog
             :schema/PresentationDigitalDocument
             :schema/Menu
             :schema/Play
             :schema/Chapter
             :schema/Thesis
             :schema/PublicationIssue
             :schema/Periodical
             :schema/Photograph
             :schema/UserReview
             :schema/PodcastEpisode
             :schema/MusicRecording
             :schema/Review
             :schema/VisualArtwork
             :schema/AboutPage
             :schema/Table
             :schema/HyperTocEntry
             :schema/|3DModel|
             :schema/WebContent
             :schema/TVSeries
             :schema/Legislation
             :schema/WebSite
             :schema/Comment
             :schema/Report
             :schema/MovieSeries
             :schema/HyperToc
             :schema/Audiobook
             :schema/LearningResource
             :schema/AnalysisNewsArticle
             :schema/WPFooter
             :schema/RadioEpisode
             :schema/TechArticle
             :schema/OpinionNewsArticle
             :schema/TextObject
             :schema/TVEpisode
             :schema/PodcastSeries
             :schema/MediaGallery
             :schema/CoverArt
             :schema/CollectionPage
             :schema/AudioObjectSnapshot
             :schema/Answer
             :schema/Conversation
             :schema/APIReference
             :schema/MovieClip
             :schema/EmployerReview
             :schema/Game
             :schema/SoftwareApplication
             :schema/Syllabus
             :schema/QAPage
             :schema/MenuSection
             :schema/MedicalScholarlyArticle
             :schema/Diet
             :schema/MediaReview
             :schema/WebPage
             :schema/BackgroundNewsArticle
             :schema/Manuscript
             :schema/SoftwareSourceCode
             :schema/DataCatalog
             :schema/ProductCollection
             :schema/PublicationVolume
             :schema/ProfilePage
             :schema/ScholarlyArticle
             :schema/MusicRelease
             :schema/CompleteDataFeed
             :schema/SpreadsheetDigitalDocument
             :schema/EducationalOccupationalCredential
             :schema/CategoryCodeSet
             :schema/CreativeWorkSeries
             :schema/Newspaper
             :schema/MediaReviewItem
             :schema/Poster
             :schema/MedicalWebPage
             :schema/Course
             :schema/SatiricalArticle
             :schema/AudioObject
             :schema/Quotation
             :schema/ComicSeries
             :schema/ArchiveComponent
             :schema/HowToSection
             :schema/MusicVideoObject
             :schema/AmpStory
             :schema/WebPageElement
             :schema/HowToStep
             :schema/MusicAlbum
             :schema/VideoGallery
             :schema/Guide
             :schema/NoteDigitalDocument
             :schema/ExercisePlan
             :schema/VideoGameClip
             :schema/Sculpture
             :schema/Barcode
             :schema/WebApplication
             :schema/Code
             :schema/RadioSeason
             :schema/ImageObjectSnapshot
             :schema/PodcastSeason
             :schema/EmailMessage
             :schema/AskPublicNewsArticle
             :schema/ComicCoverArt
             :schema/Clip
             :schema/Movie
             :schema/Claim
             :schema/Article
             :schema/WPAdBlock
             :schema/MusicComposition
             :schema/VideoGame
             :schema/LegislationObject
             :schema/Book
             :schema/Map
             :schema/Statement
             :schema/SearchResultsPage
             :schema/DataFeed
             :schema/Season
             :schema/Drawing
             :schema/HealthTopicContent
             :schema/TVSeason
             :schema/MusicPlaylist
             :schema/Question
             :schema/ContactPage
             :schema/HowToDirection
             :schema/ReviewNewsArticle
             :schema/DataDownload
             :schema/ShortStory
             :schema/BookSeries
             :schema/WPSideBar
             :schema/TVClip
             :schema/ClaimReview
             :schema/Message
             :schema/ItemPage
             :schema/RealEstateListing
             :schema/WPHeader
             :schema/HowToTip
             :schema/HowTo
             :schema/TextDigitalDocument
             :schema/VideoObjectSnapshot
             :schema/ComicStory
             :schema/ReportageNewsArticle
             :schema/BlogPosting
             :schema/VideoGameSeries
             :schema/Recipe
             :schema/SiteNavigationElement
             :schema/Dataset
             :schema/SheetMusic
             :schema/ComicIssue
             :schema/RadioSeries
             :schema/DefinedTermSet
             :schema/ImageGallery
             :schema/Atlas
             :schema/MobileApplication
             :schema/NewsArticle
             :schema/LiveBlogPosting
             :schema/DiscussionForumPosting}))))

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

;; write tests for RDF literals

;; #xsd/string "hello"
;; #xsd/long 0
;; #xsd/float 0.0
