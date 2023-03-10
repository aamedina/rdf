(ns net.wikipunk.rdf.sioc.types
  "http://rdfs.org/sioc/types#"
  {:rdf/ns-prefix-map
   {"annotation" "http://www.w3.org/2000/10/annotation-ns#",
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
   :rdf/type :owl/Ontology,
   :rdf/uri "http://rdfs.org/sioc/ns#",
   :rdfa/prefix "sioc.types",
   :rdfa/uri "http://rdfs.org/sioc/types#"})

(def AddressBook
  "Describes a collection of personal or organisational addresses."
  {:db/ident :sioc.types/AddressBook,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a collection of personal or organisational addresses."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Address Book"},
   :rdfs/seeAlso "http://xmlns.com/foaf/0.1/Agent"
   :rdfs/subClassOf :sioc/Container})

(def AnnotationSet
  "Describes a set of annotations, for example, those created by a particular user or related to a particular topic."
  {:db/ident :sioc.types/AnnotationSet,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a set of annotations, for example, those created by a particular user or related to a particular topic."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Annotation Set"},
   :rdfs/seeAlso "http://www.w3.org/2000/10/annotation-ns#Annotation"
   :rdfs/subClassOf :sioc/Container})

(def Answer
  "A Post that provides an answer in reply to a Question."
  {:db/ident         :sioc.types/Answer,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A Post that provides an answer in reply to a Question."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Answer"},
   :rdfs/subClassOf  :sioc/Post})

(def ArgumentativeDiscussion
  "Describes a discussion area where logical arguments can take place."
  {:db/ident :sioc.types/ArgumentativeDiscussion,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a discussion area where logical arguments can take place."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Argumentative Discussion"},
   :rdfs/subClassOf :sioc/Forum})

(def AudioChannel
  "Describes a channel for distributing audio or sound files, for example, a podcast."
  {:db/ident :sioc.types/AudioChannel,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a channel for distributing audio or sound files, for example, a podcast."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Audio Channel"},
   :rdfs/seeAlso "http://purl.org/dc/dcmitype/Sound"
   :rdfs/subClassOf :sioc/Container})

(def BestAnswer
  "A Post that is the best answer to a Question, as chosen by the UserAccount who asked the Question or as voted by a Community of UserAccounts."
  {:db/ident :sioc.types/BestAnswer,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Post that is the best answer to a Question, as chosen by the UserAccount who asked the Question or as voted by a Community of UserAccounts."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Best Answer"},
   :rdfs/subClassOf :sioc/Post})

(def BlogPost
  "Describes a post that is specifically made on a weblog."
  {:db/ident :sioc.types/BlogPost,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Describes a post that is specifically made on a weblog."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Blog Post"},
   :rdfs/seeAlso "http://rdfs.org/sioc/types#Weblog"
   :rdfs/subClassOf :sioc/Post})

(def BoardPost
  "Describes a post that is specifically made on a message board."
  {:db/ident :sioc.types/BoardPost,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a post that is specifically made on a message board."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Board Post"},
   :rdfs/seeAlso "http://rdfs.org/sioc/types#MessageBoard",
   :rdfs/subClassOf :sioc/Post})

(def BookmarkFolder
  "Describes a shared collection of bookmarks."
  {:db/ident         :sioc.types/BookmarkFolder,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "Describes a shared collection of bookmarks."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Bookmark Folder"},
   :rdfs/seeAlso     "http://www.w3.org/2002/01/bookmark#Bookmark"
   :rdfs/subClassOf  :sioc/Container})

(def Briefcase
  "Describes a briefcase or file service."
  {:db/ident         :sioc.types/Briefcase,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Describes a briefcase or file service."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Briefcase"},
   :rdfs/seeAlso     "http://xmlns.com/foaf/0.1/Document"
   :rdfs/subClassOf  :sioc/Container})

(def Category
  "Category is used on the object of sioc:topic to indicate that this resource is a category on a site."
  {:db/ident :sioc.types/Category,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Category is used on the object of sioc:topic to indicate that this resource is a category on a site."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Category"},
   :rdfs/subClassOf :skos/Concept})

(def ChatChannel
  "Describes a channel for chat or instant messages, for example, via IRC or IM."
  {:db/ident :sioc.types/ChatChannel,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a channel for chat or instant messages, for example, via IRC or IM."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Chat Channel"},
   :rdfs/seeAlso "http://rdfs.org/sioc/types#InstantMessage"
   :rdfs/subClassOf :sioc/Forum})

(def Comment
  "Comment is a subtype of sioc:Post and allows one to explicitly indicate that this SIOC post is a comment. Note that comments have a narrower scope than sioc:Post and may not apply to all types of community site."
  {:db/ident :sioc.types/Comment,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Comment is a subtype of sioc:Post and allows one to explicitly indicate that this SIOC post is a comment.  Note that comments have a narrower scope than sioc:Post and may not apply to all types of community site."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Comment"},
   :rdfs/seeAlso "http://rdfs.org/sioc/types#Forum"
   :rdfs/subClassOf :sioc/Post})

(def EventCalendar
  "Describes a calendar of events."
  {:db/ident         :sioc.types/EventCalendar,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Describes a calendar of events."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Event Calendar"},
   :rdfs/seeAlso     "http://www.w3.org/2002/12/cal/icaltzd#Vevent"
   :rdfs/subClassOf  :sioc/Container})

(def FavouriteThings
  "Describes a list or a collection of one's favourite things."
  {:db/ident :sioc.types/FavouriteThings,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Describes a list or a collection of one's favourite things."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Favourite Things"},
   :rdfs/subClassOf :sioc/Container})

(def ImageGallery
  "Describes an image gallery, for example, a photo album."
  {:db/ident :sioc.types/ImageGallery,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Describes an image gallery, for example, a photo album."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Image Gallery"},
   :rdfs/seeAlso "http://www.w3.org/2003/12/exif/ns#IFD"
   :rdfs/subClassOf :sioc/Container})

(def InstantMessage
  "Describes an instant message, e.g. sent via Jabber."
  {:db/ident         :sioc.types/InstantMessage,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Describes an instant message, e.g. sent via Jabber."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Instant Message"},
   :rdfs/seeAlso     "http://rdfs.org/sioc/types#ChatChannel"
   :rdfs/subClassOf  :sioc/Post})

(def MailMessage
  "Describes an electronic mail message, e.g. a post sent to a mailing list."
  {:db/ident :sioc.types/MailMessage,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes an electronic mail message, e.g. a post sent to a mailing list."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mail Message"},
   :rdfs/seeAlso "http://rdfs.org/sioc/types#MailingList"
   :rdfs/subClassOf :sioc/Post})

(def MailingList
  "Describes an electronic mailing list."
  {:db/ident         :sioc.types/MailingList,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Describes an electronic mailing list."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Mailing List"},
   :rdfs/seeAlso     "http://rdfs.org/sioc/types#MailMessage"
   :rdfs/subClassOf  :sioc/Forum})

(def MessageBoard
  "Describes a message board, also known as an online bulletin board or discussion forum."
  {:db/ident :sioc.types/MessageBoard,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a message board, also known as an online bulletin board or discussion forum."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Message Board"},
   :rdfs/seeAlso "http://rdfs.org/sioc/types#BoardPost"
   :rdfs/subClassOf :sioc/Forum})

(def Microblog
  "Describes a microblog, i.e. a blog consisting of short text messages."
  {:db/ident :sioc.types/Microblog,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a microblog, i.e. a blog consisting of short text messages."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Microblog"},
   :rdfs/seeAlso "http://rdfs.org/sioc/types#MicroblogPost"
   :rdfs/subClassOf :sioc/Forum})

(def MicroblogPost
  "Describes a post that is specifically made on a microblog."
  {:db/ident :sioc.types/MicroblogPost,
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Describes a post that is specifically made on a microblog."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Microblog Post"},
   :rdfs/seeAlso "http://rdfs.org/sioc/types#Microblog"
   :rdfs/subClassOf :sioc/Post})

(def OfferList
  "Describes a list of the items someone has available to offer."
  {:db/ident :sioc.types/OfferList,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Describes a list of the items someone has available to offer."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Offer List"},
   :rdfs/subClassOf :sioc/Container})

(def Playlist
  "Describes a list of media items that have been played or can be played."
  {:db/ident :sioc.types/Playlist,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a list of media items that have been played or can be played."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Playlist"},
   :rdfs/subClassOf :sioc/Container})

(def Poll
  "Describes a posted item that contains a poll or survey content."
  {:db/ident :sioc.types/Poll,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a posted item that contains a poll or survey content."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Poll"},
   :rdfs/seeAlso "http://rdfs.org/sioc/types#SurveyCollection"
   :rdfs/subClassOf :sioc/Item})

(def ProjectDirectory
  "Describes a project directory."
  {:db/ident         :sioc.types/ProjectDirectory,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Describes a project directory."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Project Directory"},
   :rdfs/seeAlso     "http://usefulinc.com/ns/doap#Project"
   :rdfs/subClassOf  :sioc/Container})

(def Question
  "A Post that asks a Question."
  {:db/ident         :sioc.types/Question,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A Post that asks a Question."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Question"},
   :rdfs/subClassOf  :sioc/Post})

(def ReadingList
  "Describes a list of books or other materials that have been read or are suggested for reading."
  {:db/ident :sioc.types/ReadingList,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a list of books or other materials that have been read or are suggested for reading."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Reading List"},
   :rdfs/subClassOf :sioc/Container})

(def ResumeBank
  "Describes a collection of resumes."
  {:db/ident         :sioc.types/ResumeBank,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Describes a collection of resumes."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Resume Bank"},
   :rdfs/subClassOf  :sioc/Container})

(def ReviewArea
  "Describes an area where reviews are posted."
  {:db/ident         :sioc.types/ReviewArea,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "Describes an area where reviews are posted."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Review Area"},
   :rdfs/seeAlso     "http://purl.org/stuff/rev#Review",
   :rdfs/subClassOf  :sioc/Container})

(def SubscriptionList
  "Describes a shared set of feed subscriptions."
  {:db/ident         :sioc.types/SubscriptionList,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Describes a shared set of feed subscriptions."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Subscription List"},
   :rdfs/subClassOf  :sioc/Container})

(def SurveyCollection
  "Describes an area where survey data can be collected, e.g. from polls."
  {:db/ident :sioc.types/SurveyCollection,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes an area where survey data can be collected, e.g. from polls."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Survey Collection"},
   :rdfs/seeAlso "http://rdfs.org/sioc/types#Poll"
   :rdfs/subClassOf :sioc/Container})

(def Tag
  "Tag is used on the object of sioc:topic to indicate that this resource is a tag on a site."
  {:db/ident :sioc.types/Tag,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Tag is used on the object of sioc:topic to indicate that this resource is a tag on a site."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tag"}})

(def VideoChannel
  "Describes a channel for distributing videos (moving image) files, for example, a video podcast."
  {:db/ident :sioc.types/VideoChannel,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a channel for distributing videos (moving image) files, for example, a video podcast."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Video Channel"},
   :rdfs/seeAlso "http://purl.org/dc/dcmitype/MovingImage"
   :rdfs/subClassOf :sioc/Container})

(def Weblog
  "Describes a weblog (blog), i.e. an online journal."
  {:db/ident         :sioc.types/Weblog,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Describes a weblog (blog), i.e. an online journal."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Weblog"},
   :rdfs/seeAlso     "http://rdfs.org/sioc/types#BlogPost"
   :rdfs/subClassOf  :sioc/Forum})

(def Wiki
  "Describes a wiki space."
  {:db/ident         :sioc.types/Wiki,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Describes a wiki space."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Wiki"},
   :rdfs/seeAlso     "http://rdfs.org/sioc/types#WikiArticle"
   :rdfs/subClassOf  :sioc/Container})

(def WikiArticle
  "Describes a wiki article."
  {:db/ident         :sioc.types/WikiArticle,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Describes a wiki article."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Wiki Article"},
   :rdfs/seeAlso     "http://rdfs.org/sioc/types#Wiki"
   :rdfs/subClassOf  :sioc/Item})

(def WishList
  "Describes a list of the items someone wishes to get."
  {:db/ident         :sioc.types/WishList,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Describes a list of the items someone wishes to get."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/types#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Wish List"},
   :rdfs/subClassOf  :sioc/Container})
