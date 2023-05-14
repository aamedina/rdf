(ns net.wikipunk.rdf.sioc
  "SIOC (Semantically-Interlinked Online Communities) is an ontology for describing the information in online communities. This information can be used to export information from online communities and to link them together. The scope of the application areas that SIOC can be used for includes (and is not limited to) weblogs, message boards, mailing lists and chat channels."
  {:dcterms/description
   #voc/lstr
    "SIOC (Semantically-Interlinked Online Communities) is an ontology for describing the information in online communities. \nThis information can be used to export information from online communities and to link them together. The scope of the application areas that SIOC can be used for includes (and is not limited to) weblogs, message boards, mailing lists and chat channels.@en",
   :dcterms/title #voc/lstr "SIOC Core Ontology Namespace@en",
   :owl/versionInfo "Revision: 1.36",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "sioc" "http://rdfs.org/sioc/ns#",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "wot" "http://xmlns.com/wot/0.1/"},
   :rdf/type [:owl/Thing :owl/Ontology],
   :rdfa/prefix "sioc",
   :rdfa/uri "http://rdfs.org/sioc/ns#",
   :rdfs/isDefinedBy
   {:rdf/uri "http://www.w3.org/Submission/2007/SUBM-sioc-spec-20070612/"},
   :rdfs/seeAlso ["http://rdfs.org/sioc/spec"]}
  (:refer-clojure :exclude [name]))

(def Community
  "Community is a high-level concept that defines an online community and what it consists of."
  {:db/ident :sioc/Community,
   :owl/disjointWith [:sioc/UserAccount :sioc/Role :sioc/Item],
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "Community is a high-level concept that defines an online community and what it consists of.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "Community@en"})

(def Container
  "An area in which content Items are contained."
  {:db/ident         :sioc/Container,
   :owl/disjointWith [:sioc/Usergroup :sioc/UserAccount :sioc/Role :sioc/Item],
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr
                      "An area in which content Items are contained.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "Container@en",
   :rdfs/subClassOf  :sioc/Container})

(def Forum
  "A discussion area on which Posts or entries are made."
  {:db/ident :sioc/Forum,
   :rdf/type :owl/Class,
   :rdfs/comment #voc/lstr
                  "A discussion area on which Posts or entries are made.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "Forum@en",
   :rdfs/subClassOf [:sioc/Container :sioc/Forum]})

(def Item
  "An Item is something which can be in a Container."
  {:db/ident :sioc/Item,
   :owl/disjointWith
   [:sioc/Usergroup :sioc/UserAccount :sioc/Space :sioc/Role :sioc/Container],
   :rdf/type :owl/Class,
   :rdfs/comment #voc/lstr
                  "An Item is something which can be in a Container.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "Item@en",
   :rdfs/subClassOf :sioc/Item})

(def Post
  "An article or message that can be posted to a Forum."
  {:db/ident         :sioc/Post,
   :rdf/type         :owl/Class,
   :rdfs/comment     #voc/lstr
                      "An article or message that can be posted to a Forum.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "Post@en",
   :rdfs/subClassOf  [:foaf/Document :sioc/Item :sioc/Post]})

(def Role
  "A Role is a function of a UserAccount within a scope of a particular Forum, Site, etc."
  {:db/ident :sioc/Role,
   :owl/disjointWith
   [:sioc/Usergroup :sioc/UserAccount :sioc/Space :sioc/Item :sioc/Container],
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A Role is a function of a UserAccount within a scope of a particular Forum, Site, etc.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "Role@en"})

(def Site
  "A Site can be the location of an online community or set of communities, with UserAccounts and Usergroups creating Items in a set of Containers. It can be thought of as a web-accessible data Space."
  {:db/ident :sioc/Site,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A Site can be the location of an online community or set of communities, with UserAccounts and Usergroups creating Items in a set of Containers. It can be thought of as a web-accessible data Space.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "Site@en",
   :rdfs/subClassOf [:sioc/Space :sioc/Site]})

(def Space
  "A Space is a place where data resides, e.g. on a website, desktop, fileshare, etc."
  {:db/ident :sioc/Space,
   :owl/disjointWith [:sioc/Usergroup :sioc/UserAccount :sioc/Role :sioc/Item],
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A Space is a place where data resides, e.g. on a website, desktop, fileshare, etc.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "Space@en",
   :rdfs/subClassOf :sioc/Space})

(def ThreadClass
  "A container for a series of threaded discussion Posts or Items."
  {:db/ident :sioc/Thread,
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A container for a series of threaded discussion Posts or Items.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "Thread@en",
   :rdfs/subClassOf [:sioc/Container :sioc/Thread]})

(def User
  "UserAccount is now preferred. This is a deprecated class for a User in an online community site."
  {:db/ident :sioc/User,
   :owl/disjointWith
   [:sioc/Role :sioc/Usergroup :sioc/Container :sioc/Item :sioc/Space],
   :owl/equivalentClass :sioc/UserAccount,
   :owl/versionInfo
   "This class is deprecated. Use sioc:UserAccount from the SIOC ontology instead.",
   :rdf/type :owl/DeprecatedClass,
   :rdfs/comment
   #voc/lstr
    "UserAccount is now preferred. This is a deprecated class for a User in an online community site.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "User@en",
   :rdfs/subClassOf [:foaf/OnlineAccount :sioc/User]})

(def UserAccount
  "A user account in an online community site."
  {:db/ident :sioc/UserAccount,
   :owl/disjointWith
   [:sioc/Role :sioc/Usergroup :sioc/Space :sioc/Container :sioc/Item],
   :rdf/type :owl/Class,
   :rdfs/comment #voc/lstr "A user account in an online community site.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "User Account@en",
   :rdfs/subClassOf [:foaf/OnlineAccount :sioc/UserAccount]})

(def Usergroup
  "A set of UserAccounts whose owners have a common purpose or interest. Can be used for access control purposes."
  {:db/ident :sioc/Usergroup,
   :owl/disjointWith
   [:sioc/UserAccount :sioc/Space :sioc/Role :sioc/Item :sioc/Container],
   :rdf/type :owl/Class,
   :rdfs/comment
   #voc/lstr
    "A set of UserAccounts whose owners have a common purpose or interest. Can be used for access control purposes.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "Usergroup@en"})

(def about
  "Specifies that this Item is about a particular resource, e.g. a Post describing a book, hotel, etc."
  {:db/ident :sioc/about,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Specifies that this Item is about a particular resource, e.g. a Post describing a book, hotel, etc.@en",
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "about@en"})

(def account_of
  "Refers to the foaf:Agent or foaf:Person who owns this sioc:UserAccount."
  {:db/ident :sioc/account_of,
   :owl/inverseOf :foaf/account,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Refers to the foaf:Agent or foaf:Person who owns this sioc:UserAccount.@en",
   :rdfs/domain :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "account of@en",
   :rdfs/range :foaf/Agent})

(def addressed_to
  "Refers to who (e.g. a UserAccount, e-mail address, etc.) a particular Item is addressed to."
  {:db/ident :sioc/addressed_to,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Refers to who (e.g. a UserAccount, e-mail address, etc.) a particular Item is addressed to.@en",
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "addressed to@en"})

(def administrator_of
  "A Site that the UserAccount is an administrator of."
  {:db/ident         :sioc/administrator_of,
   :owl/inverseOf    :sioc/has_administrator,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr
                      "A Site that the UserAccount is an administrator of.@en",
   :rdfs/domain      :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "administrator of@en",
   :rdfs/range       :sioc/Site})

(def attachment
  "The URI of a file attached to an Item."
  {:db/ident         :sioc/attachment,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr "The URI of a file attached to an Item.@en",
   :rdfs/domain      :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "attachment@en"})

(def avatar
  "An image or depiction used to represent this UserAccount."
  {:db/ident :sioc/avatar,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr "An image or depiction used to represent this UserAccount.@en",
   :rdfs/domain :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "avatar@en",
   :rdfs/subPropertyOf [:foaf/depiction :sioc/avatar]})

(def container_of
  "An Item that this Container contains."
  {:db/ident           :sioc/container_of,
   :owl/inverseOf      :sioc/has_container,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       #voc/lstr "An Item that this Container contains.@en",
   :rdfs/domain        :sioc/Container,
   :rdfs/isDefinedBy   "http://rdfs.org/sioc/ns#",
   :rdfs/label         #voc/lstr "container of@en",
   :rdfs/range         :sioc/Item,
   :rdfs/subPropertyOf [:dcterms/hasPart :sioc/container_of]})

(def content
  "The content of the Item in plain text format."
  {:db/ident         :sioc/content,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     #voc/lstr
                      "The content of the Item in plain text format.@en",
   :rdfs/domain      :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "content@en",
   :rdfs/range       :rdfs/Literal})

(def content_encoded
  "The encoded content of the Post, contained in CDATA areas."
  {:db/ident :sioc/content_encoded,
   :owl/versionInfo
   "This property is deprecated. Use content:encoded from the RSS 1.0 content module instead.",
   :rdf/type [:owl/DatatypeProperty :owl/DeprecatedProperty],
   :rdfs/comment
   #voc/lstr "The encoded content of the Post, contained in CDATA areas.@en",
   :rdfs/domain :sioc/Post,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "content encoded@en",
   :rdfs/range :rdfs/Literal})

(def created_at
  "When this was created, in ISO 8601 format."
  {:db/ident :sioc/created_at,
   :owl/versionInfo
   "This property is deprecated. Use dcterms:created from the Dublin Core ontology instead.",
   :rdf/type [:owl/DatatypeProperty :owl/DeprecatedProperty],
   :rdfs/comment #voc/lstr "When this was created, in ISO 8601 format.@en",
   :rdfs/domain :sioc/Post,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "created at@en",
   :rdfs/range :rdfs/Literal})

(def creator_of
  "A resource that the UserAccount is a creator of."
  {:db/ident         :sioc/creator_of,
   :owl/inverseOf    :sioc/has_creator,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr
                      "A resource that the UserAccount is a creator of.@en",
   :rdfs/domain      :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "creator of@en"})

(def delivered_at
  "When this was delivered, in ISO 8601 format."
  {:db/ident         :sioc/delivered_at,
   :rdf/type         [:owl/DatatypeProperty :owl/ObjectProperty],
   :rdfs/comment     #voc/lstr
                      "When this was delivered, in ISO 8601 format.@en",
   :rdfs/domain      :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "delivered at@en",
   :rdfs/range       :rdfs/Literal})

(def description
  "The content of the Post."
  {:db/ident :sioc/description,
   :owl/versionInfo
   "This property is deprecated. Use sioc:content or other methods (AtomOwl, content:encoded from RSS 1.0, etc.) instead.",
   :rdf/type [:owl/DatatypeProperty :owl/DeprecatedProperty],
   :rdfs/comment #voc/lstr "The content of the Post.@en",
   :rdfs/domain :sioc/Post,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "description@en",
   :rdfs/range :rdfs/Literal})

(def discussion_of
  "The Item that this discussion is about."
  {:db/ident         :sioc/discussion_of,
   :owl/inverseOf    :sioc/has_discussion,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr "The Item that this discussion is about.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "discussion of@en",
   :rdfs/range       :sioc/Item})

(def earlier_version
  "Links to a previous (older) revision of this Item or Post."
  {:db/ident :sioc/earlier_version,
   :owl/inverseOf :sioc/later_version,
   :rdf/type :owl/TransitiveProperty,
   :rdfs/comment
   #voc/lstr "Links to a previous (older) revision of this Item or Post.@en",
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "earlier version@en",
   :rdfs/range :sioc/Item,
   :rdfs/subPropertyOf :sioc/earlier_version})

(def email
  "An electronic mail address of the UserAccount."
  {:db/ident         :sioc/email,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr
                      "An electronic mail address of the UserAccount.@en",
   :rdfs/domain      :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "email@en"})

(def email_sha1
  "An electronic mail address of the UserAccount, encoded using SHA1."
  {:db/ident :sioc/email_sha1,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "An electronic mail address of the UserAccount, encoded using SHA1.@en",
   :rdfs/domain :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "email sha1@en",
   :rdfs/range :rdfs/Literal})

(def embeds_knowledge
  "This links Items to embedded statements, facts and structured content."
  {:db/ident :sioc/embeds_knowledge,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "This links Items to embedded statements, facts and structured content.@en",
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "embeds knowledge@en",
   :rdfs/range :rdfg/Graph})

(def feed
  "A feed (e.g. RSS, Atom, etc.) pertaining to this resource (e.g. for a Forum, Site, UserAccount, etc.)."
  {:db/ident :sioc/feed,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "A feed (e.g. RSS, Atom, etc.) pertaining to this resource (e.g. for a Forum, Site, UserAccount, etc.).@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "feed@en"})

(def first_name
  "First (real) name of this User. Synonyms include given name or christian name."
  {:db/ident :sioc/first_name,
   :owl/versionInfo
   "This property is deprecated. Use foaf:name or foaf:firstName from the FOAF vocabulary instead.",
   :rdf/type [:owl/DatatypeProperty :owl/DeprecatedProperty],
   :rdfs/comment
   #voc/lstr
    "First (real) name of this User. Synonyms include given name or christian name.@en",
   :rdfs/domain :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "first name@en",
   :rdfs/range :rdfs/Literal})

(def follows
  "Indicates that one UserAccount follows another UserAccount (e.g. for microblog posts or other content item updates)."
  {:db/ident :sioc/follows,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Indicates that one UserAccount follows another UserAccount (e.g. for microblog posts or other content item updates).@en",
   :rdfs/domain :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "follows@en",
   :rdfs/range :sioc/UserAccount})

(def function_of
  "A UserAccount that has this Role."
  {:db/ident         :sioc/function_of,
   :owl/inverseOf    :sioc/has_function,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr "A UserAccount that has this Role.@en",
   :rdfs/domain      :sioc/Role,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "function of@en"})

(def generator
  "A URI for the application used to generate this Item."
  {:db/ident :sioc/generator,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment #voc/lstr
                  "A URI for the application used to generate this Item.@en",
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "generator@en"})

(def group_of
  "group of"
  {:db/ident :sioc/group_of,
   :owl/inverseOf :sioc/has_group,
   :owl/versionInfo
   "This property has been renamed. Use sioc:usergroup_of instead.",
   :rdf/type [:owl/ObjectProperty :owl/DeprecatedProperty],
   :rdfs/label #voc/lstr "group of@en"})

(def has_administrator
  "A UserAccount that is an administrator of this Site."
  {:db/ident         :sioc/has_administrator,
   :owl/inverseOf    :sioc/administrator_of,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr
                      "A UserAccount that is an administrator of this Site.@en",
   :rdfs/domain      :sioc/Site,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "has administrator@en",
   :rdfs/range       :sioc/UserAccount})

(def has_container
  "The Container to which this Item belongs."
  {:db/ident           :sioc/has_container,
   :owl/inverseOf      :sioc/container_of,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       #voc/lstr "The Container to which this Item belongs.@en",
   :rdfs/domain        :sioc/Item,
   :rdfs/isDefinedBy   "http://rdfs.org/sioc/ns#",
   :rdfs/label         #voc/lstr "has container@en",
   :rdfs/range         :sioc/Container,
   :rdfs/subPropertyOf [:dcterms/partOf :sioc/has_container]})

(def has_creator
  "This is the UserAccount that made this resource."
  {:db/ident         :sioc/has_creator,
   :owl/inverseOf    :sioc/creator_of,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr
                      "This is the UserAccount that made this resource.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "has creator@en",
   :rdfs/range       :sioc/UserAccount})

(def has_discussion
  "A discussion that is related to this Item. The discussion can be anything, for example, a sioc:Forum or sioc:Thread, a sioct:WikiArticle or simply a foaf:Document."
  {:db/ident :sioc/has_discussion,
   :owl/inverseOf :sioc/discussion_of,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "A discussion that is related to this Item. The discussion can be anything, for example, a sioc:Forum or sioc:Thread, a sioct:WikiArticle or simply a foaf:Document.@en",
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "has discussion@en"})

(def has_function
  "A Role that this UserAccount has."
  {:db/ident         :sioc/has_function,
   :owl/inverseOf    :sioc/function_of,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr "A Role that this UserAccount has.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "has function@en",
   :rdfs/range       :sioc/Role})

(def has_group
  "has group"
  {:db/ident :sioc/has_group,
   :owl/inverseOf :sioc/group_of,
   :owl/versionInfo
   "This property has been renamed. Use sioc:has_usergroup instead.",
   :rdf/type [:owl/ObjectProperty :owl/DeprecatedProperty],
   :rdfs/label #voc/lstr "has group@en"})

(def has_host
  "The Site that hosts this Container."
  {:db/ident           :sioc/has_host,
   :owl/inverseOf      :sioc/host_of,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       #voc/lstr "The Site that hosts this Container.@en",
   :rdfs/domain        :sioc/Container,
   :rdfs/isDefinedBy   "http://rdfs.org/sioc/ns#",
   :rdfs/label         #voc/lstr "has host@en",
   :rdfs/range         :sioc/Site,
   :rdfs/subPropertyOf [:sioc/has_space :sioc/has_host :dcterms/partOf]})

(def has_member
  "A UserAccount that is a member of this Usergroup."
  {:db/ident         :sioc/has_member,
   :owl/inverseOf    :sioc/member_of,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr
                      "A UserAccount that is a member of this Usergroup.@en",
   :rdfs/domain      :sioc/Usergroup,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "has member@en",
   :rdfs/range       :sioc/UserAccount})

(def has_moderator
  "A UserAccount that is a moderator of this Forum."
  {:db/ident         :sioc/has_moderator,
   :owl/inverseOf    :sioc/moderator_of,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr
                      "A UserAccount that is a moderator of this Forum.@en",
   :rdfs/domain      :sioc/Forum,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "has moderator@en",
   :rdfs/range       :sioc/UserAccount})

(def has_modifier
  "A UserAccount that modified this resource (e.g. Item, Container, Space)."
  {:db/ident :sioc/has_modifier,
   :owl/inverseOf :sioc/modifier_of,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "A UserAccount that modified this resource (e.g. Item, Container, Space).@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "has modifier@en",
   :rdfs/range :sioc/UserAccount})

(def has_owner
  "A UserAccount that this resource is owned by."
  {:db/ident         :sioc/has_owner,
   :owl/inverseOf    :sioc/owner_of,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr
                      "A UserAccount that this resource is owned by.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "has owner@en",
   :rdfs/range       :sioc/UserAccount})

(def has_parent
  "A Container or Forum that this Container or Forum is a child of."
  {:db/ident :sioc/has_parent,
   :owl/inverseOf :sioc/parent_of,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "A Container or Forum that this Container or Forum is a child of.@en",
   :rdfs/domain :sioc/Container,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "has parent@en",
   :rdfs/range :sioc/Container,
   :rdfs/subPropertyOf [:dcterms/partOf :sioc/has_parent]})

(def has_part
  "An resource that is a part of this subject."
  {:db/ident :sioc/has_part,
   :owl/inverseOf :sioc/part_of,
   :owl/versionInfo
   "This property is deprecated. Use dcterms:hasPart from the Dublin Core ontology instead.",
   :rdf/type [:owl/ObjectProperty :owl/DeprecatedProperty],
   :rdfs/comment #voc/lstr "An resource that is a part of this subject.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "has part@en"})

(def has_reply
  "Points to an Item or Post that is a reply or response to this Item or Post."
  {:db/ident :sioc/has_reply,
   :owl/inverseOf :sioc/reply_of,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Points to an Item or Post that is a reply or response to this Item or Post.@en",
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "has reply@en",
   :rdfs/range :sioc/Item,
   :rdfs/subPropertyOf [:sioc/related_to :sioc/has_reply]})

(def has_scope
  "A resource that this Role applies to."
  {:db/ident         :sioc/has_scope,
   :owl/inverseOf    :sioc/scope_of,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr "A resource that this Role applies to.@en",
   :rdfs/domain      :sioc/Role,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "has scope@en"})

(def has_space
  "A data Space which this resource is a part of."
  {:db/ident           :sioc/has_space,
   :owl/inverseOf      :sioc/space_of,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       #voc/lstr
                        "A data Space which this resource is a part of.@en",
   :rdfs/isDefinedBy   "http://rdfs.org/sioc/ns#",
   :rdfs/label         #voc/lstr "has space@en",
   :rdfs/range         :sioc/Space,
   :rdfs/subPropertyOf [:dcterms/partOf :sioc/has_space]})

(def has_subscriber
  "A UserAccount that is subscribed to this Container."
  {:db/ident         :sioc/has_subscriber,
   :owl/inverseOf    :sioc/subscriber_of,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr
                      "A UserAccount that is subscribed to this Container.@en",
   :rdfs/domain      :sioc/Container,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "has subscriber@en",
   :rdfs/range       :sioc/UserAccount,
   :rdfs/seeAlso     ["http://rdfs.org/sioc/ns#feed"]})

(def has_usergroup
  "Points to a Usergroup that has certain access to this Space."
  {:db/ident :sioc/has_usergroup,
   :owl/inverseOf :sioc/usergroup_of,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr "Points to a Usergroup that has certain access to this Space.@en",
   :rdfs/domain :sioc/Space,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "has usergroup@en",
   :rdfs/range :sioc/Usergroup})

(def host_of
  "A Container that is hosted on this Site."
  {:db/ident           :sioc/host_of,
   :owl/inverseOf      :sioc/has_host,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       #voc/lstr "A Container that is hosted on this Site.@en",
   :rdfs/domain        :sioc/Site,
   :rdfs/isDefinedBy   "http://rdfs.org/sioc/ns#",
   :rdfs/label         #voc/lstr "host of@en",
   :rdfs/range         :sioc/Container,
   :rdfs/subPropertyOf [:sioc/space_of :sioc/host_of :dcterms/hasPart]})

(def id
  "An identifier of a SIOC concept instance. For example, a user ID. Must be unique for instances of each type of SIOC concept within the same site."
  {:db/ident :sioc/id,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "An identifier of a SIOC concept instance. For example, a user ID. Must be unique for instances of each type of SIOC concept within the same site.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "id@en",
   :rdfs/range :rdfs/Literal})

(def ip_address
  "The IP address used when creating this Item, UserAccount, etc. This can be associated with a creator. Some wiki articles list the IP addresses for the creator or modifiers when the usernames are absent."
  {:db/ident :sioc/ip_address,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "The IP address used when creating this Item, UserAccount, etc. This can be associated with a creator. Some wiki articles list the IP addresses for the creator or modifiers when the usernames are absent.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "ip address@en",
   :rdfs/range :rdfs/Literal})

(def last_activity_date
  "The date and time of the last activity associated with a SIOC concept instance, and expressed in ISO 8601 format. This could be due to a reply Post or Comment, a modification to an Item, etc."
  {:db/ident :sioc/last_activity_date,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "The date and time of the last activity associated with a SIOC concept instance, and expressed in ISO 8601 format. This could be due to a reply Post or Comment, a modification to an Item, etc.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "last activity date@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:dcterms/date :sioc/last_activity_date]})

(def last_item_date
  "The date and time of the last Post (or Item) in a Forum (or a Container), in ISO 8601 format."
  {:db/ident :sioc/last_item_date,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "The date and time of the last Post (or Item) in a Forum (or a Container), in ISO 8601 format.@en",
   :rdfs/domain :sioc/Container,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "last item date@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:dcterms/date :sioc/last_item_date]})

(def last_name
  "Last (real) name of this user. Synonyms include surname or family name."
  {:db/ident :sioc/last_name,
   :owl/versionInfo
   "This property is deprecated. Use foaf:name or foaf:surname from the FOAF vocabulary instead.",
   :rdf/type [:owl/DatatypeProperty :owl/DeprecatedProperty],
   :rdfs/comment
   #voc/lstr
    "Last (real) name of this user. Synonyms include surname or family name.@en",
   :rdfs/domain :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "last name@en",
   :rdfs/range :rdfs/Literal})

(def last_reply_date
  "The date and time of the last reply Post or Comment, which could be associated with a starter Item or Post or with a Thread, and expressed in ISO 8601 format."
  {:db/ident :sioc/last_reply_date,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "The date and time of the last reply Post or Comment, which could be associated with a starter Item or Post or with a Thread, and expressed in ISO 8601 format.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "last reply date@en",
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf [:dcterms/date :sioc/last_reply_date]})

(def later_version
  "Links to a later (newer) revision of this Item or Post."
  {:db/ident :sioc/later_version,
   :owl/inverseOf :sioc/earlier_version,
   :rdf/type :owl/TransitiveProperty,
   :rdfs/comment #voc/lstr
                  "Links to a later (newer) revision of this Item or Post.@en",
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "later version@en",
   :rdfs/range :sioc/Item,
   :rdfs/subPropertyOf :sioc/later_version})

(def latest_version
  "Links to the latest revision of this Item or Post."
  {:db/ident         :sioc/latest_version,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr
                      "Links to the latest revision of this Item or Post.@en",
   :rdfs/domain      :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "latest version@en",
   :rdfs/range       :sioc/Item})

(def likes
  "Used to indicate some form of endorsement by a UserAccount or Agent of an Item, Container, Space, UserAccount, etc."
  {:db/ident :sioc/likes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Used to indicate some form of endorsement by a UserAccount or Agent of an Item, Container, Space, UserAccount, etc.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "likes@en"})

(def link
  "A URI of a document which contains this SIOC object."
  {:db/ident         :sioc/link,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr
                      "A URI of a document which contains this SIOC object.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "link@en"})

(def links_to
  "Links extracted from hyperlinks within a SIOC concept, e.g. Post or Site."
  {:db/ident :sioc/links_to,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Links extracted from hyperlinks within a SIOC concept, e.g. Post or Site.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "links to@en",
   :rdfs/subPropertyOf [:dcterms/references :sioc/links_to]})

(def member_of
  "A Usergroup that this UserAccount is a member of."
  {:db/ident         :sioc/member_of,
   :owl/inverseOf    :sioc/has_member,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr
                      "A Usergroup that this UserAccount is a member of.@en",
   :rdfs/domain      :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "member of@en",
   :rdfs/range       :sioc/Usergroup})

(def mentions
  "Refers to a UserAccount that a particular Item mentions."
  {:db/ident :sioc/mentions,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment #voc/lstr
                  "Refers to a UserAccount that a particular Item mentions.@en",
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "mentions@en",
   :rdfs/range :sioc/UserAccount})

(def moderator_of
  "A Forum that a UserAccount is a moderator of."
  {:db/ident         :sioc/moderator_of,
   :owl/inverseOf    :sioc/has_moderator,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr
                      "A Forum that a UserAccount is a moderator of.@en",
   :rdfs/domain      :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "moderator of@en",
   :rdfs/range       :sioc/Forum})

(def modified_at
  "When this was modified, in ISO 8601 format."
  {:db/ident :sioc/modified_at,
   :owl/versionInfo
   "This property is deprecated. Use dcterms:modified from the Dublin Core ontology instead.",
   :rdf/type [:owl/DatatypeProperty :owl/DeprecatedProperty],
   :rdfs/comment #voc/lstr "When this was modified, in ISO 8601 format.@en",
   :rdfs/domain :sioc/Post,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "modified at@en",
   :rdfs/range :rdfs/Literal})

(def modifier_of
  "A resource that this UserAccount has modified."
  {:db/ident         :sioc/modifier_of,
   :owl/inverseOf    :sioc/has_modifier,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr
                      "A resource that this UserAccount has modified.@en",
   :rdfs/domain      :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "modifier of@en"})

(def name
  "The name of a SIOC concept instance, e.g. a username for a UserAccount, group name for a Usergroup, etc."
  {:db/ident :sioc/name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "The name of a SIOC concept instance, e.g. a username for a UserAccount, group name for a Usergroup, etc.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "name@en",
   :rdfs/range :rdfs/Literal})

(def next_by_date
  "Next Item or Post in a given Container sorted by date."
  {:db/ident :sioc/next_by_date,
   :owl/inverseOf :sioc/previous_by_date,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment #voc/lstr
                  "Next Item or Post in a given Container sorted by date.@en",
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "next by date@en",
   :rdfs/range :sioc/Item})

(def next_version
  "Links to the next revision of this Item or Post."
  {:db/ident           :sioc/next_version,
   :owl/inverseOf      :sioc/previous_version,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       #voc/lstr
                        "Links to the next revision of this Item or Post.@en",
   :rdfs/domain        :sioc/Item,
   :rdfs/isDefinedBy   "http://rdfs.org/sioc/ns#",
   :rdfs/label         #voc/lstr "next version@en",
   :rdfs/range         :sioc/Item,
   :rdfs/subPropertyOf [:sioc/later_version :sioc/next_version]})

(def note
  "A note associated with this resource, for example, if it has been edited by a UserAccount."
  {:db/ident :sioc/note,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "A note associated with this resource, for example, if it has been edited by a UserAccount.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "note@en",
   :rdfs/range :rdfs/Literal})

(def num_authors
  "The number of unique authors (UserAccounts and unregistered posters) who have contributed to this Item, Thread, Post, etc."
  {:db/ident :sioc/num_authors,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "The number of unique authors (UserAccounts and unregistered posters) who have contributed to this Item, Thread, Post, etc.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "num authors@en",
   :rdfs/range :xsd/nonNegativeInteger})

(def num_items
  "The number of Posts (or Items) in a Forum (or a Container)."
  {:db/ident :sioc/num_items,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr "The number of Posts (or Items) in a Forum (or a Container).@en",
   :rdfs/domain :sioc/Container,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "num items@en",
   :rdfs/range :xsd/nonNegativeInteger})

(def num_replies
  "The number of replies that this Item, Thread, Post, etc. has. Useful for when the reply structure is absent."
  {:db/ident :sioc/num_replies,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "The number of replies that this Item, Thread, Post, etc. has. Useful for when the reply structure is absent.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "num replies@en",
   :rdfs/range :xsd/nonNegativeInteger})

(def num_threads
  "The number of Threads (AKA discussion topics) in a Forum."
  {:db/ident :sioc/num_threads,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr "The number of Threads (AKA discussion topics) in a Forum.@en",
   :rdfs/domain :sioc/Forum,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "num threads@en",
   :rdfs/range :xsd/nonNegativeInteger})

(def num_views
  "The number of times this Item, Thread, UserAccount profile, etc. has been viewed."
  {:db/ident :sioc/num_views,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #voc/lstr
    "The number of times this Item, Thread, UserAccount profile, etc. has been viewed.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "num views@en",
   :rdfs/range :xsd/nonNegativeInteger})

(def owner_of
  "A resource owned by a particular UserAccount, for example, a weblog or image gallery."
  {:db/ident :sioc/owner_of,
   :owl/inverseOf :sioc/has_owner,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "A resource owned by a particular UserAccount, for example, a weblog or image gallery.@en",
   :rdfs/domain :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "owner of@en"})

(def parent_of
  "A child Container or Forum that this Container or Forum is a parent of."
  {:db/ident :sioc/parent_of,
   :owl/inverseOf :sioc/has_parent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "A child Container or Forum that this Container or Forum is a parent of.@en",
   :rdfs/domain :sioc/Container,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "parent of@en",
   :rdfs/range :sioc/Container,
   :rdfs/subPropertyOf [:dcterms/hasPart :sioc/parent_of]})

(def part_of
  "A resource that the subject is a part of."
  {:db/ident :sioc/part_of,
   :owl/inverseOf :sioc/has_part,
   :owl/versionInfo
   "This property is deprecated. Use dcterms:isPartOf from the Dublin Core ontology instead.",
   :rdf/type [:owl/ObjectProperty :owl/DeprecatedProperty],
   :rdfs/comment #voc/lstr "A resource that the subject is a part of.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "part of@en"})

(def previous_by_date
  "Previous Item or Post in a given Container sorted by date."
  {:db/ident :sioc/previous_by_date,
   :owl/inverseOf :sioc/next_by_date,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr "Previous Item or Post in a given Container sorted by date.@en",
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "previous by date@en",
   :rdfs/range :sioc/Item})

(def previous_version
  "Links to the previous revision of this Item or Post."
  {:db/ident :sioc/previous_version,
   :owl/inverseOf :sioc/next_version,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment #voc/lstr
                  "Links to the previous revision of this Item or Post.@en",
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "previous version@en",
   :rdfs/range :sioc/Item,
   :rdfs/subPropertyOf [:sioc/earlier_version :sioc/previous_version]})

(def read_at
  "When this was read, in ISO 8601 format."
  {:db/ident         :sioc/read_at,
   :rdf/type         [:owl/DatatypeProperty :owl/ObjectProperty],
   :rdfs/comment     #voc/lstr "When this was read, in ISO 8601 format.@en",
   :rdfs/domain      :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "read at@en",
   :rdfs/range       :rdfs/Literal})

(def reference
  "Links either created explicitly or extracted implicitly on the HTML level from the Post."
  {:db/ident :sioc/reference,
   :owl/versionInfo "Renamed to sioc:links_to.",
   :rdf/type [:owl/ObjectProperty :owl/DeprecatedProperty],
   :rdfs/comment
   #voc/lstr
    "Links either created explicitly or extracted implicitly on the HTML level from the Post.@en",
   :rdfs/domain :sioc/Post,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "reference@en"})

(def related_to
  "Related resources for this resource, e.g. for Posts, perhaps determined implicitly from topics or references."
  {:db/ident :sioc/related_to,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Related resources for this resource, e.g. for Posts, perhaps determined implicitly from topics or references.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "related to@en",
   :rdfs/subPropertyOf :sioc/related_to})

(def reply_of
  "Links to an Item or Post which this Item or Post is a reply to."
  {:db/ident :sioc/reply_of,
   :owl/inverseOf :sioc/has_reply,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "Links to an Item or Post which this Item or Post is a reply to.@en",
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "reply of@en",
   :rdfs/range :sioc/Item,
   :rdfs/subPropertyOf [:sioc/related_to :sioc/reply_of]})

(def respond_to
  "For the reply-to address set in email messages, IMs, etc. The property name was chosen to avoid confusion with has_reply/reply_of (the reply graph)."
  {:db/ident :sioc/respond_to,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "For the reply-to address set in email messages, IMs, etc. The property name was chosen to avoid confusion with has_reply/reply_of (the reply graph).@en",
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "respond to@en"})

(def scope_of
  "A Role that has a scope of this resource."
  {:db/ident         :sioc/scope_of,
   :owl/inverseOf    :sioc/has_scope,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr "A Role that has a scope of this resource.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "scope of@en",
   :rdfs/range       :sioc/Role})

(def shared_by
  "For shared Items where there is a certain creator_of and an intermediary who shares or forwards it (e.g. as a sibling Item)."
  {:db/ident :sioc/shared_by,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "For shared Items where there is a certain creator_of and an intermediary who shares or forwards it (e.g. as a sibling Item).@en",
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "shared by@en",
   :rdfs/range :sioc/UserAccount,
   :rdfs/seeAlso ["http://rdfs.org/sioc/ns#sibling"]})

(def sibling
  "An Item may have a sibling or a twin that exists in a different Container, but the siblings may differ in some small way (for example, language, category, etc.). The sibling of this Item should be self-describing (that is, it should contain all available information)."
  {:db/ident :sioc/sibling,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/comment
   #voc/lstr
    "An Item may have a sibling or a twin that exists in a different Container, but the siblings may differ in some small way (for example, language, category, etc.). The sibling of this Item should be self-describing (that is, it should contain all available information).@en",
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "sibling@en",
   :rdfs/range :sioc/Item})

(def space_of
  "A resource which belongs to this data Space."
  {:db/ident           :sioc/space_of,
   :owl/inverseOf      :sioc/has_space,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       #voc/lstr
                        "A resource which belongs to this data Space.@en",
   :rdfs/domain        :sioc/Space,
   :rdfs/isDefinedBy   "http://rdfs.org/sioc/ns#",
   :rdfs/label         #voc/lstr "space of@en",
   :rdfs/subPropertyOf [:dcterms/hasPart :sioc/space_of]})

(def subject
  "Keyword(s) describing subject of the Post."
  {:db/ident :sioc/subject,
   :owl/versionInfo
   "This property is deprecated. Use dcterms:subject from the Dublin Core ontology for text keywords and sioc:topic if the subject can be represented by a URI instead.",
   :rdf/type [:owl/DatatypeProperty :owl/DeprecatedProperty],
   :rdfs/comment #voc/lstr "Keyword(s) describing subject of the Post.@en",
   :rdfs/domain :sioc/Post,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "subject@en",
   :rdfs/range :rdfs/Literal})

(def subscriber_of
  "A Container that a UserAccount is subscribed to."
  {:db/ident         :sioc/subscriber_of,
   :owl/inverseOf    :sioc/has_subscriber,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr
                      "A Container that a UserAccount is subscribed to.@en",
   :rdfs/domain      :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "subscriber of@en",
   :rdfs/range       :sioc/Container,
   :rdfs/seeAlso     ["http://rdfs.org/sioc/ns#feed"]})

(def title
  "This is the title (subject line) of the Post. Note that for a Post within a threaded discussion that has no parents, it would detail the topic thread."
  {:db/ident :sioc/title,
   :owl/versionInfo
   "This property is deprecated. Use dcterms:title from the Dublin Core ontology instead.",
   :rdf/type [:owl/DatatypeProperty :owl/DeprecatedProperty],
   :rdfs/comment
   #voc/lstr
    "This is the title (subject line) of the Post. Note that for a Post within a threaded discussion that has no parents, it would detail the topic thread.@en",
   :rdfs/domain :sioc/Post,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "title@en",
   :rdfs/range :rdfs/Literal})

(def topic
  "A topic of interest, linking to the appropriate URI, e.g. in the Open Directory Project or of a SKOS category."
  {:db/ident :sioc/topic,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #voc/lstr
    "A topic of interest, linking to the appropriate URI, e.g. in the Open Directory Project or of a SKOS category.@en",
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label #voc/lstr "topic@en",
   :rdfs/subPropertyOf [:dcterms/subject :sioc/topic]})

(def usergroup_of
  "A Space that the Usergroup has access to."
  {:db/ident         :sioc/usergroup_of,
   :owl/inverseOf    :sioc/has_usergroup,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #voc/lstr "A Space that the Usergroup has access to.@en",
   :rdfs/domain      :sioc/Usergroup,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       #voc/lstr "usergroup of@en",
   :rdfs/range       :sioc/Space})

(def ^{:private true} Agent
  {:db/ident :foaf/Agent,
   :rdf/type :owl/Class})

(def ^{:private true} Document
  {:db/ident        :foaf/Document,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :foaf/Document})

(def ^{:private true} OnlineAccount
  {:db/ident        :foaf/OnlineAccount,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :foaf/OnlineAccount})

(def ^{:private true} account
  {:db/ident :foaf/account,
   :rdf/type :owl/ObjectProperty})

(def ^{:private true} depiction
  {:db/ident :foaf/depiction,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf :foaf/depiction})