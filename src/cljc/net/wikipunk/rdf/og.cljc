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
  {:db/ident         :og/audio,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value    "A relevant audio URL for your object."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "audio"},
   :rdfs/range       :ogc/url})

(def audio:album
  "[DEPRECATED] An album to which some audio belongs."
  {:db/ident         :og/audio:album,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value
                      "[DEPRECATED] An album to which some audio belongs."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "audio album"}})

(def audio:artist
  "[DEPRECATED] An artist of some audio."
  {:db/ident         :og/audio:artist,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value    "[DEPRECATED] An artist of some audio."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "audio artist"}})

(def audio:secure_url
  "A relevant, secure audio URL for your object."
  {:db/ident         :og/audio:secure_url,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value
                      "A relevant, secure audio URL for your object."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "audio secure URL"},
   :rdfs/range       :ogc/url})

(def audio:title
  "[DEPRECATED] A title for some audio."
  {:db/ident         :og/audio:title,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value    "[DEPRECATED] A title for some audio."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "audio title"}})

(def audio:type
  "The mime type of an audio file e.g., \"application/mp3\""
  {:db/ident :og/audio:type,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value
                  "The mime type of an audio file e.g., \"application/mp3\""},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "audio type"},
   :rdfs/range :ogc/mime_type_str})

(def country-name
  "[DEPRECATED] The country name of the resource e.g., \"USA\""
  {:db/ident :og/country-name,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value "[DEPRECATED] The country name of the resource e.g., \"USA\""},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "country name"},
   :rdfs/seeAlso ["http://www.w3.org/2006/vcard/ns#country-name"]})

(def description
  "A one to two sentence description of your object."
  {:db/ident           :og/description,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en-US",
                        :rdf/value
                        "A one to two sentence description of your object."},
   :rdfs/isDefinedBy   "http://ogp.me/ns#",
   :rdfs/label         {:rdf/language "en-US",
                        :rdf/value    "description"},
   :rdfs/range         :ogc/string,
   :rdfs/subPropertyOf :rdfs/comment})

(def determiner
  "The word to precede the object's title in a sentence (e.g., \"the\" in \"the statue of liberty\"). Valid values are \"a\", \"an\", \"the\", \"\", and \"auto\"."
  {:db/ident :og/determiner,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The word to precede the object's title in a sentence (e.g., \"the\" in \"the statue of liberty\").  Valid values are \"a\", \"an\", \"the\", \"\", and \"auto\"."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "determiner"},
   :rdfs/range :ogc/determiner_str})

(def email
  "[DEPRECATED] Email of the contact for your object."
  {:db/ident         :og/email,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value
                      "[DEPRECATED] Email of the contact for your object."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "email"},
   :rdfs/seeAlso     ["http://xmlns.com/foaf/0.1/mbox"]})

(def fax_number
  "[DEPRECATED] Fax number of the contact for your object."
  {:db/ident :og/fax_number,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value
                  "[DEPRECATED] Fax number of the contact for your object."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "fax number"},
   :rdfs/seeAlso ["http://xmlns.com/foaf/0.1/phone"]})

(def image
  "An image URL which should represent your object within the graph."
  {:db/ident :og/image,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "An image URL which should represent your object within the graph."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "image"},
   :rdfs/range :ogc/url,
   :rdfs/seeAlso ["http://xmlns.com/foaf/0.1/depiction"]})

(def image:height
  "The height of an image."
  {:db/ident         :og/image:height,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value    "The height of an image."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "image height"},
   :rdfs/range       :ogc/integer_str})

(def image:secure_url
  "A secure image URL which should represent your object within the graph."
  {:db/ident :og/image:secure_url,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "A secure image URL which should represent your object within the graph."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "image secure url"},
   :rdfs/range :ogc/url,
   :rdfs/seeAlso ["http://xmlns.com/foaf/0.1/depiction"]})

(def image:type
  "The mime type of an image."
  {:db/ident         :og/image:type,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value    "The mime type of an image."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "image type"},
   :rdfs/range       :ogc/mime_type_str})

(def image:width
  "The width of an image."
  {:db/ident         :og/image:width,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value    "The width of an image."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "image width"},
   :rdfs/range       :ogc/integer_str})

(def isbn
  "[DEPRECATED] International Standard Book Number for you object."
  {:db/ident :og/isbn,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "[DEPRECATED] International Standard Book Number for you object."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label [{:rdf/language "en-US",
                 :rdf/value    "International Standard Book Number"}
                {:rdf/language "en-US",
                 :rdf/value    "isbn"}],
   :rdfs/seeAlso ["http://purl.org/ontology/bibo/isbn"]})

(def latitude
  "[DEPRECATED] The latitude of the resource e.g., the latitude of a company."
  {:db/ident :og/latitude,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "[DEPRECATED] The latitude of the resource e.g., the latitude of a company."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "latitude"},
   :rdfs/seeAlso ["http://www.w3.org/2003/01/geo/wgs84_pos#lat"]})

(def locale
  "A Unix locale in which this markup is rendered."
  {:db/ident         :og/locale,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value
                      "A Unix locale in which this markup is rendered."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "locale"},
   :rdfs/range       :ogc/string})

(def locality
  "[DEPRECATED] The locality of the resource e.g, \"Palo Alto\""
  {:db/ident :og/locality,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value "[DEPRECATED] The locality of the resource e.g, \"Palo Alto\""},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "locality"},
   :rdfs/seeAlso ["http://www.w3.org/2006/vcard/ns#locality"]})

(def longitude
  "[DEPRECATED] The longitude of the resource e.g., the longitude of a company."
  {:db/ident :og/longitude,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "[DEPRECATED] The longitude of the resource e.g., the longitude of a company."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "longitude"},
   :rdfs/seeAlso ["http://www.w3.org/2003/01/geo/wgs84_pos#long"]})

(def phone_number
  "[DEPRECATED] Phone number of the contact for your object."
  {:db/ident :og/phone_number,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value
                  "[DEPRECATED] Phone number of the contact for your object."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "phone number"},
   :rdfs/seeAlso ["http://xmlns.com/foaf/0.1/phone"]})

(def postal-code
  "[DEPRECATED] The postal code of the resource e.g., \"94304\""
  {:db/ident :og/postal-code,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value "[DEPRECATED] The postal code of the resource e.g., \"94304\""},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "postal code"},
   :rdfs/seeAlso ["http://www.w3.org/2006/vcard/ns#postal-code"]})

(def region
  "[DEPRECATED] The region of the resource e.g., \"CA\""
  {:db/ident         :og/region,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value
                      "[DEPRECATED] The region of the resource e.g., \"CA\""},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "region"},
   :rdfs/seeAlso     ["http://www.w3.org/2006/vcard/ns#region"]})

(def site_name
  "If your object is part of a larger web site, the name which should be displayed for the overall site. e.g., \"IMDb\"."
  {:db/ident :og/site_name,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "If your object is part of a larger web site, the name which should be displayed for the overall site. e.g., \"IMDb\"."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "site name"},
   :rdfs/range :ogc/string})

(def street-address
  "[DEPRECATED] The street address of the resource e.g., \"1601 S California Ave\"."
  {:db/ident :og/street-address,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "[DEPRECATED] The street address of the resource e.g., \"1601 S California Ave\"."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "street address"},
   :rdfs/seeAlso ["http://www.w3.org/2006/vcard/ns#street-address"]})

(def title
  "The title of the object as it should appear within the graph, e.g., \"The Rock\"."
  {:db/ident :og/title,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The title of the object as it should appear within the graph, e.g.,  \"The Rock\"."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "title"},
   :rdfs/range :ogc/string,
   :rdfs/subPropertyOf :rdfs/label})

(def type
  "The type of your object, e.g., \"movie\". Depending on the type you specify, other properties may also be required."
  {:db/ident :og/type,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The type of your object, e.g., \"movie\".  Depending on the type you specify, other properties may also be required."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "type"},
   :rdfs/range :ogc/string,
   :rdfs/seeAlso ["http://www.w3.org/1999/02/22-rdf-syntax-ns#type"]})

(def upc
  "[DEPRECATED] Universal Product Code for your object."
  {:db/ident     :og/upc,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value
                  "[DEPRECATED] Universal Product Code for your object."},
   :rdfs/label   [{:rdf/language "en-US",
                   :rdf/value    "universal product code"}
                  {:rdf/language "en-US",
                   :rdf/value    "upc"}],
   :rdfs/seeAlso ["http://purl.org/goodrelations/v1#hasEAN_UCC-13"]})

(def url
  "The canonical URL of your object that will be used as its permanent ID in the graph, e.g., \"http://www.imdb.com/title/tt0117500/\"."
  {:db/ident :og/url,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The canonical URL of your object that will be used as its permanent ID in the graph, e.g., \"http://www.imdb.com/title/tt0117500/\"."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "url"},
   :rdfs/range :ogc/url,
   :rdfs/seeAlso ["http://xmlns.com/foaf/0.1/homepage"
                  "http://purl.org/dc/elements/1.1/identifier"]})

(def video
  "A relevant video URL for your object."
  {:db/ident         :og/video,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value    "A relevant video URL for your object."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "video"},
   :rdfs/range       :ogc/url})

(def video:height
  "The height of a video."
  {:db/ident         :og/video:height,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value    "The height of a video."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "video height"},
   :rdfs/range       :ogc/integer_str})

(def video:secure_url
  "A relevant, secure video URL for your object."
  {:db/ident         :og/video:secure_url,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value
                      "A relevant, secure video URL for your object."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "video secure URL"},
   :rdfs/range       :ogc/url})

(def video:type
  "The mime type of a video e.g., \"application/x-shockwave-flash\""
  {:db/ident :og/video:type,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The mime type of a video e.g., \"application/x-shockwave-flash\""},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "video type"},
   :rdfs/range :ogc/mime_type_str})

(def video:width
  "The width of a video."
  {:db/ident         :og/video:width,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value    "The width of a video."},
   :rdfs/isDefinedBy "http://ogp.me/ns#",
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "video width"},
   :rdfs/range       :ogc/integer_str})

(def ^{:private true} boolean_str
  "A string representation of a true or false value. The lexical space contains: \"true\", \"false\", \"1\", and \"0\"."
  {:db/ident :ogc/boolean_str,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "A string representation of a true or false value.  The lexical space contains: \"true\", \"false\", \"1\", and \"0\"."},
   :rdfs/isDefinedBy "http://ogp.me/ns/class#",
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "boolean string"},
   :rdfs/subClassOf :xsd/string})

(def ^{:private true} date_time_str
  "A string representation of a temporal value composed of a date (year, month, day) and an optional time component (hours, minutes). The lexical space is defined by ISO 8601."
  {:db/ident :ogc/date_time_str,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "A string representation of a temporal value composed of a date (year, month, day) and an optional time component (hours, minutes).  The lexical space is defined by ISO 8601."},
   :rdfs/isDefinedBy "http://ogp.me/ns/class#",
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "date/time string"},
   :rdfs/subClassOf :xsd/string})

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
   {:rdf/language "en-US",
    :rdf/value
    "The lexical space: \"\", \"the\", \"a\", \"an\", and \"auto\"."},
   :rdfs/isDefinedBy "http://ogp.me/ns/class#",
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "determiner"},
   :rdfs/subClassOf :xsd/string})

(def ^{:private true} float_str
  "A string representation of a 64-bit signed floating point number. Example lexical values include \"1.234\", \"-1.234\", \"1.2e3\", \"-1.2e3\", and \"7E-10\"."
  {:db/ident :ogc/float_str,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "A string representation of a 64-bit signed floating point number.  Example lexical values include \"1.234\", \"-1.234\", \"1.2e3\", \"-1.2e3\", and \"7E-10\"."},
   :rdfs/isDefinedBy "http://ogp.me/ns/class#",
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "float string"},
   :rdfs/subClassOf :xsd/string})

(def ^{:private true} integer_str
  "A string representation of a 32-bit signed integer. Example lexical values include \"1234\" and \"-123\"."
  {:db/ident :ogc/integer_str,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "A string representation of a 32-bit signed integer.  Example lexical values include \"1234\" and \"-123\"."},
   :rdfs/isDefinedBy "http://ogp.me/ns/class#",
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "integer string"},
   :rdfs/subClassOf :xsd/string})

(def ^{:private true} mime_type_str
  "Valid mime type strings (e.g., \"application/mp3\")."
  {:db/ident         :ogc/mime_type_str,
   :rdf/type         :rdfs/Datatype,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value
                      "Valid mime type strings (e.g., \"application/mp3\")."},
   :rdfs/isDefinedBy "http://ogp.me/ns/class#",
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "mime type string"},
   :rdfs/subClassOf  :xsd/string})

(def ^{:private true} string
  "A string of Unicode characters."
  {:db/ident         :ogc/string,
   :rdf/type         :rdfs/Datatype,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value    "A string of Unicode characters."},
   :rdfs/isDefinedBy "http://ogp.me/ns/class#",
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "Unicode string"},
   :rdfs/subClassOf  :xsd/string})

(def ^{:private true} url
  "A string of Unicode characters forming a valid URL having the http or https scheme."
  {:db/ident :ogc/url,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "A string of Unicode characters forming a valid URL having the http or https scheme."},
   :rdfs/isDefinedBy "http://ogp.me/ns/class#",
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "URL"},
   :rdfs/subClassOf :ogc/string})