(ns net.wikipunk.rdf.prov
  "This document is published by the Provenance Working Group (http://www.w3.org/2011/prov/wiki/Main_Page). If you wish to make comments regarding this document, please send them to public-prov-comments@w3.org (subscribe public-prov-comments-request@w3.org, archives http://lists.w3.org/Archives/Public/public-prov-comments/). All feedback is welcome."
  {:dcat/downloadURL "http://www.w3.org/ns/prov-o",
   :owl/versionIRI "http://www.w3.org/ns/prov-o-20130430",
   :owl/versionInfo #voc/lstr "Recommendation version 2013-04-30@en",
   :prov/alternateOf "http://www.w3.org/ns/prov-o",
   :prov/specializationOf "http://www.w3.org/ns/prov-o",
   :prov/wasDerivedFrom "http://www.w3.org/ns/prov-o-20130312",
   :prov/wasInfluencedBy "http://www.w3.org/ns/prov-o-20130312",
   :prov/wasRevisionOf "http://www.w3.org/ns/prov-o-20130312",
   :rdf/ns-prefix-map {"owl"  "http://www.w3.org/2002/07/owl#",
                       "prov" "http://www.w3.org/ns/prov#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type [:owl/Ontology
              :prov/Entity
              {:owl/unionOf [:prov/Activity :prov/Agent :prov/Entity],
               :rdf/type    :owl/Class}],
   :rdfa/prefix "prov",
   :rdfa/uri "http://www.w3.org/ns/prov-o#",
   :rdfs/comment
   #voc/lstr
    "This document is published by the Provenance Working Group (http://www.w3.org/2011/prov/wiki/Main_Page). \n\nIf you wish to make comments regarding this document, please send them to public-prov-comments@w3.org (subscribe public-prov-comments-request@w3.org, archives http://lists.w3.org/Archives/Public/public-prov-comments/). All feedback is welcome.@en",
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/TR/prov-o/"},
   :rdfs/label #voc/lstr "W3C PROVenance Interchange Ontology (PROV-O)@en",
   :rdfs/seeAlso ["http://www.w3.org/ns/prov" "http://www.w3.org/TR/prov-o/"]}
  (:refer-clojure :exclude [agent]))

(def Activity
  "An activity is something that occurs over a period of time and acts upon or with entities; it may include consuming, processing, transforming, modifying, relocating, using, or generating entities."
  {:db/ident :prov/Activity,
   :owl/disjointWith :prov/Entity,
   :prov/category "starting-point",
   :prov/component "entities-activities",
   :prov/constraints
   "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig",
   :prov/definition
   "An activity is something that occurs over a period of time and acts upon or with entities; it may include consuming, processing, transforming, modifying, relocating, using, or generating entities.",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Activity",
   :prov/n "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Activity",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Activity",
   :rdfs/seeAlso
   ["http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Activity"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Activity"]})

(def ActivityInfluence
  "ActivitiyInfluence is the capacity of an activity to have an effect on the character, development, or behavior of another by means of generation, invalidation, communication, or other."
  {:db/ident :prov/ActivityInfluence,
   :owl/disjointWith :prov/EntityInfluence,
   :prov/category "qualified",
   :prov/definition
   #voc/lstr
    "ActivitiyInfluence is the capacity of an activity to have an effect on the character, development, or behavior of another by means of generation, invalidation, communication, or other.@en",
   :prov/editorsDefinition
   #voc/lstr
    "ActivitiyInfluence is the capacity of an activity to have an effect on the character, development, or behavior of another by means of generation, invalidation, communication, or other.@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   [#voc/lstr
     "It is not recommended that the type ActivityInfluence be asserted without also asserting one of its more specific subclasses.@en"
    #voc/lstr
     "ActivityInfluence provides additional descriptions of an Activity's binary influence upon any other kind of resource. Instances of ActivityInfluence use the prov:activity property to cite the influencing Activity.@en"],
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "ActivityInfluence",
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#activity"],
   :rdfs/subClassOf [{:owl/maxCardinality 0,
                      :owl/onProperty     :prov/hadActivity,
                      :rdf/type           :owl/Restriction}
                     :prov/Influence]})

(def Agent
  "An agent is something that bears some form of responsibility for an activity taking place, for the existence of an entity, or for another agent's activity."
  {:db/ident :prov/Agent,
   :owl/disjointWith :prov/InstantaneousEvent,
   :prov/category "starting-point",
   :prov/component "agents-responsibility",
   :prov/definition
   #voc/lstr
    "An agent is something that bears some form of responsibility for an activity taking place, for the existence of an entity, or for another agent's activity. @en",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-agent",
   :prov/n "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Agent",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Agent",
   :rdfs/seeAlso
   ["http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Agent"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-agent"]})

(def AgentInfluence
  "AgentInfluence is the capacity of an agent to have an effect on the character, development, or behavior of another by means of attribution, association, delegation, or other."
  {:db/ident :prov/AgentInfluence,
   :prov/category "qualified",
   :prov/definition
   #voc/lstr
    "AgentInfluence is the capacity of an agent to have an effect on the character, development, or behavior of another by means of attribution, association, delegation, or other.@en",
   :prov/editorsDefinition
   #voc/lstr
    "AgentInfluence is the capacity of an agent to have an effect on the character, development, or behavior of another by means of attribution, association, delegation, or other.@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   [#voc/lstr
     "It is not recommended that the type AgentInfluence be asserted without also asserting one of its more specific subclasses.@en"
    #voc/lstr
     "AgentInfluence provides additional descriptions of an Agent's binary influence upon any other kind of resource. Instances of AgentInfluence use the prov:agent property to cite the influencing Agent.@en"],
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "AgentInfluence",
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#agent"],
   :rdfs/subClassOf :prov/Influence})

(def Association
  "An activity association is an assignment of responsibility to an agent for an activity, indicating that the agent had a role in the activity. It further allows for a plan to be specified, which is the plan intended by the agent to achieve some goals in the context of this activity."
  {:db/ident :prov/Association,
   :prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/definition
   #voc/lstr
    "An activity association is an assignment of responsibility to an agent for an activity, indicating that the agent had a role in the activity. It further allows for a plan to be specified, which is the plan intended by the agent to achieve some goals in the context of this activity.@en",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Association",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Association",
   :prov/unqualifiedForm :prov/wasAssociatedWith,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "An instance of prov:Association provides additional descriptions about the binary prov:wasAssociatedWith relation from an prov:Activity to some prov:Agent that had some responsiblity for it. For example, :baking prov:wasAssociatedWith :baker; prov:qualifiedAssociation [ a prov:Association; prov:agent :baker; :foo :bar ].@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Association",
   :rdfs/seeAlso
   ["http://www.w3.org/ns/prov#wasAssociatedWith"
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Association"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Association"],
   :rdfs/subClassOf [:prov/AgentInfluence :prov/Influence]})

(def Attribution
  "Attribution is the ascribing of an entity to an agent. When an entity e is attributed to agent ag, entity e was generated by some unspecified activity that in turn was associated to agent ag. Thus, this relation is useful when the activity is not known, or irrelevant."
  {:db/ident :prov/Attribution,
   :prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/constraints
   "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig",
   :prov/definition
   #voc/lstr
    "Attribution is the ascribing of an entity to an agent.\n\nWhen an entity e is attributed to agent ag, entity e was generated by some unspecified activity that in turn was associated to agent ag. Thus, this relation is useful when the activity is not known, or irrelevant.@en",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-attribution",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-attribution",
   :prov/unqualifiedForm :prov/wasAttributedTo,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "An instance of prov:Attribution provides additional descriptions about the binary prov:wasAttributedTo relation from an prov:Entity to some prov:Agent that had some responsible for it. For example, :cake prov:wasAttributedTo :baker; prov:qualifiedAttribution [ a prov:Attribution; prov:entity :baker; :foo :bar ].@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Attribution",
   :rdfs/seeAlso
   ["http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"
    "http://www.w3.org/ns/prov#wasAttributedTo"
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-attribution"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-attribution"],
   :rdfs/subClassOf [:prov/AgentInfluence :prov/Influence]})

(def Bundle
  "A bundle is a named set of provenance descriptions, and is itself an Entity, so allowing provenance of provenance to be expressed."
  {:db/ident :prov/Bundle,
   :prov/category "expanded",
   :prov/definition
   #voc/lstr
    "A bundle is a named set of provenance descriptions, and is itself an Entity, so allowing provenance of provenance to be expressed.@en",
   :prov/dm
   "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-bundle-entity",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-bundle-declaration",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Note that there are kinds of bundles (e.g. handwritten letters, audio recordings, etc.) that are not expressed in PROV-O, but can be still be described by PROV-O.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Bundle",
   :rdfs/seeAlso
   ["http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-bundle-declaration"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-bundle-entity"],
   :rdfs/subClassOf :prov/Entity})

(def Collection
  "A collection is an entity that provides a structure to some constituents, which are themselves entities. These constituents are said to be member of the collections."
  {:db/ident :prov/Collection,
   :prov/category "expanded",
   :prov/component "collections",
   :prov/definition
   #voc/lstr
    "A collection is an entity that provides a structure to some constituents, which are themselves entities. These constituents are said to be member of the collections.@en",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-collection",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Collection",
   :rdfs/seeAlso
   ["http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-collection"],
   :rdfs/subClassOf :prov/Entity})

(def Communication
  "Communication is the exchange of an entity by two activities, one activity using the entity generated by the other."
  {:db/ident :prov/Communication,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/constraints
   "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig",
   :prov/definition
   "Communication is the exchange of an entity by two activities, one activity using the entity generated by the other.",
   :prov/dm
   "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Communication",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-wasInformedBy",
   :prov/unqualifiedForm :prov/wasInformedBy,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "An instance of prov:Communication provides additional descriptions about the binary prov:wasInformedBy relation from an informed prov:Activity to the prov:Activity that informed it. For example, :you_jumping_off_bridge prov:wasInformedBy :everyone_else_jumping_off_bridge; prov:qualifiedCommunication [ a prov:Communication; prov:activity :everyone_else_jumping_off_bridge; :foo :bar ].@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Communication",
   :rdfs/seeAlso
   ["http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"
    "http://www.w3.org/ns/prov#wasInformedBy"
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-wasInformedBy"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Communication"],
   :rdfs/subClassOf [:prov/ActivityInfluence
                     :prov/Influence
                     {:owl/maxCardinality 0,
                      :owl/onProperty     :prov/hadActivity,
                      :rdf/type           :owl/Restriction}]})

(def Delegation
  "Delegation is the assignment of authority and responsibility to an agent (by itself or by another agent) to carry out a specific activity as a delegate or representative, while the agent it acts on behalf of retains some responsibility for the outcome of the delegated work. For example, a student acted on behalf of his supervisor, who acted on behalf of the department chair, who acted on behalf of the university; all those agents are responsible in some way for the activity that took place but we do not say explicitly who bears responsibility and to what degree."
  {:db/ident :prov/Delegation,
   :prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/definition
   #voc/lstr
    "Delegation is the assignment of authority and responsibility to an agent (by itself or by another agent) to carry out a specific activity as a delegate or representative, while the agent it acts on behalf of retains some responsibility for the outcome of the delegated work.\n\nFor example, a student acted on behalf of his supervisor, who acted on behalf of the department chair, who acted on behalf of the university; all those agents are responsible in some way for the activity that took place but we do not say explicitly who bears responsibility and to what degree.@en",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-delegation",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-delegation",
   :prov/unqualifiedForm :prov/actedOnBehalfOf,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "An instance of prov:Delegation provides additional descriptions about the binary prov:actedOnBehalfOf relation from a performing prov:Agent to some prov:Agent for whom it was performed. For example, :mixing prov:wasAssociatedWith :toddler . :toddler prov:actedOnBehalfOf :mother; prov:qualifiedDelegation [ a prov:Delegation; prov:entity :mother; :foo :bar ].@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Delegation",
   :rdfs/seeAlso
   ["http://www.w3.org/ns/prov#actedOnBehalfOf"
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-delegation"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-delegation"],
   :rdfs/subClassOf [:prov/AgentInfluence :prov/Influence]})

(def Derivation
  "A derivation is a transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a pre-existing entity."
  {:db/ident :prov/Derivation,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/constraints
   "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig",
   :prov/definition
   #voc/lstr
    "A derivation is a transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a pre-existing entity.@en",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Derivation",
   :prov/n "http://www.w3.org/TR/2013/REC-prov-n-20130430/#Derivation-Relation",
   :prov/unqualifiedForm :prov/wasDerivedFrom,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#voc/lstr
     "An instance of prov:Derivation provides additional descriptions about the binary prov:wasDerivedFrom relation from some derived prov:Entity to another prov:Entity from which it was derived. For example, :chewed_bubble_gum prov:wasDerivedFrom :unwrapped_bubble_gum; prov:qualifiedDerivation [ a prov:Derivation; prov:entity :unwrapped_bubble_gum; :foo :bar ].@en"
    #voc/lstr
     "The more specific forms of prov:Derivation (i.e., prov:Revision, prov:Quotation, prov:PrimarySource) should be asserted if they apply.@en"],
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Derivation",
   :rdfs/seeAlso
   ["http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"
    "http://www.w3.org/ns/prov#wasDerivedFrom"
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#Derivation-Relation"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Derivation"],
   :rdfs/subClassOf [:prov/EntityInfluence :prov/Influence]})

(def EmptyCollection
  "An empty collection is a collection without members."
  {:db/ident         :prov/EmptyCollection,
   :prov/category    "expanded",
   :prov/component   "collections",
   :prov/definition  #voc/lstr
                      "An empty collection is a collection without members.@en",
   :rdf/type         [:owl/NamedIndividual :owl/Class],
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label       #voc/lstr "EmptyCollection@en",
   :rdfs/subClassOf  [:prov/Collection :prov/Entity]})

(def End
  "End is when an activity is deemed to have been ended by an entity, known as trigger. The activity no longer exists after its end. Any usage, generation, or invalidation involving an activity precedes the activity's end. An end may refer to a trigger entity that terminated the activity, or to an activity, known as ender that generated the trigger."
  {:db/ident :prov/End,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/constraints
   "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig",
   :prov/definition
   #voc/lstr
    "End is when an activity is deemed to have been ended by an entity, known as trigger. The activity no longer exists after its end. Any usage, generation, or invalidation involving an activity precedes the activity's end. An end may refer to a trigger entity that terminated the activity, or to an activity, known as ender that generated the trigger.@en",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-End",
   :prov/n "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-End",
   :prov/unqualifiedForm :prov/wasEndedBy,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "An instance of prov:End provides additional descriptions about the binary prov:wasEndedBy relation from some ended prov:Activity to an prov:Entity that ended it. For example, :ball_game prov:wasEndedBy :buzzer; prov:qualifiedEnd [ a prov:End; prov:entity :buzzer; :foo :bar; prov:atTime '2012-03-09T08:05:08-05:00'^^xsd:dateTime ].@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "End",
   :rdfs/seeAlso
   ["http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"
    "http://www.w3.org/ns/prov#wasEndedBy"
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-End"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-End"],
   :rdfs/subClassOf
   [:prov/EntityInfluence :prov/InstantaneousEvent :prov/Influence]})

(def Entity
  "An entity is a physical, digital, conceptual, or other kind of thing with some fixed aspects; entities may be real or imaginary."
  {:db/ident :prov/Entity,
   :owl/disjointWith :prov/InstantaneousEvent,
   :prov/category "starting-point",
   :prov/component "entities-activities",
   :prov/constraints
   "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig",
   :prov/definition
   #voc/lstr
    "An entity is a physical, digital, conceptual, or other kind of thing with some fixed aspects; entities may be real or imaginary. @en",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-entity",
   :prov/n "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Entity",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Entity",
   :rdfs/seeAlso
   ["http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Entity"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-entity"]})

(def EntityInfluence
  "EntityInfluence is the capacity of an entity to have an effect on the character, development, or behavior of another by means of usage, start, end, derivation, or other."
  {:db/ident :prov/EntityInfluence,
   :prov/category "qualified",
   :prov/definition
   #voc/lstr
    "EntityInfluence is the capacity of an entity to have an effect on the character, development, or behavior of another by means of usage, start, end, derivation, or other. @en",
   :prov/editorsDefinition
   #voc/lstr
    "EntityInfluence is the capacity of an entity to have an effect on the character, development, or behavior of another by means of usage, start, end, derivation, or other. @en",
   :rdf/type :owl/Class,
   :rdfs/comment
   [#voc/lstr
     "It is not recommended that the type EntityInfluence be asserted without also asserting one of its more specific subclasses.@en"
    #voc/lstr
     "EntityInfluence provides additional descriptions of an Entity's binary influence upon any other kind of resource. Instances of EntityInfluence use the prov:entity property to cite the influencing Entity.@en"],
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "EntityInfluence",
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#entity"],
   :rdfs/subClassOf :prov/Influence})

(def Generation
  "Generation is the completion of production of a new entity by an activity. This entity did not exist before generation and becomes available for usage after this generation."
  {:db/ident :prov/Generation,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/constraints
   "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig",
   :prov/definition
   #voc/lstr
    "Generation is the completion of production of a new entity by an activity. This entity did not exist before generation and becomes available for usage after this generation.@en",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Generation",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Generation",
   :prov/unqualifiedForm :prov/wasGeneratedBy,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "An instance of prov:Generation provides additional descriptions about the binary prov:wasGeneratedBy relation from a generated prov:Entity to the prov:Activity that generated it. For example, :cake prov:wasGeneratedBy :baking; prov:qualifiedGeneration [ a prov:Generation; prov:activity :baking; :foo :bar ].@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Generation",
   :rdfs/seeAlso
   ["http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"
    "http://www.w3.org/ns/prov#wasGeneratedBy"
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Generation"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Generation"],
   :rdfs/subClassOf [:prov/ActivityInfluence
                     :prov/InstantaneousEvent
                     :prov/Influence
                     {:owl/maxCardinality 0,
                      :owl/onProperty     :prov/hadActivity,
                      :rdf/type           :owl/Restriction}]})

(def Influence
  "Influence is the capacity of an entity, activity, or agent to have an effect on the character, development, or behavior of another by means of usage, start, end, generation, invalidation, communication, derivation, attribution, association, or delegation."
  {:db/ident :prov/Influence,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/definition
   #voc/lstr
    "Influence is the capacity of an entity, activity, or agent to have an effect on the character, development, or behavior of another by means of usage, start, end, generation, invalidation, communication, derivation, attribution, association, or delegation.@en",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-influence",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-influence",
   :prov/unqualifiedForm :prov/wasInfluencedBy,
   :rdf/type :owl/Class,
   :rdfs/comment
   [#voc/lstr
     "An instance of prov:Influence provides additional descriptions about the binary prov:wasInfluencedBy relation from some influenced Activity, Entity, or Agent to the influencing Activity, Entity, or Agent. For example, :stomach_ache prov:wasInfluencedBy :spoon; prov:qualifiedInfluence [ a prov:Influence; prov:entity :spoon; :foo :bar ] . Because prov:Influence is a broad relation, the more specific relations (Communication, Delegation, End, etc.) should be used when applicable.@en"
    #voc/lstr
     "Because prov:Influence is a broad relation, its most specific subclasses (e.g. prov:Communication, prov:Delegation, prov:End, prov:Revision, etc.) should be used when applicable.@en"],
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Influence",
   :rdfs/seeAlso
   ["http://www.w3.org/ns/prov#wasInfluencedBy"
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-influence"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-influence"]})

(def InstantaneousEvent
  "The PROV data model is implicitly based on a notion of instantaneous events (or just events), that mark transitions in the world. Events include generation, usage, or invalidation of entities, as well as starting or ending of activities. This notion of event is not first-class in the data model, but it is useful for explaining its other concepts and its semantics."
  {:db/ident :prov/InstantaneousEvent,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/constraints
   "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#dfn-event",
   :prov/definition
   #voc/lstr
    "The PROV data model is implicitly based on a notion of instantaneous events (or just events), that mark transitions in the world. Events include generation, usage, or invalidation of entities, as well as starting or ending of activities. This notion of event is not first-class in the data model, but it is useful for explaining its other concepts and its semantics.@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "An instantaneous event, or event for short, happens in the world and marks a change in the world, in its activities and in its entities. The term 'event' is commonly used in process algebra with a similar meaning. Events represent communications or interactions; they are assumed to be atomic and instantaneous.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "InstantaneousEvent",
   :rdfs/seeAlso
   ["http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#dfn-event"]})

(def Invalidation
  "Invalidation is the start of the destruction, cessation, or expiry of an existing entity by an activity. The entity is no longer available for use (or further invalidation) after invalidation. Any generation or usage of an entity precedes its invalidation."
  {:db/ident :prov/Invalidation,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/constraints
   "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig",
   :prov/definition
   "Invalidation is the start of the destruction, cessation, or expiry of an existing entity by an activity. The entity is no longer available for use (or further invalidation) after invalidation. Any generation or usage of an entity precedes its invalidation.",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Invalidation",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Invalidation",
   :prov/unqualifiedForm :prov/wasInvalidatedBy,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "An instance of prov:Invalidation provides additional descriptions about the binary prov:wasInvalidatedBy relation from an invalidated prov:Entity to the prov:Activity that invalidated it. For example, :uncracked_egg prov:wasInvalidatedBy :baking; prov:qualifiedInvalidation [ a prov:Invalidation; prov:activity :baking; :foo :bar ].@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Invalidation",
   :rdfs/seeAlso
   ["http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"
    "http://www.w3.org/ns/prov#wasInvalidatedBy"
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Invalidation"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Invalidation"],
   :rdfs/subClassOf [:prov/ActivityInfluence
                     :prov/InstantaneousEvent
                     :prov/Influence
                     {:owl/maxCardinality 0,
                      :owl/onProperty     :prov/hadActivity,
                      :rdf/type           :owl/Restriction}]})

(def Location
  "A location can be an identifiable geographic place (ISO 19112), but it can also be a non-geographic place such as a directory, row, or column. As such, there are numerous ways in which location can be expressed, such as by a coordinate, address, landmark, and so forth."
  {:db/ident :prov/Location,
   :prov/category "expanded",
   :prov/definition
   #voc/lstr
    "A location can be an identifiable geographic place (ISO 19112), but it can also be a non-geographic place such as a directory, row, or column. As such, there are numerous ways in which location can be expressed, such as by a coordinate, address, landmark, and so forth.@en",
   :prov/dm
   "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-attribute-location",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-attribute",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Location",
   :rdfs/seeAlso
   ["http://www.w3.org/ns/prov#atLocation"
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-attribute"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-attribute-location"]})

(def Organization
  "An organization is a social or legal institution such as a company, society, etc."
  {:db/ident :prov/Organization,
   :prov/category "expanded",
   :prov/component "agents-responsibility",
   :prov/definition
   "An organization is a social or legal institution such as a company, society, etc.",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-agent",
   :prov/n "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-types",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Organization",
   :rdfs/seeAlso
   ["http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-types"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-agent"],
   :rdfs/subClassOf :prov/Agent})

(def Person
  "Person agents are people."
  {:db/ident :prov/Person,
   :prov/category "expanded",
   :prov/component "agents-responsibility",
   :prov/definition #voc/lstr "Person agents are people.@en",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-agent",
   :prov/n "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-types",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Person",
   :rdfs/seeAlso
   ["http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-types"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-agent"],
   :rdfs/subClassOf :prov/Agent})

(def Plan
  "A plan is an entity that represents a set of actions or steps intended by one or more agents to achieve some goals."
  {:db/ident :prov/Plan,
   :prov/category ["expanded" "qualified"],
   :prov/component "agents-responsibility",
   :prov/definition
   "A plan is an entity that represents a set of actions or steps intended by one or more agents to achieve some goals.",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Association",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Association",
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "There exist no prescriptive requirement on the nature of plans, their representation, the actions or steps they consist of, or their intended goals. Since plans may evolve over time, it may become necessary to track their provenance, so plans themselves are entities. Representing the plan explicitly in the provenance can be useful for various tasks: for example, to validate the execution as represented in the provenance record, to manage expectation failures, or to provide explanations.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Plan",
   :rdfs/seeAlso
   ["http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Association"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Association"],
   :rdfs/subClassOf :prov/Entity})

(def PrimarySource
  "A primary source for a topic refers to something produced by some agent with direct experience and knowledge about the topic, at the time of the topic's study, without benefit from hindsight. Because of the directness of primary sources, they 'speak for themselves' in ways that cannot be captured through the filter of secondary sources. As such, it is important for secondary sources to reference those primary sources from which they were derived, so that their reliability can be investigated. A primary source relation is a particular case of derivation of secondary materials from their primary sources. It is recognized that the determination of primary sources can be up to interpretation, and should be done according to conventions accepted within the application's domain."
  {:db/ident :prov/PrimarySource,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/definition
   #voc/lstr
    "A primary source for a topic refers to something produced by some agent with direct experience and knowledge about the topic, at the time of the topic's study, without benefit from hindsight.\n\nBecause of the directness of primary sources, they 'speak for themselves' in ways that cannot be captured through the filter of secondary sources. As such, it is important for secondary sources to reference those primary sources from which they were derived, so that their reliability can be investigated.\n\nA primary source relation is a particular case of derivation of secondary materials from their primary sources. It is recognized that the determination of primary sources can be up to interpretation, and should be done according to conventions accepted within the application's domain.@en",
   :prov/dm
   "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-primary-source",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-original-source",
   :prov/unqualifiedForm :prov/hadPrimarySource,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "An instance of prov:PrimarySource provides additional descriptions about the binary prov:hadPrimarySource relation from some secondary prov:Entity to an earlier, primary prov:Entity. For example, :blog prov:hadPrimarySource :newsArticle; prov:qualifiedPrimarySource [ a prov:PrimarySource; prov:entity :newsArticle; :foo :bar ] .@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "PrimarySource",
   :rdfs/seeAlso
   ["http://www.w3.org/ns/prov#hadPrimarySource"
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-original-source"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-primary-source"],
   :rdfs/subClassOf [:prov/Derivation :prov/Influence :prov/EntityInfluence]})

(def Quotation
  "A quotation is the repeat of (some or all of) an entity, such as text or image, by someone who may or may not be its original author. Quotation is a particular case of derivation."
  {:db/ident :prov/Quotation,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/definition
   #voc/lstr
    "A quotation is the repeat of (some or all of) an entity, such as text or image, by someone who may or may not be its original author. Quotation is a particular case of derivation.@en",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-quotation",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-quotation",
   :prov/unqualifiedForm :prov/wasQuotedFrom,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "An instance of prov:Quotation provides additional descriptions about the binary prov:wasQuotedFrom relation from some taken prov:Entity from an earlier, larger prov:Entity. For example, :here_is_looking_at_you_kid prov:wasQuotedFrom :casablanca_script; prov:qualifiedQuotation [ a prov:Quotation; prov:entity :casablanca_script; :foo :bar ].@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Quotation",
   :rdfs/seeAlso
   ["http://www.w3.org/ns/prov#wasQuotedFrom"
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-quotation"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-quotation"],
   :rdfs/subClassOf [:prov/Derivation :prov/Influence :prov/EntityInfluence]})

(def Revision
  "A revision is a derivation for which the resulting entity is a revised version of some original. The implication here is that the resulting entity contains substantial content from the original. Revision is a particular case of derivation."
  {:db/ident :prov/Revision,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/definition
   #voc/lstr
    "A revision is a derivation for which the resulting entity is a revised version of some original. The implication here is that the resulting entity contains substantial content from the original. Revision is a particular case of derivation.@en",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-revision",
   :prov/n "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Revision",
   :prov/unqualifiedForm :prov/wasRevisionOf,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "An instance of prov:Revision provides additional descriptions about the binary prov:wasRevisionOf relation from some newer prov:Entity to an earlier prov:Entity. For example, :draft_2 prov:wasRevisionOf :draft_1; prov:qualifiedRevision [ a prov:Revision; prov:entity :draft_1; :foo :bar ].@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Revision",
   :rdfs/seeAlso
   ["http://www.w3.org/ns/prov#wasRevisionOf"
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Revision"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-revision"],
   :rdfs/subClassOf [:prov/Derivation :prov/Influence :prov/EntityInfluence]})

(def Role
  "A role is the function of an entity or agent with respect to an activity, in the context of a usage, generation, invalidation, association, start, and end."
  {:db/ident :prov/Role,
   :prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/definition
   #voc/lstr
    "A role is the function of an entity or agent with respect to an activity, in the context of a usage, generation, invalidation, association, start, and end.@en",
   :prov/dm
   "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-attribute-role",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-attribute",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Role",
   :rdfs/seeAlso
   ["http://www.w3.org/ns/prov#hadRole"
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-attribute"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-attribute-role"]})

(def SoftwareAgent
  "A software agent is running software."
  {:db/ident :prov/SoftwareAgent,
   :prov/category "expanded",
   :prov/component "agents-responsibility",
   :prov/definition #voc/lstr "A software agent is running software.@en",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-agent",
   :prov/n "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-types",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "SoftwareAgent",
   :rdfs/seeAlso
   ["http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-types"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-agent"],
   :rdfs/subClassOf :prov/Agent})

(def Start
  "Start is when an activity is deemed to have been started by an entity, known as trigger. The activity did not exist before its start. Any usage, generation, or invalidation involving an activity follows the activity's start. A start may refer to a trigger entity that set off the activity, or to an activity, known as starter, that generated the trigger."
  {:db/ident :prov/Start,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/constraints
   "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig",
   :prov/definition
   #voc/lstr
    "Start is when an activity is deemed to have been started by an entity, known as trigger. The activity did not exist before its start. Any usage, generation, or invalidation involving an activity follows the activity's start. A start may refer to a trigger entity that set off the activity, or to an activity, known as starter, that generated the trigger.@en",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Start",
   :prov/n "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Start",
   :prov/unqualifiedForm :prov/wasStartedBy,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "An instance of prov:Start provides additional descriptions about the binary prov:wasStartedBy relation from some started prov:Activity to an prov:Entity that started it. For example, :foot_race prov:wasStartedBy :bang; prov:qualifiedStart [ a prov:Start; prov:entity :bang; :foo :bar; prov:atTime '2012-03-09T08:05:08-05:00'^^xsd:dateTime ] .@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Start",
   :rdfs/seeAlso
   ["http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"
    "http://www.w3.org/ns/prov#wasStartedBy"
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Start"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Start"],
   :rdfs/subClassOf
   [:prov/EntityInfluence :prov/InstantaneousEvent :prov/Influence]})

(def Usage
  "Usage is the beginning of utilizing an entity by an activity. Before usage, the activity had not begun to utilize this entity and could not have been affected by the entity."
  {:db/ident :prov/Usage,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/constraints
   "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig",
   :prov/definition
   #voc/lstr
    "Usage is the beginning of utilizing an entity by an activity. Before usage, the activity had not begun to utilize this entity and could not have been affected by the entity.@en",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Usage",
   :prov/n "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Usage",
   :prov/unqualifiedForm :prov/used,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "An instance of prov:Usage provides additional descriptions about the binary prov:used relation from some prov:Activity to an prov:Entity that it used. For example, :keynote prov:used :podium; prov:qualifiedUsage [ a prov:Usage; prov:entity :podium; :foo :bar ].@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "Usage",
   :rdfs/seeAlso
   ["http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"
    "http://www.w3.org/ns/prov#used"
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-Usage"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-Usage"],
   :rdfs/subClassOf
   [:prov/InstantaneousEvent :prov/EntityInfluence :prov/Influence]})

(def actedOnBehalfOf
  "An object property to express the accountability of an agent towards another agent. The subordinate agent acted on behalf of the responsible agent in an actual activity."
  {:db/ident :prov/actedOnBehalfOf,
   :owl/propertyChainAxiom [:prov/qualifiedDelegation :prov/agent],
   :prov/category "starting-point",
   :prov/component "agents-responsibility",
   :prov/inverse "hadDelegate",
   :prov/qualifiedForm [:prov/qualifiedDelegation :prov/Delegation],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "An object property to express the accountability of an agent towards another agent. The subordinate agent acted on behalf of the responsible agent in an actual activity. @en",
   :rdfs/domain :prov/Agent,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "actedOnBehalfOf",
   :rdfs/range :prov/Agent,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#qualifiedDelegation"
                  "http://www.w3.org/ns/prov#Delegation"],
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def activity
  "The prov:activity property references an prov:Activity which influenced a resource. This property applies to an prov:ActivityInfluence, which is given by a subproperty of prov:qualifiedInfluence from the influenced prov:Entity, prov:Activity or prov:Agent."
  {:db/ident :prov/activity,
   :prov/category "qualified",
   :prov/definition
   "The prov:activity property references an prov:Activity which influenced a resource. This property applies to an prov:ActivityInfluence, which is given by a subproperty of prov:qualifiedInfluence from the influenced prov:Entity, prov:Activity or prov:Agent.",
   :prov/editorialNote
   #voc/lstr
    "This property behaves in spirit like rdf:object; it references the object of a prov:wasInfluencedBy triple.@en",
   :prov/editorsDefinition
   "The prov:activity property references an prov:Activity which influenced a resource. This property applies to an prov:ActivityInfluence, which is given by a subproperty of prov:qualifiedInfluence from the influenced prov:Entity, prov:Activity or prov:Agent.",
   :prov/inverse "activityOfInfluence",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/ActivityInfluence,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "activity",
   :rdfs/range :prov/Activity,
   :rdfs/subPropertyOf :prov/influencer})

(def agent
  "The prov:agent property references an prov:Agent which influenced a resource. This property applies to an prov:AgentInfluence, which is given by a subproperty of prov:qualifiedInfluence from the influenced prov:Entity, prov:Activity or prov:Agent."
  {:db/ident :prov/agent,
   :prov/category "qualified",
   :prov/definition
   #voc/lstr
    "The prov:agent property references an prov:Agent which influenced a resource. This property applies to an prov:AgentInfluence, which is given by a subproperty of prov:qualifiedInfluence from the influenced prov:Entity, prov:Activity or prov:Agent.@en",
   :prov/editorialNote
   #voc/lstr
    "This property behaves in spirit like rdf:object; it references the object of a prov:wasInfluencedBy triple.@en",
   :prov/editorsDefinition
   #voc/lstr
    "The prov:agent property references an prov:Agent which influenced a resource. This property applies to an prov:AgentInfluence, which is given by a subproperty of prov:qualifiedInfluence from the influenced prov:Entity, prov:Activity or prov:Agent.@en",
   :prov/inverse "agentOfInfluence",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/AgentInfluence,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "agent",
   :rdfs/range :prov/Agent,
   :rdfs/subPropertyOf :prov/influencer})

(def alternateOf
  "Two alternate entities present aspects of the same thing. These aspects may be the same or different, and the alternate entities may or may not overlap in time."
  {:db/ident :prov/alternateOf,
   :prov/category "expanded",
   :prov/component "alternate",
   :prov/constraints
   "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig",
   :prov/definition
   #voc/lstr
    "Two alternate entities present aspects of the same thing. These aspects may be the same or different, and the alternate entities may or may not overlap in time.@en",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-alternate",
   :prov/inverse "alternateOf",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-alternate",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "alternateOf",
   :rdfs/range :prov/Entity,
   :rdfs/seeAlso
   ["http://www.w3.org/ns/prov#specializationOf"
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-alternate"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-alternate"]})

(def aq
  {:db/ident         :prov/aq,
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def atLocation
  "The Location of any resource."
  {:db/ident :prov/atLocation,
   :prov/category "expanded",
   :prov/editorialNote
   [#voc/lstr
     "This property is not functional because the many values could be at a variety of granularies (In this building, in this room, in that chair).@en"
    #voc/lstr
     "The naming of prov:atLocation parallels prov:atTime, and is not named prov:hadLocation to avoid conflicting with the convention that prov:had* properties are used on prov:Influence classes.@en"],
   :prov/inverse "locationOf",
   :prov/sharesDefinitionWith :prov/Location,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#voc/lstr "The Location of any resource.@en"
    "This property has multiple RDFS domains to suit multiple OWL Profiles. See <a href=\"#owl-profile\">PROV-O OWL Profile</a>."],
   :rdfs/domain {:owl/unionOf [:prov/Activity
                               :prov/Agent
                               :prov/Entity
                               :prov/InstantaneousEvent],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "atLocation",
   :rdfs/range :prov/Location,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Location"]})

(def atTime
  "The time at which an InstantaneousEvent occurred, in the form of xsd:dateTime."
  {:db/ident :prov/atTime,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/sharesDefinitionWith :prov/InstantaneousEvent,
   :prov/unqualifiedForm [:prov/invalidatedAtTime
                          :prov/startedAtTime
                          :prov/generatedAtTime
                          :prov/endedAtTime],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "The time at which an InstantaneousEvent occurred, in the form of xsd:dateTime.@en",
   :rdfs/domain :prov/InstantaneousEvent,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "atTime",
   :rdfs/range :xsd/dateTime,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#InstantaneousEvent"
                  "http://www.w3.org/ns/prov#invalidatedAtTime"
                  "http://www.w3.org/ns/prov#startedAtTime"
                  "http://www.w3.org/ns/prov#generatedAtTime"
                  "http://www.w3.org/ns/prov#endedAtTime"]})

(def category
  "Classify prov-o terms into three categories, including 'starting-point', 'qualifed', and 'extended'. This classification is used by the prov-o html document to gently introduce prov-o terms to its users."
  {:db/ident :prov/category,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #voc/lstr
    "Classify prov-o terms into three categories, including 'starting-point', 'qualifed', and 'extended'. This classification is used by the prov-o html document to gently introduce prov-o terms to its users. @en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#"})

(def component
  "Classify prov-o terms into six components according to prov-dm, including 'agents-responsibility', 'alternate', 'annotations', 'collections', 'derivations', and 'entities-activities'. This classification is used so that readers of prov-o specification can find its correspondence with the prov-dm specification."
  {:db/ident :prov/component,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #voc/lstr
    "Classify prov-o terms into six components according to prov-dm, including 'agents-responsibility', 'alternate', 'annotations', 'collections', 'derivations', and 'entities-activities'. This classification is used so that readers of prov-o specification can find its correspondence with the prov-dm specification.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#"})

(def constraints
  "A reference to the principal section of the PROV-CONSTRAINTS document that describes this concept."
  {:db/ident :prov/constraints,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #voc/lstr
    "A reference to the principal section of the PROV-CONSTRAINTS document that describes this concept.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def definition
  "A definition quoted from PROV-DM or PROV-CONSTRAINTS that describes the concept expressed with this OWL term."
  {:db/ident :prov/definition,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #voc/lstr
    "A definition quoted from PROV-DM or PROV-CONSTRAINTS that describes the concept expressed with this OWL term.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#"})

(def dm
  "A reference to the principal section of the PROV-DM document that describes this concept."
  {:db/ident :prov/dm,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #voc/lstr
    "A reference to the principal section of the PROV-DM document that describes this concept.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def editorialNote
  "A note by the OWL development team about how this term expresses the PROV-DM concept, or how it should be used in context of semantic web or linked data."
  {:db/ident :prov/editorialNote,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #voc/lstr
    "A note by the OWL development team about how this term expresses the PROV-DM concept, or how it should be used in context of semantic web or linked data.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#"})

(def editorsDefinition
  "When the prov-o term does not have a definition drawn from prov-dm, and the prov-o editor provides one."
  {:db/ident :prov/editorsDefinition,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #voc/lstr
    "When the prov-o term does not have a definition drawn from prov-dm, and the prov-o editor provides one.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/subPropertyOf :prov/definition})

(def endedAtTime
  "The time at which an activity ended. See also prov:startedAtTime."
  {:db/ident :prov/endedAtTime,
   :prov/category "starting-point",
   :prov/component "entities-activities",
   :prov/editorialNote
   #voc/lstr
    "It is the intent that the property chain holds: (prov:qualifiedEnd o prov:atTime) rdfs:subPropertyOf prov:endedAtTime.@en",
   :prov/qualifiedForm [:prov/End :prov/atTime],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "The time at which an activity ended. See also prov:startedAtTime.@en",
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "endedAtTime",
   :rdfs/range :xsd/dateTime,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#End"
                  "http://www.w3.org/ns/prov#atTime"]})

(def entity
  "The prov:entity property references an prov:Entity which influenced a resource. This property applies to an prov:EntityInfluence, which is given by a subproperty of prov:qualifiedInfluence from the influenced prov:Entity, prov:Activity or prov:Agent."
  {:db/ident :prov/entity,
   :prov/category "qualified",
   :prov/definition
   "The prov:entity property references an prov:Entity which influenced a resource. This property applies to an prov:EntityInfluence, which is given by a subproperty of prov:qualifiedInfluence from the influenced prov:Entity, prov:Activity or prov:Agent.",
   :prov/editorialNote
   #voc/lstr
    "This property behaves in spirit like rdf:object; it references the object of a prov:wasInfluencedBy triple.@en",
   :prov/editorsDefinition
   "The prov:entity property references an prov:Entity which influenced a resource. This property applies to an prov:EntityInfluence, which is given by a subproperty of prov:qualifiedInfluence from the influenced prov:Entity, prov:Activity or prov:Agent.",
   :prov/inverse "entityOfInfluence",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/EntityInfluence,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "entity",
   :rdfs/range :prov/Entity,
   :rdfs/subPropertyOf :prov/influencer})

(def generated
  "generated"
  {:db/ident :prov/generated,
   :owl/inverseOf :prov/wasGeneratedBy,
   :prov/category "expanded",
   :prov/component "entities-activities",
   :prov/editorialNote
   #voc/lstr
    "prov:generated is one of few inverse property defined, to allow Activity-oriented assertions in addition to Entity-oriented assertions.@en",
   :prov/inverse "wasGeneratedBy",
   :prov/sharesDefinitionWith :prov/Generation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "generated",
   :rdfs/range :prov/Entity,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Generation"],
   :rdfs/subPropertyOf :prov/influenced})

(def generatedAtTime
  "The time at which an entity was completely created and is available for use."
  {:db/ident :prov/generatedAtTime,
   :prov/category "expanded",
   :prov/component "entities-activities",
   :prov/editorialNote
   #voc/lstr
    "It is the intent that the property chain holds: (prov:qualifiedGeneration o prov:atTime) rdfs:subPropertyOf prov:generatedAtTime.@en",
   :prov/qualifiedForm [:prov/atTime :prov/Generation],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "The time at which an entity was completely created and is available for use.@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "generatedAtTime",
   :rdfs/range :xsd/dateTime,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#atTime"
                  "http://www.w3.org/ns/prov#Generation"]})

(def hadActivity
  "The _optional_ Activity of an Influence, which used, generated, invalidated, or was the responsibility of some Entity. This property is _not_ used by ActivityInfluence (use prov:activity instead)."
  {:db/ident :prov/hadActivity,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/editorialNote
   #voc/lstr
    "The multiple rdfs:domain assertions are intended. One is simpler and works for OWL-RL, the union is more specific but is not recognized by OWL-RL.@en",
   :prov/inverse "wasActivityOfInfluence",
   :prov/sharesDefinitionWith :prov/Activity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#voc/lstr
     "The _optional_ Activity of an Influence, which used, generated, invalidated, or was the responsibility of some Entity. This property is _not_ used by ActivityInfluence (use prov:activity instead).@en"
    "This property has multiple RDFS domains to suit multiple OWL Profiles. See <a href=\"#owl-profile\">PROV-O OWL Profile</a>."],
   :rdfs/domain
   [:prov/Influence
    {:owl/unionOf [:prov/Delegation :prov/Derivation :prov/End :prov/Start],
     :rdf/type    :owl/Class}],
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "hadActivity",
   :rdfs/range :prov/Activity,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Activity"]})

(def hadGeneration
  "The _optional_ Generation involved in an Entity's Derivation."
  {:db/ident :prov/hadGeneration,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/inverse "generatedAsDerivation",
   :prov/sharesDefinitionWith :prov/Generation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr "The _optional_ Generation involved in an Entity's Derivation.@en",
   :rdfs/domain :prov/Derivation,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "hadGeneration",
   :rdfs/range :prov/Generation,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Generation"]})

(def hadMember
  "hadMember"
  {:db/ident           :prov/hadMember,
   :prov/category      "expanded",
   :prov/component     "expanded",
   :prov/inverse       "wasMemberOf",
   :prov/sharesDefinitionWith :prov/Collection,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :prov/Collection,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/prov-o#",
   :rdfs/label         "hadMember",
   :rdfs/range         :prov/Entity,
   :rdfs/seeAlso       ["http://www.w3.org/ns/prov#Collection"],
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def hadPlan
  "The _optional_ Plan adopted by an Agent in Association with some Activity. Plan specifications are out of the scope of this specification."
  {:db/ident :prov/hadPlan,
   :prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/inverse "wasPlanOf",
   :prov/sharesDefinitionWith :prov/Plan,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "The _optional_ Plan adopted by an Agent in Association with some Activity. Plan specifications are out of the scope of this specification.@en",
   :rdfs/domain :prov/Association,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "hadPlan",
   :rdfs/range :prov/Plan,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Plan"]})

(def hadPrimarySource
  "hadPrimarySource"
  {:db/ident               :prov/hadPrimarySource,
   :owl/propertyChainAxiom [:prov/qualifiedPrimarySource :prov/entity],
   :prov/category          "expanded",
   :prov/component         "derivations",
   :prov/inverse           "wasPrimarySourceOf",
   :prov/qualifiedForm     [:prov/PrimarySource :prov/qualifiedPrimarySource],
   :rdf/type               :owl/ObjectProperty,
   :rdfs/domain            :prov/Entity,
   :rdfs/isDefinedBy       "http://www.w3.org/ns/prov-o#",
   :rdfs/label             "hadPrimarySource",
   :rdfs/range             :prov/Entity,
   :rdfs/seeAlso           ["http://www.w3.org/ns/prov#PrimarySource"
                            "http://www.w3.org/ns/prov#qualifiedPrimarySource"],
   :rdfs/subPropertyOf     [:prov/wasDerivedFrom :prov/wasInfluencedBy]})

(def hadRole
  "prov:hadRole references the Role (i.e. the function of an entity with respect to an activity), in the context of an instantaneous usage, generation, association, start, and end."
  {:db/ident :prov/hadRole,
   :prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/definition
   #voc/lstr
    "prov:hadRole references the Role (i.e. the function of an entity with respect to an activity), in the context of an instantaneous usage, generation, association, start, and end.@en",
   :prov/editorsDefinition
   #voc/lstr
    "prov:hadRole references the Role (i.e. the function of an entity with respect to an activity), in the context of an instantaneous usage, generation, association, start, and end.@en",
   :prov/inverse "wasRoleIn",
   :prov/sharesDefinitionWith :prov/Role,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [#voc/lstr
     "The _optional_ Role that an Entity assumed in the context of an Activity. For example, :baking prov:used :spoon; prov:qualified [ a prov:Usage; prov:entity :spoon; prov:hadRole roles:mixing_implement ].@en"
    "This property has multiple RDFS domains to suit multiple OWL Profiles. See <a href=\"#owl-profile\">PROV-O OWL Profile</a>."],
   :rdfs/domain [:prov/Influence
                 {:owl/unionOf [:prov/Association :prov/InstantaneousEvent],
                  :rdf/type    :owl/Class}],
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "hadRole",
   :rdfs/range :prov/Role,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Role"]})

(def hadUsage
  "The _optional_ Usage involved in an Entity's Derivation."
  {:db/ident :prov/hadUsage,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/inverse "wasUsedInDerivation",
   :prov/sharesDefinitionWith :prov/Usage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment #voc/lstr
                  "The _optional_ Usage involved in an Entity's Derivation.@en",
   :rdfs/domain :prov/Derivation,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "hadUsage",
   :rdfs/range :prov/Usage,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Usage"]})

(def influenced
  "influenced"
  {:db/ident         :prov/influenced,
   :owl/inverseOf    :prov/wasInfluencedBy,
   :prov/category    "expanded",
   :prov/component   "agents-responsibility",
   :prov/inverse     "wasInfluencedBy",
   :prov/sharesDefinitionWith :prov/Influence,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label       "influenced",
   :rdfs/seeAlso     ["http://www.w3.org/ns/prov#Influence"]})

(def influencer
  "This property is used as part of the qualified influence pattern. Subclasses of prov:Influence use these subproperties to reference the resource (Entity, Agent, or Activity) whose influence is being qualified."
  {:db/ident :prov/influencer,
   :prov/category "qualified",
   :prov/definition
   #voc/lstr
    "This property is used as part of the qualified influence pattern. Subclasses of prov:Influence use these subproperties to reference the resource (Entity, Agent, or Activity) whose influence is being qualified.@en",
   :prov/dm "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-influence",
   :prov/editorialNote
   #voc/lstr
    "This property and its subproperties are used in the same way as the rdf:object property, i.e. to reference the object of an unqualified prov:wasInfluencedBy or prov:influenced triple.@en",
   :prov/editorsDefinition
   #voc/lstr
    "This property is used as part of the qualified influence pattern. Subclasses of prov:Influence use these subproperties to reference the resource (Entity, Agent, or Activity) whose influence is being qualified.@en",
   :prov/inverse "hadInfluence",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Subproperties of prov:influencer are used to cite the object of an unqualified PROV-O triple whose predicate is a subproperty of prov:wasInfluencedBy (e.g. prov:used, prov:wasGeneratedBy). prov:influencer is used much like rdf:object is used.@en",
   :rdfs/domain :prov/Influence,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "influencer",
   :rdfs/range :owl/Thing,
   :rdfs/seeAlso
   ["http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-influence"]})

(def invalidated
  "invalidated"
  {:db/ident :prov/invalidated,
   :owl/inverseOf :prov/wasInvalidatedBy,
   :prov/category "expanded",
   :prov/component "entities-activities",
   :prov/editorialNote
   #voc/lstr
    "prov:invalidated is one of few inverse property defined, to allow Activity-oriented assertions in addition to Entity-oriented assertions.@en",
   :prov/inverse "wasInvalidatedBy",
   :prov/sharesDefinitionWith :prov/Invalidation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "invalidated",
   :rdfs/range :prov/Entity,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Invalidation"],
   :rdfs/subPropertyOf :prov/influenced})

(def invalidatedAtTime
  "The time at which an entity was invalidated (i.e., no longer usable)."
  {:db/ident :prov/invalidatedAtTime,
   :prov/category "expanded",
   :prov/component "entities-activities",
   :prov/editorialNote
   #voc/lstr
    "It is the intent that the property chain holds: (prov:qualifiedInvalidation o prov:atTime) rdfs:subPropertyOf prov:invalidatedAtTime.@en",
   :prov/qualifiedForm [:prov/atTime :prov/Invalidation],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "The time at which an entity was invalidated (i.e., no longer usable).@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "invalidatedAtTime",
   :rdfs/range :xsd/dateTime,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#atTime"
                  "http://www.w3.org/ns/prov#Invalidation"]})

(def inverse
  "PROV-O does not define all property inverses. The directionalities defined in PROV-O should be given preference over those not defined. However, if users wish to name the inverse of a PROV-O property, the local name given by prov:inverse should be used."
  {:db/ident :prov/inverse,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #voc/lstr
    "PROV-O does not define all property inverses. The directionalities defined in PROV-O should be given preference over those not defined. However, if users wish to name the inverse of a PROV-O property, the local name given by prov:inverse should be used.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/seeAlso ["http://www.w3.org/TR/prov-o/#names-of-inverse-properties"]})

(def n
  "A reference to the principal section of the PROV-DM document that describes this concept."
  {:db/ident :prov/n,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #voc/lstr
    "A reference to the principal section of the PROV-DM document that describes this concept.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def order
  "The position that this OWL term should be listed within documentation. The scope of the documentation (e.g., among all terms, among terms within a prov:category, among properties applying to a particular class, etc.) is unspecified."
  {:db/ident :prov/order,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #voc/lstr
    "The position that this OWL term should be listed within documentation. The scope of the documentation (e.g., among all terms, among terms within a prov:category, among properties applying to a particular class, etc.) is unspecified.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#"})

(def qualifiedAssociation
  "If this Activity prov:wasAssociatedWith Agent :ag, then it can qualify the Association using prov:qualifiedAssociation [ a prov:Association; prov:agent :ag; :foo :bar ]."
  {:db/ident :prov/qualifiedAssociation,
   :prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/inverse "qualifiedAssociationOf",
   :prov/sharesDefinitionWith :prov/Association,
   :prov/unqualifiedForm :prov/wasAssociatedWith,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "If this Activity prov:wasAssociatedWith Agent :ag, then it can qualify the Association using prov:qualifiedAssociation [ a prov:Association;  prov:agent :ag; :foo :bar ].@en",
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedAssociation",
   :rdfs/range :prov/Association,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Association"
                  "http://www.w3.org/ns/prov#wasAssociatedWith"],
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedAttribution
  "If this Entity prov:wasAttributedTo Agent :ag, then it can qualify how it was influenced using prov:qualifiedAttribution [ a prov:Attribution; prov:agent :ag; :foo :bar ]."
  {:db/ident :prov/qualifiedAttribution,
   :prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/inverse "qualifiedAttributionOf",
   :prov/sharesDefinitionWith :prov/Attribution,
   :prov/unqualifiedForm :prov/wasAttributedTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "If this Entity prov:wasAttributedTo Agent :ag, then it can qualify how it was influenced using prov:qualifiedAttribution [ a prov:Attribution;  prov:agent :ag; :foo :bar ].@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedAttribution",
   :rdfs/range :prov/Attribution,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Attribution"
                  "http://www.w3.org/ns/prov#wasAttributedTo"],
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedCommunication
  "If this Activity prov:wasInformedBy Activity :a, then it can qualify how it was influenced using prov:qualifiedCommunication [ a prov:Communication; prov:activity :a; :foo :bar ]."
  {:db/ident :prov/qualifiedCommunication,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/inverse "qualifiedCommunicationOf",
   :prov/qualifiedForm :prov/Communication,
   :prov/sharesDefinitionWith :prov/Communication,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "If this Activity prov:wasInformedBy Activity :a, then it can qualify how it was influenced using prov:qualifiedCommunication [ a prov:Communication;  prov:activity :a; :foo :bar ].@en",
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedCommunication",
   :rdfs/range :prov/Communication,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Communication"],
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedDelegation
  "If this Agent prov:actedOnBehalfOf Agent :ag, then it can qualify how with prov:qualifiedResponsibility [ a prov:Responsibility; prov:agent :ag; :foo :bar ]."
  {:db/ident :prov/qualifiedDelegation,
   :prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/inverse "qualifiedDelegationOf",
   :prov/sharesDefinitionWith :prov/Delegation,
   :prov/unqualifiedForm :prov/actedOnBehalfOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "If this Agent prov:actedOnBehalfOf Agent :ag, then it can qualify how with prov:qualifiedResponsibility [ a prov:Responsibility;  prov:agent :ag; :foo :bar ].@en",
   :rdfs/domain :prov/Agent,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedDelegation",
   :rdfs/range :prov/Delegation,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Delegation"
                  "http://www.w3.org/ns/prov#actedOnBehalfOf"],
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedDerivation
  "If this Entity prov:wasDerivedFrom Entity :e, then it can qualify how it was derived using prov:qualifiedDerivation [ a prov:Derivation; prov:entity :e; :foo :bar ]."
  {:db/ident :prov/qualifiedDerivation,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/inverse "qualifiedDerivationOf",
   :prov/sharesDefinitionWith :prov/Derivation,
   :prov/unqualifiedForm :prov/wasDerivedFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "If this Entity prov:wasDerivedFrom Entity :e, then it can qualify how it was derived using prov:qualifiedDerivation [ a prov:Derivation;  prov:entity :e; :foo :bar ].@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedDerivation",
   :rdfs/range :prov/Derivation,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Derivation"
                  "http://www.w3.org/ns/prov#wasDerivedFrom"],
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedEnd
  "If this Activity prov:wasEndedBy Entity :e1, then it can qualify how it was ended using prov:qualifiedEnd [ a prov:End; prov:entity :e1; :foo :bar ]."
  {:db/ident :prov/qualifiedEnd,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/inverse "qualifiedEndOf",
   :prov/sharesDefinitionWith :prov/End,
   :prov/unqualifiedForm :prov/wasEndedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "If this Activity prov:wasEndedBy Entity :e1, then it can qualify how it was ended using prov:qualifiedEnd [ a prov:End;  prov:entity :e1; :foo :bar ].@en",
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedEnd",
   :rdfs/range :prov/End,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#End"
                  "http://www.w3.org/ns/prov#wasEndedBy"],
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedForm
  "This annotation property links a subproperty of prov:wasInfluencedBy with the subclass of prov:Influence and the qualifying property that are used to qualify it. Example annotation: prov:wasGeneratedBy prov:qualifiedForm prov:qualifiedGeneration, prov:Generation . Then this unqualified assertion: :entity1 prov:wasGeneratedBy :activity1 . can be qualified by adding: :entity1 prov:qualifiedGeneration :entity1Gen . :entity1Gen a prov:Generation, prov:Influence; prov:activity :activity1; :customValue 1337 . Note how the value of the unqualified influence (prov:wasGeneratedBy :activity1) is mirrored as the value of the prov:activity (or prov:entity, or prov:agent) property on the influence class."
  {:db/ident :prov/qualifiedForm,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #voc/lstr
    "This annotation property links a subproperty of prov:wasInfluencedBy with the subclass of prov:Influence and the qualifying property that are used to qualify it. \n\nExample annotation:\n\n    prov:wasGeneratedBy prov:qualifiedForm prov:qualifiedGeneration, prov:Generation .\n\nThen this unqualified assertion:\n\n    :entity1 prov:wasGeneratedBy :activity1 .\n\ncan be qualified by adding:\n\n   :entity1 prov:qualifiedGeneration :entity1Gen .\n   :entity1Gen \n       a prov:Generation, prov:Influence;\n       prov:activity :activity1;\n       :customValue 1337 .\n\nNote how the value of the unqualified influence (prov:wasGeneratedBy :activity1) is mirrored as the value of the prov:activity (or prov:entity, or prov:agent) property on the influence class.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def qualifiedGeneration
  "If this Activity prov:generated Entity :e, then it can qualify how it performed the Generation using prov:qualifiedGeneration [ a prov:Generation; prov:entity :e; :foo :bar ]."
  {:db/ident :prov/qualifiedGeneration,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/inverse "qualifiedGenerationOf",
   :prov/sharesDefinitionWith :prov/Generation,
   :prov/unqualifiedForm :prov/wasGeneratedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "If this Activity prov:generated Entity :e, then it can qualify how it performed the Generation using prov:qualifiedGeneration [ a prov:Generation;  prov:entity :e; :foo :bar ].@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedGeneration",
   :rdfs/range :prov/Generation,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Generation"
                  "http://www.w3.org/ns/prov#wasGeneratedBy"],
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedInfluence
  "Because prov:qualifiedInfluence is a broad relation, the more specific relations (qualifiedCommunication, qualifiedDelegation, qualifiedEnd, etc.) should be used when applicable."
  {:db/ident :prov/qualifiedInfluence,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/inverse "qualifiedInfluenceOf",
   :prov/sharesDefinitionWith :prov/Influence,
   :prov/unqualifiedForm :prov/wasInfluencedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Because prov:qualifiedInfluence is a broad relation, the more specific relations (qualifiedCommunication, qualifiedDelegation, qualifiedEnd, etc.) should be used when applicable.@en",
   :rdfs/domain {:owl/unionOf [:prov/Activity :prov/Agent :prov/Entity],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedInfluence",
   :rdfs/range :prov/Influence,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Influence"
                  "http://www.w3.org/ns/prov#wasInfluencedBy"]})

(def qualifiedInvalidation
  "If this Entity prov:wasInvalidatedBy Activity :a, then it can qualify how it was invalidated using prov:qualifiedInvalidation [ a prov:Invalidation; prov:activity :a; :foo :bar ]."
  {:db/ident :prov/qualifiedInvalidation,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/inverse "qualifiedInvalidationOf",
   :prov/sharesDefinitionWith :prov/Invalidation,
   :prov/unqualifiedForm :prov/wasInvalidatedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "If this Entity prov:wasInvalidatedBy Activity :a, then it can qualify how it was invalidated using prov:qualifiedInvalidation [ a prov:Invalidation;  prov:activity :a; :foo :bar ].@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedInvalidation",
   :rdfs/range :prov/Invalidation,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Invalidation"
                  "http://www.w3.org/ns/prov#wasInvalidatedBy"],
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedPrimarySource
  "If this Entity prov:hadPrimarySource Entity :e, then it can qualify how using prov:qualifiedPrimarySource [ a prov:PrimarySource; prov:entity :e; :foo :bar ]."
  {:db/ident :prov/qualifiedPrimarySource,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/inverse "qualifiedSourceOf",
   :prov/sharesDefinitionWith :prov/PrimarySource,
   :prov/unqualifiedForm :prov/hadPrimarySource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "If this Entity prov:hadPrimarySource Entity :e, then it can qualify how using prov:qualifiedPrimarySource [ a prov:PrimarySource; prov:entity :e; :foo :bar ].@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedPrimarySource",
   :rdfs/range :prov/PrimarySource,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#PrimarySource"
                  "http://www.w3.org/ns/prov#hadPrimarySource"],
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedQuotation
  "If this Entity prov:wasQuotedFrom Entity :e, then it can qualify how using prov:qualifiedQuotation [ a prov:Quotation; prov:entity :e; :foo :bar ]."
  {:db/ident :prov/qualifiedQuotation,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/inverse "qualifiedQuotationOf",
   :prov/sharesDefinitionWith :prov/Quotation,
   :prov/unqualifiedForm :prov/wasQuotedFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "If this Entity prov:wasQuotedFrom Entity :e, then it can qualify how using prov:qualifiedQuotation [ a prov:Quotation;  prov:entity :e; :foo :bar ].@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedQuotation",
   :rdfs/range :prov/Quotation,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Quotation"
                  "http://www.w3.org/ns/prov#wasQuotedFrom"],
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedRevision
  "If this Entity prov:wasRevisionOf Entity :e, then it can qualify how it was revised using prov:qualifiedRevision [ a prov:Revision; prov:entity :e; :foo :bar ]."
  {:db/ident :prov/qualifiedRevision,
   :prov/category "qualified",
   :prov/component "derivations",
   :prov/inverse "revisedEntity",
   :prov/sharesDefinitionWith :prov/Revision,
   :prov/unqualifiedForm :prov/wasRevisionOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "If this Entity prov:wasRevisionOf Entity :e, then it can qualify how it was revised using prov:qualifiedRevision [ a prov:Revision;  prov:entity :e; :foo :bar ].@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedRevision",
   :rdfs/range :prov/Revision,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Revision"
                  "http://www.w3.org/ns/prov#wasRevisionOf"],
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedStart
  "If this Activity prov:wasStartedBy Entity :e1, then it can qualify how it was started using prov:qualifiedStart [ a prov:Start; prov:entity :e1; :foo :bar ]."
  {:db/ident :prov/qualifiedStart,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/inverse "qualifiedStartOf",
   :prov/sharesDefinitionWith :prov/Start,
   :prov/unqualifiedForm :prov/wasStartedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "If this Activity prov:wasStartedBy Entity :e1, then it can qualify how it was started using prov:qualifiedStart [ a prov:Start;  prov:entity :e1; :foo :bar ].@en",
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedStart",
   :rdfs/range :prov/Start,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Start"
                  "http://www.w3.org/ns/prov#wasStartedBy"],
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def qualifiedUsage
  "If this Activity prov:used Entity :e, then it can qualify how it used it using prov:qualifiedUsage [ a prov:Usage; prov:entity :e; :foo :bar ]."
  {:db/ident :prov/qualifiedUsage,
   :prov/category "qualified",
   :prov/component "entities-activities",
   :prov/inverse "qualifiedUsingActivity",
   :prov/sharesDefinitionWith :prov/Usage,
   :prov/unqualifiedForm :prov/used,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "If this Activity prov:used Entity :e, then it can qualify how it used it using prov:qualifiedUsage [ a prov:Usage; prov:entity :e; :foo :bar ].@en",
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "qualifiedUsage",
   :rdfs/range :prov/Usage,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Usage"
                  "http://www.w3.org/ns/prov#used"],
   :rdfs/subPropertyOf :prov/qualifiedInfluence})

(def sharesDefinitionWith
  {:db/ident         :prov/sharesDefinitionWith,
   :rdf/type         :owl/AnnotationProperty,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def specializationOf
  "An entity that is a specialization of another shares all aspects of the latter, and additionally presents more specific aspects of the same thing as the latter. In particular, the lifetime of the entity being specialized contains that of any specialization. Examples of aspects include a time period, an abstraction, and a context associated with the entity."
  {:db/ident :prov/specializationOf,
   :prov/category "expanded",
   :prov/component "alternate",
   :prov/constraints
   "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig",
   :prov/definition
   #voc/lstr
    "An entity that is a specialization of another shares all aspects of the latter, and additionally presents more specific aspects of the same thing as the latter. In particular, the lifetime of the entity being specialized contains that of any specialization. Examples of aspects include a time period, an abstraction, and a context associated with the entity.@en",
   :prov/dm
   "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-specialization",
   :prov/inverse "generalizationOf",
   :prov/n
   "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-specialization",
   :rdf/type [:owl/ObjectProperty :owl/AnnotationProperty],
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "specializationOf",
   :rdfs/range :prov/Entity,
   :rdfs/seeAlso
   ["http://www.w3.org/ns/prov#alternateOf"
    "http://www.w3.org/TR/2013/REC-prov-constraints-20130430/#prov-dm-constraints-fig"
    "http://www.w3.org/TR/2013/REC-prov-n-20130430/#expression-specialization"
    "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-specialization"],
   :rdfs/subPropertyOf :prov/alternateOf})

(def startedAtTime
  "The time at which an activity started. See also prov:endedAtTime."
  {:db/ident :prov/startedAtTime,
   :prov/category "starting-point",
   :prov/component "entities-activities",
   :prov/editorialNote
   #voc/lstr
    "It is the intent that the property chain holds: (prov:qualifiedStart o prov:atTime) rdfs:subPropertyOf prov:startedAtTime.@en",
   :prov/qualifiedForm [:prov/Start :prov/atTime],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "The time at which an activity started. See also prov:endedAtTime.@en",
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "startedAtTime",
   :rdfs/range :xsd/dateTime,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Start"
                  "http://www.w3.org/ns/prov#atTime"]})

(def todo
  {:db/ident :prov/todo,
   :rdf/type :owl/AnnotationProperty})

(def unqualifiedForm
  "Classes and properties used to qualify relationships are annotated with prov:unqualifiedForm to indicate the property used to assert an unqualified provenance relation."
  {:db/ident :prov/unqualifiedForm,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/comment
   #voc/lstr
    "Classes and properties used to qualify relationships are annotated with prov:unqualifiedForm to indicate the property used to assert an unqualified provenance relation.@en",
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def used
  "A prov:Entity that was used by this prov:Activity. For example, :baking prov:used :spoon, :egg, :oven ."
  {:db/ident :prov/used,
   :owl/propertyChainAxiom [:prov/qualifiedUsage :prov/entity],
   :prov/category "starting-point",
   :prov/component "entities-activities",
   :prov/inverse "wasUsedBy",
   :prov/qualifiedForm [:prov/Usage :prov/qualifiedUsage],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "A prov:Entity that was used by this prov:Activity. For example, :baking prov:used :spoon, :egg, :oven .@en",
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "used",
   :rdfs/range :prov/Entity,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Usage"
                  "http://www.w3.org/ns/prov#qualifiedUsage"],
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def value
  "Provides a value that is a direct representation of an entity."
  {:db/ident :prov/value,
   :prov/category "expanded",
   :prov/component "entities-activities",
   :prov/definition
   #voc/lstr
    "Provides a value that is a direct representation of an entity.@en",
   :prov/dm
   "http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-attribute-value",
   :prov/editorialNote
   [#voc/lstr
     "This property serves the same purpose as rdf:value, but has been reintroduced to avoid some of the definitional ambiguity in the RDF specification (specifically, 'may be used in describing structured values').@en"
    "The editor's definition comes from http://www.w3.org/TR/rdf-primer/#rdfvalue"],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "value",
   :rdfs/seeAlso
   ["http://www.w3.org/TR/2013/REC-prov-dm-20130430/#term-attribute-value"]})

(def wasAssociatedWith
  "An prov:Agent that had some (unspecified) responsibility for the occurrence of this prov:Activity."
  {:db/ident :prov/wasAssociatedWith,
   :owl/propertyChainAxiom [:prov/qualifiedAssociation :prov/agent],
   :prov/category "starting-point",
   :prov/component "agents-responsibility",
   :prov/inverse "wasAssociateFor",
   :prov/qualifiedForm [:prov/Association :prov/qualifiedAssociation],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "An prov:Agent that had some (unspecified) responsibility for the occurrence of this prov:Activity.@en",
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "wasAssociatedWith",
   :rdfs/range :prov/Agent,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Association"
                  "http://www.w3.org/ns/prov#qualifiedAssociation"],
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def wasAttributedTo
  "Attribution is the ascribing of an entity to an agent."
  {:db/ident :prov/wasAttributedTo,
   :owl/propertyChainAxiom [:prov/qualifiedAttribution :prov/agent],
   :prov/category "starting-point",
   :prov/component "agents-responsibility",
   :prov/definition
   #voc/lstr "Attribution is the ascribing of an entity to an agent.@en",
   :prov/inverse "contributed",
   :prov/qualifiedForm [:prov/Attribution :prov/qualifiedAttribution],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment #voc/lstr
                  "Attribution is the ascribing of an entity to an agent.@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "wasAttributedTo",
   :rdfs/range :prov/Agent,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Attribution"
                  "http://www.w3.org/ns/prov#qualifiedAttribution"],
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def wasDerivedFrom
  "A derivation is a transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a pre-existing entity."
  {:db/ident :prov/wasDerivedFrom,
   :owl/propertyChainAxiom [:prov/qualifiedDerivation :prov/entity],
   :prov/category "starting-point",
   :prov/component "derivations",
   :prov/definition
   #voc/lstr
    "A derivation is a transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a pre-existing entity.@en",
   :prov/inverse "hadDerivation",
   :prov/qualifiedForm [:prov/Derivation :prov/qualifiedDerivation],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "The more specific subproperties of prov:wasDerivedFrom (i.e., prov:wasQuotedFrom, prov:wasRevisionOf, prov:hadPrimarySource) should be used when applicable.@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "wasDerivedFrom",
   :rdfs/range :prov/Entity,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Derivation"
                  "http://www.w3.org/ns/prov#qualifiedDerivation"],
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def wasEndedBy
  "End is when an activity is deemed to have ended. An end may refer to an entity, known as trigger, that terminated the activity."
  {:db/ident :prov/wasEndedBy,
   :owl/propertyChainAxiom [:prov/qualifiedEnd :prov/entity],
   :prov/category "expanded",
   :prov/component "entities-activities",
   :prov/inverse "ended",
   :prov/qualifiedForm [:prov/qualifiedEnd :prov/End],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "End is when an activity is deemed to have ended. An end may refer to an entity, known as trigger, that terminated the activity.@en",
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "wasEndedBy",
   :rdfs/range :prov/Entity,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#qualifiedEnd"
                  "http://www.w3.org/ns/prov#End"],
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def wasGeneratedBy
  "wasGeneratedBy"
  {:db/ident               :prov/wasGeneratedBy,
   :owl/propertyChainAxiom [:prov/qualifiedGeneration :prov/activity],
   :prov/category          "starting-point",
   :prov/component         "entities-activities",
   :prov/inverse           "generated",
   :prov/qualifiedForm     [:prov/Generation :prov/qualifiedGeneration],
   :rdf/type               :owl/ObjectProperty,
   :rdfs/domain            :prov/Entity,
   :rdfs/isDefinedBy       "http://www.w3.org/ns/prov-o#",
   :rdfs/label             "wasGeneratedBy",
   :rdfs/range             :prov/Activity,
   :rdfs/seeAlso           ["http://www.w3.org/ns/prov#Generation"
                            "http://www.w3.org/ns/prov#qualifiedGeneration"],
   :rdfs/subPropertyOf     :prov/wasInfluencedBy})

(def wasInfluencedBy
  "Because prov:wasInfluencedBy is a broad relation, its more specific subproperties (e.g. prov:wasInformedBy, prov:actedOnBehalfOf, prov:wasEndedBy, etc.) should be used when applicable."
  {:db/ident :prov/wasInfluencedBy,
   :prov/category "qualified",
   :prov/component "agents-responsibility",
   :prov/editorialNote
   #voc/lstr
    "The sub-properties of prov:wasInfluencedBy can be elaborated in more detail using the Qualification Pattern. For example, the binary relation :baking prov:used :spoon can be qualified by asserting :baking prov:qualifiedUsage [ a prov:Usage; prov:entity :spoon; prov:atLocation :kitchen ] .\n\nSubproperties of prov:wasInfluencedBy may also be asserted directly without being qualified.\n\nprov:wasInfluencedBy should not be used without also using one of its subproperties. \n@en",
   :prov/inverse "influenced",
   :prov/qualifiedForm [:prov/Influence :prov/qualifiedInfluence],
   :prov/sharesDefinitionWith :prov/Influence,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["This property has multiple RDFS domains to suit multiple OWL Profiles. See <a href=\"#owl-profile\">PROV-O OWL Profile</a>."
    #voc/lstr
     "Because prov:wasInfluencedBy is a broad relation, its more specific subproperties (e.g. prov:wasInformedBy, prov:actedOnBehalfOf, prov:wasEndedBy, etc.) should be used when applicable.@en"],
   :rdfs/domain {:owl/unionOf [:prov/Activity :prov/Agent :prov/Entity],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "wasInfluencedBy",
   :rdfs/range {:owl/unionOf [:prov/Activity :prov/Agent :prov/Entity],
                :rdf/type    :owl/Class},
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Influence"
                  "http://www.w3.org/ns/prov#qualifiedInfluence"]})

(def wasInformedBy
  "An activity a2 is dependent on or informed by another activity a1, by way of some unspecified entity that is generated by a1 and used by a2."
  {:db/ident :prov/wasInformedBy,
   :owl/propertyChainAxiom [:prov/qualifiedCommunication :prov/activity],
   :prov/category "starting-point",
   :prov/component "entities-activities",
   :prov/inverse "informed",
   :prov/qualifiedForm [:prov/qualifiedCommunication :prov/Communication],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "An activity a2 is dependent on or informed by another activity a1, by way of some unspecified entity that is generated by a1 and used by a2.@en",
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "wasInformedBy",
   :rdfs/range :prov/Activity,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#qualifiedCommunication"
                  "http://www.w3.org/ns/prov#Communication"],
   :rdfs/subPropertyOf :prov/wasInfluencedBy})

(def wasInvalidatedBy
  "wasInvalidatedBy"
  {:db/ident               :prov/wasInvalidatedBy,
   :owl/propertyChainAxiom [:prov/qualifiedInvalidation :prov/activity],
   :prov/category          "expanded",
   :prov/component         "entities-activities",
   :prov/inverse           "invalidated",
   :prov/qualifiedForm     [:prov/qualifiedInvalidation :prov/Invalidation],
   :rdf/type               :owl/ObjectProperty,
   :rdfs/domain            :prov/Entity,
   :rdfs/isDefinedBy       "http://www.w3.org/ns/prov-o#",
   :rdfs/label             "wasInvalidatedBy",
   :rdfs/range             :prov/Activity,
   :rdfs/seeAlso           ["http://www.w3.org/ns/prov#qualifiedInvalidation"
                            "http://www.w3.org/ns/prov#Invalidation"],
   :rdfs/subPropertyOf     :prov/wasInfluencedBy})

(def wasQuotedFrom
  "An entity is derived from an original entity by copying, or 'quoting', some or all of it."
  {:db/ident :prov/wasQuotedFrom,
   :owl/propertyChainAxiom [:prov/qualifiedQuotation :prov/entity],
   :prov/category "expanded",
   :prov/component "derivations",
   :prov/inverse "quotedAs",
   :prov/qualifiedForm [:prov/qualifiedQuotation :prov/Quotation],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "An entity is derived from an original entity by copying, or 'quoting', some or all of it.@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "wasQuotedFrom",
   :rdfs/range :prov/Entity,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#qualifiedQuotation"
                  "http://www.w3.org/ns/prov#Quotation"],
   :rdfs/subPropertyOf [:prov/wasDerivedFrom :prov/wasInfluencedBy]})

(def wasRevisionOf
  "A revision is a derivation that revises an entity into a revised version."
  {:db/ident :prov/wasRevisionOf,
   :owl/propertyChainAxiom [:prov/qualifiedRevision :prov/entity],
   :prov/category "expanded",
   :prov/component "derivations",
   :prov/inverse "hadRevision",
   :prov/qualifiedForm [:prov/Revision :prov/qualifiedRevision],
   :rdf/type [:owl/ObjectProperty :owl/AnnotationProperty],
   :rdfs/comment
   #voc/lstr
    "A revision is a derivation that revises an entity into a revised version.@en",
   :rdfs/domain :prov/Entity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "wasRevisionOf",
   :rdfs/range :prov/Entity,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#Revision"
                  "http://www.w3.org/ns/prov#qualifiedRevision"],
   :rdfs/subPropertyOf [:prov/wasDerivedFrom :prov/wasInfluencedBy]})

(def wasStartedBy
  "Start is when an activity is deemed to have started. A start may refer to an entity, known as trigger, that initiated the activity."
  {:db/ident :prov/wasStartedBy,
   :owl/propertyChainAxiom [:prov/qualifiedStart :prov/entity],
   :prov/category "expanded",
   :prov/component "entities-activities",
   :prov/inverse "started",
   :prov/qualifiedForm [:prov/qualifiedStart :prov/Start],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Start is when an activity is deemed to have started. A start may refer to an entity, known as trigger, that initiated the activity.@en",
   :rdfs/domain :prov/Activity,
   :rdfs/isDefinedBy "http://www.w3.org/ns/prov-o#",
   :rdfs/label "wasStartedBy",
   :rdfs/range :prov/Entity,
   :rdfs/seeAlso ["http://www.w3.org/ns/prov#qualifiedStart"
                  "http://www.w3.org/ns/prov#Start"],
   :rdfs/subPropertyOf :prov/wasInfluencedBy})