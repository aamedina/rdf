(ns net.wikipunk.rdf.dpvo-pd
  {:dcat/downloadURL "net/wikipunk/ext/dpv-owl/dpv-pd/dpv-pd.ttl",
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
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "DPV-PD is an extension to the Data Privacy Vocabulary that provides additional terms related to Personal Data categories."},
   :dcterms/license {:xsd/anyURI
                     "https://www.w3.org/Consortium/Legal/2015/doc-license"},
   :dcterms/modified #inst "2022-12-05T00:00:00.000-00:00",
   :dcterms/source {:xsd/anyURI "https://www.w3.org/community/dpvcg/"},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "DPV-PD: Personal Data Extension for DPV"},
   :namespaces {"dcterms" "http://purl.org/dc/terms/",
                "dpvo"    "https://w3id.org/dpv/dpv-owl#",
                "dpvo-pd" "https://w3id.org/dpv/dpv-owl/dpv-pd#",
                "owl"     "http://www.w3.org/2002/07/owl#",
                "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                "vann"    "http://purl.org/vocab/vann/",
                "vs"      "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports {:xsd/anyURI "https://w3id.org/dpv/dpv-owl"},
   :owl/versionInfo "1",
   :rdf/type :owl/Ontology,
   :rdfa/prefix "dpvo-pd",
   :rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :vann/preferredNamespacePrefix "dpvo-pd",
   :vann/preferredNamespaceUri "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd"})

(def Accent
  {:db/ident :dpvo-pd/Accent,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about linguistic and speech accents."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Accent"},
   :rdfs/subClassOf :dpvo-pd/Language,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AccountIdentifier
  {:db/ident :dpvo-pd/AccountIdentifier,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about financial account identifier."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Account Identifier"},
   :rdfs/subClassOf :dpvo-pd/FinancialAccount,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Acquantaince
  {:db/ident :dpvo-pd/Acquantaince,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about acquaintainces in a social network."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Acquantaince"},
   :rdfs/subClassOf :dpvo-pd/SocialNetwork,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Age
  {:db/ident :dpvo-pd/Age,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about age"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Age"},
   :rdfs/subClassOf :dpvo-pd/PhysicalCharacteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AgeExact
  {:db/ident :dpvo-pd/AgeExact,
   :dcterms/created #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about the exact age (i.e. to some degree within a year, month, or day)"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Age Exact"},
   :rdfs/subClassOf :dpvo-pd/AgeRange,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AgeRange
  {:db/ident :dpvo-pd/AgeRange,
   :dcterms/created #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about age range i.e. inexact age to some degree (i.e. some years)"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Age Range"},
   :rdfs/subClassOf :dpvo-pd/Age,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ApartmentOwned
  {:db/ident :dpvo-pd/ApartmentOwned,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about apartment(s) owned and its history"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Apartment Owned"},
   :rdfs/subClassOf :dpvo-pd/HouseOwned,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Association
  {:db/ident :dpvo-pd/Association,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about associations in a social network with other individuals, groups, or entities e.g. friend of a friend"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Association"},
   :rdfs/subClassOf :dpvo-pd/SocialNetwork,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Attitude
  {:db/ident :dpvo-pd/Attitude,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about attitude."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Attitude"},
   :rdfs/subClassOf :dpvo-pd/Behavioral,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Authenticating
  {:db/ident :dpvo-pd/Authenticating,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about authentication and information used for authenticating"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Authenticating"},
   :rdfs/subClassOf :dpvo-pd/Internal,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def AuthenticationHistory
  {:db/ident :dpvo-pd/AuthenticationHistory,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about prior authentication and its outcomes such as login attempts or location."},
   :dcterms/source {:xsd/anyURI "https://www.w3.org/community/dpvcg/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Authentication History"},
   :rdfs/subClassOf :dpvo-pd/Behavioral,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BankAccount
  {:db/ident :dpvo-pd/BankAccount,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about bank accounts."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Bank Account"},
   :rdfs/subClassOf :dpvo-pd/FinancialAccount,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Behavioral
  {:db/ident :dpvo-pd/Behavioral,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about Behavior or activity"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Behavioral"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/data#Activity"},
   :rdfs/subClassOf :dpvo-pd/External,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Biometric
  {:db/ident :dpvo-pd/Biometric,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about biometrics and biometric characteristics."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Biometric"},
   :rdfs/subClassOf #{:dpvo/SpecialCategoryPersonalData :dpvo-pd/Identifying},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BirthDate
  {:db/ident            :dpvo-pd/BirthDate,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about birth date"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Birth Date"},
   :rdfs/subClassOf     :dpvo-pd/Age,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def BirthPlace
  {:db/ident            :dpvo-pd/BirthPlace,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about birth place"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Birth Place"},
   :rdfs/subClassOf     :dpvo-pd/Location,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def BloodType
  {:db/ident :dpvo-pd/BloodType,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about blood type."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Blood Type"},
   :rdfs/subClassOf :dpvo-pd/MedicalHealth,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BrowserFingerprint
  {:db/ident :dpvo-pd/BrowserFingerprint,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about the web browser which is used as a 'fingerprint'"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Browser Fingerprint"},
   :rdfs/subClassOf :dpvo-pd/DeviceBased,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BrowserHistory
  {:db/ident :dpvo-pd/BrowserHistory,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about and including web browsing history"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Browser History"},
   :rdfs/subClassOf :dpvo-pd/BrowsingBehavior,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BrowsingBehavior
  {:db/ident :dpvo-pd/BrowsingBehavior,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about browsing Behavior."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Browsing Behavior"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/data#OnlineActivity"},
   :rdfs/subClassOf :dpvo-pd/Behavioral,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def BrowsingReferral
  {:db/ident :dpvo-pd/BrowsingReferral,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about web browsing referrer or referral, which can be based on location, targeted referrals, direct, organic search, social media or actions, campaigns."},
   :dcterms/source {:xsd/anyURI "https://www.w3.org/community/dpvcg/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Browsing Referral"},
   :rdfs/subClassOf :dpvo-pd/BrowsingBehavior,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CallLog
  {:db/ident :dpvo-pd/CallLog,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about the calls that an individual has made."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Call Log"},
   :rdfs/subClassOf :dpvo-pd/Behavioral,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CarOwned
  {:db/ident :dpvo-pd/CarOwned,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about cars ownership and ownership history."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Car Owned"},
   :rdfs/subClassOf :dpvo-pd/Ownership,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CharacterClass
  {:db/ident :dpvo-pd/Character,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about character in the public sphere"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Character"},
   :rdfs/subClassOf :dpvo-pd/PublicLife,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Communication
  {:db/ident :dpvo-pd/Communication,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information communicated from or to an individual"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Communication"},
   :rdfs/subClassOf :dpvo-pd/Social,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CommunicationsMetadata
  {:db/ident :dpvo-pd/CommunicationsMetadata,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about communication metadata in the public sphere"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Communications Metadata"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/data#Interactive"},
   :rdfs/subClassOf :dpvo-pd/PublicLife,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Connection
  {:db/ident :dpvo-pd/Connection,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about and including connections in a social network"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Connection"},
   :rdfs/subClassOf :dpvo-pd/SocialNetwork,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Contact
  {:db/ident :dpvo-pd/Contact,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about contacts or used for contacting e.g. email address or phone number"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Contact"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/data#Physical"},
   :rdfs/subClassOf :dpvo-pd/Tracking,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Country
  {:db/ident :dpvo-pd/Country,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about country e.g. residence, travel."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Country"},
   :rdfs/subClassOf :dpvo-pd/Location,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Credit
  {:db/ident :dpvo-pd/Credit,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about reputation with regards to money"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit"},
   :rdfs/subClassOf :dpvo-pd/Transactional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CreditCapacity
  {:db/ident :dpvo-pd/CreditCapacity,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about credit capacity."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Capacity"},
   :rdfs/subClassOf :dpvo-pd/Credit,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CreditCardNumber
  {:db/ident :dpvo-pd/CreditCardNumber,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about credit card number"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Card Number"},
   :rdfs/subClassOf :dpvo-pd/PaymentCardNumber,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CreditRecord
  {:db/ident :dpvo-pd/CreditRecord,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about credit record."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Record"},
   :rdfs/subClassOf :dpvo-pd/Credit,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CreditScore
  {:db/ident :dpvo-pd/CreditScore,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about credit score."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Score"},
   :rdfs/subClassOf :dpvo-pd/CreditWorthiness,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CreditStanding
  {:db/ident :dpvo-pd/CreditStanding,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about credit standing."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Standing"},
   :rdfs/subClassOf :dpvo-pd/Credit,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CreditWorthiness
  {:db/ident :dpvo-pd/CreditWorthiness,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about credit worthiness."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Worthiness"},
   :rdfs/subClassOf :dpvo-pd/Credit,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Criminal
  {:db/ident :dpvo-pd/Criminal,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about criminal activity e.g. criminal convictions or jail time"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Criminal"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/data#Judicial"},
   :rdfs/subClassOf :dpvo-pd/Social,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CriminalCharge
  {:db/ident :dpvo-pd/CriminalCharge,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about criminal charges."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Criminal Charge"},
   :rdfs/subClassOf :dpvo-pd/Criminal,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CriminalConviction
  {:db/ident :dpvo-pd/CriminalConviction,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about criminal convictions."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Criminal Conviction"},
   :rdfs/subClassOf :dpvo-pd/Criminal,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CriminalOffense
  {:db/ident            :dpvo-pd/CriminalOffense,
   :dcterms/created     #inst "2022-10-22T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Georg P Krog"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about criminal offenses"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Criminal Offense"},
   :rdfs/subClassOf     :dpvo-pd/Criminal,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CriminalPardon
  {:db/ident :dpvo-pd/CriminalPardon,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about criminal pardons."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Criminal Pardon"},
   :rdfs/subClassOf :dpvo-pd/Criminal,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CurrentEmployment
  {:db/ident            :dpvo-pd/CurrentEmployment,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about current employment"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Current Employment"},
   :rdfs/subClassOf     :dpvo-pd/EmploymentHistory,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DNACode
  {:db/ident :dpvo-pd/DNACode,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about DNA."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DNA Code"},
   :rdfs/subClassOf :dpvo-pd/MedicalHealth,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Demeanor
  {:db/ident :dpvo-pd/Demeanor,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about demeanor."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Demeanor"},
   :rdfs/subClassOf :dpvo-pd/Behavioral,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Demographic
  {:db/ident :dpvo-pd/Demographic,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about demography and demographic characteristics"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Demographic"},
   :rdfs/subClassOf :dpvo-pd/External,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DeviceApplications
  {:db/ident :dpvo-pd/DeviceApplications,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about applications or application-like software on a device."},
   :dcterms/source {:xsd/anyURI "https://www.w3.org/community/dpvcg/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Device Applications"},
   :rdfs/subClassOf :dpvo-pd/DeviceSoftware,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DeviceBased
  {:db/ident :dpvo-pd/DeviceBased,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about devices"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Device Based"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/data#Computer"},
   :rdfs/subClassOf :dpvo-pd/Tracking,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DeviceOperatingSystem
  {:db/ident :dpvo-pd/DeviceOperatingSystem,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about the operating system (OS) or system software that manages hardware or software resources."},
   :dcterms/source {:xsd/anyURI "https://www.w3.org/community/dpvcg/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Device Operating System"},
   :rdfs/subClassOf :dpvo-pd/DeviceSoftware,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DeviceSoftware
  {:db/ident :dpvo-pd/DeviceSoftware,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Beatriz Esteves"}
                      {:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about software on or related to a device."},
   :dcterms/source {:xsd/anyURI "https://www.w3.org/community/dpvcg/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Device Software"},
   :rdfs/subClassOf :dpvo-pd/DeviceBased,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Dialect
  {:db/ident :dpvo-pd/Dialect,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about linguistic dialects."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Dialect"},
   :rdfs/subClassOf :dpvo-pd/Language,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DigitalFingerprint
  {:db/ident :dpvo-pd/DigitalFingerprint,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about a 'digital fingerprint' created for identification"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Digital Fingerprint"},
   :rdfs/subClassOf :dpvo-pd/Tracking,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Disability
  {:db/ident :dpvo-pd/Disability,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about disabilities."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Disability"},
   :rdfs/subClassOf :dpvo-pd/MedicalHealth,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DisciplinaryAction
  {:db/ident :dpvo-pd/DisciplinaryAction,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about disciplinary actions and its history"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Disciplinary Action"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Dislike
  {:db/ident :dpvo-pd/Dislike,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about dislikes or preferences regarding repulsions."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Dislike"},
   :rdfs/subClassOf :dpvo-pd/Interest,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Divorce
  {:db/ident :dpvo-pd/Divorce,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about divorce(s)."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Divorce"},
   :rdfs/subClassOf :dpvo-pd/FamilyStructure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DrugTestResult
  {:db/ident :dpvo-pd/DrugTestResult,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about drug test results."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Drug Test Result"},
   :rdfs/subClassOf :dpvo-pd/MedicalHealth,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Education
  {:db/ident            :dpvo-pd/Education,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about education"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Education"},
   :rdfs/subClassOf     :dpvo-pd/Professional,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def EducationExperience
  {:db/ident :dpvo-pd/EducationExperience,
   :dcterms/created #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about education experience e.g. attending a university"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Education Experience"},
   :rdfs/subClassOf :dpvo-pd/Education,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EducationQualification
  {:db/ident            :dpvo-pd/EducationQualification,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about educational qualifications"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Education Qualification"},
   :rdfs/subClassOf     :dpvo-pd/Education,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def EmailAddress
  {:db/ident :dpvo-pd/EmailAddress,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about Email address."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Email Address"},
   :rdfs/subClassOf :dpvo-pd/Contact,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EmailAddressPersonal
  {:db/ident :dpvo-pd/EmailAddressPersonal,
   :dcterms/created #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about Email address used in Personal capacity"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Email Address Personal"},
   :rdfs/subClassOf :dpvo-pd/EmailAddress,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EmailAddressWork
  {:db/ident :dpvo-pd/EmailAddressWork,
   :dcterms/created #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about Email address used for Work or in Professional capacity"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Email Address Work"},
   :rdfs/subClassOf :dpvo-pd/EmailAddress,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EmailContent
  {:db/ident :dpvo-pd/EmailContent,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about the contents of Emails sent or received"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Email Content"},
   :rdfs/subClassOf :dpvo-pd/Communication,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EmploymentHistory
  {:db/ident :dpvo-pd/EmploymentHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about employment history"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Employment History"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def EthnicOrigin
  {:db/ident :dpvo-pd/EthnicOrigin,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about ethnic origin"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ethnic Origin"},
   :rdfs/subClassOf #{:dpvo/SpecialCategoryPersonalData :dpvo-pd/Ethnicity},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Ethnicity
  {:db/ident :dpvo-pd/Ethnicity,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about ethnic origins and lineage"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ethnicity"},
   :rdfs/subClassOf :dpvo-pd/External,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def External
  {:db/ident :dpvo-pd/External,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about external characteristics that can be observed"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "External"},
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FacialPrint
  {:db/ident            :dpvo-pd/FacialPrint,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about facial print or pattern"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Facial Print"},
   :rdfs/subClassOf     :dpvo-pd/Biometric,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Family
  {:db/ident :dpvo-pd/Family,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about family and relationships"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Family"},
   :rdfs/subClassOf :dpvo-pd/Social,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FamilyHealthHistory
  {:db/ident :dpvo-pd/FamilyHealthHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about family health history."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Family Health History"},
   :rdfs/subClassOf :dpvo-pd/HealthHistory,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FamilyStructure
  {:db/ident :dpvo-pd/FamilyStructure,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about family and familial structure."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Family Structure"},
   :rdfs/subClassOf :dpvo-pd/Family,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Favorite
  {:db/ident :dpvo-pd/Favorite,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about favorites"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Favorite"},
   :rdfs/subClassOf :dpvo-pd/Preference,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FavoriteColor
  {:db/ident :dpvo-pd/FavoriteColor,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about favorite color."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Favorite Color"},
   :rdfs/subClassOf :dpvo-pd/Favorite,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FavoriteFood
  {:db/ident :dpvo-pd/FavoriteFood,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about favorite food."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Favorite Food"},
   :rdfs/subClassOf :dpvo-pd/Favorite,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FavoriteMusic
  {:db/ident :dpvo-pd/FavoriteMusic,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about favorite music."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Favorite Music"},
   :rdfs/subClassOf :dpvo-pd/Favorite,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Fetish
  {:db/ident :dpvo-pd/Fetish,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about an individual's sexual fetishes"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fetish"},
   :rdfs/subClassOf :dpvo-pd/Sexual,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Financial
  {:db/ident :dpvo-pd/Financial,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about finance including monetary characteristics and transactions"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Financial"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/data#Financial"},
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FinancialAccount
  {:db/ident :dpvo-pd/FinancialAccount,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about financial accounts."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Financial Account"},
   :rdfs/subClassOf :dpvo-pd/Financial,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FinancialAccountNumber
  {:db/ident :dpvo-pd/FinancialAccountNumber,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about financial account number"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Financial Account Number"},
   :rdfs/subClassOf :dpvo-pd/AccountIdentifier,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FinancialStatus
  {:db/ident            :dpvo-pd/FinancialStatus,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about financial status or standing"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Financial Status"},
   :rdfs/subClassOf     :dpvo-pd/Financial,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Fingerprint
  {:db/ident :dpvo-pd/Fingerprint,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about fingerprint used for biometric purposes."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Fingerprint"},
   :rdfs/subClassOf :dpvo-pd/Biometric,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Friend
  {:db/ident :dpvo-pd/Friend,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about friends in a social network, including aspects of friendships such as years together or nature of friendship."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Friend"},
   :rdfs/subClassOf :dpvo-pd/SocialNetwork,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def GPSCoordinate
  {:db/ident :dpvo-pd/GPSCoordinate,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about location expressed using Global Position System coordinates (GPS)"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GPS Coordinate"},
   :rdfs/subClassOf :dpvo-pd/Location,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Gender
  {:db/ident :dpvo-pd/Gender,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about gender"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Gender"},
   :rdfs/subClassOf :dpvo-pd/PhysicalCharacteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def GeneralReputation
  {:db/ident :dpvo-pd/GeneralReputation,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about reputation in the public sphere"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "General Reputation"},
   :rdfs/subClassOf :dpvo-pd/PublicLife,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Genetic
  {:db/ident :dpvo-pd/Genetic,
   :dcterms/created #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about inherited or acquired genetic characteristics"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Genetic"},
   :rdfs/subClassOf :dpvo-pd/Health,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Geographic
  {:db/ident :dpvo-pd/Geographic,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about location or based on geography (e.g. home address)"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Geographic"},
   :rdfs/subClassOf :dpvo-pd/Demographic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def GroupMembership
  {:db/ident :dpvo-pd/GroupMembership,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about groups and memberships included or associated with a social network"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Group Membership"},
   :rdfs/subClassOf :dpvo-pd/SocialNetwork,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HairColor
  {:db/ident :dpvo-pd/HairColor,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about hair color"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Hair Color"},
   :rdfs/subClassOf :dpvo-pd/PhysicalCharacteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Health
  {:db/ident :dpvo-pd/Health,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about health."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Health"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/data#Health"},
   :rdfs/subClassOf :dpvo-pd/MedicalHealth,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HealthHistory
  {:db/ident :dpvo-pd/HealthHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about health history."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Health History"},
   :rdfs/subClassOf :dpvo-pd/MedicalHealth,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HealthRecord
  {:db/ident :dpvo-pd/HealthRecord,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about health record."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Health Record"},
   :rdfs/subClassOf :dpvo-pd/MedicalHealth,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Height
  {:db/ident :dpvo-pd/Height,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about physical height"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Height"},
   :rdfs/subClassOf :dpvo-pd/PhysicalCharacteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Historical
  {:db/ident :dpvo-pd/Historical,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about historical data related to or relevant regarding history or past events"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Historical"},
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def HouseOwned
  {:db/ident :dpvo-pd/HouseOwned,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about house(s) owned and ownership history."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "House Owned"},
   :rdfs/subClassOf :dpvo-pd/Ownership,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Household
  {:db/ident            :dpvo-pd/Household,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about personal or household activities"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Household"},
   :rdfs/subClassOf     :dpvo/PersonalData,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def IPAddress
  {:db/ident :dpvo-pd/IPAddress,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about the Internet Protocol (IP) address of a device"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IP Address"},
   :rdfs/subClassOf :dpvo-pd/DeviceBased,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Identifier
  {:db/ident :dpvo-pd/Identifier,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about an identifier or name used for identification"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Identifier"},
   :rdfs/subClassOf :dpvo-pd/Tracking,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Identifying
  {:db/ident :dpvo-pd/Identifying,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information that uniquely or semi-uniquely identifies an individual or a group"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Identifying"},
   :rdfs/subClassOf :dpvo-pd/External,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Income
  {:db/ident :dpvo-pd/Income,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about financial income e.g. for individual or household or family"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Income"},
   :rdfs/subClassOf :dpvo-pd/Transactional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IncomeBracket
  {:db/ident :dpvo-pd/IncomeBracket,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about income bracket."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Income Bracket"},
   :rdfs/subClassOf :dpvo-pd/Demographic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IndividualHealthHistory
  {:db/ident :dpvo-pd/IndividualHealthHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about information health history."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Individual Health History"},
   :rdfs/subClassOf :dpvo-pd/HealthHistory,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Insurance
  {:db/ident            :dpvo-pd/Insurance,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about Insurance"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Insurance"},
   :rdfs/subClassOf     :dpvo-pd/Financial,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Intention
  {:db/ident :dpvo-pd/Intention,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about intentions"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Intention"},
   :rdfs/subClassOf :dpvo-pd/Preference,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Interaction
  {:db/ident :dpvo-pd/Interaction,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about interactions in the public sphere"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Interaction"},
   :rdfs/subClassOf :dpvo-pd/PublicLife,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Interest
  {:db/ident :dpvo-pd/Interest,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about interests"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Interest"},
   :rdfs/subClassOf :dpvo-pd/Preference,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Internal
  {:db/ident :dpvo-pd/Internal,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Informatoin about internal characteristics that cannot be seen or observed"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Internal"},
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Job
  {:db/ident :dpvo-pd/Job,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about professional jobs"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Job"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def KnowledgeBelief
  {:db/ident :dpvo-pd/KnowledgeBelief,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about knowledge and beliefs"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Knowledge and Beliefs"},
   :rdfs/subClassOf :dpvo-pd/Internal,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Language
  {:db/ident :dpvo-pd/Language,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about language and lingual history."},
   :dcterms/modified #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Language"},
   :rdfs/subClassOf :dpvo-pd/External,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def LifeHistory
  {:db/ident :dpvo-pd/LifeHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about personal history regarding events or activities - including  their occurrences that might be directly related or have had an influence (e.g. World War, 9/11)"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Life History"},
   :rdfs/subClassOf :dpvo-pd/Historical,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Like
  {:db/ident :dpvo-pd/Like,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about likes or preferences regarding attractions."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Like"},
   :rdfs/subClassOf :dpvo-pd/Interest,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LinkClicked
  {:db/ident :dpvo-pd/LinkClicked,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about the links that an individual has clicked."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Link Clicked"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/data#Navigation"},
   :rdfs/subClassOf :dpvo-pd/Behavioral,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def LoanRecord
  {:db/ident :dpvo-pd/LoanRecord,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about loans, whether applied, provided or rejected, and its history"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Loan Record"},
   :rdfs/subClassOf :dpvo-pd/Transactional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Location
  {:db/ident :dpvo-pd/Location,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about location"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Location"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/data#Location"},
   :rdfs/subClassOf :dpvo-pd/Tracking,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MACAddress
  {:db/ident :dpvo-pd/MACAddress,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about the Media Access Control (MAC) address of a device"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MAC Address"},
   :rdfs/subClassOf :dpvo-pd/DeviceBased,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MaritalStatus
  {:db/ident :dpvo-pd/MaritalStatus,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about marital status and history"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Marital Status"},
   :rdfs/subClassOf :dpvo-pd/PublicLife,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Marriage
  {:db/ident :dpvo-pd/Marriage,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about marriage(s)."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Marriage"},
   :rdfs/subClassOf :dpvo-pd/FamilyStructure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MedicalHealth
  {:db/ident :dpvo-pd/MedicalHealth,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about health, medical conditions or health care"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Medical Health"},
   :rdfs/subClassOf #{:dpvo/SpecialCategoryPersonalData :dpvo-pd/External},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MentalHealth
  {:db/ident :dpvo-pd/MentalHealth,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about mental health."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mental Health"},
   :rdfs/subClassOf :dpvo-pd/Health,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Name
  {:db/ident :dpvo-pd/Name,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about names associated or used as given name or nickname."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Name"},
   :rdfs/subClassOf :dpvo-pd/Identifying,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Nationality
  {:db/ident            :dpvo-pd/Nationality,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator     {:xsd/anyURI
                         "https://www.w3.org/2022/04/20-dpvcg-minutes.html"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about nationality"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Nationality"},
   :rdfs/subClassOf     :dpvo-pd/External,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def OfficialID
  {:db/ident :dpvo-pd/OfficialID,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about an official identifier or identification document"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Official ID"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/data#Government"},
   :rdfs/subClassOf :dpvo-pd/Identifying,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Offspring
  {:db/ident :dpvo-pd/Offspring,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about offspring(s)."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Offspring"},
   :rdfs/subClassOf :dpvo-pd/FamilyStructure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Opinion
  {:db/ident :dpvo-pd/Opinion,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about opinions"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Opinion"},
   :rdfs/subClassOf :dpvo-pd/Preference,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Ownership
  {:db/ident :dpvo-pd/Ownership,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about ownership and history, including renting, borrowing, possessions."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ownership"},
   :rdfs/subClassOf :dpvo-pd/Financial,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PINCode
  {:db/ident :dpvo-pd/PINCode,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about Personal identification number (PIN), which is usually used in the process of authenticating the individual as an user accessing a system."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PIN Code"},
   :rdfs/subClassOf :dpvo-pd/Authenticating,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Parent
  {:db/ident :dpvo-pd/Parent,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about parent(s)."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Parent"},
   :rdfs/subClassOf :dpvo-pd/FamilyStructure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Passport
  {:db/ident            :dpvo-pd/Passport,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about passport"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Passport"},
   :rdfs/subClassOf     :dpvo-pd/OfficialID,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Password
  {:db/ident :dpvo-pd/Password,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about password used in the process of authenticating the individual as an user accessing a system."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Password"},
   :rdfs/subClassOf :dpvo-pd/Authenticating,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PastEmployment
  {:db/ident            :dpvo-pd/PastEmployment,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about past employment"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Past Employment"},
   :rdfs/subClassOf     :dpvo-pd/EmploymentHistory,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def PaymentCard
  {:db/ident :dpvo-pd/PaymentCard,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about payment card such as Credit Card, Debit Card."},
   :dcterms/source {:xsd/anyURI "https://www.w3.org/community/dpvcg/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Payment Card"},
   :rdfs/subClassOf :dpvo-pd/FinancialAccount,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PaymentCardExpiry
  {:db/ident :dpvo-pd/PaymentCardExpiry,
   :dcterms/created #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about payment card expiry such as a date."},
   :dcterms/source {:xsd/anyURI "https://www.w3.org/community/dpvcg/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Payment Card Expiry"},
   :rdfs/subClassOf :dpvo-pd/PaymentCard,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PaymentCardNumber
  {:db/ident            :dpvo-pd/PaymentCardNumber,
   :dcterms/created     #inst "2020-11-04T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Georg P Krog"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about payment card number."},
   :dcterms/source      {:xsd/anyURI "https://www.w3.org/community/dpvcg/"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Payment Card Number"},
   :rdfs/subClassOf     #{:dpvo-pd/AccountIdentifier :dpvo-pd/PaymentCard},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def PerformanceAtWork
  {:db/ident :dpvo-pd/PerformanceAtWork,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about performance at work or within work environments"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Performance at Work"},
   :rdfs/subClassOf #{:dpvo-pd/Professional :dpvo-pd/Behavioral},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PersonalDocuments
  {:db/ident :dpvo-pd/PersonalDocuments,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about and including personal documents e.g. diaries or journals"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personal Documents"},
   :rdfs/subClassOf :dpvo-pd/External,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PersonalPossession
  {:db/ident :dpvo-pd/PersonalPossession,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about personal possessions."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personal Possession"},
   :rdfs/subClassOf :dpvo-pd/Ownership,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Personality
  {:db/ident :dpvo-pd/Personality,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about personality (e.g., categorization in terms of the Big Five personality traits)"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personality"},
   :rdfs/subClassOf :dpvo-pd/Behavioral,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PhilosophicalBelief
  {:db/ident :dpvo-pd/PhilosophicalBelief,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about philosophical beliefs."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Philosophical Belief"},
   :rdfs/subClassOf #{:dpvo/SpecialCategoryPersonalData
                      :dpvo-pd/KnowledgeBelief},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PhysicalAddress
  {:db/ident :dpvo-pd/PhysicalAddress,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about physical address."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Physical Address"},
   :rdfs/subClassOf :dpvo-pd/Contact,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PhysicalCharacteristic
  {:db/ident :dpvo-pd/PhysicalCharacteristic,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about physical characteristics"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Physical Characteristic"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/data#Demographic"},
   :rdfs/subClassOf :dpvo-pd/External,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PhysicalHealth
  {:db/ident :dpvo-pd/PhysicalHealth,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about physical health."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Physical Health"},
   :rdfs/subClassOf :dpvo-pd/Health,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PhysicalTrait
  {:db/ident :dpvo-pd/PhysicalTrait,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about defining traits or features regarding the body."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Physical Trait"},
   :rdfs/subClassOf :dpvo-pd/Demographic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Picture
  {:db/ident :dpvo-pd/Picture,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about visual representation or image e.g. profile photo."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Picture"},
   :rdfs/subClassOf :dpvo-pd/Identifying,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Piercing
  {:db/ident :dpvo-pd/Piercing,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about piercings"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Piercing"},
   :rdfs/subClassOf :dpvo-pd/PhysicalCharacteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PoliticalAffiliation
  {:db/ident :dpvo-pd/PoliticalAffiliation,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about political affiliation and history"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Political Affiliation"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/data#Political"},
   :rdfs/subClassOf #{:dpvo-pd/PublicLife :dpvo/SpecialCategoryPersonalData},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PoliticalOpinion
  {:db/ident :dpvo-pd/PoliticalOpinion,
   :dcterms/created #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about opinions regarding politics and political topics"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Political Opinion"},
   :rdfs/subClassOf #{:dpvo-pd/PublicLife :dpvo/SpecialCategoryPersonalData},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Preference
  {:db/ident :dpvo-pd/Preference,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about preferences or interests"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Preference"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/data#Preference"},
   :rdfs/subClassOf :dpvo-pd/Internal,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Prescription
  {:db/ident :dpvo-pd/Prescription,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about medical and pharmaceutical prescriptions"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Prescription"},
   :rdfs/subClassOf :dpvo-pd/MedicalHealth,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PrivacyPreference
  {:db/ident :dpvo-pd/PrivacyPreference,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about privacy preferences"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Privacy Preference"},
   :rdfs/subClassOf :dpvo-pd/Preference,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Proclivitie
  {:db/ident :dpvo-pd/Proclivitie,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about proclivities in a sexual context"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Proclivitie"},
   :rdfs/subClassOf :dpvo-pd/Sexual,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Professional
  {:db/ident :dpvo-pd/Professional,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about educational or professional career"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Professional"},
   :rdfs/subClassOf :dpvo-pd/Social,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ProfessionalCertification
  {:db/ident :dpvo-pd/ProfessionalCertification,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about professional certifications"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Professional Certification"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ProfessionalEvaluation
  {:db/ident :dpvo-pd/ProfessionalEvaluation,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about professional evaluations"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Professional Evaluation"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ProfessionalInterview
  {:db/ident :dpvo-pd/ProfessionalInterview,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about professional interviews"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Professional Interview"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Profile
  {:db/ident :dpvo-pd/Profile,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Profile or user profile is information and representation of characteristics associated with person(s) or group(s)"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Profile"},
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PublicLife
  {:db/ident :dpvo-pd/PublicLife,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about public life"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Public Life"},
   :rdfs/subClassOf :dpvo-pd/Social,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PubliclyAvailableSocialMedia
  {:db/ident :dpvo-pd/PubliclyAvailableSocialMedia,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about social media that is publicly available"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Publicly Available Social Media"},
   :rdfs/subClassOf :dpvo-pd/SocialMedia,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Purchase
  {:db/ident :dpvo-pd/Purchase,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about purchases such as items bought e.g. grocery or clothing"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Purchase"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/data#Purchase"},
   :rdfs/subClassOf :dpvo-pd/Transactional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PurchasesAndSpendingHabit
  {:db/ident :dpvo-pd/PurchasesAndSpendingHabit,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about analysis of purchases made and money spent expressed as a habit e.g. monthly shopping trends"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Purchases and Spending Habit"},
   :rdfs/subClassOf :dpvo-pd/Transactional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Race
  {:db/ident :dpvo-pd/Race,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about race or racial history."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Race"},
   :rdfs/subClassOf #{:dpvo/SpecialCategoryPersonalData :dpvo-pd/Ethnicity},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Reference
  {:db/ident :dpvo-pd/Reference,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about references in the professional context"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Reference"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Relationship
  {:db/ident :dpvo-pd/Relationship,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about relationships and relationship history."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Relationship"},
   :rdfs/subClassOf :dpvo-pd/Family,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Reliability
  {:db/ident            :dpvo-pd/Reliability,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about reliability (e.g. of a person)"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Reliability"},
   :rdfs/subClassOf     :dpvo-pd/Behavioral,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Religion
  {:db/ident :dpvo-pd/Religion,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about religion, religious inclinations, and religious history."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Religion"},
   :rdfs/subClassOf #{:dpvo-pd/PublicLife :dpvo/SpecialCategoryPersonalData},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ReligiousBelief
  {:db/ident :dpvo-pd/ReligiousBelief,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about religion and religious beliefs."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Religious Belief"},
   :rdfs/subClassOf #{:dpvo/SpecialCategoryPersonalData
                      :dpvo-pd/KnowledgeBelief},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Retina
  {:db/ident :dpvo-pd/Retina,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about retina and the retinal patterns."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Retina"},
   :rdfs/subClassOf :dpvo-pd/Biometric,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def RoomNumber
  {:db/ident :dpvo-pd/RoomNumber,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about location expressed as Room number or similar numbering systems"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Room Number"},
   :rdfs/subClassOf :dpvo-pd/Location,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Salary
  {:db/ident :dpvo-pd/Salary,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about salary"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Salary"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Sale
  {:db/ident :dpvo-pd/Sale,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about sales e.g. selling of goods or services"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sale"},
   :rdfs/subClassOf :dpvo-pd/Transactional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def School
  {:db/ident :dpvo-pd/School,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about school such as name of school, conduct, or grades obtained."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "School"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SecretText
  {:db/ident :dpvo-pd/SecretText,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about secret text used in the process of authenticating the individual as an user accessing a system, e.g., when recovering a lost password."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Secret Text"},
   :rdfs/subClassOf :dpvo-pd/Authenticating,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def ServiceConsumptionBehavior
  {:db/ident :dpvo-pd/ServiceConsumptionBehavior,
   :dcterms/created #inst "2019-11-26T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Rudy Jacob"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about the consumption of a service, e.g. time and duration of consumption."},
   :dcterms/source {:xsd/anyURI "https://specialprivacy.ercim.eu/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Service Consumption Behavior"},
   :rdfs/subClassOf :dpvo-pd/Behavioral,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Sexual
  {:db/ident :dpvo-pd/Sexual,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about sexuality and sexual history"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sexual"},
   :rdfs/subClassOf #{:dpvo/SpecialCategoryPersonalData :dpvo-pd/External},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SexualHistory
  {:db/ident :dpvo-pd/SexualHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about sexual history"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sexual History"},
   :rdfs/subClassOf :dpvo-pd/Sexual,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SexualPreference
  {:db/ident :dpvo-pd/SexualPreference,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about sexual preferences"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sexual Preference"},
   :rdfs/subClassOf :dpvo-pd/Sexual,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Sibling
  {:db/ident :dpvo-pd/Sibling,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about sibling(s)."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sibling"},
   :rdfs/subClassOf :dpvo-pd/FamilyStructure,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SkinTone
  {:db/ident :dpvo-pd/SkinTone,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about skin tone"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Skin Tone"},
   :rdfs/subClassOf :dpvo-pd/PhysicalCharacteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Social
  {:db/ident :dpvo-pd/Social,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about social aspects such as family, public life, or professional networks."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Social"},
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SocialMedia
  {:db/ident            :dpvo-pd/SocialMedia,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about social media"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Social Media"},
   :rdfs/subClassOf     :dpvo-pd/Communication,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def SocialMediaCommunication
  {:db/ident :dpvo-pd/SocialMediaCommunication,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about social media communication, including the communication itself and metadata."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Social Media Communication"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/data#Social"},
   :rdfs/subClassOf :dpvo-pd/Communication,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SocialNetwork
  {:db/ident :dpvo-pd/SocialNetwork,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about friends or connections expressed as a social network"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Social Network"},
   :rdfs/subClassOf :dpvo-pd/Social,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SocialStatus
  {:db/ident :dpvo-pd/SocialStatus,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about social status"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Social Status"},
   :rdfs/subClassOf :dpvo-pd/PublicLife,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TVViewingBehavior
  {:db/ident :dpvo-pd/TVViewingBehavior,
   :dcterms/created #inst "2019-11-26T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Rudy Jacob"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about TV viewing Behavior, such as timestamps of channel change, duration of viewership, content consumed"},
   :dcterms/source {:xsd/anyURI "https://specialprivacy.ercim.eu/"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "TV Viewing Behavior"},
   :rdfs/subClassOf :dpvo-pd/ServiceConsumptionBehavior,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Tattoo
  {:db/ident :dpvo-pd/Tattoo,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about tattoos"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tattoo"},
   :rdfs/subClassOf :dpvo-pd/PhysicalCharacteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Tax
  {:db/ident :dpvo-pd/Tax,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about financial tax e.g. tax records or tax due"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tax"},
   :rdfs/subClassOf :dpvo-pd/Transactional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TelephoneNumber
  {:db/ident :dpvo-pd/TelephoneNumber,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about telephone number."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Telephone Number"},
   :rdfs/subClassOf :dpvo-pd/Contact,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Thought
  {:db/ident :dpvo-pd/Thought,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about thoughts"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Thought"},
   :rdfs/subClassOf :dpvo-pd/KnowledgeBelief,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Tracking
  {:db/ident :dpvo-pd/Tracking,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information used to track an individual or group e.g. location or email"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tracking"},
   :rdfs/subClassOf :dpvo/PersonalData,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TradeUnionMembership
  {:db/ident :dpvo-pd/TradeUnionMembership,
   :dcterms/created #inst "2022-05-18T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about trade union memberships and related topics"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Trade Union Membership"},
   :rdfs/subClassOf #{:dpvo/SpecialCategoryPersonalData
                      :dpvo-pd/GroupMembership},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Transaction
  {:db/ident :dpvo-pd/Transaction,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about financial transactions e.g. bank transfers"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Transaction"},
   :rdfs/subClassOf :dpvo-pd/Transactional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Transactional
  {:db/ident :dpvo-pd/Transactional,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about a purchasing, spending or income"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Transactional"},
   :rdfs/subClassOf :dpvo-pd/Financial,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TravelHistory
  {:db/ident            :dpvo-pd/TravelHistory,
   :dcterms/created     #inst "2022-04-20T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about travel history"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Travel History"},
   :rdfs/subClassOf     :dpvo-pd/Location,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def UID
  {:db/ident :dpvo-pd/UID,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about unique identifiers."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "UID"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://specialprivacy.ercim.eu/vocabs/data#UniqueId"},
   :rdfs/subClassOf :dpvo-pd/Identifying,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def UserAgent
  {:db/ident :dpvo-pd/UserAgent,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Georg P Krog"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about software acting on behalf of users e.g. web browser"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "User agent"},
   :rdfs/subClassOf :dpvo-pd/Tracking,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Username
  {:db/ident :dpvo-pd/Username,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about usernames."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Username"},
   :rdfs/subClassOf :dpvo-pd/Identifying,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VehicalLicenseNumber
  {:db/ident            :dpvo-pd/VehicalLicenseNumber,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about vehicle license number"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Vehicle License Number"},
   :rdfs/subClassOf     :dpvo-pd/VehicleLicense,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def VehicalLicenseRegistration
  {:db/ident            :dpvo-pd/VehicalLicenseRegistration,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Information about vehicle license registration"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Vehicle License Registration"},
   :rdfs/subClassOf     :dpvo-pd/VehicleLicense,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Vehicle
  {:db/ident            :dpvo-pd/Vehicle,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about vehicles"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Vehicle"},
   :rdfs/subClassOf     :dpvo-pd/External,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def VehicleLicense
  {:db/ident            :dpvo-pd/VehicleLicense,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about vehicle license"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Vehicle License"},
   :rdfs/subClassOf     #{:dpvo-pd/Vehicle :dpvo-pd/Identifying},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def VehicleUsage
  {:db/ident :dpvo-pd/VehicleUsage,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Information about usage of vehicles, e.g. driving statistics"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Vehicle Usage"},
   :rdfs/subClassOf #{:dpvo-pd/Vehicle :dpvo-pd/Behavioral},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VoiceCommunicationRecording
  {:db/ident :dpvo-pd/VoiceCommunicationRecording,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Information about vocal recorded communication (e.g. telephony, VoIP)"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Voice Communication Recording"},
   :rdfs/subClassOf :dpvo-pd/Communication,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def VoiceMail
  {:db/ident :dpvo-pd/VoiceMail,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Information about voice mail messages."},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Voice Mail"},
   :rdfs/subClassOf :dpvo-pd/Communication,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Weight
  {:db/ident :dpvo-pd/Weight,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about physical weight"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Weight"},
   :rdfs/subClassOf :dpvo-pd/PhysicalCharacteristic,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def WorkEnvironment
  {:db/ident            :dpvo-pd/WorkEnvironment,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Information about work environments"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Work Environment"},
   :rdfs/subClassOf     :dpvo-pd/Professional,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def WorkHistory
  {:db/ident :dpvo-pd/WorkHistory,
   :dcterms/created #inst "2019-06-04T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Fajar Ekaputra"}
                      {:rdf/value "Elmar Kiesling; Harshvardhan J. Pandit"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Information about work history in a professional context"},
   :dcterms/source
   {:xsd/anyURI
    "https://enterprivacy.com/wp-content/uploads/2018/09/Categories-of-Personal-Information.pdf"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Work History"},
   :rdfs/subClassOf :dpvo-pd/Professional,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def urn:uuid:c8cbf3d6-42f3-5f10-bd97-1e42ae95ab63
  {:dcterms/abstract
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
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Axel Polleres"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "DPV-PD is an extension to the Data Privacy Vocabulary that provides additional terms related to Personal Data categories."},
   :dcterms/license {:xsd/anyURI
                     "https://www.w3.org/Consortium/Legal/2015/doc-license"},
   :dcterms/modified #inst "2022-12-05T00:00:00.000-00:00",
   :dcterms/source {:xsd/anyURI "https://www.w3.org/community/dpvcg/"},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "DPV-PD: Personal Data Extension for DPV"},
   :owl/imports {:xsd/anyURI "https://w3id.org/dpv/dpv-owl"},
   :owl/versionInfo "1",
   :rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "dpvo-pd",
   :vann/preferredNamespaceUri "https://w3id.org/dpv/dpv-owl/dpv-pd#",
   :xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-pd"})