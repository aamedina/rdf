(ns net.wikipunk.rdf.dpvo-pd
  "DPV-PD is an extension to the Data Privacy Vocabulary that provides additional terms related to Personal Data categories."
  {:dcterms/abstract
   #voc/lstr
    "DPV-PD is an extension to the Data Privacy Vocabulary that provides additional terms related to Personal Data categories.@en",
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
   #voc/lstr
    "DPV-PD is an extension to the Data Privacy Vocabulary that provides additional terms related to Personal Data categories.@en",
   :dcterms/license "https://www.w3.org/Consortium/Legal/2015/doc-license",
   :dcterms/modified #inst "2022-12-05T00:00:00.000-05:00",
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :dcterms/title #voc/lstr "DPV-PD: Personal Data Extension for DPV@en",
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
   :dcterms/description #voc/lstr
                         "Information about linguistic and speech accents.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Accent@en",
   :rdfs/subClassOf
   [:dpvo-pd/Language :dpvo-pd/Accent :dpvo/PersonalData :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def AccountIdentifier
  "Information about financial account identifier."
  {:db/ident :dpvo-pd/AccountIdentifier,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr
                         "Information about financial account identifier.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Account Identifier@en",
   :rdfs/subClassOf [:dpvo-pd/FinancialAccount
                     :dpvo-pd/AccountIdentifier
                     :dpvo/PersonalData
                     :dpvo-pd/Financial],
   :vs/term_status #voc/lstr "accepted@en"})

(def Acquantaince
  "Information about acquaintainces in a social network."
  {:db/ident :dpvo-pd/Acquantaince,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr "Information about acquaintainces in a social network.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Acquantaince@en",
   :rdfs/subClassOf [:dpvo-pd/SocialNetwork
                     :dpvo-pd/Acquantaince
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def Age
  "Information about age"
  {:db/ident :dpvo-pd/Age,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about age@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Age@en",
   :rdfs/subClassOf [:dpvo-pd/PhysicalCharacteristic
                     :dpvo-pd/Age
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def AgeExact
  "Information about the exact age (i.e. to some degree within a year, month, or day)"
  {:db/ident :dpvo-pd/AgeExact,
   :dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Information about the exact age (i.e. to some degree within a year, month, or day)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Age Exact@en",
   :rdfs/subClassOf [:dpvo-pd/AgeRange
                     :dpvo-pd/AgeExact
                     :dpvo-pd/Age
                     :dpvo/PersonalData
                     :dpvo-pd/External
                     :dpvo-pd/PhysicalCharacteristic],
   :vs/term_status #voc/lstr "accepted@en"})

(def AgeRange
  "Information about age range i.e. inexact age to some degree (i.e. some years)"
  {:db/ident :dpvo-pd/AgeRange,
   :dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Information about age range i.e. inexact age to some degree (i.e. some years)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Age Range@en",
   :rdfs/subClassOf [:dpvo-pd/Age
                     :dpvo-pd/AgeRange
                     :dpvo/PersonalData
                     :dpvo-pd/External
                     :dpvo-pd/PhysicalCharacteristic],
   :vs/term_status #voc/lstr "accepted@en"})

(def ApartmentOwned
  "Information about apartment(s) owned and its history"
  {:db/ident :dpvo-pd/ApartmentOwned,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr "Information about apartment(s) owned and its history@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Apartment Owned@en",
   :rdfs/subClassOf [:dpvo-pd/HouseOwned
                     :dpvo-pd/ApartmentOwned
                     :dpvo/PersonalData
                     :dpvo-pd/Ownership
                     :dpvo-pd/Financial],
   :vs/term_status #voc/lstr "accepted@en"})

(def Association
  "Information about associations in a social network with other individuals, groups, or entities e.g. friend of a friend"
  {:db/ident :dpvo-pd/Association,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about associations in a social network with other individuals, groups, or entities e.g. friend of a friend@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Association@en",
   :rdfs/subClassOf [:dpvo-pd/SocialNetwork
                     :dpvo-pd/Association
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def Attitude
  "Information about attitude."
  {:db/ident :dpvo-pd/Attitude,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about attitude.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Attitude@en",
   :rdfs/subClassOf
   [:dpvo-pd/Behavioral :dpvo-pd/Attitude :dpvo/PersonalData :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def Authenticating
  "Information about authentication and information used for authenticating"
  {:db/ident :dpvo-pd/Authenticating,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about authentication and information used for authenticating@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Authenticating@en",
   :rdfs/subClassOf
   [:dpvo-pd/Internal :dpvo-pd/Authenticating :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def AuthenticationHistory
  "Information about prior authentication and its outcomes such as login attempts or location."
  {:db/ident :dpvo-pd/AuthenticationHistory,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   #voc/lstr
    "Information about prior authentication and its outcomes such as login attempts or location.@en",
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Authentication History@en",
   :rdfs/subClassOf [:dpvo-pd/Behavioral
                     :dpvo-pd/AuthenticationHistory
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def BankAccount
  "Information about bank accounts."
  {:db/ident :dpvo-pd/BankAccount,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about bank accounts.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Bank Account@en",
   :rdfs/subClassOf [:dpvo-pd/FinancialAccount
                     :dpvo-pd/BankAccount
                     :dpvo/PersonalData
                     :dpvo-pd/Financial],
   :vs/term_status #voc/lstr "accepted@en"})

(def Behavioral
  "Information about Behavior or activity"
  {:db/ident :dpvo-pd/Behavioral,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about Behavior or activity@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Behavioral@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Activity"],
   :rdfs/subClassOf [:dpvo-pd/External :dpvo-pd/Behavioral :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def Biometric
  "Information about biometrics and biometric characteristics."
  {:db/ident :dpvo-pd/Biometric,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr "Information about biometrics and biometric characteristics.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Biometric@en",
   :rdfs/subClassOf [:dpvo-pd/Identifying
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/Biometric
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def BirthDate
  "Information about birth date"
  {:db/ident            :dpvo-pd/BirthDate,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Information about birth date@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          #voc/lstr "Birth Date@en",
   :rdfs/subClassOf     [:dpvo-pd/Age
                         :dpvo-pd/BirthDate
                         :dpvo/PersonalData
                         :dpvo-pd/External
                         :dpvo-pd/PhysicalCharacteristic],
   :vs/term_status      #voc/lstr "accepted@en"})

(def BirthPlace
  "Information about birth place"
  {:db/ident            :dpvo-pd/BirthPlace,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Information about birth place@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          #voc/lstr "Birth Place@en",
   :rdfs/subClassOf     [:dpvo-pd/Location
                         :dpvo-pd/BirthPlace
                         :dpvo/PersonalData
                         :dpvo-pd/Tracking],
   :vs/term_status      #voc/lstr "accepted@en"})

(def BloodType
  "Information about blood type."
  {:db/ident :dpvo-pd/BloodType,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about blood type.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Blood Type@en",
   :rdfs/subClassOf [:dpvo-pd/MedicalHealth
                     :dpvo-pd/BloodType
                     :dpvo/PersonalData
                     :dpvo-pd/External
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def BrowserFingerprint
  "Information about the web browser which is used as a 'fingerprint'"
  {:db/ident :dpvo-pd/BrowserFingerprint,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about the web browser which is used as a 'fingerprint'@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Browser Fingerprint@en",
   :rdfs/subClassOf [:dpvo-pd/DeviceBased
                     :dpvo-pd/BrowserFingerprint
                     :dpvo/PersonalData
                     :dpvo-pd/Tracking],
   :vs/term_status #voc/lstr "accepted@en"})

(def BrowserHistory
  "Information about and including web browsing history"
  {:db/ident :dpvo-pd/BrowserHistory,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Information about and including web browsing history@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Browser History@en",
   :rdfs/subClassOf [:dpvo-pd/BrowsingBehavior
                     :dpvo-pd/BrowserHistory
                     :dpvo/PersonalData
                     :dpvo-pd/External
                     :dpvo-pd/Behavioral],
   :vs/term_status #voc/lstr "accepted@en"})

(def BrowsingBehavior
  "Information about browsing Behavior."
  {:db/ident :dpvo-pd/BrowsingBehavior,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about browsing Behavior.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Browsing Behavior@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#OnlineActivity"],
   :rdfs/subClassOf [:dpvo-pd/Behavioral
                     :dpvo-pd/BrowsingBehavior
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def BrowsingReferral
  "Information about web browsing referrer or referral, which can be based on location, targeted referrals, direct, organic search, social media or actions, campaigns."
  {:db/ident :dpvo-pd/BrowsingReferral,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   #voc/lstr
    "Information about web browsing referrer or referral, which can be based on location, targeted referrals, direct, organic search, social media or actions, campaigns.@en",
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Browsing Referral@en",
   :rdfs/subClassOf [:dpvo-pd/BrowsingBehavior
                     :dpvo-pd/BrowsingReferral
                     :dpvo/PersonalData
                     :dpvo-pd/External
                     :dpvo-pd/Behavioral],
   :vs/term_status #voc/lstr "accepted@en"})

(def CallLog
  "Information about the calls that an individual has made."
  {:db/ident :dpvo-pd/CallLog,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr "Information about the calls that an individual has made.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Call Log@en",
   :rdfs/subClassOf
   [:dpvo-pd/Behavioral :dpvo-pd/CallLog :dpvo/PersonalData :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def CarOwned
  "Information about cars ownership and ownership history."
  {:db/ident :dpvo-pd/CarOwned,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr "Information about cars ownership and ownership history.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Car Owned@en",
   :rdfs/subClassOf
   [:dpvo-pd/Ownership :dpvo-pd/CarOwned :dpvo/PersonalData :dpvo-pd/Financial],
   :vs/term_status #voc/lstr "accepted@en"})

(def CharacterClass
  "Information about character in the public sphere"
  {:db/ident :dpvo-pd/Character,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr
                         "Information about character in the public sphere@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Character@en",
   :rdfs/subClassOf
   [:dpvo-pd/PublicLife :dpvo-pd/Character :dpvo/PersonalData :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def Communication
  "Information communicated from or to an individual"
  {:db/ident :dpvo-pd/Communication,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr
                         "Information communicated from or to an individual@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Communication@en",
   :rdfs/subClassOf [:dpvo-pd/Social :dpvo-pd/Communication :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def CommunicationsMetadata
  "Information about communication metadata in the public sphere"
  {:db/ident :dpvo-pd/CommunicationsMetadata,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr "Information about communication metadata in the public sphere@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Communications Metadata@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Interactive"],
   :rdfs/subClassOf [:dpvo-pd/PublicLife
                     :dpvo-pd/CommunicationsMetadata
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def Connection
  "Information about and including connections in a social network"
  {:db/ident :dpvo-pd/Connection,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about and including connections in a social network@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Connection@en",
   :rdfs/subClassOf [:dpvo-pd/SocialNetwork
                     :dpvo-pd/Connection
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def Contact
  "Information about contacts or used for contacting e.g. email address or phone number"
  {:db/ident :dpvo-pd/Contact,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about contacts or used for contacting e.g. email address or phone number@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Contact@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Physical"],
   :rdfs/subClassOf [:dpvo-pd/Tracking :dpvo-pd/Contact :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def Country
  "Information about country e.g. residence, travel."
  {:db/ident :dpvo-pd/Country,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr
                         "Information about country e.g. residence, travel.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Country@en",
   :rdfs/subClassOf
   [:dpvo-pd/Location :dpvo-pd/Country :dpvo/PersonalData :dpvo-pd/Tracking],
   :vs/term_status #voc/lstr "accepted@en"})

(def Credit
  "Information about reputation with regards to money"
  {:db/ident :dpvo-pd/Credit,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr "Information about reputation with regards to money@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Credit@en",
   :rdfs/subClassOf [:dpvo-pd/Transactional
                     :dpvo-pd/Credit
                     :dpvo/PersonalData
                     :dpvo-pd/Financial],
   :vs/term_status #voc/lstr "accepted@en"})

(def CreditCapacity
  "Information about credit capacity."
  {:db/ident :dpvo-pd/CreditCapacity,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about credit capacity.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Credit Capacity@en",
   :rdfs/subClassOf [:dpvo-pd/Credit
                     :dpvo-pd/CreditCapacity
                     :dpvo/PersonalData
                     :dpvo-pd/Transactional
                     :dpvo-pd/Financial],
   :vs/term_status #voc/lstr "accepted@en"})

(def CreditCardNumber
  "Information about credit card number"
  {:db/ident :dpvo-pd/CreditCardNumber,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about credit card number@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Credit Card Number@en",
   :rdfs/subClassOf [:dpvo-pd/PaymentCardNumber
                     :dpvo-pd/CreditCardNumber
                     :dpvo/PersonalData
                     :dpvo-pd/FinancialAccount
                     :dpvo-pd/AccountIdentifier
                     :dpvo-pd/PaymentCard
                     :dpvo-pd/Financial],
   :vs/term_status #voc/lstr "accepted@en"})

(def CreditRecord
  "Information about credit record."
  {:db/ident :dpvo-pd/CreditRecord,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about credit record.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Credit Record@en",
   :rdfs/subClassOf [:dpvo-pd/Credit
                     :dpvo-pd/CreditRecord
                     :dpvo/PersonalData
                     :dpvo-pd/Transactional
                     :dpvo-pd/Financial],
   :vs/term_status #voc/lstr "accepted@en"})

(def CreditScore
  "Information about credit score."
  {:db/ident :dpvo-pd/CreditScore,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about credit score.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Credit Score@en",
   :rdfs/subClassOf [:dpvo-pd/CreditWorthiness
                     :dpvo-pd/CreditScore
                     :dpvo/PersonalData
                     :dpvo-pd/Credit
                     :dpvo-pd/Transactional
                     :dpvo-pd/Financial],
   :vs/term_status #voc/lstr "accepted@en"})

(def CreditStanding
  "Information about credit standing."
  {:db/ident :dpvo-pd/CreditStanding,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about credit standing.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Credit Standing@en",
   :rdfs/subClassOf [:dpvo-pd/Credit
                     :dpvo-pd/CreditStanding
                     :dpvo/PersonalData
                     :dpvo-pd/Transactional
                     :dpvo-pd/Financial],
   :vs/term_status #voc/lstr "accepted@en"})

(def CreditWorthiness
  "Information about credit worthiness."
  {:db/ident :dpvo-pd/CreditWorthiness,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about credit worthiness.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Credit Worthiness@en",
   :rdfs/subClassOf [:dpvo-pd/Credit
                     :dpvo-pd/CreditWorthiness
                     :dpvo/PersonalData
                     :dpvo-pd/Transactional
                     :dpvo-pd/Financial],
   :vs/term_status #voc/lstr "accepted@en"})

(def Criminal
  "Information about criminal activity e.g. criminal convictions or jail time"
  {:db/ident :dpvo-pd/Criminal,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr
    "Information about criminal activity e.g. criminal convictions or jail time@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Criminal@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Judicial"],
   :rdfs/subClassOf [:dpvo-pd/Social :dpvo-pd/Criminal :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def CriminalCharge
  "Information about criminal charges."
  {:db/ident :dpvo-pd/CriminalCharge,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about criminal charges.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Criminal Charge@en",
   :rdfs/subClassOf [:dpvo-pd/Criminal
                     :dpvo-pd/CriminalCharge
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def CriminalConviction
  "Information about criminal convictions."
  {:db/ident :dpvo-pd/CriminalConviction,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about criminal convictions.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Criminal Conviction@en",
   :rdfs/subClassOf [:dpvo-pd/Criminal
                     :dpvo-pd/CriminalConviction
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def CriminalOffense
  "Information about criminal offenses"
  {:db/ident            :dpvo-pd/CriminalOffense,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description #voc/lstr "Information about criminal offenses@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          #voc/lstr "Criminal Offense@en",
   :rdfs/subClassOf     [:dpvo-pd/Criminal
                         :dpvo-pd/CriminalOffense
                         :dpvo/PersonalData
                         :dpvo-pd/Social],
   :vs/term_status      #voc/lstr "accepted@en"})

(def CriminalPardon
  "Information about criminal pardons."
  {:db/ident :dpvo-pd/CriminalPardon,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about criminal pardons.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Criminal Pardon@en",
   :rdfs/subClassOf [:dpvo-pd/Criminal
                     :dpvo-pd/CriminalPardon
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def CurrentEmployment
  "Information about current employment"
  {:db/ident            :dpvo-pd/CurrentEmployment,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Information about current employment@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          #voc/lstr "Current Employment@en",
   :rdfs/subClassOf     [:dpvo-pd/EmploymentHistory
                         :dpvo-pd/CurrentEmployment
                         :dpvo-pd/Professional
                         :dpvo/PersonalData
                         :dpvo-pd/Social],
   :vs/term_status      #voc/lstr "accepted@en"})

(def DNACode
  "Information about DNA."
  {:db/ident :dpvo-pd/DNACode,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about DNA.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "DNA Code@en",
   :rdfs/subClassOf [:dpvo-pd/MedicalHealth
                     :dpvo-pd/DNACode
                     :dpvo/PersonalData
                     :dpvo-pd/External
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def Demeanor
  "Information about demeanor."
  {:db/ident :dpvo-pd/Demeanor,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about demeanor.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Demeanor@en",
   :rdfs/subClassOf
   [:dpvo-pd/Behavioral :dpvo-pd/Demeanor :dpvo/PersonalData :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def Demographic
  "Information about demography and demographic characteristics"
  {:db/ident :dpvo-pd/Demographic,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr "Information about demography and demographic characteristics@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Demographic@en",
   :rdfs/subClassOf [:dpvo-pd/External :dpvo-pd/Demographic :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def DeviceApplications
  "Information about applications or application-like software on a device."
  {:db/ident :dpvo-pd/DeviceApplications,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator
   ["Georg P Krog" "Harshvardhan J. Pandit" "Beatriz Esteves" "Paul Ryan"],
   :dcterms/description
   #voc/lstr
    "Information about applications or application-like software on a device.@en",
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Device Applications@en",
   :rdfs/subClassOf [:dpvo-pd/DeviceSoftware
                     :dpvo-pd/DeviceApplications
                     :dpvo/PersonalData
                     :dpvo-pd/Tracking
                     :dpvo-pd/DeviceBased],
   :vs/term_status #voc/lstr "accepted@en"})

(def DeviceBased
  "Information about devices"
  {:db/ident :dpvo-pd/DeviceBased,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about devices@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Device Based@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Computer"],
   :rdfs/subClassOf [:dpvo-pd/Tracking :dpvo-pd/DeviceBased :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def DeviceOperatingSystem
  "Information about the operating system (OS) or system software that manages hardware or software resources."
  {:db/ident :dpvo-pd/DeviceOperatingSystem,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator
   ["Beatriz Esteves" "Paul Ryan" "Harshvardhan J. Pandit" "Georg P Krog"],
   :dcterms/description
   #voc/lstr
    "Information about the operating system (OS) or system software that manages hardware or software resources.@en",
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Device Operating System@en",
   :rdfs/subClassOf [:dpvo-pd/DeviceSoftware
                     :dpvo-pd/DeviceOperatingSystem
                     :dpvo/PersonalData
                     :dpvo-pd/Tracking
                     :dpvo-pd/DeviceBased],
   :vs/term_status #voc/lstr "accepted@en"})

(def DeviceSoftware
  "Information about software on or related to a device."
  {:db/ident :dpvo-pd/DeviceSoftware,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator
   ["Harshvardhan J. Pandit" "Georg P Krog" "Beatriz Esteves" "Paul Ryan"],
   :dcterms/description
   #voc/lstr "Information about software on or related to a device.@en",
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Device Software@en",
   :rdfs/subClassOf [:dpvo-pd/DeviceBased
                     :dpvo-pd/DeviceSoftware
                     :dpvo/PersonalData
                     :dpvo-pd/Tracking],
   :vs/term_status #voc/lstr "accepted@en"})

(def Dialect
  "Information about linguistic dialects."
  {:db/ident :dpvo-pd/Dialect,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about linguistic dialects.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Dialect@en",
   :rdfs/subClassOf
   [:dpvo-pd/Language :dpvo-pd/Dialect :dpvo/PersonalData :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def DigitalFingerprint
  "Information about a 'digital fingerprint' created for identification"
  {:db/ident :dpvo-pd/DigitalFingerprint,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Information about a 'digital fingerprint' created for identification@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Digital Fingerprint@en",
   :rdfs/subClassOf
   [:dpvo-pd/Tracking :dpvo-pd/DigitalFingerprint :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def Disability
  "Information about disabilities."
  {:db/ident :dpvo-pd/Disability,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about disabilities.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Disability@en",
   :rdfs/subClassOf [:dpvo-pd/MedicalHealth
                     :dpvo-pd/Disability
                     :dpvo/PersonalData
                     :dpvo-pd/External
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def DisciplinaryAction
  "Information about disciplinary actions and its history"
  {:db/ident :dpvo-pd/DisciplinaryAction,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr "Information about disciplinary actions and its history@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Disciplinary Action@en",
   :rdfs/subClassOf [:dpvo-pd/Professional
                     :dpvo-pd/DisciplinaryAction
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def Dislike
  "Information about dislikes or preferences regarding repulsions."
  {:db/ident :dpvo-pd/Dislike,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about dislikes or preferences regarding repulsions.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Dislike@en",
   :rdfs/subClassOf [:dpvo-pd/Interest
                     :dpvo-pd/Dislike
                     :dpvo-pd/Preference
                     :dpvo/PersonalData
                     :dpvo-pd/Internal],
   :vs/term_status #voc/lstr "accepted@en"})

(def Divorce
  "Information about divorce(s)."
  {:db/ident :dpvo-pd/Divorce,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about divorce(s).@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Divorce@en",
   :rdfs/subClassOf [:dpvo-pd/FamilyStructure
                     :dpvo-pd/Divorce
                     :dpvo/PersonalData
                     :dpvo-pd/Social
                     :dpvo-pd/Family],
   :vs/term_status #voc/lstr "accepted@en"})

(def DrugTestResult
  "Information about drug test results."
  {:db/ident :dpvo-pd/DrugTestResult,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about drug test results.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Drug Test Result@en",
   :rdfs/subClassOf [:dpvo-pd/MedicalHealth
                     :dpvo-pd/DrugTestResult
                     :dpvo/PersonalData
                     :dpvo-pd/External
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def Education
  "Information about education"
  {:db/ident            :dpvo-pd/Education,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Information about education@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          #voc/lstr "Education@en",
   :rdfs/subClassOf     [:dpvo-pd/Professional
                         :dpvo-pd/Education
                         :dpvo/PersonalData
                         :dpvo-pd/Social],
   :vs/term_status      #voc/lstr "accepted@en"})

(def EducationExperience
  "Information about education experience e.g. attending a university"
  {:db/ident :dpvo-pd/EducationExperience,
   :dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Information about education experience e.g. attending a university@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Education Experience@en",
   :rdfs/subClassOf [:dpvo-pd/Education
                     :dpvo-pd/EducationExperience
                     :dpvo-pd/Professional
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def EducationQualification
  "Information about educational qualifications"
  {:db/ident            :dpvo-pd/EducationQualification,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Information about educational qualifications@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          #voc/lstr "Education Qualification@en",
   :rdfs/subClassOf     [:dpvo-pd/Education
                         :dpvo-pd/EducationQualification
                         :dpvo-pd/Professional
                         :dpvo/PersonalData
                         :dpvo-pd/Social],
   :vs/term_status      #voc/lstr "accepted@en"})

(def EmailAddress
  "Information about Email address."
  {:db/ident :dpvo-pd/EmailAddress,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about Email address.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Email Address@en",
   :rdfs/subClassOf [:dpvo-pd/Contact
                     :dpvo-pd/EmailAddress
                     :dpvo/PersonalData
                     :dpvo-pd/Tracking],
   :vs/term_status #voc/lstr "accepted@en"})

(def EmailAddressPersonal
  "Information about Email address used in Personal capacity"
  {:db/ident :dpvo-pd/EmailAddressPersonal,
   :dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Information about Email address used in Personal capacity@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Email Address Personal@en",
   :rdfs/subClassOf [:dpvo-pd/EmailAddress
                     :dpvo-pd/EmailAddressPersonal
                     :dpvo/PersonalData
                     :dpvo-pd/Tracking
                     :dpvo-pd/Contact],
   :vs/term_status #voc/lstr "accepted@en"})

(def EmailAddressWork
  "Information about Email address used for Work or in Professional capacity"
  {:db/ident :dpvo-pd/EmailAddressWork,
   :dcterms/created #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Information about Email address used for Work or in Professional capacity@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Email Address Work@en",
   :rdfs/subClassOf [:dpvo-pd/EmailAddress
                     :dpvo-pd/EmailAddressWork
                     :dpvo/PersonalData
                     :dpvo-pd/Tracking
                     :dpvo-pd/Contact],
   :vs/term_status #voc/lstr "accepted@en"})

(def EmailContent
  "Information about the contents of Emails sent or received"
  {:db/ident :dpvo-pd/EmailContent,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr "Information about the contents of Emails sent or received@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Email Content@en",
   :rdfs/subClassOf [:dpvo-pd/Communication
                     :dpvo-pd/EmailContent
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def EmploymentHistory
  "Information about employment history"
  {:db/ident :dpvo-pd/EmploymentHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about employment history@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Employment History@en",
   :rdfs/subClassOf [:dpvo-pd/Professional
                     :dpvo-pd/EmploymentHistory
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def EthnicOrigin
  "Information about ethnic origin"
  {:db/ident :dpvo-pd/EthnicOrigin,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about ethnic origin@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Ethnic Origin@en",
   :rdfs/subClassOf [:dpvo-pd/Ethnicity
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/EthnicOrigin
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def Ethnicity
  "Information about ethnic origins and lineage"
  {:db/ident :dpvo-pd/Ethnicity,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr
                         "Information about ethnic origins and lineage@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Ethnicity@en",
   :rdfs/subClassOf [:dpvo-pd/External :dpvo-pd/Ethnicity :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def External
  "Information about external characteristics that can be observed"
  {:db/ident :dpvo-pd/External,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about external characteristics that can be observed@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "External@en",
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def FacialPrint
  "Information about facial print or pattern"
  {:db/ident            :dpvo-pd/FacialPrint,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Information about facial print or pattern@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          #voc/lstr "Facial Print@en",
   :rdfs/subClassOf     [:dpvo-pd/Biometric
                         :dpvo-pd/FacialPrint
                         :dpvo/PersonalData
                         :dpvo-pd/External
                         :dpvo-pd/Identifying
                         :dpvo/SpecialCategoryPersonalData],
   :vs/term_status      #voc/lstr "accepted@en"})

(def Family
  "Information about family and relationships"
  {:db/ident :dpvo-pd/Family,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr
                         "Information about family and relationships@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Family@en",
   :rdfs/subClassOf [:dpvo-pd/Social :dpvo-pd/Family :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def FamilyHealthHistory
  "Information about family health history."
  {:db/ident :dpvo-pd/FamilyHealthHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about family health history.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Family Health History@en",
   :rdfs/subClassOf [:dpvo-pd/HealthHistory
                     :dpvo-pd/FamilyHealthHistory
                     :dpvo/PersonalData
                     :dpvo-pd/External
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/MedicalHealth],
   :vs/term_status #voc/lstr "accepted@en"})

(def FamilyStructure
  "Information about family and familial structure."
  {:db/ident :dpvo-pd/FamilyStructure,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr
                         "Information about family and familial structure.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Family Structure@en",
   :rdfs/subClassOf [:dpvo-pd/Family
                     :dpvo-pd/FamilyStructure
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def Favorite
  "Information about favorites"
  {:db/ident :dpvo-pd/Favorite,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about favorites@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Favorite@en",
   :rdfs/subClassOf
   [:dpvo-pd/Preference :dpvo-pd/Favorite :dpvo/PersonalData :dpvo-pd/Internal],
   :vs/term_status #voc/lstr "accepted@en"})

(def FavoriteColor
  "Information about favorite color."
  {:db/ident :dpvo-pd/FavoriteColor,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about favorite color.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Favorite Color@en",
   :rdfs/subClassOf [:dpvo-pd/Favorite
                     :dpvo-pd/FavoriteColor
                     :dpvo-pd/Preference
                     :dpvo/PersonalData
                     :dpvo-pd/Internal],
   :vs/term_status #voc/lstr "accepted@en"})

(def FavoriteFood
  "Information about favorite food."
  {:db/ident :dpvo-pd/FavoriteFood,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about favorite food.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Favorite Food@en",
   :rdfs/subClassOf [:dpvo-pd/Favorite
                     :dpvo-pd/FavoriteFood
                     :dpvo-pd/Preference
                     :dpvo/PersonalData
                     :dpvo-pd/Internal],
   :vs/term_status #voc/lstr "accepted@en"})

(def FavoriteMusic
  "Information about favorite music."
  {:db/ident :dpvo-pd/FavoriteMusic,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about favorite music.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Favorite Music@en",
   :rdfs/subClassOf [:dpvo-pd/Favorite
                     :dpvo-pd/FavoriteMusic
                     :dpvo-pd/Preference
                     :dpvo/PersonalData
                     :dpvo-pd/Internal],
   :vs/term_status #voc/lstr "accepted@en"})

(def Fetish
  "Information about an individual's sexual fetishes"
  {:db/ident :dpvo-pd/Fetish,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr
                         "Information about an individual's sexual fetishes@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Fetish@en",
   :rdfs/subClassOf [:dpvo-pd/Sexual
                     :dpvo-pd/Fetish
                     :dpvo/PersonalData
                     :dpvo-pd/External
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def Financial
  "Information about finance including monetary characteristics and transactions"
  {:db/ident :dpvo-pd/Financial,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about finance including monetary characteristics and transactions@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Financial@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Financial"],
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo-pd/Financial],
   :vs/term_status #voc/lstr "accepted@en"})

(def FinancialAccount
  "Information about financial accounts."
  {:db/ident :dpvo-pd/FinancialAccount,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about financial accounts.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Financial Account@en",
   :rdfs/subClassOf
   [:dpvo-pd/Financial :dpvo-pd/FinancialAccount :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def FinancialAccountNumber
  "Information about financial account number"
  {:db/ident :dpvo-pd/FinancialAccountNumber,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr
                         "Information about financial account number@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Financial Account Number@en",
   :rdfs/subClassOf [:dpvo-pd/AccountIdentifier
                     :dpvo-pd/FinancialAccountNumber
                     :dpvo/PersonalData
                     :dpvo-pd/FinancialAccount
                     :dpvo-pd/Financial],
   :vs/term_status #voc/lstr "accepted@en"})

(def FinancialStatus
  "Information about financial status or standing"
  {:db/ident            :dpvo-pd/FinancialStatus,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Information about financial status or standing@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          #voc/lstr "Financial Status@en",
   :rdfs/subClassOf     [:dpvo-pd/Financial
                         :dpvo-pd/FinancialStatus
                         :dpvo/PersonalData],
   :vs/term_status      #voc/lstr "accepted@en"})

(def Fingerprint
  "Information about fingerprint used for biometric purposes."
  {:db/ident :dpvo-pd/Fingerprint,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr "Information about fingerprint used for biometric purposes.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Fingerprint@en",
   :rdfs/subClassOf [:dpvo-pd/Biometric
                     :dpvo-pd/Fingerprint
                     :dpvo/PersonalData
                     :dpvo-pd/External
                     :dpvo-pd/Identifying
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def Friend
  "Information about friends in a social network, including aspects of friendships such as years together or nature of friendship."
  {:db/ident :dpvo-pd/Friend,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about friends in a social network, including aspects of friendships such as years together or nature of friendship.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Friend@en",
   :rdfs/subClassOf
   [:dpvo-pd/SocialNetwork :dpvo-pd/Friend :dpvo/PersonalData :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def GPSCoordinate
  "Information about location expressed using Global Position System coordinates (GPS)"
  {:db/ident :dpvo-pd/GPSCoordinate,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr
    "Information about location expressed using Global Position System coordinates (GPS)@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "GPS Coordinate@en",
   :rdfs/subClassOf [:dpvo-pd/Location
                     :dpvo-pd/GPSCoordinate
                     :dpvo/PersonalData
                     :dpvo-pd/Tracking],
   :vs/term_status #voc/lstr "accepted@en"})

(def Gender
  "Information about gender"
  {:db/ident :dpvo-pd/Gender,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about gender@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Gender@en",
   :rdfs/subClassOf [:dpvo-pd/PhysicalCharacteristic
                     :dpvo-pd/Gender
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def GeneralReputation
  "Information about reputation in the public sphere"
  {:db/ident :dpvo-pd/GeneralReputation,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr
                         "Information about reputation in the public sphere@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "General Reputation@en",
   :rdfs/subClassOf [:dpvo-pd/PublicLife
                     :dpvo-pd/GeneralReputation
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def Genetic
  "Information about inherited or acquired genetic characteristics"
  {:db/ident :dpvo-pd/Genetic,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Information about inherited or acquired genetic characteristics@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Genetic@en",
   :rdfs/subClassOf [:dpvo-pd/Health
                     :dpvo-pd/Genetic
                     :dpvo/PersonalData
                     :dpvo-pd/External
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/MedicalHealth],
   :vs/term_status #voc/lstr "accepted@en"})

(def Geographic
  "Information about location or based on geography (e.g. home address)"
  {:db/ident :dpvo-pd/Geographic,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about location or based on geography (e.g. home address)@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Geographic@en",
   :rdfs/subClassOf [:dpvo-pd/Demographic
                     :dpvo-pd/Geographic
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def GroupMembership
  "Information about groups and memberships included or associated with a social network"
  {:db/ident :dpvo-pd/GroupMembership,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about groups and memberships included or associated with a social network@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Group Membership@en",
   :rdfs/subClassOf [:dpvo-pd/SocialNetwork
                     :dpvo-pd/GroupMembership
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def HairColor
  "Information about hair color"
  {:db/ident :dpvo-pd/HairColor,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about hair color@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Hair Color@en",
   :rdfs/subClassOf [:dpvo-pd/PhysicalCharacteristic
                     :dpvo-pd/HairColor
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def Health
  "Information about health."
  {:db/ident :dpvo-pd/Health,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about health.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Health@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Health"],
   :rdfs/subClassOf [:dpvo-pd/MedicalHealth
                     :dpvo-pd/Health
                     :dpvo/PersonalData
                     :dpvo-pd/External
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def HealthHistory
  "Information about health history."
  {:db/ident :dpvo-pd/HealthHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about health history.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Health History@en",
   :rdfs/subClassOf [:dpvo-pd/MedicalHealth
                     :dpvo-pd/HealthHistory
                     :dpvo/PersonalData
                     :dpvo-pd/External
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def HealthRecord
  "Information about health record."
  {:db/ident :dpvo-pd/HealthRecord,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about health record.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Health Record@en",
   :rdfs/subClassOf [:dpvo-pd/MedicalHealth
                     :dpvo-pd/HealthRecord
                     :dpvo/PersonalData
                     :dpvo-pd/External
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def Height
  "Information about physical height"
  {:db/ident :dpvo-pd/Height,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about physical height@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Height@en",
   :rdfs/subClassOf [:dpvo-pd/PhysicalCharacteristic
                     :dpvo-pd/Height
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def Historical
  "Information about historical data related to or relevant regarding history or past events"
  {:db/ident :dpvo-pd/Historical,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr
    "Information about historical data related to or relevant regarding history or past events@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Historical@en",
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo-pd/Historical],
   :vs/term_status #voc/lstr "accepted@en"})

(def HouseOwned
  "Information about house(s) owned and ownership history."
  {:db/ident :dpvo-pd/HouseOwned,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr "Information about house(s) owned and ownership history.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "House Owned@en",
   :rdfs/subClassOf [:dpvo-pd/Ownership
                     :dpvo-pd/HouseOwned
                     :dpvo/PersonalData
                     :dpvo-pd/Financial],
   :vs/term_status #voc/lstr "accepted@en"})

(def Household
  "Information about personal or household activities"
  {:db/ident :dpvo-pd/Household,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Information about personal or household activities@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Household@en",
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo-pd/Household],
   :vs/term_status #voc/lstr "accepted@en"})

(def IPAddress
  "Information about the Internet Protocol (IP) address of a device"
  {:db/ident :dpvo-pd/IPAddress,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about the Internet Protocol (IP) address of a device@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "IP Address@en",
   :rdfs/subClassOf [:dpvo-pd/DeviceBased
                     :dpvo-pd/IPAddress
                     :dpvo/PersonalData
                     :dpvo-pd/Tracking],
   :vs/term_status #voc/lstr "accepted@en"})

(def Identifier
  "Information about an identifier or name used for identification"
  {:db/ident :dpvo-pd/Identifier,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Information about an identifier or name used for identification@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Identifier@en",
   :rdfs/subClassOf [:dpvo-pd/Tracking :dpvo-pd/Identifier :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def Identifying
  "Information that uniquely or semi-uniquely identifies an individual or a group"
  {:db/ident :dpvo-pd/Identifying,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information that uniquely or semi-uniquely identifies an individual or a group@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Identifying@en",
   :rdfs/subClassOf [:dpvo-pd/External :dpvo-pd/Identifying :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def Income
  "Information about financial income e.g. for individual or household or family"
  {:db/ident :dpvo-pd/Income,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about financial income e.g. for individual or household or family@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Income@en",
   :rdfs/subClassOf [:dpvo-pd/Transactional
                     :dpvo-pd/Income
                     :dpvo/PersonalData
                     :dpvo-pd/Financial],
   :vs/term_status #voc/lstr "accepted@en"})

(def IncomeBracket
  "Information about income bracket."
  {:db/ident :dpvo-pd/IncomeBracket,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about income bracket.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Income Bracket@en",
   :rdfs/subClassOf [:dpvo-pd/Demographic
                     :dpvo-pd/IncomeBracket
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def IndividualHealthHistory
  "Information about information health history."
  {:db/ident :dpvo-pd/IndividualHealthHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr
                         "Information about information health history.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Individual Health History@en",
   :rdfs/subClassOf [:dpvo-pd/HealthHistory
                     :dpvo-pd/IndividualHealthHistory
                     :dpvo/PersonalData
                     :dpvo-pd/External
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/MedicalHealth],
   :vs/term_status #voc/lstr "accepted@en"})

(def Insurance
  "Information about Insurance"
  {:db/ident            :dpvo-pd/Insurance,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Information about Insurance@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          #voc/lstr "Insurance@en",
   :rdfs/subClassOf     [:dpvo-pd/Financial
                         :dpvo-pd/Insurance
                         :dpvo/PersonalData],
   :vs/term_status      #voc/lstr "accepted@en"})

(def Intention
  "Information about intentions"
  {:db/ident :dpvo-pd/Intention,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about intentions@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Intention@en",
   :rdfs/subClassOf [:dpvo-pd/Preference
                     :dpvo-pd/Intention
                     :dpvo/PersonalData
                     :dpvo-pd/Internal],
   :vs/term_status #voc/lstr "accepted@en"})

(def Interaction
  "Information about interactions in the public sphere"
  {:db/ident :dpvo-pd/Interaction,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr "Information about interactions in the public sphere@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Interaction@en",
   :rdfs/subClassOf [:dpvo-pd/PublicLife
                     :dpvo-pd/Interaction
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def Interest
  "Information about interests"
  {:db/ident :dpvo-pd/Interest,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about interests@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Interest@en",
   :rdfs/subClassOf
   [:dpvo-pd/Preference :dpvo-pd/Interest :dpvo/PersonalData :dpvo-pd/Internal],
   :vs/term_status #voc/lstr "accepted@en"})

(def Internal
  "Informatoin about internal characteristics that cannot be seen or observed"
  {:db/ident :dpvo-pd/Internal,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Informatoin about internal characteristics that cannot be seen or observed@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Internal@en",
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo-pd/Internal],
   :vs/term_status #voc/lstr "accepted@en"})

(def Job
  "Information about professional jobs"
  {:db/ident :dpvo-pd/Job,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about professional jobs@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Job@en",
   :rdfs/subClassOf
   [:dpvo-pd/Professional :dpvo-pd/Job :dpvo/PersonalData :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def KnowledgeBelief
  "Information about knowledge and beliefs"
  {:db/ident :dpvo-pd/KnowledgeBelief,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about knowledge and beliefs@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Knowledge and Beliefs@en",
   :rdfs/subClassOf
   [:dpvo-pd/Internal :dpvo-pd/KnowledgeBelief :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def Language
  "Information about language and lingual history."
  {:db/ident :dpvo-pd/Language,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr
                         "Information about language and lingual history.@en",
   :dcterms/modified #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Language@en",
   :rdfs/subClassOf [:dpvo-pd/External :dpvo-pd/Language :dpvo/PersonalData],
   :vs/term_status #voc/lstr "changed@en"})

(def LifeHistory
  "Information about personal history regarding events or activities - including their occurrences that might be directly related or have had an influence (e.g. World War, 9/11)"
  {:db/ident :dpvo-pd/LifeHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about personal history regarding events or activities - including  their occurrences that might be directly related or have had an influence (e.g. World War, 9/11)@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Life History@en",
   :rdfs/subClassOf
   [:dpvo-pd/Historical :dpvo-pd/LifeHistory :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def Like
  "Information about likes or preferences regarding attractions."
  {:db/ident :dpvo-pd/Like,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr "Information about likes or preferences regarding attractions.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Like@en",
   :rdfs/subClassOf [:dpvo-pd/Interest
                     :dpvo-pd/Like
                     :dpvo-pd/Preference
                     :dpvo/PersonalData
                     :dpvo-pd/Internal],
   :vs/term_status #voc/lstr "accepted@en"})

(def LinkClicked
  "Information about the links that an individual has clicked."
  {:db/ident :dpvo-pd/LinkClicked,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr "Information about the links that an individual has clicked.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Link Clicked@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Navigation"],
   :rdfs/subClassOf [:dpvo-pd/Behavioral
                     :dpvo-pd/LinkClicked
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def LoanRecord
  "Information about loans, whether applied, provided or rejected, and its history"
  {:db/ident :dpvo-pd/LoanRecord,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr
    "Information about loans, whether applied, provided or rejected, and its history@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Loan Record@en",
   :rdfs/subClassOf [:dpvo-pd/Transactional
                     :dpvo-pd/LoanRecord
                     :dpvo/PersonalData
                     :dpvo-pd/Financial],
   :vs/term_status #voc/lstr "accepted@en"})

(def Location
  "Information about location"
  {:db/ident :dpvo-pd/Location,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about location@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Location@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Location"],
   :rdfs/subClassOf [:dpvo-pd/Tracking :dpvo-pd/Location :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def MACAddress
  "Information about the Media Access Control (MAC) address of a device"
  {:db/ident :dpvo-pd/MACAddress,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about the Media Access Control (MAC) address of a device@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "MAC Address@en",
   :rdfs/subClassOf [:dpvo-pd/DeviceBased
                     :dpvo-pd/MACAddress
                     :dpvo/PersonalData
                     :dpvo-pd/Tracking],
   :vs/term_status #voc/lstr "accepted@en"})

(def MaritalStatus
  "Information about marital status and history"
  {:db/ident :dpvo-pd/MaritalStatus,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr
                         "Information about marital status and history@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Marital Status@en",
   :rdfs/subClassOf [:dpvo-pd/PublicLife
                     :dpvo-pd/MaritalStatus
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def Marriage
  "Information about marriage(s)."
  {:db/ident :dpvo-pd/Marriage,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about marriage(s).@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Marriage@en",
   :rdfs/subClassOf [:dpvo-pd/FamilyStructure
                     :dpvo-pd/Marriage
                     :dpvo/PersonalData
                     :dpvo-pd/Social
                     :dpvo-pd/Family],
   :vs/term_status #voc/lstr "accepted@en"})

(def MedicalHealth
  "Information about health, medical conditions or health care"
  {:db/ident :dpvo-pd/MedicalHealth,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr "Information about health, medical conditions or health care@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Medical Health@en",
   :rdfs/subClassOf [:dpvo-pd/External
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/MedicalHealth
                     :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def MentalHealth
  "Information about mental health."
  {:db/ident :dpvo-pd/MentalHealth,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about mental health.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Mental Health@en",
   :rdfs/subClassOf [:dpvo-pd/Health
                     :dpvo-pd/MentalHealth
                     :dpvo/PersonalData
                     :dpvo-pd/External
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/MedicalHealth],
   :vs/term_status #voc/lstr "accepted@en"})

(def Name
  "Information about names associated or used as given name or nickname."
  {:db/ident :dpvo-pd/Name,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr
    "Information about names associated or used as given name or nickname.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Name@en",
   :rdfs/subClassOf
   [:dpvo-pd/Identifying :dpvo-pd/Name :dpvo/PersonalData :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def Nationality
  "Information about nationality"
  {:db/ident            :dpvo-pd/Nationality,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "https://www.w3.org/2022/04/20-dpvcg-minutes.html",
   :dcterms/description #voc/lstr "Information about nationality@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          #voc/lstr "Nationality@en",
   :rdfs/subClassOf     [:dpvo-pd/External
                         :dpvo-pd/Nationality
                         :dpvo/PersonalData],
   :vs/term_status      #voc/lstr "accepted@en"})

(def OfficialID
  "Information about an official identifier or identification document"
  {:db/ident :dpvo-pd/OfficialID,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about an official identifier or identification document@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Official ID@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Government"],
   :rdfs/subClassOf [:dpvo-pd/Identifying
                     :dpvo-pd/OfficialID
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def Offspring
  "Information about offspring(s)."
  {:db/ident :dpvo-pd/Offspring,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about offspring(s).@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Offspring@en",
   :rdfs/subClassOf [:dpvo-pd/FamilyStructure
                     :dpvo-pd/Offspring
                     :dpvo/PersonalData
                     :dpvo-pd/Social
                     :dpvo-pd/Family],
   :vs/term_status #voc/lstr "accepted@en"})

(def Opinion
  "Information about opinions"
  {:db/ident :dpvo-pd/Opinion,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about opinions@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Opinion@en",
   :rdfs/subClassOf
   [:dpvo-pd/Preference :dpvo-pd/Opinion :dpvo/PersonalData :dpvo-pd/Internal],
   :vs/term_status #voc/lstr "accepted@en"})

(def Ownership
  "Information about ownership and history, including renting, borrowing, possessions."
  {:db/ident :dpvo-pd/Ownership,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about ownership and history, including renting, borrowing, possessions.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Ownership@en",
   :rdfs/subClassOf [:dpvo-pd/Financial :dpvo-pd/Ownership :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def PINCode
  "Information about Personal identification number (PIN), which is usually used in the process of authenticating the individual as an user accessing a system."
  {:db/ident :dpvo-pd/PINCode,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about Personal identification number (PIN), which is usually used in the process of authenticating the individual as an user accessing a system.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "PIN Code@en",
   :rdfs/subClassOf [:dpvo-pd/Authenticating
                     :dpvo-pd/PINCode
                     :dpvo/PersonalData
                     :dpvo-pd/Internal],
   :vs/term_status #voc/lstr "accepted@en"})

(def Parent
  "Information about parent(s)."
  {:db/ident :dpvo-pd/Parent,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about parent(s).@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Parent@en",
   :rdfs/subClassOf [:dpvo-pd/FamilyStructure
                     :dpvo-pd/Parent
                     :dpvo/PersonalData
                     :dpvo-pd/Social
                     :dpvo-pd/Family],
   :vs/term_status #voc/lstr "accepted@en"})

(def Passport
  "Information about passport"
  {:db/ident            :dpvo-pd/Passport,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Information about passport@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          #voc/lstr "Passport@en",
   :rdfs/subClassOf     [:dpvo-pd/OfficialID
                         :dpvo-pd/Passport
                         :dpvo/PersonalData
                         :dpvo-pd/External
                         :dpvo-pd/Identifying],
   :vs/term_status      #voc/lstr "accepted@en"})

(def Password
  "Information about password used in the process of authenticating the individual as an user accessing a system."
  {:db/ident :dpvo-pd/Password,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about password used in the process of authenticating the individual as an user accessing a system.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Password@en",
   :rdfs/subClassOf [:dpvo-pd/Authenticating
                     :dpvo-pd/Password
                     :dpvo/PersonalData
                     :dpvo-pd/Internal],
   :vs/term_status #voc/lstr "accepted@en"})

(def PastEmployment
  "Information about past employment"
  {:db/ident            :dpvo-pd/PastEmployment,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Information about past employment@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          #voc/lstr "Past Employment@en",
   :rdfs/subClassOf     [:dpvo-pd/EmploymentHistory
                         :dpvo-pd/PastEmployment
                         :dpvo-pd/Professional
                         :dpvo/PersonalData
                         :dpvo-pd/Social],
   :vs/term_status      #voc/lstr "accepted@en"})

(def PaymentCard
  "Information about payment card such as Credit Card, Debit Card."
  {:db/ident :dpvo-pd/PaymentCard,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Information about payment card such as Credit Card, Debit Card.@en",
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Payment Card@en",
   :rdfs/subClassOf [:dpvo-pd/FinancialAccount
                     :dpvo-pd/PaymentCard
                     :dpvo/PersonalData
                     :dpvo-pd/Financial],
   :vs/term_status #voc/lstr "accepted@en"})

(def PaymentCardExpiry
  "Information about payment card expiry such as a date."
  {:db/ident :dpvo-pd/PaymentCardExpiry,
   :dcterms/created #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   #voc/lstr "Information about payment card expiry such as a date.@en",
   :dcterms/source "https://www.w3.org/community/dpvcg/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Payment Card Expiry@en",
   :rdfs/subClassOf [:dpvo-pd/PaymentCard
                     :dpvo-pd/PaymentCardExpiry
                     :dpvo/PersonalData
                     :dpvo-pd/FinancialAccount
                     :dpvo-pd/Financial],
   :vs/term_status #voc/lstr "accepted@en"})

(def PaymentCardNumber
  "Information about payment card number."
  {:db/ident            :dpvo-pd/PaymentCardNumber,
   :dcterms/created     #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator     "Georg P Krog",
   :dcterms/description #voc/lstr "Information about payment card number.@en",
   :dcterms/source      "https://www.w3.org/community/dpvcg/",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          #voc/lstr "Payment Card Number@en",
   :rdfs/subClassOf     [:dpvo-pd/AccountIdentifier
                         :dpvo-pd/PaymentCard
                         :dpvo-pd/PaymentCardNumber
                         :dpvo/PersonalData
                         :dpvo-pd/FinancialAccount
                         :dpvo-pd/Financial],
   :vs/term_status      #voc/lstr "accepted@en"})

(def PerformanceAtWork
  "Information about performance at work or within work environments"
  {:db/ident :dpvo-pd/PerformanceAtWork,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Information about performance at work or within work environments@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Performance at Work@en",
   :rdfs/subClassOf [:dpvo-pd/Professional
                     :dpvo-pd/Behavioral
                     :dpvo-pd/PerformanceAtWork
                     :dpvo/PersonalData
                     :dpvo-pd/Social
                     :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def PersonalDocuments
  "Information about and including personal documents e.g. diaries or journals"
  {:db/ident :dpvo-pd/PersonalDocuments,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Information about and including personal documents e.g. diaries or journals@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Personal Documents@en",
   :rdfs/subClassOf
   [:dpvo-pd/External :dpvo-pd/PersonalDocuments :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def PersonalPossession
  "Information about personal possessions."
  {:db/ident :dpvo-pd/PersonalPossession,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about personal possessions.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Personal Possession@en",
   :rdfs/subClassOf [:dpvo-pd/Ownership
                     :dpvo-pd/PersonalPossession
                     :dpvo/PersonalData
                     :dpvo-pd/Financial],
   :vs/term_status #voc/lstr "accepted@en"})

(def Personality
  "Information about personality (e.g., categorization in terms of the Big Five personality traits)"
  {:db/ident :dpvo-pd/Personality,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr
    "Information about personality (e.g., categorization in terms of the Big Five personality traits)@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Personality@en",
   :rdfs/subClassOf [:dpvo-pd/Behavioral
                     :dpvo-pd/Personality
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def PhilosophicalBelief
  "Information about philosophical beliefs."
  {:db/ident :dpvo-pd/PhilosophicalBelief,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about philosophical beliefs.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Philosophical Belief@en",
   :rdfs/subClassOf [:dpvo-pd/KnowledgeBelief
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/PhilosophicalBelief
                     :dpvo/PersonalData
                     :dpvo-pd/Internal],
   :vs/term_status #voc/lstr "accepted@en"})

(def PhysicalAddress
  "Information about physical address."
  {:db/ident :dpvo-pd/PhysicalAddress,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about physical address.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Physical Address@en",
   :rdfs/subClassOf [:dpvo-pd/Contact
                     :dpvo-pd/PhysicalAddress
                     :dpvo/PersonalData
                     :dpvo-pd/Tracking],
   :vs/term_status #voc/lstr "accepted@en"})

(def PhysicalCharacteristic
  "Information about physical characteristics"
  {:db/ident :dpvo-pd/PhysicalCharacteristic,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr
                         "Information about physical characteristics@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Physical Characteristic@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Demographic"],
   :rdfs/subClassOf
   [:dpvo-pd/External :dpvo-pd/PhysicalCharacteristic :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def PhysicalHealth
  "Information about physical health."
  {:db/ident :dpvo-pd/PhysicalHealth,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about physical health.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Physical Health@en",
   :rdfs/subClassOf [:dpvo-pd/Health
                     :dpvo-pd/PhysicalHealth
                     :dpvo/PersonalData
                     :dpvo-pd/External
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/MedicalHealth],
   :vs/term_status #voc/lstr "accepted@en"})

(def PhysicalTrait
  "Information about defining traits or features regarding the body."
  {:db/ident :dpvo-pd/PhysicalTrait,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about defining traits or features regarding the body.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Physical Trait@en",
   :rdfs/subClassOf [:dpvo-pd/Demographic
                     :dpvo-pd/PhysicalTrait
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def Picture
  "Information about visual representation or image e.g. profile photo."
  {:db/ident :dpvo-pd/Picture,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr
    "Information about visual representation or image e.g. profile photo.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Picture@en",
   :rdfs/subClassOf
   [:dpvo-pd/Identifying :dpvo-pd/Picture :dpvo/PersonalData :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def Piercing
  "Information about piercings"
  {:db/ident :dpvo-pd/Piercing,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about piercings@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Piercing@en",
   :rdfs/subClassOf [:dpvo-pd/PhysicalCharacteristic
                     :dpvo-pd/Piercing
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def PoliticalAffiliation
  "Information about political affiliation and history"
  {:db/ident :dpvo-pd/PoliticalAffiliation,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr "Information about political affiliation and history@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Political Affiliation@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Political"],
   :rdfs/subClassOf [:dpvo-pd/PublicLife
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/PoliticalAffiliation
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def PoliticalOpinion
  "Information about opinions regarding politics and political topics"
  {:db/ident :dpvo-pd/PoliticalOpinion,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Information about opinions regarding politics and political topics@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Political Opinion@en",
   :rdfs/subClassOf [:dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/PublicLife
                     :dpvo-pd/PoliticalOpinion
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def Preference
  "Information about preferences or interests"
  {:db/ident :dpvo-pd/Preference,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr
                         "Information about preferences or interests@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Preference@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Preference"],
   :rdfs/subClassOf [:dpvo-pd/Internal :dpvo-pd/Preference :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def Prescription
  "Information about medical and pharmaceutical prescriptions"
  {:db/ident :dpvo-pd/Prescription,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr "Information about medical and pharmaceutical prescriptions@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Prescription@en",
   :rdfs/subClassOf [:dpvo-pd/MedicalHealth
                     :dpvo-pd/Prescription
                     :dpvo/PersonalData
                     :dpvo-pd/External
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def PrivacyPreference
  "Information about privacy preferences"
  {:db/ident :dpvo-pd/PrivacyPreference,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about privacy preferences@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Privacy Preference@en",
   :rdfs/subClassOf [:dpvo-pd/Preference
                     :dpvo-pd/PrivacyPreference
                     :dpvo/PersonalData
                     :dpvo-pd/Internal],
   :vs/term_status #voc/lstr "accepted@en"})

(def Proclivitie
  "Information about proclivities in a sexual context"
  {:db/ident :dpvo-pd/Proclivitie,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr "Information about proclivities in a sexual context@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Proclivitie@en",
   :rdfs/subClassOf [:dpvo-pd/Sexual
                     :dpvo-pd/Proclivitie
                     :dpvo/PersonalData
                     :dpvo-pd/External
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def Professional
  "Information about educational or professional career"
  {:db/ident :dpvo-pd/Professional,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr "Information about educational or professional career@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Professional@en",
   :rdfs/subClassOf [:dpvo-pd/Social :dpvo-pd/Professional :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def ProfessionalCertification
  "Information about professional certifications"
  {:db/ident :dpvo-pd/ProfessionalCertification,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr
                         "Information about professional certifications@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Professional Certification@en",
   :rdfs/subClassOf [:dpvo-pd/Professional
                     :dpvo-pd/ProfessionalCertification
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def ProfessionalEvaluation
  "Information about professional evaluations"
  {:db/ident :dpvo-pd/ProfessionalEvaluation,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr
                         "Information about professional evaluations@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Professional Evaluation@en",
   :rdfs/subClassOf [:dpvo-pd/Professional
                     :dpvo-pd/ProfessionalEvaluation
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def ProfessionalInterview
  "Information about professional interviews"
  {:db/ident :dpvo-pd/ProfessionalInterview,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr
                         "Information about professional interviews@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Professional Interview@en",
   :rdfs/subClassOf [:dpvo-pd/Professional
                     :dpvo-pd/ProfessionalInterview
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def Profile
  "Profile or user profile is information and representation of characteristics associated with person(s) or group(s)"
  {:db/ident :dpvo-pd/Profile,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr
    "Profile or user profile is information and representation of characteristics associated with person(s) or group(s)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Profile@en",
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo-pd/Profile],
   :vs/term_status #voc/lstr "accepted@en"})

(def PublicLife
  "Information about public life"
  {:db/ident :dpvo-pd/PublicLife,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about public life@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Public Life@en",
   :rdfs/subClassOf [:dpvo-pd/Social :dpvo-pd/PublicLife :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def PubliclyAvailableSocialMedia
  "Information about social media that is publicly available"
  {:db/ident :dpvo-pd/PubliclyAvailableSocialMedia,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Information about social media that is publicly available@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Publicly Available Social Media@en",
   :rdfs/subClassOf [:dpvo-pd/SocialMedia
                     :dpvo-pd/PubliclyAvailableSocialMedia
                     :dpvo/PersonalData
                     :dpvo-pd/Social
                     :dpvo-pd/Communication],
   :vs/term_status #voc/lstr "accepted@en"})

(def Purchase
  "Information about purchases such as items bought e.g. grocery or clothing"
  {:db/ident :dpvo-pd/Purchase,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about purchases such as items bought e.g. grocery or clothing@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Purchase@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Purchase"],
   :rdfs/subClassOf [:dpvo-pd/Transactional
                     :dpvo-pd/Purchase
                     :dpvo/PersonalData
                     :dpvo-pd/Financial],
   :vs/term_status #voc/lstr "accepted@en"})

(def PurchasesAndSpendingHabit
  "Information about analysis of purchases made and money spent expressed as a habit e.g. monthly shopping trends"
  {:db/ident :dpvo-pd/PurchasesAndSpendingHabit,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr
    "Information about analysis of purchases made and money spent expressed as a habit e.g. monthly shopping trends@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Purchases and Spending Habit@en",
   :rdfs/subClassOf [:dpvo-pd/Transactional
                     :dpvo-pd/PurchasesAndSpendingHabit
                     :dpvo/PersonalData
                     :dpvo-pd/Financial],
   :vs/term_status #voc/lstr "accepted@en"})

(def Race
  "Information about race or racial history."
  {:db/ident :dpvo-pd/Race,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr
                         "Information about race or racial history.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Race@en",
   :rdfs/subClassOf [:dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/Ethnicity
                     :dpvo-pd/Race
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def Reference
  "Information about references in the professional context"
  {:db/ident :dpvo-pd/Reference,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr "Information about references in the professional context@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Reference@en",
   :rdfs/subClassOf [:dpvo-pd/Professional
                     :dpvo-pd/Reference
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def Relationship
  "Information about relationships and relationship history."
  {:db/ident :dpvo-pd/Relationship,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr "Information about relationships and relationship history.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Relationship@en",
   :rdfs/subClassOf
   [:dpvo-pd/Family :dpvo-pd/Relationship :dpvo/PersonalData :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def Reliability
  "Information about reliability (e.g. of a person)"
  {:db/ident            :dpvo-pd/Reliability,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Information about reliability (e.g. of a person)@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          #voc/lstr "Reliability@en",
   :rdfs/subClassOf     [:dpvo-pd/Behavioral
                         :dpvo-pd/Reliability
                         :dpvo/PersonalData
                         :dpvo-pd/External],
   :vs/term_status      #voc/lstr "accepted@en"})

(def Religion
  "Information about religion, religious inclinations, and religious history."
  {:db/ident :dpvo-pd/Religion,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr
    "Information about religion, religious inclinations, and religious history.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Religion@en",
   :rdfs/subClassOf [:dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/PublicLife
                     :dpvo-pd/Religion
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def ReligiousBelief
  "Information about religion and religious beliefs."
  {:db/ident :dpvo-pd/ReligiousBelief,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr
                         "Information about religion and religious beliefs.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Religious Belief@en",
   :rdfs/subClassOf [:dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/KnowledgeBelief
                     :dpvo-pd/ReligiousBelief
                     :dpvo/PersonalData
                     :dpvo-pd/Internal],
   :vs/term_status #voc/lstr "accepted@en"})

(def Retina
  "Information about retina and the retinal patterns."
  {:db/ident :dpvo-pd/Retina,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr "Information about retina and the retinal patterns.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Retina@en",
   :rdfs/subClassOf [:dpvo-pd/Biometric
                     :dpvo-pd/Retina
                     :dpvo/PersonalData
                     :dpvo-pd/External
                     :dpvo-pd/Identifying
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def RoomNumber
  "Information about location expressed as Room number or similar numbering systems"
  {:db/ident :dpvo-pd/RoomNumber,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about location expressed as Room number or similar numbering systems@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Room Number@en",
   :rdfs/subClassOf
   [:dpvo-pd/Location :dpvo-pd/RoomNumber :dpvo/PersonalData :dpvo-pd/Tracking],
   :vs/term_status #voc/lstr "accepted@en"})

(def Salary
  "Information about salary"
  {:db/ident :dpvo-pd/Salary,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about salary@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Salary@en",
   :rdfs/subClassOf
   [:dpvo-pd/Professional :dpvo-pd/Salary :dpvo/PersonalData :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def Sale
  "Information about sales e.g. selling of goods or services"
  {:db/ident :dpvo-pd/Sale,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr "Information about sales e.g. selling of goods or services@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Sale@en",
   :rdfs/subClassOf
   [:dpvo-pd/Transactional :dpvo-pd/Sale :dpvo/PersonalData :dpvo-pd/Financial],
   :vs/term_status #voc/lstr "accepted@en"})

(def School
  "Information about school such as name of school, conduct, or grades obtained."
  {:db/ident :dpvo-pd/School,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about school such as name of school, conduct, or grades obtained.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "School@en",
   :rdfs/subClassOf
   [:dpvo-pd/Professional :dpvo-pd/School :dpvo/PersonalData :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def SecretText
  "Information about secret text used in the process of authenticating the individual as an user accessing a system, e.g., when recovering a lost password."
  {:db/ident :dpvo-pd/SecretText,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr
    "Information about secret text used in the process of authenticating the individual as an user accessing a system, e.g., when recovering a lost password.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Secret Text@en",
   :rdfs/subClassOf [:dpvo-pd/Authenticating
                     :dpvo-pd/SecretText
                     :dpvo/PersonalData
                     :dpvo-pd/Internal],
   :vs/term_status #voc/lstr "accepted@en"})

(def ServiceConsumptionBehavior
  "Information about the consumption of a service, e.g. time and duration of consumption."
  {:db/ident :dpvo-pd/ServiceConsumptionBehavior,
   :dcterms/created #inst "2019-11-26T00:00:00.000-05:00",
   :dcterms/creator ["Rudy Jacob" "Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about the consumption of a service, e.g. time and duration of consumption.@en",
   :dcterms/source "https://specialprivacy.ercim.eu/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Service Consumption Behavior@en",
   :rdfs/subClassOf [:dpvo-pd/Behavioral
                     :dpvo-pd/ServiceConsumptionBehavior
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def Sexual
  "Information about sexuality and sexual history"
  {:db/ident :dpvo-pd/Sexual,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr
                         "Information about sexuality and sexual history@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Sexual@en",
   :rdfs/subClassOf [:dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/External
                     :dpvo-pd/Sexual
                     :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def SexualHistory
  "Information about sexual history"
  {:db/ident :dpvo-pd/SexualHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about sexual history@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Sexual History@en",
   :rdfs/subClassOf [:dpvo-pd/Sexual
                     :dpvo-pd/SexualHistory
                     :dpvo/PersonalData
                     :dpvo-pd/External
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def SexualPreference
  "Information about sexual preferences"
  {:db/ident :dpvo-pd/SexualPreference,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about sexual preferences@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Sexual Preference@en",
   :rdfs/subClassOf [:dpvo-pd/Sexual
                     :dpvo-pd/SexualPreference
                     :dpvo/PersonalData
                     :dpvo-pd/External
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def Sibling
  "Information about sibling(s)."
  {:db/ident :dpvo-pd/Sibling,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about sibling(s).@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Sibling@en",
   :rdfs/subClassOf [:dpvo-pd/FamilyStructure
                     :dpvo-pd/Sibling
                     :dpvo/PersonalData
                     :dpvo-pd/Social
                     :dpvo-pd/Family],
   :vs/term_status #voc/lstr "accepted@en"})

(def SkinTone
  "Information about skin tone"
  {:db/ident :dpvo-pd/SkinTone,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about skin tone@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Skin Tone@en",
   :rdfs/subClassOf [:dpvo-pd/PhysicalCharacteristic
                     :dpvo-pd/SkinTone
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def Social
  "Information about social aspects such as family, public life, or professional networks."
  {:db/ident :dpvo-pd/Social,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about social aspects such as family, public life, or professional networks.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Social@en",
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def SocialMedia
  "Information about social media"
  {:db/ident            :dpvo-pd/SocialMedia,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Information about social media@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          #voc/lstr "Social Media@en",
   :rdfs/subClassOf     [:dpvo-pd/Communication
                         :dpvo-pd/SocialMedia
                         :dpvo/PersonalData
                         :dpvo-pd/Social],
   :vs/term_status      #voc/lstr "accepted@en"})

(def SocialMediaCommunication
  "Information about social media communication, including the communication itself and metadata."
  {:db/ident :dpvo-pd/SocialMediaCommunication,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about social media communication, including the communication itself and metadata.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Social Media Communication@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#Social"],
   :rdfs/subClassOf [:dpvo-pd/Communication
                     :dpvo-pd/SocialMediaCommunication
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def SocialNetwork
  "Information about friends or connections expressed as a social network"
  {:db/ident :dpvo-pd/SocialNetwork,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about friends or connections expressed as a social network@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Social Network@en",
   :rdfs/subClassOf [:dpvo-pd/Social :dpvo-pd/SocialNetwork :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def SocialStatus
  "Information about social status"
  {:db/ident :dpvo-pd/SocialStatus,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about social status@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Social Status@en",
   :rdfs/subClassOf [:dpvo-pd/PublicLife
                     :dpvo-pd/SocialStatus
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def TVViewingBehavior
  "Information about TV viewing Behavior, such as timestamps of channel change, duration of viewership, content consumed"
  {:db/ident :dpvo-pd/TVViewingBehavior,
   :dcterms/created #inst "2019-11-26T00:00:00.000-05:00",
   :dcterms/creator ["Harshvardhan J. Pandit" "Rudy Jacob"],
   :dcterms/description
   #voc/lstr
    "Information about TV viewing Behavior, such as timestamps of channel change, duration of viewership, content consumed@en",
   :dcterms/source "https://specialprivacy.ercim.eu/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "TV Viewing Behavior@en",
   :rdfs/subClassOf [:dpvo-pd/ServiceConsumptionBehavior
                     :dpvo-pd/TVViewingBehavior
                     :dpvo/PersonalData
                     :dpvo-pd/External
                     :dpvo-pd/Behavioral],
   :vs/term_status #voc/lstr "accepted@en"})

(def Tattoo
  "Information about tattoos"
  {:db/ident :dpvo-pd/Tattoo,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about tattoos@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Tattoo@en",
   :rdfs/subClassOf [:dpvo-pd/PhysicalCharacteristic
                     :dpvo-pd/Tattoo
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def Tax
  "Information about financial tax e.g. tax records or tax due"
  {:db/ident :dpvo-pd/Tax,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr "Information about financial tax e.g. tax records or tax due@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Tax@en",
   :rdfs/subClassOf
   [:dpvo-pd/Transactional :dpvo-pd/Tax :dpvo/PersonalData :dpvo-pd/Financial],
   :vs/term_status #voc/lstr "accepted@en"})

(def TelephoneNumber
  "Information about telephone number."
  {:db/ident :dpvo-pd/TelephoneNumber,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about telephone number.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Telephone Number@en",
   :rdfs/subClassOf [:dpvo-pd/Contact
                     :dpvo-pd/TelephoneNumber
                     :dpvo/PersonalData
                     :dpvo-pd/Tracking],
   :vs/term_status #voc/lstr "accepted@en"})

(def Thought
  "Information about thoughts"
  {:db/ident :dpvo-pd/Thought,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about thoughts@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Thought@en",
   :rdfs/subClassOf [:dpvo-pd/KnowledgeBelief
                     :dpvo-pd/Thought
                     :dpvo/PersonalData
                     :dpvo-pd/Internal],
   :vs/term_status #voc/lstr "accepted@en"})

(def Tracking
  "Information used to track an individual or group e.g. location or email"
  {:db/ident :dpvo-pd/Tracking,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information used to track an individual or group e.g. location or email@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Tracking@en",
   :rdfs/subClassOf [:dpvo/PersonalData :dpvo-pd/Tracking],
   :vs/term_status #voc/lstr "accepted@en"})

(def TradeUnionMembership
  "Information about trade union memberships and related topics"
  {:db/ident :dpvo-pd/TradeUnionMembership,
   :dcterms/created #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Information about trade union memberships and related topics@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Trade Union Membership@en",
   :rdfs/subClassOf [:dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/GroupMembership
                     :dpvo-pd/TradeUnionMembership
                     :dpvo/PersonalData
                     :dpvo-pd/Social
                     :dpvo-pd/SocialNetwork],
   :vs/term_status #voc/lstr "accepted@en"})

(def Transaction
  "Information about financial transactions e.g. bank transfers"
  {:db/ident :dpvo-pd/Transaction,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr "Information about financial transactions e.g. bank transfers@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Transaction@en",
   :rdfs/subClassOf [:dpvo-pd/Transactional
                     :dpvo-pd/Transaction
                     :dpvo/PersonalData
                     :dpvo-pd/Financial],
   :vs/term_status #voc/lstr "accepted@en"})

(def Transactional
  "Information about a purchasing, spending or income"
  {:db/ident :dpvo-pd/Transactional,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr "Information about a purchasing, spending or income@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Transactional@en",
   :rdfs/subClassOf
   [:dpvo-pd/Financial :dpvo-pd/Transactional :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def TravelHistory
  "Information about travel history"
  {:db/ident            :dpvo-pd/TravelHistory,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Information about travel history@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          #voc/lstr "Travel History@en",
   :rdfs/subClassOf     [:dpvo-pd/Location
                         :dpvo-pd/TravelHistory
                         :dpvo/PersonalData
                         :dpvo-pd/Tracking],
   :vs/term_status      #voc/lstr "accepted@en"})

(def UID
  "Information about unique identifiers."
  {:db/ident :dpvo-pd/UID,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about unique identifiers.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "UID@en",
   :rdfs/seeAlso ["https://specialprivacy.ercim.eu/vocabs/data#UniqueId"],
   :rdfs/subClassOf
   [:dpvo-pd/Identifying :dpvo-pd/UID :dpvo/PersonalData :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def UserAgent
  "Information about software acting on behalf of users e.g. web browser"
  {:db/ident :dpvo-pd/UserAgent,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Georg P Krog",
   :dcterms/description
   #voc/lstr
    "Information about software acting on behalf of users e.g. web browser@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "User agent@en",
   :rdfs/subClassOf [:dpvo-pd/Tracking :dpvo-pd/UserAgent :dpvo/PersonalData],
   :vs/term_status #voc/lstr "accepted@en"})

(def Username
  "Information about usernames."
  {:db/ident :dpvo-pd/Username,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description #voc/lstr "Information about usernames.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Username@en",
   :rdfs/subClassOf [:dpvo-pd/Identifying
                     :dpvo-pd/Username
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def VehicalLicenseNumber
  "Information about vehicle license number"
  {:db/ident            :dpvo-pd/VehicalLicenseNumber,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Information about vehicle license number@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          #voc/lstr "Vehicle License Number@en",
   :rdfs/subClassOf     [:dpvo-pd/VehicleLicense
                         :dpvo-pd/VehicalLicenseNumber
                         :dpvo-pd/Vehicle
                         :dpvo/PersonalData
                         :dpvo-pd/External
                         :dpvo-pd/Identifying],
   :vs/term_status      #voc/lstr "accepted@en"})

(def VehicalLicenseRegistration
  "Information about vehicle license registration"
  {:db/ident            :dpvo-pd/VehicalLicenseRegistration,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr
                         "Information about vehicle license registration@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          #voc/lstr "Vehicle License Registration@en",
   :rdfs/subClassOf     [:dpvo-pd/VehicleLicense
                         :dpvo-pd/VehicalLicenseRegistration
                         :dpvo-pd/Vehicle
                         :dpvo/PersonalData
                         :dpvo-pd/External
                         :dpvo-pd/Identifying],
   :vs/term_status      #voc/lstr "accepted@en"})

(def Vehicle
  "Information about vehicles"
  {:db/ident            :dpvo-pd/Vehicle,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Information about vehicles@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          #voc/lstr "Vehicle@en",
   :rdfs/subClassOf     [:dpvo-pd/External :dpvo-pd/Vehicle :dpvo/PersonalData],
   :vs/term_status      #voc/lstr "accepted@en"})

(def VehicleLicense
  "Information about vehicle license"
  {:db/ident            :dpvo-pd/VehicleLicense,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Information about vehicle license@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          #voc/lstr "Vehicle License@en",
   :rdfs/subClassOf     [:dpvo-pd/Vehicle
                         :dpvo-pd/Identifying
                         :dpvo-pd/VehicleLicense
                         :dpvo/PersonalData
                         :dpvo-pd/External],
   :vs/term_status      #voc/lstr "accepted@en"})

(def VehicleUsage
  "Information about usage of vehicles, e.g. driving statistics"
  {:db/ident :dpvo-pd/VehicleUsage,
   :dcterms/created #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator "Harshvardhan J. Pandit",
   :dcterms/description
   #voc/lstr "Information about usage of vehicles, e.g. driving statistics@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Vehicle Usage@en",
   :rdfs/subClassOf [:dpvo-pd/Behavioral
                     :dpvo-pd/Vehicle
                     :dpvo-pd/VehicleUsage
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def VoiceCommunicationRecording
  "Information about vocal recorded communication (e.g. telephony, VoIP)"
  {:db/ident :dpvo-pd/VoiceCommunicationRecording,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description
   #voc/lstr
    "Information about vocal recorded communication (e.g. telephony, VoIP)@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Voice Communication Recording@en",
   :rdfs/subClassOf [:dpvo-pd/Communication
                     :dpvo-pd/VoiceCommunicationRecording
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def VoiceMail
  "Information about voice mail messages."
  {:db/ident :dpvo-pd/VoiceMail,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about voice mail messages.@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Voice Mail@en",
   :rdfs/subClassOf [:dpvo-pd/Communication
                     :dpvo-pd/VoiceMail
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def Weight
  "Information about physical weight"
  {:db/ident :dpvo-pd/Weight,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Fajar Ekaputra" "Elmar Kiesling; Harshvardhan J. Pandit"],
   :dcterms/description #voc/lstr "Information about physical weight@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Weight@en",
   :rdfs/subClassOf [:dpvo-pd/PhysicalCharacteristic
                     :dpvo-pd/Weight
                     :dpvo/PersonalData
                     :dpvo-pd/External],
   :vs/term_status #voc/lstr "accepted@en"})

(def WorkEnvironment
  "Information about work environments"
  {:db/ident            :dpvo-pd/WorkEnvironment,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     "Harshvardhan J. Pandit",
   :dcterms/description #voc/lstr "Information about work environments@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label          #voc/lstr "Work Environment@en",
   :rdfs/subClassOf     [:dpvo-pd/Professional
                         :dpvo-pd/WorkEnvironment
                         :dpvo/PersonalData
                         :dpvo-pd/Social],
   :vs/term_status      #voc/lstr "accepted@en"})

(def WorkHistory
  "Information about work history in a professional context"
  {:db/ident :dpvo-pd/WorkHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator ["Elmar Kiesling; Harshvardhan J. Pandit" "Fajar Ekaputra"],
   :dcterms/description
   #voc/lstr "Information about work history in a professional context@en",
   :dcterms/source
   "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :rdfs/label #voc/lstr "Work History@en",
   :rdfs/subClassOf [:dpvo-pd/Professional
                     :dpvo-pd/WorkHistory
                     :dpvo/PersonalData
                     :dpvo-pd/Social],
   :vs/term_status #voc/lstr "accepted@en"})

(def ^{:private true} PersonalData
  {:db/ident        :dpvo/PersonalData,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :dpvo/PersonalData})

(def ^{:private true} SpecialCategoryPersonalData
  {:db/ident        :dpvo/SpecialCategoryPersonalData,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :dpvo/SpecialCategoryPersonalData})