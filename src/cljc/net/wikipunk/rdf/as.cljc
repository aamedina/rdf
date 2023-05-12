(ns net.wikipunk.rdf.as
  "Extended Activity Streams 2.0 Vocabulary"
  {:dcat/downloadURL
   "https://raw.githubusercontent.com/w3c/activitystreams/master/vocabulary/activitystreams2.owl",
   :owl/imports "http://www.w3.org/ns/prov#",
   :rdf/ns-prefix-map {"as"   "http://www.w3.org/ns/activitystreams#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xml"  "http://www.w3.org/XML/1998/namespace",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "as",
   :rdfa/uri "http://www.w3.org/ns/activitystreams#",
   :rdfs/comment "Extended Activity Streams 2.0 Vocabulary",
   :rdfs/isDefinedBy {:rdf/uri
                      "https://www.w3.org/TR/activitystreams-vocabulary/"},
   :rdfs/label "Activity Streams 2.0"}
  (:refer-clojure :exclude [first last name next]))

(def Accept
  "Actor accepts the Object"
  {:db/ident        :as/Accept,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Actor accepts the Object",
   :rdfs/label      "Accept",
   :rdfs/subClassOf [:as/Activity :as/Accept :as/Object]})

(def Activity
  "An Object representing some form of Action that has been taken"
  {:db/ident :as/Activity,
   :rdf/type :owl/Class,
   :rdfs/comment
   "An Object representing some form of Action that has been taken",
   :rdfs/label "Activity",
   :rdfs/subClassOf [:as/Object :as/Activity]})

(def Add
  "To Add an Object or Link to Something"
  {:db/ident        :as/Add,
   :rdf/type        :owl/Class,
   :rdfs/comment    "To Add an Object or Link to Something",
   :rdfs/label      "Add",
   :rdfs/subClassOf [:as/Activity :as/Add :as/Object]})

(def Announce
  "Actor announces the object to the target"
  {:db/ident        :as/Announce,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Actor announces the object to the target",
   :rdfs/label      "Announce",
   :rdfs/subClassOf [:as/Activity :as/Announce :as/Object]})

(def Application
  "Represents a software application of any sort"
  {:db/ident        :as/Application,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Represents a software application of any sort",
   :rdfs/label      "Application",
   :rdfs/subClassOf [:as/Object :as/Application]})

(def Arrive
  "To Arrive Somewhere (can be used, for instance, to indicate that a particular entity is currently located somewhere, e.g. a \"check-in\")"
  {:db/ident :as/Arrive,
   :rdf/type :owl/Class,
   :rdfs/comment
   "To Arrive Somewhere (can be used, for instance, to indicate that a particular entity is currently located somewhere, e.g. a \"check-in\")",
   :rdfs/label "Arrive",
   :rdfs/subClassOf [:as/IntransitiveActivity
                     :as/Arrive
                     :as/Activity
                     :as/Object
                     {:owl/maxCardinality 0,
                      :owl/onProperty     :as/object,
                      :rdf/type           :owl/Restriction}]})

(def Article
  "A written work. Typically several paragraphs long. For example, a blog post or a news article."
  {:db/ident :as/Article,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A written work. Typically several paragraphs long. For example, a blog post or a news article.",
   :rdfs/label "Article",
   :rdfs/subClassOf [:as/Object :as/Article]})

(def Audio
  "An audio file"
  {:db/ident        :as/Audio,
   :rdf/type        :owl/Class,
   :rdfs/comment    "An audio file",
   :rdfs/label      "Audio",
   :rdfs/subClassOf [:as/Document :as/Audio :as/Object]})

(def Block
  "Block"
  {:db/ident        :as/Block,
   :rdf/type        :owl/Class,
   :rdfs/label      "Block",
   :rdfs/subClassOf [:as/Ignore :as/Block :as/Activity :as/Object]})

(def Collection
  "An ordered or unordered collection of Objects or Links"
  {:db/ident        :as/Collection,
   :rdf/type        :owl/Class,
   :rdfs/comment    "An ordered or unordered collection of Objects or Links",
   :rdfs/label      "Collection",
   :rdfs/subClassOf [:as/Object :as/Collection]})

(def CollectionPage
  "A subset of items from a Collection"
  {:db/ident        :as/CollectionPage,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A subset of items from a Collection",
   :rdfs/label      "CollectionPage",
   :rdfs/subClassOf [:as/Collection :as/CollectionPage :as/Object]})

(def Create
  "To Create Something"
  {:db/ident        :as/Create,
   :rdf/type        :owl/Class,
   :rdfs/comment    "To Create Something",
   :rdfs/label      "Create",
   :rdfs/subClassOf [:as/Activity :as/Create :as/Object]})

(def Delete
  "To Delete Something"
  {:db/ident        :as/Delete,
   :rdf/type        :owl/Class,
   :rdfs/comment    "To Delete Something",
   :rdfs/label      "Delete",
   :rdfs/subClassOf [:as/Activity :as/Delete :as/Object]})

(def Dislike
  "The actor dislikes the object"
  {:db/ident        :as/Dislike,
   :rdf/type        :owl/Class,
   :rdfs/comment    "The actor dislikes the object",
   :rdfs/label      "Dislike",
   :rdfs/subClassOf [:as/Activity :as/Dislike :as/Object]})

(def Document
  "Represents a digital document/file of any sort"
  {:db/ident        :as/Document,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Represents a digital document/file of any sort",
   :rdfs/label      "Document",
   :rdfs/subClassOf [:as/Object :as/Document]})

(def Event
  "An Event of any kind"
  {:db/ident        :as/Event,
   :rdf/type        :owl/Class,
   :rdfs/comment    "An Event of any kind",
   :rdfs/label      "Event",
   :rdfs/subClassOf [:as/Object :as/Event]})

(def Flag
  "To flag something (e.g. flag as inappropriate, flag as spam, etc)"
  {:db/ident :as/Flag,
   :rdf/type :owl/Class,
   :rdfs/comment
   "To flag something (e.g. flag as inappropriate, flag as spam, etc)",
   :rdfs/label "Flag",
   :rdfs/subClassOf [:as/Activity :as/Flag :as/Object]})

(def Follow
  "To Express Interest in Something"
  {:db/ident        :as/Follow,
   :rdf/type        :owl/Class,
   :rdfs/comment    "To Express Interest in Something",
   :rdfs/label      "Follow",
   :rdfs/subClassOf [:as/Activity :as/Follow :as/Object]})

(def Group
  "A Group of any kind."
  {:db/ident        :as/Group,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A Group of any kind.",
   :rdfs/label      "Group",
   :rdfs/subClassOf [:as/Object :as/Group]})

(def Ignore
  "Actor is ignoring the Object"
  {:db/ident        :as/Ignore,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Actor is ignoring the Object",
   :rdfs/label      "Ignore",
   :rdfs/subClassOf [:as/Activity :as/Ignore :as/Object]})

(def Image
  "An Image file"
  {:db/ident        :as/Image,
   :rdf/type        :owl/Class,
   :rdfs/comment    "An Image file",
   :rdfs/label      "Image",
   :rdfs/subClassOf [:as/Document :as/Image :as/Object]})

(def IntransitiveActivity
  "An Activity that has no direct object"
  {:db/ident        :as/IntransitiveActivity,
   :rdf/type        :owl/Class,
   :rdfs/comment    "An Activity that has no direct object",
   :rdfs/label      "IntransitiveActivity",
   :rdfs/subClassOf [{:owl/maxCardinality 0,
                      :owl/onProperty     :as/object,
                      :rdf/type           :owl/Restriction}
                     :as/Activity
                     :as/IntransitiveActivity
                     :as/Object]})

(def Invite
  "To invite someone or something to something"
  {:db/ident        :as/Invite,
   :rdf/type        :owl/Class,
   :rdfs/comment    "To invite someone or something to something",
   :rdfs/label      "Invite",
   :rdfs/subClassOf [:as/Offer :as/Invite :as/Activity :as/Object]})

(def Join
  "To Join Something"
  {:db/ident        :as/Join,
   :rdf/type        :owl/Class,
   :rdfs/comment    "To Join Something",
   :rdfs/label      "Join",
   :rdfs/subClassOf [:as/Activity :as/Join :as/Object]})

(def Leave
  "To Leave Something"
  {:db/ident        :as/Leave,
   :rdf/type        :owl/Class,
   :rdfs/comment    "To Leave Something",
   :rdfs/label      "Leave",
   :rdfs/subClassOf [:as/Activity :as/Leave :as/Object]})

(def Like
  "To Like Something"
  {:db/ident        :as/Like,
   :rdf/type        :owl/Class,
   :rdfs/comment    "To Like Something",
   :rdfs/label      "Like",
   :rdfs/subClassOf [:as/Activity :as/Like :as/Object]})

(def Link
  "Represents a qualified reference to another resource. Patterned after the RFC5988 Web Linking Model"
  {:db/ident :as/Link,
   :owl/disjointWith :as/Object,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Represents a qualified reference to another resource. Patterned after the RFC5988 Web Linking Model",
   :rdfs/label "Link",
   :rdfs/subClassOf :as/Link})

(def Listen
  "The actor listened to the object"
  {:db/ident        :as/Listen,
   :rdf/type        :owl/Class,
   :rdfs/comment    "The actor listened to the object",
   :rdfs/label      "Listen",
   :rdfs/subClassOf [:as/Activity :as/Listen :as/Object]})

(def Mention
  "A specialized Link that represents an @mention"
  {:db/ident        :as/Mention,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A specialized Link that represents an @mention",
   :rdfs/label      "Mention",
   :rdfs/subClassOf [:as/Link :as/Mention]})

(def Move
  "The actor is moving the object. The target specifies where the object is moving to. The origin specifies where the object is moving from."
  {:db/ident :as/Move,
   :rdf/type :owl/Class,
   :rdfs/comment
   "The actor is moving the object. The target specifies where the object is moving to. The origin specifies where the object is moving from.",
   :rdfs/label "Move",
   :rdfs/subClassOf [:as/Activity :as/Move :as/Object]})

(def Note
  "A Short note, typically less than a single paragraph. A \"tweet\" is an example, or a \"status update\""
  {:db/ident :as/Note,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Short note, typically less than a single paragraph. A \"tweet\" is an example, or a \"status update\"",
   :rdfs/label "Note",
   :rdfs/subClassOf [:as/Object :as/Note]})

(def ObjectClass
  "Object"
  {:db/ident        :as/Object,
   :rdf/type        :owl/Class,
   :rdfs/label      "Object",
   :rdfs/subClassOf :as/Object})

(def Offer
  "To Offer something to someone or something"
  {:db/ident        :as/Offer,
   :rdf/type        :owl/Class,
   :rdfs/comment    "To Offer something to someone or something",
   :rdfs/label      "Offer",
   :rdfs/subClassOf [:as/Activity :as/Offer :as/Object]})

(def OrderedCollection
  "A variation of Collection in which items are strictly ordered"
  {:db/ident :as/OrderedCollection,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A variation of Collection in which items are strictly ordered",
   :rdfs/label "OrderedCollection",
   :rdfs/subClassOf [{:owl/intersectionOf [:as/Collection
                                           {:owl/allValuesFrom
                                            {:owl/intersectionOf
                                             [:as/OrderedItems
                                              {:owl/complementOf {:owl/unionOf
                                                                  [:as/Object
                                                                   :as/Link],
                                                                  :rdf/type
                                                                  :owl/Class},
                                               :rdf/type         :owl/Class}],
                                             :rdf/type :owl/Class},
                                            :owl/onProperty :as/items,
                                            :rdf/type :owl/Restriction}],
                      :rdf/type :owl/Class}
                     :as/OrderedCollection]})

(def OrderedCollectionPage
  "An ordered subset of items from an OrderedCollection"
  {:db/ident        :as/OrderedCollectionPage,
   :rdf/type        :owl/Class,
   :rdfs/comment    "An ordered subset of items from an OrderedCollection",
   :rdfs/label      "OrderedCollectionPage",
   :rdfs/subClassOf [:as/CollectionPage
                     :as/OrderedCollection
                     :as/OrderedCollectionPage
                     :as/Object
                     {:owl/intersectionOf [:as/Collection
                                           {:owl/allValuesFrom
                                            {:owl/intersectionOf
                                             [:as/OrderedItems
                                              {:owl/complementOf {:owl/unionOf
                                                                  [:as/Object
                                                                   :as/Link],
                                                                  :rdf/type
                                                                  :owl/Class},
                                               :rdf/type         :owl/Class}],
                                             :rdf/type :owl/Class},
                                            :owl/onProperty :as/items,
                                            :rdf/type :owl/Restriction}],
                      :rdf/type :owl/Class}
                     :as/Collection]})

(def OrderedItems
  "A rdf:List variant for Objects and Links"
  {:db/ident        :as/OrderedItems,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A rdf:List variant for Objects and Links",
   :rdfs/label      "OrderedItems",
   :rdfs/subClassOf [{:owl/intersectionOf [:rdf/List
                                           {:owl/allValuesFrom {:owl/unionOf
                                                                [:as/Object
                                                                 :as/Link],
                                                                :rdf/type
                                                                :owl/Class},
                                            :owl/onProperty    :rdf/first,
                                            :rdf/type          :owl/Restriction}
                                           {:owl/allValuesFrom :as/OrderedItems,
                                            :owl/onProperty :rdf/rest,
                                            :rdf/type :owl/Restriction}],
                      :rdf/type :owl/Class}
                     :as/OrderedItems]})

(def Organization
  "An Organization"
  {:db/ident        :as/Organization,
   :rdf/type        :owl/Class,
   :rdfs/comment    "An Organization",
   :rdfs/label      "Organization",
   :rdfs/subClassOf [:as/Object :as/Organization]})

(def Page
  "A Web Page"
  {:db/ident        :as/Page,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A Web Page",
   :rdfs/label      "Page",
   :rdfs/subClassOf [:as/Object :as/Page]})

(def Person
  "A Person"
  {:db/ident        :as/Person,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A Person",
   :rdfs/label      "Person",
   :rdfs/subClassOf [:as/Object :as/Person]})

(def Place
  "A physical or logical location"
  {:db/ident        :as/Place,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A physical or logical location",
   :rdfs/label      "Place",
   :rdfs/subClassOf [:as/Object :as/Place]})

(def Profile
  "A Profile Document"
  {:db/ident        :as/Profile,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A Profile Document",
   :rdfs/label      "Profile",
   :rdfs/subClassOf [:as/Object :as/Profile]})

(def Question
  "A question of any sort."
  {:db/ident        :as/Question,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A question of any sort.",
   :rdfs/label      "Question",
   :rdfs/subClassOf [:as/IntransitiveActivity
                     :as/Question
                     :as/Activity
                     :as/Object
                     {:owl/maxCardinality 0,
                      :owl/onProperty     :as/object,
                      :rdf/type           :owl/Restriction}]})

(def Read
  "The actor read the object"
  {:db/ident        :as/Read,
   :rdf/type        :owl/Class,
   :rdfs/comment    "The actor read the object",
   :rdfs/label      "Read",
   :rdfs/subClassOf [:as/Activity :as/Read :as/Object]})

(def Reject
  "Actor rejects the Object"
  {:db/ident        :as/Reject,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Actor rejects the Object",
   :rdfs/label      "Reject",
   :rdfs/subClassOf [:as/Activity :as/Reject :as/Object]})

(def Relationship
  "Represents a Social Graph relationship between two Individuals (indicated by the 'a' and 'b' properties)"
  {:db/ident :as/Relationship,
   :rdf/type [:rdf/Statement :owl/Class],
   :rdfs/comment
   "Represents a Social Graph relationship between two Individuals (indicated by the 'a' and 'b' properties)",
   :rdfs/label "Relationship",
   :rdfs/subClassOf [:as/Object :as/Relationship]})

(def Remove
  "To Remove Something"
  {:db/ident        :as/Remove,
   :rdf/type        :owl/Class,
   :rdfs/comment    "To Remove Something",
   :rdfs/label      "Remove",
   :rdfs/subClassOf [:as/Activity :as/Remove :as/Object]})

(def Service
  "A service provided by some entity"
  {:db/ident        :as/Service,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A service provided by some entity",
   :rdfs/label      "Service",
   :rdfs/subClassOf [:as/Object :as/Service]})

(def TentativeAccept
  "Actor tentatively accepts the Object"
  {:db/ident        :as/TentativeAccept,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Actor tentatively accepts the Object",
   :rdfs/label      "TentativeAccept",
   :rdfs/subClassOf [:as/Accept :as/TentativeAccept :as/Activity :as/Object]})

(def TentativeReject
  "Actor tentatively rejects the object"
  {:db/ident        :as/TentativeReject,
   :rdf/type        :owl/Class,
   :rdfs/comment    "Actor tentatively rejects the object",
   :rdfs/label      "TentativeReject",
   :rdfs/subClassOf [:as/Reject :as/TentativeReject :as/Activity :as/Object]})

(def Tombstone
  "A placeholder for a deleted object"
  {:db/ident        :as/Tombstone,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A placeholder for a deleted object",
   :rdfs/label      "Tombstone",
   :rdfs/subClassOf [:as/Object :as/Tombstone]})

(def Travel
  "The actor is traveling to the target. The origin specifies where the actor is traveling from."
  {:db/ident :as/Travel,
   :rdf/type :owl/Class,
   :rdfs/comment
   "The actor is traveling to the target. The origin specifies where the actor is traveling from.",
   :rdfs/label "Travel",
   :rdfs/subClassOf [:as/IntransitiveActivity
                     :as/Travel
                     :as/Activity
                     :as/Object
                     {:owl/maxCardinality 0,
                      :owl/onProperty     :as/object,
                      :rdf/type           :owl/Restriction}]})

(def Undo
  "To Undo Something. This would typically be used to indicate that a previous Activity has been undone."
  {:db/ident :as/Undo,
   :rdf/type :owl/Class,
   :rdfs/comment
   "To Undo Something. This would typically be used to indicate that a previous Activity has been undone.",
   :rdfs/label "Undo",
   :rdfs/subClassOf [:as/Activity :as/Undo :as/Object]})

(def Update
  "To Update/Modify Something"
  {:db/ident        :as/Update,
   :rdf/type        :owl/Class,
   :rdfs/comment    "To Update/Modify Something",
   :rdfs/label      "Update",
   :rdfs/subClassOf [:as/Activity :as/Update :as/Object]})

(def Video
  "A Video document of any kind."
  {:db/ident        :as/Video,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A Video document of any kind.",
   :rdfs/label      "Video",
   :rdfs/subClassOf [:as/Document :as/Video :as/Object]})

(def View
  "The actor viewed the object"
  {:db/ident        :as/View,
   :rdf/type        :owl/Class,
   :rdfs/comment    "The actor viewed the object",
   :rdfs/label      "View",
   :rdfs/subClassOf [:as/Activity :as/View :as/Object]})

(def accuracy
  "Specifies the accuracy around the point established by the longitude and latitude"
  {:db/ident :as/accuracy,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   "Specifies the accuracy around the point established by the longitude and latitude",
   :rdfs/domain :as/Place,
   :rdfs/label "accuracy",
   :rdfs/range {:owl/onDatatype :xsd/float,
                :owl/withRestrictions [{:xsd/minInclusive 0.0}],
                :rdf/type       :rdfs/Datatype}})

(def actor
  "Subproperty of as:attributedTo that identifies the primary actor"
  {:db/ident :as/actor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Subproperty of as:attributedTo that identifies the primary actor",
   :rdfs/domain :as/Activity,
   :rdfs/label "actor",
   :rdfs/range {:owl/unionOf [:as/Object :as/Link],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf [:as/attributedTo :as/actor]})

(def altitude
  "The altitude of a place"
  {:db/ident     :as/altitude,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "The altitude of a place",
   :rdfs/domain  :as/Place,
   :rdfs/label   "altitude",
   :rdfs/range   :xsd/float})

(def anyOf
  "Describes a possible inclusive answer or option for a question."
  {:db/ident :as/anyOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Describes a possible inclusive answer or option for a question.",
   :rdfs/domain :as/Question,
   :rdfs/label "oneOf",
   :rdfs/range {:owl/unionOf [:as/Object :as/Link],
                :rdf/type    :owl/Class}})

(def attachment
  "attachment"
  {:db/ident    :as/attachment,
   :owl/equivalentProperty :as/attachments,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  "attachment",
   :rdfs/range  {:owl/unionOf [:as/Link :as/Object],
                 :rdf/type    :owl/Class}})

(def attachments
  "attachments"
  {:db/ident    :as/attachments,
   :rdf/type    [:owl/DeprecatedProperty :owl/ObjectProperty],
   :rdfs/domain :as/Object,
   :rdfs/label  "attachments",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def attributedTo
  "Identifies an entity to which an object is attributed"
  {:db/ident           :as/attributedTo,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       "Identifies an entity to which an object is attributed",
   :rdfs/domain        {:owl/unionOf [:as/Object :as/Link],
                        :rdf/type    :owl/Class},
   :rdfs/label         "attributedTo",
   :rdfs/range         {:owl/unionOf [:as/Object :as/Link],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :as/attributedTo})

(def audience
  "audience"
  {:db/ident    :as/audience,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  "audience",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def author
  "Identifies the author of an object. Deprecated. Use as:attributedTo instead"
  {:db/ident :as/author,
   :rdf/type [:owl/DeprecatedProperty :owl/ObjectProperty],
   :rdfs/comment
   "Identifies the author of an object. Deprecated. Use as:attributedTo instead",
   :rdfs/domain :as/Object,
   :rdfs/label "author",
   :rdfs/range {:owl/unionOf [:as/Object :as/Link],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf [:as/attributedTo :as/author]})

(def bcc
  "bcc"
  {:db/ident    :as/bcc,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  "bcc",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def bto
  "bto"
  {:db/ident    :as/bto,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  "bto",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def cc
  "cc"
  {:db/ident    :as/cc,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  "cc",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def content
  "The content of the object."
  {:db/ident     :as/content,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "The content of the object.",
   :rdfs/domain  :as/Object,
   :rdfs/label   "content",
   :rdfs/range   {:owl/unionOf [:rdf/langString :xsd/string],
                  :rdf/type    :owl/Class}})

(def context
  "Specifies the context within which an object exists or an activity was performed"
  {:db/ident :as/context,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Specifies the context within which an object exists or an activity was performed",
   :rdfs/domain :as/Object,
   :rdfs/label "context",
   :rdfs/range {:owl/unionOf [:as/Object :as/Link],
                :rdf/type    :owl/Class}})

(def current
  "current"
  {:db/ident    :as/current,
   :rdf/type    [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/domain :as/Collection,
   :rdfs/label  "current",
   :rdfs/range  {:owl/unionOf [:as/CollectionPage :as/Link],
                 :rdf/type    :owl/Class}})

(def deleted
  "Specifies the date and time the object was deleted"
  {:db/ident     :as/deleted,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "Specifies the date and time the object was deleted",
   :rdfs/domain  :as/Tombstone,
   :rdfs/label   "deleted",
   :rdfs/range   :xsd/dateTime})

(def describes
  "On a Profile object, describes the object described by the profile"
  {:db/ident :as/describes,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment
   "On a Profile object, describes the object described by the profile",
   :rdfs/domain :as/Profile,
   :rdfs/label "describes",
   :rdfs/range :as/Object})

(def downstreamDuplicates
  "downstreamDuplicates"
  {:db/ident    :as/downstreamDuplicates,
   :rdf/type    [:owl/DeprecatedProperty :owl/DatatypeProperty],
   :rdfs/domain :as/Object,
   :rdfs/label  "downstreamDuplicates",
   :rdfs/range  :xsd/anyURI})

(def duration
  "The duration of the object"
  {:db/ident     :as/duration,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "The duration of the object",
   :rdfs/domain  :as/Object,
   :rdfs/label   "duration",
   :rdfs/range   :xsd/duration})

(def endTime
  "The ending time of the object"
  {:db/ident     :as/endTime,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "The ending time of the object",
   :rdfs/domain  :as/Object,
   :rdfs/label   "endTime",
   :rdfs/range   :xsd/dateTime})

(def first
  "first"
  {:db/ident    :as/first,
   :rdf/type    [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/domain :as/Collection,
   :rdfs/label  "first",
   :rdfs/range  {:owl/unionOf [:as/CollectionPage :as/Link],
                 :rdf/type    :owl/Class}})

(def formerType
  "On a Tombstone object, describes the former type of the deleted object"
  {:db/ident :as/formerType,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment
   "On a Tombstone object, describes the former type of the deleted object",
   :rdfs/domain :as/Tombstone,
   :rdfs/label "formerType",
   :rdfs/range :as/Object})

(def generator
  "generator"
  {:db/ident    :as/generator,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  "generator",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def height
  "The display height expressed as device independent pixels"
  {:db/ident     :as/height,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "The display height expressed as device independent pixels",
   :rdfs/domain  :as/Link,
   :rdfs/label   "height",
   :rdfs/range   :xsd/nonNegativeInteger})

(def href
  "The target URI of the Link"
  {:db/ident     :as/href,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "The target URI of the Link",
   :rdfs/domain  :as/Link,
   :rdfs/label   "href",
   :rdfs/range   :xsd/anyURI})

(def hreflang
  "A hint about the language of the referenced resource"
  {:db/ident     :as/hreflang,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "A hint about the language of the referenced resource",
   :rdfs/domain  :as/Link,
   :rdfs/label   "hreflang",
   :rdfs/range   :xsd/language})

(def icon
  "icon"
  {:db/ident    :as/icon,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  "icon",
   :rdfs/range  {:owl/unionOf [:as/Image :as/Link],
                 :rdf/type    :owl/Class}})

(def id
  "id"
  {:db/ident    :as/id,
   :rdf/type    [:owl/DeprecatedProperty
                 :owl/FunctionalProperty
                 :owl/DatatypeProperty],
   :rdfs/domain {:owl/unionOf [:as/Link :as/Object],
                 :rdf/type    :owl/Class},
   :rdfs/label  "id",
   :rdfs/range  :xsd/anyURI})

(def image
  "image"
  {:db/ident    :as/image,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  "image",
   :rdfs/range  {:owl/unionOf [:as/Image :as/Link],
                 :rdf/type    :owl/Class}})

(def inReplyTo
  "inReplyTo"
  {:db/ident    :as/inReplyTo,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  "inReplyTo",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def instrument
  "Indentifies an object used (or to be used) to complete an activity"
  {:db/ident :as/instrument,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Indentifies an object used (or to be used) to complete an activity",
   :rdfs/domain :as/Activity,
   :rdfs/label "instrument",
   :rdfs/range {:owl/unionOf [:as/Object :as/Link],
                :rdf/type    :owl/Class}})

(def items
  "items"
  {:db/ident    :as/items,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Collection,
   :rdfs/label  "items",
   :rdfs/range  {:owl/unionOf [{:owl/unionOf [:as/Object :as/Link],
                                :rdf/type    :owl/Class}
                               :as/OrderedItems],
                 :rdf/type    :owl/Class}})

(def last
  "last"
  {:db/ident    :as/last,
   :rdf/type    [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/domain :as/Collection,
   :rdfs/label  "last",
   :rdfs/range  {:owl/unionOf [:as/CollectionPage :as/Link],
                 :rdf/type    :owl/Class}})

(def latitude
  "The latitude"
  {:db/ident     :as/latitude,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "The latitude",
   :rdfs/domain  :as/Place,
   :rdfs/label   "latitude",
   :rdfs/range   :xsd/float})

(def location
  "location"
  {:db/ident    :as/location,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  "location",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def longitude
  "The longitude"
  {:db/ident     :as/longitude,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "The longitude",
   :rdfs/domain  :as/Place,
   :rdfs/label   "longitude",
   :rdfs/range   :xsd/float})

(def mediaType
  "The MIME Media Type"
  {:db/ident     :as/mediaType,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "The MIME Media Type",
   :rdfs/domain  {:owl/unionOf [:as/Link :as/Object],
                  :rdf/type    :owl/Class},
   :rdfs/label   "mediaType",
   :rdfs/range   :xsd/string})

(def name
  "name"
  {:db/ident    :as/name,
   :rdf/type    :owl/DatatypeProperty,
   :rdfs/domain {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class},
   :rdfs/label  "name",
   :rdfs/name   "The default, plain-text display name of the object or link.",
   :rdfs/range  {:owl/unionOf [:rdf/langString :xsd/string],
                 :rdf/type    :owl/Class}})

(def next
  "next"
  {:db/ident    :as/next,
   :rdf/type    [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/domain :as/CollectionPage,
   :rdfs/label  "next",
   :rdfs/range  {:owl/unionOf [:as/CollectionPage :as/Link],
                 :rdf/type    :owl/Class}})

(def object
  "object"
  {:db/ident    :as/object,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:as/Activity :as/Relationship],
                 :rdf/type    :owl/Class},
   :rdfs/label  "object",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def objectType
  "objectType"
  {:db/ident    :as/objectType,
   :rdf/type    [:owl/DeprecatedProperty
                 :owl/FunctionalProperty
                 :owl/DatatypeProperty],
   :rdfs/domain :as/Object,
   :rdfs/label  "objectType",
   :rdfs/range  :xsd/anyURI})

(def oneOf
  "Describes a possible exclusive answer or option for a question."
  {:db/ident :as/oneOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Describes a possible exclusive answer or option for a question.",
   :rdfs/domain :as/Question,
   :rdfs/label "oneOf",
   :rdfs/range {:owl/unionOf [:as/Object :as/Link],
                :rdf/type    :owl/Class}})

(def origin
  "For certain activities, specifies the entity from which the action is directed."
  {:db/ident :as/origin,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "For certain activities, specifies the entity from which the action is directed.",
   :rdfs/domain :as/Activity,
   :rdfs/label "origin",
   :rdfs/range {:owl/unionOf [:as/Object :as/Link],
                :rdf/type    :owl/Class}})

(def partOf
  "partOf"
  {:db/ident    :as/partOf,
   :rdf/type    [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/domain :as/CollectionPage,
   :rdfs/label  "partOf",
   :rdfs/range  {:owl/unionOf [:as/Collection :as/Link],
                 :rdf/type    :owl/Class}})

(def prev
  "prev"
  {:db/ident    :as/prev,
   :rdf/type    [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/domain :as/CollectionPage,
   :rdfs/label  "prev",
   :rdfs/range  {:owl/unionOf [:as/CollectionPage :as/Link],
                 :rdf/type    :owl/Class}})

(def preview
  "preview"
  {:db/ident    :as/preview,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class},
   :rdfs/label  "preview",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def provider
  "provider"
  {:db/ident    :as/provider,
   :rdf/type    [:owl/DeprecatedProperty :owl/ObjectProperty],
   :rdfs/domain :as/Object,
   :rdfs/label  "provider",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def published
  "Specifies the date and time the object was published"
  {:db/ident     :as/published,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "Specifies the date and time the object was published",
   :rdfs/domain  :as/Object,
   :rdfs/label   "published",
   :rdfs/range   :xsd/dateTime})

(def radius
  "Specifies a radius around the point established by the longitude and latitude"
  {:db/ident :as/radius,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   "Specifies a radius around the point established by the longitude and latitude",
   :rdfs/domain :as/Place,
   :rdfs/label "radius",
   :rdfs/range {:owl/onDatatype :xsd/float,
                :owl/withRestrictions [{:xsd/minInclusive 0.0}],
                :rdf/type       :rdfs/Datatype}})

(def rating
  "A numeric rating (>= 0.0, <= 5.0) for the object"
  {:db/ident     :as/rating,
   :rdf/type     [:owl/DeprecatedProperty
                  :owl/FunctionalProperty
                  :owl/DatatypeProperty],
   :rdfs/comment "A numeric rating (>= 0.0, <= 5.0) for the object",
   :rdfs/domain  :as/Object,
   :rdfs/label   "rating",
   :rdfs/range   {:owl/onDatatype :xsd/float,
                  :owl/withRestrictions [{:xsd/minInclusive 0.0}
                                         {:xsd/maxInclusive 5.0}],
                  :rdf/type       :rdfs/Datatype}})

(def rel
  "The RFC 5988 or HTML5 Link Relation associated with the Link"
  {:db/ident     :as/rel,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "The RFC 5988 or HTML5 Link Relation associated with the Link",
   :rdfs/domain  :as/Link,
   :rdfs/label   "rel",
   :rdfs/range   :xsd/string})

(def relationship
  "On a Relationship object, describes the type of relationship"
  {:db/ident :as/relationship,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment "On a Relationship object, describes the type of relationship",
   :rdfs/domain :as/Relationship,
   :rdfs/label "relationship",
   :rdfs/range :rdf/Property,
   :rdfs/subPropertyOf [:rdf/predicate :as/relationship]})

(def replies
  "replies"
  {:db/ident    :as/replies,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  "replies",
   :rdfs/range  :as/Collection})

(def result
  "result"
  {:db/ident    :as/result,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Activity,
   :rdfs/label  "result",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def startIndex
  "In a strictly ordered logical collection, specifies the index position of the first item in the items list"
  {:db/ident :as/startIndex,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   "In a strictly ordered logical collection, specifies the index position of the first item in the items list",
   :rdfs/domain :as/OrderedCollectionPage,
   :rdfs/label "startIndex",
   :rdfs/range :xsd/nonNegativeInteger})

(def startTime
  "The starting time of the object"
  {:db/ident     :as/startTime,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "The starting time of the object",
   :rdfs/domain  :as/Object,
   :rdfs/label   "startTime",
   :rdfs/range   :xsd/dateTime})

(def subject
  "On a Relationship object, identifies the subject. e.g. when saying \"John is connected to Sally\", 'subject' refers to 'John'"
  {:db/ident :as/subject,
   :rdf/type [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/comment
   "On a Relationship object, identifies the subject. e.g. when saying \"John is connected to Sally\", 'subject' refers to 'John'",
   :rdfs/domain :as/Relationship,
   :rdfs/label "a",
   :rdfs/range {:owl/unionOf [:as/Link :as/Object],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf [:rdf/subject :as/subject]})

(def summary
  "A short summary of the object"
  {:db/ident     :as/summary,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "A short summary of the object",
   :rdfs/domain  :as/Object,
   :rdfs/label   "summary",
   :rdfs/range   {:owl/unionOf [:rdf/langString :xsd/string],
                  :rdf/type    :owl/Class}})

(def tag
  "tag"
  {:db/ident    :as/tag,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  "tag",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def tags
  "tags"
  {:db/ident    :as/tags,
   :owl/equivalentProperty :as/tag,
   :rdf/type    [:owl/DeprecatedProperty :owl/ObjectProperty],
   :rdfs/domain :as/Object,
   :rdfs/label  "tags",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def target
  "target"
  {:db/ident    :as/target,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Activity,
   :rdfs/label  "target",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def to
  "to"
  {:db/ident    :as/to,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  "to",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def totalItems
  "The total number of items in a logical collection"
  {:db/ident     :as/totalItems,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "The total number of items in a logical collection",
   :rdfs/domain  :as/Collection,
   :rdfs/label   "totalItems",
   :rdfs/range   :xsd/nonNegativeInteger})

(def units
  "Identifies the unit of measurement used by the radius, altitude and accuracy properties. The value can be expressed either as one of a set of predefined units or as a well-known common URI that identifies units."
  {:db/ident :as/units,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   "Identifies the unit of measurement used by the radius, altitude and accuracy properties. The value can be expressed either as one of a set of predefined units or as a well-known common URI that identifies units.",
   :rdfs/domain :as/Place,
   :rdfs/label "units",
   :rdfs/range {:owl/unionOf [{:owl/oneOf [{:xsd/string "inches"}
                                           {:xsd/string "feet"}
                                           {:xsd/string "miles"}
                                           {:xsd/string "cm"}
                                           {:xsd/string "m"}
                                           {:xsd/string "km"}],
                               :rdf/type  :rdfs/Datatype}
                              :xsd/anyURI],
                :rdf/type    :rdfs/Datatype}})

(def updated
  "Specifies when the object was last updated"
  {:db/ident     :as/updated,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment "Specifies when the object was last updated",
   :rdfs/domain  :as/Object,
   :rdfs/label   "updated",
   :rdfs/range   :xsd/dateTime})

(def upstreamDuplicates
  "upstreamDuplicates"
  {:db/ident    :as/upstreamDuplicates,
   :rdf/type    [:owl/DeprecatedProperty :owl/DatatypeProperty],
   :rdfs/domain :as/Object,
   :rdfs/label  "upstreamDuplicates",
   :rdfs/range  :xsd/anyURI})

(def url
  "Specifies a link to a specific representation of the Object"
  {:db/ident     :as/url,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Specifies a link to a specific representation of the Object",
   :rdfs/domain  :as/Object,
   :rdfs/label   "url",
   :rdfs/range   {:owl/unionOf [:as/Link :owl/Thing],
                  :rdf/type    :owl/Class}})

(def verb
  "verb"
  {:db/ident    :as/verb,
   :rdf/type    [:owl/DeprecatedProperty
                 :owl/FunctionalProperty
                 :owl/DatatypeProperty],
   :rdfs/domain :as/Activity,
   :rdfs/label  "verb",
   :rdfs/range  :xsd/anyURI})

(def width
  "Specifies the preferred display width of the content, expressed in terms of device independent pixels."
  {:db/ident :as/width,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   "Specifies the preferred display width of the content, expressed in terms of device independent pixels.",
   :rdfs/domain :as/Link,
   :rdfs/label "width",
   :rdfs/range :xsd/nonNegativeInteger})