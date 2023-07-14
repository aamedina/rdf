(ns net.wikipunk.rdf.td
  "This ontology aims to model the Web of Things domain according to the W3C Interest Group (http://w3c.github.io/wot/)"
  {:dcterms/author {:rdfa/uri "https://vcharpenay.link/#me"},
   :dcterms/contributor [{:rdfa/uri "http://purl.org/net/mpoveda"}
                         {:rdfa/uri "http://maxime-lefrancois.info/me#"}],
   :dcterms/license {:rdfa/uri "http://purl.org/NET/rdflicense/cc-by4.0"},
   :dcterms/publisher {:rdf/type    :schema/Organization,
                       :schema/name #xsd/string
                                     "W3C Web of Things Working Group",
                       :schema/url  {:rdfa/uri "https://www.w3.org/WoT/WG/"}},
   :dcterms/title #xsd/langString "Thing Description Ontology@en",
   :owl/versionInfo #xsd/string "0.9.0",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "hctl" "https://www.w3.org/2019/wot/hypermedia#",
                       "jsonschema" "https://www.w3.org/2019/wot/json-schema#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "schema" "http://schema.org/",
                       "td" "https://www.w3.org/2019/wot/td#",
                       "vann" "http://purl.org/vocab/vann/",
                       "wotsec" "https://www.w3.org/2019/wot/security#",
                       "xml" "http://www.w3.org/XML/1998/namespace",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "td",
   :rdfa/uri "https://www.w3.org/2019/wot/td",
   :rdfs/comment
   #xsd/langString
    "This ontology aims to model the Web of Things domain according to the W3C Interest Group (http://w3c.github.io/wot/)@en",
   :vann/preferredNamespacePrefix #xsd/string "td",
   :vann/preferredNamespaceUri #xsd/string "https://www.w3.org/2019/wot/td#"}
  (:refer-clojure :exclude [name]))

(def ActionAffordance
  "An Interaction Affordance that allows to invoke a function of the Thing, which manipulates state (e.g., toggling a lamp on or off) or triggers a process on the Thing (e.g., dim a lamp over time)."
  {:db/ident :td/ActionAffordance,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/langString
    "An Interaction Affordance that allows to invoke a function of the Thing, which manipulates state (e.g., toggling a lamp on or off) or triggers a process on the Thing (e.g., dim a lamp over time).@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "ActionAffordance",
   :rdfs/subClassOf [:rdfs/Resource :td/InteractionAffordance]})

(def EventAffordance
  "An Interaction Affordance that describes an event source, which asynchronously pushes event data to Consumers (e.g., overheating alerts)."
  {:db/ident :td/EventAffordance,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/langString
    "An Interaction Affordance that describes an event source, which asynchronously pushes event data to Consumers (e.g., overheating alerts).@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "EventAffordance",
   :rdfs/subClassOf [:rdfs/Resource :td/InteractionAffordance]})

(def InteractionAffordance
  "Metadata of a Thing that shows the possible choices to Consumers, thereby suggesting how Consumers may interact with the Thing. There are many types of potential affordances, but W3C WoT defines three types of Interaction Affordances: Properties, Actions, and Events."
  {:db/ident :td/InteractionAffordance,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/langString
    "Metadata of a Thing that shows the possible choices to Consumers, thereby suggesting how Consumers may interact with the Thing. There are many types of potential affordances, but W3C WoT defines three types of Interaction Affordances: Properties, Actions, and Events.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "InteractionAffordance",
   :rdfs/subClassOf :rdfs/Resource})

(def OperationType
  "Enumeration of well-known operation types necessary to implement the WoT interaction model"
  {:db/ident :td/OperationType,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/langString
    "Enumeration of well-known operation types necessary to implement the WoT interaction model@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "OperationType",
   :rdfs/subClassOf [:rdfs/Resource :schema/Enumeration]})

(def PropertyAffordance
  "An Interaction Affordance that exposes state of the Thing. This state can then be retrieved (read) and/or updated (write). Things can also choose to make Properties observable by pushing the new state after a change."
  {:db/ident :td/PropertyAffordance,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/langString
    "An Interaction Affordance that exposes state of the Thing. This state can then be retrieved (read) and/or updated (write). Things can also choose to make Properties observable by pushing the new state after a change.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "PropertyAffordance",
   :rdfs/subClassOf [:td/InteractionAffordance :rdfs/Resource]})

(def Thing
  "An abstraction of a physical or a virtual entity whose metadata and interfaces are described by a WoT Thing Description, whereas a virtual entity is the composition of one or more Things."
  {:db/ident :td/Thing,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #xsd/langString
    "An abstraction of a physical or a virtual entity whose metadata and interfaces are described by a WoT Thing Description, whereas a virtual entity is the composition of one or more Things.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/langString "Thing@en",
   :rdfs/subClassOf :rdfs/Resource})

(def baseURI
  "Define the base URI that is used for all relative URI references throughout a TD document. In TD instances, all relative URIs are resolved relative to the base URI using the algorithm defined in [RFC3986]. base does not affect the URIs used in @context and the IRIs used within Linked Data [LINKED-DATA] graphs that are relevant when semantic processing is applied to TD instances."
  {:db/ident :td/baseURI,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #xsd/langString
    "Define the base URI that is used for all relative URI references throughout a TD document. In TD instances, all relative URIs are resolved relative to the base URI using the algorithm defined in [RFC3986]. base does not affect the URIs used in @context and the IRIs used within Linked Data [LINKED-DATA] graphs that are relevant when semantic processing is applied to TD instances.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "baseURI"})

(def cancelAction
  "Operation type of forms used to cancel an action"
  {:db/ident         :td/cancelAction,
   :rdf/type         [:td/OperationType :schema/Enumeration :rdfs/Resource],
   :rdfs/comment     #xsd/langString
                      "Operation type of forms used to cancel an action@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label       #xsd/string "cancelAction"})

(def definesSecurityScheme
  "A Thing may define abstract security schemes, used to configure the secure access of (a set of) affordance(s)."
  {:db/ident :td/definesSecurityScheme,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "A Thing may define abstract security schemes, used to configure the secure access of (a set of) affordance(s).",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "definesSecurityScheme",
   :schema/domainIncludes :td/Thing})

(def description
  "description of the TD element (Thing, interaction affordance, security scheme or data schema)"
  {:db/ident :td/description,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "description of the TD element (Thing, interaction affordance, security scheme or data schema)",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "description",
   :rdfs/subPropertyOf :dcterms/description,
   :schema/domainIncludes [:wotsec/SecurityScheme
                           :td/InteractionAffordance
                           :td/Thing
                           :jsonschema/DataSchema],
   :schema/rangeIncludes :schema/Text})

(def descriptionInLanguage
  "description of the TD element (Thing, interaction affordance, security scheme or data schema) with language tag. By convention, a language tag must be added to the object of 'descriptionInLanguage' triples. Otherwise, use 'description'."
  {:db/ident :td/descriptionInLanguage,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "description of the TD element (Thing, interaction affordance, security scheme or data schema) with language tag. By convention, a language tag must be added to the object of 'descriptionInLanguage' triples. Otherwise, use 'description'.",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "descriptionInLanguage",
   :rdfs/subPropertyOf :dcterms/description,
   :schema/domainIncludes [:td/InteractionAffordance
                           :jsonschema/DataSchema
                           :wotsec/SecurityScheme
                           :td/Thing],
   :schema/rangeIncludes :schema/Text})

(def followsProfile
  "Indicates the WoT Profile mechanisms followed by this Thing Description and the corresponding Thing implementation."
  {:db/ident :td/followsProfile,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #xsd/langString
    "Indicates the WoT Profile mechanisms followed by this Thing Description and the corresponding Thing implementation.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "followsProfile"})

(def hasActionAffordance
  "All Action-based interaction affordance of the Thing."
  {:db/ident :td/hasActionAffordance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment #xsd/langString
                  "All Action-based interaction affordance of the Thing.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "hasActionAffordance",
   :rdfs/subPropertyOf :td/hasInteractionAffordance,
   :schema/rangeIncludes :td/ActionAffordance})

(def hasCancellationSchema
  "Defines any data that needs to be passed to cancel a subscription, e.g., a specific message to remove a Webhook"
  {:db/ident :td/hasCancellationSchema,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Defines any data that needs to be passed to cancel a subscription, e.g., a specific message to remove a Webhook@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "hasCancellationSchema",
   :schema/domainIncludes :td/EventAffordance})

(def hasConfigurationInstance
  "Instantiation, as used here, is a form of non-symmetric equivalence between a scheme and a configuration: whatever statement on the scheme is also true of the configuration but not vice-versa."
  {:db/ident :td/hasConfigurationInstance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/string
    "Instantiation, as used here, is a form of non-symmetric equivalence between a scheme and a configuration: whatever statement on the scheme is also true of the configuration but not vice-versa.",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "hasConfigurationInstance",
   :schema/domainIncludes :wotsec/SecurityScheme})

(def hasEventAffordance
  "All Event-based interaction affordance of the Thing."
  {:db/ident :td/hasEventAffordance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment #xsd/langString
                  "All Event-based interaction affordance of the Thing.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "hasEventAffordance",
   :rdfs/subPropertyOf :td/hasInteractionAffordance,
   :schema/rangeIncludes :td/EventAffordance})

(def hasForm
  "Set of form hypermedia controls that describe how an operation can be performed. Forms are serializations of Protocol Bindings. The array cannot be empty"
  {:db/ident :td/hasForm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Set of form hypermedia controls that describe how an operation can be performed. Forms are serializations of Protocol Bindings. The array cannot be empty@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "hasForm",
   :schema/domainIncludes [:td/Thing :td/InteractionAffordance],
   :schema/rangeIncludes :hctl/Form})

(def hasInputSchema
  "Used to define the input data schema of the action."
  {:db/ident         :td/hasInputSchema,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #xsd/langString
                      "Used to define the input data schema of the action.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label       #xsd/string "hasInputSchema",
   :schema/domainIncludes :td/ActionAffordance})

(def hasInteractionAffordance
  "Offers an affordance to interact with the Thing"
  {:db/ident             :td/hasInteractionAffordance,
   :rdf/type             :owl/ObjectProperty,
   :rdfs/comment         #xsd/langString
                          "Offers an affordance to interact with the Thing@en",
   :rdfs/isDefinedBy     {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label           #xsd/string "hasInteractionAffordance",
   :schema/domainIncludes :td/Thing,
   :schema/rangeIncludes :td/InteractionAffordance})

(def hasLink
  "Provides Web links to arbitrary resources that relate to the specified Thing Description."
  {:db/ident :td/hasLink,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Provides Web links to arbitrary resources that relate to the specified Thing Description.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "hasLink",
   :schema/rangeIncludes :hctl/Link})

(def hasNotificationResponseSchema
  "Defines the data schema of the Event response messages sent by the consumer in a response to a data message."
  {:db/ident :td/hasNotificationResponseSchema,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Defines the data schema of the Event response messages sent by the consumer in a response to a data message.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td#"},
   :rdfs/label #xsd/string "hasNotificationResponseSchema",
   :schema/domainIncludes :td/EventAffordance})

(def hasNotificationSchema
  "Defines the data schema of the Event instance messages pushed by the Thing."
  {:db/ident :td/hasNotificationSchema,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Defines the data schema of the Event instance messages pushed by the Thing.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "hasNotificationSchema",
   :schema/domainIncludes :td/EventAffordance})

(def hasOutputSchema
  "Used to define the output data schema of the action."
  {:db/ident         :td/hasOutputSchema,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #xsd/langString
                      "Used to define the output data schema of the action.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label       #xsd/string "hasOutputSchema",
   :schema/domainIncludes :td/ActionAffordance})

(def hasPropertyAffordance
  "All Property-based interaction affordance of the Thing."
  {:db/ident :td/hasPropertyAffordance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment #xsd/langString
                  "All Property-based interaction affordance of the Thing.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "hasPropertyAffordance",
   :rdfs/subPropertyOf :td/hasInteractionAffordance,
   :schema/rangeIncludes :td/PropertyAffordance})

(def hasSecurityConfiguration
  "A security configuration is a a security scheme applied to a (set of) affordance(s)."
  {:db/ident :td/hasSecurityConfiguration,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "A security configuration is a a security scheme applied to a (set of) affordance(s).@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "hasSecurityConfiguration",
   :schema/domainIncludes [:hctl/Form :td/Thing]})

(def hasSubscriptionSchema
  "Defines data that needs to be passed upon subscription, e.g., filters or message format for setting up Webhooks."
  {:db/ident :td/hasSubscriptionSchema,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Defines data that needs to be passed upon subscription, e.g., filters or message format for setting up Webhooks.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "hasSubscriptionSchema",
   :schema/domainIncludes :td/EventAffordance})

(def hasUriTemplateSchema
  "Define URI template variables  according to [[RFC6570]] as collection based on schema specifications. The individual variables DataSchema cannot be an ObjectSchema or an ArraySchema."
  {:db/ident :td/hasUriTemplateSchema,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Define URI template variables  according to [[RFC6570]] as collection based on schema specifications. The individual variables DataSchema cannot be an ObjectSchema or an ArraySchema.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "hasUriTemplateSchema",
   :schema/domainIncludes :td/InteractionAffordance})

(def instance
  "Provides a version identicator of this TD instance."
  {:db/ident         :td/instance,
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/comment     #xsd/langString
                      "Provides a version identicator of this TD instance.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label       #xsd/string "instance"})

(def invokeAction
  "Operation type of forms used to read a property value"
  {:db/ident :td/invokeAction,
   :rdf/type [:td/OperationType :schema/Enumeration :rdfs/Resource],
   :rdfs/comment #xsd/langString
                  "Operation type of forms used to read a property value@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "invokeAction"})

(def isIdempotent
  "Indicates whether the action is idempotent (=true) or not. Informs whether the action can be called repeatedly with the same result, if present, based on the same input."
  {:db/ident :td/isIdempotent,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "Indicates whether the action is idempotent (=true) or not. Informs whether the action can be called repeatedly with the same result, if present, based on the same input.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "isIdempotent",
   :schema/domainIncludes :td/ActionAffordance,
   :schema/rangeIncludes :schema/Boolean})

(def isObservable
  "A hint that indicates whether Servients hosting the Thing and Intermediaries should provide a Protocol Binding that supports the <code>observeproperty</code> and <code>unobserveproperty</code> operations for this Property."
  {:db/ident :td/isObservable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "A hint that indicates whether Servients hosting the Thing and Intermediaries should provide a Protocol Binding that supports the <code>observeproperty</code> and <code>unobserveproperty</code> operations for this Property.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "isObservable",
   :schema/domainIncludes :td/PropertyAffordance,
   :schema/rangeIncludes :schema/Boolean})

(def isSafe
  "Signals if the action is safe (=true) or not. Used to signal if there is no internal state (cf. resource state) is changed when invoking an Action. In that case responses can be cached as example."
  {:db/ident :td/isSafe,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "Signals if the action is safe (=true) or not. Used to signal if there is no internal state (cf. resource state) is changed when invoking an Action. In that case responses can be cached as example.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "isSafe",
   :schema/domainIncludes :td/ActionAffordance,
   :schema/rangeIncludes :schema/Boolean})

(def isSynchronous
  "Indicates whether the action is synchronous (=true) or not. A synchronous action means that the response of action contains all the information about the result of the action and no further querying about the status of the action is needed. Lack of this keyword means that no claim on the synchronicity of the action can be made."
  {:db/ident :td/isSynchronous,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "Indicates whether the action is synchronous (=true) or not. A synchronous action means that the response of action contains all the information about the result of the action and no further querying about the status of the action is needed. Lack of this keyword means that no claim on the synchronicity of the action can be made.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td#"},
   :rdfs/label #xsd/string "isSynchronous",
   :schema/domainIncludes :td/ActionAffordance,
   :schema/rangeIncludes :schema/Boolean})

(def model
  "Provides a version indicator of the underlying TM."
  {:db/ident         :td/model,
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/comment     #xsd/langString
                      "Provides a version indicator of the underlying TM.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label       #xsd/string "model"})

(def name
  "Indexing property to store entity names when serializing them in a JSON-LD @index container."
  {:db/ident :td/name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "Indexing property to store entity names when serializing them in a JSON-LD @index container.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "name",
   :schema/domainIncludes :td/InteractionAffordance,
   :schema/rangeIncludes :schema/Text})

(def observeAllProperties
  "Operation type of forms used to observe all property values"
  {:db/ident :td/observeAllProperties,
   :rdf/type [:td/OperationType :schema/Enumeration :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Operation type of forms used to observe all property values@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "observeAllProperties"})

(def observeProperty
  "Operation type of forms used to observe a property value"
  {:db/ident :td/observeProperty,
   :rdf/type [:td/OperationType :schema/Enumeration :rdfs/Resource],
   :rdfs/comment #xsd/langString
                  "Operation type of forms used to observe a property value@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "observeProperty"})

(def queryAction
  "Operation type of forms used to query the status of an action"
  {:db/ident :td/queryAction,
   :rdf/type [:td/OperationType :schema/Enumeration :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Operation type of forms used to query the status of an action@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "queryAction"})

(def queryAllActions
  "Operation type of forms used to query the status of all actions"
  {:db/ident :td/queryAllActions,
   :rdf/type [:td/OperationType :schema/Enumeration :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Operation type of forms used to query the status of all actions@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "queryAllActions"})

(def readAllProperties
  "Operation type of forms used to read all property values"
  {:db/ident :td/readAllProperties,
   :rdf/type [:td/OperationType :schema/Enumeration :rdfs/Resource],
   :rdfs/comment #xsd/langString
                  "Operation type of forms used to read all property values@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "readAllProperties"})

(def readMultipleProperties
  "Operation type of forms used to read a property value"
  {:db/ident :td/readMultipleProperties,
   :rdf/type [:td/OperationType :schema/Enumeration :rdfs/Resource],
   :rdfs/comment #xsd/langString
                  "Operation type of forms used to read a property value@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "readMultipleProperties"})

(def readProperty
  "Operation type of forms used to read a property value"
  {:db/ident :td/readProperty,
   :rdf/type [:td/OperationType :schema/Enumeration :rdfs/Resource],
   :rdfs/comment #xsd/langString
                  "Operation type of forms used to read a property value@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "readProperty"})

(def subscribeAllEvents
  "Operation type of forms used to subscribe to all event types"
  {:db/ident :td/subscribeAllEvents,
   :rdf/type [:td/OperationType :schema/Enumeration :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Operation type of forms used to subscribe to all event types@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "subscribeAllEvents"})

(def subscribeEvent
  "Operation type of forms used to read a property value"
  {:db/ident :td/subscribeEvent,
   :rdf/type [:td/OperationType :schema/Enumeration :rdfs/Resource],
   :rdfs/comment #xsd/langString
                  "Operation type of forms used to read a property value@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "subscribeEvent"})

(def supportContact
  "Provides information about the TD maintainer as URI scheme (e.g., mailto [[RFC6068]], tel [[RFC3966]], https[[RFC9112]])."
  {:db/ident :td/supportContact,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #xsd/langString
    "Provides information about the TD maintainer as URI scheme (e.g., mailto [[RFC6068]], tel [[RFC3966]], https[[RFC9112]]).@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "supportContact",
   :rdfs/seeAlso :schema/contactPoint})

(def title
  "title of the TD element (Thing, interaction affordance or data schema)"
  {:db/ident :td/title,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "title of the TD element (Thing, interaction affordance or data schema)",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "title",
   :rdfs/subPropertyOf :dcterms/title,
   :schema/domainIncludes
   [:jsonschema/DataSchema :td/InteractionAffordance :td/Thing],
   :schema/rangeIncludes :schema/Text})

(def titleInLanguage
  "title of the TD element (Thing, interaction affordance or data schema) with language tag. By convention, a language tag must be added to the object of 'titleInLanguage' triples. Otherwise, use 'title'."
  {:db/ident :td/titleInLanguage,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/string
    "title of the TD element (Thing, interaction affordance or data schema) with language tag. By convention, a language tag must be added to the object of 'titleInLanguage' triples. Otherwise, use 'title'.",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "titleInLanguage",
   :rdfs/subPropertyOf :dcterms/title,
   :schema/domainIncludes
   [:jsonschema/DataSchema :td/InteractionAffordance :td/Thing],
   :schema/rangeIncludes :schema/Text})

(def unobserveAllProperties
  "Operation type of forms used to unobserve all property value"
  {:db/ident :td/unobserveAllProperties,
   :rdf/type [:td/OperationType :schema/Enumeration :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Operation type of forms used to unobserve all property value@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "unobserveAllProperties"})

(def unobserveProperty
  "Operation type of forms used to unobserve a property value"
  {:db/ident :td/unobserveProperty,
   :rdf/type [:td/OperationType :schema/Enumeration :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Operation type of forms used to unobserve a property value@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "unobserveProperty"})

(def unsubscribeAllEvents
  "Operation type of forms used to unsubscribe from all event types"
  {:db/ident :td/unsubscribeAllEvents,
   :rdf/type [:td/OperationType :schema/Enumeration :rdfs/Resource],
   :rdfs/comment
   #xsd/langString
    "Operation type of forms used to unsubscribe from all event types@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "unsubscribeAllEvents"})

(def unsubscribeEvent
  "Operation type of forms used to read a property value"
  {:db/ident :td/unsubscribeEvent,
   :rdf/type [:td/OperationType :schema/Enumeration :rdfs/Resource],
   :rdfs/comment #xsd/langString
                  "Operation type of forms used to read a property value@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "unsubscribeEvent"})

(def versionInfo
  "Provides version information."
  {:db/ident         :td/versionInfo,
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/comment     #xsd/langString "Provides version information.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label       #xsd/string "versionInfo",
   :rdfs/seeAlso     :schema/version})

(def writeAllProperties
  "Operation type of forms used to read a property value"
  {:db/ident :td/writeAllProperties,
   :rdf/type [:td/OperationType :schema/Enumeration :rdfs/Resource],
   :rdfs/comment #xsd/langString
                  "Operation type of forms used to read a property value@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "writeAllProperties"})

(def writeMultipleProperties
  "Operation type of forms used to write a property value"
  {:db/ident :td/writeMultipleProperties,
   :rdf/type [:td/OperationType :schema/Enumeration :rdfs/Resource],
   :rdfs/comment #xsd/langString
                  "Operation type of forms used to write a property value@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "writeMultipleProperties"})

(def writeProperty
  "Operation type of forms used to write a property value"
  {:db/ident :td/writeProperty,
   :rdf/type [:td/OperationType :schema/Enumeration :rdfs/Resource],
   :rdfs/comment #xsd/langString
                  "Operation type of forms used to write a property value@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/td"},
   :rdfs/label #xsd/string "writeProperty"})