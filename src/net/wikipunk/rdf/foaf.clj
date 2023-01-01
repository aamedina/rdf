(ns net.wikipunk.rdf.foaf
  "The Friend of a Friend (FOAF) RDF vocabulary, described using W3C RDF Schema and the Web Ontology Language."
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/schemas.lv2/foaf.ttl",
   :dcterms/description
   "The Friend of a Friend (FOAF) RDF vocabulary, described using W3C RDF Schema and the Web Ontology Language.",
   :dcterms/title "Friend of a Friend (FOAF) vocabulary",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "http://xmlns.com/foaf/0.1/",
   :rdfa/prefix "foaf",
   :rdfa/uri "http://xmlns.com/foaf/0.1/",
   :rdfs/comment
   "This version of the FOAF vocabulary has been slightly trimmed for LV2.",
   :rdfs/isDefinedBy {:rdf/uri "http://xmlns.com/foaf/spec/"}}
  (:refer-clojure :exclude [name]))

(def Agent
  "An agent (eg. person, group, software or physical artifact)."
  {:db/ident :foaf/Agent,
   :owl/equivalentClass :dcterms/Agent,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment "An agent (eg. person, group, software or physical artifact).",
   :rdfs/label "Agent"})

(def Document
  "A document."
  {:db/ident         :foaf/Document,
   :owl/disjointWith [:foaf/Project :foaf/Organization],
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "A document.",
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "Document"})

(def Group
  "A class of Agents."
  {:db/ident        :foaf/Group,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A class of Agents.",
   :rdfs/label      "Group",
   :rdfs/subClassOf :foaf/Agent})

(def Image
  "An image."
  {:db/ident         :foaf/Image,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "An image.",
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "Image",
   :rdfs/subClassOf  :foaf/Document})

(def LabelProperty
  "A foaf:LabelProperty is any RDF property with textual values that serve as labels."
  {:db/ident :foaf/LabelProperty,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   "A foaf:LabelProperty is any RDF property with textual values that serve as labels.",
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label "Label Property"})

(def OnlineAccount
  "An online account."
  {:db/ident         :foaf/OnlineAccount,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "An online account.",
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "Online Account",
   :rdfs/subClassOf  :owl/Thing})

(def OnlineChatAccount
  "An online chat account."
  {:db/ident         :foaf/OnlineChatAccount,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "An online chat account.",
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "Online Chat Account",
   :rdfs/subClassOf  :foaf/OnlineAccount})

(def OnlineEcommerceAccount
  "An online e-commerce account."
  {:db/ident         :foaf/OnlineEcommerceAccount,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "An online e-commerce account.",
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "Online E-commerce Account",
   :rdfs/subClassOf  :foaf/OnlineAccount})

(def OnlineGamingAccount
  "An online gaming account."
  {:db/ident         :foaf/OnlineGamingAccount,
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "An online gaming account.",
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "Online Gaming Account",
   :rdfs/subClassOf  :foaf/OnlineAccount})

(def Organization
  "An organization."
  {:db/ident         :foaf/Organization,
   :owl/disjointWith [:foaf/Person :foaf/Document],
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "An organization.",
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "Organization",
   :rdfs/subClassOf  :foaf/Agent})

(def Person
  "A person."
  {:db/ident         :foaf/Person,
   :owl/disjointWith [:foaf/Project :foaf/Organization],
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "A person.",
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "Person",
   :rdfs/subClassOf  :foaf/Agent})

(def PersonalProfileDocument
  "A personal profile RDF document."
  {:db/ident        :foaf/PersonalProfileDocument,
   :rdf/type        [:owl/Class :rdfs/Class],
   :rdfs/comment    "A personal profile RDF document.",
   :rdfs/label      "PersonalProfileDocument",
   :rdfs/subClassOf :foaf/Document})

(def Project
  "A project (a collective endeavour of some kind)."
  {:db/ident         :foaf/Project,
   :owl/disjointWith [:foaf/Person :foaf/Document],
   :rdf/type         [:owl/Class :rdfs/Class],
   :rdfs/comment     "A project (a collective endeavour of some kind).",
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "Project"})

(def account
  "Indicates an account held by this agent."
  {:db/ident         :foaf/account,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     "Indicates an account held by this agent.",
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "account",
   :rdfs/range       :foaf/OnlineAccount})

(def accountName
  "Indicates the name (identifier) associated with this online account."
  {:db/ident :foaf/accountName,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "Indicates the name (identifier) associated with this online account.",
   :rdfs/domain :foaf/OnlineAccount,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label "account name",
   :rdfs/range :rdfs/Literal})

(def accountServiceHomepage
  "Indicates a homepage of the service provide for this online account."
  {:db/ident :foaf/accountServiceHomepage,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "Indicates a homepage of the service provide for this online account.",
   :rdfs/domain :foaf/OnlineAccount,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label "account service homepage",
   :rdfs/range :foaf/Document})

(def age
  "The age in years of some agent."
  {:db/ident         :foaf/age,
   :rdf/type         [:owl/FunctionalProperty
                      :owl/DatatypeProperty
                      :rdf/Property],
   :rdfs/comment     "The age in years of some agent.",
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "age",
   :rdfs/range       :rdfs/Literal})

(def aimChatID
  "An AIM chat ID"
  {:db/ident           :foaf/aimChatID,
   :rdf/type           [:owl/InverseFunctionalProperty
                        :owl/DatatypeProperty
                        :rdf/Property],
   :rdfs/comment       "An AIM chat ID",
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   "http://xmlns.com/foaf/0.1/",
   :rdfs/label         "AIM chat ID",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :foaf/nick})

(def birthday
  "The birthday of this Agent, represented in mm-dd string form, eg. '12-31'."
  {:db/ident :foaf/birthday,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "The birthday of this Agent, represented in mm-dd string form, eg. '12-31'.",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label "birthday",
   :rdfs/range :rdfs/Literal})

(def currentProject
  "A current project this person works on."
  {:db/ident         :foaf/currentProject,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     "A current project this person works on.",
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "current project",
   :rdfs/range       :owl/Thing})

(def depiction
  "A depiction of some thing."
  {:db/ident         :foaf/depiction,
   :owl/inverseOf    :foaf/depicts,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     "A depiction of some thing.",
   :rdfs/domain      :owl/Thing,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "depiction",
   :rdfs/range       :foaf/Image})

(def depicts
  "A thing depicted in this representation."
  {:db/ident         :foaf/depicts,
   :owl/inverseOf    :foaf/depiction,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     "A thing depicted in this representation.",
   :rdfs/domain      :foaf/Image,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "depicts",
   :rdfs/range       :owl/Thing})

(def familyName
  "The family name of some person."
  {:db/ident         :foaf/familyName,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment     "The family name of some person.",
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "familyName",
   :rdfs/range       :rdfs/Literal})

(def firstName
  "The first name of a person."
  {:db/ident         :foaf/firstName,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment     "The first name of a person.",
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "firstName",
   :rdfs/range       :rdfs/Literal})

(def gender
  "The gender of this Agent (typically but not necessarily 'male' or 'female')."
  {:db/ident :foaf/gender,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "The gender of this Agent (typically but not necessarily 'male' or 'female').",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label "gender",
   :rdfs/range :rdfs/Literal})

(def givenName
  "The given name of some person."
  {:db/ident         :foaf/givenName,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment     "The given name of some person.",
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "Given name"})

(def homepage
  "A homepage for some thing."
  {:db/ident           :foaf/homepage,
   :rdf/type           [:rdf/Property
                        :owl/ObjectProperty
                        :owl/InverseFunctionalProperty],
   :rdfs/comment       "A homepage for some thing.",
   :rdfs/domain        :owl/Thing,
   :rdfs/isDefinedBy   "http://xmlns.com/foaf/0.1/",
   :rdfs/label         "homepage",
   :rdfs/range         :foaf/Document,
   :rdfs/subPropertyOf [:foaf/page :foaf/isPrimaryTopicOf]})

(def icqChatID
  "An ICQ chat ID"
  {:db/ident           :foaf/icqChatID,
   :rdf/type           [:owl/InverseFunctionalProperty
                        :owl/DatatypeProperty
                        :rdf/Property],
   :rdfs/comment       "An ICQ chat ID",
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   "http://xmlns.com/foaf/0.1/",
   :rdfs/label         "ICQ chat ID",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :foaf/nick})

(def img
  "An image that can be used to represent some thing (ie. those depictions which are particularly representative of something, eg. one's photo on a homepage)."
  {:db/ident :foaf/img,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "An image that can be used to represent some thing (ie. those depictions which are particularly representative of something, eg. one's photo on a homepage).",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label "image",
   :rdfs/range :foaf/Image,
   :rdfs/subPropertyOf :foaf/depiction})

(def interest
  "A page about a topic of interest to this person."
  {:db/ident         :foaf/interest,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     "A page about a topic of interest to this person.",
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "interest",
   :rdfs/range       :foaf/Document})

(def isPrimaryTopicOf
  "A document that this thing is the primary topic of."
  {:db/ident           :foaf/isPrimaryTopicOf,
   :owl/inverseOf      :foaf/primaryTopic,
   :rdf/type           [:owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/comment       "A document that this thing is the primary topic of.",
   :rdfs/domain        :owl/Thing,
   :rdfs/isDefinedBy   "http://xmlns.com/foaf/0.1/",
   :rdfs/label         "is primary topic of",
   :rdfs/range         :foaf/Document,
   :rdfs/subPropertyOf :foaf/page})

(def jabberID
  "A jabber ID for something."
  {:db/ident         :foaf/jabberID,
   :rdf/type         [:owl/InverseFunctionalProperty
                      :owl/DatatypeProperty
                      :rdf/Property],
   :rdfs/comment     "A jabber ID for something.",
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "jabber ID",
   :rdfs/range       :rdfs/Literal})

(def knows
  "A person known by this person (indicating some level of reciprocated interaction between the parties)."
  {:db/ident :foaf/knows,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "A person known by this person (indicating some level of reciprocated interaction between the parties).",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label "knows",
   :rdfs/range :foaf/Person})

(def lastName
  "The last name of a person."
  {:db/ident         :foaf/lastName,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment     "The last name of a person.",
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "lastName",
   :rdfs/range       :rdfs/Literal})

(def logo
  "A logo representing some thing."
  {:db/ident         :foaf/logo,
   :rdf/type         [:owl/ObjectProperty
                      :owl/InverseFunctionalProperty
                      :rdf/Property],
   :rdfs/comment     "A logo representing some thing.",
   :rdfs/domain      :owl/Thing,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "logo",
   :rdfs/range       :owl/Thing})

(def made
  "Something that was made by this agent."
  {:db/ident         :foaf/made,
   :owl/inverseOf    :foaf/maker,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     "Something that was made by this agent.",
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "made",
   :rdfs/range       :owl/Thing})

(def maker
  "An agent that made this thing."
  {:db/ident               :foaf/maker,
   :owl/equivalentProperty :dcterms/creator,
   :owl/inverseOf          :foaf/made,
   :rdf/type               [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment           "An agent that made this thing.",
   :rdfs/domain            :owl/Thing,
   :rdfs/isDefinedBy       "http://xmlns.com/foaf/0.1/",
   :rdfs/label             "maker",
   :rdfs/range             :foaf/Agent})

(def mbox
  "A personal mailbox, ie. an Internet mailbox associated with exactly one owner, the first owner of this mailbox. This is a 'static inverse functional property', in that there is (across time and change) at most one individual that ever has any particular value for foaf:mbox."
  {:db/ident :foaf/mbox,
   :rdf/type [:owl/ObjectProperty :owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/comment
   "A personal mailbox, ie. an Internet mailbox associated with exactly one owner, the first owner of this mailbox. This is a 'static inverse functional property', in that there is (across time and change) at most one individual that ever has any particular value for foaf:mbox.",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label "personal mailbox",
   :rdfs/range :owl/Thing})

(def mbox_sha1sum
  "The sha1sum of the URI of an Internet mailbox associated with exactly one owner, the first owner of the mailbox."
  {:db/ident :foaf/mbox_sha1sum,
   :rdf/type
   [:owl/InverseFunctionalProperty :owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "The sha1sum of the URI of an Internet mailbox associated with exactly one owner, the first owner of the mailbox.",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label "sha1sum of a personal mailbox URI name",
   :rdfs/range :rdfs/Literal})

(def member
  "Indicates a member of a Group"
  {:db/ident         :foaf/member,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     "Indicates a member of a Group",
   :rdfs/domain      :foaf/Group,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "member",
   :rdfs/range       :foaf/Agent})

(def membershipClass
  "Indicates the class of individuals that are a member of a Group"
  {:db/ident :foaf/membershipClass,
   :rdf/type [:owl/AnnotationProperty :rdf/Property],
   :rdfs/comment
   "Indicates the class of individuals that are a member of a Group",
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label "membershipClass"})

(def msnChatID
  "An MSN chat ID"
  {:db/ident           :foaf/msnChatID,
   :rdf/type           [:owl/InverseFunctionalProperty
                        :owl/DatatypeProperty
                        :rdf/Property],
   :rdfs/comment       "An MSN chat ID",
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   "http://xmlns.com/foaf/0.1/",
   :rdfs/label         "MSN chat ID",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :foaf/nick})

(def myersBriggs
  "A Myers Briggs (MBTI) personality classification."
  {:db/ident         :foaf/myersBriggs,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment     "A Myers Briggs (MBTI) personality classification.",
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "myersBriggs",
   :rdfs/range       :rdfs/Literal})

(def name
  "A name for some thing."
  {:db/ident           :foaf/name,
   :rdf/type           [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment       "A name for some thing.",
   :rdfs/domain        :owl/Thing,
   :rdfs/isDefinedBy   "http://xmlns.com/foaf/0.1/",
   :rdfs/label         "name",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :rdfs/label})

(def nick
  "A short informal nickname characterising an agent (includes login identifiers, IRC and other chat nicknames)."
  {:db/ident :foaf/nick,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "A short informal nickname characterising an agent (includes login identifiers, IRC and other chat nicknames).",
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label "nickname"})

(def openid
  "An OpenID for an Agent."
  {:db/ident           :foaf/openid,
   :rdf/type           [:owl/ObjectProperty
                        :owl/InverseFunctionalProperty
                        :rdf/Property],
   :rdfs/comment       "An OpenID for an Agent.",
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   "http://xmlns.com/foaf/0.1/",
   :rdfs/label         "openid",
   :rdfs/range         :foaf/Document,
   :rdfs/subPropertyOf :foaf/isPrimaryTopicOf})

(def page
  "A page or document about this thing."
  {:db/ident         :foaf/page,
   :owl/inverseOf    :foaf/topic,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     "A page or document about this thing.",
   :rdfs/domain      :owl/Thing,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "page",
   :rdfs/range       :foaf/Document})

(def pastProject
  "A project this person has previously worked on."
  {:db/ident         :foaf/pastProject,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     "A project this person has previously worked on.",
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "past project",
   :rdfs/range       :owl/Thing})

(def phone
  "A phone, specified using fully qualified tel: URI scheme (refs: http://www.w3.org/Addressing/schemes.html#tel)."
  {:db/ident :foaf/phone,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "A phone, specified using fully qualified tel: URI scheme (refs: http://www.w3.org/Addressing/schemes.html#tel).",
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label "phone"})

(def plan
  "A .plan comment, in the tradition of finger and '.plan' files."
  {:db/ident :foaf/plan,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "A .plan comment, in the tradition of finger and '.plan' files.",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label "plan",
   :rdfs/range :rdfs/Literal})

(def primaryTopic
  "The primary topic of some page or document."
  {:db/ident         :foaf/primaryTopic,
   :owl/inverseOf    :foaf/isPrimaryTopicOf,
   :rdf/type         [:owl/ObjectProperty
                      :owl/FunctionalProperty
                      :rdf/Property],
   :rdfs/comment     "The primary topic of some page or document.",
   :rdfs/domain      :foaf/Document,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "primary topic",
   :rdfs/range       :owl/Thing})

(def publications
  "A link to the publications of this person."
  {:db/ident         :foaf/publications,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     "A link to the publications of this person.",
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "publications",
   :rdfs/range       :foaf/Document})

(def schoolHomepage
  "A homepage of a school attended by the person."
  {:db/ident         :foaf/schoolHomepage,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     "A homepage of a school attended by the person.",
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "schoolHomepage",
   :rdfs/range       :foaf/Document})

(def sha1
  "A sha1sum hash, in hex."
  {:db/ident         :foaf/sha1,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment     "A sha1sum hash, in hex.",
   :rdfs/domain      :foaf/Document,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "sha1sum (hex)"})

(def skypeID
  "A Skype ID"
  {:db/ident           :foaf/skypeID,
   :rdf/type           [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment       "A Skype ID",
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   "http://xmlns.com/foaf/0.1/",
   :rdfs/label         "Skype ID",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :foaf/nick})

(def status
  "A string expressing what the user is happy for the general public (normally) to know about their current activity."
  {:db/ident :foaf/status,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "A string expressing what the user is happy for the general public (normally) to know about their current activity.",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label "status",
   :rdfs/range :rdfs/Literal})

(def thumbnail
  "A derived thumbnail image."
  {:db/ident         :foaf/thumbnail,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     "A derived thumbnail image.",
   :rdfs/domain      :foaf/Image,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "thumbnail",
   :rdfs/range       :foaf/Image})

(def tipjar
  "A tipjar document for this agent, describing means for payment and reward."
  {:db/ident :foaf/tipjar,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "A tipjar document for this agent, describing means for payment and reward.",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label "tipjar",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :foaf/page})

(def title
  "Title (Mr, Mrs, Ms, Dr. etc)"
  {:db/ident         :foaf/title,
   :rdf/type         [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment     "Title (Mr, Mrs, Ms, Dr. etc)",
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "title"})

(def topic
  "A topic of some page or document."
  {:db/ident         :foaf/topic,
   :owl/inverseOf    :foaf/page,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     "A topic of some page or document.",
   :rdfs/domain      :foaf/Document,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "topic",
   :rdfs/range       :owl/Thing})

(def topic_interest
  "A thing of interest to this person."
  {:db/ident         :foaf/topic_interest,
   :rdf/type         [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment     "A thing of interest to this person.",
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label       "topic_interest",
   :rdfs/range       :owl/Thing})

(def weblog
  "A weblog of some thing (whether person, group, company etc.)."
  {:db/ident :foaf/weblog,
   :rdf/type [:owl/ObjectProperty :owl/InverseFunctionalProperty :rdf/Property],
   :rdfs/comment
   "A weblog of some thing (whether person, group, company etc.).",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label "weblog",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :foaf/page})

(def workInfoHomepage
  "A work info homepage of some person; a page about their work for some organization."
  {:db/ident :foaf/workInfoHomepage,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "A work info homepage of some person; a page about their work for some organization.",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label "work info homepage",
   :rdfs/range :foaf/Document})

(def workplaceHomepage
  "A workplace homepage of some person; the homepage of an organization they work for."
  {:db/ident :foaf/workplaceHomepage,
   :rdf/type [:owl/ObjectProperty :rdf/Property],
   :rdfs/comment
   "A workplace homepage of some person; the homepage of an organization they work for.",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy "http://xmlns.com/foaf/0.1/",
   :rdfs/label "workplace homepage",
   :rdfs/range :foaf/Document})

(def yahooChatID
  "A Yahoo chat ID"
  {:db/ident           :foaf/yahooChatID,
   :rdf/type           [:owl/InverseFunctionalProperty
                        :owl/DatatypeProperty
                        :rdf/Property],
   :rdfs/comment       "A Yahoo chat ID",
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   "http://xmlns.com/foaf/0.1/",
   :rdfs/label         "Yahoo chat ID",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :foaf/nick})