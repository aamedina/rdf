(ns net.wikipunk.rdf.lcc-lr
  "Language Representation Ontology"
  {:dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/source
   ["ISO 639-5 Codes for the representation of names of languages - Part 5: Alpha-3 code for language families and groups, First edition, 2008-05-15"
    "ISO 639-2 Codes for the representation of names of languages - Part 2: Alpha-3 code, First edition, 1998-11-01"
    "ISO 639-1 Codes for the representation of names of languages - Part 1: Alpha-2 code, First edition, 2002-07-15"
    "ISO 639-6 Codes for the representation of names of languages - Part 6: Alpha-4 code for comprehensive coverage of language variants, First edition, 2009-12-01"
    "ISO 639-4 Codes for the representation of names of languages - Part 4: General principles of coding of the representation of names of languages and related entities, and application guidelines, First edition, 2010-07-15"
    "ISO 639-3 Codes for the representation of names of languages - Part 3: Alpha-3 code for comprehensive coverage of languages, First edition, 2007-02-01"],
   :owl/versionIRI
   "https://www.omg.org/spec/LCC/20211101/Languages/LanguageRepresentation/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "lcc-lr"  "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfa/prefix "lcc-lr",
   :rdfa/uri "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "Language Representation Ontology",
   :rdfs/seeAlso ["https://www.omg.org/spec/LCC/AboutLCC/"
                  "https://www.omg.org/spec/LCC/Languages/AboutLanguages/"],
   :skos/changeNote
   ["The http://www.omg.org/spec/LCC/20171801/Languages/LanguageRepresentation.rdf version of this ontology was revised to loosen the range constraints on the hasName properties to enable use of language tags, as stated in the LCC 1.1 RTF report."
    "The http://www.omg.org/spec/LCC/20190201/Languages/LanguageRepresentation.rdf version of this ontology was revised to loosen the domain constraint on the hasTag property to make it more broadly usable, and loosened the constraint that an Identifier identifies exactly 1 thing to at least 1 thing to address cases where identifiers are reused, as stated in the LCC 1.2 RTF report."
    "The http://www.omg.org/spec/LCC/20151101/Languages/LanguageRepresentation.rdf version of this ontology was revised to reflect the issues addressed by the LCC 1.0 FTF report."],
   :skos/historyNote
   "This ontology is ultimately intended to represent all of ISO 639 for reference purposes, and to be sufficiently extensible to accommodate new sections or modifications as they are published. The current version of the ontology (including subordinate modules containing the language names and codes) provides a unique English name (i.e., the reference name from 639-3) for each language, with UTF-8 encoded literals specifying alternates in English, French, and Indigenous languages where present in the standard, and in German corresponding to the names on the LoC web site.\n\n1.  Where multiple English names occur in 639-1 and 639-2, we have used the primary name specified in 639-2:1998 superseded by the latest revision posted by the registration authority, or, where multiples are specified by the registration authority, the reference name from ISO 639-3 as the 'named individual name' for a given language. For languages specified in ISO 639-1, there is at least one English name and at least one French name for every language, corresponding to exactly one alpha-2 code.  Most languages from ISO 639-1 have at least one indigenous name.  Most languages with codes available from the Library of Congress also have at least one German name.  The correspondence between the alpha-2 codes and languages are made explicit in the individuals representing the codes themselves, and can be inferred for the languages using an OWL DL reasoner.\n\n2.  This release of the ontology covers all languages specified in parts 1 and 2 of the standard, and categorizes the alpha-3 codes from part 2 according to the categorization scheme provided in parts 3 and 4.  Subsequent releases of the ontology will address additional languages covered in part 3, as well as additional components of the standard, such as equivalence to standards representing relevant scripts, as they become available, and the language groups covered by ISO 639-5.\n\n3.  We have used individuals to represent all alpha-2 and alpha-3 codes, which, in turn, have matching strings (tags) associated with them for use in a variety of applications to facilitate reasoning and mapping.  The strings are provided as datatype properties of the individuals to support applications that may require them for RFC 4646-style tagging.\n  \n4.  Note that some tools, including certain UML tools, are case insensitive.  Thus, in cases where a language name collides with an alpha-2 or alpha-3 code, (i.e., Ga, Ewe, Fon, Ido, Lao, Tiv, Twi, Vai, and Yao), the names for the individual codes have been extended with '_1' (e.g., 'ewe_1').\n\n5.  We found a few anomalies in the standards while developing this ontology.  These include: \n(1) Bihari is included in the 2002 version of 639-1, in the 1998 version of 639-2, and in the online codes posted by the Library of Congress in 2007 for parts 1 and 2, with part 1 code of 'bh' and part 2 bibliographic and terminology codes of 'bih'.  At that time, there was no discussion stating that Bihari is a collective language, although it was omitted from the downloadable data for 639-3.  Since then, the language element has been renamed 'Bihari languages', in both English and French, without change to the corresponding language codes.  The latest version of the code sets reflect this modification.  Our assumption is that the trigraph for Bihari is a collective language code, which is supported by online research in Eastern Indic languages.\n(2) Serbo-Croatian was included in the 2002 version of 639-1, with part 1 code 'sh'.  It was not mentioned in the 1998 version of 693-2, but appears in 639-3 with a language identifier of 'hbs', without codes for 639-2.  As of 2010, Serbo-Croation has been eliminated from ISO 639-1 and 639-2 codes altogether, and the ontology reflects this.\n(3) Other changes in the latest version of the ontology include elimination of the 639-1 code for Moldavian, merging the language with Romanian, and additional English and French names for some languages, such as Dutch (to include Flemish, flamais), among others.\n(4) German names for languages in ISO 639-2 were added to the Library of Congress in 2014, and are supported in this version of the ontology.\n\n6.  The LCC 1.0 version of this ontology, published in advance of the 2017 New Orleans OMG Technical Meeting, was current as of 31 July 2017 with respect to the ISO 639-1 and 639-2 codes included herein.",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2015-2019 Adaptive Inc."
                  "Copyright (c) 2015-2017 Unisys"
                  "Copyright (c) 2015-2021 Thematix Partners LLC"
                  "Copyright (c) 2015-2021 Object Management Group, Inc."
                  "Copyright (c) 2020-2021 agnos.ai"],
   :sm/fileAbbreviation "lcc-lr",
   :sm/fileAbstract
   "This ontology, based on ISO 639 as well as the language element of the Language Tag specified in BCP 47 (RFC 4646, RFC 4647), provides a systemic description of the vocabulary used for language representation, including natural and artificial languages. \n\nISO 639 provides two language codes, one as a two-letter code (ISO 639-1) and another as a three-letter code (ISO 639-2, ISO 639-3, ISO 639-5) for the representation of names of languages.  ISO 639-1 was devised primarily for use in terminology, lexicography, and linguistics.  ISO 639-2 represents all of the languages contained in ISO 639-1, additional languages and language groups, as they may be coded for special purposes when more specificity in coding is needed.  The languages listed in ISO 639-1 are a subset of the languages listed in ISO 639-2; every language code element in the two-letter code has a corresponding language code element in the three-letter code, but not necessarily vice versa.  ISO 639-4 provides the basis for describing languages, as defined in this ontology, and additional codes are provided in 639-5 and other parts of the standard, again with more details about macrolanguages, other lesser known independent languages, and special language groups.\n\nISO 639-3 extends the set of three-letter codes provided in 639-2 to cover all of the natural, human languages in use today, along with many well-known ancient, extinct, and historical languages, including written and signed languages.  It also identifies the codes found in 639-2 that represent families or groups of languages rather than a single human language, depending on the perspective of the consumer.\n\nThe Registration Authority for ISO 639-1 is the International Information Centre for Terminology, ISO 639-1/RA.  This organization is responsible for maintenance of Part-1, and more information can be found at http://www.infoterm.info/standardization/iso_639_1_2002.php, although the actual code set is maintained by the US Library of Congress, together with the code set for ISO 639-2.\n\nThe Registration Authority for ISO 639-2 is the Library of Congress, ISO 639-2/RA.  The Library of Congress is responsible for maintenance of Part-2, at http://www.loc.gov/standards/iso639-2/iso639-2ra.html.  Current code sets for ISO 639-1 and ISO 639-2 are available from this site, as mentioned above.  In addition to the material covered in the basic standard, the Library of Congress also publishes the German names for all languages, which is reflected in the properties given below.  See http://loc.gov/standards/iso639-2/php/code_list.php for the latest release.\n\nThe Registration Authority for ISO 639-3 is SIL International, ISO 639-3/RA.  SIL International is responsible for maintenance of Part-3, and more information can be found at http://www.sil.org/iso639-3/default.asp.\n\nThe codes included herein also correspond to the language element of the Language Tag specified in BCP 47 (RFC 4646, RFC 4647), and can be used for matching or other application development purposes (e.g., use of language identifier literals in applications that build up the RFC 4646 based tags).\n\nThis ontology (Language Representation) defines the model for the standard, based in part on ISO 639-4, with individual codes for the other parts of the standard represented in dependent models.",
   :sm/filename "LanguageRepresentation.rdf",
   :sm/relatedSpecification
   "BCP 47, Tags for Identifying Languages, see http://tools.ietf.org/html/bcp47"})

(def Alpha2Code
  "a language identifier for a human language as defined by ISO 639-1, that is, a two-letter combination of characters used to represent a language or languages"
  {:db/ident :lcc-lr/Alpha2Code,
   :dcterms/source "Section 4.1, ISO 639-1",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "alpha-2 code",
   :rdfs/seeAlso ["https://en.wikipedia.org/wiki/UTF-8"],
   :rdfs/subClassOf :lcc-lr/LanguageIdentifier,
   :skos/definition
   "a language identifier for a human language as defined by ISO 639-1, that is, a two-letter combination of characters used to represent a language or languages",
   :skos/note
   "In the ISO 639-1 language code, each language identifier is composed of two letters (lower case letters from the Latin alphabet, corresponding to characters 97 through 122 of the UTF-8 encoding), without diacritical marks or other encodings of any kind.",
   :skos/scopeNote
   "The identifiers are not abbreviations for the languages they identify.  They are derived in some way from the indiginous language name or from preferences of the relevant speech community."})

(def Alpha3Code
  "a language identifier for a human language as defined by ISO 639, that is, a three-letter combination of characters used to represent a language or languages"
  {:db/ident :lcc-lr/Alpha3Code,
   :dcterms/source "Section 3.2, ISO 639-2",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "alpha-3 code",
   :rdfs/seeAlso ["https://en.wikipedia.org/wiki/UTF-8"],
   :rdfs/subClassOf :lcc-lr/LanguageIdentifier,
   :skos/definition
   "a language identifier for a human language as defined by ISO 639, that is, a three-letter combination of characters used to represent a language or languages",
   :skos/note
   ["Two code sets are provided in ISO 639-2, one for bibliographic applications and one for terminology applications. Some of these are considered collective language codes, referring to a family of languages, and there are a few special purpose codes for use in various applications. ISO 639-3 provides a single, three character code for each individual language or macrolanguage. Additional codes for language families and groups are specified in other parts of the standard."
    "In the ISO 639-2 language code, each language identifier is composed of three letters (lower case letters from the Latin alphabet, corresponding to characters 97 through 122 of the UTF-8 encoding), without diacritical marks or other encodings of any kind."]})

(def AncientLanguage
  "an extinct language that has an attested literature and is recognized as having special status in the academic community"
  {:db/ident :lcc-lr/AncientLanguage,
   :dcterms/source "Section 3.25 and 4.7, ISO 639-4",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "ancient language",
   :rdfs/subClassOf :lcc-lr/ExtinctLanguage,
   :skos/definition
   "an extinct language that has an attested literature and is recognized as having special status in the academic community",
   :skos/note
   "Ancient languages may have either individual or collective language codes.  See section 4.1.5, ISO 639-2, for an explanation of the latter case."})

(def Arrangement
  "a structure or means of organizing information such as a schema, numbering system, organization scheme, measurement system, taxonomy, or language for organizing information"
  {:db/ident :lcc-lr/Arrangement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "arrangement",
   :skos/definition
   "a structure or means of organizing information such as a schema, numbering system, organization scheme, measurement system, taxonomy, or language for organizing information"})

(def ArtificialLanguage
  "a language for human communication that has been artificially devised"
  {:db/ident :lcc-lr/ArtificialLanguage,
   :dcterms/source "Section 3.28 and 4.8, ISO 639-4",
   :owl/disjointWith :lcc-lr/NaturalLanguage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "artificial language",
   :rdfs/subClassOf :lcc-lr/Language,
   :skos/definition
   "a language for human communication that has been artificially devised",
   :skos/note
   "Artificial languages do not include reconstructed languages or computer programming languages."})

(def BibliographicCode
  "an alpha-3 code that is a member of the set of bibliographic codes in ISO 639-2"
  {:db/ident :lcc-lr/BibliographicCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "bibliographic code",
   :rdfs/subClassOf [:lcc-lr/LanguageIdentifier :lcc-lr/Alpha3Code],
   :skos/definition
   "an alpha-3 code that is a member of the set of bibliographic codes in ISO 639-2"})

(def CodeElement
  "a sequence of characters denoting something that it is associated with for some purpose, within a specified context, according to some rule set"
  {:db/ident :lcc-lr/CodeElement,
   :dcterms/source
   "ISO/IEC 11179-3 Information technology - Metadata registries (MDR) - Part 3: Registry metamodel and basic attributes, Third edition, 2013-02-15",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "code element",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :lcc-lr/denotes,
                      :rdf/type        :owl/Restriction}
                     {:owl/onClass    :lcc-lr/CodeSet,
                      :owl/onProperty :lcc-lr/isMemberOf,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "a sequence of characters denoting something that it is associated with for some purpose, within a specified context, according to some rule set"})

(def CodeSet
  "a system of alpha-numeric symbols, or combinations of symbols, that stand for specified values in some context"
  {:db/ident :lcc-lr/CodeSet,
   :dcterms/source
   "ISO/IEC 11179-3 Information technology - Metadata registries (MDR) - Part 3: Registry metamodel and basic attributes, Third edition, 2013-02-15",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "code set",
   :rdfs/subClassOf [{:owl/allValuesFrom :lcc-lr/CodeElement,
                      :owl/onProperty    :lcc-lr/hasMember,
                      :rdf/type          :owl/Restriction}
                     :lcc-lr/Arrangement],
   :skos/altLabel "coding scheme",
   :skos/definition
   "a system of alpha-numeric symbols, or combinations of symbols, that stand for specified values in some context"})

(def Collection
  "a grouping of some variable number of things (may be zero) that have some shared significance"
  {:db/ident :lcc-lr/Collection,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "collection",
   :skos/definition
   "a grouping of some variable number of things (may be zero) that have some shared significance"})

(def CollectiveLanguageCode
  "a language identifier or code used to represent a group of languages"
  {:db/ident :lcc-lr/CollectiveLanguageCode,
   :dcterms/source
   "Sections 3.3 and 4.1.1, and 4.1.3, ISO 639-2; Section 4.6, ISO 639-4",
   :owl/disjointWith :lcc-lr/SpecialPurposeCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "collective language code",
   :rdfs/subClassOf [{:owl/allValuesFrom :lcc-lr/LanguageGroup,
                      :owl/onProperty    :lcc-lr/identifies,
                      :rdf/type          :owl/Restriction}
                     :lcc-lr/LanguageIdentifier
                     {:owl/allValuesFrom :lcc-lr/LanguageGroup,
                      :owl/onProperty    :lcc-lr/denotes,
                      :rdf/type          :owl/Restriction}],
   :skos/definition
   "a language identifier or code used to represent a group of languages",
   :skos/note
   "See section 4.1.1, ISO 639-2, for an explanation of the usage of such codes, and section 4.1.3 to gain understanding of the distinction between collective language and macrolanguage codes."})

(def Dialect
  "a language variant that is specific to a geographical region or speech community"
  {:db/ident :lcc-lr/Dialect,
   :dcterms/source
   "Sections 3.8, 4.2, and 4.5, ISO 639-4; Sections 4.1.3 and 4.1.4, ISO 639-2",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "dialect",
   :rdfs/subClassOf :lcc-lr/LanguageVariant,
   :skos/definition
   "a language variant that is specific to a geographical region or speech community",
   :skos/note
   "Dialects are typically represented via the same language code as the code for the primary language, with a few exceptions for well-known dialects.  See sections 4.1.3 and 4.1.4, ISO 639-2 for additional details on the treatment of dialects in the standard."})

(def ExtinctLanguage
  "an individual language or variant that is no longer in use and has no current descendant"
  {:db/ident :lcc-lr/ExtinctLanguage,
   :dcterms/source "Section 3.24 and 4.7, ISO 639-4",
   :owl/disjointWith :lcc-lr/LivingLanguage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "extinct language",
   :rdfs/subClassOf :lcc-lr/Language,
   :skos/definition
   "an individual language or variant that is no longer in use and has no current descendant"})

(def HistoricalLanguage
  "a well-known prior version of a living or extinct language"
  {:db/ident :lcc-lr/HistoricalLanguage,
   :dcterms/source "Section 3.26 and 4.7, ISO 639-4",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "historical language",
   :rdfs/subClassOf :lcc-lr/Language,
   :skos/definition
   "a well-known prior version of a living or extinct language"})

(def IdentificationScheme
  "a system for allocating identifiers to objects"
  {:db/ident :lcc-lr/IdentificationScheme,
   :dcterms/source
   "ISO/IEC 11179-3 Information technology - Metadata registries (MDR) - Part 3: Registry metamodel and basic attributes, Third edition, 2013-02-15",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "identification scheme",
   :rdfs/subClassOf [{:owl/allValuesFrom :lcc-lr/Identifier,
                      :owl/onProperty    :lcc-lr/hasMember,
                      :rdf/type          :owl/Restriction}
                     :lcc-lr/Arrangement],
   :skos/definition "a system for allocating identifiers to objects"})

(def Identifier
  "a sequence of characters uniquely identifying something that it is associated with for some purpose and within a specified context"
  {:db/ident :lcc-lr/Identifier,
   :dcterms/source
   "ISO/IEC 11179-3 Information technology - Metadata registries (MDR) - Part 3: Registry metamodel and basic attributes, Third edition, 2013-02-15",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "identifier",
   :rdfs/subClassOf [{:owl/onProperty     :lcc-lr/hasTag,
                      :owl/someValuesFrom :xsd/string,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :lcc-lr/identifies,
                      :owl/someValuesFrom :owl/Thing,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :lcc-lr/IdentificationScheme,
                      :owl/onProperty :lcc-lr/isMemberOf,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "a sequence of characters uniquely identifying something that it is associated with for some purpose and within a specified context",
   :skos/note
   "Text-valued tags are included here as they may be useful for automated transformation or encoding systems, such as those used to produce IETF compliant language tags in XML."})

(def IndividualLanguage
  "a language that can be distinguished from another language by some set of rules"
  {:db/ident :lcc-lr/IndividualLanguage,
   :dcterms/source "Section 3.7, ISO 639-4",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "individual language",
   :rdfs/subClassOf :lcc-lr/Language,
   :skos/definition
   "a language that can be distinguished from another language by some set of rules",
   :skos/note
   "Identifiers in Parts 1, 2, and 3 of ISO 639 are assumed to denote distinct individual languages, unless the language name explicitly refers to a language group.  See section 4.2 in ISO 639-4 for a detailed explanation of the definition of individual language in the context of the ISO 639 standard."})

(def IndividualLanguageIdentifier
  "a language identifier whose scope is that of an individual (distinct) language"
  {:db/ident :lcc-lr/IndividualLanguageIdentifier,
   :dcterms/source "Section 3.7, ISO 639-3",
   :owl/disjointWith :lcc-lr/MacrolanguageIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "individual language identifier",
   :rdfs/subClassOf [{:owl/allValuesFrom :lcc-lr/IndividualLanguage,
                      :owl/onProperty    :lcc-lr/identifies,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :lcc-lr/IndividualLanguage,
                      :owl/onProperty    :lcc-lr/denotes,
                      :rdf/type          :owl/Restriction}
                     :lcc-lr/LanguageIdentifier],
   :skos/definition
   "a language identifier whose scope is that of an individual (distinct) language"})

(def Language
  "a systematic use of sounds, characters, symbols or signs to communicate meaning"
  {:db/ident :lcc-lr/Language,
   :dcterms/source "Section 3.6, ISO 639-4",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "language",
   :rdfs/subClassOf [{:owl/minCardinality 0,
                      :owl/onProperty     :lcc-lr/hasIndigenousName,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :lcc-lr/hasGermanName,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :lcc-lr/hasFrenchName,
                      :owl/someValuesFrom :rdfs/Literal,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :lcc-lr/hasEnglishName,
                      :owl/someValuesFrom :rdfs/Literal,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "a systematic use of sounds, characters, symbols or signs to communicate meaning"})

(def LanguageFamily
  "a group of individual languages related to each other through common ancestry"
  {:db/ident :lcc-lr/LanguageFamily,
   :dcterms/source "Section 3.11, ISO 639-4",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "language family",
   :rdfs/subClassOf :lcc-lr/LanguageGroup,
   :skos/definition
   "a group of individual languages related to each other through common ancestry"})

(def LanguageGroup
  "a collection of two or more individual languages, treated as a group for some purpose"
  {:db/ident :lcc-lr/LanguageGroup,
   :dcterms/source "Section 3.10, ISO 639-4",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "language group",
   :rdfs/subClassOf :lcc-lr/Collection,
   :skos/definition
   "a collection of two or more individual languages, treated as a group for some purpose",
   :skos/note
   "See section 4.6 in ISO 639-4 for additional explanatory material for language groups."})

(def LanguageIdentifier
  "a string of characters that uniquely identifies a linguistic entity"
  {:db/ident :lcc-lr/LanguageIdentifier,
   :dcterms/source "Section 3.5, ISO 639-4",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "language identifier",
   :rdfs/subClassOf [:lcc-lr/CodeElement
                     :lcc-lr/Identifier
                     {:owl/allValuesFrom :lcc-lr/Language,
                      :owl/onProperty    :lcc-lr/identifies,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :lcc-lr/Language,
                      :owl/onProperty    :lcc-lr/denotes,
                      :rdf/type          :owl/Restriction}],
   :skos/altLabel "language symbol",
   :skos/definition
   "a string of characters that uniquely identifies a linguistic entity",
   :skos/prefLabel "language identifier",
   :skos/scopeNote
   "In the language codes of Parts 1, 2, 3, and 5 of ISO 639, each language identifier is composed of two or three letters."})

(def LanguageVariant
  "a variation of an individual language that is sufficiently unique that it can be identified and named"
  {:db/ident :lcc-lr/LanguageVariant,
   :dcterms/source "Section 3.14, ISO 639-4",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "language variant",
   :rdfs/subClassOf :lcc-lr/IndividualLanguage,
   :skos/definition
   "a variation of an individual language that is sufficiently unique that it can be identified and named"})

(def LanguageVariation
  "continuous change within and between individual languages"
  {:db/ident :lcc-lr/LanguageVariation,
   :dcterms/source "Section 3.13, ISO 639-4",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "language variation",
   :skos/definition "continuous change within and between individual languages",
   :skos/note
   "Language variation may include change over time, space, cultural affiliation, etc."})

(def LivingLanguage
  "an individual language or variant in use today by some speech community"
  {:db/ident :lcc-lr/LivingLanguage,
   :dcterms/source "Section 3.23, ISO 639-4",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "living language",
   :rdfs/subClassOf :lcc-lr/Language,
   :skos/definition
   "an individual language or variant in use today by some speech community"})

(def Macrolanguage
  "a language that may be viewed in some circumstances as an individual language, but actually represents two or more individual languages"
  {:db/ident :lcc-lr/Macrolanguage,
   :dcterms/source "Section 3.9, ISO 639-4",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "macrolanguage",
   :rdfs/subClassOf :lcc-lr/Language,
   :skos/definition
   "a language that may be viewed in some circumstances as an individual language, but actually represents two or more individual languages",
   :skos/note
   "See sections 4.1 and 4.3 of ISO 639-4 for an extensive description of macrolanguages and how they are different from language groups."})

(def MacrolanguageIdentifier
  "a language identifier whose scope is that of a macrolanguage"
  {:db/ident :lcc-lr/MacrolanguageIdentifier,
   :dcterms/source "Section 3.7, ISO 639-3",
   :owl/disjointWith :lcc-lr/SpecialPurposeCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "macrolanguage identifier",
   :rdfs/subClassOf [{:owl/allValuesFrom :lcc-lr/Macrolanguage,
                      :owl/onProperty    :lcc-lr/identifies,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :lcc-lr/Macrolanguage,
                      :owl/onProperty    :lcc-lr/denotes,
                      :rdf/type          :owl/Restriction}
                     :lcc-lr/LanguageIdentifier],
   :skos/definition
   "a language identifier whose scope is that of a macrolanguage"})

(def NaturalLanguage
  "a language used in human communications that is not artificial in nature"
  {:db/ident :lcc-lr/NaturalLanguage,
   :dcterms/source "Section 3.27, ISO 639-4",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "natural language",
   :rdfs/subClassOf :lcc-lr/Language,
   :skos/definition
   "a language used in human communications that is not artificial in nature"})

(def Orthography
  "a set of conventions and rules for representing language in written form"
  {:db/ident :lcc-lr/Orthography,
   :dcterms/source "Section 3.27, ISO 639-4",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "orthography",
   :rdfs/subClassOf :lcc-lr/Collection,
   :skos/definition
   "a set of conventions and rules for representing language in written form",
   :skos/note
   "The orthographic rules for a given language may include rules of spelling, hyphenation, capitalization, word breaks, emphasis, and punctuation. Languages that have multiple writing systems may have distinct orthographies and scripts."})

(def RemainderGroup
  "a group of languages that explicitly excludes certain individual languages"
  {:db/ident :lcc-lr/RemainderGroup,
   :dcterms/source "Section 3.12, ISO 639-4",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "remainder group",
   :rdfs/subClassOf :lcc-lr/LanguageGroup,
   :skos/definition
   "a group of languages that explicitly excludes certain individual languages"})

(def Script
  "a set of graphic characters used to represent one or more languages in writing"
  {:db/ident :lcc-lr/Script,
   :dcterms/source "Section 3.17, ISO 639-4",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "script",
   :rdfs/subClassOf :lcc-lr/Collection,
   :skos/definition
   "a set of graphic characters used to represent one or more languages in writing",
   :skos/note
   "Use of multiple writing systems does not mean that multiple language identifiers are necessary for a language. ISO 639 language identifiers may be combined with script identifiers from ISO 15924 (e.g., BCP 47)."})

(def SpecialPurposeCode
  "a language identifier whose scope is that of a special purpose language construct"
  {:db/ident :lcc-lr/SpecialPurposeCode,
   :dcterms/source "Section 3.7, ISO 639-3",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "special purpose code",
   :rdfs/subClassOf [{:owl/allValuesFrom :lcc-lr/SpecialPurposeLanguageConcept,
                      :owl/onProperty    :lcc-lr/identifies,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :lcc-lr/SpecialPurposeLanguageConcept,
                      :owl/onProperty    :lcc-lr/denotes,
                      :rdf/type          :owl/Restriction}
                     :lcc-lr/LanguageIdentifier],
   :skos/definition
   "a language identifier whose scope is that of a special purpose language construct"})

(def SpecialPurposeLanguageConcept
  "a language concept introduced in ISO 639-3 to satisfy special-purpose requirements, typically to support application constraints"
  {:db/ident :lcc-lr/SpecialPurposeLanguageConcept,
   :dcterms/source "Section 4.2.6, ISO 639-3",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "special purpose language concept",
   :rdfs/subClassOf :lcc-lr/Language,
   :skos/definition
   "a language concept introduced in ISO 639-3 to satisfy special-purpose requirements, typically to support application constraints"})

(def SpokenLanguage
  "an individual language or language variant that is articulated through speech (oral or vocal) sounds"
  {:db/ident :lcc-lr/SpokenLanguage,
   :dcterms/source "Section 3.22, ISO 639-4",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "spoken language",
   :rdfs/subClassOf :lcc-lr/Language,
   :skos/definition
   "an individual language or language variant that is articulated through speech (oral or vocal) sounds"})

(def StandardVariant
  "a language variant with a high degree of status and normalization, typically used in public discourse, centers of government and commerce"
  {:db/ident :lcc-lr/StandardVariant,
   :dcterms/source "Section 3.15, ISO 639-4",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "standard variant",
   :rdfs/subClassOf :lcc-lr/LanguageVariant,
   :skos/definition
   "a language variant with a high degree of status and normalization, typically used in public discourse, centers of government and commerce"})

(def TerminologyCode
  "a language identifier whose scope is that of terminological codes"
  {:db/ident :lcc-lr/TerminologyCode,
   :dcterms/source "Section 3.7, ISO 639-3",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "terminology code",
   :rdfs/subClassOf [:lcc-lr/LanguageIdentifier :lcc-lr/Alpha3Code],
   :skos/definition
   "a language identifier whose scope is that of terminological codes"})

(def Transcription
  "the representation of speech or signing in written form"
  {:db/ident :lcc-lr/Transcription,
   :dcterms/source "Section 3.19, ISO 639-4",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "transcription",
   :skos/definition "the representation of speech or signing in written form",
   :skos/note "The resulting text is also referred to as a transcription."})

(def Transliteration
  "the conversion of text from one script to another without loss of information"
  {:db/ident :lcc-lr/Transliteration,
   :dcterms/source "Section 3.20, ISO 639-4",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "transliteration",
   :skos/definition
   "the conversion of text from one script to another without loss of information",
   :skos/note "The resulting text is also referred to as a transliteration."})

(def WritingSystem
  "a system for writing a language, including the requisite script and character set"
  {:db/ident :lcc-lr/WritingSystem,
   :dcterms/source "Section 3.16, ISO 639-4",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "writing system",
   :rdfs/subClassOf [{:owl/onProperty     :lcc-lr/has,
                      :owl/someValuesFrom :lcc-lr/Script,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :lcc-lr/has,
                      :owl/someValuesFrom :lcc-lr/Orthography,
                      :rdf/type           :owl/Restriction}
                     :lcc-lr/Arrangement],
   :skos/definition
   "a system for writing a language, including the requisite script and character set"})

(def WrittenLanguage
  "the representation of a language via a writing system, with a relatively normalized orthography"
  {:db/ident :lcc-lr/WrittenLanguage,
   :dcterms/source "Section 3.21, ISO 639-4",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "written language",
   :rdfs/subClassOf :lcc-lr/Language,
   :skos/definition
   "the representation of a language via a writing system, with a relatively normalized orthography"})

(def denotes
  "serves as a linguistic expression of the notion of, means"
  {:db/ident :lcc-lr/denotes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "denotes",
   :skos/definition
   "serves as a linguistic expression of the notion of, means"})

(def has
  "indicates that someone (or something) possesses something, such as a characteristic, attribute, feature, or capability"
  {:db/ident :lcc-lr/has,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "has",
   :skos/definition
   "indicates that someone (or something) possesses something, such as a characteristic, attribute, feature, or capability"})

(def hasDenotation
  "has meaning, expresses"
  {:db/ident :lcc-lr/hasDenotation,
   :owl/inverseOf :lcc-lr/denotes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "has denotation",
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition "has meaning, expresses"})

(def hasEarlierForm
  "relates a language to an earlier form (historically significant) of that same language"
  {:db/ident :lcc-lr/hasEarlierForm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :lcc-lr/Language,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "has earlier form",
   :rdfs/range :lcc-lr/Language,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition
   "relates a language to an earlier form (historically significant) of that same language"})

(def hasEnglishName
  "associates a name in English with an individual concept"
  {:db/ident :lcc-lr/hasEnglishName,
   :dcterms/source "Section 3.4, ISO 639-3",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "has English name",
   :rdfs/subPropertyOf :lcc-lr/hasName,
   :skos/definition "associates a name in English with an individual concept"})

(def hasFrenchName
  "associates a name in French with an individual concept"
  {:db/ident :lcc-lr/hasFrenchName,
   :dcterms/source "Section 3.4, ISO 639-3",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "has French name",
   :rdfs/subPropertyOf :lcc-lr/hasName,
   :skos/definition "associates a name in French with an individual concept"})

(def hasGermanName
  "associates a name in German with an individual concept"
  {:db/ident :lcc-lr/hasGermanName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "has German name",
   :rdfs/subPropertyOf :lcc-lr/hasName,
   :skos/definition "associates a name in German with an individual concept"})

(def hasIndigenousName
  "associates a local regional or cultural name with an individual concept"
  {:db/ident :lcc-lr/hasIndigenousName,
   :dcterms/source "Section 3.4, ISO 639-3",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "has indigenous name",
   :rdfs/subPropertyOf :lcc-lr/hasName,
   :skos/definition
   "associates a local regional or cultural name with an individual concept"})

(def hasMember
  "relates something, typically a collection, group or organization, to some discrete thing identified as a member of it"
  {:db/ident :lcc-lr/hasMember,
   :owl/inverseOf :lcc-lr/isMemberOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "has member",
   :skos/definition
   "relates something, typically a collection, group or organization, to some discrete thing identified as a member of it"})

(def hasName
  "associates a name, reference name, or appellation with an individual concept"
  {:db/ident :lcc-lr/hasName,
   :dcterms/source "Section 3.4, ISO 639-3",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "has name",
   :skos/definition
   "associates a name, reference name, or appellation with an individual concept",
   :skos/note
   "Note that the hasName properties defined herein have an implicit range of rdfs:Literal.  This is purposeful, so that users can specify any element that has a name with or without a language tag without concern for conflicting datatypes (i.e., xsd:string vs. rdf:langString, which are logically disjoint)."})

(def hasTag
  "a unique combination of alphanumeric characters corresponding to the identifier"
  {:db/ident :lcc-lr/hasTag,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "has tag",
   :rdfs/range :xsd/string,
   :skos/definition
   "a unique combination of alphanumeric characters corresponding to the identifier",
   :skos/note
   "Text-valued tags are included here as they may be useful for automated transformation or encoding systems, such as those used to produce IETF compliant language tags in XML."})

(def identifies
  "recognizes or establishes within some context"
  {:db/ident :lcc-lr/identifies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "identifies",
   :skos/definition "recognizes or establishes within some context"})

(def isIdentifiedBy
  "has an indicator or label, that is unique within some context"
  {:db/ident :lcc-lr/isIdentifiedBy,
   :owl/inverseOf :lcc-lr/identifies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "is identified by",
   :skos/definition
   "has an indicator or label, that is unique within some context"})

(def isMemberOf
  "belongs, either individually or collectively, to a group"
  {:db/ident :lcc-lr/isMemberOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :rdfs/label "is member of",
   :skos/definition "belongs, either individually or collectively, to a group"})