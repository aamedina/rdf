(ns net.wikipunk.rdf.acl
  ^{:base       "http://www.w3.org/ns/auth/acl#",
    :namespaces {"acl"     "http://www.w3.org/ns/auth/acl#",
                 "dcterms" "http://purl.org/dc/terms/",
                 "foaf"    "http://xmlns.com/foaf/0.1/",
                 "gen"     "http://www.w3.org/2006/gen/ont#",
                 "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                 "vcard"   "http://www.w3.org/2006/vcard/ns#",
                 "xsd"     "http://www.w3.org/2001/XMLSchema#"},
    :prefix     "acl",
    :source     "http://www.w3.org/ns/auth/acl#"}
  {:dcterms/title "Basic Access Control ontology",
   :rdf/type :owl/Ontology,
   :rdfs/comment
   "Defines the class Authorization and its essential properties,\n    and also some classes of access such as read and write. ",
   :xsd/anyURI "http://www.w3.org/ns/auth/acl"}
  (:refer-clojure :exclude [agent]))

(def Access
  {:db/ident :acl/Access,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Any kind of access to a resource. Don't use this, use R W and RW",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "access"}})

(def Append
  {:db/ident :acl/Append,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Append accesses are specific write access which only add information, and do not remove information.\n    For text files, for example, append access allows bytes to be added onto the end of the file.\n    For RDF graphs, Append access allows adds triples to the graph but does not remove any.\n    Append access is useful for dropbox functionality.\n    Dropbox can be used for link notification, which the information added is a notification\n    that a some link has been made elsewhere relevant to the given resource.\n    ",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "append"},
   :rdfs/subClassOf #{:acl/Write :acl/Access}})

(def AuthenticatedAgent
  {:db/ident :acl/AuthenticatedAgent,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A class of agents who have been authenticated.\nIn other words, anyone can access this resource, but not anonymously.\nThe social expectation is that the authentication process will provide an\nidentify and a name, or pseudonym.\n(A new ID should not be minted for every access: the intent is that the user\nis able to continue to use the ID for continues interactions with peers,\nand for example to develop a reputation)\n",
   :rdfs/label "Anyone authenticated",
   :rdfs/subClassOf :foaf/Agent})

(def Authorization
  {:db/ident :acl/Authorization,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An element of access control,\n    allowing agent to agents access of some kind to resources or classes of resources",
   :rdfs/label "authorization"})

(def Control
  {:db/ident        :acl/Control,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Allows read/write access to the ACL for the resource(s)",
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "control"},
   :rdfs/subClassOf :acl/Access})

(def Origin
  {:db/ident :acl/Origin,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An Origin is basically a web site\n        (Note WITHOUT the trailing slash after the domain name and port in its URI)\n        and is the basis for controlling access to data by web apps\n        in the Same Origin Model of web security.\n        All scripts from the same origin are given the same right.",
   :rdfs/label "Origin",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin"}})

(def Read
  {:db/ident        :acl/Read,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "The class of read operations",
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "read"},
   :rdfs/subClassOf :acl/Access})

(def Write
  {:db/ident        :acl/Write,
   :rdf/type        :rdfs/Class,
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "write"},
   :rdfs/subClassOf :acl/Access})

(def accessControl
  {:db/ident :acl/accessControl,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The Access Control file for this information resource.\n        This may of course be a virtual resource implemented by the access control system.\n        Note that HTTP header `Link: <foo.acl>; rel=\"acl\"` can also be used for this.",
   :rdfs/domain :gen/InformationResource,
   :rdfs/label "access control",
   :rdfs/range :gen/InformationResource,
   :rdfs/seeAlso {:xsd/anyURI
                  "https://solidproject.org/TR/wac#acl-link-relation"},
   :rdfs/subPropertyOf :rdfs/seeAlso})

(def accessTo
  {:db/ident     :acl/accessTo,
   :rdf/type     :rdf/Property,
   :rdfs/comment "The information resource to which access is being granted.",
   :rdfs/domain  :acl/Authorization,
   :rdfs/label   "to",
   :rdfs/range   :gen/InformationResource})

(def accessToClass
  {:db/ident :acl/accessToClass,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A class of information resources to which access is being granted.",
   :rdfs/domain :acl/Authorization,
   :rdfs/label "to all in",
   :rdfs/range :rdfs/Class})

(def agent
  {:db/ident     :acl/agent,
   :rdf/type     :rdf/Property,
   :rdfs/comment "A person or social entity to being given the right",
   :rdfs/domain  :acl/Authorization,
   :rdfs/label   "agent",
   :rdfs/range   :foaf/Agent})

(def agentClass
  {:db/ident :acl/agentClass,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A class of persons or social entities to being given the right",
   :rdfs/domain :acl/Authorization,
   :rdfs/label "agent class",
   :rdfs/range :rdfs/Class})

(def agentGroup
  {:db/ident :acl/agentGroup,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A group of persons or social entities to being given the right.\n          The right is given to any entity which is a vcard:member of the group,\n          as defined by the document received when the Group is dereferenced.",
   :rdfs/domain :acl/Authorization,
   :rdfs/label "agent group",
   :rdfs/range :vcard/Group})

(def default
  {:db/ident :acl/default,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "If a resource has no ACL file (it is 404),\n        then access to the resource is given by the ACL of the immediately\n        containing directory, or failing that (404) the ACL of the recursively next\n        containing directory which has an ACL file.\n        Within that ACL file,\n        any Authorization which has that directory as its acl:default applies to the\n        resource. (The highest directory must have an ACL file.)\n",
   :rdfs/domain :acl/Authorization,
   :rdfs/label "default access for things in this"})

(def defaultForNew
  {:db/ident :acl/defaultForNew,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "THIS IS OBSOLETE AS OF 2017-08-01.   See 'default'.\n        Was: A directory for which this authorization is used for new files in the directory.",
   :rdfs/domain :acl/Authorization,
   :rdfs/label "default access for new things in the object"})

(def delegates
  {:db/ident :acl/delegates,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Delegates a person or another agent to act on behalf of the agent.\n    For example, Alice delegates Bob to act on behalf of Alice for ACL purposes.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "delegates"},
   :rdfs/range :foaf/Agent})

(def mode
  {:db/ident     :acl/mode,
   :rdf/type     :rdf/Property,
   :rdfs/comment "A mode of access such as read or write.",
   :rdfs/domain  :acl/Authorization,
   :rdfs/label   "access mode",
   :rdfs/range   :rdfs/Class})

(def origin
  {:db/ident :acl/origin,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A web application, identified by its Origin, such as\n        <https://scripts.example.com>, being given the right.\n        When a user of the web application at a certain origin accesses the server,\n        then the browser sets the Origin: header to warn that a possibly untrusted webapp\n        is being used.\n        Then, BOTH the user AND the origin must have the required access.",
   :rdfs/domain :acl/Authorization,
   :rdfs/label "origin",
   :rdfs/range :acl/Origin,
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin"}})

(def owner
  {:db/ident :acl/owner,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The person or other agent which owns this.\n    For example, the owner of a file in a filesystem.\n    There is a sense of \"right to control\".   Typically defaults to the agent who created\n    something, but can be changed.",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "owner"},
   :rdfs/range :foaf/Agent})

(def urn:uuid:f0e3e6ec-2dde-5741-bd9b-6fd4889d4abe
  {:dcterms/title "Basic Access Control ontology",
   :rdfs/comment
   "Defines the class Authorization and its essential properties,\n    and also some classes of access such as read and write. ",
   :xsd/anyURI "http://www.w3.org/ns/auth/acl"})

(def urn:uuid:1e5fbb36-39af-586c-b39d-20c6cd5ac428
  {:foaf/topic {:xsd/anyURI "http://www.w3.org/ns/auth/acl"},
   :xsd/anyURI "https://solidproject.org/TR/wac"})

(def urn:uuid:85e7fd5f-6c0a-51cc-838d-e6a6082122e8
  {:foaf/topic {:xsd/anyURI "http://www.w3.org/ns/auth/acl"},
   :xsd/anyURI "https://www.w3.org/wiki/WebAccessControl"})