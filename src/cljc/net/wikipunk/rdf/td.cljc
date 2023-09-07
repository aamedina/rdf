(ns net.wikipunk.rdf.td
  ^{:base       "https://www.w3.org/2019/wot/td#",
    :namespaces {"dcterms"    "http://purl.org/dc/terms/",
                 "foaf"       "http://xmlns.com/foaf/0.1/",
                 "hctl"       "https://www.w3.org/2019/wot/hypermedia#",
                 "jsonschema" "https://www.w3.org/2019/wot/json-schema#",
                 "owl"        "http://www.w3.org/2002/07/owl#",
                 "rdf"        "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs"       "http://www.w3.org/2000/01/rdf-schema#",
                 "schema"     "http://schema.org/",
                 "td"         "https://www.w3.org/2019/wot/td#",
                 "vann"       "http://purl.org/vocab/vann/",
                 "wotsec"     "https://www.w3.org/2019/wot/security#",
                 "xml"        "http://www.w3.org/XML/1998/namespace",
                 "xsd"        "http://www.w3.org/2001/XMLSchema#"},
    :prefix     "td",
    :source     "https://www.w3.org/2019/wot/td#"}
  {:dcterms/author {:xsd/anyURI "https://vcharpenay.link/#me"},
   :dcterms/contributor #{{:xsd/anyURI "http://purl.org/net/mpoveda"}
                          {:xsd/anyURI "http://maxime-lefrancois.info/me#"}},
   :dcterms/license {:xsd/anyURI "http://purl.org/NET/rdflicense/cc-by4.0"},
   :dcterms/publisher {:rdf/type    :schema/Organization,
                       :schema/name "W3C Web of Things Working Group",
                       :schema/url  {:xsd/anyURI "https://www.w3.org/WoT/WG/"}},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Thing Description Ontology"},
   :owl/versionInfo "0.9.0",
   :rdf/type :owl/Ontology,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This ontology aims to model the Web of Things domain according to the W3C Interest Group (http://w3c.github.io/wot/)"},
   :vann/preferredNamespacePrefix "td",
   :vann/preferredNamespaceUri "https://www.w3.org/2019/wot/td#",
   :xsd/anyURI "https://www.w3.org/2019/wot/td"}
  (:refer-clojure :exclude [name]))

(def ActionAffordance
  {:db/ident :td/ActionAffordance,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An Interaction Affordance that allows to invoke a function of the Thing, which manipulates state (e.g., toggling a lamp on or off) or triggers a process on the Thing (e.g., dim a lamp over time)."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "ActionAffordance",
   :rdfs/subClassOf :td/InteractionAffordance})

(def EventAffordance
  {:db/ident :td/EventAffordance,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An Interaction Affordance that describes an event source, which asynchronously pushes event data to Consumers (e.g., overheating alerts)."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "EventAffordance",
   :rdfs/subClassOf :td/InteractionAffordance})

(def InteractionAffordance
  {:db/ident :td/InteractionAffordance,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Metadata of a Thing that shows the possible choices to Consumers, thereby suggesting how Consumers may interact with the Thing. There are many types of potential affordances, but W3C WoT defines three types of Interaction Affordances: Properties, Actions, and Events."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "InteractionAffordance"})

(def OperationType
  {:db/ident :td/OperationType,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Enumeration of well-known operation types necessary to implement the WoT interaction model"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "OperationType",
   :rdfs/subClassOf :schema/Enumeration})

(def PropertyAffordance
  {:db/ident :td/PropertyAffordance,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An Interaction Affordance that exposes state of the Thing. This state can then be retrieved (read) and/or updated (write). Things can also choose to make Properties observable by pushing the new state after a change."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "PropertyAffordance",
   :rdfs/subClassOf :td/InteractionAffordance})

(def Thing
  {:db/ident :td/Thing,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An abstraction of a physical or a virtual entity whose metadata and interfaces are described by a WoT Thing Description, whereas a virtual entity is the composition of one or more Things."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Thing"}})

(def baseURI
  {:db/ident :td/baseURI,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Define the base URI that is used for all relative URI references throughout a TD document. In TD instances, all relative URIs are resolved relative to the base URI using the algorithm defined in [RFC3986]. base does not affect the URIs used in @context and the IRIs used within Linked Data [LINKED-DATA] graphs that are relevant when semantic processing is applied to TD instances."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "baseURI"})

(def cancelAction
  {:db/ident         :td/cancelAction,
   :rdf/type         :td/OperationType,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Operation type of forms used to cancel an action"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label       "cancelAction"})

(def definesSecurityScheme
  {:db/ident :td/definesSecurityScheme,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A Thing may define abstract security schemes, used to configure the secure access of (a set of) affordance(s).",
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "definesSecurityScheme",
   :schema/domainIncludes :td/Thing})

(def description
  {:db/ident :td/description,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "description of the TD element (Thing, interaction affordance, security scheme or data schema)",
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "description",
   :rdfs/subPropertyOf :dcterms/description,
   :schema/domainIncludes #{:jsonschema/DataSchema :wotsec/SecurityScheme
                            :td/InteractionAffordance :td/Thing},
   :schema/rangeIncludes :schema/Text})

(def descriptionInLanguage
  {:db/ident :td/descriptionInLanguage,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "description of the TD element (Thing, interaction affordance, security scheme or data schema) with language tag. By convention, a language tag must be added to the object of 'descriptionInLanguage' triples. Otherwise, use 'description'.",
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "descriptionInLanguage",
   :rdfs/subPropertyOf :dcterms/description,
   :schema/domainIncludes #{:jsonschema/DataSchema :wotsec/SecurityScheme
                            :td/InteractionAffordance :td/Thing},
   :schema/rangeIncludes :schema/Text})

(def followsProfile
  {:db/ident :td/followsProfile,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates the WoT Profile mechanisms followed by this Thing Description and the corresponding Thing implementation."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "followsProfile"})

(def hasActionAffordance
  {:db/ident :td/hasActionAffordance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "All Action-based interaction affordance of the Thing."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "hasActionAffordance",
   :rdfs/subPropertyOf :td/hasInteractionAffordance,
   :schema/rangeIncludes :td/ActionAffordance})

(def hasCancellationSchema
  {:db/ident :td/hasCancellationSchema,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Defines any data that needs to be passed to cancel a subscription, e.g., a specific message to remove a Webhook"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "hasCancellationSchema",
   :schema/domainIncludes :td/EventAffordance})

(def hasConfigurationInstance
  {:db/ident :td/hasConfigurationInstance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Instantiation, as used here, is a form of non-symmetric equivalence between a scheme and a configuration: whatever statement on the scheme is also true of the configuration but not vice-versa.",
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "hasConfigurationInstance",
   :schema/domainIncludes :wotsec/SecurityScheme})

(def hasEventAffordance
  {:db/ident           :td/hasEventAffordance,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "All Event-based interaction affordance of the Thing."},
   :rdfs/isDefinedBy   {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label         "hasEventAffordance",
   :rdfs/subPropertyOf :td/hasInteractionAffordance,
   :schema/rangeIncludes :td/EventAffordance})

(def hasForm
  {:db/ident :td/hasForm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Set of form hypermedia controls that describe how an operation can be performed. Forms are serializations of Protocol Bindings. The array cannot be empty"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "hasForm",
   :schema/domainIncludes #{:td/InteractionAffordance :td/Thing},
   :schema/rangeIncludes :hctl/Form})

(def hasInputSchema
  {:db/ident         :td/hasInputSchema,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Used to define the input data schema of the action."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label       "hasInputSchema",
   :schema/domainIncludes :td/ActionAffordance})

(def hasInteractionAffordance
  {:db/ident             :td/hasInteractionAffordance,
   :rdf/type             :owl/ObjectProperty,
   :rdfs/comment         {:rdf/language "en",
                          :rdf/value
                          "Offers an affordance to interact with the Thing"},
   :rdfs/isDefinedBy     {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label           "hasInteractionAffordance",
   :schema/domainIncludes :td/Thing,
   :schema/rangeIncludes :td/InteractionAffordance})

(def hasLink
  {:db/ident :td/hasLink,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Provides Web links to arbitrary resources that relate to the specified Thing Description."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "hasLink",
   :schema/rangeIncludes :hctl/Link})

(def hasNotificationResponseSchema
  {:db/ident :td/hasNotificationResponseSchema,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Defines the data schema of the Event response messages sent by the consumer in a response to a data message."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td#"},
   :rdfs/label "hasNotificationResponseSchema",
   :schema/domainIncludes :td/EventAffordance})

(def hasNotificationSchema
  {:db/ident :td/hasNotificationSchema,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Defines the data schema of the Event instance messages pushed by the Thing."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "hasNotificationSchema",
   :schema/domainIncludes :td/EventAffordance})

(def hasOutputSchema
  {:db/ident         :td/hasOutputSchema,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Used to define the output data schema of the action."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label       "hasOutputSchema",
   :schema/domainIncludes :td/ActionAffordance})

(def hasPropertyAffordance
  {:db/ident :td/hasPropertyAffordance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "All Property-based interaction affordance of the Thing."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "hasPropertyAffordance",
   :rdfs/subPropertyOf :td/hasInteractionAffordance,
   :schema/rangeIncludes :td/PropertyAffordance})

(def hasSecurityConfiguration
  {:db/ident :td/hasSecurityConfiguration,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A security configuration is a a security scheme applied to a (set of) affordance(s)."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "hasSecurityConfiguration",
   :schema/domainIncludes #{:hctl/Form :td/Thing}})

(def hasSubscriptionSchema
  {:db/ident :td/hasSubscriptionSchema,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Defines data that needs to be passed upon subscription, e.g., filters or message format for setting up Webhooks."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "hasSubscriptionSchema",
   :schema/domainIncludes :td/EventAffordance})

(def hasUriTemplateSchema
  {:db/ident :td/hasUriTemplateSchema,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Define URI template variables  according to [[RFC6570]] as collection based on schema specifications. The individual variables DataSchema cannot be an ObjectSchema or an ArraySchema."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "hasUriTemplateSchema",
   :schema/domainIncludes :td/InteractionAffordance})

(def instance
  {:db/ident         :td/instance,
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Provides a version identicator of this TD instance."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label       "instance"})

(def invokeAction
  {:db/ident         :td/invokeAction,
   :rdf/type         :td/OperationType,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Operation type of forms used to read a property value"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label       "invokeAction"})

(def isIdempotent
  {:db/ident :td/isIdempotent,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates whether the action is idempotent (=true) or not. Informs whether the action can be called repeatedly with the same result, if present, based on the same input."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "isIdempotent",
   :schema/domainIncludes :td/ActionAffordance,
   :schema/rangeIncludes :schema/Boolean})

(def isObservable
  {:db/ident :td/isObservable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A hint that indicates whether Servients hosting the Thing and Intermediaries should provide a Protocol Binding that supports the <code>observeproperty</code> and <code>unobserveproperty</code> operations for this Property."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "isObservable",
   :schema/domainIncludes :td/PropertyAffordance,
   :schema/rangeIncludes :schema/Boolean})

(def isSafe
  {:db/ident :td/isSafe,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Signals if the action is safe (=true) or not. Used to signal if there is no internal state (cf. resource state) is changed when invoking an Action. In that case responses can be cached as example."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "isSafe",
   :schema/domainIncludes :td/ActionAffordance,
   :schema/rangeIncludes :schema/Boolean})

(def isSynchronous
  {:db/ident :td/isSynchronous,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates whether the action is synchronous (=true) or not. A synchronous action means that the response of action contains all the information about the result of the action and no further querying about the status of the action is needed. Lack of this keyword means that no claim on the synchronicity of the action can be made."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td#"},
   :rdfs/label "isSynchronous",
   :schema/domainIncludes :td/ActionAffordance,
   :schema/rangeIncludes :schema/Boolean})

(def model
  {:db/ident         :td/model,
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Provides a version indicator of the underlying TM."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label       "model"})

(def name
  {:db/ident :td/name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indexing property to store entity names when serializing them in a JSON-LD @index container."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "name",
   :schema/domainIncludes :td/InteractionAffordance,
   :schema/rangeIncludes :schema/Text})

(def observeAllProperties
  {:db/ident :td/observeAllProperties,
   :rdf/type :td/OperationType,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Operation type of forms used to observe all property values"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "observeAllProperties"})

(def observeProperty
  {:db/ident :td/observeProperty,
   :rdf/type :td/OperationType,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Operation type of forms used to observe a property value"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "observeProperty"})

(def queryAction
  {:db/ident :td/queryAction,
   :rdf/type :td/OperationType,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Operation type of forms used to query the status of an action"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "queryAction"})

(def queryAllActions
  {:db/ident :td/queryAllActions,
   :rdf/type :td/OperationType,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Operation type of forms used to query the status of all actions"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "queryAllActions"})

(def readAllProperties
  {:db/ident :td/readAllProperties,
   :rdf/type :td/OperationType,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Operation type of forms used to read all property values"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "readAllProperties"})

(def readMultipleProperties
  {:db/ident         :td/readMultipleProperties,
   :rdf/type         :td/OperationType,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Operation type of forms used to read a property value"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label       "readMultipleProperties"})

(def readProperty
  {:db/ident         :td/readProperty,
   :rdf/type         :td/OperationType,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Operation type of forms used to read a property value"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label       "readProperty"})

(def subscribeAllEvents
  {:db/ident :td/subscribeAllEvents,
   :rdf/type :td/OperationType,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Operation type of forms used to subscribe to all event types"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "subscribeAllEvents"})

(def subscribeEvent
  {:db/ident         :td/subscribeEvent,
   :rdf/type         :td/OperationType,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Operation type of forms used to read a property value"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label       "subscribeEvent"})

(def supportContact
  {:db/ident :td/supportContact,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Provides information about the TD maintainer as URI scheme (e.g., mailto [[RFC6068]], tel [[RFC3966]], https[[RFC9112]])."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "supportContact",
   :rdfs/seeAlso :schema/contactPoint})

(def title
  {:db/ident :td/title,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "title of the TD element (Thing, interaction affordance or data schema)",
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "title",
   :rdfs/subPropertyOf :dcterms/title,
   :schema/domainIncludes #{:jsonschema/DataSchema :td/InteractionAffordance
                            :td/Thing},
   :schema/rangeIncludes :schema/Text})

(def titleInLanguage
  {:db/ident :td/titleInLanguage,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "title of the TD element (Thing, interaction affordance or data schema) with language tag. By convention, a language tag must be added to the object of 'titleInLanguage' triples. Otherwise, use 'title'.",
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "titleInLanguage",
   :rdfs/subPropertyOf :dcterms/title,
   :schema/domainIncludes #{:jsonschema/DataSchema :td/InteractionAffordance
                            :td/Thing},
   :schema/rangeIncludes :schema/Text})

(def unobserveAllProperties
  {:db/ident :td/unobserveAllProperties,
   :rdf/type :td/OperationType,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Operation type of forms used to unobserve all property value"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "unobserveAllProperties"})

(def unobserveProperty
  {:db/ident :td/unobserveProperty,
   :rdf/type :td/OperationType,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Operation type of forms used to unobserve a property value"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "unobserveProperty"})

(def unsubscribeAllEvents
  {:db/ident :td/unsubscribeAllEvents,
   :rdf/type :td/OperationType,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Operation type of forms used to unsubscribe from all event types"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label "unsubscribeAllEvents"})

(def unsubscribeEvent
  {:db/ident         :td/unsubscribeEvent,
   :rdf/type         :td/OperationType,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Operation type of forms used to read a property value"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label       "unsubscribeEvent"})

(def versionInfo
  {:db/ident         :td/versionInfo,
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Provides version information."},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label       "versionInfo",
   :rdfs/seeAlso     :schema/version})

(def writeAllProperties
  {:db/ident         :td/writeAllProperties,
   :rdf/type         :td/OperationType,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Operation type of forms used to read a property value"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label       "writeAllProperties"})

(def writeMultipleProperties
  {:db/ident         :td/writeMultipleProperties,
   :rdf/type         :td/OperationType,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Operation type of forms used to write a property value"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label       "writeMultipleProperties"})

(def writeProperty
  {:db/ident         :td/writeProperty,
   :rdf/type         :td/OperationType,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Operation type of forms used to write a property value"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/2019/wot/td"},
   :rdfs/label       "writeProperty"})

(def urn:uuid:490b8cd2-c2a9-5fd8-9908-3da88f76060d
  {:dcterms/author {:xsd/anyURI "https://vcharpenay.link/#me"},
   :dcterms/contributor #{{:xsd/anyURI "http://purl.org/net/mpoveda"}
                          {:xsd/anyURI "http://maxime-lefrancois.info/me#"}},
   :dcterms/license {:xsd/anyURI "http://purl.org/NET/rdflicense/cc-by4.0"},
   :dcterms/publisher {:rdf/type    :schema/Organization,
                       :schema/name "W3C Web of Things Working Group",
                       :schema/url  {:xsd/anyURI "https://www.w3.org/WoT/WG/"}},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Thing Description Ontology"},
   :owl/versionInfo "0.9.0",
   :rdf/type :owl/Ontology,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This ontology aims to model the Web of Things domain according to the W3C Interest Group (http://w3c.github.io/wot/)"},
   :vann/preferredNamespacePrefix "td",
   :vann/preferredNamespaceUri "https://www.w3.org/2019/wot/td#",
   :xsd/anyURI "https://www.w3.org/2019/wot/td"})