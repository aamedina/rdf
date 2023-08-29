(ns net.wikipunk.rdf.sioc.types
  {:dcat/downloadURL  "resources/sioc.types.rdf",
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
  "Describes a collection of personal or organisational addresses."
  {:db/ident :sioc.types/AddressBook,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Describes a collection of personal or organisational addresses.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label #rdf/langString "Address Book@en",
   :rdfs/seeAlso :foaf/Agent,
   :rdfs/subClassOf :sioc/Container})

(def AnnotationSet
  "Describes a set of annotations, for example, those created by a particular user or related to a particular topic."
  {:db/ident :sioc.types/AnnotationSet,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Describes a set of annotations, for example, those created by a particular user or related to a particular topic.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label #rdf/langString "Annotation Set@en",
   :rdfs/seeAlso :annotation/Annotation,
   :rdfs/subClassOf :sioc/Container})

(def Answer
  "A Post that provides an answer in reply to a Question."
  {:db/ident :sioc.types/Answer,
   :rdf/type :owl/Class,
   :rdfs/comment #rdf/langString
                  "A Post that provides an answer in reply to a Question.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label #rdf/langString "Answer@en",
   :rdfs/subClassOf :sioc/Post})

(def ArgumentativeDiscussion
  "Describes a discussion area where logical arguments can take place."
  {:db/ident :sioc.types/ArgumentativeDiscussion,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Describes a discussion area where logical arguments can take place.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label #rdf/langString "Argumentative Discussion@en",
   :rdfs/seeAlso {:rdfa/uri "http://purl.org/ibis#Idea"},
   :rdfs/subClassOf :sioc/Forum})

(def AudioChannel
  "Describes a channel for distributing audio or sound files, for example, a podcast."
  {:db/ident :sioc.types/AudioChannel,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Describes a channel for distributing audio or sound files, for example, a podcast.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label #rdf/langString "Audio Channel@en",
   :rdfs/seeAlso :dcmitype/Sound,
   :rdfs/subClassOf :sioc/Container})

(def BestAnswer
  "A Post that is the best answer to a Question, as chosen by the UserAccount who asked the Question or as voted by a Community of UserAccounts."
  {:db/ident :sioc.types/BestAnswer,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "A Post that is the best answer to a Question, as chosen by the UserAccount who asked the Question or as voted by a Community of UserAccounts.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label #rdf/langString "Best Answer@en",
   :rdfs/subClassOf :sioc/Post})

(def BlogPost
  "Describes a post that is specifically made on a weblog."
  {:db/ident :sioc.types/BlogPost,
   :rdf/type :owl/Class,
   :rdfs/comment #rdf/langString
                  "Describes a post that is specifically made on a weblog.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label #rdf/langString "Blog Post@en",
   :rdfs/seeAlso :sioc.types/Weblog,
   :rdfs/subClassOf :sioc/Post})

(def BoardPost
  "Describes a post that is specifically made on a message board."
  {:db/ident :sioc.types/BoardPost,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Describes a post that is specifically made on a message board.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label #rdf/langString "Board Post@en",
   :rdfs/seeAlso :sioc.types/MessageBoard,
   :rdfs/subClassOf :sioc/Post})

(def BookmarkFolder
  "Describes a shared collection of bookmarks."
  {:db/ident         :sioc.types/BookmarkFolder,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString
                      "Describes a shared collection of bookmarks.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label       #rdf/langString "Bookmark Folder@en",
   :rdfs/seeAlso     :annotea/Bookmark,
   :rdfs/subClassOf  :sioc/Container})

(def Briefcase
  "Describes a briefcase or file service."
  {:db/ident         :sioc.types/Briefcase,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString
                      "Describes a briefcase or file service.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label       #rdf/langString "Briefcase@en",
   :rdfs/seeAlso     :foaf/Document,
   :rdfs/subClassOf  :sioc/Container})

(def Category
  "Category is used on the object of sioc:topic to indicate that this resource is a category on a site."
  {:db/ident :sioc.types/Category,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Category is used on the object of sioc:topic to indicate that this resource is a category on a site.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label #rdf/langString "Category@en",
   :rdfs/subClassOf {:rdfa/uri "http://www.w3.org/2008/05/skos#Concept"}})

(def ChatChannel
  "Describes a channel for chat or instant messages, for example, via IRC or IM."
  {:db/ident :sioc.types/ChatChannel,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Describes a channel for chat or instant messages, for example, via IRC or IM.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label #rdf/langString "Chat Channel@en",
   :rdfs/seeAlso :sioc.types/InstantMessage,
   :rdfs/subClassOf :sioc/Forum})

(def Comment
  "Comment is a subtype of sioc:Post and allows one to explicitly indicate that this SIOC post is a comment.  Note that comments have a narrower scope than sioc:Post and may not apply to all types of community site."
  {:db/ident :sioc.types/Comment,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Comment is a subtype of sioc:Post and allows one to explicitly indicate that this SIOC post is a comment.  Note that comments have a narrower scope than sioc:Post and may not apply to all types of community site.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label #rdf/langString "Comment@en",
   :rdfs/seeAlso :sioc/Forum,
   :rdfs/subClassOf :sioc/Post})

(def EventCalendar
  "Describes a calendar of events."
  {:db/ident         :sioc.types/EventCalendar,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString "Describes a calendar of events.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label       #rdf/langString "Event Calendar@en",
   :rdfs/seeAlso     :cal/Vevent,
   :rdfs/subClassOf  :sioc/Container})

(def FavouriteThings
  "Describes a list or a collection of one's favourite things."
  {:db/ident :sioc.types/FavouriteThings,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Describes a list or a collection of one's favourite things.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label #rdf/langString "Favourite Things@en",
   :rdfs/subClassOf :sioc/Container})

(def ImageGallery
  "Describes an image gallery, for example, a photo album."
  {:db/ident :sioc.types/ImageGallery,
   :rdf/type :owl/Class,
   :rdfs/comment #rdf/langString
                  "Describes an image gallery, for example, a photo album.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label #rdf/langString "Image Gallery@en",
   :rdfs/seeAlso :exif/IFD,
   :rdfs/subClassOf :sioc/Container})

(def InstantMessage
  "Describes an instant message, e.g. sent via Jabber."
  {:db/ident         :sioc.types/InstantMessage,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString
                      "Describes an instant message, e.g. sent via Jabber.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label       #rdf/langString "Instant Message@en",
   :rdfs/seeAlso     :sioc.types/ChatChannel,
   :rdfs/subClassOf  :sioc/Post})

(def MailMessage
  "Describes an electronic mail message, e.g. a post sent to a mailing list."
  {:db/ident :sioc.types/MailMessage,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Describes an electronic mail message, e.g. a post sent to a mailing list.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label #rdf/langString "Mail Message@en",
   :rdfs/seeAlso :sioc.types/MailingList,
   :rdfs/subClassOf :sioc/Post})

(def MailingList
  "Describes an electronic mailing list."
  {:db/ident         :sioc.types/MailingList,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString "Describes an electronic mailing list.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label       #rdf/langString "Mailing List@en",
   :rdfs/seeAlso     :sioc.types/MailMessage,
   :rdfs/subClassOf  :sioc/Forum})

(def MessageBoard
  "Describes a message board, also known as an online bulletin board or discussion forum."
  {:db/ident :sioc.types/MessageBoard,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Describes a message board, also known as an online bulletin board or discussion forum.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label #rdf/langString "Message Board@en",
   :rdfs/seeAlso :sioc.types/BoardPost,
   :rdfs/subClassOf :sioc/Forum})

(def Microblog
  "Describes a microblog, i.e. a blog consisting of short text messages."
  {:db/ident :sioc.types/Microblog,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Describes a microblog, i.e. a blog consisting of short text messages.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label #rdf/langString "Microblog@en",
   :rdfs/seeAlso :sioc.types/MicroblogPost,
   :rdfs/subClassOf :sioc/Forum})

(def MicroblogPost
  "Describes a post that is specifically made on a microblog."
  {:db/ident :sioc.types/MicroblogPost,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Describes a post that is specifically made on a microblog.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label #rdf/langString "Microblog Post@en",
   :rdfs/seeAlso :sioc.types/Microblog,
   :rdfs/subClassOf :sioc/Post})

(def OfferList
  "Describes a list of the items someone has available to offer."
  {:db/ident :sioc.types/OfferList,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Describes a list of the items someone has available to offer.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label #rdf/langString "Offer List@en",
   :rdfs/subClassOf :sioc/Container})

(def Playlist
  "Describes a list of media items that have been played or can be played."
  {:db/ident :sioc.types/Playlist,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Describes a list of media items that have been played or can be played.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label #rdf/langString "Playlist@en",
   :rdfs/subClassOf :sioc/Container})

(def Poll
  "Describes a posted item that contains a poll or survey content."
  {:db/ident :sioc.types/Poll,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Describes a posted item that contains a poll or survey content.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label #rdf/langString "Poll@en",
   :rdfs/seeAlso :sioc.types/SurveyCollection,
   :rdfs/subClassOf :sioc/Item})

(def ProjectDirectory
  "Describes a project directory."
  {:db/ident         :sioc.types/ProjectDirectory,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString "Describes a project directory.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label       #rdf/langString "Project Directory@en",
   :rdfs/seeAlso     :doap/Project,
   :rdfs/subClassOf  :sioc/Container})

(def Question
  "A Post that asks a Question."
  {:db/ident         :sioc.types/Question,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString "A Post that asks a Question.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label       #rdf/langString "Question@en",
   :rdfs/subClassOf  :sioc/Post})

(def ReadingList
  "Describes a list of books or other materials that have been read or are suggested for reading."
  {:db/ident :sioc.types/ReadingList,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Describes a list of books or other materials that have been read or are suggested for reading.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label #rdf/langString "Reading List@en",
   :rdfs/subClassOf :sioc/Container})

(def ResumeBank
  "Describes a collection of resumes."
  {:db/ident         :sioc.types/ResumeBank,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString "Describes a collection of resumes.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label       #rdf/langString "Resume Bank@en",
   :rdfs/seeAlso     {:rdfa/uri
                      "http://captsolo.net/semweb/resume/cv.rdfs#Resume"},
   :rdfs/subClassOf  :sioc/Container})

(def ReviewArea
  "Describes an area where reviews are posted."
  {:db/ident :sioc.types/ReviewArea,
   :rdf/type :owl/Class,
   :rdfs/comment #rdf/langString
                  "Describes an area where reviews are posted.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label #rdf/langString "Review Area@en",
   :rdfs/seeAlso
   [:rev/Review
    {:rdfa/uri
     "http://www.isi.edu/webscripter/communityreview/abstract-review-o#Review"}],
   :rdfs/subClassOf :sioc/Container})

(def SubscriptionList
  "Describes a shared set of feed subscriptions."
  {:db/ident         :sioc.types/SubscriptionList,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString
                      "Describes a shared set of feed subscriptions.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label       #rdf/langString "Subscription List@en",
   :rdfs/seeAlso     {:rdfa/uri "http://atomowl.org/ontologies/atomrdf#Feed"},
   :rdfs/subClassOf  :sioc/Container})

(def SurveyCollection
  "Describes an area where survey data can be collected, e.g. from polls."
  {:db/ident :sioc.types/SurveyCollection,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Describes an area where survey data can be collected, e.g. from polls.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label #rdf/langString "Survey Collection@en",
   :rdfs/seeAlso :sioc.types/Poll,
   :rdfs/subClassOf :sioc/Container})

(def Tag
  "Tag is used on the object of sioc:topic to indicate that this resource is a tag on a site."
  {:db/ident :sioc.types/Tag,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Tag is used on the object of sioc:topic to indicate that this resource is a tag on a site.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label #rdf/langString "Tag@en"})

(def VideoChannel
  "Describes a channel for distributing videos (moving image) files, for example, a video podcast."
  {:db/ident :sioc.types/VideoChannel,
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "Describes a channel for distributing videos (moving image) files, for example, a video podcast.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label #rdf/langString "Video Channel@en",
   :rdfs/seeAlso :dcmitype/MovingImage,
   :rdfs/subClassOf :sioc/Container})

(def Weblog
  "Describes a weblog (blog), i.e. an online journal."
  {:db/ident         :sioc.types/Weblog,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString
                      "Describes a weblog (blog), i.e. an online journal.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label       #rdf/langString "Weblog@en",
   :rdfs/seeAlso     :sioc.types/BlogPost,
   :rdfs/subClassOf  :sioc/Forum})

(def Wiki
  "Describes a wiki space."
  {:db/ident         :sioc.types/Wiki,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString "Describes a wiki space.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label       #rdf/langString "Wiki@en",
   :rdfs/seeAlso     :sioc.types/WikiArticle,
   :rdfs/subClassOf  :sioc/Container})

(def WikiArticle
  "Describes a wiki article."
  {:db/ident         :sioc.types/WikiArticle,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString "Describes a wiki article.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label       #rdf/langString "Wiki Article@en",
   :rdfs/seeAlso     :sioc.types/Wiki,
   :rdfs/subClassOf  :sioc/Item})

(def WishList
  "Describes a list of the items someone wishes to get."
  {:db/ident         :sioc.types/WishList,
   :rdf/type         :owl/Class,
   :rdfs/comment     #rdf/langString
                      "Describes a list of the items someone wishes to get.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://rdfs.org/sioc/types#"},
   :rdfs/label       #rdf/langString "Wish List@en",
   :rdfs/subClassOf  :sioc/Container})
