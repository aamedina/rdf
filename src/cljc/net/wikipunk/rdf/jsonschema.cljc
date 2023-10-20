(ns net.wikipunk.rdf.jsonschema
  {:dc11/publisher {:xsd/anyURI "https://www.w3.org/WoT/WG/"},
   :dc11/title {:rdf/language "en",
                :rdf/value    "JSON Schema in RDF"},
   :dcat/downloadURL "net/wikipunk/ext/json-schema.ttl",
   :dcterms/creator {:xsd/anyURI "https://vcharpenay.link/#me"},
   :dcterms/license {:xsd/anyURI "http://purl.org/NET/rdflicense/cc-by4.0"},
   :namespaces {"dc11"       "http://purl.org/dc/elements/1.1/",
                "dcterms"    "http://purl.org/dc/terms/",
                "foaf"       "http://xmlns.com/foaf/0.1/",
                "jsonschema" "https://www.w3.org/2019/wot/json-schema#",
                "owl"        "http://www.w3.org/2002/07/owl#",
                "prov"       "http://www.w3.org/ns/prov#",
                "rdf"        "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs"       "http://www.w3.org/2000/01/rdf-schema#",
                "schema"     "http://schema.org/",
                "vann"       "http://purl.org/vocab/vann/",
                "vs"         "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                "xml"        "http://www.w3.org/XML/1998/namespace",
                "xsd"        "http://www.w3.org/2001/XMLSchema#"},
   :owl/versionInfo "0.6.0",
   :rdf/type :owl/Ontology,
   :rdfa/prefix "jsonschema",
   :rdfa/uri "https://www.w3.org/2019/wot/json-schema#",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Module for data schema specifications, part of the W3C Web of Things (WoT) Thing Description model"},
   :vann/preferredNamespacePrefix "jsonschema",
   :vann/preferredNamespaceUri "https://www.w3.org/2019/wot/json-schema#",
   :xsd/anyURI "https://www.w3.org/2019/wot/json-schema#"}
  (:refer-clojure :exclude [format]))

(def ArraySchema
  {:db/ident :jsonschema/ArraySchema,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Metadata describing data of type array. This subclass is indicated by the value `array` assigned to `type` in `DataSchema` instances."},
   :rdfs/subClassOf :jsonschema/DataSchema})

(def BooleanSchema
  {:db/ident :jsonschema/BooleanSchema,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Metadata describing data of type `boolean`. This subclass is indicated by the value `boolean` assigned to `type` in `DataSchema` instances."},
   :rdfs/subClassOf :jsonschema/DataSchema})

(def DataSchema
  {:db/ident :jsonschema/DataSchema,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Metadata that describes the data format used. It can be used for validation."})

(def IntegerSchema
  {:db/ident :jsonschema/IntegerSchema,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Metadata describing data of type `integer`. This subclass is indicated by the value `integer` assigned to `type` in `DataSchema` instances."},
   :rdfs/subClassOf :jsonschema/DataSchema})

(def NullSchema
  {:db/ident :jsonschema/NullSchema,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Metadata describing data of type `null`. This subclass is indicated by the value `null` assigned to `type` in `DataSchema` instances. This Subclass describes only one acceptable value, namely `null`. It is important to note that `null` does not mean the absence of a value. It is analogous to `null` in JavaScript, `None` in Python, `null` in Java and `nil` in Ruby programming languages. It can be used as part of a `oneOf` declaration, where it is used to indicate, that the data can also be `null`."},
   :rdfs/subClassOf :jsonschema/DataSchema})

(def NumberSchema
  {:db/ident :jsonschema/NumberSchema,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Metadata describing data of type `number`. This subclass is indicated by the value `number` assigned to `type` in `DataSchema` instances."},
   :rdfs/subClassOf :jsonschema/DataSchema})

(def ObjectSchema
  {:db/ident :jsonschema/ObjectSchema,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Metadata describing data of type `object`. This subclass is indicated by the value `object` assigned to `type` in `DataSchema` instances."},
   :rdfs/subClassOf :jsonschema/DataSchema})

(def StringSchema
  {:db/ident :jsonschema/StringSchema,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Metadata describing data of type `string`. This subclass is indicated by the value `string` assigned to `type` in `DataSchema` instances."},
   :rdfs/subClassOf :jsonschema/DataSchema})

(def additionalProperties
  {:db/ident :jsonschema/additionalProperties,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "When `false` no additional properties are allowed beyond those in the `jsonschema:properties` of this object."},
   :rdfs/label "additionalProperties",
   :rdfs/range :xsd/boolean,
   :schema/domainIncludes :jsonschema/ObjectSchema})

(def allOf
  {:db/ident :jsonschema/allOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to ensure that the data is valid against all of the specified schemas in the array."},
   :rdfs/label "allOf",
   :schema/domainIncludes :jsonschema/DataSchema,
   :schema/rangeIncludes :jsonschema/DataSchema})

(def anyOf
  {:db/ident :jsonschema/anyOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to ensure that the data is valid against any of the specified schemas in the array."},
   :rdfs/label "anyOf",
   :schema/domainIncludes :jsonschema/DataSchema,
   :schema/rangeIncludes :jsonschema/DataSchema})

(def const
  {:db/ident     :jsonschema/const,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Provides a constant value."},
   :rdfs/label   "const",
   :schema/domainIncludes :jsonschema/DataSchema})

(def contentEncoding
  {:db/ident :jsonschema/contentEncoding,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies the encoding used to store the contents, as specified in RFC 2054. The values that are accepted: \"7bit\", \"8bit\", \"binary\", \"quoted-printable\" and \"base64\"."},
   :rdfs/label "contentEncoding",
   :rdfs/range :xsd/string,
   :schema/domainIncludes :jsonschema/StringSchema})

(def contentMediaType
  {:db/ident :jsonschema/contentMediaType,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies the MIME type (e.g., image/png, audio/mpeg) of the contents of a string value, as described in RFC 2046."},
   :rdfs/label "contentMediaType",
   :rdfs/range :xsd/string,
   :schema/domainIncludes :jsonschema/StringSchema})

(def default
  {:db/ident :jsonschema/default,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Supply a default value. The value should validate against the data schema in which it resides."},
   :rdfs/label "default",
   :schema/domainIncludes :jsonschema/DataSchema})

(def enum
  {:db/ident     :jsonschema/enum,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value "Restricted set of values provided as an array."},
   :rdfs/label   "enum",
   :schema/domainIncludes :jsonschema/DataSchema})

(def exclusiveMaximum
  {:db/ident :jsonschema/exclusiveMaximum,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies a maximum numeric value, representing an exclusive upper limit. Only applicable for associated number or integer types."},
   :rdfs/label "exclusiveMaximum",
   :rdfs/range :xsd/decimal,
   :rdfs/seeAlso :schema/maxValue,
   :schema/domainIncludes #{:jsonschema/IntegerSchema
                            :jsonschema/NumberSchema}})

(def exclusiveMinimum
  {:db/ident :jsonschema/exclusiveMinimum,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies a minimum numeric value, representing an exclusive lower limit. Only applicable for associated number or integer types."},
   :rdfs/label "exclusiveMinimum",
   :rdfs/range :xsd/decimal,
   :rdfs/seeAlso :schema/minValue,
   :schema/domainIncludes #{:jsonschema/IntegerSchema
                            :jsonschema/NumberSchema}})

(def format
  {:db/ident :jsonschema/format,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Allows validation based on a format pattern such as \"date-time\", \"email\", \"uri\", etc."},
   :rdfs/label "format",
   :rdfs/range :xsd/string,
   :schema/domainIncludes :jsonschema/StringSchema})

(def items
  {:db/ident             :jsonschema/items,
   :rdf/type             :owl/ObjectProperty,
   :rdfs/comment         {:rdf/language "en",
                          :rdf/value
                          "Used to define the characteristics of an array."},
   :rdfs/label           "items",
   :schema/domainIncludes :jsonschema/ArraySchema,
   :schema/rangeIncludes :jsonschema/DataSchema})

(def maxItems
  {:db/ident :jsonschema/maxItems,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Defines the maximum number of items that have to be in the array."},
   :rdfs/label "maxItems",
   :rdfs/range :xsd/nonNegativeInteger,
   :schema/domainIncludes :jsonschema/ArraySchema})

(def maxLength
  {:db/ident :jsonschema/maxLength,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies the maximum length of a string. Only applicable for associated string types."},
   :rdfs/label "maxLength",
   :rdfs/range :xsd/nonNegativeInteger,
   :schema/domainIncludes :jsonschema/StringSchema})

(def maximum
  {:db/ident :jsonschema/maximum,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies a maximum numeric value, representing an inclusive upper limit. Only applicable for associated number or integer types."},
   :rdfs/label "maximum",
   :rdfs/range :xsd/decimal,
   :rdfs/seeAlso :schema/maxValue,
   :schema/domainIncludes #{:jsonschema/IntegerSchema
                            :jsonschema/NumberSchema}})

(def minItems
  {:db/ident :jsonschema/minItems,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Defines the minimum number of items that have to be in the array."},
   :rdfs/label "minItems",
   :rdfs/range :xsd/nonNegativeInteger,
   :schema/domainIncludes :jsonschema/ArraySchema})

(def minLength
  {:db/ident :jsonschema/minLength,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies the minimum length of a string. Only applicable for associated string types."},
   :rdfs/label "minLength",
   :rdfs/range :xsd/nonNegativeInteger,
   :schema/domainIncludes :jsonschema/StringSchema})

(def minimum
  {:db/ident :jsonschema/minimum,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies a minimum numeric value, representing an inclusive lower limit. Only applicable for associated number or integer types."},
   :rdfs/label "minimum",
   :rdfs/range :xsd/decimal,
   :rdfs/seeAlso :schema/minValue,
   :schema/domainIncludes #{:jsonschema/IntegerSchema
                            :jsonschema/NumberSchema}})

(def multipleOf
  {:db/ident :jsonschema/multipleOf,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies the multipleOf value number. The value must strictly greater than 0. Only applicable for associated number or integer types."},
   :rdfs/label "multipleOf",
   :rdfs/range :xsd/decimal,
   :schema/domainIncludes #{:jsonschema/IntegerSchema
                            :jsonschema/NumberSchema}})

(def nullable
  {:db/ident :jsonschema/nullable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Boolean value that is a hint to indicate whether a property interaction / value is nullable (=true) or not (=false)"},
   :rdfs/label "nullable",
   :rdfs/range :xsd/boolean,
   :schema/domainIncludes :jsonschema/DataSchema})

(def oneOf
  {:db/ident :jsonschema/oneOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to ensure that the data is valid against exactly one of the specified schemas in the array."},
   :rdfs/label "oneOf",
   :schema/domainIncludes :jsonschema/DataSchema,
   :schema/rangeIncludes :jsonschema/DataSchema})

(def pattern
  {:db/ident :jsonschema/pattern,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Provides a regular expression to express constraints of the string value. The regular expression must follow the ECMA 262 dialect."},
   :rdfs/label "pattern",
   :rdfs/range :xsd/nonNegativeInteger,
   :schema/domainIncludes :jsonschema/StringSchema})

(def properties
  {:db/ident             :jsonschema/properties,
   :rdf/type             :owl/ObjectProperty,
   :rdfs/comment         {:rdf/language "en",
                          :rdf/value    "Data schema nested definitions"},
   :rdfs/label           "properties",
   :schema/domainIncludes :jsonschema/ObjectSchema,
   :schema/rangeIncludes :jsonschema/DataSchema})

(def propertyName
  {:db/ident :jsonschema/propertyName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Used to store the indexing name in the parent object when this schema appears as a property of an object schema."},
   :rdfs/label "propertyName",
   :rdfs/range :xsd/string,
   :schema/domainIncludes :jsonschema/DataSchema})

(def readOnly
  {:db/ident :jsonschema/readOnly,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Boolean value that is a hint to indicate whether a property interaction / value is read only (=true) or not (=false)"},
   :rdfs/label "readOnly",
   :rdfs/range :xsd/boolean,
   :schema/domainIncludes :jsonschema/DataSchema})

(def required
  {:db/ident :jsonschema/required,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Defines which members of the object type are mandatory, i.e. which members are mandatory in the payload that is to be sent (e.g. input of `invokeaction`, `writeproperty`) and what members will be definitely delivered in the payload that is being received (e.g. output of `invokeaction`, `readproperty`)"},
   :rdfs/label "required",
   :rdfs/range :xsd/string,
   :schema/domainIncludes :jsonschema/ObjectSchema})

(def uniqueItems
  {:db/ident :jsonschema/uniqueItems,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Boolean value that is a hint to indicate whether the array contains unique items (=true) or not (=false)"},
   :rdfs/label "uniqueItems",
   :rdfs/range :xsd/boolean,
   :schema/domainIncludes :jsonschema/ArraySchema})

(def writeOnly
  {:db/ident :jsonschema/writeOnly,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Boolean value that is a hint to indicate whether a property interaction / value is write only (=true) or not (=false)"},
   :rdfs/label "writeOnly",
   :rdfs/range :xsd/boolean,
   :schema/domainIncludes :jsonschema/DataSchema})

(def urn:uuid:2bb78280-1033-5ccf-987f-4908dff67e08
  {:dc11/publisher {:xsd/anyURI "https://www.w3.org/WoT/WG/"},
   :dc11/title {:rdf/language "en",
                :rdf/value    "JSON Schema in RDF"},
   :dcterms/creator {:xsd/anyURI "https://vcharpenay.link/#me"},
   :dcterms/license {:xsd/anyURI "http://purl.org/NET/rdflicense/cc-by4.0"},
   :owl/versionInfo "0.6.0",
   :rdf/type :owl/Ontology,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Module for data schema specifications, part of the W3C Web of Things (WoT) Thing Description model"},
   :vann/preferredNamespacePrefix "jsonschema",
   :vann/preferredNamespaceUri "https://www.w3.org/2019/wot/json-schema#",
   :xsd/anyURI "https://www.w3.org/2019/wot/json-schema#"})