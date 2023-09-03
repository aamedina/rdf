(ns net.wikipunk.rdf.xsd
  "XML Schema Datatypes

   OWL 2 RL supports the following datatypes:

    rdf:PlainLiteral
    rdf:XMLLiteral
    rdfs:Literal
    xsd:decimal
    xsd:integer
    xsd:nonNegativeInteger
    xsd:nonPositiveInteger
    xsd:positiveInteger
    xsd:negativeInteger
    xsd:long
    xsd:int
    xsd:short
    xsd:byte
    xsd:unsignedLong
    xsd:unsignedInt
    xsd:unsignedShort
    xsd:unsignedByte
    xsd:float
    xsd:double
    xsd:string
    xsd:normalizedString
    xsd:token
    xsd:language
    xsd:Name
    xsd:NCName
    xsd:NMTOKEN
    xsd:boolean
    xsd:hexBinary
    xsd:base64Binary
    xsd:anyURI
    xsd:dateTime
    xsd:dateTimeStamp"
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/schemas.lv2/xsd.ttl",
   :rdf/ns-prefix-map {"owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :owl/Ontology,
   :rdfa/prefix       "xsd",
   :rdfa/uri          "http://www.w3.org/2001/XMLSchema#",
   :rdfs/comment      "XML Schema Datatypes",
   :rdfs/isDefinedBy  {:rdfa/uri "http://www.w3.org/TR/xmlschema-2/"}}
  (:refer-clojure :exclude [boolean byte double float int long short time]))

(def anySimpleType
  "The base class of any primitive XSD dataype."
  {:db/ident     :xsd/anySimpleType,
   :rdf/type     :rdfs/Datatype,
   :rdfs/comment "The base class of any primitive XSD dataype.",
   :rdfs/label   "any simple type"})

(def anyURI
  {:db/ident       :xsd/anyURI,
   :db/cardinality :db.cardinality/one
   :db/valueType   :db.type/string
   :db/unique      :db.unique/identity
   :owl/onDatatype :xsd/anySimpleType,
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "any URI"})

(def base64Binary
  "Base64-encoded arbitrary binary data."
  {:db/ident       :xsd/base64Binary,
   :db/cardinality :db.cardinality/one
   :db/valueType   :db.type/string
   :owl/onDatatype :xsd/anySimpleType,
   :owl/withRestrictions
   [{:xsd/pattern
     "(([A-Za-z0-9+/] *[A-Za-z0-9+/] *[A-Za-z0-9+/] *[A-Za-z0-9+/] *)*(([A-Za-z0-9+/] *[A-Za-z0-9+/] *[A-Za-z0-9+/] *[A-Za-z0-9+/])|([A-Za-z0-9+/] *[A-Za-z0-9+/] *[AEIMQUYcgkosw048] *=)|([A-Za-z0-9+/] *[AQgw] *= *=)))?"}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/comment   "Base64-encoded arbitrary binary data.",
   :rdfs/label     "base64 binary"})

(def boolean
  {:db/ident             :xsd/boolean,
   :db/cardinality       :db.cardinality/one
   :db/valueType         :db.type/boolean
   :owl/onDatatype       :xsd/anySimpleType,
   :owl/withRestrictions [{:xsd/pattern "(true|false|0|1)"}],
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "boolean"})

(def byte
  {:db/ident             :xsd/byte,
   :db/cardinality       :db.cardinality/one
   :db/valueType         :db.type/long
   :owl/onDatatype       :xsd/short,
   :owl/withRestrictions [{:xsd/maxInclusive 127M} {:xsd/minInclusive -128M}],
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "byte"})

(def date
  {:db/ident       :xsd/date,
   :db/cardinality :db.cardinality/one
   :db/valueType   :db.type/instant
   :owl/onDatatype :xsd/anySimpleType,
   :owl/withRestrictions
   [{:xsd/pattern
     "-?[0-9][0-9][0-9][0-9][0-9]*-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])(Z|[-+][0-2][0-9]:[0-5][0-9])?"}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "date"})

(def dateTime
  {:db/ident       :xsd/dateTime,
   :db/cardinality :db.cardinality/one
   :db/valueType   :db.type/instant
   :owl/onDatatype :xsd/anySimpleType,
   :owl/withRestrictions
   [{:xsd/pattern
     "-?[0-9][0-9][0-9][0-9][0-9]*-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])T(([0-1][0-9])|(2[0-4])):[0-5][0-9]:[0-5][0-9](.[0-9]+)?(Z|[-+][0-2][0-9]:[0-5][0-9])?"}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "date time"})

(def dateTimeStamp
  "xsd:dateTimeStamp"
  {:db/ident        :xsd/dateTimeStamp
   :db/cardinality  :db.cardinality/one
   :db/valueType    :db.type/instant
   :rdf/type        :rdfs/Datatype
   :rdfs/subClassOf :rdfs/Literal})

(def dayTimeDuration
  {:db/ident       :xsd/dayTimeDuration,
   :owl/onDatatype :xsd/duration,
   :owl/withRestrictions
   [{:xsd/pattern
     "-?P(T([0-9]+H)?([0-9]+M)?([0-9]+(\\.[0-9]+)?S)?)?"}
    {:xsd/whiteSpace "collapse"}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "dayTimeDuration"})

(def yearMonthDuration
  {:db/ident       :xsd/yearMonthDuration,
   :owl/onDatatype :xsd/duration,
   :owl/withRestrictions
   [{:xsd/pattern
     "-?P([0-9]+Y)?([0-9]+M)?"}
    {:xsd/whiteSpace "collapse"}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "dayTimeDuration"})

(def decimal
  "A subset of the real numbers, which can be represented by decimal numerals."
  {:db/ident       :xsd/decimal,
   :db/cardinality :db.cardinality/one
   :db/valueType   :db.type/bigdec
   :owl/onDatatype :xsd/anySimpleType,
   :owl/withRestrictions
   [{:xsd/pattern
     "-?INF|NaN|[+-]?(([0-9]+[.]?[0-9]*)|([0-9]*[.]?[0-9]+))([eE][-+]?[0-9]+)?"}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/comment
   "A subset of the real numbers, which can be represented by decimal numerals.",
   :rdfs/label     "decimal"})

(def double
  "IEEE double-precision 64-bit floating point."
  {:db/ident       :xsd/double,
   :db/cardinality :db.cardinality/one
   :db/valueType   :db.type/double
   :owl/onDatatype :xsd/anySimpleType,
   :owl/withRestrictions
   [{:xsd/pattern
     "-?INF|NaN|[+-]?(([0-9]+[.]?[0-9]*)|([0-9]*[.]?[0-9]+))([eE][-+]?[0-9]+)?"}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/comment   "IEEE double-precision 64-bit floating point.",
   :rdfs/label     "double"})

(def duration
  {:db/ident       :xsd/duration,
   :owl/onDatatype :xsd/anySimpleType,
   :owl/withRestrictions
   [{:xsd/pattern
     "-?P([0-9]+Y)?([0-9]+M)?([0-9]+D)?(T([0-9]+H)?([0-9]+M)?([0-9]+(\\.[0-9]+)?S)?)?"}
    {:xsd/whiteSpace "collapse"}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "duration"})

(def float
  "IEEE single-precision 32-bit floating point."
  {:db/ident       :xsd/float,
   :db/cardinality :db.cardinality/one
   :db/valueType   :db.type/float
   :owl/onDatatype :xsd/anySimpleType,
   :owl/withRestrictions
   [{:xsd/pattern
     "-?INF|NaN|[+-]?(([0-9]+[.]?[0-9]*)|([0-9]*[.]?[0-9]+))([eE][-+]?[0-9]+)?"}
    {:xsd/whiteSpace "collapse"}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/comment   "IEEE single-precision 32-bit floating point.",
   :rdfs/label     "float"})

(def fractionDigits
  "The total number of digits to the right of the decimal point required to represent a value."
  {:db/ident       :xsd/fractionDigits,
   :db/cardinality :db.cardinality/one,
   :db/valueType   :db.type/bigint,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment
   "The total number of digits to the right of the decimal point required to represent a value.",
   :rdfs/label     "fraction digits",
   :rdfs/range     :xsd/nonNegativeInteger})

(def gDay
  {:db/ident        :xsd/gDay
   :rdf/type        :rdfs/Datatype
   :rdfs/subClassOf :rdfs/Literal})

(def gMonth
  {:db/ident        :xsd/gMonth
   :rdf/type        :rdfs/Datatype
   :rdfs/subClassOf :rdfs/Literal})

(def gYear
  {:db/ident        :xsd/gYear
   :rdf/type        :rdfs/Datatype
   :rdfs/subClassOf :rdfs/Literal})

(def gMonthDay
  {:db/ident        :xsd/gMonthDay
   :rdf/type        :rdfs/Datatype
   :rdfs/subClassOf :rdfs/Literal})

(def gYearMonth
  {:db/ident        :xsd/gYearMonth
   :rdf/type        :rdfs/Datatype
   :rdfs/subClassOf :rdfs/Literal})

(def hexBinary
  "Hex-encoded arbitrary binary data."
  {:db/ident             :xsd/hexBinary,
   :db/cardinality       :db.cardinality/one
   :db/valueType         :db.type/string
   :owl/onDatatype       :xsd/anySimpleType,
   :owl/withRestrictions [{:xsd/pattern "([0-9A-Fa-f][0-9A-Fa-f])*"}],
   :rdf/type             :rdfs/Datatype,
   :rdfs/comment         "Hex-encoded arbitrary binary data.",
   :rdfs/label           "hex binary"})

(def int
  {:db/ident             :xsd/int,
   :db/cardinality       :db.cardinality/one
   :db/valueType         :db.type/long
   :owl/onDatatype       :xsd/long,
   :owl/withRestrictions [{:xsd/maxInclusive 2147483647M}
                          {:xsd/minInclusive -2147483648M}],
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "int"})

(def integer
  {:db/ident             :xsd/integer,
   :db/cardinality       :db.cardinality/one
   :db/valueType         :db.type/bigint
   :owl/onDatatype       :xsd/decimal,
   :owl/withRestrictions [{:xsd/pattern "[-+]?[0-9]+"} {:xsd/fractionDigits 0N}],
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "integer"})

(def language
  {:db/ident       :xsd/language,
   :db/cardinality :db.cardinality/one
   :db/valueType   :db.type/string
   :owl/onDatatype :xsd/token,
   :owl/withRestrictions
   [{:xsd/pattern
     "[a-zA-Z][a-zA-Z]?[a-zA-Z]?[a-zA-Z]?[a-zA-Z]?[a-zA-Z]?[a-zA-Z]?[a-zA-Z]?(-[a-zA-Z0-9][a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?)*"}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "language"})

(def length
  {:db/ident       :xsd/length,
   :db/cardinality :db.cardinality/one
   :db/valueType   :db.type/long
   :rdf/type       :rdfs/Datatype})

(def long
  {:db/ident             :xsd/long,
   :db/cardinality       :db.cardinality/one
   :db/valueType         :db.type/long
   :owl/onDatatype       :xsd/integer,
   :owl/withRestrictions [{:xsd/maxInclusive 9223372036854775807M}
                          {:xsd/minInclusive -9223372036854775808M}],
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "long"})

(def maxExclusive
  "The exclusive upper bound of an ordered datatype."
  {:db/ident       :xsd/maxExclusive,
   :db/cardinality :db.cardinality/one
   :db/valueType   :db.type/bigdec
   :rdf/type       :owl/DatatypeProperty
   :rdfs/comment   "The exclusive upper bound of an ordered datatype.",
   :rdfs/label     "max exclusive"})

(def maxInclusive
  "The inclusive upper bound of an ordered datatype."
  {:db/ident       :xsd/maxInclusive,
   :db/cardinality :db.cardinality/one
   :db/valueType   :db.type/bigdec
   :rdf/type       :owl/DatatypeProperty
   :rdfs/comment   "The inclusive upper bound of an ordered datatype.",
   :rdfs/label     "max inclusive"})

(def minExclusive
  "The exclusive lower bound of an ordered datatype."
  {:db/ident       :xsd/minExclusive,
   :db/cardinality :db.cardinality/one
   :db/valueType   :db.type/bigdec
   :rdf/type       :owl/DatatypeProperty
   :rdfs/comment   "The exclusive lower bound of an ordered datatype.",
   :rdfs/label     "min exclusive"})

(def minInclusive
  "The inclusive lower bound of an ordered datatype."
  {:db/ident       :xsd/minInclusive,
   :db/cardinality :db.cardinality/one
   :db/valueType   :db.type/bigdec
   :rdf/type       :owl/DatatypeProperty
   :rdfs/comment   "The inclusive lower bound of an ordered datatype.",
   :rdfs/label     "min inclusive"})

(def negativeInteger
  {:db/ident             :xsd/negativeInteger,
   :db/cardinality       :db.cardinality/one
   :db/valueType         :db.type/bigint
   :owl/onDatatype       :xsd/nonPositiveInteger,
   :owl/withRestrictions [{:xsd/maxInclusive -1M}],
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "negative integer"})

(def nonNegativeInteger
  {:db/ident             :xsd/nonNegativeInteger,
   :db/cardinality       :db.cardinality/one
   :db/valueType         :db.type/bigint
   :owl/onDatatype       :xsd/integer,
   :owl/withRestrictions [{:xsd/pattern "[+]?[0-9]+"} {:xsd/minInclusive 0M}],
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "non-negative integer"})

(def nonPositiveInteger
  {:db/ident             :xsd/nonPositiveInteger,
   :db/cardinality       :db.cardinality/one
   :db/valueType         :db.type/bigint
   :owl/onDatatype       :xsd/integer,
   :owl/withRestrictions [{:xsd/pattern "(0|-[0-9]+)"} {:xsd/maxInclusive 0M}],
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "non-positive integer"})

(def normalizedString
  "The set of strings that do not contain the carriage return (#xD), line feed (#xA) nor tab (#x9) characters."
  {:db/ident       :xsd/normalizedString,
   :db/cardinality :db.cardinality/one
   :db/valueType   :db.type/string
   :owl/onDatatype :xsd/string,
   :rdf/type       :rdfs/Datatype,
   :rdfs/comment
   "The set of strings that do not contain the carriage return (#xD), line feed (#xA) nor tab (#x9) characters.",
   :rdfs/label     "normalized string"})

(def pattern
  "A regular expression that matches complete valid literals."
  {:db/ident       :xsd/pattern,
   :db/cardinality :db.cardinality/one
   :db/valueType   :db.type/string
   :rdf/type       :owl/DatatypeProperty
   :rdfs/comment   "A regular expression that matches complete valid literals.",
   :rdfs/label     "pattern"})

(def positiveInteger
  {:db/ident             :xsd/positiveInteger,
   :db/cardinality       :db.cardinality/one
   :db/valueType         :db.type/bigint
   :owl/onDatatype       :xsd/nonNegativeInteger,
   :owl/withRestrictions [{:xsd/pattern "[+]?[0-9]*[1-9]+[0-9]*"}
                          {:xsd/minInclusive 1M}],
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "positive integer"})

(def short
  {:db/ident             :xsd/short,
   :db/cardinality       :db.cardinality/one
   :db/valueType         :db.type/long
   :owl/onDatatype       :xsd/int,
   :owl/withRestrictions [{:xsd/maxInclusive 32767M} {:xsd/minInclusive -32768M}],
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "short"})

(def string
  "A character string."
  {:db/ident       :xsd/string,
   :db/cardinality :db.cardinality/one
   :db/valueType   :db.type/string
   :owl/onDatatype :xsd/anySimpleType,
   :rdf/type       :rdfs/Datatype,
   :rdfs/comment   "A character string.",
   :rdfs/label     "string"})

(def time
  {:db/ident       :xsd/time,
   :db/cardinality :db.cardinality/one
   :db/valueType   :db.type/instant
   :owl/onDatatype :xsd/anySimpleType,
   :owl/withRestrictions
   [{:xsd/pattern
     "(([0-1][0-9])|(2[0-4])):[0-5][0-9]:[0-5][0-9](.[0-9]+)?(Z|[-+][0-2][0-9]:[0-5][0-9])?"}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "time"})

(def token
  "The set of strings that do not contain the carriage return (#xD), line feed (#xA) nor tab (#x9) characters, that have no leading or trailing spaces (#x20) and that have no internal sequences of two or more spaces."
  {:db/ident       :xsd/token,
   :db/cardinality :db.cardinality/one
   :db/valueType   :db.type/string
   :owl/onDatatype :xsd/normalizedString,
   :rdf/type       :rdfs/Datatype,
   :rdfs/comment
   "The set of strings that do not contain the carriage return (#xD), line feed (#xA) nor tab (#x9) characters, that have no leading or trailing spaces (#x20) and that have no internal sequences of two or more spaces.",
   :rdfs/label     "token"})

(def unsignedByte
  {:db/ident             :xsd/unsignedByte,
   :db/cardinality       :db.cardinality/one
   :db/valueType         :db.type/long
   :owl/onDatatype       :xsd/unsignedShort,
   :owl/withRestrictions [{:xsd/maxInclusive 255M}],
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "unsigned byte"})

(def unsignedInt
  {:db/ident             :xsd/unsignedInt,
   :db/cardinality       :db.cardinality/one
   :db/valueType         :db.type/long
   :owl/onDatatype       :xsd/unsignedLong,
   :owl/withRestrictions [{:xsd/maxInclusive 4294967295M}],
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "unsigned int"})

(def unsignedLong
  {:db/ident             :xsd/unsignedLong,
   :db/cardinality       :db.cardinality/one
   :db/valueType         :db.type/long
   :owl/onDatatype       :xsd/nonNegativeInteger,
   :owl/withRestrictions [{:xsd/maxInclusive 18446744073709551615M}],
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "unsigned long"})

(def unsignedShort
  {:db/ident             :xsd/unsignedShort,
   :db/cardinality       :db.cardinality/one
   :db/valueType         :db.type/long
   :owl/onDatatype       :xsd/unsignedInt,
   :owl/withRestrictions [{:xsd/maxInclusive 65535M}],
   :rdf/type             :rdfs/Datatype,
   :rdfs/label           "unsigned short"})

(def whiteSpace
  "A string that describes whitespace normalization for a string type."
  {:db/ident       :xsd/whiteSpace,
   :db/cardinality :db.cardinality/one
   :db/valueType   :db.type/string
   :rdf/type       #{:owl/DatatypeProperty :rdf/Property},
   :rdfs/comment
   "A string that describes whitespace normalization for a string type.",
   :rdfs/label     "white space",
   :rdfs/range     {:owl/onDatatype       :xsd/string,
                    :owl/withRestrictions [{:xsd/pattern
                                            "(preserve|replace|collapse)"}],
                    :rdf/type             :rdfs/Datatype}})
