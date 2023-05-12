(ns net.wikipunk.rdf.hydra
  "A lightweight vocabulary for hypermedia-driven Web APIs"
  {:cc/attributionName "Hydra W3C Community Group",
   :cc/attributionURL "http://www.hydra-cg.com/",
   :cc/license "http://creativecommons.org/licenses/by/4.0/",
   :dc11/description
   "The Hydra Core Vocabulary is a lightweight vocabulary to create hypermedia-driven Web APIs. By specifying a number of concepts commonly used in Web APIs it enables the creation of generic API clients.",
   :dc11/publisher "Hydra W3C Community Group",
   :dc11/rights
   "Copyright © 2012-2014 the Contributors to the Hydra Core Vocabulary Specification",
   :rdf/ns-prefix-map {"cc"     "http://creativecommons.org/ns#",
                       "dc11"   "http://purl.org/dc/terms/",
                       "hydra"  "http://www.w3.org/ns/hydra/core#",
                       "owl"    "http://www.w3.org/2002/07/owl#",
                       "rdf"    "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"   "http://www.w3.org/2000/01/rdf-schema#",
                       "schema" "http://schema.org/",
                       "vs"     "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "xsd"    "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "hydra",
   :rdfa/uri "http://www.w3.org/ns/hydra/core",
   :rdfs/comment "A lightweight vocabulary for hypermedia-driven Web APIs",
   :rdfs/label "The Hydra Core Vocabulary",
   :rdfs/seeAlso ["https://www.hydra-cg.com/spec/latest/core/"],
   :vann/preferredNamespacePrefix "hydra"}
  (:refer-clojure :exclude [first last next]))

(def ApiDocumentation
  "The Hydra API documentation class"
  {:db/ident         :hydra/ApiDocumentation,
   :rdf/type         [:hydra/Class :rdfs/Class :rdfs/Resource],
   :rdfs/comment     "The Hydra API documentation class",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label       "ApiDocumentation",
   :rdfs/subClassOf  [:hydra/Resource :hydra/ApiDocumentation],
   :vs/term_status   "testing"})

(def BaseUriSource
  "Provides a base abstract for base Uri source for Iri template resolution."
  {:db/ident :hydra/BaseUriSource,
   :rdf/type [:hydra/Class :rdfs/Class :rdfs/Resource],
   :rdfs/comment
   "Provides a base abstract for base Uri source for Iri template resolution.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "Base Uri source",
   :rdfs/subClassOf [:hydra/Resource :hydra/BaseUriSource],
   :vs/term_status "testing"})

(def BasicRepresentation
  "A representation that serializes just the lexical form of a variable value, but omits language and type information."
  {:db/ident :hydra/BasicRepresentation,
   :rdf/type :hydra/VariableRepresentation,
   :rdfs/comment
   "A representation that serializes just the lexical form of a variable value, but omits language and type information.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "BasicRepresentation",
   :vs/term_status "testing"})

(def T
  "The class of Hydra classes."
  {:db/ident         :hydra/Class,
   :rdf/type         [:rdfs/Class :hydra/Resource],
   :rdfs/comment     "The class of Hydra classes.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label       "Hydra Class",
   :rdfs/subClassOf  [:rdfs/Resource :rdfs/Class :hydra/Class],
   :vs/term_status   "testing"})

(def Collection
  "A collection holding references to a number of related resources."
  {:db/ident :hydra/Collection,
   :rdf/type [:hydra/Class :rdfs/Class :rdfs/Resource],
   :rdfs/comment
   "A collection holding references to a number of related resources.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "Collection",
   :rdfs/subClassOf [:hydra/Resource :hydra/Collection],
   :vs/term_status "testing"})

(def ErrorClass
  "A runtime error, used to report information beyond the returned status code."
  {:db/ident :hydra/Error,
   :rdf/type [:hydra/Class :rdfs/Class :rdfs/Resource],
   :rdfs/comment
   "A runtime error, used to report information beyond the returned status code.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "Error",
   :rdfs/subClassOf [:hydra/Status :hydra/Error],
   :vs/term_status "testing"})

(def ExplicitRepresentation
  "A representation that serializes a variable value including its language and type information and thus differentiating between IRIs and literals."
  {:db/ident :hydra/ExplicitRepresentation,
   :rdf/type :hydra/VariableRepresentation,
   :rdfs/comment
   "A representation that serializes a variable value including its language and type information and thus differentiating between IRIs and literals.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "ExplicitRepresentation",
   :vs/term_status "testing"})

(def HeaderSpecification
  "Specifies a possible either expected or returned header values"
  {:db/ident :hydra/HeaderSpecification,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   "Specifies a possible either expected or returned header values",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "Header specification",
   :rdfs/subClassOf [:rdfs/Resource :hydra/Resource :hydra/HeaderSpecification],
   :vs/term_status "testing"})

(def IriTemplate
  "The class of IRI templates."
  {:db/ident         :hydra/IriTemplate,
   :rdf/type         [:hydra/Class :rdfs/Class :rdfs/Resource],
   :rdfs/comment     "The class of IRI templates.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label       "IRI Template",
   :vs/term_status   "testing"})

(def IriTemplateMapping
  "A mapping from an IRI template variable to a property."
  {:db/ident         :hydra/IriTemplateMapping,
   :rdf/type         [:hydra/Class :rdfs/Class :rdfs/Resource],
   :rdfs/comment     "A mapping from an IRI template variable to a property.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label       "IriTemplateMapping",
   :vs/term_status   "testing"})

(def Link
  "The class of properties representing links."
  {:db/ident         :hydra/Link,
   :rdf/type         [:hydra/Class :rdfs/Class :rdfs/Resource],
   :rdfs/comment     "The class of properties representing links.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label       "Link",
   :rdfs/subClassOf  [:rdf/Property :hydra/Resource :hydra/Link],
   :vs/term_status   "testing"})

(def LinkContext
  "States that the link's context IRI, as defined in RFC 5988, should be used as the base Uri"
  {:db/ident :hydra/LinkContext,
   :rdf/type [:hydra/BaseUriSource :hydra/Resource],
   :rdfs/comment
   "States that the link's context IRI, as defined in RFC 5988, should be used as the base Uri",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "Link context",
   :vs/term_status "testing"})

(def Operation
  "An operation."
  {:db/ident         :hydra/Operation,
   :rdf/type         [:hydra/Class :rdfs/Class :rdfs/Resource],
   :rdfs/comment     "An operation.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label       "Operation",
   :vs/term_status   "testing"})

(def PartialCollectionView
  "A PartialCollectionView describes a partial view of a Collection. Multiple PartialCollectionViews can be connected with the the next/previous properties to allow a client to retrieve all members of the collection."
  {:db/ident :hydra/PartialCollectionView,
   :rdf/type [:hydra/Class :rdfs/Class :rdfs/Resource],
   :rdfs/comment
   "A PartialCollectionView describes a partial view of a Collection. Multiple PartialCollectionViews can be connected with the the next/previous properties to allow a client to retrieve all members of the collection.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "PartialCollectionView",
   :rdfs/subClassOf [:hydra/Resource :hydra/PartialCollectionView],
   :vs/term_status "testing"})

(def Resource
  "The class of dereferenceable resources by means a client can attempt to dereference; however, the received responses should still be verified."
  {:db/ident :hydra/Resource,
   :rdf/type [:hydra/Class :rdfs/Class :rdfs/Resource],
   :rdfs/comment
   "The class of dereferenceable resources by means a client can attempt to dereference; however, the received responses should still be verified.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "Hydra Resource",
   :rdfs/subClassOf :hydra/Resource,
   :vs/term_status "testing"})

(def Rfc3986
  "States that the base Uri should be established using RFC 3986 reference resolution algorithm specified in section 5."
  {:db/ident :hydra/Rfc3986,
   :rdf/type [:hydra/BaseUriSource :hydra/Resource],
   :rdfs/comment
   "States that the base Uri should be established using RFC 3986 reference resolution algorithm specified in section 5.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "RFC 3986 based",
   :vs/term_status "testing"})

(def Rfc6570Template
  "An IRI template as defined by RFC6570."
  {:db/ident         :hydra/Rfc6570Template,
   :rdf/type         :rdfs/Datatype,
   :rdfs/comment     "An IRI template as defined by RFC6570.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label       "RFC6570 IRI template",
   :rdfs/range       :xsd/string,
   :rdfs/seeAlso     ["http://tools.ietf.org/html/rfc6570"],
   :vs/term_status   "testing"})

(def Status
  "Additional information about a status code that might be returned."
  {:db/ident :hydra/Status,
   :rdf/type [:hydra/Class :rdfs/Class :rdfs/Resource],
   :rdfs/comment
   "Additional information about a status code that might be returned.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "Status code description",
   :rdfs/subClassOf :hydra/Status,
   :vs/term_status "testing"})

(def SupportedProperty
  "A property known to be supported by a Hydra class."
  {:db/ident         :hydra/SupportedProperty,
   :rdf/type         [:hydra/Class :rdfs/Class :rdfs/Resource],
   :rdfs/comment     "A property known to be supported by a Hydra class.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label       "Supported Property",
   :vs/term_status   "testing"})

(def TemplatedLink
  "A templated link."
  {:db/ident         :hydra/TemplatedLink,
   :rdf/type         [:hydra/Class :rdfs/Class :rdfs/Resource],
   :rdfs/comment     "A templated link.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label       "Templated Link",
   :rdfs/subClassOf  [:rdf/Property :hydra/Resource :hydra/TemplatedLink],
   :vs/term_status   "testing"})

(def VariableRepresentation
  "A representation specifies how to serialize variable values into strings."
  {:db/ident :hydra/VariableRepresentation,
   :rdf/type [:hydra/Class :rdfs/Class :rdfs/Resource],
   :rdfs/comment
   "A representation specifies how to serialize variable values into strings.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "VariableRepresentation",
   :vs/term_status "testing"})

(def apiDocumentation
  "A link to the API documentation"
  {:db/ident         :hydra/apiDocumentation,
   :rdf/type         [:hydra/Link :hydra/Resource :rdf/Property],
   :rdfs/comment     "A link to the API documentation",
   :rdfs/domain      :hydra/Resource,
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label       "apiDocumentation",
   :rdfs/range       :hydra/ApiDocumentation,
   :vs/term_status   "testing"})

(def closedSet
  "Determines whether the provided set of header values is closed or not."
  {:db/ident :hydra/closedSet,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Determines whether the provided set of header values is closed or not.",
   :rdfs/domain :hydra/HeaderSpecification,
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "closed set",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :hydra/closedSet,
   :vs/term_status "testing"})

(def collection
  "Collections somehow related to this resource."
  {:db/ident         :hydra/collection,
   :rdf/type         [:hydra/Link :hydra/Resource :rdf/Property],
   :rdfs/comment     "Collections somehow related to this resource.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label       "collection",
   :rdfs/range       :hydra/Collection,
   :vs/term_status   "testing"})

(def description
  "A description."
  {:db/ident              :hydra/description,
   :rdf/type              :rdf/Property,
   :rdfs/comment          "A description.",
   :rdfs/isDefinedBy      "http://www.w3.org/ns/hydra/core",
   :rdfs/label            "description",
   :rdfs/range            :xsd/string,
   :rdfs/subPropertyOf    [:rdfs/comment :hydra/description],
   :schema/domainIncludes [:hydra/Link
                           :hydra/Operation
                           :hydra/SupportedProperty
                           :hydra/TemplatedLink
                           :hydra/ApiDocumentation
                           :hydra/Status
                           :hydra/Class],
   :vs/term_status        "testing"})

(def entrypoint
  "A link to main entry point of the Web API"
  {:db/ident         :hydra/entrypoint,
   :rdf/type         [:hydra/Link :hydra/Resource :rdf/Property],
   :rdfs/comment     "A link to main entry point of the Web API",
   :rdfs/domain      :hydra/ApiDocumentation,
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label       "entrypoint",
   :rdfs/range       :hydra/Resource,
   :vs/term_status   "testing"})

(def expects
  "The information expected by the Web API."
  {:db/ident             :hydra/expects,
   :rdf/type             [:hydra/Link :hydra/Resource :rdf/Property],
   :rdfs/comment         "The information expected by the Web API.",
   :rdfs/domain          :hydra/Operation,
   :rdfs/isDefinedBy     "http://www.w3.org/ns/hydra/core",
   :rdfs/label           "expects",
   :schema/rangeIncludes [:rdfs/Resource
                          :hydra/Class
                          :hydra/Resource
                          :rdfs/Class],
   :vs/term_status       "testing"})

(def expectsHeader
  "Specification of the header expected by the operation."
  {:db/ident :hydra/expectsHeader,
   :rdf/type :rdf/Property,
   :rdfs/comment "Specification of the header expected by the operation.",
   :rdfs/domain :hydra/Operation,
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "expects header",
   :rdfs/subPropertyOf :hydra/expectsHeader,
   :schema/rangeIncludes [:hydra/HeaderSpecification :xsd/string],
   :vs/term_status "testing"})

(def extension
  "Hint on what kind of extensions are in use."
  {:db/ident           :hydra/extension,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Hint on what kind of extensions are in use.",
   :rdfs/domain        :hydra/ApiDocumentation,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/hydra/core",
   :rdfs/label         "extension",
   :rdfs/subPropertyOf :hydra/extension,
   :vs/term_status     "testing"})

(def first
  "The first resource of an interlinked set of resources."
  {:db/ident         :hydra/first,
   :rdf/type         [:hydra/Link :hydra/Resource :rdf/Property],
   :rdfs/comment     "The first resource of an interlinked set of resources.",
   :rdfs/domain      :hydra/Resource,
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label       "first",
   :rdfs/range       :hydra/Resource,
   :vs/term_status   "testing"})

(def freetextQuery
  "A property representing a freetext query."
  {:db/ident           :hydra/freetextQuery,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A property representing a freetext query.",
   :rdfs/domain        :hydra/Resource,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/hydra/core",
   :rdfs/label         "freetext query",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :hydra/freetextQuery,
   :vs/term_status     "testing"})

(def headerName
  "Name of the header."
  {:db/ident           :hydra/headerName,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Name of the header.",
   :rdfs/domain        :hydra/HeaderSpecification,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/hydra/core",
   :rdfs/label         "header name",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :hydra/headerName,
   :vs/term_status     "testing"})

(def last
  "The last resource of an interlinked set of resources."
  {:db/ident         :hydra/last,
   :rdf/type         [:hydra/Link :hydra/Resource :rdf/Property],
   :rdfs/comment     "The last resource of an interlinked set of resources.",
   :rdfs/domain      :hydra/Resource,
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label       "last",
   :rdfs/range       :hydra/Resource,
   :vs/term_status   "testing"})

(def limit
  "Instructs to limit set only to N elements."
  {:db/ident           :hydra/limit,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Instructs to limit set only to N elements.",
   :rdfs/isDefinedBy   "http://www.w3.org/ns/hydra/core",
   :rdfs/label         "take",
   :rdfs/range         :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :hydra/limit,
   :vs/term_status     "testing"})

(def manages
  "This predicate is left for compatibility purposes and hydra:memberAssertion should be used instead."
  {:db/ident :hydra/manages,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "This predicate is left for compatibility purposes and hydra:memberAssertion should be used instead.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "manages",
   :rdfs/subPropertyOf [:hydra/memberAssertion :hydra/manages],
   :vs/term_status "archaic"})

(def mapping
  "A variable-to-property mapping of the IRI template."
  {:db/ident           :hydra/mapping,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A variable-to-property mapping of the IRI template.",
   :rdfs/domain        :hydra/IriTemplate,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/hydra/core",
   :rdfs/label         "mapping",
   :rdfs/range         :hydra/IriTemplateMapping,
   :rdfs/subPropertyOf :hydra/mapping,
   :vs/term_status     "testing"})

(def member
  "A member of the collection"
  {:db/ident         :hydra/member,
   :rdf/type         [:hydra/Link :hydra/Resource :rdf/Property],
   :rdfs/comment     "A member of the collection",
   :rdfs/domain      :hydra/Collection,
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label       "member",
   :vs/term_status   "testing"})

(def memberAssertion
  "Semantics of each member provided by the collection."
  {:db/ident           :hydra/memberAssertion,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Semantics of each member provided by the collection.",
   :rdfs/domain        :hydra/Collection,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/hydra/core",
   :rdfs/label         "member assertion",
   :rdfs/subPropertyOf :hydra/memberAssertion,
   :vs/term_status     "testing"})

(def method
  "The HTTP method."
  {:db/ident           :hydra/method,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The HTTP method.",
   :rdfs/domain        :hydra/Operation,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/hydra/core",
   :rdfs/label         "method",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :hydra/method,
   :vs/term_status     "testing"})

(def next
  "The resource following the current instance in an interlinked set of resources."
  {:db/ident :hydra/next,
   :rdf/type [:hydra/Link :hydra/Resource :rdf/Property],
   :rdfs/comment
   "The resource following the current instance in an interlinked set of resources.",
   :rdfs/domain :hydra/Resource,
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "next",
   :rdfs/range :hydra/Resource,
   :vs/term_status "testing"})

(def object
  "The object."
  {:db/ident         :hydra/object,
   :rdfs/comment     "The object.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label       "object",
   :vs/term_status   "testing"})

(def offset
  "Instructs to skip N elements of the set."
  {:db/ident           :hydra/offset,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Instructs to skip N elements of the set.",
   :rdfs/isDefinedBy   "http://www.w3.org/ns/hydra/core",
   :rdfs/label         "skip",
   :rdfs/range         :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :hydra/offset,
   :vs/term_status     "testing"})

(def operation
  "An operation supported by the Hydra resource"
  {:db/ident         :hydra/operation,
   :rdf/type         [:hydra/Link :hydra/Resource :rdf/Property],
   :rdfs/comment     "An operation supported by the Hydra resource",
   :rdfs/domain      :hydra/Resource,
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label       "operation",
   :rdfs/range       :hydra/Operation,
   :vs/term_status   "testing"})

(def pageIndex
  "Instructs to provide a specific page of the collection at a given index."
  {:db/ident :hydra/pageIndex,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Instructs to provide a specific page of the collection at a given index.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "page index",
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf [:hydra/pageReference :hydra/pageIndex],
   :vs/term_status "testing"})

(def pageReference
  "Instructs to provide a specific page reference of the collection."
  {:db/ident :hydra/pageReference,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Instructs to provide a specific page reference of the collection.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "page reference",
   :rdfs/subPropertyOf :hydra/pageReference,
   :vs/term_status "testing"})

(def possibleStatus
  "A status that might be returned by the Web API (other statuses should be expected and properly handled as well)"
  {:db/ident :hydra/possibleStatus,
   :rdf/type [:hydra/Link :hydra/Resource :rdf/Property],
   :rdfs/comment
   "A status that might be returned by the Web API (other statuses should be expected and properly handled as well)",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "possible status",
   :rdfs/range :hydra/Status,
   :schema/domainIncludes [:hydra/Operation :hydra/ApiDocumentation],
   :vs/term_status "testing"})

(def possibleValue
  "Possible value of the header."
  {:db/ident           :hydra/possibleValue,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Possible value of the header.",
   :rdfs/domain        :hydra/HeaderSpecification,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/hydra/core",
   :rdfs/label         "possible header value",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :hydra/possibleValue,
   :vs/term_status     "testing"})

(def previous
  "The resource preceding the current instance in an interlinked set of resources."
  {:db/ident :hydra/previous,
   :rdf/type [:hydra/Link :hydra/Resource :rdf/Property],
   :rdfs/comment
   "The resource preceding the current instance in an interlinked set of resources.",
   :rdfs/domain :hydra/Resource,
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "previous",
   :rdfs/range :hydra/Resource,
   :vs/term_status "testing"})

(def property
  "A property"
  {:db/ident              :hydra/property,
   :rdf/type              :rdf/Property,
   :rdfs/comment          "A property",
   :rdfs/isDefinedBy      "http://www.w3.org/ns/hydra/core",
   :rdfs/label            "property",
   :rdfs/range            :rdf/Property,
   :rdfs/subPropertyOf    :hydra/property,
   :schema/domainIncludes [:hydra/IriTemplateMapping :hydra/SupportedProperty],
   :vs/term_status        "testing"})

(def readable
  "True if the client can retrieve the property's value, false otherwise."
  {:db/ident :hydra/readable,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "True if the client can retrieve the property's value, false otherwise.",
   :rdfs/domain :hydra/SupportedProperty,
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "readable",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :hydra/readable,
   :vs/term_status "testing"})

(def required
  "True if the property is required, false otherwise."
  {:db/ident              :hydra/required,
   :rdf/type              :rdf/Property,
   :rdfs/comment          "True if the property is required, false otherwise.",
   :rdfs/isDefinedBy      "http://www.w3.org/ns/hydra/core",
   :rdfs/label            "required",
   :rdfs/range            :xsd/boolean,
   :rdfs/subPropertyOf    :hydra/required,
   :schema/domainIncludes [:hydra/IriTemplateMapping :hydra/SupportedProperty],
   :vs/term_status        "testing"})

(def resolveRelativeUsing
  "relative Uri resolution"
  {:db/ident           :hydra/resolveRelativeUsing,
   :rdf/type           :rdf/Property,
   :rdfs/domain        :hydra/IriTemplate,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/hydra/core",
   :rdfs/label         "relative Uri resolution",
   :rdfs/range         :hydra/BaseUriSource,
   :rdfs/subPropertyOf :hydra/resolveRelativeUsing,
   :vs/term_status     "testing"})

(def returns
  "The information returned by the Web API on success"
  {:db/ident             :hydra/returns,
   :rdf/type             [:hydra/Link :hydra/Resource :rdf/Property],
   :rdfs/comment         "The information returned by the Web API on success",
   :rdfs/domain          :hydra/Operation,
   :rdfs/isDefinedBy     "http://www.w3.org/ns/hydra/core",
   :rdfs/label           "returns",
   :schema/rangeIncludes [:rdfs/Resource
                          :hydra/Class
                          :rdfs/Class
                          :hydra/Resource],
   :vs/term_status       "testing"})

(def returnsHeader
  "Name of the header returned by the operation."
  {:db/ident             :hydra/returnsHeader,
   :rdf/type             :rdf/Property,
   :rdfs/comment         "Name of the header returned by the operation.",
   :rdfs/domain          :hydra/Operation,
   :rdfs/isDefinedBy     "http://www.w3.org/ns/hydra/core",
   :rdfs/label           "returns header",
   :rdfs/subPropertyOf   :hydra/returnsHeader,
   :schema/rangeIncludes [:hydra/HeaderSpecification :xsd/string],
   :vs/term_status       "testing"})

(def search
  "A IRI template that can be used to query a collection."
  {:db/ident         :hydra/search,
   :rdf/type         [:hydra/TemplatedLink :hydra/Resource :rdf/Property],
   :rdfs/comment     "A IRI template that can be used to query a collection.",
   :rdfs/domain      :hydra/Resource,
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label       "search",
   :rdfs/range       :hydra/IriTemplate,
   :vs/term_status   "testing"})

(def statusCode
  "The HTTP status code. Please note it may happen this value will be different to actual status code received."
  {:db/ident :hydra/statusCode,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The HTTP status code. Please note it may happen this value will be different to actual status code received.",
   :rdfs/domain :hydra/Status,
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "status code",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :hydra/statusCode,
   :vs/term_status "testing"})

(def subject
  "The subject."
  {:db/ident         :hydra/subject,
   :rdfs/comment     "The subject.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label       "subject",
   :vs/term_status   "testing"})

(def supportedClass
  "A class known to be supported by the Web API"
  {:db/ident         :hydra/supportedClass,
   :rdf/type         [:hydra/Link :hydra/Resource :rdf/Property],
   :rdfs/comment     "A class known to be supported by the Web API",
   :rdfs/domain      :hydra/ApiDocumentation,
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label       "supported classes",
   :rdfs/range       :rdfs/Class,
   :vs/term_status   "testing"})

(def supportedOperation
  "An operation supported by instances of the specific Hydra class, or the target of the Hydra link, or IRI template."
  {:db/ident :hydra/supportedOperation,
   :rdf/type [:hydra/Link :hydra/Resource :rdf/Property],
   :rdfs/comment
   "An operation supported by instances of the specific Hydra class, or the target of the Hydra link, or IRI template.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "supported operation",
   :rdfs/range :hydra/Operation,
   :schema/domainIncludes [:rdfs/Class
                           :hydra/TemplatedLink
                           :hydra/SupportedProperty
                           :hydra/Class
                           :hydra/Link],
   :vs/term_status "testing"})

(def supportedProperty
  "The properties known to be supported by a Hydra class"
  {:db/ident         :hydra/supportedProperty,
   :rdf/type         [:hydra/Link :hydra/Resource :rdf/Property],
   :rdfs/comment     "The properties known to be supported by a Hydra class",
   :rdfs/domain      :rdfs/Class,
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label       "supported properties",
   :rdfs/range       :hydra/SupportedProperty,
   :vs/term_status   "testing"})

(def template
  "A templated string with placeholders. The literal's datatype indicates the template syntax; if not specified, hydra:Rfc6570Template is assumed."
  {:db/ident :hydra/template,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A templated string with placeholders. The literal's datatype indicates the template syntax; if not specified, hydra:Rfc6570Template is assumed.",
   :rdfs/domain :hydra/IriTemplate,
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "template",
   :rdfs/range :hydra/Rfc6570Template,
   :rdfs/seeAlso ["http://www.w3.org/ns/hydra/core#Rfc6570Template"],
   :rdfs/subPropertyOf :hydra/template,
   :vs/term_status "testing"})

(def title
  "A title, often used along with a description."
  {:db/ident              :hydra/title,
   :rdf/type              :rdf/Property,
   :rdfs/comment          "A title, often used along with a description.",
   :rdfs/isDefinedBy      "http://www.w3.org/ns/hydra/core",
   :rdfs/label            "title",
   :rdfs/range            :xsd/string,
   :rdfs/subPropertyOf    [:rdfs/label :hydra/title],
   :schema/domainIncludes [:hydra/Link
                           :hydra/TemplatedLink
                           :hydra/ApiDocumentation
                           :hydra/Operation
                           :hydra/SupportedProperty
                           :hydra/Status
                           :hydra/Class],
   :vs/term_status        "testing"})

(def totalItems
  "The total number of items referenced by a collection."
  {:db/ident           :hydra/totalItems,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The total number of items referenced by a collection.",
   :rdfs/domain        :hydra/Collection,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/hydra/core",
   :rdfs/label         "total items",
   :rdfs/range         :xsd/integer,
   :rdfs/subPropertyOf :hydra/totalItems,
   :vs/term_status     "testing"})

(def variable
  "An IRI template variable"
  {:db/ident           :hydra/variable,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "An IRI template variable",
   :rdfs/domain        :hydra/IriTemplateMapping,
   :rdfs/isDefinedBy   "http://www.w3.org/ns/hydra/core",
   :rdfs/label         "variable",
   :rdfs/range         :xsd/string,
   :rdfs/subPropertyOf :hydra/variable,
   :vs/term_status     "testing"})

(def variableRepresentation
  "The representation format to use when expanding the IRI template."
  {:db/ident :hydra/variableRepresentation,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The representation format to use when expanding the IRI template.",
   :rdfs/domain :hydra/IriTemplateMapping,
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "variable representation",
   :rdfs/range :hydra/VariableRepresentation,
   :rdfs/subPropertyOf :hydra/variableRepresentation,
   :vs/term_status "testing"})

(def view
  "A specific view of a resource."
  {:db/ident         :hydra/view,
   :rdf/type         [:hydra/Link :hydra/Resource :rdf/Property],
   :rdfs/comment     "A specific view of a resource.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label       "view",
   :vs/term_status   "testing"})

(def writable
  "True if the client can change the property's value, false otherwise."
  {:db/ident :hydra/writable,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "True if the client can change the property's value, false otherwise.",
   :rdfs/domain :hydra/SupportedProperty,
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "writable",
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :hydra/writable,
   :vs/term_status "testing"})

(def writeable
  "This property is left for compatibility purposes and hydra:writable should be used instead."
  {:db/ident :hydra/writeable,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "This property is left for compatibility purposes and hydra:writable should be used instead.",
   :rdfs/isDefinedBy "http://www.w3.org/ns/hydra/core",
   :rdfs/label "writable",
   :rdfs/subPropertyOf [:hydra/writable :hydra/writeable],
   :vs/term_status "archaic"})