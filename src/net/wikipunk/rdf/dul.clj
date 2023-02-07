(ns net.wikipunk.rdf.dul
  "The DOLCE+DnS Ultralite ontology. It is a simplification of some parts of the DOLCE Lite-Plus library (cf. http://www.ontologydesignpatterns.org/ont/dul/DLP397.owl). Main aspects in which DOLCE+DnS Ultralite departs from DOLCE Lite-Plus are the following: - The names of classes and relations have been made more intuitive - The DnS-related part is closer to the newer 'constructive DnS' ontology (http://www.ontologydesignpatterns.org/ont/dul/cDnS.owl). - Temporal and spatial relations are simplified - Qualities and regions are more relaxed than in DOLCE-Full: they can be used as attributes of any entity; an axiom states that each quality has a region - Axiomatization makes use of simpler constructs than DOLCE Lite-Plus - The architecture of the ontology is pattern-based, which means that DOLCE+DnS Ultralite is also available in modules, called 'content ontology design patterns', which can be applied independently in the design of domain ontologies (cf. http://www.ontologydesignpatterns.org). If many modules are needed in a same ontology project, it is anyway useful to use this integrated version. The final result is a lightweight, easy-to-apply foundational ontology for modeling either physical or social contexts. Several extensions of DOLCE+DnS Ultralite have been designed: - Information objects: http://www.ontologydesignpatterns.org/ont/dul/IOLite.owl - Systems: http://www.ontologydesignpatterns.org/ont/dul/SystemsLite.owl - Plans: http://www.ontologydesignpatterns.org/ont/dul/PlansLite.owl - Legal domain: http://www.ontologydesignpatterns.org/ont/dul/CLO/CoreLegal.owl - Lexical and semiotic domains: http://www.ontologydesignpatterns.org/ont/lmm/LMM_L2.owl - DOLCE-Zero: http://www.ontologydesignpatterns.org/ont/d0.owl is a commonsense-oriented generalisation of some top-level classes, which allows to use DOLCE with tolerance against ambiguities like abstract vs. concrete information, locations vs. physical artifacts, event occurrences vs. event types, events vs. situations, qualities vs. regions, etc.; etc."
  {:owl/versionInfo
   ["In 3.2, the links between instances of Region or Parameter, and datatypes have been revised and made more powerful, in order to support efficient design patterns for data value modelling in OWL1.0.\nAlso, the names of the related properties have been changed in order to make them more intuitive.\nFurthermore, a large comment field has been added to the 'expresses' object property, in order to clarify some issues about the many interpretations.\nIn 3.3, the relation between regions, parameters, and datatypes has been still improved.\nIn 3.5, the person-related classes have been refactored: Person in 3.4 is now SocialPerson, to avoid confusion with commonsense intuition; Person is now the union of social persons and humans, therefore being a subclass of Agent.\nIn 3.6, other fixes on universal restriction involving expresses. Also added the property 'isConstraintFor' between parameters and entities. Moved the properties: 'assumes' and 'adopts' to the new module: http://www.ontologydesignpatterns.org/ont/dul/Conceptualization.owl.\nIn 3.7, some fixes on the names of classes and properties related to FormalEntity; created a new separate module for general universal restrictions (DULGCI.owl).\nIn 3.8, more fixes on the interface to formal entities and links to IOLite.owl.\nIn 3.9, some naming and comment fixes.\nIn 3.10, removed cardinality restriction from hasPart and isPartOf restrictions (changed to hasComponent and isComponentOf), for OWL(DL) compatibility. Also enlarged the range of includesAgent to contain both social and physical agents, and of conceptualizes universal restriction on agents, to include all social objects.\nIn 3.11, some more subproperty axioms have been introduced, and all elements have got English labels.\nIn 3.12, added some classes to map some old DolceLitePlus classes that were used to align OntoWordNet.\nIn 3.13, added the LocalConcept class to express a Concept that cannot be used in a Description different from the one that defines it. Also updated some comments.\nIn 3.14, added some comments.\nIn 3.15, removed some owl:disjointWith axioms relating Collection to InformationObject, Description, Situation, and SocialAgent. The rationale for doing that is to allow less strict constraints on domain relations involving collections that can be also conceived as descriptions, situations, social agents, or information objects; for example: a collection of sentences from a text (an information object) that are ranked with a relevance criterion can be still considered a text.\nIn 3.16, name of isActedBy changed to actsThrough, which is clearer. Also added SpatioTemporalRegion as constituted by a SpaceRegion and a TimeInterval.\nIn 3.17, removed redundant universal axioms from Entity and other top classes. Fixed restrictions on FunctionalSubstance class, and comments in Design and Substance classes.\nIn 3.18, removed subClassOf axiom from FunctionalSubstance to DesignedArtifact, created a new subclass of FunctionalSubstance, called DesignedSubstance, and created a subClassOf axiom from DesignedSubstance to DesignedArtifact.\nIn 3.19, removed disjointness axiom between Concept and Collection (the same rationale applies as in 3.15 version.\nIn 3.20, revised the comment for Quality, added InformationEntity as the superclass for InformationObject and InformationRealization (represented as the union of those classes). This is needed in many domain ontologies that do not need to distinguish between abstract and concrete aspects of information entities. One possible revision (not implemented here) would be to introduce the relations: expresses and isAbout with a broader domain:InformationEntity, and two more specific properties: abstractlyExpresses and isAbstractlyAbout. This last revision has not been implemented yet, since a large revision procedure should be carried out in order to check the impact of the revision on the existing DOLCE-DnS-Ultralite plugins.\nIn 3.21, added comment to InformationEntity, and optimized representation of equivalence for InformationRealization.\nIn 3.22, added comment to Personification.\nIn 3.23, added associatedWith object property, and put all object properties as subproperties of it.\nIn 3.24, removed hasProxy datatype property.\nIn 3.25, generalized domain and range of hasComponent and isComponentOf.\nIn 3.26, updated some comments in order to clarify or exemplify the concepts.\nIn 3.27, added rdfs:isDefinedBy annotations for Linked Data browsers.\nIn 3.28, broadened the universe of pre-/post-conditions to give room to events and states.\nIn 3.29, added some properties to support DBpedia alignment: sameSettingAs (situational analogous to coparticipation), including relations originating e.g. from sharing kinship, ownership, or roleplaying situations.\nIn 3.30, completed some domains and ranges (formerly owl:Thing, now dul:Entity), and added axiom: Organism subClassOf PhysicalAgent.\nIn 3.31, added a restriction to Quality and one to Region in order to ensure the original DOLCE constraint of qualities being always associated with a region, and vice versa. These axioms do not however exclude a direct applicability of qualities or regions to any other entity.\nIn 3.32, removed redundant union axioms and some restrictions, which spot a negative trade-off between expressivity and complexity.\nIn 3.33, added the ObjectAggregate class, added two property chains for coparticipation and same situation setting, updated some comments, added an axiom to Transition.\nIn 3.34, extended mereological support for parthood, introducing hasPropertPart (transitive) as a middle property between hasPart (transitive and reflexive) and hasComponent (asymmetric). This solution uses then \"reflexive reduction\" and \"transitive reduction\" design patterns (they allow to grant property characteristics through the superproperties, but not in the subproperties). Technically, mereology axioms would require that also hasProperPart be asymmetric, however a direct subproperty of an OWL non-simple property (hasPart) cannot be also asymmetric, hence the approximation. \nAdded a n-ary parthood class in order to suggest an alternative pattern for time- (and space-)indexed part relations. In order to ensure that property characteristics hold also with parthood n-ary, a property chain is introduced which infers a direct dul:partOf property for each parthood individual.\nAdded a dul:realizesSelfInformation propery in order to enable local reflexivity ('Self') axioms for all information realizations.\n\nIn 4.0, some foundational changes are introduced. \n- Firstly, the temporally indexed versions of some properties are introduced as subclasses of Situation (following the n-ary relation pattern), so covering relations from DOLCE that were skipped because of their larger arity. - \n- Secondly, D&S's Situation class is extracted from DOLCE top-level distinctions (it used to be a subclass of SocialObject), put as a primitive class under Entity, and not disjoint from any other class. Since we are relaxing the semantics of Situation, this change is fully compatible with previous versions of DUL.\nThe reason for the change is that it may sound counterintuitive (as many have noticed) to assume a descriptive commitment for situations, but not for events or states. \nIn fact, D&S provides an epistemological commitment to an ontology, independently from its foundational distinctions. A situation operationalizes that epistemology, and it is better not to put it under any foundational distinction (event, object, fluent, etc.), leaving to the designer whether to use descriptions as epistemological lenses, and so generating a situation, or not. \nA consequence is that any entity, when 'framed' by (satisfying) a description, becomes a situation. We can still model entities as being in a situation's setting, and classified by a concept defined in a description."
    "Created by Aldo Gangemi as both a simplification and extension of DOLCE and Descriptions and Situations ontologies."
    "3.34"],
   :rdf/ns-prefix-map {"dc11" "http://purl.org/dc/elements/1.1/",
                       "dul"
                       "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfa/prefix "dul",
   :rdfa/uri "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl#",
   :rdfs/comment
   "The DOLCE+DnS Ultralite ontology.\nIt is a simplification of some parts of the DOLCE Lite-Plus library (cf. http://www.ontologydesignpatterns.org/ont/dul/DLP397.owl). \nMain aspects in which DOLCE+DnS Ultralite departs from DOLCE Lite-Plus are the following:\n\n- The names of classes and relations have been made more intuitive\n- The DnS-related part is closer to the newer 'constructive DnS' ontology (http://www.ontologydesignpatterns.org/ont/dul/cDnS.owl).\n- Temporal and spatial relations are simplified\n- Qualities and regions are more relaxed than in DOLCE-Full: they can be used as attributes of any entity; an axiom states that each quality has a region\n- Axiomatization makes use of simpler constructs than DOLCE Lite-Plus\n- The architecture of the ontology is pattern-based, which means that DOLCE+DnS Ultralite is also available in modules, called 'content ontology design patterns', which can be applied independently in the design of domain ontologies (cf. http://www.ontologydesignpatterns.org).  If many modules are needed in a same ontology project, it is anyway useful to use this integrated version.\n\nThe final result is a lightweight, easy-to-apply foundational ontology for modeling either physical or social contexts.\nSeveral extensions of DOLCE+DnS Ultralite have been designed: \n- Information objects: http://www.ontologydesignpatterns.org/ont/dul/IOLite.owl \n- Systems: http://www.ontologydesignpatterns.org/ont/dul/SystemsLite.owl \n- Plans: http://www.ontologydesignpatterns.org/ont/dul/PlansLite.owl\n- Legal domain: http://www.ontologydesignpatterns.org/ont/dul/CLO/CoreLegal.owl\n- Lexical and semiotic domains: http://www.ontologydesignpatterns.org/ont/lmm/LMM_L2.owl\n- DOLCE-Zero: http://www.ontologydesignpatterns.org/ont/d0.owl is a commonsense-oriented generalisation of some top-level classes, which allows to use DOLCE with tolerance against ambiguities like abstract vs. concrete information, locations vs. physical artifacts, event occurrences vs. event types, events vs. situations, qualities vs. regions, etc.; etc.",
   :rdfs/label "DOLCE+DnS Ultralite"})

(def Abstract
  "Any Entity that cannot be located in space-time. E.g. mathematical entities: formal semantics elements, regions within dimensional spaces, etc."
  {:db/ident :dul/Abstract,
   :owl/disjointWith [:dul/Quality :dul/Object :dul/Event],
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any Entity that cannot be located in space-time. E.g. mathematical entities: formal semantics elements, regions within dimensional spaces, etc.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Astratto"}
                {:rdf/language "en",
                 :rdf/value    "Abstract"}],
   :rdfs/subClassOf :dul/Entity})

(def Action
  "An Event with at least one Agent that isParticipantIn it, and that executes a Task that typically isDefinedIn a Plan, Workflow, Project, etc."
  {:db/ident :dul/Action,
   :rdf/type :owl/Class,
   :rdfs/comment
   "An Event with at least one Agent that isParticipantIn it, and that executes a Task that typically isDefinedIn a Plan, Workflow, Project, etc.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Azione"}
                {:rdf/language "en",
                 :rdf/value    "Action"}],
   :rdfs/subClassOf [{:owl/minCardinality 1,
                      :owl/onProperty     :dul/executesTask,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :dul/hasParticipant,
                      :owl/someValuesFrom :dul/Agent,
                      :rdf/type           :owl/Restriction}
                     :dul/Event]})

(def Agent
  "Any agentive Object , either physical (e.g. a whale, a robot, an oak), or social (e.g. a corporation, an institution, a community). Additional comment: a computational agent can be considered as a PhysicalAgent that realizes a certain class of algorithms (that can be considered as instances of InformationObject) that allow to obtain some behaviors that are considered typical of agents in general. For an ontology of computational objects based on DOLCE see e.g. http://www.loa-cnr.it/COS/COS.owl, and http://www.loa-cnr.it/KCO/KCO.owl."
  {:db/ident :dul/Agent,
   :rdf/type :owl/Class,
   :rdfs/comment
   ["Any agentive Object , either physical (e.g. a whale, a robot, an oak), or social (e.g. a corporation, an institution, a community)."
    "Additional comment: a computational agent can be considered as a PhysicalAgent that realizes a certain class of algorithms (that can be considered as instances of InformationObject) that allow to obtain some behaviors that are considered typical of agents in general. For an ontology of computational objects based on DOLCE see e.g. http://www.loa-cnr.it/COS/COS.owl, and http://www.loa-cnr.it/KCO/KCO.owl."],
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Agente"}
                {:rdf/language "en",
                 :rdf/value    "Agent"}],
   :rdfs/subClassOf :dul/Object})

(def Amount
  "A quantity, independently from how it is measured, computed, etc."
  {:db/ident :dul/Amount,
   :owl/disjointWith
   [:dul/TimeInterval :dul/SpaceRegion :dul/PhysicalAttribute],
   :rdf/type :owl/Class,
   :rdfs/comment
   "A quantity, independently from how it is measured, computed, etc.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Quantità"}
                {:rdf/language "en",
                 :rdf/value    "Amount"}],
   :rdfs/subClassOf :dul/Region})

(def BiologicalObject
  "Biological object"
  {:db/ident         :dul/BiologicalObject,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Biological object"},
   :rdfs/subClassOf  :dul/PhysicalBody})

(def ChemicalObject
  "Chemical object"
  {:db/ident         :dul/ChemicalObject,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Chemical object"},
   :rdfs/subClassOf  :dul/PhysicalBody})

(def Classification
  "A special kind of Situation that allows to include time indexing for the classifies relation in situations. For example, if a Situation s 'my old cradle is used in these days as a flower pot' isSettingFor the entity 'my old cradle' and the TimeIntervals '8June2007' and '10June2007', and we know that s satisfies a functional Description for aesthetic objects, which defines the Concepts 'flower pot' and 'flower', then we also need to know what concept classifies 'my old cradle' at what time. In order to solve this issue, we need to create a sub-situation s' for the classification time: 'my old cradle is a flower pot in 8June2007'. Such sub-situation s' isPartOf s."
  {:db/ident :dul/Classification,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A special kind of Situation that allows to include time indexing for the classifies relation in situations. For example, if a Situation s 'my old cradle is used in these days as a flower pot' isSettingFor the entity 'my old cradle' and the TimeIntervals '8June2007' and '10June2007', and we know that s satisfies a functional Description for aesthetic objects, which defines the Concepts 'flower pot' and 'flower', then we also need to know what concept classifies 'my old cradle' at what time.\nIn order to solve this issue, we need to create a sub-situation s' for the classification time: 'my old cradle is a flower pot in 8June2007'. Such sub-situation s' isPartOf s.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "time-indexed classification"}
                {:rdf/language "it",
                 :rdf/value    "Classificazione"}
                {:rdf/language "en",
                 :rdf/value    "Classification"}],
   :rdfs/subClassOf [{:owl/onProperty     :dul/isSettingFor,
                      :owl/someValuesFrom :dul/Entity,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :dul/isSettingFor,
                      :owl/someValuesFrom :dul/TimeInterval,
                      :rdf/type           :owl/Restriction}
                     :dul/TimeIndexedRelation
                     {:owl/onProperty     :dul/isSettingFor,
                      :owl/someValuesFrom :dul/Concept,
                      :rdf/type           :owl/Restriction}]})

(def Collection
  "Any container for entities that share one or more common properties. E.g. \"stone objects\", \"the nurses\", \"the Louvre Aegyptian collection\", all the elections for the Italian President of the Republic. A collection is not a logical class: a collection is a first-order entity, while a class is second-order. A collection is neither an aggregate of its member entities (see e.g. ObjectAggregate class)."
  {:db/ident :dul/Collection,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any container for entities that share one or more common properties. E.g. \"stone objects\", \"the nurses\", \"the Louvre Aegyptian collection\", all the elections for the Italian President of the Republic. \nA collection is not a logical class: a collection is a first-order entity, while a class is second-order.\nA collection is neither an aggregate of its member entities (see e.g. ObjectAggregate class).",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Collezione"}
                {:rdf/language "en",
                 :rdf/value    "Collection"}],
   :rdfs/subClassOf [{:owl/allValuesFrom :dul/Collection,
                      :owl/onProperty    :dul/hasPart,
                      :rdf/type          :owl/Restriction}
                     :dul/SocialObject]})

(def Collective
  "A Collection whose members are agents, e.g. \"the nurses\", \"the Italian rockabilly fans\". Collectives, facon de parler, can act as agents, although they are not assumed here to be agents (they are even disjoint from the class SocialAgent). This is represented by admitting collectives in the range of the relations having Agent in their domain or range."
  {:db/ident :dul/Collective,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Collection whose members are agents, e.g. \"the nurses\", \"the Italian rockabilly fans\".\nCollectives, facon de parler, can act as agents, although they are not assumed here to be agents (they are even disjoint from the class SocialAgent). This is represented by admitting collectives in the range of the relations having Agent in their domain or range.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Collettivo"}
                {:rdf/language "en",
                 :rdf/value    "Collective"}],
   :rdfs/subClassOf [{:owl/allValuesFrom :dul/Agent,
                      :owl/onProperty    :dul/hasMember,
                      :rdf/type          :owl/Restriction}
                     :dul/Collection]})

(def CollectiveAgent
  "A SocialAgent that is actedBy agents that are (and act as) members of a Collective. A collective agent can have roles that are also roles of those agents. For example, in sociology, a 'group action' is the situation in which a number of people (that result to be members of a collective) in a given area behave in a coordinated way in order to achieve a (often common) goal. The Agent in such a Situation is not single, but a CollectiveAgent (a Group). This can be generalized to the notion of social movement, which assumes a large Community or even the entire Society as agents. The difference between a CollectiveAgent and an Organization is that a Description that introduces a CollectiveAgent is also one that unifies the corresponding Collective. In practice, this difference makes collective agents 'less stable' than organizations, because they have a dedicated, publicly recognizable Description that is conceived to introduce them."
  {:db/ident :dul/CollectiveAgent,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A SocialAgent that is actedBy agents that are (and act as) members of a Collective. A collective agent can have roles that are also roles of those agents.\nFor example, in sociology, a 'group action' is the situation in which a number of people (that result to be members of a collective) in a given area behave in a coordinated way in order to achieve a (often common) goal. The Agent in such a Situation is not single, but a CollectiveAgent (a Group). This can be generalized to the notion of social movement, which assumes a large Community or even the entire Society as agents.\nThe difference between a CollectiveAgent and an Organization is that a Description that introduces a CollectiveAgent is also one that unifies the corresponding Collective. In practice, this difference makes collective agents 'less stable' than organizations, because they have a dedicated, publicly recognizable Description that is conceived to introduce them.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Collective agent"}
                {:rdf/language "it",
                 :rdf/value    "Agente collettivo"}],
   :rdfs/subClassOf [{:owl/onProperty     :dul/isIntroducedBy,
                      :owl/someValuesFrom :dul/Description,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :dul/actsThrough,
                      :owl/someValuesFrom :dul/Agent,
                      :rdf/type           :owl/Restriction}
                     :dul/SocialAgent]})

(def Community
  "Community"
  {:db/ident         :dul/Community,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label       [{:rdf/language "it",
                       :rdf/value    "Comunità"}
                      {:rdf/language "en",
                       :rdf/value    "Community"}],
   :rdfs/subClassOf  :dul/CollectiveAgent})

(def Concept
  "A Concept is a SocialObject, and isDefinedIn some Description; once defined, a Concept can be used in other Description(s). If a Concept isDefinedIn exactly one Description, see the LocalConcept class. The classifies relation relates Concept(s) to Entity(s) at some TimeInterval"
  {:db/ident :dul/Concept,
   :owl/disjointWith [:dul/InformationObject :dul/Situation :dul/SocialAgent],
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Concept is a SocialObject, and isDefinedIn some Description; once defined, a Concept can be used in other Description(s). If a Concept isDefinedIn exactly one Description, see the LocalConcept class.\nThe classifies relation relates Concept(s) to Entity(s) at some TimeInterval",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Concept"}
                {:rdf/language "it",
                 :rdf/value    "Concetto"}],
   :rdfs/subClassOf [{:owl/allValuesFrom :dul/Concept,
                      :owl/onProperty    :dul/hasPart,
                      :rdf/type          :owl/Restriction}
                     :dul/SocialObject
                     {:owl/onProperty     :dul/isDefinedIn,
                      :owl/someValuesFrom :dul/Description,
                      :rdf/type           :owl/Restriction}]})

(def Configuration
  "A collection whose members are 'unified', i.e. organized according to a certain schema that can be represented by a Description. Typically, a configuration is the collection that emerges out of a composed entity: an industrial artifact, a plan, a discourse, etc. E.g. a physical book has a configuration provided by the part-whole schema that holds together its cover, pages, ink. That schema, based on the individual relations between the book and its parts, can be represented in a reified way by means of a (structural) description, which is said to 'unify' the book configuration."
  {:db/ident :dul/Configuration,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A collection whose members are 'unified', i.e. organized according to a certain schema that can be represented by a Description.\nTypically, a configuration is the collection that emerges out of a composed entity: an industrial artifact, a plan, a discourse, etc.  \nE.g. a physical book has a configuration provided by the part-whole schema that holds together its cover, pages, ink. That schema, based on the individual relations between the book and its parts, can be represented in a reified way by means of a (structural) description, which is said to 'unify' the book configuration.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Configurazione"}
                {:rdf/language "en",
                 :rdf/value    "Configuration"}],
   :rdfs/subClassOf :dul/Collection})

(def Contract
  "(The content of) an agreement between at least two agents that play a Party Role, about some contract object (a Task to be executed)."
  {:db/ident :dul/Contract,
   :rdf/type :owl/Class,
   :rdfs/comment
   "(The content of) an agreement between at least two agents that play a Party Role, about some contract object (a Task to be executed).",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Contratto"}
                {:rdf/language "en",
                 :rdf/value    "Contract"}],
   :rdfs/subClassOf :dul/Description})

(def Description
  "A Description is a SocialObject that represents a conceptualization. It can be thought also as a 'descriptive context' that uses or defines concepts in order to create a view on a 'relational context' (cf. Situation) out of a set of data or observations. For example, a Plan is a Description of some actions to be executed by agents in a certain way, with certain parameters; a Diagnosis is a Description that provides an interpretation for a set of observed entities, etc. Descriptions 'define' or 'use' concepts, and can be 'satisfied' by situations."
  {:db/ident :dul/Description,
   :owl/disjointWith [:dul/SocialAgent :dul/Situation :dul/InformationObject],
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Description is a SocialObject that represents a conceptualization. \nIt can be thought also as a 'descriptive context' that uses or defines concepts in order to create a view on a 'relational context' (cf. Situation) out of a set of data or observations. \nFor example, a Plan is a Description of some actions to be executed by agents in a certain way, with certain parameters; a Diagnosis is a Description that provides an interpretation for a set of observed entities, etc.\nDescriptions 'define' or 'use' concepts, and can be 'satisfied' by situations.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Descrizione"}
                {:rdf/language "en",
                 :rdf/value    "Description"}],
   :rdfs/subClassOf :dul/SocialObject})

(def Design
  "A Description of the Situation, in terms of structure and function, held by an Entity for some reason. A design is usually accompanied by the rationales behind the construction of the designed Entity (i.e. of the reasons why a design is claimed to be as such). For example, the actual design (a Situation) of a car or of a law is based on both the specification (a Description) of the structure, and the rationales used to construct cars or laws. While designs typically describe entities to be constructed, they can also be used to describe 'refunctionalized' entities, or to hypothesize unknown functions. For example, a cradle can be refunctionalized as a flowerpot based on a certain home design."
  {:db/ident :dul/Design,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Description of the Situation, in terms of structure and function, held by an Entity for some reason.\nA design is usually accompanied by the rationales behind the construction of the designed Entity (i.e. of the reasons why a design is claimed to be as such). For example, the actual design (a Situation) of a car or of a law is based on both the specification (a Description) of the structure, and the rationales used to construct cars or laws.\nWhile designs typically describe entities to be constructed, they can also be used to describe 'refunctionalized' entities, or to hypothesize unknown functions. For example, a cradle can be refunctionalized as a flowerpot based on a certain home design.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Design"}
                {:rdf/language "en",
                 :rdf/value    "Design"}],
   :rdfs/subClassOf :dul/Description})

(def DesignedArtifact
  "A PhysicalArtifact that is also described by a Design. This excludes simple recycling or refunctionalization of natural objects. Most common sense 'artifacts' can be included in this class: cars, lamps, houses, chips, etc."
  {:db/ident :dul/DesignedArtifact,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A PhysicalArtifact that is also described by a Design. This excludes simple recycling or refunctionalization of natural objects. Most common sense 'artifacts' can be included in this class: cars, lamps, houses, chips, etc.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Designed artifact"}
                {:rdf/language "it",
                 :rdf/value    "Artefatto progettato"}],
   :rdfs/subClassOf [{:owl/onProperty     :dul/isDescribedBy,
                      :owl/someValuesFrom :dul/Design,
                      :rdf/type           :owl/Restriction}
                     :dul/PhysicalArtifact]})

(def DesignedSubstance
  {:db/ident         :dul/DesignedSubstance,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/subClassOf  [:dul/FunctionalSubstance :dul/DesignedArtifact]})

(def Diagnosis
  "A Description of the Situation of a system, usually applied in order to control a normal behaviour, or to explain a notable behavior (e.g. a functional breakdown)."
  {:db/ident :dul/Diagnosis,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Description of the Situation of a system, usually applied in order to control a normal behaviour, or to explain a notable behavior (e.g. a functional breakdown).",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Diagnosis"}
                {:rdf/language "it",
                 :rdf/value    "Diagnosi"}],
   :rdfs/subClassOf :dul/Description})

(def Entity
  "Anything: real, possible, or imaginary, which some modeller wants to talk about for some purpose."
  {:db/ident :dul/Entity,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Anything: real, possible, or imaginary, which some modeller wants to talk about for some purpose.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Entità"}
                {:rdf/language "en",
                 :rdf/value    "Entity"}]})

(def Event
  "Any physical, social, or mental process, event, or state. More theoretically, events can be classified in different ways, possibly based on 'aspect' (e.g. stative, continuous, accomplishement, achievement, etc.), on 'agentivity' (e.g. intentional, natural, etc.), or on 'typical participants' (e.g. human, physical, abstract, food, etc.). Here no special direction is taken, and the following explains why: events are related to observable situations, and they can have different views at a same time. If a position has to be suggested here anyway, the participant-based classification of events seems the most stable and appropriate for many modelling problems. (1) Alternative aspectual views Consider a same event 'rock erosion in the Sinni valley': it can be conceptualized as an accomplishment (what has brought a certain state to occur), as an achievement (the state resulting from a previous accomplishment), as a punctual event (if we collapse the time interval of the erosion into a time point), or as a transition (something that has changed from a state to a different one). In the erosion case, we could therefore have good motivations to shift from one aspect to another: a) causation focus, b) effectual focus, c) historical condensation, d) transition (causality). The different views refer to the same event, but are still different: how to live with this seeming paradox? A typical solution e.g. in linguistics (cf. Levin's aspectual classes) and in DOLCE Full (cf. WonderWeb D18 axiomatization) is to classify events based on aspectual differences. But this solution would create different identities for a same event, where the difference is only based on the modeller's attitude. An alternative solution is suggested here, and exploits the notion of (observable) Situation; a Situation is a view, consistent with a Description, which can be observed of a set of entities. It can also be seen as a 'relational context' created by an observer on the basis of a 'frame'. Therefore, a Situation allows to create a context where each particular view can have a proper identity, while the Event preserves its own identity. For example, ErosionAsAccomplishment is a Situation where rock erosion is observed as a process leading to a certain achievement: the conditions (roles, parameters) that suggest such view are stated in a Description, which acts as a 'theory of accomplishments'. Similarly, ErosionAsTransition is a Situation where rock erosion is observed as an event that has changed a state to another: the conditions for such interpretation are stated in a different Description, which acts as a 'theory of state transitions'. Consider that in no case the actual event is changed or enriched in parts by the aspectual view. (2) Alternative intentionality views Similarly to aspectual views, several intentionality views can be provided for a same Event. For example, one can investigate if an avalanche has been caused by immediate natural forces, or if there is any hint of an intentional effort to activate those natural forces. Also in this case, the Event as such has not different identities, while the causal analysis generates situations with different identities, according to what Description is taken for interpreting the Event. On the other hand, if the possible actions of an Agent causing the starting of an avalanche are taken as parts of the Event, then this makes its identity change, because we are adding a part to it. Therefore, if intentionality is a criterion to classify events or not, this depends on if an ontology designer wants to consider causality as a relevant dimension for events' identity. (3) Alternative participant views A slightly different case is when we consider the basic participants to an Event. In this case, the identity of the Event is affected by the participating objects, because it depends on them. For example, if snow, mountain slopes, wind, waves, etc. are considered as an avalanche basic participants, or if we also want to add water, human agents, etc., that makes the identity of an avalanche change. Anyway, this approach to event classification is based on the designer's choices, and more accurately mirrors lexical or commonsense classifications (see. e.g. WordNet 'supersenses' for verb synsets). Ultimately, this discussion has no end, because realists will keep defending the idea that events in reality are not changed by the way we describe them, while constructivists will keep defending the idea that, whatever 'true reality' is about, it can't be modelled without the theoretical burden of how we observe and describe it. Both positions are in principle valid, but, if taken too radically, they focus on issues that are only partly relevant to the aim of computational ontologies, which assist domain experts in representing a certain portion of reality according to their own assumptions and requirements. For this reason, in this ontology version of DOLCE, both events and situations are allowed, together with descriptions (the reason for the inclusion of the D&S framewrok in DOLCE), in order to encode the modelling needs, independently from the position (if any) chosen by the model designer."
  {:db/ident :dul/Event,
   :owl/disjointWith [:dul/Quality :dul/Object],
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any physical, social, or mental process, event, or state.\n\nMore theoretically, events can be classified in different ways, possibly based on 'aspect' (e.g. stative, continuous, accomplishement, achievement, etc.), on 'agentivity' (e.g. intentional, natural, etc.), or on 'typical participants' (e.g. human, physical, abstract, food, etc.).\nHere no special direction is taken, and the following explains why: events are related to observable situations, and they can have different views at a same time.\nIf a position has to be suggested here anyway, the participant-based classification of events seems the most stable and appropriate for many modelling problems.\n\n(1) Alternative aspectual views\n\nConsider a same event 'rock erosion in the Sinni valley': it can be conceptualized as an accomplishment (what has brought a certain state to occur), as an achievement (the state resulting from a previous accomplishment), as a punctual event (if we collapse the time interval of the erosion into a time point), or as a transition (something that has changed from a state to a different one). \nIn the erosion case, we could therefore have good motivations to shift from one aspect to another: a) causation focus, b) effectual focus, c) historical condensation, d) transition (causality).\n\nThe different views refer to the same event, but are still different: how to live with this seeming paradox? \nA typical solution e.g. in linguistics (cf. Levin's aspectual classes) and in DOLCE Full (cf. WonderWeb D18 axiomatization) is to classify events based on aspectual differences. But this solution would create different identities for a same event, where the difference is only based on the modeller's attitude.\nAn alternative solution is suggested here, and exploits the notion of (observable) Situation; a Situation is a view, consistent with a Description, which can be observed of a set of entities. It can also be seen as a 'relational context' created by an observer on the basis of a 'frame'. Therefore, a Situation allows to create a context where each particular view can have a proper identity, while the Event preserves its own identity. \nFor example, ErosionAsAccomplishment is a Situation where rock erosion is observed as a process leading to a certain achievement: the conditions (roles, parameters) that suggest such view are stated in a Description, which acts as a 'theory of accomplishments'. Similarly, ErosionAsTransition is a Situation where rock erosion is observed as an event that has changed a state to another: the conditions for such interpretation are stated in a different Description, which acts as a 'theory of state transitions'.\nConsider that in no case the actual event is changed or enriched in parts by the aspectual view.\n\n(2) Alternative intentionality views\n\nSimilarly to aspectual views, several intentionality views can be provided for a same Event. For example, one can investigate if an avalanche has been caused by immediate natural forces, or if there is any hint of an intentional effort to activate those natural forces.\nAlso in this case, the Event as such has not different identities, while the causal analysis generates situations with different identities, according to what Description is taken for interpreting the Event. \nOn the other hand, if the possible actions of an Agent causing the starting of an avalanche are taken as parts of the Event, then this makes its identity change, because we are adding a part to it. \nTherefore, if intentionality is a criterion to classify events or not, this depends on if an ontology designer wants to consider causality as a relevant dimension for events' identity.\n\n(3) Alternative participant views\n\nA slightly different case is when we consider the basic participants to an Event. In this case, the identity of the Event is affected by the participating objects, because it depends on them. \nFor example, if snow, mountain slopes, wind, waves, etc. are considered as an avalanche basic participants, or if we also want to add water, human agents, etc., that makes the identity of an avalanche change.\nAnyway, this approach to event classification is based on the designer's choices, and more accurately mirrors lexical or commonsense classifications (see. e.g. WordNet 'supersenses' for verb synsets).\n\nUltimately, this discussion has no end, because realists will keep defending the idea that events in reality are not changed by the way we describe them, while constructivists will keep defending the idea that, whatever 'true reality' is about, it can't be modelled without the theoretical burden of how we observe and describe it. \nBoth positions are in principle valid, but, if taken too radically, they focus on issues that are only partly relevant to the aim of computational ontologies, which assist domain experts in representing a certain portion of reality according to their own assumptions and requirements. \n\nFor this reason, in this ontology version of DOLCE, both events and situations are allowed, together with descriptions (the reason for the inclusion of the D&S framewrok in DOLCE), in order to encode the modelling needs, independently from the position (if any) chosen by the model designer.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Event"}
                {:rdf/language "it",
                 :rdf/value    "Evento"}],
   :rdfs/subClassOf [{:owl/onProperty     :dul/hasParticipant,
                      :owl/someValuesFrom :dul/Object,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :dul/Event,
                      :owl/onProperty    :dul/hasPart,
                      :rdf/type          :owl/Restriction}
                     {:owl/onProperty     :dul/hasTimeInterval,
                      :owl/someValuesFrom :dul/TimeInterval,
                      :rdf/type           :owl/Restriction}
                     :dul/Entity
                     {:owl/allValuesFrom :dul/Event,
                      :owl/onProperty    :dul/hasConstituent,
                      :rdf/type          :owl/Restriction}]})

(def EventType
  "A Concept that classifies an Event . An event type describes how an Event should be interpreted, executed, expected, seen, etc., according to the Description that the EventType isDefinedIn (or used in)"
  {:db/ident :dul/EventType,
   :owl/disjointWith [:dul/Role :dul/Parameter],
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Concept that classifies an Event . An event type describes how an Event should be interpreted, executed, expected, seen, etc., according to the Description that the EventType isDefinedIn (or used in)",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Tipo di evento"}
                {:rdf/language "en",
                 :rdf/value    "Event type"}],
   :rdfs/subClassOf [{:owl/allValuesFrom :dul/Event,
                      :owl/onProperty    :dul/classifies,
                      :rdf/type          :owl/Restriction}
                     :dul/Concept]})

(def FormalEntity
  "Entities that are formally defined and are considered independent from the social context in which they are used. They cannot be localized in space or time. Also called 'Platonic entities'. Mathematical and logical entities are included in this class: sets, categories, tuples, costants, variables, etc. Abstract formal entities are distinguished from information objects, which are supposed to be part of a social context, and are localized in space and time, therefore being (social) objects. For example, the class 'Quark' is an abstract formal entity from the purely set-theoretical perspective, but it is an InformationObject from the viewpoint of ontology design, when e.g. implemented in a logical language like OWL. Abstract formal entities are also distinguished from Concept(s), Collection(s), and Description(s), which are part of a social context, therefore being SocialObject(s) as well. For example, the class 'Quark' is an abstract FormalEntity from the purely set-theoretical perspective, but it is a Concept within history of science and cultural dynamics. These distinctions allow to represent two different notions of 'semantics': the first one is abstract and formal ('formal semantics'), and formallyInterprets symbols that are about entities whatsoever; for example, the term 'Quark' isAbout the Collection of all quarks, and that Collection isFormalGroundingFor the abstract class 'Quark' (in the extensional sense). The second notion is social, localized in space-time ('social semantics'), and can be used to interpret entities in the intensional sense. For example, the Collection of all quarks isCoveredBy the Concept 'Quark', which is also expressed by the term 'Quark'."
  {:db/ident :dul/FormalEntity,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Entities that are formally defined and are considered independent from the social context in which they are used. They cannot be localized in space or time. Also called 'Platonic entities'.\nMathematical and logical entities are included in this class: sets, categories, tuples, costants, variables, etc.\nAbstract formal entities are distinguished from information objects, which are supposed to be part of a social context, and are localized in space and time, therefore being (social) objects.\nFor example, the class 'Quark' is an abstract formal entity from the purely set-theoretical perspective, but it is an InformationObject from the viewpoint of ontology design, when e.g. implemented in a logical language like OWL.\nAbstract formal entities are also distinguished from Concept(s), Collection(s), and Description(s), which are part of a social context, therefore being SocialObject(s) as well.\nFor example, the class 'Quark' is an abstract FormalEntity from the purely set-theoretical perspective, but it is a Concept within history of science and cultural dynamics.\n\nThese distinctions allow to represent two different notions of 'semantics': the first one is abstract and formal ('formal semantics'), and formallyInterprets symbols that are about entities whatsoever; for example, the term 'Quark' isAbout the Collection of all quarks, and that Collection isFormalGroundingFor the abstract class 'Quark' (in the extensional sense). \nThe second notion is social, localized in space-time ('social semantics'), and can be used to interpret entities in the intensional sense. For example, the Collection of all quarks isCoveredBy the Concept 'Quark', which is also expressed by the term 'Quark'.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Formal entity"}
                {:rdf/language "it",
                 :rdf/value    "Entità formale astratta"}],
   :rdfs/subClassOf :dul/Abstract})

(def FunctionalSubstance
  "Functional substance"
  {:db/ident         :dul/FunctionalSubstance,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Functional substance"},
   :rdfs/subClassOf  :dul/Substance})

(def Goal
  "The Description of a Situation that is desired by an Agent, and usually associated to a Plan that describes how to actually achieve it"
  {:db/ident :dul/Goal,
   :rdf/type :owl/Class,
   :rdfs/comment
   "The Description of a Situation that is desired by an Agent, and usually associated to a Plan that describes how to actually achieve it",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Scopo"}
                {:rdf/language "en",
                 :rdf/value    "Goal"}],
   :rdfs/subClassOf :dul/Description})

(def Group
  "A CollectiveAgent whose acting agents conceptualize a same SocialRelation ."
  {:db/ident :dul/Group,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A CollectiveAgent whose acting agents conceptualize a same SocialRelation .",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Gruppo"}
                {:rdf/language "en",
                 :rdf/value    "Group"}],
   :rdfs/subClassOf [{:owl/onProperty     :dul/isDescribedBy,
                      :owl/someValuesFrom :dul/Plan,
                      :rdf/type           :owl/Restriction}
                     :dul/CollectiveAgent]})

(def InformationEntity
  "A piece of information, be it concretely realized or not. It is a catchall class, intended to bypass the ambiguities of many data or text that could denote either a an expression or a concrete realization of that expression. In a semiotic model, there is no special reason to distinguish between them, however we may want to distinguish between a pure information content (e.g. the 3rd Gymnopedie by Satie), and its possible concrete realizations as a music sheet, a piano execution, the reproduction of the execution, its publishing as a record, etc.)."
  {:db/ident :dul/InformationEntity,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A piece of information, be it concretely realized or not. It is a catchall class, intended to bypass the ambiguities of many data or text that could denote either a an expression or a concrete realization of that expression.\nIn a semiotic model, there is no special reason to distinguish between them, however we may want to distinguish between a pure information content (e.g. the 3rd Gymnopedie by Satie), and its possible concrete realizations as a music sheet, a piano execution, the reproduction of the execution, its publishing as a record, etc.).",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/subClassOf :dul/Entity})

(def InformationObject
  "A piece of information, such as a musical composition, a text, a word, a picture, independently from how it is concretely realized."
  {:db/ident :dul/InformationObject,
   :owl/disjointWith :dul/SocialAgent,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A piece of information, such as a musical composition, a text, a word, a picture, independently from how it is concretely realized.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Oggetto informativo"}
                {:rdf/language "en",
                 :rdf/value    "Information object"}],
   :rdfs/subClassOf [:dul/SocialObject :dul/InformationEntity]})

(def InformationRealization
  "A concrete realization of an InformationObject, e.g. the written document (object) containing the text of a law, a poetry reading (event), the dark timbre (quality) of a sound (event) in the execution (event) of a musical composition, realizing a 'misterioso' tempo indication. The realization of an information object also realizes information about itself. This is a special semiotic feature, which allows to avoid a traditonal paradox, by which an information is often supposed to be about itself besides other entities (e.g. the information object 'carpe diem' is about its meaning in Horace's Odes (let alone its fortune in Western culture and beyond), but also about its expression in context: 'dum loquimur, fugerit invida aetas: carpe diem, quam minimum credula postero', with the sound and emotional relations that it could activate. This is expressed in OWL2 with a local reflexivity axiom of the dul:InformationRealization class."
  {:db/ident :dul/InformationRealization,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A concrete realization of an InformationObject, e.g. the written document (object) containing the text of a law, a poetry reading (event), the dark timbre (quality) of a sound (event) in the execution (event) of a musical composition, realizing a 'misterioso' tempo indication.\n\nThe realization of an information object also realizes information about itself. This is a special semiotic feature, which allows to avoid a traditonal paradox, by which an information is often supposed to be about itself besides other entities (e.g. the information object 'carpe diem' is about its meaning in Horace's Odes (let alone its fortune in Western culture and beyond), but also about its expression in context: 'dum loquimur, fugerit invida aetas: carpe diem, quam minimum credula postero', with the sound and emotional relations that it could activate.\nThis is expressed in OWL2 with a local reflexivity axiom of the dul:InformationRealization class.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Informazione concreta"}
                {:rdf/language "en",
                 :rdf/value    "Information realization"}],
   :rdfs/subClassOf
   [{:owl/hasSelf    true,
     :owl/onProperty :dul/realizesSelfInformation,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :dul/realizes,
     :owl/someValuesFrom :dul/InformationObject,
     :rdf/type           :owl/Restriction}
    {:owl/unionOf [:dul/Event :dul/PhysicalObject :dul/Quality],
     :rdf/type    :owl/Class}
    :dul/InformationEntity]})

(def LocalConcept
  "A Concept that isDefinedIn exactly 1 Description. For example, the Concept 'coffee' in a 'preparesCoffee' relation can be defined in that relation, and for all other Description(s) that use it, the isConceptUsedIn property should be applied. Notice therefore that not necessarily all Concept(s) isDefinedIn exactly 1 Description."
  {:db/ident :dul/LocalConcept,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Concept that isDefinedIn exactly 1 Description. For example, the Concept 'coffee' in a 'preparesCoffee' relation can be defined in that relation, and for all other Description(s) that use it, the isConceptUsedIn property should be applied. Notice therefore that not necessarily all Concept(s) isDefinedIn exactly 1 Description.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Local concept"},
   :rdfs/subClassOf :dul/Concept})

(def Method
  "A method is a Description that defines or uses concepts in order to guide carrying out actions aimed at a solution with respect to a problem. It is different from a Plan, because plans could be carried out in order to follow a method, but a method can be followed by executing alternative plans."
  {:db/ident :dul/Method,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A method is a Description that defines or uses concepts in order to guide carrying out actions aimed at a solution with respect to a problem. \nIt is different from a Plan, because plans could be carried out in order to follow a method, but a method can be followed by executing alternative plans.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Metodo"}
                {:rdf/language "en",
                 :rdf/value    "Method"}],
   :rdfs/subClassOf :dul/Description})

(def Narrative
  "Narrative"
  {:db/ident         :dul/Narrative,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Narrative"},
   :rdfs/subClassOf  :dul/Description})

(def NaturalPerson
  "A person in the physical commonsense intuition: 'have you seen that person walking down the street?'"
  {:db/ident :dul/NaturalPerson,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A person in the physical commonsense intuition: 'have you seen that person walking down the street?'",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Persona fisica"}
                {:rdf/language "en",
                 :rdf/value    "Natural person"}],
   :rdfs/subClassOf [:dul/PhysicalAgent :dul/Person]})

(def Norm
  "A social norm."
  {:db/ident         :dul/Norm,
   :rdf/type         :owl/Class,
   :rdfs/comment     "A social norm.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label       [{:rdf/language "it",
                       :rdf/value    "Norma"}
                      {:rdf/language "en",
                       :rdf/value    "Norm"}],
   :rdfs/subClassOf  :dul/Description})

(def ObjectClass
  "Any physical, social, or mental object, or a substance. Following DOLCE Full, objects are always participating in some event (at least their own life), and are spatially located."
  {:db/ident :dul/Object,
   :owl/disjointWith :dul/Quality,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any physical, social, or mental object, or a substance. Following DOLCE Full, objects are always participating in some event (at least their own life), and are spatially located.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Oggetto"}
                {:rdf/language "en",
                 :rdf/value    "Object"}],
   :rdfs/subClassOf [:dul/Entity
                     {:owl/onProperty     :dul/hasLocation,
                      :owl/someValuesFrom :dul/Entity,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :dul/Object,
                      :owl/onProperty    :dul/hasConstituent,
                      :rdf/type          :owl/Restriction}
                     {:owl/onProperty     :dul/isParticipantIn,
                      :owl/someValuesFrom :dul/Event,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :dul/Role,
                      :owl/onProperty    :dul/isClassifiedBy,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :dul/Object,
                      :owl/onProperty    :dul/hasPart,
                      :rdf/type          :owl/Restriction}]})

(def ObjectAggregate
  "An aggregate of distributed objects, members of a same Collection, e.g. the stars in a constellation, the parts of a car, the employees of a company, the entries from an encyclopedia, the concepts expressed in a speech, etc. It cannot be defined by means of an equivalence axiom, because it'd require the same Collection for all members, an axiom that cannot be expressed in OWL."
  {:db/ident :dul/ObjectAggregate,
   :dc11/creator "Aldo Gangemi",
   :dc11/date #inst "2021-02-21T23:35:02.000-00:00",
   :rdf/type :owl/Class,
   :rdfs/comment
   "An aggregate of distributed objects, members of a same Collection, e.g. the stars in a constellation, the parts of a car, the employees of a company, the entries from an encyclopedia, the concepts expressed in a speech, etc.\nIt cannot be defined by means of an equivalence axiom, because it'd require the same Collection for all members, an axiom that cannot be expressed in OWL.",
   :rdfs/subClassOf {:owl/intersectionOf [:dul/Object
                                          {:owl/onProperty :dul/hasPart,
                                           :owl/someValuesFrom
                                           {:owl/intersectionOf
                                            [:dul/Object
                                             {:owl/onProperty :dul/isMemberOf,
                                              :owl/someValuesFrom
                                              :dul/Collection,
                                              :rdf/type :owl/Restriction}],
                                            :rdf/type :owl/Class},
                                           :rdf/type :owl/Restriction}],
                     :rdf/type :owl/Class}})

(def Organism
  "A physical objects with biological characteristics, typically that organisms can self-reproduce."
  {:db/ident :dul/Organism,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A physical objects with biological characteristics, typically that organisms can self-reproduce.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Organismo"}
                {:rdf/language "en",
                 :rdf/value    "Organism"}],
   :rdfs/subClassOf [:dul/PhysicalAgent :dul/BiologicalObject]})

(def Organization
  "An internally structured, conventionally created SocialAgent, needing a specific Role and Agent that plays it, in order to act."
  {:db/ident :dul/Organization,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "it",
     :rdf/value
     "Un agente sociale strutturato internamente e creato convenzionalmente. Per agire, ha bisogno di ruoli e agenti che li ricoprano."}
    {:rdf/language "en",
     :rdf/value
     "An internally structured, conventionally created SocialAgent, needing a specific Role and Agent that plays it, in order to act."}],
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Organizzazione"}
                {:rdf/language "en",
                 :rdf/value    "Organization"}],
   :rdfs/subClassOf :dul/SocialAgent})

(def Parameter
  "A Concept that classifies a Region; the difference between a Region and a Parameter is that regions represent sets of observable values, e.g. the height of a given building, while parameters represent constraints or selections on observable values, e.g. 'VeryHigh'. Therefore, parameters can also be used to constrain regions, e.g. VeryHigh on a subset of values of the Region Height applied to buildings, or to add an external selection criterion , such as measurement units, to regions, e.g. Meter on a subset of values from the Region Length applied to the Region Length applied to roads."
  {:db/ident :dul/Parameter,
   :owl/disjointWith :dul/Role,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Concept that classifies a Region; the difference between a Region and a Parameter is that regions represent sets of observable values, e.g. the height  of a given building, while parameters represent constraints or selections on observable values, e.g. 'VeryHigh'. Therefore, parameters can also be used to constrain regions, e.g. VeryHigh on a subset of values of the Region Height applied to buildings, or to add an external selection criterion , such as measurement units, to regions, e.g. Meter on a subset of values from the Region Length applied to the Region Length applied to roads.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Parametro"}
                {:rdf/language "en",
                 :rdf/value    "Parameter"}],
   :rdfs/subClassOf [{:owl/allValuesFrom :dul/Parameter,
                      :owl/onProperty    :dul/hasPart,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :dul/Region,
                      :owl/onProperty    :dul/classifies,
                      :rdf/type          :owl/Restriction}
                     :dul/Concept]})

(def Parthood
  "A special kind of Situation that allows to include time indexing for the hasPart relation in situations. For example, if a Situation s 'finally, my bike has a luggage rack' isSettingFor the entity 'my bike' and the TimeIntervals 'now', or more specifically '29March2021', we need to have a time-index the part relation. With Parthood, we use includesWhole and includesPart properties. This can be done similarly for other arguments of parthood, e.g. location, configuration, topology, etc. Concerning the possible property characteristics reused from mereology (transitivity, asymmetry, reflexivity), they need to be implemented by means of rules (or, in a limited way, property chains using the binary hasPart or hasProperPart properties). A key is also added to ensure identification constraints of time-indexed parthood."
  {:db/ident :dul/Parthood,
   :dc11/creator "Aldo Gangemi",
   :dc11/date #inst "2021-04-03T13:53:57.000-00:00",
   :owl/hasKey [:dul/includesPart :dul/includesWhole],
   :rdf/type :owl/Class,
   :rdfs/comment
   "A special kind of Situation that allows to include time indexing for the hasPart relation in situations. \nFor example, if a Situation s 'finally, my bike has a luggage rack' isSettingFor the entity 'my bike' and the TimeIntervals 'now', or more specifically '29March2021', we need to have a time-index the part relation. With Parthood, we use includesWhole and includesPart properties.\nThis can be done similarly for other arguments of parthood, e.g. location, configuration, topology, etc.\nConcerning the possible property characteristics reused from mereology (transitivity, asymmetry, reflexivity), they need to be implemented by means of rules (or, in a limited way, property chains using the binary hasPart or hasProperPart properties).\nA key is also added to ensure identification constraints of time-indexed parthood.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "parthood"},
   :rdfs/subClassOf [{:owl/onProperty     :dul/includesWhole,
                      :owl/someValuesFrom :dul/Entity,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :dul/includesPart,
                      :owl/someValuesFrom :dul/Entity,
                      :rdf/type           :owl/Restriction}
                     :dul/TimeIndexedRelation]})

(def Pattern
  "Any invariance detected from a dataset, or from observation; also, any invariance proposed based on top-down considerations. E.g. patterns detected and abstracted by an organism, by pattern recognition algorithms, by machine learning techniques, etc. An occurrence of a pattern is an 'observable', or detected Situation"
  {:db/ident :dul/Pattern,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any invariance detected from a dataset, or from observation; also, any invariance proposed based on top-down considerations.\nE.g. patterns detected and abstracted by an organism, by pattern recognition algorithms, by machine learning techniques, etc.\nAn occurrence of a pattern is an 'observable', or detected Situation",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Pattern"},
   :rdfs/subClassOf :dul/Relation})

(def Person
  "Persons in commonsense intuition, which does not apparently distinguish between either natural or social persons."
  {:db/ident :dul/Person,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Persons in commonsense intuition, which does not apparently distinguish between either natural or social persons.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label ["Persona {it}"
                {:rdf/language "en",
                 :rdf/value    "Person"}],
   :rdfs/subClassOf :dul/Agent})

(def Personification
  "A social entity with agentive features, but whose status is the result of a cultural transformation from e.g. a PhysicalObject, an Event, an Abstract, another SocialObject, etc. For example: the holy grail, deus ex machina, gods, magic wands, etc."
  {:db/ident :dul/Personification,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A social entity with agentive features, but whose status is the result of a cultural transformation from e.g. a PhysicalObject, an Event, an Abstract, another SocialObject, etc. For example: the holy grail, deus ex machina, gods, magic wands, etc.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personification"},
   :rdfs/subClassOf :dul/SocialAgent})

(def PhysicalAgent
  "A PhysicalObject that is capable of self-representing (conceptualizing) a Description in order to plan an Action. A PhysicalAgent is a substrate for (actsFor) a Social Agent"
  {:db/ident :dul/PhysicalAgent,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A PhysicalObject that is capable of self-representing (conceptualizing) a Description in order to plan an Action. \nA PhysicalAgent is a substrate for (actsFor) a Social Agent",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Physical agent"}
                {:rdf/language "it",
                 :rdf/value    "Agente fisico"}],
   :rdfs/subClassOf [:dul/PhysicalObject :dul/Agent]})

(def PhysicalArtifact
  "Any PhysicalObject that isDescribedBy a Plan . This axiomatization is weak, but allows to talk of artifacts in a very general sense, i.e. including recycled objects, objects with an intentional functional change, natural objects that are given a certain function, even though they are not modified or structurally designed, etc. PhysicalArtifact(s) are not considered disjoint from PhysicalBody(s), in order to allow a dual classification when needed. E.g., FunctionalSubstance(s) are included here as well. Immaterial (non-physical) artifacts (e.g. texts, ideas, cultural movements, corporations, communities, etc. can be modelled as social objects (see SocialObject), which are all 'artifactual' in the weak sense assumed here."
  {:db/ident :dul/PhysicalArtifact,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any PhysicalObject that isDescribedBy a Plan .\nThis axiomatization is weak, but allows to talk of artifacts in a very general sense, i.e. including recycled objects, objects with an intentional functional change, natural objects that are given a certain function, even though they are not modified or structurally designed, etc. PhysicalArtifact(s) are not considered disjoint from PhysicalBody(s), in order to allow a dual classification when needed. E.g.,\nFunctionalSubstance(s) are included here as well.\nImmaterial (non-physical) artifacts (e.g. texts, ideas, cultural movements, corporations, communities, etc. can be modelled as social objects (see SocialObject), which are all 'artifactual' in the weak sense assumed here.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Physical artifact"}
                {:rdf/language "it",
                 :rdf/value    "Artefatto fisico"}],
   :rdfs/subClassOf [{:owl/onProperty     :dul/isDescribedBy,
                      :owl/someValuesFrom :dul/Plan,
                      :rdf/type           :owl/Restriction}
                     :dul/PhysicalObject]})

(def PhysicalAttribute
  "Physical value of a physical object, e.g. density, color, etc."
  {:db/ident :dul/PhysicalAttribute,
   :owl/disjointWith [:dul/TimeInterval :dul/SpaceRegion],
   :rdf/type :owl/Class,
   :rdfs/comment
   "Physical value of a physical object, e.g. density, color, etc.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Physical attribute"}
                {:rdf/language "it",
                 :rdf/value    "Caratteristica fisica"}],
   :rdfs/subClassOf [{:owl/allValuesFrom :dul/PhysicalObject,
                      :owl/onProperty    :dul/isRegionFor,
                      :rdf/type          :owl/Restriction}
                     :dul/Region]})

(def PhysicalBody
  "Physical bodies are PhysicalObject(s), for which we tend to neutralize any possible artifactual character. They can have several granularity levels: geological, chemical, physical, biological, etc."
  {:db/ident :dul/PhysicalBody,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Physical bodies are PhysicalObject(s), for which we tend to neutralize any possible artifactual character. They can have several granularity levels: geological, chemical, physical, biological, etc.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Physical body"},
   :rdfs/subClassOf :dul/PhysicalObject})

(def PhysicalObject
  "Any Object that has a proper space region. The prototypical physical object has also an associated mass, but the nature of its mass can greatly vary based on the epistemological status of the object (scientifically measured, subjectively possible, imaginary)."
  {:db/ident :dul/PhysicalObject,
   :owl/disjointWith :dul/SocialObject,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any Object that has a proper space region. The prototypical physical object has also an associated mass, but the nature of its mass can greatly vary based on the epistemological status of the object (scientifically measured, subjectively possible, imaginary).",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Physical object"}
                {:rdf/language "it",
                 :rdf/value    "Oggetto fisico"}],
   :rdfs/subClassOf [{:owl/allValuesFrom :dul/PhysicalObject,
                      :owl/onProperty    :dul/hasPart,
                      :rdf/type          :owl/Restriction}
                     :dul/Object]})

(def PhysicalPlace
  "A physical object that is inherently located; for example, a water area."
  {:db/ident :dul/PhysicalPlace,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A physical object that is inherently located; for example, a water area.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Physical place"}
                {:rdf/language "it",
                 :rdf/value    "Luogo fisico"}],
   :rdfs/subClassOf :dul/PhysicalObject})

(def Place
  "Socially or cognitively dependent locations: political geographic entities (Rome, Lesotho), and non-material locations determined by the presence of other entities (\"the area close to Rome\") or of pivot events or signs (\"the area where the helicopter fell\"), as well as identified as complements to other entities (\"the area under the table\"), etc. In this generic sense, a Place is a 'dependent' location. For 'non-dependent' locations, cf. the PhysicalPlace class. For an abstract (dimensional) location, cf. the SpaceRegion class."
  {:db/ident :dul/Place,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Socially or cognitively dependent locations: political geographic entities (Rome, Lesotho), and non-material locations determined by the presence of other entities (\"the area close to Rome\") or of pivot events or signs (\"the area where the helicopter fell\"), as well as identified as complements to other entities (\"the area under the table\"), etc. \nIn this generic sense, a Place is a 'dependent' location. For 'non-dependent' locations, cf. the PhysicalPlace class. For an abstract (dimensional) location, cf. the SpaceRegion class.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Place"}
                {:rdf/language "it",
                 :rdf/value    "Luogo"}],
   :rdfs/subClassOf [{:owl/minCardinality 1,
                      :owl/onProperty     :dul/isLocationOf,
                      :rdf/type           :owl/Restriction}
                     :dul/SocialObject]})

(def Plan
  "A Description having an explicit Goal, to be achieved by executing the plan"
  {:db/ident :dul/Plan,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Description having an explicit Goal, to be achieved by executing the plan",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Plan"}
                {:rdf/language "it",
                 :rdf/value    "Piano"}],
   :rdfs/subClassOf [{:owl/onProperty     :dul/hasComponent,
                      :owl/someValuesFrom :dul/Goal,
                      :rdf/type           :owl/Restriction}
                     :dul/Description]})

(def PlanExecution
  "Plan executions are situations that proactively satisfy a plan. Subplan executions are proper parts of the whole plan execution."
  {:db/ident :dul/PlanExecution,
   :owl/equivalentClass {:owl/onProperty     :dul/satisfies,
                         :owl/someValuesFrom :dul/Plan,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/comment
   "Plan executions are situations that proactively satisfy a plan. Subplan executions are proper parts of the whole plan execution.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Plan execution"}
                {:rdf/language "it",
                 :rdf/value    "Esecuzione di piano"}],
   :rdfs/subClassOf :dul/Situation})

(def ProcessClass
  "This is a placeholder for events that are considered in their evolution, or anyway not strictly dependent on agents, tasks, and plans. See Event class for some thoughts on classifying events. See also 'Transition'."
  {:db/ident :dul/Process,
   :rdf/type :owl/Class,
   :rdfs/comment
   "This is a placeholder for events that are considered in their evolution, or anyway not strictly dependent on agents, tasks, and plans. \nSee Event class for some thoughts on classifying events. See also 'Transition'.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Processo"}
                {:rdf/language "en",
                 :rdf/value    "Process"}],
   :rdfs/subClassOf :dul/Event})

(def Project
  "A Plan that defines Role(s), Task(s), and a specific structure for tasks to be executed in relation to goals to be achieved, in order to achieve the main goal of the project. In other words, a project is a plan with a subgoal structure and multiple roles and tasks."
  {:db/ident :dul/Project,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Plan that defines Role(s), Task(s), and a specific structure for tasks to be executed in relation to goals to be achieved, in order to achieve the main goal of the project. In other words, a project is a plan with a subgoal structure and multiple roles and tasks.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Project"}
                {:rdf/language "it",
                 :rdf/value    "Progetto"}],
   :rdfs/subClassOf [{:owl/onProperty     :dul/definesTask,
                      :owl/someValuesFrom :dul/Task,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :dul/definesRole,
                      :owl/someValuesFrom :dul/Role,
                      :rdf/type           :owl/Restriction}
                     :dul/Plan]})

(def Quality
  "Any aspect of an Entity (but not a part of it), which cannot exist without that Entity. For example, the way the surface of a specific PhysicalObject looks like, or the specific light of a place at a certain time, are examples of Quality, while the encoding of a Quality into e.g. a PhysicalAttribute should be modeled as a Region. From the design viewpoint, the Quality-Region distinction is useful only when individual aspects of an Entity are considered in a domain of discourse. For example, in an automotive context, it would be irrelevant to consider the aspects of car windows for a specific car, unless the factory wants to check a specific window against design parameters (anomaly detection). On the other hand, in an antiques context, the individual aspects for a specific piece of furniture are a major focus of attention, and may constitute the actual added value, because the design parameters for old furniture are often not fixed, and may not be viewed as 'anomalies'."
  {:db/ident :dul/Quality,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any aspect of an Entity (but not a part of it), which cannot exist without that Entity. For example, the way the surface of a specific PhysicalObject looks like, or the specific light of a place at a certain time, are examples of Quality, while the encoding of a Quality into e.g. a PhysicalAttribute should be modeled as a Region. \nFrom the design viewpoint, the Quality-Region distinction is useful only when individual aspects of an Entity are considered in a domain of discourse. \nFor example, in an automotive context, it would be irrelevant to consider the aspects of car windows for a specific car, unless the factory wants to check a specific window against design parameters (anomaly detection). \nOn the other hand, in an antiques context, the individual aspects for a specific piece of furniture are a major focus of attention, and may constitute the actual added value, because the design parameters for old furniture are often not fixed, and may not be viewed as 'anomalies'.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Qualità"}
                {:rdf/language "en",
                 :rdf/value    "Quality"}],
   :rdfs/subClassOf [{:owl/allValuesFrom :dul/Quality,
                      :owl/onProperty    :dul/hasPart,
                      :rdf/type          :owl/Restriction}
                     :dul/Entity
                     {:owl/onProperty     :dul/isQualityOf,
                      :owl/someValuesFrom :dul/Entity,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :dul/hasRegion,
                      :owl/someValuesFrom :dul/Region,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :dul/Quality,
                      :owl/onProperty    :dul/hasConstituent,
                      :rdf/type          :owl/Restriction}]})

(def Region
  "Any region in a dimensional space (a dimensional space is a maximal Region), which can be used as a value for a quality of an Entity . For example, TimeInterval, SpaceRegion, PhysicalAttribute, Amount, SocialAttribute are all subclasses of Region. Regions are not data values in the ordinary knowledge representation sense; in order to get patterns for modelling data, see the properties: representsDataValue and hasDataValue"
  {:db/ident :dul/Region,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any region in a dimensional space (a dimensional space is a maximal Region), which can be used as a value for a quality of an Entity . For example, TimeInterval, SpaceRegion, PhysicalAttribute, Amount, SocialAttribute are all subclasses of Region. \nRegions are not data values in the ordinary knowledge representation sense; in order to get patterns for modelling data, see the properties: representsDataValue and hasDataValue",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Regione"}
                {:rdf/language "en",
                 :rdf/value    "Region"}],
   :rdfs/subClassOf [{:owl/allValuesFrom :dul/Region,
                      :owl/onProperty    :dul/hasPart,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :dul/Region,
                      :owl/onProperty    :dul/precedes,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :dul/Region,
                      :owl/onProperty    :dul/hasConstituent,
                      :rdf/type          :owl/Restriction}
                     :dul/Abstract
                     {:owl/allValuesFrom :dul/Region,
                      :owl/onProperty    :dul/overlaps,
                      :rdf/type          :owl/Restriction}]})

(def Relation
  "Relations are descriptions that can be considered as the counterpart of formal relations (that are included in the FormalEntity class). For example, 'givingGrantToInstitution(x,y,z)' with three argument types: Provider(x),Grant(y),Recipient(z), can have a Relation counterpart: 'GivingGrantToInstitution', which defines three Concept instances: Provider,Grant,Recipient. Since social objects are not formal entities, Relation includes here any 'relation-like' entity in common sense, including social relations."
  {:db/ident :dul/Relation,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Relations are descriptions that can be considered as the counterpart of formal relations (that are included in the FormalEntity class).\nFor example, 'givingGrantToInstitution(x,y,z)' with three argument types: Provider(x),Grant(y),Recipient(z), can have a Relation counterpart: 'GivingGrantToInstitution', which defines three Concept instances: Provider,Grant,Recipient.\nSince social objects are not formal entities, Relation includes here any 'relation-like' entity in common sense, including social relations.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Relazione"}
                {:rdf/language "en",
                 :rdf/value    "Relation"}],
   :rdfs/subClassOf :dul/Description})

(def Right
  "A legal position by which an Agent is entitled to obtain something from another Agent , under specified circumstances, through an enforcement explicited either in a Law, Contract , etc."
  {:db/ident :dul/Right,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A legal position by which an Agent is entitled to obtain something from another Agent , under specified circumstances, through an enforcement explicited either in a Law, Contract , etc.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Right"}
                {:rdf/language "it",
                 :rdf/value    "Diritto"}],
   :rdfs/subClassOf [{:owl/minCardinality 1,
                      :owl/onProperty     :dul/definesTask,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality 2,
                      :owl/onProperty     :dul/definesRole,
                      :rdf/type           :owl/Restriction}
                     :dul/Description]})

(def Role
  "A Concept that classifies an Object"
  {:db/ident         :dul/Role,
   :rdf/type         :owl/Class,
   :rdfs/comment     "A Concept that classifies an Object",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label       [{:rdf/language "it",
                       :rdf/value    "Ruolo"}
                      {:rdf/language "en",
                       :rdf/value    "Role"}],
   :rdfs/subClassOf  [{:owl/allValuesFrom :dul/Role,
                       :owl/onProperty    :dul/hasPart,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :dul/Object,
                       :owl/onProperty    :dul/classifies,
                       :rdf/type          :owl/Restriction}
                      :dul/Concept]})

(def Set
  "Set"
  {:db/ident         :dul/Set,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "Set"}
                      "Insieme {it}"],
   :rdfs/subClassOf  :dul/FormalEntity})

(def Situation
  "A view, consistent with ('satisfying') a Description, on a set of entities. It can also be seen as a 'relational context' created by an observer on the basis of a 'frame' (i.e. a Description). For example, a PlanExecution is a context including some actions executed by agents according to certain parameters and expected tasks to be achieved from a Plan; a DiagnosedSituation is a context of observed entities that is interpreted on the basis of a Diagnosis, etc. Situation is also able to represent reified n-ary relations, where isSettingFor is the top-level relation for all binary projections of the n-ary relation. If used in a transformation pattern for n-ary relations, the designer should take care of adding (some or all) OWL2 keys, corresponding to binary projections of the n-ary, to a subclass of Situation. Otherwise the 'identification constraint' (Calvanese et al., IJCAI 2001) might be violated."
  {:db/ident :dul/Situation,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A view, consistent with ('satisfying') a Description, on a set of entities. \nIt can also be seen as a 'relational context' created by an observer on the basis of a 'frame' (i.e. a Description). \nFor example, a PlanExecution is a context including some actions executed by agents according to certain parameters and expected tasks to be achieved from a Plan; a DiagnosedSituation is a context of observed entities that is interpreted on the basis of a Diagnosis, etc.\nSituation is also able to represent reified n-ary relations, where isSettingFor is the top-level relation for all binary projections of the n-ary relation. \nIf used in a transformation pattern for n-ary relations, the designer should take care of adding (some or all) OWL2 keys, corresponding to binary projections of the n-ary, to a subclass of Situation. Otherwise the 'identification constraint' (Calvanese et al., IJCAI 2001) might be violated.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Situazione"}
                {:rdf/language "en",
                 :rdf/value    "Situation"}],
   :rdfs/subClassOf [{:owl/onProperty     :dul/satisfies,
                      :owl/someValuesFrom :dul/Description,
                      :rdf/type           :owl/Restriction}
                     :dul/Entity]})

(def SocialAgent
  "Any individual whose existence is granted simply by its social communicability and capability of action (through some PhysicalAgent)."
  {:db/ident :dul/SocialAgent,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any individual whose existence is granted simply by its social communicability and capability of action (through some PhysicalAgent).",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Social agent"}
                {:rdf/language "it",
                 :rdf/value    "Agente sociale"}],
   :rdfs/subClassOf [{:owl/onProperty     :dul/actsThrough,
                      :owl/someValuesFrom :dul/PhysicalAgent,
                      :rdf/type           :owl/Restriction}
                     :dul/SocialObject
                     :dul/Agent]})

(def SocialObject
  "Any Object that exists only within some communication Event, in which at least one PhysicalObject participates in. In other words, all objects that have been or are created in the process of social communication: for the sake of communication (InformationObject), for incorporating new individuals (SocialAgent, Place), for contextualizing or intepreting existing entities (Description, Concept), or for collecting existing entities (Collection). Being dependent on communication, all social objects need to be expressed by some information object (information objects are self-expressing)."
  {:db/ident :dul/SocialObject,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any Object that exists only within some communication Event, in which at least one PhysicalObject participates in. \nIn other words, all objects that have been or are created in the process of social communication: for the sake of communication (InformationObject), for incorporating new individuals (SocialAgent, Place), for contextualizing or intepreting existing entities (Description, Concept), or for collecting existing entities (Collection).\nBeing dependent on communication, all social objects need to be expressed by some information object (information objects are self-expressing).",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Social object"}
                {:rdf/language "it",
                 :rdf/value    "Oggetto sociale"}],
   :rdfs/subClassOf [{:owl/allValuesFrom :dul/SocialObject,
                      :owl/onProperty    :dul/hasPart,
                      :rdf/type          :owl/Restriction}
                     {:owl/onProperty     :dul/isExpressedBy,
                      :owl/someValuesFrom :dul/InformationObject,
                      :rdf/type           :owl/Restriction}
                     :dul/Object]})

(def SocialObjectAttribute
  "Any Region in a dimensional space that is used to represent some characteristic of a SocialObject, e.g. judgment values, social scalars, statistical attributes over a collection of entities, etc."
  {:db/ident :dul/SocialObjectAttribute,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any Region in a dimensional space that is used to represent some characteristic of a SocialObject, e.g. judgment values, social scalars, statistical attributes over a collection of entities, etc.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Social attribute"}
                {:rdf/language "it",
                 :rdf/value    "Caratteristica sociale"}],
   :rdfs/subClassOf [{:owl/allValuesFrom :dul/SocialObject,
                      :owl/onProperty    :dul/isRegionFor,
                      :rdf/type          :owl/Restriction}
                     :dul/Region]})

(def SocialPerson
  "A SocialAgent that needs the existence of a specific NaturalPerson in order to act (but the lifetime of the NaturalPerson has only to overlap that of the SocialPerson)."
  {:db/ident :dul/SocialPerson,
   :owl/versionInfo
   "Formerly: Person (changed to avoid confusion with commonsense intuition)",
   :rdf/type :owl/Class,
   :rdfs/comment
   "A SocialAgent that needs the existence of a specific NaturalPerson in order to act (but the lifetime of the NaturalPerson has only to overlap that of the SocialPerson).",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Social person"}
                {:rdf/language "it",
                 :rdf/value    "Persona sociale"}],
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :dul/actsThrough,
                      :rdf/type        :owl/Restriction}
                     :dul/SocialAgent
                     :dul/Person]})

(def SocialRelation
  "Any social relationship"
  {:db/ident         :dul/SocialRelation,
   :rdf/type         :owl/Class,
   :rdfs/comment     "Any social relationship",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label       [{:rdf/language "en",
                       :rdf/value    "Social relation"}
                      {:rdf/language "it",
                       :rdf/value    "Relazione sociale"}],
   :rdfs/subClassOf  :dul/Relation})

(def SpaceRegion
  "Any Region in a dimensional space that is used to localize an Entity ; i.e., it is not used to represent some characteristic (e.g. it excludes time intervals, colors, size values, judgment values, etc.). Differently from a Place , a space region has a specific dimensional space."
  {:db/ident :dul/SpaceRegion,
   :owl/disjointWith :dul/TimeInterval,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any Region in a dimensional space that is used to localize an Entity ; i.e., it is not used to represent some characteristic (e.g. it excludes time intervals, colors, size values, judgment values, etc.). Differently from a Place , a space region has a specific dimensional space.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Space region"}
                {:rdf/language "it",
                 :rdf/value    "Regione di spazio"}],
   :rdfs/subClassOf :dul/Region})

(def SpatioTemporalRegion
  {:db/ident         :dul/SpatioTemporalRegion,
   :rdf/type         :owl/Class,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/subClassOf  [{:owl/onProperty     :dul/hasConstituent,
                       :owl/someValuesFrom :dul/TimeInterval,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :dul/hasConstituent,
                       :owl/someValuesFrom :dul/SpaceRegion,
                       :rdf/type           :owl/Restriction}
                      :dul/Region]})

(def Substance
  "Any PhysicalBody that has not necessarily specified (designed) boundaries, e.g. a pile of trash, some sand, etc. In this sense, an artistic object made of trash or a dose of medicine in the form of a pill would be a FunctionalSubstance, and a DesignedArtifact, since its boundaries are specified by a Design; aleatoric objects that are outcomes of an artistic process might be still considered DesignedArtifact(s), and Substance(s)."
  {:db/ident :dul/Substance,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any PhysicalBody that has not necessarily specified (designed) boundaries, e.g. a pile of trash, some sand, etc. \nIn this sense, an artistic object made of trash or a dose of medicine in the form of a pill would be a FunctionalSubstance, and a DesignedArtifact, since its boundaries are specified by a Design; aleatoric objects that are outcomes of an artistic process might be still considered DesignedArtifact(s), and Substance(s).",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Substance"}
                {:rdf/language "it",
                 :rdf/value    "Sostanza"}],
   :rdfs/subClassOf :dul/PhysicalBody})

(def Task
  "An EventType that classifies an Action to be executed. For example, reaching a destination is a task that can be executed by performing certain actions, e.g. driving a car, buying a train ticket, etc. The actions to execute a task can also be organized according to a Plan that is not the same as the one that defines the task (if any). For example, reaching a destination could be defined by a plan to get on holidays, while the plan to execute the task can consist of putting some travels into a sequence."
  {:db/ident :dul/Task,
   :rdf/type :owl/Class,
   :rdfs/comment
   "An EventType that classifies an Action to be executed. \nFor example, reaching a destination is a task that can be executed by performing certain actions, e.g. driving a car, buying a train ticket, etc. \nThe actions to execute a task can also be organized according to a Plan that is not the same as the one that defines the task (if any). \nFor example, reaching a destination could be defined by a plan to get on holidays, while the plan to execute the task can consist of putting some travels into a sequence.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Task"}
                {:rdf/language "it",
                 :rdf/value    "Task"}],
   :rdfs/subClassOf [:dul/EventType
                     {:owl/allValuesFrom :dul/Action,
                      :owl/onProperty    :dul/isExecutedIn,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :dul/Role,
                      :owl/onProperty    :dul/isTaskOf,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :dul/Task,
                      :owl/onProperty    :dul/hasPart,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :dul/Description,
                      :owl/onProperty    :dul/isTaskDefinedIn,
                      :rdf/type          :owl/Restriction}]})

(def Theory
  "A Theory is a Description that represents a set of assumptions for describing something, usually general. Scientific, philosophical, and commonsense theories can be included here. This class can also be used to act as 'naturalized reifications' of logical theories (of course, they will be necessarily incomplete in this case, because second-order entities are represented as first-order ones)."
  {:db/ident :dul/Theory,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Theory is a Description that represents a set of assumptions for describing something, usually general. Scientific, philosophical, and commonsense theories can be included here.\nThis class can also be used to act as 'naturalized reifications' of logical theories (of course, they will be necessarily incomplete in this case, because second-order entities are represented as first-order ones).",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Theory"}
                {:rdf/language "it",
                 :rdf/value    "Teoria"}],
   :rdfs/subClassOf [{:owl/onProperty     :dul/hasComponent,
                      :owl/someValuesFrom :dul/Relation,
                      :rdf/type           :owl/Restriction}
                     :dul/Description]})

(def TimeIndexedRelation
  "A Situation that includes a time indexing in its setting, so allowing to order any binary relation (property) with time."
  {:db/ident :dul/TimeIndexedRelation,
   :dc11/creator "Aldo Gangemi",
   :dc11/date #inst "2021-02-24T14:24:23.000-00:00",
   :owl/equivalentClass {:owl/intersectionOf
                         [:dul/Situation
                          {:owl/onProperty     :dul/isSettingFor,
                           :owl/someValuesFrom :dul/TimeInterval,
                           :rdf/type           :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Situation that includes a time indexing in its setting, so allowing to order any binary relation (property) with time.",
   :rdfs/subClassOf :dul/Situation})

(def TimeInterval
  "Any Region in a dimensional space that aims at representing time."
  {:db/ident :dul/TimeInterval,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any Region in a dimensional space that aims at representing time.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Time interval"}
                {:rdf/language "it",
                 :rdf/value    "Intervallo di tempo"}],
   :rdfs/subClassOf :dul/Region})

(def Transition
  "A transition is a Situation that creates a context for three TimeInterval(s), two additional different Situation(s), one Event, one Process, and at least one Object: the Event is observed as the cause for the transition, one Situation is the state before the transition, the second Situation is the state after the transition, the Process is the invariance under some different transitions (including the one represented here), in which at least one Object is situated. Finally, the time intervals position the situations and the transitional event in time. This class of situations partly encodes the ontology underlying typical engineering algebras for processes, e.g. Petri Nets. A full representation of the transition ontology is outside the expressivity of OWL, because we would need qualified cardinality restrictions, coreference, property equivalence, and property composition."
  {:db/ident :dul/Transition,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A transition is a Situation that creates a context for three TimeInterval(s), two additional different Situation(s), one Event, one Process, and at least one Object: the Event is observed as the cause for the transition, one Situation is the state before the transition, the second Situation is the state after the transition, the Process is the invariance under some different transitions (including the one represented here), in which at least one Object is situated. Finally, the time intervals position the situations and the transitional event in time.\nThis class of situations partly encodes the ontology underlying typical engineering algebras for processes, e.g. Petri Nets. \nA full representation of the transition ontology is outside the expressivity of OWL, because we would need qualified cardinality restrictions,  coreference, property equivalence, and property composition.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Transition"}
                {:rdf/language "it",
                 :rdf/value    "Transizione"}],
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 3,
                      :owl/onClass    :dul/TimeInterval,
                      :owl/onProperty :dul/includesTime,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :dul/includesEvent,
                      :owl/someValuesFrom :dul/Event,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :dul/isSettingFor,
                      :owl/someValuesFrom :dul/Process,
                      :rdf/type           :owl/Restriction}
                     :dul/Situation
                     {:owl/onProperty     :dul/isSettingFor,
                      :owl/someValuesFrom {:owl/intersectionOf
                                           [:dul/Situation
                                            {:owl/onProperty :dul/precedes,
                                             :owl/someValuesFrom
                                             {:owl/intersectionOf
                                              [:dul/Event
                                               {:owl/onProperty :dul/precedes,
                                                :owl/someValuesFrom
                                                :dul/Situation,
                                                :rdf/type :owl/Restriction}],
                                              :rdf/type :owl/Class},
                                             :rdf/type :owl/Restriction}],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 2,
                      :owl/onClass    :dul/Situation,
                      :owl/onProperty :dul/isSettingFor,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :dul/includesObject,
                      :owl/someValuesFrom :dul/Object,
                      :rdf/type           :owl/Restriction}]})

(def TypeCollection
  "A Collection whose members are the maximal set of individuals that share the same (named) type, e.g. \"the gem stones\", \"the Italians\". This class is very useful to apply a variety of the so-called \"ClassesAsValues\" design pattern, when it is used to talk about the extensional aspect of a class. An alternative variety of the pattern applies to the intensional aspect of a class, and the class Concept should be used instead."
  {:db/ident :dul/TypeCollection,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Collection whose members are the maximal set of individuals that share the same (named) type, e.g. \"the gem stones\", \"the Italians\".\nThis class is very useful to apply a variety of the so-called \"ClassesAsValues\" design pattern, when it is used to talk about the extensional aspect of a class. An alternative variety of the pattern applies to the intensional aspect of a class, and the class Concept should be used instead.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Type collection"}
                {:rdf/language "it",
                 :rdf/value    "Collezione di un tipo"}],
   :rdfs/subClassOf :dul/Collection})

(def UnitOfMeasure
  "Units of measure are conceptualized here as parameters on regions, which can be valued as datatype values."
  {:db/ident :dul/UnitOfMeasure,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Units of measure are conceptualized here as parameters on regions, which can be valued as datatype values.",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Unità di misura"}
                {:rdf/language "en",
                 :rdf/value    "Unit of measure"}],
   :rdfs/subClassOf [{:owl/onProperty     :dul/parametrizes,
                      :owl/someValuesFrom :dul/Region,
                      :rdf/type           :owl/Restriction}
                     :dul/Parameter]})

(def Workflow
  "A Plan that defines Role(s), Task(s), and a specific structure for tasks to be executed, usually supporting the work of an Organization"
  {:db/ident :dul/Workflow,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A Plan that defines Role(s), Task(s), and a specific structure for tasks to be executed, usually supporting the work of an Organization",
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Workflow"}
                {:rdf/language "en",
                 :rdf/value    "Workflow"}],
   :rdfs/subClassOf [{:owl/onProperty     :dul/definesTask,
                      :owl/someValuesFrom :dul/Task,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :dul/definesRole,
                      :owl/someValuesFrom :dul/Role,
                      :rdf/type           :owl/Restriction}
                     :dul/Plan]})

(def WorkflowExecution
  "Workflow execution"
  {:db/ident            :dul/WorkflowExecution,
   :owl/equivalentClass {:owl/onProperty     :dul/satisfies,
                         :owl/someValuesFrom :dul/Workflow,
                         :rdf/type           :owl/Restriction},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label          [{:rdf/language "en",
                          :rdf/value    "Workflow execution"}
                         {:rdf/language "it",
                          :rdf/value    "Esecuzione di workflow"}],
   :rdfs/subClassOf     :dul/Situation})

(def actsFor
  "The relation holding between any Agent, and a SocialAgent. In principle, a SocialAgent requires at least one PhysicalAgent in order to act, but this dependency can be 'delegated'; e.g. a university can be acted for by a department, which on its turm is acted for by physical agents."
  {:db/ident :dul/actsFor,
   :owl/inverseOf :dul/actsThrough,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The relation holding between any Agent, and a SocialAgent. In principle, a SocialAgent requires at least one PhysicalAgent in order to act, but this dependency can be 'delegated'; e.g. a university can be acted for by a department, which on its turm is acted for by physical agents.",
   :rdfs/domain :dul/Agent,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "agisce per"}
                {:rdf/language "en",
                 :rdf/value    "acts for"}],
   :rdfs/range :dul/SocialAgent,
   :rdfs/subPropertyOf :dul/associatedWith})

(def actsThrough
  "The relation holding between a PhysicalAgent and a SocialAgent. In principle, a SocialAgent requires at least one PhysicalAgent in order to act, but this dependency can be 'delegated', e.g. a university can be acted for by a department, which is acted for by physical agents. AKA isActedBy"
  {:db/ident :dul/actsThrough,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The relation holding between a PhysicalAgent and a SocialAgent. In principle, a SocialAgent requires at least one PhysicalAgent in order to act, but this dependency can be 'delegated', e.g. a university can be acted for by a department, which is acted for by physical agents. AKA isActedBy",
   :rdfs/domain :dul/SocialAgent,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "agisce mediante"}
                {:rdf/language "en",
                 :rdf/value    "acts through"}],
   :rdfs/range :dul/Agent,
   :rdfs/subPropertyOf :dul/associatedWith})

(def associatedWith
  "A catch-all object property, useful for alignment and querying purposes. It is declared as both transitive and symmetric, in order to reason an a maximal closure of associations between individuals."
  {:db/ident :dul/associatedWith,
   :owl/inverseOf :dul/associatedWith,
   :rdf/type
   [:owl/TransitiveProperty :owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/comment
   "A catch-all object property, useful for alignment and querying purposes.\nIt is declared as both transitive and symmetric, in order to reason an a maximal closure of associations between individuals.",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label "associatedWith",
   :rdfs/range :dul/Entity})

(def characterizes
  "A relation between concepts and collections, where a Concept is said to characterize a Collection; it corresponds to a link between the (reified) intensional and extensional interpretations of a _proper subset of_ a (reified) class. This is different from covers, because it refers to an interpretation the entire reified class. E.g. the collection of vintage saxophones is characterized by the Concept 'manufactured by hand', while it gets covered by the Concept 'Saxophone' with the Parameter 'Vintage'."
  {:db/ident :dul/characterizes,
   :owl/inverseOf :dul/isCharacterizedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between concepts and collections, where a Concept is said to characterize a Collection; it corresponds to a link between the (reified) intensional and extensional interpretations of a _proper subset of_ a (reified) class. This is different from covers, because it refers to an interpretation the entire reified class.\nE.g. the collection of vintage saxophones is characterized by the Concept 'manufactured by hand', while it gets covered by the Concept 'Saxophone' with the Parameter 'Vintage'.",
   :rdfs/domain :dul/Concept,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "characterizes"}
                {:rdf/language "it",
                 :rdf/value    "caratterizza"}],
   :rdfs/range :dul/Collection,
   :rdfs/subPropertyOf :dul/associatedWith})

(def classifies
  "A relation between a Concept and an Entity, e.g. the Role 'student' classifies a Person 'John'."
  {:db/ident :dul/classifies,
   :owl/inverseOf :dul/isClassifiedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between a Concept and an Entity, e.g. the Role 'student' classifies a Person 'John'.",
   :rdfs/domain :dul/Concept,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "classifies"}
                {:rdf/language "it",
                 :rdf/value    "classifica"}],
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/associatedWith})

(def conceptualizes
  "A relation stating that an Agent is internally representing a SocialObject: situations, descriptions, concepts, etc. E.g., 'John believes in the conspiracy theory'; 'Niels Bohr created the solar-system metaphor for the atomic theory'; 'Jacques assumes all swans are white'; 'the task force members share the attack plan'. Conceptualizations can be distinguished into different forms, primarily based on the type of SocialObject that is conceptualized. Descriptions and concepts can be 'assumed', situations can be 'believed' or 'known', plans can be 'adopted', etc. (see ontology: http://www.ontologydesignpatterns.org/ont/dul/Conceptualization.owl."
  {:db/ident :dul/conceptualizes,
   :owl/inverseOf :dul/isConceptualizedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation stating that an Agent is internally representing a SocialObject: situations, descriptions, concepts, etc. E.g., 'John believes in the conspiracy theory'; 'Niels Bohr created the solar-system metaphor for the atomic theory'; 'Jacques assumes all swans are white'; 'the task force members share the attack plan'.\nConceptualizations can be distinguished into different forms, primarily based on the type of SocialObject that is conceptualized. Descriptions and concepts can be 'assumed', situations can be 'believed' or 'known', plans can be 'adopted', etc. (see ontology: http://www.ontologydesignpatterns.org/ont/dul/Conceptualization.owl.",
   :rdfs/domain :dul/Agent,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "concettualizza"}
                {:rdf/language "en",
                 :rdf/value    "conceptualizes"}],
   :rdfs/range :dul/SocialObject,
   :rdfs/subPropertyOf :dul/associatedWith})

(def concretelyExpresses
  "A relation between an InformationRealization and a Description, e.g. 'the printout of the Italian Constitution concretelyExpresses the Italian Constitution'. It should be supplied also with a rule stating that the InformationRealization realizes an InformationObject that expresses the Description"
  {:db/ident :dul/concretelyExpresses,
   :owl/inverseOf :dul/isConcretelyExpressedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between an InformationRealization and a Description, e.g. 'the printout of the Italian Constitution concretelyExpresses the Italian Constitution'. It should be supplied also with a rule stating that the InformationRealization realizes an InformationObject that expresses the Description",
   :rdfs/domain :dul/InformationRealization,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "esprime concretamente"}
                {:rdf/language "en",
                 :rdf/value    "concretely expresses"}],
   :rdfs/range :dul/SocialObject,
   :rdfs/subPropertyOf :dul/associatedWith})

(def coparticipatesWith
  "A relation between two objects participating in a same Event; e.g., 'Vitas and Jimmy are playing tennis'."
  {:db/ident :dul/coparticipatesWith,
   :owl/inverseOf :dul/coparticipatesWith,
   :owl/propertyChainAxiom [:dul/isParticipantIn :dul/hasParticipant],
   :rdf/type [:owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/comment
   "A relation between two objects participating in a same Event; e.g., 'Vitas and Jimmy are playing tennis'.",
   :rdfs/domain :dul/Object,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "co-participates with"}
                {:rdf/language "it",
                 :rdf/value    "copartecipa con"}],
   :rdfs/range :dul/Object,
   :rdfs/subPropertyOf :dul/associatedWith})

(def covers
  "A relation between concepts and collections, where a Concept is said to cover a Collection; it corresponds to a link between the (reified) intensional and extensional interpretations of a (reified) class. E.g. the collection of vintage saxophones is covered by the Concept 'Saxophone' with the Parameter 'Vintage'."
  {:db/ident :dul/covers,
   :owl/inverseOf :dul/isCoveredBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between concepts and collections, where a Concept is said to cover a Collection; it corresponds to a link between the (reified) intensional and extensional interpretations of a (reified) class.\nE.g. the collection of vintage saxophones is covered by the Concept 'Saxophone' with the Parameter 'Vintage'.",
   :rdfs/domain :dul/Concept,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "ricopre"}
                {:rdf/language "en",
                 :rdf/value    "covers"}],
   :rdfs/range :dul/Collection,
   :rdfs/subPropertyOf :dul/associatedWith})

(def defines
  "A relation between a Description and a Concept, e.g. a Workflow for a governmental Organization defines the Role 'officer', or 'the Italian Traffic Law defines the role Vehicle'."
  {:db/ident :dul/defines,
   :owl/inverseOf :dul/isDefinedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between a Description and a Concept, e.g. a Workflow for a governmental Organization defines the Role 'officer', or 'the Italian Traffic Law defines the role Vehicle'.",
   :rdfs/domain :dul/Description,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "definisce"}
                {:rdf/language "en",
                 :rdf/value    "defines"}],
   :rdfs/range :dul/Concept,
   :rdfs/subPropertyOf :dul/usesConcept})

(def definesRole
  "A relation between a description and a role, e.g. the recipe for a cake defines the role 'ingredient'."
  {:db/ident :dul/definesRole,
   :owl/inverseOf :dul/isRoleDefinedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between a description and a role, e.g. the recipe for a cake defines the role 'ingredient'.",
   :rdfs/domain :dul/Description,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "definisce il ruolo"}
                {:rdf/language "en",
                 :rdf/value    "defines role"}],
   :rdfs/range :dul/Role,
   :rdfs/subPropertyOf :dul/defines})

(def definesTask
  "A relation between a description and a task, e.g. the recipe for a cake defines the task 'boil'."
  {:db/ident :dul/definesTask,
   :owl/inverseOf :dul/isTaskDefinedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between a description and a task, e.g. the recipe for a cake defines the task 'boil'.",
   :rdfs/domain :dul/Description,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "definisce il task"}
                {:rdf/language "en",
                 :rdf/value    "defines task"}],
   :rdfs/range :dul/Task,
   :rdfs/subPropertyOf :dul/defines})

(def describes
  "The relation between a Description and an Entity : a Description gives a unity to a Collection of parts (the components), or constituents, by assigning a Role to each of them in the context of a whole Object (the system). A same Entity can be given different descriptions, for example, an old cradle can be given a unifying Description based on the original aesthetic design, the functionality it was built for, or a new aesthetic functionality in which it can be used as a flower pot."
  {:db/ident :dul/describes,
   :owl/inverseOf :dul/isDescribedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The relation between a Description and an Entity : a Description gives a unity to a Collection of parts (the components), or constituents, by assigning a Role to each of them in the context of a whole Object (the system).\nA same Entity can be given different descriptions, for example, an old cradle can be given a unifying Description based on the original aesthetic design, the functionality it was built for, or a new aesthetic functionality in which it can be used as a flower pot.",
   :rdfs/domain :dul/Description,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "descrive"}
                {:rdf/language "en",
                 :rdf/value    "describes"}],
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/associatedWith})

(def directlyFollows
  "The intransitive follows relation. For example, Wednesday directly precedes Thursday. Directness of precedence depends on the designer conceptualization."
  {:db/ident :dul/directlyFollows,
   :owl/inverseOf :dul/directlyPrecedes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The intransitive follows relation. For example, Wednesday directly precedes Thursday. Directness of precedence depends on the designer conceptualization.",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "segue direttamente"}
                {:rdf/language "en",
                 :rdf/value    "directly follows"}],
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/follows})

(def directlyPrecedes
  "The intransitive precedes relation. For example, Monday directly precedes Tuesday. Directness of precedence depends on the designer conceptualization."
  {:db/ident :dul/directlyPrecedes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The intransitive precedes relation. For example, Monday directly precedes Tuesday. Directness of precedence depends on the designer conceptualization.",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "precede direttamente"}
                {:rdf/language "en",
                 :rdf/value    "directly precedes"}],
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/precedes})

(def executesTask
  "A relation between an action and a task, e.g. 'putting some water in a pot and putting the pot on a fire until the water starts bubbling' executes the task 'boiling'."
  {:db/ident :dul/executesTask,
   :owl/inverseOf :dul/isExecutedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between an action and a task, e.g. 'putting some water in a pot and putting the pot on a fire until the water starts bubbling' executes the task 'boiling'.",
   :rdfs/domain :dul/Action,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "executes task"}
                {:rdf/language "it",
                 :rdf/value    "esegue il task"}],
   :rdfs/range :dul/Task,
   :rdfs/subPropertyOf :dul/isClassifiedBy})

(def expands
  "A partial order relation that holds between descriptions. It represents the proper part relation between a description and another description featuring the same properties as the former, with at least one additional one. Descriptions can be expanded either by adding other descriptions as parts, or by refining concepts that are used by them. An 'intention' to expand must be present (unless purely formal theories are considered, but even in this case a criterion of relevance is usually active)."
  {:db/ident :dul/expands,
   :owl/inverseOf :dul/isExpandedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A partial order relation that holds between descriptions. It represents the proper part relation between a description and another description featuring the same properties as the former, with at least one additional one.\nDescriptions can be expanded either by adding other descriptions as parts, or by refining concepts that are used by them. \nAn 'intention' to expand must be present (unless purely formal theories are considered, but even in this case a criterion of relevance is usually active).",
   :rdfs/domain :dul/Description,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "expands"}
                {:rdf/language "it",
                 :rdf/value    "espande"}],
   :rdfs/range :dul/Description,
   :rdfs/subPropertyOf :dul/isRelatedToDescription})

(def expresses
  "This is a large comment field for those who want to investigate the different uses of the 'expresses' relation for modeling different approaches to meaning characterization and modeling. For example, in all these cases, some aspect of meaning is involved: - Beehive means \"a structure in which bees are kept, typically in the form of a dome or box.\" (Oxford dictionary) - 'Beehive' is a synonym in noun synset 09218159 \"beehive|hive\" (WordNet) - 'the term Beehive can be interpreted as the fact of 'being a beehive', i.e. a relation that holds for concepts such as Bee, Honey, Hosting, etc.' - 'the text of Italian apiculture regulation expresses a rule by which beehives should be kept at least one kilometer away from inhabited areas' - 'the term Beehive expresses the concept Beehive' - ''Beehive' for apiculturists does not express the same meaning as for, say, fishermen' - 'Your meaning of 'Beautiful' does not seem to fit mine' - ''Beehive' is formally interpreted as the set of all beehives' - 'from the term 'Beehive', we can build a vector space of statistically significant cooccurring terms in the documents that contain it' - the lexeme 'Belly' expresses the role 'Body_Part' in the frame 'ObservableBodyParts' (FrameNet) As the examples suggest, the 'meaning of meaning' is dependent on the background approach/theory that one assumes. One can hardly make a summary of the too many approaches and theories of meaning, therefore this relation is maybe the most controversial and difficult to explain; normally, in such cases it would be better to give up formalizing. However, the usefulness of having a 'semantic abstraction' in modeling information objects is so high (e.g. for the semantic web, interoperability, reengineering, etc.), that we accept this challenging task, although without taking any particular position in the debate. We provide here some examples, which we want to generalize upon when using the 'expresses' relation to model semantic aspects of social reality. In the most common approach, lexicographers that write dictionaries, glossaries, etc. assume that the meaning of a term is a paraphrase (or 'gloss', or 'definition'). Another approach is provided by concept schemes like thesauri and lexicons, which assume that the meaning of a term is a 'concept', encoded as a 'lemma', 'synset', or 'descriptor'. Still another approach is that of psychologists and cognitive scientists, which often assume that the meaning of an information object is a concept encoded in the mind or cognitive system of an agent. A radically different approach is taken by social scientists and semioticians, who usually assume that meanings of an information object are spread across the communication practices in which members of a community use that object. Another approach that tackles the distributed nature of meaning is assumed by geometrical models of semantics, which assume that the meaning of an InformationObject (e.g. a word) results from the set of informational contexts (e.g. within texts) in which that object is used similarly. The logical approach to meaning is still different, since it assumes that the meaning of e.g. a term is equivalent to the set of individuals that the term can be applied to; for example, the meaning of 'Ali' is e.g. an individual person called Ali, the meaning of 'Airplane' is e.g. the set of airplanes, etc. Finally, an approach taken by structuralist linguistics and frame semantics is that a meaning is the relational context in which an information object can be applied; for example, a meaning of 'Airplane' is situated e.g. in the context ('frame') of passenger airline flights. These different approaches are not necessarily conflicting, and they mostly talk about different aspects of so-called 'semantics'. They can be summarized and modelled within DOLCE-Ultralite as follows (notice that such list is far from exhaustive): (1) Informal meaning (as for linguistic or commonsense semantics: a distinction is assumed between (informal) meaning and reference; see isAbout for an alternative pattern on reference) - Paraphrase meaning (as for lexicographic semantics). Here it is modelled as the expresses relation between instances of InformationObject and different instances of InformationObject that act as 'paraphrases' - Conceptual meaning (as for 'concept scheme' semantics). Here it is modelled as the expresses relation between instances of InformationObject and instances of Concept - Relational meaning (as for frame semantics). Here it is modelled as the expresses relation between instances of InformationObject and instances of Description - Cognitive meaning (as for 'psychological' semantics). Here it is modelled as the expresses relation between any instance of InformationObject and any different instance of InformationObject that isRealizedBy a mental, cognitive or neural state (depending on which theory of mind is assumed). Such states can be considered here as instances of Process (occurring in the mind, cognitive system, or neural system of an agent) - Cultural meaning (as for 'social science' semantics). Here it is modelled as the expresses relation between instances of InformationObject and instances of SocialObject (institutions, cultural paradigms, norms, social practices, etc.) - Distributional meaning (as for geometrical models of meaning). Here it is modelled as the expresses relation between any instance of InformationObject and any different instance of InformationObject that isFormallyRepresentedIn some (geometrical) Region (e.g. a vector space) (2) Formal meaning (as for logic and formal semantics: no distinction is assumed between informal meaning and reference, therefore between 'expresses' and 'isAbout', which can be used interchangeably) - Object-level formal meaning (as in the traditional first-order logic semantics). Here it is modelled as the expresses relation between an instance of InformationObject and an instance of Collection that isGroundingFor (in most cases) a Set; isGroundingFor is defined in the ontology: http://www.ontologydesignpatterns.org/ont/dul/IOLite.owl - Modal formal meaning (as in possible-world semantics). Here it is modelled as the expresses relation between an instance of InformationObject and an instance of Collection that isGroundingFor a Set, and which isPartOf some different instance of Collection that isGroundingFor a PossibleWorld This is only a first step to provide a framework, in which one can model different aspects of meaning. A more developed ontology should approach the problem of integrating the different uses of 'expresses', so that different theories, resources, methods can interoperate. A relation between an InformationObject and a 'meaning', generalized here as a 'SocialObject'. For example: 'A Beehive is a structure in which bees are kept, typically in the form of a dome or box.' (Oxford dictionary)'; 'the term Beehive expresses the concept Beehive in my apiculture ontology'. The intuition for 'meaning' is intended to be very broad. A separate, large comment is included for those who want to investigate more on what kind of meaning can be represented in what form."
  {:db/ident :dul/expresses,
   :owl/inverseOf :dul/isExpressedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["This is a large comment field for those who want to investigate the different uses of the 'expresses' relation for modeling different approaches to meaning characterization and modeling.\nFor example, in all these cases, some aspect of meaning is involved:\n\n- Beehive means \"a structure in which bees are kept, typically in the form of a dome or box.\" (Oxford dictionary)\n- 'Beehive' is a synonym in noun synset 09218159 \"beehive|hive\" (WordNet)\n- 'the term Beehive can be interpreted as the fact of 'being a beehive', i.e. a relation that holds for concepts such as Bee, Honey, Hosting, etc.'\n- 'the text of Italian apiculture regulation expresses a rule by which beehives should be kept at least one kilometer away from inhabited areas'\n- 'the term Beehive expresses the concept Beehive'\n- ''Beehive' for apiculturists does not express the same meaning as for, say, fishermen'\n- 'Your meaning of 'Beautiful' does not seem to fit mine'\n- ''Beehive' is formally interpreted as the set of all beehives'\n- 'from the term 'Beehive', we can build a vector space of statistically significant cooccurring terms in the documents that contain it'\n- the lexeme 'Belly' expresses the role 'Body_Part' in the frame 'ObservableBodyParts' (FrameNet)\n\nAs the examples suggest, the 'meaning of meaning' is dependent on the background approach/theory that one assumes. One can hardly make a summary of the too many approaches and theories of meaning, therefore this relation is maybe the most controversial and difficult to explain; normally, in such cases it would be better to give up formalizing. \nHowever, the usefulness of having a 'semantic abstraction' in modeling information objects is so high (e.g. for the semantic web, interoperability, reengineering, etc.), that we accept this challenging task, although without taking any particular position in the debate. \nWe provide here some examples, which we want to generalize upon when using the 'expresses' relation to model semantic aspects of social reality.\n\nIn the most common approach, lexicographers that write dictionaries, glossaries, etc. assume that the meaning of a term is a paraphrase (or 'gloss', or 'definition'). \nAnother approach is provided by concept schemes like thesauri and lexicons, which assume that the meaning of a term is a 'concept', encoded as a 'lemma', 'synset', or 'descriptor'.\nStill another approach is that of psychologists and cognitive scientists, which often assume that the meaning of an information object is a concept encoded in the mind or cognitive system of an agent. \nA radically different approach is taken by social scientists and semioticians, who usually assume that meanings of an information object are spread across the communication practices in which members of a community use that object.\nAnother approach that tackles the distributed nature of meaning is assumed by geometrical models of semantics, which assume that the meaning of an InformationObject (e.g. a word) results from the set of informational contexts (e.g. within texts) in which that object is used similarly.\nThe logical approach to meaning is still different, since it assumes that the meaning of e.g. a term is equivalent to the set of individuals that the term can be applied to; for example, the meaning of 'Ali' is e.g. an individual person called Ali, the meaning of 'Airplane' is e.g. the set of airplanes, etc. \nFinally, an approach taken by structuralist linguistics and frame semantics is that a meaning is the relational context in which an information object can be applied; for example, a meaning of 'Airplane' is situated e.g. in the context ('frame') of passenger airline flights.\n\nThese different approaches are not necessarily conflicting, and they mostly talk about different aspects of so-called 'semantics'. They can be summarized and modelled within DOLCE-Ultralite as follows (notice that such list is far from exhaustive):\n\n(1) Informal meaning (as for linguistic or commonsense semantics: a distinction is assumed between (informal) meaning and reference; see isAbout for an alternative pattern on reference)\n\t- Paraphrase meaning (as for lexicographic semantics). Here it is modelled as the expresses relation between instances of InformationObject and different instances of InformationObject that act as 'paraphrases'\n\t- Conceptual meaning (as for 'concept scheme' semantics). Here it is modelled as the expresses relation between instances of InformationObject and instances of Concept\n\t- Relational meaning (as for frame semantics). Here it is modelled as the expresses relation between instances of InformationObject and instances of Description\n\t- Cognitive meaning (as for 'psychological' semantics). Here it is modelled as the expresses relation between any instance of InformationObject and any different instance of InformationObject that isRealizedBy a mental, cognitive or neural state (depending on which theory of mind is assumed). Such states can be considered here as instances of Process (occurring in the mind, cognitive system, or neural system of an agent)\n\t- Cultural meaning (as for 'social science' semantics). Here it is modelled as the expresses relation between instances of InformationObject and instances of SocialObject (institutions, cultural paradigms, norms, social practices, etc.)\n\t- Distributional meaning (as for geometrical models of meaning). Here it is modelled as the expresses relation between any instance of InformationObject and any different instance of InformationObject that isFormallyRepresentedIn some (geometrical) Region (e.g. a vector space)\n\n(2) Formal meaning (as for logic and formal semantics: no distinction is assumed between informal meaning and reference, therefore between 'expresses' and 'isAbout', which can be used interchangeably)\n\t- Object-level formal meaning (as in the traditional first-order logic semantics). Here it is modelled as the expresses relation between an instance of InformationObject and an instance of Collection that isGroundingFor (in most cases) a Set; isGroundingFor is defined in the ontology: http://www.ontologydesignpatterns.org/ont/dul/IOLite.owl\n\t- Modal formal meaning (as in possible-world semantics). Here it is modelled as the expresses relation between an instance of InformationObject and an instance of Collection that isGroundingFor a Set, and which isPartOf some different instance of Collection that isGroundingFor a PossibleWorld\n\nThis is only a first step to provide a framework, in which one can model different aspects of meaning. A more developed ontology should approach the problem of integrating the different uses of 'expresses', so that different theories, resources, methods can interoperate."
    "A relation between an InformationObject and a 'meaning', generalized here as a 'SocialObject'. For example: 'A Beehive is a structure in which bees are kept, typically in the form of a dome or box.' (Oxford dictionary)'; 'the term Beehive expresses the concept Beehive in my apiculture ontology'.\nThe intuition for 'meaning' is intended to be very broad. A separate, large comment is included for those who want to investigate more on what kind of meaning can be represented in what form."],
   :rdfs/domain :dul/InformationObject,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "esprime"}
                {:rdf/language "en",
                 :rdf/value    "expresses"}],
   :rdfs/range :dul/SocialObject,
   :rdfs/subPropertyOf :dul/associatedWith})

(def expressesConcept
  "A relation between an InformationObject and a Concept , e.g. the term \"dog\" expresses the Concept \"dog\". For expressing a relational meaning, see the more general object property: expresses"
  {:db/ident :dul/expressesConcept,
   :owl/inverseOf :dul/isConceptExpressedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between an InformationObject and a Concept , e.g. the term \"dog\" expresses the Concept \"dog\". For expressing a relational meaning, see the more general object property: expresses",
   :rdfs/domain :dul/InformationObject,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "expresses concept"}
                {:rdf/language "it",
                 :rdf/value    "esprime il concetto"}],
   :rdfs/range :dul/Concept,
   :rdfs/subPropertyOf :dul/expresses})

(def farFrom
  "Generic distance relation between any Entity(s). E.g. Rome is far from Beijing, astronomy is far from necromancy."
  {:db/ident :dul/farFrom,
   :owl/inverseOf :dul/farFrom,
   :rdf/type [:owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/comment
   "Generic distance relation between any Entity(s). E.g. Rome is far from Beijing, astronomy is far from necromancy.",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "far from"},
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/associatedWith})

(def follows
  "A relation between entities, expressing a 'sequence' schema. E.g. 'year 2000 follows 1999', 'preparing coffee' follows 'deciding what coffee to use', 'II World War follows I World War', etc. It can be used between tasks, processes or time intervals, and subproperties would fit best in order to distinguish the different uses."
  {:db/ident :dul/follows,
   :owl/inverseOf :dul/precedes,
   :rdf/type [:owl/TransitiveProperty :owl/ObjectProperty],
   :rdfs/comment
   "A relation between entities, expressing a 'sequence' schema. \nE.g. 'year 2000 follows 1999', 'preparing coffee' follows 'deciding what coffee to use', 'II World War follows I World War', etc. \nIt can be used between tasks, processes or time intervals, and subproperties would fit best in order to distinguish the different uses.",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "segue"}
                {:rdf/language "en",
                 :rdf/value    "follows"}],
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/associatedWith})

(def hasCommonBoundary
  "A relation to encode either formal or informal characterizations of 'boundaries' common to two different entities: an Event that ends when another begins, two abstract regions that have a common topological boundary, two objects that are said to be 'in contact' from a commonsense perspective, etc."
  {:db/ident :dul/hasCommonBoundary,
   :owl/inverseOf :dul/hasCommonBoundary,
   :rdf/type [:owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/comment
   "A relation to encode either formal or informal characterizations of 'boundaries' common to two different entities: an Event that ends when another begins, two abstract regions that have a common topological boundary, two objects that are said to be 'in contact' from a commonsense perspective, etc.",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has common boundary"},
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/associatedWith})

(def hasComponent
  "The hasProperPart relation without transitivity, holding between an Object (the system) and another (the component), and assuming a Design that structures the Object."
  {:db/ident :dul/hasComponent,
   :owl/inverseOf :dul/isComponentOf,
   :rdf/type [:owl/AsymmetricProperty :owl/ObjectProperty],
   :rdfs/comment
   "The hasProperPart relation without transitivity, holding between an Object (the system) and another (the component), and assuming a Design that structures the Object.",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "ha componente"}
                {:rdf/language "en",
                 :rdf/value    "has component"}],
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/hasProperPart})

(def hasConstituent
  "'Constituency' depends on some layering of the world described by the ontology. For example, scientific granularities (e.g. body-organ-tissue-cell) or ontological 'strata' (e.g. social-mental-biological-physical) are typical layerings. Intuitively, a constituent is a part belonging to a lower layer. Since layering is actually a partition of the world described by the ontology, constituents are not properly classified as parts, although this kinship can be intuitive for common sense. A desirable advantage of this distinction is that we are able to talk e.g. of physical constituents of non-physical objects (e.g. systems), while this is not possible in terms of parts. Example of are the persons constituting a social system, the molecules constituting a person, the atoms constituting a river, etc. In all these examples, we notice a typical discontinuity between the constituted and the constituent object: e.g. a social system is conceptualized at a different layer from the persons that constitute it, a person is conceptualized at a different layer from the molecules that constitute them, and a river is conceptualized at a different layer from the atoms that constitute it."
  {:db/ident :dul/hasConstituent,
   :owl/inverseOf :dul/isConstituentOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "'Constituency' depends on some layering of  the world described by the ontology. For example, scientific granularities (e.g. body-organ-tissue-cell) or ontological 'strata' (e.g. social-mental-biological-physical) are  typical layerings. \nIntuitively, a constituent is a part belonging to a lower layer. Since layering is actually a partition of the world described by the ontology, constituents are not properly classified as parts, although this kinship can be intuitive for common sense.\nA desirable advantage of this distinction is that we are able to talk e.g. of physical constituents of non-physical objects (e.g. systems), while this is not possible in terms of parts.\nExample of are the persons constituting a social system, the molecules constituting a person, the atoms constituting a river, etc. \nIn all these examples, we notice a typical discontinuity between the constituted and the constituent object: e.g. a social system is conceptualized at a different layer from the persons that constitute it, a person is conceptualized at a different layer from the molecules that constitute them, and a river is conceptualized at a different layer from the atoms that constitute it.",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "has constituent"}
                {:rdf/language "it",
                 :rdf/value    "ha costituente"}],
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/associatedWith})

(def hasConstraint
  "A relation between parameters and entities. It allows to assert generic constraints (encoded as parameters), e.g. MinimumAgeForDriving isConstraintFor John (where John is a legal subject under the TrafficLaw). The intended semantics (not expressible in OWL) is that a Parameter isParameterFor a Concept that classifies an Entity; moreover, it entails that a Parameter parametrizes a Region that isRegionFor that Entity."
  {:db/ident :dul/hasConstraint,
   :owl/inverseOf :dul/isConstraintFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between parameters and entities. It allows to assert generic constraints (encoded as parameters), e.g. MinimumAgeForDriving isConstraintFor John (where John is a legal subject under the TrafficLaw).\nThe intended semantics (not expressible in OWL) is that a Parameter isParameterFor a Concept that classifies an Entity; moreover, it entails that a Parameter parametrizes a Region that isRegionFor that Entity.",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "has constraint"}
                {:rdf/language "it",
                 :rdf/value    "ha vincolo"}],
   :rdfs/range :dul/Parameter,
   :rdfs/subPropertyOf :dul/isClassifiedBy})

(def hasDataValue
  "A datatype property that encodes values from a datatype for an Entity. There are several ways to encode values in DOLCE (Ultralite): 1) Directly assert an xsd:_ value to an Entity by using hasDataValue 2) Assert a Region for an Entity by using hasRegion, and then assert an xsd:_ value to that Region, by using hasRegionDataValue 3) Assert a Quality for an Entity by using hasQuality, then assert a Region for that Quality, and assert an xsd:_ value to that Region, by using hasRegionDataValue 4) When the value is required, but not directly observed, assert a Parameter for an xsd:_ value by using hasParameterDataValue, and then associate the Parameter to an Entity by using isConstraintFor 5) When the value is required, but not directly observed, you can also assert a Parameter for a Region by using parametrizes, and then assert an xsd:_ value to that Region, by using hasRegionDataValue The five approaches obey different requirements. For example, a simple value can be easily asserted by using pattern (1), but if one needs to assert an interval between two values, a Region should be introduced to materialize that interval, as pattern (2) suggests. Furthermore, if one needs to distinguish the individual Quality of a value, e.g. the particular nature of the density of a substance, pattern (3) can be used. Patterns (4) and (5) should be used instead when a constraint or a selection is modeled, independently from the actual observation of values in the real world."
  {:db/ident :dul/hasDataValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A datatype property that encodes values from a datatype for an Entity. \nThere are several ways to encode values in DOLCE (Ultralite):\n\n1) Directly assert an xsd:_ value to an Entity by using hasDataValue\n2) Assert a Region for an Entity by using hasRegion, and then assert an xsd:_ value to that Region, by using hasRegionDataValue\n3) Assert a Quality for an Entity by using hasQuality, then assert a Region for that Quality, and assert an xsd:_ value to that Region, by using hasRegionDataValue\n4) When the value is required, but not directly observed, assert a Parameter for an xsd:_ value by using hasParameterDataValue, and then associate the Parameter to an Entity by using isConstraintFor\n5) When the value is required, but not directly observed, you can also assert a Parameter for a Region by using parametrizes, and then assert an xsd:_ value to that Region, by using hasRegionDataValue\n\nThe five approaches obey different requirements. \nFor example, a simple value can be easily asserted by using pattern (1), but if one needs to assert an interval between two values, a Region should be introduced to materialize that interval, as pattern (2) suggests. \nFurthermore, if one needs to distinguish the individual Quality of a value, e.g. the particular nature of the density of a substance, pattern (3) can be used. \nPatterns (4) and (5) should be used instead when a constraint or a selection is modeled, independently from the actual observation of values in the real world.",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "has data value"}
                {:rdf/language "it",
                 :rdf/value    "ha valore"}]})

(def hasEventDate
  "A datatype property that encodes values from xsd:dateTime for an Event; a same Event can have more than one xsd:dateTime value: begin date, end date, date at which the interval holds, etc."
  {:db/ident :dul/hasEventDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A datatype property that encodes values from xsd:dateTime for an Event; a same Event can have more than one xsd:dateTime value: begin date, end date, date at which the interval holds, etc.",
   :rdfs/domain :dul/Event,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "has event date"}
                {:rdf/language "it",
                 :rdf/value    "evento ha data"}],
   :rdfs/range :xsd/dateTime,
   :rdfs/subPropertyOf :dul/hasDataValue})

(def hasIntervalDate
  "A datatype property that encodes values from xsd:dateTime for a TimeInterval; a same TimeInterval can have more than one xsd:dateTime value: begin date, end date, date at which the interval holds, etc."
  {:db/ident :dul/hasIntervalDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A datatype property that encodes values from xsd:dateTime for a TimeInterval; a same TimeInterval can have more than one xsd:dateTime value: begin date, end date, date at which the interval holds, etc.",
   :rdfs/domain :dul/TimeInterval,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "intervallo ha data"}
                {:rdf/language "en",
                 :rdf/value    "has interval date"}],
   :rdfs/range :xsd/dateTime,
   :rdfs/subPropertyOf :dul/hasRegionDataValue})

(def hasLocation
  "A generic, relative spatial location, holding between any entities. E.g. 'the cat is on the mat', 'Omar is in Samarcanda', 'the wound is close to the femural artery'. For 'absolute' locations, see SpaceRegion"
  {:db/ident :dul/hasLocation,
   :owl/inverseOf :dul/isLocationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A generic, relative spatial location, holding between any entities. E.g. 'the cat is on the mat', 'Omar is in Samarcanda', 'the wound is close to the femural artery'.\nFor 'absolute' locations, see SpaceRegion",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "has location"}
                {:rdf/language "it",
                 :rdf/value    "ha localizzazione"}],
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/associatedWith})

(def hasMember
  "A relation between collections and entities, e.g. 'my collection of saxophones includes an old Adolphe Sax original alto' (i.e. my collection has member an Adolphe Sax alto)."
  {:db/ident :dul/hasMember,
   :owl/inverseOf :dul/isMemberOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between collections and entities, e.g. 'my collection of saxophones includes an old Adolphe Sax original alto' (i.e. my collection has member an Adolphe Sax alto).",
   :rdfs/domain :dul/Collection,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "has member"}
                {:rdf/language "it",
                 :rdf/value    "ha membro"}],
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/associatedWith})

(def hasParameter
  "A Concept can have a Parameter that constrains the attributes that a classified Entity can have in a certain Situation, e.g. a 4WheelDriver Role definedIn the ItalianTrafficLaw has a MinimumAge parameter on the Amount 16."
  {:db/ident :dul/hasParameter,
   :owl/inverseOf :dul/isParameterFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A Concept can have a Parameter that constrains the attributes that a classified Entity can have in a certain Situation, e.g. a 4WheelDriver Role definedIn the ItalianTrafficLaw has a MinimumAge parameter on the Amount 16.",
   :rdfs/domain :dul/Concept,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "has parameter"}
                {:rdf/language "it",
                 :rdf/value    "ha parametro"}],
   :rdfs/range :dul/Parameter,
   :rdfs/subPropertyOf :dul/isRelatedToConcept})

(def hasParameterDataValue
  "Parametrizes values from a datatype. For example, a Parameter MinimumAgeForDriving hasParameterDataValue 18 on datatype xsd:int, in the Italian traffic code. In this example, MinimumAgeForDriving isDefinedIn the Norm ItalianTrafficCodeAgeDriving. More complex parametrization requires workarounds. E.g. AgeRangeForDrugUsage could parametrize data value: 14 to 50 on the datatype: xsd:int. Since complex datatypes are not allowed in OWL1.0, a solution to this can only work by creating two 'sub-parameters': MinimumAgeForDrugUsage (that hasParameterDataValue 14) and MaximumAgeForDrugUsage (that hasParameterDataValue 50), which are components of (cf. hasComponent) the main Parameter AgeRangeForDrugUsage. Ordering on subparameters can be created by using or specializing the object property 'precedes'."
  {:db/ident :dul/hasParameterDataValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Parametrizes values from a datatype. For example, a Parameter MinimumAgeForDriving hasParameterDataValue 18 on datatype xsd:int, in the Italian traffic code. In this example, MinimumAgeForDriving isDefinedIn the Norm ItalianTrafficCodeAgeDriving.\nMore complex parametrization requires workarounds. E.g. AgeRangeForDrugUsage could parametrize data value: 14 to 50 on the datatype: xsd:int. Since complex datatypes are not allowed in OWL1.0, a solution to this can only work by creating two 'sub-parameters': MinimumAgeForDrugUsage (that hasParameterDataValue 14) and MaximumAgeForDrugUsage (that hasParameterDataValue 50), which are components of (cf. hasComponent) the main Parameter AgeRangeForDrugUsage.\nOrdering on subparameters can be created by using or specializing the object property 'precedes'.",
   :rdfs/domain :dul/Parameter,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "has parameter data value"}
                {:rdf/language "it",
                 :rdf/value    "ha valore"}],
   :rdfs/subPropertyOf :dul/hasDataValue})

(def hasPart
  "A schematic relation between any entities, e.g. 'the human body has a brain as part', '20th century contains year 1923', 'World War II includes the Pearl Harbour event'. Parthood should assume the basic properties of mereology: transitivity, antisymmetry, and reflexivity (propert Parthood of course misses reflexivity). However, antisymmetry is not supported in OWL2 explicitly, therefore DUL has to adopt one of two patterns: 1) dropping asymmetry axioms, while granting reflexivity: this means that symmetry is not enforced, but permitted for the case of reflexivity. Of course, in this way we cannot prevent symmetric usages of hasPart; 2) dropping the reflexivity axiom, and enforce asymmetry: in this case, we would prevent all symmetric usages, but we loose the possibility of enforcing reflexivity, which is commonsensical in parthood. In DUL, we adopt pattern #1 for partOf, and pattern #2 for properPartOf, which seems a good approximation: due to the lack of inheritance of property characteristics, each asymmetric hasPropertPart assertion would also be a reflexive hasPart assertion (reflexive reduction design pattern). Subproperties and restrictions can be used to specialize hasPart for objects, events, etc."
  {:db/ident :dul/hasPart,
   :owl/inverseOf :dul/isPartOf,
   :owl/propertyChainAxiom [{:owl/inverseOf :dul/includesWhole}
                            :dul/includesPart],
   :rdf/type
   [:owl/ReflexiveProperty :owl/TransitiveProperty :owl/ObjectProperty],
   :rdfs/comment
   "A schematic relation between any entities, e.g. 'the human body has a brain as part', '20th century contains year 1923', 'World War II includes the Pearl Harbour event'.\n\nParthood should assume the basic properties of mereology: transitivity, antisymmetry, and reflexivity (propert Parthood of course misses reflexivity). \nHowever, antisymmetry is not supported in OWL2 explicitly, therefore DUL has to adopt one of two patterns:\n1) dropping asymmetry axioms, while granting reflexivity: this means that symmetry is not enforced, but permitted for the case of reflexivity. Of course, in this way we cannot prevent symmetric usages of hasPart;\n2) dropping the reflexivity axiom, and enforce asymmetry: in this case, we would prevent all symmetric usages, but we loose the possibility of enforcing reflexivity, which is commonsensical in parthood.\nIn DUL, we adopt pattern #1 for partOf, and pattern #2 for properPartOf, which seems a good approximation: due to the lack of inheritance of property characteristics, each asymmetric hasPropertPart assertion would also be a reflexive hasPart assertion (reflexive reduction design pattern).\n\nSubproperties and restrictions can be used to specialize hasPart for objects, events, etc.",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "ha parte"}
                {:rdf/language "en",
                 :rdf/value    "has part"}],
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/associatedWith})

(def hasParticipant
  "A relation between an object and a process, e.g. 'John took part in the discussion', 'a large mass of snow fell during the avalanche', or 'a cook, some sugar, flour, etc. are all present in the cooking of a cake'."
  {:db/ident :dul/hasParticipant,
   :owl/inverseOf :dul/isParticipantIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between an object and a process, e.g. 'John took part in the discussion', 'a large mass of snow fell during the avalanche', or 'a cook, some sugar, flour, etc. are all present in the cooking of a cake'.",
   :rdfs/domain :dul/Event,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "has participant"}
                {:rdf/language "it",
                 :rdf/value    "ha come partecipante"}],
   :rdfs/range :dul/Object,
   :rdfs/subPropertyOf :dul/associatedWith})

(def hasPostcondition
  "Direct succession applied to situations. E.g., 'A postcondition of our Plan is to have things settled'."
  {:db/ident :dul/hasPostcondition,
   :owl/inverseOf :dul/isPostconditionOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Direct succession applied to situations. \nE.g., 'A postcondition of our Plan is to have things settled'.",
   :rdfs/domain {:owl/unionOf [:dul/Event :dul/Situation],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "has postcondition"}
                {:rdf/language "it",
                 :rdf/value    "ha postcondizione"}],
   :rdfs/range {:owl/unionOf [:dul/Event :dul/Situation],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :dul/directlyPrecedes})

(def hasPrecondition
  "Direct precedence applied to situations. E.g., 'A precondition to declare war against a foreign country is claiming to find nuclear weapons in it'."
  {:db/ident :dul/hasPrecondition,
   :owl/inverseOf :dul/isPreconditionOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Direct precedence applied to situations. \nE.g., 'A precondition to declare war against a foreign country is claiming to find nuclear weapons in it'.",
   :rdfs/domain {:owl/unionOf [:dul/Event :dul/Situation],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "has precondition"}
                {:rdf/language "it",
                 :rdf/value    "ha precondizione"}],
   :rdfs/range {:owl/unionOf [:dul/Event :dul/Situation],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :dul/directlyFollows})

(def hasProperPart
  "Asymmetric (so including irreflexive) parthood."
  {:db/ident           :dul/hasProperPart,
   :owl/inverseOf      :dul/isPropertPartOf,
   :rdf/type           [:owl/TransitiveProperty :owl/ObjectProperty],
   :rdfs/comment       "Asymmetric (so including irreflexive) parthood.",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has proper part"},
   :rdfs/subPropertyOf :dul/hasPart})

(def hasQuality
  "A relation between entities and qualities, e.g. 'Dmitri's skin is yellowish'."
  {:db/ident :dul/hasQuality,
   :owl/inverseOf :dul/isQualityOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between entities and qualities, e.g. 'Dmitri's skin is yellowish'.",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "has quality"}
                {:rdf/language "it",
                 :rdf/value    "ha qualità"}],
   :rdfs/range :dul/Quality,
   :rdfs/subPropertyOf :dul/associatedWith})

(def hasRegion
  "A relation between entities and regions, e.g. 'the number of wheels of that truck is 12', 'the time of the experiment is August 9th, 2004', 'the whale has been localized at 34 degrees E, 20 degrees S'."
  {:db/ident :dul/hasRegion,
   :owl/inverseOf :dul/isRegionFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between entities and regions, e.g. 'the number of wheels of that truck is 12', 'the time of the experiment is August 9th, 2004', 'the whale has been localized at 34 degrees E, 20 degrees S'.",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "has region"}
                {:rdf/language "it",
                 :rdf/value    "ha attributo"}],
   :rdfs/range :dul/Region,
   :rdfs/subPropertyOf :dul/associatedWith})

(def hasRegionDataValue
  "A datatype property that encodes values for a Region, e.g. a float for the Region Height."
  {:db/ident :dul/hasRegionDataValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A datatype property that encodes values for a Region, e.g. a float for the Region Height.",
   :rdfs/domain :dul/Region,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "regione ha valore"}
                {:rdf/language "en",
                 :rdf/value    "has region data value"}],
   :rdfs/subPropertyOf :dul/hasDataValue})

(def hasRole
  "A relation between an object and a role, e.g. the person 'John' has role 'student'."
  {:db/ident :dul/hasRole,
   :owl/inverseOf :dul/isRoleOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between an object and a role, e.g. the person 'John' has role 'student'.",
   :rdfs/domain :dul/Object,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "has role"}
                {:rdf/language "it",
                 :rdf/value    "ha ruolo"}],
   :rdfs/range :dul/Role,
   :rdfs/subPropertyOf :dul/isClassifiedBy})

(def hasSetting
  "A relation between entities and situations, e.g. 'this morning I've prepared my coffee with a new fantastic Arabica', i.e.: (an amount of) a new fantastic Arabica hasSetting the preparation of my coffee this morning."
  {:db/ident :dul/hasSetting,
   :owl/inverseOf :dul/isSettingFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between entities and situations, e.g. 'this morning I've prepared my coffee with a new fantastic Arabica', i.e.: (an amount of) a new fantastic Arabica hasSetting the preparation of my coffee this morning.",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è nel contesto di"}
                {:rdf/language "en",
                 :rdf/value    "has setting"}],
   :rdfs/range :dul/Situation,
   :rdfs/subPropertyOf :dul/associatedWith})

(def hasTask
  "A relation between roles and tasks, e.g. 'students have the duty of giving exams' (i.e. the Role 'student' hasTask the Task 'giving exams')."
  {:db/ident :dul/hasTask,
   :owl/inverseOf :dul/isTaskOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between roles and tasks, e.g. 'students have the duty of giving exams' (i.e. the Role 'student' hasTask the Task 'giving exams').",
   :rdfs/domain :dul/Role,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "has task"}
                {:rdf/language "it",
                 :rdf/value    "ha come obiettivo"}],
   :rdfs/range :dul/Task,
   :rdfs/subPropertyOf :dul/isRelatedToConcept})

(def hasTimeInterval
  "The generic relation between events and time intervals."
  {:db/ident :dul/hasTimeInterval,
   :owl/inverseOf :dul/isTimeIntervalOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The generic relation between events and time intervals."},
   :rdfs/domain :dul/Event,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "has time interval"}
                {:rdf/language "it",
                 :rdf/value    "ha intervallo temporale"}],
   :rdfs/range :dul/TimeInterval,
   :rdfs/subPropertyOf :dul/hasRegion})

(def includesAction
  "A relation between situations and actions, e.g. 'this morning I've prepared my coffee and had my fingers burnt' (i.e.: the preparation of my coffee this morning included a burning of my fingers)."
  {:db/ident :dul/includesAction,
   :owl/inverseOf :dul/isActionIncludedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between situations and actions, e.g. 'this morning I've prepared my coffee and had my fingers burnt' (i.e.: the preparation of my coffee this morning included a burning of my fingers).",
   :rdfs/domain :dul/Situation,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "includes action"}
                {:rdf/language "it",
                 :rdf/value    "include azione"}],
   :rdfs/range :dul/Action,
   :rdfs/subPropertyOf :dul/includesEvent})

(def includesAgent
  "A relation between situations and persons, e.g. 'this morning I've prepared my coffee and had my fingers burnt' (i.e.: the preparation of my coffee this morning included me)."
  {:db/ident :dul/includesAgent,
   :owl/inverseOf :dul/isAgentIncludedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between situations and persons, e.g. 'this morning I've prepared my coffee and had my fingers burnt' (i.e.: the preparation of my coffee this morning included me).",
   :rdfs/domain :dul/Situation,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "includes agent"}
                {:rdf/language "it",
                 :rdf/value    "include l'agente"}],
   :rdfs/range :dul/Agent,
   :rdfs/subPropertyOf :dul/includesObject})

(def includesEvent
  "A relation between situations and events, e.g. 'this morning I've prepared my coffee and had my fingers burnt' (i.e.: the preparation of my coffee this morning included a burning of my fingers)."
  {:db/ident :dul/includesEvent,
   :owl/inverseOf :dul/isEventIncludedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between situations and events, e.g. 'this morning I've prepared my coffee and had my fingers burnt' (i.e.: the preparation of my coffee this morning included a burning of my fingers).",
   :rdfs/domain :dul/Situation,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "includes event"}
                {:rdf/language "it",
                 :rdf/value    "include l'evento"}],
   :rdfs/range :dul/Event,
   :rdfs/subPropertyOf :dul/isSettingFor})

(def includesObject
  "A relation between situations and objects, e.g. 'this morning I've prepared my coffee and had my fingers burnt' (i.e.: the preparation of my coffee this morning included me)."
  {:db/ident :dul/includesObject,
   :owl/inverseOf :dul/isObjectIncludedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between situations and objects, e.g. 'this morning I've prepared my coffee and had my fingers burnt' (i.e.: the preparation of my coffee this morning included me).",
   :rdfs/domain :dul/Situation,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "includes object"}
                {:rdf/language "it",
                 :rdf/value    "include l'oggetto"}],
   :rdfs/range :dul/Object,
   :rdfs/subPropertyOf :dul/isSettingFor})

(def includesPart
  {:db/ident           :dul/includesPart,
   :dc11/creator    "Aldo Gangemi",
   :dc11/date       #inst "2021-04-03T14:11:09.000-00:00",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/subPropertyOf :dul/isSettingFor})

(def includesTime
  "A relation between situations and time intervals, e.g. 'this morning I've prepared my coffee and had my fingers burnt' (i.e.: preparing my coffee was held this morning). A data value attached to the time interval typically complements this modelling pattern."
  {:db/ident :dul/includesTime,
   :owl/inverseOf :dul/isTimeIncludedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between situations and time intervals, e.g. 'this morning I've prepared my coffee and had my fingers burnt' (i.e.: preparing my coffee was held this morning). A data value attached to the time interval typically complements this modelling pattern.",
   :rdfs/domain :dul/Situation,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "includes time"}
                {:rdf/language "it",
                 :rdf/value    "include tempo"}],
   :rdfs/range :dul/TimeInterval,
   :rdfs/subPropertyOf :dul/isSettingFor})

(def includesWhole
  {:db/ident           :dul/includesWhole,
   :dc11/creator    "Aldo Gangemi",
   :dc11/date       #inst "2021-04-03T14:11:01.000-00:00",
   :rdf/type           :owl/ObjectProperty,
   :rdfs/subPropertyOf :dul/isSettingFor})

(def introduces
  "A relation between a Description and a SocialAgent, e.g. a Constitutional Charter introduces the SocialAgent 'PresidentOfRepublic'."
  {:db/ident :dul/introduces,
   :owl/inverseOf :dul/isIntroducedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between a Description and a SocialAgent, e.g. a Constitutional Charter introduces the SocialAgent 'PresidentOfRepublic'.",
   :rdfs/domain :dul/Description,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "introduces"}
                {:rdf/language "it",
                 :rdf/value    "introduce"}],
   :rdfs/range :dul/SocialAgent,
   :rdfs/subPropertyOf :dul/associatedWith})

(def involvesAgent
  "Agent participation."
  {:db/ident           :dul/involvesAgent,
   :owl/inverseOf      :dul/isAgentInvolvedIn,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       "Agent participation.",
   :rdfs/domain        :dul/Event,
   :rdfs/isDefinedBy   "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label         [{:rdf/language "en",
                         :rdf/value    "involves agent"}
                        {:rdf/language "it",
                         :rdf/value    "coinvolge agente"}],
   :rdfs/range         :dul/Agent,
   :rdfs/subPropertyOf :dul/hasParticipant})

(def isAbout
  "A relation between an information object and an Entity (including information objects). It can be used to talk about entities that are references of proper nouns: the proper noun 'Leonardo da Vinci' isAbout the Person Leonardo da Vinci; as well as to talk about sets of entities that can be described by a common noun: the common noun 'person' isAbout the set of all persons in a domain of discourse, which can be represented in DOLCE-Ultralite as an individual of the class: dul:Collection. A specific sentence may use common nouns with either a singular or plural reference, or it can even refer to all possible references (e.g. in a lexicographic definition): all those uses are kinds of aboutness. The isAbout relation is sometimes considered as reflexive, however this is semiotically inaccurate, because information can be about itself ('de dicto' usage, as in 'John is four character long'), but it is typically about something else ('de re' usage, as in 'John loves Mary'). If a reflexivity exists in general, it rather concerns its realisation, which is always associated with an event, e.g. an utterance, which makes the information denoting itself, besides its aboutness. This is implemented in DUL with the dul:realizesSelfInformation property, which is used with local reflexivity in the dul:InformationRealization class."
  {:db/ident :dul/isAbout,
   :owl/inverseOf :dul/isReferenceOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between an information object and an Entity (including information objects). It can be used to talk about entities that are references of proper nouns: the proper noun 'Leonardo da Vinci' isAbout the Person Leonardo da Vinci; as well as to talk about sets of entities that can be described by a common noun: the common noun 'person' isAbout the set of all persons in a domain of discourse, which can be represented in DOLCE-Ultralite as an individual of the class: dul:Collection.\nA specific sentence may use common nouns with either a singular or plural reference, or it can even refer to all possible references (e.g. in a lexicographic definition): all those uses are kinds of aboutness.\n\nThe isAbout relation is sometimes considered as reflexive, however this is semiotically inaccurate, because information can be about itself ('de dicto' usage, as in 'John is four character long'), but it is typically about something else ('de re' usage, as in 'John loves Mary').\nIf a reflexivity exists in general, it rather concerns its realisation, which is always associated with an event, e.g. an utterance, which makes the information denoting itself, besides its aboutness. This is implemented in DUL with the dul:realizesSelfInformation property, which is used with local reflexivity in the dul:InformationRealization class.",
   :rdfs/domain :dul/InformationObject,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "si riferisce a"}
                {:rdf/language "en",
                 :rdf/value    "is about"}],
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/associatedWith})

(def isActionIncludedIn
  "is action included in"
  {:db/ident           :dul/isActionIncludedIn,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :dul/Action,
   :rdfs/isDefinedBy   "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label         [{:rdf/language "it",
                         :rdf/value    "è un'azione nel contesto di"}
                        {:rdf/language "en",
                         :rdf/value    "is action included in"}],
   :rdfs/range         :dul/Situation,
   :rdfs/subPropertyOf :dul/isEventIncludedIn})

(def isAgentIncludedIn
  "is agent included in"
  {:db/ident           :dul/isAgentIncludedIn,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :dul/Agent,
   :rdfs/isDefinedBy   "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label         [{:rdf/language "it",
                         :rdf/value    "è un agente nel contesto di"}
                        {:rdf/language "en",
                         :rdf/value    "is agent included in"}],
   :rdfs/range         :dul/Situation,
   :rdfs/subPropertyOf :dul/isObjectIncludedIn})

(def isAgentInvolvedIn
  "Agent participation."
  {:db/ident           :dul/isAgentInvolvedIn,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       "Agent participation.",
   :rdfs/domain        :dul/Agent,
   :rdfs/isDefinedBy   "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label         [{:rdf/language "it",
                         :rdf/value    "è un agente coinvolto in"}
                        {:rdf/language "en",
                         :rdf/value    "is agent involved in"}],
   :rdfs/range         :dul/Event,
   :rdfs/subPropertyOf :dul/isParticipantIn})

(def isCharacterizedBy
  "is characterized by"
  {:db/ident           :dul/isCharacterizedBy,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :dul/Collection,
   :rdfs/isDefinedBy   "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label         [{:rdf/language "it",
                         :rdf/value    "è caratterizzato da"}
                        "is characterized by {@en-us}"
                        {:rdf/language "en",
                         :rdf/value    "is characterized by"}],
   :rdfs/range         :dul/Concept,
   :rdfs/subPropertyOf :dul/associatedWith})

(def isClassifiedBy
  "A relation between a Concept and an Entity, e.g. 'John is considered a typical rude man'; your last concert constitutes the achievement of a lifetime; '20-year-old means she's mature enough'."
  {:db/ident :dul/isClassifiedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between a Concept and an Entity, e.g. 'John is considered a typical rude man'; your last concert constitutes the achievement of a lifetime; '20-year-old means she's mature enough'.",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è classificato da"}
                {:rdf/language "en",
                 :rdf/value    "is classified by"}],
   :rdfs/range :dul/Concept,
   :rdfs/subPropertyOf :dul/associatedWith})

(def isComponentOf
  "The asymmetric isProperPartOf relation without transitivity, holding between an Object (the system) and another (the component), and assuming a Design that structures the Object."
  {:db/ident :dul/isComponentOf,
   :rdf/type [:owl/AsymmetricProperty :owl/ObjectProperty],
   :rdfs/comment
   "The asymmetric isProperPartOf relation without transitivity, holding between an Object (the system) and another (the component), and assuming a Design that structures the Object.",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è componente di"}
                {:rdf/language "en",
                 :rdf/value    "is component of"}],
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/isPropertPartOf})

(def isConceptExpressedBy
  "A relation between an InformationObject and a Concept , e.g. the term \"dog\" expresses the Concept \"dog\". For expressing a relational meaning, see the more general object property: expresses"
  {:db/ident :dul/isConceptExpressedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between an InformationObject and a Concept , e.g. the term \"dog\" expresses the Concept \"dog\". For expressing a relational meaning, see the more general object property: expresses",
   :rdfs/domain :dul/Concept,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è un concetto espresso da"}
                {:rdf/language "en",
                 :rdf/value    "is concept expressed by"}],
   :rdfs/range :dul/InformationObject,
   :rdfs/subPropertyOf :dul/isExpressedBy})

(def isConceptUsedIn
  "A more generic relation holding between a Description and a Concept. In order to be used, a Concept must be previously definedIn another Description"
  {:db/ident :dul/isConceptUsedIn,
   :owl/inverseOf :dul/usesConcept,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A more generic relation holding between a Description and a Concept. In order to be used, a Concept must be previously definedIn another Description",
   :rdfs/domain :dul/Concept,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è un concetto usato in"}
                {:rdf/language "en",
                 :rdf/value    "is concept used in"}],
   :rdfs/range :dul/Description,
   :rdfs/subPropertyOf :dul/associatedWith})

(def isConceptualizedBy
  "A relation stating that an Agent is internally representing a Description . E.g., 'John believes in the conspiracy theory'; 'Niels Bohr created a solar-system metaphor for his atomic theory'; 'Jacques assumes all swans are white'; 'the task force shares the attack plan'."
  {:db/ident :dul/isConceptualizedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation stating that an Agent is internally representing a Description . E.g., 'John believes in the conspiracy theory'; 'Niels Bohr created a solar-system metaphor for his atomic theory'; 'Jacques assumes all swans are white'; 'the task force shares the attack plan'.",
   :rdfs/domain :dul/SocialObject,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è concettualizzato da"}
                {:rdf/language "en",
                 :rdf/value    "is conceptualized by"}],
   :rdfs/range :dul/Agent,
   :rdfs/subPropertyOf :dul/associatedWith})

(def isConcretelyExpressedBy
  "A relation between an InformationRealization and a Description, e.g. 'the printout of the Italian Constitution concretelyExpresses the Italian Constitution'. It should be supplied also with a rule stating that the InformationRealization realizes an InformationObject that expresses the Description"
  {:db/ident :dul/isConcretelyExpressedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between an InformationRealization and a Description, e.g. 'the printout of the Italian Constitution concretelyExpresses the Italian Constitution'. It should be supplied also with a rule stating that the InformationRealization realizes an InformationObject that expresses the Description",
   :rdfs/domain :dul/SocialObject,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è espresso concretamente da"}
                {:rdf/language "en",
                 :rdf/value    "is concretely expressed by"}],
   :rdfs/range :dul/InformationRealization,
   :rdfs/subPropertyOf :dul/associatedWith})

(def isConstituentOf
  "'Constituency' depends on some layering of the world described by the ontology. For example, scientific granularities (e.g. body-organ-tissue-cell) or ontological 'strata' (e.g. social-mental-biological-physical) are typical layerings. Intuitively, a constituent is a part belonging to a lower layer. Since layering is actually a partition of the world described by the ontology, constituents are not properly classified as parts, although this kinship can be intuitive for common sense. A desirable advantage of this distinction is that we are able to talk e.g. of physical constituents of non-physical objects (e.g. systems), while this is not possible in terms of parts. Example of are the persons constituting a social system, the molecules constituting a person, the atoms constituting a river, etc. In all these examples, we notice a typical discontinuity between the constituted and the constituent object: e.g. a social system is conceptualized at a different layer from the persons that constitute it, a person is conceptualized at a different layer from the molecules that constitute them, and a river is conceptualized at a different layer from the atoms that constitute it."
  {:db/ident :dul/isConstituentOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "'Constituency' depends on some layering of  the world described by the ontology. For example, scientific granularities (e.g. body-organ-tissue-cell) or ontological 'strata' (e.g. social-mental-biological-physical) are  typical layerings. \nIntuitively, a constituent is a part belonging to a lower layer. Since layering is actually a partition of the world described by the ontology, constituents are not properly classified as parts, although this kinship can be intuitive for common sense.\nA desirable advantage of this distinction is that we are able to talk e.g. of physical constituents of non-physical objects (e.g. systems), while this is not possible in terms of parts.\nExample of are the persons constituting a social system, the molecules constituting a person, the atoms constituting a river, etc. \nIn all these examples, we notice a typical discontinuity between the constituted and the constituent object: e.g. a social system is conceptualized at a different layer from the persons that constitute it, a person is conceptualized at a different layer from the molecules that constitute them, and a river is conceptualized at a different layer from the atoms that constitute it.",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è costituente di"}
                {:rdf/language "en",
                 :rdf/value    "is constituent of"}],
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/associatedWith})

(def isConstraintFor
  "A relation between parameters and entities. It allows to assert generic constraints (encoded as parameters), e.g. MinimumAgeForDriving isConstraintFor John (where John is a legal subject under the TrafficLaw). The intended semantics (not expressible in OWL) is that a Parameter isConstraintFor and Entity if the Parameter isParameterFor a Concept that classifies that Entity; moreover, it entails that a Parameter parametrizes a Region that isRegionFor that Entity. The use in OWL is therefore a shortcut to annotate what Parameter constrains what Entity"
  {:db/ident :dul/isConstraintFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between parameters and entities. It allows to assert generic constraints (encoded as parameters), e.g. MinimumAgeForDriving isConstraintFor John (where John is a legal subject under the TrafficLaw).\nThe intended semantics (not expressible in OWL) is that a Parameter isConstraintFor and Entity if the Parameter isParameterFor a Concept that classifies that Entity; moreover, it entails that a Parameter parametrizes a Region that isRegionFor that Entity. The use in OWL is therefore a shortcut to annotate what Parameter constrains what Entity",
   :rdfs/domain :dul/Parameter,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è un vincolo per"}
                {:rdf/language "en",
                 :rdf/value    "is constraint for"}],
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/classifies})

(def isCoveredBy
  "A relation between concepts and collections, where a Concept is said to cover a Collection; it corresponds to a link between the (reified) intensional and extensional interpretations of a (reified) class. E.g. the collection of vintage saxophones is covered by the Concept 'Saxophone' with the Parameter 'Vintage'."
  {:db/ident :dul/isCoveredBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between concepts and collections, where a Concept is said to cover a Collection; it corresponds to a link between the (reified) intensional and extensional interpretations of a (reified) class.\nE.g. the collection of vintage saxophones is covered by the Concept 'Saxophone' with the Parameter 'Vintage'.",
   :rdfs/domain :dul/Collection,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è ricoperto da"}
                {:rdf/language "en",
                 :rdf/value    "is covered by"}],
   :rdfs/range :dul/Concept,
   :rdfs/subPropertyOf :dul/associatedWith})

(def isDefinedIn
  "A relation between a Description and a Concept, e.g. a Workflow for a governmental Organization defines the Role 'officer', or 'the Italian Traffic Law defines the role Vehicle'."
  {:db/ident :dul/isDefinedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between a Description and a Concept, e.g. a Workflow for a governmental Organization defines the Role 'officer', or 'the Italian Traffic Law defines the role Vehicle'.",
   :rdfs/domain :dul/Concept,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è definito in"}
                {:rdf/language "en",
                 :rdf/value    "is defined in"}],
   :rdfs/range :dul/Description,
   :rdfs/subPropertyOf :dul/isConceptUsedIn})

(def isDescribedBy
  "The relation between an Entity and a Description: a Description gives a unity to a Collection of parts (the components), or constituents, by assigning a Role to each of them in the context of a whole Object (the system). A same Entity can be given different descriptions, for example, an old cradle can be given a unifying Description based on the original aesthetic design, the functionality it was built for, or a new aesthetic functionality in which it can be used as a flower pot."
  {:db/ident :dul/isDescribedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The relation between an Entity and a Description: a Description gives a unity to a Collection of parts (the components), or constituents, by assigning a Role to each of them in the context of a whole Object (the system).\nA same Entity can be given different descriptions, for example, an old cradle can be given a unifying Description based on the original aesthetic design, the functionality it was built for, or a new aesthetic functionality in which it can be used as a flower pot.",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è descritto da"}
                {:rdf/language "en",
                 :rdf/value    "is described by"}],
   :rdfs/range :dul/Description,
   :rdfs/subPropertyOf :dul/associatedWith})

(def isEventIncludedIn
  "is event included in"
  {:db/ident           :dul/isEventIncludedIn,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :dul/Event,
   :rdfs/isDefinedBy   "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label         [{:rdf/language "it",
                         :rdf/value    "è un evento nel contesto di"}
                        {:rdf/language "en",
                         :rdf/value    "is event included in"}],
   :rdfs/range         :dul/Situation,
   :rdfs/subPropertyOf :dul/hasSetting})

(def isExecutedIn
  "A relation between an action and a task, e.g. 'putting some water in a pot and putting the pot on a fire until the water starts bubbling' executes the task 'boiling'."
  {:db/ident :dul/isExecutedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between an action and a task, e.g. 'putting some water in a pot and putting the pot on a fire until the water starts bubbling' executes the task 'boiling'.",
   :rdfs/domain :dul/Task,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è eseguito mediante"}
                {:rdf/language "en",
                 :rdf/value    "is executed in"}],
   :rdfs/range :dul/Action,
   :rdfs/subPropertyOf :dul/classifies})

(def isExpandedIn
  "A partial order relation that holds between descriptions. It represents the proper part relation between a description and another description featuring the same properties as the former, with at least one additional one. Descriptions can be expanded either by adding other descriptions as parts, or by refining concepts that are used by them. An 'intention' to expand must be present (unless purely formal theories are considered, but even in this case a criterion of relevance is usually active)."
  {:db/ident :dul/isExpandedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A partial order relation that holds between descriptions. It represents the proper part relation between a description and another description featuring the same properties as the former, with at least one additional one.\nDescriptions can be expanded either by adding other descriptions as parts, or by refining concepts that are used by them. \nAn 'intention' to expand must be present (unless purely formal theories are considered, but even in this case a criterion of relevance is usually active).",
   :rdfs/domain :dul/Description,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è espansa in"}
                {:rdf/language "en",
                 :rdf/value    "is expanded in"}],
   :rdfs/range :dul/Description,
   :rdfs/subPropertyOf :dul/isRelatedToDescription})

(def isExpressedBy
  "A relation between a dul:SocialObject (the 'meaning') and a dul:InformationObject (the 'expression'). For example: 'A Beehive is a structure in which bees are kept, typically in the form of a dome or box.' (Oxford dictionary)'; 'the term Beehive expresses the concept Beehive in my apiculture ontology'. The intuition for 'meaning' is intended to be very broad. A separate, large comment is included in the encoding of 'expresses', for those who want to investigate more on what kind of meaning can be represented in what form."
  {:db/ident :dul/isExpressedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between a dul:SocialObject (the 'meaning') and a dul:InformationObject (the 'expression'). \nFor example: 'A Beehive is a structure in which bees are kept, typically in the form of a dome or box.' (Oxford dictionary)'; 'the term Beehive expresses the concept Beehive in my apiculture ontology'.\nThe intuition for 'meaning' is intended to be very broad. A separate, large comment is included in the encoding of 'expresses', for those who want to investigate more on what kind of meaning can be represented in what form.",
   :rdfs/domain :dul/SocialObject,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è espresso da"}
                {:rdf/language "en",
                 :rdf/value    "is expressed by"}],
   :rdfs/range :dul/InformationObject,
   :rdfs/subPropertyOf :dul/associatedWith})

(def isIntroducedBy
  "A relation between a Description and a SocialAgent, e.g. a Constitutional Charter introduces the SocialAgent 'PresidentOfRepublic'."
  {:db/ident :dul/isIntroducedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between a Description and a SocialAgent, e.g. a Constitutional Charter introduces the SocialAgent 'PresidentOfRepublic'.",
   :rdfs/domain :dul/SocialAgent,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è introdotto da"}
                {:rdf/language "en",
                 :rdf/value    "is introduced by"}],
   :rdfs/range :dul/Description,
   :rdfs/subPropertyOf :dul/associatedWith})

(def isLocationOf
  "A generic, relative localization, holding between any entities. E.g. 'Rome is the seat of the Pope', 'the liver is the location of the tumor'. For 'absolute' locations, see SpaceRegion"
  {:db/ident :dul/isLocationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A generic, relative localization, holding between any entities. E.g. 'Rome is the seat of the Pope', 'the liver is the location of the tumor'.\nFor 'absolute' locations, see SpaceRegion",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è una localizzazione di"}
                {:rdf/language "en",
                 :rdf/value    "is location of"}],
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/associatedWith})

(def isMemberOf
  "A relation between collections and entities, e.g. 'the Night Watch by Rembrandt is in the Rijksmuseum collection'; 'Davide is member of the Pen Club', 'Igor is one the subjects chosen for the experiment'."
  {:db/ident :dul/isMemberOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between collections and entities, e.g. 'the Night Watch by Rembrandt is in the Rijksmuseum collection'; 'Davide is member of the Pen Club', 'Igor is one the subjects chosen for the experiment'.",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è membro di"}
                {:rdf/language "en",
                 :rdf/value    "is member of"}],
   :rdfs/range :dul/Collection,
   :rdfs/subPropertyOf :dul/associatedWith})

(def isObjectIncludedIn
  "is object included in"
  {:db/ident           :dul/isObjectIncludedIn,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :dul/Object,
   :rdfs/isDefinedBy   "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label         [{:rdf/language "it",
                         :rdf/value    "è un oggetto nel contesto di"}
                        {:rdf/language "en",
                         :rdf/value    "is object included in"}],
   :rdfs/range         :dul/Situation,
   :rdfs/subPropertyOf :dul/hasSetting})

(def isObservableAt
  "A relation to represent a (past, present or future) TimeInterval at which an Entity is observable. In order to encode a specific time, a data value should be related to the TimeInterval. An alternative way of representing time is the datatype property: hasIntervalDate"
  {:db/ident :dul/isObservableAt,
   :owl/inverseOf :dul/isTimeOfObservationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation to represent a (past, present or future) TimeInterval at which an Entity is observable.\nIn order to encode a specific time, a data value should be related to the TimeInterval. \nAn alternative way of representing time is the datatype property: hasIntervalDate",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è osservabile a"}
                {:rdf/language "en",
                 :rdf/value    "is observable at"}],
   :rdfs/range :dul/TimeInterval,
   :rdfs/subPropertyOf :dul/hasRegion})

(def isParameterFor
  "A Concept can have a Parameter that constrains the attributes that a classified Entity can have in a certain Situation, e.g. a 4WheelDriver Role definedIn the ItalianTrafficLaw has a MinimumAge parameter on the Amount 16."
  {:db/ident :dul/isParameterFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A Concept can have a Parameter that constrains the attributes that a classified Entity can have in a certain Situation, e.g. a 4WheelDriver Role definedIn the ItalianTrafficLaw has a MinimumAge parameter on the Amount 16.",
   :rdfs/domain :dul/Parameter,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è un parametro per"}
                {:rdf/language "en",
                 :rdf/value    "is parameter for"}],
   :rdfs/range :dul/Concept,
   :rdfs/subPropertyOf :dul/isRelatedToConcept})

(def isParametrizedBy
  "The relation between a Parameter, e.g. 'MajorAge', and a Region, e.g. '>17 year'."
  {:db/ident :dul/isParametrizedBy,
   :owl/inverseOf :dul/parametrizes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The relation between a Parameter, e.g. 'MajorAge', and a Region, e.g. '>17 year'.",
   :rdfs/domain :dul/Region,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è parametrizzato da"}
                {:rdf/language "en",
                 :rdf/value    "is parametrized by"}],
   :rdfs/range :dul/Parameter,
   :rdfs/subPropertyOf :dul/isClassifiedBy})

(def isPartOf
  "A relation between any entities, e.g. 'brain is a part of the human body'. See dul:hasPart for additional documentation."
  {:db/ident :dul/isPartOf,
   :rdf/type
   [:owl/ObjectProperty :owl/TransitiveProperty :owl/ReflexiveProperty],
   :rdfs/comment
   "A relation between any entities, e.g. 'brain is a part of the human body'. See dul:hasPart for additional documentation.",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è parte di"}
                {:rdf/language "en",
                 :rdf/value    "is part of"}],
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/associatedWith})

(def isParticipantIn
  "A relation between an object and a process, e.g. 'John took part in the discussion', 'a large mass of snow fell during the avalanche', or 'a cook, some sugar, flour, etc. are all present in the cooking of a cake'."
  {:db/ident :dul/isParticipantIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between an object and a process, e.g. 'John took part in the discussion', 'a large mass of snow fell during the avalanche', or 'a cook, some sugar, flour, etc. are all present in the cooking of a cake'.",
   :rdfs/domain :dul/Object,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è un partecipante a"}
                {:rdf/language "en",
                 :rdf/value    "is participant in"}],
   :rdfs/range :dul/Event,
   :rdfs/subPropertyOf :dul/associatedWith})

(def isPostconditionOf
  "Direct succession applied to situations. E.g., 'Taking some rest is a postcondition of my search for a hotel'."
  {:db/ident :dul/isPostconditionOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Direct succession applied to situations. \nE.g., 'Taking some rest is a postcondition of my search for a hotel'.",
   :rdfs/domain {:owl/unionOf [:dul/Event :dul/Situation],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è postcondizione di"}
                {:rdf/language "en",
                 :rdf/value    "is postcondition of"}],
   :rdfs/range {:owl/unionOf [:dul/Event :dul/Situation],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :dul/directlyFollows})

(def isPreconditionOf
  "Direct precedence applied to situations. E.g., 'claiming to find nuclear weapons in a foreign country is a precondition to declare war against it'."
  {:db/ident :dul/isPreconditionOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Direct precedence applied to situations. \nE.g., 'claiming to find nuclear weapons in a foreign country is a precondition to declare war against it'.",
   :rdfs/domain {:owl/unionOf [:dul/Event :dul/Situation],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è precondizione di"}
                {:rdf/language "en",
                 :rdf/value    "is precondition of"}],
   :rdfs/range {:owl/unionOf [:dul/Event :dul/Situation],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :dul/directlyPrecedes})

(def isPropertPartOf
  "See dul:hasProperPart for additional documentation."
  {:db/ident           :dul/isPropertPartOf,
   :rdf/type           [:owl/TransitiveProperty :owl/ObjectProperty],
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "See dul:hasProperPart for additional documentation."},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "is propert part of"},
   :rdfs/subPropertyOf :dul/isPartOf})

(def isQualityOf
  "A relation between entities and qualities, e.g. 'Dmitri's skin is yellowish'."
  {:db/ident :dul/isQualityOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between entities and qualities, e.g. 'Dmitri's skin is yellowish'.",
   :rdfs/domain :dul/Quality,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è una qualità di"}
                {:rdf/language "en",
                 :rdf/value    "is quality of"}],
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/associatedWith})

(def isRealizedBy
  "A relation between an information realization and an information object, e.g. the paper copy of the Italian Constitution realizes the text of the Constitution."
  {:db/ident :dul/isRealizedBy,
   :owl/inverseOf :dul/realizes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between an information realization and an information object, e.g. the paper copy of the Italian Constitution realizes the text of the Constitution.",
   :rdfs/domain :dul/InformationObject,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è realizzato da"}
                {:rdf/language "en",
                 :rdf/value    "is realized by"}],
   :rdfs/range :dul/InformationRealization,
   :rdfs/subPropertyOf :dul/associatedWith})

(def isReferenceOf
  "A relation between information objects and any Entity (including information objects). It can be used to talk about e.g. entities are references of proper nouns: the proper noun 'Leonardo da Vinci' isAbout the Person Leonardo da Vinci; as well as to talk about sets of entities that can be described by a common noun: the common noun 'person' isAbout the set of all persons in a domain of discourse, which can be represented in DOLCE-Ultralite as an individual of the class: Collection . The isReferenceOf relation is irreflexive, differently from its inverse isAbout."
  {:db/ident :dul/isReferenceOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between information objects and any Entity (including information objects). It can be used to talk about e.g. entities are references of proper nouns: the proper noun 'Leonardo da Vinci' isAbout the Person Leonardo da Vinci; as well as to talk about sets of entities that can be described by a common noun: the common noun 'person' isAbout the set of all persons in a domain of discourse, which can be represented in DOLCE-Ultralite as an individual of the class: Collection .\nThe isReferenceOf relation is irreflexive, differently from its inverse isAbout.",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è il riferimento di"}
                {:rdf/language "en",
                 :rdf/value    "is reference of"}],
   :rdfs/range :dul/InformationObject,
   :rdfs/subPropertyOf :dul/associatedWith})

(def isReferenceOfInformationRealizedBy
  "The relation between entities and information realizations, e.g. between Italy and a paper copy of the text of the Italian Constitution."
  {:db/ident :dul/isReferenceOfInformationRealizedBy,
   :owl/inverseOf :dul/realizesInformationAbout,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The relation between entities and information realizations, e.g. between Italy and a paper copy of the text of the Italian Constitution.",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è riferimento dell'informazione realizzata da"}
                {:rdf/language "en",
                 :rdf/value    "is reference of information realized by"}],
   :rdfs/range :dul/InformationRealization,
   :rdfs/subPropertyOf :dul/associatedWith})

(def isRegionFor
  "A relation between entities and regions, e.g. 'the color of my car is red'."
  {:db/ident :dul/isRegionFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between entities and regions, e.g. 'the color of my car is red'.",
   :rdfs/domain :dul/Region,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è una regione di"}
                {:rdf/language "en",
                 :rdf/value    "is region for"}],
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/associatedWith})

(def isRelatedToConcept
  "Any relation between concepts, e.g. superordinated, conceptual parthood, having a parameter, having a task, superordination, etc."
  {:db/ident :dul/isRelatedToConcept,
   :owl/inverseOf :dul/isRelatedToConcept,
   :rdf/type [:owl/ObjectProperty :owl/SymmetricProperty],
   :rdfs/comment
   "Any relation between concepts, e.g. superordinated, conceptual parthood, having a parameter, having a task, superordination, etc.",
   :rdfs/domain :dul/Concept,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "is related to concept"}
                {:rdf/language "it",
                 :rdf/value    "è associato al concetto"}],
   :rdfs/range :dul/Concept,
   :rdfs/subPropertyOf :dul/associatedWith})

(def isRelatedToDescription
  "Any relation between descriptions."
  {:db/ident           :dul/isRelatedToDescription,
   :owl/inverseOf      :dul/isRelatedToDescription,
   :rdf/type           [:owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/comment       "Any relation between descriptions.",
   :rdfs/domain        :dul/Description,
   :rdfs/isDefinedBy   "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label         [{:rdf/language "it",
                         :rdf/value    "è associata alla descrizione"}
                        {:rdf/language "en",
                         :rdf/value    "is related to description"}],
   :rdfs/range         :dul/Description,
   :rdfs/subPropertyOf :dul/associatedWith})

(def isRoleDefinedIn
  "A relation between a description and a role, e.g. the role 'Ingredient' is defined in the recipe for a cake."
  {:db/ident :dul/isRoleDefinedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between a description and a role, e.g. the role 'Ingredient' is defined in the recipe for a cake.",
   :rdfs/domain :dul/Role,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è un ruolo definito in"}
                {:rdf/language "en",
                 :rdf/value    "is role defined in"}],
   :rdfs/range :dul/Description,
   :rdfs/subPropertyOf :dul/isDefinedIn})

(def isRoleOf
  "A relation between an object and a role, e.g. 'student' is the role of 'John'."
  {:db/ident :dul/isRoleOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between an object and a role, e.g. 'student' is the role of 'John'.",
   :rdfs/domain :dul/Role,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è un ruolo di"}
                {:rdf/language "en",
                 :rdf/value    "is role of"}],
   :rdfs/range :dul/Object,
   :rdfs/subPropertyOf :dul/classifies})

(def isSatisfiedBy
  "A relation between a Situation and a Description, e.g. the execution of a Plan satisfies that plan."
  {:db/ident :dul/isSatisfiedBy,
   :owl/inverseOf :dul/satisfies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between a Situation and a Description, e.g. the execution of a Plan satisfies that plan.",
   :rdfs/domain :dul/Description,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è soddisfatta da"}
                {:rdf/language "en",
                 :rdf/value    "is satisfied by"}],
   :rdfs/range :dul/Situation,
   :rdfs/subPropertyOf :dul/associatedWith})

(def isSettingFor
  "A relation between situations and entities, e.g. 'this morning I've prepared my coffee with a new fantastic Arabica', i.e.: the preparation of my coffee this morning is the setting for (an amount of) a new fantastic Arabica."
  {:db/ident :dul/isSettingFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between situations and entities, e.g. 'this morning I've prepared my coffee with a new fantastic Arabica', i.e.: the preparation of my coffee this morning is the setting for (an amount of) a new fantastic Arabica.",
   :rdfs/domain :dul/Situation,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "is setting for"}
                {:rdf/language "it",
                 :rdf/value    "include"}],
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/associatedWith})

(def isSpecializedBy
  "A partial order relation that holds between social objects. It represents the subsumption relation between e.g. a Concept and another Concept that is broader in extensional interpretation, but narrowe in intensional interpretation. E.g. PhDStudent Role specializes Student Role"
  {:db/ident :dul/isSpecializedBy,
   :owl/inverseOf :dul/specializes,
   :rdf/type [:owl/ObjectProperty :owl/TransitiveProperty],
   :rdfs/comment
   "A partial order relation that holds between social objects. It represents the subsumption relation between e.g. a Concept and another Concept that is broader in extensional interpretation, but narrowe in intensional interpretation.\nE.g. PhDStudent Role specializes Student Role",
   :rdfs/domain :dul/SocialObject,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è specializzato da"}
                {:rdf/language "en",
                 :rdf/value    "is specialized by"}],
   :rdfs/range :dul/SocialObject,
   :rdfs/subPropertyOf :dul/associatedWith})

(def isSubordinatedTo
  "Direct succession applied to concepts. E.g. the role 'Officer' is subordinated to 'Director'."
  {:db/ident :dul/isSubordinatedTo,
   :owl/inverseOf :dul/isSuperordinatedTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Direct succession applied to concepts. E.g. the role 'Officer' is subordinated to 'Director'.",
   :rdfs/domain :dul/Concept,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è subordinato a"}
                {:rdf/language "en",
                 :rdf/value    "is subordinated to"}],
   :rdfs/range :dul/Concept,
   :rdfs/subPropertyOf [:dul/isRelatedToConcept :dul/directlyFollows]})

(def isSuperordinatedTo
  "Direct precedence applied to concepts. E.g. the role 'Executive' is superordinated to 'DepartmentManager'."
  {:db/ident :dul/isSuperordinatedTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Direct precedence applied to concepts. E.g. the role 'Executive' is superordinated to 'DepartmentManager'.",
   :rdfs/domain :dul/Concept,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è superordinato a"}
                {:rdf/language "en",
                 :rdf/value    "is superordinated to"}],
   :rdfs/range :dul/Concept,
   :rdfs/subPropertyOf [:dul/isRelatedToConcept :dul/directlyPrecedes]})

(def isTaskDefinedIn
  "A relation between a description and a task, e.g. the task 'boil' is defined in a recipe for a cake."
  {:db/ident :dul/isTaskDefinedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between a description and a task, e.g. the task 'boil' is defined in a recipe for a cake.",
   :rdfs/domain :dul/Task,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è un task definito in"}
                {:rdf/language "en",
                 :rdf/value    "is task defined in"}],
   :rdfs/range :dul/Description,
   :rdfs/subPropertyOf :dul/isDefinedIn})

(def isTaskOf
  "A relation between roles and tasks, e.g. 'students have the duty of giving exams' (i.e. the Role 'student' hasTask the Task 'giving exams')."
  {:db/ident :dul/isTaskOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between roles and tasks, e.g. 'students have the duty of giving exams' (i.e. the Role 'student' hasTask the Task 'giving exams').",
   :rdfs/domain :dul/Task,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è un obiettivo per"}
                {:rdf/language "en",
                 :rdf/value    "is task of"}],
   :rdfs/range :dul/Role,
   :rdfs/subPropertyOf :dul/isRelatedToConcept})

(def isTimeIncludedIn
  "is time included in"
  {:db/ident           :dul/isTimeIncludedIn,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :dul/TimeInterval,
   :rdfs/isDefinedBy   "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label         [{:rdf/language "it",
                         :rdf/value    "è un tempo nel contesto di"}
                        {:rdf/language "en",
                         :rdf/value    "is time included in"}],
   :rdfs/range         :dul/Situation,
   :rdfs/subPropertyOf :dul/hasSetting})

(def isTimeIntervalOf
  "The generic relation between time intervals and events."
  {:db/ident :dul/isTimeIntervalOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The generic relation between time intervals and events."},
   :rdfs/domain :dul/TimeInterval,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "is time interval of"}
                {:rdf/language "it",
                 :rdf/value    "intervallo temporale di"}],
   :rdfs/range :dul/Event,
   :rdfs/subPropertyOf :dul/isRegionFor})

(def isTimeOfObservationOf
  "A relation to represent a (past, present or future) TimeInterval at which an Entity is observable. In order to encode a specific time, a data value should be related to the TimeInterval. An alternative way of representing time is the datatype property: hasIntervalDate"
  {:db/ident :dul/isTimeOfObservationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation to represent a (past, present or future) TimeInterval at which an Entity is observable.\nIn order to encode a specific time, a data value should be related to the TimeInterval. \nAn alternative way of representing time is the datatype property: hasIntervalDate",
   :rdfs/domain :dul/TimeInterval,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è il tempo di osservazione di"}
                {:rdf/language "en",
                 :rdf/value    "is time of observation of"}],
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/isRegionFor})

(def isUnifiedBy
  "A Collection has a unification criterion, provided by a Description; for example, a community of practice can be unified by a shared theory or interest, e.g. the community that makes research on mirror neurons shares some core knowledge about mirror neurons, which can be represented as a Description MirrorNeuronTheory that unifies the community. There can be several unifying descriptions."
  {:db/ident :dul/isUnifiedBy,
   :owl/inverseOf :dul/unifies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A Collection has a unification criterion, provided by a Description; for example, a community of practice can be unified by a shared theory or interest, e.g. the community that makes research on mirror neurons shares some core knowledge about mirror neurons, which can be represented as a Description MirrorNeuronTheory that unifies the community. There can be several unifying descriptions.",
   :rdfs/domain :dul/Collection,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "è unificato da"}
                {:rdf/language "en",
                 :rdf/value    "is unified by"}],
   :rdfs/range :dul/Description,
   :rdfs/subPropertyOf :dul/associatedWith})

(def nearTo
  "Generic distance relation between any Entity(s). E.g. Rome is near to Florence, astronomy is near to physics."
  {:db/ident :dul/nearTo,
   :owl/inverseOf :dul/nearTo,
   :rdf/type [:owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/comment
   "Generic distance relation between any Entity(s). E.g. Rome is near to Florence, astronomy is near to physics.",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "near to"},
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/associatedWith})

(def overlaps
  "A schematic relation between any entities, e.g. 'the chest region overlaps with the abdomen region', 'my spoken words overlap with hers', 'the time of my leave overlaps with the time of your arrival', 'fibromyalgia overlaps with other conditions'. Subproperties and restrictions can be used to specialize overlaps for objects, events, time intervals, etc."
  {:db/ident :dul/overlaps,
   :owl/inverseOf :dul/overlaps,
   :rdf/type [:owl/ObjectProperty :owl/SymmetricProperty],
   :rdfs/comment
   "A schematic relation between any entities, e.g. 'the chest region overlaps with the abdomen region', 'my spoken words overlap with hers', 'the time of my leave overlaps with the time of your arrival', 'fibromyalgia overlaps with other conditions'.\nSubproperties and restrictions can be used to specialize overlaps for objects, events, time intervals, etc.",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "overlaps"}
                {:rdf/language "it",
                 :rdf/value    "sovrapposto a"}],
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/associatedWith})

(def parametrizes
  "The relation between a Parameter, e.g. 'MajorAgeLimit', and a Region, e.g. '18_year'. For a more data-oriented relation, see hasDataValue"
  {:db/ident :dul/parametrizes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The relation between a Parameter, e.g. 'MajorAgeLimit', and a Region, e.g. '18_year'.\nFor a more data-oriented relation, see hasDataValue",
   :rdfs/domain :dul/Parameter,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "parametrizza"}
                {:rdf/language "en",
                 :rdf/value    "parametrizes"}],
   :rdfs/range :dul/Region,
   :rdfs/subPropertyOf :dul/classifies})

(def precedes
  "A relation between entities, expressing a 'sequence' schema. E.g. 'year 1999 precedes 2000', 'deciding what coffee to use' precedes 'preparing coffee', 'World War II follows World War I', 'in the Milan to Rome autoroute, Bologna precedes Florence', etc. It can then be used between tasks, processes, time intervals, spatially locate objects, situations, etc. Subproperties can be defined in order to distinguish the different uses."
  {:db/ident :dul/precedes,
   :rdf/type [:owl/TransitiveProperty :owl/ObjectProperty],
   :rdfs/comment
   "A relation between entities, expressing a 'sequence' schema. \nE.g. 'year 1999 precedes 2000', 'deciding what coffee to use' precedes 'preparing coffee', 'World War II follows World War I', 'in the Milan to Rome autoroute, Bologna precedes Florence', etc.\nIt can then be used between tasks, processes, time intervals, spatially locate objects, situations, etc. \nSubproperties can be defined in order to distinguish the different uses.",
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "precedes"}
                {:rdf/language "it",
                 :rdf/value    "precede"}],
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/associatedWith})

(def realizes
  "A relation between an information realization and an information object, e.g. the paper copy of the Italian Constitution realizes the text of the Constitution."
  {:db/ident :dul/realizes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between an information realization and an information object, e.g. the paper copy of the Italian Constitution realizes the text of the Constitution.",
   :rdfs/domain :dul/InformationRealization,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "realizza"}
                {:rdf/language "en",
                 :rdf/value    "realizes"}],
   :rdfs/range :dul/InformationObject,
   :rdfs/subPropertyOf :dul/associatedWith})

(def realizesInformationAbout
  "The relation between entities and information realizations, e.g. between Italy and a paper copy of the text of the Italian Constitution."
  {:db/ident :dul/realizesInformationAbout,
   :owl/propertyChainAxiom [:dul/realizes :dul/isAbout],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The relation between entities and information realizations, e.g. between Italy and a paper copy of the text of the Italian Constitution.",
   :rdfs/domain :dul/InformationRealization,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "realizza informazione che si riferisce a"}
                {:rdf/language "en",
                 :rdf/value    "realizes information about"}],
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/associatedWith})

(def realizesSelfInformation
  "This relation is a workaround to enable local reflexivity axioms (Self) working with non-simple properties; in this case, dul:realizesInformation About."
  {:db/ident :dul/realizesSelfInformation,
   :dc11/creator "Aldo Gangemi",
   :dc11/date #inst "2021-04-05T22:31:22.000-00:00",
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "This relation is a workaround to enable local reflexivity axioms (Self) working with non-simple properties; in this case, dul:realizesInformation About.",
   :rdfs/subPropertyOf :dul/realizesInformationAbout})

(def sameSettingAs
  "A relation between two entities participating in a same Situation; e.g., 'Our company provides an antivenom service' (the situation is the service, the two entities are the company and the antivenom)."
  {:db/ident :dul/sameSettingAs,
   :owl/inverseOf :dul/sameSettingAs,
   :owl/propertyChainAxiom [:dul/hasSetting :dul/isSettingFor],
   :rdf/type [:owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/comment
   {:rdf/language "it",
    :rdf/value
    "A relation between two entities participating in a same Situation; e.g., 'Our company provides an antivenom service' (the situation is the service, the two entities are the company and the antivenom)."},
   :rdfs/domain :dul/Entity,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "is in the same setting as"}
                {:rdf/language "it",
                 :rdf/value    "è nella stessa situazione di"}],
   :rdfs/range :dul/Entity,
   :rdfs/subPropertyOf :dul/associatedWith})

(def satisfies
  "A relation between a Situation and a Description, e.g. the execution of a Plan satisfies that plan."
  {:db/ident :dul/satisfies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between a Situation and a Description, e.g. the execution of a Plan satisfies that plan.",
   :rdfs/domain :dul/Situation,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "soddisfa"}
                {:rdf/language "en",
                 :rdf/value    "satisfies"}],
   :rdfs/range :dul/Description,
   :rdfs/subPropertyOf :dul/associatedWith})

(def specializes
  "A partial order relation that holds between social objects. It mainly represents the subsumption relation between e.g. a Concept or Description and another Concept (resp. Description) that is broader in extensional interpretation, but narrower in intensional interpretation. For example, the role PhDStudent specializes the role Student. Another possible use is between a Collection that isCoveredBy a Concept A, and another Collection that isCoveredBy a Concept B that on its turm specializes A. For example, the 70,000 series Selmer Mark VI saxophone Collection specializes the Selmer Mark VI saxophone Collection."
  {:db/ident :dul/specializes,
   :rdf/type [:owl/TransitiveProperty :owl/ObjectProperty],
   :rdfs/comment
   "A partial order relation that holds between social objects. \nIt mainly represents the subsumption relation between e.g. a Concept or Description and another Concept (resp. Description) that is broader in extensional interpretation, but narrower in intensional interpretation. For example, the role PhDStudent specializes the role Student.\nAnother possible use is between a Collection that isCoveredBy a Concept A, and another Collection that isCoveredBy a Concept B that on its turm specializes A. For example, the 70,000 series Selmer Mark VI saxophone Collection specializes the Selmer Mark VI saxophone Collection.",
   :rdfs/domain :dul/SocialObject,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "specializza"}
                {:rdf/language "en",
                 :rdf/value    "specializes"}],
   :rdfs/range :dul/SocialObject,
   :rdfs/subPropertyOf :dul/associatedWith})

(def unifies
  "A Collection has a unification criterion, provided by a Description; for example, a community of practice can be unified by a shared theory or interest, e.g. the community that makes research on mirror neurons shares some core knowledge about mirror neurons, which can be represented as a Description MirrorNeuronTheory that unifies the community. There can be several unifying descriptions."
  {:db/ident :dul/unifies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A Collection has a unification criterion, provided by a Description; for example, a community of practice can be unified by a shared theory or interest, e.g. the community that makes research on mirror neurons shares some core knowledge about mirror neurons, which can be represented as a Description MirrorNeuronTheory that unifies the community. There can be several unifying descriptions.",
   :rdfs/domain :dul/Description,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "unifies"}
                {:rdf/language "it",
                 :rdf/value    "unifica"}],
   :rdfs/range :dul/Collection,
   :rdfs/subPropertyOf :dul/associatedWith})

(def usesConcept
  "A generic relation holding between a Description and a Concept. In order to be used, a Concept must be previously definedIn another Description. This last condition cannot be encoded for object properties in OWL."
  {:db/ident :dul/usesConcept,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A generic relation holding between a Description and a Concept. In order to be used, a Concept must be previously definedIn another Description. This last condition cannot be encoded for object properties in OWL.",
   :rdfs/domain :dul/Description,
   :rdfs/isDefinedBy "http://www.ontologydesignpatterns.org/ont/dul/DUL.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "uses concept"}
                {:rdf/language "it",
                 :rdf/value    "usa il concetto"}],
   :rdfs/range :dul/Concept,
   :rdfs/subPropertyOf :dul/associatedWith})
