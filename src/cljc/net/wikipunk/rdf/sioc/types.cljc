(ns net.wikipunk.rdf.sioc.types
  "http://rdfs.org/sioc/ns#"
  {:rdf/ns-prefix-map {"annotation" "http://www.w3.org/2000/10/annotation-ns#",
                       "annotea" "http://www.w3.org/2002/01/bookmark#",
                       "cal" "http://www.w3.org/2002/12/cal/icaltzd#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "doap" "http://usefulinc.com/ns/doap#",
                       "exif" "http://www.w3.org/2003/12/exif/ns/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "ibis" "http://purl.org/ibis#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "sioc" "http://rdfs.org/sioc/ns#",
                       "sioc.types" "http://rdfs.org/sioc/types#",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "wot" "http://xmlns.com/wot/0.1/"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "sioc.types",
   :rdfa/uri          "http://rdfs.org/sioc/ns#"})

(def AddressBook
  "Describes a collection of personal or organisational addresses."
  {:db/ident :sioc.types/AddressBook,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a collection of personal or organisational addresses.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label "Address Book",
   :rdfs/seeAlso ["http://xmlns.com/foaf/0.1/Agent"],
   :rdfs/subClassOf [:sioc/Container :sioc.types/AddressBook]})

(def AnnotationSet
  "Describes a set of annotations, for example, those created by a particular user or related to a particular topic."
  {:db/ident :sioc.types/AnnotationSet,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a set of annotations, for example, those created by a particular user or related to a particular topic.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label "Annotation Set",
   :rdfs/seeAlso ["http://www.w3.org/2000/10/annotation-ns#Annotation"],
   :rdfs/subClassOf [:sioc/Container :sioc.types/AnnotationSet]})

(def Answer
  "A Post that provides an answer in reply to a Question."
  {:db/ident         :sioc.types/Answer,
   :rdf/type         :owl/Class,
   :rdfs/comment     "A Post that provides an answer in reply to a Question.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       "Answer",
   :rdfs/subClassOf  [:sioc/Post :sioc.types/Answer]})

(def ArgumentativeDiscussion
  "Describes a discussion area where logical arguments can take place."
  {:db/ident :sioc.types/ArgumentativeDiscussion,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a discussion area where logical arguments can take place.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label "Argumentative Discussion",
   :rdfs/seeAlso ["http://purl.org/ibis#Idea"],
   :rdfs/subClassOf [:sioc/Forum :sioc.types/ArgumentativeDiscussion]})

(def AudioChannel
  "Describes a channel for distributing audio or sound files, for example, a podcast."
  {:db/ident :sioc.types/AudioChannel,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a channel for distributing audio or sound files, for example, a podcast.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label "Audio Channel",
   :rdfs/seeAlso ["http://purl.org/dc/dcmitype/Sound"],
   :rdfs/subClassOf [:sioc/Container :sioc.types/AudioChannel]})

(def BestAnswer
  "A Post that is the best answer to a Question, as chosen by the UserAccount who asked the Question or as voted by a Community of UserAccounts."
  {:db/ident :sioc.types/BestAnswer,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Post that is the best answer to a Question, as chosen by the UserAccount who asked the Question or as voted by a Community of UserAccounts.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label "Best Answer",
   :rdfs/subClassOf [:sioc/Post :sioc.types/BestAnswer]})

(def BlogPost
  "Describes a post that is specifically made on a weblog."
  {:db/ident         :sioc.types/BlogPost,
   :rdf/type         :owl/Class,
   :rdfs/comment     "Describes a post that is specifically made on a weblog.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       "Blog Post",
   :rdfs/seeAlso     ["http://rdfs.org/sioc/types#Weblog"],
   :rdfs/subClassOf  [:sioc/Post :sioc.types/BlogPost]})

(def BoardPost
  "Describes a post that is specifically made on a message board."
  {:db/ident :sioc.types/BoardPost,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a post that is specifically made on a message board.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label "Board Post",
   :rdfs/seeAlso ["http://rdfs.org/sioc/types#MessageBoard"],
   :rdfs/subClassOf [:sioc/Post :sioc.types/BoardPost]})

(def BookmarkFolder
  "Describes a shared collection of bookmarks."
  {:db/ident         :sioc.types/BookmarkFolder,
   :rdf/type         :owl/Class,
   :rdfs/comment     "Describes a shared collection of bookmarks.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       "Bookmark Folder",
   :rdfs/seeAlso     ["http://www.w3.org/2002/01/bookmark#Bookmark"],
   :rdfs/subClassOf  [:sioc/Container :sioc.types/BookmarkFolder]})

(def Briefcase
  "Describes a briefcase or file service."
  {:db/ident         :sioc.types/Briefcase,
   :rdf/type         :owl/Class,
   :rdfs/comment     "Describes a briefcase or file service.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       "Briefcase",
   :rdfs/seeAlso     ["http://xmlns.com/foaf/0.1/Document"],
   :rdfs/subClassOf  [:sioc/Container :sioc.types/Briefcase]})

(def Category
  "Category is used on the object of sioc:topic to indicate that this resource is a category on a site."
  {:db/ident :sioc.types/Category,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Category is used on the object of sioc:topic to indicate that this resource is a category on a site.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label "Category",
   :rdfs/subClassOf ["http://www.w3.org/2008/05/skos#Concept"
                     :sioc.types/Category]})

(def ChatChannel
  "Describes a channel for chat or instant messages, for example, via IRC or IM."
  {:db/ident :sioc.types/ChatChannel,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a channel for chat or instant messages, for example, via IRC or IM.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label "Chat Channel",
   :rdfs/seeAlso ["http://rdfs.org/sioc/types#InstantMessage"],
   :rdfs/subClassOf [:sioc/Forum :sioc.types/ChatChannel]})

(def Comment
  "Comment is a subtype of sioc:Post and allows one to explicitly indicate that this SIOC post is a comment. Note that comments have a narrower scope than sioc:Post and may not apply to all types of community site."
  {:db/ident :sioc.types/Comment,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Comment is a subtype of sioc:Post and allows one to explicitly indicate that this SIOC post is a comment.  Note that comments have a narrower scope than sioc:Post and may not apply to all types of community site.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label "Comment",
   :rdfs/seeAlso ["http://rdfs.org/sioc/types#Forum"],
   :rdfs/subClassOf [:sioc/Post :sioc.types/Comment]})

(def EventCalendar
  "Describes a calendar of events."
  {:db/ident         :sioc.types/EventCalendar,
   :rdf/type         :owl/Class,
   :rdfs/comment     "Describes a calendar of events.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       "Event Calendar",
   :rdfs/seeAlso     ["http://www.w3.org/2002/12/cal/icaltzd#VEVENT"],
   :rdfs/subClassOf  [:sioc/Container :sioc.types/EventCalendar]})

(def FavouriteThings
  "Describes a list or a collection of one's favourite things."
  {:db/ident :sioc.types/FavouriteThings,
   :rdf/type :owl/Class,
   :rdfs/comment "Describes a list or a collection of one's favourite things.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label "Favourite Things",
   :rdfs/subClassOf [:sioc/Container :sioc.types/FavouriteThings]})

(def ImageGallery
  "Describes an image gallery, for example, a photo album."
  {:db/ident         :sioc.types/ImageGallery,
   :rdf/type         :owl/Class,
   :rdfs/comment     "Describes an image gallery, for example, a photo album.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       "Image Gallery",
   :rdfs/seeAlso     ["http://www.w3.org/2003/12/exif/ns#IFD"],
   :rdfs/subClassOf  [:sioc/Container :sioc.types/ImageGallery]})

(def InstantMessage
  "Describes an instant message, e.g. sent via Jabber."
  {:db/ident         :sioc.types/InstantMessage,
   :rdf/type         :owl/Class,
   :rdfs/comment     "Describes an instant message, e.g. sent via Jabber.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       "Instant Message",
   :rdfs/seeAlso     ["http://rdfs.org/sioc/types#ChatChannel"],
   :rdfs/subClassOf  [:sioc/Post :sioc.types/InstantMessage]})

(def MailMessage
  "Describes an electronic mail message, e.g. a post sent to a mailing list."
  {:db/ident :sioc.types/MailMessage,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes an electronic mail message, e.g. a post sent to a mailing list.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label "Mail Message",
   :rdfs/seeAlso ["http://rdfs.org/sioc/types#MailingList"],
   :rdfs/subClassOf [:sioc/Post :sioc.types/MailMessage]})

(def MailingList
  "Describes an electronic mailing list."
  {:db/ident         :sioc.types/MailingList,
   :rdf/type         :owl/Class,
   :rdfs/comment     "Describes an electronic mailing list.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       "Mailing List",
   :rdfs/seeAlso     ["http://rdfs.org/sioc/types#MailMessage"],
   :rdfs/subClassOf  [:sioc/Forum :sioc.types/MailingList]})

(def MessageBoard
  "Describes a message board, also known as an online bulletin board or discussion forum."
  {:db/ident :sioc.types/MessageBoard,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a message board, also known as an online bulletin board or discussion forum.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label "Message Board",
   :rdfs/seeAlso ["http://rdfs.org/sioc/types#BoardPost"],
   :rdfs/subClassOf [:sioc/Forum :sioc.types/MessageBoard]})

(def Microblog
  "Describes a microblog, i.e. a blog consisting of short text messages."
  {:db/ident :sioc.types/Microblog,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a microblog, i.e. a blog consisting of short text messages.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label "Microblog",
   :rdfs/seeAlso ["http://rdfs.org/sioc/types#MicroblogPost"],
   :rdfs/subClassOf [:sioc/Forum :sioc.types/Microblog]})

(def MicroblogPost
  "Describes a post that is specifically made on a microblog."
  {:db/ident :sioc.types/MicroblogPost,
   :rdf/type :owl/Class,
   :rdfs/comment "Describes a post that is specifically made on a microblog.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label "Microblog Post",
   :rdfs/seeAlso ["http://rdfs.org/sioc/types#Microblog"],
   :rdfs/subClassOf [:sioc/Post :sioc.types/MicroblogPost]})

(def OfferList
  "Describes a list of the items someone has available to offer."
  {:db/ident :sioc.types/OfferList,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a list of the items someone has available to offer.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label "Offer List",
   :rdfs/subClassOf [:sioc/Container :sioc.types/OfferList]})

(def Playlist
  "Describes a list of media items that have been played or can be played."
  {:db/ident :sioc.types/Playlist,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a list of media items that have been played or can be played.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label "Playlist",
   :rdfs/subClassOf [:sioc/Container :sioc.types/Playlist]})

(def Poll
  "Describes a posted item that contains a poll or survey content."
  {:db/ident :sioc.types/Poll,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a posted item that contains a poll or survey content.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label "Poll",
   :rdfs/seeAlso ["http://rdfs.org/sioc/types#SurveyCollection"],
   :rdfs/subClassOf [:sioc/Item :sioc.types/Poll]})

(def ProjectDirectory
  "Describes a project directory."
  {:db/ident         :sioc.types/ProjectDirectory,
   :rdf/type         :owl/Class,
   :rdfs/comment     "Describes a project directory.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       "Project Directory",
   :rdfs/seeAlso     ["http://usefulinc.com/ns/doap#Project"],
   :rdfs/subClassOf  [:sioc/Container :sioc.types/ProjectDirectory]})

(def Question
  "A Post that asks a Question."
  {:db/ident         :sioc.types/Question,
   :rdf/type         :owl/Class,
   :rdfs/comment     "A Post that asks a Question.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       "Question",
   :rdfs/subClassOf  [:sioc/Post :sioc.types/Question]})

(def ReadingList
  "Describes a list of books or other materials that have been read or are suggested for reading."
  {:db/ident :sioc.types/ReadingList,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a list of books or other materials that have been read or are suggested for reading.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label "Reading List",
   :rdfs/subClassOf [:sioc/Container :sioc.types/ReadingList]})

(def ResumeBank
  "Describes a collection of resumes."
  {:db/ident         :sioc.types/ResumeBank,
   :rdf/type         :owl/Class,
   :rdfs/comment     "Describes a collection of resumes.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       "Resume Bank",
   :rdfs/seeAlso     ["http://captsolo.net/semweb/resume/cv.rdfs#Resume"],
   :rdfs/subClassOf  [:sioc/Container :sioc.types/ResumeBank]})

(def ReviewArea
  "Describes an area where reviews are posted."
  {:db/ident :sioc.types/ReviewArea,
   :rdf/type :owl/Class,
   :rdfs/comment "Describes an area where reviews are posted.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label "Review Area",
   :rdfs/seeAlso
   ["http://purl.org/stuff/rev#Review"
    "http://www.isi.edu/webscripter/communityreview/abstract-review-o#Review"],
   :rdfs/subClassOf [:sioc/Container :sioc.types/ReviewArea]})

(def SubscriptionList
  "Describes a shared set of feed subscriptions."
  {:db/ident         :sioc.types/SubscriptionList,
   :rdf/type         :owl/Class,
   :rdfs/comment     "Describes a shared set of feed subscriptions.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       "Subscription List",
   :rdfs/seeAlso     ["http://atomowl.org/ontologies/atomrdf#Feed"],
   :rdfs/subClassOf  [:sioc/Container :sioc.types/SubscriptionList]})

(def SurveyCollection
  "Describes an area where survey data can be collected, e.g. from polls."
  {:db/ident :sioc.types/SurveyCollection,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes an area where survey data can be collected, e.g. from polls.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label "Survey Collection",
   :rdfs/seeAlso ["http://rdfs.org/sioc/types#Poll"],
   :rdfs/subClassOf [:sioc/Container :sioc.types/SurveyCollection]})

(def Tag
  "Tag is used on the object of sioc:topic to indicate that this resource is a tag on a site."
  {:db/ident :sioc.types/Tag,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Tag is used on the object of sioc:topic to indicate that this resource is a tag on a site.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label "Tag"})

(def VideoChannel
  "Describes a channel for distributing videos (moving image) files, for example, a video podcast."
  {:db/ident :sioc.types/VideoChannel,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes a channel for distributing videos (moving image) files, for example, a video podcast.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label "Video Channel",
   :rdfs/seeAlso ["http://purl.org/dc/dcmitype/MovingImage"],
   :rdfs/subClassOf [:sioc/Container :sioc.types/VideoChannel]})

(def Weblog
  "Describes a weblog (blog), i.e. an online journal."
  {:db/ident         :sioc.types/Weblog,
   :rdf/type         :owl/Class,
   :rdfs/comment     "Describes a weblog (blog), i.e. an online journal.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       "Weblog",
   :rdfs/seeAlso     ["http://rdfs.org/sioc/types#BlogPost"],
   :rdfs/subClassOf  [:sioc/Forum :sioc.types/Weblog]})

(def Wiki
  "Describes a wiki space."
  {:db/ident         :sioc.types/Wiki,
   :rdf/type         :owl/Class,
   :rdfs/comment     "Describes a wiki space.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       "Wiki",
   :rdfs/seeAlso     ["http://rdfs.org/sioc/types#WikiArticle"],
   :rdfs/subClassOf  [:sioc/Container :sioc.types/Wiki]})

(def WikiArticle
  "Describes a wiki article."
  {:db/ident         :sioc.types/WikiArticle,
   :rdf/type         :owl/Class,
   :rdfs/comment     "Describes a wiki article.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       "Wiki Article",
   :rdfs/seeAlso     ["http://rdfs.org/sioc/types#Wiki"],
   :rdfs/subClassOf  [:sioc/Item :sioc.types/WikiArticle]})

(def WishList
  "Describes a list of the items someone wishes to get."
  {:db/ident         :sioc.types/WishList,
   :rdf/type         :owl/Class,
   :rdfs/comment     "Describes a list of the items someone wishes to get.",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       "Wish List",
   :rdfs/subClassOf  [:sioc/Container :sioc.types/WishList]})

(def ^{:private true} Container
  {:db/ident        :sioc/Container,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :sioc/Container})

(def ^{:private true} Forum
  {:db/ident        :sioc/Forum,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :sioc/Forum})

(def ^{:private true} Item
  {:db/ident        :sioc/Item,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :sioc/Item})

(def ^{:private true} Post
  {:db/ident        :sioc/Post,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :sioc/Post})