(ns net.wikipunk.rdf.foaf
  ^{:base "http://xmlns.com/foaf/0.1/",
    :namespaces {"dc11" "http://purl.org/dc/elements/1.1/",
                 "foaf" "http://xmlns.com/foaf/0.1/",
                 "owl"  "http://www.w3.org/2002/07/owl#",
                 "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                 "vs"   "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                 "wot"  "http://xmlns.com/wot/0.1/"},
    :prefix "foaf",
    :source
    "https://raw.githubusercontent.com/arachne-framework/aristotle/main/test/foaf.rdf"}
  {:dc11/description
   "The Friend of a Friend (FOAF) RDF vocabulary, described using W3C RDF Schema and the Web Ontology Language.",
   :dc11/title "Friend of a Friend (FOAF) vocabulary",
   :rdf/type :owl/Ontology,
   :xsd/anyURI "http://xmlns.com/foaf/0.1/"}
  (:refer-clojure :exclude [name]))

(def Agent
  {:db/ident :foaf/Agent,
   :owl/equivalentClass :dcterms/Agent,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment "An agent (eg. person, group, software or physical artifact).",
   :rdfs/label "Agent",
   :vs/term_status "stable"})

(def Document
  {:db/ident            :foaf/Document,
   :owl/disjointWith    #{:foaf/Organization :foaf/Project},
   :owl/equivalentClass :schema/CreativeWork,
   :rdf/type            #{:rdfs/Class :owl/Class},
   :rdfs/comment        "A document.",
   :rdfs/isDefinedBy    {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label          "Document",
   :vs/term_status      "stable"})

(def Group
  {:db/ident        :foaf/Group,
   :rdf/type        #{:rdfs/Class :owl/Class},
   :rdfs/comment    "A class of Agents.",
   :rdfs/label      "Group",
   :rdfs/subClassOf :foaf/Agent,
   :vs/term_status  "stable"})

(def Image
  {:db/ident            :foaf/Image,
   :owl/equivalentClass :schema/ImageObject,
   :rdf/type            #{:rdfs/Class :owl/Class},
   :rdfs/comment        "An image.",
   :rdfs/isDefinedBy    {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label          "Image",
   :rdfs/subClassOf     :foaf/Document,
   :vs/term_status      "stable"})

(def LabelProperty
  {:db/ident :foaf/LabelProperty,
   :rdf/type #{:rdfs/Class :owl/Class},
   :rdfs/comment
   "A foaf:LabelProperty is any RDF property with texual values that serve as labels.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label "Label Property",
   :vs/term_status "unstable"})

(def OnlineAccount
  {:db/ident         :foaf/OnlineAccount,
   :rdf/type         #{:rdfs/Class :owl/Class},
   :rdfs/comment     "An online account.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "Online Account",
   :rdfs/subClassOf  :owl/Thing,
   :vs/term_status   "testing"})

(def OnlineChatAccount
  {:db/ident         :foaf/OnlineChatAccount,
   :rdf/type         #{:rdfs/Class :owl/Class},
   :rdfs/comment     "An online chat account.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "Online Chat Account",
   :rdfs/subClassOf  :foaf/OnlineAccount,
   :vs/term_status   "unstable"})

(def OnlineEcommerceAccount
  {:db/ident         :foaf/OnlineEcommerceAccount,
   :rdf/type         #{:rdfs/Class :owl/Class},
   :rdfs/comment     "An online e-commerce account.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "Online E-commerce Account",
   :rdfs/subClassOf  :foaf/OnlineAccount,
   :vs/term_status   "unstable"})

(def OnlineGamingAccount
  {:db/ident         :foaf/OnlineGamingAccount,
   :rdf/type         #{:rdfs/Class :owl/Class},
   :rdfs/comment     "An online gaming account.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "Online Gaming Account",
   :rdfs/subClassOf  :foaf/OnlineAccount,
   :vs/term_status   "unstable"})

(def Organization
  {:db/ident         :foaf/Organization,
   :owl/disjointWith #{:foaf/Person :foaf/Document},
   :rdf/type         #{:rdfs/Class :owl/Class},
   :rdfs/comment     "An organization.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "Organization",
   :rdfs/subClassOf  :foaf/Agent,
   :vs/term_status   "stable"})

(def Person
  {:db/ident            :foaf/Person,
   :owl/disjointWith    #{:foaf/Organization :foaf/Project},
   :owl/equivalentClass #{{:xsd/anyURI
                           "http://www.w3.org/2000/10/swap/pim/contact#Person"}
                          :schema/Person},
   :rdf/type            #{:rdfs/Class :owl/Class},
   :rdfs/comment        "A person.",
   :rdfs/isDefinedBy    {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label          "Person",
   :rdfs/subClassOf     #{:foaf/Agent :geo/SpatialThing},
   :vs/term_status      "stable"})

(def PersonalProfileDocument
  {:db/ident        :foaf/PersonalProfileDocument,
   :rdf/type        #{:rdfs/Class :owl/Class},
   :rdfs/comment    "A personal profile RDF document.",
   :rdfs/label      "PersonalProfileDocument",
   :rdfs/subClassOf :foaf/Document,
   :vs/term_status  "testing"})

(def Project
  {:db/ident         :foaf/Project,
   :owl/disjointWith #{:foaf/Person :foaf/Document},
   :rdf/type         #{:rdfs/Class :owl/Class},
   :rdfs/comment     "A project (a collective endeavour of some kind).",
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "Project",
   :vs/term_status   "testing"})

(def account
  {:db/ident         :foaf/account,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     "Indicates an account held by this agent.",
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "account",
   :rdfs/range       :foaf/OnlineAccount,
   :vs/term_status   "testing"})

(def accountName
  {:db/ident :foaf/accountName,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment
   "Indicates the name (identifier) associated with this online account.",
   :rdfs/domain :foaf/OnlineAccount,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label "account name",
   :rdfs/range :rdfs/Literal,
   :vs/term_status "testing"})

(def accountServiceHomepage
  {:db/ident :foaf/accountServiceHomepage,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   "Indicates a homepage of the service provide for this online account.",
   :rdfs/domain :foaf/OnlineAccount,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label "account service homepage",
   :rdfs/range :foaf/Document,
   :vs/term_status "testing"})

(def age
  {:db/ident         :foaf/age,
   :rdf/type         #{:owl/DatatypeProperty :rdf/Property
                       :owl/FunctionalProperty},
   :rdfs/comment     "The age in years of some agent.",
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "age",
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   "unstable"})

(def aimChatID
  {:db/ident           :foaf/aimChatID,
   :rdf/type           #{:owl/DatatypeProperty :rdf/Property
                         :owl/InverseFunctionalProperty},
   :rdfs/comment       "An AIM chat ID",
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label         "AIM chat ID",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :foaf/nick,
   :vs/term_status     "testing"})

(def based_near
  {:db/ident :foaf/based_near,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   "A location that something is based near, for some broadly human notion of near.",
   :rdfs/domain :geo/SpatialThing,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label "based near",
   :rdfs/range :geo/SpatialThing,
   :vs/term_status "testing"})

(def birthday
  {:db/ident :foaf/birthday,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property :owl/FunctionalProperty},
   :rdfs/comment
   "The birthday of this Agent, represented in mm-dd string form, eg. '12-31'.",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label "birthday",
   :rdfs/range :rdfs/Literal,
   :vs/term_status "unstable"})

(def currentProject
  {:db/ident         :foaf/currentProject,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     "A current project this person works on.",
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "current project",
   :rdfs/range       :owl/Thing,
   :vs/term_status   "testing"})

(def depiction
  {:db/ident         :foaf/depiction,
   :owl/inverseOf    :foaf/depicts,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     "A depiction of some thing.",
   :rdfs/domain      :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "depiction",
   :rdfs/range       :foaf/Image,
   :vs/term_status   "testing"})

(def depicts
  {:db/ident         :foaf/depicts,
   :owl/inverseOf    :foaf/depiction,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     "A thing depicted in this representation.",
   :rdfs/domain      :foaf/Image,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "depicts",
   :rdfs/range       :owl/Thing,
   :vs/term_status   "testing"})

(def dnaChecksum
  {:db/ident         :foaf/dnaChecksum,
   :rdf/type         #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment     "A checksum for the DNA of some thing. Joke.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "DNA checksum",
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   "archaic"})

(def familyName
  {:db/ident         :foaf/familyName,
   :rdf/type         #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment     "The family name of some person.",
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "familyName",
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   "testing"})

(def family_name
  {:db/ident         :foaf/family_name,
   :rdf/type         #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment     "The family name of some person.",
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "family_name",
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   "archaic"})

(def firstName
  {:db/ident         :foaf/firstName,
   :rdf/type         #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment     "The first name of a person.",
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "firstName",
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   "testing"})

(def focus
  {:db/ident :foaf/focus,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   "The underlying or 'focal' entity associated with some SKOS-described concept.",
   :rdfs/domain :skos/Concept,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label "focus",
   :rdfs/range :owl/Thing,
   :vs/term_status "testing"})

(def fundedBy
  {:db/ident         :foaf/fundedBy,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     "An organization funding a project or person.",
   :rdfs/domain      :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "funded by",
   :rdfs/range       :owl/Thing,
   :vs/term_status   "archaic"})

(def geekcode
  {:db/ident :foaf/geekcode,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment
   "A textual geekcode for this person, see http://www.geekcode.com/geek.html",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label "geekcode",
   :rdfs/range :rdfs/Literal,
   :vs/term_status "archaic"})

(def gender
  {:db/ident :foaf/gender,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property :owl/FunctionalProperty},
   :rdfs/comment
   "The gender of this Agent (typically but not necessarily 'male' or 'female').",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label "gender",
   :rdfs/range :rdfs/Literal,
   :vs/term_status "testing"})

(def givenName
  {:db/ident         :foaf/givenName,
   :rdf/type         #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment     "The given name of some person.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "Given name",
   :vs/term_status   "testing"})

(def givenname
  {:db/ident         :foaf/givenname,
   :rdf/type         #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment     "The given name of some person.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "Given name",
   :vs/term_status   "archaic"})

(def holdsAccount
  {:db/ident         :foaf/holdsAccount,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     "Indicates an account held by this agent.",
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "account",
   :rdfs/range       :foaf/OnlineAccount,
   :vs/term_status   "archaic"})

(def homepage
  {:db/ident           :foaf/homepage,
   :rdf/type           #{:owl/ObjectProperty :rdf/Property
                         :owl/InverseFunctionalProperty},
   :rdfs/comment       "A homepage for some thing.",
   :rdfs/domain        :owl/Thing,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label         "homepage",
   :rdfs/range         :foaf/Document,
   :rdfs/subPropertyOf #{:foaf/isPrimaryTopicOf :foaf/page},
   :vs/term_status     "stable"})

(def icqChatID
  {:db/ident           :foaf/icqChatID,
   :rdf/type           #{:owl/DatatypeProperty :rdf/Property
                         :owl/InverseFunctionalProperty},
   :rdfs/comment       "An ICQ chat ID",
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label         "ICQ chat ID",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :foaf/nick,
   :vs/term_status     "testing"})

(def img
  {:db/ident :foaf/img,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   "An image that can be used to represent some thing (ie. those depictions which are particularly representative of something, eg. one's photo on a homepage).",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label "image",
   :rdfs/range :foaf/Image,
   :rdfs/subPropertyOf :foaf/depiction,
   :vs/term_status "testing"})

(def interest
  {:db/ident         :foaf/interest,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     "A page about a topic of interest to this person.",
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "interest",
   :rdfs/range       :foaf/Document,
   :vs/term_status   "testing"})

(def isPrimaryTopicOf
  {:db/ident           :foaf/isPrimaryTopicOf,
   :owl/inverseOf      :foaf/primaryTopic,
   :rdf/type           #{:rdf/Property :owl/InverseFunctionalProperty},
   :rdfs/comment       "A document that this thing is the primary topic of.",
   :rdfs/domain        :owl/Thing,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label         "is primary topic of",
   :rdfs/range         :foaf/Document,
   :rdfs/subPropertyOf :foaf/page,
   :vs/term_status     "stable"})

(def jabberID
  {:db/ident         :foaf/jabberID,
   :rdf/type         #{:owl/DatatypeProperty :rdf/Property
                       :owl/InverseFunctionalProperty},
   :rdfs/comment     "A jabber ID for something.",
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "jabber ID",
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   "testing"})

(def knows
  {:db/ident :foaf/knows,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   "A person known by this person (indicating some level of reciprocated interaction between the parties).",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label "knows",
   :rdfs/range :foaf/Person,
   :vs/term_status "stable"})

(def lastName
  {:db/ident         :foaf/lastName,
   :rdf/type         #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment     "The last name of a person.",
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "lastName",
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   "testing"})

(def logo
  {:db/ident         :foaf/logo,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property
                       :owl/InverseFunctionalProperty},
   :rdfs/comment     "A logo representing some thing.",
   :rdfs/domain      :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "logo",
   :rdfs/range       :owl/Thing,
   :vs/term_status   "testing"})

(def made
  {:db/ident         :foaf/made,
   :owl/inverseOf    :foaf/maker,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     "Something that was made by this agent.",
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "made",
   :rdfs/range       :owl/Thing,
   :vs/term_status   "stable"})

(def maker
  {:db/ident               :foaf/maker,
   :owl/equivalentProperty :dcterms/creator,
   :owl/inverseOf          :foaf/made,
   :rdf/type               #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment           "An agent that  made this thing.",
   :rdfs/domain            :owl/Thing,
   :rdfs/isDefinedBy       {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label             "maker",
   :rdfs/range             :foaf/Agent,
   :vs/term_status         "stable"})

(def mbox
  {:db/ident :foaf/mbox,
   :rdf/type #{:owl/ObjectProperty :rdf/Property
               :owl/InverseFunctionalProperty},
   :rdfs/comment
   "A  personal mailbox, ie. an Internet mailbox associated with exactly one owner, the first owner of this mailbox. This is a 'static inverse functional property', in that  there is (across time and change) at most one individual that ever has any particular value for foaf:mbox.",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label "personal mailbox",
   :rdfs/range :owl/Thing,
   :vs/term_status "stable"})

(def mbox_sha1sum
  {:db/ident :foaf/mbox_sha1sum,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property
               :owl/InverseFunctionalProperty},
   :rdfs/comment
   "The sha1sum of the URI of an Internet mailbox associated with exactly one owner, the  first owner of the mailbox.",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label "sha1sum of a personal mailbox URI name",
   :rdfs/range :rdfs/Literal,
   :vs/term_status "testing"})

(def member
  {:db/ident         :foaf/member,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     "Indicates a member of a Group",
   :rdfs/domain      :foaf/Group,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "member",
   :rdfs/range       :foaf/Agent,
   :vs/term_status   "stable"})

(def membershipClass
  {:db/ident :foaf/membershipClass,
   :rdf/type #{:rdf/Property :owl/AnnotationProperty},
   :rdfs/comment
   "Indicates the class of individuals that are a member of a Group",
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label "membershipClass",
   :vs/term_status "unstable"})

(def msnChatID
  {:db/ident           :foaf/msnChatID,
   :rdf/type           #{:owl/DatatypeProperty :rdf/Property
                         :owl/InverseFunctionalProperty},
   :rdfs/comment       "An MSN chat ID",
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label         "MSN chat ID",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :foaf/nick,
   :vs/term_status     "testing"})

(def myersBriggs
  {:db/ident         :foaf/myersBriggs,
   :rdf/type         #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment     "A Myers Briggs (MBTI) personality classification.",
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "myersBriggs",
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   "testing"})

(def name
  {:db/ident           :foaf/name,
   :rdf/type           #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment       "A name for some thing.",
   :rdfs/domain        :owl/Thing,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label         "name",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :rdfs/label,
   :vs/term_status     "testing"})

(def nick
  {:db/ident :foaf/nick,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment
   "A short informal nickname characterising an agent (includes login identifiers, IRC and other chat nicknames).",
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label "nickname",
   :vs/term_status "testing"})

(def openid
  {:db/ident           :foaf/openid,
   :rdf/type           #{:owl/ObjectProperty :rdf/Property
                         :owl/InverseFunctionalProperty},
   :rdfs/comment       "An OpenID for an Agent.",
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label         "openid",
   :rdfs/range         :foaf/Document,
   :rdfs/subPropertyOf :foaf/isPrimaryTopicOf,
   :vs/term_status     "testing"})

(def page
  {:db/ident         :foaf/page,
   :owl/inverseOf    :foaf/topic,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     "A page or document about this thing.",
   :rdfs/domain      :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "page",
   :rdfs/range       :foaf/Document,
   :vs/term_status   "stable"})

(def pastProject
  {:db/ident         :foaf/pastProject,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     "A project this person has previously worked on.",
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "past project",
   :rdfs/range       :owl/Thing,
   :vs/term_status   "testing"})

(def phone
  {:db/ident :foaf/phone,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   "A phone,  specified using fully qualified tel: URI scheme (refs: http://www.w3.org/Addressing/schemes.html#tel).",
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label "phone",
   :vs/term_status "testing"})

(def plan
  {:db/ident :foaf/plan,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment
   "A .plan comment, in the tradition of finger and '.plan' files.",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label "plan",
   :rdfs/range :rdfs/Literal,
   :vs/term_status "testing"})

(def primaryTopic
  {:db/ident         :foaf/primaryTopic,
   :owl/inverseOf    :foaf/isPrimaryTopicOf,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property
                       :owl/FunctionalProperty},
   :rdfs/comment     "The primary topic of some page or document.",
   :rdfs/domain      :foaf/Document,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "primary topic",
   :rdfs/range       :owl/Thing,
   :vs/term_status   "stable"})

(def publications
  {:db/ident         :foaf/publications,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     "A link to the publications of this person.",
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "publications",
   :rdfs/range       :foaf/Document,
   :vs/term_status   "testing"})

(def schoolHomepage
  {:db/ident         :foaf/schoolHomepage,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     "A homepage of a school attended by the person.",
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "schoolHomepage",
   :rdfs/range       :foaf/Document,
   :vs/term_status   "testing"})

(def sha1
  {:db/ident         :foaf/sha1,
   :rdf/type         #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment     "A sha1sum hash, in hex.",
   :rdfs/domain      :foaf/Document,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "sha1sum (hex)",
   :vs/term_status   "unstable"})

(def skypeID
  {:db/ident           :foaf/skypeID,
   :rdf/type           #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment       "A Skype ID",
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label         "Skype ID",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :foaf/nick,
   :vs/term_status     "testing"})

(def status
  {:db/ident :foaf/status,
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment
   "A string expressing what the user is happy for the general public (normally) to know about their current activity.",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label "status",
   :rdfs/range :rdfs/Literal,
   :vs/term_status "unstable"})

(def surname
  {:db/ident         :foaf/surname,
   :rdf/type         #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment     "The surname of some person.",
   :rdfs/domain      :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "Surname",
   :rdfs/range       :rdfs/Literal,
   :vs/term_status   "archaic"})

(def theme
  {:db/ident         :foaf/theme,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     "A theme.",
   :rdfs/domain      :owl/Thing,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "theme",
   :rdfs/range       :owl/Thing,
   :vs/term_status   "archaic"})

(def thumbnail
  {:db/ident         :foaf/thumbnail,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     "A derived thumbnail image.",
   :rdfs/domain      :foaf/Image,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "thumbnail",
   :rdfs/range       :foaf/Image,
   :vs/term_status   "testing"})

(def tipjar
  {:db/ident :foaf/tipjar,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   "A tipjar document for this agent, describing means for payment and reward.",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label "tipjar",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :foaf/page,
   :vs/term_status "testing"})

(def title
  {:db/ident         :foaf/title,
   :rdf/type         #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment     "Title (Mr, Mrs, Ms, Dr. etc)",
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "title",
   :vs/term_status   "testing"})

(def topic
  {:db/ident         :foaf/topic,
   :owl/inverseOf    :foaf/page,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     "A topic of some page or document.",
   :rdfs/domain      :foaf/Document,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "topic",
   :rdfs/range       :owl/Thing,
   :vs/term_status   "testing"})

(def topic_interest
  {:db/ident         :foaf/topic_interest,
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     "A thing of interest to this person.",
   :rdfs/domain      :foaf/Agent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label       "topic_interest",
   :rdfs/range       :owl/Thing,
   :vs/term_status   "testing"})

(def weblog
  {:db/ident :foaf/weblog,
   :rdf/type #{:owl/ObjectProperty :rdf/Property
               :owl/InverseFunctionalProperty},
   :rdfs/comment
   "A weblog of some thing (whether person, group, company etc.).",
   :rdfs/domain :foaf/Agent,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label "weblog",
   :rdfs/range :foaf/Document,
   :rdfs/subPropertyOf :foaf/page,
   :vs/term_status "stable"})

(def workInfoHomepage
  {:db/ident :foaf/workInfoHomepage,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   "A work info homepage of some person; a page about their work for some organization.",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label "work info homepage",
   :rdfs/range :foaf/Document,
   :vs/term_status "testing"})

(def workplaceHomepage
  {:db/ident :foaf/workplaceHomepage,
   :rdf/type #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment
   "A workplace homepage of some person; the homepage of an organization they work for.",
   :rdfs/domain :foaf/Person,
   :rdfs/isDefinedBy {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label "workplace homepage",
   :rdfs/range :foaf/Document,
   :vs/term_status "testing"})

(def yahooChatID
  {:db/ident           :foaf/yahooChatID,
   :rdf/type           #{:owl/DatatypeProperty :rdf/Property
                         :owl/InverseFunctionalProperty},
   :rdfs/comment       "A Yahoo chat ID",
   :rdfs/domain        :foaf/Agent,
   :rdfs/isDefinedBy   {:xsd/anyURI "http://xmlns.com/foaf/0.1/"},
   :rdfs/label         "Yahoo chat ID",
   :rdfs/range         :rdfs/Literal,
   :rdfs/subPropertyOf :foaf/nick,
   :vs/term_status     "testing"})

(def urn:uuid:da0b7a03-14af-51bd-bbbf-4b180617f5c3112384
  {:dc11/description
   "The Friend of a Friend (FOAF) RDF vocabulary, described using W3C RDF Schema and the Web Ontology Language.",
   :dc11/title "Friend of a Friend (FOAF) vocabulary",
   :rdf/type :owl/Ontology,
   :xsd/anyURI "http://xmlns.com/foaf/0.1/"})