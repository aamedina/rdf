(ns net.wikipunk.rdf.dpvo-tech
  ^{:base       "https://w3id.org/dpv/dpv-owl/dpv-tech#",
    :namespaces {"dcterms"   "http://purl.org/dc/terms/",
                 "dpvo"      "https://w3id.org/dpv/dpv-owl#",
                 "dpvo-tech" "https://w3id.org/dpv/dpv-owl/dpv-tech#",
                 "owl"       "http://www.w3.org/2002/07/owl#",
                 "rdf"       "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs"      "http://www.w3.org/2000/01/rdf-schema#",
                 "vann"      "http://purl.org/vocab/vann/",
                 "vs"        "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                 "xsd"       "http://www.w3.org/2001/XMLSchema#"},
    :prefix     "dpvo-tech",
    :source     "net/wikipunk/ext/dpv-owl/dpv-tech/dpv-tech.ttl"}
  {:dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "DPVO-TECH is an extension to the Data Privacy Vocabulary (OWL) that provides additional terms related to Technologies."},
   :dcterms/contributor #{"Georg P Krog" "Harshvardhan J. Pandit" "Julian Flake"
                          "Paul Ryan"},
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "DPVO-TECH is an extension to the Data Privacy Vocabulary (OWL) that provides additional terms related to Technologies."},
   :dcterms/license {:xsd/anyURI
                     "https://www.w3.org/Consortium/Legal/2015/doc-license"},
   :dcterms/modified #inst "2022-10-06T00:00:00.000-00:00",
   :dcterms/source {:xsd/anyURI "https://www.w3.org/community/dpvcg/"},
   :dcterms/title
   {:rdf/language "en",
    :rdf/value
    "DPVO-TECH: Extension providing Technology concepts for DPV (OWL)"},
   :owl/imports {:xsd/anyURI "https://w3id.org/dpv/dpv-owl"},
   :owl/versionInfo "0.8.2",
   :rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "dpvo-tech",
   :vann/preferredNamespaceUri "https://w3id.org/dpv/dpv-owl/dpv-tech#",
   :xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech"})

(def Algorithmic
  {:db/ident            :dpvo-tech/Algorithmic,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Technology provided as an algorithm or method"},
   :rdf/type            #{:dpvo-tech/TechnologyProvisionMethod
                          :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Algorithmic"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Application
  {:db/ident            :dpvo-tech/Application,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "A computing or digital program"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Application"},
   :rdfs/subClassOf     :dpvo-tech/OperationalTechnology,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Bluetooth
  {:db/ident            :dpvo-tech/Bluetooth,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Technology utilising bluetooth communication"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Bluetooth"},
   :rdfs/subClassOf     :dpvo-tech/Networking,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CellularNetwork
  {:db/ident :dpvo-tech/CellularNetwork,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Technology utilising cellular networking communication"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cellular Network"},
   :rdfs/subClassOf :dpvo-tech/Networking,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def CommunicationMechanism
  {:db/ident :dpvo-tech/CommunicationMechanism,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Communication mechanism used or provided by Technologoy"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Communication Mechanism"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Component
  {:db/ident            :dpvo-tech/Component,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Technology provided as a component"},
   :rdf/type            #{:dpvo-tech/TechnologyProvisionMethod
                          :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Component"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Cookie
  {:db/ident            :dpvo-tech/Cookie,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "A HTTP or web or internet cookie"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Cookie"},
   :rdfs/subClassOf     :dpvo-tech/DataStorageTechnology,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def CovertSurveillanceTechnology
  {:db/ident :dpvo-tech/CovertSurveillanceTechnology,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Surveillance that is covert i.e. invisible or non-apparent or implicit"},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For example, a web resource that performs tracking in the background"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Covert SurveillanceTechnology"},
   :rdfs/subClassOf :dpvo-tech/SurveillanceTechnology,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DataCopyingTechnology
  {:db/ident            :dpvo-tech/DataCopyingTechnology,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Technology related to copying data"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Data Copying Technology"},
   :rdfs/subClassOf     :dpvo-tech/DataTechnology,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DataDisclosureTechnology
  {:db/ident            :dpvo-tech/DataDisclosureTechnology,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Technology related to disclosing data"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Data Disclosure Technology"},
   :rdfs/subClassOf     :dpvo-tech/DataTechnology,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DataManagementTechnology
  {:db/ident            :dpvo-tech/DataManagementTechnology,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Technology related to management of data"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Data Management Technology"},
   :rdfs/subClassOf     #{:dpvo-tech/DataTechnology
                          :dpvo-tech/ManagementTechnology},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DataObtainingTechnology
  {:db/ident            :dpvo-tech/DataObtainingTechnology,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Technology related to obtain data"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Data Obtaining Technology"},
   :rdfs/subClassOf     :dpvo-tech/DataTechnology,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DataOrganisingTechnology
  {:db/ident            :dpvo-tech/DataOrganisingTechnology,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Technology realted to organising data"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Data Organising Technology"},
   :rdfs/subClassOf     :dpvo-tech/DataTechnology,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DataRemovalTechnology
  {:db/ident            :dpvo-tech/DataRemovalTechnology,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Technology related to removing data"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Data Removal Technology"},
   :rdfs/subClassOf     :dpvo-tech/DataTechnology,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DataSecurityTechnology
  {:db/ident            :dpvo-tech/DataSecurityTechnology,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Technology related to security of data"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Data Security Technology"},
   :rdfs/subClassOf     #{:dpvo-tech/DataTechnology
                          :dpvo-tech/SecurityTechnology},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DataStorageTechnology
  {:db/ident            :dpvo-tech/DataStorageTechnology,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Technology related to storing data"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Data Storage Technology"},
   :rdfs/subClassOf     :dpvo-tech/DataTechnology,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DataTechnology
  {:db/ident            :dpvo-tech/DataTechnology,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Technology that uses or interacts with data"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Data Technology"},
   :rdfs/subClassOf     :dpvo/Technology,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DataTransferTechnology
  {:db/ident            :dpvo-tech/DataTransferTechnology,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Technology related to transfering data"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Data Transfer Technology"},
   :rdfs/subClassOf     :dpvo-tech/DataTechnology,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DataTransformationTechnology
  {:db/ident            :dpvo-tech/DataTransformationTechnology,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Technology related to transforming data"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Data Transformation Technology"},
   :rdfs/subClassOf     :dpvo-tech/DataTechnology,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def DataUsageTechnology
  {:db/ident            :dpvo-tech/DataUsageTechnology,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Technology related to using data"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Data Usage Technology"},
   :rdfs/subClassOf     :dpvo-tech/DataTechnology,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Database
  {:db/ident :dpvo-tech/Database,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A database, database management system (DBMS), or application database"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Database"},
   :rdfs/subClassOf :dpvo-tech/DataStorageTechnology,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def DetectionSecurityTechnology
  {:db/ident :dpvo-tech/DetectionSecurityTechnology,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Technology related to detection of vulnerabilities, threats, and exploitations"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Detection Security Technology"},
   :rdfs/subClassOf :dpvo-tech/SecurityTechnology,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FileSystem
  {:db/ident :dpvo-tech/FileSystem,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A data storage and retrieval interface provided by an operating system"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "File System"},
   :rdfs/subClassOf :dpvo-tech/DataStorageTechnology,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def FixedUse
  {:db/ident            :dpvo-tech/FixedUse,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Technology that can be used a fixed numner of times"},
   :rdf/type            #{:dpvo-tech/TechnologyProvisionMethod
                          :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Fixed Use"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def GPS
  {:db/ident            :dpvo-tech/GPS,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Technology utilising GPS communication"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "GPS"},
   :rdfs/subClassOf     :dpvo-tech/CommunicationMechanism,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Goods
  {:db/ident            :dpvo-tech/Goods,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Technology provided or used as goods"},
   :rdf/type            #{:dpvo-tech/TechnologyProvisionMethod
                          :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Goods"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def IdentityManagementTechnology
  {:db/ident :dpvo-tech/IdentityManagementTechnology,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Technologies providing identity provision, verification, management, and governance"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Identity Management Technology"},
   :rdfs/subClassOf #{:dpvo-tech/IdentityTechnology
                      :dpvo-tech/ManagementTechnology},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def IdentityTechnology
  {:db/ident            :dpvo-tech/IdentityTechnology,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Technology related to identity or identifiers"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Identity Technology"},
   :rdfs/subClassOf     :dpvo/Technology,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def IdentityWallet
  {:db/ident :dpvo-tech/IdentityWallet,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "product and service that allows the user to store identity data, credentials and attributes linked to her/his identity, to provide them to relying parties on request and to use them for authentication, online and offline, and to create qualified electronic signatures and seals"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Identity Wallet"},
   :rdfs/subClassOf #{:dpvo-tech/DataStorageTechnology
                      :dpvo-tech/IdentityManagementTechnology},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Internet
  {:db/ident            :dpvo-tech/Internet,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Technology utilising internet communication"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Internet"},
   :rdfs/subClassOf     :dpvo-tech/Networking,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def LocalNetwork
  {:db/ident            :dpvo-tech/LocalNetwork,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Technology utilising local networking communication"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Local Network"},
   :rdfs/subClassOf     :dpvo-tech/Networking,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def ManagementTechnology
  {:db/ident            :dpvo-tech/ManagementTechnology,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Technology that enables or provides management"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Management Technology"},
   :rdfs/subClassOf     :dpvo/Technology,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def MitigationSecurityTechnology
  {:db/ident :dpvo-tech/MitigationSecurityTechnology,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Technology related to mitigation of vulnerabilities, threats, exploitations"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mitigation Security Technology"},
   :rdfs/subClassOf :dpvo-tech/SecurityTechnology,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def MonitoringSecurityTechnology
  {:db/ident :dpvo-tech/MonitoringSecurityTechnology,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Technology related to monitoring of vulnerabilities, threats, exploitations"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Monitoring Security Technology"},
   :rdfs/subClassOf :dpvo-tech/SecurityTechnology,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Networking
  {:db/ident            :dpvo-tech/Networking,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Technology utilising networking communication"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Networking"},
   :rdfs/subClassOf     :dpvo-tech/CommunicationMechanism,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def OperationDevice
  {:db/ident :dpvo-tech/OperationDevice,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Technology that acts as an equipment or mechanism for operations"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Operation Device"},
   :rdfs/subClassOf :dpvo-tech/OperationalTechnology,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OperationEnvironment
  {:db/ident :dpvo-tech/OperationEnvironment,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Technology that provides an environment for operations to be executed"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Operation Environment"},
   :rdfs/subClassOf :dpvo-tech/OperationalTechnology,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OperationManagement
  {:db/ident            :dpvo-tech/OperationManagement,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Technology that manages operations"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Operation Management"},
   :rdfs/subClassOf     :dpvo-tech/OperationalTechnology,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def OperationalTechnology
  {:db/ident :dpvo-tech/OperationalTechnology,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Technology that enables or performs or executes operations and processes"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Operational Technology"},
   :rdfs/subClassOf :dpvo/Technology,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def OvertSurveillanceTechnology
  {:db/ident :dpvo-tech/OvertSurveillanceTechnology,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Surveillance that is overt i.e. visible or apparent or explicit"},
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "For example, a CCTV with a notice"},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Overt Surveillance Technology"},
   :rdfs/subClassOf :dpvo-tech/SurveillanceTechnology,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PET
  {:db/ident :dpvo-tech/PET,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Privacy Enhancing Technologies (PETs) that provide minimisation or security related to data and privacy"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "PET (Privacy Enhancing Technology)"},
   :rdfs/subClassOf :dpvo-tech/SecurityTechnology,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PersonalInformationManagementSystem
  {:db/ident :dpvo-tech/PersonalInformationManagementSystem,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "A PIMS is a system that helps to give individuals more control over their personal data by managing their personal data in secure, on-premises or online storage systems and sharing it when and with whomever they choose"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Personal Information Management System"},
   :rdfs/subClassOf :dpvo-tech/DataManagementTechnology,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def PreventionSecurityTechnology
  {:db/ident :dpvo-tech/PreventionSecurityTechnology,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator #{{:rdf/value "Harshvardhan J. Pandit"}
                      {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                      {:rdf/value "Julian Flake"}},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Technology related to prevention of vulnerabilities, threats, exploitations"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Prevention Security Technology"},
   :rdfs/subClassOf :dpvo-tech/SecurityTechnology,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Product
  {:db/ident            :dpvo-tech/Product,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value "Technology that is provided as a product"},
   :rdf/type            #{:dpvo-tech/TechnologyProvisionMethod
                          :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Product"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def SecurityManagementTechnology
  {:db/ident            :dpvo-tech/SecurityManagementTechnology,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     #{{:rdf/value "Harshvardhan J. Pandit"}
                          {:rdf/value "Georg P Krog"} {:rdf/value "Paul Ryan"}
                          {:rdf/value "Julian Flake"}},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Technology related to management of security"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Security Management Technology"},
   :rdfs/subClassOf     #{:dpvo-tech/SecurityTechnology
                          :dpvo-tech/ManagementTechnology},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def SecurityTechnology
  {:db/ident            :dpvo-tech/SecurityTechnology,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Technology that enables or provides security"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Security Technology"},
   :rdfs/subClassOf     :dpvo/Technology,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def Service
  {:db/ident            :dpvo-tech/Service,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Technology provided or used as service(s)"},
   :rdf/type            #{:dpvo-tech/TechnologyProvisionMethod
                          :owl/NamedIndividual},
   :rdfs/comment        {:rdf/language "en",
                         :rdf/value
                         "Removed plural suffix for consistency in terms"},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Service"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "changed"}})

(def SmartphoneApplication
  {:db/ident :dpvo-tech/SmartphoneApplication,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "A computing or digital program on a smartphone device"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Smartphone Application"},
   :rdfs/subClassOf :dpvo-tech/Application,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def Subscription
  {:db/ident :dpvo-tech/Subscription,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Technology that is provided or used as a periodic subscription"},
   :rdf/type #{:dpvo-tech/TechnologyProvisionMethod :owl/NamedIndividual},
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Subscription"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SurveillanceTechnology
  {:db/ident :dpvo-tech/SurveillanceTechnology,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Technology related to surveillance of individuals or people"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Surveillance Technology"},
   :rdfs/subClassOf :dpvo/Technology,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def SystemClass
  {:db/ident            :dpvo-tech/System,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Technology provided as a system"},
   :rdf/type            #{:dpvo-tech/TechnologyProvisionMethod
                          :owl/NamedIndividual},
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "System"},
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def TechnologyActor
  {:db/ident :dpvo-tech/TechnologyActor,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Actors and Entities involved in provision, use, and management of Technology"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Technology Actor"},
   :rdfs/subClassOf :dpvo/Entity,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TechnologyDeveloper
  {:db/ident            :dpvo-tech/TechnologyDeveloper,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Actor that develops Technology"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Technology Developer"},
   :rdfs/subClassOf     :dpvo-tech/TechnologyActor,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def TechnologyProvider
  {:db/ident            :dpvo-tech/TechnologyProvider,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Actor that provides Technology"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Technology Provider"},
   :rdfs/subClassOf     :dpvo-tech/TechnologyActor,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def TechnologyProvisionMethod
  {:db/ident :dpvo-tech/TechnologyProvisionMethod,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Method associated with provision or use of technology"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Technology Provision Method"},
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TechnologyReadinessLevel
  {:db/ident :dpvo-tech/TechnologyReadinessLevel,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Indication of maturity of Technology (ISO 16290:2013)"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Technology Readiness Level"},
   :rdfs/subClassOf :dpvo/Technology,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def TechnologySubject
  {:db/ident            :dpvo-tech/TechnologySubject,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Actor that is subject of use of Technology"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Technology Subject"},
   :rdfs/subClassOf     :dpvo-tech/TechnologyActor,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def TechnologyUsageLocation
  {:db/ident            :dpvo-tech/TechnologyUsageLocation,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Location for where technology is provided or used"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Technology Usage Location"},
   :rdfs/subClassOf     :dpvo/Location,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def TechnologyUser
  {:db/ident            :dpvo-tech/TechnologyUser,
   :dcterms/created     #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Actor that uses Technologoy"},
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "Technology User"},
   :rdfs/subClassOf     :dpvo-tech/TechnologyActor,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def WiFi
  {:db/ident :dpvo-tech/WiFi,
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value "Technology utilising wifi wireless networking communication"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "WiFi"},
   :rdfs/subClassOf :dpvo-tech/Networking,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "accepted"}})

(def hasCommunicationMechanism
  {:db/ident :dpvo-tech/hasCommunicationMechanism,
   :dcterms/created #inst "2022-07-02T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "Indicates communication mechanisms used or provided by technology"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :dpvo/Technology,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has communication mechanism"},
   :rdfs/range :dpvo-tech/CommunicationMechanism,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def hasDeveloper
  {:db/ident            :dpvo-tech/hasDeveloper,
   :dcterms/created     #inst "2022-07-02T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates technology developer"},
   :dcterms/modified    #inst "2022-10-21T00:00:00.000-00:00",
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :dpvo/Technology,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has developer"},
   :rdfs/range          :dpvo-tech/TechnologyDeveloper,
   :rdfs/subPropertyOf  :dpvo-tech/hasTechnologyActor,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "changed"}})

(def hasProvider
  {:db/ident            :dpvo-tech/hasProvider,
   :dcterms/created     #inst "2022-07-02T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates technology provider"},
   :dcterms/modified    #inst "2022-10-21T00:00:00.000-00:00",
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :dpvo/Technology,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has provider"},
   :rdfs/range          :dpvo-tech/TechnologyProvider,
   :rdfs/subPropertyOf  :dpvo-tech/hasTechnologyActor,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "changed"}})

(def hasProvisionMethod
  {:db/ident :dpvo-tech/hasProvisionMethod,
   :dcterms/created #inst "2022-07-02T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value    "Specifies the provision or usage method of technology"},
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain :dpvo/Technology,
   :rdfs/isDefinedBy {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has provision method"},
   :rdfs/range :dpvo-tech/TechnologyProvisionMethod,
   :vs/term_status {:rdf/language "en",
                    :rdf/value    "changed"}})

(def hasSubject
  {:db/ident            :dpvo-tech/hasSubject,
   :dcterms/created     #inst "2022-07-02T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates technology subject"},
   :dcterms/modified    #inst "2022-10-21T00:00:00.000-00:00",
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :dpvo/Technology,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has subject"},
   :rdfs/range          :dpvo-tech/TechnologySubject,
   :rdfs/subPropertyOf  :dpvo-tech/hasTechnologyActor,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "changed"}})

(def hasTRL
  {:db/ident            :dpvo-tech/hasTRL,
   :dcterms/created     #inst "2022-07-02T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates technology maturity level"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :dpvo/Technology,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has TRL"},
   :rdfs/range          :dpvo-tech/TechnologyReadinessLevel,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "changed"}})

(def hasTechnologyActor
  {:db/ident            :dpvo-tech/hasTechnologyActor,
   :dcterms/created     #inst "2022-10-21T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value
                         "Indicates an actor associated with technology"},
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :dpvo/Technology,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has technology actor"},
   :rdfs/range          :dpvo-tech/TechnologyActor,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "accepted"}})

(def hasUser
  {:db/ident            :dpvo-tech/hasUser,
   :dcterms/created     #inst "2022-07-02T00:00:00.000-00:00",
   :dcterms/creator     {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description {:rdf/language "en",
                         :rdf/value    "Indicates technology user"},
   :dcterms/modified    #inst "2022-10-21T00:00:00.000-00:00",
   :rdf/type            #{:owl/ObjectProperty :rdf/Property},
   :rdfs/domain         :dpvo/Technology,
   :rdfs/isDefinedBy    {:xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          {:rdf/language "en",
                         :rdf/value    "has user"},
   :rdfs/range          :dpvo-tech/TechnologyUser,
   :rdfs/subPropertyOf  :dpvo-tech/hasTechnologyActor,
   :vs/term_status      {:rdf/language "en",
                         :rdf/value    "changed"}})

(def urn:uuid:89192716-f43b-57dd-b870-9c326ba21cd1
  {:dcterms/abstract
   {:rdf/language "en",
    :rdf/value
    "DPVO-TECH is an extension to the Data Privacy Vocabulary (OWL) that provides additional terms related to Technologies."},
   :dcterms/contributor #{"Georg P Krog" "Harshvardhan J. Pandit" "Julian Flake"
                          "Paul Ryan"},
   :dcterms/created #inst "2022-06-15T00:00:00.000-00:00",
   :dcterms/creator {:rdf/value "Harshvardhan J. Pandit"},
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "DPVO-TECH is an extension to the Data Privacy Vocabulary (OWL) that provides additional terms related to Technologies."},
   :dcterms/license {:xsd/anyURI
                     "https://www.w3.org/Consortium/Legal/2015/doc-license"},
   :dcterms/modified #inst "2022-10-06T00:00:00.000-00:00",
   :dcterms/source {:xsd/anyURI "https://www.w3.org/community/dpvcg/"},
   :dcterms/title
   {:rdf/language "en",
    :rdf/value
    "DPVO-TECH: Extension providing Technology concepts for DPV (OWL)"},
   :owl/imports {:xsd/anyURI "https://w3id.org/dpv/dpv-owl"},
   :owl/versionInfo "0.8.2",
   :rdf/type :owl/Ontology,
   :vann/preferredNamespacePrefix "dpvo-tech",
   :vann/preferredNamespaceUri "https://w3id.org/dpv/dpv-owl/dpv-tech#",
   :xsd/anyURI "https://w3id.org/dpv/dpv-owl/dpv-tech"})