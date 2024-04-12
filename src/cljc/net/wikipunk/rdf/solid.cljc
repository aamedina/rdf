(ns net.wikipunk.rdf.solid
  {:dc11/issued #inst "2015-11-16T00:00:00.000-00:00",
   :dc11/license {:xsd/anyURI
                  "https://creativecommons.org/publicdomain/zero/1.0/"},
   :namespaces {"dc11"  "http://purl.org/dc/terms/",
                "foaf"  "http://xmlns.com/foaf/0.1/",
                "ldp"   "http://www.w3.org/ns/ldp#",
                "log"   "http://www.w3.org/2000/10/swap/log#",
                "owl"   "http://www.w3.org/2002/07/owl#",
                "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                "solid" "http://www.w3.org/ns/solid/terms#",
                "vann"  "http://purl.org/vocab/vann/",
                "ws"    "http://www.w3.org/ns/pim/space#",
                "xsd"   "http://www.w3.org/2001/XMLSchema#"},
   :owl/versionInfo
   {:dc11/date #inst "2020-12-22T00:00:00.000-00:00",
    :dc11/replaces
    {:xsd/anyURI
     "https://raw.githubusercontent.com/solid/vocab/46a5e2a8df1df48cd21a6ecdd422a37d29d39cbe/solid-terms.ttl"},
    :rdfs/seeAlso {:xsd/anyURI "https://github.com/solid/vocab/pull/67"}},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "solid",
   :rdfa/uri "http://www.w3.org/ns/solid/terms#",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The Solid Terms vocabulary defines terms referenced in Solid specifications."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Solid Terms"},
   :vann/preferredNamespacePrefix "solid",
   :vann/preferredNamespaceUri {:xsd/anyURI
                                "http://www.w3.org/ns/solid/terms#"},
   :xsd/anyURI "http://www.w3.org/ns/solid/terms#"}
  (:refer-clojure :exclude [read]))

(def Account
  {:db/ident         :solid/Account,
   :dc11/issued      #inst "2016-05-17T00:00:00.000-00:00",
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A Solid account."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Account"}})

(def Inbox
  {:db/ident         :solid/Inbox,
   :dc11/issued      #inst "2015-11-16T00:00:00.000-00:00",
   :dc11/modified    #inst "2018-10-24T00:00:00.000-00:00",
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A resource containing notifications."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Inbox"}})

(def InsertDeletePatch
  {:db/ident :solid/InsertDeletePatch,
   :dc11/issued #inst "2022-05-03T00:00:00.000-00:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A class of patch expressing insertions, deletions, and conditional modifications to a resource that has an RDF-based representation."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Insert/delete patch"},
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://solidproject.org/TR/2021/protocol-20211217#server-patch-n3-type"},
   :rdfs/subClassOf :solid/Patch})

(def ListedDocument
  {:db/ident :solid/ListedDocument,
   :dc11/issued #inst "2015-11-16T00:00:00.000-00:00",
   :dc11/modified #inst "2018-01-24T00:00:00.000-00:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Listed Type Index is a registry of resources that are publicly discoverable by outside users and applications."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Listed Type Index"}})

(def Notification
  {:db/ident         :solid/Notification,
   :dc11/issued      #inst "2015-12-18T00:00:00.000-00:00",
   :dc11/modified    #{#inst "2018-10-25T00:00:00.000-00:00"
                       #inst "2015-12-20T00:00:00.000-00:00"},
   :rdf/type         :rdfs/Class,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A notification resource."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "Notification"}})

(def Patch
  {:db/ident :solid/Patch,
   :dc11/issued #inst "2017-08-17T00:00:00.000-00:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A patch expresses conditional modifications to a resource that has an RDF-based representation."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Patch"}})

(def Timeline
  {:db/ident :solid/Timeline,
   :dc11/issued #inst "2016-01-04T00:00:00.000-00:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A resource containing time ordered items and sub-containers.  Sub-containers may be desirable in file based systems to split the timeline into logical components e.g. /yyyy-mm-dd/ as used in ISO 8061."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Timeline"}})

(def TypeIndex
  {:db/ident :solid/TypeIndex,
   :dc11/issued #inst "2016-02-05T00:00:00.000-00:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A index of type registries for resources. Applications can register the RDF type they use and list them in the index resource."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Type index"}})

(def TypeRegistration
  {:db/ident :solid/TypeRegistration,
   :dc11/issued #inst "2018-01-24T00:00:00.000-00:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The registered types that map a RDF classes/types to their locations using either `instance` or `instanceContainer` property."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Type Registration"}})

(def UnlistedDocument
  {:db/ident :solid/UnlistedDocument,
   :dc11/issued #inst "2018-01-24T00:00:00.000-00:00",
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Unlisted Type Index is a registry of resources that are private to the user and their apps, for types that are not publicly discoverable."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Unlisted Type Index"}})

(def account
  {:db/ident         :solid/account,
   :dc11/issued      #inst "2016-05-17T00:00:00.000-00:00",
   :dc11/modified    #inst "2018-01-24T00:00:00.000-00:00",
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "A solid account belonging to an Agent."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "account"}})

(def deletes
  {:db/ident :solid/deletes,
   :dc11/issued #inst "2017-08-17T00:00:00.000-00:00",
   :rdf/type #{:owl/ObjectProperty :rdf/Property :owl/FunctionalProperty},
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The triple patterns this patch removes from the document."},
   :rdfs/domain :solid/Patch,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "deletes"},
   :rdfs/range :log/Formula})

(def forClass
  {:db/ident :solid/forClass,
   :dc11/issued #inst "2018-01-24T00:00:00.000-00:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value "A class that is used to map an listed or unlisted type index."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "registry class"}})

(def inbox
  {:db/ident :solid/inbox,
   :dc11/issued #inst "2015-11-16T00:00:00.000-00:00",
   :dc11/modified #{#inst "2018-10-25T00:00:00.000-00:00"
                    #inst "2016-02-05T00:00:00.000-00:00"},
   :owl/deprecated true,
   :owl/equivalentProperty :ldp/inbox,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Deprecated pointer to a Linked Data Notifications inbox; please use http://www.w3.org/ns/ldp#inbox instead."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "inbox (deprecated)"},
   :rdfs/subPropertyOf :ldp/inbox})

(def inserts
  {:db/ident         :solid/inserts,
   :dc11/issued      #inst "2017-08-17T00:00:00.000-00:00",
   :rdf/type         #{:owl/ObjectProperty :rdf/Property
                       :owl/FunctionalProperty},
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value
                      "The triple patterns this patch adds to the document."},
   :rdfs/domain      :solid/Patch,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "inserts"},
   :rdfs/range       :log/Formula})

(def instance
  {:db/ident :solid/instance,
   :dc11/issued #inst "2018-01-24T00:00:00.000-00:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Maps a type to an individual resource, typically an index or a directory listing resource."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "instance"}})

(def instanceContainer
  {:db/ident :solid/instanceContainer,
   :dc11/issued #inst "2018-01-24T00:00:00.000-00:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Maps a type to a container which the client would have to list to get the instances of that type."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "instance container"}})

(def loginEndpoint
  {:db/ident         :solid/loginEndpoint,
   :dc11/issued      #inst "2015-11-16T00:00:00.000-00:00",
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The login URI of a given server."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "loginEndpoint"}})

(def logoutEndpoint
  {:db/ident         :solid/logoutEndpoint,
   :dc11/issued      #inst "2015-11-16T00:00:00.000-00:00",
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "The logout URI of a given server."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "logoutEndpoint"}})

(def notification
  {:db/ident         :solid/notification,
   :dc11/issued      #inst "2016-03-11T00:00:00.000-00:00",
   :dc11/modified    #inst "2018-10-25T00:00:00.000-00:00",
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Notification resource for an inbox."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "notification"}})

(def oidcIssuer
  {:db/ident :solid/oidcIssuer,
   :dc11/issued #inst "2017-08-15T00:00:00.000-00:00",
   :dc11/modified #inst "2017-08-16T00:00:00.000-00:00",
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The preferred OpenID Connect issuer URI for a given WebID."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "OIDC issuer"},
   :rdfs/subPropertyOf {:xsd/anyURI
                        "http://openid.net/specs/connect/1.0/issuer"}})

(def owner
  {:db/ident :solid/owner,
   :dc11/issued #inst "2021-05-19T00:00:00.000-00:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A person or social entity that is considered to have control, rights, and responsibilities over a data storage."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "owner"},
   :rdfs/range :foaf/Agent})

(def patches
  {:db/ident         :solid/patches,
   :dc11/issued      #inst "2017-08-17T00:00:00.000-00:00",
   :rdf/type         #{:owl/ObjectProperty :rdf/Property},
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "The document to which this patch applies."},
   :rdfs/domain      :solid/Patch,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "patches"},
   :rdfs/range       :rdfs/Resource})

(def privateLabelIndex
  {:db/ident         :solid/privateLabelIndex,
   :dc11/issued      #inst "2023-10-04T00:00:00.000-00:00",
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "Points to an unlisted label index resource."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "private label index"},
   :rdfs/range       :solid/UnlistedDocument})

(def privateTypeIndex
  {:db/ident         :solid/privateTypeIndex,
   :dc11/issued      #inst "2018-01-24T00:00:00.000-00:00",
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value "Points to an unlisted type index resource."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "private type index"},
   :rdfs/range       :solid/UnlistedDocument})

(def publicTypeIndex
  {:db/ident           :solid/publicTypeIndex,
   :dc11/issued        #inst "2018-01-24T00:00:00.000-00:00",
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en",
                        :rdf/value "Points to a listed type index resource."},
   :rdfs/isDefinedBy   {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label         {:rdf/language "en",
                        :rdf/value    "public type index"},
   :rdfs/range         :solid/ListedDocument,
   :rdfs/subPropertyOf :solid/typeIndex})

(def read
  {:db/ident :solid/read,
   :dc11/issued #inst "2015-12-18T00:00:00.000-00:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Indicates if a message has been read or not. This property should have a boolean datatype."},
   :rdfs/domain :sioc/Post,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "read"}})

(def storageQuota
  {:db/ident :solid/storageQuota,
   :dc11/issued #inst "2018-10-26T00:00:00.000-00:00",
   :dc11/modified #{#inst "2018-11-07T00:00:00.000-00:00"
                    #inst "2019-01-22T00:00:00.000-00:00"},
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The quota of non-volatile memory that is available for the account (in bytes)"},
   :rdfs/domain :solid/Account,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Non-volatile memory quota"}})

(def storageUsage
  {:db/ident :solid/storageUsage,
   :dc11/issued #inst "2019-01-22T00:00:00.000-00:00",
   :rdf/type #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The amount of non-volatile memory that the account have used (in bytes)"},
   :rdfs/domain :solid/Account,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Non-volatile memory usage"}})

(def timeline
  {:db/ident         :solid/timeline,
   :dc11/issued      #inst "2016-01-04T00:00:00.000-00:00",
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Timeline for a given resource."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "timeline"}})

(def typeIndex
  {:db/ident         :solid/typeIndex,
   :dc11/issued      #inst "2016-02-05T00:00:00.000-00:00",
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en",
                      :rdf/value    "Points to a TypeIndex resource."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label       {:rdf/language "en",
                      :rdf/value    "type index"},
   :rdfs/range       :solid/TypeIndex})

(def where
  {:db/ident :solid/where,
   :dc11/issued #inst "2017-08-17T00:00:00.000-00:00",
   :rdf/type #{:owl/ObjectProperty :rdf/Property :owl/FunctionalProperty},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The conditions the document and the inserted and deleted triple patterns need to satisfy in order for the patch to be applied."},
   :rdfs/domain :solid/Patch,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/solid/terms#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "where"},
   :rdfs/range :log/Formula})

(def urn:uuid:342bfb84-ed11-509a-8564-ccc4a5f9f646
  {:dc11/issued #inst "2015-11-16T00:00:00.000-00:00",
   :dc11/license {:xsd/anyURI
                  "https://creativecommons.org/publicdomain/zero/1.0/"},
   :owl/versionInfo
   {:dc11/date #inst "2020-12-22T00:00:00.000-00:00",
    :dc11/replaces
    {:xsd/anyURI
     "https://raw.githubusercontent.com/solid/vocab/46a5e2a8df1df48cd21a6ecdd422a37d29d39cbe/solid-terms.ttl"},
    :rdfs/seeAlso {:xsd/anyURI "https://github.com/solid/vocab/pull/67"}},
   :rdf/type :owl/Ontology,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The Solid Terms vocabulary defines terms referenced in Solid specifications."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Solid Terms"},
   :vann/preferredNamespacePrefix "solid",
   :vann/preferredNamespaceUri {:xsd/anyURI
                                "http://www.w3.org/ns/solid/terms#"},
   :xsd/anyURI "http://www.w3.org/ns/solid/terms#"})