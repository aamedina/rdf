(ns net.wikipunk.rdf.og
  "http://ogp.me/ns#"
  {:dcat/downloadURL
   "https://raw.githubusercontent.com/facebookarchive/open-graph-protocol/master/ns/ogp.me.rdf",
   :rdf/ns-prefix-map {"bibo"  "http://purl.org/ontology/bibo/",
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
   :rdf/type :rdfa/PrefixMapping,
   :rdfa/prefix "og",
   :rdfa/uri "http://ogp.me/ns#",
   :rdfs/isDefinedBy {:rdf/uri "http://ogp.me/"}}
  (:refer-clojure :exclude [type]))

(def audio
  "A relevant audio URL for your object."
  {:db/ident           :og/audio,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A relevant audio URL for your object.",
   :rdfs/isDefinedBy   "http://ogp.me/ns#",
   :rdfs/label         "audio",
   :rdfs/range         :ogc/url,
   :rdfs/subPropertyOf :og/audio})

(def audio:album
  "[DEPRECATED] An album to which some audio belongs."
  {:db/ident           :og/audio:album,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "[DEPRECATED] An album to which some audio belongs.",
   :rdfs/isDefinedBy   "http://ogp.me/ns#",
   :rdfs/label         "audio album",
   :rdfs/subPropertyOf :og/audio:album})

(def audio:artist
  "[DEPRECATED] An artist of some audio."
  {:db/ident           :og/audio:artist,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "[DEPRECATED] An artist of some audio.",
   :rdfs/isDefinedBy   "http://ogp.me/ns#",
   :rdfs/label         "audio artist",
   :rdfs/subPropertyOf :og/audio:artist})

(def audio:secure_url
  "A relevant, secure audio URL for your object."
  {:db/ident           :og/audio:secure_url,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A relevant, secure audio URL for your object.",
   :rdfs/isDefinedBy   "http://ogp.me/ns#",
   :rdfs/label         "audio secure URL",
   :rdfs/range         :ogc/url,
   :rdfs/subPropertyOf :og/audio:secure_url})

(def audio:title
  "[DEPRECATED] A title for some audio."
  {:db/ident           :og/audio:title,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "[DEPRECATED] A title for some audio.",
   :rdfs/isDefinedBy   "http://ogp.me/ns#",
   :rdfs/label         "audio title",
   :rdfs/subPropertyOf :og/audio:title})

(def audio:type
  "The mime type of an audio file e.g., \"application/mp3\""
  {:db/ident :og/audio:type,
   :rdf/type :rdf/Property,
   :rdfs/comment "The mime type of an audio file e.g., \"application/mp3\"",
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label "audio type",
   :rdfs/range :ogc/mime_type_str,
   :rdfs/subPropertyOf :og/audio:type})

(def country-name
  "[DEPRECATED] The country name of the resource e.g., \"USA\""
  {:db/ident :og/country-name,
   :rdf/type :rdf/Property,
   :rdfs/comment "[DEPRECATED] The country name of the resource e.g., \"USA\"",
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label "country name",
   :rdfs/seeAlso ["http://www.w3.org/2006/vcard/ns#country-name"],
   :rdfs/subPropertyOf :og/country-name})

(def description
  "A one to two sentence description of your object."
  {:db/ident           :og/description,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A one to two sentence description of your object.",
   :rdfs/isDefinedBy   "http://ogp.me/ns#",
   :rdfs/label         "description",
   :rdfs/range         :ogc/string,
   :rdfs/subPropertyOf [:rdfs/comment :og/description]})

(def determiner
  "The word to precede the object's title in a sentence (e.g., \"the\" in \"the statue of liberty\"). Valid values are \"a\", \"an\", \"the\", \"\", and \"auto\"."
  {:db/ident :og/determiner,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The word to precede the object's title in a sentence (e.g., \"the\" in \"the statue of liberty\").  Valid values are \"a\", \"an\", \"the\", \"\", and \"auto\".",
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label "determiner",
   :rdfs/range :ogc/determiner_str,
   :rdfs/subPropertyOf :og/determiner})

(def email
  "[DEPRECATED] Email of the contact for your object."
  {:db/ident           :og/email,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "[DEPRECATED] Email of the contact for your object.",
   :rdfs/isDefinedBy   "http://ogp.me/ns#",
   :rdfs/label         "email",
   :rdfs/seeAlso       ["http://xmlns.com/foaf/0.1/mbox"],
   :rdfs/subPropertyOf :og/email})

(def fax_number
  "[DEPRECATED] Fax number of the contact for your object."
  {:db/ident :og/fax_number,
   :rdf/type :rdf/Property,
   :rdfs/comment "[DEPRECATED] Fax number of the contact for your object.",
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label "fax number",
   :rdfs/seeAlso ["http://xmlns.com/foaf/0.1/phone"],
   :rdfs/subPropertyOf :og/fax_number})

(def image
  "An image URL which should represent your object within the graph."
  {:db/ident :og/image,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An image URL which should represent your object within the graph.",
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label "image",
   :rdfs/range :ogc/url,
   :rdfs/seeAlso ["http://xmlns.com/foaf/0.1/depiction"],
   :rdfs/subPropertyOf :og/image})

(def image:height
  "The height of an image."
  {:db/ident           :og/image:height,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The height of an image.",
   :rdfs/isDefinedBy   "http://ogp.me/ns#",
   :rdfs/label         "image height",
   :rdfs/range         :ogc/integer_str,
   :rdfs/subPropertyOf :og/image:height})

(def image:secure_url
  "A secure image URL which should represent your object within the graph."
  {:db/ident :og/image:secure_url,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A secure image URL which should represent your object within the graph.",
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label "image secure url",
   :rdfs/range :ogc/url,
   :rdfs/seeAlso ["http://xmlns.com/foaf/0.1/depiction"],
   :rdfs/subPropertyOf :og/image:secure_url})

(def image:type
  "The mime type of an image."
  {:db/ident           :og/image:type,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The mime type of an image.",
   :rdfs/isDefinedBy   "http://ogp.me/ns#",
   :rdfs/label         "image type",
   :rdfs/range         :ogc/mime_type_str,
   :rdfs/subPropertyOf :og/image:type})

(def image:width
  "The width of an image."
  {:db/ident           :og/image:width,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The width of an image.",
   :rdfs/isDefinedBy   "http://ogp.me/ns#",
   :rdfs/label         "image width",
   :rdfs/range         :ogc/integer_str,
   :rdfs/subPropertyOf :og/image:width})

(def isbn
  "[DEPRECATED] International Standard Book Number for you object."
  {:db/ident :og/isbn,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "[DEPRECATED] International Standard Book Number for you object.",
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label ["International Standard Book Number" "isbn"],
   :rdfs/seeAlso ["http://purl.org/ontology/bibo/isbn"],
   :rdfs/subPropertyOf :og/isbn})

(def latitude
  "[DEPRECATED] The latitude of the resource e.g., the latitude of a company."
  {:db/ident :og/latitude,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "[DEPRECATED] The latitude of the resource e.g., the latitude of a company.",
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label "latitude",
   :rdfs/seeAlso ["http://www.w3.org/2003/01/geo/wgs84_pos#lat"],
   :rdfs/subPropertyOf :og/latitude})

(def locale
  "A Unix locale in which this markup is rendered."
  {:db/ident           :og/locale,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A Unix locale in which this markup is rendered.",
   :rdfs/isDefinedBy   "http://ogp.me/ns#",
   :rdfs/label         "locale",
   :rdfs/range         :ogc/string,
   :rdfs/subPropertyOf :og/locale})

(def locality
  "[DEPRECATED] The locality of the resource e.g, \"Palo Alto\""
  {:db/ident :og/locality,
   :rdf/type :rdf/Property,
   :rdfs/comment "[DEPRECATED] The locality of the resource e.g, \"Palo Alto\"",
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label "locality",
   :rdfs/seeAlso ["http://www.w3.org/2006/vcard/ns#locality"],
   :rdfs/subPropertyOf :og/locality})

(def longitude
  "[DEPRECATED] The longitude of the resource e.g., the longitude of a company."
  {:db/ident :og/longitude,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "[DEPRECATED] The longitude of the resource e.g., the longitude of a company.",
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label "longitude",
   :rdfs/seeAlso ["http://www.w3.org/2003/01/geo/wgs84_pos#long"],
   :rdfs/subPropertyOf :og/longitude})

(def phone_number
  "[DEPRECATED] Phone number of the contact for your object."
  {:db/ident :og/phone_number,
   :rdf/type :rdf/Property,
   :rdfs/comment "[DEPRECATED] Phone number of the contact for your object.",
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label "phone number",
   :rdfs/seeAlso ["http://xmlns.com/foaf/0.1/phone"],
   :rdfs/subPropertyOf :og/phone_number})

(def postal-code
  "[DEPRECATED] The postal code of the resource e.g., \"94304\""
  {:db/ident :og/postal-code,
   :rdf/type :rdf/Property,
   :rdfs/comment "[DEPRECATED] The postal code of the resource e.g., \"94304\"",
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label "postal code",
   :rdfs/seeAlso ["http://www.w3.org/2006/vcard/ns#postal-code"],
   :rdfs/subPropertyOf :og/postal-code})

(def region
  "[DEPRECATED] The region of the resource e.g., \"CA\""
  {:db/ident           :og/region,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "[DEPRECATED] The region of the resource e.g., \"CA\"",
   :rdfs/isDefinedBy   "http://ogp.me/ns#",
   :rdfs/label         "region",
   :rdfs/seeAlso       ["http://www.w3.org/2006/vcard/ns#region"],
   :rdfs/subPropertyOf :og/region})

(def site_name
  "If your object is part of a larger web site, the name which should be displayed for the overall site. e.g., \"IMDb\"."
  {:db/ident :og/site_name,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "If your object is part of a larger web site, the name which should be displayed for the overall site. e.g., \"IMDb\".",
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label "site name",
   :rdfs/range :ogc/string,
   :rdfs/subPropertyOf :og/site_name})

(def street-address
  "[DEPRECATED] The street address of the resource e.g., \"1601 S California Ave\"."
  {:db/ident :og/street-address,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "[DEPRECATED] The street address of the resource e.g., \"1601 S California Ave\".",
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label "street address",
   :rdfs/seeAlso ["http://www.w3.org/2006/vcard/ns#street-address"],
   :rdfs/subPropertyOf :og/street-address})

(def title
  "The title of the object as it should appear within the graph, e.g., \"The Rock\"."
  {:db/ident :og/title,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The title of the object as it should appear within the graph, e.g.,  \"The Rock\".",
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label "title",
   :rdfs/range :ogc/string,
   :rdfs/subPropertyOf [:rdfs/label :og/title]})

(def type
  "The type of your object, e.g., \"movie\". Depending on the type you specify, other properties may also be required."
  {:db/ident :og/type,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The type of your object, e.g., \"movie\".  Depending on the type you specify, other properties may also be required.",
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label "type",
   :rdfs/range :ogc/string,
   :rdfs/seeAlso ["http://www.w3.org/1999/02/22-rdf-syntax-ns#type"],
   :rdfs/subPropertyOf :og/type})

(def upc
  "[DEPRECATED] Universal Product Code for your object."
  {:db/ident           :og/upc,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "[DEPRECATED] Universal Product Code for your object.",
   :rdfs/label         ["universal product code" "upc"],
   :rdfs/seeAlso       ["http://purl.org/goodrelations/v1#hasEAN_UCC-13"],
   :rdfs/subPropertyOf :og/upc})

(def url
  "The canonical URL of your object that will be used as its permanent ID in the graph, e.g., \"http://www.imdb.com/title/tt0117500/\"."
  {:db/ident :og/url,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The canonical URL of your object that will be used as its permanent ID in the graph, e.g., \"http://www.imdb.com/title/tt0117500/\".",
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label "url",
   :rdfs/range :ogc/url,
   :rdfs/seeAlso ["http://xmlns.com/foaf/0.1/homepage"
                  "http://purl.org/dc/elements/1.1/identifier"],
   :rdfs/subPropertyOf :og/url})

(def video
  "A relevant video URL for your object."
  {:db/ident           :og/video,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A relevant video URL for your object.",
   :rdfs/isDefinedBy   "http://ogp.me/ns#",
   :rdfs/label         "video",
   :rdfs/range         :ogc/url,
   :rdfs/subPropertyOf :og/video})

(def video:height
  "The height of a video."
  {:db/ident           :og/video:height,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The height of a video.",
   :rdfs/isDefinedBy   "http://ogp.me/ns#",
   :rdfs/label         "video height",
   :rdfs/range         :ogc/integer_str,
   :rdfs/subPropertyOf :og/video:height})

(def video:secure_url
  "A relevant, secure video URL for your object."
  {:db/ident           :og/video:secure_url,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A relevant, secure video URL for your object.",
   :rdfs/isDefinedBy   "http://ogp.me/ns#",
   :rdfs/label         "video secure URL",
   :rdfs/range         :ogc/url,
   :rdfs/subPropertyOf :og/video:secure_url})

(def video:type
  "The mime type of a video e.g., \"application/x-shockwave-flash\""
  {:db/ident :og/video:type,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The mime type of a video e.g., \"application/x-shockwave-flash\"",
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label "video type",
   :rdfs/range :ogc/mime_type_str,
   :rdfs/subPropertyOf :og/video:type})

(def video:width
  "The width of a video."
  {:db/ident           :og/video:width,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The width of a video.",
   :rdfs/isDefinedBy   "http://ogp.me/ns#",
   :rdfs/label         "video width",
   :rdfs/range         :ogc/integer_str,
   :rdfs/subPropertyOf :og/video:width})

(def ^{:private true} boolean_str
  "A string representation of a true or false value. The lexical space contains: \"true\", \"false\", \"1\", and \"0\"."
  {:db/ident :ogc/boolean_str,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "A string representation of a true or false value.  The lexical space contains: \"true\", \"false\", \"1\", and \"0\".",
   :rdfs/isDefinedBy "http://ogp.me/ns/class#",
   :rdfs/label "boolean string",
   :rdfs/subClassOf [:xsd/string :ogc/boolean_str]})

(def ^{:private true} date_time_str
  "A string representation of a temporal value composed of a date (year, month, day) and an optional time component (hours, minutes). The lexical space is defined by ISO 8601."
  {:db/ident :ogc/date_time_str,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "A string representation of a temporal value composed of a date (year, month, day) and an optional time component (hours, minutes).  The lexical space is defined by ISO 8601.",
   :rdfs/isDefinedBy "http://ogp.me/ns/class#",
   :rdfs/label "date/time string",
   :rdfs/subClassOf [:xsd/string :ogc/date_time_str]})

(def ^{:private true} determiner_str
  "The lexical space: \"\", \"the\", \"a\", \"an\", and \"auto\"."
  {:db/ident :ogc/determiner_str,
   :owl/oneOf [{:xsd/string ""}
               {:xsd/string "the"}
               {:xsd/string "a"}
               {:xsd/string "an"}
               {:xsd/string "auto"}],
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "The lexical space: \"\", \"the\", \"a\", \"an\", and \"auto\".",
   :rdfs/isDefinedBy "http://ogp.me/ns/class#",
   :rdfs/label "determiner",
   :rdfs/subClassOf [:xsd/string :ogc/determiner_str]})

(def ^{:private true} float_str
  "A string representation of a 64-bit signed floating point number. Example lexical values include \"1.234\", \"-1.234\", \"1.2e3\", \"-1.2e3\", and \"7E-10\"."
  {:db/ident :ogc/float_str,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "A string representation of a 64-bit signed floating point number.  Example lexical values include \"1.234\", \"-1.234\", \"1.2e3\", \"-1.2e3\", and \"7E-10\".",
   :rdfs/isDefinedBy "http://ogp.me/ns/class#",
   :rdfs/label "float string",
   :rdfs/subClassOf [:xsd/string :ogc/float_str]})

(def ^{:private true} integer_str
  "A string representation of a 32-bit signed integer. Example lexical values include \"1234\" and \"-123\"."
  {:db/ident :ogc/integer_str,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "A string representation of a 32-bit signed integer.  Example lexical values include \"1234\" and \"-123\".",
   :rdfs/isDefinedBy "http://ogp.me/ns/class#",
   :rdfs/label "integer string",
   :rdfs/subClassOf [:xsd/string :ogc/integer_str]})

(def ^{:private true} mime_type_str
  "Valid mime type strings (e.g., \"application/mp3\")."
  {:db/ident         :ogc/mime_type_str,
   :rdf/type         :rdfs/Datatype,
   :rdfs/comment     "Valid mime type strings (e.g., \"application/mp3\").",
   :rdfs/isDefinedBy "http://ogp.me/ns/class#",
   :rdfs/label       "mime type string",
   :rdfs/subClassOf  [:xsd/string :ogc/mime_type_str]})

(def ^{:private true} string
  "A string of Unicode characters."
  {:db/ident         :ogc/string,
   :rdf/type         :rdfs/Datatype,
   :rdfs/comment     "A string of Unicode characters.",
   :rdfs/isDefinedBy "http://ogp.me/ns/class#",
   :rdfs/label       "Unicode string",
   :rdfs/subClassOf  [:xsd/string :ogc/string]})

(def ^{:private true} url
  "A string of Unicode characters forming a valid URL having the http or https scheme."
  {:db/ident :ogc/url,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "A string of Unicode characters forming a valid URL having the http or https scheme.",
   :rdfs/isDefinedBy "http://ogp.me/ns/class#",
   :rdfs/label "URL",
   :rdfs/subClassOf [:ogc/string :ogc/url :xsd/string]})