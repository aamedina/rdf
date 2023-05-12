(ns net.wikipunk.rdf.acl
  "Basic Access Control ontology"
  {:dcterms/title "Basic Access Control ontology",
   :rdf/ns-prefix-map {"acl"     "http://www.w3.org/ns/auth/acl#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "gen"     "http://www.w3.org/2006/gen/ont#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "vcard"   "http://www.w3.org/2006/vcard/ns#",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "acl",
   :rdfa/uri "http://www.w3.org/ns/auth/acl",
   :rdfs/comment
   "Defines the class Authorization and its essential properties,\n    and also some classes of access such as read and write. "}
  (:refer-clojure :exclude [agent]))

(def Access
  "Any kind of access to a resource. Don't use this, use R W and RW"
  {:db/ident :acl/Access,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Any kind of access to a resource. Don't use this, use R W and RW",
   :rdfs/label "access",
   :rdfs/subClassOf [:rdfs/Resource :acl/Access]})

(def Append
  "Append accesses are specific write access which only add information, and do not remove information. For text files, for example, append access allows bytes to be added onto the end of the file. For RDF graphs, Append access allows adds triples to the graph but does not remove any. Append access is useful for dropbox functionality. Dropbox can be used for link notification, which the information added is a notification that a some link has been made elsewhere relevant to the given resource."
  {:db/ident :acl/Append,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Append accesses are specific write access which only add information, and do not remove information.\n    For text files, for example, append access allows bytes to be added onto the end of the file.\n    For RDF graphs, Append access allows adds triples to the graph but does not remove any.\n    Append access is useful for dropbox functionality.\n    Dropbox can be used for link notification, which the information added is a notification\n    that a some link has been made elsewhere relevant to the given resource.\n    ",
   :rdfs/label "append",
   :rdfs/subClassOf [:acl/Write :acl/Access :acl/Append :rdfs/Resource]})

(def AuthenticatedAgent
  "A class of agents who have been authenticated. In other words, anyone can access this resource, but not anonymously. The social expectation is that the authentication process will provide an identify and a name, or pseudonym. (A new ID should not be minted for every access: the intent is that the user is able to continue to use the ID for continues interactions with peers, and for example to develop a reputation)"
  {:db/ident :acl/AuthenticatedAgent,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A class of agents who have been authenticated.\nIn other words, anyone can access this resource, but not anonymously.\nThe social expectation is that the authentication process will provide an\nidentify and a name, or pseudonym.\n(A new ID should not be minted for every access: the intent is that the user\nis able to continue to use the ID for continues interactions with peers,\nand for example to develop a reputation)\n",
   :rdfs/label "Anyone authenticated",
   :rdfs/subClassOf [:rdfs/Resource :foaf/Agent :acl/AuthenticatedAgent]})

(def Authorization
  "An element of access control, allowing agent to agents access of some kind to resources or classes of resources"
  {:db/ident :acl/Authorization,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An element of access control,\n    allowing agent to agents access of some kind to resources or classes of resources",
   :rdfs/label "authorization",
   :rdfs/subClassOf [:rdfs/Resource :acl/Authorization]})

(def Control
  "Allows read/write access to the ACL for the resource(s)"
  {:db/ident        :acl/Control,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "Allows read/write access to the ACL for the resource(s)",
   :rdfs/label      "control",
   :rdfs/subClassOf [:rdfs/Resource :acl/Access :acl/Control]})

(def Origin
  "An Origin is basically a web site (Note WITHOUT the trailing slash after the domain name and port in its URI) and is the basis for controlling access to data by web apps in the Same Origin Model of web security. All scripts from the same origin are given the same right."
  {:db/ident :acl/Origin,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An Origin is basically a web site\n        (Note WITHOUT the trailing slash after the domain name and port in its URI)\n        and is the basis for controlling access to data by web apps\n        in the Same Origin Model of web security.\n        All scripts from the same origin are given the same right.",
   :rdfs/label "Origin",
   :rdfs/seeAlso
   ["https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin"],
   :rdfs/subClassOf [:rdfs/Resource :acl/Origin]})

(def Read
  "The class of read operations"
  {:db/ident        :acl/Read,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "The class of read operations",
   :rdfs/label      "read",
   :rdfs/subClassOf [:rdfs/Resource :acl/Access :acl/Read]})

(def Write
  "write"
  {:db/ident        :acl/Write,
   :rdf/type        :rdfs/Class,
   :rdfs/label      "write",
   :rdfs/subClassOf [:rdfs/Resource :acl/Access :acl/Write]})

(def accessControl
  "The Access Control file for this information resource. This may of course be a virtual resource implemented by the access control system. Note that HTTP header `Link: <foo.acl>; rel=\"acl\"` can also be used for this."
  {:db/ident :acl/accessControl,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The Access Control file for this information resource.\n        This may of course be a virtual resource implemented by the access control system.\n        Note that HTTP header `Link: <foo.acl>; rel=\"acl\"` can also be used for this.",
   :rdfs/domain :gen/InformationResource,
   :rdfs/label "access control",
   :rdfs/range :gen/InformationResource,
   :rdfs/seeAlso ["https://solidproject.org/TR/wac#acl-link-relation"],
   :rdfs/subPropertyOf [:rdfs/seeAlso :acl/accessControl]})

(def accessTo
  "The information resource to which access is being granted."
  {:db/ident :acl/accessTo,
   :rdf/type :rdf/Property,
   :rdfs/comment "The information resource to which access is being granted.",
   :rdfs/domain :acl/Authorization,
   :rdfs/label "to",
   :rdfs/range :gen/InformationResource,
   :rdfs/subPropertyOf :acl/accessTo})

(def accessToClass
  "A class of information resources to which access is being granted."
  {:db/ident :acl/accessToClass,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A class of information resources to which access is being granted.",
   :rdfs/domain :acl/Authorization,
   :rdfs/label "to all in",
   :rdfs/range :rdfs/Class,
   :rdfs/subPropertyOf :acl/accessToClass})

(def agent
  "A person or social entity to being given the right"
  {:db/ident           :acl/agent,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A person or social entity to being given the right",
   :rdfs/domain        :acl/Authorization,
   :rdfs/label         "agent",
   :rdfs/range         :foaf/Agent,
   :rdfs/subPropertyOf :acl/agent})

(def agentClass
  "A class of persons or social entities to being given the right"
  {:db/ident :acl/agentClass,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A class of persons or social entities to being given the right",
   :rdfs/domain :acl/Authorization,
   :rdfs/label "agent class",
   :rdfs/range :rdfs/Class,
   :rdfs/subPropertyOf :acl/agentClass})

(def agentGroup
  "A group of persons or social entities to being given the right. The right is given to any entity which is a vcard:member of the group, as defined by the document received when the Group is dereferenced."
  {:db/ident :acl/agentGroup,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A group of persons or social entities to being given the right.\n          The right is given to any entity which is a vcard:member of the group,\n          as defined by the document received when the Group is dereferenced.",
   :rdfs/domain :acl/Authorization,
   :rdfs/label "agent group",
   :rdfs/range :vcard/Group,
   :rdfs/subPropertyOf :acl/agentGroup})

(def default
  "If a resource has no ACL file (it is 404), then access to the resource is given by the ACL of the immediately containing directory, or failing that (404) the ACL of the recursively next containing directory which has an ACL file. Within that ACL file, any Authorization which has that directory as its acl:default applies to the resource. (The highest directory must have an ACL file.)"
  {:db/ident :acl/default,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "If a resource has no ACL file (it is 404),\n        then access to the resource is given by the ACL of the immediately\n        containing directory, or failing that (404) the ACL of the recursively next\n        containing directory which has an ACL file.\n        Within that ACL file,\n        any Authorization which has that directory as its acl:default applies to the\n        resource. (The highest directory must have an ACL file.)\n",
   :rdfs/domain :acl/Authorization,
   :rdfs/label "default access for things in this",
   :rdfs/subPropertyOf :acl/default})

(def defaultForNew
  "THIS IS OBSOLETE AS OF 2017-08-01. See 'default'. Was: A directory for which this authorization is used for new files in the directory."
  {:db/ident :acl/defaultForNew,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "THIS IS OBSOLETE AS OF 2017-08-01.   See 'default'.\n        Was: A directory for which this authorization is used for new files in the directory.",
   :rdfs/domain :acl/Authorization,
   :rdfs/label "default access for new things in the object",
   :rdfs/subPropertyOf :acl/defaultForNew})

(def delegates
  "Delegates a person or another agent to act on behalf of the agent. For example, Alice delegates Bob to act on behalf of Alice for ACL purposes."
  {:db/ident :acl/delegates,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Delegates a person or another agent to act on behalf of the agent.\n    For example, Alice delegates Bob to act on behalf of Alice for ACL purposes.",
   :rdfs/label "delegates",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf :acl/delegates})

(def mode
  "A mode of access such as read or write."
  {:db/ident           :acl/mode,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A mode of access such as read or write.",
   :rdfs/domain        :acl/Authorization,
   :rdfs/label         "access mode",
   :rdfs/range         :rdfs/Class,
   :rdfs/subPropertyOf :acl/mode})

(def origin
  "A web application, identified by its Origin, such as <https://scripts.example.com>, being given the right. When a user of the web application at a certain origin accesses the server, then the browser sets the Origin: header to warn that a possibly untrusted webapp is being used. Then, BOTH the user AND the origin must have the required access."
  {:db/ident :acl/origin,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A web application, identified by its Origin, such as\n        <https://scripts.example.com>, being given the right.\n        When a user of the web application at a certain origin accesses the server,\n        then the browser sets the Origin: header to warn that a possibly untrusted webapp\n        is being used.\n        Then, BOTH the user AND the origin must have the required access.",
   :rdfs/domain :acl/Authorization,
   :rdfs/label "origin",
   :rdfs/range :acl/Origin,
   :rdfs/seeAlso
   ["https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Origin"],
   :rdfs/subPropertyOf :acl/origin})

(def owner
  "The person or other agent which owns this. For example, the owner of a file in a filesystem. There is a sense of \"right to control\". Typically defaults to the agent who created something, but can be changed."
  {:db/ident :acl/owner,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The person or other agent which owns this.\n    For example, the owner of a file in a filesystem.\n    There is a sense of \"right to control\".   Typically defaults to the agent who created\n    something, but can be changed.",
   :rdfs/label "owner",
   :rdfs/range :foaf/Agent,
   :rdfs/subPropertyOf :acl/owner})

(def ^{:private true} Agent
  {:db/ident        :foaf/Agent,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :foaf/Agent})