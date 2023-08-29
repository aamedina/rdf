(ns net.wikipunk.rdf.hctl
  "Ontology designed to provide an RDF representation of Hypermedia Controls, in particular links and forms."
  {:dcterms/creator {:rdfa/uri "https://vcharpenay.link/#me"},
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "hctl"    "https://www.w3.org/2019/wot/hypermedia#",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                       "schema"  "http://schema.org/",
                       "vann"    "http://purl.org/vocab/vann/",
                       "xml"     "http://www.w3.org/XML/1998/namespace",
                       "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "hctl",
   :rdfa/uri "https://www.w3.org/2019/wot/hypermedia#",
   :rdfs/comment
   "Ontology designed to provide an RDF representation of Hypermedia Controls, in particular links and forms.",
   :rdfs/label "Hypermedia Controls Ontology",
   :vann/preferredNamespacePrefix "hctl",
   :vann/preferredNamespaceUri "https://www.w3.org/2019/wot/hypermedia#"})

(def AdditionalExpectedResponse
  "Communication metadata describing the expected response message for additional responses."
  {:db/ident :hctl/AdditionalExpectedResponse,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #rdf/langString
    "Communication metadata describing the expected response message for additional responses.@en",
   :rdfs/label "AdditionalExpectedResponse",
   :rdfs/subClassOf :rdfs/Resource})

(def ExpectedResponse
  "Communication metadata describing the expected response message for the primary response."
  {:db/ident :hctl/ExpectedResponse,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #rdf/langString
    "Communication metadata describing the expected response message for the primary response.@en",
   :rdfs/label "ExpectedResponse",
   :rdfs/subClassOf :rdfs/Resource})

(def Form
  "A form can be viewed as a statement of \"To perform an <b><em>operation type</em></b> operation on <b><em>form context</b></em>, make a <b><em>request method</b></em> request to <b><em>submission target</b></em>\" where the optional <b><em>form fields</b></em> may further describe the required request. In Thing Descriptions, the <b><em>form context</b></em> is the surrounding Object, such as Properties, Actions, and Events or the Thing itself for meta-interactions."
  {:db/ident :hctl/Form,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #rdf/langString
    "A form can be viewed as a statement of \"To perform an <b><em>operation type</em></b> operation on <b><em>form context</b></em>, make a <b><em>request method</b></em> request to <b><em>submission target</b></em>\" where the optional <b><em>form fields</b></em> may further describe the required request. In Thing Descriptions, the <b><em>form context</b></em> is the surrounding Object, such as Properties, Actions, and Events or the Thing itself for meta-interactions.@en",
   :rdfs/label "Form",
   :rdfs/subClassOf :rdfs/Resource})

(def Link
  "A link can be viewed as a statement of the form \"<b><em>link context</em></b>  has a <b><em>relation type</em></b> resource at <b><em>link target</em></b>\", where the optional <b><em>target attributes</em></b>  may further describe the resource."
  {:db/ident :hctl/Link,
   :rdf/type [:owl/Class :rdfs/Class],
   :rdfs/comment
   #rdf/langString
    "A link can be viewed as a statement of the form \"<b><em>link context</em></b>  has a <b><em>relation type</em></b> resource at <b><em>link target</em></b>\", where the optional <b><em>target attributes</em></b>  may further describe the resource.@en",
   :rdfs/label "Link",
   :rdfs/subClassOf :rdfs/Resource})

(def additionalReturns
  "This optional term can be used if additional expected responses\n      are possible, e.g. for error reporting.  Each additional response needs to be \n      distinguished from others in some way (for example, by specifying\n      a protocol-specific response code), and may also have its own data schema."
  {:db/ident :hctl/additionalReturns,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "This optional term can be used if additional expected responses\n      are possible, e.g. for error reporting.  Each additional response needs to be \n      distinguished from others in some way (for example, by specifying\n      a protocol-specific response code), and may also have its own data schema.@en",
   :rdfs/label "additionalReturns",
   :schema/domainIncludes :hctl/Form,
   :schema/rangeIncludes :hctl/AdditionalExpectedResponse})

(def forContentCoding
  "Content coding values indicate an encoding transformation that has been or can be applied to a representation. Content codings are primarily used to allow a representation to be compressed or otherwise usefully transformed without losing the identity of its underlying media type and without loss of information. Examples of content coding include \"gzip\", \"deflate\", etc. "
  {:db/ident :hctl/forContentCoding,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #rdf/langString
    "Content coding values indicate an encoding transformation that has been or can be applied to a representation. Content codings are primarily used to allow a representation to be compressed or otherwise usefully transformed without losing the identity of its underlying media type and without loss of information. Examples of content coding include \"gzip\", \"deflate\", etc. @en",
   :rdfs/label "forContentCoding",
   :schema/domainIncludes :hctl/Form,
   :schema/rangeIncludes :schema/Text})

(def forContentType
  "Assign a content type based on a media type [[IANA-MEDIA-TYPES]] (e.g., 'text/plain') and potential parameters (e.g., 'charset=utf-8') for the media type."
  {:db/ident :hctl/forContentType,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #rdf/langString
    "Assign a content type based on a media type [[IANA-MEDIA-TYPES]] (e.g., 'text/plain') and potential parameters (e.g., 'charset=utf-8') for the media type.@en",
   :rdfs/label "forContentType",
   :schema/domainIncludes :hctl/Form,
   :schema/rangeIncludes :schema/Text})

(def forSubProtocol
  "Indicates the exact mechanism by which an interaction will be accomplished for a given protocol when there are multiple options.\n     \nFor example, for HTTP and Events, it indicates which of several available mechanisms should be used for asynchronous notifications such as long polling, websub (also see https://www.w3.org/TR/websub/), or server sent events (also see https://www.w3.org/TR/eventsource/). Please note that there is no restriction on the sub-protocol selection and other mechanisms can also be announced by this subprotocol term."
  {:db/ident :hctl/forSubProtocol,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #rdf/langString
    "Indicates the exact mechanism by which an interaction will be accomplished for a given protocol when there are multiple options.\n     \nFor example, for HTTP and Events, it indicates which of several available mechanisms should be used for asynchronous notifications such as long polling, websub (also see https://www.w3.org/TR/websub/), or server sent events (also see https://www.w3.org/TR/eventsource/). Please note that there is no restriction on the sub-protocol selection and other mechanisms can also be announced by this subprotocol term.@en",
   :rdfs/label "forSubProtocol",
   :schema/domainIncludes :hctl/Form,
   :schema/rangeIncludes :schema/Text})

(def hasAdditionalOutputSchema
  "This optional term can be used to define a data schema for\n                an additional response if it differs from the default\n                output data schema. \n                Rather than a <code>DataSchema</code> object, the\n                name of a previous definition given in a \n                <code>schemaDefinitions</code> map must be used."
  {:db/ident :hctl/hasAdditionalOutputSchema,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "This optional term can be used to define a data schema for\n                an additional response if it differs from the default\n                output data schema. \n                Rather than a <code>DataSchema</code> object, the\n                name of a previous definition given in a \n                <code>schemaDefinitions</code> map must be used.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/hypermedia#"},
   :rdfs/label "hasAdditionalOutputSchema",
   :schema/domainIncludes :hctl/AdditionalExpectedResponse})

(def hasAnchor
  "By default, the context, or anchor, of a link conveyed in the Link header field is the URL of the representation it is associated with, as defined in RFC7231, Section 3.1.4.1, and is serialized as a URI."
  {:db/ident :hctl/hasAnchor,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "By default, the context, or anchor, of a link conveyed in the Link header field is the URL of the representation it is associated with, as defined in RFC7231, Section 3.1.4.1, and is serialized as a URI.",
   :rdfs/label "hasAnchor",
   :schema/domainIncludes :hctl/Link})

(def hasHreflang
  "The hreflang attribute specifies the language of a linked document. The value of this must be a valid language tag [[BCP47]]."
  {:db/ident :hctl/hasHreflang,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The hreflang attribute specifies the language of a linked document. The value of this must be a valid language tag [[BCP47]].",
   :rdfs/label "hasHreflang",
   :schema/domainIncludes :hctl/Link})

(def hasOperationType
  "Indicates the semantic intention of performing the operation(s) described by the form."
  {:db/ident :hctl/hasOperationType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Indicates the semantic intention of performing the operation(s) described by the form.",
   :rdfs/label "hasOperationType",
   :schema/domainIncludes :hctl/Form})

(def hasRelationType
  "A link relation type identifies the semantics of a link."
  {:db/ident     :hctl/hasRelationType,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "A link relation type identifies the semantics of a link.",
   :rdfs/label   "hasRelationType",
   :schema/domainIncludes :hctl/Link})

(def hasSizes
  "Target attribute that specifies one or more sizes for the referenced icon. Only applicable for relation type 'icon'. The value pattern follows {Height}x{Width} (e.g., \"16x16\", \"16x16 32x32\")"
  {:db/ident :hctl/hasSizes,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Target attribute that specifies one or more sizes for the referenced icon. Only applicable for relation type 'icon'. The value pattern follows {Height}x{Width} (e.g., \"16x16\", \"16x16 32x32\")",
   :rdfs/label "hasSizes",
   :schema/domainIncludes :hctl/Link})

(def hasTarget
  "target IRI of a link or submission target of a form."
  {:db/ident     :hctl/hasTarget,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "target IRI of a link or submission target of a form.",
   :rdfs/label   "hasTarget",
   :schema/domainIncludes [:hctl/Form :hctl/Link]})

(def hintsAtMediaType
  "Target attribute providing a hint indicating what the media type [IANA-MEDIA-TYPES] of the result of dereferencing the link should be."
  {:db/ident :hctl/hintsAtMediaType,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Target attribute providing a hint indicating what the media type [IANA-MEDIA-TYPES] of the result of dereferencing the link should be.",
   :rdfs/label "hintsAtMediaType",
   :schema/domainIncludes :hctl/Link,
   :schema/rangeIncludes :schema/Text})

(def isSuccess
  "Signals if the additional response should not be considered an error."
  {:db/ident :hctl/isSuccess,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #rdf/langString
    "Signals if the additional response should not be considered an error.@en",
   :rdfs/isDefinedBy {:rdfa/uri "https://www.w3.org/2019/wot/hypermedia#"},
   :rdfs/label "isSuccess",
   :schema/domainIncludes :hctl/AdditionalExpectedResponse,
   :schema/rangeIncludes :schema/Boolean})

(def returns
  "This optional term can be used if, e.g., the output communication metadata differ from input metadata (e.g., output contentType differ from the\n     input contentType). The response name contains metadata that is only valid for the reponse messages."
  {:db/ident :hctl/returns,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #rdf/langString
    "This optional term can be used if, e.g., the output communication metadata differ from input metadata (e.g., output contentType differ from the\n     input contentType). The response name contains metadata that is only valid for the reponse messages.@en",
   :rdfs/label "returns",
   :schema/domainIncludes :hctl/Form,
   :schema/rangeIncludes :hctl/ExpectedResponse})
