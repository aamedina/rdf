(ns net.wikipunk.rdf.dpvo-pd
  "DPV-PD is an extension to the Data Privacy Vocabulary that provides additional terms related to Personal Data categories."
  {:dcat/downloadURL "resources/dpv-owl/dpv-pd/dpv-pd.ttl",
   :dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "DPV-PD is an extension to the Data Privacy Vocabulary that provides additional terms related to Personal Data categories."},
   :dcterms/contributor
   #{"Fajar J. Ekaputra" "Rigo Wenning" "David Hickey" "Georg P Krog"
     "Ramisa Gachpaz Hamed" "Axel Polleres" "Simon Steyskal"
     "Harshvardhan J. Pandit" "Beatriz Esteves" "Eva Schlehahn" "Rob Brennan"
     "Bert Bos" "Julian Flake" "Paul Ryan" "Bud Bruegger" "Piero Bonatti"
     "Elmar Kiesling" "Javier D. Fernández" "Mark Lizar"},
   :dcterms/created #inst "2022-04-02T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Axel Polleres"}
                      {:xsd/string "Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "DPV-PD is an extension to the Data Privacy Vocabulary that provides additional terms related to Personal Data categories."},
   :dcterms/license {:rdfa/uri
                     "https://www.w3.org/Consortium/Legal/2015/doc-license"},
   :dcterms/modified #inst "2022-12-05T00:00:00.000-00:00",
   :dcterms/source {:rdfa/uri "https://www.w3.org/community/dpvcg/"},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "DPV-PD: Personal Data Extension for DPV"},
   :owl/imports {:rdfa/uri "https://w3id.org/dpv/dpv-owl"},
   :owl/versionInfo "1",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "dpvo" "https://w3id.org/dpv/dpv-owl#",
                       "dpvo-pd" "https://w3id.org/dpv/dpv-owl/dpv-pd#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vann" "http://purl.org/vocab/vann/",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "dpvo-pd",
   :rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd",
   :vann/preferredNamespacePrefix "dpvo-pd",
   :vann/preferredNamespaceUri "https://w3id.org/dpv/dpv-owl/dpv-pd#"})

(def Accent
  "Information about linguistic and speech accents."
  {:db/ident :dpvo-pd/Accent,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about linguistic and speech accents."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Accent"},
   :rdfs/subClassOf :dpvo-pd/Language,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AccountIdentifier
  "Information about financial account identifier."
  {:db/ident :dpvo-pd/AccountIdentifier,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about financial account identifier."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Account Identifier"},
   :rdfs/subClassOf :dpvo-pd/FinancialAccount,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Acquantaince
  "Information about acquaintainces in a social network."
  {:db/ident :dpvo-pd/Acquantaince,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about acquaintainces in a social network."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Acquantaince"},
   :rdfs/subClassOf :dpvo-pd/SocialNetwork,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Age
  "Information about age"
  {:db/ident :dpvo-pd/Age,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about age"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Age"},
   :rdfs/subClassOf :dpvo-pd/PhysicalCharacteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AgeExact
  "Information about the exact age (i.e. to some degree within a year, month, or day)"
  {:db/ident :dpvo-pd/AgeExact,
   :dcterms/created #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about the exact age (i.e. to some degree within a year, month, or day)"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Age Exact"},
   :rdfs/subClassOf :dpvo-pd/AgeRange,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AgeRange
  "Information about age range i.e. inexact age to some degree (i.e. some years)"
  {:db/ident :dpvo-pd/AgeRange,
   :dcterms/created #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about age range i.e. inexact age to some degree (i.e. some years)"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Age Range"},
   :rdfs/subClassOf :dpvo-pd/Age,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ApartmentOwned
  "Information about apartment(s) owned and its history"
  {:db/ident :dpvo-pd/ApartmentOwned,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about apartment(s) owned and its history"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Apartment Owned"},
   :rdfs/subClassOf :dpvo-pd/HouseOwned,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Association
  "Information about associations in a social network with other individuals, groups, or entities e.g. friend of a friend"
  {:db/ident :dpvo-pd/Association,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about associations in a social network with other individuals, groups, or entities e.g. friend of a friend"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Association"},
   :rdfs/subClassOf :dpvo-pd/SocialNetwork,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Attitude
  "Information about attitude."
  {:db/ident :dpvo-pd/Attitude,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about attitude."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Attitude"},
   :rdfs/subClassOf :dpvo-pd/Behavioral,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Authenticating
  "Information about authentication and information used for authenticating"
  {:db/ident :dpvo-pd/Authenticating,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about authentication and information used for authenticating"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Authenticating"},
   :rdfs/subClassOf :dpvo-pd/Internal,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AuthenticationHistory
  "Information about prior authentication and its outcomes such as login attempts or location."
  {:db/ident :dpvo-pd/AuthenticationHistory,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about prior authentication and its outcomes such as login attempts or location."},
   :dcterms/source {:rdfa/uri "https://www.w3.org/community/dpvcg/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Authentication History"},
   :rdfs/subClassOf :dpvo-pd/Behavioral,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BankAccount
  "Information about bank accounts."
  {:db/ident :dpvo-pd/BankAccount,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about bank accounts."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Bank Account"},
   :rdfs/subClassOf :dpvo-pd/FinancialAccount,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Behavioral
  "Information about Behavior or activity"
  {:db/ident :dpvo-pd/Behavioral,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about Behavior or activity"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Behavioral"},
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Activity"},
   :rdfs/subClassOf :dpvo-pd/External,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Biometric
  "Information about biometrics and biometric characteristics."
  {:db/ident :dpvo-pd/Biometric,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about biometrics and biometric characteristics."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Biometric"},
   :rdfs/subClassOf #{:dpvo/SpecialCategoryPersonalData :dpvo-pd/Identifying},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BirthDate
  "Information about birth date"
  {:db/ident            :dpvo-pd/BirthDate,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about birth date"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Birth Date"},
   :rdfs/subClassOf     :dpvo-pd/Age,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def BirthPlace
  "Information about birth place"
  {:db/ident            :dpvo-pd/BirthPlace,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about birth place"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Birth Place"},
   :rdfs/subClassOf     :dpvo-pd/Location,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def BloodType
  "Information about blood type."
  {:db/ident :dpvo-pd/BloodType,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about blood type."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Blood Type"},
   :rdfs/subClassOf :dpvo-pd/MedicalHealth,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BrowserFingerprint
  "Information about the web browser which is used as a 'fingerprint'"
  {:db/ident :dpvo-pd/BrowserFingerprint,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about the web browser which is used as a 'fingerprint'"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Browser Fingerprint"},
   :rdfs/subClassOf :dpvo-pd/DeviceBased,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BrowserHistory
  "Information about and including web browsing history"
  {:db/ident :dpvo-pd/BrowserHistory,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about and including web browsing history"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Browser History"},
   :rdfs/subClassOf :dpvo-pd/BrowsingBehavior,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BrowsingBehavior
  "Information about browsing Behavior."
  {:db/ident :dpvo-pd/BrowsingBehavior,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about browsing Behavior."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Browsing Behavior"},
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#OnlineActivity"},
   :rdfs/subClassOf :dpvo-pd/Behavioral,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BrowsingReferral
  "Information about web browsing referrer or referral, which can be based on location, targeted referrals, direct, organic search, social media or actions, campaigns."
  {:db/ident :dpvo-pd/BrowsingReferral,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about web browsing referrer or referral, which can be based on location, targeted referrals, direct, organic search, social media or actions, campaigns."},
   :dcterms/source {:rdfa/uri "https://www.w3.org/community/dpvcg/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Browsing Referral"},
   :rdfs/subClassOf :dpvo-pd/BrowsingBehavior,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CallLog
  "Information about the calls that an individual has made."
  {:db/ident :dpvo-pd/CallLog,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about the calls that an individual has made."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Call Log"},
   :rdfs/subClassOf :dpvo-pd/Behavioral,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CarOwned
  "Information about cars ownership and ownership history."
  {:db/ident :dpvo-pd/CarOwned,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about cars ownership and ownership history."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Car Owned"},
   :rdfs/subClassOf :dpvo-pd/Ownership,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CharacterClass
  "Information about character in the public sphere"
  {:db/ident :dpvo-pd/Character,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about character in the public sphere"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Character"},
   :rdfs/subClassOf :dpvo-pd/PublicLife,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Communication
  "Information communicated from or to an individual"
  {:db/ident :dpvo-pd/Communication,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information communicated from or to an individual"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Communication"},
   :rdfs/subClassOf :dpvo-pd/Social,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CommunicationsMetadata
  "Information about communication metadata in the public sphere"
  {:db/ident :dpvo-pd/CommunicationsMetadata,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about communication metadata in the public sphere"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Communications Metadata"},
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Interactive"},
   :rdfs/subClassOf :dpvo-pd/PublicLife,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Connection
  "Information about and including connections in a social network"
  {:db/ident :dpvo-pd/Connection,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about and including connections in a social network"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Connection"},
   :rdfs/subClassOf :dpvo-pd/SocialNetwork,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Contact
  "Information about contacts or used for contacting e.g. email address or phone number"
  {:db/ident :dpvo-pd/Contact,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about contacts or used for contacting e.g. email address or phone number"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Contact"},
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Physical"},
   :rdfs/subClassOf :dpvo-pd/Tracking,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Country
  "Information about country e.g. residence, travel."
  {:db/ident :dpvo-pd/Country,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about country e.g. residence, travel."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Country"},
   :rdfs/subClassOf :dpvo-pd/Location,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Credit
  "Information about reputation with regards to money"
  {:db/ident :dpvo-pd/Credit,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about reputation with regards to money"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit"},
   :rdfs/subClassOf :dpvo-pd/Transactional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CreditCapacity
  "Information about credit capacity."
  {:db/ident :dpvo-pd/CreditCapacity,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about credit capacity."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Capacity"},
   :rdfs/subClassOf :dpvo-pd/Credit,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CreditCardNumber
  "Information about credit card number"
  {:db/ident :dpvo-pd/CreditCardNumber,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about credit card number"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Card Number"},
   :rdfs/subClassOf :dpvo-pd/PaymentCardNumber,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CreditRecord
  "Information about credit record."
  {:db/ident :dpvo-pd/CreditRecord,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about credit record."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Record"},
   :rdfs/subClassOf :dpvo-pd/Credit,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CreditScore
  "Information about credit score."
  {:db/ident :dpvo-pd/CreditScore,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about credit score."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Score"},
   :rdfs/subClassOf :dpvo-pd/CreditWorthiness,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CreditStanding
  "Information about credit standing."
  {:db/ident :dpvo-pd/CreditStanding,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about credit standing."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Standing"},
   :rdfs/subClassOf :dpvo-pd/Credit,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CreditWorthiness
  "Information about credit worthiness."
  {:db/ident :dpvo-pd/CreditWorthiness,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about credit worthiness."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Worthiness"},
   :rdfs/subClassOf :dpvo-pd/Credit,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Criminal
  "Information about criminal activity e.g. criminal convictions or jail time"
  {:db/ident :dpvo-pd/Criminal,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about criminal activity e.g. criminal convictions or jail time"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Criminal"},
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Judicial"},
   :rdfs/subClassOf :dpvo-pd/Social,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CriminalCharge
  "Information about criminal charges."
  {:db/ident :dpvo-pd/CriminalCharge,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about criminal charges."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Criminal Charge"},
   :rdfs/subClassOf :dpvo-pd/Criminal,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CriminalConviction
  "Information about criminal convictions."
  {:db/ident :dpvo-pd/CriminalConviction,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about criminal convictions."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Criminal Conviction"},
   :rdfs/subClassOf :dpvo-pd/Criminal,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CriminalOffense
  "Information about criminal offenses"
  {:db/ident            :dpvo-pd/CriminalOffense,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Georg P Krog"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about criminal offenses"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Criminal Offense"},
   :rdfs/subClassOf     :dpvo-pd/Criminal,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CriminalPardon
  "Information about criminal pardons."
  {:db/ident :dpvo-pd/CriminalPardon,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about criminal pardons."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Criminal Pardon"},
   :rdfs/subClassOf :dpvo-pd/Criminal,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CurrentEmployment
  "Information about current employment"
  {:db/ident            :dpvo-pd/CurrentEmployment,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about current employment"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Current Employment"},
   :rdfs/subClassOf     :dpvo-pd/EmploymentHistory,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DNACode
  "Information about DNA."
  {:db/ident :dpvo-pd/DNACode,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about DNA."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DNA Code"},
   :rdfs/subClassOf :dpvo-pd/MedicalHealth,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Demeanor
  "Information about demeanor."
  {:db/ident :dpvo-pd/Demeanor,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about demeanor."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Demeanor"},
   :rdfs/subClassOf :dpvo-pd/Behavioral,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Demographic
  "Information about demography and demographic characteristics"
  {:db/ident :dpvo-pd/Demographic,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about demography and demographic characteristics"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Demographic"},
   :rdfs/subClassOf :dpvo-pd/External,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DeviceApplications
  "Information about applications or application-like software on a device."
  {:db/ident :dpvo-pd/DeviceApplications,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator
   #{{:xsd/string "Georg P Krog"} {:xsd/string "Harshvardhan J. Pandit"}
     {:xsd/string "Paul Ryan"} {:xsd/string "Beatriz Esteves"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about applications or application-like software on a device."},
   :dcterms/source {:rdfa/uri "https://www.w3.org/community/dpvcg/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Device Applications"},
   :rdfs/subClassOf :dpvo-pd/DeviceSoftware,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DeviceBased
  "Information about devices"
  {:db/ident :dpvo-pd/DeviceBased,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about devices"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Device Based"},
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Computer"},
   :rdfs/subClassOf :dpvo-pd/Tracking,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DeviceOperatingSystem
  "Information about the operating system (OS) or system software that manages hardware or software resources."
  {:db/ident :dpvo-pd/DeviceOperatingSystem,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator
   #{{:xsd/string "Georg P Krog"} {:xsd/string "Harshvardhan J. Pandit"}
     {:xsd/string "Paul Ryan"} {:xsd/string "Beatriz Esteves"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about the operating system (OS) or system software that manages hardware or software resources."},
   :dcterms/source {:rdfa/uri "https://www.w3.org/community/dpvcg/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Device Operating System"},
   :rdfs/subClassOf :dpvo-pd/DeviceSoftware,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DeviceSoftware
  "Information about software on or related to a device."
  {:db/ident :dpvo-pd/DeviceSoftware,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator
   #{{:xsd/string "Georg P Krog"} {:xsd/string "Harshvardhan J. Pandit"}
     {:xsd/string "Paul Ryan"} {:xsd/string "Beatriz Esteves"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about software on or related to a device."},
   :dcterms/source {:rdfa/uri "https://www.w3.org/community/dpvcg/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Device Software"},
   :rdfs/subClassOf :dpvo-pd/DeviceBased,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Dialect
  "Information about linguistic dialects."
  {:db/ident :dpvo-pd/Dialect,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about linguistic dialects."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Dialect"},
   :rdfs/subClassOf :dpvo-pd/Language,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DigitalFingerprint
  "Information about a 'digital fingerprint' created for identification"
  {:db/ident :dpvo-pd/DigitalFingerprint,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about a 'digital fingerprint' created for identification"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Digital Fingerprint"},
   :rdfs/subClassOf :dpvo-pd/Tracking,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Disability
  "Information about disabilities."
  {:db/ident :dpvo-pd/Disability,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about disabilities."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Disability"},
   :rdfs/subClassOf :dpvo-pd/MedicalHealth,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DisciplinaryAction
  "Information about disciplinary actions and its history"
  {:db/ident :dpvo-pd/DisciplinaryAction,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about disciplinary actions and its history"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Disciplinary Action"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Dislike
  "Information about dislikes or preferences regarding repulsions."
  {:db/ident :dpvo-pd/Dislike,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about dislikes or preferences regarding repulsions."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Dislike"},
   :rdfs/subClassOf :dpvo-pd/Interest,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Divorce
  "Information about divorce(s)."
  {:db/ident :dpvo-pd/Divorce,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about divorce(s)."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Divorce"},
   :rdfs/subClassOf :dpvo-pd/FamilyStructure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DrugTestResult
  "Information about drug test results."
  {:db/ident :dpvo-pd/DrugTestResult,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about drug test results."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Drug Test Result"},
   :rdfs/subClassOf :dpvo-pd/MedicalHealth,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Education
  "Information about education"
  {:db/ident            :dpvo-pd/Education,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about education"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Education"},
   :rdfs/subClassOf     :dpvo-pd/Professional,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def EducationExperience
  "Information about education experience e.g. attending a university"
  {:db/ident :dpvo-pd/EducationExperience,
   :dcterms/created #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about education experience e.g. attending a university"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Education Experience"},
   :rdfs/subClassOf :dpvo-pd/Education,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EducationQualification
  "Information about educational qualifications"
  {:db/ident            :dpvo-pd/EducationQualification,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about educational qualifications"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Education Qualification"},
   :rdfs/subClassOf     :dpvo-pd/Education,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def EmailAddress
  "Information about Email address."
  {:db/ident :dpvo-pd/EmailAddress,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about Email address."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Email Address"},
   :rdfs/subClassOf :dpvo-pd/Contact,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EmailAddressPersonal
  "Information about Email address used in Personal capacity"
  {:db/ident :dpvo-pd/EmailAddressPersonal,
   :dcterms/created #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about Email address used in Personal capacity"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Email Address Personal"},
   :rdfs/subClassOf :dpvo-pd/EmailAddress,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EmailAddressWork
  "Information about Email address used for Work or in Professional capacity"
  {:db/ident :dpvo-pd/EmailAddressWork,
   :dcterms/created #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about Email address used for Work or in Professional capacity"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Email Address Work"},
   :rdfs/subClassOf :dpvo-pd/EmailAddress,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EmailContent
  "Information about the contents of Emails sent or received"
  {:db/ident :dpvo-pd/EmailContent,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about the contents of Emails sent or received"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Email Content"},
   :rdfs/subClassOf :dpvo-pd/Communication,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EmploymentHistory
  "Information about employment history"
  {:db/ident :dpvo-pd/EmploymentHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about employment history"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Employment History"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EthnicOrigin
  "Information about ethnic origin"
  {:db/ident :dpvo-pd/EthnicOrigin,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about ethnic origin"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ethnic Origin"},
   :rdfs/subClassOf #{:dpvo/SpecialCategoryPersonalData :dpvo-pd/Ethnicity},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Ethnicity
  "Information about ethnic origins and lineage"
  {:db/ident :dpvo-pd/Ethnicity,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about ethnic origins and lineage"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ethnicity"},
   :rdfs/subClassOf :dpvo-pd/External,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def External
  "Information about external characteristics that can be observed"
  {:db/ident :dpvo-pd/External,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about external characteristics that can be observed"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "External"},
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FacialPrint
  "Information about facial print or pattern"
  {:db/ident            :dpvo-pd/FacialPrint,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about facial print or pattern"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Facial Print"},
   :rdfs/subClassOf     :dpvo-pd/Biometric,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Family
  "Information about family and relationships"
  {:db/ident :dpvo-pd/Family,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about family and relationships"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Family"},
   :rdfs/subClassOf :dpvo-pd/Social,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FamilyHealthHistory
  "Information about family health history."
  {:db/ident :dpvo-pd/FamilyHealthHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about family health history."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Family Health History"},
   :rdfs/subClassOf :dpvo-pd/HealthHistory,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FamilyStructure
  "Information about family and familial structure."
  {:db/ident :dpvo-pd/FamilyStructure,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about family and familial structure."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Family Structure"},
   :rdfs/subClassOf :dpvo-pd/Family,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Favorite
  "Information about favorites"
  {:db/ident :dpvo-pd/Favorite,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about favorites"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Favorite"},
   :rdfs/subClassOf :dpvo-pd/Preference,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FavoriteColor
  "Information about favorite color."
  {:db/ident :dpvo-pd/FavoriteColor,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about favorite color."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Favorite Color"},
   :rdfs/subClassOf :dpvo-pd/Favorite,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FavoriteFood
  "Information about favorite food."
  {:db/ident :dpvo-pd/FavoriteFood,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about favorite food."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Favorite Food"},
   :rdfs/subClassOf :dpvo-pd/Favorite,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FavoriteMusic
  "Information about favorite music."
  {:db/ident :dpvo-pd/FavoriteMusic,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about favorite music."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Favorite Music"},
   :rdfs/subClassOf :dpvo-pd/Favorite,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Fetish
  "Information about an individual's sexual fetishes"
  {:db/ident :dpvo-pd/Fetish,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about an individual's sexual fetishes"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fetish"},
   :rdfs/subClassOf :dpvo-pd/Sexual,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Financial
  "Information about finance including monetary characteristics and transactions"
  {:db/ident :dpvo-pd/Financial,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about finance including monetary characteristics and transactions"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Financial"},
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Financial"},
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FinancialAccount
  "Information about financial accounts."
  {:db/ident :dpvo-pd/FinancialAccount,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about financial accounts."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Financial Account"},
   :rdfs/subClassOf :dpvo-pd/Financial,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FinancialAccountNumber
  "Information about financial account number"
  {:db/ident :dpvo-pd/FinancialAccountNumber,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about financial account number"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Financial Account Number"},
   :rdfs/subClassOf :dpvo-pd/AccountIdentifier,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FinancialStatus
  "Information about financial status or standing"
  {:db/ident            :dpvo-pd/FinancialStatus,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about financial status or standing"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Financial Status"},
   :rdfs/subClassOf     :dpvo-pd/Financial,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Fingerprint
  "Information about fingerprint used for biometric purposes."
  {:db/ident :dpvo-pd/Fingerprint,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about fingerprint used for biometric purposes."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fingerprint"},
   :rdfs/subClassOf :dpvo-pd/Biometric,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Friend
  "Information about friends in a social network, including aspects of friendships such as years together or nature of friendship."
  {:db/ident :dpvo-pd/Friend,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about friends in a social network, including aspects of friendships such as years together or nature of friendship."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Friend"},
   :rdfs/subClassOf :dpvo-pd/SocialNetwork,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def GPSCoordinate
  "Information about location expressed using Global Position System coordinates (GPS)"
  {:db/ident :dpvo-pd/GPSCoordinate,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about location expressed using Global Position System coordinates (GPS)"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPS Coordinate"},
   :rdfs/subClassOf :dpvo-pd/Location,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Gender
  "Information about gender"
  {:db/ident :dpvo-pd/Gender,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about gender"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Gender"},
   :rdfs/subClassOf :dpvo-pd/PhysicalCharacteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def GeneralReputation
  "Information about reputation in the public sphere"
  {:db/ident :dpvo-pd/GeneralReputation,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about reputation in the public sphere"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "General Reputation"},
   :rdfs/subClassOf :dpvo-pd/PublicLife,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Genetic
  "Information about inherited or acquired genetic characteristics"
  {:db/ident :dpvo-pd/Genetic,
   :dcterms/created #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about inherited or acquired genetic characteristics"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Genetic"},
   :rdfs/subClassOf :dpvo-pd/Health,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Geographic
  "Information about location or based on geography (e.g. home address)"
  {:db/ident :dpvo-pd/Geographic,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about location or based on geography (e.g. home address)"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Geographic"},
   :rdfs/subClassOf :dpvo-pd/Demographic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def GroupMembership
  "Information about groups and memberships included or associated with a social network"
  {:db/ident :dpvo-pd/GroupMembership,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about groups and memberships included or associated with a social network"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Group Membership"},
   :rdfs/subClassOf :dpvo-pd/SocialNetwork,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HairColor
  "Information about hair color"
  {:db/ident :dpvo-pd/HairColor,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about hair color"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Hair Color"},
   :rdfs/subClassOf :dpvo-pd/PhysicalCharacteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Health
  "Information about health."
  {:db/ident :dpvo-pd/Health,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about health."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Health"},
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Health"},
   :rdfs/subClassOf :dpvo-pd/MedicalHealth,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HealthHistory
  "Information about health history."
  {:db/ident :dpvo-pd/HealthHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about health history."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Health History"},
   :rdfs/subClassOf :dpvo-pd/MedicalHealth,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HealthRecord
  "Information about health record."
  {:db/ident :dpvo-pd/HealthRecord,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about health record."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Health Record"},
   :rdfs/subClassOf :dpvo-pd/MedicalHealth,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Height
  "Information about physical height"
  {:db/ident :dpvo-pd/Height,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about physical height"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Height"},
   :rdfs/subClassOf :dpvo-pd/PhysicalCharacteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Historical
  "Information about historical data related to or relevant regarding history or past events"
  {:db/ident :dpvo-pd/Historical,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about historical data related to or relevant regarding history or past events"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Historical"},
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HouseOwned
  "Information about house(s) owned and ownership history."
  {:db/ident :dpvo-pd/HouseOwned,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about house(s) owned and ownership history."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "House Owned"},
   :rdfs/subClassOf :dpvo-pd/Ownership,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Household
  "Information about personal or household activities"
  {:db/ident            :dpvo-pd/Household,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about personal or household activities"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Household"},
   :rdfs/subClassOf     :dpvo/PersonalData,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def IPAddress
  "Information about the Internet Protocol (IP) address of a device"
  {:db/ident :dpvo-pd/IPAddress,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about the Internet Protocol (IP) address of a device"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IP Address"},
   :rdfs/subClassOf :dpvo-pd/DeviceBased,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Identifier
  "Information about an identifier or name used for identification"
  {:db/ident :dpvo-pd/Identifier,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about an identifier or name used for identification"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Identifier"},
   :rdfs/subClassOf :dpvo-pd/Tracking,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Identifying
  "Information that uniquely or semi-uniquely identifies an individual or a group"
  {:db/ident :dpvo-pd/Identifying,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information that uniquely or semi-uniquely identifies an individual or a group"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Identifying"},
   :rdfs/subClassOf :dpvo-pd/External,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Income
  "Information about financial income e.g. for individual or household or family"
  {:db/ident :dpvo-pd/Income,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about financial income e.g. for individual or household or family"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Income"},
   :rdfs/subClassOf :dpvo-pd/Transactional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IncomeBracket
  "Information about income bracket."
  {:db/ident :dpvo-pd/IncomeBracket,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about income bracket."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Income Bracket"},
   :rdfs/subClassOf :dpvo-pd/Demographic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IndividualHealthHistory
  "Information about information health history."
  {:db/ident :dpvo-pd/IndividualHealthHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about information health history."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Individual Health History"},
   :rdfs/subClassOf :dpvo-pd/HealthHistory,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Insurance
  "Information about Insurance"
  {:db/ident            :dpvo-pd/Insurance,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about Insurance"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Insurance"},
   :rdfs/subClassOf     :dpvo-pd/Financial,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Intention
  "Information about intentions"
  {:db/ident :dpvo-pd/Intention,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about intentions"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Intention"},
   :rdfs/subClassOf :dpvo-pd/Preference,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Interaction
  "Information about interactions in the public sphere"
  {:db/ident :dpvo-pd/Interaction,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about interactions in the public sphere"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Interaction"},
   :rdfs/subClassOf :dpvo-pd/PublicLife,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Interest
  "Information about interests"
  {:db/ident :dpvo-pd/Interest,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about interests"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Interest"},
   :rdfs/subClassOf :dpvo-pd/Preference,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Internal
  "Informatoin about internal characteristics that cannot be seen or observed"
  {:db/ident :dpvo-pd/Internal,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Informatoin about internal characteristics that cannot be seen or observed"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Internal"},
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Job
  "Information about professional jobs"
  {:db/ident :dpvo-pd/Job,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about professional jobs"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Job"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def KnowledgeBelief
  "Information about knowledge and beliefs"
  {:db/ident :dpvo-pd/KnowledgeBelief,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about knowledge and beliefs"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Knowledge and Beliefs"},
   :rdfs/subClassOf :dpvo-pd/Internal,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Language
  "Information about language and lingual history."
  {:db/ident :dpvo-pd/Language,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about language and lingual history."},
   :dcterms/modified #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Language"},
   :rdfs/subClassOf :dpvo-pd/External,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def LifeHistory
  "Information about personal history regarding events or activities - including  their occurrences that might be directly related or have had an influence (e.g. World War, 9/11)"
  {:db/ident :dpvo-pd/LifeHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about personal history regarding events or activities - including  their occurrences that might be directly related or have had an influence (e.g. World War, 9/11)"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Life History"},
   :rdfs/subClassOf :dpvo-pd/Historical,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Like
  "Information about likes or preferences regarding attractions."
  {:db/ident :dpvo-pd/Like,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about likes or preferences regarding attractions."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Like"},
   :rdfs/subClassOf :dpvo-pd/Interest,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LinkClicked
  "Information about the links that an individual has clicked."
  {:db/ident :dpvo-pd/LinkClicked,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about the links that an individual has clicked."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Link Clicked"},
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Navigation"},
   :rdfs/subClassOf :dpvo-pd/Behavioral,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LoanRecord
  "Information about loans, whether applied, provided or rejected, and its history"
  {:db/ident :dpvo-pd/LoanRecord,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about loans, whether applied, provided or rejected, and its history"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Loan Record"},
   :rdfs/subClassOf :dpvo-pd/Transactional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Location
  "Information about location"
  {:db/ident :dpvo-pd/Location,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about location"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Location"},
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Location"},
   :rdfs/subClassOf :dpvo-pd/Tracking,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MACAddress
  "Information about the Media Access Control (MAC) address of a device"
  {:db/ident :dpvo-pd/MACAddress,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about the Media Access Control (MAC) address of a device"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MAC Address"},
   :rdfs/subClassOf :dpvo-pd/DeviceBased,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MaritalStatus
  "Information about marital status and history"
  {:db/ident :dpvo-pd/MaritalStatus,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about marital status and history"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Marital Status"},
   :rdfs/subClassOf :dpvo-pd/PublicLife,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Marriage
  "Information about marriage(s)."
  {:db/ident :dpvo-pd/Marriage,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about marriage(s)."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Marriage"},
   :rdfs/subClassOf :dpvo-pd/FamilyStructure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MedicalHealth
  "Information about health, medical conditions or health care"
  {:db/ident :dpvo-pd/MedicalHealth,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about health, medical conditions or health care"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Medical Health"},
   :rdfs/subClassOf #{:dpvo/SpecialCategoryPersonalData :dpvo-pd/External},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MentalHealth
  "Information about mental health."
  {:db/ident :dpvo-pd/MentalHealth,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about mental health."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mental Health"},
   :rdfs/subClassOf :dpvo-pd/Health,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Name
  "Information about names associated or used as given name or nickname."
  {:db/ident :dpvo-pd/Name,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about names associated or used as given name or nickname."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Name"},
   :rdfs/subClassOf :dpvo-pd/Identifying,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Nationality
  "Information about nationality"
  {:db/ident            :dpvo-pd/Nationality,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator     {:rdfa/uri
                         "https://www.w3.org/2022/04/20-dpvcg-minutes.html"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about nationality"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Nationality"},
   :rdfs/subClassOf     :dpvo-pd/External,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def OfficialID
  "Information about an official identifier or identification document"
  {:db/ident :dpvo-pd/OfficialID,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about an official identifier or identification document"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Official ID"},
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Government"},
   :rdfs/subClassOf :dpvo-pd/Identifying,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Offspring
  "Information about offspring(s)."
  {:db/ident :dpvo-pd/Offspring,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about offspring(s)."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Offspring"},
   :rdfs/subClassOf :dpvo-pd/FamilyStructure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Opinion
  "Information about opinions"
  {:db/ident :dpvo-pd/Opinion,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about opinions"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Opinion"},
   :rdfs/subClassOf :dpvo-pd/Preference,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Ownership
  "Information about ownership and history, including renting, borrowing, possessions."
  {:db/ident :dpvo-pd/Ownership,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about ownership and history, including renting, borrowing, possessions."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ownership"},
   :rdfs/subClassOf :dpvo-pd/Financial,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PINCode
  "Information about Personal identification number (PIN), which is usually used in the process of authenticating the individual as an user accessing a system."
  {:db/ident :dpvo-pd/PINCode,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about Personal identification number (PIN), which is usually used in the process of authenticating the individual as an user accessing a system."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PIN Code"},
   :rdfs/subClassOf :dpvo-pd/Authenticating,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Parent
  "Information about parent(s)."
  {:db/ident :dpvo-pd/Parent,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about parent(s)."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Parent"},
   :rdfs/subClassOf :dpvo-pd/FamilyStructure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Passport
  "Information about passport"
  {:db/ident            :dpvo-pd/Passport,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about passport"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Passport"},
   :rdfs/subClassOf     :dpvo-pd/OfficialID,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Password
  "Information about password used in the process of authenticating the individual as an user accessing a system."
  {:db/ident :dpvo-pd/Password,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about password used in the process of authenticating the individual as an user accessing a system."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Password"},
   :rdfs/subClassOf :dpvo-pd/Authenticating,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PastEmployment
  "Information about past employment"
  {:db/ident            :dpvo-pd/PastEmployment,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about past employment"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Past Employment"},
   :rdfs/subClassOf     :dpvo-pd/EmploymentHistory,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def PaymentCard
  "Information about payment card such as Credit Card, Debit Card."
  {:db/ident :dpvo-pd/PaymentCard,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about payment card such as Credit Card, Debit Card."},
   :dcterms/source {:rdfa/uri "https://www.w3.org/community/dpvcg/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Payment Card"},
   :rdfs/subClassOf :dpvo-pd/FinancialAccount,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PaymentCardExpiry
  "Information about payment card expiry such as a date."
  {:db/ident :dpvo-pd/PaymentCardExpiry,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about payment card expiry such as a date."},
   :dcterms/source {:rdfa/uri "https://www.w3.org/community/dpvcg/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Payment Card Expiry"},
   :rdfs/subClassOf :dpvo-pd/PaymentCard,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PaymentCardNumber
  "Information about payment card number."
  {:db/ident            :dpvo-pd/PaymentCardNumber,
   :dcterms/created     #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Georg P Krog"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about payment card number."},
   :dcterms/source      {:rdfa/uri "https://www.w3.org/community/dpvcg/"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Payment Card Number"},
   :rdfs/subClassOf     #{:dpvo-pd/AccountIdentifier :dpvo-pd/PaymentCard},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def PerformanceAtWork
  "Information about performance at work or within work environments"
  {:db/ident :dpvo-pd/PerformanceAtWork,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about performance at work or within work environments"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Performance at Work"},
   :rdfs/subClassOf #{:dpvo-pd/Professional :dpvo-pd/Behavioral},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PersonalDocuments
  "Information about and including personal documents e.g. diaries or journals"
  {:db/ident :dpvo-pd/PersonalDocuments,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about and including personal documents e.g. diaries or journals"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personal Documents"},
   :rdfs/subClassOf :dpvo-pd/External,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PersonalPossession
  "Information about personal possessions."
  {:db/ident :dpvo-pd/PersonalPossession,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about personal possessions."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personal Possession"},
   :rdfs/subClassOf :dpvo-pd/Ownership,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Personality
  "Information about personality (e.g., categorization in terms of the Big Five personality traits)"
  {:db/ident :dpvo-pd/Personality,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about personality (e.g., categorization in terms of the Big Five personality traits)"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personality"},
   :rdfs/subClassOf :dpvo-pd/Behavioral,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PhilosophicalBelief
  "Information about philosophical beliefs."
  {:db/ident :dpvo-pd/PhilosophicalBelief,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about philosophical beliefs."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Philosophical Belief"},
   :rdfs/subClassOf #{:dpvo/SpecialCategoryPersonalData
                      :dpvo-pd/KnowledgeBelief},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PhysicalAddress
  "Information about physical address."
  {:db/ident :dpvo-pd/PhysicalAddress,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about physical address."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Physical Address"},
   :rdfs/subClassOf :dpvo-pd/Contact,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PhysicalCharacteristic
  "Information about physical characteristics"
  {:db/ident :dpvo-pd/PhysicalCharacteristic,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about physical characteristics"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Physical Characteristic"},
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Demographic"},
   :rdfs/subClassOf :dpvo-pd/External,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PhysicalHealth
  "Information about physical health."
  {:db/ident :dpvo-pd/PhysicalHealth,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about physical health."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Physical Health"},
   :rdfs/subClassOf :dpvo-pd/Health,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PhysicalTrait
  "Information about defining traits or features regarding the body."
  {:db/ident :dpvo-pd/PhysicalTrait,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about defining traits or features regarding the body."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Physical Trait"},
   :rdfs/subClassOf :dpvo-pd/Demographic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Picture
  "Information about visual representation or image e.g. profile photo."
  {:db/ident :dpvo-pd/Picture,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about visual representation or image e.g. profile photo."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Picture"},
   :rdfs/subClassOf :dpvo-pd/Identifying,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Piercing
  "Information about piercings"
  {:db/ident :dpvo-pd/Piercing,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about piercings"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Piercing"},
   :rdfs/subClassOf :dpvo-pd/PhysicalCharacteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PoliticalAffiliation
  "Information about political affiliation and history"
  {:db/ident :dpvo-pd/PoliticalAffiliation,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about political affiliation and history"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Political Affiliation"},
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Political"},
   :rdfs/subClassOf #{:dpvo-pd/PublicLife :dpvo/SpecialCategoryPersonalData},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PoliticalOpinion
  "Information about opinions regarding politics and political topics"
  {:db/ident :dpvo-pd/PoliticalOpinion,
   :dcterms/created #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about opinions regarding politics and political topics"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Political Opinion"},
   :rdfs/subClassOf #{:dpvo-pd/PublicLife :dpvo/SpecialCategoryPersonalData},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Preference
  "Information about preferences or interests"
  {:db/ident :dpvo-pd/Preference,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about preferences or interests"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Preference"},
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Preference"},
   :rdfs/subClassOf :dpvo-pd/Internal,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Prescription
  "Information about medical and pharmaceutical prescriptions"
  {:db/ident :dpvo-pd/Prescription,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about medical and pharmaceutical prescriptions"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Prescription"},
   :rdfs/subClassOf :dpvo-pd/MedicalHealth,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PrivacyPreference
  "Information about privacy preferences"
  {:db/ident :dpvo-pd/PrivacyPreference,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about privacy preferences"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Privacy Preference"},
   :rdfs/subClassOf :dpvo-pd/Preference,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Proclivitie
  "Information about proclivities in a sexual context"
  {:db/ident :dpvo-pd/Proclivitie,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about proclivities in a sexual context"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Proclivitie"},
   :rdfs/subClassOf :dpvo-pd/Sexual,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Professional
  "Information about educational or professional career"
  {:db/ident :dpvo-pd/Professional,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about educational or professional career"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Professional"},
   :rdfs/subClassOf :dpvo-pd/Social,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ProfessionalCertification
  "Information about professional certifications"
  {:db/ident :dpvo-pd/ProfessionalCertification,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about professional certifications"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Professional Certification"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ProfessionalEvaluation
  "Information about professional evaluations"
  {:db/ident :dpvo-pd/ProfessionalEvaluation,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about professional evaluations"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Professional Evaluation"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ProfessionalInterview
  "Information about professional interviews"
  {:db/ident :dpvo-pd/ProfessionalInterview,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about professional interviews"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Professional Interview"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Profile
  "Profile or user profile is information and representation of characteristics associated with person(s) or group(s)"
  {:db/ident :dpvo-pd/Profile,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Profile or user profile is information and representation of characteristics associated with person(s) or group(s)"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Profile"},
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PublicLife
  "Information about public life"
  {:db/ident :dpvo-pd/PublicLife,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about public life"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Public Life"},
   :rdfs/subClassOf :dpvo-pd/Social,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PubliclyAvailableSocialMedia
  "Information about social media that is publicly available"
  {:db/ident :dpvo-pd/PubliclyAvailableSocialMedia,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about social media that is publicly available"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Publicly Available Social Media"},
   :rdfs/subClassOf :dpvo-pd/SocialMedia,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Purchase
  "Information about purchases such as items bought e.g. grocery or clothing"
  {:db/ident :dpvo-pd/Purchase,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about purchases such as items bought e.g. grocery or clothing"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Purchase"},
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Purchase"},
   :rdfs/subClassOf :dpvo-pd/Transactional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PurchasesAndSpendingHabit
  "Information about analysis of purchases made and money spent expressed as a habit e.g. monthly shopping trends"
  {:db/ident :dpvo-pd/PurchasesAndSpendingHabit,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about analysis of purchases made and money spent expressed as a habit e.g. monthly shopping trends"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Purchases and Spending Habit"},
   :rdfs/subClassOf :dpvo-pd/Transactional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Race
  "Information about race or racial history."
  {:db/ident :dpvo-pd/Race,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about race or racial history."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Race"},
   :rdfs/subClassOf #{:dpvo/SpecialCategoryPersonalData :dpvo-pd/Ethnicity},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Reference
  "Information about references in the professional context"
  {:db/ident :dpvo-pd/Reference,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about references in the professional context"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Reference"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Relationship
  "Information about relationships and relationship history."
  {:db/ident :dpvo-pd/Relationship,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about relationships and relationship history."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Relationship"},
   :rdfs/subClassOf :dpvo-pd/Family,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Reliability
  "Information about reliability (e.g. of a person)"
  {:db/ident            :dpvo-pd/Reliability,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about reliability (e.g. of a person)"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Reliability"},
   :rdfs/subClassOf     :dpvo-pd/Behavioral,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Religion
  "Information about religion, religious inclinations, and religious history."
  {:db/ident :dpvo-pd/Religion,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about religion, religious inclinations, and religious history."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Religion"},
   :rdfs/subClassOf #{:dpvo-pd/PublicLife :dpvo/SpecialCategoryPersonalData},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ReligiousBelief
  "Information about religion and religious beliefs."
  {:db/ident :dpvo-pd/ReligiousBelief,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about religion and religious beliefs."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Religious Belief"},
   :rdfs/subClassOf #{:dpvo/SpecialCategoryPersonalData
                      :dpvo-pd/KnowledgeBelief},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Retina
  "Information about retina and the retinal patterns."
  {:db/ident :dpvo-pd/Retina,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about retina and the retinal patterns."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Retina"},
   :rdfs/subClassOf :dpvo-pd/Biometric,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RoomNumber
  "Information about location expressed as Room number or similar numbering systems"
  {:db/ident :dpvo-pd/RoomNumber,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about location expressed as Room number or similar numbering systems"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Room Number"},
   :rdfs/subClassOf :dpvo-pd/Location,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Salary
  "Information about salary"
  {:db/ident :dpvo-pd/Salary,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about salary"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Salary"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Sale
  "Information about sales e.g. selling of goods or services"
  {:db/ident :dpvo-pd/Sale,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about sales e.g. selling of goods or services"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sale"},
   :rdfs/subClassOf :dpvo-pd/Transactional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def School
  "Information about school such as name of school, conduct, or grades obtained."
  {:db/ident :dpvo-pd/School,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about school such as name of school, conduct, or grades obtained."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "School"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SecretText
  "Information about secret text used in the process of authenticating the individual as an user accessing a system, e.g., when recovering a lost password."
  {:db/ident :dpvo-pd/SecretText,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about secret text used in the process of authenticating the individual as an user accessing a system, e.g., when recovering a lost password."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Secret Text"},
   :rdfs/subClassOf :dpvo-pd/Authenticating,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ServiceConsumptionBehavior
  "Information about the consumption of a service, e.g. time and duration of consumption."
  {:db/ident :dpvo-pd/ServiceConsumptionBehavior,
   :dcterms/created #inst "2019-11-26T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Harshvardhan J. Pandit"}
                      {:xsd/string "Rudy Jacob"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about the consumption of a service, e.g. time and duration of consumption."},
   :dcterms/source {:rdfa/uri "https://specialprivacy.ercim.eu/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Service Consumption Behavior"},
   :rdfs/subClassOf :dpvo-pd/Behavioral,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Sexual
  "Information about sexuality and sexual history"
  {:db/ident :dpvo-pd/Sexual,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about sexuality and sexual history"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sexual"},
   :rdfs/subClassOf #{:dpvo/SpecialCategoryPersonalData :dpvo-pd/External},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SexualHistory
  "Information about sexual history"
  {:db/ident :dpvo-pd/SexualHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about sexual history"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sexual History"},
   :rdfs/subClassOf :dpvo-pd/Sexual,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SexualPreference
  "Information about sexual preferences"
  {:db/ident :dpvo-pd/SexualPreference,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about sexual preferences"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sexual Preference"},
   :rdfs/subClassOf :dpvo-pd/Sexual,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Sibling
  "Information about sibling(s)."
  {:db/ident :dpvo-pd/Sibling,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about sibling(s)."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sibling"},
   :rdfs/subClassOf :dpvo-pd/FamilyStructure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SkinTone
  "Information about skin tone"
  {:db/ident :dpvo-pd/SkinTone,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about skin tone"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Skin Tone"},
   :rdfs/subClassOf :dpvo-pd/PhysicalCharacteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Social
  "Information about social aspects such as family, public life, or professional networks."
  {:db/ident :dpvo-pd/Social,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about social aspects such as family, public life, or professional networks."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Social"},
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SocialMedia
  "Information about social media"
  {:db/ident            :dpvo-pd/SocialMedia,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about social media"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Social Media"},
   :rdfs/subClassOf     :dpvo-pd/Communication,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def SocialMediaCommunication
  "Information about social media communication, including the communication itself and metadata."
  {:db/ident :dpvo-pd/SocialMediaCommunication,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about social media communication, including the communication itself and metadata."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Social Media Communication"},
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Social"},
   :rdfs/subClassOf :dpvo-pd/Communication,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SocialNetwork
  "Information about friends or connections expressed as a social network"
  {:db/ident :dpvo-pd/SocialNetwork,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about friends or connections expressed as a social network"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Social Network"},
   :rdfs/subClassOf :dpvo-pd/Social,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SocialStatus
  "Information about social status"
  {:db/ident :dpvo-pd/SocialStatus,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about social status"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Social Status"},
   :rdfs/subClassOf :dpvo-pd/PublicLife,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TVViewingBehavior
  "Information about TV viewing Behavior, such as timestamps of channel change, duration of viewership, content consumed"
  {:db/ident :dpvo-pd/TVViewingBehavior,
   :dcterms/created #inst "2019-11-26T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Harshvardhan J. Pandit"}
                      {:xsd/string "Rudy Jacob"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about TV viewing Behavior, such as timestamps of channel change, duration of viewership, content consumed"},
   :dcterms/source {:rdfa/uri "https://specialprivacy.ercim.eu/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "TV Viewing Behavior"},
   :rdfs/subClassOf :dpvo-pd/ServiceConsumptionBehavior,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Tattoo
  "Information about tattoos"
  {:db/ident :dpvo-pd/Tattoo,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about tattoos"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tattoo"},
   :rdfs/subClassOf :dpvo-pd/PhysicalCharacteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Tax
  "Information about financial tax e.g. tax records or tax due"
  {:db/ident :dpvo-pd/Tax,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about financial tax e.g. tax records or tax due"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tax"},
   :rdfs/subClassOf :dpvo-pd/Transactional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TelephoneNumber
  "Information about telephone number."
  {:db/ident :dpvo-pd/TelephoneNumber,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about telephone number."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Telephone Number"},
   :rdfs/subClassOf :dpvo-pd/Contact,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Thought
  "Information about thoughts"
  {:db/ident :dpvo-pd/Thought,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about thoughts"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Thought"},
   :rdfs/subClassOf :dpvo-pd/KnowledgeBelief,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Tracking
  "Information used to track an individual or group e.g. location or email"
  {:db/ident :dpvo-pd/Tracking,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information used to track an individual or group e.g. location or email"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tracking"},
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TradeUnionMembership
  "Information about trade union memberships and related topics"
  {:db/ident :dpvo-pd/TradeUnionMembership,
   :dcterms/created #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about trade union memberships and related topics"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Trade Union Membership"},
   :rdfs/subClassOf #{:dpvo/SpecialCategoryPersonalData
                      :dpvo-pd/GroupMembership},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Transaction
  "Information about financial transactions e.g. bank transfers"
  {:db/ident :dpvo-pd/Transaction,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about financial transactions e.g. bank transfers"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Transaction"},
   :rdfs/subClassOf :dpvo-pd/Transactional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Transactional
  "Information about a purchasing, spending or income"
  {:db/ident :dpvo-pd/Transactional,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about a purchasing, spending or income"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Transactional"},
   :rdfs/subClassOf :dpvo-pd/Financial,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TravelHistory
  "Information about travel history"
  {:db/ident            :dpvo-pd/TravelHistory,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about travel history"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Travel History"},
   :rdfs/subClassOf     :dpvo-pd/Location,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def UID
  "Information about unique identifiers."
  {:db/ident :dpvo-pd/UID,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about unique identifiers."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "UID"},
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#UniqueId"},
   :rdfs/subClassOf :dpvo-pd/Identifying,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UserAgent
  "Information about software acting on behalf of users e.g. web browser"
  {:db/ident :dpvo-pd/UserAgent,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about software acting on behalf of users e.g. web browser"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "User agent"},
   :rdfs/subClassOf :dpvo-pd/Tracking,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Username
  "Information about usernames."
  {:db/ident :dpvo-pd/Username,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about usernames."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Username"},
   :rdfs/subClassOf :dpvo-pd/Identifying,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VehicalLicenseNumber
  "Information about vehicle license number"
  {:db/ident            :dpvo-pd/VehicalLicenseNumber,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about vehicle license number"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Vehicle License Number"},
   :rdfs/subClassOf     :dpvo-pd/VehicleLicense,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def VehicalLicenseRegistration
  "Information about vehicle license registration"
  {:db/ident            :dpvo-pd/VehicalLicenseRegistration,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about vehicle license registration"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Vehicle License Registration"},
   :rdfs/subClassOf     :dpvo-pd/VehicleLicense,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Vehicle
  "Information about vehicles"
  {:db/ident            :dpvo-pd/Vehicle,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about vehicles"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Vehicle"},
   :rdfs/subClassOf     :dpvo-pd/External,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def VehicleLicense
  "Information about vehicle license"
  {:db/ident            :dpvo-pd/VehicleLicense,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about vehicle license"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Vehicle License"},
   :rdfs/subClassOf     #{:dpvo-pd/Vehicle :dpvo-pd/Identifying},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def VehicleUsage
  "Information about usage of vehicles, e.g. driving statistics"
  {:db/ident :dpvo-pd/VehicleUsage,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about usage of vehicles, e.g. driving statistics"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vehicle Usage"},
   :rdfs/subClassOf #{:dpvo-pd/Vehicle :dpvo-pd/Behavioral},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VoiceCommunicationRecording
  "Information about vocal recorded communication (e.g. telephony, VoIP)"
  {:db/ident :dpvo-pd/VoiceCommunicationRecording,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about vocal recorded communication (e.g. telephony, VoIP)"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Voice Communication Recording"},
   :rdfs/subClassOf :dpvo-pd/Communication,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VoiceMail
  "Information about voice mail messages."
  {:db/ident :dpvo-pd/VoiceMail,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about voice mail messages."},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Voice Mail"},
   :rdfs/subClassOf :dpvo-pd/Communication,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Weight
  "Information about physical weight"
  {:db/ident :dpvo-pd/Weight,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about physical weight"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Weight"},
   :rdfs/subClassOf :dpvo-pd/PhysicalCharacteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def WorkEnvironment
  "Information about work environments"
  {:db/ident            :dpvo-pd/WorkEnvironment,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about work environments"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Work Environment"},
   :rdfs/subClassOf     :dpvo-pd/Professional,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def WorkHistory
  "Information about work history in a professional context"
  {:db/ident :dpvo-pd/WorkHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:xsd/string "Fajar Ekaputra"}
                      {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about work history in a professional context"},
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Work History"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})