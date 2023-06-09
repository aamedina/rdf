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
   #voc/lstr
    "Describes a collection of personal or organisational addresses.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label #voc/lstr "Address Book@en",
   :rdfs/seeAlso ["http://xmlns.com/foaf/0.1/Agent"],
   :rdfs/subClassOf :sioc/Container})

(def AnnotationSet
  "Describes a set of annotations, for example, those created by a particular user or related to a particular topic."
  {:db/ident :sioc.types/AnnotationSet,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Describes a set of annotations, for example, those created by a particular user or related to a particular topic.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label #voc/lstr "Annotation Set@en",
   :rdfs/seeAlso ["http://www.w3.org/2000/10/annotation-ns#Annotation"],
   :rdfs/subClassOf :sioc/Container})

(def Answer
  "A Post that provides an answer in reply to a Question."
  {:db/ident :sioc.types/Answer,
   :rdf/type :owl/Class,
   :rdfs/comment #voc/lstr
                  "A Post that provides an answer in reply to a Question.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label #voc/lstr "Answer@en",
   :rdfs/subClassOf :sioc/Post})

(def ArgumentativeDiscussion
  "Describes a discussion area where logical arguments can take place."
  {:db/ident :sioc.types/ArgumentativeDiscussion,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Describes a discussion area where logical arguments can take place.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label #voc/lstr "Argumentative Discussion@en",
   :rdfs/seeAlso ["http://purl.org/ibis#Idea"],
   :rdfs/subClassOf :sioc/Forum})

(def AudioChannel
  "Describes a channel for distributing audio or sound files, for example, a podcast."
  {:db/ident :sioc.types/AudioChannel,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Describes a channel for distributing audio or sound files, for example, a podcast.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label #voc/lstr "Audio Channel@en",
   :rdfs/seeAlso ["http://purl.org/dc/dcmitype/Sound"],
   :rdfs/subClassOf :sioc/Container})

(def BestAnswer
  "A Post that is the best answer to a Question, as chosen by the UserAccount who asked the Question or as voted by a Community of UserAccounts."
  {:db/ident :sioc.types/BestAnswer,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A Post that is the best answer to a Question, as chosen by the UserAccount who asked the Question or as voted by a Community of UserAccounts.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label #voc/lstr "Best Answer@en",
   :rdfs/subClassOf :sioc/Post})

(def BlogPost
  "Describes a post that is specifically made on a weblog."
  {:db/ident :sioc.types/BlogPost,
   :rdf/type :owl/Class,
   :rdfs/comment #voc/lstr
                  "Describes a post that is specifically made on a weblog.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label #voc/lstr "Blog Post@en",
   :rdfs/seeAlso ["http://rdfs.org/sioc/types#Weblog"],
   :rdfs/subClassOf :sioc/Post})

(def BoardPost
  "Describes a post that is specifically made on a message board."
  {:db/ident :sioc.types/BoardPost,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Describes a post that is specifically made on a message board.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label #voc/lstr "Board Post@en",
   :rdfs/seeAlso ["http://rdfs.org/sioc/types#MessageBoard"],
   :rdfs/subClassOf :sioc/Post})

(def BookmarkFolder
  "Describes a shared collection of bookmarks."
  {:db/ident         :sioc.types/BookmarkFolder,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "Describes a shared collection of bookmarks.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       #voc/lstr "Bookmark Folder@en",
   :rdfs/seeAlso     ["http://www.w3.org/2002/01/bookmark#Bookmark"],
   :rdfs/subClassOf  :sioc/Container})

(def Briefcase
  "Describes a briefcase or file service."
  {:db/ident         :sioc.types/Briefcase,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "Describes a briefcase or file service.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       #voc/lstr "Briefcase@en",
   :rdfs/seeAlso     ["http://xmlns.com/foaf/0.1/Document"],
   :rdfs/subClassOf  :sioc/Container})

(def Category
  "Category is used on the object of sioc:topic to indicate that this resource is a category on a site."
  {:db/ident :sioc.types/Category,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Category is used on the object of sioc:topic to indicate that this resource is a category on a site.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label #voc/lstr "Category@en",
   :rdfs/subClassOf :skos/Concept})

(def ChatChannel
  "Describes a channel for chat or instant messages, for example, via IRC or IM."
  {:db/ident :sioc.types/ChatChannel,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Describes a channel for chat or instant messages, for example, via IRC or IM.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label #voc/lstr "Chat Channel@en",
   :rdfs/seeAlso ["http://rdfs.org/sioc/types#InstantMessage"],
   :rdfs/subClassOf :sioc/Forum})

(def Comment
  "Comment is a subtype of sioc:Post and allows one to explicitly indicate that this SIOC post is a comment. Note that comments have a narrower scope than sioc:Post and may not apply to all types of community site."
  {:db/ident :sioc.types/Comment,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Comment is a subtype of sioc:Post and allows one to explicitly indicate that this SIOC post is a comment.  Note that comments have a narrower scope than sioc:Post and may not apply to all types of community site.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label #voc/lstr "Comment@en",
   :rdfs/seeAlso ["http://rdfs.org/sioc/types#Forum"],
   :rdfs/subClassOf :sioc/Post})

(def EventCalendar
  "Describes a calendar of events."
  {:db/ident         :sioc.types/EventCalendar,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "Describes a calendar of events.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       #voc/lstr "Event Calendar@en",
   :rdfs/seeAlso     ["http://www.w3.org/2002/12/cal/icaltzd#VEVENT"],
   :rdfs/subClassOf  :sioc/Container})

(def FavouriteThings
  "Describes a list or a collection of one's favourite things."
  {:db/ident :sioc.types/FavouriteThings,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr "Describes a list or a collection of one's favourite things.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label #voc/lstr "Favourite Things@en",
   :rdfs/subClassOf :sioc/Container})

(def ImageGallery
  "Describes an image gallery, for example, a photo album."
  {:db/ident :sioc.types/ImageGallery,
   :rdf/type :owl/Class,
   :rdfs/comment #voc/lstr
                  "Describes an image gallery, for example, a photo album.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label #voc/lstr "Image Gallery@en",
   :rdfs/seeAlso ["http://www.w3.org/2003/12/exif/ns#IFD"],
   :rdfs/subClassOf :sioc/Container})

(def InstantMessage
  "Describes an instant message, e.g. sent via Jabber."
  {:db/ident         :sioc.types/InstantMessage,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr
                      "Describes an instant message, e.g. sent via Jabber.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       #voc/lstr "Instant Message@en",
   :rdfs/seeAlso     ["http://rdfs.org/sioc/types#ChatChannel"],
   :rdfs/subClassOf  :sioc/Post})

(def MailMessage
  "Describes an electronic mail message, e.g. a post sent to a mailing list."
  {:db/ident :sioc.types/MailMessage,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Describes an electronic mail message, e.g. a post sent to a mailing list.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label #voc/lstr "Mail Message@en",
   :rdfs/seeAlso ["http://rdfs.org/sioc/types#MailingList"],
   :rdfs/subClassOf :sioc/Post})

(def MailingList
  "Describes an electronic mailing list."
  {:db/ident         :sioc.types/MailingList,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "Describes an electronic mailing list.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       #voc/lstr "Mailing List@en",
   :rdfs/seeAlso     ["http://rdfs.org/sioc/types#MailMessage"],
   :rdfs/subClassOf  :sioc/Forum})

(def MessageBoard
  "Describes a message board, also known as an online bulletin board or discussion forum."
  {:db/ident :sioc.types/MessageBoard,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Describes a message board, also known as an online bulletin board or discussion forum.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label #voc/lstr "Message Board@en",
   :rdfs/seeAlso ["http://rdfs.org/sioc/types#BoardPost"],
   :rdfs/subClassOf :sioc/Forum})

(def Microblog
  "Describes a microblog, i.e. a blog consisting of short text messages."
  {:db/ident :sioc.types/Microblog,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Describes a microblog, i.e. a blog consisting of short text messages.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label #voc/lstr "Microblog@en",
   :rdfs/seeAlso ["http://rdfs.org/sioc/types#MicroblogPost"],
   :rdfs/subClassOf :sioc/Forum})

(def MicroblogPost
  "Describes a post that is specifically made on a microblog."
  {:db/ident :sioc.types/MicroblogPost,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr "Describes a post that is specifically made on a microblog.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label #voc/lstr "Microblog Post@en",
   :rdfs/seeAlso ["http://rdfs.org/sioc/types#Microblog"],
   :rdfs/subClassOf :sioc/Post})

(def OfferList
  "Describes a list of the items someone has available to offer."
  {:db/ident :sioc.types/OfferList,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr "Describes a list of the items someone has available to offer.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label #voc/lstr "Offer List@en",
   :rdfs/subClassOf :sioc/Container})

(def Playlist
  "Describes a list of media items that have been played or can be played."
  {:db/ident :sioc.types/Playlist,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Describes a list of media items that have been played or can be played.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label #voc/lstr "Playlist@en",
   :rdfs/subClassOf :sioc/Container})

(def Poll
  "Describes a posted item that contains a poll or survey content."
  {:db/ident :sioc.types/Poll,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Describes a posted item that contains a poll or survey content.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label #voc/lstr "Poll@en",
   :rdfs/seeAlso ["http://rdfs.org/sioc/types#SurveyCollection"],
   :rdfs/subClassOf :sioc/Item})

(def ProjectDirectory
  "Describes a project directory."
  {:db/ident         :sioc.types/ProjectDirectory,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "Describes a project directory.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       #voc/lstr "Project Directory@en",
   :rdfs/seeAlso     ["http://usefulinc.com/ns/doap#Project"],
   :rdfs/subClassOf  :sioc/Container})

(def Question
  "A Post that asks a Question."
  {:db/ident         :sioc.types/Question,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "A Post that asks a Question.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       #voc/lstr "Question@en",
   :rdfs/subClassOf  :sioc/Post})

(def ReadingList
  "Describes a list of books or other materials that have been read or are suggested for reading."
  {:db/ident :sioc.types/ReadingList,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Describes a list of books or other materials that have been read or are suggested for reading.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label #voc/lstr "Reading List@en",
   :rdfs/subClassOf :sioc/Container})

(def ResumeBank
  "Describes a collection of resumes."
  {:db/ident         :sioc.types/ResumeBank,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "Describes a collection of resumes.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       #voc/lstr "Resume Bank@en",
   :rdfs/seeAlso     ["http://captsolo.net/semweb/resume/cv.rdfs#Resume"],
   :rdfs/subClassOf  :sioc/Container})

(def ReviewArea
  "Describes an area where reviews are posted."
  {:db/ident :sioc.types/ReviewArea,
   :rdf/type :owl/Class,
   :rdfs/comment #voc/lstr "Describes an area where reviews are posted.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label #voc/lstr "Review Area@en",
   :rdfs/seeAlso
   ["http://purl.org/stuff/rev#Review"
    "http://www.isi.edu/webscripter/communityreview/abstract-review-o#Review"],
   :rdfs/subClassOf :sioc/Container})

(def SubscriptionList
  "Describes a shared set of feed subscriptions."
  {:db/ident         :sioc.types/SubscriptionList,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr
                      "Describes a shared set of feed subscriptions.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       #voc/lstr "Subscription List@en",
   :rdfs/seeAlso     ["http://atomowl.org/ontologies/atomrdf#Feed"],
   :rdfs/subClassOf  :sioc/Container})

(def SurveyCollection
  "Describes an area where survey data can be collected, e.g. from polls."
  {:db/ident :sioc.types/SurveyCollection,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Describes an area where survey data can be collected, e.g. from polls.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label #voc/lstr "Survey Collection@en",
   :rdfs/seeAlso ["http://rdfs.org/sioc/types#Poll"],
   :rdfs/subClassOf :sioc/Container})

(def Tag
  "Tag is used on the object of sioc:topic to indicate that this resource is a tag on a site."
  {:db/ident :sioc.types/Tag,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Tag is used on the object of sioc:topic to indicate that this resource is a tag on a site.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label #voc/lstr "Tag@en"})

(def VideoChannel
  "Describes a channel for distributing videos (moving image) files, for example, a video podcast."
  {:db/ident :sioc.types/VideoChannel,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Describes a channel for distributing videos (moving image) files, for example, a video podcast.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label #voc/lstr "Video Channel@en",
   :rdfs/seeAlso ["http://purl.org/dc/dcmitype/MovingImage"],
   :rdfs/subClassOf :sioc/Container})

(def Weblog
  "Describes a weblog (blog), i.e. an online journal."
  {:db/ident         :sioc.types/Weblog,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr
                      "Describes a weblog (blog), i.e. an online journal.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       #voc/lstr "Weblog@en",
   :rdfs/seeAlso     ["http://rdfs.org/sioc/types#BlogPost"],
   :rdfs/subClassOf  :sioc/Forum})

(def Wiki
  "Describes a wiki space."
  {:db/ident         :sioc.types/Wiki,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "Describes a wiki space.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       #voc/lstr "Wiki@en",
   :rdfs/seeAlso     ["http://rdfs.org/sioc/types#WikiArticle"],
   :rdfs/subClassOf  :sioc/Container})

(def WikiArticle
  "Describes a wiki article."
  {:db/ident         :sioc.types/WikiArticle,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr "Describes a wiki article.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       #voc/lstr "Wiki Article@en",
   :rdfs/seeAlso     ["http://rdfs.org/sioc/types#Wiki"],
   :rdfs/subClassOf  :sioc/Item})

(def WishList
  "Describes a list of the items someone wishes to get."
  {:db/ident         :sioc.types/WishList,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr
                      "Describes a list of the items someone wishes to get.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       #voc/lstr "Wish List@en",
   :rdfs/subClassOf  :sioc/Container})
