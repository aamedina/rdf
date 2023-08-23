(ns net.wikipunk.rdf.as
  "Extended Activity Streams 2.0 Vocabulary"
  {:dcat/downloadURL  "resources/activitystreams2.ttl",
   :owl/imports       {:rdfa/uri "http://www.w3.org/ns/prov#"},
   :rdf/ns-prefix-map {"as"   "http://www.w3.org/ns/activitystreams#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xml"  "http://www.w3.org/XML/1998/namespace",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "as",
   :rdfa/uri          "http://www.w3.org/ns/activitystreams#",
   :rdfs/comment      #xsd/langString
                       "Extended Activity Streams 2.0 Vocabulary@en",
   :rdfs/isDefinedBy  {:rdfa/uri
                       "https://www.w3.org/TR/activitystreams-vocabulary/"},
   :rdfs/label        #xsd/langString "Activity Streams 2.0@en"}
  (:refer-clojure :exclude [first last name next]))

(def Accept
  "Actor accepts the Object"
  {:db/ident        :as/Accept,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "Actor accepts the Object@en",
   :rdfs/label      #xsd/langString "Accept@en",
   :rdfs/subClassOf [:as/Activity :as/Object]})

(def Activity
  "An Object representing some form of Action that has been taken"
  {:db/ident :as/Activity,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "An Object representing some form of Action that has been taken@en",
   :rdfs/label #xsd/langString "Activity@en",
   :rdfs/subClassOf :as/Object})

(def Add
  "To Add an Object or Link to Something"
  {:db/ident        :as/Add,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "To Add an Object or Link to Something@en",
   :rdfs/label      #xsd/langString "Add@en",
   :rdfs/subClassOf [:as/Activity :as/Object]})

(def Announce
  "Actor announces the object to the target"
  {:db/ident        :as/Announce,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString
                     "Actor announces the object to the target@en",
   :rdfs/label      #xsd/langString "Announce@en",
   :rdfs/subClassOf [:as/Activity :as/Object]})

(def Application
  "Represents a software application of any sort"
  {:db/ident        :as/Application,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString
                     "Represents a software application of any sort@en",
   :rdfs/label      #xsd/langString "Application@en",
   :rdfs/subClassOf :as/Object})

(def Arrive
  "To Arrive Somewhere (can be used, for instance, to indicate that a particular entity is currently located somewhere, e.g. a \"check-in\")"
  {:db/ident :as/Arrive,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "To Arrive Somewhere (can be used, for instance, to indicate that a particular entity is currently located somewhere, e.g. a \"check-in\")@en",
   :rdfs/label #xsd/langString "Arrive@en",
   :rdfs/subClassOf [:as/IntransitiveActivity
                     :as/Object
                     :as/Activity
                     {:owl/maxCardinality 0,
                      :owl/onProperty     :as/object,
                      :rdf/type           :owl/Restriction}]})

(def Article
  "A written work. Typically several paragraphs long. For example, a blog post or a news article."
  {:db/ident :as/Article,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A written work. Typically several paragraphs long. For example, a blog post or a news article.@en",
   :rdfs/label #xsd/langString "Article@en",
   :rdfs/subClassOf :as/Object})

(def Audio
  "An audio file"
  {:db/ident        :as/Audio,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "An audio file@en",
   :rdfs/label      #xsd/langString "Audio@en",
   :rdfs/subClassOf [:as/Document :as/Object]})

(def Block
  "Block"
  {:db/ident        :as/Block,
   :rdf/type        :owl/Class,
   :rdfs/label      #xsd/langString "Block@en",
   :rdfs/subClassOf [:as/Ignore :as/Object :as/Activity]})

(def Collection
  "An ordered or unordered collection of Objects or Links"
  {:db/ident :as/Collection,
   :rdf/type :owl/Class,
   :rdfs/comment #xsd/langString
                  "An ordered or unordered collection of Objects or Links@en",
   :rdfs/label #xsd/langString "Collection@en",
   :rdfs/subClassOf :as/Object})

(def CollectionPage
  "A subset of items from a Collection"
  {:db/ident        :as/CollectionPage,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "A subset of items from a Collection@en",
   :rdfs/label      #xsd/langString "CollectionPage@en",
   :rdfs/subClassOf [:as/Collection :as/Object]})

(def Create
  "To Create Something"
  {:db/ident        :as/Create,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "To Create Something@en",
   :rdfs/label      #xsd/langString "Create@en",
   :rdfs/subClassOf [:as/Activity :as/Object]})

(def Delete
  "To Delete Something"
  {:db/ident        :as/Delete,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "To Delete Something@en",
   :rdfs/label      #xsd/langString "Delete@en",
   :rdfs/subClassOf [:as/Activity :as/Object]})

(def Dislike
  "The actor dislikes the object"
  {:db/ident        :as/Dislike,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "The actor dislikes the object@en",
   :rdfs/label      #xsd/langString "Dislike@en",
   :rdfs/subClassOf [:as/Activity :as/Object]})

(def Document
  "Represents a digital document/file of any sort"
  {:db/ident        :as/Document,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString
                     "Represents a digital document/file of any sort@en",
   :rdfs/label      #xsd/langString "Document@en",
   :rdfs/subClassOf :as/Object})

(def Event
  "An Event of any kind"
  {:db/ident        :as/Event,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "An Event of any kind@en",
   :rdfs/label      #xsd/langString "Event@en",
   :rdfs/subClassOf :as/Object})

(def Flag
  "To flag something (e.g. flag as inappropriate, flag as spam, etc)"
  {:db/ident :as/Flag,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "To flag something (e.g. flag as inappropriate, flag as spam, etc)@en",
   :rdfs/label #xsd/langString "Flag@en",
   :rdfs/subClassOf [:as/Activity :as/Object]})

(def Follow
  "To Express Interest in Something"
  {:db/ident        :as/Follow,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "To Express Interest in Something@en",
   :rdfs/label      #xsd/langString "Follow@en",
   :rdfs/subClassOf [:as/Activity :as/Object]})

(def Group
  "A Group of any kind."
  {:db/ident        :as/Group,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "A Group of any kind.@en",
   :rdfs/label      #xsd/langString "Group@en",
   :rdfs/subClassOf :as/Object})

(def Ignore
  "Actor is ignoring the Object"
  {:db/ident        :as/Ignore,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "Actor is ignoring the Object@en",
   :rdfs/label      #xsd/langString "Ignore@en",
   :rdfs/subClassOf [:as/Activity :as/Object]})

(def Image
  "An Image file"
  {:db/ident        :as/Image,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "An Image file@en",
   :rdfs/label      #xsd/langString "Image@en",
   :rdfs/subClassOf [:as/Document :as/Object]})

(def IntransitiveActivity
  "An Activity that has no direct object"
  {:db/ident        :as/IntransitiveActivity,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "An Activity that has no direct object@en",
   :rdfs/label      #xsd/langString "IntransitiveActivity@en",
   :rdfs/subClassOf [{:owl/maxCardinality 0,
                      :owl/onProperty     :as/object,
                      :rdf/type           :owl/Restriction}
                     :as/Activity
                     :as/Object]})

(def Invite
  "To invite someone or something to something"
  {:db/ident        :as/Invite,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString
                     "To invite someone or something to something@en",
   :rdfs/label      #xsd/langString "Invite@en",
   :rdfs/subClassOf [:as/Offer :as/Object :as/Activity]})

(def Join
  "To Join Something"
  {:db/ident        :as/Join,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "To Join Something@en",
   :rdfs/label      #xsd/langString "Join@en",
   :rdfs/subClassOf [:as/Activity :as/Object]})

(def Leave
  "To Leave Something"
  {:db/ident        :as/Leave,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "To Leave Something@en",
   :rdfs/label      #xsd/langString "Leave@en",
   :rdfs/subClassOf [:as/Activity :as/Object]})

(def Like
  "To Like Something"
  {:db/ident        :as/Like,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "To Like Something@en",
   :rdfs/label      #xsd/langString "Like@en",
   :rdfs/subClassOf [:as/Activity :as/Object]})

(def Link
  "Represents a qualified reference to another resource. Patterned after the RFC5988 Web Linking Model"
  {:db/ident :as/Link,
   :owl/disjointWith :as/Object,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Represents a qualified reference to another resource. Patterned after the RFC5988 Web Linking Model@en",
   :rdfs/label #xsd/langString "Link@en"})

(def Listen
  "The actor listened to the object"
  {:db/ident        :as/Listen,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "The actor listened to the object@en",
   :rdfs/label      #xsd/langString "Listen@en",
   :rdfs/subClassOf [:as/Activity :as/Object]})

(def Mention
  "A specialized Link that represents an @mention"
  {:db/ident        :as/Mention,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString
                     "A specialized Link that represents an @mention@en",
   :rdfs/label      #xsd/langString "Mention@en",
   :rdfs/subClassOf :as/Link})

(def Move
  "The actor is moving the object. The target specifies where the object is moving to. The origin specifies where the object is moving from."
  {:db/ident :as/Move,
   :rdf/type :owl/Class,
   :rdfs/comment
   "The actor is moving the object. The target specifies where the object is moving to. The origin specifies where the object is moving from.",
   :rdfs/label #xsd/langString "Move@en",
   :rdfs/subClassOf [:as/Activity :as/Object]})

(def Note
  "A Short note, typically less than a single paragraph. A \"tweet\" is an example, or a \"status update\""
  {:db/ident :as/Note,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A Short note, typically less than a single paragraph. A \"tweet\" is an example, or a \"status update\"@en",
   :rdfs/label #xsd/langString "Note@en",
   :rdfs/subClassOf :as/Object})

(def ObjectClass
  "Object"
  {:db/ident   :as/Object,
   :rdf/type   :owl/Class,
   :rdfs/label #xsd/langString "Object@en"})

(def Offer
  "To Offer something to someone or something"
  {:db/ident        :as/Offer,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString
                     "To Offer something to someone or something@en",
   :rdfs/label      #xsd/langString "Offer@en",
   :rdfs/subClassOf [:as/Activity :as/Object]})

(def OrderedCollection
  "A variation of Collection in which items are strictly ordered"
  {:db/ident :as/OrderedCollection,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "A variation of Collection in which items are strictly ordered@en",
   :rdfs/label #xsd/langString "OrderedCollection@en",
   :rdfs/subClassOf {:owl/intersectionOf [:as/Collection
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
                     :rdf/type :owl/Class}})

(def OrderedCollectionPage
  "An ordered subset of items from an OrderedCollection"
  {:db/ident        :as/OrderedCollectionPage,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString
                     "An ordered subset of items from an OrderedCollection@en",
   :rdfs/label      #xsd/langString "OrderedCollectionPage@en",
   :rdfs/subClassOf [:as/CollectionPage
                     :as/OrderedCollection
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
                     :as/Object
                     :as/Collection]})

(def OrderedItems
  "A rdf:List variant for Objects and Links"
  {:db/ident        :as/OrderedItems,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString
                     "A rdf:List variant for Objects and Links@en",
   :rdfs/label      #xsd/langString "OrderedItems@en",
   :rdfs/subClassOf {:owl/intersectionOf [:rdf/List
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
                     :rdf/type :owl/Class}})

(def Organization
  "An Organization"
  {:db/ident        :as/Organization,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "An Organization@en",
   :rdfs/label      #xsd/langString "Organization@en",
   :rdfs/subClassOf :as/Object})

(def Page
  "A Web Page"
  {:db/ident        :as/Page,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "A Web Page@en",
   :rdfs/label      #xsd/langString "Page@en",
   :rdfs/subClassOf :as/Object})

(def Person
  "A Person"
  {:db/ident        :as/Person,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "A Person@en",
   :rdfs/label      #xsd/langString "Person@en",
   :rdfs/subClassOf :as/Object})

(def Place
  "A physical or logical location"
  {:db/ident        :as/Place,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "A physical or logical location@en",
   :rdfs/label      #xsd/langString "Place@en",
   :rdfs/subClassOf :as/Object})

(def Profile
  "A Profile Document"
  {:db/ident        :as/Profile,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "A Profile Document@en",
   :rdfs/label      #xsd/langString "Profile@en",
   :rdfs/subClassOf :as/Object})

(def Question
  "A question of any sort."
  {:db/ident        :as/Question,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "A question of any sort.@en",
   :rdfs/label      #xsd/langString "Question@en",
   :rdfs/subClassOf [:as/IntransitiveActivity
                     :as/Object
                     :as/Activity
                     {:owl/maxCardinality 0,
                      :owl/onProperty     :as/object,
                      :rdf/type           :owl/Restriction}]})

(def Read
  "The actor read the object"
  {:db/ident        :as/Read,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "The actor read the object@en",
   :rdfs/label      #xsd/langString "Read@en",
   :rdfs/subClassOf [:as/Activity :as/Object]})

(def Reject
  "Actor rejects the Object"
  {:db/ident        :as/Reject,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "Actor rejects the Object@en",
   :rdfs/label      #xsd/langString "Reject@en",
   :rdfs/subClassOf [:as/Activity :as/Object]})

(def Relationship
  "Represents a Social Graph relationship between two Individuals (indicated by the 'a' and 'b' properties)"
  {:db/ident :as/Relationship,
   :rdf/type [:rdf/Statement :owl/Class],
   :rdfs/comment
   #xsd/langString
    "Represents a Social Graph relationship between two Individuals (indicated by the 'a' and 'b' properties)@en",
   :rdfs/label #xsd/langString "Relationship@en",
   :rdfs/subClassOf :as/Object})

(def Remove
  "To Remove Something"
  {:db/ident        :as/Remove,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "To Remove Something@en",
   :rdfs/label      #xsd/langString "Remove@en",
   :rdfs/subClassOf [:as/Activity :as/Object]})

(def Service
  "A service provided by some entity"
  {:db/ident        :as/Service,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "A service provided by some entity@en",
   :rdfs/label      #xsd/langString "Service@en",
   :rdfs/subClassOf :as/Object})

(def TentativeAccept
  "Actor tentatively accepts the Object"
  {:db/ident        :as/TentativeAccept,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "Actor tentatively accepts the Object@en",
   :rdfs/label      #xsd/langString "TentativeAccept@en",
   :rdfs/subClassOf [:as/Accept :as/Object :as/Activity]})

(def TentativeReject
  "Actor tentatively rejects the object"
  {:db/ident        :as/TentativeReject,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "Actor tentatively rejects the object@en",
   :rdfs/label      #xsd/langString "TentativeReject@en",
   :rdfs/subClassOf [:as/Reject :as/Object :as/Activity]})

(def Tombstone
  "A placeholder for a deleted object"
  {:db/ident        :as/Tombstone,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "A placeholder for a deleted object@en",
   :rdfs/label      #xsd/langString "Tombstone@en",
   :rdfs/subClassOf :as/Object})

(def Travel
  "The actor is traveling to the target. The origin specifies where the actor is traveling from."
  {:db/ident :as/Travel,
   :rdf/type :owl/Class,
   :rdfs/comment
   "The actor is traveling to the target. The origin specifies where the actor is traveling from.",
   :rdfs/label #xsd/langString "Travel@en",
   :rdfs/subClassOf [:as/IntransitiveActivity
                     :as/Object
                     :as/Activity
                     {:owl/maxCardinality 0,
                      :owl/onProperty     :as/object,
                      :rdf/type           :owl/Restriction}]})

(def Undo
  "To Undo Something. This would typically be used to indicate that a previous Activity has been undone."
  {:db/ident :as/Undo,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "To Undo Something. This would typically be used to indicate that a previous Activity has been undone.@en",
   :rdfs/label #xsd/langString "Undo@en",
   :rdfs/subClassOf [:as/Activity :as/Object]})

(def Update
  "To Update/Modify Something"
  {:db/ident        :as/Update,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "To Update/Modify Something@en",
   :rdfs/label      #xsd/langString "Update@en",
   :rdfs/subClassOf [:as/Activity :as/Object]})

(def Video
  "A Video document of any kind."
  {:db/ident        :as/Video,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "A Video document of any kind.@en",
   :rdfs/label      #xsd/langString "Video@en",
   :rdfs/subClassOf [:as/Document :as/Object]})

(def View
  "The actor viewed the object"
  {:db/ident        :as/View,
   :rdf/type        :owl/Class,
   :rdfs/comment    #xsd/langString "The actor viewed the object@en",
   :rdfs/label      #xsd/langString "View@en",
   :rdfs/subClassOf [:as/Activity :as/Object]})

(def accuracy
  "Specifies the accuracy around the point established by the longitude and latitude"
  {:db/ident :as/accuracy,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   #xsd/langString
    "Specifies the accuracy around the point established by the longitude and latitude@en",
   :rdfs/domain :as/Place,
   :rdfs/label #xsd/langString "accuracy@en",
   :rdfs/range {:owl/onDatatype :xsd/float,
                :owl/withRestrictions [{:xsd/minInclusive 0.0M}],
                :rdf/type       :rdfs/Datatype}})

(def actor
  "Subproperty of as:attributedTo that identifies the primary actor"
  {:db/ident :as/actor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Subproperty of as:attributedTo that identifies the primary actor@en",
   :rdfs/domain :as/Activity,
   :rdfs/label #xsd/langString "actor@en",
   :rdfs/range {:owl/unionOf [:as/Object :as/Link],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :as/attributedTo})

(def altitude
  "The altitude of a place"
  {:db/ident     :as/altitude,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment #xsd/langString "The altitude of a place@en",
   :rdfs/domain  :as/Place,
   :rdfs/label   #xsd/langString "altitude@en",
   :rdfs/range   :xsd/float})

(def anyOf
  "Describes a possible inclusive answer or option for a question."
  {:db/ident :as/anyOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Describes a possible inclusive answer or option for a question.@en",
   :rdfs/domain :as/Question,
   :rdfs/label #xsd/langString "oneOf@en",
   :rdfs/range {:owl/unionOf [:as/Object :as/Link],
                :rdf/type    :owl/Class}})

(def attachment
  "attachment"
  {:db/ident    :as/attachment,
   :owl/equivalentProperty :as/attachments,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  #xsd/langString "attachment@en",
   :rdfs/range  {:owl/unionOf [:as/Link :as/Object],
                 :rdf/type    :owl/Class}})

(def attachments
  "attachments"
  {:db/ident    :as/attachments,
   :rdf/type    [:owl/DeprecatedProperty :owl/ObjectProperty],
   :rdfs/domain :as/Object,
   :rdfs/label  #xsd/langString "attachments@en",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def attributedTo
  "Identifies an entity to which an object is attributed"
  {:db/ident     :as/attributedTo,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment #xsd/langString
                  "Identifies an entity to which an object is attributed@en",
   :rdfs/domain  {:owl/unionOf [:as/Object :as/Link],
                  :rdf/type    :owl/Class},
   :rdfs/label   #xsd/langString "attributedTo@en",
   :rdfs/range   {:owl/unionOf [:as/Object :as/Link],
                  :rdf/type    :owl/Class}})

(def audience
  "audience"
  {:db/ident    :as/audience,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  #xsd/langString "audience@en",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def author
  "Identifies the author of an object. Deprecated. Use as:attributedTo instead"
  {:db/ident :as/author,
   :rdf/type [:owl/DeprecatedProperty :owl/ObjectProperty],
   :rdfs/comment
   #xsd/langString
    "Identifies the author of an object. Deprecated. Use as:attributedTo instead@en",
   :rdfs/domain :as/Object,
   :rdfs/label #xsd/langString "author@en",
   :rdfs/range {:owl/unionOf [:as/Object :as/Link],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :as/attributedTo})

(def bcc
  "bcc"
  {:db/ident    :as/bcc,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  #xsd/langString "bcc@en",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def bto
  "bto"
  {:db/ident    :as/bto,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  #xsd/langString "bto@en",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def cc
  "cc"
  {:db/ident    :as/cc,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  #xsd/langString "cc@en",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def content
  "The content of the object."
  {:db/ident     :as/content,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/langString "The content of the object.@en",
   :rdfs/domain  :as/Object,
   :rdfs/label   #xsd/langString "content@en",
   :rdfs/range   {:owl/unionOf [:rdf/langString :xsd/string],
                  :rdf/type    :owl/Class}})

(def context
  "Specifies the context within which an object exists or an activity was performed"
  {:db/ident :as/context,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Specifies the context within which an object exists or an activity was performed@en",
   :rdfs/domain :as/Object,
   :rdfs/label #xsd/langString "context@en",
   :rdfs/range {:owl/unionOf [:as/Object :as/Link],
                :rdf/type    :owl/Class}})

(def current
  "current"
  {:db/ident    :as/current,
   :rdf/type    [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/domain :as/Collection,
   :rdfs/label  #xsd/langString "current@en",
   :rdfs/range  {:owl/unionOf [:as/CollectionPage :as/Link],
                 :rdf/type    :owl/Class}})

(def deleted
  "Specifies the date and time the object was deleted"
  {:db/ident     :as/deleted,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment #xsd/langString
                  "Specifies the date and time the object was deleted@en",
   :rdfs/domain  :as/Tombstone,
   :rdfs/label   #xsd/langString "deleted@en",
   :rdfs/range   :xsd/dateTime})

(def describes
  "On a Profile object, describes the object described by the profile"
  {:db/ident :as/describes,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment
   #xsd/langString
    "On a Profile object, describes the object described by the profile@en",
   :rdfs/domain :as/Profile,
   :rdfs/label #xsd/langString "describes@en",
   :rdfs/range :as/Object})

(def downstreamDuplicates
  "downstreamDuplicates"
  {:db/ident    :as/downstreamDuplicates,
   :rdf/type    [:owl/DeprecatedProperty :owl/DatatypeProperty],
   :rdfs/domain :as/Object,
   :rdfs/label  #xsd/langString "downstreamDuplicates@en",
   :rdfs/range  :xsd/anyURI})

(def duration
  "The duration of the object"
  {:db/ident     :as/duration,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment #xsd/langString "The duration of the object@en",
   :rdfs/domain  :as/Object,
   :rdfs/label   #xsd/langString "duration@en",
   :rdfs/range   :xsd/duration})

(def endTime
  "The ending time of the object"
  {:db/ident     :as/endTime,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment #xsd/langString "The ending time of the object@en",
   :rdfs/domain  :as/Object,
   :rdfs/label   #xsd/langString "endTime@en",
   :rdfs/range   :xsd/dateTime})

(def first
  "first"
  {:db/ident    :as/first,
   :rdf/type    [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/domain :as/Collection,
   :rdfs/label  #xsd/langString "first@en",
   :rdfs/range  {:owl/unionOf [:as/CollectionPage :as/Link],
                 :rdf/type    :owl/Class}})

(def formerType
  "On a Tombstone object, describes the former type of the deleted object"
  {:db/ident :as/formerType,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment
   #xsd/langString
    "On a Tombstone object, describes the former type of the deleted object@en",
   :rdfs/domain :as/Tombstone,
   :rdfs/label #xsd/langString "formerType@en",
   :rdfs/range :as/Object})

(def generator
  "generator"
  {:db/ident    :as/generator,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  #xsd/langString "generator@en",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def height
  "The display height expressed as device independent pixels"
  {:db/ident :as/height,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   #xsd/langString
    "The display height expressed as device independent pixels@en",
   :rdfs/domain :as/Link,
   :rdfs/label #xsd/langString "height@en",
   :rdfs/range :xsd/nonNegativeInteger})

(def href
  "The target URI of the Link"
  {:db/ident     :as/href,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment #xsd/langString "The target URI of the Link@en",
   :rdfs/domain  :as/Link,
   :rdfs/label   #xsd/langString "href@en",
   :rdfs/range   :xsd/anyURI})

(def hreflang
  "A hint about the language of the referenced resource"
  {:db/ident     :as/hreflang,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment #xsd/langString
                  "A hint about the language of the referenced resource@en",
   :rdfs/domain  :as/Link,
   :rdfs/label   #xsd/langString "hreflang@en",
   :rdfs/range   :xsd/language})

(def icon
  "icon"
  {:db/ident    :as/icon,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  #xsd/langString "icon@en",
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
   :rdfs/label  #xsd/langString "id@en",
   :rdfs/range  :xsd/anyURI})

(def image
  "image"
  {:db/ident    :as/image,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  #xsd/langString "image@en",
   :rdfs/range  {:owl/unionOf [:as/Image :as/Link],
                 :rdf/type    :owl/Class}})

(def inReplyTo
  "inReplyTo"
  {:db/ident    :as/inReplyTo,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  #xsd/langString "inReplyTo@en",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def instrument
  "Indentifies an object used (or to be used) to complete an activity"
  {:db/ident :as/instrument,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Indentifies an object used (or to be used) to complete an activity@en",
   :rdfs/domain :as/Activity,
   :rdfs/label #xsd/langString "instrument@en",
   :rdfs/range {:owl/unionOf [:as/Object :as/Link],
                :rdf/type    :owl/Class}})

(def items
  "items"
  {:db/ident    :as/items,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Collection,
   :rdfs/label  #xsd/langString "items@en",
   :rdfs/range  {:owl/unionOf [{:owl/unionOf [:as/Object :as/Link],
                                :rdf/type    :owl/Class}
                               :as/OrderedItems],
                 :rdf/type    :owl/Class}})

(def last
  "last"
  {:db/ident    :as/last,
   :rdf/type    [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/domain :as/Collection,
   :rdfs/label  #xsd/langString "last@en",
   :rdfs/range  {:owl/unionOf [:as/CollectionPage :as/Link],
                 :rdf/type    :owl/Class}})

(def latitude
  "The latitude"
  {:db/ident     :as/latitude,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment #xsd/langString "The latitude@en",
   :rdfs/domain  :as/Place,
   :rdfs/label   #xsd/langString "latitude@en",
   :rdfs/range   :xsd/float})

(def location
  "location"
  {:db/ident    :as/location,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  #xsd/langString "location@en",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def longitude
  "The longitude"
  {:db/ident     :as/longitude,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment #xsd/langString "The longitude@en",
   :rdfs/domain  :as/Place,
   :rdfs/label   #xsd/langString "longitude@en",
   :rdfs/range   :xsd/float})

(def mediaType
  "The MIME Media Type"
  {:db/ident     :as/mediaType,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment #xsd/langString "The MIME Media Type@en",
   :rdfs/domain  {:owl/unionOf [:as/Link :as/Object],
                  :rdf/type    :owl/Class},
   :rdfs/label   #xsd/langString "mediaType@en",
   :rdfs/range   :xsd/string})

(def name
  "The default, plain-text display name of the object or link."
  {:db/ident :as/name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The default, plain-text display name of the object or link.@en",
   :rdfs/domain {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class},
   :rdfs/label #xsd/langString "name@en",
   :rdfs/range {:owl/unionOf [:rdf/langString :xsd/string],
                :rdf/type    :owl/Class}})

(def next
  "next"
  {:db/ident    :as/next,
   :rdf/type    [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/domain :as/CollectionPage,
   :rdfs/label  #xsd/langString "next@en",
   :rdfs/range  {:owl/unionOf [:as/CollectionPage :as/Link],
                 :rdf/type    :owl/Class}})

(def object
  "object"
  {:db/ident    :as/object,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:as/Activity :as/Relationship],
                 :rdf/type    :owl/Class},
   :rdfs/label  #xsd/langString "object@en",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def objectType
  "objectType"
  {:db/ident    :as/objectType,
   :rdf/type    [:owl/DeprecatedProperty
                 :owl/FunctionalProperty
                 :owl/DatatypeProperty],
   :rdfs/domain :as/Object,
   :rdfs/label  #xsd/langString "objectType@en",
   :rdfs/range  :xsd/anyURI})

(def oneOf
  "Describes a possible exclusive answer or option for a question."
  {:db/ident :as/oneOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Describes a possible exclusive answer or option for a question.@en",
   :rdfs/domain :as/Question,
   :rdfs/label #xsd/langString "oneOf@en",
   :rdfs/range {:owl/unionOf [:as/Object :as/Link],
                :rdf/type    :owl/Class}})

(def origin
  "For certain activities, specifies the entity from which the action is directed."
  {:db/ident :as/origin,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "For certain activities, specifies the entity from which the action is directed.@en",
   :rdfs/domain :as/Activity,
   :rdfs/label #xsd/langString "origin@en",
   :rdfs/range {:owl/unionOf [:as/Object :as/Link],
                :rdf/type    :owl/Class}})

(def partOf
  "partOf"
  {:db/ident    :as/partOf,
   :rdf/type    [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/domain :as/CollectionPage,
   :rdfs/label  #xsd/langString "partOf@en",
   :rdfs/range  {:owl/unionOf [:as/Collection :as/Link],
                 :rdf/type    :owl/Class}})

(def prev
  "prev"
  {:db/ident    :as/prev,
   :rdf/type    [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/domain :as/CollectionPage,
   :rdfs/label  #xsd/langString "prev@en",
   :rdfs/range  {:owl/unionOf [:as/CollectionPage :as/Link],
                 :rdf/type    :owl/Class}})

(def preview
  "preview"
  {:db/ident    :as/preview,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class},
   :rdfs/label  #xsd/langString "preview@en",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def provider
  "provider"
  {:db/ident    :as/provider,
   :rdf/type    [:owl/DeprecatedProperty :owl/ObjectProperty],
   :rdfs/domain :as/Object,
   :rdfs/label  #xsd/langString "provider@en",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def published
  "Specifies the date and time the object was published"
  {:db/ident     :as/published,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment #xsd/langString
                  "Specifies the date and time the object was published@en",
   :rdfs/domain  :as/Object,
   :rdfs/label   #xsd/langString "published@en",
   :rdfs/range   :xsd/dateTime})

(def radius
  "Specifies a radius around the point established by the longitude and latitude"
  {:db/ident :as/radius,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   #xsd/langString
    "Specifies a radius around the point established by the longitude and latitude@en",
   :rdfs/domain :as/Place,
   :rdfs/label #xsd/langString "radius@en",
   :rdfs/range {:owl/onDatatype :xsd/float,
                :owl/withRestrictions [{:xsd/minInclusive 0.0M}],
                :rdf/type       :rdfs/Datatype}})

(def rating
  "A numeric rating (>= 0.0, <= 5.0) for the object"
  {:db/ident     :as/rating,
   :rdf/type     [:owl/DeprecatedProperty
                  :owl/FunctionalProperty
                  :owl/DatatypeProperty],
   :rdfs/comment #xsd/langString
                  "A numeric rating (>= 0.0, <= 5.0) for the object@en",
   :rdfs/domain  :as/Object,
   :rdfs/label   #xsd/langString "rating@en",
   :rdfs/range   {:owl/onDatatype :xsd/float,
                  :owl/withRestrictions [{:xsd/minInclusive 0.0M}
                                         {:xsd/maxInclusive 5.0M}],
                  :rdf/type       :rdfs/Datatype}})

(def rel
  "The RFC 5988 or HTML5 Link Relation associated with the Link"
  {:db/ident :as/rel,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The RFC 5988 or HTML5 Link Relation associated with the Link@en",
   :rdfs/domain :as/Link,
   :rdfs/label #xsd/langString "rel@en",
   :rdfs/range :xsd/string})

(def relationship
  "On a Relationship object, describes the type of relationship"
  {:db/ident :as/relationship,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "On a Relationship object, describes the type of relationship@en",
   :rdfs/domain :as/Relationship,
   :rdfs/label #xsd/langString "relationship@en",
   :rdfs/range :rdf/Property,
   :rdfs/subPropertyOf :rdf/predicate})

(def replies
  "replies"
  {:db/ident    :as/replies,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  #xsd/langString "replies@en",
   :rdfs/range  :as/Collection})

(def result
  "result"
  {:db/ident    :as/result,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Activity,
   :rdfs/label  #xsd/langString "result@en",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def startIndex
  "In a strictly ordered logical collection, specifies the index position of the first item in the items list"
  {:db/ident :as/startIndex,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   #xsd/langString
    "In a strictly ordered logical collection, specifies the index position of the first item in the items list@en",
   :rdfs/domain :as/OrderedCollectionPage,
   :rdfs/label #xsd/langString "startIndex@en",
   :rdfs/range :xsd/nonNegativeInteger})

(def startTime
  "The starting time of the object"
  {:db/ident     :as/startTime,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment #xsd/langString "The starting time of the object@en",
   :rdfs/domain  :as/Object,
   :rdfs/label   #xsd/langString "startTime@en",
   :rdfs/range   :xsd/dateTime})

(def subject
  "On a Relationship object, identifies the subject. e.g. when saying \"John is connected to Sally\", 'subject' refers to 'John'"
  {:db/ident :as/subject,
   :rdf/type [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/comment
   #xsd/langString
    "On a Relationship object, identifies the subject. e.g. when saying \"John is connected to Sally\", 'subject' refers to 'John'@en",
   :rdfs/domain :as/Relationship,
   :rdfs/label #xsd/langString "a@en",
   :rdfs/range {:owl/unionOf [:as/Link :as/Object],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :rdf/subject})

(def summary
  "A short summary of the object"
  {:db/ident     :as/summary,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #xsd/langString "A short summary of the object@en",
   :rdfs/domain  :as/Object,
   :rdfs/label   #xsd/langString "summary@en",
   :rdfs/range   {:owl/unionOf [:rdf/langString :xsd/string],
                  :rdf/type    :owl/Class}})

(def tag
  "tag"
  {:db/ident    :as/tag,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  #xsd/langString "tag@en",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def tags
  "tags"
  {:db/ident    :as/tags,
   :owl/equivalentProperty :as/tag,
   :rdf/type    [:owl/DeprecatedProperty :owl/ObjectProperty],
   :rdfs/domain :as/Object,
   :rdfs/label  #xsd/langString "tags@en",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def target
  "target"
  {:db/ident    :as/target,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Activity,
   :rdfs/label  #xsd/langString "target@en",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def to
  "to"
  {:db/ident    :as/to,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  #xsd/langString "to@en",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def totalItems
  "The total number of items in a logical collection"
  {:db/ident     :as/totalItems,
   :rdf/type     [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment #xsd/langString
                  "The total number of items in a logical collection@en",
   :rdfs/domain  :as/Collection,
   :rdfs/label   #xsd/langString "totalItems@en",
   :rdfs/range   :xsd/nonNegativeInteger})

(def units
  "Identifies the unit of measurement used by the radius, altitude and accuracy properties. The value can be expressed either as one of a set of predefined units or as a well-known common URI that identifies units."
  {:db/ident :as/units,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   #xsd/langString
    "Identifies the unit of measurement used by the radius, altitude and accuracy properties. The value can be expressed either as one of a set of predefined units or as a well-known common URI that identifies units.@en",
   :rdfs/domain :as/Place,
   :rdfs/label #xsd/langString "units@en",
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
   :rdfs/comment #xsd/langString
                  "Specifies when the object was last updated@en",
   :rdfs/domain  :as/Object,
   :rdfs/label   #xsd/langString "updated@en",
   :rdfs/range   :xsd/dateTime})

(def upstreamDuplicates
  "upstreamDuplicates"
  {:db/ident    :as/upstreamDuplicates,
   :rdf/type    [:owl/DeprecatedProperty :owl/DatatypeProperty],
   :rdfs/domain :as/Object,
   :rdfs/label  #xsd/langString "upstreamDuplicates@en",
   :rdfs/range  :xsd/anyURI})

(def url
  "Specifies a link to a specific representation of the Object"
  {:db/ident :as/url,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Specifies a link to a specific representation of the Object@en",
   :rdfs/domain :as/Object,
   :rdfs/label #xsd/langString "url@en",
   :rdfs/range {:owl/unionOf [:as/Link :owl/Thing],
                :rdf/type    :owl/Class}})

(def verb
  "verb"
  {:db/ident    :as/verb,
   :rdf/type    [:owl/DeprecatedProperty
                 :owl/FunctionalProperty
                 :owl/DatatypeProperty],
   :rdfs/domain :as/Activity,
   :rdfs/label  #xsd/langString "verb@en",
   :rdfs/range  :xsd/anyURI})

(def width
  "Specifies the preferred display width of the content, expressed in terms of device independent pixels."
  {:db/ident :as/width,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   #xsd/langString
    "Specifies the preferred display width of the content, expressed in terms of device independent pixels.@en",
   :rdfs/domain :as/Link,
   :rdfs/label #xsd/langString "width@en",
   :rdfs/range :xsd/nonNegativeInteger})