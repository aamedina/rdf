(ns net.wikipunk.rdf.og
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
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/"}}
  (:refer-clojure :exclude [type]))

(def audio
  {:db/ident         :og/audio,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString
                      "A relevant audio URL for your object.@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label       #xsd/langString "audio@en-US",
   :rdfs/range       :ogc/url})

(def audio:album
  {:db/ident :og/audio:album,
   :rdf/type :rdf/Property,
   :rdfs/comment #xsd/langString
                  "[DEPRECATED] An album to which some audio belongs.@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label #xsd/langString "audio album@en-US"})

(def audio:artist
  {:db/ident         :og/audio:artist,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString
                      "[DEPRECATED] An artist of some audio.@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label       #xsd/langString "audio artist@en-US"})

(def audio:secure_url
  {:db/ident         :og/audio:secure_url,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString
                      "A relevant, secure audio URL for your object.@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label       #xsd/langString "audio secure URL@en-US",
   :rdfs/range       :ogc/url})

(def audio:title
  {:db/ident         :og/audio:title,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString
                      "[DEPRECATED] A title for some audio.@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label       #xsd/langString "audio title@en-US"})

(def audio:type
  {:db/ident :og/audio:type,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The mime type of an audio file e.g., \"application/mp3\"@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label #xsd/langString "audio type@en-US",
   :rdfs/range :ogc/mime_type_str})

(def country-name
  {:db/ident :og/country-name,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "[DEPRECATED] The country name of the resource e.g., \"USA\"@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label #xsd/langString "country name@en-US",
   :rdfs/seeAlso :vcard/country-name})

(def description
  {:db/ident :og/description,
   :rdf/type :rdf/Property,
   :rdfs/comment #xsd/langString
                  "A one to two sentence description of your object.@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label #xsd/langString "description@en-US",
   :rdfs/range :ogc/string,
   :rdfs/subPropertyOf :rdfs/comment})

(def determiner
  {:db/ident :og/determiner,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The word to precede the object's title in a sentence (e.g., \"the\" in \"the statue of liberty\").  Valid values are \"a\", \"an\", \"the\", \"\", and \"auto\".@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label #xsd/langString "determiner@en-US",
   :rdfs/range :ogc/determiner_str})

(def email
  {:db/ident :og/email,
   :rdf/type :rdf/Property,
   :rdfs/comment #xsd/langString
                  "[DEPRECATED] Email of the contact for your object.@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label #xsd/langString "email@en-US",
   :rdfs/seeAlso :foaf/mbox})

(def fax_number
  {:db/ident :og/fax_number,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "[DEPRECATED] Fax number of the contact for your object.@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label #xsd/langString "fax number@en-US",
   :rdfs/seeAlso :foaf/phone})

(def image
  {:db/ident :og/image,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "An image URL which should represent your object within the graph.@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label #xsd/langString "image@en-US",
   :rdfs/range :ogc/url,
   :rdfs/seeAlso :foaf/depiction})

(def image:height
  {:db/ident         :og/image:height,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString "The height of an image.@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label       #xsd/langString "image height@en-US",
   :rdfs/range       :ogc/integer_str})

(def image:secure_url
  {:db/ident :og/image:secure_url,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "A secure image URL which should represent your object within the graph.@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label #xsd/langString "image secure url@en-US",
   :rdfs/range :ogc/url,
   :rdfs/seeAlso :foaf/depiction})

(def image:type
  {:db/ident         :og/image:type,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString "The mime type of an image.@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label       #xsd/langString "image type@en-US",
   :rdfs/range       :ogc/mime_type_str})

(def image:width
  {:db/ident         :og/image:width,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString "The width of an image.@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label       #xsd/langString "image width@en-US",
   :rdfs/range       :ogc/integer_str})

(def isbn
  {:db/ident :og/isbn,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "[DEPRECATED] International Standard Book Number for you object.@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label [#xsd/langString "International Standard Book Number@en-US"
                #xsd/langString "isbn@en-US"],
   :rdfs/seeAlso :bibo/isbn})

(def latitude
  {:db/ident :og/latitude,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "[DEPRECATED] The latitude of the resource e.g., the latitude of a company.@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label #xsd/langString "latitude@en-US",
   :rdfs/seeAlso :geo/lat})

(def locale
  {:db/ident         :og/locale,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString
                      "A Unix locale in which this markup is rendered.@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label       #xsd/langString "locale@en-US",
   :rdfs/range       :ogc/string})

(def locality
  {:db/ident :og/locality,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "[DEPRECATED] The locality of the resource e.g, \"Palo Alto\"@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label #xsd/langString "locality@en-US",
   :rdfs/seeAlso :vcard/locality})

(def longitude
  {:db/ident :og/longitude,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "[DEPRECATED] The longitude of the resource e.g., the longitude of a company.@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label #xsd/langString "longitude@en-US",
   :rdfs/seeAlso :geo/long})

(def phone_number
  {:db/ident :og/phone_number,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "[DEPRECATED] Phone number of the contact for your object.@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label #xsd/langString "phone number@en-US",
   :rdfs/seeAlso :foaf/phone})

(def postal-code
  {:db/ident :og/postal-code,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "[DEPRECATED] The postal code of the resource e.g., \"94304\"@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label #xsd/langString "postal code@en-US",
   :rdfs/seeAlso :vcard/postal-code})

(def region
  {:db/ident :og/region,
   :rdf/type :rdf/Property,
   :rdfs/comment #xsd/langString
                  "[DEPRECATED] The region of the resource e.g., \"CA\"@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label #xsd/langString "region@en-US",
   :rdfs/seeAlso :vcard/region})

(def site_name
  {:db/ident :og/site_name,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "If your object is part of a larger web site, the name which should be displayed for the overall site. e.g., \"IMDb\".@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label #xsd/langString "site name@en-US",
   :rdfs/range :ogc/string})

(def street-address
  {:db/ident :og/street-address,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "[DEPRECATED] The street address of the resource e.g., \"1601 S California Ave\".@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label #xsd/langString "street address@en-US",
   :rdfs/seeAlso :vcard/street-address})

(def title
  {:db/ident :og/title,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The title of the object as it should appear within the graph, e.g.,  \"The Rock\".@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label #xsd/langString "title@en-US",
   :rdfs/range :ogc/string,
   :rdfs/subPropertyOf :rdfs/label})

(def type
  {:db/ident :og/type,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The type of your object, e.g., \"movie\".  Depending on the type you specify, other properties may also be required.@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label #xsd/langString "type@en-US",
   :rdfs/range :ogc/string,
   :rdfs/seeAlso :rdf/type})

(def upc
  {:db/ident     :og/upc,
   :rdf/type     :rdf/Property,
   :rdfs/comment #xsd/langString
                  "[DEPRECATED] Universal Product Code for your object.@en-US",
   :rdfs/label   [#xsd/langString "universal product code@en-US"
                  #xsd/langString "upc@en-US"],
   :rdfs/seeAlso :gr/hasEAN_UCC-13})

(def url
  {:db/ident :og/url,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The canonical URL of your object that will be used as its permanent ID in the graph, e.g., \"http://www.imdb.com/title/tt0117500/\".@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label #xsd/langString "url@en-US",
   :rdfs/range :ogc/url,
   :rdfs/seeAlso [:foaf/homepage :dc11/identifier]})

(def video
  {:db/ident         :og/video,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString
                      "A relevant video URL for your object.@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label       #xsd/langString "video@en-US",
   :rdfs/range       :ogc/url})

(def video:height
  {:db/ident         :og/video:height,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString "The height of a video.@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label       #xsd/langString "video height@en-US",
   :rdfs/range       :ogc/integer_str})

(def video:secure_url
  {:db/ident         :og/video:secure_url,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString
                      "A relevant, secure video URL for your object.@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label       #xsd/langString "video secure URL@en-US",
   :rdfs/range       :ogc/url})

(def video:type
  {:db/ident :og/video:type,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #xsd/langString
    "The mime type of a video e.g., \"application/x-shockwave-flash\"@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label #xsd/langString "video type@en-US",
   :rdfs/range :ogc/mime_type_str})

(def video:width
  {:db/ident         :og/video:width,
   :rdf/type         :rdf/Property,
   :rdfs/comment     #xsd/langString "The width of a video.@en-US",
   :rdfs/isDefinedBy {:rdfa/uri "http://ogp.me/ns#"},
   :rdfs/label       #xsd/langString "video width@en-US",
   :rdfs/range       :ogc/integer_str})