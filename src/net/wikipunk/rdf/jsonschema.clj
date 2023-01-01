(ns net.wikipunk.rdf.jsonschema
  "JSON Schema in RDF"
  {:dcterms/creator "https://vcharpenay.link/#me",
   :dcterms/license "http://purl.org/NET/rdflicense/cc-by4.0",
   :dcterms/publisher "https://www.w3.org/WoT/WG/",
   :dcterms/title {:rdf/language "en",
                   :rdf/value    "JSON Schema in RDF"},
   :owl/versionInfo "0.6.0",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/elements/1.1/",
                       "foaf" "http://xmlns.com/foaf/0.1/",
                       "jsonschema" "https://www.w3.org/2019/wot/json-schema#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "prov" "http://www.w3.org/ns/prov#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "schema" "http://schema.org/",
                       "vann" "http://purl.org/vocab/vann/",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "xml" "http://www.w3.org/XML/1998/namespace",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "jsonschema",
   :rdfa/uri "https://www.w3.org/2019/wot/json-schema#",
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Module for data schema specifications, part of the W3C Web of Things (WoT) Thing Description model"},
   :vann/preferredNamespacePrefix "jsonschema",
   :vann/preferredNamespaceUri "https://www.w3.org/2019/wot/json-schema#"}
  (:refer-clojure :exclude [format]))

(def ArraySchema
  "Metadata describing data of type array. This subclass is indicated by the value <code>array</code> assigned to <code>type</code> in <code>DataSchema</code> instances."
  {:db/ident :jsonschema/ArraySchema,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Metadata describing data of type array. This subclass is indicated by the value <code>array</code> assigned to <code>type</code> in <code>DataSchema</code> instances."},
   :rdfs/subClassOf :jsonschema/DataSchema})

(def BooleanSchema
  "Metadata describing data of type <code>boolean</code>. This subclass is indicated by the value <code>boolean</code> assigned to <code>type</code> in <code>DataSchema</code> instances."
  {:db/ident :jsonschema/BooleanSchema,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Metadata describing data of type <code>boolean</code>. This subclass is indicated by the value <code>boolean</code> assigned to <code>type</code> in <code>DataSchema</code> instances."},
   :rdfs/subClassOf :jsonschema/DataSchema})

(def DataSchema
  "Metadata that describes the data format used. It can be used for validation."
  {:db/ident :jsonschema/DataSchema,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Metadata that describes the data format used. It can be used for validation."})

(def IntegerSchema
  "Metadata describing data of type <code>integer</code>. This subclass is indicated by the value <code>integer</code> assigned to <code>type</code> in <code>DataSchema</code> instances."
  {:db/ident :jsonschema/IntegerSchema,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Metadata describing data of type <code>integer</code>. This subclass is indicated by the value <code>integer</code> assigned to <code>type</code> in <code>DataSchema</code> instances."},
   :rdfs/subClassOf :jsonschema/DataSchema})

(def NullSchema
  "Metadata describing data of type <code>null</code>. This subclass is indicated by the value <code>null</code> assigned to <code>type</code> in <code>DataSchema</code> instances. This Subclass describes only one acceptable value, namely <code>null</code>. It is important to note that <code>null</code> does not mean the absence of a value. It is analogous to <code>null</code> in JavaScript, <code>None</code> in Python, <code>null</code> in Java and <code>nil</code> in Ruby programming languages. It can be used as part of a <code>oneOf</code> declaration, where it is used to indicate, that the data can also be <code>null</code>."
  {:db/ident :jsonschema/NullSchema,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Metadata describing data of type <code>null</code>. This subclass is indicated by the value <code>null</code> assigned to <code>type</code> in <code>DataSchema</code> instances. This Subclass describes only one acceptable value, namely <code>null</code>. It is important to note that <code>null</code> does not mean the absence of a value. It is analogous to <code>null</code> in JavaScript, <code>None</code> in Python, <code>null</code> in Java and <code>nil</code> in Ruby programming languages. It can be used as part of a <code>oneOf</code> declaration, where it is used to indicate, that the data can also be <code>null</code>."},
   :rdfs/subClassOf :jsonschema/DataSchema})

(def NumberSchema
  "Metadata describing data of type <code>number</code>. This subclass is indicated by the value <code>number</code> assigned to <code>type</code> in <code>DataSchema</code> instances."
  {:db/ident :jsonschema/NumberSchema,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Metadata describing data of type <code>number</code>. This subclass is indicated by the value <code>number</code> assigned to <code>type</code> in <code>DataSchema</code> instances."},
   :rdfs/subClassOf :jsonschema/DataSchema})

(def ObjectSchema
  "Metadata describing data of type <code>object</code>. This subclass is indicated by the value <code>object</code> assigned to <code>type</code> in <code>DataSchema</code> instances."
  {:db/ident :jsonschema/ObjectSchema,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Metadata describing data of type <code>object</code>. This subclass is indicated by the value <code>object</code> assigned to <code>type</code> in <code>DataSchema</code> instances."},
   :rdfs/subClassOf :jsonschema/DataSchema})

(def StringSchema
  "Metadata describing data of type <code>string</code>. This subclass is indicated by the value <code>string</code> assigned to <code>type</code> in <code>DataSchema</code> instances."
  {:db/ident :jsonschema/StringSchema,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Metadata describing data of type <code>string</code>. This subclass is indicated by the value <code>string</code> assigned to <code>type</code> in <code>DataSchema</code> instances."},
   :rdfs/subClassOf :jsonschema/DataSchema})

(def allOf
  "Used to ensure that the data is valid against all of the specified schemas in the array."
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
  "Used to ensure that the data is valid against any of the specified schemas in the array."
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
  "Provides a constant value."
  {:db/ident     :jsonschema/const,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value    "Provides a constant value."},
   :rdfs/label   "const",
   :schema/domainIncludes :jsonschema/DataSchema})

(def contentEncoding
  "Specifies the encoding used to store the contents, as specified in RFC 2054. The values that are accepted: \"7bit\", \"8bit\", \"binary\", \"quoted-printable\" and \"base64\"."
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
  "Specifies the MIME type (e.g., image/png, audio/mpeg) of the contents of a string value, as described in RFC 2046."
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
  "Supply a default value. The value should validate against the data schema in which it resides."
  {:db/ident :jsonschema/default,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Supply a default value. The value should validate against the data schema in which it resides."},
   :rdfs/label "default",
   :schema/domainIncludes :jsonschema/DataSchema})

(def enum
  "Restricted set of values provided as an array."
  {:db/ident     :jsonschema/enum,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en",
                  :rdf/value "Restricted set of values provided as an array."},
   :rdfs/label   "enum",
   :schema/domainIncludes :jsonschema/DataSchema})

(def exclusiveMaximum
  "Specifies a maximum numeric value, representing an exclusive upper limit. Only applicable for associated number or integer types."
  {:db/ident :jsonschema/exclusiveMaximum,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies a maximum numeric value, representing an exclusive upper limit. Only applicable for associated number or integer types."},
   :rdfs/label "exclusiveMaximum",
   :rdfs/range :xsd/decimal,
   :rdfs/seeAlso :schema/maxValue,
   :schema/domainIncludes [:jsonschema/IntegerSchema :jsonschema/NumberSchema]})

(def exclusiveMinimum
  "Specifies a minimum numeric value, representing an exclusive lower limit. Only applicable for associated number or integer types."
  {:db/ident :jsonschema/exclusiveMinimum,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies a minimum numeric value, representing an exclusive lower limit. Only applicable for associated number or integer types."},
   :rdfs/label "exclusiveMinimum",
   :rdfs/range :xsd/decimal,
   :rdfs/seeAlso :schema/minValue,
   :schema/domainIncludes [:jsonschema/IntegerSchema :jsonschema/NumberSchema]})

(def format
  "Allows validation based on a format pattern such as \"date-time\", \"email\", \"uri\", etc."
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
  "Used to define the characteristics of an array."
  {:db/ident             :jsonschema/items,
   :rdf/type             :owl/ObjectProperty,
   :rdfs/comment         {:rdf/language "en",
                          :rdf/value
                          "Used to define the characteristics of an array."},
   :rdfs/label           "items",
   :schema/domainIncludes :jsonschema/ArraySchema,
   :schema/rangeIncludes :jsonschema/DataSchema})

(def maxItems
  "Defines the maximum number of items that have to be in the array."
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
  "Specifies the maximum length of a string. Only applicable for associated string types."
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
  "Specifies a maximum numeric value, representing an inclusive upper limit. Only applicable for associated number or integer types."
  {:db/ident :jsonschema/maximum,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies a maximum numeric value, representing an inclusive upper limit. Only applicable for associated number or integer types."},
   :rdfs/label "maximum",
   :rdfs/range :xsd/decimal,
   :rdfs/seeAlso :schema/maxValue,
   :schema/domainIncludes [:jsonschema/IntegerSchema :jsonschema/NumberSchema]})

(def minItems
  "Defines the minimum number of items that have to be in the array."
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
  "Specifies the minimum length of a string. Only applicable for associated string types."
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
  "Specifies a minimum numeric value, representing an inclusive lower limit. Only applicable for associated number or integer types."
  {:db/ident :jsonschema/minimum,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies a minimum numeric value, representing an inclusive lower limit. Only applicable for associated number or integer types."},
   :rdfs/label "minimum",
   :rdfs/range :xsd/decimal,
   :rdfs/seeAlso :schema/minValue,
   :schema/domainIncludes [:jsonschema/IntegerSchema :jsonschema/NumberSchema]})

(def multipleOf
  "Specifies the multipleOf value number. The value must strictly greater than 0. Only applicable for associated number or integer types."
  {:db/ident :jsonschema/multipleOf,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies the multipleOf value number. The value must strictly greater than 0. Only applicable for associated number or integer types."},
   :rdfs/label "multipleOf",
   :rdfs/range :xsd/decimal,
   :schema/domainIncludes [:jsonschema/IntegerSchema :jsonschema/NumberSchema]})

(def oneOf
  "Used to ensure that the data is valid against exactly one of the specified schemas in the array."
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
  "Provides a regular expression to express constraints of the string value. The regular expression must follow the ECMA 262 dialect."
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
  "Data schema nested definitions"
  {:db/ident             :jsonschema/properties,
   :rdf/type             :owl/ObjectProperty,
   :rdfs/comment         {:rdf/language "en",
                          :rdf/value    "Data schema nested definitions"},
   :rdfs/label           "properties",
   :schema/domainIncludes :jsonschema/ObjectSchema,
   :schema/rangeIncludes :jsonschema/DataSchema})

(def propertyName
  "Used to store the indexing name in the parent object when this schema appears as a property of an object schema."
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
  "Boolean value that is a hint to indicate whether a property interaction / value is read only (=true) or not (=false)"
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
  "Defines which members of the object type are mandatory, i.e. which members are mandatory in the payload that is to be sent (e.g. input of <code>invokeaction</code>, <code>writeproperty</code>) and what members will be definitely delivered in the payload that is being received (e.g. output of <code>invokeaction</code>, <code>readproperty</code>)"
  {:db/ident :jsonschema/required,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Defines which members of the object type are mandatory, i.e. which members are mandatory in the payload that is to be sent (e.g. input of <code>invokeaction</code>, <code>writeproperty</code>) and what members will be definitely delivered in the payload that is being received (e.g. output of <code>invokeaction</code>, <code>readproperty</code>)"},
   :rdfs/label "required",
   :rdfs/range :xsd/string,
   :schema/domainIncludes :jsonschema/ObjectSchema})

(def writeOnly
  "Boolean value that is a hint to indicate whether a property interaction / value is write only (=true) or not (=false)"
  {:db/ident :jsonschema/writeOnly,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Boolean value that is a hint to indicate whether a property interaction / value is write only (=true) or not (=false)"},
   :rdfs/label "writeOnly",
   :rdfs/range :xsd/boolean,
   :schema/domainIncludes :jsonschema/DataSchema})