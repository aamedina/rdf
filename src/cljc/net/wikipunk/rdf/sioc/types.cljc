(ns net.wikipunk.rdf.sioc.types
  {:dcat/downloadURL  "net/wikipunk/ext/sioc.types.rdf",
   :rdf/ns-prefix-map {"annotation" "http://www.w3.org/2000/10/annotation-ns#",
                       "annotea" "http://www.w3.org/2002/01/bookmark#",
                       "cal" "http://www.w3.org/2002/12/cal/icaltzd#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "doap" "http://usefulinc.com/ns/doap#",
                       "exif" "http://www.w3.org/2003/12/exif/ns/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "sioc" "http://rdfs.org/sioc/ns#",
                       "sioc.types" "http://rdfs.org/sioc/types#",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "wot" "http://xmlns.com/wot/0.1/"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "sioc.types",
   :rdfa/uri          "http://rdfs.org/sioc/types#"})

(def AddressBook
  {:db/ident :sioc.types/AddressBook,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a collection of personal or organisational addresses."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Address Book"},
   :rdfs/seeAlso :foaf/Agent,
   :rdfs/subClassOf :sioc/Container})

(def AnnotationSet
  {:db/ident :sioc.types/AnnotationSet,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a set of annotations, for example, those created by a particular user or related to a particular topic."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Annotation Set"},
   :rdfs/seeAlso :annotation/Annotation,
   :rdfs/subClassOf :sioc/Container})

(def Answer
  {:db/ident         :sioc.types/Answer,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A Post that provides an answer in reply to a Question."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Answer"},
   :rdfs/subClassOf  :sioc/Post})

(def ArgumentativeDiscussion
  {:db/ident :sioc.types/ArgumentativeDiscussion,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a discussion area where logical arguments can take place."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Argumentative Discussion"},
   :rdfs/seeAlso {:xsd/anyURI "http://purl.org/ibis#Idea"},
   :rdfs/subClassOf :sioc/Forum})

(def AudioChannel
  {:db/ident :sioc.types/AudioChannel,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a channel for distributing audio or sound files, for example, a podcast."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Audio Channel"},
   :rdfs/seeAlso :dcmitype/Sound,
   :rdfs/subClassOf :sioc/Container})

(def BestAnswer
  {:db/ident :sioc.types/BestAnswer,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Post that is the best answer to a Question, as chosen by the UserAccount who asked the Question or as voted by a Community of UserAccounts."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Best Answer"},
   :rdfs/subClassOf :sioc/Post})

(def BlogPost
  {:db/ident :sioc.types/BlogPost,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Describes a post that is specifically made on a weblog."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Blog Post"},
   :rdfs/seeAlso :sioc.types/Weblog,
   :rdfs/subClassOf :sioc/Post})

(def BoardPost
  {:db/ident :sioc.types/BoardPost,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a post that is specifically made on a message board."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Board Post"},
   :rdfs/seeAlso :sioc.types/MessageBoard,
   :rdfs/subClassOf :sioc/Post})

(def BookmarkFolder
  {:db/ident         :sioc.types/BookmarkFolder,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "Describes a shared collection of bookmarks."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Bookmark Folder"},
   :rdfs/seeAlso     :annotea/Bookmark,
   :rdfs/subClassOf  :sioc/Container})

(def Briefcase
  {:db/ident         :sioc.types/Briefcase,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Describes a briefcase or file service."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Briefcase"},
   :rdfs/seeAlso     :foaf/Document,
   :rdfs/subClassOf  :sioc/Container})

(def Category
  {:db/ident :sioc.types/Category,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Category is used on the object of sioc:topic to indicate that this resource is a category on a site."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Category"},
   :rdfs/subClassOf {:xsd/anyURI "http://www.w3.org/2008/05/skos#Concept"}})

(def ChatChannel
  {:db/ident :sioc.types/ChatChannel,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a channel for chat or instant messages, for example, via IRC or IM."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Chat Channel"},
   :rdfs/seeAlso :sioc.types/InstantMessage,
   :rdfs/subClassOf :sioc/Forum})

(def Comment
  {:db/ident :sioc.types/Comment,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Comment is a subtype of sioc:Post and allows one to explicitly indicate that this SIOC post is a comment.  Note that comments have a narrower scope than sioc:Post and may not apply to all types of community site."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Comment"},
   :rdfs/seeAlso :sioc/Forum,
   :rdfs/subClassOf :sioc/Post})

(def EventCalendar
  {:db/ident         :sioc.types/EventCalendar,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Describes a calendar of events."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Event Calendar"},
   :rdfs/seeAlso     :cal/Vevent,
   :rdfs/subClassOf  :sioc/Container})

(def FavouriteThings
  {:db/ident :sioc.types/FavouriteThings,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Describes a list or a collection of one's favourite things."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Favourite Things"},
   :rdfs/subClassOf :sioc/Container})

(def ImageGallery
  {:db/ident :sioc.types/ImageGallery,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Describes an image gallery, for example, a photo album."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Image Gallery"},
   :rdfs/seeAlso :exif/IFD,
   :rdfs/subClassOf :sioc/Container})

(def InstantMessage
  {:db/ident         :sioc.types/InstantMessage,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Describes an instant message, e.g. sent via Jabber."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Instant Message"},
   :rdfs/seeAlso     :sioc.types/ChatChannel,
   :rdfs/subClassOf  :sioc/Post})

(def MailMessage
  {:db/ident :sioc.types/MailMessage,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes an electronic mail message, e.g. a post sent to a mailing list."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mail Message"},
   :rdfs/seeAlso :sioc.types/MailingList,
   :rdfs/subClassOf :sioc/Post})

(def MailingList
  {:db/ident         :sioc.types/MailingList,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Describes an electronic mailing list."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Mailing List"},
   :rdfs/seeAlso     :sioc.types/MailMessage,
   :rdfs/subClassOf  :sioc/Forum})

(def MessageBoard
  {:db/ident :sioc.types/MessageBoard,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a message board, also known as an online bulletin board or discussion forum."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Message Board"},
   :rdfs/seeAlso :sioc.types/BoardPost,
   :rdfs/subClassOf :sioc/Forum})

(def Microblog
  {:db/ident :sioc.types/Microblog,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a microblog, i.e. a blog consisting of short text messages."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Microblog"},
   :rdfs/seeAlso :sioc.types/MicroblogPost,
   :rdfs/subClassOf :sioc/Forum})

(def MicroblogPost
  {:db/ident :sioc.types/MicroblogPost,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Describes a post that is specifically made on a microblog."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Microblog Post"},
   :rdfs/seeAlso :sioc.types/Microblog,
   :rdfs/subClassOf :sioc/Post})

(def OfferList
  {:db/ident :sioc.types/OfferList,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Describes a list of the items someone has available to offer."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Offer List"},
   :rdfs/subClassOf :sioc/Container})

(def Playlist
  {:db/ident :sioc.types/Playlist,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a list of media items that have been played or can be played."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Playlist"},
   :rdfs/subClassOf :sioc/Container})

(def Poll
  {:db/ident :sioc.types/Poll,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a posted item that contains a poll or survey content."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Poll"},
   :rdfs/seeAlso :sioc.types/SurveyCollection,
   :rdfs/subClassOf :sioc/Item})

(def ProjectDirectory
  {:db/ident         :sioc.types/ProjectDirectory,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Describes a project directory."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Project Directory"},
   :rdfs/seeAlso     :doap/Project,
   :rdfs/subClassOf  :sioc/Container})

(def Question
  {:db/ident         :sioc.types/Question,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A Post that asks a Question."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Question"},
   :rdfs/subClassOf  :sioc/Post})

(def ReadingList
  {:db/ident :sioc.types/ReadingList,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a list of books or other materials that have been read or are suggested for reading."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Reading List"},
   :rdfs/subClassOf :sioc/Container})

(def ResumeBank
  {:db/ident         :sioc.types/ResumeBank,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Describes a collection of resumes."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Resume Bank"},
   :rdfs/seeAlso     {:xsd/anyURI
                      "http://captsolo.net/semweb/resume/cv.rdfs#Resume"},
   :rdfs/subClassOf  :sioc/Container})

(def ReviewArea
  {:db/ident :sioc.types/ReviewArea,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Describes an area where reviews are posted."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Review Area"},
   :rdfs/seeAlso
   #{{:xsd/anyURI
      "http://www.isi.edu/webscripter/communityreview/abstract-review-o#Review"}
     :rev/Review},
   :rdfs/subClassOf :sioc/Container})

(def SubscriptionList
  {:db/ident         :sioc.types/SubscriptionList,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Describes a shared set of feed subscriptions."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Subscription List"},
   :rdfs/seeAlso     {:xsd/anyURI "http://atomowl.org/ontologies/atomrdf#Feed"},
   :rdfs/subClassOf  :sioc/Container})

(def SurveyCollection
  {:db/ident :sioc.types/SurveyCollection,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes an area where survey data can be collected, e.g. from polls."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Survey Collection"},
   :rdfs/seeAlso :sioc.types/Poll,
   :rdfs/subClassOf :sioc/Container})

(def Tag
  {:db/ident :sioc.types/Tag,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Tag is used on the object of sioc:topic to indicate that this resource is a tag on a site."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tag"}})

(def VideoChannel
  {:db/ident :sioc.types/VideoChannel,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a channel for distributing videos (moving image) files, for example, a video podcast."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Video Channel"},
   :rdfs/seeAlso :dcmitype/MovingImage,
   :rdfs/subClassOf :sioc/Container})

(def Weblog
  {:db/ident         :sioc.types/Weblog,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Describes a weblog (blog), i.e. an online journal."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Weblog"},
   :rdfs/seeAlso     :sioc.types/BlogPost,
   :rdfs/subClassOf  :sioc/Forum})

(def Wiki
  {:db/ident         :sioc.types/Wiki,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Describes a wiki space."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Wiki"},
   :rdfs/seeAlso     :sioc.types/WikiArticle,
   :rdfs/subClassOf  :sioc/Container})

(def WikiArticle
  {:db/ident         :sioc.types/WikiArticle,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Describes a wiki article."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Wiki Article"},
   :rdfs/seeAlso     :sioc.types/Wiki,
   :rdfs/subClassOf  :sioc/Item})

(def WishList
  {:db/ident         :sioc.types/WishList,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Describes a list of the items someone wishes to get."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://rdfs.org/sioc/types#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Wish List"},
   :rdfs/subClassOf  :sioc/Container})