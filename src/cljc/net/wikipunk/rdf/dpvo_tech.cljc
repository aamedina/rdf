(ns net.wikipunk.rdf.dpvo-tech
  "DPVO-TECH is an extension to the Data Privacy Vocabulary (OWL) that provides additional terms related to Technologies."
  {:dcat/downloadURL "resources/dpv-owl/dpv-tech/dpv-tech.ttl",
   :dcterms/abstract
   #rdf/langString
    "DPVO-TECH is an extension to the Data Privacy Vocabulary (OWL) that provides additional terms related to Technologies.@en",
   :dcterms/contributor
   ["Georg P Krog" "Paul Ryan" "Harshvardhan J. Pandit" "Julian Flake"],
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "DPVO-TECH is an extension to the Data Privacy Vocabulary (OWL) that provides additional terms related to Technologies.@en",
   :dcterms/license {:rdfa/uri
                     "https://www.w3.org/Consortium/Legal/2015/doc-license"},
   :dcterms/modified #xsd/date #inst "2022-10-06T00:00:00.000-04:00",
   :dcterms/source {:rdfa/uri "https://www.w3.org/community/dpvcg/"},
   :dcterms/title
   #rdf/langString
    "DPVO-TECH: Extension providing Technology concepts for DPV (OWL)@en",
   :owl/imports {:rdfa/uri "https://w3id.org/dpv/dpv-owl"},
   :owl/versionInfo "0.8.2",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "dpvo" "https://w3id.org/dpv/dpv-owl#",
                       "dpvo-tech" "https://w3id.org/dpv/dpv-owl/dpv-tech#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vann" "http://purl.org/vocab/vann/",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "dpvo-tech",
   :rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech",
   :vann/preferredNamespacePrefix "dpvo-tech",
   :vann/preferredNamespaceUri "https://w3id.org/dpv/dpv-owl/dpv-tech#"})

(def Algorithmic
  "Technology provided as an algorithm or method"
  {:db/ident            :dpvo-tech/Algorithmic,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Technology provided as an algorithm or method@en",
   :rdf/type            [:dpvo-tech/TechnologyProvisionMethod
                         :owl/NamedIndividual],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Algorithmic@en",
   :vs/term_status      #rdf/langString "accepted@en"})

(def Application
  "A computing or digital program"
  {:db/ident            :dpvo-tech/Application,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "A computing or digital program@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Application@en",
   :rdfs/subClassOf     [:dpvo-tech/OperationalTechnology :dpvo/Technology],
   :vs/term_status      #rdf/langString "accepted@en"})

(def Bluetooth
  "Technology utilising bluetooth communication"
  {:db/ident            :dpvo-tech/Bluetooth,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Technology utilising bluetooth communication@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Bluetooth@en",
   :rdfs/subClassOf     [:dpvo-tech/Networking
                         :dpvo-tech/CommunicationMechanism],
   :vs/term_status      #rdf/langString "accepted@en"})

(def CellularNetwork
  "Technology utilising cellular networking communication"
  {:db/ident :dpvo-tech/CellularNetwork,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Technology utilising cellular networking communication@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "Cellular Network@en",
   :rdfs/subClassOf [:dpvo-tech/Networking :dpvo-tech/CommunicationMechanism],
   :vs/term_status #rdf/langString "accepted@en"})

(def CommunicationMechanism
  "Communication mechanism used or provided by Technologoy"
  {:db/ident :dpvo-tech/CommunicationMechanism,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Communication mechanism used or provided by Technologoy@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "Communication Mechanism@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def Component
  "Technology provided as a component"
  {:db/ident            :dpvo-tech/Component,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Technology provided as a component@en",
   :rdf/type            [:dpvo-tech/TechnologyProvisionMethod
                         :owl/NamedIndividual],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Component@en",
   :vs/term_status      #rdf/langString "accepted@en"})

(def Cookie
  "A HTTP or web or internet cookie"
  {:db/ident            :dpvo-tech/Cookie,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "A HTTP or web or internet cookie@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Cookie@en",
   :rdfs/subClassOf     [:dpvo-tech/DataStorageTechnology
                         :dpvo-tech/DataTechnology
                         :dpvo/Technology],
   :vs/term_status      #rdf/langString "accepted@en"})

(def CovertSurveillanceTechnology
  "Surveillance that is covert i.e. invisible or non-apparent or implicit"
  {:db/ident :dpvo-tech/CovertSurveillanceTechnology,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Surveillance that is covert i.e. invisible or non-apparent or implicit@en",
   :rdf/type :owl/Class,
   :rdfs/comment
   #rdf/langString
    "For example, a web resource that performs tracking in the background@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "Covert SurveillanceTechnology@en",
   :rdfs/subClassOf [:dpvo-tech/SurveillanceTechnology :dpvo/Technology],
   :vs/term_status #rdf/langString "accepted@en"})

(def DataCopyingTechnology
  "Technology related to copying data"
  {:db/ident            :dpvo-tech/DataCopyingTechnology,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Technology related to copying data@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Data Copying Technology@en",
   :rdfs/subClassOf     [:dpvo-tech/DataTechnology :dpvo/Technology],
   :vs/term_status      #rdf/langString "accepted@en"})

(def DataDisclosureTechnology
  "Technology related to disclosing data"
  {:db/ident            :dpvo-tech/DataDisclosureTechnology,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Technology related to disclosing data@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Data Disclosure Technology@en",
   :rdfs/subClassOf     [:dpvo-tech/DataTechnology :dpvo/Technology],
   :vs/term_status      #rdf/langString "accepted@en"})

(def DataManagementTechnology
  "Technology related to management of data"
  {:db/ident            :dpvo-tech/DataManagementTechnology,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Technology related to management of data@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Data Management Technology@en",
   :rdfs/subClassOf     [:dpvo-tech/ManagementTechnology
                         :dpvo-tech/DataTechnology
                         :dpvo/Technology],
   :vs/term_status      #rdf/langString "accepted@en"})

(def DataObtainingTechnology
  "Technology related to obtain data"
  {:db/ident            :dpvo-tech/DataObtainingTechnology,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Technology related to obtain data@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Data Obtaining Technology@en",
   :rdfs/subClassOf     [:dpvo-tech/DataTechnology :dpvo/Technology],
   :vs/term_status      #rdf/langString "accepted@en"})

(def DataOrganisingTechnology
  "Technology realted to organising data"
  {:db/ident            :dpvo-tech/DataOrganisingTechnology,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Technology realted to organising data@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Data Organising Technology@en",
   :rdfs/subClassOf     [:dpvo-tech/DataTechnology :dpvo/Technology],
   :vs/term_status      #rdf/langString "accepted@en"})

(def DataRemovalTechnology
  "Technology related to removing data"
  {:db/ident            :dpvo-tech/DataRemovalTechnology,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Technology related to removing data@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Data Removal Technology@en",
   :rdfs/subClassOf     [:dpvo-tech/DataTechnology :dpvo/Technology],
   :vs/term_status      #rdf/langString "accepted@en"})

(def DataSecurityTechnology
  "Technology related to security of data"
  {:db/ident            :dpvo-tech/DataSecurityTechnology,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Technology related to security of data@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Data Security Technology@en",
   :rdfs/subClassOf     [:dpvo-tech/SecurityTechnology
                         :dpvo-tech/DataTechnology
                         :dpvo/Technology],
   :vs/term_status      #rdf/langString "accepted@en"})

(def DataStorageTechnology
  "Technology related to storing data"
  {:db/ident            :dpvo-tech/DataStorageTechnology,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Technology related to storing data@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Data Storage Technology@en",
   :rdfs/subClassOf     [:dpvo-tech/DataTechnology :dpvo/Technology],
   :vs/term_status      #rdf/langString "accepted@en"})

(def DataTechnology
  "Technology that uses or interacts with data"
  {:db/ident            :dpvo-tech/DataTechnology,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Technology that uses or interacts with data@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Data Technology@en",
   :rdfs/subClassOf     :dpvo/Technology,
   :vs/term_status      #rdf/langString "accepted@en"})

(def DataTransferTechnology
  "Technology related to transfering data"
  {:db/ident            :dpvo-tech/DataTransferTechnology,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Technology related to transfering data@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Data Transfer Technology@en",
   :rdfs/subClassOf     [:dpvo-tech/DataTechnology :dpvo/Technology],
   :vs/term_status      #rdf/langString "accepted@en"})

(def DataTransformationTechnology
  "Technology related to transforming data"
  {:db/ident            :dpvo-tech/DataTransformationTechnology,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Technology related to transforming data@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Data Transformation Technology@en",
   :rdfs/subClassOf     [:dpvo-tech/DataTechnology :dpvo/Technology],
   :vs/term_status      #rdf/langString "accepted@en"})

(def DataUsageTechnology
  "Technology related to using data"
  {:db/ident            :dpvo-tech/DataUsageTechnology,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Technology related to using data@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Data Usage Technology@en",
   :rdfs/subClassOf     [:dpvo-tech/DataTechnology :dpvo/Technology],
   :vs/term_status      #rdf/langString "accepted@en"})

(def Database
  "A database, database management system (DBMS), or application database"
  {:db/ident :dpvo-tech/Database,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "A database, database management system (DBMS), or application database@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "Database@en",
   :rdfs/subClassOf [:dpvo-tech/DataStorageTechnology
                     :dpvo-tech/DataTechnology
                     :dpvo/Technology],
   :vs/term_status #rdf/langString "accepted@en"})

(def DetectionSecurityTechnology
  "Technology related to detection of vulnerabilities, threats, and exploitations"
  {:db/ident :dpvo-tech/DetectionSecurityTechnology,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString
    "Technology related to detection of vulnerabilities, threats, and exploitations@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "Detection Security Technology@en",
   :rdfs/subClassOf [:dpvo-tech/SecurityTechnology :dpvo/Technology],
   :vs/term_status #rdf/langString "accepted@en"})

(def FileSystem
  "A data storage and retrieval interface provided by an operating system"
  {:db/ident :dpvo-tech/FileSystem,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "A data storage and retrieval interface provided by an operating system@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "File System@en",
   :rdfs/subClassOf [:dpvo-tech/DataStorageTechnology
                     :dpvo-tech/DataTechnology
                     :dpvo/Technology],
   :vs/term_status #rdf/langString "accepted@en"})

(def FixedUse
  "Technology that can be used a fixed numner of times"
  {:db/ident :dpvo-tech/FixedUse,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Technology that can be used a fixed numner of times@en",
   :rdf/type [:dpvo-tech/TechnologyProvisionMethod :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "Fixed Use@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def GPS
  "Technology utilising GPS communication"
  {:db/ident            :dpvo-tech/GPS,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Technology utilising GPS communication@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "GPS@en",
   :rdfs/subClassOf     :dpvo-tech/CommunicationMechanism,
   :vs/term_status      #rdf/langString "accepted@en"})

(def Goods
  "Technology provided or used as goods"
  {:db/ident            :dpvo-tech/Goods,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Technology provided or used as goods@en",
   :rdf/type            [:dpvo-tech/TechnologyProvisionMethod
                         :owl/NamedIndividual],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Goods@en",
   :vs/term_status      #rdf/langString "accepted@en"})

(def IdentityManagementTechnology
  "Technologies providing identity provision, verification, management, and governance"
  {:db/ident :dpvo-tech/IdentityManagementTechnology,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Technologies providing identity provision, verification, management, and governance@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "Identity Management Technology@en",
   :rdfs/subClassOf [:dpvo-tech/ManagementTechnology
                     :dpvo-tech/IdentityTechnology
                     :dpvo/Technology],
   :vs/term_status #rdf/langString "accepted@en"})

(def IdentityTechnology
  "Technology related to identity or identifiers"
  {:db/ident            :dpvo-tech/IdentityTechnology,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Technology related to identity or identifiers@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Identity Technology@en",
   :rdfs/subClassOf     :dpvo/Technology,
   :vs/term_status      #rdf/langString "accepted@en"})

(def IdentityWallet
  "product and service that allows the user to store identity data, credentials and attributes linked to her/his identity, to provide them to relying parties on request and to use them for authentication, online and offline, and to create qualified electronic signatures and seals"
  {:db/ident :dpvo-tech/IdentityWallet,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "product and service that allows the user to store identity data, credentials and attributes linked to her/his identity, to provide them to relying parties on request and to use them for authentication, online and offline, and to create qualified electronic signatures and seals@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "Identity Wallet@en",
   :rdfs/subClassOf [:dpvo-tech/IdentityManagementTechnology
                     :dpvo-tech/DataStorageTechnology
                     :dpvo-tech/IdentityTechnology
                     :dpvo-tech/ManagementTechnology
                     :dpvo-tech/DataTechnology
                     :dpvo/Technology],
   :vs/term_status #rdf/langString "accepted@en"})

(def Internet
  "Technology utilising internet communication"
  {:db/ident            :dpvo-tech/Internet,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Technology utilising internet communication@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Internet@en",
   :rdfs/subClassOf     [:dpvo-tech/Networking
                         :dpvo-tech/CommunicationMechanism],
   :vs/term_status      #rdf/langString "accepted@en"})

(def LocalNetwork
  "Technology utilising local networking communication"
  {:db/ident :dpvo-tech/LocalNetwork,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Technology utilising local networking communication@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "Local Network@en",
   :rdfs/subClassOf [:dpvo-tech/Networking :dpvo-tech/CommunicationMechanism],
   :vs/term_status #rdf/langString "accepted@en"})

(def ManagementTechnology
  "Technology that enables or provides management"
  {:db/ident            :dpvo-tech/ManagementTechnology,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Technology that enables or provides management@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Management Technology@en",
   :rdfs/subClassOf     :dpvo/Technology,
   :vs/term_status      #rdf/langString "accepted@en"})

(def MitigationSecurityTechnology
  "Technology related to mitigation of vulnerabilities, threats, exploitations"
  {:db/ident :dpvo-tech/MitigationSecurityTechnology,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Technology related to mitigation of vulnerabilities, threats, exploitations@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "Mitigation Security Technology@en",
   :rdfs/subClassOf [:dpvo-tech/SecurityTechnology :dpvo/Technology],
   :vs/term_status #rdf/langString "accepted@en"})

(def MonitoringSecurityTechnology
  "Technology related to monitoring of vulnerabilities, threats, exploitations"
  {:db/ident :dpvo-tech/MonitoringSecurityTechnology,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Julian Flake"}
                     {:xsd/string "Georg P Krog"}],
   :dcterms/description
   #rdf/langString
    "Technology related to monitoring of vulnerabilities, threats, exploitations@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "Monitoring Security Technology@en",
   :rdfs/subClassOf [:dpvo-tech/SecurityTechnology :dpvo/Technology],
   :vs/term_status #rdf/langString "accepted@en"})

(def Networking
  "Technology utilising networking communication"
  {:db/ident            :dpvo-tech/Networking,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Technology utilising networking communication@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Networking@en",
   :rdfs/subClassOf     :dpvo-tech/CommunicationMechanism,
   :vs/term_status      #rdf/langString "accepted@en"})

(def OperationDevice
  "Technology that acts as an equipment or mechanism for operations"
  {:db/ident :dpvo-tech/OperationDevice,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Technology that acts as an equipment or mechanism for operations@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "Operation Device@en",
   :rdfs/subClassOf [:dpvo-tech/OperationalTechnology :dpvo/Technology],
   :vs/term_status #rdf/langString "accepted@en"})

(def OperationEnvironment
  "Technology that provides an environment for operations to be executed"
  {:db/ident :dpvo-tech/OperationEnvironment,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Technology that provides an environment for operations to be executed@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "Operation Environment@en",
   :rdfs/subClassOf [:dpvo-tech/OperationalTechnology :dpvo/Technology],
   :vs/term_status #rdf/langString "accepted@en"})

(def OperationManagement
  "Technology that manages operations"
  {:db/ident            :dpvo-tech/OperationManagement,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Technology that manages operations@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Operation Management@en",
   :rdfs/subClassOf     [:dpvo-tech/OperationalTechnology :dpvo/Technology],
   :vs/term_status      #rdf/langString "accepted@en"})

(def OperationalTechnology
  "Technology that enables or performs or executes operations and processes"
  {:db/ident :dpvo-tech/OperationalTechnology,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Technology that enables or performs or executes operations and processes@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "Operational Technology@en",
   :rdfs/subClassOf :dpvo/Technology,
   :vs/term_status #rdf/langString "accepted@en"})

(def OvertSurveillanceTechnology
  "Surveillance that is overt i.e. visible or apparent or explicit"
  {:db/ident :dpvo-tech/OvertSurveillanceTechnology,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Surveillance that is overt i.e. visible or apparent or explicit@en",
   :rdf/type :owl/Class,
   :rdfs/comment #rdf/langString "For example, a CCTV with a notice@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "Overt Surveillance Technology@en",
   :rdfs/subClassOf [:dpvo-tech/SurveillanceTechnology :dpvo/Technology],
   :vs/term_status #rdf/langString "accepted@en"})

(def PET
  "Privacy Enhancing Technologies (PETs) that provide minimisation or security related to data and privacy"
  {:db/ident :dpvo-tech/PET,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Paul Ryan"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Julian Flake"}],
   :dcterms/description
   #rdf/langString
    "Privacy Enhancing Technologies (PETs) that provide minimisation or security related to data and privacy@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "PET (Privacy Enhancing Technology)@en",
   :rdfs/subClassOf [:dpvo-tech/SecurityTechnology :dpvo/Technology],
   :vs/term_status #rdf/langString "accepted@en"})

(def PersonalInformationManagementSystem
  "A PIMS is a system that helps to give individuals more control over their personal data by managing their personal data in secure, on-premises or online storage systems and sharing it when and with whomever they choose"
  {:db/ident :dpvo-tech/PersonalInformationManagementSystem,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "A PIMS is a system that helps to give individuals more control over their personal data by managing their personal data in secure, on-premises or online storage systems and sharing it when and with whomever they choose@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "Personal Information Management System@en",
   :rdfs/subClassOf [:dpvo-tech/DataManagementTechnology
                     :dpvo-tech/ManagementTechnology
                     :dpvo-tech/DataTechnology
                     :dpvo/Technology],
   :vs/term_status #rdf/langString "accepted@en"})

(def PreventionSecurityTechnology
  "Technology related to prevention of vulnerabilities, threats, exploitations"
  {:db/ident :dpvo-tech/PreventionSecurityTechnology,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator [{:xsd/string "Julian Flake"}
                     {:xsd/string "Georg P Krog"}
                     {:xsd/string "Harshvardhan J. Pandit"}
                     {:xsd/string "Paul Ryan"}],
   :dcterms/description
   #rdf/langString
    "Technology related to prevention of vulnerabilities, threats, exploitations@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "Prevention Security Technology@en",
   :rdfs/subClassOf [:dpvo-tech/SecurityTechnology :dpvo/Technology],
   :vs/term_status #rdf/langString "accepted@en"})

(def Product
  "Technology that is provided as a product"
  {:db/ident            :dpvo-tech/Product,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Technology that is provided as a product@en",
   :rdf/type            [:dpvo-tech/TechnologyProvisionMethod
                         :owl/NamedIndividual],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Product@en",
   :vs/term_status      #rdf/langString "accepted@en"})

(def SecurityManagementTechnology
  "Technology related to management of security"
  {:db/ident            :dpvo-tech/SecurityManagementTechnology,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     [{:xsd/string "Julian Flake"}
                         {:xsd/string "Paul Ryan"}
                         {:xsd/string "Georg P Krog"}
                         {:xsd/string "Harshvardhan J. Pandit"}],
   :dcterms/description #rdf/langString
                         "Technology related to management of security@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Security Management Technology@en",
   :rdfs/subClassOf     [:dpvo-tech/ManagementTechnology
                         :dpvo-tech/SecurityTechnology
                         :dpvo/Technology],
   :vs/term_status      #rdf/langString "accepted@en"})

(def SecurityTechnology
  "Technology that enables or provides security"
  {:db/ident            :dpvo-tech/SecurityTechnology,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Technology that enables or provides security@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Security Technology@en",
   :rdfs/subClassOf     :dpvo/Technology,
   :vs/term_status      #rdf/langString "accepted@en"})

(def Service
  "Technology provided or used as service(s)"
  {:db/ident            :dpvo-tech/Service,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Technology provided or used as service(s)@en",
   :rdf/type            [:dpvo-tech/TechnologyProvisionMethod
                         :owl/NamedIndividual],
   :rdfs/comment        #rdf/langString
                         "Removed plural suffix for consistency in terms@en",
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Service@en",
   :vs/term_status      #rdf/langString "changed@en"})

(def SmartphoneApplication
  "A computing or digital program on a smartphone device"
  {:db/ident :dpvo-tech/SmartphoneApplication,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "A computing or digital program on a smartphone device@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "Smartphone Application@en",
   :rdfs/subClassOf
   [:dpvo-tech/Application :dpvo-tech/OperationalTechnology :dpvo/Technology],
   :vs/term_status #rdf/langString "accepted@en"})

(def Subscription
  "Technology that is provided or used as a periodic subscription"
  {:db/ident :dpvo-tech/Subscription,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Technology that is provided or used as a periodic subscription@en",
   :rdf/type [:dpvo-tech/TechnologyProvisionMethod :owl/NamedIndividual],
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "Subscription@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def SurveillanceTechnology
  "Technology related to surveillance of individuals or people"
  {:db/ident :dpvo-tech/SurveillanceTechnology,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Technology related to surveillance of individuals or people@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "Surveillance Technology@en",
   :rdfs/subClassOf :dpvo/Technology,
   :vs/term_status #rdf/langString "accepted@en"})

(def SystemClass
  "Technology provided as a system"
  {:db/ident            :dpvo-tech/System,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Technology provided as a system@en",
   :rdf/type            [:dpvo-tech/TechnologyProvisionMethod
                         :owl/NamedIndividual],
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "System@en",
   :vs/term_status      #rdf/langString "accepted@en"})

(def TechnologyActor
  "Actors and Entities involved in provision, use, and management of Technology"
  {:db/ident :dpvo-tech/TechnologyActor,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Actors and Entities involved in provision, use, and management of Technology@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "Technology Actor@en",
   :rdfs/subClassOf :dpvo/Entity,
   :vs/term_status #rdf/langString "accepted@en"})

(def TechnologyDeveloper
  "Actor that develops Technology"
  {:db/ident            :dpvo-tech/TechnologyDeveloper,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Actor that develops Technology@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Technology Developer@en",
   :rdfs/subClassOf     [:dpvo-tech/TechnologyActor :dpvo/Entity],
   :vs/term_status      #rdf/langString "accepted@en"})

(def TechnologyProvider
  "Actor that provides Technology"
  {:db/ident            :dpvo-tech/TechnologyProvider,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Actor that provides Technology@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Technology Provider@en",
   :rdfs/subClassOf     [:dpvo-tech/TechnologyActor :dpvo/Entity],
   :vs/term_status      #rdf/langString "accepted@en"})

(def TechnologyProvisionMethod
  "Method associated with provision or use of technology"
  {:db/ident :dpvo-tech/TechnologyProvisionMethod,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Method associated with provision or use of technology@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "Technology Provision Method@en",
   :vs/term_status #rdf/langString "accepted@en"})

(def TechnologyReadinessLevel
  "Indication of maturity of Technology (ISO 16290:2013)"
  {:db/ident :dpvo-tech/TechnologyReadinessLevel,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Indication of maturity of Technology (ISO 16290:2013)@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "Technology Readiness Level@en",
   :rdfs/subClassOf :dpvo/Technology,
   :vs/term_status #rdf/langString "accepted@en"})

(def TechnologySubject
  "Actor that is subject of use of Technology"
  {:db/ident            :dpvo-tech/TechnologySubject,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Actor that is subject of use of Technology@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Technology Subject@en",
   :rdfs/subClassOf     [:dpvo-tech/TechnologyActor :dpvo/Entity],
   :vs/term_status      #rdf/langString "accepted@en"})

(def TechnologyUsageLocation
  "Location for where technology is provided or used"
  {:db/ident            :dpvo-tech/TechnologyUsageLocation,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Location for where technology is provided or used@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Technology Usage Location@en",
   :rdfs/subClassOf     :dpvo/Location,
   :vs/term_status      #rdf/langString "accepted@en"})

(def TechnologyUser
  "Actor that uses Technologoy"
  {:db/ident            :dpvo-tech/TechnologyUser,
   :dcterms/created     #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Actor that uses Technologoy@en",
   :rdf/type            :owl/Class,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "Technology User@en",
   :rdfs/subClassOf     [:dpvo-tech/TechnologyActor :dpvo/Entity],
   :vs/term_status      #rdf/langString "accepted@en"})

(def WiFi
  "Technology utilising wifi wireless networking communication"
  {:db/ident :dpvo-tech/WiFi,
   :dcterms/created #xsd/date #inst "2022-06-15T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Technology utilising wifi wireless networking communication@en",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "WiFi@en",
   :rdfs/subClassOf [:dpvo-tech/Networking :dpvo-tech/CommunicationMechanism],
   :vs/term_status #rdf/langString "accepted@en"})

(def hasCommunicationMechanism
  "Indicates communication mechanisms used or provided by technology"
  {:db/ident :dpvo-tech/hasCommunicationMechanism,
   :dcterms/created #xsd/date #inst "2022-07-02T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString
    "Indicates communication mechanisms used or provided by technology@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :dpvo/Technology,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "has communication mechanism@en",
   :rdfs/range :dpvo-tech/CommunicationMechanism,
   :vs/term_status #rdf/langString "changed@en"})

(def hasDeveloper
  "Indicates technology developer"
  {:db/ident            :dpvo-tech/hasDeveloper,
   :dcterms/created     #xsd/date #inst "2022-07-02T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Indicates technology developer@en",
   :dcterms/modified    #xsd/date #inst "2022-10-21T00:00:00.000-04:00",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :dpvo/Technology,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "has developer@en",
   :rdfs/range          :dpvo-tech/TechnologyDeveloper,
   :rdfs/subPropertyOf  :dpvo-tech/hasTechnologyActor,
   :vs/term_status      #rdf/langString "changed@en"})

(def hasProvider
  "Indicates technology provider"
  {:db/ident            :dpvo-tech/hasProvider,
   :dcterms/created     #xsd/date #inst "2022-07-02T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Indicates technology provider@en",
   :dcterms/modified    #xsd/date #inst "2022-10-21T00:00:00.000-04:00",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :dpvo/Technology,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "has provider@en",
   :rdfs/range          :dpvo-tech/TechnologyProvider,
   :rdfs/subPropertyOf  :dpvo-tech/hasTechnologyActor,
   :vs/term_status      #rdf/langString "changed@en"})

(def hasProvisionMethod
  "Specifies the provision or usage method of technology"
  {:db/ident :dpvo-tech/hasProvisionMethod,
   :dcterms/created #xsd/date #inst "2022-07-02T00:00:00.000-04:00",
   :dcterms/creator {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description
   #rdf/langString "Specifies the provision or usage method of technology@en",
   :rdf/type [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain :dpvo/Technology,
   :rdfs/isDefinedBy {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label #rdf/langString "has provision method@en",
   :rdfs/range :dpvo-tech/TechnologyProvisionMethod,
   :vs/term_status #rdf/langString "changed@en"})

(def hasSubject
  "Indicates technology subject"
  {:db/ident            :dpvo-tech/hasSubject,
   :dcterms/created     #xsd/date #inst "2022-07-02T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Indicates technology subject@en",
   :dcterms/modified    #xsd/date #inst "2022-10-21T00:00:00.000-04:00",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :dpvo/Technology,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "has subject@en",
   :rdfs/range          :dpvo-tech/TechnologySubject,
   :rdfs/subPropertyOf  :dpvo-tech/hasTechnologyActor,
   :vs/term_status      #rdf/langString "changed@en"})

(def hasTRL
  "Indicates technology maturity level"
  {:db/ident            :dpvo-tech/hasTRL,
   :dcterms/created     #xsd/date #inst "2022-07-02T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Indicates technology maturity level@en",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :dpvo/Technology,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "has TRL@en",
   :rdfs/range          :dpvo-tech/TechnologyReadinessLevel,
   :vs/term_status      #rdf/langString "changed@en"})

(def hasTechnologyActor
  "Indicates an actor associated with technology"
  {:db/ident            :dpvo-tech/hasTechnologyActor,
   :dcterms/created     #xsd/date #inst "2022-10-21T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString
                         "Indicates an actor associated with technology@en",
   :rdf/type            [:owl/ObjectProperty :rdf/Property],
   :rdfs/domain         :dpvo/Technology,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "has technology actor@en",
   :rdfs/range          :dpvo-tech/TechnologyActor,
   :vs/term_status      #rdf/langString "accepted@en"})

(def hasUser
  "Indicates technology user"
  {:db/ident            :dpvo-tech/hasUser,
   :dcterms/created     #xsd/date #inst "2022-07-02T00:00:00.000-04:00",
   :dcterms/creator     {:xsd/string "Harshvardhan J. Pandit"},
   :dcterms/description #rdf/langString "Indicates technology user@en",
   :dcterms/modified    #xsd/date #inst "2022-10-21T00:00:00.000-04:00",
   :rdf/type            [:rdf/Property :owl/ObjectProperty],
   :rdfs/domain         :dpvo/Technology,
   :rdfs/isDefinedBy    {:rdfa/uri "https://w3id.org/dpv/dpv-owl/dpv-tech#"},
   :rdfs/label          #rdf/langString "has user@en",
   :rdfs/range          :dpvo-tech/TechnologyUser,
   :rdfs/subPropertyOf  :dpvo-tech/hasTechnologyActor,
   :vs/term_status      #rdf/langString "changed@en"})
