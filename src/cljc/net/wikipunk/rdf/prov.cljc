(ns net.wikipunk.rdf.prov
  {:dcat/downloadURL  "http://www.w3.org/ns/prov-o",
   :rdf/ns-prefix-map {"owl"  "http://www.w3.org/2002/07/owl#",
                       "prov" "http://www.w3.org/ns/prov#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "prov",
   :rdfa/uri          "http://www.w3.org/ns/prov#",
   :rdfs/isDefinedBy  {:rdfa/uri "http://www.w3.org/TR/prov-o/"}}
  (:refer-clojure :exclude [agent]))

(def Activity
  "Activity"
  {:db/ident :prov/Activity,
   :owl/disjointWith :prov/Entity,
   :prov/category #xsd/string "starting-point",
   :prov/component #xsd/string "entities-activities",
   :prov/constraints
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"},
   :prov/definition
   #xsd/string
    "An activity is something that occurs over a period of time and acts upon or with entities; it may include consuming, processing, transforming, modifying, relocating, using, or generating entities.",
   :prov/dm {:rdfa/uri
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Activity"},
   :prov/n
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Activity"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "Activity",
   :rdfs/seeAlso
   [{:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"}
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Activity"}
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Activity"}]})

(def ActivityInfluence
  "ActivityInfluence"
  {:db/ident :prov/ActivityInfluence,
   :owl/disjointWith :prov/EntityInfluence,
   :prov/category #xsd/string "qualified",
   :prov/definition
   #xsd/langString
    "ActivitiyInfluence is the capacity of an activity to have an effect on the character, development, or behavior of another by means of generation, invalidation, communication, or other.@en",
   :prov/editorsDefinition
   #xsd/langString
    "ActivitiyInfluence is the capacity of an activity to have an effect on the character, development, or behavior of another by means of generation, invalidation, communication, or other.@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/langString
     "It is not recommended that the type ActivityInfluence be asserted without also asserting one of its more specific subclasses.@en"
    #xsd/langString
     "ActivityInfluence provides additional descriptions of an Activity's binary influence upon any other kind of resource. Instances of ActivityInfluence use the prov:activity property to cite the influencing Activity.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "ActivityInfluence",
   :rdfs/seeAlso :prov/activity,
   :rdfs/subClassOf [{:owl/maxCardinality #xsd/nonNegativeInteger 0,
                      :owl/onProperty     :prov/hadActivity,
                      :rdf/type           :owl/Restriction}
                     :prov/Influence]})

(def Agent
  "Agent"
  {:db/ident :prov/Agent,
   :owl/disjointWith :prov/InstantaneousEvent,
   :prov/category #xsd/string "starting-point",
   :prov/component #xsd/string "agents-responsibility",
   :prov/definition
   #xsd/langString
    "An agent is something that bears some form of responsibility for an activity taking place, for the existence of an entity, or for another agent's activity. @en",
   :prov/dm {:rdfa/uri
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-agent"},
   :prov/n {:rdfa/uri
            "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Agent"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "Agent",
   :rdfs/seeAlso
   [{:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Agent"}
    {:rdfa/uri "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-agent"}]})

(def AgentInfluence
  "AgentInfluence"
  {:db/ident :prov/AgentInfluence,
   :prov/category #xsd/string "qualified",
   :prov/definition
   #xsd/langString
    "AgentInfluence is the capacity of an agent to have an effect on the character, development, or behavior of another by means of attribution, association, delegation, or other.@en",
   :prov/editorsDefinition
   #xsd/langString
    "AgentInfluence is the capacity of an agent to have an effect on the character, development, or behavior of another by means of attribution, association, delegation, or other.@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/langString
     "It is not recommended that the type AgentInfluence be asserted without also asserting one of its more specific subclasses.@en"
    #xsd/langString
     "AgentInfluence provides additional descriptions of an Agent's binary influence upon any other kind of resource. Instances of AgentInfluence use the prov:agent property to cite the influencing Agent.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "AgentInfluence",
   :rdfs/seeAlso :prov/agent,
   :rdfs/subClassOf :prov/Influence})

(def Association
  "An instance of prov:Association provides additional descriptions about the binary prov:wasAssociatedWith relation from an prov:Activity to some prov:Agent that had some responsiblity for it. For example, :baking prov:wasAssociatedWith :baker; prov:qualifiedAssociation [ a prov:Association; prov:agent :baker; :foo :bar ]."
  {:db/ident :prov/Association,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "agents-responsibility",
   :prov/definition
   #xsd/langString
    "An activity association is an assignment of responsibility to an agent for an activity, indicating that the agent had a role in the activity. It further allows for a plan to be specified, which is the plan intended by the agent to achieve some goals in the context of this activity.@en",
   :prov/dm
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Association"},
   :prov/n
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Association"},
   :prov/unqualifiedForm :prov/wasAssociatedWith,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "An instance of prov:Association provides additional descriptions about the binary prov:wasAssociatedWith relation from an prov:Activity to some prov:Agent that had some responsiblity for it. For example, :baking prov:wasAssociatedWith :baker; prov:qualifiedAssociation [ a prov:Association; prov:agent :baker; :foo :bar ].@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "Association",
   :rdfs/seeAlso
   [:prov/wasAssociatedWith
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Association"}
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Association"}],
   :rdfs/subClassOf [:prov/AgentInfluence :prov/Influence]})

(def Attribution
  "An instance of prov:Attribution provides additional descriptions about the binary prov:wasAttributedTo relation from an prov:Entity to some prov:Agent that had some responsible for it. For example, :cake prov:wasAttributedTo :baker; prov:qualifiedAttribution [ a prov:Attribution; prov:entity :baker; :foo :bar ]."
  {:db/ident :prov/Attribution,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "agents-responsibility",
   :prov/constraints
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"},
   :prov/definition
   #xsd/langString
    "Attribution is the ascribing of an entity to an agent.\n\nWhen an entity e is attributed to agent ag, entity e was generated by some unspecified activity that in turn was associated to agent ag. Thus, this relation is useful when the activity is not known, or irrelevant.@en",
   :prov/dm
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-attribution"},
   :prov/n
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-attribution"},
   :prov/unqualifiedForm :prov/wasAttributedTo,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "An instance of prov:Attribution provides additional descriptions about the binary prov:wasAttributedTo relation from an prov:Entity to some prov:Agent that had some responsible for it. For example, :cake prov:wasAttributedTo :baker; prov:qualifiedAttribution [ a prov:Attribution; prov:entity :baker; :foo :bar ].@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "Attribution",
   :rdfs/seeAlso
   [{:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"}
    :prov/wasAttributedTo
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-attribution"}
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-attribution"}],
   :rdfs/subClassOf [:prov/AgentInfluence :prov/Influence]})

(def Bundle
  "Note that there are kinds of bundles (e.g. handwritten letters, audio recordings, etc.) that are not expressed in PROV-O, but can be still be described by PROV-O."
  {:db/ident :prov/Bundle,
   :prov/category #xsd/string "expanded",
   :prov/definition
   #xsd/langString
    "A bundle is a named set of provenance descriptions, and is itself an Entity, so allowing provenance of provenance to be expressed.@en",
   :prov/dm
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-bundle-entity"},
   :prov/n
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-bundle-declaration"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "Note that there are kinds of bundles (e.g. handwritten letters, audio recordings, etc.) that are not expressed in PROV-O, but can be still be described by PROV-O.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "Bundle",
   :rdfs/seeAlso
   [{:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-bundle-declaration"}
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-bundle-entity"}],
   :rdfs/subClassOf :prov/Entity})

(def Collection
  "Collection"
  {:db/ident :prov/Collection,
   :prov/category #xsd/string "expanded",
   :prov/component #xsd/string "collections",
   :prov/definition
   #xsd/langString
    "A collection is an entity that provides a structure to some constituents, which are themselves entities. These constituents are said to be member of the collections.@en",
   :prov/dm {:rdfa/uri
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-collection"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "Collection",
   :rdfs/seeAlso
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-collection"},
   :rdfs/subClassOf :prov/Entity})

(def Communication
  "An instance of prov:Communication provides additional descriptions about the binary prov:wasInformedBy relation from an informed prov:Activity to the prov:Activity that informed it. For example, :you_jumping_off_bridge prov:wasInformedBy :everyone_else_jumping_off_bridge; prov:qualifiedCommunication [ a prov:Communication; prov:activity :everyone_else_jumping_off_bridge; :foo :bar ]."
  {:db/ident :prov/Communication,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "entities-activities",
   :prov/constraints
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"},
   :prov/definition
   #xsd/string
    "Communication is the exchange of an entity by two activities, one activity using the entity generated by the other.",
   :prov/dm
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Communication"},
   :prov/n
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-wasInformedBy"},
   :prov/unqualifiedForm :prov/wasInformedBy,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "An instance of prov:Communication provides additional descriptions about the binary prov:wasInformedBy relation from an informed prov:Activity to the prov:Activity that informed it. For example, :you_jumping_off_bridge prov:wasInformedBy :everyone_else_jumping_off_bridge; prov:qualifiedCommunication [ a prov:Communication; prov:activity :everyone_else_jumping_off_bridge; :foo :bar ].@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "Communication",
   :rdfs/seeAlso
   [{:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"}
    :prov/wasInformedBy
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-wasInformedBy"}
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Communication"}],
   :rdfs/subClassOf [:prov/ActivityInfluence
                     {:owl/maxCardinality #xsd/nonNegativeInteger 0,
                      :owl/onProperty     :prov/hadActivity,
                      :rdf/type           :owl/Restriction}
                     :prov/Influence]})

(def Delegation
  "An instance of prov:Delegation provides additional descriptions about the binary prov:actedOnBehalfOf relation from a performing prov:Agent to some prov:Agent for whom it was performed. For example, :mixing prov:wasAssociatedWith :toddler . :toddler prov:actedOnBehalfOf :mother; prov:qualifiedDelegation [ a prov:Delegation; prov:entity :mother; :foo :bar ]."
  {:db/ident :prov/Delegation,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "agents-responsibility",
   :prov/definition
   #xsd/langString
    "Delegation is the assignment of authority and responsibility to an agent (by itself or by another agent) to carry out a specific activity as a delegate or representative, while the agent it acts on behalf of retains some responsibility for the outcome of the delegated work.\n\nFor example, a student acted on behalf of his supervisor, who acted on behalf of the department chair, who acted on behalf of the university; all those agents are responsible in some way for the activity that took place but we do not say explicitly who bears responsibility and to what degree.@en",
   :prov/dm {:rdfa/uri
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-delegation"},
   :prov/n
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-delegation"},
   :prov/unqualifiedForm :prov/actedOnBehalfOf,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "An instance of prov:Delegation provides additional descriptions about the binary prov:actedOnBehalfOf relation from a performing prov:Agent to some prov:Agent for whom it was performed. For example, :mixing prov:wasAssociatedWith :toddler . :toddler prov:actedOnBehalfOf :mother; prov:qualifiedDelegation [ a prov:Delegation; prov:entity :mother; :foo :bar ].@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "Delegation",
   :rdfs/seeAlso
   [:prov/actedOnBehalfOf
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-delegation"}
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-delegation"}],
   :rdfs/subClassOf [:prov/AgentInfluence :prov/Influence]})

(def Derivation
  "Derivation"
  {:db/ident :prov/Derivation,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "derivations",
   :prov/constraints
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"},
   :prov/definition
   #xsd/langString
    "A derivation is a transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a pre-existing entity.@en",
   :prov/dm {:rdfa/uri
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Derivation"},
   :prov/n
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#Derivation-Relation"},
   :prov/unqualifiedForm :prov/wasDerivedFrom,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/langString
     "An instance of prov:Derivation provides additional descriptions about the binary prov:wasDerivedFrom relation from some derived prov:Entity to another prov:Entity from which it was derived. For example, :chewed_bubble_gum prov:wasDerivedFrom :unwrapped_bubble_gum; prov:qualifiedDerivation [ a prov:Derivation; prov:entity :unwrapped_bubble_gum; :foo :bar ].@en"
    #xsd/langString
     "The more specific forms of prov:Derivation (i.e., prov:Revision, prov:Quotation, prov:PrimarySource) should be asserted if they apply.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "Derivation",
   :rdfs/seeAlso
   [{:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"}
    :prov/wasDerivedFrom
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-n-20130430/#Derivation-Relation"}
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Derivation"}],
   :rdfs/subClassOf [:prov/EntityInfluence :prov/Influence]})

(def EmptyCollection
  "EmptyCollection"
  {:db/ident         :prov/EmptyCollection,
   :prov/category    #xsd/string "expanded",
   :prov/component   #xsd/string "collections",
   :prov/definition  #xsd/langString
                      "An empty collection is a collection without members.@en",
   :rdf/type         [:owl/NamedIndividual :owl/Class],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label       #xsd/langString "EmptyCollection@en",
   :rdfs/subClassOf  [:prov/Collection :prov/Entity]})

(def End
  "An instance of prov:End provides additional descriptions about the binary prov:wasEndedBy relation from some ended prov:Activity to an prov:Entity that ended it. For example, :ball_game prov:wasEndedBy :buzzer; prov:qualifiedEnd [ a prov:End; prov:entity :buzzer; :foo :bar; prov:atTime '2012-03-09T08:05:08-05:00'^^xsd:dateTime ]."
  {:db/ident :prov/End,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "entities-activities",
   :prov/constraints
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"},
   :prov/definition
   #xsd/langString
    "End is when an activity is deemed to have been ended by an entity, known as trigger. The activity no longer exists after its end. Any usage, generation, or invalidation involving an activity precedes the activity's end. An end may refer to a trigger entity that terminated the activity, or to an activity, known as ender that generated the trigger.@en",
   :prov/dm {:rdfa/uri
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-End"},
   :prov/n {:rdfa/uri
            "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-End"},
   :prov/unqualifiedForm :prov/wasEndedBy,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "An instance of prov:End provides additional descriptions about the binary prov:wasEndedBy relation from some ended prov:Activity to an prov:Entity that ended it. For example, :ball_game prov:wasEndedBy :buzzer; prov:qualifiedEnd [ a prov:End; prov:entity :buzzer; :foo :bar; prov:atTime '2012-03-09T08:05:08-05:00'^^xsd:dateTime ].@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "End",
   :rdfs/seeAlso
   [{:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"}
    :prov/wasEndedBy
    {:rdfa/uri "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-End"}
    {:rdfa/uri "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-End"}],
   :rdfs/subClassOf
   [:prov/EntityInfluence :prov/InstantaneousEvent :prov/Influence]})

(def Entity
  "Entity"
  {:db/ident :prov/Entity,
   :owl/disjointWith :prov/InstantaneousEvent,
   :prov/category #xsd/string "starting-point",
   :prov/component #xsd/string "entities-activities",
   :prov/constraints
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"},
   :prov/definition
   #xsd/langString
    "An entity is a physical, digital, conceptual, or other kind of thing with some fixed aspects; entities may be real or imaginary. @en",
   :prov/dm {:rdfa/uri
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-entity"},
   :prov/n {:rdfa/uri
            "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Entity"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "Entity",
   :rdfs/seeAlso
   [{:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"}
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Entity"}
    {:rdfa/uri "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-entity"}]})

(def EntityInfluence
  "EntityInfluence"
  {:db/ident :prov/EntityInfluence,
   :prov/category #xsd/string "qualified",
   :prov/definition
   #xsd/langString
    "EntityInfluence is the capacity of an entity to have an effect on the character, development, or behavior of another by means of usage, start, end, derivation, or other. @en",
   :prov/editorsDefinition
   #xsd/langString
    "EntityInfluence is the capacity of an entity to have an effect on the character, development, or behavior of another by means of usage, start, end, derivation, or other. @en",
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/langString
     "It is not recommended that the type EntityInfluence be asserted without also asserting one of its more specific subclasses.@en"
    #xsd/langString
     "EntityInfluence provides additional descriptions of an Entity's binary influence upon any other kind of resource. Instances of EntityInfluence use the prov:entity property to cite the influencing Entity.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "EntityInfluence",
   :rdfs/seeAlso :prov/entity,
   :rdfs/subClassOf :prov/Influence})

(def Generation
  "An instance of prov:Generation provides additional descriptions about the binary prov:wasGeneratedBy relation from a generated prov:Entity to the prov:Activity that generated it. For example, :cake prov:wasGeneratedBy :baking; prov:qualifiedGeneration [ a prov:Generation; prov:activity :baking; :foo :bar ]."
  {:db/ident :prov/Generation,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "entities-activities",
   :prov/constraints
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"},
   :prov/definition
   #xsd/langString
    "Generation is the completion of production of a new entity by an activity. This entity did not exist before generation and becomes available for usage after this generation.@en",
   :prov/dm {:rdfa/uri
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Generation"},
   :prov/n
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Generation"},
   :prov/unqualifiedForm :prov/wasGeneratedBy,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "An instance of prov:Generation provides additional descriptions about the binary prov:wasGeneratedBy relation from a generated prov:Entity to the prov:Activity that generated it. For example, :cake prov:wasGeneratedBy :baking; prov:qualifiedGeneration [ a prov:Generation; prov:activity :baking; :foo :bar ].@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "Generation",
   :rdfs/seeAlso
   [{:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"}
    :prov/wasGeneratedBy
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Generation"}
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Generation"}],
   :rdfs/subClassOf [:prov/ActivityInfluence
                     :prov/InstantaneousEvent
                     {:owl/maxCardinality #xsd/nonNegativeInteger 0,
                      :owl/onProperty     :prov/hadActivity,
                      :rdf/type           :owl/Restriction}
                     :prov/Influence]})

(def Influence
  "Influence"
  {:db/ident :prov/Influence,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "derivations",
   :prov/definition
   #xsd/langString
    "Influence is the capacity of an entity, activity, or agent to have an effect on the character, development, or behavior of another by means of usage, start, end, generation, invalidation, communication, derivation, attribution, association, or delegation.@en",
   :prov/dm {:rdfa/uri
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-influence"},
   :prov/n
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-influence"},
   :prov/unqualifiedForm :prov/wasInfluencedBy,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#xsd/langString
     "An instance of prov:Influence provides additional descriptions about the binary prov:wasInfluencedBy relation from some influenced Activity, Entity, or Agent to the influencing Activity, Entity, or Agent. For example, :stomach_ache prov:wasInfluencedBy :spoon; prov:qualifiedInfluence [ a prov:Influence; prov:entity :spoon; :foo :bar ] . Because prov:Influence is a broad relation, the more specific relations (Communication, Delegation, End, etc.) should be used when applicable.@en"
    #xsd/langString
     "Because prov:Influence is a broad relation, its most specific subclasses (e.g. prov:Communication, prov:Delegation, prov:End, prov:Revision, etc.) should be used when applicable.@en"],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "Influence",
   :rdfs/seeAlso
   [:prov/wasInfluencedBy
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-influence"}
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-influence"}]})

(def InstantaneousEvent
  "An instantaneous event, or event for short, happens in the world and marks a change in the world, in its activities and in its entities. The term 'event' is commonly used in process algebra with a similar meaning. Events represent communications or interactions; they are assumed to be atomic and instantaneous."
  {:db/ident :prov/InstantaneousEvent,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "entities-activities",
   :prov/constraints
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#dfn-event"},
   :prov/definition
   #xsd/langString
    "The PROV data model is implicitly based on a notion of instantaneous events (or just events), that mark transitions in the world. Events include generation, usage, or invalidation of entities, as well as starting or ending of activities. This notion of event is not first-class in the data model, but it is useful for explaining its other concepts and its semantics.@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "An instantaneous event, or event for short, happens in the world and marks a change in the world, in its activities and in its entities. The term 'event' is commonly used in process algebra with a similar meaning. Events represent communications or interactions; they are assumed to be atomic and instantaneous.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "InstantaneousEvent",
   :rdfs/seeAlso
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#dfn-event"}})

(def Invalidation
  "An instance of prov:Invalidation provides additional descriptions about the binary prov:wasInvalidatedBy relation from an invalidated prov:Entity to the prov:Activity that invalidated it. For example, :uncracked_egg prov:wasInvalidatedBy :baking; prov:qualifiedInvalidation [ a prov:Invalidation; prov:activity :baking; :foo :bar ]."
  {:db/ident :prov/Invalidation,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "entities-activities",
   :prov/constraints
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"},
   :prov/definition
   #xsd/string
    "Invalidation is the start of the destruction, cessation, or expiry of an existing entity by an activity. The entity is no longer available for use (or further invalidation) after invalidation. Any generation or usage of an entity precedes its invalidation.",
   :prov/dm
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Invalidation"},
   :prov/n
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Invalidation"},
   :prov/unqualifiedForm :prov/wasInvalidatedBy,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "An instance of prov:Invalidation provides additional descriptions about the binary prov:wasInvalidatedBy relation from an invalidated prov:Entity to the prov:Activity that invalidated it. For example, :uncracked_egg prov:wasInvalidatedBy :baking; prov:qualifiedInvalidation [ a prov:Invalidation; prov:activity :baking; :foo :bar ].@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "Invalidation",
   :rdfs/seeAlso
   [{:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"}
    :prov/wasInvalidatedBy
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Invalidation"}
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Invalidation"}],
   :rdfs/subClassOf [:prov/ActivityInfluence
                     :prov/InstantaneousEvent
                     {:owl/maxCardinality #xsd/nonNegativeInteger 0,
                      :owl/onProperty     :prov/hadActivity,
                      :rdf/type           :owl/Restriction}
                     :prov/Influence]})

(def Location
  "Location"
  {:db/ident :prov/Location,
   :prov/category #xsd/string "expanded",
   :prov/definition
   #xsd/langString
    "A location can be an identifiable geographic place (ISO 19112), but it can also be a non-geographic place such as a directory, row, or column. As such, there are numerous ways in which location can be expressed, such as by a coordinate, address, landmark, and so forth.@en",
   :prov/dm
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-attribute-location"},
   :prov/n
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-attribute"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "Location",
   :rdfs/seeAlso
   [:prov/atLocation
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-attribute"}
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-attribute-location"}]})

(def Organization
  "Organization"
  {:db/ident :prov/Organization,
   :prov/category #xsd/string "expanded",
   :prov/component #xsd/string "agents-responsibility",
   :prov/definition
   #xsd/string
    "An organization is a social or legal institution such as a company, society, etc.",
   :prov/dm {:rdfa/uri
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-agent"},
   :prov/n {:rdfa/uri
            "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-types"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "Organization",
   :rdfs/seeAlso
   [{:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-types"}
    {:rdfa/uri "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-agent"}],
   :rdfs/subClassOf :prov/Agent})

(def Person
  "Person"
  {:db/ident :prov/Person,
   :prov/category #xsd/string "expanded",
   :prov/component #xsd/string "agents-responsibility",
   :prov/definition #xsd/langString "Person agents are people.@en",
   :prov/dm {:rdfa/uri
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-agent"},
   :prov/n {:rdfa/uri
            "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-types"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "Person",
   :rdfs/seeAlso
   [{:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-types"}
    {:rdfa/uri "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-agent"}],
   :rdfs/subClassOf :prov/Agent})

(def Plan
  "There exist no prescriptive requirement on the nature of plans, their representation, the actions or steps they consist of, or their intended goals. Since plans may evolve over time, it may become necessary to track their provenance, so plans themselves are entities. Representing the plan explicitly in the provenance can be useful for various tasks: for example, to validate the execution as represented in the provenance record, to manage expectation failures, or to provide explanations."
  {:db/ident :prov/Plan,
   :prov/category [#xsd/string "expanded" #xsd/string "qualified"],
   :prov/component #xsd/string "agents-responsibility",
   :prov/definition
   #xsd/string
    "A plan is an entity that represents a set of actions or steps intended by one or more agents to achieve some goals.",
   :prov/dm
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Association"},
   :prov/n
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Association"},
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "There exist no prescriptive requirement on the nature of plans, their representation, the actions or steps they consist of, or their intended goals. Since plans may evolve over time, it may become necessary to track their provenance, so plans themselves are entities. Representing the plan explicitly in the provenance can be useful for various tasks: for example, to validate the execution as represented in the provenance record, to manage expectation failures, or to provide explanations.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "Plan",
   :rdfs/seeAlso
   [{:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Association"}
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Association"}],
   :rdfs/subClassOf :prov/Entity})

(def PrimarySource
  "An instance of prov:PrimarySource provides additional descriptions about the binary prov:hadPrimarySource relation from some secondary prov:Entity to an earlier, primary prov:Entity. For example, :blog prov:hadPrimarySource :newsArticle; prov:qualifiedPrimarySource [ a prov:PrimarySource; prov:entity :newsArticle; :foo :bar ] ."
  {:db/ident :prov/PrimarySource,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "derivations",
   :prov/definition
   #xsd/langString
    "A primary source for a topic refers to something produced by some agent with direct experience and knowledge about the topic, at the time of the topic's study, without benefit from hindsight.\n\nBecause of the directness of primary sources, they 'speak for themselves' in ways that cannot be captured through the filter of secondary sources. As such, it is important for secondary sources to reference those primary sources from which they were derived, so that their reliability can be investigated.\n\nA primary source relation is a particular case of derivation of secondary materials from their primary sources. It is recognized that the determination of primary sources can be up to interpretation, and should be done according to conventions accepted within the application's domain.@en",
   :prov/dm
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-primary-source"},
   :prov/n
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-original-source"},
   :prov/unqualifiedForm :prov/hadPrimarySource,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "An instance of prov:PrimarySource provides additional descriptions about the binary prov:hadPrimarySource relation from some secondary prov:Entity to an earlier, primary prov:Entity. For example, :blog prov:hadPrimarySource :newsArticle; prov:qualifiedPrimarySource [ a prov:PrimarySource; prov:entity :newsArticle; :foo :bar ] .@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "PrimarySource",
   :rdfs/seeAlso
   [:prov/hadPrimarySource
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-original-source"}
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-primary-source"}],
   :rdfs/subClassOf [:prov/Derivation :prov/EntityInfluence :prov/Influence]})

(def Quotation
  "An instance of prov:Quotation provides additional descriptions about the binary prov:wasQuotedFrom relation from some taken prov:Entity from an earlier, larger prov:Entity. For example, :here_is_looking_at_you_kid prov:wasQuotedFrom :casablanca_script; prov:qualifiedQuotation [ a prov:Quotation; prov:entity :casablanca_script; :foo :bar ]."
  {:db/ident :prov/Quotation,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "derivations",
   :prov/definition
   #xsd/langString
    "A quotation is the repeat of (some or all of) an entity, such as text or image, by someone who may or may not be its original author. Quotation is a particular case of derivation.@en",
   :prov/dm {:rdfa/uri
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-quotation"},
   :prov/n
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-quotation"},
   :prov/unqualifiedForm :prov/wasQuotedFrom,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "An instance of prov:Quotation provides additional descriptions about the binary prov:wasQuotedFrom relation from some taken prov:Entity from an earlier, larger prov:Entity. For example, :here_is_looking_at_you_kid prov:wasQuotedFrom :casablanca_script; prov:qualifiedQuotation [ a prov:Quotation; prov:entity :casablanca_script; :foo :bar ].@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "Quotation",
   :rdfs/seeAlso
   [:prov/wasQuotedFrom
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-quotation"}
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-quotation"}],
   :rdfs/subClassOf [:prov/Derivation :prov/EntityInfluence :prov/Influence]})

(def Revision
  "An instance of prov:Revision provides additional descriptions about the binary prov:wasRevisionOf relation from some newer prov:Entity to an earlier prov:Entity. For example, :draft_2 prov:wasRevisionOf :draft_1; prov:qualifiedRevision [ a prov:Revision; prov:entity :draft_1; :foo :bar ]."
  {:db/ident :prov/Revision,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "derivations",
   :prov/definition
   #xsd/langString
    "A revision is a derivation for which the resulting entity is a revised version of some original. The implication here is that the resulting entity contains substantial content from the original. Revision is a particular case of derivation.@en",
   :prov/dm {:rdfa/uri
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-revision"},
   :prov/n
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Revision"},
   :prov/unqualifiedForm :prov/wasRevisionOf,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "An instance of prov:Revision provides additional descriptions about the binary prov:wasRevisionOf relation from some newer prov:Entity to an earlier prov:Entity. For example, :draft_2 prov:wasRevisionOf :draft_1; prov:qualifiedRevision [ a prov:Revision; prov:entity :draft_1; :foo :bar ].@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "Revision",
   :rdfs/seeAlso
   [:prov/wasRevisionOf
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Revision"}
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-revision"}],
   :rdfs/subClassOf [:prov/Derivation :prov/EntityInfluence :prov/Influence]})

(def Role
  "Role"
  {:db/ident :prov/Role,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "agents-responsibility",
   :prov/definition
   #xsd/langString
    "A role is the function of an entity or agent with respect to an activity, in the context of a usage, generation, invalidation, association, start, and end.@en",
   :prov/dm
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-attribute-role"},
   :prov/n
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-attribute"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "Role",
   :rdfs/seeAlso
   [:prov/hadRole
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-attribute"}
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-attribute-role"}]})

(def SoftwareAgent
  "SoftwareAgent"
  {:db/ident :prov/SoftwareAgent,
   :prov/category #xsd/string "expanded",
   :prov/component #xsd/string "agents-responsibility",
   :prov/definition #xsd/langString "A software agent is running software.@en",
   :prov/dm {:rdfa/uri
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-agent"},
   :prov/n {:rdfa/uri
            "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-types"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "SoftwareAgent",
   :rdfs/seeAlso
   [{:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-types"}
    {:rdfa/uri "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-agent"}],
   :rdfs/subClassOf :prov/Agent})

(def Start
  "An instance of prov:Start provides additional descriptions about the binary prov:wasStartedBy relation from some started prov:Activity to an prov:Entity that started it. For example, :foot_race prov:wasStartedBy :bang; prov:qualifiedStart [ a prov:Start; prov:entity :bang; :foo :bar; prov:atTime '2012-03-09T08:05:08-05:00'^^xsd:dateTime ] ."
  {:db/ident :prov/Start,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "entities-activities",
   :prov/constraints
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"},
   :prov/definition
   #xsd/langString
    "Start is when an activity is deemed to have been started by an entity, known as trigger. The activity did not exist before its start. Any usage, generation, or invalidation involving an activity follows the activity's start. A start may refer to a trigger entity that set off the activity, or to an activity, known as starter, that generated the trigger.@en",
   :prov/dm {:rdfa/uri
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Start"},
   :prov/n {:rdfa/uri
            "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Start"},
   :prov/unqualifiedForm :prov/wasStartedBy,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "An instance of prov:Start provides additional descriptions about the binary prov:wasStartedBy relation from some started prov:Activity to an prov:Entity that started it. For example, :foot_race prov:wasStartedBy :bang; prov:qualifiedStart [ a prov:Start; prov:entity :bang; :foo :bar; prov:atTime '2012-03-09T08:05:08-05:00'^^xsd:dateTime ] .@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "Start",
   :rdfs/seeAlso
   [{:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"}
    :prov/wasStartedBy
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Start"}
    {:rdfa/uri "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Start"}],
   :rdfs/subClassOf
   [:prov/EntityInfluence :prov/InstantaneousEvent :prov/Influence]})

(def Usage
  "An instance of prov:Usage provides additional descriptions about the binary prov:used relation from some prov:Activity to an prov:Entity that it used. For example, :keynote prov:used :podium; prov:qualifiedUsage [ a prov:Usage; prov:entity :podium; :foo :bar ]."
  {:db/ident :prov/Usage,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "entities-activities",
   :prov/constraints
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"},
   :prov/definition
   #xsd/langString
    "Usage is the beginning of utilizing an entity by an activity. Before usage, the activity had not begun to utilize this entity and could not have been affected by the entity.@en",
   :prov/dm {:rdfa/uri
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Usage"},
   :prov/n {:rdfa/uri
            "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Usage"},
   :prov/unqualifiedForm :prov/used,
   :rdf/type :owl/Class,
   :rdfs/comment
   #xsd/langString
    "An instance of prov:Usage provides additional descriptions about the binary prov:used relation from some prov:Activity to an prov:Entity that it used. For example, :keynote prov:used :podium; prov:qualifiedUsage [ a prov:Usage; prov:entity :podium; :foo :bar ].@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "Usage",
   :rdfs/seeAlso
   [{:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"}
    :prov/used
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Usage"}
    {:rdfa/uri "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Usage"}],
   :rdfs/subClassOf
   [:prov/InstantaneousEvent :prov/EntityInfluence :prov/Influence]})

(def actedOnBehalfOf
  "An object property to express the accountability of an agent towards another agent. The subordinate agent acted on behalf of the responsible agent in an actual activity. "
  {:db/ident :prov/actedOnBehalfOf,
   :owl/propertyChainAxiom [:prov/qualifiedDelegation :prov/agent],
   :prov/category #xsd/string "starting-point",
   :prov/component #xsd/string "agents-responsibility",
   :prov/inverse #xsd/string "hadDelegate",
   :prov/qualifiedForm [:prov/qualifiedDelegation :prov/Delegation],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "An object property to express the accountability of an agent towards another agent. The subordinate agent acted on behalf of the responsible agent in an actual activity. @en",
   :rdfs/domain :prov/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "actedOnBehalfOf",
   :rdfs/range :prov/Agent,
   :rdfs/seeAlso [:prov/qualifiedDelegation :prov/Delegation],
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def activity
  "activity"
  {:db/ident :prov/activity,
   :prov/category #xsd/string "qualified",
   :prov/definition
   #xsd/string
    "The prov:activity property references an prov:Activity which influenced a resource. This property applies to an prov:ActivityInfluence, which is given by a subproperty of prov:qualifiedInfluence from the influenced prov:Entity, prov:Activity or prov:Agent.",
   :prov/editorialNote
   #xsd/langString
    "This property behaves in spirit like rdf:object; it references the object of a prov:wasInfluencedBy triple.@en",
   :prov/editorsDefinition
   #xsd/string
    "The prov:activity property references an prov:Activity which influenced a resource. This property applies to an prov:ActivityInfluence, which is given by a subproperty of prov:qualifiedInfluence from the influenced prov:Entity, prov:Activity or prov:Agent.",
   :prov/inverse #xsd/string "activityOfInfluence",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/ActivityInfluence,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "activity",
   :rdfs/range :prov/Activity,
   :rdfs/subPropertyOf :prov/influencer})

(def agent
  "agent"
  {:db/ident :prov/agent,
   :prov/category #xsd/string "qualified",
   :prov/definition
   #xsd/langString
    "The prov:agent property references an prov:Agent which influenced a resource. This property applies to an prov:AgentInfluence, which is given by a subproperty of prov:qualifiedInfluence from the influenced prov:Entity, prov:Activity or prov:Agent.@en",
   :prov/editorialNote
   #xsd/langString
    "This property behaves in spirit like rdf:object; it references the object of a prov:wasInfluencedBy triple.@en",
   :prov/editorsDefinition
   #xsd/langString
    "The prov:agent property references an prov:Agent which influenced a resource. This property applies to an prov:AgentInfluence, which is given by a subproperty of prov:qualifiedInfluence from the influenced prov:Entity, prov:Activity or prov:Agent.@en",
   :prov/inverse #xsd/string "agentOfInfluence",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/AgentInfluence,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "agent",
   :rdfs/range :prov/Agent,
   :rdfs/subPropertyOf :prov/influencer})

(def alternateOf
  "alternateOf"
  {:db/ident :prov/alternateOf,
   :prov/category #xsd/string "expanded",
   :prov/component #xsd/string "alternate",
   :prov/constraints
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"},
   :prov/definition
   #xsd/langString
    "Two alternate entities present aspects of the same thing. These aspects may be the same or different, and the alternate entities may or may not overlap in time.@en",
   :prov/dm {:rdfa/uri
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-alternate"},
   :prov/inverse #xsd/string "alternateOf",
   :prov/n
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-alternate"},
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "alternateOf",
   :rdfs/range :prov/Entity,
   :rdfs/seeAlso
   [:prov/specializationOf
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"}
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-alternate"}
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-alternate"}]})

(def aq
  {:db/ident         :prov/aq,
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def atLocation
  "atLocation"
  {:db/ident :prov/atLocation,
   :prov/category #xsd/string "expanded",
   :prov/editorialNote
   [#xsd/langString
     "This property is not functional because the many values could be at a variety of granularies (In this building, in this room, in that chair).@en"
    #xsd/langString
     "The naming of prov:atLocation parallels prov:atTime, and is not named prov:hadLocation to avoid conflicting with the convention that prov:had* properties are used on prov:Influence classes.@en"],
   :prov/inverse #xsd/string "locationOf",
   :prov/sharesDefinitionWith :prov/Location,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString "The Location of any resource.@en"
    #xsd/string
     "This property has multiple RDFS domains to suit multiple OWL Profiles. See <a href=\"#owl-profile\">PROV-O OWL Profile</a>."],
   :rdfs/domain {:owl/unionOf [:prov/Activity
                               :prov/Agent
                               :prov/Entity
                               :prov/InstantaneousEvent],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "atLocation",
   :rdfs/range :prov/Location,
   :rdfs/seeAlso :prov/Location})

(def atTime
  "The time at which an InstantaneousEvent occurred, in the form of xsd:dateTime."
  {:db/ident :prov/atTime,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "entities-activities",
   :prov/sharesDefinitionWith :prov/InstantaneousEvent,
   :prov/unqualifiedForm [:prov/invalidatedAtTime
                          :prov/startedAtTime
                          :prov/generatedAtTime
                          :prov/endedAtTime],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The time at which an InstantaneousEvent occurred, in the form of xsd:dateTime.@en",
   :rdfs/domain :prov/InstantaneousEvent,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "atTime",
   :rdfs/range :xsd/dateTime,
   :rdfs/seeAlso [:prov/InstantaneousEvent
                  :prov/invalidatedAtTime
                  :prov/startedAtTime
                  :prov/generatedAtTime
                  :prov/endedAtTime]})

(def category
  "Classify prov-o terms into three categories, including 'starting-point', 'qualifed', and 'extended'. This classification is used by the prov-o html document to gently introduce prov-o terms to its users. "
  {:db/ident :prov/category,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #xsd/langString
    "Classify prov-o terms into three categories, including 'starting-point', 'qualifed', and 'extended'. This classification is used by the prov-o html document to gently introduce prov-o terms to its users. @en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"}})

(def component
  "Classify prov-o terms into six components according to prov-dm, including 'agents-responsibility', 'alternate', 'annotations', 'collections', 'derivations', and 'entities-activities'. This classification is used so that readers of prov-o specification can find its correspondence with the prov-dm specification."
  {:db/ident :prov/component,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #xsd/langString
    "Classify prov-o terms into six components according to prov-dm, including 'agents-responsibility', 'alternate', 'annotations', 'collections', 'derivations', and 'entities-activities'. This classification is used so that readers of prov-o specification can find its correspondence with the prov-dm specification.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"}})

(def constraints
  "A reference to the principal section of the PROV-CONSTRAINTS document that describes this concept."
  {:db/ident :prov/constraints,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #xsd/langString
    "A reference to the principal section of the PROV-CONSTRAINTS document that describes this concept.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def definition
  "A definition quoted from PROV-DM or PROV-CONSTRAINTS that describes the concept expressed with this OWL term."
  {:db/ident :prov/definition,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #xsd/langString
    "A definition quoted from PROV-DM or PROV-CONSTRAINTS that describes the concept expressed with this OWL term.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"}})

(def dm
  "A reference to the principal section of the PROV-DM document that describes this concept."
  {:db/ident :prov/dm,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #xsd/langString
    "A reference to the principal section of the PROV-DM document that describes this concept.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def editorialNote
  "A note by the OWL development team about how this term expresses the PROV-DM concept, or how it should be used in context of semantic web or linked data."
  {:db/ident :prov/editorialNote,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #xsd/langString
    "A note by the OWL development team about how this term expresses the PROV-DM concept, or how it should be used in context of semantic web or linked data.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"}})

(def editorsDefinition
  "When the prov-o term does not have a definition drawn from prov-dm, and the prov-o editor provides one."
  {:db/ident :prov/editorsDefinition,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #xsd/langString
    "When the prov-o term does not have a definition drawn from prov-dm, and the prov-o editor provides one.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/subPropertyOf :prov/definition})

(def endedAtTime
  "The time at which an activity ended. See also prov:startedAtTime."
  {:db/ident :prov/endedAtTime,
   :prov/category #xsd/string "starting-point",
   :prov/component #xsd/string "entities-activities",
   :prov/editorialNote
   #xsd/langString
    "It is the intent that the property chain holds: (prov:qualifiedEnd o prov:atTime) rdfs:subPropertyOf prov:endedAtTime.@en",
   :prov/qualifiedForm [:prov/End :prov/atTime],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The time at which an activity ended. See also prov:startedAtTime.@en",
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "endedAtTime",
   :rdfs/range :xsd/dateTime,
   :rdfs/seeAlso [:prov/End :prov/atTime]})

(def entity
  "entity"
  {:db/ident :prov/entity,
   :prov/category #xsd/string "qualified",
   :prov/definition
   #xsd/string
    "The prov:entity property references an prov:Entity which influenced a resource. This property applies to an prov:EntityInfluence, which is given by a subproperty of prov:qualifiedInfluence from the influenced prov:Entity, prov:Activity or prov:Agent.",
   :prov/editorialNote
   #xsd/langString
    "This property behaves in spirit like rdf:object; it references the object of a prov:wasInfluencedBy triple.@en",
   :prov/editorsDefinition
   #xsd/string
    "The prov:entity property references an prov:Entity which influenced a resource. This property applies to an prov:EntityInfluence, which is given by a subproperty of prov:qualifiedInfluence from the influenced prov:Entity, prov:Activity or prov:Agent.",
   :prov/inverse #xsd/string "entityOfInfluence",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/EntityInfluence,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "entity",
   :rdfs/range :prov/Entity,
   :rdfs/subPropertyOf :prov/influencer})

(def generated
  "generated"
  {:db/ident :prov/generated,
   :owl/inverseOf :prov/wasGeneratedBy,
   :prov/category #xsd/string "expanded",
   :prov/component #xsd/string "entities-activities",
   :prov/editorialNote
   #xsd/langString
    "prov:generated is one of few inverse property defined, to allow Activity-oriented assertions in addition to Entity-oriented assertions.@en",
   :prov/inverse #xsd/string "wasGeneratedBy",
   :prov/sharesDefinitionWith :prov/Generation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "generated",
   :rdfs/range :prov/Entity,
   :rdfs/seeAlso :prov/Generation,
   :rdfs/subPropertyOf :prov/influenced})

(def generatedAtTime
  "The time at which an entity was completely created and is available for use."
  {:db/ident :prov/generatedAtTime,
   :prov/category #xsd/string "expanded",
   :prov/component #xsd/string "entities-activities",
   :prov/editorialNote
   #xsd/langString
    "It is the intent that the property chain holds: (prov:qualifiedGeneration o prov:atTime) rdfs:subPropertyOf prov:generatedAtTime.@en",
   :prov/qualifiedForm [:prov/atTime :prov/Generation],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The time at which an entity was completely created and is available for use.@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "generatedAtTime",
   :rdfs/range :xsd/dateTime,
   :rdfs/seeAlso [:prov/atTime :prov/Generation]})

(def hadActivity
  "hadActivity"
  {:db/ident :prov/hadActivity,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "derivations",
   :prov/editorialNote
   #xsd/langString
    "The multiple rdfs:domain assertions are intended. One is simpler and works for OWL-RL, the union is more specific but is not recognized by OWL-RL.@en",
   :prov/inverse #xsd/string "wasActivityOfInfluence",
   :prov/sharesDefinitionWith :prov/Activity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "The _optional_ Activity of an Influence, which used, generated, invalidated, or was the responsibility of some Entity. This property is _not_ used by ActivityInfluence (use prov:activity instead).@en"
    #xsd/string
     "This property has multiple RDFS domains to suit multiple OWL Profiles. See <a href=\"#owl-profile\">PROV-O OWL Profile</a>."],
   :rdfs/domain
   [:prov/Influence
    {:owl/unionOf [:prov/Delegation :prov/Derivation :prov/End :prov/Start],
     :rdf/type    :owl/Class}],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "hadActivity",
   :rdfs/range :prov/Activity,
   :rdfs/seeAlso :prov/Activity})

(def hadGeneration
  "The _optional_ Generation involved in an Entity's Derivation."
  {:db/ident :prov/hadGeneration,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "derivations",
   :prov/inverse #xsd/string "generatedAsDerivation",
   :prov/sharesDefinitionWith :prov/Generation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "The _optional_ Generation involved in an Entity's Derivation.@en",
   :rdfs/domain :prov/Derivation,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "hadGeneration",
   :rdfs/range :prov/Generation,
   :rdfs/seeAlso :prov/Generation})

(def hadMember
  "hadMember"
  {:db/ident           :prov/hadMember,
   :prov/category      #xsd/string "expanded",
   :prov/component     #xsd/string "expanded",
   :prov/inverse       #xsd/string "wasMemberOf",
   :prov/sharesDefinitionWith :prov/Collection,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :prov/Collection,
   :rdfs/isDefinedBy   {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label         #xsd/string "hadMember",
   :rdfs/range         :prov/Entity,
   :rdfs/seeAlso       :prov/Collection,
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def hadPlan
  "The _optional_ Plan adopted by an Agent in Association with some Activity. Plan specifications are out of the scope of this specification."
  {:db/ident :prov/hadPlan,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "agents-responsibility",
   :prov/inverse #xsd/string "wasPlanOf",
   :prov/sharesDefinitionWith :prov/Plan,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "The _optional_ Plan adopted by an Agent in Association with some Activity. Plan specifications are out of the scope of this specification.@en",
   :rdfs/domain :prov/Association,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "hadPlan",
   :rdfs/range :prov/Plan,
   :rdfs/seeAlso :prov/Plan})

(def hadPrimarySource
  "hadPrimarySource"
  {:db/ident               :prov/hadPrimarySource,
   :owl/propertyChainAxiom [:prov/qualifiedPrimarySource :prov/entity],
   :prov/category          #xsd/string "expanded",
   :prov/component         #xsd/string "derivations",
   :prov/inverse           #xsd/string "wasPrimarySourceOf",
   :prov/qualifiedForm     [:prov/PrimarySource :prov/qualifiedPrimarySource],
   :rdf/type               :owl/ObjectProperty,
   :rdfs/domain            :prov/Entity,
   :rdfs/isDefinedBy       {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label             #xsd/string "hadPrimarySource",
   :rdfs/range             :prov/Entity,
   :rdfs/seeAlso           [:prov/PrimarySource :prov/qualifiedPrimarySource],
   :rdfs/subPropertyOf     [:prov/wasDerivedFrom :prov/wasInfluencedBy]})

(def hadRole
  "hadRole"
  {:db/ident :prov/hadRole,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "agents-responsibility",
   :prov/definition
   #xsd/langString
    "prov:hadRole references the Role (i.e. the function of an entity with respect to an activity), in the context of an instantaneous usage, generation, association, start, and end.@en",
   :prov/editorsDefinition
   #xsd/langString
    "prov:hadRole references the Role (i.e. the function of an entity with respect to an activity), in the context of an instantaneous usage, generation, association, start, and end.@en",
   :prov/inverse #xsd/string "wasRoleIn",
   :prov/sharesDefinitionWith :prov/Role,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/langString
     "The _optional_ Role that an Entity assumed in the context of an Activity. For example, :baking prov:used :spoon; prov:qualified [ a prov:Usage; prov:entity :spoon; prov:hadRole roles:mixing_implement ].@en"
    #xsd/string
     "This property has multiple RDFS domains to suit multiple OWL Profiles. See <a href=\"#owl-profile\">PROV-O OWL Profile</a>."],
   :rdfs/domain [{:owl/unionOf [:prov/Association :prov/InstantaneousEvent],
                  :rdf/type    :owl/Class}
                 :prov/Influence],
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "hadRole",
   :rdfs/range :prov/Role,
   :rdfs/seeAlso :prov/Role})

(def hadUsage
  "The _optional_ Usage involved in an Entity's Derivation."
  {:db/ident :prov/hadUsage,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "derivations",
   :prov/inverse #xsd/string "wasUsedInDerivation",
   :prov/sharesDefinitionWith :prov/Usage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment #xsd/langString
                  "The _optional_ Usage involved in an Entity's Derivation.@en",
   :rdfs/domain :prov/Derivation,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "hadUsage",
   :rdfs/range :prov/Usage,
   :rdfs/seeAlso :prov/Usage})

(def influenced
  "influenced"
  {:db/ident         :prov/influenced,
   :owl/inverseOf    :prov/wasInfluencedBy,
   :prov/category    #xsd/string "expanded",
   :prov/component   #xsd/string "agents-responsibility",
   :prov/inverse     #xsd/string "wasInfluencedBy",
   :prov/sharesDefinitionWith :prov/Influence,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label       #xsd/string "influenced",
   :rdfs/seeAlso     :prov/Influence})

(def influencer
  "Subproperties of prov:influencer are used to cite the object of an unqualified PROV-O triple whose predicate is a subproperty of prov:wasInfluencedBy (e.g. prov:used, prov:wasGeneratedBy). prov:influencer is used much like rdf:object is used."
  {:db/ident :prov/influencer,
   :prov/category #xsd/string "qualified",
   :prov/definition
   #xsd/langString
    "This property is used as part of the qualified influence pattern. Subclasses of prov:Influence use these subproperties to reference the resource (Entity, Agent, or Activity) whose influence is being qualified.@en",
   :prov/dm {:rdfa/uri
             "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-influence"},
   :prov/editorialNote
   #xsd/langString
    "This property and its subproperties are used in the same way as the rdf:object property, i.e. to reference the object of an unqualified prov:wasInfluencedBy or prov:influenced triple.@en",
   :prov/editorsDefinition
   #xsd/langString
    "This property is used as part of the qualified influence pattern. Subclasses of prov:Influence use these subproperties to reference the resource (Entity, Agent, or Activity) whose influence is being qualified.@en",
   :prov/inverse #xsd/string "hadInfluence",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Subproperties of prov:influencer are used to cite the object of an unqualified PROV-O triple whose predicate is a subproperty of prov:wasInfluencedBy (e.g. prov:used, prov:wasGeneratedBy). prov:influencer is used much like rdf:object is used.@en",
   :rdfs/domain :prov/Influence,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "influencer",
   :rdfs/range :owl/Thing,
   :rdfs/seeAlso
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-influence"}})

(def invalidated
  "invalidated"
  {:db/ident :prov/invalidated,
   :owl/inverseOf :prov/wasInvalidatedBy,
   :prov/category #xsd/string "expanded",
   :prov/component #xsd/string "entities-activities",
   :prov/editorialNote
   #xsd/langString
    "prov:invalidated is one of few inverse property defined, to allow Activity-oriented assertions in addition to Entity-oriented assertions.@en",
   :prov/inverse #xsd/string "wasInvalidatedBy",
   :prov/sharesDefinitionWith :prov/Invalidation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "invalidated",
   :rdfs/range :prov/Entity,
   :rdfs/seeAlso :prov/Invalidation,
   :rdfs/subPropertyOf :prov/influenced})

(def invalidatedAtTime
  "The time at which an entity was invalidated (i.e., no longer usable)."
  {:db/ident :prov/invalidatedAtTime,
   :prov/category #xsd/string "expanded",
   :prov/component #xsd/string "entities-activities",
   :prov/editorialNote
   #xsd/langString
    "It is the intent that the property chain holds: (prov:qualifiedInvalidation o prov:atTime) rdfs:subPropertyOf prov:invalidatedAtTime.@en",
   :prov/qualifiedForm [:prov/atTime :prov/Invalidation],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The time at which an entity was invalidated (i.e., no longer usable).@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "invalidatedAtTime",
   :rdfs/range :xsd/dateTime,
   :rdfs/seeAlso [:prov/atTime :prov/Invalidation]})

(def inverse
  "PROV-O does not define all property inverses. The directionalities defined in PROV-O should be given preference over those not defined. However, if users wish to name the inverse of a PROV-O property, the local name given by prov:inverse should be used."
  {:db/ident :prov/inverse,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #xsd/langString
    "PROV-O does not define all property inverses. The directionalities defined in PROV-O should be given preference over those not defined. However, if users wish to name the inverse of a PROV-O property, the local name given by prov:inverse should be used.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/seeAlso {:rdfa/uri
                  "http://www.w3.org/TR/prov-o/#names-of-inverse-properties"}})

(def n
  "A reference to the principal section of the PROV-DM document that describes this concept."
  {:db/ident :prov/n,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #xsd/langString
    "A reference to the principal section of the PROV-DM document that describes this concept.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def order
  "The position that this OWL term should be listed within documentation. The scope of the documentation (e.g., among all terms, among terms within a prov:category, among properties applying to a particular class, etc.) is unspecified."
  {:db/ident :prov/order,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #xsd/langString
    "The position that this OWL term should be listed within documentation. The scope of the documentation (e.g., among all terms, among terms within a prov:category, among properties applying to a particular class, etc.) is unspecified.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"}})

(def qualifiedAssociation
  "If this Activity prov:wasAssociatedWith Agent :ag, then it can qualify the Association using prov:qualifiedAssociation [ a prov:Association;  prov:agent :ag; :foo :bar ]."
  {:db/ident :prov/qualifiedAssociation,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "agents-responsibility",
   :prov/inverse #xsd/string "qualifiedAssociationOf",
   :prov/sharesDefinitionWith :prov/Association,
   :prov/unqualifiedForm :prov/wasAssociatedWith,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "If this Activity prov:wasAssociatedWith Agent :ag, then it can qualify the Association using prov:qualifiedAssociation [ a prov:Association;  prov:agent :ag; :foo :bar ].@en",
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "qualifiedAssociation",
   :rdfs/range :prov/Association,
   :rdfs/seeAlso [:prov/Association :prov/wasAssociatedWith],
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedAttribution
  "If this Entity prov:wasAttributedTo Agent :ag, then it can qualify how it was influenced using prov:qualifiedAttribution [ a prov:Attribution;  prov:agent :ag; :foo :bar ]."
  {:db/ident :prov/qualifiedAttribution,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "agents-responsibility",
   :prov/inverse #xsd/string "qualifiedAttributionOf",
   :prov/sharesDefinitionWith :prov/Attribution,
   :prov/unqualifiedForm :prov/wasAttributedTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "If this Entity prov:wasAttributedTo Agent :ag, then it can qualify how it was influenced using prov:qualifiedAttribution [ a prov:Attribution;  prov:agent :ag; :foo :bar ].@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "qualifiedAttribution",
   :rdfs/range :prov/Attribution,
   :rdfs/seeAlso [:prov/Attribution :prov/wasAttributedTo],
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedCommunication
  "If this Activity prov:wasInformedBy Activity :a, then it can qualify how it was influenced using prov:qualifiedCommunication [ a prov:Communication;  prov:activity :a; :foo :bar ]."
  {:db/ident :prov/qualifiedCommunication,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "entities-activities",
   :prov/inverse #xsd/string "qualifiedCommunicationOf",
   :prov/qualifiedForm :prov/Communication,
   :prov/sharesDefinitionWith :prov/Communication,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "If this Activity prov:wasInformedBy Activity :a, then it can qualify how it was influenced using prov:qualifiedCommunication [ a prov:Communication;  prov:activity :a; :foo :bar ].@en",
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "qualifiedCommunication",
   :rdfs/range :prov/Communication,
   :rdfs/seeAlso :prov/Communication,
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedDelegation
  "If this Agent prov:actedOnBehalfOf Agent :ag, then it can qualify how with prov:qualifiedResponsibility [ a prov:Responsibility;  prov:agent :ag; :foo :bar ]."
  {:db/ident :prov/qualifiedDelegation,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "agents-responsibility",
   :prov/inverse #xsd/string "qualifiedDelegationOf",
   :prov/sharesDefinitionWith :prov/Delegation,
   :prov/unqualifiedForm :prov/actedOnBehalfOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "If this Agent prov:actedOnBehalfOf Agent :ag, then it can qualify how with prov:qualifiedResponsibility [ a prov:Responsibility;  prov:agent :ag; :foo :bar ].@en",
   :rdfs/domain :prov/Agent,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "qualifiedDelegation",
   :rdfs/range :prov/Delegation,
   :rdfs/seeAlso [:prov/Delegation :prov/actedOnBehalfOf],
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedDerivation
  "If this Entity prov:wasDerivedFrom Entity :e, then it can qualify how it was derived using prov:qualifiedDerivation [ a prov:Derivation;  prov:entity :e; :foo :bar ]."
  {:db/ident :prov/qualifiedDerivation,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "derivations",
   :prov/inverse #xsd/string "qualifiedDerivationOf",
   :prov/sharesDefinitionWith :prov/Derivation,
   :prov/unqualifiedForm :prov/wasDerivedFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "If this Entity prov:wasDerivedFrom Entity :e, then it can qualify how it was derived using prov:qualifiedDerivation [ a prov:Derivation;  prov:entity :e; :foo :bar ].@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "qualifiedDerivation",
   :rdfs/range :prov/Derivation,
   :rdfs/seeAlso [:prov/Derivation :prov/wasDerivedFrom],
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedEnd
  "If this Activity prov:wasEndedBy Entity :e1, then it can qualify how it was ended using prov:qualifiedEnd [ a prov:End;  prov:entity :e1; :foo :bar ]."
  {:db/ident :prov/qualifiedEnd,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "entities-activities",
   :prov/inverse #xsd/string "qualifiedEndOf",
   :prov/sharesDefinitionWith :prov/End,
   :prov/unqualifiedForm :prov/wasEndedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "If this Activity prov:wasEndedBy Entity :e1, then it can qualify how it was ended using prov:qualifiedEnd [ a prov:End;  prov:entity :e1; :foo :bar ].@en",
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "qualifiedEnd",
   :rdfs/range :prov/End,
   :rdfs/seeAlso [:prov/End :prov/wasEndedBy],
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedForm
  "This annotation property links a subproperty of prov:wasInfluencedBy with the subclass of prov:Influence and the qualifying property that are used to qualify it. \n\nExample annotation:\n\n    prov:wasGeneratedBy prov:qualifiedForm prov:qualifiedGeneration, prov:Generation .\n\nThen this unqualified assertion:\n\n    :entity1 prov:wasGeneratedBy :activity1 .\n\ncan be qualified by adding:\n\n   :entity1 prov:qualifiedGeneration :entity1Gen .\n   :entity1Gen \n       a prov:Generation, prov:Influence;\n       prov:activity :activity1;\n       :customValue 1337 .\n\nNote how the value of the unqualified influence (prov:wasGeneratedBy :activity1) is mirrored as the value of the prov:activity (or prov:entity, or prov:agent) property on the influence class."
  {:db/ident :prov/qualifiedForm,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #xsd/langString
    "This annotation property links a subproperty of prov:wasInfluencedBy with the subclass of prov:Influence and the qualifying property that are used to qualify it. \n\nExample annotation:\n\n    prov:wasGeneratedBy prov:qualifiedForm prov:qualifiedGeneration, prov:Generation .\n\nThen this unqualified assertion:\n\n    :entity1 prov:wasGeneratedBy :activity1 .\n\ncan be qualified by adding:\n\n   :entity1 prov:qualifiedGeneration :entity1Gen .\n   :entity1Gen \n       a prov:Generation, prov:Influence;\n       prov:activity :activity1;\n       :customValue 1337 .\n\nNote how the value of the unqualified influence (prov:wasGeneratedBy :activity1) is mirrored as the value of the prov:activity (or prov:entity, or prov:agent) property on the influence class.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def qualifiedGeneration
  "If this Activity prov:generated Entity :e, then it can qualify how it performed the Generation using prov:qualifiedGeneration [ a prov:Generation;  prov:entity :e; :foo :bar ]."
  {:db/ident :prov/qualifiedGeneration,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "entities-activities",
   :prov/inverse #xsd/string "qualifiedGenerationOf",
   :prov/sharesDefinitionWith :prov/Generation,
   :prov/unqualifiedForm :prov/wasGeneratedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "If this Activity prov:generated Entity :e, then it can qualify how it performed the Generation using prov:qualifiedGeneration [ a prov:Generation;  prov:entity :e; :foo :bar ].@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "qualifiedGeneration",
   :rdfs/range :prov/Generation,
   :rdfs/seeAlso [:prov/Generation :prov/wasGeneratedBy],
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedInfluence
  "Because prov:qualifiedInfluence is a broad relation, the more specific relations (qualifiedCommunication, qualifiedDelegation, qualifiedEnd, etc.) should be used when applicable."
  {:db/ident :prov/qualifiedInfluence,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "derivations",
   :prov/inverse #xsd/string "qualifiedInfluenceOf",
   :prov/sharesDefinitionWith :prov/Influence,
   :prov/unqualifiedForm :prov/wasInfluencedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Because prov:qualifiedInfluence is a broad relation, the more specific relations (qualifiedCommunication, qualifiedDelegation, qualifiedEnd, etc.) should be used when applicable.@en",
   :rdfs/domain {:owl/unionOf [:prov/Activity :prov/Agent :prov/Entity],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "qualifiedInfluence",
   :rdfs/range :prov/Influence,
   :rdfs/seeAlso [:prov/Influence :prov/wasInfluencedBy]})

(def qualifiedInvalidation
  "If this Entity prov:wasInvalidatedBy Activity :a, then it can qualify how it was invalidated using prov:qualifiedInvalidation [ a prov:Invalidation;  prov:activity :a; :foo :bar ]."
  {:db/ident :prov/qualifiedInvalidation,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "entities-activities",
   :prov/inverse #xsd/string "qualifiedInvalidationOf",
   :prov/sharesDefinitionWith :prov/Invalidation,
   :prov/unqualifiedForm :prov/wasInvalidatedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "If this Entity prov:wasInvalidatedBy Activity :a, then it can qualify how it was invalidated using prov:qualifiedInvalidation [ a prov:Invalidation;  prov:activity :a; :foo :bar ].@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "qualifiedInvalidation",
   :rdfs/range :prov/Invalidation,
   :rdfs/seeAlso [:prov/Invalidation :prov/wasInvalidatedBy],
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedPrimarySource
  "If this Entity prov:hadPrimarySource Entity :e, then it can qualify how using prov:qualifiedPrimarySource [ a prov:PrimarySource; prov:entity :e; :foo :bar ]."
  {:db/ident :prov/qualifiedPrimarySource,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "derivations",
   :prov/inverse #xsd/string "qualifiedSourceOf",
   :prov/sharesDefinitionWith :prov/PrimarySource,
   :prov/unqualifiedForm :prov/hadPrimarySource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "If this Entity prov:hadPrimarySource Entity :e, then it can qualify how using prov:qualifiedPrimarySource [ a prov:PrimarySource; prov:entity :e; :foo :bar ].@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "qualifiedPrimarySource",
   :rdfs/range :prov/PrimarySource,
   :rdfs/seeAlso [:prov/PrimarySource :prov/hadPrimarySource],
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedQuotation
  "If this Entity prov:wasQuotedFrom Entity :e, then it can qualify how using prov:qualifiedQuotation [ a prov:Quotation;  prov:entity :e; :foo :bar ]."
  {:db/ident :prov/qualifiedQuotation,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "derivations",
   :prov/inverse #xsd/string "qualifiedQuotationOf",
   :prov/sharesDefinitionWith :prov/Quotation,
   :prov/unqualifiedForm :prov/wasQuotedFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "If this Entity prov:wasQuotedFrom Entity :e, then it can qualify how using prov:qualifiedQuotation [ a prov:Quotation;  prov:entity :e; :foo :bar ].@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "qualifiedQuotation",
   :rdfs/range :prov/Quotation,
   :rdfs/seeAlso [:prov/Quotation :prov/wasQuotedFrom],
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedRevision
  "If this Entity prov:wasRevisionOf Entity :e, then it can qualify how it was revised using prov:qualifiedRevision [ a prov:Revision;  prov:entity :e; :foo :bar ]."
  {:db/ident :prov/qualifiedRevision,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "derivations",
   :prov/inverse #xsd/string "revisedEntity",
   :prov/sharesDefinitionWith :prov/Revision,
   :prov/unqualifiedForm :prov/wasRevisionOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "If this Entity prov:wasRevisionOf Entity :e, then it can qualify how it was revised using prov:qualifiedRevision [ a prov:Revision;  prov:entity :e; :foo :bar ].@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "qualifiedRevision",
   :rdfs/range :prov/Revision,
   :rdfs/seeAlso [:prov/Revision :prov/wasRevisionOf],
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedStart
  "If this Activity prov:wasStartedBy Entity :e1, then it can qualify how it was started using prov:qualifiedStart [ a prov:Start;  prov:entity :e1; :foo :bar ]."
  {:db/ident :prov/qualifiedStart,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "entities-activities",
   :prov/inverse #xsd/string "qualifiedStartOf",
   :prov/sharesDefinitionWith :prov/Start,
   :prov/unqualifiedForm :prov/wasStartedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "If this Activity prov:wasStartedBy Entity :e1, then it can qualify how it was started using prov:qualifiedStart [ a prov:Start;  prov:entity :e1; :foo :bar ].@en",
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "qualifiedStart",
   :rdfs/range :prov/Start,
   :rdfs/seeAlso [:prov/Start :prov/wasStartedBy],
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedUsage
  "If this Activity prov:used Entity :e, then it can qualify how it used it using prov:qualifiedUsage [ a prov:Usage; prov:entity :e; :foo :bar ]."
  {:db/ident :prov/qualifiedUsage,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "entities-activities",
   :prov/inverse #xsd/string "qualifiedUsingActivity",
   :prov/sharesDefinitionWith :prov/Usage,
   :prov/unqualifiedForm :prov/used,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "If this Activity prov:used Entity :e, then it can qualify how it used it using prov:qualifiedUsage [ a prov:Usage; prov:entity :e; :foo :bar ].@en",
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "qualifiedUsage",
   :rdfs/range :prov/Usage,
   :rdfs/seeAlso [:prov/Usage :prov/used],
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def sharesDefinitionWith
  {:db/ident         :prov/sharesDefinitionWith,
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def specializationOf
  "specializationOf"
  {:db/ident :prov/specializationOf,
   :prov/category #xsd/string "expanded",
   :prov/component #xsd/string "alternate",
   :prov/constraints
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"},
   :prov/definition
   #xsd/langString
    "An entity that is a specialization of another shares all aspects of the latter, and additionally presents more specific aspects of the same thing as the latter. In particular, the lifetime of the entity being specialized contains that of any specialization. Examples of aspects include a time period, an abstraction, and a context associated with the entity.@en",
   :prov/dm
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-specialization"},
   :prov/inverse #xsd/string "generalizationOf",
   :prov/n
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-specialization"},
   :rdf/type [:owl/ObjectProperty :owl/AnnotationProperty],
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "specializationOf",
   :rdfs/range :prov/Entity,
   :rdfs/seeAlso
   [:prov/alternateOf
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"}
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-specialization"}
    {:rdfa/uri
     "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-specialization"}],
   :rdfs/subPropertyOf :prov/alternateOf})

(def startedAtTime
  "The time at which an activity started. See also prov:endedAtTime."
  {:db/ident :prov/startedAtTime,
   :prov/category #xsd/string "starting-point",
   :prov/component #xsd/string "entities-activities",
   :prov/editorialNote
   #xsd/langString
    "It is the intent that the property chain holds: (prov:qualifiedStart o prov:atTime) rdfs:subPropertyOf prov:startedAtTime.@en",
   :prov/qualifiedForm [:prov/Start :prov/atTime],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #xsd/langString
    "The time at which an activity started. See also prov:endedAtTime.@en",
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "startedAtTime",
   :rdfs/range :xsd/dateTime,
   :rdfs/seeAlso [:prov/Start :prov/atTime]})

(def todo
  {:db/ident :prov/todo,
   :rdf/type :owl/AnnotationProperty})

(def unqualifiedForm
  "Classes and properties used to qualify relationships are annotated with prov:unqualifiedForm to indicate the property used to assert an unqualified provenance relation."
  {:db/ident :prov/unqualifiedForm,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #xsd/langString
    "Classes and properties used to qualify relationships are annotated with prov:unqualifiedForm to indicate the property used to assert an unqualified provenance relation.@en",
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def used
  "A prov:Entity that was used by this prov:Activity. For example, :baking prov:used :spoon, :egg, :oven ."
  {:db/ident :prov/used,
   :owl/propertyChainAxiom [:prov/qualifiedUsage :prov/entity],
   :prov/category #xsd/string "starting-point",
   :prov/component #xsd/string "entities-activities",
   :prov/inverse #xsd/string "wasUsedBy",
   :prov/qualifiedForm [:prov/Usage :prov/qualifiedUsage],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "A prov:Entity that was used by this prov:Activity. For example, :baking prov:used :spoon, :egg, :oven .@en",
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "used",
   :rdfs/range :prov/Entity,
   :rdfs/seeAlso [:prov/Usage :prov/qualifiedUsage],
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def value
  "value"
  {:db/ident :prov/value,
   :prov/category #xsd/string "expanded",
   :prov/component #xsd/string "entities-activities",
   :prov/definition
   #xsd/langString
    "Provides a value that is a direct representation of an entity.@en",
   :prov/dm
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-attribute-value"},
   :prov/editorialNote
   [#xsd/langString
     "This property serves the same purpose as rdf:value, but has been reintroduced to avoid some of the definitional ambiguity in the RDF specification (specifically, 'may be used in describing structured values').@en"
    #xsd/string
     "The editor's definition comes from http://www.w3.org/TR/rdf-primer/#rdfvalue"],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "value",
   :rdfs/seeAlso
   {:rdfa/uri
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-attribute-value"}})

(def wasAssociatedWith
  "An prov:Agent that had some (unspecified) responsibility for the occurrence of this prov:Activity."
  {:db/ident :prov/wasAssociatedWith,
   :owl/propertyChainAxiom [:prov/qualifiedAssociation :prov/agent],
   :prov/category #xsd/string "starting-point",
   :prov/component #xsd/string "agents-responsibility",
   :prov/inverse #xsd/string "wasAssociateFor",
   :prov/qualifiedForm [:prov/Association :prov/qualifiedAssociation],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "An prov:Agent that had some (unspecified) responsibility for the occurrence of this prov:Activity.@en",
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "wasAssociatedWith",
   :rdfs/range :prov/Agent,
   :rdfs/seeAlso [:prov/Association :prov/qualifiedAssociation],
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def wasAttributedTo
  "Attribution is the ascribing of an entity to an agent."
  {:db/ident :prov/wasAttributedTo,
   :owl/propertyChainAxiom [:prov/qualifiedAttribution :prov/agent],
   :prov/category #xsd/string "starting-point",
   :prov/component #xsd/string "agents-responsibility",
   :prov/definition
   #xsd/langString "Attribution is the ascribing of an entity to an agent.@en",
   :prov/inverse #xsd/string "contributed",
   :prov/qualifiedForm [:prov/Attribution :prov/qualifiedAttribution],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment #xsd/langString
                  "Attribution is the ascribing of an entity to an agent.@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "wasAttributedTo",
   :rdfs/range :prov/Agent,
   :rdfs/seeAlso [:prov/Attribution :prov/qualifiedAttribution],
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def wasDerivedFrom
  "The more specific subproperties of prov:wasDerivedFrom (i.e., prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource) should be used when applicable."
  {:db/ident :prov/wasDerivedFrom,
   :owl/propertyChainAxiom [:prov/qualifiedDerivation :prov/entity],
   :prov/category #xsd/string "starting-point",
   :prov/component #xsd/string "derivations",
   :prov/definition
   #xsd/langString
    "A derivation is a transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a pre-existing entity.@en",
   :prov/inverse #xsd/string "hadDerivation",
   :prov/qualifiedForm [:prov/Derivation :prov/qualifiedDerivation],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "The more specific subproperties of prov:wasDerivedFrom (i.e., prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource) should be used when applicable.@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "wasDerivedFrom",
   :rdfs/range :prov/Entity,
   :rdfs/seeAlso [:prov/Derivation :prov/qualifiedDerivation],
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def wasEndedBy
  "End is when an activity is deemed to have ended. An end may refer to an entity, known as trigger, that terminated the activity."
  {:db/ident :prov/wasEndedBy,
   :owl/propertyChainAxiom [:prov/qualifiedEnd :prov/entity],
   :prov/category #xsd/string "expanded",
   :prov/component #xsd/string "entities-activities",
   :prov/inverse #xsd/string "ended",
   :prov/qualifiedForm [:prov/qualifiedEnd :prov/End],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "End is when an activity is deemed to have ended. An end may refer to an entity, known as trigger, that terminated the activity.@en",
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "wasEndedBy",
   :rdfs/range :prov/Entity,
   :rdfs/seeAlso [:prov/qualifiedEnd :prov/End],
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def wasGeneratedBy
  "wasGeneratedBy"
  {:db/ident               :prov/wasGeneratedBy,
   :owl/propertyChainAxiom [:prov/qualifiedGeneration :prov/activity],
   :prov/category          #xsd/string "starting-point",
   :prov/component         #xsd/string "entities-activities",
   :prov/inverse           #xsd/string "generated",
   :prov/qualifiedForm     [:prov/Generation :prov/qualifiedGeneration],
   :rdf/type               :owl/ObjectProperty,
   :rdfs/domain            :prov/Entity,
   :rdfs/isDefinedBy       {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label             #xsd/string "wasGeneratedBy",
   :rdfs/range             :prov/Activity,
   :rdfs/seeAlso           [:prov/Generation :prov/qualifiedGeneration],
   :rdfs/subPropertyOf     :prov/wasInfluencedBy})

(def wasInfluencedBy
  "wasInfluencedBy"
  {:db/ident :prov/wasInfluencedBy,
   :prov/category #xsd/string "qualified",
   :prov/component #xsd/string "agents-responsibility",
   :prov/editorialNote
   #xsd/langString
    "The sub-properties of prov:wasInfluencedBy can be elaborated in more detail using the Qualification Pattern. For example, the binary relation :baking prov:used :spoon can be qualified by asserting :baking prov:qualifiedUsage [ a prov:Usage; prov:entity :spoon; prov:atLocation :kitchen ] .\n\nSubproperties of prov:wasInfluencedBy may also be asserted directly without being qualified.\n\nprov:wasInfluencedBy should not be used without also using one of its subproperties. \n@en",
   :prov/inverse #xsd/string "influenced",
   :prov/qualifiedForm [:prov/Influence :prov/qualifiedInfluence],
   :prov/sharesDefinitionWith :prov/Influence,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#xsd/string
     "This property has multiple RDFS domains to suit multiple OWL Profiles. See <a href=\"#owl-profile\">PROV-O OWL Profile</a>."
    #xsd/langString
     "Because prov:wasInfluencedBy is a broad relation, its more specific subproperties (e.g. prov:wasInformedBy, prov:actedOnBehalfOf, prov:wasEndedBy, etc.) should be used when applicable.@en"],
   :rdfs/domain {:owl/unionOf [:prov/Activity :prov/Agent :prov/Entity],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "wasInfluencedBy",
   :rdfs/range {:owl/unionOf [:prov/Activity :prov/Agent :prov/Entity],
                :rdf/type    :owl/Class},
   :rdfs/seeAlso [:prov/Influence :prov/qualifiedInfluence]})

(def wasInformedBy
  "An activity a2 is dependent on or informed by another activity a1, by way of some unspecified entity that is generated by a1 and used by a2."
  {:db/ident :prov/wasInformedBy,
   :owl/propertyChainAxiom [:prov/qualifiedCommunication :prov/activity],
   :prov/category #xsd/string "starting-point",
   :prov/component #xsd/string "entities-activities",
   :prov/inverse #xsd/string "informed",
   :prov/qualifiedForm [:prov/qualifiedCommunication :prov/Communication],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "An activity a2 is dependent on or informed by another activity a1, by way of some unspecified entity that is generated by a1 and used by a2.@en",
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "wasInformedBy",
   :rdfs/range :prov/Activity,
   :rdfs/seeAlso [:prov/qualifiedCommunication :prov/Communication],
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def wasInvalidatedBy
  "wasInvalidatedBy"
  {:db/ident               :prov/wasInvalidatedBy,
   :owl/propertyChainAxiom [:prov/qualifiedInvalidation :prov/activity],
   :prov/category          #xsd/string "expanded",
   :prov/component         #xsd/string "entities-activities",
   :prov/inverse           #xsd/string "invalidated",
   :prov/qualifiedForm     [:prov/qualifiedInvalidation :prov/Invalidation],
   :rdf/type               :owl/ObjectProperty,
   :rdfs/domain            :prov/Entity,
   :rdfs/isDefinedBy       {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label             #xsd/string "wasInvalidatedBy",
   :rdfs/range             :prov/Activity,
   :rdfs/seeAlso           [:prov/qualifiedInvalidation :prov/Invalidation],
   :rdfs/subPropertyOf     :prov/wasInfluencedBy})

(def wasQuotedFrom
  "An entity is derived from an original entity by copying, or 'quoting', some or all of it."
  {:db/ident :prov/wasQuotedFrom,
   :owl/propertyChainAxiom [:prov/qualifiedQuotation :prov/entity],
   :prov/category #xsd/string "expanded",
   :prov/component #xsd/string "derivations",
   :prov/inverse #xsd/string "quotedAs",
   :prov/qualifiedForm [:prov/qualifiedQuotation :prov/Quotation],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "An entity is derived from an original entity by copying, or 'quoting', some or all of it.@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "wasQuotedFrom",
   :rdfs/range :prov/Entity,
   :rdfs/seeAlso [:prov/qualifiedQuotation :prov/Quotation],
   :rdfs/subPropertyOf [:prov/wasDerivedFrom :prov/wasInfluencedBy]})

(def wasRevisionOf
  "A revision is a derivation that revises an entity into a revised version."
  {:db/ident :prov/wasRevisionOf,
   :owl/propertyChainAxiom [:prov/qualifiedRevision :prov/entity],
   :prov/category #xsd/string "expanded",
   :prov/component #xsd/string "derivations",
   :prov/inverse #xsd/string "hadRevision",
   :prov/qualifiedForm [:prov/Revision :prov/qualifiedRevision],
   :rdf/type [:owl/ObjectProperty :owl/AnnotationProperty],
   :rdfs/comment
   #xsd/langString
    "A revision is a derivation that revises an entity into a revised version.@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "wasRevisionOf",
   :rdfs/range :prov/Entity,
   :rdfs/seeAlso [:prov/Revision :prov/qualifiedRevision],
   :rdfs/subPropertyOf [:prov/wasDerivedFrom :prov/wasInfluencedBy]})

(def wasStartedBy
  "Start is when an activity is deemed to have started. A start may refer to an entity, known as trigger, that initiated the activity."
  {:db/ident :prov/wasStartedBy,
   :owl/propertyChainAxiom [:prov/qualifiedStart :prov/entity],
   :prov/category #xsd/string "expanded",
   :prov/component #xsd/string "entities-activities",
   :prov/inverse #xsd/string "started",
   :prov/qualifiedForm [:prov/qualifiedStart :prov/Start],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #xsd/langString
    "Start is when an activity is deemed to have started. A start may refer to an entity, known as trigger, that initiated the activity.@en",
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o#"},
   :rdfs/label #xsd/string "wasStartedBy",
   :rdfs/range :prov/Entity,
   :rdfs/seeAlso [:prov/qualifiedStart :prov/Start],
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def wasRoleIn
  {:db/ident :prov/wasRoleIn,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/hadRole,
   :rdfs/label #xsd/string "wasRoleIn",
   :rdf/type :owl/ObjectProperty})

(def qualifiedAssociationOf
  {:db/ident :prov/qualifiedAssociationOf,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/qualifiedAssociation,
   :rdfs/label #xsd/string "qualifiedAssociationOf",
   :rdf/type :owl/ObjectProperty})

(def wasUsedInDerivation
  {:db/ident :prov/wasUsedInDerivation,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/hadUsage,
   :rdfs/label #xsd/string "wasUsedInDerivation",
   :rdf/type :owl/ObjectProperty})

(def qualifiedAttributionOf
  {:db/ident :prov/qualifiedAttributionOf,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/qualifiedAttribution,
   :rdfs/label #xsd/string "qualifiedAttributionOf",
   :rdf/type :owl/ObjectProperty})

(def quotedAs
  {:db/ident :prov/quotedAs,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/wasQuotedFrom,
   :rdfs/label #xsd/string "quotedAs",
   :rdf/type :owl/ObjectProperty})

(def hadDerivation
  {:db/ident :prov/hadDerivation,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/wasDerivedFrom,
   :rdfs/label #xsd/string "hadDerivation",
   :rdf/type :owl/ObjectProperty})

(def agentOfInfluence
  {:db/ident :prov/agentOfInfluence,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/agent,
   :rdfs/label #xsd/string "agentOfInfluence",
   :rdf/type :owl/ObjectProperty})

(def started
  {:db/ident :prov/started,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/wasStartedBy,
   :rdfs/label #xsd/string "started",
   :rdf/type :owl/ObjectProperty})

(def qualifiedUsingActivity
  {:db/ident :prov/qualifiedUsingActivity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/qualifiedUsage,
   :rdfs/label #xsd/string "qualifiedUsingActivity",
   :rdf/type :owl/ObjectProperty})

(def qualifiedEndOf
  {:db/ident :prov/qualifiedEndOf,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/qualifiedEnd,
   :rdfs/label #xsd/string "qualifiedEndOf",
   :rdf/type :owl/ObjectProperty})

(def wasUsedBy
  {:db/ident :prov/wasUsedBy,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/used,
   :rdfs/label #xsd/string "wasUsedBy",
   :rdf/type :owl/ObjectProperty})

(def qualifiedDelegationOf
  {:db/ident :prov/qualifiedDelegationOf,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/qualifiedDelegation,
   :rdfs/label #xsd/string "qualifiedDelegationOf",
   :rdf/type :owl/ObjectProperty})

(def generalizationOf
  {:db/ident :prov/generalizationOf,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/specializationOf,
   :rdfs/label #xsd/string "generalizationOf",
   :rdf/type :owl/ObjectProperty})

(def entityOfInfluence
  {:db/ident :prov/entityOfInfluence,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/entity,
   :rdfs/label #xsd/string "entityOfInfluence",
   :rdf/type :owl/ObjectProperty})

(def wasMemberOf
  {:db/ident :prov/wasMemberOf,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/hadMember,
   :rdfs/label #xsd/string "wasMemberOf",
   :rdf/type :owl/ObjectProperty})

(def ended
  {:db/ident :prov/ended,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/wasEndedBy,
   :rdfs/label #xsd/string "ended",
   :rdf/type :owl/ObjectProperty})

(def qualifiedCommunicationOf
  {:db/ident :prov/qualifiedCommunicationOf,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/qualifiedCommunication,
   :rdfs/label #xsd/string "qualifiedCommunicationOf",
   :rdf/type :owl/ObjectProperty})

(def generatedAsDerivation
  {:db/ident :prov/generatedAsDerivation,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/hadGeneration,
   :rdfs/label #xsd/string "generatedAsDerivation",
   :rdf/type :owl/ObjectProperty})

(def qualifiedInfluenceOf
  {:db/ident :prov/qualifiedInfluenceOf,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/qualifiedInfluence,
   :rdfs/label #xsd/string "qualifiedInfluenceOf",
   :rdf/type :owl/ObjectProperty})

(def contributed
  {:db/ident :prov/contributed,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/wasAttributedTo,
   :rdfs/label #xsd/string "contributed",
   :rdf/type :owl/ObjectProperty})

(def wasAssociateFor
  {:db/ident :prov/wasAssociateFor,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/wasAssociatedWith,
   :rdfs/label #xsd/string "wasAssociateFor",
   :rdf/type :owl/ObjectProperty})

(def locationOf
  {:db/ident :prov/locationOf,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/atLocation,
   :rdfs/label #xsd/string "locationOf",
   :rdf/type :owl/ObjectProperty})

(def wasPrimarySourceOf
  {:db/ident :prov/wasPrimarySourceOf,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/hadPrimarySource,
   :rdfs/label #xsd/string "wasPrimarySourceOf",
   :rdf/type :owl/ObjectProperty})

(def hadInfluence
  {:db/ident :prov/hadInfluence,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/influencer,
   :rdfs/label #xsd/string "hadInfluence",
   :rdf/type :owl/ObjectProperty})

(def qualifiedInvalidationOf
  {:db/ident :prov/qualifiedInvalidationOf,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/qualifiedInvalidation,
   :rdfs/label #xsd/string "qualifiedInvalidationOf",
   :rdf/type :owl/ObjectProperty})

(def hadDelegate
  {:db/ident :prov/hadDelegate,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/actedOnBehalfOf,
   :rdfs/label #xsd/string "hadDelegate",
   :rdf/type :owl/ObjectProperty})

(def informed
  {:db/ident :prov/informed,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/wasInformedBy,
   :rdfs/label #xsd/string "informed",
   :rdf/type :owl/ObjectProperty})

(def qualifiedQuotationOf
  {:db/ident :prov/qualifiedQuotationOf,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/qualifiedQuotation,
   :rdfs/label #xsd/string "qualifiedQuotationOf",
   :rdf/type :owl/ObjectProperty})

(def revisedEntity
  {:db/ident :prov/revisedEntity,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/qualifiedRevision,
   :rdfs/label #xsd/string "revisedEntity",
   :rdf/type :owl/ObjectProperty})

(def activityOfInfluence
  {:db/ident :prov/activityOfInfluence,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/activity,
   :rdfs/label #xsd/string "activityOfInfluence",
   :rdf/type :owl/ObjectProperty})

(def qualifiedSourceOf
  {:db/ident :prov/qualifiedSourceOf,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/qualifiedPrimarySource,
   :rdfs/label #xsd/string "qualifiedSourceOf",
   :rdf/type :owl/ObjectProperty})

(def wasActivityOfInfluence
  {:db/ident :prov/wasActivityOfInfluence,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/hadActivity,
   :rdfs/label #xsd/string "wasActivityOfInfluence",
   :rdf/type :owl/ObjectProperty})

(def qualifiedGenerationOf
  {:db/ident :prov/qualifiedGenerationOf,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/qualifiedGeneration,
   :rdfs/label #xsd/string "qualifiedGenerationOf",
   :rdf/type :owl/ObjectProperty})

(def qualifiedDerivationOf
  {:db/ident :prov/qualifiedDerivationOf,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/qualifiedDerivation,
   :rdfs/label #xsd/string "qualifiedDerivationOf",
   :rdf/type :owl/ObjectProperty})

(def wasPlanOf
  {:db/ident :prov/wasPlanOf,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/hadPlan,
   :rdfs/label #xsd/string "wasPlanOf",
   :rdf/type :owl/ObjectProperty})

(def hadRevision
  {:db/ident :prov/hadRevision,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/wasRevisionOf,
   :rdfs/label #xsd/string "hadRevision",
   :rdf/type :owl/ObjectProperty})

(def qualifiedStartOf
  {:db/ident :prov/qualifiedStartOf,
   :rdfs/isDefinedBy {:rdfa/uri "http://www.w3.org/ns/prov-o-inverses#"},
   :owl/inverseOf :prov/qualifiedStart,
   :rdfs/label #xsd/string "qualifiedStartOf",
   :rdf/type :owl/ObjectProperty})
