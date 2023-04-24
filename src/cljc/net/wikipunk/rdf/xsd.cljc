(ns net.wikipunk.rdf.xsd
  "XML Schema Datatypes"
  {:dcat/downloadURL
   "https://gitlab.com/lv2/lv2/-/raw/master/schemas.lv2/xsd.ttl",
   :rdf/ns-prefix-map {"owl"  "http://www.w3.org/2002/07/owl#",
                       "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "xsd"  "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "xsd",
   :rdfa/uri "http://www.w3.org/2001/XMLSchema#",
   :rdfs/comment "XML Schema Datatypes",
   :rdfs/isDefinedBy {:rdf/uri "http://www.w3.org/TR/xmlschema-2/"}}
  (:refer-clojure :exclude [boolean byte double float int long short time]))

(def anySimpleType
  "The base class of any primitive XSD dataype."
  {:db/ident     :xsd/anySimpleType,
   :rdf/type     :rdfs/Datatype,
   :rdfs/comment "The base class of any primitive XSD dataype.",
   :rdfs/label   "any simple type"})

(def anyURI
  "any URI"
  {:db/ident       :xsd/anyURI,
   :owl/onDatatype :xsd/anySimpleType,
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "any URI"})

(def base64Binary
  "Base64-encoded arbitrary binary data."
  {:db/ident :xsd/base64Binary,
   :owl/onDatatype :xsd/anySimpleType,
   :owl/withRestrictions
   [{:xsd/pattern
     "(([A-Za-z0-9+/] *[A-Za-z0-9+/] *[A-Za-z0-9+/] *[A-Za-z0-9+/] *)*(([A-Za-z0-9+/] *[A-Za-z0-9+/] *[A-Za-z0-9+/] *[A-Za-z0-9+/])|([A-Za-z0-9+/] *[A-Za-z0-9+/] *[AEIMQUYcgkosw048] *=)|([A-Za-z0-9+/] *[AQgw] *= *=)))?"}],
   :rdf/type :rdfs/Datatype,
   :rdfs/comment "Base64-encoded arbitrary binary data.",
   :rdfs/label "base64 binary"})

(def boolean
  "boolean"
  {:db/ident       :xsd/boolean,
   :owl/onDatatype :xsd/anySimpleType,
   :owl/withRestrictions [{:xsd/pattern "(true|false|0|1)"}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "boolean"})

(def byte
  "byte"
  {:db/ident       :xsd/byte,
   :owl/onDatatype :xsd/short,
   :owl/withRestrictions [{:xsd/maxInclusive 127.0} {:xsd/minInclusive -128.0}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "byte"})

(def date
  "date"
  {:db/ident       :xsd/date,
   :owl/onDatatype :xsd/anySimpleType,
   :owl/withRestrictions
   [{:xsd/pattern
     "-?[0-9][0-9][0-9][0-9][0-9]*-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])(Z|[-+][0-2][0-9]:[0-5][0-9])?"}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "date"})

(def dateTime
  "date time"
  {:db/ident       :xsd/dateTime,
   :owl/onDatatype :xsd/anySimpleType,
   :owl/withRestrictions
   [{:xsd/pattern
     "-?[0-9][0-9][0-9][0-9][0-9]*-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])T(([0-1][0-9])|(2[0-4])):[0-5][0-9]:[0-5][0-9](.[0-9]+)?(Z|[-+][0-2][0-9]:[0-5][0-9])?"}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "date time"})

(def decimal
  "A subset of the real numbers, which can be represented by decimal numerals."
  {:db/ident :xsd/decimal,
   :owl/onDatatype :xsd/anySimpleType,
   :owl/withRestrictions
   [{:xsd/pattern
     "-?INF|NaN|[+-]?(([0-9]+[.]?[0-9]*)|([0-9]*[.]?[0-9]+))([eE][-+]?[0-9]+)?"}],
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "A subset of the real numbers, which can be represented by decimal numerals.",
   :rdfs/label "decimal"})

(def double
  "IEEE double-precision 64-bit floating point."
  {:db/ident :xsd/double,
   :owl/onDatatype :xsd/anySimpleType,
   :owl/withRestrictions
   [{:xsd/pattern
     "-?INF|NaN|[+-]?(([0-9]+[.]?[0-9]*)|([0-9]*[.]?[0-9]+))([eE][-+]?[0-9]+)?"}],
   :rdf/type :rdfs/Datatype,
   :rdfs/comment "IEEE double-precision 64-bit floating point.",
   :rdfs/label "double"})

(def duration
  "duration"
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
  {:db/ident :xsd/float,
   :owl/onDatatype :xsd/anySimpleType,
   :owl/withRestrictions
   [{:xsd/pattern
     "-?INF|NaN|[+-]?(([0-9]+[.]?[0-9]*)|([0-9]*[.]?[0-9]+))([eE][-+]?[0-9]+)?"}
    {:xsd/whiteSpace "collapse"}],
   :rdf/type :rdfs/Datatype,
   :rdfs/comment "IEEE single-precision 32-bit floating point.",
   :rdfs/label "float"})

(def fractionDigits
  "The total number of digits to the right of the decimal point required to represent a value."
  {:db/ident :xsd/fractionDigits,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "The total number of digits to the right of the decimal point required to represent a value.",
   :rdfs/label "fraction digits",
   :rdfs/range :xsd/nonNegativeInteger})

(def hexBinary
  "Hex-encoded arbitrary binary data."
  {:db/ident             :xsd/hexBinary,
   :owl/onDatatype       :xsd/anySimpleType,
   :owl/withRestrictions [{:xsd/pattern "([0-9A-Fa-f][0-9A-Fa-f])*"}],
   :rdf/type             :rdfs/Datatype,
   :rdfs/comment         "Hex-encoded arbitrary binary data.",
   :rdfs/label           "hex binary"})

(def int
  "int"
  {:db/ident       :xsd/int,
   :owl/onDatatype :xsd/long,
   :owl/withRestrictions [{:xsd/maxInclusive 2.147483647E9}
                          {:xsd/minInclusive -2.147483648E9}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "int"})

(def integer
  "integer"
  {:db/ident       :xsd/integer,
   :owl/onDatatype :xsd/decimal,
   :owl/withRestrictions [{:xsd/pattern "[-+]?[0-9]+"} {:xsd/fractionDigits 0}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "integer"})

(def language
  "language"
  {:db/ident       :xsd/language,
   :owl/onDatatype :xsd/token,
   :owl/withRestrictions
   [{:xsd/pattern
     "[a-zA-Z][a-zA-Z]?[a-zA-Z]?[a-zA-Z]?[a-zA-Z]?[a-zA-Z]?[a-zA-Z]?[a-zA-Z]?(-[a-zA-Z0-9][a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?[a-zA-Z0-9]?)*"}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "language"})

(def long
  "long"
  {:db/ident       :xsd/long,
   :owl/onDatatype :xsd/integer,
   :owl/withRestrictions [{:xsd/maxInclusive 9.223372036854776E18}
                          {:xsd/minInclusive -9.223372036854776E18}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "long"})

(def maxExclusive
  "The exclusive upper bound of an ordered datatype."
  {:db/ident     :xsd/maxExclusive,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The exclusive upper bound of an ordered datatype.",
   :rdfs/label   "max exclusive"})

(def maxInclusive
  "The inclusive upper bound of an ordered datatype."
  {:db/ident     :xsd/maxInclusive,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The inclusive upper bound of an ordered datatype.",
   :rdfs/label   "max inclusive"})

(def minExclusive
  "The exclusive lower bound of an ordered datatype."
  {:db/ident     :xsd/minExclusive,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The exclusive lower bound of an ordered datatype.",
   :rdfs/label   "min exclusive"})

(def minInclusive
  "The inclusive lower bound of an ordered datatype."
  {:db/ident     :xsd/minInclusive,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "The inclusive lower bound of an ordered datatype.",
   :rdfs/label   "min inclusive"})

(def negativeInteger
  "negative integer"
  {:db/ident       :xsd/negativeInteger,
   :owl/onDatatype :xsd/nonPositiveInteger,
   :owl/withRestrictions [{:xsd/maxInclusive -1.0}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "negative integer"})

(def nonNegativeInteger
  "non-negative integer"
  {:db/ident       :xsd/nonNegativeInteger,
   :owl/onDatatype :xsd/integer,
   :owl/withRestrictions [{:xsd/pattern "[+]?[0-9]+"} {:xsd/minInclusive 0.0}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "non-negative integer"})

(def nonPositiveInteger
  "non-positive integer"
  {:db/ident       :xsd/nonPositiveInteger,
   :owl/onDatatype :xsd/integer,
   :owl/withRestrictions [{:xsd/pattern "(0|-[0-9]+)"} {:xsd/maxInclusive 0.0}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "non-positive integer"})

(def normalizedString
  "The set of strings that do not contain the carriage return (#xD), line feed (#xA) nor tab (#x9) characters."
  {:db/ident :xsd/normalizedString,
   :owl/onDatatype :xsd/string,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "The set of strings that do not contain the carriage return (#xD), line feed (#xA) nor tab (#x9) characters.",
   :rdfs/label "normalized string"})

(def pattern
  "A regular expression that matches complete valid literals."
  {:db/ident     :xsd/pattern,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment "A regular expression that matches complete valid literals.",
   :rdfs/label   "pattern"})

(def positiveInteger
  "positive integer"
  {:db/ident       :xsd/positiveInteger,
   :owl/onDatatype :xsd/nonNegativeInteger,
   :owl/withRestrictions [{:xsd/pattern "[+]?[0-9]*[1-9]+[0-9]*"}
                          {:xsd/minInclusive 1.0}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "positive integer"})

(def short
  "short"
  {:db/ident       :xsd/short,
   :owl/onDatatype :xsd/int,
   :owl/withRestrictions [{:xsd/maxInclusive 32767.0}
                          {:xsd/minInclusive -32768.0}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "short"})

(def string
  "A character string."
  {:db/ident       :xsd/string,
   :owl/onDatatype :xsd/anySimpleType,
   :rdf/type       :rdfs/Datatype,
   :rdfs/comment   "A character string.",
   :rdfs/label     "string"})

(def time
  "time"
  {:db/ident       :xsd/time,
   :owl/onDatatype :xsd/anySimpleType,
   :owl/withRestrictions
   [{:xsd/pattern
     "(([0-1][0-9])|(2[0-4])):[0-5][0-9]:[0-5][0-9](.[0-9]+)?(Z|[-+][0-2][0-9]:[0-5][0-9])?"}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "time"})

(def token
  "The set of strings that do not contain the carriage return (#xD), line feed (#xA) nor tab (#x9) characters, that have no leading or trailing spaces (#x20) and that have no internal sequences of two or more spaces."
  {:db/ident :xsd/token,
   :owl/onDatatype :xsd/normalizedString,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "The set of strings that do not contain the carriage return (#xD), line feed (#xA) nor tab (#x9) characters, that have no leading or trailing spaces (#x20) and that have no internal sequences of two or more spaces.",
   :rdfs/label "token"})

(def unsignedByte
  "unsigned byte"
  {:db/ident       :xsd/unsignedByte,
   :owl/onDatatype :xsd/unsignedShort,
   :owl/withRestrictions [{:xsd/maxInclusive 255.0}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "unsigned byte"})

(def unsignedInt
  "unsigned int"
  {:db/ident       :xsd/unsignedInt,
   :owl/onDatatype :xsd/unsignedLong,
   :owl/withRestrictions [{:xsd/maxInclusive 4.294967295E9}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "unsigned int"})

(def unsignedLong
  "unsigned long"
  {:db/ident       :xsd/unsignedLong,
   :owl/onDatatype :xsd/nonNegativeInteger,
   :owl/withRestrictions [{:xsd/maxInclusive 1.8446744073709552E19}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "unsigned long"})

(def unsignedShort
  "unsigned short"
  {:db/ident       :xsd/unsignedShort,
   :owl/onDatatype :xsd/unsignedInt,
   :owl/withRestrictions [{:xsd/maxInclusive 65535.0}],
   :rdf/type       :rdfs/Datatype,
   :rdfs/label     "unsigned short"})

(def whiteSpace
  "A string that describes whitespace normalization for a string type."
  {:db/ident :xsd/whiteSpace,
   :rdf/type [:owl/DatatypeProperty :rdf/Property],
   :rdfs/comment
   "A string that describes whitespace normalization for a string type.",
   :rdfs/label "white space",
   :rdfs/range {:owl/onDatatype :xsd/string,
                :owl/withRestrictions [{:xsd/pattern
                                        "(preserve|replace|collapse)"}],
                :rdf/type       :rdfs/Datatype}})