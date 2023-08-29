(ns net.wikipunk.rdf.dpvo-pd
  "DPV-PD is an extension to the Data Privacy Vocabulary that provides additional terms related to Personal Data categories."
  {:dcat/downloadURL "resources/dpv-owl/dpv-pd/dpv-pd.ttl",
   :dcterms/abstract
   #rdf/langString
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
   :dcterms/created #xsd/date #inst "2022-04-02T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Axel Polleres"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "DPV-PD is an extension to the Data Privacy Vocabulary that provides additional terms related to Personal Data categories.@en",
   :dcterms/license {:rdfa/uri
                     "https://www.w3.org/Consortium/Legal/2015/doc-license"},
   :dcterms/modified #xsd/date #inst "2022-12-05T00:00:00.000-05:00",
   :dcterms/source {:rdfa/uri "https://www.w3.org/community/dpvcg/"},
   :dcterms/title #rdf/langString "DPV-PD: Personal Data Extension for DPV@en",
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
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about linguistic and speech accents.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Accent@en",
   :rdfs/subClassOf [:dpvo-pd/Language :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def AccountIdentifier
  "Information about financial account identifier."
  {:db/ident :dpvo-pd/AccountIdentifier,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString
                         "Information about financial account identifier.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Account Identifier@en",
   :rdfs/subClassOf
   [:dpvo-pd/FinancialAccount :dpvo-pd/Financial :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Acquantaince
  "Information about acquaintainces in a social network."
  {:db/ident :dpvo-pd/Acquantaince,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString "Information about acquaintainces in a social network.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Acquantaince@en",
   :rdfs/subClassOf [:dpvo-pd/SocialNetwork :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Age
  "Information about age"
  {:db/ident :dpvo-pd/Age,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about age@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Age@en",
   :rdfs/subClassOf
   [:dpvo-pd/PhysicalCharacteristic :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def AgeExact
  "Information about the exact age (i.e. to some degree within a year, month, or day)"
  {:db/ident :dpvo-pd/AgeExact,
   :dcterms/created #xsd/date #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Information about the exact age (i.e. to some degree within a year, month, or day)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Age Exact@en",
   :rdfs/subClassOf [:dpvo-pd/AgeRange
                     :dpvo-pd/Age
                     :dpvo-pd/External
                     :dpvo/PersonalData
                     :dpvo-pd/PhysicalCharacteristic],
   :vs/term_status #rdf/langString "accepted@en"})

(def AgeRange
  "Information about age range i.e. inexact age to some degree (i.e. some years)"
  {:db/ident :dpvo-pd/AgeRange,
   :dcterms/created #xsd/date #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Information about age range i.e. inexact age to some degree (i.e. some years)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Age Range@en",
   :rdfs/subClassOf [:dpvo-pd/Age
                     :dpvo-pd/External
                     :dpvo/PersonalData
                     :dpvo-pd/PhysicalCharacteristic],
   :vs/term_status #rdf/langString "accepted@en"})

(def ApartmentOwned
  "Information about apartment(s) owned and its history"
  {:db/ident :dpvo-pd/ApartmentOwned,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString "Information about apartment(s) owned and its history@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Apartment Owned@en",
   :rdfs/subClassOf [:dpvo-pd/HouseOwned
                     :dpvo-pd/Ownership
                     :dpvo-pd/Financial
                     :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Association
  "Information about associations in a social network with other individuals, groups, or entities e.g. friend of a friend"
  {:db/ident :dpvo-pd/Association,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about associations in a social network with other individuals, groups, or entities e.g. friend of a friend@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Association@en",
   :rdfs/subClassOf [:dpvo-pd/SocialNetwork :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Attitude
  "Information about attitude."
  {:db/ident :dpvo-pd/Attitude,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about attitude.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Attitude@en",
   :rdfs/subClassOf [:dpvo-pd/Behavioral :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Authenticating
  "Information about authentication and information used for authenticating"
  {:db/ident :dpvo-pd/Authenticating,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about authentication and information used for authenticating@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Authenticating@en",
   :rdfs/subClassOf [:dpvo-pd/Internal :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def AuthenticationHistory
  "Information about prior authentication and its outcomes such as login attempts or location."
  {:db/ident :dpvo-pd/AuthenticationHistory,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #rdf/langString
    "Information about prior authentication and its outcomes such as login attempts or location.@en",
   :dcterms/source {:rdfa/uri "https://www.w3.org/community/dpvcg/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Authentication History@en",
   :rdfs/subClassOf [:dpvo-pd/Behavioral :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def BankAccount
  "Information about bank accounts."
  {:db/ident :dpvo-pd/BankAccount,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString "Information about bank accounts.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Bank Account@en",
   :rdfs/subClassOf
   [:dpvo-pd/FinancialAccount :dpvo-pd/Financial :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Behavioral
  "Information about Behavior or activity"
  {:db/ident :dpvo-pd/Behavioral,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about Behavior or activity@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Behavioral@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Activity"},
   :rdfs/subClassOf [:dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Biometric
  "Information about biometrics and biometric characteristics."
  {:db/ident :dpvo-pd/Biometric,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString
    "Information about biometrics and biometric characteristics.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Biometric@en",
   :rdfs/subClassOf [:dpvo-pd/Identifying
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/External
                     :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def BirthDate
  "Information about birth date"
  {:db/ident            :dpvo-pd/BirthDate,
   :dcterms/created     #xsd/date #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Information about birth date@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          #rdf/langString "Birth Date@en",
   :rdfs/subClassOf     [:dpvo-pd/Age
                         :dpvo-pd/External
                         :dpvo/PersonalData
                         :dpvo-pd/PhysicalCharacteristic],
   :vs/term_status      #rdf/langString "accepted@en"})

(def BirthPlace
  "Information about birth place"
  {:db/ident            :dpvo-pd/BirthPlace,
   :dcterms/created     #xsd/date #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Information about birth place@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          #rdf/langString "Birth Place@en",
   :rdfs/subClassOf     [:dpvo-pd/Location
                         :dpvo-pd/Tracking
                         :dpvo/PersonalData],
   :vs/term_status      #rdf/langString "accepted@en"})

(def BloodType
  "Information about blood type."
  {:db/ident :dpvo-pd/BloodType,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about blood type.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Blood Type@en",
   :rdfs/subClassOf [:dpvo-pd/MedicalHealth
                     :dpvo-pd/External
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def BrowserFingerprint
  "Information about the web browser which is used as a 'fingerprint'"
  {:db/ident :dpvo-pd/BrowserFingerprint,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about the web browser which is used as a 'fingerprint'@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Browser Fingerprint@en",
   :rdfs/subClassOf [:dpvo-pd/DeviceBased :dpvo-pd/Tracking :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def BrowserHistory
  "Information about and including web browsing history"
  {:db/ident :dpvo-pd/BrowserHistory,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Information about and including web browsing history@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Browser History@en",
   :rdfs/subClassOf [:dpvo-pd/BrowsingBehavior
                     :dpvo-pd/External
                     :dpvo/PersonalData
                     :dpvo-pd/Behavioral],
   :vs/term_status #rdf/langString "accepted@en"})

(def BrowsingBehavior
  "Information about browsing Behavior."
  {:db/ident :dpvo-pd/BrowsingBehavior,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about browsing Behavior.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Browsing Behavior@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#OnlineActivity"},
   :rdfs/subClassOf [:dpvo-pd/Behavioral :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def BrowsingReferral
  "Information about web browsing referrer or referral, which can be based on location, targeted referrals, direct, organic search, social media or actions, campaigns."
  {:db/ident :dpvo-pd/BrowsingReferral,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #rdf/langString
    "Information about web browsing referrer or referral, which can be based on location, targeted referrals, direct, organic search, social media or actions, campaigns.@en",
   :dcterms/source {:rdfa/uri "https://www.w3.org/community/dpvcg/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Browsing Referral@en",
   :rdfs/subClassOf [:dpvo-pd/BrowsingBehavior
                     :dpvo-pd/External
                     :dpvo/PersonalData
                     :dpvo-pd/Behavioral],
   :vs/term_status #rdf/langString "accepted@en"})

(def CallLog
  "Information about the calls that an individual has made."
  {:db/ident :dpvo-pd/CallLog,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about the calls that an individual has made.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Call Log@en",
   :rdfs/subClassOf [:dpvo-pd/Behavioral :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def CarOwned
  "Information about cars ownership and ownership history."
  {:db/ident :dpvo-pd/CarOwned,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString "Information about cars ownership and ownership history.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Car Owned@en",
   :rdfs/subClassOf [:dpvo-pd/Ownership :dpvo-pd/Financial :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def CharacterClass
  "Information about character in the public sphere"
  {:db/ident :dpvo-pd/Character,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about character in the public sphere@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Character@en",
   :rdfs/subClassOf [:dpvo-pd/PublicLife :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Communication
  "Information communicated from or to an individual"
  {:db/ident :dpvo-pd/Communication,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information communicated from or to an individual@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Communication@en",
   :rdfs/subClassOf [:dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def CommunicationsMetadata
  "Information about communication metadata in the public sphere"
  {:db/ident :dpvo-pd/CommunicationsMetadata,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString
    "Information about communication metadata in the public sphere@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Communications Metadata@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Interactive"},
   :rdfs/subClassOf [:dpvo-pd/PublicLife :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Connection
  "Information about and including connections in a social network"
  {:db/ident :dpvo-pd/Connection,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about and including connections in a social network@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Connection@en",
   :rdfs/subClassOf [:dpvo-pd/SocialNetwork :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Contact
  "Information about contacts or used for contacting e.g. email address or phone number"
  {:db/ident :dpvo-pd/Contact,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about contacts or used for contacting e.g. email address or phone number@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Contact@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Physical"},
   :rdfs/subClassOf [:dpvo-pd/Tracking :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Country
  "Information about country e.g. residence, travel."
  {:db/ident :dpvo-pd/Country,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about country e.g. residence, travel.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Country@en",
   :rdfs/subClassOf [:dpvo-pd/Location :dpvo-pd/Tracking :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Credit
  "Information about reputation with regards to money"
  {:db/ident :dpvo-pd/Credit,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString "Information about reputation with regards to money@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Credit@en",
   :rdfs/subClassOf
   [:dpvo-pd/Transactional :dpvo-pd/Financial :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def CreditCapacity
  "Information about credit capacity."
  {:db/ident :dpvo-pd/CreditCapacity,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString "Information about credit capacity.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Credit Capacity@en",
   :rdfs/subClassOf [:dpvo-pd/Credit
                     :dpvo-pd/Transactional
                     :dpvo-pd/Financial
                     :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def CreditCardNumber
  "Information about credit card number"
  {:db/ident :dpvo-pd/CreditCardNumber,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString
                         "Information about credit card number@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Credit Card Number@en",
   :rdfs/subClassOf [:dpvo-pd/PaymentCardNumber
                     :dpvo-pd/PaymentCard
                     :dpvo-pd/Financial
                     :dpvo/PersonalData
                     :dpvo-pd/FinancialAccount
                     :dpvo-pd/AccountIdentifier],
   :vs/term_status #rdf/langString "accepted@en"})

(def CreditRecord
  "Information about credit record."
  {:db/ident :dpvo-pd/CreditRecord,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString "Information about credit record.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Credit Record@en",
   :rdfs/subClassOf [:dpvo-pd/Credit
                     :dpvo-pd/Transactional
                     :dpvo-pd/Financial
                     :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def CreditScore
  "Information about credit score."
  {:db/ident :dpvo-pd/CreditScore,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about credit score.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Credit Score@en",
   :rdfs/subClassOf [:dpvo-pd/CreditWorthiness
                     :dpvo-pd/Transactional
                     :dpvo-pd/Financial
                     :dpvo-pd/Credit
                     :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def CreditStanding
  "Information about credit standing."
  {:db/ident :dpvo-pd/CreditStanding,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about credit standing.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Credit Standing@en",
   :rdfs/subClassOf [:dpvo-pd/Credit
                     :dpvo-pd/Transactional
                     :dpvo-pd/Financial
                     :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def CreditWorthiness
  "Information about credit worthiness."
  {:db/ident :dpvo-pd/CreditWorthiness,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString
                         "Information about credit worthiness.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Credit Worthiness@en",
   :rdfs/subClassOf [:dpvo-pd/Credit
                     :dpvo-pd/Transactional
                     :dpvo-pd/Financial
                     :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Criminal
  "Information about criminal activity e.g. criminal convictions or jail time"
  {:db/ident :dpvo-pd/Criminal,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString
    "Information about criminal activity e.g. criminal convictions or jail time@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Criminal@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Judicial"},
   :rdfs/subClassOf [:dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def CriminalCharge
  "Information about criminal charges."
  {:db/ident :dpvo-pd/CriminalCharge,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString
                         "Information about criminal charges.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Criminal Charge@en",
   :rdfs/subClassOf [:dpvo-pd/Criminal :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def CriminalConviction
  "Information about criminal convictions."
  {:db/ident :dpvo-pd/CriminalConviction,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about criminal convictions.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Criminal Conviction@en",
   :rdfs/subClassOf [:dpvo-pd/Criminal :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def CriminalOffense
  "Information about criminal offenses"
  {:db/ident            :dpvo-pd/CriminalOffense,
   :dcterms/created     #xsd/date #inst "2022-10-22T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Georg P Krog"},
   :dcterms/description #rdf/langString
                         "Information about criminal offenses@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          #rdf/langString "Criminal Offense@en",
   :rdfs/subClassOf     [:dpvo-pd/Criminal :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status      #rdf/langString "accepted@en"})

(def CriminalPardon
  "Information about criminal pardons."
  {:db/ident :dpvo-pd/CriminalPardon,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString
                         "Information about criminal pardons.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Criminal Pardon@en",
   :rdfs/subClassOf [:dpvo-pd/Criminal :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def CurrentEmployment
  "Information about current employment"
  {:db/ident            :dpvo-pd/CurrentEmployment,
   :dcterms/created     #xsd/date #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Information about current employment@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          #rdf/langString "Current Employment@en",
   :rdfs/subClassOf     [:dpvo-pd/EmploymentHistory
                         :dpvo-pd/Social
                         :dpvo-pd/Professional
                         :dpvo/PersonalData],
   :vs/term_status      #rdf/langString "accepted@en"})

(def DNACode
  "Information about DNA."
  {:db/ident :dpvo-pd/DNACode,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about DNA.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "DNA Code@en",
   :rdfs/subClassOf [:dpvo-pd/MedicalHealth
                     :dpvo-pd/External
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Demeanor
  "Information about demeanor."
  {:db/ident :dpvo-pd/Demeanor,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about demeanor.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Demeanor@en",
   :rdfs/subClassOf [:dpvo-pd/Behavioral :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Demographic
  "Information about demography and demographic characteristics"
  {:db/ident :dpvo-pd/Demographic,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about demography and demographic characteristics@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Demographic@en",
   :rdfs/subClassOf [:dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def DeviceApplications
  "Information about applications or application-like software on a device."
  {:db/ident :dpvo-pd/DeviceApplications,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString
    "Information about applications or application-like software on a device.@en",
   :dcterms/source {:rdfa/uri "https://www.w3.org/community/dpvcg/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Device Applications@en",
   :rdfs/subClassOf [:dpvo-pd/DeviceSoftware
                     :dpvo-pd/DeviceBased
                     :dpvo-pd/Tracking
                     :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def DeviceBased
  "Information about devices"
  {:db/ident :dpvo-pd/DeviceBased,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString "Information about devices@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Device Based@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Computer"},
   :rdfs/subClassOf [:dpvo-pd/Tracking :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def DeviceOperatingSystem
  "Information about the operating system (OS) or system software that manages hardware or software resources."
  {:db/ident :dpvo-pd/DeviceOperatingSystem,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Information about the operating system (OS) or system software that manages hardware or software resources.@en",
   :dcterms/source {:rdfa/uri "https://www.w3.org/community/dpvcg/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Device Operating System@en",
   :rdfs/subClassOf [:dpvo-pd/DeviceSoftware
                     :dpvo-pd/DeviceBased
                     :dpvo-pd/Tracking
                     :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def DeviceSoftware
  "Information about software on or related to a device."
  {:db/ident :dpvo-pd/DeviceSoftware,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Beatriz Esteves"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString "Information about software on or related to a device.@en",
   :dcterms/source {:rdfa/uri "https://www.w3.org/community/dpvcg/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Device Software@en",
   :rdfs/subClassOf [:dpvo-pd/DeviceBased :dpvo-pd/Tracking :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Dialect
  "Information about linguistic dialects."
  {:db/ident :dpvo-pd/Dialect,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString
                         "Information about linguistic dialects.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Dialect@en",
   :rdfs/subClassOf [:dpvo-pd/Language :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def DigitalFingerprint
  "Information about a 'digital fingerprint' created for identification"
  {:db/ident :dpvo-pd/DigitalFingerprint,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Information about a 'digital fingerprint' created for identification@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Digital Fingerprint@en",
   :rdfs/subClassOf [:dpvo-pd/Tracking :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Disability
  "Information about disabilities."
  {:db/ident :dpvo-pd/Disability,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about disabilities.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Disability@en",
   :rdfs/subClassOf [:dpvo-pd/MedicalHealth
                     :dpvo-pd/External
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def DisciplinaryAction
  "Information about disciplinary actions and its history"
  {:db/ident :dpvo-pd/DisciplinaryAction,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString "Information about disciplinary actions and its history@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Disciplinary Action@en",
   :rdfs/subClassOf [:dpvo-pd/Professional :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Dislike
  "Information about dislikes or preferences regarding repulsions."
  {:db/ident :dpvo-pd/Dislike,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about dislikes or preferences regarding repulsions.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Dislike@en",
   :rdfs/subClassOf
   [:dpvo-pd/Interest :dpvo-pd/Preference :dpvo/PersonalData :dpvo-pd/Internal],
   :vs/term_status #rdf/langString "accepted@en"})

(def Divorce
  "Information about divorce(s)."
  {:db/ident :dpvo-pd/Divorce,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString "Information about divorce(s).@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Divorce@en",
   :rdfs/subClassOf [:dpvo-pd/FamilyStructure
                     :dpvo-pd/Social
                     :dpvo/PersonalData
                     :dpvo-pd/Family],
   :vs/term_status #rdf/langString "accepted@en"})

(def DrugTestResult
  "Information about drug test results."
  {:db/ident :dpvo-pd/DrugTestResult,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString
                         "Information about drug test results.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Drug Test Result@en",
   :rdfs/subClassOf [:dpvo-pd/MedicalHealth
                     :dpvo-pd/External
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Education
  "Information about education"
  {:db/ident            :dpvo-pd/Education,
   :dcterms/created     #xsd/date #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Information about education@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          #rdf/langString "Education@en",
   :rdfs/subClassOf     [:dpvo-pd/Professional
                         :dpvo-pd/Social
                         :dpvo/PersonalData],
   :vs/term_status      #rdf/langString "accepted@en"})

(def EducationExperience
  "Information about education experience e.g. attending a university"
  {:db/ident :dpvo-pd/EducationExperience,
   :dcterms/created #xsd/date #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Information about education experience e.g. attending a university@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Education Experience@en",
   :rdfs/subClassOf [:dpvo-pd/Education
                     :dpvo-pd/Social
                     :dpvo-pd/Professional
                     :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def EducationQualification
  "Information about educational qualifications"
  {:db/ident            :dpvo-pd/EducationQualification,
   :dcterms/created     #xsd/date #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Information about educational qualifications@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          #rdf/langString "Education Qualification@en",
   :rdfs/subClassOf     [:dpvo-pd/Education
                         :dpvo-pd/Social
                         :dpvo-pd/Professional
                         :dpvo/PersonalData],
   :vs/term_status      #rdf/langString "accepted@en"})

(def EmailAddress
  "Information about Email address."
  {:db/ident :dpvo-pd/EmailAddress,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about Email address.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Email Address@en",
   :rdfs/subClassOf [:dpvo-pd/Contact :dpvo-pd/Tracking :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def EmailAddressPersonal
  "Information about Email address used in Personal capacity"
  {:db/ident :dpvo-pd/EmailAddressPersonal,
   :dcterms/created #xsd/date #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Information about Email address used in Personal capacity@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Email Address Personal@en",
   :rdfs/subClassOf [:dpvo-pd/EmailAddress
                     :dpvo-pd/Tracking
                     :dpvo/PersonalData
                     :dpvo-pd/Contact],
   :vs/term_status #rdf/langString "accepted@en"})

(def EmailAddressWork
  "Information about Email address used for Work or in Professional capacity"
  {:db/ident :dpvo-pd/EmailAddressWork,
   :dcterms/created #xsd/date #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Information about Email address used for Work or in Professional capacity@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Email Address Work@en",
   :rdfs/subClassOf [:dpvo-pd/EmailAddress
                     :dpvo-pd/Tracking
                     :dpvo/PersonalData
                     :dpvo-pd/Contact],
   :vs/term_status #rdf/langString "accepted@en"})

(def EmailContent
  "Information about the contents of Emails sent or received"
  {:db/ident :dpvo-pd/EmailContent,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString
    "Information about the contents of Emails sent or received@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Email Content@en",
   :rdfs/subClassOf [:dpvo-pd/Communication :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def EmploymentHistory
  "Information about employment history"
  {:db/ident :dpvo-pd/EmploymentHistory,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about employment history@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Employment History@en",
   :rdfs/subClassOf [:dpvo-pd/Professional :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def EthnicOrigin
  "Information about ethnic origin"
  {:db/ident :dpvo-pd/EthnicOrigin,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about ethnic origin@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Ethnic Origin@en",
   :rdfs/subClassOf [:dpvo-pd/Ethnicity
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/External
                     :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Ethnicity
  "Information about ethnic origins and lineage"
  {:db/ident :dpvo-pd/Ethnicity,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString
                         "Information about ethnic origins and lineage@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Ethnicity@en",
   :rdfs/subClassOf [:dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def External
  "Information about external characteristics that can be observed"
  {:db/ident :dpvo-pd/External,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about external characteristics that can be observed@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "External@en",
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status #rdf/langString "accepted@en"})

(def FacialPrint
  "Information about facial print or pattern"
  {:db/ident            :dpvo-pd/FacialPrint,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Information about facial print or pattern@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          #rdf/langString "Facial Print@en",
   :rdfs/subClassOf     [:dpvo-pd/Biometric
                         :dpvo-pd/External
                         :dpvo/PersonalData
                         :dpvo/SpecialCategoryPersonalData
                         :dpvo-pd/Identifying],
   :vs/term_status      #rdf/langString "accepted@en"})

(def Family
  "Information about family and relationships"
  {:db/ident :dpvo-pd/Family,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString
                         "Information about family and relationships@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Family@en",
   :rdfs/subClassOf [:dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def FamilyHealthHistory
  "Information about family health history."
  {:db/ident :dpvo-pd/FamilyHealthHistory,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about family health history.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Family Health History@en",
   :rdfs/subClassOf [:dpvo-pd/HealthHistory
                     :dpvo-pd/External
                     :dpvo-pd/MedicalHealth
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def FamilyStructure
  "Information about family and familial structure."
  {:db/ident :dpvo-pd/FamilyStructure,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about family and familial structure.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Family Structure@en",
   :rdfs/subClassOf [:dpvo-pd/Family :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Favorite
  "Information about favorites"
  {:db/ident :dpvo-pd/Favorite,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about favorites@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Favorite@en",
   :rdfs/subClassOf [:dpvo-pd/Preference :dpvo/PersonalData :dpvo-pd/Internal],
   :vs/term_status #rdf/langString "accepted@en"})

(def FavoriteColor
  "Information about favorite color."
  {:db/ident :dpvo-pd/FavoriteColor,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about favorite color.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Favorite Color@en",
   :rdfs/subClassOf
   [:dpvo-pd/Favorite :dpvo-pd/Preference :dpvo/PersonalData :dpvo-pd/Internal],
   :vs/term_status #rdf/langString "accepted@en"})

(def FavoriteFood
  "Information about favorite food."
  {:db/ident :dpvo-pd/FavoriteFood,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about favorite food.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Favorite Food@en",
   :rdfs/subClassOf
   [:dpvo-pd/Favorite :dpvo-pd/Preference :dpvo/PersonalData :dpvo-pd/Internal],
   :vs/term_status #rdf/langString "accepted@en"})

(def FavoriteMusic
  "Information about favorite music."
  {:db/ident :dpvo-pd/FavoriteMusic,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString "Information about favorite music.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Favorite Music@en",
   :rdfs/subClassOf
   [:dpvo-pd/Favorite :dpvo-pd/Preference :dpvo/PersonalData :dpvo-pd/Internal],
   :vs/term_status #rdf/langString "accepted@en"})

(def Fetish
  "Information about an individual's sexual fetishes"
  {:db/ident :dpvo-pd/Fetish,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString
                         "Information about an individual's sexual fetishes@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Fetish@en",
   :rdfs/subClassOf [:dpvo-pd/Sexual
                     :dpvo-pd/External
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Financial
  "Information about finance including monetary characteristics and transactions"
  {:db/ident :dpvo-pd/Financial,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about finance including monetary characteristics and transactions@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Financial@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Financial"},
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status #rdf/langString "accepted@en"})

(def FinancialAccount
  "Information about financial accounts."
  {:db/ident :dpvo-pd/FinancialAccount,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString
                         "Information about financial accounts.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Financial Account@en",
   :rdfs/subClassOf [:dpvo-pd/Financial :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def FinancialAccountNumber
  "Information about financial account number"
  {:db/ident :dpvo-pd/FinancialAccountNumber,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString
                         "Information about financial account number@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Financial Account Number@en",
   :rdfs/subClassOf [:dpvo-pd/AccountIdentifier
                     :dpvo-pd/Financial
                     :dpvo/PersonalData
                     :dpvo-pd/FinancialAccount],
   :vs/term_status #rdf/langString "accepted@en"})

(def FinancialStatus
  "Information about financial status or standing"
  {:db/ident            :dpvo-pd/FinancialStatus,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Information about financial status or standing@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          #rdf/langString "Financial Status@en",
   :rdfs/subClassOf     [:dpvo-pd/Financial :dpvo/PersonalData],
   :vs/term_status      #rdf/langString "accepted@en"})

(def Fingerprint
  "Information about fingerprint used for biometric purposes."
  {:db/ident :dpvo-pd/Fingerprint,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about fingerprint used for biometric purposes.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Fingerprint@en",
   :rdfs/subClassOf [:dpvo-pd/Biometric
                     :dpvo-pd/External
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/Identifying],
   :vs/term_status #rdf/langString "accepted@en"})

(def Friend
  "Information about friends in a social network, including aspects of friendships such as years together or nature of friendship."
  {:db/ident :dpvo-pd/Friend,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about friends in a social network, including aspects of friendships such as years together or nature of friendship.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Friend@en",
   :rdfs/subClassOf [:dpvo-pd/SocialNetwork :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def GPSCoordinate
  "Information about location expressed using Global Position System coordinates (GPS)"
  {:db/ident :dpvo-pd/GPSCoordinate,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString
    "Information about location expressed using Global Position System coordinates (GPS)@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "GPS Coordinate@en",
   :rdfs/subClassOf [:dpvo-pd/Location :dpvo-pd/Tracking :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Gender
  "Information about gender"
  {:db/ident :dpvo-pd/Gender,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about gender@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Gender@en",
   :rdfs/subClassOf
   [:dpvo-pd/PhysicalCharacteristic :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def GeneralReputation
  "Information about reputation in the public sphere"
  {:db/ident :dpvo-pd/GeneralReputation,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about reputation in the public sphere@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "General Reputation@en",
   :rdfs/subClassOf [:dpvo-pd/PublicLife :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Genetic
  "Information about inherited or acquired genetic characteristics"
  {:db/ident :dpvo-pd/Genetic,
   :dcterms/created #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Information about inherited or acquired genetic characteristics@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Genetic@en",
   :rdfs/subClassOf [:dpvo-pd/Health
                     :dpvo-pd/External
                     :dpvo-pd/MedicalHealth
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Geographic
  "Information about location or based on geography (e.g. home address)"
  {:db/ident :dpvo-pd/Geographic,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about location or based on geography (e.g. home address)@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Geographic@en",
   :rdfs/subClassOf [:dpvo-pd/Demographic :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def GroupMembership
  "Information about groups and memberships included or associated with a social network"
  {:db/ident :dpvo-pd/GroupMembership,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about groups and memberships included or associated with a social network@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Group Membership@en",
   :rdfs/subClassOf [:dpvo-pd/SocialNetwork :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def HairColor
  "Information about hair color"
  {:db/ident :dpvo-pd/HairColor,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString "Information about hair color@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Hair Color@en",
   :rdfs/subClassOf
   [:dpvo-pd/PhysicalCharacteristic :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Health
  "Information about health."
  {:db/ident :dpvo-pd/Health,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about health.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Health@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Health"},
   :rdfs/subClassOf [:dpvo-pd/MedicalHealth
                     :dpvo-pd/External
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def HealthHistory
  "Information about health history."
  {:db/ident :dpvo-pd/HealthHistory,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about health history.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Health History@en",
   :rdfs/subClassOf [:dpvo-pd/MedicalHealth
                     :dpvo-pd/External
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def HealthRecord
  "Information about health record."
  {:db/ident :dpvo-pd/HealthRecord,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about health record.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Health Record@en",
   :rdfs/subClassOf [:dpvo-pd/MedicalHealth
                     :dpvo-pd/External
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Height
  "Information about physical height"
  {:db/ident :dpvo-pd/Height,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString "Information about physical height@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Height@en",
   :rdfs/subClassOf
   [:dpvo-pd/PhysicalCharacteristic :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Historical
  "Information about historical data related to or relevant regarding history or past events"
  {:db/ident :dpvo-pd/Historical,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString
    "Information about historical data related to or relevant regarding history or past events@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Historical@en",
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status #rdf/langString "accepted@en"})

(def HouseOwned
  "Information about house(s) owned and ownership history."
  {:db/ident :dpvo-pd/HouseOwned,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString "Information about house(s) owned and ownership history.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "House Owned@en",
   :rdfs/subClassOf [:dpvo-pd/Ownership :dpvo-pd/Financial :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Household
  "Information about personal or household activities"
  {:db/ident :dpvo-pd/Household,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Information about personal or household activities@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Household@en",
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status #rdf/langString "accepted@en"})

(def IPAddress
  "Information about the Internet Protocol (IP) address of a device"
  {:db/ident :dpvo-pd/IPAddress,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about the Internet Protocol (IP) address of a device@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "IP Address@en",
   :rdfs/subClassOf [:dpvo-pd/DeviceBased :dpvo-pd/Tracking :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Identifier
  "Information about an identifier or name used for identification"
  {:db/ident :dpvo-pd/Identifier,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Information about an identifier or name used for identification@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Identifier@en",
   :rdfs/subClassOf [:dpvo-pd/Tracking :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Identifying
  "Information that uniquely or semi-uniquely identifies an individual or a group"
  {:db/ident :dpvo-pd/Identifying,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information that uniquely or semi-uniquely identifies an individual or a group@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Identifying@en",
   :rdfs/subClassOf [:dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Income
  "Information about financial income e.g. for individual or household or family"
  {:db/ident :dpvo-pd/Income,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about financial income e.g. for individual or household or family@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Income@en",
   :rdfs/subClassOf
   [:dpvo-pd/Transactional :dpvo-pd/Financial :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def IncomeBracket
  "Information about income bracket."
  {:db/ident :dpvo-pd/IncomeBracket,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about income bracket.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Income Bracket@en",
   :rdfs/subClassOf [:dpvo-pd/Demographic :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def IndividualHealthHistory
  "Information about information health history."
  {:db/ident :dpvo-pd/IndividualHealthHistory,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about information health history.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Individual Health History@en",
   :rdfs/subClassOf [:dpvo-pd/HealthHistory
                     :dpvo-pd/External
                     :dpvo-pd/MedicalHealth
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Insurance
  "Information about Insurance"
  {:db/ident            :dpvo-pd/Insurance,
   :dcterms/created     #xsd/date #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Information about Insurance@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          #rdf/langString "Insurance@en",
   :rdfs/subClassOf     [:dpvo-pd/Financial :dpvo/PersonalData],
   :vs/term_status      #rdf/langString "accepted@en"})

(def Intention
  "Information about intentions"
  {:db/ident :dpvo-pd/Intention,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString "Information about intentions@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Intention@en",
   :rdfs/subClassOf [:dpvo-pd/Preference :dpvo/PersonalData :dpvo-pd/Internal],
   :vs/term_status #rdf/langString "accepted@en"})

(def Interaction
  "Information about interactions in the public sphere"
  {:db/ident :dpvo-pd/Interaction,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString "Information about interactions in the public sphere@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Interaction@en",
   :rdfs/subClassOf [:dpvo-pd/PublicLife :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Interest
  "Information about interests"
  {:db/ident :dpvo-pd/Interest,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about interests@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Interest@en",
   :rdfs/subClassOf [:dpvo-pd/Preference :dpvo/PersonalData :dpvo-pd/Internal],
   :vs/term_status #rdf/langString "accepted@en"})

(def Internal
  "Informatoin about internal characteristics that cannot be seen or observed"
  {:db/ident :dpvo-pd/Internal,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Informatoin about internal characteristics that cannot be seen or observed@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Internal@en",
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status #rdf/langString "accepted@en"})

(def Job
  "Information about professional jobs"
  {:db/ident :dpvo-pd/Job,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about professional jobs@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Job@en",
   :rdfs/subClassOf [:dpvo-pd/Professional :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def KnowledgeBelief
  "Information about knowledge and beliefs"
  {:db/ident :dpvo-pd/KnowledgeBelief,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about knowledge and beliefs@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Knowledge and Beliefs@en",
   :rdfs/subClassOf [:dpvo-pd/Internal :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Language
  "Information about language and lingual history."
  {:db/ident :dpvo-pd/Language,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString
                         "Information about language and lingual history.@en",
   :dcterms/modified #xsd/date #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Language@en",
   :rdfs/subClassOf [:dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "changed@en"})

(def LifeHistory
  "Information about personal history regarding events or activities - including  their occurrences that might be directly related or have had an influence (e.g. World War, 9/11)"
  {:db/ident :dpvo-pd/LifeHistory,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about personal history regarding events or activities - including  their occurrences that might be directly related or have had an influence (e.g. World War, 9/11)@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Life History@en",
   :rdfs/subClassOf [:dpvo-pd/Historical :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Like
  "Information about likes or preferences regarding attractions."
  {:db/ident :dpvo-pd/Like,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about likes or preferences regarding attractions.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Like@en",
   :rdfs/subClassOf
   [:dpvo-pd/Interest :dpvo-pd/Preference :dpvo/PersonalData :dpvo-pd/Internal],
   :vs/term_status #rdf/langString "accepted@en"})

(def LinkClicked
  "Information about the links that an individual has clicked."
  {:db/ident :dpvo-pd/LinkClicked,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString
    "Information about the links that an individual has clicked.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Link Clicked@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Navigation"},
   :rdfs/subClassOf [:dpvo-pd/Behavioral :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def LoanRecord
  "Information about loans, whether applied, provided or rejected, and its history"
  {:db/ident :dpvo-pd/LoanRecord,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString
    "Information about loans, whether applied, provided or rejected, and its history@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Loan Record@en",
   :rdfs/subClassOf
   [:dpvo-pd/Transactional :dpvo-pd/Financial :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Location
  "Information about location"
  {:db/ident :dpvo-pd/Location,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about location@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Location@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Location"},
   :rdfs/subClassOf [:dpvo-pd/Tracking :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def MACAddress
  "Information about the Media Access Control (MAC) address of a device"
  {:db/ident :dpvo-pd/MACAddress,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about the Media Access Control (MAC) address of a device@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "MAC Address@en",
   :rdfs/subClassOf [:dpvo-pd/DeviceBased :dpvo-pd/Tracking :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def MaritalStatus
  "Information about marital status and history"
  {:db/ident :dpvo-pd/MaritalStatus,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString
                         "Information about marital status and history@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Marital Status@en",
   :rdfs/subClassOf [:dpvo-pd/PublicLife :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Marriage
  "Information about marriage(s)."
  {:db/ident :dpvo-pd/Marriage,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about marriage(s).@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Marriage@en",
   :rdfs/subClassOf [:dpvo-pd/FamilyStructure
                     :dpvo-pd/Social
                     :dpvo/PersonalData
                     :dpvo-pd/Family],
   :vs/term_status #rdf/langString "accepted@en"})

(def MedicalHealth
  "Information about health, medical conditions or health care"
  {:db/ident :dpvo-pd/MedicalHealth,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about health, medical conditions or health care@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Medical Health@en",
   :rdfs/subClassOf
   [:dpvo-pd/External :dpvo/SpecialCategoryPersonalData :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def MentalHealth
  "Information about mental health."
  {:db/ident :dpvo-pd/MentalHealth,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about mental health.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Mental Health@en",
   :rdfs/subClassOf [:dpvo-pd/Health
                     :dpvo-pd/External
                     :dpvo-pd/MedicalHealth
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Name
  "Information about names associated or used as given name or nickname."
  {:db/ident :dpvo-pd/Name,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString
    "Information about names associated or used as given name or nickname.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Name@en",
   :rdfs/subClassOf [:dpvo-pd/Identifying :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Nationality
  "Information about nationality"
  {:db/ident            :dpvo-pd/Nationality,
   :dcterms/created     #xsd/date #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     {:rdfa/uri
                         "https://www.w3.org/2022/04/20-dpvcg-minutes.html"},
   :dcterms/description #rdf/langString "Information about nationality@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          #rdf/langString "Nationality@en",
   :rdfs/subClassOf     [:dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status      #rdf/langString "accepted@en"})

(def OfficialID
  "Information about an official identifier or identification document"
  {:db/ident :dpvo-pd/OfficialID,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about an official identifier or identification document@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Official ID@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Government"},
   :rdfs/subClassOf [:dpvo-pd/Identifying :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Offspring
  "Information about offspring(s)."
  {:db/ident :dpvo-pd/Offspring,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about offspring(s).@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Offspring@en",
   :rdfs/subClassOf [:dpvo-pd/FamilyStructure
                     :dpvo-pd/Social
                     :dpvo/PersonalData
                     :dpvo-pd/Family],
   :vs/term_status #rdf/langString "accepted@en"})

(def Opinion
  "Information about opinions"
  {:db/ident :dpvo-pd/Opinion,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about opinions@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Opinion@en",
   :rdfs/subClassOf [:dpvo-pd/Preference :dpvo/PersonalData :dpvo-pd/Internal],
   :vs/term_status #rdf/langString "accepted@en"})

(def Ownership
  "Information about ownership and history, including renting, borrowing, possessions."
  {:db/ident :dpvo-pd/Ownership,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about ownership and history, including renting, borrowing, possessions.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Ownership@en",
   :rdfs/subClassOf [:dpvo-pd/Financial :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def PINCode
  "Information about Personal identification number (PIN), which is usually used in the process of authenticating the individual as an user accessing a system."
  {:db/ident :dpvo-pd/PINCode,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about Personal identification number (PIN), which is usually used in the process of authenticating the individual as an user accessing a system.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "PIN Code@en",
   :rdfs/subClassOf
   [:dpvo-pd/Authenticating :dpvo/PersonalData :dpvo-pd/Internal],
   :vs/term_status #rdf/langString "accepted@en"})

(def Parent
  "Information about parent(s)."
  {:db/ident :dpvo-pd/Parent,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about parent(s).@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Parent@en",
   :rdfs/subClassOf [:dpvo-pd/FamilyStructure
                     :dpvo-pd/Social
                     :dpvo/PersonalData
                     :dpvo-pd/Family],
   :vs/term_status #rdf/langString "accepted@en"})

(def Passport
  "Information about passport"
  {:db/ident            :dpvo-pd/Passport,
   :dcterms/created     #xsd/date #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Information about passport@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          #rdf/langString "Passport@en",
   :rdfs/subClassOf     [:dpvo-pd/OfficialID
                         :dpvo-pd/External
                         :dpvo/PersonalData
                         :dpvo-pd/Identifying],
   :vs/term_status      #rdf/langString "accepted@en"})

(def Password
  "Information about password used in the process of authenticating the individual as an user accessing a system."
  {:db/ident :dpvo-pd/Password,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about password used in the process of authenticating the individual as an user accessing a system.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Password@en",
   :rdfs/subClassOf
   [:dpvo-pd/Authenticating :dpvo/PersonalData :dpvo-pd/Internal],
   :vs/term_status #rdf/langString "accepted@en"})

(def PastEmployment
  "Information about past employment"
  {:db/ident            :dpvo-pd/PastEmployment,
   :dcterms/created     #xsd/date #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Information about past employment@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          #rdf/langString "Past Employment@en",
   :rdfs/subClassOf     [:dpvo-pd/EmploymentHistory
                         :dpvo-pd/Social
                         :dpvo-pd/Professional
                         :dpvo/PersonalData],
   :vs/term_status      #rdf/langString "accepted@en"})

(def PaymentCard
  "Information about payment card such as Credit Card, Debit Card."
  {:db/ident :dpvo-pd/PaymentCard,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Information about payment card such as Credit Card, Debit Card.@en",
   :dcterms/source {:rdfa/uri "https://www.w3.org/community/dpvcg/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Payment Card@en",
   :rdfs/subClassOf
   [:dpvo-pd/FinancialAccount :dpvo-pd/Financial :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def PaymentCardExpiry
  "Information about payment card expiry such as a date."
  {:db/ident :dpvo-pd/PaymentCardExpiry,
   :dcterms/created #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #rdf/langString "Information about payment card expiry such as a date.@en",
   :dcterms/source {:rdfa/uri "https://www.w3.org/community/dpvcg/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Payment Card Expiry@en",
   :rdfs/subClassOf [:dpvo-pd/PaymentCard
                     :dpvo-pd/Financial
                     :dpvo/PersonalData
                     :dpvo-pd/FinancialAccount],
   :vs/term_status #rdf/langString "accepted@en"})

(def PaymentCardNumber
  "Information about payment card number."
  {:db/ident            :dpvo-pd/PaymentCardNumber,
   :dcterms/created     #xsd/date #inst "2020-11-04T00:00:00.000-05:00",
   :dcterms/creator     {:xsd/string "Georg P Krog"},
   :dcterms/description #rdf/langString
                         "Information about payment card number.@en",
   :dcterms/source      {:rdfa/uri "https://www.w3.org/community/dpvcg/"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          #rdf/langString "Payment Card Number@en",
   :rdfs/subClassOf     [:dpvo-pd/AccountIdentifier
                         :dpvo-pd/PaymentCard
                         :dpvo-pd/Financial
                         :dpvo/PersonalData
                         :dpvo-pd/FinancialAccount],
   :vs/term_status      #rdf/langString "accepted@en"})

(def PerformanceAtWork
  "Information about performance at work or within work environments"
  {:db/ident :dpvo-pd/PerformanceAtWork,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Information about performance at work or within work environments@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Performance at Work@en",
   :rdfs/subClassOf [:dpvo-pd/Professional
                     :dpvo-pd/Behavioral
                     :dpvo-pd/External
                     :dpvo-pd/Social
                     :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def PersonalDocuments
  "Information about and including personal documents e.g. diaries or journals"
  {:db/ident :dpvo-pd/PersonalDocuments,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Information about and including personal documents e.g. diaries or journals@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Personal Documents@en",
   :rdfs/subClassOf [:dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def PersonalPossession
  "Information about personal possessions."
  {:db/ident :dpvo-pd/PersonalPossession,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about personal possessions.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Personal Possession@en",
   :rdfs/subClassOf [:dpvo-pd/Ownership :dpvo-pd/Financial :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Personality
  "Information about personality (e.g., categorization in terms of the Big Five personality traits)"
  {:db/ident :dpvo-pd/Personality,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString
    "Information about personality (e.g., categorization in terms of the Big Five personality traits)@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Personality@en",
   :rdfs/subClassOf [:dpvo-pd/Behavioral :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def PhilosophicalBelief
  "Information about philosophical beliefs."
  {:db/ident :dpvo-pd/PhilosophicalBelief,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about philosophical beliefs.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Philosophical Belief@en",
   :rdfs/subClassOf [:dpvo-pd/KnowledgeBelief
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo/PersonalData
                     :dpvo-pd/Internal],
   :vs/term_status #rdf/langString "accepted@en"})

(def PhysicalAddress
  "Information about physical address."
  {:db/ident :dpvo-pd/PhysicalAddress,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about physical address.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Physical Address@en",
   :rdfs/subClassOf [:dpvo-pd/Contact :dpvo-pd/Tracking :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def PhysicalCharacteristic
  "Information about physical characteristics"
  {:db/ident :dpvo-pd/PhysicalCharacteristic,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about physical characteristics@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Physical Characteristic@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Demographic"},
   :rdfs/subClassOf [:dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def PhysicalHealth
  "Information about physical health."
  {:db/ident :dpvo-pd/PhysicalHealth,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString "Information about physical health.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Physical Health@en",
   :rdfs/subClassOf [:dpvo-pd/Health
                     :dpvo-pd/External
                     :dpvo-pd/MedicalHealth
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def PhysicalTrait
  "Information about defining traits or features regarding the body."
  {:db/ident :dpvo-pd/PhysicalTrait,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about defining traits or features regarding the body.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Physical Trait@en",
   :rdfs/subClassOf [:dpvo-pd/Demographic :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Picture
  "Information about visual representation or image e.g. profile photo."
  {:db/ident :dpvo-pd/Picture,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString
    "Information about visual representation or image e.g. profile photo.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Picture@en",
   :rdfs/subClassOf [:dpvo-pd/Identifying :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Piercing
  "Information about piercings"
  {:db/ident :dpvo-pd/Piercing,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString "Information about piercings@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Piercing@en",
   :rdfs/subClassOf
   [:dpvo-pd/PhysicalCharacteristic :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def PoliticalAffiliation
  "Information about political affiliation and history"
  {:db/ident :dpvo-pd/PoliticalAffiliation,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString "Information about political affiliation and history@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Political Affiliation@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Political"},
   :rdfs/subClassOf [:dpvo-pd/PublicLife
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/Social
                     :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def PoliticalOpinion
  "Information about opinions regarding politics and political topics"
  {:db/ident :dpvo-pd/PoliticalOpinion,
   :dcterms/created #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Information about opinions regarding politics and political topics@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Political Opinion@en",
   :rdfs/subClassOf [:dpvo-pd/PublicLife
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/Social
                     :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Preference
  "Information about preferences or interests"
  {:db/ident :dpvo-pd/Preference,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about preferences or interests@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Preference@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Preference"},
   :rdfs/subClassOf [:dpvo-pd/Internal :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Prescription
  "Information about medical and pharmaceutical prescriptions"
  {:db/ident :dpvo-pd/Prescription,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about medical and pharmaceutical prescriptions@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Prescription@en",
   :rdfs/subClassOf [:dpvo-pd/MedicalHealth
                     :dpvo-pd/External
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def PrivacyPreference
  "Information about privacy preferences"
  {:db/ident :dpvo-pd/PrivacyPreference,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString
                         "Information about privacy preferences@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Privacy Preference@en",
   :rdfs/subClassOf [:dpvo-pd/Preference :dpvo/PersonalData :dpvo-pd/Internal],
   :vs/term_status #rdf/langString "accepted@en"})

(def Proclivitie
  "Information about proclivities in a sexual context"
  {:db/ident :dpvo-pd/Proclivitie,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString "Information about proclivities in a sexual context@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Proclivitie@en",
   :rdfs/subClassOf [:dpvo-pd/Sexual
                     :dpvo-pd/External
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Professional
  "Information about educational or professional career"
  {:db/ident :dpvo-pd/Professional,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString "Information about educational or professional career@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Professional@en",
   :rdfs/subClassOf [:dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def ProfessionalCertification
  "Information about professional certifications"
  {:db/ident :dpvo-pd/ProfessionalCertification,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about professional certifications@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Professional Certification@en",
   :rdfs/subClassOf [:dpvo-pd/Professional :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def ProfessionalEvaluation
  "Information about professional evaluations"
  {:db/ident :dpvo-pd/ProfessionalEvaluation,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about professional evaluations@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Professional Evaluation@en",
   :rdfs/subClassOf [:dpvo-pd/Professional :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def ProfessionalInterview
  "Information about professional interviews"
  {:db/ident :dpvo-pd/ProfessionalInterview,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about professional interviews@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Professional Interview@en",
   :rdfs/subClassOf [:dpvo-pd/Professional :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Profile
  "Profile or user profile is information and representation of characteristics associated with person(s) or group(s)"
  {:db/ident :dpvo-pd/Profile,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Profile or user profile is information and representation of characteristics associated with person(s) or group(s)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Profile@en",
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status #rdf/langString "accepted@en"})

(def PublicLife
  "Information about public life"
  {:db/ident :dpvo-pd/PublicLife,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString "Information about public life@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Public Life@en",
   :rdfs/subClassOf [:dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def PubliclyAvailableSocialMedia
  "Information about social media that is publicly available"
  {:db/ident :dpvo-pd/PubliclyAvailableSocialMedia,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Information about social media that is publicly available@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Publicly Available Social Media@en",
   :rdfs/subClassOf [:dpvo-pd/SocialMedia
                     :dpvo-pd/Social
                     :dpvo/PersonalData
                     :dpvo-pd/Communication],
   :vs/term_status #rdf/langString "accepted@en"})

(def Purchase
  "Information about purchases such as items bought e.g. grocery or clothing"
  {:db/ident :dpvo-pd/Purchase,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about purchases such as items bought e.g. grocery or clothing@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Purchase@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Purchase"},
   :rdfs/subClassOf
   [:dpvo-pd/Transactional :dpvo-pd/Financial :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def PurchasesAndSpendingHabit
  "Information about analysis of purchases made and money spent expressed as a habit e.g. monthly shopping trends"
  {:db/ident :dpvo-pd/PurchasesAndSpendingHabit,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString
    "Information about analysis of purchases made and money spent expressed as a habit e.g. monthly shopping trends@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Purchases and Spending Habit@en",
   :rdfs/subClassOf
   [:dpvo-pd/Transactional :dpvo-pd/Financial :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Race
  "Information about race or racial history."
  {:db/ident :dpvo-pd/Race,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about race or racial history.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Race@en",
   :rdfs/subClassOf [:dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/Ethnicity
                     :dpvo-pd/External
                     :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Reference
  "Information about references in the professional context"
  {:db/ident :dpvo-pd/Reference,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about references in the professional context@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Reference@en",
   :rdfs/subClassOf [:dpvo-pd/Professional :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Relationship
  "Information about relationships and relationship history."
  {:db/ident :dpvo-pd/Relationship,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about relationships and relationship history.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Relationship@en",
   :rdfs/subClassOf [:dpvo-pd/Family :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Reliability
  "Information about reliability (e.g. of a person)"
  {:db/ident            :dpvo-pd/Reliability,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Information about reliability (e.g. of a person)@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          #rdf/langString "Reliability@en",
   :rdfs/subClassOf     [:dpvo-pd/Behavioral
                         :dpvo-pd/External
                         :dpvo/PersonalData],
   :vs/term_status      #rdf/langString "accepted@en"})

(def Religion
  "Information about religion, religious inclinations, and religious history."
  {:db/ident :dpvo-pd/Religion,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString
    "Information about religion, religious inclinations, and religious history.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Religion@en",
   :rdfs/subClassOf [:dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/PublicLife
                     :dpvo-pd/Social
                     :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def ReligiousBelief
  "Information about religion and religious beliefs."
  {:db/ident :dpvo-pd/ReligiousBelief,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about religion and religious beliefs.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Religious Belief@en",
   :rdfs/subClassOf [:dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/KnowledgeBelief
                     :dpvo/PersonalData
                     :dpvo-pd/Internal],
   :vs/term_status #rdf/langString "accepted@en"})

(def Retina
  "Information about retina and the retinal patterns."
  {:db/ident :dpvo-pd/Retina,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString "Information about retina and the retinal patterns.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Retina@en",
   :rdfs/subClassOf [:dpvo-pd/Biometric
                     :dpvo-pd/External
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/Identifying],
   :vs/term_status #rdf/langString "accepted@en"})

(def RoomNumber
  "Information about location expressed as Room number or similar numbering systems"
  {:db/ident :dpvo-pd/RoomNumber,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about location expressed as Room number or similar numbering systems@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Room Number@en",
   :rdfs/subClassOf [:dpvo-pd/Location :dpvo-pd/Tracking :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Salary
  "Information about salary"
  {:db/ident :dpvo-pd/Salary,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString "Information about salary@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Salary@en",
   :rdfs/subClassOf [:dpvo-pd/Professional :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Sale
  "Information about sales e.g. selling of goods or services"
  {:db/ident :dpvo-pd/Sale,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString
    "Information about sales e.g. selling of goods or services@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Sale@en",
   :rdfs/subClassOf
   [:dpvo-pd/Transactional :dpvo-pd/Financial :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def School
  "Information about school such as name of school, conduct, or grades obtained."
  {:db/ident :dpvo-pd/School,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about school such as name of school, conduct, or grades obtained.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "School@en",
   :rdfs/subClassOf [:dpvo-pd/Professional :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def SecretText
  "Information about secret text used in the process of authenticating the individual as an user accessing a system, e.g., when recovering a lost password."
  {:db/ident :dpvo-pd/SecretText,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString
    "Information about secret text used in the process of authenticating the individual as an user accessing a system, e.g., when recovering a lost password.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Secret Text@en",
   :rdfs/subClassOf
   [:dpvo-pd/Authenticating :dpvo/PersonalData :dpvo-pd/Internal],
   :vs/term_status #rdf/langString "accepted@en"})

(def ServiceConsumptionBehavior
  "Information about the consumption of a service, e.g. time and duration of consumption."
  {:db/ident :dpvo-pd/ServiceConsumptionBehavior,
   :dcterms/created #xsd/date #inst "2019-11-26T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Rudy Jacob"}
                     {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about the consumption of a service, e.g. time and duration of consumption.@en",
   :dcterms/source {:rdfa/uri "https://specialprivacy.ercim.eu/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Service Consumption Behavior@en",
   :rdfs/subClassOf [:dpvo-pd/Behavioral :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Sexual
  "Information about sexuality and sexual history"
  {:db/ident :dpvo-pd/Sexual,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about sexuality and sexual history@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Sexual@en",
   :rdfs/subClassOf
   [:dpvo/SpecialCategoryPersonalData :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def SexualHistory
  "Information about sexual history"
  {:db/ident :dpvo-pd/SexualHistory,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString "Information about sexual history@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Sexual History@en",
   :rdfs/subClassOf [:dpvo-pd/Sexual
                     :dpvo-pd/External
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def SexualPreference
  "Information about sexual preferences"
  {:db/ident :dpvo-pd/SexualPreference,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString
                         "Information about sexual preferences@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Sexual Preference@en",
   :rdfs/subClassOf [:dpvo-pd/Sexual
                     :dpvo-pd/External
                     :dpvo/PersonalData
                     :dpvo/SpecialCategoryPersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Sibling
  "Information about sibling(s)."
  {:db/ident :dpvo-pd/Sibling,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about sibling(s).@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Sibling@en",
   :rdfs/subClassOf [:dpvo-pd/FamilyStructure
                     :dpvo-pd/Social
                     :dpvo/PersonalData
                     :dpvo-pd/Family],
   :vs/term_status #rdf/langString "accepted@en"})

(def SkinTone
  "Information about skin tone"
  {:db/ident :dpvo-pd/SkinTone,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString "Information about skin tone@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Skin Tone@en",
   :rdfs/subClassOf
   [:dpvo-pd/PhysicalCharacteristic :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Social
  "Information about social aspects such as family, public life, or professional networks."
  {:db/ident :dpvo-pd/Social,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about social aspects such as family, public life, or professional networks.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Social@en",
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status #rdf/langString "accepted@en"})

(def SocialMedia
  "Information about social media"
  {:db/ident            :dpvo-pd/SocialMedia,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Information about social media@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          #rdf/langString "Social Media@en",
   :rdfs/subClassOf     [:dpvo-pd/Communication
                         :dpvo-pd/Social
                         :dpvo/PersonalData],
   :vs/term_status      #rdf/langString "accepted@en"})

(def SocialMediaCommunication
  "Information about social media communication, including the communication itself and metadata."
  {:db/ident :dpvo-pd/SocialMediaCommunication,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about social media communication, including the communication itself and metadata.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Social Media Communication@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#Social"},
   :rdfs/subClassOf [:dpvo-pd/Communication :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def SocialNetwork
  "Information about friends or connections expressed as a social network"
  {:db/ident :dpvo-pd/SocialNetwork,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about friends or connections expressed as a social network@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Social Network@en",
   :rdfs/subClassOf [:dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def SocialStatus
  "Information about social status"
  {:db/ident :dpvo-pd/SocialStatus,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about social status@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Social Status@en",
   :rdfs/subClassOf [:dpvo-pd/PublicLife :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def TVViewingBehavior
  "Information about TV viewing Behavior, such as timestamps of channel change, duration of viewership, content consumed"
  {:db/ident :dpvo-pd/TVViewingBehavior,
   :dcterms/created #xsd/date #inst "2019-11-26T00:00:00.000-05:00",
   :dcterms/creator [{:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Rudy Jacob"}],
   :dcterms/description
   #rdf/langString
    "Information about TV viewing Behavior, such as timestamps of channel change, duration of viewership, content consumed@en",
   :dcterms/source {:rdfa/uri "https://specialprivacy.ercim.eu/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "TV Viewing Behavior@en",
   :rdfs/subClassOf [:dpvo-pd/ServiceConsumptionBehavior
                     :dpvo-pd/External
                     :dpvo/PersonalData
                     :dpvo-pd/Behavioral],
   :vs/term_status #rdf/langString "accepted@en"})

(def Tattoo
  "Information about tattoos"
  {:db/ident :dpvo-pd/Tattoo,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString "Information about tattoos@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Tattoo@en",
   :rdfs/subClassOf
   [:dpvo-pd/PhysicalCharacteristic :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Tax
  "Information about financial tax e.g. tax records or tax due"
  {:db/ident :dpvo-pd/Tax,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about financial tax e.g. tax records or tax due@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Tax@en",
   :rdfs/subClassOf
   [:dpvo-pd/Transactional :dpvo-pd/Financial :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def TelephoneNumber
  "Information about telephone number."
  {:db/ident :dpvo-pd/TelephoneNumber,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about telephone number.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Telephone Number@en",
   :rdfs/subClassOf [:dpvo-pd/Contact :dpvo-pd/Tracking :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Thought
  "Information about thoughts"
  {:db/ident :dpvo-pd/Thought,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString "Information about thoughts@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Thought@en",
   :rdfs/subClassOf
   [:dpvo-pd/KnowledgeBelief :dpvo/PersonalData :dpvo-pd/Internal],
   :vs/term_status #rdf/langString "accepted@en"})

(def Tracking
  "Information used to track an individual or group e.g. location or email"
  {:db/ident :dpvo-pd/Tracking,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information used to track an individual or group e.g. location or email@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Tracking@en",
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status #rdf/langString "accepted@en"})

(def TradeUnionMembership
  "Information about trade union memberships and related topics"
  {:db/ident :dpvo-pd/TradeUnionMembership,
   :dcterms/created #xsd/date #inst "2022-05-18T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Information about trade union memberships and related topics@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Trade Union Membership@en",
   :rdfs/subClassOf [:dpvo-pd/GroupMembership
                     :dpvo/SpecialCategoryPersonalData
                     :dpvo-pd/Social
                     :dpvo/PersonalData
                     :dpvo-pd/SocialNetwork],
   :vs/term_status #rdf/langString "accepted@en"})

(def Transaction
  "Information about financial transactions e.g. bank transfers"
  {:db/ident :dpvo-pd/Transaction,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString
    "Information about financial transactions e.g. bank transfers@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Transaction@en",
   :rdfs/subClassOf
   [:dpvo-pd/Transactional :dpvo-pd/Financial :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Transactional
  "Information about a purchasing, spending or income"
  {:db/ident :dpvo-pd/Transactional,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString "Information about a purchasing, spending or income@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Transactional@en",
   :rdfs/subClassOf [:dpvo-pd/Financial :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def TravelHistory
  "Information about travel history"
  {:db/ident            :dpvo-pd/TravelHistory,
   :dcterms/created     #xsd/date #inst "2022-04-20T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Information about travel history@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          #rdf/langString "Travel History@en",
   :rdfs/subClassOf     [:dpvo-pd/Location
                         :dpvo-pd/Tracking
                         :dpvo/PersonalData],
   :vs/term_status      #rdf/langString "accepted@en"})

(def UID
  "Information about unique identifiers."
  {:db/ident :dpvo-pd/UID,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString
                         "Information about unique identifiers.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "UID@en",
   :rdfs/seeAlso {:rdfa/uri
                  "https://specialprivacy.ercim.eu/vocabs/data#UniqueId"},
   :rdfs/subClassOf [:dpvo-pd/Identifying :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def UserAgent
  "Information about software acting on behalf of users e.g. web browser"
  {:db/ident :dpvo-pd/UserAgent,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Georg P Krog"},
   :dcterms/description
   #rdf/langString
    "Information about software acting on behalf of users e.g. web browser@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "User agent@en",
   :rdfs/subClassOf [:dpvo-pd/Tracking :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Username
  "Information about usernames."
  {:db/ident :dpvo-pd/Username,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description #rdf/langString "Information about usernames.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Username@en",
   :rdfs/subClassOf [:dpvo-pd/Identifying :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def VehicalLicenseNumber
  "Information about vehicle license number"
  {:db/ident            :dpvo-pd/VehicalLicenseNumber,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Information about vehicle license number@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          #rdf/langString "Vehicle License Number@en",
   :rdfs/subClassOf     [:dpvo-pd/VehicleLicense
                         :dpvo-pd/Vehicle
                         :dpvo-pd/External
                         :dpvo/PersonalData
                         :dpvo-pd/Identifying],
   :vs/term_status      #rdf/langString "accepted@en"})

(def VehicalLicenseRegistration
  "Information about vehicle license registration"
  {:db/ident            :dpvo-pd/VehicalLicenseRegistration,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Information about vehicle license registration@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          #rdf/langString "Vehicle License Registration@en",
   :rdfs/subClassOf     [:dpvo-pd/VehicleLicense
                         :dpvo-pd/Vehicle
                         :dpvo-pd/External
                         :dpvo/PersonalData
                         :dpvo-pd/Identifying],
   :vs/term_status      #rdf/langString "accepted@en"})

(def Vehicle
  "Information about vehicles"
  {:db/ident            :dpvo-pd/Vehicle,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Information about vehicles@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          #rdf/langString "Vehicle@en",
   :rdfs/subClassOf     [:dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status      #rdf/langString "accepted@en"})

(def VehicleLicense
  "Information about vehicle license"
  {:db/ident            :dpvo-pd/VehicleLicense,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Information about vehicle license@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          #rdf/langString "Vehicle License@en",
   :rdfs/subClassOf     [:dpvo-pd/Vehicle
                         :dpvo-pd/Identifying
                         :dpvo-pd/External
                         :dpvo/PersonalData],
   :vs/term_status      #rdf/langString "accepted@en"})

(def VehicleUsage
  "Information about usage of vehicles, e.g. driving statistics"
  {:db/ident :dpvo-pd/VehicleUsage,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Information about usage of vehicles, e.g. driving statistics@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Vehicle Usage@en",
   :rdfs/subClassOf
   [:dpvo-pd/Vehicle :dpvo-pd/Behavioral :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def VoiceCommunicationRecording
  "Information about vocal recorded communication (e.g. telephony, VoIP)"
  {:db/ident :dpvo-pd/VoiceCommunicationRecording,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description
   #rdf/langString
    "Information about vocal recorded communication (e.g. telephony, VoIP)@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Voice Communication Recording@en",
   :rdfs/subClassOf [:dpvo-pd/Communication :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def VoiceMail
  "Information about voice mail messages."
  {:db/ident :dpvo-pd/VoiceMail,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Information about voice mail messages.@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Voice Mail@en",
   :rdfs/subClassOf [:dpvo-pd/Communication :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def Weight
  "Information about physical weight"
  {:db/ident :dpvo-pd/Weight,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Fajar Ekaputra"}
                     {:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString "Information about physical weight@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Weight@en",
   :rdfs/subClassOf
   [:dpvo-pd/PhysicalCharacteristic :dpvo-pd/External :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})

(def WorkEnvironment
  "Information about work environments"
  {:db/ident            :dpvo-pd/WorkEnvironment,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Information about work environments@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          #rdf/langString "Work Environment@en",
   :rdfs/subClassOf     [:dpvo-pd/Professional
                         :dpvo-pd/Social
                         :dpvo/PersonalData],
   :vs/term_status      #rdf/langString "accepted@en"})

(def WorkHistory
  "Information about work history in a professional context"
  {:db/ident :dpvo-pd/WorkHistory,
   :dcterms/created #xsd/date #inst "2019-06-04T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Elmar Kiesling; Harshvardhan J. Pandit"}
                     {:xsd/string "Fajar Ekaputra"}],
   :dcterms/description
   #rdf/langString
    "Information about work history in a professional context@en",
   :dcterms/source
   {:rdfa/uri
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label #rdf/langString "Work History@en",
   :rdfs/subClassOf [:dpvo-pd/Professional :dpvo-pd/Social :dpvo/PersonalData],
   :vs/term_status #rdf/langString "accepted@en"})
