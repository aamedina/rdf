(ns net.wikipunk.rdf.prov
  {:dcat/downloadURL "http://www.w3.org/ns/prov-o",
   :namespaces       {"owl"  "http://www.w3.org/2002/07/owl#",
                      "prov" "http://www.w3.org/ns/prov#",
                      "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                      "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                      "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type         :owl/Ontology,
   :rdfa/prefix      "prov",
   :rdfa/uri         "http://www.w3.org/ns/prov#",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/TR/prov-o/"},
   :xsd/anyURI       "http://www.w3.org/ns/prov#"}
  (:refer-clojure :exclude [agent]))

(def Activity
  {:db/ident :prov/Activity,
   :owl/disjointWith :prov/Entity,
   :prov/category "starting-point",
   :prov/component "entities-activities",
   :prov/constraints
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"},
   :prov/definition
   "An activity is something that occurs over a period of time and acts upon or with entities; it may include consuming, processing, transforming, modifying, relocating, using, or generating entities.",
   :prov/dm {:xsd/anyURI
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Activity"},
   :prov/n
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Activity"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "Activity"})

(def ActivityInfluence
  {:db/ident :prov/ActivityInfluence,
   :owl/disjointWith :prov/EntityInfluence,
   :prov/category "qualified",
   :prov/editorsDefinition
   {:rdf/language "en",
    :rdf/value
    "ActivitiyInfluence is the capacity of an activity to have an effect on the character, development, or behavior of another by means of generation, invalidation, communication, or other."},
   :rdf/type :owl/Class,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "ActivityInfluence provides additional descriptions of an Activity's binary influence upon any other kind of resource. Instances of ActivityInfluence use the prov:activity property to cite the influencing Activity."}
     {:rdf/language "en",
      :rdf/value
      "It is not recommended that the type ActivityInfluence be asserted without also asserting one of its more specific subclasses."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "ActivityInfluence",
   :rdfs/seeAlso :prov/activity,
   :rdfs/subClassOf #{{:owl/maxCardinality 0,
                       :owl/onProperty     :prov/hadActivity,
                       :rdf/type           :owl/Restriction} :prov/Influence}})

(def Agent
  {:db/ident :prov/Agent,
   :owl/disjointWith :prov/InstantaneousEvent,
   :prov/category "starting-point",
   :prov/component "agents-responsibility",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "An agent is something that bears some form of responsibility for an activity taking place, for the existence of an entity, or for another agent's activity. "},
   :prov/dm {:xsd/anyURI
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-agent"},
   :prov/n {:xsd/anyURI
            "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Agent"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "Agent"})

(def AgentInfluence
  {:db/ident :prov/AgentInfluence,
   :prov/category "qualified",
   :prov/editorsDefinition
   {:rdf/language "en",
    :rdf/value
    "AgentInfluence is the capacity of an agent to have an effect on the character, development, or behavior of another by means of attribution, association, delegation, or other."},
   :rdf/type :owl/Class,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "It is not recommended that the type AgentInfluence be asserted without also asserting one of its more specific subclasses."}
     {:rdf/language "en",
      :rdf/value
      "AgentInfluence provides additional descriptions of an Agent's binary influence upon any other kind of resource. Instances of AgentInfluence use the prov:agent property to cite the influencing Agent."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "AgentInfluence",
   :rdfs/seeAlso :prov/agent,
   :rdfs/subClassOf :prov/Influence})

(def Association
  {:db/ident :prov/Association,
   :prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "An activity association is an assignment of responsibility to an agent for an activity, indicating that the agent had a role in the activity. It further allows for a plan to be specified, which is the plan intended by the agent to achieve some goals in the context of this activity."},
   :prov/dm
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Association"},
   :prov/n
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Association"},
   :prov/unqualifiedForm :prov/wasAssociatedWith,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of prov:Association provides additional descriptions about the binary prov:wasAssociatedWith relation from an prov:Activity to some prov:Agent that had some responsiblity for it. For example, :baking prov:wasAssociatedWith :baker; prov:qualifiedAssociation [ a prov:Association; prov:agent :baker; :foo :bar ]."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "Association",
   :rdfs/subClassOf :prov/AgentInfluence})

(def Attribution
  {:db/ident :prov/Attribution,
   :prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/constraints
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"},
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "Attribution is the ascribing of an entity to an agent.\n\nWhen an entity e is attributed to agent ag, entity e was generated by some unspecified activity that in turn was associated to agent ag. Thus, this relation is useful when the activity is not known, or irrelevant."},
   :prov/dm
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-attribution"},
   :prov/n
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-attribution"},
   :prov/unqualifiedForm :prov/wasAttributedTo,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of prov:Attribution provides additional descriptions about the binary prov:wasAttributedTo relation from an prov:Entity to some prov:Agent that had some responsible for it. For example, :cake prov:wasAttributedTo :baker; prov:qualifiedAttribution [ a prov:Attribution; prov:entity :baker; :foo :bar ]."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "Attribution",
   :rdfs/subClassOf :prov/AgentInfluence})

(def Bundle
  {:db/ident :prov/Bundle,
   :prov/category "expanded",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "A bundle is a named set of provenance descriptions, and is itself an Entity, so allowing provenance of provenance to be expressed."},
   :prov/dm
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-bundle-entity"},
   :prov/n
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-bundle-declaration"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Note that there are kinds of bundles (e.g. handwritten letters, audio recordings, etc.) that are not expressed in PROV-O, but can be still be described by PROV-O."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "Bundle",
   :rdfs/subClassOf :prov/Entity})

(def Collection
  {:db/ident :prov/Collection,
   :prov/category "expanded",
   :prov/component "collections",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "A collection is an entity that provides a structure to some constituents, which are themselves entities. These constituents are said to be member of the collections."},
   :prov/dm {:xsd/anyURI
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-collection"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "Collection",
   :rdfs/subClassOf :prov/Entity})

(def Communication
  {:db/ident :prov/Communication,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/constraints
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"},
   :prov/definition
   "Communication is the exchange of an entity by two activities, one activity using the entity generated by the other.",
   :prov/dm
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Communication"},
   :prov/n
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-wasInformedBy"},
   :prov/unqualifiedForm :prov/wasInformedBy,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of prov:Communication provides additional descriptions about the binary prov:wasInformedBy relation from an informed prov:Activity to the prov:Activity that informed it. For example, :you_jumping_off_bridge prov:wasInformedBy :everyone_else_jumping_off_bridge; prov:qualifiedCommunication [ a prov:Communication; prov:activity :everyone_else_jumping_off_bridge; :foo :bar ]."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "Communication",
   :rdfs/subClassOf :prov/ActivityInfluence})

(def Delegation
  {:db/ident :prov/Delegation,
   :prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "Delegation is the assignment of authority and responsibility to an agent (by itself or by another agent) to carry out a specific activity as a delegate or representative, while the agent it acts on behalf of retains some responsibility for the outcome of the delegated work.\n\nFor example, a student acted on behalf of his supervisor, who acted on behalf of the department chair, who acted on behalf of the university; all those agents are responsible in some way for the activity that took place but we do not say explicitly who bears responsibility and to what degree."},
   :prov/dm {:xsd/anyURI
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-delegation"},
   :prov/n
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-delegation"},
   :prov/unqualifiedForm :prov/actedOnBehalfOf,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of prov:Delegation provides additional descriptions about the binary prov:actedOnBehalfOf relation from a performing prov:Agent to some prov:Agent for whom it was performed. For example, :mixing prov:wasAssociatedWith :toddler . :toddler prov:actedOnBehalfOf :mother; prov:qualifiedDelegation [ a prov:Delegation; prov:entity :mother; :foo :bar ]."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "Delegation",
   :rdfs/subClassOf :prov/AgentInfluence})

(def Derivation
  {:db/ident :prov/Derivation,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/constraints
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"},
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "A derivation is a transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a pre-existing entity."},
   :prov/dm {:xsd/anyURI
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Derivation"},
   :prov/n
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#Derivation-Relation"},
   :prov/unqualifiedForm :prov/wasDerivedFrom,
   :rdf/type :owl/Class,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "An instance of prov:Derivation provides additional descriptions about the binary prov:wasDerivedFrom relation from some derived prov:Entity to another prov:Entity from which it was derived. For example, :chewed_bubble_gum prov:wasDerivedFrom :unwrapped_bubble_gum; prov:qualifiedDerivation [ a prov:Derivation; prov:entity :unwrapped_bubble_gum; :foo :bar ]."}
     {:rdf/language "en",
      :rdf/value
      "The more specific forms of prov:Derivation (i.e., prov:Revision, prov:Quotation, prov:PrimarySource) should be asserted if they apply."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "Derivation",
   :rdfs/subClassOf :prov/EntityInfluence})

(def EmptyCollection
  {:db/ident         :prov/EmptyCollection,
   :prov/category    "expanded",
   :prov/component   "collections",
   :prov/definition  {:rdf/language "en",
                      :rdf/value
                      "An empty collection is a collection without members."},
   :rdf/type         #{:owl/NamedIndividual :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "EmptyCollection"},
   :rdfs/subClassOf  :prov/Collection})

(def End
  {:db/ident :prov/End,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/constraints
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"},
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "End is when an activity is deemed to have been ended by an entity, known as trigger. The activity no longer exists after its end. Any usage, generation, or invalidation involving an activity precedes the activity's end. An end may refer to a trigger entity that terminated the activity, or to an activity, known as ender that generated the trigger."},
   :prov/dm {:xsd/anyURI
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-End"},
   :prov/n {:xsd/anyURI
            "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-End"},
   :prov/unqualifiedForm :prov/wasEndedBy,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of prov:End provides additional descriptions about the binary prov:wasEndedBy relation from some ended prov:Activity to an prov:Entity that ended it. For example, :ball_game prov:wasEndedBy :buzzer; prov:qualifiedEnd [ a prov:End; prov:entity :buzzer; :foo :bar; prov:atTime '2012-03-09T08:05:08-05:00'^^xsd:dateTime ]."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "End",
   :rdfs/subClassOf #{:prov/InstantaneousEvent :prov/EntityInfluence}})

(def Entity
  {:db/ident :prov/Entity,
   :owl/disjointWith :prov/InstantaneousEvent,
   :prov/category "starting-point",
   :prov/component "entities-activities",
   :prov/constraints
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"},
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "An entity is a physical, digital, conceptual, or other kind of thing with some fixed aspects; entities may be real or imaginary. "},
   :prov/dm {:xsd/anyURI
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-entity"},
   :prov/n {:xsd/anyURI
            "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Entity"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "Entity"})

(def EntityInfluence
  {:db/ident :prov/EntityInfluence,
   :prov/category "qualified",
   :prov/editorsDefinition
   {:rdf/language "en",
    :rdf/value
    "EntityInfluence is the capacity of an entity to have an effect on the character, development, or behavior of another by means of usage, start, end, derivation, or other. "},
   :rdf/type :owl/Class,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "EntityInfluence provides additional descriptions of an Entity's binary influence upon any other kind of resource. Instances of EntityInfluence use the prov:entity property to cite the influencing Entity."}
     {:rdf/language "en",
      :rdf/value
      "It is not recommended that the type EntityInfluence be asserted without also asserting one of its more specific subclasses."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "EntityInfluence",
   :rdfs/seeAlso :prov/entity,
   :rdfs/subClassOf :prov/Influence})

(def Generation
  {:db/ident :prov/Generation,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/constraints
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"},
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "Generation is the completion of production of a new entity by an activity. This entity did not exist before generation and becomes available for usage after this generation."},
   :prov/dm {:xsd/anyURI
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Generation"},
   :prov/n
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Generation"},
   :prov/unqualifiedForm :prov/wasGeneratedBy,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of prov:Generation provides additional descriptions about the binary prov:wasGeneratedBy relation from a generated prov:Entity to the prov:Activity that generated it. For example, :cake prov:wasGeneratedBy :baking; prov:qualifiedGeneration [ a prov:Generation; prov:activity :baking; :foo :bar ]."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "Generation",
   :rdfs/subClassOf #{:prov/ActivityInfluence :prov/InstantaneousEvent}})

(def Influence
  {:db/ident :prov/Influence,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "Influence is the capacity of an entity, activity, or agent to have an effect on the character, development, or behavior of another by means of usage, start, end, generation, invalidation, communication, derivation, attribution, association, or delegation."},
   :prov/dm {:xsd/anyURI
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-influence"},
   :prov/n
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-influence"},
   :prov/unqualifiedForm :prov/wasInfluencedBy,
   :rdf/type :owl/Class,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "An instance of prov:Influence provides additional descriptions about the binary prov:wasInfluencedBy relation from some influenced Activity, Entity, or Agent to the influencing Activity, Entity, or Agent. For example, :stomach_ache prov:wasInfluencedBy :spoon; prov:qualifiedInfluence [ a prov:Influence; prov:entity :spoon; :foo :bar ] . Because prov:Influence is a broad relation, the more specific relations (Communication, Delegation, End, etc.) should be used when applicable."}
     {:rdf/language "en",
      :rdf/value
      "Because prov:Influence is a broad relation, its most specific subclasses (e.g. prov:Communication, prov:Delegation, prov:End, prov:Revision, etc.) should be used when applicable."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "Influence"})

(def InstantaneousEvent
  {:db/ident :prov/InstantaneousEvent,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/constraints
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#dfn-event"},
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "The PROV data model is implicitly based on a notion of instantaneous events (or just events), that mark transitions in the world. Events include generation, usage, or invalidation of entities, as well as starting or ending of activities. This notion of event is not first-class in the data model, but it is useful for explaining its other concepts and its semantics."},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instantaneous event, or event for short, happens in the world and marks a change in the world, in its activities and in its entities. The term 'event' is commonly used in process algebra with a similar meaning. Events represent communications or interactions; they are assumed to be atomic and instantaneous."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "InstantaneousEvent"})

(def Invalidation
  {:db/ident :prov/Invalidation,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/constraints
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"},
   :prov/definition
   "Invalidation is the start of the destruction, cessation, or expiry of an existing entity by an activity. The entity is no longer available for use (or further invalidation) after invalidation. Any generation or usage of an entity precedes its invalidation.",
   :prov/dm
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Invalidation"},
   :prov/n
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Invalidation"},
   :prov/unqualifiedForm :prov/wasInvalidatedBy,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of prov:Invalidation provides additional descriptions about the binary prov:wasInvalidatedBy relation from an invalidated prov:Entity to the prov:Activity that invalidated it. For example, :uncracked_egg prov:wasInvalidatedBy :baking; prov:qualifiedInvalidation [ a prov:Invalidation; prov:activity :baking; :foo :bar ]."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "Invalidation",
   :rdfs/subClassOf #{:prov/ActivityInfluence :prov/InstantaneousEvent}})

(def Location
  {:db/ident :prov/Location,
   :prov/category "expanded",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "A location can be an identifiable geographic place (ISO 19112), but it can also be a non-geographic place such as a directory, row, or column. As such, there are numerous ways in which location can be expressed, such as by a coordinate, address, landmark, and so forth."},
   :prov/dm
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-attribute-location"},
   :prov/n
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-attribute"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "Location",
   :rdfs/seeAlso :prov/atLocation})

(def Organization
  {:db/ident :prov/Organization,
   :prov/category "expanded",
   :prov/component "agents-responsibility",
   :prov/definition
   "An organization is a social or legal institution such as a company, society, etc.",
   :prov/dm {:xsd/anyURI
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-agent"},
   :prov/n {:xsd/anyURI
            "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-types"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "Organization",
   :rdfs/subClassOf :prov/Agent})

(def Person
  {:db/ident :prov/Person,
   :prov/category "expanded",
   :prov/component "agents-responsibility",
   :prov/definition {:rdf/language "en",
                     :rdf/value    "Person agents are people."},
   :prov/dm {:xsd/anyURI
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-agent"},
   :prov/n {:xsd/anyURI
            "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-types"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "Person",
   :rdfs/subClassOf :prov/Agent})

(def Plan
  {:db/ident :prov/Plan,
   :prov/category #{"qualified" "expanded"},
   :prov/component "agents-responsibility",
   :prov/definition
   "A plan is an entity that represents a set of actions or steps intended by one or more agents to achieve some goals.",
   :prov/dm
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Association"},
   :prov/n
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Association"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "There exist no prescriptive requirement on the nature of plans, their representation, the actions or steps they consist of, or their intended goals. Since plans may evolve over time, it may become necessary to track their provenance, so plans themselves are entities. Representing the plan explicitly in the provenance can be useful for various tasks: for example, to validate the execution as represented in the provenance record, to manage expectation failures, or to provide explanations."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "Plan",
   :rdfs/subClassOf :prov/Entity})

(def PrimarySource
  {:db/ident :prov/PrimarySource,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "A primary source for a topic refers to something produced by some agent with direct experience and knowledge about the topic, at the time of the topic's study, without benefit from hindsight.\n\nBecause of the directness of primary sources, they 'speak for themselves' in ways that cannot be captured through the filter of secondary sources. As such, it is important for secondary sources to reference those primary sources from which they were derived, so that their reliability can be investigated.\n\nA primary source relation is a particular case of derivation of secondary materials from their primary sources. It is recognized that the determination of primary sources can be up to interpretation, and should be done according to conventions accepted within the application's domain."},
   :prov/dm
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-primary-source"},
   :prov/n
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-original-source"},
   :prov/unqualifiedForm :prov/hadPrimarySource,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of prov:PrimarySource provides additional descriptions about the binary prov:hadPrimarySource relation from some secondary prov:Entity to an earlier, primary prov:Entity. For example, :blog prov:hadPrimarySource :newsArticle; prov:qualifiedPrimarySource [ a prov:PrimarySource; prov:entity :newsArticle; :foo :bar ] ."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "PrimarySource",
   :rdfs/subClassOf :prov/Derivation})

(def Quotation
  {:db/ident :prov/Quotation,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "A quotation is the repeat of (some or all of) an entity, such as text or image, by someone who may or may not be its original author. Quotation is a particular case of derivation."},
   :prov/dm {:xsd/anyURI
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-quotation"},
   :prov/n
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-quotation"},
   :prov/unqualifiedForm :prov/wasQuotedFrom,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of prov:Quotation provides additional descriptions about the binary prov:wasQuotedFrom relation from some taken prov:Entity from an earlier, larger prov:Entity. For example, :here_is_looking_at_you_kid prov:wasQuotedFrom :casablanca_script; prov:qualifiedQuotation [ a prov:Quotation; prov:entity :casablanca_script; :foo :bar ]."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "Quotation",
   :rdfs/subClassOf :prov/Derivation})

(def Revision
  {:db/ident :prov/Revision,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "A revision is a derivation for which the resulting entity is a revised version of some original. The implication here is that the resulting entity contains substantial content from the original. Revision is a particular case of derivation."},
   :prov/dm {:xsd/anyURI
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-revision"},
   :prov/n
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Revision"},
   :prov/unqualifiedForm :prov/wasRevisionOf,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of prov:Revision provides additional descriptions about the binary prov:wasRevisionOf relation from some newer prov:Entity to an earlier prov:Entity. For example, :draft_2 prov:wasRevisionOf :draft_1; prov:qualifiedRevision [ a prov:Revision; prov:entity :draft_1; :foo :bar ]."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "Revision",
   :rdfs/subClassOf :prov/Derivation})

(def Role
  {:db/ident :prov/Role,
   :prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "A role is the function of an entity or agent with respect to an activity, in the context of a usage, generation, invalidation, association, start, and end."},
   :prov/dm
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-attribute-role"},
   :prov/n
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-attribute"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "Role",
   :rdfs/seeAlso :prov/hadRole})

(def SoftwareAgent
  {:db/ident :prov/SoftwareAgent,
   :prov/category "expanded",
   :prov/component "agents-responsibility",
   :prov/definition {:rdf/language "en",
                     :rdf/value    "A software agent is running software."},
   :prov/dm {:xsd/anyURI
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-agent"},
   :prov/n {:xsd/anyURI
            "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-types"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "SoftwareAgent",
   :rdfs/subClassOf :prov/Agent})

(def Start
  {:db/ident :prov/Start,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/constraints
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"},
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "Start is when an activity is deemed to have been started by an entity, known as trigger. The activity did not exist before its start. Any usage, generation, or invalidation involving an activity follows the activity's start. A start may refer to a trigger entity that set off the activity, or to an activity, known as starter, that generated the trigger."},
   :prov/dm {:xsd/anyURI
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Start"},
   :prov/n {:xsd/anyURI
            "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Start"},
   :prov/unqualifiedForm :prov/wasStartedBy,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of prov:Start provides additional descriptions about the binary prov:wasStartedBy relation from some started prov:Activity to an prov:Entity that started it. For example, :foot_race prov:wasStartedBy :bang; prov:qualifiedStart [ a prov:Start; prov:entity :bang; :foo :bar; prov:atTime '2012-03-09T08:05:08-05:00'^^xsd:dateTime ] ."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "Start",
   :rdfs/subClassOf #{:prov/InstantaneousEvent :prov/EntityInfluence}})

(def Usage
  {:db/ident :prov/Usage,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/constraints
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"},
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "Usage is the beginning of utilizing an entity by an activity. Before usage, the activity had not begun to utilize this entity and could not have been affected by the entity."},
   :prov/dm {:xsd/anyURI
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Usage"},
   :prov/n {:xsd/anyURI
            "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Usage"},
   :prov/unqualifiedForm :prov/used,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An instance of prov:Usage provides additional descriptions about the binary prov:used relation from some prov:Activity to an prov:Entity that it used. For example, :keynote prov:used :podium; prov:qualifiedUsage [ a prov:Usage; prov:entity :podium; :foo :bar ]."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "Usage",
   :rdfs/subClassOf #{:prov/InstantaneousEvent :prov/EntityInfluence}})

(def actedOnBehalfOf
  {:db/ident :prov/actedOnBehalfOf,
   :owl/propertyChainAxiom [:prov/qualifiedDelegation :prov/agent],
   :prov/category "starting-point",
   :prov/component "agents-responsibility",
   :prov/inverse "hadDelegate",
   :prov/qualifiedForm #{:prov/Delegation :prov/qualifiedDelegation},
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An object property to express the accountability of an agent towards another agent. The subordinate agent acted on behalf of the responsible agent in an actual activity. "},
   :rdfs/domain :prov/Agent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "actedOnBehalfOf",
   :rdfs/range :prov/Agent,
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def activity
  {:db/ident :prov/activity,
   :prov/category "qualified",
   :prov/editorialNote
   {:rdf/language "en",
    :rdf/value
    "This property behaves in spirit like rdf:object; it references the object of a prov:wasInfluencedBy triple."},
   :prov/editorsDefinition
   "The prov:activity property references an prov:Activity which influenced a resource. This property applies to an prov:ActivityInfluence, which is given by a subproperty of prov:qualifiedInfluence from the influenced prov:Entity, prov:Activity or prov:Agent.",
   :prov/inverse "activityOfInfluence",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/ActivityInfluence,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "activity",
   :rdfs/range :prov/Activity,
   :rdfs/subPropertyOf :prov/influencer})

(def agent
  {:db/ident :prov/agent,
   :prov/category "qualified",
   :prov/editorialNote
   {:rdf/language "en",
    :rdf/value
    "This property behaves in spirit like rdf:object; it references the object of a prov:wasInfluencedBy triple."},
   :prov/editorsDefinition
   {:rdf/language "en",
    :rdf/value
    "The prov:agent property references an prov:Agent which influenced a resource. This property applies to an prov:AgentInfluence, which is given by a subproperty of prov:qualifiedInfluence from the influenced prov:Entity, prov:Activity or prov:Agent."},
   :prov/inverse "agentOfInfluence",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/AgentInfluence,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "agent",
   :rdfs/range :prov/Agent,
   :rdfs/subPropertyOf :prov/influencer})

(def alternateOf
  {:db/ident :prov/alternateOf,
   :prov/category "expanded",
   :prov/component "alternate",
   :prov/constraints
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"},
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "Two alternate entities present aspects of the same thing. These aspects may be the same or different, and the alternate entities may or may not overlap in time."},
   :prov/dm {:xsd/anyURI
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-alternate"},
   :prov/inverse "alternateOf",
   :prov/n
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-alternate"},
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "alternateOf",
   :rdfs/range :prov/Entity,
   :rdfs/seeAlso :prov/specializationOf})

(def aq
  {:db/ident         :prov/aq,
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def atLocation
  {:db/ident :prov/atLocation,
   :prov/category "expanded",
   :prov/editorialNote
   #{{:rdf/language "en",
      :rdf/value
      "The naming of prov:atLocation parallels prov:atTime, and is not named prov:hadLocation to avoid conflicting with the convention that prov:had* properties are used on prov:Influence classes."}
     {:rdf/language "en",
      :rdf/value
      "This property is not functional because the many values could be at a variety of granularies (In this building, in this room, in that chair)."}},
   :prov/inverse "locationOf",
   :prov/sharesDefinitionWith :prov/Location,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value    "The Location of any resource."}
     "This property has multiple RDFS domains to suit multiple OWL Profiles. See <a href=\"#owl-profile\">PROV-O OWL Profile</a>."},
   :rdfs/domain {:owl/unionOf [:prov/Activity
                               :prov/Agent
                               :prov/Entity
                               :prov/InstantaneousEvent],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "atLocation",
   :rdfs/range :prov/Location})

(def atTime
  {:db/ident :prov/atTime,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/sharesDefinitionWith :prov/InstantaneousEvent,
   :prov/unqualifiedForm #{:prov/endedAtTime :prov/generatedAtTime
                           :prov/invalidatedAtTime :prov/startedAtTime},
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The time at which an InstantaneousEvent occurred, in the form of xsd:dateTime."},
   :rdfs/domain :prov/InstantaneousEvent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "atTime",
   :rdfs/range :xsd/dateTime})

(def category
  {:db/ident :prov/category,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Classify prov-o terms into three categories, including 'starting-point', 'qualifed', and 'extended'. This classification is used by the prov-o html document to gently introduce prov-o terms to its users. "},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"}})

(def component
  {:db/ident :prov/component,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Classify prov-o terms into six components according to prov-dm, including 'agents-responsibility', 'alternate', 'annotations', 'collections', 'derivations', and 'entities-activities'. This classification is used so that readers of prov-o specification can find its correspondence with the prov-dm specification."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"}})

(def constraints
  {:db/ident :prov/constraints,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A reference to the principal section of the PROV-CONSTRAINTS document that describes this concept."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def definition
  {:db/ident :prov/definition,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A definition quoted from PROV-DM or PROV-CONSTRAINTS that describes the concept expressed with this OWL term."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"}})

(def dm
  {:db/ident :prov/dm,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A reference to the principal section of the PROV-DM document that describes this concept."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def editorialNote
  {:db/ident :prov/editorialNote,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A note by the OWL development team about how this term expresses the PROV-DM concept, or how it should be used in context of semantic web or linked data."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"}})

(def editorsDefinition
  {:db/ident :prov/editorsDefinition,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "When the prov-o term does not have a definition drawn from prov-dm, and the prov-o editor provides one."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/subPropertyOf :prov/definition})

(def endedAtTime
  {:db/ident :prov/endedAtTime,
   :prov/category "starting-point",
   :prov/component "entities-activities",
   :prov/editorialNote
   {:rdf/language "en",
    :rdf/value
    "It is the intent that the property chain holds: (prov:qualifiedEnd o prov:atTime) rdfs:subPropertyOf prov:endedAtTime."},
   :prov/qualifiedForm #{:prov/End :prov/atTime},
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The time at which an activity ended. See also prov:startedAtTime."},
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "endedAtTime",
   :rdfs/range :xsd/dateTime})

(def entity
  {:db/ident :prov/entity,
   :prov/category "qualified",
   :prov/editorialNote
   {:rdf/language "en",
    :rdf/value
    "This property behaves in spirit like rdf:object; it references the object of a prov:wasInfluencedBy triple."},
   :prov/editorsDefinition
   "The prov:entity property references an prov:Entity which influenced a resource. This property applies to an prov:EntityInfluence, which is given by a subproperty of prov:qualifiedInfluence from the influenced prov:Entity, prov:Activity or prov:Agent.",
   :prov/inverse "entityOfInfluence",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/EntityInfluence,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "entity",
   :rdfs/range :prov/Entity,
   :rdfs/subPropertyOf :prov/influencer})

(def generated
  {:db/ident :prov/generated,
   :owl/inverseOf :prov/wasGeneratedBy,
   :prov/category "expanded",
   :prov/component "entities-activities",
   :prov/editorialNote
   {:rdf/language "en",
    :rdf/value
    "prov:generated is one of few inverse property defined, to allow Activity-oriented assertions in addition to Entity-oriented assertions."},
   :prov/inverse "wasGeneratedBy",
   :prov/sharesDefinitionWith :prov/Generation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "generated",
   :rdfs/range :prov/Entity,
   :rdfs/subPropertyOf :prov/influenced})

(def generatedAtTime
  {:db/ident :prov/generatedAtTime,
   :prov/category "expanded",
   :prov/component "entities-activities",
   :prov/editorialNote
   {:rdf/language "en",
    :rdf/value
    "It is the intent that the property chain holds: (prov:qualifiedGeneration o prov:atTime) rdfs:subPropertyOf prov:generatedAtTime."},
   :prov/qualifiedForm #{:prov/Generation :prov/atTime},
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The time at which an entity was completely created and is available for use."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "generatedAtTime",
   :rdfs/range :xsd/dateTime})

(def hadActivity
  {:db/ident :prov/hadActivity,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/editorialNote
   {:rdf/language "en",
    :rdf/value
    "The multiple rdfs:domain assertions are intended. One is simpler and works for OWL-RL, the union is more specific but is not recognized by OWL-RL."},
   :prov/inverse "wasActivityOfInfluence",
   :prov/sharesDefinitionWith :prov/Activity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The _optional_ Activity of an Influence, which used, generated, invalidated, or was the responsibility of some Entity. This property is _not_ used by ActivityInfluence (use prov:activity instead)."}
     "This property has multiple RDFS domains to suit multiple OWL Profiles. See <a href=\"#owl-profile\">PROV-O OWL Profile</a>."},
   :rdfs/domain
   #{{:owl/unionOf [:prov/Delegation :prov/Derivation :prov/End :prov/Start],
      :rdf/type    :owl/Class} :prov/Influence},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "hadActivity",
   :rdfs/range :prov/Activity})

(def hadGeneration
  {:db/ident :prov/hadGeneration,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/inverse "generatedAsDerivation",
   :prov/sharesDefinitionWith :prov/Generation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The _optional_ Generation involved in an Entity's Derivation."},
   :rdfs/domain :prov/Derivation,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "hadGeneration",
   :rdfs/range :prov/Generation})

(def hadMember
  {:db/ident           :prov/hadMember,
   :prov/category      "expanded",
   :prov/component     "expanded",
   :prov/inverse       "wasMemberOf",
   :prov/sharesDefinitionWith :prov/Collection,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :prov/Collection,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label         "hadMember",
   :rdfs/range         :prov/Entity,
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def hadPlan
  {:db/ident :prov/hadPlan,
   :prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/inverse "wasPlanOf",
   :prov/sharesDefinitionWith :prov/Plan,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The _optional_ Plan adopted by an Agent in Association with some Activity. Plan specifications are out of the scope of this specification."},
   :rdfs/domain :prov/Association,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "hadPlan",
   :rdfs/range :prov/Plan})

(def hadPrimarySource
  {:db/ident               :prov/hadPrimarySource,
   :owl/propertyChainAxiom [:prov/qualifiedPrimarySource :prov/entity],
   :prov/category          "expanded",
   :prov/component         "derivations",
   :prov/inverse           "wasPrimarySourceOf",
   :prov/qualifiedForm     #{:prov/qualifiedPrimarySource :prov/PrimarySource},
   :rdf/type               :owl/ObjectProperty,
   :rdfs/domain            :prov/Entity,
   :rdfs/isDefinedBy       {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label             "hadPrimarySource",
   :rdfs/range             :prov/Entity,
   :rdfs/subPropertyOf     :prov/wasDerivedFrom})

(def hadRole
  {:db/ident :prov/hadRole,
   :prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/editorsDefinition
   {:rdf/language "en",
    :rdf/value
    "prov:hadRole references the Role (i.e. the function of an entity with respect to an activity), in the context of an instantaneous usage, generation, association, start, and end."},
   :prov/inverse "wasRoleIn",
   :prov/sharesDefinitionWith :prov/Role,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{"This property has multiple RDFS domains to suit multiple OWL Profiles. See <a href=\"#owl-profile\">PROV-O OWL Profile</a>."
     {:rdf/language "en",
      :rdf/value
      "The _optional_ Role that an Entity assumed in the context of an Activity. For example, :baking prov:used :spoon; prov:qualified [ a prov:Usage; prov:entity :spoon; prov:hadRole roles:mixing_implement ]."}},
   :rdfs/domain #{{:owl/unionOf [:prov/Association :prov/InstantaneousEvent],
                   :rdf/type    :owl/Class} :prov/Influence},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "hadRole",
   :rdfs/range :prov/Role})

(def hadUsage
  {:db/ident :prov/hadUsage,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/inverse "wasUsedInDerivation",
   :prov/sharesDefinitionWith :prov/Usage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The _optional_ Usage involved in an Entity's Derivation."},
   :rdfs/domain :prov/Derivation,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "hadUsage",
   :rdfs/range :prov/Usage})

(def influenced
  {:db/ident         :prov/influenced,
   :owl/inverseOf    :prov/wasInfluencedBy,
   :prov/category    "expanded",
   :prov/component   "agents-responsibility",
   :prov/inverse     "wasInfluencedBy",
   :prov/sharesDefinitionWith :prov/Influence,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label       "influenced"})

(def influencer
  {:db/ident :prov/influencer,
   :prov/category "qualified",
   :prov/dm {:xsd/anyURI
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-influence"},
   :prov/editorialNote
   {:rdf/language "en",
    :rdf/value
    "This property and its subproperties are used in the same way as the rdf:object property, i.e. to reference the object of an unqualified prov:wasInfluencedBy or prov:influenced triple."},
   :prov/editorsDefinition
   {:rdf/language "en",
    :rdf/value
    "This property is used as part of the qualified influence pattern. Subclasses of prov:Influence use these subproperties to reference the resource (Entity, Agent, or Activity) whose influence is being qualified."},
   :prov/inverse "hadInfluence",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Subproperties of prov:influencer are used to cite the object of an unqualified PROV-O triple whose predicate is a subproperty of prov:wasInfluencedBy (e.g. prov:used, prov:wasGeneratedBy). prov:influencer is used much like rdf:object is used."},
   :rdfs/domain :prov/Influence,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "influencer",
   :rdfs/range :owl/Thing})

(def invalidated
  {:db/ident :prov/invalidated,
   :owl/inverseOf :prov/wasInvalidatedBy,
   :prov/category "expanded",
   :prov/component "entities-activities",
   :prov/editorialNote
   {:rdf/language "en",
    :rdf/value
    "prov:invalidated is one of few inverse property defined, to allow Activity-oriented assertions in addition to Entity-oriented assertions."},
   :prov/inverse "wasInvalidatedBy",
   :prov/sharesDefinitionWith :prov/Invalidation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "invalidated",
   :rdfs/range :prov/Entity,
   :rdfs/subPropertyOf :prov/influenced})

(def invalidatedAtTime
  {:db/ident :prov/invalidatedAtTime,
   :prov/category "expanded",
   :prov/component "entities-activities",
   :prov/editorialNote
   {:rdf/language "en",
    :rdf/value
    "It is the intent that the property chain holds: (prov:qualifiedInvalidation o prov:atTime) rdfs:subPropertyOf prov:invalidatedAtTime."},
   :prov/qualifiedForm #{:prov/Invalidation :prov/atTime},
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The time at which an entity was invalidated (i.e., no longer usable)."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "invalidatedAtTime",
   :rdfs/range :xsd/dateTime})

(def inverse
  {:db/ident :prov/inverse,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "PROV-O does not define all property inverses. The directionalities defined in PROV-O should be given preference over those not defined. However, if users wish to name the inverse of a PROV-O property, the local name given by prov:inverse should be used."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/seeAlso {:xsd/anyURI
                  "http://www.w3.org/TR/prov-o/#names-of-inverse-properties"}})

(def n
  {:db/ident :prov/n,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A reference to the principal section of the PROV-DM document that describes this concept."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def order
  {:db/ident :prov/order,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The position that this OWL term should be listed within documentation. The scope of the documentation (e.g., among all terms, among terms within a prov:category, among properties applying to a particular class, etc.) is unspecified."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"}})

(def qualifiedAssociation
  {:db/ident :prov/qualifiedAssociation,
   :prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/inverse "qualifiedAssociationOf",
   :prov/sharesDefinitionWith :prov/Association,
   :prov/unqualifiedForm :prov/wasAssociatedWith,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Activity prov:wasAssociatedWith Agent :ag, then it can qualify the Association using prov:qualifiedAssociation [ a prov:Association;  prov:agent :ag; :foo :bar ]."},
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "qualifiedAssociation",
   :rdfs/range :prov/Association,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedAttribution
  {:db/ident :prov/qualifiedAttribution,
   :prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/inverse "qualifiedAttributionOf",
   :prov/sharesDefinitionWith :prov/Attribution,
   :prov/unqualifiedForm :prov/wasAttributedTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Entity prov:wasAttributedTo Agent :ag, then it can qualify how it was influenced using prov:qualifiedAttribution [ a prov:Attribution;  prov:agent :ag; :foo :bar ]."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "qualifiedAttribution",
   :rdfs/range :prov/Attribution,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedCommunication
  {:db/ident :prov/qualifiedCommunication,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/inverse "qualifiedCommunicationOf",
   :prov/qualifiedForm :prov/Communication,
   :prov/sharesDefinitionWith :prov/Communication,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Activity prov:wasInformedBy Activity :a, then it can qualify how it was influenced using prov:qualifiedCommunication [ a prov:Communication;  prov:activity :a; :foo :bar ]."},
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "qualifiedCommunication",
   :rdfs/range :prov/Communication,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedDelegation
  {:db/ident :prov/qualifiedDelegation,
   :prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/inverse "qualifiedDelegationOf",
   :prov/sharesDefinitionWith :prov/Delegation,
   :prov/unqualifiedForm :prov/actedOnBehalfOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Agent prov:actedOnBehalfOf Agent :ag, then it can qualify how with prov:qualifiedResponsibility [ a prov:Responsibility;  prov:agent :ag; :foo :bar ]."},
   :rdfs/domain :prov/Agent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "qualifiedDelegation",
   :rdfs/range :prov/Delegation,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedDerivation
  {:db/ident :prov/qualifiedDerivation,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/inverse "qualifiedDerivationOf",
   :prov/sharesDefinitionWith :prov/Derivation,
   :prov/unqualifiedForm :prov/wasDerivedFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Entity prov:wasDerivedFrom Entity :e, then it can qualify how it was derived using prov:qualifiedDerivation [ a prov:Derivation;  prov:entity :e; :foo :bar ]."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "qualifiedDerivation",
   :rdfs/range :prov/Derivation,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedEnd
  {:db/ident :prov/qualifiedEnd,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/inverse "qualifiedEndOf",
   :prov/sharesDefinitionWith :prov/End,
   :prov/unqualifiedForm :prov/wasEndedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Activity prov:wasEndedBy Entity :e1, then it can qualify how it was ended using prov:qualifiedEnd [ a prov:End;  prov:entity :e1; :foo :bar ]."},
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "qualifiedEnd",
   :rdfs/range :prov/End,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedForm
  {:db/ident :prov/qualifiedForm,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This annotation property links a subproperty of prov:wasInfluencedBy with the subclass of prov:Influence and the qualifying property that are used to qualify it. \n\nExample annotation:\n\n    prov:wasGeneratedBy prov:qualifiedForm prov:qualifiedGeneration, prov:Generation .\n\nThen this unqualified assertion:\n\n    :entity1 prov:wasGeneratedBy :activity1 .\n\ncan be qualified by adding:\n\n   :entity1 prov:qualifiedGeneration :entity1Gen .\n   :entity1Gen \n       a prov:Generation, prov:Influence;\n       prov:activity :activity1;\n       :customValue 1337 .\n\nNote how the value of the unqualified influence (prov:wasGeneratedBy :activity1) is mirrored as the value of the prov:activity (or prov:entity, or prov:agent) property on the influence class."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def qualifiedGeneration
  {:db/ident :prov/qualifiedGeneration,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/inverse "qualifiedGenerationOf",
   :prov/sharesDefinitionWith :prov/Generation,
   :prov/unqualifiedForm :prov/wasGeneratedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Activity prov:generated Entity :e, then it can qualify how it performed the Generation using prov:qualifiedGeneration [ a prov:Generation;  prov:entity :e; :foo :bar ]."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "qualifiedGeneration",
   :rdfs/range :prov/Generation,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedInfluence
  {:db/ident :prov/qualifiedInfluence,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/inverse "qualifiedInfluenceOf",
   :prov/sharesDefinitionWith :prov/Influence,
   :prov/unqualifiedForm :prov/wasInfluencedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Because prov:qualifiedInfluence is a broad relation, the more specific relations (qualifiedCommunication, qualifiedDelegation, qualifiedEnd, etc.) should be used when applicable."},
   :rdfs/domain {:owl/unionOf [:prov/Activity :prov/Agent :prov/Entity],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "qualifiedInfluence",
   :rdfs/range :prov/Influence})

(def qualifiedInvalidation
  {:db/ident :prov/qualifiedInvalidation,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/inverse "qualifiedInvalidationOf",
   :prov/sharesDefinitionWith :prov/Invalidation,
   :prov/unqualifiedForm :prov/wasInvalidatedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Entity prov:wasInvalidatedBy Activity :a, then it can qualify how it was invalidated using prov:qualifiedInvalidation [ a prov:Invalidation;  prov:activity :a; :foo :bar ]."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "qualifiedInvalidation",
   :rdfs/range :prov/Invalidation,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedPrimarySource
  {:db/ident :prov/qualifiedPrimarySource,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/inverse "qualifiedSourceOf",
   :prov/sharesDefinitionWith :prov/PrimarySource,
   :prov/unqualifiedForm :prov/hadPrimarySource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Entity prov:hadPrimarySource Entity :e, then it can qualify how using prov:qualifiedPrimarySource [ a prov:PrimarySource; prov:entity :e; :foo :bar ]."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "qualifiedPrimarySource",
   :rdfs/range :prov/PrimarySource,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedQuotation
  {:db/ident :prov/qualifiedQuotation,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/inverse "qualifiedQuotationOf",
   :prov/sharesDefinitionWith :prov/Quotation,
   :prov/unqualifiedForm :prov/wasQuotedFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Entity prov:wasQuotedFrom Entity :e, then it can qualify how using prov:qualifiedQuotation [ a prov:Quotation;  prov:entity :e; :foo :bar ]."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "qualifiedQuotation",
   :rdfs/range :prov/Quotation,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedRevision
  {:db/ident :prov/qualifiedRevision,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/inverse "revisedEntity",
   :prov/sharesDefinitionWith :prov/Revision,
   :prov/unqualifiedForm :prov/wasRevisionOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Entity prov:wasRevisionOf Entity :e, then it can qualify how it was revised using prov:qualifiedRevision [ a prov:Revision;  prov:entity :e; :foo :bar ]."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "qualifiedRevision",
   :rdfs/range :prov/Revision,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedStart
  {:db/ident :prov/qualifiedStart,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/inverse "qualifiedStartOf",
   :prov/sharesDefinitionWith :prov/Start,
   :prov/unqualifiedForm :prov/wasStartedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Activity prov:wasStartedBy Entity :e1, then it can qualify how it was started using prov:qualifiedStart [ a prov:Start;  prov:entity :e1; :foo :bar ]."},
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "qualifiedStart",
   :rdfs/range :prov/Start,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedUsage
  {:db/ident :prov/qualifiedUsage,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/inverse "qualifiedUsingActivity",
   :prov/sharesDefinitionWith :prov/Usage,
   :prov/unqualifiedForm :prov/used,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If this Activity prov:used Entity :e, then it can qualify how it used it using prov:qualifiedUsage [ a prov:Usage; prov:entity :e; :foo :bar ]."},
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "qualifiedUsage",
   :rdfs/range :prov/Usage,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def sharesDefinitionWith
  {:db/ident         :prov/sharesDefinitionWith,
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def specializationOf
  {:db/ident :prov/specializationOf,
   :prov/category "expanded",
   :prov/component "alternate",
   :prov/constraints
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"},
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "An entity that is a specialization of another shares all aspects of the latter, and additionally presents more specific aspects of the same thing as the latter. In particular, the lifetime of the entity being specialized contains that of any specialization. Examples of aspects include a time period, an abstraction, and a context associated with the entity."},
   :prov/dm
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-specialization"},
   :prov/inverse "generalizationOf",
   :prov/n
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-specialization"},
   :rdf/type #{:owl/ObjectProperty :owl/AnnotationProperty},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "specializationOf",
   :rdfs/range :prov/Entity,
   :rdfs/seeAlso :prov/alternateOf,
   :rdfs/subPropertyOf :prov/alternateOf})

(def startedAtTime
  {:db/ident :prov/startedAtTime,
   :prov/category "starting-point",
   :prov/component "entities-activities",
   :prov/editorialNote
   {:rdf/language "en",
    :rdf/value
    "It is the intent that the property chain holds: (prov:qualifiedStart o prov:atTime) rdfs:subPropertyOf prov:startedAtTime."},
   :prov/qualifiedForm #{:prov/atTime :prov/Start},
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The time at which an activity started. See also prov:endedAtTime."},
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "startedAtTime",
   :rdfs/range :xsd/dateTime})

(def todo
  {:db/ident :prov/todo,
   :rdf/type :owl/AnnotationProperty})

(def unqualifiedForm
  {:db/ident :prov/unqualifiedForm,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Classes and properties used to qualify relationships are annotated with prov:unqualifiedForm to indicate the property used to assert an unqualified provenance relation."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def used
  {:db/ident :prov/used,
   :owl/propertyChainAxiom [:prov/qualifiedUsage :prov/entity],
   :prov/category "starting-point",
   :prov/component "entities-activities",
   :prov/inverse "wasUsedBy",
   :prov/qualifiedForm #{:prov/Usage :prov/qualifiedUsage},
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A prov:Entity that was used by this prov:Activity. For example, :baking prov:used :spoon, :egg, :oven ."},
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "used",
   :rdfs/range :prov/Entity,
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def value
  {:db/ident :prov/value,
   :prov/category "expanded",
   :prov/component "entities-activities",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "Provides a value that is a direct representation of an entity."},
   :prov/dm
   {:xsd/anyURI
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-attribute-value"},
   :prov/editorialNote
   #{"The editor's definition comes from http://www.w3.org/TR/rdf-primer/#rdfvalue"
     {:rdf/language "en",
      :rdf/value
      "This property serves the same purpose as rdf:value, but has been reintroduced to avoid some of the definitional ambiguity in the RDF specification (specifically, 'may be used in describing structured values')."}},
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "value"})

(def wasAssociatedWith
  {:db/ident :prov/wasAssociatedWith,
   :owl/propertyChainAxiom [:prov/qualifiedAssociation :prov/agent],
   :prov/category "starting-point",
   :prov/component "agents-responsibility",
   :prov/inverse "wasAssociateFor",
   :prov/qualifiedForm #{:prov/qualifiedAssociation :prov/Association},
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An prov:Agent that had some (unspecified) responsibility for the occurrence of this prov:Activity."},
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "wasAssociatedWith",
   :rdfs/range :prov/Agent,
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def wasAttributedTo
  {:db/ident :prov/wasAttributedTo,
   :owl/propertyChainAxiom [:prov/qualifiedAttribution :prov/agent],
   :prov/category "starting-point",
   :prov/component "agents-responsibility",
   :prov/definition {:rdf/language "en",
                     :rdf/value
                     "Attribution is the ascribing of an entity to an agent."},
   :prov/inverse "contributed",
   :prov/qualifiedForm #{:prov/Attribution :prov/qualifiedAttribution},
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Attribution is the ascribing of an entity to an agent."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "wasAttributedTo",
   :rdfs/range :prov/Agent,
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def wasDerivedFrom
  {:db/ident :prov/wasDerivedFrom,
   :owl/propertyChainAxiom [:prov/qualifiedDerivation :prov/entity],
   :prov/category "starting-point",
   :prov/component "derivations",
   :prov/definition
   {:rdf/language "en",
    :rdf/value
    "A derivation is a transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a pre-existing entity."},
   :prov/inverse "hadDerivation",
   :prov/qualifiedForm #{:prov/Derivation :prov/qualifiedDerivation},
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The more specific subproperties of prov:wasDerivedFrom (i.e., prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource) should be used when applicable."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "wasDerivedFrom",
   :rdfs/range :prov/Entity,
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def wasEndedBy
  {:db/ident :prov/wasEndedBy,
   :owl/propertyChainAxiom [:prov/qualifiedEnd :prov/entity],
   :prov/category "expanded",
   :prov/component "entities-activities",
   :prov/inverse "ended",
   :prov/qualifiedForm #{:prov/End :prov/qualifiedEnd},
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "End is when an activity is deemed to have ended. An end may refer to an entity, known as trigger, that terminated the activity."},
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "wasEndedBy",
   :rdfs/range :prov/Entity,
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def wasGeneratedBy
  {:db/ident               :prov/wasGeneratedBy,
   :owl/propertyChainAxiom [:prov/qualifiedGeneration :prov/activity],
   :prov/category          "starting-point",
   :prov/component         "entities-activities",
   :prov/inverse           "generated",
   :prov/qualifiedForm     #{:prov/Generation :prov/qualifiedGeneration},
   :rdf/type               :owl/ObjectProperty,
   :rdfs/domain            :prov/Entity,
   :rdfs/isDefinedBy       {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label             "wasGeneratedBy",
   :rdfs/range             :prov/Activity,
   :rdfs/subPropertyOf     :prov/wasInfluencedBy})

(def wasInfluencedBy
  {:db/ident :prov/wasInfluencedBy,
   :prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/editorialNote
   {:rdf/language "en",
    :rdf/value
    "The sub-properties of prov:wasInfluencedBy can be elaborated in more detail using the Qualification Pattern. For example, the binary relation :baking prov:used :spoon can be qualified by asserting :baking prov:qualifiedUsage [ a prov:Usage; prov:entity :spoon; prov:atLocation :kitchen ] .\n\nSubproperties of prov:wasInfluencedBy may also be asserted directly without being qualified.\n\nprov:wasInfluencedBy should not be used without also using one of its subproperties. \n"},
   :prov/inverse "influenced",
   :prov/qualifiedForm #{:prov/Influence :prov/qualifiedInfluence},
   :prov/sharesDefinitionWith :prov/Influence,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "Because prov:wasInfluencedBy is a broad relation, its more specific subproperties (e.g. prov:wasInformedBy, prov:actedOnBehalfOf, prov:wasEndedBy, etc.) should be used when applicable."}
     "This property has multiple RDFS domains to suit multiple OWL Profiles. See <a href=\"#owl-profile\">PROV-O OWL Profile</a>."},
   :rdfs/domain {:owl/unionOf [:prov/Activity :prov/Agent :prov/Entity],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "wasInfluencedBy",
   :rdfs/range {:owl/unionOf [:prov/Activity :prov/Agent :prov/Entity],
                :rdf/type    :owl/Class}})

(def wasInformedBy
  {:db/ident :prov/wasInformedBy,
   :owl/propertyChainAxiom [:prov/qualifiedCommunication :prov/activity],
   :prov/category "starting-point",
   :prov/component "entities-activities",
   :prov/inverse "informed",
   :prov/qualifiedForm #{:prov/qualifiedCommunication :prov/Communication},
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An activity a2 is dependent on or informed by another activity a1, by way of some unspecified entity that is generated by a1 and used by a2."},
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "wasInformedBy",
   :rdfs/range :prov/Activity,
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def wasInvalidatedBy
  {:db/ident               :prov/wasInvalidatedBy,
   :owl/propertyChainAxiom [:prov/qualifiedInvalidation :prov/activity],
   :prov/category          "expanded",
   :prov/component         "entities-activities",
   :prov/inverse           "invalidated",
   :prov/qualifiedForm     #{:prov/Invalidation :prov/qualifiedInvalidation},
   :rdf/type               :owl/ObjectProperty,
   :rdfs/domain            :prov/Entity,
   :rdfs/isDefinedBy       {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label             "wasInvalidatedBy",
   :rdfs/range             :prov/Activity,
   :rdfs/subPropertyOf     :prov/wasInfluencedBy})

(def wasQuotedFrom
  {:db/ident :prov/wasQuotedFrom,
   :owl/propertyChainAxiom [:prov/qualifiedQuotation :prov/entity],
   :prov/category "expanded",
   :prov/component "derivations",
   :prov/inverse "quotedAs",
   :prov/qualifiedForm #{:prov/Quotation :prov/qualifiedQuotation},
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An entity is derived from an original entity by copying, or 'quoting', some or all of it."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "wasQuotedFrom",
   :rdfs/range :prov/Entity,
   :rdfs/subPropertyOf :prov/wasDerivedFrom})

(def wasRevisionOf
  {:db/ident :prov/wasRevisionOf,
   :owl/propertyChainAxiom [:prov/qualifiedRevision :prov/entity],
   :prov/category "expanded",
   :prov/component "derivations",
   :prov/inverse "hadRevision",
   :prov/qualifiedForm #{:prov/Revision :prov/qualifiedRevision},
   :rdf/type #{:owl/ObjectProperty :owl/AnnotationProperty},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A revision is a derivation that revises an entity into a revised version."},
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "wasRevisionOf",
   :rdfs/range :prov/Entity,
   :rdfs/subPropertyOf :prov/wasDerivedFrom})

(def wasStartedBy
  {:db/ident :prov/wasStartedBy,
   :owl/propertyChainAxiom [:prov/qualifiedStart :prov/entity],
   :prov/category "expanded",
   :prov/component "entities-activities",
   :prov/inverse "started",
   :prov/qualifiedForm #{:prov/qualifiedStart :prov/Start},
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Start is when an activity is deemed to have started. A start may refer to an entity, known as trigger, that initiated the activity."},
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/prov-o#"},
   :rdfs/label "wasStartedBy",
   :rdfs/range :prov/Entity,
   :rdfs/subPropertyOf :prov/wasInfluencedBy})