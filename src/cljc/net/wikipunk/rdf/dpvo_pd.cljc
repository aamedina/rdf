(ns net.wikipunk.rdf.dpvo-pd
  "DPV-PD is an extension to the Data Privacy Vocabulary that provides additional terms related to Personal Data categories."
  {:dcterms/abstract
   "DPV-PD is an extension to the Data Privacy Vocabulary that provides additional terms related to Personal Data categories.",
   :dcterms/contributor ["Rigo Wenning"
                         "Beatriz Esteves"
                         "Rob Brennan"
                         "Georg P Krog"
                         "Javier D. Fernández"
                         "David Hickey"
                         "Mark Lizar"
                         "Fajar J. Ekaputra"
                         "Harshvardhan J. Pandit"
                         "Julian Flake"
                         "Bert Bos"
                         "Elmar Kiesling"
                         "Piero Bonatti"
                         "Axel Polleres"
                         "Bud Bruegger"
                         "Eva Schlehahn"
                         "Paul Ryan"
                         "Simon Steyskal"
                         "Ramisa Gachpaz Hamed"],
   :dcterms/created #inst "2022-04-02T00:00:00.000-04:00",
   :dcterms/creator ["Axel Polleres" "Harshvardhan J. Pandit"],
   :dcterms/description
   "DPV-PD is an extension to the Data Privacy Vocabulary that provides additional terms related to Personal Data categories.",
   :dcterms/license "https://www.w3.org/Consortium/Legal/2015/doc-license",
   :dcterms/modified #inst "2022-12-05T00:00:00.000-05:00",
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :dcterms/title "DPV-PD: Personal Data Extension for DPV",
   :owl/imports "https://w3id.org/dpv/dpv-owl",
   :owl/versionInfo "1",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "dpvo-pd" "https://w3id.org/dpv/dpv-owl/dpv-pd#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vann" "http://purl.org/vocab/vann/",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "dpvo-pd",
   :rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd",
   :vann/preferredNamespacePrefix "dpvo-pd",
   :vann/preferredNamespaceUri "https://w3id.org/dpv/dpv-owl/dpv-pd#"})

(def Accent
  "Information about linguistic and speech accents."
  {:db/ident :dpvo-pd/Accent,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about linguistic and speech accents.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Accent",
   :rdfs/subClassOf
   [:dpvo-pd/Language :dpvo-pd/Accent :dpvo/PersonalData :dpvo-pd/External],
   :vs/term_status "accepted"})

(def AccountIdentifier
  "Information about financial account identifier."
  {:db/ident :dpvo-pd/AccountIdentifier,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about financial account identifier.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Account Identifier",
   :rdfs/subClassOf [:dpvo-pd/FinancialAccount
                     :dpvo-pd/AccountIdentifier
                     :dpvo/PersonalData
                     :dpvo-pd/Financial],
   :vs/term_status "accepted"})

(def Acquantaince
  "Information about acquaintainces in a social network."
  {:db/ident :dpvo-pd/Acquantaince,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about acquaintainces in a social network.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Acquantaince",
   :rdfs/subClassOf [:dpvo-pd/SocialNetwork
                     :dpvo-pd/Acquantaince
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def Age
  "Information about age"
  {:db/ident :dpvo-pd/Age,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about age",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Age",
   :rdfs/subClassOf [:dpvo-pd/PhysicalCharacteristic
                     :dpvo-pd/Age
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def AgeExact
  "Information about the exact age (i.e. to some degree within a year, month, or day)"
  {:db/ident :dpvo-pd/AgeExact,
   :dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Information about the exact age (i.e. to some degree within a year, month, or day)",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Age Exact",
   :rdfs/subClassOf [:dpvo-pd/AgeRange
                     :dpvo-pd/AgeExact
                     :dpvo-pd/Age
                     :dpvo/PersonalData
                     :dpvo-pd/PhysicalCharacteristic
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def AgeRange
  "Information about age range i.e. inexact age to some degree (i.e. some years)"
  {:db/ident :dpvo-pd/AgeRange,
   :dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Information about age range i.e. inexact age to some degree (i.e. some years)",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Age Range",
   :rdfs/subClassOf [:dpvo-pd/Age
                     :dpvo-pd/AgeRange
                     :dpvo/PersonalData
                     :dpvo-pd/PhysicalCharacteristic
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def ApartmentOwned
  "Information about apartment(s) owned and its history"
  {:db/ident :dpvo-pd/ApartmentOwned,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about apartment(s) owned and its history",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Apartment Owned",
   :rdfs/subClassOf [:dpvo-pd/HouseOwned
                     :dpvo-pd/ApartmentOwned
                     :dpvo/PersonalData
                     :dpvo-pd/Financial
                     :dpvo-pd/Ownership],
   :vs/term_status "accepted"})

(def Association
  "Information about associations in a social network with other individuals, groups, or entities e.g. friend of a friend"
  {:db/ident :dpvo-pd/Association,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about associations in a social network with other individuals, groups, or entities e.g. friend of a friend",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Association",
   :rdfs/subClassOf [:dpvo-pd/SocialNetwork
                     :dpvo-pd/Association
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def Attitude
  "Information about attitude."
  {:db/ident :dpvo-pd/Attitude,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about attitude.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Attitude",
   :rdfs/subClassOf
   [:dpvo-pd/Behavioral :dpvo-pd/Attitude :dpvo/PersonalData :dpvo-pd/External],
   :vs/term_status "accepted"})

(def Authenticating
  "Information about authentication and information used for authenticating"
  {:db/ident :dpvo-pd/Authenticating,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about authentication and information used for authenticating",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Authenticating",
   :rdfs/subClassOf
   [:dpvo-pd/Internal :dpvo-pd/Authenticating :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def AuthenticationHistory
  "Information about prior authentication and its outcomes such as login attempts or location."
  {:db/ident :dpvo-pd/AuthenticationHistory,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   "Information about prior authentication and its outcomes such as login attempts or location.",
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Authentication History",
   :rdfs/subClassOf [:dpvo-pd/Behavioral
                     :dpvo-pd/AuthenticationHistory
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def BankAccount
  "Information about bank accounts."
  {:db/ident :dpvo-pd/BankAccount,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about bank accounts.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Bank Account",
   :rdfs/subClassOf [:dpvo-pd/FinancialAccount
                     :dpvo-pd/BankAccount
                     :dpvo/PersonalData
                     :dpvo-pd/Financial],
   :vs/term_status "accepted"})

(def Behavioral
  "Information about Behavior or activity"
  {:db/ident :dpvo-pd/Behavioral,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about Behavior or activity",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Behavioral",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Activity"],
   :rdfs/subClassOf [:dpvo-pd/External :dpvo-pd/Behavioral :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def Biometric
  "Information about biometrics and biometric characteristics."
  {:db/ident :dpvo-pd/Biometric,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   "Information about biometrics and biometric characteristics.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Biometric",
   :rdfs/subClassOf [:dpvo-pd/Identifying
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/Biometric
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def BirthDate
  "Information about birth date"
  {:db/ident            :dpvo-pd/BirthDate,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Information about birth date",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          "Birth Date",
   :rdfs/subClassOf     [:dpvo-pd/Age
                         :dpvo-pd/BirthDate
                         :dpvo/PersonalData
                         :dpvo-pd/PhysicalCharacteristic
                         :dpvo-pd/External],
   :vs/term_status      "accepted"})

(def BirthPlace
  "Information about birth place"
  {:db/ident            :dpvo-pd/BirthPlace,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Information about birth place",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          "Birth Place",
   :rdfs/subClassOf     [:dpvo-pd/Location
                         :dpvo-pd/BirthPlace
                         :dpvo/PersonalData
                         :dpvo-pd/Tracking],
   :vs/term_status      "accepted"})

(def BloodType
  "Information about blood type."
  {:db/ident :dpvo-pd/BloodType,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about blood type.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Blood Type",
   :rdfs/subClassOf [:dpvo-pd/MedicalHealth
                     :dpvo-pd/BloodType
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def BrowserFingerprint
  "Information about the web browser which is used as a 'fingerprint'"
  {:db/ident :dpvo-pd/BrowserFingerprint,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about the web browser which is used as a 'fingerprint'",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Browser Fingerprint",
   :rdfs/subClassOf [:dpvo-pd/DeviceBased
                     :dpvo-pd/BrowserFingerprint
                     :dpvo/PersonalData
                     :dpvo-pd/Tracking],
   :vs/term_status "accepted"})

(def BrowserHistory
  "Information about and including web browsing history"
  {:db/ident            :dpvo-pd/BrowserHistory,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Information about and including web browsing history",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          "Browser History",
   :rdfs/subClassOf     [:dpvo-pd/BrowsingBehavior
                         :dpvo-pd/BrowserHistory
                         :dpvo/PersonalData
                         :dpvo-pd/Behavioral
                         :dpvo-pd/External],
   :vs/term_status      "accepted"})

(def BrowsingBehavior
  "Information about browsing Behavior."
  {:db/ident :dpvo-pd/BrowsingBehavior,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about browsing Behavior.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Browsing Behavior",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#OnlineActivity"],
   :rdfs/subClassOf [:dpvo-pd/Behavioral
                     :dpvo-pd/BrowsingBehavior
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def BrowsingReferral
  "Information about web browsing referrer or referral, which can be based on location, targeted referrals, direct, organic search, social media or actions, campaigns."
  {:db/ident :dpvo-pd/BrowsingReferral,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   "Information about web browsing referrer or referral, which can be based on location, targeted referrals, direct, organic search, social media or actions, campaigns.",
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Browsing Referral",
   :rdfs/subClassOf [:dpvo-pd/BrowsingBehavior
                     :dpvo-pd/BrowsingReferral
                     :dpvo/PersonalData
                     :dpvo-pd/Behavioral
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def CallLog
  "Information about the calls that an individual has made."
  {:db/ident :dpvo-pd/CallLog,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about the calls that an individual has made.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Call Log",
   :rdfs/subClassOf
   [:dpvo-pd/Behavioral :dpvo-pd/CallLog :dpvo/PersonalData :dpvo-pd/External],
   :vs/term_status "accepted"})

(def CarOwned
  "Information about cars ownership and ownership history."
  {:db/ident :dpvo-pd/CarOwned,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about cars ownership and ownership history.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Car Owned",
   :rdfs/subClassOf
   [:dpvo-pd/Ownership :dpvo-pd/CarOwned :dpvo/PersonalData :dpvo-pd/Financial],
   :vs/term_status "accepted"})

(def CharacterClass
  "Information about character in the public sphere"
  {:db/ident :dpvo-pd/Character,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about character in the public sphere",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Character",
   :rdfs/subClassOf
   [:dpvo-pd/PublicLife :dpvo-pd/Character :dpvo/PersonalData :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def Communication
  "Information communicated from or to an individual"
  {:db/ident :dpvo-pd/Communication,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information communicated from or to an individual",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Communication",
   :rdfs/subClassOf [:dpvo-pd/Social :dpvo-pd/Communication :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def CommunicationsMetadata
  "Information about communication metadata in the public sphere"
  {:db/ident :dpvo-pd/CommunicationsMetadata,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   "Information about communication metadata in the public sphere",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Communications Metadata",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Interactive"],
   :rdfs/subClassOf [:dpvo-pd/PublicLife
                     :dpvo-pd/CommunicationsMetadata
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def Connection
  "Information about and including connections in a social network"
  {:db/ident :dpvo-pd/Connection,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about and including connections in a social network",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Connection",
   :rdfs/subClassOf [:dpvo-pd/SocialNetwork
                     :dpvo-pd/Connection
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def Contact
  "Information about contacts or used for contacting e.g. email address or phone number"
  {:db/ident :dpvo-pd/Contact,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about contacts or used for contacting e.g. email address or phone number",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Contact",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Physical"],
   :rdfs/subClassOf [:dpvo-pd/Tracking :dpvo-pd/Contact :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def Country
  "Information about country e.g. residence, travel."
  {:db/ident :dpvo-pd/Country,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about country e.g. residence, travel.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Country",
   :rdfs/subClassOf
   [:dpvo-pd/Location :dpvo-pd/Country :dpvo/PersonalData :dpvo-pd/Tracking],
   :vs/term_status "accepted"})

(def Credit
  "Information about reputation with regards to money"
  {:db/ident :dpvo-pd/Credit,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about reputation with regards to money",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Credit",
   :rdfs/subClassOf [:dpvo-pd/Transactional
                     :dpvo-pd/Credit
                     :dpvo/PersonalData
                     :dpvo-pd/Financial],
   :vs/term_status "accepted"})

(def CreditCapacity
  "Information about credit capacity."
  {:db/ident :dpvo-pd/CreditCapacity,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about credit capacity.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Credit Capacity",
   :rdfs/subClassOf [:dpvo-pd/Credit
                     :dpvo-pd/CreditCapacity
                     :dpvo/PersonalData
                     :dpvo-pd/Transactional
                     :dpvo-pd/Financial],
   :vs/term_status "accepted"})

(def CreditCardNumber
  "Information about credit card number"
  {:db/ident :dpvo-pd/CreditCardNumber,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about credit card number",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Credit Card Number",
   :rdfs/subClassOf [:dpvo-pd/PaymentCardNumber
                     :dpvo-pd/CreditCardNumber
                     :dpvo/PersonalData
                     :dpvo-pd/PaymentCard
                     :dpvo-pd/FinancialAccount
                     :dpvo-pd/AccountIdentifier
                     :dpvo-pd/Financial],
   :vs/term_status "accepted"})

(def CreditRecord
  "Information about credit record."
  {:db/ident :dpvo-pd/CreditRecord,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about credit record.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Credit Record",
   :rdfs/subClassOf [:dpvo-pd/Credit
                     :dpvo-pd/CreditRecord
                     :dpvo/PersonalData
                     :dpvo-pd/Transactional
                     :dpvo-pd/Financial],
   :vs/term_status "accepted"})

(def CreditScore
  "Information about credit score."
  {:db/ident :dpvo-pd/CreditScore,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about credit score.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Credit Score",
   :rdfs/subClassOf [:dpvo-pd/CreditWorthiness
                     :dpvo-pd/CreditScore
                     :dpvo/PersonalData
                     :dpvo-pd/Transactional
                     :dpvo-pd/Credit
                     :dpvo-pd/Financial],
   :vs/term_status "accepted"})

(def CreditStanding
  "Information about credit standing."
  {:db/ident :dpvo-pd/CreditStanding,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about credit standing.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Credit Standing",
   :rdfs/subClassOf [:dpvo-pd/Credit
                     :dpvo-pd/CreditStanding
                     :dpvo/PersonalData
                     :dpvo-pd/Transactional
                     :dpvo-pd/Financial],
   :vs/term_status "accepted"})

(def CreditWorthiness
  "Information about credit worthiness."
  {:db/ident :dpvo-pd/CreditWorthiness,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about credit worthiness.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Credit Worthiness",
   :rdfs/subClassOf [:dpvo-pd/Credit
                     :dpvo-pd/CreditWorthiness
                     :dpvo/PersonalData
                     :dpvo-pd/Transactional
                     :dpvo-pd/Financial],
   :vs/term_status "accepted"})

(def Criminal
  "Information about criminal activity e.g. criminal convictions or jail time"
  {:db/ident :dpvo-pd/Criminal,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   "Information about criminal activity e.g. criminal convictions or jail time",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Criminal",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Judicial"],
   :rdfs/subClassOf [:dpvo-pd/Social :dpvo-pd/Criminal :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def CriminalCharge
  "Information about criminal charges."
  {:db/ident :dpvo-pd/CriminalCharge,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about criminal charges.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Criminal Charge",
   :rdfs/subClassOf [:dpvo-pd/Criminal
                     :dpvo-pd/CriminalCharge
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def CriminalConviction
  "Information about criminal convictions."
  {:db/ident :dpvo-pd/CriminalConviction,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about criminal convictions.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Criminal Conviction",
   :rdfs/subClassOf [:dpvo-pd/Criminal
                     :dpvo-pd/CriminalConviction
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def CriminalOffense
  "Information about criminal offenses"
  {:db/ident            :dpvo-pd/CriminalOffense,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description "Information about criminal offenses",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          "Criminal Offense",
   :rdfs/subClassOf     [:dpvo-pd/Criminal
                         :dpvo-pd/CriminalOffense
                         :dpvo/PersonalData
                         :dpvo-pd/Social],
   :vs/term_status      "accepted"})

(def CriminalPardon
  "Information about criminal pardons."
  {:db/ident :dpvo-pd/CriminalPardon,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about criminal pardons.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Criminal Pardon",
   :rdfs/subClassOf [:dpvo-pd/Criminal
                     :dpvo-pd/CriminalPardon
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def CurrentEmployment
  "Information about current employment"
  {:db/ident            :dpvo-pd/CurrentEmployment,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Information about current employment",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          "Current Employment",
   :rdfs/subClassOf     [:dpvo-pd/EmploymentHistory
                         :dpvo-pd/CurrentEmployment
                         :dpvo/PersonalData
                         :dpvo-pd/Professional
                         :dpvo-pd/Social],
   :vs/term_status      "accepted"})

(def DNACode
  "Information about DNA."
  {:db/ident :dpvo-pd/DNACode,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about DNA.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "DNA Code",
   :rdfs/subClassOf [:dpvo-pd/MedicalHealth
                     :dpvo-pd/DNACode
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def Demeanor
  "Information about demeanor."
  {:db/ident :dpvo-pd/Demeanor,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about demeanor.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Demeanor",
   :rdfs/subClassOf
   [:dpvo-pd/Behavioral :dpvo-pd/Demeanor :dpvo/PersonalData :dpvo-pd/External],
   :vs/term_status "accepted"})

(def Demographic
  "Information about demography and demographic characteristics"
  {:db/ident :dpvo-pd/Demographic,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about demography and demographic characteristics",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Demographic",
   :rdfs/subClassOf [:dpvo-pd/External :dpvo-pd/Demographic :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def DeviceApplications
  "Information about applications or application-like software on a device."
  {:db/ident :dpvo-pd/DeviceApplications,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator
   ["Georg P Krog" "Harshvardhan J. Pandit" "Beatriz Esteves" "Paul Ryan"],
   :dcterms/description
   "Information about applications or application-like software on a device.",
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Device Applications",
   :rdfs/subClassOf [:dpvo-pd/DeviceSoftware
                     :dpvo-pd/DeviceApplications
                     :dpvo/PersonalData
                     :dpvo-pd/DeviceBased
                     :dpvo-pd/Tracking],
   :vs/term_status "accepted"})

(def DeviceBased
  "Information about devices"
  {:db/ident :dpvo-pd/DeviceBased,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about devices",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Device Based",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Computer"],
   :rdfs/subClassOf [:dpvo-pd/Tracking :dpvo-pd/DeviceBased :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def DeviceOperatingSystem
  "Information about the operating system (OS) or system software that manages hardware or software resources."
  {:db/ident :dpvo-pd/DeviceOperatingSystem,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator
   ["Beatriz Esteves" "Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   "Information about the operating system (OS) or system software that manages hardware or software resources.",
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Device Operating System",
   :rdfs/subClassOf [:dpvo-pd/DeviceSoftware
                     :dpvo-pd/DeviceOperatingSystem
                     :dpvo/PersonalData
                     :dpvo-pd/DeviceBased
                     :dpvo-pd/Tracking],
   :vs/term_status "accepted"})

(def DeviceSoftware
  "Information about software on or related to a device."
  {:db/ident            :dpvo-pd/DeviceSoftware,
   :dcterms/created     #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator     ["Harshvardhan J. Pandit"
                         "Georg P Krog"
                         "Beatriz Esteves"
                         "Paul Ryan"],
   :dcterms/description "Information about software on or related to a device.",
   :dcterms/source      "https://www.w3.org/community/dpvcg/",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          "Device Software",
   :rdfs/subClassOf     [:dpvo-pd/DeviceBased
                         :dpvo-pd/DeviceSoftware
                         :dpvo/PersonalData
                         :dpvo-pd/Tracking],
   :vs/term_status      "accepted"})

(def Dialect
  "Information about linguistic dialects."
  {:db/ident :dpvo-pd/Dialect,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about linguistic dialects.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Dialect",
   :rdfs/subClassOf
   [:dpvo-pd/Language :dpvo-pd/Dialect :dpvo/PersonalData :dpvo-pd/External],
   :vs/term_status "accepted"})

(def DigitalFingerprint
  "Information about a 'digital fingerprint' created for identification"
  {:db/ident :dpvo-pd/DigitalFingerprint,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Information about a 'digital fingerprint' created for identification",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Digital Fingerprint",
   :rdfs/subClassOf
   [:dpvo-pd/Tracking :dpvo-pd/DigitalFingerprint :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def Disability
  "Information about disabilities."
  {:db/ident :dpvo-pd/Disability,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about disabilities.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Disability",
   :rdfs/subClassOf [:dpvo-pd/MedicalHealth
                     :dpvo-pd/Disability
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def DisciplinaryAction
  "Information about disciplinary actions and its history"
  {:db/ident :dpvo-pd/DisciplinaryAction,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about disciplinary actions and its history",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Disciplinary Action",
   :rdfs/subClassOf [:dpvo-pd/Professional
                     :dpvo-pd/DisciplinaryAction
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def Dislike
  "Information about dislikes or preferences regarding repulsions."
  {:db/ident :dpvo-pd/Dislike,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about dislikes or preferences regarding repulsions.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Dislike",
   :rdfs/subClassOf [:dpvo-pd/Interest
                     :dpvo-pd/Dislike
                     :dpvo/PersonalData
                     :dpvo-pd/Internal
                     :dpvo-pd/Preference],
   :vs/term_status "accepted"})

(def Divorce
  "Information about divorce(s)."
  {:db/ident :dpvo-pd/Divorce,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about divorce(s).",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Divorce",
   :rdfs/subClassOf [:dpvo-pd/FamilyStructure
                     :dpvo-pd/Divorce
                     :dpvo/PersonalData
                     :dpvo-pd/Family
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def DrugTestResult
  "Information about drug test results."
  {:db/ident :dpvo-pd/DrugTestResult,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about drug test results.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Drug Test Result",
   :rdfs/subClassOf [:dpvo-pd/MedicalHealth
                     :dpvo-pd/DrugTestResult
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def Education
  "Information about education"
  {:db/ident            :dpvo-pd/Education,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Information about education",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          "Education",
   :rdfs/subClassOf     [:dpvo-pd/Professional
                         :dpvo-pd/Education
                         :dpvo/PersonalData
                         :dpvo-pd/Social],
   :vs/term_status      "accepted"})

(def EducationExperience
  "Information about education experience e.g. attending a university"
  {:db/ident :dpvo-pd/EducationExperience,
   :dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Information about education experience e.g. attending a university",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Education Experience",
   :rdfs/subClassOf [:dpvo-pd/Education
                     :dpvo-pd/EducationExperience
                     :dpvo/PersonalData
                     :dpvo-pd/Professional
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def EducationQualification
  "Information about educational qualifications"
  {:db/ident            :dpvo-pd/EducationQualification,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Information about educational qualifications",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          "Education Qualification",
   :rdfs/subClassOf     [:dpvo-pd/Education
                         :dpvo-pd/EducationQualification
                         :dpvo/PersonalData
                         :dpvo-pd/Professional
                         :dpvo-pd/Social],
   :vs/term_status      "accepted"})

(def EmailAddress
  "Information about Email address."
  {:db/ident :dpvo-pd/EmailAddress,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about Email address.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Email Address",
   :rdfs/subClassOf [:dpvo-pd/Contact
                     :dpvo-pd/EmailAddress
                     :dpvo/PersonalData
                     :dpvo-pd/Tracking],
   :vs/term_status "accepted"})

(def EmailAddressPersonal
  "Information about Email address used in Personal capacity"
  {:db/ident :dpvo-pd/EmailAddressPersonal,
   :dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Information about Email address used in Personal capacity",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Email Address Personal",
   :rdfs/subClassOf [:dpvo-pd/EmailAddress
                     :dpvo-pd/EmailAddressPersonal
                     :dpvo-pd/Contact
                     :dpvo/PersonalData
                     :dpvo-pd/Tracking],
   :vs/term_status "accepted"})

(def EmailAddressWork
  "Information about Email address used for Work or in Professional capacity"
  {:db/ident :dpvo-pd/EmailAddressWork,
   :dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Information about Email address used for Work or in Professional capacity",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Email Address Work",
   :rdfs/subClassOf [:dpvo-pd/EmailAddress
                     :dpvo-pd/EmailAddressWork
                     :dpvo-pd/Contact
                     :dpvo/PersonalData
                     :dpvo-pd/Tracking],
   :vs/term_status "accepted"})

(def EmailContent
  "Information about the contents of Emails sent or received"
  {:db/ident :dpvo-pd/EmailContent,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   "Information about the contents of Emails sent or received",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Email Content",
   :rdfs/subClassOf [:dpvo-pd/Communication
                     :dpvo-pd/EmailContent
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def EmploymentHistory
  "Information about employment history"
  {:db/ident :dpvo-pd/EmploymentHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about employment history",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Employment History",
   :rdfs/subClassOf [:dpvo-pd/Professional
                     :dpvo-pd/EmploymentHistory
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def EthnicOrigin
  "Information about ethnic origin"
  {:db/ident :dpvo-pd/EthnicOrigin,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about ethnic origin",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Ethnic Origin",
   :rdfs/subClassOf [:dpvo-pd/Ethnicity
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/EthnicOrigin
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def Ethnicity
  "Information about ethnic origins and lineage"
  {:db/ident :dpvo-pd/Ethnicity,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about ethnic origins and lineage",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Ethnicity",
   :rdfs/subClassOf [:dpvo-pd/External :dpvo-pd/Ethnicity :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def External
  "Information about external characteristics that can be observed"
  {:db/ident :dpvo-pd/External,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about external characteristics that can be observed",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "External",
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo-pd/External],
   :vs/term_status "accepted"})

(def FacialPrint
  "Information about facial print or pattern"
  {:db/ident            :dpvo-pd/FacialPrint,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Information about facial print or pattern",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          "Facial Print",
   :rdfs/subClassOf     [:dpvo-pd/Biometric
                         :dpvo-pd/FacialPrint
                         :dpvo/PersonalData
                         :dpvo-pd/Identifying
                         :dpvo/SpecialCategoryPersonalData
                         :dpvo-pd/External],
   :vs/term_status      "accepted"})

(def Family
  "Information about family and relationships"
  {:db/ident :dpvo-pd/Family,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about family and relationships",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Family",
   :rdfs/subClassOf [:dpvo-pd/Social :dpvo-pd/Family :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def FamilyHealthHistory
  "Information about family health history."
  {:db/ident :dpvo-pd/FamilyHealthHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about family health history.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Family Health History",
   :rdfs/subClassOf [:dpvo-pd/HealthHistory
                     :dpvo-pd/FamilyHealthHistory
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/External
                     :dpvo-pd/MedicalHealth],
   :vs/term_status "accepted"})

(def FamilyStructure
  "Information about family and familial structure."
  {:db/ident :dpvo-pd/FamilyStructure,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about family and familial structure.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Family Structure",
   :rdfs/subClassOf [:dpvo-pd/Family
                     :dpvo-pd/FamilyStructure
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def Favorite
  "Information about favorites"
  {:db/ident :dpvo-pd/Favorite,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about favorites",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Favorite",
   :rdfs/subClassOf
   [:dpvo-pd/Preference :dpvo-pd/Favorite :dpvo/PersonalData :dpvo-pd/Internal],
   :vs/term_status "accepted"})

(def FavoriteColor
  "Information about favorite color."
  {:db/ident :dpvo-pd/FavoriteColor,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about favorite color.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Favorite Color",
   :rdfs/subClassOf [:dpvo-pd/Favorite
                     :dpvo-pd/FavoriteColor
                     :dpvo/PersonalData
                     :dpvo-pd/Internal
                     :dpvo-pd/Preference],
   :vs/term_status "accepted"})

(def FavoriteFood
  "Information about favorite food."
  {:db/ident :dpvo-pd/FavoriteFood,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about favorite food.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Favorite Food",
   :rdfs/subClassOf [:dpvo-pd/Favorite
                     :dpvo-pd/FavoriteFood
                     :dpvo/PersonalData
                     :dpvo-pd/Internal
                     :dpvo-pd/Preference],
   :vs/term_status "accepted"})

(def FavoriteMusic
  "Information about favorite music."
  {:db/ident :dpvo-pd/FavoriteMusic,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about favorite music.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Favorite Music",
   :rdfs/subClassOf [:dpvo-pd/Favorite
                     :dpvo-pd/FavoriteMusic
                     :dpvo/PersonalData
                     :dpvo-pd/Internal
                     :dpvo-pd/Preference],
   :vs/term_status "accepted"})

(def Fetish
  "Information about an individual's sexual fetishes"
  {:db/ident :dpvo-pd/Fetish,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about an individual's sexual fetishes",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Fetish",
   :rdfs/subClassOf [:dpvo-pd/Sexual
                     :dpvo-pd/Fetish
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def Financial
  "Information about finance including monetary characteristics and transactions"
  {:db/ident :dpvo-pd/Financial,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about finance including monetary characteristics and transactions",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Financial",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Financial"],
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo-pd/Financial],
   :vs/term_status "accepted"})

(def FinancialAccount
  "Information about financial accounts."
  {:db/ident :dpvo-pd/FinancialAccount,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about financial accounts.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Financial Account",
   :rdfs/subClassOf
   [:dpvo-pd/Financial :dpvo-pd/FinancialAccount :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def FinancialAccountNumber
  "Information about financial account number"
  {:db/ident :dpvo-pd/FinancialAccountNumber,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about financial account number",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Financial Account Number",
   :rdfs/subClassOf [:dpvo-pd/AccountIdentifier
                     :dpvo-pd/FinancialAccountNumber
                     :dpvo/PersonalData
                     :dpvo-pd/FinancialAccount
                     :dpvo-pd/Financial],
   :vs/term_status "accepted"})

(def FinancialStatus
  "Information about financial status or standing"
  {:db/ident            :dpvo-pd/FinancialStatus,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Information about financial status or standing",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          "Financial Status",
   :rdfs/subClassOf     [:dpvo-pd/Financial
                         :dpvo-pd/FinancialStatus
                         :dpvo/PersonalData],
   :vs/term_status      "accepted"})

(def Fingerprint
  "Information about fingerprint used for biometric purposes."
  {:db/ident :dpvo-pd/Fingerprint,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about fingerprint used for biometric purposes.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Fingerprint",
   :rdfs/subClassOf [:dpvo-pd/Biometric
                     :dpvo-pd/Fingerprint
                     :dpvo/PersonalData
                     :dpvo-pd/Identifying
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def Friend
  "Information about friends in a social network, including aspects of friendships such as years together or nature of friendship."
  {:db/ident :dpvo-pd/Friend,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about friends in a social network, including aspects of friendships such as years together or nature of friendship.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Friend",
   :rdfs/subClassOf
   [:dpvo-pd/SocialNetwork :dpvo-pd/Friend :dpvo/PersonalData :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def GPSCoordinate
  "Information about location expressed using Global Position System coordinates (GPS)"
  {:db/ident :dpvo-pd/GPSCoordinate,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   "Information about location expressed using Global Position System coordinates (GPS)",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "GPS Coordinate",
   :rdfs/subClassOf [:dpvo-pd/Location
                     :dpvo-pd/GPSCoordinate
                     :dpvo/PersonalData
                     :dpvo-pd/Tracking],
   :vs/term_status "accepted"})

(def Gender
  "Information about gender"
  {:db/ident :dpvo-pd/Gender,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about gender",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Gender",
   :rdfs/subClassOf [:dpvo-pd/PhysicalCharacteristic
                     :dpvo-pd/Gender
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def GeneralReputation
  "Information about reputation in the public sphere"
  {:db/ident :dpvo-pd/GeneralReputation,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about reputation in the public sphere",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "General Reputation",
   :rdfs/subClassOf [:dpvo-pd/PublicLife
                     :dpvo-pd/GeneralReputation
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def Genetic
  "Information about inherited or acquired genetic characteristics"
  {:db/ident :dpvo-pd/Genetic,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Information about inherited or acquired genetic characteristics",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Genetic",
   :rdfs/subClassOf [:dpvo-pd/Health
                     :dpvo-pd/Genetic
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/External
                     :dpvo-pd/MedicalHealth],
   :vs/term_status "accepted"})

(def Geographic
  "Information about location or based on geography (e.g. home address)"
  {:db/ident :dpvo-pd/Geographic,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about location or based on geography (e.g. home address)",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Geographic",
   :rdfs/subClassOf [:dpvo-pd/Demographic
                     :dpvo-pd/Geographic
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def GroupMembership
  "Information about groups and memberships included or associated with a social network"
  {:db/ident :dpvo-pd/GroupMembership,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about groups and memberships included or associated with a social network",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Group Membership",
   :rdfs/subClassOf [:dpvo-pd/SocialNetwork
                     :dpvo-pd/GroupMembership
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def HairColor
  "Information about hair color"
  {:db/ident :dpvo-pd/HairColor,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about hair color",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Hair Color",
   :rdfs/subClassOf [:dpvo-pd/PhysicalCharacteristic
                     :dpvo-pd/HairColor
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def Health
  "Information about health."
  {:db/ident :dpvo-pd/Health,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about health.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Health",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Health"],
   :rdfs/subClassOf [:dpvo-pd/MedicalHealth
                     :dpvo-pd/Health
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def HealthHistory
  "Information about health history."
  {:db/ident :dpvo-pd/HealthHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about health history.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Health History",
   :rdfs/subClassOf [:dpvo-pd/MedicalHealth
                     :dpvo-pd/HealthHistory
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def HealthRecord
  "Information about health record."
  {:db/ident :dpvo-pd/HealthRecord,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about health record.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Health Record",
   :rdfs/subClassOf [:dpvo-pd/MedicalHealth
                     :dpvo-pd/HealthRecord
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def Height
  "Information about physical height"
  {:db/ident :dpvo-pd/Height,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about physical height",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Height",
   :rdfs/subClassOf [:dpvo-pd/PhysicalCharacteristic
                     :dpvo-pd/Height
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def Historical
  "Information about historical data related to or relevant regarding history or past events"
  {:db/ident :dpvo-pd/Historical,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   "Information about historical data related to or relevant regarding history or past events",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Historical",
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo-pd/Historical],
   :vs/term_status "accepted"})

(def HouseOwned
  "Information about house(s) owned and ownership history."
  {:db/ident :dpvo-pd/HouseOwned,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   "Information about house(s) owned and ownership history.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "House Owned",
   :rdfs/subClassOf [:dpvo-pd/Ownership
                     :dpvo-pd/HouseOwned
                     :dpvo/PersonalData
                     :dpvo-pd/Financial],
   :vs/term_status "accepted"})

(def Household
  "Information about personal or household activities"
  {:db/ident            :dpvo-pd/Household,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Information about personal or household activities",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          "Household",
   :rdfs/subClassOf     [:dpvo/PersonalData :dpvo-pd/Household],
   :vs/term_status      "accepted"})

(def IPAddress
  "Information about the Internet Protocol (IP) address of a device"
  {:db/ident :dpvo-pd/IPAddress,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about the Internet Protocol (IP) address of a device",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "IP Address",
   :rdfs/subClassOf [:dpvo-pd/DeviceBased
                     :dpvo-pd/IPAddress
                     :dpvo/PersonalData
                     :dpvo-pd/Tracking],
   :vs/term_status "accepted"})

(def Identifier
  "Information about an identifier or name used for identification"
  {:db/ident :dpvo-pd/Identifier,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Information about an identifier or name used for identification",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Identifier",
   :rdfs/subClassOf [:dpvo-pd/Tracking :dpvo-pd/Identifier :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def Identifying
  "Information that uniquely or semi-uniquely identifies an individual or a group"
  {:db/ident :dpvo-pd/Identifying,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information that uniquely or semi-uniquely identifies an individual or a group",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Identifying",
   :rdfs/subClassOf [:dpvo-pd/External :dpvo-pd/Identifying :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def Income
  "Information about financial income e.g. for individual or household or family"
  {:db/ident :dpvo-pd/Income,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about financial income e.g. for individual or household or family",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Income",
   :rdfs/subClassOf [:dpvo-pd/Transactional
                     :dpvo-pd/Income
                     :dpvo/PersonalData
                     :dpvo-pd/Financial],
   :vs/term_status "accepted"})

(def IncomeBracket
  "Information about income bracket."
  {:db/ident :dpvo-pd/IncomeBracket,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about income bracket.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Income Bracket",
   :rdfs/subClassOf [:dpvo-pd/Demographic
                     :dpvo-pd/IncomeBracket
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def IndividualHealthHistory
  "Information about information health history."
  {:db/ident :dpvo-pd/IndividualHealthHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about information health history.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Individual Health History",
   :rdfs/subClassOf [:dpvo-pd/HealthHistory
                     :dpvo-pd/IndividualHealthHistory
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/External
                     :dpvo-pd/MedicalHealth],
   :vs/term_status "accepted"})

(def Insurance
  "Information about Insurance"
  {:db/ident            :dpvo-pd/Insurance,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Information about Insurance",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          "Insurance",
   :rdfs/subClassOf     [:dpvo-pd/Financial
                         :dpvo-pd/Insurance
                         :dpvo/PersonalData],
   :vs/term_status      "accepted"})

(def Intention
  "Information about intentions"
  {:db/ident :dpvo-pd/Intention,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about intentions",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Intention",
   :rdfs/subClassOf [:dpvo-pd/Preference
                     :dpvo-pd/Intention
                     :dpvo/PersonalData
                     :dpvo-pd/Internal],
   :vs/term_status "accepted"})

(def Interaction
  "Information about interactions in the public sphere"
  {:db/ident :dpvo-pd/Interaction,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about interactions in the public sphere",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Interaction",
   :rdfs/subClassOf [:dpvo-pd/PublicLife
                     :dpvo-pd/Interaction
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def Interest
  "Information about interests"
  {:db/ident :dpvo-pd/Interest,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about interests",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Interest",
   :rdfs/subClassOf
   [:dpvo-pd/Preference :dpvo-pd/Interest :dpvo/PersonalData :dpvo-pd/Internal],
   :vs/term_status "accepted"})

(def Internal
  "Informatoin about internal characteristics that cannot be seen or observed"
  {:db/ident :dpvo-pd/Internal,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Informatoin about internal characteristics that cannot be seen or observed",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Internal",
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo-pd/Internal],
   :vs/term_status "accepted"})

(def Job
  "Information about professional jobs"
  {:db/ident :dpvo-pd/Job,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about professional jobs",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Job",
   :rdfs/subClassOf
   [:dpvo-pd/Professional :dpvo-pd/Job :dpvo/PersonalData :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def KnowledgeBelief
  "Information about knowledge and beliefs"
  {:db/ident :dpvo-pd/KnowledgeBelief,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about knowledge and beliefs",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Knowledge and Beliefs",
   :rdfs/subClassOf
   [:dpvo-pd/Internal :dpvo-pd/KnowledgeBelief :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def Language
  "Information about language and lingual history."
  {:db/ident :dpvo-pd/Language,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about language and lingual history.",
   :dcterms/modified #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Language",
   :rdfs/subClassOf [:dpvo-pd/External :dpvo-pd/Language :dpvo/PersonalData],
   :vs/term_status "changed"})

(def LifeHistory
  "Information about personal history regarding events or activities - including their occurrences that might be directly related or have had an influence (e.g. World War, 9/11)"
  {:db/ident :dpvo-pd/LifeHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about personal history regarding events or activities - including  their occurrences that might be directly related or have had an influence (e.g. World War, 9/11)",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Life History",
   :rdfs/subClassOf
   [:dpvo-pd/Historical :dpvo-pd/LifeHistory :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def Like
  "Information about likes or preferences regarding attractions."
  {:db/ident :dpvo-pd/Like,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about likes or preferences regarding attractions.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Like",
   :rdfs/subClassOf [:dpvo-pd/Interest
                     :dpvo-pd/Like
                     :dpvo/PersonalData
                     :dpvo-pd/Internal
                     :dpvo-pd/Preference],
   :vs/term_status "accepted"})

(def LinkClicked
  "Information about the links that an individual has clicked."
  {:db/ident :dpvo-pd/LinkClicked,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   "Information about the links that an individual has clicked.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Link Clicked",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Navigation"],
   :rdfs/subClassOf [:dpvo-pd/Behavioral
                     :dpvo-pd/LinkClicked
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def LoanRecord
  "Information about loans, whether applied, provided or rejected, and its history"
  {:db/ident :dpvo-pd/LoanRecord,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   "Information about loans, whether applied, provided or rejected, and its history",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Loan Record",
   :rdfs/subClassOf [:dpvo-pd/Transactional
                     :dpvo-pd/LoanRecord
                     :dpvo/PersonalData
                     :dpvo-pd/Financial],
   :vs/term_status "accepted"})

(def Location
  "Information about location"
  {:db/ident :dpvo-pd/Location,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about location",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Location",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Location"],
   :rdfs/subClassOf [:dpvo-pd/Tracking :dpvo-pd/Location :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def MACAddress
  "Information about the Media Access Control (MAC) address of a device"
  {:db/ident :dpvo-pd/MACAddress,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about the Media Access Control (MAC) address of a device",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "MAC Address",
   :rdfs/subClassOf [:dpvo-pd/DeviceBased
                     :dpvo-pd/MACAddress
                     :dpvo/PersonalData
                     :dpvo-pd/Tracking],
   :vs/term_status "accepted"})

(def MaritalStatus
  "Information about marital status and history"
  {:db/ident :dpvo-pd/MaritalStatus,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about marital status and history",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Marital Status",
   :rdfs/subClassOf [:dpvo-pd/PublicLife
                     :dpvo-pd/MaritalStatus
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def Marriage
  "Information about marriage(s)."
  {:db/ident :dpvo-pd/Marriage,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about marriage(s).",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Marriage",
   :rdfs/subClassOf [:dpvo-pd/FamilyStructure
                     :dpvo-pd/Marriage
                     :dpvo/PersonalData
                     :dpvo-pd/Family
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def MedicalHealth
  "Information about health, medical conditions or health care"
  {:db/ident :dpvo-pd/MedicalHealth,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about health, medical conditions or health care",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Medical Health",
   :rdfs/subClassOf [:dpvo-pd/External
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/MedicalHealth
                     :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def MentalHealth
  "Information about mental health."
  {:db/ident :dpvo-pd/MentalHealth,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about mental health.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Mental Health",
   :rdfs/subClassOf [:dpvo-pd/Health
                     :dpvo-pd/MentalHealth
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/External
                     :dpvo-pd/MedicalHealth],
   :vs/term_status "accepted"})

(def Name
  "Information about names associated or used as given name or nickname."
  {:db/ident :dpvo-pd/Name,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   "Information about names associated or used as given name or nickname.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Name",
   :rdfs/subClassOf
   [:dpvo-pd/Identifying :dpvo-pd/Name :dpvo/PersonalData :dpvo-pd/External],
   :vs/term_status "accepted"})

(def Nationality
  "Information about nationality"
  {:db/ident            :dpvo-pd/Nationality,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "https://www.w3.org/2022/04/20-dpvcg-minutes.html",
   :dcterms/description "Information about nationality",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          "Nationality",
   :rdfs/subClassOf     [:dpvo-pd/External
                         :dpvo-pd/Nationality
                         :dpvo/PersonalData],
   :vs/term_status      "accepted"})

(def OfficialID
  "Information about an official identifier or identification document"
  {:db/ident :dpvo-pd/OfficialID,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about an official identifier or identification document",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Official ID",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Government"],
   :rdfs/subClassOf [:dpvo-pd/Identifying
                     :dpvo-pd/OfficialID
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def Offspring
  "Information about offspring(s)."
  {:db/ident :dpvo-pd/Offspring,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about offspring(s).",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Offspring",
   :rdfs/subClassOf [:dpvo-pd/FamilyStructure
                     :dpvo-pd/Offspring
                     :dpvo/PersonalData
                     :dpvo-pd/Family
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def Opinion
  "Information about opinions"
  {:db/ident :dpvo-pd/Opinion,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about opinions",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Opinion",
   :rdfs/subClassOf
   [:dpvo-pd/Preference :dpvo-pd/Opinion :dpvo/PersonalData :dpvo-pd/Internal],
   :vs/term_status "accepted"})

(def Ownership
  "Information about ownership and history, including renting, borrowing, possessions."
  {:db/ident :dpvo-pd/Ownership,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about ownership and history, including renting, borrowing, possessions.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Ownership",
   :rdfs/subClassOf [:dpvo-pd/Financial :dpvo-pd/Ownership :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def PINCode
  "Information about Personal identification number (PIN), which is usually used in the process of authenticating the individual as an user accessing a system."
  {:db/ident :dpvo-pd/PINCode,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about Personal identification number (PIN), which is usually used in the process of authenticating the individual as an user accessing a system.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "PIN Code",
   :rdfs/subClassOf [:dpvo-pd/Authenticating
                     :dpvo-pd/PINCode
                     :dpvo/PersonalData
                     :dpvo-pd/Internal],
   :vs/term_status "accepted"})

(def Parent
  "Information about parent(s)."
  {:db/ident :dpvo-pd/Parent,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about parent(s).",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Parent",
   :rdfs/subClassOf [:dpvo-pd/FamilyStructure
                     :dpvo-pd/Parent
                     :dpvo/PersonalData
                     :dpvo-pd/Family
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def Passport
  "Information about passport"
  {:db/ident            :dpvo-pd/Passport,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Information about passport",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          "Passport",
   :rdfs/subClassOf     [:dpvo-pd/OfficialID
                         :dpvo-pd/Passport
                         :dpvo/PersonalData
                         :dpvo-pd/Identifying
                         :dpvo-pd/External],
   :vs/term_status      "accepted"})

(def Password
  "Information about password used in the process of authenticating the individual as an user accessing a system."
  {:db/ident :dpvo-pd/Password,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about password used in the process of authenticating the individual as an user accessing a system.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Password",
   :rdfs/subClassOf [:dpvo-pd/Authenticating
                     :dpvo-pd/Password
                     :dpvo/PersonalData
                     :dpvo-pd/Internal],
   :vs/term_status "accepted"})

(def PastEmployment
  "Information about past employment"
  {:db/ident            :dpvo-pd/PastEmployment,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Information about past employment",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          "Past Employment",
   :rdfs/subClassOf     [:dpvo-pd/EmploymentHistory
                         :dpvo-pd/PastEmployment
                         :dpvo/PersonalData
                         :dpvo-pd/Professional
                         :dpvo-pd/Social],
   :vs/term_status      "accepted"})

(def PaymentCard
  "Information about payment card such as Credit Card, Debit Card."
  {:db/ident :dpvo-pd/PaymentCard,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Information about payment card such as Credit Card, Debit Card.",
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Payment Card",
   :rdfs/subClassOf [:dpvo-pd/FinancialAccount
                     :dpvo-pd/PaymentCard
                     :dpvo/PersonalData
                     :dpvo-pd/Financial],
   :vs/term_status "accepted"})

(def PaymentCardExpiry
  "Information about payment card expiry such as a date."
  {:db/ident            :dpvo-pd/PaymentCardExpiry,
   :dcterms/created     #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description "Information about payment card expiry such as a date.",
   :dcterms/source      "https://www.w3.org/community/dpvcg/",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          "Payment Card Expiry",
   :rdfs/subClassOf     [:dpvo-pd/PaymentCard
                         :dpvo-pd/PaymentCardExpiry
                         :dpvo/PersonalData
                         :dpvo-pd/FinancialAccount
                         :dpvo-pd/Financial],
   :vs/term_status      "accepted"})

(def PaymentCardNumber
  "Information about payment card number."
  {:db/ident            :dpvo-pd/PaymentCardNumber,
   :dcterms/created     #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description "Information about payment card number.",
   :dcterms/source      "https://www.w3.org/community/dpvcg/",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          "Payment Card Number",
   :rdfs/subClassOf     [:dpvo-pd/AccountIdentifier
                         :dpvo-pd/PaymentCard
                         :dpvo-pd/PaymentCardNumber
                         :dpvo/PersonalData
                         :dpvo-pd/FinancialAccount
                         :dpvo-pd/Financial],
   :vs/term_status      "accepted"})

(def PerformanceAtWork
  "Information about performance at work or within work environments"
  {:db/ident :dpvo-pd/PerformanceAtWork,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Information about performance at work or within work environments",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Performance at Work",
   :rdfs/subClassOf [:dpvo-pd/Professional
                     :dpvo-pd/Behavioral
                     :dpvo-pd/PerformanceAtWork
                     :dpvo/PersonalData
                     :dpvo-pd/External
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def PersonalDocuments
  "Information about and including personal documents e.g. diaries or journals"
  {:db/ident :dpvo-pd/PersonalDocuments,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Information about and including personal documents e.g. diaries or journals",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Personal Documents",
   :rdfs/subClassOf
   [:dpvo-pd/External :dpvo-pd/PersonalDocuments :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def PersonalPossession
  "Information about personal possessions."
  {:db/ident :dpvo-pd/PersonalPossession,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about personal possessions.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Personal Possession",
   :rdfs/subClassOf [:dpvo-pd/Ownership
                     :dpvo-pd/PersonalPossession
                     :dpvo/PersonalData
                     :dpvo-pd/Financial],
   :vs/term_status "accepted"})

(def Personality
  "Information about personality (e.g., categorization in terms of the Big Five personality traits)"
  {:db/ident :dpvo-pd/Personality,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   "Information about personality (e.g., categorization in terms of the Big Five personality traits)",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Personality",
   :rdfs/subClassOf [:dpvo-pd/Behavioral
                     :dpvo-pd/Personality
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def PhilosophicalBelief
  "Information about philosophical beliefs."
  {:db/ident :dpvo-pd/PhilosophicalBelief,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about philosophical beliefs.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Philosophical Belief",
   :rdfs/subClassOf [:dpvo-pd/KnowledgeBelief
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/PhilosophicalBelief
                     :dpvo/PersonalData
                     :dpvo-pd/Internal],
   :vs/term_status "accepted"})

(def PhysicalAddress
  "Information about physical address."
  {:db/ident :dpvo-pd/PhysicalAddress,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about physical address.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Physical Address",
   :rdfs/subClassOf [:dpvo-pd/Contact
                     :dpvo-pd/PhysicalAddress
                     :dpvo/PersonalData
                     :dpvo-pd/Tracking],
   :vs/term_status "accepted"})

(def PhysicalCharacteristic
  "Information about physical characteristics"
  {:db/ident :dpvo-pd/PhysicalCharacteristic,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about physical characteristics",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Physical Characteristic",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Demographic"],
   :rdfs/subClassOf
   [:dpvo-pd/External :dpvo-pd/PhysicalCharacteristic :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def PhysicalHealth
  "Information about physical health."
  {:db/ident :dpvo-pd/PhysicalHealth,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about physical health.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Physical Health",
   :rdfs/subClassOf [:dpvo-pd/Health
                     :dpvo-pd/PhysicalHealth
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/External
                     :dpvo-pd/MedicalHealth],
   :vs/term_status "accepted"})

(def PhysicalTrait
  "Information about defining traits or features regarding the body."
  {:db/ident :dpvo-pd/PhysicalTrait,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about defining traits or features regarding the body.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Physical Trait",
   :rdfs/subClassOf [:dpvo-pd/Demographic
                     :dpvo-pd/PhysicalTrait
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def Picture
  "Information about visual representation or image e.g. profile photo."
  {:db/ident :dpvo-pd/Picture,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   "Information about visual representation or image e.g. profile photo.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Picture",
   :rdfs/subClassOf
   [:dpvo-pd/Identifying :dpvo-pd/Picture :dpvo/PersonalData :dpvo-pd/External],
   :vs/term_status "accepted"})

(def Piercing
  "Information about piercings"
  {:db/ident :dpvo-pd/Piercing,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about piercings",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Piercing",
   :rdfs/subClassOf [:dpvo-pd/PhysicalCharacteristic
                     :dpvo-pd/Piercing
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def PoliticalAffiliation
  "Information about political affiliation and history"
  {:db/ident :dpvo-pd/PoliticalAffiliation,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about political affiliation and history",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Political Affiliation",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Political"],
   :rdfs/subClassOf [:dpvo-pd/PublicLife
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/PoliticalAffiliation
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def PoliticalOpinion
  "Information about opinions regarding politics and political topics"
  {:db/ident :dpvo-pd/PoliticalOpinion,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Information about opinions regarding politics and political topics",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Political Opinion",
   :rdfs/subClassOf [:dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/PublicLife
                     :dpvo-pd/PoliticalOpinion
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def Preference
  "Information about preferences or interests"
  {:db/ident :dpvo-pd/Preference,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about preferences or interests",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Preference",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Preference"],
   :rdfs/subClassOf [:dpvo-pd/Internal :dpvo-pd/Preference :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def Prescription
  "Information about medical and pharmaceutical prescriptions"
  {:db/ident :dpvo-pd/Prescription,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about medical and pharmaceutical prescriptions",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Prescription",
   :rdfs/subClassOf [:dpvo-pd/MedicalHealth
                     :dpvo-pd/Prescription
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def PrivacyPreference
  "Information about privacy preferences"
  {:db/ident :dpvo-pd/PrivacyPreference,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about privacy preferences",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Privacy Preference",
   :rdfs/subClassOf [:dpvo-pd/Preference
                     :dpvo-pd/PrivacyPreference
                     :dpvo/PersonalData
                     :dpvo-pd/Internal],
   :vs/term_status "accepted"})

(def Proclivitie
  "Information about proclivities in a sexual context"
  {:db/ident :dpvo-pd/Proclivitie,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about proclivities in a sexual context",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Proclivitie",
   :rdfs/subClassOf [:dpvo-pd/Sexual
                     :dpvo-pd/Proclivitie
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def Professional
  "Information about educational or professional career"
  {:db/ident :dpvo-pd/Professional,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about educational or professional career",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Professional",
   :rdfs/subClassOf [:dpvo-pd/Social :dpvo-pd/Professional :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def ProfessionalCertification
  "Information about professional certifications"
  {:db/ident :dpvo-pd/ProfessionalCertification,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about professional certifications",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Professional Certification",
   :rdfs/subClassOf [:dpvo-pd/Professional
                     :dpvo-pd/ProfessionalCertification
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def ProfessionalEvaluation
  "Information about professional evaluations"
  {:db/ident :dpvo-pd/ProfessionalEvaluation,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about professional evaluations",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Professional Evaluation",
   :rdfs/subClassOf [:dpvo-pd/Professional
                     :dpvo-pd/ProfessionalEvaluation
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def ProfessionalInterview
  "Information about professional interviews"
  {:db/ident :dpvo-pd/ProfessionalInterview,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about professional interviews",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Professional Interview",
   :rdfs/subClassOf [:dpvo-pd/Professional
                     :dpvo-pd/ProfessionalInterview
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def Profile
  "Profile or user profile is information and representation of characteristics associated with person(s) or group(s)"
  {:db/ident :dpvo-pd/Profile,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Profile or user profile is information and representation of characteristics associated with person(s) or group(s)",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Profile",
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo-pd/Profile],
   :vs/term_status "accepted"})

(def PublicLife
  "Information about public life"
  {:db/ident :dpvo-pd/PublicLife,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about public life",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Public Life",
   :rdfs/subClassOf [:dpvo-pd/Social :dpvo-pd/PublicLife :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def PubliclyAvailableSocialMedia
  "Information about social media that is publicly available"
  {:db/ident :dpvo-pd/PubliclyAvailableSocialMedia,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Information about social media that is publicly available",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Publicly Available Social Media",
   :rdfs/subClassOf [:dpvo-pd/SocialMedia
                     :dpvo-pd/PubliclyAvailableSocialMedia
                     :dpvo/PersonalData
                     :dpvo-pd/Communication
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def Purchase
  "Information about purchases such as items bought e.g. grocery or clothing"
  {:db/ident :dpvo-pd/Purchase,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about purchases such as items bought e.g. grocery or clothing",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Purchase",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Purchase"],
   :rdfs/subClassOf [:dpvo-pd/Transactional
                     :dpvo-pd/Purchase
                     :dpvo/PersonalData
                     :dpvo-pd/Financial],
   :vs/term_status "accepted"})

(def PurchasesAndSpendingHabit
  "Information about analysis of purchases made and money spent expressed as a habit e.g. monthly shopping trends"
  {:db/ident :dpvo-pd/PurchasesAndSpendingHabit,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   "Information about analysis of purchases made and money spent expressed as a habit e.g. monthly shopping trends",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Purchases and Spending Habit",
   :rdfs/subClassOf [:dpvo-pd/Transactional
                     :dpvo-pd/PurchasesAndSpendingHabit
                     :dpvo/PersonalData
                     :dpvo-pd/Financial],
   :vs/term_status "accepted"})

(def Race
  "Information about race or racial history."
  {:db/ident :dpvo-pd/Race,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about race or racial history.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Race",
   :rdfs/subClassOf [:dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/Ethnicity
                     :dpvo-pd/Race
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def Reference
  "Information about references in the professional context"
  {:db/ident :dpvo-pd/Reference,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about references in the professional context",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Reference",
   :rdfs/subClassOf [:dpvo-pd/Professional
                     :dpvo-pd/Reference
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def Relationship
  "Information about relationships and relationship history."
  {:db/ident :dpvo-pd/Relationship,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about relationships and relationship history.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Relationship",
   :rdfs/subClassOf
   [:dpvo-pd/Family :dpvo-pd/Relationship :dpvo/PersonalData :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def Reliability
  "Information about reliability (e.g. of a person)"
  {:db/ident            :dpvo-pd/Reliability,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Information about reliability (e.g. of a person)",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          "Reliability",
   :rdfs/subClassOf     [:dpvo-pd/Behavioral
                         :dpvo-pd/Reliability
                         :dpvo/PersonalData
                         :dpvo-pd/External],
   :vs/term_status      "accepted"})

(def Religion
  "Information about religion, religious inclinations, and religious history."
  {:db/ident :dpvo-pd/Religion,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   "Information about religion, religious inclinations, and religious history.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Religion",
   :rdfs/subClassOf [:dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/PublicLife
                     :dpvo-pd/Religion
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def ReligiousBelief
  "Information about religion and religious beliefs."
  {:db/ident :dpvo-pd/ReligiousBelief,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about religion and religious beliefs.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Religious Belief",
   :rdfs/subClassOf [:dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/KnowledgeBelief
                     :dpvo-pd/ReligiousBelief
                     :dpvo/PersonalData
                     :dpvo-pd/Internal],
   :vs/term_status "accepted"})

(def Retina
  "Information about retina and the retinal patterns."
  {:db/ident :dpvo-pd/Retina,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about retina and the retinal patterns.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Retina",
   :rdfs/subClassOf [:dpvo-pd/Biometric
                     :dpvo-pd/Retina
                     :dpvo/PersonalData
                     :dpvo-pd/Identifying
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def RoomNumber
  "Information about location expressed as Room number or similar numbering systems"
  {:db/ident :dpvo-pd/RoomNumber,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about location expressed as Room number or similar numbering systems",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Room Number",
   :rdfs/subClassOf
   [:dpvo-pd/Location :dpvo-pd/RoomNumber :dpvo/PersonalData :dpvo-pd/Tracking],
   :vs/term_status "accepted"})

(def Salary
  "Information about salary"
  {:db/ident :dpvo-pd/Salary,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about salary",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Salary",
   :rdfs/subClassOf
   [:dpvo-pd/Professional :dpvo-pd/Salary :dpvo/PersonalData :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def Sale
  "Information about sales e.g. selling of goods or services"
  {:db/ident :dpvo-pd/Sale,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   "Information about sales e.g. selling of goods or services",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Sale",
   :rdfs/subClassOf
   [:dpvo-pd/Transactional :dpvo-pd/Sale :dpvo/PersonalData :dpvo-pd/Financial],
   :vs/term_status "accepted"})

(def School
  "Information about school such as name of school, conduct, or grades obtained."
  {:db/ident :dpvo-pd/School,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about school such as name of school, conduct, or grades obtained.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "School",
   :rdfs/subClassOf
   [:dpvo-pd/Professional :dpvo-pd/School :dpvo/PersonalData :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def SecretText
  "Information about secret text used in the process of authenticating the individual as an user accessing a system, e.g., when recovering a lost password."
  {:db/ident :dpvo-pd/SecretText,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   "Information about secret text used in the process of authenticating the individual as an user accessing a system, e.g., when recovering a lost password.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Secret Text",
   :rdfs/subClassOf [:dpvo-pd/Authenticating
                     :dpvo-pd/SecretText
                     :dpvo/PersonalData
                     :dpvo-pd/Internal],
   :vs/term_status "accepted"})

(def ServiceConsumptionBehavior
  "Information about the consumption of a service, e.g. time and duration of consumption."
  {:db/ident :dpvo-pd/ServiceConsumptionBehavior,
   :dcterms/created #inst "2019-11-26T00:00:00.000-05:00",
   :dcterms/creator ["Rudy Jacob" "Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about the consumption of a service, e.g. time and duration of consumption.",
   :dcterms/source "https://specialprivacy.ercim.eu/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Service Consumption Behavior",
   :rdfs/subClassOf [:dpvo-pd/Behavioral
                     :dpvo-pd/ServiceConsumptionBehavior
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def Sexual
  "Information about sexuality and sexual history"
  {:db/ident :dpvo-pd/Sexual,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about sexuality and sexual history",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Sexual",
   :rdfs/subClassOf [:dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/External
                     :dpvo-pd/Sexual
                     :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def SexualHistory
  "Information about sexual history"
  {:db/ident :dpvo-pd/SexualHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about sexual history",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Sexual History",
   :rdfs/subClassOf [:dpvo-pd/Sexual
                     :dpvo-pd/SexualHistory
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def SexualPreference
  "Information about sexual preferences"
  {:db/ident :dpvo-pd/SexualPreference,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about sexual preferences",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Sexual Preference",
   :rdfs/subClassOf [:dpvo-pd/Sexual
                     :dpvo-pd/SexualPreference
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def Sibling
  "Information about sibling(s)."
  {:db/ident :dpvo-pd/Sibling,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about sibling(s).",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Sibling",
   :rdfs/subClassOf [:dpvo-pd/FamilyStructure
                     :dpvo-pd/Sibling
                     :dpvo/PersonalData
                     :dpvo-pd/Family
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def SkinTone
  "Information about skin tone"
  {:db/ident :dpvo-pd/SkinTone,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about skin tone",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Skin Tone",
   :rdfs/subClassOf [:dpvo-pd/PhysicalCharacteristic
                     :dpvo-pd/SkinTone
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def Social
  "Information about social aspects such as family, public life, or professional networks."
  {:db/ident :dpvo-pd/Social,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about social aspects such as family, public life, or professional networks.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Social",
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def SocialMedia
  "Information about social media"
  {:db/ident            :dpvo-pd/SocialMedia,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Information about social media",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          "Social Media",
   :rdfs/subClassOf     [:dpvo-pd/Communication
                         :dpvo-pd/SocialMedia
                         :dpvo/PersonalData
                         :dpvo-pd/Social],
   :vs/term_status      "accepted"})

(def SocialMediaCommunication
  "Information about social media communication, including the communication itself and metadata."
  {:db/ident :dpvo-pd/SocialMediaCommunication,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about social media communication, including the communication itself and metadata.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Social Media Communication",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Social"],
   :rdfs/subClassOf [:dpvo-pd/Communication
                     :dpvo-pd/SocialMediaCommunication
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def SocialNetwork
  "Information about friends or connections expressed as a social network"
  {:db/ident :dpvo-pd/SocialNetwork,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about friends or connections expressed as a social network",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Social Network",
   :rdfs/subClassOf [:dpvo-pd/Social :dpvo-pd/SocialNetwork :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def SocialStatus
  "Information about social status"
  {:db/ident :dpvo-pd/SocialStatus,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about social status",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Social Status",
   :rdfs/subClassOf [:dpvo-pd/PublicLife
                     :dpvo-pd/SocialStatus
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def TVViewingBehavior
  "Information about TV viewing Behavior, such as timestamps of channel change, duration of viewership, content consumed"
  {:db/ident :dpvo-pd/TVViewingBehavior,
   :dcterms/created #inst "2019-11-26T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Rudy Jacob"],
   :dcterms/description
   "Information about TV viewing Behavior, such as timestamps of channel change, duration of viewership, content consumed",
   :dcterms/source "https://specialprivacy.ercim.eu/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "TV Viewing Behavior",
   :rdfs/subClassOf [:dpvo-pd/ServiceConsumptionBehavior
                     :dpvo-pd/TVViewingBehavior
                     :dpvo/PersonalData
                     :dpvo-pd/Behavioral
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def Tattoo
  "Information about tattoos"
  {:db/ident :dpvo-pd/Tattoo,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about tattoos",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Tattoo",
   :rdfs/subClassOf [:dpvo-pd/PhysicalCharacteristic
                     :dpvo-pd/Tattoo
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def Tax
  "Information about financial tax e.g. tax records or tax due"
  {:db/ident :dpvo-pd/Tax,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about financial tax e.g. tax records or tax due",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Tax",
   :rdfs/subClassOf
   [:dpvo-pd/Transactional :dpvo-pd/Tax :dpvo/PersonalData :dpvo-pd/Financial],
   :vs/term_status "accepted"})

(def TelephoneNumber
  "Information about telephone number."
  {:db/ident :dpvo-pd/TelephoneNumber,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about telephone number.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Telephone Number",
   :rdfs/subClassOf [:dpvo-pd/Contact
                     :dpvo-pd/TelephoneNumber
                     :dpvo/PersonalData
                     :dpvo-pd/Tracking],
   :vs/term_status "accepted"})

(def Thought
  "Information about thoughts"
  {:db/ident :dpvo-pd/Thought,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about thoughts",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Thought",
   :rdfs/subClassOf [:dpvo-pd/KnowledgeBelief
                     :dpvo-pd/Thought
                     :dpvo/PersonalData
                     :dpvo-pd/Internal],
   :vs/term_status "accepted"})

(def Tracking
  "Information used to track an individual or group e.g. location or email"
  {:db/ident :dpvo-pd/Tracking,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information used to track an individual or group e.g. location or email",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Tracking",
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo-pd/Tracking],
   :vs/term_status "accepted"})

(def TradeUnionMembership
  "Information about trade union memberships and related topics"
  {:db/ident :dpvo-pd/TradeUnionMembership,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Information about trade union memberships and related topics",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Trade Union Membership",
   :rdfs/subClassOf [:dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/GroupMembership
                     :dpvo-pd/TradeUnionMembership
                     :dpvo-pd/SocialNetwork
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def Transaction
  "Information about financial transactions e.g. bank transfers"
  {:db/ident :dpvo-pd/Transaction,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   "Information about financial transactions e.g. bank transfers",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Transaction",
   :rdfs/subClassOf [:dpvo-pd/Transactional
                     :dpvo-pd/Transaction
                     :dpvo/PersonalData
                     :dpvo-pd/Financial],
   :vs/term_status "accepted"})

(def Transactional
  "Information about a purchasing, spending or income"
  {:db/ident :dpvo-pd/Transactional,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about a purchasing, spending or income",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Transactional",
   :rdfs/subClassOf
   [:dpvo-pd/Financial :dpvo-pd/Transactional :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def TravelHistory
  "Information about travel history"
  {:db/ident            :dpvo-pd/TravelHistory,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Information about travel history",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          "Travel History",
   :rdfs/subClassOf     [:dpvo-pd/Location
                         :dpvo-pd/TravelHistory
                         :dpvo/PersonalData
                         :dpvo-pd/Tracking],
   :vs/term_status      "accepted"})

(def UID
  "Information about unique identifiers."
  {:db/ident :dpvo-pd/UID,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about unique identifiers.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "UID",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#UniqueId"],
   :rdfs/subClassOf
   [:dpvo-pd/Identifying :dpvo-pd/UID :dpvo/PersonalData :dpvo-pd/External],
   :vs/term_status "accepted"})

(def UserAgent
  "Information about software acting on behalf of users e.g. web browser"
  {:db/ident :dpvo-pd/UserAgent,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   "Information about software acting on behalf of users e.g. web browser",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "User agent",
   :rdfs/subClassOf [:dpvo-pd/Tracking :dpvo-pd/UserAgent :dpvo/PersonalData],
   :vs/term_status "accepted"})

(def Username
  "Information about usernames."
  {:db/ident :dpvo-pd/Username,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description "Information about usernames.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Username",
   :rdfs/subClassOf [:dpvo-pd/Identifying
                     :dpvo-pd/Username
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def VehicalLicenseNumber
  "Information about vehicle license number"
  {:db/ident            :dpvo-pd/VehicalLicenseNumber,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Information about vehicle license number",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          "Vehicle License Number",
   :rdfs/subClassOf     [:dpvo-pd/VehicleLicense
                         :dpvo-pd/VehicalLicenseNumber
                         :dpvo/PersonalData
                         :dpvo-pd/Vehicle
                         :dpvo-pd/Identifying
                         :dpvo-pd/External],
   :vs/term_status      "accepted"})

(def VehicalLicenseRegistration
  "Information about vehicle license registration"
  {:db/ident            :dpvo-pd/VehicalLicenseRegistration,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Information about vehicle license registration",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          "Vehicle License Registration",
   :rdfs/subClassOf     [:dpvo-pd/VehicleLicense
                         :dpvo-pd/VehicalLicenseRegistration
                         :dpvo/PersonalData
                         :dpvo-pd/Vehicle
                         :dpvo-pd/Identifying
                         :dpvo-pd/External],
   :vs/term_status      "accepted"})

(def Vehicle
  "Information about vehicles"
  {:db/ident            :dpvo-pd/Vehicle,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Information about vehicles",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          "Vehicle",
   :rdfs/subClassOf     [:dpvo-pd/External :dpvo-pd/Vehicle :dpvo/PersonalData],
   :vs/term_status      "accepted"})

(def VehicleLicense
  "Information about vehicle license"
  {:db/ident            :dpvo-pd/VehicleLicense,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Information about vehicle license",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          "Vehicle License",
   :rdfs/subClassOf     [:dpvo-pd/Vehicle
                         :dpvo-pd/Identifying
                         :dpvo-pd/VehicleLicense
                         :dpvo/PersonalData
                         :dpvo-pd/External],
   :vs/term_status      "accepted"})

(def VehicleUsage
  "Information about usage of vehicles, e.g. driving statistics"
  {:db/ident :dpvo-pd/VehicleUsage,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   "Information about usage of vehicles, e.g. driving statistics",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Vehicle Usage",
   :rdfs/subClassOf [:dpvo-pd/Behavioral
                     :dpvo-pd/Vehicle
                     :dpvo-pd/VehicleUsage
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def VoiceCommunicationRecording
  "Information about vocal recorded communication (e.g. telephony, VoIP)"
  {:db/ident :dpvo-pd/VoiceCommunicationRecording,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   "Information about vocal recorded communication (e.g. telephony, VoIP)",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Voice Communication Recording",
   :rdfs/subClassOf [:dpvo-pd/Communication
                     :dpvo-pd/VoiceCommunicationRecording
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def VoiceMail
  "Information about voice mail messages."
  {:db/ident :dpvo-pd/VoiceMail,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about voice mail messages.",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Voice Mail",
   :rdfs/subClassOf [:dpvo-pd/Communication
                     :dpvo-pd/VoiceMail
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def Weight
  "Information about physical weight"
  {:db/ident :dpvo-pd/Weight,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description "Information about physical weight",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Weight",
   :rdfs/subClassOf [:dpvo-pd/PhysicalCharacteristic
                     :dpvo-pd/Weight
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status "accepted"})

(def WorkEnvironment
  "Information about work environments"
  {:db/ident            :dpvo-pd/WorkEnvironment,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description "Information about work environments",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          "Work Environment",
   :rdfs/subClassOf     [:dpvo-pd/Professional
                         :dpvo-pd/WorkEnvironment
                         :dpvo/PersonalData
                         :dpvo-pd/Social],
   :vs/term_status      "accepted"})

(def WorkHistory
  "Information about work history in a professional context"
  {:db/ident :dpvo-pd/WorkHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   "Information about work history in a professional context",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label "Work History",
   :rdfs/subClassOf [:dpvo-pd/Professional
                     :dpvo-pd/WorkHistory
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status "accepted"})

(def ^{:private true} PersonalData
  {:db/ident        :dpvo/PersonalData,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :dpvo/PersonalData})

(def ^{:private true} SpecialCategoryPersonalData
  {:db/ident        :dpvo/SpecialCategoryPersonalData,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :dpvo/SpecialCategoryPersonalData})