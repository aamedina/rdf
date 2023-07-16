(ns net.wikipunk.rdf.dpvo-legal
  "DPV-LEGAL is an extension to the Data Privacy Vocabulary that provides additional terms related to Jurisdictions, Laws, and Authorities."
  {:dcat/downloadURL "resources/dpv-owl/dpv-legal/dpv-legal.ttl",
   :dcterms/abstract
   #xsd/langString
    "DPV-LEGAL is an extension to the Data Privacy Vocabulary that provides additional terms related to Jurisdictions, Laws, and Authorities.@en",
   :dcterms/contributor ["Harshvardhan J. Pandit" "Julian Flake"],
   :dcterms/created #xsd/date #inst "2022-04-02T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #xsd/langString
    "DPV-PD is an extension to the Data Privacy Vocabulary that provides additional terms related to Jurisdictions, Laws, and Authorities.@en",
   :dcterms/license {:rdfa/uri
                     "https://www.w3.org/Consortium/Legal/2015/doc-license"},
   :dcterms/modified #xsd/date #inst "2022-10-06T00:00:00.000-04:00",
   :dcterms/source {:rdfa/uri "https://www.w3.org/community/dpvcg/"},
   :dcterms/title
   #xsd/langString
    "DPV-LEGAL: Extension providing Jurisdictions, Laws, and Authorities for DPV@en",
   :owl/imports {:rdfa/uri "https://w3id.org/dpv/dpv-owl"},
   :owl/versionInfo "0.8.2",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "dpvo" "https://w3id.org/dpv/dpv-owl#",
                       "dpvo-gdpr" "https://w3id.org/dpv/dpv-owl/dpv-gdpr#",
                       "dpvo-legal" "https://w3id.org/dpv/dpv-owl/dpv-legal#",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "time" "http://www.w3.org/2006/time#",
                       "vann" "http://purl.org/vocab/vann/",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "dpvo-legal",
   :rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal",
   :vann/preferredNamespacePrefix "dpvo-legal",
   :vann/preferredNamespaceUri "https://w3id.org/dpv/dpv-owl/dpv-legal#"})

(def AD
  "AD"
  {:db/ident               :dpvo-legal/AD,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SouthernEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "AD",
   :dpvo-legal/iso_alpha3  "AND",
   :dpvo-legal/iso_numeric "20",
   :dpvo-legal/un_m49      "20",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Andorra@en",
   :skos/altLabel          ["AD" "AND" "20"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def AE
  "AE"
  {:db/ident               :dpvo-legal/AE,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/WesternAsia],
   :dpvo-legal/iso_alpha2  "AE",
   :dpvo-legal/iso_alpha3  "ARE",
   :dpvo-legal/iso_numeric "784",
   :dpvo-legal/un_m49      "784",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "United Arab Emirates@en",
   :skos/altLabel          ["AE" "ARE" "784"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def AF
  "AF"
  {:db/ident               :dpvo-legal/AF,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SouthernAsia :dpvo-legal/Asia],
   :dpvo-legal/iso_alpha2  "AF",
   :dpvo-legal/iso_alpha3  "AFG",
   :dpvo-legal/iso_numeric "4",
   :dpvo-legal/un_m49      "4",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Afghanistan@en",
   :skos/altLabel          ["AF" "AFG" "4"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def AG
  "AG"
  {:db/ident               :dpvo-legal/AG,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Caribbean
                            :dpvo-legal/Americas],
   :dpvo-legal/iso_alpha2  "AG",
   :dpvo-legal/iso_alpha3  "ATG",
   :dpvo-legal/iso_numeric "28",
   :dpvo-legal/un_m49      "28",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Antigua and Barbuda@en",
   :skos/altLabel          ["AG" "ATG" "28"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def AI
  "AI"
  {:db/ident               :dpvo-legal/AI,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Caribbean
                            :dpvo-legal/Americas],
   :dpvo-legal/iso_alpha2  "AI",
   :dpvo-legal/iso_alpha3  "AIA",
   :dpvo-legal/iso_numeric "660",
   :dpvo-legal/un_m49      "660",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Anguilla@en",
   :skos/altLabel          ["AI" "AIA" "660"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def AL
  "AL"
  {:db/ident               :dpvo-legal/AL,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SouthernEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "AL",
   :dpvo-legal/iso_alpha3  "ALB",
   :dpvo-legal/iso_numeric "8",
   :dpvo-legal/un_m49      "8",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Albania@en",
   :skos/altLabel          ["AL" "ALB" "8"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def AM
  "AM"
  {:db/ident               :dpvo-legal/AM,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/WesternAsia],
   :dpvo-legal/iso_alpha2  "AM",
   :dpvo-legal/iso_alpha3  "ARM",
   :dpvo-legal/iso_numeric "51",
   :dpvo-legal/un_m49      "51",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Armenia@en",
   :skos/altLabel          ["AM" "ARM" "51"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def AO
  "AO"
  {:db/ident               :dpvo-legal/AO,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/MiddleAfrica
                            :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica],
   :dpvo-legal/iso_alpha2  "AO",
   :dpvo-legal/iso_alpha3  "AGO",
   :dpvo-legal/iso_numeric "24",
   :dpvo-legal/un_m49      "24",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Angola@en",
   :skos/altLabel          ["AO" "AGO" "24"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def AQ
  "AQ"
  {:db/ident              :dpvo-legal/AQ,
   :dcterms/created       #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator       {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo-legal/iso_alpha2 "AQ",
   :dpvo-legal/iso_alpha3 "ATA",
   :dpvo-legal/iso_numeric "10",
   :dpvo-legal/un_m49     "10",
   :rdf/type              [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy      {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            #xsd/langString "Antarctica@en",
   :skos/altLabel         ["AQ" "ATA" "10"],
   :vs/term_status        #xsd/langString "accepted@en"})

(def AR
  "AR"
  {:db/ident               :dpvo-legal/AR,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/SouthAmerica
                            :dpvo-legal/Americas],
   :dpvo-legal/iso_alpha2  "AR",
   :dpvo-legal/iso_alpha3  "ARG",
   :dpvo-legal/iso_numeric "32",
   :dpvo-legal/un_m49      "32",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Argentina@en",
   :skos/altLabel          ["AR" "ARG" "32"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def AS
  "AS"
  {:db/ident               :dpvo-legal/AS,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Polynesia :dpvo-legal/Oceania],
   :dpvo-legal/iso_alpha2  "AS",
   :dpvo-legal/iso_alpha3  "ASM",
   :dpvo-legal/iso_numeric "16",
   :dpvo-legal/un_m49      "16",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "American Samoa@en",
   :skos/altLabel          ["AS" "ASM" "16"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def AT
  "AT"
  {:db/ident               :dpvo-legal/AT,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EEA
                            :dpvo-legal/EU28
                            :dpvo-legal/EU27
                            :dpvo-legal/EU
                            :dpvo-legal/EEA31
                            :dpvo-legal/EEA30],
   :dcterms/isPartOf       [:dpvo-legal/WesternEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "AT",
   :dpvo-legal/iso_alpha3  "AUT",
   :dpvo-legal/iso_numeric "40",
   :dpvo-legal/un_m49      "40",
   :dpvo/hasAuthority      :dpvo-legal/DPA-AT,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Austria@en",
   :skos/altLabel          ["AT" "AUT" "40"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def AU
  "AU"
  {:db/ident               :dpvo-legal/AU,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Oceania
                            :dpvo-legal/AustraliaandNewZealand],
   :dpvo-legal/iso_alpha2  "AU",
   :dpvo-legal/iso_alpha3  "AUS",
   :dpvo-legal/iso_numeric "36",
   :dpvo-legal/un_m49      "36",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Australia@en",
   :skos/altLabel          ["AU" "AUS" "36"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def AW
  "AW"
  {:db/ident               :dpvo-legal/AW,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Caribbean
                            :dpvo-legal/Americas],
   :dpvo-legal/iso_alpha2  "AW",
   :dpvo-legal/iso_alpha3  "ABW",
   :dpvo-legal/iso_numeric "533",
   :dpvo-legal/un_m49      "533",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Aruba@en",
   :skos/altLabel          ["AW" "ABW" "533"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def AX
  "AX"
  {:db/ident               :dpvo-legal/AX,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Europe :dpvo-legal/NorthernEurope],
   :dpvo-legal/iso_alpha2  "AX",
   :dpvo-legal/iso_alpha3  "ALA",
   :dpvo-legal/iso_numeric "248",
   :dpvo-legal/un_m49      "248",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Åland Islands@en",
   :skos/altLabel          ["AX" "ALA" "248"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def AZ
  "AZ"
  {:db/ident               :dpvo-legal/AZ,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/WesternAsia],
   :dpvo-legal/iso_alpha2  "AZ",
   :dpvo-legal/iso_alpha3  "AZE",
   :dpvo-legal/iso_numeric "31",
   :dpvo-legal/un_m49      "31",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Azerbaijan@en",
   :skos/altLabel          ["AZ" "AZE" "31"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def Adequacy-EU-AD
  "EU Adequacy Decision for Andorra"
  {:db/ident :dpvo-legal/Adequacy-EU-AD,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #xsd/date
                                        #inst "2010-10-21T00:00:00.000-04:00"}},
   :dpvo/hasJurisdiction [:dpvo-legal/AD :dpvo-legal/EU],
   :foaf/homepage
   {:rdfa/uri
    "https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32010D0625?"},
   :rdf/type [:owl/NamedIndividual :dpvo-gdpr/A45-3 :dpvo/Law],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString "EU Adequacy Decision for Andorra@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def Adequacy-EU-AR
  "EU Adequacy Decision for Argentina"
  {:db/ident :dpvo-legal/Adequacy-EU-AR,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #xsd/date
                                        #inst "2003-07-05T00:00:00.000-04:00"}},
   :dpvo/hasJurisdiction [:dpvo-legal/EU :dpvo-legal/AR],
   :foaf/homepage
   {:rdfa/uri
    "https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32003D0490"},
   :rdf/type [:owl/NamedIndividual :dpvo-gdpr/A45-3 :dpvo/Law],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString "EU Adequacy Decision for Argentina@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def Adequacy-EU-CA
  "EU Adequacy Decision for Canada (commercial organisations)"
  {:db/ident :dpvo-legal/Adequacy-EU-CA,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #xsd/date
                                        #inst "2002-01-04T00:00:00.000-05:00"}},
   :dpvo/hasJurisdiction [:dpvo-legal/CA :dpvo-legal/EU],
   :foaf/homepage
   {:rdfa/uri
    "https://eur-lex.europa.eu/legal-content/en/TXT/?uri=CELEX%3A32002D0002"},
   :rdf/type [:dpvo-gdpr/A45-3 :dpvo/Law :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString
                "EU Adequacy Decision for Canada (commercial organisations)@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def Adequacy-EU-CH
  "EU Adequacy Decision for Switzerland"
  {:db/ident :dpvo-legal/Adequacy-EU-CH,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #xsd/date
                                        #inst "2000-08-25T00:00:00.000-04:00"}},
   :dpvo/hasJurisdiction [:dpvo-legal/EU :dpvo-legal/CH],
   :foaf/homepage
   {:rdfa/uri
    "https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32000D0518"},
   :rdf/type [:dpvo/Law :dpvo-gdpr/A45-3 :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString "EU Adequacy Decision for Switzerland@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def Adequacy-EU-FO
  "EU Adequacy Decision for Faroe Islands"
  {:db/ident :dpvo-legal/Adequacy-EU-FO,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #xsd/date
                                        #inst "2010-03-09T00:00:00.000-05:00"}},
   :dpvo/hasJurisdiction [:dpvo-legal/FO :dpvo-legal/EU],
   :foaf/homepage
   {:rdfa/uri
    "https://eur-lex.europa.eu/legal-content/en/ALL/?uri=CELEX%3A32010D0146"},
   :rdf/type [:dpvo/Law :dpvo-gdpr/A45-3 :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString "EU Adequacy Decision for Faroe Islands@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def Adequacy-EU-GB
  "EU Adequacy Decision for United Kingdom"
  {:db/ident :dpvo-legal/Adequacy-EU-GB,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #xsd/date
                                        #inst "2021-06-28T00:00:00.000-04:00"}},
   :dpvo/hasJurisdiction [:dpvo-legal/GB :dpvo-legal/EU],
   :foaf/homepage
   {:rdfa/uri
    "https://ec.europa.eu/info/files/decision-adequate-protection-personal-data-united-kingdom-general-data-protection-regulation_en"},
   :rdf/type [:dpvo-gdpr/A45-3 :dpvo/Law :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString "EU Adequacy Decision for United Kingdom@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def Adequacy-EU-GG
  "EU Adequacy Decision for Guernsey"
  {:db/ident :dpvo-legal/Adequacy-EU-GG,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #xsd/date
                                        #inst "2003-11-21T00:00:00.000-05:00"}},
   :dpvo/hasJurisdiction [:dpvo-legal/EU :dpvo-legal/GG],
   :foaf/homepage
   {:rdfa/uri
    "https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32003D0821"},
   :rdf/type [:dpvo/Law :owl/NamedIndividual :dpvo-gdpr/A45-3],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString "EU Adequacy Decision for Guernsey@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def Adequacy-EU-IL
  "EU Adequacy Decision for Israel"
  {:db/ident :dpvo-legal/Adequacy-EU-IL,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #xsd/date
                                        #inst "2011-02-01T00:00:00.000-05:00"}},
   :dpvo/hasJurisdiction [:dpvo-legal/EU :dpvo-legal/IL],
   :foaf/homepage
   {:rdfa/uri
    "https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32011D0061"},
   :rdf/type [:dpvo/Law :dpvo-gdpr/A45-3 :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString "EU Adequacy Decision for Israel@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def Adequacy-EU-IM
  "EU Adequacy Decision for Isle of Man"
  {:db/ident :dpvo-legal/Adequacy-EU-IM,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #xsd/date
                                        #inst "2004-04-30T00:00:00.000-04:00"}},
   :dpvo/hasJurisdiction [:dpvo-legal/EU :dpvo-legal/IM],
   :foaf/homepage
   {:rdfa/uri
    "https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32004D0411"},
   :rdf/type [:dpvo-gdpr/A45-3 :dpvo/Law :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString "EU Adequacy Decision for Isle of Man@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def Adequacy-EU-JE
  "EU Adequacy Decision for Jersey"
  {:db/ident :dpvo-legal/Adequacy-EU-JE,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #xsd/date
                                        #inst "2008-05-26T00:00:00.000-04:00"}},
   :dpvo/hasJurisdiction [:dpvo-legal/EU :dpvo-legal/JE],
   :foaf/homepage
   {:rdfa/uri
    "https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32008D0393"},
   :rdf/type [:dpvo/Law :owl/NamedIndividual :dpvo-gdpr/A45-3],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString "EU Adequacy Decision for Jersey@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def Adequacy-EU-JP
  "EU Adequacy Decision for Japan"
  {:db/ident             :dpvo-legal/Adequacy-EU-JP,
   :dcterms/created      #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator      {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/temporal     {:rdf/type :time/ProperInterval,
                          :time/hasBeginning
                          {:time/inXSDDate #xsd/date
                                            #inst
                                             "2019-01-23T00:00:00.000-05:00"}},
   :dpvo/hasJurisdiction [:dpvo-legal/JP :dpvo-legal/EU],
   :foaf/homepage        {:rdfa/uri
                          "http://data.europa.eu/eli/dec_impl/2019/419/oj"},
   :rdf/type             [:dpvo/Law :owl/NamedIndividual :dpvo-gdpr/A45-3],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString "EU Adequacy Decision for Japan@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def Adequacy-EU-NZ
  "EU Adequacy Decision for New Zealand"
  {:db/ident :dpvo-legal/Adequacy-EU-NZ,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #xsd/date
                                        #inst "2012-12-20T00:00:00.000-05:00"}},
   :dpvo/hasJurisdiction [:dpvo-legal/EU :dpvo-legal/NZ],
   :foaf/homepage
   {:rdfa/uri
    "https://eur-lex.europa.eu/legal-content/EN/ALL/?uri=CELEX%3A32013D0065"},
   :rdf/type [:dpvo-gdpr/A45-3 :dpvo/Law :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString "EU Adequacy Decision for New Zealand@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def Adequacy-EU-UY
  "EU Adequacy Decision for Uruguay"
  {:db/ident :dpvo-legal/Adequacy-EU-UY,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #xsd/date
                                        #inst "2012-08-22T00:00:00.000-04:00"}},
   :dpvo/hasJurisdiction [:dpvo-legal/EU :dpvo-legal/UY],
   :foaf/homepage
   {:rdfa/uri
    "https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32012D0484"},
   :rdf/type [:owl/NamedIndividual :dpvo/Law :dpvo-gdpr/A45-3],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString "EU Adequacy Decision for Uruguay@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def Africa
  "Africa"
  {:db/ident         :dpvo-legal/Africa,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/SN
                      :dpvo-legal/SubSaharanAfrica
                      :dpvo-legal/ET
                      :dpvo-legal/SL
                      :dpvo-legal/ZM
                      :dpvo-legal/GQ
                      :dpvo-legal/CM
                      :dpvo-legal/ML
                      :dpvo-legal/LR
                      :dpvo-legal/SZ
                      :dpvo-legal/SC
                      :dpvo-legal/DZ
                      :dpvo-legal/BF
                      :dpvo-legal/MW
                      :dpvo-legal/KE
                      :dpvo-legal/BW
                      :dpvo-legal/CG
                      :dpvo-legal/GN
                      :dpvo-legal/TF
                      :dpvo-legal/MU
                      :dpvo-legal/ST
                      :dpvo-legal/AO
                      :dpvo-legal/CF
                      :dpvo-legal/RW
                      :dpvo-legal/TD
                      :dpvo-legal/GH
                      :dpvo-legal/KM
                      :dpvo-legal/CD
                      :dpvo-legal/ER
                      :dpvo-legal/LS
                      :dpvo-legal/GW
                      :dpvo-legal/TN
                      :dpvo-legal/YT
                      :dpvo-legal/BI
                      :dpvo-legal/TG
                      :dpvo-legal/IO
                      :dpvo-legal/SD
                      :dpvo-legal/BJ
                      :dpvo-legal/NorthernAfrica
                      :dpvo-legal/EG
                      :dpvo-legal/ZW
                      :dpvo-legal/TZ
                      :dpvo-legal/CV
                      :dpvo-legal/RE
                      :dpvo-legal/NE
                      :dpvo-legal/MR
                      :dpvo-legal/NA
                      :dpvo-legal/DJ
                      :dpvo-legal/SH
                      :dpvo-legal/GA
                      :dpvo-legal/ZA
                      :dpvo-legal/MG
                      :dpvo-legal/MZ
                      :dpvo-legal/GM
                      :dpvo-legal/LY
                      :dpvo-legal/EH
                      :dpvo-legal/SS
                      :dpvo-legal/MA
                      :dpvo-legal/CI
                      :dpvo-legal/SO
                      :dpvo-legal/NG
                      :dpvo-legal/UG],
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Africa@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def Americas
  "Americas"
  {:db/ident         :dpvo-legal/Americas,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/MQ
                      :dpvo-legal/PY
                      :dpvo-legal/FK
                      :dpvo-legal/MS
                      :dpvo-legal/DM
                      :dpvo-legal/NI
                      :dpvo-legal/TC
                      :dpvo-legal/GP
                      :dpvo-legal/MX
                      :dpvo-legal/KY
                      :dpvo-legal/CU
                      :dpvo-legal/DO
                      :dpvo-legal/BS
                      :dpvo-legal/GY
                      :dpvo-legal/KN
                      :dpvo-legal/VG
                      :dpvo-legal/SX
                      :dpvo-legal/VI
                      :dpvo-legal/PA
                      :dpvo-legal/UY
                      :dpvo-legal/BB
                      :dpvo-legal/TT
                      :dpvo-legal/AR
                      :dpvo-legal/JM
                      :dpvo-legal/HN
                      :dpvo-legal/GL
                      :dpvo-legal/BL
                      :dpvo-legal/CO
                      :dpvo-legal/VC
                      :dpvo-legal/GS
                      :dpvo-legal/PM
                      :dpvo-legal/AI
                      :dpvo-legal/BQ
                      :dpvo-legal/BO
                      :dpvo-legal/VE
                      :dpvo-legal/SV
                      :dpvo-legal/CA
                      :dpvo-legal/LatinAmericaandtheCaribbean
                      :dpvo-legal/BV
                      :dpvo-legal/BZ
                      :dpvo-legal/MF
                      :dpvo-legal/GT
                      :dpvo-legal/SR
                      :dpvo-legal/AG
                      :dpvo-legal/BM
                      :dpvo-legal/CR
                      :dpvo-legal/GD
                      :dpvo-legal/NorthernAmerica
                      :dpvo-legal/AW
                      :dpvo-legal/US
                      :dpvo-legal/HT
                      :dpvo-legal/PE
                      :dpvo-legal/GF
                      :dpvo-legal/CW
                      :dpvo-legal/BR
                      :dpvo-legal/CL
                      :dpvo-legal/PR
                      :dpvo-legal/LC
                      :dpvo-legal/EC],
   :rdf/type         [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Americas@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def Asia
  "Asia"
  {:db/ident         :dpvo-legal/Asia,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/AM
                      :dpvo-legal/ID
                      :dpvo-legal/TJ
                      :dpvo-legal/KH
                      :dpvo-legal/KW
                      :dpvo-legal/MO
                      :dpvo-legal/AZ
                      :dpvo-legal/LK
                      :dpvo-legal/AF
                      :dpvo-legal/CY
                      :dpvo-legal/IR
                      :dpvo-legal/IL
                      :dpvo-legal/PH
                      :dpvo-legal/MN
                      :dpvo-legal/TR
                      :dpvo-legal/KP
                      :dpvo-legal/WesternAsia
                      :dpvo-legal/UZ
                      :dpvo-legal/JO
                      :dpvo-legal/BD
                      :dpvo-legal/OM
                      :dpvo-legal/SoutheasternAsia
                      :dpvo-legal/JP
                      :dpvo-legal/MV
                      :dpvo-legal/TL
                      :dpvo-legal/HK
                      :dpvo-legal/LA
                      :dpvo-legal/TM
                      :dpvo-legal/LB
                      :dpvo-legal/IN
                      :dpvo-legal/KR
                      :dpvo-legal/YE
                      :dpvo-legal/MY
                      :dpvo-legal/CentralAsia
                      :dpvo-legal/KG
                      :dpvo-legal/SG
                      :dpvo-legal/SY
                      :dpvo-legal/EasternAsia
                      :dpvo-legal/QA
                      :dpvo-legal/KZ
                      :dpvo-legal/PK
                      :dpvo-legal/CN
                      :dpvo-legal/AE
                      :dpvo-legal/VN
                      :dpvo-legal/TH
                      :dpvo-legal/IQ
                      :dpvo-legal/MM
                      :dpvo-legal/BT
                      :dpvo-legal/GE
                      :dpvo-legal/BH
                      :dpvo-legal/SA
                      :dpvo-legal/SouthernAsia
                      :dpvo-legal/BN
                      :dpvo-legal/PS
                      :dpvo-legal/NP],
   :rdf/type         [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Asia@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def AustraliaandNewZealand
  "AustraliaandNewZealand"
  {:db/ident         :dpvo-legal/AustraliaandNewZealand,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/CX
                      :dpvo-legal/NZ
                      :dpvo-legal/NF
                      :dpvo-legal/CC
                      :dpvo-legal/AU
                      :dpvo-legal/HM],
   :dcterms/isPartOf :dpvo-legal/Oceania,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "AustraliaandNewZealand@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def BA
  "BA"
  {:db/ident               :dpvo-legal/BA,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Europe :dpvo-legal/SouthernEurope],
   :dpvo-legal/iso_alpha2  "BA",
   :dpvo-legal/iso_alpha3  "BIH",
   :dpvo-legal/iso_numeric "70",
   :dpvo-legal/un_m49      "70",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Bosnia and Herzegovina@en",
   :skos/altLabel          ["BA" "BIH" "70"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def BB
  "BB"
  {:db/ident               :dpvo-legal/BB,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Americas
                            :dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean],
   :dpvo-legal/iso_alpha2  "BB",
   :dpvo-legal/iso_alpha3  "BRB",
   :dpvo-legal/iso_numeric "52",
   :dpvo-legal/un_m49      "52",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Barbados@en",
   :skos/altLabel          ["BB" "BRB" "52"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def BD
  "BD"
  {:db/ident               :dpvo-legal/BD,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SouthernAsia :dpvo-legal/Asia],
   :dpvo-legal/iso_alpha2  "BD",
   :dpvo-legal/iso_alpha3  "BGD",
   :dpvo-legal/iso_numeric "50",
   :dpvo-legal/un_m49      "50",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Bangladesh@en",
   :skos/altLabel          ["BD" "BGD" "50"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def BE
  "BE"
  {:db/ident               :dpvo-legal/BE,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EEA31
                            :dpvo-legal/EEA30
                            :dpvo-legal/EU28
                            :dpvo-legal/EEA
                            :dpvo-legal/EU
                            :dpvo-legal/EU27],
   :dcterms/isPartOf       [:dpvo-legal/WesternEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "BE",
   :dpvo-legal/iso_alpha3  "BEL",
   :dpvo-legal/iso_numeric "56",
   :dpvo-legal/un_m49      "56",
   :dpvo/hasAuthority      :dpvo-legal/DPA-BE,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Belgium@en",
   :skos/altLabel          ["BE" "BEL" "56"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def BF
  "BF"
  {:db/ident               :dpvo-legal/BF,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/WesternAfrica
                            :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica],
   :dpvo-legal/iso_alpha2  "BF",
   :dpvo-legal/iso_alpha3  "BFA",
   :dpvo-legal/iso_numeric "854",
   :dpvo-legal/un_m49      "854",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Burkina Faso@en",
   :skos/altLabel          ["BF" "BFA" "854"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def BG
  "BG"
  {:db/ident               :dpvo-legal/BG,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EU
                            :dpvo-legal/EU27
                            :dpvo-legal/EEA31
                            :dpvo-legal/EEA30
                            :dpvo-legal/EU28
                            :dpvo-legal/EEA],
   :dcterms/isPartOf       [:dpvo-legal/EasternEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "BG",
   :dpvo-legal/iso_alpha3  "BGR",
   :dpvo-legal/iso_numeric "100",
   :dpvo-legal/un_m49      "100",
   :dpvo/hasAuthority      :dpvo-legal/DPA-BG,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Bulgaria@en",
   :skos/altLabel          ["BG" "BGR" "100"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def BH
  "BH"
  {:db/ident               :dpvo-legal/BH,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/WesternAsia],
   :dpvo-legal/iso_alpha2  "BH",
   :dpvo-legal/iso_alpha3  "BHR",
   :dpvo-legal/iso_numeric "48",
   :dpvo-legal/un_m49      "48",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Bahrain@en",
   :skos/altLabel          ["BH" "BHR" "48"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def BI
  "BI"
  {:db/ident               :dpvo-legal/BI,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica
                            :dpvo-legal/Africa],
   :dpvo-legal/iso_alpha2  "BI",
   :dpvo-legal/iso_alpha3  "BDI",
   :dpvo-legal/iso_numeric "108",
   :dpvo-legal/un_m49      "108",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Burundi@en",
   :skos/altLabel          ["BI" "BDI" "108"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def BJ
  "BJ"
  {:db/ident               :dpvo-legal/BJ,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/WesternAfrica
                            :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica],
   :dpvo-legal/iso_alpha2  "BJ",
   :dpvo-legal/iso_alpha3  "BEN",
   :dpvo-legal/iso_numeric "204",
   :dpvo-legal/un_m49      "204",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Benin@en",
   :skos/altLabel          ["BJ" "BEN" "204"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def BL
  "BL"
  {:db/ident               :dpvo-legal/BL,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Caribbean
                            :dpvo-legal/Americas
                            :dpvo-legal/LatinAmericaandtheCaribbean],
   :dpvo-legal/iso_alpha2  "BL",
   :dpvo-legal/iso_alpha3  "BLM",
   :dpvo-legal/iso_numeric "652",
   :dpvo-legal/un_m49      "652",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Saint Barthélemy@en",
   :skos/altLabel          ["BL" "BLM" "652"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def BM
  "BM"
  {:db/ident               :dpvo-legal/BM,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/NorthernAmerica :dpvo-legal/Americas],
   :dpvo-legal/iso_alpha2  "BM",
   :dpvo-legal/iso_alpha3  "BMU",
   :dpvo-legal/iso_numeric "60",
   :dpvo-legal/un_m49      "60",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Bermuda@en",
   :skos/altLabel          ["BM" "BMU" "60"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def BN
  "BN"
  {:db/ident               :dpvo-legal/BN,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/SoutheasternAsia],
   :dpvo-legal/iso_alpha2  "BN",
   :dpvo-legal/iso_alpha3  "BRN",
   :dpvo-legal/iso_numeric "96",
   :dpvo-legal/un_m49      "96",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Brunei Darussalam@en",
   :skos/altLabel          ["BN" "BRN" "96"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def BO
  "BO"
  {:db/ident               :dpvo-legal/BO,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/SouthAmerica
                            :dpvo-legal/Americas],
   :dpvo-legal/iso_alpha2  "BO",
   :dpvo-legal/iso_alpha3  "BOL",
   :dpvo-legal/iso_numeric "68",
   :dpvo-legal/un_m49      "68",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString
                            "Bolivia (Plurinational State of)@en",
   :skos/altLabel          ["BO" "BOL" "68"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def BQ
  "BQ"
  {:db/ident               :dpvo-legal/BQ,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Americas
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Caribbean],
   :dpvo-legal/iso_alpha2  "BQ",
   :dpvo-legal/iso_alpha3  "BES",
   :dpvo-legal/iso_numeric "535",
   :dpvo-legal/un_m49      "535",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString
                            "Bonaire, Sint Eustatius and Saba@en",
   :skos/altLabel          ["BQ" "BES" "535"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def BR
  "BR"
  {:db/ident               :dpvo-legal/BR,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Americas
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/SouthAmerica],
   :dpvo-legal/iso_alpha2  "BR",
   :dpvo-legal/iso_alpha3  "BRA",
   :dpvo-legal/iso_numeric "76",
   :dpvo-legal/un_m49      "76",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Brazil@en",
   :skos/altLabel          ["BR" "BRA" "76"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def BS
  "BS"
  {:db/ident               :dpvo-legal/BS,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Americas
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Caribbean],
   :dpvo-legal/iso_alpha2  "BS",
   :dpvo-legal/iso_alpha3  "BHS",
   :dpvo-legal/iso_numeric "44",
   :dpvo-legal/un_m49      "44",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Bahamas@en",
   :skos/altLabel          ["BS" "BHS" "44"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def BT
  "BT"
  {:db/ident               :dpvo-legal/BT,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/SouthernAsia],
   :dpvo-legal/iso_alpha2  "BT",
   :dpvo-legal/iso_alpha3  "BTN",
   :dpvo-legal/iso_numeric "64",
   :dpvo-legal/un_m49      "64",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Bhutan@en",
   :skos/altLabel          ["BT" "BTN" "64"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def BV
  "BV"
  {:db/ident               :dpvo-legal/BV,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Americas
                            :dpvo-legal/SouthAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean],
   :dpvo-legal/iso_alpha2  "BV",
   :dpvo-legal/iso_alpha3  "BVT",
   :dpvo-legal/iso_numeric "74",
   :dpvo-legal/un_m49      "74",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Bouvet Island@en",
   :skos/altLabel          ["BV" "BVT" "74"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def BW
  "BW"
  {:db/ident               :dpvo-legal/BW,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SouthernAfrica
                            :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica],
   :dpvo-legal/iso_alpha2  "BW",
   :dpvo-legal/iso_alpha3  "BWA",
   :dpvo-legal/iso_numeric "72",
   :dpvo-legal/un_m49      "72",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Botswana@en",
   :skos/altLabel          ["BW" "BWA" "72"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def BY
  "BY"
  {:db/ident               :dpvo-legal/BY,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Europe :dpvo-legal/EasternEurope],
   :dpvo-legal/iso_alpha2  "BY",
   :dpvo-legal/iso_alpha3  "BLR",
   :dpvo-legal/iso_numeric "112",
   :dpvo-legal/un_m49      "112",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Belarus@en",
   :skos/altLabel          ["BY" "BLR" "112"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def BZ
  "BZ"
  {:db/ident               :dpvo-legal/BZ,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Americas
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/CentralAmerica],
   :dpvo-legal/iso_alpha2  "BZ",
   :dpvo-legal/iso_alpha3  "BLZ",
   :dpvo-legal/iso_numeric "84",
   :dpvo-legal/un_m49      "84",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Belize@en",
   :skos/altLabel          ["BZ" "BLZ" "84"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def CA
  "CA"
  {:db/ident               :dpvo-legal/CA,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Americas :dpvo-legal/NorthernAmerica],
   :dpvo-legal/iso_alpha2  "CA",
   :dpvo-legal/iso_alpha3  "CAN",
   :dpvo-legal/iso_numeric "124",
   :dpvo-legal/un_m49      "124",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Canada@en",
   :skos/altLabel          ["CA" "CAN" "124"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def CC
  "CC"
  {:db/ident               :dpvo-legal/CC,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Oceania
                            :dpvo-legal/AustraliaandNewZealand],
   :dpvo-legal/iso_alpha2  "CC",
   :dpvo-legal/iso_alpha3  "CCK",
   :dpvo-legal/iso_numeric "166",
   :dpvo-legal/un_m49      "166",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Cocos (Keeling) Islands@en",
   :skos/altLabel          ["CC" "CCK" "166"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def CD
  "CD"
  {:db/ident               :dpvo-legal/CD,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/MiddleAfrica],
   :dpvo-legal/iso_alpha2  "CD",
   :dpvo-legal/iso_alpha3  "COD",
   :dpvo-legal/iso_numeric "180",
   :dpvo-legal/un_m49      "180",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString
                            "Democratic Republic of the Congo@en",
   :skos/altLabel          ["CD" "COD" "180"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def CF
  "CF"
  {:db/ident               :dpvo-legal/CF,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/MiddleAfrica
                            :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica],
   :dpvo-legal/iso_alpha2  "CF",
   :dpvo-legal/iso_alpha3  "CAF",
   :dpvo-legal/iso_numeric "140",
   :dpvo-legal/un_m49      "140",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Central African Republic@en",
   :skos/altLabel          ["CF" "CAF" "140"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def CG
  "CG"
  {:db/ident               :dpvo-legal/CG,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/MiddleAfrica
                            :dpvo-legal/Africa],
   :dpvo-legal/iso_alpha2  "CG",
   :dpvo-legal/iso_alpha3  "COG",
   :dpvo-legal/iso_numeric "178",
   :dpvo-legal/un_m49      "178",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Congo@en",
   :skos/altLabel          ["CG" "COG" "178"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def CH
  "CH"
  {:db/ident               :dpvo-legal/CH,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/WesternEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "CH",
   :dpvo-legal/iso_alpha3  "CHE",
   :dpvo-legal/iso_numeric "756",
   :dpvo-legal/un_m49      "756",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Switzerland@en",
   :skos/altLabel          ["CH" "CHE" "756"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def CI
  "CI"
  {:db/ident               :dpvo-legal/CI,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Africa
                            :dpvo-legal/WesternAfrica
                            :dpvo-legal/SubSaharanAfrica],
   :dpvo-legal/iso_alpha2  "CI",
   :dpvo-legal/iso_alpha3  "CIV",
   :dpvo-legal/iso_numeric "384",
   :dpvo-legal/un_m49      "384",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Côte d’Ivoire@en",
   :skos/altLabel          ["CI" "CIV" "384"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def CK
  "CK"
  {:db/ident               :dpvo-legal/CK,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Oceania :dpvo-legal/Polynesia],
   :dpvo-legal/iso_alpha2  "CK",
   :dpvo-legal/iso_alpha3  "COK",
   :dpvo-legal/iso_numeric "184",
   :dpvo-legal/un_m49      "184",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Cook Islands@en",
   :skos/altLabel          ["CK" "COK" "184"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def CL
  "CL"
  {:db/ident               :dpvo-legal/CL,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SouthAmerica
                            :dpvo-legal/Americas
                            :dpvo-legal/LatinAmericaandtheCaribbean],
   :dpvo-legal/iso_alpha2  "CL",
   :dpvo-legal/iso_alpha3  "CHL",
   :dpvo-legal/iso_numeric "152",
   :dpvo-legal/un_m49      "152",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Chile@en",
   :skos/altLabel          ["CL" "CHL" "152"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def CM
  "CM"
  {:db/ident               :dpvo-legal/CM,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/MiddleAfrica
                            :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/Africa],
   :dpvo-legal/iso_alpha2  "CM",
   :dpvo-legal/iso_alpha3  "CMR",
   :dpvo-legal/iso_numeric "120",
   :dpvo-legal/un_m49      "120",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Cameroon@en",
   :skos/altLabel          ["CM" "CMR" "120"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def CN
  "CN"
  {:db/ident               :dpvo-legal/CN,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/EasternAsia],
   :dpvo-legal/iso_alpha2  "CN",
   :dpvo-legal/iso_alpha3  "CHN",
   :dpvo-legal/iso_numeric "156",
   :dpvo-legal/un_m49      "156",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "China@en",
   :skos/altLabel          ["CN" "CHN" "156"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def CO
  "CO"
  {:db/ident               :dpvo-legal/CO,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Americas
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/SouthAmerica],
   :dpvo-legal/iso_alpha2  "CO",
   :dpvo-legal/iso_alpha3  "COL",
   :dpvo-legal/iso_numeric "170",
   :dpvo-legal/un_m49      "170",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Colombia@en",
   :skos/altLabel          ["CO" "COL" "170"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def CR
  "CR"
  {:db/ident               :dpvo-legal/CR,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Americas
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/CentralAmerica],
   :dpvo-legal/iso_alpha2  "CR",
   :dpvo-legal/iso_alpha3  "CRI",
   :dpvo-legal/iso_numeric "188",
   :dpvo-legal/un_m49      "188",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Costa Rica@en",
   :skos/altLabel          ["CR" "CRI" "188"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def CU
  "CU"
  {:db/ident               :dpvo-legal/CU,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Caribbean
                            :dpvo-legal/Americas
                            :dpvo-legal/LatinAmericaandtheCaribbean],
   :dpvo-legal/iso_alpha2  "CU",
   :dpvo-legal/iso_alpha3  "CUB",
   :dpvo-legal/iso_numeric "192",
   :dpvo-legal/un_m49      "192",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Cuba@en",
   :skos/altLabel          ["CU" "CUB" "192"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def CV
  "CV"
  {:db/ident               :dpvo-legal/CV,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/Africa
                            :dpvo-legal/WesternAfrica],
   :dpvo-legal/iso_alpha2  "CV",
   :dpvo-legal/iso_alpha3  "CPV",
   :dpvo-legal/iso_numeric "132",
   :dpvo-legal/un_m49      "132",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Cabo Verde@en",
   :skos/altLabel          ["CV" "CPV" "132"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def CW
  "CW"
  {:db/ident               :dpvo-legal/CW,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Americas
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Caribbean],
   :dpvo-legal/iso_alpha2  "CW",
   :dpvo-legal/iso_alpha3  "CUW",
   :dpvo-legal/iso_numeric "531",
   :dpvo-legal/un_m49      "531",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Curaçao@en",
   :skos/altLabel          ["CW" "CUW" "531"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def CX
  "CX"
  {:db/ident               :dpvo-legal/CX,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Oceania
                            :dpvo-legal/AustraliaandNewZealand],
   :dpvo-legal/iso_alpha2  "CX",
   :dpvo-legal/iso_alpha3  "CXR",
   :dpvo-legal/iso_numeric "162",
   :dpvo-legal/un_m49      "162",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Christmas Island@en",
   :skos/altLabel          ["CX" "CXR" "162"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def CY
  "CY"
  {:db/ident               :dpvo-legal/CY,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EU27
                            :dpvo-legal/EEA30
                            :dpvo-legal/EU
                            :dpvo-legal/EEA31
                            :dpvo-legal/EU28
                            :dpvo-legal/EEA],
   :dcterms/isPartOf       [:dpvo-legal/WesternAsia :dpvo-legal/Asia],
   :dpvo-legal/iso_alpha2  "CY",
   :dpvo-legal/iso_alpha3  "CYP",
   :dpvo-legal/iso_numeric "196",
   :dpvo-legal/un_m49      "196",
   :dpvo/hasAuthority      :dpvo-legal/DPA-CY,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Cyprus@en",
   :skos/altLabel          ["CY" "CYP" "196"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def CZ
  "CZ"
  {:db/ident               :dpvo-legal/CZ,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EEA30
                            :dpvo-legal/EU27
                            :dpvo-legal/EEA31
                            :dpvo-legal/EU28
                            :dpvo-legal/EEA
                            :dpvo-legal/EU],
   :dcterms/isPartOf       [:dpvo-legal/Europe :dpvo-legal/EasternEurope],
   :dpvo-legal/iso_alpha2  "CZ",
   :dpvo-legal/iso_alpha3  "CZE",
   :dpvo-legal/iso_numeric "203",
   :dpvo-legal/un_m49      "203",
   :dpvo/hasAuthority      :dpvo-legal/DPA-CZ,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Czechia@en",
   :skos/altLabel          ["CZ" "CZE" "203"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def Caribbean
  "Caribbean"
  {:db/ident         :dpvo-legal/Caribbean,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/TT
                      :dpvo-legal/AW
                      :dpvo-legal/VI
                      :dpvo-legal/TC
                      :dpvo-legal/GD
                      :dpvo-legal/DO
                      :dpvo-legal/CW
                      :dpvo-legal/KN
                      :dpvo-legal/HT
                      :dpvo-legal/BS
                      :dpvo-legal/VG
                      :dpvo-legal/BQ
                      :dpvo-legal/GP
                      :dpvo-legal/BB
                      :dpvo-legal/KY
                      :dpvo-legal/CU
                      :dpvo-legal/AI
                      :dpvo-legal/JM
                      :dpvo-legal/DM
                      :dpvo-legal/MQ
                      :dpvo-legal/AG
                      :dpvo-legal/VC
                      :dpvo-legal/MF
                      :dpvo-legal/MS
                      :dpvo-legal/BL
                      :dpvo-legal/SX
                      :dpvo-legal/PR
                      :dpvo-legal/LC],
   :dcterms/isPartOf :dpvo-legal/LatinAmericaandtheCaribbean,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Caribbean@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def CentralAmerica
  "CentralAmerica"
  {:db/ident         :dpvo-legal/CentralAmerica,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/NI
                      :dpvo-legal/GT
                      :dpvo-legal/HN
                      :dpvo-legal/MX
                      :dpvo-legal/CR
                      :dpvo-legal/BZ
                      :dpvo-legal/SV
                      :dpvo-legal/PA],
   :dcterms/isPartOf :dpvo-legal/LatinAmericaandtheCaribbean,
   :rdf/type         [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "CentralAmerica@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def CentralAsia
  "CentralAsia"
  {:db/ident :dpvo-legal/CentralAsia,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart
   [:dpvo-legal/KG :dpvo-legal/TJ :dpvo-legal/TM :dpvo-legal/KZ :dpvo-legal/UZ],
   :dcterms/isPartOf :dpvo-legal/Asia,
   :rdf/type [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString "CentralAsia@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def ChannelIslands
  "ChannelIslands"
  {:db/ident         :dpvo-legal/ChannelIslands,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/Sark :dpvo-legal/JE :dpvo-legal/GG],
   :dcterms/isPartOf :dpvo-legal/NorthernEurope,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "ChannelIslands@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def DE
  "DE"
  {:db/ident               :dpvo-legal/DE,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/DE-TH
                            :dpvo-legal/DE-BW
                            :dpvo-legal/DE-SN
                            :dpvo-legal/DE-RP
                            :dpvo-legal/DE-ST
                            :dpvo-legal/DE-BY
                            :dpvo-legal/DE-SH
                            :dpvo-legal/DE-HB
                            :dpvo-legal/DE-NI
                            :dpvo-legal/DE-HE
                            :dpvo-legal/DE-HH
                            :dpvo-legal/EU28
                            :dpvo-legal/EU
                            :dpvo-legal/EEA31
                            :dpvo-legal/DE-BE
                            :dpvo-legal/EU27
                            :dpvo-legal/DE-NW
                            :dpvo-legal/DE-MV
                            :dpvo-legal/EEA
                            :dpvo-legal/DE-SL
                            :dpvo-legal/EEA30
                            :dpvo-legal/DE-BB],
   :dcterms/isPartOf       [:dpvo-legal/WesternEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "DE",
   :dpvo-legal/iso_alpha3  "DEU",
   :dpvo-legal/iso_numeric "276",
   :dpvo-legal/un_m49      "276",
   :dpvo/hasAuthority      :dpvo-legal/DPA-DE,
   :dpvo/hasLaw            [:dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG],
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Germany@en",
   :skos/altLabel          ["DE" "DEU" "276"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def DE-BB
  "Brandenburg"
  {:db/ident          :dpvo-legal/DE-BB,
   :dcterms/created   #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator   {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf  :dpvo-legal/DE,
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-BB,
   :dpvo/hasLaw       [:dpvo-legal/DE-BDSG
                       :dpvo-legal/EU-GDPR
                       :dpvo-legal/DE-BE-BbgDSG],
   :rdf/type          [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy  {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label        #xsd/langString "Brandenburg@en",
   :vs/term_status    #xsd/langString "accepted@en"})

(def DE-BDSG
  {:db/ident             :dpvo-legal/DE-BDSG,
   :dcterms/created      #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator      [{:xsd/string "Harshvardhan J. Pandit"}
                          {:xsd/string "Julian Flake"}],
   :dcterms/temporal     {:rdf/type :time/ProperInterval,
                          :time/hasBeginning
                          {:time/inXSDDate #xsd/date
                                            #inst
                                             "2019-11-20T00:00:00.000-05:00"}},
   :dpvo/hasAuthority    [:dpvo-legal/DPA-DE-SL
                          :dpvo-legal/DPA-DE-MV
                          :dpvo-legal/DPA-DE-BY-public
                          :dpvo-legal/DPA-DE-HE
                          :dpvo-legal/DPA-DE-TH
                          :dpvo-legal/DPA-DE-ST
                          :dpvo-legal/DPA-DE-BY-non-public
                          :dpvo-legal/DPA-DE-SN
                          :dpvo-legal/DPA-DE-BB
                          :dpvo-legal/DPA-DE-HB
                          :dpvo-legal/DPA-DE-BE
                          :dpvo-legal/DPA-DE-SH
                          :dpvo-legal/DPA-DE-RP
                          :dpvo-legal/DPA-DE
                          :dpvo-legal/DPA-DE-NI
                          :dpvo-legal/DPA-DE-HH
                          :dpvo-legal/DPA-DE-NW],
   :dpvo/hasJurisdiction [:dpvo-legal/DE-RP
                          :dpvo-legal/DE-BE
                          :dpvo-legal/DE-MV
                          :dpvo-legal/DE-HB
                          :dpvo-legal/DE-BY
                          :dpvo-legal/DE-NI
                          :dpvo-legal/DE-ST
                          :dpvo-legal/DE-HH
                          :dpvo-legal/DE-HE
                          :dpvo-legal/DE-SN
                          :dpvo-legal/DE-SL
                          :dpvo-legal/DE-NW
                          :dpvo-legal/DE-BW
                          :dpvo-legal/DE-BB
                          :dpvo-legal/DE
                          :dpvo-legal/DE-SH
                          :dpvo-legal/DE-TH],
   :foaf/homepage        {:rdfa/uri
                          "https://www.gesetze-im-internet.de/bdsg_2018/"},
   :rdf/type             [:owl/NamedIndividual :dpvo/Law],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           [#xsd/langString
                           "Federal Data Protection Act (BDSG)@en"
                          #xsd/langString "Bundesdatenschutzgesetz (BDSG)@de"],
   :vs/term_status       #xsd/langString "accepted@en"})

(def DE-BE
  "Berlin"
  {:db/ident          :dpvo-legal/DE-BE,
   :dcterms/created   #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator   {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf  :dpvo-legal/DE,
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-BE,
   :dpvo/hasLaw       [:dpvo-legal/DE-BDSG
                       :dpvo-legal/EU-GDPR
                       :dpvo-legal/DE-BE-BlnDSG],
   :rdf/type          [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy  {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label        #xsd/langString "Berlin@en",
   :vs/term_status    #xsd/langString "accepted@en"})

(def DE-BE-BbgDSG
  {:db/ident :dpvo-legal/DE-BE-BbgDSG,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-BB,
   :dpvo/hasJurisdiction :dpvo-legal/DE-BB,
   :foaf/homepage
   {:rdfa/uri
    "https://www.lda.brandenburg.de/sixcms/media.php/9/BbgDSG_2019.pdf"},
   :rdf/type [:dpvo/Law :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label [#xsd/langString
                 "Brandenburgisches Datenschutzgesetz (BbgDSG)@de"
                #xsd/langString "Brandenburg Data Protection Act (BbgDSG)@en"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DE-BE-BlnDSG
  {:db/ident :dpvo-legal/DE-BE-BlnDSG,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}],
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-BE,
   :dpvo/hasJurisdiction :dpvo-legal/DE-BE,
   :foaf/homepage
   {:rdfa/uri
    "https://www.datenschutz-berlin.de/fileadmin/user_upload/pdf/publikationen/informationsmaterialien/2018-BlnBDI_BlnDSG.pdf"},
   :rdf/type [:owl/NamedIndividual :dpvo/Law],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label [#xsd/langString "Berlin Data Protection Act (BlnDSG)@en"
                #xsd/langString "Berliner Datenschutzgesetz (BlnDSG)@de"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DE-BW
  "Baden-Württemberg"
  {:db/ident         :dpvo-legal/DE-BW,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/DE,
   :dpvo/hasLaw      [:dpvo-legal/EU-GDPR
                      :dpvo-legal/DE-BDSG
                      :dpvo-legal/DE-BW-LDSG],
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Baden-Württemberg@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def DE-BW-LDSG
  {:db/ident :dpvo-legal/DE-BW-LDSG,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}],
   :dpvo/hasJurisdiction :dpvo-legal/DE-BW,
   :foaf/homepage
   {:rdfa/uri
    "https://www.baden-wuerttemberg.datenschutz.de/wp-content/uploads/2018/06/LDSG-neu-GBl-2018173.pdf"},
   :rdf/type [:dpvo/Law :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label [#xsd/langString "Landesdatenschutzgesetz (LDSG) (BW)@de"
                #xsd/langString "State Data Protection Act (LDSG) (BW)@en"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DE-BY
  "Bavaria"
  {:db/ident          :dpvo-legal/DE-BY,
   :dcterms/created   #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator   {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf  :dpvo-legal/DE,
   :dpvo/hasAuthority [:dpvo-legal/DPA-DE-BY-non-public
                       :dpvo-legal/DPA-DE-BY-public],
   :dpvo/hasLaw       [:dpvo-legal/DE-BY-BayDSG
                       :dpvo-legal/EU-GDPR
                       :dpvo-legal/DE-BDSG],
   :rdf/type          [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy  {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label        #xsd/langString "Bavaria@en",
   :vs/term_status    #xsd/langString "accepted@en"})

(def DE-BY-BayDSG
  {:db/ident :dpvo-legal/DE-BY-BayDSG,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}],
   :dpvo/hasAuthority [:dpvo-legal/DPA-DE-BY-public
                       :dpvo-legal/DPA-DE-BY-non-public],
   :dpvo/hasJurisdiction :dpvo-legal/DE-BY,
   :foaf/homepage
   {:rdfa/uri
    "https://www.datenschutz-bayern.de/datenschutzreform2018/BayDSG.pdf"},
   :rdf/type [:dpvo/Law :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label [#xsd/langString "Bayerisches Datenschutzgesetz (BayDSG)@de"
                #xsd/langString "Bavarian Data Protection Act (BayDSG)@en"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DE-HB
  "Bremen"
  {:db/ident          :dpvo-legal/DE-HB,
   :dcterms/created   #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator   {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf  :dpvo-legal/DE,
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-HB,
   :dpvo/hasLaw       [:dpvo-legal/DE-HB-BremDSGVOAG
                       :dpvo-legal/EU-GDPR
                       :dpvo-legal/DE-BDSG],
   :rdf/type          [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy  {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label        #xsd/langString "Bremen@en",
   :vs/term_status    #xsd/langString "accepted@en"})

(def DE-HB-BremDSGVOAG
  {:db/ident :dpvo-legal/DE-HB-BremDSGVOAG,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}],
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-HB,
   :dpvo/hasJurisdiction :dpvo-legal/DE-HB,
   :foaf/homepage
   {:rdfa/uri
    "https://www.transparenz.bremen.de/metainformationen/bremisches-ausfuehrungsgesetz-zur-eu-datenschutz-grundverordnung-bremdsgvoag-vom-8-mai-2018-116884?template=20_gp_ifg_meta_detail_d"},
   :rdf/type [:dpvo/Law :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   [#xsd/langString
     "Bremisches Ausführungsgesetz zur EU-Datenschutz-Grundverordnung (BremDSGVOAG)@de"
    #xsd/langString
     "Bremen Implementing Act for the EU General Data Protection Regulation (BremDSGVOAG)@en"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DE-HE
  "Hesse"
  {:db/ident          :dpvo-legal/DE-HE,
   :dcterms/created   #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator   {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf  :dpvo-legal/DE,
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-HE,
   :dpvo/hasLaw       [:dpvo-legal/DE-HE-HDISG
                       :dpvo-legal/EU-GDPR
                       :dpvo-legal/DE-BDSG],
   :rdf/type          [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy  {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label        #xsd/langString "Hesse@en",
   :vs/term_status    #xsd/langString "accepted@en"})

(def DE-HE-HDISG
  {:db/ident :dpvo-legal/DE-HE-HDISG,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-HE,
   :dpvo/hasJurisdiction :dpvo-legal/DE-HE,
   :foaf/homepage
   {:rdfa/uri
    "https://www.rv.hessenrecht.hessen.de/bshe/document/jlr-DSIFGHErahmen"},
   :rdf/type [:dpvo/Law :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   [#xsd/langString
     "Hessisches Datenschutz- und Informationsfreiheitsgesetz (HDSIG)@de"
    #xsd/langString
     "Hessian Data Protection and Freedom of Information Act (HDSIG)@en"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DE-HH
  "Hamburg"
  {:db/ident          :dpvo-legal/DE-HH,
   :dcterms/created   #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator   {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf  :dpvo-legal/DE,
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-HH,
   :dpvo/hasLaw       [:dpvo-legal/DE-BDSG
                       :dpvo-legal/EU-GDPR
                       :dpvo-legal/DE-HH-HmbDSG],
   :rdf/type          [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy  {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label        #xsd/langString "Hamburg@en",
   :vs/term_status    #xsd/langString "accepted@en"})

(def DE-HH-HmbDSG
  {:db/ident :dpvo-legal/DE-HH-HmbDSG,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-HH,
   :dpvo/hasJurisdiction :dpvo-legal/DE-HH,
   :foaf/homepage {:rdfa/uri
                   "https://datenschutz-hamburg.de/assets/pdf/HmbDSG_neu.pdf"},
   :rdf/type [:dpvo/Law :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label [#xsd/langString "Hamburgisches Datenschutzgesetz (HmbDSG)@de"
                #xsd/langString "Hamburg Data Protection Act (HmbDSG)@en"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DE-LSA-DSG
  {:db/ident :dpvo-legal/DE-LSA-DSG,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}],
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-ST,
   :dpvo/hasJurisdiction :dpvo-legal/DE-ST,
   :foaf/homepage
   {:rdfa/uri
    "https://www.landtag.sachsen-anhalt.de/fileadmin/Downloads/Rechtsgrundlagen/2018_Datenschutzgesetz-DSG-LSA.pdf"},
   :rdf/type [:owl/NamedIndividual :dpvo/Law],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   [#xsd/langString
     "Gesetz zum Schutz personenbezogener Daten der Bürger (Datenschutzgesetz Sachsen-Anhalt - DSG LSA)@de"
    #xsd/langString
     "Law on the protection of personal data of citizens (Saxony-Anhalt Data Protection Act - DSG LSA)@en"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DE-MV
  "Mecklenburg-Western-Pomerania"
  {:db/ident          :dpvo-legal/DE-MV,
   :dcterms/created   #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator   {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf  :dpvo-legal/DE,
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-MV,
   :dpvo/hasLaw       [:dpvo-legal/DE-MV-DSG
                       :dpvo-legal/DE-BDSG
                       :dpvo-legal/EU-GDPR],
   :rdf/type          [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy  {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label        #xsd/langString "Mecklenburg-Western-Pomerania@en",
   :vs/term_status    #xsd/langString "accepted@en"})

(def DE-MV-DSG
  {:db/ident :dpvo-legal/DE-MV-DSG,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}],
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-MV,
   :dpvo/hasJurisdiction :dpvo-legal/DE-MV,
   :foaf/homepage
   {:rdfa/uri
    "https://www.datenschutz-mv.de/static/DS/Dateien/Rechtsgrundlagen/Landesdatenschutzgesetz.pdf"},
   :rdf/type [:dpvo/Law :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   [#xsd/langString
     "Act to adapt the State Data Protection Act and other data protection regulations in the area of ​​responsibility of the Ministry of the Interior and Europe Mecklenburg-West Pomerania to Regulation (EU) 2016/679 and to implement Directive (EU) 2016/680@en"
    #xsd/langString
     "Gesetz zur Anpassung des Landesdatenschutzgesetzes und weiterer datenschutzrechtlicher Vorschriften im Zuständigkeitsbereich des Ministeriums für Inneres und Europa Mecklenburg-Vorpommern an die Verordnung (EU) 2016/679 und zur Umsetzung der Richtlinie (EU) 2016/680@de"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DE-NI
  "Lower-Saxony"
  {:db/ident          :dpvo-legal/DE-NI,
   :dcterms/created   #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator   {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf  :dpvo-legal/DE,
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-NI,
   :dpvo/hasLaw       [:dpvo-legal/DE-BDSG
                       :dpvo-legal/EU-GDPR
                       :dpvo-legal/DE-NI-NDSG],
   :rdf/type          [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy  {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label        #xsd/langString "Lower-Saxony@en",
   :vs/term_status    #xsd/langString "accepted@en"})

(def DE-NI-NDSG
  {:db/ident :dpvo-legal/DE-NI-NDSG,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}],
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-NI,
   :dpvo/hasJurisdiction :dpvo-legal/DE-NI,
   :foaf/homepage
   {:rdfa/uri
    "https://lfd.niedersachsen.de/download/132258/Niedersaechsisches_Datenschutzgesetz_NDSG_vom_16._Mai_2018_Nds._GVBl._S._66_.pdf"},
   :rdf/type [:dpvo/Law :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label [#xsd/langString "Lower Saxony Data Protection Act (NDSG)@en"
                #xsd/langString
                 "Niedersächsisches Datenschutzgesetz (NDSG)@de"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DE-NW
  "North-Rhine Westphalia"
  {:db/ident          :dpvo-legal/DE-NW,
   :dcterms/created   #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator   {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf  :dpvo-legal/DE,
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-NW,
   :dpvo/hasLaw       [:dpvo-legal/EU-GDPR
                       :dpvo-legal/DE-NW-DSG
                       :dpvo-legal/DE-BDSG],
   :rdf/type          [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy  {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label        #xsd/langString "North-Rhine Westphalia@en",
   :vs/term_status    #xsd/langString "accepted@en"})

(def DE-NW-DSG
  {:db/ident :dpvo-legal/DE-NW-DSG,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}],
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-NW,
   :dpvo/hasJurisdiction :dpvo-legal/DE-NW,
   :foaf/homepage
   {:rdfa/uri
    "https://recht.nrw.de/lmi/owa/br_text_anzeigen?v_id=3520071121100436275"},
   :rdf/type [:owl/NamedIndividual :dpvo/Law],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   [#xsd/langString "North Rhine-Westphalia Data Protection Act (DSG NRW)@en"
    #xsd/langString "Datenschutzgesetz Nordrhein-Westfalen (DSG NRW)@de"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DE-RP
  "Rhineland-Palatinate"
  {:db/ident         :dpvo-legal/DE-RP,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/DE,
   :dpvo/hasLaw      [:dpvo-legal/DE-RP-LDSG
                      :dpvo-legal/DE-BDSG
                      :dpvo-legal/EU-GDPR],
   :rdf/type         [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Rhineland-Palatinate@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def DE-RP-LDSG
  {:db/ident :dpvo-legal/DE-RP-LDSG,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-RP,
   :dpvo/hasJurisdiction :dpvo-legal/DE-RP,
   :foaf/homepage
   {:rdfa/uri "https://landesrecht.rlp.de/bsrp/document/jlr-DSGRP2018pP18"},
   :rdf/type [:dpvo/Law :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label [#xsd/langString "Landesdatenschutzgesetz (LDSG)@de"
                #xsd/langString "State Data Protection Act (LDSG)@en"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DE-SH
  "Schleswig-Holstein"
  {:db/ident          :dpvo-legal/DE-SH,
   :dcterms/created   #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator   {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf  :dpvo-legal/DE,
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-SH,
   :dpvo/hasLaw       [:dpvo-legal/DE-BDSG
                       :dpvo-legal/EU-GDPR
                       :dpvo-legal/DE-SH-LDSG],
   :rdf/type          [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy  {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label        #xsd/langString "Schleswig-Holstein@en",
   :vs/term_status    #xsd/langString "accepted@en"})

(def DE-SH-LDSG
  {:db/ident :dpvo-legal/DE-SH-LDSG,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-SH,
   :dpvo/hasJurisdiction :dpvo-legal/DE-SH,
   :foaf/homepage
   {:rdfa/uri
    "https://www.gesetze-rechtsprechung.sh.juris.de/jportal/?quelle=jlink&query=DSG+SH&psml=bsshoprod.psml&max=true&aiz=true"},
   :rdf/type [:dpvo/Law :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   [#xsd/langString
     "Schleswig-Holstein law for the protection of personal data (state data protection law - LDSG)@en"
    #xsd/langString
     "Schleswig-Holsteinisches Gesetz zum Schutz personenbezogener Daten (Landesdatenschutzgesetz - LDSG)@de"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DE-SL
  "Saarland"
  {:db/ident          :dpvo-legal/DE-SL,
   :dcterms/created   #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator   {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf  :dpvo-legal/DE,
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-SL,
   :dpvo/hasLaw       [:dpvo-legal/DE-SL-SDSG
                       :dpvo-legal/DE-BDSG
                       :dpvo-legal/EU-GDPR],
   :rdf/type          [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy  {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label        #xsd/langString "Saarland@en",
   :vs/term_status    #xsd/langString "accepted@en"})

(def DE-SL-SDSG
  {:db/ident :dpvo-legal/DE-SL-SDSG,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-SL,
   :dpvo/hasJurisdiction :dpvo-legal/DE-SL,
   :foaf/homepage
   {:rdfa/uri "https://recht.saarland.de/bssl/document/jlr-DSGSL2018rahmen"},
   :rdf/type [:owl/NamedIndividual :dpvo/Law],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label [#xsd/langString "Saarland Data Protection Act@en"
                #xsd/langString "Saarländisches Datenschutzgesetz@de"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DE-SN
  "Saxony"
  {:db/ident          :dpvo-legal/DE-SN,
   :dcterms/created   #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator   {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf  :dpvo-legal/DE,
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-SN,
   :dpvo/hasLaw       [:dpvo-legal/DE-SN-SächsDSG
                       :dpvo-legal/DE-BDSG
                       :dpvo-legal/EU-GDPR],
   :rdf/type          [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy  {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label        #xsd/langString "Saxony@en",
   :vs/term_status    #xsd/langString "accepted@en"})

(def DE-SN-SächsDSG
  {:db/ident :dpvo-legal/DE-SN-SächsDSG,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}],
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-SN,
   :dpvo/hasJurisdiction :dpvo-legal/DE-SN,
   :foaf/homepage
   {:rdfa/uri "https://www.recht.sachsen.de/vorschrift_gesamt/1672/28005.pdf"},
   :rdf/type [:dpvo/Law :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   [#xsd/langString
     "Law for the Protection of Informational Self-Determination in the Free State of Saxony (Saxon Data Protection Act - SächsDSG)@en"
    #xsd/langString
     "Gesetz zum Schutz der informationellen Selbstbestimmung im Freistaat Sachsen (Sächsisches Datenschutzgesetz – SächsDSG)@de"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DE-ST
  "Saxony-Anhalt"
  {:db/ident          :dpvo-legal/DE-ST,
   :dcterms/created   #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator   {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf  :dpvo-legal/DE,
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-ST,
   :dpvo/hasLaw       [:dpvo-legal/EU-GDPR
                       :dpvo-legal/DE-LSA-DSG
                       :dpvo-legal/DE-BDSG],
   :rdf/type          [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy  {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label        #xsd/langString "Saxony-Anhalt@en",
   :vs/term_status    #xsd/langString "accepted@en"})

(def DE-TH
  "Thuringia"
  {:db/ident          :dpvo-legal/DE-TH,
   :dcterms/created   #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator   {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf  :dpvo-legal/DE,
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-TH,
   :dpvo/hasLaw       [:dpvo-legal/DE-TH-ThürDSG
                       :dpvo-legal/DE-BDSG
                       :dpvo-legal/EU-GDPR],
   :rdf/type          [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy  {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label        #xsd/langString "Thuringia@en",
   :vs/term_status    #xsd/langString "accepted@en"})

(def DE-TH-ThürDSG
  {:db/ident :dpvo-legal/DE-TH-ThürDSG,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}],
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-TH,
   :dpvo/hasJurisdiction :dpvo-legal/DE-TH,
   :foaf/homepage
   {:rdfa/uri
    "https://landesrecht.thueringen.de/bsth/document/jlr-DSGTH2018rahmen"},
   :rdf/type [:dpvo/Law :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label [#xsd/langString "Thuringian Data Protection Act (ThürDSG)@en"
                #xsd/langString "Thüringer Datenschutzgesetz (ThürDSG)@de"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DJ
  "DJ"
  {:db/ident               :dpvo-legal/DJ,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica],
   :dpvo-legal/iso_alpha2  "DJ",
   :dpvo-legal/iso_alpha3  "DJI",
   :dpvo-legal/iso_numeric "262",
   :dpvo-legal/un_m49      "262",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Djibouti@en",
   :skos/altLabel          ["DJ" "DJI" "262"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def DK
  "DK"
  {:db/ident               :dpvo-legal/DK,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EU27
                            :dpvo-legal/EU
                            :dpvo-legal/EEA
                            :dpvo-legal/EEA30
                            :dpvo-legal/EEA31
                            :dpvo-legal/EU28],
   :dcterms/isPartOf       [:dpvo-legal/NorthernEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "DK",
   :dpvo-legal/iso_alpha3  "DNK",
   :dpvo-legal/iso_numeric "208",
   :dpvo-legal/un_m49      "208",
   :dpvo/hasAuthority      :dpvo-legal/DPA-DK,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Denmark@en",
   :skos/altLabel          ["DK" "DNK" "208"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def DM
  "DM"
  {:db/ident               :dpvo-legal/DM,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas
                            :dpvo-legal/Caribbean],
   :dpvo-legal/iso_alpha2  "DM",
   :dpvo-legal/iso_alpha3  "DMA",
   :dpvo-legal/iso_numeric "212",
   :dpvo-legal/un_m49      "212",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Dominica@en",
   :skos/altLabel          ["DM" "DMA" "212"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def DO
  "DO"
  {:db/ident               :dpvo-legal/DO,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Americas
                            :dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean],
   :dpvo-legal/iso_alpha2  "DO",
   :dpvo-legal/iso_alpha3  "DOM",
   :dpvo-legal/iso_numeric "214",
   :dpvo-legal/un_m49      "214",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Dominican Republic@en",
   :skos/altLabel          ["DO" "DOM" "214"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def DPA-AT
  "Austrian Data Protection Authority"
  {:db/ident             :dpvo-legal/DPA-AT,
   :dcterms/created      #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator      {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/AT,
   :dpvo/hasLaw          :dpvo-legal/EU-GDPR,
   :foaf/homepage        {:rdfa/uri "https://dsb.gv.at"},
   :rdf/type             [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString
                          "Austrian Data Protection Authority@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-BE
  "Belgian Data Protection Authority"
  {:db/ident             :dpvo-legal/DPA-BE,
   :dcterms/created      #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator      {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/BE,
   :dpvo/hasLaw          :dpvo-legal/EU-GDPR,
   :foaf/homepage        {:rdfa/uri "https://www.dataprotectionauthority.be/"},
   :rdf/type             [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString "Belgian Data Protection Authority@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-BG
  "Commission for Personal Data Protection"
  {:db/ident             :dpvo-legal/DPA-BG,
   :dcterms/created      #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator      {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/BG,
   :dpvo/hasLaw          :dpvo-legal/EU-GDPR,
   :foaf/homepage        {:rdfa/uri "https://www.cpdp.bg/"},
   :rdf/type             [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString
                          "Commission for Personal Data Protection@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-CY
  "Commissioner for Personal Data Protection"
  {:db/ident             :dpvo-legal/DPA-CY,
   :dcterms/created      #xsd/date #inst "2023-06-16T00:00:00.000-04:00",
   :dcterms/creator      {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/CY,
   :dpvo/hasLaw          :dpvo-legal/EU-GDPR,
   :foaf/homepage        {:rdfa/uri "http://www.dataprotection.gov.cy/"},
   :rdf/type             [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString
                          "Commissioner for Personal Data Protection@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-CZ
  "Office for Personal Data Protection"
  {:db/ident             :dpvo-legal/DPA-CZ,
   :dcterms/created      #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator      {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/CZ,
   :dpvo/hasLaw          :dpvo-legal/EU-GDPR,
   :foaf/homepage        {:rdfa/uri "https://www.uoou.cz/"},
   :rdf/type             [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString
                          "Office for Personal Data Protection@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-DE
  "The Federal Commissioner for Data Protection and Freedom of Information"
  {:db/ident :dpvo-legal/DPA-DE,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/DE,
   :dpvo/hasLaw [:dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG],
   :foaf/homepage {:rdfa/uri "http://www.bfdi.bund.de/"},
   :rdf/type [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   #xsd/langString
    "The Federal Commissioner for Data Protection and Freedom of Information@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def DPA-DE-BB
  {:db/ident :dpvo-legal/DPA-DE-BB,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}],
   :dpvo/hasJurisdiction :dpvo-legal/DE-BB,
   :dpvo/hasLaw
   [:dpvo-legal/DE-BDSG :dpvo-legal/EU-GDPR :dpvo-legal/DE-BE-BbgDSG],
   :foaf/homepage {:rdfa/uri "https://www.lda.brandenburg.de/"},
   :rdf/type [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   [#xsd/langString
     "The state representative for data protection and the right to inspect files in Brandenburg@en"
    #xsd/langString
     "Die Landesbeauftragte für den Datenschutz und für das Recht auf Akteneinsicht Brandenburg@de"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DPA-DE-BE
  {:db/ident :dpvo-legal/DPA-DE-BE,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dpvo/hasJurisdiction :dpvo-legal/DE-BE,
   :dpvo/hasLaw
   [:dpvo-legal/DE-BE-BlnDSG :dpvo-legal/DE-BDSG :dpvo-legal/EU-GDPR],
   :foaf/homepage {:rdfa/uri "https://www.datenschutz-berlin.de/"},
   :rdf/type [:owl/NamedIndividual :dpvo/DataProtectionAuthority],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   [#xsd/langString
     "Berliner Beauftragte für Datenschutz und Informationsfreiheit@de"
    #xsd/langString
     "Berlin Commissioner for Data Protection and Freedom of Information@en"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DPA-DE-BY-non-public
  {:db/ident :dpvo-legal/DPA-DE-BY-non-public,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dpvo/hasJurisdiction :dpvo-legal/DE-BY,
   :dpvo/hasLaw
   [:dpvo-legal/DE-BDSG :dpvo-legal/EU-GDPR :dpvo-legal/DE-BY-BayDSG],
   :foaf/homepage {:rdfa/uri "https://www.lda.bayern.de/"},
   :rdf/type [:owl/NamedIndividual :dpvo/DataProtectionAuthority],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   [#xsd/langString "Bayerisches Landesamt für Datenschutzaufsicht@de"
    #xsd/langString "Bavarian State Office for Data Protection Supervision@en"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DPA-DE-BY-public
  {:db/ident :dpvo-legal/DPA-DE-BY-public,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dpvo/hasJurisdiction :dpvo-legal/DE-BY,
   :dpvo/hasLaw
   [:dpvo-legal/DE-BY-BayDSG :dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG],
   :foaf/homepage {:rdfa/uri "https://www.datenschutz-bayern.de/"},
   :rdf/type [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   [#xsd/langString "The Bavarian State Commissioner for Data Protection@en"
    #xsd/langString "Der Bayerische Landesbeauftragte für den Datenschutz@de"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DPA-DE-HB
  {:db/ident :dpvo-legal/DPA-DE-HB,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}],
   :dpvo/hasJurisdiction :dpvo-legal/DE-HB,
   :dpvo/hasLaw
   [:dpvo-legal/EU-GDPR :dpvo-legal/DE-HB-BremDSGVOAG :dpvo-legal/DE-BDSG],
   :foaf/homepage {:rdfa/uri "https://www.datenschutz.bremen.de/"},
   :rdf/type [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   [#xsd/langString
     "Die Landesbeauftragte für Datenschutz und Informationsfreiheit der Freien Hansestadt Bremen@de"
    #xsd/langString
     "The State Commissioner for Data Protection and Freedom of Information of the Free Hanseatic City of Bremen@en"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DPA-DE-HE
  {:db/ident :dpvo-legal/DPA-DE-HE,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dpvo/hasJurisdiction :dpvo-legal/DE-HE,
   :dpvo/hasLaw
   [:dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG :dpvo-legal/DE-HE-HDISG],
   :foaf/homepage {:rdfa/uri "https://www.datenschutz.hessen.de/"},
   :rdf/type [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   [#xsd/langString
     "Der Hessische Beauftragte für Datenschutz und Informationsfreiheit@de"
    #xsd/langString
     "The Hessian Commissioner for Data Protection and Freedom of Information@en"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DPA-DE-HH
  {:db/ident :dpvo-legal/DPA-DE-HH,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}],
   :dpvo/hasJurisdiction :dpvo-legal/DE-HH,
   :dpvo/hasLaw
   [:dpvo-legal/EU-GDPR :dpvo-legal/DE-HH-HmbDSG :dpvo-legal/DE-BDSG],
   :foaf/homepage {:rdfa/uri "https://www.datenschutz-hamburg.de/"},
   :rdf/type [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   [#xsd/langString
     "Der Hamburgische Beauftragte für Datenschutz und Informationsfreiheit@de"
    #xsd/langString
     "The Hamburg Commissioner for Data Protection and Freedom of Information@en"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DPA-DE-MV
  {:db/ident :dpvo-legal/DPA-DE-MV,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dpvo/hasJurisdiction :dpvo-legal/DE-MV,
   :dpvo/hasLaw [:dpvo-legal/DE-MV-DSG :dpvo-legal/DE-BDSG :dpvo-legal/EU-GDPR],
   :foaf/homepage {:rdfa/uri "https://www.datenschutz-mv.de/"},
   :rdf/type [:owl/NamedIndividual :dpvo/DataProtectionAuthority],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   [#xsd/langString
     "The State Commissioner for Data Protection and Freedom of Information Mecklenburg-West Pomerania@en"
    #xsd/langString
     "Der Landesbeauftragte für Datenschutz und Informationsfreiheit Mecklenburg-Vorpommern@de"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DPA-DE-NI
  {:db/ident :dpvo-legal/DPA-DE-NI,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}],
   :dpvo/hasJurisdiction :dpvo-legal/DE-NI,
   :dpvo/hasLaw
   [:dpvo-legal/EU-GDPR :dpvo-legal/DE-NI-NDSG :dpvo-legal/DE-BDSG],
   :foaf/homepage {:rdfa/uri "https://www.lfd.niedersachsen.de/"},
   :rdf/type [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label [#xsd/langString
                 "The State Commissioner for Data Protection Lower Saxony@en"
                #xsd/langString
                 "Die Landesbeauftragte für den Datenschutz Niedersachsen@de"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DPA-DE-NW
  {:db/ident :dpvo-legal/DPA-DE-NW,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}],
   :dpvo/hasJurisdiction :dpvo-legal/DE-NW,
   :dpvo/hasLaw [:dpvo-legal/DE-BDSG :dpvo-legal/DE-NW-DSG :dpvo-legal/EU-GDPR],
   :foaf/homepage {:rdfa/uri "https://www.ldi.nrw.de/"},
   :rdf/type [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   [#xsd/langString
     "Landesbeauftragte für Datenschutz und Informationsfreiheit Nordrhein-Westfalen@de"
    #xsd/langString
     "State Commissioner for Data Protection and Freedom of Information North Rhine-Westphalia@en"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DPA-DE-RP
  {:db/ident :dpvo-legal/DPA-DE-RP,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasLaw
   [:dpvo-legal/DE-RP-LDSG :dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG],
   :foaf/homepage {:rdfa/uri "https://www.datenschutz.rlp.de/"},
   :rdf/type [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   [#xsd/langString
     "The state commissioner for data protection and freedom of information in Rhineland-Palatinate@en"
    #xsd/langString
     "Der Landesbeauftragte für den Datenschutz und die Informationsfreiheit Rheinland-Pfalz@de"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DPA-DE-SH
  {:db/ident :dpvo-legal/DPA-DE-SH,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}],
   :dpvo/hasJurisdiction :dpvo-legal/DE-SH,
   :dpvo/hasLaw
   [:dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG :dpvo-legal/DE-SH-LDSG],
   :foaf/homepage {:rdfa/uri "https://www.datenschutzzentrum.de/"},
   :rdf/type [:owl/NamedIndividual :dpvo/DataProtectionAuthority],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   [#xsd/langString
     "Independent State Center for Data Protection Schleswig-Holstein@en"
    #xsd/langString
     "Unabhängiges Landeszentrum für Datenschutz Schleswig-Holstein@de"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DPA-DE-SL
  {:db/ident :dpvo-legal/DPA-DE-SL,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dpvo/hasJurisdiction :dpvo-legal/DE-SL,
   :dpvo/hasLaw
   [:dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG :dpvo-legal/DE-SL-SDSG],
   :foaf/homepage {:rdfa/uri "https://www.datenschutz.saarland.de/"},
   :rdf/type [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   [#xsd/langString
     "Unabhängiges Datenschutzzentrum Saarland - Landesbeauftragte für Datenschutz und Informationsfreiheit@de"
    #xsd/langString
     "Independent Data Protection Center Saarland - State Commissioner for Data Protection and Freedom of Information@en"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DPA-DE-SN
  {:db/ident             :dpvo-legal/DPA-DE-SN,
   :dcterms/created      #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator      [{:xsd/string "Julian Flake"}
                          {:xsd/string "Harshvardhan J. Pandit"}],
   :dpvo/hasJurisdiction :dpvo-legal/DE-SN,
   :dpvo/hasLaw          [:dpvo-legal/DE-BDSG
                          :dpvo-legal/DE-SN-SächsDSG
                          :dpvo-legal/EU-GDPR],
   :foaf/homepage        {:rdfa/uri "https://www.saechsdsb.de/"},
   :rdf/type             [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           [#xsd/langString
                           "Die Sächsische Datenschutzbeauftragte@de"
                          #xsd/langString
                           "The Saxon data protection officer@en"],
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-DE-ST
  {:db/ident :dpvo-legal/DPA-DE-ST,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}],
   :dpvo/hasJurisdiction :dpvo-legal/DE-ST,
   :dpvo/hasLaw
   [:dpvo-legal/EU-GDPR :dpvo-legal/DE-LSA-DSG :dpvo-legal/DE-BDSG],
   :foaf/homepage {:rdfa/uri "https://datenschutz.sachsen-anhalt.de/"},
   :rdf/type [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label [#xsd/langString
                 "State representative for data protection in Saxony-Anhalt@en"
                #xsd/langString
                 "Landesbeauftragter für den Datenschutz Sachsen-Anhalt@de"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DPA-DE-TH
  {:db/ident :dpvo-legal/DPA-DE-TH,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dpvo/hasJurisdiction :dpvo-legal/DE-TH,
   :dpvo/hasLaw
   [:dpvo-legal/DE-TH-ThürDSG :dpvo-legal/DE-BDSG :dpvo-legal/EU-GDPR],
   :foaf/homepage {:rdfa/uri "https://www.tlfdi.de/"},
   :rdf/type [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   [#xsd/langString
     "Thuringia state commissioner for data protection and freedom of information@en"
    #xsd/langString
     "Thüringer Landesbeauftragter für den Datenschutz und die Informationsfreiheit@de"],
   :vs/term_status #xsd/langString "accepted@en"})

(def DPA-DK
  "Danish Data Protection Agency"
  {:db/ident             :dpvo-legal/DPA-DK,
   :dcterms/created      #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator      {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/DK,
   :dpvo/hasLaw          :dpvo-legal/EU-GDPR,
   :foaf/homepage        {:rdfa/uri "http://www.datatilsynet.dk/"},
   :rdf/type             [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString "Danish Data Protection Agency@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-EE
  "Estonian Data Protection Inspectorate"
  {:db/ident             :dpvo-legal/DPA-EE,
   :dcterms/created      #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator      {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/EE,
   :dpvo/hasLaw          :dpvo-legal/EU-GDPR,
   :foaf/homepage        {:rdfa/uri "http://www.aki.ee/"},
   :rdf/type             [:owl/NamedIndividual :dpvo/DataProtectionAuthority],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString
                          "Estonian Data Protection Inspectorate@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-ES
  "Spanish Data Protection Agency (AEPD)"
  {:db/ident             :dpvo-legal/DPA-ES,
   :dcterms/created      #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator      {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/ES,
   :dpvo/hasLaw          :dpvo-legal/EU-GDPR,
   :foaf/homepage        {:rdfa/uri "https://www.aepd.es/"},
   :rdf/type             [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString
                          "Spanish Data Protection Agency (AEPD)@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-EU-EDPS
  "European Data Protection Supervisor"
  {:db/ident             :dpvo-legal/DPA-EU-EDPS,
   :dcterms/created      #xsd/date #inst "2023-06-16T00:00:00.000-04:00",
   :dpvo/hasJurisdiction :dpvo-legal/EU,
   :dpvo/hasLaw          :dpvo-legal/EU-GDPR,
   :foaf/homepage        {:rdfa/uri "https://edps.europa.eu/"},
   :rdf/type             [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString
                          "European Data Protection Supervisor@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-FI
  "Office of the Data Protection Ombudsman"
  {:db/ident             :dpvo-legal/DPA-FI,
   :dcterms/created      #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator      {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/FI,
   :dpvo/hasLaw          :dpvo-legal/EU-GDPR,
   :foaf/homepage        {:rdfa/uri "https://tietosuoja.fi/"},
   :rdf/type             [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString
                          "Office of the Data Protection Ombudsman@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-FR
  "National Commission on Informatics and Liberty (CNIL)"
  {:db/ident :dpvo-legal/DPA-FR,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/FR,
   :dpvo/hasLaw :dpvo-legal/EU-GDPR,
   :foaf/homepage {:rdfa/uri "https://www.cnil.fr/"},
   :rdf/type [:owl/NamedIndividual :dpvo/DataProtectionAuthority],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString
                "National Commission on Informatics and Liberty (CNIL)@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def DPA-GB
  "Information Commissioner's Office"
  {:db/ident             :dpvo-legal/DPA-GB,
   :dcterms/created      #xsd/date #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator      {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/GB,
   :dpvo/hasLaw          [:dpvo-legal/UK-GDPR :dpvo-legal/UK-DPA-2018],
   :foaf/homepage        {:rdfa/uri "https://ico.org.uk/"},
   :rdf/type             [:owl/NamedIndividual :dpvo/DataProtectionAuthority],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString "Information Commissioner's Office@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-GR
  "Hellenic Data Protection Authority"
  {:db/ident             :dpvo-legal/DPA-GR,
   :dcterms/created      #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator      {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/GR,
   :dpvo/hasLaw          :dpvo-legal/EU-GDPR,
   :foaf/homepage        {:rdfa/uri "http://dpa.gr"},
   :rdf/type             [:owl/NamedIndividual :dpvo/DataProtectionAuthority],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString
                          "Hellenic Data Protection Authority@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-HR
  "Croatian Personal Data Protection Agency"
  {:db/ident             :dpvo-legal/DPA-HR,
   :dcterms/created      #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator      {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/HR,
   :dpvo/hasLaw          :dpvo-legal/EU-GDPR,
   :foaf/homepage        {:rdfa/uri "http://www.azop.hr/"},
   :rdf/type             [:owl/NamedIndividual :dpvo/DataProtectionAuthority],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString
                          "Croatian Personal Data Protection Agency@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-HU
  "Hungarian National Authority for Data Protection and Freedom of Information"
  {:db/ident :dpvo-legal/DPA-HU,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/HU,
   :dpvo/hasLaw :dpvo-legal/EU-GDPR,
   :foaf/homepage {:rdfa/uri "http://www.naih.hu/"},
   :rdf/type [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   #xsd/langString
    "Hungarian National Authority for Data Protection and Freedom of Information@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def DPA-IE
  "Data Protection Commission (DPC)"
  {:db/ident             :dpvo-legal/DPA-IE,
   :dcterms/created      #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator      {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/IE,
   :dpvo/hasLaw          :dpvo-legal/EU-GDPR,
   :foaf/homepage        {:rdfa/uri "http://www.dataprotection.ie"},
   :rdf/type             [:owl/NamedIndividual :dpvo/DataProtectionAuthority],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString "Data Protection Commission (DPC)@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-IS
  "Icelandic Data Protection Authority"
  {:db/ident             :dpvo-legal/DPA-IS,
   :dcterms/created      #xsd/date #inst "2023-06-16T00:00:00.000-04:00",
   :dpvo/hasJurisdiction :dpvo-legal/IS,
   :dpvo/hasLaw          :dpvo-legal/EU-GDPR,
   :foaf/homepage        {:rdfa/uri "https://www.dpa.is/"},
   :rdf/type             [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString
                          "Icelandic Data Protection Authority@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-IT
  "Data Protection Commission"
  {:db/ident             :dpvo-legal/DPA-IT,
   :dcterms/created      #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator      {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/IT,
   :dpvo/hasLaw          :dpvo-legal/EU-GDPR,
   :foaf/homepage        {:rdfa/uri "https://www.garanteprivacy.it/"},
   :rdf/type             [:owl/NamedIndividual :dpvo/DataProtectionAuthority],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString "Data Protection Commission@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-LT
  "State Data Protection Inspectorate"
  {:db/ident             :dpvo-legal/DPA-LT,
   :dcterms/created      #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator      {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/LT,
   :dpvo/hasLaw          :dpvo-legal/EU-GDPR,
   :foaf/homepage        {:rdfa/uri "https://ada.lt"},
   :rdf/type             [:owl/NamedIndividual :dpvo/DataProtectionAuthority],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString
                          "State Data Protection Inspectorate@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-LU
  "National Commission for Data Protection"
  {:db/ident             :dpvo-legal/DPA-LU,
   :dcterms/created      #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator      {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/LU,
   :dpvo/hasLaw          :dpvo-legal/EU-GDPR,
   :foaf/homepage        {:rdfa/uri "https://cnpd.public.lu"},
   :rdf/type             [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString
                          "National Commission for Data Protection@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-LV
  "Data State Inspectorate"
  {:db/ident             :dpvo-legal/DPA-LV,
   :dcterms/created      #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator      {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/LV,
   :dpvo/hasLaw          :dpvo-legal/EU-GDPR,
   :foaf/homepage        {:rdfa/uri "http://www.dvi.gov.lv/"},
   :rdf/type             [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString "Data State Inspectorate@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-MT
  "Office of the Information and Data Protection Commissioner"
  {:db/ident :dpvo-legal/DPA-MT,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/MT,
   :dpvo/hasLaw :dpvo-legal/EU-GDPR,
   :foaf/homepage {:rdfa/uri "https://idpc.org.mt"},
   :rdf/type [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString
                "Office of the Information and Data Protection Commissioner@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def DPA-NL
  "Dutch Data Protection Authority"
  {:db/ident             :dpvo-legal/DPA-NL,
   :dcterms/created      #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator      {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/NL,
   :dpvo/hasLaw          :dpvo-legal/EU-GDPR,
   :foaf/homepage        {:rdfa/uri "https://autoriteitpersoonsgegevens.nl"},
   :rdf/type             [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString "Dutch Data Protection Authority@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-PL
  "Personal Data Protection Office"
  {:db/ident             :dpvo-legal/DPA-PL,
   :dcterms/created      #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator      {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/PL,
   :dpvo/hasLaw          :dpvo-legal/EU-GDPR,
   :foaf/homepage        {:rdfa/uri "https://uodo.gov.pl/"},
   :rdf/type             [:owl/NamedIndividual :dpvo/DataProtectionAuthority],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString "Personal Data Protection Office@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-PT
  "Comissão Nacional de Protecção de Dados"
  {:db/ident             :dpvo-legal/DPA-PT,
   :dcterms/created      #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator      {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/PT,
   :dpvo/hasLaw          :dpvo-legal/EU-GDPR,
   :foaf/homepage        {:rdfa/uri "https://www.cnpd.pt"},
   :rdf/type             [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString
                          "Comissão Nacional de Protecção de Dados@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-RO
  "National Supervisory Authority for Personal Data Processing"
  {:db/ident :dpvo-legal/DPA-RO,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/RO,
   :dpvo/hasLaw :dpvo-legal/EU-GDPR,
   :foaf/homepage {:rdfa/uri "http://www.dataprotection.ro/"},
   :rdf/type [:owl/NamedIndividual :dpvo/DataProtectionAuthority],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   #xsd/langString
    "National Supervisory Authority for Personal Data Processing@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def DPA-SE
  "Swedish Authority for Privacy Protection"
  {:db/ident             :dpvo-legal/DPA-SE,
   :dcterms/created      #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator      {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/SE,
   :dpvo/hasLaw          :dpvo-legal/EU-GDPR,
   :foaf/homepage        {:rdfa/uri "https://www.imy.se/"},
   :rdf/type             [:owl/NamedIndividual :dpvo/DataProtectionAuthority],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString
                          "Swedish Authority for Privacy Protection@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-SI
  "Information Commissioner of the Republic of Slovenia"
  {:db/ident :dpvo-legal/DPA-SI,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/SI,
   :dpvo/hasLaw :dpvo-legal/EU-GDPR,
   :foaf/homepage {:rdfa/uri "https://www.ip-rs.si/"},
   :rdf/type [:owl/NamedIndividual :dpvo/DataProtectionAuthority],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString
                "Information Commissioner of the Republic of Slovenia@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def DPA-SK
  "Office for Personal Data Protection of the Slovak Republic"
  {:db/ident :dpvo-legal/DPA-SK,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dpvo/hasJurisdiction :dpvo-legal/SK,
   :dpvo/hasLaw :dpvo-legal/EU-GDPR,
   :foaf/homepage {:rdfa/uri "http://www.dataprotection.gov.sk/"},
   :rdf/type [:owl/NamedIndividual :dpvo/DataProtectionAuthority],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString
                "Office for Personal Data Protection of the Slovak Republic@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def DPA-US-CO
  "Colorado Attorney General"
  {:db/ident             :dpvo-legal/DPA-US-CO,
   :dcterms/created      #xsd/date #inst "2022-11-23T00:00:00.000-05:00",
   :dcterms/creator      {:xsd/string "Jonathan Bowker"},
   :dpvo/hasJurisdiction :dpvo-legal/US-CO,
   :dpvo/hasLaw          :dpvo-legal/US-CO-CPA,
   :foaf/homepage        {:rdfa/uri "https://coag.gov"},
   :rdf/type             [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString "Colorado Attorney General@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-US-CT
  "Connecticut Attorney General"
  {:db/ident             :dpvo-legal/DPA-US-CT,
   :dcterms/created      #xsd/date #inst "2022-11-23T00:00:00.000-05:00",
   :dcterms/creator      {:xsd/string "Jonathan Bowker"},
   :dpvo/hasJurisdiction :dpvo-legal/US-CT,
   :dpvo/hasLaw          :dpvo-legal/US-CT-CTPA,
   :foaf/homepage        {:rdfa/uri "https://portal.ct.gov/AG"},
   :rdf/type             [:owl/NamedIndividual :dpvo/DataProtectionAuthority],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString "Connecticut Attorney General@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-US-NV
  "Nevada Attorney General"
  {:db/ident             :dpvo-legal/DPA-US-NV,
   :dcterms/created      #xsd/date #inst "2022-11-23T00:00:00.000-05:00",
   :dcterms/creator      {:xsd/string "Jonathan Bowker"},
   :dpvo/hasJurisdiction :dpvo-legal/US-NV,
   :dpvo/hasLaw          :dpvo-legal/US-NV-NPICICA,
   :foaf/homepage        {:rdfa/uri "https://ag.nv.gov/"},
   :rdf/type             [:owl/NamedIndividual :dpvo/DataProtectionAuthority],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString "Nevada Attorney General@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-US-UT
  "Utah Attorney General"
  {:db/ident             :dpvo-legal/DPA-US-UT,
   :dcterms/created      #xsd/date #inst "2022-11-22T00:00:00.000-05:00",
   :dcterms/creator      {:xsd/string "Jonathan Bowker"},
   :dpvo/hasJurisdiction :dpvo-legal/US-UT,
   :dpvo/hasLaw          :dpvo-legal/US-UT-UCPA,
   :foaf/homepage        {:rdfa/uri "https://attorneygeneral.utah.gov/"},
   :rdf/type             [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString "Utah Attorney General@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPA-US-VA
  "Virginia Attorney General"
  {:db/ident             :dpvo-legal/DPA-US-VA,
   :dcterms/created      #xsd/date #inst "2022-11-23T00:00:00.000-05:00",
   :dcterms/creator      {:xsd/string "Jonathan Bowker"},
   :dpvo/hasJurisdiction :dpvo-legal/US-VA,
   :dpvo/hasLaw          :dpvo-legal/US-VA-VCDPA,
   :foaf/homepage        {:rdfa/uri "https://www.oag.state.va.us"},
   :rdf/type             [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString "Virginia Attorney General@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPV-LI
  "Liechtenstein Data Protection Authority"
  {:db/ident             :dpvo-legal/DPV-LI,
   :dcterms/created      #xsd/date #inst "2023-06-16T00:00:00.000-04:00",
   :dpvo/hasJurisdiction :dpvo-legal/LI,
   :dpvo/hasLaw          :dpvo-legal/EU-GDPR,
   :foaf/homepage        {:rdfa/uri "https://www.datenschutzstelle.li/"},
   :rdf/type             [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString
                          "Liechtenstein Data Protection Authority@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DPV-NO
  "Norwegian Data Protection Authority"
  {:db/ident             :dpvo-legal/DPV-NO,
   :dcterms/created      #xsd/date #inst "2023-06-16T00:00:00.000-04:00",
   :dpvo/hasJurisdiction :dpvo-legal/NO,
   :dpvo/hasLaw          :dpvo-legal/EU-GDPR,
   :foaf/homepage        {:rdfa/uri "https://www.datatilsynet.no/"},
   :rdf/type             [:dpvo/DataProtectionAuthority :owl/NamedIndividual],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString
                          "Norwegian Data Protection Authority@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def DZ
  "DZ"
  {:db/ident               :dpvo-legal/DZ,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/NorthernAfrica :dpvo-legal/Africa],
   :dpvo-legal/iso_alpha2  "DZ",
   :dpvo-legal/iso_alpha3  "DZA",
   :dpvo-legal/iso_numeric "12",
   :dpvo-legal/un_m49      "12",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Algeria@en",
   :skos/altLabel          ["DZ" "DZA" "12"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def EC
  "EC"
  {:db/ident               :dpvo-legal/EC,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Americas
                            :dpvo-legal/SouthAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean],
   :dpvo-legal/iso_alpha2  "EC",
   :dpvo-legal/iso_alpha3  "ECU",
   :dpvo-legal/iso_numeric "218",
   :dpvo-legal/un_m49      "218",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Ecuador@en",
   :skos/altLabel          ["EC" "ECU" "218"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def EE
  "EE"
  {:db/ident               :dpvo-legal/EE,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EU27
                            :dpvo-legal/EU28
                            :dpvo-legal/EEA
                            :dpvo-legal/EEA31
                            :dpvo-legal/EU
                            :dpvo-legal/EEA30],
   :dcterms/isPartOf       [:dpvo-legal/NorthernEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "EE",
   :dpvo-legal/iso_alpha3  "EST",
   :dpvo-legal/iso_numeric "233",
   :dpvo-legal/un_m49      "233",
   :dpvo/hasAuthority      :dpvo-legal/DPA-EE,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Estonia@en",
   :skos/altLabel          ["EE" "EST" "233"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def EEA
  "European Economic Area (EEA)"
  {:db/ident         :dpvo-legal/EEA,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/EEA30 :dpvo-legal/EEA31],
   :dcterms/isPartOf [:dpvo-legal/AT
                      :dpvo-legal/SK
                      :dpvo-legal/CY
                      :dpvo-legal/FR
                      :dpvo-legal/GR
                      :dpvo-legal/NL
                      :dpvo-legal/PT
                      :dpvo-legal/LV
                      :dpvo-legal/HU
                      :dpvo-legal/FI
                      :dpvo-legal/ES
                      :dpvo-legal/PL
                      :dpvo-legal/LT
                      :dpvo-legal/BG
                      :dpvo-legal/DK
                      :dpvo-legal/IT
                      :dpvo-legal/SI
                      :dpvo-legal/HR
                      :dpvo-legal/EE
                      :dpvo-legal/DE
                      :dpvo-legal/RO
                      :dpvo-legal/MT
                      :dpvo-legal/CZ
                      :dpvo-legal/BE
                      :dpvo-legal/IE
                      :dpvo-legal/SE
                      :dpvo-legal/LU],
   :dpvo/hasCountry  [:dpvo-legal/CY
                      :dpvo-legal/BG
                      :dpvo-legal/HU
                      :dpvo-legal/PT
                      :dpvo-legal/FI
                      :dpvo-legal/PL
                      :dpvo-legal/HR
                      :dpvo-legal/FR
                      :dpvo-legal/AT
                      :dpvo-legal/GR
                      :dpvo-legal/NL
                      :dpvo-legal/DE
                      :dpvo-legal/IE
                      :dpvo-legal/CZ
                      :dpvo-legal/SE
                      :dpvo-legal/SI
                      :dpvo-legal/EE
                      :dpvo-legal/BE
                      :dpvo-legal/IT
                      :dpvo-legal/SK
                      :dpvo-legal/LV
                      :dpvo-legal/LT
                      :dpvo-legal/LU
                      :dpvo-legal/DK
                      :dpvo-legal/MT
                      :dpvo-legal/RO
                      :dpvo-legal/ES],
   :rdf/type         [:dpvo/SupraNationalUnion :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "European Economic Area (EEA)@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def EEA30
  "European Economic Area (EEA-30)"
  {:db/ident         :dpvo-legal/EEA30,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf [:dpvo-legal/SK
                      :dpvo-legal/LU
                      :dpvo-legal/CY
                      :dpvo-legal/EEA
                      :dpvo-legal/ES
                      :dpvo-legal/RO
                      :dpvo-legal/GR
                      :dpvo-legal/HR
                      :dpvo-legal/CZ
                      :dpvo-legal/HU
                      :dpvo-legal/FI
                      :dpvo-legal/SI
                      :dpvo-legal/PL
                      :dpvo-legal/BG
                      :dpvo-legal/NL
                      :dpvo-legal/AT
                      :dpvo-legal/FR
                      :dpvo-legal/PT
                      :dpvo-legal/IE
                      :dpvo-legal/SE
                      :dpvo-legal/DK
                      :dpvo-legal/IT
                      :dpvo-legal/LV
                      :dpvo-legal/MT
                      :dpvo-legal/BE
                      :dpvo-legal/DE
                      :dpvo-legal/LT
                      :dpvo-legal/EE],
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning {:time/inXSDDate
                                          #xsd/date
                                           #inst
                                            "2020-02-01T00:00:00.000-05:00"}},
   :dpvo/hasCountry  [:dpvo-legal/IT
                      :dpvo-legal/SK
                      :dpvo-legal/HR
                      :dpvo-legal/AT
                      :dpvo-legal/FR
                      :dpvo-legal/MT
                      :dpvo-legal/NL
                      :dpvo-legal/BG
                      :dpvo-legal/HU
                      :dpvo-legal/EE
                      :dpvo-legal/ES
                      :dpvo-legal/CY
                      :dpvo-legal/GR
                      :dpvo-legal/FI
                      :dpvo-legal/PL
                      :dpvo-legal/LT
                      :dpvo-legal/DE
                      :dpvo-legal/LV
                      :dpvo-legal/RO
                      :dpvo-legal/IE
                      :dpvo-legal/DK
                      :dpvo-legal/SE
                      :dpvo-legal/SI
                      :dpvo-legal/PT
                      :dpvo-legal/LU
                      :dpvo-legal/BE
                      :dpvo-legal/CZ],
   :rdf/type         [:dpvo/SupraNationalUnion :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "European Economic Area (EEA-30)@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def EEA31
  "European Economic Area (EEA-31)"
  {:db/ident         :dpvo-legal/EEA31,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf [:dpvo-legal/BE
                      :dpvo-legal/DE
                      :dpvo-legal/IT
                      :dpvo-legal/DK
                      :dpvo-legal/RO
                      :dpvo-legal/LV
                      :dpvo-legal/EE
                      :dpvo-legal/AT
                      :dpvo-legal/MT
                      :dpvo-legal/CZ
                      :dpvo-legal/PL
                      :dpvo-legal/SE
                      :dpvo-legal/LT
                      :dpvo-legal/SI
                      :dpvo-legal/LU
                      :dpvo-legal/IE
                      :dpvo-legal/FI
                      :dpvo-legal/NL
                      :dpvo-legal/GR
                      :dpvo-legal/HR
                      :dpvo-legal/BG
                      :dpvo-legal/PT
                      :dpvo-legal/HU
                      :dpvo-legal/GB
                      :dpvo-legal/ES
                      :dpvo-legal/SK
                      :dpvo-legal/CY
                      :dpvo-legal/EEA
                      :dpvo-legal/FR],
   :dcterms/temporal {:rdf/type          :time/ProperInterval,
                      :time/hasBeginning {:time/inXSDDate
                                          #xsd/date
                                           #inst
                                            "2014-04-12T00:00:00.000-04:00"},
                      :time/hasEnd       {:time/inXSDDate
                                          #xsd/date
                                           #inst
                                            "2020-01-31T00:00:00.000-05:00"}},
   :dpvo/hasCountry  [:dpvo-legal/GR
                      :dpvo-legal/SI
                      :dpvo-legal/NL
                      :dpvo-legal/BG
                      :dpvo-legal/LT
                      :dpvo-legal/CZ
                      :dpvo-legal/SK
                      :dpvo-legal/LV
                      :dpvo-legal/SE
                      :dpvo-legal/EE
                      :dpvo-legal/FI
                      :dpvo-legal/DE
                      :dpvo-legal/AT
                      :dpvo-legal/CY
                      :dpvo-legal/DK
                      :dpvo-legal/PL
                      :dpvo-legal/LU
                      :dpvo-legal/IT
                      :dpvo-legal/GB
                      :dpvo-legal/HR
                      :dpvo-legal/ES
                      :dpvo-legal/FR
                      :dpvo-legal/PT
                      :dpvo-legal/MT
                      :dpvo-legal/BE
                      :dpvo-legal/RO
                      :dpvo-legal/IE
                      :dpvo-legal/HU],
   :rdf/type         [:owl/NamedIndividual :dpvo/SupraNationalUnion],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "European Economic Area (EEA-31)@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def EG
  "EG"
  {:db/ident               :dpvo-legal/EG,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Africa :dpvo-legal/NorthernAfrica],
   :dpvo-legal/iso_alpha2  "EG",
   :dpvo-legal/iso_alpha3  "EGY",
   :dpvo-legal/iso_numeric "818",
   :dpvo-legal/un_m49      "818",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Egypt@en",
   :skos/altLabel          ["EG" "EGY" "818"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def EH
  "EH"
  {:db/ident               :dpvo-legal/EH,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Africa :dpvo-legal/NorthernAfrica],
   :dpvo-legal/iso_alpha2  "EH",
   :dpvo-legal/iso_alpha3  "ESH",
   :dpvo-legal/iso_numeric "732",
   :dpvo-legal/un_m49      "732",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Western Sahara@en",
   :skos/altLabel          ["EH" "ESH" "732"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def ER
  "ER"
  {:db/ident               :dpvo-legal/ER,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica],
   :dpvo-legal/iso_alpha2  "ER",
   :dpvo-legal/iso_alpha3  "ERI",
   :dpvo-legal/iso_numeric "232",
   :dpvo-legal/un_m49      "232",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Eritrea@en",
   :skos/altLabel          ["ER" "ERI" "232"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def ES
  "ES"
  {:db/ident               :dpvo-legal/ES,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EU
                            :dpvo-legal/EU28
                            :dpvo-legal/EEA30
                            :dpvo-legal/EU27
                            :dpvo-legal/EEA
                            :dpvo-legal/EEA31],
   :dcterms/isPartOf       [:dpvo-legal/Europe :dpvo-legal/SouthernEurope],
   :dpvo-legal/iso_alpha2  "ES",
   :dpvo-legal/iso_alpha3  "ESP",
   :dpvo-legal/iso_numeric "724",
   :dpvo-legal/un_m49      "724",
   :dpvo/hasAuthority      :dpvo-legal/DPA-ES,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Spain@en",
   :skos/altLabel          ["ES" "ESP" "724"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def ET
  "ET"
  {:db/ident               :dpvo-legal/ET,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica
                            :dpvo-legal/Africa],
   :dpvo-legal/iso_alpha2  "ET",
   :dpvo-legal/iso_alpha3  "ETH",
   :dpvo-legal/iso_numeric "231",
   :dpvo-legal/un_m49      "231",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Ethiopia@en",
   :skos/altLabel          ["ET" "ETH" "231"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def EU
  "European Union (EU)"
  {:db/ident          :dpvo-legal/EU,
   :dcterms/created   #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator   {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart   [:dpvo-legal/EU27 :dpvo-legal/EU28],
   :dcterms/isPartOf  [:dpvo-legal/LV
                       :dpvo-legal/LU
                       :dpvo-legal/BE
                       :dpvo-legal/NL
                       :dpvo-legal/HU
                       :dpvo-legal/CZ
                       :dpvo-legal/SI
                       :dpvo-legal/HR
                       :dpvo-legal/SK
                       :dpvo-legal/FR
                       :dpvo-legal/ES
                       :dpvo-legal/AT
                       :dpvo-legal/IT
                       :dpvo-legal/BG
                       :dpvo-legal/EE
                       :dpvo-legal/MT
                       :dpvo-legal/SE
                       :dpvo-legal/PT
                       :dpvo-legal/FI
                       :dpvo-legal/LT
                       :dpvo-legal/CY
                       :dpvo-legal/DK
                       :dpvo-legal/DE
                       :dpvo-legal/IE
                       :dpvo-legal/RO
                       :dpvo-legal/GR
                       :dpvo-legal/PL],
   :dpvo/hasAuthority :dpvo-legal/DPA-EU-EDPS,
   :dpvo/hasCountry   [:dpvo-legal/PL
                       :dpvo-legal/NL
                       :dpvo-legal/MT
                       :dpvo-legal/AT
                       :dpvo-legal/RO
                       :dpvo-legal/LV
                       :dpvo-legal/BE
                       :dpvo-legal/SK
                       :dpvo-legal/CZ
                       :dpvo-legal/LT
                       :dpvo-legal/DK
                       :dpvo-legal/HR
                       :dpvo-legal/GR
                       :dpvo-legal/DE
                       :dpvo-legal/CY
                       :dpvo-legal/ES
                       :dpvo-legal/EE
                       :dpvo-legal/IE
                       :dpvo-legal/SI
                       :dpvo-legal/FR
                       :dpvo-legal/LU
                       :dpvo-legal/IT
                       :dpvo-legal/PT
                       :dpvo-legal/SE
                       :dpvo-legal/HU
                       :dpvo-legal/BG
                       :dpvo-legal/FI],
   :rdf/type          [:dpvo/SupraNationalUnion :owl/NamedIndividual],
   :rdfs/isDefinedBy  {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label        #xsd/langString "European Union (EU)@en",
   :vs/term_status    #xsd/langString "accepted@en"})

(def EU-GDPR
  "General Data Protection Regulation (GDPR)"
  {:db/ident             :dpvo-legal/EU-GDPR,
   :dcterms/created      #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator      {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/temporal     {:rdf/type :time/ProperInterval,
                          :time/hasBeginning
                          {:time/inXSDDate #xsd/date
                                            #inst
                                             "2018-05-25T00:00:00.000-04:00"}},
   :dpvo/hasAuthority    [:dpvo-legal/DPA-PT
                          :dpvo-legal/DPA-FR
                          :dpvo-legal/DPA-DE-BB
                          :dpvo-legal/DPA-SK
                          :dpvo-legal/DPA-CZ
                          :dpvo-legal/DPA-NL
                          :dpvo-legal/DPA-DE-RP
                          :dpvo-legal/DPA-DE-SN
                          :dpvo-legal/DPA-DE
                          :dpvo-legal/DPA-EE
                          :dpvo-legal/DPA-HU
                          :dpvo-legal/DPA-BE
                          :dpvo-legal/DPA-GR
                          :dpvo-legal/DPA-HR
                          :dpvo-legal/DPA-DE-HH
                          :dpvo-legal/DPA-DE-HB
                          :dpvo-legal/DPA-LV
                          :dpvo-legal/DPA-IS
                          :dpvo-legal/DPA-EU-EDPS
                          :dpvo-legal/DPA-DE-BY-non-public
                          :dpvo-legal/DPA-AT
                          :dpvo-legal/DPA-SI
                          :dpvo-legal/DPA-DE-SL
                          :dpvo-legal/DPA-IE
                          :dpvo-legal/DPA-DE-MV
                          :dpvo-legal/DPA-SE
                          :dpvo-legal/DPA-FI
                          :dpvo-legal/DPA-DE-NI
                          :dpvo-legal/DPA-LT
                          :dpvo-legal/DPA-MT
                          :dpvo-legal/DPA-DE-NW
                          :dpvo-legal/DPA-RO
                          :dpvo-legal/DPA-IT
                          :dpvo-legal/DPA-DE-SH
                          :dpvo-legal/DPA-DE-HE
                          :dpvo-legal/DPA-DE-BE
                          :dpvo-legal/DPA-DK
                          :dpvo-legal/DPA-DE-BY-public
                          :dpvo-legal/DPA-CY
                          :dpvo-legal/DPV-LI
                          :dpvo-legal/DPA-BG
                          :dpvo-legal/DPA-DE-TH
                          :dpvo-legal/DPA-PL
                          :dpvo-legal/DPV-NO
                          :dpvo-legal/DPA-LU
                          :dpvo-legal/DPA-ES
                          :dpvo-legal/DPA-DE-ST],
   :dpvo/hasJurisdiction [:dpvo-legal/DE-NW
                          :dpvo-legal/DE-BE
                          :dpvo-legal/DE-ST
                          :dpvo-legal/DE
                          :dpvo-legal/DE-BW
                          :dpvo-legal/PT
                          :dpvo-legal/FR
                          :dpvo-legal/EE
                          :dpvo-legal/BG
                          :dpvo-legal/IT
                          :dpvo-legal/DE-SN
                          :dpvo-legal/DE-HE
                          :dpvo-legal/DE-MV
                          :dpvo-legal/CZ
                          :dpvo-legal/HU
                          :dpvo-legal/SK
                          :dpvo-legal/DE-RP
                          :dpvo-legal/DE-HH
                          :dpvo-legal/LU
                          :dpvo-legal/NL
                          :dpvo-legal/DE-NI
                          :dpvo-legal/IE
                          :dpvo-legal/SI
                          :dpvo-legal/FI
                          :dpvo-legal/MT
                          :dpvo-legal/BE
                          :dpvo-legal/DE-SL
                          :dpvo-legal/DE-HB
                          :dpvo-legal/CY
                          :dpvo-legal/ES
                          :dpvo-legal/SE
                          :dpvo-legal/GR
                          :dpvo-legal/DE-BY
                          :dpvo-legal/PL
                          :dpvo-legal/LV
                          :dpvo-legal/DE-SH
                          :dpvo-legal/LT
                          :dpvo-legal/HR
                          :dpvo-legal/RO
                          :dpvo-legal/DE-TH
                          :dpvo-legal/DK
                          :dpvo-legal/AT
                          :dpvo-legal/DE-BB],
   :foaf/homepage        {:rdfa/uri
                          "http://data.europa.eu/eli/reg/2016/679/oj"},
   :rdf/type             [:dpvo/Law :owl/NamedIndividual],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString
                          "General Data Protection Regulation (GDPR)@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def EU27
  "European Union (EU-27)"
  {:db/ident         :dpvo-legal/EU27,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf [:dpvo-legal/SK
                      :dpvo-legal/MT
                      :dpvo-legal/IE
                      :dpvo-legal/RO
                      :dpvo-legal/PT
                      :dpvo-legal/GR
                      :dpvo-legal/LU
                      :dpvo-legal/BE
                      :dpvo-legal/ES
                      :dpvo-legal/FI
                      :dpvo-legal/CZ
                      :dpvo-legal/DE
                      :dpvo-legal/LT
                      :dpvo-legal/NL
                      :dpvo-legal/FR
                      :dpvo-legal/BG
                      :dpvo-legal/CY
                      :dpvo-legal/SE
                      :dpvo-legal/DK
                      :dpvo-legal/SI
                      :dpvo-legal/EU
                      :dpvo-legal/HU
                      :dpvo-legal/IT
                      :dpvo-legal/EE
                      :dpvo-legal/PL
                      :dpvo-legal/HR
                      :dpvo-legal/AT
                      :dpvo-legal/LV],
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning {:time/inXSDDate
                                          #xsd/date
                                           #inst
                                            "2020-02-01T00:00:00.000-05:00"}},
   :dpvo/hasCountry  [:dpvo-legal/CZ
                      :dpvo-legal/MT
                      :dpvo-legal/DE
                      :dpvo-legal/NL
                      :dpvo-legal/HU
                      :dpvo-legal/BG
                      :dpvo-legal/PL
                      :dpvo-legal/LT
                      :dpvo-legal/PT
                      :dpvo-legal/SK
                      :dpvo-legal/IE
                      :dpvo-legal/FR
                      :dpvo-legal/GR
                      :dpvo-legal/HR
                      :dpvo-legal/LV
                      :dpvo-legal/ES
                      :dpvo-legal/BE
                      :dpvo-legal/FI
                      :dpvo-legal/SI
                      :dpvo-legal/AT
                      :dpvo-legal/LU
                      :dpvo-legal/CY
                      :dpvo-legal/EE
                      :dpvo-legal/SE
                      :dpvo-legal/IT
                      :dpvo-legal/DK
                      :dpvo-legal/RO],
   :rdf/type         [:owl/NamedIndividual :dpvo/SupraNationalUnion],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "European Union (EU-27)@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def EU28
  "European Union (EU-28)"
  {:db/ident         :dpvo-legal/EU28,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf [:dpvo-legal/CY
                      :dpvo-legal/SI
                      :dpvo-legal/LT
                      :dpvo-legal/MT
                      :dpvo-legal/NL
                      :dpvo-legal/PT
                      :dpvo-legal/BG
                      :dpvo-legal/HU
                      :dpvo-legal/AT
                      :dpvo-legal/FR
                      :dpvo-legal/GR
                      :dpvo-legal/HR
                      :dpvo-legal/LV
                      :dpvo-legal/SE
                      :dpvo-legal/CZ
                      :dpvo-legal/RO
                      :dpvo-legal/BE
                      :dpvo-legal/PL
                      :dpvo-legal/FI
                      :dpvo-legal/LU
                      :dpvo-legal/SK
                      :dpvo-legal/EU
                      :dpvo-legal/DK
                      :dpvo-legal/EE
                      :dpvo-legal/IE
                      :dpvo-legal/IT
                      :dpvo-legal/GB
                      :dpvo-legal/ES
                      :dpvo-legal/DE],
   :dcterms/temporal {:rdf/type          :time/ProperInterval,
                      :time/hasBeginning {:time/inXSDDate
                                          #xsd/date
                                           #inst
                                            "2013-07-01T00:00:00.000-04:00"},
                      :time/hasEnd       {:time/inXSDDate
                                          #xsd/date
                                           #inst
                                            "2020-01-31T00:00:00.000-05:00"}},
   :dpvo/hasCountry  [:dpvo-legal/SE
                      :dpvo-legal/SI
                      :dpvo-legal/BE
                      :dpvo-legal/FI
                      :dpvo-legal/PT
                      :dpvo-legal/CY
                      :dpvo-legal/GR
                      :dpvo-legal/LU
                      :dpvo-legal/AT
                      :dpvo-legal/NL
                      :dpvo-legal/PL
                      :dpvo-legal/GB
                      :dpvo-legal/DE
                      :dpvo-legal/LT
                      :dpvo-legal/BG
                      :dpvo-legal/SK
                      :dpvo-legal/RO
                      :dpvo-legal/IE
                      :dpvo-legal/FR
                      :dpvo-legal/HU
                      :dpvo-legal/ES
                      :dpvo-legal/IT
                      :dpvo-legal/DK
                      :dpvo-legal/EE
                      :dpvo-legal/CZ
                      :dpvo-legal/HR
                      :dpvo-legal/LV
                      :dpvo-legal/MT],
   :rdf/type         [:dpvo/SupraNationalUnion :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "European Union (EU-28)@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def EasternAfrica
  "EasternAfrica"
  {:db/ident         :dpvo-legal/EasternAfrica,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/SC
                      :dpvo-legal/TZ
                      :dpvo-legal/RE
                      :dpvo-legal/KE
                      :dpvo-legal/SS
                      :dpvo-legal/UG
                      :dpvo-legal/MG
                      :dpvo-legal/MW
                      :dpvo-legal/ZW
                      :dpvo-legal/DJ
                      :dpvo-legal/KM
                      :dpvo-legal/YT
                      :dpvo-legal/ET
                      :dpvo-legal/SO
                      :dpvo-legal/IO
                      :dpvo-legal/BI
                      :dpvo-legal/TF
                      :dpvo-legal/MU
                      :dpvo-legal/ZM
                      :dpvo-legal/ER
                      :dpvo-legal/RW
                      :dpvo-legal/MZ],
   :dcterms/isPartOf :dpvo-legal/SubSaharanAfrica,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "EasternAfrica@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def EasternAsia
  "EasternAsia"
  {:db/ident         :dpvo-legal/EasternAsia,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/JP
                      :dpvo-legal/CN
                      :dpvo-legal/HK
                      :dpvo-legal/MN
                      :dpvo-legal/MO
                      :dpvo-legal/KR
                      :dpvo-legal/KP],
   :dcterms/isPartOf :dpvo-legal/Asia,
   :rdf/type         [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "EasternAsia@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def EasternEurope
  "EasternEurope"
  {:db/ident         :dpvo-legal/EasternEurope,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/PL
                      :dpvo-legal/MD
                      :dpvo-legal/HU
                      :dpvo-legal/SK
                      :dpvo-legal/RO
                      :dpvo-legal/UA
                      :dpvo-legal/CZ
                      :dpvo-legal/RU
                      :dpvo-legal/BY
                      :dpvo-legal/BG],
   :dcterms/isPartOf :dpvo-legal/Europe,
   :rdf/type         [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "EasternEurope@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def Europe
  "Europe"
  {:db/ident         :dpvo-legal/Europe,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/FR
                      :dpvo-legal/NL
                      :dpvo-legal/IT
                      :dpvo-legal/SouthernEurope
                      :dpvo-legal/RU
                      :dpvo-legal/ME
                      :dpvo-legal/NO
                      :dpvo-legal/DE
                      :dpvo-legal/DK
                      :dpvo-legal/BA
                      :dpvo-legal/LV
                      :dpvo-legal/SM
                      :dpvo-legal/ES
                      :dpvo-legal/BY
                      :dpvo-legal/SK
                      :dpvo-legal/SE
                      :dpvo-legal/RO
                      :dpvo-legal/SI
                      :dpvo-legal/Sark
                      :dpvo-legal/AT
                      :dpvo-legal/EE
                      :dpvo-legal/PL
                      :dpvo-legal/FO
                      :dpvo-legal/HR
                      :dpvo-legal/GR
                      :dpvo-legal/LT
                      :dpvo-legal/MT
                      :dpvo-legal/NorthernEurope
                      :dpvo-legal/MC
                      :dpvo-legal/LU
                      :dpvo-legal/CZ
                      :dpvo-legal/BG
                      :dpvo-legal/SJ
                      :dpvo-legal/CH
                      :dpvo-legal/AD
                      :dpvo-legal/LI
                      :dpvo-legal/GI
                      :dpvo-legal/GG
                      :dpvo-legal/IE
                      :dpvo-legal/JE
                      :dpvo-legal/IS
                      :dpvo-legal/FI
                      :dpvo-legal/UA
                      :dpvo-legal/AX
                      :dpvo-legal/VA
                      :dpvo-legal/PT
                      :dpvo-legal/GB
                      :dpvo-legal/WesternEurope
                      :dpvo-legal/MD
                      :dpvo-legal/EasternEurope
                      :dpvo-legal/AL
                      :dpvo-legal/RS
                      :dpvo-legal/IM
                      :dpvo-legal/MK
                      :dpvo-legal/HU
                      :dpvo-legal/BE],
   :rdf/type         [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Europe@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def FI
  "FI"
  {:db/ident               :dpvo-legal/FI,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EEA30
                            :dpvo-legal/EEA31
                            :dpvo-legal/EU27
                            :dpvo-legal/EU
                            :dpvo-legal/EEA
                            :dpvo-legal/EU28],
   :dcterms/isPartOf       [:dpvo-legal/NorthernEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "FI",
   :dpvo-legal/iso_alpha3  "FIN",
   :dpvo-legal/iso_numeric "246",
   :dpvo-legal/un_m49      "246",
   :dpvo/hasAuthority      :dpvo-legal/DPA-FI,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Finland@en",
   :skos/altLabel          ["FI" "FIN" "246"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def FJ
  "FJ"
  {:db/ident               :dpvo-legal/FJ,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Oceania :dpvo-legal/Melanesia],
   :dpvo-legal/iso_alpha2  "FJ",
   :dpvo-legal/iso_alpha3  "FJI",
   :dpvo-legal/iso_numeric "242",
   :dpvo-legal/un_m49      "242",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Fiji@en",
   :skos/altLabel          ["FJ" "FJI" "242"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def FK
  "FK"
  {:db/ident               :dpvo-legal/FK,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/SouthAmerica
                            :dpvo-legal/Americas],
   :dpvo-legal/iso_alpha2  "FK",
   :dpvo-legal/iso_alpha3  "FLK",
   :dpvo-legal/iso_numeric "238",
   :dpvo-legal/un_m49      "238",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Falkland Islands (Malvinas)@en",
   :skos/altLabel          ["FK" "FLK" "238"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def FM
  "FM"
  {:db/ident               :dpvo-legal/FM,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Oceania :dpvo-legal/Micronesia],
   :dpvo-legal/iso_alpha2  "FM",
   :dpvo-legal/iso_alpha3  "FSM",
   :dpvo-legal/iso_numeric "583",
   :dpvo-legal/un_m49      "583",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString
                            "Micronesia (Federated States of)@en",
   :skos/altLabel          ["FM" "FSM" "583"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def FO
  "FO"
  {:db/ident               :dpvo-legal/FO,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Europe :dpvo-legal/NorthernEurope],
   :dpvo-legal/iso_alpha2  "FO",
   :dpvo-legal/iso_alpha3  "FRO",
   :dpvo-legal/iso_numeric "234",
   :dpvo-legal/un_m49      "234",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Faroe Islands@en",
   :skos/altLabel          ["FO" "FRO" "234"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def FR
  "FR"
  {:db/ident               :dpvo-legal/FR,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EU
                            :dpvo-legal/EEA
                            :dpvo-legal/EEA30
                            :dpvo-legal/EU28
                            :dpvo-legal/EU27
                            :dpvo-legal/EEA31],
   :dcterms/isPartOf       [:dpvo-legal/WesternEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "FR",
   :dpvo-legal/iso_alpha3  "FRA",
   :dpvo-legal/iso_numeric "250",
   :dpvo-legal/un_m49      "250",
   :dpvo/hasAuthority      :dpvo-legal/DPA-FR,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "France@en",
   :skos/altLabel          ["FR" "FRA" "250"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def GA
  "GA"
  {:db/ident               :dpvo-legal/GA,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/MiddleAfrica
                            :dpvo-legal/Africa],
   :dpvo-legal/iso_alpha2  "GA",
   :dpvo-legal/iso_alpha3  "GAB",
   :dpvo-legal/iso_numeric "266",
   :dpvo-legal/un_m49      "266",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Gabon@en",
   :skos/altLabel          ["GA" "GAB" "266"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def GB
  "GB"
  {:db/ident :dpvo-legal/GB,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart [:dpvo-legal/EEA31 :dpvo-legal/EU28],
   :dcterms/isPartOf [:dpvo-legal/Europe :dpvo-legal/NorthernEurope],
   :dpvo-legal/iso_alpha2 "GB",
   :dpvo-legal/iso_alpha3 "GBR",
   :dpvo-legal/iso_numeric "826",
   :dpvo-legal/un_m49 "826",
   :dpvo/hasAuthority :dpvo-legal/DPA-GB,
   :dpvo/hasLaw [:dpvo-legal/GB-DPA :dpvo-legal/GB-GDPR],
   :rdf/type [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString
                "United Kingdom of Great Britain and Northern Ireland@en",
   :skos/altLabel ["GB" "GBR" "826"],
   :vs/term_status #xsd/langString "accepted@en"})

(def GB-DPA
  "Data Protection Act (DPA)"
  {:db/ident :dpvo-legal/GB-DPA,
   :dcterms/created #xsd/date #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/modified #xsd/date #inst "2022-10-14T00:00:00.000-04:00",
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #xsd/date
                                        #inst "2018-05-25T00:00:00.000-04:00"}},
   :dpvo/hasJurisdiction :dpvo-legal/GB,
   :foaf/homepage {:rdfa/uri
                   "https://www.legislation.gov.uk/ukpga/2018/12/contents"},
   :rdf/type [:owl/NamedIndividual :dpvo/Law],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString "Data Protection Act (DPA)@en",
   :vs/term_status #xsd/langString "modified@en"})

(def GB-GDPR
  "General Data Protection Regulation (GDPR)"
  {:db/ident :dpvo-legal/GB-GDPR,
   :dcterms/created #xsd/date #inst "2022-07-20T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/modified #xsd/date #inst "2022-10-14T00:00:00.000-04:00",
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #xsd/date
                                        #inst "2019-02-28T00:00:00.000-05:00"}},
   :dpvo/hasJurisdiction :dpvo-legal/GB,
   :foaf/homepage {:rdfa/uri
                   "https://www.legislation.gov.uk/eur/2016/679/contents"},
   :rdf/type [:owl/NamedIndividual :dpvo/Law],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString "General Data Protection Regulation (GDPR)@en",
   :vs/term_status #xsd/langString "modified@en"})

(def GD
  "GD"
  {:db/ident               :dpvo-legal/GD,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Americas
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Caribbean],
   :dpvo-legal/iso_alpha2  "GD",
   :dpvo-legal/iso_alpha3  "GRD",
   :dpvo-legal/iso_numeric "308",
   :dpvo-legal/un_m49      "308",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Grenada@en",
   :skos/altLabel          ["GD" "GRD" "308"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def GE
  "GE"
  {:db/ident               :dpvo-legal/GE,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/WesternAsia :dpvo-legal/Asia],
   :dpvo-legal/iso_alpha2  "GE",
   :dpvo-legal/iso_alpha3  "GEO",
   :dpvo-legal/iso_numeric "268",
   :dpvo-legal/un_m49      "268",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Georgia@en",
   :skos/altLabel          ["GE" "GEO" "268"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def GF
  "GF"
  {:db/ident               :dpvo-legal/GF,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/SouthAmerica
                            :dpvo-legal/Americas],
   :dpvo-legal/iso_alpha2  "GF",
   :dpvo-legal/iso_alpha3  "GUF",
   :dpvo-legal/iso_numeric "254",
   :dpvo-legal/un_m49      "254",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "French Guiana@en",
   :skos/altLabel          ["GF" "GUF" "254"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def GG
  "GG"
  {:db/ident               :dpvo-legal/GG,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/ChannelIslands
                            :dpvo-legal/NorthernEurope
                            :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "GG",
   :dpvo-legal/iso_alpha3  "GGY",
   :dpvo-legal/iso_numeric "831",
   :dpvo-legal/un_m49      "831",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Guernsey@en",
   :skos/altLabel          ["GG" "GGY" "831"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def GH
  "GH"
  {:db/ident               :dpvo-legal/GH,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/WesternAfrica],
   :dpvo-legal/iso_alpha2  "GH",
   :dpvo-legal/iso_alpha3  "GHA",
   :dpvo-legal/iso_numeric "288",
   :dpvo-legal/un_m49      "288",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Ghana@en",
   :skos/altLabel          ["GH" "GHA" "288"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def GI
  "GI"
  {:db/ident               :dpvo-legal/GI,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Europe :dpvo-legal/SouthernEurope],
   :dpvo-legal/iso_alpha2  "GI",
   :dpvo-legal/iso_alpha3  "GIB",
   :dpvo-legal/iso_numeric "292",
   :dpvo-legal/un_m49      "292",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Gibraltar@en",
   :skos/altLabel          ["GI" "GIB" "292"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def GL
  "GL"
  {:db/ident               :dpvo-legal/GL,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Americas :dpvo-legal/NorthernAmerica],
   :dpvo-legal/iso_alpha2  "GL",
   :dpvo-legal/iso_alpha3  "GRL",
   :dpvo-legal/iso_numeric "304",
   :dpvo-legal/un_m49      "304",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Greenland@en",
   :skos/altLabel          ["GL" "GRL" "304"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def GM
  "GM"
  {:db/ident               :dpvo-legal/GM,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/WesternAfrica
                            :dpvo-legal/Africa],
   :dpvo-legal/iso_alpha2  "GM",
   :dpvo-legal/iso_alpha3  "GMB",
   :dpvo-legal/iso_numeric "270",
   :dpvo-legal/un_m49      "270",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Gambia@en",
   :skos/altLabel          ["GM" "GMB" "270"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def GN
  "GN"
  {:db/ident               :dpvo-legal/GN,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/WesternAfrica
                            :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica],
   :dpvo-legal/iso_alpha2  "GN",
   :dpvo-legal/iso_alpha3  "GIN",
   :dpvo-legal/iso_numeric "324",
   :dpvo-legal/un_m49      "324",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Guinea@en",
   :skos/altLabel          ["GN" "GIN" "324"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def GP
  "GP"
  {:db/ident               :dpvo-legal/GP,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Americas
                            :dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean],
   :dpvo-legal/iso_alpha2  "GP",
   :dpvo-legal/iso_alpha3  "GLP",
   :dpvo-legal/iso_numeric "312",
   :dpvo-legal/un_m49      "312",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Guadeloupe@en",
   :skos/altLabel          ["GP" "GLP" "312"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def GQ
  "GQ"
  {:db/ident               :dpvo-legal/GQ,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/MiddleAfrica
                            :dpvo-legal/Africa],
   :dpvo-legal/iso_alpha2  "GQ",
   :dpvo-legal/iso_alpha3  "GNQ",
   :dpvo-legal/iso_numeric "226",
   :dpvo-legal/un_m49      "226",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Equatorial Guinea@en",
   :skos/altLabel          ["GQ" "GNQ" "226"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def GR
  "GR"
  {:db/ident               :dpvo-legal/GR,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EEA31
                            :dpvo-legal/EEA30
                            :dpvo-legal/EU28
                            :dpvo-legal/EU27
                            :dpvo-legal/EU
                            :dpvo-legal/EEA],
   :dcterms/isPartOf       [:dpvo-legal/SouthernEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "GR",
   :dpvo-legal/iso_alpha3  "GRC",
   :dpvo-legal/iso_numeric "300",
   :dpvo-legal/un_m49      "300",
   :dpvo/hasAuthority      :dpvo-legal/DPA-GR,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Greece@en",
   :skos/altLabel          ["GR" "GRC" "300"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def GS
  "GS"
  {:db/ident               :dpvo-legal/GS,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas
                            :dpvo-legal/SouthAmerica],
   :dpvo-legal/iso_alpha2  "GS",
   :dpvo-legal/iso_alpha3  "SGS",
   :dpvo-legal/iso_numeric "239",
   :dpvo-legal/un_m49      "239",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString
                            "South Georgia and the South Sandwich Islands@en",
   :skos/altLabel          ["GS" "SGS" "239"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def GT
  "GT"
  {:db/ident               :dpvo-legal/GT,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/CentralAmerica
                            :dpvo-legal/Americas
                            :dpvo-legal/LatinAmericaandtheCaribbean],
   :dpvo-legal/iso_alpha2  "GT",
   :dpvo-legal/iso_alpha3  "GTM",
   :dpvo-legal/iso_numeric "320",
   :dpvo-legal/un_m49      "320",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Guatemala@en",
   :skos/altLabel          ["GT" "GTM" "320"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def GU
  "GU"
  {:db/ident               :dpvo-legal/GU,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Micronesia :dpvo-legal/Oceania],
   :dpvo-legal/iso_alpha2  "GU",
   :dpvo-legal/iso_alpha3  "GUM",
   :dpvo-legal/iso_numeric "316",
   :dpvo-legal/un_m49      "316",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Guam@en",
   :skos/altLabel          ["GU" "GUM" "316"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def GW
  "GW"
  {:db/ident               :dpvo-legal/GW,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/WesternAfrica],
   :dpvo-legal/iso_alpha2  "GW",
   :dpvo-legal/iso_alpha3  "GNB",
   :dpvo-legal/iso_numeric "624",
   :dpvo-legal/un_m49      "624",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Guinea-Bissau@en",
   :skos/altLabel          ["GW" "GNB" "624"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def GY
  "GY"
  {:db/ident               :dpvo-legal/GY,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/SouthAmerica
                            :dpvo-legal/Americas],
   :dpvo-legal/iso_alpha2  "GY",
   :dpvo-legal/iso_alpha3  "GUY",
   :dpvo-legal/iso_numeric "328",
   :dpvo-legal/un_m49      "328",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Guyana@en",
   :skos/altLabel          ["GY" "GUY" "328"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def HK
  "HK"
  {:db/ident               :dpvo-legal/HK,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/EasternAsia],
   :dpvo-legal/iso_alpha2  "HK",
   :dpvo-legal/iso_alpha3  "HKG",
   :dpvo-legal/iso_numeric "344",
   :dpvo-legal/un_m49      "344",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString
                            "China, Hong Kong Special Administrative Region@en",
   :skos/altLabel          ["HK" "HKG" "344"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def HM
  "HM"
  {:db/ident               :dpvo-legal/HM,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/AustraliaandNewZealand
                            :dpvo-legal/Oceania],
   :dpvo-legal/iso_alpha2  "HM",
   :dpvo-legal/iso_alpha3  "HMD",
   :dpvo-legal/iso_numeric "334",
   :dpvo-legal/un_m49      "334",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString
                            "Heard Island and McDonald Islands@en",
   :skos/altLabel          ["HM" "HMD" "334"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def HN
  "HN"
  {:db/ident               :dpvo-legal/HN,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/CentralAmerica
                            :dpvo-legal/Americas],
   :dpvo-legal/iso_alpha2  "HN",
   :dpvo-legal/iso_alpha3  "HND",
   :dpvo-legal/iso_numeric "340",
   :dpvo-legal/un_m49      "340",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Honduras@en",
   :skos/altLabel          ["HN" "HND" "340"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def HR
  "HR"
  {:db/ident               :dpvo-legal/HR,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EEA30
                            :dpvo-legal/EU28
                            :dpvo-legal/EU
                            :dpvo-legal/EEA
                            :dpvo-legal/EU27
                            :dpvo-legal/EEA31],
   :dcterms/isPartOf       [:dpvo-legal/SouthernEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "HR",
   :dpvo-legal/iso_alpha3  "HRV",
   :dpvo-legal/iso_numeric "191",
   :dpvo-legal/un_m49      "191",
   :dpvo/hasAuthority      :dpvo-legal/DPA-HR,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Croatia@en",
   :skos/altLabel          ["HR" "HRV" "191"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def HT
  "HT"
  {:db/ident               :dpvo-legal/HT,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas
                            :dpvo-legal/Caribbean],
   :dpvo-legal/iso_alpha2  "HT",
   :dpvo-legal/iso_alpha3  "HTI",
   :dpvo-legal/iso_numeric "332",
   :dpvo-legal/un_m49      "332",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Haiti@en",
   :skos/altLabel          ["HT" "HTI" "332"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def HU
  "HU"
  {:db/ident               :dpvo-legal/HU,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EEA31
                            :dpvo-legal/EEA
                            :dpvo-legal/EU27
                            :dpvo-legal/EEA30
                            :dpvo-legal/EU
                            :dpvo-legal/EU28],
   :dcterms/isPartOf       [:dpvo-legal/Europe :dpvo-legal/EasternEurope],
   :dpvo-legal/iso_alpha2  "HU",
   :dpvo-legal/iso_alpha3  "HUN",
   :dpvo-legal/iso_numeric "348",
   :dpvo-legal/un_m49      "348",
   :dpvo/hasAuthority      :dpvo-legal/DPA-HU,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Hungary@en",
   :skos/altLabel          ["HU" "HUN" "348"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def ID
  "ID"
  {:db/ident               :dpvo-legal/ID,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/SoutheasternAsia],
   :dpvo-legal/iso_alpha2  "ID",
   :dpvo-legal/iso_alpha3  "IDN",
   :dpvo-legal/iso_numeric "360",
   :dpvo-legal/un_m49      "360",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Indonesia@en",
   :skos/altLabel          ["ID" "IDN" "360"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def IE
  "IE"
  {:db/ident               :dpvo-legal/IE,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EEA31
                            :dpvo-legal/EEA30
                            :dpvo-legal/EEA
                            :dpvo-legal/EU28
                            :dpvo-legal/EU27
                            :dpvo-legal/EU],
   :dcterms/isPartOf       [:dpvo-legal/Europe :dpvo-legal/NorthernEurope],
   :dpvo-legal/iso_alpha2  "IE",
   :dpvo-legal/iso_alpha3  "IRL",
   :dpvo-legal/iso_numeric "372",
   :dpvo-legal/un_m49      "372",
   :dpvo/hasAuthority      :dpvo-legal/DPA-IE,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Ireland@en",
   :skos/altLabel          ["IE" "IRL" "372"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def IL
  "IL"
  {:db/ident               :dpvo-legal/IL,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/WesternAsia :dpvo-legal/Asia],
   :dpvo-legal/iso_alpha2  "IL",
   :dpvo-legal/iso_alpha3  "ISR",
   :dpvo-legal/iso_numeric "376",
   :dpvo-legal/un_m49      "376",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Israel@en",
   :skos/altLabel          ["IL" "ISR" "376"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def IM
  "IM"
  {:db/ident               :dpvo-legal/IM,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Europe :dpvo-legal/NorthernEurope],
   :dpvo-legal/iso_alpha2  "IM",
   :dpvo-legal/iso_alpha3  "IMN",
   :dpvo-legal/iso_numeric "833",
   :dpvo-legal/un_m49      "833",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Isle of Man@en",
   :skos/altLabel          ["IM" "IMN" "833"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def IN
  "IN"
  {:db/ident               :dpvo-legal/IN,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SouthernAsia :dpvo-legal/Asia],
   :dpvo-legal/iso_alpha2  "IN",
   :dpvo-legal/iso_alpha3  "IND",
   :dpvo-legal/iso_numeric "356",
   :dpvo-legal/un_m49      "356",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "India@en",
   :skos/altLabel          ["IN" "IND" "356"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def IO
  "IO"
  {:db/ident               :dpvo-legal/IO,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Africa
                            :dpvo-legal/EasternAfrica
                            :dpvo-legal/SubSaharanAfrica],
   :dpvo-legal/iso_alpha2  "IO",
   :dpvo-legal/iso_alpha3  "IOT",
   :dpvo-legal/iso_numeric "86",
   :dpvo-legal/un_m49      "86",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "British Indian Ocean Territory@en",
   :skos/altLabel          ["IO" "IOT" "86"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def IQ
  "IQ"
  {:db/ident               :dpvo-legal/IQ,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/WesternAsia :dpvo-legal/Asia],
   :dpvo-legal/iso_alpha2  "IQ",
   :dpvo-legal/iso_alpha3  "IRQ",
   :dpvo-legal/iso_numeric "368",
   :dpvo-legal/un_m49      "368",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Iraq@en",
   :skos/altLabel          ["IQ" "IRQ" "368"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def IR
  "IR"
  {:db/ident               :dpvo-legal/IR,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/SouthernAsia],
   :dpvo-legal/iso_alpha2  "IR",
   :dpvo-legal/iso_alpha3  "IRN",
   :dpvo-legal/iso_numeric "364",
   :dpvo-legal/un_m49      "364",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Iran (Islamic Republic of)@en",
   :skos/altLabel          ["IR" "IRN" "364"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def IS
  "IS"
  {:db/ident               :dpvo-legal/IS,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/NorthernEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "IS",
   :dpvo-legal/iso_alpha3  "ISL",
   :dpvo-legal/iso_numeric "352",
   :dpvo-legal/un_m49      "352",
   :dpvo/hasAuthority      :dpvo-legal/DPA-IS,
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Iceland@en",
   :skos/altLabel          ["IS" "ISL" "352"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def IT
  "IT"
  {:db/ident               :dpvo-legal/IT,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EEA31
                            :dpvo-legal/EU
                            :dpvo-legal/EEA30
                            :dpvo-legal/EU28
                            :dpvo-legal/EU27
                            :dpvo-legal/EEA],
   :dcterms/isPartOf       [:dpvo-legal/SouthernEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "IT",
   :dpvo-legal/iso_alpha3  "ITA",
   :dpvo-legal/iso_numeric "380",
   :dpvo-legal/un_m49      "380",
   :dpvo/hasAuthority      :dpvo-legal/DPA-IT,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Italy@en",
   :skos/altLabel          ["IT" "ITA" "380"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def JE
  "JE"
  {:db/ident               :dpvo-legal/JE,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/ChannelIslands
                            :dpvo-legal/Europe
                            :dpvo-legal/NorthernEurope],
   :dpvo-legal/iso_alpha2  "JE",
   :dpvo-legal/iso_alpha3  "JEY",
   :dpvo-legal/iso_numeric "832",
   :dpvo-legal/un_m49      "832",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Jersey@en",
   :skos/altLabel          ["JE" "JEY" "832"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def JM
  "JM"
  {:db/ident               :dpvo-legal/JM,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas
                            :dpvo-legal/Caribbean],
   :dpvo-legal/iso_alpha2  "JM",
   :dpvo-legal/iso_alpha3  "JAM",
   :dpvo-legal/iso_numeric "388",
   :dpvo-legal/un_m49      "388",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Jamaica@en",
   :skos/altLabel          ["JM" "JAM" "388"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def JO
  "JO"
  {:db/ident               :dpvo-legal/JO,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/WesternAsia :dpvo-legal/Asia],
   :dpvo-legal/iso_alpha2  "JO",
   :dpvo-legal/iso_alpha3  "JOR",
   :dpvo-legal/iso_numeric "400",
   :dpvo-legal/un_m49      "400",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Jordan@en",
   :skos/altLabel          ["JO" "JOR" "400"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def JP
  "JP"
  {:db/ident               :dpvo-legal/JP,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/EasternAsia :dpvo-legal/Asia],
   :dpvo-legal/iso_alpha2  "JP",
   :dpvo-legal/iso_alpha3  "JPN",
   :dpvo-legal/iso_numeric "392",
   :dpvo-legal/un_m49      "392",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Japan@en",
   :skos/altLabel          ["JP" "JPN" "392"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def KE
  "KE"
  {:db/ident               :dpvo-legal/KE,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica],
   :dpvo-legal/iso_alpha2  "KE",
   :dpvo-legal/iso_alpha3  "KEN",
   :dpvo-legal/iso_numeric "404",
   :dpvo-legal/un_m49      "404",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Kenya@en",
   :skos/altLabel          ["KE" "KEN" "404"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def KG
  "KG"
  {:db/ident               :dpvo-legal/KG,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/CentralAsia :dpvo-legal/Asia],
   :dpvo-legal/iso_alpha2  "KG",
   :dpvo-legal/iso_alpha3  "KGZ",
   :dpvo-legal/iso_numeric "417",
   :dpvo-legal/un_m49      "417",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Kyrgyzstan@en",
   :skos/altLabel          ["KG" "KGZ" "417"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def KH
  "KH"
  {:db/ident               :dpvo-legal/KH,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/SoutheasternAsia],
   :dpvo-legal/iso_alpha2  "KH",
   :dpvo-legal/iso_alpha3  "KHM",
   :dpvo-legal/iso_numeric "116",
   :dpvo-legal/un_m49      "116",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Cambodia@en",
   :skos/altLabel          ["KH" "KHM" "116"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def KI
  "KI"
  {:db/ident               :dpvo-legal/KI,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Oceania :dpvo-legal/Micronesia],
   :dpvo-legal/iso_alpha2  "KI",
   :dpvo-legal/iso_alpha3  "KIR",
   :dpvo-legal/iso_numeric "296",
   :dpvo-legal/un_m49      "296",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Kiribati@en",
   :skos/altLabel          ["KI" "KIR" "296"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def KM
  "KM"
  {:db/ident               :dpvo-legal/KM,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica
                            :dpvo-legal/Africa],
   :dpvo-legal/iso_alpha2  "KM",
   :dpvo-legal/iso_alpha3  "COM",
   :dpvo-legal/iso_numeric "174",
   :dpvo-legal/un_m49      "174",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Comoros@en",
   :skos/altLabel          ["KM" "COM" "174"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def KN
  "KN"
  {:db/ident               :dpvo-legal/KN,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas],
   :dpvo-legal/iso_alpha2  "KN",
   :dpvo-legal/iso_alpha3  "KNA",
   :dpvo-legal/iso_numeric "659",
   :dpvo-legal/un_m49      "659",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Saint Kitts and Nevis@en",
   :skos/altLabel          ["KN" "KNA" "659"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def KP
  "KP"
  {:db/ident               :dpvo-legal/KP,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/EasternAsia :dpvo-legal/Asia],
   :dpvo-legal/iso_alpha2  "KP",
   :dpvo-legal/iso_alpha3  "PRK",
   :dpvo-legal/iso_numeric "408",
   :dpvo-legal/un_m49      "408",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString
                            "Democratic People's Republic of Korea@en",
   :skos/altLabel          ["KP" "PRK" "408"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def KR
  "KR"
  {:db/ident               :dpvo-legal/KR,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/EasternAsia],
   :dpvo-legal/iso_alpha2  "KR",
   :dpvo-legal/iso_alpha3  "KOR",
   :dpvo-legal/iso_numeric "410",
   :dpvo-legal/un_m49      "410",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Republic of Korea@en",
   :skos/altLabel          ["KR" "KOR" "410"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def KW
  "KW"
  {:db/ident               :dpvo-legal/KW,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/WesternAsia],
   :dpvo-legal/iso_alpha2  "KW",
   :dpvo-legal/iso_alpha3  "KWT",
   :dpvo-legal/iso_numeric "414",
   :dpvo-legal/un_m49      "414",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Kuwait@en",
   :skos/altLabel          ["KW" "KWT" "414"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def KY
  "KY"
  {:db/ident               :dpvo-legal/KY,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas],
   :dpvo-legal/iso_alpha2  "KY",
   :dpvo-legal/iso_alpha3  "CYM",
   :dpvo-legal/iso_numeric "136",
   :dpvo-legal/un_m49      "136",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Cayman Islands@en",
   :skos/altLabel          ["KY" "CYM" "136"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def KZ
  "KZ"
  {:db/ident               :dpvo-legal/KZ,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/CentralAsia :dpvo-legal/Asia],
   :dpvo-legal/iso_alpha2  "KZ",
   :dpvo-legal/iso_alpha3  "KAZ",
   :dpvo-legal/iso_numeric "398",
   :dpvo-legal/un_m49      "398",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Kazakhstan@en",
   :skos/altLabel          ["KZ" "KAZ" "398"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def LA
  "LA"
  {:db/ident               :dpvo-legal/LA,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SoutheasternAsia :dpvo-legal/Asia],
   :dpvo-legal/iso_alpha2  "LA",
   :dpvo-legal/iso_alpha3  "LAO",
   :dpvo-legal/iso_numeric "418",
   :dpvo-legal/un_m49      "418",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString
                            "Lao People's Democratic Republic@en",
   :skos/altLabel          ["LA" "LAO" "418"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def LB
  "LB"
  {:db/ident               :dpvo-legal/LB,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/WesternAsia],
   :dpvo-legal/iso_alpha2  "LB",
   :dpvo-legal/iso_alpha3  "LBN",
   :dpvo-legal/iso_numeric "422",
   :dpvo-legal/un_m49      "422",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Lebanon@en",
   :skos/altLabel          ["LB" "LBN" "422"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def LC
  "LC"
  {:db/ident               :dpvo-legal/LC,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas
                            :dpvo-legal/Caribbean],
   :dpvo-legal/iso_alpha2  "LC",
   :dpvo-legal/iso_alpha3  "LCA",
   :dpvo-legal/iso_numeric "662",
   :dpvo-legal/un_m49      "662",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Saint Lucia@en",
   :skos/altLabel          ["LC" "LCA" "662"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def LI
  "LI"
  {:db/ident               :dpvo-legal/LI,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Europe :dpvo-legal/WesternEurope],
   :dpvo-legal/iso_alpha2  "LI",
   :dpvo-legal/iso_alpha3  "LIE",
   :dpvo-legal/iso_numeric "438",
   :dpvo-legal/un_m49      "438",
   :dpvo/hasAuthority      :dpvo-legal/DPV-LI,
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Liechtenstein@en",
   :skos/altLabel          ["LI" "LIE" "438"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def LK
  "LK"
  {:db/ident               :dpvo-legal/LK,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/SouthernAsia],
   :dpvo-legal/iso_alpha2  "LK",
   :dpvo-legal/iso_alpha3  "LKA",
   :dpvo-legal/iso_numeric "144",
   :dpvo-legal/un_m49      "144",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Sri Lanka@en",
   :skos/altLabel          ["LK" "LKA" "144"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def LR
  "LR"
  {:db/ident               :dpvo-legal/LR,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/WesternAfrica],
   :dpvo-legal/iso_alpha2  "LR",
   :dpvo-legal/iso_alpha3  "LBR",
   :dpvo-legal/iso_numeric "430",
   :dpvo-legal/un_m49      "430",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Liberia@en",
   :skos/altLabel          ["LR" "LBR" "430"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def LS
  "LS"
  {:db/ident               :dpvo-legal/LS,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Africa
                            :dpvo-legal/SouthernAfrica
                            :dpvo-legal/SubSaharanAfrica],
   :dpvo-legal/iso_alpha2  "LS",
   :dpvo-legal/iso_alpha3  "LSO",
   :dpvo-legal/iso_numeric "426",
   :dpvo-legal/un_m49      "426",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Lesotho@en",
   :skos/altLabel          ["LS" "LSO" "426"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def LT
  "LT"
  {:db/ident               :dpvo-legal/LT,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EU27
                            :dpvo-legal/EEA
                            :dpvo-legal/EU28
                            :dpvo-legal/EEA31
                            :dpvo-legal/EU
                            :dpvo-legal/EEA30],
   :dcterms/isPartOf       [:dpvo-legal/NorthernEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "LT",
   :dpvo-legal/iso_alpha3  "LTU",
   :dpvo-legal/iso_numeric "440",
   :dpvo-legal/un_m49      "440",
   :dpvo/hasAuthority      :dpvo-legal/DPA-LT,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Lithuania@en",
   :skos/altLabel          ["LT" "LTU" "440"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def LU
  "LU"
  {:db/ident               :dpvo-legal/LU,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EEA
                            :dpvo-legal/EU27
                            :dpvo-legal/EU
                            :dpvo-legal/EEA30
                            :dpvo-legal/EU28
                            :dpvo-legal/EEA31],
   :dcterms/isPartOf       [:dpvo-legal/WesternEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "LU",
   :dpvo-legal/iso_alpha3  "LUX",
   :dpvo-legal/iso_numeric "442",
   :dpvo-legal/un_m49      "442",
   :dpvo/hasAuthority      :dpvo-legal/DPA-LU,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Luxembourg@en",
   :skos/altLabel          ["LU" "LUX" "442"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def LV
  "LV"
  {:db/ident               :dpvo-legal/LV,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EEA30
                            :dpvo-legal/EEA31
                            :dpvo-legal/EEA
                            :dpvo-legal/EU
                            :dpvo-legal/EU28
                            :dpvo-legal/EU27],
   :dcterms/isPartOf       [:dpvo-legal/Europe :dpvo-legal/NorthernEurope],
   :dpvo-legal/iso_alpha2  "LV",
   :dpvo-legal/iso_alpha3  "LVA",
   :dpvo-legal/iso_numeric "428",
   :dpvo-legal/un_m49      "428",
   :dpvo/hasAuthority      :dpvo-legal/DPA-LV,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Latvia@en",
   :skos/altLabel          ["LV" "LVA" "428"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def LY
  "LY"
  {:db/ident               :dpvo-legal/LY,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/NorthernAfrica :dpvo-legal/Africa],
   :dpvo-legal/iso_alpha2  "LY",
   :dpvo-legal/iso_alpha3  "LBY",
   :dpvo-legal/iso_numeric "434",
   :dpvo-legal/un_m49      "434",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Libya@en",
   :skos/altLabel          ["LY" "LBY" "434"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def LatinAmericaandtheCaribbean
  "LatinAmericaandtheCaribbean"
  {:db/ident         :dpvo-legal/LatinAmericaandtheCaribbean,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/SV
                      :dpvo-legal/TT
                      :dpvo-legal/VE
                      :dpvo-legal/PR
                      :dpvo-legal/BV
                      :dpvo-legal/DM
                      :dpvo-legal/GT
                      :dpvo-legal/AI
                      :dpvo-legal/BS
                      :dpvo-legal/BQ
                      :dpvo-legal/PE
                      :dpvo-legal/AW
                      :dpvo-legal/MQ
                      :dpvo-legal/CentralAmerica
                      :dpvo-legal/JM
                      :dpvo-legal/GF
                      :dpvo-legal/FK
                      :dpvo-legal/PY
                      :dpvo-legal/GY
                      :dpvo-legal/CW
                      :dpvo-legal/MF
                      :dpvo-legal/SR
                      :dpvo-legal/BZ
                      :dpvo-legal/CR
                      :dpvo-legal/GP
                      :dpvo-legal/KN
                      :dpvo-legal/AG
                      :dpvo-legal/EC
                      :dpvo-legal/MX
                      :dpvo-legal/TC
                      :dpvo-legal/PA
                      :dpvo-legal/LC
                      :dpvo-legal/SX
                      :dpvo-legal/MS
                      :dpvo-legal/VI
                      :dpvo-legal/DO
                      :dpvo-legal/VG
                      :dpvo-legal/HT
                      :dpvo-legal/NI
                      :dpvo-legal/VC
                      :dpvo-legal/KY
                      :dpvo-legal/CU
                      :dpvo-legal/GS
                      :dpvo-legal/BO
                      :dpvo-legal/CO
                      :dpvo-legal/UY
                      :dpvo-legal/BB
                      :dpvo-legal/BR
                      :dpvo-legal/SouthAmerica
                      :dpvo-legal/HN
                      :dpvo-legal/BL
                      :dpvo-legal/CL
                      :dpvo-legal/GD
                      :dpvo-legal/Caribbean
                      :dpvo-legal/AR],
   :dcterms/isPartOf :dpvo-legal/Americas,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "LatinAmericaandtheCaribbean@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def MA
  "MA"
  {:db/ident               :dpvo-legal/MA,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/NorthernAfrica :dpvo-legal/Africa],
   :dpvo-legal/iso_alpha2  "MA",
   :dpvo-legal/iso_alpha3  "MAR",
   :dpvo-legal/iso_numeric "504",
   :dpvo-legal/un_m49      "504",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Morocco@en",
   :skos/altLabel          ["MA" "MAR" "504"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def MC
  "MC"
  {:db/ident               :dpvo-legal/MC,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/WesternEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "MC",
   :dpvo-legal/iso_alpha3  "MCO",
   :dpvo-legal/iso_numeric "492",
   :dpvo-legal/un_m49      "492",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Monaco@en",
   :skos/altLabel          ["MC" "MCO" "492"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def MD
  "MD"
  {:db/ident               :dpvo-legal/MD,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/EasternEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "MD",
   :dpvo-legal/iso_alpha3  "MDA",
   :dpvo-legal/iso_numeric "498",
   :dpvo-legal/un_m49      "498",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Republic of Moldova@en",
   :skos/altLabel          ["MD" "MDA" "498"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def ME
  "ME"
  {:db/ident               :dpvo-legal/ME,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SouthernEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "ME",
   :dpvo-legal/iso_alpha3  "MNE",
   :dpvo-legal/iso_numeric "499",
   :dpvo-legal/un_m49      "499",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Montenegro@en",
   :skos/altLabel          ["ME" "MNE" "499"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def MF
  "MF"
  {:db/ident               :dpvo-legal/MF,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Caribbean
                            :dpvo-legal/Americas],
   :dpvo-legal/iso_alpha2  "MF",
   :dpvo-legal/iso_alpha3  "MAF",
   :dpvo-legal/iso_numeric "663",
   :dpvo-legal/un_m49      "663",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Saint Martin (French Part)@en",
   :skos/altLabel          ["MF" "MAF" "663"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def MG
  "MG"
  {:db/ident               :dpvo-legal/MG,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/EasternAfrica
                            :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/Africa],
   :dpvo-legal/iso_alpha2  "MG",
   :dpvo-legal/iso_alpha3  "MDG",
   :dpvo-legal/iso_numeric "450",
   :dpvo-legal/un_m49      "450",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Madagascar@en",
   :skos/altLabel          ["MG" "MDG" "450"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def MH
  "MH"
  {:db/ident               :dpvo-legal/MH,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Micronesia :dpvo-legal/Oceania],
   :dpvo-legal/iso_alpha2  "MH",
   :dpvo-legal/iso_alpha3  "MHL",
   :dpvo-legal/iso_numeric "584",
   :dpvo-legal/un_m49      "584",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Marshall Islands@en",
   :skos/altLabel          ["MH" "MHL" "584"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def MK
  "MK"
  {:db/ident               :dpvo-legal/MK,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Europe :dpvo-legal/SouthernEurope],
   :dpvo-legal/iso_alpha2  "MK",
   :dpvo-legal/iso_alpha3  "MKD",
   :dpvo-legal/iso_numeric "807",
   :dpvo-legal/un_m49      "807",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "North Macedonia@en",
   :skos/altLabel          ["MK" "MKD" "807"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def ML
  "ML"
  {:db/ident               :dpvo-legal/ML,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/WesternAfrica],
   :dpvo-legal/iso_alpha2  "ML",
   :dpvo-legal/iso_alpha3  "MLI",
   :dpvo-legal/iso_numeric "466",
   :dpvo-legal/un_m49      "466",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Mali@en",
   :skos/altLabel          ["ML" "MLI" "466"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def MM
  "MM"
  {:db/ident               :dpvo-legal/MM,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/SoutheasternAsia],
   :dpvo-legal/iso_alpha2  "MM",
   :dpvo-legal/iso_alpha3  "MMR",
   :dpvo-legal/iso_numeric "104",
   :dpvo-legal/un_m49      "104",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Myanmar@en",
   :skos/altLabel          ["MM" "MMR" "104"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def MN
  "MN"
  {:db/ident               :dpvo-legal/MN,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/EasternAsia :dpvo-legal/Asia],
   :dpvo-legal/iso_alpha2  "MN",
   :dpvo-legal/iso_alpha3  "MNG",
   :dpvo-legal/iso_numeric "496",
   :dpvo-legal/un_m49      "496",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Mongolia@en",
   :skos/altLabel          ["MN" "MNG" "496"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def MO
  "MO"
  {:db/ident               :dpvo-legal/MO,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/EasternAsia],
   :dpvo-legal/iso_alpha2  "MO",
   :dpvo-legal/iso_alpha3  "MAC",
   :dpvo-legal/iso_numeric "446",
   :dpvo-legal/un_m49      "446",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString
                            "China, Macao Special Administrative Region@en",
   :skos/altLabel          ["MO" "MAC" "446"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def MP
  "MP"
  {:db/ident               :dpvo-legal/MP,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Micronesia :dpvo-legal/Oceania],
   :dpvo-legal/iso_alpha2  "MP",
   :dpvo-legal/iso_alpha3  "MNP",
   :dpvo-legal/iso_numeric "580",
   :dpvo-legal/un_m49      "580",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Northern Mariana Islands@en",
   :skos/altLabel          ["MP" "MNP" "580"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def MQ
  "MQ"
  {:db/ident               :dpvo-legal/MQ,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas
                            :dpvo-legal/Caribbean],
   :dpvo-legal/iso_alpha2  "MQ",
   :dpvo-legal/iso_alpha3  "MTQ",
   :dpvo-legal/iso_numeric "474",
   :dpvo-legal/un_m49      "474",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Martinique@en",
   :skos/altLabel          ["MQ" "MTQ" "474"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def MR
  "MR"
  {:db/ident               :dpvo-legal/MR,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/WesternAfrica
                            :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica],
   :dpvo-legal/iso_alpha2  "MR",
   :dpvo-legal/iso_alpha3  "MRT",
   :dpvo-legal/iso_numeric "478",
   :dpvo-legal/un_m49      "478",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Mauritania@en",
   :skos/altLabel          ["MR" "MRT" "478"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def MS
  "MS"
  {:db/ident               :dpvo-legal/MS,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas],
   :dpvo-legal/iso_alpha2  "MS",
   :dpvo-legal/iso_alpha3  "MSR",
   :dpvo-legal/iso_numeric "500",
   :dpvo-legal/un_m49      "500",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Montserrat@en",
   :skos/altLabel          ["MS" "MSR" "500"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def MT
  "MT"
  {:db/ident               :dpvo-legal/MT,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EU28
                            :dpvo-legal/EEA
                            :dpvo-legal/EU
                            :dpvo-legal/EEA31
                            :dpvo-legal/EEA30
                            :dpvo-legal/EU27],
   :dcterms/isPartOf       [:dpvo-legal/SouthernEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "MT",
   :dpvo-legal/iso_alpha3  "MLT",
   :dpvo-legal/iso_numeric "470",
   :dpvo-legal/un_m49      "470",
   :dpvo/hasAuthority      :dpvo-legal/DPA-MT,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Malta@en",
   :skos/altLabel          ["MT" "MLT" "470"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def MU
  "MU"
  {:db/ident               :dpvo-legal/MU,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica
                            :dpvo-legal/Africa],
   :dpvo-legal/iso_alpha2  "MU",
   :dpvo-legal/iso_alpha3  "MUS",
   :dpvo-legal/iso_numeric "480",
   :dpvo-legal/un_m49      "480",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Mauritius@en",
   :skos/altLabel          ["MU" "MUS" "480"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def MV
  "MV"
  {:db/ident               :dpvo-legal/MV,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SouthernAsia :dpvo-legal/Asia],
   :dpvo-legal/iso_alpha2  "MV",
   :dpvo-legal/iso_alpha3  "MDV",
   :dpvo-legal/iso_numeric "462",
   :dpvo-legal/un_m49      "462",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Maldives@en",
   :skos/altLabel          ["MV" "MDV" "462"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def MW
  "MW"
  {:db/ident               :dpvo-legal/MW,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/EasternAfrica
                            :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica],
   :dpvo-legal/iso_alpha2  "MW",
   :dpvo-legal/iso_alpha3  "MWI",
   :dpvo-legal/iso_numeric "454",
   :dpvo-legal/un_m49      "454",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Malawi@en",
   :skos/altLabel          ["MW" "MWI" "454"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def MX
  "MX"
  {:db/ident               :dpvo-legal/MX,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Americas
                            :dpvo-legal/CentralAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean],
   :dpvo-legal/iso_alpha2  "MX",
   :dpvo-legal/iso_alpha3  "MEX",
   :dpvo-legal/iso_numeric "484",
   :dpvo-legal/un_m49      "484",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Mexico@en",
   :skos/altLabel          ["MX" "MEX" "484"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def MY
  "MY"
  {:db/ident               :dpvo-legal/MY,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SoutheasternAsia :dpvo-legal/Asia],
   :dpvo-legal/iso_alpha2  "MY",
   :dpvo-legal/iso_alpha3  "MYS",
   :dpvo-legal/iso_numeric "458",
   :dpvo-legal/un_m49      "458",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Malaysia@en",
   :skos/altLabel          ["MY" "MYS" "458"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def MZ
  "MZ"
  {:db/ident               :dpvo-legal/MZ,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/EasternAfrica
                            :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica],
   :dpvo-legal/iso_alpha2  "MZ",
   :dpvo-legal/iso_alpha3  "MOZ",
   :dpvo-legal/iso_numeric "508",
   :dpvo-legal/un_m49      "508",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Mozambique@en",
   :skos/altLabel          ["MZ" "MOZ" "508"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def Melanesia
  "Melanesia"
  {:db/ident :dpvo-legal/Melanesia,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart
   [:dpvo-legal/NC :dpvo-legal/VU :dpvo-legal/FJ :dpvo-legal/PG :dpvo-legal/SB],
   :dcterms/isPartOf :dpvo-legal/Oceania,
   :rdf/type [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString "Melanesia@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def Micronesia
  "Micronesia"
  {:db/ident         :dpvo-legal/Micronesia,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/GU
                      :dpvo-legal/MP
                      :dpvo-legal/PW
                      :dpvo-legal/FM
                      :dpvo-legal/UM
                      :dpvo-legal/KI
                      :dpvo-legal/NR
                      :dpvo-legal/MH],
   :dcterms/isPartOf :dpvo-legal/Oceania,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Micronesia@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def MiddleAfrica
  "MiddleAfrica"
  {:db/ident         :dpvo-legal/MiddleAfrica,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/GQ
                      :dpvo-legal/CD
                      :dpvo-legal/CM
                      :dpvo-legal/TD
                      :dpvo-legal/GA
                      :dpvo-legal/ST
                      :dpvo-legal/AO
                      :dpvo-legal/CF
                      :dpvo-legal/CG],
   :dcterms/isPartOf :dpvo-legal/SubSaharanAfrica,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "MiddleAfrica@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def NA
  "NA"
  {:db/ident               :dpvo-legal/NA,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SouthernAfrica
                            :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica],
   :dpvo-legal/iso_alpha2  "NA",
   :dpvo-legal/iso_alpha3  "NAM",
   :dpvo-legal/iso_numeric "516",
   :dpvo-legal/un_m49      "516",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Namibia@en",
   :skos/altLabel          ["NA" "NAM" "516"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def NC
  "NC"
  {:db/ident               :dpvo-legal/NC,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Oceania :dpvo-legal/Melanesia],
   :dpvo-legal/iso_alpha2  "NC",
   :dpvo-legal/iso_alpha3  "NCL",
   :dpvo-legal/iso_numeric "540",
   :dpvo-legal/un_m49      "540",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "New Caledonia@en",
   :skos/altLabel          ["NC" "NCL" "540"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def NE
  "NE"
  {:db/ident               :dpvo-legal/NE,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/Africa
                            :dpvo-legal/WesternAfrica],
   :dpvo-legal/iso_alpha2  "NE",
   :dpvo-legal/iso_alpha3  "NER",
   :dpvo-legal/iso_numeric "562",
   :dpvo-legal/un_m49      "562",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Niger@en",
   :skos/altLabel          ["NE" "NER" "562"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def NF
  "NF"
  {:db/ident               :dpvo-legal/NF,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/AustraliaandNewZealand
                            :dpvo-legal/Oceania],
   :dpvo-legal/iso_alpha2  "NF",
   :dpvo-legal/iso_alpha3  "NFK",
   :dpvo-legal/iso_numeric "574",
   :dpvo-legal/un_m49      "574",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Norfolk Island@en",
   :skos/altLabel          ["NF" "NFK" "574"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def NG
  "NG"
  {:db/ident               :dpvo-legal/NG,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/Africa
                            :dpvo-legal/WesternAfrica],
   :dpvo-legal/iso_alpha2  "NG",
   :dpvo-legal/iso_alpha3  "NGA",
   :dpvo-legal/iso_numeric "566",
   :dpvo-legal/un_m49      "566",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Nigeria@en",
   :skos/altLabel          ["NG" "NGA" "566"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def NI
  "NI"
  {:db/ident               :dpvo-legal/NI,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Americas
                            :dpvo-legal/CentralAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean],
   :dpvo-legal/iso_alpha2  "NI",
   :dpvo-legal/iso_alpha3  "NIC",
   :dpvo-legal/iso_numeric "558",
   :dpvo-legal/un_m49      "558",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Nicaragua@en",
   :skos/altLabel          ["NI" "NIC" "558"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def NL
  "NL"
  {:db/ident               :dpvo-legal/NL,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EEA
                            :dpvo-legal/EEA30
                            :dpvo-legal/EU
                            :dpvo-legal/EU27
                            :dpvo-legal/EU28
                            :dpvo-legal/EEA31],
   :dcterms/isPartOf       [:dpvo-legal/WesternEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "NL",
   :dpvo-legal/iso_alpha3  "NLD",
   :dpvo-legal/iso_numeric "528",
   :dpvo-legal/un_m49      "528",
   :dpvo/hasAuthority      :dpvo-legal/DPA-NL,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Netherlands@en",
   :skos/altLabel          ["NL" "NLD" "528"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def NO
  "NO"
  {:db/ident               :dpvo-legal/NO,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/NorthernEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "NO",
   :dpvo-legal/iso_alpha3  "NOR",
   :dpvo-legal/iso_numeric "578",
   :dpvo-legal/un_m49      "578",
   :dpvo/hasAuthority      :dpvo-legal/DPV-NO,
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Norway@en",
   :skos/altLabel          ["NO" "NOR" "578"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def NP
  "NP"
  {:db/ident               :dpvo-legal/NP,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SouthernAsia :dpvo-legal/Asia],
   :dpvo-legal/iso_alpha2  "NP",
   :dpvo-legal/iso_alpha3  "NPL",
   :dpvo-legal/iso_numeric "524",
   :dpvo-legal/un_m49      "524",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Nepal@en",
   :skos/altLabel          ["NP" "NPL" "524"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def NR
  "NR"
  {:db/ident               :dpvo-legal/NR,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Micronesia :dpvo-legal/Oceania],
   :dpvo-legal/iso_alpha2  "NR",
   :dpvo-legal/iso_alpha3  "NRU",
   :dpvo-legal/iso_numeric "520",
   :dpvo-legal/un_m49      "520",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Nauru@en",
   :skos/altLabel          ["NR" "NRU" "520"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def NU
  "NU"
  {:db/ident               :dpvo-legal/NU,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Polynesia :dpvo-legal/Oceania],
   :dpvo-legal/iso_alpha2  "NU",
   :dpvo-legal/iso_alpha3  "NIU",
   :dpvo-legal/iso_numeric "570",
   :dpvo-legal/un_m49      "570",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Niue@en",
   :skos/altLabel          ["NU" "NIU" "570"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def NZ
  "NZ"
  {:db/ident               :dpvo-legal/NZ,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Oceania
                            :dpvo-legal/AustraliaandNewZealand],
   :dpvo-legal/iso_alpha2  "NZ",
   :dpvo-legal/iso_alpha3  "NZL",
   :dpvo-legal/iso_numeric "554",
   :dpvo-legal/un_m49      "554",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "New Zealand@en",
   :skos/altLabel          ["NZ" "NZL" "554"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def NorthernAfrica
  "NorthernAfrica"
  {:db/ident         :dpvo-legal/NorthernAfrica,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/SD
                      :dpvo-legal/TN
                      :dpvo-legal/LY
                      :dpvo-legal/MA
                      :dpvo-legal/EH
                      :dpvo-legal/DZ
                      :dpvo-legal/EG],
   :dcterms/isPartOf :dpvo-legal/Africa,
   :rdf/type         [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "NorthernAfrica@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def NorthernAmerica
  "NorthernAmerica"
  {:db/ident :dpvo-legal/NorthernAmerica,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart
   [:dpvo-legal/CA :dpvo-legal/BM :dpvo-legal/GL :dpvo-legal/US :dpvo-legal/PM],
   :dcterms/isPartOf :dpvo-legal/Americas,
   :rdf/type [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString "NorthernAmerica@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def NorthernEurope
  "NorthernEurope"
  {:db/ident         :dpvo-legal/NorthernEurope,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/AX
                      :dpvo-legal/FI
                      :dpvo-legal/SJ
                      :dpvo-legal/LV
                      :dpvo-legal/IE
                      :dpvo-legal/GG
                      :dpvo-legal/DK
                      :dpvo-legal/LT
                      :dpvo-legal/IM
                      :dpvo-legal/FO
                      :dpvo-legal/ChannelIslands
                      :dpvo-legal/Sark
                      :dpvo-legal/NO
                      :dpvo-legal/SE
                      :dpvo-legal/EE
                      :dpvo-legal/IS
                      :dpvo-legal/GB
                      :dpvo-legal/JE],
   :dcterms/isPartOf :dpvo-legal/Europe,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "NorthernEurope@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def OM
  "OM"
  {:db/ident               :dpvo-legal/OM,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/WesternAsia],
   :dpvo-legal/iso_alpha2  "OM",
   :dpvo-legal/iso_alpha3  "OMN",
   :dpvo-legal/iso_numeric "512",
   :dpvo-legal/un_m49      "512",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Oman@en",
   :skos/altLabel          ["OM" "OMN" "512"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def Oceania
  "Oceania"
  {:db/ident         :dpvo-legal/Oceania,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/NU
                      :dpvo-legal/TO
                      :dpvo-legal/TK
                      :dpvo-legal/FM
                      :dpvo-legal/PF
                      :dpvo-legal/Polynesia
                      :dpvo-legal/CX
                      :dpvo-legal/NZ
                      :dpvo-legal/AU
                      :dpvo-legal/UM
                      :dpvo-legal/AustraliaandNewZealand
                      :dpvo-legal/MH
                      :dpvo-legal/KI
                      :dpvo-legal/NF
                      :dpvo-legal/PW
                      :dpvo-legal/MP
                      :dpvo-legal/WS
                      :dpvo-legal/PN
                      :dpvo-legal/WF
                      :dpvo-legal/SB
                      :dpvo-legal/CC
                      :dpvo-legal/Melanesia
                      :dpvo-legal/TV
                      :dpvo-legal/VU
                      :dpvo-legal/AS
                      :dpvo-legal/GU
                      :dpvo-legal/NR
                      :dpvo-legal/Micronesia
                      :dpvo-legal/HM
                      :dpvo-legal/PG
                      :dpvo-legal/FJ
                      :dpvo-legal/NC
                      :dpvo-legal/CK],
   :rdf/type         [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Oceania@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def PA
  "PA"
  {:db/ident               :dpvo-legal/PA,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas
                            :dpvo-legal/CentralAmerica],
   :dpvo-legal/iso_alpha2  "PA",
   :dpvo-legal/iso_alpha3  "PAN",
   :dpvo-legal/iso_numeric "591",
   :dpvo-legal/un_m49      "591",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Panama@en",
   :skos/altLabel          ["PA" "PAN" "591"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def PE
  "PE"
  {:db/ident               :dpvo-legal/PE,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SouthAmerica
                            :dpvo-legal/Americas
                            :dpvo-legal/LatinAmericaandtheCaribbean],
   :dpvo-legal/iso_alpha2  "PE",
   :dpvo-legal/iso_alpha3  "PER",
   :dpvo-legal/iso_numeric "604",
   :dpvo-legal/un_m49      "604",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Peru@en",
   :skos/altLabel          ["PE" "PER" "604"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def PF
  "PF"
  {:db/ident               :dpvo-legal/PF,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Polynesia :dpvo-legal/Oceania],
   :dpvo-legal/iso_alpha2  "PF",
   :dpvo-legal/iso_alpha3  "PYF",
   :dpvo-legal/iso_numeric "258",
   :dpvo-legal/un_m49      "258",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "French Polynesia@en",
   :skos/altLabel          ["PF" "PYF" "258"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def PG
  "PG"
  {:db/ident               :dpvo-legal/PG,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Melanesia :dpvo-legal/Oceania],
   :dpvo-legal/iso_alpha2  "PG",
   :dpvo-legal/iso_alpha3  "PNG",
   :dpvo-legal/iso_numeric "598",
   :dpvo-legal/un_m49      "598",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Papua New Guinea@en",
   :skos/altLabel          ["PG" "PNG" "598"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def PH
  "PH"
  {:db/ident               :dpvo-legal/PH,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SoutheasternAsia :dpvo-legal/Asia],
   :dpvo-legal/iso_alpha2  "PH",
   :dpvo-legal/iso_alpha3  "PHL",
   :dpvo-legal/iso_numeric "608",
   :dpvo-legal/un_m49      "608",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Philippines@en",
   :skos/altLabel          ["PH" "PHL" "608"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def PK
  "PK"
  {:db/ident               :dpvo-legal/PK,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/SouthernAsia],
   :dpvo-legal/iso_alpha2  "PK",
   :dpvo-legal/iso_alpha3  "PAK",
   :dpvo-legal/iso_numeric "586",
   :dpvo-legal/un_m49      "586",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Pakistan@en",
   :skos/altLabel          ["PK" "PAK" "586"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def PL
  "PL"
  {:db/ident               :dpvo-legal/PL,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EEA30
                            :dpvo-legal/EU
                            :dpvo-legal/EU27
                            :dpvo-legal/EU28
                            :dpvo-legal/EEA31
                            :dpvo-legal/EEA],
   :dcterms/isPartOf       [:dpvo-legal/Europe :dpvo-legal/EasternEurope],
   :dpvo-legal/iso_alpha2  "PL",
   :dpvo-legal/iso_alpha3  "POL",
   :dpvo-legal/iso_numeric "616",
   :dpvo-legal/un_m49      "616",
   :dpvo/hasAuthority      :dpvo-legal/DPA-PL,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Poland@en",
   :skos/altLabel          ["PL" "POL" "616"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def PM
  "PM"
  {:db/ident               :dpvo-legal/PM,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Americas :dpvo-legal/NorthernAmerica],
   :dpvo-legal/iso_alpha2  "PM",
   :dpvo-legal/iso_alpha3  "SPM",
   :dpvo-legal/iso_numeric "666",
   :dpvo-legal/un_m49      "666",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Saint Pierre and Miquelon@en",
   :skos/altLabel          ["PM" "SPM" "666"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def PN
  "PN"
  {:db/ident               :dpvo-legal/PN,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Oceania :dpvo-legal/Polynesia],
   :dpvo-legal/iso_alpha2  "PN",
   :dpvo-legal/iso_alpha3  "PCN",
   :dpvo-legal/iso_numeric "612",
   :dpvo-legal/un_m49      "612",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Pitcairn@en",
   :skos/altLabel          ["PN" "PCN" "612"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def PR
  "PR"
  {:db/ident               :dpvo-legal/PR,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Caribbean
                            :dpvo-legal/Americas
                            :dpvo-legal/LatinAmericaandtheCaribbean],
   :dpvo-legal/iso_alpha2  "PR",
   :dpvo-legal/iso_alpha3  "PRI",
   :dpvo-legal/iso_numeric "630",
   :dpvo-legal/un_m49      "630",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Puerto Rico@en",
   :skos/altLabel          ["PR" "PRI" "630"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def PS
  "PS"
  {:db/ident               :dpvo-legal/PS,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/WesternAsia :dpvo-legal/Asia],
   :dpvo-legal/iso_alpha2  "PS",
   :dpvo-legal/iso_alpha3  "PSE",
   :dpvo-legal/iso_numeric "275",
   :dpvo-legal/un_m49      "275",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "State of Palestine@en",
   :skos/altLabel          ["PS" "PSE" "275"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def PT
  "PT"
  {:db/ident               :dpvo-legal/PT,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EEA30
                            :dpvo-legal/EU27
                            :dpvo-legal/EU28
                            :dpvo-legal/EEA
                            :dpvo-legal/EU
                            :dpvo-legal/EEA31],
   :dcterms/isPartOf       [:dpvo-legal/SouthernEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "PT",
   :dpvo-legal/iso_alpha3  "PRT",
   :dpvo-legal/iso_numeric "620",
   :dpvo-legal/un_m49      "620",
   :dpvo/hasAuthority      :dpvo-legal/DPA-PT,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Portugal@en",
   :skos/altLabel          ["PT" "PRT" "620"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def PW
  "PW"
  {:db/ident               :dpvo-legal/PW,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Micronesia :dpvo-legal/Oceania],
   :dpvo-legal/iso_alpha2  "PW",
   :dpvo-legal/iso_alpha3  "PLW",
   :dpvo-legal/iso_numeric "585",
   :dpvo-legal/un_m49      "585",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Palau@en",
   :skos/altLabel          ["PW" "PLW" "585"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def PY
  "PY"
  {:db/ident               :dpvo-legal/PY,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SouthAmerica
                            :dpvo-legal/Americas
                            :dpvo-legal/LatinAmericaandtheCaribbean],
   :dpvo-legal/iso_alpha2  "PY",
   :dpvo-legal/iso_alpha3  "PRY",
   :dpvo-legal/iso_numeric "600",
   :dpvo-legal/un_m49      "600",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Paraguay@en",
   :skos/altLabel          ["PY" "PRY" "600"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def Polynesia
  "Polynesia"
  {:db/ident         :dpvo-legal/Polynesia,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/TO
                      :dpvo-legal/TK
                      :dpvo-legal/TV
                      :dpvo-legal/AS
                      :dpvo-legal/PN
                      :dpvo-legal/CK
                      :dpvo-legal/WS
                      :dpvo-legal/PF
                      :dpvo-legal/NU
                      :dpvo-legal/WF],
   :dcterms/isPartOf :dpvo-legal/Oceania,
   :rdf/type         [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Polynesia@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def QA
  "QA"
  {:db/ident               :dpvo-legal/QA,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/WesternAsia],
   :dpvo-legal/iso_alpha2  "QA",
   :dpvo-legal/iso_alpha3  "QAT",
   :dpvo-legal/iso_numeric "634",
   :dpvo-legal/un_m49      "634",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Qatar@en",
   :skos/altLabel          ["QA" "QAT" "634"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def RE
  "RE"
  {:db/ident               :dpvo-legal/RE,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/Africa
                            :dpvo-legal/EasternAfrica],
   :dpvo-legal/iso_alpha2  "RE",
   :dpvo-legal/iso_alpha3  "REU",
   :dpvo-legal/iso_numeric "638",
   :dpvo-legal/un_m49      "638",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Réunion@en",
   :skos/altLabel          ["RE" "REU" "638"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def RO
  "RO"
  {:db/ident               :dpvo-legal/RO,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EEA30
                            :dpvo-legal/EU
                            :dpvo-legal/EU28
                            :dpvo-legal/EEA31
                            :dpvo-legal/EU27
                            :dpvo-legal/EEA],
   :dcterms/isPartOf       [:dpvo-legal/EasternEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "RO",
   :dpvo-legal/iso_alpha3  "ROU",
   :dpvo-legal/iso_numeric "642",
   :dpvo-legal/un_m49      "642",
   :dpvo/hasAuthority      :dpvo-legal/DPA-RO,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Romania@en",
   :skos/altLabel          ["RO" "ROU" "642"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def RS
  "RS"
  {:db/ident               :dpvo-legal/RS,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SouthernEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "RS",
   :dpvo-legal/iso_alpha3  "SRB",
   :dpvo-legal/iso_numeric "688",
   :dpvo-legal/un_m49      "688",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Serbia@en",
   :skos/altLabel          ["RS" "SRB" "688"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def RU
  "RU"
  {:db/ident               :dpvo-legal/RU,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/EasternEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "RU",
   :dpvo-legal/iso_alpha3  "RUS",
   :dpvo-legal/iso_numeric "643",
   :dpvo-legal/un_m49      "643",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Russian Federation@en",
   :skos/altLabel          ["RU" "RUS" "643"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def RW
  "RW"
  {:db/ident               :dpvo-legal/RW,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/EasternAfrica
                            :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/Africa],
   :dpvo-legal/iso_alpha2  "RW",
   :dpvo-legal/iso_alpha3  "RWA",
   :dpvo-legal/iso_numeric "646",
   :dpvo-legal/un_m49      "646",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Rwanda@en",
   :skos/altLabel          ["RW" "RWA" "646"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def SA
  "SA"
  {:db/ident               :dpvo-legal/SA,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/WesternAsia],
   :dpvo-legal/iso_alpha2  "SA",
   :dpvo-legal/iso_alpha3  "SAU",
   :dpvo-legal/iso_numeric "682",
   :dpvo-legal/un_m49      "682",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Saudi Arabia@en",
   :skos/altLabel          ["SA" "SAU" "682"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def SB
  "SB"
  {:db/ident               :dpvo-legal/SB,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Oceania :dpvo-legal/Melanesia],
   :dpvo-legal/iso_alpha2  "SB",
   :dpvo-legal/iso_alpha3  "SLB",
   :dpvo-legal/iso_numeric "90",
   :dpvo-legal/un_m49      "90",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Solomon Islands@en",
   :skos/altLabel          ["SB" "SLB" "90"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def SC
  "SC"
  {:db/ident               :dpvo-legal/SC,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/EasternAfrica
                            :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/Africa],
   :dpvo-legal/iso_alpha2  "SC",
   :dpvo-legal/iso_alpha3  "SYC",
   :dpvo-legal/iso_numeric "690",
   :dpvo-legal/un_m49      "690",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Seychelles@en",
   :skos/altLabel          ["SC" "SYC" "690"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def SD
  "SD"
  {:db/ident               :dpvo-legal/SD,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Africa :dpvo-legal/NorthernAfrica],
   :dpvo-legal/iso_alpha2  "SD",
   :dpvo-legal/iso_alpha3  "SDN",
   :dpvo-legal/iso_numeric "729",
   :dpvo-legal/un_m49      "729",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Sudan@en",
   :skos/altLabel          ["SD" "SDN" "729"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def SE
  "SE"
  {:db/ident               :dpvo-legal/SE,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EU27
                            :dpvo-legal/EEA31
                            :dpvo-legal/EEA30
                            :dpvo-legal/EEA
                            :dpvo-legal/EU28
                            :dpvo-legal/EU],
   :dcterms/isPartOf       [:dpvo-legal/NorthernEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "SE",
   :dpvo-legal/iso_alpha3  "SWE",
   :dpvo-legal/iso_numeric "752",
   :dpvo-legal/un_m49      "752",
   :dpvo/hasAuthority      :dpvo-legal/DPA-SE,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Sweden@en",
   :skos/altLabel          ["SE" "SWE" "752"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def SG
  "SG"
  {:db/ident               :dpvo-legal/SG,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/SoutheasternAsia],
   :dpvo-legal/iso_alpha2  "SG",
   :dpvo-legal/iso_alpha3  "SGP",
   :dpvo-legal/iso_numeric "702",
   :dpvo-legal/un_m49      "702",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Singapore@en",
   :skos/altLabel          ["SG" "SGP" "702"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def SH
  "SH"
  {:db/ident               :dpvo-legal/SH,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/WesternAfrica],
   :dpvo-legal/iso_alpha2  "SH",
   :dpvo-legal/iso_alpha3  "SHN",
   :dpvo-legal/iso_numeric "654",
   :dpvo-legal/un_m49      "654",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Saint Helena@en",
   :skos/altLabel          ["SH" "SHN" "654"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def SI
  "SI"
  {:db/ident               :dpvo-legal/SI,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EU27
                            :dpvo-legal/EEA30
                            :dpvo-legal/EU28
                            :dpvo-legal/EEA31
                            :dpvo-legal/EEA
                            :dpvo-legal/EU],
   :dcterms/isPartOf       [:dpvo-legal/SouthernEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "SI",
   :dpvo-legal/iso_alpha3  "SVN",
   :dpvo-legal/iso_numeric "705",
   :dpvo-legal/un_m49      "705",
   :dpvo/hasAuthority      :dpvo-legal/DPA-SI,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Slovenia@en",
   :skos/altLabel          ["SI" "SVN" "705"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def SJ
  "SJ"
  {:db/ident               :dpvo-legal/SJ,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Europe :dpvo-legal/NorthernEurope],
   :dpvo-legal/iso_alpha2  "SJ",
   :dpvo-legal/iso_alpha3  "SJM",
   :dpvo-legal/iso_numeric "744",
   :dpvo-legal/un_m49      "744",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Svalbard and Jan Mayen Islands@en",
   :skos/altLabel          ["SJ" "SJM" "744"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def SK
  "SK"
  {:db/ident               :dpvo-legal/SK,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/EU
                            :dpvo-legal/EEA31
                            :dpvo-legal/EEA
                            :dpvo-legal/EU28
                            :dpvo-legal/EU27
                            :dpvo-legal/EEA30],
   :dcterms/isPartOf       [:dpvo-legal/Europe :dpvo-legal/EasternEurope],
   :dpvo-legal/iso_alpha2  "SK",
   :dpvo-legal/iso_alpha3  "SVK",
   :dpvo-legal/iso_numeric "703",
   :dpvo-legal/un_m49      "703",
   :dpvo/hasAuthority      :dpvo-legal/DPA-SK,
   :dpvo/hasLaw            :dpvo-legal/EU-GDPR,
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Slovakia@en",
   :skos/altLabel          ["SK" "SVK" "703"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def SL
  "SL"
  {:db/ident               :dpvo-legal/SL,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/WesternAfrica],
   :dpvo-legal/iso_alpha2  "SL",
   :dpvo-legal/iso_alpha3  "SLE",
   :dpvo-legal/iso_numeric "694",
   :dpvo-legal/un_m49      "694",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Sierra Leone@en",
   :skos/altLabel          ["SL" "SLE" "694"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def SM
  "SM"
  {:db/ident               :dpvo-legal/SM,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SouthernEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "SM",
   :dpvo-legal/iso_alpha3  "SMR",
   :dpvo-legal/iso_numeric "674",
   :dpvo-legal/un_m49      "674",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "San Marino@en",
   :skos/altLabel          ["SM" "SMR" "674"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def SN
  "SN"
  {:db/ident               :dpvo-legal/SN,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/WesternAfrica],
   :dpvo-legal/iso_alpha2  "SN",
   :dpvo-legal/iso_alpha3  "SEN",
   :dpvo-legal/iso_numeric "686",
   :dpvo-legal/un_m49      "686",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Senegal@en",
   :skos/altLabel          ["SN" "SEN" "686"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def SO
  "SO"
  {:db/ident               :dpvo-legal/SO,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Africa
                            :dpvo-legal/EasternAfrica
                            :dpvo-legal/SubSaharanAfrica],
   :dpvo-legal/iso_alpha2  "SO",
   :dpvo-legal/iso_alpha3  "SOM",
   :dpvo-legal/iso_numeric "706",
   :dpvo-legal/un_m49      "706",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Somalia@en",
   :skos/altLabel          ["SO" "SOM" "706"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def SR
  "SR"
  {:db/ident               :dpvo-legal/SR,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Americas
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/SouthAmerica],
   :dpvo-legal/iso_alpha2  "SR",
   :dpvo-legal/iso_alpha3  "SUR",
   :dpvo-legal/iso_numeric "740",
   :dpvo-legal/un_m49      "740",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Suriname@en",
   :skos/altLabel          ["SR" "SUR" "740"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def SS
  "SS"
  {:db/ident               :dpvo-legal/SS,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica
                            :dpvo-legal/Africa],
   :dpvo-legal/iso_alpha2  "SS",
   :dpvo-legal/iso_alpha3  "SSD",
   :dpvo-legal/iso_numeric "728",
   :dpvo-legal/un_m49      "728",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "South Sudan@en",
   :skos/altLabel          ["SS" "SSD" "728"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def ST
  "ST"
  {:db/ident               :dpvo-legal/ST,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/MiddleAfrica
                            :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica],
   :dpvo-legal/iso_alpha2  "ST",
   :dpvo-legal/iso_alpha3  "STP",
   :dpvo-legal/iso_numeric "678",
   :dpvo-legal/un_m49      "678",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Sao Tome and Principe@en",
   :skos/altLabel          ["ST" "STP" "678"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def SV
  "SV"
  {:db/ident               :dpvo-legal/SV,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Americas
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/CentralAmerica],
   :dpvo-legal/iso_alpha2  "SV",
   :dpvo-legal/iso_alpha3  "SLV",
   :dpvo-legal/iso_numeric "222",
   :dpvo-legal/un_m49      "222",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "El Salvador@en",
   :skos/altLabel          ["SV" "SLV" "222"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def SX
  "SX"
  {:db/ident               :dpvo-legal/SX,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Caribbean
                            :dpvo-legal/Americas
                            :dpvo-legal/LatinAmericaandtheCaribbean],
   :dpvo-legal/iso_alpha2  "SX",
   :dpvo-legal/iso_alpha3  "SXM",
   :dpvo-legal/iso_numeric "534",
   :dpvo-legal/un_m49      "534",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Sint Maarten (Dutch part)@en",
   :skos/altLabel          ["SX" "SXM" "534"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def SY
  "SY"
  {:db/ident               :dpvo-legal/SY,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/WesternAsia :dpvo-legal/Asia],
   :dpvo-legal/iso_alpha2  "SY",
   :dpvo-legal/iso_alpha3  "SYR",
   :dpvo-legal/iso_numeric "760",
   :dpvo-legal/un_m49      "760",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Syrian Arab Republic@en",
   :skos/altLabel          ["SY" "SYR" "760"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def SZ
  "SZ"
  {:db/ident               :dpvo-legal/SZ,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SouthernAfrica
                            :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica],
   :dpvo-legal/iso_alpha2  "SZ",
   :dpvo-legal/iso_alpha3  "SWZ",
   :dpvo-legal/iso_numeric "748",
   :dpvo-legal/un_m49      "748",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Eswatini@en",
   :skos/altLabel          ["SZ" "SWZ" "748"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def Sark
  "Sark"
  {:db/ident         :dpvo-legal/Sark,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf [:dpvo-legal/NorthernEurope
                      :dpvo-legal/ChannelIslands
                      :dpvo-legal/Europe],
   :rdf/type         [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Sark@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def SouthAmerica
  "SouthAmerica"
  {:db/ident         :dpvo-legal/SouthAmerica,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/CL
                      :dpvo-legal/FK
                      :dpvo-legal/VE
                      :dpvo-legal/BR
                      :dpvo-legal/PY
                      :dpvo-legal/GY
                      :dpvo-legal/GF
                      :dpvo-legal/BO
                      :dpvo-legal/PE
                      :dpvo-legal/GS
                      :dpvo-legal/EC
                      :dpvo-legal/CO
                      :dpvo-legal/SR
                      :dpvo-legal/AR
                      :dpvo-legal/UY
                      :dpvo-legal/BV],
   :dcterms/isPartOf :dpvo-legal/LatinAmericaandtheCaribbean,
   :rdf/type         [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "SouthAmerica@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def SoutheasternAsia
  "SoutheasternAsia"
  {:db/ident         :dpvo-legal/SoutheasternAsia,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/VN
                      :dpvo-legal/PH
                      :dpvo-legal/TH
                      :dpvo-legal/TL
                      :dpvo-legal/ID
                      :dpvo-legal/SG
                      :dpvo-legal/MM
                      :dpvo-legal/KH
                      :dpvo-legal/MY
                      :dpvo-legal/LA
                      :dpvo-legal/BN],
   :dcterms/isPartOf :dpvo-legal/Asia,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "SoutheasternAsia@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def SouthernAfrica
  "SouthernAfrica"
  {:db/ident :dpvo-legal/SouthernAfrica,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart
   [:dpvo-legal/NA :dpvo-legal/ZA :dpvo-legal/LS :dpvo-legal/SZ :dpvo-legal/BW],
   :dcterms/isPartOf :dpvo-legal/SubSaharanAfrica,
   :rdf/type [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString "SouthernAfrica@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def SouthernAsia
  "SouthernAsia"
  {:db/ident         :dpvo-legal/SouthernAsia,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/MV
                      :dpvo-legal/PK
                      :dpvo-legal/NP
                      :dpvo-legal/BT
                      :dpvo-legal/LK
                      :dpvo-legal/IN
                      :dpvo-legal/IR
                      :dpvo-legal/BD
                      :dpvo-legal/AF],
   :dcterms/isPartOf :dpvo-legal/Asia,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "SouthernAsia@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def SouthernEurope
  "SouthernEurope"
  {:db/ident         :dpvo-legal/SouthernEurope,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/HR
                      :dpvo-legal/AD
                      :dpvo-legal/AL
                      :dpvo-legal/SI
                      :dpvo-legal/MT
                      :dpvo-legal/RS
                      :dpvo-legal/SM
                      :dpvo-legal/PT
                      :dpvo-legal/IT
                      :dpvo-legal/BA
                      :dpvo-legal/MK
                      :dpvo-legal/ME
                      :dpvo-legal/ES
                      :dpvo-legal/VA
                      :dpvo-legal/GI
                      :dpvo-legal/GR],
   :dcterms/isPartOf :dpvo-legal/Europe,
   :rdf/type         [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "SouthernEurope@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def SubSaharanAfrica
  "SubSaharanAfrica"
  {:db/ident         :dpvo-legal/SubSaharanAfrica,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/KM
                      :dpvo-legal/SL
                      :dpvo-legal/LS
                      :dpvo-legal/YT
                      :dpvo-legal/SC
                      :dpvo-legal/BF
                      :dpvo-legal/BI
                      :dpvo-legal/TG
                      :dpvo-legal/IO
                      :dpvo-legal/BW
                      :dpvo-legal/WesternAfrica
                      :dpvo-legal/CG
                      :dpvo-legal/MU
                      :dpvo-legal/ST
                      :dpvo-legal/TZ
                      :dpvo-legal/RW
                      :dpvo-legal/CV
                      :dpvo-legal/RE
                      :dpvo-legal/NE
                      :dpvo-legal/TD
                      :dpvo-legal/SouthernAfrica
                      :dpvo-legal/NA
                      :dpvo-legal/GH
                      :dpvo-legal/EasternAfrica
                      :dpvo-legal/CD
                      :dpvo-legal/ER
                      :dpvo-legal/DJ
                      :dpvo-legal/GW
                      :dpvo-legal/GA
                      :dpvo-legal/ZA
                      :dpvo-legal/MG
                      :dpvo-legal/BJ
                      :dpvo-legal/ZW
                      :dpvo-legal/GM
                      :dpvo-legal/CI
                      :dpvo-legal/UG
                      :dpvo-legal/MR
                      :dpvo-legal/SN
                      :dpvo-legal/ET
                      :dpvo-legal/MiddleAfrica
                      :dpvo-legal/SH
                      :dpvo-legal/ZM
                      :dpvo-legal/GQ
                      :dpvo-legal/ML
                      :dpvo-legal/CM
                      :dpvo-legal/MZ
                      :dpvo-legal/LR
                      :dpvo-legal/SZ
                      :dpvo-legal/MW
                      :dpvo-legal/KE
                      :dpvo-legal/SS
                      :dpvo-legal/TF
                      :dpvo-legal/GN
                      :dpvo-legal/NG
                      :dpvo-legal/SO
                      :dpvo-legal/AO
                      :dpvo-legal/CF],
   :dcterms/isPartOf :dpvo-legal/Africa,
   :rdf/type         [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "SubSaharanAfrica@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def TC
  "TC"
  {:db/ident               :dpvo-legal/TC,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Caribbean
                            :dpvo-legal/Americas
                            :dpvo-legal/LatinAmericaandtheCaribbean],
   :dpvo-legal/iso_alpha2  "TC",
   :dpvo-legal/iso_alpha3  "TCA",
   :dpvo-legal/iso_numeric "796",
   :dpvo-legal/un_m49      "796",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Turks and Caicos Islands@en",
   :skos/altLabel          ["TC" "TCA" "796"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def TD
  "TD"
  {:db/ident               :dpvo-legal/TD,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/MiddleAfrica
                            :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica],
   :dpvo-legal/iso_alpha2  "TD",
   :dpvo-legal/iso_alpha3  "TCD",
   :dpvo-legal/iso_numeric "148",
   :dpvo-legal/un_m49      "148",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Chad@en",
   :skos/altLabel          ["TD" "TCD" "148"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def TF
  "TF"
  {:db/ident               :dpvo-legal/TF,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica],
   :dpvo-legal/iso_alpha2  "TF",
   :dpvo-legal/iso_alpha3  "ATF",
   :dpvo-legal/iso_numeric "260",
   :dpvo-legal/un_m49      "260",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "French Southern Territories@en",
   :skos/altLabel          ["TF" "ATF" "260"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def TG
  "TG"
  {:db/ident               :dpvo-legal/TG,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Africa
                            :dpvo-legal/WesternAfrica
                            :dpvo-legal/SubSaharanAfrica],
   :dpvo-legal/iso_alpha2  "TG",
   :dpvo-legal/iso_alpha3  "TGO",
   :dpvo-legal/iso_numeric "768",
   :dpvo-legal/un_m49      "768",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Togo@en",
   :skos/altLabel          ["TG" "TGO" "768"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def TH
  "TH"
  {:db/ident               :dpvo-legal/TH,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SoutheasternAsia :dpvo-legal/Asia],
   :dpvo-legal/iso_alpha2  "TH",
   :dpvo-legal/iso_alpha3  "THA",
   :dpvo-legal/iso_numeric "764",
   :dpvo-legal/un_m49      "764",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Thailand@en",
   :skos/altLabel          ["TH" "THA" "764"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def TJ
  "TJ"
  {:db/ident               :dpvo-legal/TJ,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/CentralAsia],
   :dpvo-legal/iso_alpha2  "TJ",
   :dpvo-legal/iso_alpha3  "TJK",
   :dpvo-legal/iso_numeric "762",
   :dpvo-legal/un_m49      "762",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Tajikistan@en",
   :skos/altLabel          ["TJ" "TJK" "762"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def TK
  "TK"
  {:db/ident               :dpvo-legal/TK,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Polynesia :dpvo-legal/Oceania],
   :dpvo-legal/iso_alpha2  "TK",
   :dpvo-legal/iso_alpha3  "TKL",
   :dpvo-legal/iso_numeric "772",
   :dpvo-legal/un_m49      "772",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Tokelau@en",
   :skos/altLabel          ["TK" "TKL" "772"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def TL
  "TL"
  {:db/ident               :dpvo-legal/TL,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/SoutheasternAsia],
   :dpvo-legal/iso_alpha2  "TL",
   :dpvo-legal/iso_alpha3  "TLS",
   :dpvo-legal/iso_numeric "626",
   :dpvo-legal/un_m49      "626",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Timor-Leste@en",
   :skos/altLabel          ["TL" "TLS" "626"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def TM
  "TM"
  {:db/ident               :dpvo-legal/TM,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/CentralAsia],
   :dpvo-legal/iso_alpha2  "TM",
   :dpvo-legal/iso_alpha3  "TKM",
   :dpvo-legal/iso_numeric "795",
   :dpvo-legal/un_m49      "795",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Turkmenistan@en",
   :skos/altLabel          ["TM" "TKM" "795"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def TN
  "TN"
  {:db/ident               :dpvo-legal/TN,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Africa :dpvo-legal/NorthernAfrica],
   :dpvo-legal/iso_alpha2  "TN",
   :dpvo-legal/iso_alpha3  "TUN",
   :dpvo-legal/iso_numeric "788",
   :dpvo-legal/un_m49      "788",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Tunisia@en",
   :skos/altLabel          ["TN" "TUN" "788"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def TO
  "TO"
  {:db/ident               :dpvo-legal/TO,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Oceania :dpvo-legal/Polynesia],
   :dpvo-legal/iso_alpha2  "TO",
   :dpvo-legal/iso_alpha3  "TON",
   :dpvo-legal/iso_numeric "776",
   :dpvo-legal/un_m49      "776",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Tonga@en",
   :skos/altLabel          ["TO" "TON" "776"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def TR
  "TR"
  {:db/ident               :dpvo-legal/TR,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/WesternAsia],
   :dpvo-legal/iso_alpha2  "TR",
   :dpvo-legal/iso_alpha3  "TUR",
   :dpvo-legal/iso_numeric "792",
   :dpvo-legal/un_m49      "792",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Turkey@en",
   :skos/altLabel          ["TR" "TUR" "792"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def TT
  "TT"
  {:db/ident               :dpvo-legal/TT,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Caribbean
                            :dpvo-legal/Americas],
   :dpvo-legal/iso_alpha2  "TT",
   :dpvo-legal/iso_alpha3  "TTO",
   :dpvo-legal/iso_numeric "780",
   :dpvo-legal/un_m49      "780",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Trinidad and Tobago@en",
   :skos/altLabel          ["TT" "TTO" "780"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def TV
  "TV"
  {:db/ident               :dpvo-legal/TV,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Oceania :dpvo-legal/Polynesia],
   :dpvo-legal/iso_alpha2  "TV",
   :dpvo-legal/iso_alpha3  "TUV",
   :dpvo-legal/iso_numeric "798",
   :dpvo-legal/un_m49      "798",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Tuvalu@en",
   :skos/altLabel          ["TV" "TUV" "798"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def TW
  "Taiwan (Province of China)"
  {:db/ident         :dpvo-legal/TW,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :rdf/type         [:dpvo/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Taiwan (Province of China)@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def TZ
  "TZ"
  {:db/ident               :dpvo-legal/TZ,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica],
   :dpvo-legal/iso_alpha2  "TZ",
   :dpvo-legal/iso_alpha3  "TZA",
   :dpvo-legal/iso_numeric "834",
   :dpvo-legal/un_m49      "834",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "United Republic of Tanzania@en",
   :skos/altLabel          ["TZ" "TZA" "834"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def UA
  "UA"
  {:db/ident               :dpvo-legal/UA,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Europe :dpvo-legal/EasternEurope],
   :dpvo-legal/iso_alpha2  "UA",
   :dpvo-legal/iso_alpha3  "UKR",
   :dpvo-legal/iso_numeric "804",
   :dpvo-legal/un_m49      "804",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Ukraine@en",
   :skos/altLabel          ["UA" "UKR" "804"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def UG
  "UG"
  {:db/ident               :dpvo-legal/UG,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Africa
                            :dpvo-legal/EasternAfrica
                            :dpvo-legal/SubSaharanAfrica],
   :dpvo-legal/iso_alpha2  "UG",
   :dpvo-legal/iso_alpha3  "UGA",
   :dpvo-legal/iso_numeric "800",
   :dpvo-legal/un_m49      "800",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Uganda@en",
   :skos/altLabel          ["UG" "UGA" "800"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def UK-DPA-2018
  {:db/ident :dpvo-legal/UK-DPA-2018,
   :dpvo/hasAuthority :dpvo-legal/DPA-GB})

(def UK-GDPR
  {:db/ident :dpvo-legal/UK-GDPR,
   :dpvo/hasAuthority :dpvo-legal/DPA-GB})

(def UM
  "UM"
  {:db/ident               :dpvo-legal/UM,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Micronesia :dpvo-legal/Oceania],
   :dpvo-legal/iso_alpha2  "UM",
   :dpvo-legal/iso_alpha3  "UMI",
   :dpvo-legal/iso_numeric "581",
   :dpvo-legal/un_m49      "581",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString
                            "United States Minor Outlying Islands@en",
   :skos/altLabel          ["UM" "UMI" "581"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def US
  "US"
  {:db/ident               :dpvo-legal/US,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart        [:dpvo-legal/US-OK
                            :dpvo-legal/US-MD
                            :dpvo-legal/US-MN
                            :dpvo-legal/US-WI
                            :dpvo-legal/US-ID
                            :dpvo-legal/US-NJ
                            :dpvo-legal/US-UT
                            :dpvo-legal/US-SD
                            :dpvo-legal/US-NM
                            :dpvo-legal/US-UM
                            :dpvo-legal/US-MS
                            :dpvo-legal/US-AS
                            :dpvo-legal/US-MT
                            :dpvo-legal/US-CT
                            :dpvo-legal/US-MI
                            :dpvo-legal/US-RI
                            :dpvo-legal/US-AZ
                            :dpvo-legal/US-VI
                            :dpvo-legal/US-FL
                            :dpvo-legal/US-PR
                            :dpvo-legal/US-LA
                            :dpvo-legal/US-WY
                            :dpvo-legal/US-TN
                            :dpvo-legal/US-WV
                            :dpvo-legal/US-IA
                            :dpvo-legal/US-WA
                            :dpvo-legal/US-GU
                            :dpvo-legal/US-MP
                            :dpvo-legal/US-DC
                            :dpvo-legal/US-AR
                            :dpvo-legal/US-GA
                            :dpvo-legal/US-OH
                            :dpvo-legal/US-NH
                            :dpvo-legal/US-ND
                            :dpvo-legal/US-NE
                            :dpvo-legal/US-KS
                            :dpvo-legal/US-DE
                            :dpvo-legal/US-NV
                            :dpvo-legal/US-AK
                            :dpvo-legal/US-AL
                            :dpvo-legal/US-IL
                            :dpvo-legal/US-ME
                            :dpvo-legal/US-MO
                            :dpvo-legal/US-OR
                            :dpvo-legal/US-MA
                            :dpvo-legal/US-IN
                            :dpvo-legal/US-TX
                            :dpvo-legal/US-KY
                            :dpvo-legal/US-VT
                            :dpvo-legal/US-VA
                            :dpvo-legal/US-CA
                            :dpvo-legal/US-CO
                            :dpvo-legal/US-PA
                            :dpvo-legal/US-NC
                            :dpvo-legal/US-NY
                            :dpvo-legal/US-SC
                            :dpvo-legal/US-HI],
   :dcterms/isPartOf       [:dpvo-legal/Americas :dpvo-legal/NorthernAmerica],
   :dpvo-legal/iso_alpha2  "US",
   :dpvo-legal/iso_alpha3  "USA",
   :dpvo-legal/iso_numeric "840",
   :dpvo-legal/un_m49      "840",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "United States of America@en",
   :skos/altLabel          ["US" "USA" "840"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def US-AK
  "Alaska"
  {:db/ident         :dpvo-legal/US-AK,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Alaska@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-AL
  "Alabama"
  {:db/ident         :dpvo-legal/US-AL,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Alabama@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-AR
  "Arkansas"
  {:db/ident         :dpvo-legal/US-AR,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Arkansas@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-AS
  "American Samoa"
  {:db/ident         :dpvo-legal/US-AS,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "American Samoa@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-AZ
  "Arizona"
  {:db/ident         :dpvo-legal/US-AZ,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Arizona@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-CA
  "California"
  {:db/ident         :dpvo-legal/US-CA,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :dpvo/hasLaw      [:dpvo-legal/US-CA-CPRA :dpvo-legal/US-CA-CCPA],
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "California@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-CA-CCPA
  "California Consumer Privacy Act (CCPA)"
  {:db/ident :dpvo-legal/US-CA-CCPA,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #xsd/date
                                        #inst "2020-01-01T00:00:00.000-05:00"}},
   :dpvo/hasJurisdiction :dpvo-legal/US-CA,
   :foaf/homepage
   {:rdfa/uri
    "https://leginfo.legislature.ca.gov/faces/billTextClient.xhtml?bill_id=201720180AB375"},
   :rdf/type [:owl/NamedIndividual :dpvo/Law],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString "California Consumer Privacy Act (CCPA)@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def US-CA-CPRA
  "California Privacy Rights Act (CPRA)"
  {:db/ident :dpvo-legal/US-CA-CPRA,
   :dcterms/created #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #xsd/date
                                        #inst "2023-01-01T00:00:00.000-05:00"}},
   :dpvo/hasJurisdiction :dpvo-legal/US-CA,
   :foaf/homepage
   {:rdfa/uri
    "https://leginfo.legislature.ca.gov/faces/billTextClient.xhtml?bill_id=201720180AB375"},
   :rdf/type [:dpvo/Law :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString "California Privacy Rights Act (CPRA)@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def US-CO
  "Colorado"
  {:db/ident          :dpvo-legal/US-CO,
   :dcterms/created   #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator   {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf  :dpvo-legal/US,
   :dpvo/hasAuthority :dpvo-legal/DPA-US-CO,
   :dpvo/hasLaw       :dpvo-legal/US-CO-CPA,
   :rdf/type          [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy  {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label        #xsd/langString "Colorado@en",
   :vs/term_status    #xsd/langString "accepted@en"})

(def US-CO-CPA
  "Colorado Privacy Act (CPA)"
  {:db/ident             :dpvo-legal/US-CO-CPA,
   :dcterms/created      #xsd/date #inst "2022-11-23T00:00:00.000-05:00",
   :dcterms/creator      {:xsd/string "Jonathan Bowker"},
   :dcterms/temporal     {:rdf/type :time/ProperInterval,
                          :time/hasBeginning
                          {:time/inXSDDate #xsd/date
                                            #inst
                                             "2024-01-07T00:00:00.000-05:00"}},
   :dpvo/hasAuthority    :dpvo-legal/DPA-US-CO,
   :dpvo/hasJurisdiction :dpvo-legal/US-CO,
   :foaf/homepage        {:rdfa/uri "https://leg.colorado.gov/bills/sb21-190"},
   :rdf/type             [:dpvo/Law :owl/NamedIndividual],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString "Colorado Privacy Act (CPA)@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def US-CT
  "Connecticut"
  {:db/ident          :dpvo-legal/US-CT,
   :dcterms/created   #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator   {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf  :dpvo-legal/US,
   :dpvo/hasAuthority :dpvo-legal/DPA-US-CT,
   :dpvo/hasLaw       :dpvo-legal/US-CT-CTPA,
   :rdf/type          [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy  {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label        #xsd/langString "Connecticut@en",
   :vs/term_status    #xsd/langString "accepted@en"})

(def US-CT-CTPA
  "Connecticut Data Privacy Act (CTPA)"
  {:db/ident :dpvo-legal/US-CT-CTPA,
   :dcterms/created #xsd/date #inst "2022-11-23T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Jonathan Bowker"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #xsd/date
                                        #inst "2023-01-07T00:00:00.000-05:00"}},
   :dpvo/hasAuthority :dpvo-legal/DPA-US-CT,
   :dpvo/hasJurisdiction :dpvo-legal/US-CT,
   :foaf/homepage
   {:rdfa/uri
    "https://www.cga.ct.gov/2022/ACT/PA/PDF/2022PA-00015-R00SB-00006-PA.PDF"},
   :rdf/type [:owl/NamedIndividual :dpvo/Law],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString "Connecticut Data Privacy Act (CTPA)@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def US-DC
  "District of Columbia"
  {:db/ident         :dpvo-legal/US-DC,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "District of Columbia@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-DE
  "Delaware"
  {:db/ident         :dpvo-legal/US-DE,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Delaware@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-FL
  "Florida"
  {:db/ident         :dpvo-legal/US-FL,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Florida@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-GA
  "Georgia"
  {:db/ident         :dpvo-legal/US-GA,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Georgia@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-GU
  "Guam"
  {:db/ident         :dpvo-legal/US-GU,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Guam@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-HI
  "Hawaii"
  {:db/ident         :dpvo-legal/US-HI,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Hawaii@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-IA
  "Iowa"
  {:db/ident         :dpvo-legal/US-IA,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Iowa@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-ID
  "Idaho"
  {:db/ident         :dpvo-legal/US-ID,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Idaho@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-IL
  "Illinois"
  {:db/ident         :dpvo-legal/US-IL,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Illinois@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-IN
  "Indiana"
  {:db/ident         :dpvo-legal/US-IN,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Indiana@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-KS
  "Kansas"
  {:db/ident         :dpvo-legal/US-KS,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Kansas@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-KY
  "Kentucky"
  {:db/ident         :dpvo-legal/US-KY,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Kentucky@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-LA
  "Louisiana"
  {:db/ident         :dpvo-legal/US-LA,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Louisiana@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-MA
  "Massachusetts"
  {:db/ident         :dpvo-legal/US-MA,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Massachusetts@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-MD
  "Maryland"
  {:db/ident         :dpvo-legal/US-MD,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Maryland@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-ME
  "Maine"
  {:db/ident         :dpvo-legal/US-ME,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Maine@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-MI
  "Michigan"
  {:db/ident         :dpvo-legal/US-MI,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Michigan@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-MN
  "Minnesota"
  {:db/ident         :dpvo-legal/US-MN,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Minnesota@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-MO
  "Missouri"
  {:db/ident         :dpvo-legal/US-MO,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Missouri@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-MP
  "Northern Mariana Islands"
  {:db/ident         :dpvo-legal/US-MP,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Northern Mariana Islands@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-MS
  "Mississippi"
  {:db/ident         :dpvo-legal/US-MS,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Mississippi@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-MT
  "Montana"
  {:db/ident         :dpvo-legal/US-MT,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Montana@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-NC
  "North Carolina"
  {:db/ident         :dpvo-legal/US-NC,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "North Carolina@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-ND
  "North Dakota"
  {:db/ident         :dpvo-legal/US-ND,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "North Dakota@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-NE
  "Nebraska"
  {:db/ident         :dpvo-legal/US-NE,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Nebraska@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-NH
  "New Hampshire"
  {:db/ident         :dpvo-legal/US-NH,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "New Hampshire@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-NJ
  "New Jersey"
  {:db/ident         :dpvo-legal/US-NJ,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "New Jersey@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-NM
  "New Mexico"
  {:db/ident         :dpvo-legal/US-NM,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "New Mexico@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-NV
  "Nevada"
  {:db/ident          :dpvo-legal/US-NV,
   :dcterms/created   #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator   {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf  :dpvo-legal/US,
   :dpvo/hasAuthority :dpvo-legal/DPA-US-NV,
   :dpvo/hasLaw       :dpvo-legal/US-NV-NPICICA,
   :rdf/type          [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy  {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label        #xsd/langString "Nevada@en",
   :vs/term_status    #xsd/langString "accepted@en"})

(def US-NV-NPICICA
  "Nevada Privacy of Information Collected on the Internet from Consumers Act (NPICICA)"
  {:db/ident :dpvo-legal/US-NV-NPICICA,
   :dcterms/created #xsd/date #inst "2022-11-23T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Jonathan Bowker"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #xsd/date
                                        #inst "2021-01-10T00:00:00.000-05:00"}},
   :dpvo/hasAuthority :dpvo-legal/DPA-US-NV,
   :dpvo/hasJurisdiction :dpvo-legal/US-NV,
   :foaf/homepage {:rdfa/uri "https://www.leg.state.nv.us/NRS/NRS-603A.html"},
   :rdf/type [:dpvo/Law :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   #xsd/langString
    "Nevada Privacy of Information Collected on the Internet from Consumers Act (NPICICA)@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def US-NY
  "New York"
  {:db/ident         :dpvo-legal/US-NY,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "New York@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-OH
  "Ohio"
  {:db/ident         :dpvo-legal/US-OH,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Ohio@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-OK
  "Oklahoma"
  {:db/ident         :dpvo-legal/US-OK,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Oklahoma@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-OR
  "Oregon"
  {:db/ident         :dpvo-legal/US-OR,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Oregon@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-PA
  "Pennsylvania"
  {:db/ident         :dpvo-legal/US-PA,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Pennsylvania@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-PR
  "Puerto Rico"
  {:db/ident         :dpvo-legal/US-PR,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Puerto Rico@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-RI
  "Rhode Island"
  {:db/ident         :dpvo-legal/US-RI,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Rhode Island@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-SC
  "South Carolina"
  {:db/ident         :dpvo-legal/US-SC,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "South Carolina@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-SD
  "South Dakota"
  {:db/ident         :dpvo-legal/US-SD,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "South Dakota@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-TN
  "Tennessee"
  {:db/ident         :dpvo-legal/US-TN,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Tennessee@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-TX
  "Texas"
  {:db/ident         :dpvo-legal/US-TX,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Texas@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-UM
  "United States Minor Outlying Islands"
  {:db/ident         :dpvo-legal/US-UM,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "United States Minor Outlying Islands@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-UT
  "Utah"
  {:db/ident          :dpvo-legal/US-UT,
   :dcterms/created   #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator   {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf  :dpvo-legal/US,
   :dpvo/hasAuthority :dpvo-legal/DPA-US-UT,
   :dpvo/hasLaw       :dpvo-legal/US-UT-UCPA,
   :rdf/type          [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy  {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label        #xsd/langString "Utah@en",
   :vs/term_status    #xsd/langString "accepted@en"})

(def US-UT-UCPA
  "Utah Consumer Privacy Act (UCPA)"
  {:db/ident             :dpvo-legal/US-UT-UCPA,
   :dcterms/created      #xsd/date #inst "2022-11-22T00:00:00.000-05:00",
   :dcterms/creator      {:xsd/string "Jonathan Bowker"},
   :dpvo/hasAuthority    :dpvo-legal/DPA-US-UT,
   :dpvo/hasJurisdiction :dpvo-legal/US-UT,
   :foaf/homepage        {:rdfa/uri
                          "https://le.utah.gov/~2022/bills/static/SB0227.html"},
   :rdf/type             [:dpvo/Law :owl/NamedIndividual],
   :rdfs/isDefinedBy     {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #xsd/langString "Utah Consumer Privacy Act (UCPA)@en",
   :vs/term_status       #xsd/langString "accepted@en"})

(def US-VA
  "Virginia"
  {:db/ident          :dpvo-legal/US-VA,
   :dcterms/created   #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator   {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf  :dpvo-legal/US,
   :dpvo/hasAuthority :dpvo-legal/DPA-US-VA,
   :dpvo/hasLaw       :dpvo-legal/US-VA-VCDPA,
   :rdf/type          [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy  {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label        #xsd/langString "Virginia@en",
   :vs/term_status    #xsd/langString "accepted@en"})

(def US-VA-VCDPA
  "Virginia Consumer Data Protection Act (VCDPA)"
  {:db/ident :dpvo-legal/US-VA-VCDPA,
   :dcterms/created #xsd/date #inst "2022-11-23T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Jonathan Bowker"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #xsd/date
                                        #inst "2023-01-01T00:00:00.000-05:00"}},
   :dpvo/hasAuthority :dpvo-legal/DPA-US-VA,
   :dpvo/hasJurisdiction :dpvo-legal/US-VA,
   :foaf/homepage
   {:rdfa/uri "https://lis.virginia.gov/cgi-bin/legp604.exe?212+sum+HB2307"},
   :rdf/type [:owl/NamedIndividual :dpvo/Law],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #xsd/langString
                "Virginia Consumer Data Protection Act (VCDPA)@en",
   :vs/term_status #xsd/langString "accepted@en"})

(def US-VI
  "U.S. Virgin Islands"
  {:db/ident         :dpvo-legal/US-VI,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "U.S. Virgin Islands@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-VT
  "Vermont"
  {:db/ident         :dpvo-legal/US-VT,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Vermont@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-WA
  "Washington"
  {:db/ident         :dpvo-legal/US-WA,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Washington@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-WI
  "Wisconsin"
  {:db/ident         :dpvo-legal/US-WI,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Wisconsin@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-WV
  "West Virginia"
  {:db/ident         :dpvo-legal/US-WV,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "West Virginia@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def US-WY
  "Wyoming"
  {:db/ident         :dpvo-legal/US-WY,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "Wyoming@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def UY
  "UY"
  {:db/ident               :dpvo-legal/UY,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/SouthAmerica
                            :dpvo-legal/Americas],
   :dpvo-legal/iso_alpha2  "UY",
   :dpvo-legal/iso_alpha3  "URY",
   :dpvo-legal/iso_numeric "858",
   :dpvo-legal/un_m49      "858",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Uruguay@en",
   :skos/altLabel          ["UY" "URY" "858"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def UZ
  "UZ"
  {:db/ident               :dpvo-legal/UZ,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Asia :dpvo-legal/CentralAsia],
   :dpvo-legal/iso_alpha2  "UZ",
   :dpvo-legal/iso_alpha3  "UZB",
   :dpvo-legal/iso_numeric "860",
   :dpvo-legal/un_m49      "860",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Uzbekistan@en",
   :skos/altLabel          ["UZ" "UZB" "860"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def VA
  "VA"
  {:db/ident               :dpvo-legal/VA,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SouthernEurope :dpvo-legal/Europe],
   :dpvo-legal/iso_alpha2  "VA",
   :dpvo-legal/iso_alpha3  "VAT",
   :dpvo-legal/iso_numeric "336",
   :dpvo-legal/un_m49      "336",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Holy See@en",
   :skos/altLabel          ["VA" "VAT" "336"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def VC
  "VC"
  {:db/ident               :dpvo-legal/VC,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Caribbean
                            :dpvo-legal/Americas],
   :dpvo-legal/iso_alpha2  "VC",
   :dpvo-legal/iso_alpha3  "VCT",
   :dpvo-legal/iso_numeric "670",
   :dpvo-legal/un_m49      "670",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString
                            "Saint Vincent and the Grenadines@en",
   :skos/altLabel          ["VC" "VCT" "670"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def VE
  "VE"
  {:db/ident               :dpvo-legal/VE,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas
                            :dpvo-legal/SouthAmerica],
   :dpvo-legal/iso_alpha2  "VE",
   :dpvo-legal/iso_alpha3  "VEN",
   :dpvo-legal/iso_numeric "862",
   :dpvo-legal/un_m49      "862",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString
                            "Venezuela (Bolivarian Republic of)@en",
   :skos/altLabel          ["VE" "VEN" "862"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def VG
  "VG"
  {:db/ident               :dpvo-legal/VG,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Caribbean
                            :dpvo-legal/Americas],
   :dpvo-legal/iso_alpha2  "VG",
   :dpvo-legal/iso_alpha3  "VGB",
   :dpvo-legal/iso_numeric "92",
   :dpvo-legal/un_m49      "92",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "British Virgin Islands@en",
   :skos/altLabel          ["VG" "VGB" "92"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def VI
  "VI"
  {:db/ident               :dpvo-legal/VI,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Caribbean
                            :dpvo-legal/Americas],
   :dpvo-legal/iso_alpha2  "VI",
   :dpvo-legal/iso_alpha3  "VIR",
   :dpvo-legal/iso_numeric "850",
   :dpvo-legal/un_m49      "850",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "United States Virgin Islands@en",
   :skos/altLabel          ["VI" "VIR" "850"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def VN
  "VN"
  {:db/ident               :dpvo-legal/VN,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SoutheasternAsia :dpvo-legal/Asia],
   :dpvo-legal/iso_alpha2  "VN",
   :dpvo-legal/iso_alpha3  "VNM",
   :dpvo-legal/iso_numeric "704",
   :dpvo-legal/un_m49      "704",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Viet Nam@en",
   :skos/altLabel          ["VN" "VNM" "704"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def VU
  "VU"
  {:db/ident               :dpvo-legal/VU,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Melanesia :dpvo-legal/Oceania],
   :dpvo-legal/iso_alpha2  "VU",
   :dpvo-legal/iso_alpha3  "VUT",
   :dpvo-legal/iso_numeric "548",
   :dpvo-legal/un_m49      "548",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Vanuatu@en",
   :skos/altLabel          ["VU" "VUT" "548"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def WF
  "WF"
  {:db/ident               :dpvo-legal/WF,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Polynesia :dpvo-legal/Oceania],
   :dpvo-legal/iso_alpha2  "WF",
   :dpvo-legal/iso_alpha3  "WLF",
   :dpvo-legal/iso_numeric "876",
   :dpvo-legal/un_m49      "876",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Wallis and Futuna Islands@en",
   :skos/altLabel          ["WF" "WLF" "876"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def WS
  "WS"
  {:db/ident               :dpvo-legal/WS,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Polynesia :dpvo-legal/Oceania],
   :dpvo-legal/iso_alpha2  "WS",
   :dpvo-legal/iso_alpha3  "WSM",
   :dpvo-legal/iso_numeric "882",
   :dpvo-legal/un_m49      "882",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Samoa@en",
   :skos/altLabel          ["WS" "WSM" "882"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def WesternAfrica
  "WesternAfrica"
  {:db/ident         :dpvo-legal/WesternAfrica,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/BF
                      :dpvo-legal/CV
                      :dpvo-legal/GH
                      :dpvo-legal/NG
                      :dpvo-legal/GW
                      :dpvo-legal/TG
                      :dpvo-legal/SL
                      :dpvo-legal/ML
                      :dpvo-legal/MR
                      :dpvo-legal/LR
                      :dpvo-legal/GN
                      :dpvo-legal/SH
                      :dpvo-legal/GM
                      :dpvo-legal/SN
                      :dpvo-legal/NE
                      :dpvo-legal/CI
                      :dpvo-legal/BJ],
   :dcterms/isPartOf :dpvo-legal/SubSaharanAfrica,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "WesternAfrica@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def WesternAsia
  "WesternAsia"
  {:db/ident         :dpvo-legal/WesternAsia,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/IL
                      :dpvo-legal/KW
                      :dpvo-legal/AM
                      :dpvo-legal/AE
                      :dpvo-legal/IQ
                      :dpvo-legal/CY
                      :dpvo-legal/YE
                      :dpvo-legal/TR
                      :dpvo-legal/SA
                      :dpvo-legal/OM
                      :dpvo-legal/BH
                      :dpvo-legal/QA
                      :dpvo-legal/JO
                      :dpvo-legal/AZ
                      :dpvo-legal/SY
                      :dpvo-legal/GE
                      :dpvo-legal/LB
                      :dpvo-legal/PS],
   :dcterms/isPartOf :dpvo-legal/Asia,
   :rdf/type         [:dpvo/Region :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "WesternAsia@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def WesternEurope
  "WesternEurope"
  {:db/ident         :dpvo-legal/WesternEurope,
   :dcterms/created  #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator  {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/hasPart  [:dpvo-legal/NL
                      :dpvo-legal/BE
                      :dpvo-legal/DE
                      :dpvo-legal/MC
                      :dpvo-legal/AT
                      :dpvo-legal/LU
                      :dpvo-legal/FR
                      :dpvo-legal/CH
                      :dpvo-legal/LI],
   :dcterms/isPartOf :dpvo-legal/Europe,
   :rdf/type         [:owl/NamedIndividual :dpvo/Region],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       #xsd/langString "WesternEurope@en",
   :vs/term_status   #xsd/langString "accepted@en"})

(def YE
  "YE"
  {:db/ident               :dpvo-legal/YE,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/WesternAsia :dpvo-legal/Asia],
   :dpvo-legal/iso_alpha2  "YE",
   :dpvo-legal/iso_alpha3  "YEM",
   :dpvo-legal/iso_numeric "887",
   :dpvo-legal/un_m49      "887",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Yemen@en",
   :skos/altLabel          ["YE" "YEM" "887"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def YT
  "YT"
  {:db/ident               :dpvo-legal/YT,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/EasternAfrica
                            :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica],
   :dpvo-legal/iso_alpha2  "YT",
   :dpvo-legal/iso_alpha3  "MYT",
   :dpvo-legal/iso_numeric "175",
   :dpvo-legal/un_m49      "175",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Mayotte@en",
   :skos/altLabel          ["YT" "MYT" "175"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def ZA
  "ZA"
  {:db/ident               :dpvo-legal/ZA,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/SouthernAfrica],
   :dpvo-legal/iso_alpha2  "ZA",
   :dpvo-legal/iso_alpha3  "ZAF",
   :dpvo-legal/iso_numeric "710",
   :dpvo-legal/un_m49      "710",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "South Africa@en",
   :skos/altLabel          ["ZA" "ZAF" "710"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def ZM
  "ZM"
  {:db/ident               :dpvo-legal/ZM,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/Africa
                            :dpvo-legal/EasternAfrica],
   :dpvo-legal/iso_alpha2  "ZM",
   :dpvo-legal/iso_alpha3  "ZMB",
   :dpvo-legal/iso_numeric "894",
   :dpvo-legal/un_m49      "894",
   :rdf/type               [:owl/NamedIndividual :dpvo/Country :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Zambia@en",
   :skos/altLabel          ["ZM" "ZMB" "894"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def ZW
  "ZW"
  {:db/ident               :dpvo-legal/ZW,
   :dcterms/created        #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator        {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       [:dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica],
   :dpvo-legal/iso_alpha2  "ZW",
   :dpvo-legal/iso_alpha3  "ZWE",
   :dpvo-legal/iso_numeric "716",
   :dpvo-legal/un_m49      "716",
   :rdf/type               [:dpvo/Country :owl/NamedIndividual :dpvo/Location],
   :rdfs/isDefinedBy       {:rdfa/uri
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             #xsd/langString "Zimbabwe@en",
   :skos/altLabel          ["ZW" "ZWE" "716"],
   :vs/term_status         #xsd/langString "accepted@en"})

(def iso_alpha2
  "The ISO-Alpha2 code for a given region"
  {:db/ident            :dpvo-legal/iso_alpha2,
   :dcterms/created     #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #xsd/langString
                         "The ISO-Alpha2 code for a given region@en",
   :dcterms/source      {:rdfa/uri
                         "https://www.iso.org/iso-3166-country-codes.html"},
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :dpvo/Location,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label          #xsd/langString "ISO-alpha2@en",
   :rdfs/range          :xsd/string,
   :rdfs/subPropertyOf  :skos/altLabel,
   :vs/term_status      #xsd/langString "accepted@en"})

(def iso_alpha3
  "The ISO-Alpha3 code for a given region"
  {:db/ident            :dpvo-legal/iso_alpha3,
   :dcterms/created     #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #xsd/langString
                         "The ISO-Alpha3 code for a given region@en",
   :dcterms/source      {:rdfa/uri
                         "https://www.iso.org/iso-3166-country-codes.html"},
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :dpvo/Location,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label          #xsd/langString "ISO-alpha3@en",
   :rdfs/range          :xsd/string,
   :rdfs/subPropertyOf  :skos/altLabel,
   :vs/term_status      #xsd/langString "accepted@en"})

(def iso_numeric
  "The ISO-Numeric code for a given region"
  {:db/ident            :dpvo-legal/iso_numeric,
   :dcterms/created     #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #xsd/langString
                         "The ISO-Numeric code for a given region@en",
   :dcterms/source      {:rdfa/uri
                         "https://www.iso.org/iso-3166-country-codes.html"},
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :dpvo/Location,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label          #xsd/langString "ISO-numeric@en",
   :rdfs/range          :xsd/string,
   :rdfs/subPropertyOf  :skos/altLabel,
   :vs/term_status      #xsd/langString "accepted@en"})

(def un_m49
  "The UN-M49 code for a given region"
  {:db/ident            :dpvo-legal/un_m49,
   :dcterms/created     #xsd/date #inst "2022-03-30T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #xsd/langString "The UN-M49 code for a given region@en",
   :dcterms/source      {:rdfa/uri
                         "https://unstats.un.org/unsd/methodology/m49"},
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :dpvo/Location,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label          #xsd/langString "UN-M49@en",
   :rdfs/range          :xsd/string,
   :rdfs/subPropertyOf  :skos/altLabel,
   :vs/term_status      #xsd/langString "accepted@en"})