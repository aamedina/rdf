(ns net.wikipunk.rdf.jsonld
  "This is a vocabulary document and is used to achieve certain features of the JSON-LD language."
  {:dcat/downloadURL "net/wikipunk/boot/json-ld.jsonld",
   :dcterms/date #inst "2023-07-13T00:00:00.000-00:00",
   :dcterms/description
   {:rdf/language "en",
    :rdf/value
    "This is a vocabulary document and is used to achieve certain features of the JSON-LD language."},
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "The JSON-LD Vocabulary"},
   :namespaces {"jsonld" "http://www.w3.org/ns/json-ld#",
                "owl"    "http://www.w3.org/2002/07/owl#",
                "rdf"    "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs"   "http://www.w3.org/2000/01/rdf-schema#",
                "schema" "http://schema.org/",
                "xsd"    "http://www.w3.org/2001/XMLSchema#"},
   :owl/versionInfo
   {:xsd/anyURI
    "https://github.com/w3c/json-ld-wg/commit/01fbfacb60d6739a83ac9a043c71f3d8775d98b1"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "jsonld",
   :rdfa/uri "http://www.w3.org/ns/json-ld#",
   :rdfs/isDefinedBy {:xsd/anyURI "https://www.w3.org/TR/json-ld/"},
   :rdfs/seeAlso {:xsd/anyURI "http://www.w3.org/TR/json-ld11"},
   :xsd/anyURI "http://www.w3.org/ns/json-ld#"}
  (:refer-clojure :exclude [import reverse type]))

(def ContainerType
  {:db/ident         :jsonld/ContainerType,
   :rdf/type         :rdfs/Class,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"}})

(def Context
  {:db/ident :jsonld/Context,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Defines term definitions and other aspects of a JSON-LD `Context`.\n\nA [context definition](https://www.w3.org/TR/json-ld11/#dfn-context-definition) MUST be a map whose keys MUST be either _terms_, _compact IRIs_, _IRIs_, or one of the keywords `@base`, `@import`, `@language`, `@propagate`, `@protected`, `@type`, `@version`, or `@vocab`."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Context"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#context-definitions"}})

(def PrefixDefinition
  {:db/ident :jsonld/PrefixDefinition,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A string ([simple term definition](http://www.w3.org/TR/json-ld11/#dfn-simple-term-definitions)), expanding to an IRI."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Prefix Definition"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#dfn-term-definition"}})

(def TermDefinition
  {:db/ident :jsonld/TermDefinition,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A [term definition](http://www.w3.org/TR/json-ld11/#dfn-term-definitions) is an entry in a [context](#Context), where the key defines a term which may be used within a dictionary as a key, type, or elsewhere that a string is interpreted as a vocabulary item. Its value is an [expanded term definition](https://www.w3.org/TR/json-ld11/#dfn-expanded-term-definitions).\n\n\n\nAn [expanded term definition](https://www.w3.org/TR/json-ld11/#dfn-expanded-term-definition) MUST be a map composed of zero or more keys from `@id`, `@reverse`, `@type`, `@language`, `@container`, `@context`, `@prefix`, `@propagate`, or `@protected`. An expanded term definition SHOULD NOT contain any other keys."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Term Definition"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#dfn-term-definition"}})

(def base
  {:db/ident :jsonld/base,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If the [context definition](https://www.w3.org/TR/json-ld11/#dfn-context-definition) has an `@base` key, its value MUST be an _IRI reference_, or `null`."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "base"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#context-definitions"},
   :schema/domainIncludes :jsonld/Context,
   :schema/rangeIncludes :xsd/anyURI})

(def compacted
  {:db/ident :jsonld/compacted,
   :rdf/type :owl/NamedIndividual,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This profile IRI is used to request or specify compacted JSON-LD document form."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "compacted"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#iana-considerations"}})

(def container
  {:db/ident :jsonld/container,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The associated `@container` value in an [expanded term definition](https://www.w3.org/TR/json-ld11/#dfn-expanded-term-definitions).\n\nIf the [expanded term definition](https://www.w3.org/TR/json-ld11/#dfn-expanded-term-definitions) contains the `@container` keyword, its value MUST be either `@list`, `@set`, `@language`, `@index`, `@id`, `@graph`, `@type`, or be `null` or an array containing exactly any one of those keywords, or a combination of `@set` and any of `@index`, `@id`, `@graph`, `@type`, `@language` in any order.\n\n`@container` may also be an array containing `@graph` along with either `@id` or `@index` and also optionally including `@set`.\n\nIf the value is `@language`, when the term is used outside of the `@context`, the associated value MUST be a language map.\n\nIf the value is `@index`, when the term is used outside of the `@context`, the associated value MUST be an index map."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "container"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#expanded-term-definition"},
   :schema/domainIncludes :jsonld/TermDefinition,
   :schema/rangeIncludes :jsonld/ContainerType})

(def context
  {:db/ident :jsonld/context,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "As an IRI, this link relation is used to associate a JSON-LD context with a JSON document so that it can be interpreted as JSON-LD. In an HTTP request header, specifies the location of a context to use for compaction. As a Context, defines an inline `context definition`."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "context"},
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.w3.org/TR/json-ld11/#interpreting-json-as-json-ld"},
   :schema/rangeIncludes #{:xsd/anyURI :jsonld/Context}})

(def definition
  {:db/ident             :jsonld/definition,
   :rdf/type             :rdf/Property,
   :rdfs/comment         {:rdf/language "en",
                          :rdf/value
                          "Term definition(s) associated with this context."},
   :rdfs/isDefinedBy     {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label           {:rdf/language "en",
                          :rdf/value    "definition"},
   :schema/domainIncludes :jsonld/Context,
   :schema/rangeIncludes #{:jsonld/PrefixDefinition :jsonld/TermDefinition}})

(def direction
  {:db/ident :jsonld/direction,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If the [context definition](https://www.w3.org/TR/json-ld11/#dfn-context-definition) has an `@direction` key, its value MUST be one of `\"ltr\"` or `\"rtl\"`, or be `null`."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "direction"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#context-definitions"},
   :schema/domainIncludes #{:jsonld/Context :jsonld/TermDefinition},
   :schema/rangeIncludes :xsd/string})

(def expanded
  {:db/ident :jsonld/expanded,
   :rdf/type :owl/NamedIndividual,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This profile URI is used to request or specify expanded JSON-LD document form."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "expanded"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#iana-considerations"}})

(def flattened
  {:db/ident :jsonld/flattened,
   :rdf/type :owl/NamedIndividual,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This profile URI is used to request or specify flattened JSON-LD document form."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "flattened"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#iana-considerations"}})

(def frame
  {:db/ident :jsonld/frame,
   :rdf/type :owl/NamedIndividual,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "As an IRI, this link relation is used to associate a JSON-LD frame with a JSON-LD document. In an HTTP request header, specifies the location of a frame to use for framing."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "frame"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#iana-considerations"}})

(def framed
  {:db/ident :jsonld/framed,
   :rdf/type :owl/NamedIndividual,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This profile URI is used to request or specify framed JSON-LD document form."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "framed"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#iana-considerations"}})

(def graphContainerType
  {:db/ident :jsonld/graphContainerType,
   :rdf/type :jsonld/ContainerType,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If the [expanded term definition](https://www.w3.org/TR/json-ld11/#dfn-expanded-term-definitions) contains the `@container` keyword, its value MUST be either `@list`, `@set`, `@language`, `@index`, `@id`, `@graph`, `@type`, or be `null` or an _array_ containing exactly any one of those keywords."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "@graph"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#context-definitions"}})

(def id
  {:db/ident :jsonld/id,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value
                  "The `@id` mapping of a [term definition](#TermDefinition)."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "id"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#expanded-term-definition"},
   :schema/domainIncludes #{:jsonld/PrefixDefinition :jsonld/TermDefinition},
   :schema/rangeIncludes :xsd/anyURI})

(def idContainerType
  {:db/ident :jsonld/idContainerType,
   :rdf/type :jsonld/ContainerType,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If the [expanded term definition](https://www.w3.org/TR/json-ld11/#dfn-expanded-term-definitions) contains the `@container` keyword, its value MUST be either `@list`, `@set`, `@language`, `@index`, `@id`, `@graph`, `@type`, or be `null` or an _array_ containing exactly any one of those keywords."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "@id"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#context-definitions"}})

(def import
  {:db/ident :jsonld/import,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If the [context definition](https://www.w3.org/TR/json-ld11/#dfn-context-definition) contains the `@import` keyword, its value MUST be an _IRI reference_. When used as a reference from an `@import`, the referenced context definition MUST NOT include an `@import` key, itself."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "import"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#context-definitions"},
   :schema/domainIncludes :jsonld/Context,
   :schema/rangeIncludes :xsd/anyURI})

(def indexContainerType
  {:db/ident :jsonld/indexContainerType,
   :rdf/type :jsonld/ContainerType,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If the [expanded term definition](https://www.w3.org/TR/json-ld11/#dfn-expanded-term-definitions) contains the `@container` keyword, its value MUST be either `@list`, `@set`, `@language`, `@index`, `@id`, `@graph`, `@type`, or be `null` or an _array_ containing exactly any one of those keywords."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "@index"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#context-definitions"}})

(def language
  {:db/ident :jsonld/language,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The [default language](https://www.w3.org/TR/json-ld11/#dfn-default-language) is set in the context using the `@language` key whose value MUST be a string representing a [BCP47](https://tools.ietf.org/html/bcp47) language code or null."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "language"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#dfn-default-language"},
   :schema/domainIncludes #{:jsonld/Context :jsonld/TermDefinition},
   :schema/rangeIncludes :xsd/string})

(def languageContainerType
  {:db/ident :jsonld/languageContainerType,
   :rdf/type :jsonld/ContainerType,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If the [expanded term definition](https://www.w3.org/TR/json-ld11/#dfn-expanded-term-definitions) contains the `@container` keyword, its value MUST be either `@list`, `@set`, `@language`, `@index`, `@id`, `@graph`, `@type`, or be `null` or an _array_ containing exactly any one of those keywords."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "@language"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#context-definitions"}})

(def listContainerType
  {:db/ident :jsonld/listContainerType,
   :rdf/type :jsonld/ContainerType,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If the [expanded term definition](https://www.w3.org/TR/json-ld11/#dfn-expanded-term-definitions) contains the `@container` keyword, its value MUST be either `@list`, `@set`, `@language`, `@index`, `@id`, `@graph`, `@type`, or be `null` or an _array_ containing exactly any one of those keywords."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "@list"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#context-definitions"}})

(def nest
  {:db/ident :jsonld/nest,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If the [expanded term definition](https://www.w3.org/TR/json-ld11/#dfn-expanded-term-definitions) contains the `@nest` keyword, its value MUST be either `@nest`, or a _term_ which expands to `@nest`."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "nest"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#expanded-term-definition"},
   :schema/domainIncludes :jsonld/TermDefinition,
   :schema/rangeIncludes :xsd/string})

(def prefix
  {:db/ident :jsonld/prefix,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "With the value `true`, allows this term to be used to construct a compact IRI when compacting."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "prefix"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#expanded-term-definition"},
   :schema/domainIncludes :jsonld/TermDefinition,
   :schema/rangeIncludes :xsd/boolean})

(def propagate
  {:db/ident :jsonld/propagate,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If the [context definition](https://www.w3.org/TR/json-ld11/#dfn-context-definition) contains the `@propagate` keyword, its value MUST be `true` or `false`."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "propagate"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#context-definitions"},
   :schema/domainIncludes #{:jsonld/Context :jsonld/TermDefinition},
   :schema/rangeIncludes :xsd/boolean})

(def protected
  {:db/ident :jsonld/protected,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If the [context definition](https://www.w3.org/TR/json-ld11/#dfn-context-definition) contains the `@protected` keyword, its value MUST be `true` or `false`."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "protected"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#context-definitions"},
   :schema/domainIncludes #{:jsonld/Context :jsonld/TermDefinition},
   :schema/rangeIncludes :xsd/boolean})

(def reverse
  {:db/ident :jsonld/reverse,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The `@reverse` mapping of an [expanded term definition](https://www.w3.org/TR/json-ld11/#dfn-expanded-term-definitions)."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "reverse"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#expanded-term-definition"},
   :schema/domainIncludes :jsonld/TermDefinition,
   :schema/rangeIncludes :xsd/anyURI})

(def setContainerType
  {:db/ident :jsonld/setContainerType,
   :rdf/type :jsonld/ContainerType,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If the [expanded term definition](https://www.w3.org/TR/json-ld11/#dfn-expanded-term-definitions) contains the `@container` keyword, its value MUST be either `@list`, `@set`, `@language`, `@index`, `@id`, `@graph`, `@type`, or be `null` or an _array_ containing exactly any one of those keywords."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "@set"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#context-definitions"}})

(def streaming
  {:db/ident :jsonld/streaming,
   :rdf/type :owl/NamedIndividual,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This profile URI is used to request or specify streaming JSON-LD document form."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "streaming"},
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.w3.org/TR/json-ld11-streaming/#streaming-profile"}})

(def term
  {:db/ident :jsonld/term,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The term associated with a [term definition](#TermDefinition)."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "term"},
   :rdfs/seeAlso {:xsd/anyURI "https://www.w3.org/TR/json-ld11/#dfn-term"},
   :schema/domainIncludes #{:jsonld/PrefixDefinition :jsonld/TermDefinition},
   :schema/rangeIncludes :xsd/string})

(def type
  {:db/ident :jsonld/type,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If the [context definition](https://www.w3.org/TR/json-ld11/#dfn-context-definition) contains the `@type` keyword, its value MUST be a map with only the entry `@container` set to `@set`, and optionally an entry `@protected`.\n\n\n\nIf the [expanded term definition](https://www.w3.org/TR/json-ld11/#dfn-expanded-term-definitions) contains the `@type` keyword, its value MUST be an _IRI reference_, a _term_, `null`, or one of the keywords `@id`, `@json`, `@none`, or `@vocab`."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "type"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#context-definitions"},
   :schema/domainIncludes #{:jsonld/Context :jsonld/TermDefinition},
   :schema/rangeIncludes #{:xsd/anyURI :xsd/string}})

(def typeContainerType
  {:db/ident :jsonld/typeContainerType,
   :rdf/type :jsonld/ContainerType,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "If the [expanded term definition](https://www.w3.org/TR/json-ld11/#dfn-expanded-term-definitions) contains the `@container` keyword, its value MUST be either `@list`, `@set`, `@language`, `@index`, `@id`, `@graph`, `@type`, or be `null` or an _array_ containing exactly any one of those keywords."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "@type"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#context-definitions"}})

(def version
  {:db/ident :jsonld/version,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The [processing mode](https://www.w3.org/TR/json-ld11/#dfn-processing-mode) defines how a JSON-LD document is processed. By default, all documents are assumed to be conformant with [JSON-LD 1.1](http://www.w3.org/TR/json-ld11). By defining a different version via explicit API option, other processing modes can be accessed. This specification defines extensions for the `json-ld-1.1` processing mode."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "version"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#dfn-processing-mode"},
   :schema/domainIncludes :jsonld/Context,
   :schema/rangeIncludes :xsd/decimal})

(def vocab
  {:db/ident :jsonld/vocab,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to expand properties and values in `@type` with a common prefix IRI."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/json-ld#"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "vocab"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/json-ld11/#default-vocabulary"},
   :schema/domainIncludes :jsonld/Context,
   :schema/rangeIncludes :xsd/anyURI})