(ns net.wikipunk.rdf.lcc-3166-2
  "ISO 3166-2 Subdivision Codes Ontology"
  {:dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"],
   :owl/versionIRI
   "https://www.omg.org/spec/LCC/20211101/Countries/ISO3166-2-SubdivisionCodes/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-3166-2"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/",
   :rdfa/prefix "lcc-3166-2",
   :rdfa/uri
   "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/",
   :rdfs/label "ISO 3166-2 Subdivision Codes Ontology",
   :rdfs/seeAlso ["https://www.omg.org/spec/LCC/AboutLCC/"
                  "https://www.omg.org/spec/LCC/Countries/AboutCountries/"],
   :skos/changeNote
   "The http://www.omg.org/spec/LCC/20151101/Countries/ISO3166-2-SubdivisionCodes/ version of this ontology was modified per the resolutions included in the LCC 1.0 FTF report. The subdivision codes and related metadata contained herein are current as of the July 2017 revision to the online code set.",
   :sm/contentLanguage ["http://www.w3.org/standards/techs/owl#w3c_all"
                        "http://www.omg.org/spec/ODM/"],
   :sm/copyright ["Copyright (c) 2015-2020 Adaptive Inc."
                  "Copyright (c) 2021 agnos.ai UK Ltd."
                  "Copyright (c) 2015-2021 Object Management Group, Inc."
                  "Copyright (c) 2015-2017 Unisys"
                  "Copyright (c) 2015-2021 Thematix Partners LLC"],
   :sm/dependsOn
   ["https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"],
   :sm/fileAbbreviation "lcc-3166-2",
   :sm/fileAbstract
   "This ontology defines the code set relevant to representation of subdivisions of countries, as required to support the ISO 3166-2 subdivision codes. The codes for each country are defined by country in subordinate, regional ontologies.",
   :sm/filename "ISO3166-2-SubdivisionCodes.rdf"})

(def ISO3166-2-CodeSet
  "the set of subdivision identifiers that comprise the ISO 3166-2 specification"
  {:db/ident :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type
   [:lcc-lr/IdentificationScheme :lcc-lr/CodeSet :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/",
   :rdfs/label "ISO 3166-2 code set",
   :skos/definition
   "the set of subdivision identifiers that comprise the ISO 3166-2 specification"})

(def Territory
  "a kind of region that is a territory"
  {:db/ident :lcc-3166-2/Territory,
   :rdf/type [:lcc-cr/GeographicRegionKind :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/",
   :rdfs/label "territory",
   :skos/definition "a kind of region that is a territory"})