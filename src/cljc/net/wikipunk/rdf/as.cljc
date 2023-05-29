(ns net.wikipunk.rdf.as
  "Extended Activity Streams 2.0 Vocabulary"
  {:dcat/downloadURL
   "https://raw.githubusercontent.com/w3c/activitystreams/master/vocabulary/activitystreams2.owl",
   :owl/imports       "http://www.w3.org/ns/prov#",
   :rdf/ns-prefix-map {"as"   "http://www.w3.org/ns/activitystreams#",
                       "owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xml"  "http://www.w3.org/XML/1998/namespace",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "as",
   :rdfa/uri          "http://www.w3.org/ns/activitystreams#",
   :rdfs/comment      #voc/lstr "Extended Activity Streams 2.0 Vocabulary@en",
   :rdfs/isDefinedBy  {:rdf/uri
                       "https://www.w3.org/TR/activitystreams-vocabulary/"},
   :rdfs/label        #voc/lstr "Activity Streams 2.0@en"}
  (:refer-clojure :exclude [first last name next]))

(def Accept
  "Indicates that the actor accepts the object. The target property can be used in certain circumstances to indicate the context into which the object has been accepted."
  {:db/ident        :as/Accept,
   :db/doc          "Indicates that the actor accepts the object. The target property can be used in certain circumstances to indicate the context into which the object has been accepted.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "Actor accepts the Object@en",
   :rdfs/label      #voc/lstr "Accept@en",
   :rdfs/subClassOf [:as/Activity :as/Accept :as/Object]})

(def Activity
  "An Activity is a subtype of Object that describes some form of action that may happen, is currently happening, or has already happened. The Activity type itself serves as an abstract base type for all types of activities. It is important to note that the Activity type itself does not carry any specific semantics about the kind of action being taken."
  {:db/ident        :as/Activity,
   :db/doc          "An Activity is a subtype of Object that describes some form of action that may happen, is currently happening, or has already happened. The Activity type itself serves as an abstract base type for all types of activities. It is important to note that the Activity type itself does not carry any specific semantics about the kind of action being taken.",
   :rdf/type        :owl/Class,
   :rdfs/comment
   #voc/lstr
   "An Object representing some form of Action that has been taken@en",
   :rdfs/label      #voc/lstr "Activity@en",
   :rdfs/subClassOf [:as/Object]})

(def Add
  "Indicates that the actor has added the object to the target. If the target property is not explicitly specified, the target would need to be determined implicitly by context. The origin can be used to identify the context from which the object originated."
  {:db/ident        :as/Add,
   :db/doc          "Indicates that the actor has added the object to the target. If the target property is not explicitly specified, the target would need to be determined implicitly by context. The origin can be used to identify the context from which the object originated.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "To Add an Object or Link to Something@en",
   :rdfs/label      #voc/lstr "Add@en",
   :rdfs/subClassOf [:as/Activity :as/Add :as/Object]})

(def Announce
  "Indicates that the actor is calling the target's attention the object."
  {:db/ident        :as/Announce,
   :db/doc          "Indicates that the actor is calling the target's attention the object.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "Actor announces the object to the target@en",
   :rdfs/label      #voc/lstr "Announce@en",
   :rdfs/subClassOf [:as/Activity :as/Announce :as/Object]})

(def Application
  "Represents a software application of any sort."
  {:db/ident        :as/Application,
   :db/doc          "Describes a software application."
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr
   "Represents a software application of any sort@en",
   :rdfs/label      #voc/lstr "Application@en",
   :rdfs/subClassOf [:as/Object :as/Application]})

(def Arrive
  "An IntransitiveActivity that indicates that the actor has arrived at the location. The origin can be used to identify the context from which the actor originated. The target typically has no defined meaning."
  {:db/ident        :as/Arrive,
   :db/doc          "An IntransitiveActivity that indicates that the actor has arrived at the location. The origin can be used to identify the context from which the actor originated. The target typically has no defined meaning.",
   :rdf/type        :owl/Class,
   :rdfs/comment
   #voc/lstr
   "To Arrive Somewhere (can be used, for instance, to indicate that a particular entity is currently located somewhere, e.g. a \"check-in\")@en",
   :rdfs/label      #voc/lstr "Arrive@en",
   :rdfs/subClassOf [:as/IntransitiveActivity
                     :as/Arrive
                     :as/Object
                     :as/Activity
                     {:owl/maxCardinality 0,
                      :owl/onProperty     :as/object,
                      :rdf/type           :owl/Restriction}]})

(def Article
  "A written work. Typically several paragraphs long. For example, a blog post or a news article."
  {:db/ident        :as/Article,
   :db/doc          "Represents any kind of multi-paragraph written work."
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "A written work. Typically several paragraphs long. For example, a blog post or a news article.@en",
   :rdfs/label      #voc/lstr "Article@en",
   :rdfs/subClassOf [:as/Object]})

(def Audio
  "Represents an audio document of any kind."
  {:db/ident        :as/Audio,
   :db/doc          "Represents an audio document of any kind."
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "An audio file@en",
   :rdfs/label      #voc/lstr "Audio@en",
   :rdfs/subClassOf [:as/Document :as/Audio :as/Object]})

(def Block
  "Indicates that the actor is blocking the object. Blocking is a stronger form of Ignore. The typical use is to support social systems that allow one user to block activities or content of other users. The target and origin typically have no defined meaning."
  {:db/ident        :as/Block,
   :db/doc          "Indicates that the actor is blocking the object. Blocking is a stronger form of Ignore. The typical use is to support social systems that allow one user to block activities or content of other users. The target and origin typically have no defined meaning.",
   :rdf/type        :owl/Class,
   :rdfs/label      #voc/lstr "Block@en",
   :rdfs/subClassOf [:as/Ignore :as/Block :as/Object :as/Activity]})

(def Collection
  "An ordered or unordered collection of Objects or Links"
  {:db/ident        :as/Collection,
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr
   "An ordered or unordered collection of Objects or Links@en",
   :rdfs/label      #voc/lstr "Collection@en",
   :rdfs/subClassOf [:as/Object]})

(def CollectionPage
  "A subset of items from a Collection"
  {:db/ident        :as/CollectionPage,
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "A subset of items from a Collection@en",
   :rdfs/label      #voc/lstr "CollectionPage@en",
   :rdfs/subClassOf [:as/Collection :as/CollectionPage :as/Object]})

(def Create
  "Indicates that the actor has created the object."
  {:db/ident        :as/Create,
   :db/doc          "Indicates that the actor has created the object.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "To Create Something@en",
   :rdfs/label      #voc/lstr "Create@en",
   :rdfs/subClassOf [:as/Activity :as/Create :as/Object]})

(def Delete
  "Indicates that the actor has deleted the object. If specified, the origin indicates the context from which the object was deleted. "
  {:db/ident        :as/Delete,
   :db/doc          "Indicates that the actor has deleted the object. If specified, the origin indicates the context from which the object was deleted. ",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "To Delete Something@en",
   :rdfs/label      #voc/lstr "Delete@en",
   :rdfs/subClassOf [:as/Activity :as/Delete :as/Object]})

(def Dislike
  "Indicates that the actor dislikes the object."
  {:db/ident        :as/Dislike,
   :db/doc          "Indicates that the actor dislikes the object.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "The actor dislikes the object@en",
   :rdfs/label      #voc/lstr "Dislike@en",
   :rdfs/subClassOf [:as/Activity :as/Dislike :as/Object]})

(def Document
  "Represents a digital document/file of any sort."
  {:db/ident        :as/Document,
   :db/doc          "Represents a document of any kind."
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr
   "Represents a digital document/file of any sort@en",
   :rdfs/label      #voc/lstr "Document@en",
   :rdfs/subClassOf [:as/Object :as/Document]})

(def Event
  "Represents any kind of event."
  {:db/ident        :as/Event,
   :db/doc          "Represents any kind of event."
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "An Event of any kind@en",
   :rdfs/label      #voc/lstr "Event@en",
   :rdfs/subClassOf [:as/Object :as/Event]})

(def Flag
  "Indicates that the actor is 'flagging' the object. Flagging is defined in the sense common to many social platforms as reporting content as being inappropriate for any number of reasons."
  {:db/ident        :as/Flag,
   :db/doc          "Indicates that the actor is 'flagging' the object. Flagging is defined in the sense common to many social platforms as reporting content as being inappropriate for any number of reasons.",
   :rdf/type        :owl/Class,
   :rdfs/comment
   #voc/lstr
   "To flag something (e.g. flag as inappropriate, flag as spam, etc)@en",
   :rdfs/label      #voc/lstr "Flag@en",
   :rdfs/subClassOf [:as/Activity :as/Flag :as/Object]})

(def Follow
  "Indicates that the actor is 'following' the object. Following is defined in the sense typically used within Social systems in which the actor is interested in any activity performed by or on the object. The target and origin typically have no defined meaning."
  {:db/ident        :as/Follow,
   :db/doc          "Indicates that the actor is 'following' the object. Following is defined in the sense typically used within Social systems in which the actor is interested in any activity performed by or on the object. The target and origin typically have no defined meaning.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "To Express Interest in Something@en",
   :rdfs/label      #voc/lstr "Follow@en",
   :rdfs/subClassOf [:as/Activity :as/Follow :as/Object]})

(def Group
  "Represents a formal or informal collective of Actors."
  {:db/ident        :as/Group,
   :db/doc          "Represents a formal or informal collective of Actors.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "A Group of any kind.@en",
   :rdfs/label      #voc/lstr "Group@en",
   :rdfs/subClassOf [:as/Object :as/Group]})

(def Ignore
  "Indicates that the actor is ignoring the object. The target and origin typically have no defined meaning."
  {:db/ident        :as/Ignore,
   :db/doc          "Indicates that the actor is ignoring the object. The target and origin typically have no defined meaning.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "Actor is ignoring the Object@en",
   :rdfs/label      #voc/lstr "Ignore@en",
   :rdfs/subClassOf [:as/Activity :as/Ignore :as/Object]})

(def Image
  "An image document of any kind."
  {:db/ident        :as/Image,
   :db/doc          "An image document of any kind.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "An Image file@en",
   :rdfs/label      #voc/lstr "Image@en",
   :rdfs/subClassOf [:as/Document :as/Image :as/Object]})

(def IntransitiveActivity
  "An :as/Activity that has no direct object"
  {:db/ident        :as/IntransitiveActivity,
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "An :as/Activity that has no direct object@en",
   :rdfs/label      #voc/lstr "IntransitiveActivity@en",
   :rdfs/subClassOf [{:owl/maxCardinality 0,
                      :owl/onProperty     :as/object,
                      :rdf/type           :owl/Restriction}
                     :as/Activity
                     :as/IntransitiveActivity
                     :as/Object]})

(def Invite
  "A specialization of Offer in which the actor is extending an invitation for the object to the target."
  {:db/ident        :as/Invite,
   :db/doc          "A specialization of Offer in which the actor is extending an invitation for the object to the target.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "To invite someone or something to something@en",
   :rdfs/label      #voc/lstr "Invite@en",
   :rdfs/subClassOf [:as/Offer :as/Invite :as/Object :as/Activity]})

(def Join
  "Indicates that the actor has joined the object. The target and origin typically have no defined meaning."
  {:db/ident        :as/Join,
   :db/doc          "Indicates that the actor has joined the object. The target and origin typically have no defined meaning.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "To Join Something@en",
   :rdfs/label      #voc/lstr "Join@en",
   :rdfs/subClassOf [:as/Activity :as/Join :as/Object]})

(def Leave
  "Indicates that the actor has left the object. The target and origin typically have no meaning."
  {:db/ident        :as/Leave,
   :db/doc          "Indicates that the actor has left the object. The target and origin typically have no meaning.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "To Leave Something@en",
   :rdfs/label      #voc/lstr "Leave@en",
   :rdfs/subClassOf [:as/Activity :as/Leave :as/Object]})

(def Like
  "Indicates that the actor likes, recommends or endorses the object. The target and origin typically have no defined meaning."
  {:db/ident        :as/Like,
   :db/doc          "Indicates that the actor likes, recommends or endorses the object. The target and origin typically have no defined meaning.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "To Like Something@en",
   :rdfs/label      #voc/lstr "Like@en",
   :rdfs/subClassOf [:as/Activity :as/Like :as/Object]})

(def Link
  "A Link is an indirect, qualified reference to a resource identified by a URL. The fundamental model for links is established by [ RFC5988]. Many of the properties defined by the Activity Vocabulary allow values that are either instances of Object or Link. When a Link is used, it establishes a qualified relation connecting the subject (the containing object) to the resource identified by the href. Properties of the Link are properties of the reference as opposed to properties of the resource."
  {:db/ident         :as/Link,
   :db/doc           "A Link is an indirect, qualified reference to a resource identified by a URL. The fundamental model for links is established by [ RFC5988]. Many of the properties defined by the Activity Vocabulary allow values that are either instances of Object or Link. When a Link is used, it establishes a qualified relation connecting the subject (the containing object) to the resource identified by the href. Properties of the Link are properties of the reference as opposed to properties of the resource.",
   :owl/disjointWith :as/Object,
   :rdf/type         :owl/Class,
   :rdfs/comment
   #voc/lstr
   "Represents a qualified reference to another resource. Patterned after the RFC5988 Web Linking Model@en",
   :rdfs/label       #voc/lstr "Link@en",
   :rdfs/subClassOf  :as/Link})

(def Listen
  "Indicates that the actor has listened to the object."
  {:db/ident        :as/Listen,
   :db/doc          "Indicates that the actor has listened to the object.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "The actor listened to the object@en",
   :rdfs/label      #voc/lstr "Listen@en",
   :rdfs/subClassOf [:as/Activity :as/Object]})

(def Mention
  "A specialized :as/Link that represents an @mention."
  {:db/ident        :as/Mention,
   :db/doc          "A specialized :as/Link that represents an @mention.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr
   "A specialized Link that represents an @mention@en",
   :rdfs/label      #voc/lstr "Mention@en",
   :rdfs/subClassOf [:as/Link]})

(def Move
  "Indicates that the actor has moved object from origin to target. If the origin or target are not specified, either can be determined by context."
  {:db/ident        :as/Move,
   :db/doc          "Indicates that the actor has moved object from origin to target. If the origin or target are not specified, either can be determined by context.",
   :rdf/type        :owl/Class,
   :rdfs/comment
   "The actor is moving the object. The target specifies where the object is moving to. The origin specifies where the object is moving from.",
   :rdfs/label      #voc/lstr "Move@en",
   :rdfs/subClassOf [:as/Activity :as/Move :as/Object]})

(def Note
  "Represents a short written work typically less than a single paragraph in length."
  {:db/ident        :as/Note,
   :db/doc          "Represents a short written work typically less than a single paragraph in length."
   :rdf/type        :owl/Class,
   :rdfs/comment
   #voc/lstr
   "A Short note, typically less than a single paragraph. A \"tweet\" is an example, or a \"status update\"@en",
   :rdfs/label      #voc/lstr "Note@en",
   :rdfs/subClassOf [:as/Object :as/Note]})

(def ObjectClass
  "Describes an object of any kind. The Object type serves as the base type for most of the other kinds of objects defined in the Activity Vocabulary, including other Core types such as :as/Activity, :as/IntransitiveActivity, :as/Collection and :as/OrderedCollection."
  {:db/ident         :as/Object,
   :db/doc           "Describes an object of any kind. The Object type serves as the base type for most of the other kinds of objects defined in the Activity Vocabulary, including other Core types such as :as/Activity, :as/IntransitiveActivity, :as/Collection and :as/OrderedCollection.@en",
   :rdf/type         :owl/Class,
   :rdfs/label       #voc/lstr "Object@en"
   :owl/disjointWith :as/Link})

(def Offer
  "Indicates that the actor is offering the object. If specified, the target indicates the entity to which the object is being offered."
  {:db/ident        :as/Offer,
   :db/doc          "Indicates that the actor is offering the object. If specified, the target indicates the entity to which the object is being offered.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "To Offer something to someone or something@en",
   :rdfs/label      #voc/lstr "Offer@en",
   :rdfs/subClassOf [:as/Activity :as/Offer :as/Object]})

(def OrderedCollection
  "A variation of :as/Collection in which items are strictly ordered"
  {:db/ident        :as/OrderedCollection,
   :rdf/type        :owl/Class,
   :rdfs/comment
   #voc/lstr "A variation of Collection in which items are strictly ordered@en",
   :rdfs/label      #voc/lstr "OrderedCollection@en",
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
                                            :rdf/type       :owl/Restriction}],
                      :rdf/type           :owl/Class}
                     :as/OrderedCollection]})

(def OrderedCollectionPage
  "An ordered subset of items from an OrderedCollection"
  {:db/ident        :as/OrderedCollectionPage,
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr
   "An ordered subset of items from an OrderedCollection@en",
   :rdfs/label      #voc/lstr "OrderedCollectionPage@en",
   :rdfs/subClassOf [:as/CollectionPage
                     :as/OrderedCollection
                     :as/OrderedCollectionPage
                     :as/Collection
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
                                            :rdf/type       :owl/Restriction}],
                      :rdf/type           :owl/Class}]})

(def OrderedItems
  "A rdf:List variant for Objects and Links"
  {:db/ident        :as/OrderedItems,
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "A rdf:List variant for Objects and Links@en",
   :rdfs/label      #voc/lstr "OrderedItems@en",
   :rdfs/subClassOf [{:owl/intersectionOf [:rdf/List
                                           {:owl/allValuesFrom {:owl/unionOf
                                                                [:as/Object
                                                                 :as/Link],
                                                                :rdf/type
                                                                :owl/Class},
                                            :owl/onProperty    :rdf/first,
                                            :rdf/type          :owl/Restriction}
                                           {:owl/allValuesFrom :as/OrderedItems,
                                            :owl/onProperty    :rdf/rest,
                                            :rdf/type          :owl/Restriction}],
                      :rdf/type           :owl/Class}
                     :as/OrderedItems]})

(def Organization
  "Represents an organization."
  {:db/ident        :as/Organization,
   :db/doc          "Represents an organization.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "An Organization@en",
   :rdfs/label      #voc/lstr "Organization@en",
   :rdfs/subClassOf [:as/Object :as/Organization]})

(def Page
  "Represents a web page."
  {:db/ident        :as/Page,
   :db/doc          "Represents a web page.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "A Web Page@en",
   :rdfs/label      #voc/lstr "Page@en",
   :rdfs/subClassOf [:as/Object :as/Page]})

(def Person
  "Represents an individual person."
  {:db/ident        :as/Person,
   :db/doc          "Represents an individual person.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "A Person@en",
   :rdfs/label      #voc/lstr "Person@en",
   :rdfs/subClassOf [:as/Object :as/Person]})

(def Place
  "The :as/Place object is used to represent both physical and logical locations. It is intentionally flexible. It can be used to identify a location by :as/name or by :as/longitude and :as/latitude. It can also describe an area around a given point using the :as/radius property, the :as/altitude of the location, and a degree of :as/accuracy."
  {:db/ident        :as/Place,
   :db/doc          "The :as/Place object is used to represent both physical and logical locations. It is intentionally flexible. It can be used to identify a location by :as/name or by :as/longitude and :as/latitude. It can also describe an area around a given point using the :as/radius property, the :as/altitude of the location, and a degree of :as/accuracy.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "A physical or logical location@en",
   :rdfs/label      #voc/lstr "Place@en",
   :rdfs/subClassOf [:as/Object :as/Place]})

(def Profile
  "A :as/Profile is a content object that describes another :as/Object, typically used to describe Actor Type objects. The :as/describes property is used to reference the object being described by the profile."
  {:db/ident        :as/Profile,
   :db/doc          "A :as/Profile is a content object that describes another :as/Object, typically used to describe Actor Type objects. The :as/describes property is used to reference the object being described by the profile.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "A Profile Document@en",
   :rdfs/label      #voc/lstr "Profile@en",
   :rdfs/subClassOf [:as/Object :as/Profile]})

(def Question
  "Represents a question being asked. Question objects are an extension of :as/IntransitiveActivity. That is, the :as/Question object is an :as/Activity, but the direct object is the question itself and therefore it would not contain an object property.

  Either of the :as/anyOf and :as/oneOf properties MAY be used to express possible answers, but a :as/Question object MUST NOT have both properties."
  {:db/ident        :as/Question,
   :db/doc          "Represents a question being asked. Question objects are an extension of :as/IntransitiveActivity. That is, the :as/Question object is an :as/Activity, but the direct object is the question itself and therefore it would not contain an object property. Either of the :as/anyOf and :as/oneOf properties MAY be used to express possible answers, but a :as/Question object MUST NOT have both properties.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "A question of any sort.@en",
   :rdfs/label      #voc/lstr "Question@en",
   :rdfs/subClassOf [:as/IntransitiveActivity
                     :as/Question
                     :as/Object
                     :as/Activity
                     {:owl/maxCardinality 0,
                      :owl/onProperty     :as/object,
                      :rdf/type           :owl/Restriction}]})

(def Read
  "Indicates that the actor has read the object."
  {:db/ident        :as/Read,
   :db/doc          "Indicates that the actor has read the object.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "The actor read the object@en",
   :rdfs/label      #voc/lstr "Read@en",
   :rdfs/subClassOf [:as/Activity :as/Read :as/Object]})

(def Reject
  "Indicates that the actor is rejecting the object. The target and origin typically have no defined meaning."
  {:db/ident        :as/Reject,
   :db/doc          "Indicates that the actor is rejecting the object. The target and origin typically have no defined meaning.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "Actor rejects the Object@en",
   :rdfs/label      #voc/lstr "Reject@en",
   :rdfs/subClassOf [:as/Activity :as/Reject :as/Object]})

(def Relationship
  "Describes a :as/relationship between two individuals. The :as/subject and :as/object properties are used to identify the connected individuals."
  {:db/ident        :as/Relationship,
   :db/doc          "Describes a :as/relationship between two individuals. The :as/subject and :as/object properties are used to identify the connected individuals.",
   :rdf/type        [:rdf/Statement :owl/Class],
   :rdfs/comment
   #voc/lstr
   "Represents a Social Graph relationship between two Individuals (indicated by the 'a' and 'b' properties)@en",
   :rdfs/label      #voc/lstr "Relationship@en",
   :rdfs/subClassOf [:as/Object]})

(def Remove
  "Indicates that the actor is removing the object. If specified, the origin indicates the context from which the object is being removed."
  {:db/ident        :as/Remove,
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "To Remove Something@en",
   :rdfs/label      #voc/lstr "Remove@en",
   :rdfs/subClassOf [:as/Activity :as/Remove :as/Object]})

(def Service
  "Represents a service of any kind."
  {:db/ident        :as/Service,
   :db/doc          "Represents a service of any kind.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "A service provided by some entity@en",
   :rdfs/label      #voc/lstr "Service@en",
   :rdfs/subClassOf [:as/Object :as/Service]})

(def TentativeAccept
  "Actor tentatively accepts the Object"
  {:db/ident        :as/TentativeAccept,
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "Actor tentatively accepts the Object@en",
   :rdfs/label      #voc/lstr "TentativeAccept@en",
   :rdfs/subClassOf [:as/Accept :as/TentativeAccept :as/Object :as/Activity]})

(def TentativeReject
  "A specialization of :as/Reject in which the rejection is considered tentative."
  {:db/ident        :as/TentativeReject,
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "Actor tentatively rejects the object@en",
   :rdfs/label      #voc/lstr "TentativeReject@en",
   :rdfs/subClassOf [:as/Reject :as/TentativeReject :as/Object :as/Activity]})

(def Tombstone
  "A :as/Tombstone represents a content object that has been deleted. It can be used in Collections to signify that there used to be an object at this position, but it has been deleted."
  {:db/ident        :as/Tombstone,
   :db/doc          "A :as/Tombstone represents a content object that has been deleted. It can be used in Collections to signify that there used to be an object at this position, but it has been deleted.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "A placeholder for a deleted object@en",
   :rdfs/label      #voc/lstr "Tombstone@en",
   :rdfs/subClassOf [:as/Object :as/Tombstone]})

(def Travel
  "Indicates that the actor is traveling to target from origin. Travel is an :as/IntransitiveObject whose actor specifies the direct object. If the target or origin are not specified, either can be determined by context."
  {:db/ident        :as/Travel,
   :db/doc          "Indicates that the actor is traveling to target from origin. Travel is an :as/IntransitiveObject whose actor specifies the direct object. If the target or origin are not specified, either can be determined by context.",
   :rdf/type        :owl/Class,
   :rdfs/comment
   "The actor is traveling to the target. The origin specifies where the actor is traveling from.",
   :rdfs/label      #voc/lstr "Travel@en",
   :rdfs/subClassOf [:as/IntransitiveActivity
                     :as/Travel
                     :as/Object
                     :as/Activity
                     {:owl/maxCardinality 0,
                      :owl/onProperty     :as/object,
                      :rdf/type           :owl/Restriction}]})

(def Undo
  "Indicates that the actor is undoing the object. In most cases, the object will be an Activity describing some previously performed action (for instance, a person may have previously 'liked' an article but, for whatever reason, might choose to undo that like at some later point in time)."
  {:db/ident        :as/Undo,
   :db/doc          "Indicates that the actor is undoing the object. In most cases, the object will be an Activity describing some previously performed action (for instance, a person may have previously 'liked' an article but, for whatever reason, might choose to undo that like at some later point in time).",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "To Undo Something. This would typically be used to indicate that a previous Activity has been undone.@en",
   :rdfs/label      #voc/lstr "Undo@en",
   :rdfs/subClassOf [:as/Activity :as/Undo :as/Object]})

(def Update
  "Indicates that the actor has updated the object. Note, however, that this vocabulary does not define a mechanism for describing the actual set of modifications made to object. However, in the context of a Linked Data Platform using Datomic the modifications can be looked up using the Datomic transaction log."
  {:db/ident        :as/Update,
   :db/doc          "Indicates that the actor has updated the object. Note, however, that this vocabulary does not define a mechanism for describing the actual set of modifications made to object.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "To Update/Modify Something@en",
   :rdfs/label      #voc/lstr "Update@en",
   :rdfs/subClassOf [:as/Activity :as/Update :as/Object]})

(def Video
  "A Video document of any kind."
  {:db/ident        :as/Video,
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "A Video document of any kind.@en",
   :rdfs/label      #voc/lstr "Video@en",
   :rdfs/subClassOf [:as/Document :as/Video :as/Object]})

(def View
  "Indicates that the actor has viewed the object."
  {:db/ident        :as/View,
   :db/doc          "Indicates that the actor has viewed the object.",
   :rdf/type        :owl/Class,
   :rdfs/comment    #voc/lstr "The actor viewed the object@en",
   :rdfs/label      #voc/lstr "View@en",
   :rdfs/subClassOf [:as/Activity :as/View :as/Object]})

(def accuracy
  "Indicates the accuracy of position coordinates on a Place objects. Expressed in properties of percentage. e.g. '94.0' means '94.0% accurate'."
  {:db/ident       :as/accuracy,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/float,
   :db/doc         "Indicates the accuracy of position coordinates on a Place objects. Expressed in properties of percentage. e.g. '94.0' means '94.0% accurate'.",
   :rdf/type       [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   #voc/lstr
   "Specifies the accuracy around the point established by the longitude and latitude@en",
   :rdfs/domain    :as/Place,
   :rdfs/label     #voc/lstr "accuracy@en",
   :rdfs/range     {:owl/onDatatype       :xsd/float,
                    :owl/withRestrictions [{:xsd/minInclusive 0.0}],
                    :rdf/type             :rdfs/Datatype}})

(def actor
  "Describes one or more entities that either performed or are expected to perform the activity. Any single activity can have multiple actors. The actor MAY be specified using an indirect Link."
  {:db/ident           :as/actor,
   :db/cardinality     :db.cardinality/many,
   :db/valueType       :db.type/ref,
   :db/doc             "Describes one or more entities that either performed or are expected to perform the activity. Any single activity can have multiple actors. The actor MAY be specified using an indirect Link.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
   "Subproperty of as:attributedTo that identifies the primary actor@en",
   :rdfs/domain        :as/Activity,
   :rdfs/label         #voc/lstr "actor@en",
   :rdfs/range         {:owl/unionOf [:as/Object :as/Link],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf [:as/attributedTo :as/actor]})

(def altitude   
  "Indicates the altitude of a place. The measurement units is indicated using the units property. If units is not specified, the default is assumed to be 'm' indicating meters."
  {:db/ident       :as/altitude,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/float,
   :db/doc         "Indicates the altitude of a place. The measurement units is indicated using the units property. If units is not specified, the default is assumed to be 'm' indicating meters.",
   :rdf/type       [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment   #voc/lstr "The altitude of a place@en",
   :rdfs/domain    :as/Place,
   :rdfs/label     #voc/lstr "altitude@en",
   :rdfs/range     :xsd/float})

(def anyOf
  "Identifies an inclusive option for a Question. Use of anyOf implies that the Question can have multiple answers. To indicate that a Question can have only one answer, use oneOf."
  {:db/ident       :as/anyOf,
   :db/cardinality :db.cardinality/many,
   :db/valueType   :db.type/ref,
   :db/doc         "Identifies an inclusive option for a Question. Use of anyOf implies that the Question can have multiple answers. To indicate that a Question can have only one answer, use oneOf.",
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
   "Describes a possible inclusive answer or option for a question.@en",
   :rdfs/domain    :as/Question,
   :rdfs/label     #voc/lstr "oneOf@en",
   :rdfs/range     {:owl/unionOf [:as/Object :as/Link],
                    :rdf/type    :owl/Class}})

(def attachment
  "Identifies a resource attached or related to an object that potentially requires special handling. The intent is to provide a model that is at least semantically similar to attachments in email. "
  {:db/ident               :as/attachment,
   :db/cardinality         :db.cardinality/many,
   :db/valueType           :db.type/ref,
   :db/doc                 "Identifies a resource attached or related to an object that potentially requires special handling. The intent is to provide a model that is at least semantically similar to attachments in email. ",
   :owl/equivalentProperty :as/attachments,
   :rdf/type               :owl/ObjectProperty,
   :rdfs/domain            :as/Object,
   :rdfs/label             #voc/lstr "attachment@en",
   :rdfs/range             {:owl/unionOf [:as/Link :as/Object],
                            :rdf/type    :owl/Class}})

(def attachments
  "attachments"
  {:db/ident    :as/attachments,
   :rdf/type    [:owl/DeprecatedProperty :owl/ObjectProperty],
   :rdfs/domain :as/Object,
   :rdfs/label  #voc/lstr "attachments@en",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def attributedTo
  "Identifies one or more entities to which this object is attributed. The attributed entities might not be Actors. For instance, an object might be attributed to the completion of another activity."
  {:db/ident       :as/attributedTo,
   :db/cardinality :db.cardinality/many,
   :db/valueType   :db.type/ref,
   :db/doc         "Identifies one or more entities to which this object is attributed. The attributed entities might not be Actors. For instance, an object might be attributed to the completion of another activity.",
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   #voc/lstr "Identifies an entity to which an object is attributed@en",
   :rdfs/domain    {:owl/unionOf [:as/Object :as/Link],
                    :rdf/type    :owl/Class},
   :rdfs/label     #voc/lstr "attributedTo@en",
   :rdfs/range     {:owl/unionOf [:as/Object :as/Link],
                    :rdf/type    :owl/Class}})

(def audience
  "Identifies one or more entities that represent the total population of entities for which the object can considered to be relevant."
  {:db/ident       :as/audience,
   :db/cardinality :db.cardinality/many,
   :db/valueType   :db.type/ref,
   :db/doc         "Identifies one or more entities that represent the total population of entities for which the object can considered to be relevant.",
   :rdf/type       :owl/ObjectProperty,
   :rdfs/domain    :as/Object,
   :rdfs/label     #voc/lstr "audience@en",
   :rdfs/range     {:owl/unionOf [:as/Object :as/Link],
                    :rdf/type    :owl/Class}})

(def author
  "Identifies the author of an object. Deprecated. Use as:attributedTo instead"
  {:db/ident           :as/author,
   :rdf/type           [:owl/DeprecatedProperty :owl/ObjectProperty],
   :rdfs/comment
   #voc/lstr
   "Identifies the author of an object. Deprecated. Use as:attributedTo instead@en",
   :rdfs/domain        :as/Object,
   :rdfs/label         #voc/lstr "author@en",
   :rdfs/range         {:owl/unionOf [:as/Object :as/Link],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf [:as/attributedTo :as/author]})

(def bcc
  "Identifies one or more Objects that are part of the private secondary audience of this Object. "
  {:db/ident       :as/bcc,
   :db/cardinality :db.cardinality/many,
   :db/valueType   :db.type/ref,
   :db/doc         "Identifies one or more Objects that are part of the private secondary audience of this Object. ",
   :rdf/type       :owl/ObjectProperty,
   :rdfs/domain    :as/Object,
   :rdfs/label     #voc/lstr "bcc@en",
   :rdfs/range     {:owl/unionOf [:as/Object :as/Link],
                    :rdf/type    :owl/Class}})

(def bto
  "Identifies an Object that is part of the private primary audience of this Object."
  {:db/ident       :as/bto,
   :db/cardinality :db.cardinality/many,
   :db/valueType   :db.type/ref,
   :db/doc         "Identifies an Object that is part of the private primary audience of this Object.",
   :rdf/type       :owl/ObjectProperty,
   :rdfs/domain    :as/Object,
   :rdfs/label     #voc/lstr "bto@en",
   :rdfs/range     {:owl/unionOf [:as/Object :as/Link],
                    :rdf/type    :owl/Class}})

(def cc
  "Identifies an Object that is part of the public secondary audience of this Object."
  {:db/ident       :as/cc,
   :db/cardinality :db.cardinality/many,
   :db/valueType   :db.type/ref,
   :db/doc         "Identifies an Object that is part of the public secondary audience of this Object.",
   :rdf/type       :owl/ObjectProperty,
   :rdfs/domain    :as/Object,
   :rdfs/label     #voc/lstr "cc@en",
   :rdfs/range     {:owl/unionOf [:as/Object :as/Link],
                    :rdf/type    :owl/Class}})

(def closed
  "Indicates that a question has been closed, and answers are no longer accepted."
  {:db/ident       :as/closed,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/boolean,
   :db/doc         "Indicates that a question has been closed, and answers are no longer accepted.",
   :rdf/type       :owl/ObjectProperty,
   :rdfs/domain    :as/Question,
   :rdfs/label     #voc/lstr "closed@en",
   :rdfs/range     {:owl/unionOf [:as/Object :as/Link :xsd/boolean :xsd/dateTime],
                    :rdf/type    :owl/Class}})

(def content
  "The content or textual representation of the Object encoded by default as an EDN string. The mediaType property can be used in the object to indicate a different content type."
  {:db/ident       :as/content,   
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/string,
   :db/doc         "The content or textual representation of the Object encoded by default as an EDN string. The mediaType property can be used in the object to indicate a different content type.",
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   #voc/lstr "The content of the object.@en",
   :rdfs/domain    :as/Object,
   :rdfs/label     #voc/lstr "content@en",
   :rdfs/range     {:owl/unionOf [:rdf/langString :xsd/string],
                    :rdf/type    :owl/Class}})

(def context
  "Identifies the context within which the object exists or an activity was performed. 

  The notion of 'context' used is intentionally vague. The intended function is to serve as a means of grouping objects and activities that share a common originating context or purpose. An example could be all activities relating to a common project or event."
  {:db/ident       :as/context,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/ref,
   :db/doc         "Identifies the context within which the object exists or an activity was performed. The notion of 'context' used is intentionally vague. The intended function is to serve as a means of grouping objects and activities that share a common originating context or purpose. An example could be all activities relating to a common project or event.",
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
   "Specifies the context within which an object exists or an activity was performed@en",
   :rdfs/domain    :as/Object,
   :rdfs/label     #voc/lstr "context@en",
   :rdfs/range     {:owl/unionOf [:as/Object :as/Link],
                    :rdf/type    :owl/Class}})

(def current
  "In a paged Collection, indicates the page that contains the most recently updated member items."
  {:db/ident       :as/current,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/ref,
   :db/doc         "In a paged Collection, indicates the page that contains the most recently updated member items.",
   :rdf/type       [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/domain    :as/Collection,
   :rdfs/label     #voc/lstr "current@en",
   :rdfs/range     {:owl/unionOf [:as/CollectionPage :as/Link],
                    :rdf/type    :owl/Class}})

(def deleted
  "On a Tombstone object, the deleted property is a timestamp for when the object was deleted."
  {:db/ident       :as/deleted,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/instant,
   :db/doc         "On a Tombstone object, the deleted property is a timestamp for when the object was deleted.",
   :rdf/type       [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment   #voc/lstr
   "Specifies the date and time the object was deleted@en",
   :rdfs/domain    :as/Tombstone,
   :rdfs/label     #voc/lstr "deleted@en",
   :rdfs/range     :xsd/dateTime})

(def describes
  "On a Profile object, the describes property identifies the object described by the Profile."
  {:db/ident       :as/describes,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/ref,
   :db/doc         "On a Profile object, the describes property identifies the object described by the Profile.",
   :rdf/type       [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment
   #voc/lstr
   "On a Profile object, describes the object described by the profile@en",
   :rdfs/domain    :as/Profile,
   :rdfs/label     #voc/lstr "describes@en",
   :rdfs/range     :as/Object})

(def downstreamDuplicates
  "downstreamDuplicates"
  {:db/ident    :as/downstreamDuplicates,
   :rdf/type    [:owl/DeprecatedProperty :owl/DatatypeProperty],
   :rdfs/domain :as/Object,
   :rdfs/label  #voc/lstr "downstreamDuplicates@en",
   :rdfs/range  :xsd/anyURI})

(def duration
  "When the object describes a time-bound resource, such as an audio or video, a meeting, etc, the duration property indicates the object's approximate duration. The value MUST be expressed as an xsd:duration as defined by [ xmlschema11-2], section 3.3.6 (e.g. a period of 5 seconds is represented as \"PT5S\"). "
  {:db/ident       :as/duration,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/string,
   :db/doc         "When the object describes a time-bound resource, such as an audio or video, a meeting, etc, the duration property indicates the object's approximate duration. The value MUST be expressed as an xsd:duration as defined by [ xmlschema11-2], section 3.3.6 (e.g. a period of 5 seconds is represented as \"PT5S\"). ",
   :rdf/type       [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment   #voc/lstr "The duration of the object@en",
   :rdfs/domain    :as/Object,
   :rdfs/label     #voc/lstr "duration@en",
   :rdfs/range     :xsd/duration})

(def endTime
  "The date and time describing the actual or expected ending time of the object. When used with an Activity object, for instance, the endTime property specifies the moment the activity concluded or is expected to conclude."
  {:db/ident       :as/endTime,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/instant,
   :db/doc         "The date and time describing the actual or expected ending time of the object. When used with an Activity object, for instance, the endTime property specifies the moment the activity concluded or is expected to conclude.",
   :rdf/type       [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment   #voc/lstr "The ending time of the object@en",
   :rdfs/domain    :as/Object,
   :rdfs/label     #voc/lstr "endTime@en",
   :rdfs/range     :xsd/dateTime})

(def first
  "In a paged Collection, indicates the furthest preceeding page of items in the collection. "
  {:db/ident       :as/first,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/ref,
   :db/doc         "In a paged Collection, indicates the furthest preceeding page of items in the collection. ",
   :db/isComponent true,
   :rdf/type       [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/domain    :as/Collection,
   :rdfs/label     #voc/lstr "first@en",
   :rdfs/range     {:owl/unionOf [:as/CollectionPage :as/Link],
                    :rdf/type    :owl/Class}})

(def formerType
  "On a Tombstone object, describes the former type of the deleted object"
  {:db/ident       :as/formerType,
   :db/cardinality :db.cardinality/many,
   :db/valueType   :db.type/ref,
   :db/doc         "On a Tombstone object, describes the former type of the deleted object",
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
   "On a Tombstone object, describes the former type of the deleted object@en",
   :rdfs/domain    :as/Tombstone,
   :rdfs/label     #voc/lstr "formerType@en",
   :rdfs/range     :as/Object})

(def generator
  "Identifies the entity (e.g. an application) that generated the object."
  {:db/ident       :as/generator,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/ref,
   :db/doc         "Identifies the entity (e.g. an application) that generated the object.",
   :rdf/type       :owl/ObjectProperty,
   :rdfs/domain    :as/Object,
   :rdfs/label     #voc/lstr "generator@en",
   :rdfs/range     {:owl/unionOf [:as/Object :as/Link],
                    :rdf/type    :owl/Class}})

(def height
  "On a Link, specifies a hint as to the rendering height in device-independent pixels of the linked resource."
  {:db/ident       :as/height,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/long,
   :db/doc         "On a Link, specifies a hint as to the rendering height in device-independent pixels of the linked resource.",
   :rdf/type       [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   #voc/lstr "The display height expressed as device independent pixels@en",
   :rdfs/domain    :as/Link,
   :rdfs/label     #voc/lstr "height@en",
   :rdfs/range     :xsd/nonNegativeInteger})

(def href
  "The target resource pointed to by a Link."
  {:db/ident       :as/href,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/string,
   :db/doc         "The target resource pointed to by a Link.",
   :rdf/type       [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment   #voc/lstr "The target URI of the Link@en",
   :rdfs/domain    :as/Link,
   :rdfs/label     #voc/lstr "href@en",
   :rdfs/range     :xsd/anyURI})

(def hreflang
  "A hint about the language of the referenced resource"
  {:db/ident       :as/hreflang,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/string,
   :db/doc         "A hint about the language of the referenced resource",
   :rdf/type       [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment   #voc/lstr
   "A hint about the language of the referenced resource@en",
   :rdfs/domain    :as/Link,
   :rdfs/label     #voc/lstr "hreflang@en",
   :rdfs/range     :xsd/language})

(def icon
  "Indicates an entity that describes an icon for this object. The image should have an aspect ratio of one (horizontal) to one (vertical) and should be suitable for presentation at a small size."
  {:db/ident       :as/icon,
   :db/cardinality :db.cardinality/many,
   :db/valueType   :db.type/ref,
   :db/doc         "Indicates an entity that describes an icon for this object. The image should have an aspect ratio of one (horizontal) to one (vertical) and should be suitable for presentation at a small size.",
   :rdf/type       :owl/ObjectProperty,
   :rdfs/domain    :as/Object,
   :rdfs/label     #voc/lstr "icon@en",
   :rdfs/range     {:owl/unionOf [:as/Image :as/Link],
                    :rdf/type    :owl/Class}})

(def id
  "Provides the globally unique identifier for an Object or Link."
  {:db/ident       :as/id,
   :db/cardinality :db.cardinality/one
   :db/valueType   :db.type/ref
   :db/unique      :db.unique/identity
   :db/doc         "Provides the globally unique identifier for an Object or Link."
   :rdf/type       [:owl/FunctionalProperty
                    :owl/DatatypeProperty],
   :rdfs/domain    {:owl/unionOf [:as/Link :as/Object],
                    :rdf/type    :owl/Class},
   :rdfs/label     #voc/lstr "id@en",
   :rdfs/range     :xsd/anyURI})

(def image
  "Indicates an entity that describes an image for this object. Unlike the icon property, there are no aspect ratio or display size limitations assumed."
  {:db/ident       :as/image,
   :db/cardinality :db.cardinality/many,
   :db/valueType   :db.type/ref,
   :db/doc         "Indicates an entity that describes an image for this object. Unlike the icon property, there are no aspect ratio or display size limitations assumed.",
   :rdf/type       :owl/ObjectProperty,
   :rdfs/domain    :as/Object,
   :rdfs/label     #voc/lstr "image@en",
   :rdfs/range     {:owl/unionOf [:as/Image :as/Link],
                    :rdf/type    :owl/Class}})

(def inReplyTo
  "Indicates one or more entities for which this object is considered a response. "
  {:db/ident       :as/inReplyTo,
   :db/cardinality :db.cardinality/many,
   :db/valueType   :db.type/ref,
   :db/doc         "Indicates one or more entities for which this object is considered a response.",
   :rdf/type       :owl/ObjectProperty,
   :rdfs/domain    :as/Object,
   :rdfs/label     #voc/lstr "inReplyTo@en",
   :rdfs/range     {:owl/unionOf [:as/Object :as/Link],
                    :rdf/type    :owl/Class}})

(def instrument
  "Identifies one or more objects used (or to be used) in the completion of an Activity."
  {:db/ident       :as/instrument,
   :db/cardinality :db.cardinality/many,
   :db/valueType   :db.type/ref,
   :db/doc         "Identifies one or more objects used (or to be used) in the completion of an Activity.",
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
   "Indentifies an object used (or to be used) to complete an activity@en",
   :rdfs/domain    :as/Activity,
   :rdfs/label     #voc/lstr "instrument@en",
   :rdfs/range     {:owl/unionOf [:as/Object :as/Link],
                    :rdf/type    :owl/Class}})

(def items
  "Identifies the items contained in a collection. The items might be ordered or unordered."
  {:db/ident       :as/items,
   :db/cardinality :db.cardinality/many,
   :db/valueType   :db.type/ref,
   :db/doc         "Identifies the items contained in a collection. The items might be ordered or unordered.",
   :rdf/type       :owl/ObjectProperty,
   :rdfs/domain    :as/Collection,
   :rdfs/label     #voc/lstr "items@en",
   :rdfs/range     {:owl/unionOf [{:owl/unionOf [:as/Object :as/Link],
                                   :rdf/type    :owl/Class}
                                  :as/OrderedItems],
                    :rdf/type    :owl/Class}})

(def last
  "In a paged Collection, indicates the furthest proceeding page of the collection."
  {:db/ident       :as/last,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/ref,
   :db/doc         "In a paged Collection, indicates the furthest proceeding page of the collection.",
   :rdf/type       [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/domain    :as/Collection,
   :rdfs/label     #voc/lstr "last@en",
   :rdfs/range     {:owl/unionOf [:as/CollectionPage :as/Link],
                    :rdf/type    :owl/Class}})

(def latitude
  "The latitude of a place."
  {:db/ident       :as/latitude,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/float,
   :db/doc         "The latitude of a place.",
   :rdf/type       [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment   #voc/lstr "The latitude@en",
   :rdfs/domain    :as/Place,
   :rdfs/label     #voc/lstr "latitude@en",
   :rdfs/range     :xsd/float})

(def location
  "Indicates one or more physical or logical locations associated with the object."
  {:db/ident       :as/location,
   :db/cardinality :db.cardinality/many,
   :db/valueType   :db.type/ref,
   :db/doc         "Indicates one or more physical or logical locations associated with the object.",
   :rdf/type       :owl/ObjectProperty,
   :rdfs/domain    :as/Object,
   :rdfs/label     #voc/lstr "location@en",
   :rdfs/range     {:owl/unionOf [:as/Object :as/Link],
                    :rdf/type    :owl/Class}})

(def longitude
  "The longitude of a place."
  {:db/ident       :as/longitude,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/float,
   :db/doc         "The longitude of a place.",
   :rdf/type       [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment   #voc/lstr "The longitude@en",
   :rdfs/domain    :as/Place,
   :rdfs/label     #voc/lstr "longitude@en",
   :rdfs/range     :xsd/float})

(def mediaType
  "When used on a Link, identifies the MIME media type of the referenced resource.

  When used on an Object, identifies the MIME media type of the value of the content property. If not specified, the content property is assumed to contain application/edn content.

  NOTE: In the standard the default content is text/html."
  {:db/ident       :as/mediaType,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/string,
   :db/doc         "When used on a Link, identifies the MIME media type of the referenced resource. When used on an Object, identifies the MIME media type of the value of the content property. If not specified, the content property is assumed to contain application/edn content. NOTE: In the standard the default content is text/html.",
   :rdf/type       [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment   #voc/lstr "The MIME Media Type@en",
   :rdfs/domain    {:owl/unionOf [:as/Link :as/Object],
                    :rdf/type    :owl/Class},
   :rdfs/label     #voc/lstr "mediaType@en",
   :rdfs/range     :xsd/string})

(def name
  "A simple, human-readable, plain-text name for the object. HTML markup MUST NOT be included. The name MAY be expressed using multiple language-tagged values."
  {:db/ident       :as/name,
   :db/cardinality :db.cardinality/many,
   :db/valueType   :db.type/string,
   :db/doc         "A simple, human-readable, plain-text name for the object. HTML markup MUST NOT be included. The name MAY be expressed using multiple language-tagged values.",
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/domain    {:owl/unionOf [:as/Object :as/Link],
                    :rdf/type    :owl/Class},
   :rdfs/label     #voc/lstr "name@en",
   :rdfs/name      #voc/lstr
   "The default, plain-text display name of the object or link.@en",
   :rdfs/range     {:owl/unionOf [:rdf/langString :xsd/string],
                    :rdf/type    :owl/Class}})

(def next
  "In a paged Collection, indicates the next page of items."
  {:db/ident       :as/next,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/ref,
   :db/doc         "In a paged Collection, indicates the next page of items.",
   :rdf/type       [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/domain    :as/CollectionPage,
   :rdfs/label     #voc/lstr "next@en",
   :rdfs/range     {:owl/unionOf [:as/CollectionPage :as/Link],
                    :rdf/type    :owl/Class}})

(def object       
  "When used within an Activity, describes the direct object of the activity. For instance, in the activity 'John added a movie to his wishlist', the object of the activity is the movie added.

  When used within a Relationship describes the entity to which the subject is related."
  {:db/ident       :as/object,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/ref,
   :db/doc         "When used within an Activity, describes the direct object of the activity. For instance, in the activity 'John added a movie to his wishlist', the object of the activity is the movie added. When used within a Relationship describes the entity to which the subject is related.",
   :rdf/type       :owl/ObjectProperty,
   :rdfs/domain    {:owl/unionOf [:as/Activity :as/Relationship],
                    :rdf/type    :owl/Class},
   :rdfs/label     #voc/lstr "object@en",
   :rdfs/range     {:owl/unionOf [:as/Object :as/Link],
                    :rdf/type    :owl/Class}})

(def objectType
  "objectType"
  {:db/ident    :as/objectType,
   :rdf/type    [:owl/DeprecatedProperty
                 :owl/FunctionalProperty
                 :owl/DatatypeProperty],
   :rdfs/domain :as/Object,
   :rdfs/label  #voc/lstr "objectType@en",
   :rdfs/range  :xsd/anyURI})

(def oneOf
  "Identifies an exclusive option for a Question. Use of oneOf implies that the Question can have only a single answer. To indicate that a Question can have multiple answers, use anyOf."
  {:db/ident       :as/oneOf,
   :db/cardinality :db.cardinality/many,
   :db/valueType   :db.type/ref,
   :db/doc         "Identifies an exclusive option for a Question. Use of oneOf implies that the Question can have only a single answer. To indicate that a Question can have multiple answers, use anyOf.",
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
   "Describes a possible exclusive answer or option for a question.@en",
   :rdfs/domain    :as/Question,
   :rdfs/label     #voc/lstr "oneOf@en",
   :rdfs/range     {:owl/unionOf [:as/Object :as/Link],
                    :rdf/type    :owl/Class}})

(def origin
  "Describes an indirect object of the activity from which the activity is directed. The precise meaning of the origin is the object of the English preposition 'from'. For instance, in the activity 'John moved an item to List B from List A', the origin of the activity is 'List A'."
  {:db/ident       :as/origin,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/ref,
   :db/doc         "Describes an indirect object of the activity from which the activity is directed. The precise meaning of the origin is the object of the English preposition 'from'. For instance, in the activity 'John moved an item to List B from List A', the origin of the activity is 'List A'.",
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
   "For certain activities, specifies the entity from which the action is directed.@en",
   :rdfs/domain    :as/Activity,
   :rdfs/label     #voc/lstr "origin@en",
   :rdfs/range     {:owl/unionOf [:as/Object :as/Link],
                    :rdf/type    :owl/Class}})

(def partOf
  "Identifies the Collection to which a CollectionPage objects items belong."
  {:db/ident       :as/partOf,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/ref,
   :db/doc         "Identifies the Collection to which a CollectionPage objects items belong.",
   :rdf/type       [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/domain    :as/CollectionPage,
   :rdfs/label     #voc/lstr "partOf@en",
   :rdfs/range     {:owl/unionOf [:as/Collection :as/Link],
                    :rdf/type    :owl/Class}})

(def prev
  "In a paged Collection, identifies the previous page of items."
  {:db/ident    :as/prev,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/ref,
   :db/doc         "In a paged Collection, identifies the previous page of items.",
   :rdf/type    [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/domain :as/CollectionPage,
   :rdfs/label  #voc/lstr "prev@en",
   :rdfs/range  {:owl/unionOf [:as/CollectionPage :as/Link],
                 :rdf/type    :owl/Class}})

(def preview
  "Identifies an entity that provides a preview of this object."
  {:db/ident       :as/preview,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/ref,
   :db/doc         "Identifies an entity that provides a preview of this object.",
   :rdf/type       :owl/ObjectProperty,
   :rdfs/domain    {:owl/unionOf [:as/Object :as/Link],
                    :rdf/type    :owl/Class},
   :rdfs/label     #voc/lstr "preview@en",
   :rdfs/range     {:owl/unionOf [:as/Object :as/Link],
                    :rdf/type    :owl/Class}})

(def provider
  "provider"
  {:db/ident    :as/provider,
   :rdf/type    [:owl/DeprecatedProperty :owl/ObjectProperty],
   :rdfs/domain :as/Object,
   :rdfs/label  #voc/lstr "provider@en",
   :rdfs/range  {:owl/unionOf [:as/Object :as/Link],
                 :rdf/type    :owl/Class}})

(def published
  "The date and time at which the object was published."
  {:db/ident       :as/published,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/instant,
   :db/doc         "The date and time at which the object was published.",
   :rdf/type       [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment   #voc/lstr
   "Specifies the date and time the object was published@en",
   :rdfs/domain    :as/Object,
   :rdfs/label     #voc/lstr "published@en",
   :rdfs/range     :xsd/dateTime})

(def radius
  "The radius from the given latitude and longitude for a Place. The units is expressed by the units property. If units is not specified, the default is assumed to be meters."
  {:db/ident       :as/radius,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/float,
   :db/doc         "The radius from the given latitude and longitude for a Place. The units is expressed by the units property. If units is not specified, the default is assumed to be meters.",
   :rdf/type       [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   #voc/lstr
   "Specifies a radius around the point established by the longitude and latitude@en",
   :rdfs/domain    :as/Place,
   :rdfs/label     #voc/lstr "radius@en",
   :rdfs/range     {:owl/onDatatype       :xsd/float,
                    :owl/withRestrictions [{:xsd/minInclusive 0.0}],
                    :rdf/type             :rdfs/Datatype}})

(def rating
  "A numeric rating (>= 0.0, <= 5.0) for the object"
  {:db/ident       :as/rating,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/float,
   :db/doc         "A numeric rating (>= 0.0, <= 5.0) for the object",
   :rdf/type       [:owl/FunctionalProperty
                    :owl/DatatypeProperty],
   :rdfs/comment   #voc/lstr
   "A numeric rating (>= 0.0, <= 5.0) for the object@en",
   :rdfs/domain    :as/Object,
   :rdfs/label     #voc/lstr "rating@en",
   :rdfs/range     {:owl/onDatatype       :xsd/float,
                    :owl/withRestrictions [{:xsd/minInclusive 0.0}
                                           {:xsd/maxInclusive 5.0}],
                    :rdf/type             :rdfs/Datatype}})

(def rel
  "The RFC 5988 or HTML5 Link Relation associated with the Link"
  {:db/ident       :as/rel,
   :db/cardinality :db.cardinality/many,
   :db/valueType   :db.type/string,
   :db/doc         "The RFC 5988 or HTML5 Link Relation associated with the Link",
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr "The RFC 5988 or HTML5 Link Relation associated with the Link@en",
   :rdfs/domain    :as/Link,
   :rdfs/label     #voc/lstr "rel@en",
   :rdfs/range     :xsd/string})

(def relationship
  "On a Relationship object, the relationship property identifies the kind of relationship that exists between subject and object."
  {:db/ident           :as/relationship,
   :db/cardinality     :db.cardinality/one,
   :db/valueType       :db.type/ref,
   :db/doc             "On a Relationship object, the relationship property identifies the kind of relationship that exists between subject and object.",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr "On a Relationship object, describes the type of relationship@en",
   :rdfs/domain        :as/Relationship,
   :rdfs/label         #voc/lstr "relationship@en",
   :rdfs/range         :rdf/Property,
   :rdfs/subPropertyOf :rdf/predicate})

(def replies
  "Identifies a Collection containing objects considered to be responses to this object."
  {:db/ident       :as/replies,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/ref,
   :db/doc         "Identifies a Collection containing objects considered to be responses to this object.",
   :rdf/type       :owl/ObjectProperty,
   :rdfs/domain    :as/Object,
   :rdfs/label     #voc/lstr "replies@en",
   :rdfs/range     :as/Collection})

(def result
  "Describes the result of the activity. For instance, if a particular action results in the creation of a new resource, the result property can be used to describe that new resource."
  {:db/ident       :as/result,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/ref,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/domain    :as/Activity,
   :rdfs/label     #voc/lstr "result@en",
   :rdfs/range     {:owl/unionOf [:as/Object :as/Link],
                    :rdf/type    :owl/Class}})

(def startIndex
  "A non-negative integer value identifying the relative position within the logical view of a strictly ordered collection."
  {:db/ident       :as/startIndex,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/long,
   :db/doc         "A non-negative integer value identifying the relative position within the logical view of a strictly ordered collection.",
   :rdf/type       [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   #voc/lstr
   "In a strictly ordered logical collection, specifies the index position of the first item in the items list@en",
   :rdfs/domain    :as/OrderedCollectionPage,
   :rdfs/label     #voc/lstr "startIndex@en",
   :rdfs/range     :xsd/nonNegativeInteger})

(def startTime
  "The date and time describing the actual or expected starting time of the object. When used with an Activity object, for instance, the startTime property specifies the moment the activity began or is scheduled to begin."
  {:db/ident       :as/startTime,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/instant,
   :db/doc         "The date and time describing the actual or expected starting time of the object. When used with an Activity object, for instance, the startTime property specifies the moment the activity began or is scheduled to begin.",
   :rdf/type       [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment   #voc/lstr "The starting time of the object@en",
   :rdfs/domain    :as/Object,
   :rdfs/label     #voc/lstr "startTime@en",
   :rdfs/range     :xsd/dateTime})

(def subject  
  "On a Relationship object, identifies the subject. e.g. when saying \"John is connected to Sally\", 'subject' refers to 'John'"
  {:db/ident           :as/subject,
   :db/cardinality     :db.cardinality/one,
   :db/valueType       :db.type/ref,
   :db/doc             "On a Relationship object, identifies the subject. e.g. when saying \"John is connected to Sally\", 'subject' refers to 'John'",
   :rdf/type           [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/comment
   #voc/lstr
   "On a Relationship object, identifies the subject. e.g. when saying \"John is connected to Sally\", 'subject' refers to 'John'@en",
   :rdfs/domain        :as/Relationship,
   :rdfs/label         #voc/lstr "a@en",
   :rdfs/range         {:owl/unionOf [:as/Link :as/Object],
                        :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :rdf/subject})

(def summary
  "A natural language summarization of the object encoded as Markdown. Multiple language tagged summaries MAY be provided.

  Note: The standard encodes summaries by default as HTML."
  {:db/ident       :as/summary,
   :db/cardinality :db.cardinality/many,
   :db/valueType   :db.type/string,
   :db/doc         "A natural language summarization of the object encoded as Markdown. Multiple language tagged summaries MAY be provided. Note: The standard encodes summaries by default as HTML.",
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   #voc/lstr "A short summary of the object@en",
   :rdfs/domain    :as/Object,
   :rdfs/label     #voc/lstr "summary@en",
   :rdfs/range     {:owl/unionOf [:rdf/langString :xsd/string],
                    :rdf/type    :owl/Class}})

(def tag
  "One or more 'tags' that have been associated with an objects. A tag can be any kind of Object. The key difference between attachment and tag is that the former implies association by inclusion, while the latter implies associated by reference."
  {:db/ident       :as/tag,
   :db/cardinality :db.cardinality/many,
   :db/valueType   :db.type/ref,
   :db/doc         "One or more 'tags' that have been associated with an objects. A tag can be any kind of Object. The key difference between attachment and tag is that the former implies association by inclusion, while the latter implies associated by reference.",
   :rdf/type       :owl/ObjectProperty,
   :rdfs/domain    :as/Object,
   :rdfs/label     #voc/lstr "tag@en",
   :rdfs/range     {:owl/unionOf [:as/Object :as/Link],
                    :rdf/type    :owl/Class}})

(def tags
  "tags"
  {:db/ident               :as/tags,
   :owl/equivalentProperty :as/tag,
   :rdf/type               [:owl/DeprecatedProperty :owl/ObjectProperty],
   :rdfs/domain            :as/Object,
   :rdfs/label             #voc/lstr "tags@en",
   :rdfs/range             {:owl/unionOf [:as/Object :as/Link],
                            :rdf/type    :owl/Class}})

(def target
  "Describes the indirect object, or target, of the activity. The precise meaning of the target is largely dependent on the type of action being described but will often be the object of the English preposition 'to'. For instance, in the activity 'John added a movie to his wishlist', the target of the activity is John's wishlist. An activity can have more than one target."
  {:db/ident       :as/target,
   :db/cardinality :db.cardinality/many,
   :db/valueType   :db.type/ref,
   :db/doc         "Describes the indirect object, or target, of the activity. The precise meaning of the target is largely dependent on the type of action being described but will often be the object of the English preposition 'to'. For instance, in the activity 'John added a movie to his wishlist', the target of the activity is John's wishlist. An activity can have more than one target.",
   :rdf/type       :owl/ObjectProperty,
   :rdfs/domain    :as/Activity,
   :rdfs/label     #voc/lstr "target@en",
   :rdfs/range     {:owl/unionOf [:as/Object :as/Link],
                    :rdf/type    :owl/Class}})

(def to
  "Identifies an entity considered to be part of the public primary audience of an Object."
  {:db/ident       :as/to,
   :db/cardinality :db.cardinality/many,
   :db/valueType   :db.type/ref,
   :db/doc         "Identifies an entity considered to be part of the public primary audience of an Object.",   
   :rdf/type       :owl/ObjectProperty,
   :rdfs/domain    :as/Object,
   :rdfs/label     #voc/lstr "to@en",
   :rdfs/range     {:owl/unionOf [:as/Object :as/Link],
                    :rdf/type    :owl/Class}})

(def totalItems
  "A non-negative integer specifying the total number of objects contained by the logical view of the collection. This number might not reflect the actual number of items serialized within the Collection object instance."
  {:db/ident       :as/totalItems,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/long,
   :db/doc         "A non-negative integer specifying the total number of objects contained by the logical view of the collection. This number might not reflect the actual number of items serialized within the Collection object instance.",
   :rdf/type       [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment   #voc/lstr
   "The total number of items in a logical collection@en",
   :rdfs/domain    :as/Collection,
   :rdfs/label     #voc/lstr "totalItems@en",
   :rdfs/range     :xsd/nonNegativeInteger})

(def units
  "Specifies the measurement units for the radius and altitude properties on a Place object. If not specified, the default is assumed to be meters."
  {:db/ident       :as/units,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/ref,
   :db/doc         "Specifies the measurement units for the radius and altitude properties on a Place object. If not specified, the default is assumed to be meters.",
   :rdf/type       [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   #voc/lstr
   "Identifies the unit of measurement used by the radius, altitude and accuracy properties. The value can be expressed either as one of a set of predefined units or as a well-known common URI that identifies units.@en",
   :rdfs/domain    :as/Place,
   :rdfs/label     #voc/lstr "units@en",
   :rdfs/range     {:owl/unionOf [{:owl/oneOf [{:xsd/string "inches"}
                                               {:xsd/string "feet"}
                                               {:xsd/string "miles"}
                                               {:xsd/string "cm"}
                                               {:xsd/string "m"}
                                               {:xsd/string "km"}],
                                   :rdf/type  :rdfs/Datatype}
                                  :xsd/anyURI],
                    :rdf/type    :rdfs/Datatype}})

(def updated
  "The date and time at which the object was updated."
  {:db/ident       :as/updated,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/instant,
   :db/doc         "The date and time at which the object was updated.",
   :rdf/type       [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment   #voc/lstr "Specifies when the object was last updated@en",
   :rdfs/domain    :as/Object,
   :rdfs/label     #voc/lstr "updated@en",
   :rdfs/range     :xsd/dateTime})

(def upstreamDuplicates
  "upstreamDuplicates"
  {:db/ident    :as/upstreamDuplicates,
   :rdf/type    [:owl/DeprecatedProperty :owl/DatatypeProperty],
   :rdfs/domain :as/Object,
   :rdfs/label  #voc/lstr "upstreamDuplicates@en",
   :rdfs/range  :xsd/anyURI})

(def url
  "Identifies one or more links to representations of the object."
  {:db/ident       :as/url,
   :db/cardinality :db.cardinality/many,
   :db/valueType   :db.type/ref,
   :db/isComponent true,
   :db/doc         "Identifies one or more links to representations of the object.",
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr "Specifies a link to a specific representation of the Object@en",
   :rdfs/domain    :as/Object,
   :rdfs/label     #voc/lstr "url@en",
   :rdfs/range     {:owl/unionOf [:as/Link :xsd/anyURI],
                    :rdf/type    :owl/Class}})

(def verb
  "verb"
  {:db/ident    :as/verb,
   :rdf/type    [:owl/DeprecatedProperty
                 :owl/FunctionalProperty
                 :owl/DatatypeProperty],
   :rdfs/domain :as/Activity,
   :rdfs/label  #voc/lstr "verb@en",
   :rdfs/range  :xsd/anyURI})

(def width
  "On a Link, specifies a hint as to the rendering width in device-independent pixels of the linked resource."
  {:db/ident       :as/width,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/long,
   :db/doc         "On a Link, specifies a hint as to the rendering width in device-independent pixels of the linked resource.",
   :rdf/type       [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/comment
   #voc/lstr
   "Specifies the preferred display width of the content, expressed in terms of device independent pixels.@en",
   :rdfs/domain    :as/Link,
   :rdfs/label     #voc/lstr "width@en",
   :rdfs/range     :xsd/nonNegativeInteger})
