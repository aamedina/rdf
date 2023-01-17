(ns net.wikipunk.rdf.lcc-639-2
  "ISO 639-2 Language Codes Ontology"
  {:dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"],
   :owl/versionIRI
   "https://www.omg.org/spec/LCC/20211101/Languages/ISO639-2-LanguageCodes/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "lcc-639-1"
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
    "lcc-639-2"
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfa/prefix "lcc-639-2",
   :rdfa/uri "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ISO 639-2 Language Codes Ontology",
   :rdfs/seeAlso ["http://www.loc.gov/standards/iso639-2/php/code_list.php/"
                  "https://www.omg.org/spec/LCC/Languages/AboutLanguages/"
                  "https://www.omg.org/spec/LCC/AboutLCC/"],
   :skos/changeNote
   ["The http://www.omg.org/spec/LCC/20151101/Languages/ISO639-2-LanguageCodes.rdf version of this ontology has been revised to reflect the issues addressed by the LCC 1.0 FTF report. The codes themselves are current as of 31 July 2017, based on the US Library of Congress site."
    "The https://www.omg.org/spec/LCC/20211101/Languages/ISO639-2-LanguageCodes.rdf version of this ontology has been revised to add a missing axiom for 'identifies' to the alpha-3 language code for the Chinese language, namely 'chi'. The codes themselves are current as of 29 October 2021, based on the US Library of Congress site."
    "The https://www.omg.org/spec/LCC/20190201/Languages/ISO639-2-LanguageCodes.rdf version of this ontology has been revised to reflect addition of the languages Standard Moroccan Tamazight (code zgh) and Montenegrin (code cnr). The codes themselves are current as of 14 February 2019, based on the US Library of Congress site."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2015-2021 Thematix Partners LLC"
                  "Copyright (c) 2015-2017 Unisys"
                  "Copyright (c) 2020-2021 agnos.ai"
                  "Copyright (c) 2015-2019 Adaptive Inc."
                  "Copyright (c) 2015-2021 Object Management Group, Inc."],
   :sm/dependsOn
   ["https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"],
   :sm/fileAbbreviation "lcc-639-2",
   :sm/fileAbstract
   "This ontology represents the subset of the ISO 639 standard that provides the language names and actual codes for ISO 639-2.",
   :sm/filename "ISO639-2-LanguageCodes.rdf"}
  (:refer-clojure :exclude [cat inc map min]))

(def Achinese
  "Achinese language"
  {:db/ident :lcc-639-2/Achinese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Achinese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "aceh"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Achinese",
   :skos/definition "Achinese language"})

(def Acoli
  "Acoli language"
  {:db/ident :lcc-639-2/Acoli,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Acoli"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "acoli"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Acoli",
   :skos/definition "Acoli language"})

(def Adangme
  "Adangme language"
  {:db/ident :lcc-639-2/Adangme,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Adangme"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "adangme"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Adangme",
   :skos/definition "Adangme language"})

(def Adyghe
  "Adyghe language"
  {:db/ident :lcc-639-2/Adyghe,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Adyghe"}
                           {:rdf/language "en",
                            :rdf/value    "Adygei"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "adyghé"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Adyghe",
   :skos/definition "Adyghe language"})

(def Afrihili
  "Afrihili language"
  {:db/ident :lcc-639-2/Afrihili,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Afrihili"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "afrihili"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/ArtificialLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Afrihili",
   :skos/definition "Afrihili language"})

(def AfroAsiaticLanguages
  "Afro-Asiatic languages remainder group"
  {:db/ident :lcc-639-2/AfroAsiaticLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Afro-Asiatic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "afro-asiatiques, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Afro-Asiatic languages",
   :skos/definition "Afro-Asiatic languages remainder group"})

(def Ainu
  "Ainu language"
  {:db/ident :lcc-639-2/Ainu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ainu (Japan)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "aïnou"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Ainu",
   :skos/definition "Ainu language"})

(def Akkadian
  "Akkadian language"
  {:db/ident :lcc-639-2/Akkadian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Akkadian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "akkadien"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Akkadian",
   :skos/definition "Akkadian language"})

(def Aleut
  "Aleut language"
  {:db/ident :lcc-639-2/Aleut,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Aleut"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "aléoute"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Aleut",
   :skos/definition "Aleut language"})

(def AlgonquianLanguages
  "Algonquian languages family"
  {:db/ident :lcc-639-2/AlgonquianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Algonquian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "algonquines, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Algonquian languages",
   :skos/definition "Algonquian languages family"})

(def AltaicLanguages
  "Altaic languages remainder group"
  {:db/ident :lcc-639-2/AltaicLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Altaic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "altaïques, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Altaic languages",
   :skos/definition "Altaic languages remainder group"})

(def AncientEgyptian
  "Ancient Egyptian language"
  {:db/ident :lcc-639-2/AncientEgyptian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Egyptian (Ancient)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "égyptien"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Ancient Egyptian",
   :skos/definition "Ancient Egyptian language"})

(def AncientGreek
  "Ancient Greek language"
  {:db/ident :lcc-639-2/AncientGreek,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Greek, Ancient (to 1453)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "grec ancien (jusqu'à 1453)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Ancient Greek",
   :skos/definition "Ancient Greek language"})

(def Angika
  "Angika language"
  {:db/ident :lcc-639-2/Angika,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Angika"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "angika"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Angika",
   :skos/definition "Angika language"})

(def ApacheLanguages
  "Apache languages family"
  {:db/ident :lcc-639-2/ApacheLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Apache languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "apaches, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Apache languages",
   :skos/definition "Apache languages family"})

(def Arapaho
  "Arapaho language"
  {:db/ident :lcc-639-2/Arapaho,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Arapaho"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "arapaho"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Arapaho",
   :skos/definition "Arapaho language"})

(def Arawak
  "Arawak language"
  {:db/ident :lcc-639-2/Arawak,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Arawak"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "arawak"},
   :rdf/type [:lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Arawak",
   :skos/definition "Arawak language"})

(def ArtificialLanguages
  "Artificial languages remainder group"
  {:db/ident :lcc-639-2/ArtificialLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Artificial languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "artificielles, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Artificial languages",
   :skos/definition "Artificial languages remainder group"})

(def Asturian
  "Asturian language"
  {:db/ident :lcc-639-2/Asturian,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Asturleonese"}
                           {:rdf/language "en",
                            :rdf/value    "Leonese"}
                           {:rdf/language "en",
                            :rdf/value    "Asturian"}
                           {:rdf/language "en",
                            :rdf/value    "Bable"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "asturien"}
                          {:rdf/language "fr",
                           :rdf/value    "bable"}
                          {:rdf/language "fr",
                           :rdf/value    "asturoléonais"}
                          {:rdf/language "fr",
                           :rdf/value    "léonais"}],
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Asturian",
   :skos/definition "Asturian language"})

(def AthapascanLanguages
  "Athapascan languages family"
  {:db/ident :lcc-639-2/AthapascanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Athapascan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "athapascanes, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Athapascan languages",
   :skos/definition "Athapascan languages family"})

(def AustralianLanguages
  "Australian languages family"
  {:db/ident :lcc-639-2/AustralianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Australian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "australiennes, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Australian languages",
   :skos/definition "Australian languages family"})

(def AustronesianLanguages
  "Austronesian languages remainder group"
  {:db/ident :lcc-639-2/AustronesianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Austronesian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "austronésiennes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Austronesian languages",
   :skos/definition "Austronesian languages remainder group"})

(def Awadhi
  "Awadhi language"
  {:db/ident :lcc-639-2/Awadhi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Awadhi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "awadhi"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Awadhi",
   :skos/definition "Awadhi language"})

(def Balinese
  "Balinese language"
  {:db/ident :lcc-639-2/Balinese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Balinese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "balinais"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Balinese",
   :skos/definition "Balinese language"})

(def BalticLanguages
  "Baltic languages remainder group"
  {:db/ident :lcc-639-2/BalticLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Baltic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "baltes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Baltic languages",
   :skos/definition "Baltic languages remainder group"})

(def Baluchi
  "Language code for Baluchi"
  {:db/ident :lcc-639-2/Baluchi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Baluchi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "baloutchi"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Baluchi",
   :skos/definition "Language code for Baluchi"})

(def BamilekeLanguages
  "Bamileke languages family"
  {:db/ident :lcc-639-2/BamilekeLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bamileke languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bamiléké, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Bamileke languages",
   :skos/definition "Bamileke languages family"})

(def BandaLanguages
  "Banda languages family"
  {:db/ident :lcc-639-2/BandaLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Banda languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "banda, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Banda languages",
   :skos/definition "Banda languages family"})

(def BantuLanguages
  "Bantu languages remainder group"
  {:db/ident :lcc-639-2/BantuLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bantu languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bantou, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Bantu languages",
   :skos/definition "Bantu languages remainder group"})

(def Basa
  "Basa language"
  {:db/ident :lcc-639-2/Basa,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Basa (Cameroon)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "basa"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Basa",
   :skos/definition "Basa language"})

(def BatakLanguages
  "Batak languages family"
  {:db/ident :lcc-639-2/BatakLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Batak languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "batak, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Batak languages",
   :skos/definition "Batak languages family"})

(def Beja
  "Beja language"
  {:db/ident :lcc-639-2/Beja,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Bedawiyet"}
                           {:rdf/language "en",
                            :rdf/value    "Beja"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bedja"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Beja",
   :skos/definition "Beja language"})

(def Bemba
  "Bemba language"
  {:db/ident :lcc-639-2/Bemba,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bemba (Zambia)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bemba"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Bemba",
   :skos/definition "Bemba language"})

(def BerberLanguages
  "Berber languages remainder group"
  {:db/ident :lcc-639-2/BerberLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Berber languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "berbères, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Berber languages",
   :skos/definition "Berber languages remainder group"})

(def Bhojpuri
  "Bhojpuri language"
  {:db/ident :lcc-639-2/Bhojpuri,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bhojpuri"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bhojpuri"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Bhojpuri",
   :skos/definition "Bhojpuri language"})

(def Bikol
  "Language code for Bikol"
  {:db/ident :lcc-639-2/Bikol,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bikol"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bikol"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Bikol",
   :skos/definition "Language code for Bikol"})

(def Bilin
  "Bilin language"
  {:db/ident :lcc-639-2/Bilin,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Bilin"}
                           {:rdf/language "en",
                            :rdf/value    "Blin"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "blin"}
                          {:rdf/language "fr",
                           :rdf/value    "bilen"}],
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Bilin",
   :skos/definition "Bilin language"})

(def Bini
  "Bini language"
  {:db/ident :lcc-639-2/Bini,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Bini"}
                           {:rdf/language "en",
                            :rdf/value    "Edo"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "edo"}
                          {:rdf/language "fr",
                           :rdf/value    "bini"}],
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Bini",
   :skos/definition "Bini language"})

(def Bliss
  "Bliss language"
  {:db/ident :lcc-639-2/Bliss,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Blissymbolics"}
                           {:rdf/language "en",
                            :rdf/value    "Blissymbols"}
                           {:rdf/language "en",
                            :rdf/value    "Bliss"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "Bliss"}
                          {:rdf/language "fr",
                           :rdf/value    "symboles Bliss"}],
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/ArtificialLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Bliss",
   :skos/definition "Bliss language"})

(def Braj
  "Braj language"
  {:db/ident :lcc-639-2/Braj,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Braj"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "braj"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Braj",
   :skos/definition "Braj language"})

(def Buginese
  "Buginese language"
  {:db/ident :lcc-639-2/Buginese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Buginese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bugi"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Buginese",
   :skos/definition "Buginese language"})

(def Buriat
  "Language code for Buriat"
  {:db/ident :lcc-639-2/Buriat,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Buriat"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bouriate"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Buriat",
   :skos/definition "Language code for Buriat"})

(def Caddo
  "Caddo language"
  {:db/ident :lcc-639-2/Caddo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Caddo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "caddo"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Caddo",
   :skos/definition "Caddo language"})

(def CaucasianLanguages
  "Caucasian languages remainder group"
  {:db/ident :lcc-639-2/CaucasianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Caucasian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "caucasiennes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Caucasian languages",
   :skos/definition "Caucasian languages remainder group"})

(def Cebuano
  "Cebuano language"
  {:db/ident :lcc-639-2/Cebuano,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Cebuano"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "cebuano"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Cebuano",
   :skos/definition "Cebuano language"})

(def CelticLanguages
  "Celtic languages remainder group"
  {:db/ident :lcc-639-2/CelticLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Celtic languages"},
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "celtes, langues"}
                          {:rdf/language "fr",
                           :rdf/value    "celtiques, langues"}],
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Celtic languages",
   :skos/definition "Celtic languages remainder group"})

(def CentralAmericanIndianLanguages
  "Central American Indian languages remainder group"
  {:db/ident :lcc-639-2/CentralAmericanIndianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Central American Indian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value
                          "amérindiennes de l'Amérique centrale, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Central American Indian languages",
   :skos/definition "Central American Indian languages remainder group"})

(def Chagatai
  "Chagatai language"
  {:db/ident :lcc-639-2/Chagatai,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Chagatai"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "djaghataï"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/ExtinctLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Chagatai",
   :skos/definition "Chagatai language"})

(def ChamicLanguages
  "Chamic languages family"
  {:db/ident :lcc-639-2/ChamicLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Chamic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "chames, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Chamic languages",
   :skos/definition "Chamic languages family"})

(def Cherokee
  "Cherokee language"
  {:db/ident :lcc-639-2/Cherokee,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Cherokee"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "cherokee"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Cherokee",
   :skos/definition "Cherokee language"})

(def Cheyenne
  "Cheyenne language"
  {:db/ident :lcc-639-2/Cheyenne,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Cheyenne"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "cheyenne"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Cheyenne",
   :skos/definition "Cheyenne language"})

(def Chibcha
  "Chibcha language"
  {:db/ident :lcc-639-2/Chibcha,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Chibcha"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "chibcha"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/ExtinctLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Chibcha",
   :skos/definition "Chibcha language"})

(def ChinookJargon
  "Chinook jargon language"
  {:db/ident :lcc-639-2/ChinookJargon,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Chinook jargon"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "chinook, jargon"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Chinook jargon",
   :skos/definition "Chinook jargon language"})

(def Chipewyan
  "Chipewyan language"
  {:db/ident :lcc-639-2/Chipewyan,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Dene Suline"}
                           {:rdf/language "en",
                            :rdf/value    "Chipewyan"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "chipewyan"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Chipewyan",
   :skos/definition "Chipewyan language"})

(def Choctaw
  "Choctaw language"
  {:db/ident :lcc-639-2/Choctaw,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Choctaw"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "choctaw"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Choctaw",
   :skos/definition "Choctaw language"})

(def Chuukese
  "Chuukese language"
  {:db/ident :lcc-639-2/Chuukese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Chuukese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "chuuk"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Chuukese",
   :skos/definition "Chuukese language"})

(def ClassicalNewari
  "Classical Newari language"
  {:db/ident :lcc-639-2/ClassicalNewari,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Old Newari"}
                           {:rdf/language "en",
                            :rdf/value    "Classical Newari"}
                           {:rdf/language "en",
                            :rdf/value    "Classical Nepal Bhasa"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "newari classique"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/HistoricalLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Classical Newari",
   :skos/definition "Classical Newari language"})

(def ClassicalSyriac
  "Classical Syriac family"
  {:db/ident :lcc-639-2/ClassicalSyriac,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Classical Syriac"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "syriaque classique"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Classical Syriac",
   :skos/definition "Classical Syriac family"})

(def Coptic
  "Coptic language"
  {:db/ident :lcc-639-2/Coptic,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Coptic"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "copte"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/ExtinctLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Coptic",
   :skos/definition "Coptic language"})

(def Creek
  "Creek language"
  {:db/ident :lcc-639-2/Creek,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Creek"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "muskogee"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Creek",
   :skos/definition "Creek language"})

(def CreolesAndPidgins
  "Creoles and pidgins remainder group"
  {:db/ident :lcc-639-2/CreolesAndPidgins,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Creoles and pidgins"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "créoles et pidgins"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Creoles and pidgins",
   :skos/definition "Creoles and pidgins remainder group"})

(def CreolesAndPidginsEnglishBased
  "Creoles and pidgins, English based remainder group"
  {:db/ident :lcc-639-2/CreolesAndPidginsEnglishBased,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Creoles and pidgins, English based"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value "créoles et pidgins basés sur l'anglais"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Creoles and pidgins, English based",
   :skos/definition "Creoles and pidgins, English based remainder group"})

(def CreolesAndPidginsFrenchBased
  "Creoles and pidgins, French-based remainder group"
  {:db/ident :lcc-639-2/CreolesAndPidginsFrenchBased,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Creoles and pidgins, French-based"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value
                          "créoles et pidgins basés sur le français"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Creoles and pidgins, French-based",
   :skos/definition "Creoles and pidgins, French-based remainder group"})

(def CreolesAndPidginsPortugueseBased
  "Creoles and pidgins, Portuguese-based remainder group"
  {:db/ident :lcc-639-2/CreolesAndPidginsPortugueseBased,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value "Creoles and pidgins, Portuguese-based"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value
                          "créoles et pidgins basés sur le portugais"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Creoles and pidgins, Portuguese-based",
   :skos/definition "Creoles and pidgins, Portuguese-based remainder group"})

(def CrimeanTatar
  "Crimean Tatar language"
  {:db/ident :lcc-639-2/CrimeanTatar,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Crimean Turkish"}
                           {:rdf/language "en",
                            :rdf/value    "Crimean Tatar"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tatar de Crimé"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Crimean Tatar",
   :skos/definition "Crimean Tatar language"})

(def CushiticLanguages
  "Cushitic languages remainder group"
  {:db/ident :lcc-639-2/CushiticLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Cushitic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "couchitiques, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Cushitic languages",
   :skos/definition "Cushitic languages remainder group"})

(def Dakota
  "Dakota language"
  {:db/ident :lcc-639-2/Dakota,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dakota"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dakota"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Dakota",
   :skos/definition "Dakota language"})

(def Dargwa
  "Dargwa language"
  {:db/ident :lcc-639-2/Dargwa,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dargwa"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dargwa"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Dargwa",
   :skos/definition "Dargwa language"})

(def Delaware
  "Language code for Delaware"
  {:db/ident :lcc-639-2/Delaware,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Delaware"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "delaware"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Delaware",
   :skos/definition "Language code for Delaware"})

(def Dinka
  "Language code for Dinka"
  {:db/ident :lcc-639-2/Dinka,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dinka"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dinka"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Dinka",
   :skos/definition "Language code for Dinka"})

(def Dogri
  "Language code for Dogri (macrolanguage)"
  {:db/ident :lcc-639-2/Dogri,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dogri (macrolanguage)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dogri"},
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Dogri",
   :skos/definition "Language code for Dogri (macrolanguage)"})

(def Dogrib
  "Dogrib language"
  {:db/ident :lcc-639-2/Dogrib,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dogrib"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dogrib"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Dogrib",
   :skos/definition "Dogrib language"})

(def DravidianLanguages
  "Dravidian languages remainder group"
  {:db/ident :lcc-639-2/DravidianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dravidian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dravidiennes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Dravidian languages",
   :skos/definition "Dravidian languages remainder group"})

(def Duala
  "Duala language"
  {:db/ident :lcc-639-2/Duala,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Duala"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "douala"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Duala",
   :skos/definition "Duala language"})

(def Dyula
  "Dyula language"
  {:db/ident :lcc-639-2/Dyula,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dyula"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dioula"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Dyula",
   :skos/definition "Dyula language"})

(def EasternFrisian
  "Eastern Frisian language"
  {:db/ident :lcc-639-2/EasternFrisian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Eastern Frisian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "frison oriental"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Eastern Frisian",
   :skos/definition "Eastern Frisian language"})

(def Efik
  "Efik language"
  {:db/ident :lcc-639-2/Efik,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Efik"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "efik"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Efik",
   :skos/definition "Efik language"})

(def Ekajuk
  "Ekajuk language"
  {:db/ident :lcc-639-2/Ekajuk,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ekajuk"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ekajuk"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Ekajuk",
   :skos/definition "Ekajuk language"})

(def Elamite
  "Elamite language"
  {:db/ident :lcc-639-2/Elamite,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Elamite"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "élamite"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Elamite",
   :skos/definition "Elamite language"})

(def Erzya
  "Erzya language"
  {:db/ident :lcc-639-2/Erzya,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Erzya"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "erzya"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Erzya",
   :skos/definition "Erzya language"})

(def Ewondo
  "Ewondo language"
  {:db/ident :lcc-639-2/Ewondo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ewondo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "éwondo"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Ewondo",
   :skos/definition "Ewondo language"})

(def Fang
  "Fang language"
  {:db/ident :lcc-639-2/Fang,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Fang (Equatorial Guinea)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "fang"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Fang",
   :skos/definition "Fang language"})

(def Fanti
  "Fanti language"
  {:db/ident :lcc-639-2/Fanti,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Fanti"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "fanti"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Fanti",
   :skos/definition "Fanti language"})

(def Filipino
  "Filipino language"
  {:db/ident :lcc-639-2/Filipino,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Pilipino"}
                           {:rdf/language "en",
                            :rdf/value    "Filipino"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "filipino"}
                          {:rdf/language "fr",
                           :rdf/value    "pilipino"}],
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Filipino",
   :skos/definition "Filipino language"})

(def FinnoUgrianLanguages
  "Finno-Ugrian languages remainder group"
  {:db/ident :lcc-639-2/FinnoUgrianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Finno-Ugrian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "finno-ougriennes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Finno-Ugrian languages",
   :skos/definition "Finno-Ugrian languages remainder group"})

(def Fon
  "Fon language"
  {:db/ident :lcc-639-2/Fon,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Fon"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "fon"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Fon",
   :skos/definition "Fon language"})

(def Friulian
  "Friulian language"
  {:db/ident :lcc-639-2/Friulian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Friulian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "frioulan"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Friulian",
   :skos/definition "Friulian language"})

(def Ga
  "Ga language"
  {:db/ident :lcc-639-2/Ga,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ga"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ga"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Ga",
   :skos/definition "Ga language"})

(def GalibiCarib
  "Galibi Carib language"
  {:db/ident :lcc-639-2/GalibiCarib,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Galibi Carib"},
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "karib"}
                          {:rdf/language "fr",
                           :rdf/value    "carib"}
                          {:rdf/language "fr",
                           :rdf/value    "galibi"}],
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Galibi Carib",
   :skos/definition "Galibi Carib language"})

(def Gayo
  "Gayo language"
  {:db/ident :lcc-639-2/Gayo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Gayo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "gayo"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Gayo",
   :skos/definition "Gayo language"})

(def Gbaya
  "Language code for Gbaya (Central African Republic)"
  {:db/ident :lcc-639-2/Gbaya,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Gbaya (Central African Republic)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "gbaya"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Gbaya",
   :skos/definition "Language code for Gbaya (Central African Republic)"})

(def Geez
  "Geez language"
  {:db/ident :lcc-639-2/Geez,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Geez"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "guèze"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Geez",
   :skos/definition "Geez language"})

(def GermanicLanguages
  "Germanic languages remainder group"
  {:db/ident :lcc-639-2/GermanicLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Germanic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "germaniques, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Germanic languages",
   :skos/definition "Germanic languages remainder group"})

(def Gilbertese
  "Gilbertese language"
  {:db/ident :lcc-639-2/Gilbertese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Gilbertese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kiribati"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Gilbertese",
   :skos/definition "Gilbertese language"})

(def Gondi
  "Language code for Gondi"
  {:db/ident :lcc-639-2/Gondi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Gondi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "gond"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Gondi",
   :skos/definition "Language code for Gondi"})

(def Gorontalo
  "Gorontalo language"
  {:db/ident :lcc-639-2/Gorontalo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Gorontalo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "gorontalo"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Gorontalo",
   :skos/definition "Gorontalo language"})

(def Gothic
  "Gothic language"
  {:db/ident :lcc-639-2/Gothic,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Gothic"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "gothique"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Gothic",
   :skos/definition "Gothic language"})

(def Grebo
  "Language code for Grebo"
  {:db/ident :lcc-639-2/Grebo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Grebo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "grebo"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Grebo",
   :skos/definition "Language code for Grebo"})

(def Gwichin
  "Gwich'in language"
  {:db/ident :lcc-639-2/Gwichin,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Gwich'in"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "gwich'in"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Gwich'in",
   :skos/definition "Gwich'in language"})

(def Haida
  "Language code for Haida"
  {:db/ident :lcc-639-2/Haida,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Haida"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "haida"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Haida",
   :skos/definition "Language code for Haida"})

(def Hawaiian
  "Hawaiian language"
  {:db/ident :lcc-639-2/Hawaiian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Hawaiian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "hawaïen"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Hawaiian",
   :skos/definition "Hawaiian language"})

(def Hiligaynon
  "Hiligaynon language"
  {:db/ident :lcc-639-2/Hiligaynon,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Hiligaynon"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "hiligaynon"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Hiligaynon",
   :skos/definition "Hiligaynon language"})

(def HimachaliLanguages
  "Himachali languages family"
  {:db/ident :lcc-639-2/HimachaliLanguages,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Western Pahari languages"}
                           {:rdf/language "en",
                            :rdf/value    "Himachali languages"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "langues paharis occidentales"}
                          {:rdf/language "fr",
                           :rdf/value    "langues himachalis"}],
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Himachali languages",
   :skos/definition "Himachali languages family"})

(def Hittite
  "Hittite language"
  {:db/ident :lcc-639-2/Hittite,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Hittite"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "hittite"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Hittite",
   :skos/definition "Hittite language"})

(def Hmong
  "Language code for Hmong"
  {:db/ident :lcc-639-2/Hmong,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Mong"}
                           {:rdf/language "en",
                            :rdf/value    "Hmong"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "hmong"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Hmong",
   :skos/definition "Language code for Hmong"})

(def Hupa
  "Hupa language"
  {:db/ident :lcc-639-2/Hupa,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Hupa"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "hupa"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Hupa",
   :skos/definition "Hupa language"})

(def ISO639-2-CodeSet
  "the set of language identifiers that comprise the ISO 639-2 specification"
  {:db/ident :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type
   [:lcc-lr/IdentificationScheme :lcc-lr/CodeSet :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ISO 639-2 code set",
   :rdfs/seeAlso ["http://www.loc.gov/standards/iso639-2/php/code_list.php/"],
   :skos/definition
   "the set of language identifiers that comprise the ISO 639-2 specification"})

(def Iban
  "Iban language"
  {:db/ident :lcc-639-2/Iban,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Iban"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "iban"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Iban",
   :skos/definition "Iban language"})

(def IjoLanguages
  "Ijo languages family"
  {:db/ident :lcc-639-2/IjoLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ijo languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ijo, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Ijo languages",
   :skos/definition "Ijo languages family"})

(def Iloko
  "Iloko language"
  {:db/ident :lcc-639-2/Iloko,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Iloko"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ilocano"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Iloko",
   :skos/definition "Iloko language"})

(def InariSami
  "Inari Sami language"
  {:db/ident :lcc-639-2/InariSami,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Inari Sami"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sami d'Inari"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Inari Sami",
   :skos/definition "Inari Sami language"})

(def IndicLanguages
  "Indic languages remainder group"
  {:db/ident :lcc-639-2/IndicLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Indic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "indo-aryennes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Indic languages",
   :skos/definition "Indic languages remainder group"})

(def IndoEuropeanLanguages
  "Indo-European languages remainder group"
  {:db/ident :lcc-639-2/IndoEuropeanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Indo-European languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "indo-européennes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Indo-European languages",
   :skos/definition "Indo-European languages remainder group"})

(def Ingush
  "Ingush language"
  {:db/ident :lcc-639-2/Ingush,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ingush"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ingouche"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Ingush",
   :skos/definition "Ingush language"})

(def IranianLanguages
  "Iranian languages remainder group"
  {:db/ident :lcc-639-2/IranianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Iranian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "iraniennes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Iranian languages",
   :skos/definition "Iranian languages remainder group"})

(def IroquoianLanguages
  "Iroquoian languages family"
  {:db/ident :lcc-639-2/IroquoianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Iroquoian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "iroquoises, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Iroquoian languages",
   :skos/definition "Iroquoian languages family"})

(def JudeoArabic
  "Language code for Judeo-Arabic"
  {:db/ident :lcc-639-2/JudeoArabic,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Judeo-Arabic"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "judéo-arabe"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Judeo-Arabic",
   :skos/definition "Language code for Judeo-Arabic"})

(def JudeoPersian
  "Judeo-Persian language"
  {:db/ident :lcc-639-2/JudeoPersian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Judeo-Persian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "judéo-persan"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Judeo-Persian",
   :skos/definition "Judeo-Persian language"})

(def Kabardian
  "Kabardian language"
  {:db/ident :lcc-639-2/Kabardian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kabardian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kabardien"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kabardian",
   :skos/definition "Kabardian language"})

(def Kabyle
  "Kabyle language"
  {:db/ident :lcc-639-2/Kabyle,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kabyle"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kabyle"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kabyle",
   :skos/definition "Kabyle language"})

(def Kachin
  "Kachin language"
  {:db/ident :lcc-639-2/Kachin,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Kachin"}
                           {:rdf/language "en",
                            :rdf/value    "Jingpho"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "kachin"}
                          {:rdf/language "fr",
                           :rdf/value    "jingpho"}],
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kachin",
   :skos/definition "Kachin language"})

(def Kalmyk
  "Kalmyk language"
  {:db/ident :lcc-639-2/Kalmyk,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Oirat"}
                           {:rdf/language "en",
                            :rdf/value    "Kalmyk"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "kalmouk"}
                          {:rdf/language "fr",
                           :rdf/value    "oïrat"}],
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kalmyk",
   :skos/definition "Kalmyk language"})

(def Kamba
  "Kamba language"
  {:db/ident :lcc-639-2/Kamba,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kamba (Kenya)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kamba"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kamba",
   :skos/definition "Kamba language"})

(def KaraKalpak
  "Kara-Kalpak language"
  {:db/ident :lcc-639-2/KaraKalpak,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kara-Kalpak"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "karakalpak"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kara-Kalpak",
   :skos/definition "Kara-Kalpak language"})

(def KarachayBalkar
  "Karachay-Balkar language"
  {:db/ident :lcc-639-2/KarachayBalkar,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Karachay-Balkar"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "karatchai balkar"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Karachay-Balkar",
   :skos/definition "Karachay-Balkar language"})

(def Karelian
  "Karelian language"
  {:db/ident :lcc-639-2/Karelian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Karelian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "carélien"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Karelian",
   :skos/definition "Karelian language"})

(def KarenLanguages
  "Karen languages family"
  {:db/ident :lcc-639-2/KarenLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Karen languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "karen, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Karen languages",
   :skos/definition "Karen languages family"})

(def Kashubian
  "Kashubian language"
  {:db/ident :lcc-639-2/Kashubian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kashubian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kachoube"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kashubian",
   :skos/definition "Kashubian language"})

(def Kawi
  "Kawi language"
  {:db/ident :lcc-639-2/Kawi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kawi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kawi"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kawi",
   :skos/definition "Kawi language"})

(def Khasi
  "Khasi language"
  {:db/ident :lcc-639-2/Khasi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Khasi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "khasi"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Khasi",
   :skos/definition "Khasi language"})

(def KhoisanLanguages
  "Khoisan languages remainder group"
  {:db/ident :lcc-639-2/KhoisanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Khoisan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "khoïsan, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Khoisan languages",
   :skos/definition "Khoisan languages remainder group"})

(def Khotanese
  "Khotanese language"
  {:db/ident :lcc-639-2/Khotanese,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Sakan"}
                           {:rdf/language "en",
                            :rdf/value    "Khotanese"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "sakan"}
                          {:rdf/language "fr",
                           :rdf/value    "khotanais"}],
   :lcc-lr/hasGermanName {:rdf/language "ge",
                          :rdf/value    "Sakisch"},
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Khotanese",
   :skos/definition "Khotanese language"})

(def Kimbundu
  "Kimbundu language"
  {:db/ident :lcc-639-2/Kimbundu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kimbundu"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kimbundu"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kimbundu",
   :skos/definition "Kimbundu language"})

(def Klingon
  "Klingon language"
  {:db/ident :lcc-639-2/Klingon,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "tlhIngan-Hol"}
                           {:rdf/language "en",
                            :rdf/value    "Klingon"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "klingon"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/ArtificialLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Klingon",
   :skos/definition "Klingon language"})

(def Konkani
  "Language code for Konkani (macrolanguage)"
  {:db/ident :lcc-639-2/Konkani,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Konkani (macrolanguage)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "konkani"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Konkani",
   :skos/definition "Language code for Konkani (macrolanguage)"})

(def Kosraean
  "Kosraean language"
  {:db/ident :lcc-639-2/Kosraean,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kosraean"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kosrae"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kosraean",
   :skos/definition "Kosraean language"})

(def Kpelle
  "Language code for Kpelle"
  {:db/ident :lcc-639-2/Kpelle,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kpelle"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kpellé"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kpelle",
   :skos/definition "Language code for Kpelle"})

(def KruLanguages
  "Kru languages family"
  {:db/ident :lcc-639-2/KruLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kru languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "krou, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kru languages",
   :skos/definition "Kru languages family"})

(def Kumyk
  "Kumyk language"
  {:db/ident :lcc-639-2/Kumyk,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kumyk"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "koumyk"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kumyk",
   :skos/definition "Kumyk language"})

(def Kurukh
  "Kurukh language"
  {:db/ident :lcc-639-2/Kurukh,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kurukh"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kurukh"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kurukh",
   :skos/definition "Kurukh language"})

(def Kutenai
  "Kutenai language"
  {:db/ident :lcc-639-2/Kutenai,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kutenai"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kutenai"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Kutenai",
   :skos/definition "Kutenai language"})

(def Ladino
  "Ladino language"
  {:db/ident :lcc-639-2/Ladino,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ladino"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "judéo-espagnol"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Ladino",
   :skos/definition "Ladino language"})

(def Lahnda
  "Language code for Lahnda"
  {:db/ident :lcc-639-2/Lahnda,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lahnda"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lahnda"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Lahnda",
   :skos/definition "Language code for Lahnda"})

(def Lamba
  "Lamba language"
  {:db/ident :lcc-639-2/Lamba,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lamba"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lamba"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Lamba",
   :skos/definition "Lamba language"})

(def LandDayakLanguages
  "Land Dayak languages family"
  {:db/ident :lcc-639-2/LandDayakLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Land Dayak languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dayak, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Land Dayak languages",
   :skos/definition "Land Dayak languages family"})

(def Lezghian
  "Lezghian language"
  {:db/ident :lcc-639-2/Lezghian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lezghian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lezghien"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Lezghian",
   :skos/definition "Lezghian language"})

(def Lojban
  "Lojban language"
  {:db/ident :lcc-639-2/Lojban,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lojban"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lojban"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/ArtificialLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Lojban",
   :skos/definition "Lojban language"})

(def LowGerman
  "Low German language"
  {:db/ident :lcc-639-2/LowGerman,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Low Saxon"}
                           {:rdf/language "en",
                            :rdf/value    "Low German"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "bas allemand"}
                          {:rdf/language "fr",
                           :rdf/value    "bas saxon"}],
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Low German",
   :skos/definition "Low German language"})

(def LowerSorbian
  "Lower Sorbian language"
  {:db/ident :lcc-639-2/LowerSorbian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lower Sorbian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bas-sorabe"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Lower Sorbian",
   :skos/definition "Lower Sorbian language"})

(def Lozi
  "Lozi language"
  {:db/ident :lcc-639-2/Lozi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lozi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lozi"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Lozi",
   :skos/definition "Lozi language"})

(def LubaLulua
  "Luba-Lulua language"
  {:db/ident :lcc-639-2/LubaLulua,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Luba-Lulua"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "luba-lulua"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Luba-Lulua",
   :skos/definition "Luba-Lulua language"})

(def Luiseno
  "Luiseno language"
  {:db/ident :lcc-639-2/Luiseno,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Luiseno"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "luiseno"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Luiseno",
   :skos/definition "Luiseno language"})

(def LuleSami
  "Lule Sami language"
  {:db/ident :lcc-639-2/LuleSami,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lule Sami"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sami de Lule"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Lule Sami",
   :skos/definition "Lule Sami language"})

(def Lunda
  "Lunda language"
  {:db/ident :lcc-639-2/Lunda,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lunda"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lunda"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Lunda",
   :skos/definition "Lunda language"})

(def LuoKenyaAndTanzania
  "Luo - Kenya and Tanzania language"
  {:db/ident :lcc-639-2/LuoKenyaAndTanzania,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Luo (Kenya and Tanzania)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "luo (Kenya et Tanzanie)"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Luo - Kenya and Tanzania",
   :skos/definition "Luo - Kenya and Tanzania language"})

(def Lushai
  "Lushai language"
  {:db/ident :lcc-639-2/Lushai,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lushai"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lushai"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Lushai",
   :skos/definition "Lushai language"})

(def MacedoRomanian
  "Macedo Romanian language"
  {:db/ident :lcc-639-2/MacedoRomanian,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Arumanian"}
                           {:rdf/language "en",
                            :rdf/value    "Aromanian"}
                           {:rdf/language "en",
                            :rdf/value    "Macedo Romanian"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "macédo-roumain"}
                          {:rdf/language "fr",
                           :rdf/value    "aroumain"}],
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Macedo Romanian",
   :skos/definition "Macedo Romanian language"})

(def Madurese
  "Madurese language"
  {:db/ident :lcc-639-2/Madurese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Madurese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "madourais"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Madurese",
   :skos/definition "Madurese language"})

(def Magahi
  "Magahi language"
  {:db/ident :lcc-639-2/Magahi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Magahi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "magahi"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Magahi",
   :skos/definition "Magahi language"})

(def Maithili
  "Maithili language"
  {:db/ident :lcc-639-2/Maithili,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Maithili"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "maithili"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Maithili",
   :skos/definition "Maithili language"})

(def Makasar
  "Makasar language"
  {:db/ident :lcc-639-2/Makasar,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Makasar"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "makassar"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Makasar",
   :skos/definition "Makasar language"})

(def Manchu
  "Manchu language"
  {:db/ident :lcc-639-2/Manchu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Manchu"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mandchou"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Manchu",
   :skos/definition "Manchu language"})

(def Mandar
  "Mandar language"
  {:db/ident :lcc-639-2/Mandar,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mandar"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mandar"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Mandar",
   :skos/definition "Mandar language"})

(def Mandingo
  "Language code for Mandingo"
  {:db/ident :lcc-639-2/Mandingo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mandingo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mandingue"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Mandingo",
   :skos/definition "Language code for Mandingo"})

(def Manipuri
  "Manipuri language"
  {:db/ident :lcc-639-2/Manipuri,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Manipuri"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "manipuri"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Manipuri",
   :skos/definition "Manipuri language"})

(def ManoboLanguages
  "Manobo languages family"
  {:db/ident :lcc-639-2/ManoboLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Manobo languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "manobo, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Manobo languages",
   :skos/definition "Manobo languages family"})

(def Mapudungun
  "Mapudungun language"
  {:db/ident :lcc-639-2/Mapudungun,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Mapuche"}
                           {:rdf/language "en",
                            :rdf/value    "Mapudungun"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "mapuce"}
                          {:rdf/language "fr",
                           :rdf/value    "mapudungun"}
                          {:rdf/language "fr",
                           :rdf/value    "mapuche"}],
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Mapudungun",
   :skos/definition "Mapudungun language"})

(def Mari
  "Language code for Mari (Russian)"
  {:db/ident :lcc-639-2/Mari,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mari (Russian)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mari"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Mari",
   :skos/definition "Language code for Mari (Russian)"})

(def Marwari
  "Language code for Marwari"
  {:db/ident :lcc-639-2/Marwari,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Marwari"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "marvari"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Marwari",
   :skos/definition "Language code for Marwari"})

(def Masai
  "Masai language"
  {:db/ident :lcc-639-2/Masai,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Masai"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "massaï"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Masai",
   :skos/definition "Masai language"})

(def MayanLanguages
  "Mayan languages family"
  {:db/ident :lcc-639-2/MayanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mayan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "maya, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Mayan languages",
   :skos/definition "Mayan languages family"})

(def Mende
  "Mende language"
  {:db/ident :lcc-639-2/Mende,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mende (Sierra Leone)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mendé"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Mende",
   :skos/definition "Mende language"})

(def MiddleDutch
  "Middle Dutch language"
  {:db/ident :lcc-639-2/MiddleDutch,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dutch, Middle (ca. 1050-1350)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "néerlandais moyen (ca. 1050-1350)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Middle Dutch",
   :skos/definition "Middle Dutch language"})

(def MiddleEnglish
  "Middle English language"
  {:db/ident :lcc-639-2/MiddleEnglish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "English, Middle (1100-1500)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "anglais moyen (1100-1500)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Middle English",
   :skos/definition "Middle English language"})

(def MiddleFrench
  "Middle French language"
  {:db/ident :lcc-639-2/MiddleFrench,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "French, Middle (ca. 1400-1600)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "français moyen (ca. 1400-1600)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Middle French",
   :skos/definition "Middle French language"})

(def MiddleHighGerman
  "Middle High German language"
  {:db/ident :lcc-639-2/MiddleHighGerman,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "German, Middle High (ca. 1050-1500)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "allemand, moyen haut (ca. 1050-1500)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Middle High German",
   :skos/definition "Middle High German language"})

(def MiddleIrish
  "Middle Irish language"
  {:db/ident :lcc-639-2/MiddleIrish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Irish, Middle (900-1200)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "irlandais moyen (900-1200)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Middle Irish",
   :skos/definition "Middle Irish language"})

(def Mikmaq
  "Mi'kmaq language"
  {:db/ident :lcc-639-2/Mikmaq,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Mi'kmaq"}
                           {:rdf/language "en",
                            :rdf/value    "Micmac"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "mi'kmaq"}
                          {:rdf/language "fr",
                           :rdf/value    "micmac"}],
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Mi'kmaq",
   :skos/definition "Mi'kmaq language"})

(def Minangkabau
  "Minangkabau language"
  {:db/ident :lcc-639-2/Minangkabau,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Minangkabau"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "minangkabau"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Minangkabau",
   :skos/definition "Minangkabau language"})

(def Mirandese
  "Mirandese language"
  {:db/ident :lcc-639-2/Mirandese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mirandese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mirandais"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Mirandese",
   :skos/definition "Mirandese language"})

(def Mohawk
  "Mohawk language"
  {:db/ident :lcc-639-2/Mohawk,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mohawk"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mohawk"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Mohawk",
   :skos/definition "Mohawk language"})

(def Moksha
  "Moksha language"
  {:db/ident :lcc-639-2/Moksha,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Moksha"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "moksa"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Moksha",
   :skos/definition "Moksha language"})

(def MonKhmerLanguages
  "Mon-Khmer languages remainder group"
  {:db/ident :lcc-639-2/MonKhmerLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mon-Khmer languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "môn-khmer, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Mon-Khmer languages",
   :skos/definition "Mon-Khmer languages remainder group"})

(def Mongo
  "Mongo language"
  {:db/ident :lcc-639-2/Mongo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mongo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mongo"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Mongo",
   :skos/definition "Mongo language"})

(def Montenegrin
  "Montenegrin language"
  {:db/ident :lcc-639-2/Montenegrin,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Montenegrin"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "monténégrin"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Montenegrin",
   :skos/definition "Montenegrin language"})

(def Mossi
  "Mossi language"
  {:db/ident :lcc-639-2/Mossi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mossi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "moré"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Mossi",
   :skos/definition "Mossi language"})

(def MultipleLanguages
  "Multiple languages special purpose language concept"
  {:db/ident :lcc-639-2/MultipleLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Multiple languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "multilingue"},
   :rdf/type [:lcc-lr/SpecialPurposeLanguageConcept :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Multiple languages",
   :skos/definition "Multiple languages special purpose language concept"})

(def MundaLanguages
  "Munda languages family"
  {:db/ident :lcc-639-2/MundaLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Munda languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mounda, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Munda languages",
   :skos/definition "Munda languages family"})

(def NKo
  "N'Ko language"
  {:db/ident :lcc-639-2/NKo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "N'Ko"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "n'ko"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "N'Ko",
   :skos/definition "N'Ko language"})

(def NahuatlLanguages
  "Nahuatl languages family"
  {:db/ident :lcc-639-2/NahuatlLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nahuatl languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nahuatl, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Nahuatl languages",
   :skos/definition "Nahuatl languages family"})

(def Neapolitan
  "Neapolitan language"
  {:db/ident :lcc-639-2/Neapolitan,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Neapolitan"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "napolitain"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Neapolitan",
   :skos/definition "Neapolitan language"})

(def Newari
  "Newari language"
  {:db/ident :lcc-639-2/Newari,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Newari"}
                           {:rdf/language "en",
                            :rdf/value    "Nepal Bhasa"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "newari"}
                          {:rdf/language "fr",
                           :rdf/value    "nepal bhasa"}],
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Newari",
   :skos/definition "Newari language"})

(def Nias
  "Nias language"
  {:db/ident :lcc-639-2/Nias,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nias"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nias"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Nias",
   :skos/definition "Nias language"})

(def NigerKordofanianLanguages
  "Niger-Kordofanian languages remainder group"
  {:db/ident :lcc-639-2/NigerKordofanianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Niger-Kordofanian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nigéro-kordofaniennes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Niger-Kordofanian languages",
   :skos/definition "Niger-Kordofanian languages remainder group"})

(def NiloSaharanLanguages
  "Nilo-Saharan languages remainder group"
  {:db/ident :lcc-639-2/NiloSaharanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nilo-Saharan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nilo-sahariennes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Nilo-Saharan languages",
   :skos/definition "Nilo-Saharan languages remainder group"})

(def Niuean
  "Niuean language"
  {:db/ident :lcc-639-2/Niuean,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Niuean"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "niué"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Niuean",
   :skos/definition "Niuean language"})

(def NoLinguisticContent
  "No linguistic content special purpose language concept"
  {:db/ident :lcc-639-2/NoLinguisticContent,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Not applicable"}
                           {:rdf/language "en",
                            :rdf/value    "No linguistic content"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "non applicable"}
                          {:rdf/language "fr",
                           :rdf/value    "pas de contenu linguistique"}],
   :rdf/type [:lcc-lr/SpecialPurposeLanguageConcept :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "No linguistic content",
   :skos/definition "No linguistic content special purpose language concept"})

(def Nogai
  "Nogai language"
  {:db/ident :lcc-639-2/Nogai,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nogai"},
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "nogay"}
                          {:rdf/language "fr",
                           :rdf/value    "nogaï"}],
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Nogai",
   :skos/definition "Nogai language"})

(def NorthAmericanIndianLanguages
  "North American Indian languages remainder group"
  {:db/ident :lcc-639-2/NorthAmericanIndianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "North American Indian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nord-amérindiennes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "North American Indian languages",
   :skos/definition "North American Indian languages remainder group"})

(def NorthernFrisian
  "Northern Frisian language"
  {:db/ident :lcc-639-2/NorthernFrisian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Northern Frisian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "frison septentrional"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Northern Frisian",
   :skos/definition "Northern Frisian language"})

(def NubianLanguages
  "Nubian languages family"
  {:db/ident :lcc-639-2/NubianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nubian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nubiennes, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Nubian languages",
   :skos/definition "Nubian languages family"})

(def Nyamwezi
  "Nyamwezi language"
  {:db/ident :lcc-639-2/Nyamwezi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nyamwezi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nyamwezi"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Nyamwezi",
   :skos/definition "Nyamwezi language"})

(def Nyankole
  "Nyankole language"
  {:db/ident :lcc-639-2/Nyankole,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nyankole"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nyankolé"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Nyankole",
   :skos/definition "Nyankole language"})

(def Nyoro
  "Nyoro language"
  {:db/ident :lcc-639-2/Nyoro,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nyoro"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nyoro"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Nyoro",
   :skos/definition "Nyoro language"})

(def Nzima
  "Nzima language"
  {:db/ident :lcc-639-2/Nzima,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nzima"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nzema"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Nzima",
   :skos/definition "Nzima language"})

(def OfficialAramaic
  "Official Aramaic language"
  {:db/ident :lcc-639-2/OfficialAramaic,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Imperial Aramaic (700-300 BCE)"}
                           {:rdf/language "en",
                            :rdf/value    "Official Aramaic (700-300 BCE)"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "araméen d'empire (700-300 BCE)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Official Aramaic",
   :skos/definition "Official Aramaic language"})

(def OldEnglish
  "Old English language"
  {:db/ident :lcc-639-2/OldEnglish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "English, Old (ca. 450-1100)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "anglo-saxon (ca. 450-1100)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Old English",
   :skos/definition "Old English language"})

(def OldFrench
  "Old French language"
  {:db/ident :lcc-639-2/OldFrench,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "French, Old (842-ca.1400)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "français ancien (842-ca.1400)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Old French",
   :skos/definition "Old French language"})

(def OldHighGerman
  "Old High German language"
  {:db/ident :lcc-639-2/OldHighGerman,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "German, Old High (ca. 750-1050)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "allemand, vieux haut (ca. 750-1050)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Old High German",
   :skos/definition "Old High German language"})

(def OldIrish
  "Old Irish language"
  {:db/ident :lcc-639-2/OldIrish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Irish, Old (to 900)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "irlandais ancien (jusqu'à 900)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Old Irish",
   :skos/definition "Old Irish language"})

(def OldNorse
  "Old Norse language"
  {:db/ident :lcc-639-2/OldNorse,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Norse, Old"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "norrois, vieux"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Old Norse",
   :skos/definition "Old Norse language"})

(def OldPersian
  "Old Persian language"
  {:db/ident :lcc-639-2/OldPersian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Persian, Old (ca. 600-400 B.C.)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "perse, vieux (ca. 600-400 av. J.-C.)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Old Persian",
   :skos/definition "Old Persian language"})

(def OldProvencal
  "Old Provencal language"
  {:db/ident :lcc-639-2/OldProvencal,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Provencal, Old (to 1500)"}
                           {:rdf/language "en",
                            :rdf/value    "Occitan, Old (to 1500)"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "provençal ancien (jusqu'à 1500)"}
                          {:rdf/language "fr",
                           :rdf/value    "occitan ancien (jusqu'à 1500)"}],
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Old Provencal",
   :skos/definition "Old Provencal language"})

(def Osage
  "Osage language"
  {:db/ident :lcc-639-2/Osage,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Osage"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "osage"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Osage",
   :skos/definition "Osage language"})

(def OtomianLanguages
  "Otomian languages family"
  {:db/ident :lcc-639-2/OtomianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Otomian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "otomi, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Otomian languages",
   :skos/definition "Otomian languages family"})

(def OttomanTurkish
  "Ottoman Turkish language"
  {:db/ident :lcc-639-2/OttomanTurkish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Turkish, Ottoman (1500-1928)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "turc ottoman (1500-1928)"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/HistoricalLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Ottoman Turkish",
   :skos/definition "Ottoman Turkish language"})

(def Pahlavi
  "Pahlavi language"
  {:db/ident :lcc-639-2/Pahlavi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Pahlavi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "pahlavi"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Pahlavi",
   :skos/definition "Pahlavi language"})

(def Palauan
  "Palauan language"
  {:db/ident :lcc-639-2/Palauan,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Palauan"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "palau"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Palauan",
   :skos/definition "Palauan language"})

(def Pampanga
  "Pampanga language"
  {:db/ident :lcc-639-2/Pampanga,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Kapampangan"}
                           {:rdf/language "en",
                            :rdf/value    "Pampanga"}],
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "pampangan"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Pampanga",
   :skos/definition "Pampanga language"})

(def Pangasinan
  "Pangasinan language"
  {:db/ident :lcc-639-2/Pangasinan,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Pangasinan"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "pangasinan"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Pangasinan",
   :skos/definition "Pangasinan language"})

(def Papiamento
  "Papiamento language"
  {:db/ident :lcc-639-2/Papiamento,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Papiamento"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "papiamento"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Papiamento",
   :skos/definition "Papiamento language"})

(def PapuanLanguages
  "Papuan languages remainder group"
  {:db/ident :lcc-639-2/PapuanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Papuan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "papoues, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Papuan languages",
   :skos/definition "Papuan languages remainder group"})

(def Pedi
  "Pedi language"
  {:db/ident :lcc-639-2/Pedi,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Northern Sotho"}
                           {:rdf/language "en",
                            :rdf/value    "Pedi"}
                           {:rdf/language "en",
                            :rdf/value    "Sepedi"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "sepedi"}
                          {:rdf/language "fr",
                           :rdf/value    "sotho du Nord"}
                          {:rdf/language "fr",
                           :rdf/value    "pedi"}],
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Pedi",
   :skos/definition "Pedi language"})

(def PhilippineLanguages
  "Philippine languages remainder group"
  {:db/ident :lcc-639-2/PhilippineLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Philippine languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "philippines, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Philippine languages",
   :skos/definition "Philippine languages remainder group"})

(def Phoenician
  "Phoenician language"
  {:db/ident :lcc-639-2/Phoenician,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Phoenician"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "phénicien"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Phoenician",
   :skos/definition "Phoenician language"})

(def Pohnpeian
  "Pohnpeian language"
  {:db/ident :lcc-639-2/Pohnpeian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Pohnpeian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "pohnpei"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Pohnpeian",
   :skos/definition "Pohnpeian language"})

(def PrakritLanguages
  "Prakrit languages family"
  {:db/ident :lcc-639-2/PrakritLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Prakrit languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "prâkrit, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Prakrit languages",
   :skos/definition "Prakrit languages family"})

(def Rajasthani
  "Language code for Rajasthani"
  {:db/ident :lcc-639-2/Rajasthani,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Rajasthani"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "rajasthani"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Rajasthani",
   :skos/definition "Language code for Rajasthani"})

(def Rapanui
  "Rapanui language"
  {:db/ident :lcc-639-2/Rapanui,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Rapanui"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "rapanui"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Rapanui",
   :skos/definition "Rapanui language"})

(def Rarotongan
  "Rarotongan language"
  {:db/ident :lcc-639-2/Rarotongan,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Rarotongan"}
                           {:rdf/language "en",
                            :rdf/value    "Cook Islands Maori"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "maori des îles Cook"}
                          {:rdf/language "fr",
                           :rdf/value    "rarotonga"}],
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Rarotongan",
   :skos/definition "Rarotongan language"})

(def RomanceLanguages
  "Romance languages remainder group"
  {:db/ident :lcc-639-2/RomanceLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Romance languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "romanes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Romance languages",
   :skos/definition "Romance languages remainder group"})

(def Romany
  "Language code for Romany"
  {:db/ident :lcc-639-2/Romany,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Romany"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tsigane"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Romany",
   :skos/definition "Language code for Romany"})

(def SalishanLanguages
  "Salishan languages family"
  {:db/ident :lcc-639-2/SalishanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Salishan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "salishennes, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Salishan languages",
   :skos/definition "Salishan languages family"})

(def SamaritanAramaic
  "Samaritan Aramaic language"
  {:db/ident :lcc-639-2/SamaritanAramaic,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Samaritan Aramaic"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "samaritain"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/ExtinctLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Samaritan Aramaic",
   :skos/definition "Samaritan Aramaic language"})

(def SamiLanguages
  "Sami languages remainder group"
  {:db/ident :lcc-639-2/SamiLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sami languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sames, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Sami languages",
   :skos/definition "Sami languages remainder group"})

(def Sandawe
  "Sandawe language"
  {:db/ident :lcc-639-2/Sandawe,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sandawe"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sandawe"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Sandawe",
   :skos/definition "Sandawe language"})

(def Santali
  "Santali language"
  {:db/ident :lcc-639-2/Santali,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Santali"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "santal"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Santali",
   :skos/definition "Santali language"})

(def Sasak
  "Sasak language"
  {:db/ident :lcc-639-2/Sasak,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sasak"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sasak"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Sasak",
   :skos/definition "Sasak language"})

(def Scots
  "Scots language"
  {:db/ident :lcc-639-2/Scots,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Scots"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "écossais"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Scots",
   :skos/definition "Scots language"})

(def Selkup
  "Selkup language"
  {:db/ident :lcc-639-2/Selkup,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Selkup"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "selkoupe"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Selkup",
   :skos/definition "Selkup language"})

(def SemiticLanguages
  "Semitic languages remainder group"
  {:db/ident :lcc-639-2/SemiticLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Semitic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sémitiques, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Semitic languages",
   :skos/definition "Semitic languages remainder group"})

(def Serer
  "Serer language"
  {:db/ident :lcc-639-2/Serer,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Serer"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sérère"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Serer",
   :skos/definition "Serer language"})

(def Shan
  "Shan language"
  {:db/ident :lcc-639-2/Shan,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Shan"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "chan"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Shan",
   :skos/definition "Shan language"})

(def Sicilian
  "Sicilian language"
  {:db/ident :lcc-639-2/Sicilian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sicilian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sicilien"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Sicilian",
   :skos/definition "Sicilian language"})

(def Sidamo
  "Sidamo language"
  {:db/ident :lcc-639-2/Sidamo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sidamo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sidamo"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Sidamo",
   :skos/definition "Sidamo language"})

(def SignLanguages
  "Sign languages family"
  {:db/ident :lcc-639-2/SignLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sign languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "langues des signes"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Sign languages",
   :skos/definition "Sign languages family"})

(def Siksika
  "Siksika language"
  {:db/ident :lcc-639-2/Siksika,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Siksika"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "blackfoot"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Siksika",
   :skos/definition "Siksika language"})

(def SinoTibetanLanguages
  "Sino-Tibetan languages remainder group"
  {:db/ident :lcc-639-2/SinoTibetanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sino-Tibetan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sino-tibétaines, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Sino-Tibetan languages",
   :skos/definition "Sino-Tibetan languages remainder group"})

(def SiouanLanguages
  "Siouan languages family"
  {:db/ident :lcc-639-2/SiouanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Siouan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sioux, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Siouan languages",
   :skos/definition "Siouan languages family"})

(def SkoltSami
  "Skolt Sami language"
  {:db/ident :lcc-639-2/SkoltSami,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Skolt Sami"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sami skolt"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Skolt Sami",
   :skos/definition "Skolt Sami language"})

(def SlaveAthapascan
  "Language code for Slave (Athapascan)"
  {:db/ident :lcc-639-2/SlaveAthapascan,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Slave (Athapascan)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "esclave (athapascan)"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Slave - Athapascan",
   :skos/definition "Language code for Slave (Athapascan)"})

(def SlavicLanguages
  "Slavic languages remainder group"
  {:db/ident :lcc-639-2/SlavicLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Slavic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "slaves, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Slavic languages",
   :skos/definition "Slavic languages remainder group"})

(def Sogdian
  "Sogdian language"
  {:db/ident :lcc-639-2/Sogdian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sogdian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sogdien"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Sogdian",
   :skos/definition "Sogdian language"})

(def SonghaiLanguages
  "Songhai languages family"
  {:db/ident :lcc-639-2/SonghaiLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Songhai languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "songhai, autres langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Songhai languages",
   :skos/definition "Songhai languages family"})

(def Soninke
  "Soninke language"
  {:db/ident :lcc-639-2/Soninke,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Soninke"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "soninké"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Soninke",
   :skos/definition "Soninke language"})

(def SorbianLanguages
  "Sorbian languages family"
  {:db/ident :lcc-639-2/SorbianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sorbian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sorabes, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Sorbian languages",
   :skos/definition "Sorbian languages family"})

(def SouthAmericanIndianLanguages
  "South American Indian languages remainder group"
  {:db/ident :lcc-639-2/SouthAmericanIndianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "South American Indian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sud-amérindiennes, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "South American Indian languages",
   :skos/definition "South American Indian languages remainder group"})

(def SouthernAltai
  "Southern Altai language"
  {:db/ident :lcc-639-2/SouthernAltai,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Southern Altai"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "altai du Sud"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Southern Altai",
   :skos/definition "Southern Altai language"})

(def SouthernSami
  "Southern Sami language"
  {:db/ident :lcc-639-2/SouthernSami,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Southern Sami"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sami du Sud"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Southern Sami",
   :skos/definition "Southern Sami language"})

(def SrananTongo
  "Sranan Tongo language"
  {:db/ident :lcc-639-2/SrananTongo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sranan Tongo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sranan tongo"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Sranan Tongo",
   :skos/definition "Sranan Tongo language"})

(def StandardMoroccanTamazight
  "Standard Moroccan Tamazight language"
  {:db/ident :lcc-639-2/StandardMoroccanTamazight,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Standard Moroccan Tamazight"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "amazighe standard marocain"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Standard Moroccan Tamazight",
   :skos/definition "Standard Moroccan Tamazight language"})

(def Sukuma
  "Sukuma language"
  {:db/ident :lcc-639-2/Sukuma,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sukuma"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sukuma"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Sukuma",
   :skos/definition "Sukuma language"})

(def Sumerian
  "Sumerian language"
  {:db/ident :lcc-639-2/Sumerian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sumerian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sumérien"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Sumerian",
   :skos/definition "Sumerian language"})

(def Susu
  "Susu language"
  {:db/ident :lcc-639-2/Susu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Susu"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "soussou"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Susu",
   :skos/definition "Susu language"})

(def SwissGerman
  "Swiss German language"
  {:db/ident :lcc-639-2/SwissGerman,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Swiss German"}
                           {:rdf/language "en",
                            :rdf/value    "Alsatian"}
                           {:rdf/language "en",
                            :rdf/value    "Alemannic"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "alsacien"}
                          {:rdf/language "fr",
                           :rdf/value    "suisse alémanique"}
                          {:rdf/language "fr",
                           :rdf/value    "alémanique"}],
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Swiss German",
   :skos/definition "Swiss German language"})

(def Syriac
  "Language code for Syriac"
  {:db/ident :lcc-639-2/Syriac,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Syriac"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "syriaque"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Syriac",
   :skos/definition "Language code for Syriac"})

(def TaiLanguages
  "Tai languages remainder group"
  {:db/ident :lcc-639-2/TaiLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tai languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tai, langues"},
   :rdf/type [:lcc-lr/RemainderGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tai languages",
   :skos/definition "Tai languages remainder group"})

(def Tamashek
  "Language code for Tamashek"
  {:db/ident :lcc-639-2/Tamashek,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tamashek"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tamacheq"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tamashek",
   :skos/definition "Language code for Tamashek"})

(def Tereno
  "Tereno language"
  {:db/ident :lcc-639-2/Tereno,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tereno"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tereno"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tereno",
   :skos/definition "Tereno language"})

(def Tetum
  "Tetum language"
  {:db/ident :lcc-639-2/Tetum,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tetum"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tetum"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tetum",
   :skos/definition "Tetum language"})

(def Tigre
  "Tigre language"
  {:db/ident :lcc-639-2/Tigre,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tigre"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tigré"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tigre",
   :skos/definition "Tigre language"})

(def Timne
  "Timne language"
  {:db/ident :lcc-639-2/Timne,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Timne"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "temne"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Timne",
   :skos/definition "Timne language"})

(def Tiv
  "Tiv language"
  {:db/ident :lcc-639-2/Tiv,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tiv"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tiv"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tiv",
   :skos/definition "Tiv language"})

(def Tlingit
  "Tlingit language"
  {:db/ident :lcc-639-2/Tlingit,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tlingit"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tlingit"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tlingit",
   :skos/definition "Tlingit language"})

(def TokPisin
  "Tok Pisin language"
  {:db/ident :lcc-639-2/TokPisin,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tok Pisin"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tok pisin"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tok Pisin",
   :skos/definition "Tok Pisin language"})

(def Tokelau
  "Tokelau language"
  {:db/ident :lcc-639-2/Tokelau,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tokelau"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tokelau"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tokelau",
   :skos/definition "Tokelau language"})

(def TongaNyasa
  "Tonga Nyasa language"
  {:db/ident :lcc-639-2/TongaNyasa,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tonga (Nyasa)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tonga (Nyasa)"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tonga Nyasa",
   :skos/definition "Tonga Nyasa language"})

(def Tsimshian
  "Tsimshian language"
  {:db/ident :lcc-639-2/Tsimshian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tsimshian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tsimshian"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tsimshian",
   :skos/definition "Tsimshian language"})

(def Tumbuka
  "Tumbuka language"
  {:db/ident :lcc-639-2/Tumbuka,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tumbuka"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tumbuka"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tumbuka",
   :skos/definition "Tumbuka language"})

(def TupiLanguages
  "Tupi languages family"
  {:db/ident :lcc-639-2/TupiLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tupi languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tupi, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tupi languages",
   :skos/definition "Tupi languages family"})

(def Tuvalu
  "Tuvalu language"
  {:db/ident :lcc-639-2/Tuvalu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tuvalu"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tuvalu"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tuvalu",
   :skos/definition "Tuvalu language"})

(def Tuvinian
  "Tuvinian language"
  {:db/ident :lcc-639-2/Tuvinian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tuvinian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "touva"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Tuvinian",
   :skos/definition "Tuvinian language"})

(def Udmurt
  "Udmurt language"
  {:db/ident :lcc-639-2/Udmurt,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Udmurt"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "oudmourte"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Udmurt",
   :skos/definition "Udmurt language"})

(def Ugaritic
  "Ugaritic language"
  {:db/ident :lcc-639-2/Ugaritic,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ugaritic"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ougaritique"},
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Ugaritic",
   :skos/definition "Ugaritic language"})

(def Umbundu
  "Umbundu language"
  {:db/ident :lcc-639-2/Umbundu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Umbundu"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "umbundu"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Umbundu",
   :skos/definition "Umbundu language"})

(def UncodedLanguages
  "Uncoded languages special purpose language concept"
  {:db/ident :lcc-639-2/UncodedLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Uncoded languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "langues non codées"},
   :rdf/type [:lcc-lr/SpecialPurposeLanguageConcept :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Uncoded languages",
   :skos/definition "Uncoded languages special purpose language concept"})

(def Undetermined
  "Undetermined special purpose language concept"
  {:db/ident :lcc-639-2/Undetermined,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Undetermined"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "indéterminée"},
   :rdf/type [:lcc-lr/SpecialPurposeLanguageConcept :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Undetermined",
   :skos/definition "Undetermined special purpose language concept"})

(def UpperSorbian
  "Upper Sorbian language"
  {:db/ident :lcc-639-2/UpperSorbian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Upper Sorbian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "haut-sorabe"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Upper Sorbian",
   :skos/definition "Upper Sorbian language"})

(def Vai
  "Vai language"
  {:db/ident :lcc-639-2/Vai,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Vai"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "vaï"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Vai",
   :skos/definition "Vai language"})

(def Votic
  "Votic language"
  {:db/ident :lcc-639-2/Votic,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Votic"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "vote"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Votic",
   :skos/definition "Votic language"})

(def WakashanLanguages
  "Wakashan languages family"
  {:db/ident :lcc-639-2/WakashanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Wakashan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "wakashanes, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Wakashan languages",
   :skos/definition "Wakashan languages family"})

(def Waray
  "Waray language"
  {:db/ident :lcc-639-2/Waray,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Waray (Philippines)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "waray"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Waray",
   :skos/definition "Waray language"})

(def Washo
  "Washo language"
  {:db/ident :lcc-639-2/Washo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Washo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "washo"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Washo",
   :skos/definition "Washo language"})

(def Wolaitta
  "Wolaitta language"
  {:db/ident :lcc-639-2/Wolaitta,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Wolaitta"}
                           {:rdf/language "en",
                            :rdf/value    "Wolaytta"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "wolaytta"}
                          {:rdf/language "fr",
                           :rdf/value    "wolaitta"}],
   :lcc-lr/hasGermanName {:rdf/language "ge",
                          :rdf/value    "Walamo-Sprache"},
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Wolaitta",
   :skos/definition "Wolaitta language"})

(def Yakut
  "Yakut language"
  {:db/ident :lcc-639-2/Yakut,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Yakut"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "iakoute"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Yakut",
   :skos/definition "Yakut language"})

(def Yao
  "Yao language"
  {:db/ident :lcc-639-2/Yao,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Yao"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "yao"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Yao",
   :skos/definition "Yao language"})

(def Yapese
  "Yapese language"
  {:db/ident :lcc-639-2/Yapese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Yapese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "yapois"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Yapese",
   :skos/definition "Yapese language"})

(def YupikLanguages
  "Yupik languages family"
  {:db/ident :lcc-639-2/YupikLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Yupik languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "yupik, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Yupik languages",
   :skos/definition "Yupik languages family"})

(def ZandeLanguages
  "Zande languages family"
  {:db/ident :lcc-639-2/ZandeLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Zande languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "zandé, langues"},
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Zande languages",
   :skos/definition "Zande languages family"})

(def Zapotec
  "Language code for Zapotec"
  {:db/ident :lcc-639-2/Zapotec,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Zapotec"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "zapotèque"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Zapotec",
   :skos/definition "Language code for Zapotec"})

(def Zaza
  "Language code for Zaza"
  {:db/ident :lcc-639-2/Zaza,
   :lcc-lr/hasEnglishName [{:rdf/language "en",
                            :rdf/value    "Kirmanjki"}
                           {:rdf/language "en",
                            :rdf/value    "Zaza"}
                           {:rdf/language "en",
                            :rdf/value    "Zazaki"}
                           {:rdf/language "en",
                            :rdf/value    "Dimli"}
                           {:rdf/language "en",
                            :rdf/value    "Dimili"}
                           {:rdf/language "en",
                            :rdf/value    "Kirdki"}],
   :lcc-lr/hasFrenchName [{:rdf/language "fr",
                           :rdf/value    "kirmanjki"}
                          {:rdf/language "fr",
                           :rdf/value    "kirdki"}
                          {:rdf/language "fr",
                           :rdf/value    "dimili"}
                          {:rdf/language "fr",
                           :rdf/value    "dimli"}
                          {:rdf/language "fr",
                           :rdf/value    "zazaki"}
                          {:rdf/language "fr",
                           :rdf/value    "zaza"}],
   :rdf/type
   [:lcc-lr/Macrolanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Zaza",
   :skos/definition "Language code for Zaza"})

(def Zenaga
  "Zenaga language"
  {:db/ident :lcc-639-2/Zenaga,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Zenaga"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "zenaga"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Zenaga",
   :skos/definition "Zenaga language"})

(def Zuni
  "Zuni language"
  {:db/ident :lcc-639-2/Zuni,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Zuni"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "zuni"},
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "Zuni",
   :skos/definition "Zuni language"})

(def aar
  "Alpha-3 language code for Afar"
  {:db/ident :lcc-639-2/aar,
   :lcc-lr/denotes :lcc-639-1/Afar,
   :lcc-lr/hasTag "aar",
   :lcc-lr/identifies :lcc-639-1/Afar,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "aar",
   :skos/definition "Alpha-3 language code for Afar"})

(def abk
  "Alpha-3 language code for Abkhazian"
  {:db/ident :lcc-639-2/abk,
   :lcc-lr/denotes :lcc-639-1/Abkhazian,
   :lcc-lr/hasTag "abk",
   :lcc-lr/identifies :lcc-639-1/Abkhazian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "abk",
   :skos/definition "Alpha-3 language code for Abkhazian"})

(def ace
  "Alpha-3 language code for Achinese"
  {:db/ident :lcc-639-2/ace,
   :lcc-lr/denotes :lcc-639-2/Achinese,
   :lcc-lr/hasTag "ace",
   :lcc-lr/identifies :lcc-639-2/Achinese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ace",
   :skos/definition "Alpha-3 language code for Achinese"})

(def ach
  "Alpha-3 language code for Acoli"
  {:db/ident :lcc-639-2/ach,
   :lcc-lr/denotes :lcc-639-2/Acoli,
   :lcc-lr/hasTag "ach",
   :lcc-lr/identifies :lcc-639-2/Acoli,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ach",
   :skos/definition "Alpha-3 language code for Acoli"})

(def ada
  "Alpha-3 language code for Adangme"
  {:db/ident :lcc-639-2/ada,
   :lcc-lr/denotes :lcc-639-2/Adangme,
   :lcc-lr/hasTag "ada",
   :lcc-lr/identifies :lcc-639-2/Adangme,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ada",
   :skos/definition "Alpha-3 language code for Adangme"})

(def ady
  "Alpha-3 language code for Adygei, Adyghe"
  {:db/ident :lcc-639-2/ady,
   :lcc-lr/denotes :lcc-639-2/Adyghe,
   :lcc-lr/hasTag "ady",
   :lcc-lr/identifies :lcc-639-2/Adyghe,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ady",
   :skos/definition "Alpha-3 language code for Adygei, Adyghe"})

(def afa
  "Alpha-3 language code for Afro-Asiatic languages"
  {:db/ident :lcc-639-2/afa,
   :lcc-lr/denotes :lcc-639-2/AfroAsiaticLanguages,
   :lcc-lr/hasTag "afa",
   :lcc-lr/identifies :lcc-639-2/AfroAsiaticLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "afa",
   :skos/definition "Alpha-3 language code for Afro-Asiatic languages"})

(def afh
  "Alpha-3 language code for Afrihili"
  {:db/ident :lcc-639-2/afh,
   :lcc-lr/denotes :lcc-639-2/Afrihili,
   :lcc-lr/hasTag "afh",
   :lcc-lr/identifies :lcc-639-2/Afrihili,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "afh",
   :skos/definition "Alpha-3 language code for Afrihili"})

(def afr
  "Alpha-3 language code for Afrikaans"
  {:db/ident :lcc-639-2/afr,
   :lcc-lr/denotes :lcc-639-1/Afrikaans,
   :lcc-lr/hasTag "afr",
   :lcc-lr/identifies :lcc-639-1/Afrikaans,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "afr",
   :skos/definition "Alpha-3 language code for Afrikaans"})

(def ain
  "Alpha-3 language code for Ainu"
  {:db/ident :lcc-639-2/ain,
   :lcc-lr/denotes :lcc-639-2/Ainu,
   :lcc-lr/hasTag "ain",
   :lcc-lr/identifies :lcc-639-2/Ainu,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ain",
   :skos/definition "Alpha-3 language code for Ainu"})

(def aka
  "Alpha-3 language code for Akan"
  {:db/ident :lcc-639-2/aka,
   :lcc-lr/denotes :lcc-639-1/Akan,
   :lcc-lr/hasTag "aka",
   :lcc-lr/identifies :lcc-639-1/Akan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "aka",
   :skos/definition "Alpha-3 language code for Akan"})

(def akk
  "Alpha-3 language code for Akkadian"
  {:db/ident :lcc-639-2/akk,
   :lcc-lr/denotes :lcc-639-2/Akkadian,
   :lcc-lr/hasTag "akk",
   :lcc-lr/identifies :lcc-639-2/Akkadian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "akk",
   :skos/definition "Alpha-3 language code for Akkadian"})

(def alb
  "Alpha-3 bibliographic language code for Albanian"
  {:db/ident :lcc-639-2/alb,
   :lcc-lr/denotes :lcc-639-1/Albanian,
   :lcc-lr/hasTag "alb",
   :lcc-lr/identifies :lcc-639-1/Albanian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type
   [:lcc-lr/BibliographicCode :owl/NamedIndividual :lcc-lr/Alpha3Code],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "alb",
   :skos/definition "Alpha-3 bibliographic language code for Albanian"})

(def ale
  "Alpha-3 language code for Aleut"
  {:db/ident :lcc-639-2/ale,
   :lcc-lr/denotes :lcc-639-2/Aleut,
   :lcc-lr/hasTag "ale",
   :lcc-lr/identifies :lcc-639-2/Aleut,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ale",
   :skos/definition "Alpha-3 language code for Aleut"})

(def alg
  "Alpha-3 language code for Algonquian languages"
  {:db/ident :lcc-639-2/alg,
   :lcc-lr/denotes :lcc-639-2/AlgonquianLanguages,
   :lcc-lr/hasTag "alg",
   :lcc-lr/identifies :lcc-639-2/AlgonquianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "alg",
   :skos/definition "Alpha-3 language code for Algonquian languages"})

(def alt
  "Alpha-3 language code for Southern Altai"
  {:db/ident :lcc-639-2/alt,
   :lcc-lr/denotes :lcc-639-2/SouthernAltai,
   :lcc-lr/hasTag "alt",
   :lcc-lr/identifies :lcc-639-2/SouthernAltai,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "alt",
   :skos/definition "Alpha-3 language code for Southern Altai"})

(def amh
  "Alpha-3 language code for Amharic"
  {:db/ident :lcc-639-2/amh,
   :lcc-lr/denotes :lcc-639-1/Amharic,
   :lcc-lr/hasTag "amh",
   :lcc-lr/identifies :lcc-639-1/Amharic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "amh",
   :skos/definition "Alpha-3 language code for Amharic"})

(def ang
  "Alpha-3 language code for English, Old (ca. 450-1100)"
  {:db/ident :lcc-639-2/ang,
   :lcc-lr/denotes :lcc-639-2/OldEnglish,
   :lcc-lr/hasTag "ang",
   :lcc-lr/identifies :lcc-639-2/OldEnglish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ang",
   :skos/definition "Alpha-3 language code for English, Old (ca. 450-1100)"})

(def anp
  "Alpha-3 language code for Angika"
  {:db/ident :lcc-639-2/anp,
   :lcc-lr/denotes :lcc-639-2/Angika,
   :lcc-lr/hasTag "anp",
   :lcc-lr/identifies :lcc-639-2/Angika,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "anp",
   :skos/definition "Alpha-3 language code for Angika"})

(def apa
  "Alpha-3 language code for Apache languages"
  {:db/ident :lcc-639-2/apa,
   :lcc-lr/denotes :lcc-639-2/ApacheLanguages,
   :lcc-lr/hasTag "apa",
   :lcc-lr/identifies :lcc-639-2/ApacheLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "apa",
   :skos/definition "Alpha-3 language code for Apache languages"})

(def ara
  "Alpha-3 language code for Arabic"
  {:db/ident :lcc-639-2/ara,
   :lcc-lr/denotes :lcc-639-1/Arabic,
   :lcc-lr/hasTag "ara",
   :lcc-lr/identifies :lcc-639-1/Arabic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ara",
   :skos/definition "Alpha-3 language code for Arabic"})

(def arc
  "Alpha-3 language code for Official Aramaic"
  {:db/ident :lcc-639-2/arc,
   :lcc-lr/denotes :lcc-639-2/OfficialAramaic,
   :lcc-lr/hasTag "arc",
   :lcc-lr/identifies :lcc-639-2/OfficialAramaic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "arc",
   :skos/definition "Alpha-3 language code for Official Aramaic"})

(def arg
  "Alpha-3 language code for Aragonese"
  {:db/ident :lcc-639-2/arg,
   :lcc-lr/denotes :lcc-639-1/Aragonese,
   :lcc-lr/hasTag "arg",
   :lcc-lr/identifies :lcc-639-1/Aragonese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "arg",
   :skos/definition "Alpha-3 language code for Aragonese"})

(def arm
  "Alpha-3 bibliographic language code for Armenian"
  {:db/ident :lcc-639-2/arm,
   :lcc-lr/denotes :lcc-639-1/Armenian,
   :lcc-lr/hasTag "arm",
   :lcc-lr/identifies :lcc-639-1/Armenian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type
   [:lcc-lr/BibliographicCode :lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "arm",
   :skos/definition "Alpha-3 bibliographic language code for Armenian"})

(def arn
  "Alpha-3 language code for Mapudungun; Mapuche"
  {:db/ident :lcc-639-2/arn,
   :lcc-lr/denotes :lcc-639-2/Mapudungun,
   :lcc-lr/hasTag "arn",
   :lcc-lr/identifies :lcc-639-2/Mapudungun,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "arn",
   :skos/definition "Alpha-3 language code for Mapudungun; Mapuche"})

(def arp
  "Alpha-3 language code for Arapaho"
  {:db/ident :lcc-639-2/arp,
   :lcc-lr/denotes :lcc-639-2/Arapaho,
   :lcc-lr/hasTag "arp",
   :lcc-lr/identifies :lcc-639-2/Arapaho,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "arp",
   :skos/definition "Alpha-3 language code for Arapaho"})

(def art
  "Alpha-3 language code for Artificial languages"
  {:db/ident :lcc-639-2/art,
   :lcc-lr/denotes :lcc-639-2/ArtificialLanguages,
   :lcc-lr/hasTag "art",
   :lcc-lr/identifies :lcc-639-2/ArtificialLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "art",
   :skos/definition "Alpha-3 language code for Artificial languages"})

(def arw
  "Alpha-3 language code for Arawak"
  {:db/ident :lcc-639-2/arw,
   :lcc-lr/denotes :lcc-639-2/Arawak,
   :lcc-lr/hasTag "arw",
   :lcc-lr/identifies :lcc-639-2/Arawak,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "arw",
   :skos/definition "Alpha-3 language code for Arawak"})

(def asm
  "Alpha-3 language code for Assamese"
  {:db/ident :lcc-639-2/asm,
   :lcc-lr/denotes :lcc-639-1/Assamese,
   :lcc-lr/hasTag "asm",
   :lcc-lr/identifies :lcc-639-1/Assamese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "asm",
   :skos/definition "Alpha-3 language code for Assamese"})

(def ast
  "Alpha-3 language code for Asturian; Bable"
  {:db/ident :lcc-639-2/ast,
   :lcc-lr/denotes :lcc-639-2/Asturian,
   :lcc-lr/hasTag "ast",
   :lcc-lr/identifies :lcc-639-2/Asturian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ast",
   :skos/definition "Alpha-3 language code for Asturian; Bable"})

(def ath
  "Alpha-3 language code for Athapascan languages"
  {:db/ident :lcc-639-2/ath,
   :lcc-lr/denotes :lcc-639-2/AthapascanLanguages,
   :lcc-lr/hasTag "ath",
   :lcc-lr/identifies :lcc-639-2/AthapascanLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ath",
   :skos/definition "Alpha-3 language code for Athapascan languages"})

(def aus
  "Alpha-3 language code for Australian languages"
  {:db/ident :lcc-639-2/aus,
   :lcc-lr/denotes :lcc-639-2/AustralianLanguages,
   :lcc-lr/hasTag "aus",
   :lcc-lr/identifies :lcc-639-2/AustralianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "aus",
   :skos/definition "Alpha-3 language code for Australian languages"})

(def ava
  "Alpha-3 language code for Avaric"
  {:db/ident :lcc-639-2/ava,
   :lcc-lr/denotes :lcc-639-1/Avaric,
   :lcc-lr/hasTag "ava",
   :lcc-lr/identifies :lcc-639-1/Avaric,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ava",
   :skos/definition "Alpha-3 language code for Avaric"})

(def ave
  "Alpha-3 language code for Avestan"
  {:db/ident :lcc-639-2/ave,
   :lcc-lr/denotes :lcc-639-1/Avestan,
   :lcc-lr/hasTag "ave",
   :lcc-lr/identifies :lcc-639-1/Avestan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ave",
   :skos/definition "Alpha-3 language code for Avestan"})

(def awa
  "Alpha-3 language code for Awadhi"
  {:db/ident :lcc-639-2/awa,
   :lcc-lr/denotes :lcc-639-2/Awadhi,
   :lcc-lr/hasTag "awa",
   :lcc-lr/identifies :lcc-639-2/Awadhi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "awa",
   :skos/definition "Alpha-3 language code for Awadhi"})

(def aym
  "Alpha-3 language code for Aymara"
  {:db/ident :lcc-639-2/aym,
   :lcc-lr/denotes :lcc-639-1/Aymara,
   :lcc-lr/hasTag "aym",
   :lcc-lr/identifies :lcc-639-1/Aymara,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "aym",
   :skos/definition "Alpha-3 language code for Aymara"})

(def aze
  "Alpha-3 language code for Azerbaijani"
  {:db/ident :lcc-639-2/aze,
   :lcc-lr/denotes :lcc-639-1/Azerbaijani,
   :lcc-lr/hasTag "aze",
   :lcc-lr/identifies :lcc-639-1/Azerbaijani,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "aze",
   :skos/definition "Alpha-3 language code for Azerbaijani"})

(def bad
  "Alpha-3 language code for Banda languages"
  {:db/ident :lcc-639-2/bad,
   :lcc-lr/denotes :lcc-639-2/BandaLanguages,
   :lcc-lr/hasTag "bad",
   :lcc-lr/identifies :lcc-639-2/BandaLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bad",
   :skos/definition "Alpha-3 language code for Banda languages"})

(def bai
  "Alpha-3 language code for Bamileke languages"
  {:db/ident :lcc-639-2/bai,
   :lcc-lr/denotes :lcc-639-2/BamilekeLanguages,
   :lcc-lr/hasTag "bai",
   :lcc-lr/identifies :lcc-639-2/BamilekeLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bai",
   :skos/definition "Alpha-3 language code for Bamileke languages"})

(def bak
  "Alpha-3 language code for Bashkir"
  {:db/ident :lcc-639-2/bak,
   :lcc-lr/denotes :lcc-639-1/Bashkir,
   :lcc-lr/hasTag "bak",
   :lcc-lr/identifies :lcc-639-1/Bashkir,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bak",
   :skos/definition "Alpha-3 language code for Bashkir"})

(def bal
  "Alpha-3 language code for Baluchi"
  {:db/ident :lcc-639-2/bal,
   :lcc-lr/denotes :lcc-639-2/Baluchi,
   :lcc-lr/hasTag "bal",
   :lcc-lr/identifies :lcc-639-2/Baluchi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bal",
   :skos/definition "Alpha-3 language code for Baluchi"})

(def bam
  "Alpha-3 language code for Bambara"
  {:db/ident :lcc-639-2/bam,
   :lcc-lr/denotes :lcc-639-1/Bambara,
   :lcc-lr/hasTag "bam",
   :lcc-lr/identifies :lcc-639-1/Bambara,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bam",
   :skos/definition "Alpha-3 language code for Bambara"})

(def ban
  "Alpha-3 language code for Balinese"
  {:db/ident :lcc-639-2/ban,
   :lcc-lr/denotes :lcc-639-2/Balinese,
   :lcc-lr/hasTag "ban",
   :lcc-lr/identifies :lcc-639-2/Balinese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ban",
   :skos/definition "Alpha-3 language code for Balinese"})

(def baq
  "Alpha-3 bibliographic language code for Basque"
  {:db/ident :lcc-639-2/baq,
   :lcc-lr/denotes :lcc-639-1/Basque,
   :lcc-lr/hasTag "baq",
   :lcc-lr/identifies :lcc-639-1/Basque,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/BibliographicCode :lcc-lr/Alpha3Code],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "baq",
   :skos/definition "Alpha-3 bibliographic language code for Basque"})

(def bas
  "Alpha-3 language code for Basa"
  {:db/ident :lcc-639-2/bas,
   :lcc-lr/denotes :lcc-639-2/Basa,
   :lcc-lr/hasTag "bas",
   :lcc-lr/identifies :lcc-639-2/Basa,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bas",
   :skos/definition "Alpha-3 language code for Basa"})

(def bat
  "Alpha-3 language code for Baltic languages"
  {:db/ident :lcc-639-2/bat,
   :lcc-lr/denotes :lcc-639-2/BalticLanguages,
   :lcc-lr/hasTag "bat",
   :lcc-lr/identifies :lcc-639-2/BalticLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bat",
   :skos/definition "Alpha-3 language code for Baltic languages"})

(def bej
  "Alpha-3 language code for Beja"
  {:db/ident :lcc-639-2/bej,
   :lcc-lr/denotes :lcc-639-2/Beja,
   :lcc-lr/hasTag "bej",
   :lcc-lr/identifies :lcc-639-2/Beja,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bej",
   :skos/definition "Alpha-3 language code for Beja"})

(def bel
  "Alpha-3 language code for Belarusian"
  {:db/ident :lcc-639-2/bel,
   :lcc-lr/denotes :lcc-639-1/Belarusian,
   :lcc-lr/hasTag "bel",
   :lcc-lr/identifies :lcc-639-1/Belarusian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bel",
   :skos/definition "Alpha-3 language code for Belarusian"})

(def bem
  "Alpha-3 language code for Bemba"
  {:db/ident :lcc-639-2/bem,
   :lcc-lr/denotes :lcc-639-2/Bemba,
   :lcc-lr/hasTag "bem",
   :lcc-lr/identifies :lcc-639-2/Bemba,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bem",
   :skos/definition "Alpha-3 language code for Bemba"})

(def ben
  "Alpha-3 language code for Bengali"
  {:db/ident :lcc-639-2/ben,
   :lcc-lr/denotes :lcc-639-1/Bengali,
   :lcc-lr/hasTag "ben",
   :lcc-lr/identifies :lcc-639-1/Bengali,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ben",
   :skos/definition "Alpha-3 language code for Bengali"})

(def ber
  "Alpha-3 language code for Berber languages"
  {:db/ident :lcc-639-2/ber,
   :lcc-lr/denotes :lcc-639-2/BerberLanguages,
   :lcc-lr/hasTag "ber",
   :lcc-lr/identifies :lcc-639-2/BerberLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ber",
   :skos/definition "Alpha-3 language code for Berber languages"})

(def bho
  "Alpha-3 language code for Bhojpuri"
  {:db/ident :lcc-639-2/bho,
   :lcc-lr/denotes :lcc-639-2/Bhojpuri,
   :lcc-lr/hasTag "bho",
   :lcc-lr/identifies :lcc-639-2/Bhojpuri,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bho",
   :skos/definition "Alpha-3 language code for Bhojpuri"})

(def bih
  "Alpha-3 language code for Bihari languages"
  {:db/ident :lcc-639-2/bih,
   :lcc-lr/denotes :lcc-639-1/BihariLanguages,
   :lcc-lr/hasTag "bih",
   :lcc-lr/identifies :lcc-639-1/BihariLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bih",
   :skos/definition "Alpha-3 language code for Bihari languages"})

(def bik
  "Alpha-3 language code for Bikol"
  {:db/ident :lcc-639-2/bik,
   :lcc-lr/denotes :lcc-639-2/Bikol,
   :lcc-lr/hasTag "bik",
   :lcc-lr/identifies :lcc-639-2/Bikol,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bik",
   :skos/definition "Alpha-3 language code for Bikol"})

(def bin
  "Alpha-3 language code for Bini; Edo"
  {:db/ident :lcc-639-2/bin,
   :lcc-lr/denotes :lcc-639-2/Bini,
   :lcc-lr/hasTag "bin",
   :lcc-lr/identifies :lcc-639-2/Bini,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bin",
   :skos/definition "Alpha-3 language code for Bini; Edo"})

(def bis
  "Alpha-3 language code for Bislama"
  {:db/ident :lcc-639-2/bis,
   :lcc-lr/denotes :lcc-639-1/Bislama,
   :lcc-lr/hasTag "bis",
   :lcc-lr/identifies :lcc-639-1/Bislama,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bis",
   :skos/definition "Alpha-3 language code for Bislama"})

(def bla
  "Alpha-3 language code for Siksika"
  {:db/ident :lcc-639-2/bla,
   :lcc-lr/denotes :lcc-639-2/Siksika,
   :lcc-lr/hasTag "bla",
   :lcc-lr/identifies :lcc-639-2/Siksika,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bla",
   :skos/definition "Alpha-3 language code for Siksika"})

(def bnt
  "Alpha-3 language code for Bantu languages"
  {:db/ident :lcc-639-2/bnt,
   :lcc-lr/denotes :lcc-639-2/BantuLanguages,
   :lcc-lr/hasTag "bnt",
   :lcc-lr/identifies :lcc-639-2/BantuLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bnt",
   :skos/definition "Alpha-3 language code for Bantu languages"})

(def bod
  "Alpha-3 terminologic language code for Tibetan"
  {:db/ident :lcc-639-2/bod,
   :lcc-lr/denotes :lcc-639-1/Tibetan,
   :lcc-lr/hasTag "bod",
   :lcc-lr/identifies :lcc-639-1/Tibetan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/TerminologyCode :lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bod",
   :skos/definition "Alpha-3 terminologic language code for Tibetan"})

(def bos
  "Alpha-3 language code for Bosnian"
  {:db/ident :lcc-639-2/bos,
   :lcc-lr/denotes :lcc-639-1/Bosnian,
   :lcc-lr/hasTag "bos",
   :lcc-lr/identifies :lcc-639-1/Bosnian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bos",
   :skos/definition "Alpha-3 language code for Bosnian"})

(def bra
  "Alpha-3 language code for Braj"
  {:db/ident :lcc-639-2/bra,
   :lcc-lr/denotes :lcc-639-2/Braj,
   :lcc-lr/hasTag "bra",
   :lcc-lr/identifies :lcc-639-2/Braj,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bra",
   :skos/definition "Alpha-3 language code for Braj"})

(def bre
  "Alpha-3 language code for Breton"
  {:db/ident :lcc-639-2/bre,
   :lcc-lr/denotes :lcc-639-1/Breton,
   :lcc-lr/hasTag "bre",
   :lcc-lr/identifies :lcc-639-1/Breton,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bre",
   :skos/definition "Alpha-3 language code for Breton"})

(def btk
  "Alpha-3 language code for Batak languages"
  {:db/ident :lcc-639-2/btk,
   :lcc-lr/denotes :lcc-639-2/BatakLanguages,
   :lcc-lr/hasTag "btk",
   :lcc-lr/identifies :lcc-639-2/BatakLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "btk",
   :skos/definition "Alpha-3 language code for Batak languages"})

(def bua
  "Alpha-3 language code for Buriat"
  {:db/ident :lcc-639-2/bua,
   :lcc-lr/denotes :lcc-639-2/Buriat,
   :lcc-lr/hasTag "bua",
   :lcc-lr/identifies :lcc-639-2/Buriat,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bua",
   :skos/definition "Alpha-3 language code for Buriat"})

(def bug
  "Alpha-3 language code for Buginese"
  {:db/ident :lcc-639-2/bug,
   :lcc-lr/denotes :lcc-639-2/Buginese,
   :lcc-lr/hasTag "bug",
   :lcc-lr/identifies :lcc-639-2/Buginese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bug",
   :skos/definition "Alpha-3 language code for Buginese"})

(def bul
  "Alpha-3 language code for Bulgarian"
  {:db/ident :lcc-639-2/bul,
   :lcc-lr/denotes :lcc-639-1/Bulgarian,
   :lcc-lr/hasTag "bul",
   :lcc-lr/identifies :lcc-639-1/Bulgarian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bul",
   :skos/definition "Alpha-3 language code for Bulgarian"})

(def bur
  "Alpha-3 bibliographic language code for Burmese"
  {:db/ident :lcc-639-2/bur,
   :lcc-lr/denotes :lcc-639-1/Burmese,
   :lcc-lr/hasTag "bur",
   :lcc-lr/identifies :lcc-639-1/Burmese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type
   [:lcc-lr/Alpha3Code :lcc-lr/BibliographicCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "bur",
   :skos/definition "Alpha-3 bibliographic language code for Burmese"})

(def byn
  "Alpha-3 language code for Blin; Bilin"
  {:db/ident :lcc-639-2/byn,
   :lcc-lr/denotes :lcc-639-2/Bilin,
   :lcc-lr/hasTag "byn",
   :lcc-lr/identifies :lcc-639-2/Bilin,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "byn",
   :skos/definition "Alpha-3 language code for Blin; Bilin"})

(def cad
  "Alpha-3 language code for Caddo"
  {:db/ident :lcc-639-2/cad,
   :lcc-lr/denotes :lcc-639-2/Caddo,
   :lcc-lr/hasTag "cad",
   :lcc-lr/identifies :lcc-639-2/Caddo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cad",
   :skos/definition "Alpha-3 language code for Caddo"})

(def cai
  "Alpha-3 language code for Central American Indian languages"
  {:db/ident :lcc-639-2/cai,
   :lcc-lr/denotes :lcc-639-2/CentralAmericanIndianLanguages,
   :lcc-lr/hasTag "cai",
   :lcc-lr/identifies :lcc-639-2/CentralAmericanIndianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cai",
   :skos/definition
   "Alpha-3 language code for Central American Indian languages"})

(def car
  "Alpha-3 language code for Galibi Carib"
  {:db/ident :lcc-639-2/car,
   :lcc-lr/denotes :lcc-639-2/GalibiCarib,
   :lcc-lr/hasTag "car",
   :lcc-lr/identifies :lcc-639-2/GalibiCarib,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "car",
   :skos/definition "Alpha-3 language code for Galibi Carib\n  "})

(def cat
  "Alpha-3 language code for Catalan; Valencian"
  {:db/ident :lcc-639-2/cat,
   :lcc-lr/denotes :lcc-639-1/Catalan,
   :lcc-lr/hasTag "cat",
   :lcc-lr/identifies :lcc-639-1/Catalan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cat",
   :skos/definition "Alpha-3 language code for Catalan; Valencian"})

(def cau
  "Alpha-3 language code for Caucasian languages"
  {:db/ident :lcc-639-2/cau,
   :lcc-lr/denotes :lcc-639-2/CaucasianLanguages,
   :lcc-lr/hasTag "cau",
   :lcc-lr/identifies :lcc-639-2/CaucasianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cau",
   :skos/definition "Alpha-3 language code for Caucasian languages"})

(def ceb
  "Alpha-3 language code for Cebuano"
  {:db/ident :lcc-639-2/ceb,
   :lcc-lr/denotes :lcc-639-2/Cebuano,
   :lcc-lr/hasTag "ceb",
   :lcc-lr/identifies :lcc-639-2/Cebuano,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ceb",
   :skos/definition "Alpha-3 language code for Cebuano"})

(def cel
  "Alpha-3 language code for Celtic languages"
  {:db/ident :lcc-639-2/cel,
   :lcc-lr/denotes :lcc-639-2/CelticLanguages,
   :lcc-lr/hasTag "cel",
   :lcc-lr/identifies :lcc-639-2/CelticLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cel",
   :skos/definition "Alpha-3 language code for Celtic languages"})

(def ces
  "Alpha-3 terminologic language code for Czech"
  {:db/ident :lcc-639-2/ces,
   :lcc-lr/denotes :lcc-639-1/Czech,
   :lcc-lr/hasTag "ces",
   :lcc-lr/identifies :lcc-639-1/Czech,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:owl/NamedIndividual :lcc-lr/TerminologyCode :lcc-lr/Alpha3Code],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ces",
   :skos/definition "Alpha-3 terminologic language code for Czech"})

(def cha
  "Alpha-3 language code for Chamorro"
  {:db/ident :lcc-639-2/cha,
   :lcc-lr/denotes :lcc-639-1/Chamorro,
   :lcc-lr/hasTag "cha",
   :lcc-lr/identifies :lcc-639-1/Chamorro,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cha",
   :skos/definition "Alpha-3 language code for Chamorro"})

(def chb
  "Alpha-3 language code for Chibcha"
  {:db/ident :lcc-639-2/chb,
   :lcc-lr/denotes :lcc-639-2/Chibcha,
   :lcc-lr/hasTag "chb",
   :lcc-lr/identifies :lcc-639-2/Chibcha,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "chb",
   :skos/definition "Alpha-3 language code for Chibcha"})

(def che
  "Alpha-3 language code for Chechen"
  {:db/ident :lcc-639-2/che,
   :lcc-lr/denotes :lcc-639-1/Chechen,
   :lcc-lr/hasTag "che",
   :lcc-lr/identifies :lcc-639-1/Chechen,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "che",
   :skos/definition "Alpha-3 language code for Chechen"})

(def chg
  "Alpha-3 language code for Chagatai"
  {:db/ident :lcc-639-2/chg,
   :lcc-lr/denotes :lcc-639-2/Chagatai,
   :lcc-lr/hasTag "chg",
   :lcc-lr/identifies :lcc-639-2/Chagatai,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "chg",
   :skos/definition "Alpha-3 language code for Chagatai\n  "})

(def chi
  "Alpha-3 bibliographic language code for Chinese"
  {:db/ident :lcc-639-2/chi,
   :lcc-lr/denotes :lcc-639-1/Chinese,
   :lcc-lr/hasTag "chi",
   :lcc-lr/identifies :lcc-639-1/Chinese,
   :rdf/type
   [:lcc-lr/Alpha3Code :lcc-lr/BibliographicCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "chi",
   :skos/definition "Alpha-3 bibliographic language code for Chinese"})

(def chk
  "Alpha-3 language code for Chuukese"
  {:db/ident :lcc-639-2/chk,
   :lcc-lr/denotes :lcc-639-2/Chuukese,
   :lcc-lr/hasTag "chk",
   :lcc-lr/identifies :lcc-639-2/Chuukese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "chk",
   :skos/definition "Alpha-3 language code for Chuukese\n  "})

(def chm
  "Alpha-3 language code for Mari"
  {:db/ident :lcc-639-2/chm,
   :lcc-lr/denotes :lcc-639-2/Mari,
   :lcc-lr/hasTag "chm",
   :lcc-lr/identifies :lcc-639-2/Mari,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "chm",
   :skos/definition "Alpha-3 language code for Mari"})

(def chn
  "Alpha-3 language code for Chinook jargon"
  {:db/ident :lcc-639-2/chn,
   :lcc-lr/denotes :lcc-639-2/ChinookJargon,
   :lcc-lr/hasTag "chn",
   :lcc-lr/identifies :lcc-639-2/ChinookJargon,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "chn",
   :skos/definition "Alpha-3 language code for Chinook jargon\n  "})

(def cho
  "Alpha-3 language code for Choctaw"
  {:db/ident :lcc-639-2/cho,
   :lcc-lr/denotes :lcc-639-2/Choctaw,
   :lcc-lr/hasTag "cho",
   :lcc-lr/identifies :lcc-639-2/Choctaw,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cho",
   :skos/definition "Alpha-3 language code for Choctaw"})

(def chp
  "Alpha-3 language code for Chipewyan"
  {:db/ident :lcc-639-2/chp,
   :lcc-lr/denotes :lcc-639-2/Chipewyan,
   :lcc-lr/hasTag "chp",
   :lcc-lr/identifies :lcc-639-2/Chipewyan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "chp",
   :skos/definition "Alpha-3 language code for Chipewyan"})

(def chr
  "Alpha-3 language code for Cherokee"
  {:db/ident :lcc-639-2/chr,
   :lcc-lr/denotes :lcc-639-2/Cherokee,
   :lcc-lr/hasTag "chr",
   :lcc-lr/identifies :lcc-639-2/Cherokee,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "chr",
   :skos/definition "Alpha-3 language code for Cherokee"})

(def chu
  "Alpha-3 language code for Church Slavic"
  {:db/ident :lcc-639-2/chu,
   :lcc-lr/denotes :lcc-639-1/ChurchSlavic,
   :lcc-lr/hasTag "chu",
   :lcc-lr/identifies :lcc-639-1/ChurchSlavic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "chu",
   :skos/definition "Alpha-3 language code for Church Slavic"})

(def chv
  "Alpha-3 language code for Chuvash"
  {:db/ident :lcc-639-2/chv,
   :lcc-lr/denotes :lcc-639-1/Chuvash,
   :lcc-lr/hasTag "chv",
   :lcc-lr/identifies :lcc-639-1/Chuvash,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "chv",
   :skos/definition "Alpha-3 language code for Chuvash"})

(def chy
  "Alpha-3 language code for Cheyenne"
  {:db/ident :lcc-639-2/chy,
   :lcc-lr/denotes :lcc-639-2/Cheyenne,
   :lcc-lr/hasTag "chy",
   :lcc-lr/identifies :lcc-639-2/Cheyenne,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "chy",
   :skos/definition "Alpha-3 language code for Cheyenne"})

(def cmc
  "Alpha-3 language code for Chamic languages"
  {:db/ident :lcc-639-2/cmc,
   :lcc-lr/denotes :lcc-639-2/ChamicLanguages,
   :lcc-lr/hasTag "cmc",
   :lcc-lr/identifies :lcc-639-2/ChamicLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cmc",
   :skos/definition "Alpha-3 language code for Chamic languages"})

(def cnr
  "Alpha-3 language code for Montenegrin"
  {:db/ident :lcc-639-2/cnr,
   :lcc-lr/denotes :lcc-639-2/Montenegrin,
   :lcc-lr/hasTag "cnr",
   :lcc-lr/identifies :lcc-639-2/Montenegrin,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cnr",
   :skos/definition "Alpha-3 language code for Montenegrin"})

(def cop
  "Alpha-3 language code for Coptic"
  {:db/ident :lcc-639-2/cop,
   :lcc-lr/denotes :lcc-639-2/Coptic,
   :lcc-lr/hasTag "cop",
   :lcc-lr/identifies :lcc-639-2/Coptic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cop",
   :skos/definition "Alpha-3 language code for Coptic"})

(def cor
  "Alpha-3 language code for Cornish"
  {:db/ident :lcc-639-2/cor,
   :lcc-lr/denotes :lcc-639-1/Cornish,
   :lcc-lr/hasTag "cor",
   :lcc-lr/identifies :lcc-639-1/Cornish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cor",
   :skos/definition "Alpha-3 language code for Cornish"})

(def cos
  "Alpha-3 language code for Corsican"
  {:db/ident :lcc-639-2/cos,
   :lcc-lr/denotes :lcc-639-1/Corsican,
   :lcc-lr/hasTag "cos",
   :lcc-lr/identifies :lcc-639-1/Corsican,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cos",
   :skos/definition "Alpha-3 language code for Corsican"})

(def cpe
  "Alpha-3 language code for Creoles and pidgins, English based"
  {:db/ident :lcc-639-2/cpe,
   :lcc-lr/denotes :lcc-639-2/CreolesAndPidginsEnglishBased,
   :lcc-lr/hasTag "cpe",
   :lcc-lr/identifies :lcc-639-2/CreolesAndPidginsEnglishBased,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cpe",
   :skos/definition
   "Alpha-3 language code for Creoles and pidgins, English based"})

(def cpf
  "Alpha-3 language code for Creoles and pidgins, French-based"
  {:db/ident :lcc-639-2/cpf,
   :lcc-lr/denotes :lcc-639-2/CreolesAndPidginsFrenchBased,
   :lcc-lr/hasTag "cpf",
   :lcc-lr/identifies :lcc-639-2/CreolesAndPidginsFrenchBased,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cpf",
   :skos/definition
   "Alpha-3 language code for Creoles and pidgins, French-based"})

(def cpp
  "Alpha-3 language code for Creoles and pidgins, Portuguese-based"
  {:db/ident :lcc-639-2/cpp,
   :lcc-lr/denotes :lcc-639-2/CreolesAndPidginsPortugueseBased,
   :lcc-lr/hasTag "cpp",
   :lcc-lr/identifies :lcc-639-2/CreolesAndPidginsPortugueseBased,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cpp",
   :skos/definition
   "Alpha-3 language code for Creoles and pidgins, Portuguese-based"})

(def cre
  "Alpha-3 language code for Cree"
  {:db/ident :lcc-639-2/cre,
   :lcc-lr/denotes :lcc-639-1/Cree,
   :lcc-lr/hasTag "cre",
   :lcc-lr/identifies :lcc-639-1/Cree,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cre",
   :skos/definition "Alpha-3 language code for Cree"})

(def crh
  "Alpha-3 language code for Crimean Tatar; Crimean Turkish"
  {:db/ident :lcc-639-2/crh,
   :lcc-lr/denotes :lcc-639-2/CrimeanTatar,
   :lcc-lr/hasTag "crh",
   :lcc-lr/identifies :lcc-639-2/CrimeanTatar,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "crh",
   :skos/definition "Alpha-3 language code for Crimean Tatar; Crimean Turkish"})

(def crp
  "Alpha-3 language code for Creoles and pidgins"
  {:db/ident :lcc-639-2/crp,
   :lcc-lr/denotes :lcc-639-2/CreolesAndPidgins,
   :lcc-lr/hasTag "crp",
   :lcc-lr/identifies :lcc-639-2/CreolesAndPidgins,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "crp",
   :skos/definition "Alpha-3 language code for Creoles and pidgins"})

(def csb
  "Alpha-3 language code for Kashubian"
  {:db/ident :lcc-639-2/csb,
   :lcc-lr/denotes :lcc-639-2/Kashubian,
   :lcc-lr/hasTag "csb",
   :lcc-lr/identifies :lcc-639-2/Kashubian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "csb",
   :skos/definition "Alpha-3 language code for Kashubian"})

(def cus
  "Alpha-3 language code for Cushitic languages"
  {:db/ident :lcc-639-2/cus,
   :lcc-lr/denotes :lcc-639-2/CushiticLanguages,
   :lcc-lr/hasTag "cus",
   :lcc-lr/identifies :lcc-639-2/CushiticLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cus",
   :skos/definition "Alpha-3 language code for Cushitic languages"})

(def cym
  "Alpha-3 terminologic language code for Welsh"
  {:db/ident :lcc-639-2/cym,
   :lcc-lr/denotes :lcc-639-1/Welsh,
   :lcc-lr/hasTag "cym",
   :lcc-lr/identifies :lcc-639-1/Welsh,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:owl/NamedIndividual :lcc-lr/TerminologyCode :lcc-lr/Alpha3Code],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cym",
   :skos/definition "Alpha-3 terminologic language code for Welsh"})

(def cze
  "Alpha-3 bibliographic language code for Czech"
  {:db/ident :lcc-639-2/cze,
   :lcc-lr/denotes :lcc-639-1/Czech,
   :lcc-lr/hasTag "cze",
   :lcc-lr/identifies :lcc-639-1/Czech,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type
   [:lcc-lr/Alpha3Code :owl/NamedIndividual :lcc-lr/BibliographicCode],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "cze",
   :skos/definition "Alpha-3 bibliographic language code for Czech"})

(def dak
  "Alpha-3 language code for Dakota"
  {:db/ident :lcc-639-2/dak,
   :lcc-lr/denotes :lcc-639-2/Dakota,
   :lcc-lr/hasTag "dak",
   :lcc-lr/identifies :lcc-639-2/Dakota,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "dak",
   :skos/definition "Alpha-3 language code for Dakota"})

(def dan
  "Alpha-3 language code for Danish"
  {:db/ident :lcc-639-2/dan,
   :lcc-lr/denotes :lcc-639-1/Danish,
   :lcc-lr/hasTag "dan",
   :lcc-lr/identifies :lcc-639-1/Danish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "dan",
   :skos/definition "Alpha-3 language code for Danish"})

(def dar
  "Alpha-3 language code for Dargwa"
  {:db/ident :lcc-639-2/dar,
   :lcc-lr/denotes :lcc-639-2/Dargwa,
   :lcc-lr/hasTag "dar",
   :lcc-lr/identifies :lcc-639-2/Dargwa,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "dar",
   :skos/definition "Alpha-3 language code for Dargwa"})

(def day
  "Alpha-3 language code for Land Dayak languages"
  {:db/ident :lcc-639-2/day,
   :lcc-lr/denotes :lcc-639-2/LandDayakLanguages,
   :lcc-lr/hasTag "day",
   :lcc-lr/identifies :lcc-639-2/LandDayakLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "day",
   :skos/definition "Alpha-3 language code for Land Dayak languages"})

(def del
  "Alpha-3 language code for Delaware"
  {:db/ident :lcc-639-2/del,
   :lcc-lr/denotes :lcc-639-2/Delaware,
   :lcc-lr/hasTag "del",
   :lcc-lr/identifies :lcc-639-2/Delaware,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "del",
   :skos/definition "Alpha-3 language code for Delaware"})

(def den
  "Alpha-3 language code for Slave (Athapascan)"
  {:db/ident :lcc-639-2/den,
   :lcc-lr/denotes :lcc-639-2/SlaveAthapascan,
   :lcc-lr/hasTag "den",
   :lcc-lr/identifies :lcc-639-2/SlaveAthapascan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "den",
   :skos/definition "Alpha-3 language code for Slave (Athapascan)"})

(def deu
  "Alpha-3 terminologic language code for German"
  {:db/ident :lcc-639-2/deu,
   :lcc-lr/denotes :lcc-639-1/German,
   :lcc-lr/hasTag "deu",
   :lcc-lr/identifies :lcc-639-1/German,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/TerminologyCode :owl/NamedIndividual :lcc-lr/Alpha3Code],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "deu",
   :skos/definition "Alpha-3 terminologic language code for German"})

(def dgr
  "Alpha-3 language code for Dogrib"
  {:db/ident :lcc-639-2/dgr,
   :lcc-lr/denotes :lcc-639-2/Dogrib,
   :lcc-lr/hasTag "dgr",
   :lcc-lr/identifies :lcc-639-2/Dogrib,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "dgr",
   :skos/definition "Alpha-3 language code for Dogrib"})

(def din
  "Alpha-3 language code for Dinka"
  {:db/ident :lcc-639-2/din,
   :lcc-lr/denotes :lcc-639-2/Dinka,
   :lcc-lr/hasTag "din",
   :lcc-lr/identifies :lcc-639-2/Dinka,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "din",
   :skos/definition "Alpha-3 language code for Dinka"})

(def div
  "Alpha-3 language code for Divehi; Dhivehi; Maldivian"
  {:db/ident :lcc-639-2/div,
   :lcc-lr/denotes :lcc-639-1/Dhivehi,
   :lcc-lr/hasTag "div",
   :lcc-lr/identifies :lcc-639-1/Dhivehi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "div",
   :skos/definition "Alpha-3 language code for Divehi; Dhivehi; Maldivian"})

(def doi
  "Alpha-3 language code for Dogri"
  {:db/ident :lcc-639-2/doi,
   :lcc-lr/denotes :lcc-639-2/Dogri,
   :lcc-lr/hasTag "doi",
   :lcc-lr/identifies :lcc-639-2/Dogri,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "doi",
   :skos/definition "Alpha-3 language code for Dogri"})

(def dra
  "Alpha-3 language code for Dravidian languages"
  {:db/ident :lcc-639-2/dra,
   :lcc-lr/denotes :lcc-639-2/DravidianLanguages,
   :lcc-lr/hasTag "dra",
   :lcc-lr/identifies :lcc-639-2/DravidianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "dra",
   :skos/definition "Alpha-3 language code for Dravidian languages"})

(def dsb
  "Alpha-3 language code for Lower Sorbian"
  {:db/ident :lcc-639-2/dsb,
   :lcc-lr/denotes :lcc-639-2/LowerSorbian,
   :lcc-lr/hasTag "dsb",
   :lcc-lr/identifies :lcc-639-2/LowerSorbian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "dsb",
   :skos/definition "Alpha-3 language code for Lower Sorbian"})

(def dua
  "Alpha-3 language code for Duala"
  {:db/ident :lcc-639-2/dua,
   :lcc-lr/denotes :lcc-639-2/Duala,
   :lcc-lr/hasTag "dua",
   :lcc-lr/identifies :lcc-639-2/Duala,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "dua",
   :skos/definition "Alpha-3 language code for Duala"})

(def dum
  "Alpha-3 language code for Dutch, Middle (ca. 1050-1350)"
  {:db/ident :lcc-639-2/dum,
   :lcc-lr/denotes :lcc-639-2/MiddleDutch,
   :lcc-lr/hasTag "dum",
   :lcc-lr/identifies :lcc-639-2/MiddleDutch,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "dum",
   :skos/definition
   "Alpha-3 language code for Dutch, Middle (ca. 1050-1350)\n  "})

(def dut
  "Alpha-3 bibliographic language code for Dutch; Flemish"
  {:db/ident :lcc-639-2/dut,
   :lcc-lr/denotes :lcc-639-1/Dutch,
   :lcc-lr/hasTag "dut",
   :lcc-lr/identifies :lcc-639-1/Dutch,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type
   [:lcc-lr/Alpha3Code :lcc-lr/BibliographicCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "dut",
   :skos/definition "Alpha-3 bibliographic language code for Dutch; Flemish"})

(def dyu
  "Alpha-3 language code for Dyula"
  {:db/ident :lcc-639-2/dyu,
   :lcc-lr/denotes :lcc-639-2/Dyula,
   :lcc-lr/hasTag "dyu",
   :lcc-lr/identifies :lcc-639-2/Dyula,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "dyu",
   :skos/definition "Alpha-3 language code for Dyula"})

(def dzo
  "Alpha-3 language code for Dzongkha"
  {:db/ident :lcc-639-2/dzo,
   :lcc-lr/denotes :lcc-639-1/Dzongkha,
   :lcc-lr/hasTag "dzo",
   :lcc-lr/identifies :lcc-639-1/Dzongkha,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "dzo",
   :skos/definition "Alpha-3 language code for Dzongkha"})

(def efi
  "Alpha-3 language code for Efik"
  {:db/ident :lcc-639-2/efi,
   :lcc-lr/denotes :lcc-639-2/Efik,
   :lcc-lr/hasTag "efi",
   :lcc-lr/identifies :lcc-639-2/Efik,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "efi",
   :skos/definition "Alpha-3 language code for Efik"})

(def egy
  "Alpha-3 language code for Egyptian (Ancient)"
  {:db/ident :lcc-639-2/egy,
   :lcc-lr/denotes :lcc-639-2/AncientEgyptian,
   :lcc-lr/hasTag "egy",
   :lcc-lr/identifies :lcc-639-2/AncientEgyptian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "egy",
   :skos/definition "Alpha-3 language code for Egyptian (Ancient)"})

(def eka
  "Alpha-3 language code for Ekajuk"
  {:db/ident :lcc-639-2/eka,
   :lcc-lr/denotes :lcc-639-2/Ekajuk,
   :lcc-lr/hasTag "eka",
   :lcc-lr/identifies :lcc-639-2/Ekajuk,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "eka",
   :skos/definition "Alpha-3 language code for Ekajuk"})

(def ell
  "Alpha-3 terminologic language code for Greek, Modern (post 1453)"
  {:db/ident :lcc-639-2/ell,
   :lcc-lr/denotes :lcc-639-1/ModernGreek,
   :lcc-lr/hasTag "ell",
   :lcc-lr/identifies :lcc-639-1/ModernGreek,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/TerminologyCode :lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ell",
   :skos/definition
   "Alpha-3 terminologic language code for Greek, Modern (post 1453)"})

(def elx
  "Alpha-3 language code for Elamite"
  {:db/ident :lcc-639-2/elx,
   :lcc-lr/denotes :lcc-639-2/Elamite,
   :lcc-lr/hasTag "elx",
   :lcc-lr/identifies :lcc-639-2/Elamite,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "elx",
   :skos/definition "Alpha-3 language code for Elamite"})

(def eng
  "Alpha-3 language code for English"
  {:db/ident :lcc-639-2/eng,
   :lcc-lr/denotes :lcc-639-1/English,
   :lcc-lr/hasTag "eng",
   :lcc-lr/identifies :lcc-639-1/English,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "eng",
   :skos/definition "Alpha-3 language code for English"})

(def enm
  "Alpha-3 language code for English, Middle (1100-1500)"
  {:db/ident :lcc-639-2/enm,
   :lcc-lr/denotes :lcc-639-2/MiddleEnglish,
   :lcc-lr/hasTag "enm",
   :lcc-lr/identifies :lcc-639-2/MiddleEnglish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "enm",
   :skos/definition "Alpha-3 language code for English, Middle (1100-1500)"})

(def epo
  "Alpha-3 language code for Esperanto"
  {:db/ident :lcc-639-2/epo,
   :lcc-lr/denotes :lcc-639-1/Esperanto,
   :lcc-lr/hasTag "epo",
   :lcc-lr/identifies :lcc-639-1/Esperanto,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "epo",
   :skos/definition "Alpha-3 language code for Esperanto"})

(def est
  "Alpha-3 language code for Estonian"
  {:db/ident :lcc-639-2/est,
   :lcc-lr/denotes :lcc-639-1/Estonian,
   :lcc-lr/hasTag "est",
   :lcc-lr/identifies :lcc-639-1/Estonian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "est",
   :skos/definition "Alpha-3 language code for Estonian"})

(def eus
  "Alpha-3 terminologic language code for Basque"
  {:db/ident :lcc-639-2/eus,
   :lcc-lr/denotes :lcc-639-1/Basque,
   :lcc-lr/hasTag "eus",
   :lcc-lr/identifies :lcc-639-1/Basque,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:owl/NamedIndividual :lcc-lr/Alpha3Code :lcc-lr/TerminologyCode],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "eus",
   :skos/definition "Alpha-3 terminologic language code for Basque"})

(def ewe_1
  "Alpha-3 language code for Ewe"
  {:db/ident :lcc-639-2/ewe_1,
   :lcc-lr/denotes :lcc-639-1/Ewe,
   :lcc-lr/hasTag "ewe",
   :lcc-lr/identifies :lcc-639-1/Ewe,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ewe",
   :skos/definition "Alpha-3 language code for Ewe"})

(def ewo
  "Alpha-3 language code for Ewondo"
  {:db/ident :lcc-639-2/ewo,
   :lcc-lr/denotes :lcc-639-2/Ewondo,
   :lcc-lr/hasTag "ewo",
   :lcc-lr/identifies :lcc-639-2/Ewondo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ewo",
   :skos/definition "Alpha-3 language code for Ewondo"})

(def fan
  "Alpha-3 language code for Fang"
  {:db/ident :lcc-639-2/fan,
   :lcc-lr/denotes :lcc-639-2/Fang,
   :lcc-lr/hasTag "fan",
   :lcc-lr/identifies :lcc-639-2/Fang,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fan",
   :skos/definition "Alpha-3 language code for Fang"})

(def fao
  "Alpha-3 language code for Faroese"
  {:db/ident :lcc-639-2/fao,
   :lcc-lr/denotes :lcc-639-1/Faroese,
   :lcc-lr/hasTag "fao",
   :lcc-lr/identifies :lcc-639-1/Faroese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fao",
   :skos/definition "Alpha-3 language code for Faroese"})

(def fas
  "Alpha-3 terminologic language code for Persian"
  {:db/ident :lcc-639-2/fas,
   :lcc-lr/denotes :lcc-639-1/Persian,
   :lcc-lr/hasTag "fas",
   :lcc-lr/identifies :lcc-639-1/Persian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :lcc-lr/TerminologyCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fas",
   :skos/definition "Alpha-3 terminologic language code for Persian"})

(def fat
  "Alpha-3 language code for Fanti"
  {:db/ident :lcc-639-2/fat,
   :lcc-lr/denotes :lcc-639-2/Fanti,
   :lcc-lr/hasTag "fat",
   :lcc-lr/identifies :lcc-639-2/Fanti,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fat",
   :skos/definition "Alpha-3 language code for Fanti"})

(def fij
  "Alpha-3 language code for Fijian"
  {:db/ident :lcc-639-2/fij,
   :lcc-lr/denotes :lcc-639-1/Fijian,
   :lcc-lr/hasTag "fij",
   :lcc-lr/identifies :lcc-639-1/Fijian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fij",
   :skos/definition "Alpha-3 language code for Fijian"})

(def fil
  "Alpha-3 language code for Filipino; Pilipino"
  {:db/ident :lcc-639-2/fil,
   :lcc-lr/denotes :lcc-639-2/Filipino,
   :lcc-lr/hasTag "fil",
   :lcc-lr/identifies :lcc-639-2/Filipino,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fil",
   :skos/definition "Alpha-3 language code for Filipino; Pilipino"})

(def fin
  "Alpha-3 language code for Finnish"
  {:db/ident :lcc-639-2/fin,
   :lcc-lr/denotes :lcc-639-1/Finnish,
   :lcc-lr/hasTag "fin",
   :lcc-lr/identifies :lcc-639-1/Finnish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fin",
   :skos/definition "Alpha-3 language code for Finnish"})

(def fiu
  "Alpha-3 language code for Finno-Ugrian languages"
  {:db/ident :lcc-639-2/fiu,
   :lcc-lr/denotes :lcc-639-2/FinnoUgrianLanguages,
   :lcc-lr/hasTag "fiu",
   :lcc-lr/identifies :lcc-639-2/FinnoUgrianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fiu",
   :skos/definition "Alpha-3 language code for Finno-Ugrian languages"})

(def fon_1
  "Alpha-3 language code for Fon"
  {:db/ident :lcc-639-2/fon_1,
   :lcc-lr/denotes :lcc-639-2/Fon,
   :lcc-lr/hasTag "fon",
   :lcc-lr/identifies :lcc-639-2/Fon,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fon",
   :skos/definition "Alpha-3 language code for Fon"})

(def fra
  "Alpha-3 terminologic language code for French"
  {:db/ident :lcc-639-2/fra,
   :lcc-lr/denotes :lcc-639-1/French,
   :lcc-lr/hasTag "fra",
   :lcc-lr/identifies :lcc-639-1/French,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/TerminologyCode :owl/NamedIndividual :lcc-lr/Alpha3Code],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fra",
   :skos/definition "Alpha-3 terminologic language code for French"})

(def fre
  "Alpha-3 bibliographic language code for French"
  {:db/ident :lcc-639-2/fre,
   :lcc-lr/denotes :lcc-639-1/French,
   :lcc-lr/hasTag "fre",
   :lcc-lr/identifies :lcc-639-1/French,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type
   [:lcc-lr/BibliographicCode :lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fre",
   :skos/definition "Alpha-3 bibliographic language code for French"})

(def frm
  "Alpha-3 language code for French, Middle (ca. 1400-1600)"
  {:db/ident :lcc-639-2/frm,
   :lcc-lr/denotes :lcc-639-2/MiddleFrench,
   :lcc-lr/hasTag "frm",
   :lcc-lr/identifies :lcc-639-2/MiddleFrench,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "frm",
   :skos/definition "Alpha-3 language code for French, Middle (ca. 1400-1600)"})

(def fro
  "Alpha-3 language code for French, Old (842-ca.1400)"
  {:db/ident :lcc-639-2/fro,
   :lcc-lr/denotes :lcc-639-2/OldFrench,
   :lcc-lr/hasTag "fro",
   :lcc-lr/identifies :lcc-639-2/OldFrench,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fro",
   :skos/definition "Alpha-3 language code for French, Old (842-ca.1400)"})

(def frr
  "Alpha-3 language code for Northern Frisian"
  {:db/ident :lcc-639-2/frr,
   :lcc-lr/denotes :lcc-639-2/NorthernFrisian,
   :lcc-lr/hasTag "frr",
   :lcc-lr/identifies :lcc-639-2/NorthernFrisian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "frr",
   :skos/definition "Alpha-3 language code for Northern Frisian"})

(def frs
  "Alpha-3 language code for Eastern Frisian"
  {:db/ident :lcc-639-2/frs,
   :lcc-lr/denotes :lcc-639-2/EasternFrisian,
   :lcc-lr/hasTag "frs",
   :lcc-lr/identifies :lcc-639-2/EasternFrisian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "frs",
   :skos/definition "Alpha-3 language code for Eastern Frisian"})

(def fry
  "Alpha-3 language code for Western Frisian"
  {:db/ident :lcc-639-2/fry,
   :lcc-lr/denotes :lcc-639-1/WesternFrisian,
   :lcc-lr/hasTag "fry",
   :lcc-lr/identifies :lcc-639-1/WesternFrisian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fry",
   :skos/definition "Alpha-3 language code for Western Frisian"})

(def ful
  "Alpha-3 language code for Fulah"
  {:db/ident :lcc-639-2/ful,
   :lcc-lr/denotes :lcc-639-1/Fulah,
   :lcc-lr/hasTag "ful",
   :lcc-lr/identifies :lcc-639-1/Fulah,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ful",
   :skos/definition "Alpha-3 language code for Fulah"})

(def fur
  "Alpha-3 language code for Friulian"
  {:db/ident :lcc-639-2/fur,
   :lcc-lr/denotes :lcc-639-2/Friulian,
   :lcc-lr/hasTag "fur",
   :lcc-lr/identifies :lcc-639-2/Friulian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "fur",
   :skos/definition "Alpha-3 language code for Friulian"})

(def gaa
  "Alpha-3 language code for Ga"
  {:db/ident :lcc-639-2/gaa,
   :lcc-lr/denotes :lcc-639-2/Ga,
   :lcc-lr/hasTag "gaa",
   :lcc-lr/identifies :lcc-639-2/Ga,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gaa",
   :skos/definition "Alpha-3 language code for Ga"})

(def gay
  "Alpha-3 language code for Gayo"
  {:db/ident :lcc-639-2/gay,
   :lcc-lr/denotes :lcc-639-2/Gayo,
   :lcc-lr/hasTag "gay",
   :lcc-lr/identifies :lcc-639-2/Gayo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gay",
   :skos/definition "Alpha-3 language code for Gayo"})

(def gba
  "Alpha-3 language code for Gbaya"
  {:db/ident :lcc-639-2/gba,
   :lcc-lr/denotes :lcc-639-2/Gbaya,
   :lcc-lr/hasTag "gba",
   :lcc-lr/identifies :lcc-639-2/Gbaya,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gba",
   :skos/definition "Alpha-3 language code for Gbaya"})

(def gem
  "Alpha-3 language code for Germanic languages"
  {:db/ident :lcc-639-2/gem,
   :lcc-lr/denotes :lcc-639-2/GermanicLanguages,
   :lcc-lr/hasTag "gem",
   :lcc-lr/identifies :lcc-639-2/GermanicLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gem",
   :skos/definition "Alpha-3 language code for Germanic languages"})

(def geo
  "Alpha-3 bibliographic language code for Georgian"
  {:db/ident :lcc-639-2/geo,
   :lcc-lr/denotes :lcc-639-1/Georgian,
   :lcc-lr/hasTag "geo",
   :lcc-lr/identifies :lcc-639-1/Georgian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type
   [:lcc-lr/BibliographicCode :lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "geo",
   :skos/definition "Alpha-3 bibliographic language code for Georgian"})

(def ger
  "Alpha-3 bibliographic language code for German"
  {:db/ident :lcc-639-2/ger,
   :lcc-lr/denotes :lcc-639-1/German,
   :lcc-lr/hasTag "ger",
   :lcc-lr/identifies :lcc-639-1/German,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/BibliographicCode :lcc-lr/Alpha3Code],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ger",
   :skos/definition "Alpha-3 bibliographic language code for German"})

(def gez
  "Alpha-3 language code for Geez"
  {:db/ident :lcc-639-2/gez,
   :lcc-lr/denotes :lcc-639-2/Geez,
   :lcc-lr/hasTag "gez",
   :lcc-lr/identifies :lcc-639-2/Geez,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gez",
   :skos/definition "Alpha-3 language code for Geez"})

(def gil
  "Alpha-3 language code for Gilbertese"
  {:db/ident :lcc-639-2/gil,
   :lcc-lr/denotes :lcc-639-2/Gilbertese,
   :lcc-lr/hasTag "gil",
   :lcc-lr/identifies :lcc-639-2/Gilbertese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gil",
   :skos/definition "Alpha-3 language code for Gilbertese"})

(def gla
  "Alpha-3 language code for Gaelic; Scottish Gaelic"
  {:db/ident :lcc-639-2/gla,
   :lcc-lr/denotes :lcc-639-1/ScottishGaelic,
   :lcc-lr/hasTag "gla",
   :lcc-lr/identifies :lcc-639-1/ScottishGaelic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gla",
   :skos/definition "Alpha-3 language code for Gaelic; Scottish Gaelic"})

(def gle
  "Alpha-3 language code for Irish"
  {:db/ident :lcc-639-2/gle,
   :lcc-lr/denotes :lcc-639-1/Irish,
   :lcc-lr/hasTag "gle",
   :lcc-lr/identifies :lcc-639-1/Irish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gle",
   :skos/definition "Alpha-3 language code for Irish"})

(def glg
  "Alpha-3 language code for Galician"
  {:db/ident :lcc-639-2/glg,
   :lcc-lr/denotes :lcc-639-1/Galician,
   :lcc-lr/hasTag "glg",
   :lcc-lr/identifies :lcc-639-1/Galician,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "glg",
   :skos/definition "Alpha-3 language code for Galician"})

(def glv
  "Alpha-3 language code for Manx"
  {:db/ident :lcc-639-2/glv,
   :lcc-lr/denotes :lcc-639-1/Manx,
   :lcc-lr/hasTag "glv",
   :lcc-lr/identifies :lcc-639-1/Manx,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "glv",
   :skos/definition "Alpha-3 language code for Manx"})

(def gmh
  "Alpha-3 language code for German, Middle High (ca. 1050-1500)"
  {:db/ident :lcc-639-2/gmh,
   :lcc-lr/denotes :lcc-639-2/MiddleHighGerman,
   :lcc-lr/hasTag "gmh",
   :lcc-lr/identifies :lcc-639-2/MiddleHighGerman,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gmh",
   :skos/definition
   "Alpha-3 language code for German, Middle High (ca. 1050-1500)"})

(def goh
  "Alpha-3 language code for German, Old High (ca. 750-1050)"
  {:db/ident :lcc-639-2/goh,
   :lcc-lr/denotes :lcc-639-2/OldHighGerman,
   :lcc-lr/hasTag "goh",
   :lcc-lr/identifies :lcc-639-2/OldHighGerman,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "goh",
   :skos/definition
   "Alpha-3 language code for German, Old High (ca. 750-1050)"})

(def gon
  "Alpha-3 language code for Gondi"
  {:db/ident :lcc-639-2/gon,
   :lcc-lr/denotes :lcc-639-2/Gondi,
   :lcc-lr/hasTag "gon",
   :lcc-lr/identifies :lcc-639-2/Gondi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gon",
   :skos/definition "Alpha-3 language code for Gondi"})

(def gor
  "Alpha-3 language code for Gorontalo"
  {:db/ident :lcc-639-2/gor,
   :lcc-lr/denotes :lcc-639-2/Gorontalo,
   :lcc-lr/hasTag "gor",
   :lcc-lr/identifies :lcc-639-2/Gorontalo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gor",
   :skos/definition "Alpha-3 language code for Gorontalo"})

(def got
  "Alpha-3 language code for Gothic"
  {:db/ident :lcc-639-2/got,
   :lcc-lr/denotes :lcc-639-2/Gothic,
   :lcc-lr/hasTag "got",
   :lcc-lr/identifies :lcc-639-2/Gothic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "got",
   :skos/definition "Alpha-3 language code for Gothic"})

(def grb
  "Alpha-3 language code for Grebo"
  {:db/ident :lcc-639-2/grb,
   :lcc-lr/denotes :lcc-639-2/Grebo,
   :lcc-lr/hasTag "grb",
   :lcc-lr/identifies :lcc-639-2/Grebo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "grb",
   :skos/definition "Alpha-3 language code for Grebo"})

(def grc
  "Alpha-3 language code for Greek, Ancient (to 1453)"
  {:db/ident :lcc-639-2/grc,
   :lcc-lr/denotes :lcc-639-2/AncientGreek,
   :lcc-lr/hasTag "grc",
   :lcc-lr/identifies :lcc-639-2/AncientGreek,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "grc",
   :skos/definition "Alpha-3 language code for Greek, Ancient (to 1453)"})

(def gre
  "Alpha-3 bibliographic language code for Greek, Modern (post 1453)"
  {:db/ident :lcc-639-2/gre,
   :lcc-lr/denotes :lcc-639-1/ModernGreek,
   :lcc-lr/hasTag "gre",
   :lcc-lr/identifies :lcc-639-1/ModernGreek,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type
   [:lcc-lr/BibliographicCode :lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gre",
   :skos/definition
   "Alpha-3 bibliographic language code for Greek, Modern (post 1453)"})

(def grn
  "Alpha-3 language code for Guarani"
  {:db/ident :lcc-639-2/grn,
   :lcc-lr/denotes :lcc-639-1/Guarani,
   :lcc-lr/hasTag "grn",
   :lcc-lr/identifies :lcc-639-1/Guarani,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "grn",
   :skos/definition "Alpha-3 language code for Guarani"})

(def gsw
  "Alpha-3 language code for Alemannic, Swiss German"
  {:db/ident :lcc-639-2/gsw,
   :lcc-lr/denotes :lcc-639-2/SwissGerman,
   :lcc-lr/hasTag "gsw",
   :lcc-lr/identifies :lcc-639-2/SwissGerman,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gsw",
   :skos/definition "Alpha-3 language code for Alemannic, Swiss German"})

(def guj
  "Alpha-3 language code for Gujarati"
  {:db/ident :lcc-639-2/guj,
   :lcc-lr/denotes :lcc-639-1/Gujarati,
   :lcc-lr/hasTag "guj",
   :lcc-lr/identifies :lcc-639-1/Gujarati,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "guj",
   :skos/definition "Alpha-3 language code for Gujarati"})

(def gwi
  "Alpha-3 language code for Gwich'in"
  {:db/ident :lcc-639-2/gwi,
   :lcc-lr/denotes :lcc-639-2/Gwichin,
   :lcc-lr/hasTag "gwi",
   :lcc-lr/identifies :lcc-639-2/Gwichin,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "gwi",
   :skos/definition "Alpha-3 language code for Gwich'in"})

(def hai
  "Alpha-3 language code for Haida"
  {:db/ident :lcc-639-2/hai,
   :lcc-lr/denotes :lcc-639-2/Haida,
   :lcc-lr/hasTag "hai",
   :lcc-lr/identifies :lcc-639-2/Haida,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hai",
   :skos/definition "Alpha-3 language code for Haida"})

(def hat
  "Alpha-3 language code for Haitian; Haitian Creole"
  {:db/ident :lcc-639-2/hat,
   :lcc-lr/denotes :lcc-639-1/Haitian,
   :lcc-lr/hasTag "hat",
   :lcc-lr/identifies :lcc-639-1/Haitian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hat",
   :skos/definition "Alpha-3 language code for Haitian; Haitian Creole"})

(def hau
  "Alpha-3 language code for Hausa"
  {:db/ident :lcc-639-2/hau,
   :lcc-lr/denotes :lcc-639-1/Hausa,
   :lcc-lr/hasTag "hau",
   :lcc-lr/identifies :lcc-639-1/Hausa,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hau",
   :skos/definition "Alpha-3 language code for Hausa"})

(def haw
  "Alpha-3 language code for Hawaiian"
  {:db/ident :lcc-639-2/haw,
   :lcc-lr/denotes :lcc-639-2/Hawaiian,
   :lcc-lr/hasTag "haw",
   :lcc-lr/identifies :lcc-639-2/Hawaiian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "haw",
   :skos/definition "Alpha-3 language code for Hawaiian"})

(def heb
  "Alpha-3 language code for Hebrew"
  {:db/ident :lcc-639-2/heb,
   :lcc-lr/denotes :lcc-639-1/Hebrew,
   :lcc-lr/hasTag "heb",
   :lcc-lr/identifies :lcc-639-1/Hebrew,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "heb",
   :skos/definition "Alpha-3 language code for Hebrew"})

(def her
  "Alpha-3 language code for Herero"
  {:db/ident :lcc-639-2/her,
   :lcc-lr/denotes :lcc-639-1/Herero,
   :lcc-lr/hasTag "her",
   :lcc-lr/identifies :lcc-639-1/Herero,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "her",
   :skos/definition "Alpha-3 language code for Herero"})

(def hil
  "Alpha-3 language code for Hiligaynon"
  {:db/ident :lcc-639-2/hil,
   :lcc-lr/denotes :lcc-639-2/Hiligaynon,
   :lcc-lr/hasTag "hil",
   :lcc-lr/identifies :lcc-639-2/Hiligaynon,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hil",
   :skos/definition "Alpha-3 language code for Hiligaynon"})

(def him
  "Alpha-3 language code for Himachali languages"
  {:db/ident :lcc-639-2/him,
   :lcc-lr/denotes :lcc-639-2/HimachaliLanguages,
   :lcc-lr/hasTag "him",
   :lcc-lr/identifies :lcc-639-2/HimachaliLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "him",
   :skos/definition "Alpha-3 language code for Himachali languages"})

(def hin
  "Alpha-3 language code for Hindi"
  {:db/ident :lcc-639-2/hin,
   :lcc-lr/denotes :lcc-639-1/Hindi,
   :lcc-lr/hasTag "hin",
   :lcc-lr/identifies :lcc-639-1/Hindi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hin",
   :skos/definition "Alpha-3 language code for Hindi"})

(def hit
  "Alpha-3 language code for Hittite"
  {:db/ident :lcc-639-2/hit,
   :lcc-lr/denotes :lcc-639-2/Hittite,
   :lcc-lr/hasTag "hit",
   :lcc-lr/identifies :lcc-639-2/Hittite,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hit",
   :skos/definition "Alpha-3 language code for Hittite"})

(def hmn
  "Alpha-3 language code for Hmong"
  {:db/ident :lcc-639-2/hmn,
   :lcc-lr/denotes :lcc-639-2/Hmong,
   :lcc-lr/hasTag "hmn",
   :lcc-lr/identifies :lcc-639-2/Hmong,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hmn",
   :skos/definition "Alpha-3 language code for Hmong"})

(def hmo
  "Alpha-3 language code for Hiri Motu"
  {:db/ident :lcc-639-2/hmo,
   :lcc-lr/denotes :lcc-639-1/HiriMotu,
   :lcc-lr/hasTag "hmo",
   :lcc-lr/identifies :lcc-639-1/HiriMotu,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hmo",
   :skos/definition "Alpha-3 language code for Hiri Motu"})

(def hrv
  "Alpha-3 terminologic language code for Croatian"
  {:db/ident :lcc-639-2/hrv,
   :lcc-lr/denotes :lcc-639-1/Croatian,
   :lcc-lr/hasTag "hrv",
   :lcc-lr/identifies :lcc-639-1/Croatian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:owl/NamedIndividual :lcc-lr/Alpha3Code :lcc-lr/TerminologyCode],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hrv",
   :skos/definition "Alpha-3 terminologic language code for Croatian"})

(def hsb
  "Alpha-3 language code for Upper Sorbian"
  {:db/ident :lcc-639-2/hsb,
   :lcc-lr/denotes :lcc-639-2/UpperSorbian,
   :lcc-lr/hasTag "hsb",
   :lcc-lr/identifies :lcc-639-2/UpperSorbian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hsb",
   :skos/definition "Alpha-3 language code for Upper Sorbian"})

(def hun
  "Alpha-3 language code for Hungarian"
  {:db/ident :lcc-639-2/hun,
   :lcc-lr/denotes :lcc-639-1/Hungarian,
   :lcc-lr/hasTag "hun",
   :lcc-lr/identifies :lcc-639-1/Hungarian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hun",
   :skos/definition "Alpha-3 language code for Hungarian"})

(def hup
  "Alpha-3 language code for Hupa"
  {:db/ident :lcc-639-2/hup,
   :lcc-lr/denotes :lcc-639-2/Hupa,
   :lcc-lr/hasTag "hup",
   :lcc-lr/identifies :lcc-639-2/Hupa,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hup",
   :skos/definition "Alpha-3 language code for Hupa"})

(def hye
  "Alpha-3 terminologic language code for Armenian"
  {:db/ident :lcc-639-2/hye,
   :lcc-lr/denotes :lcc-639-1/Armenian,
   :lcc-lr/hasTag "hye",
   :lcc-lr/identifies :lcc-639-1/Armenian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/TerminologyCode :owl/NamedIndividual :lcc-lr/Alpha3Code],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "hye",
   :skos/definition "Alpha-3 terminologic language code for Armenian"})

(def iba
  "Alpha-3 language code for Iban"
  {:db/ident :lcc-639-2/iba,
   :lcc-lr/denotes :lcc-639-2/Iban,
   :lcc-lr/hasTag "iba",
   :lcc-lr/identifies :lcc-639-2/Iban,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "iba",
   :skos/definition "Alpha-3 language code for Iban"})

(def ibo
  "Alpha-3 language code for Igbo"
  {:db/ident :lcc-639-2/ibo,
   :lcc-lr/denotes :lcc-639-1/Igbo,
   :lcc-lr/hasTag "ibo",
   :lcc-lr/identifies :lcc-639-1/Igbo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ibo",
   :skos/definition "Alpha-3 language code for Igbo"})

(def ice
  "Alpha-3 bibliographic language code for Icelandic"
  {:db/ident :lcc-639-2/ice,
   :lcc-lr/denotes :lcc-639-1/Icelandic,
   :lcc-lr/hasTag "ice",
   :lcc-lr/identifies :lcc-639-1/Icelandic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type
   [:lcc-lr/BibliographicCode :owl/NamedIndividual :lcc-lr/Alpha3Code],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ice",
   :skos/definition "Alpha-3 bibliographic language code for Icelandic"})

(def ido_1
  "Alpha-3 language code for Ido"
  {:db/ident :lcc-639-2/ido_1,
   :lcc-lr/denotes :lcc-639-1/Ido,
   :lcc-lr/hasTag "ido",
   :lcc-lr/identifies :lcc-639-1/Ido,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ido",
   :skos/definition "Alpha-3 language code for Ido"})

(def iii
  "Alpha-3 language code for Sichuan Yi"
  {:db/ident :lcc-639-2/iii,
   :lcc-lr/denotes :lcc-639-1/SichuanYi,
   :lcc-lr/hasTag "iii",
   :lcc-lr/identifies :lcc-639-1/SichuanYi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "iii",
   :skos/definition "Alpha-3 language code for Sichuan Yi"})

(def ijo
  "Alpha-3 language code for Ijo languages"
  {:db/ident :lcc-639-2/ijo,
   :lcc-lr/denotes :lcc-639-2/IjoLanguages,
   :lcc-lr/hasTag "ijo",
   :lcc-lr/identifies :lcc-639-2/IjoLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ijo",
   :skos/definition "Alpha-3 language code for Ijo languages"})

(def iku
  "Alpha-3 language code for Inuktitut"
  {:db/ident :lcc-639-2/iku,
   :lcc-lr/denotes :lcc-639-1/Inuktitut,
   :lcc-lr/hasTag "iku",
   :lcc-lr/identifies :lcc-639-1/Inuktitut,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "iku",
   :skos/definition "Alpha-3 language code for Inuktitut"})

(def ile
  "Alpha-3 language code for Interlingue"
  {:db/ident :lcc-639-2/ile,
   :lcc-lr/denotes :lcc-639-1/Interlingue,
   :lcc-lr/hasTag "ile",
   :lcc-lr/identifies :lcc-639-1/Interlingue,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ile",
   :skos/definition "Alpha-3 language code for Interlingue"})

(def ilo
  "Alpha-3 language code for Iloko"
  {:db/ident :lcc-639-2/ilo,
   :lcc-lr/denotes :lcc-639-2/Iloko,
   :lcc-lr/hasTag "ilo",
   :lcc-lr/identifies :lcc-639-2/Iloko,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ilo",
   :skos/definition "Alpha-3 language code for Iloko"})

(def ina
  "Alpha-3 language code for Interlingua (International Auxiliary Language Association)"
  {:db/ident :lcc-639-2/ina,
   :lcc-lr/denotes :lcc-639-1/Interlingua,
   :lcc-lr/hasTag "ina",
   :lcc-lr/identifies :lcc-639-1/Interlingua,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ina",
   :skos/definition
   "Alpha-3 language code for Interlingua (International Auxiliary Language Association)"})

(def inc
  "Alpha-3 language code for Indic languages"
  {:db/ident :lcc-639-2/inc,
   :lcc-lr/denotes :lcc-639-2/IndicLanguages,
   :lcc-lr/hasTag "inc",
   :lcc-lr/identifies :lcc-639-2/IndicLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "inc",
   :skos/definition "Alpha-3 language code for Indic languages"})

(def ind
  "Alpha-3 language code for Indonesian"
  {:db/ident :lcc-639-2/ind,
   :lcc-lr/denotes :lcc-639-1/Indonesian,
   :lcc-lr/hasTag "ind",
   :lcc-lr/identifies :lcc-639-1/Indonesian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ind",
   :skos/definition "Alpha-3 language code for Indonesian"})

(def ine
  "Alpha-3 language code for Indo-European languages"
  {:db/ident :lcc-639-2/ine,
   :lcc-lr/denotes :lcc-639-2/IndoEuropeanLanguages,
   :lcc-lr/hasTag "ine",
   :lcc-lr/identifies :lcc-639-2/IndoEuropeanLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ine",
   :skos/definition "Alpha-3 language code for Indo-European languages"})

(def inh
  "Alpha-3 language code for Ingush"
  {:db/ident :lcc-639-2/inh,
   :lcc-lr/denotes :lcc-639-2/Ingush,
   :lcc-lr/hasTag "inh",
   :lcc-lr/identifies :lcc-639-2/Ingush,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "inh",
   :skos/definition "Alpha-3 language code for Ingush"})

(def ipk
  "Alpha-3 language code for Inupiaq"
  {:db/ident :lcc-639-2/ipk,
   :lcc-lr/denotes :lcc-639-1/Inupiaq,
   :lcc-lr/hasTag "ipk",
   :lcc-lr/identifies :lcc-639-1/Inupiaq,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ipk",
   :skos/definition "Alpha-3 language code for Inupiaq"})

(def ira
  "Alpha-3 language code for Iranian languages"
  {:db/ident :lcc-639-2/ira,
   :lcc-lr/denotes :lcc-639-2/IranianLanguages,
   :lcc-lr/hasTag "ira",
   :lcc-lr/identifies :lcc-639-2/IranianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ira",
   :skos/definition "Alpha-3 language code for Iranian languages"})

(def iro
  "Alpha-3 language code for Iroquoian languages"
  {:db/ident :lcc-639-2/iro,
   :lcc-lr/denotes :lcc-639-2/IroquoianLanguages,
   :lcc-lr/hasTag "iro",
   :lcc-lr/identifies :lcc-639-2/IroquoianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "iro",
   :skos/definition "Alpha-3 language code for Iroquoian languages"})

(def isl
  "Alpha-3 terminologic language code for Icelandic"
  {:db/ident :lcc-639-2/isl,
   :lcc-lr/denotes :lcc-639-1/Icelandic,
   :lcc-lr/hasTag "isl",
   :lcc-lr/identifies :lcc-639-1/Icelandic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :lcc-lr/TerminologyCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "isl",
   :skos/definition "Alpha-3 terminologic language code for Icelandic"})

(def ita
  "Alpha-3 language code for Italian"
  {:db/ident :lcc-639-2/ita,
   :lcc-lr/denotes :lcc-639-1/Italian,
   :lcc-lr/hasTag "ita",
   :lcc-lr/identifies :lcc-639-1/Italian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ita",
   :skos/definition "Alpha-3 language code for Italian"})

(def jav
  "Alpha-3 language code for Javanese"
  {:db/ident :lcc-639-2/jav,
   :lcc-lr/denotes :lcc-639-1/Javanese,
   :lcc-lr/hasTag "jav",
   :lcc-lr/identifies :lcc-639-1/Javanese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "jav",
   :skos/definition "Alpha-3 language code for Javanese"})

(def jbo
  "Alpha-3 language code for Lojban"
  {:db/ident :lcc-639-2/jbo,
   :lcc-lr/denotes :lcc-639-2/Lojban,
   :lcc-lr/hasTag "jbo",
   :lcc-lr/identifies :lcc-639-2/Lojban,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "jbo",
   :skos/definition "Alpha-3 language code for Lojban"})

(def jpn
  "Alpha-3 language code for Japanese"
  {:db/ident :lcc-639-2/jpn,
   :lcc-lr/denotes :lcc-639-1/Japanese,
   :lcc-lr/hasTag "jpn",
   :lcc-lr/identifies :lcc-639-1/Japanese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "jpn",
   :skos/definition "Alpha-3 language code for Japanese"})

(def jpr
  "Alpha-3 language code for Judeo-Persian"
  {:db/ident :lcc-639-2/jpr,
   :lcc-lr/denotes :lcc-639-2/JudeoPersian,
   :lcc-lr/hasTag "jpr",
   :lcc-lr/identifies :lcc-639-2/JudeoPersian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "jpr",
   :skos/definition "Alpha-3 language code for Judeo-Persian"})

(def jrb
  "Alpha-3 language code for Judeo-Arabic"
  {:db/ident :lcc-639-2/jrb,
   :lcc-lr/denotes :lcc-639-2/JudeoArabic,
   :lcc-lr/hasTag "jrb",
   :lcc-lr/identifies :lcc-639-2/JudeoArabic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "jrb",
   :skos/definition "Alpha-3 language code for Judeo-Arabic"})

(def kaa
  "Alpha-3 language code for Kara-Kalpak"
  {:db/ident :lcc-639-2/kaa,
   :lcc-lr/denotes :lcc-639-2/KaraKalpak,
   :lcc-lr/hasTag "kaa",
   :lcc-lr/identifies :lcc-639-2/KaraKalpak,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kaa",
   :skos/definition "Alpha-3 language code for Kara-Kalpak"})

(def kab
  "Alpha-3 language code for Kabyle"
  {:db/ident :lcc-639-2/kab,
   :lcc-lr/denotes :lcc-639-2/Kabyle,
   :lcc-lr/hasTag "kab",
   :lcc-lr/identifies :lcc-639-2/Kabyle,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kab",
   :skos/definition "Alpha-3 language code for Kabyle"})

(def kac
  "Alpha-3 language code for Kachin; Jingpho"
  {:db/ident :lcc-639-2/kac,
   :lcc-lr/denotes :lcc-639-2/Kachin,
   :lcc-lr/hasTag "kac",
   :lcc-lr/identifies :lcc-639-2/Kachin,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kac",
   :skos/definition "Alpha-3 language code for Kachin; Jingpho"})

(def kal
  "Alpha-3 language code for Kalaallisut"
  {:db/ident :lcc-639-2/kal,
   :lcc-lr/denotes :lcc-639-1/Kalaallisut,
   :lcc-lr/hasTag "kal",
   :lcc-lr/identifies :lcc-639-1/Kalaallisut,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kal",
   :skos/definition "Alpha-3 language code for Kalaallisut"})

(def kam
  "Alpha-3 language code for Kamba"
  {:db/ident :lcc-639-2/kam,
   :lcc-lr/denotes :lcc-639-2/Kamba,
   :lcc-lr/hasTag "kam",
   :lcc-lr/identifies :lcc-639-2/Kamba,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kam",
   :skos/definition "Alpha-3 language code for Kamba"})

(def kan
  "Alpha-3 language code for Kannada"
  {:db/ident :lcc-639-2/kan,
   :lcc-lr/denotes :lcc-639-1/Kannada,
   :lcc-lr/hasTag "kan",
   :lcc-lr/identifies :lcc-639-1/Kannada,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kan",
   :skos/definition "Alpha-3 language code for Kannada"})

(def kar
  "Alpha-3 language code for Karen languages"
  {:db/ident :lcc-639-2/kar,
   :lcc-lr/denotes :lcc-639-2/KarenLanguages,
   :lcc-lr/hasTag "kar",
   :lcc-lr/identifies :lcc-639-2/KarenLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kar",
   :skos/definition "Alpha-3 language code for Karen languages"})

(def kas
  "Alpha-3 language code for Kashmiri"
  {:db/ident :lcc-639-2/kas,
   :lcc-lr/denotes :lcc-639-1/Kashmiri,
   :lcc-lr/hasTag "kas",
   :lcc-lr/identifies :lcc-639-1/Kashmiri,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kas",
   :skos/definition "Alpha-3 language code for Kashmiri"})

(def kat
  "Alpha-3 terminologic language code for Georgian"
  {:db/ident :lcc-639-2/kat,
   :lcc-lr/denotes :lcc-639-1/Georgian,
   :lcc-lr/hasTag "kat",
   :lcc-lr/identifies :lcc-639-1/Georgian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual :lcc-lr/TerminologyCode],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kat",
   :skos/definition "Alpha-3 terminologic language code for Georgian"})

(def kau
  "Alpha-3 language code for Kanuri"
  {:db/ident :lcc-639-2/kau,
   :lcc-lr/denotes :lcc-639-1/Kanuri,
   :lcc-lr/hasTag "kau",
   :lcc-lr/identifies :lcc-639-1/Kanuri,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kau",
   :skos/definition "Alpha-3 language code for Kanuri"})

(def kaw
  "Alpha-3 language code for Kawi"
  {:db/ident :lcc-639-2/kaw,
   :lcc-lr/denotes :lcc-639-2/Kawi,
   :lcc-lr/hasTag "kaw",
   :lcc-lr/identifies :lcc-639-2/Kawi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kaw",
   :skos/definition "Alpha-3 language code for Kawi"})

(def kaz
  "Alpha-3 language code for Kazakh"
  {:db/ident :lcc-639-2/kaz,
   :lcc-lr/denotes :lcc-639-1/Kazakh,
   :lcc-lr/hasTag "kaz",
   :lcc-lr/identifies :lcc-639-1/Kazakh,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kaz",
   :skos/definition "Alpha-3 language code for Kazakh"})

(def kbd
  "Alpha-3 language code for Kabardian"
  {:db/ident :lcc-639-2/kbd,
   :lcc-lr/denotes :lcc-639-2/Kabardian,
   :lcc-lr/hasTag "kbd",
   :lcc-lr/identifies :lcc-639-2/Kabardian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kbd",
   :skos/definition "Alpha-3 language code for Kabardian"})

(def kha
  "Alpha-3 language code for Khasi"
  {:db/ident :lcc-639-2/kha,
   :lcc-lr/denotes :lcc-639-2/Khasi,
   :lcc-lr/hasTag "kha",
   :lcc-lr/identifies :lcc-639-2/Khasi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kha",
   :skos/definition "Alpha-3 language code for Khasi"})

(def khi
  "Alpha-3 language code for Khoisan languages"
  {:db/ident :lcc-639-2/khi,
   :lcc-lr/denotes :lcc-639-2/KhoisanLanguages,
   :lcc-lr/hasTag "khi",
   :lcc-lr/identifies :lcc-639-2/KhoisanLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "khi",
   :skos/definition "Alpha-3 language code for Khoisan languages"})

(def khm
  "Alpha-3 language code for Central Khmer"
  {:db/ident :lcc-639-2/khm,
   :lcc-lr/denotes :lcc-639-1/CentralKhmer,
   :lcc-lr/hasTag "khm",
   :lcc-lr/identifies :lcc-639-1/CentralKhmer,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "khm",
   :skos/definition "Alpha-3 language code for Central Khmer"})

(def kho
  "Alpha-3 language code for Khotanese"
  {:db/ident :lcc-639-2/kho,
   :lcc-lr/denotes :lcc-639-2/Khotanese,
   :lcc-lr/hasTag "kho",
   :lcc-lr/identifies :lcc-639-2/Khotanese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kho",
   :skos/definition "Alpha-3 language code for Khotanese"})

(def kik
  "Alpha-3 language code for Kikuyu; Gikuyu"
  {:db/ident :lcc-639-2/kik,
   :lcc-lr/denotes :lcc-639-1/Kikuyu,
   :lcc-lr/hasTag "kik",
   :lcc-lr/identifies :lcc-639-1/Kikuyu,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kik",
   :skos/definition "Alpha-3 language code for Kikuyu; Gikuyu"})

(def kin
  "Alpha-3 language code for Kinyarwanda"
  {:db/ident :lcc-639-2/kin,
   :lcc-lr/denotes :lcc-639-1/Kinyarwanda,
   :lcc-lr/hasTag "kin",
   :lcc-lr/identifies :lcc-639-1/Kinyarwanda,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kin",
   :skos/definition "Alpha-3 language code for Kinyarwanda"})

(def kir
  "Alpha-3 language code for Kirghiz; Kyrgyz"
  {:db/ident :lcc-639-2/kir,
   :lcc-lr/denotes :lcc-639-1/Kirghiz,
   :lcc-lr/hasTag "kir",
   :lcc-lr/identifies :lcc-639-1/Kirghiz,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kir",
   :skos/definition "Alpha-3 language code for Kirghiz; Kyrgyz"})

(def kmb
  "Alpha-3 language code for Kimbundu"
  {:db/ident :lcc-639-2/kmb,
   :lcc-lr/denotes :lcc-639-2/Kimbundu,
   :lcc-lr/hasTag "kmb",
   :lcc-lr/identifies :lcc-639-2/Kimbundu,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kmb",
   :skos/definition "Alpha-3 language code for Kimbundu"})

(def kok
  "Alpha-3 language code for Konkani"
  {:db/ident :lcc-639-2/kok,
   :lcc-lr/denotes :lcc-639-2/Konkani,
   :lcc-lr/hasTag "kok",
   :lcc-lr/identifies :lcc-639-2/Konkani,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kok",
   :skos/definition "Alpha-3 language code for Konkani"})

(def kom
  "Alpha-3 language code for Komi"
  {:db/ident :lcc-639-2/kom,
   :lcc-lr/denotes :lcc-639-1/Komi,
   :lcc-lr/hasTag "kom",
   :lcc-lr/identifies :lcc-639-1/Komi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kom",
   :skos/definition "Alpha-3 language code for Komi"})

(def kon
  "Alpha-3 language code for Kongo"
  {:db/ident :lcc-639-2/kon,
   :lcc-lr/denotes :lcc-639-1/Kongo,
   :lcc-lr/hasTag "kon",
   :lcc-lr/identifies :lcc-639-1/Kongo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kon",
   :skos/definition "Alpha-3 language code for Kongo"})

(def kor
  "Alpha-3 language code for Korean"
  {:db/ident :lcc-639-2/kor,
   :lcc-lr/denotes :lcc-639-1/Korean,
   :lcc-lr/hasTag "kor",
   :lcc-lr/identifies :lcc-639-1/Korean,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kor",
   :skos/definition "Alpha-3 language code for Korean"})

(def kos
  "Alpha-3 language code for Kosraean"
  {:db/ident :lcc-639-2/kos,
   :lcc-lr/denotes :lcc-639-2/Kosraean,
   :lcc-lr/hasTag "kos",
   :lcc-lr/identifies :lcc-639-2/Kosraean,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kos",
   :skos/definition "Alpha-3 language code for Kosraean"})

(def kpe
  "Alpha-3 language code for Kpelle"
  {:db/ident :lcc-639-2/kpe,
   :lcc-lr/denotes :lcc-639-2/Kpelle,
   :lcc-lr/hasTag "kpe",
   :lcc-lr/identifies :lcc-639-2/Kpelle,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kpe",
   :skos/definition "Alpha-3 language code for Kpelle"})

(def krc
  "Alpha-3 language code for Karachay-Balkar"
  {:db/ident :lcc-639-2/krc,
   :lcc-lr/denotes :lcc-639-2/KarachayBalkar,
   :lcc-lr/hasTag "krc",
   :lcc-lr/identifies :lcc-639-2/KarachayBalkar,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "krc",
   :skos/definition "Alpha-3 language code for Karachay-Balkar"})

(def krl
  "Alpha-3 language code for Karelian"
  {:db/ident :lcc-639-2/krl,
   :lcc-lr/denotes :lcc-639-2/Karelian,
   :lcc-lr/hasTag "krl",
   :lcc-lr/identifies :lcc-639-2/Karelian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "krl",
   :skos/definition "Alpha-3 language code for Karelian"})

(def kro
  "Alpha-3 language code for Kru languages"
  {:db/ident :lcc-639-2/kro,
   :lcc-lr/denotes :lcc-639-2/KruLanguages,
   :lcc-lr/hasTag "kro",
   :lcc-lr/identifies :lcc-639-2/KruLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kro",
   :skos/definition "Alpha-3 language code for Kru languages"})

(def kru
  "Alpha-3 language code for Kurukh"
  {:db/ident :lcc-639-2/kru,
   :lcc-lr/denotes :lcc-639-2/Kurukh,
   :lcc-lr/hasTag "kru",
   :lcc-lr/identifies :lcc-639-2/Kurukh,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kru",
   :skos/definition "Alpha-3 language code for Kurukh"})

(def kua
  "Alpha-3 language code for Kuanyama; Kwanyama"
  {:db/ident :lcc-639-2/kua,
   :lcc-lr/denotes :lcc-639-1/Kuanyama,
   :lcc-lr/hasTag "kua",
   :lcc-lr/identifies :lcc-639-1/Kuanyama,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kua",
   :skos/definition "Alpha-3 language code for Kuanyama; Kwanyama"})

(def kum
  "Alpha-3 language code for Kumyk"
  {:db/ident :lcc-639-2/kum,
   :lcc-lr/denotes :lcc-639-2/Kumyk,
   :lcc-lr/hasTag "kum",
   :lcc-lr/identifies :lcc-639-2/Kumyk,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kum",
   :skos/definition "Alpha-3 language code for Kumyk"})

(def kur
  "Alpha-3 language code for Kurdish"
  {:db/ident :lcc-639-2/kur,
   :lcc-lr/denotes :lcc-639-1/Kurdish,
   :lcc-lr/hasTag "kur",
   :lcc-lr/identifies :lcc-639-1/Kurdish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kur",
   :skos/definition "Alpha-3 language code for Kurdish"})

(def kut
  "Alpha-3 language code for Kutenai"
  {:db/ident :lcc-639-2/kut,
   :lcc-lr/denotes :lcc-639-2/Kutenai,
   :lcc-lr/hasTag "kut",
   :lcc-lr/identifies :lcc-639-2/Kutenai,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "kut",
   :skos/definition "Alpha-3 language code for Kutenai"})

(def lad
  "Alpha-3 language code for Ladino"
  {:db/ident :lcc-639-2/lad,
   :lcc-lr/denotes :lcc-639-2/Ladino,
   :lcc-lr/hasTag "lad",
   :lcc-lr/identifies :lcc-639-2/Ladino,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lad",
   :skos/definition "Alpha-3 language code for Ladino"})

(def lah
  "Alpha-3 language code for Lahnda"
  {:db/ident :lcc-639-2/lah,
   :lcc-lr/denotes :lcc-639-2/Lahnda,
   :lcc-lr/hasTag "lah",
   :lcc-lr/identifies :lcc-639-2/Lahnda,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lah",
   :skos/definition "Alpha-3 language code for Lahnda"})

(def lam
  "Alpha-3 language code for Lamba"
  {:db/ident :lcc-639-2/lam,
   :lcc-lr/denotes :lcc-639-2/Lamba,
   :lcc-lr/hasTag "lam",
   :lcc-lr/identifies :lcc-639-2/Lamba,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lam",
   :skos/definition "Alpha-3 language code for Lamba"})

(def lao_1
  "Alpha-3 language code for Lao"
  {:db/ident :lcc-639-2/lao_1,
   :lcc-lr/denotes :lcc-639-1/Lao,
   :lcc-lr/hasTag "lao",
   :lcc-lr/identifies :lcc-639-1/Lao,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lao",
   :skos/definition "Alpha-3 language code for Lao"})

(def lat
  "Alpha-3 language code for Latin"
  {:db/ident :lcc-639-2/lat,
   :lcc-lr/denotes :lcc-639-1/Latin,
   :lcc-lr/hasTag "lat",
   :lcc-lr/identifies :lcc-639-1/Latin,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lat",
   :skos/definition "Alpha-3 language code for Latin"})

(def lav
  "Alpha-3 language code for Latvian"
  {:db/ident :lcc-639-2/lav,
   :lcc-lr/denotes :lcc-639-1/Latvian,
   :lcc-lr/hasTag "lav",
   :lcc-lr/identifies :lcc-639-1/Latvian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lav",
   :skos/definition "Alpha-3 language code for Latvian"})

(def lez
  "Alpha-3 language code for Lezghian"
  {:db/ident :lcc-639-2/lez,
   :lcc-lr/denotes :lcc-639-2/Lezghian,
   :lcc-lr/hasTag "lez",
   :lcc-lr/identifies :lcc-639-2/Lezghian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lez",
   :skos/definition "Alpha-3 language code for Lezghian"})

(def lim
  "Alpha-3 language code for Limburgan; Limburger; Limburgish"
  {:db/ident :lcc-639-2/lim,
   :lcc-lr/denotes :lcc-639-1/Limburgan,
   :lcc-lr/hasTag "lim",
   :lcc-lr/identifies :lcc-639-1/Limburgan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lim",
   :skos/definition
   "Alpha-3 language code for Limburgan; Limburger; Limburgish"})

(def lin
  "Alpha-3 language code for Lingala"
  {:db/ident :lcc-639-2/lin,
   :lcc-lr/denotes :lcc-639-1/Lingala,
   :lcc-lr/hasTag "lin",
   :lcc-lr/identifies :lcc-639-1/Lingala,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lin",
   :skos/definition "Alpha-3 language code for Lingala"})

(def lit
  "Alpha-3 language code for Lithuanian"
  {:db/ident :lcc-639-2/lit,
   :lcc-lr/denotes :lcc-639-1/Lithuanian,
   :lcc-lr/hasTag "lit",
   :lcc-lr/identifies :lcc-639-1/Lithuanian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lit",
   :skos/definition "Alpha-3 language code for Lithuanian"})

(def lol
  "Alpha-3 language code for Mongo"
  {:db/ident :lcc-639-2/lol,
   :lcc-lr/denotes :lcc-639-2/Mongo,
   :lcc-lr/hasTag "lol",
   :lcc-lr/identifies :lcc-639-2/Mongo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lol",
   :skos/definition "Alpha-3 language code for Mongo"})

(def loz
  "Alpha-3 language code for Lozi"
  {:db/ident :lcc-639-2/loz,
   :lcc-lr/denotes :lcc-639-2/Lozi,
   :lcc-lr/hasTag "loz",
   :lcc-lr/identifies :lcc-639-2/Lozi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "loz",
   :skos/definition "Alpha-3 language code for Lozi"})

(def ltz
  "Alpha-3 language code for Luxembourgish; Letzeburgesch"
  {:db/ident :lcc-639-2/ltz,
   :lcc-lr/denotes :lcc-639-1/Luxembourgish,
   :lcc-lr/hasTag "ltz",
   :lcc-lr/identifies :lcc-639-1/Luxembourgish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ltz",
   :skos/definition "Alpha-3 language code for Luxembourgish; Letzeburgesch"})

(def lua
  "Alpha-3 language code for Luba-Lulua"
  {:db/ident :lcc-639-2/lua,
   :lcc-lr/denotes :lcc-639-2/LubaLulua,
   :lcc-lr/hasTag "lua",
   :lcc-lr/identifies :lcc-639-2/LubaLulua,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lua",
   :skos/definition "Alpha-3 language code for Luba-Lulua"})

(def lub
  "Alpha-3 language code for Luba-Katanga"
  {:db/ident :lcc-639-2/lub,
   :lcc-lr/denotes :lcc-639-1/LubaKatanga,
   :lcc-lr/hasTag "lub",
   :lcc-lr/identifies :lcc-639-1/LubaKatanga,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lub",
   :skos/definition "Alpha-3 language code for Luba-Katanga"})

(def lug
  "Alpha-3 language code for Ganda"
  {:db/ident :lcc-639-2/lug,
   :lcc-lr/denotes :lcc-639-1/Ganda,
   :lcc-lr/hasTag "lug",
   :lcc-lr/identifies :lcc-639-1/Ganda,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lug",
   :skos/definition "Alpha-3 language code for Ganda"})

(def lui
  "Alpha-3 language code for Luiseno"
  {:db/ident :lcc-639-2/lui,
   :lcc-lr/denotes :lcc-639-2/Luiseno,
   :lcc-lr/hasTag "lui",
   :lcc-lr/identifies :lcc-639-2/Luiseno,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lui",
   :skos/definition "Alpha-3 language code for Luiseno"})

(def lun
  "Alpha-3 language code for Lunda"
  {:db/ident :lcc-639-2/lun,
   :lcc-lr/denotes :lcc-639-2/Lunda,
   :lcc-lr/hasTag "lun",
   :lcc-lr/identifies :lcc-639-2/Lunda,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lun",
   :skos/definition "Alpha-3 language code for Lunda"})

(def luo
  "Alpha-3 language code for Luo (Kenya and Tanzania)"
  {:db/ident :lcc-639-2/luo,
   :lcc-lr/denotes :lcc-639-2/LuoKenyaAndTanzania,
   :lcc-lr/hasTag "luo",
   :lcc-lr/identifies :lcc-639-2/LuoKenyaAndTanzania,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "luo",
   :skos/definition "Alpha-3 language code for Luo (Kenya and Tanzania)"})

(def lus
  "Alpha-3 language code for Lushai"
  {:db/ident :lcc-639-2/lus,
   :lcc-lr/denotes :lcc-639-2/Lushai,
   :lcc-lr/hasTag "lus",
   :lcc-lr/identifies :lcc-639-2/Lushai,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "lus",
   :skos/definition "Alpha-3 language code for Lushai"})

(def mac
  "Alpha-3 bibliographic language code for Macedonian"
  {:db/ident :lcc-639-2/mac,
   :lcc-lr/denotes :lcc-639-1/Macedonian,
   :lcc-lr/hasTag "mac",
   :lcc-lr/identifies :lcc-639-1/Macedonian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type
   [:lcc-lr/BibliographicCode :owl/NamedIndividual :lcc-lr/Alpha3Code],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mac",
   :skos/definition "Alpha-3 bibliographic language code for Macedonian"})

(def mad
  "Alpha-3 language code for Madurese"
  {:db/ident :lcc-639-2/mad,
   :lcc-lr/denotes :lcc-639-2/Madurese,
   :lcc-lr/hasTag "mad",
   :lcc-lr/identifies :lcc-639-2/Madurese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mad",
   :skos/definition "Alpha-3 language code for Madurese"})

(def mag
  "Alpha-3 language code for Magahi"
  {:db/ident :lcc-639-2/mag,
   :lcc-lr/denotes :lcc-639-2/Magahi,
   :lcc-lr/hasTag "mag",
   :lcc-lr/identifies :lcc-639-2/Magahi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mag",
   :skos/definition "Alpha-3 language code for Magahi"})

(def mah
  "Alpha-3 language code for Marshallese"
  {:db/ident :lcc-639-2/mah,
   :lcc-lr/denotes :lcc-639-1/Marshallese,
   :lcc-lr/hasTag "mah",
   :lcc-lr/identifies :lcc-639-1/Marshallese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mah",
   :skos/definition "Alpha-3 language code for Marshallese"})

(def mai
  "Alpha-3 language code for Maithili"
  {:db/ident :lcc-639-2/mai,
   :lcc-lr/denotes :lcc-639-2/Maithili,
   :lcc-lr/hasTag "mai",
   :lcc-lr/identifies :lcc-639-2/Maithili,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mai",
   :skos/definition "Alpha-3 language code for Maithili"})

(def mak
  "Alpha-3 language code for Makasar"
  {:db/ident :lcc-639-2/mak,
   :lcc-lr/denotes :lcc-639-2/Makasar,
   :lcc-lr/hasTag "mak",
   :lcc-lr/identifies :lcc-639-2/Makasar,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mak",
   :skos/definition "Alpha-3 language code for Makasar"})

(def mal
  "Alpha-3 language code for Malayalam"
  {:db/ident :lcc-639-2/mal,
   :lcc-lr/denotes :lcc-639-1/Malayalam,
   :lcc-lr/hasTag "mal",
   :lcc-lr/identifies :lcc-639-1/Malayalam,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mal",
   :skos/definition "Alpha-3 language code for Malayalam"})

(def man
  "Alpha-3 language code for Mandingo"
  {:db/ident :lcc-639-2/man,
   :lcc-lr/denotes :lcc-639-2/Mandingo,
   :lcc-lr/hasTag "man",
   :lcc-lr/identifies :lcc-639-2/Mandingo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "man",
   :skos/definition "Alpha-3 language code for Mandingo"})

(def mao
  "Alpha-3 bibliographic language code for Maori"
  {:db/ident :lcc-639-2/mao,
   :lcc-lr/denotes :lcc-639-1/Maori,
   :lcc-lr/hasTag "mao",
   :lcc-lr/identifies :lcc-639-1/Maori,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/Alpha3Code :lcc-lr/BibliographicCode],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mao",
   :skos/definition "Alpha-3 bibliographic language code for Maori"})

(def map
  "Alpha-3 language code for Austronesian languages"
  {:db/ident :lcc-639-2/map,
   :lcc-lr/denotes :lcc-639-2/AustronesianLanguages,
   :lcc-lr/hasTag "map",
   :lcc-lr/identifies :lcc-639-2/AustronesianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "map",
   :skos/definition "Alpha-3 language code for Austronesian languages"})

(def mar
  "Alpha-3 language code for Marathi"
  {:db/ident :lcc-639-2/mar,
   :lcc-lr/denotes :lcc-639-1/Marathi,
   :lcc-lr/hasTag "mar",
   :lcc-lr/identifies :lcc-639-1/Marathi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mar",
   :skos/definition "Alpha-3 language code for Marathi"})

(def mas
  "Alpha-3 language code for Masai"
  {:db/ident :lcc-639-2/mas,
   :lcc-lr/denotes :lcc-639-2/Masai,
   :lcc-lr/hasTag "mas",
   :lcc-lr/identifies :lcc-639-2/Masai,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mas",
   :skos/definition "Alpha-3 language code for Masai"})

(def may
  "Alpha-3 bibliographic language code for Malay"
  {:db/ident :lcc-639-2/may,
   :lcc-lr/denotes :lcc-639-1/Malay,
   :lcc-lr/hasTag "may",
   :lcc-lr/identifies :lcc-639-1/Malay,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/Alpha3Code :lcc-lr/BibliographicCode],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "may",
   :skos/definition "Alpha-3 bibliographic language code for Malay"})

(def mdf
  "Alpha-3 language code for Moksha"
  {:db/ident :lcc-639-2/mdf,
   :lcc-lr/denotes :lcc-639-2/Moksha,
   :lcc-lr/hasTag "mdf",
   :lcc-lr/identifies :lcc-639-2/Moksha,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mdf",
   :skos/definition "Alpha-3 language code for Moksha"})

(def mdr
  "Alpha-3 language code for Mandar"
  {:db/ident :lcc-639-2/mdr,
   :lcc-lr/denotes :lcc-639-2/Mandar,
   :lcc-lr/hasTag "mdr",
   :lcc-lr/identifies :lcc-639-2/Mandar,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mdr",
   :skos/definition "Alpha-3 language code for Mandar"})

(def men
  "Alpha-3 language code for Mende"
  {:db/ident :lcc-639-2/men,
   :lcc-lr/denotes :lcc-639-2/Mende,
   :lcc-lr/hasTag "men",
   :lcc-lr/identifies :lcc-639-2/Mende,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "men",
   :skos/definition "Alpha-3 language code for Mende"})

(def mga
  "Alpha-3 language code for Irish, Middle (900-1200)"
  {:db/ident :lcc-639-2/mga,
   :lcc-lr/denotes :lcc-639-2/MiddleIrish,
   :lcc-lr/hasTag "mga",
   :lcc-lr/identifies :lcc-639-2/MiddleIrish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mga",
   :skos/definition "Alpha-3 language code for Irish, Middle (900-1200)"})

(def mic
  "Alpha-3 language code for Mi'kmaq; Micmac"
  {:db/ident :lcc-639-2/mic,
   :lcc-lr/denotes :lcc-639-2/Mikmaq,
   :lcc-lr/hasTag "mic",
   :lcc-lr/identifies :lcc-639-2/Mikmaq,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mic",
   :skos/definition "Alpha-3 language code for Mi'kmaq; Micmac"})

(def min
  "Alpha-3 language code for Minangkabau"
  {:db/ident :lcc-639-2/min,
   :lcc-lr/denotes :lcc-639-2/Minangkabau,
   :lcc-lr/hasTag "min",
   :lcc-lr/identifies :lcc-639-2/Minangkabau,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "min",
   :skos/definition "Alpha-3 language code for Minangkabau"})

(def mis
  "Alpha-3 language code for Uncoded languages"
  {:db/ident :lcc-639-2/mis,
   :lcc-lr/denotes :lcc-639-2/UncodedLanguages,
   :lcc-lr/hasTag "mis",
   :lcc-lr/identifies :lcc-639-2/UncodedLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mis",
   :skos/definition "Alpha-3 language code for Uncoded languages"})

(def mkd
  "Alpha-3 terminologic language code for Macedonian"
  {:db/ident :lcc-639-2/mkd,
   :lcc-lr/denotes :lcc-639-1/Macedonian,
   :lcc-lr/hasTag "mkd",
   :lcc-lr/identifies :lcc-639-1/Macedonian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/TerminologyCode :owl/NamedIndividual :lcc-lr/Alpha3Code],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mkd",
   :skos/definition "Alpha-3 terminologic language code for Macedonian"})

(def mkh
  "Alpha-3 language code for Mon-Khmer languages"
  {:db/ident :lcc-639-2/mkh,
   :lcc-lr/denotes :lcc-639-2/MonKhmerLanguages,
   :lcc-lr/hasTag "mkh",
   :lcc-lr/identifies :lcc-639-2/MonKhmerLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mkh",
   :skos/definition "Alpha-3 language code for Mon-Khmer languages"})

(def mlg
  "Alpha-3 language code for Malagasy"
  {:db/ident :lcc-639-2/mlg,
   :lcc-lr/denotes :lcc-639-1/Malagasy,
   :lcc-lr/hasTag "mlg",
   :lcc-lr/identifies :lcc-639-1/Malagasy,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mlg",
   :skos/definition "Alpha-3 language code for Malagasy"})

(def mlt
  "Alpha-3 language code for Maltese"
  {:db/ident :lcc-639-2/mlt,
   :lcc-lr/denotes :lcc-639-1/Maltese,
   :lcc-lr/hasTag "mlt",
   :lcc-lr/identifies :lcc-639-1/Maltese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mlt",
   :skos/definition "Alpha-3 language code for Maltese"})

(def mnc
  "Alpha-3 language code for Manchu"
  {:db/ident :lcc-639-2/mnc,
   :lcc-lr/denotes :lcc-639-2/Manchu,
   :lcc-lr/hasTag "mnc",
   :lcc-lr/identifies :lcc-639-2/Manchu,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mnc",
   :skos/definition "Alpha-3 language code for Manchu"})

(def mni
  "Alpha-3 language code for Manipuri"
  {:db/ident :lcc-639-2/mni,
   :lcc-lr/denotes :lcc-639-2/Manipuri,
   :lcc-lr/hasTag "mni",
   :lcc-lr/identifies :lcc-639-2/Manipuri,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mni",
   :skos/definition "Alpha-3 language code for Manipuri"})

(def mno
  "Alpha-3 language code for Manobo languages"
  {:db/ident :lcc-639-2/mno,
   :lcc-lr/denotes :lcc-639-2/ManoboLanguages,
   :lcc-lr/hasTag "mno",
   :lcc-lr/identifies :lcc-639-2/ManoboLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mno",
   :skos/definition "Alpha-3 language code for Manobo languages"})

(def moh
  "Alpha-3 language code for Mohawk"
  {:db/ident :lcc-639-2/moh,
   :lcc-lr/denotes :lcc-639-2/Mohawk,
   :lcc-lr/hasTag "moh",
   :lcc-lr/identifies :lcc-639-2/Mohawk,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "moh",
   :skos/definition "Alpha-3 language code for Mohawk"})

(def mon
  "Alpha-3 language code for Mongolian"
  {:db/ident :lcc-639-2/mon,
   :lcc-lr/denotes :lcc-639-1/Mongolian,
   :lcc-lr/hasTag "mon",
   :lcc-lr/identifies :lcc-639-1/Mongolian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mon",
   :skos/definition "Alpha-3 language code for Mongolian"})

(def mos
  "Alpha-3 language code for Mossi"
  {:db/ident :lcc-639-2/mos,
   :lcc-lr/denotes :lcc-639-2/Mossi,
   :lcc-lr/hasTag "mos",
   :lcc-lr/identifies :lcc-639-2/Mossi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mos",
   :skos/definition "Alpha-3 language code for Mossi"})

(def mri
  "Alpha-3 terminologic language code for Maori"
  {:db/ident :lcc-639-2/mri,
   :lcc-lr/denotes :lcc-639-1/Maori,
   :lcc-lr/hasTag "mri",
   :lcc-lr/identifies :lcc-639-1/Maori,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual :lcc-lr/TerminologyCode],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mri",
   :skos/definition "Alpha-3 terminologic language code for Maori"})

(def msa
  "Alpha-3 terminologic language code for Malay"
  {:db/ident :lcc-639-2/msa,
   :lcc-lr/denotes :lcc-639-1/Malay,
   :lcc-lr/hasTag "msa",
   :lcc-lr/identifies :lcc-639-1/Malay,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:owl/NamedIndividual :lcc-lr/Alpha3Code :lcc-lr/TerminologyCode],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "msa",
   :skos/definition "Alpha-3 terminologic language code for Malay"})

(def mul
  "Alpha-3 language code for Multiple languages"
  {:db/ident :lcc-639-2/mul,
   :lcc-lr/denotes :lcc-639-2/MultipleLanguages,
   :lcc-lr/hasTag "mul",
   :lcc-lr/identifies :lcc-639-2/MultipleLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mul",
   :skos/definition "Alpha-3 language code for Multiple languages"})

(def mun
  "Alpha-3 language code for Munda languages"
  {:db/ident :lcc-639-2/mun,
   :lcc-lr/denotes :lcc-639-2/MundaLanguages,
   :lcc-lr/hasTag "mun",
   :lcc-lr/identifies :lcc-639-2/MundaLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mun",
   :skos/definition "Alpha-3 language code for Munda languages"})

(def mus
  "Alpha-3 language code for Creek"
  {:db/ident :lcc-639-2/mus,
   :lcc-lr/denotes :lcc-639-2/Creek,
   :lcc-lr/hasTag "mus",
   :lcc-lr/identifies :lcc-639-2/Creek,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mus",
   :skos/definition "Alpha-3 language code for Creek"})

(def mwl
  "Alpha-3 language code for Mirandese"
  {:db/ident :lcc-639-2/mwl,
   :lcc-lr/denotes :lcc-639-2/Mirandese,
   :lcc-lr/hasTag "mwl",
   :lcc-lr/identifies :lcc-639-2/Mirandese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mwl",
   :skos/definition "Alpha-3 language code for Mirandese"})

(def mwr
  "Alpha-3 language code for Marwari"
  {:db/ident :lcc-639-2/mwr,
   :lcc-lr/denotes :lcc-639-2/Marwari,
   :lcc-lr/hasTag "mwr",
   :lcc-lr/identifies :lcc-639-2/Marwari,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mwr",
   :skos/definition "Alpha-3 language code for Marwari"})

(def mya
  "Alpha-3 terminologic language code for Burmese"
  {:db/ident :lcc-639-2/mya,
   :lcc-lr/denotes :lcc-639-1/Burmese,
   :lcc-lr/hasTag "mya",
   :lcc-lr/identifies :lcc-639-1/Burmese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:owl/NamedIndividual :lcc-lr/TerminologyCode :lcc-lr/Alpha3Code],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "mya",
   :skos/definition "Alpha-3 terminologic language code for Burmese"})

(def myn
  "Alpha-3 language code for Mayan languages"
  {:db/ident :lcc-639-2/myn,
   :lcc-lr/denotes :lcc-639-2/MayanLanguages,
   :lcc-lr/hasTag "myn",
   :lcc-lr/identifies :lcc-639-2/MayanLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "myn",
   :skos/definition "Alpha-3 language code for Mayan languages"})

(def myv
  "Alpha-3 language code for Erzya"
  {:db/ident :lcc-639-2/myv,
   :lcc-lr/denotes :lcc-639-2/Erzya,
   :lcc-lr/hasTag "myv",
   :lcc-lr/identifies :lcc-639-2/Erzya,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "myv",
   :skos/definition "Alpha-3 language code for Erzya"})

(def nah
  "Alpha-3 language code for Nahuatl languages"
  {:db/ident :lcc-639-2/nah,
   :lcc-lr/denotes :lcc-639-2/NahuatlLanguages,
   :lcc-lr/hasTag "nah",
   :lcc-lr/identifies :lcc-639-2/NahuatlLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nah",
   :skos/definition "Alpha-3 language code for Nahuatl languages"})

(def nai
  "Alpha-3 language code for North American Indian (Other)"
  {:db/ident :lcc-639-2/nai,
   :lcc-lr/denotes :lcc-639-2/NorthAmericanIndianLanguages,
   :lcc-lr/hasTag "nai",
   :lcc-lr/identifies :lcc-639-2/NorthAmericanIndianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nai",
   :skos/definition "Alpha-3 language code for North American Indian (Other)"})

(def nap
  "Alpha-3 language code for Neapolitan"
  {:db/ident :lcc-639-2/nap,
   :lcc-lr/denotes :lcc-639-2/Neapolitan,
   :lcc-lr/hasTag "nap",
   :lcc-lr/identifies :lcc-639-2/Neapolitan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nap",
   :skos/definition "Alpha-3 language code for Neapolitan"})

(def nau
  "Alpha-3 language code for Nauru"
  {:db/ident :lcc-639-2/nau,
   :lcc-lr/denotes :lcc-639-1/Nauru,
   :lcc-lr/hasTag "nau",
   :lcc-lr/identifies :lcc-639-1/Nauru,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nau",
   :skos/definition "Alpha-3 language code for Nauru"})

(def nav
  "Alpha-3 language code for Navajo; Navaho"
  {:db/ident :lcc-639-2/nav,
   :lcc-lr/denotes :lcc-639-1/Navajo,
   :lcc-lr/hasTag "nav",
   :lcc-lr/identifies :lcc-639-1/Navajo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nav",
   :skos/definition "Alpha-3 language code for Navajo; Navaho"})

(def nbl
  "Alpha-3 language code for South Ndebele; Ndebele, South"
  {:db/ident :lcc-639-2/nbl,
   :lcc-lr/denotes :lcc-639-1/SouthNdebele,
   :lcc-lr/hasTag "nbl",
   :lcc-lr/identifies :lcc-639-1/SouthNdebele,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nbl",
   :skos/definition "Alpha-3 language code for South Ndebele; Ndebele, South"})

(def nde
  "Alpha-3 language code for North Ndebele; Ndebele, North"
  {:db/ident :lcc-639-2/nde,
   :lcc-lr/denotes :lcc-639-1/NorthNdebele,
   :lcc-lr/hasTag "nde",
   :lcc-lr/identifies :lcc-639-1/NorthNdebele,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nde",
   :skos/definition "Alpha-3 language code for North Ndebele; Ndebele, North"})

(def ndo
  "Alpha-3 language code for Ndonga"
  {:db/ident :lcc-639-2/ndo,
   :lcc-lr/denotes :lcc-639-1/Ndonga,
   :lcc-lr/hasTag "ndo",
   :lcc-lr/identifies :lcc-639-1/Ndonga,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ndo",
   :skos/definition "Alpha-3 language code for Ndonga"})

(def nds
  "Alpha-3 language code for Low German; Low Saxon; German, Low; Saxon, Low"
  {:db/ident :lcc-639-2/nds,
   :lcc-lr/denotes :lcc-639-2/LowGerman,
   :lcc-lr/hasTag "nds",
   :lcc-lr/identifies :lcc-639-2/LowGerman,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nds",
   :skos/definition
   "Alpha-3 language code for Low German; Low Saxon; German, Low; Saxon, Low"})

(def nep
  "Alpha-3 language code for Nepali"
  {:db/ident :lcc-639-2/nep,
   :lcc-lr/denotes :lcc-639-1/Nepali,
   :lcc-lr/hasTag "nep",
   :lcc-lr/identifies :lcc-639-1/Nepali,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nep",
   :skos/definition "Alpha-3 language code for Nepali"})

(def new
  "Alpha-3 language code for Nepal Bhasa; Newari"
  {:db/ident :lcc-639-2/new,
   :lcc-lr/denotes :lcc-639-2/Newari,
   :lcc-lr/hasTag "new",
   :lcc-lr/identifies :lcc-639-2/Newari,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "new",
   :skos/definition "Alpha-3 language code for Nepal Bhasa; Newari"})

(def nia
  "Alpha-3 language code for Nias"
  {:db/ident :lcc-639-2/nia,
   :lcc-lr/denotes :lcc-639-2/Nias,
   :lcc-lr/hasTag "nia",
   :lcc-lr/identifies :lcc-639-2/Nias,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nia",
   :skos/definition "Alpha-3 language code for Nias"})

(def nic
  "Alpha-3 language code for Niger-Kordofanian languages"
  {:db/ident :lcc-639-2/nic,
   :lcc-lr/denotes :lcc-639-2/NigerKordofanianLanguages,
   :lcc-lr/hasTag "nic",
   :lcc-lr/identifies :lcc-639-2/NigerKordofanianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nic",
   :skos/definition "Alpha-3 language code for Niger-Kordofanian languages"})

(def niu
  "Alpha-3 language code for Niuean"
  {:db/ident :lcc-639-2/niu,
   :lcc-lr/denotes :lcc-639-2/Niuean,
   :lcc-lr/hasTag "niu",
   :lcc-lr/identifies :lcc-639-2/Niuean,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "niu",
   :skos/definition "Alpha-3 language code for Niuean"})

(def nld
  "Alpha-3 terminologic language code for Dutch; Flemish"
  {:db/ident :lcc-639-2/nld,
   :lcc-lr/denotes :lcc-639-1/Dutch,
   :lcc-lr/hasTag "nld",
   :lcc-lr/identifies :lcc-639-1/Dutch,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:owl/NamedIndividual :lcc-lr/TerminologyCode :lcc-lr/Alpha3Code],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nld",
   :skos/definition "Alpha-3 terminologic language code for Dutch; Flemish"})

(def nno
  "Alpha-3 language code for Norwegian Nynorsk"
  {:db/ident :lcc-639-2/nno,
   :lcc-lr/denotes :lcc-639-1/NorwegianNynorsk,
   :lcc-lr/hasTag "nno",
   :lcc-lr/identifies :lcc-639-1/NorwegianNynorsk,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nno",
   :skos/definition "Alpha-3 language code for Norwegian Nynorsk"})

(def nob
  "Alpha-3 language code for Norwegian Bokmal"
  {:db/ident :lcc-639-2/nob,
   :lcc-lr/denotes :lcc-639-1/NorwegianBokmal,
   :lcc-lr/hasTag "nob",
   :lcc-lr/identifies :lcc-639-1/NorwegianBokmal,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nob",
   :skos/definition "Alpha-3 language code for Norwegian Bokmal"})

(def nog
  "Alpha-3 language code for Nogai"
  {:db/ident :lcc-639-2/nog,
   :lcc-lr/denotes :lcc-639-2/Nogai,
   :lcc-lr/hasTag "nog",
   :lcc-lr/identifies :lcc-639-2/Nogai,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nog",
   :skos/definition "Alpha-3 language code for Nogai"})

(def non
  "Alpha-3 language code for Norse, Old"
  {:db/ident :lcc-639-2/non,
   :lcc-lr/denotes :lcc-639-2/OldNorse,
   :lcc-lr/hasTag "non",
   :lcc-lr/identifies :lcc-639-2/OldNorse,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "non",
   :skos/definition "Alpha-3 language code for Norse, Old"})

(def nor
  "Alpha-3 language code for Norwegian"
  {:db/ident :lcc-639-2/nor,
   :lcc-lr/denotes :lcc-639-1/Norwegian,
   :lcc-lr/hasTag "nor",
   :lcc-lr/identifies :lcc-639-1/Norwegian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nor",
   :skos/definition "Alpha-3 language code for Norwegian"})

(def nqo
  "Alpha-3 language code for N'Ko"
  {:db/ident :lcc-639-2/nqo,
   :lcc-lr/denotes :lcc-639-2/NKo,
   :lcc-lr/hasTag "nqo",
   :lcc-lr/identifies :lcc-639-2/NKo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nqo",
   :skos/definition "Alpha-3 language code for N'Ko"})

(def nso
  "Alpha-3 language code for Northern Sotho; Pedi; Sepedi"
  {:db/ident :lcc-639-2/nso,
   :lcc-lr/denotes :lcc-639-2/Pedi,
   :lcc-lr/hasTag "nso",
   :lcc-lr/identifies :lcc-639-2/Pedi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nso",
   :skos/definition "Alpha-3 language code for Northern Sotho; Pedi; Sepedi"})

(def nub
  "Alpha-3 language code for Nubian languages"
  {:db/ident :lcc-639-2/nub,
   :lcc-lr/denotes :lcc-639-2/NubianLanguages,
   :lcc-lr/hasTag "nub",
   :lcc-lr/identifies :lcc-639-2/NubianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nub",
   :skos/definition "Alpha-3 language code for Nubian languages"})

(def nwc
  "Alpha-3 language code for Classical Newari; Classical Nepal Bhasa; Old Newari"
  {:db/ident :lcc-639-2/nwc,
   :lcc-lr/denotes :lcc-639-2/ClassicalNewari,
   :lcc-lr/hasTag "nwc",
   :lcc-lr/identifies :lcc-639-2/ClassicalNewari,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nwc",
   :skos/definition
   "Alpha-3 language code for Classical Newari; Classical Nepal Bhasa; Old Newari"})

(def nya
  "Alpha-3 language code for Nyanja; Chichewa; Chewa"
  {:db/ident :lcc-639-2/nya,
   :lcc-lr/denotes :lcc-639-1/Nyanja,
   :lcc-lr/hasTag "nya",
   :lcc-lr/identifies :lcc-639-1/Nyanja,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nya",
   :skos/definition "Alpha-3 language code for Nyanja; Chichewa; Chewa"})

(def nym
  "Alpha-3 language code for Nyamwezi"
  {:db/ident :lcc-639-2/nym,
   :lcc-lr/denotes :lcc-639-2/Nyamwezi,
   :lcc-lr/hasTag "nym",
   :lcc-lr/identifies :lcc-639-2/Nyamwezi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nym",
   :skos/definition "Alpha-3 language code for Nyamwezi"})

(def nyn
  "Alpha-3 language code for Nyankole"
  {:db/ident :lcc-639-2/nyn,
   :lcc-lr/denotes :lcc-639-2/Nyankole,
   :lcc-lr/hasTag "nyn",
   :lcc-lr/identifies :lcc-639-2/Nyankole,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nyn",
   :skos/definition "Alpha-3 language code for Nyankole"})

(def nyo
  "Alpha-3 language code for Nyoro"
  {:db/ident :lcc-639-2/nyo,
   :lcc-lr/denotes :lcc-639-2/Nyoro,
   :lcc-lr/hasTag "nyo",
   :lcc-lr/identifies :lcc-639-2/Nyoro,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nyo",
   :skos/definition "Alpha-3 language code for Nyoro"})

(def nzi
  "Alpha-3 language code for Nzima"
  {:db/ident :lcc-639-2/nzi,
   :lcc-lr/denotes :lcc-639-2/Nzima,
   :lcc-lr/hasTag "nzi",
   :lcc-lr/identifies :lcc-639-2/Nzima,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "nzi",
   :skos/definition "Alpha-3 language code for Nzima"})

(def oci
  "Alpha-3 language code for Occitan (post 1500)"
  {:db/ident :lcc-639-2/oci,
   :lcc-lr/denotes :lcc-639-1/Occitan,
   :lcc-lr/hasTag "oci",
   :lcc-lr/identifies :lcc-639-1/Occitan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "oci",
   :skos/definition "Alpha-3 language code for Occitan (post 1500)"})

(def oji
  "Alpha-3 language code for Ojibwa"
  {:db/ident :lcc-639-2/oji,
   :lcc-lr/denotes :lcc-639-1/Ojibwa,
   :lcc-lr/hasTag "oji",
   :lcc-lr/identifies :lcc-639-1/Ojibwa,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "oji",
   :skos/definition "Alpha-3 language code for Ojibwa"})

(def ori
  "Alpha-3 language code for Oriya"
  {:db/ident :lcc-639-2/ori,
   :lcc-lr/denotes :lcc-639-1/Oriya,
   :lcc-lr/hasTag "ori",
   :lcc-lr/identifies :lcc-639-1/Oriya,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ori",
   :skos/definition "Alpha-3 language code for Oriya"})

(def orm
  "Alpha-3 language code for Oromo"
  {:db/ident :lcc-639-2/orm,
   :lcc-lr/denotes :lcc-639-1/Oromo,
   :lcc-lr/hasTag "orm",
   :lcc-lr/identifies :lcc-639-1/Oromo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "orm",
   :skos/definition "Alpha-3 language code for Oromo"})

(def osa
  "Alpha-3 language code for Osage"
  {:db/ident :lcc-639-2/osa,
   :lcc-lr/denotes :lcc-639-2/Osage,
   :lcc-lr/hasTag "osa",
   :lcc-lr/identifies :lcc-639-2/Osage,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "osa",
   :skos/definition "Alpha-3 language code for Osage"})

(def oss
  "Alpha-3 language code for Ossetian; Ossetic"
  {:db/ident :lcc-639-2/oss,
   :lcc-lr/denotes :lcc-639-1/Ossetian,
   :lcc-lr/hasTag "oss",
   :lcc-lr/identifies :lcc-639-1/Ossetian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "oss",
   :skos/definition "Alpha-3 language code for Ossetian; Ossetic"})

(def ota
  "Alpha-3 language code for Turkish, Ottoman (1500-1928)"
  {:db/ident :lcc-639-2/ota,
   :lcc-lr/denotes :lcc-639-2/OttomanTurkish,
   :lcc-lr/hasTag "ota",
   :lcc-lr/identifies :lcc-639-2/OttomanTurkish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ota",
   :skos/definition "Alpha-3 language code for Turkish, Ottoman (1500-1928)"})

(def oto
  "Alpha-3 language code for Otomian languages"
  {:db/ident :lcc-639-2/oto,
   :lcc-lr/denotes :lcc-639-2/OtomianLanguages,
   :lcc-lr/hasTag "oto",
   :lcc-lr/identifies :lcc-639-2/OtomianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "oto",
   :skos/definition "Alpha-3 language code for Otomian languages"})

(def paa
  "Alpha-3 language code for Papuan languages"
  {:db/ident :lcc-639-2/paa,
   :lcc-lr/denotes :lcc-639-2/PapuanLanguages,
   :lcc-lr/hasTag "paa",
   :lcc-lr/identifies :lcc-639-2/PapuanLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "paa",
   :skos/definition "Alpha-3 language code for Papuan languages"})

(def pag
  "Alpha-3 language code for Pangasinan"
  {:db/ident :lcc-639-2/pag,
   :lcc-lr/denotes :lcc-639-2/Pangasinan,
   :lcc-lr/hasTag "pag",
   :lcc-lr/identifies :lcc-639-2/Pangasinan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "pag",
   :skos/definition "Alpha-3 language code for Pangasinan"})

(def pal
  "Alpha-3 language code for Pahlavi"
  {:db/ident :lcc-639-2/pal,
   :lcc-lr/denotes :lcc-639-2/Pahlavi,
   :lcc-lr/hasTag "pal",
   :lcc-lr/identifies :lcc-639-2/Pahlavi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "pal",
   :skos/definition "Alpha-3 language code for Pahlavi"})

(def pam
  "Alpha-3 language code for Pampanga"
  {:db/ident :lcc-639-2/pam,
   :lcc-lr/denotes :lcc-639-2/Pampanga,
   :lcc-lr/hasTag "pam",
   :lcc-lr/identifies :lcc-639-2/Pampanga,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "pam",
   :skos/definition "Alpha-3 language code for Pampanga"})

(def pan
  "Alpha-3 language code for Panjabi; Punjabi"
  {:db/ident :lcc-639-2/pan,
   :lcc-lr/denotes :lcc-639-1/Panjabi,
   :lcc-lr/hasTag "pan",
   :lcc-lr/identifies :lcc-639-1/Panjabi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "pan",
   :skos/definition "Alpha-3 language code for Panjabi; Punjabi"})

(def pap
  "Alpha-3 language code for Papiamento"
  {:db/ident :lcc-639-2/pap,
   :lcc-lr/denotes :lcc-639-2/Papiamento,
   :lcc-lr/hasTag "pap",
   :lcc-lr/identifies :lcc-639-2/Papiamento,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "pap",
   :skos/definition "Alpha-3 language code for Papiamento"})

(def pau
  "Alpha-3 language code for Palauan"
  {:db/ident :lcc-639-2/pau,
   :lcc-lr/denotes :lcc-639-2/Palauan,
   :lcc-lr/hasTag "pau",
   :lcc-lr/identifies :lcc-639-2/Palauan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "pau",
   :skos/definition "Alpha-3 language code for Palauan"})

(def peo
  "Alpha-3 language code for Persian, Old (ca. 600-400 B.C.)"
  {:db/ident :lcc-639-2/peo,
   :lcc-lr/denotes :lcc-639-2/OldPersian,
   :lcc-lr/hasTag "peo",
   :lcc-lr/identifies :lcc-639-2/OldPersian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "peo",
   :skos/definition
   "Alpha-3 language code for Persian, Old (ca. 600-400 B.C.)"})

(def per
  "Alpha-3 bibliographic language code for Persian"
  {:db/ident :lcc-639-2/per,
   :lcc-lr/denotes :lcc-639-1/Persian,
   :lcc-lr/hasTag "per",
   :lcc-lr/identifies :lcc-639-1/Persian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/BibliographicCode :lcc-lr/Alpha3Code],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "per",
   :skos/definition "Alpha-3 bibliographic language code for Persian"})

(def phi
  "Alpha-3 language code for Philippine languages"
  {:db/ident :lcc-639-2/phi,
   :lcc-lr/denotes :lcc-639-2/PhilippineLanguages,
   :lcc-lr/hasTag "phi",
   :lcc-lr/identifies :lcc-639-2/PhilippineLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "phi",
   :skos/definition "Alpha-3 language code for Philippine languages"})

(def phn
  "Alpha-3 language code for Phoenician"
  {:db/ident :lcc-639-2/phn,
   :lcc-lr/denotes :lcc-639-2/Phoenician,
   :lcc-lr/hasTag "phn",
   :lcc-lr/identifies :lcc-639-2/Phoenician,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "phn",
   :skos/definition "Alpha-3 language code for Phoenician"})

(def pli
  "Alpha-3 language code for Pali"
  {:db/ident :lcc-639-2/pli,
   :lcc-lr/denotes :lcc-639-1/Pali,
   :lcc-lr/hasTag "pli",
   :lcc-lr/identifies :lcc-639-1/Pali,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "pli",
   :skos/definition "Alpha-3 language code for Pali"})

(def pol
  "Alpha-3 language code for Polish"
  {:db/ident :lcc-639-2/pol,
   :lcc-lr/denotes :lcc-639-1/Polish,
   :lcc-lr/hasTag "pol",
   :lcc-lr/identifies :lcc-639-1/Polish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "pol",
   :skos/definition "Alpha-3 language code for Polish"})

(def pon
  "Alpha-3 language code for Pohnpeian"
  {:db/ident :lcc-639-2/pon,
   :lcc-lr/denotes :lcc-639-2/Pohnpeian,
   :lcc-lr/hasTag "pon",
   :lcc-lr/identifies :lcc-639-2/Pohnpeian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "pon",
   :skos/definition "Alpha-3 language code for Pohnpeian"})

(def por
  "Alpha-3 language code for Portuguese"
  {:db/ident :lcc-639-2/por,
   :lcc-lr/denotes :lcc-639-1/Portuguese,
   :lcc-lr/hasTag "por",
   :lcc-lr/identifies :lcc-639-1/Portuguese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "por",
   :skos/definition "Alpha-3 language code for Portuguese"})

(def pra
  "Alpha-3 language code for Prakrit languages"
  {:db/ident :lcc-639-2/pra,
   :lcc-lr/denotes :lcc-639-2/PrakritLanguages,
   :lcc-lr/hasTag "pra",
   :lcc-lr/identifies :lcc-639-2/PrakritLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "pra",
   :skos/definition "Alpha-3 language code for Prakrit languages"})

(def pro
  "Alpha-3 language code for Provencal, Old (to 1500)"
  {:db/ident :lcc-639-2/pro,
   :lcc-lr/denotes :lcc-639-2/OldProvencal,
   :lcc-lr/hasTag "pro",
   :lcc-lr/identifies :lcc-639-2/OldProvencal,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "pro",
   :skos/definition "Alpha-3 language code for Provencal, Old (to 1500)"})

(def pus
  "Alpha-3 language code for Pushto"
  {:db/ident :lcc-639-2/pus,
   :lcc-lr/denotes :lcc-639-1/Pushto,
   :lcc-lr/hasTag "pus",
   :lcc-lr/identifies :lcc-639-1/Pushto,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "pus",
   :skos/definition "Alpha-3 language code for Pushto"})

(def que
  "Alpha-3 language code for Quechua"
  {:db/ident :lcc-639-2/que,
   :lcc-lr/denotes :lcc-639-1/Quechua,
   :lcc-lr/hasTag "que",
   :lcc-lr/identifies :lcc-639-1/Quechua,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "que",
   :skos/definition "Alpha-3 language code for Quechua"})

(def raj
  "Alpha-3 language code for Rajasthani"
  {:db/ident :lcc-639-2/raj,
   :lcc-lr/denotes :lcc-639-2/Rajasthani,
   :lcc-lr/hasTag "raj",
   :lcc-lr/identifies :lcc-639-2/Rajasthani,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "raj",
   :skos/definition "Alpha-3 language code for Rajasthani"})

(def rap
  "Alpha-3 language code for Rapanui"
  {:db/ident :lcc-639-2/rap,
   :lcc-lr/denotes :lcc-639-2/Rapanui,
   :lcc-lr/hasTag "rap",
   :lcc-lr/identifies :lcc-639-2/Rapanui,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "rap",
   :skos/definition "Alpha-3 language code for Rapanui"})

(def rar
  "Alpha-3 language code for Rarotongan; Cook Islands Maori"
  {:db/ident :lcc-639-2/rar,
   :lcc-lr/denotes :lcc-639-2/Rarotongan,
   :lcc-lr/hasTag "rar",
   :lcc-lr/identifies :lcc-639-2/Rarotongan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "rar",
   :skos/definition "Alpha-3 language code for Rarotongan; Cook Islands Maori"})

(def roa
  "Alpha-3 language code for Romance languages"
  {:db/ident :lcc-639-2/roa,
   :lcc-lr/denotes :lcc-639-2/RomanceLanguages,
   :lcc-lr/hasTag "roa",
   :lcc-lr/identifies :lcc-639-2/RomanceLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "roa",
   :skos/definition "Alpha-3 language code for Romance languages"})

(def roh
  "Alpha-3 language code for Romansh"
  {:db/ident :lcc-639-2/roh,
   :lcc-lr/denotes :lcc-639-1/Romansh,
   :lcc-lr/hasTag "roh",
   :lcc-lr/identifies :lcc-639-1/Romansh,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "roh",
   :skos/definition "Alpha-3 language code for Romansh"})

(def rom
  "Alpha-3 language code for Romany"
  {:db/ident :lcc-639-2/rom,
   :lcc-lr/denotes :lcc-639-2/Romany,
   :lcc-lr/hasTag "rom",
   :lcc-lr/identifies :lcc-639-2/Romany,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "rom",
   :skos/definition "Alpha-3 language code for Romany"})

(def ron
  "Alpha-3 terminologic language code for Romanian"
  {:db/ident :lcc-639-2/ron,
   :lcc-lr/denotes :lcc-639-1/Romanian,
   :lcc-lr/hasTag "ron",
   :lcc-lr/identifies :lcc-639-1/Romanian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :lcc-lr/TerminologyCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ron",
   :skos/definition "Alpha-3 terminologic language code for Romanian"})

(def rum
  "Alpha-3 bibliographic language code for Romanian"
  {:db/ident :lcc-639-2/rum,
   :lcc-lr/denotes :lcc-639-1/Romanian,
   :lcc-lr/hasTag "rum",
   :lcc-lr/identifies :lcc-639-1/Romanian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type
   [:lcc-lr/BibliographicCode :owl/NamedIndividual :lcc-lr/Alpha3Code],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "rum",
   :skos/definition "Alpha-3 bibliographic language code for Romanian"})

(def run
  "Alpha-3 language code for Rundi"
  {:db/ident :lcc-639-2/run,
   :lcc-lr/denotes :lcc-639-1/Rundi,
   :lcc-lr/hasTag "run",
   :lcc-lr/identifies :lcc-639-1/Rundi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "run",
   :skos/definition "Alpha-3 language code for Rundi"})

(def rup
  "Alpha-3 language code for Aromanian; Arumanian; Macedo-Romanian"
  {:db/ident :lcc-639-2/rup,
   :lcc-lr/denotes :lcc-639-2/MacedoRomanian,
   :lcc-lr/hasTag "rup",
   :lcc-lr/identifies :lcc-639-2/MacedoRomanian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "rup",
   :skos/definition
   "Alpha-3 language code for Aromanian; Arumanian; Macedo-Romanian"})

(def rus
  "Alpha-3 language code for Russian"
  {:db/ident :lcc-639-2/rus,
   :lcc-lr/denotes :lcc-639-1/Russian,
   :lcc-lr/hasTag "rus",
   :lcc-lr/identifies :lcc-639-1/Russian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "rus",
   :skos/definition "Alpha-3 language code for Russian"})

(def sad
  "Alpha-3 language code for Sandawe"
  {:db/ident :lcc-639-2/sad,
   :lcc-lr/denotes :lcc-639-2/Sandawe,
   :lcc-lr/hasTag "sad",
   :lcc-lr/identifies :lcc-639-2/Sandawe,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sad",
   :skos/definition "Alpha-3 language code for Sandawe"})

(def sag
  "Alpha-3 language code for Sango"
  {:db/ident :lcc-639-2/sag,
   :lcc-lr/denotes :lcc-639-1/Sango,
   :lcc-lr/hasTag "sag",
   :lcc-lr/identifies :lcc-639-1/Sango,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sag",
   :skos/definition "Alpha-3 language code for Sango"})

(def sah
  "Alpha-3 language code for Yakut"
  {:db/ident :lcc-639-2/sah,
   :lcc-lr/denotes :lcc-639-2/Yakut,
   :lcc-lr/hasTag "sah",
   :lcc-lr/identifies :lcc-639-2/Yakut,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sah",
   :skos/definition "Alpha-3 language code for Yakut"})

(def sai
  "Alpha-3 language code for South American Indian"
  {:db/ident :lcc-639-2/sai,
   :lcc-lr/denotes :lcc-639-2/SouthAmericanIndianLanguages,
   :lcc-lr/hasTag "sai",
   :lcc-lr/identifies :lcc-639-2/SouthAmericanIndianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sai",
   :skos/definition "Alpha-3 language code for South American Indian"})

(def sal
  "Alpha-3 language code for Salishan languages"
  {:db/ident :lcc-639-2/sal,
   :lcc-lr/denotes :lcc-639-2/SalishanLanguages,
   :lcc-lr/hasTag "sal",
   :lcc-lr/identifies :lcc-639-2/SalishanLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sal",
   :skos/definition "Alpha-3 language code for Salishan languages"})

(def sam
  "Alpha-3 language code for Samaritan Aramaic"
  {:db/ident :lcc-639-2/sam,
   :lcc-lr/denotes :lcc-639-2/SamaritanAramaic,
   :lcc-lr/hasTag "sam",
   :lcc-lr/identifies :lcc-639-2/SamaritanAramaic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sam",
   :skos/definition "Alpha-3 language code for Samaritan Aramaic"})

(def san
  "Alpha-3 language code for Sanskrit"
  {:db/ident :lcc-639-2/san,
   :lcc-lr/denotes :lcc-639-1/Sanskrit,
   :lcc-lr/hasTag "san",
   :lcc-lr/identifies :lcc-639-1/Sanskrit,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "san",
   :skos/definition "Alpha-3 language code for Sanskrit"})

(def sas
  "Alpha-3 language code for Sasak"
  {:db/ident :lcc-639-2/sas,
   :lcc-lr/denotes :lcc-639-2/Sasak,
   :lcc-lr/hasTag "sas",
   :lcc-lr/identifies :lcc-639-2/Sasak,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sas",
   :skos/definition "Alpha-3 language code for Sasak"})

(def sat
  "Alpha-3 language code for Santali"
  {:db/ident :lcc-639-2/sat,
   :lcc-lr/denotes :lcc-639-2/Santali,
   :lcc-lr/hasTag "sat",
   :lcc-lr/identifies :lcc-639-2/Santali,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sat",
   :skos/definition "Alpha-3 language code for Santali"})

(def scn
  "Alpha-3 language code for Sicilian"
  {:db/ident :lcc-639-2/scn,
   :lcc-lr/denotes :lcc-639-2/Sicilian,
   :lcc-lr/hasTag "scn",
   :lcc-lr/identifies :lcc-639-2/Sicilian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "scn",
   :skos/definition "Alpha-3 language code for Sicilian"})

(def sco
  "Alpha-3 language code for Scots"
  {:db/ident :lcc-639-2/sco,
   :lcc-lr/denotes :lcc-639-2/Scots,
   :lcc-lr/hasTag "sco",
   :lcc-lr/identifies :lcc-639-2/Scots,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sco",
   :skos/definition "Alpha-3 language code for Scots"})

(def sel
  "Alpha-3 language code for Selkup"
  {:db/ident :lcc-639-2/sel,
   :lcc-lr/denotes :lcc-639-2/Selkup,
   :lcc-lr/hasTag "sel",
   :lcc-lr/identifies :lcc-639-2/Selkup,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sel",
   :skos/definition "Alpha-3 language code for Selkup"})

(def sem
  "Alpha-3 language code for Semitic languages"
  {:db/ident :lcc-639-2/sem,
   :lcc-lr/denotes :lcc-639-2/SemiticLanguages,
   :lcc-lr/hasTag "sem",
   :lcc-lr/identifies :lcc-639-2/SemiticLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sem",
   :skos/definition "Alpha-3 language code for Semitic languages"})

(def sga
  "Alpha-3 language code for Irish, Old (to 900)"
  {:db/ident :lcc-639-2/sga,
   :lcc-lr/denotes :lcc-639-2/OldIrish,
   :lcc-lr/hasTag "sga",
   :lcc-lr/identifies :lcc-639-2/OldIrish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sga",
   :skos/definition "Alpha-3 language code for Irish, Old (to 900)"})

(def sgn
  "Alpha-3 language code for Sign languages"
  {:db/ident :lcc-639-2/sgn,
   :lcc-lr/denotes :lcc-639-2/SignLanguages,
   :lcc-lr/hasTag "sgn",
   :lcc-lr/identifies :lcc-639-2/SignLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sgn",
   :skos/definition "Alpha-3 language code for Sign languages"})

(def shn
  "Alpha-3 language code for Shan"
  {:db/ident :lcc-639-2/shn,
   :lcc-lr/denotes :lcc-639-2/Shan,
   :lcc-lr/hasTag "shn",
   :lcc-lr/identifies :lcc-639-2/Shan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "shn",
   :skos/definition "Alpha-3 language code for Shan"})

(def sid
  "Alpha-3 language code for Sidamo"
  {:db/ident :lcc-639-2/sid,
   :lcc-lr/denotes :lcc-639-2/Sidamo,
   :lcc-lr/hasTag "sid",
   :lcc-lr/identifies :lcc-639-2/Sidamo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sid",
   :skos/definition "Alpha-3 language code for Sidamo"})

(def sin
  "Alpha-3 language code for Sinhalese; Sinhala"
  {:db/ident :lcc-639-2/sin,
   :lcc-lr/denotes :lcc-639-1/Sinhala,
   :lcc-lr/hasTag "sin",
   :lcc-lr/identifies :lcc-639-1/Sinhala,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sin",
   :skos/definition "Alpha-3 language code for Sinhalese; Sinhala"})

(def sio
  "Alpha-3 language code for Siouan languages"
  {:db/ident :lcc-639-2/sio,
   :lcc-lr/denotes :lcc-639-2/SiouanLanguages,
   :lcc-lr/hasTag "sio",
   :lcc-lr/identifies :lcc-639-2/SiouanLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sio",
   :skos/definition "Alpha-3 language code for Siouan languages"})

(def sit
  "Alpha-3 language code for Sino-Tibetan languages"
  {:db/ident :lcc-639-2/sit,
   :lcc-lr/denotes :lcc-639-2/SinoTibetanLanguages,
   :lcc-lr/hasTag "sit",
   :lcc-lr/identifies :lcc-639-2/SinoTibetanLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sit",
   :skos/definition "Alpha-3 language code for Sino-Tibetan languages"})

(def sla
  "Alpha-3 language code for Slavic languages"
  {:db/ident :lcc-639-2/sla,
   :lcc-lr/denotes :lcc-639-2/SlavicLanguages,
   :lcc-lr/hasTag "sla",
   :lcc-lr/identifies :lcc-639-2/SlavicLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sla",
   :skos/definition "Alpha-3 language code for Slavic languages"})

(def slk
  "Alpha-3 terminologic language code for Slovak"
  {:db/ident :lcc-639-2/slk,
   :lcc-lr/denotes :lcc-639-1/Slovak,
   :lcc-lr/hasTag "slk",
   :lcc-lr/identifies :lcc-639-1/Slovak,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:owl/NamedIndividual :lcc-lr/TerminologyCode :lcc-lr/Alpha3Code],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "slk",
   :skos/definition "Alpha-3 terminologic language code for Slovak"})

(def slo
  "Alpha-3 bibliographic language code for Slovak"
  {:db/ident :lcc-639-2/slo,
   :lcc-lr/denotes :lcc-639-1/Slovak,
   :lcc-lr/hasTag "slo",
   :lcc-lr/identifies :lcc-639-1/Slovak,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type
   [:lcc-lr/BibliographicCode :owl/NamedIndividual :lcc-lr/Alpha3Code],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "slo",
   :skos/definition "Alpha-3 bibliographic language code for Slovak"})

(def slv
  "Alpha-3 language code for Slovenian"
  {:db/ident :lcc-639-2/slv,
   :lcc-lr/denotes :lcc-639-1/Slovenian,
   :lcc-lr/hasTag "slv",
   :lcc-lr/identifies :lcc-639-1/Slovenian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "slv",
   :skos/definition "Alpha-3 language code for Slovenian"})

(def sma
  "Alpha-3 language code for Southern Sami"
  {:db/ident :lcc-639-2/sma,
   :lcc-lr/denotes :lcc-639-2/SouthernSami,
   :lcc-lr/hasTag "sma",
   :lcc-lr/identifies :lcc-639-2/SouthernSami,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sma",
   :skos/definition "Alpha-3 language code for Southern Sami"})

(def sme
  "Alpha-3 language code for Northern Sami"
  {:db/ident :lcc-639-2/sme,
   :lcc-lr/denotes :lcc-639-1/NorthernSami,
   :lcc-lr/hasTag "sme",
   :lcc-lr/identifies :lcc-639-1/NorthernSami,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sme",
   :skos/definition "Alpha-3 language code for Northern Sami"})

(def smi
  "Alpha-3 language code for Sami languages"
  {:db/ident :lcc-639-2/smi,
   :lcc-lr/denotes :lcc-639-2/SamiLanguages,
   :lcc-lr/hasTag "smi",
   :lcc-lr/identifies :lcc-639-2/SamiLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "smi",
   :skos/definition "Alpha-3 language code for Sami languages"})

(def smj
  "Alpha-3 language code for Lule Sami"
  {:db/ident :lcc-639-2/smj,
   :lcc-lr/denotes :lcc-639-2/LuleSami,
   :lcc-lr/hasTag "smj",
   :lcc-lr/identifies :lcc-639-2/LuleSami,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "smj",
   :skos/definition "Alpha-3 language code for Lule Sami"})

(def smn
  "Alpha-3 language code for Inari Sami"
  {:db/ident :lcc-639-2/smn,
   :lcc-lr/denotes :lcc-639-2/InariSami,
   :lcc-lr/hasTag "smn",
   :lcc-lr/identifies :lcc-639-2/InariSami,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "smn",
   :skos/definition "Alpha-3 language code for Inari Sami"})

(def smo
  "Alpha-3 language code for Samoan"
  {:db/ident :lcc-639-2/smo,
   :lcc-lr/denotes :lcc-639-1/Samoan,
   :lcc-lr/hasTag "smo",
   :lcc-lr/identifies :lcc-639-1/Samoan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "smo",
   :skos/definition "Alpha-3 language code for Samoan"})

(def sms
  "Alpha-3 language code for Skolt Sami"
  {:db/ident :lcc-639-2/sms,
   :lcc-lr/denotes :lcc-639-2/SkoltSami,
   :lcc-lr/hasTag "sms",
   :lcc-lr/identifies :lcc-639-2/SkoltSami,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sms",
   :skos/definition "Alpha-3 language code for Skolt Sami"})

(def sna
  "Alpha-3 language code for Shona"
  {:db/ident :lcc-639-2/sna,
   :lcc-lr/denotes :lcc-639-1/Shona,
   :lcc-lr/hasTag "sna",
   :lcc-lr/identifies :lcc-639-1/Shona,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sna",
   :skos/definition "Alpha-3 language code for Shona"})

(def snd
  "Alpha-3 language code for Sindhi"
  {:db/ident :lcc-639-2/snd,
   :lcc-lr/denotes :lcc-639-1/Sindhi,
   :lcc-lr/hasTag "snd",
   :lcc-lr/identifies :lcc-639-1/Sindhi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "snd",
   :skos/definition "Alpha-3 language code for Sindhi"})

(def snk
  "Alpha-3 language code for Soninke"
  {:db/ident :lcc-639-2/snk,
   :lcc-lr/denotes :lcc-639-2/Soninke,
   :lcc-lr/hasTag "snk",
   :lcc-lr/identifies :lcc-639-2/Soninke,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "snk",
   :skos/definition "Alpha-3 language code for Soninke"})

(def sog
  "Alpha-3 language code for Sogdian"
  {:db/ident :lcc-639-2/sog,
   :lcc-lr/denotes :lcc-639-2/Sogdian,
   :lcc-lr/hasTag "sog",
   :lcc-lr/identifies :lcc-639-2/Sogdian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sog",
   :skos/definition "Alpha-3 language code for Sogdian"})

(def som
  "Alpha-3 language code for Somali"
  {:db/ident :lcc-639-2/som,
   :lcc-lr/denotes :lcc-639-1/Somali,
   :lcc-lr/hasTag "som",
   :lcc-lr/identifies :lcc-639-1/Somali,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "som",
   :skos/definition "Alpha-3 language code for Somali"})

(def son
  "Alpha-3 language code for Songhai languages"
  {:db/ident :lcc-639-2/son,
   :lcc-lr/denotes :lcc-639-2/SonghaiLanguages,
   :lcc-lr/hasTag "son",
   :lcc-lr/identifies :lcc-639-2/SonghaiLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "son",
   :skos/definition "Alpha-3 language code for Songhai languages"})

(def sot
  "Alpha-3 language code for Southern Sotho"
  {:db/ident :lcc-639-2/sot,
   :lcc-lr/denotes :lcc-639-1/SouthernSotho,
   :lcc-lr/hasTag "sot",
   :lcc-lr/identifies :lcc-639-1/SouthernSotho,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sot",
   :skos/definition "Alpha-3 language code for Southern Sotho"})

(def spa
  "Alpha-3 language code for Spanish; Castilian"
  {:db/ident :lcc-639-2/spa,
   :lcc-lr/denotes :lcc-639-1/Spanish,
   :lcc-lr/hasTag "spa",
   :lcc-lr/identifies :lcc-639-1/Spanish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "spa",
   :skos/definition "Alpha-3 language code for Spanish; Castilian"})

(def sqi
  "Alpha-3 terminologic language code for Albanian"
  {:db/ident :lcc-639-2/sqi,
   :lcc-lr/denotes :lcc-639-1/Albanian,
   :lcc-lr/hasTag "sqi",
   :lcc-lr/identifies :lcc-639-1/Albanian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:owl/NamedIndividual :lcc-lr/TerminologyCode :lcc-lr/Alpha3Code],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sqi",
   :skos/definition "Alpha-3 terminologic language code for Albanian"})

(def srd
  "Alpha-3 language code for Sardinian"
  {:db/ident :lcc-639-2/srd,
   :lcc-lr/denotes :lcc-639-1/Sardinian,
   :lcc-lr/hasTag "srd",
   :lcc-lr/identifies :lcc-639-1/Sardinian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "srd",
   :skos/definition "Alpha-3 language code for Sardinian"})

(def srn
  "Alpha-3 language code for Sranan Tongo"
  {:db/ident :lcc-639-2/srn,
   :lcc-lr/denotes :lcc-639-2/SrananTongo,
   :lcc-lr/hasTag "srn",
   :lcc-lr/identifies :lcc-639-2/SrananTongo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "srn",
   :skos/definition "Alpha-3 language code for Sranan Tongo"})

(def srp
  "Alpha-3 terminologic language code for Serbian"
  {:db/ident :lcc-639-2/srp,
   :lcc-lr/denotes :lcc-639-1/Serbian,
   :lcc-lr/hasTag "srp",
   :lcc-lr/identifies :lcc-639-1/Serbian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/TerminologyCode :lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "srp",
   :skos/definition "Alpha-3 terminologic language code for Serbian"})

(def srr
  "Alpha-3 language code for Serer"
  {:db/ident :lcc-639-2/srr,
   :lcc-lr/denotes :lcc-639-2/Serer,
   :lcc-lr/hasTag "srr",
   :lcc-lr/identifies :lcc-639-2/Serer,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "srr",
   :skos/definition "Alpha-3 language code for Serer"})

(def ssa
  "Alpha-3 language code for Nilo-Saharan"
  {:db/ident :lcc-639-2/ssa,
   :lcc-lr/denotes :lcc-639-2/NiloSaharanLanguages,
   :lcc-lr/hasTag "ssa",
   :lcc-lr/identifies :lcc-639-2/NiloSaharanLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ssa",
   :skos/definition "Alpha-3 language code for Nilo-Saharan"})

(def ssw
  "Alpha-3 language code for Swati"
  {:db/ident :lcc-639-2/ssw,
   :lcc-lr/denotes :lcc-639-1/Swati,
   :lcc-lr/hasTag "ssw",
   :lcc-lr/identifies :lcc-639-1/Swati,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ssw",
   :skos/definition "Alpha-3 language code for Swati"})

(def suk
  "Alpha-3 language code for Sukuma"
  {:db/ident :lcc-639-2/suk,
   :lcc-lr/denotes :lcc-639-2/Sukuma,
   :lcc-lr/hasTag "suk",
   :lcc-lr/identifies :lcc-639-2/Sukuma,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "suk",
   :skos/definition "Alpha-3 language code for Sukuma"})

(def sun
  "Alpha-3 language code for Sundanese"
  {:db/ident :lcc-639-2/sun,
   :lcc-lr/denotes :lcc-639-1/Sundanese,
   :lcc-lr/hasTag "sun",
   :lcc-lr/identifies :lcc-639-1/Sundanese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sun",
   :skos/definition "Alpha-3 language code for Sundanese"})

(def sus
  "Alpha-3 language code for Susu"
  {:db/ident :lcc-639-2/sus,
   :lcc-lr/denotes :lcc-639-2/Susu,
   :lcc-lr/hasTag "sus",
   :lcc-lr/identifies :lcc-639-2/Susu,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sus",
   :skos/definition "Alpha-3 language code for Susu"})

(def sux
  "Alpha-3 language code for Sumerian"
  {:db/ident :lcc-639-2/sux,
   :lcc-lr/denotes :lcc-639-2/Sumerian,
   :lcc-lr/hasTag "sux",
   :lcc-lr/identifies :lcc-639-2/Sumerian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "sux",
   :skos/definition "Alpha-3 language code for Sumerian"})

(def swa
  "Alpha-3 language code for Swahili"
  {:db/ident :lcc-639-2/swa,
   :lcc-lr/denotes :lcc-639-1/Swahili,
   :lcc-lr/hasTag "swa",
   :lcc-lr/identifies :lcc-639-1/Swahili,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "swa",
   :skos/definition "Alpha-3 language code for Swahili"})

(def swe
  "Alpha-3 language code for Swedish"
  {:db/ident :lcc-639-2/swe,
   :lcc-lr/denotes :lcc-639-1/Swedish,
   :lcc-lr/hasTag "swe",
   :lcc-lr/identifies :lcc-639-1/Swedish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "swe",
   :skos/definition "Alpha-3 language code for Swedish"})

(def syc
  "Alpha-3 language code for Classical Syriac"
  {:db/ident :lcc-639-2/syc,
   :lcc-lr/denotes :lcc-639-2/ClassicalSyriac,
   :lcc-lr/hasTag "syc",
   :lcc-lr/identifies :lcc-639-2/ClassicalSyriac,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "syc",
   :skos/definition "Alpha-3 language code for Classical Syriac"})

(def syr
  "Alpha-3 language code for Syriac"
  {:db/ident :lcc-639-2/syr,
   :lcc-lr/denotes :lcc-639-2/Syriac,
   :lcc-lr/hasTag "syr",
   :lcc-lr/identifies :lcc-639-2/Syriac,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "syr",
   :skos/definition "Alpha-3 language code for Syriac"})

(def tah
  "Alpha-3 language code for Tahitian"
  {:db/ident :lcc-639-2/tah,
   :lcc-lr/denotes :lcc-639-1/Tahitian,
   :lcc-lr/hasTag "tah",
   :lcc-lr/identifies :lcc-639-1/Tahitian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tah",
   :skos/definition "Alpha-3 language code for Tahitian"})

(def tai
  "Alpha-3 language code for Tai languages"
  {:db/ident :lcc-639-2/tai,
   :lcc-lr/denotes :lcc-639-2/TaiLanguages,
   :lcc-lr/hasTag "tai",
   :lcc-lr/identifies :lcc-639-2/TaiLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tai",
   :skos/definition "Alpha-3 language code for Tai languages"})

(def tam
  "Alpha-3 language code for Tamil"
  {:db/ident :lcc-639-2/tam,
   :lcc-lr/denotes :lcc-639-1/Tamil,
   :lcc-lr/hasTag "tam",
   :lcc-lr/identifies :lcc-639-1/Tamil,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tam",
   :skos/definition "Alpha-3 language code for Tamil"})

(def tat
  "Alpha-3 language code for Tatar"
  {:db/ident :lcc-639-2/tat,
   :lcc-lr/denotes :lcc-639-1/Tatar,
   :lcc-lr/hasTag "tat",
   :lcc-lr/identifies :lcc-639-1/Tatar,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tat",
   :skos/definition "Alpha-3 language code for Tatar"})

(def tel
  "Alpha-3 language code for Telugu"
  {:db/ident :lcc-639-2/tel,
   :lcc-lr/denotes :lcc-639-1/Telugu,
   :lcc-lr/hasTag "tel",
   :lcc-lr/identifies :lcc-639-1/Telugu,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tel",
   :skos/definition "Alpha-3 language code for Telugu"})

(def tem
  "Alpha-3 language code for Timne"
  {:db/ident :lcc-639-2/tem,
   :lcc-lr/denotes :lcc-639-2/Timne,
   :lcc-lr/hasTag "tem",
   :lcc-lr/identifies :lcc-639-2/Timne,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tem",
   :skos/definition "Alpha-3 language code for Timne"})

(def ter
  "Alpha-3 language code for Tereno"
  {:db/ident :lcc-639-2/ter,
   :lcc-lr/denotes :lcc-639-2/Tereno,
   :lcc-lr/hasTag "ter",
   :lcc-lr/identifies :lcc-639-2/Tereno,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ter",
   :skos/definition "Alpha-3 language code for Tereno"})

(def tet
  "Alpha-3 language code for Tetum"
  {:db/ident :lcc-639-2/tet,
   :lcc-lr/denotes :lcc-639-2/Tetum,
   :lcc-lr/hasTag "tet",
   :lcc-lr/identifies :lcc-639-2/Tetum,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tet",
   :skos/definition "Alpha-3 language code for Tetum"})

(def tgk
  "Alpha-3 language code for Tajik"
  {:db/ident :lcc-639-2/tgk,
   :lcc-lr/denotes :lcc-639-1/Tajik,
   :lcc-lr/hasTag "tgk",
   :lcc-lr/identifies :lcc-639-1/Tajik,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tgk",
   :skos/definition "Alpha-3 language code for Tajik"})

(def tgl
  "Alpha-3 language code for Tagalog"
  {:db/ident :lcc-639-2/tgl,
   :lcc-lr/denotes :lcc-639-1/Tagalog,
   :lcc-lr/hasTag "tgl",
   :lcc-lr/identifies :lcc-639-1/Tagalog,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tgl",
   :skos/definition "Alpha-3 language code for Tagalog"})

(def tha
  "Alpha-3 language code for Thai"
  {:db/ident :lcc-639-2/tha,
   :lcc-lr/denotes :lcc-639-1/Thai,
   :lcc-lr/hasTag "tha",
   :lcc-lr/identifies :lcc-639-1/Thai,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tha",
   :skos/definition "Alpha-3 language code for Thai"})

(def tib
  "Alpha-3 bibliographic language code for Tibetan"
  {:db/ident :lcc-639-2/tib,
   :lcc-lr/denotes :lcc-639-1/Tibetan,
   :lcc-lr/hasTag "tib",
   :lcc-lr/identifies :lcc-639-1/Tibetan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type
   [:lcc-lr/BibliographicCode :owl/NamedIndividual :lcc-lr/Alpha3Code],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tib",
   :skos/definition "Alpha-3 bibliographic language code for Tibetan"})

(def tig
  "Alpha-3 language code for Tigre"
  {:db/ident :lcc-639-2/tig,
   :lcc-lr/denotes :lcc-639-2/Tigre,
   :lcc-lr/hasTag "tig",
   :lcc-lr/identifies :lcc-639-2/Tigre,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tig",
   :skos/definition "Alpha-3 language code for Tigre"})

(def tir
  "Alpha-3 language code for Tigrinya"
  {:db/ident :lcc-639-2/tir,
   :lcc-lr/denotes :lcc-639-1/Tigrinya,
   :lcc-lr/hasTag "tir",
   :lcc-lr/identifies :lcc-639-1/Tigrinya,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tir",
   :skos/definition "Alpha-3 language code for Tigrinya"})

(def tiv_1
  "Alpha-3 language code for Tiv"
  {:db/ident :lcc-639-2/tiv_1,
   :lcc-lr/denotes :lcc-639-2/Tiv,
   :lcc-lr/hasTag "tiv",
   :lcc-lr/identifies :lcc-639-2/Tiv,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tiv",
   :skos/definition "Alpha-3 language code for Tiv"})

(def tkl
  "Alpha-3 language code for Tokelau"
  {:db/ident :lcc-639-2/tkl,
   :lcc-lr/denotes :lcc-639-2/Tokelau,
   :lcc-lr/hasTag "tkl",
   :lcc-lr/identifies :lcc-639-2/Tokelau,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tkl",
   :skos/definition "Alpha-3 language code for Tokelau"})

(def tlh
  "Alpha-3 language code for Klingon; tlhIngan-Hol"
  {:db/ident :lcc-639-2/tlh,
   :lcc-lr/denotes :lcc-639-2/Klingon,
   :lcc-lr/hasTag "tlh",
   :lcc-lr/identifies :lcc-639-2/Klingon,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tlh",
   :skos/definition "Alpha-3 language code for Klingon; tlhIngan-Hol"})

(def tli
  "Alpha-3 language code for Tlingit"
  {:db/ident :lcc-639-2/tli,
   :lcc-lr/denotes :lcc-639-2/Tlingit,
   :lcc-lr/hasTag "tli",
   :lcc-lr/identifies :lcc-639-2/Tlingit,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tli",
   :skos/definition "Alpha-3 language code for Tlingit"})

(def tmh
  "Alpha-3 language code for Tamashek"
  {:db/ident :lcc-639-2/tmh,
   :lcc-lr/denotes :lcc-639-2/Tamashek,
   :lcc-lr/hasTag "tmh",
   :lcc-lr/identifies :lcc-639-2/Tamashek,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tmh",
   :skos/definition "Alpha-3 language code for Tamashek"})

(def tog
  "Alpha-3 language code for Tonga (Nyasa)"
  {:db/ident :lcc-639-2/tog,
   :lcc-lr/denotes :lcc-639-2/TongaNyasa,
   :lcc-lr/hasTag "tog",
   :lcc-lr/identifies :lcc-639-2/TongaNyasa,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tog",
   :skos/definition "Alpha-3 language code for Tonga (Nyasa)"})

(def ton
  "Alpha-3 language code for Tonga (Tonga Islands)"
  {:db/ident :lcc-639-2/ton,
   :lcc-lr/denotes :lcc-639-1/Tonga-TongaIslands,
   :lcc-lr/hasTag "ton",
   :lcc-lr/identifies :lcc-639-1/Tonga-TongaIslands,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ton",
   :skos/definition "Alpha-3 language code for Tonga (Tonga Islands)"})

(def tpi
  "Alpha-3 language code for Tok Pisin"
  {:db/ident :lcc-639-2/tpi,
   :lcc-lr/denotes :lcc-639-2/TokPisin,
   :lcc-lr/hasTag "tpi",
   :lcc-lr/identifies :lcc-639-2/TokPisin,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tpi",
   :skos/definition "Alpha-3 language code for Tok Pisin"})

(def tsi
  "Alpha-3 language code for Tsimshian"
  {:db/ident :lcc-639-2/tsi,
   :lcc-lr/denotes :lcc-639-2/Tsimshian,
   :lcc-lr/hasTag "tsi",
   :lcc-lr/identifies :lcc-639-2/Tsimshian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tsi",
   :skos/definition "Alpha-3 language code for Tsimshian"})

(def tsn
  "Alpha-3 language code for Tswana"
  {:db/ident :lcc-639-2/tsn,
   :lcc-lr/denotes :lcc-639-1/Tswana,
   :lcc-lr/hasTag "tsn",
   :lcc-lr/identifies :lcc-639-1/Tswana,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tsn",
   :skos/definition "Alpha-3 language code for Tswana"})

(def tso
  "Alpha-3 language code for Tsonga"
  {:db/ident :lcc-639-2/tso,
   :lcc-lr/denotes :lcc-639-1/Tsonga,
   :lcc-lr/hasTag "tso",
   :lcc-lr/identifies :lcc-639-1/Tsonga,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tso",
   :skos/definition "Alpha-3 language code for Tsonga"})

(def tuk
  "Alpha-3 language code for Turkmen"
  {:db/ident :lcc-639-2/tuk,
   :lcc-lr/denotes :lcc-639-1/Turkmen,
   :lcc-lr/hasTag "tuk",
   :lcc-lr/identifies :lcc-639-1/Turkmen,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tuk",
   :skos/definition "Alpha-3 language code for Turkmen"})

(def tum
  "Alpha-3 language code for Tumbuka"
  {:db/ident :lcc-639-2/tum,
   :lcc-lr/denotes :lcc-639-2/Tumbuka,
   :lcc-lr/hasTag "tum",
   :lcc-lr/identifies :lcc-639-2/Tumbuka,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tum",
   :skos/definition "Alpha-3 language code for Tumbuka"})

(def tup
  "Alpha-3 language code for Tupi languages"
  {:db/ident :lcc-639-2/tup,
   :lcc-lr/denotes :lcc-639-2/TupiLanguages,
   :lcc-lr/hasTag "tup",
   :lcc-lr/identifies :lcc-639-2/TupiLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tup",
   :skos/definition "Alpha-3 language code for Tupi languages"})

(def tur
  "Alpha-3 language code for Turkish"
  {:db/ident :lcc-639-2/tur,
   :lcc-lr/denotes :lcc-639-1/Turkish,
   :lcc-lr/hasTag "tur",
   :lcc-lr/identifies :lcc-639-1/Turkish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tur",
   :skos/definition "Alpha-3 language code for Turkish"})

(def tut
  "Alpha-3 language code for Altaic languages"
  {:db/ident :lcc-639-2/tut,
   :lcc-lr/denotes :lcc-639-2/AltaicLanguages,
   :lcc-lr/hasTag "tut",
   :lcc-lr/identifies :lcc-639-2/AltaicLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tut",
   :skos/definition "Alpha-3 language code for Altaic languages"})

(def tvl
  "Alpha-3 language code for Tuvalu"
  {:db/ident :lcc-639-2/tvl,
   :lcc-lr/denotes :lcc-639-2/Tuvalu,
   :lcc-lr/hasTag "tvl",
   :lcc-lr/identifies :lcc-639-2/Tuvalu,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tvl",
   :skos/definition "Alpha-3 language code for Tuvalu"})

(def twi_1
  "Alpha-3 language code for Twi"
  {:db/ident :lcc-639-2/twi_1,
   :lcc-lr/denotes :lcc-639-1/Twi,
   :lcc-lr/hasTag "twi",
   :lcc-lr/identifies :lcc-639-1/Twi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "twi_1",
   :skos/definition "Alpha-3 language code for Twi"})

(def tyv
  "Alpha-3 language code for Tuvinian"
  {:db/ident :lcc-639-2/tyv,
   :lcc-lr/denotes :lcc-639-2/Tuvinian,
   :lcc-lr/hasTag "tyv",
   :lcc-lr/identifies :lcc-639-2/Tuvinian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "tyv",
   :skos/definition "Alpha-3 language code for Tuvinian"})

(def udm
  "Alpha-3 language code for Udmurt"
  {:db/ident :lcc-639-2/udm,
   :lcc-lr/denotes :lcc-639-2/Udmurt,
   :lcc-lr/hasTag "udm",
   :lcc-lr/identifies :lcc-639-2/Udmurt,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "udm",
   :skos/definition "Alpha-3 language code for Udmurt"})

(def uga
  "Alpha-3 language code for Ugaritic"
  {:db/ident :lcc-639-2/uga,
   :lcc-lr/denotes :lcc-639-2/Ugaritic,
   :lcc-lr/hasTag "uga",
   :lcc-lr/identifies :lcc-639-2/Ugaritic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "uga",
   :skos/definition "Alpha-3 language code for Ugaritic"})

(def uig
  "Alpha-3 language code for Uighur; Uyghur"
  {:db/ident :lcc-639-2/uig,
   :lcc-lr/denotes :lcc-639-1/Uighur,
   :lcc-lr/hasTag "uig",
   :lcc-lr/identifies :lcc-639-1/Uighur,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "uig",
   :skos/definition "Alpha-3 language code for Uighur; Uyghur"})

(def ukr
  "Alpha-3 language code for Ukrainian"
  {:db/ident :lcc-639-2/ukr,
   :lcc-lr/denotes :lcc-639-1/Ukrainian,
   :lcc-lr/hasTag "ukr",
   :lcc-lr/identifies :lcc-639-1/Ukrainian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ukr",
   :skos/definition "Alpha-3 language code for Ukrainian"})

(def umb
  "Alpha-3 language code for Umbundu"
  {:db/ident :lcc-639-2/umb,
   :lcc-lr/denotes :lcc-639-2/Umbundu,
   :lcc-lr/hasTag "umb",
   :lcc-lr/identifies :lcc-639-2/Umbundu,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "umb",
   :skos/definition "Alpha-3 language code for Umbundu"})

(def und
  "Alpha-3 language code for Undetermined"
  {:db/ident :lcc-639-2/und,
   :lcc-lr/denotes :lcc-639-2/Undetermined,
   :lcc-lr/hasTag "und",
   :lcc-lr/identifies :lcc-639-2/Undetermined,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "und",
   :skos/definition "Alpha-3 language code for Undetermined"})

(def urd
  "Alpha-3 language code for Urdu"
  {:db/ident :lcc-639-2/urd,
   :lcc-lr/denotes :lcc-639-1/Urdu,
   :lcc-lr/hasTag "urd",
   :lcc-lr/identifies :lcc-639-1/Urdu,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "urd",
   :skos/definition "Alpha-3 language code for Urdu"})

(def uzb
  "Alpha-3 language code for Uzbek"
  {:db/ident :lcc-639-2/uzb,
   :lcc-lr/denotes :lcc-639-1/Uzbek,
   :lcc-lr/hasTag "uzb",
   :lcc-lr/identifies :lcc-639-1/Uzbek,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "uzb",
   :skos/definition "Alpha-3 language code for Uzbek"})

(def vai_1
  "Alpha-3 language code for Vai"
  {:db/ident :lcc-639-2/vai_1,
   :lcc-lr/denotes :lcc-639-2/Vai,
   :lcc-lr/hasTag "vai",
   :lcc-lr/identifies :lcc-639-2/Vai,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "vai",
   :skos/definition "Alpha-3 language code for Vai"})

(def ven
  "Alpha-3 language code for Venda"
  {:db/ident :lcc-639-2/ven,
   :lcc-lr/denotes :lcc-639-1/Venda,
   :lcc-lr/hasTag "ven",
   :lcc-lr/identifies :lcc-639-1/Venda,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ven",
   :skos/definition "Alpha-3 language code for Venda"})

(def vie
  "Alpha-3 language code for Vietnamese"
  {:db/ident :lcc-639-2/vie,
   :lcc-lr/denotes :lcc-639-1/Vietnamese,
   :lcc-lr/hasTag "vie",
   :lcc-lr/identifies :lcc-639-1/Vietnamese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "vie",
   :skos/definition "Alpha-3 language code for Vietnamese"})

(def vol
  "Alpha-3 language code for Volapuk"
  {:db/ident :lcc-639-2/vol,
   :lcc-lr/denotes :lcc-639-1/Volapuk,
   :lcc-lr/hasTag "vol",
   :lcc-lr/identifies :lcc-639-1/Volapuk,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "vol",
   :skos/definition "Alpha-3 language code for Volapuk"})

(def vot
  "Alpha-3 language code for Votic"
  {:db/ident :lcc-639-2/vot,
   :lcc-lr/denotes :lcc-639-2/Votic,
   :lcc-lr/hasTag "vot",
   :lcc-lr/identifies :lcc-639-2/Votic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "vot",
   :skos/definition "Alpha-3 language code for Votic"})

(def wak
  "Alpha-3 language code for Wakashan languages"
  {:db/ident :lcc-639-2/wak,
   :lcc-lr/denotes :lcc-639-2/WakashanLanguages,
   :lcc-lr/hasTag "wak",
   :lcc-lr/identifies :lcc-639-2/WakashanLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "wak",
   :skos/definition "Alpha-3 language code for Wakashan languages"})

(def wal
  "Alpha-3 language code for Wolaitta"
  {:db/ident :lcc-639-2/wal,
   :lcc-lr/denotes :lcc-639-2/Wolaitta,
   :lcc-lr/hasTag "wal",
   :lcc-lr/identifies :lcc-639-2/Wolaitta,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "wal",
   :skos/definition "Alpha-3 language code for Wolaitta"})

(def war
  "Alpha-3 language code for Waray"
  {:db/ident :lcc-639-2/war,
   :lcc-lr/denotes :lcc-639-2/Waray,
   :lcc-lr/hasTag "war",
   :lcc-lr/identifies :lcc-639-2/Waray,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "war",
   :skos/definition "Alpha-3 language code for Waray"})

(def was
  "Alpha-3 language code for Washo"
  {:db/ident :lcc-639-2/was,
   :lcc-lr/denotes :lcc-639-2/Washo,
   :lcc-lr/hasTag "was",
   :lcc-lr/identifies :lcc-639-2/Washo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "was",
   :skos/definition "\n    Alpha-3 language code for Washo\n  "})

(def wel
  "Alpha-3 bibliographic language code for Welsh"
  {:db/ident :lcc-639-2/wel,
   :lcc-lr/denotes :lcc-639-1/Welsh,
   :lcc-lr/hasTag "wel",
   :lcc-lr/identifies :lcc-639-1/Welsh,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type
   [:lcc-lr/BibliographicCode :owl/NamedIndividual :lcc-lr/Alpha3Code],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "wel",
   :skos/definition "Alpha-3 bibliographic language code for Welsh"})

(def wen
  "Alpha-3 language code for Sorbian languages"
  {:db/ident :lcc-639-2/wen,
   :lcc-lr/denotes :lcc-639-2/SorbianLanguages,
   :lcc-lr/hasTag "wen",
   :lcc-lr/identifies :lcc-639-2/SorbianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "wen",
   :skos/definition "Alpha-3 language code for Sorbian languages"})

(def wln
  "Alpha-3 language code for Walloon"
  {:db/ident :lcc-639-2/wln,
   :lcc-lr/denotes :lcc-639-1/Walloon,
   :lcc-lr/hasTag "wln",
   :lcc-lr/identifies :lcc-639-1/Walloon,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "wln",
   :skos/definition "Alpha-3 language code for Walloon"})

(def wol
  "Alpha-3 language code for Wolof"
  {:db/ident :lcc-639-2/wol,
   :lcc-lr/denotes :lcc-639-1/Wolof,
   :lcc-lr/hasTag "wol",
   :lcc-lr/identifies :lcc-639-1/Wolof,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "wol",
   :skos/definition "Alpha-3 language code for Wolof"})

(def xal
  "Alpha-3 language code for Kalmyk; Oirat"
  {:db/ident :lcc-639-2/xal,
   :lcc-lr/denotes :lcc-639-2/Kalmyk,
   :lcc-lr/hasTag "xal",
   :lcc-lr/identifies :lcc-639-2/Kalmyk,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "xal",
   :skos/definition "Alpha-3 language code for Kalmyk; Oirat"})

(def xho
  "Alpha-3 language code for Xhosa"
  {:db/ident :lcc-639-2/xho,
   :lcc-lr/denotes :lcc-639-1/Xhosa,
   :lcc-lr/hasTag "xho",
   :lcc-lr/identifies :lcc-639-1/Xhosa,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "xho",
   :skos/definition "Alpha-3 language code for Xhosa"})

(def yao_1
  "Alpha-3 language code for Yao"
  {:db/ident :lcc-639-2/yao_1,
   :lcc-lr/denotes :lcc-639-2/Yao,
   :lcc-lr/hasTag "yao",
   :lcc-lr/identifies :lcc-639-2/Yao,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "yao",
   :skos/definition "Alpha-3 language code for Yao"})

(def yap
  "Alpha-3 language code for Yapese"
  {:db/ident :lcc-639-2/yap,
   :lcc-lr/denotes :lcc-639-2/Yapese,
   :lcc-lr/hasTag "yap",
   :lcc-lr/identifies :lcc-639-2/Yapese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "yap",
   :skos/definition "Alpha-3 language code for Yapese"})

(def yid
  "Alpha-3 language code for Yiddish"
  {:db/ident :lcc-639-2/yid,
   :lcc-lr/denotes :lcc-639-1/Yiddish,
   :lcc-lr/hasTag "yid",
   :lcc-lr/identifies :lcc-639-1/Yiddish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "yid",
   :skos/definition "Alpha-3 language code for Yiddish"})

(def yor
  "Alpha-3 language code for Yoruba"
  {:db/ident :lcc-639-2/yor,
   :lcc-lr/denotes :lcc-639-1/Yoruba,
   :lcc-lr/hasTag "yor",
   :lcc-lr/identifies :lcc-639-1/Yoruba,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "yor",
   :skos/definition "Alpha-3 language code for Yoruba"})

(def ypk
  "Alpha-3 language code for Yupik languages"
  {:db/ident :lcc-639-2/ypk,
   :lcc-lr/denotes :lcc-639-2/YupikLanguages,
   :lcc-lr/hasTag "ypk",
   :lcc-lr/identifies :lcc-639-2/YupikLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ypk",
   :skos/definition "Alpha-3 language code for Yupik languages"})

(def zap
  "Alpha-3 language code for Zapotec"
  {:db/ident :lcc-639-2/zap,
   :lcc-lr/denotes :lcc-639-2/Zapotec,
   :lcc-lr/hasTag "zap",
   :lcc-lr/identifies :lcc-639-2/Zapotec,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "zap",
   :skos/definition "Alpha-3 language code for Zapotec"})

(def zbl
  "Alpha-3 language code for Bliss"
  {:db/ident :lcc-639-2/zbl,
   :lcc-lr/denotes :lcc-639-2/Bliss,
   :lcc-lr/hasTag "zbl",
   :lcc-lr/identifies :lcc-639-2/Bliss,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "zbl",
   :skos/definition "Alpha-3 language code for Bliss"})

(def zen
  "Alpha-3 language code for Zenaga"
  {:db/ident :lcc-639-2/zen,
   :lcc-lr/denotes :lcc-639-2/Zenaga,
   :lcc-lr/hasTag "zen",
   :lcc-lr/identifies :lcc-639-2/Zenaga,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "zen",
   :skos/definition "Alpha-3 language code for Zenaga"})

(def zgh
  "Alpha-3 language code for Standard Moroccan Tamazight"
  {:db/ident :lcc-639-2/zgh,
   :lcc-lr/denotes :lcc-639-2/StandardMoroccanTamazight,
   :lcc-lr/hasTag "zgh",
   :lcc-lr/identifies :lcc-639-2/StandardMoroccanTamazight,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "zgh",
   :skos/definition "Alpha-3 language code for Standard Moroccan Tamazight"})

(def zha
  "Alpha-3 language code for Zhuang"
  {:db/ident :lcc-639-2/zha,
   :lcc-lr/denotes :lcc-639-1/Zhuang,
   :lcc-lr/hasTag "zha",
   :lcc-lr/identifies :lcc-639-1/Zhuang,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "zha",
   :skos/definition "Alpha-3 language code for Zhuang"})

(def zho
  "Alpha-3 terminologic language code for Chinese"
  {:db/ident :lcc-639-2/zho,
   :lcc-lr/denotes :lcc-639-1/Chinese,
   :lcc-lr/hasTag "zho",
   :lcc-lr/identifies :lcc-639-1/Chinese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual :lcc-lr/TerminologyCode],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "zho",
   :skos/definition "Alpha-3 terminologic language code for Chinese"})

(def znd
  "Alpha-3 language code for Zande languages"
  {:db/ident :lcc-639-2/znd,
   :lcc-lr/denotes :lcc-639-2/ZandeLanguages,
   :lcc-lr/hasTag "znd",
   :lcc-lr/identifies :lcc-639-2/ZandeLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "znd",
   :skos/definition "Alpha-3 language code for Zande languages"})

(def zul
  "Alpha-3 language code for Zulu"
  {:db/ident :lcc-639-2/zul,
   :lcc-lr/denotes :lcc-639-1/Zulu,
   :lcc-lr/hasTag "zul",
   :lcc-lr/identifies :lcc-639-1/Zulu,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "zul",
   :skos/definition "Alpha-3 language code for Zulu"})

(def zun
  "Alpha-3 language code for Zuni"
  {:db/ident :lcc-639-2/zun,
   :lcc-lr/denotes :lcc-639-2/Zuni,
   :lcc-lr/hasTag "zun",
   :lcc-lr/identifies :lcc-639-2/Zuni,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "zun",
   :skos/definition "Alpha-3 language code for Zuni"})

(def zxx
  "Alpha-3 language code for No linguistic content"
  {:db/ident :lcc-639-2/zxx,
   :lcc-lr/denotes :lcc-639-2/NoLinguisticContent,
   :lcc-lr/hasTag "zxx",
   :lcc-lr/identifies :lcc-639-2/NoLinguisticContent,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "zxx",
   :skos/definition "Alpha-3 language code for No linguistic content"})

(def zza
  "Alpha-3 language code for Zaza; Dimili; Dimli; Kirdki; Kirmanjki; Zazaki"
  {:db/ident :lcc-639-2/zza,
   :lcc-lr/denotes :lcc-639-2/Zaza,
   :lcc-lr/hasTag "zza",
   :lcc-lr/identifies :lcc-639-2/Zaza,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type [:lcc-lr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "zza",
   :skos/definition
   "Alpha-3 language code for Zaza; Dimili; Dimli; Kirdki; Kirmanjki; Zazaki"})