(ns net.wikipunk.rdf.lime
  "LIME (LInguistic MEtadata) is a vocabulary for expressing linguistic metadata about linguistic resources and linguistically grounded datasets."
  {:cc/licence "https://creativecommons.org/publicdomain/zero/1.0/",
   :cc/license "https://creativecommons.org/publicdomain/zero/1.0/",
   :dcterms/contributor
   ["http://www.ilc.cnr.it/en/content/anas-fahad-khan"
    "http://mayor2.dia.fi.upm.es/oeg-upm/index.php/en/teachers/52-emontiel"
    "https://sites.google.com/site/francescafrontini/"
    "http://www.dfki.de/~declerck/"
    "http://www.oeg-upm.net/index.php/teachers/53-lupe"
    "http://www.istc.cnr.it/people/aldo-gangemi"
    "http://jogracia.url.ph/web/"
    "http://www.paulbuitelaar.net/"
    "http://art.uniroma2.it/stellato/"
    "http://art.uniroma2.it/fiorelli/"],
   :dcterms/creator ["http://john.mccr.ae/" "http://www.cimiano.de/"],
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "LIME (LInguistic MEtadata) is a vocabulary for expressing linguistic metadata about linguistic resources and linguistically grounded datasets."},
   :dcterms/issued #inst "2016-01-10T00:00:00.000-05:00",
   :dcterms/modified #inst "2016-01-10T00:00:00.000-05:00",
   :dcterms/publisher "http://www.w3.org/community/ontolex",
   :dcterms/rights "CC-Zero",
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "Vocabulary of Linguistic Metadata"},
   :owl/imports "http://www.w3.org/ns/lemon/ontolex",
   :owl/versionInfo 1.1M,
   :rdf/ns-prefix-map {"cc" "http://creativecommons.org/ns#",
                       "dcterms" "http://purl.org/dc/elements/1.1/",
                       "lime" "http://www.w3.org/ns/lemon/lime#",
                       "ontolex" "http://www.w3.org/ns/lemon/ontolex#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vann" "http://purl.org/vocab/vann/",
                       "void" "http://rdfs.org/ns/void#",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://www.w3.org/ns/lemon/lime",
   :rdfa/prefix "lime",
   :rdfa/uri "http://www.w3.org/ns/lemon/lime#",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "-Version 1.0: depreciation with minor change in metadata for LOV publication\n-Version 1.1: creation"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "Lexicon Model for Ontologies - LIngusitic MEtadata (LIME)"},
   :vann/preferredNamespacePrefix "lime",
   :vann/preferredNamespaceUri "http://www.w3.org/ns/lemon/lime#"}
  (:refer-clojure :exclude [partition]))

(def ConceptualizationSet
  "A conceptualization set represents a collection of links between lexical entries in a Lexicon and lexical concepts in a Concept Set they evoke."
  {:db/ident :lime/ConceptualizationSet,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "ru",
     :rdf/value
     "Набор концепций представляет собой набор связей между словарными единицами в лексиконе и лексическими понятиями в наборе понятий, которые они вызывают."}
    {:rdf/language "en",
     :rdf/value
     "A conceptualization set represents a collection of links between lexical entries in a Lexicon and lexical concepts in a Concept Set they evoke."}],
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/lime",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "banca concettualizzazioni"}
                {:rdf/language "es",
                 :rdf/value    "conjuto de conceptualizaciones"}
                {:rdf/language "en",
                 :rdf/value    "conceptualization set"}
                {:rdf/language "fr",
                 :rdf/value    "banque de concepitalisations"}
                {:rdf/language "ru",
                 :rdf/value    "набор концепций"}
                {:rdf/language "de",
                 :rdf/value    "Konzeptualisierungsatz"}
                {:rdf/language "nl",
                 :rdf/value    "verzameling van conceptialisaties"}],
   :rdfs/subClassOf [:void/Dataset
                     {:owl/onClass    :lime/Lexicon,
                      :owl/onProperty :lime/lexiconDataset,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :ontolex/ConceptSet,
                      :owl/onProperty :lime/conceptualDataset,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}],
   :vs/term_status "stable"})

(def LexicalLinkset
  "A lexical linkset represents a collection of links between a reference dataset and a set of lexical concepts (e.g. synsets of a wordnet)."
  {:db/ident :lime/LexicalLinkset,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "ru",
     :rdf/value
     "Лексический набор связей представляет собой набор связей между набором ссылок и набором лексических понятий (например, synsets of wordnet)"}
    {:rdf/language "en",
     :rdf/value
     "A lexical linkset represents a collection of links between a reference dataset and a set of lexical concepts (e.g. synsets of a wordnet)."}],
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/lime",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "banca di link lessicali"}
                {:rdf/language "es",
                 :rdf/value    "conjunto de enlaces"}
                {:rdf/language "nl",
                 :rdf/value    "verzameling van lexicale links"}
                {:rdf/language "fr",
                 :rdf/value    "banque de liens lexicals"}
                {:rdf/language "ru",
                 :rdf/value    "лексический набор ссылок"}
                {:rdf/language "en",
                 :rdf/value    "lexical linkset"}
                {:rdf/language "af",
                 :rdf/value    "leksikale skakelstel"}
                {:rdf/language "ro",
                 :rdf/value    "linkset lexical"}
                {:rdf/language "sv",
                 :rdf/value    "lexikalisk länkmängd"}
                {:rdf/language "de",
                 :rdf/value    "Lexikonlinksatz"}],
   :rdfs/subClassOf [{:owl/onClass    :ontolex/ConceptSet,
                      :owl/onProperty :lime/conceptualDataset,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/allValuesFrom :lime/LexicalLinkset,
                      :owl/onProperty    :lime/partition,
                      :rdf/type          :owl/Restriction}
                     :void/Linkset
                     {:owl/onClass    :void/Dataset,
                      :owl/onProperty :lime/referenceDataset,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}],
   :vs/term_status "stable"})

(def LexicalizationSet
  "A 'lexicalization set' is a dataset that comprises a collection of lexicalizations, that is pairs of lexical entry and corresponding reference in the associated ontology/vocabulary/dataset."
  {:db/ident :lime/LexicalizationSet,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "A 'lexicalization set' is a dataset that comprises a collection of lexicalizations, that is pairs of lexical entry and corresponding reference in the associated ontology/vocabulary/dataset."}
    {:rdf/language "ru",
     :rdf/value
     "'Набор лексикализации' - это набор данных, который содержит набор лексикализаций, т.е. пары словарной единицы и соответствующей ссылки в связанной онтологии/словаре/наборе данных."}],
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/lime",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "lexicalization set"}
                {:rdf/language "ru",
                 :rdf/value    "набор лексикализаций"}],
   :rdfs/subClassOf [{:owl/onClass    :void/Dataset,
                      :owl/onProperty :lime/referenceDataset,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :lime/lexicalizationModel,
                      :rdf/type        :owl/Restriction}
                     :void/Dataset
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :lime/Lexicon,
                      :owl/onProperty :lime/lexiconDataset,
                      :rdf/type       :owl/Restriction}
                     {:owl/allValuesFrom :lime/LexicalizationSet,
                      :owl/onProperty    :lime/partition,
                      :rdf/type          :owl/Restriction}],
   :vs/term_status "stable"})

(def Lexicon
  "A lexicon represents a collection of lexical entries for a particular language or domain."
  {:db/ident :lime/Lexicon,
   :rdf/type :owl/Class,
   :rdfs/comment
   [{:rdf/language "ru",
     :rdf/value
     "Лексикон представляет собой набор словарных единиц для определенного языка или домена."}
    {:rdf/language "en",
     :rdf/value
     "A lexicon represents a collection of lexical entries for a particular language or domain."}],
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/lime",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "Lessico"}
                {:rdf/language "es",
                 :rdf/value    "lexicón"}
                {:rdf/language "sv",
                 :rdf/value    "lexikon"}
                {:rdf/language "ru",
                 :rdf/value    "лексикон"}
                {:rdf/language "af",
                 :rdf/value    "leksikon"}
                {:rdf/language "fr",
                 :rdf/value    "Lexique"}
                {:rdf/language "nl",
                 :rdf/value    "Lexicon"}
                {:rdf/language "de",
                 :rdf/value    "Lexikon"}
                {:rdf/language "ro",
                 :rdf/value    "lexicon"}
                {:rdf/language "en",
                 :rdf/value    "lexicon"}],
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 1,
                      :owl/onClass    :ontolex/LexicalEntry,
                      :owl/onProperty :lime/entry,
                      :rdf/type       :owl/Restriction}
                     :void/Dataset
                     {:owl/cardinality 1,
                      :owl/onProperty  :lime/language,
                      :rdf/type        :owl/Restriction}],
   :vs/term_status "stable"})

(def avgAmbiguity
  "The 'average ambiguity' property indicates the average number of lexical concepts evoked by each lemma/canonical form in the lexicon."
  {:db/ident :lime/avgAmbiguity,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "ru",
     :rdf/value
     "Свойство 'средней неоднозначности' указывает среднее число лексических понятий, вызываемых каждой леммой/канонической формой в лексиконе."}
    {:rdf/language "en",
     :rdf/value
     "The 'average ambiguity' property indicates the average number of lexical concepts evoked by each lemma/canonical form in the lexicon."}],
   :rdfs/domain :lime/ConceptualizationSet,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/lime",
   :rdfs/label [{:rdf/language "nl",
                 :rdf/value    "gemiddelde ambiguïteit"}
                {:rdf/language "de",
                 :rdf/value    "Durchschnittliche Amiguität"}
                {:rdf/language "it",
                 :rdf/value    "ambiguità media"}
                {:rdf/language "ru",
                 :rdf/value    "средняя неоднозначность"}
                {:rdf/language "fr",
                 :rdf/value    "ambiguïté moyenne"}
                {:rdf/language "en",
                 :rdf/value    "average ambiguity"}
                {:rdf/language "es",
                 :rdf/value    "ambigüedad promedia"}],
   :rdfs/range :xsd/decimal,
   :vs/term_status "stable"})

(def avgNumOfLexicalizations
  "The 'average number of lexicalizations' property indicate the average number of lexicalizations per ontology element. The exact formula for calculating the average is indicated in the specification: https://www.w3.org/community/ontolex/wiki/Final_Model_Specification#LexicalizationSet"
  {:db/ident :lime/avgNumOfLexicalizations,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The 'average number of lexicalizations' property indicate the average number of lexicalizations per ontology element. The exact formula for calculating the average is indicated in the specification: https://www.w3.org/community/ontolex/wiki/Final_Model_Specification#LexicalizationSet"}
    {:rdf/language "ru",
     :rdf/value
     "Свойство 'среднее количество лексикализаций' указывает среднее число лексикализаций на элемент онтологии. Точная формула для вычисления среднего значения указана в спецификации: https://www.w3.org/community/ontolex/wiki/Final_Model_Specification#LexicalizationSet"}],
   :rdfs/domain :lime/LexicalizationSet,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/lime",
   :rdfs/label [{:rdf/language "ro",
                 :rdf/value    "numărul mediu de lexicalizari"}
                {:rdf/language "de",
                 :rdf/value    "Durchschnittliche Anzahl von Lexikalisierungen"}
                {:rdf/language "ru",
                 :rdf/value    "среднее количество лексикализаций"}
                {:rdf/language "en",
                 :rdf/value    "average number of lexicalizations"}
                {:rdf/language "it",
                 :rdf/value    "numero medio di lessicalizzazioni"}
                {:rdf/language "fr",
                 :rdf/value    "nombre moyen de lexicalisations"}
                {:rdf/language "af",
                 :rdf/value    "gemiddelde aantal leksikaliserings"}
                {:rdf/language "pt",
                 :rdf/value    "numero medio de lexicalizações"}
                {:rdf/language "nl",
                 :rdf/value    "gemiddeld aantal van lexicalisatie"}
                {:rdf/language "es",
                 :rdf/value    "promedio de lexicalizaciones"}
                {:rdf/language "sv",
                 :rdf/value    "genomsnittligt antal lexikaliseringar"}],
   :rdfs/range :xsd/decimal,
   :vs/term_status "stable"})

(def avgNumOfLinks
  "The 'average number of links' property indicates the average number of links for each entity in the conceptual dataset."
  {:db/ident :lime/avgNumOfLinks,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The 'average number of links' property indicates the average number of links for each entity in the conceptual dataset."}
    {:rdf/language "ru",
     :rdf/value
     "Свойство 'среднее количество ссылок' указывает среднее число ссылок для каждого объекта в концептуальном наборе данных."}],
   :rdfs/domain :lime/LexicalLinkset,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/lime",
   :rdfs/label [{:rdf/language "nl",
                 :rdf/value    "gemiddeld aantal van links"}
                {:rdf/language "de",
                 :rdf/value    "Durchschnittliche Anzahl von Links"}
                {:rdf/language "en",
                 :rdf/value    "average number of links"}
                {:rdf/language "es",
                 :rdf/value    "promedio de enlaces"}
                {:rdf/language "it",
                 :rdf/value    "numero medio di link"}
                {:rdf/language "ru",
                 :rdf/value    "среднее количество ссылок"}
                {:rdf/language "fr",
                 :rdf/value    "nombre moyen de liens"}],
   :rdfs/range :xsd/decimal,
   :vs/term_status "stable"})

(def avgSynonymy
  "The 'average synonymy' property indicates the average number of lexical entries evoking each lexical concept in the concept set."
  {:db/ident :lime/avgSynonymy,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "ru",
     :rdf/value
     "Свойство 'средняя синонимия' указывает среднее число словарных единиц, вызывающих каждое лексическое понятие в наборе понятий."}
    {:rdf/language "en",
     :rdf/value
     "The 'average synonymy' property indicates the average number of lexical entries evoking each lexical concept in the concept set."}],
   :rdfs/domain :lime/ConceptualizationSet,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/lime",
   :rdfs/label [{:rdf/language "nl",
                 :rdf/value    "gemiddelde synonymie"}
                {:rdf/language "es",
                 :rdf/value    "sinóminedad promedia"}
                {:rdf/language "fr",
                 :rdf/value    "synonymie moyenne"}
                {:rdf/language "it",
                 :rdf/value    "sinonimità media"}
                {:rdf/language "en",
                 :rdf/value    "average synonymy"}
                {:rdf/language "ru",
                 :rdf/value    "средняя синонимия"}
                {:rdf/language "de",
                 :rdf/value    "Durchschnittliche Synonymie"}],
   :rdfs/range :xsd/decimal,
   :vs/term_status "stable"})

(def concepts
  "The 'concepts' property indicates the number of lexical concepts defined in a concept set or involved in either a LexicalLinkset or ConceptualizationSet."
  {:db/ident :lime/concepts,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The 'concepts' property indicates the number of lexical concepts defined in a concept set or involved in either a LexicalLinkset or ConceptualizationSet."}
    {:rdf/language "ru",
     :rdf/value
     "Свойство 'понятия' указывает количество лексических понятий, определенных в наборе понятий или участвующих либо в LexicalLinkset, либо в ConceptualizationSet."}],
   :rdfs/domain {:owl/unionOf [:lime/ConceptualizationSet
                               :lime/LexicalLinkset
                               :ontolex/ConceptSet],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:rdf/language "en",
                      :rdf/value    "http://www.w3.org/ns/lemon/lime"},
   :rdfs/label [{:rdf/language "ru",
                 :rdf/value    "понятия"}
                {:rdf/language "es",
                 :rdf/value    "conceptos"}
                {:rdf/language "de",
                 :rdf/value    "Konzepte"}
                {:rdf/language "nl",
                 :rdf/value    "begrippen"}
                {:rdf/language "fr",
                 :rdf/value    "concepts"}
                {:rdf/language "en",
                 :rdf/value    "concepts"}
                {:rdf/language "it",
                 :rdf/value    "concetti"}],
   :rdfs/range :xsd/integer,
   :vs/term_status "stable"})

(def conceptualDataset
  "The 'conceptual dataset' property relates a lexical link set or a conceptualization set to a corresponding concept set."
  {:db/ident :lime/conceptualDataset,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "ru",
     :rdf/value
     "Свойство 'концептуальный набор данных' связывает набор лексической связи или концептуализацию с соответствующим набором понятий."}
    {:rdf/language "en",
     :rdf/value
     "The 'conceptual dataset' property relates a lexical link set or a conceptualization set to a corresponding concept set."}],
   :rdfs/domain {:owl/unionOf [:lime/ConceptualizationSet :lime/LexicalLinkset],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/lime",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "Konzeptdatensatz"}
                {:rdf/language "en",
                 :rdf/value    "conceptual dataset"}
                {:rdf/language "ru",
                 :rdf/value    "концептуальный набор данных"}
                {:rdf/language "it",
                 :rdf/value    "banca concetti"}
                {:rdf/language "es",
                 :rdf/value    "conjunto de conceptos"}
                {:rdf/language "nl",
                 :rdf/value    "dataset van begrippen"}
                {:rdf/language "fr",
                 :rdf/value    "banque de concepts"}],
   :rdfs/range :ontolex/ConceptSet,
   :vs/term_status "stable"})

(def conceptualizations
  "The 'conceptualizations' property indicates the number of distinct conceptualizations in a conceptualization set."
  {:db/ident :lime/conceptualizations,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The 'conceptualizations' property indicates the number of distinct conceptualizations in a conceptualization set."}
    {:rdf/language "ru",
     :rdf/value
     "Свойство 'концептуализации' указывает на число различных концептуализаций в наборе концептуализаций."}],
   :rdfs/domain :lime/ConceptualizationSet,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/lime",
   :rdfs/label [{:rdf/language "ru",
                 :rdf/value    "концептуализации"}
                {:rdf/language "fr",
                 :rdf/value    "conceptualisations"}
                {:rdf/language "it",
                 :rdf/value    "concettualizzazioni"}
                {:rdf/language "es",
                 :rdf/value    "conceptualizaciones"}
                {:rdf/language "nl",
                 :rdf/value    "conceptualisaties"}
                {:rdf/language "de",
                 :rdf/value    "Konzeptualisierungen"}
                {:rdf/language "en",
                 :rdf/value    "conceptualizations"}],
   :rdfs/range :xsd/integer,
   :vs/term_status "stable"})

(def entry
  "The 'entry' property relates a lexicon to one of the lexical entries contained in it."
  {:db/ident :lime/entry,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "ru",
     :rdf/value
     "Свойство 'запись' связывает лексикон с одной из содержащихся в нем словарных единиц."}
    {:rdf/language "en",
     :rdf/value
     "The 'entry' property relates a lexicon to one of the lexical entries contained in it."}],
   :rdfs/domain :lime/Lexicon,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/lime",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "entrée"}
                {:rdf/language "ru",
                 :rdf/value    "запись"}
                {:rdf/language "sv",
                 :rdf/value    "ingång"}
                {:rdf/language "ro",
                 :rdf/value    "înregistrare"}
                {:rdf/language "af",
                 :rdf/value    "inskrywing"}
                {:rdf/language "en",
                 :rdf/value    "entry"}
                {:rdf/language "nl",
                 :rdf/value    "Item"}
                {:rdf/language "pt",
                 :rdf/value    "entrada"}
                {:rdf/language "es",
                 :rdf/value    "entrada"}
                {:rdf/language "it",
                 :rdf/value    "entrata"}
                {:rdf/language "de",
                 :rdf/value    "Eintrag"}],
   :rdfs/range :ontolex/LexicalEntry,
   :vs/term_status "stable"})

(def language
  "The 'language' property indicates the language of a lexicon, a lexical entry, a concept set or a lexicalization set."
  {:db/ident :lime/language,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The  'language' property indicates the language of a lexicon, a lexical entry, a concept set or a lexicalization set."}
    {:rdf/language "ru",
     :rdf/value
     "Свойство 'язык' указывает язык лексикона, словарной единицы, набора понятий или набора лексикализаций."}],
   :rdfs/domain {:owl/unionOf [:lime/LexicalizationSet
                               :lime/Lexicon
                               :ontolex/ConceptSet
                               :ontolex/LexicalEntry],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/lime",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "Sprache"}
                {:rdf/language "ro",
                 :rdf/value    "limbă"}
                {:rdf/language "fr",
                 :rdf/value    "langue"}
                {:rdf/language "ru",
                 :rdf/value    "язык"}
                {:rdf/language "pt",
                 :rdf/value    "idioma"}
                {:rdf/language "it",
                 :rdf/value    "lingua"}
                {:rdf/language "sv",
                 :rdf/value    "språk"}
                {:rdf/language "af",
                 :rdf/value    "taal"}
                {:rdf/language "nl",
                 :rdf/value    "taal"}
                {:rdf/language "en",
                 :rdf/value    "language"}
                {:rdf/language "es",
                 :rdf/value    "lengua"}],
   :rdfs/range :xsd/language,
   :vs/term_status "stable"})

(def lexicalEntries
  "The 'lexical entries' property indicates the number of distinct lexical entries contained in a lexicon or lexicalization set."
  {:db/ident :lime/lexicalEntries,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The 'lexical entries' property indicates the number of distinct lexical entries contained in a lexicon or lexicalization set."}
    {:rdf/language "ru",
     :rdf/value
     "Свойство 'словарная единица' указывает количество различных словарных единиц, содержащихся в лексиконе или наборе лексикализаций."}],
   :rdfs/domain {:owl/unionOf [:lime/ConceptualizationSet
                               :lime/LexicalizationSet
                               :lime/Lexicon],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy ["http://www.w3.org/ns/lemon/lime"
                      "http://www.w3.org/ns/lemon/lime"],
   :rdfs/label [{:rdf/language "pt",
                 :rdf/value    "entradas lexicas"}
                {:rdf/language "fr",
                 :rdf/value    "lexie"}
                {:rdf/language "es",
                 :rdf/value    "entradas léxicas"}
                {:rdf/language "sv",
                 :rdf/value    "lexikoningångar"}
                {:rdf/language "nl",
                 :rdf/value    "lexikaal items"}
                {:rdf/language "ro",
                 :rdf/value    "înregistrari lexicale"}
                {:rdf/language "af",
                 :rdf/value    "leksikale inskrywing"}
                {:rdf/language "ru",
                 :rdf/value    "словарная единица"}
                {:rdf/language "it",
                 :rdf/value    "entrate lessicali"}
                {:rdf/language "en",
                 :rdf/value    "lexical entries"}
                {:rdf/language "de",
                 :rdf/value    "Lexikoneinträge"}],
   :rdfs/range :xsd/integer,
   :vs/term_status "stable"})

(def lexicalizationModel
  "The 'lexicalization model' property indicates the model used for representing lexical information. Possible values include (but are not limited to) http://www.w3.org/2000/01/rdf-schema# (for the use of rdfs:label), http://www.w3.org/2004/02/skos/core (for the use of skos:pref/alt/hiddenLabel), http://www.w3.org/2008/05/skos-xl (for the use of skosxl:pref/alt/hiddenLabel) and http://www.w3.org/ns/lemon/all for lemon."
  {:db/ident :lime/lexicalizationModel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The 'lexicalization model' property indicates the model used for representing lexical information. Possible values include (but are not limited to) http://www.w3.org/2000/01/rdf-schema# (for the use of rdfs:label), http://www.w3.org/2004/02/skos/core (for the use of skos:pref/alt/hiddenLabel), http://www.w3.org/2008/05/skos-xl (for the use of skosxl:pref/alt/hiddenLabel) and http://www.w3.org/ns/lemon/all for lemon."}
    {:rdf/language "ru",
     :rdf/value
     "Свойство 'модель лексикализации' указывает модель, используемую для представления лексической информации. Возможные значения включают (но не ограничиваются) http://www.w3.org/2000/01/rdf-schema# (for the use of rdfs:label), http://www.w3.org/2004/02/skos/core (for the use of skos:pref/alt/hiddenLabel), http://www.w3.org/2008/05/skos-xl (for the use of skosxl:pref/alt/hiddenLabel) and http://www.w3.org/ns/lemon/all for lemon."}],
   :rdfs/domain :lime/LexicalizationSet,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/lime",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "modello di lessicalizzazione"}
                {:rdf/language "de",
                 :rdf/value    "Lexikalisierungmodell"}
                {:rdf/language "nl",
                 :rdf/value    "model van lexicalisatie"}
                {:rdf/language "en",
                 :rdf/value    "lexicalization model"}
                {:rdf/language "es",
                 :rdf/value    "modelo de lexicalización"}
                {:rdf/language "ru",
                 :rdf/value    "модель лексикализации"}
                {:rdf/language "fr",
                 :rdf/value    "modèle de lexicalisation"}],
   :rdfs/subPropertyOf :void/vocabulary,
   :vs/term_status "stable"})

(def lexicalizations
  "The 'lexicalizations' property indicates the total number of lexicalizations in a lexicalization set, that is the number of unique pairs of lexical entry and denoted ontology element."
  {:db/ident :lime/lexicalizations,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The 'lexicalizations' property indicates the total number of lexicalizations in a lexicalization set, that is the number of unique pairs of lexical entry and denoted ontology element."}
    {:rdf/language "ru",
     :rdf/value
     "Свойство 'лексикализации' указывает общее число лексикализаций в наборе лексикализаций, то есть количество уникальных пар словарных единиц и обозначенного элемента онтологии."}],
   :rdfs/domain :lime/LexicalizationSet,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/lime",
   :rdfs/label [{:rdf/language "sv",
                 :rdf/value    "lexikaliseringar"}
                {:rdf/language "fr",
                 :rdf/value    "lexicalisations"}
                {:rdf/language "nl",
                 :rdf/value    "lexicalisaties"}
                {:rdf/language "it",
                 :rdf/value    "lessicalizzazioni"}
                {:rdf/language "en",
                 :rdf/value    "lexicalizations"}
                {:rdf/language "ro",
                 :rdf/value    "lexicalizari"}
                {:rdf/language "es",
                 :rdf/value    "lexicalizaciones"}
                {:rdf/language "pt",
                 :rdf/value    "lexicalizações"}
                {:rdf/language "af",
                 :rdf/value    "leksikaliserings"}
                {:rdf/language "de",
                 :rdf/value    "Lexikalisierungen"}
                {:rdf/language "ru",
                 :rdf/value    "лексикализации"}],
   :rdfs/range :xsd/integer,
   :vs/term_status "stable"})

(def lexiconDataset
  "The 'lexicon dataset' property indicates the lexicon that contains the entries refered to in a lexicalization set or a conceptualization set."
  {:db/ident :lime/lexiconDataset,
   :rdf/type [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The 'lexicon dataset' property indicates the lexicon that contains the entries refered to in a lexicalization set or a conceptualization set."}
    {:rdf/language "ru",
     :rdf/value
     "Свойство 'лексический набор данных' указывает лексику, которая содержит записи, упомянутые в наборе лексикализации или наборе концептуализации."}],
   :rdfs/domain {:owl/unionOf [:lime/ConceptualizationSet
                               :lime/LexicalizationSet],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/lime",
   :rdfs/label [{:rdf/language "ru",
                 :rdf/value    "лексический набор данных"}
                {:rdf/language "es",
                 :rdf/value    "conjunto de datos del lexicón"}
                {:rdf/language "sv",
                 :rdf/value    "lexikondatamängd"}
                {:rdf/language "af",
                 :rdf/value    "leksikale datastel"}
                {:rdf/language "de",
                 :rdf/value    "Lexikondatensatz"}
                {:rdf/language "nl",
                 :rdf/value    "lexicale dataset"}
                {:rdf/language "it",
                 :rdf/value    "banca dati lessicale"}
                {:rdf/language "en",
                 :rdf/value    "lexicon dataset"}
                {:rdf/language "ro",
                 :rdf/value    "set de date de lexicon"}
                {:rdf/language "fr",
                 :rdf/value    "banque de données lexicales"}],
   :rdfs/range :lime/Lexicon,
   :vs/term_status "stable"})

(def linguisticCatalog
  "The 'linguistic catalog' property indicates the catalog of linguistic categories used in a lexicon to define linguistic properties of lexical entries."
  {:db/ident :lime/linguisticCatalog,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "ru",
     :rdf/value
     "Свойство 'лингвистический каталог' указывает каталог языковых категорий, используемых в лексиконе, для определения лингвистических свойств словарных единиц."}
    {:rdf/language "en",
     :rdf/value
     "The 'linguistic catalog' property indicates the catalog of linguistic categories used in a lexicon to define linguistic properties of lexical entries."}],
   :rdfs/domain :lime/Lexicon,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/lime",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "linguistische Kategorienmodell"}
                {:rdf/language "it",
                 :rdf/value    "banca categorie linguistiche"}
                {:rdf/language "ru",
                 :rdf/value    "лингвистический каталог"}
                {:rdf/language "es",
                 :rdf/value    "conjunto de categoríes lingüísticas"}
                {:rdf/language "fr",
                 :rdf/value    "banque de catégories linguistiques"}
                {:rdf/language "nl",
                 :rdf/value    "verzameling van taalkundige categories"}
                {:rdf/language "en",
                 :rdf/value    "lingustic catalog"}],
   :rdfs/range :voaf/Vocabulary,
   :vs/term_status "stable"})

(def links
  "The 'links' property indicates the number of links between concepts in the concept set and entities in the reference dataset."
  {:db/ident :lime/links,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "ru",
     :rdf/value
     "Свойство 'связи' указывает количество связей между понятиями в наборе понятий и объектами в ссылочном наборе данных."}
    {:rdf/language "en",
     :rdf/value
     "The 'links' property indicates the number of links between concepts in the concept set and entities in the reference dataset."}],
   :rdfs/domain :lime/LexicalLinkset,
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/lime",
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "enlaces"}
                {:rdf/language "nl",
                 :rdf/value    "links"}
                {:rdf/language "en",
                 :rdf/value    "links"}
                {:rdf/language "it",
                 :rdf/value    "link"}
                {:rdf/language "fr",
                 :rdf/value    "liens"}
                {:rdf/language "ru",
                 :rdf/value    "связи"}
                {:rdf/language "de",
                 :rdf/value    "Links"}],
   :rdfs/range :xsd/integer,
   :vs/term_status "stable"})

(def partition
  "The 'partition' property relates a lexicalization set or lexical linkset to a logical subset that contains lexicalizations for a given ontological type only."
  {:db/ident :lime/partition,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The 'partition' property relates a lexicalization set or lexical linkset to a logical subset that contains lexicalizations for a given ontological type only."}
    {:rdf/language "ru",
     :rdf/value
     "Свойство 'раздел' связывает набор лексикализации или лексический набор ссылок с логическим подмножеством, который содержит лексикализацию только для данного онтологического типа."}],
   :rdfs/domain {:owl/unionOf [:lime/LexicalLinkset :lime/LexicalizationSet],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/lime",
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "partición"}
                {:rdf/language "fr",
                 :rdf/value    "partition"}
                {:rdf/language "en",
                 :rdf/value    "partition"}
                {:rdf/language "nl",
                 :rdf/value    "verdeling"}
                {:rdf/language "it",
                 :rdf/value    "partizione"}
                {:rdf/language "ru",
                 :rdf/value    "раздел"}
                {:rdf/language "de",
                 :rdf/value    "Teilung"}],
   :rdfs/range {:owl/unionOf [:lime/LexicalLinkset :lime/LexicalizationSet],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :void/subset,
   :vs/term_status "stable"})

(def percentage
  "The 'percentage' property expresses the percentage of entities in the reference dataset which have at least one lexicalization in a lexicalization set or are linked to a lexical concept in a lexical linkset."
  {:db/ident :lime/percentage,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The 'percentage' property expresses the percentage of entities in the reference dataset which have at least one lexicalization in a lexicalization set or are linked to a lexical concept in a lexical linkset."}
    {:rdf/language "ru",
     :rdf/value
     "Свойство 'процент' выражает процент объектов в наборе справочных данных, которые имеют хотя бы одну лексикализацию в наборе лексикализации или связаны с лексической концепцией в лексическом наборе ссылок."}],
   :rdfs/domain {:owl/unionOf [:lime/LexicalLinkset :lime/LexicalizationSet],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/lime",
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "porcentaje"}
                {:rdf/language "it",
                 :rdf/value    "percentuale"}
                {:rdf/language "ru",
                 :rdf/value    "процент"}
                {:rdf/language "de",
                 :rdf/value    "Prozentsatz"}
                {:rdf/language "nl",
                 :rdf/value    "percentage"}
                {:rdf/language "en",
                 :rdf/value    "percentage"}
                {:rdf/language "fr",
                 :rdf/value    "pourcentage"}],
   :rdfs/range :xsd/decimal,
   :vs/term_status "stable"})

(def referenceDataset
  "The 'reference dataset' property indicates the dataset that contains the domain objects or vocabulary elements that are either referenced by a given lexicon, providing the grounding vocabulary for the meaning of the lexical entries, or linked to lexical concepts in a concept set by means of a lexical link set."
  {:db/ident :lime/referenceDataset,
   :rdf/type [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The 'reference dataset' property indicates the dataset that contains the domain objects or vocabulary elements that are either referenced by a given lexicon, providing the grounding vocabulary for the meaning of the lexical entries, or linked to lexical concepts in a concept set by means of a lexical link set."}
    {:rdf/language "ru",
     :rdf/value
     "Свойство 'справочный набор данных' указывает набор данных, который содержит объекты домена или элементы словаря, на которые либо ссылается данный лексикон, обеспечивая базовый словарь для значения словарных единиц или связывая лексическими понятия с понятийными наборами, заданными с помощью набора лексических ссылок."}],
   :rdfs/domain {:owl/unionOf [:lime/LexicalLinkset :lime/LexicalizationSet],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/lime",
   :rdfs/label [{:rdf/language "sv",
                 :rdf/value    "referensdatamängd"}
                {:rdf/language "nl",
                 :rdf/value    "verzameling van referenties"}
                {:rdf/language "it",
                 :rdf/value    "banca riferimenti"}
                {:rdf/language "en",
                 :rdf/value    "reference dataset"}
                {:rdf/language "es",
                 :rdf/value    "conjunto de datos de referencia"}
                {:rdf/language "de",
                 :rdf/value    "Referenzdatensatz"}
                {:rdf/language "af",
                 :rdf/value    "verwysingsdatastel"}
                {:rdf/language "ru",
                 :rdf/value    "справочный набор данных"}
                {:rdf/language "ro",
                 :rdf/value    "setul de date de referință"}
                {:rdf/language "fr",
                 :rdf/value    "banque de réfèrences"}],
   :rdfs/range :void/Dataset,
   :vs/term_status "stable"})

(def references
  "The 'references' property indicates the number of distinct ontology or vocabulary elements that are either associated with lexical entries via a lexicalization set or linked to lexical concepts via a lexical link set."
  {:db/ident :lime/references,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   [{:rdf/language "ru",
     :rdf/value
     "Свойство 'ссылки' указывает количество отдельных онтологий или элементов словаря, которые либо связаны с лексическими элементами через набор лексикализации, либо связаны с лексическими понятиями посредством набора лексической связи."}
    {:rdf/language "en",
     :rdf/value
     "The 'references' property indicates the number of distinct ontology or vocabulary elements that are either associated with lexical entries via a lexicalization set or linked to lexical concepts via a lexical link set."}],
   :rdfs/domain {:owl/unionOf [:lime/LexicalLinkset :lime/LexicalizationSet],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/lime",
   :rdfs/label [{:rdf/language "de",
                 :rdf/value    "Referenzen"}
                {:rdf/language "pt",
                 :rdf/value    "referencias"}
                {:rdf/language "es",
                 :rdf/value    "referencias"}
                {:rdf/language "fr",
                 :rdf/value    "références"}
                {:rdf/language "en",
                 :rdf/value    "references"}
                {:rdf/language "ru",
                 :rdf/value    "ссылки"}
                {:rdf/language "sv",
                 :rdf/value    "referenser"}
                {:rdf/language "it",
                 :rdf/value    "riferimenti"}
                {:rdf/language "ro",
                 :rdf/value    "referințe"}
                {:rdf/language "af",
                 :rdf/value    "verwysings"}
                {:rdf/language "nl",
                 :rdf/value    "referenties"}],
   :rdfs/range :xsd/integer,
   :vs/term_status "stable"})

(def resourceType
  "The 'resource type' property indicates the type of ontological entity of a lexicalization set or lexical linkset."
  {:db/ident :lime/resourceType,
   :rdf/type [:owl/ObjectProperty :owl/FunctionalProperty],
   :rdfs/comment
   [{:rdf/language "en",
     :rdf/value
     "The 'resource type' property indicates the type of ontological entity of a lexicalization set or lexical linkset."}
    {:rdf/language "ru",
     :rdf/value
     "Свойство 'тип ресурса' указывает тип онтологического объекта набора лексикализации или лексического набора ссылок."}],
   :rdfs/domain {:owl/unionOf [:lime/LexicalLinkset :lime/LexicalizationSet],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy "http://www.w3.org/ns/lemon/lime",
   :rdfs/label [{:rdf/language "it",
                 :rdf/value    "tipo di risorsa"}
                {:rdf/language "fr",
                 :rdf/value    "type de ressource"}
                {:rdf/language "ru",
                 :rdf/value    "тип ресурса"}
                {:rdf/language "nl",
                 :rdf/value    "type van ressource"}
                {:rdf/language "en",
                 :rdf/value    "resource type"}
                {:rdf/language "es",
                 :rdf/value    "tipo de recurso"}
                {:rdf/language "de",
                 :rdf/value    "Ressourcentyp"}],
   :rdfs/range :rdfs/Class,
   :vs/term_status "stable"})

(def ^{:private true} Dataset
  {:db/ident :void/Dataset,
   :rdf/type :owl/Class})

(def ^{:private true} Linkset
  {:db/ident :void/Linkset,
   :rdf/type :owl/Class})

(def ^{:private true} subset
  {:db/ident :void/subset,
   :rdf/type :owl/ObjectProperty})

(def ^{:private true} vocabulary
  {:db/ident :void/vocabulary,
   :rdf/type [:owl/ObjectProperty :owl/AnnotationProperty]})

(def ^{:private true} term_status
  {:db/ident :vs/term_status,
   :rdf/type :owl/AnnotationProperty})