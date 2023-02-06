(ns net.wikipunk.rdf.ontolex
  "A model for the representation of lexical information relative to ontologies. Core module."
  {:cc/licence "https://creativecommons.org/publicdomain/zero/1.0/",
   :cc/license "https://creativecommons.org/publicdomain/zero/1.0/",
   :dcterms/contributor
   ["http://www.ilc.cnr.it/en/content/anas-fahad-khan"
    "http://art.uniroma2.it/fiorelli/"
    "http://www.istc.cnr.it/people/aldo-gangemi"
    "http://jogracia.url.ph/web/"
    "http://www.paulbuitelaar.net/"
    "http://www.dfki.de/~declerck/"
    "http://art.uniroma2.it/stellato/"
    "http://mayor2.dia.fi.upm.es/oeg-upm/index.php/en/teachers/52-emontiel"
    "https://sites.google.com/site/francescafrontini/"
    "http://www.oeg-upm.net/index.php/teachers/53-lupe"],
   :dcterms/creator ["http://john.mccr.ae/" "http://www.cimiano.de/"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A model for the representation of lexical information relative to ontologies. Core module."},
   :dcterms/issued #inst "2016-01-10T00:00:00.000-05:00",
   :dcterms/modified #inst "2016-01-10T00:00:00.000-05:00",
   :dcterms/publisher "http://www.w3.org/community/ontolex",
   :dcterms/rights "CC-Zero",
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Lexicon Model for Ontologies - Core"},
   :owl/versionInfo 1.1M,
   :rdf/ns-prefix-map
   {"cc"        "http://creativecommons.org/ns#",
    "dcterms"   "http://purl.org/dc/elements/1.1/",
    "foaf"      "http://xmlns.com/foaf/0.1/",
    "ontolex"   "http://www.w3.org/ns/lemon/ontolex#",
    "owl"       "http://www.w3.org/2002/07/owl#",
    "owl2xml"   "http://www.w3.org/2006/12/owl2-xml#",
    "rdf"       "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"      "http://www.w3.org/2000/01/rdf-schema#",
    "semiotics" "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl#",
    "vann"      "http://purl.org/vocab/vann/",
    "vs"        "http://www.w3.org/2003/06/sw-vocab-status/ns#",
    "xsd"       "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://www.w3.org/ns/lemon/ontolex",
   :rdfa/prefix "ontolex",
   :rdfa/uri "http://www.w3.org/ns/lemon/ontolex#",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "-Version 1.0: depreciation with minor change in metadata for LOV publication\n-Version 1.1: creation"},
   :vann/preferredNamespacePrefix "ontolex",
   :vann/preferredNamespaceUri "http://www.w3.org/ns/lemon/ontolex#"})

(def Affix
  "An affix is a lexical entry that represents a morpheme (suffix, prefix, infix, circumfix) that is attached to a word stem to form a new word."
  {:db/ident :ontolex/Affix,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "An affix is a lexical entry that represents a morpheme (suffix, prefix, infix, circumfix) that is attached to a word stem to form a new word."}
    {:rdf/language "ru",
     :rdf/value
     "'Аффикс' - это словарная единица, которая представляет морфему (суффикс, префикс, инфикс, циркумфикс), добавляемую к основе слова для образования нового слова."}],
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "Affix"}
                {:rdf/language "ro",
                 :rdf/value    "aplică"}
                {:rdf/language "af",
                 :rdf/value    "affiks"}
                {:rdf/language "fr",
                 :rdf/value    "affixe"}
                {:rdf/language "es",
                 :rdf/value    "afijo"}
                {:rdf/language "it",
                 :rdf/value    "affisso"}
                {:rdf/language "ru",
                 :rdf/value    "аффикс"}
                {:rdf/language "nl",
                 :rdf/value    "affix"}
                {:rdf/language "en",
                 :rdf/value    "affix"}
                {:rdf/language "sv",
                 :rdf/value    "affix"}],
   :rdfs/subClassOf :ontolex/LexicalEntry,
   :vs/term_status "stable"})

(def ConceptSet
  "A concept set represents a collection of lexical concepts."
  {:db/ident :ontolex/ConceptSet,
   :owl/equivalentClass {:owl/minQualifiedCardinality 1,
                         :owl/onClass    :ontolex/LexicalConcept,
                         :owl/onProperty :skos/inScheme,
                         :rdf/type       :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "ru",
     :rdf/value
     "'Набор понятий' представляет собой совокупность лексических понятий."}
    {:rdf/language "en",
     :rdf/value "A concept set represents a collection of lexical concepts."}],
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "nl",
                 :rdf/value    "verzameling van begrippen"}
                {:rdf/language "en",
                 :rdf/value    "concept set"}
                {:rdf/language "fr",
                 :rdf/value    "banque de conepts"}
                {:rdf/language "ru",
                 :rdf/value    "набор понятий"}
                {:rdf/language "it",
                 :rdf/value    "banca concetti"}
                {:rdf/language "de",
                 :rdf/value    "Konzeptsatz"}
                {:rdf/language "es",
                 :rdf/value    "conjunto de conceptos"}],
   :rdfs/subClassOf :skos/ConceptScheme,
   :vs/term_status "stable"})

(def Form
  "A form represents one grammatical realization of a lexical entry."
  {:db/ident :ontolex/Form,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "A form represents one grammatical realization of a lexical entry."}
    {:rdf/language "ru",
     :rdf/value
     "'Форма' представляет одну грамматическую реализацию словарной единицы."}],
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "ru",
                 :rdf/value    "форма"}
                {:rdf/language "nl",
                 :rdf/value    "vorm"}
                {:rdf/language "af",
                 :rdf/value    "vorm"}
                {:rdf/language "it",
                 :rdf/value    "forma"}
                {:rdf/language "es",
                 :rdf/value    "forma"}
                {:rdf/language "ro",
                 :rdf/value    "formă"}
                {:rdf/language "pt",
                 :rdf/value    "Forma"}
                {:rdf/language "sv",
                 :rdf/value    "form"}
                {:rdf/language "en",
                 :rdf/value    "form"}
                {:rdf/language "de",
                 :rdf/value    "Form"}
                {:rdf/language "fr",
                 :rdf/value    "forme"}],
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 1,
                      :owl/onDataRange :rdf/langString,
                      :owl/onProperty  :ontolex/writtenRep,
                      :rdf/type        :owl/Restriction}
                     :owl/Thing],
   :vs/term_status "stable"})

(def LexicalConcept
  "A lexical concept represents a mental abstraction, concept or unit of thought that embodies the meaning of one or more lexical entries."
  {:db/ident :ontolex/LexicalConcept,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "ru",
     :rdf/value
     "'Лексическое понятие' представляет элемент абстрактного мышления, понятие или единицу мысли, которая может быть лексикализована определенным набором смыслов."}
    {:rdf/language "en",
     :rdf/value
     "A lexical concept represents a mental abstraction, concept or unit of thought that embodies the meaning of one or more lexical entries."}],
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "concetto lessicale"}
                {:rdf/language "ru",
                 :rdf/value    "лексическое понятие"}
                {:rdf/language "af",
                 :rdf/value    "leksikale konsep"}
                {:rdf/language "en",
                 :rdf/value    "lexical concept"}
                {:rdf/language "de",
                 :rdf/value    "lexikalisches Konzept"}
                {:rdf/language "sv",
                 :rdf/value    "lexikaliskt begrepp"}
                {:rdf/language "fr",
                 :rdf/value    "concept lexical"}
                {:rdf/language "ro",
                 :rdf/value    "concept lexical"}
                {:rdf/language "nl",
                 :rdf/value    "lexikaal concept"}
                {:rdf/language "es",
                 :rdf/value    "concepto lexicalizado"}
                {:rdf/language "pt",
                 :rdf/value    "conceito léxico"}],
   :rdfs/subClassOf [:semiotics/Meaning :skos/Concept],
   :vs/term_status "stable"})

(def LexicalEntry
  "A lexical entry represents a unit of analysis of the lexicon that consists of a set of forms that are grammatically related and a set of base meanings that are associated with all of these forms. Thus, a lexical entry is a word, multiword expression or affix with a single part-of-speech, morphological pattern, etymology and set of senses."
  {:db/ident :ontolex/LexicalEntry,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "A lexical entry represents a unit of analysis of the lexicon that consists of a set of forms that are grammatically related and a set of base meanings that are associated with all of these forms. Thus, a lexical entry is a word, multiword expression or affix with a single part-of-speech, morphological pattern, etymology and set of senses."}
    {:rdf/language "ru",
     :rdf/value
     "'Словарная единица' представляет собой единицу анализа словаря, которая состоит из совокупности грамматически связанных форм и совокупности основных значений, ассоциирующихся со всеми этими формами. 'Словарная единица' - это слово, словосочетание или аффикс одной части речи, морфологической модели, этимологии и набора значений."}],
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "entrata lessicale"}
                {:rdf/language "en",
                 :rdf/value    "lexical entry"}
                {:rdf/language "ro",
                 :rdf/value    "înregistrare lexicală"}
                {:rdf/language "sv",
                 :rdf/value    "lexikoningång"}
                {:rdf/language "ru",
                 :rdf/value    "словарная единица"}
                {:rdf/language "es",
                 :rdf/value    "entrada léxica"}
                {:rdf/language "fr",
                 :rdf/value    "entrée lexicale"}
                {:rdf/language "af",
                 :rdf/value    "leksikale inskrywing"}
                {:rdf/language "nl",
                 :rdf/value    "lexikaal item"}
                {:rdf/language "de",
                 :rdf/value    "Lexikoneintrag"}],
   :rdfs/subClassOf [:owl/Thing
                     :semiotics/Expression
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :ontolex/Form,
                      :owl/onProperty :ontolex/canonicalForm,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 1,
                      :owl/onClass    :ontolex/Form,
                      :owl/onProperty :ontolex/lexicalForm,
                      :rdf/type       :owl/Restriction}],
   :vs/term_status "stable"})

(def LexicalSense
  "A lexical sense represents the lexical meaning of a lexical entry when interpreted as referring to the corresponding ontology element. A lexical sense thus represents a reification of a pair of a uniquely determined lexical entry and a uniquely determined ontology entity it refers to. A link between a lexical entry and an ontology entity via a Lexical Sense object implies that the lexical entry can be used to refer to the ontology entity in question."
  {:db/ident :ontolex/LexicalSense,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "A lexical sense represents the lexical meaning of a lexical entry when interpreted as referring to the corresponding ontology element. A lexical sense thus represents a reification of a pair of a uniquely determined lexical entry and a uniquely determined ontology entity it refers to. A link between a lexical entry and an ontology entity via a Lexical Sense object implies that the lexical entry can be used to refer to the ontology entity in question."}
    {:rdf/language "ru",
     :rdf/value
     "'Лексический смысл' обозначает лексическое значение словарной единицы, когда оно понимается как относящееся к соответствующему элементу онтологии. 'Лексический смысл' представляет собой овеществление пары, состоящей из однозначно определяемой словарной единицы и однозначно определяемой сущности отнологии, к которой относится данный лексический смысл. Связь между словарной единицей и сущностью в онтологии посредством объекта 'Лексический Смысл' подразумевает, что словарная статья может быть использована для отсылки к соответствующей сущности в онтологии."}],
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "af",
                 :rdf/value    "leksikale sin"}
                {:rdf/language "es",
                 :rdf/value    "acepción léxica"}
                {:rdf/language "it",
                 :rdf/value    "senso lessicale"}
                {:rdf/language "ro",
                 :rdf/value    "sens lexical"}
                {:rdf/language "fr",
                 :rdf/value    "signification lexicale"}
                {:rdf/language "ru",
                 :rdf/value    "лексический смысл"}
                {:rdf/language "nl",
                 :rdf/value    "lexikaal zin"}
                {:rdf/language "de",
                 :rdf/value    "lexikalischer Sinn"}
                {:rdf/language "sv",
                 :rdf/value    "lexikonbetydelse"}
                {:rdf/language "en",
                 :rdf/value    "lexical sense"}],
   :rdfs/subClassOf [{:owl/onClass    :ontolex/LexicalEntry,
                      :owl/onProperty :ontolex/isSenseOf,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :semiotics/Meaning
                     {:owl/cardinality 1,
                      :owl/onProperty  :ontolex/reference,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status "stable"})

(def MultiWordExpression
  "A multiword expression is a lexical entry that consists of two or more words."
  {:db/ident :ontolex/MultiWordExpression,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "ru",
     :rdf/value
     "'Словосочетание' - это словарная единица, состоящая из двух или более слов."}
    {:rdf/language "en",
     :rdf/value
     "A multiword expression is a lexical entry that consists of two or more words."}],
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "multi-word expression"}
                {:rdf/language "ro",
                 :rdf/value    "expresie din mai multe cuvinte"}
                {:rdf/language "nl",
                 :rdf/value    "mutliwoorduitdrukking"}
                {:rdf/language "ru",
                 :rdf/value    "словосочетание"}
                {:rdf/language "fr",
                 :rdf/value    "expression à mots multiples"}
                {:rdf/language "es",
                 :rdf/value    "expresión multipalabra"}
                {:rdf/language "it",
                 :rdf/value    "espressione di gruppi di parole"}
                {:rdf/language "sv",
                 :rdf/value    "flerordsuttryck"}
                {:rdf/language "de",
                 :rdf/value    "Mehrwortausdruck"}
                {:rdf/language "af",
                 :rdf/value    "multiwoorduitdrukking"}],
   :rdfs/subClassOf :ontolex/LexicalEntry,
   :vs/term_status "stable"})

(def Word
  "A word is a lexical entry that consists of a single token."
  {:db/ident :ontolex/Word,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "ru",
     :rdf/value
     "'Слово' - это словарная единица, представяющая собой единичную реализацию лексемы."}
    {:rdf/language "en",
     :rdf/value "A word is a lexical entry that consists of a single token."}],
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "nl",
                 :rdf/value    "woord"}
                {:rdf/language "af",
                 :rdf/value    "woord"}
                {:rdf/language "sv",
                 :rdf/value    "ord"}
                {:rdf/language "en",
                 :rdf/value    "word"}
                {:rdf/language "it",
                 :rdf/value    "parola"}
                {:rdf/language "es",
                 :rdf/value    "palabra"}
                {:rdf/language "de",
                 :rdf/value    "Wort"}
                {:rdf/language "fr",
                 :rdf/value    "mot"}
                {:rdf/language "ru",
                 :rdf/value    "слово"}
                {:rdf/language "ro",
                 :rdf/value    "cuvânt"}],
   :rdfs/subClassOf :ontolex/LexicalEntry,
   :vs/term_status "stable"})

(def canonicalForm
  "The 'canonical form' property relates a lexical entry to its canoncical or dictionary form. This usually indicates the \"lemma\" form of a lexical entry."
  {:db/ident :ontolex/canonicalForm,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment
   [{:rdf/language "ru",
     :rdf/value
     "Свойство 'каноническая форма' связывает словарную единицу с ее канонической или словарной формой. Она обычно обозначает \"лемму\" словарной единицы."}
    {:rdf/language "en",
     :rdf/value
     "The 'canonical form' property relates a lexical entry to its canoncical or dictionary form. This usually indicates the \"lemma\" form of a lexical entry. "}],
   :rdfs/domain :ontolex/LexicalEntry,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "forma canónica"}
                {:rdf/language "sv",
                 :rdf/value    "kanonisk form "}
                {:rdf/language "af",
                 :rdf/value    "kanoniese vorm"}
                {:rdf/language "ro",
                 :rdf/value    "formă canonică"}
                {:rdf/language "fr",
                 :rdf/value    "forme canonique"}
                {:rdf/language "ru",
                 :rdf/value    "каноническая форма"}
                {:rdf/language "en",
                 :rdf/value    "canonical form"}
                {:rdf/language "nl",
                 :rdf/value    "canonieke vorm"}
                {:rdf/language "de",
                 :rdf/value    "kanonische Form"}
                {:rdf/language "it",
                 :rdf/value    "forma canonica"}
                {:rdf/language "pt",
                 :rdf/value    "forma canonica"}],
   :rdfs/range :ontolex/Form,
   :rdfs/subPropertyOf :ontolex/lexicalForm,
   :vs/term_status "stable"})

(def concept
  "The 'concept' property relates an ontological entity to a lexical concept that represents the corresponding meaning."
  {:db/ident :ontolex/concept,
   :owl/inverseOf :ontolex/isConceptOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The 'concept' property relates an ontological entity to a lexical concept that represents the corresponding meaning."}
    {:rdf/language "ru",
     :rdf/value
     "Свойство 'понятие' связывает сущность в онтологии с лексическим понятием, которое представляет соответствующее значение."}],
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "af",
                 :rdf/value    "konsep"}
                {:rdf/language "fr",
                 :rdf/value    "concept"}
                {:rdf/language "en",
                 :rdf/value    "concept"}
                {:rdf/language "ro",
                 :rdf/value    "concept"}
                {:rdf/language "de",
                 :rdf/value    "Konzept"}
                {:rdf/language "sv",
                 :rdf/value    "begrepp"}
                {:rdf/language "pt",
                 :rdf/value    "conceito"}
                {:rdf/language "nl",
                 :rdf/value    "begrip"}
                {:rdf/language "es",
                 :rdf/value    "concepto"}
                {:rdf/language "it",
                 :rdf/value    "concetto"}
                {:rdf/language "ru",
                 :rdf/value    "понятие"}],
   :rdfs/range :ontolex/LexicalConcept,
   :vs/term_status "stable"})

(def denotes
  "The 'denotes' property relates a lexical entry to a predicate in a given ontology that represents its meaning and has some denotational or model-theoretic semantics."
  {:db/ident :ontolex/denotes,
   :owl/propertyChainAxiom [:ontolex/sense :ontolex/reference],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "ru",
     :rdf/value
     "Свойство 'обозначает' связывает словарную единицу с предикатом в онтологии, который представляет ее значение и обладает денотативной или теоретико-модельной семантикой."}
    {:rdf/language "en",
     :rdf/value
     "The 'denotes' property relates a lexical entry to a predicate in a given ontology that represents its meaning and has some denotational or model-theoretic semantics. "}],
   :rdfs/domain :ontolex/LexicalEntry,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "af",
                 :rdf/value    "dui aan"}
                {:rdf/language "pt",
                 :rdf/value    "denota"}
                {:rdf/language "it",
                 :rdf/value    "denota"}
                {:rdf/language "es",
                 :rdf/value    "denota"}
                {:rdf/language "ro",
                 :rdf/value    "denotă"}
                {:rdf/language "en",
                 :rdf/value    "denotes"}
                {:rdf/language "fr",
                 :rdf/value    "dénote"}
                {:rdf/language "ru",
                 :rdf/value    "обозначает"}
                {:rdf/language "sv",
                 :rdf/value    "betecknar"}
                {:rdf/language "de",
                 :rdf/value    "bezeichnet"}
                {:rdf/language "nl",
                 :rdf/value    "duidet aan"}],
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :semiotics/denotes,
   :vs/term_status "stable"})

(def evokes
  "The 'evokes' property relates a lexical entry to one of the lexical concepts it evokes, i.e. the mental concept that speakers of a language might associate when hearing the lexical entry."
  {:db/ident :ontolex/evokes,
   :owl/propertyChainAxiom [:ontolex/sense :ontolex/isLexicalizedSenseOf],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "ru",
     :rdf/value
     "Свойство 'порождает' связывает словарную единицу с одним из лексических понятий, которую она порождает, то есть мыслительное понятие, которое возникает в сознании говорящих, когда они слышат данную словарную единицу."}
    {:rdf/language "en",
     :rdf/value
     "The 'evokes' property relates a lexical entry to one of the lexical concepts it evokes, i.e. the mental concept that speakers of a language might associate when hearing the lexical entry."}],
   :rdfs/domain :ontolex/LexicalEntry,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "af",
                 :rdf/value    "roep op"}
                {:rdf/language "es",
                 :rdf/value    "evoca"}
                {:rdf/language "pt",
                 :rdf/value    "evoca"}
                {:rdf/language "it",
                 :rdf/value    "evoca"}
                {:rdf/language "ro",
                 :rdf/value    "evocă"}
                {:rdf/language "fr",
                 :rdf/value    "évoque"}
                {:rdf/language "nl",
                 :rdf/value    "lokt uit"}
                {:rdf/language "en",
                 :rdf/value    "evokes"}
                {:rdf/language "de",
                 :rdf/value    "ruft hervor"}
                {:rdf/language "ru",
                 :rdf/value    "порождает"}
                {:rdf/language "sv",
                 :rdf/value    "framkallar"}],
   :rdfs/range :ontolex/LexicalConcept,
   :vs/term_status "stable"})

(def isConceptOf
  "This property formalizes the meaning of a Lexical Concept by linking it to a particular ontological meaning."
  {:db/ident :ontolex/isConceptOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "ru",
     :rdf/value
     "Это свойство формализует значение 'Лексического Понятия', связывая его с отдельным значением в онтологии."}
    {:rdf/language "en",
     :rdf/value
     "This property formalizes the meaning of a Lexical Concept by linking it to a particular ontological meaning."}],
   :rdfs/domain :ontolex/LexicalConcept,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "is concept of"}
                {:rdf/language "fr",
                 :rdf/value    "est un concept pour "}
                {:rdf/language "de",
                 :rdf/value    "ist Konzept von"}
                {:rdf/language "ru",
                 :rdf/value    "является понятием"}
                {:rdf/language "nl",
                 :rdf/value    "is concept van"}
                {:rdf/language "af",
                 :rdf/value    "is konsep van"}
                {:rdf/language "ro",
                 :rdf/value    "este concept a(l)"}
                {:rdf/language "es",
                 :rdf/value    "es concepto de"}
                {:rdf/language "pt",
                 :rdf/value    "é conceito de"}
                {:rdf/language "it",
                 :rdf/value    "è concetto di "}
                {:rdf/language "sv",
                 :rdf/value    "är begrepp för"}],
   :vs/term_status "stable"})

(def isDenotedBy
  "The object property isDenotedBy is the inverse of the object property denotes."
  {:db/ident :ontolex/isDenotedBy,
   :owl/inverseOf :ontolex/denotes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The object property isDenotedBy is the inverse of the object property denotes."}
    {:rdf/language "ru",
     :rdf/value
     "Свойство объекта 'обозначается' является обратным к свойству объекта 'обозначает'."}],
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "est dénoté par"}
                {:rdf/language "nl",
                 :rdf/value    "wordt aangeduidet door"}
                {:rdf/language "es",
                 :rdf/value    "es denotado por"}
                {:rdf/language "it",
                 :rdf/value    "è denotato da"}
                {:rdf/language "en",
                 :rdf/value    "is denoted by"}
                {:rdf/language "ro",
                 :rdf/value    "este denotat cu"}
                {:rdf/language "pt",
                 :rdf/value    "é denotado por"}
                {:rdf/language "af",
                 :rdf/value    "word aangedui deur"}
                {:rdf/language "ru",
                 :rdf/value    "обозначается"}
                {:rdf/language "sv",
                 :rdf/value    "betecknas av"}
                {:rdf/language "de",
                 :rdf/value    "wird bezeichnet von"}],
   :rdfs/range :ontolex/LexicalEntry,
   :vs/term_status "stable"})

(def isEvokedBy
  "The inverse relation to evokes."
  {:db/ident         :ontolex/isEvokedBy,
   :owl/inverseOf    :ontolex/evokes,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     [{:rdf/language "en",
                       :rdf/value    "The inverse relation to evokes."}
                      {:rdf/language "ru",
                       :rdf/value    "Отношение обратное к 'порождает'."}],
   :rdfs/domain      :ontolex/LexicalConcept,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label       [{:rdf/language "fr",
                       :rdf/value    "est évoqué par"}
                      {:rdf/language "ru",
                       :rdf/value    "порождается"}
                      {:rdf/language "af",
                       :rdf/value    "word opgeroep deur"}
                      {:rdf/language "sv",
                       :rdf/value    "framkallas av "}
                      {:rdf/language "en",
                       :rdf/value    "is evoked by"}
                      {:rdf/language "nl",
                       :rdf/value    "wordt uitgelokt door"}
                      {:rdf/language "de",
                       :rdf/value    "wird hervorgerufen von"}
                      {:rdf/language "it",
                       :rdf/value    "è evocato da"}
                      {:rdf/language "es",
                       :rdf/value    "es evocado por"}
                      {:rdf/language "ro",
                       :rdf/value    "este evocat de"}],
   :rdfs/range       :ontolex/LexicalEntry,
   :vs/term_status   "stable"})

(def isLexicalizedSenseOf
  "The object property isLexicalizedSenseOf is the inverse property of lexicalized sense."
  {:db/ident :ontolex/isLexicalizedSenseOf,
   :owl/inverseOf :ontolex/lexicalizedSense,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The object property isLexicalizedSenseOf is the inverse property of lexicalized sense."}
    {:rdf/language "ru",
     :rdf/value
     "Свойство объекта 'является лексикализованным смыслом' представляет собой свойство, обратное к свойству 'лексикализованный смысл'."}],
   :rdfs/domain :ontolex/LexicalSense,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "nl",
                 :rdf/value    "is lexikaal zin van"}
                {:rdf/language "en",
                 :rdf/value    "is lexicalized sense of"}
                {:rdf/language "ru",
                 :rdf/value    "является лексикализованным смыслом"}
                {:rdf/language "sv",
                 :rdf/value    "är lexikaliserad betydelse för"}
                {:rdf/language "af",
                 :rdf/value    "is geleksikaliseerde sin van"}
                {:rdf/language "es",
                 :rdf/value    "es l'acepción lexicalizado de"}
                {:rdf/language "de",
                 :rdf/value    "ist lexikalisierter Sinn von"}
                {:rdf/language "fr",
                 :rdf/value    "est le sens lexicalisé de"}
                {:rdf/language "ro",
                 :rdf/value    "este sens lexicalizat de"}
                {:rdf/language "it",
                 :rdf/value    "è il senso lessicalizzato di"}],
   :rdfs/range :ontolex/LexicalConcept,
   :vs/term_status "stable"})

(def isReferenceOf
  "The object property isReferenceOf is the inverse property of reference."
  {:db/ident :ontolex/isReferenceOf,
   :owl/inverseOf :ontolex/reference,
   :rdf/type [:owl/ObjectProperty :owl/InverseFunctionalProperty],
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The object property isReferenceOf is the inverse property of reference."}
    {:rdf/language "ru",
     :rdf/value
     "Свойство объекта 'является референцией' представляет собой свойство, обратное к свойству 'референция'."}],
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "nl",
                 :rdf/value    "is referentie van"}
                {:rdf/language "ru",
                 :rdf/value    "является референцией"}
                {:rdf/language "fr",
                 :rdf/value    "est référence de"}
                {:rdf/language "sv",
                 :rdf/value    "är referens för"}
                {:rdf/language "pt",
                 :rdf/value    "é referência de"}
                {:rdf/language "it",
                 :rdf/value    "è riferimento di"}
                {:rdf/language "en",
                 :rdf/value    "is reference of"}
                {:rdf/language "af",
                 :rdf/value    "is verwysing van"}
                {:rdf/language "es",
                 :rdf/value    "es referencia de"}
                {:rdf/language "ro",
                 :rdf/value    "este referință a(l)"}
                {:rdf/language "de",
                 :rdf/value    "ist Referenz von"}],
   :rdfs/range {:owl/unionOf [:ontolex/LexicalSense
                              "http://www.w3.org/ns/lemon/synsem#OntoMap"],
                :rdf/type    :owl/Class},
   :vs/term_status "stable"})

(def isSenseOf
  "The property isSenseOf is the inverse property of sense."
  {:db/ident :ontolex/isSenseOf,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value    "The property isSenseOf is the inverse property of sense."}
    {:rdf/language "ru",
     :rdf/value
     "Свойство 'является смыслом' представляет собой свойство, обратное к свойству 'смысл'."}],
   :rdfs/domain :ontolex/LexicalSense,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "pt",
                 :rdf/value    "é sentido de"}
                {:rdf/language "nl",
                 :rdf/value    "is zin van"}
                {:rdf/language "af",
                 :rdf/value    "is sin van"}
                {:rdf/language "it",
                 :rdf/value    "è il senso di"}
                {:rdf/language "es",
                 :rdf/value    "es acepción de"}
                {:rdf/language "sv",
                 :rdf/value    "är betydelse för"}
                {:rdf/language "fr",
                 :rdf/value    "est signification de"}
                {:rdf/language "ru",
                 :rdf/value    "является смыслом"}
                {:rdf/language "en",
                 :rdf/value    "is sense of"}
                {:rdf/language "ro",
                 :rdf/value    "este sens a(l)"}
                {:rdf/language "de",
                 :rdf/value    "ist Sinn von"}],
   :rdfs/range :ontolex/LexicalEntry,
   :vs/term_status "stable"})

(def lexicalForm
  "The 'lexical form' property relates a lexical entry to one grammatical form variant of the lexical entry."
  {:db/ident :ontolex/lexicalForm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The 'lexical form' property relates a lexical entry to one grammatical form variant of the lexical entry."}
    {:rdf/language "ru",
     :rdf/value
     "Свойство 'лексическая форма' соотносит словарную единицу с одним вариантом грамматической формы словарной единицы."}],
   :rdfs/domain :ontolex/LexicalEntry,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "sv",
                 :rdf/value    "lexikonform"}
                {:rdf/language "es",
                 :rdf/value    "forma léxica"}
                {:rdf/language "fr",
                 :rdf/value    "forme lexicale"}
                {:rdf/language "ro",
                 :rdf/value    "formă lexicală"}
                {:rdf/language "ru",
                 :rdf/value    "лексическая форма"}
                {:rdf/language "en",
                 :rdf/value    "lexical form"}
                {:rdf/language "af",
                 :rdf/value    "leksikale vorm"}
                {:rdf/language "it",
                 :rdf/value    "forma lessicale"}
                {:rdf/language "de",
                 :rdf/value    "lexikalische Form"}
                {:rdf/language "nl",
                 :rdf/value    "lexikaal vorm"}],
   :rdfs/range :ontolex/Form,
   :vs/term_status "stable"})

(def lexicalizedSense
  "The 'lexicalized sense' property relates a lexical concept to a corresponding lexical sense that lexicalizes the concept."
  {:db/ident :ontolex/lexicalizedSense,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "ru",
     :rdf/value
     "Свойство 'лексикализованный смысл' связывает лексическое понятие с соответствующим лексическим смыслом, который лексикализует понятие."}
    {:rdf/language "en",
     :rdf/value
     "The 'lexicalized sense' property relates a lexical concept to a corresponding lexical sense that lexicalizes the concept."}],
   :rdfs/domain :ontolex/LexicalConcept,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "ru",
                 :rdf/value    "лексикализованный смысл"}
                {:rdf/language "af",
                 :rdf/value    "geleksikaliseerde Sin"}
                {:rdf/language "ro",
                 :rdf/value    "sens lexicalizat"}
                {:rdf/language "fr",
                 :rdf/value    "signification lexicalisé"}
                {:rdf/language "en",
                 :rdf/value    "lexicalized sense"}
                {:rdf/language "sv",
                 :rdf/value    "lexikaliserad betydelse"}
                {:rdf/language "de",
                 :rdf/value    "lexikalisierter Sinn"}
                {:rdf/language "it",
                 :rdf/value    "senso lessicalizzato"}
                {:rdf/language "es",
                 :rdf/value    "acepción lexicalizada"}
                {:rdf/language "nl",
                 :rdf/value    "lexikaal zin"}],
   :rdfs/range :ontolex/LexicalSense,
   :vs/term_status "stable"})

(def morphologicalPattern
  "The 'morphological pattern' property indicates the morphological class of a word."
  {:db/ident :ontolex/morphologicalPattern,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The 'morphological pattern' property indicates the morphological class of a word."}
    {:rdf/language "ru",
     :rdf/value
     "Свойство 'морфологическая модель' обозначает морфологический класс слова."}],
   :rdfs/domain :ontolex/LexicalEntry,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "sv",
                 :rdf/value    "morfologiskt mönster"}
                {:rdf/language "af",
                 :rdf/value    "morfologiese patroon"}
                {:rdf/language "fr",
                 :rdf/value    "patron morphologique"}
                {:rdf/language "en",
                 :rdf/value    "morphological pattern"}
                {:rdf/language "ro",
                 :rdf/value    "model morfologic"}
                {:rdf/language "de",
                 :rdf/value    "morphologisches Muster"}
                {:rdf/language "nl",
                 :rdf/value    "morfologische patroon"}
                {:rdf/language "es",
                 :rdf/value    "patrón morfológico"}
                {:rdf/language "ru",
                 :rdf/value    "морфологическая модель"}
                {:rdf/language "it",
                 :rdf/value    "motivo morfologico"}],
   :vs/term_status "stable"})

(def otherForm
  "The 'other form' property relates a lexical entry to a non-preferred (\"non-lemma\") form that realizes the given lexical entry."
  {:db/ident :ontolex/otherForm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The  'other form' property relates a lexical entry to a non-preferred (\"non-lemma\") form that realizes the given lexical entry."}
    {:rdf/language "ru",
     :rdf/value
     "Свойство 'другая форма' связывает словарную единицу с малоупотребительной формой (\"не леммой\"), которая является реализацией данной словарной единицы"}],
   :rdfs/domain :ontolex/LexicalEntry,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "autre forme"}
                {:rdf/language "ru",
                 :rdf/value    "другая форма"}
                {:rdf/language "sv",
                 :rdf/value    "annan form"}
                {:rdf/language "de",
                 :rdf/value    "andere Form"}
                {:rdf/language "af",
                 :rdf/value    "ander form"}
                {:rdf/language "pt",
                 :rdf/value    "outra forma"}
                {:rdf/language "ro",
                 :rdf/value    "altă formă"}
                {:rdf/language "en",
                 :rdf/value    "other form"}
                {:rdf/language "nl",
                 :rdf/value    "andere vorm"}
                {:rdf/language "es",
                 :rdf/value    "otra forma"}
                {:rdf/language "it",
                 :rdf/value    "altra forma"}],
   :rdfs/range :ontolex/Form,
   :rdfs/subPropertyOf :ontolex/lexicalForm,
   :vs/term_status "stable"})

(def phoneticRep
  "The 'phonetic representation' property indicates one phonetic representation of the pronunciation of the form using a scheme such as the International Phonetic Alphabet (IPA)."
  {:db/ident :ontolex/phoneticRep,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "ru",
     :rdf/value
     "Свойство 'фонетическое представление' обозначает фонетическое представление произношения формы с использованием какой-либо схемы, например, Международного фонетического алфавита (IPA, МФА)."}
    {:rdf/language "en",
     :rdf/value
     "The 'phonetic representation' property indicates one phonetic representation of the pronunciation of the form using a scheme such as the International Phonetic Alphabet (IPA). "}],
   :rdfs/domain :ontolex/Form,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "phonetische Darstellung"}
                {:rdf/language "sv",
                 :rdf/value    "fonetisk representation "}
                {:rdf/language "fr",
                 :rdf/value    "représentation phonétique"}
                {:rdf/language "ro",
                 :rdf/value    "reprezentare fonetică"}
                {:rdf/language "en",
                 :rdf/value    "phonetic representation"}
                {:rdf/language "ru",
                 :rdf/value    "фонетическое представление"}
                {:rdf/language "af",
                 :rdf/value    "fonetiese voorstelling"}
                {:rdf/language "es",
                 :rdf/value    "representación fonética"}
                {:rdf/language "it",
                 :rdf/value    "rappresentazione fonetica"}
                {:rdf/language "nl",
                 :rdf/value    "fonetische voorstelling"}],
   :rdfs/range :rdf/langString,
   :rdfs/subPropertyOf :ontolex/representation,
   :vs/term_status "stable"})

(def reference
  "The 'reference' property relates a lexical sense to an ontological predicate that represents the denotation of the corresponding lexical entry."
  {:db/ident :ontolex/reference,
   :rdf/type [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/comment
   [{:rdf/language "ru",
     :rdf/value
     "Свойство 'референция' соотносит лексический смысл с предикатом в онтологии, который уточняет значение денотата (соответствующей словарной единицы)."}
    {:rdf/language "en",
     :rdf/value
     "The 'reference' property relates a lexical sense to an ontological predicate that represents the denotation of the corresponding lexical entry. "}],
   :rdfs/domain {:owl/unionOf [:ontolex/LexicalSense
                               "http://www.w3.org/ns/lemon/synsem#OntoMap"],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "ro",
                 :rdf/value    "referință"}
                {:rdf/language "de",
                 :rdf/value    "Referenz"}
                {:rdf/language "af",
                 :rdf/value    "verwysing"}
                {:rdf/language "ru",
                 :rdf/value    "референция"}
                {:rdf/language "sv",
                 :rdf/value    "referens"}
                {:rdf/language "en",
                 :rdf/value    "reference"}
                {:rdf/language "nl",
                 :rdf/value    "referntie"}
                {:rdf/language "pt",
                 :rdf/value    "referência"}
                {:rdf/language "it",
                 :rdf/value    "riferimento"}
                {:rdf/language "fr",
                 :rdf/value    "référence"}
                {:rdf/language "es",
                 :rdf/value    "referencia"}],
   :rdfs/range :rdfs/Resource,
   :vs/term_status "stable"})

(def representation
  "The 'representation' property indicates a string by which the form is represented according to some orthography."
  {:db/ident :ontolex/representation,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The 'representation' property indicates a string by which the form is represented according to some orthography. "}
    {:rdf/language "ru",
     :rdf/value
     "Свойство 'представление' обозначает некую последовательность, с помощью которой форма может быть представлена средствами орфографии."}],
   :rdfs/domain :ontolex/Form,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "représentation"}
                {:rdf/language "sv",
                 :rdf/value    "representation"}
                {:rdf/language "en",
                 :rdf/value    "representation"}
                {:rdf/language "nl",
                 :rdf/value    "voorstelling"}
                {:rdf/language "af",
                 :rdf/value    "voorstelling"}
                {:rdf/language "it",
                 :rdf/value    "rappresentazione"}
                {:rdf/language "ro",
                 :rdf/value    "reprezentare"}
                {:rdf/language "pt",
                 :rdf/value    "representação"}
                {:rdf/language "es",
                 :rdf/value    "representación"}
                {:rdf/language "ru",
                 :rdf/value    "представление"}
                {:rdf/language "de",
                 :rdf/value    "Darstellung"}],
   :rdfs/range :rdf/langString,
   :vs/term_status "stable"})

(def sense
  "The 'sense' property relates a lexical entry to one of its lexical senses."
  {:db/ident :ontolex/sense,
   :owl/inverseOf :ontolex/isSenseOf,
   :rdf/type [:owl/ObjectProperty :owl/InverseFunctionalProperty],
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The 'sense' property relates a lexical entry to one of its lexical senses. "}
    {:rdf/language "ru",
     :rdf/value
     "Свойство 'смысл' связывает словарную единицу с одним из ее лексических смыслов."}],
   :rdfs/domain :ontolex/LexicalEntry,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "pt",
                 :rdf/value    "sentido"}
                {:rdf/language "af",
                 :rdf/value    "sinne"}
                {:rdf/language "ro",
                 :rdf/value    "sens"}
                {:rdf/language "fr",
                 :rdf/value    "signification"}
                {:rdf/language "es",
                 :rdf/value    "acepción"}
                {:rdf/language "nl",
                 :rdf/value    "zin"}
                {:rdf/language "ru",
                 :rdf/value    "смысл"}
                {:rdf/language "sv",
                 :rdf/value    "betydelse"}
                {:rdf/language "de",
                 :rdf/value    "Sinn"}
                {:rdf/language "en",
                 :rdf/value    "sense"}
                {:rdf/language "it",
                 :rdf/value    "senso"}],
   :rdfs/range :ontolex/LexicalSense,
   :vs/term_status "stable"})

(def usage
  "The 'usage' property indicates usage conditions or pragmatic implications when using the lexical entry to refer to the given ontological meaning."
  {:db/ident :ontolex/usage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The 'usage' property indicates usage conditions or pragmatic implications when using the lexical entry to refer to the given ontological meaning."}
    {:rdf/language "ru",
     :rdf/value
     "Свойство 'употребление' обозначает условия использования или прагматическое значение при употреблении словарной единицы для соотнесения с определенным значением в онтологии."}],
   :rdfs/domain :ontolex/LexicalSense,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "nl",
                 :rdf/value    "gebruik"}
                {:rdf/language "de",
                 :rdf/value    "Gebrauch"}
                {:rdf/language "fr",
                 :rdf/value    "usage"}
                {:rdf/language "en",
                 :rdf/value    "usage"}
                {:rdf/language "it",
                 :rdf/value    "uso"}
                {:rdf/language "es",
                 :rdf/value    "uso"}
                {:rdf/language "ru",
                 :rdf/value    "употребление"}],
   :rdfs/range :rdfs/Resource,
   :vs/term_status "stable"})

(def writtenRep
  "The 'written representation' property indicates the written representation of a form."
  {:db/ident :ontolex/writtenRep,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "ru",
     :rdf/value
     "Свойство 'письменное представление' обозначает письменное представление формы."}
    {:rdf/language "en",
     :rdf/value
     "The 'written representation' property indicates the written representation of a form."}],
   :rdfs/domain :ontolex/Form,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/ontolex",
   :rdfs/label [{:rdf/language "sv",
                 :rdf/value    "skriven form "}
                {:rdf/language "fr",
                 :rdf/value    "représentation écrite"}
                {:rdf/language "ro",
                 :rdf/value    "reprezentare scrisă"}
                {:rdf/language "af",
                 :rdf/value    "geskrewe voorstelling"}
                {:rdf/language "nl",
                 :rdf/value    "schriftlijke voorstelling"}
                {:rdf/language "it",
                 :rdf/value    "rappresentazione scritta"}
                {:rdf/language "pt",
                 :rdf/value    "representação escrita"}
                {:rdf/language "ru",
                 :rdf/value    "письменное представление"}
                {:rdf/language "en",
                 :rdf/value    "written representation"}
                {:rdf/language "de",
                 :rdf/value    "schriftliche Darstellung"}
                {:rdf/language "es",
                 :rdf/value    "representación escrita"}],
   :rdfs/range :rdf/langString,
   :rdfs/subPropertyOf :ontolex/representation,
   :vs/term_status "stable"})

(def ^{:private true} Organization
  {:db/ident :foaf/Organization,
   :rdf/type :owl/Class})

(def ^{:private true} Person
  {:db/ident :foaf/Person,
   :rdf/type :owl/Class})

(def ^{:private true} Expression
  "expression"
  {:db/ident   :semiotics/Expression,
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "expression"}})

(def ^{:private true} Meaning
  "meaning"
  {:db/ident   :semiotics/Meaning,
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "meaning"}})

(def ^{:private true} denotes
  {:db/ident :semiotics/denotes,
   :rdf/type :owl/ObjectProperty})

(def ^{:private true} Concept
  "concept"
  {:db/ident   :skos/Concept,
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "concept"}})

(def ^{:private true} ConceptScheme
  "concept scheme"
  {:db/ident   :skos/ConceptScheme,
   :rdf/type   :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "concept scheme"}})

(def ^{:private true} inScheme
  "in scheme"
  {:db/ident   :skos/inScheme,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "in scheme"}})

(def ^{:private true} Vocabulary
  {:db/ident :voaf/Vocabulary,
   :rdf/type :owl/Class})

(def ^{:private true} term_status
  {:db/ident :vs/term_status,
   :rdf/type :owl/AnnotationProperty})
