(ns net.wikipunk.rdf.sioc
  "SIOC (Semantically-Interlinked Online Communities) is an ontology for describing the information in online communities. This information can be used to export information from online communities and to link them together. The scope of the application areas that SIOC can be used for includes (and is not limited to) weblogs, message boards, mailing lists and chat channels."
  {:dcterms/description
   {:rdf/language "en",
    :rdf/value
    "SIOC (Semantically-Interlinked Online Communities) is an ontology for describing the information in online communities. \nThis information can be used to export information from online communities and to link them together. The scope of the application areas that SIOC can be used for includes (and is not limited to) weblogs, message boards, mailing lists and chat channels."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "SIOC Core Ontology Namespace"},
   :owl/versionInfo "Revision: 1.36",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "sioc" "http://rdfs.org/sioc/ns#",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "wot" "http://xmlns.com/wot/0.1/"},
   :rdf/type          :owl/Ontology
   :rdf/uri "http://rdfs.org/sioc/ns#",
   :rdfa/prefix "sioc",
   :rdfa/uri "http://rdfs.org/sioc/ns#",
   :rdfs/isDefinedBy
   {:rdf/uri "http://www.w3.org/Submission/2007/SUBM-sioc-spec-20070612/"},
   :rdfs/seeAlso "http://rdfs.org/sioc/spec"}
  (:refer-clojure :exclude [name]))

(def Community
  "Community is a high-level concept that defines an online community and what it consists of."
  {:db/ident :sioc/Community,
   :owl/disjointWith [:sioc/UserAccount :sioc/Role :sioc/Item],
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Community is a high-level concept that defines an online community and what it consists of."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Community"}})

(def Container
  "An area in which content Items are contained."
  {:db/ident         :sioc/Container,
   :owl/disjointWith [:sioc/Usergroup :sioc/UserAccount :sioc/Role :sioc/Item],
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "An area in which content Items are contained."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Container"}})

(def Forum
  "A discussion area on which Posts or entries are made."
  {:db/ident         :sioc/Forum,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A discussion area on which Posts or entries are made."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Forum"},
   :rdfs/subClassOf  :sioc/Container})

(def Item
  "An Item is something which can be in a Container."
  {:db/ident :sioc/Item,
   :owl/disjointWith
   [:sioc/Usergroup :sioc/UserAccount :sioc/Space :sioc/Role :sioc/Container],
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "An Item is something which can be in a Container."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Item"}})

(def Post
  "An article or message that can be posted to a Forum."
  {:db/ident         :sioc/Post,
   :rdf/type         :owl/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "An article or message that can be posted to a Forum."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Post"},
   :rdfs/subClassOf  [:foaf/Document :sioc/Item]})

(def Role
  "A Role is a function of a UserAccount within a scope of a particular Forum, Site, etc."
  {:db/ident :sioc/Role,
   :owl/disjointWith
   [:sioc/Usergroup :sioc/UserAccount :sioc/Space :sioc/Item :sioc/Container],
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Role is a function of a UserAccount within a scope of a particular Forum, Site, etc."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Role"}})

(def Site
  "A Site can be the location of an online community or set of communities, with UserAccounts and Usergroups creating Items in a set of Containers. It can be thought of as a web-accessible data Space."
  {:db/ident :sioc/Site,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Site can be the location of an online community or set of communities, with UserAccounts and Usergroups creating Items in a set of Containers. It can be thought of as a web-accessible data Space."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Site"},
   :rdfs/subClassOf :sioc/Space})

(def Space
  "A Space is a place where data resides, e.g. on a website, desktop, fileshare, etc."
  {:db/ident :sioc/Space,
   :owl/disjointWith [:sioc/Usergroup :sioc/UserAccount :sioc/Role :sioc/Item],
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Space is a place where data resides, e.g. on a website, desktop, fileshare, etc."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Space"}})

(def ThreadClass
  "A container for a series of threaded discussion Posts or Items."
  {:db/ident :sioc/Thread,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A container for a series of threaded discussion Posts or Items."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Thread"},
   :rdfs/subClassOf :sioc/Container})

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
   {:rdf/language "en",
    :rdf/value
    "UserAccount is now preferred. This is a deprecated class for a User in an online community site."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "User"},
   :rdfs/subClassOf :foaf/OnlineAccount})

(def UserAccount
  "A user account in an online community site."
  {:db/ident :sioc/UserAccount,
   :owl/disjointWith
   [:sioc/Role :sioc/Usergroup :sioc/Space :sioc/Container :sioc/Item],
   :rdf/type :owl/Class,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A user account in an online community site."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "User Account"},
   :rdfs/subClassOf :foaf/OnlineAccount})

(def Usergroup
  "A set of UserAccounts whose owners have a common purpose or interest. Can be used for access control purposes."
  {:db/ident :sioc/Usergroup,
   :owl/disjointWith
   [:sioc/UserAccount :sioc/Space :sioc/Role :sioc/Item :sioc/Container],
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A set of UserAccounts whose owners have a common purpose or interest. Can be used for access control purposes."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Usergroup"}})

(def about
  "Specifies that this Item is about a particular resource, e.g. a Post describing a book, hotel, etc."
  {:db/ident :sioc/about,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies that this Item is about a particular resource, e.g. a Post describing a book, hotel, etc."},
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "about"}})

(def account_of
  "Refers to the foaf:Agent or foaf:Person who owns this sioc:UserAccount."
  {:db/ident :sioc/account_of,
   :owl/inverseOf :foaf/account,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Refers to the foaf:Agent or foaf:Person who owns this sioc:UserAccount."},
   :rdfs/domain :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "account of"},
   :rdfs/range :foaf/Agent})

(def addressed_to
  "Refers to who (e.g. a UserAccount, e-mail address, etc.) a particular Item is addressed to."
  {:db/ident :sioc/addressed_to,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Refers to who (e.g. a UserAccount, e-mail address, etc.) a particular Item is addressed to."},
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "addressed to"}})

(def administrator_of
  "A Site that the UserAccount is an administrator of."
  {:db/ident         :sioc/administrator_of,
   :owl/inverseOf    :sioc/has_administrator,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A Site that the UserAccount is an administrator of."},
   :rdfs/domain      :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "administrator of"},
   :rdfs/range       :sioc/Site})

(def attachment
  "The URI of a file attached to an Item."
  {:db/ident         :sioc/attachment,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The URI of a file attached to an Item."},
   :rdfs/domain      :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "attachment"}})

(def avatar
  "An image or depiction used to represent this UserAccount."
  {:db/ident :sioc/avatar,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "An image or depiction used to represent this UserAccount."},
   :rdfs/domain :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "avatar"},
   :rdfs/subPropertyOf :foaf/depiction})

(def container_of
  "An Item that this Container contains."
  {:db/ident           :sioc/container_of,
   :owl/inverseOf      :sioc/has_container,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "An Item that this Container contains."},
   :rdfs/domain        :sioc/Container,
   :rdfs/isDefinedBy   "http://rdfs.org/sioc/ns#",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "container of"},
   :rdfs/range         :sioc/Item,
   :rdfs/subPropertyOf :dcterms/hasPart})

(def content
  "The content of the Item in plain text format."
  {:db/ident         :sioc/content,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The content of the Item in plain text format."},
   :rdfs/domain      :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "content"},
   :rdfs/range       :rdfs/Literal})

(def content_encoded
  "The encoded content of the Post, contained in CDATA areas."
  {:db/ident :sioc/content_encoded,
   :owl/versionInfo
   "This property is deprecated. Use content:encoded from the RSS 1.0 content module instead.",
   :rdf/type [:owl/DatatypeProperty :owl/DeprecatedProperty],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The encoded content of the Post, contained in CDATA areas."},
   :rdfs/domain :sioc/Post,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "content encoded"},
   :rdfs/range :rdfs/Literal})

(def created_at
  "When this was created, in ISO 8601 format."
  {:db/ident :sioc/created_at,
   :owl/versionInfo
   "This property is deprecated. Use dcterms:created from the Dublin Core ontology instead.",
   :rdf/type [:owl/DatatypeProperty :owl/DeprecatedProperty],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "When this was created, in ISO 8601 format."},
   :rdfs/domain :sioc/Post,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "created at"},
   :rdfs/range :rdfs/Literal})

(def creator_of
  "A resource that the UserAccount is a creator of."
  {:db/ident         :sioc/creator_of,
   :owl/inverseOf    :sioc/has_creator,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A resource that the UserAccount is a creator of."},
   :rdfs/domain      :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "creator of"}})

(def delivered_at
  "When this was delivered, in ISO 8601 format."
  {:db/ident         :sioc/delivered_at,
   :rdf/type         [:owl/DatatypeProperty :owl/ObjectProperty],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "When this was delivered, in ISO 8601 format."},
   :rdfs/domain      :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "delivered at"},
   :rdfs/range       :rdfs/Literal})

(def description
  "The content of the Post."
  {:db/ident :sioc/description,
   :owl/versionInfo
   "This property is deprecated. Use sioc:content or other methods (AtomOwl, content:encoded from RSS 1.0, etc.) instead.",
   :rdf/type [:owl/DatatypeProperty :owl/DeprecatedProperty],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "The content of the Post."},
   :rdfs/domain :sioc/Post,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "description"},
   :rdfs/range :rdfs/Literal})

(def discussion_of
  "The Item that this discussion is about."
  {:db/ident         :sioc/discussion_of,
   :owl/inverseOf    :sioc/has_discussion,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The Item that this discussion is about."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "discussion of"},
   :rdfs/range       :sioc/Item})

(def earlier_version
  "Links to a previous (older) revision of this Item or Post."
  {:db/ident :sioc/earlier_version,
   :owl/inverseOf :sioc/later_version,
   :rdf/type :owl/TransitiveProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Links to a previous (older) revision of this Item or Post."},
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "earlier version"},
   :rdfs/range :sioc/Item})

(def email
  "An electronic mail address of the UserAccount."
  {:db/ident         :sioc/email,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "An electronic mail address of the UserAccount."},
   :rdfs/domain      :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "email"}})

(def email_sha1
  "An electronic mail address of the UserAccount, encoded using SHA1."
  {:db/ident :sioc/email_sha1,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An electronic mail address of the UserAccount, encoded using SHA1."},
   :rdfs/domain :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "email sha1"},
   :rdfs/range :rdfs/Literal})

(def embeds_knowledge
  "This links Items to embedded statements, facts and structured content."
  {:db/ident :sioc/embeds_knowledge,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This links Items to embedded statements, facts and structured content."},
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "embeds knowledge"},
   :rdfs/range :rdfg/Graph})

(def feed
  "A feed (e.g. RSS, Atom, etc.) pertaining to this resource (e.g. for a Forum, Site, UserAccount, etc.)."
  {:db/ident :sioc/feed,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A feed (e.g. RSS, Atom, etc.) pertaining to this resource (e.g. for a Forum, Site, UserAccount, etc.)."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "feed"}})

(def first_name
  "First (real) name of this User. Synonyms include given name or christian name."
  {:db/ident :sioc/first_name,
   :owl/versionInfo
   "This property is deprecated. Use foaf:name or foaf:firstName from the FOAF vocabulary instead.",
   :rdf/type [:owl/DatatypeProperty :owl/DeprecatedProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "First (real) name of this User. Synonyms include given name or christian name."},
   :rdfs/domain :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "first name"},
   :rdfs/range :rdfs/Literal})

(def follows
  "Indicates that one UserAccount follows another UserAccount (e.g. for microblog posts or other content item updates)."
  {:db/ident :sioc/follows,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates that one UserAccount follows another UserAccount (e.g. for microblog posts or other content item updates)."},
   :rdfs/domain :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "follows"},
   :rdfs/range :sioc/UserAccount})

(def function_of
  "A UserAccount that has this Role."
  {:db/ident         :sioc/function_of,
   :owl/inverseOf    :sioc/has_function,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A UserAccount that has this Role."},
   :rdfs/domain      :sioc/Role,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "function of"}})

(def generator
  "A URI for the application used to generate this Item."
  {:db/ident         :sioc/generator,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A URI for the application used to generate this Item."},
   :rdfs/domain      :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "generator"}})

(def group_of
  {:db/ident :sioc/group_of,
   :owl/inverseOf :sioc/has_group,
   :owl/versionInfo
   "This property has been renamed. Use sioc:usergroup_of instead.",
   :rdf/type [:owl/ObjectProperty :owl/DeprecatedProperty],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "group of"}})

(def has_administrator
  "A UserAccount that is an administrator of this Site."
  {:db/ident         :sioc/has_administrator,
   :owl/inverseOf    :sioc/administrator_of,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A UserAccount that is an administrator of this Site."},
   :rdfs/domain      :sioc/Site,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has administrator"},
   :rdfs/range       :sioc/UserAccount})

(def has_container
  "The Container to which this Item belongs."
  {:db/ident           :sioc/has_container,
   :owl/inverseOf      :sioc/container_of,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value "The Container to which this Item belongs."},
   :rdfs/domain        :sioc/Item,
   :rdfs/isDefinedBy   "http://rdfs.org/sioc/ns#",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has container"},
   :rdfs/range         :sioc/Container,
   :rdfs/subPropertyOf :dcterms/partOf})

(def has_creator
  "This is the UserAccount that made this resource."
  {:db/ident         :sioc/has_creator,
   :owl/inverseOf    :sioc/creator_of,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "This is the UserAccount that made this resource."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has creator"},
   :rdfs/range       :sioc/UserAccount})

(def has_discussion
  "A discussion that is related to this Item. The discussion can be anything, for example, a sioc:Forum or sioc:Thread, a sioct:WikiArticle or simply a foaf:Document."
  {:db/ident :sioc/has_discussion,
   :owl/inverseOf :sioc/discussion_of,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A discussion that is related to this Item. The discussion can be anything, for example, a sioc:Forum or sioc:Thread, a sioct:WikiArticle or simply a foaf:Document."},
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has discussion"}})

(def has_function
  "A Role that this UserAccount has."
  {:db/ident         :sioc/has_function,
   :owl/inverseOf    :sioc/function_of,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A Role that this UserAccount has."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has function"},
   :rdfs/range       :sioc/Role})

(def has_group
  {:db/ident :sioc/has_group,
   :owl/inverseOf :sioc/group_of,
   :owl/versionInfo
   "This property has been renamed. Use sioc:has_usergroup instead.",
   :rdf/type [:owl/ObjectProperty :owl/DeprecatedProperty],
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has group"}})

(def has_host
  "The Site that hosts this Container."
  {:db/ident           :sioc/has_host,
   :owl/inverseOf      :sioc/host_of,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value    "The Site that hosts this Container."},
   :rdfs/domain        :sioc/Container,
   :rdfs/isDefinedBy   "http://rdfs.org/sioc/ns#",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has host"},
   :rdfs/range         :sioc/Site,
   :rdfs/subPropertyOf :sioc/has_space})

(def has_member
  "A UserAccount that is a member of this Usergroup."
  {:db/ident         :sioc/has_member,
   :owl/inverseOf    :sioc/member_of,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A UserAccount that is a member of this Usergroup."},
   :rdfs/domain      :sioc/Usergroup,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has member"},
   :rdfs/range       :sioc/UserAccount})

(def has_moderator
  "A UserAccount that is a moderator of this Forum."
  {:db/ident         :sioc/has_moderator,
   :owl/inverseOf    :sioc/moderator_of,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A UserAccount that is a moderator of this Forum."},
   :rdfs/domain      :sioc/Forum,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has moderator"},
   :rdfs/range       :sioc/UserAccount})

(def has_modifier
  "A UserAccount that modified this resource (e.g. Item, Container, Space)."
  {:db/ident :sioc/has_modifier,
   :owl/inverseOf :sioc/modifier_of,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A UserAccount that modified this resource (e.g. Item, Container, Space)."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has modifier"},
   :rdfs/range :sioc/UserAccount})

(def has_owner
  "A UserAccount that this resource is owned by."
  {:db/ident         :sioc/has_owner,
   :owl/inverseOf    :sioc/owner_of,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A UserAccount that this resource is owned by."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has owner"},
   :rdfs/range       :sioc/UserAccount})

(def has_parent
  "A Container or Forum that this Container or Forum is a child of."
  {:db/ident :sioc/has_parent,
   :owl/inverseOf :sioc/parent_of,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A Container or Forum that this Container or Forum is a child of."},
   :rdfs/domain :sioc/Container,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has parent"},
   :rdfs/range :sioc/Container,
   :rdfs/subPropertyOf :dcterms/partOf})

(def has_part
  "An resource that is a part of this subject."
  {:db/ident :sioc/has_part,
   :owl/inverseOf :sioc/part_of,
   :owl/versionInfo
   "This property is deprecated. Use dcterms:hasPart from the Dublin Core ontology instead.",
   :rdf/type [:owl/ObjectProperty :owl/DeprecatedProperty],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "An resource that is a part of this subject."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has part"}})

(def has_reply
  "Points to an Item or Post that is a reply or response to this Item or Post."
  {:db/ident :sioc/has_reply,
   :owl/inverseOf :sioc/reply_of,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Points to an Item or Post that is a reply or response to this Item or Post."},
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has reply"},
   :rdfs/range :sioc/Item,
   :rdfs/subPropertyOf :sioc/related_to})

(def has_scope
  "A resource that this Role applies to."
  {:db/ident         :sioc/has_scope,
   :owl/inverseOf    :sioc/scope_of,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A resource that this Role applies to."},
   :rdfs/domain      :sioc/Role,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has scope"}})

(def has_space
  "A data Space which this resource is a part of."
  {:db/ident           :sioc/has_space,
   :owl/inverseOf      :sioc/space_of,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "A data Space which this resource is a part of."},
   :rdfs/isDefinedBy   "http://rdfs.org/sioc/ns#",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "has space"},
   :rdfs/range         :sioc/Space,
   :rdfs/subPropertyOf :dcterms/partOf})

(def has_subscriber
  "A UserAccount that is subscribed to this Container."
  {:db/ident         :sioc/has_subscriber,
   :owl/inverseOf    :sioc/subscriber_of,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A UserAccount that is subscribed to this Container."},
   :rdfs/domain      :sioc/Container,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "has subscriber"},
   :rdfs/range       :sioc/UserAccount,
   :rdfs/seeAlso     :sioc/feed})

(def has_usergroup
  "Points to a Usergroup that has certain access to this Space."
  {:db/ident :sioc/has_usergroup,
   :owl/inverseOf :sioc/usergroup_of,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "Points to a Usergroup that has certain access to this Space."},
   :rdfs/domain :sioc/Space,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has usergroup"},
   :rdfs/range :sioc/Usergroup})

(def host_of
  "A Container that is hosted on this Site."
  {:db/ident           :sioc/host_of,
   :owl/inverseOf      :sioc/has_host,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value "A Container that is hosted on this Site."},
   :rdfs/domain        :sioc/Site,
   :rdfs/isDefinedBy   "http://rdfs.org/sioc/ns#",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "host of"},
   :rdfs/range         :sioc/Container,
   :rdfs/subPropertyOf :sioc/space_of})

(def id
  "An identifier of a SIOC concept instance. For example, a user ID. Must be unique for instances of each type of SIOC concept within the same site."
  {:db/ident :sioc/id,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An identifier of a SIOC concept instance. For example, a user ID. Must be unique for instances of each type of SIOC concept within the same site."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "id"},
   :rdfs/range :rdfs/Literal})

(def ip_address
  "The IP address used when creating this Item, UserAccount, etc. This can be associated with a creator. Some wiki articles list the IP addresses for the creator or modifiers when the usernames are absent."
  {:db/ident :sioc/ip_address,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The IP address used when creating this Item, UserAccount, etc. This can be associated with a creator. Some wiki articles list the IP addresses for the creator or modifiers when the usernames are absent."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ip address"},
   :rdfs/range :rdfs/Literal})

(def last_activity_date
  "The date and time of the last activity associated with a SIOC concept instance, and expressed in ISO 8601 format. This could be due to a reply Post or Comment, a modification to an Item, etc."
  {:db/ident :sioc/last_activity_date,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The date and time of the last activity associated with a SIOC concept instance, and expressed in ISO 8601 format. This could be due to a reply Post or Comment, a modification to an Item, etc."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "last activity date"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :dcterms/date})

(def last_item_date
  "The date and time of the last Post (or Item) in a Forum (or a Container), in ISO 8601 format."
  {:db/ident :sioc/last_item_date,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The date and time of the last Post (or Item) in a Forum (or a Container), in ISO 8601 format."},
   :rdfs/domain :sioc/Container,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "last item date"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :dcterms/date})

(def last_name
  "Last (real) name of this user. Synonyms include surname or family name."
  {:db/ident :sioc/last_name,
   :owl/versionInfo
   "This property is deprecated. Use foaf:name or foaf:surname from the FOAF vocabulary instead.",
   :rdf/type [:owl/DatatypeProperty :owl/DeprecatedProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Last (real) name of this user. Synonyms include surname or family name."},
   :rdfs/domain :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "last name"},
   :rdfs/range :rdfs/Literal})

(def last_reply_date
  "The date and time of the last reply Post or Comment, which could be associated with a starter Item or Post or with a Thread, and expressed in ISO 8601 format."
  {:db/ident :sioc/last_reply_date,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The date and time of the last reply Post or Comment, which could be associated with a starter Item or Post or with a Thread, and expressed in ISO 8601 format."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "last reply date"},
   :rdfs/range :rdfs/Literal,
   :rdfs/subPropertyOf :dcterms/date})

(def later_version
  "Links to a later (newer) revision of this Item or Post."
  {:db/ident :sioc/later_version,
   :owl/inverseOf :sioc/earlier_version,
   :rdf/type :owl/TransitiveProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Links to a later (newer) revision of this Item or Post."},
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "later version"},
   :rdfs/range :sioc/Item})

(def latest_version
  "Links to the latest revision of this Item or Post."
  {:db/ident         :sioc/latest_version,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Links to the latest revision of this Item or Post."},
   :rdfs/domain      :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "latest version"},
   :rdfs/range       :sioc/Item})

(def likes
  "Used to indicate some form of endorsement by a UserAccount or Agent of an Item, Container, Space, UserAccount, etc."
  {:db/ident :sioc/likes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to indicate some form of endorsement by a UserAccount or Agent of an Item, Container, Space, UserAccount, etc."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "likes"}})

(def link
  "A URI of a document which contains this SIOC object."
  {:db/ident         :sioc/link,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A URI of a document which contains this SIOC object."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "link"}})

(def links_to
  "Links extracted from hyperlinks within a SIOC concept, e.g. Post or Site."
  {:db/ident :sioc/links_to,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Links extracted from hyperlinks within a SIOC concept, e.g. Post or Site."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "links to"},
   :rdfs/subPropertyOf :dcterms/references})

(def member_of
  "A Usergroup that this UserAccount is a member of."
  {:db/ident         :sioc/member_of,
   :owl/inverseOf    :sioc/has_member,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A Usergroup that this UserAccount is a member of."},
   :rdfs/domain      :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "member of"},
   :rdfs/range       :sioc/Usergroup})

(def mentions
  "Refers to a UserAccount that a particular Item mentions."
  {:db/ident :sioc/mentions,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Refers to a UserAccount that a particular Item mentions."},
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mentions"},
   :rdfs/range :sioc/UserAccount})

(def moderator_of
  "A Forum that a UserAccount is a moderator of."
  {:db/ident         :sioc/moderator_of,
   :owl/inverseOf    :sioc/has_moderator,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A Forum that a UserAccount is a moderator of."},
   :rdfs/domain      :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "moderator of"},
   :rdfs/range       :sioc/Forum})

(def modified_at
  "When this was modified, in ISO 8601 format."
  {:db/ident :sioc/modified_at,
   :owl/versionInfo
   "This property is deprecated. Use dcterms:modified from the Dublin Core ontology instead.",
   :rdf/type [:owl/DatatypeProperty :owl/DeprecatedProperty],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "When this was modified, in ISO 8601 format."},
   :rdfs/domain :sioc/Post,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "modified at"},
   :rdfs/range :rdfs/Literal})

(def modifier_of
  "A resource that this UserAccount has modified."
  {:db/ident         :sioc/modifier_of,
   :owl/inverseOf    :sioc/has_modifier,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A resource that this UserAccount has modified."},
   :rdfs/domain      :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "modifier of"}})

(def name
  "The name of a SIOC concept instance, e.g. a username for a UserAccount, group name for a Usergroup, etc."
  {:db/ident :sioc/name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The name of a SIOC concept instance, e.g. a username for a UserAccount, group name for a Usergroup, etc."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "name"},
   :rdfs/range :rdfs/Literal})

(def next_by_date
  "Next Item or Post in a given Container sorted by date."
  {:db/ident         :sioc/next_by_date,
   :owl/inverseOf    :sioc/previous_by_date,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "Next Item or Post in a given Container sorted by date."},
   :rdfs/domain      :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "next by date"},
   :rdfs/range       :sioc/Item})

(def next_version
  "Links to the next revision of this Item or Post."
  {:db/ident           :sioc/next_version,
   :owl/inverseOf      :sioc/previous_version,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "Links to the next revision of this Item or Post."},
   :rdfs/domain        :sioc/Item,
   :rdfs/isDefinedBy   "http://rdfs.org/sioc/ns#",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "next version"},
   :rdfs/range         :sioc/Item,
   :rdfs/subPropertyOf :sioc/later_version})

(def note
  "A note associated with this resource, for example, if it has been edited by a UserAccount."
  {:db/ident :sioc/note,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A note associated with this resource, for example, if it has been edited by a UserAccount."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "note"},
   :rdfs/range :rdfs/Literal})

(def num_authors
  "The number of unique authors (UserAccounts and unregistered posters) who have contributed to this Item, Thread, Post, etc."
  {:db/ident :sioc/num_authors,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The number of unique authors (UserAccounts and unregistered posters) who have contributed to this Item, Thread, Post, etc."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "num authors"},
   :rdfs/range :xsd/nonNegativeInteger})

(def num_items
  "The number of Posts (or Items) in a Forum (or a Container)."
  {:db/ident :sioc/num_items,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "The number of Posts (or Items) in a Forum (or a Container)."},
   :rdfs/domain :sioc/Container,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "num items"},
   :rdfs/range :xsd/nonNegativeInteger})

(def num_replies
  "The number of replies that this Item, Thread, Post, etc. has. Useful for when the reply structure is absent."
  {:db/ident :sioc/num_replies,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The number of replies that this Item, Thread, Post, etc. has. Useful for when the reply structure is absent."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "num replies"},
   :rdfs/range :xsd/nonNegativeInteger})

(def num_threads
  "The number of Threads (AKA discussion topics) in a Forum."
  {:db/ident :sioc/num_threads,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The number of Threads (AKA discussion topics) in a Forum."},
   :rdfs/domain :sioc/Forum,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "num threads"},
   :rdfs/range :xsd/nonNegativeInteger})

(def num_views
  "The number of times this Item, Thread, UserAccount profile, etc. has been viewed."
  {:db/ident :sioc/num_views,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The number of times this Item, Thread, UserAccount profile, etc. has been viewed."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "num views"},
   :rdfs/range :xsd/nonNegativeInteger})

(def owner_of
  "A resource owned by a particular UserAccount, for example, a weblog or image gallery."
  {:db/ident :sioc/owner_of,
   :owl/inverseOf :sioc/has_owner,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A resource owned by a particular UserAccount, for example, a weblog or image gallery."},
   :rdfs/domain :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "owner of"}})

(def parent_of
  "A child Container or Forum that this Container or Forum is a parent of."
  {:db/ident :sioc/parent_of,
   :owl/inverseOf :sioc/has_parent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A child Container or Forum that this Container or Forum is a parent of."},
   :rdfs/domain :sioc/Container,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "parent of"},
   :rdfs/range :sioc/Container,
   :rdfs/subPropertyOf :dcterms/hasPart})

(def part_of
  "A resource that the subject is a part of."
  {:db/ident :sioc/part_of,
   :owl/inverseOf :sioc/has_part,
   :owl/versionInfo
   "This property is deprecated. Use dcterms:isPartOf from the Dublin Core ontology instead.",
   :rdf/type [:owl/ObjectProperty :owl/DeprecatedProperty],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "A resource that the subject is a part of."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "part of"}})

(def previous_by_date
  "Previous Item or Post in a given Container sorted by date."
  {:db/ident :sioc/previous_by_date,
   :owl/inverseOf :sioc/next_by_date,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "Previous Item or Post in a given Container sorted by date."},
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "previous by date"},
   :rdfs/range :sioc/Item})

(def previous_version
  "Links to the previous revision of this Item or Post."
  {:db/ident           :sioc/previous_version,
   :owl/inverseOf      :sioc/next_version,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "Links to the previous revision of this Item or Post."},
   :rdfs/domain        :sioc/Item,
   :rdfs/isDefinedBy   "http://rdfs.org/sioc/ns#",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "previous version"},
   :rdfs/range         :sioc/Item,
   :rdfs/subPropertyOf :sioc/earlier_version})

(def read_at
  "When this was read, in ISO 8601 format."
  {:db/ident         :sioc/read_at,
   :rdf/type         [:owl/DatatypeProperty :owl/ObjectProperty],
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "When this was read, in ISO 8601 format."},
   :rdfs/domain      :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "read at"},
   :rdfs/range       :rdfs/Literal})

(def reference
  "Links either created explicitly or extracted implicitly on the HTML level from the Post."
  {:db/ident :sioc/reference,
   :owl/versionInfo "Renamed to sioc:links_to.",
   :rdf/type [:owl/ObjectProperty :owl/DeprecatedProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Links either created explicitly or extracted implicitly on the HTML level from the Post."},
   :rdfs/domain :sioc/Post,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "reference"}})

(def related_to
  "Related resources for this resource, e.g. for Posts, perhaps determined implicitly from topics or references."
  {:db/ident :sioc/related_to,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Related resources for this resource, e.g. for Posts, perhaps determined implicitly from topics or references."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "related to"}})

(def reply_of
  "Links to an Item or Post which this Item or Post is a reply to."
  {:db/ident :sioc/reply_of,
   :owl/inverseOf :sioc/has_reply,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Links to an Item or Post which this Item or Post is a reply to."},
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "reply of"},
   :rdfs/range :sioc/Item,
   :rdfs/subPropertyOf :sioc/related_to})

(def respond_to
  "For the reply-to address set in email messages, IMs, etc. The property name was chosen to avoid confusion with has_reply/reply_of (the reply graph)."
  {:db/ident :sioc/respond_to,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For the reply-to address set in email messages, IMs, etc. The property name was chosen to avoid confusion with has_reply/reply_of (the reply graph)."},
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "respond to"}})

(def scope_of
  "A Role that has a scope of this resource."
  {:db/ident         :sioc/scope_of,
   :owl/inverseOf    :sioc/has_scope,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "A Role that has a scope of this resource."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "scope of"},
   :rdfs/range       :sioc/Role})

(def shared_by
  "For shared Items where there is a certain creator_of and an intermediary who shares or forwards it (e.g. as a sibling Item)."
  {:db/ident :sioc/shared_by,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "For shared Items where there is a certain creator_of and an intermediary who shares or forwards it (e.g. as a sibling Item)."},
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "shared by"},
   :rdfs/range :sioc/UserAccount,
   :rdfs/seeAlso :sioc/sibling})

(def sibling
  "An Item may have a sibling or a twin that exists in a different Container, but the siblings may differ in some small way (for example, language, category, etc.). The sibling of this Item should be self-describing (that is, it should contain all available information)."
  {:db/ident :sioc/sibling,
   :rdf/type :owl/SymmetricProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An Item may have a sibling or a twin that exists in a different Container, but the siblings may differ in some small way (for example, language, category, etc.). The sibling of this Item should be self-describing (that is, it should contain all available information)."},
   :rdfs/domain :sioc/Item,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "sibling"},
   :rdfs/range :sioc/Item})

(def space_of
  "A resource which belongs to this data Space."
  {:db/ident           :sioc/space_of,
   :owl/inverseOf      :sioc/has_space,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value
                        "A resource which belongs to this data Space."},
   :rdfs/domain        :sioc/Space,
   :rdfs/isDefinedBy   "http://rdfs.org/sioc/ns#",
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "space of"},
   :rdfs/subPropertyOf :dcterms/hasPart})

(def subject
  "Keyword(s) describing subject of the Post."
  {:db/ident :sioc/subject,
   :owl/versionInfo
   "This property is deprecated. Use dcterms:subject from the Dublin Core ontology for text keywords and sioc:topic if the subject can be represented by a URI instead.",
   :rdf/type [:owl/DatatypeProperty :owl/DeprecatedProperty],
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Keyword(s) describing subject of the Post."},
   :rdfs/domain :sioc/Post,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subject"},
   :rdfs/range :rdfs/Literal})

(def subscriber_of
  "A Container that a UserAccount is subscribed to."
  {:db/ident         :sioc/subscriber_of,
   :owl/inverseOf    :sioc/has_subscriber,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "A Container that a UserAccount is subscribed to."},
   :rdfs/domain      :sioc/UserAccount,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "subscriber of"},
   :rdfs/range       :sioc/Container,
   :rdfs/seeAlso     :sioc/feed})

(def title
  "This is the title (subject line) of the Post. Note that for a Post within a threaded discussion that has no parents, it would detail the topic thread."
  {:db/ident :sioc/title,
   :owl/versionInfo
   "This property is deprecated. Use dcterms:title from the Dublin Core ontology instead.",
   :rdf/type [:owl/DatatypeProperty :owl/DeprecatedProperty],
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This is the title (subject line) of the Post. Note that for a Post within a threaded discussion that has no parents, it would detail the topic thread."},
   :rdfs/domain :sioc/Post,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "title"},
   :rdfs/range :rdfs/Literal})

(def topic
  "A topic of interest, linking to the appropriate URI, e.g. in the Open Directory Project or of a SKOS category."
  {:db/ident :sioc/topic,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A topic of interest, linking to the appropriate URI, e.g. in the Open Directory Project or of a SKOS category."},
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "topic"},
   :rdfs/subPropertyOf :dcterms/subject})

(def usergroup_of
  "A Space that the Usergroup has access to."
  {:db/ident         :sioc/usergroup_of,
   :owl/inverseOf    :sioc/has_usergroup,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "A Space that the Usergroup has access to."},
   :rdfs/domain      :sioc/Usergroup,
   :rdfs/isDefinedBy "http://rdfs.org/sioc/ns#",
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "usergroup of"},
   :rdfs/range       :sioc/Space})
