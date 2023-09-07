(ns net.wikipunk.rdf.as
  ^{:base       "https://www.w3.org/ns/activitystreams#",
    :namespaces {"as"   "http://www.w3.org/ns/activitystreams#",
                 "owl"  "http://www.w3.org/2002/07/owl#",
                 "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                 "xml"  "http://www.w3.org/XML/1998/namespace",
                 "xsd"  "http://www.w3.org/2001/XMLSchema#"},
    :prefix     "as",
    :source     "net/wikipunk/boot/activitystreams2.ttl"}
  {:rdf/type :owl/Ontology}
  (:refer-clojure :exclude [first last name next]))

(def Accept
  {:db/ident        :as/Accept,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Actor accepts the Object"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Accept"},
   :rdfs/subClassOf :as/Activity})

(def Activity
  {:db/ident :as/Activity,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An Object representing some form of Action that has been taken"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Activity"},
   :rdfs/subClassOf :as/Object})

(def Add
  {:db/ident        :as/Add,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "To Add an Object or Link to Something"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Add"},
   :rdfs/subClassOf :as/Activity})

(def Announce
  {:db/ident        :as/Announce,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Actor announces the object to the target"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Announce"},
   :rdfs/subClassOf :as/Activity})

(def Application
  {:db/ident        :as/Application,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value
                     "Represents a software application of any sort"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Application"},
   :rdfs/subClassOf :as/Object})

(def Arrive
  {:db/ident :as/Arrive,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To Arrive Somewhere (can be used, for instance, to indicate that a particular entity is currently located somewhere, e.g. a \"check-in\")"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Arrive"},
   :rdfs/subClassOf :as/IntransitiveActivity})

(def Article
  {:db/ident :as/Article,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A written work. Typically several paragraphs long. For example, a blog post or a news article."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Article"},
   :rdfs/subClassOf :as/Object})

(def Audio
  {:db/ident        :as/Audio,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "An audio file"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Audio"},
   :rdfs/subClassOf :as/Document})

(def Block
  {:db/ident        :as/Block,
   :rdf/type        :owl/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Block"},
   :rdfs/subClassOf :as/Ignore})

(def Collection
  {:db/ident        :as/Collection,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value
                     "An ordered or unordered collection of Objects or Links"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Collection"},
   :rdfs/subClassOf :as/Object})

(def CollectionPage
  {:db/ident        :as/CollectionPage,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "A subset of items from a Collection"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "CollectionPage"},
   :rdfs/subClassOf :as/Collection})

(def Create
  {:db/ident        :as/Create,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "To Create Something"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Create"},
   :rdfs/subClassOf :as/Activity})

(def Delete
  {:db/ident        :as/Delete,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "To Delete Something"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Delete"},
   :rdfs/subClassOf :as/Activity})

(def Dislike
  {:db/ident        :as/Dislike,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "The actor dislikes the object"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Dislike"},
   :rdfs/subClassOf :as/Activity})

(def Document
  {:db/ident        :as/Document,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value
                     "Represents a digital document/file of any sort"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Document"},
   :rdfs/subClassOf :as/Object})

(def Event
  {:db/ident        :as/Event,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "An Event of any kind"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Event"},
   :rdfs/subClassOf :as/Object})

(def Flag
  {:db/ident :as/Flag,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To flag something (e.g. flag as inappropriate, flag as spam, etc)"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Flag"},
   :rdfs/subClassOf :as/Activity})

(def Follow
  {:db/ident        :as/Follow,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "To Express Interest in Something"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Follow"},
   :rdfs/subClassOf :as/Activity})

(def Group
  {:db/ident        :as/Group,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "A Group of any kind."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Group"},
   :rdfs/subClassOf :as/Object})

(def Ignore
  {:db/ident        :as/Ignore,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Actor is ignoring the Object"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Ignore"},
   :rdfs/subClassOf :as/Activity})

(def Image
  {:db/ident        :as/Image,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "An Image file"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Image"},
   :rdfs/subClassOf :as/Document})

(def IntransitiveActivity
  {:db/ident        :as/IntransitiveActivity,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "An Activity that has no direct object"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "IntransitiveActivity"},
   :rdfs/subClassOf #{:as/Activity
                      {:owl/maxCardinality 0,
                       :owl/onProperty     :as/object,
                       :rdf/type           :owl/Restriction}}})

(def Invite
  {:db/ident        :as/Invite,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value "To invite someone or something to something"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Invite"},
   :rdfs/subClassOf :as/Offer})

(def Join
  {:db/ident        :as/Join,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "To Join Something"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Join"},
   :rdfs/subClassOf :as/Activity})

(def Leave
  {:db/ident        :as/Leave,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "To Leave Something"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Leave"},
   :rdfs/subClassOf :as/Activity})

(def Like
  {:db/ident        :as/Like,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "To Like Something"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Like"},
   :rdfs/subClassOf :as/Activity})

(def Link
  {:db/ident :as/Link,
   :owl/disjointWith :as/Object,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Represents a qualified reference to another resource. Patterned after the RFC5988 Web Linking Model"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Link"}})

(def Listen
  {:db/ident        :as/Listen,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "The actor listened to the object"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Listen"},
   :rdfs/subClassOf :as/Activity})

(def Mention
  {:db/ident        :as/Mention,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value
                     "A specialized Link that represents an @mention"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Mention"},
   :rdfs/subClassOf :as/Link})

(def Move
  {:db/ident :as/Move,
   :rdf/type :owl/Class,
   :rdfs/comment
   "The actor is moving the object. The target specifies where the object is moving to. The origin specifies where the object is moving from.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Move"},
   :rdfs/subClassOf :as/Activity})

(def Note
  {:db/ident :as/Note,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Short note, typically less than a single paragraph. A \"tweet\" is an example, or a \"status update\""},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Note"},
   :rdfs/subClassOf :as/Object})

(def ObjectClass
  {:db/ident   :as/Object,
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Object"}})

(def Offer
  {:db/ident        :as/Offer,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value "To Offer something to someone or something"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Offer"},
   :rdfs/subClassOf :as/Activity})

(def OrderedCollection
  {:db/ident :as/OrderedCollection,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "A variation of Collection in which items are strictly ordered"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "OrderedCollection"},
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
  {:db/ident        :as/OrderedCollectionPage,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value
                     "An ordered subset of items from an OrderedCollection"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "OrderedCollectionPage"},
   :rdfs/subClassOf #{:as/OrderedCollection :as/CollectionPage}})

(def OrderedItems
  {:db/ident        :as/OrderedItems,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "A rdf:List variant for Objects and Links"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "OrderedItems"},
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
  {:db/ident        :as/Organization,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "An Organization"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Organization"},
   :rdfs/subClassOf :as/Object})

(def Page
  {:db/ident        :as/Page,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "A Web Page"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Page"},
   :rdfs/subClassOf :as/Object})

(def Person
  {:db/ident        :as/Person,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "A Person"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Person"},
   :rdfs/subClassOf :as/Object})

(def Place
  {:db/ident        :as/Place,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "A physical or logical location"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Place"},
   :rdfs/subClassOf :as/Object})

(def Profile
  {:db/ident        :as/Profile,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "A Profile Document"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Profile"},
   :rdfs/subClassOf :as/Object})

(def Question
  {:db/ident        :as/Question,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "A question of any sort."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Question"},
   :rdfs/subClassOf :as/IntransitiveActivity})

(def Read
  {:db/ident        :as/Read,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "The actor read the object"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Read"},
   :rdfs/subClassOf :as/Activity})

(def Reject
  {:db/ident        :as/Reject,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Actor rejects the Object"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Reject"},
   :rdfs/subClassOf :as/Activity})

(def Relationship
  {:db/ident :as/Relationship,
   :rdf/type #{:rdf/Statement :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Represents a Social Graph relationship between two Individuals (indicated by the 'a' and 'b' properties)"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Relationship"},
   :rdfs/subClassOf :as/Object})

(def Remove
  {:db/ident        :as/Remove,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "To Remove Something"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Remove"},
   :rdfs/subClassOf :as/Activity})

(def Service
  {:db/ident        :as/Service,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "A service provided by some entity"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Service"},
   :rdfs/subClassOf :as/Object})

(def TentativeAccept
  {:db/ident        :as/TentativeAccept,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Actor tentatively accepts the Object"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "TentativeAccept"},
   :rdfs/subClassOf :as/Accept})

(def TentativeReject
  {:db/ident        :as/TentativeReject,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "Actor tentatively rejects the object"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "TentativeReject"},
   :rdfs/subClassOf :as/Reject})

(def Tombstone
  {:db/ident        :as/Tombstone,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "A placeholder for a deleted object"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Tombstone"},
   :rdfs/subClassOf :as/Object})

(def Travel
  {:db/ident :as/Travel,
   :rdf/type :owl/Class,
   :rdfs/comment
   "The actor is traveling to the target. The origin specifies where the actor is traveling from.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Travel"},
   :rdfs/subClassOf :as/IntransitiveActivity})

(def Undo
  {:db/ident :as/Undo,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "To Undo Something. This would typically be used to indicate that a previous Activity has been undone."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Undo"},
   :rdfs/subClassOf :as/Activity})

(def Update
  {:db/ident        :as/Update,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "To Update/Modify Something"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Update"},
   :rdfs/subClassOf :as/Activity})

(def Video
  {:db/ident        :as/Video,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "A Video document of any kind."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "Video"},
   :rdfs/subClassOf :as/Document})

(def View
  {:db/ident        :as/View,
   :rdf/type        :owl/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "The actor viewed the object"},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "View"},
   :rdfs/subClassOf :as/Activity})

(def accuracy
  {:db/ident :as/accuracy,
   :rdf/type #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies the accuracy around the point established by the longitude and latitude"},
   :rdfs/domain :as/Place,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "accuracy"},
   :rdfs/range {:owl/onDatatype :xsd/float,
                :owl/withRestrictions [{:xsd/minInclusive 0.0M}],
                :rdf/type       :rdfs/Datatype}})

(def actor
  {:db/ident :as/actor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Subproperty of as:attributedTo that identifies the primary actor"},
   :rdfs/domain :as/Activity,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "actor"},
   :rdfs/range {:owl/unionOf [:as/Object :as/Link],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :as/attributedTo})

(def altitude
  {:db/ident     :as/altitude,
   :rdf/type     #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The altitude of a place"},
   :rdfs/domain  :as/Place,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "altitude"},
   :rdfs/range   :xsd/float})

(def anyOf
  {:db/ident :as/anyOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a possible inclusive answer or option for a question."},
   :rdfs/domain :as/Question,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "oneOf"},
   :rdfs/range {:owl/unionOf [:as/Object :as/Link],
                :rdf/type    :owl/Class}})

(def attachment
  {:db/ident    :as/attachment,
   :owl/equivalentProperty :as/attachments,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "attachment"},
   :rdfs/range  {:owl/unionOf [:as/Link :as/Object],
                 :rdf/type    :owl/Class}})

(def attachments
  {:db/ident    :as/attachments,
   :rdf/type    #{:owl/DeprecatedProperty :owl/ObjectProperty},
   :rdfs/domain :as/Object,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "attachments"},
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def attributedTo
  {:db/ident     :as/attributedTo,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Identifies an entity to which an object is attributed"},
   :rdfs/domain  {:owl/unionOf [:as/Object :as/Link],
                  :rdf/type    :owl/Class},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "attributedTo"},
   :rdfs/range   {:owl/unionOf [:as/Object :as/Link],
                  :rdf/type    :owl/Class}})

(def audience
  {:db/ident    :as/audience,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "audience"},
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def author
  {:db/ident :as/author,
   :rdf/type #{:owl/DeprecatedProperty :owl/ObjectProperty},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Identifies the author of an object. Deprecated. Use as:attributedTo instead"},
   :rdfs/domain :as/Object,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "author"},
   :rdfs/range {:owl/unionOf [:as/Object :as/Link],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :as/attributedTo})

(def bcc
  {:db/ident    :as/bcc,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "bcc"},
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def bto
  {:db/ident    :as/bto,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "bto"},
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def cc
  {:db/ident    :as/cc,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "cc"},
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def content
  {:db/ident     :as/content,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The content of the object."},
   :rdfs/domain  :as/Object,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "content"},
   :rdfs/range   {:owl/unionOf [:rdf/langString :xsd/string],
                  :rdf/type    :owl/Class}})

(def context
  {:db/ident :as/context,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies the context within which an object exists or an activity was performed"},
   :rdfs/domain :as/Object,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "context"},
   :rdfs/range {:owl/unionOf [:as/Object :as/Link],
                :rdf/type    :owl/Class}})

(def current
  {:db/ident    :as/current,
   :rdf/type    #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/domain :as/Collection,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "current"},
   :rdfs/range  {:owl/unionOf [:as/CollectionPage :as/Link],
                 :rdf/type    :owl/Class}})

(def deleted
  {:db/ident     :as/deleted,
   :rdf/type     #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Specifies the date and time the object was deleted"},
   :rdfs/domain  :as/Tombstone,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "deleted"},
   :rdfs/range   :xsd/dateTime})

(def describes
  {:db/ident :as/describes,
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "On a Profile object, describes the object described by the profile"},
   :rdfs/domain :as/Profile,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "describes"},
   :rdfs/range :as/Object})

(def downstreamDuplicates
  {:db/ident    :as/downstreamDuplicates,
   :rdf/type    #{:owl/DeprecatedProperty :owl/DatatypeProperty},
   :rdfs/domain :as/Object,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "downstreamDuplicates"},
   :rdfs/range  :xsd/anyURI})

(def duration
  {:db/ident     :as/duration,
   :rdf/type     #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The duration of the object"},
   :rdfs/domain  :as/Object,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "duration"},
   :rdfs/range   :xsd/duration})

(def endTime
  {:db/ident     :as/endTime,
   :rdf/type     #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The ending time of the object"},
   :rdfs/domain  :as/Object,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "endTime"},
   :rdfs/range   :xsd/dateTime})

(def first
  {:db/ident    :as/first,
   :rdf/type    #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/domain :as/Collection,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "first"},
   :rdfs/range  {:owl/unionOf [:as/CollectionPage :as/Link],
                 :rdf/type    :owl/Class}})

(def formerType
  {:db/ident :as/formerType,
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "On a Tombstone object, describes the former type of the deleted object"},
   :rdfs/domain :as/Tombstone,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "formerType"},
   :rdfs/range :as/Object})

(def generator
  {:db/ident    :as/generator,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "generator"},
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def height
  {:db/ident     :as/height,
   :rdf/type     #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The display height expressed as device independent pixels"},
   :rdfs/domain  :as/Link,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "height"},
   :rdfs/range   :xsd/nonNegativeInteger})

(def href
  {:db/ident     :as/href,
   :rdf/type     #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The target URI of the Link"},
   :rdfs/domain  :as/Link,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "href"},
   :rdfs/range   :xsd/anyURI})

(def hreflang
  {:db/ident     :as/hreflang,
   :rdf/type     #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "A hint about the language of the referenced resource"},
   :rdfs/domain  :as/Link,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "hreflang"},
   :rdfs/range   :xsd/language})

(def icon
  {:db/ident    :as/icon,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "icon"},
   :rdfs/range  {:owl/unionOf [:as/Image :as/Link],
                 :rdf/type    :owl/Class}})

(def id
  {:db/ident    :as/id,
   :rdf/type    #{:owl/DeprecatedProperty :owl/DatatypeProperty
                  :owl/FunctionalProperty},
   :rdfs/domain {:owl/unionOf [:as/Link :as/Object],
                 :rdf/type    :owl/Class},
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "id"},
   :rdfs/range  :xsd/anyURI})

(def image
  {:db/ident    :as/image,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "image"},
   :rdfs/range  {:owl/unionOf [:as/Image :as/Link],
                 :rdf/type    :owl/Class}})

(def inReplyTo
  {:db/ident    :as/inReplyTo,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "inReplyTo"},
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def instrument
  {:db/ident :as/instrument,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indentifies an object used (or to be used) to complete an activity"},
   :rdfs/domain :as/Activity,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "instrument"},
   :rdfs/range {:owl/unionOf [:as/Object :as/Link],
                :rdf/type    :owl/Class}})

(def items
  {:db/ident    :as/items,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Collection,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "items"},
   :rdfs/range  {:owl/unionOf [{:owl/unionOf [:as/Object :as/Link],
                                :rdf/type    :owl/Class}
                               :as/OrderedItems],
                 :rdf/type    :owl/Class}})

(def last
  {:db/ident    :as/last,
   :rdf/type    #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/domain :as/Collection,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "last"},
   :rdfs/range  {:owl/unionOf [:as/CollectionPage :as/Link],
                 :rdf/type    :owl/Class}})

(def latitude
  {:db/ident     :as/latitude,
   :rdf/type     #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The latitude"},
   :rdfs/domain  :as/Place,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "latitude"},
   :rdfs/range   :xsd/float})

(def location
  {:db/ident    :as/location,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "location"},
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def longitude
  {:db/ident     :as/longitude,
   :rdf/type     #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The longitude"},
   :rdfs/domain  :as/Place,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "longitude"},
   :rdfs/range   :xsd/float})

(def mediaType
  {:db/ident     :as/mediaType,
   :rdf/type     #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The MIME Media Type"},
   :rdfs/domain  {:owl/unionOf [:as/Link :as/Object],
                  :rdf/type    :owl/Class},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "mediaType"},
   :rdfs/range   :xsd/string})

(def name
  {:db/ident :as/name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The default, plain-text display name of the object or link."},
   :rdfs/domain {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "name"},
   :rdfs/range {:owl/unionOf [:rdf/langString :xsd/string],
                :rdf/type    :owl/Class}})

(def next
  {:db/ident    :as/next,
   :rdf/type    #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/domain :as/CollectionPage,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "next"},
   :rdfs/range  {:owl/unionOf [:as/CollectionPage :as/Link],
                 :rdf/type    :owl/Class}})

(def object
  {:db/ident    :as/object,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:as/Activity :as/Relationship],
                 :rdf/type    :owl/Class},
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "object"},
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def objectType
  {:db/ident    :as/objectType,
   :rdf/type    #{:owl/DeprecatedProperty :owl/DatatypeProperty
                  :owl/FunctionalProperty},
   :rdfs/domain :as/Object,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "objectType"},
   :rdfs/range  :xsd/anyURI})

(def oneOf
  {:db/ident :as/oneOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Describes a possible exclusive answer or option for a question."},
   :rdfs/domain :as/Question,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "oneOf"},
   :rdfs/range {:owl/unionOf [:as/Object :as/Link],
                :rdf/type    :owl/Class}})

(def origin
  {:db/ident :as/origin,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For certain activities, specifies the entity from which the action is directed."},
   :rdfs/domain :as/Activity,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "origin"},
   :rdfs/range {:owl/unionOf [:as/Object :as/Link],
                :rdf/type    :owl/Class}})

(def partOf
  {:db/ident    :as/partOf,
   :rdf/type    #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/domain :as/CollectionPage,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "partOf"},
   :rdfs/range  {:owl/unionOf [:as/Collection :as/Link],
                 :rdf/type    :owl/Class}})

(def prev
  {:db/ident    :as/prev,
   :rdf/type    #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/domain :as/CollectionPage,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "prev"},
   :rdfs/range  {:owl/unionOf [:as/CollectionPage :as/Link],
                 :rdf/type    :owl/Class}})

(def preview
  {:db/ident    :as/preview,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class},
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "preview"},
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def provider
  {:db/ident    :as/provider,
   :rdf/type    #{:owl/DeprecatedProperty :owl/ObjectProperty},
   :rdfs/domain :as/Object,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "provider"},
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def published
  {:db/ident     :as/published,
   :rdf/type     #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Specifies the date and time the object was published"},
   :rdfs/domain  :as/Object,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "published"},
   :rdfs/range   :xsd/dateTime})

(def radius
  {:db/ident :as/radius,
   :rdf/type #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies a radius around the point established by the longitude and latitude"},
   :rdfs/domain :as/Place,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "radius"},
   :rdfs/range {:owl/onDatatype :xsd/float,
                :owl/withRestrictions [{:xsd/minInclusive 0.0M}],
                :rdf/type       :rdfs/Datatype}})

(def rating
  {:db/ident     :as/rating,
   :rdf/type     #{:owl/DeprecatedProperty :owl/DatatypeProperty
                   :owl/FunctionalProperty},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "A numeric rating (>= 0.0, <= 5.0) for the object"},
   :rdfs/domain  :as/Object,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "rating"},
   :rdfs/range   {:owl/onDatatype :xsd/float,
                  :owl/withRestrictions [{:xsd/minInclusive 0.0M}
                                         {:xsd/maxInclusive 5.0M}],
                  :rdf/type       :rdfs/Datatype}})

(def rel
  {:db/ident :as/rel,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The RFC 5988 or HTML5 Link Relation associated with the Link"},
   :rdfs/domain :as/Link,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "rel"},
   :rdfs/range :xsd/string})

(def relationship
  {:db/ident :as/relationship,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "On a Relationship object, describes the type of relationship"},
   :rdfs/domain :as/Relationship,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "relationship"},
   :rdfs/range :rdf/Property,
   :rdfs/subPropertyOf :rdf/predicate})

(def replies
  {:db/ident    :as/replies,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "replies"},
   :rdfs/range  :as/Collection})

(def result
  {:db/ident    :as/result,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Activity,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "result"},
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def startIndex
  {:db/ident :as/startIndex,
   :rdf/type #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "In a strictly ordered logical collection, specifies the index position of the first item in the items list"},
   :rdfs/domain :as/OrderedCollectionPage,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "startIndex"},
   :rdfs/range :xsd/nonNegativeInteger})

(def startTime
  {:db/ident     :as/startTime,
   :rdf/type     #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The starting time of the object"},
   :rdfs/domain  :as/Object,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "startTime"},
   :rdfs/range   :xsd/dateTime})

(def subject
  {:db/ident :as/subject,
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "On a Relationship object, identifies the subject. e.g. when saying \"John is connected to Sally\", 'subject' refers to 'John'"},
   :rdfs/domain :as/Relationship,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "a"},
   :rdfs/range {:owl/unionOf [:as/Link :as/Object],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :rdf/subject})

(def summary
  {:db/ident     :as/summary,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A short summary of the object"},
   :rdfs/domain  :as/Object,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "summary"},
   :rdfs/range   {:owl/unionOf [:rdf/langString :xsd/string],
                  :rdf/type    :owl/Class}})

(def tag
  {:db/ident    :as/tag,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "tag"},
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def tags
  {:db/ident    :as/tags,
   :owl/equivalentProperty :as/tag,
   :rdf/type    #{:owl/DeprecatedProperty :owl/ObjectProperty},
   :rdfs/domain :as/Object,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "tags"},
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def target
  {:db/ident    :as/target,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Activity,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "target"},
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def to
  {:db/ident    :as/to,
   :rdf/type    :owl/ObjectProperty,
   :rdfs/domain :as/Object,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "to"},
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def totalItems
  {:db/ident     :as/totalItems,
   :rdf/type     #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The total number of items in a logical collection"},
   :rdfs/domain  :as/Collection,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "totalItems"},
   :rdfs/range   :xsd/nonNegativeInteger})

(def units
  {:db/ident :as/units,
   :rdf/type #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Identifies the unit of measurement used by the radius, altitude and accuracy properties. The value can be expressed either as one of a set of predefined units or as a well-known common URI that identifies units."},
   :rdfs/domain :as/Place,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "units"},
   :rdfs/range {:owl/unionOf [{:owl/oneOf [{:rdf/value "inches"}
                                           {:rdf/value "feet"}
                                           {:rdf/value "miles"}
                                           {:rdf/value "cm"}
                                           {:rdf/value "m"}
                                           {:rdf/value "km"}],
                               :rdf/type  :rdfs/Datatype}
                              :xsd/anyURI],
                :rdf/type    :rdfs/Datatype}})

(def updated
  {:db/ident     :as/updated,
   :rdf/type     #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Specifies when the object was last updated"},
   :rdfs/domain  :as/Object,
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "updated"},
   :rdfs/range   :xsd/dateTime})

(def upstreamDuplicates
  {:db/ident    :as/upstreamDuplicates,
   :rdf/type    #{:owl/DeprecatedProperty :owl/DatatypeProperty},
   :rdfs/domain :as/Object,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "upstreamDuplicates"},
   :rdfs/range  :xsd/anyURI})

(def url
  {:db/ident :as/url,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Specifies a link to a specific representation of the Object"},
   :rdfs/domain :as/Object,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "url"},
   :rdfs/range {:owl/unionOf [:as/Link :owl/Thing],
                :rdf/type    :owl/Class}})

(def verb
  {:db/ident    :as/verb,
   :rdf/type    #{:owl/DeprecatedProperty :owl/DatatypeProperty
                  :owl/FunctionalProperty},
   :rdfs/domain :as/Activity,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "verb"},
   :rdfs/range  :xsd/anyURI})

(def width
  {:db/ident :as/width,
   :rdf/type #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies the preferred display width of the content, expressed in terms of device independent pixels."},
   :rdfs/domain :as/Link,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "width"},
   :rdfs/range :xsd/nonNegativeInteger})

(def urn:uuid:5340bce5-232c-59ac-a5a4-d7b5472de34f
  {:owl/imports  {:xsd/anyURI "http://www.w3.org/ns/prov#"},
   :rdf/type     :owl/Ontology,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Extended Activity Streams 2.0 Vocabulary"},
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "Activity Streams 2.0"},
   :xsd/anyURI   "http://www.w3.org/ns/activitystreams#"})