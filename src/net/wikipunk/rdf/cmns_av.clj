(ns net.wikipunk.rdf.cmns-av
  "The Annotation Vocabulary provides commonly used annotation properties for documentation to facilitate understanding."
  {:cmns-av/copyright ["Copyright (c) 2022 Object Management Group, Inc."
                       "Copyright (c) 2022 EDM Council, Inc."],
   :dcterms/abstract
   "The Annotation Vocabulary provides commonly used annotation properties for documentation to facilitate understanding.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/references ["http://www.w3.org/2004/02/skos/core#"
                        "http://purl.org/dc/terms/"],
   :dcterms/title "Commons Annotation Vocabulary",
   :owl/versionIRI
   "https://www.omg.org/spec/Commons/20220501/AnnotationVocabulary/",
   :rdf/ns-prefix-map {"cmns-av"
                       "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
   :rdfa/prefix "cmns-av",
   :rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
   :rdfs/label "Annotation Vocabulary",
   :skos/note
   ["Note that any of the annotation properties provided in Dublin Core can be used in addition to those declared herein. However, Dublin Core terms that are not explicitly defined herein must be declared explicitly as annotation properties in the ontologies that use them."
    "The annotation properties defined below are derived from similar annotation vocabularies used in (1) the Object Management Group (OMG) specification metadata - see http://www.omg.org/techprocess/ab/SpecificationMetadata/, (2) annotations used in the Financial Industry Business Ontology (FIBO) - see https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/, and (3) other ontology efforts such as the NIST-sponsored Industrial Ontology Foundation (IOF)."]}
  (:refer-clojure :exclude [symbol]))

(def abbreviation
  "designation formed by omitting parts from the full form of a term that denotes the same concept"
  {:cmns-av/adaptedFrom
   ["ISO 31-0 Quantities and units - General principles"
    "ISO 1087 Terminology work and terminology science - Vocabulary, Second edition, 2019-09"],
   :cmns-av/explanatoryNote
   "The symbols for quantities are generally single letters of the Latin or Greek alphabet, sometimes with subscripts or other modifying signs. These letters, including those that are members of the Greek alphabet are not symbols for the purposes of this ontology, however, they are abbreviations. Expressions of chemical formulae may, however, include a combination of abbreviations and symbols, as needed to define a given quantity.",
   :db/ident :cmns-av/abbreviation,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "abbreviation",
   :rdfs/subPropertyOf :cmns-av/synonym,
   :skos/definition
   "designation formed by omitting parts from the full form of a term that denotes the same concept",
   :skos/example "Chemical Symbols: H, O, Mg; Units of Measure: Km, Kg, G",
   :skos/note
   "Abbreviations can be created by removing individual words, or can be acronyms, initialisms, or clipped terms."})

(def acronym
  "abbreviation that is made up of the initial letters of the components of the full form of a term or proper name or from syllables of the full form"
  {:cmns-av/adaptedFrom
   "ISO 1087 Terminology work and terminology science - Vocabulary, Second edition, 2019-09",
   :db/ident :cmns-av/acronym,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "acronym",
   :rdfs/subPropertyOf :cmns-av/abbreviation,
   :skos/definition
   "abbreviation that is made up of the initial letters of the components of the full form of a term or proper name or from syllables of the full form",
   :skos/example "Examples of acronyms are: laser, ISO, GATT, UNESCO, UNICEF",
   :skos/note
   "Acronyms are frequently pronounced syllabically. It may be useful to use this property for generation of acronym lists."})

(def adaptedFrom
  "document or other source from which a given term (or its definition) was adapted (i.e., is compatible with but not quoted); the range for this annotation can be a string, URI, or citation"
  {:cmns-av/usageNote
   "This annotation should be used to indicate that a reference was used, for example, as input to the development of a definition or term but would not be considered infringing on a copyright.",
   :db/ident :cmns-av/adaptedFrom,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "adapted from",
   :rdfs/subPropertyOf :dcterms/source,
   :skos/definition
   "document or other source from which a given term (or its definition) was adapted (i.e., is compatible with but not quoted); the range for this annotation can be a string, URI, or citation"})

(def copyright
  "exclusive legal right, given to an originator or an assignee to print, publish, perform, film, or record literary, artistic, or musical material, and to authorize others to do the same"
  {:cmns-av/usageNote
   "This annotation is typically used to describe an artifact such as a controlled vocabulary, ontology, or other similar resource.",
   :db/ident :cmns-av/copyright,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "copyright",
   :rdfs/subPropertyOf :dcterms/rights,
   :skos/definition
   "exclusive legal right, given to an originator or an assignee to print, publish, perform, film, or record literary, artistic, or musical material, and to authorize others to do the same"})

(def directSource
  "quoted reference for the subject resource; the range for this annotation can be a string, URI, or bibliographic citation"
  {:db/ident :cmns-av/directSource,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "direct source",
   :rdfs/subPropertyOf :dcterms/source,
   :skos/definition
   "quoted reference for the subject resource; the range for this annotation can be a string, URI, or bibliographic citation"})

(def explanatoryNote
  "note that provides additional explanatory material for a resource"
  {:db/ident :cmns-av/explanatoryNote,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "explanatory note",
   :rdfs/subPropertyOf :skos/note,
   :skos/definition
   "note that provides additional explanatory material for a resource"})

(def logicalDefinition
  "definition in the form of a formal expression, such as the mathematical or logic representation, for the resource"
  {:db/ident :cmns-av/logicalDefinition,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "logical definition",
   :rdfs/subPropertyOf :skos/definition,
   :skos/definition
   "definition in the form of a formal expression, such as the mathematical or logic representation, for the resource"})

(def symbol
  "abbreviation that is a design or mark, or other non-alpha-numeric character(s) conventionally used to represent something, such as a currency or mathematical sign or operator"
  {:db/ident :cmns-av/symbol,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "symbol",
   :rdfs/subPropertyOf :cmns-av/synonym,
   :skos/definition
   "abbreviation that is a design or mark, or other non-alpha-numeric character(s) conventionally used to represent something, such as a currency or mathematical sign or operator"})

(def synonym
  "designation that can be substituted for the primary representation of something"
  {:cmns-av/adaptedFrom
   "ISO 1087 Terminology work and terminology science - Vocabulary, Second edition, 2019-09",
   :db/ident :cmns-av/synonym,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "synonym",
   :rdfs/subPropertyOf :skos/altLabel,
   :skos/definition
   "designation that can be substituted for the primary representation of something"})

(def usageNote
  "note that provides information about how a given resource is used or may be extended"
  {:db/ident :cmns-av/usageNote,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "usage note",
   :rdfs/subPropertyOf :skos/note,
   :skos/definition
   "note that provides information about how a given resource is used or may be extended"})