(ns net.wikipunk.rdf.ldp
  {:dcat/downloadURL "net/wikipunk/boot/ldp.rdf",
   :dcterms/description
   "Vocabulary URIs defined in the Linked Data Platform (LDP) namespace.",
   :dcterms/title "The W3C Linked Data Platform (LDP) Vocabulary",
   :namespaces {"dcterms" "http://purl.org/dc/terms/",
                "ldp"     "http://www.w3.org/ns/ldp#",
                "owl"     "http://www.w3.org/2002/07/owl#",
                "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                "vs"      "http://www.w3.org/2003/06/sw-vocab-status/ns#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "ldp",
   :rdfa/uri "http://www.w3.org/ns/ldp#",
   :rdfs/comment
   "This ontology provides an informal representation of the concepts and terms as defined in the LDP specification.  Consult the LDP specification for normative reference.",
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/TR/ldp/"},
   :rdfs/label "W3C Linked Data Platform (LDP)",
   :rdfs/seeAlso #{{:xsd/anyURI "http://www.w3.org/2012/ldp"}
                   {:xsd/anyURI "http://www.w3.org/TR/ldp/"}
                   {:xsd/anyURI "http://www.w3.org/2011/09/LinkedData/"}
                   {:xsd/anyURI "http://www.w3.org/TR/ldp-paging/"}
                   {:xsd/anyURI "http://www.w3.org/TR/ldp-ucr/"}},
   :xsd/anyURI "http://www.w3.org/ns/ldp#"})

(def Ascending
  {:db/ident         :ldp/Ascending,
   :rdf/type         :owl/NamedIndividual,
   :rdfs/comment     "Ascending order.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label       "Ascending",
   :vs/term_status   "testing"})

(def BasicContainer
  {:db/ident :ldp/BasicContainer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An LDPC that uses a predefined predicate to simply link to its contained resources.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label "BasicContainer",
   :rdfs/subClassOf :ldp/Container,
   :vs/term_status "stable"})

(def Container
  {:db/ident :ldp/Container,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A Linked Data Platform RDF Source (LDP-RS) that also conforms to additional patterns and conventions for managing membership. Readers should refer to the specification defining this ontology for the list of behaviors associated with it.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label "Container",
   :rdfs/subClassOf :ldp/RDFSource,
   :vs/term_status "stable"})

(def Descending
  {:db/ident         :ldp/Descending,
   :rdf/type         :owl/NamedIndividual,
   :rdfs/comment     "Descending order.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label       "Descending",
   :vs/term_status   "testing"})

(def DirectContainer
  {:db/ident :ldp/DirectContainer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An LDPC that is similar to a LDP-DC but it allows an indirection with the ability to list as member a resource, such as a URI representing a real-world object, that is different from the resource that is created.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label "DirectContainer",
   :rdfs/subClassOf :ldp/Container,
   :vs/term_status "stable"})

(def IndirectContainer
  {:db/ident :ldp/IndirectContainer,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "An LDPC that has the flexibility of choosing what form the membership triples take.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label "IndirectContainer",
   :rdfs/subClassOf :ldp/Container,
   :vs/term_status "stable"})

(def MemberSubject
  {:db/ident :ldp/MemberSubject,
   :rdf/type :owl/NamedIndividual,
   :rdfs/comment
   "Used to indicate default and typical behavior for ldp:insertedContentRelation, where the member-URI value in the membership triple added when a creation request is successful is the URI assigned to the newly created resource.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label "MemberSubject",
   :vs/term_status "stable"})

(def NonRDFSource
  {:db/ident :ldp/NonRDFSource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A Linked Data Platform Resource (LDPR) whose state is NOT represented as RDF.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label "NonRDFSource",
   :rdfs/subClassOf :ldp/Resource,
   :vs/term_status "stable"})

(def Page
  {:db/ident :ldp/Page,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "URI signifying that the resource is an in-sequence page resource, as defined by LDP Paging.  Typically used on Link rel='type' response headers.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label "Page",
   :vs/term_status "testing"})

(def PageSortCriterion
  {:db/ident :ldp/PageSortCriterion,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Element in the list of sorting criteria used by the server to assign container members to pages.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label "PageSortCriterion",
   :vs/term_status "testing"})

(def PreferContainment
  {:db/ident :ldp/PreferContainment,
   :rdf/type :owl/NamedIndividual,
   :rdfs/comment
   "URI identifying a LDPC's containment triples, for example to allow clients to express interest in receiving them.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label "PreferContainment",
   :vs/term_status "stable"})

(def PreferEmptyContainer
  {:db/ident               :ldp/PreferEmptyContainer,
   :owl/equivalentProperty :ldp/PreferMinimalContainer,
   :rdf/type               :owl/NamedIndividual,
   :rdfs/comment           "Archaic alias for ldp:PreferMinimalContainer",
   :rdfs/isDefinedBy       {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label             "PreferEmptyContainer",
   :rdfs/seeAlso           :ldp/PreferMinimalContainer,
   :vs/term_status         "archaic"})

(def PreferMembership
  {:db/ident :ldp/PreferMembership,
   :rdf/type :owl/NamedIndividual,
   :rdfs/comment
   "URI identifying a LDPC's membership triples, for example to allow clients to express interest in receiving them.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label "PreferMembership",
   :vs/term_status "stable"})

(def PreferMinimalContainer
  {:db/ident :ldp/PreferMinimalContainer,
   :rdf/type :owl/NamedIndividual,
   :rdfs/comment
   "URI identifying the subset of a LDPC's triples present in an empty LDPC, for example to allow clients to express interest in receiving them.  Currently this excludes containment and membership triples, but in the future other exclusions might be added.  This definition is written to automatically exclude those new classes of triples.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label "PreferMinimalContainer",
   :vs/term_status "stable"})

(def RDFSource
  {:db/ident :ldp/RDFSource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A Linked Data Platform Resource (LDPR) whose state is represented as RDF.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label "RDFSource",
   :rdfs/subClassOf :ldp/Resource,
   :vs/term_status "stable"})

(def Resource
  {:db/ident :ldp/Resource,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "A HTTP-addressable resource whose lifecycle is managed by a LDP server.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label "Resource",
   :vs/term_status "stable"})

(def constrainedBy
  {:db/ident :ldp/constrainedBy,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Links a resource with constraints that the server requires requests like creation and update to conform to.",
   :rdfs/domain :ldp/Resource,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label "constrainedBy",
   :rdfs/range :rdfs/Resource,
   :vs/term_status "stable"})

(def contains
  {:db/ident :ldp/contains,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Links a container with resources created through the container.",
   :rdfs/domain :ldp/Container,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label "contains",
   :rdfs/range :rdfs/Resource,
   :vs/term_status "stable"})

(def hasMemberRelation
  {:db/ident :ldp/hasMemberRelation,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Indicates which predicate is used in membership triples, and that the membership triple pattern is < membership-constant-URI , object-of-hasMemberRelation, member-URI >.",
   :rdfs/domain :ldp/Container,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label "hasMemberRelation",
   :rdfs/range :rdf/Property,
   :vs/term_status "stable"})

(def inbox
  {:db/ident :ldp/inbox,
   :dcterms/creator #{{:xsd/anyURI "https://rhiaro.co.uk/#me"}
                      {:xsd/anyURI "http://csarven.ca/#i"}},
   :dcterms/issued #inst "2016-09-29T00:00:00.000-00:00",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Links a resource to a container where notifications for the resource can be created and discovered.",
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/TR/ldn/"},
   :rdfs/label "inbox",
   :vs/term_status "stable"})

(def insertedContentRelation
  {:db/ident :ldp/insertedContentRelation,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Indicates which triple in a creation request should be used as the member-URI value in the membership triple added when the creation request is successful.",
   :rdfs/domain :ldp/Container,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label "insertedContentRelation",
   :rdfs/range :rdf/Property,
   :vs/term_status "stable"})

(def isMemberOfRelation
  {:db/ident :ldp/isMemberOfRelation,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Indicates which predicate is used in membership triples, and that the membership triple pattern is < member-URI , object-of-isMemberOfRelation, membership-constant-URI >.",
   :rdfs/domain :ldp/Container,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label "isMemmberOfRelation",
   :rdfs/range :rdf/Property,
   :vs/term_status "stable"})

(def member
  {:db/ident :ldp/member,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "LDP servers should use this predicate as the membership predicate if there is no obvious predicate from an application vocabulary to use.",
   :rdfs/domain :ldp/Resource,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label "member",
   :rdfs/range :rdfs/Resource,
   :vs/term_status "stable"})

(def membershipResource
  {:db/ident :ldp/membershipResource,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Indicates the membership-constant-URI in a membership triple.  Depending upon the membership triple pattern a container uses, as indicated by the presence of ldp:hasMemberRelation or ldp:isMemberOfRelation, the membership-constant-URI might occupy either the subject or object position in membership triples.",
   :rdfs/domain :ldp/Container,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label "membershipResource",
   :rdfs/range :rdfs/Resource,
   :vs/term_status "stable"})

(def pageSequence
  {:db/ident :ldp/pageSequence,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Link to a page sequence resource, as defined by LDP Paging.  Typically used to communicate the sorting criteria used to allocate LDPC members to pages.",
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label "Page",
   :vs/term_status "testing"})

(def pageSortCollation
  {:db/ident :ldp/pageSortCollation,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The collation used to order the members across pages in a page sequence when comparing strings.",
   :rdfs/domain :ldp/PageSortCriterion,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label "pageSortCollation",
   :rdfs/range :rdf/Property,
   :vs/term_status "testing"})

(def pageSortCriteria
  {:db/ident :ldp/pageSortCriteria,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Link to the list of sorting criteria used by the server in a representation.  Typically used on Link response headers as an extension link relation URI in the rel= parameter.",
   :rdfs/domain :ldp/Page,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label "pageSortCriteria",
   :rdfs/range :rdf/List,
   :vs/term_status "testing"})

(def pageSortOrder
  {:db/ident :ldp/pageSortOrder,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The ascending/descending/etc order used to order the members across pages in a page sequence.",
   :rdfs/domain :ldp/PageSortCriterion,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label "pageSortOrder",
   :rdfs/range :rdfs/Resource,
   :vs/term_status "testing"})

(def pageSortPredicate
  {:db/ident :ldp/pageSortPredicate,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Predicate used to specify the order of the members across a page sequence's in-sequence page resources; it asserts nothing about the order of members in the representation of a single page.",
   :rdfs/domain :ldp/PageSortCriterion,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/ldp#"},
   :rdfs/label "pageSortPredicate",
   :rdfs/range :rdf/Property,
   :vs/term_status "testing"})

(def urn:uuid:05357ef9-c431-5127-8901-2774f83532f1
  {:dcterms/description
   "Vocabulary URIs defined in the Linked Data Platform (LDP) namespace.",
   :dcterms/title "The W3C Linked Data Platform (LDP) Vocabulary",
   :rdf/type :owl/Ontology,
   :rdfs/comment
   "This ontology provides an informal representation of the concepts and terms as defined in the LDP specification.  Consult the LDP specification for normative reference.",
   :rdfs/label "W3C Linked Data Platform (LDP)",
   :rdfs/seeAlso #{{:xsd/anyURI "http://www.w3.org/2012/ldp"}
                   {:xsd/anyURI "http://www.w3.org/TR/ldp/"}
                   {:xsd/anyURI "http://www.w3.org/2011/09/LinkedData/"}
                   {:xsd/anyURI "http://www.w3.org/TR/ldp-paging/"}
                   {:xsd/anyURI "http://www.w3.org/TR/ldp-ucr/"}},
   :xsd/anyURI "http://www.w3.org/ns/ldp#"})