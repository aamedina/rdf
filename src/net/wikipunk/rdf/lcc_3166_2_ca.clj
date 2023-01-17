(ns net.wikipunk.rdf.lcc-3166-2-ca
  "ISO 3166-2 Subdivision Codes for Canada Ontology"
  {:dcat/downloadURL
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA.rdf",
   :dcterms/issued #inst "2021-10-29T23:57:18.465-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"],
   :owl/versionIRI
   "https://www.omg.org/spec/LCC/20211101/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-3166-2"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/",
    "lcc-3166-2-ca"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
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
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfa/prefix "lcc-3166-2-ca",
   :rdfa/uri
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label "ISO 3166-2 Subdivision Codes for Canada Ontology",
   :rdfs/seeAlso ["https://www.omg.org/spec/LCC/AboutLCC/"
                  "https://www.omg.org/spec/LCC/Countries/AboutCountries/"],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2015-2017 Unisys"
                  "Copyright (c) 2015-2021 Object Management Group, Inc."
                  "Copyright (c) 2021 agnos.ai UK Ltd."
                  "Copyright (c) 2015-2021 Thematix Partners LLC"
                  "Copyright (c) 2015-2020 Adaptive Inc."],
   :sm/dependsOn
   ["https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"],
   :sm/fileAbbreviation "lcc-3166-2-ca",
   :sm/fileAbstract
   "This ontology represents the subset of the ISO 3166 standard that includes the actual ISO 3166-2 subdivision codes for Canada, with the ontology and codes for the other parts of the standard represented in models that this ontology depends on.",
   :sm/filename "ISO3166-2-SubdivisionCodes-CA.rdf"})

(def Alberta
  {:db/ident   :lcc-3166-2-ca/Alberta,
   :owl/sameAs :lcc-3166-2-ca/CA-AB-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def BritishColumbia
  {:db/ident   :lcc-3166-2-ca/BritishColumbia,
   :owl/sameAs :lcc-3166-2-ca/CA-BC-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def CA-233-RegionKind
  "subdivision category territory in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-233-RegionKind,
   :rdf/type [:lcc-cr/GeographicRegionKind :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "territoire"}
                {:rdf/language "en",
                 :rdf/value    "territory"}],
   :skos/definition "subdivision category territory in the country of Canada"})

(def CA-412-RegionKind
  "subdivision category province in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-412-RegionKind,
   :rdf/type [:lcc-cr/GeographicRegionKind :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "province"}
                {:rdf/language "en",
                 :rdf/value    "province"}],
   :skos/definition "subdivision category province in the country of Canada"})

(def CA-AB
  {:db/ident   :lcc-3166-2-ca/CA-AB,
   :owl/sameAs :lcc-3166-2-ca/CA-AB-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CA-AB-RegionIdentifier
  "subdivision code for the province of Alberta in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-AB-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ca/CA-AB-Subdivision,
   :lcc-lr/hasTag "CA-AB",
   :lcc-lr/identifies :lcc-3166-2-ca/CA-AB-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type [:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label "CA-AB",
   :skos/definition
   "subdivision code for the province of Alberta in the country of Canada"})

(def CA-AB-Subdivision
  "the province of Alberta in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-AB-Subdivision,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Alberta"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Alberta"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ca/CA-412-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Canada,
   :rdf/type [:lcc-cr/CountrySubdivision :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Alberta"}
                {:rdf/language "en",
                 :rdf/value    "Alberta"}],
   :skos/definition "the province of Alberta in the country of Canada"})

(def CA-BC
  {:db/ident   :lcc-3166-2-ca/CA-BC,
   :owl/sameAs :lcc-3166-2-ca/CA-BC-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CA-BC-RegionIdentifier
  "subdivision code for the province of British Columbia in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-BC-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ca/CA-BC-Subdivision,
   :lcc-lr/hasTag "CA-BC",
   :lcc-lr/identifies :lcc-3166-2-ca/CA-BC-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type [:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label "CA-BC",
   :skos/definition
   "subdivision code for the province of British Columbia in the country of Canada"})

(def CA-BC-Subdivision
  "the province of British Columbia in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-BC-Subdivision,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "British Columbia"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Colombie-Britannique"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ca/CA-412-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Canada,
   :rdf/type [:owl/NamedIndividual :lcc-cr/CountrySubdivision],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "British Columbia"}
                {:rdf/language "fr",
                 :rdf/value    "Colombie-Britannique"}],
   :skos/definition
   "the province of British Columbia in the country of Canada"})

(def CA-MB
  {:db/ident   :lcc-3166-2-ca/CA-MB,
   :owl/sameAs :lcc-3166-2-ca/CA-MB-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CA-MB-RegionIdentifier
  "subdivision code for the province of Manitoba in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-MB-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ca/CA-MB-Subdivision,
   :lcc-lr/hasTag "CA-MB",
   :lcc-lr/identifies :lcc-3166-2-ca/CA-MB-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type [:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label "CA-MB",
   :skos/definition
   "subdivision code for the province of Manitoba in the country of Canada"})

(def CA-MB-Subdivision
  "the province of Manitoba in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-MB-Subdivision,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Manitoba"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Manitoba"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ca/CA-412-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Canada,
   :rdf/type [:owl/NamedIndividual :lcc-cr/CountrySubdivision],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Manitoba"}
                {:rdf/language "en",
                 :rdf/value    "Manitoba"}],
   :skos/definition "the province of Manitoba in the country of Canada"})

(def CA-NB
  {:db/ident   :lcc-3166-2-ca/CA-NB,
   :owl/sameAs :lcc-3166-2-ca/CA-NB-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CA-NB-RegionIdentifier
  "subdivision code for the province of New Brunswick in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-NB-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ca/CA-NB-Subdivision,
   :lcc-lr/hasTag "CA-NB",
   :lcc-lr/identifies :lcc-3166-2-ca/CA-NB-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type [:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label "CA-NB",
   :skos/definition
   "subdivision code for the province of New Brunswick in the country of Canada"})

(def CA-NB-Subdivision
  "the province of New Brunswick in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-NB-Subdivision,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "New Brunswick"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Nouveau-Brunswick"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ca/CA-412-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Canada,
   :rdf/type [:owl/NamedIndividual :lcc-cr/CountrySubdivision],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Nouveau-Brunswick"}
                {:rdf/language "en",
                 :rdf/value    "New Brunswick"}],
   :skos/definition "the province of New Brunswick in the country of Canada"})

(def CA-NL
  {:db/ident   :lcc-3166-2-ca/CA-NL,
   :owl/sameAs :lcc-3166-2-ca/CA-NL-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CA-NL-RegionIdentifier
  "subdivision code for the province of Newfoundland and Labrador in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-NL-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ca/CA-NL-Subdivision,
   :lcc-lr/hasTag "CA-NL",
   :lcc-lr/identifies :lcc-3166-2-ca/CA-NL-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type [:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label "CA-NL",
   :skos/definition
   "subdivision code for the province of Newfoundland and Labrador in the country of Canada"})

(def CA-NL-Subdivision
  "the province of Newfoundland and Labrador in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-NL-Subdivision,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Newfoundland and Labrador"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Terre-Neuve-et-Labrador"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ca/CA-412-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Canada,
   :rdf/type [:lcc-cr/CountrySubdivision :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Terre-Neuve-et-Labrador"}
                {:rdf/language "en",
                 :rdf/value    "Newfoundland and Labrador"}],
   :skos/definition
   "the province of Newfoundland and Labrador in the country of Canada"})

(def CA-NS
  {:db/ident   :lcc-3166-2-ca/CA-NS,
   :owl/sameAs :lcc-3166-2-ca/CA-NS-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CA-NS-RegionIdentifier
  "subdivision code for the province of Nova Scotia in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-NS-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ca/CA-NS-Subdivision,
   :lcc-lr/hasTag "CA-NS",
   :lcc-lr/identifies :lcc-3166-2-ca/CA-NS-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type [:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label "CA-NS",
   :skos/definition
   "subdivision code for the province of Nova Scotia in the country of Canada"})

(def CA-NS-Subdivision
  "the province of Nova Scotia in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-NS-Subdivision,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Nova Scotia"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Nouvelle-Écosse"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ca/CA-412-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Canada,
   :rdf/type [:lcc-cr/CountrySubdivision :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Nova Scotia"}
                {:rdf/language "fr",
                 :rdf/value    "Nouvelle-Écosse"}],
   :skos/definition "the province of Nova Scotia in the country of Canada"})

(def CA-NT
  {:db/ident   :lcc-3166-2-ca/CA-NT,
   :owl/sameAs :lcc-3166-2-ca/CA-NT-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CA-NT-RegionIdentifier
  "subdivision code for the territory of Northwest Territories in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-NT-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ca/CA-NT-Subdivision,
   :lcc-lr/hasTag "CA-NT",
   :lcc-lr/identifies :lcc-3166-2-ca/CA-NT-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type [:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label "CA-NT",
   :skos/definition
   "subdivision code for the territory of Northwest Territories in the country of Canada"})

(def CA-NT-Subdivision
  "the territory of Northwest Territories in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-NT-Subdivision,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Northwest Territories"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Territoires du Nord-Ouest"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ca/CA-233-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Canada,
   :rdf/type [:owl/NamedIndividual :lcc-cr/CountrySubdivision],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Northwest Territories"}
                {:rdf/language "fr",
                 :rdf/value    "Territoires du Nord-Ouest"}],
   :skos/definition
   "the territory of Northwest Territories in the country of Canada"})

(def CA-NU
  {:db/ident   :lcc-3166-2-ca/CA-NU,
   :owl/sameAs :lcc-3166-2-ca/CA-NU-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CA-NU-RegionIdentifier
  "subdivision code for the territory of Nunavut in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-NU-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ca/CA-NU-Subdivision,
   :lcc-lr/hasTag "CA-NU",
   :lcc-lr/identifies :lcc-3166-2-ca/CA-NU-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type [:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label "CA-NU",
   :skos/definition
   "subdivision code for the territory of Nunavut in the country of Canada"})

(def CA-NU-Subdivision
  "the territory of Nunavut in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-NU-Subdivision,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Nunavut"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Nunavut"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ca/CA-233-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Canada,
   :rdf/type [:owl/NamedIndividual :lcc-cr/CountrySubdivision],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Nunavut"}
                {:rdf/language "fr",
                 :rdf/value    "Nunavut"}],
   :skos/definition "the territory of Nunavut in the country of Canada"})

(def CA-ON
  {:db/ident   :lcc-3166-2-ca/CA-ON,
   :owl/sameAs :lcc-3166-2-ca/CA-ON-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CA-ON-RegionIdentifier
  "subdivision code for the province of Ontario in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-ON-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ca/CA-ON-Subdivision,
   :lcc-lr/hasTag "CA-ON",
   :lcc-lr/identifies :lcc-3166-2-ca/CA-ON-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type [:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label "CA-ON",
   :skos/definition
   "subdivision code for the province of Ontario in the country of Canada"})

(def CA-ON-Subdivision
  "the province of Ontario in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-ON-Subdivision,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Ontario"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Ontario"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ca/CA-412-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Canada,
   :rdf/type [:owl/NamedIndividual :lcc-cr/CountrySubdivision],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Ontario"}
                {:rdf/language "fr",
                 :rdf/value    "Ontario"}],
   :skos/definition "the province of Ontario in the country of Canada"})

(def CA-PE
  {:db/ident   :lcc-3166-2-ca/CA-PE,
   :owl/sameAs :lcc-3166-2-ca/CA-PE-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CA-PE-RegionIdentifier
  "subdivision code for the province of Prince Edward Island in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-PE-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ca/CA-PE-Subdivision,
   :lcc-lr/hasTag "CA-PE",
   :lcc-lr/identifies :lcc-3166-2-ca/CA-PE-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type [:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label "CA-PE",
   :skos/definition
   "subdivision code for the province of Prince Edward Island in the country of Canada"})

(def CA-PE-Subdivision
  "the province of Prince Edward Island in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-PE-Subdivision,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Prince Edward Island"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Île-du-Prince-Édouard"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ca/CA-412-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Canada,
   :rdf/type [:owl/NamedIndividual :lcc-cr/CountrySubdivision],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Île-du-Prince-Édouard"}
                {:rdf/language "en",
                 :rdf/value    "Prince Edward Island"}],
   :skos/definition
   "the province of Prince Edward Island in the country of Canada"})

(def CA-QC
  {:db/ident   :lcc-3166-2-ca/CA-QC,
   :owl/sameAs :lcc-3166-2-ca/CA-QC-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CA-QC-RegionIdentifier
  "subdivision code for the province of Quebec in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-QC-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ca/CA-QC-Subdivision,
   :lcc-lr/hasTag "CA-QC",
   :lcc-lr/identifies :lcc-3166-2-ca/CA-QC-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type [:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label "CA-QC",
   :skos/definition
   "subdivision code for the province of Quebec in the country of Canada"})

(def CA-QC-Subdivision
  "the province of Quebec in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-QC-Subdivision,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Quebec"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Québec"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ca/CA-412-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Canada,
   :rdf/type [:lcc-cr/CountrySubdivision :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Québec"}
                {:rdf/language "en",
                 :rdf/value    "Quebec"}],
   :skos/definition "the province of Quebec in the country of Canada"})

(def CA-SK
  {:db/ident   :lcc-3166-2-ca/CA-SK,
   :owl/sameAs :lcc-3166-2-ca/CA-SK-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CA-SK-RegionIdentifier
  "subdivision code for the province of Saskatchewan in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-SK-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ca/CA-SK-Subdivision,
   :lcc-lr/hasTag "CA-SK",
   :lcc-lr/identifies :lcc-3166-2-ca/CA-SK-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type [:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label "CA-SK",
   :skos/definition
   "subdivision code for the province of Saskatchewan in the country of Canada"})

(def CA-SK-Subdivision
  "the province of Saskatchewan in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-SK-Subdivision,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Saskatchewan"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Saskatchewan"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ca/CA-412-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Canada,
   :rdf/type [:owl/NamedIndividual :lcc-cr/CountrySubdivision],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Saskatchewan"}
                {:rdf/language "fr",
                 :rdf/value    "Saskatchewan"}],
   :skos/definition "the province of Saskatchewan in the country of Canada"})

(def CA-YT
  {:db/ident   :lcc-3166-2-ca/CA-YT,
   :owl/sameAs :lcc-3166-2-ca/CA-YT-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CA-YT-RegionIdentifier
  "subdivision code for the territory of Yukon in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-YT-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ca/CA-YT-Subdivision,
   :lcc-lr/hasTag "CA-YT",
   :lcc-lr/identifies :lcc-3166-2-ca/CA-YT-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type [:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label "CA-YT",
   :skos/definition
   "subdivision code for the territory of Yukon in the country of Canada"})

(def CA-YT-Subdivision
  "the territory of Yukon in the country of Canada"
  {:db/ident :lcc-3166-2-ca/CA-YT-Subdivision,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Yukon"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Yukon"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ca/CA-233-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Canada,
   :rdf/type [:lcc-cr/CountrySubdivision :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
   :rdfs/label [{:rdf/language "fr",
                 :rdf/value    "Yukon"}
                {:rdf/language "en",
                 :rdf/value    "Yukon"}],
   :skos/definition "the territory of Yukon in the country of Canada"})

(def Manitoba
  {:db/ident   :lcc-3166-2-ca/Manitoba,
   :owl/sameAs :lcc-3166-2-ca/CA-MB-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def NewBrunswick
  {:db/ident   :lcc-3166-2-ca/NewBrunswick,
   :owl/sameAs :lcc-3166-2-ca/CA-NB-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def NewfoundlandAndLabrador
  {:db/ident   :lcc-3166-2-ca/NewfoundlandAndLabrador,
   :owl/sameAs :lcc-3166-2-ca/CA-NL-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def NorthwestTerritories
  {:db/ident   :lcc-3166-2-ca/NorthwestTerritories,
   :owl/sameAs :lcc-3166-2-ca/CA-NT-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def NovaScotia
  {:db/ident   :lcc-3166-2-ca/NovaScotia,
   :owl/sameAs :lcc-3166-2-ca/CA-NS-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Nunavut
  {:db/ident   :lcc-3166-2-ca/Nunavut,
   :owl/sameAs :lcc-3166-2-ca/CA-NU-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Ontario
  {:db/ident   :lcc-3166-2-ca/Ontario,
   :owl/sameAs :lcc-3166-2-ca/CA-ON-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def PrinceEdwardIsland
  {:db/ident   :lcc-3166-2-ca/PrinceEdwardIsland,
   :owl/sameAs :lcc-3166-2-ca/CA-PE-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Province
  {:db/ident   :lcc-3166-2-ca/Province,
   :owl/sameAs :lcc-3166-2-ca/CA-412-RegionKind,
   :rdf/type   :owl/NamedIndividual})

(def Quebec
  {:db/ident   :lcc-3166-2-ca/Quebec,
   :owl/sameAs :lcc-3166-2-ca/CA-QC-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Saskatchewan
  {:db/ident   :lcc-3166-2-ca/Saskatchewan,
   :owl/sameAs :lcc-3166-2-ca/CA-SK-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Territory
  {:db/ident   :lcc-3166-2-ca/Territory,
   :owl/sameAs :lcc-3166-2-ca/CA-233-RegionKind,
   :rdf/type   :owl/NamedIndividual})

(def Yukon
  {:db/ident   :lcc-3166-2-ca/Yukon,
   :owl/sameAs :lcc-3166-2-ca/CA-YT-Subdivision,
   :rdf/type   :owl/NamedIndividual})