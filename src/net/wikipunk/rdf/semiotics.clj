(ns net.wikipunk.rdf.semiotics
  "A content ontology pattern that encodes a basic semiotic theory, by reusing the situation pattern. The basic classes are: Expression, Meaning, Reference (the semiotic triangle), LinguisticAct (for the pragmatics), and Agent. A linguistic act is said to be context for expressions, with their meanings and references, and agents involved. Based on this pattern, several specific linguistic acts, such as 'tagging', 'translating', 'defining', 'formalizing', etc. can be defined, so constituting a formal vocabulary for a pragmatic web. This pattern has been extracted from a larger reference ontology, LMM, which is used in conjunction with DOLCE+DnS (http://www.ontologydesignpatterns.org/ont/dul/DUL.owl), in order to provide a metamodel to Wordnet, Linked Open Data, natural language processing data, etc."
  {:cpannotationschema/coversRequirements
   "What's the meaning of that expression?,What that expression is about?,Who said that, and what was it referring to?,In what contexts that expression means this?,How that expression, referring to a certain thing, has been manifested by whom?",
   :cpannotationschema/extractedFrom
   "http://www.ontologydesignpatterns.org/ont/lmm/LMM_L1.owl",
   :cpannotationschema/hasAuthor "Aldo Gangemi",
   :cpannotationschema/hasConsequences
   "We can represent meanings or references of expressions, the context in which they have been used (e.g. the agent who used them), their manifestation.\nIt differs from intensionextension.owl, which is purely about meaning and reference of expressions.\nA property chain also allows to infer aboutness and meaning of manifestations, not only (immaterial) information objects.",
   :cpannotationschema/relatedCPs "IntensionExtension",
   :owl/imports "http://www.ontologydesignpatterns.org/cp/owl/situation.owl",
   :owl/versionInfo
   ["1.1 added rdfs:isDefinedBy for all named entities"
    "1.1\n- Revised, added OWL2 axioms, added annotations for ODP submission\n1.0\n- Created by Aldo Gangemi (2007)"],
   :rdf/ns-prefix-map
   {"agentrole" "http://www.ontologydesignpatterns.org/cp/owl/agentrole.owl#",
    "cpannotationschema"
    "http://www.ontologydesignpatterns.org/schemas/cpannotationschema.owl#",
    "owl"       "http://www.w3.org/2002/07/owl#",
    "rdf"       "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"      "http://www.w3.org/2000/01/rdf-schema#",
    "semiotics" "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl#",
    "situation" "http://www.ontologydesignpatterns.org/cp/owl/situation.owl#",
    "xsd"       "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl",
   :rdfa/prefix "semiotics",
   :rdfa/uri "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl#",
   :rdfs/comment
   "A content ontology pattern that encodes a basic semiotic theory, by reusing the situation pattern.\nThe basic classes are: Expression, Meaning, Reference (the semiotic triangle), LinguisticAct (for the pragmatics), and Agent.\nA linguistic act is said to be context for expressions, with their meanings and references, and agents involved.\nBased on this pattern, several specific linguistic acts, such as 'tagging', 'translating', 'defining', 'formalizing', etc. can be defined, so constituting a formal vocabulary for a pragmatic web.\nThis pattern has been extracted from a larger reference ontology, LMM, which is used in conjunction with DOLCE+DnS (http://www.ontologydesignpatterns.org/ont/dul/DUL.owl), in order to provide a metamodel to Wordnet, Linked Open Data, natural language processing data, etc."})

(def Expression
  "Any information that either dul:expresses a Meaning or denotes a Reference"
  {:db/ident :semiotics/Expression,
   :owl/equivalentClass {:owl/onProperty     :semiotics/expresses,
                         :owl/someValuesFrom :semiotics/Meaning,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any information that either dul:expresses a Meaning or denotes a Reference",
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Expression"},
   :rdfs/subClassOf [{:owl/onProperty     :semiotics/hasManifestation,
                      :owl/someValuesFrom :semiotics/Manifestation,
                      :rdf/type           :owl/Restriction}
                     :semiotics/InformationEntity]})

(def InformationEntity
  "Either an information object (expression) or its realization (manifestation)."
  {:db/ident :semiotics/InformationEntity,
   :owl/equivalentClass
   [{:owl/unionOf [{:owl/onProperty     :semiotics/denotes,
                    :owl/someValuesFrom :semiotics/Reference,
                    :rdf/type           :owl/Restriction}
                   {:owl/onProperty     :semiotics/hasInterpretant,
                    :owl/someValuesFrom :semiotics/Meaning,
                    :rdf/type           :owl/Restriction}],
     :rdf/type    :owl/Class}
    {:owl/unionOf [:semiotics/Expression :semiotics/Manifestation],
     :rdf/type    :owl/Class}],
   :rdf/type :owl/Class,
   :rdfs/comment
   "Either an information object (expression) or its realization (manifestation).",
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl",
   :rdfs/label "InformationEntity"})

(def LinguisticAct
  "A communicative situation including expressions, agents, and the semiotic elements: physical (manifestations), conceptual (meanings), and referential (references)."
  {:db/ident :semiotics/LinguisticAct,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A communicative situation including expressions, agents, and the semiotic elements: physical (manifestations), conceptual (meanings), and referential (references).",
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Linguistic act"}
                {:rdf/language "it",
                 :rdf/value    "Atto linguistico"}],
   :rdfs/subClassOf [{:owl/onProperty     :situation/isSettingFor,
                      :owl/someValuesFrom :semiotics/Expression,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :situation/isSettingFor,
                      :owl/someValuesFrom :semiotics/Reference,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :situation/isSettingFor,
                      :owl/someValuesFrom :semiotics/Meaning,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :situation/isSettingFor,
                      :owl/someValuesFrom :semiotics/Manifestation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :situation/isSettingFor,
                      :owl/someValuesFrom :agentrole/Agent,
                      :rdf/type           :owl/Restriction}
                     :situation/Situation]})

(def Manifestation
  {:db/ident :semiotics/Manifestation,
   :owl/equivalentClass {:owl/onProperty     :semiotics/isManifestationOf,
                         :owl/someValuesFrom :semiotics/InformationEntity,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl",
   :rdfs/subClassOf :semiotics/InformationEntity})

(def Meaning
  "Any conceptualization that isExpressedBy an Expression, or isInterpretationOf a Reference"
  {:db/ident :semiotics/Meaning,
   :owl/equivalentClass
   {:owl/unionOf [{:owl/onProperty     :semiotics/isConceptualizationOf,
                   :owl/someValuesFrom :semiotics/Reference,
                   :rdf/type           :owl/Restriction}
                  {:owl/onProperty     :semiotics/isInterpretantFor,
                   :owl/someValuesFrom :semiotics/InformationEntity,
                   :rdf/type           :owl/Restriction}],
    :rdf/type    :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment
   "Any conceptualization that isExpressedBy an Expression, or isInterpretationOf a Reference",
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Meaning"}})

(def Reference
  "Anything that isDenotedBy an Expression, or that hasInterpretation some Meaning"
  {:db/ident :semiotics/Reference,
   :owl/equivalentClass
   {:owl/unionOf [{:owl/onProperty     :semiotics/hasConceptualization,
                   :owl/someValuesFrom :semiotics/Meaning,
                   :rdf/type           :owl/Restriction}
                  {:owl/onProperty     :semiotics/isDenotedBy,
                   :owl/someValuesFrom :semiotics/InformationEntity,
                   :rdf/type           :owl/Restriction}],
    :rdf/type    :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment
   "Anything that isDenotedBy an Expression, or that hasInterpretation some Meaning",
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Reference"}})

(def denotes
  "A relation between expressions and anything (including expressions). It can be used to talk about e.g. entities denoted by proper nouns: the proper noun 'Leonardo da Vinci' denotes the person Leonardo da Vinci; as well as to talk about sets of entities that can be described by a common noun: the common noun 'person' denotes the collection of all persons in a domain of discourse. In OWL2, punning can be used to represent denotation of concept names with owl class extensions, e.g. 'mouse' denotes owl:Class:Mouse."
  {:db/ident :semiotics/denotes,
   :owl/propertyChainAxiom [:semiotics/isManifestationOf :semiotics/denotes],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between expressions and anything (including expressions). \nIt can be used to talk about e.g. entities denoted by proper nouns: the proper noun 'Leonardo da Vinci' denotes the person Leonardo da Vinci; as well as to talk about sets of entities that can be described by a common noun: the common noun 'person' denotes the collection of all persons in a domain of discourse. In OWL2, punning can be used to represent denotation of concept names with owl class extensions, e.g. 'mouse' denotes owl:Class:Mouse.",
   :rdfs/domain :semiotics/InformationEntity,
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "denotes"},
   :rdfs/range :semiotics/Reference})

(def expresses
  "This is a large comment field for those who want to investigate the different uses of the 'expresses' relation for modeling different approaches to meaning characterization and modeling. For example, in all these cases, some aspect of meaning is involved: - Beehive means \"a structure in which bees are kept, typically in the form of a dome or box.\" (Oxford dictionary) - 'Beehive' is a synonym in noun synset 09218159 \"beehive|hive\" (WordNet) - 'the term Beehive can be interpreted as the fact of 'being a beehive', i.e. a relation that holds for concepts such as Bee, Honey, Hosting, etc.' - 'the text of Italian apiculture regulation expresses a rule by which beehives should be kept at least one kilometer away from inhabited areas' - 'the term Beehive expresses the concept Beehive' - ''Beehive' for apiculturists does not express the same meaning as for, say, fishermen' - 'Your meaning of 'Beautiful' does not seem to fit mine' - ''Beehive' is formally interpreted as the set of all beehives' - 'from the term 'Beehive', we can build a vector space of statistically significant cooccurring terms in the documents that contain it' - the lexeme 'Belly' expresses the role 'Body_Part' in the frame 'ObservableBodyParts' (FrameNet) As the examples suggest, the 'meaning of meaning' is dependent on the background approach/theory that one assumes. One can hardly make a summary of the too many approaches and theories of meaning, therefore this relation is maybe the most controversial and difficult to explain; normally, in such cases it would be better to give up formalizing. However, the usefulness of having a 'semantic abstraction' in modeling information objects is so high (e.g. for the semantic web, interoperability, reengineering, etc.), that we accept this challenging task, although without taking any particular position in the debate. We provide here some examples, which we want to generalize upon when using the 'expresses' relation to model semantic aspects of social reality. In the most common approach, lexicographers that write dictionaries, glossaries, etc. assume that the meaning of a term is a paraphrase (or 'gloss', or 'definition'). Another approach is provided by concept schemes like thesauri and lexicons, which assume that the meaning of a term is a 'concept', encoded as a 'lemma', 'synset', or 'descriptor'. Still another approach is that of psychologists and cognitive scientists, which often assume that the meaning of an information object is a concept encoded in the mind or cognitive system of an agent. A radically different approach is taken by social scientists and semioticians, who usually assume that meanings of an information object are spread across the members of a community that use that object. Another approach that tackles the distributed nature of meaning is assumed by geometrical models of semantics, which assume that the meaning of an InformationObject (e.g. a word) results from the set of informational contexts (e.g. within texts) in which that object is used similarly. The logical approach to meaning is still different, since it assumes that the meaning of e.g. a term is equivalent to the set of individuals that the term can be applied to; for example, the meaning of 'Ali' is e.g. an individual person called Ali, the meaning of 'Airplane' is e.g. the set of airplanes, etc. Finally, an approach taken by structuralist linguistics and frame semantics is that a meaning is the relational context in which an information object can be applied; for example, a meaning of 'Airplane' is situated e.g. in the context ('frame') of passenger airline flights. These different approaches are not necessarily conflicting, and they mostly talk about different aspects of so-called 'semantics'. They can be summarized and modelled as follows (notice that such list is far from exhaustive): (1) Informal meaning (as for linguistic or commonsense semantics: a distinction is assumed between (informal) meaning and reference - Paraphrase meaning (as for lexicographic semantics). Here it is modelled as the expresses relation between instances of Expression and different instances of Expression that act as 'paraphrases' - Conceptual meaning (as for 'concept scheme' semantics). Here it is modelled as the expresses relation between instances of Expression and instances of a concept (a kind of Meaning) - Relational meaning (as for frame semantics). Here it is modelled as the expresses relation between instances of Expression and instances of a frame/relation (other kinds of Meaning) - Cognitive meaning (as for 'psychological' semantics). Here it is modelled as the expresses relation between any instance of Expression and any different instance of IExpression that isRealizedBy a mental, cognitive or neural state (depending on which theory of mind is assumed). Such states can be considered here as instances of processes (occurring in the mind, cognitive system, or neural system of an agent) - Cultural meaning (as for 'social science' semantics). Here it is modelled as the expresses relation between instances of Expression and instances of social objects (another kind of Meaning: institutions, cultural paradigms, norms, social practices, etc.) - Distributional meaning (as for geometrical models of meaning). Here it is modelled as the expresses relation between any instance of Expression and any different instance of Expression that is formally representedIn some (geometrical) region (e.g. a vector space) (2) Formal meaning (as for logic and formal semantics: no distinction is assumed between informal meaning and reference, therefore between 'expresses' and 'isAbout', which can be used interchangeably) - Object-level formal meaning (as in the traditional first-order logic semantics). Here it is modelled as the expresses relation between an instance of Expression and an instance of a collection that is a grounding for (in most cases) a set This is only a first step to provide a framework, in which one can model different aspects of Meaning. A more developed ontology should approach the problem of integrating the different uses of 'expresses', so that different theories, resources, and methods can interoperate. A relation between an Expression and a Meaning. For example: 'A Beehive is a structure in which bees are kept, typically in the form of a dome or box.' (Oxford dictionary)'; 'the term Beehive expresses the concept Beehive in my apiculture ontology'. The intuition for 'meaning' is intended to be very broad. A separate, large comment is included for those who want to investigate more on what kind of meaning can be represented in what form."
  {:db/ident :semiotics/expresses,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   ["This is a large comment field for those who want to investigate the different uses of the 'expresses' relation for modeling different approaches to meaning characterization and modeling.\nFor example, in all these cases, some aspect of meaning is involved:\n\n- Beehive means \"a structure in which bees are kept, typically in the form of a dome or box.\" (Oxford dictionary)\n- 'Beehive' is a synonym in noun synset 09218159 \"beehive|hive\" (WordNet)\n- 'the term Beehive can be interpreted as the fact of 'being a beehive', i.e. a relation that holds for concepts such as Bee, Honey, Hosting, etc.'\n- 'the text of Italian apiculture regulation expresses a rule by which beehives should be kept at least one kilometer away from inhabited areas'\n- 'the term Beehive expresses the concept Beehive'\n- ''Beehive' for apiculturists does not express the same meaning as for, say, fishermen'\n- 'Your meaning of 'Beautiful' does not seem to fit mine'\n- ''Beehive' is formally interpreted as the set of all beehives'\n- 'from the term 'Beehive', we can build a vector space of statistically significant cooccurring terms in the documents that contain it'\n- the lexeme 'Belly' expresses the role 'Body_Part' in the frame 'ObservableBodyParts' (FrameNet)\n\nAs the examples suggest, the 'meaning of meaning' is dependent on the background approach/theory that one assumes. One can hardly make a summary of the too many approaches and theories of meaning, therefore this relation is maybe the most controversial and difficult to explain; normally, in such cases it would be better to give up formalizing. \nHowever, the usefulness of having a 'semantic abstraction' in modeling information objects is so high (e.g. for the semantic web, interoperability, reengineering, etc.), that we accept this challenging task, although without taking any particular position in the debate. \nWe provide here some examples, which we want to generalize upon when using the 'expresses' relation to model semantic aspects of social reality.\n\nIn the most common approach, lexicographers that write dictionaries, glossaries, etc. assume that the meaning of a term is a paraphrase (or 'gloss', or 'definition'). \nAnother approach is provided by concept schemes like thesauri and lexicons, which assume that the meaning of a term is a 'concept', encoded as a 'lemma', 'synset', or 'descriptor'.\nStill another approach is that of psychologists and cognitive scientists, which often assume that the meaning of an information object is a concept encoded in the mind or cognitive system of an agent. \nA radically different approach is taken by social scientists and semioticians, who usually assume that meanings of an information object are spread across the members of a community that use that object.\nAnother approach that tackles the distributed nature of meaning is assumed by geometrical models of semantics, which assume that the meaning of an InformationObject (e.g. a word) results from the set of informational contexts (e.g. within texts) in which that object is used similarly.\nThe logical approach to meaning is still different, since it assumes that the meaning of e.g. a term is equivalent to the set of individuals that the term can be applied to; for example, the meaning of 'Ali' is e.g. an individual person called Ali, the meaning of 'Airplane' is e.g. the set of airplanes, etc. \nFinally, an approach taken by structuralist linguistics and frame semantics is that a meaning is the relational context in which an information object can be applied; for example, a meaning of 'Airplane' is situated e.g. in the context ('frame') of passenger airline flights.\n\nThese different approaches are not necessarily conflicting, and they mostly talk about different aspects of so-called 'semantics'. They can be summarized and modelled as follows (notice that such list is far from exhaustive):\n\n(1) Informal meaning (as for linguistic or commonsense semantics: a distinction is assumed between (informal) meaning and reference\n\t- Paraphrase meaning (as for lexicographic semantics). Here it is modelled as the expresses relation between instances of Expression and different instances of Expression that act as 'paraphrases'\n\t- Conceptual meaning (as for 'concept scheme' semantics). Here it is modelled as the expresses relation between instances of Expression and instances of a concept (a kind of Meaning)\n\t- Relational meaning (as for frame semantics). Here it is modelled as the expresses relation between instances of Expression and instances of a frame/relation (other kinds of Meaning)\n\t- Cognitive meaning (as for 'psychological' semantics). Here it is modelled as the expresses relation between any instance of Expression and any different instance of IExpression that isRealizedBy a mental, cognitive or neural state (depending on which theory of mind is assumed). Such states can be considered here as instances of processes (occurring in the mind, cognitive system, or neural system of an agent)\n\t- Cultural meaning (as for 'social science' semantics). Here it is modelled as the expresses relation between instances of Expression and instances of social objects (another kind of Meaning: institutions, cultural paradigms, norms, social practices, etc.)\n\t- Distributional meaning (as for geometrical models of meaning). Here it is modelled as the expresses relation between any instance of Expression and any different instance of Expression that is formally representedIn some (geometrical) region (e.g. a vector space)\n\n(2) Formal meaning (as for logic and formal semantics: no distinction is assumed between informal meaning and reference, therefore between 'expresses' and 'isAbout', which can be used interchangeably)\n\t- Object-level formal meaning (as in the traditional first-order logic semantics). Here it is modelled as the expresses relation between an instance of Expression and an instance of a collection that is a grounding for (in most cases) a set\n\nThis is only a first step to provide a framework, in which one can model different aspects of Meaning. A more developed ontology should approach the problem of integrating the different uses of 'expresses', so that different theories, resources, and methods can interoperate."
    "A relation between an Expression and a Meaning. For example: 'A Beehive is a structure in which bees are kept, typically in the form of a dome or box.' (Oxford dictionary)'; 'the term Beehive expresses the concept Beehive in my apiculture ontology'.\nThe intuition for 'meaning' is intended to be very broad. A separate, large comment is included for those who want to investigate more on what kind of meaning can be represented in what form."],
   :rdfs/domain :semiotics/Expression,
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "esprime"}
                {:rdf/language "en",
                 :rdf/value    "expresses"}],
   :rdfs/range :semiotics/Meaning,
   :rdfs/subPropertyOf :semiotics/hasInterpretant})

(def hasConceptualization
  "The relation between a Meaning and a Reference : a Meaning conceptualizes an entity or a collection of entities. A same Reference can be given different conceptualizations, for example, an old cradle can be given a unifying Meaning based on the original aesthetic design, the functionality it was built for, or a new aesthetic functionality in which it can be used as a flower pot. Example: myoldcradle hasConceptualization FlowerPot. In OWL2, punning can be used to use the intension of an OWL class as a meaning, e.g. myoldcradle hasConceptualization owl:Class:FlowerPot."
  {:db/ident :semiotics/hasConceptualization,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The relation between a Meaning and a Reference : a Meaning conceptualizes an entity or a collection of entities.\nA same Reference can be given different conceptualizations, for example, an old cradle can be given a unifying Meaning based on the original aesthetic design, the functionality it was built for, or a new aesthetic functionality in which it can be used as a flower pot. Example: myoldcradle hasConceptualization FlowerPot. In OWL2, punning can be used to use the intension of an OWL class as a meaning, e.g. myoldcradle hasConceptualization owl:Class:FlowerPot.",
   :rdfs/domain :semiotics/Reference,
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has conceptualization"},
   :rdfs/range :semiotics/Meaning})

(def hasInterpretant
  "The Peircean interpretant relation, widely adopted in semiotics: an Expression isInterpretantFor another, e.g. fourLeggedFriendOfHumans isInterpretantFor dog. Synonymy, translation, associativity, and topical proximity are all sources for interpretants, e.g.: domestic dog isInterpretantFor dog (synonymy); cane isInterpretantFor dog (translation); bark isInterpretantFor dog (associativity); veterinary isInterpretantFor dog (topical proximity). Semantic mechanisms such as metonymy depend on the interpretant relation. The interpretant relation is here taken as very broad, also accepting Manifestation(s) as interpretants."
  {:db/ident :semiotics/hasInterpretant,
   :owl/inverseOf :semiotics/isInterpretantFor,
   :owl/propertyChainAxiom [:semiotics/isManifestationOf
                            :semiotics/hasInterpretant],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The Peircean interpretant relation, widely adopted in semiotics: an Expression isInterpretantFor another, e.g. fourLeggedFriendOfHumans isInterpretantFor dog. \nSynonymy, translation, associativity, and topical proximity are all sources for interpretants, e.g.: domestic dog isInterpretantFor dog (synonymy); cane isInterpretantFor dog (translation); bark isInterpretantFor dog (associativity); veterinary isInterpretantFor dog (topical proximity).\nSemantic mechanisms such as metonymy depend on the interpretant relation.\nThe interpretant relation is here taken as very broad, also accepting Manifestation(s) as interpretants.",
   :rdfs/domain :semiotics/InformationEntity,
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "has interpretant"}
                "has meaning"],
   :rdfs/range :semiotics/Meaning})

(def hasManifestation
  "semiotics.owl#hasManifestation"
  {:db/ident :semiotics/hasManifestation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :semiotics/InformationEntity,
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl",
   :rdfs/label "semiotics.owl#hasManifestation",
   :rdfs/range :semiotics/Manifestation})

(def isConceptualizationOf
  "The relation between a Meaning and a Reference : a Meaning conceptualizes an entity or a collection of entities. A same Reference can be given different conceptualizations, for example, an old cradle can be given a unifying Meaning based on the original aesthetic design, the functionality it was built for, or a new aesthetic functionality in which it can be used as a flower pot. Example: myoldcradle hasConceptualization FlowerPot. In OWL2, punning can be used to use the intension of an OWL class as a meaning, e.g. myoldcradle hasConceptualization owl:Class:FlowerPot."
  {:db/ident :semiotics/isConceptualizationOf,
   :owl/inverseOf :semiotics/hasConceptualization,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The relation between a Meaning and a Reference : a Meaning conceptualizes an entity or a collection of entities.\nA same Reference can be given different conceptualizations, for example, an old cradle can be given a unifying Meaning based on the original aesthetic design, the functionality it was built for, or a new aesthetic functionality in which it can be used as a flower pot. Example: myoldcradle hasConceptualization FlowerPot. In OWL2, punning can be used to use the intension of an OWL class as a meaning, e.g. myoldcradle hasConceptualization owl:Class:FlowerPot.",
   :rdfs/domain :semiotics/Meaning,
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is conceptualization of"},
   :rdfs/range :semiotics/Reference})

(def isDenotedBy
  "A relation between expressions and anything (including expressions). It can be used to talk about e.g. entities denoted by proper nouns: the proper noun 'Leonardo da Vinci' denotes the person Leonardo da Vinci; as well as to talk about sets of entities that can be described by a common noun: the common noun 'person' denotes the collection of all persons in a domain of discourse. In OWL2, punning can be used to represent denotation of concept names with owl class extensions, e.g. 'mouse' denotes owl:Class:Mouse."
  {:db/ident :semiotics/isDenotedBy,
   :owl/inverseOf :semiotics/denotes,
   :owl/propertyChainAxiom [:semiotics/isDenotedBy :semiotics/hasManifestation],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between expressions and anything (including expressions). \nIt can be used to talk about e.g. entities denoted by proper nouns: the proper noun 'Leonardo da Vinci' denotes the person Leonardo da Vinci; as well as to talk about sets of entities that can be described by a common noun: the common noun 'person' denotes the collection of all persons in a domain of discourse. In OWL2, punning can be used to represent denotation of concept names with owl class extensions, e.g. 'mouse' denotes owl:Class:Mouse.",
   :rdfs/domain :semiotics/Reference,
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl",
   :rdfs/range :semiotics/InformationEntity})

(def isExpressedBy
  "A relation between an Expression and a Meaning. For example: 'A Beehive is a structure in which bees are kept, typically in the form of a dome or box.' (Oxford dictionary)'; 'the term Beehive expresses the concept Beehive in my apiculture ontology'. The intuition for 'meaning' is intended to be very broad. A separate, large comment is included for those who want to investigate more on what kind of meaning can be represented in what form."
  {:db/ident :semiotics/isExpressedBy,
   :owl/inverseOf :semiotics/expresses,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A relation between an Expression and a Meaning. For example: 'A Beehive is a structure in which bees are kept, typically in the form of a dome or box.' (Oxford dictionary)'; 'the term Beehive expresses the concept Beehive in my apiculture ontology'.\nThe intuition for 'meaning' is intended to be very broad. A separate, large comment is included for those who want to investigate more on what kind of meaning can be represented in what form.",
   :rdfs/domain :semiotics/Meaning,
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl",
   :rdfs/range :semiotics/Expression,
   :rdfs/subPropertyOf :semiotics/isInterpretantFor})

(def isInterpretantFor
  "The Peircean interpretant relation, widely adopted in semiotics: an Expression isInterpretantFor another, e.g. fourLeggedFriendOfHumans isInterpretantFor dog. Synonymy, translation, associativity, and topical proximity are all sources for interpretants, e.g.: domestic dog isInterpretantFor dog (synonymy); cane isInterpretantFor dog (translation); bark isInterpretantFor dog (associativity); veterinary isInterpretantFor dog (topical proximity). Semantic mechanisms such as metonymy depend on the interpretant relation. The interpretant relation is here taken as very broad, also accepting Manifestation(s) as interpretants."
  {:db/ident :semiotics/isInterpretantFor,
   :owl/propertyChainAxiom [:semiotics/isInterpretantFor
                            :semiotics/hasManifestation],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The Peircean interpretant relation, widely adopted in semiotics: an Expression isInterpretantFor another, e.g. fourLeggedFriendOfHumans isInterpretantFor dog. \nSynonymy, translation, associativity, and topical proximity are all sources for interpretants, e.g.: domestic dog isInterpretantFor dog (synonymy); cane isInterpretantFor dog (translation); bark isInterpretantFor dog (associativity); veterinary isInterpretantFor dog (topical proximity).\nSemantic mechanisms such as metonymy depend on the interpretant relation.\nThe interpretant relation is here taken as very broad, also accepting Manifestation(s) as interpretants.",
   :rdfs/domain :semiotics/Meaning,
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl",
   :rdfs/range :semiotics/InformationEntity})

(def isManifestationOf
  "semiotics.owl#isManifestationOf"
  {:db/ident :semiotics/isManifestationOf,
   :owl/inverseOf :semiotics/hasManifestation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :semiotics/Manifestation,
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl",
   :rdfs/label "semiotics.owl#isManifestationOf",
   :rdfs/range :semiotics/InformationEntity})

(def relatedMeaning
  "A relation between any two Meaning(s)."
  {:db/ident :semiotics/relatedMeaning,
   :owl/inverseOf :semiotics/relatedMeaning,
   :rdf/type [:owl/SymmetricProperty :owl/ObjectProperty],
   :rdfs/comment "A relation between any two Meaning(s).",
   :rdfs/domain :semiotics/Meaning,
   :rdfs/isDefinedBy
   "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "related meaning"},
   :rdfs/range :semiotics/Meaning})

(def ^{:private true} Agent
  "An agent playing some role in a linguistic act"
  {:db/ident     :agentrole/Agent,
   :rdf/type     :owl/Class,
   :rdfs/comment "An agent playing some role in a linguistic act",
   :rdfs/label   {:rdf/language "en",
                  :rdf/value    "agent"}})

(def ^{:private true} coversRequirements
  {:db/ident :cpannotationschema/coversRequirements,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} extractedFrom
  {:db/ident :cpannotationschema/extractedFrom,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} hasAuthor
  {:db/ident :cpannotationschema/hasAuthor,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} hasComponent
  {:db/ident :cpannotationschema/hasComponent,
   :rdf/type :owl/DatatypeProperty})

(def ^{:private true} hasConsequences
  {:db/ident :cpannotationschema/hasConsequences,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} relatedCPs
  {:db/ident :cpannotationschema/relatedCPs,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} Situation
  {:db/ident :situation/Situation,
   :rdf/type :owl/Class})

(def ^{:private true} isSettingFor
  {:db/ident :situation/isSettingFor,
   :rdf/type :owl/ObjectProperty})
