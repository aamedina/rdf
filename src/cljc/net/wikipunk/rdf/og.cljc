(ns net.wikipunk.rdf.og
  ^{:base "http://ogp.me/ns#",
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
    :prefix "og",
    :source
    "https://raw.githubusercontent.com/facebookarchive/open-graph-protocol/master/ns/ogp.me.rdf"}
  {:rdf/type :owl/Ontology}
  (:refer-clojure :exclude [type]))

(def audio
  {:db/ident         :og/audio,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value    "A relevant audio URL for your object."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "audio"},
   :rdfs/range       :ogc/url})

(def audio:album
  {:db/ident         :og/audio:album,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value
                      "[DEPRECATED] An album to which some audio belongs."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "audio album"}})

(def audio:artist
  {:db/ident         :og/audio:artist,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value    "[DEPRECATED] An artist of some audio."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "audio artist"}})

(def audio:secure_url
  {:db/ident         :og/audio:secure_url,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value
                      "A relevant, secure audio URL for your object."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "audio secure URL"},
   :rdfs/range       :ogc/url})

(def audio:title
  {:db/ident         :og/audio:title,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value    "[DEPRECATED] A title for some audio."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "audio title"}})

(def audio:type
  {:db/ident :og/audio:type,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value
                  "The mime type of an audio file e.g., \"application/mp3\""},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "audio type"},
   :rdfs/range :ogc/mime_type_str})

(def country-name
  {:db/ident :og/country-name,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value "[DEPRECATED] The country name of the resource e.g., \"USA\""},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "country name"},
   :rdfs/seeAlso :vcard/country-name})

(def description
  {:db/ident           :og/description,
   :rdf/type           :rdf/Property,
   :rdfs/comment       {:rdf/language "en-US",
                        :rdf/value
                        "A one to two sentence description of your object."},
   :rdfs/isDefinedBy   {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label         {:rdf/language "en-US",
                        :rdf/value    "description"},
   :rdfs/range         :ogc/string,
   :rdfs/subPropertyOf :rdfs/comment})

(def determiner
  {:db/ident :og/determiner,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The word to precede the object's title in a sentence (e.g., \"the\" in \"the statue of liberty\").  Valid values are \"a\", \"an\", \"the\", \"\", and \"auto\"."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "determiner"},
   :rdfs/range :ogc/determiner_str})

(def email
  {:db/ident         :og/email,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value
                      "[DEPRECATED] Email of the contact for your object."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "email"},
   :rdfs/seeAlso     :foaf/mbox})

(def fax_number
  {:db/ident :og/fax_number,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value
                  "[DEPRECATED] Fax number of the contact for your object."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "fax number"},
   :rdfs/seeAlso :foaf/phone})

(def image
  {:db/ident :og/image,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "An image URL which should represent your object within the graph."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "image"},
   :rdfs/range :ogc/url,
   :rdfs/seeAlso :foaf/depiction})

(def image:height
  {:db/ident         :og/image:height,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value    "The height of an image."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "image height"},
   :rdfs/range       :ogc/integer_str})

(def image:secure_url
  {:db/ident :og/image:secure_url,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "A secure image URL which should represent your object within the graph."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "image secure url"},
   :rdfs/range :ogc/url,
   :rdfs/seeAlso :foaf/depiction})

(def image:type
  {:db/ident         :og/image:type,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value    "The mime type of an image."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "image type"},
   :rdfs/range       :ogc/mime_type_str})

(def image:width
  {:db/ident         :og/image:width,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value    "The width of an image."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "image width"},
   :rdfs/range       :ogc/integer_str})

(def isbn
  {:db/ident :og/isbn,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "[DEPRECATED] International Standard Book Number for you object."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label #{{:rdf/language "en-US",
                  :rdf/value    "International Standard Book Number"}
                 {:rdf/language "en-US",
                  :rdf/value    "isbn"}},
   :rdfs/seeAlso :bibo/isbn})

(def latitude
  {:db/ident :og/latitude,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "[DEPRECATED] The latitude of the resource e.g., the latitude of a company."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "latitude"},
   :rdfs/seeAlso :geo/lat})

(def locale
  {:db/ident         :og/locale,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value
                      "A Unix locale in which this markup is rendered."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "locale"},
   :rdfs/range       :ogc/string})

(def locality
  {:db/ident :og/locality,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value "[DEPRECATED] The locality of the resource e.g, \"Palo Alto\""},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "locality"},
   :rdfs/seeAlso :vcard/locality})

(def longitude
  {:db/ident :og/longitude,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "[DEPRECATED] The longitude of the resource e.g., the longitude of a company."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "longitude"},
   :rdfs/seeAlso :geo/long})

(def phone_number
  {:db/ident :og/phone_number,
   :rdf/type :rdf/Property,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value
                  "[DEPRECATED] Phone number of the contact for your object."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "phone number"},
   :rdfs/seeAlso :foaf/phone})

(def postal-code
  {:db/ident :og/postal-code,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value "[DEPRECATED] The postal code of the resource e.g., \"94304\""},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "postal code"},
   :rdfs/seeAlso :vcard/postal-code})

(def region
  {:db/ident         :og/region,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value
                      "[DEPRECATED] The region of the resource e.g., \"CA\""},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "region"},
   :rdfs/seeAlso     :vcard/region})

(def site_name
  {:db/ident :og/site_name,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "If your object is part of a larger web site, the name which should be displayed for the overall site. e.g., \"IMDb\"."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "site name"},
   :rdfs/range :ogc/string})

(def street-address
  {:db/ident :og/street-address,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "[DEPRECATED] The street address of the resource e.g., \"1601 S California Ave\"."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "street address"},
   :rdfs/seeAlso :vcard/street-address})

(def title
  {:db/ident :og/title,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The title of the object as it should appear within the graph, e.g.,  \"The Rock\"."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "title"},
   :rdfs/range :ogc/string,
   :rdfs/subPropertyOf :rdfs/label})

(def type
  {:db/ident :og/type,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The type of your object, e.g., \"movie\".  Depending on the type you specify, other properties may also be required."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "type"},
   :rdfs/range :ogc/string,
   :rdfs/seeAlso :rdf/type})

(def upc
  {:db/ident     :og/upc,
   :rdf/type     :rdf/Property,
   :rdfs/comment {:rdf/language "en-US",
                  :rdf/value
                  "[DEPRECATED] Universal Product Code for your object."},
   :rdfs/label   #{{:rdf/language "en-US",
                    :rdf/value    "upc"}
                   {:rdf/language "en-US",
                    :rdf/value    "universal product code"}},
   :rdfs/seeAlso :gr/hasEAN_UCC-13})

(def url
  {:db/ident :og/url,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The canonical URL of your object that will be used as its permanent ID in the graph, e.g., \"http://www.imdb.com/title/tt0117500/\"."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "url"},
   :rdfs/range :ogc/url,
   :rdfs/seeAlso #{:foaf/homepage :dc11/identifier}})

(def video
  {:db/ident         :og/video,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value    "A relevant video URL for your object."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "video"},
   :rdfs/range       :ogc/url})

(def video:height
  {:db/ident         :og/video:height,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value    "The height of a video."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "video height"},
   :rdfs/range       :ogc/integer_str})

(def video:secure_url
  {:db/ident         :og/video:secure_url,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value
                      "A relevant, secure video URL for your object."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "video secure URL"},
   :rdfs/range       :ogc/url})

(def video:type
  {:db/ident :og/video:type,
   :rdf/type :rdf/Property,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The mime type of a video e.g., \"application/x-shockwave-flash\""},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "video type"},
   :rdfs/range :ogc/mime_type_str})

(def video:width
  {:db/ident         :og/video:width,
   :rdf/type         :rdf/Property,
   :rdfs/comment     {:rdf/language "en-US",
                      :rdf/value    "The width of a video."},
   :rdfs/isDefinedBy {:xsd/anyURI "http://ogp.me/ns#"},
   :rdfs/label       {:rdf/language "en-US",
                      :rdf/value    "video width"},
   :rdfs/range       :ogc/integer_str})