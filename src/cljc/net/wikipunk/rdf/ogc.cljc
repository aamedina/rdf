(ns net.wikipunk.rdf.ogc
  ^{:base "http://ogp.me/ns/class#",
    :namespaces {"bibo"  "http://purl.org/ontology/bibo/",
                 "dc11"  "http://purl.org/dc/elements/1.1/",
                 "foaf"  "http://xmlns.com/foaf/0.1/",
                 "geo"   "http://www.w3.org/2003/01/geo/wgs84_pos#",
                 "gr"    "http://purl.org/goodrelations/v1#",
                 "og"    "http://ogp.me/ns#",
                 "ogc"   "http://ogp.me/ns/class#",
                 "owl"   "http://www.w3.org/2002/07/owl#",
                 "rdf"   "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs"  "http://www.w3.org/2000/01/rdf-schema#",
                 "vcard" "http://www.w3.org/2006/vcard/ns#",
                 "xsd"   "http://www.w3.org/2001/XMLSchema#"},
    :prefix "ogc",
    :source
    "https://raw.githubusercontent.com/facebookarchive/open-graph-protocol/master/ns/ogp.me.rdf"}
  {:rdf/type :owl/Ontology})

(def boolean_str
  {:db/ident :ogc/boolean_str,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "A string representation of a true or false value.  The lexical space contains: \"true\", \"false\", \"1\", and \"0\"."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns/class#"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "boolean string"},
   :rdfs/subClassOf :xsd/string})

(def date_time_str
  {:db/ident :ogc/date_time_str,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "A string representation of a temporal value composed of a date (year, month, day) and an optional time component (hours, minutes).  The lexical space is defined by ISO 8601."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns/class#"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "date/time string"},
   :rdfs/subClassOf :xsd/string})

(def determiner_str
  {:db/ident :ogc/determiner_str,
   :owl/oneOf [{:rdf/value ""}
               {:rdf/value "the"}
               {:rdf/value "a"}
               {:rdf/value "an"}
               {:rdf/value "auto"}],
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The lexical space: \"\", \"the\", \"a\", \"an\", and \"auto\"."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns/class#"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "determiner"},
   :rdfs/subClassOf :xsd/string})

(def float_str
  {:db/ident :ogc/float_str,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "A string representation of a 64-bit signed floating point number.  Example lexical values include \"1.234\", \"-1.234\", \"1.2e3\", \"-1.2e3\", and \"7E-10\"."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns/class#"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "float string"},
   :rdfs/subClassOf :xsd/string})

(def integer_str
  {:db/ident :ogc/integer_str,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "A string representation of a 32-bit signed integer.  Example lexical values include \"1234\" and \"-123\"."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns/class#"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "integer string"},
   :rdfs/subClassOf :xsd/string})

(def mime_type_str
  {:db/ident         :ogc/mime_type_str,
   :rdf/type         :rdfs/Datatype,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value
                      "Valid mime type strings (e.g., \"application/mp3\")."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns/class#"},
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "mime type string"},
   :rdfs/subClassOf  :xsd/string})

(def string
  {:db/ident         :ogc/string,
   :rdf/type         :rdfs/Datatype,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value    "A string of Unicode characters."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns/class#"},
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "Unicode string"},
   :rdfs/subClassOf  :xsd/string})

(def url
  {:db/ident :ogc/url,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "A string of Unicode characters forming a valid URL having the http or https scheme."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns/class#"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "URL"},
   :rdfs/subClassOf :ogc/string})