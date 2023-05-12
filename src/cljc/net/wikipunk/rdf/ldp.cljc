(ns net.wikipunk.rdf.ldp
  "Vocabulary URIs defined in the Linked Data Platform (LDP) namespace."
  {:dcterms/created #inst "2015-02-26T00:00:00.000-05:00",
   :dcterms/creator [{:foaf/name "Ashok Malhotra"}
                     {:foaf/name "Steve Speicher"}
                     {:foaf/name "John Arwe"}],
   :dcterms/description
   "Vocabulary URIs defined in the Linked Data Platform (LDP) namespace.",
   :dcterms/publisher "http://www.w3.org/data#W3C",
   :dcterms/title "The W3C Linked Data Platform (LDP) Vocabulary",
   :foaf/maker {:foaf/homepage "http://www.w3.org/2012/ldp"},
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "ldp" "http://www.w3.org/ns/ldp#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "vann" "http://purl.org/vocab/vann/",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "ldp",
   :rdfa/uri "http://www.w3.org/ns/ldp#",
   :rdfs/comment
   "This ontology provides an informal representation of the concepts and terms as defined in the LDP specification.  Consult the LDP specification for normative reference.",
   :rdfs/isDefinedBy {:rdf/uri "https://www.w3.org/TR/ldp/"},
   :rdfs/label "W3C Linked Data Platform (LDP)",
   :rdfs/seeAlso ["http://www.w3.org/TR/ldp/"
                  "http://www.w3.org/TR/ldp-ucr/"
                  "http://www.w3.org/2012/ldp"
                  "http://www.w3.org/2011/09/LinkedData/"
                  "http://www.w3.org/TR/ldp-paging/"],
   :vann/preferredNamespacePrefix "ldp",
   :vann/preferredNamespaceUri "http://www.w3.org/ns/ldp#"})

(def Ascending
  "Ascending order."
  {:db/ident         :ldp/Ascending,
   :rdf/type         :owl/Individual,
   :rdfs/comment     "Ascending order.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label       "Ascending",
   :vs/term_status   "testing"})

(def BasicContainer
  "An LDPC that uses a predefined predicate to simply link to its contained resources."
  {:db/ident :ldp/BasicContainer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An LDPC that uses a predefined predicate to simply link to its contained resources.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label "BasicContainer",
   :rdfs/subClassOf [:ldp/Container
                     :ldp/BasicContainer
                     :ldp/RDFSource
                     :rdfs/Resource
                     :ldp/Resource],
   :vs/term_status "stable"})

(def Container
  "A Linked Data Platform RDF Source (LDP-RS) that also conforms to additional patterns and conventions for managing membership. Readers should refer to the specification defining this ontology for the list of behaviors associated with it."
  {:db/ident :ldp/Container,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A Linked Data Platform RDF Source (LDP-RS) that also conforms to additional patterns and conventions for managing membership. Readers should refer to the specification defining this ontology for the list of behaviors associated with it.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label "Container",
   :rdfs/subClassOf
   [:ldp/RDFSource :ldp/Container :rdfs/Resource :ldp/Resource],
   :vs/term_status "stable"})

(def Descending
  "Descending order."
  {:db/ident         :ldp/Descending,
   :rdf/type         :owl/Individual,
   :rdfs/comment     "Descending order.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label       "Descending",
   :vs/term_status   "testing"})

(def DirectContainer
  "An LDPC that is similar to a LDP-DC but it allows an indirection with the ability to list as member a resource, such as a URI representing a real-world object, that is different from the resource that is created."
  {:db/ident :ldp/DirectContainer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An LDPC that is similar to a LDP-DC but it allows an indirection with the ability to list as member a resource, such as a URI representing a real-world object, that is different from the resource that is created.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label "DirectContainer",
   :rdfs/subClassOf [:ldp/Container
                     :ldp/DirectContainer
                     :ldp/RDFSource
                     :rdfs/Resource
                     :ldp/Resource],
   :vs/term_status "stable"})

(def IndirectContainer
  "An LDPC that has the flexibility of choosing what form the membership triples take."
  {:db/ident :ldp/IndirectContainer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An LDPC that has the flexibility of choosing what form the membership triples take.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label "IndirectContainer",
   :rdfs/subClassOf [:ldp/Container
                     :ldp/IndirectContainer
                     :ldp/RDFSource
                     :rdfs/Resource
                     :ldp/Resource],
   :vs/term_status "stable"})

(def MemberSubject
  "Used to indicate default and typical behavior for ldp:insertedContentRelation, where the member-URI value in the membership triple added when a creation request is successful is the URI assigned to the newly created resource."
  {:db/ident :ldp/MemberSubject,
   :rdf/type :owl/Individual,
   :rdfs/comment
   "Used to indicate default and typical behavior for ldp:insertedContentRelation, where the member-URI value in the membership triple added when a creation request is successful is the URI assigned to the newly created resource.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label "MemberSubject",
   :vs/term_status "stable"})

(def NonRDFSource
  "A Linked Data Platform Resource (LDPR) whose state is NOT represented as RDF."
  {:db/ident :ldp/NonRDFSource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A Linked Data Platform Resource (LDPR) whose state is NOT represented as RDF.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label "NonRDFSource",
   :rdfs/subClassOf [:ldp/Resource :ldp/NonRDFSource :rdfs/Resource],
   :vs/term_status "stable"})

(def Page
  "URI signifying that the resource is an in-sequence page resource, as defined by LDP Paging. Typically used on Link rel='type' response headers."
  {:db/ident :ldp/Page,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "URI signifying that the resource is an in-sequence page resource, as defined by LDP Paging.  Typically used on Link rel='type' response headers.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label "Page",
   :rdfs/subClassOf [:rdfs/Resource :ldp/Page],
   :vs/term_status "testing"})

(def PageSortCriterion
  "Element in the list of sorting criteria used by the server to assign container members to pages."
  {:db/ident :ldp/PageSortCriterion,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Element in the list of sorting criteria used by the server to assign container members to pages.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label "PageSortCriterion",
   :rdfs/subClassOf [:rdfs/Resource :ldp/PageSortCriterion],
   :vs/term_status "testing"})

(def PreferContainment
  "URI identifying a LDPC's containment triples, for example to allow clients to express interest in receiving them."
  {:db/ident :ldp/PreferContainment,
   :rdf/type :owl/Individual,
   :rdfs/comment
   "URI identifying a LDPC's containment triples, for example to allow clients to express interest in receiving them.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label "PreferContainment",
   :vs/term_status "stable"})

(def PreferEmptyContainer
  "Archaic alias for ldp:PreferMinimalContainer"
  {:db/ident               :ldp/PreferEmptyContainer,
   :owl/equivalentProperty :ldp/PreferMinimalContainer,
   :rdf/type               :owl/Individual,
   :rdfs/comment           "Archaic alias for ldp:PreferMinimalContainer",
   :rdfs/isDefinedBy       "http://www.w3.org/ns/ldp#",
   :rdfs/label             "PreferEmptyContainer",
   :rdfs/seeAlso           ["http://www.w3.org/ns/ldp#PreferMinimalContainer"],
   :vs/term_status         "archaic"})

(def PreferMembership
  "URI identifying a LDPC's membership triples, for example to allow clients to express interest in receiving them."
  {:db/ident :ldp/PreferMembership,
   :rdf/type :owl/Individual,
   :rdfs/comment
   "URI identifying a LDPC's membership triples, for example to allow clients to express interest in receiving them.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label "PreferMembership",
   :vs/term_status "stable"})

(def PreferMinimalContainer
  "URI identifying the subset of a LDPC's triples present in an empty LDPC, for example to allow clients to express interest in receiving them. Currently this excludes containment and membership triples, but in the future other exclusions might be added. This definition is written to automatically exclude those new classes of triples."
  {:db/ident :ldp/PreferMinimalContainer,
   :rdf/type :owl/Individual,
   :rdfs/comment
   "URI identifying the subset of a LDPC's triples present in an empty LDPC, for example to allow clients to express interest in receiving them.  Currently this excludes containment and membership triples, but in the future other exclusions might be added.  This definition is written to automatically exclude those new classes of triples.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label "PreferMinimalContainer",
   :vs/term_status "stable"})

(def RDFSource
  "A Linked Data Platform Resource (LDPR) whose state is represented as RDF."
  {:db/ident :ldp/RDFSource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A Linked Data Platform Resource (LDPR) whose state is represented as RDF.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label "RDFSource",
   :rdfs/subClassOf [:ldp/Resource :ldp/RDFSource :rdfs/Resource],
   :vs/term_status "stable"})

(def Resource
  "A HTTP-addressable resource whose lifecycle is managed by a LDP server."
  {:db/ident :ldp/Resource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A HTTP-addressable resource whose lifecycle is managed by a LDP server.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label "Resource",
   :rdfs/subClassOf [:rdfs/Resource :ldp/Resource],
   :vs/term_status "stable"})

(def constrainedBy
  "Links a resource with constraints that the server requires requests like creation and update to conform to."
  {:db/ident :ldp/constrainedBy,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Links a resource with constraints that the server requires requests like creation and update to conform to.",
   :rdfs/domain :ldp/Resource,
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label "constrainedBy",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :ldp/constrainedBy,
   :vs/term_status "stable"})

(def contains
  "Links a container with resources created through the container."
  {:db/ident :ldp/contains,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Links a container with resources created through the container.",
   :rdfs/domain :ldp/Container,
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label "contains",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :ldp/contains,
   :vs/term_status "stable"})

(def hasMemberRelation
  "Indicates which predicate is used in membership triples, and that the membership triple pattern is < membership-constant-URI , object-of-hasMemberRelation, member-URI >."
  {:db/ident :ldp/hasMemberRelation,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Indicates which predicate is used in membership triples, and that the membership triple pattern is < membership-constant-URI , object-of-hasMemberRelation, member-URI >.",
   :rdfs/domain :ldp/Container,
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label "hasMemberRelation",
   :rdfs/range :rdf/Property,
   :rdfs/subPropertyOf :ldp/hasMemberRelation,
   :vs/term_status "stable"})

(def inbox
  "Links a resource to a container where notifications for the resource can be created and discovered."
  {:db/ident :ldp/inbox,
   :dcterms/creator ["https://rhiaro.co.uk/#me" "http://csarven.ca/#i"],
   :dcterms/issued #inst "2016-09-29T00:00:00.000-04:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Links a resource to a container where notifications for the resource can be created and discovered.",
   :rdfs/isDefinedBy "https://www.w3.org/TR/ldn/",
   :rdfs/label "inbox",
   :rdfs/subPropertyOf :ldp/inbox,
   :vs/term_status "stable"})

(def insertedContentRelation
  "Indicates which triple in a creation request should be used as the member-URI value in the membership triple added when the creation request is successful."
  {:db/ident :ldp/insertedContentRelation,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Indicates which triple in a creation request should be used as the member-URI value in the membership triple added when the creation request is successful.",
   :rdfs/domain :ldp/Container,
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label "insertedContentRelation",
   :rdfs/range :rdf/Property,
   :rdfs/subPropertyOf :ldp/insertedContentRelation,
   :vs/term_status "stable"})

(def isMemberOfRelation
  "Indicates which predicate is used in membership triples, and that the membership triple pattern is < member-URI , object-of-isMemberOfRelation, membership-constant-URI >."
  {:db/ident :ldp/isMemberOfRelation,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Indicates which predicate is used in membership triples, and that the membership triple pattern is < member-URI , object-of-isMemberOfRelation, membership-constant-URI >.",
   :rdfs/domain :ldp/Container,
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label "isMemmberOfRelation",
   :rdfs/range :rdf/Property,
   :rdfs/subPropertyOf :ldp/isMemberOfRelation,
   :vs/term_status "stable"})

(def member
  "LDP servers should use this predicate as the membership predicate if there is no obvious predicate from an application vocabulary to use."
  {:db/ident :ldp/member,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "LDP servers should use this predicate as the membership predicate if there is no obvious predicate from an application vocabulary to use.",
   :rdfs/domain :ldp/Resource,
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label "member",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :ldp/member,
   :vs/term_status "stable"})

(def membershipResource
  "Indicates the membership-constant-URI in a membership triple. Depending upon the membership triple pattern a container uses, as indicated by the presence of ldp:hasMemberRelation or ldp:isMemberOfRelation, the membership-constant-URI might occupy either the subject or object position in membership triples."
  {:db/ident :ldp/membershipResource,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Indicates the membership-constant-URI in a membership triple.  Depending upon the membership triple pattern a container uses, as indicated by the presence of ldp:hasMemberRelation or ldp:isMemberOfRelation, the membership-constant-URI might occupy either the subject or object position in membership triples.",
   :rdfs/domain :ldp/Container,
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label "membershipResource",
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :ldp/membershipResource,
   :vs/term_status "stable"})

(def pageSequence
  "Link to a page sequence resource, as defined by LDP Paging. Typically used to communicate the sorting criteria used to allocate LDPC members to pages."
  {:db/ident :ldp/pageSequence,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Link to a page sequence resource, as defined by LDP Paging.  Typically used to communicate the sorting criteria used to allocate LDPC members to pages.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label "Page",
   :rdfs/subPropertyOf :ldp/pageSequence,
   :vs/term_status "testing"})

(def pageSortCollation
  "The collation used to order the members across pages in a page sequence when comparing strings."
  {:db/ident :ldp/pageSortCollation,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The collation used to order the members across pages in a page sequence when comparing strings.",
   :rdfs/domain :ldp/PageSortCriterion,
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label "pageSortCollation",
   :rdfs/range :rdf/Property,
   :rdfs/subPropertyOf :ldp/pageSortCollation,
   :vs/term_status "testing"})

(def pageSortCriteria
  "Link to the list of sorting criteria used by the server in a representation. Typically used on Link response headers as an extension link relation URI in the rel= parameter."
  {:db/ident :ldp/pageSortCriteria,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Link to the list of sorting criteria used by the server in a representation.  Typically used on Link response headers as an extension link relation URI in the rel= parameter.",
   :rdfs/domain :ldp/Page,
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label "pageSortCriteria",
   :rdfs/range :rdf/List,
   :rdfs/subPropertyOf :ldp/pageSortCriteria,
   :vs/term_status "testing"})

(def pageSortOrder
  "The ascending/descending/etc order used to order the members across pages in a page sequence."
  {:db/ident :ldp/pageSortOrder,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The ascending/descending/etc order used to order the members across pages in a page sequence.",
   :rdfs/domain :ldp/PageSortCriterion,
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label "pageSortOrder",
   :rdfs/range :rdf/Resource,
   :rdfs/subPropertyOf :ldp/pageSortOrder,
   :vs/term_status "testing"})

(def pageSortPredicate
  "Predicate used to specify the order of the members across a page sequence's in-sequence page resources; it asserts nothing about the order of members in the representation of a single page."
  {:db/ident :ldp/pageSortPredicate,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Predicate used to specify the order of the members across a page sequence's in-sequence page resources; it asserts nothing about the order of members in the representation of a single page.",
   :rdfs/domain :ldp/PageSortCriterion,
   :rdfs/isDefinedBy "http://www.w3.org/ns/ldp#",
   :rdfs/label "pageSortPredicate",
   :rdfs/range :rdf/Property,
   :rdfs/subPropertyOf :ldp/pageSortPredicate,
   :vs/term_status "testing"})