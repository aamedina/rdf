(ns net.wikipunk.rdf.dpvo-legal
  ^{:base       "https://w3id.org/dpv/dpv-owl/dpv-legal#",
    :namespaces {"dcterms"    "http://purl.org/dc/terms/",
                 "dpvo"       "https://w3id.org/dpv/dpv-owl#",
                 "dpvo-gdpr"  "https://w3id.org/dpv/dpv-owl/dpv-gdpr#",
                 "dpvo-legal" "https://w3id.org/dpv/dpv-owl/dpv-legal#",
                 "foaf"       "http://xmlns.com/foaf/0.1/",
                 "owl"        "http://www.w3.org/2002/07/owl#",
                 "rdf"        "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs"       "http://www.w3.org/2000/01/rdf-schema#",
                 "skos"       "http://www.w3.org/2004/02/skos/core#",
                 "time"       "http://www.w3.org/2006/time#",
                 "vann"       "http://purl.org/vocab/vann/",
                 "vs"         "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                 "xsd"        "http://www.w3.org/2001/XMLSchema#"},
    :prefix     "dpvo-legal",
    :source     "net/wikipunk/ext/dpv-owl/dpv-legal/dpv-legal.ttl"}
  {:dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "DPV-LEGAL is an extension to the Data Privacy Vocabulary that provides additional terms related to Jurisdictions, Laws, and Authorities."},
   :dcterms/contributor #{"Harshvardhan J. Pandit" "Julian Flake"},
   :dcterms/created #inst "2022-04-02T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "DPV-PD is an extension to the Data Privacy Vocabulary that provides additional terms related to Jurisdictions, Laws, and Authorities."},
   :dcterms/license {:xsd/anyURI
                     "https://www.w3.org/Consortium/Legal/2015/doc-license"},
   :dcterms/modified #inst "2022-10-06T00:00:00.000-00:00",
   :dcterms/source {:xsd/anyURI "https://www.w3.org/community/dpvcg/"},
   :dcterms/title
   {:rdf/language "en",
    :rdf/value
    "DPV-LEGAL: Extension providing Jurisdictions, Laws, and Authorities for DPV"},
   :owl/imports {:xsd/anyURI "https://w3id.org/dpv/dpv-owl"},
   :owl/versionInfo "0.8.2",
   :rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "dpvo-legal",
   :vann/preferredNamespaceUri "https://w3id.org/dpv/dpv-owl/dpv-legal#",
   :xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal"})

(def AD
  {:db/ident              :dpvo-legal/AD,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Europe :dpvo-legal/SouthernEurope},
   :dpvo-legal/iso_alpha2 "AD",
   :dpvo-legal/iso_alpha3 "AND",
   :dpvo-legal/iso_numeric "20",
   :dpvo-legal/un_m49     "20",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Andorra"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def AE
  {:db/ident              :dpvo-legal/AE,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/WesternAsia},
   :dpvo-legal/iso_alpha2 "AE",
   :dpvo-legal/iso_alpha3 "ARE",
   :dpvo-legal/iso_numeric "784",
   :dpvo-legal/un_m49     "784",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "United Arab Emirates"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def AF
  {:db/ident              :dpvo-legal/AF,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/SouthernAsia :dpvo-legal/Asia},
   :dpvo-legal/iso_alpha2 "AF",
   :dpvo-legal/iso_alpha3 "AFG",
   :dpvo-legal/iso_numeric "4",
   :dpvo-legal/un_m49     "4",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Afghanistan"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def AG
  {:db/ident              :dpvo-legal/AG,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "AG",
   :dpvo-legal/iso_alpha3 "ATG",
   :dpvo-legal/iso_numeric "28",
   :dpvo-legal/un_m49     "28",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Antigua and Barbuda"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def AI
  {:db/ident              :dpvo-legal/AI,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "AI",
   :dpvo-legal/iso_alpha3 "AIA",
   :dpvo-legal/iso_numeric "660",
   :dpvo-legal/un_m49     "660",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Anguilla"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def AL
  {:db/ident              :dpvo-legal/AL,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Europe :dpvo-legal/SouthernEurope},
   :dpvo-legal/iso_alpha2 "AL",
   :dpvo-legal/iso_alpha3 "ALB",
   :dpvo-legal/iso_numeric "8",
   :dpvo-legal/un_m49     "8",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Albania"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def AM
  {:db/ident              :dpvo-legal/AM,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/WesternAsia},
   :dpvo-legal/iso_alpha2 "AM",
   :dpvo-legal/iso_alpha3 "ARM",
   :dpvo-legal/iso_numeric "51",
   :dpvo-legal/un_m49     "51",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Armenia"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def AO
  {:db/ident              :dpvo-legal/AO,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/MiddleAfrica
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "AO",
   :dpvo-legal/iso_alpha3 "AGO",
   :dpvo-legal/iso_numeric "24",
   :dpvo-legal/un_m49     "24",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Angola"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def AQ
  {:db/ident              :dpvo-legal/AQ,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo-legal/iso_alpha2 "AQ",
   :dpvo-legal/iso_alpha3 "ATA",
   :dpvo-legal/iso_numeric "10",
   :dpvo-legal/un_m49     "10",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Antarctica"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def AR
  {:db/ident              :dpvo-legal/AR,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/SouthAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "AR",
   :dpvo-legal/iso_alpha3 "ARG",
   :dpvo-legal/iso_numeric "32",
   :dpvo-legal/un_m49     "32",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Argentina"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def AS
  {:db/ident              :dpvo-legal/AS,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Polynesia :dpvo-legal/Oceania},
   :dpvo-legal/iso_alpha2 "AS",
   :dpvo-legal/iso_alpha3 "ASM",
   :dpvo-legal/iso_numeric "16",
   :dpvo-legal/un_m49     "16",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "American Samoa"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def AT
  {:db/ident               :dpvo-legal/AT,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/WesternEurope :dpvo-legal/Europe},
   :dpvo-legal/iso_alpha2  "AT",
   :dpvo-legal/iso_alpha3  "AUT",
   :dpvo-legal/iso_numeric "40",
   :dpvo-legal/un_m49      "40",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-AT,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Austria"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def AU
  {:db/ident              :dpvo-legal/AU,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Oceania
                            :dpvo-legal/AustraliaandNewZealand},
   :dpvo-legal/iso_alpha2 "AU",
   :dpvo-legal/iso_alpha3 "AUS",
   :dpvo-legal/iso_numeric "36",
   :dpvo-legal/un_m49     "36",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Australia"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def AW
  {:db/ident              :dpvo-legal/AW,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "AW",
   :dpvo-legal/iso_alpha3 "ABW",
   :dpvo-legal/iso_numeric "533",
   :dpvo-legal/un_m49     "533",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Aruba"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def AX
  {:db/ident              :dpvo-legal/AX,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Europe :dpvo-legal/NorthernEurope},
   :dpvo-legal/iso_alpha2 "AX",
   :dpvo-legal/iso_alpha3 "ALA",
   :dpvo-legal/iso_numeric "248",
   :dpvo-legal/un_m49     "248",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Åland Islands"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def AZ
  {:db/ident              :dpvo-legal/AZ,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/WesternAsia},
   :dpvo-legal/iso_alpha2 "AZ",
   :dpvo-legal/iso_alpha3 "AZE",
   :dpvo-legal/iso_numeric "31",
   :dpvo-legal/un_m49     "31",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Azerbaijan"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def Adequacy-EU-AD
  {:db/ident :dpvo-legal/Adequacy-EU-AD,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #inst "2010-10-21T00:00:00.000-00:00"}},
   :dpvo/hasJurisdiction #{:dpvo-legal/EU :dpvo-legal/AD},
   :foaf/homepage
   {:xsd/anyURI
    "https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32010D0625?"},
   :rdf/type #{:dpvo-gdpr/A45-3 :owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EU Adequacy Decision for Andorra"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Adequacy-EU-AR
  {:db/ident :dpvo-legal/Adequacy-EU-AR,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #inst "2003-07-05T00:00:00.000-00:00"}},
   :dpvo/hasJurisdiction #{:dpvo-legal/EU :dpvo-legal/AR},
   :foaf/homepage
   {:xsd/anyURI
    "https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32003D0490"},
   :rdf/type #{:dpvo-gdpr/A45-3 :owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EU Adequacy Decision for Argentina"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Adequacy-EU-CA
  {:db/ident :dpvo-legal/Adequacy-EU-CA,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #inst "2002-01-04T00:00:00.000-00:00"}},
   :dpvo/hasJurisdiction #{:dpvo-legal/EU :dpvo-legal/CA},
   :foaf/homepage
   {:xsd/anyURI
    "https://eur-lex.europa.eu/legal-content/en/TXT/?uri=CELEX%3A32002D0002"},
   :rdf/type #{:dpvo-gdpr/A45-3 :owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "EU Adequacy Decision for Canada (commercial organisations)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Adequacy-EU-CH
  {:db/ident :dpvo-legal/Adequacy-EU-CH,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #inst "2000-08-25T00:00:00.000-00:00"}},
   :dpvo/hasJurisdiction #{:dpvo-legal/CH :dpvo-legal/EU},
   :foaf/homepage
   {:xsd/anyURI
    "https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32000D0518"},
   :rdf/type #{:dpvo-gdpr/A45-3 :owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EU Adequacy Decision for Switzerland"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Adequacy-EU-FO
  {:db/ident :dpvo-legal/Adequacy-EU-FO,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #inst "2010-03-09T00:00:00.000-00:00"}},
   :dpvo/hasJurisdiction #{:dpvo-legal/FO :dpvo-legal/EU},
   :foaf/homepage
   {:xsd/anyURI
    "https://eur-lex.europa.eu/legal-content/en/ALL/?uri=CELEX%3A32010D0146"},
   :rdf/type #{:dpvo-gdpr/A45-3 :owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EU Adequacy Decision for Faroe Islands"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Adequacy-EU-GB
  {:db/ident :dpvo-legal/Adequacy-EU-GB,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #inst "2021-06-28T00:00:00.000-00:00"}},
   :dpvo/hasJurisdiction #{:dpvo-legal/EU :dpvo-legal/GB},
   :foaf/homepage
   {:xsd/anyURI
    "https://ec.europa.eu/info/files/decision-adequate-protection-personal-data-united-kingdom-general-data-protection-regulation_en"},
   :rdf/type #{:dpvo-gdpr/A45-3 :owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EU Adequacy Decision for United Kingdom"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Adequacy-EU-GG
  {:db/ident :dpvo-legal/Adequacy-EU-GG,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #inst "2003-11-21T00:00:00.000-00:00"}},
   :dpvo/hasJurisdiction #{:dpvo-legal/EU :dpvo-legal/GG},
   :foaf/homepage
   {:xsd/anyURI
    "https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32003D0821"},
   :rdf/type #{:dpvo-gdpr/A45-3 :owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EU Adequacy Decision for Guernsey"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Adequacy-EU-IL
  {:db/ident :dpvo-legal/Adequacy-EU-IL,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #inst "2011-02-01T00:00:00.000-00:00"}},
   :dpvo/hasJurisdiction #{:dpvo-legal/EU :dpvo-legal/IL},
   :foaf/homepage
   {:xsd/anyURI
    "https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32011D0061"},
   :rdf/type #{:dpvo-gdpr/A45-3 :owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EU Adequacy Decision for Israel"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Adequacy-EU-IM
  {:db/ident :dpvo-legal/Adequacy-EU-IM,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #inst "2004-04-30T00:00:00.000-00:00"}},
   :dpvo/hasJurisdiction #{:dpvo-legal/IM :dpvo-legal/EU},
   :foaf/homepage
   {:xsd/anyURI
    "https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32004D0411"},
   :rdf/type #{:dpvo-gdpr/A45-3 :owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EU Adequacy Decision for Isle of Man"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Adequacy-EU-JE
  {:db/ident :dpvo-legal/Adequacy-EU-JE,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #inst "2008-05-26T00:00:00.000-00:00"}},
   :dpvo/hasJurisdiction #{:dpvo-legal/JE :dpvo-legal/EU},
   :foaf/homepage
   {:xsd/anyURI
    "https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32008D0393"},
   :rdf/type #{:dpvo-gdpr/A45-3 :owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EU Adequacy Decision for Jersey"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Adequacy-EU-JP
  {:db/ident             :dpvo-legal/Adequacy-EU-JP,
   :dcterms/created      #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator      {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/temporal     {:rdf/type :time/ProperInterval,
                          :time/hasBeginning
                          {:time/inXSDDate #inst
                                            "2019-01-23T00:00:00.000-00:00"}},
   :dpvo/hasJurisdiction #{:dpvo-legal/JP :dpvo-legal/EU},
   :foaf/homepage        {:xsd/anyURI
                          "http://data.europa.eu/eli/dec_impl/2019/419/oj"},
   :rdf/type             #{:dpvo-gdpr/A45-3 :owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy     {:xsd/anyURI
                          "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           {:rdf/language "en",
                          :rdf/value    "EU Adequacy Decision for Japan"},
   :vs/term_status       {:rdf/language "en",
                          :rdf/value    "accepted"}})

(def Adequacy-EU-NZ
  {:db/ident :dpvo-legal/Adequacy-EU-NZ,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #inst "2012-12-20T00:00:00.000-00:00"}},
   :dpvo/hasJurisdiction #{:dpvo-legal/NZ :dpvo-legal/EU},
   :foaf/homepage
   {:xsd/anyURI
    "https://eur-lex.europa.eu/legal-content/EN/ALL/?uri=CELEX%3A32013D0065"},
   :rdf/type #{:dpvo-gdpr/A45-3 :owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EU Adequacy Decision for New Zealand"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Adequacy-EU-UY
  {:db/ident :dpvo-legal/Adequacy-EU-UY,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #inst "2012-08-22T00:00:00.000-00:00"}},
   :dpvo/hasJurisdiction #{:dpvo-legal/UY :dpvo-legal/EU},
   :foaf/homepage
   {:xsd/anyURI
    "https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32012D0484"},
   :rdf/type #{:dpvo-gdpr/A45-3 :owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "EU Adequacy Decision for Uruguay"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Africa
  {:db/ident         :dpvo-legal/Africa,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/BI :dpvo-legal/CF :dpvo-legal/DJ
                       :dpvo-legal/LS :dpvo-legal/KE :dpvo-legal/TZ
                       :dpvo-legal/CM :dpvo-legal/SN :dpvo-legal/CI
                       :dpvo-legal/ZM :dpvo-legal/GW :dpvo-legal/KM
                       :dpvo-legal/BF :dpvo-legal/ER :dpvo-legal/NG
                       :dpvo-legal/MZ :dpvo-legal/BW :dpvo-legal/GM
                       :dpvo-legal/RW :dpvo-legal/RE :dpvo-legal/ZA
                       :dpvo-legal/CG :dpvo-legal/GH :dpvo-legal/SS
                       :dpvo-legal/TD :dpvo-legal/SL :dpvo-legal/TN
                       :dpvo-legal/MG :dpvo-legal/GQ :dpvo-legal/ET
                       :dpvo-legal/LR :dpvo-legal/DZ :dpvo-legal/ML
                       :dpvo-legal/MW :dpvo-legal/EG :dpvo-legal/AO
                       :dpvo-legal/MR :dpvo-legal/NE :dpvo-legal/GN
                       :dpvo-legal/NA :dpvo-legal/YT :dpvo-legal/CD
                       :dpvo-legal/GA :dpvo-legal/TG :dpvo-legal/IO
                       :dpvo-legal/SH :dpvo-legal/EH :dpvo-legal/SZ
                       :dpvo-legal/BJ :dpvo-legal/ST :dpvo-legal/SC
                       :dpvo-legal/UG :dpvo-legal/SubSaharanAfrica
                       :dpvo-legal/CV :dpvo-legal/TF :dpvo-legal/SD
                       :dpvo-legal/ZW :dpvo-legal/LY :dpvo-legal/NorthernAfrica
                       :dpvo-legal/MA :dpvo-legal/SO :dpvo-legal/MU},
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Africa"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def Americas
  {:db/ident         :dpvo-legal/Americas,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/SV :dpvo-legal/JM :dpvo-legal/GD
                       :dpvo-legal/BR :dpvo-legal/US :dpvo-legal/DM
                       :dpvo-legal/BB :dpvo-legal/UY :dpvo-legal/FK
                       :dpvo-legal/AG :dpvo-legal/GS :dpvo-legal/AW
                       :dpvo-legal/KY :dpvo-legal/MQ :dpvo-legal/LC
                       :dpvo-legal/GF :dpvo-legal/VI :dpvo-legal/BS
                       :dpvo-legal/SX :dpvo-legal/GL :dpvo-legal/TT
                       :dpvo-legal/MS :dpvo-legal/PA :dpvo-legal/BV
                       :dpvo-legal/GY :dpvo-legal/CW :dpvo-legal/GP
                       :dpvo-legal/VE :dpvo-legal/PR :dpvo-legal/BM
                       :dpvo-legal/CL :dpvo-legal/NI :dpvo-legal/BQ
                       :dpvo-legal/BZ :dpvo-legal/AR :dpvo-legal/GT
                       :dpvo-legal/CO :dpvo-legal/DO :dpvo-legal/TC
                       :dpvo-legal/PY :dpvo-legal/HN :dpvo-legal/PE
                       :dpvo-legal/EC :dpvo-legal/LatinAmericaandtheCaribbean
                       :dpvo-legal/CA :dpvo-legal/CU :dpvo-legal/HT
                       :dpvo-legal/MF :dpvo-legal/CR :dpvo-legal/AI
                       :dpvo-legal/BL :dpvo-legal/PM :dpvo-legal/VC
                       :dpvo-legal/SR :dpvo-legal/BO :dpvo-legal/KN
                       :dpvo-legal/MX :dpvo-legal/VG
                       :dpvo-legal/NorthernAmerica},
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Americas"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def Asia
  {:db/ident         :dpvo-legal/Asia,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/MO :dpvo-legal/CN :dpvo-legal/TH
                       :dpvo-legal/HK :dpvo-legal/JP :dpvo-legal/BT
                       :dpvo-legal/TM :dpvo-legal/GE :dpvo-legal/AZ
                       :dpvo-legal/TR :dpvo-legal/TJ :dpvo-legal/KP
                       :dpvo-legal/KZ :dpvo-legal/SY :dpvo-legal/AE
                       :dpvo-legal/KR :dpvo-legal/NP :dpvo-legal/YE
                       :dpvo-legal/MM :dpvo-legal/AM :dpvo-legal/SA
                       :dpvo-legal/ID :dpvo-legal/TL :dpvo-legal/KG
                       :dpvo-legal/PH :dpvo-legal/SouthernAsia :dpvo-legal/BD
                       :dpvo-legal/MY :dpvo-legal/CentralAsia :dpvo-legal/IQ
                       :dpvo-legal/KW :dpvo-legal/SG :dpvo-legal/QA
                       :dpvo-legal/IL :dpvo-legal/SoutheasternAsia
                       :dpvo-legal/LK :dpvo-legal/IR :dpvo-legal/PS
                       :dpvo-legal/CY :dpvo-legal/LA :dpvo-legal/IN
                       :dpvo-legal/UZ :dpvo-legal/JO :dpvo-legal/AF
                       :dpvo-legal/EasternAsia :dpvo-legal/PK :dpvo-legal/BH
                       :dpvo-legal/BN :dpvo-legal/MV :dpvo-legal/MN
                       :dpvo-legal/WesternAsia :dpvo-legal/OM :dpvo-legal/LB
                       :dpvo-legal/VN :dpvo-legal/KH},
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Asia"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def AustraliaandNewZealand
  {:db/ident         :dpvo-legal/AustraliaandNewZealand,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/NZ :dpvo-legal/NF :dpvo-legal/AU
                       :dpvo-legal/CC :dpvo-legal/HM :dpvo-legal/CX},
   :dcterms/isPartOf :dpvo-legal/Oceania,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "AustraliaandNewZealand"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def BA
  {:db/ident              :dpvo-legal/BA,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Europe :dpvo-legal/SouthernEurope},
   :dpvo-legal/iso_alpha2 "BA",
   :dpvo-legal/iso_alpha3 "BIH",
   :dpvo-legal/iso_numeric "70",
   :dpvo-legal/un_m49     "70",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Bosnia and Herzegovina"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def BB
  {:db/ident              :dpvo-legal/BB,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "BB",
   :dpvo-legal/iso_alpha3 "BRB",
   :dpvo-legal/iso_numeric "52",
   :dpvo-legal/un_m49     "52",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Barbados"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def BD
  {:db/ident              :dpvo-legal/BD,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/SouthernAsia :dpvo-legal/Asia},
   :dpvo-legal/iso_alpha2 "BD",
   :dpvo-legal/iso_alpha3 "BGD",
   :dpvo-legal/iso_numeric "50",
   :dpvo-legal/un_m49     "50",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Bangladesh"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def BE
  {:db/ident               :dpvo-legal/BE,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/WesternEurope :dpvo-legal/Europe},
   :dpvo-legal/iso_alpha2  "BE",
   :dpvo-legal/iso_alpha3  "BEL",
   :dpvo-legal/iso_numeric "56",
   :dpvo-legal/un_m49      "56",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-BE,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Belgium"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def BF
  {:db/ident              :dpvo-legal/BF,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/WesternAfrica :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "BF",
   :dpvo-legal/iso_alpha3 "BFA",
   :dpvo-legal/iso_numeric "854",
   :dpvo-legal/un_m49     "854",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Burkina Faso"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def BG
  {:db/ident               :dpvo-legal/BG,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/EasternEurope :dpvo-legal/Europe},
   :dpvo-legal/iso_alpha2  "BG",
   :dpvo-legal/iso_alpha3  "BGR",
   :dpvo-legal/iso_numeric "100",
   :dpvo-legal/un_m49      "100",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-BG,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Bulgaria"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def BH
  {:db/ident              :dpvo-legal/BH,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/WesternAsia},
   :dpvo-legal/iso_alpha2 "BH",
   :dpvo-legal/iso_alpha3 "BHR",
   :dpvo-legal/iso_numeric "48",
   :dpvo-legal/un_m49     "48",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Bahrain"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def BI
  {:db/ident              :dpvo-legal/BI,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica},
   :dpvo-legal/iso_alpha2 "BI",
   :dpvo-legal/iso_alpha3 "BDI",
   :dpvo-legal/iso_numeric "108",
   :dpvo-legal/un_m49     "108",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Burundi"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def BJ
  {:db/ident              :dpvo-legal/BJ,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/WesternAfrica :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "BJ",
   :dpvo-legal/iso_alpha3 "BEN",
   :dpvo-legal/iso_numeric "204",
   :dpvo-legal/un_m49     "204",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Benin"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def BL
  {:db/ident              :dpvo-legal/BL,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "BL",
   :dpvo-legal/iso_alpha3 "BLM",
   :dpvo-legal/iso_numeric "652",
   :dpvo-legal/un_m49     "652",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Saint Barthélemy"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def BM
  {:db/ident              :dpvo-legal/BM,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Americas :dpvo-legal/NorthernAmerica},
   :dpvo-legal/iso_alpha2 "BM",
   :dpvo-legal/iso_alpha3 "BMU",
   :dpvo-legal/iso_numeric "60",
   :dpvo-legal/un_m49     "60",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Bermuda"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def BN
  {:db/ident              :dpvo-legal/BN,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/SoutheasternAsia},
   :dpvo-legal/iso_alpha2 "BN",
   :dpvo-legal/iso_alpha3 "BRN",
   :dpvo-legal/iso_numeric "96",
   :dpvo-legal/un_m49     "96",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Brunei Darussalam"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def BO
  {:db/ident              :dpvo-legal/BO,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/SouthAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "BO",
   :dpvo-legal/iso_alpha3 "BOL",
   :dpvo-legal/iso_numeric "68",
   :dpvo-legal/un_m49     "68",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Bolivia (Plurinational State of)"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def BQ
  {:db/ident              :dpvo-legal/BQ,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "BQ",
   :dpvo-legal/iso_alpha3 "BES",
   :dpvo-legal/iso_numeric "535",
   :dpvo-legal/un_m49     "535",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Bonaire, Sint Eustatius and Saba"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def BR
  {:db/ident              :dpvo-legal/BR,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/SouthAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "BR",
   :dpvo-legal/iso_alpha3 "BRA",
   :dpvo-legal/iso_numeric "76",
   :dpvo-legal/un_m49     "76",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Brazil"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def BS
  {:db/ident              :dpvo-legal/BS,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "BS",
   :dpvo-legal/iso_alpha3 "BHS",
   :dpvo-legal/iso_numeric "44",
   :dpvo-legal/un_m49     "44",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Bahamas"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def BT
  {:db/ident              :dpvo-legal/BT,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/SouthernAsia :dpvo-legal/Asia},
   :dpvo-legal/iso_alpha2 "BT",
   :dpvo-legal/iso_alpha3 "BTN",
   :dpvo-legal/iso_numeric "64",
   :dpvo-legal/un_m49     "64",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Bhutan"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def BV
  {:db/ident              :dpvo-legal/BV,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/SouthAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "BV",
   :dpvo-legal/iso_alpha3 "BVT",
   :dpvo-legal/iso_numeric "74",
   :dpvo-legal/un_m49     "74",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Bouvet Island"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def BW
  {:db/ident              :dpvo-legal/BW,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SouthernAfrica
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "BW",
   :dpvo-legal/iso_alpha3 "BWA",
   :dpvo-legal/iso_numeric "72",
   :dpvo-legal/un_m49     "72",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Botswana"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def BY
  {:db/ident              :dpvo-legal/BY,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/EasternEurope :dpvo-legal/Europe},
   :dpvo-legal/iso_alpha2 "BY",
   :dpvo-legal/iso_alpha3 "BLR",
   :dpvo-legal/iso_numeric "112",
   :dpvo-legal/un_m49     "112",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Belarus"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def BZ
  {:db/ident              :dpvo-legal/BZ,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/CentralAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "BZ",
   :dpvo-legal/iso_alpha3 "BLZ",
   :dpvo-legal/iso_numeric "84",
   :dpvo-legal/un_m49     "84",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Belize"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def CA
  {:db/ident              :dpvo-legal/CA,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Americas :dpvo-legal/NorthernAmerica},
   :dpvo-legal/iso_alpha2 "CA",
   :dpvo-legal/iso_alpha3 "CAN",
   :dpvo-legal/iso_numeric "124",
   :dpvo-legal/un_m49     "124",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Canada"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def CC
  {:db/ident              :dpvo-legal/CC,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Oceania
                            :dpvo-legal/AustraliaandNewZealand},
   :dpvo-legal/iso_alpha2 "CC",
   :dpvo-legal/iso_alpha3 "CCK",
   :dpvo-legal/iso_numeric "166",
   :dpvo-legal/un_m49     "166",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Cocos (Keeling) Islands"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def CD
  {:db/ident              :dpvo-legal/CD,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/MiddleAfrica
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "CD",
   :dpvo-legal/iso_alpha3 "COD",
   :dpvo-legal/iso_numeric "180",
   :dpvo-legal/un_m49     "180",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Democratic Republic of the Congo"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def CF
  {:db/ident              :dpvo-legal/CF,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/MiddleAfrica
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "CF",
   :dpvo-legal/iso_alpha3 "CAF",
   :dpvo-legal/iso_numeric "140",
   :dpvo-legal/un_m49     "140",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Central African Republic"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def CG
  {:db/ident              :dpvo-legal/CG,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/MiddleAfrica
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "CG",
   :dpvo-legal/iso_alpha3 "COG",
   :dpvo-legal/iso_numeric "178",
   :dpvo-legal/un_m49     "178",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Congo"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def CH
  {:db/ident              :dpvo-legal/CH,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/WesternEurope :dpvo-legal/Europe},
   :dpvo-legal/iso_alpha2 "CH",
   :dpvo-legal/iso_alpha3 "CHE",
   :dpvo-legal/iso_numeric "756",
   :dpvo-legal/un_m49     "756",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Switzerland"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def CI
  {:db/ident              :dpvo-legal/CI,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/WesternAfrica :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "CI",
   :dpvo-legal/iso_alpha3 "CIV",
   :dpvo-legal/iso_numeric "384",
   :dpvo-legal/un_m49     "384",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Côte d’Ivoire"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def CK
  {:db/ident              :dpvo-legal/CK,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Polynesia :dpvo-legal/Oceania},
   :dpvo-legal/iso_alpha2 "CK",
   :dpvo-legal/iso_alpha3 "COK",
   :dpvo-legal/iso_numeric "184",
   :dpvo-legal/un_m49     "184",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Cook Islands"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def CL
  {:db/ident              :dpvo-legal/CL,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/SouthAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "CL",
   :dpvo-legal/iso_alpha3 "CHL",
   :dpvo-legal/iso_numeric "152",
   :dpvo-legal/un_m49     "152",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Chile"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def CM
  {:db/ident              :dpvo-legal/CM,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/MiddleAfrica
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "CM",
   :dpvo-legal/iso_alpha3 "CMR",
   :dpvo-legal/iso_numeric "120",
   :dpvo-legal/un_m49     "120",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Cameroon"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def CN
  {:db/ident              :dpvo-legal/CN,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/EasternAsia},
   :dpvo-legal/iso_alpha2 "CN",
   :dpvo-legal/iso_alpha3 "CHN",
   :dpvo-legal/iso_numeric "156",
   :dpvo-legal/un_m49     "156",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "China"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def CO
  {:db/ident              :dpvo-legal/CO,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/SouthAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "CO",
   :dpvo-legal/iso_alpha3 "COL",
   :dpvo-legal/iso_numeric "170",
   :dpvo-legal/un_m49     "170",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Colombia"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def CR
  {:db/ident              :dpvo-legal/CR,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/CentralAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "CR",
   :dpvo-legal/iso_alpha3 "CRI",
   :dpvo-legal/iso_numeric "188",
   :dpvo-legal/un_m49     "188",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Costa Rica"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def CU
  {:db/ident              :dpvo-legal/CU,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "CU",
   :dpvo-legal/iso_alpha3 "CUB",
   :dpvo-legal/iso_numeric "192",
   :dpvo-legal/un_m49     "192",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Cuba"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def CV
  {:db/ident              :dpvo-legal/CV,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/WesternAfrica :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "CV",
   :dpvo-legal/iso_alpha3 "CPV",
   :dpvo-legal/iso_numeric "132",
   :dpvo-legal/un_m49     "132",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Cabo Verde"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def CW
  {:db/ident              :dpvo-legal/CW,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "CW",
   :dpvo-legal/iso_alpha3 "CUW",
   :dpvo-legal/iso_numeric "531",
   :dpvo-legal/un_m49     "531",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Curaçao"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def CX
  {:db/ident              :dpvo-legal/CX,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Oceania
                            :dpvo-legal/AustraliaandNewZealand},
   :dpvo-legal/iso_alpha2 "CX",
   :dpvo-legal/iso_alpha3 "CXR",
   :dpvo-legal/iso_numeric "162",
   :dpvo-legal/un_m49     "162",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Christmas Island"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def CY
  {:db/ident               :dpvo-legal/CY,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/Asia :dpvo-legal/WesternAsia},
   :dpvo-legal/iso_alpha2  "CY",
   :dpvo-legal/iso_alpha3  "CYP",
   :dpvo-legal/iso_numeric "196",
   :dpvo-legal/un_m49      "196",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-CY,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Cyprus"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def CZ
  {:db/ident               :dpvo-legal/CZ,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/EasternEurope :dpvo-legal/Europe},
   :dpvo-legal/iso_alpha2  "CZ",
   :dpvo-legal/iso_alpha3  "CZE",
   :dpvo-legal/iso_numeric "203",
   :dpvo-legal/un_m49      "203",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-CZ,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Czechia"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def Caribbean
  {:db/ident         :dpvo-legal/Caribbean,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/JM :dpvo-legal/GD :dpvo-legal/DM
                       :dpvo-legal/BB :dpvo-legal/AG :dpvo-legal/AW
                       :dpvo-legal/KY :dpvo-legal/MQ :dpvo-legal/LC
                       :dpvo-legal/VI :dpvo-legal/BS :dpvo-legal/SX
                       :dpvo-legal/TT :dpvo-legal/MS :dpvo-legal/CW
                       :dpvo-legal/GP :dpvo-legal/PR :dpvo-legal/BQ
                       :dpvo-legal/DO :dpvo-legal/TC :dpvo-legal/CU
                       :dpvo-legal/HT :dpvo-legal/MF :dpvo-legal/AI
                       :dpvo-legal/BL :dpvo-legal/VC :dpvo-legal/KN
                       :dpvo-legal/VG},
   :dcterms/isPartOf :dpvo-legal/LatinAmericaandtheCaribbean,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Caribbean"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def CentralAmerica
  {:db/ident         :dpvo-legal/CentralAmerica,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/SV :dpvo-legal/PA :dpvo-legal/NI
                       :dpvo-legal/BZ :dpvo-legal/GT :dpvo-legal/HN
                       :dpvo-legal/CR :dpvo-legal/MX},
   :dcterms/isPartOf :dpvo-legal/LatinAmericaandtheCaribbean,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "CentralAmerica"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def CentralAsia
  {:db/ident         :dpvo-legal/CentralAsia,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/TM :dpvo-legal/TJ :dpvo-legal/KZ
                       :dpvo-legal/KG :dpvo-legal/UZ},
   :dcterms/isPartOf :dpvo-legal/Asia,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "CentralAsia"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def ChannelIslands
  {:db/ident         :dpvo-legal/ChannelIslands,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/JE :dpvo-legal/Sark :dpvo-legal/GG},
   :dcterms/isPartOf :dpvo-legal/NorthernEurope,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "ChannelIslands"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def DE
  {:db/ident               :dpvo-legal/DE,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/DE-HE :dpvo-legal/DE-BY
                             :dpvo-legal/DE-SH :dpvo-legal/DE-BB
                             :dpvo-legal/DE-TH :dpvo-legal/DE-NI
                             :dpvo-legal/DE-HB :dpvo-legal/EU27
                             :dpvo-legal/DE-BW :dpvo-legal/EU :dpvo-legal/DE-SN
                             :dpvo-legal/DE-HH :dpvo-legal/EEA31
                             :dpvo-legal/EEA30 :dpvo-legal/DE-MV
                             :dpvo-legal/DE-RP :dpvo-legal/DE-SL
                             :dpvo-legal/DE-BE :dpvo-legal/DE-ST
                             :dpvo-legal/DE-NW :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/WesternEurope :dpvo-legal/Europe},
   :dpvo-legal/iso_alpha2  "DE",
   :dpvo-legal/iso_alpha3  "DEU",
   :dpvo-legal/iso_numeric "276",
   :dpvo-legal/un_m49      "276",
   :dpvo/hasApplicableLaw  #{:dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG},
   :dpvo/hasAuthority      :dpvo-legal/DPA-DE,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Germany"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def DE-BB
  {:db/ident              :dpvo-legal/DE-BB,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      :dpvo-legal/DE,
   :dpvo/hasApplicableLaw #{:dpvo-legal/DE-BE-BbgDSG :dpvo-legal/EU-GDPR
                            :dpvo-legal/DE-BDSG},
   :dpvo/hasAuthority     :dpvo-legal/DPA-DE-BB,
   :rdf/type              #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Brandenburg"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DE-BDSG
  {:db/ident             :dpvo-legal/DE-BDSG,
   :dcterms/created      #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator      #{{:rdf/value "Harshvardhan J. Pandit"}
                           {:rdf/value "Julian Flake"}},
   :dcterms/temporal     {:rdf/type :time/ProperInterval,
                          :time/hasBeginning
                          {:time/inXSDDate #inst
                                            "2019-11-20T00:00:00.000-00:00"}},
   :dpvo/hasAuthority    #{:dpvo-legal/DPA-DE-SL :dpvo-legal/DPA-DE
                           :dpvo-legal/DPA-DE-TH :dpvo-legal/DPA-DE-BB
                           :dpvo-legal/DPA-DE-NI :dpvo-legal/DPA-DE-BY-public
                           :dpvo-legal/DPA-DE-SH :dpvo-legal/DPA-DE-HH
                           :dpvo-legal/DPA-DE-ST :dpvo-legal/DPA-DE-RP
                           :dpvo-legal/DPA-DE-MV :dpvo-legal/DPA-DE-HB
                           :dpvo-legal/DPA-DE-HE :dpvo-legal/DPA-DE-SN
                           :dpvo-legal/DPA-DE-BE :dpvo-legal/DPA-DE-NW
                           :dpvo-legal/DPA-DE-BY-non-public},
   :dpvo/hasJurisdiction #{:dpvo-legal/DE-HE :dpvo-legal/DE-BY :dpvo-legal/DE-SH
                           :dpvo-legal/DE-BB :dpvo-legal/DE-TH :dpvo-legal/DE-NI
                           :dpvo-legal/DE-HB :dpvo-legal/DE-BW :dpvo-legal/DE-SN
                           :dpvo-legal/DE :dpvo-legal/DE-HH :dpvo-legal/DE-MV
                           :dpvo-legal/DE-RP :dpvo-legal/DE-SL :dpvo-legal/DE-BE
                           :dpvo-legal/DE-ST :dpvo-legal/DE-NW},
   :foaf/homepage        {:xsd/anyURI
                          "https://www.gesetze-im-internet.de/bdsg_2018/"},
   :rdf/type             #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy     {:xsd/anyURI
                          "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           #{{:rdf/language "de",
                            :rdf/value    "Bundesdatenschutzgesetz (BDSG)"}
                           {:rdf/language "en",
                            :rdf/value "Federal Data Protection Act (BDSG)"}},
   :vs/term_status       {:rdf/language "en",
                          :rdf/value    "accepted"}})

(def DE-BE
  {:db/ident              :dpvo-legal/DE-BE,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      :dpvo-legal/DE,
   :dpvo/hasApplicableLaw #{:dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG
                            :dpvo-legal/DE-BE-BlnDSG},
   :dpvo/hasAuthority     :dpvo-legal/DPA-DE-BE,
   :rdf/type              #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Berlin"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DE-BE-BbgDSG
  {:db/ident :dpvo-legal/DE-BE-BbgDSG,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-BB,
   :dpvo/hasJurisdiction :dpvo-legal/DE-BB,
   :foaf/homepage
   {:xsd/anyURI
    "https://www.lda.brandenburg.de/sixcms/media.php/9/BbgDSG_2019.pdf"},
   :rdf/type #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #{{:rdf/language "de",
                  :rdf/value    "Brandenburgisches Datenschutzgesetz (BbgDSG)"}
                 {:rdf/language "en",
                  :rdf/value    "Brandenburg Data Protection Act (BbgDSG)"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DE-BE-BlnDSG
  {:db/ident :dpvo-legal/DE-BE-BlnDSG,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-BE,
   :dpvo/hasJurisdiction :dpvo-legal/DE-BE,
   :foaf/homepage
   {:xsd/anyURI
    "https://www.datenschutz-berlin.de/fileadmin/user_upload/pdf/publikationen/informationsmaterialien/2018-BlnBDI_BlnDSG.pdf"},
   :rdf/type #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Berlin Data Protection Act (BlnDSG)"}
                 {:rdf/language "de",
                  :rdf/value    "Berliner Datenschutzgesetz (BlnDSG)"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DE-BW
  {:db/ident              :dpvo-legal/DE-BW,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      :dpvo-legal/DE,
   :dpvo/hasApplicableLaw #{:dpvo-legal/DE-BW-LDSG :dpvo-legal/EU-GDPR
                            :dpvo-legal/DE-BDSG},
   :rdf/type              #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Baden-Württemberg"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DE-BW-LDSG
  {:db/ident :dpvo-legal/DE-BW-LDSG,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasJurisdiction :dpvo-legal/DE-BW,
   :foaf/homepage
   {:xsd/anyURI
    "https://www.baden-wuerttemberg.datenschutz.de/wp-content/uploads/2018/06/LDSG-neu-GBl-2018173.pdf"},
   :rdf/type #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #{{:rdf/language "de",
                  :rdf/value    "Landesdatenschutzgesetz (LDSG) (BW)"}
                 {:rdf/language "en",
                  :rdf/value    "State Data Protection Act (LDSG) (BW)"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DE-BY
  {:db/ident              :dpvo-legal/DE-BY,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      :dpvo-legal/DE,
   :dpvo/hasApplicableLaw #{:dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG
                            :dpvo-legal/DE-BY-BayDSG},
   :dpvo/hasAuthority     #{:dpvo-legal/DPA-DE-BY-public
                            :dpvo-legal/DPA-DE-BY-non-public},
   :rdf/type              #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Bavaria"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DE-BY-BayDSG
  {:db/ident :dpvo-legal/DE-BY-BayDSG,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasAuthority #{:dpvo-legal/DPA-DE-BY-public
                        :dpvo-legal/DPA-DE-BY-non-public},
   :dpvo/hasJurisdiction :dpvo-legal/DE-BY,
   :foaf/homepage
   {:xsd/anyURI
    "https://www.datenschutz-bayern.de/datenschutzreform2018/BayDSG.pdf"},
   :rdf/type #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Bavarian Data Protection Act (BayDSG)"}
                 {:rdf/language "de",
                  :rdf/value    "Bayerisches Datenschutzgesetz (BayDSG)"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DE-HB
  {:db/ident              :dpvo-legal/DE-HB,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      :dpvo-legal/DE,
   :dpvo/hasApplicableLaw #{:dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG
                            :dpvo-legal/DE-HB-BremDSGVOAG},
   :dpvo/hasAuthority     :dpvo-legal/DPA-DE-HB,
   :rdf/type              #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Bremen"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DE-HB-BremDSGVOAG
  {:db/ident :dpvo-legal/DE-HB-BremDSGVOAG,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-HB,
   :dpvo/hasJurisdiction :dpvo-legal/DE-HB,
   :foaf/homepage
   {:xsd/anyURI
    "https://www.transparenz.bremen.de/metainformationen/bremisches-ausfuehrungsgesetz-zur-eu-datenschutz-grundverordnung-bremdsgvoag-vom-8-mai-2018-116884?template=20_gp_ifg_meta_detail_d"},
   :rdf/type #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   #{{:rdf/language "en",
      :rdf/value
      "Bremen Implementing Act for the EU General Data Protection Regulation (BremDSGVOAG)"}
     {:rdf/language "de",
      :rdf/value
      "Bremisches Ausführungsgesetz zur EU-Datenschutz-Grundverordnung (BremDSGVOAG)"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DE-HE
  {:db/ident              :dpvo-legal/DE-HE,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      :dpvo-legal/DE,
   :dpvo/hasApplicableLaw #{:dpvo-legal/DE-HE-HDISG :dpvo-legal/EU-GDPR
                            :dpvo-legal/DE-BDSG},
   :dpvo/hasAuthority     :dpvo-legal/DPA-DE-HE,
   :rdf/type              #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Hesse"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DE-HE-HDISG
  {:db/ident :dpvo-legal/DE-HE-HDISG,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-HE,
   :dpvo/hasJurisdiction :dpvo-legal/DE-HE,
   :foaf/homepage
   {:xsd/anyURI
    "https://www.rv.hessenrecht.hessen.de/bshe/document/jlr-DSIFGHErahmen"},
   :rdf/type #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   #{{:rdf/language "de",
      :rdf/value
      "Hessisches Datenschutz- und Informationsfreiheitsgesetz (HDSIG)"}
     {:rdf/language "en",
      :rdf/value
      "Hessian Data Protection and Freedom of Information Act (HDSIG)"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DE-HH
  {:db/ident              :dpvo-legal/DE-HH,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      :dpvo-legal/DE,
   :dpvo/hasApplicableLaw #{:dpvo-legal/DE-HH-HmbDSG :dpvo-legal/EU-GDPR
                            :dpvo-legal/DE-BDSG},
   :dpvo/hasAuthority     :dpvo-legal/DPA-DE-HH,
   :rdf/type              #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Hamburg"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DE-HH-HmbDSG
  {:db/ident :dpvo-legal/DE-HH-HmbDSG,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-HH,
   :dpvo/hasJurisdiction :dpvo-legal/DE-HH,
   :foaf/homepage {:xsd/anyURI
                   "https://datenschutz-hamburg.de/assets/pdf/HmbDSG_neu.pdf"},
   :rdf/type #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Hamburg Data Protection Act (HmbDSG)"}
                 {:rdf/language "de",
                  :rdf/value    "Hamburgisches Datenschutzgesetz (HmbDSG)"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DE-LSA-DSG
  {:db/ident :dpvo-legal/DE-LSA-DSG,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-ST,
   :dpvo/hasJurisdiction :dpvo-legal/DE-ST,
   :foaf/homepage
   {:xsd/anyURI
    "https://www.landtag.sachsen-anhalt.de/fileadmin/Downloads/Rechtsgrundlagen/2018_Datenschutzgesetz-DSG-LSA.pdf"},
   :rdf/type #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   #{{:rdf/language "en",
      :rdf/value
      "Law on the protection of personal data of citizens (Saxony-Anhalt Data Protection Act - DSG LSA)"}
     {:rdf/language "de",
      :rdf/value
      "Gesetz zum Schutz personenbezogener Daten der Bürger (Datenschutzgesetz Sachsen-Anhalt - DSG LSA)"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DE-MV
  {:db/ident              :dpvo-legal/DE-MV,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      :dpvo-legal/DE,
   :dpvo/hasApplicableLaw #{:dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG
                            :dpvo-legal/DE-MV-DSG},
   :dpvo/hasAuthority     :dpvo-legal/DPA-DE-MV,
   :rdf/type              #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Mecklenburg-Western-Pomerania"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DE-MV-DSG
  {:db/ident :dpvo-legal/DE-MV-DSG,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-MV,
   :dpvo/hasJurisdiction :dpvo-legal/DE-MV,
   :foaf/homepage
   {:xsd/anyURI
    "https://www.datenschutz-mv.de/static/DS/Dateien/Rechtsgrundlagen/Landesdatenschutzgesetz.pdf"},
   :rdf/type #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   #{{:rdf/language "en",
      :rdf/value
      "Act to adapt the State Data Protection Act and other data protection regulations in the area of ​​responsibility of the Ministry of the Interior and Europe Mecklenburg-West Pomerania to Regulation (EU) 2016/679 and to implement Directive (EU) 2016/680"}
     {:rdf/language "de",
      :rdf/value
      "Gesetz zur Anpassung des Landesdatenschutzgesetzes und weiterer datenschutzrechtlicher Vorschriften im Zuständigkeitsbereich des Ministeriums für Inneres und Europa Mecklenburg-Vorpommern an die Verordnung (EU) 2016/679 und zur Umsetzung der Richtlinie (EU) 2016/680"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DE-NI
  {:db/ident              :dpvo-legal/DE-NI,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      :dpvo-legal/DE,
   :dpvo/hasApplicableLaw #{:dpvo-legal/DE-NI-NDSG :dpvo-legal/EU-GDPR
                            :dpvo-legal/DE-BDSG},
   :dpvo/hasAuthority     :dpvo-legal/DPA-DE-NI,
   :rdf/type              #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Lower-Saxony"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DE-NI-NDSG
  {:db/ident :dpvo-legal/DE-NI-NDSG,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-NI,
   :dpvo/hasJurisdiction :dpvo-legal/DE-NI,
   :foaf/homepage
   {:xsd/anyURI
    "https://lfd.niedersachsen.de/download/132258/Niedersaechsisches_Datenschutzgesetz_NDSG_vom_16._Mai_2018_Nds._GVBl._S._66_.pdf"},
   :rdf/type #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Lower Saxony Data Protection Act (NDSG)"}
                 {:rdf/language "de",
                  :rdf/value    "Niedersächsisches Datenschutzgesetz (NDSG)"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DE-NW
  {:db/ident              :dpvo-legal/DE-NW,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      :dpvo-legal/DE,
   :dpvo/hasApplicableLaw #{:dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG
                            :dpvo-legal/DE-NW-DSG},
   :dpvo/hasAuthority     :dpvo-legal/DPA-DE-NW,
   :rdf/type              #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "North-Rhine Westphalia"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DE-NW-DSG
  {:db/ident :dpvo-legal/DE-NW-DSG,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-NW,
   :dpvo/hasJurisdiction :dpvo-legal/DE-NW,
   :foaf/homepage
   {:xsd/anyURI
    "https://recht.nrw.de/lmi/owa/br_text_anzeigen?v_id=3520071121100436275"},
   :rdf/type #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #{{:rdf/language "de",
                  :rdf/value "Datenschutzgesetz Nordrhein-Westfalen (DSG NRW)"}
                 {:rdf/language "en",
                  :rdf/value
                  "North Rhine-Westphalia Data Protection Act (DSG NRW)"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DE-RP
  {:db/ident              :dpvo-legal/DE-RP,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      :dpvo-legal/DE,
   :dpvo/hasApplicableLaw #{:dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG
                            :dpvo-legal/DE-RP-LDSG},
   :rdf/type              #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Rhineland-Palatinate"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DE-RP-LDSG
  {:db/ident :dpvo-legal/DE-RP-LDSG,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-RP,
   :dpvo/hasJurisdiction :dpvo-legal/DE-RP,
   :foaf/homepage
   {:xsd/anyURI "https://landesrecht.rlp.de/bsrp/document/jlr-DSGRP2018pP18"},
   :rdf/type #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "State Data Protection Act (LDSG)"}
                 {:rdf/language "de",
                  :rdf/value    "Landesdatenschutzgesetz (LDSG)"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DE-SH
  {:db/ident              :dpvo-legal/DE-SH,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      :dpvo-legal/DE,
   :dpvo/hasApplicableLaw #{:dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG
                            :dpvo-legal/DE-SH-LDSG},
   :dpvo/hasAuthority     :dpvo-legal/DPA-DE-SH,
   :rdf/type              #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Schleswig-Holstein"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DE-SH-LDSG
  {:db/ident :dpvo-legal/DE-SH-LDSG,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-SH,
   :dpvo/hasJurisdiction :dpvo-legal/DE-SH,
   :foaf/homepage
   {:xsd/anyURI
    "https://www.gesetze-rechtsprechung.sh.juris.de/jportal/?quelle=jlink&query=DSG+SH&psml=bsshoprod.psml&max=true&aiz=true"},
   :rdf/type #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   #{{:rdf/language "en",
      :rdf/value
      "Schleswig-Holstein law for the protection of personal data (state data protection law - LDSG)"}
     {:rdf/language "de",
      :rdf/value
      "Schleswig-Holsteinisches Gesetz zum Schutz personenbezogener Daten (Landesdatenschutzgesetz - LDSG)"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DE-SL
  {:db/ident              :dpvo-legal/DE-SL,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      :dpvo-legal/DE,
   :dpvo/hasApplicableLaw #{:dpvo-legal/EU-GDPR :dpvo-legal/DE-SL-SDSG
                            :dpvo-legal/DE-BDSG},
   :dpvo/hasAuthority     :dpvo-legal/DPA-DE-SL,
   :rdf/type              #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Saarland"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DE-SL-SDSG
  {:db/ident :dpvo-legal/DE-SL-SDSG,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-SL,
   :dpvo/hasJurisdiction :dpvo-legal/DE-SL,
   :foaf/homepage
   {:xsd/anyURI "https://recht.saarland.de/bssl/document/jlr-DSGSL2018rahmen"},
   :rdf/type #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #{{:rdf/language "de",
                  :rdf/value    "Saarländisches Datenschutzgesetz"}
                 {:rdf/language "en",
                  :rdf/value    "Saarland Data Protection Act"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DE-SN
  {:db/ident              :dpvo-legal/DE-SN,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      :dpvo-legal/DE,
   :dpvo/hasApplicableLaw #{:dpvo-legal/DE-SN-SächsDSG :dpvo-legal/EU-GDPR
                            :dpvo-legal/DE-BDSG},
   :dpvo/hasAuthority     :dpvo-legal/DPA-DE-SN,
   :rdf/type              #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Saxony"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DE-SN-SächsDSG
  {:db/ident :dpvo-legal/DE-SN-SächsDSG,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-SN,
   :dpvo/hasJurisdiction :dpvo-legal/DE-SN,
   :foaf/homepage
   {:xsd/anyURI
    "https://www.recht.sachsen.de/vorschrift_gesamt/1672/28005.pdf"},
   :rdf/type #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   #{{:rdf/language "en",
      :rdf/value
      "Law for the Protection of Informational Self-Determination in the Free State of Saxony (Saxon Data Protection Act - SächsDSG)"}
     {:rdf/language "de",
      :rdf/value
      "Gesetz zum Schutz der informationellen Selbstbestimmung im Freistaat Sachsen (Sächsisches Datenschutzgesetz – SächsDSG)"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DE-ST
  {:db/ident              :dpvo-legal/DE-ST,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      :dpvo-legal/DE,
   :dpvo/hasApplicableLaw #{:dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG
                            :dpvo-legal/DE-LSA-DSG},
   :dpvo/hasAuthority     :dpvo-legal/DPA-DE-ST,
   :rdf/type              #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Saxony-Anhalt"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DE-TH
  {:db/ident              :dpvo-legal/DE-TH,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      :dpvo-legal/DE,
   :dpvo/hasApplicableLaw #{:dpvo-legal/DE-TH-ThürDSG :dpvo-legal/EU-GDPR
                            :dpvo-legal/DE-BDSG},
   :dpvo/hasAuthority     :dpvo-legal/DPA-DE-TH,
   :rdf/type              #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Thuringia"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DE-TH-ThürDSG
  {:db/ident :dpvo-legal/DE-TH-ThürDSG,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasAuthority :dpvo-legal/DPA-DE-TH,
   :dpvo/hasJurisdiction :dpvo-legal/DE-TH,
   :foaf/homepage
   {:xsd/anyURI
    "https://landesrecht.thueringen.de/bsth/document/jlr-DSGTH2018rahmen"},
   :rdf/type #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #{{:rdf/language "de",
                  :rdf/value    "Thüringer Datenschutzgesetz (ThürDSG)"}
                 {:rdf/language "en",
                  :rdf/value    "Thuringian Data Protection Act (ThürDSG)"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DJ
  {:db/ident              :dpvo-legal/DJ,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica},
   :dpvo-legal/iso_alpha2 "DJ",
   :dpvo-legal/iso_alpha3 "DJI",
   :dpvo-legal/iso_numeric "262",
   :dpvo-legal/un_m49     "262",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Djibouti"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DK
  {:db/ident               :dpvo-legal/DK,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/Europe :dpvo-legal/NorthernEurope},
   :dpvo-legal/iso_alpha2  "DK",
   :dpvo-legal/iso_alpha3  "DNK",
   :dpvo-legal/iso_numeric "208",
   :dpvo-legal/un_m49      "208",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-DK,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Denmark"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def DM
  {:db/ident              :dpvo-legal/DM,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "DM",
   :dpvo-legal/iso_alpha3 "DMA",
   :dpvo-legal/iso_numeric "212",
   :dpvo-legal/un_m49     "212",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Dominica"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DO
  {:db/ident              :dpvo-legal/DO,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "DO",
   :dpvo-legal/iso_alpha3 "DOM",
   :dpvo-legal/iso_numeric "214",
   :dpvo-legal/un_m49     "214",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Dominican Republic"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-AT
  {:db/ident              :dpvo-legal/DPA-AT,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction  :dpvo-legal/AT,
   :foaf/homepage         {:xsd/anyURI "https://dsb.gv.at"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Austrian Data Protection Authority"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-BE
  {:db/ident              :dpvo-legal/DPA-BE,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction  :dpvo-legal/BE,
   :foaf/homepage         {:xsd/anyURI
                           "https://www.dataprotectionauthority.be/"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Belgian Data Protection Authority"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-BG
  {:db/ident              :dpvo-legal/DPA-BG,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction  :dpvo-legal/BG,
   :foaf/homepage         {:xsd/anyURI "https://www.cpdp.bg/"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value
                           "Commission for Personal Data Protection"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-CY
  {:db/ident              :dpvo-legal/DPA-CY,
   :dcterms/created       #inst "2023-06-16T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction  :dpvo-legal/CY,
   :foaf/homepage         {:xsd/anyURI "http://www.dataprotection.gov.cy/"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value
                           "Commissioner for Personal Data Protection"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-CZ
  {:db/ident              :dpvo-legal/DPA-CZ,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction  :dpvo-legal/CZ,
   :foaf/homepage         {:xsd/anyURI "https://www.uoou.cz/"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Office for Personal Data Protection"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-DE
  {:db/ident :dpvo-legal/DPA-DE,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw #{:dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG},
   :dpvo/hasJurisdiction :dpvo-legal/DE,
   :foaf/homepage {:xsd/anyURI "http://www.bfdi.bund.de/"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   {:rdf/language "en",
    :rdf/value
    "The Federal Commissioner for Data Protection and Freedom of Information"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPA-DE-BB
  {:db/ident :dpvo-legal/DPA-DE-BB,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasApplicableLaw #{:dpvo-legal/DE-BE-BbgDSG :dpvo-legal/EU-GDPR
                            :dpvo-legal/DE-BDSG},
   :dpvo/hasJurisdiction :dpvo-legal/DE-BB,
   :foaf/homepage {:xsd/anyURI "https://www.lda.brandenburg.de/"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   #{{:rdf/language "en",
      :rdf/value
      "The state representative for data protection and the right to inspect files in Brandenburg"}
     {:rdf/language "de",
      :rdf/value
      "Die Landesbeauftragte für den Datenschutz und für das Recht auf Akteneinsicht Brandenburg"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPA-DE-BE
  {:db/ident :dpvo-legal/DPA-DE-BE,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasApplicableLaw #{:dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG
                            :dpvo-legal/DE-BE-BlnDSG},
   :dpvo/hasJurisdiction :dpvo-legal/DE-BE,
   :foaf/homepage {:xsd/anyURI "https://www.datenschutz-berlin.de/"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   #{{:rdf/language "en",
      :rdf/value
      "Berlin Commissioner for Data Protection and Freedom of Information"}
     {:rdf/language "de",
      :rdf/value
      "Berliner Beauftragte für Datenschutz und Informationsfreiheit"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPA-DE-BY-non-public
  {:db/ident :dpvo-legal/DPA-DE-BY-non-public,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasApplicableLaw #{:dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG
                            :dpvo-legal/DE-BY-BayDSG},
   :dpvo/hasJurisdiction :dpvo-legal/DE-BY,
   :foaf/homepage {:xsd/anyURI "https://www.lda.bayern.de/"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value
                  "Bavarian State Office for Data Protection Supervision"}
                 {:rdf/language "de",
                  :rdf/value "Bayerisches Landesamt für Datenschutzaufsicht"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPA-DE-BY-public
  {:db/ident :dpvo-legal/DPA-DE-BY-public,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasApplicableLaw #{:dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG
                            :dpvo-legal/DE-BY-BayDSG},
   :dpvo/hasJurisdiction :dpvo-legal/DE-BY,
   :foaf/homepage {:xsd/anyURI "https://www.datenschutz-bayern.de/"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   #{{:rdf/language "en",
      :rdf/value    "The Bavarian State Commissioner for Data Protection"}
     {:rdf/language "de",
      :rdf/value    "Der Bayerische Landesbeauftragte für den Datenschutz"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPA-DE-HB
  {:db/ident :dpvo-legal/DPA-DE-HB,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasApplicableLaw #{:dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG
                            :dpvo-legal/DE-HB-BremDSGVOAG},
   :dpvo/hasJurisdiction :dpvo-legal/DE-HB,
   :foaf/homepage {:xsd/anyURI "https://www.datenschutz.bremen.de/"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   #{{:rdf/language "de",
      :rdf/value
      "Die Landesbeauftragte für Datenschutz und Informationsfreiheit der Freien Hansestadt Bremen"}
     {:rdf/language "en",
      :rdf/value
      "The State Commissioner for Data Protection and Freedom of Information of the Free Hanseatic City of Bremen"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPA-DE-HE
  {:db/ident :dpvo-legal/DPA-DE-HE,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasApplicableLaw #{:dpvo-legal/DE-HE-HDISG :dpvo-legal/EU-GDPR
                            :dpvo-legal/DE-BDSG},
   :dpvo/hasJurisdiction :dpvo-legal/DE-HE,
   :foaf/homepage {:xsd/anyURI "https://www.datenschutz.hessen.de/"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   #{{:rdf/language "en",
      :rdf/value
      "The Hessian Commissioner for Data Protection and Freedom of Information"}
     {:rdf/language "de",
      :rdf/value
      "Der Hessische Beauftragte für Datenschutz und Informationsfreiheit"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPA-DE-HH
  {:db/ident :dpvo-legal/DPA-DE-HH,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasApplicableLaw #{:dpvo-legal/DE-HH-HmbDSG :dpvo-legal/EU-GDPR
                            :dpvo-legal/DE-BDSG},
   :dpvo/hasJurisdiction :dpvo-legal/DE-HH,
   :foaf/homepage {:xsd/anyURI "https://www.datenschutz-hamburg.de/"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   #{{:rdf/language "de",
      :rdf/value
      "Der Hamburgische Beauftragte für Datenschutz und Informationsfreiheit"}
     {:rdf/language "en",
      :rdf/value
      "The Hamburg Commissioner for Data Protection and Freedom of Information"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPA-DE-MV
  {:db/ident :dpvo-legal/DPA-DE-MV,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasApplicableLaw #{:dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG
                            :dpvo-legal/DE-MV-DSG},
   :dpvo/hasJurisdiction :dpvo-legal/DE-MV,
   :foaf/homepage {:xsd/anyURI "https://www.datenschutz-mv.de/"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   #{{:rdf/language "de",
      :rdf/value
      "Der Landesbeauftragte für Datenschutz und Informationsfreiheit Mecklenburg-Vorpommern"}
     {:rdf/language "en",
      :rdf/value
      "The State Commissioner for Data Protection and Freedom of Information Mecklenburg-West Pomerania"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPA-DE-NI
  {:db/ident :dpvo-legal/DPA-DE-NI,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasApplicableLaw #{:dpvo-legal/DE-NI-NDSG :dpvo-legal/EU-GDPR
                            :dpvo-legal/DE-BDSG},
   :dpvo/hasJurisdiction :dpvo-legal/DE-NI,
   :foaf/homepage {:xsd/anyURI "https://www.lfd.niedersachsen.de/"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   #{{:rdf/language "de",
      :rdf/value    "Die Landesbeauftragte für den Datenschutz Niedersachsen"}
     {:rdf/language "en",
      :rdf/value    "The State Commissioner for Data Protection Lower Saxony"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPA-DE-NW
  {:db/ident :dpvo-legal/DPA-DE-NW,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasApplicableLaw #{:dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG
                            :dpvo-legal/DE-NW-DSG},
   :dpvo/hasJurisdiction :dpvo-legal/DE-NW,
   :foaf/homepage {:xsd/anyURI "https://www.ldi.nrw.de/"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   #{{:rdf/language "en",
      :rdf/value
      "State Commissioner for Data Protection and Freedom of Information North Rhine-Westphalia"}
     {:rdf/language "de",
      :rdf/value
      "Landesbeauftragte für Datenschutz und Informationsfreiheit Nordrhein-Westfalen"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPA-DE-RP
  {:db/ident :dpvo-legal/DPA-DE-RP,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw #{:dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG
                            :dpvo-legal/DE-RP-LDSG},
   :foaf/homepage {:xsd/anyURI "https://www.datenschutz.rlp.de/"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   #{{:rdf/language "en",
      :rdf/value
      "The state commissioner for data protection and freedom of information in Rhineland-Palatinate"}
     {:rdf/language "de",
      :rdf/value
      "Der Landesbeauftragte für den Datenschutz und die Informationsfreiheit Rheinland-Pfalz"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPA-DE-SH
  {:db/ident :dpvo-legal/DPA-DE-SH,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasApplicableLaw #{:dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG
                            :dpvo-legal/DE-SH-LDSG},
   :dpvo/hasJurisdiction :dpvo-legal/DE-SH,
   :foaf/homepage {:xsd/anyURI "https://www.datenschutzzentrum.de/"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   #{{:rdf/language "de",
      :rdf/value
      "Unabhängiges Landeszentrum für Datenschutz Schleswig-Holstein"}
     {:rdf/language "en",
      :rdf/value
      "Independent State Center for Data Protection Schleswig-Holstein"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPA-DE-SL
  {:db/ident :dpvo-legal/DPA-DE-SL,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasApplicableLaw #{:dpvo-legal/EU-GDPR :dpvo-legal/DE-SL-SDSG
                            :dpvo-legal/DE-BDSG},
   :dpvo/hasJurisdiction :dpvo-legal/DE-SL,
   :foaf/homepage {:xsd/anyURI "https://www.datenschutz.saarland.de/"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   #{{:rdf/language "en",
      :rdf/value
      "Independent Data Protection Center Saarland - State Commissioner for Data Protection and Freedom of Information"}
     {:rdf/language "de",
      :rdf/value
      "Unabhängiges Datenschutzzentrum Saarland - Landesbeauftragte für Datenschutz und Informationsfreiheit"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPA-DE-SN
  {:db/ident              :dpvo-legal/DPA-DE-SN,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       #{{:rdf/value "Harshvardhan J. Pandit"}
                            {:rdf/value "Julian Flake"}},
   :dpvo/hasApplicableLaw #{:dpvo-legal/DE-SN-SächsDSG :dpvo-legal/EU-GDPR
                            :dpvo-legal/DE-BDSG},
   :dpvo/hasJurisdiction  :dpvo-legal/DE-SN,
   :foaf/homepage         {:xsd/anyURI "https://www.saechsdsb.de/"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            #{{:rdf/language "en",
                             :rdf/value    "The Saxon data protection officer"}
                            {:rdf/language "de",
                             :rdf/value
                             "Die Sächsische Datenschutzbeauftragte"}},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-DE-ST
  {:db/ident :dpvo-legal/DPA-DE-ST,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasApplicableLaw #{:dpvo-legal/EU-GDPR :dpvo-legal/DE-BDSG
                            :dpvo-legal/DE-LSA-DSG},
   :dpvo/hasJurisdiction :dpvo-legal/DE-ST,
   :foaf/homepage {:xsd/anyURI "https://datenschutz.sachsen-anhalt.de/"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   #{{:rdf/language "en",
      :rdf/value    "State representative for data protection in Saxony-Anhalt"}
     {:rdf/language "de",
      :rdf/value    "Landesbeauftragter für den Datenschutz Sachsen-Anhalt"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPA-DE-TH
  {:db/ident :dpvo-legal/DPA-DE-TH,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Julian Flake"}},
   :dpvo/hasApplicableLaw #{:dpvo-legal/DE-TH-ThürDSG :dpvo-legal/EU-GDPR
                            :dpvo-legal/DE-BDSG},
   :dpvo/hasJurisdiction :dpvo-legal/DE-TH,
   :foaf/homepage {:xsd/anyURI "https://www.tlfdi.de/"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   #{{:rdf/language "en",
      :rdf/value
      "Thuringia state commissioner for data protection and freedom of information"}
     {:rdf/language "de",
      :rdf/value
      "Thüringer Landesbeauftragter für den Datenschutz und die Informationsfreiheit"}},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPA-DK
  {:db/ident              :dpvo-legal/DPA-DK,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction  :dpvo-legal/DK,
   :foaf/homepage         {:xsd/anyURI "http://www.datatilsynet.dk/"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Danish Data Protection Agency"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-EE
  {:db/ident              :dpvo-legal/DPA-EE,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction  :dpvo-legal/EE,
   :foaf/homepage         {:xsd/anyURI "http://www.aki.ee/"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value "Estonian Data Protection Inspectorate"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-ES
  {:db/ident              :dpvo-legal/DPA-ES,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction  :dpvo-legal/ES,
   :foaf/homepage         {:xsd/anyURI "https://www.aepd.es/"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value "Spanish Data Protection Agency (AEPD)"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-EU-EDPS
  {:db/ident              :dpvo-legal/DPA-EU-EDPS,
   :dcterms/created       #inst "2023-06-16T00:00:00.000-00:00",
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction  :dpvo-legal/EU,
   :foaf/homepage         {:xsd/anyURI "https://edps.europa.eu/"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "European Data Protection Supervisor"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-FI
  {:db/ident              :dpvo-legal/DPA-FI,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction  :dpvo-legal/FI,
   :foaf/homepage         {:xsd/anyURI "https://tietosuoja.fi/"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value
                           "Office of the Data Protection Ombudsman"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-FR
  {:db/ident :dpvo-legal/DPA-FR,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction :dpvo-legal/FR,
   :foaf/homepage {:xsd/anyURI "https://www.cnil.fr/"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "National Commission on Informatics and Liberty (CNIL)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPA-GB
  {:db/ident              :dpvo-legal/DPA-GB,
   :dcterms/created       #inst "2022-07-20T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw #{:dpvo-legal/UK-GDPR :dpvo-legal/UK-DPA-2018},
   :dpvo/hasJurisdiction  :dpvo-legal/GB,
   :foaf/homepage         {:xsd/anyURI "https://ico.org.uk/"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Information Commissioner's Office"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-GR
  {:db/ident              :dpvo-legal/DPA-GR,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction  :dpvo-legal/GR,
   :foaf/homepage         {:xsd/anyURI "http://dpa.gr"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Hellenic Data Protection Authority"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-HR
  {:db/ident              :dpvo-legal/DPA-HR,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction  :dpvo-legal/HR,
   :foaf/homepage         {:xsd/anyURI "http://www.azop.hr/"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value
                           "Croatian Personal Data Protection Agency"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-HU
  {:db/ident :dpvo-legal/DPA-HU,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction :dpvo-legal/HU,
   :foaf/homepage {:xsd/anyURI "http://www.naih.hu/"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   {:rdf/language "en",
    :rdf/value
    "Hungarian National Authority for Data Protection and Freedom of Information"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPA-IE
  {:db/ident              :dpvo-legal/DPA-IE,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction  :dpvo-legal/IE,
   :foaf/homepage         {:xsd/anyURI "http://www.dataprotection.ie"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Data Protection Commission (DPC)"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-IS
  {:db/ident              :dpvo-legal/DPA-IS,
   :dcterms/created       #inst "2023-06-16T00:00:00.000-00:00",
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction  :dpvo-legal/IS,
   :foaf/homepage         {:xsd/anyURI "https://www.dpa.is/"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Icelandic Data Protection Authority"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-IT
  {:db/ident              :dpvo-legal/DPA-IT,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction  :dpvo-legal/IT,
   :foaf/homepage         {:xsd/anyURI "https://www.garanteprivacy.it/"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Data Protection Commission"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-LT
  {:db/ident              :dpvo-legal/DPA-LT,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction  :dpvo-legal/LT,
   :foaf/homepage         {:xsd/anyURI "https://ada.lt"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "State Data Protection Inspectorate"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-LU
  {:db/ident              :dpvo-legal/DPA-LU,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction  :dpvo-legal/LU,
   :foaf/homepage         {:xsd/anyURI "https://cnpd.public.lu"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value
                           "National Commission for Data Protection"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-LV
  {:db/ident              :dpvo-legal/DPA-LV,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction  :dpvo-legal/LV,
   :foaf/homepage         {:xsd/anyURI "http://www.dvi.gov.lv/"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Data State Inspectorate"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-MT
  {:db/ident :dpvo-legal/DPA-MT,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction :dpvo-legal/MT,
   :foaf/homepage {:xsd/anyURI "https://idpc.org.mt"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "Office of the Information and Data Protection Commissioner"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPA-NL
  {:db/ident              :dpvo-legal/DPA-NL,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction  :dpvo-legal/NL,
   :foaf/homepage         {:xsd/anyURI "https://autoriteitpersoonsgegevens.nl"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Dutch Data Protection Authority"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-PL
  {:db/ident              :dpvo-legal/DPA-PL,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction  :dpvo-legal/PL,
   :foaf/homepage         {:xsd/anyURI "https://uodo.gov.pl/"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Personal Data Protection Office"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-PT
  {:db/ident              :dpvo-legal/DPA-PT,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction  :dpvo-legal/PT,
   :foaf/homepage         {:xsd/anyURI "https://www.cnpd.pt"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value
                           "Comissão Nacional de Protecção de Dados"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-RO
  {:db/ident :dpvo-legal/DPA-RO,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction :dpvo-legal/RO,
   :foaf/homepage {:xsd/anyURI "http://www.dataprotection.ro/"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "National Supervisory Authority for Personal Data Processing"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPA-SE
  {:db/ident              :dpvo-legal/DPA-SE,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction  :dpvo-legal/SE,
   :foaf/homepage         {:xsd/anyURI "https://www.imy.se/"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value
                           "Swedish Authority for Privacy Protection"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-SI
  {:db/ident :dpvo-legal/DPA-SI,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction :dpvo-legal/SI,
   :foaf/homepage {:xsd/anyURI "https://www.ip-rs.si/"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "Information Commissioner of the Republic of Slovenia"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPA-SK
  {:db/ident :dpvo-legal/DPA-SK,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction :dpvo-legal/SK,
   :foaf/homepage {:xsd/anyURI "http://www.dataprotection.gov.sk/"},
   :rdf/type #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "Office for Personal Data Protection of the Slovak Republic"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DPA-US-CO
  {:db/ident              :dpvo-legal/DPA-US-CO,
   :dcterms/created       #inst "2022-11-23T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Jonathan Bowker"},
   :dpvo/hasApplicableLaw :dpvo-legal/US-CO-CPA,
   :dpvo/hasJurisdiction  :dpvo-legal/US-CO,
   :foaf/homepage         {:xsd/anyURI "https://coag.gov"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Colorado Attorney General"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-US-CT
  {:db/ident              :dpvo-legal/DPA-US-CT,
   :dcterms/created       #inst "2022-11-23T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Jonathan Bowker"},
   :dpvo/hasApplicableLaw :dpvo-legal/US-CT-CTPA,
   :dpvo/hasJurisdiction  :dpvo-legal/US-CT,
   :foaf/homepage         {:xsd/anyURI "https://portal.ct.gov/AG"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Connecticut Attorney General"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-US-NV
  {:db/ident              :dpvo-legal/DPA-US-NV,
   :dcterms/created       #inst "2022-11-23T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Jonathan Bowker"},
   :dpvo/hasApplicableLaw :dpvo-legal/US-NV-NPICICA,
   :dpvo/hasJurisdiction  :dpvo-legal/US-NV,
   :foaf/homepage         {:xsd/anyURI "https://ag.nv.gov/"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Nevada Attorney General"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-US-UT
  {:db/ident              :dpvo-legal/DPA-US-UT,
   :dcterms/created       #inst "2022-11-22T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Jonathan Bowker"},
   :dpvo/hasApplicableLaw :dpvo-legal/US-UT-UCPA,
   :dpvo/hasJurisdiction  :dpvo-legal/US-UT,
   :foaf/homepage         {:xsd/anyURI "https://attorneygeneral.utah.gov/"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Utah Attorney General"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPA-US-VA
  {:db/ident              :dpvo-legal/DPA-US-VA,
   :dcterms/created       #inst "2022-11-23T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Jonathan Bowker"},
   :dpvo/hasApplicableLaw :dpvo-legal/US-VA-VCDPA,
   :dpvo/hasJurisdiction  :dpvo-legal/US-VA,
   :foaf/homepage         {:xsd/anyURI "https://www.oag.state.va.us"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Virginia Attorney General"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPV-LI
  {:db/ident              :dpvo-legal/DPV-LI,
   :dcterms/created       #inst "2023-06-16T00:00:00.000-00:00",
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction  :dpvo-legal/LI,
   :foaf/homepage         {:xsd/anyURI "https://www.datenschutzstelle.li/"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value
                           "Liechtenstein Data Protection Authority"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DPV-NO
  {:db/ident              :dpvo-legal/DPV-NO,
   :dcterms/created       #inst "2023-06-16T00:00:00.000-00:00",
   :dpvo/hasApplicableLaw :dpvo-legal/EU-GDPR,
   :dpvo/hasJurisdiction  :dpvo-legal/NO,
   :foaf/homepage         {:xsd/anyURI "https://www.datatilsynet.no/"},
   :rdf/type              #{:owl/NamedIndividual :dpvo/DataProtectionAuthority},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Norwegian Data Protection Authority"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def DZ
  {:db/ident              :dpvo-legal/DZ,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/NorthernAfrica},
   :dpvo-legal/iso_alpha2 "DZ",
   :dpvo-legal/iso_alpha3 "DZA",
   :dpvo-legal/iso_numeric "12",
   :dpvo-legal/un_m49     "12",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Algeria"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def EC
  {:db/ident              :dpvo-legal/EC,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/SouthAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "EC",
   :dpvo-legal/iso_alpha3 "ECU",
   :dpvo-legal/iso_numeric "218",
   :dpvo-legal/un_m49     "218",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Ecuador"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def EE
  {:db/ident               :dpvo-legal/EE,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/Europe :dpvo-legal/NorthernEurope},
   :dpvo-legal/iso_alpha2  "EE",
   :dpvo-legal/iso_alpha3  "EST",
   :dpvo-legal/iso_numeric "233",
   :dpvo-legal/un_m49      "233",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-EE,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Estonia"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def EEA
  {:db/ident         :dpvo-legal/EEA,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/EEA31 :dpvo-legal/EEA30},
   :dcterms/isPartOf #{:dpvo-legal/NL :dpvo-legal/GR :dpvo-legal/BG
                       :dpvo-legal/LT :dpvo-legal/EE :dpvo-legal/AT
                       :dpvo-legal/MT :dpvo-legal/FI :dpvo-legal/PL
                       :dpvo-legal/FR :dpvo-legal/CZ :dpvo-legal/LU
                       :dpvo-legal/HU :dpvo-legal/DE :dpvo-legal/IT
                       :dpvo-legal/BE :dpvo-legal/SE :dpvo-legal/SK
                       :dpvo-legal/PT :dpvo-legal/HR :dpvo-legal/SI
                       :dpvo-legal/CY :dpvo-legal/DK :dpvo-legal/IE
                       :dpvo-legal/ES :dpvo-legal/LV :dpvo-legal/RO},
   :dpvo/hasCountry  #{:dpvo-legal/NL :dpvo-legal/GR :dpvo-legal/BG
                       :dpvo-legal/LT :dpvo-legal/EE :dpvo-legal/AT
                       :dpvo-legal/MT :dpvo-legal/FI :dpvo-legal/PL
                       :dpvo-legal/FR :dpvo-legal/CZ :dpvo-legal/LU
                       :dpvo-legal/HU :dpvo-legal/DE :dpvo-legal/IT
                       :dpvo-legal/BE :dpvo-legal/SE :dpvo-legal/SK
                       :dpvo-legal/PT :dpvo-legal/HR :dpvo-legal/SI
                       :dpvo-legal/CY :dpvo-legal/DK :dpvo-legal/IE
                       :dpvo-legal/ES :dpvo-legal/LV :dpvo-legal/RO},
   :rdf/type         #{:dpvo/SupraNationalUnion :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "European Economic Area (EEA)"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def EEA30
  {:db/ident         :dpvo-legal/EEA30,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf #{:dpvo-legal/EEA :dpvo-legal/NL :dpvo-legal/GR
                       :dpvo-legal/BG :dpvo-legal/LT :dpvo-legal/EE
                       :dpvo-legal/AT :dpvo-legal/MT :dpvo-legal/FI
                       :dpvo-legal/PL :dpvo-legal/FR :dpvo-legal/CZ
                       :dpvo-legal/LU :dpvo-legal/HU :dpvo-legal/DE
                       :dpvo-legal/IT :dpvo-legal/BE :dpvo-legal/SE
                       :dpvo-legal/SK :dpvo-legal/PT :dpvo-legal/HR
                       :dpvo-legal/SI :dpvo-legal/CY :dpvo-legal/DK
                       :dpvo-legal/IE :dpvo-legal/ES :dpvo-legal/LV
                       :dpvo-legal/RO},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning {:time/inXSDDate
                                          #inst
                                           "2020-02-01T00:00:00.000-00:00"}},
   :dpvo/hasCountry  #{:dpvo-legal/NL :dpvo-legal/GR :dpvo-legal/BG
                       :dpvo-legal/LT :dpvo-legal/EE :dpvo-legal/AT
                       :dpvo-legal/MT :dpvo-legal/FI :dpvo-legal/PL
                       :dpvo-legal/FR :dpvo-legal/CZ :dpvo-legal/LU
                       :dpvo-legal/HU :dpvo-legal/DE :dpvo-legal/IT
                       :dpvo-legal/BE :dpvo-legal/SE :dpvo-legal/SK
                       :dpvo-legal/PT :dpvo-legal/HR :dpvo-legal/SI
                       :dpvo-legal/CY :dpvo-legal/DK :dpvo-legal/IE
                       :dpvo-legal/ES :dpvo-legal/LV :dpvo-legal/RO},
   :rdf/type         #{:dpvo/SupraNationalUnion :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "European Economic Area (EEA-30)"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def EEA31
  {:db/ident         :dpvo-legal/EEA31,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf #{:dpvo-legal/EEA :dpvo-legal/NL :dpvo-legal/GR
                       :dpvo-legal/BG :dpvo-legal/LT :dpvo-legal/EE
                       :dpvo-legal/AT :dpvo-legal/MT :dpvo-legal/FI
                       :dpvo-legal/PL :dpvo-legal/FR :dpvo-legal/CZ
                       :dpvo-legal/LU :dpvo-legal/HU :dpvo-legal/DE
                       :dpvo-legal/IT :dpvo-legal/BE :dpvo-legal/SE
                       :dpvo-legal/SK :dpvo-legal/PT :dpvo-legal/HR
                       :dpvo-legal/SI :dpvo-legal/GB :dpvo-legal/CY
                       :dpvo-legal/DK :dpvo-legal/IE :dpvo-legal/ES
                       :dpvo-legal/LV :dpvo-legal/RO},
   :dcterms/temporal {:rdf/type          :time/ProperInterval,
                      :time/hasBeginning {:time/inXSDDate
                                          #inst
                                           "2014-04-12T00:00:00.000-00:00"},
                      :time/hasEnd       {:time/inXSDDate
                                          #inst
                                           "2020-01-31T00:00:00.000-00:00"}},
   :dpvo/hasCountry  #{:dpvo-legal/NL :dpvo-legal/GR :dpvo-legal/BG
                       :dpvo-legal/LT :dpvo-legal/EE :dpvo-legal/AT
                       :dpvo-legal/MT :dpvo-legal/FI :dpvo-legal/PL
                       :dpvo-legal/FR :dpvo-legal/CZ :dpvo-legal/LU
                       :dpvo-legal/HU :dpvo-legal/DE :dpvo-legal/IT
                       :dpvo-legal/BE :dpvo-legal/SE :dpvo-legal/SK
                       :dpvo-legal/PT :dpvo-legal/HR :dpvo-legal/SI
                       :dpvo-legal/GB :dpvo-legal/CY :dpvo-legal/DK
                       :dpvo-legal/IE :dpvo-legal/ES :dpvo-legal/LV
                       :dpvo-legal/RO},
   :rdf/type         #{:dpvo/SupraNationalUnion :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "European Economic Area (EEA-31)"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def EG
  {:db/ident              :dpvo-legal/EG,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/NorthernAfrica},
   :dpvo-legal/iso_alpha2 "EG",
   :dpvo-legal/iso_alpha3 "EGY",
   :dpvo-legal/iso_numeric "818",
   :dpvo-legal/un_m49     "818",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Egypt"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def EH
  {:db/ident              :dpvo-legal/EH,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/NorthernAfrica},
   :dpvo-legal/iso_alpha2 "EH",
   :dpvo-legal/iso_alpha3 "ESH",
   :dpvo-legal/iso_numeric "732",
   :dpvo-legal/un_m49     "732",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Western Sahara"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def ER
  {:db/ident              :dpvo-legal/ER,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica},
   :dpvo-legal/iso_alpha2 "ER",
   :dpvo-legal/iso_alpha3 "ERI",
   :dpvo-legal/iso_numeric "232",
   :dpvo-legal/un_m49     "232",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Eritrea"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def ES
  {:db/ident               :dpvo-legal/ES,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/Europe :dpvo-legal/SouthernEurope},
   :dpvo-legal/iso_alpha2  "ES",
   :dpvo-legal/iso_alpha3  "ESP",
   :dpvo-legal/iso_numeric "724",
   :dpvo-legal/un_m49      "724",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-ES,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Spain"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def ET
  {:db/ident              :dpvo-legal/ET,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica},
   :dpvo-legal/iso_alpha2 "ET",
   :dpvo-legal/iso_alpha3 "ETH",
   :dpvo-legal/iso_numeric "231",
   :dpvo-legal/un_m49     "231",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Ethiopia"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def EU
  {:db/ident          :dpvo-legal/EU,
   :dcterms/created   #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator   {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart   #{:dpvo-legal/EU27 :dpvo-legal/EU28},
   :dcterms/isPartOf  #{:dpvo-legal/NL :dpvo-legal/GR :dpvo-legal/BG
                        :dpvo-legal/LT :dpvo-legal/EE :dpvo-legal/AT
                        :dpvo-legal/MT :dpvo-legal/FI :dpvo-legal/PL
                        :dpvo-legal/FR :dpvo-legal/CZ :dpvo-legal/LU
                        :dpvo-legal/HU :dpvo-legal/DE :dpvo-legal/IT
                        :dpvo-legal/BE :dpvo-legal/SE :dpvo-legal/SK
                        :dpvo-legal/PT :dpvo-legal/HR :dpvo-legal/SI
                        :dpvo-legal/CY :dpvo-legal/DK :dpvo-legal/IE
                        :dpvo-legal/ES :dpvo-legal/LV :dpvo-legal/RO},
   :dpvo/hasAuthority :dpvo-legal/DPA-EU-EDPS,
   :dpvo/hasCountry   #{:dpvo-legal/NL :dpvo-legal/GR :dpvo-legal/BG
                        :dpvo-legal/LT :dpvo-legal/EE :dpvo-legal/AT
                        :dpvo-legal/MT :dpvo-legal/FI :dpvo-legal/PL
                        :dpvo-legal/FR :dpvo-legal/CZ :dpvo-legal/LU
                        :dpvo-legal/HU :dpvo-legal/DE :dpvo-legal/IT
                        :dpvo-legal/BE :dpvo-legal/SE :dpvo-legal/SK
                        :dpvo-legal/PT :dpvo-legal/HR :dpvo-legal/SI
                        :dpvo-legal/CY :dpvo-legal/DK :dpvo-legal/IE
                        :dpvo-legal/ES :dpvo-legal/LV :dpvo-legal/RO},
   :rdf/type          #{:dpvo/SupraNationalUnion :owl/NamedIndividual},
   :rdfs/isDefinedBy  {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label        {:rdf/language "en",
                       :rdf/value    "European Union (EU)"},
   :vs/term_status    {:rdf/language "en",
                       :rdf/value    "accepted"}})

(def EU-GDPR
  {:db/ident             :dpvo-legal/EU-GDPR,
   :dcterms/created      #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator      {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/temporal     {:rdf/type :time/ProperInterval,
                          :time/hasBeginning
                          {:time/inXSDDate #inst
                                            "2018-05-25T00:00:00.000-00:00"}},
   :dpvo/hasAuthority    #{:dpvo-legal/DPA-DE-SL :dpvo-legal/DPA-IS
                           :dpvo-legal/DPA-FI :dpvo-legal/DPV-LI
                           :dpvo-legal/DPA-DE :dpvo-legal/DPA-DE-TH
                           :dpvo-legal/DPA-DE-BB :dpvo-legal/DPA-MT
                           :dpvo-legal/DPA-LT :dpvo-legal/DPA-SK
                           :dpvo-legal/DPA-IT :dpvo-legal/DPA-DE-NI
                           :dpvo-legal/DPA-LV :dpvo-legal/DPA-SE
                           :dpvo-legal/DPA-DE-BY-public :dpvo-legal/DPA-HR
                           :dpvo-legal/DPA-DE-SH :dpvo-legal/DPA-FR
                           :dpvo-legal/DPA-DE-HH :dpvo-legal/DPA-CY
                           :dpvo-legal/DPA-DE-ST :dpvo-legal/DPA-EU-EDPS
                           :dpvo-legal/DPA-DE-RP :dpvo-legal/DPA-ES
                           :dpvo-legal/DPA-BE :dpvo-legal/DPA-DE-MV
                           :dpvo-legal/DPA-NL :dpvo-legal/DPA-DK
                           :dpvo-legal/DPA-BG :dpvo-legal/DPA-PL
                           :dpvo-legal/DPA-GR :dpvo-legal/DPA-DE-HB
                           :dpvo-legal/DPA-LU :dpvo-legal/DPA-DE-HE
                           :dpvo-legal/DPA-AT :dpvo-legal/DPA-DE-SN
                           :dpvo-legal/DPA-RO :dpvo-legal/DPA-CZ
                           :dpvo-legal/DPV-NO :dpvo-legal/DPA-PT
                           :dpvo-legal/DPA-DE-BE :dpvo-legal/DPA-EE
                           :dpvo-legal/DPA-SI :dpvo-legal/DPA-HU
                           :dpvo-legal/DPA-DE-NW :dpvo-legal/DPA-IE
                           :dpvo-legal/DPA-DE-BY-non-public},
   :dpvo/hasJurisdiction #{:dpvo-legal/DE-HE :dpvo-legal/NL :dpvo-legal/DE-BY
                           :dpvo-legal/DE-SH :dpvo-legal/DE-BB :dpvo-legal/GR
                           :dpvo-legal/BG :dpvo-legal/LT :dpvo-legal/EE
                           :dpvo-legal/AT :dpvo-legal/DE-TH :dpvo-legal/MT
                           :dpvo-legal/DE-NI :dpvo-legal/DE-HB :dpvo-legal/FI
                           :dpvo-legal/PL :dpvo-legal/FR :dpvo-legal/DE-BW
                           :dpvo-legal/CZ :dpvo-legal/LU :dpvo-legal/DE-SN
                           :dpvo-legal/HU :dpvo-legal/DE :dpvo-legal/IT
                           :dpvo-legal/BE :dpvo-legal/SE :dpvo-legal/SK
                           :dpvo-legal/DE-HH :dpvo-legal/PT :dpvo-legal/HR
                           :dpvo-legal/SI :dpvo-legal/CY :dpvo-legal/DK
                           :dpvo-legal/DE-MV :dpvo-legal/IE :dpvo-legal/ES
                           :dpvo-legal/DE-RP :dpvo-legal/DE-SL :dpvo-legal/DE-BE
                           :dpvo-legal/LV :dpvo-legal/DE-ST :dpvo-legal/RO
                           :dpvo-legal/DE-NW},
   :foaf/homepage        {:xsd/anyURI
                          "http://data.europa.eu/eli/reg/2016/679/oj"},
   :rdf/type             #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy     {:xsd/anyURI
                          "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           {:rdf/language "en",
                          :rdf/value
                          "General Data Protection Regulation (GDPR)"},
   :vs/term_status       {:rdf/language "en",
                          :rdf/value    "accepted"}})

(def EU27
  {:db/ident         :dpvo-legal/EU27,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf #{:dpvo-legal/NL :dpvo-legal/GR :dpvo-legal/BG
                       :dpvo-legal/LT :dpvo-legal/EE :dpvo-legal/AT
                       :dpvo-legal/MT :dpvo-legal/FI :dpvo-legal/PL
                       :dpvo-legal/FR :dpvo-legal/CZ :dpvo-legal/LU
                       :dpvo-legal/EU :dpvo-legal/HU :dpvo-legal/DE
                       :dpvo-legal/IT :dpvo-legal/BE :dpvo-legal/SE
                       :dpvo-legal/SK :dpvo-legal/PT :dpvo-legal/HR
                       :dpvo-legal/SI :dpvo-legal/CY :dpvo-legal/DK
                       :dpvo-legal/IE :dpvo-legal/ES :dpvo-legal/LV
                       :dpvo-legal/RO},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning {:time/inXSDDate
                                          #inst
                                           "2020-02-01T00:00:00.000-00:00"}},
   :dpvo/hasCountry  #{:dpvo-legal/NL :dpvo-legal/GR :dpvo-legal/BG
                       :dpvo-legal/LT :dpvo-legal/EE :dpvo-legal/AT
                       :dpvo-legal/MT :dpvo-legal/FI :dpvo-legal/PL
                       :dpvo-legal/FR :dpvo-legal/CZ :dpvo-legal/LU
                       :dpvo-legal/HU :dpvo-legal/DE :dpvo-legal/IT
                       :dpvo-legal/BE :dpvo-legal/SE :dpvo-legal/SK
                       :dpvo-legal/PT :dpvo-legal/HR :dpvo-legal/SI
                       :dpvo-legal/CY :dpvo-legal/DK :dpvo-legal/IE
                       :dpvo-legal/ES :dpvo-legal/LV :dpvo-legal/RO},
   :rdf/type         #{:dpvo/SupraNationalUnion :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "European Union (EU-27)"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def EU28
  {:db/ident         :dpvo-legal/EU28,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf #{:dpvo-legal/NL :dpvo-legal/GR :dpvo-legal/BG
                       :dpvo-legal/LT :dpvo-legal/EE :dpvo-legal/AT
                       :dpvo-legal/MT :dpvo-legal/FI :dpvo-legal/PL
                       :dpvo-legal/FR :dpvo-legal/CZ :dpvo-legal/LU
                       :dpvo-legal/EU :dpvo-legal/HU :dpvo-legal/DE
                       :dpvo-legal/IT :dpvo-legal/BE :dpvo-legal/SE
                       :dpvo-legal/SK :dpvo-legal/PT :dpvo-legal/HR
                       :dpvo-legal/SI :dpvo-legal/GB :dpvo-legal/CY
                       :dpvo-legal/DK :dpvo-legal/IE :dpvo-legal/ES
                       :dpvo-legal/LV :dpvo-legal/RO},
   :dcterms/temporal {:rdf/type          :time/ProperInterval,
                      :time/hasBeginning {:time/inXSDDate
                                          #inst
                                           "2013-07-01T00:00:00.000-00:00"},
                      :time/hasEnd       {:time/inXSDDate
                                          #inst
                                           "2020-01-31T00:00:00.000-00:00"}},
   :dpvo/hasCountry  #{:dpvo-legal/NL :dpvo-legal/GR :dpvo-legal/BG
                       :dpvo-legal/LT :dpvo-legal/EE :dpvo-legal/AT
                       :dpvo-legal/MT :dpvo-legal/FI :dpvo-legal/PL
                       :dpvo-legal/FR :dpvo-legal/CZ :dpvo-legal/LU
                       :dpvo-legal/HU :dpvo-legal/DE :dpvo-legal/IT
                       :dpvo-legal/BE :dpvo-legal/SE :dpvo-legal/SK
                       :dpvo-legal/PT :dpvo-legal/HR :dpvo-legal/SI
                       :dpvo-legal/GB :dpvo-legal/CY :dpvo-legal/DK
                       :dpvo-legal/IE :dpvo-legal/ES :dpvo-legal/LV
                       :dpvo-legal/RO},
   :rdf/type         #{:dpvo/SupraNationalUnion :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "European Union (EU-28)"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def EasternAfrica
  {:db/ident         :dpvo-legal/EasternAfrica,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/BI :dpvo-legal/DJ :dpvo-legal/KE
                       :dpvo-legal/TZ :dpvo-legal/ZM :dpvo-legal/KM
                       :dpvo-legal/ER :dpvo-legal/MZ :dpvo-legal/RW
                       :dpvo-legal/RE :dpvo-legal/SS :dpvo-legal/MG
                       :dpvo-legal/ET :dpvo-legal/MW :dpvo-legal/YT
                       :dpvo-legal/IO :dpvo-legal/SC :dpvo-legal/UG
                       :dpvo-legal/TF :dpvo-legal/ZW :dpvo-legal/SO
                       :dpvo-legal/MU},
   :dcterms/isPartOf :dpvo-legal/SubSaharanAfrica,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "EasternAfrica"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def EasternAsia
  {:db/ident         :dpvo-legal/EasternAsia,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/MO :dpvo-legal/CN :dpvo-legal/HK
                       :dpvo-legal/JP :dpvo-legal/KP :dpvo-legal/KR
                       :dpvo-legal/MN},
   :dcterms/isPartOf :dpvo-legal/Asia,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "EasternAsia"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def EasternEurope
  {:db/ident         :dpvo-legal/EasternEurope,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/UA :dpvo-legal/BG :dpvo-legal/BY
                       :dpvo-legal/PL :dpvo-legal/CZ :dpvo-legal/HU
                       :dpvo-legal/SK :dpvo-legal/RO :dpvo-legal/RU
                       :dpvo-legal/MD},
   :dcterms/isPartOf :dpvo-legal/Europe,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "EasternEurope"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def Europe
  {:db/ident         :dpvo-legal/Europe,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/IS :dpvo-legal/LI :dpvo-legal/WesternEurope
                       :dpvo-legal/NL :dpvo-legal/JE :dpvo-legal/UA
                       :dpvo-legal/GR :dpvo-legal/BG :dpvo-legal/LT
                       :dpvo-legal/EE :dpvo-legal/AT :dpvo-legal/IM
                       :dpvo-legal/MT :dpvo-legal/FO :dpvo-legal/BY
                       :dpvo-legal/CH :dpvo-legal/EasternEurope :dpvo-legal/FI
                       :dpvo-legal/PL :dpvo-legal/FR :dpvo-legal/CZ
                       :dpvo-legal/LU :dpvo-legal/SJ :dpvo-legal/AX
                       :dpvo-legal/HU :dpvo-legal/DE :dpvo-legal/Sark
                       :dpvo-legal/MK :dpvo-legal/IT :dpvo-legal/MC
                       :dpvo-legal/BE :dpvo-legal/VA :dpvo-legal/SE
                       :dpvo-legal/SK :dpvo-legal/PT :dpvo-legal/HR
                       :dpvo-legal/BA :dpvo-legal/SI :dpvo-legal/GB
                       :dpvo-legal/GG :dpvo-legal/DK :dpvo-legal/SM
                       :dpvo-legal/SouthernEurope :dpvo-legal/AL :dpvo-legal/NO
                       :dpvo-legal/IE :dpvo-legal/ES :dpvo-legal/NorthernEurope
                       :dpvo-legal/AD :dpvo-legal/LV :dpvo-legal/ME
                       :dpvo-legal/RS :dpvo-legal/RO :dpvo-legal/RU
                       :dpvo-legal/MD :dpvo-legal/GI},
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Europe"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def FI
  {:db/ident               :dpvo-legal/FI,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/Europe :dpvo-legal/NorthernEurope},
   :dpvo-legal/iso_alpha2  "FI",
   :dpvo-legal/iso_alpha3  "FIN",
   :dpvo-legal/iso_numeric "246",
   :dpvo-legal/un_m49      "246",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-FI,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Finland"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def FJ
  {:db/ident              :dpvo-legal/FJ,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Melanesia :dpvo-legal/Oceania},
   :dpvo-legal/iso_alpha2 "FJ",
   :dpvo-legal/iso_alpha3 "FJI",
   :dpvo-legal/iso_numeric "242",
   :dpvo-legal/un_m49     "242",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Fiji"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def FK
  {:db/ident              :dpvo-legal/FK,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/SouthAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "FK",
   :dpvo-legal/iso_alpha3 "FLK",
   :dpvo-legal/iso_numeric "238",
   :dpvo-legal/un_m49     "238",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Falkland Islands (Malvinas)"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def FM
  {:db/ident              :dpvo-legal/FM,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Oceania :dpvo-legal/Micronesia},
   :dpvo-legal/iso_alpha2 "FM",
   :dpvo-legal/iso_alpha3 "FSM",
   :dpvo-legal/iso_numeric "583",
   :dpvo-legal/un_m49     "583",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Micronesia (Federated States of)"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def FO
  {:db/ident              :dpvo-legal/FO,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Europe :dpvo-legal/NorthernEurope},
   :dpvo-legal/iso_alpha2 "FO",
   :dpvo-legal/iso_alpha3 "FRO",
   :dpvo-legal/iso_numeric "234",
   :dpvo-legal/un_m49     "234",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Faroe Islands"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def FR
  {:db/ident               :dpvo-legal/FR,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/WesternEurope :dpvo-legal/Europe},
   :dpvo-legal/iso_alpha2  "FR",
   :dpvo-legal/iso_alpha3  "FRA",
   :dpvo-legal/iso_numeric "250",
   :dpvo-legal/un_m49      "250",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-FR,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "France"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def GA
  {:db/ident              :dpvo-legal/GA,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/MiddleAfrica
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "GA",
   :dpvo-legal/iso_alpha3 "GAB",
   :dpvo-legal/iso_numeric "266",
   :dpvo-legal/un_m49     "266",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Gabon"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def GB
  {:db/ident :dpvo-legal/GB,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart #{:dpvo-legal/EEA31 :dpvo-legal/EU28},
   :dcterms/isPartOf #{:dpvo-legal/Europe :dpvo-legal/NorthernEurope},
   :dpvo-legal/iso_alpha2 "GB",
   :dpvo-legal/iso_alpha3 "GBR",
   :dpvo-legal/iso_numeric "826",
   :dpvo-legal/un_m49 "826",
   :dpvo/hasApplicableLaw #{:dpvo-legal/GB-DPA :dpvo-legal/GB-GDPR},
   :dpvo/hasAuthority :dpvo-legal/DPA-GB,
   :rdf/type #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "United Kingdom of Great Britain and Northern Ireland"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def GB-DPA
  {:db/ident :dpvo-legal/GB-DPA,
   :dcterms/created #inst "2022-07-20T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/modified #inst "2022-10-14T00:00:00.000-00:00",
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #inst "2018-05-25T00:00:00.000-00:00"}},
   :dpvo/hasJurisdiction :dpvo-legal/GB,
   :foaf/homepage {:xsd/anyURI
                   "https://www.legislation.gov.uk/ukpga/2018/12/contents"},
   :rdf/type #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Data Protection Act (DPA)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def GB-GDPR
  {:db/ident :dpvo-legal/GB-GDPR,
   :dcterms/created #inst "2022-07-20T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/modified #inst "2022-10-14T00:00:00.000-00:00",
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #inst "2019-02-28T00:00:00.000-00:00"}},
   :dpvo/hasJurisdiction :dpvo-legal/GB,
   :foaf/homepage {:xsd/anyURI
                   "https://www.legislation.gov.uk/eur/2016/679/contents"},
   :rdf/type #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "General Data Protection Regulation (GDPR)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "modified"}})

(def GD
  {:db/ident              :dpvo-legal/GD,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "GD",
   :dpvo-legal/iso_alpha3 "GRD",
   :dpvo-legal/iso_numeric "308",
   :dpvo-legal/un_m49     "308",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Grenada"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def GE
  {:db/ident              :dpvo-legal/GE,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/WesternAsia},
   :dpvo-legal/iso_alpha2 "GE",
   :dpvo-legal/iso_alpha3 "GEO",
   :dpvo-legal/iso_numeric "268",
   :dpvo-legal/un_m49     "268",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Georgia"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def GF
  {:db/ident              :dpvo-legal/GF,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/SouthAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "GF",
   :dpvo-legal/iso_alpha3 "GUF",
   :dpvo-legal/iso_numeric "254",
   :dpvo-legal/un_m49     "254",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "French Guiana"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def GG
  {:db/ident              :dpvo-legal/GG,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/ChannelIslands :dpvo-legal/Europe
                            :dpvo-legal/NorthernEurope},
   :dpvo-legal/iso_alpha2 "GG",
   :dpvo-legal/iso_alpha3 "GGY",
   :dpvo-legal/iso_numeric "831",
   :dpvo-legal/un_m49     "831",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Guernsey"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def GH
  {:db/ident              :dpvo-legal/GH,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/WesternAfrica :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "GH",
   :dpvo-legal/iso_alpha3 "GHA",
   :dpvo-legal/iso_numeric "288",
   :dpvo-legal/un_m49     "288",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Ghana"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def GI
  {:db/ident              :dpvo-legal/GI,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Europe :dpvo-legal/SouthernEurope},
   :dpvo-legal/iso_alpha2 "GI",
   :dpvo-legal/iso_alpha3 "GIB",
   :dpvo-legal/iso_numeric "292",
   :dpvo-legal/un_m49     "292",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Gibraltar"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def GL
  {:db/ident              :dpvo-legal/GL,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Americas :dpvo-legal/NorthernAmerica},
   :dpvo-legal/iso_alpha2 "GL",
   :dpvo-legal/iso_alpha3 "GRL",
   :dpvo-legal/iso_numeric "304",
   :dpvo-legal/un_m49     "304",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Greenland"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def GM
  {:db/ident              :dpvo-legal/GM,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/WesternAfrica :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "GM",
   :dpvo-legal/iso_alpha3 "GMB",
   :dpvo-legal/iso_numeric "270",
   :dpvo-legal/un_m49     "270",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Gambia"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def GN
  {:db/ident              :dpvo-legal/GN,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/WesternAfrica :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "GN",
   :dpvo-legal/iso_alpha3 "GIN",
   :dpvo-legal/iso_numeric "324",
   :dpvo-legal/un_m49     "324",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Guinea"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def GP
  {:db/ident              :dpvo-legal/GP,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "GP",
   :dpvo-legal/iso_alpha3 "GLP",
   :dpvo-legal/iso_numeric "312",
   :dpvo-legal/un_m49     "312",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Guadeloupe"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def GQ
  {:db/ident              :dpvo-legal/GQ,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/MiddleAfrica
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "GQ",
   :dpvo-legal/iso_alpha3 "GNQ",
   :dpvo-legal/iso_numeric "226",
   :dpvo-legal/un_m49     "226",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Equatorial Guinea"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def GR
  {:db/ident               :dpvo-legal/GR,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/Europe :dpvo-legal/SouthernEurope},
   :dpvo-legal/iso_alpha2  "GR",
   :dpvo-legal/iso_alpha3  "GRC",
   :dpvo-legal/iso_numeric "300",
   :dpvo-legal/un_m49      "300",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-GR,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Greece"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def GS
  {:db/ident              :dpvo-legal/GS,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/SouthAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "GS",
   :dpvo-legal/iso_alpha3 "SGS",
   :dpvo-legal/iso_numeric "239",
   :dpvo-legal/un_m49     "239",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value
                           "South Georgia and the South Sandwich Islands"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def GT
  {:db/ident              :dpvo-legal/GT,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/CentralAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "GT",
   :dpvo-legal/iso_alpha3 "GTM",
   :dpvo-legal/iso_numeric "320",
   :dpvo-legal/un_m49     "320",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Guatemala"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def GU
  {:db/ident              :dpvo-legal/GU,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Oceania :dpvo-legal/Micronesia},
   :dpvo-legal/iso_alpha2 "GU",
   :dpvo-legal/iso_alpha3 "GUM",
   :dpvo-legal/iso_numeric "316",
   :dpvo-legal/un_m49     "316",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Guam"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def GW
  {:db/ident              :dpvo-legal/GW,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/WesternAfrica :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "GW",
   :dpvo-legal/iso_alpha3 "GNB",
   :dpvo-legal/iso_numeric "624",
   :dpvo-legal/un_m49     "624",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Guinea-Bissau"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def GY
  {:db/ident              :dpvo-legal/GY,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/SouthAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "GY",
   :dpvo-legal/iso_alpha3 "GUY",
   :dpvo-legal/iso_numeric "328",
   :dpvo-legal/un_m49     "328",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Guyana"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def HK
  {:db/ident              :dpvo-legal/HK,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/EasternAsia},
   :dpvo-legal/iso_alpha2 "HK",
   :dpvo-legal/iso_alpha3 "HKG",
   :dpvo-legal/iso_numeric "344",
   :dpvo-legal/un_m49     "344",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value
                           "China, Hong Kong Special Administrative Region"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def HM
  {:db/ident              :dpvo-legal/HM,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Oceania
                            :dpvo-legal/AustraliaandNewZealand},
   :dpvo-legal/iso_alpha2 "HM",
   :dpvo-legal/iso_alpha3 "HMD",
   :dpvo-legal/iso_numeric "334",
   :dpvo-legal/un_m49     "334",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Heard Island and McDonald Islands"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def HN
  {:db/ident              :dpvo-legal/HN,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/CentralAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "HN",
   :dpvo-legal/iso_alpha3 "HND",
   :dpvo-legal/iso_numeric "340",
   :dpvo-legal/un_m49     "340",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Honduras"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def HR
  {:db/ident               :dpvo-legal/HR,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/Europe :dpvo-legal/SouthernEurope},
   :dpvo-legal/iso_alpha2  "HR",
   :dpvo-legal/iso_alpha3  "HRV",
   :dpvo-legal/iso_numeric "191",
   :dpvo-legal/un_m49      "191",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-HR,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Croatia"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def HT
  {:db/ident              :dpvo-legal/HT,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "HT",
   :dpvo-legal/iso_alpha3 "HTI",
   :dpvo-legal/iso_numeric "332",
   :dpvo-legal/un_m49     "332",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Haiti"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def HU
  {:db/ident               :dpvo-legal/HU,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/EasternEurope :dpvo-legal/Europe},
   :dpvo-legal/iso_alpha2  "HU",
   :dpvo-legal/iso_alpha3  "HUN",
   :dpvo-legal/iso_numeric "348",
   :dpvo-legal/un_m49      "348",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-HU,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Hungary"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def ID
  {:db/ident              :dpvo-legal/ID,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/SoutheasternAsia},
   :dpvo-legal/iso_alpha2 "ID",
   :dpvo-legal/iso_alpha3 "IDN",
   :dpvo-legal/iso_numeric "360",
   :dpvo-legal/un_m49     "360",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Indonesia"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def IE
  {:db/ident               :dpvo-legal/IE,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/Europe :dpvo-legal/NorthernEurope},
   :dpvo-legal/iso_alpha2  "IE",
   :dpvo-legal/iso_alpha3  "IRL",
   :dpvo-legal/iso_numeric "372",
   :dpvo-legal/un_m49      "372",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-IE,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Ireland"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def IL
  {:db/ident              :dpvo-legal/IL,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/WesternAsia},
   :dpvo-legal/iso_alpha2 "IL",
   :dpvo-legal/iso_alpha3 "ISR",
   :dpvo-legal/iso_numeric "376",
   :dpvo-legal/un_m49     "376",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Israel"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def IM
  {:db/ident              :dpvo-legal/IM,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Europe :dpvo-legal/NorthernEurope},
   :dpvo-legal/iso_alpha2 "IM",
   :dpvo-legal/iso_alpha3 "IMN",
   :dpvo-legal/iso_numeric "833",
   :dpvo-legal/un_m49     "833",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Isle of Man"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def IN
  {:db/ident              :dpvo-legal/IN,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/SouthernAsia :dpvo-legal/Asia},
   :dpvo-legal/iso_alpha2 "IN",
   :dpvo-legal/iso_alpha3 "IND",
   :dpvo-legal/iso_numeric "356",
   :dpvo-legal/un_m49     "356",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "India"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def IO
  {:db/ident              :dpvo-legal/IO,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica},
   :dpvo-legal/iso_alpha2 "IO",
   :dpvo-legal/iso_alpha3 "IOT",
   :dpvo-legal/iso_numeric "86",
   :dpvo-legal/un_m49     "86",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "British Indian Ocean Territory"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def IQ
  {:db/ident              :dpvo-legal/IQ,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/WesternAsia},
   :dpvo-legal/iso_alpha2 "IQ",
   :dpvo-legal/iso_alpha3 "IRQ",
   :dpvo-legal/iso_numeric "368",
   :dpvo-legal/un_m49     "368",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Iraq"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def IR
  {:db/ident              :dpvo-legal/IR,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/SouthernAsia :dpvo-legal/Asia},
   :dpvo-legal/iso_alpha2 "IR",
   :dpvo-legal/iso_alpha3 "IRN",
   :dpvo-legal/iso_numeric "364",
   :dpvo-legal/un_m49     "364",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Iran (Islamic Republic of)"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def IS
  {:db/ident               :dpvo-legal/IS,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       #{:dpvo-legal/Europe :dpvo-legal/NorthernEurope},
   :dpvo-legal/iso_alpha2  "IS",
   :dpvo-legal/iso_alpha3  "ISL",
   :dpvo-legal/iso_numeric "352",
   :dpvo-legal/un_m49      "352",
   :dpvo/hasAuthority      :dpvo-legal/DPA-IS,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Iceland"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def IT
  {:db/ident               :dpvo-legal/IT,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/Europe :dpvo-legal/SouthernEurope},
   :dpvo-legal/iso_alpha2  "IT",
   :dpvo-legal/iso_alpha3  "ITA",
   :dpvo-legal/iso_numeric "380",
   :dpvo-legal/un_m49      "380",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-IT,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Italy"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def JE
  {:db/ident              :dpvo-legal/JE,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/ChannelIslands :dpvo-legal/Europe
                            :dpvo-legal/NorthernEurope},
   :dpvo-legal/iso_alpha2 "JE",
   :dpvo-legal/iso_alpha3 "JEY",
   :dpvo-legal/iso_numeric "832",
   :dpvo-legal/un_m49     "832",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Jersey"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def JM
  {:db/ident              :dpvo-legal/JM,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "JM",
   :dpvo-legal/iso_alpha3 "JAM",
   :dpvo-legal/iso_numeric "388",
   :dpvo-legal/un_m49     "388",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Jamaica"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def JO
  {:db/ident              :dpvo-legal/JO,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/WesternAsia},
   :dpvo-legal/iso_alpha2 "JO",
   :dpvo-legal/iso_alpha3 "JOR",
   :dpvo-legal/iso_numeric "400",
   :dpvo-legal/un_m49     "400",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Jordan"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def JP
  {:db/ident              :dpvo-legal/JP,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/EasternAsia},
   :dpvo-legal/iso_alpha2 "JP",
   :dpvo-legal/iso_alpha3 "JPN",
   :dpvo-legal/iso_numeric "392",
   :dpvo-legal/un_m49     "392",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Japan"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def KE
  {:db/ident              :dpvo-legal/KE,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica},
   :dpvo-legal/iso_alpha2 "KE",
   :dpvo-legal/iso_alpha3 "KEN",
   :dpvo-legal/iso_numeric "404",
   :dpvo-legal/un_m49     "404",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Kenya"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def KG
  {:db/ident              :dpvo-legal/KG,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/CentralAsia :dpvo-legal/Asia},
   :dpvo-legal/iso_alpha2 "KG",
   :dpvo-legal/iso_alpha3 "KGZ",
   :dpvo-legal/iso_numeric "417",
   :dpvo-legal/un_m49     "417",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Kyrgyzstan"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def KH
  {:db/ident              :dpvo-legal/KH,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/SoutheasternAsia},
   :dpvo-legal/iso_alpha2 "KH",
   :dpvo-legal/iso_alpha3 "KHM",
   :dpvo-legal/iso_numeric "116",
   :dpvo-legal/un_m49     "116",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Cambodia"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def KI
  {:db/ident              :dpvo-legal/KI,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Oceania :dpvo-legal/Micronesia},
   :dpvo-legal/iso_alpha2 "KI",
   :dpvo-legal/iso_alpha3 "KIR",
   :dpvo-legal/iso_numeric "296",
   :dpvo-legal/un_m49     "296",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Kiribati"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def KM
  {:db/ident              :dpvo-legal/KM,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica},
   :dpvo-legal/iso_alpha2 "KM",
   :dpvo-legal/iso_alpha3 "COM",
   :dpvo-legal/iso_numeric "174",
   :dpvo-legal/un_m49     "174",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Comoros"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def KN
  {:db/ident              :dpvo-legal/KN,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "KN",
   :dpvo-legal/iso_alpha3 "KNA",
   :dpvo-legal/iso_numeric "659",
   :dpvo-legal/un_m49     "659",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Saint Kitts and Nevis"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def KP
  {:db/ident              :dpvo-legal/KP,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/EasternAsia},
   :dpvo-legal/iso_alpha2 "KP",
   :dpvo-legal/iso_alpha3 "PRK",
   :dpvo-legal/iso_numeric "408",
   :dpvo-legal/un_m49     "408",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value "Democratic People's Republic of Korea"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def KR
  {:db/ident              :dpvo-legal/KR,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/EasternAsia},
   :dpvo-legal/iso_alpha2 "KR",
   :dpvo-legal/iso_alpha3 "KOR",
   :dpvo-legal/iso_numeric "410",
   :dpvo-legal/un_m49     "410",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Republic of Korea"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def KW
  {:db/ident              :dpvo-legal/KW,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/WesternAsia},
   :dpvo-legal/iso_alpha2 "KW",
   :dpvo-legal/iso_alpha3 "KWT",
   :dpvo-legal/iso_numeric "414",
   :dpvo-legal/un_m49     "414",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Kuwait"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def KY
  {:db/ident              :dpvo-legal/KY,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "KY",
   :dpvo-legal/iso_alpha3 "CYM",
   :dpvo-legal/iso_numeric "136",
   :dpvo-legal/un_m49     "136",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Cayman Islands"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def KZ
  {:db/ident              :dpvo-legal/KZ,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/CentralAsia :dpvo-legal/Asia},
   :dpvo-legal/iso_alpha2 "KZ",
   :dpvo-legal/iso_alpha3 "KAZ",
   :dpvo-legal/iso_numeric "398",
   :dpvo-legal/un_m49     "398",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Kazakhstan"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def LA
  {:db/ident              :dpvo-legal/LA,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/SoutheasternAsia},
   :dpvo-legal/iso_alpha2 "LA",
   :dpvo-legal/iso_alpha3 "LAO",
   :dpvo-legal/iso_numeric "418",
   :dpvo-legal/un_m49     "418",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Lao People's Democratic Republic"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def LB
  {:db/ident              :dpvo-legal/LB,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/WesternAsia},
   :dpvo-legal/iso_alpha2 "LB",
   :dpvo-legal/iso_alpha3 "LBN",
   :dpvo-legal/iso_numeric "422",
   :dpvo-legal/un_m49     "422",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Lebanon"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def LC
  {:db/ident              :dpvo-legal/LC,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "LC",
   :dpvo-legal/iso_alpha3 "LCA",
   :dpvo-legal/iso_numeric "662",
   :dpvo-legal/un_m49     "662",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Saint Lucia"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def LI
  {:db/ident               :dpvo-legal/LI,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       #{:dpvo-legal/WesternEurope :dpvo-legal/Europe},
   :dpvo-legal/iso_alpha2  "LI",
   :dpvo-legal/iso_alpha3  "LIE",
   :dpvo-legal/iso_numeric "438",
   :dpvo-legal/un_m49      "438",
   :dpvo/hasAuthority      :dpvo-legal/DPV-LI,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Liechtenstein"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def LK
  {:db/ident              :dpvo-legal/LK,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/SouthernAsia :dpvo-legal/Asia},
   :dpvo-legal/iso_alpha2 "LK",
   :dpvo-legal/iso_alpha3 "LKA",
   :dpvo-legal/iso_numeric "144",
   :dpvo-legal/un_m49     "144",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Sri Lanka"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def LR
  {:db/ident              :dpvo-legal/LR,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/WesternAfrica :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "LR",
   :dpvo-legal/iso_alpha3 "LBR",
   :dpvo-legal/iso_numeric "430",
   :dpvo-legal/un_m49     "430",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Liberia"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def LS
  {:db/ident              :dpvo-legal/LS,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SouthernAfrica
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "LS",
   :dpvo-legal/iso_alpha3 "LSO",
   :dpvo-legal/iso_numeric "426",
   :dpvo-legal/un_m49     "426",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Lesotho"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def LT
  {:db/ident               :dpvo-legal/LT,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/Europe :dpvo-legal/NorthernEurope},
   :dpvo-legal/iso_alpha2  "LT",
   :dpvo-legal/iso_alpha3  "LTU",
   :dpvo-legal/iso_numeric "440",
   :dpvo-legal/un_m49      "440",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-LT,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Lithuania"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def LU
  {:db/ident               :dpvo-legal/LU,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/WesternEurope :dpvo-legal/Europe},
   :dpvo-legal/iso_alpha2  "LU",
   :dpvo-legal/iso_alpha3  "LUX",
   :dpvo-legal/iso_numeric "442",
   :dpvo-legal/un_m49      "442",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-LU,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Luxembourg"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def LV
  {:db/ident               :dpvo-legal/LV,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/Europe :dpvo-legal/NorthernEurope},
   :dpvo-legal/iso_alpha2  "LV",
   :dpvo-legal/iso_alpha3  "LVA",
   :dpvo-legal/iso_numeric "428",
   :dpvo-legal/un_m49      "428",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-LV,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Latvia"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def LY
  {:db/ident              :dpvo-legal/LY,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/NorthernAfrica},
   :dpvo-legal/iso_alpha2 "LY",
   :dpvo-legal/iso_alpha3 "LBY",
   :dpvo-legal/iso_numeric "434",
   :dpvo-legal/un_m49     "434",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Libya"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def LatinAmericaandtheCaribbean
  {:db/ident         :dpvo-legal/LatinAmericaandtheCaribbean,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/SV :dpvo-legal/JM :dpvo-legal/GD
                       :dpvo-legal/BR :dpvo-legal/DM :dpvo-legal/BB
                       :dpvo-legal/UY :dpvo-legal/FK :dpvo-legal/AG
                       :dpvo-legal/GS :dpvo-legal/AW :dpvo-legal/KY
                       :dpvo-legal/MQ :dpvo-legal/LC :dpvo-legal/GF
                       :dpvo-legal/VI :dpvo-legal/BS :dpvo-legal/SX
                       :dpvo-legal/TT :dpvo-legal/MS :dpvo-legal/PA
                       :dpvo-legal/BV :dpvo-legal/GY :dpvo-legal/Caribbean
                       :dpvo-legal/CW :dpvo-legal/GP :dpvo-legal/VE
                       :dpvo-legal/PR :dpvo-legal/SouthAmerica :dpvo-legal/CL
                       :dpvo-legal/NI :dpvo-legal/BQ :dpvo-legal/BZ
                       :dpvo-legal/AR :dpvo-legal/CentralAmerica :dpvo-legal/GT
                       :dpvo-legal/CO :dpvo-legal/DO :dpvo-legal/TC
                       :dpvo-legal/PY :dpvo-legal/HN :dpvo-legal/PE
                       :dpvo-legal/EC :dpvo-legal/CU :dpvo-legal/HT
                       :dpvo-legal/MF :dpvo-legal/CR :dpvo-legal/AI
                       :dpvo-legal/BL :dpvo-legal/VC :dpvo-legal/SR
                       :dpvo-legal/BO :dpvo-legal/KN :dpvo-legal/MX
                       :dpvo-legal/VG},
   :dcterms/isPartOf :dpvo-legal/Americas,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "LatinAmericaandtheCaribbean"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def MA
  {:db/ident              :dpvo-legal/MA,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/NorthernAfrica},
   :dpvo-legal/iso_alpha2 "MA",
   :dpvo-legal/iso_alpha3 "MAR",
   :dpvo-legal/iso_numeric "504",
   :dpvo-legal/un_m49     "504",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Morocco"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def MC
  {:db/ident              :dpvo-legal/MC,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/WesternEurope :dpvo-legal/Europe},
   :dpvo-legal/iso_alpha2 "MC",
   :dpvo-legal/iso_alpha3 "MCO",
   :dpvo-legal/iso_numeric "492",
   :dpvo-legal/un_m49     "492",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Monaco"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def MD
  {:db/ident              :dpvo-legal/MD,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/EasternEurope :dpvo-legal/Europe},
   :dpvo-legal/iso_alpha2 "MD",
   :dpvo-legal/iso_alpha3 "MDA",
   :dpvo-legal/iso_numeric "498",
   :dpvo-legal/un_m49     "498",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Republic of Moldova"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def ME
  {:db/ident              :dpvo-legal/ME,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Europe :dpvo-legal/SouthernEurope},
   :dpvo-legal/iso_alpha2 "ME",
   :dpvo-legal/iso_alpha3 "MNE",
   :dpvo-legal/iso_numeric "499",
   :dpvo-legal/un_m49     "499",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Montenegro"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def MF
  {:db/ident              :dpvo-legal/MF,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "MF",
   :dpvo-legal/iso_alpha3 "MAF",
   :dpvo-legal/iso_numeric "663",
   :dpvo-legal/un_m49     "663",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Saint Martin (French Part)"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def MG
  {:db/ident              :dpvo-legal/MG,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica},
   :dpvo-legal/iso_alpha2 "MG",
   :dpvo-legal/iso_alpha3 "MDG",
   :dpvo-legal/iso_numeric "450",
   :dpvo-legal/un_m49     "450",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Madagascar"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def MH
  {:db/ident              :dpvo-legal/MH,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Oceania :dpvo-legal/Micronesia},
   :dpvo-legal/iso_alpha2 "MH",
   :dpvo-legal/iso_alpha3 "MHL",
   :dpvo-legal/iso_numeric "584",
   :dpvo-legal/un_m49     "584",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Marshall Islands"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def MK
  {:db/ident              :dpvo-legal/MK,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Europe :dpvo-legal/SouthernEurope},
   :dpvo-legal/iso_alpha2 "MK",
   :dpvo-legal/iso_alpha3 "MKD",
   :dpvo-legal/iso_numeric "807",
   :dpvo-legal/un_m49     "807",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "North Macedonia"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def ML
  {:db/ident              :dpvo-legal/ML,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/WesternAfrica :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "ML",
   :dpvo-legal/iso_alpha3 "MLI",
   :dpvo-legal/iso_numeric "466",
   :dpvo-legal/un_m49     "466",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Mali"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def MM
  {:db/ident              :dpvo-legal/MM,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/SoutheasternAsia},
   :dpvo-legal/iso_alpha2 "MM",
   :dpvo-legal/iso_alpha3 "MMR",
   :dpvo-legal/iso_numeric "104",
   :dpvo-legal/un_m49     "104",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Myanmar"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def MN
  {:db/ident              :dpvo-legal/MN,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/EasternAsia},
   :dpvo-legal/iso_alpha2 "MN",
   :dpvo-legal/iso_alpha3 "MNG",
   :dpvo-legal/iso_numeric "496",
   :dpvo-legal/un_m49     "496",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Mongolia"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def MO
  {:db/ident              :dpvo-legal/MO,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/EasternAsia},
   :dpvo-legal/iso_alpha2 "MO",
   :dpvo-legal/iso_alpha3 "MAC",
   :dpvo-legal/iso_numeric "446",
   :dpvo-legal/un_m49     "446",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value
                           "China, Macao Special Administrative Region"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def MP
  {:db/ident              :dpvo-legal/MP,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Oceania :dpvo-legal/Micronesia},
   :dpvo-legal/iso_alpha2 "MP",
   :dpvo-legal/iso_alpha3 "MNP",
   :dpvo-legal/iso_numeric "580",
   :dpvo-legal/un_m49     "580",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Northern Mariana Islands"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def MQ
  {:db/ident              :dpvo-legal/MQ,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "MQ",
   :dpvo-legal/iso_alpha3 "MTQ",
   :dpvo-legal/iso_numeric "474",
   :dpvo-legal/un_m49     "474",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Martinique"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def MR
  {:db/ident              :dpvo-legal/MR,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/WesternAfrica :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "MR",
   :dpvo-legal/iso_alpha3 "MRT",
   :dpvo-legal/iso_numeric "478",
   :dpvo-legal/un_m49     "478",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Mauritania"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def MS
  {:db/ident              :dpvo-legal/MS,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "MS",
   :dpvo-legal/iso_alpha3 "MSR",
   :dpvo-legal/iso_numeric "500",
   :dpvo-legal/un_m49     "500",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Montserrat"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def MT
  {:db/ident               :dpvo-legal/MT,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/Europe :dpvo-legal/SouthernEurope},
   :dpvo-legal/iso_alpha2  "MT",
   :dpvo-legal/iso_alpha3  "MLT",
   :dpvo-legal/iso_numeric "470",
   :dpvo-legal/un_m49      "470",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-MT,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Malta"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def MU
  {:db/ident              :dpvo-legal/MU,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica},
   :dpvo-legal/iso_alpha2 "MU",
   :dpvo-legal/iso_alpha3 "MUS",
   :dpvo-legal/iso_numeric "480",
   :dpvo-legal/un_m49     "480",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Mauritius"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def MV
  {:db/ident              :dpvo-legal/MV,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/SouthernAsia :dpvo-legal/Asia},
   :dpvo-legal/iso_alpha2 "MV",
   :dpvo-legal/iso_alpha3 "MDV",
   :dpvo-legal/iso_numeric "462",
   :dpvo-legal/un_m49     "462",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Maldives"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def MW
  {:db/ident              :dpvo-legal/MW,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica},
   :dpvo-legal/iso_alpha2 "MW",
   :dpvo-legal/iso_alpha3 "MWI",
   :dpvo-legal/iso_numeric "454",
   :dpvo-legal/un_m49     "454",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Malawi"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def MX
  {:db/ident              :dpvo-legal/MX,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/CentralAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "MX",
   :dpvo-legal/iso_alpha3 "MEX",
   :dpvo-legal/iso_numeric "484",
   :dpvo-legal/un_m49     "484",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Mexico"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def MY
  {:db/ident              :dpvo-legal/MY,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/SoutheasternAsia},
   :dpvo-legal/iso_alpha2 "MY",
   :dpvo-legal/iso_alpha3 "MYS",
   :dpvo-legal/iso_numeric "458",
   :dpvo-legal/un_m49     "458",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Malaysia"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def MZ
  {:db/ident              :dpvo-legal/MZ,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica},
   :dpvo-legal/iso_alpha2 "MZ",
   :dpvo-legal/iso_alpha3 "MOZ",
   :dpvo-legal/iso_numeric "508",
   :dpvo-legal/un_m49     "508",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Mozambique"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def Melanesia
  {:db/ident         :dpvo-legal/Melanesia,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/FJ :dpvo-legal/NC :dpvo-legal/SB
                       :dpvo-legal/PG :dpvo-legal/VU},
   :dcterms/isPartOf :dpvo-legal/Oceania,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Melanesia"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def Micronesia
  {:db/ident         :dpvo-legal/Micronesia,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/UM :dpvo-legal/PW :dpvo-legal/MP
                       :dpvo-legal/GU :dpvo-legal/FM :dpvo-legal/MH
                       :dpvo-legal/NR :dpvo-legal/KI},
   :dcterms/isPartOf :dpvo-legal/Oceania,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Micronesia"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def MiddleAfrica
  {:db/ident         :dpvo-legal/MiddleAfrica,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/CF :dpvo-legal/CM :dpvo-legal/CG
                       :dpvo-legal/TD :dpvo-legal/GQ :dpvo-legal/AO
                       :dpvo-legal/CD :dpvo-legal/GA :dpvo-legal/ST},
   :dcterms/isPartOf :dpvo-legal/SubSaharanAfrica,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "MiddleAfrica"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def NA
  {:db/ident              :dpvo-legal/NA,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SouthernAfrica
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "NA",
   :dpvo-legal/iso_alpha3 "NAM",
   :dpvo-legal/iso_numeric "516",
   :dpvo-legal/un_m49     "516",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Namibia"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def NC
  {:db/ident              :dpvo-legal/NC,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Melanesia :dpvo-legal/Oceania},
   :dpvo-legal/iso_alpha2 "NC",
   :dpvo-legal/iso_alpha3 "NCL",
   :dpvo-legal/iso_numeric "540",
   :dpvo-legal/un_m49     "540",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "New Caledonia"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def NE
  {:db/ident              :dpvo-legal/NE,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/WesternAfrica :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "NE",
   :dpvo-legal/iso_alpha3 "NER",
   :dpvo-legal/iso_numeric "562",
   :dpvo-legal/un_m49     "562",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Niger"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def NF
  {:db/ident              :dpvo-legal/NF,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Oceania
                            :dpvo-legal/AustraliaandNewZealand},
   :dpvo-legal/iso_alpha2 "NF",
   :dpvo-legal/iso_alpha3 "NFK",
   :dpvo-legal/iso_numeric "574",
   :dpvo-legal/un_m49     "574",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Norfolk Island"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def NG
  {:db/ident              :dpvo-legal/NG,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/WesternAfrica :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "NG",
   :dpvo-legal/iso_alpha3 "NGA",
   :dpvo-legal/iso_numeric "566",
   :dpvo-legal/un_m49     "566",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Nigeria"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def NI
  {:db/ident              :dpvo-legal/NI,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/CentralAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "NI",
   :dpvo-legal/iso_alpha3 "NIC",
   :dpvo-legal/iso_numeric "558",
   :dpvo-legal/un_m49     "558",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Nicaragua"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def NL
  {:db/ident               :dpvo-legal/NL,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/WesternEurope :dpvo-legal/Europe},
   :dpvo-legal/iso_alpha2  "NL",
   :dpvo-legal/iso_alpha3  "NLD",
   :dpvo-legal/iso_numeric "528",
   :dpvo-legal/un_m49      "528",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-NL,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Netherlands"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def NO
  {:db/ident               :dpvo-legal/NO,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf       #{:dpvo-legal/Europe :dpvo-legal/NorthernEurope},
   :dpvo-legal/iso_alpha2  "NO",
   :dpvo-legal/iso_alpha3  "NOR",
   :dpvo-legal/iso_numeric "578",
   :dpvo-legal/un_m49      "578",
   :dpvo/hasAuthority      :dpvo-legal/DPV-NO,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Norway"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def NP
  {:db/ident              :dpvo-legal/NP,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/SouthernAsia :dpvo-legal/Asia},
   :dpvo-legal/iso_alpha2 "NP",
   :dpvo-legal/iso_alpha3 "NPL",
   :dpvo-legal/iso_numeric "524",
   :dpvo-legal/un_m49     "524",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Nepal"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def NR
  {:db/ident              :dpvo-legal/NR,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Oceania :dpvo-legal/Micronesia},
   :dpvo-legal/iso_alpha2 "NR",
   :dpvo-legal/iso_alpha3 "NRU",
   :dpvo-legal/iso_numeric "520",
   :dpvo-legal/un_m49     "520",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Nauru"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def NU
  {:db/ident              :dpvo-legal/NU,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Polynesia :dpvo-legal/Oceania},
   :dpvo-legal/iso_alpha2 "NU",
   :dpvo-legal/iso_alpha3 "NIU",
   :dpvo-legal/iso_numeric "570",
   :dpvo-legal/un_m49     "570",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Niue"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def NZ
  {:db/ident              :dpvo-legal/NZ,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Oceania
                            :dpvo-legal/AustraliaandNewZealand},
   :dpvo-legal/iso_alpha2 "NZ",
   :dpvo-legal/iso_alpha3 "NZL",
   :dpvo-legal/iso_numeric "554",
   :dpvo-legal/un_m49     "554",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "New Zealand"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def NorthernAfrica
  {:db/ident         :dpvo-legal/NorthernAfrica,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/TN :dpvo-legal/DZ :dpvo-legal/EG
                       :dpvo-legal/EH :dpvo-legal/SD :dpvo-legal/LY
                       :dpvo-legal/MA},
   :dcterms/isPartOf :dpvo-legal/Africa,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "NorthernAfrica"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def NorthernAmerica
  {:db/ident         :dpvo-legal/NorthernAmerica,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/US :dpvo-legal/GL :dpvo-legal/BM
                       :dpvo-legal/CA :dpvo-legal/PM},
   :dcterms/isPartOf :dpvo-legal/Americas,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "NorthernAmerica"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def NorthernEurope
  {:db/ident         :dpvo-legal/NorthernEurope,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/IS :dpvo-legal/JE :dpvo-legal/ChannelIslands
                       :dpvo-legal/LT :dpvo-legal/EE :dpvo-legal/IM
                       :dpvo-legal/FO :dpvo-legal/FI :dpvo-legal/SJ
                       :dpvo-legal/AX :dpvo-legal/Sark :dpvo-legal/SE
                       :dpvo-legal/GB :dpvo-legal/GG :dpvo-legal/DK
                       :dpvo-legal/NO :dpvo-legal/IE :dpvo-legal/LV},
   :dcterms/isPartOf :dpvo-legal/Europe,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "NorthernEurope"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def OM
  {:db/ident              :dpvo-legal/OM,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/WesternAsia},
   :dpvo-legal/iso_alpha2 "OM",
   :dpvo-legal/iso_alpha3 "OMN",
   :dpvo-legal/iso_numeric "512",
   :dpvo-legal/un_m49     "512",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Oman"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def Oceania
  {:db/ident         :dpvo-legal/Oceania,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/WF :dpvo-legal/NZ :dpvo-legal/NF
                       :dpvo-legal/UM :dpvo-legal/FJ :dpvo-legal/PW
                       :dpvo-legal/NC :dpvo-legal/MP :dpvo-legal/TK
                       :dpvo-legal/GU :dpvo-legal/FM :dpvo-legal/MH
                       :dpvo-legal/Polynesia :dpvo-legal/SB :dpvo-legal/TO
                       :dpvo-legal/Melanesia :dpvo-legal/PG :dpvo-legal/PF
                       :dpvo-legal/NU :dpvo-legal/NR :dpvo-legal/AU
                       :dpvo-legal/VU :dpvo-legal/CC :dpvo-legal/WS
                       :dpvo-legal/TV :dpvo-legal/HM :dpvo-legal/Micronesia
                       :dpvo-legal/AustraliaandNewZealand :dpvo-legal/CX
                       :dpvo-legal/AS :dpvo-legal/KI :dpvo-legal/PN
                       :dpvo-legal/CK},
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Oceania"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def PA
  {:db/ident              :dpvo-legal/PA,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/CentralAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "PA",
   :dpvo-legal/iso_alpha3 "PAN",
   :dpvo-legal/iso_numeric "591",
   :dpvo-legal/un_m49     "591",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Panama"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def PE
  {:db/ident              :dpvo-legal/PE,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/SouthAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "PE",
   :dpvo-legal/iso_alpha3 "PER",
   :dpvo-legal/iso_numeric "604",
   :dpvo-legal/un_m49     "604",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Peru"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def PF
  {:db/ident              :dpvo-legal/PF,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Polynesia :dpvo-legal/Oceania},
   :dpvo-legal/iso_alpha2 "PF",
   :dpvo-legal/iso_alpha3 "PYF",
   :dpvo-legal/iso_numeric "258",
   :dpvo-legal/un_m49     "258",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "French Polynesia"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def PG
  {:db/ident              :dpvo-legal/PG,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Melanesia :dpvo-legal/Oceania},
   :dpvo-legal/iso_alpha2 "PG",
   :dpvo-legal/iso_alpha3 "PNG",
   :dpvo-legal/iso_numeric "598",
   :dpvo-legal/un_m49     "598",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Papua New Guinea"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def PH
  {:db/ident              :dpvo-legal/PH,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/SoutheasternAsia},
   :dpvo-legal/iso_alpha2 "PH",
   :dpvo-legal/iso_alpha3 "PHL",
   :dpvo-legal/iso_numeric "608",
   :dpvo-legal/un_m49     "608",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Philippines"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def PK
  {:db/ident              :dpvo-legal/PK,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/SouthernAsia :dpvo-legal/Asia},
   :dpvo-legal/iso_alpha2 "PK",
   :dpvo-legal/iso_alpha3 "PAK",
   :dpvo-legal/iso_numeric "586",
   :dpvo-legal/un_m49     "586",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Pakistan"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def PL
  {:db/ident               :dpvo-legal/PL,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/EasternEurope :dpvo-legal/Europe},
   :dpvo-legal/iso_alpha2  "PL",
   :dpvo-legal/iso_alpha3  "POL",
   :dpvo-legal/iso_numeric "616",
   :dpvo-legal/un_m49      "616",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-PL,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Poland"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def PM
  {:db/ident              :dpvo-legal/PM,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Americas :dpvo-legal/NorthernAmerica},
   :dpvo-legal/iso_alpha2 "PM",
   :dpvo-legal/iso_alpha3 "SPM",
   :dpvo-legal/iso_numeric "666",
   :dpvo-legal/un_m49     "666",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Saint Pierre and Miquelon"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def PN
  {:db/ident              :dpvo-legal/PN,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Polynesia :dpvo-legal/Oceania},
   :dpvo-legal/iso_alpha2 "PN",
   :dpvo-legal/iso_alpha3 "PCN",
   :dpvo-legal/iso_numeric "612",
   :dpvo-legal/un_m49     "612",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Pitcairn"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def PR
  {:db/ident              :dpvo-legal/PR,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "PR",
   :dpvo-legal/iso_alpha3 "PRI",
   :dpvo-legal/iso_numeric "630",
   :dpvo-legal/un_m49     "630",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Puerto Rico"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def PS
  {:db/ident              :dpvo-legal/PS,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/WesternAsia},
   :dpvo-legal/iso_alpha2 "PS",
   :dpvo-legal/iso_alpha3 "PSE",
   :dpvo-legal/iso_numeric "275",
   :dpvo-legal/un_m49     "275",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "State of Palestine"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def PT
  {:db/ident               :dpvo-legal/PT,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/Europe :dpvo-legal/SouthernEurope},
   :dpvo-legal/iso_alpha2  "PT",
   :dpvo-legal/iso_alpha3  "PRT",
   :dpvo-legal/iso_numeric "620",
   :dpvo-legal/un_m49      "620",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-PT,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Portugal"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def PW
  {:db/ident              :dpvo-legal/PW,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Oceania :dpvo-legal/Micronesia},
   :dpvo-legal/iso_alpha2 "PW",
   :dpvo-legal/iso_alpha3 "PLW",
   :dpvo-legal/iso_numeric "585",
   :dpvo-legal/un_m49     "585",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Palau"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def PY
  {:db/ident              :dpvo-legal/PY,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/SouthAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "PY",
   :dpvo-legal/iso_alpha3 "PRY",
   :dpvo-legal/iso_numeric "600",
   :dpvo-legal/un_m49     "600",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Paraguay"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def Polynesia
  {:db/ident         :dpvo-legal/Polynesia,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/WF :dpvo-legal/TK :dpvo-legal/TO
                       :dpvo-legal/PF :dpvo-legal/NU :dpvo-legal/WS
                       :dpvo-legal/TV :dpvo-legal/AS :dpvo-legal/PN
                       :dpvo-legal/CK},
   :dcterms/isPartOf :dpvo-legal/Oceania,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Polynesia"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def QA
  {:db/ident              :dpvo-legal/QA,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/WesternAsia},
   :dpvo-legal/iso_alpha2 "QA",
   :dpvo-legal/iso_alpha3 "QAT",
   :dpvo-legal/iso_numeric "634",
   :dpvo-legal/un_m49     "634",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Qatar"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def RE
  {:db/ident              :dpvo-legal/RE,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica},
   :dpvo-legal/iso_alpha2 "RE",
   :dpvo-legal/iso_alpha3 "REU",
   :dpvo-legal/iso_numeric "638",
   :dpvo-legal/un_m49     "638",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Réunion"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def RO
  {:db/ident               :dpvo-legal/RO,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/EasternEurope :dpvo-legal/Europe},
   :dpvo-legal/iso_alpha2  "RO",
   :dpvo-legal/iso_alpha3  "ROU",
   :dpvo-legal/iso_numeric "642",
   :dpvo-legal/un_m49      "642",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-RO,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Romania"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def RS
  {:db/ident              :dpvo-legal/RS,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Europe :dpvo-legal/SouthernEurope},
   :dpvo-legal/iso_alpha2 "RS",
   :dpvo-legal/iso_alpha3 "SRB",
   :dpvo-legal/iso_numeric "688",
   :dpvo-legal/un_m49     "688",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Serbia"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def RU
  {:db/ident              :dpvo-legal/RU,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/EasternEurope :dpvo-legal/Europe},
   :dpvo-legal/iso_alpha2 "RU",
   :dpvo-legal/iso_alpha3 "RUS",
   :dpvo-legal/iso_numeric "643",
   :dpvo-legal/un_m49     "643",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Russian Federation"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def RW
  {:db/ident              :dpvo-legal/RW,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica},
   :dpvo-legal/iso_alpha2 "RW",
   :dpvo-legal/iso_alpha3 "RWA",
   :dpvo-legal/iso_numeric "646",
   :dpvo-legal/un_m49     "646",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Rwanda"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def SA
  {:db/ident              :dpvo-legal/SA,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/WesternAsia},
   :dpvo-legal/iso_alpha2 "SA",
   :dpvo-legal/iso_alpha3 "SAU",
   :dpvo-legal/iso_numeric "682",
   :dpvo-legal/un_m49     "682",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Saudi Arabia"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def SB
  {:db/ident              :dpvo-legal/SB,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Melanesia :dpvo-legal/Oceania},
   :dpvo-legal/iso_alpha2 "SB",
   :dpvo-legal/iso_alpha3 "SLB",
   :dpvo-legal/iso_numeric "90",
   :dpvo-legal/un_m49     "90",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Solomon Islands"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def SC
  {:db/ident              :dpvo-legal/SC,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica},
   :dpvo-legal/iso_alpha2 "SC",
   :dpvo-legal/iso_alpha3 "SYC",
   :dpvo-legal/iso_numeric "690",
   :dpvo-legal/un_m49     "690",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Seychelles"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def SD
  {:db/ident              :dpvo-legal/SD,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/NorthernAfrica},
   :dpvo-legal/iso_alpha2 "SD",
   :dpvo-legal/iso_alpha3 "SDN",
   :dpvo-legal/iso_numeric "729",
   :dpvo-legal/un_m49     "729",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Sudan"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def SE
  {:db/ident               :dpvo-legal/SE,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/Europe :dpvo-legal/NorthernEurope},
   :dpvo-legal/iso_alpha2  "SE",
   :dpvo-legal/iso_alpha3  "SWE",
   :dpvo-legal/iso_numeric "752",
   :dpvo-legal/un_m49      "752",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-SE,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Sweden"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def SG
  {:db/ident              :dpvo-legal/SG,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/SoutheasternAsia},
   :dpvo-legal/iso_alpha2 "SG",
   :dpvo-legal/iso_alpha3 "SGP",
   :dpvo-legal/iso_numeric "702",
   :dpvo-legal/un_m49     "702",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Singapore"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def SH
  {:db/ident              :dpvo-legal/SH,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/WesternAfrica :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "SH",
   :dpvo-legal/iso_alpha3 "SHN",
   :dpvo-legal/iso_numeric "654",
   :dpvo-legal/un_m49     "654",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Saint Helena"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def SI
  {:db/ident               :dpvo-legal/SI,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/Europe :dpvo-legal/SouthernEurope},
   :dpvo-legal/iso_alpha2  "SI",
   :dpvo-legal/iso_alpha3  "SVN",
   :dpvo-legal/iso_numeric "705",
   :dpvo-legal/un_m49      "705",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-SI,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Slovenia"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def SJ
  {:db/ident              :dpvo-legal/SJ,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Europe :dpvo-legal/NorthernEurope},
   :dpvo-legal/iso_alpha2 "SJ",
   :dpvo-legal/iso_alpha3 "SJM",
   :dpvo-legal/iso_numeric "744",
   :dpvo-legal/un_m49     "744",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Svalbard and Jan Mayen Islands"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def SK
  {:db/ident               :dpvo-legal/SK,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/EEA :dpvo-legal/EU27 :dpvo-legal/EU
                             :dpvo-legal/EEA31 :dpvo-legal/EEA30
                             :dpvo-legal/EU28},
   :dcterms/isPartOf       #{:dpvo-legal/EasternEurope :dpvo-legal/Europe},
   :dpvo-legal/iso_alpha2  "SK",
   :dpvo-legal/iso_alpha3  "SVK",
   :dpvo-legal/iso_numeric "703",
   :dpvo-legal/un_m49      "703",
   :dpvo/hasApplicableLaw  :dpvo-legal/EU-GDPR,
   :dpvo/hasAuthority      :dpvo-legal/DPA-SK,
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "Slovakia"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def SL
  {:db/ident              :dpvo-legal/SL,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/WesternAfrica :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "SL",
   :dpvo-legal/iso_alpha3 "SLE",
   :dpvo-legal/iso_numeric "694",
   :dpvo-legal/un_m49     "694",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Sierra Leone"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def SM
  {:db/ident              :dpvo-legal/SM,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Europe :dpvo-legal/SouthernEurope},
   :dpvo-legal/iso_alpha2 "SM",
   :dpvo-legal/iso_alpha3 "SMR",
   :dpvo-legal/iso_numeric "674",
   :dpvo-legal/un_m49     "674",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "San Marino"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def SN
  {:db/ident              :dpvo-legal/SN,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/WesternAfrica :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "SN",
   :dpvo-legal/iso_alpha3 "SEN",
   :dpvo-legal/iso_numeric "686",
   :dpvo-legal/un_m49     "686",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Senegal"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def SO
  {:db/ident              :dpvo-legal/SO,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica},
   :dpvo-legal/iso_alpha2 "SO",
   :dpvo-legal/iso_alpha3 "SOM",
   :dpvo-legal/iso_numeric "706",
   :dpvo-legal/un_m49     "706",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Somalia"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def SR
  {:db/ident              :dpvo-legal/SR,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/SouthAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "SR",
   :dpvo-legal/iso_alpha3 "SUR",
   :dpvo-legal/iso_numeric "740",
   :dpvo-legal/un_m49     "740",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Suriname"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def SS
  {:db/ident              :dpvo-legal/SS,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica},
   :dpvo-legal/iso_alpha2 "SS",
   :dpvo-legal/iso_alpha3 "SSD",
   :dpvo-legal/iso_numeric "728",
   :dpvo-legal/un_m49     "728",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "South Sudan"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def ST
  {:db/ident              :dpvo-legal/ST,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/MiddleAfrica
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "ST",
   :dpvo-legal/iso_alpha3 "STP",
   :dpvo-legal/iso_numeric "678",
   :dpvo-legal/un_m49     "678",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Sao Tome and Principe"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def SV
  {:db/ident              :dpvo-legal/SV,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/CentralAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "SV",
   :dpvo-legal/iso_alpha3 "SLV",
   :dpvo-legal/iso_numeric "222",
   :dpvo-legal/un_m49     "222",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "El Salvador"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def SX
  {:db/ident              :dpvo-legal/SX,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "SX",
   :dpvo-legal/iso_alpha3 "SXM",
   :dpvo-legal/iso_numeric "534",
   :dpvo-legal/un_m49     "534",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Sint Maarten (Dutch part)"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def SY
  {:db/ident              :dpvo-legal/SY,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/WesternAsia},
   :dpvo-legal/iso_alpha2 "SY",
   :dpvo-legal/iso_alpha3 "SYR",
   :dpvo-legal/iso_numeric "760",
   :dpvo-legal/un_m49     "760",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Syrian Arab Republic"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def SZ
  {:db/ident              :dpvo-legal/SZ,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SouthernAfrica
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "SZ",
   :dpvo-legal/iso_alpha3 "SWZ",
   :dpvo-legal/iso_numeric "748",
   :dpvo-legal/un_m49     "748",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Eswatini"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def Sark
  {:db/ident         :dpvo-legal/Sark,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf #{:dpvo-legal/ChannelIslands :dpvo-legal/Europe
                       :dpvo-legal/NorthernEurope},
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Sark"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def SouthAmerica
  {:db/ident         :dpvo-legal/SouthAmerica,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/BR :dpvo-legal/UY :dpvo-legal/FK
                       :dpvo-legal/GS :dpvo-legal/GF :dpvo-legal/BV
                       :dpvo-legal/GY :dpvo-legal/VE :dpvo-legal/CL
                       :dpvo-legal/AR :dpvo-legal/CO :dpvo-legal/PY
                       :dpvo-legal/PE :dpvo-legal/EC :dpvo-legal/SR
                       :dpvo-legal/BO},
   :dcterms/isPartOf :dpvo-legal/LatinAmericaandtheCaribbean,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "SouthAmerica"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def SoutheasternAsia
  {:db/ident         :dpvo-legal/SoutheasternAsia,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/TH :dpvo-legal/MM :dpvo-legal/ID
                       :dpvo-legal/TL :dpvo-legal/PH :dpvo-legal/MY
                       :dpvo-legal/SG :dpvo-legal/LA :dpvo-legal/BN
                       :dpvo-legal/VN :dpvo-legal/KH},
   :dcterms/isPartOf :dpvo-legal/Asia,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "SoutheasternAsia"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def SouthernAfrica
  {:db/ident         :dpvo-legal/SouthernAfrica,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/LS :dpvo-legal/BW :dpvo-legal/ZA
                       :dpvo-legal/NA :dpvo-legal/SZ},
   :dcterms/isPartOf :dpvo-legal/SubSaharanAfrica,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "SouthernAfrica"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def SouthernAsia
  {:db/ident         :dpvo-legal/SouthernAsia,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/BT :dpvo-legal/NP :dpvo-legal/BD
                       :dpvo-legal/LK :dpvo-legal/IR :dpvo-legal/IN
                       :dpvo-legal/AF :dpvo-legal/PK :dpvo-legal/MV},
   :dcterms/isPartOf :dpvo-legal/Asia,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "SouthernAsia"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def SouthernEurope
  {:db/ident         :dpvo-legal/SouthernEurope,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/GR :dpvo-legal/MT :dpvo-legal/MK
                       :dpvo-legal/IT :dpvo-legal/VA :dpvo-legal/PT
                       :dpvo-legal/HR :dpvo-legal/BA :dpvo-legal/SI
                       :dpvo-legal/SM :dpvo-legal/AL :dpvo-legal/ES
                       :dpvo-legal/AD :dpvo-legal/ME :dpvo-legal/RS
                       :dpvo-legal/GI},
   :dcterms/isPartOf :dpvo-legal/Europe,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "SouthernEurope"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def SubSaharanAfrica
  {:db/ident         :dpvo-legal/SubSaharanAfrica,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/BI :dpvo-legal/CF :dpvo-legal/DJ
                       :dpvo-legal/LS :dpvo-legal/KE :dpvo-legal/TZ
                       :dpvo-legal/CM :dpvo-legal/SN :dpvo-legal/CI
                       :dpvo-legal/ZM :dpvo-legal/GW :dpvo-legal/KM
                       :dpvo-legal/BF :dpvo-legal/ER :dpvo-legal/NG
                       :dpvo-legal/MZ :dpvo-legal/WesternAfrica :dpvo-legal/BW
                       :dpvo-legal/GM :dpvo-legal/RW :dpvo-legal/RE
                       :dpvo-legal/ZA :dpvo-legal/CG :dpvo-legal/GH
                       :dpvo-legal/SS :dpvo-legal/TD :dpvo-legal/SL
                       :dpvo-legal/MG :dpvo-legal/GQ :dpvo-legal/ET
                       :dpvo-legal/LR :dpvo-legal/ML :dpvo-legal/MW
                       :dpvo-legal/AO :dpvo-legal/MR :dpvo-legal/NE
                       :dpvo-legal/GN :dpvo-legal/NA :dpvo-legal/YT
                       :dpvo-legal/MiddleAfrica :dpvo-legal/CD :dpvo-legal/GA
                       :dpvo-legal/TG :dpvo-legal/IO :dpvo-legal/SH
                       :dpvo-legal/SouthernAfrica :dpvo-legal/SZ :dpvo-legal/BJ
                       :dpvo-legal/ST :dpvo-legal/SC :dpvo-legal/UG
                       :dpvo-legal/CV :dpvo-legal/TF :dpvo-legal/EasternAfrica
                       :dpvo-legal/ZW :dpvo-legal/SO :dpvo-legal/MU},
   :dcterms/isPartOf :dpvo-legal/Africa,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "SubSaharanAfrica"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def TC
  {:db/ident              :dpvo-legal/TC,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "TC",
   :dpvo-legal/iso_alpha3 "TCA",
   :dpvo-legal/iso_numeric "796",
   :dpvo-legal/un_m49     "796",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Turks and Caicos Islands"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def TD
  {:db/ident              :dpvo-legal/TD,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/MiddleAfrica
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "TD",
   :dpvo-legal/iso_alpha3 "TCD",
   :dpvo-legal/iso_numeric "148",
   :dpvo-legal/un_m49     "148",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Chad"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def TF
  {:db/ident              :dpvo-legal/TF,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica},
   :dpvo-legal/iso_alpha2 "TF",
   :dpvo-legal/iso_alpha3 "ATF",
   :dpvo-legal/iso_numeric "260",
   :dpvo-legal/un_m49     "260",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "French Southern Territories"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def TG
  {:db/ident              :dpvo-legal/TG,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/WesternAfrica :dpvo-legal/Africa
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "TG",
   :dpvo-legal/iso_alpha3 "TGO",
   :dpvo-legal/iso_numeric "768",
   :dpvo-legal/un_m49     "768",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Togo"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def TH
  {:db/ident              :dpvo-legal/TH,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/SoutheasternAsia},
   :dpvo-legal/iso_alpha2 "TH",
   :dpvo-legal/iso_alpha3 "THA",
   :dpvo-legal/iso_numeric "764",
   :dpvo-legal/un_m49     "764",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Thailand"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def TJ
  {:db/ident              :dpvo-legal/TJ,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/CentralAsia :dpvo-legal/Asia},
   :dpvo-legal/iso_alpha2 "TJ",
   :dpvo-legal/iso_alpha3 "TJK",
   :dpvo-legal/iso_numeric "762",
   :dpvo-legal/un_m49     "762",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Tajikistan"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def TK
  {:db/ident              :dpvo-legal/TK,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Polynesia :dpvo-legal/Oceania},
   :dpvo-legal/iso_alpha2 "TK",
   :dpvo-legal/iso_alpha3 "TKL",
   :dpvo-legal/iso_numeric "772",
   :dpvo-legal/un_m49     "772",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Tokelau"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def TL
  {:db/ident              :dpvo-legal/TL,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/SoutheasternAsia},
   :dpvo-legal/iso_alpha2 "TL",
   :dpvo-legal/iso_alpha3 "TLS",
   :dpvo-legal/iso_numeric "626",
   :dpvo-legal/un_m49     "626",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Timor-Leste"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def TM
  {:db/ident              :dpvo-legal/TM,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/CentralAsia :dpvo-legal/Asia},
   :dpvo-legal/iso_alpha2 "TM",
   :dpvo-legal/iso_alpha3 "TKM",
   :dpvo-legal/iso_numeric "795",
   :dpvo-legal/un_m49     "795",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Turkmenistan"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def TN
  {:db/ident              :dpvo-legal/TN,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/NorthernAfrica},
   :dpvo-legal/iso_alpha2 "TN",
   :dpvo-legal/iso_alpha3 "TUN",
   :dpvo-legal/iso_numeric "788",
   :dpvo-legal/un_m49     "788",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Tunisia"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def TO
  {:db/ident              :dpvo-legal/TO,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Polynesia :dpvo-legal/Oceania},
   :dpvo-legal/iso_alpha2 "TO",
   :dpvo-legal/iso_alpha3 "TON",
   :dpvo-legal/iso_numeric "776",
   :dpvo-legal/un_m49     "776",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Tonga"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def TR
  {:db/ident              :dpvo-legal/TR,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/WesternAsia},
   :dpvo-legal/iso_alpha2 "TR",
   :dpvo-legal/iso_alpha3 "TUR",
   :dpvo-legal/iso_numeric "792",
   :dpvo-legal/un_m49     "792",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Turkey"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def TT
  {:db/ident              :dpvo-legal/TT,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "TT",
   :dpvo-legal/iso_alpha3 "TTO",
   :dpvo-legal/iso_numeric "780",
   :dpvo-legal/un_m49     "780",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Trinidad and Tobago"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def TV
  {:db/ident              :dpvo-legal/TV,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Polynesia :dpvo-legal/Oceania},
   :dpvo-legal/iso_alpha2 "TV",
   :dpvo-legal/iso_alpha3 "TUV",
   :dpvo-legal/iso_numeric "798",
   :dpvo-legal/un_m49     "798",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Tuvalu"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def TW
  {:db/ident         :dpvo-legal/TW,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :rdf/type         #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Taiwan (Province of China)"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def TZ
  {:db/ident              :dpvo-legal/TZ,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica},
   :dpvo-legal/iso_alpha2 "TZ",
   :dpvo-legal/iso_alpha3 "TZA",
   :dpvo-legal/iso_numeric "834",
   :dpvo-legal/un_m49     "834",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "United Republic of Tanzania"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def UA
  {:db/ident              :dpvo-legal/UA,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/EasternEurope :dpvo-legal/Europe},
   :dpvo-legal/iso_alpha2 "UA",
   :dpvo-legal/iso_alpha3 "UKR",
   :dpvo-legal/iso_numeric "804",
   :dpvo-legal/un_m49     "804",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Ukraine"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def UG
  {:db/ident              :dpvo-legal/UG,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica},
   :dpvo-legal/iso_alpha2 "UG",
   :dpvo-legal/iso_alpha3 "UGA",
   :dpvo-legal/iso_numeric "800",
   :dpvo-legal/un_m49     "800",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Uganda"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def UK-DPA-2018
  {:db/ident          :dpvo-legal/UK-DPA-2018,
   :dpvo/hasAuthority :dpvo-legal/DPA-GB,
   :rdf/type          :dpvo/Law})

(def UK-GDPR
  {:db/ident          :dpvo-legal/UK-GDPR,
   :dpvo/hasAuthority :dpvo-legal/DPA-GB,
   :rdf/type          :dpvo/Law})

(def UM
  {:db/ident              :dpvo-legal/UM,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Oceania :dpvo-legal/Micronesia},
   :dpvo-legal/iso_alpha2 "UM",
   :dpvo-legal/iso_alpha3 "UMI",
   :dpvo-legal/iso_numeric "581",
   :dpvo-legal/un_m49     "581",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value "United States Minor Outlying Islands"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def US
  {:db/ident               :dpvo-legal/US,
   :dcterms/created        #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator        {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart        #{:dpvo-legal/US-MS :dpvo-legal/US-CO
                             :dpvo-legal/US-AR :dpvo-legal/US-AK
                             :dpvo-legal/US-WI :dpvo-legal/US-IA
                             :dpvo-legal/US-IL :dpvo-legal/US-NE
                             :dpvo-legal/US-WA :dpvo-legal/US-MD
                             :dpvo-legal/US-NJ :dpvo-legal/US-AS
                             :dpvo-legal/US-WY :dpvo-legal/US-GA
                             :dpvo-legal/US-NM :dpvo-legal/US-RI
                             :dpvo-legal/US-CT :dpvo-legal/US-GU
                             :dpvo-legal/US-VI :dpvo-legal/US-OR
                             :dpvo-legal/US-AZ :dpvo-legal/US-SD
                             :dpvo-legal/US-NV :dpvo-legal/US-WV
                             :dpvo-legal/US-UT :dpvo-legal/US-MO
                             :dpvo-legal/US-MP :dpvo-legal/US-TX
                             :dpvo-legal/US-OK :dpvo-legal/US-KY
                             :dpvo-legal/US-AL :dpvo-legal/US-FL
                             :dpvo-legal/US-NH :dpvo-legal/US-MT
                             :dpvo-legal/US-CA :dpvo-legal/US-UM
                             :dpvo-legal/US-IN :dpvo-legal/US-DC
                             :dpvo-legal/US-OH :dpvo-legal/US-VA
                             :dpvo-legal/US-NY :dpvo-legal/US-VT
                             :dpvo-legal/US-HI :dpvo-legal/US-MN
                             :dpvo-legal/US-KS :dpvo-legal/US-LA
                             :dpvo-legal/US-DE :dpvo-legal/US-PA
                             :dpvo-legal/US-MA :dpvo-legal/US-TN
                             :dpvo-legal/US-NC :dpvo-legal/US-MI
                             :dpvo-legal/US-ND :dpvo-legal/US-ME
                             :dpvo-legal/US-PR :dpvo-legal/US-SC
                             :dpvo-legal/US-ID},
   :dcterms/isPartOf       #{:dpvo-legal/Americas :dpvo-legal/NorthernAmerica},
   :dpvo-legal/iso_alpha2  "US",
   :dpvo-legal/iso_alpha3  "USA",
   :dpvo-legal/iso_numeric "840",
   :dpvo-legal/un_m49      "840",
   :rdf/type               #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy       {:xsd/anyURI
                            "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label             {:rdf/language "en",
                            :rdf/value    "United States of America"},
   :vs/term_status         {:rdf/language "en",
                            :rdf/value    "accepted"}})

(def US-AK
  {:db/ident         :dpvo-legal/US-AK,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Alaska"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-AL
  {:db/ident         :dpvo-legal/US-AL,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Alabama"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-AR
  {:db/ident         :dpvo-legal/US-AR,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Arkansas"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-AS
  {:db/ident         :dpvo-legal/US-AS,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "American Samoa"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-AZ
  {:db/ident         :dpvo-legal/US-AZ,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Arizona"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-CA
  {:db/ident              :dpvo-legal/US-CA,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      :dpvo-legal/US,
   :dpvo/hasApplicableLaw #{:dpvo-legal/US-CA-CCPA :dpvo-legal/US-CA-CPRA},
   :rdf/type              #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "California"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def US-CA-CCPA
  {:db/ident :dpvo-legal/US-CA-CCPA,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #inst "2020-01-01T00:00:00.000-00:00"}},
   :dpvo/hasJurisdiction :dpvo-legal/US-CA,
   :foaf/homepage
   {:xsd/anyURI
    "https://leginfo.legislature.ca.gov/faces/billTextClient.xhtml?bill_id=201720180AB375"},
   :rdf/type #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "California Consumer Privacy Act (CCPA)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def US-CA-CPRA
  {:db/ident :dpvo-legal/US-CA-CPRA,
   :dcterms/created #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #inst "2023-01-01T00:00:00.000-00:00"}},
   :dpvo/hasJurisdiction :dpvo-legal/US-CA,
   :foaf/homepage
   {:xsd/anyURI
    "https://leginfo.legislature.ca.gov/faces/billTextClient.xhtml?bill_id=201720180AB375"},
   :rdf/type #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "California Privacy Rights Act (CPRA)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def US-CO
  {:db/ident              :dpvo-legal/US-CO,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      :dpvo-legal/US,
   :dpvo/hasApplicableLaw :dpvo-legal/US-CO-CPA,
   :dpvo/hasAuthority     :dpvo-legal/DPA-US-CO,
   :rdf/type              #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Colorado"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def US-CO-CPA
  {:db/ident             :dpvo-legal/US-CO-CPA,
   :dcterms/created      #inst "2022-11-23T00:00:00.000-00:00",
   :dcterms/creator      {:rdf/value "Jonathan Bowker"},
   :dcterms/temporal     {:rdf/type :time/ProperInterval,
                          :time/hasBeginning
                          {:time/inXSDDate #inst
                                            "2024-01-07T00:00:00.000-00:00"}},
   :dpvo/hasAuthority    :dpvo-legal/DPA-US-CO,
   :dpvo/hasJurisdiction :dpvo-legal/US-CO,
   :foaf/homepage        {:xsd/anyURI
                          "https://leg.colorado.gov/bills/sb21-190"},
   :rdf/type             #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy     {:xsd/anyURI
                          "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           {:rdf/language "en",
                          :rdf/value    "Colorado Privacy Act (CPA)"},
   :vs/term_status       {:rdf/language "en",
                          :rdf/value    "accepted"}})

(def US-CT
  {:db/ident              :dpvo-legal/US-CT,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      :dpvo-legal/US,
   :dpvo/hasApplicableLaw :dpvo-legal/US-CT-CTPA,
   :dpvo/hasAuthority     :dpvo-legal/DPA-US-CT,
   :rdf/type              #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Connecticut"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def US-CT-CTPA
  {:db/ident :dpvo-legal/US-CT-CTPA,
   :dcterms/created #inst "2022-11-23T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Jonathan Bowker"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #inst "2023-01-07T00:00:00.000-00:00"}},
   :dpvo/hasAuthority :dpvo-legal/DPA-US-CT,
   :dpvo/hasJurisdiction :dpvo-legal/US-CT,
   :foaf/homepage
   {:xsd/anyURI
    "https://www.cga.ct.gov/2022/ACT/PA/PDF/2022PA-00015-R00SB-00006-PA.PDF"},
   :rdf/type #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Connecticut Data Privacy Act (CTPA)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def US-DC
  {:db/ident         :dpvo-legal/US-DC,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "District of Columbia"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-DE
  {:db/ident         :dpvo-legal/US-DE,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Delaware"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-FL
  {:db/ident         :dpvo-legal/US-FL,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Florida"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-GA
  {:db/ident         :dpvo-legal/US-GA,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Georgia"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-GU
  {:db/ident         :dpvo-legal/US-GU,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Guam"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-HI
  {:db/ident         :dpvo-legal/US-HI,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Hawaii"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-IA
  {:db/ident         :dpvo-legal/US-IA,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Iowa"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-ID
  {:db/ident         :dpvo-legal/US-ID,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Idaho"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-IL
  {:db/ident         :dpvo-legal/US-IL,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Illinois"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-IN
  {:db/ident         :dpvo-legal/US-IN,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Indiana"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-KS
  {:db/ident         :dpvo-legal/US-KS,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Kansas"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-KY
  {:db/ident         :dpvo-legal/US-KY,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Kentucky"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-LA
  {:db/ident         :dpvo-legal/US-LA,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Louisiana"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-MA
  {:db/ident         :dpvo-legal/US-MA,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Massachusetts"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-MD
  {:db/ident         :dpvo-legal/US-MD,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Maryland"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-ME
  {:db/ident         :dpvo-legal/US-ME,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Maine"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-MI
  {:db/ident         :dpvo-legal/US-MI,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Michigan"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-MN
  {:db/ident         :dpvo-legal/US-MN,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Minnesota"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-MO
  {:db/ident         :dpvo-legal/US-MO,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Missouri"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-MP
  {:db/ident         :dpvo-legal/US-MP,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Northern Mariana Islands"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-MS
  {:db/ident         :dpvo-legal/US-MS,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Mississippi"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-MT
  {:db/ident         :dpvo-legal/US-MT,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Montana"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-NC
  {:db/ident         :dpvo-legal/US-NC,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "North Carolina"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-ND
  {:db/ident         :dpvo-legal/US-ND,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "North Dakota"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-NE
  {:db/ident         :dpvo-legal/US-NE,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Nebraska"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-NH
  {:db/ident         :dpvo-legal/US-NH,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "New Hampshire"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-NJ
  {:db/ident         :dpvo-legal/US-NJ,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "New Jersey"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-NM
  {:db/ident         :dpvo-legal/US-NM,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "New Mexico"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-NV
  {:db/ident              :dpvo-legal/US-NV,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      :dpvo-legal/US,
   :dpvo/hasApplicableLaw :dpvo-legal/US-NV-NPICICA,
   :dpvo/hasAuthority     :dpvo-legal/DPA-US-NV,
   :rdf/type              #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Nevada"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def US-NV-NPICICA
  {:db/ident :dpvo-legal/US-NV-NPICICA,
   :dcterms/created #inst "2022-11-23T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Jonathan Bowker"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #inst "2021-01-10T00:00:00.000-00:00"}},
   :dpvo/hasAuthority :dpvo-legal/DPA-US-NV,
   :dpvo/hasJurisdiction :dpvo-legal/US-NV,
   :foaf/homepage {:xsd/anyURI "https://www.leg.state.nv.us/NRS/NRS-603A.html"},
   :rdf/type #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label
   {:rdf/language "en",
    :rdf/value
    "Nevada Privacy of Information Collected on the Internet from Consumers Act (NPICICA)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def US-NY
  {:db/ident         :dpvo-legal/US-NY,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "New York"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-OH
  {:db/ident         :dpvo-legal/US-OH,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Ohio"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-OK
  {:db/ident         :dpvo-legal/US-OK,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Oklahoma"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-OR
  {:db/ident         :dpvo-legal/US-OR,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Oregon"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-PA
  {:db/ident         :dpvo-legal/US-PA,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Pennsylvania"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-PR
  {:db/ident         :dpvo-legal/US-PR,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Puerto Rico"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-RI
  {:db/ident         :dpvo-legal/US-RI,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Rhode Island"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-SC
  {:db/ident         :dpvo-legal/US-SC,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "South Carolina"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-SD
  {:db/ident         :dpvo-legal/US-SD,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "South Dakota"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-TN
  {:db/ident         :dpvo-legal/US-TN,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Tennessee"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-TX
  {:db/ident         :dpvo-legal/US-TX,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Texas"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-UM
  {:db/ident         :dpvo-legal/US-UM,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "United States Minor Outlying Islands"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-UT
  {:db/ident              :dpvo-legal/US-UT,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      :dpvo-legal/US,
   :dpvo/hasApplicableLaw :dpvo-legal/US-UT-UCPA,
   :dpvo/hasAuthority     :dpvo-legal/DPA-US-UT,
   :rdf/type              #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Utah"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def US-UT-UCPA
  {:db/ident             :dpvo-legal/US-UT-UCPA,
   :dcterms/created      #inst "2022-11-22T00:00:00.000-00:00",
   :dcterms/creator      {:rdf/value "Jonathan Bowker"},
   :dpvo/hasAuthority    :dpvo-legal/DPA-US-UT,
   :dpvo/hasJurisdiction :dpvo-legal/US-UT,
   :foaf/homepage        {:xsd/anyURI
                          "https://le.utah.gov/~2022/bills/static/SB0227.html"},
   :rdf/type             #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy     {:xsd/anyURI
                          "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label           {:rdf/language "en",
                          :rdf/value    "Utah Consumer Privacy Act (UCPA)"},
   :vs/term_status       {:rdf/language "en",
                          :rdf/value    "accepted"}})

(def US-VA
  {:db/ident              :dpvo-legal/US-VA,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      :dpvo-legal/US,
   :dpvo/hasApplicableLaw :dpvo-legal/US-VA-VCDPA,
   :dpvo/hasAuthority     :dpvo-legal/DPA-US-VA,
   :rdf/type              #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Virginia"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def US-VA-VCDPA
  {:db/ident :dpvo-legal/US-VA-VCDPA,
   :dcterms/created #inst "2022-11-23T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Jonathan Bowker"},
   :dcterms/temporal {:rdf/type :time/ProperInterval,
                      :time/hasBeginning
                      {:time/inXSDDate #inst "2023-01-01T00:00:00.000-00:00"}},
   :dpvo/hasAuthority :dpvo-legal/DPA-US-VA,
   :dpvo/hasJurisdiction :dpvo-legal/US-VA,
   :foaf/homepage
   {:xsd/anyURI "https://lis.virginia.gov/cgi-bin/legp604.exe?212+sum+HB2307"},
   :rdf/type #{:owl/NamedIndividual :dpvo/Law},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Virginia Consumer Data Protection Act (VCDPA)"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def US-VI
  {:db/ident         :dpvo-legal/US-VI,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "U.S. Virgin Islands"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-VT
  {:db/ident         :dpvo-legal/US-VT,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Vermont"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-WA
  {:db/ident         :dpvo-legal/US-WA,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Washington"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-WI
  {:db/ident         :dpvo-legal/US-WI,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Wisconsin"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-WV
  {:db/ident         :dpvo-legal/US-WV,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "West Virginia"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def US-WY
  {:db/ident         :dpvo-legal/US-WY,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf :dpvo-legal/US,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Wyoming"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def UY
  {:db/ident              :dpvo-legal/UY,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/SouthAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "UY",
   :dpvo-legal/iso_alpha3 "URY",
   :dpvo-legal/iso_numeric "858",
   :dpvo-legal/un_m49     "858",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Uruguay"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def UZ
  {:db/ident              :dpvo-legal/UZ,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/CentralAsia :dpvo-legal/Asia},
   :dpvo-legal/iso_alpha2 "UZ",
   :dpvo-legal/iso_alpha3 "UZB",
   :dpvo-legal/iso_numeric "860",
   :dpvo-legal/un_m49     "860",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Uzbekistan"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def VA
  {:db/ident              :dpvo-legal/VA,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Europe :dpvo-legal/SouthernEurope},
   :dpvo-legal/iso_alpha2 "VA",
   :dpvo-legal/iso_alpha3 "VAT",
   :dpvo-legal/iso_numeric "336",
   :dpvo-legal/un_m49     "336",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Holy See"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def VC
  {:db/ident              :dpvo-legal/VC,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "VC",
   :dpvo-legal/iso_alpha3 "VCT",
   :dpvo-legal/iso_numeric "670",
   :dpvo-legal/un_m49     "670",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Saint Vincent and the Grenadines"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def VE
  {:db/ident              :dpvo-legal/VE,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/SouthAmerica
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "VE",
   :dpvo-legal/iso_alpha3 "VEN",
   :dpvo-legal/iso_numeric "862",
   :dpvo-legal/un_m49     "862",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Venezuela (Bolivarian Republic of)"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def VG
  {:db/ident              :dpvo-legal/VG,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "VG",
   :dpvo-legal/iso_alpha3 "VGB",
   :dpvo-legal/iso_numeric "92",
   :dpvo-legal/un_m49     "92",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "British Virgin Islands"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def VI
  {:db/ident              :dpvo-legal/VI,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Caribbean
                            :dpvo-legal/LatinAmericaandtheCaribbean
                            :dpvo-legal/Americas},
   :dpvo-legal/iso_alpha2 "VI",
   :dpvo-legal/iso_alpha3 "VIR",
   :dpvo-legal/iso_numeric "850",
   :dpvo-legal/un_m49     "850",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "United States Virgin Islands"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def VN
  {:db/ident              :dpvo-legal/VN,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/SoutheasternAsia},
   :dpvo-legal/iso_alpha2 "VN",
   :dpvo-legal/iso_alpha3 "VNM",
   :dpvo-legal/iso_numeric "704",
   :dpvo-legal/un_m49     "704",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Viet Nam"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def VU
  {:db/ident              :dpvo-legal/VU,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Melanesia :dpvo-legal/Oceania},
   :dpvo-legal/iso_alpha2 "VU",
   :dpvo-legal/iso_alpha3 "VUT",
   :dpvo-legal/iso_numeric "548",
   :dpvo-legal/un_m49     "548",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Vanuatu"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def WF
  {:db/ident              :dpvo-legal/WF,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Polynesia :dpvo-legal/Oceania},
   :dpvo-legal/iso_alpha2 "WF",
   :dpvo-legal/iso_alpha3 "WLF",
   :dpvo-legal/iso_numeric "876",
   :dpvo-legal/un_m49     "876",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Wallis and Futuna Islands"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def WS
  {:db/ident              :dpvo-legal/WS,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Polynesia :dpvo-legal/Oceania},
   :dpvo-legal/iso_alpha2 "WS",
   :dpvo-legal/iso_alpha3 "WSM",
   :dpvo-legal/iso_numeric "882",
   :dpvo-legal/un_m49     "882",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Samoa"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def WesternAfrica
  {:db/ident         :dpvo-legal/WesternAfrica,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/SN :dpvo-legal/CI :dpvo-legal/GW
                       :dpvo-legal/BF :dpvo-legal/NG :dpvo-legal/GM
                       :dpvo-legal/GH :dpvo-legal/SL :dpvo-legal/LR
                       :dpvo-legal/ML :dpvo-legal/MR :dpvo-legal/NE
                       :dpvo-legal/GN :dpvo-legal/TG :dpvo-legal/SH
                       :dpvo-legal/BJ :dpvo-legal/CV},
   :dcterms/isPartOf :dpvo-legal/SubSaharanAfrica,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "WesternAfrica"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def WesternAsia
  {:db/ident         :dpvo-legal/WesternAsia,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/GE :dpvo-legal/AZ :dpvo-legal/TR
                       :dpvo-legal/SY :dpvo-legal/AE :dpvo-legal/YE
                       :dpvo-legal/AM :dpvo-legal/SA :dpvo-legal/IQ
                       :dpvo-legal/KW :dpvo-legal/QA :dpvo-legal/IL
                       :dpvo-legal/PS :dpvo-legal/CY :dpvo-legal/JO
                       :dpvo-legal/BH :dpvo-legal/OM :dpvo-legal/LB},
   :dcterms/isPartOf :dpvo-legal/Asia,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "WesternAsia"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def WesternEurope
  {:db/ident         :dpvo-legal/WesternEurope,
   :dcterms/created  #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator  {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/hasPart  #{:dpvo-legal/LI :dpvo-legal/NL :dpvo-legal/AT
                       :dpvo-legal/CH :dpvo-legal/FR :dpvo-legal/LU
                       :dpvo-legal/DE :dpvo-legal/MC :dpvo-legal/BE},
   :dcterms/isPartOf :dpvo-legal/Europe,
   :rdf/type         #{:dpvo/Region :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "WesternEurope"},
   :vs/term_status   {:rdf/language "en",
                      :rdf/value    "accepted"}})

(def YE
  {:db/ident              :dpvo-legal/YE,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Asia :dpvo-legal/WesternAsia},
   :dpvo-legal/iso_alpha2 "YE",
   :dpvo-legal/iso_alpha3 "YEM",
   :dpvo-legal/iso_numeric "887",
   :dpvo-legal/un_m49     "887",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Yemen"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def YT
  {:db/ident              :dpvo-legal/YT,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica},
   :dpvo-legal/iso_alpha2 "YT",
   :dpvo-legal/iso_alpha3 "MYT",
   :dpvo-legal/iso_numeric "175",
   :dpvo-legal/un_m49     "175",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Mayotte"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def ZA
  {:db/ident              :dpvo-legal/ZA,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SouthernAfrica
                            :dpvo-legal/SubSaharanAfrica},
   :dpvo-legal/iso_alpha2 "ZA",
   :dpvo-legal/iso_alpha3 "ZAF",
   :dpvo-legal/iso_numeric "710",
   :dpvo-legal/un_m49     "710",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "South Africa"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def ZM
  {:db/ident              :dpvo-legal/ZM,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica},
   :dpvo-legal/iso_alpha2 "ZM",
   :dpvo-legal/iso_alpha3 "ZMB",
   :dpvo-legal/iso_numeric "894",
   :dpvo-legal/un_m49     "894",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Zambia"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def ZW
  {:db/ident              :dpvo-legal/ZW,
   :dcterms/created       #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator       {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/isPartOf      #{:dpvo-legal/Africa :dpvo-legal/SubSaharanAfrica
                            :dpvo-legal/EasternAfrica},
   :dpvo-legal/iso_alpha2 "ZW",
   :dpvo-legal/iso_alpha3 "ZWE",
   :dpvo-legal/iso_numeric "716",
   :dpvo-legal/un_m49     "716",
   :rdf/type              #{:owl/NamedIndividual :dpvo/Country},
   :rdfs/isDefinedBy      {:xsd/anyURI
                           "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label            {:rdf/language "en",
                           :rdf/value    "Zimbabwe"},
   :vs/term_status        {:rdf/language "en",
                           :rdf/value    "accepted"}})

(def iso_alpha2
  {:db/ident            :dpvo-legal/iso_alpha2,
   :dcterms/created     #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "The ISO-Alpha2 code for a given region"},
   :dcterms/source      {:xsd/anyURI
                         "https://www.iso.org/iso-3166-country-codes.html"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :dpvo/Location,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "ISO-alpha2"},
   :rdfs/range          :xsd/string,
   :rdfs/subPropertyOf  :skos/altLabel,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def iso_alpha3
  {:db/ident            :dpvo-legal/iso_alpha3,
   :dcterms/created     #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "The ISO-Alpha3 code for a given region"},
   :dcterms/source      {:xsd/anyURI
                         "https://www.iso.org/iso-3166-country-codes.html"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :dpvo/Location,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "ISO-alpha3"},
   :rdfs/range          :xsd/string,
   :rdfs/subPropertyOf  :skos/altLabel,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def iso_numeric
  {:db/ident            :dpvo-legal/iso_numeric,
   :dcterms/created     #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "The ISO-Numeric code for a given region"},
   :dcterms/source      {:xsd/anyURI
                         "https://www.iso.org/iso-3166-country-codes.html"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :dpvo/Location,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "ISO-numeric"},
   :rdfs/range          :xsd/string,
   :rdfs/subPropertyOf  :skos/altLabel,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def un_m49
  {:db/ident            :dpvo-legal/un_m49,
   :dcterms/created     #inst "2022-03-30T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "The UN-M49 code for a given region"},
   :dcterms/source      {:xsd/anyURI
                         "https://unstats.un.org/unsd/methodology/m49"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :dpvo/Location,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "UN-M49"},
   :rdfs/range          :xsd/string,
   :rdfs/subPropertyOf  :skos/altLabel,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def urn:uuid:d2630642-9bc3-5944-ab2a-c0aa9f16d7c0
  {:dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "DPV-LEGAL is an extension to the Data Privacy Vocabulary that provides additional terms related to Jurisdictions, Laws, and Authorities."},
   :dcterms/contributor #{"Harshvardhan J. Pandit" "Julian Flake"},
   :dcterms/created #inst "2022-04-02T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "DPV-PD is an extension to the Data Privacy Vocabulary that provides additional terms related to Jurisdictions, Laws, and Authorities."},
   :dcterms/license {:xsd/anyURI
                     "https://www.w3.org/Consortium/Legal/2015/doc-license"},
   :dcterms/modified #inst "2022-10-06T00:00:00.000-00:00",
   :dcterms/source {:xsd/anyURI "https://www.w3.org/community/dpvcg/"},
   :dcterms/title
   {:rdf/language "en",
    :rdf/value
    "DPV-LEGAL: Extension providing Jurisdictions, Laws, and Authorities for DPV"},
   :owl/imports {:xsd/anyURI "https://w3id.org/dpv/dpv-owl"},
   :owl/versionInfo "0.8.2",
   :rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "dpvo-legal",
   :vann/preferredNamespaceUri "https://w3id.org/dpv/dpv-owl/dpv-legal#",
   :xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-legal"})