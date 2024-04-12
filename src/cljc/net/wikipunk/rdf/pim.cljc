(ns net.wikipunk.rdf.pim
  "Workspace Ontology"
  {:dc11/title   "Workspace Ontology",
   :doc/version  "$Id: space.ttl,v 1.4 2021/10/01 18:47:19 timbl Exp $",
   :namespaces   {"dc11" "http://purl.org/dc/elements/1.1/",
                  "doc"  "http://www.w3.org/2000/10/swap/pim/doc#",
                  "foaf" "http://xmlns.com/foaf/0.1/",
                  "gen"  "http://www.w3.org/2006/gen/ont#",
                  "owl"  "http://www.w3.org/2002/07/owl#",
                  "pim"  "http://www.w3.org/ns/pim/space#",
                  "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                  "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                  "ui"   "http://www.w3.org/ns/ui#"},
   :rdf/type     :owl/Ontology,
   :rdfa/prefix  "pim",
   :rdfa/uri     "http://www.w3.org/ns/pim/space#",
   :rdfs/comment "Workspace Ontology",
   :xsd/anyURI   "http://www.w3.org/ns/pim/space"})

(def ConfigurationFile
  {:db/ident        :pim/ConfigurationFile,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :gen/InformationResource})

(def ControlledStorage
  {:db/ident :pim/ControlledStorage,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A  storage is a space of URIs in which you can individually control for each resource\n    who has access to it.\n",
   :rdfs/label "access controlled storage",
   :rdfs/subClassOf :pim/Storage})

(def MasterWorkspace
  {:db/ident :pim/MasterWorkspace,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "This is a workspace for storing the\n    information about the other workspaces.\n    As a user, you normally don't have to worry about it.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Master Workspace"},
   :rdfs/subClassOf :pim/PrivateWorkspace})

(def PersonalStorage
  {:db/ident :pim/PersonalStorage,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A personal storage is a space of URIs in which you and only you have access to data,\n    you cannot give access to anyone else.\n",
   :rdfs/label "personal storage",
   :rdfs/subClassOf :pim/Storage})

(def PreferencesWorkspace
  {:db/ident :pim/PreferencesWorkspace,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Aceess may not be open to the public. Contains preferences resources.",
   :rdfs/label "Preferences workspace",
   :rdfs/subClassOf :pim/Workspace})

(def PrivateWorkspace
  {:db/ident        :pim/PrivateWorkspace,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Access only by the you, the user.",
   :rdfs/label      "Private workspace",
   :rdfs/subClassOf :pim/Workspace})

(def PublicStorage
  {:db/ident :pim/PublicStorage,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A public storage is a space of URIs in which you have access to data,\n    and all data is accessible to anyone without control.\n",
   :rdfs/label "public storage",
   :rdfs/subClassOf :pim/Storage})

(def PublicWorkspace
  {:db/ident :pim/PublicWorkspace,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Aceess is open to the public. Anything in a public workspace\n    can be accesed by anyone.",
   :rdfs/label "Public workspace",
   :rdfs/subClassOf :pim/Workspace})

(def SharedWorkspace
  {:db/ident        :pim/SharedWorkspace,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Access is to some but not all people.",
   :rdfs/label      "Shared workspace",
   :rdfs/subClassOf :pim/Workspace})

(def Storage
  {:db/ident :pim/Storage,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A storage is a space of URIs in which you have access to data.\n",
   :rdfs/label "storage"})

(def Workspace
  {:db/ident :pim/Workspace,
   :owl/disjointUnionOf
   [:pim/PrivateWorkspace :pim/SharedWorkspace :pim/PublicWorkspace],
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Workspaces are place where data is stored, and associated polices of privacy.\nA given application typically stores information in several different\nworkspaces, some being user private, some shared, and some public.\n",
   :rdfs/label "workspace"})

(def masterWorkspace
  {:db/ident    :pim/masterWorkspace,
   :rdf/type    :rdf/Property,
   :rdfs/domain :foaf/Agent,
   :rdfs/label  {:rdf/language "en",
                 :rdf/value    "master workspace"},
   :rdfs/range  :pim/MasterWorkspace})

(def preferencesFile
  {:db/ident    :pim/preferencesFile,
   :rdf/type    :rdf/Property,
   :rdfs/domain :foaf/Agent,
   :rdfs/label  "preferences file",
   :rdfs/range  :pim/ConfigurationFile})

(def storage
  {:db/ident :pim/storage,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The storage in which this workspace is, or the storage which\ncontains this resource, or a storage available to this agent to use.",
   :rdfs/label "storage",
   :rdfs/range :pim/Storage})

(def uriPrefix
  {:db/ident :pim/uriPrefix,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment
   "URIs which start with this string are in this workspace or storage.\nThis may be used for constructing URIs for new storage resources.\n",
   :rdfs/label "URI prefix",
   :ui/prompt "Give the first part of the URis in this workspace"})

(def workspace
  {:db/ident   :pim/workspace,
   :rdf/type   :rdf/Property,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "workspace"},
   :rdfs/range :pim/Workspace})

(def urn:uuid:6d11509f-891b-5f66-aa17-ccadb3e8e838
  {:dc11/title "Workspace Ontology",
   :doc/version "$Id: space.ttl,v 1.4 2021/10/01 18:47:19 timbl Exp $",
   :rdfs/comment
   "This ontology is for use in describing\nWorkspaces.  Workspaces are places where data is stored and associated policies of privacy.\nA given application typically stores information in several different\nworkspaces, some being user private, some shared, and some public.\nit is crucial that the user has easy control over the destiny of information.\n\nGoals then are that the user can\n\n      - create workspaces\n      - easily understand which workspace data is going into\n      - understand what the implications of that are\n      - (later) set ACLS on them\n      - publish apropriate use policies for them\n\n",
   :xsd/anyURI "http://www.w3.org/ns/pim/space"})
